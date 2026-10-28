package p045c6;

import c93.InterfaceC4351m;
import java.io.IOException;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import p007a6.C0415d1;
import p007a6.C0426h0;
import p007a6.C0450r;
import p007a6.InterfaceC0404a;
import p007a6.InterfaceC0424g1;
import p505ts.AbstractC34132o;
import p671z5.C40084b;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: c6.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C4265h implements InterfaceC0424g1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC26632p f17329a;

    /* JADX INFO: renamed from: b */
    public final C26611e0 f17330b;

    /* JADX INFO: renamed from: c */
    public final C40084b f17331c;

    /* JADX INFO: renamed from: d */
    public final C0415d1 f17332d;

    /* JADX INFO: renamed from: e */
    public final C4261d f17333e;

    /* JADX INFO: renamed from: f */
    public final C4258a f17334f;

    /* JADX INFO: renamed from: g */
    public final C25437c f17335g;

    public C4265h(AbstractC26632p fileSystem, C26611e0 path, C40084b c40084b, C0415d1 coordinator, C4261d c4261d) {
        AbstractC22676k.m65750j(fileSystem, "fileSystem");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(coordinator, "coordinator");
        this.f17329a = fileSystem;
        this.f17330b = path;
        this.f17331c = c40084b;
        this.f17332d = coordinator;
        this.f17333e = c4261d;
        this.f17334f = new C4258a(0);
        this.f17335g = AbstractC25438d.m74669a();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0078, blocks: (B:33:0x0077, B:42:0x0087, B:41:0x0084, B:38:0x007f), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a6.r] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // p007a6.InterfaceC0424g1
    /* JADX INFO: renamed from: b */
    public final Object mo1103b(C0450r c0450r, AbstractC32269c abstractC32269c) throws Throwable {
        C4263f c4263f;
        Throwable th3;
        C4260c c4260c;
        ?? r14;
        if (abstractC32269c instanceof C4263f) {
            c4263f = (C4263f) abstractC32269c;
            int i13 = c4263f.f17318E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c4263f.f17318E = i13 - Integer.MIN_VALUE;
            } else {
                c4263f = new C4263f(this, abstractC32269c);
            }
        } else {
            c4263f = new C4263f(this, abstractC32269c);
        }
        Object obj = c4263f.f17321y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c4263f.f17318E;
        C25437c c25437c = this.f17335g;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0450r = c4263f.f17319w;
                c4260c = c4263f.f17320x;
                try {
                    AbstractC34132o.m107864I(obj);
                    r14 = c0450r;
                    try {
                        c4260c.close();
                        th = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r14 != 0) {
                        c25437c.mo68214i(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th3 = th5;
                    try {
                        c4260c.close();
                    } catch (Throwable th6) {
                        AbstractC29125c.m88530g(th3, th6);
                    }
                    throw th3;
                }
            }
            AbstractC34132o.m107864I(obj);
            if (this.f17334f.f17300a.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zTryLock = c25437c.tryLock();
            try {
                C4260c c4260c2 = new C4260c(this.f17329a, this.f17330b, this.f17331c);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zTryLock);
                    c4263f.f17320x = c4260c2;
                    c4263f.f17319w = zTryLock;
                    c4263f.f17318E = 1;
                    Object objInvoke = c0450r.invoke(c4260c2, boolValueOf, c4263f);
                    if (objInvoke == enumC31071a) {
                        return enumC31071a;
                    }
                    obj = objInvoke;
                    r14 = zTryLock;
                    c4260c = c4260c2;
                    c4260c.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r14 != 0) {
                        c25437c.mo68214i(null);
                    }
                    return obj;
                } catch (Throwable th7) {
                    th3 = th7;
                    c0450r = zTryLock;
                    c4260c = c4260c2;
                    c4260c.close();
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
            if (c0450r != 0) {
                c25437c.mo68214i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac A[Catch: all -> 0x00b6, IOException -> 0x00b9, TRY_ENTER, TryCatch #9 {IOException -> 0x00b9, all -> 0x00b6, blocks: (B:37:0x00ac, B:39:0x00b2, B:47:0x00c2, B:54:0x00cf, B:53:0x00cc), top: B:69:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2 A[Catch: all -> 0x00b6, IOException -> 0x00b9, TRY_LEAVE, TryCatch #9 {IOException -> 0x00b9, all -> 0x00b6, blocks: (B:37:0x00ac, B:39:0x00b2, B:47:0x00c2, B:54:0x00cf, B:53:0x00cc), top: B:69:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: all -> 0x00b6, IOException -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00b9, all -> 0x00b6, blocks: (B:37:0x00ac, B:39:0x00b2, B:47:0x00c2, B:54:0x00cf, B:53:0x00cc), top: B:69:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ne3.e0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ne3.e0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ne3.e0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ne3.p] */
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
    @Override // p007a6.InterfaceC0424g1
    /* JADX INFO: renamed from: c */
    public final Object mo1104c(C0426h0 c0426h0, AbstractC32269c abstractC32269c) throws Throwable {
        C4264g c4264g;
        C26611e0 c26611e0M79174c;
        InterfaceC25435a interfaceC25435a;
        InterfaceC4351m interfaceC4351m;
        C4267j c4267j;
        Throwable th3;
        InterfaceC0404a interfaceC0404a;
        InterfaceC25435a interfaceC25435a2;
        ?? r10;
        ?? M79176e = ".tmp";
        if (abstractC32269c instanceof C4264g) {
            c4264g = (C4264g) abstractC32269c;
            int i13 = c4264g.f17324F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c4264g.f17324F = i13 - Integer.MIN_VALUE;
            } else {
                c4264g = new C4264g(this, abstractC32269c);
            }
        } else {
            c4264g = new C4264g(this, abstractC32269c);
        }
        ?? r14 = c4264g.f17328z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c4264g.f17324F;
        C26611e0 c26611e0 = this.f17330b;
        ?? r15 = this.f17329a;
        try {
            try {
                try {
                    try {
                        if (i14 == 0) {
                            AbstractC34132o.m107864I(r14);
                            if (this.f17334f.f17300a.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            c26611e0M79174c = c26611e0.m79174c();
                            if (c26611e0M79174c == null) {
                                throw new IllegalStateException("must have a parent path");
                            }
                            r15.m79272i(c26611e0M79174c);
                            c4264g.f17325w = c0426h0;
                            c4264g.f17326x = c26611e0M79174c;
                            interfaceC25435a = this.f17335g;
                            c4264g.f17327y = interfaceC25435a;
                            c4264g.f17324F = 1;
                            if (interfaceC25435a.mo68211b(c4264g) != enumC31071a) {
                            }
                            interfaceC4351m = c0426h0;
                            return enumC31071a;
                        }
                        if (i14 != 1) {
                            if (i14 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0404a = (InterfaceC0404a) c4264g.f17327y;
                            C26611e0 c26611e1 = c4264g.f17326x;
                            interfaceC25435a2 = (InterfaceC25435a) c4264g.f17325w;
                            try {
                                AbstractC34132o.m107864I(r14);
                                r10 = c26611e1;
                                try {
                                    interfaceC0404a.close();
                                    th = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (r15.m79274x(r10)) {
                                    r15.mo79151h(r10, c26611e0);
                                }
                                interfaceC25435a2.mo68214i(null);
                                return C23454a0.f92919a;
                            } catch (Throwable th5) {
                                th3 = th5;
                                try {
                                    interfaceC0404a.close();
                                } catch (Throwable th6) {
                                    AbstractC29125c.m88530g(th3, th6);
                                }
                                throw th3;
                            }
                        }
                        InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c4264g.f17327y;
                        c26611e0M79174c = c4264g.f17326x;
                        InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) c4264g.f17325w;
                        AbstractC34132o.m107864I(r14);
                        interfaceC25435a = interfaceC25435a3;
                        interfaceC4351m = interfaceC4351m2;
                        c4264g.f17325w = interfaceC25435a;
                        c4264g.f17326x = M79176e;
                        c4264g.f17327y = c4267j;
                        c4264g.f17324F = 2;
                        if (interfaceC4351m.invoke(c4267j, c4264g) != enumC31071a) {
                            interfaceC25435a2 = interfaceC25435a;
                            interfaceC0404a = c4267j;
                            r10 = M79176e;
                            interfaceC0404a.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r15.m79274x(r10)) {
                                r15.mo79151h(r10, c26611e0);
                            }
                            interfaceC25435a2.mo68214i(null);
                            return C23454a0.f92919a;
                        }
                        interfaceC4351m = c0426h0;
                        return enumC31071a;
                    } catch (Throwable th7) {
                        th3 = th7;
                        interfaceC0404a = c4267j;
                        interfaceC0404a.close();
                        throw th3;
                    }
                    r15.mo79153m(M79176e);
                    c4267j = new C4267j(r15, M79176e, this.f17331c);
                } catch (IOException e5) {
                    e = e5;
                    if (r15.m79274x(M79176e)) {
                        try {
                            r15.mo79153m(M79176e);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                interfaceC4351m = c0426h0;
                M79176e = c26611e0M79174c.m79176e(c26611e0.m79173b().concat(".tmp"));
            } catch (Throwable th8) {
                th = th8;
                r14.mo68214i(null);
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (Throwable th9) {
            th = th9;
            r14 = c4264g;
            r14.mo68214i(null);
            throw th;
        }
    }

    @Override // p007a6.InterfaceC0404a
    public final void close() {
        this.f17334f.f17300a.set(true);
        this.f17333e.invoke();
    }

    @Override // p007a6.InterfaceC0424g1
    /* JADX INFO: renamed from: e */
    public final C0415d1 mo1105e() {
        return this.f17332d;
    }
}
