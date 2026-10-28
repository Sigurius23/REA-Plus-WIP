package p479s4;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC11266d;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: s4.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C32125f implements InterfaceC32124e {

    /* JADX INFO: renamed from: a */
    public final String f133149a;

    /* JADX INFO: renamed from: b */
    public final HashMap f133150b = new HashMap();

    public C32125f(String str) {
        this.f133149a = str;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m100032b(String str, String str2) {
        String strAccess$000 = FileProvider.access$000(str);
        String strAccess$001 = FileProvider.access$000(str2);
        if (strAccess$000.equals(strAccess$001)) {
            return true;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(strAccess$001);
        sb4.append('/');
        return strAccess$000.startsWith(sb4.toString());
    }

    /* JADX INFO: renamed from: a */
    public final void m100033a(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        try {
            this.f133150b.put(str, file.getCanonicalFile());
        } catch (IOException e5) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public final File m100034c(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f133150b.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException(AbstractC31061c.m95637m(uri, "Unable to find configured root for "));
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (m100032b(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Uri m100035d(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.f133150b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (m100032b(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(AbstractC11266d.m30461o("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(this.f133149a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }
}
