package d51;

import java.util.List;
import m83.AbstractC25265s;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.InterfaceC17910s0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d51.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Ld51/a;", "", "a", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11713a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d51.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ld51/a$a;", "", "<init>", "()V", "", "", "transformations", "", "widthPx", "heightPx", "radiusPx", "Li2/s0;", "c", "(Ljava/util/List;III)Li2/s0;", "segmentCount", "", "d", "(I)D", "arcIndex", "Ld51/f;", "center", "a", "(IIILd51/f;Ljava/util/List;)Ld51/f;", "arcPoint", "tangentCoefficient", "Ld51/c;", "b", "(Ld51/f;Ld51/f;D)Ld51/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C11718f m31295a(int arcIndex, int segmentCount, int radiusPx, C11718f center, List<Float> transformations) {
            AbstractC22676k.m65750j(center, "center");
            AbstractC22676k.m65750j(transformations, "transformations");
            double d3 = ((((double) arcIndex) * 3.141592653589793d) * ((double) 2)) / ((double) segmentCount);
            double d14 = radiusPx;
            C11718f c11718fM31322g = center.m31322g(new C11718f(Math.sin(d3) * d14, Math.cos(d3) * d14));
            C11718f c11718fM31320e = c11718fM31322g.m31319d(center).m31320e();
            Float f13 = (Float) AbstractC25265s.m74102I0(arcIndex, transformations);
            return c11718fM31322g.m31322g(c11718fM31320e.m31324i((f13 == null && (f13 = (Float) AbstractC25265s.m74100H0(transformations)) == null) ? 0.0f : f13.floatValue()));
        }

        /* JADX INFO: renamed from: b */
        public final C11715c m31296b(C11718f center, C11718f arcPoint, double tangentCoefficient) {
            AbstractC22676k.m65750j(center, "center");
            AbstractC22676k.m65750j(arcPoint, "arcPoint");
            C11718f c11718fM31319d = center.m31319d(arcPoint);
            C11718f c11718fM31323h = c11718fM31319d.m31321f().m31320e().m31323h(tangentCoefficient).m31323h(c11718fM31319d.m31318c());
            return new C11715c(arcPoint.m31319d(c11718fM31323h), arcPoint.m31322g(c11718fM31323h));
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC17910s0 m31297c(List<Float> transformations, int widthPx, int heightPx, int radiusPx) {
            List<Float> transformations2 = transformations;
            AbstractC22676k.m65750j(transformations2, "transformations");
            if (transformations2.isEmpty()) {
                throw new IllegalArgumentException("transformations must not be empty");
            }
            List<Float> list = transformations2;
            double dM31298d = m31298d(list.size());
            double d3 = 2;
            C11718f c11718f = new C11718f(((double) widthPx) / d3, ((double) heightPx) / d3);
            C17891j c17891jM51478a = AbstractC17897m.m51478a();
            int size = list.size();
            if (size >= 0) {
                C11715c c11715cM31296b = null;
                int i13 = 0;
                while (true) {
                    C11715c c11715c = c11715cM31296b;
                    Companion companion = AbstractC11713a.INSTANCE;
                    C11718f c11718fM31295a = companion.m31295a(i13, list.size(), radiusPx, c11718f, transformations2);
                    c11715cM31296b = companion.m31296b(c11718f, c11718fM31295a, dM31298d);
                    if (i13 == 0) {
                        c17891jM51478a.m51462i((float) c11718fM31295a.getX(), (float) c11718fM31295a.getY());
                    } else if (c11715c != null) {
                        c17891jM51478a.f69587a.cubicTo((float) c11715c.getTrailing().getX(), (float) c11715c.getTrailing().getY(), (float) c11715cM31296b.getLeading().getX(), (float) c11715cM31296b.getLeading().getY(), (float) c11718fM31295a.getX(), (float) c11718fM31295a.getY());
                    }
                    if (i13 == size) {
                        break;
                    }
                    i13++;
                    transformations2 = transformations;
                }
            }
            c17891jM51478a.m51459f();
            return c17891jM51478a;
        }

        /* JADX INFO: renamed from: d */
        public final double m31298d(int segmentCount) {
            return Math.tan(3.141592653589793d / (((double) segmentCount) * 2.0d)) * 1.3333333333333333d;
        }

        private Companion() {
        }
    }
}
