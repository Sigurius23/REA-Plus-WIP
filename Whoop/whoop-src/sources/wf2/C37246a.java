package wf2;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wf2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lwf2/a;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", "d", "()V", "b", "c", "e", "a", "Lfi0/a;", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37246a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C37246a(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m119384a() {
        this.baseAnalytics.mo41426h("completed_screen", "submit", "consent", "SMS Setup Flow", null);
    }

    /* JADX INFO: renamed from: b */
    public final void m119385b() {
        this.baseAnalytics.mo41426h("input_screen", "submit", "phone_number", "SMS Setup Flow", null);
    }

    /* JADX INFO: renamed from: c */
    public final void m119386c() {
        this.baseAnalytics.mo41426h("enter_code_screen", "submit", "verification_code", "SMS Setup Flow", null);
    }

    /* JADX INFO: renamed from: d */
    public final void m119387d() {
        this.baseAnalytics.mo41426h("intro_screen", "tap", "opt_in", "SMS Setup Flow", null);
    }

    /* JADX INFO: renamed from: e */
    public final void m119388e() {
        this.baseAnalytics.mo41426h("completed_screen", "tap", "text_whoop", "SMS Setup Flow", null);
    }
}
