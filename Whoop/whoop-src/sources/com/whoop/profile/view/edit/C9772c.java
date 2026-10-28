package com.whoop.profile.view.edit;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import ep1.AbstractC13408c;
import l83.C23454a0;
import p163g1.AbstractC15099o3;
import p208i2.AbstractC17918w0;
import p208i2.C17881e1;
import p390p1.InterfaceC28601c1;
import p636y3.C39179k;
import p705ea2.AbstractC42783n;
import p733ry2.Function1;
import p748zc1.AbstractC40328f8;
import p748zc1.AbstractC40382k7;
import p748zc1.AbstractC40405m8;
import p748zc1.AbstractC40431p3;
import p748zc1.AbstractC40435p7;
import p748zc1.AbstractC40481u3;
import p748zc1.AbstractC40485u7;
import p748zc1.AbstractC40512x4;
import p748zc1.AbstractC40529z1;
import x31.AbstractC37947f;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9772c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28406w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f28407x;

    public /* synthetic */ C9772c(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f28406w = i13;
        this.f28407x = interfaceC28601c1;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x0149  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        int i13 = this.f28406w;
        InterfaceC28601c1 interfaceC28601c1 = this.f28407x;
        switch (i13) {
            case 0:
                return EditProfileBottomSheetKt.EditProfileBottomSheet$lambda$25$0$2$2$0(interfaceC28601c1, (EditProfileEvent.FieldType) obj, (String) obj2);
            case 1:
                return AbstractC42783n.m36353q(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return Integer.valueOf(AbstractC42783n.m36354r(interfaceC28601c1, (FeatureEducationType) obj, (FeatureEducationType) obj2));
            case 3:
                return AbstractC13408c.m37899m(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                C39179k c39179k = (C39179k) obj;
                C39179k c39179k2 = (C39179k) obj2;
                float f13 = AbstractC15099o3.f56552a;
                int i14 = c39179k2.f168418a;
                int i15 = c39179k2.f168421d;
                int i16 = c39179k2.f168420c;
                int i17 = c39179k2.f168419b;
                int i18 = c39179k.f168420c;
                int i19 = c39179k.f168419b;
                int i24 = c39179k.f168421d;
                int i25 = c39179k.f168418a;
                float fMin2 = 1.0f;
                if (i14 >= i18) {
                    fMin = 0.0f;
                } else if (i16 <= i25) {
                    fMin = 1.0f;
                } else if (c39179k2.m124798c() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(c39179k.f168420c, i16) + Math.max(i25, i14)) / 2) - i14) / c39179k2.m124798c();
                }
                if (i17 >= i24) {
                    fMin2 = 0.0f;
                } else if (i15 > i19) {
                    if (c39179k2.m124796a() == 0) {
                        fMin2 = 0.0f;
                    } else {
                        fMin2 = (((Math.min(i24, i15) + Math.max(i19, i17)) / 2) - i17) / c39179k2.m124796a();
                    }
                }
                interfaceC28601c1.setValue(new C17881e1(AbstractC17918w0.m51524l(fMin, fMin2)));
                return C23454a0.f92919a;
            case 5:
                return Function1.m99288j(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC37947f.m121528v(interfaceC28601c1, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 7:
                return AbstractC40529z1.m131274P(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC40529z1.m131268J(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AbstractC40431p3.m130591g(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return AbstractC40481u3.m130928p(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return AbstractC40512x4.m131179i(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return AbstractC40382k7.m130201g(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return AbstractC40435p7.m130634l(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return AbstractC40435p7.m130636n(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AbstractC40435p7.m130638p(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return AbstractC40435p7.m130641s(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40485u7.m130985n(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40328f8.m129778x(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40328f8.m129749D(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return AbstractC40328f8.m129752G(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return AbstractC40328f8.m129746A(interfaceC28601c1, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40405m8.m130384e(interfaceC28601c1, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            default:
                return AbstractC40405m8.m130385f(interfaceC28601c1, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
        }
    }
}
