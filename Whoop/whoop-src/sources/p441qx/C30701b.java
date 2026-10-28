package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: qx.b */
/* JADX INFO: loaded from: classes.dex */
public final class C30701b extends AbstractC30705d {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f126423h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30701b(Type type, Set set, Object obj, Method method, int i13, int i14, boolean z4, int i15) {
        super(type, set, obj, method, i13, i14, z4);
        this.f126423h = i15;
    }

    @Override // p441qx.AbstractC30705d
    /* JADX INFO: renamed from: b */
    public Object mo94360b(JsonReader jsonReader) {
        switch (this.f126423h) {
            case 1:
                return m94381c(jsonReader);
            default:
                return super.mo94360b(jsonReader);
        }
    }

    @Override // p441qx.AbstractC30705d
    /* JADX INFO: renamed from: d */
    public void mo94361d(AbstractC30704c0 abstractC30704c0, Object obj) throws InvocationTargetException {
        switch (this.f126423h) {
            case 0:
                JsonAdapter[] jsonAdapterArr = this.f126446f;
                Object[] objArr = new Object[jsonAdapterArr.length + 2];
                objArr[0] = abstractC30704c0;
                objArr[1] = obj;
                System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
                try {
                    this.f126444d.invoke(this.f126443c, objArr);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                }
            default:
                super.mo94361d(abstractC30704c0, obj);
                return;
        }
    }
}
