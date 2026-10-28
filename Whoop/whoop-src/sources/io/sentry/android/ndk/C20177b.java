package io.sentry.android.ndk;

import androidx.lifecycle.RunnableC1605m;
import io.sentry.AbstractC20329f4;
import io.sentry.C20274c4;
import io.sentry.C20315e;
import io.sentry.C20323e7;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.C20481h0;
import p185h6.RunnableC16957l;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.ndk.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C20177b extends AbstractC20329f4 {

    /* JADX INFO: renamed from: a */
    public final C20513q6 f75784a;

    /* JADX INFO: renamed from: b */
    public final NativeScope f75785b;

    public C20177b(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        AbstractC29125c.m88510S(sentryAndroidOptions, "The SentryOptions object is required.");
        this.f75784a = sentryAndroidOptions;
        this.f75785b = nativeScope;
    }

    @Override // io.sentry.AbstractC20329f4, io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: b */
    public final void mo56087b(String str) {
        C20513q6 c20513q6 = this.f75784a;
        try {
            c20513q6.getExecutorService().submit(new RunnableC1605m(14, this, str));
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.AbstractC20329f4, io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: c */
    public final void mo56088c(String str, String str2) {
        C20513q6 c20513q6 = this.f75784a;
        try {
            c20513q6.getExecutorService().submit(new RunnableC16957l(this, str, str2, 2));
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: e */
    public final void mo56089e(C20481h0 c20481h0) {
        C20513q6 c20513q6 = this.f75784a;
        try {
            c20513q6.getExecutorService().submit(new RunnableC1605m(15, this, c20481h0));
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: h */
    public final void mo56090h(C20315e c20315e) {
        C20513q6 c20513q6 = this.f75784a;
        try {
            c20513q6.getExecutorService().submit(new RunnableC1605m(13, this, c20315e));
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: j */
    public final void mo56091j(C20323e7 c20323e7, C20274c4 c20274c4) {
        C20513q6 c20513q6 = this.f75784a;
        if (c20323e7 == null) {
            return;
        }
        try {
            c20513q6.getExecutorService().submit(new RunnableC1605m(16, this, c20323e7));
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.AbstractC20329f4, io.sentry.InterfaceC20271c1
    /* JADX INFO: renamed from: l */
    public final void mo56092l() {
        C20513q6 c20513q6 = this.f75784a;
        try {
            c20513q6.getExecutorService().submit(new RunnableC20277c7(this, 9));
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Scope sync clearAttachments has an error.", new Object[0]);
        }
    }
}
