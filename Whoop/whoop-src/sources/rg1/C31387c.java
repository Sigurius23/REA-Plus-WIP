package rg1;

import androidx.core.app.NotificationCompat;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import gt0.InterfaceC16186h;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: rg1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lrg1/c;", "", "<init>", "()V", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "Lec3/p1;", "Lgt0/h;", "c", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/p1;", "whoopFwDevice", "", "d", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Z", "Lec3/f2;", "b", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/f2;", NotificationCompat.CATEGORY_PROGRESS, "Ll83/a0;", "a", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lgt0/h;Lq83/d;)Ljava/lang/Object;", "", "f", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)I", "e", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "retryCount", "stateMachine", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31387c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, Integer> retryCount = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, InterfaceC13075p1> stateMachine = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    private final InterfaceC13075p1 m96647c(WhoopFwDevice device) {
        this.stateMachine.put(device.getSerial(), AbstractC13091v.m36593c(InterfaceC16186h.h.f61490b));
        InterfaceC13075p1 interfaceC13075p1 = this.stateMachine.get(device.getSerial());
        AbstractC22676k.m65747g(interfaceC13075p1);
        return interfaceC13075p1;
    }

    /* JADX INFO: renamed from: a */
    public final Object m96648a(WhoopFwDevice whoopFwDevice, InterfaceC16186h interfaceC16186h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zContainsKey = this.stateMachine.containsKey(whoopFwDevice.getSerial());
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zContainsKey) {
            ((C13045h2) m96647c(whoopFwDevice)).emit(interfaceC16186h, interfaceC30057d);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            return c23454a0;
        }
        InterfaceC13075p1 interfaceC13075p1 = this.stateMachine.get(whoopFwDevice.getSerial());
        AbstractC22676k.m65747g(interfaceC13075p1);
        ((C13045h2) interfaceC13075p1).emit(interfaceC16186h, interfaceC30057d);
        EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
        return c23454a0;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13037f2 m96649b(WhoopFwDevice whoopFwDevice) {
        AbstractC22676k.m65750j(whoopFwDevice, "whoopFwDevice");
        InterfaceC13075p1 interfaceC13075p1M96647c = this.stateMachine.get(whoopFwDevice.getSerial());
        if (interfaceC13075p1M96647c == null) {
            interfaceC13075p1M96647c = m96647c(whoopFwDevice);
        }
        return AbstractC13091v.m36598h(interfaceC13075p1M96647c);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m96650d(WhoopFwDevice whoopFwDevice) {
        AbstractC22676k.m65750j(whoopFwDevice, "whoopFwDevice");
        if (!this.stateMachine.containsKey(whoopFwDevice.getSerial())) {
            return false;
        }
        InterfaceC13075p1 interfaceC13075p1 = this.stateMachine.get(whoopFwDevice.getSerial());
        return (interfaceC13075p1 != null ? (InterfaceC16186h) ((C13045h2) interfaceC13075p1).getValue() : null) instanceof InterfaceC16186h.g;
    }

    /* JADX INFO: renamed from: e */
    public final void m96651e(WhoopFwDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.retryCount.put(device.getSerial(), 0);
    }

    /* JADX INFO: renamed from: f */
    public final int m96652f(WhoopFwDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.retryCount.put(device.getSerial(), Integer.valueOf(this.retryCount.getOrDefault(device.getSerial(), 0).intValue() + 1));
        Integer num = this.retryCount.get(device.getSerial());
        AbstractC22676k.m65747g(num);
        return num.intValue();
    }
}
