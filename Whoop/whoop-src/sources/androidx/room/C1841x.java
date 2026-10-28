package androidx.room;

import a00.C0072g;
import a30.C0332w0;
import android.content.Intent;
import android.net.Uri;
import androidx.health.platform.client.proto.C1533u;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.gms.tasks.Task;
import com.mapbox.geojson.Point;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.link.LinkActivity;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import com.stripe.android.paymentsheet.PaymentOptionsActivity;
import com.stripe.android.paymentsheet.PaymentSheetActivity;
import d00.C11433l;
import d30.C11561s0;
import d30.C11564u;
import dc3.InterfaceC11936u;
import e30.AbstractC12605c;
import e33.C12645n;
import e33.C12659u;
import e33.C12662v0;
import e93.AbstractC12889b;
import ec3.C13020b1;
import ec3.C13025c2;
import ec3.C13086t0;
import ec3.EnumC13102y1;
import ec3.InterfaceC13062m;
import g40.InterfaceC15421s3;
import h20.AbstractC16632b4;
import h20.AbstractC16700n0;
import h20.C16664h0;
import h20.C16739t3;
import h40.C16845k;
import j43.C21318b;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import m63.C25126d;
import m83.AbstractC25265s;
import n00.C26075c;
import n00.C26080h;
import n00.C26083k;
import n83.C26466i;
import org.webrtc.PeerConnection;
import p002a0.C0047q0;
import p005a3.AbstractC0201g;
import p028b4.C2698i;
import p077d0.C11344e;
import p098dt.AbstractC12350b;
import p181h2.C16617b;
import p236j.AbstractC21065d;
import p238j0.C21078d;
import p238j0.C21079e;
import p238j0.C21080f;
import p238j0.C21081g;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.C21087m;
import p238j0.InterfaceC21082h;
import p279kd.C22379f;
import p292l1.C23161q4;
import p292l1.C23176t1;
import p390p1.InterfaceC28601c1;
import p470rv.C31833m;
import p470rv.C31838r;
import p505ts.AbstractC34132o;
import p510u0.C34357t0;
import p599wz.AbstractC37747q;
import p599wz.C37708d;
import p599wz.C37726j;
import p599wz.EnumC37705c;
import p631xz.C38744u;
import p631xz.C38747x;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import sz.C33161z;
import t23.C33359a3;
import t23.C33365b3;
import t23.C33366b4;
import t23.C33371c3;
import t23.C33376d2;
import t23.C33392g2;
import t23.C33410k0;
import t23.C33450s0;
import t23.C33459u;
import t23.C33477x2;
import t23.C33487z2;
import t23.InterfaceC33377d3;
import w23.AbstractC36764v;
import w23.C36745c;
import w23.C36753k;
import w23.C36755m;
import w23.C36758p;
import w23.C36761s;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: androidx.room.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C1841x implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7206w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f7207x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f7208y;

    public /* synthetic */ C1841x(int i13, Object obj, Object obj2) {
        this.f7206w = i13;
        this.f7207x = obj;
        this.f7208y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m5458b(int i13, InterfaceC30057d interfaceC30057d) {
        C13025c2 c13025c2;
        if (interfaceC30057d instanceof C13025c2) {
            c13025c2 = (C13025c2) interfaceC30057d;
            int i14 = c13025c2.f45030y;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c13025c2.f45030y = i14 - Integer.MIN_VALUE;
            } else {
                c13025c2 = new C13025c2(this, interfaceC30057d);
            }
        } else {
            c13025c2 = new C13025c2(this, interfaceC30057d);
        }
        Object obj = c13025c2.f45028w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c13025c2.f45030y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i15 != 0) {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        if (i13 > 0) {
            C22659b0 c22659b0 = (C22659b0) this.f7208y;
            if (!c22659b0.f89329w) {
                c22659b0.f89329w = true;
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f7207x;
                EnumC13102y1 enumC13102y1 = EnumC13102y1.f45274w;
                c13025c2.f45030y = 1;
                if (interfaceC13062m.emit(enumC13102y1, c13025c2) == enumC31071a) {
                    return enumC31071a;
                }
            }
        }
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m5459c(AbstractC16700n0 result, InterfaceC30057d interfaceC30057d) throws IOException {
        C16664h0 c16664h0;
        C1841x c1841x;
        if (interfaceC30057d instanceof C16664h0) {
            c16664h0 = (C16664h0) interfaceC30057d;
            int i13 = c16664h0.f64080z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16664h0.f64080z = i13 - Integer.MIN_VALUE;
            } else {
                c16664h0 = new C16664h0(this, interfaceC30057d);
            }
        } else {
            c16664h0 = new C16664h0(this, interfaceC30057d);
        }
        Object obj = c16664h0.f64078x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16664h0.f64080z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            PaymentOptionsActivity paymentOptionsActivity = (PaymentOptionsActivity) this.f7207x;
            AbstractC22676k.m65750j(result, "result");
            paymentOptionsActivity.setResult(result.f64225w, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("extra_activity_result", result))));
            C16845k c16845k = (C16845k) this.f7208y;
            c16664h0.f64077w = this;
            c16664h0.f64080z = 1;
            if (c16845k.m47442b(c16664h0) == enumC31071a) {
                return enumC31071a;
            }
            c1841x = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1841x = c16664h0.f64077w;
            AbstractC34132o.m107864I(obj);
        }
        for (Object obj2 : (Iterable) ((PaymentOptionsActivity) c1841x.f7207x).mo7466o().f43009M.f127269f.getValue()) {
            if (obj2 instanceof Closeable) {
                ((Closeable) obj2).close();
            }
        }
        ((PaymentOptionsActivity) c1841x.f7207x).finish();
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m5460e(AbstractC16632b4 abstractC16632b4, InterfaceC30057d interfaceC30057d) throws IOException {
        C16739t3 c16739t3;
        C1841x c1841x;
        if (interfaceC30057d instanceof C16739t3) {
            c16739t3 = (C16739t3) interfaceC30057d;
            int i13 = c16739t3.f64297z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16739t3.f64297z = i13 - Integer.MIN_VALUE;
            } else {
                c16739t3 = new C16739t3(this, interfaceC30057d);
            }
        } else {
            c16739t3 = new C16739t3(this, interfaceC30057d);
        }
        Object obj = c16739t3.f64295x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16739t3.f64297z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            ((PaymentSheetActivity) this.f7207x).m16861r(abstractC16632b4);
            C16845k c16845k = (C16845k) this.f7208y;
            c16739t3.f64294w = this;
            c16739t3.f64297z = 1;
            if (c16845k.m47442b(c16739t3) == enumC31071a) {
                return enumC31071a;
            }
            c1841x = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1841x = c16739t3.f64294w;
            AbstractC34132o.m107864I(obj);
        }
        for (Object obj2 : (Iterable) ((PaymentSheetActivity) c1841x.f7207x).mo7466o().f43009M.f127269f.getValue()) {
            if (obj2 instanceof Closeable) {
                ((Closeable) obj2).close();
            }
        }
        ((PaymentSheetActivity) c1841x.f7207x).finish();
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0291  */
    /* JADX WARN: Code duplicated, block: B:198:0x03be  */
    /* JADX WARN: Code duplicated, block: B:270:0x050d  */
    /* JADX WARN: Code duplicated, block: B:291:0x0564  */
    /* JADX WARN: Code duplicated, block: B:315:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0133  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [c93.m, java.lang.Object] */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C1838w c1838w;
        C13086t0 c13086t0;
        InterfaceC13062m interfaceC13062m;
        C13020b1 c13020b1;
        C1841x c1841x;
        C26080h c26080h;
        C33459u c33459u;
        C36745c c36745c;
        C36753k c36753k;
        C36755m c36755m;
        C38744u c38744u;
        InterfaceC13062m interfaceC13062m2;
        Object obj2 = obj;
        int i13 = this.f7206w;
        Object[] objArr = 0;
        ?? r14 = this.f7208y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f7207x;
        switch (i13) {
            case 0:
                if (interfaceC30057d instanceof C1838w) {
                    c1838w = (C1838w) interfaceC30057d;
                    int i14 = c1838w.f7200x;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1838w.f7200x = i14 - Integer.MIN_VALUE;
                    } else {
                        c1838w = new C1838w(this, interfaceC30057d);
                    }
                } else {
                    c1838w = new C1838w(this, interfaceC30057d);
                }
                Object obj4 = c1838w.f7199w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = c1838w.f7200x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj4);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj4);
                InterfaceC13062m interfaceC13062m3 = (InterfaceC13062m) obj3;
                Set set = (Set) obj2;
                C26466i c26466i = new C26466i();
                for (String str : (String[]) r14) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (AbstractC39421y.m125921F(str, (String) it.next(), true)) {
                            c26466i.add(str);
                        }
                    }
                }
                C26466i c26466iM34586g = AbstractC12350b.m34586g(c26466i);
                C26466i c26466i2 = c26466iM34586g.f105120w.isEmpty() ? null : c26466iM34586g;
                if (c26466i2 == null) {
                    return c23454a0;
                }
                c1838w.f7200x = 1;
                return interfaceC13062m3.emit(c26466i2, c1838w) == enumC31071a ? enumC31071a : c23454a0;
            case 1:
                ((Boolean) obj2).getClass();
                ((AbstractC12605c) obj3).f43016T.m47279a(((C11561s0) ((InterfaceC4339a) ((C11564u) r14).f37313s.f104635y).invoke()).f37290f, true);
                return c23454a0;
            case 2:
                if (interfaceC30057d instanceof C13086t0) {
                    c13086t0 = (C13086t0) interfaceC30057d;
                    int i16 = c13086t0.f45214x;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c13086t0.f45214x = i16 - Integer.MIN_VALUE;
                    } else {
                        c13086t0 = new C13086t0(this, interfaceC30057d);
                    }
                } else {
                    c13086t0 = new C13086t0(this, interfaceC30057d);
                }
                Object obj5 = c13086t0.f45213w;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i17 = c13086t0.f45214x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj5);
                    InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) obj3;
                    c13086t0.f45215y = interfaceC13062m4;
                    c13086t0.f45214x = 1;
                    Object objInvoke = r14.invoke(obj2, c13086t0);
                    if (objInvoke != enumC31071a2) {
                        obj5 = objInvoke;
                        interfaceC13062m = interfaceC13062m4;
                    }
                    return enumC31071a2;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj5);
                    return c23454a0;
                }
                interfaceC13062m = c13086t0.f45215y;
                AbstractC34132o.m107864I(obj5);
                c13086t0.f45215y = null;
                c13086t0.f45214x = 2;
                if (interfaceC13062m.emit(obj5, c13086t0) != enumC31071a2) {
                    return c23454a0;
                }
                return enumC31071a2;
            case 3:
                if (interfaceC30057d instanceof C13020b1) {
                    c13020b1 = (C13020b1) interfaceC30057d;
                    int i18 = c13020b1.f45017y;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c13020b1.f45017y = i18 - Integer.MIN_VALUE;
                    } else {
                        c13020b1 = new C13020b1(this, interfaceC30057d);
                    }
                } else {
                    c13020b1 = new C13020b1(this, interfaceC30057d);
                }
                Object objInvoke2 = c13020b1.f45016x;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i19 = c13020b1.f45017y;
                if (i19 == 0) {
                    AbstractC34132o.m107864I(objInvoke2);
                    c13020b1.f45015w = this;
                    c13020b1.f45014E = obj2;
                    c13020b1.f45017y = 1;
                    objInvoke2 = ((InterfaceC4351m) obj3).invoke(obj2, c13020b1);
                    if (objInvoke2 == enumC31071a3) {
                        return enumC31071a3;
                    }
                    c1841x = this;
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = c13020b1.f45014E;
                    c1841x = c13020b1.f45015w;
                    AbstractC34132o.m107864I(objInvoke2);
                }
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return c23454a0;
                }
                ((C22669g0) c1841x.f7208y).f89336w = obj2;
                throw new AbortFlowException(c1841x);
            case 4:
                return m5458b(((Number) obj2).intValue(), interfaceC30057d);
            case 5:
                long j7 = ((C16617b) obj2).f63937a;
                C11344e c11344e = (C11344e) obj3;
                if ((((C16617b) c11344e.m30549e()).f63937a & 9223372034707292159L) == 9205357640488583168L || (j7 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((C16617b) c11344e.m30549e()).f63937a & 4294967295L)) == Float.intBitsToFloat((int) (j7 & 4294967295L))) {
                    Object objM30551g = c11344e.m30551g(new C16617b(j7), interfaceC30057d);
                    return objM30551g == EnumC31071a.f128113w ? objM30551g : c23454a0;
                }
                AbstractC3006f0.m8732z((InterfaceC2994c0) r14, null, null, new C2698i(c11344e, j7, (InterfaceC30057d) null, 1), 3);
                return c23454a0;
            case 6:
                return m5459c((AbstractC16700n0) obj2, interfaceC30057d);
            case 7:
                return m5460e((AbstractC16632b4) obj2, interfaceC30057d);
            case 8:
                InterfaceC21082h interfaceC21082h = (InterfaceC21082h) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                if (interfaceC21082h instanceof C21078d) {
                    arrayList.add(interfaceC21082h);
                } else if (interfaceC21082h instanceof C21079e) {
                    arrayList.remove(((C21079e) interfaceC21082h).f79945a);
                }
                ((InterfaceC28601c1) r14).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return c23454a0;
            case 9:
                InterfaceC21082h interfaceC21082h2 = (InterfaceC21082h) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (interfaceC21082h2 instanceof C21078d) {
                    arrayList2.add(interfaceC21082h2);
                } else if (interfaceC21082h2 instanceof C21079e) {
                    arrayList2.remove(((C21079e) interfaceC21082h2).f79945a);
                }
                boolean z4 = !arrayList2.isEmpty();
                C23176t1 c23176t1 = (C23176t1) r14;
                if (z4 != c23176t1.f91681U) {
                    c23176t1.f91681U = z4;
                    c23176t1.m67137b1();
                }
                return c23454a0;
            case 10:
                InterfaceC21082h interfaceC21082h3 = (InterfaceC21082h) obj2;
                C22665e0 c22665e0 = (C22665e0) obj3;
                if (interfaceC21082h3 instanceof C21086l) {
                    c22665e0.f89334w++;
                } else if ((interfaceC21082h3 instanceof C21087m) || (interfaceC21082h3 instanceof C21085k)) {
                    c22665e0.f89334w--;
                }
                boolean z13 = c22665e0.f89334w > 0;
                C23161q4 c23161q4 = (C23161q4) r14;
                if (c23161q4.f91612R != z13) {
                    c23161q4.f91612R = z13;
                    AbstractC0201g.m509i(c23161q4);
                }
                return c23454a0;
            case 11:
                if (interfaceC30057d instanceof C26080h) {
                    c26080h = (C26080h) interfaceC30057d;
                    int i24 = c26080h.f103284x;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c26080h.f103284x = i24 - Integer.MIN_VALUE;
                    } else {
                        c26080h = new C26080h(this, interfaceC30057d);
                    }
                } else {
                    c26080h = new C26080h(this, interfaceC30057d);
                }
                Object obj6 = c26080h.f103283w;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i25 = c26080h.f103284x;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj6);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj6);
                InterfaceC13062m interfaceC13062m5 = (InterfaceC13062m) obj3;
                Boolean boolValueOf = Boolean.valueOf(((C26075c) ((C26083k) r14).f103304O.f45200w.getValue()).f103260c ? ((InterfaceC15421s3) obj2).isValid() : true);
                c26080h.f103284x = 1;
                return interfaceC13062m5.emit(boolValueOf, c26080h) == enumC31071a4 ? enumC31071a4 : c23454a0;
            case 12:
                InterfaceC33377d3 interfaceC33377d3 = (InterfaceC33377d3) obj2;
                C0072g c0072g = (C0072g) obj3;
                C2345k c2345k = (C2345k) ((C23470p) c0072g.f221E).getValue();
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                String str2 = c2345k.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    c2345k.f9274b.log(enumC2341g, str2, "Ringing state: " + interfaceC33377d3, null);
                }
                C33366b4 c33366b4 = (C33366b4) c0072g.f225z;
                C0332w0 c0332w0 = (C0332w0) c0072g.f224y;
                C21318b c21318b = (C21318b) r14;
                if (interfaceC33377d3 instanceof C33487z2) {
                    if (!((C33487z2) interfaceC33377d3).f139814a) {
                        c33366b4.f139240M.getClass();
                        if (c0332w0 != null) {
                            c0332w0.m842E((Uri) c33366b4.f139239L.f86569a.f36753x);
                        }
                    } else if (c0332w0 != null) {
                        c0332w0.m846I();
                    }
                } else if (interfaceC33377d3 instanceof C33359a3) {
                    if (((C33359a3) interfaceC33377d3).f139208a) {
                        if (c0332w0 != null) {
                            c0332w0.m846I();
                        }
                    } else if (c0332w0 != null) {
                        c0332w0.m842E((Uri) c33366b4.f139239L.f86569a.f36754y);
                    }
                } else if (interfaceC33377d3 instanceof C33477x2) {
                    if (c0332w0 != null) {
                        c0332w0.m846I();
                    }
                } else if (interfaceC33377d3 instanceof C33365b3) {
                    AbstractC3006f0.m8732z(c33366b4.f139260x, null, null, new C22379f((Object) c0072g, (InterfaceC30057d) (objArr == true ? 1 : 0), 13), 3);
                    if (c0332w0 != null) {
                        c0332w0.m846I();
                    }
                    c21318b.invoke();
                } else if (interfaceC33377d3 instanceof C33371c3) {
                    if (c0332w0 != null) {
                        c0332w0.m846I();
                    }
                } else if (c0332w0 != null) {
                    c0332w0.m846I();
                }
                return c23454a0;
            case 13:
                Point it3 = (Point) obj2;
                AbstractC22676k.m65749i(it3, "it");
                Point[] pointArr = {it3};
                ((C25126d) r14).getClass();
                C31838r c31838r = ((C31833m) obj3).f131892y;
                if (c31838r != null) {
                    c31838r.m98912e((Point[]) Arrays.copyOf(pointArr, 1));
                }
                return c23454a0;
            case 14:
                Task task = (Task) obj2;
                if (task != null) {
                    ((AbstractC21065d) obj3).mo4052a(task, null);
                    int i26 = GooglePayLauncherActivity.f22184z;
                    C33161z c33161zM16842p = ((GooglePayLauncherActivity) r14).m16842p();
                    c33161zM16842p.f138283H.m5004e(Boolean.TRUE, "has_launched");
                    c33161zM16842p.f138288M.mo36564a(null);
                }
                return c23454a0;
            case 15:
                if (interfaceC30057d instanceof C33459u) {
                    c33459u = (C33459u) interfaceC30057d;
                    int i27 = c33459u.f139716x;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        c33459u.f139716x = i27 - Integer.MIN_VALUE;
                    } else {
                        c33459u = new C33459u(this, interfaceC30057d);
                    }
                } else {
                    c33459u = new C33459u(this, interfaceC30057d);
                }
                Object obj7 = c33459u.f139715w;
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i28 = c33459u.f139716x;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj7);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj7);
                C23465k c23465k = new C23465k((C12645n) r14, (PeerConnection.IceConnectionState) obj2);
                c33459u.f139716x = 1;
                return ((InterfaceC13062m) obj3).emit(c23465k, c33459u) == enumC31071a5 ? enumC31071a5 : c23454a0;
            case 16:
                Map map = (Map) obj2;
                C33450s0 c33450s0 = (C33450s0) obj3;
                C2345k c2345kM105860b = c33450s0.m105860b();
                InterfaceC2339e interfaceC2339e2 = c2345kM105860b.f9275c;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                String str3 = c2345kM105860b.f9273a;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                    InterfaceC2344j interfaceC2344j = c2345kM105860b.f9274b;
                    int size = map.size();
                    ArrayList arrayList3 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        Object value = ((C33392g2) entry.getValue()).f139446y.getValue();
                        C33376d2 c33376d2 = (C33376d2) ((C33392g2) entry.getValue()).f139419K.f45200w.getValue();
                        arrayList3.add(value + " - " + (c33376d2 != null ? Boolean.valueOf(c33376d2.f139334c) : null));
                    }
                    interfaceC2344j.log(enumC2341g2, str3, "[livestreamFlow] #track; participants: " + size + " =>" + arrayList3, null);
                }
                C33410k0.m105855f(c33450s0, (InterfaceC11936u) r14);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC21082h interfaceC21082h4 = (InterfaceC21082h) obj2;
                C34357t0 c34357t0 = (C34357t0) r14;
                C0047q0 c0047q0 = (C0047q0) obj3;
                if ((interfaceC21082h4 instanceof C21080f) || (interfaceC21082h4 instanceof C21078d) || (interfaceC21082h4 instanceof C21086l)) {
                    c0047q0.m98a(interfaceC21082h4);
                } else if (interfaceC21082h4 instanceof C21081g) {
                    c0047q0.m106i(((C21081g) interfaceC21082h4).f79946a);
                } else if (interfaceC21082h4 instanceof C21079e) {
                    c0047q0.m106i(((C21079e) interfaceC21082h4).f79945a);
                } else if (interfaceC21082h4 instanceof C21087m) {
                    c0047q0.m106i(((C21087m) interfaceC21082h4).f79950a);
                } else if (interfaceC21082h4 instanceof C21085k) {
                    c0047q0.m106i(((C21085k) interfaceC21082h4).f79948a);
                }
                Object[] objArr2 = c0047q0.f136a;
                int i29 = c0047q0.f137b;
                int i34 = 0;
                for (int i35 = 0; i35 < i29; i35++) {
                    InterfaceC21082h interfaceC21082h5 = (InterfaceC21082h) objArr2[i35];
                    if (interfaceC21082h5 instanceof C21080f) {
                        c34357t0.getClass();
                        i34 |= 2;
                    } else if (interfaceC21082h5 instanceof C21078d) {
                        c34357t0.getClass();
                        i34 |= 1;
                    } else if (interfaceC21082h5 instanceof C21086l) {
                        c34357t0.getClass();
                        i34 |= 4;
                    }
                }
                c34357t0.f144353b.m87025y(i34);
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ManageActivity manageActivity = (ManageActivity) obj3;
                Boolean bool = Boolean.TRUE;
                ManageActivity.m16852p(manageActivity, AbstractC22676k.m65745e((Boolean) obj2, bool));
                manageActivity.finish();
                ((InterfaceC28601c1) r14).setValue(bool);
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if (interfaceC30057d instanceof C36745c) {
                    c36745c = (C36745c) interfaceC30057d;
                    int i36 = c36745c.f157268x;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        c36745c.f157268x = i36 - Integer.MIN_VALUE;
                    } else {
                        c36745c = new C36745c(this, interfaceC30057d);
                    }
                } else {
                    c36745c = new C36745c(this, interfaceC30057d);
                }
                Object obj8 = c36745c.f157267w;
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i37 = c36745c.f157268x;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj8);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj8);
                c36745c.f157268x = 1;
                return ((InterfaceC13062m) obj3).emit((C12662v0) r14, c36745c) == enumC31071a6 ? enumC31071a6 : c23454a0;
            case 20:
                if (interfaceC30057d instanceof C36753k) {
                    c36753k = (C36753k) interfaceC30057d;
                    int i38 = c36753k.f157291x;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        c36753k.f157291x = i38 - Integer.MIN_VALUE;
                    } else {
                        c36753k = new C36753k(this, interfaceC30057d);
                    }
                } else {
                    c36753k = new C36753k(this, interfaceC30057d);
                }
                Object obj9 = c36753k.f157290w;
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i39 = c36753k.f157291x;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj9);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj9);
                InterfaceC13062m interfaceC13062m6 = (InterfaceC13062m) obj3;
                if (!AbstractC25265s.m74155w0(((C36758p) r14).f157315h, (PeerConnection.PeerConnectionState) obj2)) {
                    return c23454a0;
                }
                c36753k.f157291x = 1;
                return interfaceC13062m6.emit(obj2, c36753k) == enumC31071a7 ? enumC31071a7 : c23454a0;
            case 21:
                C12659u c12659u = (C12659u) r14;
                if (interfaceC30057d instanceof C36755m) {
                    c36755m = (C36755m) interfaceC30057d;
                    int i44 = c36755m.f157297x;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        c36755m.f157297x = i44 - Integer.MIN_VALUE;
                    } else {
                        c36755m = new C36755m(this, interfaceC30057d);
                    }
                } else {
                    c36755m = new C36755m(this, interfaceC30057d);
                }
                Object obj10 = c36755m.f157296w;
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i45 = c36755m.f157297x;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj10);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj10);
                C36761s c36761s = new C36761s(c12659u.hashCode(), (PeerConnection.PeerConnectionState) obj2, AbstractC36764v.m117873a((PeerConnection.IceConnectionState) c12659u.f43279s.getValue()));
                c36755m.f157297x = 1;
                return ((InterfaceC13062m) obj3).emit(c36761s, c36755m) == enumC31071a8 ? enumC31071a8 : c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return m5461f((AbstractC37747q) obj2, interfaceC30057d);
            default:
                C38747x c38747x = (C38747x) r14;
                if (interfaceC30057d instanceof C38744u) {
                    c38744u = (C38744u) interfaceC30057d;
                    int i46 = c38744u.f166734x;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        c38744u.f166734x = i46 - Integer.MIN_VALUE;
                    } else {
                        c38744u = new C38744u(this, interfaceC30057d);
                    }
                } else {
                    c38744u = new C38744u(this, interfaceC30057d);
                }
                Object obj11 = c38744u.f166733w;
                Object obj12 = EnumC31071a.f128113w;
                int i47 = c38744u.f166734x;
                if (i47 == 0) {
                    AbstractC34132o.m107864I(obj11);
                    InterfaceC13062m interfaceC13062m7 = (InterfaceC13062m) obj3;
                    C37708d c37708d = (C37708d) obj2;
                    boolean z14 = (c37708d.f161572x == EnumC37705c.f161563w && c38747x.f166747b.f161624X) ? false : true;
                    C11433l c11433l = c37708d.f161571w;
                    c38744u.f166735y = interfaceC13062m7;
                    c38744u.f166734x = 1;
                    Object objM124155f = c38747x.m124155f(c11433l, z14, c38744u);
                    if (objM124155f != obj12) {
                        obj11 = objM124155f;
                        interfaceC13062m2 = interfaceC13062m7;
                    }
                    return obj12;
                }
                if (i47 != 1) {
                    if (i47 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj11);
                    return c23454a0;
                }
                interfaceC13062m2 = c38744u.f166735y;
                AbstractC34132o.m107864I(obj11);
                c38744u.f166735y = null;
                c38744u.f166734x = 2;
                if (interfaceC13062m2.emit(obj11, c38744u) != obj12) {
                    return c23454a0;
                }
                return obj12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m5461f(AbstractC37747q abstractC37747q, InterfaceC30057d interfaceC30057d) {
        C37726j c37726j;
        C1841x c1841x;
        if (interfaceC30057d instanceof C37726j) {
            c37726j = (C37726j) interfaceC30057d;
            int i13 = c37726j.f161662E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37726j.f161662E = i13 - Integer.MIN_VALUE;
            } else {
                c37726j = new C37726j(this, interfaceC30057d);
            }
        } else {
            c37726j = new C37726j(this, interfaceC30057d);
        }
        Object obj = c37726j.f161665y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37726j.f161662E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C16845k c16845k = (C16845k) this.f7207x;
            c37726j.f161663w = this;
            c37726j.f161664x = abstractC37747q;
            c37726j.f161662E = 1;
            if (c16845k.m47442b(c37726j) == enumC31071a) {
                return enumC31071a;
            }
            c1841x = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC37747q = c37726j.f161664x;
            c1841x = c37726j.f161663w;
            AbstractC34132o.m107864I(obj);
        }
        LinkActivity linkActivity = (LinkActivity) c1841x.f7208y;
        int i15 = LinkActivity.f22192E;
        linkActivity.setResult(73563, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.link.LinkActivityContract.extra_result", abstractC37747q))));
        linkActivity.finish();
        return C23454a0.f92919a;
    }

    public C1841x(C22659b0 c22659b0, InterfaceC13062m interfaceC13062m) {
        this.f7206w = 4;
        this.f7208y = c22659b0;
        this.f7207x = interfaceC13062m;
    }
}
