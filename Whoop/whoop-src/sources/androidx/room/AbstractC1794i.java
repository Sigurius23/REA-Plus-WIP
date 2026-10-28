package androidx.room;

import j93.AbstractC21478l0;
import p002a0.C0030i1;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: androidx.room.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1794i {
    public abstract void bind(InterfaceC33689c interfaceC33689c, Object obj);

    public abstract String createQuery();

    public final int handle(InterfaceC33687a connection, Object obj) {
        AbstractC22676k.m65750j(connection, "connection");
        if (obj == null) {
            return 0;
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            bind(interfaceC33689cMo68212g1, obj);
            interfaceC33689cMo68212g1.mo5355e1();
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return AbstractC21478l0.m60402H(connection);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final int handleMultiple(InterfaceC33687a connection, Iterable<Object> iterable) {
        AbstractC22676k.m65750j(connection, "connection");
        int iM60402H = 0;
        if (iterable == null) {
            return 0;
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(interfaceC33689cMo68212g1, obj);
                    interfaceC33689cMo68212g1.mo5355e1();
                    interfaceC33689cMo68212g1.reset();
                    iM60402H += AbstractC21478l0.m60402H(connection);
                }
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return iM60402H;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final int handleMultiple(InterfaceC33687a connection, Object[] objArr) {
        AbstractC22676k.m65750j(connection, "connection");
        int iM60402H = 0;
        if (objArr == null) {
            return 0;
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            C0030i1 c0030i1M65777h = AbstractC22681m0.m65777h(objArr);
            while (c0030i1M65777h.hasNext()) {
                Object next = c0030i1M65777h.next();
                if (next != null) {
                    bind(interfaceC33689cMo68212g1, next);
                    interfaceC33689cMo68212g1.mo5355e1();
                    interfaceC33689cMo68212g1.reset();
                    iM60402H += AbstractC21478l0.m60402H(connection);
                }
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return iM60402H;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }
}
