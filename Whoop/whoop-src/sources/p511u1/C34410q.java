package p511u1;

/* JADX INFO: renamed from: u1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C34410q extends AbstractC34409p {
    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f144630y;
        this.f144630y = i13 + 2;
        Object[] objArr = this.f144628w;
        return new C34394a(objArr[i13], objArr[i13 + 1]);
    }
}
