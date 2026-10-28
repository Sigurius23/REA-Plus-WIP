package a80;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import az1.AbstractC2166g;
import b41.AbstractC2715d;
import b41.C2717f;
import bb2.AbstractC2933i;
import br2.AbstractC3571m;
import br2.C3568j;
import c21.AbstractC3889b;
import c21.C3891d;
import c41.AbstractC4050j2;
import c41.AbstractC4070m1;
import c41.AbstractC4097q0;
import c41.AbstractC4125u0;
import c41.AbstractC4134v2;
import c41.AbstractC4154y1;
import c41.AbstractC4162z3;
import c41.C3989a4;
import c41.C4049j1;
import c41.C4064l2;
import c41.C4141w2;
import c41.C4160z1;
import c60.AbstractC4270c;
import c60.C4271d;
import c93.InterfaceC4351m;
import cf0.AbstractC4539b;
import cf0.C4540c;
import com.whoop.activation.feature.orderconfirmation.view.OrderConfirmationFragment;
import com.whoop.advancedlabs.testupload.view.TestUploadFragment;
import com.whoop.advancedlabsjoin.feature.purchaseaddons.view.PurchaseAddOnsFragment;
import com.whoop.edit.view.EditActivityFragment;
import com.whoop.health.monitor.view.HeartScreenerFragment;
import com.whoop.hormonalinsights.symptompatterns.view.SymptomPatternsFragment;
import com.whoop.membership.returns.view.ReturnsFragment;
import com.whoop.mfa.setup.view.MfaSetupFragment;
import com.whoop.pairing.membershipAdjustment.MembershipAdjustmentFragment;
import com.whoop.pregnancy.view.PregnancySettingsFragment;
import com.whoop.sms.settings.view.SmsSettingsFragment;
import com.whoop.video.VideoActivity;
import e30.AbstractC12605c;
import gz0.EnumC16313m0;
import h20.C16686k4;
import h20.C16754w0;
import l83.C23454a0;
import p097ds.AbstractC12313p;
import p390p1.AbstractC28683x;
import p700bd1.AbstractC3089g;
import p700bd1.C3090h;
import p700bd1.C3099q;
import p700bd1.C3103u;
import wy1.C37695b;
import xc2.InterfaceC38193d;

/* JADX INFO: renamed from: a80.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0539c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1864w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1865x;

    public /* synthetic */ C0539c(AbstractC12605c abstractC12605c, int i13, int i14) {
        this.f1864w = i14;
        this.f1865x = abstractC12605c;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1864w) {
            case 0:
                return OrderConfirmationFragment.m17174E((OrderConfirmationFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return EditActivityFragment.m21319g0((EditActivityFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return SmsSettingsFragment.m25966D((SmsSettingsFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return HeartScreenerFragment.m21506E((HeartScreenerFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return SymptomPatternsFragment.m22180H((SymptomPatternsFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return ReturnsFragment.m22845F((ReturnsFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return MfaSetupFragment.m22904G((MfaSetupFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC2166g.m6739B((C37695b) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                ((Integer) obj2).getClass();
                AbstractC12313p.m34287g((C16754w0) this.f1865x, (Composer) obj, AbstractC28683x.m87244L(9));
                return C23454a0.f92919a;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC12313p.m34289h((C16686k4) this.f1865x, (Composer) obj, AbstractC28683x.m87244L(9));
                return C23454a0.f92919a;
            case 10:
                return AbstractC2715d.m7626o((EnumC16313m0) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return AbstractC2715d.m7627p((C2717f) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return AbstractC2933i.m8565s((InterfaceC38193d.d) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return AbstractC3089g.m8858d((C3090h) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return C3099q.m8890d((C3103u) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return TestUploadFragment.m17649O((TestUploadFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return PurchaseAddOnsFragment.m17710D((PurchaseAddOnsFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC3571m.m10725d((C3568j) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return VideoActivity.m27821J((VideoActivity) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC3889b.m11872j((C3891d) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return MembershipAdjustmentFragment.m23188K((MembershipAdjustmentFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return AbstractC4097q0.m12604s((AbstractC4125u0) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC4070m1.m12478g((C4049j1) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC4154y1.m12943d((C4160z1) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return AbstractC4050j2.m12380m((C4064l2) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return AbstractC4134v2.m12815p((C4141w2) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC4162z3.m12994h((C3989a4) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return PregnancySettingsFragment.m23285T0((PregnancySettingsFragment) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return AbstractC4270c.m13303g((C4271d) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC4539b.m14196e((C4540c) this.f1865x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C0539c(Object obj, int i13) {
        this.f1864w = i13;
        this.f1865x = obj;
    }
}
