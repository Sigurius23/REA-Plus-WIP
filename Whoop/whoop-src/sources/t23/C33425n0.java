package t23;

import a30.C0332w0;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import ec3.C13045h2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p031b9.AbstractC2875y;
import p499t9.C33623c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import stream.video.sfu.models.Participant;
import stream.video.sfu.models.ParticipantSource;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: t23.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33425n0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139553w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33450s0 f139554x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33425n0(C33450s0 c33450s0, int i13) {
        super(0);
        this.f139553w = i13;
        this.f139554x = c33450s0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        boolean z4;
        long j7;
        switch (this.f139553w) {
            case 0:
                C33450s0 c33450s0 = this.f139554x;
                C2345k c2345kM105860b = c33450s0.m105860b();
                ConcurrentHashMap concurrentHashMap = c33450s0.f139681v0;
                InterfaceC2339e interfaceC2339e = c2345kM105860b.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                String str = c2345kM105860b.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM105860b.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(((List) c33450s0.f139680v.f81695j.getValue()).size(), "[ParticipantJoinedEvent] #participants; #debounce; participants: "), null);
                }
                Collection collectionValues = concurrentHashMap.values();
                AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                Collection collection = collectionValues;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add((Participant) ((C23465k) it.next()).f92937w);
                }
                List<Participant> listM74093D1 = AbstractC25265s.m74093D1(arrayList);
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74093D1, 10));
                for (Participant participant : listM74093D1) {
                    C33392g2 c33392g2M105862d = c33450s0.m105862d(participant.getSession_id(), participant.getUser_id(), ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED);
                    c33392g2M105862d.m105851b(participant);
                    arrayList2.add(c33392g2M105862d);
                }
                c33450s0.m105869l(arrayList2);
                Collection collectionValues2 = concurrentHashMap.values();
                AbstractC22676k.m65749i(collectionValues2, "<get-values>(...)");
                List listM74093D2 = AbstractC25265s.m74093D1(collectionValues2);
                C0332w0 c0332w0 = c33450s0.f139672r;
                c0332w0.getClass();
                LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0((Map) ((C13045h2) c0332w0.f1166G).getValue());
                ConcurrentHashMap concurrentHashMap2 = ((C33425n0) c0332w0.f1169y).f139554x.f139654i;
                Iterator it3 = listM74093D2.iterator();
                while (true) {
                    while (true) {
                        if (!it3.hasNext()) {
                            if (z4) {
                                C13045h2 c13045h2 = (C13045h2) c0332w0.f1165F;
                                c13045h2.getClass();
                                c13045h2.m36571k(null, linkedHashMapM74003l0);
                            }
                            return C23454a0.f92919a;
                        }
                        C23465k c23465k = (C23465k) it3.next();
                        z4 = C0332w0.m832h(linkedHashMapM74003l0, (Participant) c23465k.f92937w, ((Boolean) c23465k.f92938x).booleanValue(), concurrentHashMap2, (C33623c0) c0332w0.f1168x) || z4;
                    }
                }
                break;
            case 1:
                int size = ((List) this.f139554x.f139680v.f81695j.getValue()).size();
                if (size < 8) {
                    j7 = 0;
                } else if (size < 25) {
                    j7 = 250;
                } else {
                    j7 = size < 50 ? 500L : 1000L;
                }
                return Long.valueOf(j7);
            case 2:
                return this.f139554x.f139654i;
            default:
                C33450s0 c33450s1 = this.f139554x;
                return AbstractC37926s0.m121484x(c33450s1.f139680v.f81695j, new C33440q0(c33450s1, 2));
        }
    }
}
