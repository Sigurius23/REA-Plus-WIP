package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import y00.C38992x0;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J@\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u001eJ\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010$¨\u0006<"}, m65681d2 = {"Lcom/stripe/android/model/DisplayablePaymentDetails;", "Lvy/b;", "", "defaultCardBrand", "defaultPaymentType", "last4", "", "numberOfSavedPaymentDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/DisplayablePaymentDetails;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/stripe/android/model/DisplayablePaymentDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDefaultCardBrand", "getDefaultCardBrand$annotations", "()V", "getDefaultPaymentType", "getDefaultPaymentType$annotations", "getLast4", "getLast4$annotations", "Ljava/lang/Long;", "getNumberOfSavedPaymentDetails", "getNumberOfSavedPaymentDetails$annotations", "Companion", "$serializer", "com/stripe/android/model/z", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DisplayablePaymentDetails implements InterfaceC36562b {
    private final String defaultCardBrand;
    private final String defaultPaymentType;
    private final String last4;
    private final Long numberOfSavedPaymentDetails;
    public static final C5671z Companion = new C5671z();
    public static final Parcelable.Creator<DisplayablePaymentDetails> CREATOR = new C38992x0(1);

    public DisplayablePaymentDetails() {
        this((String) null, (String) null, (String) null, (Long) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DisplayablePaymentDetails copy$default(DisplayablePaymentDetails displayablePaymentDetails, String str, String str2, String str3, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = displayablePaymentDetails.defaultCardBrand;
        }
        if ((i13 & 2) != 0) {
            str2 = displayablePaymentDetails.defaultPaymentType;
        }
        if ((i13 & 4) != 0) {
            str3 = displayablePaymentDetails.last4;
        }
        if ((i13 & 8) != 0) {
            l7 = displayablePaymentDetails.numberOfSavedPaymentDetails;
        }
        return displayablePaymentDetails.copy(str, str2, str3, l7);
    }

    @InterfaceC37143h("default_card_brand")
    public static /* synthetic */ void getDefaultCardBrand$annotations() {
    }

    @InterfaceC37143h("default_payment_type")
    public static /* synthetic */ void getDefaultPaymentType$annotations() {
    }

    @InterfaceC37143h("last_4")
    public static /* synthetic */ void getLast4$annotations() {
    }

    @InterfaceC37143h("number_of_saved_payment_details")
    public static /* synthetic */ void getNumberOfSavedPaymentDetails$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_model_release(DisplayablePaymentDetails self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.defaultCardBrand != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.defaultCardBrand);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.defaultPaymentType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.defaultPaymentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.last4 != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.last4);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.numberOfSavedPaymentDetails == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.numberOfSavedPaymentDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDefaultCardBrand() {
        return this.defaultCardBrand;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultPaymentType() {
        return this.defaultPaymentType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getNumberOfSavedPaymentDetails() {
        return this.numberOfSavedPaymentDetails;
    }

    public final DisplayablePaymentDetails copy(String defaultCardBrand, String defaultPaymentType, String last4, Long numberOfSavedPaymentDetails) {
        return new DisplayablePaymentDetails(defaultCardBrand, defaultPaymentType, last4, numberOfSavedPaymentDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayablePaymentDetails)) {
            return false;
        }
        DisplayablePaymentDetails displayablePaymentDetails = (DisplayablePaymentDetails) other;
        return AbstractC22676k.m65745e(this.defaultCardBrand, displayablePaymentDetails.defaultCardBrand) && AbstractC22676k.m65745e(this.defaultPaymentType, displayablePaymentDetails.defaultPaymentType) && AbstractC22676k.m65745e(this.last4, displayablePaymentDetails.last4) && AbstractC22676k.m65745e(this.numberOfSavedPaymentDetails, displayablePaymentDetails.numberOfSavedPaymentDetails);
    }

    public final String getDefaultCardBrand() {
        return this.defaultCardBrand;
    }

    public final String getDefaultPaymentType() {
        return this.defaultPaymentType;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final Long getNumberOfSavedPaymentDetails() {
        return this.numberOfSavedPaymentDetails;
    }

    public int hashCode() {
        String str = this.defaultCardBrand;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultPaymentType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.last4;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l7 = this.numberOfSavedPaymentDetails;
        return iHashCode3 + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        String str = this.defaultCardBrand;
        String str2 = this.defaultPaymentType;
        String str3 = this.last4;
        Long l7 = this.numberOfSavedPaymentDetails;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DisplayablePaymentDetails(defaultCardBrand=", str, ", defaultPaymentType=", str2, ", last4=");
        sbM32001t.append(str3);
        sbM32001t.append(", numberOfSavedPaymentDetails=");
        sbM32001t.append(l7);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.defaultCardBrand);
        dest.writeString(this.defaultPaymentType);
        dest.writeString(this.last4);
        Long l7 = this.numberOfSavedPaymentDetails;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
    }

    public /* synthetic */ DisplayablePaymentDetails(int i13, String str, String str2, String str3, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.defaultCardBrand = null;
        } else {
            this.defaultCardBrand = str;
        }
        if ((i13 & 2) == 0) {
            this.defaultPaymentType = null;
        } else {
            this.defaultPaymentType = str2;
        }
        if ((i13 & 4) == 0) {
            this.last4 = null;
        } else {
            this.last4 = str3;
        }
        if ((i13 & 8) == 0) {
            this.numberOfSavedPaymentDetails = null;
        } else {
            this.numberOfSavedPaymentDetails = l7;
        }
    }

    public DisplayablePaymentDetails(String str, String str2, String str3, Long l7) {
        this.defaultCardBrand = str;
        this.defaultPaymentType = str2;
        this.last4 = str3;
        this.numberOfSavedPaymentDetails = l7;
    }

    public /* synthetic */ DisplayablePaymentDetails(String str, String str2, String str3, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : l7);
    }
}
