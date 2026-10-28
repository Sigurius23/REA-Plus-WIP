package t81;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: t81.p */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33610p implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140274w;

    public /* synthetic */ C33610p(int i13) {
        this.f140274w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f140274w) {
            case 0:
                return Long.valueOf(AbstractC33606l.d.m106186i(((Long) obj).longValue()));
            case 1:
                return AbstractC33606l.m106167r(obj);
            case 2:
                return AbstractC33606l.m106137P(((Float) obj).floatValue());
            default:
                return AbstractC33606l.m106138Q(((Float) obj).floatValue());
        }
    }
}
