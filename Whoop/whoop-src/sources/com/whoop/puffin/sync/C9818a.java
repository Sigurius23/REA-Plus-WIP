package com.whoop.puffin.sync;

import f52.C14112j;
import fk2.C14554a;
import java.util.ArrayList;
import java.util.List;
import lt0.AbstractC24726c;
import lt0.AbstractC24734k;
import m83.AbstractC25267u;
import ot0.C28323a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pu0.C29547a;
import pu0.C29548b;
import pu0.C29550d;

/* JADX INFO: renamed from: com.whoop.puffin.sync.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/puffin/sync/a;", "", "<init>", "()V", "Lfk2/a;", "timestamp", "Lf52/j;", "d", "(Lfk2/a;)Lf52/j;", "Lcom/whoop/puffin/sync/e$b;", "state", "Lpu0/a;", "a", "(Lcom/whoop/puffin/sync/e$b;)Lpu0/a;", "", "Lpu0/b;", "b", "(Lcom/whoop/puffin/sync/e$b;)Ljava/util/List;", "Lpu0/d;", "c", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9818a {
    /* JADX INFO: renamed from: a */
    private final C29547a m23646a(InterfaceC9822e.b state) {
        return new C29547a(state.getMetadata().getSerial(), (int) state.getMetadata().getHardwareVersion().getHardwareFamily(), (int) state.getMetadata().getHardwareVersion().getPcbaRevision(), (int) state.getMetadata().getHardwareVersion().getOpticalRevision(), (int) state.getMetadata().getFirmwareVersion().getMajor(), (int) state.getMetadata().getFirmwareVersion().getMinor(), (int) state.getMetadata().getFirmwareVersion().getBuild(), (int) state.getMetadata().getFirmwareVersion().getUnreleased());
    }

    /* JADX INFO: renamed from: d */
    private final C14112j m23647d(C14554a timestamp) {
        return new C14112j((int) timestamp.m41580f(), (int) timestamp.m41579e());
    }

    /* JADX INFO: renamed from: b */
    public final List<C29548b> m23648b(InterfaceC9822e.b state) {
        AbstractC22676k.m65750j(state, "state");
        C29547a c29547aM23646a = m23646a(state);
        List<AbstractC24734k> listM40201c = state.getBurstData().m40201c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40201c, 10));
        for (AbstractC24734k abstractC24734k : listM40201c) {
            AbstractC24726c packet = abstractC24734k.getPacket();
            AbstractC22676k.m65748h(packet, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.eventpackets.EventPacket");
            C28323a c28323a = (C28323a) packet;
            C14554a timestamp = c28323a.getTimestamp();
            if (timestamp == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C14112j c14112jM23647d = m23647d(timestamp);
            arrayList.add(new C29548b(0L, c14112jM23647d.getBootCount(), c14112jM23647d.getSecondsSinceBoot(), c28323a.mo72387N(), abstractC24734k.getFramedPacket().m76710f(), c29547aM23646a, 1, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final List<C29550d> m23649c(InterfaceC9822e.b state) {
        AbstractC22676k.m65750j(state, "state");
        C29547a c29547aM23646a = m23646a(state);
        List<AbstractC24734k> listM40202d = state.getBurstData().m40202d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40202d, 10));
        for (AbstractC24734k abstractC24734k : listM40202d) {
            AbstractC24726c packet = abstractC24734k.getPacket();
            AbstractC22676k.m65748h(packet, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.eventpackets.EventPacket");
            C28323a c28323a = (C28323a) packet;
            C14554a timestamp = c28323a.getTimestamp();
            if (timestamp == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C14112j c14112jM23647d = m23647d(timestamp);
            arrayList.add(new C29550d(0L, c14112jM23647d.getBootCount(), c14112jM23647d.getSecondsSinceBoot(), c28323a.mo72387N(), abstractC24734k.getFramedPacket().m76710f(), c29547aM23646a, 1, null));
        }
        return arrayList;
    }
}
