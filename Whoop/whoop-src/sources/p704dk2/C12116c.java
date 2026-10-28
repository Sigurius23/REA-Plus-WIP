package p704dk2;

import h71.C16995l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dk2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m65681d2 = {"Ldk2/c;", "", "Lh71/l;", "state", "<init>", "(Lh71/l;)V", "", "a", "()F", "Lh71/l;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12116c {

    /* JADX INFO: renamed from: b */
    public static final int f40334b = C16995l.f65298f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16995l state;

    public C12116c(C16995l state) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
    }

    /* JADX INFO: renamed from: a */
    public final float m33497a() {
        C16995l c16995l = this.state;
        Float positionOfX = c16995l.getDataScrubEvent().getPositionOfX();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c16995l.getGraphScrollPosition().getPosition() >> 32));
        float startGraphPadding = this.state.getStartGraphPadding();
        float fFloatValue = positionOfX != null ? positionOfX.floatValue() - fIntBitsToFloat : 0.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c16995l.getGraphScrollPosition().getScrollViewSize() >> 32));
        float startVerticalAxisSize = c16995l.getStartVerticalAxisSize();
        return (((fFloatValue + startGraphPadding) / ((1.0f + startVerticalAxisSize) * fIntBitsToFloat2)) + startVerticalAxisSize) * 0.85f;
    }
}
