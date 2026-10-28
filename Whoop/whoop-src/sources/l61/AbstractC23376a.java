package l61;

import a71.C0520a;
import com.whoop.design.util.AbstractC8693b;
import e61.AbstractC12766i;
import i91.AbstractC18249c;
import i93.C18284j;
import j61.C21374h;
import j71.AbstractC21394b;
import j71.C21395c;
import j71.EnumC21393a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k61.C22228a;
import k61.C22230c;
import l60.C23374a;
import l83.C23465k;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p181h2.C16618c;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l61.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lj71/c;", "c", "()Lj71/c;", "", "Ll83/k;", "", "values", "Ll61/c;", "d", "(Ljava/util/List;)Ljava/util/List;", "Lj71/b$a;", "e", "()Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23376a {

    /* JADX INFO: renamed from: l61.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f92659w = new a();

        /* JADX INFO: renamed from: a */
        public final long m67661a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m67661a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: l61.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f92660w = new b();

        /* JADX INFO: renamed from: a */
        public final long m67662a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m67662a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C21395c m67656c() {
        C21374h c21374hM35763s = AbstractC12766i.m35763s("Overview Graph", false, false, false, false, 28, null);
        return new C21395c(c21374hM35763s.m59985a((8187 & 1) != 0 ? c21374hM35763s.startVerticalAxis : null, (8187 & 2) != 0 ? c21374hM35763s.endVerticalAxis : null, (8187 & 4) != 0 ? c21374hM35763s.bottomHorizontalAxis : null, (8187 & 8) != 0 ? c21374hM35763s.topHorizontalAxis : null, (8187 & 16) != 0 ? c21374hM35763s.insets : new C16618c(0.0f, 0.025f, 0.05f, 0.04f), (8187 & 32) != 0 ? c21374hM35763s.lines : null, (8187 & 64) != 0 ? c21374hM35763s.graphAnnotations : null, (8187 & 128) != 0 ? c21374hM35763s.accessibilityState : null, (8187 & 256) != 0 ? c21374hM35763s.scrubberEnabled : false, (8187 & 512) != 0 ? c21374hM35763s.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21374hM35763s.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21374hM35763s.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? c21374hM35763s.horizontalGridLinePadding : 0.0f), m67658e(), null, null, 12, null);
    }

    /* JADX INFO: renamed from: d */
    private static final List<C23378c> m67657d(List<C23465k> list) {
        List<C23465k> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C23465k c23465k = (C23465k) obj;
            Object obj2 = c23465k.f92937w;
            Object obj3 = c23465k.f92938x;
            arrayList.add(new C23378c(AbstractC8693b.m21278l(""), i14 / 8.0f, ((Number) obj2).floatValue(), ((Number) obj3).floatValue(), new C0520a(null, null, AbstractC8693b.m21278l(c23465k.f92937w + " - " + obj3), null, null, null, null, false, null, null, null, null, 4091, null)));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    private static final List<AbstractC21394b.a> m67658e() {
        Float fValueOf = Float.valueOf(0.2f);
        C23465k c23465k = new C23465k(fValueOf, Float.valueOf(0.0f));
        Float fValueOf2 = Float.valueOf(0.3f);
        C23465k c23465k2 = new C23465k(fValueOf2, Float.valueOf(0.1f));
        Float fValueOf3 = Float.valueOf(0.4f);
        C23465k c23465k3 = new C23465k(fValueOf3, fValueOf);
        Float fValueOf4 = Float.valueOf(0.5f);
        C23465k c23465k4 = new C23465k(fValueOf4, fValueOf2);
        Float fValueOf5 = Float.valueOf(0.6f);
        C23465k c23465k5 = new C23465k(fValueOf5, fValueOf3);
        Float fValueOf6 = Float.valueOf(0.7f);
        List listM118959K = AbstractC37056f.m118959K(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, new C23465k(fValueOf6, fValueOf4), new C23465k(Float.valueOf(0.8f), fValueOf5), new C23465k(Float.valueOf(0.9f), fValueOf6));
        List<C23378c> listM67657d = m67657d(listM118959K);
        C18284j c18284jM118950B = AbstractC37056f.m118950B(listM118959K);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM118950B, 10));
        Iterator it = c18284jM118950B.iterator();
        while (true) {
            int i13 = 1;
            if (!it.hasNext()) {
                List<C23378c> listM67657d2 = m67657d(arrayList);
                EnumC21393a enumC21393a = EnumC21393a.TWO_DOTS;
                AbstractC21394b.a aVar = new AbstractC21394b.a(AbstractC37056f.m118959K(new C23379d(AbstractC25265s.m74156w1(listM67657d, 5), new C22228a(AbstractC18249c.m52572j(new C23374a(i13)), null, 2, null), new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(a.f92659w), 0L, false, 55, null)), new C23379d(AbstractC25265s.m74158x1(2, listM67657d), new C22228a(AbstractC18249c.m52572j(new C23374a(2)), null, 2, null), new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(b.f92660w), 0L, false, 55, null))), enumC21393a, "sleep band", false, false, 24, null);
                List listM74156w1 = AbstractC25265s.m74156w1(listM67657d2, 2);
                int i14 = C17919x.f69638o;
                long j7 = C17919x.f69634k;
                return AbstractC37056f.m118959K(aVar, new AbstractC21394b.a(AbstractC37056f.m118959K(new C23379d(listM74156w1, new C22228a(AbstractC18249c.m52577o(j7), null, 2, null), null, 4, null), new C23379d(AbstractC25265s.m74158x1(5, listM67657d2), new C22228a(AbstractC18249c.m52577o(j7), null, 2, null), null, 4, null)), enumC21393a, "cyan band", false, false, 24, null));
            }
            arrayList.add((C23465k) listM118959K.get((listM118959K.size() - 1) - ((AbstractC25243e0) it).nextInt()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final AbstractC17911t m67659f(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), new C17919x(brushBackground.getTransparent())), 0L, 0L, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final AbstractC17911t m67660g(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), new C17919x(brushBackground.getTransparent())), 0L, 0L, 14);
    }
}
