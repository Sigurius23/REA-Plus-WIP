package jh1;

import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: jh1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJD\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ljh1/a;", "", "", "source", "giftType", "numberOfTests", "", "analyticsProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljh1/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "c", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21696a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String giftType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String numberOfTests;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, String> analyticsProperties;

    public C21696a(String source, String giftType, String numberOfTests, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(numberOfTests, "numberOfTests");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        this.source = source;
        this.giftType = giftType;
        this.numberOfTests = numberOfTests;
        this.analyticsProperties = analyticsProperties;
    }

    /* JADX INFO: renamed from: a */
    public final C21696a m61102a(String source, String giftType, String numberOfTests, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(numberOfTests, "numberOfTests");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        return new C21696a(source, giftType, numberOfTests, analyticsProperties);
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m61103b() {
        return this.analyticsProperties;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGiftType() {
        return this.giftType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNumberOfTests() {
        return this.numberOfTests;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21696a)) {
            return false;
        }
        C21696a c21696a = (C21696a) other;
        return AbstractC22676k.m65745e(this.source, c21696a.source) && AbstractC22676k.m65745e(this.giftType, c21696a.giftType) && AbstractC22676k.m65745e(this.numberOfTests, c21696a.numberOfTests) && AbstractC22676k.m65745e(this.analyticsProperties, c21696a.analyticsProperties);
    }

    public int hashCode() {
        return this.analyticsProperties.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.source.hashCode() * 31, 31, this.giftType), 31, this.numberOfTests);
    }

    public String toString() {
        String str = this.source;
        String str2 = this.giftType;
        return AbstractC30007c.m91842l(AbstractC11895b.m32001t("GiftingAnalyticsContext(source=", str, ", giftType=", str2, ", numberOfTests="), this.numberOfTests, ", analyticsProperties=", this.analyticsProperties, ")");
    }

    public /* synthetic */ C21696a(String str, String str2, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? C25272z.f99163w : map);
    }
}
