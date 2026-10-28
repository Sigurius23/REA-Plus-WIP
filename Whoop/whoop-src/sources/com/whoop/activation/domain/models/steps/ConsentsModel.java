package com.whoop.activation.domain.models.steps;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qv1.C30654e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b)\u0010%Jj\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010'R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b<\u0010%R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b=\u0010%¨\u0006@"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/ConsentsModel;", "", "", "id", "region", "consent", "consentText", "fullTermsUrl", "", "consentRequired", "Lcom/whoop/activation/domain/models/steps/TermExpansion;", "expansionType", "expansionRequired", "bottomScrollAllowed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/ConsentsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "()Lcom/whoop/activation/domain/models/steps/TermExpansion;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZ)Lcom/whoop/activation/domain/models/steps/ConsentsModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getRegion", "getConsent", "getConsentText", "getFullTermsUrl", "Z", "getConsentRequired", "Lcom/whoop/activation/domain/models/steps/TermExpansion;", "getExpansionType", "getExpansionRequired", "getBottomScrollAllowed", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConsentsModel {
    public static final int $stable = 0;
    private final boolean bottomScrollAllowed;
    private final String consent;
    private final boolean consentRequired;
    private final String consentText;
    private final boolean expansionRequired;
    private final TermExpansion expansionType;
    private final String fullTermsUrl;
    private final String id;
    private final String region;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30654e(24)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/ConsentsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/ConsentsModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ConsentsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConsentsModel(int i13, String str, String str2, String str3, String str4, String str5, boolean z4, TermExpansion termExpansion, boolean z13, boolean z14, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, ConsentsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.region = str2;
        this.consent = str3;
        this.consentText = str4;
        this.fullTermsUrl = str5;
        this.consentRequired = z4;
        this.expansionType = termExpansion;
        this.expansionRequired = z13;
        this.bottomScrollAllowed = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.activation.domain.models.steps.TermExpansion", TermExpansion.values());
    }

    public static /* synthetic */ ConsentsModel copy$default(ConsentsModel consentsModel, String str, String str2, String str3, String str4, String str5, boolean z4, TermExpansion termExpansion, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = consentsModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = consentsModel.region;
        }
        if ((i13 & 4) != 0) {
            str3 = consentsModel.consent;
        }
        if ((i13 & 8) != 0) {
            str4 = consentsModel.consentText;
        }
        if ((i13 & 16) != 0) {
            str5 = consentsModel.fullTermsUrl;
        }
        if ((i13 & 32) != 0) {
            z4 = consentsModel.consentRequired;
        }
        if ((i13 & 64) != 0) {
            termExpansion = consentsModel.expansionType;
        }
        if ((i13 & 128) != 0) {
            z13 = consentsModel.expansionRequired;
        }
        if ((i13 & 256) != 0) {
            z14 = consentsModel.bottomScrollAllowed;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        boolean z17 = z4;
        TermExpansion termExpansion2 = termExpansion;
        String str6 = str5;
        String str7 = str3;
        return consentsModel.copy(str, str2, str7, str4, str6, z17, termExpansion2, z15, z16);
    }

    public static final /* synthetic */ void write$Self$activation_release(ConsentsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.region);
        output.encodeStringElement(serialDesc, 2, self.consent);
        output.encodeStringElement(serialDesc, 3, self.consentText);
        output.encodeStringElement(serialDesc, 4, self.fullTermsUrl);
        output.encodeBooleanElement(serialDesc, 5, self.consentRequired);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.expansionType);
        output.encodeBooleanElement(serialDesc, 7, self.expansionRequired);
        output.encodeBooleanElement(serialDesc, 8, self.bottomScrollAllowed);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConsent() {
        return this.consent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConsentText() {
        return this.consentText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFullTermsUrl() {
        return this.fullTermsUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getConsentRequired() {
        return this.consentRequired;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TermExpansion getExpansionType() {
        return this.expansionType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getExpansionRequired() {
        return this.expansionRequired;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getBottomScrollAllowed() {
        return this.bottomScrollAllowed;
    }

    public final ConsentsModel copy(String id4, String region, String consent, String consentText, String fullTermsUrl, boolean consentRequired, TermExpansion expansionType, boolean expansionRequired, boolean bottomScrollAllowed) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(region, "region");
        AbstractC22676k.m65750j(consent, "consent");
        AbstractC22676k.m65750j(consentText, "consentText");
        AbstractC22676k.m65750j(fullTermsUrl, "fullTermsUrl");
        AbstractC22676k.m65750j(expansionType, "expansionType");
        return new ConsentsModel(id4, region, consent, consentText, fullTermsUrl, consentRequired, expansionType, expansionRequired, bottomScrollAllowed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentsModel)) {
            return false;
        }
        ConsentsModel consentsModel = (ConsentsModel) other;
        return AbstractC22676k.m65745e(this.id, consentsModel.id) && AbstractC22676k.m65745e(this.region, consentsModel.region) && AbstractC22676k.m65745e(this.consent, consentsModel.consent) && AbstractC22676k.m65745e(this.consentText, consentsModel.consentText) && AbstractC22676k.m65745e(this.fullTermsUrl, consentsModel.fullTermsUrl) && this.consentRequired == consentsModel.consentRequired && this.expansionType == consentsModel.expansionType && this.expansionRequired == consentsModel.expansionRequired && this.bottomScrollAllowed == consentsModel.bottomScrollAllowed;
    }

    public final boolean getBottomScrollAllowed() {
        return this.bottomScrollAllowed;
    }

    public final String getConsent() {
        return this.consent;
    }

    public final boolean getConsentRequired() {
        return this.consentRequired;
    }

    public final String getConsentText() {
        return this.consentText;
    }

    public final boolean getExpansionRequired() {
        return this.expansionRequired;
    }

    public final TermExpansion getExpansionType() {
        return this.expansionType;
    }

    public final String getFullTermsUrl() {
        return this.fullTermsUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return Boolean.hashCode(this.bottomScrollAllowed) + AbstractC2875y.m8289b((this.expansionType.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.region), 31, this.consent), 31, this.consentText), 31, this.fullTermsUrl), 31, this.consentRequired)) * 31, 31, this.expansionRequired);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.region;
        String str3 = this.consent;
        String str4 = this.consentText;
        String str5 = this.fullTermsUrl;
        boolean z4 = this.consentRequired;
        TermExpansion termExpansion = this.expansionType;
        boolean z13 = this.expansionRequired;
        boolean z14 = this.bottomScrollAllowed;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ConsentsModel(id=", str, ", region=", str2, ", consent=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", consentText=", str4, ", fullTermsUrl=");
        AbstractC38963t7.m124390t(sbM32001t, str5, ", consentRequired=", z4, ", expansionType=");
        sbM32001t.append(termExpansion);
        sbM32001t.append(", expansionRequired=");
        sbM32001t.append(z13);
        sbM32001t.append(", bottomScrollAllowed=");
        return AbstractC18489d0.m53372m(sbM32001t, z14, ")");
    }

    public ConsentsModel(String id4, String region, String consent, String consentText, String fullTermsUrl, boolean z4, TermExpansion expansionType, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(region, "region");
        AbstractC22676k.m65750j(consent, "consent");
        AbstractC22676k.m65750j(consentText, "consentText");
        AbstractC22676k.m65750j(fullTermsUrl, "fullTermsUrl");
        AbstractC22676k.m65750j(expansionType, "expansionType");
        this.id = id4;
        this.region = region;
        this.consent = consent;
        this.consentText = consentText;
        this.fullTermsUrl = fullTermsUrl;
        this.consentRequired = z4;
        this.expansionType = expansionType;
        this.expansionRequired = z13;
        this.bottomScrollAllowed = z14;
    }
}
