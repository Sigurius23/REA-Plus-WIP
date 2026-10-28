package h02;

import af3.AbstractC0844t;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.stealthmode.view.StealthModeFragment;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import f60.C14138c;
import fm1.C14600d;
import gg0.C15824c;
import gh1.C15854d;
import h60.AbstractC16976e;
import h90.AbstractC17024b;
import h90.C17025c;
import hh2.C17296g;
import hs2.C17611e;
import hy0.AbstractC17741f0;
import hy0.AbstractC17770n;
import hy0.C17749h0;
import hy0.C17782r;
import i21.AbstractC17993c;
import i91.AbstractC18247a;
import ib2.AbstractC18337b;
import ib2.InterfaceC18340e;
import ig0.AbstractC18465e;
import ig0.AbstractC18467g;
import ih1.AbstractC18521e;
import is0.AbstractC20917x0;
import is0.InterfaceC20880f;
import iw0.AbstractC20992x;
import iw0.C20967f;
import iz0.AbstractC21048g;
import iz0.C21054m;
import j11.AbstractC21211n;
import java.util.List;
import je2.InterfaceC21624c;
import js2.AbstractC21925c;
import kd0.C22383c;
import kd1.AbstractC22403o;
import kd1.C22409u;
import ke2.AbstractC22423c;
import kf0.AbstractC22427b;
import kf0.AbstractC22431f;
import kh0.AbstractC22478e;
import ky2.AbstractC22893b;
import ky2.AbstractC22894c;
import ky2.AbstractC22896e;
import ky2.AbstractC22897f;
import ky2.InterfaceC22898g;
import l01.AbstractC23041m;
import l01.C23032d;
import l01.EnumC23048t;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p114eb.C12991u0;
import p291l0.InterfaceC23001u;
import p292l1.AbstractC23092f1;
import p292l1.C23204y;
import p294l3.C23248d;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p635y2.InterfaceC39105k;
import p708hb2.AbstractC17096d;
import p710im1.AbstractC18661c;
import p710im1.C18665d0;
import p715kotlin.jvm.functions.Function1;
import p745y81.EnumC39333f;
import y11.C39065r;
import y31.C39196e;

/* JADX INFO: renamed from: h02.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16576i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f63798E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63799w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f63800x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f63801y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f63802z;

    public /* synthetic */ C16576i(int i13, int i14, Object obj, Object obj2, Function1 function1) {
        this.f63799w = i14;
        this.f63802z = obj;
        this.f63800x = function1;
        this.f63798E = obj2;
        this.f63801y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63799w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC16578j.m47011j((List) this.f63802z, (CartAddIntent) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC16976e.m47745i((InterfaceC23001u) this.f63802z, (C14138c.a) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC17024b.m48011C((C17025c) this.f63802z, (UnitSystem) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC17096d.m48296l((String) this.f63802z, (C39196e) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return StealthModeFragment.m26108V((StealthModeFragment) this.f63802z, (C12991u0) this.f63798E, (C17296g) this.f63800x, this.f63801y, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC17770n.m50985M((Modifier) this.f63802z, (C17782r) this.f63798E, (C22409u) this.f63800x, this.f63801y, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC17770n.m50973A((Modifier) this.f63802z, (C17782r) this.f63798E, (AbstractC22403o) this.f63800x, this.f63801y, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC17770n.m50975C((AbstractC26165a) this.f63802z, (InterfaceC39105k) this.f63798E, (InterfaceC2302h) this.f63800x, this.f63801y, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC17741f0.m50861w((Modifier) this.f63802z, (C17749h0) this.f63798E, (InterfaceC2302h) this.f63800x, this.f63801y, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC17993c.m51609m((TextResource) this.f63802z, (EnumC39333f) this.f63798E, (C39065r) this.f63800x, this.f63801y, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC18337b.m52806F((InterfaceC18340e.a) this.f63802z, (Function1) this.f63800x, (InterfaceC4339a) this.f63798E, this.f63801y, (Composer) obj, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj2).intValue();
                return AbstractC18465e.m53216i((InterfaceC23001u) this.f63802z, (C15824c.b) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj2).intValue();
                return AbstractC18467g.m53247n((C15824c.d) this.f63802z, (Function1) this.f63800x, (C15824c.c) this.f63798E, this.f63801y, (Composer) obj, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj2).intValue();
                return AbstractC18521e.m53648i((InterfaceC23001u) this.f63802z, (C15854d.b) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj2).intValue();
                return AbstractC18661c.m54142o((List) this.f63802z, (C18665d0) this.f63798E, (C14600d) this.f63800x, this.f63801y, (Composer) obj, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj2).intValue();
                return AbstractC20917x0.m57989o((InterfaceC20880f) this.f63802z, (InterfaceC4339a) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj2).intValue();
                return AbstractC20992x.m58469x0((C20967f) this.f63802z, (Function1) this.f63800x, (Function1) this.f63798E, this.f63801y, (Composer) obj, iIntValue17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue18 = ((Integer) obj2).intValue();
                return AbstractC21048g.m58805K((AbstractC0844t) this.f63802z, (C23248d) this.f63798E, (C21054m) this.f63800x, this.f63801y, (Composer) obj, iIntValue18);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue19 = ((Integer) obj2).intValue();
                return AbstractC21211n.m59499q((InterfaceC4351m) this.f63802z, (InterfaceC4351m) this.f63798E, (InterfaceC4351m) this.f63800x, this.f63801y, (Composer) obj, iIntValue19);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue20 = ((Integer) obj2).intValue();
                return AbstractC21925c.m62421j((InterfaceC23001u) this.f63802z, (C17611e.a) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj2).intValue();
                return AbstractC22423c.m64569F((InterfaceC21624c) this.f63802z, (Function1) this.f63800x, (Function1) this.f63798E, this.f63801y, (Composer) obj, iIntValue21);
            case 21:
                int iIntValue22 = ((Integer) obj2).intValue();
                return AbstractC22427b.m64620n((InterfaceC23001u) this.f63802z, (C22383c.d) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue22);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue23 = ((Integer) obj2).intValue();
                return AbstractC22431f.m64655b0((C22383c.b) this.f63802z, (InterfaceC4339a) this.f63798E, (Function1) this.f63800x, this.f63801y, (Composer) obj, iIntValue23);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue24 = ((Integer) obj2).intValue();
                return AbstractC22478e.m64924q((AbstractC22403o) this.f63802z, (String) this.f63798E, (InterfaceC4339a) this.f63800x, this.f63801y, (Composer) obj, iIntValue24);
            case 24:
                int iIntValue25 = ((Integer) obj2).intValue();
                return AbstractC22893b.m66544k((InterfaceC22898g.a.C41939a) this.f63802z, (Function1) this.f63800x, (Function1) this.f63798E, this.f63801y, (Composer) obj, iIntValue25);
            case 25:
                int iIntValue26 = ((Integer) obj2).intValue();
                return AbstractC22894c.m66555k((InterfaceC22898g.a.b) this.f63802z, (Function1) this.f63800x, (Function1) this.f63798E, this.f63801y, (Composer) obj, iIntValue26);
            case 26:
                int iIntValue27 = ((Integer) obj2).intValue();
                return AbstractC22896e.m66572q((InterfaceC22898g) this.f63802z, (Function1) this.f63800x, (Function1) this.f63798E, this.f63801y, (Composer) obj, iIntValue27);
            case 27:
                int iIntValue28 = ((Integer) obj2).intValue();
                return AbstractC22897f.m66577e((TextResource) this.f63802z, (TextResource) this.f63798E, (InterfaceC4339a) this.f63800x, this.f63801y, (Composer) obj, iIntValue28);
            case 28:
                int iIntValue29 = ((Integer) obj2).intValue();
                return AbstractC23041m.m66848K((C23032d) this.f63802z, (AbstractC18247a) this.f63798E, (EnumC23048t) this.f63800x, this.f63801y, (Composer) obj, iIntValue29);
            default:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(7);
                AbstractC23092f1.m67072f((Modifier) this.f63802z, this.f63801y, (Function1) this.f63800x, (C23204y) this.f63798E, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C16576i(Modifier modifier, int i13, Function1 function1, C23204y c23204y, int i14) {
        this.f63799w = 29;
        this.f63802z = modifier;
        this.f63801y = i13;
        this.f63800x = function1;
        this.f63798E = c23204y;
    }

    public /* synthetic */ C16576i(Object obj, Object obj2, Object obj3, int i13, int i14) {
        this.f63799w = i14;
        this.f63802z = obj;
        this.f63798E = obj2;
        this.f63800x = obj3;
        this.f63801y = i13;
    }
}
