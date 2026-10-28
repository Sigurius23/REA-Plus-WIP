package p093dl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC4962d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p586wk.EnumC37323a;
import p618xk.InterfaceC38413d;
import p618xk.InterfaceC38414e;

/* JADX INFO: renamed from: dl.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C12150o implements InterfaceC38414e {

    /* JADX INFO: renamed from: z */
    public static final String[] f40399z = {"_data"};

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40400w;

    /* JADX INFO: renamed from: x */
    public final Object f40401x;

    /* JADX INFO: renamed from: y */
    public final Object f40402y;

    public /* synthetic */ C12150o(int i13, Object obj, Object obj2) {
        this.f40400w = i13;
        this.f40401x = obj;
        this.f40402y = obj2;
    }

    /* JADX INFO: renamed from: c */
    private final void m33611c() {
    }

    /* JADX INFO: renamed from: f */
    private final void m33612f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m33613g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m33614h() {
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: a */
    public final void mo33597a() {
        int i13 = this.f40400w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        switch (this.f40400w) {
            case 0:
                return File.class;
            default:
                switch (((C12133c) this.f40402y).f40361a) {
                    case 0:
                        return ByteBuffer.class;
                    default:
                        return InputStream.class;
                }
        }
    }

    @Override // p618xk.InterfaceC38414e
    public final void cancel() {
        int i13 = this.f40400w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: d */
    public final EnumC37323a mo33599d() {
        switch (this.f40400w) {
            case 0:
                break;
        }
        return EnumC37323a.f159581w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: e */
    public final void mo33600e(EnumC4962d enumC4962d, InterfaceC38413d interfaceC38413d) {
        Object objWrap;
        switch (this.f40400w) {
            case 0:
                Cursor cursorQuery = ((Context) this.f40401x).getContentResolver().query((Uri) this.f40402y, f40399z, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        cursorQuery.close();
                        throw th3;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC38413d.mo33618f(new File(string));
                    return;
                }
                interfaceC38413d.mo33617c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f40402y)));
                return;
            default:
                C12133c c12133c = (C12133c) this.f40402y;
                byte[] bArr = (byte[]) this.f40401x;
                switch (c12133c.f40361a) {
                    case 0:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                interfaceC38413d.mo33618f(objWrap);
                return;
        }
    }
}
