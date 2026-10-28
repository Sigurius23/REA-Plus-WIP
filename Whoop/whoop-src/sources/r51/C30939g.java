package r51;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r51.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, m65681d2 = {"Lr51/g;", "", "", "alpha2", "alpha3", "region", "phoneCountryCode", "countryFlag", "Lcom/whoop/design/util/TextResource;", "countryName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "getRegion", "d", "getPhoneCountryCode", "e", "f", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30939g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String alpha2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String alpha3;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String region;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String phoneCountryCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String countryFlag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource countryName;

    public C30939g(String alpha2, String alpha3, String region, String phoneCountryCode, String countryFlag, TextResource countryName) {
        AbstractC22676k.m65750j(alpha2, "alpha2");
        AbstractC22676k.m65750j(alpha3, "alpha3");
        AbstractC22676k.m65750j(region, "region");
        AbstractC22676k.m65750j(phoneCountryCode, "phoneCountryCode");
        AbstractC22676k.m65750j(countryFlag, "countryFlag");
        AbstractC22676k.m65750j(countryName, "countryName");
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.region = region;
        this.phoneCountryCode = phoneCountryCode;
        this.countryFlag = countryFlag;
        this.countryName = countryName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlpha2() {
        return this.alpha2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAlpha3() {
        return this.alpha3;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCountryFlag() {
        return this.countryFlag;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getCountryName() {
        return this.countryName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30939g)) {
            return false;
        }
        C30939g c30939g = (C30939g) other;
        return AbstractC22676k.m65745e(this.alpha2, c30939g.alpha2) && AbstractC22676k.m65745e(this.alpha3, c30939g.alpha3) && AbstractC22676k.m65745e(this.region, c30939g.region) && AbstractC22676k.m65745e(this.phoneCountryCode, c30939g.phoneCountryCode) && AbstractC22676k.m65745e(this.countryFlag, c30939g.countryFlag) && AbstractC22676k.m65745e(this.countryName, c30939g.countryName);
    }

    public int hashCode() {
        return this.countryName.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.alpha2.hashCode() * 31, 31, this.alpha3), 31, this.region), 31, this.phoneCountryCode), 31, this.countryFlag);
    }

    public String toString() {
        String str = this.alpha2;
        String str2 = this.alpha3;
        String str3 = this.region;
        String str4 = this.phoneCountryCode;
        String str5 = this.countryFlag;
        TextResource textResource = this.countryName;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CountryViewState(alpha2=", str, ", alpha3=", str2, ", region=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", phoneCountryCode=", str4, ", countryFlag=");
        sbM32001t.append(str5);
        sbM32001t.append(", countryName=");
        sbM32001t.append(textResource);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
