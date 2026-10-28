package io.sentry;

import ih0.AbstractC18489d0;

/* JADX INFO: renamed from: io.sentry.i5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20372i5 {

    /* JADX INFO: renamed from: a */
    public boolean f76403a;

    /* JADX INFO: renamed from: b */
    public boolean f76404b;

    /* JADX INFO: renamed from: c */
    public boolean f76405c;

    /* JADX INFO: renamed from: d */
    public boolean f76406d;

    /* JADX INFO: renamed from: e */
    public boolean f76407e;

    /* JADX INFO: renamed from: f */
    public boolean f76408f;

    /* JADX INFO: renamed from: g */
    public boolean f76409g;

    /* JADX INFO: renamed from: h */
    public Runnable f76410h;

    /* JADX INFO: renamed from: a */
    public final boolean m56560a() {
        return this.f76405c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56561b() {
        return this.f76403a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m56562c() {
        return this.f76408f;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m56563d() {
        return this.f76406d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m56564e() {
        return this.f76404b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m56565f() {
        return this.f76407e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m56566g() {
        return this.f76409g;
    }

    /* JADX INFO: renamed from: h */
    public final void m56567h(boolean z4) {
        this.f76405c = z4;
    }

    /* JADX INFO: renamed from: i */
    public final void m56568i(boolean z4) {
        this.f76403a = z4;
    }

    /* JADX INFO: renamed from: j */
    public final void m56569j(boolean z4) {
        this.f76408f = z4;
    }

    /* JADX INFO: renamed from: k */
    public final void m56570k(boolean z4) {
        this.f76406d = z4;
    }

    /* JADX INFO: renamed from: l */
    public final void m56571l(boolean z4) {
        this.f76404b = z4;
    }

    /* JADX INFO: renamed from: m */
    public final void m56572m(boolean z4) {
        this.f76407e = z4;
    }

    /* JADX INFO: renamed from: n */
    public final void m56573n(boolean z4) {
        this.f76409g = z4;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SentryFeedbackOptions{isNameRequired=");
        sb4.append(this.f76403a);
        sb4.append(", showName=");
        sb4.append(this.f76404b);
        sb4.append(", isEmailRequired=");
        sb4.append(this.f76405c);
        sb4.append(", showEmail=");
        sb4.append(this.f76406d);
        sb4.append(", useSentryUser=");
        sb4.append(this.f76407e);
        sb4.append(", showBranding=");
        sb4.append(this.f76408f);
        sb4.append(", useShakeGesture=");
        return AbstractC18489d0.m53372m(sb4, this.f76409g, ", formTitle='Report a Bug', submitButtonLabel='Send Bug Report', cancelButtonLabel='Cancel', nameLabel='Name', namePlaceholder='Your Name', emailLabel='Email', emailPlaceholder='your.email@example.org', isRequiredLabel=' (Required)', messageLabel='Description', messagePlaceholder='What's the bug? What did you expect?'}");
    }
}
