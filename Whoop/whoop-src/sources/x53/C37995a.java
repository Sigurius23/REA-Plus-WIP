package x53;

import bc3.C3004e2;
import g63.C15539c;
import ge3.AbstractC15751g;
import i63.C18163d;
import i63.InterfaceC18174m;
import io.ktor.utils.p228io.C20023p;
import io.ktor.utils.p228io.InterfaceC20024q;
import j63.AbstractC21385b;
import j63.AbstractC21386c;
import j63.AbstractC21387d;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: x53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C37995a extends AbstractC21386c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30063j f162759a;

    /* JADX INFO: renamed from: b */
    public final Function3 f162760b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20024q f162761c;

    /* JADX INFO: renamed from: d */
    public final AbstractC21387d f162762d;

    public C37995a(AbstractC21387d delegate, C3004e2 callContext, Function3 function3) {
        InterfaceC20024q interfaceC20024qMo1204d;
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(callContext, "callContext");
        this.f162759a = callContext;
        this.f162760b = function3;
        if (delegate instanceof AbstractC21385b) {
            interfaceC20024qMo1204d = AbstractC15751g.m44447a(((AbstractC21385b) delegate).mo1203d());
        } else if (delegate instanceof C15539c) {
            InterfaceC20024q.f75124a.getClass();
            interfaceC20024qMo1204d = C20023p.m55862a();
        } else {
            if (!(delegate instanceof AbstractC21386c)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC20024qMo1204d = ((AbstractC21386c) delegate).mo1204d();
        }
        this.f162761c = interfaceC20024qMo1204d;
        this.f162762d = delegate;
    }

    @Override // j63.AbstractC21387d
    /* JADX INFO: renamed from: a */
    public final Long mo1201a() {
        return this.f162762d.mo1201a();
    }

    @Override // j63.AbstractC21387d
    /* JADX INFO: renamed from: b */
    public final C18163d mo1202b() {
        return this.f162762d.mo1202b();
    }

    @Override // j63.AbstractC21387d
    /* JADX INFO: renamed from: c */
    public final InterfaceC18174m mo60029c() {
        return this.f162762d.mo60029c();
    }

    @Override // j63.AbstractC21386c
    /* JADX INFO: renamed from: d */
    public final InterfaceC20024q mo1204d() {
        return AbstractC34924m.m110127I(this.f162761c, this.f162759a, this.f162762d.mo1201a(), this.f162760b);
    }
}
