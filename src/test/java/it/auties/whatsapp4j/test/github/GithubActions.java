package it.auties.whatsapp4j.test.github;

import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;

@UtilityClass
@Log
public class GithubActions {
    public final String CONTACT_NAME = "WHATSAPP_CONTACT";
    public final String CREDENTIALS_NAME = "WHATSAPP_KEYS";
    private final String GITHUB_ACTIONS = "GITHUB_ACTIONS";

    public boolean isActionsEnvironment(){
        log.info("Env: " + System.getProperty(GITHUB_ACTIONS) + " " + Boolean.parseBoolean(System.getProperty(GITHUB_ACTIONS)));
        return Boolean.parseBoolean(System.getProperty(GITHUB_ACTIONS));
    }
}
