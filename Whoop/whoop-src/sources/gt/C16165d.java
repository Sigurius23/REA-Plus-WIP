package gt;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p098dt.C12355g;
import p533ut.C35228b;
import st.InterfaceC32956a;

/* JADX INFO: renamed from: gt.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16165d implements InterfaceC32956a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f61436b;

    public /* synthetic */ C16165d(Object obj, int i13) {
        this.f61435a = i13;
        this.f61436b = obj;
    }

    @Override // st.InterfaceC32956a
    public final Object get() {
        switch (this.f61435a) {
            case 0:
                String str = (String) this.f61436b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e5) {
                    throw new InvalidRegistrarException(AbstractC11895b.m31996o("Could not instantiate ", str, "."), e5);
                } catch (InstantiationException e13) {
                    throw new InvalidRegistrarException(AbstractC11895b.m31996o("Could not instantiate ", str, "."), e13);
                } catch (NoSuchMethodException e14) {
                    throw new InvalidRegistrarException(AbstractC11266d.m30461o("Could not instantiate ", str), e14);
                } catch (InvocationTargetException e15) {
                    throw new InvalidRegistrarException(AbstractC11266d.m30461o("Could not instantiate ", str), e15);
                }
            case 1:
                return (ComponentRegistrar) this.f61436b;
            default:
                return new C35228b((C12355g) this.f61436b);
        }
    }
}
