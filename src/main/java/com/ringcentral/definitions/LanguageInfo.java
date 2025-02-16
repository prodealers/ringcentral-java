package com.ringcentral.definitions;


/**
 * User interface language data
 */
public class LanguageInfo {
    /**
     * Internal identifier of a language
     */
    public String id;
    /**
     * Canonical URI of a language
     */
    public String uri;
    /**
     * Indicates whether a language is available as greeting language
     */
    public Boolean greeting;
    /**
     * Indicates whether a language is available as formatting locale
     */
    public Boolean formattingLocale;
    /**
     * Localization code of a language
     */
    public String localeCode;
    /**
     * Country code according to the ISO standard, see [ISO 3166](https://www.iso.org/iso-3166-country-codes.html)
     */
    public String isoCode;
    /**
     * Official name of a language
     */
    public String name;
    /**
     * Indicates whether a language is available as UI language
     */
    public Boolean ui;

    public LanguageInfo id(String id) {
        this.id = id;
        return this;
    }

    public LanguageInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public LanguageInfo greeting(Boolean greeting) {
        this.greeting = greeting;
        return this;
    }

    public LanguageInfo formattingLocale(Boolean formattingLocale) {
        this.formattingLocale = formattingLocale;
        return this;
    }

    public LanguageInfo localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    public LanguageInfo isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public LanguageInfo name(String name) {
        this.name = name;
        return this;
    }

    public LanguageInfo ui(Boolean ui) {
        this.ui = ui;
        return this;
    }
}
