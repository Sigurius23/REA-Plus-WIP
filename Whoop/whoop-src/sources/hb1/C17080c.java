package hb1;

import iy1.InterfaceC21030c;
import jy1.C22047a;
import p000.AbstractC11266d;
import p636y3.C39169a;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: hb1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Lhb1/c;", "", "", "path", "Liy1/c;", "metricWriter", "<init>", "(Ljava/lang/String;Liy1/c;)V", "Ly3/a;", "constraints", "", "naturalHeightPx", "naturalWidthPx", "Ly3/c;", "density", "a", "(JIILy3/c;)Ljava/lang/String;", "direction", "Ll83/a0;", "b", "(Ljava/lang/String;)V", "Ljava/lang/String;", "Liy1/c;", "", "c", "Z", "hasEmitted", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17080c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f65635e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasEmitted;

    /* JADX INFO: renamed from: hb1.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lhb1/c$a;", "", "<init>", "()V", "Ly3/f;", "maxHeight", "maxWidth", "contentHeightDp", "contentWidthDp", "", "a", "(FFFF)Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m48208a(float maxHeight, float maxWidth, float contentHeightDp, float contentWidthDp) {
            boolean z4 = false;
            boolean z13 = Math.abs(maxHeight) <= Float.MAX_VALUE && Float.compare(contentHeightDp, maxHeight) > 0;
            if (Math.abs(maxWidth) <= Float.MAX_VALUE && Float.compare(contentWidthDp, maxWidth) > 0) {
                z4 = true;
            }
            if (z13 && z4) {
                return "both";
            }
            if (z13) {
                return "vertical";
            }
            if (z4) {
                return "horizontal";
            }
            return null;
        }

        private Companion() {
        }
    }

    public C17080c(String path, InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.path = path;
        this.metricWriter = metricWriter;
    }

    /* JADX INFO: renamed from: a */
    public final String m48206a(long constraints, int naturalHeightPx, int naturalWidthPx, InterfaceC39171c density) {
        AbstractC22676k.m65750j(density, "density");
        return INSTANCE.m48208a(C39169a.m124760d(constraints) ? density.mo733e0(C39169a.m124764h(constraints)) : Float.POSITIVE_INFINITY, C39169a.m124761e(constraints) ? density.mo733e0(C39169a.m124765i(constraints)) : Float.POSITIVE_INFINITY, density.mo733e0(naturalHeightPx), density.mo733e0(naturalWidthPx));
    }

    /* JADX INFO: renamed from: b */
    public final void m48207b(String direction) {
        AbstractC22676k.m65750j(direction, "direction");
        if (this.hasEmitted) {
            return;
        }
        this.hasEmitted = true;
        this.metricWriter.mo58701b(new C22047a(0, "nested_bff.layout_overflow", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("path:", this.path), "overflow_direction:".concat(direction)), null, 21, null));
    }
}
