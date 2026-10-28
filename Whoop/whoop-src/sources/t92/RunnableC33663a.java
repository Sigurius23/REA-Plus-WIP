package t92;

/* JADX INFO: renamed from: t92.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC33663a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140480w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC33664b f140481x;

    public /* synthetic */ RunnableC33663a(AbstractC33664b abstractC33664b, int i13) {
        this.f140480w = i13;
        this.f140481x = abstractC33664b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f140480w) {
            case 0:
                AbstractC33664b.m106321B1(this.f140481x);
                break;
            default:
                AbstractC33664b.m106333b2(this.f140481x);
                break;
        }
    }
}
