package um0;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import com.stripe.android.p056ui.core.cardscan.CardScanActivityResultException;
import com.stripe.android.p056ui.core.cardscan.CardScanParseException;
import com.whoop.cache.persistence.C6101a;
import com.whoop.sleep.coach.alarmWarning.view.TurnoffAlarmWarningFragment;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import mg.InterfaceC25526h;
import p002a0.C0022g;
import p077d0.C11335b2;
import p096dq.C12260d;
import p096dq.C12267k;
import p208i2.C17919x;
import p235iz.C21040d;
import p236j.C21062a;
import p270k2.InterfaceC22131e;
import p279kd.C22378e;
import p329n0.InterfaceC26064q;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p460rg.AbstractC31366a;
import p500tb.InterfaceC33687a;
import p579wc.C37127x0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import so1.AbstractC32807c0;
import so1.C32808d;
import so1.C32817h0;
import so1.C32836t;
import te2.C33752a;
import te2.InterfaceC33753b;
import tp1.C34069i;
import tp1.C34077q;
import tw0.AbstractC34217c;
import us1.C35219b;
import us2.AbstractC35225f;
import uu2.AbstractC35261l;
import uu2.C35260k0;
import uv2.C35286c;
import uv2.InterfaceC35284a;
import uw0.AbstractC35304n;
import uy1.C35381e;
import v30.C35596e;
import v30.C35598g;
import v30.C35599h;
import v30.C35600i;
import v30.C35604m;
import v30.InterfaceC35593b;
import vo1.AbstractC36245t;
import vo1.AbstractC36249x;
import vp1.AbstractC36272h;
import vs1.C36472a;
import vs2.AbstractC36479e;
import vt2.AbstractC36497f;
import vt2.C36499h;
import vv2.AbstractC36539e;
import vv2.C36535a;
import vx0.AbstractC36555c;
import vx0.C36557e;
import w11.AbstractC36695b;
import w11.C36696c;
import w21.AbstractC36739c;
import w21.C36738b;
import w51.AbstractC36841g;
import w51.C36840f;
import w71.AbstractC36905x;
import w71.C36901t;
import w71.C36902u;
import w71.C36903v;
import we1.C37227k;
import we1.C37228l;
import wo1.AbstractC37451h0;
import wo1.AbstractC37456k;
import wo1.AbstractC37464o;
import wt2.C37635p;
import x20.C37844l;
import x20.C37855w;

/* JADX INFO: renamed from: um0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35076b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f148813w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f148814x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f148815y;

    public /* synthetic */ C35076b(int i13, Object obj, Object obj2) {
        this.f148813w = i13;
        this.f148814x = obj;
        this.f148815y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object c35600i;
        C21040d c21040d;
        switch (this.f148813w) {
            case 0:
                return C6101a.m18312J((C6101a) this.f148814x, (C35077c) this.f148815y, (InterfaceC33687a) obj);
            case 1:
                return C6101a.m18325y((C6101a) this.f148814x, (InterfaceC33687a) this.f148815y, (C0022g) obj);
            case 2:
                return ((C35219b) this.f148814x).m111582u((C36472a) this.f148815y, (InterfaceC33687a) obj);
            case 3:
                return AbstractC35261l.m111757B((C35260k0) this.f148814x, (Context) this.f148815y, obj);
            case 4:
                return AbstractC35304n.m112070u((InterfaceC4339a) this.f148814x, (InterfaceC23462h) this.f148815y, (AbstractC34217c) obj);
            case 5:
                C35596e c35596e = (C35596e) this.f148814x;
                Function1 function1 = (Function1) this.f148815y;
                C21062a result = (C21062a) obj;
                AbstractC22676k.m65750j(result, "result");
                c35596e.f151366d = false;
                InterfaceC35593b interfaceC35593b = c35596e.f151364b;
                Intent intent = result.f79916x;
                int i13 = result.f79915w;
                if (i13 == -1 && intent != null) {
                    Parcelable.Creator<C12267k> creator = C12267k.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentCardRecognitionResult");
                    C12267k c12267k = (C12267k) (byteArrayExtra == null ? null : AbstractC31366a.m96470j(byteArrayExtra, creator));
                    String str = c12267k != null ? c12267k.f41074w : null;
                    C12260d c12260d = c12267k != null ? c12267k.f41075x : null;
                    if (str != null) {
                        c35600i = new C35599h(new C35604m(c12260d != null ? Integer.valueOf(c12260d.f41036w) : null, c12260d != null ? Integer.valueOf(c12260d.f41037x) : null, str));
                    } else {
                        c35600i = new C35600i(new CardScanParseException("PAN not found in PaymentCardRecognitionResult"));
                    }
                } else if (i13 == 0) {
                    c35600i = C35598g.f151371a;
                } else {
                    String message = "Invalid activity result: code=" + i13 + ", hasData=" + (intent != null);
                    AbstractC22676k.m65750j(message, "message");
                    c35600i = new C35600i(new CardScanActivityResultException(message));
                }
                if (c35600i instanceof C35599h) {
                    interfaceC35593b.mo46114f();
                } else if (c35600i instanceof C35598g) {
                    interfaceC35593b.mo46109a();
                } else {
                    if (!(c35600i instanceof C35600i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC35593b.mo46112d(((C35600i) c35600i).f151373a);
                }
                function1.invoke(c35600i);
                return C23454a0.f92919a;
            case 6:
                return TurnoffAlarmWarningFragment.m25920I((C33752a) this.f148814x, (TurnoffAlarmWarningFragment) this.f148815y, (InterfaceC33753b) obj);
            case 7:
                return AbstractC36245t.m115571A((String) this.f148814x, (AbstractC32807c0.f) this.f148815y, (InterfaceC26064q) obj);
            case 8:
                return AbstractC36245t.m115598z((Function1) this.f148814x, (AbstractC32807c0.f) this.f148815y, ((Integer) obj).intValue());
            case 9:
                return AbstractC36249x.m115642u((Function1) this.f148814x, (C32817h0) this.f148815y, obj);
            case 10:
                return AbstractC36272h.m115874r1((C34077q) this.f148814x, (Function1) this.f148815y, (InterfaceC26064q) obj);
            case 11:
                return AbstractC36272h.m115755H1((Function1) this.f148814x, (C34069i) this.f148815y, obj);
            case 12:
                return AbstractC36479e.m116866a0((AbstractC35225f.c) this.f148814x, (Function1) this.f148815y, (InterfaceC26064q) obj);
            case 13:
                return AbstractC36497f.m116963I((C36499h) this.f148814x, (C37635p) this.f148815y, obj);
            case 14:
                return AbstractC36539e.m117093C((C36535a) this.f148814x, (InterfaceC23462h) this.f148815y, (InterfaceC35284a) obj);
            case 15:
                return AbstractC36539e.m117097G((C35286c.b) this.f148814x, (Function1) this.f148815y, (InterfaceC26064q) obj);
            case 16:
                return AbstractC36555c.m117245y((InterfaceC28670t2) this.f148814x, (C36557e) this.f148815y, (InterfaceC26064q) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return p743vy1.Function1.m117569z((InterfaceC1585g0) this.f148814x, (C35381e) this.f148815y, (C28624i0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36695b.m117785v((C36696c) this.f148814x, (Function1) this.f148815y, (InterfaceC26064q) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC36739c.m117864g((C36738b.a) this.f148814x, (Function1) this.f148815y, ((Integer) obj).intValue());
            case 20:
                return AbstractC36841g.m118124r((C36840f) this.f148814x, (C17919x) this.f148815y, (InterfaceC22131e) obj);
            case 21:
                return C36902u.m118493d((Function1) this.f148814x, (C36901t) this.f148815y, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC36905x.m118505f((Function1) this.f148814x, (C36903v) this.f148815y, ((Float) obj).floatValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C37127x0 c37127x0 = (C37127x0) this.f148814x;
                InterfaceC25526h interfaceC25526h = (InterfaceC25526h) this.f148815y;
                C22378e fromEnvironment = (C22378e) obj;
                AbstractC22676k.m65750j(fromEnvironment, "$this$fromEnvironment");
                fromEnvironment.f87356d = c37127x0.f158843x;
                fromEnvironment.f87353a.m133455G(c37127x0.f158845z);
                fromEnvironment.f87362j = interfaceC25526h;
                return C23454a0.f92919a;
            case 24:
                return ((C37227k) this.f148814x).m119317i((C37228l) this.f148815y, (InterfaceC33687a) obj);
            case 25:
                return AbstractC37456k.m119979p((Function1) this.f148814x, (C32808d) this.f148815y, obj);
            case 26:
                return AbstractC37464o.m120058s((C32836t) this.f148814x, (InterfaceC28601c1) this.f148815y, ((Boolean) obj).booleanValue());
            case 27:
                return AbstractC37451h0.m119938p((List) this.f148814x, (InterfaceC28601c1) this.f148815y, ((Integer) obj).intValue());
            case 28:
                C37855w c37855w = (C37855w) this.f148814x;
                InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) this.f148815y;
                C28624i0 DisposableEffect = (C28624i0) obj;
                AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
                C37844l c37844l = new C37844l(c37855w);
                interfaceC1585g0.getLifecycle().mo4986a(c37844l);
                return new C11335b2(7, interfaceC1585g0, c37844l);
            default:
                C22669g0 c22669g0 = (C22669g0) this.f148814x;
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) this.f148815y;
                C21040d AndroidViewBinding = (C21040d) obj;
                AbstractC22676k.m65750j(AndroidViewBinding, "$this$AndroidViewBinding");
                if (((Boolean) interfaceC28670t2.getValue()).booleanValue() && (c21040d = (C21040d) c22669g0.f89336w) != null) {
                    c21040d.f79774b.setVisibility(8);
                }
                return C23454a0.f92919a;
        }
    }
}
