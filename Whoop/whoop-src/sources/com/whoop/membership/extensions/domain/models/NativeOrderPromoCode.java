package com.whoop.membership.extensions.domain.models;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\\\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001cR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\b<\u0010/\u001a\u0004\b;\u0010#¨\u0006?"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;", "", "", NotificationCompat.CATEGORY_STATUS, "expandedInputTitle", "inputTitle", "applyCtaText", "promoCode", "statusText", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "getStatus$annotations", "()V", "getExpandedInputTitle", "getExpandedInputTitle$annotations", "getInputTitle", "getInputTitle$annotations", "getApplyCtaText", "getApplyCtaText$annotations", "getPromoCode", "getPromoCode$annotations", "getStatusText", "getStatusText$annotations", "Z", "getEnabled", "getEnabled$annotations", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NativeOrderPromoCode {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("apply_cta_text")
    private final String applyCtaText;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("expanded_input_title")
    private final String expandedInputTitle;

    @SerializedName("input_title")
    private final String inputTitle;

    @SerializedName("promo_code")
    private final String promoCode;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("status_text")
    private final String statusText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NativeOrderPromoCode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NativeOrderPromoCode(int i13, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, NativeOrderPromoCode$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
        this.expandedInputTitle = str2;
        this.inputTitle = str3;
        this.applyCtaText = str4;
        this.promoCode = str5;
        this.statusText = str6;
        this.enabled = z4;
    }

    public static /* synthetic */ NativeOrderPromoCode copy$default(NativeOrderPromoCode nativeOrderPromoCode, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = nativeOrderPromoCode.status;
        }
        if ((i13 & 2) != 0) {
            str2 = nativeOrderPromoCode.expandedInputTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = nativeOrderPromoCode.inputTitle;
        }
        if ((i13 & 8) != 0) {
            str4 = nativeOrderPromoCode.applyCtaText;
        }
        if ((i13 & 16) != 0) {
            str5 = nativeOrderPromoCode.promoCode;
        }
        if ((i13 & 32) != 0) {
            str6 = nativeOrderPromoCode.statusText;
        }
        if ((i13 & 64) != 0) {
            z4 = nativeOrderPromoCode.enabled;
        }
        String str7 = str6;
        boolean z13 = z4;
        String str8 = str5;
        String str9 = str3;
        return nativeOrderPromoCode.copy(str, str2, str9, str4, str8, str7, z13);
    }

    @InterfaceC37143h("apply_cta_text")
    public static /* synthetic */ void getApplyCtaText$annotations() {
    }

    @InterfaceC37143h("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @InterfaceC37143h("expanded_input_title")
    public static /* synthetic */ void getExpandedInputTitle$annotations() {
    }

    @InterfaceC37143h("input_title")
    public static /* synthetic */ void getInputTitle$annotations() {
    }

    @InterfaceC37143h("promo_code")
    public static /* synthetic */ void getPromoCode$annotations() {
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_STATUS)
    public static /* synthetic */ void getStatus$annotations() {
    }

    @InterfaceC37143h("status_text")
    public static /* synthetic */ void getStatusText$annotations() {
    }

    public static final /* synthetic */ void write$Self$membership_release(NativeOrderPromoCode self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.status);
        output.encodeStringElement(serialDesc, 1, self.expandedInputTitle);
        output.encodeStringElement(serialDesc, 2, self.inputTitle);
        output.encodeStringElement(serialDesc, 3, self.applyCtaText);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.promoCode);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.statusText);
        output.encodeBooleanElement(serialDesc, 6, self.enabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpandedInputTitle() {
        return this.expandedInputTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplyCtaText() {
        return this.applyCtaText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final NativeOrderPromoCode copy(String status, String expandedInputTitle, String inputTitle, String applyCtaText, String promoCode, String statusText, boolean enabled) {
        AbstractC22676k.m65750j(expandedInputTitle, "expandedInputTitle");
        AbstractC22676k.m65750j(inputTitle, "inputTitle");
        AbstractC22676k.m65750j(applyCtaText, "applyCtaText");
        return new NativeOrderPromoCode(status, expandedInputTitle, inputTitle, applyCtaText, promoCode, statusText, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeOrderPromoCode)) {
            return false;
        }
        NativeOrderPromoCode nativeOrderPromoCode = (NativeOrderPromoCode) other;
        return AbstractC22676k.m65745e(this.status, nativeOrderPromoCode.status) && AbstractC22676k.m65745e(this.expandedInputTitle, nativeOrderPromoCode.expandedInputTitle) && AbstractC22676k.m65745e(this.inputTitle, nativeOrderPromoCode.inputTitle) && AbstractC22676k.m65745e(this.applyCtaText, nativeOrderPromoCode.applyCtaText) && AbstractC22676k.m65745e(this.promoCode, nativeOrderPromoCode.promoCode) && AbstractC22676k.m65745e(this.statusText, nativeOrderPromoCode.statusText) && this.enabled == nativeOrderPromoCode.enabled;
    }

    public final String getApplyCtaText() {
        return this.applyCtaText;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getExpandedInputTitle() {
        return this.expandedInputTitle;
    }

    public final String getInputTitle() {
        return this.inputTitle;
    }

    public final String getPromoCode() {
        return this.promoCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public int hashCode() {
        String str = this.status;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.expandedInputTitle), 31, this.inputTitle), 31, this.applyCtaText);
        String str2 = this.promoCode;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusText;
        return Boolean.hashCode(this.enabled) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.status;
        String str2 = this.expandedInputTitle;
        String str3 = this.inputTitle;
        String str4 = this.applyCtaText;
        String str5 = this.promoCode;
        String str6 = this.statusText;
        boolean z4 = this.enabled;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NativeOrderPromoCode(status=", str, ", expandedInputTitle=", str2, ", inputTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", applyCtaText=", str4, ", promoCode=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", statusText=", str6, ", enabled=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public NativeOrderPromoCode(String str, String expandedInputTitle, String inputTitle, String applyCtaText, String str2, String str3, boolean z4) {
        AbstractC22676k.m65750j(expandedInputTitle, "expandedInputTitle");
        AbstractC22676k.m65750j(inputTitle, "inputTitle");
        AbstractC22676k.m65750j(applyCtaText, "applyCtaText");
        this.status = str;
        this.expandedInputTitle = expandedInputTitle;
        this.inputTitle = inputTitle;
        this.applyCtaText = applyCtaText;
        this.promoCode = str2;
        this.statusText = str3;
        this.enabled = z4;
    }
}
