package p314m;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import ih0.AbstractC18489d0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: m.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC24837e0 implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final View f97277w;

    /* JADX INFO: renamed from: x */
    public final String f97278x;

    /* JADX INFO: renamed from: y */
    public Method f97279y;

    /* JADX INFO: renamed from: z */
    public Context f97280z;

    public ViewOnClickListenerC24837e0(View view, String str) {
        this.f97277w = view;
        this.f97278x = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f97279y != null) {
            break;
        }
        View view2 = this.f97277w;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f97278x;
            if (context == null) {
                int id4 = view2.getId();
                if (id4 == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id4) + "'";
                }
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM53375p.append(view2.getClass());
                sbM53375p.append(str);
                throw new IllegalStateException(sbM53375p.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f97279y = method;
                    this.f97280z = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f97279y.invoke(this.f97280z, view);
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e5);
        } catch (InvocationTargetException e13) {
            throw new IllegalStateException("Could not execute method for android:onClick", e13);
        }
    }
}
