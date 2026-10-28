package d51;

import e93.AbstractC12889b;
import i93.C18279e;
import i93.InterfaceC18280f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p077d0.AbstractC11333b0;
import p077d0.InterfaceC11419z;
import p078d1.C11456i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: d51.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\rB?\b\u0016\u0012*\u0010\u0010\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000f0\u000e\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000f\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+¨\u0006-"}, m65681d2 = {"Ld51/d;", "", "", "Ld51/b;", "animationKeys", "<init>", "(Ljava/util/List;)V", "", "start", "middleKeys", "end", "Ld0/z;", "easing", "(FLjava/util/List;FLd0/z;)V", "", "Ll83/k;", "timeValuePairs", "([Ll83/k;Ld0/z;)V", "", "t", "c", "(D)D", "d", "(F)F", "multiplier", "e", "(F)Ld51/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "sortedPairs", "Ll83/h;", "Li93/f;", "Ll83/h;", "keyRange", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11716d {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f37862e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C11714b> animationKeys;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C11714b> sortedPairs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC23462h keyRange;

    /* JADX INFO: renamed from: d51.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ld51/d$a;", "", "<init>", "()V", "", "start", "", "middleKeys", "end", "Ld0/z;", "easing", "Ld51/b;", "a", "(FLjava/util/List;FLd0/z;)Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List<C11714b> m31311a(float start, List<Float> middleKeys, float end, InterfaceC11419z easing) {
            AbstractC22676k.m65750j(middleKeys, "middleKeys");
            AbstractC22676k.m65750j(easing, "easing");
            ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1(Float.valueOf(end), AbstractC25265s.m74129g1(AbstractC37056f.m118958J(Float.valueOf(start)), middleKeys));
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM74128f1, 10));
            int i13 = 0;
            for (Object obj : arrayListM74128f1) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                arrayList.add(new C11714b(i13 / (arrayListM74128f1.size() - 1), ((Number) obj).floatValue(), easing));
                i13 = i14;
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: d51.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Float.valueOf(((C11714b) t14).getTime()), Float.valueOf(((C11714b) t15).getTime()));
        }
    }

    public C11716d(List<C11714b> animationKeys) {
        AbstractC22676k.m65750j(animationKeys, "animationKeys");
        this.animationKeys = animationKeys;
        this.sortedPairs = AbstractC25265s.m74152u1(animationKeys, new b());
        this.keyRange = AbstractC30060g.m92088H(new C11456i(this, 6));
        if (animationKeys.size() < 2) {
            throw new IllegalArgumentException("At least two time-value pairs are required for interpolation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC18280f m31307b(C11716d c11716d) {
        List<C11714b> list = c11716d.sortedPairs;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((C11714b) it.next()).getTime()));
        }
        return new C18279e(((Number) AbstractC25265s.m74096F0(arrayList)).floatValue(), ((Number) AbstractC25265s.m74112P0(arrayList)).floatValue());
    }

    /* JADX INFO: renamed from: c */
    public final double m31308c(double t14) {
        double dDoubleValue = ((Number) ((InterfaceC18280f) this.keyRange.getValue()).getStart()).doubleValue() + (AbstractC12889b.m36282l(t14, 0.0d, 1.0d) * ((double) (((Number) ((InterfaceC18280f) this.keyRange.getValue()).mo52651d()).floatValue() - ((Number) ((InterfaceC18280f) this.keyRange.getValue()).getStart()).floatValue())));
        C11714b c11714b = (C11714b) AbstractC25265s.m74096F0(this.sortedPairs);
        C11714b c11714b2 = (C11714b) AbstractC25265s.m74112P0(this.sortedPairs);
        int size = this.sortedPairs.size() - 1;
        int i13 = 0;
        while (i13 < size) {
            C11714b c11714b3 = this.sortedPairs.get(i13);
            i13++;
            C11714b c11714b4 = this.sortedPairs.get(i13);
            float time = c11714b3.getTime();
            if (dDoubleValue <= c11714b4.getTime() && time <= dDoubleValue) {
                c11714b = c11714b3;
                c11714b2 = c11714b4;
            }
        }
        return (c11714b2.getEasing().mo7226i((float) ((dDoubleValue - ((double) c11714b.getTime())) / ((double) Math.abs(c11714b2.getTime() - c11714b.getTime())))) * ((double) (c11714b2.getValue() - c11714b.getValue()))) + ((double) c11714b.getValue());
    }

    /* JADX INFO: renamed from: d */
    public final float m31309d(float t14) {
        return (float) m31308c(t14);
    }

    /* JADX INFO: renamed from: e */
    public final C11716d m31310e(float multiplier) {
        List<C11714b> list = this.animationKeys;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C11714b c11714b : list) {
            arrayList.add(C11714b.m31299b(c11714b, 0.0f, c11714b.getValue() * multiplier, null, 5, null));
        }
        return new C11716d(arrayList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C11716d) && AbstractC22676k.m65745e(this.animationKeys, ((C11716d) other).animationKeys);
    }

    public int hashCode() {
        return this.animationKeys.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("KeyedRange(animationKeys=", ")", this.animationKeys);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11716d(float f13, List<Float> middleKeys, float f14, InterfaceC11419z easing) {
        this(INSTANCE.m31311a(f13, middleKeys, f14, easing));
        AbstractC22676k.m65750j(middleKeys, "middleKeys");
        AbstractC22676k.m65750j(easing, "easing");
    }

    public C11716d(float f13, List list, float f14, InterfaceC11419z interfaceC11419z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, (List<Float>) list, f14, (i13 & 8) != 0 ? AbstractC11333b0.f36312c : interfaceC11419z);
    }

    public C11716d(C23465k[] c23465kArr, InterfaceC11419z interfaceC11419z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c23465kArr, (i13 & 2) != 0 ? AbstractC11333b0.f36312c : interfaceC11419z);
    }

    public C11716d(C23465k[] timeValuePairs, InterfaceC11419z easing) {
        AbstractC22676k.m65750j(timeValuePairs, "timeValuePairs");
        AbstractC22676k.m65750j(easing, "easing");
        ArrayList arrayList = new ArrayList(timeValuePairs.length);
        for (C23465k c23465k : timeValuePairs) {
            arrayList.add(new C11714b(((Number) c23465k.f92937w).floatValue(), ((Number) c23465k.f92938x).floatValue(), easing));
        }
        this(arrayList);
    }
}
