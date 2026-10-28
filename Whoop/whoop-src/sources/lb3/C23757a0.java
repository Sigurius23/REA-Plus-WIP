package lb3;

/* JADX INFO: renamed from: lb3.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C23757a0 extends AbstractC23789n {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f94120y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23757a0(AbstractC23763c0 abstractC23763c0, int i13) {
        super(abstractC23763c0);
        this.f94120y = i13;
    }

    @Override // lb3.AbstractC23787m, lb3.AbstractC23811y
    /* JADX INFO: renamed from: k0 */
    public final boolean mo69814k0() {
        switch (this.f94120y) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: y0 */
    public final AbstractC23787m mo69812y0(AbstractC23763c0 abstractC23763c0) {
        switch (this.f94120y) {
            case 0:
                return new C23757a0(abstractC23763c0, 0);
            default:
                return new C23757a0(abstractC23763c0, 1);
        }
    }
}
