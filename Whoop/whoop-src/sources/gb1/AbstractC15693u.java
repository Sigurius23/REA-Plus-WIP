package gb1;

import java.util.ArrayList;
import java.util.List;
import l83.C23465k;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gb1.u */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0011\u001a\u00020\u000b*\u00020\u00002*\u0010\u0010\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000f0\u000e\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Li2/s;", "", "Li2/x;", "colors", "", "stops", "Li2/w0;", "tileMode", "angleInDegrees", "", "useAsCssAngle", "Li2/t;", "a", "(Li2/s;Ljava/util/List;Ljava/util/List;IFZ)Li2/t;", "", "Ll83/k;", "colorStops", "c", "(Li2/s;[Ll83/k;IFZ)Li2/t;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15693u {
    /* JADX INFO: renamed from: a */
    public static final AbstractC17911t m44154a(C17909s angledLinearGradient, List<C17919x> colors, List<Float> list, int i13, float f13, boolean z4) {
        AbstractC22676k.m65750j(angledLinearGradient, "$this$angledLinearGradient");
        AbstractC22676k.m65750j(colors, "colors");
        return new C15692t(colors, list, i13, f13, z4, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC17911t m44155b(C17909s c17909s, List list, List list2, int i13, float f13, boolean z4, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            list2 = null;
        }
        List list3 = list2;
        int i15 = (i14 & 4) != 0 ? 0 : i13;
        if ((i14 & 8) != 0) {
            f13 = 0.0f;
        }
        return m44154a(c17909s, list, list3, i15, f13, (i14 & 16) != 0 ? false : z4);
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC17911t m44156c(C17909s angledLinearGradient, C23465k[] colorStops, int i13, float f13, boolean z4) {
        AbstractC22676k.m65750j(angledLinearGradient, "$this$angledLinearGradient");
        AbstractC22676k.m65750j(colorStops, "colorStops");
        ArrayList arrayList = new ArrayList(colorStops.length);
        for (C23465k c23465k : colorStops) {
            arrayList.add(new C17919x(((C17919x) c23465k.f92938x).f69639a));
        }
        ArrayList arrayList2 = new ArrayList(colorStops.length);
        for (C23465k c23465k2 : colorStops) {
            arrayList2.add(Float.valueOf(((Number) c23465k2.f92937w).floatValue()));
        }
        return new C15692t(arrayList, arrayList2, i13, f13, z4, null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AbstractC17911t m44157d(C17909s c17909s, C23465k[] c23465kArr, int i13, float f13, boolean z4, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i14 & 8) != 0) {
            z4 = false;
        }
        return m44156c(c17909s, c23465kArr, i13, f13, z4);
    }
}
