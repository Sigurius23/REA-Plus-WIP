package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/CountryModel;", "", "", "alpha2", "alpha3", "region", "phoneCountryCode", "countryFlag", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CountryModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/CountryModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAlpha2", "getAlpha3", "getRegion", "getPhoneCountryCode", "getCountryFlag", "getName", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CountryModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String alpha2;
    private final String alpha3;
    private final String countryFlag;
    private final String name;
    private final String phoneCountryCode;
    private final String region;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CountryModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CountryModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CountryModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CountryModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, CountryModel$$serializer.INSTANCE.getDescriptor());
        }
        this.alpha2 = str;
        this.alpha3 = str2;
        this.region = str3;
        this.phoneCountryCode = str4;
        this.countryFlag = str5;
        this.name = str6;
    }

    public static /* synthetic */ CountryModel copy$default(CountryModel countryModel, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = countryModel.alpha2;
        }
        if ((i13 & 2) != 0) {
            str2 = countryModel.alpha3;
        }
        if ((i13 & 4) != 0) {
            str3 = countryModel.region;
        }
        if ((i13 & 8) != 0) {
            str4 = countryModel.phoneCountryCode;
        }
        if ((i13 & 16) != 0) {
            str5 = countryModel.countryFlag;
        }
        if ((i13 & 32) != 0) {
            str6 = countryModel.name;
        }
        String str7 = str5;
        String str8 = str6;
        return countryModel.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CountryModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.alpha2);
        output.encodeStringElement(serialDesc, 1, self.alpha3);
        output.encodeStringElement(serialDesc, 2, self.region);
        output.encodeStringElement(serialDesc, 3, self.phoneCountryCode);
        output.encodeStringElement(serialDesc, 4, self.countryFlag);
        output.encodeStringElement(serialDesc, 5, self.name);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlpha2() {
        return this.alpha2;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlpha3() {
        return this.alpha3;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountryFlag() {
        return this.countryFlag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final CountryModel copy(String alpha2, String alpha3, String region, String phoneCountryCode, String countryFlag, String name) {
        AbstractC22676k.m65750j(alpha2, "alpha2");
        AbstractC22676k.m65750j(alpha3, "alpha3");
        AbstractC22676k.m65750j(region, "region");
        AbstractC22676k.m65750j(phoneCountryCode, "phoneCountryCode");
        AbstractC22676k.m65750j(countryFlag, "countryFlag");
        AbstractC22676k.m65750j(name, "name");
        return new CountryModel(alpha2, alpha3, region, phoneCountryCode, countryFlag, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryModel)) {
            return false;
        }
        CountryModel countryModel = (CountryModel) other;
        return AbstractC22676k.m65745e(this.alpha2, countryModel.alpha2) && AbstractC22676k.m65745e(this.alpha3, countryModel.alpha3) && AbstractC22676k.m65745e(this.region, countryModel.region) && AbstractC22676k.m65745e(this.phoneCountryCode, countryModel.phoneCountryCode) && AbstractC22676k.m65745e(this.countryFlag, countryModel.countryFlag) && AbstractC22676k.m65745e(this.name, countryModel.name);
    }

    public final String getAlpha2() {
        return this.alpha2;
    }

    public final String getAlpha3() {
        return this.alpha3;
    }

    public final String getCountryFlag() {
        return this.countryFlag;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return this.name.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.alpha2.hashCode() * 31, 31, this.alpha3), 31, this.region), 31, this.phoneCountryCode), 31, this.countryFlag);
    }

    public String toString() {
        String str = this.alpha2;
        String str2 = this.alpha3;
        String str3 = this.region;
        String str4 = this.phoneCountryCode;
        String str5 = this.countryFlag;
        String str6 = this.name;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CountryModel(alpha2=", str, ", alpha3=", str2, ", region=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", phoneCountryCode=", str4, ", countryFlag=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", name=", str6, ")");
    }

    public CountryModel(String alpha2, String alpha3, String region, String phoneCountryCode, String countryFlag, String name) {
        AbstractC22676k.m65750j(alpha2, "alpha2");
        AbstractC22676k.m65750j(alpha3, "alpha3");
        AbstractC22676k.m65750j(region, "region");
        AbstractC22676k.m65750j(phoneCountryCode, "phoneCountryCode");
        AbstractC22676k.m65750j(countryFlag, "countryFlag");
        AbstractC22676k.m65750j(name, "name");
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.region = region;
        this.phoneCountryCode = phoneCountryCode;
        this.countryFlag = countryFlag;
        this.name = name;
    }
}
