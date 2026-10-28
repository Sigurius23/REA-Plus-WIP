package zb1;

import com.whoop.design.models.items.graph.plot.bar.BarWidth;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zb1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;", "", "a", "(Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;)F", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40259c {

    /* JADX INFO: renamed from: zb1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f174161a;

        static {
            int[] iArr = new int[BarWidth.values().length];
            try {
                iArr[BarWidth.NARROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarWidth.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarWidth.WIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f174161a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final float m129302a(BarWidth barWidth) {
        AbstractC22676k.m65750j(barWidth, "<this>");
        int i13 = a.f174161a[barWidth.ordinal()];
        if (i13 == 1) {
            return 0.04f;
        }
        if (i13 == 2) {
            return 0.08f;
        }
        if (i13 == 3) {
            return 0.16f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
