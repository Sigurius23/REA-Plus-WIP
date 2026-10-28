package lc3;

import hc3.C17191x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22681m0;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: lc3.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23839i {

    /* JADX INFO: renamed from: a */
    public static final C17191x f94290a = new C17191x("STATE_REG", 0);

    /* JADX INFO: renamed from: b */
    public static final C17191x f94291b = new C17191x("STATE_COMPLETED", 0);

    /* JADX INFO: renamed from: c */
    public static final C17191x f94292c = new C17191x("STATE_CANCELLED", 0);

    /* JADX INFO: renamed from: d */
    public static final C17191x f94293d = new C17191x("NO_RESULT", 0);

    /* JADX INFO: renamed from: e */
    public static final C17191x f94294e = new C17191x("PARAM_CLAUSE_0", 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m70043a(C23836f c23836f, long j7, Function1 function1) {
        C23832b c23832b = new C23832b(j7);
        C23831a c23831a = C23831a.f94268w;
        AbstractC22681m0.m65774e(3, c23831a);
        C23834d c23834d = new C23834d(c23836f, c23832b, c23831a, C23838h.f94289w, f94294e, (AbstractC32275i) function1, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C23836f.f94283F;
        c23836f.m70041f(c23834d, false);
    }
}
