package d42;

import a01.C0089i;
import a61.C0468a;
import a80.C0542f;
import am2.C1040r;
import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2476a1;
import b30.C2549j2;
import b30.C2633u2;
import b91.C2886a;
import bm2.C3433d0;
import c41.C4025f5;
import c42.C4164a;
import c42.C4165b;
import c42.C4180q;
import c42.C4181r;
import c42.C4182s;
import c42.C4183t;
import c42.C4184u;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.edit.C9790n;
import d11.C11473h;
import d30.C11546l;
import gb1.AbstractC15673b0;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import l83.C23454a0;
import l83.C23471q;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p000.C0003a0;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import u32.AbstractC34506a;
import u32.AbstractC34507b;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: d42.p */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009f\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001aI\u0010 \u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b \u0010!\u001a-\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lc42/r;", "parentViewState", "Lkotlin/Function0;", "Ll83/a0;", "onBackPressed", "onInfoClicked", "Lkotlin/Function1;", "", "onPregnancyCoachingToggled", "", "onLearnMoreClicked", "onDueDateSubmit", "onGeneralErrorTryAgainPressed", "onDueDateUpdateErrorTryAgainPressed", "Lcom/whoop/navigation/e;", "onPreviousPregnancyClicked", "Z", "(Lc42/r;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "N", "(Lc42/r;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "H", "(Lc42/r;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lc42/s;", "pregnancyToggleViewState", "b0", "(Lc42/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isEnabled", "Lc42/b;", "dueDateViewState", "Lc42/a;", "dueDateOptionsViewState", "onEmptyDueDateClicked", "C", "(ZLc42/b;Lc42/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lc42/u;", "privacyViewState", "g0", "(Lc42/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "pregnancy_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11700p {

    /* JADX INFO: renamed from: d42.p$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f37838w;

        public a(Function1 function1) {
            this.f37838w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m31288a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            if (it instanceof C9598e) {
                this.f37838w.invoke(it);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m31288a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d42.p$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f37839w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C39282o c39282o) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d42.p$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f37840w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f37841x;

        public c(Function1 function1, List list) {
            this.f37840w = function1;
            this.f37841x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m31290a(int i13) {
            return this.f37840w.invoke(this.f37841x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m31290a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: d42.p$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f37842w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f37843x;

        public d(List list, Function1 function1) {
            this.f37842w = list;
            this.f37843x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m31291a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C39282o c39282o = (C39282o) this.f37842w.get(i13);
            c28655q.m87150e0(-475661047);
            boolean zM87153g = c28655q.m87153g(this.f37843x);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new a(this.f37843x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c39282o, null, null, (Function1) objM87133R, c28655q, C39282o.f168987q, 6);
            AbstractC31061c.m95650z(3, 4, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m31291a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

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
    /* JADX INFO: renamed from: C */
    private static final void m31228C(boolean z4, C4165b c4165b, C4164a c4164a, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13) {
        int i14;
        C4165b c4165b2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1955911123);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c4165b) : c28655q.m87157i(c4165b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(c4164a) : c28655q.m87157i(c4164a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function1) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = 0;
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            C23471q c23471qM13017a = c4164a.getCalendarDialogStartDate();
            int iIntValue = ((Number) c23471qM13017a.f92947w).intValue();
            int iIntValue2 = ((Number) c23471qM13017a.f92948x).intValue();
            int iIntValue3 = ((Number) c23471qM13017a.f92949y).intValue();
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            int i16 = AbstractC34507b.f145070a;
            boolean zM87157i = c28655q.m87157i(calendar) | c28655q.m87157i(simpleDateFormat) | ((57344 & i14) == 16384);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C11697m(calendar, simpleDateFormat, function1, i15);
                c28655q.m87172p0(objM87133R);
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(context, i16, (DatePickerDialog.OnDateSetListener) objM87133R, iIntValue, iIntValue2, iIntValue3);
            DatePicker datePicker = datePickerDialog.getDatePicker();
            c4164a.getMinDate();
            datePicker.setMinDate(simpleDateFormat.parse(c4164a.getMinDate()).getTime());
            datePicker.setMaxDate(simpleDateFormat.parse(c4164a.getMaxDate()).getTime());
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(c4165b.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i17).getWhite10(), 0L, 0L, 0L, c28655q, 0, 14);
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(((float) 0.5d) * 4));
            boolean zM87157i2 = ((i14 & 14) == 4) | c28655q.m87157i(datePickerDialog) | ((i14 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C3433d0(z4, datePickerDialog, interfaceC4339a, 2);
                c28655q.m87172p0(objM87133R2);
            }
            c4165b2 = c4165b;
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R2, modifierM118994r, false, null, null, null, c15077m1M43196a, null, AbstractC37817c.m121344e(-396467673, c28655q, new C2476a1(c4165b2, 12)), c28655q, 805330944, 364);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c4165b2 = c4165b;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(z4, c4165b2, c4164a, interfaceC4339a, function1, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m31229D(Calendar calendar, SimpleDateFormat simpleDateFormat, Function1 function1, DatePicker datePicker, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(datePicker, "<unused var>");
        calendar.set(i13, i14, i15);
        String str = simpleDateFormat.format(calendar.getTime());
        AbstractC22676k.m65747g(str);
        function1.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m31230E(boolean z4, DatePickerDialog datePickerDialog, InterfaceC4339a interfaceC4339a) {
        if (z4) {
            datePickerDialog.show();
        } else {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m31231F(C4165b c4165b, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM21274h = AbstractC8693b.m21274h(c4165b.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m31232G(boolean z4, C4165b c4165b, C4164a c4164a, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m31228C(z4, c4165b, c4164a, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    private static final void m31233H(C4181r c4181r, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Composer composer, int i13) {
        C4181r c4181r2;
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1350352823);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            c4181r2 = c4181r;
            i14 = (c28655q2.m87157i(c4181r2) ? 4 : 2) | i13;
        } else {
            c4181r2 = c4181r;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            c28655q = c28655q2;
            c28655q.m87138X();
        } else if (c4181r2.getIsLoading()) {
            c28655q2.m87150e0(-608930935);
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q = c28655q2;
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q2;
            List list = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            Object[] objArr17 = 0;
            if (c4181r2.getDueDateLoading()) {
                c28655q.m87150e0(-608924913);
                AbstractC33199m0.m105214F(new AbstractC33208p0.e(new TextResource.C8688b(AbstractC34506a.f145064f, list, i15, objArr17 == true ? 1 : 0), C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCalendar()), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                boolean zM13063j = c4181r2.getIsGeneralError();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM13063j) {
                    c28655q.m87150e0(-608913485);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC34506a.f145066h, objArr16 == true ? 1 : 0, i15, objArr15 == true ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC34506a.f145069k, objArr14 == true ? 1 : 0, i15, objArr13 == true ? 1 : 0);
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC34506a.f145068j, objArr12 == true ? 1 : 0, i15, objArr11 == true ? 1 : 0);
                    boolean z4 = (i14 & 112) == 32;
                    Object objM87133R = c28655q.m87133R();
                    if (z4 || objM87133R == c28676v0) {
                        objM87133R = new C11699o(interfaceC4339a, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC34506a.f145060b, objArr10 == true ? 1 : 0, i15, objArr9 == true ? 1 : 0);
                    boolean z13 = (i14 & 7168) == 2048;
                    Object objM87133R2 = c28655q.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C11699o(interfaceC4339a3, 3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    int i16 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    int i17 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a4, true, false, c8688b3, interfaceC4339a5, null, false, false, c28655q, i16 | (i17 << 3) | (i17 << 9) | (i17 << 21), 0, 3652);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (c4181r2.getIsDueDateUpdateError()) {
                    c28655q.m87150e0(-608893791);
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC34506a.f145066h, objArr8 == true ? 1 : 0, i15, objArr7 == true ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC34506a.f145063e, objArr6 == true ? 1 : 0, i15, objArr5 == true ? 1 : 0);
                    TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC34506a.f145062d, objArr4 == true ? 1 : 0, i15, objArr3 == true ? 1 : 0);
                    boolean z14 = (i14 & 896) == 256;
                    Object objM87133R3 = c28655q.m87133R();
                    if (z14 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C11699o(interfaceC4339a2, 4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                    TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC34506a.f145060b, objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0);
                    boolean z15 = (i14 & 7168) == 2048;
                    Object objM87133R4 = c28655q.m87133R();
                    if (z15 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C11699o(interfaceC4339a3, 5);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R4;
                    int i18 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    int i19 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar2, c8688b4, null, c8688b5, interfaceC4339a6, true, false, c8688b6, interfaceC4339a7, null, false, false, c28655q, i18 | (i19 << 3) | (i19 << 9) | (i19 << 21), 0, 3652);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1695286535);
                    c28655q.m87173q(false);
                }
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4025f5(c4181r2, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m31234I(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m31235J(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m31236K(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m31237L(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m31238M(C4181r c4181r, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, Composer composer, int i14) {
        m31233H(c4181r, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    private static final void m31239N(C4181r c4181r, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Composer composer, int i13) {
        C4181r c4181r2;
        int i14;
        Function1 function5;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(113134790);
        if ((i13 & 6) == 0) {
            c4181r2 = c4181r;
            i14 = (c28655q.m87157i(c4181r2) ? 4 : 2) | i13;
        } else {
            c4181r2 = c4181r;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            function5 = function1;
            i14 |= c28655q.m87157i(function5) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            function5 = function1;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(function3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(function4) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 599187) != 599186)) {
            C4180q c4180qM13061h = c4181r2.getSettingsScreenViewState();
            if (c4180qM13061h == null) {
                c28655q.m87150e0(-1150334802);
                c28655q.m87173q(false);
                interfaceC4339a3 = interfaceC4339a;
            } else {
                c28655q.m87150e0(-1150334801);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
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
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC34506a.f145061c, null, 2, 0 == true ? 1 : 0);
                C38072d c38072d = C38072d.f163053a;
                AbstractC6721d.a aVar = new AbstractC6721d.a(c8688b, null, AbstractC38963t7.m124375e(c38072d), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), Integer.valueOf(c38072d.m121951d().getVarious().getEducation()), AbstractC30060g.m92103Y(c28655q, AbstractC34506a.f145059a), null, null, false, null, null, null, null, null, null, null, 65474, null);
                boolean z4 = (i14 & 112) == 32;
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z4 || objM87133R == c28676v0) {
                    interfaceC4339a3 = interfaceC4339a;
                    objM87133R = new C11699o(interfaceC4339a3, 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C11699o(interfaceC4339a2, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC6719b.m20143d(null, aVar, null, interfaceC4339a4, (InterfaceC4339a) objM87133R2, null, c28655q, AbstractC6721d.a.f25641r << 3, 37);
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3407d(1.0f, c2314t));
                boolean zM87157i = c28655q.m87157i(c4180qM13061h) | ((i14 & 7168) == 2048) | ((458752 & i14) == 131072) | ((3670016 & i14) == 1048576) | ((57344 & i14) == 16384);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C1040r((Object) c4180qM13061h, (Object) function5, (Object) function3, (Object) function4, (Object) function2, 7);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC22674j.m65717c(modifierM3394p, null, null, null, null, null, false, null, (Function1) objM87133R3, c28655q, 6, 510);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            interfaceC4339a3 = interfaceC4339a;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(c4181r, interfaceC4339a3, interfaceC4339a2, function1, function2, function3, function4, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m31240O(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m31241P(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m31242Q(C4180q c4180q, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C0542f((Object) c4180q, function1, (Object) function2, 11), true, 1570637980), 3);
        C4183t c4183tM13052e = c4180q.getPreviousPregnanciesSection();
        if (c4183tM13052e != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2476a1(c4183tM13052e, 11), true, 1398592006), 3);
            List<C39282o> listM13068a = c4183tM13052e.m13068a();
            b bVar = b.f37839w;
            ((C26053f) LazyColumn).m77529r(listM13068a.size(), null, new c(bVar, listM13068a), new C37816b(new d(listM13068a, function3), true, 802480018));
            InterfaceC26064q.m77556b(LazyColumn, null, C11685a.f37787a.m31159b(), 3);
        }
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C22931l(15, c4180q, function4), true, -1931742331), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m31243R(C4180q c4180q, Function1 function1, Function1 function2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C4182s c4182sM13051d = c4180q.getPregnancyToggle();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c4180q);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C9790n(11, function1, c4180q);
                c28655q.m87172p0(objM87133R);
            }
            int i14 = TextResource.$stable;
            m31255b0(c4182sM13051d, (Function1) objM87133R, c28655q, i14, 0);
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(6 * f13, c2314t));
            boolean zM13066b = c4180q.getPregnancyToggle().getEnabled();
            C4165b c4165bM13048a = c4180q.getDueDate();
            C4164a c4164aM13049b = c4180q.getDueDateOptions();
            boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(c4180q);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C11546l(3, function1, c4180q);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87153g3 = c28655q.m87153g(function2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C0468a(function2, 26);
                c28655q.m87172p0(objM87133R3);
            }
            m31228C(zM13066b, c4165bM13048a, c4164aM13049b, interfaceC4339a, (Function1) objM87133R3, c28655q, (i14 << 3) | (i14 << 6));
            AbstractC18489d0.m53380u(8, f13, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m31244S(Function1 function1, C4180q c4180q, boolean z4) {
        function1.invoke(Boolean.valueOf(c4180q.getPregnancyToggle().getEnabled()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m31245T(Function1 function1, C4180q c4180q) {
        function1.invoke(Boolean.valueOf(c4180q.getPregnancyToggle().getEnabled()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m31246U(Function1 function1, String selectedDueDate) {
        AbstractC22676k.m65750j(selectedDueDate, "selectedDueDate");
        function1.invoke(selectedDueDate);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m31247V(C4183t c4183t, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC17755i2.m50938j(null, null, null, c4183t.getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
            AbstractC18489d0.m53380u(2, 4, C2314t.f9131w, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m31248W(C4180q c4180q, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C4184u c4184uM13053f = c4180q.getPrivacy();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C0468a(function1, 27);
                c28655q.m87172p0(objM87133R);
            }
            m31265g0(c4184uM13053f, (Function1) objM87133R, c28655q, TextResource.$stable, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m31249X(Function1 function1, String url) {
        AbstractC22676k.m65750j(url, "url");
        function1.invoke(url);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m31250Y(C4181r c4181r, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i13, Composer composer, int i14) {
        m31239N(c4181r, interfaceC4339a, interfaceC4339a2, function1, function2, function3, function4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m31251Z(C4181r parentViewState, InterfaceC4339a onBackPressed, InterfaceC4339a onInfoClicked, Function1 onPregnancyCoachingToggled, Function1 onLearnMoreClicked, Function1 onDueDateSubmit, InterfaceC4339a onGeneralErrorTryAgainPressed, InterfaceC4339a onDueDateUpdateErrorTryAgainPressed, Function1 onPreviousPregnancyClicked, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(parentViewState, "parentViewState");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        AbstractC22676k.m65750j(onInfoClicked, "onInfoClicked");
        AbstractC22676k.m65750j(onPregnancyCoachingToggled, "onPregnancyCoachingToggled");
        AbstractC22676k.m65750j(onLearnMoreClicked, "onLearnMoreClicked");
        AbstractC22676k.m65750j(onDueDateSubmit, "onDueDateSubmit");
        AbstractC22676k.m65750j(onGeneralErrorTryAgainPressed, "onGeneralErrorTryAgainPressed");
        AbstractC22676k.m65750j(onDueDateUpdateErrorTryAgainPressed, "onDueDateUpdateErrorTryAgainPressed");
        AbstractC22676k.m65750j(onPreviousPregnancyClicked, "onPreviousPregnancyClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(683581048);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(parentViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onBackPressed) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onInfoClicked) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onPregnancyCoachingToggled) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onLearnMoreClicked) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(onDueDateSubmit) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(onGeneralErrorTryAgainPressed) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87157i(onDueDateUpdateErrorTryAgainPressed) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q.m87157i(onPreviousPregnancyClicked) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (38347923 & i15) != 38347922)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m31239N(parentViewState, onBackPressed, onInfoClicked, onPregnancyCoachingToggled, onLearnMoreClicked, onDueDateSubmit, onPreviousPregnancyClicked, c28655q, (524286 & i15) | ((i15 >> 6) & 3670016));
            int i16 = i15 >> 15;
            m31233H(parentViewState, onGeneralErrorTryAgainPressed, onDueDateUpdateErrorTryAgainPressed, onBackPressed, c28655q, (i16 & 896) | (i16 & 112) | (i15 & 14) | ((i15 << 6) & 7168));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11698n(parentViewState, onBackPressed, onInfoClicked, onPregnancyCoachingToggled, onLearnMoreClicked, onDueDateSubmit, onGeneralErrorTryAgainPressed, onDueDateUpdateErrorTryAgainPressed, onPreviousPregnancyClicked, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m31253a0(C4181r c4181r, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, Function1 function2, Function1 function3, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, Function1 function4, int i13, Composer composer, int i14) {
        m31251Z(c4181r, interfaceC4339a, interfaceC4339a2, function1, function2, function3, interfaceC4339a3, interfaceC4339a4, function4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b0 */
    private static final void m31255b0(C4182s c4182s, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1767996869);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c4182s) : c28655q2.m87157i(c4182s) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C11473h(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22961h c22961h = AbstractC22977m.f90656g;
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, 8, c2306l, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                TextResource textResourceM13067c = c4182s.getTitle();
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM13067c, c28655q2, i17);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q2, i18).getBrandWhite();
                C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i18).getH4();
                int i19 = C2886a.f11498d << 18;
                c28655q = c28655q2;
                Function1 function5 = function4;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i19, 196602);
                c28655q.m87173q(true);
                AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i18).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-831969712, c28655q, new C0003a0(22, c4182s, function5)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(5 * 4, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4182s.getDescription(), c28655q, i17), null, c38072d.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 0, i19, 196602);
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(c4182s, i13, function3, i14, 28);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C11473h(4);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22961h c22961h2 = AbstractC22977m.f90656g;
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(1, 8, c2306l2, c28655q2, 54);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M53376q2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            TextResource textResourceM13067c2 = c4182s.getTitle();
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM13067c2, c28655q2, i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            long jM125430y2 = c38072d2.m121949b(c28655q2, i111).getBrandWhite();
            C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q2, i111).getH4();
            int i112 = C2886a.f11498d << 18;
            c28655q = c28655q2;
            Function1 function6 = function4;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q, 0, i112, 196602);
            c28655q.m87173q(true);
            AbstractC39330c.m125320b(0L, c38072d2.m121949b(c28655q, i111).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-831969712, c28655q, new C0003a0(22, c4182s, function6)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(5 * 4, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4182s.getDescription(), c28655q, i110), null, c38072d2.m121949b(c28655q, i111).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getB2(), null, c28655q, 0, i112, 196602);
            function3 = function6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(c4182s, i13, function3, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m31257c0(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m31259d0(C4182s c4182s, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM13066b = c4182s.getEnabled();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c4182s);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C9790n(10, function1, c4182s);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zM13066b, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m31261e0(Function1 function1, C4182s c4182s, boolean z4) {
        function1.invoke(Boolean.valueOf(c4182s.getEnabled()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m31263f0(C4182s c4182s, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m31255b0(c4182s, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01da  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0205  */
    /* JADX WARN: Code duplicated, block: B:68:0x0241  */
    /* JADX WARN: Code duplicated, block: B:71:0x024c  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    private static final void m31265g0(C4184u c4184u, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Function1 function5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        boolean z13;
        C4184u c4184u2;
        boolean z14;
        Object objM87133R;
        Function1 function6;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1106286573);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c4184u) : c28655q.m87157i(c4184u) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C11473h(5);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                function5 = function4;
                float f13 = 1;
                float f14 = 4;
                float f15 = f13 * f14;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q, i18).getWhite5(), AbstractC33253j.m105489e(f15));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                float f16 = 8;
                float f17 = ((float) 2.5d) * f16;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
                TextResource textResourceM13073d = c4184u.getTitle();
                int i19 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM13073d, c28655q, i19);
                long jM125430y = c38072d.m121949b(c28655q, i18).getBrandWhite();
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i18).getB1();
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2);
                int i24 = C2886a.f11498d << 18;
                boolean z15 = false;
                i16 = i15;
                AbstractC30795n.m94707h(strM21274h, modifierM3396r, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 48, i24, 196600);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14 * f14, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4184u.getDescription(), c28655q, i19), AbstractC1099a.m3396r(c2314t, f17, 0.0f, 2), c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 48, i24, 196600);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextLarge;
                TextResource textResourceM13070a = c4184u.getCtaText();
                C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i16 & 14) != 4) {
                    if ((i16 & 8) != 0) {
                        c4184u2 = c4184u;
                        if (c28655q.m87157i(c4184u2)) {
                        }
                    } else {
                        c4184u2 = c4184u;
                    }
                    z14 = z13 | z15;
                    objM87133R = c28655q.m87133R();
                    if (!z14 || objM87133R == c28676v0) {
                        function6 = function5;
                        objM87133R = new C9790n(12, function6, c4184u2);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                    }
                    AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM13070a, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i19 << 6) | 48 | (C39274g.f168929c << 12), 0, 4073);
                    AbstractC31061c.m95650z(f13, f16, c2314t, c28655q, true);
                    function3 = function6;
                } else {
                    c4184u2 = c4184u;
                }
                z15 = true;
                z14 = z13 | z15;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    function6 = function5;
                    objM87133R = new C9790n(12, function6, c4184u2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C9790n(12, function6, c4184u2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM13070a, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i19 << 6) | 48 | (C39274g.f168929c << 12), 0, 4073);
                AbstractC31061c.m95650z(f13, f16, c2314t, c28655q, true);
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(c4184u, i13, function3, i14, 29);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C11473h(5);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            function5 = function4;
            float f18 = 1;
            float f19 = 4;
            float f110 = f18 * f19;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM3409f2, c38072d2.m121949b(c28655q, i110).getWhite5(), AbstractC33253j.m105489e(f110));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            float f111 = 8;
            float f112 = ((float) 2.5d) * f111;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f112, c2314t2));
            TextResource textResourceM13073d2 = c4184u.getTitle();
            int i111 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM13073d2, c28655q, i111);
            long jM125430y2 = c38072d2.m121949b(c28655q, i110).getBrandWhite();
            C2886a c2886aM8420a2 = c38072d2.m121952e(c28655q, i110).getB1();
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t2, f112, 0.0f, 2);
            int i25 = C2886a.f11498d << 18;
            boolean z16 = false;
            i16 = i15;
            AbstractC30795n.m94707h(strM21274h2, modifierM3396r2, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 48, i25, 196600);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19 * f19, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4184u.getDescription(), c28655q, i111), AbstractC1099a.m3396r(c2314t2, f112, 0.0f, 2), c38072d2.m121949b(c28655q, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getB2(), null, c28655q, 48, i25, 196600);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f110, c2314t2));
            EnumC27269n0 enumC27269n1 = EnumC27269n0.TextLarge;
            TextResource textResourceM13070a2 = c4184u.getCtaText();
            C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(c38072d2), null, 2, 0 == true ? 1 : 0);
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i16 & 14) != 4) {
                if ((i16 & 8) != 0) {
                    c4184u2 = c4184u;
                    if (c28655q.m87157i(c4184u2)) {
                    }
                } else {
                    c4184u2 = c4184u;
                }
                z14 = z13 | z16;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    function6 = function5;
                    objM87133R = new C9790n(12, function6, c4184u2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C9790n(12, function6, c4184u2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(null, enumC27269n1, textResourceM13070a2, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i111 << 6) | 48 | (C39274g.f168929c << 12), 0, 4073);
                AbstractC31061c.m95650z(f18, f111, c2314t2, c28655q, true);
                function3 = function6;
            } else {
                c4184u2 = c4184u;
            }
            z16 = true;
            z14 = z13 | z16;
            objM87133R = c28655q.m87133R();
            if (z14) {
                function6 = function5;
                objM87133R = new C9790n(12, function6, c4184u2);
                c28655q.m87172p0(objM87133R);
            } else {
                function6 = function5;
                objM87133R = new C9790n(12, function6, c4184u2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27265l0.m82217i(null, enumC27269n1, textResourceM13070a2, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i111 << 6) | 48 | (C39274g.f168929c << 12), 0, 4073);
            AbstractC31061c.m95650z(f18, f111, c2314t2, c28655q, true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(c4184u, i13, function3, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m31267h0(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m31269i0(Function1 function1, C4184u c4184u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c4184u.getCtaUrl());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m31271j0(C4184u c4184u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m31265g0(c4184u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
