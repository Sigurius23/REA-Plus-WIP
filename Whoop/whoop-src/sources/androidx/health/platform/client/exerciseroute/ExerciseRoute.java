package androidx.health.platform.client.exerciseroute;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1518r;
import p486sp.C32854e;
import p575w7.AbstractC36868a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/health/platform/client/exerciseroute/ExerciseRoute;", "Lw7/a;", "Landroidx/health/platform/client/proto/r;", "connect-client_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class ExerciseRoute extends AbstractC36868a {
    public static final Parcelable.Creator<ExerciseRoute> CREATOR = new C32854e(20);

    /* JADX INFO: renamed from: x */
    public final C1518r f6010x;

    public ExerciseRoute(C1518r c1518r) {
        this.f6010x = c1518r;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        return this.f6010x;
    }
}
