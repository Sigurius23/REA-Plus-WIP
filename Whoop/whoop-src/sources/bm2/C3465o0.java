package bm2;

import com.whoop.design.util.TextResource;
import hy0.C17731c2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: bm2.o0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lbm2/o0;", "", "Lcom/whoop/design/util/TextResource;", "statPrimaryDisplay", "statSecondaryDisplay", "Lhy0/c2;", "trendViewState", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lhy0/c2;", "()Lhy0/c2;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3465o0 {

    /* JADX INFO: renamed from: d */
    public static final int f13586d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource statPrimaryDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource statSecondaryDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17731c2 trendViewState;

    static {
        int i13 = C17731c2.f68917p;
        int i14 = TextResource.$stable;
        f13586d = i13 | i14 | i14;
    }

    public C3465o0(TextResource statPrimaryDisplay, TextResource statSecondaryDisplay, C17731c2 trendViewState) {
        AbstractC22676k.m65750j(statPrimaryDisplay, "statPrimaryDisplay");
        AbstractC22676k.m65750j(statSecondaryDisplay, "statSecondaryDisplay");
        AbstractC22676k.m65750j(trendViewState, "trendViewState");
        this.statPrimaryDisplay = statPrimaryDisplay;
        this.statSecondaryDisplay = statSecondaryDisplay;
        this.trendViewState = trendViewState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getStatPrimaryDisplay() {
        return this.statPrimaryDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getStatSecondaryDisplay() {
        return this.statSecondaryDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17731c2 getTrendViewState() {
        return this.trendViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3465o0)) {
            return false;
        }
        C3465o0 c3465o0 = (C3465o0) other;
        return AbstractC22676k.m65745e(this.statPrimaryDisplay, c3465o0.statPrimaryDisplay) && AbstractC22676k.m65745e(this.statSecondaryDisplay, c3465o0.statSecondaryDisplay) && AbstractC22676k.m65745e(this.trendViewState, c3465o0.trendViewState);
    }

    public int hashCode() {
        return this.trendViewState.hashCode() + AbstractC31061c.m95625a(this.statPrimaryDisplay.hashCode() * 31, this.statSecondaryDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.statPrimaryDisplay;
        TextResource textResource2 = this.statSecondaryDisplay;
        C17731c2 c17731c2 = this.trendViewState;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SegmentalAnalysisTrendStatViewState(statPrimaryDisplay=", textResource, ", statSecondaryDisplay=", textResource2, ", trendViewState=");
        sbM106658q.append(c17731c2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
