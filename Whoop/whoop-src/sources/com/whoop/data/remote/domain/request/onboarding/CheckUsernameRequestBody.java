package com.whoop.data.remote.domain.request.onboarding;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b)\u0010\u0017¨\u0006,"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;", "", "", "strapSerial", "strapSignature", "username", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStrapSerial", "getStrapSerial$annotations", "()V", "getStrapSignature", "getStrapSignature$annotations", "getUsername", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CheckUsernameRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("strap_serial")
    private final String strapSerial;

    @SerializedName("strap_signature")
    private final String strapSignature;

    @SerializedName("username")
    private final String username;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CheckUsernameRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CheckUsernameRequestBody() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CheckUsernameRequestBody copy$default(CheckUsernameRequestBody checkUsernameRequestBody, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = checkUsernameRequestBody.strapSerial;
        }
        if ((i13 & 2) != 0) {
            str2 = checkUsernameRequestBody.strapSignature;
        }
        if ((i13 & 4) != 0) {
            str3 = checkUsernameRequestBody.username;
        }
        return checkUsernameRequestBody.copy(str, str2, str3);
    }

    @InterfaceC37143h("strap_serial")
    public static /* synthetic */ void getStrapSerial$annotations() {
    }

    @InterfaceC37143h("strap_signature")
    public static /* synthetic */ void getStrapSignature$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(CheckUsernameRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.strapSerial != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.strapSerial);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.strapSignature != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.strapSignature);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.username == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.username);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStrapSerial() {
        return this.strapSerial;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStrapSignature() {
        return this.strapSignature;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final CheckUsernameRequestBody copy(String strapSerial, String strapSignature, String username) {
        return new CheckUsernameRequestBody(strapSerial, strapSignature, username);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckUsernameRequestBody)) {
            return false;
        }
        CheckUsernameRequestBody checkUsernameRequestBody = (CheckUsernameRequestBody) other;
        return AbstractC22676k.m65745e(this.strapSerial, checkUsernameRequestBody.strapSerial) && AbstractC22676k.m65745e(this.strapSignature, checkUsernameRequestBody.strapSignature) && AbstractC22676k.m65745e(this.username, checkUsernameRequestBody.username);
    }

    public final String getStrapSerial() {
        return this.strapSerial;
    }

    public final String getStrapSignature() {
        return this.strapSignature;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.strapSerial;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.strapSignature;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.username;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.username, ")", AbstractC11895b.m32001t("CheckUsernameRequestBody(strapSerial=", this.strapSerial, ", strapSignature=", this.strapSignature, ", username="));
    }

    public /* synthetic */ CheckUsernameRequestBody(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.strapSerial = null;
        } else {
            this.strapSerial = str;
        }
        if ((i13 & 2) == 0) {
            this.strapSignature = null;
        } else {
            this.strapSignature = str2;
        }
        if ((i13 & 4) == 0) {
            this.username = null;
        } else {
            this.username = str3;
        }
    }

    public CheckUsernameRequestBody(String str, String str2, String str3) {
        this.strapSerial = str;
        this.strapSignature = str2;
        this.username = str3;
    }

    public /* synthetic */ CheckUsernameRequestBody(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
    }
}
