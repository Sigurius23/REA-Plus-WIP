package p093dl;

import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p586wk.C37330h;
import p586wk.InterfaceC37325c;
import tl.AbstractC33902a;

/* JADX INFO: renamed from: dl.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12137e implements InterfaceC37325c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40368w;

    public /* synthetic */ C12137e(int i13) {
        this.f40368w = i13;
    }

    /* JADX INFO: renamed from: a */
    public static ByteArrayInputStream m33592a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    @Override // p586wk.InterfaceC37325c
    /* JADX INFO: renamed from: c */
    public boolean mo2345c(Object obj, File file, C37330h c37330h) {
        try {
            AbstractC33902a.m107253c((ByteBuffer) obj, file);
            return true;
        } catch (IOException e5) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e5);
            return false;
        }
    }
}
