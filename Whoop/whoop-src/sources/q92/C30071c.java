package q92;

import c83.AbstractC4309a;
import lh3.C24082e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.AbstractC32962f;
import xg3.C38280g;

/* JADX INFO: renamed from: q92.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lq92/c;", "Lc83/a;", "Lst0/f;", "<init>", "()V", "Lxg3/g;", "c", "()Lxg3/g;", "abstractData", "Ll83/a0;", "d", "(Lst0/f;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "onComplete", "Llh3/e;", "x", "Llh3/e;", "pubSub", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30071c extends AbstractC4309a {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C24082e pubSub = C24082e.m71000Y();

    /* JADX INFO: renamed from: c */
    public final C38280g<AbstractC32962f> m92172c() {
        return this.pubSub;
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onNext(AbstractC32962f abstractData) {
        AbstractC22676k.m65750j(abstractData, "abstractData");
        this.pubSub.onNext(abstractData);
    }

    @Override // l73.InterfaceC23413d
    public void onComplete() {
        this.pubSub.onCompleted();
        dispose();
    }

    @Override // l73.InterfaceC23413d
    public void onError(Throwable throwable) {
        AbstractC22676k.m65750j(throwable, "throwable");
        this.pubSub.onError(throwable);
        dispose();
    }
}
