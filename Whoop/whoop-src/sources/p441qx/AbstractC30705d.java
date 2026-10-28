package p441qx;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;
import p471rx.AbstractC31885f;

/* JADX INFO: renamed from: qx.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30705d {

    /* JADX INFO: renamed from: a */
    public final Type f126441a;

    /* JADX INFO: renamed from: b */
    public final Set f126442b;

    /* JADX INFO: renamed from: c */
    public final Object f126443c;

    /* JADX INFO: renamed from: d */
    public final Method f126444d;

    /* JADX INFO: renamed from: e */
    public final int f126445e;

    /* JADX INFO: renamed from: f */
    public final JsonAdapter[] f126446f;

    /* JADX INFO: renamed from: g */
    public final boolean f126447g;

    public AbstractC30705d(Type type, Set set, Object obj, Method method, int i13, int i14, boolean z4) {
        this.f126441a = AbstractC31885f.m99123a(type);
        this.f126442b = set;
        this.f126443c = obj;
        this.f126444d = method;
        this.f126445e = i14;
        this.f126446f = new JsonAdapter[i13 - i14];
        this.f126447g = z4;
    }

    /* JADX INFO: renamed from: a */
    public void mo94375a(C30722l0 c30722l0, C30707e c30707e) {
        JsonAdapter[] jsonAdapterArr = this.f126446f;
        if (jsonAdapterArr.length > 0) {
            Method method = this.f126444d;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = genericParameterTypes.length;
            int i13 = this.f126445e;
            for (int i14 = i13; i14 < length; i14++) {
                Type type = ((ParameterizedType) genericParameterTypes[i14]).getActualTypeArguments()[0];
                Set setM99128f = AbstractC31885f.m99128f(parameterAnnotations[i14]);
                jsonAdapterArr[i14 - i13] = (AbstractC1772c1.m5398p(this.f126441a, type) && this.f126442b.equals(setM99128f)) ? c30722l0.m94401d(c30707e, type, setM99128f) : c30722l0.m94400c(type, setM99128f, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Object mo94360b(JsonReader jsonReader) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: c */
    public final Object m94381c(Object obj) {
        JsonAdapter[] jsonAdapterArr = this.f126446f;
        Object[] objArr = new Object[jsonAdapterArr.length + 1];
        objArr[0] = obj;
        System.arraycopy(jsonAdapterArr, 0, objArr, 1, jsonAdapterArr.length);
        try {
            return this.f126444d.invoke(this.f126443c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo94361d(AbstractC30704c0 abstractC30704c0, Object obj) {
        throw new AssertionError();
    }
}
