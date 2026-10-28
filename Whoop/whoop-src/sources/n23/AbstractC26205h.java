package n23;

import l83.C23454a0;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: n23.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC26205h {
    /* JADX INFO: renamed from: a */
    public final AbstractC26202e m77815a() {
        if (this instanceof C26204g) {
            return null;
        }
        if (this instanceof C26203f) {
            return ((C26203f) this).f103918a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final Object m77816b() {
        if (this instanceof C26204g) {
            return ((C26204g) this).f103919a;
        }
        if (this instanceof C26203f) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final Object m77817c() {
        if (this instanceof C26204g) {
            return ((C26204g) this).f103919a;
        }
        if (this instanceof C26203f) {
            throw new IllegalStateException("The Success::value cannot be accessed as the Result is a Failure.");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC26205h m77818d() {
        if (this instanceof C26204g) {
            return new C26204g(C23454a0.f92919a);
        }
        if (this instanceof C26203f) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }
}
