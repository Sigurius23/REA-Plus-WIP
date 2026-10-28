package a00;

import am2.AbstractC1026k;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm2.AbstractC3487z0;
import bs1.AbstractC3583c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import d00.C11433l;
import d30.C11528e1;
import e10.C12537c;
import e10.C12546g0;
import e10.C12550i0;
import e10.C12553k;
import e10.C12574u0;
import e10.InterfaceC12555l;
import ec3.InterfaceC13037f2;
import gh0.AbstractC15847b;
import gr1.C16095b;
import h00.C16528v;
import hp2.AbstractC17559f;
import hp2.C17560g;
import hv1.C17672b;
import i93.C18284j;
import java.util.List;
import java.util.Locale;
import jr1.AbstractC21896d;
import jx1.C22014f;
import jx1.C22016g;
import kd1.C22409u;
import kotlin.AbstractC1993c0;
import kotlin.AbstractC2036w;
import l83.C23454a0;
import mx1.AbstractC26007m;
import np1.AbstractC27032j;
import p027b3.InterfaceC2464x2;
import p114eb.C12991u0;
import p163g1.C15199y3;
import p292l1.C23104h1;
import p292l1.C23198x;
import p292l1.InterfaceC23142n3;
import p316m1.AbstractC24917o;
import p316m1.C24922t;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p599wz.AbstractC37748q0;
import p599wz.C37714f;
import p599wz.C37718g0;
import p599wz.C37742o0;
import p599wz.C37745p0;
import p602x1.C37816b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p734sl0.AbstractC32591c1;
import p734sl0.AbstractC32611g1;
import p734sl0.AbstractC32679u0;
import pp1.AbstractC29436i;
import q00.C29720i0;
import r90.AbstractC31099f;
import r90.C31100g;
import r90.C31103j;
import sd0.C32409a;
import t11.AbstractC33305e;
import t11.C33307g;
import ud0.AbstractC34790c;
import uw0.AbstractC35304n;
import uw0.C35306p;
import v00.C35459c0;
import v41.AbstractC35664f;
import y00.AbstractC38794c0;
import y00.C38889l5;
import y00.C38915o4;
import y00.EnumC38910o;
import yo0.AbstractC39683e;
import yo0.C39684f;
import ys2.AbstractC39758e;
import zg0.C40628k;

/* JADX INFO: renamed from: a00.h */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0073h implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f226E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f227F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f228w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f229x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f230y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f231z;

    public /* synthetic */ C0073h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f228w = i13;
        this.f229x = obj;
        this.f227F = obj2;
        this.f230y = obj3;
        this.f231z = obj4;
        this.f226E = obj5;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f228w) {
            case 0:
                C0072g c0072g = (C0072g) this.f229x;
                AbstractC37748q0 abstractC37748q0 = (AbstractC37748q0) this.f227F;
                C11433l c11433l = (C11433l) this.f230y;
                String str = (String) this.f231z;
                String str2 = (String) this.f226E;
                C35459c0 c35459c0 = (C35459c0) c0072g.f224y;
                if (abstractC37748q0 instanceof C37742o0) {
                    return c0072g.m204v(((C37742o0) abstractC37748q0).f161703w, c11433l, str, str2, c35459c0);
                }
                if (!(abstractC37748q0 instanceof C37745p0)) {
                    throw new NoWhenBranchMatchedException();
                }
                C38915o4 c38915o4 = ((C37745p0) abstractC37748q0).f161710y;
                EnumC38910o enumC38910o = EnumC38910o.OffSession;
                if (str == null || ((C37718g0) c0072g.f223x).f161608H) {
                    str = null;
                }
                return new C12553k(new C12574u0(c38915o4, new C38889l5(2, str, enumC38910o), 28), c35459c0);
            case 1:
                C0072g c0072g2 = (C0072g) this.f229x;
                return c0072g2.m204v((AbstractC38794c0) this.f227F, (C11433l) this.f230y, (String) this.f231z, (String) this.f226E, (C35459c0) c0072g2.f224y);
            case 2:
                return AbstractC1026k.m2747U((InterfaceC2994c0) this.f229x, (Function1) this.f227F, (InterfaceC28601c1) this.f230y, (C15199y3) this.f231z, (InterfaceC28601c1) this.f226E);
            case 3:
                return AbstractC2036w.m6379S((C15199y3) this.f229x, (InterfaceC2994c0) this.f227F, (Function1) this.f230y, (AbstractC39758e.i) this.f231z, (AbstractC35664f.a) this.f226E);
            case 4:
                return AbstractC1993c0.m6057I((C15199y3) this.f229x, (InterfaceC2994c0) this.f227F, (Function1) this.f230y, (AbstractC39758e.j) this.f231z, (AbstractC35664f.a) this.f226E);
            case 5:
                return AbstractC3487z0.m10228K((Function1) this.f229x, (C17672b) this.f227F, (InterfaceC2994c0) this.f230y, (InterfaceC28601c1) this.f231z, (C15199y3) this.f226E);
            case 6:
                return AbstractC3583c0.m10791S1((Function1) this.f229x, (InterfaceC28601c1) this.f227F, (InterfaceC28601c1) this.f230y, (InterfaceC2994c0) this.f231z, (AbstractC35664f.a) this.f226E);
            case 7:
                C12550i0 c12550i0 = (C12550i0) this.f229x;
                InterfaceC12555l interfaceC12555l = (InterfaceC12555l) this.f227F;
                C12553k c12553k = (C12553k) this.f230y;
                C12537c c12537c = (C12537c) this.f231z;
                c12550i0.f42871a.m5004e(new C12546g0(interfaceC12555l, c12553k, c12537c.f42844c), c12550i0.f42874d);
                c12550i0.f42872b.mo35206a(this.f226E, c12537c.f42842a, interfaceC12555l, c12553k);
                return C23454a0.f92919a;
            case 8:
                return AbstractC15847b.m44694k((String) this.f231z, (InterfaceC4339a) this.f229x, (Context) this.f227F, (String) this.f226E, (InterfaceC28601c1) this.f230y);
            case 9:
                Function3 function3 = (Function3) this.f229x;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f227F;
                C12991u0 c12991u0 = (C12991u0) this.f230y;
                Function1 function1 = (Function1) this.f231z;
                Function1 function2 = (Function1) this.f226E;
                if (function3 != null) {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C16528v(0, function2, null), 3);
                } else if (!c12991u0.m36410z()) {
                    function1.invoke(C37714f.f161583a);
                }
                return C23454a0.f92919a;
            case 10:
                return AbstractC17559f.m49970e((String) this.f231z, (C17560g) this.f229x, (Context) this.f227F, (String) this.f226E, (InterfaceC28601c1) this.f230y);
            case 11:
                return AbstractC21896d.m62181I((C16095b) this.f229x, (Function1) this.f227F, (InterfaceC28601c1) this.f230y, (Function1) this.f231z, (InterfaceC28601c1) this.f226E);
            case 12:
                C23198x c23198x = (C23198x) this.f229x;
                AbstractC24917o abstractC24917o = (AbstractC24917o) this.f227F;
                C24922t c24922t = (C24922t) this.f230y;
                Locale locale = (Locale) this.f231z;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f226E;
                return AbstractC28683x.m87272z(((C29891y) interfaceC28601c1.getValue()).f122125a.f92135x.length() > 0 ? c23198x.m67156a(abstractC24917o.mo73020c(locale, ((C29891y) interfaceC28601c1.getValue()).f122125a.f92135x, c24922t.f97607c), locale) : "");
            case 13:
                return new C23104h1((Long) this.f229x, (Long) this.f227F, (C18284j) this.f230y, 0, (InterfaceC23142n3) this.f231z, (Locale) this.f226E);
            case 14:
                return AbstractC26007m.m77233Y((C22014f) this.f229x, (Function1) this.f227F, (String) this.f231z, (String) this.f226E, (C22016g) this.f230y);
            case 15:
                return AbstractC29436i.m89792r0((Function1) this.f229x, (AbstractC27032j.g) this.f227F, (InterfaceC2994c0) this.f230y, (C15199y3) this.f231z, (InterfaceC28601c1) this.f226E);
            case 16:
                return AbstractC29436i.m89796t0((AbstractC27032j.g) this.f229x, (Function1) this.f227F, (Function1) this.f230y, (InterfaceC2994c0) this.f231z, (C15199y3) this.f226E);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C29720i0 c29720i0 = (C29720i0) this.f229x;
                Function1 function4 = (Function1) this.f227F;
                Function1 function5 = (Function1) this.f230y;
                InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f231z;
                Function1 function6 = (Function1) this.f226E;
                if (c29720i0.f121548m.size() == 1) {
                    function4.invoke(c29720i0.f121548m.get(0));
                } else {
                    function5.invoke(new C37816b(new C11528e1(c29720i0, function4, interfaceC2994c1, function6), true, 1919072903));
                }
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((InterfaceC4352n) this.f229x).invoke(((InterfaceC13037f2) this.f227F).getValue(), ((InterfaceC13037f2) this.f230y).getValue(), ((InterfaceC13037f2) this.f231z).getValue(), ((InterfaceC13037f2) this.f226E).getValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC31099f.m95792o((Function1) this.f229x, (C31100g) this.f227F, (C31103j) this.f230y, (String) this.f231z, (InterfaceC28601c1) this.f226E);
            case 20:
                return AbstractC32679u0.m102369d0((InterfaceC2994c0) this.f229x, (InterfaceC2464x2) this.f227F, (C15199y3) this.f230y, (InterfaceC28601c1) this.f231z, (InterfaceC28601c1) this.f226E);
            case 21:
                return AbstractC32591c1.m101660o((C40628k) this.f229x, (InterfaceC2994c0) this.f227F, (InterfaceC28601c1) this.f230y, (InterfaceC28601c1) this.f231z, (C22409u) this.f226E);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC32611g1.m101769z((String) this.f231z, (Context) this.f229x, (String) this.f226E, (Function1) this.f227F, (InterfaceC28670t2) this.f230y);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC33305e.m105648q((C33307g) this.f229x, (Function1) this.f227F, (InterfaceC28601c1) this.f230y, (InterfaceC28601c1) this.f231z, (InterfaceC28601c1) this.f226E);
            case 24:
                return AbstractC34790c.m109786h((Function1) this.f229x, (C32409a) this.f227F, (Function1) this.f230y, (String) this.f231z, (Function1) this.f226E);
            case 25:
                return AbstractC35304n.m112065p((Function1) this.f229x, (C35306p) this.f227F, (InterfaceC2994c0) this.f230y, (InterfaceC28601c1) this.f231z, (AbstractC35664f.a) this.f226E);
            default:
                return AbstractC39683e.m126932T((List) this.f229x, (C39684f) this.f227F, (InterfaceC4339a) this.f230y, (InterfaceC28601c1) this.f231z, (InterfaceC28601c1) this.f226E);
        }
    }

    public /* synthetic */ C0073h(String str, Context context, String str2, Function1 function1, InterfaceC28670t2 interfaceC28670t2) {
        this.f228w = 22;
        this.f231z = str;
        this.f229x = context;
        this.f226E = str2;
        this.f227F = function1;
        this.f230y = interfaceC28670t2;
    }

    public /* synthetic */ C0073h(String str, Object obj, Context context, String str2, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f228w = i13;
        this.f231z = str;
        this.f229x = obj;
        this.f227F = context;
        this.f226E = str2;
        this.f230y = interfaceC28601c1;
    }

    public /* synthetic */ C0073h(C22014f c22014f, Function1 function1, String str, String str2, C22016g c22016g) {
        this.f228w = 14;
        this.f229x = c22014f;
        this.f227F = function1;
        this.f231z = str;
        this.f226E = str2;
        this.f230y = c22016g;
    }
}
