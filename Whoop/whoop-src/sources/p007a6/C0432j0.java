package p007a6;

import androidx.lifecycle.C1578e1;
import androidx.room.AbstractC1848z0;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import hc3.C17191x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import se.AbstractC32417h;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: a6.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0432j0 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1485w;

    /* JADX INFO: renamed from: x */
    public int f1486x;

    /* JADX INFO: renamed from: y */
    public Object f1487y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f1488z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0432j0(C0435k0 c0435k0, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f1485w = 0;
        this.f1488z = c0435k0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f1485w) {
            case 0:
                return new C0432j0((C0435k0) this.f1488z, interfaceC30057d);
            case 1:
                return new C0432j0((InterfaceC13062m) this.f1487y, (C22669g0) this.f1488z, interfaceC30057d, 1);
            default:
                return new C0432j0((AbstractC1848z0) this.f1487y, (Function1) this.f1488z, interfaceC30057d, 2);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f1485w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0432j0) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Exception {
        FileInputStream fileInputStream;
        Throwable th3;
        switch (this.f1485w) {
            case 0:
                C0435k0 c0435k0 = (C0435k0) this.f1488z;
                InterfaceC0465y0 interfaceC0465y0 = c0435k0.f1494b;
                File file = c0435k0.f1493a;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                ?? r10 = this.f1486x;
                try {
                    try {
                        try {
                            if (r10 == 0) {
                                AbstractC34132o.m107864I(obj);
                                FileInputStream fileInputStream2 = new FileInputStream(file);
                                this.f1487y = fileInputStream2;
                                this.f1486x = 1;
                                obj = interfaceC0465y0.mo1123b(fileInputStream2);
                                r10 = fileInputStream2;
                                if (obj == enumC31071a) {
                                    return enumC31071a;
                                }
                            } else {
                                if (r10 != 1) {
                                    if (r10 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    fileInputStream = (FileInputStream) this.f1487y;
                                    try {
                                        AbstractC34132o.m107864I(obj);
                                        AbstractC35854l.m113829i(fileInputStream, null);
                                        return obj;
                                    } catch (Throwable th4) {
                                        th3 = th4;
                                        try {
                                            throw th3;
                                        } catch (Throwable th5) {
                                            AbstractC35854l.m113829i(fileInputStream, th3);
                                            throw th5;
                                        }
                                    }
                                }
                                FileInputStream fileInputStream3 = (FileInputStream) this.f1487y;
                                AbstractC34132o.m107864I(obj);
                                r10 = fileInputStream3;
                            }
                            AbstractC35854l.m113829i(r10, null);
                        } catch (Exception e5) {
                            if (e5 instanceof FileNotFoundException) {
                                throw AbstractC32417h.m101191V(file.getParent(), (FileNotFoundException) e5);
                            }
                            throw e5;
                        }
                        break;
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            AbstractC35854l.m113829i(r10, th6);
                            throw th7;
                        }
                    }
                } catch (FileNotFoundException unused) {
                    if (file.exists()) {
                        FileInputStream fileInputStream4 = new FileInputStream(file);
                        try {
                            this.f1487y = fileInputStream4;
                            this.f1486x = 2;
                            Object objMo1123b = interfaceC0465y0.mo1123b(fileInputStream4);
                            if (objMo1123b == enumC31071a) {
                                return enumC31071a;
                            }
                            fileInputStream = fileInputStream4;
                            obj = objMo1123b;
                            AbstractC35854l.m113829i(fileInputStream, null);
                        } catch (Throwable th8) {
                            fileInputStream = fileInputStream4;
                            th3 = th8;
                            throw th3;
                        }
                    } else {
                        obj = interfaceC0465y0.mo1122a();
                    }
                    return obj;
                }
                return obj;
            case 1:
                C22669g0 c22669g0 = (C22669g0) this.f1488z;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i13 = this.f1486x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f1487y;
                    C17191x c17191x = AbstractC14371b.f52477b;
                    Object obj2 = c22669g0.f89336w;
                    if (obj2 == c17191x) {
                        obj2 = null;
                    }
                    this.f1486x = 1;
                    if (interfaceC13062m.emit(obj2, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                c22669g0.f89336w = null;
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i14 = this.f1486x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AbstractC1848z0 abstractC1848z0 = (AbstractC1848z0) this.f1487y;
                C1578e1 c1578e1 = new C1578e1(abstractC1848z0, (Function1) this.f1488z, (InterfaceC30057d) null);
                this.f1486x = 1;
                Object objUseConnection = abstractC1848z0.useConnection(false, c1578e1, this);
                return objUseConnection == enumC31071a3 ? enumC31071a3 : objUseConnection;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0432j0(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f1485w = i13;
        this.f1487y = obj;
        this.f1488z = obj2;
    }
}
