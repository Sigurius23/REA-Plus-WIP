package in2;

import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: in2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0003*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0005\u001a\u001b\u0010\u0011\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, m65681d2 = {"Landroid/content/Context;", "", "messageId", "Ll83/a0;", "c", "(Landroid/content/Context;I)V", "", "message", "d", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "Landroidx/fragment/app/m0;", "b", "(Landroidx/fragment/app/m0;Ljava/lang/CharSequence;)Ll83/a0;", "a", "(Landroidx/fragment/app/m0;I)Ll83/a0;", "e", "f", "g", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18737i {
    /* JADX INFO: renamed from: a */
    public static final C23454a0 m54476a(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        Context context = abstractComponentCallbacksC1320m0.getContext();
        if (context == null) {
            return null;
        }
        m54478c(context, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public static final C23454a0 m54477b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, CharSequence message) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        AbstractC22676k.m65750j(message, "message");
        Context context = abstractComponentCallbacksC1320m0.getContext();
        if (context == null) {
            return null;
        }
        m54479d(context, message);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m54478c(Context context, int i13) {
        Toast.makeText(context, context != null ? context.getString(i13) : null, 1).show();
    }

    /* JADX INFO: renamed from: d */
    public static final void m54479d(Context context, CharSequence message) {
        AbstractC22676k.m65750j(message, "message");
        if (context != null) {
            Toast.makeText(context, message, 1).show();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C23454a0 m54480e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, CharSequence message) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        AbstractC22676k.m65750j(message, "message");
        Context context = abstractComponentCallbacksC1320m0.getContext();
        if (context == null) {
            return null;
        }
        m54482g(context, message);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m54481f(Context context, int i13) {
        if (context != null) {
            Toast.makeText(context, context.getString(i13), 0).show();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m54482g(Context context, CharSequence message) {
        AbstractC22676k.m65750j(message, "message");
        if (context != null) {
            Toast.makeText(context, message, 0).show();
        }
    }
}
