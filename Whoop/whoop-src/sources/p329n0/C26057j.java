package p329n0;

import androidx.compose.foundation.lazy.C1104b;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.health.platform.client.proto.C1533u;
import androidx.work.impl.WorkDatabase;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.core.details.view.AbstractC6470a;
import com.whoop.education.view.EducationFragment;
import ge3.AbstractC15751g;
import hw0.C17700e;
import i93.C18284j;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lo0.C24577e0;
import lo1.C24618c;
import m62.AbstractC25118i;
import m62.C25120k;
import m62.InterfaceC25116g;
import m72.AbstractC25208g;
import m83.AbstractC25265s;
import nk1.AbstractC26797c;
import nk1.C26798d;
import no0.AbstractC26951i;
import no0.AbstractC26958l0;
import no0.AbstractC26978v0;
import no1.AbstractC26992f;
import np1.AbstractC27032j;
import nr0.AbstractC27073f;
import nw0.AbstractC27200g;
import nx1.AbstractC27226h;
import ny0.AbstractC27255g0;
import ny0.C27256h;
import ny0.C27257h0;
import o72.AbstractC27647h;
import ox2.AbstractC28459e;
import ox2.AbstractC28462h;
import oz0.AbstractC28496b;
import oz0.C28497c;
import p002a0.C0023g0;
import p004a2.C0153b;
import p005a3.C0271z0;
import p012ab.C0682h0;
import p027b3.InterfaceC2464x2;
import p048ce.AbstractC4482w;
import p163g1.C15199y3;
import p164g2.InterfaceC15237i;
import p179h.C16351i;
import p180h0.C16470w;
import p181h2.C16618c;
import p218ic.C18358g;
import p218ic.C18389w;
import p218ic.EnumC18371m0;
import p268k0.AbstractC22086a;
import p292l1.C23196w3;
import p31.AbstractC28795f;
import p31.C28791b;
import p389p0.C28521f0;
import p390p1.AbstractC28687y0;
import p390p1.C28591a;
import p390p1.C28610e2;
import p390p1.C28612f0;
import p390p1.C28626i2;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p410q1.C29752a;
import p410q1.C29754b;
import p410q1.InterfaceC29773k0;
import p411q2.InterfaceC29805a;
import p420qc.C30203m;
import p420qc.C30204n;
import p420qc.C30207q;
import p445r0.C30838f;
import p457rc.C31231n;
import p62.AbstractC28948i;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25306o;
import p728ql2.C30476c;
import p728ql2.Function0;
import pj2.AbstractC29319r;
import pp1.AbstractC29436i;
import px2.AbstractC29599b;
import px2.C29611n;
import px2.InterfaceC29603f;
import q11.C29793c;
import q62.AbstractC30004d;
import qu2.AbstractC30640h;
import r51.AbstractC30937e;
import r62.AbstractC30987a;
import r90.AbstractC31096c;
import r90.C31103j;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n0.j */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C26057j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103134w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f103135x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f103136y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f103137z;

    public /* synthetic */ C26057j(Object obj, Object obj2, Object obj3, int i13) {
        this.f103134w = i13;
        this.f103135x = obj;
        this.f103136y = obj2;
        this.f103137z = obj3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f103134w) {
            case 0:
                C28612f0 c28612f0 = (C28612f0) this.f103135x;
                C26068u c26068u = (C26068u) this.f103136y;
                C1104b c1104b = (C1104b) this.f103137z;
                C26053f c26053f = (C26053f) c28612f0.getValue();
                return new C26056i(c26068u, c26053f, c1104b, new C0682h0((C18284j) ((C28521f0) c26068u.f103222e.f91961e).getValue(), c26053f));
            case 1:
                return AbstractC26797c.m79861r((Function1) this.f103135x, (C26798d) this.f103136y, (InterfaceC28601c1) this.f103137z);
            case 2:
                return AbstractC26951i.m80537r((InterfaceC2994c0) this.f103135x, (C23196w3) this.f103136y, (Function1) this.f103137z);
            case 3:
                return AbstractC26958l0.m80606M0((InterfaceC2994c0) this.f103135x, (C23196w3) this.f103136y, (InterfaceC28601c1) this.f103137z);
            case 4:
                return AbstractC26978v0.m80831o((C24577e0) this.f103135x, (InterfaceC28601c1) this.f103136y, (Function1) this.f103137z);
            case 5:
                return AbstractC26992f.m80963h((C24618c.e) this.f103135x, (Function1) this.f103136y, (String) this.f103137z);
            case 6:
                return AbstractC27073f.m81402t((C27256h) this.f103135x, (C25306o) this.f103136y, (Function1) this.f103137z);
            case 7:
                return AbstractC27200g.m81786K((Function1) this.f103135x, (Function1) this.f103136y, (Function1) this.f103137z);
            case 8:
                return AbstractC27226h.m82026q((Function1) this.f103135x, (String) this.f103136y, (Map) this.f103137z);
            case 9:
                return AbstractC27255g0.m82142h((C27257h0) this.f103135x, (InterfaceC28601c1) this.f103136y, (Function1) this.f103137z);
            case 10:
                return AbstractC27647h.m83498I((Function1) this.f103135x, (AbstractC25208g.c) this.f103136y, (InterfaceC28601c1) this.f103137z);
            case 11:
                return AbstractC6470a.m19814y((C17700e) this.f103135x, (Function1) this.f103136y, (Function1) this.f103137z);
            case 12:
                return AbstractC28459e.m86284I((InterfaceC2464x2) this.f103135x, (Function1) this.f103136y, (AbstractC29599b.b) this.f103137z);
            case 13:
                return AbstractC28462h.m86341Z((Function1) this.f103135x, (InterfaceC29603f.a) this.f103136y, (C29611n) this.f103137z);
            case 14:
                return AbstractC28496b.m86796f((InterfaceC29805a) this.f103135x, (Function1) this.f103136y, (C28497c) this.f103137z);
            case 15:
                C28655q c28655q = (C28655q) this.f103135x;
                C29752a c29752a = (C29752a) this.f103136y;
                C28610e2 c28610e2 = (C28610e2) this.f103137z;
                C29754b c29754b = c28655q.f115897M;
                C29752a c29752a2 = c29754b.f121747b;
                try {
                    c29754b.f121747b = c29752a;
                    C28610e2 c28610e3 = c28655q.f115891G;
                    int[] iArr = c28655q.f115920o;
                    C0023g0 c0023g0 = c28655q.f115927v;
                    c28655q.f115920o = null;
                    c28655q.f115927v = null;
                    try {
                        c28655q.f115891G = c28610e2;
                        boolean z4 = c29754b.f121750e;
                        try {
                            c29754b.f121750e = false;
                            throw null;
                        } catch (Throwable th3) {
                            c29754b.f121750e = z4;
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        c28655q.f115891G = c28610e3;
                        c28655q.f115920o = iArr;
                        c28655q.f115927v = c0023g0;
                        throw th4;
                    }
                } catch (Throwable th5) {
                    c29754b.f121747b = c29752a2;
                    throw th5;
                }
            case 16:
                return AbstractC28795f.m87569q((InterfaceC4339a) this.f103135x, (C28791b) this.f103136y, (Function1) this.f103137z);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC28948i.m87905i((InterfaceC25116g.e) this.f103135x, (Function1) this.f103136y, (Function1) this.f103137z);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29319r.m89188f((Function1) this.f103135x, (String) this.f103136y, (String) this.f103137z);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29436i.m89739P0((Function1) this.f103135x, (AbstractC27032j.g) this.f103136y, (InterfaceC28601c1) this.f103137z);
            case 20:
                C28591a c28591a = (C28591a) this.f103135x;
                C28626i2 c28626i2 = (C28626i2) this.f103136y;
                InterfaceC29773k0 interfaceC29773k0 = (InterfaceC29773k0) this.f103137z;
                if (c28591a != null) {
                    c28626i2.m87056a(c28626i2.m87058c(c28591a) - c28626i2.f115800t);
                }
                List listM14010t = AbstractC4482w.m14010t(c28626i2, null, c28626i2.f115800t, null);
                C0153b c0153b = (C0153b) AbstractC25265s.m74114R0(listM14010t);
                Integer num = c0153b != null ? c0153b.f476a : null;
                List listMo402f = interfaceC29773k0.mo402f(num);
                if (num != null && !listMo402f.isEmpty()) {
                    C0153b c0153b2 = (C0153b) AbstractC25265s.m74096F0(listMo402f);
                    List listM74161z0 = AbstractC25265s.m74161z0(listMo402f, 1);
                    c0153b2.getClass();
                    listMo402f = AbstractC25265s.m74129g1(AbstractC37056f.m118958J(new C0153b(null, num)), listM74161z0);
                }
                return AbstractC25265s.m74129g1(listM14010t, listMo402f);
            case 21:
                return AbstractC30004d.m91822p((Function1) this.f103135x, (AbstractC25118i.a) this.f103136y, (Function1) this.f103137z);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Function0.m93279z((C30476c) this.f103135x, (C16351i) this.f103136y, (Function1) this.f103137z);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC30640h.m94079L0((InterfaceC15237i) this.f103135x, (InterfaceC2994c0) this.f103136y, (C15199y3) this.f103137z);
            case 24:
                C30838f c30838f = (C30838f) this.f103135x;
                C16618c c16618cM94840X0 = C30838f.m94840X0(c30838f, (NodeCoordinator) this.f103136y, (C0271z0) this.f103137z);
                if (c16618cM94840X0 == null) {
                    return null;
                }
                C16470w c16470w = c30838f.f127145O;
                if (C39180l.m124799a(c16470w.f63285W, 0L)) {
                    AbstractC22086a.m63160c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c16618cM94840X0.m47206l(c16470w.m46642b1(c16618cM94840X0, c16470w.f63285W) ^ (-9223372034707292160L));
            case 25:
                return AbstractC30937e.m95160n((InterfaceC28601c1) this.f103135x, (Function1) this.f103136y, (C27256h) this.f103137z);
            case 26:
                return AbstractC30987a.m95516d((Function1) this.f103135x, (C25120k) this.f103136y, (String) this.f103137z);
            case 27:
                return AbstractC31096c.m95764m((C31103j) this.f103135x, (Function1) this.f103136y, (String) this.f103137z);
            case 28:
                C31231n c31231n = (C31231n) this.f103135x;
                UUID uuid = (UUID) this.f103136y;
                C18358g c18358g = (C18358g) this.f103137z;
                c31231n.getClass();
                String string = uuid.toString();
                C18389w c18389wM52886d = C18389w.m52886d();
                String str = C31231n.f128612c;
                c18389wM52886d.m52888a(str, "Updating progress for " + uuid + " (" + c18358g + ")");
                WorkDatabase workDatabase = c31231n.f128613a;
                workDatabase.beginTransaction();
                try {
                    C30207q c30207qM92434e = workDatabase.mo5521h().m92434e(string);
                    if (c30207qM92434e == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (c30207qM92434e.f123635b == EnumC18371m0.f71516x) {
                        C30203m c30203m = new C30203m(string, c18358g);
                        C30204n c30204nMo5520g = workDatabase.mo5520g();
                        c30204nMo5520g.getClass();
                        AbstractC15751g.m44432L(c30204nMo5520g.f123611a, false, true, new C29793c(5, c30204nMo5520g, c30203m));
                    } else {
                        C18389w.m52886d().m52892g(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    return null;
                } catch (Throwable th6) {
                    try {
                        C18389w.m52886d().m52890c(str, "Error updating Worker progress", th6);
                        throw th6;
                    } catch (Throwable th7) {
                        workDatabase.endTransaction();
                        throw th7;
                    }
                }
            default:
                return EducationFragment.m21376V((EducationFragment) this.f103135x, (String) this.f103136y, (String) this.f103137z);
        }
    }

    public /* synthetic */ C26057j(C28655q c28655q, C29752a c29752a, C28610e2 c28610e2, AbstractC28687y0 abstractC28687y0) {
        this.f103134w = 15;
        this.f103135x = c28655q;
        this.f103136y = c29752a;
        this.f103137z = c28610e2;
    }
}
