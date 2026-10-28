package vm0;

import com.whoop.metrics.domain.models.MetricPostType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jy1.C22047a;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vm0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0001*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lvm0/a;", "", HMSTrackSource.SCREEN, "", "Ljy1/a;", "g", "(Lvm0/a;Ljava/lang/String;)Ljava/util/List;", "name", "", "tags", "b", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;", "", "value", "d", "(Ljava/lang/String;DLjava/lang/String;)Ljy1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "f", "(I)Ljava/lang/String;", "cache_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36147e {
    /* JADX INFO: renamed from: b */
    private static final C22047a m114980b(String str, String[] strArr, String str2) {
        return new C22047a(0, str, null, m114986h(AbstractC25260n.m74049W0(strArr), str2), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C22047a m114981c(String str, String[] strArr, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        return m114980b(str, strArr, str2);
    }

    /* JADX INFO: renamed from: d */
    private static final C22047a m114982d(String str, double d3, String str2) {
        return new C22047a(0, str, Double.valueOf(d3), m114986h(C25271y.f99162w, str2), MetricPostType.DISTRIBUTION, 1, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22047a m114983e(String str, double d3, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        return m114982d(str, d3, str2);
    }

    /* JADX INFO: renamed from: f */
    private static final String m114984f(int i13) {
        return i13 > 0 ? String.valueOf(i13) : "io";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final List<C22047a> m114985g(InterfaceC36143a interfaceC36143a, String str) {
        if (interfaceC36143a instanceof InterfaceC36143a.b) {
            InterfaceC36143a.b bVar = (InterfaceC36143a.b) interfaceC36143a;
            return AbstractC37056f.m118959K(m114980b("bff_cache.result", new String[]{"result:hit", AbstractC11266d.m30461o("source:", bVar.getSource().getTag())}, str), m114982d("bff_cache.staleness_ms", bVar.getAgeMs(), str));
        }
        if (AbstractC22676k.m65745e(interfaceC36143a, InterfaceC36143a.d.f154651a)) {
            return AbstractC37056f.m118958J(m114980b("bff_cache.result", new String[]{"result:miss"}, str));
        }
        if (interfaceC36143a instanceof InterfaceC36143a.g) {
            return AbstractC37056f.m118958J(m114980b("bff_cache.network", new String[]{((InterfaceC36143a.g) interfaceC36143a).getSuccess() ? "network:success" : "network:failure"}, str));
        }
        if (interfaceC36143a instanceof InterfaceC36143a.f) {
            return AbstractC37056f.m118958J(m114980b("bff_cache.miss_and_network_failure", new String[]{AbstractC11266d.m30461o("status:", m114984f(((InterfaceC36143a.f) interfaceC36143a).getStatusCode()))}, str));
        }
        if (AbstractC22676k.m65745e(interfaceC36143a, InterfaceC36143a.e.f154652a)) {
            return AbstractC37056f.m118958J(m114980b("bff_cache.miss_and_decode_failure", new String[0], str));
        }
        if (interfaceC36143a instanceof InterfaceC36143a.a) {
            return AbstractC37056f.m118958J(m114980b("bff_cache.decode_failure", new String[0], str));
        }
        if (interfaceC36143a instanceof InterfaceC36143a.h) {
            return AbstractC37056f.m118958J(m114980b("whoop.api.status_code", new String[]{"decode_error:true", AbstractC11266d.m30461o("http_endpoint:", ((InterfaceC36143a.h) interfaceC36143a).getEndpoint())}, str));
        }
        if (!(interfaceC36143a instanceof InterfaceC36143a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC36143a.c cVar = (InterfaceC36143a.c) interfaceC36143a;
        return AbstractC37056f.m118959K(m114981c("bff_cache.maintenance", new String[0], null, 4, null), m114983e("bff_cache.maintenance.duration_ms", cVar.getDurationMs(), null, 4, null), m114983e("bff_cache.maintenance.rows_deleted", cVar.getRowsDeleted(), null, 4, null));
    }

    /* JADX INFO: renamed from: h */
    private static final List<String> m114986h(List<String> list, String str) {
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return list;
        }
        return AbstractC25265s.m74128f1("screen:".concat(str), list);
    }
}
