package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0003NOPB]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'Jl\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00108\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b@\u0010<\u001a\u0004\b?\u0010\u001eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00109\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00109\u0012\u0004\bD\u0010<\u001a\u0004\bC\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00109\u0012\u0004\bF\u0010<\u001a\u0004\bE\u0010\u001eR&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010G\u0012\u0004\bI\u0010<\u001a\u0004\bH\u0010%R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010J\u0012\u0004\bL\u0010<\u001a\u0004\bK\u0010'¨\u0006Q"}, m65681d2 = {"Lcom/stripe/android/model/ConsumerSession;", "Lvy/b;", "", "clientSecret", "emailAddress", "redactedFormattedPhoneNumber", "redactedPhoneNumber", "unredactedPhoneNumber", "phoneNumberCountry", "", "Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "verificationSessions", "Lcom/stripe/android/model/MobileFallbackWebviewParams;", "mobileFallbackWebviewParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/stripe/android/model/MobileFallbackWebviewParams;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)Lcom/stripe/android/model/ConsumerSession;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsumerSession;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getClientSecret", "getClientSecret$annotations", "()V", "getEmailAddress", "getEmailAddress$annotations", "getRedactedFormattedPhoneNumber", "getRedactedFormattedPhoneNumber$annotations", "getRedactedPhoneNumber", "getRedactedPhoneNumber$annotations", "getUnredactedPhoneNumber", "getUnredactedPhoneNumber$annotations", "getPhoneNumberCountry", "getPhoneNumberCountry$annotations", "Ljava/util/List;", "getVerificationSessions", "getVerificationSessions$annotations", "Lcom/stripe/android/model/MobileFallbackWebviewParams;", "getMobileFallbackWebviewParams", "getMobileFallbackWebviewParams$annotations", "Companion", "VerificationSession", "$serializer", "com/stripe/android/model/m", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConsumerSession implements InterfaceC36562b {
    private final String clientSecret;
    private final String emailAddress;
    private final MobileFallbackWebviewParams mobileFallbackWebviewParams;
    private final String phoneNumberCountry;
    private final String redactedFormattedPhoneNumber;
    private final String redactedPhoneNumber;
    private final String unredactedPhoneNumber;
    private final List<VerificationSession> verificationSessions;
    public static final C5658m Companion = new C5658m();
    public static final Parcelable.Creator<ConsumerSession> CREATOR = new C5659n();
    private static final InterfaceC37138c[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(ConsumerSession$VerificationSession$$serializer.INSTANCE), null};

    @Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0004\u0002\u000412B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010 ¨\u00063"}, m65681d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "Lvy/b;", "Lcom/stripe/android/model/v;", "type", "Lcom/stripe/android/model/s;", "state", "<init>", "(Lcom/stripe/android/model/v;Lcom/stripe/android/model/s;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/model/v;Lcom/stripe/android/model/s;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsumerSession$VerificationSession;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/model/v;", "component2", "()Lcom/stripe/android/model/s;", "copy", "(Lcom/stripe/android/model/v;Lcom/stripe/android/model/s;)Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/model/v;", "getType", "Lcom/stripe/android/model/s;", "getState", "Companion", "$serializer", "com/stripe/android/model/o", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class VerificationSession implements InterfaceC36562b {
        private final EnumC5664s state;
        private final EnumC5667v type;
        public static final C5660o Companion = new C5660o();
        public static final Parcelable.Creator<VerificationSession> CREATOR = new C5661p();
        private static final InterfaceC37138c[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.stripe.android.model.ConsumerSession.VerificationSession.SessionType", EnumC5667v.values()), EnumsKt.createSimpleEnumSerializer("com.stripe.android.model.ConsumerSession.VerificationSession.SessionState", EnumC5664s.values())};

        public /* synthetic */ VerificationSession(int i13, EnumC5667v enumC5667v, EnumC5664s enumC5664s, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, ConsumerSession$VerificationSession$$serializer.INSTANCE.getDescriptor());
            }
            this.type = enumC5667v;
            this.state = enumC5664s;
        }

        public static /* synthetic */ VerificationSession copy$default(VerificationSession verificationSession, EnumC5667v enumC5667v, EnumC5664s enumC5664s, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                enumC5667v = verificationSession.type;
            }
            if ((i13 & 2) != 0) {
                enumC5664s = verificationSession.state;
            }
            return verificationSession.copy(enumC5667v, enumC5664s);
        }

        public static final /* synthetic */ void write$Self$payments_model_release(VerificationSession self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.type);
            output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.state);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EnumC5667v getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final EnumC5664s getState() {
            return this.state;
        }

        public final VerificationSession copy(EnumC5667v type, EnumC5664s state) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(state, "state");
            return new VerificationSession(type, state);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerificationSession)) {
                return false;
            }
            VerificationSession verificationSession = (VerificationSession) other;
            return this.type == verificationSession.type && this.state == verificationSession.state;
        }

        public final EnumC5664s getState() {
            return this.state;
        }

        public final EnumC5667v getType() {
            return this.type;
        }

        public int hashCode() {
            return this.state.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "VerificationSession(type=" + this.type + ", state=" + this.state + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            this.type.writeToParcel(dest, flags);
            this.state.writeToParcel(dest, flags);
        }

        public VerificationSession(EnumC5667v type, EnumC5664s state) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(state, "state");
            this.type = type;
            this.state = state;
        }
    }

    public /* synthetic */ ConsumerSession(int i13, String str, String str2, String str3, String str4, String str5, String str6, List list, MobileFallbackWebviewParams mobileFallbackWebviewParams, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i13 & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 14, ConsumerSession$$serializer.INSTANCE.getDescriptor());
        }
        this.clientSecret = (i13 & 1) == 0 ? "" : str;
        this.emailAddress = str2;
        this.redactedFormattedPhoneNumber = str3;
        this.redactedPhoneNumber = str4;
        if ((i13 & 16) == 0) {
            this.unredactedPhoneNumber = null;
        } else {
            this.unredactedPhoneNumber = str5;
        }
        if ((i13 & 32) == 0) {
            this.phoneNumberCountry = null;
        } else {
            this.phoneNumberCountry = str6;
        }
        if ((i13 & 64) == 0) {
            this.verificationSessions = C25271y.f99162w;
        } else {
            this.verificationSessions = list;
        }
        if ((i13 & 128) == 0) {
            this.mobileFallbackWebviewParams = null;
        } else {
            this.mobileFallbackWebviewParams = mobileFallbackWebviewParams;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsumerSession copy$default(ConsumerSession consumerSession, String str, String str2, String str3, String str4, String str5, String str6, List list, MobileFallbackWebviewParams mobileFallbackWebviewParams, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = consumerSession.clientSecret;
        }
        if ((i13 & 2) != 0) {
            str2 = consumerSession.emailAddress;
        }
        if ((i13 & 4) != 0) {
            str3 = consumerSession.redactedFormattedPhoneNumber;
        }
        if ((i13 & 8) != 0) {
            str4 = consumerSession.redactedPhoneNumber;
        }
        if ((i13 & 16) != 0) {
            str5 = consumerSession.unredactedPhoneNumber;
        }
        if ((i13 & 32) != 0) {
            str6 = consumerSession.phoneNumberCountry;
        }
        if ((i13 & 64) != 0) {
            list = consumerSession.verificationSessions;
        }
        if ((i13 & 128) != 0) {
            mobileFallbackWebviewParams = consumerSession.mobileFallbackWebviewParams;
        }
        List list2 = list;
        MobileFallbackWebviewParams mobileFallbackWebviewParams2 = mobileFallbackWebviewParams;
        String str7 = str5;
        String str8 = str6;
        return consumerSession.copy(str, str2, str3, str4, str7, str8, list2, mobileFallbackWebviewParams2);
    }

    @InterfaceC37143h("client_secret")
    public static /* synthetic */ void getClientSecret$annotations() {
    }

    @InterfaceC37143h("email_address")
    public static /* synthetic */ void getEmailAddress$annotations() {
    }

    @InterfaceC37143h("mobile_fallback_webview_params")
    public static /* synthetic */ void getMobileFallbackWebviewParams$annotations() {
    }

    @InterfaceC37143h("phone_number_country")
    public static /* synthetic */ void getPhoneNumberCountry$annotations() {
    }

    @InterfaceC37143h("redacted_formatted_phone_number")
    public static /* synthetic */ void getRedactedFormattedPhoneNumber$annotations() {
    }

    @InterfaceC37143h("redacted_phone_number")
    public static /* synthetic */ void getRedactedPhoneNumber$annotations() {
    }

    @InterfaceC37143h("unredacted_phone_number")
    public static /* synthetic */ void getUnredactedPhoneNumber$annotations() {
    }

    @InterfaceC37143h("verification_sessions")
    public static /* synthetic */ void getVerificationSessions$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_model_release(ConsumerSession self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.clientSecret, "")) {
            output.encodeStringElement(serialDesc, 0, self.clientSecret);
        }
        output.encodeStringElement(serialDesc, 1, self.emailAddress);
        output.encodeStringElement(serialDesc, 2, self.redactedFormattedPhoneNumber);
        output.encodeStringElement(serialDesc, 3, self.redactedPhoneNumber);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.unredactedPhoneNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.unredactedPhoneNumber);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.phoneNumberCountry != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.phoneNumberCountry);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.verificationSessions, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 6, interfaceC37138cArr[6], self.verificationSessions);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.mobileFallbackWebviewParams == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, MobileFallbackWebviewParams$$serializer.INSTANCE, self.mobileFallbackWebviewParams);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRedactedFormattedPhoneNumber() {
        return this.redactedFormattedPhoneNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUnredactedPhoneNumber() {
        return this.unredactedPhoneNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPhoneNumberCountry() {
        return this.phoneNumberCountry;
    }

    public final List<VerificationSession> component7() {
        return this.verificationSessions;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MobileFallbackWebviewParams getMobileFallbackWebviewParams() {
        return this.mobileFallbackWebviewParams;
    }

    public final ConsumerSession copy(String clientSecret, String emailAddress, String redactedFormattedPhoneNumber, String redactedPhoneNumber, String unredactedPhoneNumber, String phoneNumberCountry, List<VerificationSession> verificationSessions, MobileFallbackWebviewParams mobileFallbackWebviewParams) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(emailAddress, "emailAddress");
        AbstractC22676k.m65750j(redactedFormattedPhoneNumber, "redactedFormattedPhoneNumber");
        AbstractC22676k.m65750j(redactedPhoneNumber, "redactedPhoneNumber");
        AbstractC22676k.m65750j(verificationSessions, "verificationSessions");
        return new ConsumerSession(clientSecret, emailAddress, redactedFormattedPhoneNumber, redactedPhoneNumber, unredactedPhoneNumber, phoneNumberCountry, verificationSessions, mobileFallbackWebviewParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumerSession)) {
            return false;
        }
        ConsumerSession consumerSession = (ConsumerSession) other;
        return AbstractC22676k.m65745e(this.clientSecret, consumerSession.clientSecret) && AbstractC22676k.m65745e(this.emailAddress, consumerSession.emailAddress) && AbstractC22676k.m65745e(this.redactedFormattedPhoneNumber, consumerSession.redactedFormattedPhoneNumber) && AbstractC22676k.m65745e(this.redactedPhoneNumber, consumerSession.redactedPhoneNumber) && AbstractC22676k.m65745e(this.unredactedPhoneNumber, consumerSession.unredactedPhoneNumber) && AbstractC22676k.m65745e(this.phoneNumberCountry, consumerSession.phoneNumberCountry) && AbstractC22676k.m65745e(this.verificationSessions, consumerSession.verificationSessions) && AbstractC22676k.m65745e(this.mobileFallbackWebviewParams, consumerSession.mobileFallbackWebviewParams);
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final MobileFallbackWebviewParams getMobileFallbackWebviewParams() {
        return this.mobileFallbackWebviewParams;
    }

    public final String getPhoneNumberCountry() {
        return this.phoneNumberCountry;
    }

    public final String getRedactedFormattedPhoneNumber() {
        return this.redactedFormattedPhoneNumber;
    }

    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    public final String getUnredactedPhoneNumber() {
        return this.unredactedPhoneNumber;
    }

    public final List<VerificationSession> getVerificationSessions() {
        return this.verificationSessions;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.clientSecret.hashCode() * 31, 31, this.emailAddress), 31, this.redactedFormattedPhoneNumber), 31, this.redactedPhoneNumber);
        String str = this.unredactedPhoneNumber;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneNumberCountry;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.verificationSessions);
        MobileFallbackWebviewParams mobileFallbackWebviewParams = this.mobileFallbackWebviewParams;
        return iM31983b + (mobileFallbackWebviewParams != null ? mobileFallbackWebviewParams.hashCode() : 0);
    }

    public String toString() {
        String str = this.clientSecret;
        String str2 = this.emailAddress;
        String str3 = this.redactedFormattedPhoneNumber;
        String str4 = this.redactedPhoneNumber;
        String str5 = this.unredactedPhoneNumber;
        String str6 = this.phoneNumberCountry;
        List<VerificationSession> list = this.verificationSessions;
        MobileFallbackWebviewParams mobileFallbackWebviewParams = this.mobileFallbackWebviewParams;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ConsumerSession(clientSecret=", str, ", emailAddress=", str2, ", redactedFormattedPhoneNumber=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", redactedPhoneNumber=", str4, ", unredactedPhoneNumber=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", phoneNumberCountry=", str6, ", verificationSessions=");
        sbM32001t.append(list);
        sbM32001t.append(", mobileFallbackWebviewParams=");
        sbM32001t.append(mobileFallbackWebviewParams);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.clientSecret);
        dest.writeString(this.emailAddress);
        dest.writeString(this.redactedFormattedPhoneNumber);
        dest.writeString(this.redactedPhoneNumber);
        dest.writeString(this.unredactedPhoneNumber);
        dest.writeString(this.phoneNumberCountry);
        Iterator itM30863o = AbstractC11478a.m30863o(this.verificationSessions, dest);
        while (itM30863o.hasNext()) {
            ((VerificationSession) itM30863o.next()).writeToParcel(dest, flags);
        }
        MobileFallbackWebviewParams mobileFallbackWebviewParams = this.mobileFallbackWebviewParams;
        if (mobileFallbackWebviewParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mobileFallbackWebviewParams.writeToParcel(dest, flags);
        }
    }

    public ConsumerSession(String clientSecret, String emailAddress, String redactedFormattedPhoneNumber, String redactedPhoneNumber, String str, String str2, List<VerificationSession> verificationSessions, MobileFallbackWebviewParams mobileFallbackWebviewParams) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(emailAddress, "emailAddress");
        AbstractC22676k.m65750j(redactedFormattedPhoneNumber, "redactedFormattedPhoneNumber");
        AbstractC22676k.m65750j(redactedPhoneNumber, "redactedPhoneNumber");
        AbstractC22676k.m65750j(verificationSessions, "verificationSessions");
        this.clientSecret = clientSecret;
        this.emailAddress = emailAddress;
        this.redactedFormattedPhoneNumber = redactedFormattedPhoneNumber;
        this.redactedPhoneNumber = redactedPhoneNumber;
        this.unredactedPhoneNumber = str;
        this.phoneNumberCountry = str2;
        this.verificationSessions = verificationSessions;
        this.mobileFallbackWebviewParams = mobileFallbackWebviewParams;
    }

    public /* synthetic */ ConsumerSession(String str, String str2, String str3, String str4, String str5, String str6, List list, MobileFallbackWebviewParams mobileFallbackWebviewParams, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, str2, str3, str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? C25271y.f99162w : list, (i13 & 128) != 0 ? null : mobileFallbackWebviewParams);
    }
}
