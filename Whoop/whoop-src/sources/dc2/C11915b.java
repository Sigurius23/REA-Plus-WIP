package dc2;

import bc2.InterfaceC2984c;
import cc2.C4412a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dc2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ldc2/b;", "", "<init>", "()V", "Lbc2/c;", "result", "Lcc2/a;", "a", "(Lbc2/c;)Lcc2/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11915b {
    /* JADX INFO: renamed from: a */
    public final C4412a m32186a(InterfaceC2984c result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.equals(InterfaceC2984c.a.f11987a)) {
            return new C4412a(false);
        }
        if (result.equals(InterfaceC2984c.b.f11988a)) {
            return new C4412a(true);
        }
        throw new NoWhenBranchMatchedException();
    }
}
