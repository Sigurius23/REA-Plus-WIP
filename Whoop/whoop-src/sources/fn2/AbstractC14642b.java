package fn2;

import android.content.Context;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fn2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)Z", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14642b {
    /* JADX INFO: renamed from: a */
    public static final boolean m41842a(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }
}
