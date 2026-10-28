package am2;

import ak1.C0948a;
import androidx.health.platform.client.proto.C1533u;
import az1.AbstractC2173n;
import b90.AbstractC2884f;
import b90.C2885g;
import bb2.AbstractC2933i;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm2.AbstractC3468q;
import bm2.C3439f0;
import bm2.C3470r;
import bs1.AbstractC3583c0;
import c41.C4141w2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cj1.C4753i;
import ck1.AbstractC4786i;
import com.whoop.profile.presentation.ProfileViewState;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.view.ProfileScreenContentKt;
import com.whoop.profile.view.edit.EditProfileScreenKt;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import cv2.EnumC11148a;
import d30.C11514a;
import d30.C11530f0;
import d80.AbstractC11769e;
import d80.C11770f;
import dp2.C12256b;
import ds1.C12341k;
import e30.AbstractC12605c;
import eb2.C13006a;
import ej1.AbstractC13252o;
import ep2.InterfaceC13429a;
import ev2.AbstractC13712u;
import f41.AbstractC14078p;
import g11.AbstractC15219c;
import g11.C15220d;
import gf1.AbstractC15788g;
import gf1.C15782a;
import gp2.AbstractC16071f;
import h20.C16651f;
import hd2.C17202d;
import id2.AbstractC18435t;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao_Impl;
import iz0.AbstractC21048g;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp2.AbstractC21883n;
import jp2.C21884o;
import kotlin.AbstractC2036w;
import l01.C23042n;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n71.EnumC26437r;
import o51.C27540f;
import p027b3.InterfaceC2355b3;
import p077d0.C11368k;
import p088dc.AbstractC11894a;
import p114eb.AbstractC12939a0;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p132f0.C13821r1;
import p163g1.C15199y3;
import p164g2.InterfaceC15250v;
import p180h0.AbstractC16472w1;
import p180h0.C16360a3;
import p181h2.C16617b;
import p294l3.C23254g;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p409q0.AbstractC29701y;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import p720m91.InterfaceC25312u;
import p730qt2.C30599e;
import r20.C30865c;
import r20.C30866d;
import r20.C30880r;
import v00.C35459c0;
import v41.AbstractC35664f;
import y71.C39282o;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: am2.s */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1042s implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f4013E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4014w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f4015x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f4016y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f4017z;

    public /* synthetic */ C1042s(C15220d c15220d, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f4014w = 20;
        this.f4016y = c15220d;
        this.f4015x = function1;
        this.f4013E = interfaceC28601c1;
        this.f4017z = interfaceC28601c2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e2  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f4014w) {
            case 0:
                return AbstractC1046w.m3010V((InterfaceC2994c0) this.f4016y, (Function1) this.f4015x, (C15199y3) this.f4017z, (InterfaceC28601c1) this.f4013E, (C3439f0) obj);
            case 1:
                return AbstractC2036w.m6372L((AbstractC39758e.i) this.f4017z, (Function1) this.f4015x, (InterfaceC2994c0) this.f4016y, (AbstractC35664f.a) this.f4013E, (InterfaceC26064q) obj);
            case 2:
                return AbstractC2173n.m6803I((C12991u0) this.f4016y, (InterfaceC4339a) this.f4017z, (Function1) this.f4015x, (String) this.f4013E, (C12987s0) obj);
            case 3:
                return AbstractC2884f.m8372t((Function1) this.f4015x, (C2885g) this.f4016y, (InterfaceC28601c1) this.f4013E, (InterfaceC28601c1) this.f4017z, (InterfaceC15250v) obj);
            case 4:
                return AbstractC2933i.m8559m((C23042n) this.f4016y, (Function1) this.f4015x, (C13006a) this.f4017z, (Function1) this.f4013E, obj);
            case 5:
                return AbstractC3468q.m10183r((C3470r) this.f4016y, (InterfaceC28601c1) this.f4013E, (Function1) this.f4015x, (Function1) this.f4017z, (InterfaceC26064q) obj);
            case 6:
                return AbstractC3583c0.m10758H1((Function1) this.f4015x, (C12341k) this.f4013E, (InterfaceC2994c0) this.f4016y, (C15199y3) this.f4017z, (Double) obj);
            case 7:
                return AbstractC3583c0.m10797U1((Function1) this.f4015x, (Function1) this.f4016y, (C13821r1) this.f4017z, (InterfaceC4351m) this.f4013E, ((Boolean) obj).booleanValue());
            case 8:
                return AbstractC3583c0.m10767K1((Function1) this.f4015x, (InterfaceC28601c1) this.f4013E, (InterfaceC2994c0) this.f4016y, (AbstractC35664f.a) this.f4017z, obj);
            case 9:
                return AbstractC4786i.m15102v((Function1) this.f4015x, (C4141w2) this.f4016y, (C0948a) this.f4017z, (Function1) this.f4013E, obj);
            case 10:
                return AbstractC4786i.m15104x((C39282o) this.f4016y, (Function1) this.f4015x, (C0948a) this.f4017z, (Function1) this.f4013E, obj);
            case 11:
                return ProfileScreenContentKt.ProfileContentArea$lambda$4$0((ProfileViewState.Metadata) this.f4016y, (Function1) this.f4015x, (InterfaceC4339a) this.f4017z, (ProfileViewState.ScreenContent) this.f4013E, (InterfaceC26064q) obj);
            case 12:
                return EditProfileScreenKt.EditProfileScreen$lambda$18$0((InterfaceC28601c1) this.f4013E, (Map) this.f4016y, (InterfaceC28670t2) this.f4015x, (InterfaceC23462h) this.f4017z, (EditProfileEvent.FieldType) obj);
            case 13:
                return EditProfileScreenKt.EditProfileScreen$lambda$21$1$0((EditProfileFormState) this.f4016y, (AbstractC12939a0) this.f4015x, (InterfaceC28670t2) this.f4017z, (InterfaceC28601c1) this.f4013E, (EditProfileEvent.NavigationEvent) obj);
            case 14:
                AbstractC12605c abstractC12605c = (AbstractC12605c) this.f4016y;
                C35459c0 c35459c0 = (C35459c0) this.f4015x;
                C16651f c16651f = (C16651f) this.f4017z;
                C11514a c11514a = (C11514a) this.f4013E;
                String selectedPaymentMethodCode = (String) obj;
                AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                C30880r c30880r = new C30880r(AbstractC11894a.m31965n(selectedPaymentMethodCode, abstractC12605c, c35459c0, c16651f, c11514a), false);
                C30866d c30866d = abstractC12605c.f43009M;
                c30866d.getClass();
                C30599e c30599e = new C30599e(7, c30866d, c30880r);
                if (!c30866d.f127268e.getAndSet(true)) {
                    AbstractC3006f0.m8732z(c30866d.f127264a, null, null, new C30865c(c30599e, c30866d, null), 3);
                }
                return C23454a0.f92919a;
            case 15:
                return AbstractC11769e.m31525q((Function1) this.f4015x, (Function1) this.f4016y, (Function1) this.f4017z, (C11770f) this.f4013E, obj);
            case 16:
                return AbstractC13252o.m37249l((C4753i.d) this.f4016y, (Integer) this.f4017z, (EnumC26437r) this.f4013E, (Function1) this.f4015x, (InterfaceC26064q) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13252o.m37252o((Integer) this.f4016y, (EnumC26437r) this.f4017z, (Function1) this.f4015x, (InterfaceC25312u) this.f4013E, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13712u.m38785e1((List) this.f4016y, (Set) this.f4017z, (EnumC11148a) this.f4013E, (Function1) this.f4015x, (InterfaceC26064q) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC14078p.m40066Q((Function3) this.f4016y, (InterfaceC28601c1) this.f4013E, (InterfaceC28601c1) this.f4015x, (InterfaceC28601c1) this.f4017z, ((Boolean) obj).booleanValue());
            case 20:
                return AbstractC15219c.m43234A((C15220d) this.f4016y, (Function1) this.f4015x, (InterfaceC28601c1) this.f4013E, (InterfaceC28601c1) this.f4017z, (LocalDate) obj);
            case 21:
                return AbstractC15788g.m44500F((C27540f) this.f4016y, (Integer) this.f4017z, (C15782a) this.f4013E, (Function1) this.f4015x, ((Integer) obj).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC16071f.m45413m((String) this.f4016y, (C12256b) this.f4015x, (InterfaceC23462h) this.f4017z, (InterfaceC23462h) this.f4013E, (InterfaceC13429a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C22663d0 c22663d0 = (C22663d0) this.f4016y;
                C11530f0 c11530f0 = (C11530f0) this.f4015x;
                C16360a3 c16360a3 = (C16360a3) this.f4017z;
                C1040r c1040r = (C1040r) this.f4013E;
                C11368k c11368k = (C11368k) obj;
                float fFloatValue = ((Number) c11368k.f36440e.getValue()).floatValue() - c22663d0.f89331w;
                if (AbstractC16472w1.m46644a(fFloatValue)) {
                    if (((Boolean) c1040r.invoke(Float.valueOf(c22663d0.f89331w))).booleanValue()) {
                        c11368k.m30599a();
                    }
                } else if (AbstractC16472w1.m46644a(fFloatValue - c11530f0.m30980c(c16360a3, fFloatValue))) {
                    c22663d0.f89331w += fFloatValue;
                    if (((Boolean) c1040r.invoke(Float.valueOf(c22663d0.f89331w))).booleanValue()) {
                        c11368k.m30599a();
                    }
                } else {
                    c11368k.m30599a();
                }
                return C23454a0.f92919a;
            case 24:
                return AbstractC18435t.m53085J((C17202d.a) this.f4016y, (AbstractC29701y) this.f4017z, (Function1) this.f4015x, (InterfaceC28601c1) this.f4013E, ((Boolean) obj).booleanValue());
            case 25:
                return ReactionDao_Impl.selectUserReactionToMessage$lambda$6("SELECT * FROM stream_chat_reaction WHERE stream_chat_reaction.type = ? AND stream_chat_reaction.messageid = ? AND userId = ?", (String) this.f4016y, (String) this.f4015x, (String) this.f4017z, (ReactionDao_Impl) this.f4013E, (InterfaceC33687a) obj);
            case 26:
                ReactionDao_Impl.setDeleteAt$lambda$8("UPDATE stream_chat_reaction SET deletedAt = ? WHERE userId = ? AND messageId = ?", (ReactionDao_Impl) this.f4016y, (Date) this.f4015x, (String) this.f4017z, (String) this.f4013E, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 27:
                return AbstractC21048g.m58870y0((InterfaceC28601c1) this.f4013E, (C23254g) this.f4016y, (Function1) this.f4015x, (InterfaceC2355b3) this.f4017z, (C16617b) obj);
            case 28:
                return AbstractC21883n.m62082t((C21884o) this.f4016y, (Function1) this.f4015x, (String) this.f4017z, (Function1) this.f4013E, (String) obj);
            default:
                return AbstractC21883n.m62087y((C21884o) this.f4016y, (Function1) this.f4015x, (String) this.f4017z, (InterfaceC28601c1) this.f4013E, (String) obj);
        }
    }

    public /* synthetic */ C1042s(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f4014w = i13;
        this.f4016y = obj;
        this.f4015x = obj2;
        this.f4017z = obj3;
        this.f4013E = obj4;
    }

    public /* synthetic */ C1042s(Object obj, Object obj2, Object obj3, Function1 function1, int i13) {
        this.f4014w = i13;
        this.f4016y = obj;
        this.f4017z = obj2;
        this.f4013E = obj3;
        this.f4015x = function1;
    }

    public /* synthetic */ C1042s(Object obj, Object obj2, Function1 function1, Object obj3, int i13) {
        this.f4014w = i13;
        this.f4016y = obj;
        this.f4017z = obj2;
        this.f4015x = function1;
        this.f4013E = obj3;
    }

    public /* synthetic */ C1042s(Object obj, InterfaceC28601c1 interfaceC28601c1, Object obj2, Object obj3, int i13) {
        this.f4014w = i13;
        this.f4016y = obj;
        this.f4013E = interfaceC28601c1;
        this.f4015x = obj2;
        this.f4017z = obj3;
    }

    public /* synthetic */ C1042s(Function1 function1, C2885g c2885g, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f4014w = 3;
        this.f4015x = function1;
        this.f4016y = c2885g;
        this.f4013E = interfaceC28601c1;
        this.f4017z = interfaceC28601c2;
    }

    public /* synthetic */ C1042s(Function1 function1, Object obj, InterfaceC2994c0 interfaceC2994c0, Object obj2, int i13) {
        this.f4014w = i13;
        this.f4015x = function1;
        this.f4013E = obj;
        this.f4016y = interfaceC2994c0;
        this.f4017z = obj2;
    }

    public /* synthetic */ C1042s(Function1 function1, Object obj, Object obj2, Object obj3, int i13) {
        this.f4014w = i13;
        this.f4015x = function1;
        this.f4016y = obj;
        this.f4017z = obj2;
        this.f4013E = obj3;
    }

    public /* synthetic */ C1042s(InterfaceC28601c1 interfaceC28601c1, Object obj, Object obj2, Object obj3, int i13) {
        this.f4014w = i13;
        this.f4013E = interfaceC28601c1;
        this.f4016y = obj;
        this.f4015x = obj2;
        this.f4017z = obj3;
    }

    public /* synthetic */ C1042s(AbstractC39758e.i iVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        this.f4014w = 1;
        this.f4017z = iVar;
        this.f4015x = function1;
        this.f4016y = interfaceC2994c0;
        this.f4013E = aVar;
    }
}
