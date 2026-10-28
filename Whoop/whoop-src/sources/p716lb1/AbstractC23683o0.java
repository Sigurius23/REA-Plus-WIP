package p716lb1;

import com.whoop.design.models.ComparisonSegmentStyle;
import com.whoop.design.models.SegmentModel;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import y11.InterfaceC39052e;

/* JADX INFO: renamed from: lb1.o0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/SegmentModel;", "segment", "Ly11/e;", "a", "(Lcom/whoop/design/models/SegmentModel;)Ly11/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23683o0 {

    /* JADX INFO: renamed from: lb1.o0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93893a;

        static {
            int[] iArr = new int[ComparisonSegmentStyle.values().length];
            try {
                iArr[ComparisonSegmentStyle.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComparisonSegmentStyle.ASLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComparisonSegmentStyle.SLEEP_DEBT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComparisonSegmentStyle.HEALTHY_MIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ComparisonSegmentStyle.RECENT_STRAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ComparisonSegmentStyle.STRIPES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f93893a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39052e m69173a(SegmentModel segment) {
        ComparisonSegmentStyle comparisonSegmentStyle;
        AbstractC22676k.m65750j(segment, "segment");
        String style = segment.getStyle();
        ComparisonSegmentStyle comparisonSegmentStyle2 = ComparisonSegmentStyle.STRIPES;
        ComparisonSegmentStyle[] comparisonSegmentStyleArrValues = ComparisonSegmentStyle.values();
        int length = comparisonSegmentStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                comparisonSegmentStyle = null;
                break;
            }
            comparisonSegmentStyle = comparisonSegmentStyleArrValues[i13];
            if (AbstractC22676k.m65745e(comparisonSegmentStyle.name(), style)) {
                break;
            }
            i13++;
        }
        if (comparisonSegmentStyle != null) {
            comparisonSegmentStyle2 = comparisonSegmentStyle;
        }
        switch (a.f93893a[comparisonSegmentStyle2.ordinal()]) {
            case 1:
                return new InterfaceC39052e.a(EnumC39333f.SLEEP_AWAKE, segment.getFillPercent());
            case 2:
                return new InterfaceC39052e.a(EnumC39333f.SLEEP, segment.getFillPercent());
            case 3:
                return new InterfaceC39052e.a(EnumC39333f.WHITE_50, segment.getFillPercent());
            case 4:
                return new InterfaceC39052e.a(EnumC39333f.WHITE_20, segment.getFillPercent());
            case 5:
                return new InterfaceC39052e.a(EnumC39333f.STRAIN, segment.getFillPercent());
            case 6:
                return new InterfaceC39052e.b(EnumC39333f.BRAND_WHITE, segment.getFillPercent());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
