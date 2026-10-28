package z82;

import com.whoop.data.repositories.AnalyticsUserRepository;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.ProfileApiKt;
import ih0.AbstractC18489d0;
import java.util.HashMap;
import java.util.Map;
import live.hms.video.media.tracks.HMSTrackSource;
import lm2.InterfaceC24516b;
import p031b9.AbstractC2875y;
import q92.C30076h;
import y00.AbstractC38963t7;
import y82.EnumC39339b;
import zp0.C40939a;

/* JADX INFO: renamed from: z82.e */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class C40191e {

    /* JADX INFO: renamed from: d */
    private static String f173483d = "Registration";

    /* JADX INFO: renamed from: a */
    private final InterfaceC40188b f173484a;

    /* JADX INFO: renamed from: b */
    private final AnalyticsUserRepository f173485b;

    /* JADX INFO: renamed from: c */
    private final C30076h f173486c;

    public C40191e(InterfaceC40188b interfaceC40188b, AnalyticsUserRepository analyticsUserRepository, C30076h c30076h) {
        this.f173484a = interfaceC40188b;
        this.f173485b = analyticsUserRepository;
        this.f173486c = c30076h;
    }

    /* JADX INFO: renamed from: f */
    public static String m128973f(InterfaceC24516b interfaceC24516b) {
        if (interfaceC24516b == null) {
            return null;
        }
        return interfaceC24516b.mo71413b();
    }

    /* JADX INFO: renamed from: g */
    private Map<String, Object> m128974g(String str) {
        HashMap map = new HashMap();
        map.put(ProfileApiKt.COMMUNITY_ID_PARAM, str);
        return map;
    }

    /* JADX INFO: renamed from: h */
    private String m128975h(String str, String str2) {
        return AbstractC18489d0.m53370k(str, " - ", str2);
    }

    /* JADX INFO: renamed from: i */
    private String m128976i(boolean z4) {
        return z4 ? "Reply" : "Comment";
    }

    /* JADX INFO: renamed from: A */
    public void m128977A(String str, boolean z4, String str2, String str3) {
        this.f173484a.mo41428k("Community", str2, m128976i(z4), str3, m128974g(str));
    }

    /* JADX INFO: renamed from: A0 */
    public void m128978A0(String str) {
        this.f173484a.mo41421c("Local Notification", "Bluetooth", this.f173486c.m92198d(), this.f173486c.m92199e(), str, null, null, null, AbstractC38963t7.m124393w());
    }

    /* JADX INFO: renamed from: B */
    public void m128979B() {
        this.f173484a.mo41424f("Elite", "Confirm", f173483d, "Elite Team - Join");
    }

    /* JADX INFO: renamed from: B0 */
    public void m128980B0() {
        this.f173484a.mo41424f("Registration", null, null, "Connect a Strap");
    }

    /* JADX INFO: renamed from: C */
    public void m128981C(String str, Map<String, String> map) {
        this.f173484a.mo41421c("Pairing - Click Connect", "Bluetooth", null, null, str, "Pick a strap", null, this.f173485b.getUserType(), map);
    }

    /* JADX INFO: renamed from: C0 */
    public void m128982C0() {
        this.f173484a.mo41424f("Directory", "Submit Invite Code", null, "Teams");
    }

    /* JADX INFO: renamed from: D */
    public void m128983D(String str) {
        this.f173484a.mo41424f("Teams", "Open", str, "Team - Create");
    }

    /* JADX INFO: renamed from: D0 */
    public void m128984D0(String str, String str2) {
        this.f173484a.mo41424f("Teams", str, str2, "Team - Create");
    }

    /* JADX INFO: renamed from: E */
    public void m128985E() {
        this.f173484a.mo41424f("Elite", "Decline", f173483d, "Elite Team - Join");
    }

    /* JADX INFO: renamed from: E0 */
    public void m128986E0(String str, String str2) {
        this.f173484a.mo41424f("Teams", str, str2, "Team - View");
    }

    /* JADX INFO: renamed from: F */
    public void m128987F(String str, String str2) {
        this.f173484a.mo41421c("Device Settings - Email Diagnostics", "Device Settings", null, null, str, "Press", str2, null, null);
    }

    /* JADX INFO: renamed from: F0 */
    public void m128988F0(String str, boolean z4) {
        if (z4) {
            this.f173484a.mo41426h("Recording Data", "Track Route On", str, "Toggled Track Route On", "GPS_enabled");
        } else {
            this.f173484a.mo41426h("Recording Data", "Track Route Off", str, "Toggled Track Route Off", "GPS_disabled");
        }
    }

    /* JADX INFO: renamed from: G */
    public void m128989G(String str) {
        this.f173484a.mo41421c("Device Settings - Erase Strap Data", "Device Settings", this.f173486c.m92198d(), this.f173486c.m92199e(), str, null, null, null, null);
    }

    /* JADX INFO: renamed from: G0 */
    public void m128990G0(String str) {
        this.f173484a.mo41421c("Device Settings - Unpair", "Device Settings", this.f173486c.m92198d(), this.f173486c.m92199e(), str, null, null, null, null);
    }

    /* JADX INFO: renamed from: H */
    public void m128991H(String str) {
        this.f173484a.mo41424f("Teams", "Explore", str, "Team - Discover");
    }

    /* JADX INFO: renamed from: H0 */
    public void m128992H0(String str) {
        this.f173484a.mo41424f(str, "In App Click", null, "WHOOP Affiliate");
    }

    /* JADX INFO: renamed from: I */
    public void m128993I(String str, Integer num) {
        String strM8299l = AbstractC2875y.m8299l(str, " - View Onboarding Screen");
        HashMap map = new HashMap();
        map.put("step", num);
        this.f173484a.mo41428k("Onboarding", null, null, strM8299l, map);
    }

    /* JADX INFO: renamed from: I0 */
    public void m128994I0(String str, Map<String, Object> map) {
        this.f173484a.mo41428k(null, str, null, "WHOOP Gift", map);
    }

    /* JADX INFO: renamed from: J */
    public void m128995J(int i13, int i14, String str, String str2) {
        String strM8299l = AbstractC2875y.m8299l(str, " - View Onboarding Screen");
        HashMap map = new HashMap();
        AbstractC18489d0.m53383x(i14, map, "step", i13, "previous_step");
        this.f173484a.mo41422d("Onboarding", null, null, strM8299l, str2, map);
    }

    /* JADX INFO: renamed from: J0 */
    public void m128996J0(String str, String str2) {
        this.f173484a.mo41424f(null, str, str2, "Gift Current Member WHOOP - Link Clicked");
    }

    /* JADX INFO: renamed from: K */
    public void m128997K(String str) {
        this.f173484a.mo41424f("", str, "Carousel", "Team - Discover");
    }

    /* JADX INFO: renamed from: K0 */
    public void m128998K0() {
        this.f173484a.mo41424f("Referral", "Invoked Share", "Individual", "Refer Friend- Invite Friend");
    }

    /* JADX INFO: renamed from: L */
    public void m128999L(String str) {
        this.f173484a.mo41421c("Device Settings - Firmware Check", "Device Settings", this.f173486c.m92198d(), this.f173486c.m92199e(), str, null, null, null, null);
    }

    /* JADX INFO: renamed from: L0 */
    public void m129000L0(boolean z4, String str, String str2) {
        if (z4) {
            this.f173484a.mo41426h(null, "Selfie", str, "WHOOP Live - Start", str2);
        } else {
            this.f173484a.mo41426h(null, "Rear-facing", str, "WHOOP Live - Start", str2);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m129001M(Boolean bool, String str) {
        String strM92198d = this.f173486c.m92198d();
        String strM92199e = this.f173486c.m92199e();
        if (bool.booleanValue()) {
            this.f173484a.mo41421c("HR Broadcast - Enable", "Device Settings", strM92198d, strM92199e, str, null, null, null, null);
        } else {
            this.f173484a.mo41421c("HR Broadcast - Disable", "Device Settings", strM92198d, strM92199e, str, null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m129002M0(int i13) {
        HashMap map = new HashMap();
        map.put("CommunityID", Integer.valueOf(i13));
        this.f173484a.mo41428k("Referral", "Invoked Share", "Team", "Refer Friend- Invite Friend", map);
    }

    /* JADX INFO: renamed from: N */
    public void m129003N() {
        this.f173484a.mo41421c("Received HTTP 429", "API", this.f173486c.m92198d(), this.f173486c.m92199e(), this.f173486c.m92200f(), null, null, null, null);
    }

    /* JADX INFO: renamed from: N0 */
    public void m129004N0(String str) {
        this.f173484a.mo41426h("Teams", "Calendar Picker", "Apply", "Team - View", str);
    }

    /* JADX INFO: renamed from: O */
    public void m129005O(String str, String str2, String str3) {
        this.f173484a.mo41422d("Teams", str, str2, "Team - View", "Leaderboard Sort", m128974g(str3));
    }

    /* JADX INFO: renamed from: O0 */
    public void m129006O0(String str, boolean z4) {
        if (!z4) {
            this.f173484a.mo41424f(ProfileAnalyticsKt.OTHER_PROFILE, "Teammate Bio", str, "Bio (Other) - Open");
            return;
        }
        HashMap map = new HashMap();
        map.put("source", "Community");
        this.f173484a.mo41428k("Reviewing Data", "Click", "Community", "Bio (Self) - Open", map);
    }

    /* JADX INFO: renamed from: P */
    public void m129007P(boolean z4) {
        this.f173484a.mo41421c("App Foreground - Internet", "Connectivity", this.f173486c.m92198d(), this.f173486c.m92199e(), this.f173486c.m92200f(), z4 ? "Connected" : "Disconnected", null, null, null);
    }

    /* JADX INFO: renamed from: P0 */
    public void m129008P0(String str, String str2, boolean z4) {
        this.f173484a.mo41428k("Community", str2, m128976i(z4), "Team Chat - Manage Message", m128974g(str));
    }

    /* JADX INFO: renamed from: Q */
    public void m129009Q(String str) {
        this.f173484a.mo41424f("Community", "Open", str, "Community - Join");
    }

    /* JADX INFO: renamed from: Q0 */
    public void m129010Q0(String str, boolean z4, boolean z13, String str2) {
        Map<String, ? extends Object> mapM128974g = m128974g(str);
        mapM128974g.put("Attachment", Boolean.valueOf(z4));
        this.f173484a.mo41422d("Community", "Submit", m128976i(z13), "Team Chat - Submit", str2, mapM128974g);
    }

    /* JADX INFO: renamed from: R */
    public void m129011R(boolean z4) {
        if (z4) {
            this.f173484a.mo41424f("Recording Data", "App Permissions Updated", "While In Use", "Start Activity");
        } else {
            this.f173484a.mo41424f("Recording Data", "App Permissions Updated", "Deny", "Start Activity");
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m129012R0() {
        this.f173484a.mo41424f("Teams", "Calendar Picker", "Open", "Team - View");
    }

    /* JADX INFO: renamed from: S */
    public void m129013S() {
        this.f173484a.mo41424f(null, "View All in Webview", null, "Member Stories - View");
    }

    /* JADX INFO: renamed from: S0 */
    public void m129014S0() {
        this.f173484a.mo41424f(null, null, "gift-page", "Refer Friend- Invite Friend");
    }

    /* JADX INFO: renamed from: T */
    public void m129015T() {
        HashMap map = new HashMap(1);
        map.put(HMSTrackSource.SCREEN, "Account");
        this.f173484a.mo41428k(null, "In App Click", null, "Membership Extensions", map);
    }

    /* JADX INFO: renamed from: T0 */
    public void m129016T0(String str, String str2, String str3, String str4) {
        this.f173484a.mo41422d("Teams", str, str2, "Team - View", str3, m128974g(str4));
    }

    /* JADX INFO: renamed from: U */
    public void m129017U(String str) {
        this.f173484a.mo41424f("Navigation", "Logout", str, "Logout - Select");
    }

    /* JADX INFO: renamed from: U0 */
    public void m129018U0(String str, String str2) {
        this.f173484a.mo41424f("Community", str2, str, "Team - Enter Code");
    }

    /* JADX INFO: renamed from: V */
    public void m129019V(String str) {
        this.f173484a.mo41424f("Navigation", "Refer A Friend", str, "Refer Friend- Open");
    }

    /* JADX INFO: renamed from: W */
    public void m129020W(String str) {
        this.f173484a.mo41424f("Notifications", "Dismiss", str, "Push Notification");
    }

    /* JADX INFO: renamed from: X */
    public void m129021X(String str, Boolean bool) {
        if (this.f173485b.getUserType().equals("Onboarding")) {
            this.f173484a.mo41421c("Pairing - First Time Click Connect", "Bluetooth", null, null, str, null, null, "new-connectivity-flow", AbstractC38963t7.m124395y(this.f173485b.getUserType(), bool.toString()));
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m129022Y(String str, Boolean bool, String str2) {
        if (this.f173485b.getUserType().equals("Onboarding")) {
            this.f173484a.mo41421c("Pairing - First Time Connected Strap", "Bluetooth", this.f173486c.m92198d(), this.f173486c.m92199e(), str, EnumC39339b.RESULT_SUCCESS, null, "new-connectivity-flow", AbstractC38963t7.m124384n(this.f173485b.getUserType(), bool.toString(), str2));
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m129023Z(Boolean bool) {
        HashMap map = new HashMap(1);
        map.put("haptics feedback successful", bool);
        this.f173484a.mo41428k("Strain Coach", "Haptics Triggered", "Target Haptics Triggered", "Strain Coach - Target Haptics", map);
    }

    /* JADX INFO: renamed from: a */
    public void m129024a(boolean z4, int i13, String str) {
        HashMap map = new HashMap();
        map.put(ProfileApiKt.COMMUNITY_ID_PARAM, Integer.valueOf(i13));
        map.put("Data_Attached", str);
        this.f173484a.mo41422d("Community", "Attach Data", m128976i(z4), "Team Chat - Add Data", "", map);
    }

    /* JADX INFO: renamed from: a0 */
    public void m129025a0() {
        this.f173484a.mo41424f("Strain Coach", "Notification Fired", "Target Notification Fired", "Strain Coach - Target Notification");
    }

    /* JADX INFO: renamed from: b */
    public void m129026b(String str, String str2) {
        this.f173484a.mo41426h("Teams", "Apply", str, "Team List - Sort", str2);
    }

    /* JADX INFO: renamed from: b0 */
    public void m129027b0(String str, String str2, Boolean bool) {
        this.f173484a.mo41421c("Pairing - Connected Strap", "Bluetooth", this.f173486c.m92198d(), this.f173486c.m92199e(), str2, "Fail", str, this.f173485b.getUserType(), bool != null ? AbstractC38963t7.m124394x(bool.toString()) : AbstractC38963t7.m124381k());
    }

    /* JADX INFO: renamed from: c */
    public void m129028c(boolean z4, int i13, String str) {
        HashMap map = new HashMap();
        map.put(ProfileApiKt.COMMUNITY_ID_PARAM, Integer.valueOf(i13));
        map.put("StreamChannel_ID", str);
        this.f173484a.mo41422d("Community", "Open", m128976i(z4), "Team Chat - Add Data", "", map);
    }

    /* JADX INFO: renamed from: c0 */
    public void m129029c0(String str, Boolean bool, String str2) {
        this.f173484a.mo41421c("Pairing - Connected Strap", "Bluetooth", this.f173486c.m92198d(), this.f173486c.m92199e(), str, EnumC39339b.RESULT_SUCCESS, null, this.f173485b.getUserType(), bool != null ? AbstractC38963t7.m124383m(bool.toString(), str2) : AbstractC38963t7.m124382l(str2));
    }

    /* JADX INFO: renamed from: d */
    public void m129030d(boolean z4) {
        String strM92198d = this.f173486c.m92198d();
        String strM92199e = this.f173486c.m92199e();
        if (z4) {
            this.f173484a.mo41421c("Device Settings - Edit Name", "Device Settings", strM92198d, strM92199e, "Gen4", EnumC39339b.RESULT_SUCCESS, null, null, null);
        } else {
            this.f173484a.mo41421c("Device Settings - Edit Name", "Device Settings", strM92198d, strM92199e, "Gen4", "Fail", null, null, null);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m129031d0(String str, Map<String, Object> map) {
        this.f173484a.mo41428k("Help", "Question Button", str, "Help Center - Open", map);
    }

    /* JADX INFO: renamed from: e */
    public void m129032e() {
        this.f173484a.mo41421c("Device Settings - Edit Name", "Device Settings", this.f173486c.m92198d(), this.f173486c.m92199e(), "Gen4", "Save", null, null, null);
    }

    /* JADX INFO: renamed from: e0 */
    public void m129033e0(String str) {
        this.f173484a.mo41421c("Device Settings - Reboot", "Device Settings", this.f173486c.m92198d(), this.f173486c.m92199e(), str, null, null, null, null);
    }

    /* JADX INFO: renamed from: f0 */
    public void m129034f0(String str, Map<String, Object> map) {
        this.f173484a.mo41423e(str, map);
    }

    /* JADX INFO: renamed from: g0 */
    public void m129035g0(String str) {
        this.f173484a.mo41425g(str);
    }

    /* JADX INFO: renamed from: h0 */
    public void m129036h0(String str, Map<String, ?> map) {
        this.f173484a.mo41423e(str, map);
    }

    /* JADX INFO: renamed from: i0 */
    public void m129037i0(String str) {
        this.f173484a.mo41424f("Recording Data", "Select Activity", str, "Choose Activity Type");
    }

    /* JADX INFO: renamed from: j */
    public void m129038j(String str) {
        this.f173484a.mo41424f(str, null, null, "Select Activity - View Tab");
    }

    /* JADX INFO: renamed from: j0 */
    public void m129039j0(String str, String str2, Map<String, Object> map) {
        this.f173484a.mo41428k("Community", str, null, str2, map);
    }

    /* JADX INFO: renamed from: k */
    public void m129040k(String str, String str2, String str3) {
        this.f173484a.mo41421c(str, str2, this.f173486c.m92198d(), this.f173486c.m92199e(), str3, "Open", null, null, null);
    }

    /* JADX INFO: renamed from: k0 */
    public void m129041k0(Map<String, Object> map) {
        this.f173484a.mo41428k("Navigation", "Close", "X", "Sleep Coach - Close", map);
    }

    /* JADX INFO: renamed from: l */
    public void m129042l() {
        this.f173484a.mo41424f("Teams", "Open", null, "Team List - Sort");
    }

    /* JADX INFO: renamed from: l0 */
    public void m129043l0(String str, String str2, String str3, Map<String, Object> map) {
        this.f173484a.mo41428k("Sleep Coach", str, str3, str2, map);
    }

    /* JADX INFO: renamed from: m */
    public void m129044m() {
        this.f173484a.mo41421c("Device Settings - Edit Name", "Device Settings", this.f173486c.m92198d(), this.f173486c.m92199e(), "Gen4", null, null, null, null);
    }

    /* JADX INFO: renamed from: m0 */
    public void m129045m0(String str, String str2, String str3, Map<String, Object> map) {
        this.f173484a.mo41428k(str, str2, "", str3, map);
    }

    /* JADX INFO: renamed from: n */
    public void m129046n(int i13, String str) {
        HashMap map = new HashMap(1);
        map.put("CommunityId", Integer.valueOf(i13));
        this.f173484a.mo41428k("Teams", "View Invite", str, "Team - View Invite", map);
    }

    /* JADX INFO: renamed from: n0 */
    public void m129047n0(Map<String, Object> map, String str) {
        this.f173484a.mo41428k("Navigation", "Open", str, "Sleep Coach - Open", map);
    }

    /* JADX INFO: renamed from: o */
    public void m129048o() {
        this.f173484a.mo41424f("Teams", "Add Members - Existing", "", "Team - Manage");
    }

    /* JADX INFO: renamed from: o0 */
    public void m129049o0(Map<String, Object> map) {
        this.f173484a.mo41428k("update", null, null, "Sleep Coach 4.0 Interaction", map);
    }

    /* JADX INFO: renamed from: p */
    public void m129050p(String str) {
        this.f173484a.mo41426h("Teams", "All Invites", null, "Team - View Invite", str);
    }

    /* JADX INFO: renamed from: p0 */
    public void m129051p0() {
        this.f173484a.mo41424f("WHOOP Live", "Aspect Full", "", "WHOOP Live - Toggle Full");
    }

    /* JADX INFO: renamed from: q */
    public void m129052q(Byte b) {
        this.f173484a.mo41424f("Battery", "Receive", "Battery " + b + "%", "Battery - Low Battery");
    }

    /* JADX INFO: renamed from: q0 */
    public void m129053q0() {
        this.f173484a.mo41424f("WHOOP Live", "Condensed", "", "WHOOP Live - Toggle Condensed");
    }

    /* JADX INFO: renamed from: r */
    public void m129054r() {
        this.f173484a.mo41424f("Data Sync", "Bluetooth Latency", "12 Hours", "Data Sync - Backlog");
    }

    /* JADX INFO: renamed from: r0 */
    public void m129055r0(String str) {
        this.f173484a.mo41424f(null, "Share - Camera", str, "WHOOP Live - Share");
    }

    /* JADX INFO: renamed from: s */
    public void m129056s() {
        this.f173484a.mo41424f("Data Sync", "Bluetooth Latency", "4 Hours", "Data Sync - Backlog");
    }

    /* JADX INFO: renamed from: s0 */
    public void m129057s0(String str) {
        this.f173484a.mo41424f(null, "Share - Imported", str, "WHOOP Live - Share");
    }

    /* JADX INFO: renamed from: t */
    public void m129058t() {
        this.f173484a.mo41424f("Directory", "Browse", null, "Teams");
    }

    /* JADX INFO: renamed from: t0 */
    public void m129059t0(String str, String str2) {
        HashMap map = new HashMap(1);
        map.put("tab", str2);
        this.f173484a.mo41428k("Recording Data", "Start Activity", str, "Start Activity - Start", map);
    }

    /* JADX INFO: renamed from: u */
    public void m129060u(String str) {
        this.f173484a.mo41428k("Community", "Chat", "", "Team - View", m128974g(str));
    }

    /* JADX INFO: renamed from: u0 */
    public void m129061u0(String str) {
        this.f173484a.mo41424f("Recording Data", "Cancel", m128975h(str, "Discard cancel"), "Record Activity - Discard");
    }

    /* JADX INFO: renamed from: v */
    public void m129062v(C40939a c40939a) {
        this.f173484a.mo41422d("Community", "React", c40939a.getReactionType(), "Team Chat - Manage Message", c40939a.getMessageId(), m128974g(c40939a.getCom.whoop.profile.domain.ProfileApiKt.COMMUNITY_ID_PARAM java.lang.String()));
    }

    /* JADX INFO: renamed from: v0 */
    public void m129063v0(String str) {
        this.f173484a.mo41424f("Recording Data", "Confirm", m128975h(str, "Discard confirm"), "Record Activity - Discard");
    }

    /* JADX INFO: renamed from: w */
    public void m129064w(String str, String str2, boolean z4, boolean z13) {
        if (!z13) {
            this.f173484a.mo41422d("Community", "Team Chat", m128976i(z4), "Bio (Other) - Open", str2, m128974g(str));
            return;
        }
        HashMap map = new HashMap();
        map.put("source", "Community");
        this.f173484a.mo41428k("Reviewing Data", "Click", "Community", "Bio (Self) - Open", map);
    }

    /* JADX INFO: renamed from: w0 */
    public void m129065w0(String str) {
        this.f173484a.mo41424f("Recording Data", "Cancel", m128975h(str, "Save cancel"), "End/Save Activity - Cancel");
    }

    /* JADX INFO: renamed from: x */
    public void m129066x() {
        this.f173484a.mo41424f("Bluetooth", "Companion Device Association Failed", "Association Attempt Cancelled", "Prompted Companion Device Association");
    }

    /* JADX INFO: renamed from: x0 */
    public void m129067x0(String str) {
        this.f173484a.mo41424f("Recording Data", "Confirm", m128975h(str, "Save confirm"), "End/Save Activity - Confirm");
    }

    /* JADX INFO: renamed from: y */
    public void m129068y() {
        this.f173484a.mo41424f("Bluetooth", "Companion Device Associated", null, "Prompted Companion Device Association");
    }

    /* JADX INFO: renamed from: y0 */
    public void m129069y0(String str, boolean z4, String str2) {
        HashMap map = new HashMap(1);
        map.put("tab", str2);
        if (z4) {
            this.f173484a.mo41422d("Recording Data", "Start Activity", str, "Start Activity - Start", "GPS_enabled", map);
        } else {
            this.f173484a.mo41422d("Recording Data", "Start Activity", str, "Start Activity - Start", "GPS_disabled", map);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m129070z() {
        this.f173484a.mo41424f("Bluetooth", "Companion Device Association Failed", "Association Attempt Timed Out", "Prompted Companion Device Association");
    }

    /* JADX INFO: renamed from: z0 */
    public void m129071z0(Map<String, Object> map) {
        if (this.f173485b.getUserType().equals("Onboarding")) {
            this.f173484a.mo41428k("Bluetooth", EnumC39339b.RESULT_SUCCESS, "", "Setup Flow - Strap Connected", map);
        }
    }
}
