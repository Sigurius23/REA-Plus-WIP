package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import y00.C38873k;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J&\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010 ¨\u00064"}, m65681d2 = {"Lcom/stripe/android/model/ConsumerSessionSignup;", "Lvy/b;", "Lcom/stripe/android/model/ConsumerSession;", "consumerSession", "", "publishableKey", "<init>", "(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsumerSessionSignup;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/model/ConsumerSession;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)Lcom/stripe/android/model/ConsumerSessionSignup;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/model/ConsumerSession;", "getConsumerSession", "getConsumerSession$annotations", "()V", "Ljava/lang/String;", "getPublishableKey", "getPublishableKey$annotations", "Companion", "$serializer", "com/stripe/android/model/y", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConsumerSessionSignup implements InterfaceC36562b {
    private final ConsumerSession consumerSession;
    private final String publishableKey;
    public static final C5670y Companion = new C5670y();
    public static final Parcelable.Creator<ConsumerSessionSignup> CREATOR = new C38873k(21);

    public /* synthetic */ ConsumerSessionSignup(int i13, ConsumerSession consumerSession, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ConsumerSessionSignup$$serializer.INSTANCE.getDescriptor());
        }
        this.consumerSession = consumerSession;
        if ((i13 & 2) == 0) {
            this.publishableKey = null;
        } else {
            this.publishableKey = str;
        }
    }

    public static /* synthetic */ ConsumerSessionSignup copy$default(ConsumerSessionSignup consumerSessionSignup, ConsumerSession consumerSession, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            consumerSession = consumerSessionSignup.consumerSession;
        }
        if ((i13 & 2) != 0) {
            str = consumerSessionSignup.publishableKey;
        }
        return consumerSessionSignup.copy(consumerSession, str);
    }

    @InterfaceC37143h("consumer_session")
    public static /* synthetic */ void getConsumerSession$annotations() {
    }

    @InterfaceC37143h("publishable_key")
    public static /* synthetic */ void getPublishableKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_model_release(ConsumerSessionSignup self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ConsumerSession$$serializer.INSTANCE, self.consumerSession);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.publishableKey == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.publishableKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final ConsumerSessionSignup copy(ConsumerSession consumerSession, String publishableKey) {
        AbstractC22676k.m65750j(consumerSession, "consumerSession");
        return new ConsumerSessionSignup(consumerSession, publishableKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumerSessionSignup)) {
            return false;
        }
        ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) other;
        return AbstractC22676k.m65745e(this.consumerSession, consumerSessionSignup.consumerSession) && AbstractC22676k.m65745e(this.publishableKey, consumerSessionSignup.publishableKey);
    }

    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public int hashCode() {
        int iHashCode = this.consumerSession.hashCode() * 31;
        String str = this.publishableKey;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ConsumerSessionSignup(consumerSession=" + this.consumerSession + ", publishableKey=" + this.publishableKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        this.consumerSession.writeToParcel(dest, flags);
        dest.writeString(this.publishableKey);
    }

    public ConsumerSessionSignup(ConsumerSession consumerSession, String str) {
        AbstractC22676k.m65750j(consumerSession, "consumerSession");
        this.consumerSession = consumerSession;
        this.publishableKey = str;
    }

    public /* synthetic */ ConsumerSessionSignup(ConsumerSession consumerSession, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(consumerSession, (i13 & 2) != 0 ? null : str);
    }
}
