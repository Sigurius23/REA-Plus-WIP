package p072cp;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import p310lp.AbstractBinderC24628g;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: cp.b */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC10935b extends AbstractBinderC24628g implements InterfaceC10934a {

    /* JADX INFO: renamed from: f */
    public final Object f33827f;

    public BinderC10935b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f33827f = obj;
    }

    /* JADX INFO: renamed from: X */
    public static InterfaceC10934a m28986X(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC10934a ? (InterfaceC10934a) iInterfaceQueryLocalInterface : new C10940g(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    /* JADX INFO: renamed from: c0 */
    public static Object m28987c0(InterfaceC10934a interfaceC10934a) {
        if (interfaceC10934a instanceof BinderC10935b) {
            return ((BinderC10935b) interfaceC10934a).f33827f;
        }
        IBinder iBinderAsBinder = interfaceC10934a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i13 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i13++;
                field = field2;
            }
        }
        if (i13 != 1) {
            int length = declaredFields.length;
            StringBuilder sb4 = new StringBuilder(String.valueOf(length).length() + 53);
            sb4.append("Unexpected number of IObjectWrapper declared fields: ");
            sb4.append(length);
            throw new IllegalArgumentException(sb4.toString());
        }
        AbstractC35135w.m111094f(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e5);
        } catch (NullPointerException e13) {
            throw new IllegalArgumentException("Binder object is null.", e13);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static BinderC10935b m28988j0(Object obj) {
        return new BinderC10935b(obj);
    }
}
