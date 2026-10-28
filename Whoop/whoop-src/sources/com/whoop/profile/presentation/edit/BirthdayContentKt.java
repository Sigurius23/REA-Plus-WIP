package com.whoop.profile.presentation.edit;

import a01.C0084d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.utils.BirthdayUtils;
import i93.C18284j;
import l83.C23454a0;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p000.C21061j;
import p000.C29656q;
import p208i2.C17919x;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23079d0;
import p292l1.AbstractC23092f1;
import p292l1.C23067b0;
import p292l1.C23104h1;
import p292l1.C23204y;
import p292l1.InterfaceC23098g1;
import p292l1.InterfaceC23142n3;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import x81.C38072d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "selectedBirthdayValue", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "Lkotlin/Function1;", "onDateSelected", "BirthdayContent", "(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ll1/y;", "birthdayDatePickerColors", "(Landroidx/compose/runtime/Composer;I)Ll1/y;", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BirthdayContentKt {
    public static final void BirthdayContent(String selectedBirthdayValue, InterfaceC4339a onDismiss, Function1 onDateSelected, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(selectedBirthdayValue, "selectedBirthdayValue");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(onDateSelected, "onDateSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1534779373);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(selectedBirthdayValue) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onDismiss) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onDateSelected) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDateMinusYears = localDateNow.minusYears(13);
            LocalDate localDateMinusYears2 = localDateNow.minusYears(120);
            DateTimeZone dateTimeZone = DateTimeZone.UTC;
            final long millis = localDateMinusYears.toDateTimeAtStartOfDay(dateTimeZone).getMillis();
            final long millis2 = localDateMinusYears2.toDateTimeAtStartOfDay(dateTimeZone).getMillis();
            C18284j c18284j = new C18284j(localDateMinusYears2.getYear(), localDateMinusYears.getYear(), 1);
            long toMillis = BirthdayUtils.INSTANCE.parseToMillis(selectedBirthdayValue);
            C23104h1 c23104h1M67082p = AbstractC23092f1.m67082p(Long.valueOf(toMillis), Long.valueOf(toMillis), c18284j, new InterfaceC23142n3() { // from class: com.whoop.profile.presentation.edit.BirthdayContentKt$BirthdayContent$datePickerState$1
                @Override // p292l1.InterfaceC23142n3
                public boolean isSelectableDate(long utcTimeMillis) {
                    return millis2 + 1 <= utcTimeMillis && utcTimeMillis <= millis;
                }

                @Override // p292l1.InterfaceC23142n3
                public /* bridge */ boolean isSelectableYear(int i15) {
                    return true;
                }
            }, c28655q, 0);
            AbstractC23079d0.m67054a(onDismiss, AbstractC37817c.m121344e(1590018597, c28655q, new C0084d((Object) c23104h1M67082p, onDateSelected, (Object) onDismiss, 9)), null, null, null, 0.0f, birthdayDatePickerColors(c28655q, 0), null, AbstractC37817c.m121344e(-1000316676, c28655q, new C9722a(c23104h1M67082p, 0)), c28655q, ((i14 >> 3) & 14) | 100663344, 188);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(selectedBirthdayValue, onDismiss, (Object) onDateSelected, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 BirthdayContent$lambda$0(InterfaceC23098g1 interfaceC23098g1, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextMedium;
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(C9691R.string.profile_confirm);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new Function1() { // from class: com.whoop.profile.presentation.edit.BirthdayContentKt$BirthdayContent$1$1$1
                    @Override // p715kotlin.jvm.functions.Function1
                    public /* synthetic */ Object invoke(Object obj) {
                        return new C17919x(m134174invokevNxB06k((C39336i) obj));
                    }

                    /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                    public final long m134174invokevNxB06k(C39336i whoopColor) {
                        AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                        return whoopColor.getBrandBlack();
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
            boolean zM87153g = c28655q.m87153g(interfaceC23098g1) | c28655q.m87153g(function1) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C29656q(interfaceC23098g1, interfaceC4339a, function1, 20);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27265l0.m82217i(null, enumC27269n0, c8688bM21277k, null, null, false, interfaceC39332eM125323a, null, false, false, null, null, (Function1) objM87133R2, c28655q, (TextResource.C8688b.f25889c << 6) | 48, 0, 4025);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 BirthdayContent$lambda$0$1$0(InterfaceC23098g1 interfaceC23098g1, InterfaceC4339a interfaceC4339a, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        Long lM67085b = ((C23104h1) interfaceC23098g1).m67085b();
        if (lM67085b != null) {
            function1.invoke(BirthdayUtils.INSTANCE.millisToIsoString(lM67085b.longValue()));
        } else {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 BirthdayContent$lambda$1(InterfaceC23098g1 interfaceC23098g1, InterfaceC23013y DatePickerDialog, Composer composer, int i13) {
        AbstractC22676k.m65750j(DatePickerDialog, "$this$DatePickerDialog");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC23092f1.m67068b(interfaceC23098g1, null, null, birthdayDatePickerColors(c28655q, 0), null, null, false, null, c28655q, 1572864);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 BirthdayContent$lambda$2(String str, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        BirthdayContent(str, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final C23204y birthdayDatePickerColors(Composer composer, int i13) {
        C23067b0 c23067b0 = C23067b0.f90984a;
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        long jM125426w = c38072d.m121949b(composer, i14).getBrandBlack();
        long jM125426w2 = c38072d.m121949b(composer, i14).getBrandBlack();
        long jM125426w3 = c38072d.m121949b(composer, i14).getBrandBlack();
        long jM125430y = c38072d.m121949b(composer, i14).getBrandWhite();
        long jM125426w4 = c38072d.m121949b(composer, i14).getBrandBlack();
        return C23067b0.m67042c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c38072d.m121949b(composer, i14).getBrandBlack(), c38072d.m121949b(composer, i14).getBrandWhite(), jM125426w4, 0L, 0L, jM125430y, jM125426w3, jM125426w2, jM125426w, 0L, composer, 31814911);
    }
}
