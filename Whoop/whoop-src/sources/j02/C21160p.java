package j02;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.analytics.MetricEventModel;
import fy1.C14866b;
import fy1.InterfaceC14868d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jy1.C22047a;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25272z;
import n83.C26460c;
import n83.C26463f;
import p114eb.AbstractC12939a0;
import p114eb.C12977n0;
import p114eb.InterfaceC12990u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rr2.InterfaceC31766c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: j02.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u001b\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010\u000e2\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, m65681d2 = {"Lj02/p;", "Lj02/l0;", "Liy1/c;", "metricWriter", "Lrr2/c;", "crashReporter", "Lj02/b0;", "metricParser", "Lfy1/d;", "currentScreenTracker", "<init>", "(Liy1/c;Lrr2/c;Lj02/b0;Lfy1/d;)V", "Leb/n0;", "destination", "", "prefix", "Landroid/os/Bundle;", "arguments", "Ll83/a0;", "c", "(Leb/n0;Ljava/lang/String;Landroid/os/Bundle;)V", "fromTag", "", "", "fromArgs", "toTag", "toArgs", "f", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "e", "(Landroid/os/Bundle;)Ljava/util/Map;", "d", "(Landroid/os/Bundle;)Ljava/lang/String;", "Leb/a0;", "navController", "i", "(Leb/a0;Ljava/lang/String;)V", "Landroidx/lifecycle/g0;", "owner", "onStop", "(Landroidx/lifecycle/g0;)V", "currentDestination", "a0", "(Leb/n0;)V", "navigationTag", "J", "(Ljava/lang/String;)V", "fromDestinationTag", "toDestinationTag", "T", "(Ljava/lang/String;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Liy1/c;", "x", "Lrr2/c;", "y", "Lj02/b0;", "z", "Lfy1/d;", "E", "Ljava/lang/String;", "previousDestinationTag", "F", "Landroid/os/Bundle;", "previousArgs", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21160p implements InterfaceC21153l0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private String previousDestinationTag;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Bundle previousArgs;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C21132b0 metricParser;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC14868d currentScreenTracker;

    public C21160p(InterfaceC21030c metricWriter, InterfaceC31766c crashReporter, C21132b0 metricParser, InterfaceC14868d currentScreenTracker) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(metricParser, "metricParser");
        AbstractC22676k.m65750j(currentScreenTracker, "currentScreenTracker");
        this.metricWriter = metricWriter;
        this.crashReporter = crashReporter;
        this.metricParser = metricParser;
        this.currentScreenTracker = currentScreenTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m59397b(C21160p c21160p, String str, AbstractC12939a0 abstractC12939a0, C12977n0 destination, Bundle bundle) {
        AbstractC22676k.m65750j(abstractC12939a0, "<unused var>");
        AbstractC22676k.m65750j(destination, "destination");
        c21160p.m59398c(destination, str, bundle);
    }

    /* JADX INFO: renamed from: c */
    private final void m59398c(C12977n0 destination, String prefix, Bundle arguments) {
        String strM59399d = m59399d(arguments);
        if (strM59399d == null) {
            strM59399d = AbstractC21162q.m59405d(destination, prefix);
        }
        Map<String, Object> mapM59400e = m59400e(arguments);
        String str = this.previousDestinationTag;
        Map<String, Object> mapM59400e2 = m59400e(this.previousArgs);
        this.previousDestinationTag = strM59399d;
        this.previousArgs = arguments;
        m59401f(str, mapM59400e2, strM59399d, mapM59400e);
    }

    /* JADX INFO: renamed from: d */
    private final String m59399d(Bundle arguments) {
        MetricEventModel metricEventModelM58967c = this.metricParser.m58967c(arguments);
        if (metricEventModelM58967c != null) {
            return metricEventModelM58967c.getFeatureName();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private final Map<String, Object> m59400e(Bundle bundle) {
        if (bundle == null) {
            return C25272z.f99163w;
        }
        Set<String> setKeySet = bundle.keySet();
        AbstractC22676k.m65749i(setKeySet, "keySet(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!AbstractC22676k.m65745e((String) obj, "android-support-nav:controller:deepLinkIntent")) {
                arrayList.add(obj);
            }
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(obj2, bundle.get((String) obj2));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: f */
    private final void m59401f(String fromTag, Map<String, ? extends Object> fromArgs, String toTag, Map<String, ? extends Object> toArgs) {
        this.crashReporter.mo98624c("destination", toTag);
        this.currentScreenTracker.mo42893a(new C14866b(AbstractC21162q.m59404c(toTag)));
        C26463f c26463f = new C26463f();
        if (!fromArgs.isEmpty()) {
            c26463f.put("from_arguments", fromArgs);
        }
        if (!toArgs.isEmpty()) {
            c26463f.put("to_arguments", toArgs);
        }
        this.crashReporter.mo98629n(fromTag, toTag, c26463f.m78380b());
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        if (fromTag != null) {
            c26460cM119000x.add("from:" + AbstractC21162q.m59404c(fromTag));
        }
        c26460cM119000x.add("to:" + AbstractC21162q.m59404c(toTag));
        this.metricWriter.mo58701b(new C22047a(0, NotificationCompat.CATEGORY_NAVIGATION, null, AbstractC37056f.m118988k(c26460cM119000x), null, 21, null));
    }

    @Override // j02.InterfaceC21153l0
    /* JADX INFO: renamed from: J */
    public void mo59004J(String navigationTag) {
        AbstractC22676k.m65750j(navigationTag, "navigationTag");
        C25272z c25272z = C25272z.f99163w;
        m59401f(null, c25272z, navigationTag, c25272z);
    }

    @Override // j02.InterfaceC21153l0
    /* JADX INFO: renamed from: T */
    public void mo59005T(String fromDestinationTag, String toDestinationTag) {
        AbstractC22676k.m65750j(toDestinationTag, "toDestinationTag");
        C25272z c25272z = C25272z.f99163w;
        m59401f(fromDestinationTag, c25272z, toDestinationTag, c25272z);
    }

    @Override // j02.InterfaceC21153l0
    /* JADX INFO: renamed from: a0 */
    public void mo59006a0(C12977n0 currentDestination) {
        if (currentDestination != null) {
            this.crashReporter.mo98624c("destination", AbstractC21162q.m59406e(currentDestination, null, 1, null));
        }
    }

    @Override // j02.InterfaceC21153l0
    /* JADX INFO: renamed from: i */
    public void mo59007i(AbstractC12939a0 navController, final String prefix) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(prefix, "prefix");
        navController.m36388b(new InterfaceC12990u() { // from class: j02.o
            @Override // p114eb.InterfaceC12990u
            /* JADX INFO: renamed from: a */
            public final void mo36501a(AbstractC12939a0 abstractC12939a0, C12977n0 c12977n0, Bundle bundle) {
                C21160p.m59397b(this.f80679a, prefix, abstractC12939a0, c12977n0, bundle);
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        super.onCreate(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.crashReporter.mo98623b("destination");
    }
}
