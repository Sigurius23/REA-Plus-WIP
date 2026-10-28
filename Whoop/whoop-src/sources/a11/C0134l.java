package a11;

import ad3.AbstractC0757c;
import ad3.C0779v;
import ad3.InterfaceC0778u;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.health.platform.client.proto.C1533u;
import b61.AbstractC2756k;
import bc3.InterfaceC2994c0;
import bd3.AbstractC3138q;
import bp0.AbstractC3531s;
import c41.AbstractC4072m3;
import c41.AbstractC4075n;
import c41.AbstractC4137v5;
import c41.AbstractC4145x;
import c41.C4044i3;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ce3.C4503d0;
import ce3.C4515p;
import ce3.C4516q;
import ce3.C4524y;
import ce3.EnumC4496a;
import com.whoop.util.TrendKey;
import cp0.C10998t;
import dc3.InterfaceC11927l;
import dp0.InterfaceC12251g;
import ep0.InterfaceC13399e;
import fe3.AbstractC14421e;
import fm1.C14605i;
import h01.AbstractC16549p;
import h01.C16550q;
import h11.C16613h;
import ik2.C18614b;
import io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationHandler;
import io.getstream.chat.android.client.notifications.handler.NotificationHandlerFactory;
import io.getstream.chat.android.client.socket.ChatSocketStateService;
import j71.C21395c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import jk2.AbstractC21764e;
import jk2.AbstractC21768i;
import js1.AbstractC21914e;
import js1.AbstractC21921l;
import js1.C21917h;
import k71.AbstractC22253j;
import k71.AbstractC22269z;
import k71.C22256m;
import kd1.EnumC22400l;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25272z;
import p005a3.C0238p0;
import p109e6.C12746a;
import p132f0.C13807n;
import p249jc.AbstractC21598x;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p710im1.AbstractC18697t0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p720m91.InterfaceC25312u;
import yc3.C39446j;
import yc3.InterfaceC39443g;
import yd3.C39472c;
import zo0.InterfaceC40915c;

/* JADX INFO: renamed from: a11.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0134l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f399w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f400x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f401y;

    public /* synthetic */ C0134l(int i13, Object obj, Object obj2) {
        this.f399w = i13;
        this.f400x = obj;
        this.f401y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        String strM1854a;
        String[] strArrNames;
        long jM14118a;
        C4524y[] c4524yArr = null;
        switch (this.f399w) {
            case 0:
                return AbstractC0139q.m291B((Function1) this.f400x, (EnumC0124b) this.f401y);
            case 1:
                return AbstractC2756k.m7804u((Function1) this.f400x, (C21395c) this.f401y);
            case 2:
                InterfaceC39443g interfaceC39443g = (InterfaceC39443g) this.f400x;
                AbstractC0757c abstractC0757c = (AbstractC0757c) this.f401y;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                boolean z4 = abstractC0757c.f2763a.f2801m && AbstractC22676k.m65745e(interfaceC39443g.getKind(), C39446j.f169712a);
                C0779v c0779vM9023s = AbstractC3138q.m9023s(abstractC0757c, interfaceC39443g);
                int elementsCount = interfaceC39443g.getElementsCount();
                for (int i13 = 0; i13 < elementsCount; i13++) {
                    List elementAnnotations = interfaceC39443g.getElementAnnotations(i13);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : elementAnnotations) {
                        if (obj instanceof InterfaceC0778u) {
                            arrayList.add(obj);
                        }
                    }
                    InterfaceC0778u interfaceC0778u = (InterfaceC0778u) AbstractC25265s.m74146r1(arrayList);
                    if (interfaceC0778u != null && (strArrNames = interfaceC0778u.names()) != null) {
                        for (String lowerCase : strArrNames) {
                            if (z4) {
                                lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                            }
                            AbstractC3138q.m9010f(linkedHashMap, interfaceC39443g, lowerCase, i13);
                        }
                    }
                    if (z4) {
                        strM1854a = interfaceC39443g.getElementName(i13).toLowerCase(Locale.ROOT);
                        AbstractC22676k.m65749i(strM1854a, "toLowerCase(...)");
                    } else {
                        strM1854a = c0779vM9023s != null ? c0779vM9023s.m1854a(interfaceC39443g, interfaceC39443g.getElementName(i13)) : null;
                    }
                    if (strM1854a != null) {
                        AbstractC3138q.m9010f(linkedHashMap, interfaceC39443g, strM1854a, i13);
                    }
                }
                return linkedHashMap.isEmpty() ? C25272z.f99163w : linkedHashMap;
            case 3:
                return AbstractC3531s.m10431L0((InterfaceC13399e) this.f400x, (InterfaceC12251g) this.f401y);
            case 4:
                return AbstractC3531s.m10411B0((InterfaceC12251g) this.f400x, (InterfaceC28670t2) this.f401y);
            case 5:
                return AbstractC3531s.m10413C0((InterfaceC40915c) this.f400x, (InterfaceC12251g) this.f401y);
            case 6:
                return AbstractC3531s.m10417E0((InterfaceC2994c0) this.f400x, (InterfaceC12251g) this.f401y);
            case 7:
                return AbstractC3531s.m10423H0((InterfaceC2994c0) this.f400x, (C10998t) this.f401y);
            case 8:
                return AbstractC4075n.m12511p((Function1) this.f400x, (AbstractC4145x.a) this.f401y);
            case 9:
                return AbstractC4072m3.m12491k((C4044i3) this.f401y, (Function1) this.f400x);
            case 10:
                return AbstractC4137v5.m12845h((Function1) this.f400x, (TrendKey) this.f401y);
            case 11:
                C4516q c4516q = (C4516q) this.f400x;
                C4524y c4524y = (C4524y) this.f401y;
                try {
                    c4516q.f18206w.mo14130b(c4524y);
                    break;
                } catch (IOException e5) {
                    AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
                    AbstractC14421e.f52594a.mo41121j("Http2Connection.Listener failure for " + c4516q.f18208y, 4, e5);
                    try {
                        c4524y.m14151c(EnumC4496a.PROTOCOL_ERROR, e5);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return C23454a0.f92919a;
            case 12:
                C4515p c4515p = (C4515p) this.f400x;
                C4503d0 c4503d0 = (C4503d0) this.f401y;
                C22669g0 c22669g0 = new C22669g0();
                C4516q c4516q2 = (C4516q) c4515p.f18182y;
                synchronized (c4516q2.f18203X) {
                    try {
                        synchronized (c4516q2) {
                            try {
                                C4503d0 c4503d1 = c4516q2.f18198S;
                                C4503d0 c4503d2 = new C4503d0();
                                c4503d2.m14119b(c4503d1);
                                c4503d2.m14119b(c4503d0);
                                c22669g0.f89336w = c4503d2;
                                jM14118a = ((long) c4503d2.m14118a()) - ((long) c4503d1.m14118a());
                                if (jM14118a != 0 && !c4516q2.f18207x.isEmpty()) {
                                    c4524yArr = (C4524y[]) c4516q2.f18207x.values().toArray(new C4524y[0]);
                                }
                                C4503d0 c4503d3 = (C4503d0) c22669g0.f89336w;
                                AbstractC22676k.m65750j(c4503d3, "<set-?>");
                                c4516q2.f18198S = c4503d3;
                                C39472c.m126116c(c4516q2.f18189J, c4516q2.f18208y + " onSettings", 0L, new C0134l(13, c4516q2, c22669g0), 6);
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        try {
                            c4516q2.f18203X.m14160b((C4503d0) c22669g0.f89336w);
                        } catch (IOException e13) {
                            EnumC4496a enumC4496a = EnumC4496a.PROTOCOL_ERROR;
                            c4516q2.m14133b(enumC4496a, enumC4496a, e13);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                if (c4524yArr != null) {
                    for (C4524y c4524y2 : c4524yArr) {
                        synchronized (c4524y2) {
                            c4524y2.f18239E += jM14118a;
                            if (jM14118a > 0) {
                                c4524y2.notifyAll();
                            }
                            break;
                        }
                    }
                }
                return C23454a0.f92919a;
            case 13:
                C4516q c4516q3 = (C4516q) this.f400x;
                c4516q3.f18206w.mo14131a(c4516q3, (C4503d0) ((C22669g0) this.f401y).f89336w);
                return C23454a0.f92919a;
            case 14:
                ((InterfaceC11927l) this.f400x).mo32218s(this.f401y);
                return C23454a0.f92919a;
            case 15:
                SharedPreferences sharedPreferences = ((Context) this.f400x).getSharedPreferences((String) this.f401y, 0);
                AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
                return sharedPreferences;
            case 16:
                Context context = (Context) this.f400x;
                C12746a c12746a = (C12746a) this.f401y;
                AbstractC22676k.m65747g(context);
                return AbstractC21598x.m60684i0(context, c12746a.f43628w);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C13807n c13807n = (C13807n) this.f400x;
                C0238p0 c0238p0 = (C0238p0) this.f401y;
                c13807n.f49267W = c13807n.f49262R.mo39171a(c0238p0.f815w.mo731d(), c0238p0.getLayoutDirection(), c0238p0);
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC16549p.m46753G((C16550q) this.f401y, (Function1) this.f400x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18697t0.m54308Y0((InterfaceC4339a) this.f400x, (InterfaceC28601c1) this.f401y);
            case 20:
                return MessagingStyleNotificationHandler.factory_delegate$lambda$3((MessagingStyleNotificationHandler) this.f400x, (InterfaceC4351m) this.f401y);
            case 21:
                return NotificationHandlerFactory.C193941.handler_delegate$lambda$1((Context) this.f400x, (NotificationHandlerFactory.C193941) this.f401y);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return NotificationHandlerFactory.C193951.builder_delegate$lambda$1((Context) this.f400x, (NotificationHandlerFactory.C193951) this.f401y);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ChatSocketStateService.stateMachine_delegate$lambda$75((ChatSocketStateService.State) this.f400x, (ChatSocketStateService) this.f401y);
            case 24:
                return AbstractC21764e.m61482l((Function1) this.f400x, (C18614b) this.f401y);
            case 25:
                return AbstractC21768i.m61506I((Function1) this.f400x, (C14605i) this.f401y);
            case 26:
                return AbstractC21914e.m62356u((C16613h) this.f401y, (Function1) this.f400x);
            case 27:
                return AbstractC21921l.m62379I((C21917h) this.f401y, (Function1) this.f400x);
            case 28:
                return AbstractC22253j.m63854x((C22256m) this.f401y, (Function1) this.f400x);
            default:
                return AbstractC22269z.m63946O((Function1) this.f400x, (EnumC22400l) this.f401y);
        }
    }

    public /* synthetic */ C0134l(InterfaceC25312u interfaceC25312u, Function1 function1, int i13) {
        this.f399w = i13;
        this.f401y = interfaceC25312u;
        this.f400x = function1;
    }
}
