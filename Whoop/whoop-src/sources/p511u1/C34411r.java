package p511u1;

/* JADX INFO: renamed from: u1.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C34411r extends AbstractC34409p {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f144631z;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f144631z) {
            case 0:
                int i13 = this.f144630y;
                this.f144630y = i13 + 2;
                return this.f144628w[i13];
            default:
                int i14 = this.f144630y;
                this.f144630y = i14 + 2;
                return this.f144628w[i14 + 1];
        }
    }
}
