package com.whoop.sms.common.data;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/sms/common/data/SmsVerifyResponse;", "", "", "verified", "", "phoneNumber", "error", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sms_release", "(Lcom/whoop/sms/common/data/SmsVerifyResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/sms/common/data/SmsVerifyResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getVerified", "Ljava/lang/String;", "getPhoneNumber", "getError", "Companion", "$serializer", "a", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SmsVerifyResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String error;
    private final String phoneNumber;
    private final boolean verified;

    /* JADX INFO: renamed from: com.whoop.sms.common.data.SmsVerifyResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sms/common/data/SmsVerifyResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sms/common/data/SmsVerifyResponse;", "serializer", "()Lwc3/c;", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SmsVerifyResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SmsVerifyResponse(int i13, boolean z4, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SmsVerifyResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.verified = z4;
        if ((i13 & 2) == 0) {
            this.phoneNumber = null;
        } else {
            this.phoneNumber = str;
        }
        if ((i13 & 4) == 0) {
            this.error = null;
        } else {
            this.error = str2;
        }
    }

    public static /* synthetic */ SmsVerifyResponse copy$default(SmsVerifyResponse smsVerifyResponse, boolean z4, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = smsVerifyResponse.verified;
        }
        if ((i13 & 2) != 0) {
            str = smsVerifyResponse.phoneNumber;
        }
        if ((i13 & 4) != 0) {
            str2 = smsVerifyResponse.error;
        }
        return smsVerifyResponse.copy(z4, str, str2);
    }

    public static final /* synthetic */ void write$Self$sms_release(SmsVerifyResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.verified);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.phoneNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.phoneNumber);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.error == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.error);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getVerified() {
        return this.verified;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final SmsVerifyResponse copy(boolean verified, String phoneNumber, String error) {
        return new SmsVerifyResponse(verified, phoneNumber, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmsVerifyResponse)) {
            return false;
        }
        SmsVerifyResponse smsVerifyResponse = (SmsVerifyResponse) other;
        return this.verified == smsVerifyResponse.verified && AbstractC22676k.m65745e(this.phoneNumber, smsVerifyResponse.phoneNumber) && AbstractC22676k.m65745e(this.error, smsVerifyResponse.error);
    }

    public final String getError() {
        return this.error;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.verified) * 31;
        String str = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.verified;
        return AbstractC25012a.m73376i(this.error, ")", AbstractC13673n.m38567n("SmsVerifyResponse(verified=", ", phoneNumber=", this.phoneNumber, ", error=", z4));
    }

    public SmsVerifyResponse(boolean z4, String str, String str2) {
        this.verified = z4;
        this.phoneNumber = str;
        this.error = str2;
    }

    public /* synthetic */ SmsVerifyResponse(boolean z4, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2);
    }
}
