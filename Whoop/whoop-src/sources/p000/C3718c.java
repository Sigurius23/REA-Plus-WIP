package p000;

import a42.C0378a;
import am2.AbstractC1026k;
import am2.AbstractC1046w;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import az1.AbstractC2173n;
import b01.AbstractC2195p;
import b90.AbstractC2884f;
import b90.C2885g;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import be1.AbstractC3173g;
import bf0.AbstractC3199k;
import bm2.AbstractC3436e0;
import bm2.AbstractC3487z0;
import bs1.AbstractC3583c0;
import by1.AbstractC3700g;
import c31.AbstractC3926j;
import c31.C3927k;
import c41.AbstractC4062l0;
import c41.AbstractC4133v1;
import c41.C4140w1;
import c42.C4180q;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm2.C4824l;
import cm2.C4829q;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.view.upcycle.AbstractC9145b;
import com.whoop.navigation.C9598e;
import com.whoop.pregnancy.view.PregnancySettingsFragment;
import com.whoop.profile.view.edit.EditProfileBottomSheetKt;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import com.whoop.straphistorysync.sync.C10277e;
import cp0.AbstractC11009x0;
import gz0.EnumC16313m0;
import hv1.C17676f;
import java.util.List;
import jk0.InterfaceC21750d;
import kd1.EnumC22400l;
import kotlin.AbstractC2021o0;
import l83.C23454a0;
import org.joda.time.LocalDate;
import p027b3.InterfaceC2464x2;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p132f0.C13821r1;
import p163g1.C15199y3;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p715kotlin.jvm.functions.Function1;
import pv0.C29577d;
import pv0.InterfaceC29575b;
import q83.InterfaceC30057d;
import qx1.C30754a;
import ys2.AbstractC39758e;
import yx1.C39840a;
import zd1.InterfaceC40549d;
import ze0.AbstractC40584c;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3718c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15191w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f15192x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f15193y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f15194z;

    public /* synthetic */ C3718c(Object obj, Object obj2, Object obj3, int i13) {
        this.f15191w = i13;
        this.f15192x = obj;
        this.f15193y = obj2;
        this.f15194z = obj3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f15191w) {
            case 0:
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f15192x, null, null, new C12473e((InterfaceC4339a) this.f15193y, (InterfaceC28601c1) this.f15194z, (InterfaceC30057d) null, 0), 3);
                return C23454a0.f92919a;
            case 1:
                Function1 function1 = (Function1) this.f15192x;
                TextResource textResource = (TextResource) this.f15193y;
                C29577d c29577d = (C29577d) this.f15194z;
                function1.invoke(new InterfaceC29575b.d(AbstractC8693b.m21268b(textResource)));
                function1.invoke(new InterfaceC29575b.b(AbstractC8693b.m21268b(c29577d.getSearchQuery())));
                return C23454a0.f92919a;
            case 2:
                Function1 function2 = (Function1) this.f15192x;
                C29577d c29577d2 = (C29577d) this.f15193y;
                function2.invoke(new InterfaceC29575b.c(c29577d2.getSearchQuery().resolve((Context) this.f15194z).toString()));
                return C23454a0.f92919a;
            case 3:
                return AbstractC1026k.m2737K((Function1) this.f15192x, (C4829q) this.f15193y, (Function1) this.f15194z);
            case 4:
                return AbstractC1046w.m3002N((Function1) this.f15192x, (C4824l) this.f15193y, (Function1) this.f15194z);
            case 5:
                return AbstractC2021o0.m6311u((AbstractC39758e.n) this.f15192x, (Function1) this.f15193y, (InterfaceC28601c1) this.f15194z);
            case 6:
                return AbstractC2173n.m6816V((AbstractC12939a0) this.f15192x, (InterfaceC4339a) this.f15193y, (Function1) this.f15194z);
            case 7:
                return AbstractC2173n.m6801G((C12991u0) this.f15192x, (InterfaceC4339a) this.f15193y, (Function1) this.f15194z);
            case 8:
                return AbstractC2195p.m6903E((List) this.f15192x, (InterfaceC4351m) this.f15193y, (String) this.f15194z);
            case 9:
                return AbstractC2884f.m8374v((Function1) this.f15192x, (C2885g) this.f15193y, (InterfaceC28601c1) this.f15194z);
            case 10:
                return AbstractC3173g.m9129r0((Function1) this.f15192x, (Function1) this.f15193y, (InterfaceC40549d.a) this.f15194z);
            case 11:
                return AbstractC3199k.m9204G((InterfaceC2994c0) this.f15192x, (AbstractC40584c.e.a) this.f15193y, (C15199y3) this.f15194z);
            case 12:
                return AbstractC3199k.m9206I((InterfaceC2994c0) this.f15192x, (AbstractC40584c.e.c) this.f15193y, (C15199y3) this.f15194z);
            case 13:
                return AbstractC3199k.m9207J((InterfaceC2994c0) this.f15192x, (AbstractC40584c.e.b) this.f15193y, (C15199y3) this.f15194z);
            case 14:
                return C10277e.m26275n((C10277e) this.f15192x, (InterfaceC21750d) this.f15193y, (String) this.f15194z);
            case 15:
                return AbstractC3436e0.m9938H0((InterfaceC28601c1) this.f15194z, (InterfaceC28670t2) this.f15192x, (Function1) this.f15193y);
            case 16:
                return AbstractC3436e0.m9937H((LocalDate) this.f15192x, (String) this.f15193y, (InterfaceC28601c1) this.f15194z);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(AbstractC3436e0.m9973Z((InterfaceC28601c1) this.f15194z, (InterfaceC28601c1) this.f15192x, (InterfaceC28601c1) this.f15193y));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC3436e0.m9979b0((InterfaceC28601c1) this.f15194z, (InterfaceC28601c1) this.f15192x, (InterfaceC28670t2) this.f15193y);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC3487z0.m10261i0((Function1) this.f15192x, (C17676f) this.f15193y, (InterfaceC28601c1) this.f15194z);
            case 20:
                return AbstractC3487z0.m10232O((InterfaceC2994c0) this.f15192x, (InterfaceC2464x2) this.f15193y, (C15199y3) this.f15194z);
            case 21:
                return AbstractC3583c0.m10739B1((Function1) this.f15192x, (C13821r1) this.f15194z, (InterfaceC4339a) this.f15193y);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC3700g.m11517f((Function1) this.f15192x, (C39840a) this.f15193y, (Function1) this.f15194z);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC3926j.m11933g((InterfaceC29805a) this.f15192x, (Function1) this.f15193y, (C3927k) this.f15194z);
            case 24:
                return AbstractC4062l0.m12423k((C9598e) this.f15192x, (Function1) this.f15193y, (EnumC22400l) this.f15194z);
            case 25:
                return AbstractC4133v1.m12771M((EnumC16313m0) this.f15192x, (C4140w1) this.f15193y, (Function1) this.f15194z);
            case 26:
                return PregnancySettingsFragment.m23316v0((PregnancySettingsFragment) this.f15192x, (C0378a) this.f15193y, (C4180q) this.f15194z);
            case 27:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$1$0$0((EditProfileFormState) this.f15192x, (InterfaceC28601c1) this.f15194z, (InterfaceC28601c1) this.f15193y);
            case 28:
                return AbstractC11009x0.m29444O0((List) this.f15192x, (InterfaceC4351m) this.f15193y, (InterfaceC28601c1) this.f15194z);
            default:
                return AbstractC9145b.m22876i((Function1) this.f15192x, (C30754a) this.f15193y, (Function1) this.f15194z);
        }
    }

    public /* synthetic */ C3718c(Object obj, Object obj2, boolean z4, Object obj3, int i13) {
        this.f15191w = i13;
        this.f15192x = obj;
        this.f15194z = obj2;
        this.f15193y = obj3;
    }

    public /* synthetic */ C3718c(InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, Object obj, int i13) {
        this.f15191w = i13;
        this.f15194z = interfaceC28601c1;
        this.f15192x = interfaceC28670t2;
        this.f15193y = obj;
    }
}
