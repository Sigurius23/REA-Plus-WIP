package io.sentry.android.replay;

import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.video.C20245d;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20579a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23470p;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p027b3.C2365d3;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.AbstractC30060g;
import va3.AbstractC35854l;
import x83.AbstractC38093j;
import xb3.C38166a;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io.sentry.android.replay.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C20212k implements Closeable {

    /* JADX INFO: renamed from: E */
    public final C20579a f75923E;

    /* JADX INFO: renamed from: F */
    public final C20579a f75924F;

    /* JADX INFO: renamed from: G */
    public C20245d f75925G;

    /* JADX INFO: renamed from: H */
    public final C23470p f75926H;

    /* JADX INFO: renamed from: I */
    public final ArrayList f75927I;

    /* JADX INFO: renamed from: J */
    public final LinkedHashMap f75928J;

    /* JADX INFO: renamed from: K */
    public final C23470p f75929K;

    /* JADX INFO: renamed from: w */
    public final C20513q6 f75930w;

    /* JADX INFO: renamed from: x */
    public final C20501v f75931x;

    /* JADX INFO: renamed from: y */
    public final AtomicBoolean f75932y;

    /* JADX INFO: renamed from: z */
    public final C20579a f75933z;

    public C20212k(C20513q6 options, C20501v replayId) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(replayId, "replayId");
        this.f75930w = options;
        this.f75931x = replayId;
        this.f75932y = new AtomicBoolean(false);
        this.f75933z = new C20579a();
        this.f75923E = new C20579a();
        this.f75924F = new C20579a();
        this.f75926H = AbstractC30060g.m92088H(new C20210i(this, 1));
        this.f75927I = new ArrayList();
        this.f75928J = new LinkedHashMap();
        this.f75929K = AbstractC30060g.m92088H(new C20210i(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public final void m56135b(File file, long j7, String str) {
        C20213l c20213l = new C20213l(file, j7, str);
        C20535s c20535sM56711a = this.f75924F.m56711a();
        try {
            this.f75927I.add(c20213l);
            AbstractC21598x.m60698r(c20535sM56711a, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20535s c20535sM56711a = this.f75933z.m56711a();
        try {
            C20245d c20245d = this.f75925G;
            if (c20245d != null) {
                c20245d.m56166i();
            }
            this.f75925G = null;
            AbstractC21598x.m60698r(c20535sM56711a, null);
            this.f75932y.set(true);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m56136h(File file) {
        C20513q6 c20513q6 = this.f75930w;
        try {
            if (file.delete()) {
                return;
            }
            c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: i */
    public final File m56137i() {
        return (File) this.f75926H.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m56138k(String str, String str2) {
        File file;
        File file2;
        C23470p c23470p = this.f75929K;
        LinkedHashMap linkedHashMap = this.f75928J;
        C20535s c20535sM56711a = this.f75923E.m56711a();
        try {
            if (this.f75932y.get()) {
                AbstractC21598x.m60698r(c20535sM56711a, null);
                return;
            }
            File file3 = (File) c23470p.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) c23470p.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) c23470p.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), AbstractC39397a.f169546a), DfuBaseService.ERROR_REMOTE_MASK);
                try {
                    Iterator it = new C38166a(new C2365d3(bufferedReader, 2)).iterator();
                    while (it.hasNext()) {
                        List listM125906y0 = AbstractC39414r.m125906y0((String) it.next(), new String[]{"="}, 2);
                        linkedHashMap.put((String) listM125906y0.get(0), (String) listM125906y0.get(1));
                    }
                    bufferedReader.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(bufferedReader, th3);
                        throw th4;
                    }
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) c23470p.getValue();
            if (file4 != null) {
                Set setEntrySet = linkedHashMap.entrySet();
                AbstractC22676k.m65749i(setEntrySet, "<get-entries>(...)");
                String text = AbstractC25265s.m74110N0(setEntrySet, "\n", null, null, C20183c.f75818y, 30);
                Charset charset = AbstractC39397a.f169546a;
                AbstractC22676k.m65750j(text, "text");
                AbstractC22676k.m65750j(charset, "charset");
                FileOutputStream fileOutputStream = new FileOutputStream(file4);
                try {
                    AbstractC38093j.m122043q(fileOutputStream, text, charset);
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC35854l.m113829i(fileOutputStream, th5);
                        throw th6;
                    }
                }
            }
            AbstractC21598x.m60698r(c20535sM56711a, null);
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                AbstractC21598x.m60698r(c20535sM56711a, th7);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m56139m(long j7) {
        C22669g0 c22669g0 = new C22669g0();
        C20535s c20535sM56711a = this.f75924F.m56711a();
        try {
            AbstractC25265s.m74132j1(this.f75927I, new C20211j(this, j7, c22669g0, 0));
            AbstractC21598x.m60698r(c20535sM56711a, null);
            return (String) c22669g0.f89336w;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }
}
