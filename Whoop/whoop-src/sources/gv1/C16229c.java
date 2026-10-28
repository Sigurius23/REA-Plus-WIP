package gv1;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: gv1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lgv1/c;", "", "<init>", "()V", "", "enabled", "Ll83/a0;", "b", "(Z)V", "Lec3/p1;", "a", "Lec3/p1;", "_isOverrideEnabled", "Lec3/f2;", "Lec3/f2;", "()Lec3/f2;", "isOverrideEnabled", "lottie-tester_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16229c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13075p1 _isOverrideEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13037f2 isOverrideEnabled;

    public C16229c() {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this._isOverrideEnabled = c13045h2M36593c;
        this.isOverrideEnabled = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC13037f2 getIsOverrideEnabled() {
        return this.isOverrideEnabled;
    }

    /* JADX INFO: renamed from: b */
    public final void m45938b(boolean enabled) {
        InterfaceC13075p1 interfaceC13075p1 = this._isOverrideEnabled;
        Boolean boolValueOf = Boolean.valueOf(enabled);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, boolValueOf);
    }
}
