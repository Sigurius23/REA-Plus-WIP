package rr2;

import io.sentry.C20634y3;
import js0.AbstractC21909c;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rr2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lrr2/j;", "Lof3/a;", "<init>", "()V", "Lio/sentry/y3;", "context", "", "a", "(Lio/sentry/y3;)D", "Ll83/a0;", "b", "Lrr2/i;", "x", "Lrr2/i;", "sampleRate", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31773j implements InterfaceC27903a {

    /* JADX INFO: renamed from: w */
    public static final C31773j f131576w = new C31773j();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static InterfaceC31772i sampleRate = C31765b.f131561a;

    /* JADX INFO: renamed from: y */
    public static final int f131578y = 8;

    private C31773j() {
    }

    /* JADX INFO: renamed from: a */
    public final double m98651a(C20634y3 context) {
        AbstractC22676k.m65750j(context, "context");
        return sampleRate.mo98633a(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m98652b() {
        sampleRate = new C31769f((AbstractC21909c) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), null));
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
