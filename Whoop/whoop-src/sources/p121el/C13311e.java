package p121el;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC4962d;
import java.io.File;
import java.io.FileNotFoundException;
import p093dl.C12154s;
import p093dl.InterfaceC12155t;
import p586wk.C37330h;
import p586wk.EnumC37323a;
import p618xk.InterfaceC38413d;
import p618xk.InterfaceC38414e;

/* JADX INFO: renamed from: el.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C13311e implements InterfaceC38414e {

    /* JADX INFO: renamed from: K */
    public static final String[] f46019K = {"_data"};

    /* JADX INFO: renamed from: E */
    public final int f46020E;

    /* JADX INFO: renamed from: F */
    public final int f46021F;

    /* JADX INFO: renamed from: G */
    public final C37330h f46022G;

    /* JADX INFO: renamed from: H */
    public final Class f46023H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f46024I;

    /* JADX INFO: renamed from: J */
    public volatile InterfaceC38414e f46025J;

    /* JADX INFO: renamed from: w */
    public final Context f46026w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC12155t f46027x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC12155t f46028y;

    /* JADX INFO: renamed from: z */
    public final Uri f46029z;

    public C13311e(Context context, InterfaceC12155t interfaceC12155t, InterfaceC12155t interfaceC12155t2, Uri uri, int i13, int i14, C37330h c37330h, Class cls) {
        this.f46026w = context.getApplicationContext();
        this.f46027x = interfaceC12155t;
        this.f46028y = interfaceC12155t2;
        this.f46029z = uri;
        this.f46020E = i13;
        this.f46021F = i14;
        this.f46022G = c37330h;
        this.f46023H = cls;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: a */
    public final void mo33597a() {
        InterfaceC38414e interfaceC38414e = this.f46025J;
        if (interfaceC38414e != null) {
            interfaceC38414e.mo33597a();
        }
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        return this.f46023H;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC38414e m37406c() throws Throwable {
        C12154s c12154sMo33591b;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        C37330h c37330h = this.f46022G;
        int i13 = this.f46021F;
        int i14 = this.f46020E;
        Context context = this.f46026w;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f46029z;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f46019K, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c12154sMo33591b = this.f46027x.mo33591b(file, i14, i13, c37330h);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            Uri requireOriginal = this.f46029z;
            if (iCheckSelfPermission == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            c12154sMo33591b = this.f46028y.mo33591b(requireOriginal, i14, i13, c37330h);
        }
        if (c12154sMo33591b != null) {
            return c12154sMo33591b.f40409c;
        }
        return null;
    }

    @Override // p618xk.InterfaceC38414e
    public final void cancel() {
        this.f46024I = true;
        InterfaceC38414e interfaceC38414e = this.f46025J;
        if (interfaceC38414e != null) {
            interfaceC38414e.cancel();
        }
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: d */
    public final EnumC37323a mo33599d() {
        return EnumC37323a.f159581w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: e */
    public final void mo33600e(EnumC4962d enumC4962d, InterfaceC38413d interfaceC38413d) throws Throwable {
        try {
            InterfaceC38414e interfaceC38414eM37406c = m37406c();
            if (interfaceC38414eM37406c == null) {
                interfaceC38413d.mo33617c(new IllegalArgumentException("Failed to build fetcher for: " + this.f46029z));
            } else {
                this.f46025J = interfaceC38414eM37406c;
                if (this.f46024I) {
                    cancel();
                } else {
                    interfaceC38414eM37406c.mo33600e(enumC4962d, interfaceC38413d);
                }
            }
        } catch (FileNotFoundException e5) {
            interfaceC38413d.mo33617c(e5);
        }
    }
}
