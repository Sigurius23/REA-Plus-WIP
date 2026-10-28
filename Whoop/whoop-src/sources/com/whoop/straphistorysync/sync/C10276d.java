package com.whoop.straphistorysync.sync;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/d;", "", "<init>", "()V", "", "deviceSerial", "Lcom/whoop/straphistorysync/sync/a;", "a", "(Ljava/lang/String;)Lcom/whoop/straphistorysync/sync/a;", "Lec3/p1;", "Lcom/whoop/straphistorysync/sync/f;", "b", "(Ljava/lang/String;)Lec3/p1;", "Ljava/lang/Object;", "lock", "", "Ljava/util/Map;", "stateMachine", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10276d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, InterfaceC13075p1> stateMachine = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final AbstractC10273a m26262a(String deviceSerial) {
        AbstractC10273a bVar;
        AbstractC22676k.m65750j(deviceSerial, "deviceSerial");
        synchronized (this.lock) {
            try {
                InterfaceC13075p1 interfaceC13075p1 = this.stateMachine.get(deviceSerial);
                if (interfaceC13075p1 == null) {
                    C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new InterfaceC10278f.a(null, null, 0, null, 15, null));
                    this.stateMachine.put(deviceSerial, c13045h2M36593c);
                    bVar = new AbstractC10273a.b(c13045h2M36593c);
                } else if (((C13045h2) interfaceC13075p1).getValue() instanceof InterfaceC10278f.a) {
                    bVar = new AbstractC10273a.a(AbstractC13091v.m36598h(interfaceC13075p1));
                } else {
                    C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(new InterfaceC10278f.a(null, null, 0, null, 15, null));
                    this.stateMachine.put(deviceSerial, c13045h2M36593c2);
                    bVar = new AbstractC10273a.b(c13045h2M36593c2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13075p1 m26263b(String deviceSerial) {
        InterfaceC13075p1 interfaceC13075p1Remove;
        AbstractC22676k.m65750j(deviceSerial, "deviceSerial");
        synchronized (this.lock) {
            interfaceC13075p1Remove = this.stateMachine.remove(deviceSerial);
        }
        return interfaceC13075p1Remove;
    }
}
