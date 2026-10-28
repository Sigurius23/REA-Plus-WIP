package com.whoop.settings.accountheader.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JH\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, m65681d2 = {"Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;", "", "", "annualSavings", "subscriptionType", "nextBillingDate", "successText", "successSubtext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$settings_release", "(Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAnnualSavings", "getSubscriptionType", "getNextBillingDate", "getSuccessText", "getSuccessSubtext", "Companion", "$serializer", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SwitchBillingPlanResponseModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("annual_savings")
    private final String annualSavings;

    @SerializedName("next_billing_date")
    private final String nextBillingDate;

    @SerializedName("subscription_type")
    private final String subscriptionType;

    @SerializedName("success_subtext")
    private final String successSubtext;

    @SerializedName("success_text")
    private final String successText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;", "serializer", "()Lwc3/c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SwitchBillingPlanResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SwitchBillingPlanResponseModel(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SwitchBillingPlanResponseModel$$serializer.INSTANCE.getDescriptor());
        }
        this.annualSavings = str;
        this.subscriptionType = str2;
        this.nextBillingDate = str3;
        this.successText = str4;
        this.successSubtext = str5;
    }

    public static /* synthetic */ SwitchBillingPlanResponseModel copy$default(SwitchBillingPlanResponseModel switchBillingPlanResponseModel, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = switchBillingPlanResponseModel.annualSavings;
        }
        if ((i13 & 2) != 0) {
            str2 = switchBillingPlanResponseModel.subscriptionType;
        }
        if ((i13 & 4) != 0) {
            str3 = switchBillingPlanResponseModel.nextBillingDate;
        }
        if ((i13 & 8) != 0) {
            str4 = switchBillingPlanResponseModel.successText;
        }
        if ((i13 & 16) != 0) {
            str5 = switchBillingPlanResponseModel.successSubtext;
        }
        String str6 = str5;
        String str7 = str3;
        return switchBillingPlanResponseModel.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$settings_release(SwitchBillingPlanResponseModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.annualSavings);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subscriptionType);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.nextBillingDate);
        output.encodeStringElement(serialDesc, 3, self.successText);
        output.encodeStringElement(serialDesc, 4, self.successSubtext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnnualSavings() {
        return this.annualSavings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextBillingDate() {
        return this.nextBillingDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSuccessText() {
        return this.successText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuccessSubtext() {
        return this.successSubtext;
    }

    public final SwitchBillingPlanResponseModel copy(String annualSavings, String subscriptionType, String nextBillingDate, String successText, String successSubtext) {
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(successSubtext, "successSubtext");
        return new SwitchBillingPlanResponseModel(annualSavings, subscriptionType, nextBillingDate, successText, successSubtext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchBillingPlanResponseModel)) {
            return false;
        }
        SwitchBillingPlanResponseModel switchBillingPlanResponseModel = (SwitchBillingPlanResponseModel) other;
        return AbstractC22676k.m65745e(this.annualSavings, switchBillingPlanResponseModel.annualSavings) && AbstractC22676k.m65745e(this.subscriptionType, switchBillingPlanResponseModel.subscriptionType) && AbstractC22676k.m65745e(this.nextBillingDate, switchBillingPlanResponseModel.nextBillingDate) && AbstractC22676k.m65745e(this.successText, switchBillingPlanResponseModel.successText) && AbstractC22676k.m65745e(this.successSubtext, switchBillingPlanResponseModel.successSubtext);
    }

    public final String getAnnualSavings() {
        return this.annualSavings;
    }

    public final String getNextBillingDate() {
        return this.nextBillingDate;
    }

    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    public final String getSuccessSubtext() {
        return this.successSubtext;
    }

    public final String getSuccessText() {
        return this.successText;
    }

    public int hashCode() {
        String str = this.annualSavings;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscriptionType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nextBillingDate;
        return this.successSubtext.hashCode() + AbstractC11266d.m30450d((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.successText);
    }

    public String toString() {
        String str = this.annualSavings;
        String str2 = this.subscriptionType;
        String str3 = this.nextBillingDate;
        String str4 = this.successText;
        String str5 = this.successSubtext;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SwitchBillingPlanResponseModel(annualSavings=", str, ", subscriptionType=", str2, ", nextBillingDate=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", successText=", str4, ", successSubtext=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public SwitchBillingPlanResponseModel(String str, String str2, String str3, String successText, String successSubtext) {
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(successSubtext, "successSubtext");
        this.annualSavings = str;
        this.subscriptionType = str2;
        this.nextBillingDate = str3;
        this.successText = successText;
        this.successSubtext = successSubtext;
    }
}
