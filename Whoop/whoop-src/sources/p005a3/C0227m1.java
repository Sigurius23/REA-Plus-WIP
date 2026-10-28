package p005a3;

import a63.AbstractC0501r;
import a63.C0485f;
import a63.C0495l;
import a63.InterfaceC0500q;
import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.p018ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1641y;
import bc3.C3004e2;
import bc3.C3031l1;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.SimulationContext;
import com.google.crypto.tink.internal.C5101l0;
import dc3.C11923h;
import f63.AbstractC14155c;
import g63.AbstractC15538b;
import hg3.AbstractC17269i;
import i63.AbstractC18157a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import o63.C27615f;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p014aj.C0929d;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2315u;
import p027b3.AbstractC2369e2;
import p027b3.C2374f2;
import p027b3.C2427q0;
import p027b3.C2468y1;
import p031b9.AbstractC2875y;
import p077d0.C11392q;
import p088dc.AbstractC11894a;
import p114eb.C12982q;
import p173gj.C15903d;
import p173gj.C15906g;
import p173gj.C15907h;
import p173gj.EnumC15904e;
import p189hb.C17070f;
import p208i2.AbstractC17918w0;
import p208i2.C17872b1;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17915v;
import p209i3.AbstractC18041w;
import p209i3.C18027i;
import p209i3.InterfaceC18044z;
import p222ij.C18580f;
import p222ij.C18586l;
import p222ij.C18588n;
import p222ij.InterfaceC18576b;
import p222ij.RunnableC18575a;
import p240j2.AbstractC21222c;
import p240j2.C21223d;
import p255jk.C21743a;
import p270k2.InterfaceC22131e;
import p281kj.C22507b;
import p293l2.C23226c;
import p355o2.AbstractC27425b0;
import p355o2.C27424b;
import p390p1.C28596b0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p446r1.C30849c;
import p505ts.AbstractC34132o;
import p581we.C37199o;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import v53.C35709c;
import v53.C35710d;
import v53.C35711e;
import z53.C40115g;

/* JADX INFO: renamed from: a3.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0227m1 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f752w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f753x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0227m1(Object obj, int i13) {
        super(1);
        this.f752w = i13;
        this.f753x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        int i13 = this.f752w;
        int i14 = 2;
        boolean z4 = true;
        int i15 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f753x;
        switch (i13) {
            case 0:
                ((C30849c) obj2).m94885b((InterfaceC2315u) obj);
                return Boolean.TRUE;
            case 1:
                C0495l HttpResponseValidator = (C0495l) obj;
                AbstractC22676k.m65750j(HttpResponseValidator, "$this$HttpResponseValidator");
                HttpResponseValidator.f1670c = ((C35711e) obj2).f151943g;
                HttpResponseValidator.f1668a.add(new C0485f(2, null));
                return c23454a0;
            case 2:
                Throwable th3 = (Throwable) obj;
                C3004e2 c3004e2 = (C3004e2) obj2;
                if (th3 != null) {
                    c3004e2.cancel(AbstractC11894a.m31955d("Engine failed", th3));
                } else {
                    c3004e2.complete();
                }
                return c23454a0;
            case 3:
                Configuration configuration = new Configuration((Configuration) obj);
                C28596b0 c28596b0 = AndroidCompositionLocals_androidKt.f4975a;
                ((InterfaceC28601c1) obj2).setValue(configuration);
                return c23454a0;
            case 4:
                return new C2427q0((C2468y1) obj2, i15);
            case 5:
                if (AbstractC2369e2.f9351b.compareAndSet(false, true)) {
                    ((C11923h) obj2).mo32218s(c23454a0);
                }
                return c23454a0;
            case 6:
                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                InterfaceC17915v interfaceC17915vM716w = interfaceC22131e.mo744t0().m716w();
                InterfaceC4351m interfaceC4351m = ((C2374f2) obj2).f9380z;
                if (interfaceC4351m != null) {
                    interfaceC4351m.invoke(interfaceC17915vM716w, (C23226c) interfaceC22131e.mo744t0().f813y);
                }
                return c23454a0;
            case 7:
                return Boolean.valueOf(AbstractC22676k.m65745e(obj, obj2));
            case 8:
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    abstractC39101i1.m124632f((AbstractC39104j1) arrayList.get(i16), 0, 0, 0.0f);
                }
                return c23454a0;
            case 9:
                C11392q c11392q = (C11392q) obj;
                float f13 = c11392q.f36531b;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                float f14 = c11392q.f36532c;
                if (f14 < -0.5f) {
                    f14 = -0.5f;
                }
                if (f14 > 0.5f) {
                    f14 = 0.5f;
                }
                float f15 = c11392q.f36533d;
                float f16 = f15 >= -0.5f ? f15 : -0.5f;
                float f17 = f16 <= 0.5f ? f16 : 0.5f;
                float f18 = c11392q.f36530a;
                float f19 = f18 >= 0.0f ? f18 : 0.0f;
                return new C17919x(C17919x.m51540b(AbstractC17918w0.m51514b(f13, f14, f17, f19 <= 1.0f ? f19 : 1.0f, C21223d.f81042x), (AbstractC21222c) obj2));
            case 10:
                ((C17920x0) ((InterfaceC17886g0) obj)).m51551a(((Number) ((InterfaceC28670t2) obj2).getValue()).floatValue());
                return c23454a0;
            case 11:
                String argName = (String) obj;
                AbstractC22676k.m65750j(argName, "argName");
                return Boolean.valueOf(!((Bundle) obj2).containsKey(argName));
            case 12:
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj2;
                C17920x0 c17920x0 = (C17920x0) ((InterfaceC17886g0) obj);
                c17920x0.m51562s(c17920x0.getDensity() * shadowGraphicsLayerElement.f4787w);
                c17920x0.m51563t(shadowGraphicsLayerElement.f4788x);
                c17920x0.m51554e(shadowGraphicsLayerElement.f4789y);
                c17920x0.m51552b(shadowGraphicsLayerElement.f4790z);
                c17920x0.m51564v(shadowGraphicsLayerElement.f4786E);
                return c23454a0;
            case 13:
                C15907h $receiver = (C15907h) obj;
                AbstractC22676k.m65750j($receiver, "$this$$receiver");
                C15906g c15906g = (C15906g) obj2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if ($receiver.f60171a) {
                    linkedHashSet.add(EnumC15904e.f60146w);
                }
                if ($receiver.f60172b) {
                    linkedHashSet.add(EnumC15904e.f60147x);
                }
                if ($receiver.f60173c) {
                    linkedHashSet.add(EnumC15904e.f60148y);
                }
                if ($receiver.f60174d) {
                    linkedHashSet.add(EnumC15904e.f60149z);
                }
                c15906g.f60169r = linkedHashSet;
                return c23454a0;
            case 14:
                C12982q entry = (C12982q) obj;
                AbstractC22676k.m65750j(entry, "entry");
                return new C1641y(i14, (C17070f) obj2, entry);
            case 15:
                C17872b1 c17872b1 = (C17872b1) obj2;
                C17920x0 c17920x1 = (C17920x0) ((InterfaceC17886g0) obj);
                c17920x1.m51560p(c17872b1.f69538O);
                c17920x1.m51561r(c17872b1.f69539P);
                c17920x1.m51551a(c17872b1.f69540Q);
                c17920x1.m51549C(c17872b1.f69541R);
                c17920x1.m51550E(c17872b1.f69542S);
                c17920x1.m51562s(c17872b1.f69543T);
                c17920x1.m51557k(0.0f);
                c17920x1.m51558n(c17872b1.f69544U);
                c17920x1.m51559o(c17872b1.f69545V);
                c17920x1.m51553c(c17872b1.f69546W);
                c17920x1.m51565y(c17872b1.f69547X);
                c17920x1.m51563t(c17872b1.f69548Y);
                c17920x1.m51554e(c17872b1.f69549Z);
                c17920x1.m51556g(c17872b1.f69550a0);
                c17920x1.m51552b(c17872b1.f69551b0);
                c17920x1.m51564v(c17872b1.f69552c0);
                c17920x1.m51555f(c17872b1.f69553d0);
                int i17 = c17872b1.f69554e0;
                if (c17920x1.f69657V != i17) {
                    c17920x1.f69659w |= 524288;
                    c17920x1.f69657V = i17;
                }
                return c23454a0;
            case 16:
                AbstractC18041w.m51810i((InterfaceC18044z) obj, ((C18027i) obj2).f69949a);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC18041w.m51806e((String) obj2, (InterfaceC18044z) obj);
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                byte bByteValue = ((Number) obj).byteValue();
                StringBuilder sb4 = (StringBuilder) obj2;
                if (bByteValue == 32) {
                    sb4.append("%20");
                } else if (AbstractC18157a.f70461a.contains(Byte.valueOf(bByteValue)) || AbstractC18157a.f70464d.contains(Byte.valueOf(bByteValue))) {
                    sb4.append((char) bByteValue);
                } else {
                    sb4.append(AbstractC18157a.m52151a(bByteValue));
                }
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                Object[] args = (Object[]) obj;
                C18580f c18580f = (C18580f) obj2;
                AbstractC22676k.m65750j(args, "args");
                String string2 = args[0].toString();
                String string3 = args[1].toString();
                try {
                    JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(c18580f.f72591e.m1835f(args[2].toString()));
                    InterfaceC18576b interfaceC18576b = (InterfaceC18576b) c18580f.f72590d.get(string2);
                    if (interfaceC18576b == null) {
                        c18580f.m53799b(string3, "No handler registered for function: " + string2);
                    } else {
                        new Thread(new RunnableC18575a(interfaceC18576b, string3, jsonObjectM1847i, c18580f, 0)).start();
                    }
                    break;
                } catch (Exception e5) {
                    c18580f.m53799b(string3, "Failed to parse arguments JSON: " + e5.getMessage());
                }
                return null;
            case 20:
                Object[] args2 = (Object[]) obj;
                ArrayList arrayList2 = ((C18588n) obj2).f72613a;
                AbstractC22676k.m65750j(args2, "args");
                if (args2.length != 0) {
                    String string4 = args2[0].toString();
                    C5101l0 c5101l0 = C4861a.f20259o;
                    c5101l0.m16047a0(AbstractC11266d.m30461o("IntegrationsBridge: track() called with args: ", string4));
                    try {
                        C21743a c21743aM48903m0 = AbstractC17269i.m48903m0(new JSONObject(string4));
                        c5101l0.m16047a0("IntegrationsBridge: event: " + c21743aM48903m0 + ", integrations: " + arrayList2.size());
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(c21743aM48903m0);
                        }
                    } catch (JSONException unused) {
                        C4861a.f20259o.m16067m0(AbstractC11266d.m30461o("IntegrationsBridge: Failed to construct BaseEvent from provided event jsonString=", string4));
                    }
                }
                return null;
            case 21:
                Object[] args3 = (Object[]) obj;
                AbstractC22676k.m65750j(args3, "args");
                Object objM74084y0 = AbstractC25260n.m74084y0(0, args3);
                if (objM74084y0 == null || (string = objM74084y0.toString()) == null) {
                    return Boolean.FALSE;
                }
                try {
                    ((C4861a) ((C37199o) obj2).f159041x).f20268i.m36570j((SimulationContext) AbstractC34132o.m107878b(AbstractC0757c.f2762d, C18586l.f72601y).m1831b(SimulationContext.Companion.serializer(), string));
                    break;
                } catch (Exception e13) {
                    C4861a.f20259o.m16032K(AbstractC2875y.m8298k(e13, new StringBuilder("Failed to decode SimulationContext: ")));
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C21743a event = (C21743a) obj;
                AbstractC22676k.m65750j(event, "event");
                LinkedHashMap linkedHashMap = event.f83625N;
                LinkedHashMap linkedHashMapM74003l0 = linkedHashMap != null ? AbstractC25247g0.m74003l0(linkedHashMap) : new LinkedHashMap();
                linkedHashMapM74003l0.put("[Guides-Surveys] Library", "amplitude-engagement-android/1.8.0");
                event.f83625N = linkedHashMapM74003l0;
                C15903d c15903d = ((C22507b) obj2).f88212x;
                if (c15903d != null) {
                    c15903d.m44886h(event);
                    return c23454a0;
                }
                AbstractC22676k.m65757q("amplitude");
                throw null;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                InterfaceC22131e interfaceC22131e2 = (InterfaceC22131e) obj;
                C23226c c23226c = (C23226c) obj2;
                InterfaceC17910s0 interfaceC17910s0 = c23226c.f91976l;
                if (c23226c.f91978n && c23226c.f91987w && interfaceC17910s0 != null) {
                    C0237p c0237pMo744t0 = interfaceC22131e2.mo744t0();
                    long jM670A = c0237pMo744t0.m670A();
                    c0237pMo744t0.m716w().mo51426q();
                    try {
                        ((C0929d) c0237pMo744t0.f812x).m2344b(interfaceC17910s0, 1);
                        c23226c.m67210c(interfaceC22131e2);
                    } finally {
                        AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                    }
                } else {
                    c23226c.m67210c(interfaceC22131e2);
                }
                return c23454a0;
            case 24:
                AbstractC27425b0 abstractC27425b0 = (AbstractC27425b0) obj;
                C27424b c27424b = (C27424b) obj2;
                c27424b.m82856g(abstractC27425b0);
                Function1 function1 = c27424b.f110489i;
                if (function1 != null) {
                    function1.invoke(abstractC27425b0);
                }
                return c23454a0;
            case 25:
                Object obj3 = (InterfaceC0240p2) obj;
                if (((AbstractC2316v) obj3).f9142w.f9141N) {
                    ((C22669g0) obj2).f89336w = obj3;
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 26:
                C35709c scope = (C35709c) obj;
                AbstractC22676k.m65750j(scope, "scope");
                C27615f c27615f = (C27615f) scope.f151929I.m83373a(AbstractC0501r.f1685a, C35710d.f151936w);
                InterfaceC0500q interfaceC0500q = (InterfaceC0500q) obj2;
                Object obj4 = scope.f151931K.f151938b.get(interfaceC0500q.getKey());
                AbstractC22676k.m65747g(obj4);
                Object objMo1197a = interfaceC0500q.mo1197a((Function1) obj4);
                interfaceC0500q.mo1198b(objMo1197a, scope);
                c27615f.m83377e(interfaceC0500q.getKey(), objMo1197a);
                return c23454a0;
            case 27:
                ((C40115g) obj2).close();
                return c23454a0;
            case 28:
                if (((Throwable) obj) != null) {
                    ((C35709c) obj2).f151930J.m1877v(AbstractC15538b.f58267e);
                }
                return c23454a0;
            default:
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    ((C3031l1) obj2).mo8819p(new CancellationException(th4.getMessage()));
                }
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227m1(C35709c c35709c, AbstractC14155c abstractC14155c) {
        super(1);
        this.f752w = 28;
        this.f753x = c35709c;
    }
}
