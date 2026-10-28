package bm0;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: bm0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lbm0/c;", "", "", "indicatorPosition", "Lcom/whoop/design/util/TextResource;", "title", "", "Lbm0/t;", "zones", "<init>", "(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Float;", "()Ljava/lang/Float;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/util/List;", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3400c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Float indicatorPosition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C3417t> zones;

    public C3400c(Float f13, TextResource title, List<C3417t> zones) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(zones, "zones");
        this.indicatorPosition = f13;
        this.title = title;
        this.zones = zones;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getIndicatorPosition() {
        return this.indicatorPosition;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c */
    public final List<C3417t> m9786c() {
        return this.zones;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3400c)) {
            return false;
        }
        C3400c c3400c = (C3400c) other;
        return AbstractC22676k.m65745e(this.indicatorPosition, c3400c.indicatorPosition) && AbstractC22676k.m65745e(this.title, c3400c.title) && AbstractC22676k.m65745e(this.zones, c3400c.zones);
    }

    public int hashCode() {
        Float f13 = this.indicatorPosition;
        return this.zones.hashCode() + AbstractC31061c.m95625a((f13 == null ? 0 : f13.hashCode()) * 31, this.title, 31);
    }

    public String toString() {
        Float f13 = this.indicatorPosition;
        TextResource textResource = this.title;
        List<C3417t> list = this.zones;
        StringBuilder sb4 = new StringBuilder("TargetZone(indicatorPosition=");
        sb4.append(f13);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", zones=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
