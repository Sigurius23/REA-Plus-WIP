package com.whoop.profile.view.edit;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bs1.C3603v;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.domain.models.Gender;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import y71.AbstractC39281n;
import y71.C39282o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/profile/domain/models/Gender;", "selectedGender", "Lkotlin/Function1;", "Ll83/a0;", "onGenderSelected", "GenderSelectionContent", "(Lcom/whoop/profile/domain/models/Gender;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "gender", "Lcom/whoop/design/util/TextResource;", "getGenderDisplayText", "(Lcom/whoop/profile/domain/models/Gender;)Lcom/whoop/design/util/TextResource;", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GenderSelectionContentKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.NON_BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gender.PREFER_NOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void GenderSelectionContent(Gender gender, Function1 onGenderSelected, Composer composer, int i13) {
        AbstractC22676k.m65750j(onGenderSelected, "onGenderSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(243143570);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87149e(gender == null ? -1 : gender.ordinal()) ? 4 : 2) | i13 : i13;
        int i15 = 32;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onGenderSelected) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            List<Gender> listM118959K = AbstractC37056f.m118959K(Gender.FEMALE, Gender.MALE, Gender.NON_BINARY, Gender.PREFER_NOT);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1095924792);
            for (Gender gender2 : listM118959K) {
                C2314t c2314t2 = c2314t;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C39282o c39282oM125229d = C39282o.Companion.m125229d(C39282o.INSTANCE, getGenderDisplayText(gender2), null, null, null, null, null, null, null, null, null, null, null, null, null, false, gender == gender2, null, false, null, null, null, false, null, 8355838, null);
                boolean zM87149e = ((i14 & 112) == i15) | c28655q.m87149e(gender2.ordinal());
                Object objM87133R = c28655q.m87133R();
                if (zM87149e || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3603v(24, onGenderSelected, gender2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC39281n.m125207c(modifierM3409f2, c39282oM125229d, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                if (gender2 != AbstractC25265s.m74112P0(listM118959K)) {
                    c28655q.m87150e0(792044617);
                    AbstractC25012a.m73388u((float) 1.5d, 8, c2314t2, c28655q, false);
                } else {
                    c28655q.m87150e0(792130859);
                    AbstractC25012a.m73388u(2, 8, c2314t2, c28655q, false);
                }
                c2314t = c2314t2;
                i15 = 32;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(gender, onGenderSelected, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 GenderSelectionContent$lambda$0$0$0$0(Function1 function1, Gender gender) {
        function1.invoke(gender);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 GenderSelectionContent$lambda$1(Gender gender, Function1 function1, int i13, Composer composer, int i14) {
        GenderSelectionContent(gender, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final TextResource getGenderDisplayText(Gender gender) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[gender.ordinal()];
        if (i13 == 1) {
            return new TextResource.C8688b(C9691R.string.profile_gender_woman, null, 2, null);
        }
        if (i13 == 2) {
            return new TextResource.C8688b(C9691R.string.profile_gender_man, null, 2, null);
        }
        if (i13 == 3) {
            return new TextResource.C8688b(C9691R.string.profile_gender_non_binary, null, 2, null);
        }
        if (i13 == 4) {
            return new TextResource.C8688b(C9691R.string.profile_gender_prefer_not_to_specify, null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
