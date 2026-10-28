package p441qx;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qx.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C30724m0 implements InterfaceC30735s {
    @Override // p441qx.InterfaceC30735s
    public final JsonAdapter create(Type type, Set set, C30722l0 c30722l0) {
        Type[] typeArrM5368E;
        AbstractC22676k.m65747g(set);
        if (!set.isEmpty()) {
            return null;
        }
        Class clsM5407z = AbstractC1772c1.m5407z(type);
        if (!AbstractC22676k.m65745e(clsM5407z, Map.class) || (typeArrM5368E = AbstractC1772c1.m5368E(type, clsM5407z)) == null) {
            return null;
        }
        Type type2 = typeArrM5368E[0];
        AbstractC22676k.m65749i(type2, "get(...)");
        Type type3 = typeArrM5368E[1];
        AbstractC22676k.m65749i(type3, "get(...)");
        return new C30726n0(c30722l0, type2, type3).nullSafe();
    }
}
