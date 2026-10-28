package p002a0;

import a13.EnumC0147e;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.health.platform.client.proto.C1533u;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import com.iterable.iterableapi.C5359o1;
import d33.AbstractC11606j;
import e10.C12554k0;
import e43.C12715g;
import e43.InterfaceC12716h;
import eu.C13635v;
import g53.AbstractC15508m;
import g53.C15498c;
import i53.AbstractC18138j;
import i53.C18129a;
import i63.AbstractC18157a;
import io.ktor.utils.p228io.jvm.javaio.AbstractC20008b;
import io.sentry.C20535s;
import io.sentry.android.replay.C20219r;
import io.sentry.android.replay.C20231t;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.AbstractC20187c;
import io.sentry.android.replay.capture.InterfaceC20196l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m83.AbstractC25265s;
import p003a1.C0109h;
import p005a3.AbstractC0177a;
import p005a3.C0230n0;
import p005a3.C0238p0;
import p005a3.C0248r2;
import p005a3.EnumC0236o2;
import p005a3.InterfaceC0181b;
import p027b3.AbstractC2417o0;
import p027b3.C2389i2;
import p027b3.C2462x0;
import p077d0.C11421z1;
import p078d1.InputConnectionC11463p;
import p097ds.InterfaceFutureC12319v;
import p098dt.AbstractC12350b;
import p106e2.C12591f;
import p108e4.AbstractC12667a;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p208i2.AbstractC17918w0;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p209i3.C18034p;
import p242j4.C21311k;
import p249jc.AbstractC21598x;
import p270k2.InterfaceC22129c;
import p389p0.C28553u0;
import p412q3.InputConnectionC29881o;
import p446r1.C30849c;
import p505ts.AbstractC34132o;
import p530up.C35147c;
import p591wp.C37487h;
import p635y2.AbstractC39071a;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import stream.video.sfu.models.Error;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import t23.C33368c0;
import t23.C33402i2;
import x43.AbstractC37978j;
import x43.AbstractC37979k;

/* JADX INFO: renamed from: a0.a1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0006a1 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0006a1(Object obj, int i13) {
        super(1);
        this.f17w = i13;
        this.f18x = obj;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [a3.b, y2.j1] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WebsocketReconnectStrategy websocketReconnectStrategy;
        int i13 = 0;
        switch (this.f17w) {
            case 0:
                return obj == ((C0047q0) this.f18x) ? "(this)" : String.valueOf(obj);
            case 1:
                return obj == ((C0049r0) this.f18x) ? "(this)" : String.valueOf(obj);
            case 2:
                return obj == ((C0059w0) this.f18x) ? "(this)" : String.valueOf(obj);
            case 3:
                InterfaceC0181b interfaceC0181b = (InterfaceC0181b) obj;
                AbstractC0177a abstractC0177a = (AbstractC0177a) this.f18x;
                if (interfaceC0181b.mo430v()) {
                    if (interfaceC0181b.mo425a().f571b) {
                        interfaceC0181b.mo429t();
                    }
                    for (Map.Entry entry : interfaceC0181b.mo425a().f578i.entrySet()) {
                        AbstractC0177a.m413a(abstractC0177a, (AbstractC39071a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0181b.mo424J());
                    }
                    NodeCoordinator nodeCoordinator = interfaceC0181b.mo424J().f4860Q;
                    AbstractC22676k.m65747g(nodeCoordinator);
                    while (!nodeCoordinator.equals(abstractC0177a.f570a.mo424J())) {
                        for (AbstractC39071a abstractC39071a : abstractC0177a.mo415c(nodeCoordinator).keySet()) {
                            AbstractC0177a.m413a(abstractC0177a, abstractC39071a, abstractC0177a.mo416d(nodeCoordinator, abstractC39071a), nodeCoordinator);
                        }
                        nodeCoordinator = nodeCoordinator.f4860Q;
                        AbstractC22676k.m65747g(nodeCoordinator);
                    }
                }
                return C23454a0.f92919a;
            case 4:
                ((C3031l1) this.f18x).complete();
                return C23454a0.f92919a;
            case 5:
                ((C2996c2) this.f18x).cancel((CancellationException) null);
                return C23454a0.f92919a;
            case 6:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC22676k.m65750j(entry2, "entry");
                Collection collection = (Collection) this.f18x;
                View view = (View) entry2.getValue();
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                return Boolean.valueOf(AbstractC25265s.m74155w0(collection, AbstractC16877h0.m47511f(view)));
            case 7:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f18x;
                return new C2462x0(androidComposeView, androidComposeView.getTextInputService(), (InterfaceC2994c0) obj);
            case 8:
                return Boolean.valueOf(((AbstractC0050s) this.f18x).m120a(((C18034p) obj).f69992g));
            case 9:
                return Boolean.valueOf(AbstractC2417o0.m7411c((C18034p) obj, (Resources) this.f18x));
            case 10:
                InputConnectionC29881o inputConnectionC29881o = (InputConnectionC29881o) obj;
                InputConnectionC11463p inputConnectionC11463p = inputConnectionC29881o.f122108b;
                if (inputConnectionC11463p != null) {
                    inputConnectionC29881o.m91504a(inputConnectionC11463p);
                    inputConnectionC29881o.f122108b = null;
                }
                C2389i2 c2389i2 = (C2389i2) this.f18x;
                C30849c c30849c = c2389i2.f9442d;
                Object[] objArr = c30849c.f127227w;
                int i14 = c30849c.f127229y;
                while (true) {
                    if (i13 >= i14) {
                        i13 = -1;
                    } else if (!AbstractC22676k.m65745e((C0248r2) objArr[i13], inputConnectionC29881o)) {
                        i13++;
                    }
                }
                if (i13 >= 0) {
                    c30849c.m94894l(i13);
                }
                if (c30849c.f127229y == 0) {
                    c2389i2.f9440b.invoke();
                }
                return C23454a0.f92919a;
            case 11:
                ((C0230n0) this.f18x).m578A0((InterfaceC39171c) obj);
                return C23454a0.f92919a;
            case 12:
                return Boolean.valueOf(!AbstractC22676k.m65745e(obj, ((C11421z1) this.f18x).f36633d.getValue()));
            case 13:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    C5359o1 c5359o1 = (C5359o1) this.f18x;
                    AbstractC12350b.m34581b0("IterableKeychain", "Migration failed", th3);
                    new Exception(th3);
                    c5359o1.m16503a();
                }
                return C23454a0.f92919a;
            case 14:
                Error error = (Error) obj;
                AbstractC22676k.m65750j(error, "error");
                if (!(((C33368c0) this.f18x).f139302p.f139652h.getValue() instanceof C33402i2)) {
                    int i15 = AbstractC11606j.f37469a[error.getCode().ordinal()];
                    InterfaceC30057d interfaceC30057d = null;
                    if (i15 == 1) {
                        websocketReconnectStrategy = WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_FAST;
                    } else if (i15 == 2 || i15 == 3 || i15 == 4 || i15 == 5) {
                        websocketReconnectStrategy = WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_REJOIN;
                    } else {
                        C2343i c2343i = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                        EnumC2341g enumC2341g = EnumC2341g.WARN;
                        if (interfaceC2339e.isLoggable(enumC2341g, "Video:RtcSession")) {
                            C2343i.f9271c.log(enumC2341g, "Video:RtcSession", "[onSfuApiError] Unhandled session-fatal error " + error.getCode() + ": " + error.getMessage(), null);
                        }
                        websocketReconnectStrategy = WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_REJOIN;
                    }
                    WebsocketReconnectStrategy websocketReconnectStrategy2 = websocketReconnectStrategy;
                    C33368c0 c33368c0 = (C33368c0) this.f18x;
                    AbstractC3006f0.m8732z(c33368c0.f139300n, null, null, new C0109h(c33368c0, websocketReconnectStrategy2, error, interfaceC30057d, 11), 3);
                }
                return C23454a0.f92919a;
            case 15:
                ((InterfaceFutureC12319v) this.f18x).cancel(false);
                return C23454a0.f92919a;
            case 16:
                C12591f c12591f = (C12591f) obj;
                if (!c12591f.f9142w.f9141N) {
                    return EnumC0236o2.f808x;
                }
                C12591f c12591f2 = c12591f.f42975P;
                if (c12591f2 != null) {
                    AbstractC12667a.m35464p(c12591f2, new C0006a1((C12554k0) this.f18x, 16));
                }
                c12591f.f42975P = null;
                c12591f.f42974O = null;
                return EnumC0236o2.f807w;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC17886g0 interfaceC17886g0 = (InterfaceC17886g0) obj;
                C21311k c21311k = (C21311k) this.f18x;
                if (!Float.isNaN(c21311k.f81483d) || !Float.isNaN(c21311k.f81484e)) {
                    ((C17920x0) interfaceC17886g0).m51565y(AbstractC17918w0.m51524l(Float.isNaN(c21311k.f81483d) ? 0.5f : c21311k.f81483d, Float.isNaN(c21311k.f81484e) ? 0.5f : c21311k.f81484e));
                }
                if (!Float.isNaN(c21311k.f81485f)) {
                    ((C17920x0) interfaceC17886g0).m51557k(c21311k.f81485f);
                }
                if (!Float.isNaN(c21311k.f81486g)) {
                    ((C17920x0) interfaceC17886g0).m51558n(c21311k.f81486g);
                }
                if (!Float.isNaN(c21311k.f81487h)) {
                    ((C17920x0) interfaceC17886g0).m51559o(c21311k.f81487h);
                }
                if (!Float.isNaN(c21311k.f81488i)) {
                    ((C17920x0) interfaceC17886g0).m51549C(c21311k.f81488i);
                }
                if (!Float.isNaN(c21311k.f81489j)) {
                    ((C17920x0) interfaceC17886g0).m51550E(c21311k.f81489j);
                }
                if (!Float.isNaN(c21311k.f81490k)) {
                    ((C17920x0) interfaceC17886g0).m51562s(c21311k.f81490k);
                }
                if (!Float.isNaN(c21311k.f81491l) || !Float.isNaN(c21311k.f81492m)) {
                    C17920x0 c17920x0 = (C17920x0) interfaceC17886g0;
                    c17920x0.m51560p(Float.isNaN(c21311k.f81491l) ? 1.0f : c21311k.f81491l);
                    c17920x0.m51561r(Float.isNaN(c21311k.f81492m) ? 1.0f : c21311k.f81492m);
                }
                if (!Float.isNaN(c21311k.f81493n)) {
                    ((C17920x0) interfaceC17886g0).m51551a(c21311k.f81493n);
                }
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                String key = (String) obj;
                AbstractC22676k.m65750j(key, "key");
                return Boolean.valueOf(!((Bundle) this.f18x).containsKey(key));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j((Context) obj, "it");
                return (C35147c) this.f18x;
            case 20:
                C37487h it = (C37487h) obj;
                AbstractC22676k.m65750j(it, "it");
                return AbstractC37978j.m121654o(((C13635v) this.f18x).f48321F, it);
            case 21:
                InterfaceC22129c interfaceC22129c = (InterfaceC22129c) obj;
                ((Function1) this.f18x).invoke(interfaceC22129c);
                ((C0238p0) interfaceC22129c).m728a();
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC37979k listener = (AbstractC37979k) obj;
                AbstractC22676k.m65750j(listener, "listener");
                listener.mo40218c(((C15498c) ((AbstractC15508m) this.f18x)).f58168a);
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                EnumC0147e nps = (EnumC0147e) obj;
                AbstractC22676k.m65750j(nps, "nps");
                InterfaceC12716h interfaceC12716h = ((C12715g) this.f18x).f43505c;
                int iOrdinal = nps.ordinal();
                if (iOrdinal == 0) {
                    interfaceC12716h.onPermissionRequested();
                } else if (iOrdinal == 1) {
                    interfaceC12716h.onPermissionGranted();
                } else if (iOrdinal == 2) {
                    interfaceC12716h.onPermissionDenied();
                } else if (iOrdinal == 3) {
                    interfaceC12716h.onPermissionRationale();
                }
                return C23454a0.f92919a;
            case 24:
                AbstractC37979k listener2 = (AbstractC37979k) obj;
                AbstractC22676k.m65750j(listener2, "listener");
                listener2.mo40218c(((C18129a) ((AbstractC18138j) this.f18x)).f70424a);
                return C23454a0.f92919a;
            case 25:
                ((List) obj).add((Float) ((C28553u0) this.f18x).invoke());
                return true;
            case 26:
                ((StringBuilder) this.f18x).append(AbstractC18157a.m52151a(((Number) obj).byteValue()));
                return C23454a0.f92919a;
            case 27:
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    ((AbstractC20008b) this.f18x).f75082b.resumeWith(AbstractC34132o.m107888l(th4));
                }
                return C23454a0.f92919a;
            case 28:
                Date newTimestamp = (Date) obj;
                AbstractC22676k.m65750j(newTimestamp, "newTimestamp");
                ReplayIntegration replayIntegration = (ReplayIntegration) this.f18x;
                InterfaceC20196l interfaceC20196l = replayIntegration.f75796M;
                if (interfaceC20196l != null) {
                    ((AbstractC20187c) interfaceC20196l).m56110k(Integer.valueOf(((AbstractC20187c) interfaceC20196l).m56107h()).intValue() + 1);
                }
                InterfaceC20196l interfaceC20196l2 = replayIntegration.f75796M;
                if (interfaceC20196l2 != null) {
                    ((AbstractC20187c) interfaceC20196l2).m56112m(newTimestamp);
                }
                return C23454a0.f92919a;
            default:
                ArrayList mViews = (ArrayList) obj;
                AbstractC22676k.m65750j(mViews, "mViews");
                C20231t c20231t = (C20231t) this.f18x;
                C20535s c20535sM56711a = c20231t.f76007x.m56711a();
                try {
                    C20219r c20219r = c20231t.f76009z;
                    c20219r.addAll(mViews);
                    AbstractC21598x.m60698r(c20535sM56711a, null);
                    return c20219r;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC21598x.m60698r(c20535sM56711a, th5);
                        throw th6;
                    }
                }
        }
    }
}
