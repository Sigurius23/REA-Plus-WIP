package androidx.health.connect.client.permission.platform;

import android.content.Context;
import android.content.Intent;
import android.health.connect.datatypes.ExerciseRoute;
import p027b3.AbstractC2378g1;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroidx/health/connect/client/permission/platform/RequestExerciseRouteUpsideDownCake;", "Lk/b;", "", "Lm7/r;", "<init>", "()V", "connect-client_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class RequestExerciseRouteUpsideDownCake extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        String input = (String) obj;
        AbstractC22676k.m65750j(input, "input");
        if (input.length() <= 0) {
            throw new IllegalArgumentException("Session identifier can't be empty");
        }
        Intent intent = new Intent("android.health.connect.action.REQUEST_EXERCISE_ROUTE");
        intent.putExtra("android.health.connect.extra.SESSION_ID", input);
        return intent;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        ExerciseRoute exerciseRoute = intent != null ? (ExerciseRoute) intent.getParcelableExtra("android.health.connect.extra.EXERCISE_ROUTE", ExerciseRoute.class) : null;
        if (exerciseRoute == null) {
            AbstractC37978j.m121657r("HealthConnectClient", "No route returned.");
            return null;
        }
        AbstractC37978j.m121657r("HealthConnectClient", "Returned a route.");
        return AbstractC2378g1.m7321I(exerciseRoute);
    }
}
