package yb0;

import am2.C1017f0;
import android.icu.text.NumberFormat;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.selection.AbstractC1110b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c31.C3922f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9786j;
import d13.AbstractC11478a;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import java.util.Locale;
import jf0.AbstractC21639b;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import ma0.AbstractC25370d;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import ny0.C27238a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.C23195w2;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p579wc.C37082e1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30787f;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg2.C32464o;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb0.C37030a;
import wb0.C37031b;
import wb0.C37032c;
import wb0.C37035f;
import wb3.AbstractC37056f;
import wr0.C37550r;
import x81.C38072d;
import xo1.C38492a;
import y41.C39211b;
import y71.C39272e;
import y71.C39274g;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: yb0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÍ\u0001\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00120\u00112\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00112\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0003¢\u0006\u0004\b\u001f\u0010 \u001ag\u0010%\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00120$H\u0007¢\u0006\u0004\b%\u0010&¨\u0006(²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010'\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lwb0/f;", "biomarkerItemState", "", "inputValue", "unitValue", "", "isValidValue", "hasValueChanged", "Lcom/whoop/design/util/TextResource;", "errorMessage", "Lny0/a0;", "saveButtonState", "isAiConfirmation", "", "selectedCategoricalValue", "Lkotlin/Function1;", "Ll83/a0;", "onTextChanged", "onNumberChanged", "onUnitTextChanged", "onCategoricalOptionSelected", "Lkotlin/Function0;", "onSave", "I", "(Landroidx/compose/ui/Modifier;Lwb0/f;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;Lny0/a0;ZLjava/lang/Double;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;III)V", "Lwb0/c;", "option", "isSelected", "onClick", "R", "(Lwb0/c;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Lv41/f;", "modalBottomSheetState", "onDismiss", "Lkotlin/Function2;", "r", "(Landroidx/compose/ui/Modifier;Lwb0/f;Lny0/a0;Lv41/f;ZLc93/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "numericValue", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39384g {

    /* JADX INFO: renamed from: yb0.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkerValueModalKt$BiomarkerEditModal$1$1$1", m100430f = "EditBiomarkerValueModal.kt", m100431l = {277, 278}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169456w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f f169457x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC35664f abstractC35664f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169457x = abstractC35664f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f169457x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.m43223d(r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        
            if (r5.m43185a(r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f169456w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L44
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                v41.f r5 = r4.f169457x
                boolean r1 = r5 instanceof v41.AbstractC35664f.a
                if (r1 == 0) goto L31
                v41.f$a r5 = (v41.AbstractC35664f.a) r5
                g1.y3 r5 = r5.getModalBottomSheetState()
                r4.f169456w = r3
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L44
                goto L43
            L31:
                boolean r1 = r5 instanceof v41.AbstractC35664f.b
                if (r1 == 0) goto L47
                v41.f$b r5 = (v41.AbstractC35664f.b) r5
                g1.s0 r5 = r5.getBottomDrawerState()
                r4.f169456w = r2
                java.lang.Object r5 = r5.m43185a(r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            L47:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yb0.AbstractC39384g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yb0.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkerValueModalKt$BiomarkerEditModal$2$5$1$2", m100430f = "EditBiomarkerValueModal.kt", m100431l = {316, 317}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169458w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f f169459x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC35664f abstractC35664f, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169459x = abstractC35664f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f169459x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.m43223d(r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        
            if (r5.m43185a(r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f169458w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L44
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                v41.f r5 = r4.f169459x
                boolean r1 = r5 instanceof v41.AbstractC35664f.a
                if (r1 == 0) goto L31
                v41.f$a r5 = (v41.AbstractC35664f.a) r5
                g1.y3 r5 = r5.getModalBottomSheetState()
                r4.f169458w = r3
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L44
                goto L43
            L31:
                boolean r1 = r5 instanceof v41.AbstractC35664f.b
                if (r1 == 0) goto L47
                v41.f$b r5 = (v41.AbstractC35664f.b) r5
                g1.s0 r5 = r5.getBottomDrawerState()
                r4.f169458w = r2
                java.lang.Object r5 = r5.m43185a(r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            L47:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yb0.AbstractC39384g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m125597A(InterfaceC28601c1 interfaceC28601c1, double d3) {
        m125636u(interfaceC28601c1, Double.valueOf(d3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m125598B(C37035f c37035f, InterfaceC4351m interfaceC4351m, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, AbstractC35664f abstractC35664f) {
        Object objM118840a = C37031b.f158424a.m118840a(c37035f.m118854c(), m125635t(interfaceC28601c1), m125601E(interfaceC28601c2));
        String strM125603G = m125603G(interfaceC28601c3);
        if (AbstractC39414r.m125890i0(strM125603G)) {
            strM125603G = null;
        }
        interfaceC4351m.invoke(objM118840a, strM125603G);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(abstractC35664f, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m125599C(Modifier modifier, C37035f c37035f, C27238a0 c27238a0, AbstractC35664f abstractC35664f, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m125633r(modifier, c37035f, c27238a0, abstractC35664f, z4, interfaceC4339a, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m125600D(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: E */
    private static final Double m125601E(InterfaceC28601c1 interfaceC28601c1) {
        return (Double) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: F */
    private static final void m125602F(InterfaceC28601c1 interfaceC28601c1, Double d3) {
        interfaceC28601c1.setValue(d3);
    }

    /* JADX INFO: renamed from: G */
    private static final String m125603G(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: H */
    private static final void m125604H(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0168  */
    /* JADX WARN: Code duplicated, block: B:104:0x016d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0173  */
    /* JADX WARN: Code duplicated, block: B:110:0x017b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0182  */
    /* JADX WARN: Code duplicated, block: B:114:0x0188  */
    /* JADX WARN: Code duplicated, block: B:116:0x0190  */
    /* JADX WARN: Code duplicated, block: B:120:0x0198  */
    /* JADX WARN: Code duplicated, block: B:122:0x019f  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01de  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:158:0x0205  */
    /* JADX WARN: Code duplicated, block: B:160:0x020b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0219  */
    /* JADX WARN: Code duplicated, block: B:164:0x021d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0223  */
    /* JADX WARN: Code duplicated, block: B:168:0x0231  */
    /* JADX WARN: Code duplicated, block: B:171:0x0283  */
    /* JADX WARN: Code duplicated, block: B:172:0x0287  */
    /* JADX WARN: Code duplicated, block: B:175:0x029a  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:180:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:182:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:188:0x0308  */
    /* JADX WARN: Code duplicated, block: B:192:0x0368  */
    /* JADX WARN: Code duplicated, block: B:194:0x037e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0380  */
    /* JADX WARN: Code duplicated, block: B:198:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x038e  */
    /* JADX WARN: Code duplicated, block: B:202:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:204:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:205:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:208:0x040b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0419  */
    /* JADX WARN: Code duplicated, block: B:214:0x042b  */
    /* JADX WARN: Code duplicated, block: B:217:0x0437  */
    /* JADX WARN: Code duplicated, block: B:220:0x0461  */
    /* JADX WARN: Code duplicated, block: B:222:0x0467  */
    /* JADX WARN: Code duplicated, block: B:223:0x0469  */
    /* JADX WARN: Code duplicated, block: B:225:0x046c  */
    /* JADX WARN: Code duplicated, block: B:226:0x046f  */
    /* JADX WARN: Code duplicated, block: B:229:0x0477  */
    /* JADX WARN: Code duplicated, block: B:230:0x0484  */
    /* JADX WARN: Code duplicated, block: B:234:0x052b  */
    /* JADX WARN: Code duplicated, block: B:237:0x0534  */
    /* JADX WARN: Code duplicated, block: B:238:0x0537  */
    /* JADX WARN: Code duplicated, block: B:241:0x055f  */
    /* JADX WARN: Code duplicated, block: B:244:0x0571  */
    /* JADX WARN: Code duplicated, block: B:245:0x0573  */
    /* JADX WARN: Code duplicated, block: B:248:0x057a  */
    /* JADX WARN: Code duplicated, block: B:249:0x057c  */
    /* JADX WARN: Code duplicated, block: B:252:0x0584 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x058a  */
    /* JADX WARN: Code duplicated, block: B:259:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:260:0x0606  */
    /* JADX WARN: Code duplicated, block: B:263:0x0623 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x0625  */
    /* JADX WARN: Code duplicated, block: B:266:0x0631 A[PHI: r11
      0x0631: PHI (r11v14 java.lang.Double) = (r11v9 java.lang.Double), (r11v16 java.lang.Double) binds: [B:271:0x063d, B:265:0x062f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:267:0x0634  */
    /* JADX WARN: Code duplicated, block: B:269:0x0639  */
    /* JADX WARN: Code duplicated, block: B:271:0x063d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x0671  */
    /* JADX WARN: Code duplicated, block: B:276:0x0673  */
    /* JADX WARN: Code duplicated, block: B:279:0x067a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:282:0x0682  */
    /* JADX WARN: Code duplicated, block: B:284:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:287:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:84:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0140  */
    /* JADX WARN: Code duplicated, block: B:89:0x014a  */
    /* JADX WARN: Code duplicated, block: B:90:0x014d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0154  */
    /* JADX WARN: Code duplicated, block: B:96:0x015d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0163  */
    /* JADX WARN: Code duplicated, block: B:99:0x0165  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: I */
    public static final void m125605I(Modifier modifier, C37035f biomarkerItemState, String inputValue, String str, boolean z4, boolean z13, TextResource errorMessage, C27238a0 saveButtonState, boolean z14, Double d3, Function1 onTextChanged, Function1 onNumberChanged, Function1 function1, Function1 function2, InterfaceC4339a onSave, Composer composer, int i13, int i14, int i15) {
        Modifier modifier2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z15;
        InterfaceC4339a interfaceC4339a;
        String str2;
        boolean z16;
        Double d14;
        Modifier modifier3;
        C28655q c28655q;
        Function1 function3;
        Function1 function4;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        String str3;
        boolean z17;
        Double d15;
        C28676v0 c28676v0;
        Function1 function5;
        Function1 function6;
        float f13;
        float f14;
        float f15;
        int iHashCode;
        Double d16;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        float f16;
        int iHashCode2;
        boolean z18;
        Object objM87133R;
        boolean z19;
        Function1 function7;
        boolean z24;
        C28676v0 c28676v1;
        Double d17;
        float f17;
        float f18;
        Object objM87133R2;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objM87133R3;
        Function1 function8;
        boolean z28;
        float f19;
        C2314t c2314t2;
        boolean z29;
        InterfaceC25312u interfaceC25312uM118856e;
        C28655q c28655q2;
        int i38;
        Double d18;
        boolean z34;
        C28655q c28655q3;
        boolean z35;
        Object objM87133R4;
        C28655q c28655q4;
        int iHashCode3;
        boolean z36;
        boolean zM87153g;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        int i39;
        boolean zM87157i;
        int i44;
        boolean zM87157i2;
        int i45;
        int i46;
        int i47;
        AbstractC22676k.m65750j(biomarkerItemState, "biomarkerItemState");
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(saveButtonState, "saveButtonState");
        AbstractC22676k.m65750j(onTextChanged, "onTextChanged");
        AbstractC22676k.m65750j(onNumberChanged, "onNumberChanged");
        AbstractC22676k.m65750j(onSave, "onSave");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-1785392191);
        int i48 = i15 & 1;
        if (i48 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i16 = (i13 & 6) == 0 ? i13 | (c28655q5.m87153g(modifier2) ? 4 : 2) : i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q5.m87157i(biomarkerItemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q5.m87153g(inputValue) ? 256 : 128;
        }
        int i49 = i16;
        int i54 = i15 & 8;
        int i55 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i54 == 0) {
            if ((i13 & 3072) == 0) {
                i49 |= c28655q5.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
            }
            i17 = i13 & 24576;
            i18 = DfuBaseService.ERROR_REMOTE_MASK;
            if (i17 == 0) {
                if (c28655q5.m87155h(z4)) {
                    i47 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i47 = 8192;
                }
                i49 |= i47;
            }
            if ((196608 & i13) == 0) {
                if (c28655q5.m87155h(z13)) {
                    i46 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i46 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i49 |= i46;
            }
            if ((i13 & 1572864) == 0) {
                if ((i13 & 2097152) == 0) {
                    zM87157i2 = c28655q5.m87153g(errorMessage);
                } else {
                    zM87157i2 = c28655q5.m87157i(errorMessage);
                }
                if (zM87157i2) {
                    i45 = 1048576;
                } else {
                    i45 = 524288;
                }
                i49 |= i45;
            }
            if ((i13 & 12582912) == 0) {
                if ((i13 & 16777216) == 0) {
                    zM87157i = c28655q5.m87153g(saveButtonState);
                } else {
                    zM87157i = c28655q5.m87157i(saveButtonState);
                }
                if (zM87157i) {
                    i44 = 8388608;
                } else {
                    i44 = 4194304;
                }
                i49 |= i44;
            }
            i19 = i15 & 256;
            if (i19 != 0) {
                i49 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q5.m87155h(z14)) {
                    i24 = 67108864;
                } else {
                    i24 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i49 |= i24;
            }
            i25 = i15 & 512;
            if (i25 != 0) {
                i25 = i25;
                i26 = i49 | 805306368;
            } else {
                if ((i13 & 805306368) != 0) {
                    if (c28655q5.m87153g(d3)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i49 |= i27;
                }
                i26 = i49;
            }
            if ((i14 & 6) == 0) {
                if (c28655q5.m87157i(onTextChanged)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i28 = i39 | i14;
            } else {
                i28 = i14;
            }
            if ((i14 & 48) == 0) {
                i28 |= c28655q5.m87157i(onNumberChanged) ? 32 : 16;
            }
            i29 = i15 & 4096;
            if (i29 != 0) {
                i34 = i29;
                if ((i14 & 384) == 0) {
                    i28 |= c28655q5.m87157i(function1) ? 256 : 128;
                }
                i35 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
                if (i35 != 0) {
                    i36 = i35;
                    if ((i14 & 3072) == 0) {
                        if (c28655q5.m87157i(function2)) {
                            i55 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i28 |= i55;
                    }
                    if ((i14 & 24576) == 0) {
                        if (c28655q5.m87157i(onSave)) {
                            i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        i28 |= i18;
                    }
                    i37 = i28;
                    if ((i26 & 306783379) == 306783378 || (i37 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q5.m87135U(i26 & 1, z15)) {
                        c2314t = C2314t.f9131w;
                        if (i48 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i54 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if (i25 != 0) {
                            d15 = null;
                        } else {
                            d15 = d3;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i34 != 0) {
                            objM87133R7 = c28655q5.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C39211b(13);
                                c28655q5.m87172p0(objM87133R7);
                            }
                            function5 = (Function1) objM87133R7;
                        } else {
                            function5 = function1;
                        }
                        if (i36 != 0) {
                            objM87133R6 = c28655q5.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C39211b(14);
                                c28655q5.m87172p0(objM87133R6);
                            }
                            function6 = (Function1) objM87133R6;
                        } else {
                            function6 = function2;
                        }
                        f13 = 2;
                        f14 = 8;
                        f15 = f13 * f14;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, f15, 7), f15, 0.0f, 2);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q5, 48);
                        Double d19 = d15;
                        iHashCode = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM3396r);
                        InterfaceC0221l.f734a.getClass();
                        d16 = d19;
                        c0213j = C0217k.f724b;
                        c28655q5.m87158i0();
                        Modifier modifier5 = modifier4;
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N);
                        if (biomarkerItemState.m118854c() != null) {
                            c28655q5.m87150e0(790661728);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            f16 = f13;
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q5, 6);
                            iHashCode3 = Long.hashCode(c28655q5.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM3409f);
                            c28655q5.m87158i0();
                            if (c28655q5.f115903S) {
                                c28655q5.m87163l(c0213j);
                            } else {
                                c28655q5.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N2);
                            String strM118864m = biomarkerItemState.getValueLabel();
                            C38072d c38072d = C38072d.f163053a;
                            int i56 = C38072d.f163054b;
                            AbstractC30795n.m94707h(strM118864m, null, c38072d.m121949b(c28655q5, i56).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i56).getFormLabel(), null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                            c28655q5.m87150e0(561878599);
                            for (C37032c c37032c : biomarkerItemState.m118854c()) {
                                Double d24 = d16;
                                boolean zM65741a = AbstractC22676k.m65741a(d24, c37032c.getValue());
                                if ((i37 & 7168) == 2048) {
                                    z36 = true;
                                } else {
                                    z36 = false;
                                }
                                zM87153g = z36 | c28655q5.m87153g(c37032c);
                                objM87133R5 = c28655q5.m87133R();
                                if (zM87153g || objM87133R5 == c28676v0) {
                                    objM87133R5 = new C37550r(function6, c37032c, 18);
                                    c28655q5.m87172p0(objM87133R5);
                                }
                                m125614R(c37032c, zM65741a, (InterfaceC4339a) objM87133R5, c28655q5, 0);
                                d16 = d24;
                            }
                            AbstractC25012a.m73392y(c28655q5, false, true, false);
                            d17 = d16;
                            c2314t2 = c2314t;
                            c28676v1 = c28676v0;
                            f17 = 1.0f;
                            z19 = z17;
                            function8 = function5;
                            z24 = true;
                            z28 = false;
                            f19 = f15;
                        } else {
                            f16 = f13;
                            c28655q5.m87150e0(791452166);
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                            float f24 = 4 * f16;
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f24), C2299e.f9107J, c28655q5, 6);
                            iHashCode2 = Long.hashCode(c28655q5.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierM3409f2);
                            c28655q5.m87158i0();
                            if (c28655q5.f115903S) {
                                c28655q5.m87163l(c0213j);
                            } else {
                                c28655q5.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m3);
                            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N3);
                            if (2.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM3599a = AbstractC1136a.m3599a(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "reading_input");
                            C33252i c33252iM105489e = AbstractC33253j.m105489e(f24);
                            TextResource textResourceM21278l = AbstractC8693b.m21278l(biomarkerItemState.getValueLabel());
                            C38072d c38072d2 = C38072d.f163053a;
                            int i57 = C38072d.f163054b;
                            C2886a c2886aM8432m = c38072d2.m121952e(c28655q5, i57).getFormLabel();
                            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(inputValue);
                            if (z4) {
                                z18 = false;
                            } else {
                                if (inputValue.length() > 0) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                if (z29) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            }
                            objM87133R = c28655q5.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C38492a(26);
                                c28655q5.m87172p0(objM87133R);
                            }
                            int i58 = TextResource.$stable;
                            int i59 = i58 << 3;
                            int i64 = i58 << 9;
                            int i65 = C2886a.f11498d << 12;
                            int i66 = i58 << 24;
                            int i67 = i37 << 21;
                            z19 = z17;
                            function7 = function5;
                            z24 = true;
                            c28676v1 = c28676v0;
                            d17 = d16;
                            f17 = 1.0f;
                            AbstractC30787f.m94664c(modifierM3599a, textResourceM21278l2, null, textResourceM21278l, c2886aM8432m, null, null, null, errorMessage, z18, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e, null, null, null, null, false, (InterfaceC4339a) objM87133R, onTextChanged, onNumberChanged, c28655q5, i59 | i64 | i65 | i66 | ((i26 << 6) & 234881024), 384, (i67 & 29360128) | 1572864 | (i67 & 234881024), 66055396);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > r5) {
                                f18 = Float.MAX_VALUE;
                            } else {
                                f18 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f18, true);
                            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f24);
                            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(biomarkerItemState.getUnitLabel());
                            C2886a c2886aM8432m2 = c38072d2.m121952e(c28655q5, i57).getFormLabel();
                            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(str3);
                            TextResource textResourceM21267a = AbstractC8693b.m21267a();
                            boolean z37 = !z19;
                            objM87133R2 = c28655q5.m87133R();
                            if (objM87133R2 == c28676v1) {
                                objM87133R2 = new C38492a(27);
                                c28655q5.m87172p0(objM87133R2);
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                            if ((i26 & 234881024) == 67108864) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if ((i37 & 896) == 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z26 | z25;
                            objM87133R3 = c28655q5.m87133R();
                            if (!z27 || objM87133R3 == c28676v1) {
                                function8 = function7;
                                objM87133R3 = new C1017f0(z19, function8, 7);
                                c28655q5.m87172p0(objM87133R3);
                            } else {
                                function8 = function7;
                            }
                            AbstractC30792k.m94678l(layoutWeightElement, textResourceM21278l4, null, textResourceM21278l3, c2886aM8432m2, null, null, null, textResourceM21267a, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, z37, null, null, c33252iM105489e2, null, null, null, null, interfaceC4339a2, (Function1) objM87133R3, c28655q5, i59 | 805306368 | i64 | i65 | i66, 24576, 0, 6, 1035975908, 0);
                            c28655q5 = c28655q5;
                            c28655q5.m87173q(true);
                            z28 = false;
                            c28655q5.m87173q(false);
                            f19 = f15;
                            c2314t2 = c2314t;
                        }
                        AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f19, c2314t2));
                        interfaceC25312uM118856e = biomarkerItemState.getInfoCallout();
                        if (interfaceC25312uM118856e == null) {
                            c28655q5.m87150e0(793262193);
                            c28655q5.m87173q(z28);
                            c28655q2 = c28655q5;
                            i38 = 4;
                        } else {
                            c28655q5.m87150e0(793262194);
                            AbstractC25303l.m74291r(interfaceC25312uM118856e, null, null, null, c28655q5, 0, 14);
                            c28655q2 = c28655q5;
                            i38 = 4;
                            AbstractC25012a.m73388u(4, f14, c2314t2, c28655q2, z28);
                        }
                        if (biomarkerItemState.m118854c() != null) {
                            if (d17 != null) {
                                d18 = d17;
                                if (!AbstractC22676k.m65742b(d18, biomarkerItemState.getValue())) {
                                    z34 = z24;
                                }
                            } else {
                                d18 = d17;
                            }
                            z34 = z28;
                        } else {
                            d18 = d17;
                            if (z4 || !z13) {
                                z34 = z28;
                            } else {
                                z34 = z24;
                            }
                        }
                        int i68 = i38;
                        Function1 function9 = function8;
                        Double d25 = d18;
                        c28655q3 = c28655q2;
                        C27238a0 c27238a0M82077b = C27238a0.m82077b(saveButtonState, null, null, null, null, 0.0f, null, null, null, z34, false, 767, null);
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(f17, c2314t2), "modal_save_button");
                        if ((i37 & 57344) == 16384) {
                            z35 = z24;
                        } else {
                            z35 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (!z35 || objM87133R4 == c28676v1) {
                            interfaceC4339a = onSave;
                            objM87133R4 = new C39272e(interfaceC4339a, 2);
                            c28655q4 = c28655q3;
                            c28655q4.m87172p0(objM87133R4);
                        } else {
                            interfaceC4339a = onSave;
                            c28655q4 = c28655q3;
                        }
                        AbstractC27292z.m82341h(c27238a0M82077b, modifierM3599a2, null, (InterfaceC4339a) objM87133R4, c28655q4, C27238a0.f109008k | 48, 4);
                        AbstractC31061c.m95650z(f16, i68, c2314t2, c28655q4, z24);
                        z16 = z19;
                        c28655q = c28655q4;
                        d14 = d25;
                        str2 = str3;
                        modifier3 = modifier5;
                        function3 = function9;
                        function4 = function6;
                    } else {
                        interfaceC4339a = onSave;
                        c28655q5.m87138X();
                        str2 = str;
                        z16 = z14;
                        d14 = d3;
                        modifier3 = modifier2;
                        c28655q = c28655q5;
                        function3 = function1;
                        function4 = function2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C23195w2(modifier3, biomarkerItemState, inputValue, str2, z4, z13, errorMessage, saveButtonState, z16, d14, onTextChanged, onNumberChanged, function3, function4, interfaceC4339a, i13, i14, i15);
                    }
                }
                i28 |= 3072;
                i36 = i35;
                if ((i14 & 24576) == 0) {
                    if (c28655q5.m87157i(onSave)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i28 |= i18;
                }
                i37 = i28;
                if ((i26 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q5.m87135U(i26 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i48 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i54 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i25 != 0) {
                        d15 = null;
                    } else {
                        d15 = d3;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        objM87133R7 = c28655q5.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C39211b(13);
                            c28655q5.m87172p0(objM87133R7);
                        }
                        function5 = (Function1) objM87133R7;
                    } else {
                        function5 = function1;
                    }
                    if (i36 != 0) {
                        objM87133R6 = c28655q5.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39211b(14);
                            c28655q5.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    } else {
                        function6 = function2;
                    }
                    f13 = 2;
                    f14 = 8;
                    f15 = f13 * f14;
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, f15, 7), f15, 0.0f, 2);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q5, 48);
                    Double d110 = d15;
                    iHashCode = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q5.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q5, modifierM3396r2);
                    InterfaceC0221l.f734a.getClass();
                    d16 = d110;
                    c0213j = C0217k.f724b;
                    c28655q5.m87158i0();
                    Modifier modifier6 = modifier4;
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a3);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m4);
                    c0209i3 = C0217k.f732j;
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N4);
                    if (biomarkerItemState.m118854c() != null) {
                        c28655q5.m87150e0(790661728);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f16 = f13;
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q5, 6);
                        iHashCode3 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q5.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q5, modifierM3409f3);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m5);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N5);
                        String strM118864m2 = biomarkerItemState.getValueLabel();
                        C38072d c38072d3 = C38072d.f163053a;
                        int i510 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strM118864m2, null, c38072d3.m121949b(c28655q5, i510).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q5, i510).getFormLabel(), null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                        c28655q5.m87150e0(561878599);
                        while (r1.hasNext()) {
                            Double d26 = d16;
                            boolean zM65741a2 = AbstractC22676k.m65741a(d26, c37032c.getValue());
                            if ((i37 & 7168) == 2048) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            zM87153g = z36 | c28655q5.m87153g(c37032c);
                            objM87133R5 = c28655q5.m87133R();
                            if (zM87153g) {
                                objM87133R5 = new C37550r(function6, c37032c, 18);
                                c28655q5.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C37550r(function6, c37032c, 18);
                                c28655q5.m87172p0(objM87133R5);
                            }
                            m125614R(c37032c, zM65741a2, (InterfaceC4339a) objM87133R5, c28655q5, 0);
                            d16 = d26;
                        }
                        AbstractC25012a.m73392y(c28655q5, false, true, false);
                        d17 = d16;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        f17 = 1.0f;
                        z19 = z17;
                        function8 = function5;
                        z24 = true;
                        z28 = false;
                        f19 = f15;
                    } else {
                        f16 = f13;
                        c28655q5.m87150e0(791452166);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                        float f25 = 4 * f16;
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f25), C2299e.f9107J, c28655q5, 6);
                        iHashCode2 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q5.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q5, modifierM3409f4);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m6);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N6);
                        if (2.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "reading_input");
                        C33252i c33252iM105489e3 = AbstractC33253j.m105489e(f25);
                        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(biomarkerItemState.getValueLabel());
                        C38072d c38072d4 = C38072d.f163053a;
                        int i511 = C38072d.f163054b;
                        C2886a c2886aM8432m3 = c38072d4.m121952e(c28655q5, i511).getFormLabel();
                        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(inputValue);
                        if (z4) {
                            z18 = false;
                        } else {
                            if (inputValue.length() > 0) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (z29) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C38492a(26);
                            c28655q5.m87172p0(objM87133R);
                        }
                        int i512 = TextResource.$stable;
                        int i513 = i512 << 3;
                        int i69 = i512 << 9;
                        int i610 = C2886a.f11498d << 12;
                        int i611 = i512 << 24;
                        int i612 = i37 << 21;
                        z19 = z17;
                        function7 = function5;
                        z24 = true;
                        c28676v1 = c28676v0;
                        d17 = d16;
                        f17 = 1.0f;
                        AbstractC30787f.m94664c(modifierM3599a3, textResourceM21278l6, null, textResourceM21278l5, c2886aM8432m3, null, null, null, errorMessage, z18, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e3, null, null, null, null, false, (InterfaceC4339a) objM87133R, onTextChanged, onNumberChanged, c28655q5, i513 | i69 | i610 | i611 | ((i26 << 6) & 234881024), 384, (i612 & 29360128) | 1572864 | (i612 & 234881024), 66055396);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > r5) {
                            f18 = Float.MAX_VALUE;
                        } else {
                            f18 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f18, true);
                        C33252i c33252iM105489e4 = AbstractC33253j.m105489e(f25);
                        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(biomarkerItemState.getUnitLabel());
                        C2886a c2886aM8432m4 = c38072d4.m121952e(c28655q5, i511).getFormLabel();
                        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(str3);
                        TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                        boolean z38 = !z19;
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v1) {
                            objM87133R2 = new C38492a(27);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                        if ((i26 & 234881024) == 67108864) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i37 & 896) == 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objM87133R3 = c28655q5.m87133R();
                        if (z27) {
                            function8 = function7;
                            objM87133R3 = new C1017f0(z19, function8, 7);
                            c28655q5.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C1017f0(z19, function8, 7);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        AbstractC30792k.m94678l(layoutWeightElement2, textResourceM21278l8, null, textResourceM21278l7, c2886aM8432m4, null, null, null, textResourceM21267a2, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, z38, null, null, c33252iM105489e4, null, null, null, null, interfaceC4339a3, (Function1) objM87133R3, c28655q5, i513 | 805306368 | i69 | i610 | i611, 24576, 0, 6, 1035975908, 0);
                        c28655q5 = c28655q5;
                        c28655q5.m87173q(true);
                        z28 = false;
                        c28655q5.m87173q(false);
                        f19 = f15;
                        c2314t2 = c2314t;
                    }
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f19, c2314t2));
                    interfaceC25312uM118856e = biomarkerItemState.getInfoCallout();
                    if (interfaceC25312uM118856e == null) {
                        c28655q5.m87150e0(793262193);
                        c28655q5.m87173q(z28);
                        c28655q2 = c28655q5;
                        i38 = 4;
                    } else {
                        c28655q5.m87150e0(793262194);
                        AbstractC25303l.m74291r(interfaceC25312uM118856e, null, null, null, c28655q5, 0, 14);
                        c28655q2 = c28655q5;
                        i38 = 4;
                        AbstractC25012a.m73388u(4, f14, c2314t2, c28655q2, z28);
                    }
                    if (biomarkerItemState.m118854c() != null) {
                        if (d17 != null) {
                            d18 = d17;
                            if (!AbstractC22676k.m65742b(d18, biomarkerItemState.getValue())) {
                                z34 = z24;
                            }
                        } else {
                            d18 = d17;
                        }
                        z34 = z28;
                    } else {
                        d18 = d17;
                        if (z4) {
                        }
                        z34 = z28;
                    }
                    int i613 = i38;
                    Function1 function10 = function8;
                    Double d27 = d18;
                    c28655q3 = c28655q2;
                    C27238a0 c27238a0M82077b2 = C27238a0.m82077b(saveButtonState, null, null, null, null, 0.0f, null, null, null, z34, false, 767, null);
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(f17, c2314t2), "modal_save_button");
                    if ((i37 & 57344) == 16384) {
                        z35 = z24;
                    } else {
                        z35 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z35) {
                        interfaceC4339a = onSave;
                        objM87133R4 = new C39272e(interfaceC4339a, 2);
                        c28655q4 = c28655q3;
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        interfaceC4339a = onSave;
                        objM87133R4 = new C39272e(interfaceC4339a, 2);
                        c28655q4 = c28655q3;
                        c28655q4.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82341h(c27238a0M82077b2, modifierM3599a4, null, (InterfaceC4339a) objM87133R4, c28655q4, C27238a0.f109008k | 48, 4);
                    AbstractC31061c.m95650z(f16, i613, c2314t2, c28655q4, z24);
                    z16 = z19;
                    c28655q = c28655q4;
                    d14 = d27;
                    str2 = str3;
                    modifier3 = modifier6;
                    function3 = function10;
                    function4 = function6;
                } else {
                    interfaceC4339a = onSave;
                    c28655q5.m87138X();
                    str2 = str;
                    z16 = z14;
                    d14 = d3;
                    modifier3 = modifier2;
                    c28655q = c28655q5;
                    function3 = function1;
                    function4 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23195w2(modifier3, biomarkerItemState, inputValue, str2, z4, z13, errorMessage, saveButtonState, z16, d14, onTextChanged, onNumberChanged, function3, function4, interfaceC4339a, i13, i14, i15);
                }
            }
            i28 |= 384;
            i34 = i29;
            i35 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i35 != 0) {
                i36 = i35;
                if ((i14 & 3072) == 0) {
                    if (c28655q5.m87157i(function2)) {
                        i55 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i28 |= i55;
                }
                if ((i14 & 24576) == 0) {
                    if (c28655q5.m87157i(onSave)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i28 |= i18;
                }
                i37 = i28;
                if ((i26 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q5.m87135U(i26 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i48 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i54 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i25 != 0) {
                        d15 = null;
                    } else {
                        d15 = d3;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        objM87133R7 = c28655q5.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C39211b(13);
                            c28655q5.m87172p0(objM87133R7);
                        }
                        function5 = (Function1) objM87133R7;
                    } else {
                        function5 = function1;
                    }
                    if (i36 != 0) {
                        objM87133R6 = c28655q5.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39211b(14);
                            c28655q5.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    } else {
                        function6 = function2;
                    }
                    f13 = 2;
                    f14 = 8;
                    f15 = f13 * f14;
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, f15, 7), f15, 0.0f, 2);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q5, 48);
                    Double d111 = d15;
                    iHashCode = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q5.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q5, modifierM3396r3);
                    InterfaceC0221l.f734a.getClass();
                    d16 = d111;
                    c0213j = C0217k.f724b;
                    c28655q5.m87158i0();
                    Modifier modifier7 = modifier4;
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a5);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m7);
                    c0209i3 = C0217k.f732j;
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N7);
                    if (biomarkerItemState.m118854c() != null) {
                        c28655q5.m87150e0(790661728);
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f16 = f13;
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q5, 6);
                        iHashCode3 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q5.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q5, modifierM3409f5);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m8);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N8);
                        String strM118864m3 = biomarkerItemState.getValueLabel();
                        C38072d c38072d5 = C38072d.f163053a;
                        int i514 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strM118864m3, null, c38072d5.m121949b(c28655q5, i514).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q5, i514).getFormLabel(), null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                        c28655q5.m87150e0(561878599);
                        while (r1.hasNext()) {
                            Double d28 = d16;
                            boolean zM65741a3 = AbstractC22676k.m65741a(d28, c37032c.getValue());
                            if ((i37 & 7168) == 2048) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            zM87153g = z36 | c28655q5.m87153g(c37032c);
                            objM87133R5 = c28655q5.m87133R();
                            if (zM87153g) {
                                objM87133R5 = new C37550r(function6, c37032c, 18);
                                c28655q5.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C37550r(function6, c37032c, 18);
                                c28655q5.m87172p0(objM87133R5);
                            }
                            m125614R(c37032c, zM65741a3, (InterfaceC4339a) objM87133R5, c28655q5, 0);
                            d16 = d28;
                        }
                        AbstractC25012a.m73392y(c28655q5, false, true, false);
                        d17 = d16;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        f17 = 1.0f;
                        z19 = z17;
                        function8 = function5;
                        z24 = true;
                        z28 = false;
                        f19 = f15;
                    } else {
                        f16 = f13;
                        c28655q5.m87150e0(791452166);
                        Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                        float f26 = 4 * f16;
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f26), C2299e.f9107J, c28655q5, 6);
                        iHashCode2 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q5.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q5, modifierM3409f6);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m9);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N9);
                        if (2.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3599a5 = AbstractC1136a.m3599a(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "reading_input");
                        C33252i c33252iM105489e5 = AbstractC33253j.m105489e(f26);
                        TextResource textResourceM21278l9 = AbstractC8693b.m21278l(biomarkerItemState.getValueLabel());
                        C38072d c38072d6 = C38072d.f163053a;
                        int i515 = C38072d.f163054b;
                        C2886a c2886aM8432m5 = c38072d6.m121952e(c28655q5, i515).getFormLabel();
                        TextResource textResourceM21278l10 = AbstractC8693b.m21278l(inputValue);
                        if (z4) {
                            z18 = false;
                        } else {
                            if (inputValue.length() > 0) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (z29) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C38492a(26);
                            c28655q5.m87172p0(objM87133R);
                        }
                        int i516 = TextResource.$stable;
                        int i517 = i516 << 3;
                        int i614 = i516 << 9;
                        int i615 = C2886a.f11498d << 12;
                        int i616 = i516 << 24;
                        int i617 = i37 << 21;
                        z19 = z17;
                        function7 = function5;
                        z24 = true;
                        c28676v1 = c28676v0;
                        d17 = d16;
                        f17 = 1.0f;
                        AbstractC30787f.m94664c(modifierM3599a5, textResourceM21278l10, null, textResourceM21278l9, c2886aM8432m5, null, null, null, errorMessage, z18, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e5, null, null, null, null, false, (InterfaceC4339a) objM87133R, onTextChanged, onNumberChanged, c28655q5, i517 | i614 | i615 | i616 | ((i26 << 6) & 234881024), 384, (i617 & 29360128) | 1572864 | (i617 & 234881024), 66055396);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > r5) {
                            f18 = Float.MAX_VALUE;
                        } else {
                            f18 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f18, true);
                        C33252i c33252iM105489e6 = AbstractC33253j.m105489e(f26);
                        TextResource textResourceM21278l11 = AbstractC8693b.m21278l(biomarkerItemState.getUnitLabel());
                        C2886a c2886aM8432m6 = c38072d6.m121952e(c28655q5, i515).getFormLabel();
                        TextResource textResourceM21278l12 = AbstractC8693b.m21278l(str3);
                        TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                        boolean z39 = !z19;
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v1) {
                            objM87133R2 = new C38492a(27);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                        if ((i26 & 234881024) == 67108864) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i37 & 896) == 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objM87133R3 = c28655q5.m87133R();
                        if (z27) {
                            function8 = function7;
                            objM87133R3 = new C1017f0(z19, function8, 7);
                            c28655q5.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C1017f0(z19, function8, 7);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        AbstractC30792k.m94678l(layoutWeightElement3, textResourceM21278l12, null, textResourceM21278l11, c2886aM8432m6, null, null, null, textResourceM21267a3, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, z39, null, null, c33252iM105489e6, null, null, null, null, interfaceC4339a4, (Function1) objM87133R3, c28655q5, i517 | 805306368 | i614 | i615 | i616, 24576, 0, 6, 1035975908, 0);
                        c28655q5 = c28655q5;
                        c28655q5.m87173q(true);
                        z28 = false;
                        c28655q5.m87173q(false);
                        f19 = f15;
                        c2314t2 = c2314t;
                    }
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f19, c2314t2));
                    interfaceC25312uM118856e = biomarkerItemState.getInfoCallout();
                    if (interfaceC25312uM118856e == null) {
                        c28655q5.m87150e0(793262193);
                        c28655q5.m87173q(z28);
                        c28655q2 = c28655q5;
                        i38 = 4;
                    } else {
                        c28655q5.m87150e0(793262194);
                        AbstractC25303l.m74291r(interfaceC25312uM118856e, null, null, null, c28655q5, 0, 14);
                        c28655q2 = c28655q5;
                        i38 = 4;
                        AbstractC25012a.m73388u(4, f14, c2314t2, c28655q2, z28);
                    }
                    if (biomarkerItemState.m118854c() != null) {
                        if (d17 != null) {
                            d18 = d17;
                            if (!AbstractC22676k.m65742b(d18, biomarkerItemState.getValue())) {
                                z34 = z24;
                            }
                        } else {
                            d18 = d17;
                        }
                        z34 = z28;
                    } else {
                        d18 = d17;
                        if (z4) {
                        }
                        z34 = z28;
                    }
                    int i618 = i38;
                    Function1 function11 = function8;
                    Double d29 = d18;
                    c28655q3 = c28655q2;
                    C27238a0 c27238a0M82077b3 = C27238a0.m82077b(saveButtonState, null, null, null, null, 0.0f, null, null, null, z34, false, 767, null);
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(f17, c2314t2), "modal_save_button");
                    if ((i37 & 57344) == 16384) {
                        z35 = z24;
                    } else {
                        z35 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z35) {
                        interfaceC4339a = onSave;
                        objM87133R4 = new C39272e(interfaceC4339a, 2);
                        c28655q4 = c28655q3;
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        interfaceC4339a = onSave;
                        objM87133R4 = new C39272e(interfaceC4339a, 2);
                        c28655q4 = c28655q3;
                        c28655q4.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82341h(c27238a0M82077b3, modifierM3599a6, null, (InterfaceC4339a) objM87133R4, c28655q4, C27238a0.f109008k | 48, 4);
                    AbstractC31061c.m95650z(f16, i618, c2314t2, c28655q4, z24);
                    z16 = z19;
                    c28655q = c28655q4;
                    d14 = d29;
                    str2 = str3;
                    modifier3 = modifier7;
                    function3 = function11;
                    function4 = function6;
                } else {
                    interfaceC4339a = onSave;
                    c28655q5.m87138X();
                    str2 = str;
                    z16 = z14;
                    d14 = d3;
                    modifier3 = modifier2;
                    c28655q = c28655q5;
                    function3 = function1;
                    function4 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23195w2(modifier3, biomarkerItemState, inputValue, str2, z4, z13, errorMessage, saveButtonState, z16, d14, onTextChanged, onNumberChanged, function3, function4, interfaceC4339a, i13, i14, i15);
                }
            }
            i28 |= 3072;
            i36 = i35;
            if ((i14 & 24576) == 0) {
                if (c28655q5.m87157i(onSave)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i28 |= i18;
            }
            i37 = i28;
            if ((i26 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q5.m87135U(i26 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i48 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i54 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i19 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i25 != 0) {
                    d15 = null;
                } else {
                    d15 = d3;
                }
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R7 = c28655q5.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C39211b(13);
                        c28655q5.m87172p0(objM87133R7);
                    }
                    function5 = (Function1) objM87133R7;
                } else {
                    function5 = function1;
                }
                if (i36 != 0) {
                    objM87133R6 = c28655q5.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39211b(14);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function2;
                }
                f13 = 2;
                f14 = 8;
                f15 = f13 * f14;
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, f15, 7), f15, 0.0f, 2);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q5, 48);
                Double d112 = d15;
                iHashCode = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q5.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q5, modifierM3396r4);
                InterfaceC0221l.f734a.getClass();
                d16 = d112;
                c0213j = C0217k.f724b;
                c28655q5.m87158i0();
                Modifier modifier8 = modifier4;
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a7);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m10);
                c0209i3 = C0217k.f732j;
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N10);
                if (biomarkerItemState.m118854c() != null) {
                    c28655q5.m87150e0(790661728);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f16 = f13;
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q5, 6);
                    iHashCode3 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q5.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q5, modifierM3409f7);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m11);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N11);
                    String strM118864m4 = biomarkerItemState.getValueLabel();
                    C38072d c38072d7 = C38072d.f163053a;
                    int i518 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM118864m4, null, c38072d7.m121949b(c28655q5, i518).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q5, i518).getFormLabel(), null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                    c28655q5.m87150e0(561878599);
                    while (r1.hasNext()) {
                        Double d210 = d16;
                        boolean zM65741a4 = AbstractC22676k.m65741a(d210, c37032c.getValue());
                        if ((i37 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        zM87153g = z36 | c28655q5.m87153g(c37032c);
                        objM87133R5 = c28655q5.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C37550r(function6, c37032c, 18);
                            c28655q5.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C37550r(function6, c37032c, 18);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        m125614R(c37032c, zM65741a4, (InterfaceC4339a) objM87133R5, c28655q5, 0);
                        d16 = d210;
                    }
                    AbstractC25012a.m73392y(c28655q5, false, true, false);
                    d17 = d16;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    f17 = 1.0f;
                    z19 = z17;
                    function8 = function5;
                    z24 = true;
                    z28 = false;
                    f19 = f15;
                } else {
                    f16 = f13;
                    c28655q5.m87150e0(791452166);
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f27 = 4 * f16;
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f27), C2299e.f9107J, c28655q5, 6);
                    iHashCode2 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q5.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q5, modifierM3409f8);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N12);
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3599a7 = AbstractC1136a.m3599a(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "reading_input");
                    C33252i c33252iM105489e7 = AbstractC33253j.m105489e(f27);
                    TextResource textResourceM21278l13 = AbstractC8693b.m21278l(biomarkerItemState.getValueLabel());
                    C38072d c38072d8 = C38072d.f163053a;
                    int i519 = C38072d.f163054b;
                    C2886a c2886aM8432m7 = c38072d8.m121952e(c28655q5, i519).getFormLabel();
                    TextResource textResourceM21278l14 = AbstractC8693b.m21278l(inputValue);
                    if (z4) {
                        z18 = false;
                    } else {
                        if (inputValue.length() > 0) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if (z29) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C38492a(26);
                        c28655q5.m87172p0(objM87133R);
                    }
                    int i5110 = TextResource.$stable;
                    int i5111 = i5110 << 3;
                    int i619 = i5110 << 9;
                    int i6110 = C2886a.f11498d << 12;
                    int i6111 = i5110 << 24;
                    int i6112 = i37 << 21;
                    z19 = z17;
                    function7 = function5;
                    z24 = true;
                    c28676v1 = c28676v0;
                    d17 = d16;
                    f17 = 1.0f;
                    AbstractC30787f.m94664c(modifierM3599a7, textResourceM21278l14, null, textResourceM21278l13, c2886aM8432m7, null, null, null, errorMessage, z18, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e7, null, null, null, null, false, (InterfaceC4339a) objM87133R, onTextChanged, onNumberChanged, c28655q5, i5111 | i619 | i6110 | i6111 | ((i26 << 6) & 234881024), 384, (i6112 & 29360128) | 1572864 | (i6112 & 234881024), 66055396);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > r5) {
                        f18 = Float.MAX_VALUE;
                    } else {
                        f18 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f18, true);
                    C33252i c33252iM105489e8 = AbstractC33253j.m105489e(f27);
                    TextResource textResourceM21278l15 = AbstractC8693b.m21278l(biomarkerItemState.getUnitLabel());
                    C2886a c2886aM8432m8 = c38072d8.m121952e(c28655q5, i519).getFormLabel();
                    TextResource textResourceM21278l16 = AbstractC8693b.m21278l(str3);
                    TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                    boolean z310 = !z19;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v1) {
                        objM87133R2 = new C38492a(27);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    if ((i26 & 234881024) == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i37 & 896) == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objM87133R3 = c28655q5.m87133R();
                    if (z27) {
                        function8 = function7;
                        objM87133R3 = new C1017f0(z19, function8, 7);
                        c28655q5.m87172p0(objM87133R3);
                    } else {
                        function8 = function7;
                        objM87133R3 = new C1017f0(z19, function8, 7);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    AbstractC30792k.m94678l(layoutWeightElement4, textResourceM21278l16, null, textResourceM21278l15, c2886aM8432m8, null, null, null, textResourceM21267a4, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, z310, null, null, c33252iM105489e8, null, null, null, null, interfaceC4339a5, (Function1) objM87133R3, c28655q5, i5111 | 805306368 | i619 | i6110 | i6111, 24576, 0, 6, 1035975908, 0);
                    c28655q5 = c28655q5;
                    c28655q5.m87173q(true);
                    z28 = false;
                    c28655q5.m87173q(false);
                    f19 = f15;
                    c2314t2 = c2314t;
                }
                AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f19, c2314t2));
                interfaceC25312uM118856e = biomarkerItemState.getInfoCallout();
                if (interfaceC25312uM118856e == null) {
                    c28655q5.m87150e0(793262193);
                    c28655q5.m87173q(z28);
                    c28655q2 = c28655q5;
                    i38 = 4;
                } else {
                    c28655q5.m87150e0(793262194);
                    AbstractC25303l.m74291r(interfaceC25312uM118856e, null, null, null, c28655q5, 0, 14);
                    c28655q2 = c28655q5;
                    i38 = 4;
                    AbstractC25012a.m73388u(4, f14, c2314t2, c28655q2, z28);
                }
                if (biomarkerItemState.m118854c() != null) {
                    if (d17 != null) {
                        d18 = d17;
                        if (!AbstractC22676k.m65742b(d18, biomarkerItemState.getValue())) {
                            z34 = z24;
                        }
                    } else {
                        d18 = d17;
                    }
                    z34 = z28;
                } else {
                    d18 = d17;
                    if (z4) {
                    }
                    z34 = z28;
                }
                int i6113 = i38;
                Function1 function12 = function8;
                Double d211 = d18;
                c28655q3 = c28655q2;
                C27238a0 c27238a0M82077b4 = C27238a0.m82077b(saveButtonState, null, null, null, null, 0.0f, null, null, null, z34, false, 767, null);
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(f17, c2314t2), "modal_save_button");
                if ((i37 & 57344) == 16384) {
                    z35 = z24;
                } else {
                    z35 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z35) {
                    interfaceC4339a = onSave;
                    objM87133R4 = new C39272e(interfaceC4339a, 2);
                    c28655q4 = c28655q3;
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    interfaceC4339a = onSave;
                    objM87133R4 = new C39272e(interfaceC4339a, 2);
                    c28655q4 = c28655q3;
                    c28655q4.m87172p0(objM87133R4);
                }
                AbstractC27292z.m82341h(c27238a0M82077b4, modifierM3599a8, null, (InterfaceC4339a) objM87133R4, c28655q4, C27238a0.f109008k | 48, 4);
                AbstractC31061c.m95650z(f16, i6113, c2314t2, c28655q4, z24);
                z16 = z19;
                c28655q = c28655q4;
                d14 = d211;
                str2 = str3;
                modifier3 = modifier8;
                function3 = function12;
                function4 = function6;
            } else {
                interfaceC4339a = onSave;
                c28655q5.m87138X();
                str2 = str;
                z16 = z14;
                d14 = d3;
                modifier3 = modifier2;
                c28655q = c28655q5;
                function3 = function1;
                function4 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23195w2(modifier3, biomarkerItemState, inputValue, str2, z4, z13, errorMessage, saveButtonState, z16, d14, onTextChanged, onNumberChanged, function3, function4, interfaceC4339a, i13, i14, i15);
            }
        }
        i49 |= 3072;
        i17 = i13 & 24576;
        i18 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i17 == 0) {
            if (c28655q5.m87155h(z4)) {
                i47 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i47 = 8192;
            }
            i49 |= i47;
        }
        if ((196608 & i13) == 0) {
            if (c28655q5.m87155h(z13)) {
                i46 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i46 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i49 |= i46;
        }
        if ((i13 & 1572864) == 0) {
            if ((i13 & 2097152) == 0) {
                zM87157i2 = c28655q5.m87153g(errorMessage);
            } else {
                zM87157i2 = c28655q5.m87157i(errorMessage);
            }
            if (zM87157i2) {
                i45 = 1048576;
            } else {
                i45 = 524288;
            }
            i49 |= i45;
        }
        if ((i13 & 12582912) == 0) {
            if ((i13 & 16777216) == 0) {
                zM87157i = c28655q5.m87153g(saveButtonState);
            } else {
                zM87157i = c28655q5.m87157i(saveButtonState);
            }
            if (zM87157i) {
                i44 = 8388608;
            } else {
                i44 = 4194304;
            }
            i49 |= i44;
        }
        i19 = i15 & 256;
        if (i19 != 0) {
            i49 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q5.m87155h(z14)) {
                i24 = 67108864;
            } else {
                i24 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i49 |= i24;
        }
        i25 = i15 & 512;
        if (i25 != 0) {
            i25 = i25;
            i26 = i49 | 805306368;
        } else {
            if ((i13 & 805306368) != 0) {
                if (c28655q5.m87153g(d3)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i49 |= i27;
            }
            i26 = i49;
        }
        if ((i14 & 6) == 0) {
            if (c28655q5.m87157i(onTextChanged)) {
                i39 = 4;
            } else {
                i39 = 2;
            }
            i28 = i39 | i14;
        } else {
            i28 = i14;
        }
        if ((i14 & 48) == 0) {
            i28 |= c28655q5.m87157i(onNumberChanged) ? 32 : 16;
        }
        i29 = i15 & 4096;
        if (i29 != 0) {
            i34 = i29;
            if ((i14 & 384) == 0) {
                i28 |= c28655q5.m87157i(function1) ? 256 : 128;
            }
            i35 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i35 != 0) {
                i36 = i35;
                if ((i14 & 3072) == 0) {
                    if (c28655q5.m87157i(function2)) {
                        i55 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i28 |= i55;
                }
                if ((i14 & 24576) == 0) {
                    if (c28655q5.m87157i(onSave)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i28 |= i18;
                }
                i37 = i28;
                if ((i26 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q5.m87135U(i26 & 1, z15)) {
                    c2314t = C2314t.f9131w;
                    if (i48 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i54 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i25 != 0) {
                        d15 = null;
                    } else {
                        d15 = d3;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        objM87133R7 = c28655q5.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C39211b(13);
                            c28655q5.m87172p0(objM87133R7);
                        }
                        function5 = (Function1) objM87133R7;
                    } else {
                        function5 = function1;
                    }
                    if (i36 != 0) {
                        objM87133R6 = c28655q5.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39211b(14);
                            c28655q5.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    } else {
                        function6 = function2;
                    }
                    f13 = 2;
                    f14 = 8;
                    f15 = f13 * f14;
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, f15, 7), f15, 0.0f, 2);
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q5, 48);
                    Double d113 = d15;
                    iHashCode = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q5.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q5, modifierM3396r5);
                    InterfaceC0221l.f734a.getClass();
                    d16 = d113;
                    c0213j = C0217k.f724b;
                    c28655q5.m87158i0();
                    Modifier modifier9 = modifier4;
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a9);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m13);
                    c0209i3 = C0217k.f732j;
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N13);
                    if (biomarkerItemState.m118854c() != null) {
                        c28655q5.m87150e0(790661728);
                        Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                        f16 = f13;
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q5, 6);
                        iHashCode3 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q5.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q5, modifierM3409f9);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m14);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N14);
                        String strM118864m5 = biomarkerItemState.getValueLabel();
                        C38072d c38072d9 = C38072d.f163053a;
                        int i5112 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strM118864m5, null, c38072d9.m121949b(c28655q5, i5112).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q5, i5112).getFormLabel(), null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                        c28655q5.m87150e0(561878599);
                        while (r1.hasNext()) {
                            Double d212 = d16;
                            boolean zM65741a5 = AbstractC22676k.m65741a(d212, c37032c.getValue());
                            if ((i37 & 7168) == 2048) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            zM87153g = z36 | c28655q5.m87153g(c37032c);
                            objM87133R5 = c28655q5.m87133R();
                            if (zM87153g) {
                                objM87133R5 = new C37550r(function6, c37032c, 18);
                                c28655q5.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C37550r(function6, c37032c, 18);
                                c28655q5.m87172p0(objM87133R5);
                            }
                            m125614R(c37032c, zM65741a5, (InterfaceC4339a) objM87133R5, c28655q5, 0);
                            d16 = d212;
                        }
                        AbstractC25012a.m73392y(c28655q5, false, true, false);
                        d17 = d16;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        f17 = 1.0f;
                        z19 = z17;
                        function8 = function5;
                        z24 = true;
                        z28 = false;
                        f19 = f15;
                    } else {
                        f16 = f13;
                        c28655q5.m87150e0(791452166);
                        Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t);
                        float f28 = 4 * f16;
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f28), C2299e.f9107J, c28655q5, 6);
                        iHashCode2 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q5.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q5, modifierM3409f10);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m15);
                        if (c28655q5.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N15);
                        if (2.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3599a9 = AbstractC1136a.m3599a(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "reading_input");
                        C33252i c33252iM105489e9 = AbstractC33253j.m105489e(f28);
                        TextResource textResourceM21278l17 = AbstractC8693b.m21278l(biomarkerItemState.getValueLabel());
                        C38072d c38072d10 = C38072d.f163053a;
                        int i5113 = C38072d.f163054b;
                        C2886a c2886aM8432m9 = c38072d10.m121952e(c28655q5, i5113).getFormLabel();
                        TextResource textResourceM21278l18 = AbstractC8693b.m21278l(inputValue);
                        if (z4) {
                            z18 = false;
                        } else {
                            if (inputValue.length() > 0) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (z29) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C38492a(26);
                            c28655q5.m87172p0(objM87133R);
                        }
                        int i5114 = TextResource.$stable;
                        int i5115 = i5114 << 3;
                        int i6114 = i5114 << 9;
                        int i6115 = C2886a.f11498d << 12;
                        int i6116 = i5114 << 24;
                        int i6117 = i37 << 21;
                        z19 = z17;
                        function7 = function5;
                        z24 = true;
                        c28676v1 = c28676v0;
                        d17 = d16;
                        f17 = 1.0f;
                        AbstractC30787f.m94664c(modifierM3599a9, textResourceM21278l18, null, textResourceM21278l17, c2886aM8432m9, null, null, null, errorMessage, z18, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e9, null, null, null, null, false, (InterfaceC4339a) objM87133R, onTextChanged, onNumberChanged, c28655q5, i5115 | i6114 | i6115 | i6116 | ((i26 << 6) & 234881024), 384, (i6117 & 29360128) | 1572864 | (i6117 & 234881024), 66055396);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > r5) {
                            f18 = Float.MAX_VALUE;
                        } else {
                            f18 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(f18, true);
                        C33252i c33252iM105489e10 = AbstractC33253j.m105489e(f28);
                        TextResource textResourceM21278l19 = AbstractC8693b.m21278l(biomarkerItemState.getUnitLabel());
                        C2886a c2886aM8432m10 = c38072d10.m121952e(c28655q5, i5113).getFormLabel();
                        TextResource textResourceM21278l110 = AbstractC8693b.m21278l(str3);
                        TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                        boolean z311 = !z19;
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v1) {
                            objM87133R2 = new C38492a(27);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                        if ((i26 & 234881024) == 67108864) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i37 & 896) == 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objM87133R3 = c28655q5.m87133R();
                        if (z27) {
                            function8 = function7;
                            objM87133R3 = new C1017f0(z19, function8, 7);
                            c28655q5.m87172p0(objM87133R3);
                        } else {
                            function8 = function7;
                            objM87133R3 = new C1017f0(z19, function8, 7);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        AbstractC30792k.m94678l(layoutWeightElement5, textResourceM21278l110, null, textResourceM21278l19, c2886aM8432m10, null, null, null, textResourceM21267a5, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, z311, null, null, c33252iM105489e10, null, null, null, null, interfaceC4339a6, (Function1) objM87133R3, c28655q5, i5115 | 805306368 | i6114 | i6115 | i6116, 24576, 0, 6, 1035975908, 0);
                        c28655q5 = c28655q5;
                        c28655q5.m87173q(true);
                        z28 = false;
                        c28655q5.m87173q(false);
                        f19 = f15;
                        c2314t2 = c2314t;
                    }
                    AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f19, c2314t2));
                    interfaceC25312uM118856e = biomarkerItemState.getInfoCallout();
                    if (interfaceC25312uM118856e == null) {
                        c28655q5.m87150e0(793262193);
                        c28655q5.m87173q(z28);
                        c28655q2 = c28655q5;
                        i38 = 4;
                    } else {
                        c28655q5.m87150e0(793262194);
                        AbstractC25303l.m74291r(interfaceC25312uM118856e, null, null, null, c28655q5, 0, 14);
                        c28655q2 = c28655q5;
                        i38 = 4;
                        AbstractC25012a.m73388u(4, f14, c2314t2, c28655q2, z28);
                    }
                    if (biomarkerItemState.m118854c() != null) {
                        if (d17 != null) {
                            d18 = d17;
                            if (!AbstractC22676k.m65742b(d18, biomarkerItemState.getValue())) {
                                z34 = z24;
                            }
                        } else {
                            d18 = d17;
                        }
                        z34 = z28;
                    } else {
                        d18 = d17;
                        if (z4) {
                        }
                        z34 = z28;
                    }
                    int i6118 = i38;
                    Function1 function13 = function8;
                    Double d213 = d18;
                    c28655q3 = c28655q2;
                    C27238a0 c27238a0M82077b5 = C27238a0.m82077b(saveButtonState, null, null, null, null, 0.0f, null, null, null, z34, false, 767, null);
                    Modifier modifierM3599a10 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(f17, c2314t2), "modal_save_button");
                    if ((i37 & 57344) == 16384) {
                        z35 = z24;
                    } else {
                        z35 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z35) {
                        interfaceC4339a = onSave;
                        objM87133R4 = new C39272e(interfaceC4339a, 2);
                        c28655q4 = c28655q3;
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        interfaceC4339a = onSave;
                        objM87133R4 = new C39272e(interfaceC4339a, 2);
                        c28655q4 = c28655q3;
                        c28655q4.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82341h(c27238a0M82077b5, modifierM3599a10, null, (InterfaceC4339a) objM87133R4, c28655q4, C27238a0.f109008k | 48, 4);
                    AbstractC31061c.m95650z(f16, i6118, c2314t2, c28655q4, z24);
                    z16 = z19;
                    c28655q = c28655q4;
                    d14 = d213;
                    str2 = str3;
                    modifier3 = modifier9;
                    function3 = function13;
                    function4 = function6;
                } else {
                    interfaceC4339a = onSave;
                    c28655q5.m87138X();
                    str2 = str;
                    z16 = z14;
                    d14 = d3;
                    modifier3 = modifier2;
                    c28655q = c28655q5;
                    function3 = function1;
                    function4 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23195w2(modifier3, biomarkerItemState, inputValue, str2, z4, z13, errorMessage, saveButtonState, z16, d14, onTextChanged, onNumberChanged, function3, function4, interfaceC4339a, i13, i14, i15);
                }
            }
            i28 |= 3072;
            i36 = i35;
            if ((i14 & 24576) == 0) {
                if (c28655q5.m87157i(onSave)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i28 |= i18;
            }
            i37 = i28;
            if ((i26 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q5.m87135U(i26 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i48 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i54 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i19 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i25 != 0) {
                    d15 = null;
                } else {
                    d15 = d3;
                }
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R7 = c28655q5.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C39211b(13);
                        c28655q5.m87172p0(objM87133R7);
                    }
                    function5 = (Function1) objM87133R7;
                } else {
                    function5 = function1;
                }
                if (i36 != 0) {
                    objM87133R6 = c28655q5.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39211b(14);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function2;
                }
                f13 = 2;
                f14 = 8;
                f15 = f13 * f14;
                Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, f15, 7), f15, 0.0f, 2);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q5, 48);
                Double d114 = d15;
                iHashCode = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q5.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q5, modifierM3396r6);
                InterfaceC0221l.f734a.getClass();
                d16 = d114;
                c0213j = C0217k.f724b;
                c28655q5.m87158i0();
                Modifier modifier10 = modifier4;
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a11);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m16);
                c0209i3 = C0217k.f732j;
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N16);
                if (biomarkerItemState.m118854c() != null) {
                    c28655q5.m87150e0(790661728);
                    Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f16 = f13;
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q5, 6);
                    iHashCode3 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q5.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q5, modifierM3409f11);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m17);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N17);
                    String strM118864m6 = biomarkerItemState.getValueLabel();
                    C38072d c38072d11 = C38072d.f163053a;
                    int i5116 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM118864m6, null, c38072d11.m121949b(c28655q5, i5116).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q5, i5116).getFormLabel(), null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                    c28655q5.m87150e0(561878599);
                    while (r1.hasNext()) {
                        Double d214 = d16;
                        boolean zM65741a6 = AbstractC22676k.m65741a(d214, c37032c.getValue());
                        if ((i37 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        zM87153g = z36 | c28655q5.m87153g(c37032c);
                        objM87133R5 = c28655q5.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C37550r(function6, c37032c, 18);
                            c28655q5.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C37550r(function6, c37032c, 18);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        m125614R(c37032c, zM65741a6, (InterfaceC4339a) objM87133R5, c28655q5, 0);
                        d16 = d214;
                    }
                    AbstractC25012a.m73392y(c28655q5, false, true, false);
                    d17 = d16;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    f17 = 1.0f;
                    z19 = z17;
                    function8 = function5;
                    z24 = true;
                    z28 = false;
                    f19 = f15;
                } else {
                    f16 = f13;
                    c28655q5.m87150e0(791452166);
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f29 = 4 * f16;
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f29), C2299e.f9107J, c28655q5, 6);
                    iHashCode2 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q5.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q5, modifierM3409f12);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m18);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N18);
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3599a11 = AbstractC1136a.m3599a(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "reading_input");
                    C33252i c33252iM105489e11 = AbstractC33253j.m105489e(f29);
                    TextResource textResourceM21278l111 = AbstractC8693b.m21278l(biomarkerItemState.getValueLabel());
                    C38072d c38072d12 = C38072d.f163053a;
                    int i5117 = C38072d.f163054b;
                    C2886a c2886aM8432m11 = c38072d12.m121952e(c28655q5, i5117).getFormLabel();
                    TextResource textResourceM21278l112 = AbstractC8693b.m21278l(inputValue);
                    if (z4) {
                        z18 = false;
                    } else {
                        if (inputValue.length() > 0) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if (z29) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C38492a(26);
                        c28655q5.m87172p0(objM87133R);
                    }
                    int i5118 = TextResource.$stable;
                    int i5119 = i5118 << 3;
                    int i6119 = i5118 << 9;
                    int i61110 = C2886a.f11498d << 12;
                    int i61111 = i5118 << 24;
                    int i61112 = i37 << 21;
                    z19 = z17;
                    function7 = function5;
                    z24 = true;
                    c28676v1 = c28676v0;
                    d17 = d16;
                    f17 = 1.0f;
                    AbstractC30787f.m94664c(modifierM3599a11, textResourceM21278l112, null, textResourceM21278l111, c2886aM8432m11, null, null, null, errorMessage, z18, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e11, null, null, null, null, false, (InterfaceC4339a) objM87133R, onTextChanged, onNumberChanged, c28655q5, i5119 | i6119 | i61110 | i61111 | ((i26 << 6) & 234881024), 384, (i61112 & 29360128) | 1572864 | (i61112 & 234881024), 66055396);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > r5) {
                        f18 = Float.MAX_VALUE;
                    } else {
                        f18 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(f18, true);
                    C33252i c33252iM105489e12 = AbstractC33253j.m105489e(f29);
                    TextResource textResourceM21278l113 = AbstractC8693b.m21278l(biomarkerItemState.getUnitLabel());
                    C2886a c2886aM8432m12 = c38072d12.m121952e(c28655q5, i5117).getFormLabel();
                    TextResource textResourceM21278l114 = AbstractC8693b.m21278l(str3);
                    TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                    boolean z312 = !z19;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v1) {
                        objM87133R2 = new C38492a(27);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    if ((i26 & 234881024) == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i37 & 896) == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objM87133R3 = c28655q5.m87133R();
                    if (z27) {
                        function8 = function7;
                        objM87133R3 = new C1017f0(z19, function8, 7);
                        c28655q5.m87172p0(objM87133R3);
                    } else {
                        function8 = function7;
                        objM87133R3 = new C1017f0(z19, function8, 7);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    AbstractC30792k.m94678l(layoutWeightElement6, textResourceM21278l114, null, textResourceM21278l113, c2886aM8432m12, null, null, null, textResourceM21267a6, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, z312, null, null, c33252iM105489e12, null, null, null, null, interfaceC4339a7, (Function1) objM87133R3, c28655q5, i5119 | 805306368 | i6119 | i61110 | i61111, 24576, 0, 6, 1035975908, 0);
                    c28655q5 = c28655q5;
                    c28655q5.m87173q(true);
                    z28 = false;
                    c28655q5.m87173q(false);
                    f19 = f15;
                    c2314t2 = c2314t;
                }
                AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f19, c2314t2));
                interfaceC25312uM118856e = biomarkerItemState.getInfoCallout();
                if (interfaceC25312uM118856e == null) {
                    c28655q5.m87150e0(793262193);
                    c28655q5.m87173q(z28);
                    c28655q2 = c28655q5;
                    i38 = 4;
                } else {
                    c28655q5.m87150e0(793262194);
                    AbstractC25303l.m74291r(interfaceC25312uM118856e, null, null, null, c28655q5, 0, 14);
                    c28655q2 = c28655q5;
                    i38 = 4;
                    AbstractC25012a.m73388u(4, f14, c2314t2, c28655q2, z28);
                }
                if (biomarkerItemState.m118854c() != null) {
                    if (d17 != null) {
                        d18 = d17;
                        if (!AbstractC22676k.m65742b(d18, biomarkerItemState.getValue())) {
                            z34 = z24;
                        }
                    } else {
                        d18 = d17;
                    }
                    z34 = z28;
                } else {
                    d18 = d17;
                    if (z4) {
                    }
                    z34 = z28;
                }
                int i61113 = i38;
                Function1 function14 = function8;
                Double d215 = d18;
                c28655q3 = c28655q2;
                C27238a0 c27238a0M82077b6 = C27238a0.m82077b(saveButtonState, null, null, null, null, 0.0f, null, null, null, z34, false, 767, null);
                Modifier modifierM3599a12 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(f17, c2314t2), "modal_save_button");
                if ((i37 & 57344) == 16384) {
                    z35 = z24;
                } else {
                    z35 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z35) {
                    interfaceC4339a = onSave;
                    objM87133R4 = new C39272e(interfaceC4339a, 2);
                    c28655q4 = c28655q3;
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    interfaceC4339a = onSave;
                    objM87133R4 = new C39272e(interfaceC4339a, 2);
                    c28655q4 = c28655q3;
                    c28655q4.m87172p0(objM87133R4);
                }
                AbstractC27292z.m82341h(c27238a0M82077b6, modifierM3599a12, null, (InterfaceC4339a) objM87133R4, c28655q4, C27238a0.f109008k | 48, 4);
                AbstractC31061c.m95650z(f16, i61113, c2314t2, c28655q4, z24);
                z16 = z19;
                c28655q = c28655q4;
                d14 = d215;
                str2 = str3;
                modifier3 = modifier10;
                function3 = function14;
                function4 = function6;
            } else {
                interfaceC4339a = onSave;
                c28655q5.m87138X();
                str2 = str;
                z16 = z14;
                d14 = d3;
                modifier3 = modifier2;
                c28655q = c28655q5;
                function3 = function1;
                function4 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23195w2(modifier3, biomarkerItemState, inputValue, str2, z4, z13, errorMessage, saveButtonState, z16, d14, onTextChanged, onNumberChanged, function3, function4, interfaceC4339a, i13, i14, i15);
            }
        }
        i28 |= 384;
        i34 = i29;
        i35 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i35 != 0) {
            i36 = i35;
            if ((i14 & 3072) == 0) {
                if (c28655q5.m87157i(function2)) {
                    i55 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i28 |= i55;
            }
            if ((i14 & 24576) == 0) {
                if (c28655q5.m87157i(onSave)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i28 |= i18;
            }
            i37 = i28;
            if ((i26 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q5.m87135U(i26 & 1, z15)) {
                c2314t = C2314t.f9131w;
                if (i48 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i54 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i19 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i25 != 0) {
                    d15 = null;
                } else {
                    d15 = d3;
                }
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R7 = c28655q5.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C39211b(13);
                        c28655q5.m87172p0(objM87133R7);
                    }
                    function5 = (Function1) objM87133R7;
                } else {
                    function5 = function1;
                }
                if (i36 != 0) {
                    objM87133R6 = c28655q5.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39211b(14);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function2;
                }
                f13 = 2;
                f14 = 8;
                f15 = f13 * f14;
                Modifier modifierM3396r7 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, f15, 7), f15, 0.0f, 2);
                C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q5, 48);
                Double d115 = d15;
                iHashCode = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q5.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q5, modifierM3396r7);
                InterfaceC0221l.f734a.getClass();
                d16 = d115;
                c0213j = C0217k.f724b;
                c28655q5.m87158i0();
                Modifier modifier11 = modifier4;
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a13);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m19);
                c0209i3 = C0217k.f732j;
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N19);
                if (biomarkerItemState.m118854c() != null) {
                    c28655q5.m87150e0(790661728);
                    Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t);
                    f16 = f13;
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q5, 6);
                    iHashCode3 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q5.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q5, modifierM3409f13);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m110);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N110);
                    String strM118864m7 = biomarkerItemState.getValueLabel();
                    C38072d c38072d13 = C38072d.f163053a;
                    int i51110 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM118864m7, null, c38072d13.m121949b(c28655q5, i51110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d13.m121952e(c28655q5, i51110).getFormLabel(), null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                    c28655q5.m87150e0(561878599);
                    while (r1.hasNext()) {
                        Double d216 = d16;
                        boolean zM65741a7 = AbstractC22676k.m65741a(d216, c37032c.getValue());
                        if ((i37 & 7168) == 2048) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        zM87153g = z36 | c28655q5.m87153g(c37032c);
                        objM87133R5 = c28655q5.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new C37550r(function6, c37032c, 18);
                            c28655q5.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C37550r(function6, c37032c, 18);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        m125614R(c37032c, zM65741a7, (InterfaceC4339a) objM87133R5, c28655q5, 0);
                        d16 = d216;
                    }
                    AbstractC25012a.m73392y(c28655q5, false, true, false);
                    d17 = d16;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    f17 = 1.0f;
                    z19 = z17;
                    function8 = function5;
                    z24 = true;
                    z28 = false;
                    f19 = f15;
                } else {
                    f16 = f13;
                    c28655q5.m87150e0(791452166);
                    Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f210 = 4 * f16;
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f210), C2299e.f9107J, c28655q5, 6);
                    iHashCode2 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q5.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q5, modifierM3409f14);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m111);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N111);
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3599a13 = AbstractC1136a.m3599a(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "reading_input");
                    C33252i c33252iM105489e13 = AbstractC33253j.m105489e(f210);
                    TextResource textResourceM21278l115 = AbstractC8693b.m21278l(biomarkerItemState.getValueLabel());
                    C38072d c38072d14 = C38072d.f163053a;
                    int i51111 = C38072d.f163054b;
                    C2886a c2886aM8432m13 = c38072d14.m121952e(c28655q5, i51111).getFormLabel();
                    TextResource textResourceM21278l116 = AbstractC8693b.m21278l(inputValue);
                    if (z4) {
                        z18 = false;
                    } else {
                        if (inputValue.length() > 0) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if (z29) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C38492a(26);
                        c28655q5.m87172p0(objM87133R);
                    }
                    int i51112 = TextResource.$stable;
                    int i51113 = i51112 << 3;
                    int i61114 = i51112 << 9;
                    int i61115 = C2886a.f11498d << 12;
                    int i61116 = i51112 << 24;
                    int i61117 = i37 << 21;
                    z19 = z17;
                    function7 = function5;
                    z24 = true;
                    c28676v1 = c28676v0;
                    d17 = d16;
                    f17 = 1.0f;
                    AbstractC30787f.m94664c(modifierM3599a13, textResourceM21278l116, null, textResourceM21278l115, c2886aM8432m13, null, null, null, errorMessage, z18, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e13, null, null, null, null, false, (InterfaceC4339a) objM87133R, onTextChanged, onNumberChanged, c28655q5, i51113 | i61114 | i61115 | i61116 | ((i26 << 6) & 234881024), 384, (i61117 & 29360128) | 1572864 | (i61117 & 234881024), 66055396);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > r5) {
                        f18 = Float.MAX_VALUE;
                    } else {
                        f18 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(f18, true);
                    C33252i c33252iM105489e14 = AbstractC33253j.m105489e(f210);
                    TextResource textResourceM21278l117 = AbstractC8693b.m21278l(biomarkerItemState.getUnitLabel());
                    C2886a c2886aM8432m14 = c38072d14.m121952e(c28655q5, i51111).getFormLabel();
                    TextResource textResourceM21278l118 = AbstractC8693b.m21278l(str3);
                    TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                    boolean z313 = !z19;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v1) {
                        objM87133R2 = new C38492a(27);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                    if ((i26 & 234881024) == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i37 & 896) == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objM87133R3 = c28655q5.m87133R();
                    if (z27) {
                        function8 = function7;
                        objM87133R3 = new C1017f0(z19, function8, 7);
                        c28655q5.m87172p0(objM87133R3);
                    } else {
                        function8 = function7;
                        objM87133R3 = new C1017f0(z19, function8, 7);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    AbstractC30792k.m94678l(layoutWeightElement7, textResourceM21278l118, null, textResourceM21278l117, c2886aM8432m14, null, null, null, textResourceM21267a7, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, z313, null, null, c33252iM105489e14, null, null, null, null, interfaceC4339a8, (Function1) objM87133R3, c28655q5, i51113 | 805306368 | i61114 | i61115 | i61116, 24576, 0, 6, 1035975908, 0);
                    c28655q5 = c28655q5;
                    c28655q5.m87173q(true);
                    z28 = false;
                    c28655q5.m87173q(false);
                    f19 = f15;
                    c2314t2 = c2314t;
                }
                AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f19, c2314t2));
                interfaceC25312uM118856e = biomarkerItemState.getInfoCallout();
                if (interfaceC25312uM118856e == null) {
                    c28655q5.m87150e0(793262193);
                    c28655q5.m87173q(z28);
                    c28655q2 = c28655q5;
                    i38 = 4;
                } else {
                    c28655q5.m87150e0(793262194);
                    AbstractC25303l.m74291r(interfaceC25312uM118856e, null, null, null, c28655q5, 0, 14);
                    c28655q2 = c28655q5;
                    i38 = 4;
                    AbstractC25012a.m73388u(4, f14, c2314t2, c28655q2, z28);
                }
                if (biomarkerItemState.m118854c() != null) {
                    if (d17 != null) {
                        d18 = d17;
                        if (!AbstractC22676k.m65742b(d18, biomarkerItemState.getValue())) {
                            z34 = z24;
                        }
                    } else {
                        d18 = d17;
                    }
                    z34 = z28;
                } else {
                    d18 = d17;
                    if (z4) {
                    }
                    z34 = z28;
                }
                int i61118 = i38;
                Function1 function15 = function8;
                Double d217 = d18;
                c28655q3 = c28655q2;
                C27238a0 c27238a0M82077b7 = C27238a0.m82077b(saveButtonState, null, null, null, null, 0.0f, null, null, null, z34, false, 767, null);
                Modifier modifierM3599a14 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(f17, c2314t2), "modal_save_button");
                if ((i37 & 57344) == 16384) {
                    z35 = z24;
                } else {
                    z35 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z35) {
                    interfaceC4339a = onSave;
                    objM87133R4 = new C39272e(interfaceC4339a, 2);
                    c28655q4 = c28655q3;
                    c28655q4.m87172p0(objM87133R4);
                } else {
                    interfaceC4339a = onSave;
                    objM87133R4 = new C39272e(interfaceC4339a, 2);
                    c28655q4 = c28655q3;
                    c28655q4.m87172p0(objM87133R4);
                }
                AbstractC27292z.m82341h(c27238a0M82077b7, modifierM3599a14, null, (InterfaceC4339a) objM87133R4, c28655q4, C27238a0.f109008k | 48, 4);
                AbstractC31061c.m95650z(f16, i61118, c2314t2, c28655q4, z24);
                z16 = z19;
                c28655q = c28655q4;
                d14 = d217;
                str2 = str3;
                modifier3 = modifier11;
                function3 = function15;
                function4 = function6;
            } else {
                interfaceC4339a = onSave;
                c28655q5.m87138X();
                str2 = str;
                z16 = z14;
                d14 = d3;
                modifier3 = modifier2;
                c28655q = c28655q5;
                function3 = function1;
                function4 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23195w2(modifier3, biomarkerItemState, inputValue, str2, z4, z13, errorMessage, saveButtonState, z16, d14, onTextChanged, onNumberChanged, function3, function4, interfaceC4339a, i13, i14, i15);
            }
        }
        i28 |= 3072;
        i36 = i35;
        if ((i14 & 24576) == 0) {
            if (c28655q5.m87157i(onSave)) {
                i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i28 |= i18;
        }
        i37 = i28;
        if ((i26 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (c28655q5.m87135U(i26 & 1, z15)) {
            c2314t = C2314t.f9131w;
            if (i48 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i54 != 0) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (i19 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            if (i25 != 0) {
                d15 = null;
            } else {
                d15 = d3;
            }
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                objM87133R7 = c28655q5.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C39211b(13);
                    c28655q5.m87172p0(objM87133R7);
                }
                function5 = (Function1) objM87133R7;
            } else {
                function5 = function1;
            }
            if (i36 != 0) {
                objM87133R6 = c28655q5.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C39211b(14);
                    c28655q5.m87172p0(objM87133R6);
                }
                function6 = (Function1) objM87133R6;
            } else {
                function6 = function2;
            }
            f13 = 2;
            f14 = 8;
            f15 = f13 * f14;
            Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, f15, 7), f15, 0.0f, 2);
            C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q5, 48);
            Double d116 = d15;
            iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q5.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q5, modifierM3396r8);
            InterfaceC0221l.f734a.getClass();
            d16 = d116;
            c0213j = C0217k.f724b;
            c28655q5.m87158i0();
            Modifier modifier12 = modifier4;
            if (c28655q5.f115903S) {
                c28655q5.m87163l(c0213j);
            } else {
                c28655q5.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a15);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m112);
            c0209i3 = C0217k.f732j;
            if (c28655q5.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N112);
            if (biomarkerItemState.m118854c() != null) {
                c28655q5.m87150e0(790661728);
                Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t);
                f16 = f13;
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q5, 6);
                iHashCode3 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q5.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q5, modifierM3409f15);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m113);
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N113);
                String strM118864m8 = biomarkerItemState.getValueLabel();
                C38072d c38072d15 = C38072d.f163053a;
                int i51114 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM118864m8, null, c38072d15.m121949b(c28655q5, i51114).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d15.m121952e(c28655q5, i51114).getFormLabel(), null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                c28655q5.m87150e0(561878599);
                while (r1.hasNext()) {
                    Double d218 = d16;
                    boolean zM65741a8 = AbstractC22676k.m65741a(d218, c37032c.getValue());
                    if ((i37 & 7168) == 2048) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    zM87153g = z36 | c28655q5.m87153g(c37032c);
                    objM87133R5 = c28655q5.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new C37550r(function6, c37032c, 18);
                        c28655q5.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C37550r(function6, c37032c, 18);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    m125614R(c37032c, zM65741a8, (InterfaceC4339a) objM87133R5, c28655q5, 0);
                    d16 = d218;
                }
                AbstractC25012a.m73392y(c28655q5, false, true, false);
                d17 = d16;
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                f17 = 1.0f;
                z19 = z17;
                function8 = function5;
                z24 = true;
                z28 = false;
                f19 = f15;
            } else {
                f16 = f13;
                c28655q5.m87150e0(791452166);
                Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f211 = 4 * f16;
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f211), C2299e.f9107J, c28655q5, 6);
                iHashCode2 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q5.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q5, modifierM3409f16);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m114);
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N114);
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3599a15 = AbstractC1136a.m3599a(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "reading_input");
                C33252i c33252iM105489e15 = AbstractC33253j.m105489e(f211);
                TextResource textResourceM21278l119 = AbstractC8693b.m21278l(biomarkerItemState.getValueLabel());
                C38072d c38072d16 = C38072d.f163053a;
                int i51115 = C38072d.f163054b;
                C2886a c2886aM8432m15 = c38072d16.m121952e(c28655q5, i51115).getFormLabel();
                TextResource textResourceM21278l1110 = AbstractC8693b.m21278l(inputValue);
                if (z4) {
                    z18 = false;
                } else {
                    if (inputValue.length() > 0) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (z29) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C38492a(26);
                    c28655q5.m87172p0(objM87133R);
                }
                int i51116 = TextResource.$stable;
                int i51117 = i51116 << 3;
                int i61119 = i51116 << 9;
                int i611110 = C2886a.f11498d << 12;
                int i611111 = i51116 << 24;
                int i611112 = i37 << 21;
                z19 = z17;
                function7 = function5;
                z24 = true;
                c28676v1 = c28676v0;
                d17 = d16;
                f17 = 1.0f;
                AbstractC30787f.m94664c(modifierM3599a15, textResourceM21278l1110, null, textResourceM21278l119, c2886aM8432m15, null, null, null, errorMessage, z18, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e15, null, null, null, null, false, (InterfaceC4339a) objM87133R, onTextChanged, onNumberChanged, c28655q5, i51117 | i61119 | i611110 | i611111 | ((i26 << 6) & 234881024), 384, (i611112 & 29360128) | 1572864 | (i611112 & 234881024), 66055396);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > r5) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(f18, true);
                C33252i c33252iM105489e16 = AbstractC33253j.m105489e(f211);
                TextResource textResourceM21278l1111 = AbstractC8693b.m21278l(biomarkerItemState.getUnitLabel());
                C2886a c2886aM8432m16 = c38072d16.m121952e(c28655q5, i51115).getFormLabel();
                TextResource textResourceM21278l1112 = AbstractC8693b.m21278l(str3);
                TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                boolean z314 = !z19;
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v1) {
                    objM87133R2 = new C38492a(27);
                    c28655q5.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R2;
                if ((i26 & 234881024) == 67108864) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i37 & 896) == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z25;
                objM87133R3 = c28655q5.m87133R();
                if (z27) {
                    function8 = function7;
                    objM87133R3 = new C1017f0(z19, function8, 7);
                    c28655q5.m87172p0(objM87133R3);
                } else {
                    function8 = function7;
                    objM87133R3 = new C1017f0(z19, function8, 7);
                    c28655q5.m87172p0(objM87133R3);
                }
                AbstractC30792k.m94678l(layoutWeightElement8, textResourceM21278l1112, null, textResourceM21278l1111, c2886aM8432m16, null, null, null, textResourceM21267a8, false, false, null, 0L, false, 1, 0, 0, false, null, false, false, 0, z314, null, null, c33252iM105489e16, null, null, null, null, interfaceC4339a9, (Function1) objM87133R3, c28655q5, i51117 | 805306368 | i61119 | i611110 | i611111, 24576, 0, 6, 1035975908, 0);
                c28655q5 = c28655q5;
                c28655q5.m87173q(true);
                z28 = false;
                c28655q5.m87173q(false);
                f19 = f15;
                c2314t2 = c2314t;
            }
            AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3411h(f19, c2314t2));
            interfaceC25312uM118856e = biomarkerItemState.getInfoCallout();
            if (interfaceC25312uM118856e == null) {
                c28655q5.m87150e0(793262193);
                c28655q5.m87173q(z28);
                c28655q2 = c28655q5;
                i38 = 4;
            } else {
                c28655q5.m87150e0(793262194);
                AbstractC25303l.m74291r(interfaceC25312uM118856e, null, null, null, c28655q5, 0, 14);
                c28655q2 = c28655q5;
                i38 = 4;
                AbstractC25012a.m73388u(4, f14, c2314t2, c28655q2, z28);
            }
            if (biomarkerItemState.m118854c() != null) {
                if (d17 != null) {
                    d18 = d17;
                    if (!AbstractC22676k.m65742b(d18, biomarkerItemState.getValue())) {
                        z34 = z24;
                    }
                } else {
                    d18 = d17;
                }
                z34 = z28;
            } else {
                d18 = d17;
                if (z4) {
                }
                z34 = z28;
            }
            int i611113 = i38;
            Function1 function16 = function8;
            Double d219 = d18;
            c28655q3 = c28655q2;
            C27238a0 c27238a0M82077b8 = C27238a0.m82077b(saveButtonState, null, null, null, null, 0.0f, null, null, null, z34, false, 767, null);
            Modifier modifierM3599a16 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(f17, c2314t2), "modal_save_button");
            if ((i37 & 57344) == 16384) {
                z35 = z24;
            } else {
                z35 = false;
            }
            objM87133R4 = c28655q3.m87133R();
            if (z35) {
                interfaceC4339a = onSave;
                objM87133R4 = new C39272e(interfaceC4339a, 2);
                c28655q4 = c28655q3;
                c28655q4.m87172p0(objM87133R4);
            } else {
                interfaceC4339a = onSave;
                objM87133R4 = new C39272e(interfaceC4339a, 2);
                c28655q4 = c28655q3;
                c28655q4.m87172p0(objM87133R4);
            }
            AbstractC27292z.m82341h(c27238a0M82077b8, modifierM3599a16, null, (InterfaceC4339a) objM87133R4, c28655q4, C27238a0.f109008k | 48, 4);
            AbstractC31061c.m95650z(f16, i611113, c2314t2, c28655q4, z24);
            z16 = z19;
            c28655q = c28655q4;
            d14 = d219;
            str2 = str3;
            modifier3 = modifier12;
            function3 = function16;
            function4 = function6;
        } else {
            interfaceC4339a = onSave;
            c28655q5.m87138X();
            str2 = str;
            z16 = z14;
            d14 = d3;
            modifier3 = modifier2;
            c28655q = c28655q5;
            function3 = function1;
            function4 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23195w2(modifier3, biomarkerItemState, inputValue, str2, z4, z13, errorMessage, saveButtonState, z16, d14, onTextChanged, onNumberChanged, function3, function4, interfaceC4339a, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m125606J(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m125607K(double d3) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m125608L(Function1 function1, C37032c c37032c) {
        function1.invoke(Double.valueOf(c37032c.getValue()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m125609M() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m125610N() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m125611O(boolean z4, Function1 function1, String newUnit) {
        AbstractC22676k.m65750j(newUnit, "newUnit");
        if (z4) {
            function1.invoke(newUnit);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m125612P(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m125613Q(Modifier modifier, C37035f c37035f, String str, String str2, boolean z4, boolean z13, TextResource textResource, C27238a0 c27238a0, boolean z14, Double d3, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m125605I(modifier, c37035f, str, str2, z4, z13, textResource, c27238a0, z14, d3, function1, function2, function3, function4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private static final void m125614R(C37032c c37032c, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C37032c c37032c2;
        int i14;
        C28655q c28655q;
        long jM125379a1;
        long jM125368V0;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(729525708);
        if ((i13 & 6) == 0) {
            c37032c2 = c37032c;
            i14 = (c28655q2.m87153g(c37032c2) ? 4 : 2) | i13;
        } else {
            c37032c2 = c37032c;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 2;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(4 * f13);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            if (z4) {
                c28655q2.m87150e0(994546101);
                jM125379a1 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getNeutral15();
            } else {
                c28655q2.m87150e0(994547154);
                jM125379a1 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite5();
            }
            c28655q2.m87173q(false);
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, jM125379a1, c33252iM105489e);
            float f14 = z4 ? (float) 1.5d : 0;
            if (z4) {
                c28655q2.m87150e0(994553204);
                jM125368V0 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
            } else {
                c28655q2.m87150e0(994554231);
                jM125368V0 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getTransparent();
            }
            c28655q2.m87173q(false);
            float f15 = f13 * 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1110b.m3446c(AbstractC15751g.m44455h(modifierM3358c, f14, jM125368V0, c33252iM105489e), z4, null, interfaceC4339a, 14), f15, f15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM118843b = c37032c2.getValueText();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM118843b, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(c37032c2, z4, interfaceC4339a, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m125615S(C37032c c37032c, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m125614R(c37032c, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0166  */
    /* JADX WARN: Code duplicated, block: B:105:0x0183  */
    /* JADX WARN: Code duplicated, block: B:109:0x0200  */
    /* JADX WARN: Code duplicated, block: B:118:0x0290  */
    /* JADX WARN: Code duplicated, block: B:121:0x029a  */
    /* JADX WARN: Code duplicated, block: B:127:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:129:0x0313  */
    /* JADX WARN: Code duplicated, block: B:132:0x031e  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x015f  */
    /* JADX INFO: renamed from: r */
    public static final void m125633r(Modifier modifier, final C37035f biomarkerItemState, final C27238a0 saveButtonState, final AbstractC35664f modalBottomSheetState, boolean z4, InterfaceC4339a onDismiss, final InterfaceC4351m onSave, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v0;
        Object obj;
        final InterfaceC2994c0 interfaceC2994c0;
        boolean zM87153g;
        Double dM118863l;
        String strM60892c;
        Object obj2;
        final InterfaceC28601c1 interfaceC28601c1;
        boolean zM87153g2;
        Object obj3;
        final InterfaceC28601c1 interfaceC28601c2;
        boolean zM87153g3;
        Object obj4;
        boolean zM87153g4;
        Object obj5;
        String strM92103Y;
        String strM92102X;
        boolean zM87153g5;
        Object obj6;
        boolean z17;
        boolean z18;
        Object obj7;
        int i16;
        int i17;
        AbstractC22676k.m65750j(biomarkerItemState, "biomarkerItemState");
        AbstractC22676k.m65750j(saveButtonState, "saveButtonState");
        AbstractC22676k.m65750j(modalBottomSheetState, "modalBottomSheetState");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(onSave, "onSave");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1347715311);
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
            i15 |= c28655q.m87157i(biomarkerItemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(saveButtonState) : c28655q.m87157i(saveButtonState) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q.m87153g(modalBottomSheetState) : c28655q.m87157i(modalBottomSheetState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(onDismiss)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(onSave)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i15 |= i16;
            }
            if ((599187 & i15) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    InterfaceC2994c0 interfaceC2994c0M87262p = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(interfaceC2994c0M87262p);
                    obj = interfaceC2994c0M87262p;
                }
                interfaceC2994c0 = (InterfaceC2994c0) obj;
                zM87153g = c28655q.m87153g(biomarkerItemState.getValue());
                Object objM87133R2 = c28655q.m87133R();
                obj2 = objM87133R2;
                if (zM87153g || objM87133R2 == c28676v0) {
                    dM118863l = biomarkerItemState.getValue();
                    if (dM118863l != null || (strM60892c = AbstractC21639b.m60892c(dM118863l.doubleValue())) == null) {
                        strM60892c = "";
                    }
                    C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(strM60892c);
                    c28655q.m87172p0(c28633k1M87272z);
                    obj2 = c28633k1M87272z;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj2;
                zM87153g2 = c28655q.m87153g(biomarkerItemState.getValue());
                Object objM87133R3 = c28655q.m87133R();
                obj3 = objM87133R3;
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(biomarkerItemState.getValue());
                    c28655q.m87172p0(c28633k1M87272z2);
                    obj3 = c28633k1M87272z2;
                }
                interfaceC28601c2 = (InterfaceC28601c1) obj3;
                zM87153g3 = c28655q.m87153g(biomarkerItemState.getUnit());
                Object objM87133R4 = c28655q.m87133R();
                obj4 = objM87133R4;
                if (zM87153g3 || objM87133R4 == c28676v0) {
                    String strM118861j = biomarkerItemState.getUnit();
                    C28633k1 c28633k1M87272z3 = AbstractC28683x.m87272z(strM118861j != null ? strM118861j : "");
                    c28655q.m87172p0(c28633k1M87272z3);
                    obj4 = c28633k1M87272z3;
                }
                final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) obj4;
                zM87153g4 = c28655q.m87153g(biomarkerItemState.getValue());
                Object objM87133R5 = c28655q.m87133R();
                obj5 = objM87133R5;
                if (zM87153g4 || objM87133R5 == c28676v0) {
                    C28633k1 c28633k1M87272z4 = AbstractC28683x.m87272z(biomarkerItemState.getValue());
                    c28655q.m87172p0(c28633k1M87272z4);
                    obj5 = c28633k1M87272z4;
                }
                final InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) obj5;
                final NumberFormat numberInstance = NumberFormat.getNumberInstance();
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99434c);
                strM92102X = AbstractC30060g.m92102X(AbstractC25370d.f99437f, new Object[]{String.valueOf(biomarkerItemState.getMinValue()), String.valueOf(biomarkerItemState.getMaxValue())}, c28655q);
                final boolean z19 = z16;
                zM87153g5 = c28655q.m87153g(m125634s(interfaceC28601c1)) | c28655q.m87153g(m125601E(interfaceC28601c2)) | c28655q.m87145c(biomarkerItemState.getMinValue()) | c28655q.m87145c(biomarkerItemState.getMaxValue()) | c28655q.m87153g(biomarkerItemState.getValue()) | c28655q.m87155h(biomarkerItemState.getIncluded()) | c28655q.m87153g(strM92102X);
                Object objM87133R6 = c28655q.m87133R();
                obj6 = objM87133R6;
                if (zM87153g5 || objM87133R6 == c28676v0) {
                    C37030a c37030aM118841b = C37031b.f158424a.m118841b(m125634s(interfaceC28601c1), m125601E(interfaceC28601c2), biomarkerItemState.getMinValue(), biomarkerItemState.getMaxValue(), biomarkerItemState.getValue(), biomarkerItemState.getIncluded(), strM92103Y, strM92102X);
                    c28655q.m87172p0(c37030aM118841b);
                    obj6 = c37030aM118841b;
                }
                final C37030a c37030a = (C37030a) obj6;
                Modifier modifierM3599a = AbstractC1136a.m3599a(modifier4, "modal_title");
                C35666g c35666g = new C35666g(AbstractC11478a.m30853e(Locale.ROOT, biomarkerItemState.getBiomarkerName(), "toUpperCase(...)"), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, false ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t)))));
                boolean zM87157i = c28655q.m87157i(interfaceC2994c0);
                if ((i15 & 7168) != 2048 || ((i15 & 4096) != 0 && c28655q.m87157i(modalBottomSheetState))) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i | z17 | ((458752 & i15) == 131072);
                Object objM87133R7 = c28655q.m87133R();
                if (!z18 || objM87133R7 == c28676v0) {
                    C39380c c39380c = new C39380c(interfaceC2994c0, onDismiss, modalBottomSheetState, 0);
                    c28655q.m87172p0(c39380c);
                    obj7 = c39380c;
                } else {
                    obj7 = objM87133R7;
                }
                AbstractC35660d.m112871m(modifierM3599a, c35666g, modalBottomSheetState, null, (InterfaceC4339a) obj7, null, null, AbstractC37817c.m121344e(146715933, c28655q, new Function3() { // from class: yb0.d
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                        int iIntValue = ((Integer) obj10).intValue();
                        return AbstractC39384g.m125638w(biomarkerItemState, c37030a, saveButtonState, z19, interfaceC28601c1, numberInstance, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, onSave, interfaceC2994c0, modalBottomSheetState, (InterfaceC23013y) obj8, (Composer) obj9, iIntValue);
                    }
                }), false, null, null, null, false, modifierM66720i, C39378a.f169434a.m125591b(), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.f151586a << 6) | ((i15 >> 3) & 896), 24576, 8040);
                modifier3 = modifier4;
                z15 = z19;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(modifier3, biomarkerItemState, saveButtonState, modalBottomSheetState, z15, onDismiss, onSave, i13, i14, 13);
            }
        }
        i15 |= 24576;
        z13 = z4;
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(onDismiss)) {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i17;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(onSave)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i15 |= i16;
        }
        if ((599187 & i15) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i19 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            obj = objM87133R;
            if (objM87133R == c28676v0) {
                InterfaceC2994c0 interfaceC2994c0M87262p2 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(interfaceC2994c0M87262p2);
                obj = interfaceC2994c0M87262p2;
            }
            interfaceC2994c0 = (InterfaceC2994c0) obj;
            zM87153g = c28655q.m87153g(biomarkerItemState.getValue());
            Object objM87133R8 = c28655q.m87133R();
            obj2 = objM87133R8;
            if (zM87153g) {
                dM118863l = biomarkerItemState.getValue();
                if (dM118863l != null) {
                    strM60892c = "";
                } else {
                    strM60892c = "";
                }
                C28633k1 c28633k1M87272z5 = AbstractC28683x.m87272z(strM60892c);
                c28655q.m87172p0(c28633k1M87272z5);
                obj2 = c28633k1M87272z5;
            } else {
                dM118863l = biomarkerItemState.getValue();
                if (dM118863l != null) {
                    strM60892c = "";
                } else {
                    strM60892c = "";
                }
                C28633k1 c28633k1M87272z6 = AbstractC28683x.m87272z(strM60892c);
                c28655q.m87172p0(c28633k1M87272z6);
                obj2 = c28633k1M87272z6;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj2;
            zM87153g2 = c28655q.m87153g(biomarkerItemState.getValue());
            Object objM87133R9 = c28655q.m87133R();
            obj3 = objM87133R9;
            if (zM87153g2) {
                C28633k1 c28633k1M87272z7 = AbstractC28683x.m87272z(biomarkerItemState.getValue());
                c28655q.m87172p0(c28633k1M87272z7);
                obj3 = c28633k1M87272z7;
            } else {
                C28633k1 c28633k1M87272z8 = AbstractC28683x.m87272z(biomarkerItemState.getValue());
                c28655q.m87172p0(c28633k1M87272z8);
                obj3 = c28633k1M87272z8;
            }
            interfaceC28601c2 = (InterfaceC28601c1) obj3;
            zM87153g3 = c28655q.m87153g(biomarkerItemState.getUnit());
            Object objM87133R10 = c28655q.m87133R();
            obj4 = objM87133R10;
            if (zM87153g3) {
                String strM118861j2 = biomarkerItemState.getUnit();
                C28633k1 c28633k1M87272z9 = AbstractC28683x.m87272z(strM118861j2 != null ? strM118861j2 : "");
                c28655q.m87172p0(c28633k1M87272z9);
                obj4 = c28633k1M87272z9;
            } else {
                String strM118861j3 = biomarkerItemState.getUnit();
                C28633k1 c28633k1M87272z10 = AbstractC28683x.m87272z(strM118861j3 != null ? strM118861j3 : "");
                c28655q.m87172p0(c28633k1M87272z10);
                obj4 = c28633k1M87272z10;
            }
            final InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) obj4;
            zM87153g4 = c28655q.m87153g(biomarkerItemState.getValue());
            Object objM87133R11 = c28655q.m87133R();
            obj5 = objM87133R11;
            if (zM87153g4) {
                C28633k1 c28633k1M87272z11 = AbstractC28683x.m87272z(biomarkerItemState.getValue());
                c28655q.m87172p0(c28633k1M87272z11);
                obj5 = c28633k1M87272z11;
            } else {
                C28633k1 c28633k1M87272z12 = AbstractC28683x.m87272z(biomarkerItemState.getValue());
                c28655q.m87172p0(c28633k1M87272z12);
                obj5 = c28633k1M87272z12;
            }
            final InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) obj5;
            final NumberFormat numberInstance2 = NumberFormat.getNumberInstance();
            strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99434c);
            strM92102X = AbstractC30060g.m92102X(AbstractC25370d.f99437f, new Object[]{String.valueOf(biomarkerItemState.getMinValue()), String.valueOf(biomarkerItemState.getMaxValue())}, c28655q);
            final boolean z110 = z16;
            zM87153g5 = c28655q.m87153g(m125634s(interfaceC28601c1)) | c28655q.m87153g(m125601E(interfaceC28601c2)) | c28655q.m87145c(biomarkerItemState.getMinValue()) | c28655q.m87145c(biomarkerItemState.getMaxValue()) | c28655q.m87153g(biomarkerItemState.getValue()) | c28655q.m87155h(biomarkerItemState.getIncluded()) | c28655q.m87153g(strM92102X);
            Object objM87133R12 = c28655q.m87133R();
            obj6 = objM87133R12;
            if (zM87153g5) {
                C37030a c37030aM118841b2 = C37031b.f158424a.m118841b(m125634s(interfaceC28601c1), m125601E(interfaceC28601c2), biomarkerItemState.getMinValue(), biomarkerItemState.getMaxValue(), biomarkerItemState.getValue(), biomarkerItemState.getIncluded(), strM92103Y, strM92102X);
                c28655q.m87172p0(c37030aM118841b2);
                obj6 = c37030aM118841b2;
            } else {
                C37030a c37030aM118841b3 = C37031b.f158424a.m118841b(m125634s(interfaceC28601c1), m125601E(interfaceC28601c2), biomarkerItemState.getMinValue(), biomarkerItemState.getMaxValue(), biomarkerItemState.getValue(), biomarkerItemState.getIncluded(), strM92103Y, strM92102X);
                c28655q.m87172p0(c37030aM118841b3);
                obj6 = c37030aM118841b3;
            }
            final C37030a c37030a2 = (C37030a) obj6;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifier4, "modal_title");
            C35666g c35666g2 = new C35666g(AbstractC11478a.m30853e(Locale.ROOT, biomarkerItemState.getBiomarkerName(), "toUpperCase(...)"), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, false ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
            Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t)))));
            boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0);
            if ((i15 & 7168) != 2048) {
                z17 = true;
            } else {
                z17 = true;
            }
            z18 = zM87157i2 | z17 | ((458752 & i15) == 131072);
            Object objM87133R13 = c28655q.m87133R();
            if (z18) {
                C39380c c39380c2 = new C39380c(interfaceC2994c0, onDismiss, modalBottomSheetState, 0);
                c28655q.m87172p0(c39380c2);
                obj7 = c39380c2;
            } else {
                C39380c c39380c3 = new C39380c(interfaceC2994c0, onDismiss, modalBottomSheetState, 0);
                c28655q.m87172p0(c39380c3);
                obj7 = c39380c3;
            }
            AbstractC35660d.m112871m(modifierM3599a2, c35666g2, modalBottomSheetState, null, (InterfaceC4339a) obj7, null, null, AbstractC37817c.m121344e(146715933, c28655q, new Function3() { // from class: yb0.d
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj8, Object obj9, Object obj10) {
                    int iIntValue = ((Integer) obj10).intValue();
                    return AbstractC39384g.m125638w(biomarkerItemState, c37030a2, saveButtonState, z110, interfaceC28601c1, numberInstance2, interfaceC28601c2, interfaceC28601c5, interfaceC28601c6, onSave, interfaceC2994c0, modalBottomSheetState, (InterfaceC23013y) obj8, (Composer) obj9, iIntValue);
                }
            }), false, null, null, null, false, modifierM66720i2, C39378a.f169434a.m125591b(), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.f151586a << 6) | ((i15 >> 3) & 896), 24576, 8040);
            modifier3 = modifier4;
            z15 = z110;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(modifier3, biomarkerItemState, saveButtonState, modalBottomSheetState, z15, onDismiss, onSave, i13, i14, 13);
        }
    }

    /* JADX INFO: renamed from: s */
    private static final String m125634s(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: t */
    private static final Double m125635t(InterfaceC28601c1 interfaceC28601c1) {
        return (Double) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: u */
    private static final void m125636u(InterfaceC28601c1 interfaceC28601c1, Double d3) {
        interfaceC28601c1.setValue(d3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m125637v(InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, AbstractC35664f abstractC35664f) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(abstractC35664f, null), 3);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m125638w(C37035f c37035f, C37030a c37030a, C27238a0 c27238a0, boolean z4, InterfaceC28601c1 interfaceC28601c1, NumberFormat numberFormat, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC4351m interfaceC4351m, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f abstractC35664f, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String strM125634s = m125634s(interfaceC28601c1);
            String strM125603G = m125603G(interfaceC28601c3);
            boolean zM118839c = c37030a.getIsValid();
            boolean zM118838b = c37030a.getHasValueChanged();
            TextResource textResourceM118837a = c37030a.getErrorMessage();
            Double dM125635t = m125635t(interfaceC28601c4);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(numberFormat) | c28655q.m87153g(interfaceC28601c2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C37082e1(numberFormat, interfaceC28601c1, interfaceC28601c2, 13);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C39211b(15);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c3);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C39382e(0, interfaceC28601c3);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function3 = (Function1) objM87133R3;
            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c4);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C39382e(1, interfaceC28601c4);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function4 = (Function1) objM87133R4;
            boolean zM87157i = c28655q.m87157i(c37035f) | c28655q.m87153g(interfaceC28601c4) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC4351m) | c28655q.m87153g(interfaceC28601c3) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(abstractC35664f);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new C9786j(c37035f, interfaceC4351m, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, interfaceC28601c3, abstractC35664f);
                c28655q.m87172p0(objM87133R5);
            }
            m125605I(null, c37035f, strM125634s, strM125603G, zM118839c, zM118838b, textResourceM118837a, c27238a0, z4, dM125635t, function1, function2, function3, function4, (InterfaceC4339a) objM87133R5, c28655q, (TextResource.$stable << 18) | (C27238a0.f109008k << 21), 48, 1);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m125639x(NumberFormat numberFormat, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, String newText) {
        AbstractC22676k.m65750j(newText, "newText");
        m125600D(interfaceC28601c1, newText);
        AbstractC22676k.m65747g(numberFormat);
        Number numberM60891b = AbstractC21639b.m60891b(numberFormat, newText);
        m125602F(interfaceC28601c2, numberM60891b != null ? Double.valueOf(numberM60891b.doubleValue()) : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m125640y(Double d3) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m125641z(InterfaceC28601c1 interfaceC28601c1, String newUnit) {
        AbstractC22676k.m65750j(newUnit, "newUnit");
        m125604H(interfaceC28601c1, newUnit);
        return C23454a0.f92919a;
    }
}
