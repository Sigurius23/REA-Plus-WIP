package vb1;

import com.whoop.design.models.items.graph.LegendShape;
import n21.EnumC26195i;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vb1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/LegendShape;", "Ln21/i;", "a", "(Lcom/whoop/design/models/items/graph/LegendShape;)Ln21/i;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35870c {

    /* JADX INFO: renamed from: vb1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f152710a;

        static {
            int[] iArr = new int[LegendShape.values().length];
            try {
                iArr[LegendShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegendShape.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegendShape.ROUNDED_SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LegendShape.CAPSULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LegendShape.DASHED_LINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LegendShape.DOTTED_LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LegendShape.DASHED_CIRCLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f152710a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC26195i m113889a(LegendShape legendShape) {
        AbstractC22676k.m65750j(legendShape, "<this>");
        switch (a.f152710a[legendShape.ordinal()]) {
            case 1:
                return EnumC26195i.CIRCLE;
            case 2:
                return EnumC26195i.SQUARE;
            case 3:
                return EnumC26195i.SQUARE_WITH_CORNERS;
            case 4:
                return EnumC26195i.CAPSULE;
            case 5:
                return EnumC26195i.DASHED_LINE;
            case 6:
                return EnumC26195i.DASHED_LINE;
            case 7:
                return EnumC26195i.DASHED_CIRCLE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
