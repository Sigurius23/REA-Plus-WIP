package p33;

import io.getstream.video.android.core.api.SignalServerService;
import io.getstream.video.android.core.call.utils.SessionFatalException;
import j43.C21317a;
import l53.C23369j;
import l83.C23468n;
import p026b2.C2319y;
import p088dc.AbstractC11895b;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p507tx.C34230a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import stream.video.sfu.models.Error;
import stream.video.sfu.models.ICETrickle;
import stream.video.sfu.signal.ICERestartRequest;
import stream.video.sfu.signal.ICERestartResponse;
import stream.video.sfu.signal.ICETrickleResponse;
import stream.video.sfu.signal.SendAnswerRequest;
import stream.video.sfu.signal.SendAnswerResponse;
import stream.video.sfu.signal.SendMetricsRequest;
import stream.video.sfu.signal.SendStatsRequest;
import stream.video.sfu.signal.SendStatsResponse;
import stream.video.sfu.signal.SetPublisherRequest;
import stream.video.sfu.signal.SetPublisherResponse;
import stream.video.sfu.signal.StartNoiseCancellationRequest;
import stream.video.sfu.signal.StartNoiseCancellationResponse;
import stream.video.sfu.signal.StopNoiseCancellationRequest;
import stream.video.sfu.signal.StopNoiseCancellationResponse;
import stream.video.sfu.signal.UpdateMuteStatesRequest;
import stream.video.sfu.signal.UpdateMuteStatesResponse;
import stream.video.sfu.signal.UpdateSubscriptionsRequest;
import stream.video.sfu.signal.UpdateSubscriptionsResponse;
import w43.C36828b;

/* JADX INFO: renamed from: p33.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C28822o implements SignalServerService {

    /* JADX INFO: renamed from: a */
    public final C23369j f116690a;

    /* JADX INFO: renamed from: b */
    public final Function1 f116691b;

    /* JADX INFO: renamed from: c */
    public final C33647p f116692c;

    /* JADX INFO: renamed from: d */
    public final C36828b f116693d;

    public C28822o(C23369j c23369j, C21317a c21317a) {
        C33647p c33647p = new C33647p(10);
        C36828b c36828b = new C36828b(new C34230a(2, 1), new C34230a(2, 2));
        this.f116690a = c23369j;
        this.f116691b = c21317a;
        this.f116692c = c33647p;
        this.f116693d = c36828b;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87679a(Error error) {
        int i13 = AbstractC28810c.f116634a[error.getCode().ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object iceRestart(ICERestartRequest iCERestartRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28811d c28811d;
        Object objM106278u;
        C22669g0 c22669g0;
        C28822o c28822o;
        if (interfaceC30057d instanceof C28811d) {
            c28811d = (C28811d) interfaceC30057d;
            int i13 = c28811d.f116635E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28811d.f116635E = i13 - Integer.MIN_VALUE;
            } else {
                c28811d = new C28811d(this, interfaceC30057d);
            }
        } else {
            c28811d = new C28811d(this, interfaceC30057d);
        }
        Object obj = c28811d.f116638y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28811d.f116635E;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C2319y c2319y = new C2319y(c22669g0M32004w, this, (InterfaceC30057d) null, this, iCERestartRequest, 21);
            c28811d.f116636w = this;
            c28811d.f116637x = c22669g0M32004w;
            c28811d.f116635E = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c2319y, c28811d);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
            c28822o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28811d.f116637x;
            c28822o = c28811d.f116636w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        Error error = ((ICERestartResponse) objM106278u).getError();
        if (error != null) {
            c28822o.getClass();
            if (m87679a(error)) {
                c28822o.f116691b.invoke(error);
                throw new SessionFatalException(error.getMessage());
            }
        }
        return objM106278u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object iceTrickle(ICETrickle iCETrickle, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28812e c28812e;
        Object objM106278u;
        C22669g0 c22669g0;
        C28822o c28822o;
        if (interfaceC30057d instanceof C28812e) {
            c28812e = (C28812e) interfaceC30057d;
            int i13 = c28812e.f116640E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28812e.f116640E = i13 - Integer.MIN_VALUE;
            } else {
                c28812e = new C28812e(this, interfaceC30057d);
            }
        } else {
            c28812e = new C28812e(this, interfaceC30057d);
        }
        Object obj = c28812e.f116643y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28812e.f116640E;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C2319y c2319y = new C2319y(c22669g0M32004w, this, (InterfaceC30057d) null, this, iCETrickle, 22);
            c28812e.f116641w = this;
            c28812e.f116642x = c22669g0M32004w;
            c28812e.f116640E = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c2319y, c28812e);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
            c28822o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28812e.f116642x;
            c28822o = c28812e.f116641w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        Error error = ((ICETrickleResponse) objM106278u).getError();
        if (error != null) {
            c28822o.getClass();
            if (m87679a(error)) {
                c28822o.f116691b.invoke(error);
                throw new SessionFatalException(error.getMessage());
            }
        }
        return objM106278u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object sendAnswer(SendAnswerRequest sendAnswerRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28813f c28813f;
        Object objM106278u;
        C22669g0 c22669g0;
        C28822o c28822o;
        if (interfaceC30057d instanceof C28813f) {
            c28813f = (C28813f) interfaceC30057d;
            int i13 = c28813f.f116645E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28813f.f116645E = i13 - Integer.MIN_VALUE;
            } else {
                c28813f = new C28813f(this, interfaceC30057d);
            }
        } else {
            c28813f = new C28813f(this, interfaceC30057d);
        }
        Object obj = c28813f.f116648y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28813f.f116645E;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C2319y c2319y = new C2319y(c22669g0M32004w, this, (InterfaceC30057d) null, this, sendAnswerRequest, 23);
            c28813f.f116646w = this;
            c28813f.f116647x = c22669g0M32004w;
            c28813f.f116645E = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c2319y, c28813f);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
            c28822o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28813f.f116647x;
            c28822o = c28813f.f116646w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        Error error = ((SendAnswerResponse) objM106278u).getError();
        if (error != null) {
            c28822o.getClass();
            if (m87679a(error)) {
                c28822o.f116691b.invoke(error);
                throw new SessionFatalException(error.getMessage());
            }
        }
        return objM106278u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object sendMetrics(SendMetricsRequest sendMetricsRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28814g c28814g;
        Object objM106278u;
        C22669g0 c22669g0;
        if (interfaceC30057d instanceof C28814g) {
            c28814g = (C28814g) interfaceC30057d;
            int i13 = c28814g.f116653z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28814g.f116653z = i13 - Integer.MIN_VALUE;
            } else {
                c28814g = new C28814g(this, interfaceC30057d);
            }
        } else {
            c28814g = new C28814g(this, interfaceC30057d);
        }
        Object obj = c28814g.f116651x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28814g.f116653z;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C2319y c2319y = new C2319y(c22669g0M32004w, this, (InterfaceC30057d) null, this, sendMetricsRequest, 24);
            c28814g.f116650w = c22669g0M32004w;
            c28814g.f116653z = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c2319y, c28814g);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28814g.f116650w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        return objM106278u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object sendStats(SendStatsRequest sendStatsRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28815h c28815h;
        Object objM106278u;
        C22669g0 c22669g0;
        C28822o c28822o;
        if (interfaceC30057d instanceof C28815h) {
            c28815h = (C28815h) interfaceC30057d;
            int i13 = c28815h.f116654E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28815h.f116654E = i13 - Integer.MIN_VALUE;
            } else {
                c28815h = new C28815h(this, interfaceC30057d);
            }
        } else {
            c28815h = new C28815h(this, interfaceC30057d);
        }
        Object obj = c28815h.f116657y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28815h.f116654E;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C2319y c2319y = new C2319y(c22669g0M32004w, this, (InterfaceC30057d) null, this, sendStatsRequest, 25);
            c28815h.f116655w = this;
            c28815h.f116656x = c22669g0M32004w;
            c28815h.f116654E = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c2319y, c28815h);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
            c28822o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28815h.f116656x;
            c28822o = c28815h.f116655w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        Error error = ((SendStatsResponse) objM106278u).getError();
        if (error != null) {
            c28822o.getClass();
            if (m87679a(error)) {
                c28822o.f116691b.invoke(error);
                throw new SessionFatalException(error.getMessage());
            }
        }
        return objM106278u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object setPublisher(SetPublisherRequest setPublisherRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28816i c28816i;
        Object objM106278u;
        C22669g0 c22669g0;
        C28822o c28822o;
        if (interfaceC30057d instanceof C28816i) {
            c28816i = (C28816i) interfaceC30057d;
            int i13 = c28816i.f116659E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28816i.f116659E = i13 - Integer.MIN_VALUE;
            } else {
                c28816i = new C28816i(this, interfaceC30057d);
            }
        } else {
            c28816i = new C28816i(this, interfaceC30057d);
        }
        Object obj = c28816i.f116662y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28816i.f116659E;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C2319y c2319y = new C2319y(c22669g0M32004w, this, (InterfaceC30057d) null, this, setPublisherRequest, 26);
            c28816i.f116660w = this;
            c28816i.f116661x = c22669g0M32004w;
            c28816i.f116659E = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c2319y, c28816i);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
            c28822o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28816i.f116661x;
            c28822o = c28816i.f116660w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        Error error = ((SetPublisherResponse) objM106278u).getError();
        if (error != null) {
            c28822o.getClass();
            if (m87679a(error)) {
                c28822o.f116691b.invoke(error);
                throw new SessionFatalException(error.getMessage());
            }
        }
        return objM106278u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object startNoiseCancellation(StartNoiseCancellationRequest startNoiseCancellationRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28817j c28817j;
        Object objM106278u;
        C22669g0 c22669g0;
        C28822o c28822o;
        if (interfaceC30057d instanceof C28817j) {
            c28817j = (C28817j) interfaceC30057d;
            int i13 = c28817j.f116664E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28817j.f116664E = i13 - Integer.MIN_VALUE;
            } else {
                c28817j = new C28817j(this, interfaceC30057d);
            }
        } else {
            c28817j = new C28817j(this, interfaceC30057d);
        }
        Object obj = c28817j.f116667y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28817j.f116664E;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C2319y c2319y = new C2319y(c22669g0M32004w, this, (InterfaceC30057d) null, this, startNoiseCancellationRequest, 27);
            c28817j.f116665w = this;
            c28817j.f116666x = c22669g0M32004w;
            c28817j.f116664E = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c2319y, c28817j);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
            c28822o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28817j.f116666x;
            c28822o = c28817j.f116665w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        Error error = ((StartNoiseCancellationResponse) objM106278u).getError();
        if (error != null) {
            c28822o.getClass();
            if (m87679a(error)) {
                c28822o.f116691b.invoke(error);
                throw new SessionFatalException(error.getMessage());
            }
        }
        return objM106278u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object stopNoiseCancellation(StopNoiseCancellationRequest stopNoiseCancellationRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28818k c28818k;
        Object objM106278u;
        C22669g0 c22669g0;
        C28822o c28822o;
        if (interfaceC30057d instanceof C28818k) {
            c28818k = (C28818k) interfaceC30057d;
            int i13 = c28818k.f116669E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28818k.f116669E = i13 - Integer.MIN_VALUE;
            } else {
                c28818k = new C28818k(this, interfaceC30057d);
            }
        } else {
            c28818k = new C28818k(this, interfaceC30057d);
        }
        Object obj = c28818k.f116672y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28818k.f116669E;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C2319y c2319y = new C2319y(c22669g0M32004w, this, (InterfaceC30057d) null, this, stopNoiseCancellationRequest, 28);
            c28818k.f116670w = this;
            c28818k.f116671x = c22669g0M32004w;
            c28818k.f116669E = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c2319y, c28818k);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
            c28822o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28818k.f116671x;
            c28822o = c28818k.f116670w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        Error error = ((StopNoiseCancellationResponse) objM106278u).getError();
        if (error != null) {
            c28822o.getClass();
            if (m87679a(error)) {
                c28822o.f116691b.invoke(error);
                throw new SessionFatalException(error.getMessage());
            }
        }
        return objM106278u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object updateMuteStates(UpdateMuteStatesRequest updateMuteStatesRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28819l c28819l;
        Object objM106278u;
        C22669g0 c22669g0;
        C28822o c28822o;
        if (interfaceC30057d instanceof C28819l) {
            c28819l = (C28819l) interfaceC30057d;
            int i13 = c28819l.f116674E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28819l.f116674E = i13 - Integer.MIN_VALUE;
            } else {
                c28819l = new C28819l(this, interfaceC30057d);
            }
        } else {
            c28819l = new C28819l(this, interfaceC30057d);
        }
        Object obj = c28819l.f116677y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28819l.f116674E;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C2319y c2319y = new C2319y(c22669g0M32004w, this, (InterfaceC30057d) null, this, updateMuteStatesRequest, 29);
            c28819l.f116675w = this;
            c28819l.f116676x = c22669g0M32004w;
            c28819l.f116674E = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c2319y, c28819l);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
            c28822o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28819l.f116676x;
            c28822o = c28819l.f116675w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        Error error = ((UpdateMuteStatesResponse) objM106278u).getError();
        if (error != null) {
            c28822o.getClass();
            if (m87679a(error)) {
                c28822o.f116691b.invoke(error);
                throw new SessionFatalException(error.getMessage());
            }
        }
        return objM106278u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object updateSubscriptions(UpdateSubscriptionsRequest updateSubscriptionsRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C28821n c28821n;
        Object objM106278u;
        C22669g0 c22669g0;
        C28822o c28822o;
        if (interfaceC30057d instanceof C28821n) {
            c28821n = (C28821n) interfaceC30057d;
            int i13 = c28821n.f116685E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28821n.f116685E = i13 - Integer.MIN_VALUE;
            } else {
                c28821n = new C28821n(this, interfaceC30057d);
            }
        } else {
            c28821n = new C28821n(this, interfaceC30057d);
        }
        Object obj = c28821n.f116688y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28821n.f116685E;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C28820m c28820m = new C28820m(c22669g0M32004w, this, (InterfaceC30057d) null, this, updateSubscriptionsRequest);
            c28821n.f116686w = this;
            c28821n.f116687x = c22669g0M32004w;
            c28821n.f116685E = 1;
            objM106278u = this.f116692c.m106278u(this.f116693d, c28820m, c28821n);
            if (objM106278u == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g0M32004w;
            c28822o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28821n.f116687x;
            c28822o = c28821n.f116686w;
            AbstractC34132o.m107864I(obj);
            objM106278u = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM106278u);
        if (thM68037a != null && (objM106278u = c22669g0.f89336w) == null) {
            throw thM68037a;
        }
        Error error = ((UpdateSubscriptionsResponse) objM106278u).getError();
        if (error != null) {
            c28822o.getClass();
            if (m87679a(error)) {
                c28822o.f116691b.invoke(error);
                throw new SessionFatalException(error.getMessage());
            }
        }
        return objM106278u;
    }
}
