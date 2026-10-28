package g11;

import am2.C1042s;
import android.R;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import aq1.C1909c;
import b01.C2192m;
import b30.C2662y3;
import bc3.InterfaceC2994c0;
import bg0.C3226h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.presentation.edit.C9722a;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.ActionSequenceAction;
import com.whoop.whoopaction.domain.models.ActionSequenceStep;
import cy1.C11186b;
import d71.C11757c;
import f01.C13845b;
import f01.C13857f;
import fd3.C14408a;
import fw0.C14833a;
import gy0.AbstractC16277f;
import i93.C18284j;
import ih0.AbstractC18489d0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p133f1.C13989w1;
import p208i2.AbstractC17918w0;
import p209i3.C18027i;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23079d0;
import p292l1.AbstractC23092f1;
import p292l1.C23067b0;
import p292l1.C23104h1;
import p292l1.C23204y;
import p292l1.InterfaceC23098g1;
import p292l1.InterfaceC23142n3;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25294d0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sw2.AbstractC33054a;
import u82.AbstractC34650k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: g11.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aM\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010$\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0003¢\u0006\u0004\b$\u0010%\u001a+\u0010&\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010)\u001a\u00020(H\u0003¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010,\u001a\u00020+*\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010.\u001a\u00020\u0010*\u00020+H\u0002¢\u0006\u0004\b.\u0010/¨\u00061²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020!8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lg11/d;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "y", "(Landroidx/compose/ui/Modifier;Lg11/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/whoopaction/domain/models/Action;", "stateUpdate", "Lcom/whoop/navigation/models/GenericInteraction;", "rangeInteraction", "N", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)V", "Ljava/time/LocalDate;", "selectedDate", "minimumDate", "maximumDate", "onConfirm", "Lkotlin/Function0;", "onDismiss", "t", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Ll1/g1;", "datePickerState", "o", "(Ll1/g1;Landroidx/compose/runtime/Composer;I)V", "q", "(Ll1/g1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "text", "", "enabled", "onClick", "J", "(Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "O", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Landroidx/compose/runtime/Composer;I)Ll1/g1;", "Ll1/y;", "M", "(Landroidx/compose/runtime/Composer;I)Ll1/y;", "", "Q", "(Ljava/time/LocalDate;)J", "P", "(J)Ljava/time/LocalDate;", "showDialog", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15219c {

    /* JADX INFO: renamed from: g11.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.datepicker.DatePickerItemKt$DatePickerField$1$1", m100430f = "DatePickerItem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f57143w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15220d f57144x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f57145y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15220d c15220d, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f57144x = c15220d;
            this.f57145y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f57144x, this.f57145y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f57143w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f57144x.getEmitsInitialValue()) {
                this.f57145y.invoke(this.f57144x.getSelectedDate());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g11.c$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"g11/c$b", "Ll1/n3;", "", "utcTimeMillis", "", "isSelectableDate", "(J)Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC23142n3 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Long f57146a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Long f57147b;

        public b(Long l7, Long l12) {
            this.f57146a = l7;
            this.f57147b = l12;
        }

        @Override // p292l1.InterfaceC23142n3
        public boolean isSelectableDate(long utcTimeMillis) {
            Long l7 = this.f57146a;
            boolean z4 = l7 == null || utcTimeMillis >= l7.longValue();
            Long l12 = this.f57147b;
            return z4 && (l12 == null || (utcTimeMillis > l12.longValue() ? 1 : (utcTimeMillis == l12.longValue() ? 0 : -1)) <= 0);
        }

        @Override // p292l1.InterfaceC23142n3
        public /* bridge */ boolean isSelectableYear(int i13) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m43234A(C15220d c15220d, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, LocalDate date) {
        AbstractC22676k.m65750j(date, "date");
        m43240G(interfaceC28601c1, false);
        m43237D(interfaceC28601c2, date);
        C15222f c15222fM43281f = c15220d.getUpdateDatePicker();
        Action action = c15222fM43281f != null ? (Action) c15222fM43281f.getOnDateSelected().invoke(date) : null;
        C15221e c15221eM43282g = c15220d.getValidDateRange();
        m43247N(action, c15221eM43282g != null ? c15221eM43282g.m43284a(date) : null, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m43235B(InterfaceC28601c1 interfaceC28601c1) {
        m43240G(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m43236C(Modifier modifier, C15220d c15220d, Function1 function1, int i13, Composer composer, int i14) {
        m43275y(modifier, c15220d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m43237D(InterfaceC28601c1 interfaceC28601c1, LocalDate localDate) {
        interfaceC28601c1.setValue(localDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC28601c1 m43238E() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F */
    private static final boolean m43239F(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G */
    private static final void m43240G(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m43241H(Function1 function1, C15220d c15220d, LocalDate date) {
        AbstractC22676k.m65750j(date, "date");
        C15222f c15222fM43281f = c15220d.getUpdateDatePicker();
        function1.invoke(new DesignItemInteraction(c15222fM43281f != null ? (Action) c15222fM43281f.getOnDateSelected().invoke(date) : null, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m43242I(InterfaceC28601c1 interfaceC28601c1) {
        m43240G(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: J */
    private static final void m43243J(TextResource textResource, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        TextResource textResource2;
        int i15;
        boolean z13;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i16;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1708265494);
        if ((i13 & 6) == 0) {
            textResource2 = textResource;
            i15 = (c28655q2.m87153g(textResource2) ? 4 : 2) | i13;
        } else {
            textResource2 = textResource;
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    z13 = true;
                }
                c28655q = c28655q2;
                AbstractC27271o0.m82253b(null, z13, textResource2, C38072d.f163053a.m121952e(c28655q2, 6).getBtS(), null, null, null, null, false, AbstractC1099a.m3379a(1 * 8, 0.0f, 2), interfaceC4339a, c28655q, (i15 & 112) | 906166272 | ((i15 << 6) & 896), (i15 >> 6) & 14, 209);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(textResource, z15, interfaceC4339a, i13, i14, 7);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                z13 = true;
            }
            c28655q = c28655q2;
            AbstractC27271o0.m82253b(null, z13, textResource2, C38072d.f163053a.m121952e(c28655q2, 6).getBtS(), null, null, null, null, false, AbstractC1099a.m3379a(1 * 8, 0.0f, 2), interfaceC4339a, c28655q, (i15 & 112) | 906166272 | ((i15 << 6) & 896), (i15 >> 6) & 14, 209);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(textResource, z15, interfaceC4339a, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m43244K(TextResource textResource, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m43243J(textResource, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final C23204y m43246M(Composer composer, int i13) {
        C23067b0 c23067b0 = C23067b0.f90984a;
        C38072d c38072d = C38072d.f163053a;
        return C23067b0.m67042c(c38072d.m121949b(composer, 6).getBackgroundDarkStd(), c38072d.m121949b(composer, 6).getWhite70(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getWhite70(), c38072d.m121949b(composer, 6).getWhite70(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getWhite30(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getBrandBlack(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getWhite30(), c38072d.m121949b(composer, 6).getBrandBlack(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getBrandWhite(), c38072d.m121949b(composer, 6).getWhite10(), composer, 23401472);
    }

    /* JADX INFO: renamed from: N */
    private static final void m43247N(Action action, GenericInteraction genericInteraction, Function1 function1) {
        Action actionM74258b = genericInteraction != null ? AbstractC25294d0.m74258b(genericInteraction) : null;
        if (action != null && actionM74258b != null) {
            function1.invoke(new DesignItemInteraction(new ActionSequenceAction(AbstractC37056f.m118959K(new ActionSequenceStep(action, null), new ActionSequenceStep(actionM74258b, null))), AbstractC33054a.m104671b(genericInteraction, AbstractC34650k.m109496c())));
            return;
        }
        if (action != null) {
            function1.invoke(new DesignItemInteraction(action, null));
        }
        if (genericInteraction != null) {
            function1.invoke(genericInteraction);
        }
    }

    /* JADX INFO: renamed from: O */
    public static final InterfaceC23098g1 m43248O(LocalDate selectedDate, LocalDate localDate, LocalDate localDate2, Composer composer, int i13) {
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        Long lValueOf = localDate != null ? Long.valueOf(m43250Q(localDate)) : null;
        Long lValueOf2 = localDate2 != null ? Long.valueOf(m43250Q(localDate2)) : null;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(lValueOf) | c28655q.m87153g(lValueOf2);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new b(lValueOf, lValueOf2);
            c28655q.m87172p0(objM87133R);
        }
        return AbstractC23092f1.m67082p(Long.valueOf(m43250Q(selectedDate)), Long.valueOf(m43250Q(selectedDate)), new C18284j(localDate != null ? localDate.getYear() : Math.min(selectedDate.getYear(), C23067b0.f90985b.f71133w), localDate2 != null ? localDate2.getYear() : Math.max(selectedDate.getYear(), C23067b0.f90985b.f71134x), 1), (b) objM87133R, c28655q, 0);
    }

    /* JADX INFO: renamed from: P */
    private static final LocalDate m43249P(long j7) {
        LocalDate localDate = Instant.ofEpochMilli(j7).atZone(ZoneOffset.UTC).toLocalDate();
        AbstractC22676k.m65749i(localDate, "toLocalDate(...)");
        return localDate;
    }

    /* JADX INFO: renamed from: Q */
    private static final long m43250Q(LocalDate localDate) {
        return localDate.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    /* JADX INFO: renamed from: o */
    public static final void m43265o(InterfaceC23098g1 datePickerState, Composer composer, int i13) {
        int i14;
        InterfaceC23098g1 interfaceC23098g1;
        AbstractC22676k.m65750j(datePickerState, "datePickerState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1283051639);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(datePickerState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            interfaceC23098g1 = datePickerState;
            AbstractC23092f1.m67068b(interfaceC23098g1, null, null, m43246M(c28655q, 0), null, null, false, null, c28655q, (i14 & 14) | 1572864);
        } else {
            interfaceC23098g1 = datePickerState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(interfaceC23098g1, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m43266p(InterfaceC23098g1 interfaceC23098g1, int i13, Composer composer, int i14) {
        m43265o(interfaceC23098g1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m43267q(InterfaceC23098g1 interfaceC23098g1, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1593602794);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23098g1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Long lM67085b = ((C23104h1) interfaceC23098g1).m67085b();
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62233F);
            boolean z4 = lM67085b != null;
            boolean zM87153g = c28655q.m87153g(lM67085b) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C13989w1(11, lM67085b, function1);
                c28655q.m87172p0(objM87133R);
            }
            m43243J(c8688bM21277k, z4, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(interfaceC23098g1, function1, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m43268r(Long l7, Function1 function1) {
        if (l7 != null) {
            function1.invoke(m43249P(l7.longValue()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m43269s(InterfaceC23098g1 interfaceC23098g1, Function1 function1, int i13, Composer composer, int i14) {
        m43267q(interfaceC23098g1, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m43270t(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(737867167);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(localDate) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(localDate2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(localDate3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            InterfaceC23098g1 interfaceC23098g1M43248O = m43248O(localDate, localDate2, localDate3, c28655q, i14 & 1022);
            AbstractC23079d0.m67054a(interfaceC4339a, AbstractC37817c.m121344e(-188515791, c28655q, new C13857f(15, interfaceC23098g1M43248O, function1)), AbstractC1136a.m3599a(C2314t.f9131w, "DatePickerDialog"), AbstractC37817c.m121344e(1410633267, c28655q, new C2662y3(interfaceC4339a, 2)), null, 0, m43246M(c28655q, 0), null, AbstractC37817c.m121344e(-1085849656, c28655q, new C9722a(interfaceC23098g1M43248O, 1)), c28655q, ((i14 >> 12) & 14) | 100863408, 144);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) localDate, (Object) localDate2, (Object) localDate3, function1, (InterfaceC23459e) interfaceC4339a, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m43271u(InterfaceC23098g1 interfaceC23098g1, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m43267q(interfaceC23098g1, function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m43272v(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m43243J(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, R.string.cancel)), false, interfaceC4339a, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m43273w(InterfaceC23098g1 interfaceC23098g1, InterfaceC23013y DatePickerDialog, Composer composer, int i13) {
        AbstractC22676k.m65750j(DatePickerDialog, "$this$DatePickerDialog");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m43265o(interfaceC23098g1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m43274x(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m43270t(localDate, localDate2, localDate3, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x0189  */
    /* JADX WARN: Code duplicated, block: B:63:0x018d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x0236  */
    /* JADX WARN: Code duplicated, block: B:78:0x025a  */
    /* JADX WARN: Code duplicated, block: B:79:0x025c  */
    /* JADX WARN: Code duplicated, block: B:85:0x026b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0284  */
    /* JADX WARN: Code duplicated, block: B:91:0x0299  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: y */
    public static final void m43275y(Modifier modifier, C15220d c15220d, Function1 function1, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z4;
        int i15;
        long jM95627c;
        boolean z13;
        boolean z14;
        Object objM87133R;
        boolean zM87153g;
        Object objM87133R2;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(328328614);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c15220d) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zM87153g2 = c28655q.m87153g(c15220d.getSelectedDate());
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g2 || objM87133R3 == c28676v1) {
                objM87133R3 = AbstractC28683x.m87272z(c15220d.getSelectedDate());
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            Object[] objArr = new Object[0];
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v1) {
                objM87133R4 = new C14833a(18);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R4, c28655q, 48);
            int i16 = i14 & 896;
            boolean zM87157i = (i16 == 256) | c28655q.m87157i(c15220d);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v1) {
                objM87133R5 = new C14408a(12, function2, c15220d);
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function3 = (Function1) objM87133R5;
            boolean zM87157i2 = c28655q.m87157i(c15220d) | c28655q.m87153g(function3);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i2 || objM87133R6 == c28676v1) {
                objM87133R6 = new a(c15220d, function3, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
            boolean zM87153g3 = c28655q.m87153g(m43276z(interfaceC28601c1));
            Object objM87133R7 = c28655q.m87133R();
            if (zM87153g3 || objM87133R7 == c28676v1) {
                objM87133R7 = m43276z(interfaceC28601c1).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
                c28655q.m87172p0(objM87133R7);
            }
            String str = (String) objM87133R7;
            C2307m c2307m = C2299e.f9117z;
            float f13 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, modifier), 12 * f13, 0.0f, 2), 3, f13);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, 6).getBlack30(), AbstractC17918w0.f69621a);
            boolean zM43283h = c15220d.getIsEnabled();
            C18027i c18027i = new C18027i(0);
            boolean zM87153g4 = c28655q.m87153g(interfaceC28601c2);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87153g4) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R8 == c28676v0) {
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3358c, zM43283h, null, c18027i, (InterfaceC4339a) objM87133R8, 10), 2 * 8, 0.0f, 2), c15220d.getId());
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC22676k.m65747g(str);
                if (c15220d.getIsEnabled()) {
                    i15 = 6;
                    jM95627c = AbstractC25012a.m73366B(c28655q, 542822634, c38072d, c28655q, 6);
                    z4 = false;
                } else {
                    z4 = false;
                    i15 = 6;
                    jM95627c = AbstractC31061c.m95627c(c28655q, 542823719, c38072d, c28655q, 6);
                }
                c28655q.m87173q(z4);
                C28676v0 c28676v2 = c28676v0;
                AbstractC30795n.m94707h(str, null, jM95627c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (m43239F(interfaceC28601c2)) {
                    c28655q.m87150e0(1598698187);
                    LocalDate localDateM43276z = m43276z(interfaceC28601c1);
                    LocalDate localDateM43279c = c15220d.getMinimumDate();
                    LocalDate localDateM43278b = c15220d.getMaximumDate();
                    boolean zM87153g5 = c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(c15220d);
                    if (i16 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87153g5 | z13;
                    objM87133R = c28655q.m87133R();
                    if (!z14 || objM87133R == c28676v2) {
                        function2 = function1;
                        objM87133R = new C1042s(c15220d, function2, interfaceC28601c2, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function2 = function1;
                    }
                    Function1 function4 = (Function1) objM87133R;
                    zM87153g = c28655q.m87153g(interfaceC28601c2);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g || objM87133R2 == c28676v2) {
                        objM87133R2 = new C15218b(0, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m43270t(localDateM43276z, localDateM43279c, localDateM43278b, function4, (InterfaceC4339a) objM87133R2, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    function2 = function1;
                    c28655q.m87150e0(1599298812);
                    c28655q.m87173q(false);
                }
            }
            objM87133R8 = new C2192m(29, interfaceC28601c2);
            c28655q.m87172p0(objM87133R8);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3358c, zM43283h, null, c18027i, (InterfaceC4339a) objM87133R8, 10), 2 * 8, 0.0f, 2), c15220d.getId());
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC22676k.m65747g(str);
            if (c15220d.getIsEnabled()) {
                i15 = 6;
                jM95627c = AbstractC25012a.m73366B(c28655q, 542822634, c38072d, c28655q, 6);
                z4 = false;
            } else {
                z4 = false;
                i15 = 6;
                jM95627c = AbstractC31061c.m95627c(c28655q, 542823719, c38072d, c28655q, 6);
            }
            c28655q.m87173q(z4);
            C28676v0 c28676v3 = c28676v0;
            AbstractC30795n.m94707h(str, null, jM95627c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            if (m43239F(interfaceC28601c2)) {
                c28655q.m87150e0(1598698187);
                LocalDate localDateM43276z2 = m43276z(interfaceC28601c1);
                LocalDate localDateM43279c2 = c15220d.getMinimumDate();
                LocalDate localDateM43278b2 = c15220d.getMaximumDate();
                boolean zM87153g6 = c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(c15220d);
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87153g6 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    function2 = function1;
                    objM87133R = new C1042s(c15220d, function2, interfaceC28601c2, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function2 = function1;
                    objM87133R = new C1042s(c15220d, function2, interfaceC28601c2, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function5 = (Function1) objM87133R;
                zM87153g = c28655q.m87153g(interfaceC28601c2);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new C15218b(0, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C15218b(0, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R2);
                }
                m43270t(localDateM43276z2, localDateM43279c2, localDateM43278b2, function5, (InterfaceC4339a) objM87133R2, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                function2 = function1;
                c28655q.m87150e0(1599298812);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(i13, 22, modifier, c15220d, function2);
        }
    }

    /* JADX INFO: renamed from: z */
    private static final LocalDate m43276z(InterfaceC28601c1 interfaceC28601c1) {
        return (LocalDate) interfaceC28601c1.getValue();
    }
}
