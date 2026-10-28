package rk1;

import i91.AbstractC18249c;
import j71.AbstractC21394b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k61.C22230c;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import u61.C34552a;
import u61.C34556e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rk1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "", "samples", "", "lowest", "highest", "Lj71/b$g;", "a", "(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;)Lj71/b$g;", "heart-health-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31495b {

    /* JADX INFO: renamed from: rk1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f129923w = new a();

        /* JADX INFO: renamed from: a */
        public final long m97035a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m97035a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC21394b.g m97033a(List<Double> samples, Float f13, Float f14) {
        float fFloatValue;
        Double dValueOf;
        float fFloatValue2;
        AbstractC22676k.m65750j(samples, "samples");
        if (samples.isEmpty()) {
            return new AbstractC21394b.g(null, "ecg-empty", true, null, null, false, 57, null);
        }
        if (f14 != null) {
            fFloatValue = f14.floatValue();
        } else {
            Double dM74116T0 = AbstractC25265s.m74116T0(samples);
            Float fValueOf = dM74116T0 != null ? Float.valueOf((float) dM74116T0.doubleValue()) : null;
            if (fValueOf == null) {
                throw new IllegalStateException("unreachable code");
            }
            fFloatValue = fValueOf.floatValue();
        }
        if (f13 != null) {
            fFloatValue2 = f13.floatValue();
        } else {
            Iterator<T> it = samples.iterator();
            if (it.hasNext()) {
                double dDoubleValue = ((Number) it.next()).doubleValue();
                while (it.hasNext()) {
                    dDoubleValue = Math.min(dDoubleValue, ((Number) it.next()).doubleValue());
                }
                dValueOf = Double.valueOf(dDoubleValue);
            } else {
                dValueOf = null;
            }
            Float fValueOf2 = dValueOf != null ? Float.valueOf((float) dValueOf.doubleValue()) : null;
            if (fValueOf2 == null) {
                throw new IllegalStateException("unreachable code");
            }
            fFloatValue2 = fValueOf2.floatValue();
        }
        float f15 = fFloatValue == fFloatValue2 ? 1.0f : fFloatValue - fFloatValue2;
        List<Double> list = samples;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new C34556e(i13 / samples.size(), (((float) ((Number) obj).doubleValue()) - fFloatValue2) / f15, null, null, null, null, 60, null));
            i13 = i14;
        }
        return new AbstractC21394b.g(AbstractC37056f.m118958J(new C34552a(arrayList, null, new C22230c((float) 1.5d, 0, 0, AbstractC18249c.m52574l(a.f129923w), 0L, false, 54, null), null, 10, null)), "labrador-" + f15, true, null, null, false, 56, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC21394b.g m97034b(List list, Float f13, Float f14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = null;
        }
        if ((i13 & 4) != 0) {
            f14 = null;
        }
        return m97033a(list, f13, f14);
    }
}
