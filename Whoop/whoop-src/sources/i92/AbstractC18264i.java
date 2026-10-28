package i92;

import ge3.AbstractC15751g;
import me3.C25480c;
import me3.EnumC25478a;
import vf3.C35953c;

/* JADX INFO: renamed from: i92.i */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC18264i {
    /* JADX INFO: renamed from: a */
    public static boolean m52615a() {
        return ((C25480c) AbstractC15751g.m44472y(C25480c.class, new C35953c("httpLoggingInterceptor"), null)).f99804z == EnumC25478a.f99799z;
    }

    /* JADX INFO: renamed from: b */
    public static void m52616b() {
        C25480c c25480c = (C25480c) AbstractC15751g.m44472y(C25480c.class, new C35953c("httpLoggingInterceptor"), null);
        EnumC25478a enumC25478a = c25480c.f99804z;
        EnumC25478a enumC25478a2 = EnumC25478a.f99799z;
        if (enumC25478a == enumC25478a2) {
            enumC25478a2 = EnumC25478a.f99797x;
        }
        c25480c.f99804z = enumC25478a2;
    }
}
