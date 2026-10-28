package com.stripe.android.core.networking;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import com.stripe.android.core.exception.InvalidRequestException;
import l83.C23468n;
import o23.C27486p;
import p012ab.C0684i0;
import p218ic.AbstractC18386u;
import p218ic.C18380r;
import p218ic.C18382s;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p664yy.C39862h0;
import p664yy.C39874n0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import yv0.C39805h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class SendAnalyticsRequestV2Worker extends CoroutineWorker {

    /* JADX INFO: renamed from: w */
    public static final C0684i0 f22162w = new C0684i0((InterfaceC30063j) null, (C30765d) null, 31);

    /* JADX INFO: renamed from: x */
    public static final C39805h f22163x = new C39805h(11);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAnalyticsRequestV2Worker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(params, "params");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(InterfaceC30057d interfaceC30057d) throws Throwable {
        C39862h0 c39862h0;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker2;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker3;
        Object objM107888l;
        Throwable thM68037a;
        if (interfaceC30057d instanceof C39862h0) {
            c39862h0 = (C39862h0) interfaceC30057d;
            int i13 = c39862h0.f172145E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39862h0.f172145E = i13 - Integer.MIN_VALUE;
            } else {
                c39862h0 = new C39862h0(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c39862h0 = new C39862h0(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM8705K = c39862h0.f172148y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39862h0.f172145E;
        InterfaceC30057d interfaceC30057d2 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            String strM52860c = getInputData().m52860c("data");
            if (strM52860c == null) {
                return new C18380r();
            }
            Context applicationContext = getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            C29938w0 c29938w0 = (C29938w0) f22163x.invoke(applicationContext);
            c39862h0.f172146w = this;
            c39862h0.f172147x = this;
            c39862h0.f172145E = 1;
            objM8705K = AbstractC3006f0.m8705K((AbstractC3076z) c29938w0.f122261y, new C27486p(c29938w0, strM52860c, interfaceC30057d2, 19), c39862h0);
            if (objM8705K != enumC31071a) {
                sendAnalyticsRequestV2Worker = this;
                sendAnalyticsRequestV2Worker2 = sendAnalyticsRequestV2Worker;
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sendAnalyticsRequestV2Worker3 = c39862h0.f172146w;
            try {
                AbstractC34132o.m107864I(objM8705K);
                objM107888l = (C39874n0) objM8705K;
            } catch (Throwable th3) {
                th = th3;
                objM107888l = AbstractC34132o.m107888l(th);
            }
            thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a == null) {
                return (!(thM68037a instanceof InvalidRequestException) || sendAnalyticsRequestV2Worker3.getRunAttemptCount() >= 4) ? new C18380r() : new C18382s();
            }
            return AbstractC18386u.m52885b();
        }
        sendAnalyticsRequestV2Worker = c39862h0.f172147x;
        sendAnalyticsRequestV2Worker2 = c39862h0.f172146w;
        AbstractC34132o.m107864I(objM8705K);
        AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) objM8705K;
        if (analyticsRequestV2 == null) {
            return new C18380r();
        }
        AnalyticsRequestV2 analyticsRequestV2WithWorkManagerParams = analyticsRequestV2.withWorkManagerParams(sendAnalyticsRequestV2Worker.getRunAttemptCount());
        try {
            C0684i0 c0684i0 = f22162w;
            c39862h0.f172146w = sendAnalyticsRequestV2Worker2;
            c39862h0.f172147x = null;
            c39862h0.f172145E = 2;
            objM8705K = c0684i0.m1727r(analyticsRequestV2WithWorkManagerParams, c39862h0);
            if (objM8705K != enumC31071a) {
                sendAnalyticsRequestV2Worker3 = sendAnalyticsRequestV2Worker2;
                objM107888l = (C39874n0) objM8705K;
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    if (thM68037a instanceof InvalidRequestException) {
                    }
                }
                return AbstractC18386u.m52885b();
            }
            return enumC31071a;
        } catch (Throwable th4) {
            th = th4;
            sendAnalyticsRequestV2Worker3 = sendAnalyticsRequestV2Worker2;
            objM107888l = AbstractC34132o.m107888l(th);
        }
    }
}
