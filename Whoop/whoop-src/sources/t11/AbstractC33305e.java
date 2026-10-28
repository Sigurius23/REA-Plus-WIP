package t11;

import a00.C0073h;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.AbstractC2890e;
import b91.EnumC2888c;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import dp0.C12253i;
import fy1.C14873i;
import ge3.AbstractC15751g;
import hy0.C17758j1;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Locale;
import l83.C23454a0;
import l83.InterfaceC23459e;
import live.hms.video.utils.AndroidSDKConstants;
import m03.C24887c;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p164g2.C15240l;
import p164g2.C15247s;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34323i;
import p510u0.C34348q0;
import p510u0.C34351r0;
import p510u0.InterfaceC34345p0;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p720m91.AbstractC25303l;
import p733ry2.C31918g;
import p733ry2.C31919h;
import p736sz0.C33192k;
import p736sz0.C33194k1;
import q12.C29802c;
import q81.C30048f;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg2.C32451b;
import sr2.C32940v;
import t01.C33259e;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: t11.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a}\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00192\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010#\"\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006.²\u0006\u0010\u0010)\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lt11/f;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "n", "(Landroidx/compose/ui/Modifier;Lt11/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lt11/g;", "", "isSelected", "Lkotlin/Function0;", "onClick", "K", "(Landroidx/compose/ui/Modifier;Lt11/g;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "label", "", "text", "hintText", "", "maxCharacterCount", "maxLines", "Ly3/f;", "height", "isError", "isEnabled", "readOnly", "cornerRadius", "onTextChanged", "A", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;IIFZZZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "y", "(Landroidx/compose/runtime/Composer;I)V", "a", "Lt11/f;", "S", "()Lt11/f;", "fakeFeedbackSurveyState", "selectedTileId", "shouldFocusTextArea", "shouldDismissKeyboard", "currentText", "isFocused", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33305e {

    /* JADX INFO: renamed from: a */
    private static final C33306f f138886a = new C33306f(null, new C33194k1(null, AbstractC8693b.m21278l("Why do you want to end your subscription?"), AbstractC8693b.m21278l("Help us improve WHOOP Advanced Labs for you and the entire WHOOP community."), null, null, EnumC2888c.T3, EnumC2888c.B2, 0, 0, 0, null, 1944, null), AbstractC37056f.m118959K(new C33307g(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, AbstractC8693b.m21278l("Want to take a break"), false), new C33307g("2", AbstractC8693b.m21278l("Too expensive"), false), new C33307g("3", AbstractC8693b.m21278l("Not satisfied with Advanced Labs testing"), false), new C33307g("4", AbstractC8693b.m21278l("Something else"), true)), new C33308h(null, null, AbstractC8693b.m21267a(), AbstractC8693b.m21278l("Add a note..."), null, 0, 0, 0.0f, false, false, false, null, false, 0.0f, 16352, null));

    /* JADX INFO: renamed from: t11.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.feedbacksurvey.FeedbackSurveyKt$FeedbackSurvey$2$1", m100430f = "FeedbackSurvey.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138887w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15247s f138888x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f138889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15247s c15247s, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138888x = c15247s;
            this.f138889y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f138888x, this.f138889y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f138887w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC33305e.m105653v(this.f138889y)) {
                C15247s.m43350c(this.f138888x);
                AbstractC33305e.m105654w(this.f138889y, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: t11.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.feedbacksurvey.FeedbackSurveyKt$FeedbackSurvey$3$1", m100430f = "FeedbackSurvey.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138890w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC15237i f138891x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f138892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC15237i interfaceC15237i, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f138891x = interfaceC15237i;
            this.f138892y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f138891x, this.f138892y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f138890w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC33305e.m105655x(this.f138892y)) {
                ((C15240l) this.f138891x).m43339b(false);
                AbstractC33305e.m105647p(this.f138892y, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: t11.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m105658a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(2145146596);
            AbstractC33305e.m105645n(null, AbstractC33305e.m105631S(), null, c28655q, 0, 5);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m105658a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0208  */
    /* JADX WARN: Code duplicated, block: B:126:0x020c  */
    /* JADX WARN: Code duplicated, block: B:131:0x022f  */
    /* JADX WARN: Code duplicated, block: B:134:0x023f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0262  */
    /* JADX WARN: Code duplicated, block: B:137:0x0273  */
    /* JADX WARN: Code duplicated, block: B:140:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:143:0x031b  */
    /* JADX WARN: Code duplicated, block: B:144:0x031f  */
    /* JADX WARN: Code duplicated, block: B:149:0x033a  */
    /* JADX WARN: Code duplicated, block: B:152:0x035e  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0405  */
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
    /* JADX INFO: renamed from: A */
    private static final void m105613A(Modifier modifier, final TextResource textResource, final String str, TextResource textResource2, final int i13, final int i14, final float f13, final boolean z4, final boolean z13, final boolean z14, final float f14, final Function1 function1, Composer composer, final int i15, final int i16, final int i17) {
        Modifier modifier2;
        int i18;
        String str2;
        int i19;
        C28655q c28655q;
        TextResource textResource3;
        final Modifier modifier3;
        int i24;
        long jM125416r;
        long jM95628d;
        long jM125380b;
        boolean z15;
        C38072d c38072d;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2;
        int iHashCode2;
        Object objM87133R;
        Object objM87133R2;
        int i25;
        int i26;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c1;
        long jM73370c;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(598968927);
        int i27 = i17 & 1;
        if (i27 != 0) {
            i18 = i15 | 6;
            modifier2 = modifier;
        } else if ((i15 & 6) == 0) {
            modifier2 = modifier;
            i18 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i15;
        } else {
            modifier2 = modifier;
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= c28655q3.m87153g(textResource) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            str2 = str;
            i18 |= c28655q3.m87153g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i15 & 3072) == 0) {
            i18 |= c28655q3.m87153g(textResource2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i18 |= c28655q3.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            i18 |= c28655q3.m87149e(i14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i15 & 1572864) == 0) {
            i18 |= c28655q3.m87147d(f13) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i18 |= c28655q3.m87155h(z4) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i18 |= c28655q3.m87155h(z13) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i15 & 805306368) == 0) {
            i18 |= c28655q3.m87155h(z14) ? 536870912 : 268435456;
        }
        if ((i16 & 6) == 0) {
            i19 = i16 | (c28655q3.m87147d(f14) ? 4 : 2);
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= c28655q3.m87157i(function1) ? 32 : 16;
        }
        int i28 = i19;
        if (c28655q3.m87135U(i18 & 1, ((306783379 & i18) == 306783378 && (i28 & 19) == 18) ? false : true)) {
            C2314t c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier2 = c2314t;
            }
            Object objM87133R4 = c28655q3.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(str2);
                c28655q3.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q3.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
            if (z4) {
                c28655q3.m87150e0(-1705337809);
                i24 = 6;
                jM125416r = C38072d.f163053a.m121949b(c28655q3, 6).getAccentAlertTrend15();
                c28655q3.m87173q(false);
            } else {
                i24 = 6;
                c28655q3.m87150e0(-1705280614);
                jM125416r = C38072d.f163053a.m121949b(c28655q3, 6).getBlack30();
                c28655q3.m87173q(false);
            }
            long j7 = jM125416r;
            if (m105616D(interfaceC28601c3)) {
                c28655q3.m87150e0(-1705201254);
                jM125380b = C38072d.f163053a.m121949b(c28655q3, i24).getWhite70();
                z15 = false;
                c28655q3.m87173q(false);
            } else {
                if (z4) {
                    c28655q3.m87150e0(-1705141610);
                    jM125380b = C38072d.f163053a.m121949b(c28655q3, i24).getAccentAlert();
                    z15 = false;
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(-1705091142);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q3, i24, false);
                }
                c38072d = C38072d.f163053a;
                long jM125430y = c38072d.m121949b(c28655q3, i24).getBrandWhite();
                long jM125382b1 = c38072d.m121949b(c28655q3, i24).getWhite50();
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                Modifier modifier4 = modifier2;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                if (AbstractC8693b.m21270d(textResource)) {
                    c28655q3.m87150e0(-16663689);
                    String upperCase = AbstractC8693b.m21274h(textResource, c28655q3, (i18 >> 3) & 14).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (m105616D(interfaceC28601c3)) {
                        long jM73366B = AbstractC25012a.m73366B(c28655q3, 1523489555, c38072d, c28655q3, 6);
                        c28655q3.m87173q(false);
                        jM73370c = jM73366B;
                    } else {
                        jM73370c = AbstractC25012a.m73370c(c28655q3, 1523490640, c38072d, c28655q3, 6);
                        c28655q3.m87173q(false);
                    }
                    AbstractC30795n.m94707h(upperCase, modifierM3409f, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q3, 48, 0, 196600);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(false);
                } else {
                    c28655q2 = c28655q3;
                    c28655q2.m87150e0(-16354247);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t)), AbstractC33253j.m105489e(f14)), j7, AbstractC17918w0.f69621a), 1, jM95628d, AbstractC33253j.m105489e(f14));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM44455h);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                String strM105614B = m105614B(interfaceC28601c2);
                float f15 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), 2 * f15, ((float) 1.5d) * f15);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C29802c(12, interfaceC28601c3);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3484c = AbstractC1126a.m3484c(modifierM3395q, (Function1) objM87133R);
                C23285v0 c23285v0 = new C23285v0(jM125430y, AbstractC2890e.m8450e().getB1().getStyle().f92255a.f92192b, null, null, null, 0L, null, null, 5, AbstractC2890e.m8450e().getB1().getStyle().f92256b.f92106c, 16613372);
                C17875c1 c17875c1 = new C17875c1(c38072d.m121949b(c28655q2, 6).getBrandWhite());
                int i29 = 0;
                C34351r0 c34351r0 = new C34351r0(i29, i29, 7, 119);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C33192k(7);
                    c28655q2.m87172p0(objM87133R2);
                }
                C34348q0 c34348q0 = new C34348q0((Function1) objM87133R2, null, null, null, 62);
                if ((i18 & 57344) == 16384) {
                    i25 = 1;
                } else {
                    i25 = 0;
                }
                i26 = i25 | ((i28 & 112) == 32 ? 1 : 0);
                objM87133R3 = c28655q2.m87133R();
                if (i26 == 0 || objM87133R3 == c28676v0) {
                    interfaceC28601c1 = interfaceC28601c2;
                    objM87133R3 = new C17758j1(i13, function1, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c1 = interfaceC28601c2;
                }
                textResource3 = textResource2;
                int i34 = i18 >> 15;
                C28655q c28655q4 = c28655q2;
                AbstractC34323i.m108619a(strM105614B, (Function1) objM87133R3, modifierM3484c, z13, z14, c23285v0, c34351r0, c34348q0, false, i14, 0, null, null, null, c17875c1, AbstractC37817c.m121344e(-1368684474, c28655q2, new C24887c(textResource3, jM125382b1, interfaceC28601c1)), c28655q4, (i34 & 57344) | (i34 & 7168) | 1572864 | ((i18 << 12) & 1879048192), ProfileVerifier.CompilationStatus.f6515xf2722a21, 15616);
                c28655q = c28655q4;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            }
            jM95628d = jM125380b;
            c38072d = C38072d.f163053a;
            long jM125430y2 = c38072d.m121949b(c28655q3, i24).getBrandWhite();
            long jM125382b2 = c38072d.m121949b(c28655q3, i24).getWhite50();
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            Modifier modifier5 = modifier2;
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N3);
            if (AbstractC8693b.m21270d(textResource)) {
                c28655q3.m87150e0(-16663689);
                String upperCase2 = AbstractC8693b.m21274h(textResource, c28655q3, (i18 >> 3) & 14).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (m105616D(interfaceC28601c3)) {
                    long jM73366B2 = AbstractC25012a.m73366B(c28655q3, 1523489555, c38072d, c28655q3, 6);
                    c28655q3.m87173q(false);
                    jM73370c = jM73366B2;
                } else {
                    jM73370c = AbstractC25012a.m73370c(c28655q3, 1523490640, c38072d, c28655q3, 6);
                    c28655q3.m87173q(false);
                }
                AbstractC30795n.m94707h(upperCase2, modifierM3409f2, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getFormLabel(), null, c28655q3, 48, 0, 196600);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            } else {
                c28655q2 = c28655q3;
                c28655q2.m87150e0(-16354247);
                c28655q2.m87173q(false);
            }
            Modifier modifierM44455h2 = AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t)), AbstractC33253j.m105489e(f14)), j7, AbstractC17918w0.f69621a), 1, jM95628d, AbstractC33253j.m105489e(f14));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM44455h2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            String strM105614B2 = m105614B(interfaceC28601c2);
            float f16 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), 2 * f16, ((float) 1.5d) * f16);
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C29802c(12, interfaceC28601c3);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3484c2 = AbstractC1126a.m3484c(modifierM3395q2, (Function1) objM87133R);
            C23285v0 c23285v1 = new C23285v0(jM125430y2, AbstractC2890e.m8450e().getB1().getStyle().f92255a.f92192b, null, null, null, 0L, null, null, 5, AbstractC2890e.m8450e().getB1().getStyle().f92256b.f92106c, 16613372);
            C17875c1 c17875c2 = new C17875c1(c38072d.m121949b(c28655q2, 6).getBrandWhite());
            int i210 = 0;
            C34351r0 c34351r1 = new C34351r0(i210, i210, 7, 119);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C33192k(7);
                c28655q2.m87172p0(objM87133R2);
            }
            C34348q0 c34348q1 = new C34348q0((Function1) objM87133R2, null, null, null, 62);
            if ((i18 & 57344) == 16384) {
                i25 = 1;
            } else {
                i25 = 0;
            }
            i26 = i25 | ((i28 & 112) == 32 ? 1 : 0);
            objM87133R3 = c28655q2.m87133R();
            if (i26 == 0) {
                interfaceC28601c1 = interfaceC28601c2;
                objM87133R3 = new C17758j1(i13, function1, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R3);
            } else {
                interfaceC28601c1 = interfaceC28601c2;
                objM87133R3 = new C17758j1(i13, function1, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R3);
            }
            textResource3 = textResource2;
            int i35 = i18 >> 15;
            C28655q c28655q5 = c28655q2;
            AbstractC34323i.m108619a(strM105614B2, (Function1) objM87133R3, modifierM3484c2, z13, z14, c23285v1, c34351r1, c34348q1, false, i14, 0, null, null, null, c17875c2, AbstractC37817c.m121344e(-1368684474, c28655q2, new C24887c(textResource3, jM125382b2, interfaceC28601c1)), c28655q5, (i35 & 57344) | (i35 & 7168) | 1572864 | ((i18 << 12) & 1879048192), ProfileVerifier.CompilationStatus.f6515xf2722a21, 15616);
            c28655q = c28655q5;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q3;
            textResource3 = textResource2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final TextResource textResource4 = textResource3;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: t11.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC33305e.m105622J(modifier3, textResource, str, textResource4, i13, i14, f13, z4, z13, z14, f14, function1, i15, i16, i17, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: B */
    private static final String m105614B(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: C */
    private static final void m105615C(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: D */
    private static final boolean m105616D(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: E */
    private static final void m105617E(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m105618F(InterfaceC28601c1 interfaceC28601c1, InterfaceC15250v focusState) {
        AbstractC22676k.m65750j(focusState, "focusState");
        m105617E(interfaceC28601c1, ((EnumC15251w) focusState).m43353a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m105619G(InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m105620H(int i13, Function1 function1, InterfaceC28601c1 interfaceC28601c1, String newText) {
        AbstractC22676k.m65750j(newText, "newText");
        if (newText.length() <= i13) {
            m105615C(interfaceC28601c1, newText);
            function1.invoke(newText);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m105621I(TextResource textResource, long j7, InterfaceC28601c1 interfaceC28601c1, InterfaceC4351m innerTextField, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(innerTextField, "innerTextField");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87157i(innerTextField) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            innerTextField.invoke(c28655q2, Integer.valueOf(i14 & 14));
            if (m105614B(interfaceC28601c1).length() == 0) {
                c28655q2.m87150e0(-1104098180);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, 0), AbstractC1102d.m3409f(1.0f, c2314t), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB1(), null, c28655q2, 48, 0, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-1103789854);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m105622J(Modifier modifier, TextResource textResource, String str, TextResource textResource2, int i13, int i14, float f13, boolean z4, boolean z13, boolean z14, float f14, Function1 function1, int i15, int i16, int i17, Composer composer, int i18) {
        m105613A(modifier, textResource, str, textResource2, i13, i14, f13, z4, z13, z14, f14, function1, composer, AbstractC28683x.m87244L(i15 | 1), AbstractC28683x.m87244L(i16), i17);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0118  */
    /* JADX WARN: Code duplicated, block: B:82:0x015c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:86:0x0173  */
    /* JADX WARN: Code duplicated, block: B:88:0x0181  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    private static final void m105623K(Modifier modifier, C33307g c33307g, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        long jM95628d;
        long jM95624D;
        Object objM87133R;
        boolean z17;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1483927847);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(c33307g) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = 2048;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32940v(24);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (z16) {
                        c28655q.m87150e0(404084541);
                        jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(404134048);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (z16) {
                        c28655q.m87150e0(404211517);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(404261117);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    float f13 = 4;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier3), f13, f13), jM95628d, AbstractC17918w0.f69621a);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                    C18027i c18027i = new C18027i(0);
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C31918g(interfaceC4339a4, 4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1092a.m3360e(modifierM3358c, interfaceC21083i, null, false, c18027i, (InterfaceC4339a) objM87133R2, 12));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c33307g.getText(), c28655q, 0), null, jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getB1(), null, c28655q, 0, 0, 196602);
                    c28655q.m87173q(true);
                    boolean z18 = z16;
                    interfaceC4339a3 = interfaceC4339a4;
                    z15 = z18;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) c33307g, z15, (InterfaceC23459e) interfaceC4339a3, i13, i14, 4);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32940v(24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (z16) {
                    c28655q.m87150e0(404084541);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(404134048);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z16) {
                    c28655q.m87150e0(404211517);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(404261117);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                float f14 = 4;
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier3), f14, f14), jM95628d, AbstractC17918w0.f69621a);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                C18027i c18027i2 = new C18027i(0);
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    objM87133R2 = new C31918g(interfaceC4339a4, 4);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C31918g(interfaceC4339a4, 4);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * 8, AbstractC1092a.m3360e(modifierM3358c2, interfaceC21083i2, null, false, c18027i2, (InterfaceC4339a) objM87133R2, 12));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
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
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c33307g.getText(), c28655q, 0), null, jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getB1(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(true);
                boolean z19 = z16;
                interfaceC4339a3 = interfaceC4339a4;
                z15 = z19;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) c33307g, z15, (InterfaceC23459e) interfaceC4339a3, i13, i14, 4);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32940v(24);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (z16) {
                    c28655q.m87150e0(404084541);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(404134048);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z16) {
                    c28655q.m87150e0(404211517);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(404261117);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                float f15 = 4;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier3), f15, f15), jM95628d, AbstractC17918w0.f69621a);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                C18027i c18027i3 = new C18027i(0);
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    objM87133R2 = new C31918g(interfaceC4339a4, 4);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C31918g(interfaceC4339a4, 4);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(2 * 8, AbstractC1092a.m3360e(modifierM3358c3, interfaceC21083i3, null, false, c18027i3, (InterfaceC4339a) objM87133R2, 12));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c33307g.getText(), c28655q, 0), null, jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getB1(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(true);
                boolean z110 = z16;
                interfaceC4339a3 = interfaceC4339a4;
                z15 = z110;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) c33307g, z15, (InterfaceC23459e) interfaceC4339a3, i13, i14, 4);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i19 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C32940v(24);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (z16) {
                c28655q.m87150e0(404084541);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(404134048);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            if (z16) {
                c28655q.m87150e0(404211517);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(404261117);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            float f16 = 4;
            Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier3), f16, f16), jM95628d, AbstractC17918w0.f69621a);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
            C18027i c18027i4 = new C18027i(0);
            if ((i15 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z17) {
                objM87133R2 = new C31918g(interfaceC4339a4, 4);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C31918g(interfaceC4339a4, 4);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(2 * 8, AbstractC1092a.m3360e(modifierM3358c4, interfaceC21083i4, null, false, c18027i4, (InterfaceC4339a) objM87133R2, 12));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c33307g.getText(), c28655q, 0), null, jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getB1(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
            boolean z111 = z16;
            interfaceC4339a3 = interfaceC4339a4;
            z15 = z111;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) c33307g, z15, (InterfaceC23459e) interfaceC4339a3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m105624L() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m105625M(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m105626N(Modifier modifier, C33307g c33307g, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m105623K(modifier, c33307g, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    public static final C33306f m105631S() {
        return f138886a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x025e  */
    /* JADX WARN: Code duplicated, block: B:106:0x028b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0296  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0209  */
    /* JADX WARN: Code duplicated, block: B:95:0x0219  */
    /* JADX WARN: Code duplicated, block: B:98:0x0253  */
    /* JADX WARN: Code duplicated, block: B:99:0x0255  */
    /* JADX INFO: renamed from: n */
    public static final void m105645n(Modifier modifier, C33306f state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        C15247s c15247s;
        InterfaceC15237i interfaceC15237i;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R5;
        boolean zM87157i;
        Object objM87133R6;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        Function1 function5;
        C33308h c33308hM105660b;
        TextResource textResourceM105672i;
        boolean z13;
        Object objM87133R7;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R8;
        C33307g c33307g;
        Object objM87133R9;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(109188230);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C33192k(6);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC33745d.m106649h(c28655q);
                }
                c15247s = (C15247s) objM87133R2;
                interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                Boolean boolValueOf = Boolean.valueOf(m105653v(interfaceC28601c2));
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new a(c15247s, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf);
                Boolean boolValueOf2 = Boolean.valueOf(m105655x(interfaceC28601c3));
                zM87157i = c28655q.m87157i(interfaceC15237i);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i || objM87133R6 == c28676v0) {
                    objM87133R6 = new b(interfaceC15237i, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, boolValueOf2);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                AbstractC25303l.m74291r(state.getTitleSubtitle(), null, null, null, c28655q, 0, 14);
                f13 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(8 * f13, c2314t));
                c28655q.m87150e0(1426595139);
                for (C33307g c33307g2 : state.m105659a()) {
                    boolean zM65745e = AbstractC22676k.m65745e(m105651t(interfaceC28601c1), c33307g2.getId());
                    boolean zM87153g = c28655q.m87153g(c33307g2);
                    if ((i16 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g | z15;
                    objM87133R8 = c28655q.m87133R();
                    if (!z16 || objM87133R8 == c28676v0) {
                        c33307g = c33307g2;
                        objM87133R8 = new C0073h(c33307g, function4, interfaceC28601c1, interfaceC28601c3, interfaceC28601c2, 23);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        c33307g = c33307g2;
                    }
                    m105623K(null, c33307g, zM65745e, (InterfaceC4339a) objM87133R8, c28655q, 0, 1);
                    AbstractC18489d0.m53380u(3, f13, c2314t, c28655q);
                }
                function5 = function4;
                c28655q.m87173q(false);
                c33308hM105660b = state.getTextAreaState();
                if (c33308hM105660b == null) {
                    c28655q.m87150e0(1275700119);
                    c28655q.m87173q(false);
                    z14 = true;
                } else {
                    c28655q.m87150e0(1275700120);
                    Modifier modifierM3483b = AbstractC1126a.m3483b(c2314t, c15247s);
                    textResourceM105672i = c33308hM105660b.getLabel();
                    if (textResourceM105672i == null) {
                        textResourceM105672i = AbstractC8693b.m21267a();
                    }
                    String strM21274h = AbstractC8693b.m21274h(c33308hM105660b.getText(), c28655q, 0);
                    TextResource textResource = textResourceM105672i;
                    TextResource textResourceM105671h = c33308hM105660b.getHintText();
                    int iM105673j = c33308hM105660b.getMaxCharacterCount();
                    int iM105674k = c33308hM105660b.getMaxLines();
                    float fM105670g = c33308hM105660b.getHeight();
                    boolean zM105679p = c33308hM105660b.getIsError();
                    boolean zM105678o = c33308hM105660b.getIsEnabled();
                    boolean zM105675l = c33308hM105660b.getReadOnly();
                    float fM105667c = c33308hM105660b.getCornerRadius();
                    if ((i16 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z13 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C32451b(function5, 8);
                        c28655q.m87172p0(objM87133R7);
                    }
                    z14 = true;
                    m105613A(modifierM3483b, textResource, strM21274h, textResourceM105671h, iM105673j, iM105674k, fM105670g, zM105679p, zM105678o, zM105675l, fM105667c, (Function1) objM87133R7, c28655q, 0, 0, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                modifier3 = modifier2;
                function3 = function5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(modifier3, state, function3, i13, i14, 1);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C33192k(6);
                    c28655q.m87172p0(objM87133R9);
                }
                function4 = (Function1) objM87133R9;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC33745d.m106649h(c28655q);
            }
            c15247s = (C15247s) objM87133R2;
            interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            Boolean boolValueOf3 = Boolean.valueOf(m105653v(interfaceC28601c2));
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new a(c15247s, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf3);
            Boolean boolValueOf4 = Boolean.valueOf(m105655x(interfaceC28601c3));
            zM87157i = c28655q.m87157i(interfaceC15237i);
            objM87133R6 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R6 = new b(interfaceC15237i, interfaceC28601c3, null);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new b(interfaceC15237i, interfaceC28601c3, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, boolValueOf4);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
            AbstractC25303l.m74291r(state.getTitleSubtitle(), null, null, null, c28655q, 0, 14);
            f13 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(8 * f13, c2314t));
            c28655q.m87150e0(1426595139);
            while (r15.hasNext()) {
                boolean zM65745e2 = AbstractC22676k.m65745e(m105651t(interfaceC28601c1), c33307g2.getId());
                boolean zM87153g2 = c28655q.m87153g(c33307g2);
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87153g2 | z15;
                objM87133R8 = c28655q.m87133R();
                if (z16) {
                    c33307g = c33307g2;
                    objM87133R8 = new C0073h(c33307g, function4, interfaceC28601c1, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    c33307g = c33307g2;
                    objM87133R8 = new C0073h(c33307g, function4, interfaceC28601c1, interfaceC28601c3, interfaceC28601c2, 23);
                    c28655q.m87172p0(objM87133R8);
                }
                m105623K(null, c33307g, zM65745e2, (InterfaceC4339a) objM87133R8, c28655q, 0, 1);
                AbstractC18489d0.m53380u(3, f13, c2314t, c28655q);
            }
            function5 = function4;
            c28655q.m87173q(false);
            c33308hM105660b = state.getTextAreaState();
            if (c33308hM105660b == null) {
                c28655q.m87150e0(1275700119);
                c28655q.m87173q(false);
                z14 = true;
            } else {
                c28655q.m87150e0(1275700120);
                Modifier modifierM3483b2 = AbstractC1126a.m3483b(c2314t, c15247s);
                textResourceM105672i = c33308hM105660b.getLabel();
                if (textResourceM105672i == null) {
                    textResourceM105672i = AbstractC8693b.m21267a();
                }
                String strM21274h2 = AbstractC8693b.m21274h(c33308hM105660b.getText(), c28655q, 0);
                TextResource textResource2 = textResourceM105672i;
                TextResource textResourceM105671h2 = c33308hM105660b.getHintText();
                int iM105673j2 = c33308hM105660b.getMaxCharacterCount();
                int iM105674k2 = c33308hM105660b.getMaxLines();
                float fM105670g2 = c33308hM105660b.getHeight();
                boolean zM105679p2 = c33308hM105660b.getIsError();
                boolean zM105678o2 = c33308hM105660b.getIsEnabled();
                boolean zM105675l2 = c33308hM105660b.getReadOnly();
                float fM105667c2 = c33308hM105660b.getCornerRadius();
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z13) {
                    objM87133R7 = new C32451b(function5, 8);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C32451b(function5, 8);
                    c28655q.m87172p0(objM87133R7);
                }
                z14 = true;
                m105613A(modifierM3483b2, textResource2, strM21274h2, textResourceM105671h2, iM105673j2, iM105674k2, fM105670g2, zM105679p2, zM105678o2, zM105675l2, fM105667c2, (Function1) objM87133R7, c28655q, 0, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            modifier3 = modifier2;
            function3 = function5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, state, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m105646o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m105647p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m105648q(C33307g c33307g, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        if (AbstractC22676k.m65745e(m105651t(interfaceC28601c1), c33307g.getId())) {
            m105652u(interfaceC28601c1, null);
            m105647p(interfaceC28601c2, true);
            function1.invoke(new C33303c(c33307g.getId(), false));
        } else {
            m105652u(interfaceC28601c1, c33307g.getId());
            if (c33307g.getAutoFocus()) {
                m105654w(interfaceC28601c3, true);
            } else {
                m105647p(interfaceC28601c2, true);
            }
            function1.invoke(new C33303c(c33307g.getId(), true));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m105649r(Function1 function1, String text) {
        AbstractC22676k.m65750j(text, "text");
        function1.invoke(new C33302b(text));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m105650s(Modifier modifier, C33306f c33306f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m105645n(modifier, c33306f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final String m105651t(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: u */
    private static final void m105652u(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final boolean m105653v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m105654w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final boolean m105655x(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public static final void m105656y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1075357646);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new c()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m105657z(int i13, Composer composer, int i14) {
        m105656y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
