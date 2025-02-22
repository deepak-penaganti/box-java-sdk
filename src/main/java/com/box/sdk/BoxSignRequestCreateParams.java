package com.box.sdk;

import com.box.sdk.internal.utils.JsonUtils;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import java.util.List;

/**
 * Optional parameters for creating a Sign Request.
 *
 * @see BoxSignRequest
 */
public class BoxSignRequestCreateParams {

    private Boolean isDocumentPreparationNeeded;
    private Boolean areTextSignaturesEnabled;
    private Boolean areDatesEnabled;
    private BoxSignRequestSignatureColor signatureColor;
    private String emailSubject;
    private String emailMessage;
    private Boolean areRemindersEnabled;
    private String name;
    private List<BoxSignRequestPrefillTag> prefillTags;
    private Integer daysValid;
    private String externalId;
    private String redirectUrl;
    private String declinedRedirectUrl;

    /**
     * Gets the flag indicating if the sender should be taken into the builder flow to prepare the document.
     *
     * @return true if document preparation is needed, otherwise false.
     */
    public boolean getIsDocumentPreparationNeeded() {
        return this.isDocumentPreparationNeeded;
    }

    /**
     * Sets the flag indicating if the sender should be taken into the builder flow to prepare the document.
     *
     * @param isDocumentPreparationNeeded whether or not sender should be taken
     *                                    into the builder flow to prepare the document.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setIsDocumentPreparationNeeded(boolean isDocumentPreparationNeeded) {
        this.isDocumentPreparationNeeded = isDocumentPreparationNeeded;
        return this;
    }

    /**
     * Gets the flag indicating if usage of signatures generated by typing (text) is enabled. Default is true.
     *
     * @return true if text signatures are enabled, otherwise false.
     */
    public boolean getAreTextSignaturesEnabled() {
        return this.areTextSignaturesEnabled;
    }

    /**
     * Sets the flag indicating if usage of signatures generated by typing (text) is enabled. Default is true.
     *
     * @param areTextSignaturesEnabled indicating if text signatures are enabled for signers.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setAreTextSignaturesEnabled(boolean areTextSignaturesEnabled) {
        this.areTextSignaturesEnabled = areTextSignaturesEnabled;
        return this;
    }

    /**
     * Gets the flag indicating if ability for signer to add dates is enabled. Default is true.
     *
     * @return true if ability for signer to add dates is enabled, otherwise false.
     */
    public boolean getAreDatesEnabled() {
        return this.areDatesEnabled;
    }

    /**
     * Sets the flag indicating if ability for signer to add dates is enabled. Default is true.
     *
     * @param areDatesEnabled indicating if ability for signer to add dates is enabled.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setAreDatesEnabled(boolean areDatesEnabled) {
        this.areDatesEnabled = areDatesEnabled;
        return this;
    }

    /**
     * Gets the forced, specific color for the signature.
     *
     * @return signature color (blue, black, red).
     */
    public BoxSignRequestSignatureColor getSignatureColor() {
        return this.signatureColor;
    }

    /**
     * Sets the forced, specific color for the signature.
     *
     * @param signatureColor blue, black or red.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setSignatureColor(BoxSignRequestSignatureColor signatureColor) {
        this.signatureColor = signatureColor;
        return this;
    }

    /**
     * Gets the subject of sign request email.
     *
     * @return subject of sign request email.
     */
    public String getEmailSubject() {
        return this.emailSubject;
    }

    /**
     * Sets the subject of sign request email. This is cleaned by sign request.
     *
     * @param emailSubject included in sign request email.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    /**
     * Gets the message to include in sign request email.
     *
     * @return message of sign request email.
     */
    public String getEmailMessage() {
        return this.emailMessage;
    }

    /**
     * Sets the message to include in sign request email. This is cleaned,but some html tags are allowed.
     * Links included in the message are also converted to actual links in the email.
     * The message may contain the following html tags:
     * a, abbr, acronym, b, blockquote, code, em, i, ul, li, ol, and strong.
     * Be aware that when the text to html ratio is too high, the email may end up in spam filters.
     * Custom styles on these tags are not allowed.
     *
     * @param emailMessage included in sign request email.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }

    /**
     * Gets the flag indicating if remind for signers to sign a document on day 3, 8, 13 and 18
     * (or less if the document has been digitally signed already) is enabled.
     *
     * @return true if reminders are enabled, otherwise false.
     */
    public boolean getAreRemindersEnabled() {
        return this.areRemindersEnabled;
    }

    /**
     * Sets the flag indicating if remind for signers to sign a document on day 3, 8, 13 and 18
     * (or less if the document has been digitally signed already) is enabled.
     *
     * @param areRemindersEnabled indicating if reminders are enabled.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setAreRemindersEnabled(boolean areRemindersEnabled) {
        this.areRemindersEnabled = areRemindersEnabled;
        return this;
    }

    /**
     * Gets the name of this sign request.
     *
     * @return name of this sign request.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of this sign request.
     *
     * @param name of this sign request.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Gets the number of days after which this request will automatically expire if not completed.
     *
     * @return number of days after which this request will automatically expire if not completed.
     */
    public int getDaysValid() {
        return this.daysValid;
    }

    /**
     * Sets the number of days after which this request will automatically expire if not completed.
     *
     * @param daysValid of this sign request.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setDaysValid(int daysValid) {
        this.daysValid = daysValid;
        return this;
    }

    /**
     * Gets an ID that serve as reference in an external system that the sign request is related to.
     *
     * @return external id.
     */
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * Sets the reference id in an external system that this sign request is related to.
     *
     * @param externalId of this sign request.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Gets the list of prefill tags.
     *
     * @return list of prefill tags.
     */
    public List<BoxSignRequestPrefillTag> getPrefillTags() {
        return this.prefillTags;
    }

    /**
     * Sets the list of prefill tags. When a document contains sign related tags in the content,
     * you can prefill them using this prefillTags by referencing
     * the 'id' of the tag as the externalId field of the prefill tag.
     *
     * @param prefillTags list for this sign request.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setPrefillTags(List<BoxSignRequestPrefillTag> prefillTags) {
        this.prefillTags = prefillTags;
        return this;
    }

    /**
     * Gets the redirect URL that a signer will be redirected to after signing a document.
     *
     * @return redirect url.
     */
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    /**
     * Sets the redirect URL that a signer will be redirected to after signing a document.
     *
     * @param redirectUrl of this sign request.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * Gets the URL that a signer will be redirected to after declining to sign a document.
     *
     * @return decline redirect url.
     */
    public String getDeclinedRedirectUrl() {
        return this.declinedRedirectUrl;
    }

    /**
     * Sets the URL that a signer will be redirected to after declining to sign a document.
     *
     * @param declinedRedirectUrl of this sign request.
     * @return this BoxSignRequestCreateParams object for chaining.
     */
    public BoxSignRequestCreateParams setDeclinedRedirectUrl(String declinedRedirectUrl) {
        this.declinedRedirectUrl = declinedRedirectUrl;
        return this;
    }

    /**
     * Used to append BoxSignRequestCreateParams to request.
     *
     * @param requestJSON request in json to append data to.
     */
    public void appendParamsAsJson(JsonObject requestJSON) {
        JsonUtils.addIfNotNull(requestJSON, "is_document_preparation_needed",
            this.isDocumentPreparationNeeded);
        JsonUtils.addIfNotNull(requestJSON, "are_text_signatures_enabled", this.areTextSignaturesEnabled);
        JsonUtils.addIfNotNull(requestJSON, "are_dates_enabled", this.areDatesEnabled);
        JsonUtils.addIfNotNull(requestJSON, "signature_color", this.signatureColor);
        JsonUtils.addIfNotNull(requestJSON, "email_subject", this.emailSubject);
        JsonUtils.addIfNotNull(requestJSON, "email_message", this.emailMessage);
        JsonUtils.addIfNotNull(requestJSON, "are_reminders_enabled", this.areRemindersEnabled);
        JsonUtils.addIfNotNull(requestJSON, "name", this.name);
        JsonUtils.addIfNotNull(requestJSON, "days_valid", this.daysValid);
        JsonUtils.addIfNotNull(requestJSON, "external_id", this.externalId);
        JsonUtils.addIfNotNull(requestJSON, "redirect_url", this.redirectUrl);
        JsonUtils.addIfNotNull(requestJSON, "declined_redirect_url", this.declinedRedirectUrl);

        if (this.prefillTags != null) {
            JsonArray prefillTagsJSON = new JsonArray();
            for (BoxSignRequestPrefillTag prefillTag : this.prefillTags) {
                prefillTagsJSON.add(prefillTag.getJSONObject());
            }
            requestJSON.add("prefill_tags", prefillTagsJSON);
        }

        return;
    }
}
