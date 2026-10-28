package t30;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1643y1;
import c93.InterfaceC4339a;
import com.stripe.android.stripe3ds2.views.BrandZoneView;
import com.stripe.android.stripe3ds2.views.ChallengeZoneView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.stripe3ds2.views.ThreeDS2HeaderTextView;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;
import com.whoop.android.R;
import e93.AbstractC12889b;
import gr.C16085a;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k30.C22169b;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import m30.AbstractC24985a;
import m30.C24988d;
import m30.C24989e;
import m30.C24992h;
import m30.EnumC24994j;
import m30.InterfaceC24986b;
import m30.InterfaceC24987c;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import n30.InterfaceC26213d;
import ng3.C26702o;
import p098dt.AbstractC12350b;
import p292l1.C23187v0;
import p504tq.C34080b;
import p507tx.AbstractC34235f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.AbstractC29907h;
import q30.AbstractC29931t;
import q30.C29899d;
import q30.C29901e;
import q30.C29903f;
import q30.C29905g;
import q30.C29906g0;
import q30.C29920n0;
import q30.C29923p;
import q30.C29925q;
import q30.C29927r;
import q30.C29929s;
import q30.C29933u;
import q30.C29935v;
import q30.C29936v0;
import q30.C29937w;
import q30.C29939x;
import q30.C29941y;
import q30.C29942z;
import q30.InterfaceC29913k;
import q83.AbstractC30060g;
import q83.C30064k;
import r30.C30897b;
import r30.C30898c;
import r30.C30899d;
import r30.C30900e;
import r30.C30902g;
import r30.EnumC30905j;
import rq0.C31703x;
import s40.C32176r0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: t30.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C33512n extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E */
    public final InterfaceC29913k f139891E;

    /* JADX INFO: renamed from: F */
    public final EnumC30905j f139892F;

    /* JADX INFO: renamed from: G */
    public final C29920n0 f139893G;

    /* JADX INFO: renamed from: H */
    public C30900e f139894H;

    /* JADX INFO: renamed from: I */
    public final C23470p f139895I;

    /* JADX INFO: renamed from: J */
    public final C1643y1 f139896J;

    /* JADX INFO: renamed from: K */
    public final C23470p f139897K;

    /* JADX INFO: renamed from: L */
    public C22169b f139898L;

    /* JADX INFO: renamed from: M */
    public final C23470p f139899M;

    /* JADX INFO: renamed from: N */
    public final C23470p f139900N;

    /* JADX INFO: renamed from: O */
    public final C23470p f139901O;

    /* JADX INFO: renamed from: P */
    public final C23470p f139902P;

    /* JADX INFO: renamed from: Q */
    public final C23470p f139903Q;

    /* JADX INFO: renamed from: w */
    public final C24992h f139904w;

    /* JADX INFO: renamed from: x */
    public final C29906g0 f139905x;

    /* JADX INFO: renamed from: y */
    public final C29936v0 f139906y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC26213d f139907z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33512n(C24992h uiCustomization, C29906g0 transactionTimer, C29936v0 errorRequestExecutor, InterfaceC26213d errorReporter, InterfaceC29913k challengeActionHandler, EnumC30905j enumC30905j, C29920n0 intentData) {
        super(R.layout.stripe_challenge_fragment);
        AbstractC22676k.m65750j(uiCustomization, "uiCustomization");
        AbstractC22676k.m65750j(transactionTimer, "transactionTimer");
        AbstractC22676k.m65750j(errorRequestExecutor, "errorRequestExecutor");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(challengeActionHandler, "challengeActionHandler");
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f139904w = uiCustomization;
        this.f139905x = transactionTimer;
        this.f139906y = errorRequestExecutor;
        this.f139907z = errorReporter;
        this.f139891E = challengeActionHandler;
        this.f139892F = enumC30905j;
        this.f139893G = intentData;
        final int i13 = 2;
        this.f139895I = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C33512n f139885x;

            {
                this.f139885x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        C33512n c33512n = this.f139885x;
                        C33506h c33506h = (C33506h) c33512n.f139897K.getValue();
                        C30900e c30900e = c33512n.f139894H;
                        if (c30900e == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        c33506h.getClass();
                        C33520v c33520v = new C33520v(c33506h.f139881a);
                        c33520v.m105891a(c30900e.f127429y);
                        return c33520v;
                    case 1:
                        InformationZoneView caInformationZone = this.f139885x.m105887B().f85985d;
                        AbstractC22676k.m65749i(caInformationZone, "caInformationZone");
                        return caInformationZone;
                    case 2:
                        C30900e c30900e2 = this.f139885x.f139894H;
                        if (c30900e2 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        EnumC30905j enumC30905j2 = c30900e2.f127403E;
                        String str = enumC30905j2 != null ? enumC30905j2.f127463w : null;
                        return str == null ? "" : str;
                    case 3:
                        C33512n c33512n2 = this.f139885x;
                        return new C32176r0(c33512n2.f139891E, c33512n2.f139905x, c33512n2.f139907z);
                    case 4:
                        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f139885x.requireActivity();
                        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                        return new C33506h(abstractActivityC1340r0RequireActivity);
                    case 5:
                        ChallengeZoneView caChallengeZone = this.f139885x.m105887B().f85984c;
                        AbstractC22676k.m65749i(caChallengeZone, "caChallengeZone");
                        return caChallengeZone;
                    case 6:
                        BrandZoneView caBrandZone = this.f139885x.m105887B().f85983b;
                        AbstractC22676k.m65749i(caBrandZone, "caBrandZone");
                        return caBrandZone;
                    case 7:
                        C33512n c33512n3 = this.f139885x;
                        C33506h c33506h2 = (C33506h) c33512n3.f139897K.getValue();
                        C30900e c30900e3 = c33512n3.f139894H;
                        if (c30900e3 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization2 = c33512n3.f139904w;
                        c33506h2.getClass();
                        AbstractC22676k.m65750j(uiCustomization2, "uiCustomization");
                        C33519u c33519u = new C33519u(c33506h2.f139881a);
                        c33519u.setTextEntryLabel(c30900e3.f127406H);
                        c33519u.setTextBoxCustomization(uiCustomization2.f97802y);
                        return c33519u;
                    default:
                        C33512n c33512n4 = this.f139885x;
                        C33506h c33506h3 = (C33506h) c33512n4.f139897K.getValue();
                        C30900e c30900e4 = c33512n4.f139894H;
                        if (c30900e4 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization3 = c33512n4.f139904w;
                        c33506h3.getClass();
                        AbstractC22676k.m65750j(uiCustomization3, "uiCustomization");
                        C33518t c33518t = new C33518t(c33506h3.f139881a, c30900e4.f127403E == EnumC30905j.SingleSelect);
                        String str2 = c30900e4.f127406H;
                        C24989e c24989e = uiCustomization3.f97801x;
                        ThreeDS2TextView threeDS2TextView = c33518t.f139933x;
                        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str2, c24989e);
                        }
                        List list = c30900e4.f127410L;
                        InterfaceC24987c interfaceC24987cM73318b = uiCustomization3.m73318b(EnumC24994j.f97805F);
                        if (list != null) {
                            int size = list.size();
                            Iterator it = AbstractC12889b.m36278i0(0, size).iterator();
                            while (((C18283i) it).f71138y) {
                                int iNextInt = ((AbstractC25243e0) it).nextInt();
                                C30898c option = (C30898c) list.get(iNextInt);
                                boolean z4 = iNextInt == size + (-1);
                                AbstractC22676k.m65750j(option, "option");
                                CompoundButton c16085a = c33518t.f139932w ? new C16085a(c33518t.getContext(), null) : new C34080b(c33518t.getContext(), null);
                                if (interfaceC24987cM73318b != null) {
                                    String str3 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                    if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
                                        c16085a.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                                    }
                                    String str4 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                                        c16085a.setTextColor(Color.parseColor(str4));
                                    }
                                }
                                c16085a.setId(View.generateViewId());
                                c16085a.setTag(option);
                                c16085a.setText(option.f127398x);
                                c16085a.setPadding(c33518t.f139929E, c16085a.getPaddingTop(), c16085a.getPaddingRight(), c16085a.getPaddingBottom());
                                c16085a.setMinimumHeight(c33518t.f139931G);
                                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                if (!z4) {
                                    layoutParams.bottomMargin = c33518t.f139935z;
                                }
                                layoutParams.leftMargin = c33518t.f139930F;
                                c16085a.setLayoutParams(layoutParams);
                                c33518t.f139934y.addView(c16085a);
                            }
                        }
                        return c33518t;
                }
            }
        });
        final int i14 = 3;
        this.f139896J = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33505g.class), new C33511m(this, 0), new InterfaceC4339a(this) { // from class: t30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C33512n f139885x;

            {
                this.f139885x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        C33512n c33512n = this.f139885x;
                        C33506h c33506h = (C33506h) c33512n.f139897K.getValue();
                        C30900e c30900e = c33512n.f139894H;
                        if (c30900e == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        c33506h.getClass();
                        C33520v c33520v = new C33520v(c33506h.f139881a);
                        c33520v.m105891a(c30900e.f127429y);
                        return c33520v;
                    case 1:
                        InformationZoneView caInformationZone = this.f139885x.m105887B().f85985d;
                        AbstractC22676k.m65749i(caInformationZone, "caInformationZone");
                        return caInformationZone;
                    case 2:
                        C30900e c30900e2 = this.f139885x.f139894H;
                        if (c30900e2 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        EnumC30905j enumC30905j2 = c30900e2.f127403E;
                        String str = enumC30905j2 != null ? enumC30905j2.f127463w : null;
                        return str == null ? "" : str;
                    case 3:
                        C33512n c33512n2 = this.f139885x;
                        return new C32176r0(c33512n2.f139891E, c33512n2.f139905x, c33512n2.f139907z);
                    case 4:
                        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f139885x.requireActivity();
                        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                        return new C33506h(abstractActivityC1340r0RequireActivity);
                    case 5:
                        ChallengeZoneView caChallengeZone = this.f139885x.m105887B().f85984c;
                        AbstractC22676k.m65749i(caChallengeZone, "caChallengeZone");
                        return caChallengeZone;
                    case 6:
                        BrandZoneView caBrandZone = this.f139885x.m105887B().f85983b;
                        AbstractC22676k.m65749i(caBrandZone, "caBrandZone");
                        return caBrandZone;
                    case 7:
                        C33512n c33512n3 = this.f139885x;
                        C33506h c33506h2 = (C33506h) c33512n3.f139897K.getValue();
                        C30900e c30900e3 = c33512n3.f139894H;
                        if (c30900e3 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization2 = c33512n3.f139904w;
                        c33506h2.getClass();
                        AbstractC22676k.m65750j(uiCustomization2, "uiCustomization");
                        C33519u c33519u = new C33519u(c33506h2.f139881a);
                        c33519u.setTextEntryLabel(c30900e3.f127406H);
                        c33519u.setTextBoxCustomization(uiCustomization2.f97802y);
                        return c33519u;
                    default:
                        C33512n c33512n4 = this.f139885x;
                        C33506h c33506h3 = (C33506h) c33512n4.f139897K.getValue();
                        C30900e c30900e4 = c33512n4.f139894H;
                        if (c30900e4 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization3 = c33512n4.f139904w;
                        c33506h3.getClass();
                        AbstractC22676k.m65750j(uiCustomization3, "uiCustomization");
                        C33518t c33518t = new C33518t(c33506h3.f139881a, c30900e4.f127403E == EnumC30905j.SingleSelect);
                        String str2 = c30900e4.f127406H;
                        C24989e c24989e = uiCustomization3.f97801x;
                        ThreeDS2TextView threeDS2TextView = c33518t.f139933x;
                        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str2, c24989e);
                        }
                        List list = c30900e4.f127410L;
                        InterfaceC24987c interfaceC24987cM73318b = uiCustomization3.m73318b(EnumC24994j.f97805F);
                        if (list != null) {
                            int size = list.size();
                            Iterator it = AbstractC12889b.m36278i0(0, size).iterator();
                            while (((C18283i) it).f71138y) {
                                int iNextInt = ((AbstractC25243e0) it).nextInt();
                                C30898c option = (C30898c) list.get(iNextInt);
                                boolean z4 = iNextInt == size + (-1);
                                AbstractC22676k.m65750j(option, "option");
                                CompoundButton c16085a = c33518t.f139932w ? new C16085a(c33518t.getContext(), null) : new C34080b(c33518t.getContext(), null);
                                if (interfaceC24987cM73318b != null) {
                                    String str3 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                    if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
                                        c16085a.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                                    }
                                    String str4 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                                        c16085a.setTextColor(Color.parseColor(str4));
                                    }
                                }
                                c16085a.setId(View.generateViewId());
                                c16085a.setTag(option);
                                c16085a.setText(option.f127398x);
                                c16085a.setPadding(c33518t.f139929E, c16085a.getPaddingTop(), c16085a.getPaddingRight(), c16085a.getPaddingBottom());
                                c16085a.setMinimumHeight(c33518t.f139931G);
                                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                if (!z4) {
                                    layoutParams.bottomMargin = c33518t.f139935z;
                                }
                                layoutParams.leftMargin = c33518t.f139930F;
                                c16085a.setLayoutParams(layoutParams);
                                c33518t.f139934y.addView(c16085a);
                            }
                        }
                        return c33518t;
                }
            }
        }, new C33511m(this, 1));
        final int i15 = 4;
        this.f139897K = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C33512n f139885x;

            {
                this.f139885x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        C33512n c33512n = this.f139885x;
                        C33506h c33506h = (C33506h) c33512n.f139897K.getValue();
                        C30900e c30900e = c33512n.f139894H;
                        if (c30900e == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        c33506h.getClass();
                        C33520v c33520v = new C33520v(c33506h.f139881a);
                        c33520v.m105891a(c30900e.f127429y);
                        return c33520v;
                    case 1:
                        InformationZoneView caInformationZone = this.f139885x.m105887B().f85985d;
                        AbstractC22676k.m65749i(caInformationZone, "caInformationZone");
                        return caInformationZone;
                    case 2:
                        C30900e c30900e2 = this.f139885x.f139894H;
                        if (c30900e2 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        EnumC30905j enumC30905j2 = c30900e2.f127403E;
                        String str = enumC30905j2 != null ? enumC30905j2.f127463w : null;
                        return str == null ? "" : str;
                    case 3:
                        C33512n c33512n2 = this.f139885x;
                        return new C32176r0(c33512n2.f139891E, c33512n2.f139905x, c33512n2.f139907z);
                    case 4:
                        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f139885x.requireActivity();
                        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                        return new C33506h(abstractActivityC1340r0RequireActivity);
                    case 5:
                        ChallengeZoneView caChallengeZone = this.f139885x.m105887B().f85984c;
                        AbstractC22676k.m65749i(caChallengeZone, "caChallengeZone");
                        return caChallengeZone;
                    case 6:
                        BrandZoneView caBrandZone = this.f139885x.m105887B().f85983b;
                        AbstractC22676k.m65749i(caBrandZone, "caBrandZone");
                        return caBrandZone;
                    case 7:
                        C33512n c33512n3 = this.f139885x;
                        C33506h c33506h2 = (C33506h) c33512n3.f139897K.getValue();
                        C30900e c30900e3 = c33512n3.f139894H;
                        if (c30900e3 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization2 = c33512n3.f139904w;
                        c33506h2.getClass();
                        AbstractC22676k.m65750j(uiCustomization2, "uiCustomization");
                        C33519u c33519u = new C33519u(c33506h2.f139881a);
                        c33519u.setTextEntryLabel(c30900e3.f127406H);
                        c33519u.setTextBoxCustomization(uiCustomization2.f97802y);
                        return c33519u;
                    default:
                        C33512n c33512n4 = this.f139885x;
                        C33506h c33506h3 = (C33506h) c33512n4.f139897K.getValue();
                        C30900e c30900e4 = c33512n4.f139894H;
                        if (c30900e4 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization3 = c33512n4.f139904w;
                        c33506h3.getClass();
                        AbstractC22676k.m65750j(uiCustomization3, "uiCustomization");
                        C33518t c33518t = new C33518t(c33506h3.f139881a, c30900e4.f127403E == EnumC30905j.SingleSelect);
                        String str2 = c30900e4.f127406H;
                        C24989e c24989e = uiCustomization3.f97801x;
                        ThreeDS2TextView threeDS2TextView = c33518t.f139933x;
                        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str2, c24989e);
                        }
                        List list = c30900e4.f127410L;
                        InterfaceC24987c interfaceC24987cM73318b = uiCustomization3.m73318b(EnumC24994j.f97805F);
                        if (list != null) {
                            int size = list.size();
                            Iterator it = AbstractC12889b.m36278i0(0, size).iterator();
                            while (((C18283i) it).f71138y) {
                                int iNextInt = ((AbstractC25243e0) it).nextInt();
                                C30898c option = (C30898c) list.get(iNextInt);
                                boolean z4 = iNextInt == size + (-1);
                                AbstractC22676k.m65750j(option, "option");
                                CompoundButton c16085a = c33518t.f139932w ? new C16085a(c33518t.getContext(), null) : new C34080b(c33518t.getContext(), null);
                                if (interfaceC24987cM73318b != null) {
                                    String str3 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                    if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
                                        c16085a.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                                    }
                                    String str4 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                                        c16085a.setTextColor(Color.parseColor(str4));
                                    }
                                }
                                c16085a.setId(View.generateViewId());
                                c16085a.setTag(option);
                                c16085a.setText(option.f127398x);
                                c16085a.setPadding(c33518t.f139929E, c16085a.getPaddingTop(), c16085a.getPaddingRight(), c16085a.getPaddingBottom());
                                c16085a.setMinimumHeight(c33518t.f139931G);
                                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                if (!z4) {
                                    layoutParams.bottomMargin = c33518t.f139935z;
                                }
                                layoutParams.leftMargin = c33518t.f139930F;
                                c16085a.setLayoutParams(layoutParams);
                                c33518t.f139934y.addView(c16085a);
                            }
                        }
                        return c33518t;
                }
            }
        });
        final int i16 = 5;
        this.f139899M = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C33512n f139885x;

            {
                this.f139885x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        C33512n c33512n = this.f139885x;
                        C33506h c33506h = (C33506h) c33512n.f139897K.getValue();
                        C30900e c30900e = c33512n.f139894H;
                        if (c30900e == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        c33506h.getClass();
                        C33520v c33520v = new C33520v(c33506h.f139881a);
                        c33520v.m105891a(c30900e.f127429y);
                        return c33520v;
                    case 1:
                        InformationZoneView caInformationZone = this.f139885x.m105887B().f85985d;
                        AbstractC22676k.m65749i(caInformationZone, "caInformationZone");
                        return caInformationZone;
                    case 2:
                        C30900e c30900e2 = this.f139885x.f139894H;
                        if (c30900e2 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        EnumC30905j enumC30905j2 = c30900e2.f127403E;
                        String str = enumC30905j2 != null ? enumC30905j2.f127463w : null;
                        return str == null ? "" : str;
                    case 3:
                        C33512n c33512n2 = this.f139885x;
                        return new C32176r0(c33512n2.f139891E, c33512n2.f139905x, c33512n2.f139907z);
                    case 4:
                        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f139885x.requireActivity();
                        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                        return new C33506h(abstractActivityC1340r0RequireActivity);
                    case 5:
                        ChallengeZoneView caChallengeZone = this.f139885x.m105887B().f85984c;
                        AbstractC22676k.m65749i(caChallengeZone, "caChallengeZone");
                        return caChallengeZone;
                    case 6:
                        BrandZoneView caBrandZone = this.f139885x.m105887B().f85983b;
                        AbstractC22676k.m65749i(caBrandZone, "caBrandZone");
                        return caBrandZone;
                    case 7:
                        C33512n c33512n3 = this.f139885x;
                        C33506h c33506h2 = (C33506h) c33512n3.f139897K.getValue();
                        C30900e c30900e3 = c33512n3.f139894H;
                        if (c30900e3 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization2 = c33512n3.f139904w;
                        c33506h2.getClass();
                        AbstractC22676k.m65750j(uiCustomization2, "uiCustomization");
                        C33519u c33519u = new C33519u(c33506h2.f139881a);
                        c33519u.setTextEntryLabel(c30900e3.f127406H);
                        c33519u.setTextBoxCustomization(uiCustomization2.f97802y);
                        return c33519u;
                    default:
                        C33512n c33512n4 = this.f139885x;
                        C33506h c33506h3 = (C33506h) c33512n4.f139897K.getValue();
                        C30900e c30900e4 = c33512n4.f139894H;
                        if (c30900e4 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization3 = c33512n4.f139904w;
                        c33506h3.getClass();
                        AbstractC22676k.m65750j(uiCustomization3, "uiCustomization");
                        C33518t c33518t = new C33518t(c33506h3.f139881a, c30900e4.f127403E == EnumC30905j.SingleSelect);
                        String str2 = c30900e4.f127406H;
                        C24989e c24989e = uiCustomization3.f97801x;
                        ThreeDS2TextView threeDS2TextView = c33518t.f139933x;
                        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str2, c24989e);
                        }
                        List list = c30900e4.f127410L;
                        InterfaceC24987c interfaceC24987cM73318b = uiCustomization3.m73318b(EnumC24994j.f97805F);
                        if (list != null) {
                            int size = list.size();
                            Iterator it = AbstractC12889b.m36278i0(0, size).iterator();
                            while (((C18283i) it).f71138y) {
                                int iNextInt = ((AbstractC25243e0) it).nextInt();
                                C30898c option = (C30898c) list.get(iNextInt);
                                boolean z4 = iNextInt == size + (-1);
                                AbstractC22676k.m65750j(option, "option");
                                CompoundButton c16085a = c33518t.f139932w ? new C16085a(c33518t.getContext(), null) : new C34080b(c33518t.getContext(), null);
                                if (interfaceC24987cM73318b != null) {
                                    String str3 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                    if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
                                        c16085a.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                                    }
                                    String str4 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                                        c16085a.setTextColor(Color.parseColor(str4));
                                    }
                                }
                                c16085a.setId(View.generateViewId());
                                c16085a.setTag(option);
                                c16085a.setText(option.f127398x);
                                c16085a.setPadding(c33518t.f139929E, c16085a.getPaddingTop(), c16085a.getPaddingRight(), c16085a.getPaddingBottom());
                                c16085a.setMinimumHeight(c33518t.f139931G);
                                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                if (!z4) {
                                    layoutParams.bottomMargin = c33518t.f139935z;
                                }
                                layoutParams.leftMargin = c33518t.f139930F;
                                c16085a.setLayoutParams(layoutParams);
                                c33518t.f139934y.addView(c16085a);
                            }
                        }
                        return c33518t;
                }
            }
        });
        final int i17 = 6;
        this.f139900N = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C33512n f139885x;

            {
                this.f139885x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        C33512n c33512n = this.f139885x;
                        C33506h c33506h = (C33506h) c33512n.f139897K.getValue();
                        C30900e c30900e = c33512n.f139894H;
                        if (c30900e == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        c33506h.getClass();
                        C33520v c33520v = new C33520v(c33506h.f139881a);
                        c33520v.m105891a(c30900e.f127429y);
                        return c33520v;
                    case 1:
                        InformationZoneView caInformationZone = this.f139885x.m105887B().f85985d;
                        AbstractC22676k.m65749i(caInformationZone, "caInformationZone");
                        return caInformationZone;
                    case 2:
                        C30900e c30900e2 = this.f139885x.f139894H;
                        if (c30900e2 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        EnumC30905j enumC30905j2 = c30900e2.f127403E;
                        String str = enumC30905j2 != null ? enumC30905j2.f127463w : null;
                        return str == null ? "" : str;
                    case 3:
                        C33512n c33512n2 = this.f139885x;
                        return new C32176r0(c33512n2.f139891E, c33512n2.f139905x, c33512n2.f139907z);
                    case 4:
                        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f139885x.requireActivity();
                        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                        return new C33506h(abstractActivityC1340r0RequireActivity);
                    case 5:
                        ChallengeZoneView caChallengeZone = this.f139885x.m105887B().f85984c;
                        AbstractC22676k.m65749i(caChallengeZone, "caChallengeZone");
                        return caChallengeZone;
                    case 6:
                        BrandZoneView caBrandZone = this.f139885x.m105887B().f85983b;
                        AbstractC22676k.m65749i(caBrandZone, "caBrandZone");
                        return caBrandZone;
                    case 7:
                        C33512n c33512n3 = this.f139885x;
                        C33506h c33506h2 = (C33506h) c33512n3.f139897K.getValue();
                        C30900e c30900e3 = c33512n3.f139894H;
                        if (c30900e3 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization2 = c33512n3.f139904w;
                        c33506h2.getClass();
                        AbstractC22676k.m65750j(uiCustomization2, "uiCustomization");
                        C33519u c33519u = new C33519u(c33506h2.f139881a);
                        c33519u.setTextEntryLabel(c30900e3.f127406H);
                        c33519u.setTextBoxCustomization(uiCustomization2.f97802y);
                        return c33519u;
                    default:
                        C33512n c33512n4 = this.f139885x;
                        C33506h c33506h3 = (C33506h) c33512n4.f139897K.getValue();
                        C30900e c30900e4 = c33512n4.f139894H;
                        if (c30900e4 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization3 = c33512n4.f139904w;
                        c33506h3.getClass();
                        AbstractC22676k.m65750j(uiCustomization3, "uiCustomization");
                        C33518t c33518t = new C33518t(c33506h3.f139881a, c30900e4.f127403E == EnumC30905j.SingleSelect);
                        String str2 = c30900e4.f127406H;
                        C24989e c24989e = uiCustomization3.f97801x;
                        ThreeDS2TextView threeDS2TextView = c33518t.f139933x;
                        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str2, c24989e);
                        }
                        List list = c30900e4.f127410L;
                        InterfaceC24987c interfaceC24987cM73318b = uiCustomization3.m73318b(EnumC24994j.f97805F);
                        if (list != null) {
                            int size = list.size();
                            Iterator it = AbstractC12889b.m36278i0(0, size).iterator();
                            while (((C18283i) it).f71138y) {
                                int iNextInt = ((AbstractC25243e0) it).nextInt();
                                C30898c option = (C30898c) list.get(iNextInt);
                                boolean z4 = iNextInt == size + (-1);
                                AbstractC22676k.m65750j(option, "option");
                                CompoundButton c16085a = c33518t.f139932w ? new C16085a(c33518t.getContext(), null) : new C34080b(c33518t.getContext(), null);
                                if (interfaceC24987cM73318b != null) {
                                    String str3 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                    if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
                                        c16085a.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                                    }
                                    String str4 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                                        c16085a.setTextColor(Color.parseColor(str4));
                                    }
                                }
                                c16085a.setId(View.generateViewId());
                                c16085a.setTag(option);
                                c16085a.setText(option.f127398x);
                                c16085a.setPadding(c33518t.f139929E, c16085a.getPaddingTop(), c16085a.getPaddingRight(), c16085a.getPaddingBottom());
                                c16085a.setMinimumHeight(c33518t.f139931G);
                                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                if (!z4) {
                                    layoutParams.bottomMargin = c33518t.f139935z;
                                }
                                layoutParams.leftMargin = c33518t.f139930F;
                                c16085a.setLayoutParams(layoutParams);
                                c33518t.f139934y.addView(c16085a);
                            }
                        }
                        return c33518t;
                }
            }
        });
        final int i18 = 7;
        this.f139901O = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C33512n f139885x;

            {
                this.f139885x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        C33512n c33512n = this.f139885x;
                        C33506h c33506h = (C33506h) c33512n.f139897K.getValue();
                        C30900e c30900e = c33512n.f139894H;
                        if (c30900e == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        c33506h.getClass();
                        C33520v c33520v = new C33520v(c33506h.f139881a);
                        c33520v.m105891a(c30900e.f127429y);
                        return c33520v;
                    case 1:
                        InformationZoneView caInformationZone = this.f139885x.m105887B().f85985d;
                        AbstractC22676k.m65749i(caInformationZone, "caInformationZone");
                        return caInformationZone;
                    case 2:
                        C30900e c30900e2 = this.f139885x.f139894H;
                        if (c30900e2 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        EnumC30905j enumC30905j2 = c30900e2.f127403E;
                        String str = enumC30905j2 != null ? enumC30905j2.f127463w : null;
                        return str == null ? "" : str;
                    case 3:
                        C33512n c33512n2 = this.f139885x;
                        return new C32176r0(c33512n2.f139891E, c33512n2.f139905x, c33512n2.f139907z);
                    case 4:
                        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f139885x.requireActivity();
                        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                        return new C33506h(abstractActivityC1340r0RequireActivity);
                    case 5:
                        ChallengeZoneView caChallengeZone = this.f139885x.m105887B().f85984c;
                        AbstractC22676k.m65749i(caChallengeZone, "caChallengeZone");
                        return caChallengeZone;
                    case 6:
                        BrandZoneView caBrandZone = this.f139885x.m105887B().f85983b;
                        AbstractC22676k.m65749i(caBrandZone, "caBrandZone");
                        return caBrandZone;
                    case 7:
                        C33512n c33512n3 = this.f139885x;
                        C33506h c33506h2 = (C33506h) c33512n3.f139897K.getValue();
                        C30900e c30900e3 = c33512n3.f139894H;
                        if (c30900e3 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization2 = c33512n3.f139904w;
                        c33506h2.getClass();
                        AbstractC22676k.m65750j(uiCustomization2, "uiCustomization");
                        C33519u c33519u = new C33519u(c33506h2.f139881a);
                        c33519u.setTextEntryLabel(c30900e3.f127406H);
                        c33519u.setTextBoxCustomization(uiCustomization2.f97802y);
                        return c33519u;
                    default:
                        C33512n c33512n4 = this.f139885x;
                        C33506h c33506h3 = (C33506h) c33512n4.f139897K.getValue();
                        C30900e c30900e4 = c33512n4.f139894H;
                        if (c30900e4 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization3 = c33512n4.f139904w;
                        c33506h3.getClass();
                        AbstractC22676k.m65750j(uiCustomization3, "uiCustomization");
                        C33518t c33518t = new C33518t(c33506h3.f139881a, c30900e4.f127403E == EnumC30905j.SingleSelect);
                        String str2 = c30900e4.f127406H;
                        C24989e c24989e = uiCustomization3.f97801x;
                        ThreeDS2TextView threeDS2TextView = c33518t.f139933x;
                        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str2, c24989e);
                        }
                        List list = c30900e4.f127410L;
                        InterfaceC24987c interfaceC24987cM73318b = uiCustomization3.m73318b(EnumC24994j.f97805F);
                        if (list != null) {
                            int size = list.size();
                            Iterator it = AbstractC12889b.m36278i0(0, size).iterator();
                            while (((C18283i) it).f71138y) {
                                int iNextInt = ((AbstractC25243e0) it).nextInt();
                                C30898c option = (C30898c) list.get(iNextInt);
                                boolean z4 = iNextInt == size + (-1);
                                AbstractC22676k.m65750j(option, "option");
                                CompoundButton c16085a = c33518t.f139932w ? new C16085a(c33518t.getContext(), null) : new C34080b(c33518t.getContext(), null);
                                if (interfaceC24987cM73318b != null) {
                                    String str3 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                    if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
                                        c16085a.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                                    }
                                    String str4 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                                        c16085a.setTextColor(Color.parseColor(str4));
                                    }
                                }
                                c16085a.setId(View.generateViewId());
                                c16085a.setTag(option);
                                c16085a.setText(option.f127398x);
                                c16085a.setPadding(c33518t.f139929E, c16085a.getPaddingTop(), c16085a.getPaddingRight(), c16085a.getPaddingBottom());
                                c16085a.setMinimumHeight(c33518t.f139931G);
                                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                if (!z4) {
                                    layoutParams.bottomMargin = c33518t.f139935z;
                                }
                                layoutParams.leftMargin = c33518t.f139930F;
                                c16085a.setLayoutParams(layoutParams);
                                c33518t.f139934y.addView(c16085a);
                            }
                        }
                        return c33518t;
                }
            }
        });
        final int i19 = 8;
        this.f139902P = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C33512n f139885x;

            {
                this.f139885x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        C33512n c33512n = this.f139885x;
                        C33506h c33506h = (C33506h) c33512n.f139897K.getValue();
                        C30900e c30900e = c33512n.f139894H;
                        if (c30900e == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        c33506h.getClass();
                        C33520v c33520v = new C33520v(c33506h.f139881a);
                        c33520v.m105891a(c30900e.f127429y);
                        return c33520v;
                    case 1:
                        InformationZoneView caInformationZone = this.f139885x.m105887B().f85985d;
                        AbstractC22676k.m65749i(caInformationZone, "caInformationZone");
                        return caInformationZone;
                    case 2:
                        C30900e c30900e2 = this.f139885x.f139894H;
                        if (c30900e2 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        EnumC30905j enumC30905j2 = c30900e2.f127403E;
                        String str = enumC30905j2 != null ? enumC30905j2.f127463w : null;
                        return str == null ? "" : str;
                    case 3:
                        C33512n c33512n2 = this.f139885x;
                        return new C32176r0(c33512n2.f139891E, c33512n2.f139905x, c33512n2.f139907z);
                    case 4:
                        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f139885x.requireActivity();
                        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                        return new C33506h(abstractActivityC1340r0RequireActivity);
                    case 5:
                        ChallengeZoneView caChallengeZone = this.f139885x.m105887B().f85984c;
                        AbstractC22676k.m65749i(caChallengeZone, "caChallengeZone");
                        return caChallengeZone;
                    case 6:
                        BrandZoneView caBrandZone = this.f139885x.m105887B().f85983b;
                        AbstractC22676k.m65749i(caBrandZone, "caBrandZone");
                        return caBrandZone;
                    case 7:
                        C33512n c33512n3 = this.f139885x;
                        C33506h c33506h2 = (C33506h) c33512n3.f139897K.getValue();
                        C30900e c30900e3 = c33512n3.f139894H;
                        if (c30900e3 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization2 = c33512n3.f139904w;
                        c33506h2.getClass();
                        AbstractC22676k.m65750j(uiCustomization2, "uiCustomization");
                        C33519u c33519u = new C33519u(c33506h2.f139881a);
                        c33519u.setTextEntryLabel(c30900e3.f127406H);
                        c33519u.setTextBoxCustomization(uiCustomization2.f97802y);
                        return c33519u;
                    default:
                        C33512n c33512n4 = this.f139885x;
                        C33506h c33506h3 = (C33506h) c33512n4.f139897K.getValue();
                        C30900e c30900e4 = c33512n4.f139894H;
                        if (c30900e4 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization3 = c33512n4.f139904w;
                        c33506h3.getClass();
                        AbstractC22676k.m65750j(uiCustomization3, "uiCustomization");
                        C33518t c33518t = new C33518t(c33506h3.f139881a, c30900e4.f127403E == EnumC30905j.SingleSelect);
                        String str2 = c30900e4.f127406H;
                        C24989e c24989e = uiCustomization3.f97801x;
                        ThreeDS2TextView threeDS2TextView = c33518t.f139933x;
                        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str2, c24989e);
                        }
                        List list = c30900e4.f127410L;
                        InterfaceC24987c interfaceC24987cM73318b = uiCustomization3.m73318b(EnumC24994j.f97805F);
                        if (list != null) {
                            int size = list.size();
                            Iterator it = AbstractC12889b.m36278i0(0, size).iterator();
                            while (((C18283i) it).f71138y) {
                                int iNextInt = ((AbstractC25243e0) it).nextInt();
                                C30898c option = (C30898c) list.get(iNextInt);
                                boolean z4 = iNextInt == size + (-1);
                                AbstractC22676k.m65750j(option, "option");
                                CompoundButton c16085a = c33518t.f139932w ? new C16085a(c33518t.getContext(), null) : new C34080b(c33518t.getContext(), null);
                                if (interfaceC24987cM73318b != null) {
                                    String str3 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                    if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
                                        c16085a.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                                    }
                                    String str4 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                                        c16085a.setTextColor(Color.parseColor(str4));
                                    }
                                }
                                c16085a.setId(View.generateViewId());
                                c16085a.setTag(option);
                                c16085a.setText(option.f127398x);
                                c16085a.setPadding(c33518t.f139929E, c16085a.getPaddingTop(), c16085a.getPaddingRight(), c16085a.getPaddingBottom());
                                c16085a.setMinimumHeight(c33518t.f139931G);
                                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                if (!z4) {
                                    layoutParams.bottomMargin = c33518t.f139935z;
                                }
                                layoutParams.leftMargin = c33518t.f139930F;
                                c16085a.setLayoutParams(layoutParams);
                                c33518t.f139934y.addView(c16085a);
                            }
                        }
                        return c33518t;
                }
            }
        });
        final int i24 = 0;
        this.f139903Q = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C33512n f139885x;

            {
                this.f139885x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        C33512n c33512n = this.f139885x;
                        C33506h c33506h = (C33506h) c33512n.f139897K.getValue();
                        C30900e c30900e = c33512n.f139894H;
                        if (c30900e == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        c33506h.getClass();
                        C33520v c33520v = new C33520v(c33506h.f139881a);
                        c33520v.m105891a(c30900e.f127429y);
                        return c33520v;
                    case 1:
                        InformationZoneView caInformationZone = this.f139885x.m105887B().f85985d;
                        AbstractC22676k.m65749i(caInformationZone, "caInformationZone");
                        return caInformationZone;
                    case 2:
                        C30900e c30900e2 = this.f139885x.f139894H;
                        if (c30900e2 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        EnumC30905j enumC30905j2 = c30900e2.f127403E;
                        String str = enumC30905j2 != null ? enumC30905j2.f127463w : null;
                        return str == null ? "" : str;
                    case 3:
                        C33512n c33512n2 = this.f139885x;
                        return new C32176r0(c33512n2.f139891E, c33512n2.f139905x, c33512n2.f139907z);
                    case 4:
                        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f139885x.requireActivity();
                        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                        return new C33506h(abstractActivityC1340r0RequireActivity);
                    case 5:
                        ChallengeZoneView caChallengeZone = this.f139885x.m105887B().f85984c;
                        AbstractC22676k.m65749i(caChallengeZone, "caChallengeZone");
                        return caChallengeZone;
                    case 6:
                        BrandZoneView caBrandZone = this.f139885x.m105887B().f85983b;
                        AbstractC22676k.m65749i(caBrandZone, "caBrandZone");
                        return caBrandZone;
                    case 7:
                        C33512n c33512n3 = this.f139885x;
                        C33506h c33506h2 = (C33506h) c33512n3.f139897K.getValue();
                        C30900e c30900e3 = c33512n3.f139894H;
                        if (c30900e3 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization2 = c33512n3.f139904w;
                        c33506h2.getClass();
                        AbstractC22676k.m65750j(uiCustomization2, "uiCustomization");
                        C33519u c33519u = new C33519u(c33506h2.f139881a);
                        c33519u.setTextEntryLabel(c30900e3.f127406H);
                        c33519u.setTextBoxCustomization(uiCustomization2.f97802y);
                        return c33519u;
                    default:
                        C33512n c33512n4 = this.f139885x;
                        C33506h c33506h3 = (C33506h) c33512n4.f139897K.getValue();
                        C30900e c30900e4 = c33512n4.f139894H;
                        if (c30900e4 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization3 = c33512n4.f139904w;
                        c33506h3.getClass();
                        AbstractC22676k.m65750j(uiCustomization3, "uiCustomization");
                        C33518t c33518t = new C33518t(c33506h3.f139881a, c30900e4.f127403E == EnumC30905j.SingleSelect);
                        String str2 = c30900e4.f127406H;
                        C24989e c24989e = uiCustomization3.f97801x;
                        ThreeDS2TextView threeDS2TextView = c33518t.f139933x;
                        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str2, c24989e);
                        }
                        List list = c30900e4.f127410L;
                        InterfaceC24987c interfaceC24987cM73318b = uiCustomization3.m73318b(EnumC24994j.f97805F);
                        if (list != null) {
                            int size = list.size();
                            Iterator it = AbstractC12889b.m36278i0(0, size).iterator();
                            while (((C18283i) it).f71138y) {
                                int iNextInt = ((AbstractC25243e0) it).nextInt();
                                C30898c option = (C30898c) list.get(iNextInt);
                                boolean z4 = iNextInt == size + (-1);
                                AbstractC22676k.m65750j(option, "option");
                                CompoundButton c16085a = c33518t.f139932w ? new C16085a(c33518t.getContext(), null) : new C34080b(c33518t.getContext(), null);
                                if (interfaceC24987cM73318b != null) {
                                    String str3 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                    if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
                                        c16085a.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                                    }
                                    String str4 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                                        c16085a.setTextColor(Color.parseColor(str4));
                                    }
                                }
                                c16085a.setId(View.generateViewId());
                                c16085a.setTag(option);
                                c16085a.setText(option.f127398x);
                                c16085a.setPadding(c33518t.f139929E, c16085a.getPaddingTop(), c16085a.getPaddingRight(), c16085a.getPaddingBottom());
                                c16085a.setMinimumHeight(c33518t.f139931G);
                                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                if (!z4) {
                                    layoutParams.bottomMargin = c33518t.f139935z;
                                }
                                layoutParams.leftMargin = c33518t.f139930F;
                                c16085a.setLayoutParams(layoutParams);
                                c33518t.f139934y.addView(c16085a);
                            }
                        }
                        return c33518t;
                }
            }
        });
        final int i25 = 1;
        AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C33512n f139885x;

            {
                this.f139885x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        C33512n c33512n = this.f139885x;
                        C33506h c33506h = (C33506h) c33512n.f139897K.getValue();
                        C30900e c30900e = c33512n.f139894H;
                        if (c30900e == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        c33506h.getClass();
                        C33520v c33520v = new C33520v(c33506h.f139881a);
                        c33520v.m105891a(c30900e.f127429y);
                        return c33520v;
                    case 1:
                        InformationZoneView caInformationZone = this.f139885x.m105887B().f85985d;
                        AbstractC22676k.m65749i(caInformationZone, "caInformationZone");
                        return caInformationZone;
                    case 2:
                        C30900e c30900e2 = this.f139885x.f139894H;
                        if (c30900e2 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        EnumC30905j enumC30905j2 = c30900e2.f127403E;
                        String str = enumC30905j2 != null ? enumC30905j2.f127463w : null;
                        return str == null ? "" : str;
                    case 3:
                        C33512n c33512n2 = this.f139885x;
                        return new C32176r0(c33512n2.f139891E, c33512n2.f139905x, c33512n2.f139907z);
                    case 4:
                        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f139885x.requireActivity();
                        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                        return new C33506h(abstractActivityC1340r0RequireActivity);
                    case 5:
                        ChallengeZoneView caChallengeZone = this.f139885x.m105887B().f85984c;
                        AbstractC22676k.m65749i(caChallengeZone, "caChallengeZone");
                        return caChallengeZone;
                    case 6:
                        BrandZoneView caBrandZone = this.f139885x.m105887B().f85983b;
                        AbstractC22676k.m65749i(caBrandZone, "caBrandZone");
                        return caBrandZone;
                    case 7:
                        C33512n c33512n3 = this.f139885x;
                        C33506h c33506h2 = (C33506h) c33512n3.f139897K.getValue();
                        C30900e c30900e3 = c33512n3.f139894H;
                        if (c30900e3 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization2 = c33512n3.f139904w;
                        c33506h2.getClass();
                        AbstractC22676k.m65750j(uiCustomization2, "uiCustomization");
                        C33519u c33519u = new C33519u(c33506h2.f139881a);
                        c33519u.setTextEntryLabel(c30900e3.f127406H);
                        c33519u.setTextBoxCustomization(uiCustomization2.f97802y);
                        return c33519u;
                    default:
                        C33512n c33512n4 = this.f139885x;
                        C33506h c33506h3 = (C33506h) c33512n4.f139897K.getValue();
                        C30900e c30900e4 = c33512n4.f139894H;
                        if (c30900e4 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        C24992h uiCustomization3 = c33512n4.f139904w;
                        c33506h3.getClass();
                        AbstractC22676k.m65750j(uiCustomization3, "uiCustomization");
                        C33518t c33518t = new C33518t(c33506h3.f139881a, c30900e4.f127403E == EnumC30905j.SingleSelect);
                        String str2 = c30900e4.f127406H;
                        C24989e c24989e = uiCustomization3.f97801x;
                        ThreeDS2TextView threeDS2TextView = c33518t.f139933x;
                        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str2, c24989e);
                        }
                        List list = c30900e4.f127410L;
                        InterfaceC24987c interfaceC24987cM73318b = uiCustomization3.m73318b(EnumC24994j.f97805F);
                        if (list != null) {
                            int size = list.size();
                            Iterator it = AbstractC12889b.m36278i0(0, size).iterator();
                            while (((C18283i) it).f71138y) {
                                int iNextInt = ((AbstractC25243e0) it).nextInt();
                                C30898c option = (C30898c) list.get(iNextInt);
                                boolean z4 = iNextInt == size + (-1);
                                AbstractC22676k.m65750j(option, "option");
                                CompoundButton c16085a = c33518t.f139932w ? new C16085a(c33518t.getContext(), null) : new C34080b(c33518t.getContext(), null);
                                if (interfaceC24987cM73318b != null) {
                                    String str3 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                    if (str3 != null && !AbstractC39414r.m125890i0(str3)) {
                                        c16085a.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str3)));
                                    }
                                    String str4 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                                        c16085a.setTextColor(Color.parseColor(str4));
                                    }
                                }
                                c16085a.setId(View.generateViewId());
                                c16085a.setTag(option);
                                c16085a.setText(option.f127398x);
                                c16085a.setPadding(c33518t.f139929E, c16085a.getPaddingTop(), c16085a.getPaddingRight(), c16085a.getPaddingBottom());
                                c16085a.setMinimumHeight(c33518t.f139931G);
                                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                                if (!z4) {
                                    layoutParams.bottomMargin = c33518t.f139935z;
                                }
                                layoutParams.leftMargin = c33518t.f139930F;
                                c16085a.setLayoutParams(layoutParams);
                                c33518t.f139934y.addView(c16085a);
                            }
                        }
                        return c33518t;
                }
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final String m105886A() {
        C30900e c30900e = this.f139894H;
        if (c30900e == null) {
            AbstractC22676k.m65757q("cresData");
            throw null;
        }
        EnumC30905j enumC30905j = c30900e.f127403E;
        int i13 = enumC30905j == null ? -1 : AbstractC33510l.f139888a[enumC30905j.ordinal()];
        if (i13 == 1) {
            return ((C33519u) this.f139901O.getValue()).getUserEntry();
        }
        if (i13 == 2 || i13 == 3) {
            return ((C33518t) this.f139902P.getValue()).getUserEntry();
        }
        return i13 != 4 ? "" : ((C33520v) this.f139903Q.getValue()).getUserEntry();
    }

    /* JADX INFO: renamed from: B */
    public final C22169b m105887B() {
        C22169b c22169b = this.f139898L;
        if (c22169b != null) {
            return c22169b;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: renamed from: C */
    public final C33505g m105888C() {
        return (C33505g) this.f139896J.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this.f139898L = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onPause() {
        super.onPause();
        C30900e c30900e = this.f139894H;
        if (c30900e != null) {
            if (c30900e != null) {
                C26702o c26702o = EnumC30905j.f127461y;
            } else {
                AbstractC22676k.m65757q("cresData");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onResume() {
        super.onResume();
        C30900e c30900e = this.f139894H;
        if (c30900e != null) {
            if (c30900e != null) {
                C26702o c26702o = EnumC30905j.f127461y;
            } else {
                AbstractC22676k.m65757q("cresData");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        C30900e c30900e = arguments != null ? (C30900e) AbstractC12350b.m34600u(arguments, C30900e.class, "arg_cres") : null;
        if (c30900e == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Could not start challenge screen. Challenge response data was null.");
            m105888C().f139867I.postValue(new C29939x(illegalArgumentException, this.f139892F, this.f139893G));
            return;
        }
        this.f139894H = c30900e;
        int i13 = R.id.ca_brand_zone;
        BrandZoneView brandZoneView = (BrandZoneView) AbstractC34235f.m108203J(view, R.id.ca_brand_zone);
        if (brandZoneView != null) {
            i13 = R.id.ca_challenge_zone;
            ChallengeZoneView challengeZoneView = (ChallengeZoneView) AbstractC34235f.m108203J(view, R.id.ca_challenge_zone);
            if (challengeZoneView != null) {
                i13 = R.id.ca_information_zone;
                InformationZoneView informationZoneView = (InformationZoneView) AbstractC34235f.m108203J(view, R.id.ca_information_zone);
                if (informationZoneView != null) {
                    this.f139898L = new C22169b((ScrollView) view, brandZoneView, challengeZoneView, informationZoneView);
                    final int i14 = 0;
                    m105888C().f139869K.observe(getViewLifecycleOwner(), new C33502d(new Function1(this) { // from class: t30.i

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C33512n f139883x;

                        {
                            this.f139883x = this;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str;
                            String str2;
                            Object c29941y;
                            switch (i14) {
                                case 0:
                                    String str3 = (String) obj;
                                    C33519u c33519u = (C33519u) this.f139883x.f139901O.getValue();
                                    AbstractC22676k.m65747g(str3);
                                    c33519u.setText(str3);
                                    return C23454a0.f92919a;
                                case 1:
                                    C33512n c33512n = this.f139883x;
                                    C30900e c30900e2 = c33512n.f139894H;
                                    if (c30900e2 == null) {
                                        AbstractC22676k.m65757q("cresData");
                                        throw null;
                                    }
                                    if (c30900e2.f127403E != EnumC30905j.Html || (str2 = c30900e2.f127430z) == null || AbstractC39414r.m125890i0(str2)) {
                                        C30900e c30900e3 = c33512n.f139894H;
                                        if (c30900e3 == null) {
                                            AbstractC22676k.m65757q("cresData");
                                            throw null;
                                        }
                                        if (c30900e3.f127403E == EnumC30905j.OutOfBand && (str = c30900e3.f127408J) != null && !AbstractC39414r.m125890i0(str)) {
                                            ChallengeZoneView challengeZoneViewM105890z = c33512n.m105890z();
                                            C30900e c30900e4 = c33512n.f139894H;
                                            if (c30900e4 == null) {
                                                AbstractC22676k.m65757q("cresData");
                                                throw null;
                                            }
                                            challengeZoneViewM105890z.m16878a(c30900e4.f127408J, c33512n.f139904w.f97801x);
                                            c33512n.m105890z().setInfoTextIndicator(0);
                                        }
                                    } else {
                                        C33520v c33520v = (C33520v) c33512n.f139903Q.getValue();
                                        C30900e c30900e5 = c33512n.f139894H;
                                        if (c30900e5 == null) {
                                            AbstractC22676k.m65757q("cresData");
                                            throw null;
                                        }
                                        c33520v.m105891a(c30900e5.f127430z);
                                    }
                                    return C23454a0.f92919a;
                                default:
                                    C33512n c33512n2 = this.f139883x;
                                    C29920n0 c29920n0 = c33512n2.f139893G;
                                    EnumC30905j enumC30905j = c33512n2.f139892F;
                                    C23470p c23470p = c33512n2.f139895I;
                                    AbstractC29931t abstractC29931t = (AbstractC29931t) obj;
                                    if (abstractC29931t != null) {
                                        C29936v0 c29936v0 = c33512n2.f139906y;
                                        if (abstractC29931t instanceof C29927r) {
                                            C29927r c29927r = (C29927r) abstractC29931t;
                                            C30897b c30897b = c29927r.f122227w;
                                            C30900e c30900e6 = c29927r.f122228x;
                                            if (c30900e6.f127404F) {
                                                c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                                if (c30897b.f127387G != null) {
                                                    c29941y = new C29933u((String) c23470p.getValue(), enumC30905j, c29920n0);
                                                } else {
                                                    String str4 = c30900e6.f127426b0;
                                                    if (str4 == null) {
                                                        str4 = "";
                                                    }
                                                    c29941y = "Y".equals(str4) ? new C29941y((String) c23470p.getValue(), enumC30905j, c29920n0) : new C29935v((String) c23470p.getValue(), enumC30905j, c29920n0);
                                                }
                                                c33512n2.m105888C().f139867I.postValue(c29941y);
                                            } else if (c30897b.f127387G != null) {
                                                c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                                c33512n2.m105888C().f139867I.postValue(new C29933u((String) c23470p.getValue(), enumC30905j, c29920n0));
                                            } else {
                                                c33512n2.m105888C().f139872N.setValue(c30900e6);
                                            }
                                        } else if (abstractC29931t instanceof C29923p) {
                                            C30902g c30902g = ((C29923p) abstractC29931t).f122223w;
                                            c33512n2.m105888C().f139867I.postValue(new C29937w(c30902g, enumC30905j, c29920n0));
                                            c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                            c29936v0.m91540a(c30902g);
                                        } else if (abstractC29931t instanceof C29925q) {
                                            c33512n2.m105888C().f139867I.postValue(new C29939x(((C29925q) abstractC29931t).f122225w, enumC30905j, c29920n0));
                                        } else {
                                            if (!(abstractC29931t instanceof C29929s)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            C30902g c30902g2 = ((C29929s) abstractC29931t).f122231w;
                                            c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                            c29936v0.m91540a(c30902g2);
                                            c33512n2.m105888C().f139867I.postValue(new C29942z((String) c23470p.getValue(), enumC30905j, c29920n0));
                                        }
                                    }
                                    return C23454a0.f92919a;
                            }
                        }
                    }, 1));
                    final int i15 = 1;
                    m105888C().f139864F.observe(getViewLifecycleOwner(), new C33502d(new Function1(this) { // from class: t30.i

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C33512n f139883x;

                        {
                            this.f139883x = this;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str;
                            String str2;
                            Object c29941y;
                            switch (i15) {
                                case 0:
                                    String str3 = (String) obj;
                                    C33519u c33519u = (C33519u) this.f139883x.f139901O.getValue();
                                    AbstractC22676k.m65747g(str3);
                                    c33519u.setText(str3);
                                    return C23454a0.f92919a;
                                case 1:
                                    C33512n c33512n = this.f139883x;
                                    C30900e c30900e2 = c33512n.f139894H;
                                    if (c30900e2 == null) {
                                        AbstractC22676k.m65757q("cresData");
                                        throw null;
                                    }
                                    if (c30900e2.f127403E != EnumC30905j.Html || (str2 = c30900e2.f127430z) == null || AbstractC39414r.m125890i0(str2)) {
                                        C30900e c30900e3 = c33512n.f139894H;
                                        if (c30900e3 == null) {
                                            AbstractC22676k.m65757q("cresData");
                                            throw null;
                                        }
                                        if (c30900e3.f127403E == EnumC30905j.OutOfBand && (str = c30900e3.f127408J) != null && !AbstractC39414r.m125890i0(str)) {
                                            ChallengeZoneView challengeZoneViewM105890z = c33512n.m105890z();
                                            C30900e c30900e4 = c33512n.f139894H;
                                            if (c30900e4 == null) {
                                                AbstractC22676k.m65757q("cresData");
                                                throw null;
                                            }
                                            challengeZoneViewM105890z.m16878a(c30900e4.f127408J, c33512n.f139904w.f97801x);
                                            c33512n.m105890z().setInfoTextIndicator(0);
                                        }
                                    } else {
                                        C33520v c33520v = (C33520v) c33512n.f139903Q.getValue();
                                        C30900e c30900e5 = c33512n.f139894H;
                                        if (c30900e5 == null) {
                                            AbstractC22676k.m65757q("cresData");
                                            throw null;
                                        }
                                        c33520v.m105891a(c30900e5.f127430z);
                                    }
                                    return C23454a0.f92919a;
                                default:
                                    C33512n c33512n2 = this.f139883x;
                                    C29920n0 c29920n0 = c33512n2.f139893G;
                                    EnumC30905j enumC30905j = c33512n2.f139892F;
                                    C23470p c23470p = c33512n2.f139895I;
                                    AbstractC29931t abstractC29931t = (AbstractC29931t) obj;
                                    if (abstractC29931t != null) {
                                        C29936v0 c29936v0 = c33512n2.f139906y;
                                        if (abstractC29931t instanceof C29927r) {
                                            C29927r c29927r = (C29927r) abstractC29931t;
                                            C30897b c30897b = c29927r.f122227w;
                                            C30900e c30900e6 = c29927r.f122228x;
                                            if (c30900e6.f127404F) {
                                                c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                                if (c30897b.f127387G != null) {
                                                    c29941y = new C29933u((String) c23470p.getValue(), enumC30905j, c29920n0);
                                                } else {
                                                    String str4 = c30900e6.f127426b0;
                                                    if (str4 == null) {
                                                        str4 = "";
                                                    }
                                                    c29941y = "Y".equals(str4) ? new C29941y((String) c23470p.getValue(), enumC30905j, c29920n0) : new C29935v((String) c23470p.getValue(), enumC30905j, c29920n0);
                                                }
                                                c33512n2.m105888C().f139867I.postValue(c29941y);
                                            } else if (c30897b.f127387G != null) {
                                                c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                                c33512n2.m105888C().f139867I.postValue(new C29933u((String) c23470p.getValue(), enumC30905j, c29920n0));
                                            } else {
                                                c33512n2.m105888C().f139872N.setValue(c30900e6);
                                            }
                                        } else if (abstractC29931t instanceof C29923p) {
                                            C30902g c30902g = ((C29923p) abstractC29931t).f122223w;
                                            c33512n2.m105888C().f139867I.postValue(new C29937w(c30902g, enumC30905j, c29920n0));
                                            c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                            c29936v0.m91540a(c30902g);
                                        } else if (abstractC29931t instanceof C29925q) {
                                            c33512n2.m105888C().f139867I.postValue(new C29939x(((C29925q) abstractC29931t).f122225w, enumC30905j, c29920n0));
                                        } else {
                                            if (!(abstractC29931t instanceof C29929s)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            C30902g c30902g2 = ((C29929s) abstractC29931t).f122231w;
                                            c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                            c29936v0.m91540a(c30902g2);
                                            c33512n2.m105888C().f139867I.postValue(new C29942z((String) c23470p.getValue(), enumC30905j, c29920n0));
                                        }
                                    }
                                    return C23454a0.f92919a;
                            }
                        }
                    }, 1));
                    final int i16 = 2;
                    m105888C().f139871M.observe(getViewLifecycleOwner(), new C33502d(new Function1(this) { // from class: t30.i

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C33512n f139883x;

                        {
                            this.f139883x = this;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str;
                            String str2;
                            Object c29941y;
                            switch (i16) {
                                case 0:
                                    String str3 = (String) obj;
                                    C33519u c33519u = (C33519u) this.f139883x.f139901O.getValue();
                                    AbstractC22676k.m65747g(str3);
                                    c33519u.setText(str3);
                                    return C23454a0.f92919a;
                                case 1:
                                    C33512n c33512n = this.f139883x;
                                    C30900e c30900e2 = c33512n.f139894H;
                                    if (c30900e2 == null) {
                                        AbstractC22676k.m65757q("cresData");
                                        throw null;
                                    }
                                    if (c30900e2.f127403E != EnumC30905j.Html || (str2 = c30900e2.f127430z) == null || AbstractC39414r.m125890i0(str2)) {
                                        C30900e c30900e3 = c33512n.f139894H;
                                        if (c30900e3 == null) {
                                            AbstractC22676k.m65757q("cresData");
                                            throw null;
                                        }
                                        if (c30900e3.f127403E == EnumC30905j.OutOfBand && (str = c30900e3.f127408J) != null && !AbstractC39414r.m125890i0(str)) {
                                            ChallengeZoneView challengeZoneViewM105890z = c33512n.m105890z();
                                            C30900e c30900e4 = c33512n.f139894H;
                                            if (c30900e4 == null) {
                                                AbstractC22676k.m65757q("cresData");
                                                throw null;
                                            }
                                            challengeZoneViewM105890z.m16878a(c30900e4.f127408J, c33512n.f139904w.f97801x);
                                            c33512n.m105890z().setInfoTextIndicator(0);
                                        }
                                    } else {
                                        C33520v c33520v = (C33520v) c33512n.f139903Q.getValue();
                                        C30900e c30900e5 = c33512n.f139894H;
                                        if (c30900e5 == null) {
                                            AbstractC22676k.m65757q("cresData");
                                            throw null;
                                        }
                                        c33520v.m105891a(c30900e5.f127430z);
                                    }
                                    return C23454a0.f92919a;
                                default:
                                    C33512n c33512n2 = this.f139883x;
                                    C29920n0 c29920n0 = c33512n2.f139893G;
                                    EnumC30905j enumC30905j = c33512n2.f139892F;
                                    C23470p c23470p = c33512n2.f139895I;
                                    AbstractC29931t abstractC29931t = (AbstractC29931t) obj;
                                    if (abstractC29931t != null) {
                                        C29936v0 c29936v0 = c33512n2.f139906y;
                                        if (abstractC29931t instanceof C29927r) {
                                            C29927r c29927r = (C29927r) abstractC29931t;
                                            C30897b c30897b = c29927r.f122227w;
                                            C30900e c30900e6 = c29927r.f122228x;
                                            if (c30900e6.f127404F) {
                                                c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                                if (c30897b.f127387G != null) {
                                                    c29941y = new C29933u((String) c23470p.getValue(), enumC30905j, c29920n0);
                                                } else {
                                                    String str4 = c30900e6.f127426b0;
                                                    if (str4 == null) {
                                                        str4 = "";
                                                    }
                                                    c29941y = "Y".equals(str4) ? new C29941y((String) c23470p.getValue(), enumC30905j, c29920n0) : new C29935v((String) c23470p.getValue(), enumC30905j, c29920n0);
                                                }
                                                c33512n2.m105888C().f139867I.postValue(c29941y);
                                            } else if (c30897b.f127387G != null) {
                                                c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                                c33512n2.m105888C().f139867I.postValue(new C29933u((String) c23470p.getValue(), enumC30905j, c29920n0));
                                            } else {
                                                c33512n2.m105888C().f139872N.setValue(c30900e6);
                                            }
                                        } else if (abstractC29931t instanceof C29923p) {
                                            C30902g c30902g = ((C29923p) abstractC29931t).f122223w;
                                            c33512n2.m105888C().f139867I.postValue(new C29937w(c30902g, enumC30905j, c29920n0));
                                            c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                            c29936v0.m91540a(c30902g);
                                        } else if (abstractC29931t instanceof C29925q) {
                                            c33512n2.m105888C().f139867I.postValue(new C29939x(((C29925q) abstractC29931t).f122225w, enumC30905j, c29920n0));
                                        } else {
                                            if (!(abstractC29931t instanceof C29929s)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            C30902g c30902g2 = ((C29929s) abstractC29931t).f122231w;
                                            c33512n2.m105888C().f139876R.cancel((CancellationException) null);
                                            c29936v0.m91540a(c30902g2);
                                            c33512n2.m105888C().f139867I.postValue(new C29942z((String) c23470p.getValue(), enumC30905j, c29920n0));
                                        }
                                    }
                                    return C23454a0.f92919a;
                            }
                        }
                    }, 1));
                    BrandZoneView brandZoneView2 = m105887B().f85983b;
                    ImageView issuerImageView = brandZoneView2.getIssuerImageView();
                    C30900e c30900e2 = this.f139894H;
                    if (c30900e2 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    C23465k c23465k = new C23465k(issuerImageView, c30900e2.f127413O);
                    ImageView paymentSystemImageView = brandZoneView2.getPaymentSystemImageView();
                    C30900e c30900e3 = this.f139894H;
                    if (c30900e3 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    for (Map.Entry entry : AbstractC25247g0.m73990Y(c23465k, new C23465k(paymentSystemImageView, c30900e3.f127419U)).entrySet()) {
                        AbstractC1640x1.m5044c(C30064k.f122676w, new C23187v0(m105888C(), (C30899d) entry.getValue(), getResources().getDisplayMetrics().densityDpi, null)).observe(getViewLifecycleOwner(), new C33502d(new C31703x((ImageView) entry.getKey(), 17), 1));
                    }
                    C33519u c33519u = (C33519u) this.f139901O.getValue();
                    C33518t c33518t = (C33518t) this.f139902P.getValue();
                    C33520v c33520v = (C33520v) this.f139903Q.getValue();
                    C30900e c30900e4 = this.f139894H;
                    if (c30900e4 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    EnumC30905j enumC30905j = c30900e4.f127403E;
                    int i17 = enumC30905j == null ? -1 : AbstractC33510l.f139888a[enumC30905j.ordinal()];
                    C24992h c24992h = this.f139904w;
                    if (i17 == 1) {
                        m105890z().setChallengeEntryView(c33519u);
                        ChallengeZoneView challengeZoneViewM105890z = m105890z();
                        C30900e c30900e5 = this.f139894H;
                        if (c30900e5 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        challengeZoneViewM105890z.m16879b(c30900e5.f127422X, c24992h.m73318b(EnumC24994j.f97807w));
                        ChallengeZoneView challengeZoneViewM105890z2 = m105890z();
                        C30900e c30900e6 = this.f139894H;
                        if (c30900e6 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        String str = c30900e6.f127420V;
                        InterfaceC24986b interfaceC24986bM73318b = c24992h.m73318b(EnumC24994j.f97804E);
                        ThreeDS2Button threeDS2Button = challengeZoneViewM105890z2.resendButton;
                        if (str != null && !AbstractC39414r.m125890i0(str)) {
                            threeDS2Button.setVisibility(0);
                            threeDS2Button.setText(str);
                            threeDS2Button.setButtonCustomization(interfaceC24986bM73318b);
                        }
                    } else if (i17 == 2 || i17 == 3) {
                        m105890z().setChallengeEntryView(c33518t);
                        ChallengeZoneView challengeZoneViewM105890z3 = m105890z();
                        C30900e c30900e7 = this.f139894H;
                        if (c30900e7 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        challengeZoneViewM105890z3.m16879b(c30900e7.f127422X, c24992h.m73318b(EnumC24994j.f97809y));
                    } else if (i17 == 4) {
                        m105890z().setChallengeEntryView(c33520v);
                        m105890z().infoHeader.setVisibility(8);
                        m105890z().m16878a(null, null);
                        m105890z().m16879b(null, null);
                        final int i18 = 0;
                        c33520v.setOnClickListener(new View.OnClickListener(this) { // from class: t30.k

                            /* JADX INFO: renamed from: x */
                            public final /* synthetic */ C33512n f139887x;

                            {
                                this.f139887x = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i18) {
                                    case 0:
                                        C33512n c33512n = this.f139887x;
                                        c33512n.m105888C().f139865G.postValue(c33512n.m105889y());
                                        return;
                                    case 1:
                                        C33512n c33512n2 = this.f139887x;
                                        c33512n2.m105888C().f139865G.postValue(c33512n2.m105889y());
                                        C30900e c30900e8 = c33512n2.f139894H;
                                        if (c30900e8 == null) {
                                            AbstractC22676k.m65757q("cresData");
                                            throw null;
                                        }
                                        EnumC30905j enumC30905j2 = c30900e8.f127403E;
                                        int i19 = enumC30905j2 == null ? -1 : AbstractC33510l.f139888a[enumC30905j2.ordinal()];
                                        if (i19 != -1 && i19 != 1 && i19 != 2 && i19 != 3 && i19 != 4 && i19 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return;
                                    default:
                                        this.f139887x.m105888C().m105885g(C29905g.f122177w);
                                        return;
                                }
                            }
                        });
                        ((BrandZoneView) this.f139900N.getValue()).setVisibility(8);
                    } else if (i17 == 5) {
                        ChallengeZoneView challengeZoneViewM105890z4 = m105890z();
                        C30900e c30900e8 = this.f139894H;
                        if (c30900e8 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        challengeZoneViewM105890z4.m16879b(c30900e8.f127418T, c24992h.m73318b(EnumC24994j.f97808x));
                    }
                    ChallengeZoneView challengeZoneViewM105890z5 = m105890z();
                    C30900e c30900e9 = this.f139894H;
                    if (c30900e9 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    String str2 = c30900e9.f127405G;
                    C24989e c24989e = c24992h.f97801x;
                    C24989e c24989e2 = c24992h.f97801x;
                    ThreeDS2HeaderTextView threeDS2HeaderTextView = challengeZoneViewM105890z5.infoHeader;
                    if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                        threeDS2HeaderTextView.setVisibility(8);
                    } else {
                        threeDS2HeaderTextView.mo16881d(str2, c24989e);
                    }
                    ChallengeZoneView challengeZoneViewM105890z6 = m105890z();
                    C30900e c30900e10 = this.f139894H;
                    if (c30900e10 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    challengeZoneViewM105890z6.m16878a(c30900e10.f127407I, c24989e);
                    C30900e c30900e11 = this.f139894H;
                    if (c30900e11 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    if (c30900e11.f127403E == EnumC30905j.OutOfBand) {
                        ChallengeZoneView challengeZoneViewM105890z7 = m105890z();
                        C30900e c30900e12 = this.f139894H;
                        if (c30900e12 == null) {
                            AbstractC22676k.m65757q("cresData");
                            throw null;
                        }
                        String str3 = c30900e12.f127406H;
                        ThreeDS2TextView threeDS2TextView = challengeZoneViewM105890z7.infoLabelView;
                        if (str3 == null || AbstractC39414r.m125890i0(str3)) {
                            threeDS2TextView.setVisibility(8);
                        } else {
                            threeDS2TextView.mo16881d(str3, c24989e);
                        }
                    }
                    ChallengeZoneView challengeZoneViewM105890z8 = m105890z();
                    C30900e c30900e13 = this.f139894H;
                    if (c30900e13 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    challengeZoneViewM105890z8.setInfoTextIndicator(c30900e13.f127409K ? R.drawable.stripe_3ds2_ic_indicator : 0);
                    ChallengeZoneView challengeZoneViewM105890z9 = m105890z();
                    C30900e c30900e14 = this.f139894H;
                    if (c30900e14 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    String str4 = c30900e14.f127423Y;
                    InterfaceC24987c interfaceC24987cM73318b = c24992h.m73318b(EnumC24994j.f97805F);
                    ThreeDS2TextView threeDS2TextView2 = challengeZoneViewM105890z9.whitelistingLabel;
                    RadioGroup radioGroup = challengeZoneViewM105890z9.whitelistRadioGroup;
                    if (str4 != null && !AbstractC39414r.m125890i0(str4)) {
                        threeDS2TextView2.mo16881d(str4, c24989e);
                        if (interfaceC24987cM73318b != null) {
                            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, radioGroup.getChildCount());
                            ArrayList<RadioButton> arrayList = new ArrayList();
                            Iterator it = c18284jM36278i0.iterator();
                            while (((C18283i) it).f71138y) {
                                View childAt = radioGroup.getChildAt(((AbstractC25243e0) it).nextInt());
                                RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
                                if (radioButton != null) {
                                    arrayList.add(radioButton);
                                }
                            }
                            for (RadioButton radioButton2 : arrayList) {
                                String str5 = ((C24988d) interfaceC24987cM73318b).f97786z;
                                if (str5 != null && !AbstractC39414r.m125890i0(str5)) {
                                    radioButton2.setButtonTintList(ColorStateList.valueOf(Color.parseColor(str5)));
                                }
                                String str6 = ((AbstractC24985a) interfaceC24987cM73318b).f97783x;
                                if (str6 != null && !AbstractC39414r.m125890i0(str6)) {
                                    radioButton2.setTextColor(Color.parseColor(str6));
                                }
                            }
                        }
                        threeDS2TextView2.setVisibility(0);
                        radioGroup.setVisibility(0);
                    }
                    final int i19 = 1;
                    m105890z().setSubmitButtonClickListener(new View.OnClickListener(this) { // from class: t30.k

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C33512n f139887x;

                        {
                            this.f139887x = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i19) {
                                case 0:
                                    C33512n c33512n = this.f139887x;
                                    c33512n.m105888C().f139865G.postValue(c33512n.m105889y());
                                    return;
                                case 1:
                                    C33512n c33512n2 = this.f139887x;
                                    c33512n2.m105888C().f139865G.postValue(c33512n2.m105889y());
                                    C30900e c30900e15 = c33512n2.f139894H;
                                    if (c30900e15 == null) {
                                        AbstractC22676k.m65757q("cresData");
                                        throw null;
                                    }
                                    EnumC30905j enumC30905j2 = c30900e15.f127403E;
                                    int i110 = enumC30905j2 == null ? -1 : AbstractC33510l.f139888a[enumC30905j2.ordinal()];
                                    if (i110 != -1 && i110 != 1 && i110 != 2 && i110 != 3 && i110 != 4 && i110 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return;
                                default:
                                    this.f139887x.m105888C().m105885g(C29905g.f122177w);
                                    return;
                            }
                        }
                    });
                    final int i24 = 2;
                    m105890z().setResendButtonClickListener(new View.OnClickListener(this) { // from class: t30.k

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C33512n f139887x;

                        {
                            this.f139887x = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    C33512n c33512n = this.f139887x;
                                    c33512n.m105888C().f139865G.postValue(c33512n.m105889y());
                                    return;
                                case 1:
                                    C33512n c33512n2 = this.f139887x;
                                    c33512n2.m105888C().f139865G.postValue(c33512n2.m105889y());
                                    C30900e c30900e15 = c33512n2.f139894H;
                                    if (c30900e15 == null) {
                                        AbstractC22676k.m65757q("cresData");
                                        throw null;
                                    }
                                    EnumC30905j enumC30905j2 = c30900e15.f127403E;
                                    int i110 = enumC30905j2 == null ? -1 : AbstractC33510l.f139888a[enumC30905j2.ordinal()];
                                    if (i110 != -1 && i110 != 1 && i110 != 2 && i110 != 3 && i110 != 4 && i110 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return;
                                default:
                                    this.f139887x.m105888C().m105885g(C29905g.f122177w);
                                    return;
                            }
                        }
                    });
                    InformationZoneView informationZoneView2 = m105887B().f85985d;
                    C30900e c30900e15 = this.f139894H;
                    if (c30900e15 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    String str7 = c30900e15.f127424Z;
                    String str8 = c30900e15.f127425a0;
                    if (str7 != null && !AbstractC39414r.m125890i0(str7)) {
                        informationZoneView2.whyLabel.mo16881d(str7, c24989e2);
                        informationZoneView2.whyContainer.setVisibility(0);
                        informationZoneView2.whyText.mo16881d(str8, c24989e2);
                    }
                    C30900e c30900e16 = this.f139894H;
                    if (c30900e16 == null) {
                        AbstractC22676k.m65757q("cresData");
                        throw null;
                    }
                    String str9 = c30900e16.f127411M;
                    String str10 = c30900e16.f127412N;
                    if (str9 != null && !AbstractC39414r.m125890i0(str9)) {
                        informationZoneView2.expandLabel.mo16881d(str9, c24989e2);
                        informationZoneView2.expandContainer.setVisibility(0);
                        informationZoneView2.expandText.mo16881d(str10, c24989e2);
                    }
                    String str11 = c24992h.f97799F;
                    if (str11 != null) {
                        informationZoneView2.setToggleColor$3ds2sdk_release(Color.parseColor(str11));
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC29907h m105889y() {
        C30900e c30900e = this.f139894H;
        if (c30900e == null) {
            AbstractC22676k.m65757q("cresData");
            throw null;
        }
        String str = c30900e.f127423Y;
        Boolean boolValueOf = (str == null || str.length() == 0) ? null : Boolean.valueOf(m105890z().getWhitelistingSelection$3ds2sdk_release());
        C30900e c30900e2 = this.f139894H;
        if (c30900e2 == null) {
            AbstractC22676k.m65757q("cresData");
            throw null;
        }
        EnumC30905j enumC30905j = c30900e2.f127403E;
        int i13 = enumC30905j == null ? -1 : AbstractC33510l.f139888a[enumC30905j.ordinal()];
        if (i13 != 4) {
            return i13 != 5 ? new C29901e(m105886A(), boolValueOf) : new C29903f(boolValueOf);
        }
        return new C29899d(m105886A());
    }

    /* JADX INFO: renamed from: z */
    public final ChallengeZoneView m105890z() {
        return (ChallengeZoneView) this.f139899M.getValue();
    }
}
