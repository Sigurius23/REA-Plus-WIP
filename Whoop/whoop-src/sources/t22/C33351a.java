package t22;

import java.util.Map;
import m83.C25272z;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t22.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lt22/a;", "", "", "source", "", "analyticsProperties", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/util/Map;)Lt22/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33351a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, String> analyticsProperties;

    public C33351a(String source, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        this.source = source;
        this.analyticsProperties = analyticsProperties;
    }

    /* JADX INFO: renamed from: a */
    public final C33351a m105771a(String source, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        return new C33351a(source, analyticsProperties);
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m105772b() {
        return this.analyticsProperties;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33351a)) {
            return false;
        }
        C33351a c33351a = (C33351a) other;
        return AbstractC22676k.m65745e(this.source, c33351a.source) && AbstractC22676k.m65745e(this.analyticsProperties, c33351a.analyticsProperties);
    }

    public int hashCode() {
        return this.analyticsProperties.hashCode() + (this.source.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114680h("PaymentMethodManagementAnalyticsContext(source=", this.source, ", analyticsProperties=", ")", this.analyticsProperties);
    }

    public /* synthetic */ C33351a(String str, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }
}
