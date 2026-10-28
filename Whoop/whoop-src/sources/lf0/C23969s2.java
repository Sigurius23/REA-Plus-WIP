package lf0;

import hy0.C17731c2;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf0.s2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0019"}, m65681d2 = {"Llf0/s2;", "", "", "id", "Lhy0/c2;", "trend", "text", "<init>", "(Ljava/lang/String;Lhy0/c2;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lhy0/c2;", "()Lhy0/c2;", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23969s2 {

    /* JADX INFO: renamed from: d */
    public static final int f94656d = C17731c2.f68917p;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17731c2 trend;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String text;

    public C23969s2(String id4, C17731c2 trend, String text) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(trend, "trend");
        AbstractC22676k.m65750j(text, "text");
        this.id = id4;
        this.trend = trend;
        this.text = text;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23969s2)) {
            return false;
        }
        C23969s2 c23969s2 = (C23969s2) other;
        return AbstractC22676k.m65745e(this.id, c23969s2.id) && AbstractC22676k.m65745e(this.trend, c23969s2.trend) && AbstractC22676k.m65745e(this.text, c23969s2.text);
    }

    public int hashCode() {
        return this.text.hashCode() + ((this.trend.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.id;
        C17731c2 c17731c2 = this.trend;
        String str2 = this.text;
        StringBuilder sb4 = new StringBuilder("WhatsIncludedItemViewState(id=");
        sb4.append(str);
        sb4.append(", trend=");
        sb4.append(c17731c2);
        sb4.append(", text=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
