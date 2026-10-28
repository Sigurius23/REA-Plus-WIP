package jp1;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.achievements.celebration.AbstractC5736a;
import com.whoop.achievements.celebration.AbstractC5739d;
import com.whoop.integrations.view.IntegrationsFragment;
import com.whoop.membership.extensions.view.MembershipExtensionsFragment;
import com.whoop.navigation.models.GenericInteraction;
import fr1.C14715d;
import fr1.InterfaceC14714c;
import gr1.C16095b;
import gr1.C16101h;
import gr1.C16110q;
import gr1.C16111r;
import h62.AbstractC16981a;
import hp1.C17542b;
import hp1.C17553m;
import i93.C18284j;
import il2.C18651b;
import in1.InterfaceC18724d;
import iu0.C20935a;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import jr1.AbstractC21896d;
import jr1.AbstractC21899g;
import ju0.C21960b;
import jv2.InterfaceC21972c;
import k01.AbstractC22092d;
import k01.C22093e;
import kl2.AbstractC22576k;
import km0.AbstractC22578b;
import km0.C22577a;
import kr1.AbstractC22811d;
import ku0.C22835d;
import kv2.AbstractC22846b;
import l01.AbstractC23035g;
import l01.C23036h;
import l62.C23381b;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ld0.C23846e;
import ld0.C23852k;
import lf0.AbstractC23901b2;
import lf0.AbstractC23917f2;
import lf0.AbstractC23924h1;
import lf0.AbstractC23939l0;
import lf0.AbstractC23940l1;
import lf0.AbstractC23961q2;
import lf0.C23928i1;
import lf0.C23943m0;
import lf0.C23944m1;
import lf0.C23965r2;
import lg2.AbstractC24038c;
import ln1.AbstractC24539q;
import lu0.C24747c;
import ml2.InterfaceC25676a;
import nl2.C26816c;
import p005a3.C0238p0;
import p077d0.C11344e;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17891j;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p292l1.AbstractC23141n2;
import p292l1.C23104h1;
import p292l1.C23176t1;
import p292l1.C23196w3;
import p292l1.InterfaceC23142n3;
import p329n0.InterfaceC26064q;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p500tb.InterfaceC33687a;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: jp1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21851c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84395w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f84396x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f84397y;

    public /* synthetic */ C21851c(int i13, Object obj, Object obj2) {
        this.f84395w = i13;
        this.f84397y = obj;
        this.f84396x = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84395w) {
            case 0:
                return AbstractC21854f.m61852m((Calendar) this.f84397y, (C17542b) this.f84396x, (Context) obj);
            case 1:
                return AbstractC21854f.m61856q((Function1) this.f84397y, (C17542b) this.f84396x, obj);
            case 2:
                return AbstractC21869u.m61995y((Function1) this.f84397y, (C17553m) this.f84396x, obj);
            case 3:
                return AbstractC21896d.m62187O((Function1) this.f84397y, (C16095b) this.f84396x, obj);
            case 4:
                return AbstractC21899g.m62287m((C16110q) this.f84397y, (Function1) this.f84396x, (InterfaceC26064q) obj);
            case 5:
                return AbstractC21899g.m62291q((Function1) this.f84397y, (C16101h) this.f84396x, obj);
            case 6:
                return IntegrationsFragment.m22265Y((C14715d) this.f84397y, (IntegrationsFragment) this.f84396x, (InterfaceC14714c) obj);
            case 7:
                return ((C21960b) this.f84397y).m62696j((C20935a) this.f84396x, (InterfaceC33687a) obj);
            case 8:
                return AbstractC22092d.m63195u((C22093e) this.f84397y, (Function1) this.f84396x, obj);
            case 9:
                return AbstractC22576k.m65344G((C18651b) this.f84397y, (InterfaceC23462h) this.f84396x, (InterfaceC25676a) obj);
            case 10:
                return AbstractC22576k.m65352O((C26816c.f) this.f84397y, (Function1) this.f84396x, obj);
            case 11:
                return AbstractC22578b.m65406f((Function1) this.f84397y, (C22577a) this.f84396x, ((Boolean) obj).booleanValue());
            case 12:
                return AbstractC22811d.m66070g((InterfaceC4351m) this.f84397y, (C16111r) this.f84396x, ((Boolean) obj).booleanValue());
            case 13:
                return ((C22835d) this.f84397y).m66217k((C24747c) this.f84396x, (InterfaceC33687a) obj);
            case 14:
                return AbstractC22846b.m66270u((InterfaceC21972c.b) this.f84397y, (Function1) this.f84396x, (InterfaceC26064q) obj);
            case 15:
                return MembershipExtensionsFragment.m22701t0((MembershipExtensionsFragment) this.f84397y, (InterfaceC28601c1) this.f84396x, (C28624i0) obj);
            case 16:
                return AbstractC23035g.m66827m((Function1) this.f84397y, (C23036h) this.f84396x, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC23142n3 interfaceC23142n3 = (InterfaceC23142n3) this.f84397y;
                Locale locale = (Locale) this.f84396x;
                List list = (List) obj;
                Long l7 = (Long) list.get(0);
                Long l12 = (Long) list.get(1);
                Object obj2 = list.get(2);
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(3);
                AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Int");
                C18284j c18284j = new C18284j(iIntValue, ((Integer) obj3).intValue(), 1);
                Object obj4 = list.get(4);
                AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.Int");
                return new C23104h1(l7, l12, c18284j, ((Integer) obj4).intValue(), interfaceC23142n3, locale);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C17891j c17891j = (C17891j) this.f84397y;
                C23176t1 c23176t1 = (C23176t1) this.f84396x;
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                c0238p0.m728a();
                C11344e c11344e = c23176t1.f91684X;
                AbstractC22676k.m65747g(c11344e);
                InterfaceC22131e.m63378L(c0238p0, c17891j, new C17875c1(((C17919x) c11344e.m30549e()).f69639a), 0.0f, null, 60);
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C23196w3 c23196w3 = (C23196w3) this.f84397y;
                C11344e c11344e2 = (C11344e) this.f84396x;
                InterfaceC17886g0 interfaceC17886g0 = (InterfaceC17886g0) obj;
                float fM87022x = c23196w3.f91787e.f97550j.m87022x();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((C17920x0) interfaceC17886g0).f69653R & 4294967295L));
                if (!Float.isNaN(fM87022x) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) c11344e2.m30549e()).floatValue();
                    C17920x0 c17920x0 = (C17920x0) interfaceC17886g0;
                    c17920x0.m51560p(AbstractC23141n2.m67123e(fFloatValue, interfaceC17886g0));
                    c17920x0.m51561r(AbstractC23141n2.m67124f(fFloatValue, interfaceC17886g0));
                    c17920x0.m51565y(AbstractC17918w0.m51524l(0.5f, (fM87022x + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return C23454a0.f92919a;
            case 20:
                return AbstractC5736a.m17024j((Function1) this.f84397y, (AbstractC5739d) this.f84396x, obj);
            case 21:
                return C23381b.m67679b((C23381b) this.f84397y, (String) this.f84396x, (AbstractC16981a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23939l0.m70486h((C23943m0) this.f84397y, (Function1) this.f84396x, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23924h1.m70381o((Function1) this.f84397y, (C23928i1) this.f84396x, obj);
            case 24:
                return AbstractC23940l1.m70509u((C23944m1) this.f84397y, (InterfaceC28601c1) this.f84396x, obj);
            case 25:
                return AbstractC23901b2.m70257p((Function1) this.f84397y, (C23852k) this.f84396x, ((Boolean) obj).booleanValue());
            case 26:
                return AbstractC23917f2.m70346z((Function1) this.f84397y, (C23846e) this.f84396x, (InterfaceC39147y) obj);
            case 27:
                return AbstractC23961q2.m70616h((Function1) this.f84397y, (C23965r2) this.f84396x, obj);
            case 28:
                return AbstractC24038c.m70924k((Function1) this.f84397y, (InterfaceC34116n) this.f84396x, (GenericInteraction) obj);
            default:
                return AbstractC24539q.m71503N((InterfaceC18724d) this.f84397y, (Function1) this.f84396x, (InterfaceC26064q) obj);
        }
    }
}
