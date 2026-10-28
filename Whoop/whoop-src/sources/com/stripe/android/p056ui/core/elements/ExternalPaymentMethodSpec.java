package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import x30.C37871a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ:\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001fR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\u001f¨\u00069"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;", "Landroid/os/Parcelable;", "", "type", "label", "lightImageUrl", "darkImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_ui_core_release", "(Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "getLabel", "getLabel$annotations", "getLightImageUrl", "getLightImageUrl$annotations", "getDarkImageUrl", "getDarkImageUrl$annotations", "Companion", "$serializer", "com/stripe/android/ui/core/elements/n", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExternalPaymentMethodSpec implements Parcelable {
    public static final int $stable = 8;
    private final String darkImageUrl;
    private final String label;
    private final String lightImageUrl;
    private final String type;
    public static final C5689n Companion = new C5689n();
    public static final Parcelable.Creator<ExternalPaymentMethodSpec> CREATOR = new C37871a(14);

    public /* synthetic */ ExternalPaymentMethodSpec(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ExternalPaymentMethodSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.label = str2;
        this.lightImageUrl = str3;
        if ((i13 & 8) == 0) {
            this.darkImageUrl = null;
        } else {
            this.darkImageUrl = str4;
        }
    }

    public static /* synthetic */ ExternalPaymentMethodSpec copy$default(ExternalPaymentMethodSpec externalPaymentMethodSpec, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = externalPaymentMethodSpec.type;
        }
        if ((i13 & 2) != 0) {
            str2 = externalPaymentMethodSpec.label;
        }
        if ((i13 & 4) != 0) {
            str3 = externalPaymentMethodSpec.lightImageUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = externalPaymentMethodSpec.darkImageUrl;
        }
        return externalPaymentMethodSpec.copy(str, str2, str3, str4);
    }

    @InterfaceC37143h("dark_image_url")
    public static /* synthetic */ void getDarkImageUrl$annotations() {
    }

    @InterfaceC37143h("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @InterfaceC37143h("light_image_url")
    public static /* synthetic */ void getLightImageUrl$annotations() {
    }

    @InterfaceC37143h("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_ui_core_release(ExternalPaymentMethodSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeStringElement(serialDesc, 2, self.lightImageUrl);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.darkImageUrl == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.darkImageUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    public final ExternalPaymentMethodSpec copy(String type, String label, String lightImageUrl, String darkImageUrl) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(lightImageUrl, "lightImageUrl");
        return new ExternalPaymentMethodSpec(type, label, lightImageUrl, darkImageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPaymentMethodSpec)) {
            return false;
        }
        ExternalPaymentMethodSpec externalPaymentMethodSpec = (ExternalPaymentMethodSpec) other;
        return AbstractC22676k.m65745e(this.type, externalPaymentMethodSpec.type) && AbstractC22676k.m65745e(this.label, externalPaymentMethodSpec.label) && AbstractC22676k.m65745e(this.lightImageUrl, externalPaymentMethodSpec.lightImageUrl) && AbstractC22676k.m65745e(this.darkImageUrl, externalPaymentMethodSpec.darkImageUrl);
    }

    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.label), 31, this.lightImageUrl);
        String str = this.darkImageUrl;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.type;
        String str2 = this.label;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ExternalPaymentMethodSpec(type=", str, ", label=", str2, ", lightImageUrl="), this.lightImageUrl, ", darkImageUrl=", this.darkImageUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.label);
        dest.writeString(this.lightImageUrl);
        dest.writeString(this.darkImageUrl);
    }

    public ExternalPaymentMethodSpec(String type, String label, String lightImageUrl, String str) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(lightImageUrl, "lightImageUrl");
        this.type = type;
        this.label = label;
        this.lightImageUrl = lightImageUrl;
        this.darkImageUrl = str;
    }

    public /* synthetic */ ExternalPaymentMethodSpec(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : str4);
    }
}
