package np0;

import kp0.AbstractC22734a;
import kp0.C22736c;
import kp0.C22739f;
import kp0.C22747n;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: np0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkp0/a;", "Lnp0/a;", "a", "(Lkp0/a;)Lnp0/a;", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27010c {
    /* JADX INFO: renamed from: a */
    public static final EnumC27008a m81005a(AbstractC22734a abstractC22734a) {
        AbstractC22676k.m65750j(abstractC22734a, "<this>");
        if (abstractC22734a instanceof C22736c) {
            return EnumC27008a.EXACT_TIME;
        }
        if (abstractC22734a instanceof C22739f) {
            return EnumC27008a.IN_THE_GREEN;
        }
        if (abstractC22734a instanceof C22747n) {
            return EnumC27008a.SLEEP_GOAL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
