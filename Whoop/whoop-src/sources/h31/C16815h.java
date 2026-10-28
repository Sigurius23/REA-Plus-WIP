package h31;

import androidx.compose.p018ui.Modifier;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h31.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lh31/h;", "", "Landroidx/compose/ui/Modifier;", "border", "Li2/t;", "backgroundBrush", "<init>", "(Landroidx/compose/ui/Modifier;Li2/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "b", "()Landroidx/compose/ui/Modifier;", "Li2/t;", "()Li2/t;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C16815h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Modifier border;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC17911t backgroundBrush;

    public C16815h(Modifier border, AbstractC17911t backgroundBrush) {
        AbstractC22676k.m65750j(border, "border");
        AbstractC22676k.m65750j(backgroundBrush, "backgroundBrush");
        this.border = border;
        this.backgroundBrush = backgroundBrush;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17911t getBackgroundBrush() {
        return this.backgroundBrush;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Modifier getBorder() {
        return this.border;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16815h)) {
            return false;
        }
        C16815h c16815h = (C16815h) other;
        return AbstractC22676k.m65745e(this.border, c16815h.border) && AbstractC22676k.m65745e(this.backgroundBrush, c16815h.backgroundBrush);
    }

    public int hashCode() {
        return this.backgroundBrush.hashCode() + (this.border.hashCode() * 31);
    }

    public String toString() {
        return "RecommendationTileChrome(border=" + this.border + ", backgroundBrush=" + this.backgroundBrush + ")";
    }
}
