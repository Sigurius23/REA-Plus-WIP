package j43;

import c13.AbstractC3855a;
import d43.C11701a;
import io.getstream.video.android.core.notifications.internal.service.CallService;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j43.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C21319c {

    /* JADX INFO: renamed from: a */
    public final boolean f81521a;

    /* JADX INFO: renamed from: b */
    public final int f81522b;

    /* JADX INFO: renamed from: c */
    public final Map f81523c;

    /* JADX INFO: renamed from: d */
    public final Class f81524d;

    /* JADX INFO: renamed from: e */
    public final boolean f81525e;

    /* JADX INFO: renamed from: f */
    public final C11701a f81526f;

    public C21319c(boolean z4, int i13, Map map, Class serviceClass, boolean z13, C11701a moderationConfig) {
        AbstractC22676k.m65750j(serviceClass, "serviceClass");
        AbstractC22676k.m65750j(moderationConfig, "moderationConfig");
        this.f81521a = z4;
        this.f81522b = i13;
        this.f81523c = map;
        this.f81524d = serviceClass;
        this.f81525e = z13;
        this.f81526f = moderationConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21319c)) {
            return false;
        }
        C21319c c21319c = (C21319c) obj;
        return this.f81521a == c21319c.f81521a && this.f81522b == c21319c.f81522b && AbstractC22676k.m65745e(this.f81523c, c21319c.f81523c) && AbstractC22676k.m65745e(this.f81524d, c21319c.f81524d) && this.f81525e == c21319c.f81525e && AbstractC22676k.m65745e(this.f81526f, c21319c.f81526f);
    }

    public final int hashCode() {
        return this.f81526f.hashCode() + AbstractC2875y.m8289b((this.f81524d.hashCode() + AbstractC3855a.m11821e(this.f81523c, AbstractC11266d.m30448b(this.f81522b, Boolean.hashCode(this.f81521a) * 31, 31), 31)) * 31, 31, this.f81525e);
    }

    public final String toString() {
        return "CallServiceConfig(runCallServiceInForeground=" + this.f81521a + ", audioUsage=" + this.f81522b + ", callServicePerType=" + this.f81523c + ", serviceClass=" + this.f81524d + ", enableTelecom=" + this.f81525e + ", moderationConfig=" + this.f81526f + ")";
    }

    public /* synthetic */ C21319c(boolean z4, int i13, Class cls, boolean z13, C11701a c11701a, int i14) {
        this((i14 & 1) != 0 ? true : z4, (i14 & 2) != 0 ? 2 : i13, AbstractC25247g0.m73989X(new C23465k("ALL_CALL_TYPES", CallService.class)), (i14 & 8) != 0 ? CallService.class : cls, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? new C11701a() : c11701a);
    }
}
