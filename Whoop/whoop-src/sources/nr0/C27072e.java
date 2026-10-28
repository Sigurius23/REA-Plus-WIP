package nr0;

import androidx.compose.foundation.lazy.layout.C1106b;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.health.platform.client.proto.C1533u;
import b30.C2570m;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.core.details.view.CoreDetailsFragment;
import com.whoop.debug.battery.BatteryDebugFragment;
import com.whoop.memberdataexport.p063ui.MemberDataExportFragment;
import com.whoop.memberdataexport.p063ui.SubmissionCompleteFragment;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import com.whoop.realtime.presentation.StartActivityActivity;
import com.whoop.settings.regulatorylabels.SettingsRegulatoryLabelsFragment;
import com.whoop.shepherd.fragment.ShepherdAboutFragment;
import com.whoop.shepherd.fragment.ShepherdNotificationHistoryFragment;
import com.whoop.shepherd.fragment.ShepherdSubmitTermsOfUseFragment;
import com.whoop.shepherd.fragment.ShepherdToggleSettingsFragment;
import com.whoop.user.journey.yearinreviewraf.YirRafFragment;
import com.whoop.whattoexpect.view.WhatToExpectFragment;
import ec3.InterfaceC13037f2;
import fe2.C14416a;
import l83.C23454a0;
import n90.AbstractC26474d;
import o11.AbstractC27407m;
import o11.InterfaceC27402h;
import o23.InterfaceC27474d;
import os0.AbstractC28307c;
import ox0.AbstractC28449c;
import ox0.C28451e;
import oy2.C28479e;
import p005a3.AbstractC0201g;
import p132f0.C13821r1;
import p279kd.C22379f;
import p352ny.C27235g;
import p389p0.C28554v;
import p395p6.C28894l;
import p636y3.C39174f;
import pl0.C29346d;
import q31.AbstractC29946d;
import q31.C29948f;
import q80.AbstractC30037i;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: nr0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C27072e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f108213w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f108214x;

    public /* synthetic */ C27072e(Object obj, int i13) {
        this.f108213w = i13;
        this.f108214x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f108213w) {
            case 0:
                return AbstractC27073f.m81407y((C27074g) this.f108214x);
            case 1:
                return YirRafFragment.m27803E((YirRafFragment) this.f108214x);
            case 2:
                return MemberDataExportFragment.m22572H((MemberDataExportFragment) this.f108214x);
            case 3:
                return SubmissionCompleteFragment.m22589P((SubmissionCompleteFragment) this.f108214x);
            case 4:
                return WhatToExpectFragment.m28403F((WhatToExpectFragment) this.f108214x);
            case 5:
                C2570m c2570m = ((C27235g) this.f108214x).f109006c;
                AbstractC3006f0.m8732z((InterfaceC2994c0) c2570m.f9987x, null, null, new C22379f(c2570m, (InterfaceC30057d) null, 15), 3);
                return C23454a0.f92919a;
            case 6:
                return Integer.valueOf(InterfaceC27402h.b.m82619q((InterfaceC27402h.b) this.f108214x));
            case 7:
                return Float.valueOf(AbstractC27407m.m82682c((AbstractC27407m) this.f108214x));
            case 8:
                return AbstractC27407m.c.m82725F((AbstractC27407m.c) this.f108214x);
            case 9:
                return (InterfaceC27474d) this.f108214x;
            case 10:
                return RealTimeRecordActivity.m23756C0((RealTimeRecordActivity) this.f108214x);
            case 11:
                return StartActivityActivity.m23918V0((StartActivityActivity) this.f108214x);
            case 12:
                return ShepherdAboutFragment.m25841C((ShepherdAboutFragment) this.f108214x);
            case 13:
                return ShepherdNotificationHistoryFragment.m25864E((ShepherdNotificationHistoryFragment) this.f108214x);
            case 14:
                return ShepherdSubmitTermsOfUseFragment.m25888E((C14416a) this.f108214x);
            case 15:
                return ShepherdSubmitTermsOfUseFragment.m25889F((ShepherdSubmitTermsOfUseFragment) this.f108214x);
            case 16:
                return ShepherdToggleSettingsFragment.m25905D((ShepherdToggleSettingsFragment) this.f108214x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC28307c.m85765l((ComposeView) this.f108214x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return CoreDetailsFragment.m19758H((CoreDetailsFragment) this.f108214x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BatteryDebugFragment.m20020C((BatteryDebugFragment) this.f108214x);
            case 20:
                return AbstractC28449c.m86234q((C28451e) this.f108214x);
            case 21:
                return new C39174f(((C13821r1) this.f108214x).f49318a.m87024x() > 0 ? 8 : 0);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C28479e.m86626S0((C28479e) this.f108214x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C28554v c28554v = ((C1106b) this.f108214x).f4622j;
                if (c28554v != null) {
                    AbstractC0201g.m508h(c28554v);
                }
                return C23454a0.f92919a;
            case 24:
                ((C28894l) this.f108214x).f116960j.getValue();
                return C23454a0.f92919a;
            case 25:
                return SettingsRegulatoryLabelsFragment.m25709D((SettingsRegulatoryLabelsFragment) this.f108214x);
            case 26:
                return C29346d.m89421d((C29346d) this.f108214x);
            case 27:
                return AbstractC29946d.m91598i((C29948f) this.f108214x);
            case 28:
                return ((InterfaceC13037f2) this.f108214x).getValue();
            default:
                return AbstractC30037i.m91962t((AbstractC26474d.a) this.f108214x);
        }
    }
}
