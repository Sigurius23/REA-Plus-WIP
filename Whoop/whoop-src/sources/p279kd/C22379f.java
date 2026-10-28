package p279kd;

import a00.C0072g;
import a13.C0150h;
import ai.C0904j;
import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.C1106b;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.C1778e;
import androidx.room.C1841x;
import b30.C2570m;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c33.C3936c;
import c43.C4203s;
import c93.InterfaceC4351m;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.stripe.android.view.CardNumberEditText;
import ec3.AbstractC13091v;
import ec3.C13038g;
import ec3.C13045h2;
import ec3.C13078q1;
import ec3.C13081r1;
import ec3.C13096w1;
import g40.C15320a2;
import g40.C15366i0;
import g40.C15413r0;
import g40.C15440w2;
import g40.InterfaceC15359h;
import gm.C15990r;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.AudioRecordingController;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.C19544a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kz.C22908e;
import l30.C23292a;
import l83.C23454a0;
import m83.AbstractC25265s;
import n20.C26174i;
import n20.C26175j;
import n20.C26176k;
import n20.C26186u;
import n53.C26318e;
import ne.C26592a;
import o20.C27460e;
import o23.C27478h;
import o23.C27481k;
import o23.C27487q;
import o23.InterfaceC27474d;
import p000.C34292u;
import p005a3.C0230n0;
import p007a6.C0416e;
import p007a6.C0454t;
import p012ab.C0682h0;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11362i1;
import p077d0.C11376m;
import p164g2.C15247s;
import p180h0.InterfaceC16413k2;
import p238j0.C21084j;
import p292l1.C23081d2;
import p292l1.C23161q4;
import p313lz.C24807d;
import p313lz.C24812i;
import p352ny.C27232d;
import p352ny.C27233e;
import p353o0.C27341y;
import p389p0.C28539n0;
import p390p1.C28621h1;
import p392p3.C28762c;
import p395p6.C28864b;
import p395p6.C28901n0;
import p395p6.C28925v0;
import p421qd.C30290e;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p696zy.InterfaceC41211c;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s23.C32091d;
import s23.EnumC32092e;
import s40.C32185w;
import s83.AbstractC32275i;
import t23.C33368c0;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: kd.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C22379f extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87366w;

    /* JADX INFO: renamed from: x */
    public int f87367x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f87368y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22379f(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f87366w = i13;
        this.f87368y = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f87366w) {
            case 0:
                return new C22379f((C22378e) this.f87368y, interfaceC30057d, 0);
            case 1:
                return new C22379f((C15247s) this.f87368y, interfaceC30057d, 1);
            case 2:
                return new C22379f((C23081d2) this.f87368y, interfaceC30057d, 2);
            case 3:
                return new C22379f((C11344e) this.f87368y, interfaceC30057d, 3);
            case 4:
                return new C22379f((C23161q4) this.f87368y, interfaceC30057d, 4);
            case 5:
                return new C22379f((C0416e) this.f87368y, interfaceC30057d, 5);
            case 6:
                return new C22379f((C0904j) this.f87368y, interfaceC30057d, 6);
            case 7:
                return new C22379f((C24812i) this.f87368y, interfaceC30057d, 7);
            case 8:
                return new C22379f((FinancialConnectionsSheetLiteActivity) this.f87368y, interfaceC30057d, 8);
            case 9:
                return new C22379f((C26174i) this.f87368y, interfaceC30057d, 9);
            case 10:
                return new C22379f((C26176k) this.f87368y, interfaceC30057d, 10);
            case 11:
                return new C22379f((C26186u) this.f87368y, interfaceC30057d, 11);
            case 12:
                return new C22379f((C15990r) this.f87368y, interfaceC30057d, 12);
            case 13:
                return new C22379f((C0072g) this.f87368y, interfaceC30057d, 13);
            case 14:
                return new C22379f((C26592a) this.f87368y, interfaceC30057d, 14);
            case 15:
                return new C22379f((C2570m) this.f87368y, interfaceC30057d, 15);
            case 16:
                return new C22379f((C27341y) this.f87368y, this.f87367x, interfaceC30057d);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C22379f((C27460e) this.f87368y, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C22379f((InterfaceC27474d) this.f87368y, interfaceC30057d, 18);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C22379f((C27478h) this.f87368y, interfaceC30057d, 19);
            case 20:
                return new C22379f((C27481k) this.f87368y, interfaceC30057d, 20);
            case 21:
                return new C22379f((C27478h) this.f87368y, interfaceC30057d, 21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C22379f((C27487q) this.f87368y, interfaceC30057d, 22);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C22379f((C28539n0) this.f87368y, interfaceC30057d, 23);
            case 24:
                return new C22379f((C28762c) this.f87368y, interfaceC30057d, 24);
            case 25:
                return new C22379f((C28925v0) this.f87368y, interfaceC30057d, 25);
            case 26:
                return new C22379f((Context) this.f87368y, interfaceC30057d, 26);
            case 27:
                return new C22379f((C30290e) this.f87368y, interfaceC30057d, 27);
            case 28:
                return new C22379f((C32091d) this.f87368y, interfaceC30057d, 28);
            default:
                return new C22379f((CardNumberEditText) this.f87368y, interfaceC30057d, 29);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f87366w) {
            case 0:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 9:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 15:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 16:
                C22379f c22379f = (C22379f) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c22379f.invokeSuspend(c23454a0);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 26:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 27:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 28:
                return ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                ((C22379f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM113992J;
        Object objM8705K;
        Object objM113992J2;
        Object c27233e;
        Object obj2;
        C15413r0 c15413r0;
        C26318e c26318e;
        Object objM113992J3;
        int i13 = this.f87366w;
        int i14 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj3 = C23454a0.f92919a;
        Object obj4 = this.f87368y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = this.f87367x;
                if (i15 != 0) {
                    if (i15 == 1) {
                        AbstractC34132o.m107864I(obj);
                        String str = (String) obj;
                        if (str != null) {
                            return str;
                        }
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        objM113992J = obj;
                    }
                    return (String) objM113992J;
                }
                AbstractC34132o.m107864I(obj);
                this.f87367x = 2;
                objM113992J = AbstractC35903f.m113992J(null, null, this, 3);
                if (objM113992J == enumC31071a) {
                    return enumC31071a;
                }
                return (String) objM113992J;
            case 1:
                C15247s c15247s = (C15247s) obj4;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = this.f87367x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (c15247s == null) {
                        return obj3;
                    }
                    this.f87367x = 1;
                    if (AbstractC3034m0.m8782b(300L, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C15247s.m43350c(c15247s);
                return obj3;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i17 = this.f87367x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C11344e c11344e = ((C23081d2) obj4).f91066e;
                Float f13 = new Float(0.0f);
                this.f87367x = 1;
                return C11344e.m30547d(c11344e, f13, null, null, this, 14) == enumC31071a3 ? enumC31071a3 : obj3;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i18 = this.f87367x;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                Float f14 = new Float(0.0f);
                this.f87367x = 1;
                return C11344e.m30547d((C11344e) obj4, f14, null, null, this, 14) == enumC31071a4 ? enumC31071a4 : obj3;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i19 = this.f87367x;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C22665e0 c22665e0 = new C22665e0();
                C23161q4 c23161q4 = (C23161q4) obj4;
                C13096w1 c13096w1 = ((C21084j) c23161q4.f91609O).f79947a;
                C1841x c1841x = new C1841x(10, c22665e0, c23161q4);
                this.f87367x = 1;
                c13096w1.collect(c1841x, this);
                return enumC31071a5;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i24 = this.f87367x;
                if (i24 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f87367x = 1;
                    return ((C0416e) obj4).invoke(this) == enumC31071a6 ? enumC31071a6 : obj3;
                }
                if (i24 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj3;
            case 6:
                C0904j c0904j = (C0904j) obj4;
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i25 = this.f87367x;
                if (i25 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C0682h0 c0682h0 = (C0682h0) c0904j.f3302x;
                    this.f87367x = 1;
                    objM8705K = AbstractC3006f0.m8705K((InterfaceC30063j) c0682h0.f2433y, new C0150h(c0682h0, objArr == true ? 1 : 0, 14), this);
                    if (objM8705K == enumC31071a7) {
                        return enumC31071a7;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM8705K = obj;
                }
                C23292a c23292a = (C23292a) objM8705K;
                if (c23292a != null && c0904j.f3301w == c23292a.f92281x) {
                    return obj3;
                }
                c0904j.m2224k();
                return obj3;
            case 7:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i26 = this.f87367x;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C13096w1 c13096w2 = ((C24812i) obj4).f97135E;
                C24807d c24807d = new C24807d(C22908e.f90456w);
                this.f87367x = 1;
                return c13096w2.emit(c24807d, this) == enumC31071a8 ? enumC31071a8 : obj3;
            case 8:
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) obj4;
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                int i27 = this.f87367x;
                if (i27 == 0) {
                    AbstractC34132o.m107864I(obj);
                    int i28 = FinancialConnectionsSheetLiteActivity.f22170z;
                    C13078q1 c13078q1 = ((C24812i) financialConnectionsSheetLiteActivity.f22173y.getValue()).f97136F;
                    C34292u c34292u = new C34292u(financialConnectionsSheetLiteActivity, 17);
                    this.f87367x = 1;
                    if (c13078q1.f45191w.collect(c34292u, this) == enumC31071a9) {
                        return enumC31071a9;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 9:
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                int i29 = this.f87367x;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C26174i c26174i = (C26174i) obj4;
                C13038g c13038g = c26174i.f103778i.f103799d;
                C34292u c34292u2 = new C34292u(c26174i, 18);
                this.f87367x = 1;
                return c13038g.collect(c34292u2, this) == enumC31071a10 ? enumC31071a10 : obj3;
            case 10:
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                int i34 = this.f87367x;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C26176k c26176k = (C26176k) obj4;
                C13081r1 c13081r1 = c26176k.f103797b.f42923k;
                C26175j c26175j = new C26175j((Object) c26176k, (InterfaceC30057d) (objArr2 == true ? 1 : 0), i14);
                this.f87367x = 1;
                return AbstractC13091v.m36604n(c13081r1, c26175j, this) == enumC31071a11 ? enumC31071a11 : obj3;
            case 11:
                EnumC31071a enumC31071a12 = EnumC31071a.f128113w;
                int i35 = this.f87367x;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C26186u c26186u = (C26186u) obj4;
                C13081r1 c13081r2 = c26186u.f103859H;
                C1778e c1778e = new C1778e(c26186u, objArr3 == true ? 1 : 0, 25);
                this.f87367x = 1;
                return AbstractC13091v.m36604n(c13081r2, c1778e, this) == enumC31071a12 ? enumC31071a12 : obj3;
            case 12:
                EnumC31071a enumC31071a13 = EnumC31071a.f128113w;
                int i36 = this.f87367x;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C15990r c15990r = (C15990r) obj4;
                C13045h2 c13045h2 = ((C33368c0) c15990r.f60512x).f139302p.f139652h;
                C1778e c1778e2 = new C1778e(c15990r, objArr4 == true ? 1 : 0, 26);
                this.f87367x = 1;
                return AbstractC13091v.m36604n(c13045h2, c1778e2, this) == enumC31071a13 ? enumC31071a13 : obj3;
            case 13:
                EnumC31071a enumC31071a14 = EnumC31071a.f128113w;
                int i37 = this.f87367x;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C33368c0 c33368c0 = (C33368c0) ((C0072g) obj4).f223x;
                this.f87367x = 1;
                return c33368c0.m105829x("RingingState.RejectedByAll", C4203s.f17061a, this) == enumC31071a14 ? enumC31071a14 : obj3;
            case 14:
                EnumC31071a enumC31071a15 = EnumC31071a.f128113w;
                int i38 = this.f87367x;
                if (i38 != 0) {
                    if (i38 == 1) {
                        AbstractC34132o.m107864I(obj);
                        String str2 = (String) obj;
                        if (str2 != null) {
                            return str2;
                        }
                    } else {
                        if (i38 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        objM113992J2 = obj;
                    }
                    return (String) objM113992J2;
                }
                AbstractC34132o.m107864I(obj);
                this.f87367x = 2;
                objM113992J2 = AbstractC35903f.m113992J(null, null, this, 3);
                if (objM113992J2 == enumC31071a15) {
                    return enumC31071a15;
                }
                return (String) objM113992J2;
            case 15:
                C2570m c2570m = (C2570m) obj4;
                EnumC31071a enumC31071a16 = EnumC31071a.f128113w;
                int i39 = this.f87367x;
                if (i39 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ((Function1) c2570m.f9989z).invoke(Boolean.TRUE);
                    C27232d c27232d = (C27232d) c2570m.f9988y;
                    this.f87367x = 1;
                    c27232d.getClass();
                    c27233e = new C27233e(new IllegalStateException("Not handled!"), null);
                    if (c27233e == enumC31071a16) {
                        return enumC31071a16;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    c27233e = obj;
                }
                C27233e c27233e2 = (C27233e) c27233e;
                if (!(c27233e2 instanceof C27233e)) {
                    throw new NoWhenBranchMatchedException();
                }
                Function1 function1 = (Function1) c2570m.f9984E;
                InterfaceC41211c interfaceC41211cM121456H = c27233e2.f109004b;
                if (interfaceC41211cM121456H == null) {
                    interfaceC41211cM121456H = AbstractC37926s0.m121456H(c27233e2.f109003a);
                }
                function1.invoke(interfaceC41211cM121456H);
                ((Function1) c2570m.f9989z).invoke(Boolean.FALSE);
                return obj3;
            case 16:
                EnumC31071a enumC31071a17 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C27341y c27341y = (C27341y) obj4;
                int i44 = this.f87367x;
                C3936c c3936c = c27341y.f109500d;
                if (((C28621h1) c3936c.f16070c).m87024x() != i44 || ((C28621h1) c3936c.f16069b).m87024x() != 0) {
                    C1106b c1106b = c27341y.f109509m;
                    c1106b.m3440e();
                    c1106b.f4614b = null;
                    c1106b.f4615c = -1;
                }
                c3936c.m11990g(i44, 0);
                c3936c.f16071d = null;
                C0230n0 c0230n0 = c27341y.f109506j;
                if (c0230n0 != null) {
                    c0230n0.m630m();
                }
                return obj3;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                EnumC31071a enumC31071a18 = EnumC31071a.f128113w;
                int i45 = this.f87367x;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                List list = ((C27460e) obj4).f110664w;
                this.f87367x = 1;
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list2) {
                    if (obj5 instanceof C15440w2) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList2, ((C15440w2) it.next()).f58025b);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : arrayList2) {
                    if (obj6 instanceof C15320a2) {
                        arrayList3.add(obj6);
                    }
                }
                C15320a2 c15320a2 = (C15320a2) AbstractC25265s.m74100H0(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : list2) {
                    if (obj7 instanceof C15440w2) {
                        arrayList4.add(obj7);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList5, ((C15440w2) it3.next()).f58025b);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj8 : arrayList5) {
                    if (obj8 instanceof C15366i0) {
                        arrayList6.add(obj8);
                    }
                }
                C15366i0 c15366i0Mo43554j = (C15366i0) AbstractC25265s.m74100H0(arrayList6);
                if (c15366i0Mo43554j == null) {
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj9 : list2) {
                        if (obj9 instanceof C15440w2) {
                            arrayList7.add(obj9);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        AbstractC25265s.m74141p0(arrayList8, ((C15440w2) it4.next()).f58025b);
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj10 : arrayList8) {
                        if (obj10 instanceof InterfaceC15359h) {
                            arrayList9.add(obj10);
                        }
                    }
                    InterfaceC15359h interfaceC15359h = (InterfaceC15359h) AbstractC25265s.m74100H0(arrayList9);
                    c15366i0Mo43554j = interfaceC15359h != null ? interfaceC15359h.mo43554j() : null;
                }
                if (c15366i0Mo43554j == null || (c15413r0 = c15366i0Mo43554j.f57766c) == null || (c26318e = c15413r0.f57908i) == null) {
                    obj2 = obj3;
                } else {
                    c26318e.collect(new C0454t(new C34292u(c15320a2, 19), 2), this);
                    obj2 = EnumC31071a.f128113w;
                }
                return obj2 == enumC31071a18 ? enumC31071a18 : obj3;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                EnumC31071a enumC31071a19 = EnumC31071a.f128113w;
                int i46 = this.f87367x;
                if (i46 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f87367x = 1;
                    return ((InterfaceC27474d) obj4).await(this) == enumC31071a19 ? enumC31071a19 : obj3;
                }
                if (i46 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj3;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                EnumC31071a enumC31071a20 = EnumC31071a.f128113w;
                int i47 = this.f87367x;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f87367x = 1;
                Object objAwait = ((C27478h) obj4).await(this);
                return objAwait == enumC31071a20 ? enumC31071a20 : objAwait;
            case 20:
                EnumC31071a enumC31071a21 = EnumC31071a.f128113w;
                int i48 = this.f87367x;
                if (i48 != 0) {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f87367x = 1;
                Object objAwait2 = ((C27481k) obj4).await(this);
                return objAwait2 == enumC31071a21 ? enumC31071a21 : objAwait2;
            case 21:
                EnumC31071a enumC31071a22 = EnumC31071a.f128113w;
                int i49 = this.f87367x;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f87367x = 1;
                Object objAwait3 = ((C27478h) obj4).await(this);
                return objAwait3 == enumC31071a22 ? enumC31071a22 : objAwait3;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                EnumC31071a enumC31071a23 = EnumC31071a.f128113w;
                int i54 = this.f87367x;
                if (i54 != 0) {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f87367x = 1;
                Object objAwait4 = ((C27487q) obj4).await(this);
                return objAwait4 == enumC31071a23 ? enumC31071a23 : objAwait4;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                EnumC31071a enumC31071a24 = EnumC31071a.f128113w;
                int i55 = this.f87367x;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C11376m c11376m = (C11376m) ((C28539n0) obj4).f115463y;
                Float f15 = new Float(0.0f);
                C11362i1 c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new Float(0.5f));
                this.f87367x = 1;
                return AbstractC11348f.m30561i(c11376m, f15, c11362i1M30573u, true, null, this, 8) == enumC31071a24 ? enumC31071a24 : obj3;
            case 24:
                EnumC31071a enumC31071a25 = EnumC31071a.f128113w;
                int i56 = this.f87367x;
                if (i56 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f87367x = 1;
                    return ((C28762c) obj4).m87526a(this) == enumC31071a25 ? enumC31071a25 : obj3;
                }
                if (i56 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj3;
            case 25:
                EnumC31071a enumC31071a26 = EnumC31071a.f128113w;
                int i57 = this.f87367x;
                try {
                    if (i57 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C28925v0 c28925v0 = (C28925v0) obj4;
                        C28864b c28864b = new C28864b(c28925v0.f117037b);
                        this.f87367x = 1;
                        if (C28925v0.m87836a(c28925v0, c28864b, this) == enumC31071a26) {
                            obj3 = enumC31071a26;
                        }
                    } else {
                        if (i57 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return obj3;
                } catch (Throwable th3) {
                    return new Integer(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", th3));
                }
            case 26:
                EnumC31071a enumC31071a27 = EnumC31071a.f128113w;
                int i58 = this.f87367x;
                if (i58 != 0) {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj3;
                }
                AbstractC34132o.m107864I(obj);
                C28901n0 c28901n0 = new C28901n0((Context) obj4);
                this.f87367x = 1;
                return c28901n0.m87819a(this) == enumC31071a27 ? enumC31071a27 : obj3;
            case 27:
                EnumC31071a enumC31071a28 = EnumC31071a.f128113w;
                int i59 = this.f87367x;
                if (i59 != 0) {
                    if (i59 == 1) {
                        AbstractC34132o.m107864I(obj);
                        String str3 = (String) obj;
                        if (str3 != null) {
                            return str3;
                        }
                    } else {
                        if (i59 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        objM113992J3 = obj;
                    }
                    return (String) objM113992J3;
                }
                AbstractC34132o.m107864I(obj);
                this.f87367x = 2;
                objM113992J3 = AbstractC35903f.m113992J(null, null, this, 3);
                if (objM113992J3 == enumC31071a28) {
                    return enumC31071a28;
                }
                return (String) objM113992J3;
            case 28:
                C32091d c32091d = (C32091d) obj4;
                EnumC31071a enumC31071a29 = EnumC31071a.f128113w;
                int i64 = this.f87367x;
                if (i64 != 0 && i64 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                while (c32091d.f133076c == EnumC32092e.f133093y) {
                    Long l7 = c32091d.f133083j;
                    long jCurrentTimeMillis = l7 != null ? System.currentTimeMillis() - l7.longValue() : 0L;
                    C19544a c19544a = c32091d.f133089p;
                    if (c19544a != null) {
                        AudioRecordingController.setupMediaRecorder$lambda$10(c19544a.f74449a, jCurrentTimeMillis);
                    }
                    this.f87367x = 1;
                    if (AbstractC3034m0.m8782b(1000L, this) == enumC31071a29) {
                        return enumC31071a29;
                    }
                }
                return obj3;
            default:
                EnumC31071a enumC31071a30 = EnumC31071a.f128113w;
                int i65 = this.f87367x;
                if (i65 != 0) {
                    if (i65 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                CardNumberEditText cardNumberEditText = (CardNumberEditText) obj4;
                C26318e c26318e2 = cardNumberEditText.f22509W.f177717e;
                C32185w c32185w = new C32185w(cardNumberEditText, i14);
                this.f87367x = 1;
                c26318e2.collect(c32185w, this);
                return enumC31071a30;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22379f(C27341y c27341y, int i13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f87366w = 16;
        this.f87368y = c27341y;
        this.f87367x = i13;
    }
}
