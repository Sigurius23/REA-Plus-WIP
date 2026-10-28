package rq0;

import a63.C0486f0;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.stripe.hcaptcha.HCaptchaException;
import com.whoop.advancedlabs.actionplan.view.ActionPlanFragment;
import com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment;
import com.whoop.community.presentation.teams.calendar.TeamCalendarView;
import com.whoop.contentsearch.view.ContentSearchFragment;
import com.whoop.data.remote.commons.Resource;
import com.whoop.debug.jsonplayground.JsonPlaygroundFragment;
import com.whoop.design.models.items.datepicker.DatePickerModel;
import com.whoop.healthconnect.view.HealthConnectFragment;
import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.settings.switchPlan.SwitchPlanDialogFragment;
import com.whoop.whooplive.live.views.WhoopGraphView;
import d30.C11570x;
import eq0.AbstractC13552x1;
import io.sentry.android.replay.video.C20245d;
import java.time.LocalDate;
import java.util.List;
import jb1.C21536b;
import kd0.InterfaceC22381a;
import l83.C23454a0;
import m83.AbstractC25265s;
import mc1.EnumC25417b;
import mj1.AbstractC25618a;
import mj1.C25619b;
import nj1.AbstractC26751a;
import p040c0.InterfaceC3770q;
import p133f1.AbstractC13967p0;
import p133f1.C13964o0;
import p133f1.EnumC13961n0;
import p133f1.InterfaceC13957m;
import p161g.AbstractC14917t;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p329n0.InterfaceC26064q;
import p390p1.C28617g1;
import p510u0.C34340n1;
import p510u0.EnumC34315f0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qd0.C30293b;
import qd0.InterfaceC30292a;
import ru1.C31818a;
import rv2.InterfaceC31850h;
import sc3.C32401o;
import sc3.C32402p;
import sj0.C32562a;
import sv0.C33032a;
import sv2.AbstractC33042e;
import t10.C33286f;
import t20.C33342w;
import t21.AbstractC33349g;
import t21.C33346d;
import tb1.AbstractC33692a;
import td2.C33712c;
import th.C33807e;
import u02.C34387c;
import u10.AbstractC34428p;
import u10.C34423k;
import u10.C34426n;
import ud2.AbstractC34794c;
import xc2.InterfaceC38191b;

/* JADX INFO: renamed from: rq0.x */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31703x implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131269w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f131270x;

    public /* synthetic */ C31703x(Object obj, int i13) {
        this.f131269w = i13;
        this.f131270x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f131269w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f131270x;
        switch (i13) {
            case 0:
                return C31705y.m98293P((C31705y) obj2, (Resource) obj);
            case 1:
                return C31652b0.m97842F((C31652b0) obj2, (Resource) obj);
            case 2:
                return C31696t0.m98259u0((AbstractC13552x1) obj2, ((Float) obj).floatValue());
            case 3:
                return C31696t0.m98216O0((TeamCalendarView) obj2, ((Integer) obj).intValue());
            case 4:
                return C31818a.m98875f((EnumC25417b) obj2, (C21536b) obj);
            case 5:
                return ContentSearchFragment.m19657G((C33032a) obj2, obj);
            case 6:
                return JsonPlaygroundFragment.m20061F((JsonPlaygroundFragment) obj2, (String) obj);
            case 7:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((C33286f) obj2).invoke(bool);
                return c23454a0;
            case 8:
                InterfaceC41211c error = (InterfaceC41211c) obj;
                AbstractC22676k.m65750j(error, "error");
                ((C33286f) obj2).invoke(error);
                return c23454a0;
            case 9:
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = (PaymentAuthWebViewActivity) obj2;
                AbstractC14917t addCallback = (AbstractC14917t) obj;
                int i14 = PaymentAuthWebViewActivity.f22551E;
                AbstractC22676k.m65750j(addCallback, "$this$addCallback");
                if (paymentAuthWebViewActivity.m16920r().f79776d.canGoBack()) {
                    paymentAuthWebViewActivity.m16920r().f79776d.goBack();
                } else {
                    paymentAuthWebViewActivity.m16918o();
                }
                return c23454a0;
            case 10:
                return ActionPlanFragment.m17262J((ActionPlanFragment) obj2, (InterfaceC22381a.c) obj);
            case 11:
                for (C32401o c32401o : ((C32402p) obj2).f134147c) {
                    c32401o.f134143a.m100983b(obj, c32401o.f134144b);
                }
                return c23454a0;
            case 12:
                return HealthConnectFragment.m21558L((HealthConnectFragment) obj2, (AbstractC26751a) obj);
            case 13:
                return HealthConnectFragment.m21559M((C25619b) obj2, (AbstractC25618a) obj);
            case 14:
                return AbstractC33042e.m104546t0((InterfaceC31850h.b) obj2, (InterfaceC26064q) obj);
            case 15:
                C33342w c33342w = (C33342w) obj2;
                List it = (List) obj;
                AbstractC22676k.m65750j(it, "it");
                IdentifierSpec identifierSpec = (IdentifierSpec) AbstractC25265s.m74114R0(it);
                return identifierSpec == null ? c33342w.f139114O : identifierSpec;
            case 16:
                return AbstractC33349g.m105763t((C33346d) obj2, (InterfaceC3770q) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ImageView imageView = (ImageView) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setVisibility(8);
                }
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC33692a.m106443j((DatePickerModel) obj2, (LocalDate) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SwitchPlanDialogFragment.m25803I((SwitchPlanDialogFragment) obj2, (InterfaceC38191b) obj);
            case 20:
                ((C33807e) obj2).f141599L = true;
                return c23454a0;
            case 21:
                return WhoopGraphView.m28646g((WhoopGraphView) obj2, (C32562a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((C18030l) ((InterfaceC18044z) obj)).m51772e(AbstractC13967p0.f49805c, new C13964o0(EnumC34315f0.f144080w, ((InterfaceC13957m) obj2).mo39711a(), EnumC13961n0.f49768x, true));
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C34340n1 c34340n1 = (C34340n1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                C28617g1 c28617g1 = c34340n1.f144248a;
                float fM87022x = c28617g1.m87022x() + fFloatValue;
                C28617g1 c28617g2 = c34340n1.f144249b;
                if (fM87022x > c28617g2.m87022x()) {
                    fFloatValue = c28617g2.m87022x() - c28617g1.m87022x();
                } else if (fM87022x < 0.0f) {
                    fFloatValue = -c28617g1.m87022x();
                }
                c28617g1.m87023y(c28617g1.m87022x() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 24:
                return C34387c.m108747c((HttpTimeoutConfig) obj2, (C0486f0) obj);
            case 25:
                ManageActivity manageActivity = (ManageActivity) obj2;
                AbstractC14917t addCallback2 = (AbstractC14917t) obj;
                int i15 = ManageActivity.f22343G;
                AbstractC22676k.m65750j(addCallback2, "$this$addCallback");
                if (!((AbstractC34428p) ((InterfaceC4339a) manageActivity.m16854r().f144668c.f104635y).invoke()).mo108793h()) {
                    manageActivity.m16854r().m108796a(C34423k.f144661b);
                }
                return c23454a0;
            case 26:
                C11570x state = (C11570x) obj;
                AbstractC22676k.m65750j(state, "state");
                return state.m31000b(((C34426n) obj2).f144664w);
            case 27:
                C20245d c20245d = (C20245d) obj2;
                HCaptchaException exception = (HCaptchaException) obj;
                AbstractC22676k.m65750j(exception, "exception");
                c20245d.getClass();
                c20245d.f76046b = exception;
                c20245d.m56172o();
                return c23454a0;
            case 28:
                return RafReceiverFragment.m17512J((C30293b) obj2, (InterfaceC30292a) obj);
            default:
                return AbstractC34794c.m109813g((C33712c) obj2, (InterfaceC26064q) obj);
        }
    }
}
