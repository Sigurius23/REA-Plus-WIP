package ej1;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cj1.C4760p;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.access.reconfirmlabs.view.ReconfirmLabsFragment;
import com.whoop.changepassword.view.reset.PasswordResetFragment;
import com.whoop.health.view.HealthTabFragment;
import com.whoop.hormonalinsights.onboarding.view.MciOnboardingFragment;
import com.whoop.limitedtimeoffer.view.LimitedTimeOfferFragment;
import com.whoop.nativestore.pdp.sizeguide.view.SizeGuideDialogFragment;
import com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment;
import com.whoop.profile.view.edit.C9790n;
import com.whoop.referafriend.ReferAFriendFragment;
import com.whoop.settings.debug.AiChatJournalEntryWidgetDebugFragment;
import com.whoop.settings.debug.AiChatTalkTextCardDebugFragment;
import com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment;
import cv1.C11147d;
import cz.C11215n0;
import ev1.AbstractC13691j;
import f01.AbstractC13852d0;
import f01.AbstractC13861g0;
import f01.AbstractC13899t;
import f01.AbstractC13901t1;
import f01.C13855e0;
import f01.C13864h0;
import f01.C13902u;
import f01.C13904u1;
import fj1.AbstractC14534e;
import fj1.AbstractC14541l;
import fj1.C14542m;
import fo2.AbstractC14665c;
import fo2.C14666d;
import ft1.InterfaceC14770c;
import g40.AbstractC15380k2;
import g40.C15320a2;
import g40.C15454z1;
import h20.C16724r0;
import h20.C16776z4;
import h21.AbstractC16779c;
import h41.AbstractC16848b;
import h41.C16849c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kd1.AbstractC22403o;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import p108e4.AbstractC12667a;
import p133f1.AbstractC13969q;
import p133f1.C13954l;
import p133f1.C13988w0;
import p163g1.C15059k3;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p294l3.C23254g;
import p294l3.C23283u0;
import p390p1.AbstractC28683x;
import p568w0.C36625a;
import p635y2.InterfaceC39147y;
import p636y3.C39169a;
import p636y3.C39180l;
import p707gt1.AbstractC16192f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ej1.h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13242h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45875w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f45876x;

    public /* synthetic */ C13242h(C11215n0 c11215n0, int i13) {
        this.f45875w = 22;
        this.f45876x = c11215n0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        boolean z4;
        switch (this.f45875w) {
            case 0:
                return HealthTabFragment.m21516F((HealthTabFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC13245i0.m37212e((C13247j0) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return PasswordResetFragment.m18438N((PasswordResetFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return MciOnboardingFragment.m22078O((MciOnboardingFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return LimitedTimeOfferFragment.m22559J((LimitedTimeOfferFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return AbstractC13691j.m38667f((C11147d) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC13899t.m39544i((C13902u) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC13852d0.m39237h((C13855e0) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC13861g0.m39295e((C13864h0) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AbstractC13901t1.m39574f((C13904u1) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return SizeGuideDialogFragment.m22986K((SizeGuideDialogFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                C13988w0 c13988w0 = (C13988w0) this.f45876x;
                C36625a c36625a = (C36625a) obj;
                Context context = (Context) obj2;
                C23465k c23465kM39800e = c13988w0.m39800e();
                AbstractC13969q.m39766a(c36625a, context, false, c23465kM39800e != null ? (C23254g) c23465kM39800e.f92937w : null, c23465kM39800e != null ? (C23283u0) c23465kM39800e.f92938x : null, c13988w0.f49922w, new C9790n(29, c13988w0, context));
                return C23454a0.f92919a;
            case 12:
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f45876x;
                InterfaceC39147y interfaceC39147yM39736d = ((C13954l) obj).m39736d();
                InterfaceC39147y interfaceC39147yM39736d2 = ((C13954l) obj2).m39736d();
                long jMo3537k = interfaceC39147yM39736d != null ? interfaceC39147y.mo3537k(interfaceC39147yM39736d, 0L) : 0L;
                long jMo3537k2 = interfaceC39147yM39736d2 != null ? interfaceC39147y.mo3537k(interfaceC39147yM39736d2, 0L) : 0L;
                int i13 = (int) (jMo3537k & 4294967295L);
                int i14 = (int) (4294967295L & jMo3537k2);
                return Integer.valueOf(Float.intBitsToFloat(i13) == Float.intBitsToFloat(i14) ? AbstractC30060g.m92127q(Float.valueOf(Float.intBitsToFloat((int) (jMo3537k >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jMo3537k2 >> 32)))) : AbstractC30060g.m92127q(Float.valueOf(Float.intBitsToFloat(i13)), Float.valueOf(Float.intBitsToFloat(i14))));
            case 13:
                return AbstractC14534e.m41498j((C4760p) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return AbstractC14541l.m41523i((C14542m) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AbstractC14665c.m41895i((C14666d) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                C15199y3 c15199y3 = (C15199y3) this.f45876x;
                C39180l c39180l = (C39180l) obj;
                float fM124764h = C39169a.m124764h(((C39169a) obj2).f168407a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(EnumC15209z3.f57106w, Float.valueOf(fM124764h));
                float f13 = fM124764h / 2.0f;
                if (!c15199y3.f57059a && ((int) (c39180l.f168422a & 4294967295L)) > f13) {
                    linkedHashMap.put(EnumC15209z3.f57108y, Float.valueOf(f13));
                }
                int i15 = (int) (c39180l.f168422a & 4294967295L);
                if (i15 != 0) {
                    linkedHashMap.put(EnumC15209z3.f57107x, Float.valueOf(Math.max(0.0f, fM124764h - i15)));
                }
                C15059k3 c15059k3 = new C15059k3(linkedHashMap);
                boolean z13 = c15199y3.f57060b.m43070e().f56384a.size() > 0;
                EnumC15209z3 enumC15209z3M43221b = c15199y3.m43221b();
                if (z13 || !linkedHashMap.containsKey(enumC15209z3M43221b)) {
                    int iOrdinal = c15199y3.m43222c().ordinal();
                    if (iOrdinal == 0) {
                        enumC15209z3M43221b = EnumC15209z3.f57106w;
                    } else {
                        if (iOrdinal != 1 && iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EnumC15209z3 enumC15209z3 = EnumC15209z3.f57108y;
                        if (!linkedHashMap.containsKey(enumC15209z3)) {
                            enumC15209z3 = EnumC15209z3.f57107x;
                            if (!linkedHashMap.containsKey(enumC15209z3)) {
                                enumC15209z3 = EnumC15209z3.f57106w;
                            }
                        }
                        enumC15209z3M43221b = enumC15209z3;
                    }
                }
                return new C23465k(c15059k3, enumC15209z3M43221b);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C15454z1 c15454z1 = (C15454z1) this.f45876x;
                String value = (String) obj;
                Integer num = (Integer) obj2;
                AbstractC22676k.m65750j(value, "value");
                return new C23465k(value, Boolean.valueOf(value.length() >= (num != null ? num.intValue() : 0) || c15454z1.f58048c));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C15320a2 c15320a2 = (C15320a2) this.f45876x;
                C23328a phoneEntry = (C23328a) obj;
                AbstractC15380k2 formatter = (AbstractC15380k2) obj2;
                AbstractC22676k.m65750j(phoneEntry, "phoneEntry");
                AbstractC22676k.m65750j(formatter, "formatter");
                C23465k c23465k = new C23465k(c15320a2.f57556b, phoneEntry);
                IdentifierSpec.Companion.getClass();
                return AbstractC37056f.m118959K(c23465k, new C23465k(IdentifierSpec.PhoneNumberCountry, new C23328a(c15320a2.f57557c.m43614u(), true)));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ReferAFriendFragment.m24365K((ReferAFriendFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return UniversalCartDialogFragment.m27675X((UniversalCartDialogFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return AbstractC16192f.m45768d((InterfaceC14770c.g) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                AbstractC12667a.m35453e((C11215n0) this.f45876x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ProductDescriptionPageFragment.m23007R((ProductDescriptionPageFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                C16776z4 c16776z4 = (C16776z4) this.f45876x;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                List items = (List) obj2;
                AbstractC22676k.m65750j(items, "items");
                if (zBooleanValue) {
                    z4 = true;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : items) {
                        if (obj3 instanceof C16724r0) {
                            arrayList.add(obj3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C16724r0) it.next()).f64265a.m47246d(((Boolean) ((InterfaceC4339a) c16776z4.f64490i.f64026g.f104635y).invoke()).booleanValue())) {
                                    z4 = true;
                                }
                            }
                        }
                    }
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 25:
                return AbstractC16779c.m47304l((AbstractC22403o) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC16848b.m47459k((C16849c) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return ReconfirmLabsFragment.m16983M((ReconfirmLabsFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return AiChatJournalEntryWidgetDebugFragment.m25357A((AiChatJournalEntryWidgetDebugFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AiChatTalkTextCardDebugFragment.m25363C((AiChatTalkTextCardDebugFragment) this.f45876x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C13242h(Object obj, int i13) {
        this.f45875w = i13;
        this.f45876x = obj;
    }
}
