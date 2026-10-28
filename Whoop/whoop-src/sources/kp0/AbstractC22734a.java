package kp0;

import np0.AbstractC27010c;
import np0.C27009b;
import np0.EnumC27008a;
import org.joda.time.LocalTime;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kp0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m65681d2 = {"Lkp0/a;", "", "<init>", "()V", "", "enabled", "Lnp0/b;", "c", "(Z)Lnp0/b;", "Lkp0/o;", "a", "()Lkp0/o;", "Lorg/joda/time/LocalTime;", "b", "()Lorg/joda/time/LocalTime;", "latestWakeTime", "Lkp0/c;", "Lkp0/f;", "Lkp0/n;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22734a {
    public /* synthetic */ AbstractC22734a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC22748o m65814a() {
        if (this instanceof C22736c) {
            return ((C22736c) this).m65818d();
        }
        if (this instanceof C22739f) {
            return C22745l.f89475z;
        }
        if (this instanceof C22747n) {
            return ((C22747n) this).m65859d();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public abstract LocalTime mo65815b();

    /* JADX INFO: renamed from: c */
    public final C27009b m65816c(boolean enabled) {
        AbstractC22748o abstractC22748oM65859d;
        EnumC27008a enumC27008aM81005a = AbstractC27010c.m81005a(this);
        if (this instanceof C22736c) {
            abstractC22748oM65859d = ((C22736c) this).m65818d();
        } else if (this instanceof C22739f) {
            abstractC22748oM65859d = C22745l.f89475z;
        } else {
            if (!(this instanceof C22747n)) {
                throw new NoWhenBranchMatchedException();
            }
            C22747n c22747n = (C22747n) this;
            abstractC22748oM65859d = ((c22747n.m65859d() instanceof C22750q) || (c22747n.m65859d() instanceof C22751r)) ? C22745l.f89475z : c22747n.m65859d();
        }
        return new C27009b(enumC27008aM81005a, abstractC22748oM65859d, mo65815b(), enabled);
    }

    private AbstractC22734a() {
    }
}
