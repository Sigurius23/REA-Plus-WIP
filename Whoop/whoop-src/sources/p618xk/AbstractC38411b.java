package p618xk;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC4962d;
import java.io.FileNotFoundException;
import java.io.IOException;
import p586wk.EnumC37323a;

/* JADX INFO: renamed from: xk.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38411b implements InterfaceC38414e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f164471w;

    /* JADX INFO: renamed from: x */
    public Object f164472x;

    /* JADX INFO: renamed from: y */
    public final Comparable f164473y;

    /* JADX INFO: renamed from: z */
    public final Object f164474z;

    public /* synthetic */ AbstractC38411b(int i13, Comparable comparable, Object obj) {
        this.f164471w = i13;
        this.f164474z = obj;
        this.f164473y = comparable;
    }

    /* JADX INFO: renamed from: c */
    private final void m123041c() {
    }

    /* JADX INFO: renamed from: f */
    private final void m123042f() {
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: a */
    public final void mo33597a() {
        switch (this.f164471w) {
            case 0:
                Object obj = this.f164472x;
                if (obj != null) {
                    try {
                        mo123039g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.f164472x;
                if (obj2 != null) {
                    try {
                        mo123039g(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // p618xk.InterfaceC38414e
    public final void cancel() {
        int i13 = this.f164471w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: d */
    public final EnumC37323a mo33599d() {
        switch (this.f164471w) {
            case 0:
                break;
        }
        return EnumC37323a.f159581w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: e */
    public final void mo33600e(EnumC4962d enumC4962d, InterfaceC38413d interfaceC38413d) {
        switch (this.f164471w) {
            case 0:
                try {
                    Object objMo123043i = mo123043i((AssetManager) this.f164474z, (String) this.f164473y);
                    this.f164472x = objMo123043i;
                    interfaceC38413d.mo33618f(objMo123043i);
                } catch (IOException e5) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e5);
                    }
                    interfaceC38413d.mo33617c(e5);
                    return;
                }
                break;
            default:
                try {
                    Object objMo123040h = mo123040h((ContentResolver) this.f164474z, (Uri) this.f164473y);
                    this.f164472x = objMo123040h;
                    interfaceC38413d.mo33618f(objMo123040h);
                } catch (FileNotFoundException e13) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e13);
                    }
                    interfaceC38413d.mo33617c(e13);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo123039g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract Object mo123040h(ContentResolver contentResolver, Uri uri);

    /* JADX INFO: renamed from: i */
    public abstract Object mo123043i(AssetManager assetManager, String str);
}
