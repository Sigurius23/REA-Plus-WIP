package l53;

import io.getstream.video.android.core.api.SignalServerService;
import java.util.concurrent.CancellationException;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
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

/* JADX INFO: renamed from: l53.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C23369j implements SignalServerService {

    /* JADX INFO: renamed from: a */
    public final C23372m f92643a;

    /* JADX INFO: renamed from: b */
    public final SignalServerService f92644b;

    public C23369j(C23372m c23372m, SignalServerService target) {
        AbstractC22676k.m65750j(target, "target");
        this.f92643a = c23372m;
        this.f92644b = target;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object iceRestart(ICERestartRequest iCERestartRequest, InterfaceC30057d interfaceC30057d) {
        C23361b c23361b;
        C23369j c23369j;
        String str;
        String message;
        if (interfaceC30057d instanceof C23361b) {
            c23361b = (C23361b) interfaceC30057d;
            int i13 = c23361b.f92603E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23361b.f92603E = i13 - Integer.MIN_VALUE;
            } else {
                c23361b = new C23361b(this, interfaceC30057d);
            }
        } else {
            c23361b = new C23361b(this, interfaceC30057d);
        }
        Object objIceRestart = c23361b.f92606y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23361b.f92603E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objIceRestart);
                this.f92643a.m67653b(String.valueOf(iCERestartRequest), "iceRestart");
                try {
                    SignalServerService signalServerService = this.f92644b;
                    c23361b.f92604w = this;
                    c23361b.f92605x = "iceRestart";
                    c23361b.f92603E = 1;
                    objIceRestart = signalServerService.iceRestart(iCERestartRequest, c23361b);
                    if (objIceRestart == enumC31071a) {
                        return enumC31071a;
                    }
                    c23369j = this;
                    str = "iceRestart";
                } catch (Throwable th3) {
                    th = th3;
                    c23369j = this;
                    str = "iceRestart";
                    C23372m c23372m = c23369j.f92643a;
                    String strM8299l = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m.m67653b(message, strM8299l);
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c23361b.f92605x;
                c23369j = c23361b.f92604w;
                try {
                    AbstractC34132o.m107864I(objIceRestart);
                } catch (Throwable th4) {
                    th = th4;
                    C23372m c23372m2 = c23369j.f92643a;
                    String strM8299l2 = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m2.m67653b(message, strM8299l2);
                    throw th;
                }
            }
            Error error = ((ICERestartResponse) objIceRestart).getError();
            if (error != null) {
                c23369j.f92643a.m67653b(error.toString(), str + "-error");
            }
            return objIceRestart;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object iceTrickle(ICETrickle iCETrickle, InterfaceC30057d interfaceC30057d) {
        C23362c c23362c;
        C23369j c23369j;
        String str;
        String message;
        if (interfaceC30057d instanceof C23362c) {
            c23362c = (C23362c) interfaceC30057d;
            int i13 = c23362c.f92608E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23362c.f92608E = i13 - Integer.MIN_VALUE;
            } else {
                c23362c = new C23362c(this, interfaceC30057d);
            }
        } else {
            c23362c = new C23362c(this, interfaceC30057d);
        }
        Object objIceTrickle = c23362c.f92611y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23362c.f92608E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objIceTrickle);
                this.f92643a.m67653b(String.valueOf(iCETrickle), "iceTrickle");
                try {
                    SignalServerService signalServerService = this.f92644b;
                    c23362c.f92609w = this;
                    c23362c.f92610x = "iceTrickle";
                    c23362c.f92608E = 1;
                    objIceTrickle = signalServerService.iceTrickle(iCETrickle, c23362c);
                    if (objIceTrickle == enumC31071a) {
                        return enumC31071a;
                    }
                    c23369j = this;
                    str = "iceTrickle";
                } catch (Throwable th3) {
                    th = th3;
                    c23369j = this;
                    str = "iceTrickle";
                    C23372m c23372m = c23369j.f92643a;
                    String strM8299l = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m.m67653b(message, strM8299l);
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c23362c.f92610x;
                c23369j = c23362c.f92609w;
                try {
                    AbstractC34132o.m107864I(objIceTrickle);
                } catch (Throwable th4) {
                    th = th4;
                    C23372m c23372m2 = c23369j.f92643a;
                    String strM8299l2 = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m2.m67653b(message, strM8299l2);
                    throw th;
                }
            }
            Error error = ((ICETrickleResponse) objIceTrickle).getError();
            if (error != null) {
                c23369j.f92643a.m67653b(error.toString(), str + "-error");
            }
            return objIceTrickle;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object sendAnswer(SendAnswerRequest sendAnswerRequest, InterfaceC30057d interfaceC30057d) {
        C23363d c23363d;
        C23369j c23369j;
        String str;
        String message;
        if (interfaceC30057d instanceof C23363d) {
            c23363d = (C23363d) interfaceC30057d;
            int i13 = c23363d.f92613E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23363d.f92613E = i13 - Integer.MIN_VALUE;
            } else {
                c23363d = new C23363d(this, interfaceC30057d);
            }
        } else {
            c23363d = new C23363d(this, interfaceC30057d);
        }
        Object objSendAnswer = c23363d.f92616y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23363d.f92613E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objSendAnswer);
                this.f92643a.m67653b(String.valueOf(sendAnswerRequest), "sendAnswer");
                try {
                    SignalServerService signalServerService = this.f92644b;
                    c23363d.f92614w = this;
                    c23363d.f92615x = "sendAnswer";
                    c23363d.f92613E = 1;
                    objSendAnswer = signalServerService.sendAnswer(sendAnswerRequest, c23363d);
                    if (objSendAnswer == enumC31071a) {
                        return enumC31071a;
                    }
                    c23369j = this;
                    str = "sendAnswer";
                } catch (Throwable th3) {
                    th = th3;
                    c23369j = this;
                    str = "sendAnswer";
                    C23372m c23372m = c23369j.f92643a;
                    String strM8299l = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m.m67653b(message, strM8299l);
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c23363d.f92615x;
                c23369j = c23363d.f92614w;
                try {
                    AbstractC34132o.m107864I(objSendAnswer);
                } catch (Throwable th4) {
                    th = th4;
                    C23372m c23372m2 = c23369j.f92643a;
                    String strM8299l2 = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m2.m67653b(message, strM8299l2);
                    throw th;
                }
            }
            Error error = ((SendAnswerResponse) objSendAnswer).getError();
            if (error != null) {
                c23369j.f92643a.m67653b(error.toString(), str + "-error");
            }
            return objSendAnswer;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object sendMetrics(SendMetricsRequest sendMetricsRequest, InterfaceC30057d interfaceC30057d) {
        return this.f92644b.sendMetrics(sendMetricsRequest, interfaceC30057d);
    }

    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object sendStats(SendStatsRequest sendStatsRequest, InterfaceC30057d interfaceC30057d) {
        return this.f92644b.sendStats(sendStatsRequest, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object setPublisher(SetPublisherRequest setPublisherRequest, InterfaceC30057d interfaceC30057d) {
        C23364e c23364e;
        C23369j c23369j;
        String str;
        String message;
        if (interfaceC30057d instanceof C23364e) {
            c23364e = (C23364e) interfaceC30057d;
            int i13 = c23364e.f92618E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23364e.f92618E = i13 - Integer.MIN_VALUE;
            } else {
                c23364e = new C23364e(this, interfaceC30057d);
            }
        } else {
            c23364e = new C23364e(this, interfaceC30057d);
        }
        Object publisher = c23364e.f92621y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23364e.f92618E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(publisher);
                this.f92643a.m67653b(String.valueOf(setPublisherRequest), "setPublisher");
                try {
                    SignalServerService signalServerService = this.f92644b;
                    c23364e.f92619w = this;
                    c23364e.f92620x = "setPublisher";
                    c23364e.f92618E = 1;
                    publisher = signalServerService.setPublisher(setPublisherRequest, c23364e);
                    if (publisher == enumC31071a) {
                        return enumC31071a;
                    }
                    c23369j = this;
                    str = "setPublisher";
                } catch (Throwable th3) {
                    th = th3;
                    c23369j = this;
                    str = "setPublisher";
                    C23372m c23372m = c23369j.f92643a;
                    String strM8299l = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m.m67653b(message, strM8299l);
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c23364e.f92620x;
                c23369j = c23364e.f92619w;
                try {
                    AbstractC34132o.m107864I(publisher);
                } catch (Throwable th4) {
                    th = th4;
                    C23372m c23372m2 = c23369j.f92643a;
                    String strM8299l2 = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m2.m67653b(message, strM8299l2);
                    throw th;
                }
            }
            Error error = ((SetPublisherResponse) publisher).getError();
            if (error != null) {
                c23369j.f92643a.m67653b(error.toString(), str + "-error");
            }
            return publisher;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object startNoiseCancellation(StartNoiseCancellationRequest startNoiseCancellationRequest, InterfaceC30057d interfaceC30057d) {
        C23365f c23365f;
        C23369j c23369j;
        String str;
        String message;
        if (interfaceC30057d instanceof C23365f) {
            c23365f = (C23365f) interfaceC30057d;
            int i13 = c23365f.f92623E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23365f.f92623E = i13 - Integer.MIN_VALUE;
            } else {
                c23365f = new C23365f(this, interfaceC30057d);
            }
        } else {
            c23365f = new C23365f(this, interfaceC30057d);
        }
        Object objStartNoiseCancellation = c23365f.f92626y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23365f.f92623E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objStartNoiseCancellation);
                this.f92643a.m67653b(String.valueOf(startNoiseCancellationRequest), "startNoiseCancellation");
                try {
                    SignalServerService signalServerService = this.f92644b;
                    c23365f.f92624w = this;
                    c23365f.f92625x = "startNoiseCancellation";
                    c23365f.f92623E = 1;
                    objStartNoiseCancellation = signalServerService.startNoiseCancellation(startNoiseCancellationRequest, c23365f);
                    if (objStartNoiseCancellation == enumC31071a) {
                        return enumC31071a;
                    }
                    c23369j = this;
                    str = "startNoiseCancellation";
                } catch (Throwable th3) {
                    th = th3;
                    c23369j = this;
                    str = "startNoiseCancellation";
                    C23372m c23372m = c23369j.f92643a;
                    String strM8299l = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m.m67653b(message, strM8299l);
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c23365f.f92625x;
                c23369j = c23365f.f92624w;
                try {
                    AbstractC34132o.m107864I(objStartNoiseCancellation);
                } catch (Throwable th4) {
                    th = th4;
                    C23372m c23372m2 = c23369j.f92643a;
                    String strM8299l2 = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m2.m67653b(message, strM8299l2);
                    throw th;
                }
            }
            Error error = ((StartNoiseCancellationResponse) objStartNoiseCancellation).getError();
            if (error != null) {
                c23369j.f92643a.m67653b(error.toString(), str + "-error");
            }
            return objStartNoiseCancellation;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object stopNoiseCancellation(StopNoiseCancellationRequest stopNoiseCancellationRequest, InterfaceC30057d interfaceC30057d) {
        C23366g c23366g;
        C23369j c23369j;
        String str;
        String message;
        if (interfaceC30057d instanceof C23366g) {
            c23366g = (C23366g) interfaceC30057d;
            int i13 = c23366g.f92628E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23366g.f92628E = i13 - Integer.MIN_VALUE;
            } else {
                c23366g = new C23366g(this, interfaceC30057d);
            }
        } else {
            c23366g = new C23366g(this, interfaceC30057d);
        }
        Object objStopNoiseCancellation = c23366g.f92631y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23366g.f92628E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objStopNoiseCancellation);
                this.f92643a.m67653b(String.valueOf(stopNoiseCancellationRequest), "stopNoiseCancellation");
                try {
                    SignalServerService signalServerService = this.f92644b;
                    c23366g.f92629w = this;
                    c23366g.f92630x = "stopNoiseCancellation";
                    c23366g.f92628E = 1;
                    objStopNoiseCancellation = signalServerService.stopNoiseCancellation(stopNoiseCancellationRequest, c23366g);
                    if (objStopNoiseCancellation == enumC31071a) {
                        return enumC31071a;
                    }
                    c23369j = this;
                    str = "stopNoiseCancellation";
                } catch (Throwable th3) {
                    th = th3;
                    c23369j = this;
                    str = "stopNoiseCancellation";
                    C23372m c23372m = c23369j.f92643a;
                    String strM8299l = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m.m67653b(message, strM8299l);
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c23366g.f92630x;
                c23369j = c23366g.f92629w;
                try {
                    AbstractC34132o.m107864I(objStopNoiseCancellation);
                } catch (Throwable th4) {
                    th = th4;
                    C23372m c23372m2 = c23369j.f92643a;
                    String strM8299l2 = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m2.m67653b(message, strM8299l2);
                    throw th;
                }
            }
            Error error = ((StopNoiseCancellationResponse) objStopNoiseCancellation).getError();
            if (error != null) {
                c23369j.f92643a.m67653b(error.toString(), str + "-error");
            }
            return objStopNoiseCancellation;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object updateMuteStates(UpdateMuteStatesRequest updateMuteStatesRequest, InterfaceC30057d interfaceC30057d) {
        C23367h c23367h;
        C23369j c23369j;
        String str;
        String message;
        if (interfaceC30057d instanceof C23367h) {
            c23367h = (C23367h) interfaceC30057d;
            int i13 = c23367h.f92633E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23367h.f92633E = i13 - Integer.MIN_VALUE;
            } else {
                c23367h = new C23367h(this, interfaceC30057d);
            }
        } else {
            c23367h = new C23367h(this, interfaceC30057d);
        }
        Object objUpdateMuteStates = c23367h.f92636y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23367h.f92633E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objUpdateMuteStates);
                this.f92643a.m67653b(String.valueOf(updateMuteStatesRequest), "updateMuteStates");
                try {
                    SignalServerService signalServerService = this.f92644b;
                    c23367h.f92634w = this;
                    c23367h.f92635x = "updateMuteStates";
                    c23367h.f92633E = 1;
                    objUpdateMuteStates = signalServerService.updateMuteStates(updateMuteStatesRequest, c23367h);
                    if (objUpdateMuteStates == enumC31071a) {
                        return enumC31071a;
                    }
                    c23369j = this;
                    str = "updateMuteStates";
                } catch (Throwable th3) {
                    th = th3;
                    c23369j = this;
                    str = "updateMuteStates";
                    C23372m c23372m = c23369j.f92643a;
                    String strM8299l = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m.m67653b(message, strM8299l);
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c23367h.f92635x;
                c23369j = c23367h.f92634w;
                try {
                    AbstractC34132o.m107864I(objUpdateMuteStates);
                } catch (Throwable th4) {
                    th = th4;
                    C23372m c23372m2 = c23369j.f92643a;
                    String strM8299l2 = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m2.m67653b(message, strM8299l2);
                    throw th;
                }
            }
            Error error = ((UpdateMuteStatesResponse) objUpdateMuteStates).getError();
            if (error != null) {
                c23369j.f92643a.m67653b(error.toString(), str + "-error");
            }
            return objUpdateMuteStates;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.video.android.core.api.SignalServerService
    public final Object updateSubscriptions(UpdateSubscriptionsRequest updateSubscriptionsRequest, InterfaceC30057d interfaceC30057d) throws Throwable {
        C23368i c23368i;
        C23369j c23369j;
        String str;
        String message;
        if (interfaceC30057d instanceof C23368i) {
            c23368i = (C23368i) interfaceC30057d;
            int i13 = c23368i.f92638E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23368i.f92638E = i13 - Integer.MIN_VALUE;
            } else {
                c23368i = new C23368i(this, interfaceC30057d);
            }
        } else {
            c23368i = new C23368i(this, interfaceC30057d);
        }
        Object objUpdateSubscriptions = c23368i.f92641y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23368i.f92638E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objUpdateSubscriptions);
                this.f92643a.m67653b(String.valueOf(updateSubscriptionsRequest), "updateSubscriptions");
                try {
                    SignalServerService signalServerService = this.f92644b;
                    c23368i.f92639w = this;
                    c23368i.f92640x = "updateSubscriptions";
                    c23368i.f92638E = 1;
                    objUpdateSubscriptions = signalServerService.updateSubscriptions(updateSubscriptionsRequest, c23368i);
                    if (objUpdateSubscriptions == enumC31071a) {
                        return enumC31071a;
                    }
                    c23369j = this;
                    str = "updateSubscriptions";
                } catch (Throwable th3) {
                    th = th3;
                    c23369j = this;
                    str = "updateSubscriptions";
                    C23372m c23372m = c23369j.f92643a;
                    String strM8299l = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m.m67653b(message, strM8299l);
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c23368i.f92640x;
                c23369j = c23368i.f92639w;
                try {
                    AbstractC34132o.m107864I(objUpdateSubscriptions);
                } catch (Throwable th4) {
                    th = th4;
                    C23372m c23372m2 = c23369j.f92643a;
                    String strM8299l2 = AbstractC2875y.m8299l(str, "-exception");
                    message = th.getMessage();
                    if (message == null) {
                        message = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                        if (message == null) {
                            message = "unknown";
                        }
                    }
                    c23372m2.m67653b(message, strM8299l2);
                    throw th;
                }
            }
            Error error = ((UpdateSubscriptionsResponse) objUpdateSubscriptions).getError();
            if (error != null) {
                c23369j.f92643a.m67653b(error.toString(), str + "-error");
            }
            return objUpdateSubscriptions;
        } catch (CancellationException e5) {
            throw e5;
        }
    }
}
