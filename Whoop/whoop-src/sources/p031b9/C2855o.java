package p031b9;

import android.util.Base64;
import p047c9.C4319j;
import p465rm.C31535h;
import p516u8.InterfaceC34627x0;
import p658yr.InterfaceC39722i;

/* JADX INFO: renamed from: b9.o */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2855o implements InterfaceC39722i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11326w;

    @Override // p658yr.InterfaceC39722i
    public final Object get() {
        switch (this.f11326w) {
            case 0:
                return new C2844k();
            case 1:
                byte[] bArr = new byte[12];
                C4319j.f17532i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (InterfaceC34627x0) objInvoke;
                } catch (Exception e5) {
                    throw new IllegalStateException(e5);
                }
            case 3:
                return new C31535h();
            default:
                throw new IllegalStateException();
        }
    }
}
