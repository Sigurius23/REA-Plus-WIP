package p474s;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: s.c1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31942c1 {

    /* JADX INFO: renamed from: a */
    public static final boolean f132639a;

    /* JADX INFO: renamed from: b */
    public static final Method f132640b;

    /* JADX INFO: renamed from: c */
    public static final Field f132641c;

    /* JADX INFO: renamed from: d */
    public static final Field f132642d;

    /* JADX INFO: renamed from: e */
    public static final Field f132643e;

    /* JADX INFO: renamed from: f */
    public static final Field f132644f;

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z4;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z4 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z4 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                        f132640b = method;
                        f132641c = field;
                        f132642d = field2;
                        f132643e = field3;
                        f132644f = field4;
                        f132639a = true;
                        return;
                    }
                    f132640b = null;
                    f132641c = null;
                    f132642d = null;
                    f132643e = null;
                    f132644f = null;
                    f132639a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                        f132640b = method;
                        f132641c = field;
                        f132642d = field2;
                        f132643e = field3;
                        f132644f = field4;
                        f132639a = true;
                        return;
                    }
                    f132640b = null;
                    f132641c = null;
                    f132642d = null;
                    f132643e = null;
                    f132644f = null;
                    f132639a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z4 = false;
                    if (z4) {
                        f132640b = method;
                        f132641c = field;
                        f132642d = field2;
                        f132643e = field3;
                        f132644f = field4;
                        f132639a = true;
                        return;
                    }
                    f132640b = null;
                    f132641c = null;
                    f132642d = null;
                    f132643e = null;
                    f132644f = null;
                    f132639a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                    f132640b = method;
                    f132641c = field;
                    f132642d = field2;
                    f132643e = field3;
                    f132644f = field4;
                    f132639a = true;
                    return;
                }
                f132640b = null;
                f132641c = null;
                f132642d = null;
                f132643e = null;
                f132644f = null;
                f132639a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                    f132640b = method;
                    f132641c = field;
                    f132642d = field2;
                    f132643e = field3;
                    f132644f = field4;
                    f132639a = true;
                    return;
                }
                f132640b = null;
                f132641c = null;
                f132642d = null;
                f132643e = null;
                f132644f = null;
                f132639a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z4 = false;
                if (z4) {
                    f132640b = method;
                    f132641c = field;
                    f132642d = field2;
                    f132643e = field3;
                    f132644f = field4;
                    f132639a = true;
                    return;
                }
                f132640b = null;
                f132641c = null;
                f132642d = null;
                f132643e = null;
                f132644f = null;
                f132639a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z4) {
            f132640b = method;
            f132641c = field;
            f132642d = field2;
            f132643e = field3;
            f132644f = field4;
            f132639a = true;
            return;
        }
        f132640b = null;
        f132641c = null;
        f132642d = null;
        f132643e = null;
        f132644f = null;
        f132639a = false;
    }

    /* JADX INFO: renamed from: a */
    public static Rect m99421a(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && f132639a) {
            try {
                Object objInvoke = f132640b.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(f132641c.getInt(objInvoke), f132642d.getInt(objInvoke), f132643e.getInt(objInvoke), f132644f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return AbstractC31950e1.f132662c;
    }
}
