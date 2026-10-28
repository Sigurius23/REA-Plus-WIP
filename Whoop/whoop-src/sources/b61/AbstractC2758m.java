package b61;

import com.whoop.design.models.items.graph.LayoutDirection;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b61.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/LayoutDirection;", "Ly3/m;", "a", "(Lcom/whoop/design/models/items/graph/LayoutDirection;)Ly3/m;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2758m {

    /* JADX INFO: renamed from: b61.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10839a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.RIGHT_TO_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10839a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC39181m m7811a(LayoutDirection layoutDirection) {
        AbstractC22676k.m65750j(layoutDirection, "<this>");
        int i13 = a.f10839a[layoutDirection.ordinal()];
        if (i13 == 1) {
            return EnumC39181m.f168423w;
        }
        if (i13 == 2) {
            return EnumC39181m.f168424x;
        }
        throw new NoWhenBranchMatchedException();
    }
}
