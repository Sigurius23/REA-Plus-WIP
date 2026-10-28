package id2;

import android.content.Context;
import androidx.fragment.app.AbstractActivityC1340r0;
import bc3.InterfaceC2994c0;
import bd2.C3108a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.navigation.ProfileActionRouter;
import com.whoop.profile.navigation.ProfileNavigationRouter;
import com.whoop.profile.view.navigation.ProfileNavHostKt;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import hd2.C17202d;
import i93.C18284j;
import l83.C23454a0;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p179h.C16351i;
import p292l1.AbstractC23092f1;
import p292l1.C23085e0;
import p292l1.C23204y;
import p292l1.C23211z0;
import p292l1.InterfaceC23142n3;
import p316m1.AbstractC24917o;
import p316m1.C24916n;
import p316m1.C24920r;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import sy2.AbstractC33117t;
import tp1.C34070j;
import tr2.InterfaceC34116n;
import v41.AbstractC35664f;
import vp1.AbstractC36272h;
import wt2.AbstractC37636q;
import yt2.AbstractC39782m;

/* JADX INFO: renamed from: id2.s */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C18434s implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f71696E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f71697F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f71698G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f71699H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f71700I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f71701J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71702w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f71703x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f71704y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f71705z;

    public /* synthetic */ C18434s(C18284j c18284j, AbstractC24917o abstractC24917o, C24920r c24920r, Function1 function1, C24916n c24916n, Long l7, C23085e0 c23085e0, InterfaceC23142n3 interfaceC23142n3, C23204y c23204y) {
        this.f71702w = 1;
        this.f71704y = c18284j;
        this.f71705z = abstractC24917o;
        this.f71696E = c24920r;
        this.f71703x = function1;
        this.f71697F = c24916n;
        this.f71698G = l7;
        this.f71699H = c23085e0;
        this.f71700I = interfaceC23142n3;
        this.f71701J = c23204y;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f71702w;
        Object obj2 = this.f71700I;
        Object obj3 = this.f71699H;
        Object obj4 = this.f71698G;
        Object obj5 = this.f71704y;
        Object obj6 = this.f71701J;
        Object obj7 = this.f71697F;
        Object obj8 = this.f71696E;
        Object obj9 = this.f71703x;
        Object obj10 = this.f71705z;
        switch (i13) {
            case 0:
                return AbstractC18435t.m53086K((InterfaceC2994c0) obj5, (C18425j) obj10, (C17202d.b) obj8, (C17202d.a) obj7, (Context) obj4, (C3108a) obj3, (Function1) obj9, (InterfaceC4351m) obj2, (InterfaceC28601c1) obj6, (AbstractC18419d) obj);
            case 1:
                C18284j c18284j = (C18284j) obj5;
                float f13 = AbstractC23092f1.f91167a;
                InterfaceC26064q.m77555a((InterfaceC26064q) obj, ((c18284j.f71134x - c18284j.f71133w) + 1) * 12, null, new C37816b(new C23211z0((AbstractC24917o) obj10, (C24920r) obj8, (Function1) obj9, (C24916n) obj7, (Long) obj4, (C23085e0) obj3, (InterfaceC23142n3) obj2, (C23204y) obj6), true, 72599078), 6);
                return C23454a0.f92919a;
            case 2:
                return AbstractC33117t.m105008v((InterfaceC28601c1) obj6, (Function1) obj9, (InterfaceC28601c1) obj5, (Function1) obj10, (Function1) obj8, (String) obj7, (InterfaceC28601c1) obj4, (SurveyProvider) obj3, (C16351i) obj2, (Context) obj);
            case 3:
                return AbstractC36272h.m115898z1((C34070j) obj5, (Function1) obj9, (Function1) obj10, (InterfaceC4339a) obj8, (Function1) obj7, (InterfaceC28601c1) obj6, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj3, (InterfaceC28601c1) obj2, (InterfaceC26064q) obj);
            case 4:
                return ProfileNavHostKt.ProfileNavHost$lambda$0$0((ProfileNavigationRouter) obj5, (ProfileActionRouter) obj10, (InterfaceC34116n) obj8, (String) obj7, (Integer) obj4, (Integer) obj3, (String) obj9, (AbstractActivityC1340r0) obj2, (C12991u0) obj6, (C12987s0) obj);
            default:
                return AbstractC39782m.m127442R((AbstractC37636q.c) obj10, (Function1) obj9, (Function1) obj8, (Function1) obj7, (InterfaceC28601c1) obj6, (InterfaceC2994c0) obj5, (AbstractC35664f.a) obj4, (InterfaceC28601c1) obj3, (InterfaceC28601c1) obj2, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C18434s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i13) {
        this.f71702w = i13;
        this.f71704y = obj;
        this.f71705z = obj2;
        this.f71696E = obj3;
        this.f71697F = obj4;
        this.f71698G = obj5;
        this.f71699H = obj6;
        this.f71703x = obj7;
        this.f71700I = obj8;
        this.f71701J = obj9;
    }

    public /* synthetic */ C18434s(InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28601c1 interfaceC28601c2, Function1 function2, Function1 function3, String str, InterfaceC28601c1 interfaceC28601c3, SurveyProvider surveyProvider, C16351i c16351i) {
        this.f71702w = 2;
        this.f71701J = interfaceC28601c1;
        this.f71703x = function1;
        this.f71704y = interfaceC28601c2;
        this.f71705z = function2;
        this.f71696E = function3;
        this.f71697F = str;
        this.f71698G = interfaceC28601c3;
        this.f71699H = surveyProvider;
        this.f71700I = c16351i;
    }

    public /* synthetic */ C18434s(C34070j c34070j, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
        this.f71702w = 3;
        this.f71704y = c34070j;
        this.f71703x = function1;
        this.f71705z = function2;
        this.f71696E = interfaceC4339a;
        this.f71697F = function3;
        this.f71701J = interfaceC28601c1;
        this.f71698G = interfaceC28601c2;
        this.f71699H = interfaceC28601c3;
        this.f71700I = interfaceC28601c4;
    }

    public /* synthetic */ C18434s(AbstractC37636q.c cVar, Function1 function1, Function1 function2, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        this.f71702w = 5;
        this.f71705z = cVar;
        this.f71703x = function1;
        this.f71696E = function2;
        this.f71697F = function3;
        this.f71701J = interfaceC28601c1;
        this.f71704y = interfaceC2994c0;
        this.f71698G = aVar;
        this.f71699H = interfaceC28601c2;
        this.f71700I = interfaceC28601c3;
    }
}
