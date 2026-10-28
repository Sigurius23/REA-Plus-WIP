package kf0;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import dk1.AbstractC12112a;
import hk1.AbstractC17387a;
import ik1.AbstractC18609f;
import im2.InterfaceC18710a;
import kd0.InterfaceC22381a;
import kk0.C22539b;
import kk1.AbstractC22543d;
import kk1.AbstractC22546g;
import kk1.AbstractC22547h;
import kl2.AbstractC22567b;
import km0.AbstractC22578b;
import km1.AbstractC22585b;
import km2.AbstractC22592c;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;

/* JADX INFO: renamed from: kf0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22429d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87753w;

    public /* synthetic */ C22429d(int i13) {
        this.f87753w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f87753w) {
            case 0:
                return AbstractC22431f.m64643R((Modifier) obj);
            case 1:
                return AbstractC22433h.m64707t((InterfaceC22381a) obj);
            case 2:
                return AbstractC22435j.m64724g((Modifier) obj);
            case 3:
                return AbstractC22435j.m64725h((Modifier) obj);
            case 4:
                return AbstractC22435j.m64727j((Modifier) obj);
            case 5:
                return C22539b.m65146h((C22539b) obj);
            case 6:
                return AbstractC22543d.m65185z((AbstractC17387a) obj);
            case 7:
                return AbstractC22543d.m65181v((AbstractC17387a) obj);
            case 8:
                return AbstractC22543d.m65156A((AbstractC12112a) obj);
            case 9:
                return AbstractC22543d.m65174o((AbstractC18609f) obj);
            case 10:
                return AbstractC22543d.m65175p((AbstractC12112a) obj);
            case 11:
                return AbstractC22543d.m65176q((AbstractC17387a) obj);
            case 12:
                return AbstractC22543d.m65179t((AbstractC18609f) obj);
            case 13:
                return AbstractC22543d.m65180u((AbstractC12112a) obj);
            case 14:
                return AbstractC22546g.m65230e0((AbstractC18609f) obj);
            case 15:
                return AbstractC22546g.m65256r0((AbstractC12112a) obj);
            case 16:
                return AbstractC22546g.m65232f0((AbstractC12112a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC22546g.m65217W((AbstractC18609f) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC22546g.m65218X((AbstractC12112a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC22546g.m65214T((AbstractC12112a) obj);
            case 20:
                return AbstractC22546g.m65234g0((AbstractC17387a) obj);
            case 21:
                return AbstractC22547h.m65277e((AbstractC17387a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22567b.m65325p(((Integer) obj).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC22578b.m65405e(obj);
            case 24:
                return AbstractC22585b.m65451j(obj);
            case 25:
                return AbstractC22592c.m65504o((Modifier) obj);
            case 26:
                return AbstractC22592c.m65507r((InterfaceC18710a) obj);
            case 27:
                return AbstractC22592c.m65508s((Modifier) obj);
            case 28:
                return AbstractC22592c.m65500k(obj);
            default:
                return AbstractC22592c.m65501l((C25308q) obj);
        }
    }
}
