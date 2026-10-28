package ny0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p747z81.Function1;

/* JADX INFO: renamed from: ny0.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0010\u000f\u000b\u0014\u0015\u0011\rB7\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\u0082\u0001\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m65681d2 = {"Lny0/q;", "", "Ly3/f;", "touchArea", "imageSize", "borderDiameter", "borderWidth", "", "isSecondary", "<init>", "(FFFFZ)V", "a", "F", "d", "()F", "b", "c", "e", "Z", "()Z", "g", "f", "Lny0/q$a;", "Lny0/q$b;", "Lny0/q$c;", "Lny0/q$d;", "Lny0/q$e;", "Lny0/q$f;", "Lny0/q$g;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27274q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float touchArea;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float imageSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float borderDiameter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float borderWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isSecondary;

    /* JADX INFO: renamed from: ny0.q$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lny0/q$a;", "Lny0/q;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC27274q {

        /* JADX INFO: renamed from: f */
        public static final a f109136f = new a();

        /* JADX INFO: renamed from: g */
        public static final int f109137g = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private a() {
            float f13 = 4;
            super(12 * f13, 7 * f13, 0.0f, 0.0f, false, 28, null);
        }
    }

    /* JADX INFO: renamed from: ny0.q$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lny0/q$b;", "Lny0/q;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC27274q {

        /* JADX INFO: renamed from: f */
        public static final b f109138f = new b();

        /* JADX INFO: renamed from: g */
        public static final int f109139g = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            float f13 = 4;
            super(8 * f13, 5 * f13, 0.0f, 0.0f, false, 28, null);
        }
    }

    /* JADX INFO: renamed from: ny0.q$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lny0/q$c;", "Lny0/q;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC27274q {

        /* JADX INFO: renamed from: f */
        public static final c f109140f = new c();

        /* JADX WARN: Illegal instructions before constructor call */
        private c() {
            float f13 = 4;
            super(6 * f13, f13 * f13, 0.0f, 0.0f, false, 28, null);
        }
    }

    /* JADX INFO: renamed from: ny0.q$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lny0/q$d;", "Lny0/q;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC27274q {

        /* JADX INFO: renamed from: f */
        public static final d f109141f = new d();

        /* JADX WARN: Illegal instructions before constructor call */
        private d() {
            float f13 = 4;
            super(5 * f13, ((float) 2.5d) * f13, f13 * f13, Function1.m128938q().getStroke2Dp().f49345a, true, null);
        }
    }

    /* JADX INFO: renamed from: ny0.q$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lny0/q$e;", "Lny0/q;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC27274q {

        /* JADX INFO: renamed from: f */
        public static final e f109142f = new e();

        /* JADX WARN: Illegal instructions before constructor call */
        private e() {
            float f13 = 4;
            super(12 * f13, 5 * f13, 9 * f13, Function1.m128938q().getStroke7Dp().f49345a, true, null);
        }
    }

    /* JADX INFO: renamed from: ny0.q$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lny0/q$f;", "Lny0/q;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC27274q {

        /* JADX INFO: renamed from: f */
        public static final f f109143f = new f();

        /* JADX WARN: Illegal instructions before constructor call */
        private f() {
            float f13 = 4;
            super(8 * f13, ((float) 4.5d) * f13, 9 * f13, Function1.m128938q().getStroke7Dp().f49345a, true, null);
        }
    }

    /* JADX INFO: renamed from: ny0.q$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lny0/q$g;", "Lny0/q;", "<init>", "()V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC27274q {

        /* JADX INFO: renamed from: f */
        public static final g f109144f = new g();

        /* JADX WARN: Illegal instructions before constructor call */
        private g() {
            float f13 = 4;
            super(6 * f13, 3 * f13, 5 * f13, Function1.m128938q().getStroke5Dp().f49345a, true, null);
        }
    }

    public /* synthetic */ AbstractC27274q(float f13, float f14, float f15, float f16, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, f16, z4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBorderDiameter() {
        return this.borderDiameter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getImageSize() {
        return this.imageSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTouchArea() {
        return this.touchArea;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSecondary() {
        return this.isSecondary;
    }

    private AbstractC27274q(float f13, float f14, float f15, float f16, boolean z4) {
        this.touchArea = f13;
        this.imageSize = f14;
        this.borderDiameter = f15;
        this.borderWidth = f16;
        this.isSecondary = z4;
    }

    public AbstractC27274q(float f13, float f14, float f15, float f16, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, (i13 & 4) != 0 ? 0 : f15, (i13 & 8) != 0 ? 0 : f16, (i13 & 16) != 0 ? false : z4, null);
    }
}
