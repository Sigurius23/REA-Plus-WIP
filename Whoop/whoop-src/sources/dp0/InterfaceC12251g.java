package dp0;

import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow;
import ec3.InterfaceC13037f2;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: dp0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\bH&¢\u0006\u0004\b \u0010\fJ\u0019\u0010!\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH&¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\bH&¢\u0006\u0004\b'\u0010\fJ\u0019\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H&¢\u0006\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064À\u0006\u0003"}, m65681d2 = {"Ldp0/g;", "", "Lh2/b;", "fabPosition", "", "bottomNavTab", "Lep0/j;", "overrideContext", "Ll83/a0;", "g", "(JLjava/lang/String;Lep0/j;)V", "c", "()V", "x", "m", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "aiContextMetadata", "q", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lq83/d;)Ljava/lang/Object;", "", "fabVisible", "context", "t", "(ZLep0/j;)V", "screenContextKey", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)V", "o", "()Z", "fingerprint", "r", "d", "i", "", "clearancePx", "a", "(F)V", "u", "s", "Lj02/m0;", HMSTrackSource.SCREEN, "z", "(Lj02/m0;)V", "Lec3/f2;", "Lep0/d;", "getState", "()Lec3/f2;", "state", "y", "()Lj02/m0;", "lastNavigatedScreen", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12251g {
    /* JADX INFO: renamed from: A */
    static /* synthetic */ void m34131A(InterfaceC12251g interfaceC12251g, String str, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearScreenContext");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        interfaceC12251g.mo34138h(str);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m34132f(InterfaceC12251g interfaceC12251g, long j7, String str, C13404j c13404j, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBottomSheet-9KIMszo");
        }
        if ((i13 & 1) != 0) {
            j7 = 0;
        }
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            c13404j = null;
        }
        interfaceC12251g.mo34137g(j7, str, c13404j);
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ void m34133k(InterfaceC12251g interfaceC12251g, boolean z4, C13404j c13404j, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setScreenContext");
        }
        if ((i13 & 2) != 0) {
            c13404j = null;
        }
        interfaceC12251g.mo34145t(z4, c13404j);
    }

    /* JADX INFO: renamed from: a */
    default void mo34134a(float clearancePx) {
    }

    /* JADX INFO: renamed from: c */
    void mo34135c();

    /* JADX INFO: renamed from: d */
    void mo34136d();

    /* JADX INFO: renamed from: g */
    void mo34137g(long fabPosition, String bottomNavTab, C13404j overrideContext);

    InterfaceC13037f2 getState();

    /* JADX INFO: renamed from: h */
    void mo34138h(String screenContextKey);

    /* JADX INFO: renamed from: i */
    default void mo34139i(String bottomNavTab) {
    }

    /* JADX INFO: renamed from: m */
    default void mo34140m() {
    }

    /* JADX INFO: renamed from: o */
    boolean mo34141o();

    /* JADX INFO: renamed from: q */
    Object mo34142q(AiContextMetadataBottomRow aiContextMetadataBottomRow, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: r */
    void mo34143r(String fingerprint);

    /* JADX INFO: renamed from: s */
    void mo34144s();

    /* JADX INFO: renamed from: t */
    void mo34145t(boolean fabVisible, C13404j context);

    /* JADX INFO: renamed from: u */
    void mo34146u();

    /* JADX INFO: renamed from: w */
    void mo34147w();

    /* JADX INFO: renamed from: x */
    default void mo34148x() {
    }

    /* JADX INFO: renamed from: y */
    AbstractC21155m0 mo34149y();

    /* JADX INFO: renamed from: z */
    void mo34150z(AbstractC21155m0 screen);
}
