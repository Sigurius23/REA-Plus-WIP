package p699b70;

import androidx.health.platform.client.proto.C1533u;
import bf0.AbstractC3199k;
import com.whoop.core.details.view.AbstractC6470a;
import com.whoop.membership.extensions.domain.models.CtaAction;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.view.edit.EditProfileContentKt;
import db0.AbstractC11887c;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageComposerViewModelBinding;
import it1.InterfaceC20927a;
import je2.InterfaceC21622a;
import jr1.AbstractC21896d;
import jt1.AbstractC21938c;
import kd0.InterfaceC22381a;
import ke2.AbstractC22423c;
import kw1.AbstractC22869t;
import l83.C23454a0;
import lf0.AbstractC23970t;
import mf0.AbstractC25502a;
import nw0.AbstractC27200g;
import o72.AbstractC27647h;
import p715kotlin.jvm.functions.Function1;
import pt2.AbstractC29543y;
import sa0.AbstractC32325b;
import so1.C32808d;
import vo1.AbstractC36232g;
import vo1.AbstractC36243r;
import wo1.AbstractC37456k;
import xc0.AbstractC38186a;
import xd2.InterfaceC38212h;
import yd2.AbstractC39469k;

/* JADX INFO: renamed from: b70.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2777c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10918w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f10919x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f10920y;

    public /* synthetic */ C2777c(Function1 function1, int i13, Function1 function2) {
        this.f10918w = i13;
        this.f10919x = function1;
        this.f10920y = function2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10918w) {
            case 0:
                return Function1.m7864u(this.f10919x, this.f10920y, obj);
            case 1:
                return AbstractC3199k.m9205H(this.f10919x, this.f10920y, (AbstractC25502a) obj);
            case 2:
                return EditProfileContentKt.EditProfileContent$lambda$4$1$0$0(this.f10919x, this.f10920y, (EditProfileEvent) obj);
            case 3:
                return AbstractC11887c.m31870E(this.f10919x, this.f10920y, (InterfaceC22381a) obj);
            case 4:
                MessageComposerViewModelBinding.and$lambda$3(this.f10919x, this.f10920y, obj);
                return C23454a0.f92919a;
            case 5:
                return AbstractC21896d.m62188P(this.f10919x, this.f10920y, obj);
            case 6:
                return AbstractC21938c.m62494F(this.f10919x, this.f10920y, (InterfaceC20927a) obj);
            case 7:
                return AbstractC22423c.m64568E(this.f10919x, this.f10920y, (InterfaceC21622a) obj);
            case 8:
                return AbstractC22869t.m66439t(this.f10919x, this.f10920y, (CtaAction) obj);
            case 9:
                return AbstractC22869t.m66440u(this.f10919x, this.f10920y, (CtaAction) obj);
            case 10:
                return AbstractC23970t.m70653I(this.f10919x, this.f10920y, obj);
            case 11:
                return AbstractC27200g.m81800Y(this.f10919x, this.f10920y, obj);
            case 12:
                return AbstractC27647h.m83503N(this.f10919x, this.f10920y, obj);
            case 13:
                return AbstractC6470a.m19778L(this.f10919x, this.f10920y, obj);
            case 14:
                return AbstractC6470a.m19779M(this.f10919x, this.f10920y, obj);
            case 15:
                return AbstractC29543y.m90460B(this.f10919x, this.f10920y, obj);
            case 16:
                return AbstractC32325b.m100610w(this.f10919x, this.f10920y, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC36232g.m115434H(this.f10919x, this.f10920y, (String) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36243r.m115514X(this.f10919x, this.f10920y, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC37456k.m119981r(this.f10919x, this.f10920y, (C32808d) obj);
            case 20:
                return AbstractC38186a.m122306o(this.f10919x, this.f10920y, obj);
            default:
                return AbstractC39469k.m126078P(this.f10919x, this.f10920y, (InterfaceC38212h) obj);
        }
    }
}
