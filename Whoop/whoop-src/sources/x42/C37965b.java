package x42;

import c52.C4253d;
import com.whoop.puffin.sync.AbstractC9824g;
import com.whoop.puffin.sync.InterfaceC9823f;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import l83.C23454a0;
import m83.C25271y;
import oh2.InterfaceC27939b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: x42.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0011J*\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0019\u0010\u0011J \u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b \u0010\u001fJ\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006$"}, m65681d2 = {"Lx42/b;", "", "Liy1/c;", "metricWriter", "<init>", "(Liy1/c;)V", "Lkotlin/time/Duration;", AttachmentExtensionsKt.EXTRA_DURATION, "", "a", "(J)Ljava/lang/String;", "Lcom/whoop/puffin/sync/f$b;", "state", "k", "(Lcom/whoop/puffin/sync/f$b;)Ljava/lang/String;", "Ll83/a0;", "b", "(Lq83/d;)Ljava/lang/Object;", "e", "Lc52/d;", "batteryPackMetadata", "d", "(Lcom/whoop/puffin/sync/f$b;JLc52/d;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "j", "", "isConsole", "", "count", "i", "(ZILq83/d;)Ljava/lang/Object;", "g", "c", "(ZLq83/d;)Ljava/lang/Object;", "Liy1/c;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37965b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    public C37965b(InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.metricWriter = metricWriter;
    }

    /* JADX INFO: renamed from: a */
    private final String m121593a(long duration) {
        long jM134276getInWholeSecondsimpl = Duration.m134276getInWholeSecondsimpl(duration);
        if (jM134276getInWholeSecondsimpl < 10) {
            return "0-9";
        }
        if (jM134276getInWholeSecondsimpl < 30) {
            return "10-29";
        }
        if (jM134276getInWholeSecondsimpl < 60) {
            return "30-59";
        }
        if (jM134276getInWholeSecondsimpl < 120) {
            return "60-119";
        }
        if (jM134276getInWholeSecondsimpl < 300) {
            return "120-299";
        }
        if (jM134276getInWholeSecondsimpl < 600) {
            return "300-599";
        }
        if (jM134276getInWholeSecondsimpl < 1800) {
            return "600-1799";
        }
        return jM134276getInWholeSecondsimpl < 3600 ? "1800-3599" : "3600+";
    }

    /* JADX INFO: renamed from: k */
    private final String m121594k(InterfaceC9823f.b state) {
        if (state instanceof InterfaceC9823f.b.c) {
            return "success";
        }
        if (state instanceof InterfaceC9823f.b.a) {
            return "error";
        }
        if (state instanceof InterfaceC9823f.b.d) {
            return "timeout";
        }
        if (state instanceof InterfaceC9823f.b.C41403b) {
            return "metadata_event_while_not_syncing";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final Object m121595b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "battery_pack.puffin.hps.failure_to_start", null, C25271y.f99162w, null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m121596c(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, AbstractC11895b.m31996o("battery_pack.puffin.hps.upload.", z4 ? "console" : "firmware", ".empty"), null, C25271y.f99162w, null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m121597d(InterfaceC9823f.b bVar, long j7, C4253d c4253d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        InterfaceC27939b firmwareVersion;
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "battery_pack.puffin.hps.outcome", new Double(AbstractC9824g.m23700c(bVar)), AbstractC37056f.m118959K(AbstractC11266d.m30461o("outcome:", m121594k(bVar)), AbstractC11266d.m30461o("duration_bucket:", m121593a(j7)), AbstractC11266d.m30461o("firmware_version:", (c4253d == null || (firmwareVersion = c4253d.getFirmwareVersion()) == null) ? null : firmwareVersion.mo84319a())), null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m121598e(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "battery_pack.puffin.hps.start", null, C25271y.f99162w, null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public final Object m121599f(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "battery_pack.puffin.hps.upload.delete_db_error", null, C25271y.f99162w, null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m121600g(boolean z4, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, AbstractC11895b.m31996o("battery_pack.puffin.hps.upload.", z4 ? "console" : "firmware", ".failure"), new Double(i13), C25271y.f99162w, null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m121601h(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "battery_pack.puffin.hps.upload.read_db_error", null, C25271y.f99162w, null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public final Object m121602i(boolean z4, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, AbstractC11895b.m31996o("battery_pack.puffin.hps.upload.", z4 ? "console" : "firmware", ".success"), new Double(i13), C25271y.f99162w, null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public final Object m121603j(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "battery_pack.puffin.hps.upload.write_file_error", null, C25271y.f99162w, null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }
}
