package p000;

import a80.C0537a;
import a81.C0551b;
import ac2.C0744d;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import az1.C2160a;
import b01.AbstractC2195p;
import b01.InterfaceC2189j;
import b30.AbstractC2526g3;
import bd2.C3108a;
import be1.C3167a;
import bg0.C3219a;
import bm2.AbstractC3442g0;
import bm2.AbstractC3459m;
import bm2.C3423a;
import bm2.C3426b;
import bm2.EnumC3475t0;
import bs1.AbstractC3583c0;
import bs1.AbstractC3587f;
import bv2.C3674a;
import c41.C4146x0;
import c93.InterfaceC4351m;
import ds1.AbstractC12331a;
import fd2.EnumC14403a;
import fd2.EnumC14404b;
import h91.C17027b;
import l83.C23454a0;
import p097ds.AbstractC12313p;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22676k;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26047n implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103110w;

    public /* synthetic */ C26047n(int i13) {
        this.f103110w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f103110w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC37785x.m121283d((Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 1:
                return C0537a.m1309c((Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return C0551b.m1377c((Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return C0744d.m1806h((C38266c) obj, (C34911a) obj2);
            case 4:
                return C0744d.m1807i((C38266c) obj, (C34911a) obj2);
            case 5:
                return C0744d.m1808j((C38266c) obj, (C34911a) obj2);
            case 6:
                return C0744d.m1809k((C38266c) obj, (C34911a) obj2);
            case 7:
                return C0744d.m1810l((C38266c) obj, (C34911a) obj2);
            case 8:
                return C0744d.m1811m((C38266c) obj, (C34911a) obj2);
            case 9:
                return C2160a.m6724c((Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return AbstractC2195p.m6909K(((Integer) obj).intValue(), (InterfaceC2189j) obj2);
            case 11:
                return Boolean.valueOf(AbstractC2195p.m6900B((InterfaceC2189j) obj, (String) obj2));
            case 12:
                ((Integer) obj2).getClass();
                AbstractC12313p.m34294l((Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC2526g3.m7465d((Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 14:
                return C3108a.m8926b((EnumC14403a) obj, (EnumC14404b) obj2);
            case 15:
                return C3167a.m9066c((Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return C3219a.m9258c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C3423a.m9894c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C3426b.m9897c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC3459m.m10141i((EnumC3475t0) obj, (EnumC3475t0) obj2);
            case 20:
                return AbstractC3442g0.m10054j((EnumC3475t0) obj, (EnumC3475t0) obj2);
            case 21:
                return AbstractC3587f.m10943n((C17027b) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC3583c0.m10887s1(((Long) obj).longValue(), (String) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC3583c0.m10848i2(((Boolean) obj).booleanValue(), (AbstractC12331a) obj2);
            case 24:
                return AbstractC3583c0.m10864m2(((Long) obj).longValue(), (String) obj2);
            case 25:
                return AbstractC3583c0.m10778O0(((Long) obj).longValue(), (String) obj2);
            case 26:
                return C3674a.m11363c((Composer) obj, ((Integer) obj2).intValue());
            case 27:
                String message = (String) obj;
                Throwable error = (Throwable) obj2;
                AbstractC22676k.m65750j(message, "message");
                AbstractC22676k.m65750j(error, "error");
                return C23454a0.f92919a;
            case 28:
                return (String) obj;
            default:
                return C4146x0.m12902e((Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C26047n(int i13, int i14) {
        this.f103110w = i14;
    }
}
