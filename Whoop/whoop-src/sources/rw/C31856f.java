package rw;

import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p319m4.AbstractC25012a;
import p384ow.AbstractC28430z;
import p384ow.C28416l;
import p384ow.C28417m;
import p440qw.InterfaceC30680o;
import p499t9.C33647p;
import p563vw.C36540a;
import p596ww.C37653a;
import p596ww.C37654b;
import pw.InterfaceC29583b;

/* JADX INFO: renamed from: rw.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C31856f extends AbstractC28430z {

    /* JADX INFO: renamed from: e */
    public static final C31851a f132115e = new C31851a(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132116a;

    /* JADX INFO: renamed from: b */
    public final Object f132117b;

    /* JADX INFO: renamed from: c */
    public final Object f132118c;

    /* JADX INFO: renamed from: d */
    public final Object f132119d;

    public C31856f(Class cls) {
        this.f132116a = 0;
        this.f132117b = new HashMap();
        this.f132118c = new HashMap();
        this.f132119d = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i13 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i13] = field;
                    i13++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i13);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r10 = (Enum) field2.get(null);
                String strName = r10.name();
                String string = r10.toString();
                InterfaceC29583b interfaceC29583b = (InterfaceC29583b) field2.getAnnotation(InterfaceC29583b.class);
                if (interfaceC29583b != null) {
                    strName = interfaceC29583b.value();
                    for (String str : interfaceC29583b.alternate()) {
                        ((HashMap) this.f132117b).put(str, r10);
                    }
                }
                ((HashMap) this.f132117b).put(strName, r10);
                ((HashMap) this.f132118c).put(string, r10);
                ((HashMap) this.f132119d).put(r10, strName);
            }
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) throws IOException {
        switch (this.f132116a) {
            case 0:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                String strNextString = c37653a.nextString();
                Enum r10 = (Enum) ((HashMap) this.f132117b).get(strNextString);
                return r10 == null ? (Enum) ((HashMap) this.f132118c).get(strNextString) : r10;
            case 1:
                int iM121062o0 = c37653a.m121062o0();
                if (iM121062o0 == 9) {
                    c37653a.m121053T();
                    return null;
                }
                Map map = (Map) ((InterfaceC30680o) this.f132119d).construct();
                if (iM121062o0 == 1) {
                    c37653a.beginArray();
                    while (c37653a.hasNext()) {
                        c37653a.beginArray();
                        Object objMo86132b = ((AbstractC28430z) ((C31856f) this.f132117b).f132118c).mo86132b(c37653a);
                        if (map.put(objMo86132b, ((AbstractC28430z) ((C31856f) this.f132118c).f132118c).mo86132b(c37653a)) != null) {
                            throw new JsonSyntaxException(AbstractC25012a.m73375h(objMo86132b, "duplicate key: "));
                        }
                        c37653a.endArray();
                    }
                    c37653a.endArray();
                } else {
                    c37653a.beginObject();
                    while (c37653a.hasNext()) {
                        C33647p.f140433x.getClass();
                        int iM121058h = c37653a.f161364G;
                        if (iM121058h == 0) {
                            iM121058h = c37653a.m121058h();
                        }
                        if (iM121058h == 13) {
                            c37653a.f161364G = 9;
                        } else if (iM121058h == 12) {
                            c37653a.f161364G = 8;
                        } else {
                            if (iM121058h != 14) {
                                throw c37653a.m121054T0("a name");
                            }
                            c37653a.f161364G = 10;
                        }
                        Object objMo86132b2 = ((AbstractC28430z) ((C31856f) this.f132117b).f132118c).mo86132b(c37653a);
                        if (map.put(objMo86132b2, ((AbstractC28430z) ((C31856f) this.f132118c).f132118c).mo86132b(c37653a)) != null) {
                            throw new JsonSyntaxException(AbstractC25012a.m73375h(objMo86132b2, "duplicate key: "));
                        }
                    }
                    c37653a.endObject();
                }
                return map;
            default:
                return ((AbstractC28430z) this.f132118c).mo86132b(c37653a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) {
        switch (this.f132116a) {
            case 0:
                Enum r10 = (Enum) obj;
                c37654b.m121078p0(r10 == null ? null : (String) ((HashMap) this.f132119d).get(r10));
                return;
            case 1:
                Map map = (Map) obj;
                C31856f c31856f = (C31856f) this.f132118c;
                if (map == null) {
                    c37654b.m121076m();
                    return;
                }
                c37654b.beginObject();
                for (Map.Entry entry : map.entrySet()) {
                    c37654b.m121074i(String.valueOf(entry.getKey()));
                    c31856f.mo86133c(c37654b, entry.getValue());
                }
                c37654b.endObject();
                return;
            default:
                AbstractC28430z abstractC28430z = (AbstractC28430z) this.f132118c;
                Type type = (Type) this.f132119d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    AbstractC28430z abstractC28430zM86136c = ((C28417m) this.f132117b).m86136c(new C36540a(type2));
                    if (abstractC28430zM86136c instanceof AbstractC31862l) {
                        AbstractC28430z abstractC28430z2 = abstractC28430z;
                        while (abstractC28430z2 instanceof C28416l) {
                            AbstractC28430z abstractC28430z3 = ((C28416l) abstractC28430z2).f114612a;
                            if (abstractC28430z3 == null) {
                                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                            }
                            if (abstractC28430z3 != abstractC28430z2) {
                                abstractC28430z2 = abstractC28430z3;
                            } else if (abstractC28430z2 instanceof AbstractC31862l) {
                                abstractC28430z = abstractC28430zM86136c;
                            }
                        }
                        if (abstractC28430z2 instanceof AbstractC31862l) {
                            abstractC28430z = abstractC28430zM86136c;
                        }
                    } else {
                        abstractC28430z = abstractC28430zM86136c;
                    }
                }
                abstractC28430z.mo86133c(c37654b, obj);
                return;
        }
    }

    public C31856f(C28417m c28417m, AbstractC28430z abstractC28430z, Type type) {
        this.f132116a = 2;
        this.f132117b = c28417m;
        this.f132118c = abstractC28430z;
        this.f132119d = type;
    }

    public C31856f(C31853c c31853c, C31856f c31856f, C31856f c31856f2, InterfaceC30680o interfaceC30680o) {
        this.f132116a = 1;
        this.f132117b = c31856f;
        this.f132118c = c31856f2;
        this.f132119d = interfaceC30680o;
    }
}
