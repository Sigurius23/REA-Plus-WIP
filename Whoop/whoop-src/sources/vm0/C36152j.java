package vm0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import java.util.Locale;
import l83.C23454a0;
import mm0.InterfaceC25682a;
import nm0.C26832c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import xm0.InterfaceC38457a;
import ym0.AbstractC39649b;

/* JADX INFO: renamed from: vm0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00103¨\u00064"}, m65681d2 = {"Lvm0/j;", "Lvm0/g;", "Lmm0/a;", "bffCache", "Lrr2/c;", "crashReporter", "Lvm0/b;", "events", "Ltr2/n;", "logger", "<init>", "(Lmm0/a;Lrr2/c;Lvm0/b;Ltr2/n;)V", "Lym0/b;", "result", "Ll83/a0;", "j", "(Lym0/b;)V", "T", "Lxm0/a;", "", "statusCode", "c", "(Lxm0/a;Ljava/lang/Integer;)V", "Lnm0/c;", "request", "Lvm0/h;", "lifecycle", "b", "(Lnm0/c;Lvm0/h;)V", "", "uri", "", "throwable", "a", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "endpoint", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "()V", "g", "(I)V", "Lvm0/f;", "operation", "f", "(Lvm0/f;)V", "d", "(Lq83/d;)Ljava/lang/Object;", "Lmm0/a;", "Lrr2/c;", "Lvm0/b;", "Ltr2/n;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36152j implements InterfaceC36149g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25682a bffCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C36144b events;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vm0.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f154673a;

        static {
            int[] iArr = new int[EnumC36150h.values().length];
            try {
                iArr[EnumC36150h.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f154673a = iArr;
        }
    }

    /* JADX INFO: renamed from: vm0.j$b */
    @InterfaceC32271e(m100429c = "com.whoop.cache.reporting.RealCacheReporter", m100430f = "RealCacheReporter.kt", m100431l = {73}, m100432m = "reportCacheSize", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f154674w;

        /* JADX INFO: renamed from: y */
        int f154676y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f154674w = obj;
            this.f154676y |= Integer.MIN_VALUE;
            return C36152j.this.mo114991d(this);
        }
    }

    public C36152j(InterfaceC25682a bffCache, InterfaceC31766c crashReporter, C36144b events, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(bffCache, "bffCache");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(events, "events");
        AbstractC22676k.m65750j(logger, "logger");
        this.bffCache = bffCache;
        this.crashReporter = crashReporter;
        this.events = events;
        this.logger = logger;
    }

    @Override // vm0.InterfaceC36149g
    /* JADX INFO: renamed from: a */
    public void mo114988a(String uri, Throwable throwable) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(throwable, "throwable");
        this.logger.mo85230v(AbstractC11895b.m31996o("Cache decode failed for uri: ", uri, "; evicting entry and treating as a miss"), throwable, new AbstractC30556a.a[0]);
        this.events.m114975a(new InterfaceC36143a.a(uri));
    }

    @Override // vm0.InterfaceC36149g
    /* JADX INFO: renamed from: b */
    public <T> void mo114989b(C26832c<T> request, EnumC36150h lifecycle) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        String uri = request.getUri();
        if (uri == null) {
            uri = request.m80074a().getPath();
        }
        String str = "prefetch for " + uri + " " + lifecycle;
        if (a.f154673a[lifecycle.ordinal()] == 1) {
            this.logger.mo85222m(str, new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85228t(str, new AbstractC30556a.a[0]);
        }
    }

    @Override // vm0.InterfaceC36149g
    /* JADX INFO: renamed from: c */
    public <T> void mo114990c(InterfaceC38457a<T> result, Integer statusCode) {
        AbstractC22676k.m65750j(result, "result");
        if (!(result instanceof InterfaceC38457a.a)) {
            if (result instanceof InterfaceC38457a.c) {
                this.events.m114975a(new InterfaceC36143a.g(true));
                return;
            }
            return;
        }
        this.logger.mo85228t("Cache ApiStreamError: Code: " + statusCode + " Message: " + ((InterfaceC38457a.a) result).getErrorMessage(), new AbstractC30556a.a[0]);
        this.events.m114975a(new InterfaceC36143a.g(false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vm0.InterfaceC36149g
    /* JADX INFO: renamed from: d */
    public Object mo114991d(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f154676y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f154676y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo75626i = bVar.f154674w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f154676y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75626i);
            InterfaceC25682a interfaceC25682a = this.bffCache;
            bVar.f154676y = 1;
            objMo75626i = interfaceC25682a.mo75626i(bVar);
            if (objMo75626i == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo75626i);
        }
        this.crashReporter.mo98624c("bff_cache_size", String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{new Float(((Number) objMo75626i).intValue() / 1024.0f)}, 1)));
        return C23454a0.f92919a;
    }

    @Override // vm0.InterfaceC36149g
    /* JADX INFO: renamed from: e */
    public void mo114992e() {
        this.logger.mo85228t("Cache miss with response decode failure", new AbstractC30556a.a[0]);
        this.events.m114975a(InterfaceC36143a.e.f154652a);
    }

    @Override // vm0.InterfaceC36149g
    /* JADX INFO: renamed from: f */
    public void mo114993f(EnumC36148f operation) {
        AbstractC22676k.m65750j(operation, "operation");
        InterfaceC31766c.m98635q(this.crashReporter, AbstractC11266d.m30461o("bff_cache ", operation.getTag()), null, 2, null);
    }

    @Override // vm0.InterfaceC36149g
    /* JADX INFO: renamed from: g */
    public void mo114994g(int statusCode) {
        this.logger.mo85228t(AbstractC2875y.m8295h(statusCode, "Cache miss with network failure; statusCode: "), new AbstractC30556a.a[0]);
        this.events.m114975a(new InterfaceC36143a.f(statusCode));
    }

    @Override // vm0.InterfaceC36149g
    /* JADX INFO: renamed from: h */
    public void mo114995h(String uri, String endpoint, Throwable throwable) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(endpoint, "endpoint");
        AbstractC22676k.m65750j(throwable, "throwable");
        this.logger.mo85230v(AbstractC11895b.m31996o("Network response decode failed for uri: ", uri, "; evicting entry"), throwable, new AbstractC30556a.a[0]);
        this.events.m114975a(new InterfaceC36143a.a(uri));
        this.events.m114975a(new InterfaceC36143a.h(endpoint));
    }

    @Override // vm0.InterfaceC36149g
    /* JADX INFO: renamed from: j */
    public void mo114996j(AbstractC39649b result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof AbstractC39649b.b) {
            this.logger.mo85228t(AbstractC11266d.m30461o("Cache miss for uri: ", ((AbstractC39649b.b) result).getUri()), new AbstractC30556a.a[0]);
        } else {
            if (!(result instanceof AbstractC39649b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85228t(AbstractC11266d.m30461o("Cache hit for uri: ", ((AbstractC39649b.a) result).getEntry().getUri()), new AbstractC30556a.a[0]);
        }
    }

    public /* synthetic */ C36152j(InterfaceC25682a interfaceC25682a, InterfaceC31766c interfaceC31766c, C36144b c36144b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25682a, interfaceC31766c, c36144b, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CacheReporter") : interfaceC34116n);
    }
}
