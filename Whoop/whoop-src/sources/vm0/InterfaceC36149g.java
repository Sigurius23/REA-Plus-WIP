package vm0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import nm0.C26832c;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import xm0.InterfaceC38457a;
import ym0.AbstractC39649b;

/* JADX INFO: renamed from: vm0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H¦@¢\u0006\u0004\b$\u0010%¨\u0006&À\u0006\u0003"}, m65681d2 = {"Lvm0/g;", "", "Lym0/b;", "result", "Ll83/a0;", "j", "(Lym0/b;)V", "T", "Lxm0/a;", "", "statusCode", "c", "(Lxm0/a;Ljava/lang/Integer;)V", "Lnm0/c;", "request", "Lvm0/h;", "lifecycle", "b", "(Lnm0/c;Lvm0/h;)V", "", "uri", "", "throwable", "a", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "endpoint", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "g", "(I)V", "e", "()V", "Lvm0/f;", "operation", "f", "(Lvm0/f;)V", "d", "(Lq83/d;)Ljava/lang/Object;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC36149g {
    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m114987i(InterfaceC36149g interfaceC36149g, InterfaceC38457a interfaceC38457a, Integer num, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportApiStreamResult");
        }
        if ((i13 & 2) != 0) {
            num = null;
        }
        interfaceC36149g.mo114990c(interfaceC38457a, num);
    }

    /* JADX INFO: renamed from: a */
    void mo114988a(String uri, Throwable throwable);

    /* JADX INFO: renamed from: b */
    <T> void mo114989b(C26832c<T> request, EnumC36150h lifecycle);

    /* JADX INFO: renamed from: c */
    <T> void mo114990c(InterfaceC38457a<T> result, Integer statusCode);

    /* JADX INFO: renamed from: d */
    Object mo114991d(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    void mo114992e();

    /* JADX INFO: renamed from: f */
    void mo114993f(EnumC36148f operation);

    /* JADX INFO: renamed from: g */
    void mo114994g(int statusCode);

    /* JADX INFO: renamed from: h */
    void mo114995h(String uri, String endpoint, Throwable throwable);

    /* JADX INFO: renamed from: j */
    void mo114996j(AbstractC39649b result);
}
