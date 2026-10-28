package dc1;

import com.whoop.design.models.items.graph.plot.line.PointSize;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dc1.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/PointSize;", "Ly3/f;", "a", "(Lcom/whoop/design/models/items/graph/plot/line/PointSize;)F", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11913j {

    /* JADX INFO: renamed from: dc1.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38978a;

        static {
            int[] iArr = new int[PointSize.values().length];
            try {
                iArr[PointSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointSize.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointSize.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38978a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final float m32175a(PointSize pointSize) {
        int i13;
        AbstractC22676k.m65750j(pointSize, "<this>");
        int i14 = a.f38978a[pointSize.ordinal()];
        if (i14 == 1) {
            i13 = 4;
        } else if (i14 == 2) {
            i13 = 8;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 12;
        }
        return i13;
    }
}
