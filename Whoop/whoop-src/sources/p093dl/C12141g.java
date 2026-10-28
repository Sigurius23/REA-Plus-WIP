package p093dl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC4962d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p479s4.AbstractC32121b;
import p586wk.EnumC37323a;
import p618xk.C38418i;
import p618xk.InterfaceC38413d;
import p618xk.InterfaceC38414e;
import p651yk.C39597c;

/* JADX INFO: renamed from: dl.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C12141g implements InterfaceC38414e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40375w;

    /* JADX INFO: renamed from: x */
    public final Comparable f40376x;

    /* JADX INFO: renamed from: y */
    public final Object f40377y;

    /* JADX INFO: renamed from: z */
    public Object f40378z;

    public /* synthetic */ C12141g(int i13, Comparable comparable, Object obj) {
        this.f40375w = i13;
        this.f40376x = comparable;
        this.f40377y = obj;
    }

    /* JADX INFO: renamed from: c */
    private final void m33601c() {
    }

    /* JADX INFO: renamed from: f */
    private final void m33602f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m33603g() {
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: a */
    public final void mo33597a() {
        switch (this.f40375w) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f40378z).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.f40378z;
                if (obj != null) {
                    try {
                        switch (((C12137e) this.f40377y).f40368w) {
                            case 2:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f40378z;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        switch (this.f40375w) {
            case 0:
                ((C12137e) this.f40377y).getClass();
                return InputStream.class;
            case 1:
                switch (((C12137e) this.f40377y).f40368w) {
                    case 2:
                        return ParcelFileDescriptor.class;
                    default:
                        return InputStream.class;
                }
            default:
                return InputStream.class;
        }
    }

    @Override // p618xk.InterfaceC38414e
    public final void cancel() {
        int i13 = this.f40375w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: d */
    public final EnumC37323a mo33599d() {
        switch (this.f40375w) {
            case 0:
                break;
            case 1:
                break;
        }
        return EnumC37323a.f159581w;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: e */
    public final void mo33600e(EnumC4962d enumC4962d, InterfaceC38413d interfaceC38413d) throws Throwable {
        Object objOpen;
        switch (this.f40375w) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamM33592a = C12137e.m33592a((String) this.f40376x);
                    this.f40378z = byteArrayInputStreamM33592a;
                    interfaceC38413d.mo33618f(byteArrayInputStreamM33592a);
                } catch (IllegalArgumentException e5) {
                    interfaceC38413d.mo33617c(e5);
                }
                break;
            case 1:
                try {
                    C12137e c12137e = (C12137e) this.f40377y;
                    File file = (File) this.f40376x;
                    switch (c12137e.f40368w) {
                        case 2:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f40378z = objOpen;
                    interfaceC38413d.mo33618f(objOpen);
                } catch (FileNotFoundException e13) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e13);
                    }
                    interfaceC38413d.mo33617c(e13);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM33604h = m33604h();
                    this.f40378z = inputStreamM33604h;
                    interfaceC38413d.mo33618f(inputStreamM33604h);
                } catch (FileNotFoundException e14) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e14);
                    }
                    interfaceC38413d.mo33617c(e14);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0028: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:10:0x0028 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX INFO: renamed from: h */
    public InputStream m33604h() throws Throwable {
        Cursor cursorMo126478a;
        ?? r10;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iM100005j;
        C39597c c39597c = (C39597c) this.f40377y;
        ContentResolver contentResolver = c39597c.f170343c;
        Uri uri = (Uri) this.f40376x;
        ?? r14 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorMo126478a = c39597c.f170341a.mo126478a(uri);
                if (cursorMo126478a != null) {
                    try {
                        if (cursorMo126478a.moveToFirst()) {
                            string = cursorMo126478a.getString(0);
                            cursorMo126478a.close();
                        }
                    } catch (SecurityException e5) {
                        e = e5;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorMo126478a != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iM100005j = AbstractC32121b.m100005j(c39597c.f170344d, inputStreamOpenInputStream2, c39597c.f170342b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    if (0 != 0) {
                                        try {
                                            r14.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th3;
                                }
                            } catch (IOException | NullPointerException e13) {
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e13);
                                }
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                iM100005j = -1;
                            }
                        } else {
                            iM100005j = -1;
                        }
                        if (iM100005j != -1) {
                            return new C38418i(inputStreamOpenInputStream, iM100005j);
                        }
                        return inputStreamOpenInputStream;
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() || 0 >= file.length()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e14) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e14));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        iM100005j = AbstractC32121b.m100005j(c39597c.f170344d, inputStreamOpenInputStream2, c39597c.f170342b);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        iM100005j = -1;
                    }
                    if (iM100005j != -1) {
                        return new C38418i(inputStreamOpenInputStream, iM100005j);
                    }
                    return inputStreamOpenInputStream;
                }
                if (cursorMo126478a != null) {
                    cursorMo126478a.close();
                }
            } catch (Throwable th4) {
                th = th4;
                r14 = r10;
                if (r14 != 0) {
                    r14.close();
                }
                throw th;
            }
        } catch (SecurityException e15) {
            e = e15;
            cursorMo126478a = null;
        } catch (Throwable th5) {
            th = th5;
            if (r14 != 0) {
                r14.close();
            }
            throw th;
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
            iM100005j = AbstractC32121b.m100005j(c39597c.f170344d, inputStreamOpenInputStream2, c39597c.f170342b);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iM100005j = -1;
        }
        if (iM100005j != -1) {
            return new C38418i(inputStreamOpenInputStream, iM100005j);
        }
        return inputStreamOpenInputStream;
    }
}
