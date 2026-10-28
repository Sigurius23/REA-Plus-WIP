package p003a1;

import a42.C0378a;
import aa2.C0597f;
import android.content.ContentResolver;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.fragment.app.FragmentContainerView;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.C1812n0;
import aq0.C1906q;
import aq1.AbstractC1912f;
import as2.C1951a;
import az1.AbstractC2166g;
import b30.AbstractActivityC2546j;
import b30.C2602q;
import bd3.C3141t;
import bg.C3216k;
import bh0.C3248a;
import bh3.InterfaceC3255b;
import bl2.C3375d;
import c01.AbstractC3805e;
import c01.C3808h;
import c21.AbstractC3889b;
import c21.C3891d;
import c51.AbstractC4234k;
import c51.C4242s;
import cc2.AbstractC4417f;
import cc2.C4414c;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;
import com.whoop.edit.view.EditActivityFragment;
import com.whoop.membership.returns.view.ReturnsFragment;
import com.whoop.p057ai.chat.models.AIMessage;
import com.whoop.pairing.membershipAdjustment.MembershipAdjustmentFragment;
import com.whoop.pregnancy.view.PregnancySettingsFragment;
import f22.AbstractC14032d;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23480z;
import n20.C26186u;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0240p2;
import p023ay.C2148v;
import p023ay.C2150x;
import p023ay.C2151y;
import p025b1.C2212c;
import p025b1.C2214e;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p161g.AbstractC14917t;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p236j.AbstractC21065d;
import p270k2.InterfaceC22129c;
import p329n0.InterfaceC26064q;
import p353o0.InterfaceC27335s;
import p510u0.InterfaceC34345p0;
import p518ub.InterfaceC34728a;
import p568w0.C36625a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import s40.C32132a;
import va3.AbstractC35846d;
import wy1.InterfaceC37694a;
import xx1.C38691a;
import xx1.InterfaceC38692b;
import y00.InterfaceC38802c8;
import yd1.AbstractC39457a;
import yd1.C39458b;
import yp1.AbstractC39703b;
import z10.C39990m;
import z10.C39991n;
import zy1.C41220b;

/* JADX INFO: renamed from: a1.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0103b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f328w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f329x;

    public /* synthetic */ C0103b(C0103b c0103b, C0106e c0106e) {
        this.f328w = 1;
        this.f329x = c0103b;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f328w) {
            case 0:
                C0104c c0104c = (C0104c) this.f329x;
                c0104c.f330Q.invoke((C36625a) obj, AbstractC0201g.m506f(c0104c, AndroidCompositionLocals_androidKt.f4976b));
                return C23454a0.f92919a;
            case 1:
                C0103b c0103b = (C0103b) this.f329x;
                InterfaceC0240p2 interfaceC0240p2 = (InterfaceC0240p2) obj;
                if (!(interfaceC0240p2 instanceof C0102a)) {
                    throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                c0103b.invoke(((C0102a) interfaceC0240p2).f327O);
                return Boolean.TRUE;
            case 2:
                ((Function1) obj).invoke((C36625a) this.f329x);
                return C23454a0.f92919a;
            case 3:
                return new C39991n((InterfaceC38802c8) obj, new C39990m((FinancialConnectionsSession) this.f329x), null);
            case 4:
                return ((C0597f) this.f329x).m1580y((InterfaceC30057d) obj);
            case 5:
                return EditActivityFragment.m21323k0((C39458b) this.f329x, (AbstractC39457a) obj);
            case 6:
                C1812n0 c1812n0 = (C1812n0) this.f329x;
                InterfaceC34728a db4 = (InterfaceC34728a) obj;
                AbstractC22676k.m65750j(db4, "db");
                c1812n0.f7125h = db4;
                return C23454a0.f92919a;
            case 7:
                return C1906q.m5825w2((ContentResolver) this.f329x, (Uri) obj);
            case 8:
                return AbstractC1912f.m5869y((AbstractC39703b.c) this.f329x, (InterfaceC26064q) obj);
            case 9:
                return C1951a.m5962b((InterfaceC3255b) this.f329x, (View) obj);
            case 10:
                C2148v c2148v = (C2148v) this.f329x;
                C32132a host = (C32132a) obj;
                AbstractC22676k.m65750j(host, "host");
                AbstractC21065d abstractC21065d = c2148v.f8551d;
                return abstractC21065d != null ? new C2151y(abstractC21065d, 0) : new C2150x(host, 0);
            case 11:
                return ReturnsFragment.m22848I((C38691a) this.f329x, (InterfaceC38692b) obj);
            case 12:
                return AbstractC2166g.m6764t((C41220b) this.f329x, (InterfaceC37694a) obj);
            case 13:
                return new C2214e((C2212c) this.f329x, 0);
            case 14:
                AbstractActivityC2546j abstractActivityC2546j = (AbstractActivityC2546j) this.f329x;
                AbstractC14917t addCallback = (AbstractC14917t) obj;
                AbstractC22676k.m65750j(addCallback, "$this$addCallback");
                abstractActivityC2546j.mo7466o().m35335t();
                return C23454a0.f92919a;
            case 15:
                C2602q c2602q = (C2602q) this.f329x;
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51806e(c2602q.f10126a.f167261x, semantics);
                return C23454a0.f92919a;
            case 16:
                ((C26186u) this.f329x).f103863z = ((Boolean) obj).booleanValue();
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) this.f329x;
                InterfaceC34345p0 KeyboardActions = (InterfaceC34345p0) obj;
                AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
                if (interfaceC2464x2 != null) {
                    ((C2463x1) interfaceC2464x2).m7442a();
                }
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC1329o1 abstractC1329o1 = (AbstractC1329o1) this.f329x;
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4139D = abstractC1329o1 != null ? abstractC1329o1.m4139D(((FragmentContainerView) obj).getId()) : null;
                if (abstractComponentCallbacksC1320m0M4139D != null && !abstractC1329o1.m4147Q()) {
                    C1271a c1271a = new C1271a(abstractC1329o1);
                    c1271a.m4050n(abstractComponentCallbacksC1320m0M4139D);
                    c1271a.m4048l();
                }
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C3141t c3141t = (C3141t) this.f329x;
                JsonElement node = (JsonElement) obj;
                AbstractC22676k.m65750j(node, "node");
                c3141t.mo9031d(c3141t.getCurrentTag(), node);
                return C23454a0.f92919a;
            case 20:
                int i13 = ((C23480z) ((C3216k) this.f329x).f12581c.getValue()).f92958w[((Integer) obj).intValue()] & 65535;
                AbstractC35846d.m113779c(16);
                String string = Integer.toString(i13, 16);
                AbstractC22676k.m65749i(string, "toString(...)");
                return string;
            case 21:
                return C3248a.m9402q((C3248a) this.f329x, (AIMessage) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C3375d.m9744G((C3375d) this.f329x, (C29218v0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC3805e.m11626r((C3808h) this.f329x, (InterfaceC27335s) obj);
            case 24:
                return AbstractC3889b.m11873k((C3891d) this.f329x, (InterfaceC26064q) obj);
            case 25:
                return MembershipAdjustmentFragment.m23189L((MembershipAdjustmentFragment) this.f329x, (AbstractC14032d) obj);
            case 26:
                return PregnancySettingsFragment.m23310p0((C0378a) this.f329x, (String) obj);
            case 27:
                return AbstractC4234k.m13135H((C4242s) this.f329x, (InterfaceC22129c) obj);
            case 28:
                return AbstractC4417f.m13861i((C4414c) this.f329x, (WebView) obj);
            default:
                return AtomicGalleryFragment.m21198y0((AtomicGalleryFragment) this.f329x, obj);
        }
    }

    public /* synthetic */ C0103b(Object obj, int i13) {
        this.f328w = i13;
        this.f329x = obj;
    }
}
