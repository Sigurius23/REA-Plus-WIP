package p40;

import android.graphics.Bitmap;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m40.C25046w;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import n43.C26285a;
import p181h2.C16620e;
import p249jc.AbstractC21598x;
import p294l3.C23249d0;
import p294l3.C23250e;
import p505ts.AbstractC34132o;
import p510u0.C34327j0;
import p602x1.C37816b;
import p636y3.InterfaceC39171c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: p40.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C28829d extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f116706E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C25046w f116707F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC39171c f116708G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f116709H;

    /* JADX INFO: renamed from: w */
    public int f116710w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f116711x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ArrayList f116712y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC13075p1 f116713z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28829d(ArrayList arrayList, InterfaceC13075p1 interfaceC13075p1, InterfaceC4339a interfaceC4339a, C25046w c25046w, InterfaceC39171c interfaceC39171c, int i13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f116712y = arrayList;
        this.f116713z = interfaceC13075p1;
        this.f116706E = interfaceC4339a;
        this.f116707F = c25046w;
        this.f116708G = interfaceC39171c;
        this.f116709H = i13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C28829d c28829d = new C28829d(this.f116712y, this.f116713z, this.f116706E, this.f116707F, this.f116708G, this.f116709H, interfaceC30057d);
        c28829d.f116711x = obj;
        return c28829d;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C28829d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM8712f;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f116710w;
        C25046w c25046w = this.f116707F;
        InterfaceC30057d interfaceC30057d = null;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f116711x;
            ArrayList arrayList = this.f116712y;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC3006f0.m8711e(interfaceC2994c0, null, new C26285a((C23250e) it.next(), c25046w, interfaceC30057d, 8), 3));
            }
            this.f116710w = 1;
            objM8712f = AbstractC3006f0.m8712f(arrayList2, this);
            if (objM8712f == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM8712f = obj;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C23465k c23465k : (Iterable) objM8712f) {
            Bitmap bitmap = (Bitmap) c23465k.f92938x;
            C23465k c23465k2 = bitmap != null ? new C23465k(c23465k.f92937w, bitmap) : null;
            if (c23465k2 != null) {
                arrayList3.add(c23465k2);
            }
        }
        Map mapM74000i0 = AbstractC25247g0.m74000i0(arrayList3);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM74000i0.size()));
        for (Map.Entry entry : mapM74000i0.entrySet()) {
            Object key = entry.getKey();
            long jM47215g = C16620e.m47215g(1 / this.f116708G.getDensity(), AbstractC21598x.m60672b(((Bitmap) entry.getValue()).getWidth(), ((Bitmap) entry.getValue()).getHeight()));
            linkedHashMap.put(key, new C34327j0(new C23249d0(AbstractC35745c.m113248j(C16620e.m47213e(jM47215g), 4294967296L), AbstractC35745c.m113248j(C16620e.m47211c(jM47215g), 4294967296L), this.f116709H), new C37816b(new C28828c(entry, c25046w, jM47215g), true, 858918421)));
        }
        C13045h2 c13045h2 = (C13045h2) this.f116713z;
        c13045h2.getClass();
        c13045h2.m36571k(null, linkedHashMap);
        this.f116706E.invoke();
        return C23454a0.f92919a;
    }
}
