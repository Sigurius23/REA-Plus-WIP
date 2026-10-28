package a81;

import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import bs1.AbstractC3583c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.design.models.modal.FullScreenContentModal;
import com.whoop.design.models.modal.ModalAnalyticEventModel;
import com.whoop.home.domain.models.DayZeroCardsViewState;
import com.whoop.navigation.models.ChatHeaderMetadata;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.view.edit.EditProfileScreenKt;
import de0.C11980a;
import ds1.C12341k;
import ec3.InterfaceC13037f2;
import fi0.InterfaceC14515a;
import ge2.InterfaceC15741f;
import id2.AbstractC18429n;
import id2.C18425j;
import in2.C18733e;
import java.util.List;
import java.util.Map;
import kd1.C22401m;
import l83.C23454a0;
import l83.InterfaceC23462h;
import lf0.AbstractC23990z1;
import lf0.C23897a2;
import m62.AbstractC25118i;
import m72.AbstractC25208g;
import mw0.AbstractC25981i;
import mw0.C25975c;
import nk1.AbstractC26797c;
import nk1.C26798d;
import nt1.InterfaceC27125d;
import nw0.AbstractC27208o;
import o72.AbstractC27647h;
import ot2.C28332a;
import p077d0.C11393q0;
import p132f0.C13821r1;
import p163g1.AbstractC15099o3;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p479s4.AbstractC32131l;
import p636y3.InterfaceC39171c;
import p702ch0.C4656v0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p734sl0.AbstractC32679u0;
import p734sl0.C32645n0;
import p748zc1.AbstractC40313e4;
import p748zc1.C40324f4;
import pt2.AbstractC29527i;
import pu2.InterfaceC29560h;
import q00.C29720i0;
import q62.AbstractC30004d;
import qm1.AbstractC30483e;
import qu2.AbstractC30640h;
import qu2.EnumC30642j;
import r90.AbstractC31101h;
import r90.C31103j;
import se.AbstractC32416g;
import se.AbstractC32417h;
import te0.AbstractC33749h;
import uu2.AbstractC35261l;
import uu2.C35242b0;
import v41.AbstractC35664f;
import ve0.AbstractC35927e;
import y00.AbstractC38794c0;
import y12.AbstractC39070c;
import y12.C39068a;

/* JADX INFO: renamed from: a81.g */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0556g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f1922E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f1923F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1924w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1925x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f1926y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f1927z;

    public /* synthetic */ C0556g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f1924w = i13;
        this.f1926y = obj;
        this.f1927z = obj2;
        this.f1922E = obj3;
        this.f1923F = obj4;
        this.f1925x = obj5;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1924w) {
            case 0:
                return AbstractC0564o.m1383E((InterfaceC4354p) this.f1926y, (FullScreenContentModal) this.f1927z, (ModalAnalyticEventModel) this.f1922E, (InterfaceC14515a) this.f1923F, (Function1) this.f1925x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC3583c0.m10800V1((Function1) this.f1925x, (C13821r1) this.f1926y, (InterfaceC4351m) this.f1927z, (Function1) this.f1922E, (C12341k) this.f1923F, ((Long) obj).longValue(), (String) obj2);
            case 2:
                return p702ch0.Function1.m14403L((InterfaceC2994c0) this.f1926y, (InterfaceC28601c1) this.f1927z, (InterfaceC28601c1) this.f1922E, (C15199y3) this.f1923F, (C15199y3) this.f1925x, (String) obj, (AiFeedbackType) obj2);
            case 3:
                return EditProfileScreenKt.EditProfileScreen$lambda$19$0((InterfaceC28601c1) this.f1926y, (Map) this.f1927z, (Function1) this.f1925x, (InterfaceC28670t2) this.f1922E, (InterfaceC23462h) this.f1923F, (EditProfileEvent.FieldType) obj, (String) obj2);
            case 4:
                ((Integer) obj2).getClass();
                AbstractC15099o3.m43167a((C11393q0) this.f1926y, (InterfaceC28601c1) this.f1927z, (C13821r1) this.f1922E, (Modifier) this.f1923F, (Function3) this.f1925x, (Composer) obj, AbstractC28683x.m87244L(49));
                return C23454a0.f92919a;
            case 5:
                return p709he2.Function1.m48694H((InterfaceC15741f) this.f1926y, (Function1) this.f1925x, (InterfaceC2994c0) this.f1927z, (C15199y3) this.f1922E, (InterfaceC28601c1) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC18429n.m53068u((C22401m) this.f1926y, (C18425j) this.f1927z, (ComposeView) this.f1922E, (InterfaceC39171c) this.f1923F, (InterfaceC4351m) this.f1925x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC23990z1.m70802v((C23897a2) this.f1926y, (List) this.f1927z, (C11980a) this.f1922E, (Function1) this.f1925x, (InterfaceC28601c1) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC26797c.m79860q((InterfaceC28601c1) this.f1926y, (Function1) this.f1925x, (C26798d) this.f1927z, (String) this.f1922E, (InterfaceC28670t2) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AbstractC27208o.m81889A((AbstractC25981i.c) this.f1926y, (C25975c) this.f1927z, (Function1) this.f1925x, (Function1) this.f1922E, (Function1) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return AbstractC27647h.m83497H((AbstractC25208g.c) this.f1926y, (Function1) this.f1925x, (Function1) this.f1927z, (Function1) this.f1922E, (InterfaceC28601c1) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return p725ot1.Function1.m85802N((InterfaceC27125d) this.f1926y, (Function1) this.f1925x, (InterfaceC2994c0) this.f1927z, (C15199y3) this.f1922E, (InterfaceC28601c1) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return AbstractC29527i.m90246R((C28332a) this.f1926y, (Function1) this.f1925x, (Function1) this.f1927z, (InterfaceC2994c0) this.f1922E, (AbstractC35664f.a) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                ((Integer) obj2).getClass();
                AbstractC32416g.m101157n((Modifier) this.f1926y, (AbstractC38794c0) this.f1927z, (InterfaceC4339a) this.f1922E, (InterfaceC4339a) this.f1923F, (InterfaceC4339a) this.f1925x, (Composer) obj, AbstractC28683x.m87244L(7));
                return C23454a0.f92919a;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC32417h.m101200i((C29720i0) this.f1926y, (Function1) this.f1925x, (Function1) this.f1927z, (InterfaceC4339a) this.f1922E, (InterfaceC4339a) this.f1923F, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 15:
                return AbstractC30004d.m91818l((AbstractC25118i.a) this.f1926y, (Function1) this.f1925x, (Function1) this.f1927z, (Function1) this.f1922E, (InterfaceC28601c1) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return AbstractC30483e.m93312N((DayZeroCardsViewState) this.f1926y, (Context) this.f1927z, (Function1) this.f1925x, (InterfaceC23462h) this.f1922E, (InterfaceC23462h) this.f1923F, obj, obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC30640h.m94059B0((Function1) this.f1925x, (InterfaceC29560h) this.f1926y, (EnumC15209z3) this.f1927z, (EnumC30642j) this.f1922E, (C18733e) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC30640h.m94065E0((InterfaceC29560h.e) this.f1926y, (Function1) this.f1925x, (EnumC30642j) this.f1927z, (C15199y3) this.f1922E, (C18733e) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC31101h.m95834o((C31103j) this.f1926y, (String) this.f1927z, (String) this.f1922E, (InterfaceC4339a) this.f1923F, (Function1) this.f1925x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return AbstractC32679u0.m102379i0((InterfaceC2994c0) this.f1926y, (C15199y3) this.f1927z, (InterfaceC28601c1) this.f1922E, (InterfaceC28601c1) this.f1923F, (InterfaceC28601c1) this.f1925x, (String) obj, (AiMessageFeedback) obj2);
            case 21:
                ((Integer) obj2).getClass();
                AbstractC32131l.m100069a((InterfaceC13037f2) this.f1926y, (InterfaceC13037f2) this.f1927z, (InterfaceC13037f2) this.f1922E, (InterfaceC13037f2) this.f1923F, (Modifier) this.f1925x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC35261l.m111770O((C35242b0) this.f1926y, (Function1) this.f1925x, (InterfaceC2994c0) this.f1927z, (C15199y3) this.f1922E, (Function1) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC35927e.m114139f0((AbstractC33749h.e) this.f1926y, (Function1) this.f1925x, (Function1) this.f1927z, (InterfaceC2994c0) this.f1922E, (C15199y3) this.f1923F, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return AbstractC39070c.m124605n((C39068a) this.f1926y, (C32645n0) this.f1927z, (C4656v0) this.f1922E, (ChatHeaderMetadata) this.f1923F, (InterfaceC4339a) this.f1925x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC40313e4.m129647k((InterfaceC28601c1) this.f1926y, (InterfaceC28601c1) this.f1927z, (InterfaceC28601c1) this.f1922E, (C40324f4) this.f1923F, (InterfaceC28601c1) this.f1925x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C0556g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13, int i14) {
        this.f1924w = i14;
        this.f1926y = obj;
        this.f1927z = obj2;
        this.f1922E = obj3;
        this.f1923F = obj4;
        this.f1925x = obj5;
    }

    public /* synthetic */ C0556g(Object obj, Object obj2, Function1 function1, Object obj3, Object obj4, int i13) {
        this.f1924w = i13;
        this.f1926y = obj;
        this.f1927z = obj2;
        this.f1925x = function1;
        this.f1922E = obj3;
        this.f1923F = obj4;
    }

    public /* synthetic */ C0556g(Object obj, Function1 function1, Object obj2, Object obj3, Object obj4, int i13) {
        this.f1924w = i13;
        this.f1926y = obj;
        this.f1925x = function1;
        this.f1927z = obj2;
        this.f1922E = obj3;
        this.f1923F = obj4;
    }

    public /* synthetic */ C0556g(Function1 function1, Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f1924w = i13;
        this.f1925x = function1;
        this.f1926y = obj;
        this.f1927z = obj2;
        this.f1922E = obj3;
        this.f1923F = obj4;
    }

    public /* synthetic */ C0556g(C23897a2 c23897a2, List list, C11980a c11980a, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f1924w = 7;
        this.f1926y = c23897a2;
        this.f1927z = list;
        this.f1922E = c11980a;
        this.f1925x = function1;
        this.f1923F = interfaceC28601c1;
    }

    public /* synthetic */ C0556g(C29720i0 c29720i0, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13) {
        this.f1924w = 14;
        this.f1926y = c29720i0;
        this.f1925x = function1;
        this.f1927z = function2;
        this.f1922E = interfaceC4339a;
        this.f1923F = interfaceC4339a2;
    }
}
