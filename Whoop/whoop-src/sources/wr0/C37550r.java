package wr0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity;
import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment;
import ih0.AbstractC18489d0;
import java.util.Arrays;
import java.util.Locale;
import l21.C23239c;
import l83.C23454a0;
import ny0.C27256h;
import p390p1.InterfaceC28670t2;
import p478s3.AbstractC32097c;
import p478s3.C32095a;
import p605x6.C38011p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qh0.C30365b;
import sz.C33151q;
import tk2.C33895m;
import uw1.C35315h;
import v30.C35596e;
import vp2.C36276c;
import wb0.C37032c;
import wn2.InterfaceC37431i;
import x01.AbstractC37800b;
import x01.C37801c;
import x11.C37827a;
import x11.C37829c;
import x20.C37848p;
import x20.C37855w;
import x20.EnumC37847o;
import x30.C37877c;
import x51.AbstractC37989a;
import x51.AbstractC37991c;
import x71.AbstractC38040b;
import x71.C38042d;
import xc2.InterfaceC38193d;
import xd2.C38217m;
import xd2.InterfaceC38212h;
import xh0.AbstractC38307c;
import xl0.AbstractC38449c;
import xl0.C38450d;
import xp2.AbstractC38537f;
import xw1.AbstractC38682f;
import xz0.AbstractC38754e;
import xz0.C38755f;
import y11.C39055h;
import y11.C39059l;
import y31.C39193b;
import y31.C39196e;
import y80.AbstractC39326c;
import y80.C39327d;
import yb0.AbstractC39384g;
import yb3.C39412p;
import yc2.AbstractC39436c;
import yd2.AbstractC39462d;
import yd2.AbstractC39469k;
import yk2.AbstractC39612l;
import yl0.AbstractC39631n;
import yl2.C39635b;
import yl2.C39644k;
import yn2.AbstractC39675b;

/* JADX INFO: renamed from: wr0.r */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37550r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160562w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f160563x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f160564y;

    public /* synthetic */ C37550r(int i13, Object obj, Object obj2) {
        this.f160562w = i13;
        this.f160564y = obj;
        this.f160563x = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f160562w) {
            case 0:
                return AbstractC37552s.m120465r((C37554t) this.f160564y, (Function1) this.f160563x);
            case 1:
                return AbstractC37535j0.m120388r((Function1) this.f160563x, (C37539l0) this.f160564y);
            case 2:
                return AbstractC37800b.m121300f((Function1) this.f160563x, (C37801c) this.f160564y);
            case 3:
                return C37827a.m121360d((Function1) this.f160563x, (C37829c) this.f160564y);
            case 4:
                PollingActivity pollingActivity = (PollingActivity) this.f160564y;
                if (((C37848p) ((InterfaceC28670t2) this.f160563x).getValue()).f162025c == EnumC37847o.f162021y) {
                    ((C37855w) pollingActivity.f22396y.getValue()).m121379j();
                }
                return C23454a0.f92919a;
            case 5:
                C37877c c37877c = (C37877c) this.f160564y;
                Context context = (Context) this.f160563x;
                c37877c.getClass();
                C32095a c32095aM99834a = AbstractC32097c.f133101a.m99485i().m99834a();
                String language = c32095aM99834a.f133097a.getLanguage();
                Locale locale = Locale.ROOT;
                String lowerCase = language.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                String upperCase = c32095aM99834a.f133097a.getCountry().toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://static.afterpay.com/modal/%s.html", Arrays.copyOf(new Object[]{AbstractC18489d0.m53370k(lowerCase, "_", upperCase)}, 1)))));
                return C23454a0.f92919a;
            case 6:
                ((C35596e) this.f160564y).m112795a((Context) this.f160563x);
                return C23454a0.f92919a;
            case 7:
                return AbstractC37991c.m121707v((Function1) this.f160563x, (AbstractC37989a) this.f160564y);
            case 8:
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f160564y, null, null, new C33151q((C38011p) this.f160563x, null, 17), 3);
                return C23454a0.f92919a;
            case 9:
                return AbstractC38040b.m121794h((C38042d) this.f160564y, (Function1) this.f160563x);
            case 10:
                return AbstractC38307c.m122731x((C30365b) this.f160564y, (Function1) this.f160563x);
            case 11:
                return AbstractC38449c.m123202h((Function1) this.f160563x, (C38450d) this.f160564y);
            case 12:
                return AbstractC38537f.m123471o((C36276c.c) this.f160564y, (Function1) this.f160563x);
            case 13:
                return AbstractC38682f.m124083h((C35315h) this.f160564y, (Function1) this.f160563x);
            case 14:
                return AbstractC38754e.m124206u((Function1) this.f160563x, (C38755f) this.f160564y);
            case 15:
                return C39055h.m124505e((Function1) this.f160563x, (C39059l) this.f160564y);
            case 16:
                return C39193b.m124837f((C39196e) this.f160564y, (Function1) this.f160563x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC39326c.m125306g((C39327d) this.f160564y, (Function1) this.f160563x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC39384g.m125608L((Function1) this.f160563x, (C37032c) this.f160564y);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C39412p) this.f160564y).m125848a((CharSequence) this.f160563x);
            case 20:
                return AbstractC39436c.m125954D((Function1) this.f160563x, (InterfaceC38193d.b) this.f160564y);
            case 21:
                return AbstractC39462d.m126034v((C38217m) this.f160564y, (Function1) this.f160563x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC39469k.m126063A((Function1) this.f160563x, (InterfaceC38212h.p) this.f160564y);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC39612l.m126531b0((C33895m.b) this.f160564y, (Function1) this.f160563x);
            case 24:
                return AbstractC39631n.m126674g((String) this.f160564y, (C23239c) this.f160563x);
            case 25:
                return C39644k.m126753v((C39644k) this.f160564y, (C39635b) this.f160563x);
            case 26:
                return C39644k.m126755x((C39644k) this.f160564y, (C9598e) this.f160563x);
            case 27:
                return C39644k.m126729B((C39644k) this.f160564y, (C27256h) this.f160563x);
            case 28:
                return AbstractC39675b.m126898v((Function1) this.f160563x, (InterfaceC37431i) this.f160564y);
            default:
                return UniversalBuyNowDialogFragment.m27595W((UniversalBuyNowDialogFragment) this.f160564y, (InterfaceC37431i) this.f160563x);
        }
    }

    public /* synthetic */ C37550r(Function1 function1, Object obj, int i13) {
        this.f160562w = i13;
        this.f160563x = function1;
        this.f160564y = obj;
    }
}
