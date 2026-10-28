package p702ch0;

import android.icu.text.NumberFormat;
import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4339a;
import cm2.C4834v;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.edit.EditProfileFieldsContentKt;
import com.whoop.profile.view.edit.form.TextFieldConfig;
import com.whoop.settings.AbstractC10104h;
import com.whoop.weightlifting.StrengthTrainerDestination;
import dp0.AbstractC12250f;
import dp0.InterfaceC12251g;
import dv2.InterfaceC12391b;
import ep0.C13404j;
import ev2.AbstractC13712u;
import hu2.InterfaceC17654a;
import hu2.InterfaceC17655b;
import id2.AbstractC18429n;
import id2.C18425j;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao_Impl;
import java.util.Date;
import java.util.List;
import jb1.C21536b;
import l83.C23454a0;
import l83.InterfaceC23462h;
import mt2.AbstractC25944e;
import mt2.AbstractC25946g;
import mt2.C25945f;
import or2.EnumC28166h0;
import ot2.AbstractC28344m;
import ou2.C28378b;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p077d0.InterfaceC11372l;
import p114eb.C12991u0;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.C17885g;
import p208i2.C17903p;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p291l0.C23016z;
import p329n0.InterfaceC26064q;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p500tb.InterfaceC33687a;
import p635y2.C39141w;
import p636y3.InterfaceC39171c;
import p668z1.C39970s;
import p71.AbstractC28956b;
import p715kotlin.jvm.functions.Function1;
import qu2.AbstractC30640h;
import qz0.AbstractC30787f;
import tr2.InterfaceC34116n;
import vl2.AbstractC36130w;
import y21.AbstractC39162i;
import yu2.AbstractC39795e;
import yu2.C39791a;

/* JADX INFO: renamed from: ch0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4614e implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f18600E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18601w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f18602x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18603y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18604z;

    public /* synthetic */ C4614e(Object obj, Object obj2, boolean z4, Object obj3, int i13) {
        this.f18601w = i13;
        this.f18603y = obj;
        this.f18604z = obj2;
        this.f18602x = z4;
        this.f18600E = obj3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f18601w) {
            case 0:
                return AbstractC4639n.m14473L(this.f18602x, (C39141w) this.f18603y, (InterfaceC28601c1) this.f18604z, (C4656v0) this.f18600E, (String) obj);
            case 1:
                return C4834v.m15291y(this.f18602x, (EnumC28166h0) this.f18603y, (AbstractC36130w.c) this.f18604z, (C4834v) this.f18600E, (C21536b) obj);
            case 2:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$6$0$1$5$0(this.f18602x, (InterfaceC4339a) this.f18603y, (Function1) this.f18604z, (TextFieldConfig) this.f18600E, ((Boolean) obj).booleanValue());
            case 3:
                return AbstractC12250f.m34130c((C13404j) this.f18603y, (InterfaceC34116n) this.f18604z, this.f18602x, (InterfaceC12251g) this.f18600E, (C28624i0) obj);
            case 4:
                return AbstractC10104h.m25409p((List) this.f18603y, this.f18602x, (C39970s) this.f18600E, C23016z.f90757a, (InterfaceC28601c1) this.f18604z, (InterfaceC26064q) obj);
            case 5:
                return AbstractC13712u.m38764W0((C12991u0) this.f18603y, (StrengthTrainerDestination.C10745h.a) this.f18604z, this.f18602x, (InterfaceC23462h) this.f18600E, (InterfaceC12391b) obj);
            case 6:
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f18603y;
                C17885g c17885g = (C17885g) this.f18604z;
                C17903p c17903p = (C17903p) this.f18600E;
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                c0238p0.m728a();
                C22128b c22128b = c0238p0.f815w;
                if (((Boolean) interfaceC4339a.invoke()).booleanValue()) {
                    if (this.f18602x) {
                        long jMo721B0 = c22128b.mo721B0();
                        C0237p c0237p = c22128b.f85852x;
                        long jM670A = c0237p.m670A();
                        c0237p.m716w().mo51426q();
                        try {
                            ((C0929d) c0237p.f812x).m2359w(-1.0f, jMo721B0, 1.0f);
                            c22128b.m63371e(c17885g, c17903p);
                        } finally {
                            AbstractC11266d.m30472z(c0237p, jM670A);
                        }
                    } else {
                        c22128b.m63371e(c17885g, c17903p);
                    }
                }
                return C23454a0.f92919a;
            case 7:
                return new C15199y3((EnumC15209z3) obj, (InterfaceC39171c) this.f18603y, (Function1) this.f18604z, (InterfaceC11372l) this.f18600E, this.f18602x);
            case 8:
                return AbstractC18429n.m53063p((C18425j) this.f18603y, this.f18602x, (C18425j) this.f18604z, (C18425j) this.f18600E, (C28624i0) obj);
            case 9:
                ChannelDao_Impl.setHidden$lambda$12("UPDATE stream_chat_channel_state SET hidden = ?, hideMessagesBefore = ? WHERE cid = ?", this.f18602x, (ChannelDao_Impl) this.f18603y, (Date) this.f18604z, (String) this.f18600E, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 10:
                return AbstractC25944e.m76745C((AbstractC28344m) this.f18603y, this.f18602x, (InterfaceC4339a) this.f18604z, (C25945f) this.f18600E, (AbstractC25946g) obj);
            case 11:
                return AbstractC28956b.m87931p(this.f18602x, (C9598e) this.f18603y, (Function1) this.f18600E, (InterfaceC28601c1) this.f18604z, (Modifier) obj);
            case 12:
                return AbstractC30640h.m94153r0((StrengthTrainerDestination.C10738a.a) this.f18603y, (C28378b) this.f18604z, this.f18602x, (InterfaceC23462h) this.f18600E, (InterfaceC17654a) obj);
            case 13:
                return AbstractC30787f.m94665d(this.f18602x, (Function1) this.f18603y, (NumberFormat) this.f18604z, (Function1) this.f18600E, (String) obj);
            case 14:
                return AbstractC39162i.m124734y((String) this.f18603y, this.f18602x, (Function1) this.f18600E, (InterfaceC28601c1) this.f18604z, obj);
            default:
                return AbstractC39795e.m127533B((StrengthTrainerDestination.C10741d.a) this.f18603y, (C39791a) this.f18604z, this.f18602x, (InterfaceC23462h) this.f18600E, (InterfaceC17655b) obj);
        }
    }

    public /* synthetic */ C4614e(Object obj, boolean z4, Object obj2, Object obj3, int i13) {
        this.f18601w = i13;
        this.f18603y = obj;
        this.f18602x = z4;
        this.f18604z = obj2;
        this.f18600E = obj3;
    }

    public /* synthetic */ C4614e(Object obj, boolean z4, Object obj2, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f18601w = i13;
        this.f18603y = obj;
        this.f18602x = z4;
        this.f18600E = obj2;
        this.f18604z = interfaceC28601c1;
    }

    public /* synthetic */ C4614e(InterfaceC39171c interfaceC39171c, Function1 function1, InterfaceC11372l interfaceC11372l, boolean z4) {
        this.f18601w = 7;
        this.f18603y = interfaceC39171c;
        this.f18604z = function1;
        this.f18600E = interfaceC11372l;
        this.f18602x = z4;
    }

    public /* synthetic */ C4614e(boolean z4, C9598e c9598e, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f18601w = 11;
        this.f18602x = z4;
        this.f18603y = c9598e;
        this.f18600E = function1;
        this.f18604z = interfaceC28601c1;
    }

    public /* synthetic */ C4614e(boolean z4, Object obj, Object obj2, Object obj3, int i13) {
        this.f18601w = i13;
        this.f18602x = z4;
        this.f18603y = obj;
        this.f18604z = obj2;
        this.f18600E = obj3;
    }
}
