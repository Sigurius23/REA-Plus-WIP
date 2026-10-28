package am2;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm0.AbstractC3415r;
import bm0.C3416s;
import bm2.AbstractC3436e0;
import bs1.AbstractC3583c0;
import c11.AbstractC3841h;
import c41.AbstractC3995b3;
import c41.EnumC4009d3;
import c93.InterfaceC4339a;
import cm2.C4819g;
import cm2.C4829q;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import com.whoop.profile.view.edit.avatar.AvatarEditBottomSheetContentKt;
import com.whoop.whoopaction.domain.models.UpdateAction;
import cp1.EnumC11017d;
import do0.AbstractC12228b;
import ds1.C12341k;
import fh0.AbstractC14487i;
import gr1.C16094a;
import gr1.C16096c;
import h01.AbstractC16552s;
import h01.C16553t;
import h02.AbstractC16570f;
import hh0.AbstractC17286f;
import hh0.C17283c;
import hp1.C17542b;
import hp1.C17553m;
import io.getstream.chat.android.client.api.internal.DistinctChatApi;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api2.MoshiChatApi;
import is0.AbstractC20889j0;
import j72.C21399d;
import jp1.AbstractC21854f;
import jp1.AbstractC21869u;
import jp2.AbstractC21873d;
import jp2.C21874e;
import jr1.AbstractC21897e;
import jr1.AbstractC21898f;
import jx1.C22016g;
import kd1.C22409u;
import kl2.AbstractC22567b;
import l72.AbstractC23402i;
import l83.C23454a0;
import ld1.AbstractC23864c;
import m12.AbstractC24936d;
import mx1.AbstractC26007m;
import nl2.C26816c;
import nv1.AbstractC27169c;
import p027b3.InterfaceC2464x2;
import p077d0.C11344e;
import p077d0.C11362i1;
import p077d0.InterfaceC11372l;
import p163g1.C15136s0;
import p163g1.C15199y3;
import p163g1.EnumC15146t0;
import p164g2.InterfaceC15237i;
import p179h.C16351i;
import p180h0.C16416l0;
import p279kd.C22379f;
import p292l1.C23123k2;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
import p316m1.C24893b0;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p636y3.InterfaceC39171c;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import v41.AbstractC35664f;

/* JADX INFO: renamed from: am2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1012d implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f3792E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3793w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f3794x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f3795y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f3796z;

    public /* synthetic */ C1012d(InterfaceC2464x2 interfaceC2464x2, InterfaceC15237i interfaceC15237i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f3793w = 16;
        this.f3794x = interfaceC2464x2;
        this.f3792E = interfaceC15237i;
        this.f3796z = interfaceC28601c1;
        this.f3795y = interfaceC28601c2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f3793w) {
            case 0:
                return AbstractC1026k.m2743Q((Function1) this.f3794x, (C4829q) this.f3792E, (String) this.f3795y, (InterfaceC28601c1) this.f3796z);
            case 1:
                return AbstractC3415r.m9855z((Function1) this.f3794x, (C3416s) this.f3792E, (String) this.f3795y, (InterfaceC28601c1) this.f3796z);
            case 2:
                return AbstractC3436e0.m9932E0((InterfaceC28670t2) this.f3792E, (C4819g) this.f3795y, (Function1) this.f3794x, (InterfaceC28601c1) this.f3796z);
            case 3:
                return AbstractC3583c0.m10840g2((C15199y3) this.f3794x, (InterfaceC2994c0) this.f3792E, (InterfaceC4339a) this.f3795y, (AbstractC35664f.a) this.f3796z);
            case 4:
                return AbstractC3583c0.m10782P1((C12341k) this.f3792E, (InterfaceC4339a) this.f3795y, (Function1) this.f3794x, (Function1) this.f3796z);
            case 5:
                return AbstractC3841h.m11699E((Function1) this.f3794x, (Function1) this.f3792E, (String) this.f3795y, (InterfaceC28601c1) this.f3796z);
            case 6:
                return AbstractC3995b3.m12109e((Function1) this.f3794x, (String) this.f3795y, (String) this.f3792E, (EnumC4009d3) this.f3796z);
            case 7:
                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$13$0((C16351i) this.f3794x, (Context) this.f3792E, (C16351i) this.f3795y, (InterfaceC28601c1) this.f3796z);
            case 8:
                return AbstractC12228b.m33990w((Function1) this.f3794x, (InterfaceC28601c1) this.f3796z, (InterfaceC28601c1) this.f3792E, (InterfaceC28601c1) this.f3795y);
            case 9:
                return AbstractC14487i.m41390e((AnalyticEventModel) this.f3792E, (AbstractC23864c) this.f3795y, (UpdateAction) this.f3796z, (Function1) this.f3794x);
            case 10:
                return new C15136s0((EnumC15146t0) this.f3792E, (InterfaceC39171c) this.f3795y, (Function1) this.f3794x, (InterfaceC11372l) this.f3796z);
            case 11:
                return AbstractC16552s.m46827p((Function1) this.f3794x, (C16553t) this.f3792E, (String) this.f3795y, (InterfaceC28601c1) this.f3796z);
            case 12:
                return AbstractC16570f.m46953i((Function1) this.f3794x, (String) this.f3795y, (String) this.f3792E, (String) this.f3796z);
            case 13:
                return AbstractC17286f.m48952s((InterfaceC2994c0) this.f3794x, (C22409u) this.f3792E, (C17283c) this.f3795y, (InterfaceC28601c1) this.f3796z);
            case 14:
                return DistinctChatApi.m54552l((DistinctChatApi) this.f3794x, (String) this.f3795y, (String) this.f3792E, (QueryChannelRequest) this.f3796z);
            case 15:
                return MoshiChatApi.m54598f((String) this.f3795y, (MoshiChatApi) this.f3794x, (String) this.f3792E, (io.getstream.chat.android.client.api2.model.requests.QueryChannelRequest) this.f3796z);
            case 16:
                return AbstractC20889j0.m57780l0((InterfaceC2464x2) this.f3794x, (InterfaceC15237i) this.f3792E, (InterfaceC28601c1) this.f3796z, (InterfaceC28601c1) this.f3795y);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC21854f.m61855p((EnumC11017d) this.f3792E, (Function1) this.f3794x, (C17542b) this.f3795y, (C22669g0) this.f3796z);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC21869u.m61994x((Function1) this.f3794x, (C17553m) this.f3792E, (C39967p) this.f3795y, (C39967p) this.f3796z);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC21873d.m62022l((InterfaceC15237i) this.f3792E, (C21874e) this.f3796z, (Function1) this.f3794x, (String) this.f3795y);
            case 20:
                return AbstractC21897e.m62252x((C16094a) this.f3792E, (Function1) this.f3794x, (C16096c) this.f3795y, (InterfaceC28601c1) this.f3796z);
            case 21:
                return AbstractC21898f.m62269n((Function1) this.f3794x, (String) this.f3795y, (Function1) this.f3792E, (String) this.f3796z);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22567b.m65326q((C26816c.a) this.f3792E, (Function1) this.f3794x, (InterfaceC28601c1) this.f3796z, (InterfaceC28593a1) this.f3795y);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C23196w3 c23196w3 = (C23196w3) this.f3794x;
                C11362i1 c11362i1 = (C11362i1) this.f3792E;
                C11362i1 c11362i2 = (C11362i1) this.f3795y;
                C11362i1 c11362i3 = (C11362i1) this.f3796z;
                c23196w3.f91788f = c11362i1;
                c23196w3.f91789g = c11362i2;
                c23196w3.f91786d = c11362i3;
                return C23454a0.f92919a;
            case 24:
                C23196w3 c23196w4 = (C23196w3) this.f3794x;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f3792E;
                C11344e c11344e = (C11344e) this.f3795y;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f3796z;
                InterfaceC30057d interfaceC30057d = null;
                if (c23196w4.m67151c() == EnumC23202x3.f91821x) {
                    C24893b0 c24893b0M73008d = c23196w4.f91787e.m73008d();
                    if (c24893b0M73008d.f97517a.containsKey(EnumC23202x3.f91822y)) {
                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C22379f(c11344e, interfaceC30057d, 3), 3);
                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C23123k2(c23196w4, interfaceC30057d, 0), 3);
                    } else {
                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C23123k2(c23196w4, interfaceC30057d, 1), 3).invokeOnCompletion(new C16416l0(interfaceC4339a, 13));
                    }
                } else {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C23123k2(c23196w4, interfaceC30057d, 1), 3).invokeOnCompletion(new C16416l0(interfaceC4339a, 13));
                }
                return C23454a0.f92919a;
            case 25:
                return AbstractC23402i.m67773N((C21399d) this.f3792E, (InterfaceC28670t2) this.f3795y, (Function1) this.f3794x, (Function1) this.f3796z);
            case 26:
                return AbstractC24936d.m73049K((AbstractC23864c) this.f3792E, (Function1) this.f3794x, (InterfaceC4339a) this.f3795y, (InterfaceC28670t2) this.f3796z);
            case 27:
                return AbstractC24936d.m73051M((AbstractC23864c) this.f3794x, (InterfaceC4339a) this.f3792E, (InterfaceC4339a) this.f3795y, (InterfaceC28670t2) this.f3796z);
            case 28:
                return AbstractC26007m.m77236a0((Function1) this.f3794x, (String) this.f3795y, (String) this.f3792E, (C22016g) this.f3796z);
            default:
                return AbstractC27169c.m81704q((Function3) this.f3794x, (MemberDataExportModel.AvailableMemberDataExportModel) this.f3792E, (String) this.f3795y, (String) this.f3796z);
        }
    }

    public /* synthetic */ C1012d(AnalyticEventModel analyticEventModel, AbstractC23864c abstractC23864c, UpdateAction updateAction, Function1 function1) {
        this.f3793w = 9;
        this.f3792E = analyticEventModel;
        this.f3795y = abstractC23864c;
        this.f3796z = updateAction;
        this.f3794x = function1;
    }

    public /* synthetic */ C1012d(InterfaceC15237i interfaceC15237i, C21874e c21874e, Function1 function1, String str) {
        this.f3793w = 19;
        this.f3792E = interfaceC15237i;
        this.f3796z = c21874e;
        this.f3794x = function1;
        this.f3795y = str;
    }

    public /* synthetic */ C1012d(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f3793w = i13;
        this.f3794x = obj;
        this.f3792E = obj2;
        this.f3795y = obj3;
        this.f3796z = obj4;
    }

    public /* synthetic */ C1012d(Object obj, Object obj2, Function1 function1, Object obj3, int i13) {
        this.f3793w = i13;
        this.f3792E = obj;
        this.f3795y = obj2;
        this.f3794x = function1;
        this.f3796z = obj3;
    }

    public /* synthetic */ C1012d(Object obj, String str, Object obj2, Object obj3, int i13) {
        this.f3793w = i13;
        this.f3794x = obj;
        this.f3795y = str;
        this.f3792E = obj2;
        this.f3796z = obj3;
    }

    public /* synthetic */ C1012d(Object obj, Function1 function1, Object obj2, Object obj3, int i13) {
        this.f3793w = i13;
        this.f3792E = obj;
        this.f3794x = function1;
        this.f3795y = obj2;
        this.f3796z = obj3;
    }

    public /* synthetic */ C1012d(String str, MoshiChatApi moshiChatApi, String str2, io.getstream.chat.android.client.api2.model.requests.QueryChannelRequest queryChannelRequest) {
        this.f3793w = 15;
        this.f3795y = str;
        this.f3794x = moshiChatApi;
        this.f3792E = str2;
        this.f3796z = queryChannelRequest;
    }

    public /* synthetic */ C1012d(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        this.f3793w = 8;
        this.f3794x = function1;
        this.f3796z = interfaceC28601c1;
        this.f3792E = interfaceC28601c2;
        this.f3795y = interfaceC28601c3;
    }

    public /* synthetic */ C1012d(C26816c.a aVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28593a1 interfaceC28593a1) {
        this.f3793w = 22;
        this.f3792E = aVar;
        this.f3794x = function1;
        this.f3796z = interfaceC28601c1;
        this.f3795y = interfaceC28593a1;
    }
}
