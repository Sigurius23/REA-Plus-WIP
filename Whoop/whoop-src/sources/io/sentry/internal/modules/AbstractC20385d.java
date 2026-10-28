package io.sentry.internal.modules;

import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.C20579a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: io.sentry.internal.modules.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20385d implements InterfaceC20382a {

    /* JADX INFO: renamed from: d */
    public static final Charset f76434d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final InterfaceC20602v0 f76435a;

    /* JADX INFO: renamed from: b */
    public final C20579a f76436b = new C20579a();

    /* JADX INFO: renamed from: c */
    public volatile Map f76437c = null;

    public AbstractC20385d(InterfaceC20602v0 interfaceC20602v0) {
        this.f76435a = interfaceC20602v0;
    }

    @Override // io.sentry.internal.modules.InterfaceC20382a
    /* JADX INFO: renamed from: a */
    public final Map mo56602a() {
        if (this.f76437c == null) {
            C20535s c20535sM56711a = this.f76436b.m56711a();
            try {
                if (this.f76437c == null) {
                    this.f76437c = mo55973b();
                }
                c20535sM56711a.close();
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        return this.f76437c;
    }

    /* JADX INFO: renamed from: b */
    public abstract Map mo55973b();

    /* JADX INFO: renamed from: c */
    public final TreeMap m56603c(InputStream inputStream) {
        InterfaceC20602v0 interfaceC20602v0 = this.f76435a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f76434d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e5) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error extracting modules.", e5);
            return treeMap;
        } catch (RuntimeException e13) {
            interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, e13, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
