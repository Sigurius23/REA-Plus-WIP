package b61;

import b71.C2780a;
import d71.C11755a;
import f71.C14220a;
import g71.C15544b;
import j71.AbstractC21394b;
import l61.C23377b;
import n61.C26406a;
import n61.C26407b;
import o61.C27603b;
import p61.C28938a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q61.C30000d;
import r61.C30983f;
import t81.C33614t;
import v61.C35740e;
import z61.C40124a;

/* JADX INFO: renamed from: b61.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lb61/l;", "", "<init>", "()V", "Lj71/b;", "plotState", "Lb61/a;", "a", "(Lj71/b;)Lb61/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2757l {
    /* JADX INFO: renamed from: a */
    public final InterfaceC2746a<AbstractC21394b> m7810a(AbstractC21394b plotState) {
        AbstractC22676k.m65750j(plotState, "plotState");
        if (plotState instanceof AbstractC21394b.a) {
            return new C23377b();
        }
        if (plotState instanceof AbstractC21394b.b) {
            return new C11755a();
        }
        if (plotState instanceof AbstractC21394b.c) {
            return new C26406a();
        }
        if (plotState instanceof AbstractC21394b.d) {
            return new C26407b();
        }
        if (plotState instanceof AbstractC21394b.g) {
            return new C30983f();
        }
        if (plotState instanceof AbstractC21394b.e) {
            return new C27603b();
        }
        if (plotState instanceof AbstractC21394b.i) {
            return new C35740e();
        }
        if (plotState instanceof AbstractC21394b.k) {
            return new C2780a();
        }
        if (plotState instanceof AbstractC21394b.f) {
            return new C30000d();
        }
        if (plotState instanceof AbstractC21394b.j) {
            return new C40124a();
        }
        if (plotState instanceof AbstractC21394b.n) {
            return new C33614t();
        }
        if (plotState instanceof AbstractC21394b.h) {
            return new C28938a();
        }
        if (plotState instanceof AbstractC21394b.l) {
            return new C14220a();
        }
        if (plotState instanceof AbstractC21394b.m) {
            return new C15544b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
