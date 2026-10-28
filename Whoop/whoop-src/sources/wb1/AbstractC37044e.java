package wb1;

import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import g61.EnumC15531d;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import yy0.C39889c;

/* JADX INFO: renamed from: wb1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;", "axis", "Lwb1/c;", "axisPosition", "Lg61/d;", "axisType", "Ly81/e;", "labelColorOverride", "Lyy0/c;", "b", "(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lwb1/c;Lg61/d;Ly81/e;)Lyy0/c;", "", "position", "Ll83/k;", "", "d", "(DLg61/d;)Ll83/k;", "a", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37044e {

    /* JADX INFO: renamed from: wb1.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f158526a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f158527b;

        static {
            int[] iArr = new int[EnumC37042c.values().length];
            try {
                iArr[EnumC37042c.START_Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37042c.END_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37042c.BOTTOM_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC37042c.TOP_X.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f158526a = iArr;
            int[] iArr2 = new int[EnumC15531d.values().length];
            try {
                iArr2[EnumC15531d.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC15531d.TIME_MARKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC15531d.TIME_MARKER_WITHOUT_BULB.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f158527b = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final C23465k m118920a(double d3, EnumC15531d enumC15531d) {
        int i13 = a.f158527b[enumC15531d.ordinal()];
        if (i13 == 1) {
            return new C23465k(Float.valueOf(0.5f), Float.valueOf((float) d3));
        }
        if (i13 == 2 || i13 == 3) {
            return new C23465k(Float.valueOf(0.1f), Float.valueOf((float) d3));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final C39889c m118921b(AxisLabelModel axis, EnumC37042c axisPosition, EnumC15531d axisType, InterfaceC39332e interfaceC39332e) {
        C23465k c23465kM118923d;
        Float fValueOf = Float.valueOf(0.0f);
        AbstractC22676k.m65750j(axis, "axis");
        AbstractC22676k.m65750j(axisPosition, "axisPosition");
        AbstractC22676k.m65750j(axisType, "axisType");
        int i13 = a.f158526a[axisPosition.ordinal()];
        if (i13 == 1) {
            c23465kM118923d = m118923d(axis.getPosition(), axisType);
        } else if (i13 == 2) {
            c23465kM118923d = m118920a(axis.getPosition(), axisType);
        } else {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c23465kM118923d = new C23465k(Float.valueOf((float) axis.getPosition()), fValueOf);
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(axis.getLabel());
        String subLabel = axis.getSubLabel();
        TextResource textResourceM21278l2 = subLabel != null ? AbstractC8693b.m21278l(subLabel) : null;
        if (interfaceC39332e == null) {
            interfaceC39332e = AbstractC37041b.m118904a(axis.getStyle());
        }
        return new C39889c(textResourceM21278l, textResourceM21278l2, interfaceC39332e, ((Number) c23465kM118923d.f92937w).floatValue(), ((Number) c23465kM118923d.f92938x).floatValue(), axis.getIcon());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C39889c m118922c(AxisLabelModel axisLabelModel, EnumC37042c enumC37042c, EnumC15531d enumC15531d, InterfaceC39332e interfaceC39332e, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            interfaceC39332e = null;
        }
        return m118921b(axisLabelModel, enumC37042c, enumC15531d, interfaceC39332e);
    }

    /* JADX INFO: renamed from: d */
    private static final C23465k m118923d(double d3, EnumC15531d enumC15531d) {
        int i13 = a.f158527b[enumC15531d.ordinal()];
        if (i13 == 1) {
            return new C23465k(Float.valueOf(0.5f), Float.valueOf((float) d3));
        }
        if (i13 == 2 || i13 == 3) {
            return new C23465k(Float.valueOf(0.9f), Float.valueOf((float) d3));
        }
        throw new NoWhenBranchMatchedException();
    }
}
