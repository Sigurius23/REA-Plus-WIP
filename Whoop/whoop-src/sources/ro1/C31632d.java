package ro1;

import p715kotlin.jvm.functions.Function1;
import so1.AbstractC32803a0;
import so1.C32805b0;

/* JADX INFO: renamed from: ro1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C31632d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130693w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32805b0 f130694x;

    public /* synthetic */ C31632d(C32805b0 c32805b0, int i13) {
        this.f130693w = i13;
        this.f130694x = c32805b0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130693w) {
            case 0:
                return AbstractC31634f.m97753p(this.f130694x, (AbstractC32803a0) obj);
            default:
                return AbstractC31634f.m97758u(this.f130694x, (AbstractC32803a0) obj);
        }
    }
}
