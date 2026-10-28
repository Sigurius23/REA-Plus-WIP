package p178gz;

import bz.C3702a;
import bz.C3710i;
import bz.EnumC3703b;
import cz.C11220q;
import dz.C12455b;
import dz.C12456c;
import dz.C12458e;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v30.InterfaceC35593b;

/* JADX INFO: renamed from: gz.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C16287e implements InterfaceC35593b {

    /* JADX INFO: renamed from: a */
    public final Function1 f62460a;

    /* JADX INFO: renamed from: b */
    public final C3710i f62461b;

    /* JADX INFO: renamed from: c */
    public final C3702a f62462c;

    public C16287e(Function1 viewActionHandler, C3710i userFacingLogger) {
        AbstractC22676k.m65750j(viewActionHandler, "viewActionHandler");
        AbstractC22676k.m65750j(userFacingLogger, "userFacingLogger");
        this.f62460a = viewActionHandler;
        this.f62461b = userFacingLogger;
        C3702a c3702a = C3702a.f15142b;
        this.f62462c = C3702a.f15142b;
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: a */
    public final void mo46109a() {
        this.f62460a.invoke(new C11220q(new C12458e(this.f62462c.m11527a(EnumC3703b.f15144E), 0)));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: b */
    public final void mo46110b() {
        AbstractC35902e.m113963f0(this.f62462c, EnumC3703b.f15144E);
        this.f62460a.invoke(new C11220q(new C12456c(2)));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: c */
    public final void mo46111c(Throwable th3) {
        this.f62460a.invoke(new C11220q(new C12455b(th3)));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: d */
    public final void mo46112d(Throwable th3) {
        String message;
        this.f62460a.invoke(new C11220q(new C12458e(this.f62462c.m11527a(EnumC3703b.f15144E), th3)));
        if (th3 == null || (message = th3.getMessage()) == null) {
            return;
        }
        this.f62461b.m11528a("Card scan check failed: ".concat(message));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: e */
    public final void mo46113e() {
        this.f62460a.invoke(new C11220q(new C12456c(1)));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: f */
    public final void mo46114f() {
        this.f62460a.invoke(new C11220q(new C12458e(this.f62462c.m11527a(EnumC3703b.f15144E), 2)));
    }
}
