package rw;

import com.nimbusds.jose.shaded.gson.JsonParseException;
import ih0.AbstractC18489d0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import p596ww.C37653a;
import s30.AbstractC32100b;
import tw.AbstractC34214c;

/* JADX INFO: renamed from: rw.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C31865o extends AbstractC31862l {

    /* JADX INFO: renamed from: e */
    public static final HashMap f132142e;

    /* JADX INFO: renamed from: b */
    public final Constructor f132143b;

    /* JADX INFO: renamed from: c */
    public final Object[] f132144c;

    /* JADX INFO: renamed from: d */
    public final HashMap f132145d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f132142e = map;
    }

    public C31865o(Class cls, C31864n c31864n) {
        super(c31864n);
        this.f132145d = new HashMap();
        AbstractC32100b abstractC32100b = AbstractC34214c.f143522a;
        Constructor constructorMo99876k = abstractC32100b.mo99876k(cls);
        this.f132143b = constructorMo99876k;
        AbstractC34214c.m108141f(constructorMo99876k);
        String[] strArrMo99877n = abstractC32100b.mo99877n(cls);
        for (int i13 = 0; i13 < strArrMo99877n.length; i13++) {
            this.f132145d.put(strArrMo99877n[i13], Integer.valueOf(i13));
        }
        Class<?>[] parameterTypes = this.f132143b.getParameterTypes();
        this.f132144c = new Object[parameterTypes.length];
        for (int i14 = 0; i14 < parameterTypes.length; i14++) {
            this.f132144c[i14] = f132142e.get(parameterTypes[i14]);
        }
    }

    @Override // rw.AbstractC31862l
    /* JADX INFO: renamed from: d */
    public final Object mo99048d() {
        return (Object[]) this.f132144c.clone();
    }

    @Override // rw.AbstractC31862l
    /* JADX INFO: renamed from: e */
    public final Object mo99049e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f132143b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e5) {
            AbstractC32100b abstractC32100b = AbstractC34214c.f143522a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
        } catch (IllegalArgumentException e13) {
            e = e13;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC34214c.m108137b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e14) {
            e = e14;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC34214c.m108137b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC34214c.m108137b(constructor) + "' with args " + Arrays.toString(objArr), e15.getCause());
        }
    }

    @Override // rw.AbstractC31862l
    /* JADX INFO: renamed from: f */
    public final void mo99050f(Object obj, C37653a c37653a, C31861k c31861k) {
        Object[] objArr = (Object[]) obj;
        String str = c31861k.f132131c;
        Integer num = (Integer) this.f132145d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC34214c.m108137b(this.f132143b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo86132b = c31861k.f132134f.mo86132b(c37653a);
        if (objMo86132b != null || !c31861k.f132135g) {
            objArr[iIntValue] = objMo86132b;
        } else {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM53375p.append(c37653a.m121060k(false));
            throw new JsonParseException(sbM53375p.toString());
        }
    }
}
