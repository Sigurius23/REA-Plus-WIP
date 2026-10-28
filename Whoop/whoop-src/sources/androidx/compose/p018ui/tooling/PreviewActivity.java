package androidx.compose.p018ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b30.C2577m6;
import b93.C2892a;
import java.lang.reflect.Constructor;
import p161g.AbstractActivityC14909l;
import p163g1.C15001f;
import p179h.AbstractC16348f;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Lg/l;", "<init>", "()V", "ui-tooling"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PreviewActivity extends AbstractActivityC14909l {

    /* JADX INFO: renamed from: w */
    public final String f4987w = "PreviewActivity";

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i13 = getApplicationInfo().flags & 2;
        String str = this.f4987w;
        if (i13 == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String strM125864J0 = AbstractC39414r.m125864J0('.', stringExtra, stringExtra);
        String strM125860F0 = AbstractC39414r.m125860F0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strM125860F0 + "' without a parameter provider.");
            AbstractC16348f.m46559a(this, new C37816b(new C2577m6(strM125864J0, strM125860F0, 2), true, -840626948));
            return;
        }
        Log.d(str, "Previewing '" + strM125860F0 + "' with parameter provider: '" + stringExtra2 + '\'');
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e5) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e5);
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        int i14 = 0;
        if (cls == null) {
            AbstractC16348f.m46559a(this, new C37816b(new C15001f(strM125864J0, strM125860F0, new Object[0], 13), true, -1901447514));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z4 = false;
            while (true) {
                if (i14 >= length) {
                    if (z4) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i14];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z4) {
                            z4 = true;
                            constructor = constructor2;
                        }
                    }
                    i14++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            AbstractC22676k.m65748h(constructor.newInstance(null), "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            throw new ClassCastException();
        } catch (C2892a unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
