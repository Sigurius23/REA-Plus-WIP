package ou0;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import pu0.C29550d;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ou0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\b\u0010\tJV\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH§@¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, m65681d2 = {"Lou0/e;", "", "", "Lpu0/d;", "batteryEventsDtoList", "Ll83/a0;", "insertList", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "c", "(Lq83/d;)Ljava/lang/Object;", "", "serial", "", "hardwareFamily", "pcbaRevision", "firmwareMajor", "firmwareMinor", "firmwarePoint", "firmwareExtra", MapboxMap.QFE_LIMIT, "b", "(Ljava/lang/String;IIIIIIILq83/d;)Ljava/lang/Object;", "type", "e", "(Lpu0/d;ILq83/d;)Ljava/lang/Object;", "", "ids", "a", "([JLq83/d;)Ljava/lang/Object;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC28374e {

    /* JADX INFO: renamed from: ou0.e$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public static Object m86061a(InterfaceC28374e interfaceC28374e, C29550d c29550d, int i13, InterfaceC30057d<? super List<C29550d>> interfaceC30057d) {
            return InterfaceC28374e.super.mo86060e(c29550d, i13, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Object m86056f(InterfaceC28374e interfaceC28374e, C29550d c29550d, int i13, InterfaceC30057d<? super List<C29550d>> interfaceC30057d) {
        return interfaceC28374e.mo86058b(c29550d.getMetaData().getBatterySerial(), c29550d.getMetaData().getHardwareFamily(), c29550d.getMetaData().getPcbaRevision(), c29550d.getMetaData().getFirmwareMajor(), c29550d.getMetaData().getFirmwareMinor(), c29550d.getMetaData().getFirmwarePoint(), c29550d.getMetaData().getFirmwareExtra(), i13, interfaceC30057d);
    }

    /* JADX INFO: renamed from: a */
    Object mo86057a(long[] jArr, InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo86058b(String str, int i13, int i14, int i15, int i16, int i17, int i18, int i19, InterfaceC30057d<? super List<C29550d>> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo86059c(InterfaceC30057d<? super C29550d> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    default Object mo86060e(C29550d c29550d, int i13, InterfaceC30057d<? super List<C29550d>> interfaceC30057d) {
        return m86056f(this, c29550d, i13, interfaceC30057d);
    }

    Object insertList(List<C29550d> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
