package mg2;

import com.whoop.design.util.AbstractC8693b;
import gi1.InterfaceC15891a;
import gz0.EnumC16313m0;
import hg2.AbstractC17260a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import n71.C26436q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg2.C29168c;
import rg2.AbstractC31393e;
import rg2.AbstractC31402n;
import rg2.AbstractC31404p;
import rg2.C31391c;
import rg2.C31395g;
import rg2.C31401m;
import rg2.C31403o;
import rg2.C31406r;
import rg2.C31407s;
import rg2.C31408t;
import sg2.C32457h;
import w41.C36823w;
import yg2.AbstractC39529d;
import yg2.C39528c;

/* JADX INFO: renamed from: mg2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J1\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010'J1\u0010)\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,¨\u0006-"}, m65681d2 = {"Lmg2/a;", "", "Lrg2/r;", "selectionReducer", "Lyg2/c;", "liveHrMonitorReducer", "<init>", "(Lrg2/r;Lyg2/c;)V", "Lrg2/s;", "selectionState", "Lrg2/o;", "gpsToggleState", "Lsg2/h;", "e", "(Lrg2/s;Lrg2/o;)Lsg2/h;", "Lyg2/d;", "liveHrState", "", "isBluetoothOff", "Lrg2/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lyg2/d;Z)Lrg2/p;", "Lrg2/t;", "b", "()Lrg2/t;", "a", "c", "Lpg2/c;", "domain", "Ln71/q;", "liveHrMonitorState", "showGpsToggle", "Lw41/w;", "userLocation", "Lrg2/n;", "f", "(Lpg2/c;Ln71/q;ZLw41/w;)Lrg2/n;", "isGpsTrackingEnabled", "g", "(Lpg2/c;ZZ)Lrg2/o;", "Lrg2/c;", "d", "(Lpg2/c;Lyg2/d;Lw41/w;Z)Lrg2/c;", "Lrg2/r;", "Lyg2/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25531a {

    /* JADX INFO: renamed from: c */
    public static final int f100045c = C39528c.f169985b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C31406r selectionReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39528c liveHrMonitorReducer;

    public C25531a(C31406r selectionReducer, C39528c liveHrMonitorReducer) {
        AbstractC22676k.m65750j(selectionReducer, "selectionReducer");
        AbstractC22676k.m65750j(liveHrMonitorReducer, "liveHrMonitorReducer");
        this.selectionReducer = selectionReducer;
        this.liveHrMonitorReducer = liveHrMonitorReducer;
    }

    /* JADX INFO: renamed from: a */
    private final C31408t m75106a() {
        return new C31408t(EnumC16313m0.BLUETOOTH, AbstractC8693b.m21277k(AbstractC17260a.f66332g), AbstractC8693b.m21277k(AbstractC17260a.f66331f));
    }

    /* JADX INFO: renamed from: b */
    private final C31408t m75107b() {
        return new C31408t(EnumC16313m0.STRAP, AbstractC8693b.m21277k(AbstractC17260a.f66334i), AbstractC8693b.m21277k(AbstractC17260a.f66333h));
    }

    /* JADX INFO: renamed from: c */
    private final C31408t m75108c() {
        return new C31408t(EnumC16313m0.REMOVE_STRAP, AbstractC8693b.m21277k(AbstractC17260a.f66336k), AbstractC8693b.m21277k(AbstractC17260a.f66335j));
    }

    /* JADX INFO: renamed from: e */
    private final C32457h m75109e(C31407s selectionState, C31403o gpsToggleState) {
        return new C32457h(selectionState.getSelectedActivityLabel(), gpsToggleState != null, gpsToggleState != null ? gpsToggleState.getIsGpsTrackingEnabled() : false, new C31395g(AbstractC31393e.m96688s(selectionState.m96720a())));
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC31402n m75110f(C29168c domain, C26436q liveHrMonitorState, boolean showGpsToggle, C36823w userLocation) {
        if (!domain.getIsLoading() && showGpsToggle && domain.getIsGpsTrackingEnabled()) {
            return userLocation != null ? new AbstractC31402n.c(userLocation) : new AbstractC31402n.b(liveHrMonitorState);
        }
        return new AbstractC31402n.b(liveHrMonitorState);
    }

    /* JADX INFO: renamed from: g */
    private final C31403o m75111g(C29168c domain, boolean isGpsTrackingEnabled, boolean showGpsToggle) {
        if (domain.getIsLoading() || !showGpsToggle) {
            return null;
        }
        return new C31403o(isGpsTrackingEnabled);
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC31404p m75112h(AbstractC39529d liveHrState, boolean isBluetoothOff) {
        if (isBluetoothOff) {
            return new AbstractC31404p.c(EnumC16313m0.BLUETOOTH, m75106a());
        }
        if (liveHrState instanceof AbstractC39529d.a) {
            return new AbstractC31404p.b(((AbstractC39529d.a) liveHrState).getHeartRate());
        }
        if (liveHrState instanceof AbstractC39529d.b) {
            return AbstractC31404p.a.f129250a;
        }
        if (liveHrState instanceof AbstractC39529d.d) {
            return new AbstractC31404p.c(EnumC16313m0.BLUETOOTH, m75107b());
        }
        if (liveHrState instanceof AbstractC39529d.c) {
            return new AbstractC31404p.c(EnumC16313m0.TINY_HEART_RATE, m75108c());
        }
        return liveHrState instanceof AbstractC39529d.e ? new AbstractC31404p.c(EnumC16313m0.STRAP, null, 2, null) : new AbstractC31404p.c(EnumC16313m0.TINY_HEART_RATE, null, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final C31391c m75113d(C29168c domain, AbstractC39529d liveHrState, C36823w userLocation, boolean isBluetoothOff) {
        AbstractC22676k.m65750j(domain, "domain");
        AbstractC22676k.m65750j(liveHrState, "liveHrState");
        C31407s c31407sM96719a = this.selectionReducer.m96719a(domain);
        C26436q c26436qM126256b = this.liveHrMonitorReducer.m126256b(liveHrState);
        C31403o c31403oM75111g = m75111g(domain, domain.getIsGpsTrackingEnabled() || domain.getIsGpsTogglePendingPermission(), c31407sM96719a.getShowGpsToggle());
        boolean isLoading = domain.getIsLoading();
        AbstractC31404p abstractC31404pM75112h = m75112h(liveHrState, isBluetoothOff);
        AbstractC31402n abstractC31402nM75110f = m75110f(domain, c26436qM126256b, c31407sM96719a.getShowGpsToggle(), userLocation);
        C31401m c31401m = new C31401m(c31407sM96719a.getSelectedActivityLabel(), c31407sM96719a.m96720a());
        InterfaceC15891a gpsPermissionEffect = domain.getGpsPermissionEffect();
        boolean showGpsLocationPermissionPrompt = domain.getShowGpsLocationPermissionPrompt();
        boolean isGpsTrackingEnabled = domain.getIsGpsTrackingEnabled();
        C32457h c32457hM75109e = m75109e(c31407sM96719a, c31403oM75111g);
        String selectedInternalName = domain.getSelectedInternalName();
        if (domain.getIsLoading()) {
            selectedInternalName = null;
        }
        return new C31391c(isLoading, abstractC31404pM75112h, abstractC31402nM75110f, c31401m, c31403oM75111g, gpsPermissionEffect, showGpsLocationPermissionPrompt, isGpsTrackingEnabled, c32457hM75109e, selectedInternalName);
    }

    public /* synthetic */ C25531a(C31406r c31406r, C39528c c39528c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C31406r() : c31406r, (i13 & 2) != 0 ? new C39528c() : c39528c);
    }
}
