package p027b3;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.l1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2403l1 implements InterfaceC2398k1 {

    /* JADX INFO: renamed from: b */
    public static final C2403l1 f9454b = new C2403l1(0);

    /* JADX INFO: renamed from: c */
    public static final C2403l1 f9455c = new C2403l1(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9456a;

    public /* synthetic */ C2403l1(int i13) {
        this.f9456a = i13;
    }

    @Override // p027b3.InterfaceC2398k1
    /* JADX INFO: renamed from: a */
    public final Rect mo7396a(Activity activity) throws Exception {
        DisplayCutout displayCutout = null;
        switch (this.f9456a) {
            case 0:
                Rect rect = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                        rect.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        AbstractC22676k.m65748h(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                        rect.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e5) {
                    if (!(e5 instanceof NoSuchFieldException) && !(e5 instanceof NoSuchMethodException) && !(e5 instanceof IllegalAccessException) && !(e5 instanceof InvocationTargetException)) {
                        throw e5;
                    }
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                }
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i13 = rect.bottom + dimensionPixelSize;
                    if (i13 == point.y) {
                        rect.bottom = i13;
                    } else {
                        int i14 = rect.right + dimensionPixelSize;
                        if (i14 == point.x) {
                            rect.right = i14;
                        } else if (rect.left == dimensionPixelSize) {
                            rect.left = 0;
                        }
                    }
                }
                if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (obj2 instanceof DisplayCutout) {
                            displayCutout = (DisplayCutout) obj2;
                        }
                    } catch (Exception e13) {
                        if (!(e13 instanceof ClassNotFoundException) && !(e13 instanceof NoSuchMethodException) && !(e13 instanceof NoSuchFieldException) && !(e13 instanceof IllegalAccessException) && !(e13 instanceof InvocationTargetException) && !(e13 instanceof InstantiationException)) {
                            throw e13;
                        }
                    }
                    if (displayCutout != null) {
                        if (rect.left == displayCutout.getSafeInsetLeft()) {
                            rect.left = 0;
                        }
                        if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                            rect.right = displayCutout.getSafeInsetRight() + rect.right;
                        }
                        if (rect.top == displayCutout.getSafeInsetTop()) {
                            rect.top = 0;
                        }
                        if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                            rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                        }
                    }
                }
                return rect;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object objInvoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    AbstractC22676k.m65748h(objInvoke3, "null cannot be cast to non-null type android.graphics.Rect");
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e14) {
                    if ((e14 instanceof NoSuchFieldException) || (e14 instanceof NoSuchMethodException) || (e14 instanceof IllegalAccessException) || (e14 instanceof InvocationTargetException)) {
                        return f9454b.mo7396a(activity);
                    }
                    throw e14;
                }
        }
    }
}
