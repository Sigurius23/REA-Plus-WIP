package bi2;

import aq0.C1899j;
import bc3.InterfaceC2994c0;
import be1.C3169c;
import ec3.AbstractC13091v;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import ih0.AbstractC18489d0;
import java.util.concurrent.ConcurrentHashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yh2.EnumC39542a;
import yh2.InterfaceC39545d;

/* JADX INFO: renamed from: bi2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001a0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Lbi2/j;", "", "Lbc3/c0;", "scope", "Lyh2/d;", "watermarkDatabaseProvider", "<init>", "(Lbc3/c0;Lyh2/d;)V", "", "serial", "Lyh2/a;", "type", "f", "(Ljava/lang/String;Lyh2/a;)Ljava/lang/String;", "deviceSerial", "Lec3/f2;", "", "c", "(Ljava/lang/String;Lyh2/a;)Lec3/f2;", "a", "Lbc3/c0;", "b", "Lyh2/d;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "localStorageWatermarks", "Lec3/p1;", "d", "highWaterMarks", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3294j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39545d watermarkDatabaseProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, InterfaceC13037f2> localStorageWatermarks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, InterfaceC13075p1> highWaterMarks;

    public C3294j(InterfaceC2994c0 scope, InterfaceC39545d watermarkDatabaseProvider) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(watermarkDatabaseProvider, "watermarkDatabaseProvider");
        this.scope = scope;
        this.watermarkDatabaseProvider = watermarkDatabaseProvider;
        this.localStorageWatermarks = new ConcurrentHashMap<>();
        this.highWaterMarks = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC13037f2 m9584d(C3294j c3294j, EnumC39542a enumC39542a, String it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC13091v.m36587M(c3294j.watermarkDatabaseProvider.mo66479a(enumC39542a), c3294j.scope, C13105z1.m36630a(3, 0L), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC13037f2 m9585e(Function1 function1, Object obj) {
        return (InterfaceC13037f2) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    private final String m9586f(String serial, EnumC39542a type) {
        return AbstractC18489d0.m53370k(serial, ":", type.name());
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13037f2 m9587c(String deviceSerial, EnumC39542a type) {
        AbstractC22676k.m65750j(deviceSerial, "deviceSerial");
        AbstractC22676k.m65750j(type, "type");
        InterfaceC13037f2 interfaceC13037f2ComputeIfAbsent = this.localStorageWatermarks.computeIfAbsent(m9586f(deviceSerial, type), new C1899j(new C3169c(2, this, type), 1));
        AbstractC22676k.m65749i(interfaceC13037f2ComputeIfAbsent, "computeIfAbsent(...)");
        return interfaceC13037f2ComputeIfAbsent;
    }
}
