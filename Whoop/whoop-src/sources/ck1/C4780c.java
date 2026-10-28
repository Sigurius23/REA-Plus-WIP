package ck1;

import a33.C0352d;
import ab0.AbstractC0706a;
import ab0.C0707b;
import ac0.AbstractC0736a;
import ac0.C0737b;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import at1.C1985a;
import bt1.InterfaceC3621b;
import c20.C3873a;
import c93.InterfaceC4339a;
import ca0.AbstractC4359a;
import ca0.C4360b;
import cn0.AbstractC4848b;
import cn0.C4847a;
import com.stripe.android.customersheet.CustomerSheetActivity;
import com.whoop.add.activity.view.AddActivityFragment;
import com.whoop.advancedlabs.biomarkerdetails.view.BiomarkerDetailsFragment;
import com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment;
import com.whoop.bot.settings.CoachSettingsFragment;
import com.whoop.bot.settings.CoachSettingsViewEvent;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao_Impl;
import com.whoop.data.local.room.dao.wipeable.TeamsDao_Impl;
import com.whoop.healthmonitor.view.ComposableHealthMonitorFragment;
import com.whoop.healthmonitor.view.ComposableHealthReportFragment;
import com.whoop.labrador.fragment.LabradorAboutFragment;
import com.whoop.labrador.fragment.LabradorDetailsFragment;
import com.whoop.labrador.fragment.LabradorDeviceLocationFragment;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DrawerPresentation;
import com.whoop.p069ui.onboarding.dayzero.DayZeroSplashDialogFragment;
import com.whoop.profile.presentation.reducers.ProfileViewStateReducer;
import com.whoop.profile.view.ProfileHeaderKt;
import com.whoop.recommendationtile.domain.C9915f;
import com.whoop.recommendationtile.domain.InterfaceC9913d;
import com.whoop.settings.OnboardingStatusDebugFragment;
import com.whoop.settings.WakeUpAutopopHeightTesterFragment;
import com.whoop.weightlifting.StrengthTrainerDestination;
import cz.AbstractC11227t0;
import cz.C11215n0;
import cz.C11219p0;
import cz.C11221q0;
import cz.C11223r0;
import cz.C11225s0;
import d20.C11493i;
import d30.C11540i1;
import d30.C11566v;
import d80.AbstractC11769e;
import dj0.C12066b;
import dj0.InterfaceC12087w;
import dq1.C12291d;
import dz.C12455b;
import dz.EnumC12454a;
import dz.EnumC12463j;
import e41.AbstractC12702g;
import ec3.C13045h2;
import et1.C13598b;
import et1.InterfaceC13597a;
import it1.InterfaceC20927a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jb1.C21536b;
import kb1.C22325e;
import l83.C23454a0;
import m83.AbstractC25267u;
import o20.C27457b;
import p023ay.C2150x;
import p023ay.C2151y;
import p078d1.InputConnectionC11463p;
import p114eb.C12999y0;
import p132f0.C13825t;
import p163g1.EnumC15209z3;
import p208i2.C17914u0;
import p236j.AbstractC21065d;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p412q3.InterfaceC29874h;
import p499t9.C33623c0;
import p500tb.InterfaceC33687a;
import p537ux.C35329e0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import re.C31253a;
import s40.C32132a;
import u03.InterfaceC34393a;
import y00.EnumC38828f4;
import y00.EnumC38853i;
import zj1.AbstractC40770a;
import zj1.C40771b;

/* JADX INFO: renamed from: ck1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C4780c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19682w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f19683x;

    public /* synthetic */ C4780c(Object obj, int i13) {
        this.f19682w = i13;
        this.f19683x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ArrayList arrayList;
        int i13 = this.f19682w;
        boolean z4 = true;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f19683x;
        switch (i13) {
            case 0:
                return ComposableHealthMonitorFragment.m21588W((C40771b) obj2, (AbstractC40770a) obj);
            case 1:
                return ComposableHealthReportFragment.m21600I((ComposableHealthReportFragment) obj2, (File) obj);
            case 2:
                return AbstractC4848b.m15462c((C4847a) obj2, (C22325e) obj);
            case 3:
                return CoachSettingsFragment.onCreateView$lambda$0$1$0((CoachSettingsFragment) obj2, (CoachSettingsViewEvent) obj);
            case 4:
                return ((TeamInviteDao_Impl) obj2).lambda$getLiveTeamInviteData$3((InterfaceC33687a) obj);
            case 5:
                return ((TeamsDao_Impl) obj2).lambda$getDefaultImagesLiveData$4((InterfaceC33687a) obj);
            case 6:
                return ProfileViewStateReducer.sectionItemReducer$lambda$0((ProfileViewStateReducer) obj2, (C21536b) obj);
            case 7:
                return ProfileHeaderKt.ProfileHeader$lambda$2$0$0$0$0((C17914u0) obj2, (InterfaceC22129c) obj);
            case 8:
                return C9915f.m24330p((C9915f) obj2, (InterfaceC9913d) obj);
            case 9:
                return LabradorAboutFragment.m22439E((C1985a) obj2, (InterfaceC3621b.c) obj);
            case 10:
                return LabradorDetailsFragment.m22472e0((C13598b) obj2, (InterfaceC13597a) obj);
            case 11:
                return LabradorDeviceLocationFragment.m22486F((LabradorDeviceLocationFragment) obj2, (InterfaceC20927a.f) obj);
            case 12:
                return StrengthTrainerDestination.C10741d.m28057o((StrengthTrainerDestination) obj2, (C12999y0) obj);
            case 13:
                CustomerSheetActivity customerSheetActivity = (CustomerSheetActivity) obj2;
                EnumC15209z3 it = (EnumC15209z3) obj;
                AbstractC22676k.m65750j(it, "it");
                if (it == EnumC15209z3.f57106w) {
                    int i14 = CustomerSheetActivity.f22164z;
                    C11215n0 c11215n0M16837p = customerSheetActivity.m16837p();
                    AbstractC11227t0 abstractC11227t0 = (AbstractC11227t0) ((InterfaceC4339a) c11215n0M16837p.f35964M.f104635y).invoke();
                    abstractC11227t0.getClass();
                    if (!(abstractC11227t0 instanceof C11221q0) && !(abstractC11227t0 instanceof C11225s0) && !(abstractC11227t0 instanceof C11223r0)) {
                        if (!(abstractC11227t0 instanceof C11219p0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C11219p0 c11219p0 = (C11219p0) abstractC11227t0;
                        String str = c11219p0.f35989c;
                        C33623c0 c33623c0 = EnumC38828f4.f167088G;
                        if (str.equals("us_bank_account") && c11219p0.f36007u != null) {
                            C13045h2 c13045h2 = c11215n0M16837p.f35963L;
                            do {
                                value = c13045h2.getValue();
                                List<Object> list = (List) value;
                                arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                                for (Object objM30345c : list) {
                                    if (objM30345c instanceof C11219p0) {
                                        objM30345c = C11219p0.m30345c((C11219p0) objM30345c, null, null, null, null, null, false, false, null, null, false, null, null, false, true, null, 917503);
                                    }
                                    arrayList.add(objM30345c);
                                }
                            } while (!c13045h2.m36569i(value, arrayList));
                            z4 = false;
                        }
                    }
                }
                return Boolean.valueOf(z4);
            case 14:
                EnumC38853i brand = (EnumC38853i) obj;
                AbstractC22676k.m65750j(brand, "brand");
                C0352d c0352d = ((C11215n0) obj2).f35956E;
                EnumC12463j[] enumC12463jArr = EnumC12463j.f42536w;
                c0352d.getClass();
                c0352d.m941m(new C12455b(EnumC12454a.Edit, brand));
                return c23454a0;
            case 15:
                ((InputConnectionC11463p) obj2).m30758a((InterfaceC29874h) obj);
                return c23454a0;
            case 16:
                C32132a host = (C32132a) obj;
                AbstractC22676k.m65750j(host, "host");
                AbstractC21065d abstractC21065d = ((C11493i) obj2).f36955e;
                return abstractC21065d != null ? new C2151y(abstractC21065d, 1) : new C2150x(host, 1);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((C11566v) obj2).m30998a(new C11540i1((C27457b) obj));
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC11769e.m31524p((Modifier) obj2, (Modifier) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BiomarkerDetailsFragment.m17295U((C0707b) obj2, (AbstractC0706a) obj);
            case 20:
                return EditTestDetailsFragment.m17435O((C0737b) obj2, (AbstractC0736a) obj);
            case 21:
                return C12066b.m33293n((InterfaceC12087w.a) obj2, (C31253a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C12066b.m33294o((InterfaceC12087w.b) obj2, (C31253a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return DayZeroSplashDialogFragment.m27356F((DayZeroSplashDialogFragment) obj2, (C9598e) obj);
            case 24:
                return ((C12291d) obj2).m34217m((InterfaceC33687a) obj);
            case 25:
                C32132a host2 = (C32132a) obj;
                AbstractC22676k.m65750j(host2, "host");
                AbstractC21065d abstractC21065d2 = ((C3873a) ((InterfaceC34393a) obj2).get()).f15853e;
                return abstractC21065d2 != null ? new C35329e0(abstractC21065d2) : new C35329e0(host2);
            case 26:
                return AbstractC12702g.m35532x((C13825t) obj2, (InterfaceC22131e) obj);
            case 27:
                return AddActivityFragment.m17241Z((C4360b) obj2, (AbstractC4359a) obj);
            case 28:
                return OnboardingStatusDebugFragment.m25073M((OnboardingStatusDebugFragment) obj2, (Function1) obj);
            default:
                return WakeUpAutopopHeightTesterFragment.m25304E((WakeUpAutopopHeightTesterFragment) obj2, (DrawerPresentation) obj);
        }
    }
}
