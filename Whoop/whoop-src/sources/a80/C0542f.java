package a80;

import ak1.C0951d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import bf0.AbstractC3199k;
import bg0.AbstractC3224f;
import c03.C3815c;
import c42.C4180q;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cj1.C4753i;
import ck1.AbstractC4786i;
import com.stripe.android.paymentsheet.p055ui.PrimaryButton;
import com.whoop.android.R;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import com.whoop.homecustomization.view.legacy.HomeCustomizationFragment;
import com.whoop.profile.presentation.ProfileViewState;
import com.whoop.profile.view.ProfileScreenContentKt;
import com.whoop.profile.view.ProfileScreenKt;
import com.whoop.weightlifting.AbstractC10757a;
import com.whoop.weightlifting.StrengthTrainerDestination;
import com.whoop.whooplabs.feature.navigation.C10839b;
import cp1.C11021h;
import d40.AbstractC11673r;
import d40.C11665j;
import d40.C11666k;
import d40.C11671p;
import d42.AbstractC11700p;
import dv2.InterfaceC12394e;
import e30.AbstractC12605c;
import ej1.AbstractC13250m;
import ep1.AbstractC13414i;
import ev2.AbstractC13712u;
import fm1.C14597a;
import fm1.C14599c;
import fm1.C14600d;
import g22.InterfaceC15282b;
import gv2.C16246d;
import hv2.AbstractC17687i;
import i22.AbstractC18015c;
import ii2.AbstractC18572a;
import in1.InterfaceC18724d;
import java.util.List;
import jg2.AbstractC21671c;
import jg2.C21670b;
import ji2.C21733l;
import jx2.AbstractC22042f;
import kd1.AbstractC22403o;
import kh0.AbstractC22478e;
import kotlin.AbstractC2016m;
import ln1.AbstractC24539q;
import m01.AbstractC24876d;
import m20.C24940a;
import nk1.AbstractC26797c;
import nk1.C26798d;
import p040c0.InterfaceC3747i0;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p163g1.C15199y3;
import p181h2.C16617b;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p329n0.C26068u;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p507tx.AbstractC34235f;
import p668z1.C39967p;
import p700bd1.C3104v;
import p700bd1.C3105w;
import p710im1.AbstractC18657a1;
import p710im1.AbstractC18661c;
import p710im1.C18665d0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24680l;
import p720m91.InterfaceC25312u;
import y70.C39267c;
import ys2.AbstractC39758e;
import ze0.AbstractC40584c;
import zf0.C40611c;
import zw2.C41178b;

/* JADX INFO: renamed from: a80.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0542f implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1869w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1870x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f1871y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f1872z;

    public /* synthetic */ C0542f(Object obj, Object obj2, Object obj3, int i13) {
        this.f1869w = i13;
        this.f1871y = obj;
        this.f1872z = obj2;
        this.f1870x = obj3;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1869w) {
            case 0:
                return AbstractC0544h.m1335f((C39267c.c) this.f1871y, (C39267c) this.f1872z, (Function1) this.f1870x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return AbstractC2016m.m6227N((AbstractC39758e) this.f1871y, (Function1) this.f1870x, (Function1) this.f1872z, (C12982q) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                Context context = (Context) this.f1871y;
                AbstractC12605c abstractC12605c = (AbstractC12605c) this.f1872z;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f1870x;
                LayoutInflater inflater = (LayoutInflater) obj;
                ViewGroup parent = (ViewGroup) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                AbstractC22676k.m65750j(inflater, "inflater");
                AbstractC22676k.m65750j(parent, "parent");
                View viewInflate = inflater.inflate(R.layout.stripe_fragment_primary_button_container, parent, false);
                if (zBooleanValue) {
                    parent.addView(viewInflate);
                }
                PrimaryButton primaryButton = (PrimaryButton) AbstractC34235f.m108203J(viewInflate, R.id.primary_button);
                if (primaryButton == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.primary_button)));
                }
                C24940a c24940a = new C24940a((FrameLayout) viewInflate, primaryButton);
                interfaceC28601c1.setValue(primaryButton);
                C11666k primaryButtonStyle = C11671p.f37684e;
                Integer num = AbstractC11673r.m31086o(context) ? abstractC12605c.f43025w.f64405H.f64081E.f64447x.f64477w : abstractC12605c.f43025w.f64405H.f64081E.f64446w.f64477w;
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(num != null ? num.intValue() : AbstractC11673r.m31074c(C11671p.f37684e, context));
                AbstractC22676k.m65750j(primaryButtonStyle, "primaryButtonStyle");
                Context context2 = primaryButton.getContext();
                AbstractC22676k.m65749i(context2, "getContext(...)");
                C11665j c11665j = primaryButtonStyle.f37661c;
                primaryButton.f22404J = AbstractC11673r.m31073b(context2, c11665j.f37656a);
                Context context3 = primaryButton.getContext();
                AbstractC22676k.m65749i(context3, "getContext(...)");
                primaryButton.f22405K = AbstractC11673r.m31073b(context3, c11665j.f37657b);
                Context context4 = primaryButton.getContext();
                AbstractC22676k.m65749i(context4, "getContext(...)");
                primaryButton.f22406L = AbstractC11673r.m31076e(primaryButtonStyle, context4);
                ImageView imageView = primaryButton.viewBinding.f97657e;
                Context context5 = primaryButton.getContext();
                AbstractC22676k.m65749i(context5, "getContext(...)");
                imageView.setImageTintList(ColorStateList.valueOf(AbstractC11673r.m31079h(primaryButtonStyle, context5)));
                primaryButton.defaultTintList = colorStateListValueOf;
                primaryButton.setBackgroundTintList(colorStateListValueOf);
                Context context6 = primaryButton.getContext();
                AbstractC22676k.m65749i(context6, "getContext(...)");
                primaryButton.f22407M = AbstractC11673r.m31085n(primaryButtonStyle, context6);
                Context context7 = primaryButton.getContext();
                AbstractC22676k.m65749i(context7, "getContext(...)");
                primaryButton.f22408N = AbstractC11673r.m31080i(primaryButtonStyle, context7);
                ViewGroup.LayoutParams layoutParams = primaryButton.getLayoutParams();
                if (layoutParams != null) {
                    Context context8 = primaryButton.getContext();
                    AbstractC22676k.m65749i(context8, "getContext(...)");
                    layoutParams.height = (int) AbstractC11673r.m31073b(context8, c11665j.f37658c);
                }
                return c24940a;
            case 3:
                return C3104v.m8914e((InterfaceC28601c1) this.f1871y, (C3105w) this.f1872z, (C3104v) this.f1870x, (InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return AbstractC3199k.m9201D((AbstractC40584c.e) this.f1871y, (InterfaceC2994c0) this.f1872z, (C15199y3) this.f1870x, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return AbstractC3224f.m9284f((C40611c.c) this.f1871y, (C40611c) this.f1872z, (Function1) this.f1870x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return AbstractC4786i.m15077G((C0951d.b) this.f1871y, (Function1) this.f1870x, (Function1) this.f1872z, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return ProfileScreenContentKt.ProfileContentArea$lambda$4$0$0((ProfileViewState.Metadata) this.f1871y, (Function1) this.f1870x, (InterfaceC4339a) this.f1872z, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return ProfileScreenKt.ProfileScreen$lambda$17((ProfileViewState) this.f1871y, (Function1) this.f1870x, (InterfaceC28601c1) this.f1872z, (InterfaceC4339a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return AbstractC10757a.m28140D((C12991u0) this.f1871y, (AbstractC12939a0) this.f1872z, (InterfaceC28670t2) this.f1870x, (StrengthTrainerDestination.C10745h.a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return AbstractC10757a.m28178z((String) this.f1871y, (String) this.f1872z, (C12991u0) this.f1870x, (C12982q) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                return AbstractC11700p.m31243R((C4180q) this.f1871y, (Function1) this.f1870x, (Function1) this.f1872z, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return AbstractC13250m.m37234f((C4753i.b) this.f1871y, (C4753i.d) this.f1872z, (Function1) this.f1870x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                return AbstractC13414i.m37973p((C11021h) this.f1871y, (C39967p) this.f1872z, (InterfaceC28593a1) this.f1870x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 14:
                return AbstractC13712u.m38790g0((InterfaceC25312u) this.f1871y, (Function1) this.f1870x, (InterfaceC12394e.b) this.f1872z, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 15:
                return AbstractC17687i.m50511n0((C16246d) this.f1871y, (Function1) this.f1870x, (InterfaceC28601c1) this.f1872z, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 16:
                return AbstractC18015c.m51738S((InterfaceC15282b.c) this.f1871y, (InterfaceC4351m) this.f1872z, (InterfaceC4339a) this.f1870x, (InterfaceC23004v) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18572a.m53793g((C21733l) this.f1871y, (Function1) this.f1870x, (InterfaceC4339a) this.f1872z, (C12982q) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC18661c.m54137j((List) this.f1871y, (C18665d0) this.f1872z, (C14600d) this.f1870x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18657a1.m54102p((C18665d0) this.f1871y, (C3815c) this.f1872z, (Function1) this.f1870x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 20:
                return AbstractC18657a1.m54104r((C18665d0) this.f1871y, (C14597a) this.f1872z, (C14599c) this.f1870x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 21:
                return AbstractC21671c.m60950i((C21670b) this.f1871y, (InterfaceC28601c1) this.f1872z, (Function1) this.f1870x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22042f.m63030K((FeatureFlagChecker) this.f1871y, (C41178b) this.f1872z, (C10839b) this.f1870x, (C12982q) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC22478e.m64914g((AbstractC22403o) this.f1871y, (InterfaceC4339a) this.f1872z, (String) this.f1870x, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 24:
                return AbstractC22478e.m64915h((InterfaceC28601c1) this.f1871y, (InterfaceC28601c1) this.f1872z, (InterfaceC28601c1) this.f1870x, ((Float) obj).floatValue(), (C16617b) obj2, ((Float) obj3).floatValue());
            case 25:
                return AbstractC24539q.m71502M((InterfaceC18724d) this.f1871y, (Function1) this.f1870x, (InterfaceC4339a) this.f1872z, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 26:
                return AbstractC24680l.m72094E((TextResource) this.f1871y, (TextResource) this.f1872z, (InterfaceC4339a) this.f1870x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 27:
                return AbstractC24876d.m72910F((InterfaceC25312u) this.f1871y, (Function1) this.f1870x, (InterfaceC28601c1) this.f1872z, (InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 28:
                return HomeCustomizationFragment.m21916J((C26068u) this.f1871y, (HomeCustomizationFragment) this.f1872z, (InterfaceC28670t2) this.f1870x, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC26797c.m79864u((String) this.f1871y, (C26798d) this.f1872z, (Function1) this.f1870x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ C0542f(Object obj, Function1 function1, Object obj2, int i13) {
        this.f1869w = i13;
        this.f1871y = obj;
        this.f1870x = function1;
        this.f1872z = obj2;
    }
}
