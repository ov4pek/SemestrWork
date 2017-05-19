package ru.kpfu.itis.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.entities.UserJPA;
import ru.kpfu.itis.repositories.UserJPARepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthProviderImpl implements AuthenticationProvider {

    private static final PasswordEncoder encoder = new BCryptPasswordEncoder();

    private final UserJPARepository userRepository;

    public AuthProviderImpl(UserJPARepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        UserJPA user = userRepository.findOneByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        String password = authentication.getCredentials().toString();
        if (!encoder.matches(password, user.getPassword())) {
            throw new BadCredentialsException("Invalid password");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();

        if (user.getEmail().equals("admin@admin.com")) {
            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new UsernamePasswordAuthenticationToken(user, null, authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
