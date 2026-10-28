package p618xk;

import android.os.ParcelFileDescriptor;
import java.util.HashMap;
import p198hl.C17391a;
import pe3.C29119a;

/* JADX INFO: renamed from: xk.h */
/* JADX INFO: loaded from: classes.dex */
public final class C38417h implements InterfaceC38416g {

    /* JADX INFO: renamed from: x */
    public static final C17391a f164479x = new C17391a(1);

    /* JADX INFO: renamed from: w */
    public final Object f164480w;

    public C38417h() {
        this.f164480w = new HashMap();
    }

    @Override // p618xk.InterfaceC38416g
    /* JADX INFO: renamed from: a */
    public void mo40832a() {
    }

    @Override // p618xk.InterfaceC38416g
    /* JADX INFO: renamed from: e */
    public Object mo40834e() {
        return ((C29119a) this.f164480w).m88489a();
    }

    public C38417h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f164480w = new C29119a(parcelFileDescriptor);
    }
}
