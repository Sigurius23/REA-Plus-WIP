package p197hj;

import java.util.Arrays;
import java.util.Map;
import m83.C25272z;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hj.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17319b {

    /* JADX INFO: renamed from: a */
    public final C17320c f67095a;

    /* JADX INFO: renamed from: b */
    public final Function1[] f67096b;

    public C17319b(String userId, String str, Function1[] function1Arr, Map userProperties, int i13) {
        str = (i13 & 2) != 0 ? null : str;
        function1Arr = (i13 & 4) != 0 ? new Function1[0] : function1Arr;
        userProperties = (i13 & 8) != 0 ? C25272z.f99163w : userProperties;
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userProperties, "userProperties");
        C17320c c17320c = new C17320c();
        c17320c.f67097a = userId;
        c17320c.f67098b = str;
        c17320c.f67099c = userProperties;
        this.f67095a = c17320c;
        this.f67096b = function1Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17319b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.amplitude.android.engagement.AmplitudeBootOptions");
        C17319b c17319b = (C17319b) obj;
        return AbstractC22676k.m65745e(this.f67095a, c17319b.f67095a) && Arrays.equals(this.f67096b, c17319b.f67096b);
    }

    public final int hashCode() {
        return (this.f67095a.hashCode() * 31) + Arrays.hashCode(this.f67096b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AmplitudeBootOptions(user=");
        sb4.append(this.f67095a);
        sb4.append(", integrations=");
        return AbstractC25012a.m73377j(sb4, Arrays.toString(this.f67096b), ')');
    }
}
