package eg;

import ae3.C0803k;
import aws.smithy.kotlin.runtime.ServiceException;
import aws.smithy.kotlin.runtime.retries.TooManyAttemptsException;
import aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException;
import gf.C15760a;
import gf.C15762c;
import gg.AbstractC15818e;
import gg.InterfaceC15820g;
import ih0.AbstractC18489d0;
import java.util.Collection;
import java.util.List;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p148fg.C14447q;
import p148fg.C14451u;
import p148fg.InterfaceC14444n;
import p437qt.C30582e;
import p477s2.AbstractC32069a;
import p501te.C33736a;
import p501te.C33738c;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29205p;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import t23.C33463u3;

/* JADX INFO: renamed from: eg.o */
/* JADX INFO: loaded from: classes.dex */
public class C13166o {

    /* JADX INFO: renamed from: b */
    public static final C30582e f45617b = new C30582e(17);

    /* JADX INFO: renamed from: a */
    public final C0803k f45618a;

    public C13166o(C0803k c0803k) {
        this.f45618a = c0803k;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public static Object m36846g(C13166o c13166o, C29205p c29205p, C33463u3 c33463u3, AbstractC32269c abstractC32269c) throws Throwable {
        C13164m c13164m;
        C13166o c13166o2;
        InterfaceC15820g interfaceC15820g;
        Function1 function1;
        Object objM36847d;
        if (abstractC32269c instanceof C13164m) {
            c13164m = (C13164m) abstractC32269c;
            int i13 = c13164m.f45607J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13164m.f45607J = i13 - Integer.MIN_VALUE;
            } else {
                c13164m = new C13164m(c13166o, abstractC32269c);
            }
        } else {
            c13164m = new C13164m(c13166o, abstractC32269c);
        }
        C13164m c13164m2 = c13164m;
        Object objM41171b = c13164m2.f45605H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13164m2.f45607J;
        int i15 = 1;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM41171b);
                c13164m2.f45608w = c13166o;
                c13164m2.f45609x = c29205p;
                c13164m2.f45610y = c33463u3;
                c13164m2.f45607J = 1;
                if (c13166o.mo36842b(c13164m2) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                c33463u3 = c13164m2.f45610y;
                c29205p = c13164m2.f45609x;
                c13166o = c13164m2.f45608w;
                AbstractC34132o.m107864I(objM41171b);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objM41171b);
                    return objM41171b;
                }
                i15 = c13164m2.f45604G;
                InterfaceC15820g interfaceC15820g2 = c13164m2.f45603F;
                function1 = c13164m2.f45602E;
                C13166o c13166o3 = c13164m2.f45611z;
                AbstractC34132o.m107864I(objM41171b);
                interfaceC15820g = interfaceC15820g2;
                c13166o2 = c13166o3;
            }
            c13164m2.f45608w = null;
            c13164m2.f45609x = null;
            c13164m2.f45610y = null;
            c13164m2.f45611z = null;
            c13164m2.f45602E = null;
            c13164m2.f45603F = null;
            c13164m2.f45607J = 3;
            objM36847d = c13166o2.m36847d(function1, interfaceC15820g, i15, (C14447q) objM41171b, c13164m2);
            if (objM36847d != enumC31071a) {
                return enumC31071a;
            }
            return objM36847d;
            InterfaceC14444n interfaceC14444n = (InterfaceC14444n) c13166o.mo36844e().f2966d;
            c13164m2.f45608w = null;
            c13164m2.f45609x = null;
            c13164m2.f45610y = null;
            c13164m2.f45611z = c13166o;
            c13164m2.f45602E = c33463u3;
            c13164m2.f45603F = c29205p;
            c13164m2.f45604G = 1;
            c13164m2.f45607J = 2;
            objM41171b = ((C14451u) interfaceC14444n).m41171b(c13164m2);
            if (objM41171b != enumC31071a) {
                c13166o2 = c13166o;
                interfaceC15820g = c29205p;
                function1 = c33463u3;
                c13164m2.f45608w = null;
                c13164m2.f45609x = null;
                c13164m2.f45610y = null;
                c13164m2.f45611z = null;
                c13164m2.f45602E = null;
                c13164m2.f45603F = null;
                c13164m2.f45607J = 3;
                objM36847d = c13166o2.m36847d(function1, interfaceC15820g, i15, (C14447q) objM41171b, c13164m2);
                if (objM36847d != enumC31071a) {
                    return objM36847d;
                }
            }
            return enumC31071a;
        } catch (RetryCapacityExceededException e5) {
            c13166o.m36849i(e5, 1, null);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Object mo36841a(int i13, AbstractC15818e abstractC15818e, InterfaceC30057d interfaceC30057d) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public Object mo36842b(InterfaceC30057d interfaceC30057d) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public Object mo36843c(int i13, InterfaceC30057d interfaceC30057d) {
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131 A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, PHI: r2 r5 r6 r11 r12 r13 r14
      0x0131: PHI (r2v9 ??) = (r2v23 ??), (r2v24 ??) binds: [B:30:0x00a6, B:54:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r5v6 gg.g) = (r5v0 gg.g), (r5v7 gg.g) binds: [B:30:0x00a6, B:54:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r6v5 ??) = (r6v8 ??), (r6v9 ??) binds: [B:30:0x00a6, B:54:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r11v11 ??) = (r11v27 ??), (r11v28 ??) binds: [B:30:0x00a6, B:54:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r12v25 gg.e) = (r12v11 gg.e), (r12v39 gg.e) binds: [B:30:0x00a6, B:54:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r13v12 java.lang.Object) = (r13v3 java.lang.Object), (r13v14 java.lang.Object) binds: [B:30:0x00a6, B:54:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r14v12 kotlin.jvm.internal.g0) = (r14v5 kotlin.jvm.internal.g0), (r14v14 kotlin.jvm.internal.g0) binds: [B:30:0x00a6, B:54:0x012d] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0153 A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0157 A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x015b A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0167 A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, PHI: r2 r5 r6 r11 r12 r13 r14
      0x018c: PHI (r2v8 ??) = (r2v25 ??), (r2v26 ??) binds: [B:24:0x0081, B:69:0x0188] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r5v4 gg.g) = (r5v1 gg.g), (r5v6 gg.g) binds: [B:24:0x0081, B:69:0x0188] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r6v4 ??) = (r6v10 ??), (r6v11 ??) binds: [B:24:0x0081, B:69:0x0188] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r11v10 ??) = (r11v29 ??), (r11v30 ??) binds: [B:24:0x0081, B:69:0x0188] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r12v22 gg.e) = (r12v15 gg.e), (r12v25 gg.e) binds: [B:24:0x0081, B:69:0x0188] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r13v11 java.lang.Object) = (r13v5 java.lang.Object), (r13v12 java.lang.Object) binds: [B:24:0x0081, B:69:0x0188] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r14v11 kotlin.jvm.internal.g0) = (r14v7 kotlin.jvm.internal.g0), (r14v12 kotlin.jvm.internal.g0) binds: [B:24:0x0081, B:69:0x0188] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7 A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01fa A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0200  */
    /* JADX WARN: Code duplicated, block: B:89:0x0202  */
    /* JADX WARN: Code duplicated, block: B:92:0x0207 A[Catch: all -> 0x0053, RetryCapacityExceededException -> 0x0059, TRY_LEAVE, TryCatch #4 {RetryCapacityExceededException -> 0x0059, all -> 0x0053, blocks: (B:14:0x004a, B:53:0x0112, B:56:0x0131, B:58:0x0135, B:62:0x0153, B:64:0x0157, B:66:0x015b, B:68:0x0167, B:71:0x018c, B:75:0x01ae, B:80:0x01df, B:81:0x01e6, B:82:0x01e7, B:83:0x01ec, B:84:0x01ed, B:86:0x01fa, B:90:0x0203, B:91:0x0206, B:92:0x0207, B:21:0x006c, B:24:0x0081, B:27:0x0092, B:30:0x00a6), top: B:104:0x0020 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [int, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v10, types: [int] */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v13, types: [int] */
    /* JADX WARN: Type inference failed for: r11v14, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v32, types: [eg.o] */
    /* JADX WARN: Type inference failed for: r12v34, types: [eg.o] */
    /* JADX WARN: Type inference failed for: r12v42, types: [int] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r13v0, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2, types: [fg.q] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [fg.q, kotlin.jvm.internal.g0] */
    /* JADX WARN: Type inference failed for: r14v15, types: [int] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v29, types: [fg.k] */
    /* JADX WARN: Type inference failed for: r15v35, types: [eg.o] */
    /* JADX WARN: Type inference failed for: r15v37, types: [fg.q] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [fg.q] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [fg.q] */
    /* JADX WARN: Type inference failed for: r2v8, types: [fg.q] */
    /* JADX WARN: Type inference failed for: r2v9, types: [fg.q] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01d0 -> B:79:0x01d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m36847d(p715kotlin.jvm.functions.Function1 r11, gg.InterfaceC15820g r12, int r13, p148fg.C14447q r14, s83.AbstractC32269c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.C13166o.m36847d(kotlin.jvm.functions.Function1, gg.g, int, fg.q, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public C0803k mo36844e() {
        return this.f45618a;
    }

    /* JADX INFO: renamed from: f */
    public /* bridge */ C0803k mo36845f() {
        return mo36844e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m36848h(C14447q c14447q, int i13, Object obj, AbstractC32269c abstractC32269c) {
        C13165n c13165n;
        if (abstractC32269c instanceof C13165n) {
            c13165n = (C13165n) abstractC32269c;
            int i14 = c13165n.f45612E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c13165n.f45612E = i14 - Integer.MIN_VALUE;
            } else {
                c13165n = new C13165n(this, abstractC32269c);
            }
        } else {
            c13165n = new C13165n(this, abstractC32269c);
        }
        Object obj2 = c13165n.f45615y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c13165n.f45612E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj2);
            c13165n.f45613w = obj;
            c13165n.f45614x = i13;
            c13165n.f45612E = 1;
            if (c14447q.m41168a(c13165n) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c13165n.f45614x;
            obj = c13165n.f45613w;
            AbstractC34132o.m107864I(obj2);
        }
        Object obj3 = obj instanceof C23467m ? null : obj;
        if (obj3 != null) {
            return new C13159h(i13, obj3);
        }
        Throwable thM68037a = C23468n.m68037a(obj);
        AbstractC22676k.m65747g(thM68037a);
        return new C13158g(i13, thM68037a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX INFO: renamed from: i */
    public final void m36849i(RetryCapacityExceededException retryCapacityExceededException, int i13, C23468n c23468n) throws Throwable {
        Object obj;
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Insufficient client capacity to attempt retry, halting on attempt ", " of ");
        sbM30466t.append(mo36844e().f2964b);
        String string = sbM30466t.toString();
        Throwable thM68037a = c23468n != null ? C23468n.m68037a(c23468n.f92940w) : null;
        if (thM68037a == null) {
            if (c23468n != null) {
                Object obj2 = c23468n.f92940w;
                if (obj2 instanceof C23467m) {
                    obj = null;
                } else {
                    obj = obj2;
                }
            } else {
                obj = null;
            }
            throw new TooManyAttemptsException(string, retryCapacityExceededException, i13, obj, c23468n != null ? C23468n.m68037a(c23468n.f92940w) : null);
        }
        if (!(thM68037a instanceof ServiceException)) {
            throw thM68037a;
        }
        C33736a c33736a = new C33736a(string);
        C15762c c15762cM106620a = ((ServiceException) thM68037a).getF8399w().m106620a();
        C15760a c15760a = C33738c.f141119b;
        C15760a key = AbstractC32069a.m99672j();
        AbstractC22676k.m65750j(c15762cM106620a, "<this>");
        AbstractC22676k.m65750j(key, "key");
        Collection collection = (List) c15762cM106620a.mo33082b(key);
        if (collection == null) {
            collection = C25271y.f99162w;
        }
        c15762cM106620a.mo33083c(key, AbstractC25265s.m74128f1(c33736a, collection));
        throw thM68037a;
    }

    /* JADX INFO: renamed from: j */
    public final void m36850j(int i13, Object obj) throws Throwable {
        Throwable thM68037a = C23468n.m68037a(obj);
        if (thM68037a != null) {
            throw thM68037a;
        }
        throw new TooManyAttemptsException(AbstractC18489d0.m53371l(new StringBuilder("Took more than "), mo36844e().f2964b, " attempts to get a successful response"), null, i13, obj instanceof C23467m ? null : obj, C23468n.m68037a(obj));
    }
}
