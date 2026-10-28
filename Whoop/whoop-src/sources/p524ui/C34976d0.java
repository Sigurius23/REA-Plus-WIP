package p524ui;

import android.content.Context;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p180h0.C16407j1;
import p390p1.InterfaceC28601c1;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ui.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C34976d0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Context f147973E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC34997y f147974F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f147975G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ String f147976H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC28601c1 f147977I;

    /* JADX INFO: renamed from: w */
    public Throwable f147978w;

    /* JADX INFO: renamed from: x */
    public int f147979x;

    /* JADX INFO: renamed from: y */
    public int f147980y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16407j1 f147981z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34976d0(C16407j1 c16407j1, Context context, InterfaceC34997y interfaceC34997y, String str, String str2, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f147981z = c16407j1;
        this.f147973E = context;
        this.f147974F = interfaceC34997y;
        this.f147975G = str;
        this.f147976H = str2;
        this.f147977I = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C34976d0(this.f147981z, this.f147973E, this.f147974F, this.f147975G, this.f147976H, this.f147977I, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C34976d0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f A[PHI: r0 r6
      0x006f: PHI (r0v22 int) = (r0v24 int), (r0v25 int) binds: [B:22:0x006d, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r6v4 java.lang.Throwable) = (r6v6 java.lang.Throwable), (r6v7 java.lang.Throwable) binds: [B:22:0x006d, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[Catch: all -> 0x0019, TryCatch #2 {all -> 0x0019, blocks: (B:7:0x0012, B:51:0x00d1, B:52:0x00db, B:55:0x00ef, B:24:0x0072, B:26:0x007c, B:29:0x0083, B:34:0x0092, B:41:0x00ab, B:48:0x00c1, B:44:0x00b6, B:47:0x00bd, B:37:0x009c, B:40:0x00a4, B:32:0x008a, B:58:0x00fb, B:62:0x0103, B:53:0x00dc, B:57:0x00f1), top: B:85:0x0012, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[Catch: all -> 0x0019, TryCatch #2 {all -> 0x0019, blocks: (B:7:0x0012, B:51:0x00d1, B:52:0x00db, B:55:0x00ef, B:24:0x0072, B:26:0x007c, B:29:0x0083, B:34:0x0092, B:41:0x00ab, B:48:0x00c1, B:44:0x00b6, B:47:0x00bd, B:37:0x009c, B:40:0x00a4, B:32:0x008a, B:58:0x00fb, B:62:0x0103, B:53:0x00dc, B:57:0x00f1), top: B:85:0x0012, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0137 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:73:0x0139 A[Catch: all -> 0x0145, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:69:0x0129, B:73:0x0139), top: B:83:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r7 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        if (r7 == r1) goto L50;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00ce -> B:51:0x00d1). Please report as a decompilation issue!!! */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p524ui.C34976d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
