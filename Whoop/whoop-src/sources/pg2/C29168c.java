package pg2;

import c13.AbstractC3855a;
import gi1.InterfaceC15891a;
import ha0.C17051d;
import ha0.C17055h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: pg2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0015\u0010\u0016J¬\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010/R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b'\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b4\u0010\u001aR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b0\u00106R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b,\u00105\u001a\u0004\b-\u00106R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b(\u00105\u001a\u0004\b)\u00106¨\u00067"}, m65681d2 = {"Lpg2/c;", "", "", "isLoading", "", "selectedInternalName", "isGpsTrackingEnabled", "isGpsUserResolved", "isGpsTogglePendingPermission", "Lgi1/a;", "gpsPermissionEffect", "showGpsLocationPermissionPrompt", "", "Lha0/d;", "allActivitiesByInternalName", "sessionPinnedInternalName", "", "Lha0/h;", "recentDtos", "mostPopularWhoopDefaults", "displayedRowInternalNames", "<init>", "(ZLjava/lang/String;ZZZLgi1/a;ZLjava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "(ZLjava/lang/String;ZZZLgi1/a;ZLjava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lpg2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "n", "()Z", "b", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "l", "d", "m", "e", "k", "f", "Lgi1/a;", "()Lgi1/a;", "g", "j", "Ljava/util/Map;", "()Ljava/util/Map;", "i", "Ljava/util/List;", "()Ljava/util/List;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29168c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedInternalName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isGpsTrackingEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isGpsUserResolved;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isGpsTogglePendingPermission;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC15891a gpsPermissionEffect;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean showGpsLocationPermissionPrompt;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Map<String, C17051d> allActivitiesByInternalName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String sessionPinnedInternalName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<C17055h> recentDtos;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<String> mostPopularWhoopDefaults;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<String> displayedRowInternalNames;

    public C29168c(boolean z4, String str, boolean z13, boolean z14, boolean z15, InterfaceC15891a interfaceC15891a, boolean z16, Map<String, C17051d> allActivitiesByInternalName, String str2, List<C17055h> recentDtos, List<String> mostPopularWhoopDefaults, List<String> displayedRowInternalNames) {
        AbstractC22676k.m65750j(allActivitiesByInternalName, "allActivitiesByInternalName");
        AbstractC22676k.m65750j(recentDtos, "recentDtos");
        AbstractC22676k.m65750j(mostPopularWhoopDefaults, "mostPopularWhoopDefaults");
        AbstractC22676k.m65750j(displayedRowInternalNames, "displayedRowInternalNames");
        this.isLoading = z4;
        this.selectedInternalName = str;
        this.isGpsTrackingEnabled = z13;
        this.isGpsUserResolved = z14;
        this.isGpsTogglePendingPermission = z15;
        this.gpsPermissionEffect = interfaceC15891a;
        this.showGpsLocationPermissionPrompt = z16;
        this.allActivitiesByInternalName = allActivitiesByInternalName;
        this.sessionPinnedInternalName = str2;
        this.recentDtos = recentDtos;
        this.mostPopularWhoopDefaults = mostPopularWhoopDefaults;
        this.displayedRowInternalNames = displayedRowInternalNames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29168c m88630b(C29168c c29168c, boolean z4, String str, boolean z13, boolean z14, boolean z15, InterfaceC15891a interfaceC15891a, boolean z16, Map map, String str2, List list, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c29168c.isLoading;
        }
        if ((i13 & 2) != 0) {
            str = c29168c.selectedInternalName;
        }
        if ((i13 & 4) != 0) {
            z13 = c29168c.isGpsTrackingEnabled;
        }
        if ((i13 & 8) != 0) {
            z14 = c29168c.isGpsUserResolved;
        }
        if ((i13 & 16) != 0) {
            z15 = c29168c.isGpsTogglePendingPermission;
        }
        if ((i13 & 32) != 0) {
            interfaceC15891a = c29168c.gpsPermissionEffect;
        }
        if ((i13 & 64) != 0) {
            z16 = c29168c.showGpsLocationPermissionPrompt;
        }
        if ((i13 & 128) != 0) {
            map = c29168c.allActivitiesByInternalName;
        }
        if ((i13 & 256) != 0) {
            str2 = c29168c.sessionPinnedInternalName;
        }
        if ((i13 & 512) != 0) {
            list = c29168c.recentDtos;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list2 = c29168c.mostPopularWhoopDefaults;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            list3 = c29168c.displayedRowInternalNames;
        }
        List list4 = list2;
        List list5 = list3;
        String str3 = str2;
        List list6 = list;
        boolean z17 = z16;
        Map map2 = map;
        boolean z18 = z15;
        InterfaceC15891a interfaceC15891a2 = interfaceC15891a;
        return c29168c.m88631a(z4, str, z13, z14, z18, interfaceC15891a2, z17, map2, str3, list6, list4, list5);
    }

    /* JADX INFO: renamed from: a */
    public final C29168c m88631a(boolean isLoading, String selectedInternalName, boolean isGpsTrackingEnabled, boolean isGpsUserResolved, boolean isGpsTogglePendingPermission, InterfaceC15891a gpsPermissionEffect, boolean showGpsLocationPermissionPrompt, Map<String, C17051d> allActivitiesByInternalName, String sessionPinnedInternalName, List<C17055h> recentDtos, List<String> mostPopularWhoopDefaults, List<String> displayedRowInternalNames) {
        AbstractC22676k.m65750j(allActivitiesByInternalName, "allActivitiesByInternalName");
        AbstractC22676k.m65750j(recentDtos, "recentDtos");
        AbstractC22676k.m65750j(mostPopularWhoopDefaults, "mostPopularWhoopDefaults");
        AbstractC22676k.m65750j(displayedRowInternalNames, "displayedRowInternalNames");
        return new C29168c(isLoading, selectedInternalName, isGpsTrackingEnabled, isGpsUserResolved, isGpsTogglePendingPermission, gpsPermissionEffect, showGpsLocationPermissionPrompt, allActivitiesByInternalName, sessionPinnedInternalName, recentDtos, mostPopularWhoopDefaults, displayedRowInternalNames);
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, C17051d> m88632c() {
        return this.allActivitiesByInternalName;
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m88633d() {
        return this.displayedRowInternalNames;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC15891a getGpsPermissionEffect() {
        return this.gpsPermissionEffect;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29168c)) {
            return false;
        }
        C29168c c29168c = (C29168c) other;
        return this.isLoading == c29168c.isLoading && AbstractC22676k.m65745e(this.selectedInternalName, c29168c.selectedInternalName) && this.isGpsTrackingEnabled == c29168c.isGpsTrackingEnabled && this.isGpsUserResolved == c29168c.isGpsUserResolved && this.isGpsTogglePendingPermission == c29168c.isGpsTogglePendingPermission && AbstractC22676k.m65745e(this.gpsPermissionEffect, c29168c.gpsPermissionEffect) && this.showGpsLocationPermissionPrompt == c29168c.showGpsLocationPermissionPrompt && AbstractC22676k.m65745e(this.allActivitiesByInternalName, c29168c.allActivitiesByInternalName) && AbstractC22676k.m65745e(this.sessionPinnedInternalName, c29168c.sessionPinnedInternalName) && AbstractC22676k.m65745e(this.recentDtos, c29168c.recentDtos) && AbstractC22676k.m65745e(this.mostPopularWhoopDefaults, c29168c.mostPopularWhoopDefaults) && AbstractC22676k.m65745e(this.displayedRowInternalNames, c29168c.displayedRowInternalNames);
    }

    /* JADX INFO: renamed from: f */
    public final List<String> m88635f() {
        return this.mostPopularWhoopDefaults;
    }

    /* JADX INFO: renamed from: g */
    public final List<C17055h> m88636g() {
        return this.recentDtos;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSelectedInternalName() {
        return this.selectedInternalName;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        String str = this.selectedInternalName;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isGpsTrackingEnabled), 31, this.isGpsUserResolved), 31, this.isGpsTogglePendingPermission);
        InterfaceC15891a interfaceC15891a = this.gpsPermissionEffect;
        int iM11821e = AbstractC3855a.m11821e(this.allActivitiesByInternalName, AbstractC2875y.m8289b((iM8289b + (interfaceC15891a == null ? 0 : interfaceC15891a.hashCode())) * 31, 31, this.showGpsLocationPermissionPrompt), 31);
        String str2 = this.sessionPinnedInternalName;
        return this.displayedRowInternalNames.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM11821e + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.recentDtos), 31, this.mostPopularWhoopDefaults);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSessionPinnedInternalName() {
        return this.sessionPinnedInternalName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getShowGpsLocationPermissionPrompt() {
        return this.showGpsLocationPermissionPrompt;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsGpsTogglePendingPermission() {
        return this.isGpsTogglePendingPermission;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsGpsTrackingEnabled() {
        return this.isGpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsGpsUserResolved() {
        return this.isGpsUserResolved;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        String str = this.selectedInternalName;
        boolean z13 = this.isGpsTrackingEnabled;
        boolean z14 = this.isGpsUserResolved;
        boolean z15 = this.isGpsTogglePendingPermission;
        InterfaceC15891a interfaceC15891a = this.gpsPermissionEffect;
        boolean z16 = this.showGpsLocationPermissionPrompt;
        Map<String, C17051d> map = this.allActivitiesByInternalName;
        String str2 = this.sessionPinnedInternalName;
        List<C17055h> list = this.recentDtos;
        List<String> list2 = this.mostPopularWhoopDefaults;
        List<String> list3 = this.displayedRowInternalNames;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("PreSessionWidgetDomainState(isLoading=", ", selectedInternalName=", str, ", isGpsTrackingEnabled=", z4);
        AbstractC38963t7.m124392v(sbM38567n, z13, ", isGpsUserResolved=", z14, ", isGpsTogglePendingPermission=");
        sbM38567n.append(z15);
        sbM38567n.append(", gpsPermissionEffect=");
        sbM38567n.append(interfaceC15891a);
        sbM38567n.append(", showGpsLocationPermissionPrompt=");
        sbM38567n.append(z16);
        sbM38567n.append(", allActivitiesByInternalName=");
        sbM38567n.append(map);
        sbM38567n.append(", sessionPinnedInternalName=");
        AbstractC36095b.m114694v(str2, ", recentDtos=", ", mostPopularWhoopDefaults=", sbM38567n, list);
        return AbstractC30007c.m91843m(sbM38567n, list2, ", displayedRowInternalNames=", list3, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C29168c(boolean z4, String str, boolean z13, boolean z14, boolean z15, InterfaceC15891a interfaceC15891a, boolean z16, Map map, String str2, List list, List list2, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        z4 = (i13 & 1) != 0 ? true : z4;
        str = (i13 & 2) != 0 ? null : str;
        boolean z17 = (i13 & 4) != 0 ? false : z13;
        boolean z18 = (i13 & 8) != 0 ? false : z14;
        boolean z19 = (i13 & 16) != 0 ? false : z15;
        InterfaceC15891a interfaceC15891a2 = (i13 & 32) != 0 ? null : interfaceC15891a;
        boolean z24 = (i13 & 64) == 0 ? z16 : false;
        Map map2 = (i13 & 128) != 0 ? C25272z.f99163w : map;
        String str3 = (i13 & 256) == 0 ? str2 : null;
        int i14 = i13 & 512;
        C25271y c25271y = C25271y.f99162w;
        this(z4, str, z17, z18, z19, interfaceC15891a2, z24, map2, str3, i14 != 0 ? c25271y : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c25271y : list2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c25271y : list3);
    }
}
