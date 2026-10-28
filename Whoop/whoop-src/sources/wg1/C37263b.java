package wg1;

import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.firmwareUpdateService.workmanager.FirmwareUpdateWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18363i0;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p420qc.C30207q;
import p457rc.C31222e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qr2.AbstractC30556a;
import rg1.C31387c;
import tr2.InterfaceC34116n;
import vg1.AbstractC36028a;

/* JADX INFO: renamed from: wg1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lwg1/b;", "Lwg1/a;", "Ltr2/n;", "logger", "Lic/p0;", "workManager", "Lrg1/c;", "fwUpdateStateMachine", "<init>", "(Ltr2/n;Lic/p0;Lrg1/c;)V", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "", "userAcceptanceRequired", "Ll83/a0;", "b", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)V", "a", "Ltr2/n;", "Lic/p0;", "c", "Lrg1/c;", "d", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37263b implements InterfaceC37262a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31387c fwUpdateStateMachine;

    public C37263b(InterfaceC34116n logger, AbstractC18377p0 workManager, C31387c fwUpdateStateMachine) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(fwUpdateStateMachine, "fwUpdateStateMachine");
        this.logger = logger;
        this.workManager = workManager;
        this.fwUpdateStateMachine = fwUpdateStateMachine;
    }

    /* JADX INFO: renamed from: b */
    private final void m119425b(WhoopFwDevice device, boolean userAcceptanceRequired) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("whoopDeviceSerialized", AbstractC36028a.m114390b(device));
        linkedHashMap.put("userAcceptanceRequired", Boolean.valueOf(userAcceptanceRequired));
        C18358g c18358g = new C18358g(linkedHashMap);
        AbstractC29125c.m88515X(c18358g);
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C18354e c18354e = new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
        C18392z c18392z = new C18392z(FirmwareUpdateWorker.class);
        EnumC18363i0 enumC18363i0 = EnumC18363i0.f71494w;
        C30207q c30207q = c18392z.f71544c;
        c30207q.f123650q = true;
        c30207q.f123651r = enumC18363i0;
        C18347a0 c18347a0 = (C18347a0) ((C18392z) ((C18392z) ((C18392z) c18392z.m52882h(c18358g)).m52880f(c18354e)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
        String strM30461o = AbstractC11266d.m30461o("FirmwareUpdateWorker_", device.getSerial());
        this.logger.mo85216g(AbstractC11266d.m30461o("Enqueueing ", strM30461o), new AbstractC30556a.a[0]);
        this.workManager.m52876e(strM30461o, EnumC18368l.f71503w, c18347a0);
    }

    @Override // wg1.InterfaceC37262a
    /* JADX INFO: renamed from: a */
    public void mo119424a(WhoopFwDevice device, boolean userAcceptanceRequired) {
        AbstractC22676k.m65750j(device, "device");
        if (!userAcceptanceRequired) {
            m119425b(device, userAcceptanceRequired);
            return;
        }
        if (userAcceptanceRequired && !this.fwUpdateStateMachine.m96650d(device)) {
            m119425b(device, userAcceptanceRequired);
            return;
        }
        this.logger.mo85216g("Firmware update already in progress for device: " + device.getDeviceName(), new AbstractC30556a.a[0]);
    }
}
