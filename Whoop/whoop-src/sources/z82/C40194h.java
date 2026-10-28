package z82;

import com.whoop.data.repositories.AnalyticsUserRepository;
import fi0.InterfaceC14517c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Map;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q92.C30076h;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: z82.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\u001e\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJY\u0010!\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012H\u0016¢\u0006\u0004\b!\u0010\"JO\u0010#\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012H\u0016¢\u0006\u0004\b#\u0010$Jw\u0010(\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0012H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\rJ\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00102R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103¨\u00065"}, m65681d2 = {"Lz82/h;", "Lz82/b;", "Lfi0/c;", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/AnalyticsUserRepository;", "analyticsUserRepository", "Lq92/h;", "whoopStrapSharedPrefs", "<init>", "(Ltr2/n;Lcom/whoop/data/repositories/AnalyticsUserRepository;Lq92/h;)V", "Ll83/a0;", "b", "()V", "", "screenName", "g", "(Ljava/lang/String;)V", "", "", "extraData", "e", "(Ljava/lang/String;Ljava/util/Map;)V", "category", "action", "label", "eventName", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "value", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "otherProperties", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "maximVersion", "nordicVersion", "strapGeneration", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "force", "j", "(Z)V", "a", "Lz82/e;", "l", "()Lz82/e;", "Ltr2/n;", "Lz82/e;", "dispatcher", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40194h implements InterfaceC40188b, InterfaceC14517c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C40191e dispatcher;

    public C40194h(InterfaceC34116n logger, AnalyticsUserRepository analyticsUserRepository, C30076h whoopStrapSharedPrefs) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsUserRepository, "analyticsUserRepository");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        this.logger = logger;
        this.dispatcher = new C40191e(this, analyticsUserRepository, whoopStrapSharedPrefs);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: a */
    public void mo41419a() {
        this.logger.mo85219j("user logout", new AbstractC30556a.a[0]);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: b */
    public void mo41420b() {
        this.logger.mo85219j("Init: logging all analytics calls", new AbstractC30556a.a[0]);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: c */
    public void mo41421c(String eventName, String category, String maximVersion, String nordicVersion, String strapGeneration, String action, String label, String value, Map<String, ? extends Object> otherProperties) {
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Event=", eventName, ", category=", category, ", maximVersion=");
        AbstractC11266d.m30444B(sbM32001t, maximVersion, ", nordicVersion=", nordicVersion, ", strapGeneration=");
        AbstractC11266d.m30444B(sbM32001t, strapGeneration, ", action=", action, ", label=");
        AbstractC11266d.m30444B(sbM32001t, label, ", value=", value, ", otherProperties=");
        sbM32001t.append(otherProperties);
        interfaceC34116n.mo85219j(sbM32001t.toString(), new AbstractC30556a.a[0]);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: d */
    public void mo41422d(String category, String action, String label, String eventName, String value, Map<String, ? extends Object> otherProperties) {
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Event=", eventName, ", category=", category, ", action=");
        AbstractC11266d.m30444B(sbM32001t, action, ", label=", label, ", value=");
        sbM32001t.append(value);
        sbM32001t.append(", properties=");
        sbM32001t.append(otherProperties);
        interfaceC34116n.mo85219j(sbM32001t.toString(), new AbstractC30556a.a[0]);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: e */
    public void mo41423e(String screenName, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(extraData, "extraData");
        InterfaceC34116n interfaceC34116n = this.logger;
        ArrayList arrayList = new ArrayList(extraData.size());
        for (Map.Entry<String, ? extends Object> entry : extraData.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        interfaceC34116n.mo85219j(AbstractC31061c.m95640p("Screen View: ", screenName, ", extra data: ", AbstractC25265s.m74110N0(arrayList, null, null, null, null, 63)), new AbstractC30556a.a[0]);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: f */
    public void mo41424f(String category, String action, String label, String eventName) {
        this.logger.mo85219j(AbstractC2875y.m8304q(AbstractC11895b.m32001t("Event=", eventName, ", category=", category, ", action="), action, ", label=", label), new AbstractC30556a.a[0]);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: g */
    public void mo41425g(String screenName) {
        AbstractC22676k.m65750j(screenName, "screenName");
        this.logger.mo85219j("Screen View: ".concat(screenName), new AbstractC30556a.a[0]);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: h */
    public void mo41426h(String category, String action, String label, String eventName, String value) {
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Event=", eventName, ", category=", category, ", action=");
        AbstractC11266d.m30444B(sbM32001t, action, ", label=", label, ", value=");
        sbM32001t.append(value);
        interfaceC34116n.mo85219j(sbM32001t.toString(), new AbstractC30556a.a[0]);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: j */
    public void mo41427j(boolean force) {
        this.logger.mo85219j(AbstractC11266d.m30462p("Identify user force=", force), new AbstractC30556a.a[0]);
    }

    @Override // fi0.InterfaceC14515a
    /* JADX INFO: renamed from: k */
    public void mo41428k(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Event=", eventName, ", category=", category, ", action=");
        AbstractC11266d.m30444B(sbM32001t, action, ", label=", label, ", properties=");
        sbM32001t.append(otherProperties);
        interfaceC34116n.mo85219j(sbM32001t.toString(), new AbstractC30556a.a[0]);
    }

    @Override // z82.InterfaceC40188b
    /* JADX INFO: renamed from: l, reason: from getter */
    public C40191e getDispatcher() {
        return this.dispatcher;
    }
}
