package p249jc;

import android.content.Context;
import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import dj.AbstractC12058c;
import e61.C12764g;
import ge3.AbstractC15751g;
import io.sentry.hints.C20363j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import ne3.AbstractC26604b;
import p014aj.C0926a;
import p014aj.C0928c;
import p014aj.C0929d;
import p014aj.EnumC0927b;
import p420qc.C30213w;
import p426qi.AbstractC30391l;
import p426qi.C30374b0;
import p426qi.C30387i;
import p584wi.C37307g;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jc.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC21575f implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82734w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f82735x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f82736y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Serializable f82737z;

    public /* synthetic */ CallableC21575f(Context context, String str, String str2) {
        this.f82736y = context;
        this.f82735x = str;
        this.f82737z = str2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, qi.b0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [qi.b0] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [aj.d] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [qi.b0] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        C30387i c30387i;
        Throwable th3;
        C30374b0 c30374b0;
        C30387i c30387i2;
        Pair pair;
        C30374b0 c30374b0M92869h;
        C0928c c0928c;
        switch (this.f82734w) {
            case 0:
                C21577g c21577g = (C21577g) this.f82736y;
                ArrayList arrayList = (ArrayList) this.f82737z;
                String id4 = this.f82735x;
                WorkDatabase workDatabase = c21577g.f82743e;
                C30213w c30213wMo5522i = workDatabase.mo5522i();
                c30213wMo5522i.getClass();
                AbstractC22676k.m65750j(id4, "id");
                arrayList.addAll((List) AbstractC15751g.m44432L(c30213wMo5522i.f123670a, true, false, new C12764g(id4, 18)));
                return workDatabase.mo5521h().m92434e(id4);
            default:
                Context context = (Context) this.f82736y;
                String str = this.f82735x;
                String str2 = (String) this.f82737z;
                C0929d c0929d = AbstractC37056f.f158547a;
                if (c0929d == null) {
                    synchronized (C0929d.class) {
                        try {
                            c0929d = AbstractC37056f.f158547a;
                            if (c0929d == null) {
                                Context applicationContext = context.getApplicationContext();
                                C0928c c0928c2 = AbstractC37056f.f158548b;
                                if (c0928c2 == null) {
                                    synchronized (C0928c.class) {
                                        try {
                                            c0928c = AbstractC37056f.f158548b;
                                            if (c0928c == null) {
                                                c0928c = new C0928c(new C21590p(applicationContext), 0);
                                                AbstractC37056f.f158548b = c0928c;
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                        break;
                                    }
                                    c0928c2 = c0928c;
                                }
                                new C20363j(3);
                                c0929d = new C0929d();
                                c0929d.f3422w = c0928c2;
                                AbstractC37056f.f158547a = c0929d;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                ?? c30374b1 = c0929d;
                C0926a c0926a = null;
                if (str2 != null) {
                    try {
                        File fileM2299H = ((C0928c) c30374b1.f3422w).m2299H(str);
                        if (fileM2299H == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileM2299H);
                            EnumC0927b enumC0927b = fileM2299H.getAbsolutePath().endsWith(".zip") ? EnumC0927b.ZIP : fileM2299H.getAbsolutePath().endsWith(".gz") ? EnumC0927b.GZIP : EnumC0927b.JSON;
                            fileM2299H.getAbsolutePath();
                            AbstractC12058c.m33238a();
                            pair = new Pair(enumC0927b, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        c30387i = null;
                    } else {
                        EnumC0927b enumC0927b2 = (EnumC0927b) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        int iOrdinal = enumC0927b2.ordinal();
                        if (iOrdinal == 1) {
                            c30374b0M92869h = AbstractC30391l.m92869h(context, new ZipInputStream(inputStream), str2);
                        } else if (iOrdinal != 2) {
                            c30374b0M92869h = AbstractC30391l.m92866e(AbstractC26604b.m79166k(inputStream), str2);
                        } else {
                            try {
                                c30374b0M92869h = AbstractC30391l.m92866e(AbstractC26604b.m79166k(new GZIPInputStream(inputStream)), str2);
                            } catch (IOException e5) {
                                c30374b0M92869h = new C30374b0(e5);
                            }
                        }
                        c30387i = c30374b0M92869h.f124646a;
                        if (c30387i == null) {
                            c30387i = null;
                        }
                    }
                    break;
                } else {
                    c30387i = null;
                }
                if (c30387i == null) {
                    AbstractC12058c.m33238a();
                    AbstractC12058c.m33238a();
                    try {
                        try {
                            try {
                                C0926a c0926aM56532p = C20363j.m56532p(str);
                                try {
                                    if (c0926aM56532p.m2288m()) {
                                        C30374b0 c30374b0M2350j = c30374b1.m2350j(context, str, c0926aM56532p.m2284b(), c0926aM56532p.m2285h(), str2);
                                        C30387i c30387i3 = c30374b0M2350j.f124646a;
                                        AbstractC12058c.m33238a();
                                        c30374b0 = c30374b0M2350j;
                                    } else {
                                        c30374b0 = new C30374b0(new IllegalArgumentException(c0926aM56532p.m2286i()));
                                    }
                                    c0926aM56532p.close();
                                    c30374b1 = c30374b0;
                                } catch (Exception e13) {
                                    e = e13;
                                    c0926a = c0926aM56532p;
                                    c30374b1 = new C30374b0(e);
                                    if (c0926a != null) {
                                        c0926a.close();
                                        c30374b1 = c30374b1;
                                    }
                                    if (str2 != null) {
                                        C37307g.f159520b.f159521a.m3d(str2, c30387i2);
                                    }
                                    return c30374b1;
                                } catch (Throwable th6) {
                                    th3 = th6;
                                    c0926a = c0926aM56532p;
                                    if (c0926a == null) {
                                        throw th3;
                                    }
                                    try {
                                        c0926a.close();
                                        throw th3;
                                    } catch (IOException e14) {
                                        AbstractC12058c.m33240c("LottieFetchResult close failed ", e14);
                                        throw th3;
                                    }
                                }
                            } catch (Exception e15) {
                                e = e15;
                            }
                        } catch (Throwable th7) {
                            th3 = th7;
                        }
                    } catch (IOException e16) {
                        AbstractC12058c.m33240c("LottieFetchResult close failed ", e16);
                    }
                    break;
                } else {
                    c30374b1 = new C30374b0(c30387i);
                }
                if (str2 != null && (c30387i2 = c30374b1.f124646a) != null) {
                    C37307g.f159520b.f159521a.m3d(str2, c30387i2);
                }
                return c30374b1;
        }
    }

    public /* synthetic */ CallableC21575f(C21577g c21577g, ArrayList arrayList, String str) {
        this.f82736y = c21577g;
        this.f82737z = arrayList;
        this.f82735x = str;
    }
}
