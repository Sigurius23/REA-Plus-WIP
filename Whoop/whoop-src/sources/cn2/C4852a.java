package cn2;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cn2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcn2/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "dip", "a", "(Landroid/content/Context;I)I", "b", "(ILandroid/content/Context;)I", "legacy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4852a {

    /* JADX INFO: renamed from: a */
    public static final C4852a f20172a = new C4852a();

    private C4852a() {
    }

    /* JADX INFO: renamed from: a */
    public static final int m15490a(Context context, int dip) {
        Resources resources;
        return (int) TypedValue.applyDimension(1, dip, (context == null || (resources = context.getResources()) == null) ? null : resources.getDisplayMetrics());
    }

    /* JADX INFO: renamed from: b */
    public final int m15491b(int i13, Context context) {
        AbstractC22676k.m65750j(context, "context");
        return (int) TypedValue.applyDimension(1, i13, context.getResources().getDisplayMetrics());
    }
}
