package rk2;

import ai1.C0910b;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import pf.C29124b;
import q11.C29793c;
import q83.InterfaceC30057d;
import r61.C30985h;

/* JADX INFO: renamed from: rk2.d */
/* JADX INFO: loaded from: classes10.dex */
public final class C31500d implements InterfaceC31499c {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f129934a;

    /* JADX INFO: renamed from: c */
    private final C31497a f129936c = new C31497a();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f129935b = new a();

    /* JADX INFO: renamed from: rk2.d$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C31501e c31501e) {
            interfaceC33689c.mo5356p(1, c31501e.getId());
            if (c31501e.getActivityInternalName() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c31501e.getActivityInternalName());
            }
            interfaceC33689c.mo5356p(3, c31501e.getGarmentId());
            if (c31501e.getStartTime() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, c31501e.getStartTime());
            }
            if (c31501e.getEndTime() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, c31501e.getEndTime());
            }
            interfaceC33689c.mo5356p(6, c31501e.getGpsEnabled() ? 1L : 0L);
            interfaceC33689c.mo5356p(7, c31501e.getQueuedAtMs());
            String strM97039b = C31500d.this.f129936c.m97039b(c31501e.m97065f());
            if (strM97039b == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, strM97039b);
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR ABORT INTO `pending_activity_save_table` (`id`,`activityInternalName`,`garmentId`,`startTime`,`endTime`,`gpsEnabled`,`queuedAtMs`,`pauseSegmentsJson`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }
    }

    public C31500d(AbstractC1848z0 abstractC1848z0) {
        this.f129934a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: h */
    public static List<Class<?>> m97054h() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C23454a0 m97055i(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM pending_activity_save_table");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C23454a0 m97056j(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM pending_activity_save_table WHERE id = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ List m97057k(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM pending_activity_save_table");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "activityInternalName");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "garmentId");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "startTime");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "endTime");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "gpsEnabled");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "queuedAtMs");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pauseSegmentsJson");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                int i13 = iM60658N;
                arrayList.add(new C31501e(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), (int) interfaceC33689cMo68212g1.getLong(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5), ((int) interfaceC33689cMo68212g1.getLong(iM60658N6)) != 0, interfaceC33689cMo68212g1.getLong(iM60658N7), this.f129936c.m97038a(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8))));
                iM60658N = i13;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ Long m97058l(C31501e c31501e, InterfaceC33687a interfaceC33687a) {
        return Long.valueOf(this.f129935b.insertAndReturnId(interfaceC33687a, c31501e));
    }

    @Override // rk2.InterfaceC31499c
    /* JADX INFO: renamed from: a */
    public Object mo97047a(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f129934a, false, true, new C0910b(j7, 29), interfaceC30057d);
    }

    @Override // rk2.InterfaceC31499c
    /* JADX INFO: renamed from: b */
    public Object mo97048b(C31501e c31501e, InterfaceC30057d<? super Long> interfaceC30057d) {
        c31501e.getClass();
        return AbstractC15751g.m44434N(this.f129934a, false, true, new C29793c(18, this, c31501e), interfaceC30057d);
    }

    @Override // rk2.InterfaceC31499c
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f129934a, false, true, new C30985h(25), interfaceC30057d);
    }

    @Override // rk2.InterfaceC31499c
    public Object getAll(InterfaceC30057d<? super List<C31501e>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f129934a, true, false, new C29124b(this, 25), interfaceC30057d);
    }
}
