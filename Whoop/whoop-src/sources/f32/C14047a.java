package f32;

import b32.AbstractC2679e;
import b32.C2677c;
import e32.C12616c;
import e32.InterfaceC12615b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f32.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lf32/a;", "", "<init>", "()V", "Lb32/e;", "Le32/b;", "b", "(Lb32/e;)Le32/b;", "Lb32/c;", "domainState", "Le32/c;", "a", "(Lb32/c;)Le32/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14047a {
    /* JADX INFO: renamed from: b */
    private final InterfaceC12615b m39975b(AbstractC2679e abstractC2679e) {
        if (abstractC2679e instanceof AbstractC2679e.d) {
            return InterfaceC12615b.d.f43072a;
        }
        if (abstractC2679e instanceof AbstractC2679e.b) {
            AbstractC2679e.b bVar = (AbstractC2679e.b) abstractC2679e;
            return new InterfaceC12615b.b(bVar.getPaymentMethodInfo(), bVar.getScreenName());
        }
        if (abstractC2679e instanceof AbstractC2679e.a) {
            return InterfaceC12615b.a.f43068a;
        }
        if (abstractC2679e instanceof AbstractC2679e.c) {
            return new InterfaceC12615b.c(((AbstractC2679e.c) abstractC2679e).getError());
        }
        if (abstractC2679e instanceof AbstractC2679e.h) {
            return InterfaceC12615b.h.f43076a;
        }
        if (abstractC2679e instanceof AbstractC2679e.g) {
            return new InterfaceC12615b.g(((AbstractC2679e.g) abstractC2679e).getPaymentMethodId());
        }
        if (abstractC2679e instanceof AbstractC2679e.f) {
            return new InterfaceC12615b.f(((AbstractC2679e.f) abstractC2679e).getError());
        }
        if (abstractC2679e instanceof AbstractC2679e.e) {
            return InterfaceC12615b.e.f43073a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final C12616c m39976a(C2677c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return new C12616c(m39975b(domainState.getPaymentStatus()), domainState.getOverlayState());
    }
}
