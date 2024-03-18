package org.lafabrique_epita.exposition.api.authentication;

import org.lafabrique_epita.application.service.AuthenticationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    private AuthenticationService authenticationService;
}
