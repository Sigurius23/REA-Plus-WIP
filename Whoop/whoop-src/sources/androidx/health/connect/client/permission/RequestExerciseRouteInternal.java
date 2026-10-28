package androidx.health.connect.client.permission;

import android.content.Context;
import android.content.Intent;
import androidx.health.platform.client.exerciseroute.ExerciseRoute;
import androidx.health.platform.client.proto.C1454e0;
import androidx.health.platform.client.proto.C1464g0;
import androidx.health.platform.client.proto.InterfaceC1544w0;
import java.time.Instant;
import java.util.ArrayList;
import m83.AbstractC25267u;
import p267k.AbstractC22081b;
import p322m7.C25167q;
import p322m7.C25169r;
import p452r7.C31022l;
import p452r7.C31036s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroidx/health/connect/client/permission/RequestExerciseRouteInternal;", "Lk/b;", "", "Lm7/r;", "<init>", "()V", "connect-client_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class RequestExerciseRouteInternal extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        String input = (String) obj;
        AbstractC22676k.m65750j(input, "input");
        if (input.length() <= 0) {
            throw new IllegalArgumentException("Session identifier can't be empty");
        }
        Intent intent = new Intent("androidx.health.action.REQUEST_EXERCISE_ROUTE");
        intent.putExtra("androidx.health.connect.extra.SESSION_ID", input);
        return intent;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        C31036s c31036sM95556a;
        C31036s c31036sM95556a2;
        C31036s c31036sM95556a3;
        ExerciseRoute exerciseRoute = intent != null ? (ExerciseRoute) intent.getParcelableExtra("android.health.connect.extra.EXERCISE_ROUTE") : null;
        if (exerciseRoute == null) {
            AbstractC37978j.m121657r("HealthConnectClient", "No route returned.");
            return null;
        }
        AbstractC37978j.m121657r("HealthConnectClient", "Returned a route.");
        InterfaceC1544w0<C1454e0> interfaceC1544w0M4812r = exerciseRoute.f6010x.m4812r();
        AbstractC22676k.m65749i(interfaceC1544w0M4812r, "protoWrapper.proto.valuesList");
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(interfaceC1544w0M4812r, 10));
        for (C1454e0 c1454e0 : interfaceC1544w0M4812r) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(c1454e0.m4592t());
            Object obj = c1454e0.m4593u().get("latitude");
            AbstractC22676k.m65747g(obj);
            double dM4620w = ((C1464g0) obj).m4620w();
            Object obj2 = c1454e0.m4593u().get("longitude");
            AbstractC22676k.m65747g(obj2);
            double dM4620w2 = ((C1464g0) obj2).m4620w();
            C1464g0 c1464g0 = (C1464g0) c1454e0.m4593u().get("altitude");
            if (c1464g0 != null) {
                double dM4620w3 = c1464g0.m4620w();
                C31022l c31022l = C31036s.f128022y;
                c31036sM95556a = C31022l.m95556a(dM4620w3);
            } else {
                c31036sM95556a = null;
            }
            C1464g0 c1464g1 = (C1464g0) c1454e0.m4593u().get("horizontal_accuracy");
            if (c1464g1 != null) {
                double dM4620w4 = c1464g1.m4620w();
                C31022l c31022l2 = C31036s.f128022y;
                c31036sM95556a2 = C31022l.m95556a(dM4620w4);
            } else {
                c31036sM95556a2 = null;
            }
            C1464g0 c1464g2 = (C1464g0) c1454e0.m4593u().get("vertical_accuracy");
            if (c1464g2 != null) {
                double dM4620w5 = c1464g2.m4620w();
                C31022l c31022l3 = C31036s.f128022y;
                c31036sM95556a3 = C31022l.m95556a(dM4620w5);
            } else {
                c31036sM95556a3 = null;
            }
            AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(value.startTimeMillis)");
            arrayList.add(new C25167q(instantOfEpochMilli, dM4620w, dM4620w2, c31036sM95556a2, c31036sM95556a3, c31036sM95556a));
        }
        return new C25169r(arrayList);
    }
}
