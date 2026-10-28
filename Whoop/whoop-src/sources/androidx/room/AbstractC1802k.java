package androidx.room;

import j93.AbstractC21478l0;
import java.util.Collection;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import n83.C26460c;
import p002a0.C0030i1;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.room.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1802k {
    public abstract void bind(InterfaceC33689c interfaceC33689c, Object obj);

    public abstract String createQuery();

    public final void insert(InterfaceC33687a connection, Object obj) {
        AbstractC22676k.m65750j(connection, "connection");
        if (obj == null) {
            return;
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            bind(interfaceC33689cMo68212g1, obj);
            interfaceC33689cMo68212g1.mo5355e1();
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final long insertAndReturnId(InterfaceC33687a connection, Object obj) {
        AbstractC22676k.m65750j(connection, "connection");
        if (obj == null) {
            return -1L;
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            bind(interfaceC33689cMo68212g1, obj);
            interfaceC33689cMo68212g1.mo5355e1();
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return AbstractC21478l0.m60398D(connection);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final long[] insertAndReturnIdsArray(InterfaceC33687a connection, Collection<Object> collection) {
        long jM60398D;
        AbstractC22676k.m65750j(connection, "connection");
        if (collection == null) {
            return new long[0];
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i13 = 0; i13 < size; i13++) {
                Object objM74088B0 = AbstractC25265s.m74088B0(collection, i13);
                if (objM74088B0 != null) {
                    bind(interfaceC33689cMo68212g1, objM74088B0);
                    interfaceC33689cMo68212g1.mo5355e1();
                    interfaceC33689cMo68212g1.reset();
                    jM60398D = AbstractC21478l0.m60398D(connection);
                } else {
                    jM60398D = -1;
                }
                jArr[i13] = jM60398D;
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return jArr;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(InterfaceC33687a connection, Collection<Object> collection) {
        long jM60398D;
        AbstractC22676k.m65750j(connection, "connection");
        if (collection == null) {
            return new Long[0];
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i13 = 0; i13 < size; i13++) {
                Object objM74088B0 = AbstractC25265s.m74088B0(collection, i13);
                if (objM74088B0 != null) {
                    bind(interfaceC33689cMo68212g1, objM74088B0);
                    interfaceC33689cMo68212g1.mo5355e1();
                    interfaceC33689cMo68212g1.reset();
                    jM60398D = AbstractC21478l0.m60398D(connection);
                } else {
                    jM60398D = -1;
                }
                lArr[i13] = Long.valueOf(jM60398D);
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return lArr;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final List<Long> insertAndReturnIdsList(InterfaceC33687a connection, Object[] objArr) {
        AbstractC22676k.m65750j(connection, "connection");
        if (objArr == null) {
            return C25271y.f99162w;
        }
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            for (Object obj : objArr) {
                if (obj != null) {
                    bind(interfaceC33689cMo68212g1, obj);
                    interfaceC33689cMo68212g1.mo5355e1();
                    interfaceC33689cMo68212g1.reset();
                    c26460cM119000x.add(Long.valueOf(AbstractC21478l0.m60398D(connection)));
                } else {
                    c26460cM119000x.add(-1L);
                }
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return AbstractC37056f.m118988k(c26460cM119000x);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final void insert(InterfaceC33687a connection, Object[] objArr) {
        AbstractC22676k.m65750j(connection, "connection");
        if (objArr == null) {
            return;
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
                }
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final void insert(InterfaceC33687a connection, Iterable<Object> iterable) {
        AbstractC22676k.m65750j(connection, "connection");
        if (iterable == null) {
            return;
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(interfaceC33689cMo68212g1, obj);
                    interfaceC33689cMo68212g1.mo5355e1();
                    interfaceC33689cMo68212g1.reset();
                }
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final long[] insertAndReturnIdsArray(InterfaceC33687a connection, Object[] objArr) {
        long jM60398D;
        AbstractC22676k.m65750j(connection, "connection");
        if (objArr == null) {
            return new long[0];
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            int length = objArr.length;
            long[] jArr = new long[length];
            for (int i13 = 0; i13 < length; i13++) {
                Object obj = objArr[i13];
                if (obj != null) {
                    bind(interfaceC33689cMo68212g1, obj);
                    interfaceC33689cMo68212g1.mo5355e1();
                    interfaceC33689cMo68212g1.reset();
                    jM60398D = AbstractC21478l0.m60398D(connection);
                } else {
                    jM60398D = -1;
                }
                jArr[i13] = jM60398D;
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return jArr;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(InterfaceC33687a connection, Object[] objArr) {
        long jM60398D;
        AbstractC22676k.m65750j(connection, "connection");
        if (objArr == null) {
            return new Long[0];
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i13 = 0; i13 < length; i13++) {
                Object obj = objArr[i13];
                if (obj != null) {
                    bind(interfaceC33689cMo68212g1, obj);
                    interfaceC33689cMo68212g1.mo5355e1();
                    interfaceC33689cMo68212g1.reset();
                    jM60398D = AbstractC21478l0.m60398D(connection);
                } else {
                    jM60398D = -1;
                }
                lArr[i13] = Long.valueOf(jM60398D);
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return lArr;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    public final List<Long> insertAndReturnIdsList(InterfaceC33687a connection, Collection<Object> collection) {
        AbstractC22676k.m65750j(connection, "connection");
        if (collection == null) {
            return C25271y.f99162w;
        }
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1(createQuery());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    bind(interfaceC33689cMo68212g1, obj);
                    interfaceC33689cMo68212g1.mo5355e1();
                    interfaceC33689cMo68212g1.reset();
                    c26460cM119000x.add(Long.valueOf(AbstractC21478l0.m60398D(connection)));
                } else {
                    c26460cM119000x.add(-1L);
                }
            }
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return AbstractC37056f.m118988k(c26460cM119000x);
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
