package androidx.health.connect.client.contracts;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.health.connect.client.permission.RequestExerciseRouteInternal;
import androidx.health.connect.client.permission.platform.RequestExerciseRouteUpsideDownCake;
import p267k.AbstractC22081b;
import p322m7.C25169r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroidx/health/connect/client/contracts/ExerciseRouteRequestContract;", "Lk/b;", "", "Lm7/r;", "<init>", "()V", "connect-client_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class ExerciseRouteRequestContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final AbstractC22081b f6006a;

    public ExerciseRouteRequestContract() {
        this.f6006a = Build.VERSION.SDK_INT >= 34 ? new RequestExerciseRouteUpsideDownCake() : new RequestExerciseRouteInternal();
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        String input = (String) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentCreateIntent = this.f6006a.createIntent(context, input);
        AbstractC22676k.m65749i(intentCreateIntent, "delegate.createIntent(context, input)");
        return intentCreateIntent;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        return (C25169r) this.f6006a.parseResult(i13, intent);
    }
}
