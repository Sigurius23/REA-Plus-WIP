package lb;

import androidx.room.EnumC1840w1;
import androidx.room.InterfaceC1843x1;
import c93.InterfaceC4351m;
import g73.C15556d;
import hg3.AbstractC17269i;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25258m;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: lb.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23557a0 implements InterfaceC1843x1, InterfaceC23559b0 {

    /* JADX INFO: renamed from: a */
    public final C15556d f93430a;

    /* JADX INFO: renamed from: b */
    public final C23565h f93431b;

    /* JADX INFO: renamed from: c */
    public final boolean f93432c;

    /* JADX INFO: renamed from: d */
    public final C25258m f93433d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f93434e;

    public C23557a0(C15556d connectionElementKey, C23565h c23565h, boolean z4) {
        AbstractC22676k.m65750j(connectionElementKey, "connectionElementKey");
        this.f93430a = connectionElementKey;
        this.f93431b = c23565h;
        this.f93432c = z4;
        this.f93433d = new C25258m();
    }

    @Override // androidx.room.InterfaceC1843x1
    /* JADX INFO: renamed from: a */
    public final Boolean mo5462a(InterfaceC30057d interfaceC30057d) {
        if (this.f93434e) {
            AbstractC17269i.m48901l0(21, "Connection is recycled");
            throw null;
        }
        C23556a c23556a = (C23556a) interfaceC30057d.getContext().get(this.f93430a);
        if (c23556a != null && c23556a.f93429x == this) {
            return Boolean.valueOf(!this.f93433d.isEmpty() || this.f93431b.f93458w.mo68216v());
        }
        AbstractC17269i.m48901l0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // androidx.room.InterfaceC1843x1
    /* JADX INFO: renamed from: b */
    public final Object mo5463b(EnumC1840w1 enumC1840w1, InterfaceC4351m interfaceC4351m, AbstractC32275i abstractC32275i) {
        if (this.f93434e) {
            AbstractC17269i.m48901l0(21, "Connection is recycled");
            throw null;
        }
        C23556a c23556a = (C23556a) abstractC32275i.getContext().get(this.f93430a);
        if (c23556a != null && c23556a.f93429x == this) {
            return m68209g(enumC1840w1, interfaceC4351m, abstractC32275i);
        }
        AbstractC17269i.m48901l0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.room.InterfaceC1799j0
    /* JADX INFO: renamed from: c */
    public final Object mo5426c(String str, Function1 function1, AbstractC32269c abstractC32269c) {
        C23583z c23583z;
        C23565h c23565h;
        if (abstractC32269c instanceof C23583z) {
            c23583z = (C23583z) abstractC32269c;
            int i13 = c23583z.f93528F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23583z.f93528F = i13 - Integer.MIN_VALUE;
            } else {
                c23583z = new C23583z(this, abstractC32269c);
            }
        } else {
            c23583z = new C23583z(this, abstractC32269c);
        }
        Object obj = c23583z.f93532z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23583z.f93528F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (this.f93434e) {
                AbstractC17269i.m48901l0(21, "Connection is recycled");
                throw null;
            }
            C23556a c23556a = (C23556a) c23583z.getContext().get(this.f93430a);
            if (c23556a == null || c23556a.f93429x != this) {
                AbstractC17269i.m48901l0(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            c23565h = this.f93431b;
            c23583z.f93529w = str;
            c23583z.f93530x = function1;
            c23583z.f93531y = c23565h;
            c23583z.f93528F = 1;
            if (c23565h.f93459x.mo68211b(c23583z) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C23565h c23565h2 = c23583z.f93531y;
            function1 = c23583z.f93530x;
            String str2 = c23583z.f93529w;
            AbstractC34132o.m107864I(obj);
            c23565h = c23565h2;
            str = str2;
        }
        try {
            C23577t c23577t = new C23577t(this, this.f93431b.mo68212g1(str));
            try {
                Object objInvoke = function1.invoke(c23577t);
                AbstractC21598x.m60698r(c23577t, null);
                c23565h.mo68214i(null);
                return objInvoke;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC21598x.m60698r(c23577t, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            c23565h.mo68214i(null);
            throw th5;
        }
    }

    @Override // lb.InterfaceC23559b0
    /* JADX INFO: renamed from: d */
    public final InterfaceC33687a mo68206d() {
        return this.f93431b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public final Object m68207e(EnumC1840w1 enumC1840w1, AbstractC32269c abstractC32269c) {
        C23580w c23580w;
        C23565h c23565h;
        C25258m c25258m = this.f93433d;
        if (abstractC32269c instanceof C23580w) {
            c23580w = (C23580w) abstractC32269c;
            int i13 = c23580w.f93511E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23580w.f93511E = i13 - Integer.MIN_VALUE;
            } else {
                c23580w = new C23580w(this, abstractC32269c);
            }
        } else {
            c23580w = new C23580w(this, abstractC32269c);
        }
        Object obj = c23580w.f93514y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23580w.f93511E;
        C23565h c23565h2 = this.f93431b;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c23580w.f93512w = enumC1840w1;
            c23580w.f93513x = c23565h2;
            c23580w.f93511E = 1;
            if (c23565h2.f93459x.mo68211b(c23580w) == enumC31071a) {
                return enumC31071a;
            }
            c23565h = c23565h2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C23565h c23565h3 = c23580w.f93513x;
            EnumC1840w1 enumC1840w2 = c23580w.f93512w;
            AbstractC34132o.m107864I(obj);
            c23565h = c23565h3;
            enumC1840w1 = enumC1840w2;
        }
        try {
            int i15 = c25258m.f99142y;
            if (c25258m.isEmpty()) {
                int iOrdinal = enumC1840w1.ordinal();
                if (iOrdinal == 0) {
                    AbstractC17269i.m48864K("BEGIN DEFERRED TRANSACTION", c23565h2);
                } else if (iOrdinal == 1) {
                    AbstractC17269i.m48864K("BEGIN IMMEDIATE TRANSACTION", c23565h2);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC17269i.m48864K("BEGIN EXCLUSIVE TRANSACTION", c23565h2);
                }
            } else {
                AbstractC17269i.m48864K("SAVEPOINT '" + i15 + '\'', c23565h2);
            }
            c25258m.addLast(new C23579v(i15));
            C23454a0 c23454a0 = C23454a0.f92919a;
            c23565h.mo68214i(null);
            return c23454a0;
        } catch (Throwable th3) {
            c23565h.mo68214i(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: f */
    public final Object m68208f(boolean z4, AbstractC32269c abstractC32269c) {
        C23581x c23581x;
        C23565h c23565h;
        C25258m c25258m = this.f93433d;
        if (abstractC32269c instanceof C23581x) {
            c23581x = (C23581x) abstractC32269c;
            int i13 = c23581x.f93516E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23581x.f93516E = i13 - Integer.MIN_VALUE;
            } else {
                c23581x = new C23581x(this, abstractC32269c);
            }
        } else {
            c23581x = new C23581x(this, abstractC32269c);
        }
        Object obj = c23581x.f93519y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23581x.f93516E;
        C23565h c23565h2 = this.f93431b;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c23581x.f93518x = c23565h2;
            c23581x.f93517w = z4;
            c23581x.f93516E = 1;
            if (c23565h2.f93459x.mo68211b(c23581x) == enumC31071a) {
                return enumC31071a;
            }
            c23565h = c23565h2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = c23581x.f93517w;
            c23565h = c23581x.f93518x;
            AbstractC34132o.m107864I(obj);
        }
        try {
            if (c25258m.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            C23579v c23579v = (C23579v) AbstractC25265s.m74134l1(c25258m);
            if (z4) {
                c23579v.getClass();
                if (c25258m.isEmpty()) {
                    AbstractC17269i.m48864K("END TRANSACTION", c23565h2);
                } else {
                    AbstractC17269i.m48864K("RELEASE SAVEPOINT '" + c23579v.f93510a + '\'', c23565h2);
                }
            } else if (c25258m.isEmpty()) {
                AbstractC17269i.m48864K("ROLLBACK TRANSACTION", c23565h2);
            } else {
                AbstractC17269i.m48864K("ROLLBACK TRANSACTION TO SAVEPOINT '" + c23579v.f93510a + '\'', c23565h2);
            }
            C23454a0 c23454a0 = C23454a0.f92919a;
            c23565h.mo68214i(null);
            return c23454a0;
        } catch (Throwable th3) {
            c23565h.mo68214i(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (m68208f(false, r0) == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [c93.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [lb.a0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.room.w1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.room.w1] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m68209g(androidx.room.EnumC1840w1 r9, c93.InterfaceC4351m r10, s83.AbstractC32269c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof lb.C23582y
            if (r0 == 0) goto L13
            r0 = r11
            lb.y r0 = (lb.C23582y) r0
            int r1 = r0.f93522F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93522F = r1
            goto L18
        L13:
            lb.y r0 = new lb.y
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f93526z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f93522F
            r3 = 0
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L5d
            if (r2 == r7) goto L54
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L45
            r9 = 4
            if (r2 == r9) goto L45
            if (r2 == r4) goto L38
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Throwable r9 = r0.f93524x
            java.lang.Object r10 = r0.f93523w
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: android.database.SQLException -> L43
            goto La6
        L43:
            r11 = move-exception
            goto La1
        L45:
            java.lang.Object r9 = r0.f93523w
            p505ts.AbstractC34132o.m107864I(r11)
            return r9
        L4b:
            int r9 = r0.f93525y
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.lang.Throwable -> L51
            goto L83
        L51:
            r9 = move-exception
            r10 = r9
            goto L92
        L54:
            java.lang.Object r9 = r0.f93523w
            r10 = r9
            c93.m r10 = (c93.InterfaceC4351m) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L6f
        L5d:
            p505ts.AbstractC34132o.m107864I(r11)
            if (r9 != 0) goto L64
            androidx.room.w1 r9 = androidx.room.EnumC1840w1.f7203w
        L64:
            r0.f93523w = r10
            r0.f93522F = r7
            java.lang.Object r9 = r8.m68207e(r9, r0)
            if (r9 != r1) goto L6f
            goto La0
        L6f:
            lb.u r9 = new lb.u     // Catch: java.lang.Throwable -> L51
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L51
            r11 = 0
            r0.f93523w = r11     // Catch: java.lang.Throwable -> L51
            r0.f93525y = r7     // Catch: java.lang.Throwable -> L51
            r0.f93522F = r6     // Catch: java.lang.Throwable -> L51
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L51
            if (r11 != r1) goto L82
            goto La0
        L82:
            r9 = r7
        L83:
            if (r9 == 0) goto L86
            r3 = r7
        L86:
            r0.f93523w = r11
            r0.f93522F = r5
            java.lang.Object r9 = r8.m68208f(r3, r0)
            if (r9 != r1) goto L91
            goto La0
        L91:
            return r11
        L92:
            throw r10     // Catch: java.lang.Throwable -> L93
        L93:
            r9 = move-exception
            r0.f93523w = r10     // Catch: android.database.SQLException -> L43
            r0.f93524x = r9     // Catch: android.database.SQLException -> L43
            r0.f93522F = r4     // Catch: android.database.SQLException -> L43
            java.lang.Object r10 = r8.m68208f(r3, r0)     // Catch: android.database.SQLException -> L43
            if (r10 != r1) goto La6
        La0:
            return r1
        La1:
            if (r10 == 0) goto La7
            pf.AbstractC29125c.m88530g(r10, r11)
        La6:
            throw r9
        La7:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.C23557a0.m68209g(androidx.room.w1, c93.m, s83.c):java.lang.Object");
    }
}
