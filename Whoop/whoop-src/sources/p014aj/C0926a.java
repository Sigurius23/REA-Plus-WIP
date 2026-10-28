package p014aj;

import dj.AbstractC12058c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import lu.AbstractC24744f;
import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: renamed from: aj.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C0926a implements Closeable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3413w;

    /* JADX INFO: renamed from: x */
    public final Object f3414x;

    public /* synthetic */ C0926a(Object obj, int i13) {
        this.f3413w = i13;
        this.f3414x = obj;
    }

    /* JADX INFO: renamed from: b */
    public InputStream m2284b() {
        return ((HttpURLConnection) this.f3414x).getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3413w) {
            case 0:
                ((HttpURLConnection) this.f3414x).disconnect();
                break;
            default:
                for (InputStream inputStream : (InputStream[]) this.f3414x) {
                    AbstractC24744f.m72450a(inputStream);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public String m2285h() {
        return ((HttpURLConnection) this.f3414x).getContentType();
    }

    /* JADX INFO: renamed from: i */
    public String m2286i() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f3414x;
        try {
            if (m2288m()) {
                return null;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unable to fetch ");
            sb4.append(httpURLConnection.getURL());
            sb4.append(". Failed with ");
            sb4.append(httpURLConnection.getResponseCode());
            sb4.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb5 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb5.append(line);
                        sb5.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                    throw th3;
                }
            }
            bufferedReader.close();
            sb4.append(sb5.toString());
            return sb4.toString();
        } catch (IOException e5) {
            AbstractC12058c.m33240c("get error failed ", e5);
            return e5.getMessage();
        }
    }

    /* JADX INFO: renamed from: k */
    public String m2287k() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(((InputStream[]) this.f3414x)[1], AbstractC24744f.f96764b);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
            while (true) {
                int i13 = inputStreamReader.read(cArr);
                if (i13 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i13);
            }
        } finally {
            inputStreamReader.close();
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m2288m() {
        try {
            return ((HttpURLConnection) this.f3414x).getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
