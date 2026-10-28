package com.whoop.membership.management.domain.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006."}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;", "", "", "title", "existingLabel", "alternateLabel", "", "zipCodeRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getExistingLabel", "getAlternateLabel", "Z", "getZipCodeRequired", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CheckoutPaymentOptionsModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String alternateLabel;
    private final String existingLabel;
    private final String title;
    private final boolean zipCodeRequired;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CheckoutPaymentOptionsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CheckoutPaymentOptionsModel(int i13, String str, String str2, String str3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CheckoutPaymentOptionsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.existingLabel = str2;
        this.alternateLabel = str3;
        this.zipCodeRequired = z4;
    }

    public static /* synthetic */ CheckoutPaymentOptionsModel copy$default(CheckoutPaymentOptionsModel checkoutPaymentOptionsModel, String str, String str2, String str3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = checkoutPaymentOptionsModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = checkoutPaymentOptionsModel.existingLabel;
        }
        if ((i13 & 4) != 0) {
            str3 = checkoutPaymentOptionsModel.alternateLabel;
        }
        if ((i13 & 8) != 0) {
            z4 = checkoutPaymentOptionsModel.zipCodeRequired;
        }
        return checkoutPaymentOptionsModel.copy(str, str2, str3, z4);
    }

    public static final /* synthetic */ void write$Self$membership_release(CheckoutPaymentOptionsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.existingLabel);
        output.encodeStringElement(serialDesc, 2, self.alternateLabel);
        output.encodeBooleanElement(serialDesc, 3, self.zipCodeRequired);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExistingLabel() {
        return this.existingLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAlternateLabel() {
        return this.alternateLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getZipCodeRequired() {
        return this.zipCodeRequired;
    }

    public final CheckoutPaymentOptionsModel copy(String title, String existingLabel, String alternateLabel, boolean zipCodeRequired) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(alternateLabel, "alternateLabel");
        return new CheckoutPaymentOptionsModel(title, existingLabel, alternateLabel, zipCodeRequired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutPaymentOptionsModel)) {
            return false;
        }
        CheckoutPaymentOptionsModel checkoutPaymentOptionsModel = (CheckoutPaymentOptionsModel) other;
        return AbstractC22676k.m65745e(this.title, checkoutPaymentOptionsModel.title) && AbstractC22676k.m65745e(this.existingLabel, checkoutPaymentOptionsModel.existingLabel) && AbstractC22676k.m65745e(this.alternateLabel, checkoutPaymentOptionsModel.alternateLabel) && this.zipCodeRequired == checkoutPaymentOptionsModel.zipCodeRequired;
    }

    public final String getAlternateLabel() {
        return this.alternateLabel;
    }

    public final String getExistingLabel() {
        return this.existingLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getZipCodeRequired() {
        return this.zipCodeRequired;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.existingLabel;
        return Boolean.hashCode(this.zipCodeRequired) + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.alternateLabel);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.existingLabel;
        return AbstractC21702c.m61137h(AbstractC11895b.m32001t("CheckoutPaymentOptionsModel(title=", str, ", existingLabel=", str2, ", alternateLabel="), this.alternateLabel, ", zipCodeRequired=", this.zipCodeRequired, ")");
    }

    public CheckoutPaymentOptionsModel(String title, String str, String alternateLabel, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(alternateLabel, "alternateLabel");
        this.title = title;
        this.existingLabel = str;
        this.alternateLabel = alternateLabel;
        this.zipCodeRequired = z4;
    }
}
