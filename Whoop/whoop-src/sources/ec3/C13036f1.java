package ec3;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3058t;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import d30.C11552o;
import fc3.AbstractC14371b;
import g20.C15270p;
import gm.C15990r;
import hc3.AbstractC17167b;
import i20.C17972q0;
import io.getstream.android.video.generated.models.CallEndedEvent;
import io.getstream.android.video.generated.models.LocalCallAcceptedPostEvent;
import io.getstream.android.video.generated.models.LocalCallRejectedPostEvent;
import io.getstream.android.video.generated.models.VideoEvent;
import j43.C21318b;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23468n;
import l83.C23470p;
import m83.AbstractC25265s;
import org.webrtc.PeerConnection;
import p005a3.C0271z0;
import p077d0.InterfaceC11372l;
import p161g.C14894a;
import p163g1.C15042i7;
import p163g1.C15093n7;
import p163g1.C15208z2;
import p238j0.C21078d;
import p238j0.C21079e;
import p238j0.C21080f;
import p238j0.C21081g;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.C21087m;
import p238j0.InterfaceC21082h;
import p390p1.C28617g1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p708hb2.C17095c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33487z2;
import t23.InterfaceC33377d3;
import w23.AbstractC36751i;
import w23.C36754l;
import w23.C36758p;
import x23.EnumC37870f;

/* JADX INFO: renamed from: ec3.f1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13036f1 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45057w;

    /* JADX INFO: renamed from: x */
    public final Object f45058x;

    /* JADX INFO: renamed from: y */
    public final Object f45059y;

    /* JADX INFO: renamed from: z */
    public final Object f45060z;

    /* JADX WARN: Multi-variable type inference failed */
    public C13036f1(InterfaceC13062m interfaceC13062m, InterfaceC4339a interfaceC4339a, C36758p c36758p) {
        this.f45057w = 7;
        this.f45058x = interfaceC13062m;
        this.f45059y = (AbstractC22680m) interfaceC4339a;
        this.f45060z = c36758p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public Object m36560b(Map map, InterfaceC30057d interfaceC30057d) {
        C15042i7 c15042i7;
        C15093n7 c15093n7 = (C15093n7) this.f45059y;
        if (interfaceC30057d instanceof C15042i7) {
            c15042i7 = (C15042i7) interfaceC30057d;
            int i13 = c15042i7.f56312z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15042i7.f56312z = i13 - Integer.MIN_VALUE;
            } else {
                c15042i7 = new C15042i7(this, interfaceC30057d);
            }
        } else {
            c15042i7 = new C15042i7(this, interfaceC30057d);
        }
        Object obj = c15042i7.f56310x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15042i7.f56312z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                Float fM60433g = AbstractC21478l0.m60433g(this.f45058x, map);
                if (fM60433g == null) {
                    throw new IllegalArgumentException("The target value must have an associated anchor.");
                }
                float fFloatValue = fM60433g.floatValue();
                InterfaceC11372l interfaceC11372l = (InterfaceC11372l) this.f45060z;
                c15042i7.f56309w = map;
                c15042i7.f56312z = 1;
                if (c15093n7.m43162a(fFloatValue, interfaceC11372l, c15042i7) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = c15042i7.f56309w;
                AbstractC34132o.m107864I(obj);
            }
            float fM87022x = c15093n7.f56514g.m87022x();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (Math.abs(((Number) entry.getKey()).floatValue() - fM87022x) < 0.5f) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Object objM74098G0 = AbstractC25265s.m74098G0(linkedHashMap.values());
            if (objM74098G0 == null) {
                objM74098G0 = c15093n7.f56510c.getValue();
            }
            c15093n7.m43164c(objM74098G0);
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            float fM87022x2 = c15093n7.f56514g.m87022x();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (Math.abs(((Number) entry2.getKey()).floatValue() - fM87022x2) < 0.5f) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Object objM74098G1 = AbstractC25265s.m74098G0(linkedHashMap2.values());
            if (objM74098G1 == null) {
                objM74098G1 = c15093n7.f56510c.getValue();
            }
            c15093n7.m43164c(objM74098G1);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r4v6, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C36754l c36754l;
        EnumC37870f enumC37870f;
        switch (this.f45057w) {
            case 0:
                C22669g0 c22669g0 = (C22669g0) this.f45058x;
                InterfaceC13075p1 interfaceC13075p1 = (InterfaceC13075p1) c22669g0.f89336w;
                if (interfaceC13075p1 != null) {
                    ((C13045h2) interfaceC13075p1).m36570j(obj);
                } else {
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f45059y;
                    C3058t c3058t = (C3058t) this.f45060z;
                    C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(obj);
                    c3058t.m8807L(new C23468n(new C13081r1(c13045h2M36593c, AbstractC3006f0.m8725s(interfaceC2994c0.getCoroutineContext()))));
                    c22669g0.f89336w = c13045h2M36593c;
                }
                return C23454a0.f92919a;
            case 1:
                Object objM41040c = AbstractC14371b.m41040c((InterfaceC30063j) this.f45058x, obj, this.f45059y, (C11552o) this.f45060z, interfaceC30057d);
                return objM41040c == EnumC31071a.f128113w ? objM41040c : C23454a0.f92919a;
            case 2:
                InterfaceC21082h interfaceC21082h = (InterfaceC21082h) obj;
                ArrayList arrayList = (ArrayList) this.f45058x;
                if (interfaceC21082h instanceof C21080f) {
                    arrayList.add(interfaceC21082h);
                } else if (interfaceC21082h instanceof C21081g) {
                    arrayList.remove(((C21081g) interfaceC21082h).f79946a);
                } else if (interfaceC21082h instanceof C21078d) {
                    arrayList.add(interfaceC21082h);
                } else if (interfaceC21082h instanceof C21079e) {
                    arrayList.remove(((C21079e) interfaceC21082h).f79945a);
                } else if (interfaceC21082h instanceof C21086l) {
                    arrayList.add(interfaceC21082h);
                } else if (interfaceC21082h instanceof C21087m) {
                    arrayList.remove(((C21087m) interfaceC21082h).f79950a);
                } else if (interfaceC21082h instanceof C21085k) {
                    arrayList.remove(((C21085k) interfaceC21082h).f79948a);
                }
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f45059y, null, null, new C11552o((C15208z2) this.f45060z, (InterfaceC21082h) AbstractC25265s.m74114R0(arrayList), null, 17), 3);
                return C23454a0.f92919a;
            case 3:
                return m36560b((Map) obj, interfaceC30057d);
            case 4:
                C14894a c14894a = (C14894a) obj;
                if (((List) ((InterfaceC28601c1) this.f45058x).getValue()).size() > 1) {
                    ((InterfaceC28601c1) this.f45059y).setValue(Boolean.TRUE);
                    ((C28617g1) ((InterfaceC28690z0) this.f45060z)).m87023y(c14894a.f55564c);
                }
                return C23454a0.f92919a;
            case 5:
                String str = (String) obj;
                if (str != null) {
                    C17972q0 c17972q0 = (C17972q0) this.f45058x;
                    InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f45059y;
                    C17095c c17095c = (C17095c) this.f45060z;
                    C2996c2 c2996c2 = c17972q0.f69795a;
                    InterfaceC30057d interfaceC30057d2 = null;
                    if (c2996c2 != null) {
                        c2996c2.cancel((CancellationException) null);
                    }
                    if (str.length() >= 2) {
                        c17972q0.f69795a = AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new C15270p(c17095c, str, interfaceC30057d2, 18), 3);
                    }
                }
                return C23454a0.f92919a;
            case 6:
                VideoEvent videoEvent = (VideoEvent) obj;
                C15990r c15990r = (C15990r) this.f45058x;
                C23470p c23470p = (C23470p) c15990r.f60514z;
                C21318b c21318b = (C21318b) this.f45059y;
                C0271z0 c0271z0 = (C0271z0) this.f45060z;
                C33366b4 c33366b4 = (C33366b4) c15990r.f60513y;
                if (videoEvent instanceof LocalCallAcceptedPostEvent) {
                    String id4 = ((LocalCallAcceptedPostEvent) videoEvent).getUser().getId();
                    String strM105800r = c33366b4.m105800r();
                    C2345k c2345k = (C2345k) c23470p.getValue();
                    InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                    String str2 = c2345k.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                        c2345k.f9274b.log(enumC2341g, str2, "[handleIncomingCallAcceptedByMeOnAnotherDevice]", null);
                    }
                    InterfaceC33377d3 interfaceC33377d3 = (InterfaceC33377d3) ((C33368c0) c15990r.f60512x).f139302p.f139618G.getValue();
                    if (AbstractC22676k.m65745e(id4, strM105800r) && (interfaceC33377d3 instanceof C33487z2)) {
                        c21318b.invoke();
                    }
                } else if (videoEvent instanceof LocalCallRejectedPostEvent) {
                    LocalCallRejectedPostEvent localCallRejectedPostEvent = (LocalCallRejectedPostEvent) videoEvent;
                    String id5 = localCallRejectedPostEvent.getUser().getId();
                    String strM105800r2 = c33366b4.m105800r();
                    String id6 = AbstractC35903f.m114002V(localCallRejectedPostEvent.getCall().getCreatedBy()).getId();
                    boolean z4 = c33366b4.f139248U.f139405h.getValue() != null;
                    C2345k c2345k2 = (C2345k) c23470p.getValue();
                    InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
                    String str3 = c2345k2.f9273a;
                    EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                        c2345k2.f9274b.log(enumC2341g2, str3, "[handleIncomingCallRejectedByMeOrCaller] rejectedByUserId == myUserId :" + AbstractC22676k.m65745e(id5, strM105800r2) + ", rejectedByUserId == createdByUserId :" + AbstractC22676k.m65745e(id5, id6), null);
                    }
                    if (AbstractC22676k.m65745e(id5, strM105800r2) || AbstractC22676k.m65745e(id5, id6)) {
                        if (z4) {
                            c0271z0.invoke();
                        } else {
                            c21318b.invoke();
                        }
                    }
                } else if (videoEvent instanceof CallEndedEvent) {
                    c21318b.invoke();
                }
                return C23454a0.f92919a;
            default:
                if (interfaceC30057d instanceof C36754l) {
                    c36754l = (C36754l) interfaceC30057d;
                    int i13 = c36754l.f157294x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c36754l.f157294x = i13 - Integer.MIN_VALUE;
                    } else {
                        c36754l = new C36754l(this, interfaceC30057d);
                    }
                } else {
                    c36754l = new C36754l(this, interfaceC30057d);
                }
                Object obj2 = c36754l.f157293w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c36754l.f157294x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f45058x;
                    EnumC37870f enumC37870f2 = (EnumC37870f) ((AbstractC22680m) this.f45059y).invoke();
                    ((C36758p) this.f45060z).getClass();
                    int i15 = AbstractC36751i.f157286a[((PeerConnection.PeerConnectionState) obj).ordinal()];
                    if (i15 != 1) {
                        enumC37870f = (i15 == 2 || i15 == 3) ? EnumC37870f.f162185y : null;
                    } else {
                        enumC37870f = EnumC37870f.f162184x;
                    }
                    EnumC37870f enumC37870f3 = EnumC37870f.f162185y;
                    if (enumC37870f2 != enumC37870f3 || enumC37870f != enumC37870f3) {
                        c36754l.f157294x = 1;
                        if (interfaceC13062m.emit(obj, c36754l) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C13036f1(Object obj, Object obj2, Object obj3, int i13) {
        this.f45057w = i13;
        this.f45058x = obj;
        this.f45059y = obj2;
        this.f45060z = obj3;
    }

    public C13036f1(InterfaceC13062m interfaceC13062m, InterfaceC30063j interfaceC30063j) {
        this.f45057w = 1;
        this.f45058x = interfaceC30063j;
        this.f45059y = AbstractC17167b.m48486l(interfaceC30063j);
        this.f45060z = new C11552o(interfaceC13062m, (InterfaceC30057d) null, 15);
    }
}
