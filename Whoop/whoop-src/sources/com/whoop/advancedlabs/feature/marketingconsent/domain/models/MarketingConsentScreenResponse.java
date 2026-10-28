package com.whoop.advancedlabs.feature.marketingconsent.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;", "", "", "headerImageUrl", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;", "consentStep", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;", "optedInConfirmation", "skippedConfirmation", "<init>", "(Ljava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;", "component3", "()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeaderImageUrl", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;", "getConsentStep", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;", "getOptedInConfirmation", "getSkippedConfirmation", "Companion", "$serializer", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MarketingConsentScreenResponse {
    private final ConsentStep consentStep;
    private final String headerImageUrl;
    private final ConfirmationStep optedInConfirmation;
    private final ConfirmationStep skippedConfirmation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.feature.marketingconsent.domain.models.MarketingConsentScreenResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MarketingConsentScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MarketingConsentScreenResponse(int i13, String str, ConsentStep consentStep, ConfirmationStep confirmationStep, ConfirmationStep confirmationStep2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, MarketingConsentScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.headerImageUrl = str;
        this.consentStep = consentStep;
        this.optedInConfirmation = confirmationStep;
        this.skippedConfirmation = confirmationStep2;
    }

    public static /* synthetic */ MarketingConsentScreenResponse copy$default(MarketingConsentScreenResponse marketingConsentScreenResponse, String str, ConsentStep consentStep, ConfirmationStep confirmationStep, ConfirmationStep confirmationStep2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = marketingConsentScreenResponse.headerImageUrl;
        }
        if ((i13 & 2) != 0) {
            consentStep = marketingConsentScreenResponse.consentStep;
        }
        if ((i13 & 4) != 0) {
            confirmationStep = marketingConsentScreenResponse.optedInConfirmation;
        }
        if ((i13 & 8) != 0) {
            confirmationStep2 = marketingConsentScreenResponse.skippedConfirmation;
        }
        return marketingConsentScreenResponse.copy(str, consentStep, confirmationStep, confirmationStep2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(MarketingConsentScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.headerImageUrl);
        output.encodeSerializableElement(serialDesc, 1, ConsentStep$$serializer.INSTANCE, self.consentStep);
        ConfirmationStep$$serializer confirmationStep$$serializer = ConfirmationStep$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, confirmationStep$$serializer, self.optedInConfirmation);
        output.encodeSerializableElement(serialDesc, 3, confirmationStep$$serializer, self.skippedConfirmation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConsentStep getConsentStep() {
        return this.consentStep;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ConfirmationStep getOptedInConfirmation() {
        return this.optedInConfirmation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ConfirmationStep getSkippedConfirmation() {
        return this.skippedConfirmation;
    }

    public final MarketingConsentScreenResponse copy(String headerImageUrl, ConsentStep consentStep, ConfirmationStep optedInConfirmation, ConfirmationStep skippedConfirmation) {
        AbstractC22676k.m65750j(headerImageUrl, "headerImageUrl");
        AbstractC22676k.m65750j(consentStep, "consentStep");
        AbstractC22676k.m65750j(optedInConfirmation, "optedInConfirmation");
        AbstractC22676k.m65750j(skippedConfirmation, "skippedConfirmation");
        return new MarketingConsentScreenResponse(headerImageUrl, consentStep, optedInConfirmation, skippedConfirmation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketingConsentScreenResponse)) {
            return false;
        }
        MarketingConsentScreenResponse marketingConsentScreenResponse = (MarketingConsentScreenResponse) other;
        return AbstractC22676k.m65745e(this.headerImageUrl, marketingConsentScreenResponse.headerImageUrl) && AbstractC22676k.m65745e(this.consentStep, marketingConsentScreenResponse.consentStep) && AbstractC22676k.m65745e(this.optedInConfirmation, marketingConsentScreenResponse.optedInConfirmation) && AbstractC22676k.m65745e(this.skippedConfirmation, marketingConsentScreenResponse.skippedConfirmation);
    }

    public final ConsentStep getConsentStep() {
        return this.consentStep;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final ConfirmationStep getOptedInConfirmation() {
        return this.optedInConfirmation;
    }

    public final ConfirmationStep getSkippedConfirmation() {
        return this.skippedConfirmation;
    }

    public int hashCode() {
        return this.skippedConfirmation.hashCode() + ((this.optedInConfirmation.hashCode() + ((this.consentStep.hashCode() + (this.headerImageUrl.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MarketingConsentScreenResponse(headerImageUrl=" + this.headerImageUrl + ", consentStep=" + this.consentStep + ", optedInConfirmation=" + this.optedInConfirmation + ", skippedConfirmation=" + this.skippedConfirmation + ")";
    }

    public MarketingConsentScreenResponse(String headerImageUrl, ConsentStep consentStep, ConfirmationStep optedInConfirmation, ConfirmationStep skippedConfirmation) {
        AbstractC22676k.m65750j(headerImageUrl, "headerImageUrl");
        AbstractC22676k.m65750j(consentStep, "consentStep");
        AbstractC22676k.m65750j(optedInConfirmation, "optedInConfirmation");
        AbstractC22676k.m65750j(skippedConfirmation, "skippedConfirmation");
        this.headerImageUrl = headerImageUrl;
        this.consentStep = consentStep;
        this.optedInConfirmation = optedInConfirmation;
        this.skippedConfirmation = skippedConfirmation;
    }
}
