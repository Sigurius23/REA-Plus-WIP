package p026b2;

import a30.C0290f1;
import a30.C0307l0;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1643y1;
import androidx.room.AbstractC1848z0;
import androidx.room.InterfaceC1843x1;
import b20.C2326f;
import b20.EnumC2325e;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5581l;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivity;
import com.whoop.profile.view.C9749c;
import e00.C12500w;
import e10.C12553k;
import e10.C12567r;
import e10.C12575v;
import e10.InterfaceC12555l;
import ec3.InterfaceC13037f2;
import f53.C14122j;
import g20.C15272r;
import g53.AbstractC15508m;
import h20.C16686k4;
import h40.C16845k;
import i20.C17932c0;
import i20.C17972q0;
import i20.InterfaceC17978t0;
import i93.C18284j;
import io.getstream.video.android.core.call.utils.SfuRetryableException;
import io.ktor.utils.p228io.C20028u;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k63.C22234d;
import l53.C23369j;
import l83.C23454a0;
import my.C26027a;
import n20.C26174i;
import n20.C26176k;
import p00.C28580q;
import p027b3.C2462x0;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p078d1.C11449b;
import p078d1.C11458k;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12314q;
import p133f1.C13966p;
import p133f1.C13968p1;
import p133f1.C13988w0;
import p163g1.C14947a0;
import p164g2.C15247s;
import p179h.C16353k;
import p180h0.C16379d4;
import p180h0.C16470w;
import p180h0.InterfaceC16450s;
import p182h3.ScrollCaptureCallbackC16787c;
import p292l1.AbstractC23092f1;
import p316m1.AbstractC24917o;
import p329n0.C26068u;
import p33.C28822o;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p708hb2.C17095c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.jvm.internal.C22669g0;
import q20.AbstractC29840y;
import q30.AbstractC29894a0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32132a;
import s83.AbstractC32275i;
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
import v00.C35459c0;
import w43.C36827a;
import x30.AbstractC37926s0;
import x63.InterfaceC38034f;
import y00.InterfaceC38946s;

/* JADX INFO: renamed from: b2.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C2319y extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f9148E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f9149F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9150w;

    /* JADX INFO: renamed from: x */
    public int f9151x;

    /* JADX INFO: renamed from: y */
    public Object f9152y;

    /* JADX INFO: renamed from: z */
    public Object f9153z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2319y(AbstractC1848z0 abstractC1848z0, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f9150w = 19;
        this.f9148E = abstractC1848z0;
        this.f9149F = function1;
    }

    /* JADX INFO: renamed from: f */
    private final Object m7161f(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i14 = 1;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        C26068u c26068u = (C26068u) this.f9152y;
        Function1 function1 = (Function1) this.f9153z;
        AbstractC24917o abstractC24917o = (AbstractC24917o) this.f9148E;
        C18284j c18284j = (C18284j) this.f9149F;
        this.f9151x = 1;
        float f13 = AbstractC23092f1.f91167a;
        Object objCollect = AbstractC28683x.m87240H(new C9749c(c26068u, i14)).collect(new C22234d(c26068u, function1, abstractC24917o, c18284j, 1), this);
        if (objCollect != enumC31071a) {
            objCollect = c23454a0;
        }
        return objCollect == enumC31071a ? enumC31071a : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX INFO: renamed from: h */
    private final Object m7162h(Object obj) throws Throwable {
        InterfaceC12555l interfaceC12555lM34319K;
        String strM31996o;
        C26174i c26174i = (C26174i) this.f9149F;
        AbstractC29840y abstractC29840y = (AbstractC29840y) this.f9153z;
        C0290f1 c0290f1 = (C0290f1) this.f9148E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f9152y;
        if (abstractC29840y != null) {
            C26027a c26027a = c0290f1.f1020w;
            C35459c0 c35459c0 = c0290f1.f1019E;
            C0307l0 c0307l0 = c35459c0.f150995l0;
            interfaceC12555lM34319K = AbstractC12314q.m34319K(abstractC29840y, c26027a, c0307l0 != null ? c0307l0.f1058w : null, c35459c0.f150982Y);
        } else {
            interfaceC12555lM34319K = null;
        }
        if (interfaceC12555lM34319K != null) {
            C26176k c26176k = c26174i.f103778i;
            C12553k c12553k = new C12553k(interfaceC12555lM34319K, c0290f1.f1019E);
            this.f9152y = interfaceC2994c0;
            this.f9151x = 1;
            Object objM35251g = c26176k.f103797b.m35251g(c12553k, this);
            if (objM35251g != enumC31071a) {
                objM35251g = c23454a0;
            }
            return objM35251g == enumC31071a ? enumC31071a : c23454a0;
        }
        if (abstractC29840y != null) {
            strM31996o = AbstractC11895b.m31996o("Cannot confirm using a ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(abstractC29840y.getClass()).getQualifiedName(), " payment selection!");
            if (strM31996o == null) {
                strM31996o = "Cannot confirm without a payment selection!";
            }
        } else {
            strM31996o = "Cannot confirm without a payment selection!";
        }
        IllegalStateException illegalStateException = new IllegalStateException(strM31996o);
        if (abstractC29840y != null) {
            EnumC2325e enumC2325e = EnumC2325e.FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT;
            C2326f c2326f = c26174i.f103787r;
            int i14 = StripeException.f22154E;
            AbstractC35903f.m113990H(c2326f, enumC2325e, AbstractC32123d.m100024d(illegalStateException), null, 4);
        }
        C26174i.m77718a(c26174i, new C12575v(illegalStateException, AbstractC37926s0.m121456H(illegalStateException), C12567r.f42912a));
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r10.m5457d(r9) == r2) goto L34;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m7163i(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f9149F
            kotlin.jvm.functions.Function1 r0 = (p715kotlin.jvm.functions.Function1) r0
            java.lang.Object r1 = r9.f9148E
            androidx.room.z0 r1 = (androidx.room.AbstractC1848z0) r1
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r9.f9151x
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L50
            if (r3 == r7) goto L44
            if (r3 == r6) goto L38
            if (r3 == r5) goto L30
            if (r3 == r4) goto L29
            r0 = 5
            if (r3 != r0) goto L21
            p505ts.AbstractC34132o.m107864I(r10)
            return r10
        L21:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L29:
            java.lang.Object r0 = r9.f9152y
            p505ts.AbstractC34132o.m107864I(r10)
            goto La5
        L30:
            java.lang.Object r0 = r9.f9152y
            androidx.room.x1 r0 = (androidx.room.InterfaceC1843x1) r0
            p505ts.AbstractC34132o.m107864I(r10)
            goto L97
        L38:
            java.lang.Object r3 = r9.f9153z
            androidx.room.w1 r3 = (androidx.room.EnumC1840w1) r3
            java.lang.Object r6 = r9.f9152y
            androidx.room.x1 r6 = (androidx.room.InterfaceC1843x1) r6
            p505ts.AbstractC34132o.m107864I(r10)
            goto L83
        L44:
            java.lang.Object r3 = r9.f9153z
            androidx.room.w1 r3 = (androidx.room.EnumC1840w1) r3
            java.lang.Object r7 = r9.f9152y
            androidx.room.x1 r7 = (androidx.room.InterfaceC1843x1) r7
            p505ts.AbstractC34132o.m107864I(r10)
            goto L69
        L50:
            p505ts.AbstractC34132o.m107864I(r10)
            java.lang.Object r10 = r9.f9152y
            androidx.room.x1 r10 = (androidx.room.InterfaceC1843x1) r10
            androidx.room.w1 r3 = androidx.room.EnumC1840w1.f7204x
            r9.f9152y = r10
            r9.f9153z = r3
            r9.f9151x = r7
            java.lang.Boolean r7 = r10.mo5462a(r9)
            if (r7 != r2) goto L66
            goto La1
        L66:
            r8 = r7
            r7 = r10
            r10 = r8
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L82
            androidx.room.v r10 = r1.getInvalidationTracker()
            r9.f9152y = r7
            r9.f9153z = r3
            r9.f9151x = r6
            java.lang.Object r10 = r10.m5457d(r9)
            if (r10 != r2) goto L82
            goto La1
        L82:
            r6 = r7
        L83:
            n20.j r10 = new n20.j
            r7 = 0
            r10.<init>(r7, r0)
            r9.f9152y = r6
            r9.f9153z = r7
            r9.f9151x = r5
            java.lang.Object r10 = r6.mo5463b(r3, r10, r9)
            if (r10 != r2) goto L96
            goto La1
        L96:
            r0 = r6
        L97:
            r9.f9152y = r10
            r9.f9151x = r4
            java.lang.Boolean r0 = r0.mo5462a(r9)
            if (r0 != r2) goto La2
        La1:
            return r2
        La2:
            r8 = r0
            r0 = r10
            r10 = r8
        La5:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto Lba
            androidx.room.v r10 = r1.getInvalidationTracker()
            androidx.room.i2 r1 = r10.f7189c
            androidx.room.r r2 = r10.f7192f
            androidx.room.r r10 = r10.f7193g
            r1.m5423e(r2, r10)
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p026b2.C2319y.m7163i(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    private final Object m7164j(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            if (((C28580q) this.f9152y).f115649x) {
                this.f9151x = 1;
                if (AbstractC3034m0.m8782b(650L, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        ((C15247s) this.f9153z).m43352b();
        InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) this.f9148E;
        if (interfaceC2464x2 != null) {
            ((C2463x1) interfaceC2464x2).m7443b();
        }
        ((InterfaceC4339a) this.f9149F).invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m7165k(Object obj) throws SfuRetryableException {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C23369j c23369j = ((C28822o) this.f9148E).f116690a;
            ICERestartRequest iCERestartRequest = (ICERestartRequest) this.f9149F;
            this.f9151x = 1;
            obj = c23369j.iceRestart(iCERestartRequest, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        ((C22669g0) this.f9152y).f89336w = obj;
        Error error = ((ICERestartResponse) obj).getError();
        if (error == null || !error.getShould_retry() || C28822o.m87679a(error)) {
            return obj;
        }
        throw new SfuRetryableException(error.getMessage());
    }

    /* JADX INFO: renamed from: l */
    private final Object m7166l(Object obj) throws SfuRetryableException {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C23369j c23369j = ((C28822o) this.f9148E).f116690a;
            ICETrickle iCETrickle = (ICETrickle) this.f9149F;
            this.f9151x = 1;
            obj = c23369j.iceTrickle(iCETrickle, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        ((C22669g0) this.f9152y).f89336w = obj;
        Error error = ((ICETrickleResponse) obj).getError();
        if (error == null || !error.getShould_retry() || C28822o.m87679a(error)) {
            return obj;
        }
        throw new SfuRetryableException(error.getMessage());
    }

    /* JADX INFO: renamed from: m */
    private final Object m7167m(Object obj) throws SfuRetryableException {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C23369j c23369j = ((C28822o) this.f9148E).f116690a;
            SendAnswerRequest sendAnswerRequest = (SendAnswerRequest) this.f9149F;
            this.f9151x = 1;
            obj = c23369j.sendAnswer(sendAnswerRequest, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        ((C22669g0) this.f9152y).f89336w = obj;
        Error error = ((SendAnswerResponse) obj).getError();
        if (error == null || !error.getShould_retry() || C28822o.m87679a(error)) {
            return obj;
        }
        throw new SfuRetryableException(error.getMessage());
    }

    /* JADX INFO: renamed from: o */
    private final Object m7168o(Object obj) throws SfuRetryableException {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C23369j c23369j = ((C28822o) this.f9148E).f116690a;
            SendStatsRequest sendStatsRequest = (SendStatsRequest) this.f9149F;
            this.f9151x = 1;
            obj = c23369j.f92644b.sendStats(sendStatsRequest, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        ((C22669g0) this.f9152y).f89336w = obj;
        Error error = ((SendStatsResponse) obj).getError();
        if (error == null || !error.getShould_retry() || C28822o.m87679a(error)) {
            return obj;
        }
        throw new SfuRetryableException(error.getMessage());
    }

    /* JADX INFO: renamed from: p */
    private final Object m7169p(Object obj) throws SfuRetryableException {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C23369j c23369j = ((C28822o) this.f9148E).f116690a;
            SetPublisherRequest setPublisherRequest = (SetPublisherRequest) this.f9149F;
            this.f9151x = 1;
            obj = c23369j.setPublisher(setPublisherRequest, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        ((C22669g0) this.f9152y).f89336w = obj;
        Error error = ((SetPublisherResponse) obj).getError();
        if (error == null || !error.getShould_retry() || C28822o.m87679a(error)) {
            return obj;
        }
        throw new SfuRetryableException(error.getMessage());
    }

    /* JADX INFO: renamed from: q */
    private final Object m7170q(Object obj) throws SfuRetryableException {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C23369j c23369j = ((C28822o) this.f9148E).f116690a;
            StartNoiseCancellationRequest startNoiseCancellationRequest = (StartNoiseCancellationRequest) this.f9149F;
            this.f9151x = 1;
            obj = c23369j.startNoiseCancellation(startNoiseCancellationRequest, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        ((C22669g0) this.f9152y).f89336w = obj;
        Error error = ((StartNoiseCancellationResponse) obj).getError();
        if (error == null || !error.getShould_retry() || C28822o.m87679a(error)) {
            return obj;
        }
        throw new SfuRetryableException(error.getMessage());
    }

    /* JADX INFO: renamed from: r */
    private final Object m7171r(Object obj) throws SfuRetryableException {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f9151x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C23369j c23369j = ((C28822o) this.f9148E).f116690a;
            StopNoiseCancellationRequest stopNoiseCancellationRequest = (StopNoiseCancellationRequest) this.f9149F;
            this.f9151x = 1;
            obj = c23369j.stopNoiseCancellation(stopNoiseCancellationRequest, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        ((C22669g0) this.f9152y).f89336w = obj;
        Error error = ((StopNoiseCancellationResponse) obj).getError();
        if (error == null || !error.getShould_retry() || C28822o.m87679a(error)) {
            return obj;
        }
        throw new SfuRetryableException(error.getMessage());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v4, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f9150w) {
            case 0:
                C2319y c2319y = new C2319y((Function1) this.f9153z, (AtomicReference) this.f9148E, (InterfaceC4351m) this.f9149F, interfaceC30057d);
                c2319y.f9152y = obj;
                return c2319y;
            case 1:
                C2319y c2319y2 = new C2319y((Function1) this.f9153z, (C11449b) this.f9148E, (C11458k) this.f9149F, interfaceC30057d, 1);
                c2319y2.f9152y = obj;
                return c2319y2;
            case 2:
                return new C2319y((Stripe3ds2TransactionActivity) this.f9153z, (AbstractC29894a0) this.f9148E, (C1643y1) this.f9149F, interfaceC30057d, 2);
            case 3:
                C2319y c2319y3 = new C2319y((C12500w) this.f9153z, (String) this.f9148E, (String) this.f9149F, interfaceC30057d, 3);
                c2319y3.f9152y = obj;
                return c2319y3;
            case 4:
                return new C2319y((C13966p) this.f9148E, (InterfaceC4351m) this.f9149F, interfaceC30057d);
            case 5:
                return new C2319y((C13988w0) this.f9152y, (C22669g0) this.f9153z, (C22669g0) this.f9148E, (C22667f0) this.f9149F, interfaceC30057d, 5);
            case 6:
                C2319y c2319y4 = new C2319y((C14122j) this.f9153z, (InterfaceC2994c0) this.f9148E, (C22669g0) this.f9149F, interfaceC30057d, 6);
                c2319y4.f9152y = obj;
                return c2319y4;
            case 7:
                return new C2319y((C14947a0) this.f9152y, (InterfaceC28601c1) this.f9153z, (InterfaceC28601c1) this.f9148E, (InterfaceC28601c1) this.f9149F, interfaceC30057d, 7);
            case 8:
                return new C2319y((C15272r) this.f9153z, (InterfaceC38946s) this.f9148E, (C32132a) this.f9149F, interfaceC30057d, 8);
            case 9:
                return new C2319y((C15272r) this.f9153z, (String) this.f9148E, (C32132a) this.f9149F, interfaceC30057d, 9);
            case 10:
                return new C2319y((C16353k) this.f9153z, (InterfaceC4351m) this.f9149F, (C13968p1) this.f9148E, interfaceC30057d);
            case 11:
                C2319y c2319y5 = new C2319y((C16470w) this.f9153z, (C16379d4) this.f9148E, (InterfaceC16450s) this.f9149F, interfaceC30057d, 11);
                c2319y5.f9152y = obj;
                return c2319y5;
            case 12:
                C2319y c2319y6 = new C2319y((C16686k4) this.f9148E, (AbstractC29840y) this.f9149F, interfaceC30057d, 12);
                c2319y6.f9152y = obj;
                return c2319y6;
            case 13:
                return new C2319y((ScrollCaptureCallbackC16787c) this.f9152y, (ScrollCaptureSession) this.f9153z, (Rect) this.f9148E, (Consumer) this.f9149F, interfaceC30057d, 13);
            case 14:
                C2319y c2319y7 = new C2319y((C17932c0) this.f9153z, (AutocompleteActivity) this.f9148E, (C16845k) this.f9149F, interfaceC30057d, 14);
                c2319y7.f9152y = obj;
                return c2319y7;
            case 15:
                C2319y c2319y8 = new C2319y((InterfaceC13037f2) this.f9153z, (C17972q0) this.f9148E, (C17095c) this.f9149F, interfaceC30057d, 15);
                c2319y8.f9152y = obj;
                return c2319y8;
            case 16:
                C2319y c2319y9 = new C2319y((InterfaceC38034f) this.f9148E, (InputStream) this.f9149F, interfaceC30057d, 16);
                c2319y9.f9152y = obj;
                return c2319y9;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C2319y((C26068u) this.f9152y, (Function1) this.f9153z, (AbstractC24917o) this.f9148E, (C18284j) this.f9149F, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C2319y c2319y10 = new C2319y((AbstractC29840y) this.f9153z, (C0290f1) this.f9148E, (C26174i) this.f9149F, interfaceC30057d, 18);
                c2319y10.f9152y = obj;
                return c2319y10;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C2319y c2319y11 = new C2319y((AbstractC1848z0) this.f9148E, (Function1) this.f9149F, interfaceC30057d);
                c2319y11.f9152y = obj;
                return c2319y11;
            case 20:
                return new C2319y((C28580q) this.f9152y, (C15247s) this.f9153z, (InterfaceC2464x2) this.f9148E, (InterfaceC4339a) this.f9149F, interfaceC30057d, 20);
            case 21:
                return new C2319y((C22669g0) this.f9152y, (C28822o) this.f9153z, interfaceC30057d, (C28822o) this.f9148E, (ICERestartRequest) this.f9149F, 21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C2319y((C22669g0) this.f9152y, (C28822o) this.f9153z, interfaceC30057d, (C28822o) this.f9148E, (ICETrickle) this.f9149F, 22);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C2319y((C22669g0) this.f9152y, (C28822o) this.f9153z, interfaceC30057d, (C28822o) this.f9148E, (SendAnswerRequest) this.f9149F, 23);
            case 24:
                return new C2319y((C22669g0) this.f9152y, (C28822o) this.f9153z, interfaceC30057d, (C28822o) this.f9148E, (SendMetricsRequest) this.f9149F, 24);
            case 25:
                return new C2319y((C22669g0) this.f9152y, (C28822o) this.f9153z, interfaceC30057d, (C28822o) this.f9148E, (SendStatsRequest) this.f9149F, 25);
            case 26:
                return new C2319y((C22669g0) this.f9152y, (C28822o) this.f9153z, interfaceC30057d, (C28822o) this.f9148E, (SetPublisherRequest) this.f9149F, 26);
            case 27:
                return new C2319y((C22669g0) this.f9152y, (C28822o) this.f9153z, interfaceC30057d, (C28822o) this.f9148E, (StartNoiseCancellationRequest) this.f9149F, 27);
            case 28:
                return new C2319y((C22669g0) this.f9152y, (C28822o) this.f9153z, interfaceC30057d, (C28822o) this.f9148E, (StopNoiseCancellationRequest) this.f9149F, 28);
            default:
                return new C2319y((C22669g0) this.f9152y, (C28822o) this.f9153z, interfaceC30057d, (C28822o) this.f9148E, (UpdateMuteStatesRequest) this.f9149F, 29);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f9150w) {
            case 0:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                ((C2319y) create((C2462x0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 2:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C2319y) create((AbstractC15508m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C2319y) create((InterfaceC17978t0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 15:
                ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 16:
                return ((C2319y) create((C20028u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C2319y) create((InterfaceC1843x1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C2319y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C2319y) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C2319y) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C2319y) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C2319y) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C2319y) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 26:
                return ((C2319y) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 27:
                return ((C2319y) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 28:
                return ((C2319y) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C2319y) create((C36827a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0282  */
    /* JADX WARN: Code duplicated, block: B:148:0x0296  */
    /* JADX WARN: Code duplicated, block: B:150:0x029f  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:345:0x0718  */
    /* JADX WARN: Code duplicated, block: B:347:0x0728  */
    /* JADX WARN: Code duplicated, block: B:433:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:480:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:609:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x070f, code lost:
    
        if (r6.m56580C(r1, false, r45) == r2) goto L407;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v120, types: [h0.w] */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v126 */
    /* JADX WARN: Type inference failed for: r1v127 */
    /* JADX WARN: Type inference failed for: r1v128 */
    /* JADX WARN: Type inference failed for: r1v129, types: [h0.w] */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r1v149 */
    /* JADX WARN: Type inference failed for: r1v150 */
    /* JADX WARN: Type inference failed for: r1v151 */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v134 */
    /* JADX WARN: Type inference failed for: r2v135 */
    /* JADX WARN: Type inference failed for: r2v25, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r2v97, types: [h0.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p026b2.C2319y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2319y(C13966p c13966p, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f9150w = 4;
        this.f9148E = c13966p;
        this.f9149F = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2319y(C16353k c16353k, InterfaceC4351m interfaceC4351m, C13968p1 c13968p1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f9150w = 10;
        this.f9153z = c16353k;
        this.f9149F = interfaceC4351m;
        this.f9148E = c13968p1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2319y(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9150w = i13;
        this.f9152y = obj;
        this.f9153z = obj2;
        this.f9148E = obj3;
        this.f9149F = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2319y(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9150w = i13;
        this.f9153z = obj;
        this.f9148E = obj2;
        this.f9149F = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2319y(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9150w = i13;
        this.f9148E = obj;
        this.f9149F = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2319y(Function1 function1, AtomicReference atomicReference, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f9150w = 0;
        this.f9153z = (AbstractC22680m) function1;
        this.f9148E = atomicReference;
        this.f9149F = interfaceC4351m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2319y(C22669g0 c22669g0, C28822o c28822o, InterfaceC30057d interfaceC30057d, C28822o c28822o2, AbstractC5581l abstractC5581l, int i13) {
        super(2, interfaceC30057d);
        this.f9150w = i13;
        this.f9152y = c22669g0;
        this.f9153z = c28822o;
        this.f9148E = c28822o2;
        this.f9149F = abstractC5581l;
    }
}
