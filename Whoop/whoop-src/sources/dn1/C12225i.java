package dn1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dn1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Ldn1/i;", "", "Ldn1/h;", "selectedIndex", "", "selectedMetricType", "<init>", "(Ldn1/h;Ljava/lang/String;)V", "a", "(Ldn1/h;Ljava/lang/String;)Ldn1/i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ldn1/h;", "c", "()Ldn1/h;", "b", "Ljava/lang/String;", "d", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12225i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC12224h selectedIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedMetricType;

    public C12225i(EnumC12224h selectedIndex, String selectedMetricType) {
        AbstractC22676k.m65750j(selectedIndex, "selectedIndex");
        AbstractC22676k.m65750j(selectedMetricType, "selectedMetricType");
        this.selectedIndex = selectedIndex;
        this.selectedMetricType = selectedMetricType;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12225i m33961b(C12225i c12225i, EnumC12224h enumC12224h, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC12224h = c12225i.selectedIndex;
        }
        if ((i13 & 2) != 0) {
            str = c12225i.selectedMetricType;
        }
        return c12225i.m33962a(enumC12224h, str);
    }

    /* JADX INFO: renamed from: a */
    public final C12225i m33962a(EnumC12224h selectedIndex, String selectedMetricType) {
        AbstractC22676k.m65750j(selectedIndex, "selectedIndex");
        AbstractC22676k.m65750j(selectedMetricType, "selectedMetricType");
        return new C12225i(selectedIndex, selectedMetricType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC12224h getSelectedIndex() {
        return this.selectedIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSelectedMetricType() {
        return this.selectedMetricType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12225i)) {
            return false;
        }
        C12225i c12225i = (C12225i) other;
        return this.selectedIndex == c12225i.selectedIndex && AbstractC22676k.m65745e(this.selectedMetricType, c12225i.selectedMetricType);
    }

    public int hashCode() {
        return this.selectedMetricType.hashCode() + (this.selectedIndex.hashCode() * 31);
    }

    public String toString() {
        return "SelectedValue(selectedIndex=" + this.selectedIndex + ", selectedMetricType=" + this.selectedMetricType + ")";
    }
}
