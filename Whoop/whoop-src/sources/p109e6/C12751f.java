package p109e6;

import androidx.datastore.preferences.protobuf.AbstractC1200b;
import androidx.datastore.preferences.protobuf.AbstractC1204c0;
import androidx.datastore.preferences.protobuf.AbstractC1265x;
import androidx.datastore.preferences.protobuf.AbstractC1269z;
import androidx.datastore.preferences.protobuf.C1218h;
import androidx.datastore.preferences.protobuf.C1266x0;
import androidx.datastore.preferences.protobuf.C1267y;
import androidx.datastore.preferences.protobuf.C1268y0;
import androidx.datastore.preferences.protobuf.InterfaceC1201b0;
import androidx.datastore.preferences.protobuf.InterfaceC1210e0;
import androidx.datastore.preferences.protobuf.InterfaceC1258u0;
import androidx.datastore.preferences.protobuf.InterfaceC1261v0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC30802r;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: e6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C12751f extends AbstractC1269z {
    private static final C12751f DEFAULT_INSTANCE;
    private static volatile InterfaceC1258u0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC1201b0 strings_ = C1266x0.m4016e();

    static {
        C12751f c12751f = new C12751f();
        DEFAULT_INSTANCE = c12751f;
        AbstractC1269z.m4023j(C12751f.class, c12751f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public static void m35677m(C12751f c12751f, Iterable iterable) {
        AbstractC1200b abstractC1200b = (AbstractC1200b) c12751f.strings_;
        if (!abstractC1200b.m3777c()) {
            C1266x0 c1266x0 = (C1266x0) abstractC1200b;
            int size = c1266x0.size();
            c12751f.strings_ = c1266x0.m4018g(size == 0 ? 10 : size * 2);
        }
        List list = c12751f.strings_;
        Charset charset = AbstractC1204c0.f5362a;
        if (iterable instanceof InterfaceC1210e0) {
            List listM3793b = ((InterfaceC1210e0) iterable).m3793b();
            AbstractC30802r.m94771t(list);
            list.size();
            Iterator it = listM3793b.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C1218h) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C1218h.m3808d(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof InterfaceC1261v0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    /* JADX INFO: renamed from: n */
    public static C12751f m35678n() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static C12750e m35679p() {
        return (C12750e) ((AbstractC1265x) DEFAULT_INSTANCE.mo4024c(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1269z
    /* JADX INFO: renamed from: c */
    public final Object mo4024c(int i13) {
        InterfaceC1258u0 c1267y;
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1268y0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C12751f();
            case 4:
                return new C12750e();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1258u0 interfaceC1258u0 = PARSER;
                if (interfaceC1258u0 != null) {
                    return interfaceC1258u0;
                }
                synchronized (C12751f.class) {
                    try {
                        c1267y = PARSER;
                        if (c1267y == null) {
                            c1267y = new C1267y();
                            PARSER = c1267y;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return c1267y;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC1201b0 m35680o() {
        return this.strings_;
    }
}
