package p093dl;

import android.util.Log;
import com.bumptech.glide.EnumC4962d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p586wk.EnumC37323a;
import p618xk.InterfaceC38413d;
import p618xk.InterfaceC38414e;
import tl.AbstractC33902a;

/* JADX INFO: renamed from: dl.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C12139f implements InterfaceC38414e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40371w;

    /* JADX INFO: renamed from: x */
    public final Object f40372x;

    public /* synthetic */ C12139f(Object obj, int i13) {
        this.f40371w = i13;
        this.f40372x = obj;
    }

    /* JADX INFO: renamed from: c */
    private final void m33593c() {
    }

    /* JADX INFO: renamed from: f */
    private final void m33594f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m33595g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m33596h() {
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: a */
    public final void mo33597a() {
        int i13 = this.f40371w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        switch (this.f40371w) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f40372x.getClass();
        }
    }

    @Override // p618xk.InterfaceC38414e
    public final void cancel() {
        int i13 = this.f40371w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: d */
    public final EnumC37323a mo33599d() {
        switch (this.f40371w) {
            case 0:
                break;
        }
        return EnumC37323a.f159581w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: e */
    public final void mo33600e(EnumC4962d enumC4962d, InterfaceC38413d interfaceC38413d) {
        switch (this.f40371w) {
            case 0:
                try {
                    interfaceC38413d.mo33618f(AbstractC33902a.m107251a((File) this.f40372x));
                } catch (IOException e5) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e5);
                    }
                    interfaceC38413d.mo33617c(e5);
                    return;
                }
                break;
            default:
                interfaceC38413d.mo33618f(this.f40372x);
                break;
        }
    }
}
