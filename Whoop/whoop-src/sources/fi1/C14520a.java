package fi1;

import com.whoop.gps.foreground.upload.ForegroundGpsUploadWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.C23465k;
import m83.AbstractC25265s;
import p024b0.C2178b;
import p088dc.AbstractC11895b;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fi1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lfi1/a;", "", "Lic/p0;", "workManager", "<init>", "(Lic/p0;)V", "", "sessionStartTimeMs", "", "b", "(J)Ljava/lang/String;", "sessionEndTimeMs", "Ll83/a0;", "a", "(JJ)V", "Lic/p0;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14520a {

    /* JADX INFO: renamed from: b */
    private static final a f53054b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f53055c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: fi1.a$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lfi1/a$a;", "", "<init>", "()V", "", "WORK_NAME_PREFIX", "Ljava/lang/String;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C14520a(AbstractC18377p0 workManager) {
        AbstractC22676k.m65750j(workManager, "workManager");
        this.workManager = workManager;
    }

    /* JADX INFO: renamed from: b */
    private final String m41436b(long sessionStartTimeMs) {
        return AbstractC11895b.m31994m(sessionStartTimeMs, "foreground-gps-upload-");
    }

    /* JADX INFO: renamed from: a */
    public final void m41437a(long sessionStartTimeMs, long sessionEndTimeMs) {
        C18392z c18392z = new C18392z(ForegroundGpsUploadWorker.class);
        C23465k[] c23465kArr = {new C23465k("sessionStartTimeMs", Long.valueOf(sessionStartTimeMs)), new C23465k("sessionEndTimeMs", Long.valueOf(sessionEndTimeMs))};
        C2178b c2178b = new C2178b(1);
        for (int i13 = 0; i13 < 2; i13++) {
            C23465k c23465k = c23465kArr[i13];
            c2178b.m6858d(c23465k.f92938x, (String) c23465k.f92937w);
        }
        C18392z c18392z2 = (C18392z) ((C18392z) c18392z.m52882h(c2178b.m6856b())).m52877a("ForegroundGpsUploadWorker");
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.workManager.m52876e(m41436b(sessionStartTimeMs), EnumC18368l.f71504x, (C18347a0) ((C18392z) ((C18392z) c18392z2.m52880f(new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet)))).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b());
    }
}
