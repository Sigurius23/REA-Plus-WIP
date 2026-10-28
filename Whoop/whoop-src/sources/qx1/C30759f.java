package qx1;

import android.annotation.SuppressLint;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import tv1.AbstractC34207c;

/* JADX INFO: renamed from: qx1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lqx1/f;", "", "<init>", "()V", "Ltv1/c;", "result", "Lqx1/e;", "a", "(Ltv1/c;)Lqx1/e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30759f {
    @SuppressLint({"EnumValueOfIssue"})
    /* JADX INFO: renamed from: a */
    public final InterfaceC30758e m94497a(AbstractC34207c result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof AbstractC34207c.b) {
            return AbstractC30760g.m94499b((AbstractC34207c.b) result);
        }
        if (result.equals(AbstractC34207c.c.f143495a)) {
            return InterfaceC30758e.b.f126629a;
        }
        if (result.equals(AbstractC34207c.a.f143493a)) {
            return InterfaceC30758e.a.f126628a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
