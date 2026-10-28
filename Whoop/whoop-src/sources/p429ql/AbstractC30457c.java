package p429ql;

import android.graphics.drawable.Drawable;
import pl.C29342e;
import pl.InterfaceC29339b;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: ql.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30457c implements InterfaceC30463i {

    /* JADX INFO: renamed from: w */
    private final int f125159w;

    /* JADX INFO: renamed from: x */
    private final int f125160x;

    /* JADX INFO: renamed from: y */
    private InterfaceC29339b f125161y;

    public AbstractC30457c(int i13) {
        if (!AbstractC33913l.m107273h(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f125159w = Integer.MIN_VALUE;
        this.f125160x = Integer.MIN_VALUE;
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: a */
    public final void mo15539a(InterfaceC30462h interfaceC30462h) {
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: c */
    public void mo15540c(Drawable drawable) {
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: d */
    public final InterfaceC29339b mo15541d() {
        return this.f125161y;
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: f */
    public final void mo15542f(InterfaceC29339b interfaceC29339b) {
        this.f125161y = interfaceC29339b;
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: g */
    public void mo15543g(Drawable drawable) {
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: h */
    public final void mo15544h(InterfaceC30462h interfaceC30462h) throws Throwable {
        ((C29342e) interfaceC30462h).m89342l(this.f125159w, this.f125160x);
    }

    @Override // ml.InterfaceC25662d
    public void onDestroy() {
    }

    @Override // ml.InterfaceC25662d
    public void onStart() {
    }

    @Override // ml.InterfaceC25662d
    public void onStop() {
    }
}
