package kp0;

import bc3.InterfaceC2994c0;
import hj0.AbstractC17356o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.C28180m;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;
import z82.C40191e;

/* JADX INFO: renamed from: kp0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Lkp0/j;", "Lhj0/o;", "Lz82/e;", "eventDispatcher", "Lsr2/y;", "urlProvider", "Lbc3/c0;", "coroutineScope", "<init>", "(Lz82/e;Lsr2/y;Lbc3/c0;)V", "", "source", "Ll83/a0;", "y", "(Ljava/lang/String;)V", "z", "()V", "E", "Lz82/e;", "F", "Lsr2/y;", "G", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "H", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "tonightsSleepUrl", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22743j extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String tonightsSleepUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22743j(C40191e eventDispatcher, AbstractC32943y urlProvider, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.eventDispatcher = eventDispatcher;
        this.urlProvider = urlProvider;
        this.logTag = "OptimalSleepDialogViewModel";
        this.tonightsSleepUrl = AbstractC2875y.m8299l(urlProvider.getApiBaseUrl(), "/url-mapping-service/v1/SLEEP_NEED_CALCULATED");
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getTonightsSleepUrl() {
        return this.tonightsSleepUrl;
    }

    /* JADX INFO: renamed from: y */
    public final void m65851y(String source) {
        AbstractC22676k.m65750j(source, "source");
        this.eventDispatcher.m129043l0("Close", "Sleep Coach - Close Optimal Sleep", "", AbstractC25247g0.m73990Y(new C23465k("source", source), new C23465k("object", "Optimal Sleep")));
    }

    /* JADX INFO: renamed from: z */
    public final void m65852z() {
        this.eventDispatcher.m129031d0("Optimal Sleep", null);
    }

    public /* synthetic */ C22743j(C40191e c40191e, AbstractC32943y abstractC32943y, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40191e, abstractC32943y, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
