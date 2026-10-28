package p007a6;

import c93.InterfaceC4351m;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0447p0 implements InterfaceC0424g1 {

    /* JADX INFO: renamed from: a */
    public final File f1542a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0465y0 f1543b;

    /* JADX INFO: renamed from: c */
    public final C0415d1 f1544c;

    /* JADX INFO: renamed from: d */
    public final C0438l0 f1545d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f1546e;

    /* JADX INFO: renamed from: f */
    public final C25437c f1547f;

    public C0447p0(File file, InterfaceC0465y0 interfaceC0465y0, C0415d1 coordinator, C0438l0 c0438l0) {
        AbstractC22676k.m65750j(coordinator, "coordinator");
        this.f1542a = file;
        this.f1543b = interfaceC0465y0;
        this.f1544c = coordinator;
        this.f1545d = c0438l0;
        this.f1546e = new AtomicBoolean(false);
        this.f1547f = AbstractC25438d.m74669a();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[Catch: all -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:33:0x0073, B:42:0x0083, B:41:0x0080, B:38:0x007b), top: B:52:0x0022, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a6.r] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // p007a6.InterfaceC0424g1
    /* JADX INFO: renamed from: b */
    public final Object mo1103b(C0450r c0450r, AbstractC32269c abstractC32269c) throws Throwable {
        C0443n0 c0443n0;
        Throwable th3;
        C0435k0 c0435k0;
        ?? r10;
        if (abstractC32269c instanceof C0443n0) {
            c0443n0 = (C0443n0) abstractC32269c;
            int i13 = c0443n0.f1526E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0443n0.f1526E = i13 - Integer.MIN_VALUE;
            } else {
                c0443n0 = new C0443n0(this, abstractC32269c);
            }
        } else {
            c0443n0 = new C0443n0(this, abstractC32269c);
        }
        Object obj = c0443n0.f1529y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0443n0.f1526E;
        C25437c c25437c = this.f1547f;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0450r = c0443n0.f1527w;
                c0435k0 = c0443n0.f1528x;
                try {
                    AbstractC34132o.m107864I(obj);
                    r10 = c0450r;
                    try {
                        c0435k0.close();
                        th = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        c25437c.mo68214i(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th3 = th5;
                    try {
                        c0435k0.close();
                    } catch (Throwable th6) {
                        AbstractC29125c.m88530g(th3, th6);
                    }
                    throw th3;
                }
            }
            AbstractC34132o.m107864I(obj);
            if (this.f1546e.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zTryLock = c25437c.tryLock();
            try {
                C0435k0 c0435k1 = new C0435k0(this.f1542a, this.f1543b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zTryLock);
                    c0443n0.f1528x = c0435k1;
                    c0443n0.f1527w = zTryLock;
                    c0443n0.f1526E = 1;
                    Object objInvoke = c0450r.invoke(c0435k1, boolValueOf, c0443n0);
                    if (objInvoke == enumC31071a) {
                        return enumC31071a;
                    }
                    obj = objInvoke;
                    r10 = zTryLock;
                    c0435k0 = c0435k1;
                    c0435k0.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        c25437c.mo68214i(null);
                    }
                    return obj;
                } catch (Throwable th7) {
                    th3 = th7;
                    c0450r = zTryLock;
                    c0435k0 = c0435k1;
                    c0435k0.close();
                    throw th3;
                }
            } catch (Throwable th8) {
                th = th8;
                c0450r = zTryLock;
                if (c0450r != 0) {
                    c25437c.mo68214i(null);
                }
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[Catch: all -> 0x010e, IOException -> 0x0110, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0110, blocks: (B:42:0x00d0, B:51:0x00ef, B:52:0x010d, B:59:0x011a, B:66:0x0128, B:65:0x0125), top: B:80:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef A[Catch: all -> 0x010e, IOException -> 0x0110, TRY_ENTER, TryCatch #4 {IOException -> 0x0110, blocks: (B:42:0x00d0, B:51:0x00ef, B:52:0x010d, B:59:0x011a, B:66:0x0128, B:65:0x0125), top: B:80:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[Catch: all -> 0x010e, IOException -> 0x0110, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0110, blocks: (B:42:0x00d0, B:51:0x00ef, B:52:0x010d, B:59:0x011a, B:66:0x0128, B:65:0x0125), top: B:80:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00ef, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    @Override // p007a6.InterfaceC0424g1
    /* JADX INFO: renamed from: c */
    public final Object mo1104c(C0426h0 c0426h0, AbstractC32269c abstractC32269c) throws Throwable {
        C0445o0 c0445o0;
        ?? file;
        InterfaceC25435a interfaceC25435a;
        InterfaceC4351m interfaceC4351m;
        C0451r0 c0451r0;
        Throwable th3;
        C0451r0 c0451r1;
        InterfaceC25435a interfaceC25435a2;
        ?? r10;
        if (abstractC32269c instanceof C0445o0) {
            c0445o0 = (C0445o0) abstractC32269c;
            int i13 = c0445o0.f1535F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0445o0.f1535F = i13 - Integer.MIN_VALUE;
            } else {
                c0445o0 = new C0445o0(this, abstractC32269c);
            }
        } else {
            c0445o0 = new C0445o0(this, abstractC32269c);
        }
        ?? r14 = c0445o0.f1539z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0445o0.f1535F;
        boolean z4 = true;
        File file2 = this.f1542a;
        try {
            try {
                try {
                    try {
                        try {
                            if (i14 == 0) {
                                AbstractC34132o.m107864I(r14);
                                if (this.f1546e.get()) {
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                File parentFile = file2.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new IOException("Unable to create parent directories of " + file2);
                                    }
                                }
                                c0445o0.f1536w = c0426h0;
                                interfaceC25435a = this.f1547f;
                                c0445o0.f1537x = interfaceC25435a;
                                c0445o0.f1535F = 1;
                                interfaceC4351m = c0426h0;
                                if (interfaceC25435a.mo68211b(c0445o0) != enumC31071a) {
                                }
                                return enumC31071a;
                            }
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0451r1 = c0445o0.f1538y;
                                File file3 = (File) c0445o0.f1537x;
                                interfaceC25435a2 = (InterfaceC25435a) c0445o0.f1536w;
                                try {
                                    AbstractC34132o.m107864I(r14);
                                    r10 = file3;
                                    try {
                                        c0451r1.close();
                                        th = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r10.exists()) {
                                        try {
                                            Files.move(r10.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                        } catch (IOException unused) {
                                            z4 = false;
                                        }
                                        if (!z4) {
                                            throw new IOException("Unable to rename " + r10 + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    interfaceC25435a2.mo68214i(null);
                                    return C23454a0.f92919a;
                                } catch (Throwable th5) {
                                    th3 = th5;
                                    try {
                                        c0451r1.close();
                                    } catch (Throwable th6) {
                                        AbstractC29125c.m88530g(th3, th6);
                                    }
                                    throw th3;
                                }
                            }
                            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c0445o0.f1537x;
                            InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) c0445o0.f1536w;
                            AbstractC34132o.m107864I(r14);
                            interfaceC25435a = interfaceC25435a3;
                            interfaceC4351m = interfaceC4351m2;
                            c0445o0.f1536w = interfaceC25435a;
                            c0445o0.f1537x = file;
                            c0445o0.f1538y = c0451r0;
                            c0445o0.f1535F = 2;
                            if (interfaceC4351m.invoke(c0451r0, c0445o0) != enumC31071a) {
                                interfaceC25435a2 = interfaceC25435a;
                                r10 = file;
                                c0451r1 = c0451r0;
                                c0451r1.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r10.exists()) {
                                    Files.move(r10.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                    if (!z4) {
                                        throw new IOException("Unable to rename " + r10 + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                interfaceC25435a2.mo68214i(null);
                                return C23454a0.f92919a;
                            }
                            return enumC31071a;
                        } catch (Throwable th7) {
                            th3 = th7;
                            c0451r1 = c0451r0;
                            c0451r1.close();
                            throw th3;
                        }
                        c0451r0 = new C0451r0(file, this.f1543b);
                    } catch (IOException e5) {
                        e = e5;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    file = new File(file2.getAbsolutePath() + ".tmp");
                } catch (Throwable th8) {
                    th = th8;
                    r14.mo68214i(null);
                    throw th;
                }
            } catch (IOException e13) {
                e = e13;
                file = enumC31071a;
            }
        } catch (Throwable th9) {
            th = th9;
            r14 = c0445o0;
            r14.mo68214i(null);
            throw th;
        }
    }

    @Override // p007a6.InterfaceC0404a
    public final void close() throws Exception {
        this.f1546e.set(true);
        this.f1545d.invoke();
    }

    @Override // p007a6.InterfaceC0424g1
    /* JADX INFO: renamed from: e */
    public final C0415d1 mo1105e() {
        return this.f1544c;
    }
}
