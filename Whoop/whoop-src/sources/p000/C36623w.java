package p000;

import androidx.health.platform.client.proto.C1533u;
import b30.C2595p0;
import bc3.AbstractC3006f0;
import bm.C3382f;
import ch.AbstractC4601v;
import ch.C4593n;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.stripe.android.model.StripeIntent$Status;
import com.stripe.android.uicore.elements.IdentifierSpec;
import d30.C11562t;
import d33.AbstractC11582b;
import d33.EnumC11579a;
import ec3.AbstractC13091v;
import ec3.C13030e;
import ec3.C13092v0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import g40.C15394n1;
import g40.InterfaceC15421s3;
import io.getstream.video.android.core.notifications.internal.storage.DevicePreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n00.C26081i;
import o20.C27458c;
import o20.C27459d;
import org.webrtc.PeerConnection;
import p098dt.AbstractC12350b;
import p163g1.C15083m7;
import p341nh.C26707a;
import p341nh.C26708b;
import p341nh.C26711e;
import p341nh.C26714h;
import p43.C28842a;
import p470rv.C31822b;
import p470rv.C31827g;
import p505ts.AbstractC34132o;
import p636y3.C39169a;
import p695zx.C41180b;
import p695zx.C41182d;
import p695zx.C41195q;
import p695zx.C41196r;
import p695zx.InterfaceC41183e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q20.AbstractC29840y;
import q20.C29824j;
import q20.C29828m;
import q20.C29838w;
import q20.EnumC29820h;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import t23.C33367c;
import t23.C33373d;
import t23.C33392g2;
import t23.C33433o3;
import t23.C33438p3;
import t23.C33445r0;
import w23.C36744b;
import w23.C36746d;
import w23.C36747e;
import x20.C37853u;
import x20.EnumC37847o;
import x30.C37908m0;
import x30.C37911n0;

/* JADX INFO: renamed from: w */
/* JADX INFO: loaded from: classes9.dex */
public final class C36623w implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156937w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13062m f156938x;

    public /* synthetic */ C36623w(InterfaceC13062m interfaceC13062m, int i13) {
        this.f156937w = i13;
        this.f156938x = interfaceC13062m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m117694b(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
        C13092v0 c13092v0;
        if (interfaceC30057d instanceof C13092v0) {
            c13092v0 = (C13092v0) interfaceC30057d;
            int i13 = c13092v0.f45238y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13092v0.f45238y = i13 - Integer.MIN_VALUE;
            } else {
                c13092v0 = new C13092v0(this, interfaceC30057d);
            }
        } else {
            c13092v0 = new C13092v0(this, interfaceC30057d);
        }
        Object obj = c13092v0.f45236w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13092v0.f45238y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c13092v0.f45238y = 1;
            if (AbstractC13091v.m36613w(this.f156938x, interfaceC13058l, c13092v0) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:141:0x0205  */
    /* JADX WARN: Code duplicated, block: B:159:0x0243  */
    /* JADX WARN: Code duplicated, block: B:175:0x027f  */
    /* JADX WARN: Code duplicated, block: B:189:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:209:0x0303  */
    /* JADX WARN: Code duplicated, block: B:225:0x033c  */
    /* JADX WARN: Code duplicated, block: B:243:0x037a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:262:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:273:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:283:0x041e  */
    /* JADX WARN: Code duplicated, block: B:302:0x045d  */
    /* JADX WARN: Code duplicated, block: B:318:0x049c  */
    /* JADX WARN: Code duplicated, block: B:355:0x0562  */
    /* JADX WARN: Code duplicated, block: B:371:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:398:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:418:0x063d  */
    /* JADX WARN: Code duplicated, block: B:434:0x067b  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:452:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:486:0x0755  */
    /* JADX WARN: Code duplicated, block: B:504:0x0795  */
    /* JADX WARN: Code duplicated, block: B:526:0x07df  */
    /* JADX WARN: Code duplicated, block: B:566:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, java.util.List] */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C35449v c35449v;
        C2595p0 c2595p0;
        C3382f c3382f;
        C4593n c4593n;
        C11562t c11562t;
        C13030e c13030e;
        C15083m7 c15083m7;
        C15394n1 c15394n1;
        C23328a c23328a;
        C26081i c26081i;
        C27458c c27458c;
        C27459d c27459d;
        C28842a c28842a;
        C31822b c31822b;
        Point pointFromLngLat;
        C31827g c31827g;
        C33367c c33367c;
        C33373d c33373d;
        C33445r0 c33445r0;
        C33433o3 c33433o3;
        C33438p3 c33438p3;
        C36744b c36744b;
        C36746d c36746d;
        C36747e c36747e;
        C37853u c37853u;
        EnumC37847o enumC37847o;
        C37908m0 c37908m0;
        C37911n0 c37911n0;
        C41195q c41195q;
        C41196r c41196r;
        int i13 = this.f156937w;
        Object c26714h = null;
        InterfaceC13062m interfaceC13062m = this.f156938x;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                if (interfaceC30057d instanceof C35449v) {
                    c35449v = (C35449v) interfaceC30057d;
                    int i14 = c35449v.f150953x;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c35449v.f150953x = i14 - Integer.MIN_VALUE;
                    } else {
                        c35449v = new C35449v(this, interfaceC30057d);
                    }
                } else {
                    c35449v = new C35449v(this, interfaceC30057d);
                }
                Object obj2 = c35449v.f150952w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = c35449v.f150953x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj2);
                if (!((Boolean) obj).booleanValue()) {
                    return c23454a0;
                }
                c35449v.f150953x = 1;
                return interfaceC13062m.emit(obj, c35449v) == enumC31071a ? enumC31071a : c23454a0;
            case 1:
                if (interfaceC30057d instanceof C2595p0) {
                    c2595p0 = (C2595p0) interfaceC30057d;
                    int i16 = c2595p0.f10091x;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c2595p0.f10091x = i16 - Integer.MIN_VALUE;
                    } else {
                        c2595p0 = new C2595p0(this, interfaceC30057d);
                    }
                } else {
                    c2595p0 = new C2595p0(this, interfaceC30057d);
                }
                Object obj3 = c2595p0.f10090w;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i17 = c2595p0.f10091x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj3);
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj;
                if (!(abstractC29840y instanceof C29838w) && !(abstractC29840y instanceof C29828m) && !AbstractC22676k.m65745e(abstractC29840y, C29824j.f121906x)) {
                    return c23454a0;
                }
                c2595p0.f10091x = 1;
                return interfaceC13062m.emit(obj, c2595p0) == enumC31071a2 ? enumC31071a2 : c23454a0;
            case 2:
                if (interfaceC30057d instanceof C3382f) {
                    c3382f = (C3382f) interfaceC30057d;
                    int i18 = c3382f.f13207x;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c3382f.f13207x = i18 - Integer.MIN_VALUE;
                    } else {
                        c3382f = new C3382f(this, interfaceC30057d);
                    }
                } else {
                    c3382f = new C3382f(this, interfaceC30057d);
                }
                Object obj4 = c3382f.f13206w;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i19 = c3382f.f13207x;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj4);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj4);
                if (((Boolean) obj).booleanValue()) {
                    return c23454a0;
                }
                c3382f.f13207x = 1;
                return interfaceC13062m.emit(obj, c3382f) == enumC31071a3 ? enumC31071a3 : c23454a0;
            case 3:
                if (interfaceC30057d instanceof C4593n) {
                    c4593n = (C4593n) interfaceC30057d;
                    int i24 = c4593n.f18480x;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c4593n.f18480x = i24 - Integer.MIN_VALUE;
                    } else {
                        c4593n = new C4593n(this, interfaceC30057d);
                    }
                } else {
                    c4593n = new C4593n(this, interfaceC30057d);
                }
                Object obj5 = c4593n.f18479w;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i25 = c4593n.f18480x;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj5);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj5);
                long j7 = ((C39169a) obj).f168407a;
                C26711e c26711e = AbstractC4601v.f18506b;
                int i26 = (int) (3 & j7);
                int i27 = (((i26 & 2) >> 1) * 3) + ((i26 & 1) << 1);
                if (!(((((int) (j7 >> 33)) & ((1 << (i27 + 13)) - 1)) - 1 == 0) | ((((1 << (18 - i27)) - 1) & ((int) (j7 >> (i27 + 46)))) - 1 == 0))) {
                    boolean zM124761e = C39169a.m124761e(j7);
                    AbstractC12350b c26707a = C26708b.f106206a;
                    AbstractC12350b c26707a2 = zM124761e ? new C26707a(C39169a.m124765i(j7)) : c26707a;
                    if (C39169a.m124760d(j7)) {
                        c26707a = new C26707a(C39169a.m124764h(j7));
                    }
                    c26714h = new C26714h(c26707a2, c26707a);
                }
                if (c26714h == null) {
                    return c23454a0;
                }
                c4593n.f18480x = 1;
                return interfaceC13062m.emit(c26714h, c4593n) == enumC31071a4 ? enumC31071a4 : c23454a0;
            case 4:
                if (interfaceC30057d instanceof C11562t) {
                    c11562t = (C11562t) interfaceC30057d;
                    int i28 = c11562t.f37292x;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        c11562t.f37292x = i28 - Integer.MIN_VALUE;
                    } else {
                        c11562t = new C11562t(this, interfaceC30057d);
                    }
                } else {
                    c11562t = new C11562t(this, interfaceC30057d);
                }
                Object obj6 = c11562t.f37291w;
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i29 = c11562t.f37292x;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj6);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj6);
                if (!((Boolean) obj).booleanValue()) {
                    return c23454a0;
                }
                c11562t.f37292x = 1;
                return interfaceC13062m.emit(obj, c11562t) == enumC31071a5 ? enumC31071a5 : c23454a0;
            case 5:
                if (interfaceC30057d instanceof C13030e) {
                    c13030e = (C13030e) interfaceC30057d;
                    int i34 = c13030e.f45045y;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        c13030e.f45045y = i34 - Integer.MIN_VALUE;
                    } else {
                        c13030e = new C13030e(this, interfaceC30057d);
                    }
                } else {
                    c13030e = new C13030e(this, interfaceC30057d);
                }
                Object obj7 = c13030e.f45043w;
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i35 = c13030e.f45045y;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj7);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj7);
                AbstractC3006f0.m8721o(c13030e.getContext());
                c13030e.f45045y = 1;
                return interfaceC13062m.emit(obj, c13030e) == enumC31071a6 ? enumC31071a6 : c23454a0;
            case 6:
                return m117694b((InterfaceC13058l) obj, interfaceC30057d);
            case 7:
                if (interfaceC30057d instanceof C15083m7) {
                    c15083m7 = (C15083m7) interfaceC30057d;
                    int i36 = c15083m7.f56470x;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        c15083m7.f56470x = i36 - Integer.MIN_VALUE;
                    } else {
                        c15083m7 = new C15083m7(this, interfaceC30057d);
                    }
                } else {
                    c15083m7 = new C15083m7(this, interfaceC30057d);
                }
                Object obj8 = c15083m7.f56469w;
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i37 = c15083m7.f56470x;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj8);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj8);
                if (((Map) obj).isEmpty()) {
                    return c23454a0;
                }
                c15083m7.f56470x = 1;
                return interfaceC13062m.emit(obj, c15083m7) == enumC31071a7 ? enumC31071a7 : c23454a0;
            case 8:
                if (interfaceC30057d instanceof C15394n1) {
                    c15394n1 = (C15394n1) interfaceC30057d;
                    int i38 = c15394n1.f57844x;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        c15394n1.f57844x = i38 - Integer.MIN_VALUE;
                    } else {
                        c15394n1 = new C15394n1(this, interfaceC30057d);
                    }
                } else {
                    c15394n1 = new C15394n1(this, interfaceC30057d);
                }
                Object obj9 = c15394n1.f57843w;
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i39 = c15394n1.f57844x;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj9);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj9);
                C23465k c23465k = (C23465k) AbstractC25265s.m74100H0((List) obj);
                if (c23465k != null && (c23328a = (C23328a) c23465k.f92938x) != null) {
                    if (!c23328a.f92492b) {
                        c23328a = null;
                    }
                    if (c23328a != null) {
                        c26714h = c23328a.f92491a;
                    }
                }
                if (c26714h == null) {
                    return c23454a0;
                }
                c15394n1.f57844x = 1;
                return interfaceC13062m.emit(c26714h, c15394n1) == enumC31071a8 ? enumC31071a8 : c23454a0;
            case 9:
                if (interfaceC30057d instanceof C26081i) {
                    c26081i = (C26081i) interfaceC30057d;
                    int i44 = c26081i.f103287x;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        c26081i.f103287x = i44 - Integer.MIN_VALUE;
                    } else {
                        c26081i = new C26081i(this, interfaceC30057d);
                    }
                } else {
                    c26081i = new C26081i(this, interfaceC30057d);
                }
                Object obj10 = c26081i.f103286w;
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                int i45 = c26081i.f103287x;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj10);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj10);
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC15421s3) obj).isValid());
                c26081i.f103287x = 1;
                return interfaceC13062m.emit(boolValueOf, c26081i) == enumC31071a9 ? enumC31071a9 : c23454a0;
            case 10:
                if (interfaceC30057d instanceof C27458c) {
                    c27458c = (C27458c) interfaceC30057d;
                    int i46 = c27458c.f110658x;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        c27458c.f110658x = i46 - Integer.MIN_VALUE;
                    } else {
                        c27458c = new C27458c(this, interfaceC30057d);
                    }
                } else {
                    c27458c = new C27458c(this, interfaceC30057d);
                }
                Object obj11 = c27458c.f110657w;
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                int i47 = c27458c.f110658x;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj11);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj11);
                ArrayList arrayList = new ArrayList();
                for (Object obj12 : (List) obj) {
                    Object obj13 = ((C23465k) obj12).f92937w;
                    IdentifierSpec.Companion.getClass();
                    if (AbstractC22676k.m65745e(obj13, IdentifierSpec.SaveForFutureUse)) {
                        arrayList.add(obj12);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Boolean.valueOf(Boolean.parseBoolean(((C23328a) ((C23465k) it.next()).f92938x).f92491a)));
                }
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Boolean) it3.next()).booleanValue() ? EnumC29820h.f121893x : EnumC29820h.f121894y);
                }
                EnumC29820h enumC29820h = (EnumC29820h) AbstractC25265s.m74100H0(arrayList3);
                if (enumC29820h == null) {
                    enumC29820h = EnumC29820h.f121895z;
                }
                c27458c.f110658x = 1;
                return interfaceC13062m.emit(enumC29820h, c27458c) == enumC31071a10 ? enumC31071a10 : c23454a0;
            case 11:
                if (interfaceC30057d instanceof C27459d) {
                    c27459d = (C27459d) interfaceC30057d;
                    int i48 = c27459d.f110661x;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        c27459d.f110661x = i48 - Integer.MIN_VALUE;
                    } else {
                        c27459d = new C27459d(this, interfaceC30057d);
                    }
                } else {
                    c27459d = new C27459d(this, interfaceC30057d);
                }
                Object obj14 = c27459d.f110660w;
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                int i49 = c27459d.f110661x;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj14);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj14);
                Map mapM74000i0 = AbstractC25247g0.m74000i0((List) obj);
                c27459d.f110661x = 1;
                return interfaceC13062m.emit(mapM74000i0, c27459d) == enumC31071a11 ? enumC31071a11 : c23454a0;
            case 12:
                if (interfaceC30057d instanceof C28842a) {
                    c28842a = (C28842a) interfaceC30057d;
                    int i54 = c28842a.f116760x;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        c28842a.f116760x = i54 - Integer.MIN_VALUE;
                    } else {
                        c28842a = new C28842a(this, interfaceC30057d);
                    }
                } else {
                    c28842a = new C28842a(this, interfaceC30057d);
                }
                Object obj15 = c28842a.f116759w;
                EnumC31071a enumC31071a12 = EnumC31071a.f128113w;
                int i55 = c28842a.f116760x;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj15);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj15);
                DevicePreferences devicePreferences = (DevicePreferences) obj;
                c26714h = devicePreferences != null ? devicePreferences.getUserDevice() : null;
                c28842a.f116760x = 1;
                return interfaceC13062m.emit(c26714h, c28842a) == enumC31071a12 ? enumC31071a12 : c23454a0;
            case 13:
                if (interfaceC30057d instanceof C31822b) {
                    c31822b = (C31822b) interfaceC30057d;
                    int i56 = c31822b.f131843x;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        c31822b.f131843x = i56 - Integer.MIN_VALUE;
                    } else {
                        c31822b = new C31822b(this, interfaceC30057d);
                    }
                } else {
                    c31822b = new C31822b(this, interfaceC30057d);
                }
                Object obj16 = c31822b.f131842w;
                EnumC31071a enumC31071a13 = EnumC31071a.f128113w;
                int i57 = c31822b.f131843x;
                if (i57 != 0) {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj16);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj16);
                Location location = (Location) obj;
                if (location.getAltitude() != null) {
                    double longitude = location.getLongitude();
                    double latitude = location.getLatitude();
                    Double altitude = location.getAltitude();
                    AbstractC22676k.m65747g(altitude);
                    pointFromLngLat = Point.fromLngLat(longitude, latitude, altitude.doubleValue());
                    if (pointFromLngLat == null) {
                        pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
                    }
                } else {
                    pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
                }
                c31822b.f131843x = 1;
                return interfaceC13062m.emit(pointFromLngLat, c31822b) == enumC31071a13 ? enumC31071a13 : c23454a0;
            case 14:
                if (interfaceC30057d instanceof C31827g) {
                    c31827g = (C31827g) interfaceC30057d;
                    int i58 = c31827g.f131860x;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        c31827g.f131860x = i58 - Integer.MIN_VALUE;
                    } else {
                        c31827g = new C31827g(this, interfaceC30057d);
                    }
                } else {
                    c31827g = new C31827g(this, interfaceC30057d);
                }
                Object obj17 = c31827g.f131859w;
                EnumC31071a enumC31071a14 = EnumC31071a.f128113w;
                int i59 = c31827g.f131860x;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj17);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj17);
                Double bearing = ((Location) obj).getBearing();
                if (bearing == null) {
                    return c23454a0;
                }
                c31827g.f131860x = 1;
                return interfaceC13062m.emit(bearing, c31827g) == enumC31071a14 ? enumC31071a14 : c23454a0;
            case 15:
                if (interfaceC30057d instanceof C33367c) {
                    c33367c = (C33367c) interfaceC30057d;
                    int i64 = c33367c.f139264x;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        c33367c.f139264x = i64 - Integer.MIN_VALUE;
                    } else {
                        c33367c = new C33367c(this, interfaceC30057d);
                    }
                } else {
                    c33367c = new C33367c(this, interfaceC30057d);
                }
                Object obj18 = c33367c.f139263w;
                EnumC31071a enumC31071a15 = EnumC31071a.f128113w;
                int i65 = c33367c.f139264x;
                if (i65 != 0) {
                    if (i65 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj18);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj18);
                if (((PeerConnection.PeerConnectionState) obj) != PeerConnection.PeerConnectionState.CONNECTED) {
                    return c23454a0;
                }
                c33367c.f139264x = 1;
                return interfaceC13062m.emit(obj, c33367c) == enumC31071a15 ? enumC31071a15 : c23454a0;
            case 16:
                if (interfaceC30057d instanceof C33373d) {
                    c33373d = (C33373d) interfaceC30057d;
                    int i66 = c33373d.f139326x;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        c33373d.f139326x = i66 - Integer.MIN_VALUE;
                    } else {
                        c33373d = new C33373d(this, interfaceC30057d);
                    }
                } else {
                    c33373d = new C33373d(this, interfaceC30057d);
                }
                Object obj19 = c33373d.f139325w;
                EnumC31071a enumC31071a16 = EnumC31071a.f128113w;
                int i67 = c33373d.f139326x;
                if (i67 != 0) {
                    if (i67 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj19);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj19);
                c33373d.f139326x = 1;
                return interfaceC13062m.emit(c23454a0, c33373d) == enumC31071a16 ? enumC31071a16 : c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                if (interfaceC30057d instanceof C33445r0) {
                    c33445r0 = (C33445r0) interfaceC30057d;
                    int i68 = c33445r0.f139601x;
                    if ((i68 & Integer.MIN_VALUE) != 0) {
                        c33445r0.f139601x = i68 - Integer.MIN_VALUE;
                    } else {
                        c33445r0 = new C33445r0(this, interfaceC30057d);
                    }
                } else {
                    c33445r0 = new C33445r0(this, interfaceC30057d);
                }
                Object obj20 = c33445r0.f139600w;
                EnumC31071a enumC31071a17 = EnumC31071a.f128113w;
                int i69 = c33445r0.f139601x;
                if (i69 != 0) {
                    if (i69 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj20);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj20);
                Long l7 = (Long) obj;
                Duration durationM134260boximpl = Duration.m134260boximpl(DurationKt.toDuration((l7 != null ? l7.longValue() : 0L) / 1000, DurationUnit.SECONDS));
                c33445r0.f139601x = 1;
                return interfaceC13062m.emit(durationM134260boximpl, c33445r0) == enumC31071a17 ? enumC31071a17 : c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if (interfaceC30057d instanceof C33433o3) {
                    c33433o3 = (C33433o3) interfaceC30057d;
                    int i74 = c33433o3.f139569x;
                    if ((i74 & Integer.MIN_VALUE) != 0) {
                        c33433o3.f139569x = i74 - Integer.MIN_VALUE;
                    } else {
                        c33433o3 = new C33433o3(this, interfaceC30057d);
                    }
                } else {
                    c33433o3 = new C33433o3(this, interfaceC30057d);
                }
                Object obj21 = c33433o3.f139568w;
                EnumC31071a enumC31071a18 = EnumC31071a.f128113w;
                int i75 = c33433o3.f139569x;
                if (i75 == 0) {
                    AbstractC34132o.m107864I(obj21);
                    ((AbstractC11582b) obj).getClass();
                    EnumC11579a enumC11579a = EnumC11579a.f37356w;
                } else {
                    if (i75 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj21);
                }
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if (interfaceC30057d instanceof C33438p3) {
                    c33438p3 = (C33438p3) interfaceC30057d;
                    int i76 = c33438p3.f139587x;
                    if ((i76 & Integer.MIN_VALUE) != 0) {
                        c33438p3.f139587x = i76 - Integer.MIN_VALUE;
                    } else {
                        c33438p3 = new C33438p3(this, interfaceC30057d);
                    }
                } else {
                    c33438p3 = new C33438p3(this, interfaceC30057d);
                }
                Object obj22 = c33438p3.f139586w;
                EnumC31071a enumC31071a19 = EnumC31071a.f128113w;
                int i77 = c33438p3.f139587x;
                if (i77 != 0) {
                    if (i77 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj22);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj22);
                ((AbstractC11582b) obj).getClass();
                c33438p3.f139587x = 1;
                return interfaceC13062m.emit(null, c33438p3) == enumC31071a19 ? enumC31071a19 : c23454a0;
            case 20:
                if (interfaceC30057d instanceof C36744b) {
                    c36744b = (C36744b) interfaceC30057d;
                    int i78 = c36744b.f157265x;
                    if ((i78 & Integer.MIN_VALUE) != 0) {
                        c36744b.f157265x = i78 - Integer.MIN_VALUE;
                    } else {
                        c36744b = new C36744b(this, interfaceC30057d);
                    }
                } else {
                    c36744b = new C36744b(this, interfaceC30057d);
                }
                Object obj23 = c36744b.f157264w;
                EnumC31071a enumC31071a20 = EnumC31071a.f128113w;
                int i79 = c36744b.f157265x;
                if (i79 != 0) {
                    if (i79 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj23);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj23);
                if (((PeerConnection.PeerConnectionState) obj) != PeerConnection.PeerConnectionState.CONNECTED) {
                    return c23454a0;
                }
                c36744b.f157265x = 1;
                return interfaceC13062m.emit(obj, c36744b) == enumC31071a20 ? enumC31071a20 : c23454a0;
            case 21:
                if (interfaceC30057d instanceof C36746d) {
                    c36746d = (C36746d) interfaceC30057d;
                    int i83 = c36746d.f157271x;
                    if ((i83 & Integer.MIN_VALUE) != 0) {
                        c36746d.f157271x = i83 - Integer.MIN_VALUE;
                    } else {
                        c36746d = new C36746d(this, interfaceC30057d);
                    }
                } else {
                    c36746d = new C36746d(this, interfaceC30057d);
                }
                Object obj24 = c36746d.f157270w;
                EnumC31071a enumC31071a21 = EnumC31071a.f128113w;
                int i84 = c36746d.f157271x;
                if (i84 != 0) {
                    if (i84 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj24);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj24);
                for (Object obj25 : (List) obj) {
                    if (!((Boolean) ((C33392g2) obj25).f139429h.getValue()).booleanValue()) {
                        c26714h = obj25;
                        c36746d.f157271x = 1;
                        if (interfaceC13062m.emit(c26714h, c36746d) == enumC31071a21) {
                            return enumC31071a21;
                        }
                        return c23454a0;
                    }
                }
                c36746d.f157271x = 1;
                if (interfaceC13062m.emit(c26714h, c36746d) == enumC31071a21) {
                    return enumC31071a21;
                }
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                if (interfaceC30057d instanceof C36747e) {
                    c36747e = (C36747e) interfaceC30057d;
                    int i85 = c36747e.f157274x;
                    if ((i85 & Integer.MIN_VALUE) != 0) {
                        c36747e.f157274x = i85 - Integer.MIN_VALUE;
                    } else {
                        c36747e = new C36747e(this, interfaceC30057d);
                    }
                } else {
                    c36747e = new C36747e(this, interfaceC30057d);
                }
                Object obj26 = c36747e.f157273w;
                EnumC31071a enumC31071a22 = EnumC31071a.f128113w;
                int i86 = c36747e.f157274x;
                if (i86 != 0) {
                    if (i86 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj26);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj26);
                Boolean boolValueOf2 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                c36747e.f157274x = 1;
                return interfaceC13062m.emit(boolValueOf2, c36747e) == enumC31071a22 ? enumC31071a22 : c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                if (interfaceC30057d instanceof C37853u) {
                    c37853u = (C37853u) interfaceC30057d;
                    int i87 = c37853u.f162045x;
                    if ((i87 & Integer.MIN_VALUE) != 0) {
                        c37853u.f162045x = i87 - Integer.MIN_VALUE;
                    } else {
                        c37853u = new C37853u(this, interfaceC30057d);
                    }
                } else {
                    c37853u = new C37853u(this, interfaceC30057d);
                }
                Object obj27 = c37853u.f162044w;
                EnumC31071a enumC31071a23 = EnumC31071a.f128113w;
                int i88 = c37853u.f162045x;
                if (i88 != 0) {
                    if (i88 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj27);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj27);
                StripeIntent$Status stripeIntent$Status = (StripeIntent$Status) obj;
                if (stripeIntent$Status != null) {
                    switch (stripeIntent$Status.ordinal()) {
                        case 0:
                        case 1:
                        case 3:
                        case 4:
                        case 6:
                            enumC37847o = EnumC37847o.f162021y;
                            break;
                        case 2:
                            enumC37847o = EnumC37847o.f162019w;
                            break;
                        case 5:
                            enumC37847o = EnumC37847o.f162020x;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    enumC37847o = EnumC37847o.f162019w;
                }
                c37853u.f162045x = 1;
                return interfaceC13062m.emit(enumC37847o, c37853u) == enumC31071a23 ? enumC31071a23 : c23454a0;
            case 24:
                if (interfaceC30057d instanceof C37908m0) {
                    c37908m0 = (C37908m0) interfaceC30057d;
                    int i89 = c37908m0.f162302x;
                    if ((i89 & Integer.MIN_VALUE) != 0) {
                        c37908m0.f162302x = i89 - Integer.MIN_VALUE;
                    } else {
                        c37908m0 = new C37908m0(this, interfaceC30057d);
                    }
                } else {
                    c37908m0 = new C37908m0(this, interfaceC30057d);
                }
                Object obj28 = c37908m0.f162301w;
                EnumC31071a enumC31071a24 = EnumC31071a.f128113w;
                int i94 = c37908m0.f162302x;
                if (i94 != 0) {
                    if (i94 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj28);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj28);
                if (!(obj instanceof C41182d)) {
                    return c23454a0;
                }
                c37908m0.f162302x = 1;
                return interfaceC13062m.emit(obj, c37908m0) == enumC31071a24 ? enumC31071a24 : c23454a0;
            case 25:
                if (interfaceC30057d instanceof C37911n0) {
                    c37911n0 = (C37911n0) interfaceC30057d;
                    int i95 = c37911n0.f162309x;
                    if ((i95 & Integer.MIN_VALUE) != 0) {
                        c37911n0.f162309x = i95 - Integer.MIN_VALUE;
                    } else {
                        c37911n0 = new C37911n0(this, interfaceC30057d);
                    }
                } else {
                    c37911n0 = new C37911n0(this, interfaceC30057d);
                }
                Object obj29 = c37911n0.f162308w;
                EnumC31071a enumC31071a25 = EnumC31071a.f128113w;
                int i96 = c37911n0.f162309x;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj29);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj29);
                List listMo133829a = ((InterfaceC41183e) obj).mo133829a();
                c37911n0.f162309x = 1;
                return interfaceC13062m.emit(listMo133829a, c37911n0) == enumC31071a25 ? enumC31071a25 : c23454a0;
            case 26:
                if (interfaceC30057d instanceof C41195q) {
                    c41195q = (C41195q) interfaceC30057d;
                    int i97 = c41195q.f177725x;
                    if ((i97 & Integer.MIN_VALUE) != 0) {
                        c41195q.f177725x = i97 - Integer.MIN_VALUE;
                    } else {
                        c41195q = new C41195q(this, interfaceC30057d);
                    }
                } else {
                    c41195q = new C41195q(this, interfaceC30057d);
                }
                Object obj30 = c41195q.f177724w;
                EnumC31071a enumC31071a26 = EnumC31071a.f128113w;
                int i98 = c41195q.f177725x;
                if (i98 != 0) {
                    if (i98 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj30);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj30);
                if (!(obj instanceof C41182d)) {
                    return c23454a0;
                }
                c41195q.f177725x = 1;
                return interfaceC13062m.emit(obj, c41195q) == enumC31071a26 ? enumC31071a26 : c23454a0;
            default:
                if (interfaceC30057d instanceof C41196r) {
                    c41196r = (C41196r) interfaceC30057d;
                    int i99 = c41196r.f177728x;
                    if ((i99 & Integer.MIN_VALUE) != 0) {
                        c41196r.f177728x = i99 - Integer.MIN_VALUE;
                    } else {
                        c41196r = new C41196r(this, interfaceC30057d);
                    }
                } else {
                    c41196r = new C41196r(this, interfaceC30057d);
                }
                Object obj31 = c41196r.f177727w;
                EnumC31071a enumC31071a27 = EnumC31071a.f128113w;
                int i100 = c41196r.f177728x;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj31);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj31);
                C41182d c41182d = (C41182d) obj;
                C41180b c41180b = new C41180b(c41182d.f177692a, c41182d.f177693b);
                c41196r.f177728x = 1;
                return interfaceC13062m.emit(c41180b, c41196r) == enumC31071a27 ? enumC31071a27 : c23454a0;
        }
    }
}
