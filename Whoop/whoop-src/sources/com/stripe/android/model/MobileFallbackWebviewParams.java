package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import xo1.C38492a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0003234B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J&\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010 ¨\u00065"}, m65681d2 = {"Lcom/stripe/android/model/MobileFallbackWebviewParams;", "Lvy/b;", "Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;", "webViewRequirementType", "", "webviewOpenUrl", "<init>", "(Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/MobileFallbackWebviewParams;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;Ljava/lang/String;)Lcom/stripe/android/model/MobileFallbackWebviewParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;", "getWebViewRequirementType", "getWebViewRequirementType$annotations", "()V", "Ljava/lang/String;", "getWebviewOpenUrl", "getWebviewOpenUrl$annotations", "Companion", "WebviewRequirementType", "$serializer", "com/stripe/android/model/b0", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MobileFallbackWebviewParams implements InterfaceC36562b {
    private final WebviewRequirementType webViewRequirementType;
    private final String webviewOpenUrl;
    public static final C5645b0 Companion = new C5645b0();
    public static final Parcelable.Creator<MobileFallbackWebviewParams> CREATOR = new C5647c0();
    private static final InterfaceC37138c[] $childSerializers = {WebviewRequirementType.Companion.serializer(), null};

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/model/d0", "Unknown", "Required", "NotRequired", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public enum WebviewRequirementType {
        Unknown(""),
        Required("required"),
        NotRequired("notrequired");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5649d0 Companion = new C5649d0();
        private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38492a(16));

        WebviewRequirementType(String str) {
            this.value = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.stripe.android.model.MobileFallbackWebviewParams.WebviewRequirementType", values());
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ MobileFallbackWebviewParams(int i13, WebviewRequirementType webviewRequirementType, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, MobileFallbackWebviewParams$$serializer.INSTANCE.getDescriptor());
        }
        this.webViewRequirementType = webviewRequirementType;
        if ((i13 & 2) == 0) {
            this.webviewOpenUrl = null;
        } else {
            this.webviewOpenUrl = str;
        }
    }

    public static /* synthetic */ MobileFallbackWebviewParams copy$default(MobileFallbackWebviewParams mobileFallbackWebviewParams, WebviewRequirementType webviewRequirementType, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            webviewRequirementType = mobileFallbackWebviewParams.webViewRequirementType;
        }
        if ((i13 & 2) != 0) {
            str = mobileFallbackWebviewParams.webviewOpenUrl;
        }
        return mobileFallbackWebviewParams.copy(webviewRequirementType, str);
    }

    @InterfaceC37143h("webview_requirement_type")
    public static /* synthetic */ void getWebViewRequirementType$annotations() {
    }

    @InterfaceC37143h("webview_open_url")
    public static /* synthetic */ void getWebviewOpenUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_model_release(MobileFallbackWebviewParams self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.webViewRequirementType);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.webviewOpenUrl == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.webviewOpenUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WebviewRequirementType getWebViewRequirementType() {
        return this.webViewRequirementType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWebviewOpenUrl() {
        return this.webviewOpenUrl;
    }

    public final MobileFallbackWebviewParams copy(WebviewRequirementType webViewRequirementType, String webviewOpenUrl) {
        AbstractC22676k.m65750j(webViewRequirementType, "webViewRequirementType");
        return new MobileFallbackWebviewParams(webViewRequirementType, webviewOpenUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileFallbackWebviewParams)) {
            return false;
        }
        MobileFallbackWebviewParams mobileFallbackWebviewParams = (MobileFallbackWebviewParams) other;
        return this.webViewRequirementType == mobileFallbackWebviewParams.webViewRequirementType && AbstractC22676k.m65745e(this.webviewOpenUrl, mobileFallbackWebviewParams.webviewOpenUrl);
    }

    public final WebviewRequirementType getWebViewRequirementType() {
        return this.webViewRequirementType;
    }

    public final String getWebviewOpenUrl() {
        return this.webviewOpenUrl;
    }

    public int hashCode() {
        int iHashCode = this.webViewRequirementType.hashCode() * 31;
        String str = this.webviewOpenUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MobileFallbackWebviewParams(webViewRequirementType=" + this.webViewRequirementType + ", webviewOpenUrl=" + this.webviewOpenUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.webViewRequirementType.name());
        dest.writeString(this.webviewOpenUrl);
    }

    public MobileFallbackWebviewParams(WebviewRequirementType webViewRequirementType, String str) {
        AbstractC22676k.m65750j(webViewRequirementType, "webViewRequirementType");
        this.webViewRequirementType = webViewRequirementType;
        this.webviewOpenUrl = str;
    }

    public /* synthetic */ MobileFallbackWebviewParams(WebviewRequirementType webviewRequirementType, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(webviewRequirementType, (i13 & 2) != 0 ? null : str);
    }
}
