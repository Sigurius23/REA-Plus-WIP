package dc1;

import com.whoop.design.models.items.graph.plot.line.LineWidth;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dc1.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LineWidth;", "Ly3/f;", "a", "(Lcom/whoop/design/models/items/graph/plot/line/LineWidth;)F", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11911h {

    /* JADX INFO: renamed from: dc1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38955a;

        static {
            int[] iArr = new int[LineWidth.values().length];
            try {
                iArr[LineWidth.THIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LineWidth.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LineWidth.THICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38955a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final float m32151a(LineWidth lineWidth) {
        AbstractC22676k.m65750j(lineWidth, "<this>");
        int i13 = a.f38955a[lineWidth.ordinal()];
        if (i13 == 1) {
            return 1;
        }
        if (i13 == 2) {
            return 2;
        }
        if (i13 == 3) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }
}
