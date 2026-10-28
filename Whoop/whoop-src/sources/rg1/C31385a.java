package rg1;

import ci2.AbstractC4732a;
import ci2.InterfaceC4733b;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import ec3.InterfaceC13058l;
import gt0.AbstractC16184f;
import gt0.AbstractC16185g;
import gt0.EnumC16180b;
import gt0.EnumC16181c;
import gt0.InterfaceC16182d;
import gt0.InterfaceC16183e;
import gt0.InterfaceC16186h;
import jk0.InterfaceC21750d;
import kotlinx.serialization.SerializationException;
import p007a6.C0456u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wg1.InterfaceC37262a;

/* JADX INFO: renamed from: rg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lrg1/a;", "Lgt0/e;", "Ltr2/n;", "logger", "Lci2/b;", "whoopStrapProvider", "Lrg1/b;", "firmwareUpdateManager", "Lwg1/a;", "firmwareUpdateScheduler", "Lgt0/d;", "firmwareAnalyticsHelper", "<init>", "(Ltr2/n;Lci2/b;Lrg1/b;Lwg1/a;Lgt0/d;)V", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "", "userAcceptanceRequired", "Lec3/l;", "Lgt0/h;", "c", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)Lec3/l;", "a", "()Z", "Lgt0/g;", "action", "b", "(Lgt0/g;)Lec3/l;", "Ltr2/n;", "Lci2/b;", "Lrg1/b;", "d", "Lwg1/a;", "e", "Lgt0/d;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31385a implements InterfaceC16183e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC31386b firmwareUpdateManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC37262a firmwareUpdateScheduler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC16182d firmwareAnalyticsHelper;

    public C31385a(InterfaceC34116n logger, InterfaceC4733b whoopStrapProvider, InterfaceC31386b firmwareUpdateManager, InterfaceC37262a firmwareUpdateScheduler, InterfaceC16182d firmwareAnalyticsHelper) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(firmwareUpdateManager, "firmwareUpdateManager");
        AbstractC22676k.m65750j(firmwareUpdateScheduler, "firmwareUpdateScheduler");
        AbstractC22676k.m65750j(firmwareAnalyticsHelper, "firmwareAnalyticsHelper");
        this.logger = logger;
        this.whoopStrapProvider = whoopStrapProvider;
        this.firmwareUpdateManager = firmwareUpdateManager;
        this.firmwareUpdateScheduler = firmwareUpdateScheduler;
        this.firmwareAnalyticsHelper = firmwareAnalyticsHelper;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC13058l m96646c(WhoopFwDevice device, boolean userAcceptanceRequired) {
        try {
            this.firmwareUpdateScheduler.mo119424a(device, userAcceptanceRequired);
            return this.firmwareUpdateManager.mo64846d(device);
        } catch (SerializationException e5) {
            this.logger.mo85230v("Failed to serialize WhoopFwDevice to String", e5, new AbstractC30556a.a[0]);
            return new C0456u(new InterfaceC16186h.b(AbstractC16184f.i.f61477b, false, 2, null), 1);
        } catch (IllegalArgumentException e13) {
            this.logger.mo85230v("Something went wrong when trying to serialize WhoopFwDevice to String", e13, new AbstractC30556a.a[0]);
            return new C0456u(new InterfaceC16186h.b(AbstractC16184f.i.f61477b, false, 2, null), 1);
        }
    }

    @Override // gt0.InterfaceC16183e
    /* JADX INFO: renamed from: a */
    public boolean mo45720a() throws IllegalAccessException {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
        boolean z4 = false;
        if (interfaceC21750d != null) {
            WhoopFwDevice whoopFwDeviceM14816b = AbstractC4732a.m14816b(interfaceC21750d);
            InterfaceC16186h interfaceC16186h = (InterfaceC16186h) this.firmwareUpdateManager.mo64846d(whoopFwDeviceM14816b).getValue();
            if ((interfaceC16186h instanceof InterfaceC16186h.g) && ((InterfaceC16186h.g) interfaceC16186h).getIsForeground()) {
                z4 = true;
            }
            if (z4) {
                InterfaceC16182d.m45716a(this.firmwareAnalyticsHelper, EnumC16180b.LIVE_FEATURE, EnumC16181c.BLOCKED, null, whoopFwDeviceM14816b.getDeviceName().name(), null, null, 48, null);
            }
        }
        return z4;
    }

    @Override // gt0.InterfaceC16183e
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo45721b(AbstractC16185g action) {
        AbstractC22676k.m65750j(action, "action");
        if (action instanceof AbstractC16185g.b) {
            return this.firmwareUpdateManager.mo64847e(action.getDevice());
        }
        if (action instanceof AbstractC16185g.a) {
            return m96646c(action.getDevice(), true);
        }
        if (action instanceof AbstractC16185g.e) {
            return m96646c(action.getDevice(), false);
        }
        if (action instanceof AbstractC16185g.d) {
            return this.firmwareUpdateManager.mo64846d(action.getDevice());
        }
        if (action instanceof AbstractC16185g.f) {
            return this.firmwareUpdateManager.mo64845c(action.getDevice());
        }
        if (action instanceof AbstractC16185g.c) {
            return this.firmwareUpdateManager.mo64844b(action.getDevice());
        }
        throw new NoWhenBranchMatchedException();
    }
}
