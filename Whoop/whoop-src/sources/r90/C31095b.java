package r90;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.bot.models.feedback.FeedbackReason;
import com.whoop.educationModels.MediaHeader;
import com.whoop.home.domain.models.DayOneTransitionViewState;
import dp0.InterfaceC12251g;
import h51.C16934f;
import i71.C18204h;
import i71.InterfaceC18203g;
import k61.C22228a;
import l01.C23032d;
import ng2.C26684c;
import p132f0.C13821r1;
import p31.C28801l;
import p390p1.InterfaceC28601c1;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import p731rl2.Function0;
import p734sl0.AbstractC32681u2;
import p734sl0.C32687w0;
import p734sl0.C32691x0;
import re1.AbstractC31325l;
import rg2.C31395g;
import rg2.C31397i;
import rm1.C31596j;
import rp2.C31642b;
import rp2.C31643c;
import rs2.AbstractC31797c;
import rs2.C31796b;
import ry0.C31906a;
import ry0.C31909d;
import s01.C32046b;
import s01.C32048d;
import s11.C32065a;
import s21.C32081d;
import s21.C32085h;
import s31.C32105b;
import s31.C32108e;
import s32.C32110b;
import s32.C32115g;
import s41.C32193a;
import s41.C32194b;
import s50.C32199a;
import s50.C32202d;
import s51.C32204a;
import s51.C32207d;
import s51.C32213j;
import s51.C32216m;
import s61.AbstractC32230a;
import s71.C32239a;
import s71.C32241c;
import s80.C32253a;
import s80.C32256d;
import s81.C32260c;
import s81.C32265h;
import s90.C32288d;
import s90.C32292h;
import sg2.C32452c;
import sg2.C32457h;
import sg2.C32459j;
import sg2.C32462m;
import sg2.C32467r;
import u61.C34552a;
import us2.C35220a;

/* JADX INFO: renamed from: r90.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C31095b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f128250E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f128251F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128252w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f128253x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f128254y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f128255z;

    public /* synthetic */ C31095b(int i13, C39967p c39967p, FeedbackReason feedbackReason, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        this.f128252w = 29;
        this.f128254y = i13;
        this.f128255z = c39967p;
        this.f128250E = feedbackReason;
        this.f128251F = interfaceC28601c1;
        this.f128253x = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f128252w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC31096c.m95766o((C31103j) this.f128255z, (String) this.f128250E, (Function1) this.f128253x, (Function1) this.f128251F, this.f128254y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return C31098e.m95769c((C31098e) this.f128255z, (Modifier) this.f128250E, (C31100g) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC31325l.m96408k((MediaHeader) this.f128255z, (C13821r1) this.f128250E, (InterfaceC4339a) this.f128253x, (InterfaceC4351m) this.f128251F, this.f128254y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return Function0.m97106o((InterfaceC4339a) this.f128255z, (InterfaceC4339a) this.f128250E, (InterfaceC4339a) this.f128253x, (InterfaceC4339a) this.f128251F, this.f128254y, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return C31596j.m97479c((C31596j) this.f128255z, (Modifier) this.f128250E, (DayOneTransitionViewState) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return C31643c.m97794c((C31643c) this.f128255z, (Modifier) this.f128250E, (C31642b) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return C31796b.m98757c((C31796b) this.f128255z, (Modifier) this.f128250E, (C35220a) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC31797c.m98759A((InterfaceC25312u) this.f128255z, (C28801l) this.f128250E, (InterfaceC2994c0) this.f128253x, (InterfaceC12251g) this.f128251F, this.f128254y, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return C31906a.m99189e((C31906a) this.f128255z, (Modifier) this.f128250E, (C31909d) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return C32046b.m99587c((C32046b) this.f128255z, (Modifier) this.f128250E, (C32048d) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return C32065a.m99632c((C32065a) this.f128255z, (Modifier) this.f128250E, (C23032d) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj2).intValue();
                return C32081d.m99791c((C32081d) this.f128255z, (Modifier) this.f128250E, (C32085h) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj2).intValue();
                return C32105b.m99899c((C32105b) this.f128255z, (Modifier) this.f128250E, (C32108e) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj2).intValue();
                return C32110b.m99930c((C32110b) this.f128255z, (Modifier) this.f128250E, (C32115g) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj2).intValue();
                return C32193a.m100120g((C32193a) this.f128255z, (Modifier) this.f128250E, (C32194b) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj2).intValue();
                return C32199a.m100144c((C32199a) this.f128255z, (Modifier) this.f128250E, (C32202d) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj2).intValue();
                return C32204a.m100175c((C32204a) this.f128255z, (Modifier) this.f128250E, (C32207d) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue18 = ((Integer) obj2).intValue();
                return C32213j.m100219c((C32213j) this.f128255z, (Modifier) this.f128250E, (C32216m) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue18);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue19 = ((Integer) obj2).intValue();
                return AbstractC32230a.m100270e((C22228a) this.f128255z, (C34552a) this.f128250E, (C18204h) this.f128253x, (InterfaceC18203g) this.f128251F, this.f128254y, (Composer) obj, iIntValue19);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue20 = ((Integer) obj2).intValue();
                return C32239a.m100310c((C32239a) this.f128255z, (Modifier) this.f128250E, (C32241c) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj2).intValue();
                return C32253a.m100351c((C32253a) this.f128255z, (Modifier) this.f128250E, (C32256d) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue21);
            case 21:
                int iIntValue22 = ((Integer) obj2).intValue();
                return C32260c.m100392c((C32260c) this.f128255z, (Modifier) this.f128250E, (C32265h) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue22);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue23 = ((Integer) obj2).intValue();
                return C32288d.m100475c((C32288d) this.f128255z, (Modifier) this.f128250E, (C32292h) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue23);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue24 = ((Integer) obj2).intValue();
                return C32452c.m101339i((C32452c) this.f128255z, (Modifier) this.f128250E, (C32457h) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue24);
            case 24:
                int iIntValue25 = ((Integer) obj2).intValue();
                return C32459j.m101359g((C32459j) this.f128255z, (Modifier) this.f128250E, (C31395g) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue25);
            case 25:
                int iIntValue26 = ((Integer) obj2).intValue();
                return C32462m.m101378e((C32462m) this.f128255z, (Modifier) this.f128250E, (C31397i) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue26);
            case 26:
                int iIntValue27 = ((Integer) obj2).intValue();
                return C32467r.m101414c((C32467r) this.f128255z, (Modifier) this.f128250E, (C26684c) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue27);
            case 27:
                int iIntValue28 = ((Integer) obj2).intValue();
                return C32687w0.m102565e((C32687w0) this.f128255z, (Modifier) this.f128250E, (C16934f) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue28);
            case 28:
                int iIntValue29 = ((Integer) obj2).intValue();
                return C32691x0.m102583e((C32691x0) this.f128255z, (Modifier) this.f128250E, (C16934f) this.f128251F, (Function1) this.f128253x, this.f128254y, (Composer) obj, iIntValue29);
            default:
                int iIntValue30 = ((Integer) obj2).intValue();
                return AbstractC32681u2.m102452E(this.f128254y, (C39967p) this.f128255z, (FeedbackReason) this.f128250E, (InterfaceC28601c1) this.f128251F, (Function1) this.f128253x, (Composer) obj, iIntValue30);
        }
    }

    public /* synthetic */ C31095b(Object obj, Object obj2, Object obj3, Object obj4, int i13, int i14) {
        this.f128252w = i14;
        this.f128255z = obj;
        this.f128250E = obj2;
        this.f128253x = obj3;
        this.f128251F = obj4;
        this.f128254y = i13;
    }

    public /* synthetic */ C31095b(InterfaceC25297f interfaceC25297f, Modifier modifier, InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14) {
        this.f128252w = i14;
        this.f128255z = interfaceC25297f;
        this.f128250E = modifier;
        this.f128251F = interfaceC25312u;
        this.f128253x = function1;
        this.f128254y = i13;
    }
}
