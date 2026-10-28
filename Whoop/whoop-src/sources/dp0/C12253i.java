package dp0;

import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import ep0.C13398d;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: dp0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u0003J\u0019\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020'0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001c\u00103\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Ldp0/i;", "Ldp0/g;", "<init>", "()V", "Lh2/b;", "fabPosition", "", "bottomNavTab", "Lep0/j;", "overrideContext", "Ll83/a0;", "g", "(JLjava/lang/String;Lep0/j;)V", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "aiContextMetadata", "q", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lq83/d;)Ljava/lang/Object;", "", "fabVisible", "context", "t", "(ZLep0/j;)V", "screenContextKey", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)V", "o", "()Z", "fingerprint", "r", "d", "u", "s", "Lj02/m0;", HMSTrackSource.SCREEN, "z", "(Lj02/m0;)V", "Lec3/p1;", "Lep0/d;", "b", "Lec3/p1;", "emptyState", "Lec3/f2;", "Lec3/f2;", "getState", "()Lec3/f2;", "state", "Lj02/m0;", "y", "()Lj02/m0;", "lastNavigatedScreen", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12253i implements InterfaceC12251g {

    /* JADX INFO: renamed from: a */
    public static final C12253i f40998a = new C12253i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC13075p1 emptyState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final AbstractC21155m0 lastNavigatedScreen = null;

    /* JADX INFO: renamed from: e */
    public static final int f41002e;

    static {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C13398d(false, false, 0L, null, null, null, null, 0.0f, 255, null));
        emptyState = c13045h2M36593c;
        state = c13045h2M36593c;
        f41002e = 8;
    }

    private C12253i() {
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: a */
    public /* bridge */ void mo34134a(float f13) {
        super.mo34134a(f13);
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: c */
    public void mo34135c() {
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: d */
    public void mo34136d() {
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: g */
    public void mo34137g(long fabPosition, String bottomNavTab, C13404j overrideContext) {
    }

    @Override // dp0.InterfaceC12251g
    public InterfaceC13037f2 getState() {
        return state;
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: h */
    public void mo34138h(String screenContextKey) {
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: i */
    public /* bridge */ void mo34139i(String str) {
        super.mo34139i(str);
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: m */
    public /* bridge */ void mo34140m() {
        super.mo34140m();
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: o */
    public boolean mo34141o() {
        return false;
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: q */
    public Object mo34142q(AiContextMetadataBottomRow aiContextMetadataBottomRow, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: r */
    public void mo34143r(String fingerprint) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: s */
    public void mo34144s() {
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: t */
    public void mo34145t(boolean fabVisible, C13404j context) {
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: u */
    public void mo34146u() {
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: w */
    public void mo34147w() {
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: x */
    public /* bridge */ void mo34148x() {
        super.mo34148x();
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: y */
    public AbstractC21155m0 mo34149y() {
        return lastNavigatedScreen;
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: z */
    public void mo34150z(AbstractC21155m0 screen) {
    }
}
