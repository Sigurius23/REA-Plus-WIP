package jp2;

import androidx.health.platform.client.proto.C1533u;
import c31.EnumC3919c;
import com.whoop.whooplabs.feature.navigation.C10839b;
import d61.InterfaceC11732a;
import hs2.InterfaceC17607a;
import iq0.C20839r;
import it1.InterfaceC20927a;
import jb1.C21536b;
import jq0.C21886a;
import js1.AbstractC21921l;
import js2.AbstractC21925c;
import js2.AbstractC21928f;
import js2.AbstractC21931i;
import jt1.AbstractC21938c;
import jv2.C21973d;
import jx1.AbstractC22007b0;
import jx2.AbstractC22042f;
import k01.AbstractC22092d;
import k11.AbstractC22121d;
import k21.AbstractC22159c;
import k31.C22174d;
import k51.AbstractC22203b;
import k71.AbstractC22269z;
import k90.AbstractC22299b;
import kd1.C22398j;
import kd1.C22409u;
import ke2.AbstractC22423c;
import kf0.AbstractC22431f;
import o02.C27354e;
import p12.C28714e;
import p12.EnumC28717g;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;
import p745y81.C39336i;

/* JADX INFO: renamed from: jp2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C21875f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84473w;

    public /* synthetic */ C21875f(int i13) {
        this.f84473w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84473w) {
            case 0:
                return AbstractC21876g.m62037c((C25308q) obj);
            case 1:
                return AbstractC21883n.m62085w(obj);
            case 2:
                return C21886a.m62105d((C20839r) obj);
            case 3:
                return AbstractC21921l.m62397q(obj);
            case 4:
                return AbstractC21925c.m62423l((InterfaceC17607a) obj);
            case 5:
                return AbstractC21928f.m62433F((InterfaceC17607a) obj);
            case 6:
                return AbstractC21928f.m62450p((InterfaceC17607a) obj);
            case 7:
                return AbstractC21928f.m62454t((InterfaceC17607a) obj);
            case 8:
                return AbstractC21931i.m62475o((InterfaceC17607a) obj);
            case 9:
                return AbstractC21938c.m62492D((InterfaceC20927a.d) obj);
            case 10:
                return C21973d.m62741e((C21536b) obj);
            case 11:
                return AbstractC22007b0.m62894c((C25308q) obj);
            case 12:
                return AbstractC22042f.m63041V((C28714e) obj);
            case 13:
                return AbstractC22042f.m63043X((EnumC28717g) obj);
            case 14:
                return AbstractC22042f.m63045Z((EnumC3919c) obj);
            case 15:
                return C10839b.m28563b((C27354e) obj);
            case 16:
                return AbstractC22092d.m63194t(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC22121d.m63332i(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC22159c.m63426h(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C22174d.m63476b(obj);
            case 20:
                return AbstractC22203b.m63670e(obj);
            case 21:
                return AbstractC22269z.m63981v((InterfaceC11732a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22299b.m64080d(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C22398j.m64464h((C39336i) obj);
            case 24:
                return C22398j.m64465i((C39336i) obj);
            case 25:
                return C22398j.m64466j((C39336i) obj);
            case 26:
                return C22398j.m64467k((C39336i) obj);
            case 27:
                return C22409u.m64529m(((Byte) obj).byteValue());
            case 28:
                return AbstractC22423c.m64600x(((Boolean) obj).booleanValue());
            default:
                return AbstractC22431f.m64642Q(obj);
        }
    }
}
