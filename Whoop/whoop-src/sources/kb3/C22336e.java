package kb3;

import androidx.lifecycle.C1591h2;
import java.util.concurrent.ConcurrentHashMap;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kb3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C22336e extends C1591h2 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f87172E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22336e(C22342k c22342k, ConcurrentHashMap concurrentHashMap, Function1 function1, int i13) {
        super(c22342k, concurrentHashMap, function1, 1);
        this.f87172E = i13;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m64219a(int i13) {
        String str = i13 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 3 ? 3 : 2];
        if (i13 == 1) {
            objArr[0] = "map";
        } else if (i13 == 2) {
            objArr[0] = "computation";
        } else if (i13 != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i13 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i13 == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i13 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 == 3) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // androidx.lifecycle.C1591h2, p715kotlin.jvm.functions.Function1
    public Object invoke(Object obj) throws Throwable {
        switch (this.f87172E) {
            case 1:
                Object objInvoke = super.invoke(obj);
                if (objInvoke != null) {
                    return objInvoke;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.invoke(obj);
        }
    }
}
