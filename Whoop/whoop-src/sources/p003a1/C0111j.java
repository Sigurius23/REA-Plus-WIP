package p003a1;

import a13.C0150h;
import a81.AbstractC0564o;
import al0.C0975j;
import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1596j;
import androidx.room.AbstractC1825r1;
import b30.C2603q0;
import b30.C2608q5;
import bc3.AbstractC3006f0;
import bg.C3213h;
import bg.C3214i;
import bg.C3216k;
import bh0.C3248a;
import bi.AbstractC3269g;
import c11.AbstractC3841h;
import c11.C3849p;
import c41.AbstractC4023f3;
import c41.C4037h3;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ce3.C4516q;
import ce3.EnumC4496a;
import com.stripe.android.paymentsheet.p055ui.PrimaryButton;
import com.whoop.activation.feature.orderconfirmation.view.OrderConfirmationFragment;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.view.PurchaseAddOnsFragment;
import com.whoop.design.showcase.gallery.view.fragment.DesignShowcaseLegacyGalleryFragment;
import com.whoop.healthmonitor.view.ComposableHealthReportFragment;
import com.whoop.labrador.fragment.LabradorAboutFragment;
import com.whoop.labrador.fragment.LabradorDetailsFragment;
import com.whoop.labrador.fragment.LabradorEligibilityFragment;
import com.whoop.labrador.fragment.LabradorSubmitEligibilityFragment;
import com.whoop.membership.view.upcycle.UpcycleLandingFragment;
import com.whoop.profile.view.ProfileFragment;
import com.whoop.profile.view.edit.EditProfileContentKt;
import com.whoop.profile.view.edit.EditProfileFieldsContentKt;
import com.whoop.profile.view.memberlevels.MemberLevelsFragment;
import com.whoop.sms.settings.view.SmsSettingsFragment;
import cz.C11215n0;
import e93.AbstractC12889b;
import et1.C13598b;
import h02.C16587n0;
import i93.C18284j;
import java.io.IOException;
import l83.C23454a0;
import l83.C23470p;
import l83.C23480z;
import m83.AbstractC25260n;
import mt1.C25939a;
import p023ay.C2146t;
import p088dc.AbstractC11895b;
import p164g2.InterfaceC15237i;
import p461rh.C31431t;
import p601x0.C37792c;
import p715kotlin.jvm.internal.AbstractC22676k;
import th.InterfaceC33803a;
import v02.C35513b;

/* JADX INFO: renamed from: a1.j */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0111j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f344w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f345x;

    public /* synthetic */ C0111j(Object obj, int i13) {
        this.f344w = i13;
        this.f345x = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        String string;
        int i13 = this.f344w;
        C3213h c3213h = null;
        Object[] objArr = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f345x;
        switch (i13) {
            case 0:
                C0112k c0112k = (C0112k) obj;
                return c0112k.f9141N ? AbstractC3269g.m9508o(c0112k) : C37792c.f161891b;
            case 1:
                return OrderConfirmationFragment.m17173D((OrderConfirmationFragment) obj);
            case 2:
                return AbstractC0564o.m1384F((View) obj);
            case 3:
                return SmsSettingsFragment.m25965C((SmsSettingsFragment) obj);
            case 4:
                return C0975j.m2477E2((C35513b) obj);
            case 5:
                ((C1596j) obj).f6261b = null;
                return c23454a0;
            case 6:
                return ((AbstractC1825r1) obj).m5451a();
            case 7:
                int i14 = PrimaryButton.f22398O;
                ((C16587n0) obj).invoke();
                return c23454a0;
            case 8:
                ((C2603q0) obj).m7515b(C2608q5.f10160b);
                return c23454a0;
            case 9:
                C3216k c3216k = (C3216k) obj;
                C23470p c23470p = c3216k.f12581c;
                byte[] bArr = c3216k.f12579a;
                String str = c3216k.f12580b;
                byte[] bArr2 = C3216k.f12578g;
                int length = bArr2.length;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (i15 < length) {
                        int i17 = i16 + 1;
                        if (bArr[i16] == bArr2[i15]) {
                            i15++;
                            i16 = i17;
                        }
                    } else {
                        c3213h = new C3213h(AbstractC25260n.m74038N0(bArr, AbstractC12889b.m36278i0(bArr2.length, bArr.length)));
                    }
                }
                if (c3216k.equals(C3216k.f12576e)) {
                    string = "::1";
                } else if (c3216k.equals(C3216k.f12577f)) {
                    string = "::";
                } else if (c3213h != null) {
                    string = "::ffff:" + c3213h;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    C3214i c3214i = new C3214i();
                    C3214i c3214i2 = new C3214i();
                    short[] sArr = ((C23480z) c23470p.getValue()).f92958w;
                    int length2 = sArr.length;
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < length2) {
                        int i24 = i19 + 1;
                        if (sArr[i18] == ((short) 0)) {
                            int i25 = c3214i.f12573b;
                            if (i25 == 0) {
                                c3214i.f12572a = i19;
                            }
                            int i26 = i25 + 1;
                            c3214i.f12573b = i26;
                            if (i26 > c3214i2.f12573b) {
                                c3214i2 = c3214i;
                            }
                        } else {
                            c3214i = new C3214i();
                        }
                        i18++;
                        i19 = i24;
                    }
                    if (c3214i2.f12573b > 1) {
                        c3216k.m9256U(sb4, AbstractC12889b.m36278i0(0, c3214i2.f12572a));
                        sb4.append("::");
                        c3216k.m9256U(sb4, AbstractC12889b.m36278i0(c3214i2.f12572a + c3214i2.f12573b, ((C23480z) c23470p.getValue()).f92958w.length));
                    } else {
                        short[] sArr2 = ((C23480z) c23470p.getValue()).f92958w;
                        AbstractC22676k.m65750j(sArr2, "<this>");
                        c3216k.m9256U(sb4, new C18284j(0, sArr2.length - 1, 1));
                    }
                    string = sb4.toString();
                }
                return str != null ? AbstractC11895b.m31992k('%', string, str) : string;
            case 10:
                return PurchaseAddOnsFragment.m17709C((PurchaseAddOnsFragment) obj);
            case 11:
                return C3248a.m9393g((C3248a) obj);
            case 12:
                return (InterfaceC33803a) ((C31431t) obj).f129319a.f129304d.getValue();
            case 13:
                return AbstractC3841h.m11754z((C3849p) obj);
            case 14:
                return Boolean.valueOf(AbstractC4023f3.m12257j((C4037h3) obj));
            case 15:
                return DesignShowcaseLegacyGalleryFragment.m21215A((DesignShowcaseLegacyGalleryFragment) obj);
            case 16:
                C4516q c4516q = (C4516q) obj;
                c4516q.getClass();
                try {
                    c4516q.f18203X.m14165s(2, 0, false);
                    break;
                } catch (IOException e5) {
                    EnumC4496a enumC4496a = EnumC4496a.PROTOCOL_ERROR;
                    c4516q.m14133b(enumC4496a, enumC4496a, e5);
                }
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ComposableHealthReportFragment.m21599H((ComposableHealthReportFragment) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ProfileFragment.navigator_delegate$lambda$0((ProfileFragment) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EditProfileContentKt.EditProfileContent$lambda$4$0$0((InterfaceC15237i) obj);
            case 20:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$6$0$0$0((InterfaceC4351m) obj);
            case 21:
                return MemberLevelsFragment.onViewCreated$lambda$1((MemberLevelsFragment) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return LabradorAboutFragment.m22437C((LabradorAboutFragment) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return LabradorDetailsFragment.m22468a0((C13598b) obj);
            case 24:
                return LabradorEligibilityFragment.m22491B((LabradorEligibilityFragment) obj);
            case 25:
                return LabradorSubmitEligibilityFragment.m22518F((C25939a) obj);
            case 26:
                return LabradorSubmitEligibilityFragment.m22519G((LabradorSubmitEligibilityFragment) obj);
            case 27:
                return ((C2146t) obj).f8541w;
            case 28:
                return UpcycleLandingFragment.m22857G((UpcycleLandingFragment) obj);
            default:
                C11215n0 c11215n0 = (C11215n0) obj;
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c11215n0), null, null, new C0150h(c11215n0, objArr == true ? 1 : 0, 7), 3);
                return c23454a0;
        }
    }
}
