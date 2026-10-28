package g92;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import ci2.InterfaceC4733b;
import cu0.InterfaceC11114b;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import nt0.AbstractC27120h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: g92.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001a\u0010.\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001a\u00101\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'¨\u00062"}, m65681d2 = {"Lg92/c;", "Lg92/b;", "Ltd1/b;", "whoopStrapProxy", "Lci2/b;", "whoopStrapProvider", "Lcu0/b;", "rawDataRepository", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltd1/b;Lci2/b;Lcu0/b;Lbc3/c0;)V", "a", "Ltd1/b;", "b", "Lci2/b;", "c", "Lcu0/b;", "d", "Lbc3/c0;", "Ltr2/n;", "e", "Ltr2/n;", "logger", "", "Lnt0/h;", "f", "Ljava/util/List;", "rawDataBurst", "Lec3/o1;", "", "", "g", "Lec3/o1;", "_validatedRawDataMetaDataBurst", "Lg92/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lg92/a;", "getR10DataPackets", "()Lg92/a;", "r10DataPackets", "i", "getR11DataPackets", "r11DataPackets", "j", "getR20DataPackets", "r20DataPackets", "k", "getR21DataPackets", "r21DataPackets", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15607c implements InterfaceC15606b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC11114b rawDataRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<AbstractC27120h> rawDataBurst;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13072o1 _validatedRawDataMetaDataBurst;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C15605a r10DataPackets;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C15605a r11DataPackets;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C15605a r20DataPackets;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C15605a r21DataPackets;

    public C15607c(InterfaceC33704b whoopStrapProxy, InterfaceC4733b whoopStrapProvider, InterfaceC11114b rawDataRepository, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(rawDataRepository, "rawDataRepository");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.whoopStrapProxy = whoopStrapProxy;
        this.whoopStrapProvider = whoopStrapProvider;
        this.rawDataRepository = rawDataRepository;
        this.coroutineScope = coroutineScope;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("RawDataCollector");
        List<AbstractC27120h> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC22676k.m65749i(listSynchronizedList, "synchronizedList(...)");
        this.rawDataBurst = listSynchronizedList;
        this._validatedRawDataMetaDataBurst = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38983x, 2);
        this.r10DataPackets = new C15605a(listSynchronizedList, (short) 10);
        this.r11DataPackets = new C15605a(listSynchronizedList, (short) 11);
        this.r20DataPackets = new C15605a(listSynchronizedList, (short) 20);
        this.r21DataPackets = new C15605a(listSynchronizedList, (short) 21);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15607c(InterfaceC33704b interfaceC33704b, InterfaceC4733b interfaceC4733b, InterfaceC11114b interfaceC11114b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 8) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0 = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d()));
        }
        this(interfaceC33704b, interfaceC4733b, interfaceC11114b, interfaceC2994c0);
    }
}
