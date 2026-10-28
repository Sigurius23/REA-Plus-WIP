package io.sentry.cache;

import com.google.crypto.tink.internal.C5101l0;
import com.whoop.data.repositories.C6656c;
import hg3.AbstractC17269i;
import io.sentry.C20265b7;
import io.sentry.C20275c5;
import io.sentry.C20337g0;
import io.sentry.C20448o7;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.C20548t4;
import io.sentry.C20619w4;
import io.sentry.EnumC20048a7;
import io.sentry.EnumC20424m5;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20390j1;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.C20158t1;
import io.sentry.clientreport.EnumC20296d;
import io.sentry.hints.C20363j;
import io.sentry.hints.InterfaceC20354a;
import io.sentry.hints.InterfaceC20360g;
import io.sentry.hints.InterfaceC20362i;
import io.sentry.util.C20579a;
import io.sentry.util.C20584f;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p087db.C11858k0;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.sentry.cache.c */
/* JADX INFO: loaded from: classes5.dex */
public class C20280c implements InterfaceC20281d {

    /* JADX INFO: renamed from: I */
    public static final Charset f76153I = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ int f76154J = 0;

    /* JADX INFO: renamed from: E */
    public final CountDownLatch f76155E;

    /* JADX INFO: renamed from: F */
    public final WeakHashMap f76156F;

    /* JADX INFO: renamed from: G */
    public final C20579a f76157G;

    /* JADX INFO: renamed from: H */
    public final C20579a f76158H;

    /* JADX INFO: renamed from: w */
    public final C20513q6 f76159w;

    /* JADX INFO: renamed from: x */
    public final C20584f f76160x = new C20584f(new C6656c(this, 11));

    /* JADX INFO: renamed from: y */
    public final File f76161y;

    /* JADX INFO: renamed from: z */
    public final int f76162z;

    public C20280c(C20513q6 c20513q6, String str, int i13) {
        AbstractC29125c.m88510S(c20513q6, "SentryOptions is required.");
        this.f76159w = c20513q6;
        this.f76161y = new File(str);
        this.f76162z = i13;
        this.f76156F = new WeakHashMap();
        this.f76157G = new C20579a();
        this.f76158H = new C20579a();
        this.f76155E = new CountDownLatch(1);
    }

    @Override // io.sentry.cache.InterfaceC20281d
    /* JADX INFO: renamed from: X0 */
    public final void mo56255X0(C5101l0 c5101l0) {
        AbstractC29125c.m88510S(c5101l0, "Envelope is required.");
        File fileM56257c = m56257c(c5101l0);
        boolean zDelete = fileM56257c.delete();
        C20513q6 c20513q6 = this.f76159w;
        if (zDelete) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Discarding envelope from cache: %s", fileM56257c.getAbsolutePath());
        } else {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Envelope was not cached or could not be deleted: %s", fileM56257c.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: a */
    public final File[] m56256a() {
        File file = this.f76161y;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new C20279b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.f76159w.getLogger().mo16066m(EnumC20436n5.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059 A[EDGE_INSN: B:13:0x0059->B:107:0x021a BREAK  A[LOOP:2: B:40:0x00b5->B:106:0x020b], PHI: r4 r6 r8 r15
      0x0059: PHI (r4v29 java.io.File[]) = 
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v32 java.io.File[])
     binds: [B:10:0x0049, B:12:0x0057, B:25:0x0091, B:32:0x00a5, B:35:0x00aa, B:37:0x00b0, B:297:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r6v22 io.sentry.util.f) = 
      (r6v21 io.sentry.util.f)
      (r6v21 io.sentry.util.f)
      (r6v21 io.sentry.util.f)
      (r6v21 io.sentry.util.f)
      (r6v21 io.sentry.util.f)
      (r6v21 io.sentry.util.f)
      (r6v24 io.sentry.util.f)
     binds: [B:10:0x0049, B:12:0x0057, B:25:0x0091, B:32:0x00a5, B:35:0x00aa, B:37:0x00b0, B:297:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r8v5 io.sentry.q6) = 
      (r8v4 io.sentry.q6)
      (r8v4 io.sentry.q6)
      (r8v4 io.sentry.q6)
      (r8v4 io.sentry.q6)
      (r8v4 io.sentry.q6)
      (r8v4 io.sentry.q6)
      (r8v7 io.sentry.q6)
     binds: [B:10:0x0049, B:12:0x0057, B:25:0x0091, B:32:0x00a5, B:35:0x00aa, B:37:0x00b0, B:297:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r15v20 ??) = (r15v21 ??), (r15v23 ??), (r15v25 ??), (r15v26 ??), (r15v26 ??), (r15v26 ??), (r15v28 ??) binds: [B:10:0x0049, B:12:0x0057, B:25:0x0091, B:32:0x00a5, B:35:0x00aa, B:37:0x00b0, B:297:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:179:0x0398  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e0 A[Catch: all -> 0x03f0, TryCatch #9 {all -> 0x03f0, blocks: (B:184:0x03d2, B:186:0x03e0, B:189:0x03f3), top: B:270:0x03d2, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03f3 A[Catch: all -> 0x03f0, TRY_LEAVE, TryCatch #9 {all -> 0x03f0, blocks: (B:184:0x03d2, B:186:0x03e0, B:189:0x03f3), top: B:270:0x03d2, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0411  */
    /* JADX WARN: Code duplicated, block: B:201:0x0421  */
    /* JADX WARN: Code duplicated, block: B:204:0x0445  */
    /* JADX WARN: Code duplicated, block: B:206:0x0454  */
    /* JADX WARN: Code duplicated, block: B:208:0x0468  */
    /* JADX WARN: Code duplicated, block: B:210:0x047d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0489  */
    /* JADX WARN: Code duplicated, block: B:215:0x0494  */
    /* JADX WARN: Code duplicated, block: B:216:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:218:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:220:0x04da  */
    /* JADX WARN: Code duplicated, block: B:237:0x052d  */
    /* JADX WARN: Code duplicated, block: B:283:0x03bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [io.sentry.a7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30, types: [io.sentry.m5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r5v7, types: [io.sentry.t4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [io.sentry.a7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v28, types: [io.sentry.m5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.cache.InterfaceC20281d
    /* JADX INFO: renamed from: a0 */
    public boolean mo55935a0(C5101l0 c5101l0, C20337g0 c20337g0) {
        ?? r15;
        ?? r16;
        Throwable th3;
        boolean z4;
        Date dateM60660P;
        boolean z13;
        boolean z14;
        File fileM56257c;
        EnumC20436n5 enumC20436n5;
        ?? r10;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Iterable iterable;
        boolean zExists;
        ?? r14;
        File file;
        C20275c5 c20275c5;
        EnumC20424m5 enumC20424m5;
        EnumC20424m5 enumC20424m6;
        BufferedReader bufferedReader;
        C20265b7 c20265b7;
        File[] fileArr;
        C20265b7 c20265b7M56260f;
        Boolean bool;
        String str;
        int i13;
        C20275c5 c20275c5M56244d;
        C20265b7 c20265b7M56260f2;
        boolean zEquals;
        AbstractC29125c.m88510S(c5101l0, "Envelope is required.");
        File[] fileArrM56256a = m56256a();
        int length = fileArrM56256a.length;
        C20584f c20584f = this.f76160x;
        boolean z15 = false;
        C20513q6 c20513q6 = this.f76159w;
        int i14 = this.f76162z;
        if (length >= i14) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i15 = (length - i14) + 1;
            if (fileArrM56256a.length > 1) {
                Arrays.sort(fileArrM56256a, new C11858k0(16));
            }
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArrM56256a, i15, length);
            int i16 = 0;
            while (i16 < i15) {
                File file2 = fileArrM56256a[i16];
                C5101l0 c5101l0M56259e = m56259e(file2);
                if (c5101l0M56259e == null) {
                    fileArr = fileArrM56256a;
                    c20584f = c20584f;
                    c20513q6 = c20513q6;
                    r16 = r16;
                    break;
                }
                r16 = (Iterable) c5101l0M56259e.f21444y;
                if (!r16.iterator().hasNext()) {
                    fileArr = fileArrM56256a;
                    c20584f = c20584f;
                    c20513q6 = c20513q6;
                    r16 = r16;
                    break;
                }
                c20513q6.getClientReportRecorder().mo16071u(EnumC20296d.CACHE_OVERFLOW, c5101l0M56259e);
                Iterator it = r16.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c20265b7M56260f = null;
                        r16 = r16;
                        break;
                    }
                    C20275c5 c20275c6 = (C20275c5) it.next();
                    if (c20275c6 == null) {
                        zEquals = z15;
                    } else {
                        ?? r17 = c20275c6.f76147a.f76265E;
                        r16 = EnumC20424m5.Session;
                        zEquals = r17.equals(r16);
                    }
                    if (zEquals) {
                        c20265b7M56260f = m56260f(c20275c6);
                        r16 = r16;
                        break;
                    }
                }
                if (c20265b7M56260f == null) {
                    fileArr = fileArrM56256a;
                    c20584f = c20584f;
                    c20513q6 = c20513q6;
                    r16 = r16;
                    break;
                }
                String str2 = c20265b7M56260f.f76090E;
                ?? r18 = c20265b7M56260f.f76092G;
                r16 = EnumC20048a7.Ok;
                if (!((r18.equals(r16) && str2 != null) ? true : z15) || (bool = c20265b7M56260f.f76091F) == null || !bool.booleanValue()) {
                    fileArr = fileArrM56256a;
                    c20584f = c20584f;
                    c20513q6 = c20513q6;
                    r16 = r16;
                    break;
                }
                int length2 = fileArr2.length;
                r16 = z15;
                while (true) {
                    if (r16 >= length2) {
                        fileArr = fileArrM56256a;
                        c20584f = c20584f;
                        c20513q6 = c20513q6;
                        r16 = r16;
                        break;
                    }
                    File file3 = fileArr2[r16];
                    fileArr = fileArrM56256a;
                    C5101l0 c5101l0M56259e2 = m56259e(file3);
                    if (c5101l0M56259e2 != null) {
                        Iterable iterable2 = (Iterable) c5101l0M56259e2.f21444y;
                        if (iterable2.iterator().hasNext()) {
                            Iterator it3 = iterable2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    str = str2;
                                    c20584f = c20584f;
                                    c20513q6 = c20513q6;
                                    i13 = length2;
                                    c20275c5M56244d = null;
                                    break;
                                }
                                it3 = it3;
                                C20275c5 c20275c7 = (C20275c5) it3.next();
                                if ((c20275c7 == null ? false : c20275c7.f76147a.f76265E.equals(EnumC20424m5.Session)) && (c20265b7M56260f2 = m56260f(c20275c7)) != null) {
                                    String str3 = c20265b7M56260f2.f76090E;
                                    i13 = length2;
                                    if (c20265b7M56260f2.f76092G.equals(EnumC20048a7.Ok) && str3 != null) {
                                        Boolean bool2 = c20265b7M56260f2.f76091F;
                                        if (bool2 != null && bool2.booleanValue()) {
                                            c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Session %s has 2 times the init flag.", str2);
                                            r16 = r16;
                                            break;
                                        }
                                        if (str2 == null || !str2.equals(str3)) {
                                            length2 = i13;
                                            str2 = str2;
                                        } else {
                                            c20265b7M56260f2.f76091F = Boolean.TRUE;
                                            try {
                                                c20275c5M56244d = C20275c5.m56244d((InterfaceC20390j1) c20584f.m56714a(), c20265b7M56260f2);
                                                try {
                                                    it3.remove();
                                                    str = str2;
                                                    break;
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    str = str2;
                                                    c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, e, "Failed to create new envelope item for the session %s", str);
                                                    c20275c5M56244d = c20275c5M56244d;
                                                    break;
                                                }
                                            } catch (IOException e13) {
                                                e = e13;
                                                c20275c5M56244d = null;
                                            }
                                        }
                                    } else {
                                        length2 = i13;
                                    }
                                }
                            }
                            if (c20275c5M56244d != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it4 = iterable2.iterator();
                                while (it4.hasNext()) {
                                    arrayList.add((C20275c5) it4.next());
                                }
                                arrayList.add(c20275c5M56244d);
                                C5101l0 c5101l1 = new C5101l0((C20619w4) c5101l0M56259e2.f21443x, arrayList);
                                long jLastModified = file3.lastModified();
                                if (!file3.delete()) {
                                    c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "File can't be deleted: %s", file3.getAbsolutePath());
                                }
                                try {
                                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                                    try {
                                        ((InterfaceC20390j1) c20584f.m56714a()).mo56238d(c5101l1, fileOutputStream3);
                                        file3.setLastModified(jLastModified);
                                        fileOutputStream3.close();
                                        r16 = r16;
                                        break;
                                    } catch (Throwable th4) {
                                        try {
                                            fileOutputStream3.close();
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                        }
                                        throw th4;
                                    }
                                } catch (Throwable th6) {
                                    c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to serialize the new envelope to the disk.", th6);
                                    r16 = r16;
                                    break;
                                }
                            }
                        } else {
                            str = str2;
                            c20584f = c20584f;
                            c20513q6 = c20513q6;
                            i13 = length2;
                        }
                    } else {
                        str = str2;
                        c20584f = c20584f;
                        c20513q6 = c20513q6;
                        i13 = length2;
                    }
                    fileArrM56256a = fileArr;
                    c20584f = c20584f;
                    c20513q6 = c20513q6;
                    length2 = i13;
                    str2 = str;
                    r16++;
                }
                if (!file2.delete()) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                }
                i16++;
                fileArrM56256a = fileArr;
                c20584f = c20584f;
                c20513q6 = c20513q6;
                z15 = false;
            }
        }
        C20584f c20584f2 = c20584f;
        C20513q6 c20513q7 = c20513q6;
        File file4 = this.f76161y;
        File file5 = new File(file4.getAbsolutePath(), "session.json");
        File file6 = new File(file4.getAbsolutePath(), "previous_session.json");
        if (AbstractC17269i.m48876W(c20337g0, InterfaceC20362i.class) && !file5.delete()) {
            c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        boolean zIsInstance = InterfaceC20354a.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"));
        Charset charset = f76153I;
        if (zIsInstance || InterfaceC20360g.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
            Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
            File file7 = new File(file4.getAbsolutePath(), "previous_session.json");
            if (file7.exists()) {
                InterfaceC20602v0 logger = c20513q7.getLogger();
                EnumC20436n5 enumC20436n6 = EnumC20436n5.WARNING;
                logger.mo16066m(enumC20436n6, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file7), charset));
                        try {
                            C20265b7 c20265b8 = (C20265b7) ((InterfaceC20390j1) c20584f2.m56714a()).mo56239e(bufferedReader2, C20265b7.class);
                            if (c20265b8 != null) {
                                try {
                                    if (objM56491b instanceof InterfaceC20354a) {
                                        try {
                                            InterfaceC20354a interfaceC20354a = (InterfaceC20354a) objM56491b;
                                            Long lMo56081b = interfaceC20354a.mo56081b();
                                            if (lMo56081b != null) {
                                                dateM60660P = AbstractC21598x.m60660P(lMo56081b.longValue());
                                                Date dateM56221c = c20265b8.m56221c();
                                                if (dateM56221c != null) {
                                                    if (dateM60660P.before(dateM56221c)) {
                                                    }
                                                }
                                                c20513q7.getLogger().mo16066m(enumC20436n6, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                                bufferedReader2.close();
                                                r15 = 1;
                                            } else {
                                                dateM60660P = null;
                                            }
                                            c20265b8.m56222d(EnumC20048a7.Abnormal, null, true, interfaceC20354a.mo56083d());
                                            z13 = true;
                                        } catch (Throwable th7) {
                                            th3 = th7;
                                            r16 = 1;
                                            try {
                                                bufferedReader2.close();
                                                throw th3;
                                            } catch (Throwable th8) {
                                                th3.addSuppressed(th8);
                                                throw th3;
                                            }
                                        }
                                    } else if (objM56491b instanceof InterfaceC20360g) {
                                        Date dateM60660P2 = AbstractC21598x.m60660P(((C20158t1) ((InterfaceC20360g) objM56491b)).f75728z);
                                        Date dateM56221c2 = c20265b8.m56221c();
                                        if (dateM56221c2 == null || dateM60660P2.before(dateM56221c2)) {
                                            z4 = true;
                                            c20513q7.getLogger().mo16066m(enumC20436n6, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                        } else {
                                            z13 = true;
                                            c20265b8.m56222d(EnumC20048a7.Crashed, null, true, null);
                                            dateM60660P = dateM60660P2;
                                        }
                                    } else {
                                        z13 = true;
                                        dateM60660P = null;
                                    }
                                    c20265b8.m56220b(dateM60660P);
                                    m56262j(file7, c20265b8);
                                    z4 = z13;
                                } catch (Throwable th9) {
                                    th = th9;
                                    th3 = th;
                                    r16 = r16;
                                    bufferedReader2.close();
                                    throw th3;
                                }
                            } else {
                                z4 = true;
                            }
                            bufferedReader2.close();
                            r15 = z4;
                        } catch (Throwable th10) {
                            th = th10;
                            r16 = 1;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        r16 = 1;
                        c20513q7.getLogger().mo16060j(EnumC20436n5.ERROR, "Error processing previous session.", th);
                        r15 = r16;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    c20513q7.getLogger().mo16060j(EnumC20436n5.ERROR, "Error processing previous session.", th);
                    r15 = r16;
                    if (C20363j.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
                        m56258d(file5, file6);
                        iterable = (Iterable) c5101l0.f21444y;
                        if (iterable.iterator().hasNext()) {
                            c20275c5 = (C20275c5) iterable.iterator().next();
                            enumC20424m5 = EnumC20424m5.Session;
                            enumC20424m6 = c20275c5.f76147a.f76265E;
                            if (enumC20424m5.equals(enumC20424m6)) {
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c20275c5.m56247f()), charset));
                                    try {
                                        c20265b7 = (C20265b7) ((InterfaceC20390j1) c20584f2.m56714a()).mo56239e(bufferedReader, C20265b7.class);
                                        if (c20265b7 == null) {
                                            c20513q7.getLogger().mo16066m(EnumC20436n5.ERROR, "Item of type %s returned null by the parser.", enumC20424m6);
                                        } else {
                                            m56262j(file5, c20265b7);
                                        }
                                        bufferedReader.close();
                                    } catch (Throwable th13) {
                                        try {
                                            bufferedReader.close();
                                            throw th13;
                                        } catch (Throwable th14) {
                                            th13.addSuppressed(th14);
                                            throw th13;
                                        }
                                    }
                                } catch (Throwable th15) {
                                    c20513q7.getLogger().mo16060j(EnumC20436n5.ERROR, "Item failed to process.", th15);
                                }
                            } else {
                                c20513q7.getLogger().mo16066m(EnumC20436n5.INFO, "Current envelope has a different envelope type %s", enumC20424m6);
                            }
                        } else {
                            c20513q7.getLogger().mo16066m(EnumC20436n5.INFO, "Current envelope %s is empty", file5.getAbsolutePath());
                        }
                        zExists = new File(c20513q7.getCacheDirPath(), ".sentry-native/last_crash").exists();
                        if (zExists) {
                            z14 = false;
                            r14 = zExists;
                        } else {
                            file = new File(c20513q7.getCacheDirPath(), "last_crash");
                            if (file.exists()) {
                                z14 = false;
                                c20513q7.getLogger().mo16066m(EnumC20436n5.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                                if (!file.delete()) {
                                    c20513q7.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                                }
                                r14 = r15;
                            } else {
                                z14 = false;
                                r14 = zExists;
                            }
                        }
                        C20548t4.f77007d.m56674a(r14);
                        this.f76155E.countDown();
                    } else {
                        z14 = false;
                    }
                    fileM56257c = m56257c(c5101l0);
                    if (fileM56257c.exists()) {
                        c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileM56257c.getAbsolutePath());
                        return r15;
                    }
                    InterfaceC20602v0 logger2 = c20513q7.getLogger();
                    enumC20436n5 = EnumC20436n5.DEBUG;
                    logger2.mo16066m(enumC20436n5, "Adding Envelope to offline storage: %s", fileM56257c.getAbsolutePath());
                    if (fileM56257c.exists()) {
                        c20513q7.getLogger().mo16066m(enumC20436n5, "Overwriting envelope to offline storage: %s", fileM56257c.getAbsolutePath());
                        if (!fileM56257c.delete()) {
                            c20513q7.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to delete: %s", fileM56257c.getAbsolutePath());
                        }
                    }
                    try {
                        fileOutputStream2 = new FileOutputStream(fileM56257c);
                        try {
                            ((InterfaceC20390j1) c20584f2.m56714a()).mo56238d(c5101l0, fileOutputStream2);
                            fileOutputStream2.close();
                            r10 = r15;
                            if (C20448o7.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
                                try {
                                    fileOutputStream = new FileOutputStream(new File(c20513q7.getCacheDirPath(), "last_crash"));
                                    try {
                                        fileOutputStream.write(AbstractC21598x.m60667W(AbstractC21598x.m60659O()).getBytes(charset));
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                    } catch (Throwable th16) {
                                        try {
                                            fileOutputStream.close();
                                            throw th16;
                                        } catch (Throwable th17) {
                                            th16.addSuppressed(th17);
                                            throw th16;
                                        }
                                    }
                                } catch (Throwable th18) {
                                    c20513q7.getLogger().mo16060j(EnumC20436n5.ERROR, "Error writing the crash marker file to the disk", th18);
                                }
                            }
                            return r10;
                        } catch (Throwable th19) {
                            try {
                                fileOutputStream2.close();
                                throw th19;
                            } catch (Throwable th20) {
                                th19.addSuppressed(th20);
                                throw th19;
                            }
                        }
                    } catch (Throwable th21) {
                        c20513q7.getLogger().mo16058i(EnumC20436n5.ERROR, th21, "Error writing Envelope %s to offline storage", fileM56257c.getAbsolutePath());
                        r10 = z14;
                    }
                }
            } else {
                r15 = 1;
                c20513q7.getLogger().mo16066m(EnumC20436n5.DEBUG, "No previous session file to end.", new Object[0]);
            }
        } else {
            r15 = 1;
        }
        if (C20363j.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
            m56258d(file5, file6);
            iterable = (Iterable) c5101l0.f21444y;
            if (iterable.iterator().hasNext()) {
                c20275c5 = (C20275c5) iterable.iterator().next();
                enumC20424m5 = EnumC20424m5.Session;
                enumC20424m6 = c20275c5.f76147a.f76265E;
                if (enumC20424m5.equals(enumC20424m6)) {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c20275c5.m56247f()), charset));
                    c20265b7 = (C20265b7) ((InterfaceC20390j1) c20584f2.m56714a()).mo56239e(bufferedReader, C20265b7.class);
                    if (c20265b7 == null) {
                        c20513q7.getLogger().mo16066m(EnumC20436n5.ERROR, "Item of type %s returned null by the parser.", enumC20424m6);
                    } else {
                        m56262j(file5, c20265b7);
                    }
                    bufferedReader.close();
                } else {
                    c20513q7.getLogger().mo16066m(EnumC20436n5.INFO, "Current envelope has a different envelope type %s", enumC20424m6);
                }
            } else {
                c20513q7.getLogger().mo16066m(EnumC20436n5.INFO, "Current envelope %s is empty", file5.getAbsolutePath());
            }
            zExists = new File(c20513q7.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (zExists) {
                file = new File(c20513q7.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    z14 = false;
                    c20513q7.getLogger().mo16066m(EnumC20436n5.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        c20513q7.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    r14 = r15;
                } else {
                    z14 = false;
                    r14 = zExists;
                }
            } else {
                z14 = false;
                r14 = zExists;
            }
            C20548t4.f77007d.m56674a(r14);
            this.f76155E.countDown();
        } else {
            z14 = false;
        }
        fileM56257c = m56257c(c5101l0);
        if (fileM56257c.exists()) {
            c20513q7.getLogger().mo16066m(EnumC20436n5.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileM56257c.getAbsolutePath());
            return r15;
        }
        InterfaceC20602v0 logger3 = c20513q7.getLogger();
        enumC20436n5 = EnumC20436n5.DEBUG;
        logger3.mo16066m(enumC20436n5, "Adding Envelope to offline storage: %s", fileM56257c.getAbsolutePath());
        if (fileM56257c.exists()) {
            c20513q7.getLogger().mo16066m(enumC20436n5, "Overwriting envelope to offline storage: %s", fileM56257c.getAbsolutePath());
            if (!fileM56257c.delete()) {
                c20513q7.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to delete: %s", fileM56257c.getAbsolutePath());
            }
        }
        fileOutputStream2 = new FileOutputStream(fileM56257c);
        ((InterfaceC20390j1) c20584f2.m56714a()).mo56238d(c5101l0, fileOutputStream2);
        fileOutputStream2.close();
        r10 = r15;
        if (C20448o7.class.isInstance(c20337g0.m56491b("sentry:typeCheckHint"))) {
            fileOutputStream = new FileOutputStream(new File(c20513q7.getCacheDirPath(), "last_crash"));
            fileOutputStream.write(AbstractC21598x.m60667W(AbstractC21598x.m60659O()).getBytes(charset));
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        return r10;
    }

    /* JADX INFO: renamed from: c */
    public final File m56257c(C5101l0 c5101l0) {
        String str;
        WeakHashMap weakHashMap = this.f76156F;
        C20535s c20535sM56711a = this.f76157G.m56711a();
        try {
            if (weakHashMap.containsKey(c5101l0)) {
                str = (String) weakHashMap.get(c5101l0);
            } else {
                String strConcat = AbstractC30060g.m92131v().concat(".envelope");
                weakHashMap.put(c5101l0, strConcat);
                str = strConcat;
            }
            File file = new File(this.f76161y.getAbsolutePath(), str);
            c20535sM56711a.close();
            return file;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m56258d(File file, File file2) {
        C20535s c20535sM56711a = this.f76158H.m56711a();
        try {
            if (!file.exists()) {
                c20535sM56711a.close();
                return;
            }
            boolean zExists = file2.exists();
            C20513q6 c20513q6 = this.f76159w;
            if (zExists) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th3) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error moving current session to previous session.", th3);
            }
            c20535sM56711a.close();
        } catch (Throwable th4) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C5101l0 m56259e(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C5101l0 c5101l0Mo56237c = ((InterfaceC20390j1) this.f76160x.m56714a()).mo56237c(bufferedInputStream);
                bufferedInputStream.close();
                return c5101l0Mo56237c;
            } catch (Throwable th3) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e5) {
            this.f76159w.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to deserialize the envelope.", e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final C20265b7 m56260f(C20275c5 c20275c5) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c20275c5.m56247f()), f76153I));
            try {
                C20265b7 c20265b7 = (C20265b7) ((InterfaceC20390j1) this.f76160x.m56714a()).mo56239e(bufferedReader, C20265b7.class);
                bufferedReader.close();
                return c20265b7;
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            this.f76159w.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to deserialize the session.", th5);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m56261g() {
        C20513q6 c20513q6 = this.f76159w;
        try {
            return this.f76155E.await(c20513q6.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C20513q6 c20513q6 = this.f76159w;
        File[] fileArrM56256a = m56256a();
        ArrayList arrayList = new ArrayList(fileArrM56256a.length);
        for (File file : fileArrM56256a) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((InterfaceC20390j1) this.f76160x.m56714a()).mo56237c(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e5) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e5);
            }
        }
        return arrayList.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final void m56262j(File file, C20265b7 c20265b7) {
        String str = c20265b7.f76090E;
        C20513q6 c20513q6 = this.f76159w;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f76153I));
                try {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((InterfaceC20390j1) this.f76160x.m56714a()).mo56235a(bufferedWriter, c20265b7);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Throwable th7) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th7, "Error writing Session to offline storage: %s", str);
        }
    }
}
