package cs2;

import com.whoop.data.repositories.FeatureFlagChecker;
import fs2.EnumC14748a;
import ge3.AbstractC15751g;
import iy1.InterfaceC21030c;
import java.util.List;
import jy1.C22047a;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cs2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u001d\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!¨\u0006\""}, m65681d2 = {"Lcs2/a;", "", "Liy1/c;", "metricWriter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcs2/a$c;", "provider", "<init>", "(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcs2/a$c;)V", "", "name", "", "tags", "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/util/List;)V", "", "success", "Lcs2/a$b;", "failure", "e", "(ZLcs2/a$b;)V", "c", "(Z)V", "d", "()V", "Lfs2/a;", "reason", "b", "(Lfs2/a;)V", "Liy1/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lcs2/a$c;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11104a {

    /* JADX INFO: renamed from: e */
    public static final int f35298e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final c provider;

    /* JADX INFO: renamed from: cs2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lcs2/a$b;", "", "", "tag", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "TOKEN_FETCH", "INVALID_CREDENTIALS", "SDK_INIT", "CONNECT", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        TOKEN_FETCH("token_fetch"),
        INVALID_CREDENTIALS("invalid_credentials"),
        SDK_INIT("sdk_init"),
        CONNECT("connect");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String tag;

        b(String str) {
            this.tag = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getTag() {
            return this.tag;
        }
    }

    /* JADX INFO: renamed from: cs2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lcs2/a$c;", "", "", "tag", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "STREAM", "HMS", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum c {
        STREAM("stream"),
        HMS("100ms");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String tag;

        c(String str) {
            this.tag = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getTag() {
            return this.tag;
        }
    }

    public C11104a(InterfaceC21030c metricWriter, FeatureFlagChecker featureFlagChecker, c provider) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(provider, "provider");
        this.metricWriter = metricWriter;
        this.featureFlagChecker = featureFlagChecker;
        this.provider = provider;
    }

    /* JADX INFO: renamed from: a */
    private final void m30028a(String name, List<String> tags) {
        if (this.featureFlagChecker.isFeatureEnabled("loop-video-call-observability")) {
            this.metricWriter.mo58701b(new C22047a(0, name, null, AbstractC25265s.m74129g1(AbstractC31061c.m95644t("provider:", this.provider.getTag()), tags), null, 21, null));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m30029f(C11104a c11104a, boolean z4, b bVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            bVar = null;
        }
        c11104a.m30033e(z4, bVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m30030b(EnumC14748a reason) {
        AbstractC22676k.m65750j(reason, "reason");
        m30028a("video_call.end", AbstractC31061c.m95644t("reason:", reason.getTag()));
    }

    /* JADX INFO: renamed from: c */
    public final void m30031c(boolean success) {
        m30028a("video_call.join", AbstractC37056f.m118958J("result:".concat(success ? "success" : "failure")));
    }

    /* JADX INFO: renamed from: d */
    public final void m30032d() {
        m30028a("video_call.reconnect", C25271y.f99162w);
    }

    /* JADX INFO: renamed from: e */
    public final void m30033e(boolean success, b failure) {
        String strConcat = "result:".concat(success ? "success" : "failure");
        String strM30461o = null;
        if (!success && failure != null) {
            strM30461o = AbstractC11266d.m30461o("reason:", failure.getTag());
        }
        m30028a("video_call.start", AbstractC25260n.m74077r0(new String[]{strConcat, strM30461o}));
    }
}
