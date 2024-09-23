package net.devex.one.facinginterface.web;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor( access = AccessLevel.PRIVATE)
public class ApiMapping {

    public static final String API_VERSION = "/api";

    public static final String V1_EMPLOYEES = API_VERSION + "/employees";
}
