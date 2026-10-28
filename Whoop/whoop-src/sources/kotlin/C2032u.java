package kotlin;

import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import b30.C2571m0;
import b30.EnumC2597p2;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import bk2.AbstractC3360g;
import bs1.AbstractC3583c0;
import c41.AbstractC4157y4;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;
import com.whoop.design.util.TextResource;
import cz.C11223r0;
import d00.C11433l;
import d11.AbstractC11471f;
import d11.C11474i;
import d21.C11505c;
import ds1.C12341k;
import e30.AbstractC12605c;
import fr1.AbstractC14713b;
import gg0.C15824c;
import gr1.C16103j;
import gr1.C16110q;
import gv2.C16246d;
import h00.AbstractC16501f0;
import h20.C16687l;
import hv2.AbstractC17687i;
import hy0.AbstractC17725b0;
import i91.AbstractC18247a;
import ig0.AbstractC18466f;
import java.util.List;
import jr1.AbstractC21899g;
import l00.AbstractC23024f;
import l83.C23454a0;
import ld0.C23857p;
import lf0.AbstractC23927i0;
import lf0.AbstractC23940l1;
import lf0.AbstractC23971t0;
import lf0.C23931j0;
import lf0.C23944m1;
import m00.C24869a;
import m40.C25046w;
import mf0.AbstractC25506e;
import n03.C26100k;
import nh0.AbstractC26718b;
import nh0.C26719c;
import no0.AbstractC26951i;
import o00.C27343a;
import o71.AbstractC27633c;
import p097ds.AbstractC12313p;
import p108e4.AbstractC12667a;
import p114eb.C12991u0;
import p132f0.C13821r1;
import p163g1.C15199y3;
import p292l1.AbstractC23200x1;
import p292l1.C23132m;
import p292l1.C23154p3;
import p292l1.C23196w3;
import p292l1.C23209y4;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p477s2.AbstractC32073e;
import p490t0.C33252i;
import p507tx.AbstractC34235f;
import p602x1.C37816b;
import p704dk2.AbstractC12121h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.C25307p;
import ug.AbstractC34924m;
import v41.AbstractC35664f;
import y71.AbstractC39279l;
import y71.C39282o;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.u */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2032u implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f8051E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8052w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f8053x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f8054y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f8055z;

    public /* synthetic */ C2032u(int i13, int i14, Object obj, Object obj2, Object obj3, Function1 function1) {
        this.f8052w = i14;
        this.f8053x = obj;
        this.f8055z = obj2;
        this.f8051E = obj3;
        this.f8054y = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8052w) {
            case 0:
                return AbstractC2036w.m6370J((AbstractC39758e.i) this.f8053x, (Function1) this.f8054y, (InterfaceC2994c0) this.f8055z, (AbstractC35664f.a) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).getClass();
                AbstractC12313p.m34291i((AbstractC12605c) this.f8053x, (EnumC2597p2) this.f8054y, (Modifier) this.f8055z, (C13821r1) this.f8051E, (Composer) obj, AbstractC28683x.m87244L(49));
                return C23454a0.f92919a;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC32073e.m99741e((C16687l) this.f8053x, (String) this.f8054y, (InterfaceC4339a) this.f8055z, (InterfaceC4339a) this.f8051E, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 3:
                return AbstractC3583c0.m10755G1((Function1) this.f8054y, (C12341k) this.f8053x, (InterfaceC2994c0) this.f8055z, (C15199y3) this.f8051E, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 4:
                return AbstractC4157y4.m12970v((TextResource) this.f8053x, (InterfaceC4339a) this.f8054y, (TextResource) this.f8055z, (InterfaceC4339a) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return AtomicGalleryFragment.m21100B0((AbstractC35664f) this.f8053x, (InterfaceC4339a) this.f8055z, (AtomicGalleryFragment) this.f8051E, (Function1) this.f8054y, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AtomicGalleryFragment.m21106E0((C13821r1) this.f8053x, (AtomicGalleryFragment) this.f8055z, (Function1) this.f8054y, (InterfaceC28601c1) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC11471f.m30789n((C11474i) this.f8053x, (Modifier) this.f8054y, (InterfaceC4339a) this.f8055z, (InterfaceC4339a) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC12121h.m33522m((AbstractC3360g) this.f8053x, (InterfaceC4339a) this.f8055z, (Function1) this.f8054y, (Function1) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AbstractC14713b.m42170i((C12991u0) this.f8053x, (C16110q) this.f8055z, (Function1) this.f8054y, (Function1) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                ((Integer) obj2).getClass();
                AbstractC12667a.m35458j((C11223r0) this.f8053x, (Function1) this.f8054y, (Function1) this.f8055z, (Modifier) this.f8051E, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC34235f.m108228n((C11433l) this.f8053x, (InterfaceC4339a) this.f8055z, (InterfaceC4339a) this.f8051E, (Function1) this.f8054y, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC16501f0.m46669a((C12991u0) this.f8053x, (String) this.f8055z, (Modifier) this.f8051E, (Function1) this.f8054y, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 13:
                return AbstractC17687i.m50507l0((InterfaceC28601c1) this.f8053x, (InterfaceC28601c1) this.f8055z, (C16246d) this.f8051E, (Function1) this.f8054y, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return AbstractC17725b0.m50775l((TextResource) this.f8053x, (AbstractC18247a) this.f8054y, (AbstractC18247a) this.f8055z, (C2886a) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AbstractC18466f.m53229h((C13821r1) this.f8053x, (C15824c.e) this.f8055z, (C15824c) this.f8051E, (Function1) this.f8054y, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return AbstractC21899g.m62294t((C39282o) this.f8053x, (AbstractC39279l.c) this.f8055z, (Function1) this.f8054y, (C16103j) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                AbstractC23024f.m66791j((C25046w) this.f8053x, (String) this.f8054y, (String) this.f8055z, (String) this.f8051E, (Composer) obj, AbstractC28683x.m87244L(9));
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                AbstractC23200x1.m67158b((C23132m) this.f8053x, (C23154p3) this.f8054y, (C23209y4) this.f8055z, (C37816b) this.f8051E, (Composer) obj, AbstractC28683x.m87244L(3073));
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23927i0.m70410n((InterfaceC28601c1) this.f8053x, (C23931j0) this.f8055z, (InterfaceC28670t2) this.f8051E, (Function1) this.f8054y, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return AbstractC23971t0.m70702m((Function1) this.f8054y, (InterfaceC28601c1) this.f8053x, (C23857p) this.f8055z, (InterfaceC28670t2) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return AbstractC23940l1.m70511w((C23944m1) this.f8053x, (Function1) this.f8054y, (InterfaceC28601c1) this.f8055z, (InterfaceC28601c1) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                AbstractC3269g.m9500d((C24869a) this.f8053x, (Function1) this.f8054y, (InterfaceC4339a) this.f8055z, (InterfaceC4339a) this.f8051E, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC25303l.m74298y((C25306o) this.f8053x, (Function1) this.f8054y, (C25307p) this.f8055z, (Function3) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return AbstractC25506e.m74930U((InterfaceC2994c0) this.f8055z, (InterfaceC28601c1) this.f8053x, (C15199y3) this.f8054y, (InterfaceC28601c1) this.f8051E, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 25:
                return C26100k.m77664v((Context) this.f8053x, (String) this.f8054y, (String) this.f8055z, (String) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC26718b.m79438m((Modifier) this.f8053x, (C33252i) this.f8055z, (C26719c) this.f8051E, (Function1) this.f8054y, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC26951i.m80538s((C23196w3) this.f8053x, (Function1) this.f8054y, (BottomSheet) this.f8055z, (List) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                ((Integer) obj2).getClass();
                AbstractC34924m.m110147h((C2571m0) this.f8053x, (C27343a) this.f8054y, (InterfaceC4339a) this.f8055z, (InterfaceC4339a) this.f8051E, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            default:
                return AbstractC27633c.m83423m((C11505c) this.f8053x, (InterfaceC28593a1) this.f8055z, (Function1) this.f8054y, (InterfaceC28601c1) this.f8051E, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C2032u(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f8052w = 24;
        this.f8055z = interfaceC2994c0;
        this.f8053x = interfaceC28601c1;
        this.f8054y = c15199y3;
        this.f8051E = interfaceC28601c2;
    }

    public /* synthetic */ C2032u(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f8052w = i13;
        this.f8053x = obj;
        this.f8054y = obj2;
        this.f8055z = obj3;
        this.f8051E = obj4;
    }

    public /* synthetic */ C2032u(Object obj, Object obj2, Object obj3, Object obj4, int i13, int i14) {
        this.f8052w = i14;
        this.f8053x = obj;
        this.f8054y = obj2;
        this.f8055z = obj3;
        this.f8051E = obj4;
    }

    public /* synthetic */ C2032u(Object obj, Object obj2, Object obj3, Function1 function1, int i13) {
        this.f8052w = i13;
        this.f8053x = obj;
        this.f8055z = obj2;
        this.f8051E = obj3;
        this.f8054y = function1;
    }

    public /* synthetic */ C2032u(Object obj, Object obj2, Function1 function1, Object obj3, int i13) {
        this.f8052w = i13;
        this.f8053x = obj;
        this.f8055z = obj2;
        this.f8054y = function1;
        this.f8051E = obj3;
    }

    public /* synthetic */ C2032u(Function1 function1, Object obj, Object obj2, Object obj3, int i13) {
        this.f8052w = i13;
        this.f8054y = function1;
        this.f8053x = obj;
        this.f8055z = obj2;
        this.f8051E = obj3;
    }
}
