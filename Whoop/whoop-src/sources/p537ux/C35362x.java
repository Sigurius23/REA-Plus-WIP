package p537ux;

import android.content.Context;
import android.content.SharedPreferences;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ux.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C35362x {

    /* JADX INFO: renamed from: b */
    public static final String f150630b = C35363y.class.getCanonicalName();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f150631a;

    public C35362x(Context context) {
        AbstractC22676k.m65750j(context, "context");
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f150630b, 0);
        AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
        this.f150631a = sharedPreferences;
    }
}
