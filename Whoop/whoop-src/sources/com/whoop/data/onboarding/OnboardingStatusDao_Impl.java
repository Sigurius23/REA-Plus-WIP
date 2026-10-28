package com.whoop.data.onboarding;

import a11.C0129g;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import bp0.C3526n;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p007a6.C0428i;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
public final class OnboardingStatusDao_Impl implements OnboardingStatusDao {
    private final AbstractC1848z0 __db;
    private final FeatureEducationTypeConverter __featureEducationTypeConverter = new FeatureEducationTypeConverter();
    private final AbstractC1802k __insertAdapterOfOnboardingStatus = new AbstractC1802k() { // from class: com.whoop.data.onboarding.OnboardingStatusDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_onboarding_status` (`type`,`isCompleted`) VALUES (?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, OnboardingStatus onboardingStatus) {
            String strFromFeatureEducationType = OnboardingStatusDao_Impl.this.__featureEducationTypeConverter.fromFeatureEducationType(onboardingStatus.getType());
            if (strFromFeatureEducationType == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, strFromFeatureEducationType);
            }
            interfaceC33689c.mo5356p(2, onboardingStatus.isCompleted() ? 1L : 0L);
        }
    };

    public OnboardingStatusDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$deleteAll$4(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_onboarding_status");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getOnboardingStatus$1(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_onboarding_status");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isCompleted");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new OnboardingStatus(this.__featureEducationTypeConverter.toFeatureEducationType(interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N)), ((int) interfaceC33689cMo68212g1.getLong(iM60658N2)) != 0));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isCompleted$2(FeatureEducationType featureEducationType, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT isCompleted FROM table_onboarding_status WHERE type = ?");
        try {
            String strFromFeatureEducationType = this.__featureEducationTypeConverter.fromFeatureEducationType(featureEducationType);
            boolean z4 = true;
            if (strFromFeatureEducationType == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, strFromFeatureEducationType);
            }
            Boolean boolValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(0) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z4 = false;
                    }
                    boolValueOf = Boolean.valueOf(z4);
                }
            }
            return boolValueOf;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isCompletedFlow$3(FeatureEducationType featureEducationType, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT isCompleted FROM table_onboarding_status WHERE type = ?");
        try {
            String strFromFeatureEducationType = this.__featureEducationTypeConverter.fromFeatureEducationType(featureEducationType);
            boolean z4 = true;
            if (strFromFeatureEducationType == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, strFromFeatureEducationType);
            }
            Boolean boolValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(0) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z4 = false;
                    }
                    boolValueOf = Boolean.valueOf(z4);
                }
            }
            return boolValueOf;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$updateTable$0(OnboardingStatus onboardingStatus, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfOnboardingStatus.insert(interfaceC33687a, onboardingStatus);
        return C23454a0.f92919a;
    }

    @Override // com.whoop.data.onboarding.OnboardingStatusDao
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C0129g(26), interfaceC30057d);
    }

    @Override // com.whoop.data.onboarding.OnboardingStatusDao
    public Object getOnboardingStatus(InterfaceC30057d<? super List<OnboardingStatus>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C0428i(this, 6), interfaceC30057d);
    }

    @Override // com.whoop.data.onboarding.OnboardingStatusDao
    public Object isCompleted(FeatureEducationType featureEducationType, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C6527a(this, featureEducationType, 1), interfaceC30057d);
    }

    @Override // com.whoop.data.onboarding.OnboardingStatusDao
    public InterfaceC13058l isCompletedFlow(FeatureEducationType featureEducationType) {
        return AbstractC12350b.m34591l(this.__db, new String[]{OnboardingStatusDaoKt.ONBOARDING_STATUS_TABLE_NAME}, new C6527a(this, featureEducationType, 0));
    }

    @Override // com.whoop.data.onboarding.OnboardingStatusDao
    public Object updateTable(OnboardingStatus onboardingStatus, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        onboardingStatus.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C3526n(7, this, onboardingStatus), interfaceC30057d);
    }
}
