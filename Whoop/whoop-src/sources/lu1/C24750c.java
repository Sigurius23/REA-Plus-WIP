package lu1;

import java.util.Map;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lu1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Llu1/c;", "", "", "label", "category", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C24750c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, String> otherProperties;

    public C24750c(String label, String category, Map<String, String> map) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(category, "category");
        this.label = label;
        this.category = category;
        this.otherProperties = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, String> m72477c() {
        return this.otherProperties;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24750c)) {
            return false;
        }
        C24750c c24750c = (C24750c) other;
        return AbstractC22676k.m65745e(this.label, c24750c.label) && AbstractC22676k.m65745e(this.category, c24750c.category) && AbstractC22676k.m65745e(this.otherProperties, c24750c.otherProperties);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.category);
        Map<String, String> map = this.otherProperties;
        return iM30450d + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        String str = this.label;
        String str2 = this.category;
        return AbstractC13673n.m38565l(AbstractC11895b.m32001t("ScrubEventData(label=", str, ", category=", str2, ", otherProperties="), this.otherProperties, ")");
    }

    public /* synthetic */ C24750c(String str, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : map);
    }
}
