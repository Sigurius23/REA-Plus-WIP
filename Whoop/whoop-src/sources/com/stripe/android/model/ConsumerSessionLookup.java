package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
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
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NOBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\"Jb\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010\u001cJ\u001a\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00108\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010=\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010@\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010@\u0012\u0004\bD\u0010<\u001a\u0004\bC\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010E\u0012\u0004\bG\u0010<\u001a\u0004\bF\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010H\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bL\u0010<\u001a\u0004\bK\u0010\"¨\u0006P"}, m65681d2 = {"Lcom/stripe/android/model/ConsumerSessionLookup;", "Lvy/b;", "", "exists", "Lcom/stripe/android/model/ConsumerSession;", "consumerSession", "", "errorMessage", "publishableKey", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "displayablePaymentDetails", "Lcom/stripe/android/model/ConsentUi;", "consentUi", "suggestedEmail", "<init>", "(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Lcom/stripe/android/model/ConsumerSession;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/stripe/android/model/DisplayablePaymentDetails;", "component6", "()Lcom/stripe/android/model/ConsentUi;", "component7", "copy", "(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)Lcom/stripe/android/model/ConsumerSessionLookup;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsumerSessionLookup;Lzc3/c;Lyc3/g;)V", "write$Self", "Z", "getExists", "getExists$annotations", "()V", "Lcom/stripe/android/model/ConsumerSession;", "getConsumerSession", "getConsumerSession$annotations", "Ljava/lang/String;", "getErrorMessage", "getErrorMessage$annotations", "getPublishableKey", "getPublishableKey$annotations", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "getDisplayablePaymentDetails", "getDisplayablePaymentDetails$annotations", "Lcom/stripe/android/model/ConsentUi;", "getConsentUi", "getConsentUi$annotations", "getSuggestedEmail", "getSuggestedEmail$annotations", "Companion", "$serializer", "com/stripe/android/model/w", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConsumerSessionLookup implements InterfaceC36562b {
    private final ConsentUi consentUi;
    private final ConsumerSession consumerSession;
    private final DisplayablePaymentDetails displayablePaymentDetails;
    private final String errorMessage;
    private final boolean exists;
    private final String publishableKey;
    private final String suggestedEmail;
    public static final C5668w Companion = new C5668w();
    public static final Parcelable.Creator<ConsumerSessionLookup> CREATOR = new C38873k(19);

    public /* synthetic */ ConsumerSessionLookup(int i13, boolean z4, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails, ConsentUi consentUi, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ConsumerSessionLookup$$serializer.INSTANCE.getDescriptor());
        }
        this.exists = z4;
        if ((i13 & 2) == 0) {
            this.consumerSession = null;
        } else {
            this.consumerSession = consumerSession;
        }
        if ((i13 & 4) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
        if ((i13 & 8) == 0) {
            this.publishableKey = null;
        } else {
            this.publishableKey = str2;
        }
        if ((i13 & 16) == 0) {
            this.displayablePaymentDetails = null;
        } else {
            this.displayablePaymentDetails = displayablePaymentDetails;
        }
        if ((i13 & 32) == 0) {
            this.consentUi = null;
        } else {
            this.consentUi = consentUi;
        }
        if ((i13 & 64) == 0) {
            this.suggestedEmail = null;
        } else {
            this.suggestedEmail = str3;
        }
    }

    public static /* synthetic */ ConsumerSessionLookup copy$default(ConsumerSessionLookup consumerSessionLookup, boolean z4, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails, ConsentUi consentUi, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = consumerSessionLookup.exists;
        }
        if ((i13 & 2) != 0) {
            consumerSession = consumerSessionLookup.consumerSession;
        }
        if ((i13 & 4) != 0) {
            str = consumerSessionLookup.errorMessage;
        }
        if ((i13 & 8) != 0) {
            str2 = consumerSessionLookup.publishableKey;
        }
        if ((i13 & 16) != 0) {
            displayablePaymentDetails = consumerSessionLookup.displayablePaymentDetails;
        }
        if ((i13 & 32) != 0) {
            consentUi = consumerSessionLookup.consentUi;
        }
        if ((i13 & 64) != 0) {
            str3 = consumerSessionLookup.suggestedEmail;
        }
        ConsentUi consentUi2 = consentUi;
        String str4 = str3;
        DisplayablePaymentDetails displayablePaymentDetails2 = displayablePaymentDetails;
        String str5 = str;
        return consumerSessionLookup.copy(z4, consumerSession, str5, str2, displayablePaymentDetails2, consentUi2, str4);
    }

    @InterfaceC37143h("consent_ui")
    public static /* synthetic */ void getConsentUi$annotations() {
    }

    @InterfaceC37143h("consumer_session")
    public static /* synthetic */ void getConsumerSession$annotations() {
    }

    @InterfaceC37143h("displayable_payment_details")
    public static /* synthetic */ void getDisplayablePaymentDetails$annotations() {
    }

    @InterfaceC37143h("error_message")
    public static /* synthetic */ void getErrorMessage$annotations() {
    }

    @InterfaceC37143h("exists")
    public static /* synthetic */ void getExists$annotations() {
    }

    @InterfaceC37143h("publishable_key")
    public static /* synthetic */ void getPublishableKey$annotations() {
    }

    @InterfaceC37143h("suggested_email")
    public static /* synthetic */ void getSuggestedEmail$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_model_release(ConsumerSessionLookup self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.exists);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.consumerSession != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ConsumerSession$$serializer.INSTANCE, self.consumerSession);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.errorMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.errorMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.publishableKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.publishableKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.displayablePaymentDetails != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, DisplayablePaymentDetails$$serializer.INSTANCE, self.displayablePaymentDetails);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.consentUi != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ConsentUi$$serializer.INSTANCE, self.consentUi);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.suggestedEmail == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.suggestedEmail);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getExists() {
        return this.exists;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DisplayablePaymentDetails getDisplayablePaymentDetails() {
        return this.displayablePaymentDetails;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ConsentUi getConsentUi() {
        return this.consentUi;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSuggestedEmail() {
        return this.suggestedEmail;
    }

    public final ConsumerSessionLookup copy(boolean exists, ConsumerSession consumerSession, String errorMessage, String publishableKey, DisplayablePaymentDetails displayablePaymentDetails, ConsentUi consentUi, String suggestedEmail) {
        return new ConsumerSessionLookup(exists, consumerSession, errorMessage, publishableKey, displayablePaymentDetails, consentUi, suggestedEmail);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumerSessionLookup)) {
            return false;
        }
        ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) other;
        return this.exists == consumerSessionLookup.exists && AbstractC22676k.m65745e(this.consumerSession, consumerSessionLookup.consumerSession) && AbstractC22676k.m65745e(this.errorMessage, consumerSessionLookup.errorMessage) && AbstractC22676k.m65745e(this.publishableKey, consumerSessionLookup.publishableKey) && AbstractC22676k.m65745e(this.displayablePaymentDetails, consumerSessionLookup.displayablePaymentDetails) && AbstractC22676k.m65745e(this.consentUi, consumerSessionLookup.consentUi) && AbstractC22676k.m65745e(this.suggestedEmail, consumerSessionLookup.suggestedEmail);
    }

    public final ConsentUi getConsentUi() {
        return this.consentUi;
    }

    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    public final DisplayablePaymentDetails getDisplayablePaymentDetails() {
        return this.displayablePaymentDetails;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getExists() {
        return this.exists;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getSuggestedEmail() {
        return this.suggestedEmail;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.exists) * 31;
        ConsumerSession consumerSession = this.consumerSession;
        int iHashCode2 = (iHashCode + (consumerSession == null ? 0 : consumerSession.hashCode())) * 31;
        String str = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.publishableKey;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DisplayablePaymentDetails displayablePaymentDetails = this.displayablePaymentDetails;
        int iHashCode5 = (iHashCode4 + (displayablePaymentDetails == null ? 0 : displayablePaymentDetails.hashCode())) * 31;
        ConsentUi consentUi = this.consentUi;
        int iHashCode6 = (iHashCode5 + (consentUi == null ? 0 : consentUi.hashCode())) * 31;
        String str3 = this.suggestedEmail;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.exists;
        ConsumerSession consumerSession = this.consumerSession;
        String str = this.errorMessage;
        String str2 = this.publishableKey;
        DisplayablePaymentDetails displayablePaymentDetails = this.displayablePaymentDetails;
        ConsentUi consentUi = this.consentUi;
        String str3 = this.suggestedEmail;
        StringBuilder sb4 = new StringBuilder("ConsumerSessionLookup(exists=");
        sb4.append(z4);
        sb4.append(", consumerSession=");
        sb4.append(consumerSession);
        sb4.append(", errorMessage=");
        AbstractC11266d.m30444B(sb4, str, ", publishableKey=", str2, ", displayablePaymentDetails=");
        sb4.append(displayablePaymentDetails);
        sb4.append(", consentUi=");
        sb4.append(consentUi);
        sb4.append(", suggestedEmail=");
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.exists ? 1 : 0);
        ConsumerSession consumerSession = this.consumerSession;
        if (consumerSession == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            consumerSession.writeToParcel(dest, flags);
        }
        dest.writeString(this.errorMessage);
        dest.writeString(this.publishableKey);
        DisplayablePaymentDetails displayablePaymentDetails = this.displayablePaymentDetails;
        if (displayablePaymentDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            displayablePaymentDetails.writeToParcel(dest, flags);
        }
        ConsentUi consentUi = this.consentUi;
        if (consentUi == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            consentUi.writeToParcel(dest, flags);
        }
        dest.writeString(this.suggestedEmail);
    }

    public ConsumerSessionLookup(boolean z4, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails, ConsentUi consentUi, String str3) {
        this.exists = z4;
        this.consumerSession = consumerSession;
        this.errorMessage = str;
        this.publishableKey = str2;
        this.displayablePaymentDetails = displayablePaymentDetails;
        this.consentUi = consentUi;
        this.suggestedEmail = str3;
    }

    public /* synthetic */ ConsumerSessionLookup(boolean z4, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails, ConsentUi consentUi, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? null : consumerSession, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : displayablePaymentDetails, (i13 & 32) != 0 ? null : consentUi, (i13 & 64) != 0 ? null : str3);
    }
}
