package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.internal.C5099k0;
import java.util.Collections;
import java.util.Set;
import jp.HandlerC21846d;
import p002a0.C0025h;
import p035bp.C3510a;
import p073cq.C11040i;
import p073cq.C11052u;
import p249jc.C21567b;
import p477s2.AbstractC32076h;
import p479s4.AbstractC32122c;
import p529uo.AbstractC35107c;
import p529uo.AbstractC35135w;
import p529uo.C35111e;
import p688zp.C40937a;
import to.AbstractC33967d;
import to.AbstractC33983l;
import to.AbstractC33993q;
import to.AbstractC33995r;
import to.BinderC33978i0;
import to.C33961a;
import to.C33970e0;
import to.C33971f;
import to.C33974g0;
import to.C33976h0;
import to.C33979j;
import to.C33981k;
import to.C33982k0;
import to.C33984l0;
import to.C33985m;
import to.C33986m0;
import to.C33997s;
import to.C33999t;
import to.C34003v;
import to.C34005x;
import to.InterfaceC33989o;

/* JADX INFO: renamed from: com.google.android.gms.common.api.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4977h implements InterfaceC4981l {
    protected final C33971f zaa;
    private final Context zab;
    private final String zac;
    private final C3510a zad;
    private final C4975f zae;
    private final InterfaceC4972c zaf;
    private final C33961a zag;
    private final Looper zah;
    private final int zai;
    private final AbstractC4980k zaj;
    private final InterfaceC33989o zak;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC4977h(Activity activity, C4975f c4975f, C21567b c21567b) {
        Looper mainLooper = activity.getMainLooper();
        AbstractC35135w.m111095g(mainLooper, "Looper must not be null.");
        this(activity, activity, c4975f, InterfaceC4972c.f20498g, new C4976g(c21567b, mainLooper));
    }

    /* JADX INFO: renamed from: a */
    public final void m15597a(int i13, AbstractC33967d abstractC33967d) {
        abstractC33967d.m15606b0();
        C33971f c33971f = this.zaa;
        c33971f.getClass();
        C33970e0 c33970e0 = new C33970e0(new C33982k0(i13, abstractC33967d), c33971f.f142422I.get(), this);
        HandlerC21846d handlerC21846d = c33971f.f142427N;
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(4, c33970e0));
    }

    public AbstractC4980k asGoogleApiClient() {
        return this.zaj;
    }

    /* JADX INFO: renamed from: b */
    public final C11052u m15598b(int i13, AbstractC33993q abstractC33993q) {
        C11040i c11040i = new C11040i();
        InterfaceC33989o interfaceC33989o = this.zak;
        C33971f c33971f = this.zaa;
        c33971f.getClass();
        c33971f.m107431c(c11040i, abstractC33993q.m107466c(), this);
        C33970e0 c33970e0 = new C33970e0(new C33986m0(i13, abstractC33993q, c11040i, interfaceC33989o), c33971f.f142422I.get(), this);
        HandlerC21846d handlerC21846d = c33971f.f142427N;
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(4, c33970e0));
        return c11040i.f34644a;
    }

    public C35111e createClientSettingsBuilder() {
        C35111e c35111e = new C35111e();
        Set set = Collections.EMPTY_SET;
        if (c35111e.f148992a == null) {
            c35111e.f148992a = new C0025h(0);
        }
        c35111e.f148992a.addAll(set);
        Context context = this.zab;
        c35111e.f148994c = context.getClass().getName();
        c35111e.f148993b = context.getPackageName();
        return c35111e;
    }

    public Task<Boolean> disconnectService() {
        C33971f c33971f = this.zaa;
        c33971f.getClass();
        C33999t c33999t = new C33999t(getApiKey());
        HandlerC21846d handlerC21846d = c33971f.f142427N;
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(14, c33999t));
        return c33999t.m107474b().f34644a;
    }

    public <A extends InterfaceC4973d, T extends AbstractC33967d> T doBestEffortWrite(T t14) {
        m15597a(2, t14);
        return t14;
    }

    public <A extends InterfaceC4973d, T extends AbstractC33967d> T doRead(T t14) {
        m15597a(0, t14);
        return t14;
    }

    @Deprecated
    public <A extends InterfaceC4973d, T extends AbstractC33983l, U extends AbstractC33995r> Task<Void> doRegisterEventListener(T t14, U u3) {
        AbstractC35135w.m111094f(t14);
        AbstractC35135w.m111094f(u3);
        AbstractC35135w.m111095g(t14.m107455a(), "Listener has already been released.");
        AbstractC35135w.m111095g(u3.m107468a(), "Listener has already been released.");
        AbstractC35135w.m111090b(AbstractC35135w.m111097i(t14.m107455a(), u3.m107468a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.m107434h(this, t14, u3, RunnableC4983n.f20515x);
    }

    public Task<Boolean> doUnregisterEventListener(C33979j c33979j) {
        return doUnregisterEventListener(c33979j, 0);
    }

    public <A extends InterfaceC4973d, T extends AbstractC33967d> T doWrite(T t14) {
        m15597a(1, t14);
        return t14;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    @Override // com.google.android.gms.common.api.InterfaceC4981l
    public final C33961a getApiKey() {
        return this.zag;
    }

    public InterfaceC4972c getApiOptions() {
        return this.zaf;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zah;
    }

    public <L> C33981k registerListener(L l7, String str) {
        return AbstractC32076h.m99774g(this.zah, l7, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC4973d zaa(Looper looper, C34003v c34003v) {
        C35111e c35111eCreateClientSettingsBuilder = createClientSettingsBuilder();
        C5099k0 c5099k0 = new C5099k0(c35111eCreateClientSettingsBuilder.f148992a, null, c35111eCreateClientSettingsBuilder.f148993b, c35111eCreateClientSettingsBuilder.f148994c, C40937a.f176616w);
        AbstractC4970a abstractC4970a = this.zae.f20499a;
        AbstractC35135w.m111094f(abstractC4970a);
        InterfaceC4973d interfaceC4973dMo15595a = abstractC4970a.mo15595a(this.zab, looper, c5099k0, this.zaf, c34003v, c34003v);
        C3510a c3510a = this.zad;
        if (c3510a != null && (interfaceC4973dMo15595a instanceof AbstractC35107c)) {
            ((AbstractC35107c) interfaceC4973dMo15595a).f148980s = c3510a;
            return interfaceC4973dMo15595a;
        }
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (interfaceC4973dMo15595a instanceof AbstractC35107c)) {
            ((AbstractC35107c) interfaceC4973dMo15595a).f148979r = contextAttributionTag;
        }
        return interfaceC4973dMo15595a;
    }

    public final int zab() {
        return this.zai;
    }

    public final BinderC33978i0 zac(Context context, Handler handler) {
        C35111e c35111eCreateClientSettingsBuilder = createClientSettingsBuilder();
        return new BinderC33978i0(context, handler, new C5099k0(c35111eCreateClientSettingsBuilder.f148992a, null, c35111eCreateClientSettingsBuilder.f148993b, c35111eCreateClientSettingsBuilder.f148994c, C40937a.f176616w));
    }

    public <TResult, A extends InterfaceC4973d> Task<TResult> doBestEffortWrite(AbstractC33993q abstractC33993q) {
        return m15598b(2, abstractC33993q);
    }

    public <TResult, A extends InterfaceC4973d> Task<TResult> doRead(AbstractC33993q abstractC33993q) {
        return m15598b(0, abstractC33993q);
    }

    public Task<Boolean> doUnregisterEventListener(C33979j c33979j, int i13) {
        AbstractC35135w.m111095g(c33979j, "Listener key cannot be null.");
        C33971f c33971f = this.zaa;
        c33971f.getClass();
        C11040i c11040i = new C11040i();
        c33971f.m107431c(c11040i, i13, this);
        C33970e0 c33970e0 = new C33970e0(new C33984l0(c33979j, c11040i), c33971f.f142422I.get(), this);
        HandlerC21846d handlerC21846d = c33971f.f142427N;
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(13, c33970e0));
        return c11040i.f34644a;
    }

    public <TResult, A extends InterfaceC4973d> Task<TResult> doWrite(AbstractC33993q abstractC33993q) {
        return m15598b(1, abstractC33993q);
    }

    public AbstractC4977h(Context context, Activity activity, C4975f c4975f, InterfaceC4972c interfaceC4972c, C4976g c4976g) {
        String apiFallbackAttributionTag;
        AbstractC35135w.m111095g(context, "Null context is not permitted.");
        AbstractC35135w.m111095g(c4975f, "Api must not be null.");
        AbstractC35135w.m111095g(c4976g, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC35135w.m111095g(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            apiFallbackAttributionTag = AbstractC32122c.getAttributionTag(context);
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = i13 >= 31 ? new C3510a(context.getAttributionSource()) : null;
        this.zae = c4975f;
        this.zaf = interfaceC4972c;
        this.zah = c4976g.f20503b;
        C33961a c33961a = new C33961a(c4975f, interfaceC4972c, apiFallbackAttributionTag);
        this.zag = c33961a;
        this.zaj = new C34005x(this);
        C33971f c33971fM107429e = C33971f.m107429e(applicationContext);
        this.zaa = c33971fM107429e;
        this.zai = c33971fM107429e.f142421H.getAndIncrement();
        this.zak = c4976g.f20502a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C33997s.m107470m(activity, c33971fM107429e, c33961a);
        }
        HandlerC21846d handlerC21846d = c33971fM107429e.f142427N;
        handlerC21846d.sendMessage(handlerC21846d.obtainMessage(7, this));
    }

    public <A extends InterfaceC4973d> Task<Void> doRegisterEventListener(C33985m c33985m) {
        AbstractC35135w.m111094f(c33985m);
        C33974g0 c33974g0 = c33985m.f142459a;
        AbstractC35135w.m111095g(c33974g0.m107455a(), "Listener has already been released.");
        C33976h0 c33976h0 = c33985m.f142460b;
        AbstractC35135w.m111095g(c33976h0.m107468a(), "Listener has already been released.");
        return this.zaa.m107434h(this, c33974g0, c33976h0, RunnableC4983n.f20516y);
    }
}
