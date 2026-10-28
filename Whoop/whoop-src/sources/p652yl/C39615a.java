package p652yl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import c93.InterfaceC4339a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p412q3.C29875i;
import p474s.C31983m2;
import p602x1.AbstractC37817c;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.C39949b;
import p668z1.C39954d0;
import p668z1.C39956e0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: yl.a */
/* JADX INFO: loaded from: classes.dex */
public final class C39615a {
    /* JADX INFO: renamed from: a */
    public static void m126585a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C29875i m126586b(Context context, String[] strArr, String str) {
        String[] strArrM126592h = m126592h(context);
        int length = strArrM126592h.length;
        int i13 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i13 >= length) {
                return null;
            }
            String str2 = strArrM126592h[i13];
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                if (i14 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i14 = i15;
                }
            }
            if (zipFile != null) {
                int i16 = 0;
                while (true) {
                    int i17 = i16 + 1;
                    if (i16 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb4 = new StringBuilder("lib");
                            char c3 = File.separatorChar;
                            sb4.append(c3);
                            sb4.append(str3);
                            sb4.append(c3);
                            sb4.append(str);
                            String string = sb4.toString();
                            C31983m2.m99477o("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                return new C29875i(zipFile, entry);
                            }
                        }
                        i16 = i17;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC39957f m126587c() {
        return (AbstractC39957f) AbstractC39963l.f172461b.m99482f();
    }

    /* JADX INFO: renamed from: d */
    public static String[] m126588d(Context context, String str) {
        StringBuilder sb4 = new StringBuilder("lib");
        char c3 = File.separatorChar;
        sb4.append(c3);
        sb4.append("([^\\");
        sb4.append(c3);
        sb4.append("]*)");
        sb4.append(c3);
        sb4.append(str);
        Pattern patternCompile = Pattern.compile(sb4.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m126592h(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC39957f m126589e(AbstractC39957f abstractC39957f) {
        if (abstractC39957f instanceof C39954d0) {
            C39954d0 c39954d0 = (C39954d0) abstractC39957f;
            if (c39954d0.f172434t == AbstractC37817c.m121342c()) {
                c39954d0.f172432r = null;
                return abstractC39957f;
            }
        }
        if (abstractC39957f instanceof C39956e0) {
            C39956e0 c39956e0 = (C39956e0) abstractC39957f;
            if (c39956e0.f172441i == AbstractC37817c.m121342c()) {
                c39956e0.f172440h = null;
                return abstractC39957f;
            }
        }
        AbstractC39957f abstractC39957fM128168h = AbstractC39963l.m128168h(abstractC39957f, null, false);
        abstractC39957fM128168h.m128153j();
        return abstractC39957fM128168h;
    }

    /* JADX INFO: renamed from: f */
    public static Object m126590f(InterfaceC4339a interfaceC4339a, Function1 function1) {
        AbstractC39957f c39954d0;
        if (function1 == null) {
            return interfaceC4339a.invoke();
        }
        AbstractC39957f abstractC39957f = (AbstractC39957f) AbstractC39963l.f172461b.m99482f();
        if (abstractC39957f instanceof C39954d0) {
            C39954d0 c39954d1 = (C39954d0) abstractC39957f;
            if (c39954d1.f172434t == AbstractC37817c.m121342c()) {
                Function1 function2 = c39954d1.f172432r;
                Function1 function3 = c39954d1.f172433s;
                try {
                    ((C39954d0) abstractC39957f).f172432r = AbstractC39963l.m128172l(function1, function2, true);
                    ((C39954d0) abstractC39957f).f172433s = function3;
                    return interfaceC4339a.invoke();
                } finally {
                    c39954d1.f172432r = function2;
                    c39954d1.f172433s = function3;
                }
            }
        }
        if (abstractC39957f == null || (abstractC39957f instanceof C39949b)) {
            c39954d0 = new C39954d0(abstractC39957f instanceof C39949b ? (C39949b) abstractC39957f : null, function1, null, true, false);
        } else {
            if (function1 == null) {
                return interfaceC4339a.invoke();
            }
            c39954d0 = abstractC39957f.mo128126u(function1);
        }
        try {
            AbstractC39957f abstractC39957fM128153j = c39954d0.m128153j();
            try {
                Object objInvoke = interfaceC4339a.invoke();
                AbstractC39957f.m128151q(abstractC39957fM128153j);
                c39954d0.mo128122c();
                return objInvoke;
            } catch (Throwable th3) {
                AbstractC39957f.m128151q(abstractC39957fM128153j);
                throw th3;
            }
        } catch (Throwable th4) {
            c39954d0.mo128122c();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m126591g(AbstractC39957f abstractC39957f, AbstractC39957f abstractC39957f2, Function1 function1) {
        if (abstractC39957f != abstractC39957f2) {
            abstractC39957f2.getClass();
            AbstractC39957f.m128151q(abstractC39957f);
            abstractC39957f2.mo128122c();
        } else if (abstractC39957f instanceof C39954d0) {
            ((C39954d0) abstractC39957f).f172432r = function1;
        } else if (abstractC39957f instanceof C39956e0) {
            ((C39956e0) abstractC39957f).f172440h = function1;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC39957f).toString());
        }
    }

    /* JADX INFO: renamed from: h */
    public static String[] m126592h(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
