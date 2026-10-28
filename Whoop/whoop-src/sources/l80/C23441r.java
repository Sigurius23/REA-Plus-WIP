package l80;

import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import live.hms.video.media.tracks.HMSTrackSource;
import p114eb.C12969k0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: l80.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ll80/r;", "Lj02/k0;", "", "homeGraphStartDestinationId", "activationFragmentId", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(IILj02/i0;)V", "Lj02/m0$d;", HMSTrackSource.SCREEN, "a", "(Lj02/m0$d;)I", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "I", "b", "c", "Lj02/i0;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23441r implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: d */
    public static final int f92899d = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int homeGraphStartDestinationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int activationFragmentId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C23441r(int i13, int i14, C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.homeGraphStartDestinationId = i13;
        this.activationFragmentId = i14;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX INFO: renamed from: a */
    private final int m68005a(AbstractC21155m0.d screen) {
        Integer homeGraphStartDestinationId = screen.getHomeGraphStartDestinationId();
        if (homeGraphStartDestinationId != null) {
            return homeGraphStartDestinationId.intValue();
        }
        Integer numValueOf = Integer.valueOf(this.activationFragmentId);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.homeGraphStartDestinationId;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) throws UnsupportedEncodingException {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.d)) {
            return InterfaceC21149j0.d.f80241a;
        }
        StringBuilder sb4 = new StringBuilder();
        AbstractC21155m0.d dVar = (AbstractC21155m0.d) navigationScreen;
        sb4.append("android-app://com.whoop/activation?startScreen=" + dVar.getStartScreen());
        String source = dVar.getSource();
        if (source != null) {
            sb4.append("&source=" + URLEncoder.encode(source, StandardCharsets.UTF_8.name()));
        }
        C12969k0 c12969k0M58994a = this.navDeepLinkRequestHelper.m58994a(sb4.toString());
        int iM68005a = m68005a(dVar);
        return new InterfaceC21149j0.c(c12969k0M58994a, iM68005a != 0 ? new C12997x0(false, false, iM68005a, true, false, -1, -1, -1, -1) : null, null, 4, null);
    }

    public /* synthetic */ C23441r(int i13, int i14, C21147i0 c21147i0, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? new C21147i0() : c21147i0);
    }
}
