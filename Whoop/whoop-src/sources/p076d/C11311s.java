package p076d;

import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import lb3.AbstractC23763c0;
import p184h5.InterfaceC16916u0;

/* JADX INFO: renamed from: d.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C11311s implements InterfaceC16916u0 {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC11307q[] f36243d = new InterfaceC11307q[0];

    /* JADX INFO: renamed from: a */
    public int f36244a;

    /* JADX INFO: renamed from: b */
    public boolean f36245b;

    /* JADX INFO: renamed from: c */
    public Object f36246c;

    public C11311s(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f36246c = i13 == 0 ? f36243d : new InterfaceC11307q[i13];
        this.f36244a = 0;
        this.f36245b = false;
    }

    @Override // p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: a */
    public void mo30518a() {
        this.f36245b = true;
    }

    @Override // p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: b */
    public void mo30519b() {
        super/*android.view.View*/.setVisibility(0);
        this.f36245b = false;
    }

    @Override // p184h5.InterfaceC16916u0
    /* JADX INFO: renamed from: c */
    public void mo30520c() {
        if (this.f36245b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f36246c;
        actionBarContextView.f4259F = null;
        super/*android.view.View*/.setVisibility(this.f36244a);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC11307q m30521d(int i13) {
        if (i13 < this.f36244a) {
            return ((InterfaceC11307q[]) this.f36246c)[i13];
        }
        throw new ArrayIndexOutOfBoundsException(i13 + " >= " + this.f36244a);
    }

    /* JADX INFO: renamed from: e */
    public void m30522e(AbstractC11272b1 abstractC11272b1) {
        if (abstractC11272b1 == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        InterfaceC11307q[] interfaceC11307qArr = (InterfaceC11307q[]) this.f36246c;
        int length = interfaceC11307qArr.length;
        int i13 = this.f36244a + 1;
        if (this.f36245b | (i13 > length)) {
            InterfaceC11307q[] interfaceC11307qArr2 = new InterfaceC11307q[Math.max(interfaceC11307qArr.length, (i13 >> 1) + i13)];
            System.arraycopy((InterfaceC11307q[]) this.f36246c, 0, interfaceC11307qArr2, 0, this.f36244a);
            this.f36246c = interfaceC11307qArr2;
            this.f36245b = false;
        }
        ((InterfaceC11307q[]) this.f36246c)[this.f36244a] = abstractC11272b1;
        this.f36244a = i13;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC11307q[] m30523f() {
        int i13 = this.f36244a;
        if (i13 == 0) {
            return f36243d;
        }
        InterfaceC11307q[] interfaceC11307qArr = (InterfaceC11307q[]) this.f36246c;
        if (interfaceC11307qArr.length == i13) {
            this.f36245b = true;
            return interfaceC11307qArr;
        }
        InterfaceC11307q[] interfaceC11307qArr2 = new InterfaceC11307q[i13];
        System.arraycopy(interfaceC11307qArr, 0, interfaceC11307qArr2, 0, i13);
        return interfaceC11307qArr2;
    }

    /* JADX INFO: renamed from: g */
    public boolean m30524g() {
        return this.f36245b;
    }

    /* JADX INFO: renamed from: h */
    public int m30525h() {
        return this.f36244a;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC23763c0 m30526i() {
        return (AbstractC23763c0) this.f36246c;
    }

    public C11311s(MessageDigest messageDigest, int i13) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f36246c = messageDigest;
        this.f36244a = i13;
    }

    public C11311s(AbstractC23763c0 abstractC23763c0, int i13, boolean z4) {
        this.f36246c = abstractC23763c0;
        this.f36244a = i13;
        this.f36245b = z4;
    }
}
