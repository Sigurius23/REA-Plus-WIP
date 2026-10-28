package p547v8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: v8.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35789f implements InterfaceC35788e {

    /* JADX INFO: renamed from: b */
    public C35787d f152199b;

    /* JADX INFO: renamed from: c */
    public C35787d f152200c;

    /* JADX INFO: renamed from: d */
    public C35787d f152201d;

    /* JADX INFO: renamed from: e */
    public C35787d f152202e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f152203f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f152204g;

    /* JADX INFO: renamed from: h */
    public boolean f152205h;

    public AbstractC35789f() {
        ByteBuffer byteBuffer = InterfaceC35788e.f152198a;
        this.f152203f = byteBuffer;
        this.f152204g = byteBuffer;
        C35787d c35787d = C35787d.f152193e;
        this.f152201d = c35787d;
        this.f152202e = c35787d;
        this.f152199b = c35787d;
        this.f152200c = c35787d;
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo31606a() {
        ByteBuffer byteBuffer = this.f152204g;
        this.f152204g = InterfaceC35788e.f152198a;
        return byteBuffer;
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: c */
    public final void mo113437c() {
        this.f152205h = true;
        mo31599h();
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: d */
    public boolean mo31607d() {
        return this.f152205h && this.f152204g == InterfaceC35788e.f152198a;
    }

    @Override // p547v8.InterfaceC35788e
    /* JADX INFO: renamed from: e */
    public final C35787d mo113438e(C35787d c35787d) {
        this.f152201d = c35787d;
        this.f152202e = mo31597f(c35787d);
        return isActive() ? this.f152202e : C35787d.f152193e;
    }

    /* JADX INFO: renamed from: f */
    public abstract C35787d mo31597f(C35787d c35787d);

    @Override // p547v8.InterfaceC35788e
    public final void flush() {
        this.f152204g = InterfaceC35788e.f152198a;
        this.f152205h = false;
        this.f152199b = this.f152201d;
        this.f152200c = this.f152202e;
        mo31598g();
    }

    /* JADX INFO: renamed from: g */
    public void mo31598g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo31599h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo31600i() {
    }

    @Override // p547v8.InterfaceC35788e
    public boolean isActive() {
        return this.f152202e != C35787d.f152193e;
    }

    /* JADX INFO: renamed from: j */
    public final ByteBuffer m113439j(int i13) {
        if (this.f152203f.capacity() < i13) {
            this.f152203f = ByteBuffer.allocateDirect(i13).order(ByteOrder.nativeOrder());
        } else {
            this.f152203f.clear();
        }
        ByteBuffer byteBuffer = this.f152203f;
        this.f152204g = byteBuffer;
        return byteBuffer;
    }

    @Override // p547v8.InterfaceC35788e
    public final void reset() {
        flush();
        this.f152203f = InterfaceC35788e.f152198a;
        C35787d c35787d = C35787d.f152193e;
        this.f152201d = c35787d;
        this.f152202e = c35787d;
        this.f152199b = c35787d;
        this.f152200c = c35787d;
        mo31600i();
    }
}
