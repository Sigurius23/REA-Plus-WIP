package bp0;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.RunnableC1605m;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bd3.C3130k;
import c03.C3815c;
import cc3.C4419b;
import cg.AbstractC4565t;
import cg.C4555j;
import cg.C4563r;
import ch.AbstractC4585f;
import coil.compose.AsyncImagePainter$State$Error;
import coil.compose.AsyncImagePainter$State$Loading;
import coil.request.NullRequestDataException;
import com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao_Impl;
import com.whoop.data.local.room.dao.wipeable.ConfigurationsDao_Impl;
import com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao_Impl;
import com.whoop.data.local.room.entity.ConfigurationDto;
import com.whoop.data.local.room.entity.SmartAlarmDiagnosticDto;
import com.whoop.data.onboarding.OnboardingStatus;
import com.whoop.data.onboarding.OnboardingStatusDao_Impl;
import dc1.AbstractC11910g;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import js1.AbstractC21921l;
import jy1.C22047a;
import jy1.C22049c;
import k01.AbstractC22092d;
import k01.C22093e;
import k71.AbstractC22253j;
import k71.AbstractC22269z;
import k71.C22245c0;
import k71.C22256m;
import k71.C22260q;
import kd1.AbstractC22404p;
import kd1.C22401m;
import kd1.EnumC22400l;
import l83.C23454a0;
import l83.C23465k;
import m80.AbstractC25225g;
import ny0.C27256h;
import p002a0.C0005a0;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p003a1.C0106e;
import p005a3.C0237p;
import p005a3.C0238p0;
import p007a6.C0428i;
import p014aj.C0928c;
import p027b3.C2437s0;
import p077d0.C11365j0;
import p077d0.C11373l0;
import p077d0.C11409v1;
import p077d0.C11415x1;
import p077d0.C11418y1;
import p077d0.C11421z1;
import p132f0.C13821r1;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p208i2.AbstractC17911t;
import p208i2.C17891j;
import p249jc.C21565a;
import p249jc.C21567b;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p279kd.C22379f;
import p291l0.C22944c2;
import p291l0.C22959g1;
import p291l0.C22963h1;
import p291l0.C22970j1;
import p291l0.RunnableC23005v0;
import p331n2.AbstractC26165a;
import p390p1.C28624i0;
import p390p1.C28679w;
import p390p1.InterfaceC28601c1;
import p392p3.AbstractC28771i;
import p392p3.C28759a0;
import p392p3.C28762c;
import p392p3.C28763c0;
import p392p3.C28764d;
import p392p3.C28765d0;
import p392p3.C28766e;
import p392p3.C28768f;
import p392p3.C28772j;
import p392p3.C28774l;
import p392p3.C28775m;
import p392p3.C28780r;
import p392p3.C28782t;
import p392p3.C28783u;
import p392p3.C28786x;
import p500tb.InterfaceC33687a;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.C39178j;
import p710im1.AbstractC18697t0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import q83.InterfaceC30057d;
import tg.C33775g;

/* JADX INFO: renamed from: bp0.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3526n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14049w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14050x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f14051y;

    public /* synthetic */ C3526n(int i13, Object obj, Object obj2) {
        this.f14049w = i13;
        this.f14050x = obj;
        this.f14051y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0255  */
    /* JADX WARN: Code duplicated, block: B:142:0x0266  */
    /* JADX WARN: Code duplicated, block: B:144:0x0275  */
    /* JADX WARN: Code duplicated, block: B:201:0x0384  */
    /* JADX WARN: Code duplicated, block: B:202:0x0386  */
    /* JADX WARN: Code duplicated, block: B:348:0x0278 A[SYNTHETIC] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C23465k c23465k;
        Object c28763c0;
        Object objInvoke;
        Object objInvoke2;
        List list;
        int size;
        int i13;
        Object obj2;
        int i14;
        List list2;
        List list3;
        Typeface typefaceM60598i;
        C28765d0 c28765d0;
        switch (this.f14049w) {
            case 0:
                return AbstractC3531s.m10422H((Activity) this.f14050x, (Function1) this.f14051y, (C28624i0) obj);
            case 1:
                ((C4419b) this.f14050x).f17879w.removeCallbacks((RunnableC1605m) this.f14051y);
                return C23454a0.f92919a;
            case 2:
                C4555j c4555j = (C4555j) this.f14050x;
                AbstractC4565t abstractC4565t = (AbstractC4565t) this.f14051y;
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                C3130k c3130k = c4555j.f18357z;
                c3130k.getClass();
                if (abstractC4565t.m14243a(C4563r.f18377d)) {
                    c3130k.m8994e(it);
                } else {
                    c3130k.m8993d(it, new C0106e(C33775g.f141359i, 19));
                }
                return C23454a0.f92919a;
            case 3:
                AbstractC26165a abstractC26165a = (AbstractC26165a) this.f14050x;
                AbstractC26165a abstractC26165a2 = (AbstractC26165a) this.f14051y;
                AbstractC4585f abstractC4585f = (AbstractC4585f) obj;
                if (abstractC4585f instanceof AsyncImagePainter$State$Loading) {
                    return (AsyncImagePainter$State$Loading) abstractC4585f;
                }
                if (!(abstractC4585f instanceof AsyncImagePainter$State$Error)) {
                    return abstractC4585f;
                }
                AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) abstractC4585f;
                if (asyncImagePainter$State$Error.f20226a.m75116c() instanceof NullRequestDataException) {
                    return abstractC26165a != null ? AsyncImagePainter$State$Error.m15507b(asyncImagePainter$State$Error, abstractC26165a) : asyncImagePainter$State$Error;
                }
                return abstractC26165a2 != null ? AsyncImagePainter$State$Error.m15507b(asyncImagePainter$State$Error, abstractC26165a2) : asyncImagePainter$State$Error;
            case 4:
                return ((CachedMetricsDataDao_Impl) this.f14050x).lambda$insertList$0((List) this.f14051y, (InterfaceC33687a) obj);
            case 5:
                return ((ConfigurationsDao_Impl) this.f14050x).lambda$insert$0((ConfigurationDto) this.f14051y, (InterfaceC33687a) obj);
            case 6:
                return ((SmartAlarmDiagnosticDao_Impl) this.f14050x).lambda$insert$0((SmartAlarmDiagnosticDto) this.f14051y, (InterfaceC33687a) obj);
            case 7:
                return ((OnboardingStatusDao_Impl) this.f14050x).lambda$updateTable$0((OnboardingStatus) this.f14051y, (InterfaceC33687a) obj);
            case 8:
                C11373l0 c11373l0 = (C11373l0) this.f14050x;
                C11365j0 c11365j0 = (C11365j0) this.f14051y;
                c11373l0.f36453a.m94885b(c11365j0);
                c11373l0.f36454b.setValue(Boolean.TRUE);
                return new C2437s0(2, c11373l0, c11365j0);
            case 9:
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f14050x, null, EnumC2998d0.f12007z, new C11415x1((C11421z1) this.f14051y, null), 1);
                return new C11418y1();
            case 10:
                C11421z1 c11421z1 = (C11421z1) this.f14050x;
                C11421z1 c11421z2 = (C11421z1) this.f14051y;
                c11421z1.f36639j.add(c11421z2);
                return new C2437s0(3, c11421z1, c11421z2);
            case 11:
                C11421z1 c11421z3 = (C11421z1) this.f14050x;
                C11409v1 c11409v1 = (C11409v1) this.f14051y;
                c11421z3.f36638i.add(c11409v1);
                return new C2437s0(4, c11421z3, c11409v1);
            case 12:
                return AbstractC11910g.m32113g((C23465k) this.f14050x, (C23465k) this.f14051y, (C39336i) obj);
            case 13:
                C17891j c17891j = (C17891j) this.f14050x;
                AbstractC17911t abstractC17911t = (AbstractC17911t) this.f14051y;
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                c0238p0.m728a();
                InterfaceC22131e.m63378L(c0238p0, c17891j, abstractC17911t, 0.0f, null, 60);
                return C23454a0.f92919a;
            case 14:
                return AbstractC18697t0.m54324e0((C13821r1) this.f14050x, (InterfaceC28601c1) this.f14051y, ((Boolean) obj).booleanValue());
            case 15:
                return AbstractC21921l.m62401u((Function1) this.f14051y, (C27256h) this.f14050x, obj);
            case 16:
                return ((C22049c) this.f14050x).m63120n((C22047a) this.f14051y, (InterfaceC33687a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C22049c) this.f14050x).m63118l((List) this.f14051y, (InterfaceC33687a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC22092d.m63191q((C22093e) this.f14050x, (Function1) this.f14051y, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC22253j.m63822H((Function1) this.f14051y, (C22256m) this.f14050x, obj);
            case 20:
                return C22260q.m63929d((Function1) this.f14051y, (C22245c0) this.f14050x, obj);
            case 21:
                return AbstractC22269z.m63934C((Function1) this.f14051y, (EnumC22400l) this.f14050x, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22404p.m64499h((C22401m) this.f14050x, this.f14051y, (C28624i0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C22959g1 c22959g1 = (C22959g1) this.f14050x;
                AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) this.f14051y;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                if (c22959g1.f90606Q) {
                    AbstractC39101i1.m124624n(abstractC39104j1, abstractC39101i1.mo724F(c22959g1.f90604O), abstractC39101i1.mo724F(c22959g1.f90605P), abstractC39101i1);
                } else {
                    abstractC39101i1.m124632f(abstractC39104j1, abstractC39101i1.mo724F(c22959g1.f90604O), abstractC39101i1.mo724F(c22959g1.f90605P), 0.0f);
                }
                return C23454a0.f92919a;
            case 24:
                C22963h1 c22963h1 = (C22963h1) this.f14050x;
                AbstractC39104j1 abstractC39104j2 = (AbstractC39104j1) this.f14051y;
                AbstractC39101i1 abstractC39101i2 = (AbstractC39101i1) obj;
                long j7 = ((C39178j) c22963h1.f90616O.invoke(abstractC39101i2)).f168416a;
                if (c22963h1.f90617P) {
                    AbstractC39101i1.m124625o(abstractC39104j2, (int) (j7 >> 32), (int) (4294967295L & j7), abstractC39101i2);
                } else {
                    AbstractC39101i1.m124627s(abstractC39101i2, abstractC39104j2, (int) (j7 >> 32), (int) (4294967295L & j7), null, 12);
                }
                return C23454a0.f92919a;
            case 25:
                C22970j1 c22970j1 = (C22970j1) this.f14050x;
                AbstractC39104j1 abstractC39104j3 = (AbstractC39104j1) this.f14051y;
                AbstractC39101i1 abstractC39101i3 = (AbstractC39101i1) obj;
                if (c22970j1.f90634S) {
                    AbstractC39101i1.m124624n(abstractC39104j3, abstractC39101i3.mo724F(c22970j1.f90630O), abstractC39101i3.mo724F(c22970j1.f90631P), abstractC39101i3);
                } else {
                    abstractC39101i3.m124632f(abstractC39104j3, abstractC39101i3.mo724F(c22970j1.f90630O), abstractC39101i3.mo724F(c22970j1.f90631P), 0.0f);
                }
                return C23454a0.f92919a;
            case 26:
                C22944c2 c22944c2 = (C22944c2) this.f14050x;
                View view = (View) this.f14051y;
                RunnableC23005v0 runnableC23005v0 = c22944c2.f90574u;
                if (c22944c2.f90573t == 0) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    AbstractC16877h0.m47517l(view, runnableC23005v0);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(runnableC23005v0);
                    AbstractC16901p0.m47586q(view, runnableC23005v0);
                }
                c22944c2.f90573t++;
                return new C2437s0(6, c22944c2, view);
            case 27:
                return AbstractC25225g.m73943f((Function1) this.f14051y, (C3815c) this.f14050x, obj);
            case 28:
                C28679w c28679w = (C28679w) this.f14050x;
                C0059w0 c0059w0 = (C0059w0) this.f14051y;
                c28679w.m87232z(obj);
                if (c0059w0 != null) {
                    c0059w0.m136a(obj);
                }
                return C23454a0.f92919a;
            default:
                C28772j c28772j = (C28772j) this.f14050x;
                C28759a0 c28759a0 = (C28759a0) this.f14051y;
                Function1 function1 = (Function1) obj;
                C28775m c28775m = c28772j.f116526d;
                C0928c c0928c = c28772j.f116523a;
                C0428i c0428i = c28772j.f116528f;
                c28775m.getClass();
                AbstractC28771i abstractC28771i = c28759a0.f116493a;
                if (abstractC28771i instanceof C28774l) {
                    List list4 = ((C28774l) abstractC28771i).f116531F;
                    C28780r c28780r = c28759a0.f116494b;
                    int i15 = c28759a0.f116495c;
                    ArrayList arrayList = new ArrayList(list4.size());
                    List list5 = list4;
                    int size2 = list5.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Object obj3 = list4.get(i16);
                        if (AbstractC22676k.m65745e(((C28786x) obj3).f116554b, c28780r) && i15 == 0) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list4.size());
                        int size3 = list5.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            Object obj4 = list4.get(i17);
                            ((C28786x) obj4).getClass();
                            if (i15 == 0) {
                                arrayList2.add(obj4);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list4 = arrayList2;
                        }
                        List list6 = list4;
                        int iCompareTo = c28780r.compareTo(C28780r.f116544x);
                        int i18 = c28780r.f116547w;
                        if (iCompareTo < 0) {
                            List list7 = list6;
                            int size4 = list7.size();
                            C28780r c28780r2 = null;
                            C28780r c28780r3 = null;
                            int i19 = 0;
                            while (true) {
                                if (i19 < size4) {
                                    C28780r c28780r4 = ((C28786x) list6.get(i19)).f116554b;
                                    int i24 = c28780r4.f116547w;
                                    if (AbstractC22676k.m65751k(i24, i18) < 0) {
                                        list3 = list7;
                                        if (c28780r2 == null || AbstractC22676k.m65751k(i24, c28780r2.f116547w) > 0) {
                                            c28780r2 = c28780r4;
                                        }
                                    } else {
                                        list3 = list7;
                                        if (AbstractC22676k.m65751k(i24, i18) <= 0) {
                                            c28780r2 = c28780r4;
                                            c28780r3 = c28780r2;
                                        } else if (c28780r3 == null || AbstractC22676k.m65751k(i24, c28780r3.f116547w) < 0) {
                                            c28780r3 = c28780r4;
                                        }
                                    }
                                    i19++;
                                    list7 = list3;
                                } else {
                                    list3 = list7;
                                }
                            }
                            if (c28780r2 == null) {
                                c28780r2 = c28780r3;
                            }
                            arrayList = new ArrayList(list6.size());
                            int size5 = list3.size();
                            for (int i25 = 0; i25 < size5; i25++) {
                                Object obj5 = list6.get(i25);
                                if (AbstractC22676k.m65745e(((C28786x) obj5).f116554b, c28780r2)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            C28780r c28780r5 = C28780r.f116545y;
                            if (c28780r.compareTo(c28780r5) > 0) {
                                List list8 = list6;
                                int size6 = list8.size();
                                C28780r c28780r6 = null;
                                C28780r c28780r7 = null;
                                int i26 = 0;
                                while (true) {
                                    if (i26 < size6) {
                                        C28780r c28780r8 = ((C28786x) list6.get(i26)).f116554b;
                                        int i27 = c28780r8.f116547w;
                                        if (AbstractC22676k.m65751k(i27, i18) < 0) {
                                            list2 = list8;
                                            if (c28780r6 == null || AbstractC22676k.m65751k(i27, c28780r6.f116547w) > 0) {
                                                c28780r6 = c28780r8;
                                            }
                                        } else {
                                            list2 = list8;
                                            if (AbstractC22676k.m65751k(i27, i18) <= 0) {
                                                c28780r6 = c28780r8;
                                                c28780r7 = c28780r6;
                                            } else if (c28780r7 == null || AbstractC22676k.m65751k(i27, c28780r7.f116547w) < 0) {
                                                c28780r7 = c28780r8;
                                            }
                                        }
                                        i26++;
                                        list8 = list2;
                                    } else {
                                        list2 = list8;
                                    }
                                }
                                if (c28780r7 != null) {
                                    c28780r6 = c28780r7;
                                }
                                arrayList = new ArrayList(list6.size());
                                int size7 = list2.size();
                                for (int i28 = 0; i28 < size7; i28++) {
                                    Object obj6 = list6.get(i28);
                                    if (AbstractC22676k.m65745e(((C28786x) obj6).f116554b, c28780r6)) {
                                        arrayList.add(obj6);
                                    }
                                }
                            } else {
                                List list9 = list6;
                                int size8 = list9.size();
                                C28780r c28780r9 = null;
                                C28780r c28780r10 = null;
                                int i29 = 0;
                                while (true) {
                                    if (i29 < size8) {
                                        C28780r c28780r11 = ((C28786x) list6.get(i29)).f116554b;
                                        list = list9;
                                        int i34 = size8;
                                        if (AbstractC22676k.m65751k(c28780r11.f116547w, c28780r5.f116547w) <= 0) {
                                            int i35 = c28780r11.f116547w;
                                            if (AbstractC22676k.m65751k(i35, i18) < 0) {
                                                if (c28780r9 == null || AbstractC22676k.m65751k(i35, c28780r9.f116547w) > 0) {
                                                    c28780r9 = c28780r11;
                                                }
                                            } else if (AbstractC22676k.m65751k(i35, i18) <= 0) {
                                                c28780r9 = c28780r11;
                                                c28780r10 = c28780r9;
                                            } else if (c28780r10 == null || AbstractC22676k.m65751k(i35, c28780r10.f116547w) < 0) {
                                                c28780r10 = c28780r11;
                                            }
                                        }
                                        i29++;
                                        list9 = list;
                                        size8 = i34;
                                    } else {
                                        list = list9;
                                    }
                                }
                                if (c28780r10 != null) {
                                    c28780r9 = c28780r10;
                                }
                                ArrayList arrayList3 = new ArrayList(list6.size());
                                int size9 = list.size();
                                for (int i36 = 0; i36 < size9; i36++) {
                                    Object obj7 = list6.get(i36);
                                    if (AbstractC22676k.m65745e(((C28786x) obj7).f116554b, c28780r9)) {
                                        arrayList3.add(obj7);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    C28780r c28780r12 = C28780r.f116545y;
                                    int size10 = list.size();
                                    C28780r c28780r13 = null;
                                    C28780r c28780r14 = null;
                                    int i37 = 0;
                                    while (i37 < size10) {
                                        C28780r c28780r15 = ((C28786x) list6.get(i37)).f116554b;
                                        if (c28780r12 != null) {
                                            i14 = size10;
                                            if (AbstractC22676k.m65751k(c28780r15.f116547w, c28780r12.f116547w) < 0) {
                                                continue;
                                            }
                                            i37++;
                                            size10 = i14;
                                        } else {
                                            i14 = size10;
                                        }
                                        int i38 = c28780r15.f116547w;
                                        if (AbstractC22676k.m65751k(i38, i18) < 0) {
                                            if (c28780r13 == null || AbstractC22676k.m65751k(i38, c28780r13.f116547w) > 0) {
                                                c28780r13 = c28780r15;
                                            }
                                        } else if (AbstractC22676k.m65751k(i38, i18) <= 0) {
                                            c28780r13 = c28780r15;
                                            c28780r14 = c28780r13;
                                            if (c28780r14 != null) {
                                                c28780r13 = c28780r14;
                                            }
                                            arrayList = new ArrayList(list6.size());
                                            size = list.size();
                                            for (i13 = 0; i13 < size; i13++) {
                                                obj2 = list6.get(i13);
                                                if (AbstractC22676k.m65745e(((C28786x) obj2).f116554b, c28780r13)) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                        } else if (c28780r14 == null || AbstractC22676k.m65751k(i38, c28780r14.f116547w) < 0) {
                                            c28780r14 = c28780r15;
                                        }
                                        i37++;
                                        size10 = i14;
                                    }
                                    if (c28780r14 != null) {
                                        c28780r13 = c28780r14;
                                    }
                                    arrayList = new ArrayList(list6.size());
                                    size = list.size();
                                    while (i13 < size) {
                                        obj2 = list6.get(i13);
                                        if (AbstractC22676k.m65745e(((C28786x) obj2).f116554b, c28780r13)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                } else {
                                    arrayList = arrayList3;
                                }
                            }
                        }
                    }
                    C0237p c0237p = c28775m.f116533a;
                    if (arrayList.size() > 0) {
                        C28786x c28786x = (C28786x) arrayList.get(0);
                        c28786x.getClass();
                        synchronized (((C21567b) c0237p.f814z)) {
                            try {
                                c0928c.getClass();
                                C28766e c28766e = new C28766e(c28786x);
                                C28764d c28764d = (C28764d) ((C0005a0) c0237p.f812x).m2c(c28766e);
                                if (c28764d == null) {
                                    c28764d = (C28764d) ((C0057v0) c0237p.f813y).m129g(c28766e);
                                }
                                if (c28764d != null) {
                                    objInvoke2 = c28764d.f116514a;
                                } else {
                                    try {
                                        objInvoke = c0928c.m2304N(c28786x);
                                    } catch (Exception unused) {
                                        objInvoke = c0428i.invoke(c28759a0);
                                    }
                                    c0237p.getClass();
                                    c0928c.getClass();
                                    C28766e c28766e2 = new C28766e(c28786x);
                                    synchronized (((C21567b) c0237p.f814z)) {
                                        try {
                                            if (objInvoke == null) {
                                                ((C0057v0) c0237p.f813y).m135m(c28766e2, new C28764d(null));
                                            } else {
                                                ((C0005a0) c0237p.f812x).m3d(c28766e2, new C28764d(objInvoke));
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                        break;
                                    }
                                    objInvoke2 = objInvoke;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                            break;
                        }
                        if (objInvoke2 == null) {
                            objInvoke2 = c0428i.invoke(c28759a0);
                        }
                        c23465k = new C23465k(null, AbstractC21478l0.m60428d0(c28759a0.f116496d, objInvoke2, c28786x, c28759a0.f116494b, c28759a0.f116495c));
                    } else {
                        c23465k = new C23465k(null, c0428i.invoke(c28759a0));
                    }
                    List list10 = (List) c23465k.f92937w;
                    Object obj8 = c23465k.f92938x;
                    if (list10 == null) {
                        c28763c0 = new C28765d0(obj8, true);
                    } else {
                        C28762c c28762c = new C28762c(list10, obj8, c28759a0, c28775m.f116533a, function1, c0928c);
                        AbstractC3006f0.m8732z(c28775m.f116534b, null, EnumC2998d0.f12007z, new C22379f(c28762c, (InterfaceC30057d) null, 24), 1);
                        c28763c0 = new C28763c0(c28762c);
                    }
                } else {
                    c28763c0 = null;
                }
                if (c28763c0 != null) {
                    return c28763c0;
                }
                Object obj9 = c28772j.f116527e.f3422w;
                AbstractC28771i abstractC28771i2 = c28759a0.f116493a;
                int i39 = c28759a0.f116495c;
                C28780r c28780r16 = c28759a0.f116494b;
                if (abstractC28771i2 == null || (abstractC28771i2 instanceof C28768f)) {
                    typefaceM60598i = C21565a.m60598i(null, c28780r16, i39);
                } else {
                    if (!(abstractC28771i2 instanceof C28782t)) {
                        if (abstractC28771i2 instanceof C28783u) {
                            typefaceM60598i = ((C28783u) abstractC28771i2).m87533a().m91527C();
                        } else {
                            c28765d0 = null;
                        }
                        if (c28765d0 != null) {
                            return c28765d0;
                        }
                        throw new IllegalStateException("Could not load font");
                    }
                    typefaceM60598i = C21565a.m60598i(((C28782t) abstractC28771i2).f116549F, c28780r16, i39);
                }
                c28765d0 = new C28765d0(typefaceM60598i, true);
                if (c28765d0 != null) {
                    return c28765d0;
                }
                throw new IllegalStateException("Could not load font");
        }
    }

    public /* synthetic */ C3526n(Function1 function1, Object obj, int i13) {
        this.f14049w = i13;
        this.f14051y = function1;
        this.f14050x = obj;
    }
}
