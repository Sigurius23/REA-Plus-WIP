package sg1;

import com.mapbox.maps.MapboxMap;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.firmwareUpdateService.data.models.ChipFirmwareVersion;
import gt0.InterfaceC16186h;
import ht0.EnumC17623a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23468n;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: sg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u0013J(\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\nH¦@¢\u0006\u0004\b!\u0010\u001fJ \u0010#\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\"\u001a\u00020 H¦@¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\nH¦@¢\u0006\u0004\b%\u0010\u001f¨\u0006&À\u0006\u0003"}, m65681d2 = {"Lsg1/a;", "", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "", "isSuccessful", "Ll83/n;", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;ZLq83/d;)Ljava/lang/Object;", "", "key", "Lht0/a;", "chip", "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;", "a", "(Ljava/lang/String;Lht0/a;Lq83/d;)Ljava/lang/Object;", "Lgt0/h;", "k", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;", "i", "d", "serial", "firmwareVersion", "", MapboxMap.QFE_OFFSET, "f", "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "j", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "e", "time", "c", "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "g", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC32449a {
    /* JADX INFO: renamed from: a */
    Object mo84244a(String str, EnumC17623a enumC17623a, InterfaceC30057d<? super ChipFirmwareVersion> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo84245b(String str, String str2, InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo84246c(String str, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    Object mo84247d(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    Object mo84248e(String str, InterfaceC30057d<? super Long> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    Object mo84249f(String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: g */
    Object mo84250g(String str, InterfaceC30057d<? super Long> interfaceC30057d);

    /* JADX INFO: renamed from: h */
    Object mo84251h(WhoopFwDevice whoopFwDevice, boolean z4, InterfaceC30057d<? super C23468n> interfaceC30057d);

    /* JADX INFO: renamed from: i */
    Object mo84252i(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: j */
    Object mo84253j(String str, InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: k */
    Object mo84254k(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super InterfaceC16186h> interfaceC30057d);
}
