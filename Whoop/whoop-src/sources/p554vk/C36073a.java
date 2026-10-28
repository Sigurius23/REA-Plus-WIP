package p554vk;

import android.util.Log;
import com.bumptech.glide.EnumC4962d;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p093dl.C12144i;
import p586wk.EnumC37323a;
import p618xk.InterfaceC38413d;
import p618xk.InterfaceC38414e;
import pf.AbstractC29125c;
import tl.C33904c;
import ud3.AbstractC34799a1;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34819i;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34823k;
import zd3.C40571o;

/* JADX INFO: renamed from: vk.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36073a implements InterfaceC38414e, InterfaceC34823k {

    /* JADX INFO: renamed from: E */
    public InterfaceC38413d f154049E;

    /* JADX INFO: renamed from: F */
    public volatile C40571o f154050F;

    /* JADX INFO: renamed from: w */
    public final InterfaceC34819i f154051w;

    /* JADX INFO: renamed from: x */
    public final C12144i f154052x;

    /* JADX INFO: renamed from: y */
    public C33904c f154053y;

    /* JADX INFO: renamed from: z */
    public AbstractC34799a1 f154054z;

    public C36073a(InterfaceC34819i interfaceC34819i, C12144i c12144i) {
        this.f154051w = interfaceC34819i;
        this.f154052x = c12144i;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: a */
    public final void mo33597a() {
        try {
            C33904c c33904c = this.f154053y;
            if (c33904c != null) {
                c33904c.close();
            }
        } catch (IOException unused) {
        }
        AbstractC34799a1 abstractC34799a1 = this.f154054z;
        if (abstractC34799a1 != null) {
            abstractC34799a1.close();
        }
        this.f154049E = null;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        return InputStream.class;
    }

    @Override // p618xk.InterfaceC38414e
    public final void cancel() {
        C40571o c40571o = this.f154050F;
        if (c40571o != null) {
            c40571o.cancel();
        }
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: d */
    public final EnumC37323a mo33599d() {
        return EnumC37323a.f159582x;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: e */
    public final void mo33600e(EnumC4962d enumC4962d, InterfaceC38413d interfaceC38413d) {
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(this.f154052x.m33607d());
        for (Map.Entry entry : this.f154052x.f40382b.getHeaders().entrySet()) {
            c34830n0.m109900a((String) entry.getKey(), (String) entry.getValue());
        }
        C34832o0 c34832o0 = new C34832o0(c34830n0);
        this.f154049E = interfaceC38413d;
        this.f154050F = ((C34826l0) this.f154051w).m109898b(c34832o0);
        this.f154050F.m131548d(this);
    }

    @Override // ud3.InterfaceC34823k
    public final void onFailure(InterfaceC34821j interfaceC34821j, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f154049E.mo33617c(iOException);
    }

    @Override // ud3.InterfaceC34823k
    public final void onResponse(InterfaceC34821j interfaceC34821j, C34850x0 c34850x0) {
        AbstractC34799a1 abstractC34799a1 = c34850x0.f146778G;
        this.f154054z = abstractC34799a1;
        if (!c34850x0.f146788Q) {
            this.f154049E.mo33617c(new HttpException(c34850x0.f146791y, null));
            return;
        }
        AbstractC29125c.m88539p(abstractC34799a1, "Argument must not be null");
        C33904c c33904c = new C33904c(this.f154054z.m109858b(), abstractC34799a1.mo1941i());
        this.f154053y = c33904c;
        this.f154049E.mo33618f(c33904c);
    }
}
