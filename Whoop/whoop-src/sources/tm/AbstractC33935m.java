package tm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: tm.m */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33935m implements InterfaceC33930h {

    /* JADX INFO: renamed from: b */
    public C33929g f142219b;

    /* JADX INFO: renamed from: c */
    public C33929g f142220c;

    /* JADX INFO: renamed from: d */
    public C33929g f142221d;

    /* JADX INFO: renamed from: e */
    public C33929g f142222e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f142223f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f142224g;

    /* JADX INFO: renamed from: h */
    public boolean f142225h;

    public AbstractC33935m() {
        ByteBuffer byteBuffer = InterfaceC33930h.f142179a;
        this.f142223f = byteBuffer;
        this.f142224g = byteBuffer;
        C33929g c33929g = C33929g.f142174e;
        this.f142221d = c33929g;
        this.f142222e = c33929g;
        this.f142219b = c33929g;
        this.f142220c = c33929g;
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo107334a() {
        ByteBuffer byteBuffer = this.f142224g;
        this.f142224g = InterfaceC33930h.f142179a;
        return byteBuffer;
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: c */
    public final void mo107345c() {
        this.f142225h = true;
        mo107339h();
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: d */
    public boolean mo107336d() {
        return this.f142225h && this.f142224g == InterfaceC33930h.f142179a;
    }

    @Override // tm.InterfaceC33930h
    /* JADX INFO: renamed from: e */
    public final C33929g mo107346e(C33929g c33929g) {
        this.f142221d = c33929g;
        this.f142222e = mo107337f(c33929g);
        return isActive() ? this.f142222e : C33929g.f142174e;
    }

    /* JADX INFO: renamed from: f */
    public abstract C33929g mo107337f(C33929g c33929g);

    @Override // tm.InterfaceC33930h
    public final void flush() {
        this.f142224g = InterfaceC33930h.f142179a;
        this.f142225h = false;
        this.f142219b = this.f142221d;
        this.f142220c = this.f142222e;
        mo107338g();
    }

    /* JADX INFO: renamed from: g */
    public void mo107338g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo107339h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo107340i() {
    }

    @Override // tm.InterfaceC33930h
    public boolean isActive() {
        return this.f142222e != C33929g.f142174e;
    }

    /* JADX INFO: renamed from: j */
    public final ByteBuffer m107349j(int i13) {
        if (this.f142223f.capacity() < i13) {
            this.f142223f = ByteBuffer.allocateDirect(i13).order(ByteOrder.nativeOrder());
        } else {
            this.f142223f.clear();
        }
        ByteBuffer byteBuffer = this.f142223f;
        this.f142224g = byteBuffer;
        return byteBuffer;
    }

    @Override // tm.InterfaceC33930h
    public final void reset() {
        flush();
        this.f142223f = InterfaceC33930h.f142179a;
        C33929g c33929g = C33929g.f142174e;
        this.f142221d = c33929g;
        this.f142222e = c33929g;
        this.f142219b = c33929g;
        this.f142220c = c33929g;
        mo107340i();
    }
}
