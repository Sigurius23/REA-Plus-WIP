package aq0;

import android.net.Uri;
import android.os.Build;
import android.view.Window;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1640x1;
import b20.C2326f;
import b20.EnumC2323c;
import b20.EnumC2325e;
import bc3.AbstractC3006f0;
import com.google.android.gms.common.api.Status;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment;
import com.whoop.archv2.feature.view.GenericFragment;
import com.whoop.community.CommunityLandingHostFragment;
import com.whoop.community.CommunityManageTeamFragment;
import com.whoop.community.presentation.teams.C6375b;
import com.whoop.education.view.EducationFragment;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity;
import com.whoop.profile.view.edit.C9790n;
import com.whoop.stress.view.StressSessionFragment;
import com.whoop.whoopaction.view.DownloadedFileExportFragment;
import ec3.C13045h2;
import eg.C13161j;
import g20.C15271q;
import g40.C15437w;
import g40.C15442x;
import h20.C16760x0;
import i20.AbstractC17941f0;
import i20.AbstractC17960l1;
import i20.C17935d0;
import i20.C17938e0;
import i20.C17944g0;
import i20.C17947h0;
import i20.C17966n1;
import i20.C17988y0;
import i20.InterfaceC17950i0;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryDestination;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.camera.internal.CameraAttachmentFragment;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.FileAttachmentFragment;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25247g0;
import n43.C26285a;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p023ay.C2143q;
import p023ay.C2144r;
import p023ay.InterfaceC2145s;
import p096dq.C12268l;
import p153fq.C14681a;
import p236j.C21062a;
import p236j.InterfaceC21063b;
import p266jz.AbstractC22067o;
import p479s4.AbstractC32123d;
import p499t9.C33647p;
import p550vd.AbstractC35903f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29718h0;
import q30.AbstractC29894a0;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import s40.C32132a;
import sz.C33126d0;
import sz.C33130f0;
import sz.C33141l;
import sz.C33145n;
import sz.C33150p0;
import sz.C33161z;
import v10.C35526b;
import wb3.AbstractC37056f;
import y00.C38809d5;
import y10.C39042d;
import z10.AbstractC39995r;
import z10.C39984g;
import z10.C39985h;
import z10.C39986i;
import z10.C39989l;
import z10.C39991n;
import z10.C39992o;
import z10.C39993p;
import z10.C39994q;
import za2.C40234j;

/* JADX INFO: renamed from: aq0.o */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C1904o implements InterfaceC21063b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7464w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f7465x;

    public /* synthetic */ C1904o(Object obj, int i13) {
        this.f7464w = i13;
        this.f7465x = obj;
    }

    @Override // p236j.InterfaceC21063b
    /* JADX INFO: renamed from: a */
    public final void mo364a(Object obj) throws Throwable {
        C35526b c35526b;
        C17966n1 c17966n1;
        InterfaceC17950i0 c17947h0;
        Object c15442x;
        C13161j c13161j;
        Window window;
        Object c39986i;
        int i13 = this.f7464w;
        int i14 = 2;
        Object obj2 = this.f7465x;
        switch (i13) {
            case 0:
                C1906q.m5822v2((C1906q) obj2, (List) obj);
                return;
            case 1:
                C15271q c15271q = (C15271q) obj2;
                InterfaceC2145s result = (InterfaceC2145s) obj;
                AbstractC22676k.m65750j(result, "result");
                if (result instanceof C2143q) {
                    int i15 = StripeException.f22154E;
                    c35526b = new C35526b((String) null, 2, AbstractC32123d.m100024d(((C2143q) result).f8539w), false, (String) null, (String) null, 121);
                } else {
                    if (!(result instanceof C2144r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c35526b = new C35526b(((C2144r) result).f8540w, 0, (StripeException) null, false, (String) null, (String) null, 126);
                }
                c15271q.mo364a(c35526b);
                return;
            case 2:
                AbstractC29894a0 it = (AbstractC29894a0) obj;
                int i16 = Stripe3ds2TransactionActivity.f22356z;
                AbstractC22676k.m65750j(it, "it");
                ((C9790n) obj2).invoke(it);
                return;
            case 3:
                C35526b it3 = (C35526b) obj;
                int i17 = Stripe3ds2TransactionActivity.f22356z;
                AbstractC22676k.m65750j(it3, "it");
                ((Stripe3ds2TransactionActivity) obj2).m16856o(it3);
                return;
            case 4:
                AbstractC17941f0 result2 = (AbstractC17941f0) obj;
                AbstractC22676k.m65750j(result2, "result");
                LinkedHashMap linkedHashMap = ((C17988y0) obj2).f69831c;
                WeakReference weakReference = (WeakReference) linkedHashMap.get(result2.getId());
                if (weakReference != null && (c17966n1 = (C17966n1) weakReference.get()) != null) {
                    if (result2 instanceof C17938e0) {
                        c17947h0 = new C17944g0(((C17938e0) result2).f69715x);
                    } else {
                        if (!(result2 instanceof C17935d0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c17947h0 = new C17947h0(((C17935d0) result2).f69707x);
                    }
                    C16760x0 c16760x0Mo51571a = c17947h0.mo51571a();
                    Map mapM51588o = c16760x0Mo51571a != null ? AbstractC17960l1.m51588o(c16760x0Mo51571a) : null;
                    if (c17947h0 instanceof C17944g0) {
                        c15442x = new C15437w(mapM51588o);
                    } else {
                        if (!(c17947h0 instanceof C17947h0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c15442x = mapM51588o != null ? new C15442x(mapM51588o) : null;
                    }
                    if (c15442x != null && (c13161j = c17966n1.f69783y) != null) {
                        c13161j.invoke(c15442x);
                    }
                }
                linkedHashMap.remove(result2.getId());
                return;
            case 5:
                BiomarkerSummaryFragment.m17307I((BiomarkerSummaryFragment) obj2, (Uri) obj);
                return;
            case 6:
                AttachmentGalleryDestination.register$lambda$0((AttachmentGalleryDestination) obj2, (AttachmentGalleryActivity.AttachmentOptionResult) obj);
                return;
            case 7:
                CameraAttachmentFragment.setupResultListener$lambda$2((CameraAttachmentFragment) obj2, (File) obj);
                return;
            case 8:
                FileAttachmentFragment.setupResultListener$lambda$13((FileAttachmentFragment) obj2, (List) obj);
                return;
            case 9:
                AbstractC22067o it4 = (AbstractC22067o) obj;
                AbstractC22676k.m65750j(it4, "it");
                ((C39042d) obj2).f168018w.invoke(it4);
                return;
            case 10:
                StressSessionFragment.m26466h0((StressSessionFragment) obj2, (C21062a) obj);
                return;
            case 11:
                BleChooseStrapActivity.m27031x0((BleChooseStrapActivity) obj2, (C21062a) obj);
                return;
            case 12:
                EducationFragment.m21379Y((EducationFragment) obj2, (C21062a) obj);
                return;
            case 13:
                C6375b.m19478W((C6375b) obj2, (Uri) obj);
                return;
            case 14:
                GooglePayLauncherActivity googlePayLauncherActivity = (GooglePayLauncherActivity) obj2;
                C23470p c23470p = googlePayLauncherActivity.f22186x;
                C14681a c14681a = (C14681a) obj;
                int i18 = GooglePayLauncherActivity.f22184z;
                AbstractC22676k.m65747g(c14681a);
                Status status = c14681a.f54246b;
                int i19 = status.f20493w;
                InterfaceC30057d interfaceC30057d = null;
                if (i19 != 0) {
                    if (i19 == 16) {
                        googlePayLauncherActivity.m16842p().f138286K.mo36564a(C33141l.f138219w);
                        return;
                    }
                    String str = status.f20494x;
                    AbstractC35903f.m113990H((C2326f) c23470p.getValue(), EnumC2323c.GOOGLE_PAY_FAILED, null, AbstractC25247g0.m73990Y(new C23465k("status_message", str == null ? "" : str), new C23465k("status_code", String.valueOf(i19))), 2);
                    googlePayLauncherActivity.m16842p().f138286K.mo36564a(new C33145n(new RuntimeException(AbstractC11266d.m30456j(i19, "Google Pay failed with error ", ": ", str != null ? str : ""))));
                    return;
                }
                C12268l c12268l = (C12268l) c14681a.f54245a;
                if (c12268l == null) {
                    AbstractC35903f.m113990H((C2326f) c23470p.getValue(), EnumC2325e.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6);
                    googlePayLauncherActivity.m16842p().f138286K.mo36564a(new C33145n(new RuntimeException("Google Pay missing result data.")));
                    return;
                } else {
                    C38809d5 c38809d5M106267i = C33647p.m106267i(new JSONObject(c12268l.f41078G), null);
                    C32132a c32132a = new C32132a(googlePayLauncherActivity, (Build.VERSION.SDK_INT <= 34 && (window = googlePayLauncherActivity.getWindow()) != null) ? Integer.valueOf(window.getStatusBarColor()) : null);
                    C33161z c33161zM16842p = googlePayLauncherActivity.m16842p();
                    AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c33161zM16842p), c33161zM16842p.f138285J, null, new C26285a(c33161zM16842p, c38809d5M106267i, c32132a, interfaceC30057d, 20), 2);
                    return;
                }
            case 15:
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) obj2;
                C23470p c23470p2 = googlePayPaymentMethodLauncherActivity.f22190x;
                C14681a c14681a2 = (C14681a) obj;
                int i24 = GooglePayPaymentMethodLauncherActivity.f22188z;
                AbstractC22676k.m65747g(c14681a2);
                Status status2 = c14681a2.f54246b;
                int i25 = status2.f20493w;
                if (i25 == 0) {
                    InterfaceC30057d interfaceC30057d2 = null;
                    C12268l c12268l2 = (C12268l) c14681a2.f54245a;
                    if (c12268l2 != null) {
                        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(googlePayPaymentMethodLauncherActivity), null, null, new C26285a(googlePayPaymentMethodLauncherActivity, c12268l2, interfaceC30057d2, 22), 3);
                        return;
                    }
                    AbstractC35903f.m113990H((C2326f) c23470p2.getValue(), EnumC2325e.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6);
                    C33130f0 c33130f0 = new C33130f0(1, new RuntimeException("Google Pay failed with missing data."));
                    C13045h2 c13045h2 = googlePayPaymentMethodLauncherActivity.m16844p().f138245H;
                    c13045h2.getClass();
                    c13045h2.m36571k(null, c33130f0);
                    return;
                }
                if (i25 == 16) {
                    C13045h2 c13045h3 = googlePayPaymentMethodLauncherActivity.m16844p().f138245H;
                    c13045h3.getClass();
                    c13045h3.m36571k(null, C33126d0.f138188w);
                    return;
                }
                String str2 = status2.f20494x;
                String str3 = str2 == null ? "" : str2;
                String strValueOf = String.valueOf(i25);
                AbstractC35903f.m113990H((C2326f) c23470p2.getValue(), EnumC2323c.GOOGLE_PAY_FAILED, null, AbstractC25247g0.m73990Y(new C23465k("status_message", str3), new C23465k("status_code", strValueOf)), 2);
                if (!AbstractC37056f.m118959K(8, 10, 17, 20, 405, 409, 412).contains(Integer.valueOf(i25))) {
                    AbstractC35903f.m113990H((C2326f) c23470p2.getValue(), EnumC2325e.GOOGLE_PAY_UNEXPECTED_STATUS_CODE, null, AbstractC31061c.m95645u("status_code", strValueOf), 2);
                }
                C33150p0 c33150p0M16844p = googlePayPaymentMethodLauncherActivity.m16844p();
                RuntimeException runtimeException = new RuntimeException(AbstractC11266d.m30456j(i25, "Google Pay failed with error ", ": ", str2 != null ? str2 : ""));
                if (i25 == 7) {
                    i14 = 3;
                } else if (i25 != 10) {
                    i14 = 1;
                }
                C33130f0 c33130f1 = new C33130f0(i14, runtimeException);
                C13045h2 c13045h4 = c33150p0M16844p.f138245H;
                c13045h4.getClass();
                c13045h4.m36571k(null, c33130f1);
                return;
            case 16:
                GenericFragment.m18062M((GenericFragment) obj2, (Set) obj);
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C29718h0 c29718h0 = (C29718h0) obj2;
                AbstractC39995r it5 = (AbstractC39995r) obj;
                AbstractC22676k.m65750j(it5, "it");
                if (it5 instanceof C39992o) {
                    c39986i = C39984g.f172551w;
                } else if (it5 instanceof C39993p) {
                    C39991n c39991n = ((C39993p) it5).f172568w;
                    C39989l c39989l = c39991n.f172566y;
                    c39986i = c39989l == null ? new C39986i(new IllegalArgumentException("instant debits data cannot be null")) : new C39985h(c39991n.f172564w, c39989l.f172559w, c39989l.f172560x, c39989l.f172561y, c39989l.f172562z);
                } else {
                    if (!(it5 instanceof C39994q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c39986i = new C39986i(((C39994q) it5).f172569w);
                }
                c29718h0.invoke(c39986i);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                CommunityLandingHostFragment.m18927L1((CommunityLandingHostFragment) obj2, (C21062a) obj);
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                CommunityManageTeamFragment.m19032N0((CommunityManageTeamFragment) obj2, (Uri) obj);
                return;
            case 20:
                DownloadedFileExportFragment.m28441z((DownloadedFileExportFragment) obj2, (Uri) obj);
                return;
            default:
                C40234j.m129197J((C40234j) obj2, (C21062a) obj);
                return;
        }
    }
}
