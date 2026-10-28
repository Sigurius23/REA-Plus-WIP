package w23;

import b33.C2689j;
import b33.EnumC2683d;
import b33.EnumC2686g;
import b33.EnumC2688i;
import ec3.C13081r1;
import ec3.InterfaceC13062m;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import org.webrtc.PeerConnection;
import p088dc.AbstractC11895b;
import p499t9.C33647p;
import p508ty.C34249c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import s93.AbstractC32309k;
import x23.C37869e;
import x23.EnumC37870f;
import z23.AbstractC40032b;
import z23.C40031a;
import z23.C40033c;
import z23.C40034d;

/* JADX INFO: renamed from: w23.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C36752j implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C36758p f157287w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22672i f157288x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ EnumC2688i f157289y;

    /* JADX WARN: Multi-variable type inference failed */
    public C36752j(C36758p c36758p, Function1 function1, EnumC2688i enumC2688i) {
        this.f157287w = c36758p;
        this.f157288x = (C22672i) function1;
        this.f157289y = enumC2688i;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        EnumC37870f enumC37870f;
        C36761s c36761s = (C36761s) obj;
        PeerConnection.PeerConnectionState peerConnectionState = c36761s.f157324b;
        C36758p c36758p = this.f157287w;
        c36758p.getClass();
        int i13 = AbstractC36751i.f157286a[peerConnectionState.ordinal()];
        if (i13 != 1) {
            enumC37870f = (i13 == 2 || i13 == 3) ? EnumC37870f.f162185y : null;
        } else {
            enumC37870f = EnumC37870f.f162184x;
        }
        if (enumC37870f != null) {
            this.f157288x.invoke(enumC37870f);
            int i14 = c36761s.f157323a;
            EnumC36762t enumC36762t = c36761s.f157325c;
            PeerConnection.PeerConnectionState peerConnectionState2 = c36761s.f157324b;
            C40033c c40033c = c36758p.f157311d;
            String callId = c36758p.f157308a;
            String callType = c36758p.f157309b;
            C13081r1 c13081r1 = (C13081r1) c36758p.f157312e.f136505x;
            String str = ((C36750h) c13081r1.f45200w.getValue()).f157282b;
            if (str == null) {
                str = "unknown";
            }
            String str2 = str;
            AbstractC32309k abstractC32309k = ((C36750h) c13081r1.f45200w.getValue()).f157281a;
            if (abstractC32309k == null) {
                abstractC32309k = C37869e.f162182w;
            }
            AbstractC32309k abstractC32309k2 = abstractC32309k;
            String sfuId = (String) ((C13081r1) c36758p.f157313f.f1169y).f45200w.getValue();
            String str3 = ((C36750h) c13081r1.f45200w.getValue()).f157285e;
            ConcurrentHashMap concurrentHashMap = c40033c.f172743e;
            C34249c c34249c = c40033c.f172744f;
            AbstractC22676k.m65750j(callId, "callId");
            AbstractC22676k.m65750j(callType, "callType");
            AbstractC22676k.m65750j(sfuId, "sfuId");
            int i15 = peerConnectionState2 == null ? -1 : AbstractC40032b.f172737a[peerConnectionState2.ordinal()];
            EnumC2688i enumC2688i = this.f157289y;
            if (i15 == 1) {
                AbstractC22676k.m65750j(peerConnectionState2, "peerConnectionState");
                boolean z4 = concurrentHashMap.get(enumC2688i) != null;
                String strM31995n = AbstractC11895b.m31995n("toString(...)");
                long jCurrentTimeMillis = System.currentTimeMillis();
                ConcurrentHashMap concurrentHashMap2 = c40033c.f172742d;
                EnumC2683d enumC2683d = EnumC2683d.PEER_CONNECTION_CONNECT;
                concurrentHashMap2.put(strM31995n, new C2689j(callId, callType, strM31995n, enumC2683d, jCurrentTimeMillis, str2, abstractC32309k2, sfuId, str3, enumC2688i, z4, 512));
                Integer numValueOf = Integer.valueOf(i14);
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) c34249c.f143660x;
                C40034d c40034d = new C40034d();
                c40034d.f172745a = strM31995n;
                concurrentHashMap3.put(numValueOf, c40034d);
                c40033c.f172739a.m927P(C40031a.m128361a(c40033c.f172741c, callId, callType, enumC2683d, EnumC2686g.INITIATED, strM31995n, abstractC32309k2, str2, null, null, null, null, null, str3, sfuId, enumC2688i, Boolean.valueOf(z4), enumC36762t, null, null, 8130432));
            } else if (i15 == 2) {
                AbstractC22676k.m65750j(peerConnectionState2, "peerConnectionState");
                System.currentTimeMillis();
                concurrentHashMap.put(enumC2688i, new C33647p(29));
                C40034d c40034d2 = (C40034d) ((ConcurrentHashMap) c34249c.f143660x).remove(Integer.valueOf(i14));
                if (c40034d2 != null) {
                    c40033c.m128365a(callId, callType, c40034d2.f172745a, sfuId, str2, str3, abstractC32309k2, true, enumC36762t, null, null);
                }
            } else if (i15 == 3) {
                AbstractC22676k.m65750j(peerConnectionState2, "peerConnectionState");
                C40034d c40034d3 = (C40034d) ((ConcurrentHashMap) c34249c.f143660x).remove(Integer.valueOf(i14));
                if (c40034d3 != null) {
                    c40033c.m128365a(callId, callType, c40034d3.f172745a, sfuId, str2, str3, abstractC32309k2, false, enumC36762t, "ICE connectivity checks failed", "ICE_CONNECTIVITY_FAILED");
                }
            }
        }
        return C23454a0.f92919a;
    }
}
