package p114eb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.whoop.android.R;
import java.lang.ref.WeakReference;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12944c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C12944c f44712E;

    /* JADX INFO: renamed from: F */
    public static final C12944c f44713F;

    /* JADX INFO: renamed from: G */
    public static final C12944c f44714G;

    /* JADX INFO: renamed from: H */
    public static final C12944c f44715H;

    /* JADX INFO: renamed from: x */
    public static final C12944c f44716x;

    /* JADX INFO: renamed from: y */
    public static final C12944c f44717y;

    /* JADX INFO: renamed from: z */
    public static final C12944c f44718z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44719w;

    static {
        int i13 = 1;
        f44716x = new C12944c(i13, 0);
        f44717y = new C12944c(i13, 1);
        f44718z = new C12944c(i13, 2);
        f44712E = new C12944c(i13, 3);
        f44713F = new C12944c(i13, 4);
        f44714G = new C12944c(i13, 5);
        f44715H = new C12944c(i13, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12944c(int i13, int i14) {
        super(i13);
        this.f44719w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44719w) {
            case 0:
                Context it = (Context) obj;
                AbstractC22676k.m65750j(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 1:
                Context it3 = (Context) obj;
                AbstractC22676k.m65750j(it3, "it");
                if (it3 instanceof ContextWrapper) {
                    return ((ContextWrapper) it3).getBaseContext();
                }
                return null;
            case 2:
                Context it4 = (Context) obj;
                AbstractC22676k.m65750j(it4, "it");
                ContextWrapper contextWrapper = it4 instanceof ContextWrapper ? (ContextWrapper) it4 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 3:
                Context it5 = (Context) obj;
                AbstractC22676k.m65750j(it5, "it");
                if (it5 instanceof Activity) {
                    return (Activity) it5;
                }
                return null;
            case 4:
                C12977n0 it6 = (C12977n0) obj;
                AbstractC22676k.m65750j(it6, "it");
                return it6.f44823x;
            case 5:
                View it7 = (View) obj;
                AbstractC22676k.m65750j(it7, "it");
                Object parent = it7.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View it8 = (View) obj;
                AbstractC22676k.m65750j(it8, "it");
                Object tag = it8.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (AbstractC12939a0) ((WeakReference) tag).get();
                }
                if (tag instanceof AbstractC12939a0) {
                    return (AbstractC12939a0) tag;
                }
                return null;
        }
    }
}
