package yb0;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2561k6;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bv2.C3675b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import fg2.C14463e;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import id2.C18416a;
import j11.AbstractC21211n;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd0.InterfaceC22381a;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import ny0.C27238a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p097ds.AbstractC12313p;
import p163g1.AbstractC15005f3;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p571w3.C36775k;
import p579wc.C37082e1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p702ch0.C4660x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p72.C28958a;
import pf.AbstractC29125c;
import pj2.C29308g;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import re1.C31324k;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uz1.C35429g;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import v90.C35813e;
import vb0.AbstractC35866a;
import vl0.C36100c;
import vu1.AbstractC36512c;
import vv2.C36537c;
import vv2.C36538d;
import w01.C36681f;
import w71.C36891k;
import wb0.AbstractC37036g;
import wb0.AbstractC37038i;
import wb0.C37032c;
import wb0.C37033d;
import wb0.C37034e;
import wb0.C37035f;
import wb0.C37039j;
import wb3.AbstractC37056f;
import wo1.C37450h;
import wr0.C37526f;
import x30.C37900j1;
import x81.C38072d;
import xo1.C38492a;
import y00.AbstractC38963t7;
import y41.C39211b;
import y71.C39272e;
import y71.C39274g;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: yb0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u001ac\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000e2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a=\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a=\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b \u0010!\u001a%\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0001¢\u0006\u0004\b%\u0010&\u001aY\u0010,\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b,\u0010-\u001a1\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b0\u00101\u001a5\u00104\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b4\u00105\u001aG\u0010;\u001a\u00020\u00062\u0006\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020.2\u0006\u00108\u001a\u00020.2\u0006\u0010:\u001a\u0002092\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b;\u0010<\u001a)\u0010=\u001a\u00020\u00062\u0006\u00107\u001a\u00020.2\u0006\u00108\u001a\u00020.2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b=\u0010>¨\u0006E²\u0006\u000e\u0010?\u001a\u00020.8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010@\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010A\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010B\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010C\u001a\u0004\u0018\u00010'8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010D\u001a\u0004\u0018\u00010'8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lwb0/i;", "viewState", "", "isAiConfirmation", "Lkotlin/Function1;", "Lkd0/a$c;", "Ll83/a0;", "onAnalyticsEvent", "Lvb0/a;", "onNavigationEvent", "Lwb0/g;", "onViewEvent", "e1", "(Lwb0/i;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lwb0/i$d;", "p0", "(Lwb0/i$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lwb0/e;", "dialogState", "Lkotlin/Function0;", "onConfirmExit", "onDismiss", "c1", "(Lwb0/e;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "onConfirmDelete", "Landroidx/compose/ui/Modifier;", "modifier", "Y0", "(Lwb0/e;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lwb0/d;", "warningState", "onConfirm", "a1", "(Lwb0/d;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lwb0/j;", "modalState", "onClick", "o1", "(Lwb0/j;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lwb0/f;", "biomarkerItem", "onToggleBiomarker", "onEditBiomarker", "onRightIconClick", "h0", "(Lwb0/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "displayValue", "X", "(Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "checked", "onCheckedChange", "l1", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "biomarkerName", "educationTitle", "description", "Lv41/f;", "modalBottomSheetState", "b0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/f;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "f0", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "searchQuery", "showExitDialog", "showDeleteDialog", "showDependencyWarningDialog", "editingBiomarker", "educationBiomarker", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39388k {

    /* JADX INFO: renamed from: yb0.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersScreenKt$CalculationEducationBottomSheet$1$1$1", m100430f = "EditBiomarkersScreen.kt", m100431l = {852, 853}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169467w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f f169468x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC35664f abstractC35664f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169468x = abstractC35664f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f169468x, interfaceC30057d);
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
                int r1 = r4.f169467w
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
                v41.f r5 = r4.f169468x
                boolean r1 = r5 instanceof v41.AbstractC35664f.a
                if (r1 == 0) goto L31
                v41.f$a r5 = (v41.AbstractC35664f.a) r5
                g1.y3 r5 = r5.getModalBottomSheetState()
                r4.f169467w = r3
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L44
                goto L43
            L31:
                boolean r1 = r5 instanceof v41.AbstractC35664f.b
                if (r1 == 0) goto L47
                v41.f$b r5 = (v41.AbstractC35664f.b) r5
                g1.s0 r5 = r5.getBottomDrawerState()
                r4.f169467w = r2
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
            throw new UnsupportedOperationException("Method not decompiled: yb0.AbstractC39388k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yb0.k$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersScreenKt$EditBiomarkersContent$3$1", m100430f = "EditBiomarkersScreen.kt", m100431l = {222, 224}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169469w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f169470x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f169471y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169470x = c15199y3;
            this.f169471y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f169470x, this.f169471y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r5.m43225f(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r5.m43223d(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
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
                int r1 = r4.f169469w
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
                goto L3a
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                p1.c1 r5 = r4.f169471y
                wb0.f r5 = yb0.AbstractC39388k.m125747r1(r5)
                if (r5 == 0) goto L2f
                g1.y3 r5 = r4.f169470x
                r4.f169469w = r3
                java.lang.Object r5 = r5.m43225f(r4)
                if (r5 != r0) goto L3a
                goto L39
            L2f:
                g1.y3 r5 = r4.f169470x
                r4.f169469w = r2
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L3a
            L39:
                return r0
            L3a:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yb0.AbstractC39388k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yb0.k$c */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersScreenKt$EditBiomarkersContent$4$1", m100430f = "EditBiomarkersScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169472w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f169473x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f169474y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169473x = c15199y3;
            this.f169474y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f169473x, this.f169474y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f169472w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f169473x.m43221b() == EnumC15209z3.f57106w) {
                AbstractC39388k.m125760w0(this.f169474y, null);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yb0.k$d */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersScreenKt$EditBiomarkersContent$5$1", m100430f = "EditBiomarkersScreen.kt", m100431l = {236, 238}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169475w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f169476x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f169477y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169476x = c15199y3;
            this.f169477y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f169476x, this.f169477y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r5.m43225f(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r5.m43223d(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
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
                int r1 = r4.f169475w
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
                goto L3a
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                p1.c1 r5 = r4.f169477y
                wb0.f r5 = yb0.AbstractC39388k.m125753t1(r5)
                if (r5 == 0) goto L2f
                g1.y3 r5 = r4.f169476x
                r4.f169475w = r3
                java.lang.Object r5 = r5.m43225f(r4)
                if (r5 != r0) goto L3a
                goto L39
            L2f:
                g1.y3 r5 = r4.f169476x
                r4.f169475w = r2
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L3a
            L39:
                return r0
            L3a:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yb0.AbstractC39388k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yb0.k$e */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersScreenKt$EditBiomarkersContent$6$1", m100430f = "EditBiomarkersScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169478w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f169479x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f169480y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169479x = c15199y3;
            this.f169480y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f169479x, this.f169480y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f169478w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f169479x.m43221b() == EnumC15209z3.f57106w) {
                AbstractC39388k.m125764y0(this.f169480y, null);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yb0.k$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(((C37035f) t14).getBiomarkerName(), ((C37035f) t15).getBiomarkerName());
        }
    }

    /* JADX INFO: renamed from: yb0.k$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(((C37035f) t14).getBiomarkerName(), ((C37035f) t15).getBiomarkerName());
        }
    }

    /* JADX INFO: renamed from: yb0.k$h */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersScreenKt$EditBiomarkersScreen$6$1", m100430f = "EditBiomarkersScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f169481E;

        /* JADX INFO: renamed from: w */
        int f169482w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f169483x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC37038i f169484y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f169485z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z4, AbstractC37038i abstractC37038i, Function1 function1, Function1 function2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169483x = z4;
            this.f169484y = abstractC37038i;
            this.f169485z = function1;
            this.f169481E = function2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f169483x, this.f169484y, this.f169485z, this.f169481E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f169482w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f169483x) {
                ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(((AbstractC37038i.e) this.f169484y).m118897c(), ((AbstractC37038i.e) this.f169484y).m118898d()), ((AbstractC37038i.e) this.f169484y).m118896b());
                this.f169485z.invoke(new InterfaceC22381a.d1(String.valueOf(arrayListM74129g1.size()), AbstractC25265s.m74110N0(arrayListM74129g1, ", ", null, null, null, 62)));
            } else {
                if (!((AbstractC37038i.e) this.f169484y).m118897c().isEmpty()) {
                    this.f169485z.invoke(new InterfaceC22381a.k(String.valueOf(((AbstractC37038i.e) this.f169484y).m118897c().size()), AbstractC25265s.m74110N0(((AbstractC37038i.e) this.f169484y).m118897c(), ", ", null, null, null, 62)));
                }
                if (!((AbstractC37038i.e) this.f169484y).m118898d().isEmpty()) {
                    this.f169485z.invoke(new InterfaceC22381a.n(String.valueOf(((AbstractC37038i.e) this.f169484y).m118898d().size()), AbstractC25265s.m74110N0(((AbstractC37038i.e) this.f169484y).m118898d(), ", ", null, null, null, 62)));
                }
                if (!((AbstractC37038i.e) this.f169484y).m118896b().isEmpty()) {
                    this.f169485z.invoke(new InterfaceC22381a.m(String.valueOf(((AbstractC37038i.e) this.f169484y).m118896b().size()), AbstractC25265s.m74110N0(((AbstractC37038i.e) this.f169484y).m118896b(), ", ", null, null, null, 62)));
                }
            }
            if (((AbstractC37038i.e) this.f169484y).getDestination() != null) {
                this.f169481E.invoke(new AbstractC35866a.c(((AbstractC37038i.e) this.f169484y).getDestination()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yb0.k$i */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersScreenKt$EditBiomarkersScreen$8$1", m100430f = "EditBiomarkersScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169486w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f169487x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function1 function1, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169487x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f169487x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f169486w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f169487x.invoke(AbstractC35866a.b.f152696a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m125643A0(InterfaceC28601c1 interfaceC28601c1) {
        m125687W0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B0 */
    private static final String m125645B0(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m125647C0(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m125749s0(interfaceC28601c1, false);
        function1.invoke(AbstractC37036g.a.f158455a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m125649D0(InterfaceC28601c1 interfaceC28601c1) {
        m125749s0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m125651E0(Function1 function1, AbstractC37038i.d dVar, InterfaceC28601c1 interfaceC28601c1) {
        m125755u0(interfaceC28601c1, false);
        function1.invoke(new AbstractC37036g.e(dVar.m118888i()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m125653F0(InterfaceC28601c1 interfaceC28601c1) {
        m125755u0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final Modifier m125655G0(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        float f13 = 4;
        return AbstractC12313p.m34301s(f13 * f13, applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m125657H0(InterfaceC28601c1 interfaceC28601c1) {
        m125687W0(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m125659I0(InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.a) {
            m125683U0(interfaceC28601c1, "");
        } else if (event instanceof AbstractC17801x0.c) {
            m125683U0(interfaceC28601c1, ((AbstractC17801x0.c) event).getNewText());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m125661J0(Function1 function1, C37035f toggledItem) {
        AbstractC22676k.m65750j(toggledItem, "toggledItem");
        if (toggledItem.getIncluded()) {
            function1.invoke(new AbstractC37036g.b(toggledItem.getBiomarkerId()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m125663K0(InterfaceC28601c1 interfaceC28601c1, C37035f biomarker) {
        AbstractC22676k.m65750j(biomarker, "biomarker");
        if (biomarker.getValueText() == null || biomarker.m118854c() != null) {
            m125760w0(interfaceC28601c1, biomarker);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m125665L0(InterfaceC28601c1 interfaceC28601c1, C37035f biomarker) {
        AbstractC22676k.m65750j(biomarker, "biomarker");
        m125764y0(interfaceC28601c1, biomarker);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m125667M0(C37035f c37035f, Function1 function1, InterfaceC28601c1 interfaceC28601c1, C37035f toggledItem) {
        AbstractC22676k.m65750j(toggledItem, "toggledItem");
        if (!toggledItem.getIncluded()) {
            if (c37035f.getValueText() == null) {
                m125760w0(interfaceC28601c1, toggledItem);
            } else {
                function1.invoke(new AbstractC37036g.c(toggledItem.getBiomarkerId()));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C23454a0 m125669N0(InterfaceC28601c1 interfaceC28601c1, C37035f biomarker) {
        AbstractC22676k.m65750j(biomarker, "biomarker");
        m125764y0(interfaceC28601c1, biomarker);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C23454a0 m125671O0(boolean z4, AbstractC37038i.d dVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        if (z4) {
            m125749s0(interfaceC28601c1, true);
        } else if (dVar.getPendingDependencyWarning() != null) {
            m125755u0(interfaceC28601c2, true);
        } else {
            function1.invoke(new AbstractC37036g.e(dVar.m118888i()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C23454a0 m125673P0(InterfaceC28601c1 interfaceC28601c1) {
        m125760w0(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C23454a0 m125675Q0(Function1 function1, C37035f c37035f, InterfaceC28601c1 interfaceC28601c1, Double d3, String str) {
        function1.invoke(new AbstractC37036g.f(c37035f.getBiomarkerId(), d3, str));
        m125760w0(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C23454a0 m125677R0(InterfaceC28601c1 interfaceC28601c1) {
        m125764y0(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m125679S0(Function1 function1) {
        function1.invoke(AbstractC35866a.a.f152695a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C23454a0 m125681T0(AbstractC37038i.d dVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m125740p0(dVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U0 */
    private static final void m125683U0(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: V0 */
    private static final boolean m125685V0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: W0 */
    private static final void m125687W0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x0175  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: X */
    private static final void m125688X(String str, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        String str2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        Modifier modifier2;
        int i17;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Modifier modifier4;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1881142198);
        if ((i13 & 6) == 0) {
            str2 = str;
            i15 = (c28655q2.m87153g(str2) ? 4 : 2) | i13;
        } else {
            str2 = str;
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    modifier2 = modifier;
                    if (c28655q2.m87153g(modifier2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C38492a(28);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i16 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    C38072d c38072d = C38072d.f163053a;
                    int i19 = C38072d.f163054b;
                    float f13 = 2;
                    Modifier modifierM95629e = AbstractC31061c.m95629e(modifier4, f13, 4, c38072d.m121949b(c28655q2, i19).getWhite10());
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C39272e(interfaceC4339a4, 4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM95629e, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    float f14 = 8;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3362g, f13 * f14, 1 * f14);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getN8(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196602);
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a4;
                    modifier3 = modifier4;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14463e(str, interfaceC4339a3, modifier3, i13, i14);
                }
            }
            i15 |= 384;
            modifier2 = modifier;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C38492a(28);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                C38072d c38072d2 = C38072d.f163053a;
                int i110 = C38072d.f163054b;
                float f15 = 2;
                Modifier modifierM95629e2 = AbstractC31061c.m95629e(modifier4, f15, 4, c38072d2.m121949b(c28655q2, i110).getWhite10());
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C39272e(interfaceC4339a4, 4);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C39272e(interfaceC4339a4, 4);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM95629e2, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f16 = 8;
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM3362g2, f15 * f16, 1 * f16);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                c28655q = c28655q2;
                AbstractC30795n.m94707h(str2, null, c38072d2.m121949b(c28655q2, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i110).getN8(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196602);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
                modifier3 = modifier4;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14463e(str, interfaceC4339a3, modifier3, i13, i14);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                if (c28655q2.m87153g(modifier2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C38492a(28);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                C38072d c38072d3 = C38072d.f163053a;
                int i111 = C38072d.f163054b;
                float f17 = 2;
                Modifier modifierM95629e3 = AbstractC31061c.m95629e(modifier4, f17, 4, c38072d3.m121949b(c28655q2, i111).getWhite10());
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C39272e(interfaceC4339a4, 4);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C39272e(interfaceC4339a4, 4);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM95629e3, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f18 = 8;
                Modifier modifierM3395q3 = AbstractC1099a.m3395q(modifierM3362g3, f17 * f18, 1 * f18);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3395q3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                c28655q = c28655q2;
                AbstractC30795n.m94707h(str2, null, c38072d3.m121949b(c28655q2, i111).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i111).getN8(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196602);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
                modifier3 = modifier4;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14463e(str, interfaceC4339a3, modifier3, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C38492a(28);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            C38072d c38072d4 = C38072d.f163053a;
            int i112 = C38072d.f163054b;
            float f19 = 2;
            Modifier modifierM95629e4 = AbstractC31061c.m95629e(modifier4, f19, 4, c38072d4.m121949b(c28655q2, i112).getWhite10());
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C39272e(interfaceC4339a4, 4);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C39272e(interfaceC4339a4, 4);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM95629e4, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f110 = 8;
            Modifier modifierM3395q4 = AbstractC1099a.m3395q(modifierM3362g4, f19 * f110, 1 * f110);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3395q4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str2, null, c38072d4.m121949b(c28655q2, i112).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i112).getN8(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
            modifier3 = modifier4;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
            interfaceC4339a3 = interfaceC4339a2;
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14463e(str, interfaceC4339a3, modifier3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: X0 */
    private static final boolean m125689X0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m125690Y() {
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:57:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0186  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Y0 */
    public static final void m125691Y0(C37034e dialogState, InterfaceC4339a onConfirmDelete, InterfaceC4339a onDismiss, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(dialogState, "dialogState");
        AbstractC22676k.m65750j(onConfirmDelete, "onConfirmDelete");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1152487023);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(dialogState) : c28655q2.m87157i(dialogState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onConfirmDelete) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onDismiss) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(modifier4, "delete_dialog");
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(dialogState.getTitle());
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(dialogState.getDescription());
                TextResource text = dialogState.getButton().getText();
                TextResource text2 = dialogState.getSecondaryButton().getText();
                int i17 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM21278l, textResourceM21278l2, text, false, null, null, null, null, text2, null, false, false, null, null, false, 0, null, null, null, false, null, onDismiss, onDismiss, onConfirmDelete, null, null, null, c28655q2, (i17 << 3) | (i17 << 6) | (i17 << 9) | (i17 << 27), 384, (i15 & 896) | ((i15 << 3) & 7168) | ((i15 << 9) & 57344), 239070705);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(dialogState, onConfirmDelete, onDismiss, modifier3, i13, i14, 14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifier4, "delete_dialog");
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3599a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(dialogState.getTitle());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(dialogState.getDescription());
            TextResource text3 = dialogState.getButton().getText();
            TextResource text4 = dialogState.getSecondaryButton().getText();
            int i18 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM21278l3, textResourceM21278l4, text3, false, null, null, null, null, text4, null, false, false, null, null, false, 0, null, null, null, false, null, onDismiss, onDismiss, onConfirmDelete, null, null, null, c28655q2, (i18 << 3) | (i18 << 6) | (i18 << 9) | (i18 << 27), 384, (i15 & 896) | ((i15 << 3) & 7168) | ((i15 << 9) & 57344), 239070705);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(dialogState, onConfirmDelete, onDismiss, modifier3, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m125692Z(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C23454a0 m125693Z0(C37034e c37034e, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m125691Y0(c37034e, interfaceC4339a, interfaceC4339a2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m125695a0(String str, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m125688X(str, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:60:0x017e  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a1 */
    public static final void m125696a1(C37033d warningState, InterfaceC4339a onConfirm, InterfaceC4339a onDismiss, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(warningState, "warningState");
        AbstractC22676k.m65750j(onConfirm, "onConfirm");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(998410054);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(warningState) : c28655q2.m87157i(warningState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onConfirm) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onDismiss) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(modifier4, "dependency_warning_dialog");
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(warningState.getTitle());
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(warningState.getMessage());
                TextResource textResourceM118845b = warningState.getPrimaryButtonText();
                TextResource textResourceM118846c = warningState.getSecondaryButtonText();
                int i17 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM21278l, textResourceM21278l2, textResourceM118845b, false, null, null, null, null, textResourceM118846c, null, false, false, null, null, false, 0, null, null, null, false, null, onDismiss, onDismiss, onConfirm, null, null, null, c28655q2, (i17 << 3) | (i17 << 6) | (i17 << 9) | (i17 << 27), 384, (i15 & 896) | ((i15 << 3) & 7168) | ((i15 << 9) & 57344), 239070705);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(warningState, onConfirm, onDismiss, modifier3, i13, i14, 13);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifier4, "dependency_warning_dialog");
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3599a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(warningState.getTitle());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(warningState.getMessage());
            TextResource textResourceM118845b2 = warningState.getPrimaryButtonText();
            TextResource textResourceM118846c2 = warningState.getSecondaryButtonText();
            int i18 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM21278l3, textResourceM21278l4, textResourceM118845b2, false, null, null, null, null, textResourceM118846c2, null, false, false, null, null, false, 0, null, null, null, false, null, onDismiss, onDismiss, onConfirm, null, null, null, c28655q2, (i18 << 3) | (i18 << 6) | (i18 << 9) | (i18 << 27), 384, (i15 & 896) | ((i15 << 3) & 7168) | ((i15 << 9) & 57344), 239070705);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(warningState, onConfirm, onDismiss, modifier3, i13, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0128  */
    /* JADX WARN: Code duplicated, block: B:75:0x0133  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:80:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public static final void m125698b0(String biomarkerName, String educationTitle, String description, AbstractC35664f modalBottomSheetState, InterfaceC4339a onDismiss, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC2994c0 interfaceC2994c0;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        AbstractC22676k.m65750j(biomarkerName, "biomarkerName");
        AbstractC22676k.m65750j(educationTitle, "educationTitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(modalBottomSheetState, "modalBottomSheetState");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-672324163);
        int i16 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(biomarkerName) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(educationTitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(description) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q2.m87153g(modalBottomSheetState) : c28655q2.m87157i(modalBottomSheetState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(onDismiss) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i17 = i14 & 32;
        if (i17 == 0) {
            if ((196608 & i13) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                C35666g c35666g = new C35666g(AbstractC11478a.m30853e(Locale.ROOT, biomarkerName, "toUpperCase(...)"), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i16, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
                boolean zM87157i = c28655q2.m87157i(interfaceC2994c0);
                if ((i15 & 7168) != 2048 || ((i15 & 4096) != 0 && c28655q2.m87157i(modalBottomSheetState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z16 = zM87157i | z13;
                if ((57344 & i15) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z16 | z14;
                objM87133R2 = c28655q2.m87133R();
                if (z15 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C39380c(interfaceC2994c0, onDismiss, modalBottomSheetState, 1);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifier4 = modifier2;
                c28655q = c28655q2;
                AbstractC35660d.m112871m(modifier4, c35666g, modalBottomSheetState, null, (InterfaceC4339a) objM87133R2, null, null, AbstractC37817c.m121344e(-1727801265, c28655q2, new C36538d(9, educationTitle, description)), false, null, null, null, false, modifierM66722k, C39379b.f169436a.m125594b(), c28655q, ((i15 >> 15) & 14) | 12582912 | (C35666g.f151591h << 3) | (AbstractC35664f.f151586a << 6) | ((i15 >> 3) & 896), 24576, 8040);
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(biomarkerName, educationTitle, description, modalBottomSheetState, onDismiss, modifier3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        modifier2 = modifier;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            C35666g c35666g2 = new C35666g(AbstractC11478a.m30853e(Locale.ROOT, biomarkerName, "toUpperCase(...)"), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, i16, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null);
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, AbstractC15673b0.m44010T(c2314t))));
            boolean zM87157i2 = c28655q2.m87157i(interfaceC2994c0);
            if ((i15 & 7168) != 2048) {
                z13 = true;
            } else {
                z13 = true;
            }
            boolean z17 = zM87157i2 | z13;
            if ((57344 & i15) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z17 | z14;
            objM87133R2 = c28655q2.m87133R();
            if (z15) {
                objM87133R2 = new C39380c(interfaceC2994c0, onDismiss, modalBottomSheetState, 1);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C39380c(interfaceC2994c0, onDismiss, modalBottomSheetState, 1);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifier5 = modifier2;
            c28655q = c28655q2;
            AbstractC35660d.m112871m(modifier5, c35666g2, modalBottomSheetState, null, (InterfaceC4339a) objM87133R2, null, null, AbstractC37817c.m121344e(-1727801265, c28655q2, new C36538d(9, educationTitle, description)), false, null, null, null, false, modifierM66722k2, C39379b.f169436a.m125594b(), c28655q, ((i15 >> 15) & 14) | 12582912 | (C35666g.f151591h << 3) | (AbstractC35664f.f151586a << 6) | ((i15 >> 3) & 896), 24576, 8040);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(biomarkerName, educationTitle, description, modalBottomSheetState, onDismiss, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C23454a0 m125699b1(C37033d c37033d, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m125696a1(c37033d, interfaceC4339a, interfaceC4339a2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m125701c0(InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, AbstractC35664f abstractC35664f) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(abstractC35664f, null), 3);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c1 */
    public static final void m125702c1(C37034e dialogState, InterfaceC4339a onConfirmExit, InterfaceC4339a onDismiss, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(dialogState, "dialogState");
        AbstractC22676k.m65750j(onConfirmExit, "onConfirmExit");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(285883803);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(dialogState) : c28655q2.m87157i(dialogState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onConfirmExit) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onDismiss) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(dialogState.getTitle());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(dialogState.getDescription());
            TextResource text = dialogState.getButton().getText();
            TextResource text2 = dialogState.getSecondaryButton().getText();
            int i15 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, textResourceM21278l, textResourceM21278l2, text, false, null, null, null, null, text2, null, false, false, null, null, false, 0, null, null, null, false, null, onDismiss, onDismiss, onConfirmExit, null, null, null, c28655q, (i15 << 3) | (i15 << 6) | (i15 << 9) | (i15 << 27), 384, (i14 & 896) | ((i14 << 3) & 7168) | ((i14 << 9) & 57344), 239070705);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(dialogState, onConfirmExit, onDismiss, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m125704d0(String str, String str2, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m125710f0(str, str2, null, c28655q, 0, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C23454a0 m125705d1(C37034e c37034e, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m125702c1(c37034e, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m125707e0(String str, String str2, String str3, AbstractC35664f abstractC35664f, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m125698b0(str, str2, str3, abstractC35664f, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v10 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v12 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v8 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v9 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v11 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v18 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: e1 */
    public static final void m125708e1(wb0.AbstractC37038i r25, boolean r26, p715kotlin.jvm.functions.Function1 r27, p715kotlin.jvm.functions.Function1 r28, p715kotlin.jvm.functions.Function1 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.AbstractC39388k.m125708e1(wb0.i, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x017d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0188  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f0 */
    private static final void m125710f0(String str, String str2, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1756311958);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
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
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                String upperCase = str.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i17).getH4();
                long jM125430y = c38072d.m121949b(c28655q2, i17).getBrandWhite();
                float f13 = 2 * 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
                int i18 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(upperCase, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q2, 48, i18, 196600);
                AbstractC30795n.m94707h(str2, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7), c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB2(), null, c28655q2, ((i15 >> 3) & 14) | 48, i18, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2561k6(str, str2, modifier3, i13, i14, 5);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            String upperCase2 = str.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q2, i19).getH4();
            long jM125430y2 = c38072d2.m121949b(c28655q2, i19).getBrandWhite();
            float f14 = 2 * 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7);
            int i110 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(upperCase2, modifierM3398t2, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q2, 48, i110, 196600);
            AbstractC30795n.m94707h(str2, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7), c38072d2.m121949b(c28655q2, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i19).getB2(), null, c28655q2, ((i15 >> 3) & 14) | 48, i110, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2561k6(str, str2, modifier3, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C23454a0 m125711f1(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m125713g0(String str, String str2, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m125710f0(str, str2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C23454a0 m125714g1(AbstractC35866a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:105:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:111:0x0308  */
    /* JADX WARN: Code duplicated, block: B:113:0x033f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0341  */
    /* JADX WARN: Code duplicated, block: B:117:0x034d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0355  */
    /* JADX WARN: Code duplicated, block: B:124:0x037b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0383  */
    /* JADX WARN: Code duplicated, block: B:163:0x0443  */
    /* JADX WARN: Code duplicated, block: B:165:0x0457  */
    /* JADX WARN: Code duplicated, block: B:168:0x0463  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x014c  */
    /* JADX WARN: Code duplicated, block: B:79:0x014e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0159  */
    /* JADX WARN: Code duplicated, block: B:87:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:99:0x0258  */
    /* JADX INFO: renamed from: h0 */
    private static final void m125716h0(final C37035f c37035f, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        boolean z4;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int iHashCode2;
        C38072d c38072d;
        int i24;
        Function1 function12;
        String string;
        Object next;
        boolean z15;
        boolean zM87157i;
        Object objM87133R2;
        final Function1 function13;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1831782021);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c37035f) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i25 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C39211b(20);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                        } else {
                            function10 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C39211b(21);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39211b(22);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function6 = (Function1) objM87133R3;
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        float f13 = 8;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3394p(((float) 0.5d) * f13, modifierM3409f), 0.0f, 2 * f13, 0.0f, 0.0f, 13);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        boolean zM118855d = c37035f.getIncluded();
                        boolean zM87157i2 = c28655q.m87157i(c37035f);
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i2 | z13;
                        objM87133R = c28655q.m87133R();
                        if (z14 || objM87133R == c28676v0) {
                            objM87133R = new C37900j1(8, c37035f, function10);
                            c28655q.m87172p0(objM87133R);
                        }
                        Function1 function14 = function10;
                        final Function1 function15 = function11;
                        Function1 function16 = function6;
                        m125729l1(zM118855d, (Function1) objM87133R, null, c28655q, 0, 4);
                        AbstractC38963t7.m124386p(1, f13, c2314t, c28655q);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        String upperCase = c37035f.getBiomarkerName().toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        c38072d = C38072d.f163053a;
                        i24 = C38072d.f163054b;
                        C2886a c2886aM8432m = c38072d.m121952e(c28655q, i24).getFormLabel();
                        long jM125430y = c38072d.m121949b(c28655q, i24).getBrandWhite();
                        int i26 = C2886a.f11498d << 18;
                        function12 = function16;
                        AbstractC30795n.m94707h(upperCase, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m, null, c28655q, 0, i26, 196602);
                        c28655q = c28655q;
                        if (!c37035f.getIncluded() && c37035f.getSubtitle() != null) {
                            c28655q.m87150e0(-1198083092);
                            AbstractC30795n.m94707h(c37035f.getSubtitle(), null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB4(), null, c28655q, 0, i26, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (!c37035f.getIncluded() || c37035f.getWarning() == null) {
                            c28655q.m87150e0(-1197527913);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1197765311);
                            AbstractC30795n.m94707h(c37035f.getWarning(), null, c38072d.m121949b(c28655q, i24).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB4(), null, c28655q, 0, i26, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        if (c37035f.getRightIcon() != null) {
                            c28655q.m87150e0(-1952644654);
                            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(c37035f.getRightIcon().toWhoopIcon(), c28655q, 0);
                            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1);
                            long jM125385c1 = c38072d.m121949b(c28655q, i24).getWhite70();
                            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t), "right_icon_tag");
                            if ((i15 & 7168) == 2048) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zM87157i = c28655q.m87157i(c37035f) | z15;
                            objM87133R2 = c28655q.m87133R();
                            if (!zM87157i || objM87133R2 == c28676v0) {
                                final int i27 = 0;
                                function13 = function12;
                                objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i27) {
                                            case 0:
                                                return AbstractC39388k.m125731m0(function13, c37035f);
                                            default:
                                                return AbstractC39388k.m125734n0(function13, c37035f);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                function13 = function12;
                            }
                            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3599a, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                            C28655q c28655q2 = c28655q;
                            function12 = function13;
                            AbstractC15005f3.m43107a(abstractC26165aM88500I, strM92103Y, modifierM3362g, jM125385c1, c28655q2, 0, 0);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        } else if (c37035f.getIncluded() || c37035f.getValue() == null) {
                            c28655q.m87150e0(-1951120415);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1951890486);
                            if (c37035f.m118854c() != null) {
                                Iterator<T> it = c37035f.m118854c().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    double dM118842a = ((C37032c) next).getValue();
                                    Double dM118863l = c37035f.getValue();
                                    if (dM118863l != null && dM118842a == dM118863l.doubleValue()) {
                                        break;
                                    }
                                }
                                C37032c c37032c = (C37032c) next;
                                if (c37032c == null || (string = c37032c.getValueText()) == null) {
                                    string = new DecimalFormat("#.##").format(c37035f.getValue().doubleValue());
                                }
                                AbstractC22676k.m65747g(string);
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                String strM118865n = c37035f.getValueText();
                                if (strM118865n == null) {
                                    strM118865n = new DecimalFormat("#.##").format(c37035f.getValue().doubleValue());
                                }
                                sb4.append(strM118865n);
                                String strM118861j = c37035f.getUnit();
                                if (strM118861j != null) {
                                    sb4.append(" ".concat(strM118861j));
                                }
                                string = sb4.toString();
                            }
                            String str = string;
                            boolean zM87157i3 = c28655q.m87157i(c37035f) | ((i15 & 896) == 256);
                            Object objM87133R6 = c28655q.m87133R();
                            if (zM87157i3 || objM87133R6 == c28676v0) {
                                final int i28 = 1;
                                objM87133R6 = new InterfaceC4339a() { // from class: yb0.j
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i28) {
                                            case 0:
                                                return AbstractC39388k.m125731m0(function15, c37035f);
                                            default:
                                                return AbstractC39388k.m125734n0(function15, c37035f);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R6);
                            }
                            m125688X(str, (InterfaceC4339a) objM87133R6, null, c28655q, 0, 4);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function7 = function14;
                        function8 = function15;
                        function9 = function12;
                    } else {
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36891k((Object) c37035f, function7, function8, function9, i13, i14, 15);
                    }
                }
                i15 |= 3072;
                function6 = function3;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39211b(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39211b(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39211b(22);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function6 = (Function1) objM87133R3;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f14 = 8;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(((float) 0.5d) * f14, modifierM3409f2), 0.0f, 2 * f14, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i5 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                    boolean zM118855d2 = c37035f.getIncluded();
                    boolean zM87157i4 = c28655q.m87157i(c37035f);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i4 | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new C37900j1(8, c37035f, function10);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C37900j1(8, c37035f, function10);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function17 = function10;
                    final Function1 function18 = function11;
                    Function1 function19 = function6;
                    m125729l1(zM118855d2, (Function1) objM87133R, null, c28655q, 0, 4);
                    AbstractC38963t7.m124386p(1, f14, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                    String upperCase2 = c37035f.getBiomarkerName().toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    C2886a c2886aM8432m2 = c38072d.m121952e(c28655q, i24).getFormLabel();
                    long jM125430y2 = c38072d.m121949b(c28655q, i24).getBrandWhite();
                    int i29 = C2886a.f11498d << 18;
                    function12 = function19;
                    AbstractC30795n.m94707h(upperCase2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m2, null, c28655q, 0, i29, 196602);
                    c28655q = c28655q;
                    if (!c37035f.getIncluded()) {
                        if (c37035f.getIncluded()) {
                            c28655q.m87150e0(-1197527913);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1197527913);
                            c28655q.m87173q(false);
                        }
                    } else if (c37035f.getIncluded()) {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (c37035f.getRightIcon() != null) {
                        c28655q.m87150e0(-1952644654);
                        AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(c37035f.getRightIcon().toWhoopIcon(), c28655q, 0);
                        String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1);
                        long jM125385c2 = c38072d.m121949b(c28655q, i24).getWhite70();
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t), "right_icon_tag");
                        if ((i15 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87157i = c28655q.m87157i(c37035f) | z15;
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i210 = 0;
                            function13 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i210) {
                                        case 0:
                                            return AbstractC39388k.m125731m0(function13, c37035f);
                                        default:
                                            return AbstractC39388k.m125734n0(function13, c37035f);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i211 = 0;
                            function13 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211) {
                                        case 0:
                                            return AbstractC39388k.m125731m0(function13, c37035f);
                                        default:
                                            return AbstractC39388k.m125734n0(function13, c37035f);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3599a2, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        C28655q c28655q3 = c28655q;
                        function12 = function13;
                        AbstractC15005f3.m43107a(abstractC26165aM88500I2, strM92103Y2, modifierM3362g2, jM125385c2, c28655q3, 0, 0);
                        c28655q = c28655q3;
                        c28655q.m87173q(false);
                    } else if (c37035f.getIncluded()) {
                        c28655q.m87150e0(-1951120415);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1951120415);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function7 = function17;
                    function8 = function18;
                    function9 = function12;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k((Object) c37035f, function7, function8, function9, i13, i14, 15);
                }
            }
            i15 |= 384;
            function5 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39211b(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39211b(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39211b(22);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function6 = (Function1) objM87133R3;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f15 = 8;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(((float) 0.5d) * f15, modifierM3409f3), 0.0f, 2 * f15, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i8 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                    C0209i c0209i9 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                    boolean zM118855d3 = c37035f.getIncluded();
                    boolean zM87157i5 = c28655q.m87157i(c37035f);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i5 | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new C37900j1(8, c37035f, function10);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C37900j1(8, c37035f, function10);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function110 = function10;
                    final Function1 function111 = function11;
                    Function1 function112 = function6;
                    m125729l1(zM118855d3, (Function1) objM87133R, null, c28655q, 0, 4);
                    AbstractC38963t7.m124386p(1, f15, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                    String upperCase3 = c37035f.getBiomarkerName().toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    C2886a c2886aM8432m3 = c38072d.m121952e(c28655q, i24).getFormLabel();
                    long jM125430y3 = c38072d.m121949b(c28655q, i24).getBrandWhite();
                    int i212 = C2886a.f11498d << 18;
                    function12 = function112;
                    AbstractC30795n.m94707h(upperCase3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m3, null, c28655q, 0, i212, 196602);
                    c28655q = c28655q;
                    if (!c37035f.getIncluded()) {
                        if (c37035f.getIncluded()) {
                            c28655q.m87150e0(-1197527913);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1197527913);
                            c28655q.m87173q(false);
                        }
                    } else if (c37035f.getIncluded()) {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (c37035f.getRightIcon() != null) {
                        c28655q.m87150e0(-1952644654);
                        AbstractC26165a abstractC26165aM88500I3 = AbstractC29125c.m88500I(c37035f.getRightIcon().toWhoopIcon(), c28655q, 0);
                        String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1);
                        long jM125385c3 = c38072d.m121949b(c28655q, i24).getWhite70();
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t), "right_icon_tag");
                        if ((i15 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87157i = c28655q.m87157i(c37035f) | z15;
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i213 = 0;
                            function13 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC39388k.m125731m0(function13, c37035f);
                                        default:
                                            return AbstractC39388k.m125734n0(function13, c37035f);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i214 = 0;
                            function13 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i214) {
                                        case 0:
                                            return AbstractC39388k.m125731m0(function13, c37035f);
                                        default:
                                            return AbstractC39388k.m125734n0(function13, c37035f);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3599a3, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        C28655q c28655q4 = c28655q;
                        function12 = function13;
                        AbstractC15005f3.m43107a(abstractC26165aM88500I3, strM92103Y3, modifierM3362g3, jM125385c3, c28655q4, 0, 0);
                        c28655q = c28655q4;
                        c28655q.m87173q(false);
                    } else if (c37035f.getIncluded()) {
                        c28655q.m87150e0(-1951120415);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1951120415);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function7 = function110;
                    function8 = function111;
                    function9 = function12;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k((Object) c37035f, function7, function8, function9, i13, i14, 15);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39211b(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39211b(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39211b(22);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function6 = (Function1) objM87133R3;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f16 = 8;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(((float) 0.5d) * f16, modifierM3409f4), 0.0f, 2 * f16, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                boolean zM118855d4 = c37035f.getIncluded();
                boolean zM87157i6 = c28655q.m87157i(c37035f);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i6 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C37900j1(8, c37035f, function10);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C37900j1(8, c37035f, function10);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function113 = function10;
                final Function1 function114 = function11;
                Function1 function115 = function6;
                m125729l1(zM118855d4, (Function1) objM87133R, null, c28655q, 0, 4);
                AbstractC38963t7.m124386p(1, f16, c2314t, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
                String upperCase4 = c37035f.getBiomarkerName().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                C2886a c2886aM8432m4 = c38072d.m121952e(c28655q, i24).getFormLabel();
                long jM125430y4 = c38072d.m121949b(c28655q, i24).getBrandWhite();
                int i215 = C2886a.f11498d << 18;
                function12 = function115;
                AbstractC30795n.m94707h(upperCase4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m4, null, c28655q, 0, i215, 196602);
                c28655q = c28655q;
                if (!c37035f.getIncluded()) {
                    if (c37035f.getIncluded()) {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    }
                } else if (c37035f.getIncluded()) {
                    c28655q.m87150e0(-1197527913);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1197527913);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (c37035f.getRightIcon() != null) {
                    c28655q.m87150e0(-1952644654);
                    AbstractC26165a abstractC26165aM88500I4 = AbstractC29125c.m88500I(c37035f.getRightIcon().toWhoopIcon(), c28655q, 0);
                    String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1);
                    long jM125385c4 = c38072d.m121949b(c28655q, i24).getWhite70();
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t), "right_icon_tag");
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i = c28655q.m87157i(c37035f) | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        final int i216 = 0;
                        function13 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i216) {
                                    case 0:
                                        return AbstractC39388k.m125731m0(function13, c37035f);
                                    default:
                                        return AbstractC39388k.m125734n0(function13, c37035f);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i217 = 0;
                        function13 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i217) {
                                    case 0:
                                        return AbstractC39388k.m125731m0(function13, c37035f);
                                    default:
                                        return AbstractC39388k.m125734n0(function13, c37035f);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM3599a4, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    C28655q c28655q5 = c28655q;
                    function12 = function13;
                    AbstractC15005f3.m43107a(abstractC26165aM88500I4, strM92103Y4, modifierM3362g4, jM125385c4, c28655q5, 0, 0);
                    c28655q = c28655q5;
                    c28655q.m87173q(false);
                } else if (c37035f.getIncluded()) {
                    c28655q.m87150e0(-1951120415);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1951120415);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function7 = function113;
                function8 = function114;
                function9 = function12;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) c37035f, function7, function8, function9, i13, i14, 15);
            }
        }
        i15 |= 48;
        function4 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39211b(20);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39211b(21);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39211b(22);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function6 = (Function1) objM87133R3;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f17 = 8;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(((float) 0.5d) * f17, modifierM3409f5), 0.0f, 2 * f17, 0.0f, 0.0f, 13);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a5);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m9);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N9);
                    boolean zM118855d5 = c37035f.getIncluded();
                    boolean zM87157i7 = c28655q.m87157i(c37035f);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i7 | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new C37900j1(8, c37035f, function10);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C37900j1(8, c37035f, function10);
                        c28655q.m87172p0(objM87133R);
                    }
                    Function1 function116 = function10;
                    final Function1 function117 = function11;
                    Function1 function118 = function6;
                    m125729l1(zM118855d5, (Function1) objM87133R, null, c28655q, 0, 4);
                    AbstractC38963t7.m124386p(1, f17, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                    String upperCase5 = c37035f.getBiomarkerName().toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase5, "toUpperCase(...)");
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    C2886a c2886aM8432m5 = c38072d.m121952e(c28655q, i24).getFormLabel();
                    long jM125430y5 = c38072d.m121949b(c28655q, i24).getBrandWhite();
                    int i218 = C2886a.f11498d << 18;
                    function12 = function118;
                    AbstractC30795n.m94707h(upperCase5, null, jM125430y5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m5, null, c28655q, 0, i218, 196602);
                    c28655q = c28655q;
                    if (!c37035f.getIncluded()) {
                        if (c37035f.getIncluded()) {
                            c28655q.m87150e0(-1197527913);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1197527913);
                            c28655q.m87173q(false);
                        }
                    } else if (c37035f.getIncluded()) {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    if (c37035f.getRightIcon() != null) {
                        c28655q.m87150e0(-1952644654);
                        AbstractC26165a abstractC26165aM88500I5 = AbstractC29125c.m88500I(c37035f.getRightIcon().toWhoopIcon(), c28655q, 0);
                        String strM92103Y5 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1);
                        long jM125385c5 = c38072d.m121949b(c28655q, i24).getWhite70();
                        Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t), "right_icon_tag");
                        if ((i15 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87157i = c28655q.m87157i(c37035f) | z15;
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i219 = 0;
                            function13 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i219) {
                                        case 0:
                                            return AbstractC39388k.m125731m0(function13, c37035f);
                                        default:
                                            return AbstractC39388k.m125734n0(function13, c37035f);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i2110 = 0;
                            function13 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2110) {
                                        case 0:
                                            return AbstractC39388k.m125731m0(function13, c37035f);
                                        default:
                                            return AbstractC39388k.m125734n0(function13, c37035f);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3362g5 = AbstractC1092a.m3362g(modifierM3599a5, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        C28655q c28655q6 = c28655q;
                        function12 = function13;
                        AbstractC15005f3.m43107a(abstractC26165aM88500I5, strM92103Y5, modifierM3362g5, jM125385c5, c28655q6, 0, 0);
                        c28655q = c28655q6;
                        c28655q.m87173q(false);
                    } else if (c37035f.getIncluded()) {
                        c28655q.m87150e0(-1951120415);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1951120415);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function7 = function116;
                    function8 = function117;
                    function9 = function12;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k((Object) c37035f, function7, function8, function9, i13, i14, 15);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39211b(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39211b(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39211b(22);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function6 = (Function1) objM87133R3;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f18 = 8;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(((float) 0.5d) * f18, modifierM3409f6), 0.0f, 2 * f18, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i17 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i17, c22994r1M66759a6);
                C0209i c0209i18 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N11);
                boolean zM118855d6 = c37035f.getIncluded();
                boolean zM87157i8 = c28655q.m87157i(c37035f);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i8 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C37900j1(8, c37035f, function10);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C37900j1(8, c37035f, function10);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function119 = function10;
                final Function1 function1110 = function11;
                Function1 function1111 = function6;
                m125729l1(zM118855d6, (Function1) objM87133R, null, c28655q, 0, 4);
                AbstractC38963t7.m124386p(1, f18, c2314t, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N12);
                String upperCase6 = c37035f.getBiomarkerName().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase6, "toUpperCase(...)");
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                C2886a c2886aM8432m6 = c38072d.m121952e(c28655q, i24).getFormLabel();
                long jM125430y6 = c38072d.m121949b(c28655q, i24).getBrandWhite();
                int i2111 = C2886a.f11498d << 18;
                function12 = function1111;
                AbstractC30795n.m94707h(upperCase6, null, jM125430y6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m6, null, c28655q, 0, i2111, 196602);
                c28655q = c28655q;
                if (!c37035f.getIncluded()) {
                    if (c37035f.getIncluded()) {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    }
                } else if (c37035f.getIncluded()) {
                    c28655q.m87150e0(-1197527913);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1197527913);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (c37035f.getRightIcon() != null) {
                    c28655q.m87150e0(-1952644654);
                    AbstractC26165a abstractC26165aM88500I6 = AbstractC29125c.m88500I(c37035f.getRightIcon().toWhoopIcon(), c28655q, 0);
                    String strM92103Y6 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1);
                    long jM125385c6 = c38072d.m121949b(c28655q, i24).getWhite70();
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t), "right_icon_tag");
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i = c28655q.m87157i(c37035f) | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        final int i2112 = 0;
                        function13 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2112) {
                                    case 0:
                                        return AbstractC39388k.m125731m0(function13, c37035f);
                                    default:
                                        return AbstractC39388k.m125734n0(function13, c37035f);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i2113 = 0;
                        function13 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2113) {
                                    case 0:
                                        return AbstractC39388k.m125731m0(function13, c37035f);
                                    default:
                                        return AbstractC39388k.m125734n0(function13, c37035f);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3362g6 = AbstractC1092a.m3362g(modifierM3599a6, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    C28655q c28655q7 = c28655q;
                    function12 = function13;
                    AbstractC15005f3.m43107a(abstractC26165aM88500I6, strM92103Y6, modifierM3362g6, jM125385c6, c28655q7, 0, 0);
                    c28655q = c28655q7;
                    c28655q.m87173q(false);
                } else if (c37035f.getIncluded()) {
                    c28655q.m87150e0(-1951120415);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1951120415);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function7 = function119;
                function8 = function1110;
                function9 = function12;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) c37035f, function7, function8, function9, i13, i14, 15);
            }
        }
        i15 |= 384;
        function5 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39211b(20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39211b(21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39211b(22);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function6 = (Function1) objM87133R3;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                float f19 = 8;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(((float) 0.5d) * f19, modifierM3409f7), 0.0f, 2 * f19, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a7);
                C0209i c0209i111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m13);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N13);
                boolean zM118855d7 = c37035f.getIncluded();
                boolean zM87157i9 = c28655q.m87157i(c37035f);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i9 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C37900j1(8, c37035f, function10);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C37900j1(8, c37035f, function10);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function1112 = function10;
                final Function1 function1113 = function11;
                Function1 function1114 = function6;
                m125729l1(zM118855d7, (Function1) objM87133R, null, c28655q, 0, 4);
                AbstractC38963t7.m124386p(1, f19, c2314t, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, layoutWeightElement7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N14);
                String upperCase7 = c37035f.getBiomarkerName().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase7, "toUpperCase(...)");
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                C2886a c2886aM8432m7 = c38072d.m121952e(c28655q, i24).getFormLabel();
                long jM125430y7 = c38072d.m121949b(c28655q, i24).getBrandWhite();
                int i2114 = C2886a.f11498d << 18;
                function12 = function1114;
                AbstractC30795n.m94707h(upperCase7, null, jM125430y7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m7, null, c28655q, 0, i2114, 196602);
                c28655q = c28655q;
                if (!c37035f.getIncluded()) {
                    if (c37035f.getIncluded()) {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1197527913);
                        c28655q.m87173q(false);
                    }
                } else if (c37035f.getIncluded()) {
                    c28655q.m87150e0(-1197527913);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1197527913);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (c37035f.getRightIcon() != null) {
                    c28655q.m87150e0(-1952644654);
                    AbstractC26165a abstractC26165aM88500I7 = AbstractC29125c.m88500I(c37035f.getRightIcon().toWhoopIcon(), c28655q, 0);
                    String strM92103Y7 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1);
                    long jM125385c7 = c38072d.m121949b(c28655q, i24).getWhite70();
                    Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t), "right_icon_tag");
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i = c28655q.m87157i(c37035f) | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        final int i2115 = 0;
                        function13 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2115) {
                                    case 0:
                                        return AbstractC39388k.m125731m0(function13, c37035f);
                                    default:
                                        return AbstractC39388k.m125734n0(function13, c37035f);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i2116 = 0;
                        function13 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2116) {
                                    case 0:
                                        return AbstractC39388k.m125731m0(function13, c37035f);
                                    default:
                                        return AbstractC39388k.m125734n0(function13, c37035f);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3362g7 = AbstractC1092a.m3362g(modifierM3599a7, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    C28655q c28655q8 = c28655q;
                    function12 = function13;
                    AbstractC15005f3.m43107a(abstractC26165aM88500I7, strM92103Y7, modifierM3362g7, jM125385c7, c28655q8, 0, 0);
                    c28655q = c28655q8;
                    c28655q.m87173q(false);
                } else if (c37035f.getIncluded()) {
                    c28655q.m87150e0(-1951120415);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1951120415);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function7 = function1112;
                function8 = function1113;
                function9 = function12;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) c37035f, function7, function8, function9, i13, i14, 15);
            }
        }
        i15 |= 3072;
        function6 = function3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C39211b(20);
                    c28655q.m87172p0(objM87133R5);
                }
                function10 = (Function1) objM87133R5;
            } else {
                function10 = function4;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C39211b(21);
                    c28655q.m87172p0(objM87133R4);
                }
                function11 = (Function1) objM87133R4;
            } else {
                function11 = function5;
            }
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C39211b(22);
                    c28655q.m87172p0(objM87133R3);
                }
                function6 = (Function1) objM87133R3;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
            float f110 = 8;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(((float) 0.5d) * f110, modifierM3409f8), 0.0f, 2 * f110, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i113 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i113, c22994r1M66759a8);
            C0209i c0209i114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m15);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N15);
            boolean zM118855d8 = c37035f.getIncluded();
            boolean zM87157i10 = c28655q.m87157i(c37035f);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i10 | z13;
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C37900j1(8, c37035f, function10);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C37900j1(8, c37035f, function10);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1115 = function10;
            final Function1 function1116 = function11;
            Function1 function1117 = function6;
            m125729l1(zM118855d8, (Function1) objM87133R, null, c28655q, 0, 4);
            AbstractC38963t7.m124386p(1, f110, c2314t, c28655q);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m16);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N16);
            String upperCase8 = c37035f.getBiomarkerName().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase8, "toUpperCase(...)");
            c38072d = C38072d.f163053a;
            i24 = C38072d.f163054b;
            C2886a c2886aM8432m8 = c38072d.m121952e(c28655q, i24).getFormLabel();
            long jM125430y8 = c38072d.m121949b(c28655q, i24).getBrandWhite();
            int i2117 = C2886a.f11498d << 18;
            function12 = function1117;
            AbstractC30795n.m94707h(upperCase8, null, jM125430y8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8432m8, null, c28655q, 0, i2117, 196602);
            c28655q = c28655q;
            if (!c37035f.getIncluded()) {
                if (c37035f.getIncluded()) {
                    c28655q.m87150e0(-1197527913);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1197527913);
                    c28655q.m87173q(false);
                }
            } else if (c37035f.getIncluded()) {
                c28655q.m87150e0(-1197527913);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1197527913);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (c37035f.getRightIcon() != null) {
                c28655q.m87150e0(-1952644654);
                AbstractC26165a abstractC26165aM88500I8 = AbstractC29125c.m88500I(c37035f.getRightIcon().toWhoopIcon(), c28655q, 0);
                String strM92103Y8 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62239G1);
                long jM125385c8 = c38072d.m121949b(c28655q, i24).getWhite70();
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(6 * 4, c2314t), "right_icon_tag");
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = c28655q.m87157i(c37035f) | z15;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    final int i2118 = 0;
                    function13 = function12;
                    objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2118) {
                                case 0:
                                    return AbstractC39388k.m125731m0(function13, c37035f);
                                default:
                                    return AbstractC39388k.m125734n0(function13, c37035f);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i2119 = 0;
                    function13 = function12;
                    objM87133R2 = new InterfaceC4339a() { // from class: yb0.j
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2119) {
                                case 0:
                                    return AbstractC39388k.m125731m0(function13, c37035f);
                                default:
                                    return AbstractC39388k.m125734n0(function13, c37035f);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g8 = AbstractC1092a.m3362g(modifierM3599a8, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                C28655q c28655q9 = c28655q;
                function12 = function13;
                AbstractC15005f3.m43107a(abstractC26165aM88500I8, strM92103Y8, modifierM3362g8, jM125385c8, c28655q9, 0, 0);
                c28655q = c28655q9;
                c28655q.m87173q(false);
            } else if (c37035f.getIncluded()) {
                c28655q.m87150e0(-1951120415);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1951120415);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function7 = function1115;
            function8 = function1116;
            function9 = function12;
        } else {
            c28655q.m87138X();
            function7 = function4;
            function8 = function5;
            function9 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k((Object) c37035f, function7, function8, function9, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C23454a0 m125717h1(AbstractC37036g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m125719i0(C37035f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C23454a0 m125720i1(Function1 function1) {
        function1.invoke(AbstractC35866a.a.f152695a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m125722j0(C37035f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C23454a0 m125723j1(Function1 function1) {
        function1.invoke(AbstractC35866a.a.f152695a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m125725k0(C37035f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C23454a0 m125726k1(AbstractC37038i abstractC37038i, boolean z4, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m125708e1(abstractC37038i, z4, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m125728l0(C37035f c37035f, Function1 function1, boolean z4) {
        if (!c37035f.getIsCalculated()) {
            function1.invoke(c37035f);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l1 */
    private static final void m125729l1(boolean z4, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        float f13;
        long jM95628d;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(839284393);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                f13 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, modifier4);
                if (z4) {
                    c28655q.m87150e0(-901541453);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(-901540368);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3419p, 1, f13, jM95628d);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R = c28655q.m87133R();
                if (z16 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3675b(function1, z4, 15);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3362g(modifierM95629e, false, null, null, (InterfaceC4339a) objM87133R, 15), "rounded_checkbox_tag");
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
                if (z4) {
                    c28655q.m87150e0(81570841);
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.CHECKMARK.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(f13 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(81821011);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18416a(z4, function1, modifier3, i13, i14, 2);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            f13 = 4;
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * f13, modifier4);
            if (z4) {
                c28655q.m87150e0(-901541453);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-901540368);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            Modifier modifierM95629e2 = AbstractC31061c.m95629e(modifierM3419p2, 1, f13, jM95628d);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i15 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objM87133R = c28655q.m87133R();
            if (z16) {
                objM87133R = new C3675b(function1, z4, 15);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3675b(function1, z4, 15);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1092a.m3362g(modifierM95629e2, false, null, null, (InterfaceC4339a) objM87133R, 15), "rounded_checkbox_tag");
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            if (z4) {
                c28655q.m87150e0(81570841);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.CHECKMARK.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(f13 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), c28655q, 432, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(81821011);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18416a(z4, function1, modifier3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m125731m0(Function1 function1, C37035f c37035f) {
        function1.invoke(c37035f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C23454a0 m125732m1(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m125734n0(Function1 function1, C37035f c37035f) {
        function1.invoke(c37035f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C23454a0 m125735n1(boolean z4, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m125729l1(z4, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m125737o0(C37035f c37035f, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m125716h0(c37035f, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o1 */
    public static final void m125738o1(C37039j modalState, InterfaceC4339a onClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modalState, "modalState");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1068145070);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(modalState) : c28655q.m87157i(modalState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3407d, c38072d.m121949b(c28655q, i15).getBlack70(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f13 = 8;
            int i16 = i14;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM3409f, ((float) 4.5d) * f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            float f14 = 4;
            float f15 = f14 * f13;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC36512c.f156065h, c28655q, 6), null, AbstractC1099a.m3398t(AbstractC1102d.m3419p(22 * f14, c2314t), 0.0f, 0.0f, 0.0f, f15, 7), c38072d.m121949b(c28655q, i15).getAccentAlert(), c28655q, 432, 0);
            String strM118902c = modalState.getTitle();
            C2886a c2886aM8436q = c38072d.m121952e(c28655q, i15).getH3();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM118902c, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q, 48, i17, 196600);
            AbstractC30795n.m94707h(modalState.getDescription(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 48, i17, 196088);
            c28655q = c28655q;
            C27238a0 c27238a0M118901b = modalState.getPrimaryButton();
            if (c27238a0M118901b == null) {
                c28655q.m87150e0(446597760);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(446597761);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                boolean z4 = (i16 & 112) == 32;
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C39272e(onClick, 3);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27292z.m82341h(c27238a0M118901b, modifierM3409f2, null, (InterfaceC4339a) objM87133R, c28655q, C27238a0.f109008k | 48, 4);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(modalState, onClick, i13, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:103:0x0228  */
    /* JADX WARN: Code duplicated, block: B:108:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0244  */
    /* JADX WARN: Code duplicated, block: B:112:0x0256  */
    /* JADX WARN: Code duplicated, block: B:118:0x027f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0281  */
    /* JADX WARN: Code duplicated, block: B:122:0x0292  */
    /* JADX WARN: Code duplicated, block: B:128:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:143:0x0300  */
    /* JADX WARN: Code duplicated, block: B:145:0x0310  */
    /* JADX WARN: Code duplicated, block: B:146:0x0312  */
    /* JADX WARN: Code duplicated, block: B:149:0x0319 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0321  */
    /* JADX WARN: Code duplicated, block: B:155:0x0337  */
    /* JADX WARN: Code duplicated, block: B:157:0x034f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0363  */
    /* JADX WARN: Code duplicated, block: B:162:0x0373  */
    /* JADX WARN: Code duplicated, block: B:163:0x0375  */
    /* JADX WARN: Code duplicated, block: B:166:0x037c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x0382  */
    /* JADX WARN: Code duplicated, block: B:172:0x0397  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:175:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:181:0x0406  */
    /* JADX WARN: Code duplicated, block: B:183:0x0412  */
    /* JADX WARN: Code duplicated, block: B:184:0x0414  */
    /* JADX WARN: Code duplicated, block: B:187:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x0426  */
    /* JADX WARN: Code duplicated, block: B:193:0x043a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0462  */
    /* JADX WARN: Code duplicated, block: B:199:0x047d  */
    /* JADX WARN: Code duplicated, block: B:200:0x047f  */
    /* JADX WARN: Code duplicated, block: B:203:0x0486  */
    /* JADX WARN: Code duplicated, block: B:206:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:210:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:213:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:217:0x0538  */
    /* JADX WARN: Code duplicated, block: B:221:0x0585  */
    /* JADX WARN: Code duplicated, block: B:224:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:225:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:228:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:230:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:233:0x066b  */
    /* JADX WARN: Code duplicated, block: B:236:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:239:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:241:0x070b  */
    /* JADX WARN: Code duplicated, block: B:242:0x070d  */
    /* JADX WARN: Code duplicated, block: B:245:0x0714 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x071a  */
    /* JADX WARN: Code duplicated, block: B:251:0x072f  */
    /* JADX WARN: Code duplicated, block: B:252:0x073b  */
    /* JADX WARN: Code duplicated, block: B:255:0x0746  */
    /* JADX WARN: Code duplicated, block: B:256:0x0752  */
    /* JADX WARN: Code duplicated, block: B:259:0x077a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:262:0x079f  */
    /* JADX WARN: Code duplicated, block: B:265:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:267:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:268:0x0800  */
    /* JADX WARN: Code duplicated, block: B:271:0x0808 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:272:0x080a  */
    /* JADX WARN: Code duplicated, block: B:275:0x081d  */
    /* JADX WARN: Code duplicated, block: B:279:0x0837  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:282:0x086d  */
    /* JADX WARN: Code duplicated, block: B:283:0x086f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0878 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:287:0x087a  */
    /* JADX WARN: Code duplicated, block: B:292:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:293:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:295:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:298:0x0905  */
    /* JADX WARN: Code duplicated, block: B:299:0x0907  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:302:0x0913 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:303:0x0915  */
    /* JADX WARN: Code duplicated, block: B:307:0x0941  */
    /* JADX WARN: Code duplicated, block: B:308:0x094b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:310:0x0957  */
    /* JADX WARN: Code duplicated, block: B:316:0x099b  */
    /* JADX WARN: Code duplicated, block: B:320:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:321:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:323:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:324:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:327:0x09cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:328:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:331:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:334:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:341:0x0826 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:? A[LOOP:2: B:135:0x02da->B:344:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:350:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:87:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x019e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01de  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: p0 */
    public static final void m125740p0(AbstractC37038i.d viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        Function1 function3;
        int i15;
        Function1 function4;
        int i16;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function7;
        Function1 function8;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c5;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c6;
        C15199y3 c15199y3M3460c;
        C15199y3 c15199y3M3460c2;
        boolean zM87157i;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c7;
        boolean zM87157i2;
        Object objM87133R8;
        boolean zM87157i3;
        Object objM87133R9;
        InterfaceC28601c1 interfaceC28601c8;
        boolean zM87157i4;
        Object objM87133R10;
        boolean zM87153g;
        ArrayList arrayList;
        String upperCase;
        String upperCase2;
        C15199y3 c15199y3;
        C15199y3 c15199y4;
        Object obj2;
        Object obj3;
        boolean zM87153g2;
        Object objM87133R11;
        ArrayList arrayList2;
        List<C37035f> list;
        boolean zM87153g3;
        Object objM87133R12;
        ArrayList arrayList3;
        List<C37035f> list2;
        boolean zM87153g4;
        Object objM87133R13;
        List<C37035f> listM118888i;
        Iterator<T> it;
        boolean z13;
        boolean zBooleanValue;
        InterfaceC28601c1 interfaceC28601c9;
        InterfaceC28601c1 interfaceC28601c10;
        InterfaceC28601c1 interfaceC28601c11;
        boolean z14;
        char c3;
        InterfaceC28601c1 interfaceC28601c12;
        char c7;
        boolean z15;
        Object objM87133R14;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Object objM87133R15;
        int i17;
        Function1 function9;
        InterfaceC28601c1 interfaceC28601c13;
        InterfaceC28601c1 interfaceC28601c14;
        int iHashCode2;
        C38072d c38072d;
        int i18;
        boolean z16;
        Object objM87133R16;
        int i19;
        C28655q c28655q2;
        InterfaceC28601c1 interfaceC28601c15;
        InterfaceC28601c1 interfaceC28601c16;
        Function1 function10;
        int i24;
        int i25;
        C28655q c28655q3;
        Function1 function11;
        boolean z17;
        C28655q c28655q4;
        boolean z18;
        int i26;
        boolean z19;
        boolean z24;
        Object c4660x0;
        int i27;
        InterfaceC28601c1 interfaceC28601c17;
        C15199y3 c15199y5;
        C37035f c37035fM125758v0;
        Object objM87133R17;
        boolean z25;
        boolean zM87157i5;
        Object objM87133R18;
        C28655q c28655q5;
        C37035f c37035fM125762x0;
        C28655q c28655q6;
        C28655q c28655q7;
        C37039j c37039jM118893n;
        boolean z26;
        Object objM87133R19;
        C28655q c28655q8;
        boolean z27;
        boolean z28;
        Object objM87133R20;
        Object objM87133R21;
        C28655q c28655q9;
        int i28;
        boolean z29;
        Object objM87133R22;
        Function1 function12;
        Object objM87133R23;
        InterfaceC28601c1 interfaceC28601c18;
        Object objM87133R24;
        InterfaceC28601c1 interfaceC28601c19;
        C37033d c37033dM118891l;
        boolean z34;
        boolean zM87157i6;
        Object objM87133R25;
        InterfaceC28601c1 interfaceC28601c20;
        Object objM87133R26;
        boolean z35;
        Object objM87133R27;
        InterfaceC28601c1 interfaceC28601c21;
        Object objM87133R28;
        boolean z36;
        Object objM87133R29;
        Object objM87133R30;
        Object objM87133R31;
        Object objM87133R32;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q10 = (C28655q) composer;
        c28655q10.m87154g0(-1848140872);
        int i29 = (i13 & 6) == 0 ? (c28655q10.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i34 = i14 & 2;
        if (i34 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i29 |= c28655q10.m87157i(function3) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q10.m87157i(function4)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i29 |= i16;
                }
                if ((i29 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q10.m87135U(i29 & 1, z4)) {
                    obj = C28635l.f115821a;
                    if (i34 != 0) {
                        objM87133R32 = c28655q10.m87133R();
                        if (objM87133R32 == obj) {
                            objM87133R32 = new C39211b(24);
                            c28655q10.m87172p0(objM87133R32);
                        }
                        function7 = (Function1) objM87133R32;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        objM87133R31 = c28655q10.m87133R();
                        if (objM87133R31 == obj) {
                            objM87133R31 = new C39211b(16);
                            c28655q10.m87172p0(objM87133R31);
                        }
                        function8 = (Function1) objM87133R31;
                    } else {
                        function8 = function4;
                    }
                    objM87133R = c28655q10.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q10.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q10.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q10.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q10.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q10.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q10.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q10.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q10.m87133R();
                    if (objM87133R5 == obj) {
                        objM87133R5 = AbstractC28683x.m87272z(null);
                        c28655q10.m87172p0(objM87133R5);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q10.m87133R();
                    if (objM87133R6 == obj) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q10.m87172p0(objM87133R6);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                    EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q10, 3078, 6);
                    c15199y3M3460c2 = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q10, 3078, 6);
                    C37035f c37035fM125758v1 = m125758v0(interfaceC28601c5);
                    zM87157i = c28655q10.m87157i(c15199y3M3460c);
                    objM87133R7 = c28655q10.m87133R();
                    if (!zM87157i || objM87133R7 == obj) {
                        interfaceC28601c7 = interfaceC28601c5;
                        objM87133R7 = new b(c15199y3M3460c, interfaceC28601c7, null);
                        c28655q10.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c7 = interfaceC28601c5;
                    }
                    AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R7, c37035fM125758v1);
                    EnumC15209z3 enumC15209z3M43221b = c15199y3M3460c.m43221b();
                    zM87157i2 = c28655q10.m87157i(c15199y3M3460c);
                    objM87133R8 = c28655q10.m87133R();
                    if (zM87157i2 || objM87133R8 == obj) {
                        objM87133R8 = new c(c15199y3M3460c, interfaceC28601c7, null);
                        c28655q10.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R8, enumC15209z3M43221b);
                    C37035f c37035fM125762x1 = m125762x0(interfaceC28601c6);
                    zM87157i3 = c28655q10.m87157i(c15199y3M3460c2);
                    objM87133R9 = c28655q10.m87133R();
                    if (!zM87157i3 || objM87133R9 == obj) {
                        interfaceC28601c8 = interfaceC28601c6;
                        objM87133R9 = new d(c15199y3M3460c2, interfaceC28601c8, null);
                        c28655q10.m87172p0(objM87133R9);
                    } else {
                        interfaceC28601c8 = interfaceC28601c6;
                    }
                    AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R9, c37035fM125762x1);
                    EnumC15209z3 enumC15209z3M43221b2 = c15199y3M3460c2.m43221b();
                    zM87157i4 = c28655q10.m87157i(c15199y3M3460c2);
                    objM87133R10 = c28655q10.m87133R();
                    if (zM87157i4 || objM87133R10 == obj) {
                        objM87133R10 = new e(c15199y3M3460c2, interfaceC28601c8, null);
                        c28655q10.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R10, enumC15209z3M43221b2);
                    zM87153g = c28655q10.m87153g(viewState.m118888i()) | c28655q10.m87153g(m125645B0(interfaceC28601c1));
                    Object objM87133R33 = c28655q10.m87133R();
                    if (!zM87153g || objM87133R33 == obj) {
                        if (AbstractC39414r.m125890i0(m125645B0(interfaceC28601c1))) {
                            arrayList = viewState.m118888i();
                        } else {
                            List<C37035f> listM118888i2 = viewState.m118888i();
                            arrayList = new ArrayList();
                            for (Object obj4 : listM118888i2) {
                                String strM118853b = ((C37035f) obj4).getBiomarkerName();
                                C15199y3 c15199y6 = c15199y3M3460c;
                                Locale locale = Locale.ROOT;
                                upperCase = strM118853b.toUpperCase(locale);
                                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                                C15199y3 c15199y7 = c15199y3M3460c2;
                                upperCase2 = m125645B0(interfaceC28601c1).toUpperCase(locale);
                                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                                if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                    arrayList.add(obj4);
                                }
                                c15199y3M3460c2 = c15199y7;
                                c15199y3M3460c = c15199y6;
                            }
                        }
                        c15199y3 = c15199y3M3460c;
                        c15199y4 = c15199y3M3460c2;
                        c28655q10.m87172p0(arrayList);
                        obj2 = arrayList;
                    } else {
                        c15199y3 = c15199y3M3460c;
                        c15199y4 = c15199y3M3460c2;
                        obj2 = objM87133R33;
                    }
                    obj3 = (List) obj2;
                    zM87153g2 = c28655q10.m87153g(obj3);
                    objM87133R11 = c28655q10.m87133R();
                    if (zM87153g2 || objM87133R11 == obj) {
                        arrayList2 = new ArrayList();
                        for (Object obj5 : (Iterable) obj3) {
                            if (((C37035f) obj5).getIncluded()) {
                                arrayList2.add(obj5);
                            }
                        }
                        objM87133R11 = AbstractC25265s.m74152u1(arrayList2, new f());
                        c28655q10.m87172p0(objM87133R11);
                    }
                    list = (List) objM87133R11;
                    zM87153g3 = c28655q10.m87153g(obj3);
                    objM87133R12 = c28655q10.m87133R();
                    if (zM87153g3 || objM87133R12 == obj) {
                        arrayList3 = new ArrayList();
                        for (Object obj6 : (Iterable) obj3) {
                            if (!((C37035f) obj6).getIncluded()) {
                                arrayList3.add(obj6);
                            }
                        }
                        objM87133R12 = AbstractC25265s.m74152u1(arrayList3, new g());
                        c28655q10.m87172p0(objM87133R12);
                    }
                    list2 = (List) objM87133R12;
                    zM87153g4 = c28655q10.m87153g(viewState.m118888i());
                    objM87133R13 = c28655q10.m87133R();
                    if (zM87153g4 || objM87133R13 == obj) {
                        listM118888i = viewState.m118888i();
                        if (!(listM118888i instanceof Collection) && listM118888i.isEmpty()) {
                            z13 = true;
                            break;
                        }
                        it = listM118888i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C37035f) it.next()).getIncluded()) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                        objM87133R13 = Boolean.valueOf(z13);
                        c28655q10.m87172p0(objM87133R13);
                    }
                    zBooleanValue = ((Boolean) objM87133R13).booleanValue();
                    if (m125685V0(interfaceC28601c2)) {
                        c28655q10.m87150e0(-776385634);
                        C37034e c37034eM118886g = viewState.getExitDialog();
                        if ((i29 & 112) == 32) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        objM87133R29 = c28655q10.m87133R();
                        if (!z36 || objM87133R29 == obj) {
                            interfaceC28601c9 = interfaceC28601c2;
                            objM87133R29 = new C29308g(function7, interfaceC28601c9, 10);
                            c28655q10.m87172p0(objM87133R29);
                        } else {
                            interfaceC28601c9 = interfaceC28601c2;
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R29;
                        objM87133R30 = c28655q10.m87133R();
                        if (objM87133R30 == obj) {
                            objM87133R30 = new C35429g(19, interfaceC28601c9);
                            c28655q10.m87172p0(objM87133R30);
                        }
                        m125702c1(c37034eM118886g, interfaceC4339a2, (InterfaceC4339a) objM87133R30, c28655q10, C27238a0.f109008k | 384);
                        c28655q10.m87173q(false);
                    } else {
                        interfaceC28601c8 = interfaceC28601c8;
                        interfaceC28601c9 = interfaceC28601c2;
                        c28655q10.m87150e0(-776066582);
                        c28655q10.m87173q(false);
                    }
                    if (m125689X0(interfaceC28601c3)) {
                        c28655q10.m87150e0(-776028390);
                        C37034e c37034eM118885f = viewState.getDeleteDialog();
                        if ((i29 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        objM87133R27 = c28655q10.m87133R();
                        if (!z35 || objM87133R27 == obj) {
                            interfaceC28601c21 = interfaceC28601c3;
                            objM87133R27 = new C29308g(function8, interfaceC28601c21, 11);
                            c28655q10.m87172p0(objM87133R27);
                        } else {
                            interfaceC28601c21 = interfaceC28601c3;
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R27;
                        objM87133R28 = c28655q10.m87133R();
                        if (objM87133R28 == obj) {
                            objM87133R28 = new C35429g(20, interfaceC28601c21);
                            c28655q10.m87172p0(objM87133R28);
                        }
                        interfaceC28601c10 = interfaceC28601c21;
                        c3 = ' ';
                        interfaceC28601c11 = interfaceC28601c9;
                        m125691Y0(c37034eM118885f, interfaceC4339a3, (InterfaceC4339a) objM87133R28, null, c28655q10, C27238a0.f109008k | 384, 8);
                        z14 = false;
                        c28655q10.m87173q(false);
                    } else {
                        interfaceC28601c10 = interfaceC28601c3;
                        function7 = function7;
                        interfaceC28601c11 = interfaceC28601c9;
                        z14 = false;
                        c3 = ' ';
                        c28655q10.m87150e0(-775705494);
                        c28655q10.m87173q(false);
                    }
                    if (m125752t0(interfaceC28601c4)) {
                        c28655q10.m87150e0(2053190383);
                        c37033dM118891l = viewState.getPendingDependencyWarning();
                        if (c37033dM118891l == null) {
                            c28655q10.m87150e0(-775607566);
                            c28655q10.m87173q(z14);
                            interfaceC28601c12 = interfaceC28601c4;
                            c7 = 256;
                        } else {
                            c28655q10.m87150e0(-775607565);
                            if ((i29 & 896) == 256) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            zM87157i6 = c28655q10.m87157i(viewState) | z34;
                            objM87133R25 = c28655q10.m87133R();
                            if (!zM87157i6 || objM87133R25 == obj) {
                                interfaceC28601c20 = interfaceC28601c4;
                                objM87133R25 = new C31324k(function8, viewState, interfaceC28601c20, 24);
                                c28655q10.m87172p0(objM87133R25);
                            } else {
                                interfaceC28601c20 = interfaceC28601c4;
                            }
                            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R25;
                            objM87133R26 = c28655q10.m87133R();
                            if (objM87133R26 == obj) {
                                objM87133R26 = new C35429g(21, interfaceC28601c20);
                                c28655q10.m87172p0(objM87133R26);
                            }
                            c7 = 256;
                            interfaceC28601c12 = interfaceC28601c20;
                            m125696a1(c37033dM118891l, interfaceC4339a4, (InterfaceC4339a) objM87133R26, null, c28655q10, TextResource.$stable | 384, 8);
                            z14 = false;
                            c28655q10.m87173q(false);
                        }
                        c28655q10.m87173q(z14);
                    } else {
                        interfaceC28601c12 = interfaceC28601c4;
                        c7 = 256;
                        c28655q10.m87150e0(-775179734);
                        c28655q10.m87173q(z14);
                    }
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
                    if (viewState.getTestDeletedModal() != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R14 = c28655q10.m87133R();
                    if (objM87133R14 == obj) {
                        objM87133R14 = new C39211b(18);
                        c28655q10.m87172p0(objM87133R14);
                    }
                    Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM114675c, z15, (Function1) objM87133R14);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q10, 0);
                    iHashCode = Long.hashCode(c28655q10.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q10.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q10, modifierM44099b);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q10.m87158i0();
                    if (c28655q10.f115903S) {
                        c28655q10.m87163l(interfaceC4339a);
                    } else {
                        c28655q10.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q10, c0209i, c23010xM66775a);
                    C0209i c0209i4 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q10, c0209i4, interfaceC28653p1M87165m);
                    c0209i2 = C0217k.f732j;
                    if (c28655q10.f115903S) {
                        c0209i3 = c0209i;
                    } else {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q10.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q10, c0209i5, modifierM118962N);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        objM87133R15 = c28655q10.m87133R();
                        if (objM87133R15 == obj) {
                            objM87133R15 = new C35429g(22, interfaceC28601c11);
                            c28655q10.m87172p0(objM87133R15);
                        }
                        i17 = i29;
                        function9 = function8;
                        interfaceC28601c13 = interfaceC28601c7;
                        interfaceC28601c14 = interfaceC28601c8;
                        C0209i c0209i6 = c0209i3;
                        AbstractC6719b.m20143d(modifierM3409f, aVar, null, (InterfaceC4339a) objM87133R15, null, null, c28655q10, (AbstractC6721d.a.f25641r << 3) | 3078, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        float f13 = 8;
                        float f14 = 2 * f13;
                        Modifier modifierM3355a = AbstractC1091c.m3355a(AbstractC1099a.m3394p(f14, AbstractC30060g.m92116f0(AbstractC15674c.m44089m(new LayoutWeightElement(1.0f, true), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q10, 1), 14)), AbstractC11348f.m30574v(300, 0, null, 6), 2);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q10, 0);
                        iHashCode2 = Long.hashCode(c28655q10.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q10.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q10, modifierM3355a);
                        c28655q10.m87158i0();
                        if (c28655q10.f115903S) {
                            c28655q10.m87163l(interfaceC4339a);
                        } else {
                            c28655q10.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q10, c0209i6, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q10, c0209i4, interfaceC28653p1M87165m2);
                        if (c28655q10.f115903S || !AbstractC22676k.m65745e(c28655q10.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q10, c0209i5, modifierM118962N2);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, ((float) 0.5d) * f13, 0.0f, 0.0f, 0.0f, 14);
                        String strM118894o = viewState.getTitle();
                        c38072d = C38072d.f163053a;
                        i18 = C38072d.f163054b;
                        z16 = true;
                        AbstractC30795n.m94707h(strM118894o, modifierM3398t, c38072d.m121949b(c28655q10, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q10, i18).getT3(), null, c28655q10, 48, C2886a.f11498d << 18, 196600);
                        AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f14, c2314t));
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(m125645B0(interfaceC28601c1));
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                        objM87133R16 = c28655q10.m87133R();
                        if (objM87133R16 == obj) {
                            objM87133R16 = new C39382e(5, interfaceC28601c1);
                            c28655q10.m87172p0(objM87133R16);
                        }
                        Function1 function13 = (Function1) objM87133R16;
                        i19 = TextResource.$stable;
                        AbstractC17795v0.m51127j(null, textResourceM21278l, textResourceM21278l2, null, 0L, 0, false, null, 0L, false, null, false, false, null, function13, c28655q10, (i19 << 3) | (i19 << 6), 24576, 16377);
                        c28655q2 = c28655q10;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t));
                        if (list.isEmpty()) {
                            interfaceC28601c15 = interfaceC28601c14;
                            interfaceC28601c16 = interfaceC28601c13;
                            function10 = function9;
                            i24 = i17;
                            i25 = 256;
                            c28655q2.m87150e0(1518504022);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        } else {
                            c28655q2.m87150e0(1517296045);
                            AbstractC17755i2.m50938j(null, viewState.getIncludedItemsHeader().getDividerType(), viewState.getIncludedItemsHeader().getDividerTextPosition(), viewState.getIncludedItemsHeader().getTitle(), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, c28655q2, i19 << 9, 209);
                            c28655q9 = c28655q2;
                            for (C37035f c37035f : list) {
                                i28 = i17;
                                if ((i28 & 896) == 256) {
                                    z29 = z16;
                                } else {
                                    z29 = false;
                                }
                                objM87133R22 = c28655q9.m87133R();
                                if (!z29 || objM87133R22 == obj) {
                                    function12 = function9;
                                    objM87133R22 = new C37450h(function12, 17);
                                    c28655q9.m87172p0(objM87133R22);
                                } else {
                                    function12 = function9;
                                }
                                Function1 function14 = (Function1) objM87133R22;
                                objM87133R23 = c28655q9.m87133R();
                                if (objM87133R23 == obj) {
                                    interfaceC28601c18 = interfaceC28601c13;
                                    objM87133R23 = new C39382e(2, interfaceC28601c18);
                                    c28655q9.m87172p0(objM87133R23);
                                } else {
                                    interfaceC28601c18 = interfaceC28601c13;
                                }
                                Function1 function15 = (Function1) objM87133R23;
                                objM87133R24 = c28655q9.m87133R();
                                if (objM87133R24 == obj) {
                                    interfaceC28601c19 = interfaceC28601c14;
                                    objM87133R24 = new C39382e(3, interfaceC28601c19);
                                    c28655q9.m87172p0(objM87133R24);
                                } else {
                                    interfaceC28601c19 = interfaceC28601c14;
                                }
                                interfaceC28601c14 = interfaceC28601c19;
                                m125716h0(c37035f, function14, function15, (Function1) objM87133R24, c28655q9, 3456, 0);
                                i17 = i28;
                                interfaceC28601c13 = interfaceC28601c18;
                                function9 = function12;
                                z16 = true;
                            }
                            interfaceC28601c15 = interfaceC28601c14;
                            interfaceC28601c16 = interfaceC28601c13;
                            function10 = function9;
                            i24 = i17;
                            i25 = 256;
                            c28655q9.m87173q(false);
                            c28655q3 = c28655q9;
                        }
                        AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f14, c2314t));
                        if (list2.isEmpty()) {
                            function11 = function10;
                            z17 = false;
                            c28655q3.m87150e0(1520017814);
                            c28655q3.m87173q(false);
                            c28655q4 = c28655q3;
                        } else {
                            c28655q3.m87150e0(1518645506);
                            C28655q c28655q11 = c28655q3;
                            function11 = function10;
                            AbstractC17755i2.m50938j(null, viewState.getNotIncludedItemsHeader().getDividerType(), viewState.getNotIncludedItemsHeader().getDividerTextPosition(), viewState.getNotIncludedItemsHeader().getTitle(), null, C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite70(), 0L, null, c28655q11, TextResource.$stable << 9, 209);
                            c28655q8 = c28655q11;
                            for (C37035f c37035f2 : list2) {
                                boolean zM87157i7 = c28655q8.m87157i(c37035f2);
                                if ((i24 & 896) == i25) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                z28 = zM87157i7 | z27;
                                objM87133R20 = c28655q8.m87133R();
                                if (z28 || objM87133R20 == obj) {
                                    objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                                    c28655q8.m87172p0(objM87133R20);
                                }
                                Function1 function16 = (Function1) objM87133R20;
                                objM87133R21 = c28655q8.m87133R();
                                if (objM87133R21 == obj) {
                                    objM87133R21 = new C39382e(4, interfaceC28601c15);
                                    c28655q8.m87172p0(objM87133R21);
                                }
                                m125716h0(c37035f2, function16, null, (Function1) objM87133R21, c28655q8, 3072, 4);
                            }
                            z17 = false;
                            c28655q8.m87173q(false);
                            c28655q4 = c28655q8;
                        }
                        c28655q4.m87173q(true);
                        z18 = z17;
                        C27238a0 c27238a0M118882c = viewState.getButton();
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f14, AbstractC1102d.m3409f(1.0f, c2314t)), "save_button");
                        boolean zM87155h = c28655q4.m87155h(zBooleanValue) | c28655q4.m87157i(viewState);
                        i26 = i24 & 896;
                        if (i26 == i25) {
                            z19 = true;
                        } else {
                            z19 = z18;
                        }
                        z24 = zM87155h | z19;
                        Object objM87133R34 = c28655q4.m87133R();
                        if (!z24 || objM87133R34 == obj) {
                            Function1 function17 = function11;
                            c4660x0 = new C4660x0(3, viewState, function17, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                            function11 = function17;
                            c28655q4.m87172p0(c4660x0);
                        } else {
                            c4660x0 = objM87133R34;
                        }
                        i27 = C27238a0.f109008k;
                        interfaceC28601c17 = interfaceC28601c16;
                        c15199y5 = c15199y3;
                        InterfaceC28601c1 interfaceC28601c22 = interfaceC28601c15;
                        AbstractC27292z.m82341h(c27238a0M118882c, modifierM3599a, null, (InterfaceC4339a) c4660x0, c28655q4, i27 | 48, 4);
                        c28655q4.m87173q(true);
                        c37035fM125758v0 = m125758v0(interfaceC28601c17);
                        if (c37035fM125758v0 == null) {
                            c28655q4.m87150e0(-769722278);
                            c28655q4.m87173q(z18);
                            c28655q5 = c28655q4;
                        } else {
                            c28655q4.m87150e0(-769722277);
                            C27238a0 c27238a0M118881b = viewState.getBottomSheetButton();
                            AbstractC35664f.a aVar2 = new AbstractC35664f.a(c15199y5);
                            boolean zM118895p = viewState.getIsAiConfirmation();
                            objM87133R17 = c28655q4.m87133R();
                            if (objM87133R17 == obj) {
                                objM87133R17 = new C35429g(17, interfaceC28601c17);
                                c28655q4.m87172p0(objM87133R17);
                            }
                            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R17;
                            if (i26 == 256) {
                                z25 = true;
                            } else {
                                z25 = z18;
                            }
                            zM87157i5 = z25 | c28655q4.m87157i(c37035fM125758v0);
                            objM87133R18 = c28655q4.m87133R();
                            if (zM87157i5 || objM87133R18 == obj) {
                                objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                                c28655q4.m87172p0(objM87133R18);
                            }
                            C28655q c28655q12 = c28655q4;
                            AbstractC39384g.m125633r(null, c37035fM125758v0, c27238a0M118881b, aVar2, zM118895p, interfaceC4339a5, (InterfaceC4351m) objM87133R18, c28655q12, (i27 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (AbstractC35664f.a.f151587c << 9), 1);
                            C28655q c28655q13 = c28655q12;
                            c28655q13.m87173q(z18);
                            c28655q5 = c28655q13;
                        }
                        c37035fM125762x0 = m125762x0(interfaceC28601c22);
                        if (c37035fM125762x0 == null) {
                            c28655q5.m87150e0(-769079059);
                            c28655q5.m87173q(z18);
                            c28655q7 = c28655q5;
                        } else {
                            c28655q5.m87150e0(-769079058);
                            if (viewState.getCalculationEducationTitle() != null || viewState.getCalculationEducationDescription() == null) {
                                c28655q5.m87150e0(1634809784);
                                c28655q5.m87173q(z18);
                                c28655q6 = c28655q5;
                            } else {
                                c28655q5.m87150e0(1634359075);
                                String strM118853b2 = c37035fM125762x0.getBiomarkerName();
                                String strM118884e = viewState.getCalculationEducationTitle();
                                String strM118883d = viewState.getCalculationEducationDescription();
                                AbstractC35664f.a aVar3 = new AbstractC35664f.a(c15199y4);
                                Object objM87133R35 = c28655q5.m87133R();
                                if (objM87133R35 == obj) {
                                    objM87133R35 = new C35429g(18, interfaceC28601c22);
                                    c28655q5.m87172p0(objM87133R35);
                                }
                                C28655q c28655q14 = c28655q5;
                                m125698b0(strM118853b2, strM118884e, strM118883d, aVar3, (InterfaceC4339a) objM87133R35, null, c28655q14, (AbstractC35664f.a.f151587c << 9) | 24576, 32);
                                C28655q c28655q15 = c28655q14;
                                c28655q15.m87173q(z18);
                                c28655q6 = c28655q15;
                            }
                            c28655q6.m87173q(z18);
                            c28655q7 = c28655q6;
                        }
                        c37039jM118893n = viewState.getTestDeletedModal();
                        if (c37039jM118893n == null) {
                            c28655q7.m87150e0(-768459927);
                            c28655q7.m87173q(z18);
                        } else {
                            c28655q7.m87150e0(-768459926);
                            if ((i24 & 112) == 32) {
                                z26 = true;
                            } else {
                                z26 = z18;
                            }
                            objM87133R19 = c28655q7.m87133R();
                            if (z26 || objM87133R19 == obj) {
                                objM87133R19 = new C36681f(function7, 26);
                                c28655q7.m87172p0(objM87133R19);
                            }
                            m125738o1(c37039jM118893n, (InterfaceC4339a) objM87133R19, c28655q7, i27);
                            c28655q7.m87173q(z18);
                        }
                        function6 = function11;
                        function5 = function7;
                        c28655q = c28655q7;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q10, iHashCode, c0209i2);
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q10, c0209i7, modifierM118962N);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    AbstractC6721d.a aVar4 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    objM87133R15 = c28655q10.m87133R();
                    if (objM87133R15 == obj) {
                        objM87133R15 = new C35429g(22, interfaceC28601c11);
                        c28655q10.m87172p0(objM87133R15);
                    }
                    i17 = i29;
                    function9 = function8;
                    interfaceC28601c13 = interfaceC28601c7;
                    interfaceC28601c14 = interfaceC28601c8;
                    C0209i c0209i8 = c0209i3;
                    AbstractC6719b.m20143d(modifierM3409f2, aVar4, null, (InterfaceC4339a) objM87133R15, null, null, c28655q10, (AbstractC6721d.a.f25641r << 3) | 3078, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    float f15 = 8;
                    float f16 = 2 * f15;
                    Modifier modifierM3355a2 = AbstractC1091c.m3355a(AbstractC1099a.m3394p(f16, AbstractC30060g.m92116f0(AbstractC15674c.m44089m(new LayoutWeightElement(1.0f, true), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q10, 1), 14)), AbstractC11348f.m30574v(300, 0, null, 6), 2);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q10, 0);
                    iHashCode2 = Long.hashCode(c28655q10.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q10.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q10, modifierM3355a2);
                    c28655q10.m87158i0();
                    if (c28655q10.f115903S) {
                        c28655q10.m87163l(interfaceC4339a);
                    } else {
                        c28655q10.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q10, c0209i8, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q10, c0209i4, interfaceC28653p1M87165m3);
                    if (c28655q10.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q10, c0209i7, modifierM118962N3);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, ((float) 0.5d) * f15, 0.0f, 0.0f, 0.0f, 14);
                    String strM118894o2 = viewState.getTitle();
                    c38072d = C38072d.f163053a;
                    i18 = C38072d.f163054b;
                    z16 = true;
                    AbstractC30795n.m94707h(strM118894o2, modifierM3398t2, c38072d.m121949b(c28655q10, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q10, i18).getT3(), null, c28655q10, 48, C2886a.f11498d << 18, 196600);
                    AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f16, c2314t));
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m125645B0(interfaceC28601c1));
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                    objM87133R16 = c28655q10.m87133R();
                    if (objM87133R16 == obj) {
                        objM87133R16 = new C39382e(5, interfaceC28601c1);
                        c28655q10.m87172p0(objM87133R16);
                    }
                    Function1 function18 = (Function1) objM87133R16;
                    i19 = TextResource.$stable;
                    AbstractC17795v0.m51127j(null, textResourceM21278l3, textResourceM21278l4, null, 0L, 0, false, null, 0L, false, null, false, false, null, function18, c28655q10, (i19 << 3) | (i19 << 6), 24576, 16377);
                    c28655q2 = c28655q10;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f16, c2314t));
                    if (list.isEmpty()) {
                        c28655q2.m87150e0(1517296045);
                        AbstractC17755i2.m50938j(null, viewState.getIncludedItemsHeader().getDividerType(), viewState.getIncludedItemsHeader().getDividerTextPosition(), viewState.getIncludedItemsHeader().getTitle(), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, c28655q2, i19 << 9, 209);
                        c28655q9 = c28655q2;
                        while (r1.hasNext()) {
                            i28 = i17;
                            if ((i28 & 896) == 256) {
                                z29 = z16;
                            } else {
                                z29 = false;
                            }
                            objM87133R22 = c28655q9.m87133R();
                            if (z29) {
                                function12 = function9;
                                objM87133R22 = new C37450h(function12, 17);
                                c28655q9.m87172p0(objM87133R22);
                            } else {
                                function12 = function9;
                                objM87133R22 = new C37450h(function12, 17);
                                c28655q9.m87172p0(objM87133R22);
                            }
                            Function1 function19 = (Function1) objM87133R22;
                            objM87133R23 = c28655q9.m87133R();
                            if (objM87133R23 == obj) {
                                interfaceC28601c18 = interfaceC28601c13;
                                objM87133R23 = new C39382e(2, interfaceC28601c18);
                                c28655q9.m87172p0(objM87133R23);
                            } else {
                                interfaceC28601c18 = interfaceC28601c13;
                            }
                            Function1 function110 = (Function1) objM87133R23;
                            objM87133R24 = c28655q9.m87133R();
                            if (objM87133R24 == obj) {
                                interfaceC28601c19 = interfaceC28601c14;
                                objM87133R24 = new C39382e(3, interfaceC28601c19);
                                c28655q9.m87172p0(objM87133R24);
                            } else {
                                interfaceC28601c19 = interfaceC28601c14;
                            }
                            interfaceC28601c14 = interfaceC28601c19;
                            m125716h0(c37035f, function19, function110, (Function1) objM87133R24, c28655q9, 3456, 0);
                            i17 = i28;
                            interfaceC28601c13 = interfaceC28601c18;
                            function9 = function12;
                            z16 = true;
                        }
                        interfaceC28601c15 = interfaceC28601c14;
                        interfaceC28601c16 = interfaceC28601c13;
                        function10 = function9;
                        i24 = i17;
                        i25 = 256;
                        c28655q9.m87173q(false);
                        c28655q3 = c28655q9;
                    } else {
                        interfaceC28601c15 = interfaceC28601c14;
                        interfaceC28601c16 = interfaceC28601c13;
                        function10 = function9;
                        i24 = i17;
                        i25 = 256;
                        c28655q2.m87150e0(1518504022);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f16, c2314t));
                    if (list2.isEmpty()) {
                        c28655q3.m87150e0(1518645506);
                        C28655q c28655q16 = c28655q3;
                        function11 = function10;
                        AbstractC17755i2.m50938j(null, viewState.getNotIncludedItemsHeader().getDividerType(), viewState.getNotIncludedItemsHeader().getDividerTextPosition(), viewState.getNotIncludedItemsHeader().getTitle(), null, C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite70(), 0L, null, c28655q16, TextResource.$stable << 9, 209);
                        c28655q8 = c28655q16;
                        while (r15.hasNext()) {
                            boolean zM87157i8 = c28655q8.m87157i(c37035f2);
                            if ((i24 & 896) == i25) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            z28 = zM87157i8 | z27;
                            objM87133R20 = c28655q8.m87133R();
                            if (z28) {
                                objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                                c28655q8.m87172p0(objM87133R20);
                            } else {
                                objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                                c28655q8.m87172p0(objM87133R20);
                            }
                            Function1 function111 = (Function1) objM87133R20;
                            objM87133R21 = c28655q8.m87133R();
                            if (objM87133R21 == obj) {
                                objM87133R21 = new C39382e(4, interfaceC28601c15);
                                c28655q8.m87172p0(objM87133R21);
                            }
                            m125716h0(c37035f2, function111, null, (Function1) objM87133R21, c28655q8, 3072, 4);
                        }
                        z17 = false;
                        c28655q8.m87173q(false);
                        c28655q4 = c28655q8;
                    } else {
                        function11 = function10;
                        z17 = false;
                        c28655q3.m87150e0(1520017814);
                        c28655q3.m87173q(false);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(true);
                    z18 = z17;
                    C27238a0 c27238a0M118882c2 = viewState.getButton();
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f16, AbstractC1102d.m3409f(1.0f, c2314t)), "save_button");
                    boolean zM87155h2 = c28655q4.m87155h(zBooleanValue) | c28655q4.m87157i(viewState);
                    i26 = i24 & 896;
                    if (i26 == i25) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    z24 = zM87155h2 | z19;
                    Object objM87133R36 = c28655q4.m87133R();
                    if (z24) {
                        Function1 function112 = function11;
                        c4660x0 = new C4660x0(3, viewState, function112, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                        function11 = function112;
                        c28655q4.m87172p0(c4660x0);
                    } else {
                        Function1 function113 = function11;
                        c4660x0 = new C4660x0(3, viewState, function113, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                        function11 = function113;
                        c28655q4.m87172p0(c4660x0);
                    }
                    i27 = C27238a0.f109008k;
                    interfaceC28601c17 = interfaceC28601c16;
                    c15199y5 = c15199y3;
                    InterfaceC28601c1 interfaceC28601c23 = interfaceC28601c15;
                    AbstractC27292z.m82341h(c27238a0M118882c2, modifierM3599a2, null, (InterfaceC4339a) c4660x0, c28655q4, i27 | 48, 4);
                    c28655q4.m87173q(true);
                    c37035fM125758v0 = m125758v0(interfaceC28601c17);
                    if (c37035fM125758v0 == null) {
                        c28655q4.m87150e0(-769722278);
                        c28655q4.m87173q(z18);
                        c28655q5 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-769722277);
                        C27238a0 c27238a0M118881b2 = viewState.getBottomSheetButton();
                        AbstractC35664f.a aVar5 = new AbstractC35664f.a(c15199y5);
                        boolean zM118895p2 = viewState.getIsAiConfirmation();
                        objM87133R17 = c28655q4.m87133R();
                        if (objM87133R17 == obj) {
                            objM87133R17 = new C35429g(17, interfaceC28601c17);
                            c28655q4.m87172p0(objM87133R17);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R17;
                        if (i26 == 256) {
                            z25 = true;
                        } else {
                            z25 = z18;
                        }
                        zM87157i5 = z25 | c28655q4.m87157i(c37035fM125758v0);
                        objM87133R18 = c28655q4.m87133R();
                        if (zM87157i5) {
                            objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                            c28655q4.m87172p0(objM87133R18);
                        } else {
                            objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                            c28655q4.m87172p0(objM87133R18);
                        }
                        C28655q c28655q17 = c28655q4;
                        AbstractC39384g.m125633r(null, c37035fM125758v0, c27238a0M118881b2, aVar5, zM118895p2, interfaceC4339a6, (InterfaceC4351m) objM87133R18, c28655q17, (i27 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (AbstractC35664f.a.f151587c << 9), 1);
                        C28655q c28655q18 = c28655q17;
                        c28655q18.m87173q(z18);
                        c28655q5 = c28655q18;
                    }
                    c37035fM125762x0 = m125762x0(interfaceC28601c23);
                    if (c37035fM125762x0 == null) {
                        c28655q5.m87150e0(-769079059);
                        c28655q5.m87173q(z18);
                        c28655q7 = c28655q5;
                    } else {
                        c28655q5.m87150e0(-769079058);
                        if (viewState.getCalculationEducationTitle() != null) {
                            c28655q5.m87150e0(1634809784);
                            c28655q5.m87173q(z18);
                            c28655q6 = c28655q5;
                        } else {
                            c28655q5.m87150e0(1634809784);
                            c28655q5.m87173q(z18);
                            c28655q6 = c28655q5;
                        }
                        c28655q6.m87173q(z18);
                        c28655q7 = c28655q6;
                    }
                    c37039jM118893n = viewState.getTestDeletedModal();
                    if (c37039jM118893n == null) {
                        c28655q7.m87150e0(-768459927);
                        c28655q7.m87173q(z18);
                    } else {
                        c28655q7.m87150e0(-768459926);
                        if ((i24 & 112) == 32) {
                            z26 = true;
                        } else {
                            z26 = z18;
                        }
                        objM87133R19 = c28655q7.m87133R();
                        if (z26) {
                            objM87133R19 = new C36681f(function7, 26);
                            c28655q7.m87172p0(objM87133R19);
                        } else {
                            objM87133R19 = new C36681f(function7, 26);
                            c28655q7.m87172p0(objM87133R19);
                        }
                        m125738o1(c37039jM118893n, (InterfaceC4339a) objM87133R19, c28655q7, i27);
                        c28655q7.m87173q(z18);
                    }
                    function6 = function11;
                    function5 = function7;
                    c28655q = c28655q7;
                } else {
                    c28655q10.m87138X();
                    function5 = function3;
                    function6 = function4;
                    c28655q = c28655q10;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C37526f(viewState, function5, function6, i13, i14, 21);
                }
            }
            i29 |= 384;
            function4 = function2;
            if ((i29 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q10.m87135U(i29 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R32 = c28655q10.m87133R();
                    if (objM87133R32 == obj) {
                        objM87133R32 = new C39211b(24);
                        c28655q10.m87172p0(objM87133R32);
                    }
                    function7 = (Function1) objM87133R32;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    objM87133R31 = c28655q10.m87133R();
                    if (objM87133R31 == obj) {
                        objM87133R31 = new C39211b(16);
                        c28655q10.m87172p0(objM87133R31);
                    }
                    function8 = (Function1) objM87133R31;
                } else {
                    function8 = function4;
                }
                objM87133R = c28655q10.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q10.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q10.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q10.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q10.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q10.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q10.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q10.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q10.m87133R();
                if (objM87133R5 == obj) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q10.m87172p0(objM87133R5);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q10.m87133R();
                if (objM87133R6 == obj) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q10.m87172p0(objM87133R6);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                EnumC15209z3 enumC15209z4 = EnumC15209z3.f57106w;
                c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z4, null, null, true, c28655q10, 3078, 6);
                c15199y3M3460c2 = AbstractC1118c.m3460c(enumC15209z4, null, null, true, c28655q10, 3078, 6);
                C37035f c37035fM125758v2 = m125758v0(interfaceC28601c5);
                zM87157i = c28655q10.m87157i(c15199y3M3460c);
                objM87133R7 = c28655q10.m87133R();
                if (zM87157i) {
                    interfaceC28601c7 = interfaceC28601c5;
                    objM87133R7 = new b(c15199y3M3460c, interfaceC28601c7, null);
                    c28655q10.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c7 = interfaceC28601c5;
                    objM87133R7 = new b(c15199y3M3460c, interfaceC28601c7, null);
                    c28655q10.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R7, c37035fM125758v2);
                EnumC15209z3 enumC15209z3M43221b3 = c15199y3M3460c.m43221b();
                zM87157i2 = c28655q10.m87157i(c15199y3M3460c);
                objM87133R8 = c28655q10.m87133R();
                if (zM87157i2) {
                    objM87133R8 = new c(c15199y3M3460c, interfaceC28601c7, null);
                    c28655q10.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new c(c15199y3M3460c, interfaceC28601c7, null);
                    c28655q10.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R8, enumC15209z3M43221b3);
                C37035f c37035fM125762x2 = m125762x0(interfaceC28601c6);
                zM87157i3 = c28655q10.m87157i(c15199y3M3460c2);
                objM87133R9 = c28655q10.m87133R();
                if (zM87157i3) {
                    interfaceC28601c8 = interfaceC28601c6;
                    objM87133R9 = new d(c15199y3M3460c2, interfaceC28601c8, null);
                    c28655q10.m87172p0(objM87133R9);
                } else {
                    interfaceC28601c8 = interfaceC28601c6;
                    objM87133R9 = new d(c15199y3M3460c2, interfaceC28601c8, null);
                    c28655q10.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R9, c37035fM125762x2);
                EnumC15209z3 enumC15209z3M43221b4 = c15199y3M3460c2.m43221b();
                zM87157i4 = c28655q10.m87157i(c15199y3M3460c2);
                objM87133R10 = c28655q10.m87133R();
                if (zM87157i4) {
                    objM87133R10 = new e(c15199y3M3460c2, interfaceC28601c8, null);
                    c28655q10.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new e(c15199y3M3460c2, interfaceC28601c8, null);
                    c28655q10.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R10, enumC15209z3M43221b4);
                zM87153g = c28655q10.m87153g(viewState.m118888i()) | c28655q10.m87153g(m125645B0(interfaceC28601c1));
                Object objM87133R37 = c28655q10.m87133R();
                if (zM87153g) {
                    if (AbstractC39414r.m125890i0(m125645B0(interfaceC28601c1))) {
                        arrayList = viewState.m118888i();
                    } else {
                        List<C37035f> listM118888i3 = viewState.m118888i();
                        arrayList = new ArrayList();
                        while (r9.hasNext()) {
                            String strM118853b3 = ((C37035f) obj4).getBiomarkerName();
                            C15199y3 c15199y8 = c15199y3M3460c;
                            Locale locale2 = Locale.ROOT;
                            upperCase = strM118853b3.toUpperCase(locale2);
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            C15199y3 c15199y9 = c15199y3M3460c2;
                            upperCase2 = m125645B0(interfaceC28601c1).toUpperCase(locale2);
                            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                            if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                arrayList.add(obj4);
                            }
                            c15199y3M3460c2 = c15199y9;
                            c15199y3M3460c = c15199y8;
                        }
                    }
                    c15199y3 = c15199y3M3460c;
                    c15199y4 = c15199y3M3460c2;
                    c28655q10.m87172p0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (AbstractC39414r.m125890i0(m125645B0(interfaceC28601c1))) {
                        arrayList = viewState.m118888i();
                    } else {
                        List<C37035f> listM118888i4 = viewState.m118888i();
                        arrayList = new ArrayList();
                        while (r9.hasNext()) {
                            String strM118853b4 = ((C37035f) obj4).getBiomarkerName();
                            C15199y3 c15199y10 = c15199y3M3460c;
                            Locale locale3 = Locale.ROOT;
                            upperCase = strM118853b4.toUpperCase(locale3);
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            C15199y3 c15199y11 = c15199y3M3460c2;
                            upperCase2 = m125645B0(interfaceC28601c1).toUpperCase(locale3);
                            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                            if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                arrayList.add(obj4);
                            }
                            c15199y3M3460c2 = c15199y11;
                            c15199y3M3460c = c15199y10;
                        }
                    }
                    c15199y3 = c15199y3M3460c;
                    c15199y4 = c15199y3M3460c2;
                    c28655q10.m87172p0(arrayList);
                    obj2 = arrayList;
                }
                obj3 = (List) obj2;
                zM87153g2 = c28655q10.m87153g(obj3);
                objM87133R11 = c28655q10.m87133R();
                if (zM87153g2) {
                    arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                        if (((C37035f) obj5).getIncluded()) {
                            arrayList2.add(obj5);
                        }
                    }
                    objM87133R11 = AbstractC25265s.m74152u1(arrayList2, new f());
                    c28655q10.m87172p0(objM87133R11);
                } else {
                    arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                        if (((C37035f) obj5).getIncluded()) {
                            arrayList2.add(obj5);
                        }
                    }
                    objM87133R11 = AbstractC25265s.m74152u1(arrayList2, new f());
                    c28655q10.m87172p0(objM87133R11);
                }
                list = (List) objM87133R11;
                zM87153g3 = c28655q10.m87153g(obj3);
                objM87133R12 = c28655q10.m87133R();
                if (zM87153g3) {
                    arrayList3 = new ArrayList();
                    while (r7.hasNext()) {
                        if (!((C37035f) obj6).getIncluded()) {
                            arrayList3.add(obj6);
                        }
                    }
                    objM87133R12 = AbstractC25265s.m74152u1(arrayList3, new g());
                    c28655q10.m87172p0(objM87133R12);
                } else {
                    arrayList3 = new ArrayList();
                    while (r7.hasNext()) {
                        if (!((C37035f) obj6).getIncluded()) {
                            arrayList3.add(obj6);
                        }
                    }
                    objM87133R12 = AbstractC25265s.m74152u1(arrayList3, new g());
                    c28655q10.m87172p0(objM87133R12);
                }
                list2 = (List) objM87133R12;
                zM87153g4 = c28655q10.m87153g(viewState.m118888i());
                objM87133R13 = c28655q10.m87133R();
                if (zM87153g4) {
                    listM118888i = viewState.m118888i();
                    if (!(listM118888i instanceof Collection)) {
                        it = listM118888i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C37035f) it.next()).getIncluded()) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                    } else {
                        it = listM118888i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C37035f) it.next()).getIncluded()) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                    }
                    objM87133R13 = Boolean.valueOf(z13);
                    c28655q10.m87172p0(objM87133R13);
                } else {
                    listM118888i = viewState.m118888i();
                    if (!(listM118888i instanceof Collection)) {
                        it = listM118888i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C37035f) it.next()).getIncluded()) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                    } else {
                        it = listM118888i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C37035f) it.next()).getIncluded()) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                    }
                    objM87133R13 = Boolean.valueOf(z13);
                    c28655q10.m87172p0(objM87133R13);
                }
                zBooleanValue = ((Boolean) objM87133R13).booleanValue();
                if (m125685V0(interfaceC28601c2)) {
                    c28655q10.m87150e0(-776385634);
                    C37034e c37034eM118886g2 = viewState.getExitDialog();
                    if ((i29 & 112) == 32) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    objM87133R29 = c28655q10.m87133R();
                    if (z36) {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM87133R29 = new C29308g(function7, interfaceC28601c9, 10);
                        c28655q10.m87172p0(objM87133R29);
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM87133R29 = new C29308g(function7, interfaceC28601c9, 10);
                        c28655q10.m87172p0(objM87133R29);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R29;
                    objM87133R30 = c28655q10.m87133R();
                    if (objM87133R30 == obj) {
                        objM87133R30 = new C35429g(19, interfaceC28601c9);
                        c28655q10.m87172p0(objM87133R30);
                    }
                    m125702c1(c37034eM118886g2, interfaceC4339a7, (InterfaceC4339a) objM87133R30, c28655q10, C27238a0.f109008k | 384);
                    c28655q10.m87173q(false);
                } else {
                    interfaceC28601c8 = interfaceC28601c8;
                    interfaceC28601c9 = interfaceC28601c2;
                    c28655q10.m87150e0(-776066582);
                    c28655q10.m87173q(false);
                }
                if (m125689X0(interfaceC28601c3)) {
                    c28655q10.m87150e0(-776028390);
                    C37034e c37034eM118885f2 = viewState.getDeleteDialog();
                    if ((i29 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objM87133R27 = c28655q10.m87133R();
                    if (z35) {
                        interfaceC28601c21 = interfaceC28601c3;
                        objM87133R27 = new C29308g(function8, interfaceC28601c21, 11);
                        c28655q10.m87172p0(objM87133R27);
                    } else {
                        interfaceC28601c21 = interfaceC28601c3;
                        objM87133R27 = new C29308g(function8, interfaceC28601c21, 11);
                        c28655q10.m87172p0(objM87133R27);
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R27;
                    objM87133R28 = c28655q10.m87133R();
                    if (objM87133R28 == obj) {
                        objM87133R28 = new C35429g(20, interfaceC28601c21);
                        c28655q10.m87172p0(objM87133R28);
                    }
                    interfaceC28601c10 = interfaceC28601c21;
                    c3 = ' ';
                    interfaceC28601c11 = interfaceC28601c9;
                    m125691Y0(c37034eM118885f2, interfaceC4339a8, (InterfaceC4339a) objM87133R28, null, c28655q10, C27238a0.f109008k | 384, 8);
                    z14 = false;
                    c28655q10.m87173q(false);
                } else {
                    interfaceC28601c10 = interfaceC28601c3;
                    function7 = function7;
                    interfaceC28601c11 = interfaceC28601c9;
                    z14 = false;
                    c3 = ' ';
                    c28655q10.m87150e0(-775705494);
                    c28655q10.m87173q(false);
                }
                if (m125752t0(interfaceC28601c4)) {
                    c28655q10.m87150e0(2053190383);
                    c37033dM118891l = viewState.getPendingDependencyWarning();
                    if (c37033dM118891l == null) {
                        c28655q10.m87150e0(-775607566);
                        c28655q10.m87173q(z14);
                        interfaceC28601c12 = interfaceC28601c4;
                        c7 = 256;
                    } else {
                        c28655q10.m87150e0(-775607565);
                        if ((i29 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        zM87157i6 = c28655q10.m87157i(viewState) | z34;
                        objM87133R25 = c28655q10.m87133R();
                        if (zM87157i6) {
                            interfaceC28601c20 = interfaceC28601c4;
                            objM87133R25 = new C31324k(function8, viewState, interfaceC28601c20, 24);
                            c28655q10.m87172p0(objM87133R25);
                        } else {
                            interfaceC28601c20 = interfaceC28601c4;
                            objM87133R25 = new C31324k(function8, viewState, interfaceC28601c20, 24);
                            c28655q10.m87172p0(objM87133R25);
                        }
                        InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R25;
                        objM87133R26 = c28655q10.m87133R();
                        if (objM87133R26 == obj) {
                            objM87133R26 = new C35429g(21, interfaceC28601c20);
                            c28655q10.m87172p0(objM87133R26);
                        }
                        c7 = 256;
                        interfaceC28601c12 = interfaceC28601c20;
                        m125696a1(c37033dM118891l, interfaceC4339a9, (InterfaceC4339a) objM87133R26, null, c28655q10, TextResource.$stable | 384, 8);
                        z14 = false;
                        c28655q10.m87173q(false);
                    }
                    c28655q10.m87173q(z14);
                } else {
                    interfaceC28601c12 = interfaceC28601c4;
                    c7 = 256;
                    c28655q10.m87150e0(-775179734);
                    c28655q10.m87173q(z14);
                }
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM114675c2 = AbstractC36095b.m114675c(c2314t2, 1.0f);
                if (viewState.getTestDeletedModal() != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R14 = c28655q10.m87133R();
                if (objM87133R14 == obj) {
                    objM87133R14 = new C39211b(18);
                    c28655q10.m87172p0(objM87133R14);
                }
                Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM114675c2, z15, (Function1) objM87133R14);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q10, 0);
                iHashCode = Long.hashCode(c28655q10.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q10.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q10, modifierM44099b2);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q10.m87158i0();
                if (c28655q10.f115903S) {
                    c28655q10.m87163l(interfaceC4339a);
                } else {
                    c28655q10.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q10, c0209i, c23010xM66775a4);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q10, c0209i9, interfaceC28653p1M87165m4);
                c0209i2 = C0217k.f732j;
                if (c28655q10.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q10.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q10, c0209i10, modifierM118962N4);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    AbstractC6721d.a aVar6 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    objM87133R15 = c28655q10.m87133R();
                    if (objM87133R15 == obj) {
                        objM87133R15 = new C35429g(22, interfaceC28601c11);
                        c28655q10.m87172p0(objM87133R15);
                    }
                    i17 = i29;
                    function9 = function8;
                    interfaceC28601c13 = interfaceC28601c7;
                    interfaceC28601c14 = interfaceC28601c8;
                    C0209i c0209i11 = c0209i3;
                    AbstractC6719b.m20143d(modifierM3409f3, aVar6, null, (InterfaceC4339a) objM87133R15, null, null, c28655q10, (AbstractC6721d.a.f25641r << 3) | 3078, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    float f17 = 8;
                    float f18 = 2 * f17;
                    Modifier modifierM3355a3 = AbstractC1091c.m3355a(AbstractC1099a.m3394p(f18, AbstractC30060g.m92116f0(AbstractC15674c.m44089m(new LayoutWeightElement(1.0f, true), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q10, 1), 14)), AbstractC11348f.m30574v(300, 0, null, 6), 2);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q10, 0);
                    iHashCode2 = Long.hashCode(c28655q10.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q10.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q10, modifierM3355a3);
                    c28655q10.m87158i0();
                    if (c28655q10.f115903S) {
                        c28655q10.m87163l(interfaceC4339a);
                    } else {
                        c28655q10.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q10, c0209i11, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q10, c0209i9, interfaceC28653p1M87165m5);
                    if (c28655q10.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q10, c0209i10, modifierM118962N5);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t2, ((float) 0.5d) * f17, 0.0f, 0.0f, 0.0f, 14);
                    String strM118894o3 = viewState.getTitle();
                    c38072d = C38072d.f163053a;
                    i18 = C38072d.f163054b;
                    z16 = true;
                    AbstractC30795n.m94707h(strM118894o3, modifierM3398t3, c38072d.m121949b(c28655q10, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q10, i18).getT3(), null, c28655q10, 48, C2886a.f11498d << 18, 196600);
                    AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f18, c2314t2));
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m125645B0(interfaceC28601c1));
                    TextResource textResourceM21278l6 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                    objM87133R16 = c28655q10.m87133R();
                    if (objM87133R16 == obj) {
                        objM87133R16 = new C39382e(5, interfaceC28601c1);
                        c28655q10.m87172p0(objM87133R16);
                    }
                    Function1 function114 = (Function1) objM87133R16;
                    i19 = TextResource.$stable;
                    AbstractC17795v0.m51127j(null, textResourceM21278l5, textResourceM21278l6, null, 0L, 0, false, null, 0L, false, null, false, false, null, function114, c28655q10, (i19 << 3) | (i19 << 6), 24576, 16377);
                    c28655q2 = c28655q10;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f18, c2314t2));
                    if (list.isEmpty()) {
                        c28655q2.m87150e0(1517296045);
                        AbstractC17755i2.m50938j(null, viewState.getIncludedItemsHeader().getDividerType(), viewState.getIncludedItemsHeader().getDividerTextPosition(), viewState.getIncludedItemsHeader().getTitle(), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, c28655q2, i19 << 9, 209);
                        c28655q9 = c28655q2;
                        while (r1.hasNext()) {
                            i28 = i17;
                            if ((i28 & 896) == 256) {
                                z29 = z16;
                            } else {
                                z29 = false;
                            }
                            objM87133R22 = c28655q9.m87133R();
                            if (z29) {
                                function12 = function9;
                                objM87133R22 = new C37450h(function12, 17);
                                c28655q9.m87172p0(objM87133R22);
                            } else {
                                function12 = function9;
                                objM87133R22 = new C37450h(function12, 17);
                                c28655q9.m87172p0(objM87133R22);
                            }
                            Function1 function115 = (Function1) objM87133R22;
                            objM87133R23 = c28655q9.m87133R();
                            if (objM87133R23 == obj) {
                                interfaceC28601c18 = interfaceC28601c13;
                                objM87133R23 = new C39382e(2, interfaceC28601c18);
                                c28655q9.m87172p0(objM87133R23);
                            } else {
                                interfaceC28601c18 = interfaceC28601c13;
                            }
                            Function1 function116 = (Function1) objM87133R23;
                            objM87133R24 = c28655q9.m87133R();
                            if (objM87133R24 == obj) {
                                interfaceC28601c19 = interfaceC28601c14;
                                objM87133R24 = new C39382e(3, interfaceC28601c19);
                                c28655q9.m87172p0(objM87133R24);
                            } else {
                                interfaceC28601c19 = interfaceC28601c14;
                            }
                            interfaceC28601c14 = interfaceC28601c19;
                            m125716h0(c37035f, function115, function116, (Function1) objM87133R24, c28655q9, 3456, 0);
                            i17 = i28;
                            interfaceC28601c13 = interfaceC28601c18;
                            function9 = function12;
                            z16 = true;
                        }
                        interfaceC28601c15 = interfaceC28601c14;
                        interfaceC28601c16 = interfaceC28601c13;
                        function10 = function9;
                        i24 = i17;
                        i25 = 256;
                        c28655q9.m87173q(false);
                        c28655q3 = c28655q9;
                    } else {
                        interfaceC28601c15 = interfaceC28601c14;
                        interfaceC28601c16 = interfaceC28601c13;
                        function10 = function9;
                        i24 = i17;
                        i25 = 256;
                        c28655q2.m87150e0(1518504022);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f18, c2314t2));
                    if (list2.isEmpty()) {
                        c28655q3.m87150e0(1518645506);
                        C28655q c28655q19 = c28655q3;
                        function11 = function10;
                        AbstractC17755i2.m50938j(null, viewState.getNotIncludedItemsHeader().getDividerType(), viewState.getNotIncludedItemsHeader().getDividerTextPosition(), viewState.getNotIncludedItemsHeader().getTitle(), null, C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite70(), 0L, null, c28655q19, TextResource.$stable << 9, 209);
                        c28655q8 = c28655q19;
                        while (r15.hasNext()) {
                            boolean zM87157i9 = c28655q8.m87157i(c37035f2);
                            if ((i24 & 896) == i25) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            z28 = zM87157i9 | z27;
                            objM87133R20 = c28655q8.m87133R();
                            if (z28) {
                                objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                                c28655q8.m87172p0(objM87133R20);
                            } else {
                                objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                                c28655q8.m87172p0(objM87133R20);
                            }
                            Function1 function117 = (Function1) objM87133R20;
                            objM87133R21 = c28655q8.m87133R();
                            if (objM87133R21 == obj) {
                                objM87133R21 = new C39382e(4, interfaceC28601c15);
                                c28655q8.m87172p0(objM87133R21);
                            }
                            m125716h0(c37035f2, function117, null, (Function1) objM87133R21, c28655q8, 3072, 4);
                        }
                        z17 = false;
                        c28655q8.m87173q(false);
                        c28655q4 = c28655q8;
                    } else {
                        function11 = function10;
                        z17 = false;
                        c28655q3.m87150e0(1520017814);
                        c28655q3.m87173q(false);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(true);
                    z18 = z17;
                    C27238a0 c27238a0M118882c3 = viewState.getButton();
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f18, AbstractC1102d.m3409f(1.0f, c2314t2)), "save_button");
                    boolean zM87155h3 = c28655q4.m87155h(zBooleanValue) | c28655q4.m87157i(viewState);
                    i26 = i24 & 896;
                    if (i26 == i25) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    z24 = zM87155h3 | z19;
                    Object objM87133R38 = c28655q4.m87133R();
                    if (z24) {
                        Function1 function118 = function11;
                        c4660x0 = new C4660x0(3, viewState, function118, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                        function11 = function118;
                        c28655q4.m87172p0(c4660x0);
                    } else {
                        Function1 function119 = function11;
                        c4660x0 = new C4660x0(3, viewState, function119, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                        function11 = function119;
                        c28655q4.m87172p0(c4660x0);
                    }
                    i27 = C27238a0.f109008k;
                    interfaceC28601c17 = interfaceC28601c16;
                    c15199y5 = c15199y3;
                    InterfaceC28601c1 interfaceC28601c24 = interfaceC28601c15;
                    AbstractC27292z.m82341h(c27238a0M118882c3, modifierM3599a3, null, (InterfaceC4339a) c4660x0, c28655q4, i27 | 48, 4);
                    c28655q4.m87173q(true);
                    c37035fM125758v0 = m125758v0(interfaceC28601c17);
                    if (c37035fM125758v0 == null) {
                        c28655q4.m87150e0(-769722278);
                        c28655q4.m87173q(z18);
                        c28655q5 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-769722277);
                        C27238a0 c27238a0M118881b3 = viewState.getBottomSheetButton();
                        AbstractC35664f.a aVar7 = new AbstractC35664f.a(c15199y5);
                        boolean zM118895p3 = viewState.getIsAiConfirmation();
                        objM87133R17 = c28655q4.m87133R();
                        if (objM87133R17 == obj) {
                            objM87133R17 = new C35429g(17, interfaceC28601c17);
                            c28655q4.m87172p0(objM87133R17);
                        }
                        InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R17;
                        if (i26 == 256) {
                            z25 = true;
                        } else {
                            z25 = z18;
                        }
                        zM87157i5 = z25 | c28655q4.m87157i(c37035fM125758v0);
                        objM87133R18 = c28655q4.m87133R();
                        if (zM87157i5) {
                            objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                            c28655q4.m87172p0(objM87133R18);
                        } else {
                            objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                            c28655q4.m87172p0(objM87133R18);
                        }
                        C28655q c28655q110 = c28655q4;
                        AbstractC39384g.m125633r(null, c37035fM125758v0, c27238a0M118881b3, aVar7, zM118895p3, interfaceC4339a10, (InterfaceC4351m) objM87133R18, c28655q110, (i27 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (AbstractC35664f.a.f151587c << 9), 1);
                        C28655q c28655q111 = c28655q110;
                        c28655q111.m87173q(z18);
                        c28655q5 = c28655q111;
                    }
                    c37035fM125762x0 = m125762x0(interfaceC28601c24);
                    if (c37035fM125762x0 == null) {
                        c28655q5.m87150e0(-769079059);
                        c28655q5.m87173q(z18);
                        c28655q7 = c28655q5;
                    } else {
                        c28655q5.m87150e0(-769079058);
                        if (viewState.getCalculationEducationTitle() != null) {
                            c28655q5.m87150e0(1634809784);
                            c28655q5.m87173q(z18);
                            c28655q6 = c28655q5;
                        } else {
                            c28655q5.m87150e0(1634809784);
                            c28655q5.m87173q(z18);
                            c28655q6 = c28655q5;
                        }
                        c28655q6.m87173q(z18);
                        c28655q7 = c28655q6;
                    }
                    c37039jM118893n = viewState.getTestDeletedModal();
                    if (c37039jM118893n == null) {
                        c28655q7.m87150e0(-768459927);
                        c28655q7.m87173q(z18);
                    } else {
                        c28655q7.m87150e0(-768459926);
                        if ((i24 & 112) == 32) {
                            z26 = true;
                        } else {
                            z26 = z18;
                        }
                        objM87133R19 = c28655q7.m87133R();
                        if (z26) {
                            objM87133R19 = new C36681f(function7, 26);
                            c28655q7.m87172p0(objM87133R19);
                        } else {
                            objM87133R19 = new C36681f(function7, 26);
                            c28655q7.m87172p0(objM87133R19);
                        }
                        m125738o1(c37039jM118893n, (InterfaceC4339a) objM87133R19, c28655q7, i27);
                        c28655q7.m87173q(z18);
                    }
                    function6 = function11;
                    function5 = function7;
                    c28655q = c28655q7;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q10, iHashCode, c0209i2);
                C0209i c0209i12 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q10, c0209i12, modifierM118962N4);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                AbstractC6721d.a aVar8 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                objM87133R15 = c28655q10.m87133R();
                if (objM87133R15 == obj) {
                    objM87133R15 = new C35429g(22, interfaceC28601c11);
                    c28655q10.m87172p0(objM87133R15);
                }
                i17 = i29;
                function9 = function8;
                interfaceC28601c13 = interfaceC28601c7;
                interfaceC28601c14 = interfaceC28601c8;
                C0209i c0209i13 = c0209i3;
                AbstractC6719b.m20143d(modifierM3409f4, aVar8, null, (InterfaceC4339a) objM87133R15, null, null, c28655q10, (AbstractC6721d.a.f25641r << 3) | 3078, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f19 = 8;
                float f110 = 2 * f19;
                Modifier modifierM3355a4 = AbstractC1091c.m3355a(AbstractC1099a.m3394p(f110, AbstractC30060g.m92116f0(AbstractC15674c.m44089m(new LayoutWeightElement(1.0f, true), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q10, 1), 14)), AbstractC11348f.m30574v(300, 0, null, 6), 2);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q10, 0);
                iHashCode2 = Long.hashCode(c28655q10.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q10.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q10, modifierM3355a4);
                c28655q10.m87158i0();
                if (c28655q10.f115903S) {
                    c28655q10.m87163l(interfaceC4339a);
                } else {
                    c28655q10.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q10, c0209i13, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q10, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q10.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q10, c0209i12, modifierM118962N6);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t2, ((float) 0.5d) * f19, 0.0f, 0.0f, 0.0f, 14);
                String strM118894o4 = viewState.getTitle();
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                z16 = true;
                AbstractC30795n.m94707h(strM118894o4, modifierM3398t4, c38072d.m121949b(c28655q10, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q10, i18).getT3(), null, c28655q10, 48, C2886a.f11498d << 18, 196600);
                AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f110, c2314t2));
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(m125645B0(interfaceC28601c1));
                TextResource textResourceM21278l8 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                objM87133R16 = c28655q10.m87133R();
                if (objM87133R16 == obj) {
                    objM87133R16 = new C39382e(5, interfaceC28601c1);
                    c28655q10.m87172p0(objM87133R16);
                }
                Function1 function1110 = (Function1) objM87133R16;
                i19 = TextResource.$stable;
                AbstractC17795v0.m51127j(null, textResourceM21278l7, textResourceM21278l8, null, 0L, 0, false, null, 0L, false, null, false, false, null, function1110, c28655q10, (i19 << 3) | (i19 << 6), 24576, 16377);
                c28655q2 = c28655q10;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f110, c2314t2));
                if (list.isEmpty()) {
                    c28655q2.m87150e0(1517296045);
                    AbstractC17755i2.m50938j(null, viewState.getIncludedItemsHeader().getDividerType(), viewState.getIncludedItemsHeader().getDividerTextPosition(), viewState.getIncludedItemsHeader().getTitle(), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, c28655q2, i19 << 9, 209);
                    c28655q9 = c28655q2;
                    while (r1.hasNext()) {
                        i28 = i17;
                        if ((i28 & 896) == 256) {
                            z29 = z16;
                        } else {
                            z29 = false;
                        }
                        objM87133R22 = c28655q9.m87133R();
                        if (z29) {
                            function12 = function9;
                            objM87133R22 = new C37450h(function12, 17);
                            c28655q9.m87172p0(objM87133R22);
                        } else {
                            function12 = function9;
                            objM87133R22 = new C37450h(function12, 17);
                            c28655q9.m87172p0(objM87133R22);
                        }
                        Function1 function1111 = (Function1) objM87133R22;
                        objM87133R23 = c28655q9.m87133R();
                        if (objM87133R23 == obj) {
                            interfaceC28601c18 = interfaceC28601c13;
                            objM87133R23 = new C39382e(2, interfaceC28601c18);
                            c28655q9.m87172p0(objM87133R23);
                        } else {
                            interfaceC28601c18 = interfaceC28601c13;
                        }
                        Function1 function1112 = (Function1) objM87133R23;
                        objM87133R24 = c28655q9.m87133R();
                        if (objM87133R24 == obj) {
                            interfaceC28601c19 = interfaceC28601c14;
                            objM87133R24 = new C39382e(3, interfaceC28601c19);
                            c28655q9.m87172p0(objM87133R24);
                        } else {
                            interfaceC28601c19 = interfaceC28601c14;
                        }
                        interfaceC28601c14 = interfaceC28601c19;
                        m125716h0(c37035f, function1111, function1112, (Function1) objM87133R24, c28655q9, 3456, 0);
                        i17 = i28;
                        interfaceC28601c13 = interfaceC28601c18;
                        function9 = function12;
                        z16 = true;
                    }
                    interfaceC28601c15 = interfaceC28601c14;
                    interfaceC28601c16 = interfaceC28601c13;
                    function10 = function9;
                    i24 = i17;
                    i25 = 256;
                    c28655q9.m87173q(false);
                    c28655q3 = c28655q9;
                } else {
                    interfaceC28601c15 = interfaceC28601c14;
                    interfaceC28601c16 = interfaceC28601c13;
                    function10 = function9;
                    i24 = i17;
                    i25 = 256;
                    c28655q2.m87150e0(1518504022);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f110, c2314t2));
                if (list2.isEmpty()) {
                    c28655q3.m87150e0(1518645506);
                    C28655q c28655q112 = c28655q3;
                    function11 = function10;
                    AbstractC17755i2.m50938j(null, viewState.getNotIncludedItemsHeader().getDividerType(), viewState.getNotIncludedItemsHeader().getDividerTextPosition(), viewState.getNotIncludedItemsHeader().getTitle(), null, C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite70(), 0L, null, c28655q112, TextResource.$stable << 9, 209);
                    c28655q8 = c28655q112;
                    while (r15.hasNext()) {
                        boolean zM87157i10 = c28655q8.m87157i(c37035f2);
                        if ((i24 & 896) == i25) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = zM87157i10 | z27;
                        objM87133R20 = c28655q8.m87133R();
                        if (z28) {
                            objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                            c28655q8.m87172p0(objM87133R20);
                        } else {
                            objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                            c28655q8.m87172p0(objM87133R20);
                        }
                        Function1 function1113 = (Function1) objM87133R20;
                        objM87133R21 = c28655q8.m87133R();
                        if (objM87133R21 == obj) {
                            objM87133R21 = new C39382e(4, interfaceC28601c15);
                            c28655q8.m87172p0(objM87133R21);
                        }
                        m125716h0(c37035f2, function1113, null, (Function1) objM87133R21, c28655q8, 3072, 4);
                    }
                    z17 = false;
                    c28655q8.m87173q(false);
                    c28655q4 = c28655q8;
                } else {
                    function11 = function10;
                    z17 = false;
                    c28655q3.m87150e0(1520017814);
                    c28655q3.m87173q(false);
                    c28655q4 = c28655q3;
                }
                c28655q4.m87173q(true);
                z18 = z17;
                C27238a0 c27238a0M118882c4 = viewState.getButton();
                Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f110, AbstractC1102d.m3409f(1.0f, c2314t2)), "save_button");
                boolean zM87155h4 = c28655q4.m87155h(zBooleanValue) | c28655q4.m87157i(viewState);
                i26 = i24 & 896;
                if (i26 == i25) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                z24 = zM87155h4 | z19;
                Object objM87133R39 = c28655q4.m87133R();
                if (z24) {
                    Function1 function1114 = function11;
                    c4660x0 = new C4660x0(3, viewState, function1114, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                    function11 = function1114;
                    c28655q4.m87172p0(c4660x0);
                } else {
                    Function1 function1115 = function11;
                    c4660x0 = new C4660x0(3, viewState, function1115, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                    function11 = function1115;
                    c28655q4.m87172p0(c4660x0);
                }
                i27 = C27238a0.f109008k;
                interfaceC28601c17 = interfaceC28601c16;
                c15199y5 = c15199y3;
                InterfaceC28601c1 interfaceC28601c25 = interfaceC28601c15;
                AbstractC27292z.m82341h(c27238a0M118882c4, modifierM3599a4, null, (InterfaceC4339a) c4660x0, c28655q4, i27 | 48, 4);
                c28655q4.m87173q(true);
                c37035fM125758v0 = m125758v0(interfaceC28601c17);
                if (c37035fM125758v0 == null) {
                    c28655q4.m87150e0(-769722278);
                    c28655q4.m87173q(z18);
                    c28655q5 = c28655q4;
                } else {
                    c28655q4.m87150e0(-769722277);
                    C27238a0 c27238a0M118881b4 = viewState.getBottomSheetButton();
                    AbstractC35664f.a aVar9 = new AbstractC35664f.a(c15199y5);
                    boolean zM118895p4 = viewState.getIsAiConfirmation();
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == obj) {
                        objM87133R17 = new C35429g(17, interfaceC28601c17);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R17;
                    if (i26 == 256) {
                        z25 = true;
                    } else {
                        z25 = z18;
                    }
                    zM87157i5 = z25 | c28655q4.m87157i(c37035fM125758v0);
                    objM87133R18 = c28655q4.m87133R();
                    if (zM87157i5) {
                        objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                        c28655q4.m87172p0(objM87133R18);
                    } else {
                        objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                        c28655q4.m87172p0(objM87133R18);
                    }
                    C28655q c28655q113 = c28655q4;
                    AbstractC39384g.m125633r(null, c37035fM125758v0, c27238a0M118881b4, aVar9, zM118895p4, interfaceC4339a11, (InterfaceC4351m) objM87133R18, c28655q113, (i27 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (AbstractC35664f.a.f151587c << 9), 1);
                    C28655q c28655q114 = c28655q113;
                    c28655q114.m87173q(z18);
                    c28655q5 = c28655q114;
                }
                c37035fM125762x0 = m125762x0(interfaceC28601c25);
                if (c37035fM125762x0 == null) {
                    c28655q5.m87150e0(-769079059);
                    c28655q5.m87173q(z18);
                    c28655q7 = c28655q5;
                } else {
                    c28655q5.m87150e0(-769079058);
                    if (viewState.getCalculationEducationTitle() != null) {
                        c28655q5.m87150e0(1634809784);
                        c28655q5.m87173q(z18);
                        c28655q6 = c28655q5;
                    } else {
                        c28655q5.m87150e0(1634809784);
                        c28655q5.m87173q(z18);
                        c28655q6 = c28655q5;
                    }
                    c28655q6.m87173q(z18);
                    c28655q7 = c28655q6;
                }
                c37039jM118893n = viewState.getTestDeletedModal();
                if (c37039jM118893n == null) {
                    c28655q7.m87150e0(-768459927);
                    c28655q7.m87173q(z18);
                } else {
                    c28655q7.m87150e0(-768459926);
                    if ((i24 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = z18;
                    }
                    objM87133R19 = c28655q7.m87133R();
                    if (z26) {
                        objM87133R19 = new C36681f(function7, 26);
                        c28655q7.m87172p0(objM87133R19);
                    } else {
                        objM87133R19 = new C36681f(function7, 26);
                        c28655q7.m87172p0(objM87133R19);
                    }
                    m125738o1(c37039jM118893n, (InterfaceC4339a) objM87133R19, c28655q7, i27);
                    c28655q7.m87173q(z18);
                }
                function6 = function11;
                function5 = function7;
                c28655q = c28655q7;
            } else {
                c28655q10.m87138X();
                function5 = function3;
                function6 = function4;
                c28655q = c28655q10;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(viewState, function5, function6, i13, i14, 21);
            }
        }
        i29 |= 48;
        function3 = function1;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q10.m87157i(function4)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i29 |= i16;
            }
            if ((i29 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q10.m87135U(i29 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R32 = c28655q10.m87133R();
                    if (objM87133R32 == obj) {
                        objM87133R32 = new C39211b(24);
                        c28655q10.m87172p0(objM87133R32);
                    }
                    function7 = (Function1) objM87133R32;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    objM87133R31 = c28655q10.m87133R();
                    if (objM87133R31 == obj) {
                        objM87133R31 = new C39211b(16);
                        c28655q10.m87172p0(objM87133R31);
                    }
                    function8 = (Function1) objM87133R31;
                } else {
                    function8 = function4;
                }
                objM87133R = c28655q10.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q10.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q10.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q10.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q10.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q10.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q10.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q10.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q10.m87133R();
                if (objM87133R5 == obj) {
                    objM87133R5 = AbstractC28683x.m87272z(null);
                    c28655q10.m87172p0(objM87133R5);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q10.m87133R();
                if (objM87133R6 == obj) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q10.m87172p0(objM87133R6);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                EnumC15209z3 enumC15209z5 = EnumC15209z3.f57106w;
                c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z5, null, null, true, c28655q10, 3078, 6);
                c15199y3M3460c2 = AbstractC1118c.m3460c(enumC15209z5, null, null, true, c28655q10, 3078, 6);
                C37035f c37035fM125758v3 = m125758v0(interfaceC28601c5);
                zM87157i = c28655q10.m87157i(c15199y3M3460c);
                objM87133R7 = c28655q10.m87133R();
                if (zM87157i) {
                    interfaceC28601c7 = interfaceC28601c5;
                    objM87133R7 = new b(c15199y3M3460c, interfaceC28601c7, null);
                    c28655q10.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c7 = interfaceC28601c5;
                    objM87133R7 = new b(c15199y3M3460c, interfaceC28601c7, null);
                    c28655q10.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R7, c37035fM125758v3);
                EnumC15209z3 enumC15209z3M43221b5 = c15199y3M3460c.m43221b();
                zM87157i2 = c28655q10.m87157i(c15199y3M3460c);
                objM87133R8 = c28655q10.m87133R();
                if (zM87157i2) {
                    objM87133R8 = new c(c15199y3M3460c, interfaceC28601c7, null);
                    c28655q10.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new c(c15199y3M3460c, interfaceC28601c7, null);
                    c28655q10.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R8, enumC15209z3M43221b5);
                C37035f c37035fM125762x3 = m125762x0(interfaceC28601c6);
                zM87157i3 = c28655q10.m87157i(c15199y3M3460c2);
                objM87133R9 = c28655q10.m87133R();
                if (zM87157i3) {
                    interfaceC28601c8 = interfaceC28601c6;
                    objM87133R9 = new d(c15199y3M3460c2, interfaceC28601c8, null);
                    c28655q10.m87172p0(objM87133R9);
                } else {
                    interfaceC28601c8 = interfaceC28601c6;
                    objM87133R9 = new d(c15199y3M3460c2, interfaceC28601c8, null);
                    c28655q10.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R9, c37035fM125762x3);
                EnumC15209z3 enumC15209z3M43221b6 = c15199y3M3460c2.m43221b();
                zM87157i4 = c28655q10.m87157i(c15199y3M3460c2);
                objM87133R10 = c28655q10.m87133R();
                if (zM87157i4) {
                    objM87133R10 = new e(c15199y3M3460c2, interfaceC28601c8, null);
                    c28655q10.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new e(c15199y3M3460c2, interfaceC28601c8, null);
                    c28655q10.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R10, enumC15209z3M43221b6);
                zM87153g = c28655q10.m87153g(viewState.m118888i()) | c28655q10.m87153g(m125645B0(interfaceC28601c1));
                Object objM87133R310 = c28655q10.m87133R();
                if (zM87153g) {
                    if (AbstractC39414r.m125890i0(m125645B0(interfaceC28601c1))) {
                        arrayList = viewState.m118888i();
                    } else {
                        List<C37035f> listM118888i5 = viewState.m118888i();
                        arrayList = new ArrayList();
                        while (r9.hasNext()) {
                            String strM118853b5 = ((C37035f) obj4).getBiomarkerName();
                            C15199y3 c15199y12 = c15199y3M3460c;
                            Locale locale4 = Locale.ROOT;
                            upperCase = strM118853b5.toUpperCase(locale4);
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            C15199y3 c15199y13 = c15199y3M3460c2;
                            upperCase2 = m125645B0(interfaceC28601c1).toUpperCase(locale4);
                            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                            if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                arrayList.add(obj4);
                            }
                            c15199y3M3460c2 = c15199y13;
                            c15199y3M3460c = c15199y12;
                        }
                    }
                    c15199y3 = c15199y3M3460c;
                    c15199y4 = c15199y3M3460c2;
                    c28655q10.m87172p0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (AbstractC39414r.m125890i0(m125645B0(interfaceC28601c1))) {
                        arrayList = viewState.m118888i();
                    } else {
                        List<C37035f> listM118888i6 = viewState.m118888i();
                        arrayList = new ArrayList();
                        while (r9.hasNext()) {
                            String strM118853b6 = ((C37035f) obj4).getBiomarkerName();
                            C15199y3 c15199y14 = c15199y3M3460c;
                            Locale locale5 = Locale.ROOT;
                            upperCase = strM118853b6.toUpperCase(locale5);
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            C15199y3 c15199y15 = c15199y3M3460c2;
                            upperCase2 = m125645B0(interfaceC28601c1).toUpperCase(locale5);
                            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                            if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                arrayList.add(obj4);
                            }
                            c15199y3M3460c2 = c15199y15;
                            c15199y3M3460c = c15199y14;
                        }
                    }
                    c15199y3 = c15199y3M3460c;
                    c15199y4 = c15199y3M3460c2;
                    c28655q10.m87172p0(arrayList);
                    obj2 = arrayList;
                }
                obj3 = (List) obj2;
                zM87153g2 = c28655q10.m87153g(obj3);
                objM87133R11 = c28655q10.m87133R();
                if (zM87153g2) {
                    arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                        if (((C37035f) obj5).getIncluded()) {
                            arrayList2.add(obj5);
                        }
                    }
                    objM87133R11 = AbstractC25265s.m74152u1(arrayList2, new f());
                    c28655q10.m87172p0(objM87133R11);
                } else {
                    arrayList2 = new ArrayList();
                    while (r2.hasNext()) {
                        if (((C37035f) obj5).getIncluded()) {
                            arrayList2.add(obj5);
                        }
                    }
                    objM87133R11 = AbstractC25265s.m74152u1(arrayList2, new f());
                    c28655q10.m87172p0(objM87133R11);
                }
                list = (List) objM87133R11;
                zM87153g3 = c28655q10.m87153g(obj3);
                objM87133R12 = c28655q10.m87133R();
                if (zM87153g3) {
                    arrayList3 = new ArrayList();
                    while (r7.hasNext()) {
                        if (!((C37035f) obj6).getIncluded()) {
                            arrayList3.add(obj6);
                        }
                    }
                    objM87133R12 = AbstractC25265s.m74152u1(arrayList3, new g());
                    c28655q10.m87172p0(objM87133R12);
                } else {
                    arrayList3 = new ArrayList();
                    while (r7.hasNext()) {
                        if (!((C37035f) obj6).getIncluded()) {
                            arrayList3.add(obj6);
                        }
                    }
                    objM87133R12 = AbstractC25265s.m74152u1(arrayList3, new g());
                    c28655q10.m87172p0(objM87133R12);
                }
                list2 = (List) objM87133R12;
                zM87153g4 = c28655q10.m87153g(viewState.m118888i());
                objM87133R13 = c28655q10.m87133R();
                if (zM87153g4) {
                    listM118888i = viewState.m118888i();
                    if (!(listM118888i instanceof Collection)) {
                        it = listM118888i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C37035f) it.next()).getIncluded()) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                    } else {
                        it = listM118888i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C37035f) it.next()).getIncluded()) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                    }
                    objM87133R13 = Boolean.valueOf(z13);
                    c28655q10.m87172p0(objM87133R13);
                } else {
                    listM118888i = viewState.m118888i();
                    if (!(listM118888i instanceof Collection)) {
                        it = listM118888i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C37035f) it.next()).getIncluded()) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                    } else {
                        it = listM118888i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C37035f) it.next()).getIncluded()) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                    }
                    objM87133R13 = Boolean.valueOf(z13);
                    c28655q10.m87172p0(objM87133R13);
                }
                zBooleanValue = ((Boolean) objM87133R13).booleanValue();
                if (m125685V0(interfaceC28601c2)) {
                    c28655q10.m87150e0(-776385634);
                    C37034e c37034eM118886g3 = viewState.getExitDialog();
                    if ((i29 & 112) == 32) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    objM87133R29 = c28655q10.m87133R();
                    if (z36) {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM87133R29 = new C29308g(function7, interfaceC28601c9, 10);
                        c28655q10.m87172p0(objM87133R29);
                    } else {
                        interfaceC28601c9 = interfaceC28601c2;
                        objM87133R29 = new C29308g(function7, interfaceC28601c9, 10);
                        c28655q10.m87172p0(objM87133R29);
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R29;
                    objM87133R30 = c28655q10.m87133R();
                    if (objM87133R30 == obj) {
                        objM87133R30 = new C35429g(19, interfaceC28601c9);
                        c28655q10.m87172p0(objM87133R30);
                    }
                    m125702c1(c37034eM118886g3, interfaceC4339a12, (InterfaceC4339a) objM87133R30, c28655q10, C27238a0.f109008k | 384);
                    c28655q10.m87173q(false);
                } else {
                    interfaceC28601c8 = interfaceC28601c8;
                    interfaceC28601c9 = interfaceC28601c2;
                    c28655q10.m87150e0(-776066582);
                    c28655q10.m87173q(false);
                }
                if (m125689X0(interfaceC28601c3)) {
                    c28655q10.m87150e0(-776028390);
                    C37034e c37034eM118885f3 = viewState.getDeleteDialog();
                    if ((i29 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    objM87133R27 = c28655q10.m87133R();
                    if (z35) {
                        interfaceC28601c21 = interfaceC28601c3;
                        objM87133R27 = new C29308g(function8, interfaceC28601c21, 11);
                        c28655q10.m87172p0(objM87133R27);
                    } else {
                        interfaceC28601c21 = interfaceC28601c3;
                        objM87133R27 = new C29308g(function8, interfaceC28601c21, 11);
                        c28655q10.m87172p0(objM87133R27);
                    }
                    InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R27;
                    objM87133R28 = c28655q10.m87133R();
                    if (objM87133R28 == obj) {
                        objM87133R28 = new C35429g(20, interfaceC28601c21);
                        c28655q10.m87172p0(objM87133R28);
                    }
                    interfaceC28601c10 = interfaceC28601c21;
                    c3 = ' ';
                    interfaceC28601c11 = interfaceC28601c9;
                    m125691Y0(c37034eM118885f3, interfaceC4339a13, (InterfaceC4339a) objM87133R28, null, c28655q10, C27238a0.f109008k | 384, 8);
                    z14 = false;
                    c28655q10.m87173q(false);
                } else {
                    interfaceC28601c10 = interfaceC28601c3;
                    function7 = function7;
                    interfaceC28601c11 = interfaceC28601c9;
                    z14 = false;
                    c3 = ' ';
                    c28655q10.m87150e0(-775705494);
                    c28655q10.m87173q(false);
                }
                if (m125752t0(interfaceC28601c4)) {
                    c28655q10.m87150e0(2053190383);
                    c37033dM118891l = viewState.getPendingDependencyWarning();
                    if (c37033dM118891l == null) {
                        c28655q10.m87150e0(-775607566);
                        c28655q10.m87173q(z14);
                        interfaceC28601c12 = interfaceC28601c4;
                        c7 = 256;
                    } else {
                        c28655q10.m87150e0(-775607565);
                        if ((i29 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        zM87157i6 = c28655q10.m87157i(viewState) | z34;
                        objM87133R25 = c28655q10.m87133R();
                        if (zM87157i6) {
                            interfaceC28601c20 = interfaceC28601c4;
                            objM87133R25 = new C31324k(function8, viewState, interfaceC28601c20, 24);
                            c28655q10.m87172p0(objM87133R25);
                        } else {
                            interfaceC28601c20 = interfaceC28601c4;
                            objM87133R25 = new C31324k(function8, viewState, interfaceC28601c20, 24);
                            c28655q10.m87172p0(objM87133R25);
                        }
                        InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R25;
                        objM87133R26 = c28655q10.m87133R();
                        if (objM87133R26 == obj) {
                            objM87133R26 = new C35429g(21, interfaceC28601c20);
                            c28655q10.m87172p0(objM87133R26);
                        }
                        c7 = 256;
                        interfaceC28601c12 = interfaceC28601c20;
                        m125696a1(c37033dM118891l, interfaceC4339a14, (InterfaceC4339a) objM87133R26, null, c28655q10, TextResource.$stable | 384, 8);
                        z14 = false;
                        c28655q10.m87173q(false);
                    }
                    c28655q10.m87173q(z14);
                } else {
                    interfaceC28601c12 = interfaceC28601c4;
                    c7 = 256;
                    c28655q10.m87150e0(-775179734);
                    c28655q10.m87173q(z14);
                }
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM114675c3 = AbstractC36095b.m114675c(c2314t3, 1.0f);
                if (viewState.getTestDeletedModal() != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R14 = c28655q10.m87133R();
                if (objM87133R14 == obj) {
                    objM87133R14 = new C39211b(18);
                    c28655q10.m87172p0(objM87133R14);
                }
                Modifier modifierM44099b3 = AbstractC15676d.m44099b(modifierM114675c3, z15, (Function1) objM87133R14);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q10, 0);
                iHashCode = Long.hashCode(c28655q10.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q10.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q10, modifierM44099b3);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q10.m87158i0();
                if (c28655q10.f115903S) {
                    c28655q10.m87163l(interfaceC4339a);
                } else {
                    c28655q10.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q10, c0209i, c23010xM66775a7);
                C0209i c0209i14 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q10, c0209i14, interfaceC28653p1M87165m7);
                c0209i2 = C0217k.f732j;
                if (c28655q10.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q10.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i15 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q10, c0209i15, modifierM118962N7);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t3);
                    AbstractC6721d.a aVar10 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    objM87133R15 = c28655q10.m87133R();
                    if (objM87133R15 == obj) {
                        objM87133R15 = new C35429g(22, interfaceC28601c11);
                        c28655q10.m87172p0(objM87133R15);
                    }
                    i17 = i29;
                    function9 = function8;
                    interfaceC28601c13 = interfaceC28601c7;
                    interfaceC28601c14 = interfaceC28601c8;
                    C0209i c0209i16 = c0209i3;
                    AbstractC6719b.m20143d(modifierM3409f5, aVar10, null, (InterfaceC4339a) objM87133R15, null, null, c28655q10, (AbstractC6721d.a.f25641r << 3) | 3078, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    float f111 = 8;
                    float f112 = 2 * f111;
                    Modifier modifierM3355a5 = AbstractC1091c.m3355a(AbstractC1099a.m3394p(f112, AbstractC30060g.m92116f0(AbstractC15674c.m44089m(new LayoutWeightElement(1.0f, true), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q10, 1), 14)), AbstractC11348f.m30574v(300, 0, null, 6), 2);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q10, 0);
                    iHashCode2 = Long.hashCode(c28655q10.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q10.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q10, modifierM3355a5);
                    c28655q10.m87158i0();
                    if (c28655q10.f115903S) {
                        c28655q10.m87163l(interfaceC4339a);
                    } else {
                        c28655q10.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q10, c0209i16, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q10, c0209i14, interfaceC28653p1M87165m8);
                    if (c28655q10.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q10, c0209i15, modifierM118962N8);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t3, ((float) 0.5d) * f111, 0.0f, 0.0f, 0.0f, 14);
                    String strM118894o5 = viewState.getTitle();
                    c38072d = C38072d.f163053a;
                    i18 = C38072d.f163054b;
                    z16 = true;
                    AbstractC30795n.m94707h(strM118894o5, modifierM3398t5, c38072d.m121949b(c28655q10, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q10, i18).getT3(), null, c28655q10, 48, C2886a.f11498d << 18, 196600);
                    AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f112, c2314t3));
                    TextResource textResourceM21278l9 = AbstractC8693b.m21278l(m125645B0(interfaceC28601c1));
                    TextResource textResourceM21278l10 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                    objM87133R16 = c28655q10.m87133R();
                    if (objM87133R16 == obj) {
                        objM87133R16 = new C39382e(5, interfaceC28601c1);
                        c28655q10.m87172p0(objM87133R16);
                    }
                    Function1 function1116 = (Function1) objM87133R16;
                    i19 = TextResource.$stable;
                    AbstractC17795v0.m51127j(null, textResourceM21278l9, textResourceM21278l10, null, 0L, 0, false, null, 0L, false, null, false, false, null, function1116, c28655q10, (i19 << 3) | (i19 << 6), 24576, 16377);
                    c28655q2 = c28655q10;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f112, c2314t3));
                    if (list.isEmpty()) {
                        c28655q2.m87150e0(1517296045);
                        AbstractC17755i2.m50938j(null, viewState.getIncludedItemsHeader().getDividerType(), viewState.getIncludedItemsHeader().getDividerTextPosition(), viewState.getIncludedItemsHeader().getTitle(), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, c28655q2, i19 << 9, 209);
                        c28655q9 = c28655q2;
                        while (r1.hasNext()) {
                            i28 = i17;
                            if ((i28 & 896) == 256) {
                                z29 = z16;
                            } else {
                                z29 = false;
                            }
                            objM87133R22 = c28655q9.m87133R();
                            if (z29) {
                                function12 = function9;
                                objM87133R22 = new C37450h(function12, 17);
                                c28655q9.m87172p0(objM87133R22);
                            } else {
                                function12 = function9;
                                objM87133R22 = new C37450h(function12, 17);
                                c28655q9.m87172p0(objM87133R22);
                            }
                            Function1 function1117 = (Function1) objM87133R22;
                            objM87133R23 = c28655q9.m87133R();
                            if (objM87133R23 == obj) {
                                interfaceC28601c18 = interfaceC28601c13;
                                objM87133R23 = new C39382e(2, interfaceC28601c18);
                                c28655q9.m87172p0(objM87133R23);
                            } else {
                                interfaceC28601c18 = interfaceC28601c13;
                            }
                            Function1 function1118 = (Function1) objM87133R23;
                            objM87133R24 = c28655q9.m87133R();
                            if (objM87133R24 == obj) {
                                interfaceC28601c19 = interfaceC28601c14;
                                objM87133R24 = new C39382e(3, interfaceC28601c19);
                                c28655q9.m87172p0(objM87133R24);
                            } else {
                                interfaceC28601c19 = interfaceC28601c14;
                            }
                            interfaceC28601c14 = interfaceC28601c19;
                            m125716h0(c37035f, function1117, function1118, (Function1) objM87133R24, c28655q9, 3456, 0);
                            i17 = i28;
                            interfaceC28601c13 = interfaceC28601c18;
                            function9 = function12;
                            z16 = true;
                        }
                        interfaceC28601c15 = interfaceC28601c14;
                        interfaceC28601c16 = interfaceC28601c13;
                        function10 = function9;
                        i24 = i17;
                        i25 = 256;
                        c28655q9.m87173q(false);
                        c28655q3 = c28655q9;
                    } else {
                        interfaceC28601c15 = interfaceC28601c14;
                        interfaceC28601c16 = interfaceC28601c13;
                        function10 = function9;
                        i24 = i17;
                        i25 = 256;
                        c28655q2.m87150e0(1518504022);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f112, c2314t3));
                    if (list2.isEmpty()) {
                        c28655q3.m87150e0(1518645506);
                        C28655q c28655q115 = c28655q3;
                        function11 = function10;
                        AbstractC17755i2.m50938j(null, viewState.getNotIncludedItemsHeader().getDividerType(), viewState.getNotIncludedItemsHeader().getDividerTextPosition(), viewState.getNotIncludedItemsHeader().getTitle(), null, C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite70(), 0L, null, c28655q115, TextResource.$stable << 9, 209);
                        c28655q8 = c28655q115;
                        while (r15.hasNext()) {
                            boolean zM87157i11 = c28655q8.m87157i(c37035f2);
                            if ((i24 & 896) == i25) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            z28 = zM87157i11 | z27;
                            objM87133R20 = c28655q8.m87133R();
                            if (z28) {
                                objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                                c28655q8.m87172p0(objM87133R20);
                            } else {
                                objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                                c28655q8.m87172p0(objM87133R20);
                            }
                            Function1 function1119 = (Function1) objM87133R20;
                            objM87133R21 = c28655q8.m87133R();
                            if (objM87133R21 == obj) {
                                objM87133R21 = new C39382e(4, interfaceC28601c15);
                                c28655q8.m87172p0(objM87133R21);
                            }
                            m125716h0(c37035f2, function1119, null, (Function1) objM87133R21, c28655q8, 3072, 4);
                        }
                        z17 = false;
                        c28655q8.m87173q(false);
                        c28655q4 = c28655q8;
                    } else {
                        function11 = function10;
                        z17 = false;
                        c28655q3.m87150e0(1520017814);
                        c28655q3.m87173q(false);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(true);
                    z18 = z17;
                    C27238a0 c27238a0M118882c5 = viewState.getButton();
                    Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f112, AbstractC1102d.m3409f(1.0f, c2314t3)), "save_button");
                    boolean zM87155h5 = c28655q4.m87155h(zBooleanValue) | c28655q4.m87157i(viewState);
                    i26 = i24 & 896;
                    if (i26 == i25) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    z24 = zM87155h5 | z19;
                    Object objM87133R311 = c28655q4.m87133R();
                    if (z24) {
                        Function1 function11110 = function11;
                        c4660x0 = new C4660x0(3, viewState, function11110, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                        function11 = function11110;
                        c28655q4.m87172p0(c4660x0);
                    } else {
                        Function1 function11111 = function11;
                        c4660x0 = new C4660x0(3, viewState, function11111, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                        function11 = function11111;
                        c28655q4.m87172p0(c4660x0);
                    }
                    i27 = C27238a0.f109008k;
                    interfaceC28601c17 = interfaceC28601c16;
                    c15199y5 = c15199y3;
                    InterfaceC28601c1 interfaceC28601c26 = interfaceC28601c15;
                    AbstractC27292z.m82341h(c27238a0M118882c5, modifierM3599a5, null, (InterfaceC4339a) c4660x0, c28655q4, i27 | 48, 4);
                    c28655q4.m87173q(true);
                    c37035fM125758v0 = m125758v0(interfaceC28601c17);
                    if (c37035fM125758v0 == null) {
                        c28655q4.m87150e0(-769722278);
                        c28655q4.m87173q(z18);
                        c28655q5 = c28655q4;
                    } else {
                        c28655q4.m87150e0(-769722277);
                        C27238a0 c27238a0M118881b5 = viewState.getBottomSheetButton();
                        AbstractC35664f.a aVar11 = new AbstractC35664f.a(c15199y5);
                        boolean zM118895p5 = viewState.getIsAiConfirmation();
                        objM87133R17 = c28655q4.m87133R();
                        if (objM87133R17 == obj) {
                            objM87133R17 = new C35429g(17, interfaceC28601c17);
                            c28655q4.m87172p0(objM87133R17);
                        }
                        InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R17;
                        if (i26 == 256) {
                            z25 = true;
                        } else {
                            z25 = z18;
                        }
                        zM87157i5 = z25 | c28655q4.m87157i(c37035fM125758v0);
                        objM87133R18 = c28655q4.m87133R();
                        if (zM87157i5) {
                            objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                            c28655q4.m87172p0(objM87133R18);
                        } else {
                            objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                            c28655q4.m87172p0(objM87133R18);
                        }
                        C28655q c28655q116 = c28655q4;
                        AbstractC39384g.m125633r(null, c37035fM125758v0, c27238a0M118881b5, aVar11, zM118895p5, interfaceC4339a15, (InterfaceC4351m) objM87133R18, c28655q116, (i27 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (AbstractC35664f.a.f151587c << 9), 1);
                        C28655q c28655q117 = c28655q116;
                        c28655q117.m87173q(z18);
                        c28655q5 = c28655q117;
                    }
                    c37035fM125762x0 = m125762x0(interfaceC28601c26);
                    if (c37035fM125762x0 == null) {
                        c28655q5.m87150e0(-769079059);
                        c28655q5.m87173q(z18);
                        c28655q7 = c28655q5;
                    } else {
                        c28655q5.m87150e0(-769079058);
                        if (viewState.getCalculationEducationTitle() != null) {
                            c28655q5.m87150e0(1634809784);
                            c28655q5.m87173q(z18);
                            c28655q6 = c28655q5;
                        } else {
                            c28655q5.m87150e0(1634809784);
                            c28655q5.m87173q(z18);
                            c28655q6 = c28655q5;
                        }
                        c28655q6.m87173q(z18);
                        c28655q7 = c28655q6;
                    }
                    c37039jM118893n = viewState.getTestDeletedModal();
                    if (c37039jM118893n == null) {
                        c28655q7.m87150e0(-768459927);
                        c28655q7.m87173q(z18);
                    } else {
                        c28655q7.m87150e0(-768459926);
                        if ((i24 & 112) == 32) {
                            z26 = true;
                        } else {
                            z26 = z18;
                        }
                        objM87133R19 = c28655q7.m87133R();
                        if (z26) {
                            objM87133R19 = new C36681f(function7, 26);
                            c28655q7.m87172p0(objM87133R19);
                        } else {
                            objM87133R19 = new C36681f(function7, 26);
                            c28655q7.m87172p0(objM87133R19);
                        }
                        m125738o1(c37039jM118893n, (InterfaceC4339a) objM87133R19, c28655q7, i27);
                        c28655q7.m87173q(z18);
                    }
                    function6 = function11;
                    function5 = function7;
                    c28655q = c28655q7;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q10, iHashCode, c0209i2);
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q10, c0209i17, modifierM118962N7);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t3);
                AbstractC6721d.a aVar12 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                objM87133R15 = c28655q10.m87133R();
                if (objM87133R15 == obj) {
                    objM87133R15 = new C35429g(22, interfaceC28601c11);
                    c28655q10.m87172p0(objM87133R15);
                }
                i17 = i29;
                function9 = function8;
                interfaceC28601c13 = interfaceC28601c7;
                interfaceC28601c14 = interfaceC28601c8;
                C0209i c0209i18 = c0209i3;
                AbstractC6719b.m20143d(modifierM3409f6, aVar12, null, (InterfaceC4339a) objM87133R15, null, null, c28655q10, (AbstractC6721d.a.f25641r << 3) | 3078, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f113 = 8;
                float f114 = 2 * f113;
                Modifier modifierM3355a6 = AbstractC1091c.m3355a(AbstractC1099a.m3394p(f114, AbstractC30060g.m92116f0(AbstractC15674c.m44089m(new LayoutWeightElement(1.0f, true), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q10, 1), 14)), AbstractC11348f.m30574v(300, 0, null, 6), 2);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q10, 0);
                iHashCode2 = Long.hashCode(c28655q10.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q10.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q10, modifierM3355a6);
                c28655q10.m87158i0();
                if (c28655q10.f115903S) {
                    c28655q10.m87163l(interfaceC4339a);
                } else {
                    c28655q10.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q10, c0209i18, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q10, c0209i14, interfaceC28653p1M87165m9);
                if (c28655q10.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q10, c0209i17, modifierM118962N9);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t3, ((float) 0.5d) * f113, 0.0f, 0.0f, 0.0f, 14);
                String strM118894o6 = viewState.getTitle();
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                z16 = true;
                AbstractC30795n.m94707h(strM118894o6, modifierM3398t6, c38072d.m121949b(c28655q10, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q10, i18).getT3(), null, c28655q10, 48, C2886a.f11498d << 18, 196600);
                AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f114, c2314t3));
                TextResource textResourceM21278l11 = AbstractC8693b.m21278l(m125645B0(interfaceC28601c1));
                TextResource textResourceM21278l12 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                objM87133R16 = c28655q10.m87133R();
                if (objM87133R16 == obj) {
                    objM87133R16 = new C39382e(5, interfaceC28601c1);
                    c28655q10.m87172p0(objM87133R16);
                }
                Function1 function11112 = (Function1) objM87133R16;
                i19 = TextResource.$stable;
                AbstractC17795v0.m51127j(null, textResourceM21278l11, textResourceM21278l12, null, 0L, 0, false, null, 0L, false, null, false, false, null, function11112, c28655q10, (i19 << 3) | (i19 << 6), 24576, 16377);
                c28655q2 = c28655q10;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f114, c2314t3));
                if (list.isEmpty()) {
                    c28655q2.m87150e0(1517296045);
                    AbstractC17755i2.m50938j(null, viewState.getIncludedItemsHeader().getDividerType(), viewState.getIncludedItemsHeader().getDividerTextPosition(), viewState.getIncludedItemsHeader().getTitle(), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, c28655q2, i19 << 9, 209);
                    c28655q9 = c28655q2;
                    while (r1.hasNext()) {
                        i28 = i17;
                        if ((i28 & 896) == 256) {
                            z29 = z16;
                        } else {
                            z29 = false;
                        }
                        objM87133R22 = c28655q9.m87133R();
                        if (z29) {
                            function12 = function9;
                            objM87133R22 = new C37450h(function12, 17);
                            c28655q9.m87172p0(objM87133R22);
                        } else {
                            function12 = function9;
                            objM87133R22 = new C37450h(function12, 17);
                            c28655q9.m87172p0(objM87133R22);
                        }
                        Function1 function11113 = (Function1) objM87133R22;
                        objM87133R23 = c28655q9.m87133R();
                        if (objM87133R23 == obj) {
                            interfaceC28601c18 = interfaceC28601c13;
                            objM87133R23 = new C39382e(2, interfaceC28601c18);
                            c28655q9.m87172p0(objM87133R23);
                        } else {
                            interfaceC28601c18 = interfaceC28601c13;
                        }
                        Function1 function11114 = (Function1) objM87133R23;
                        objM87133R24 = c28655q9.m87133R();
                        if (objM87133R24 == obj) {
                            interfaceC28601c19 = interfaceC28601c14;
                            objM87133R24 = new C39382e(3, interfaceC28601c19);
                            c28655q9.m87172p0(objM87133R24);
                        } else {
                            interfaceC28601c19 = interfaceC28601c14;
                        }
                        interfaceC28601c14 = interfaceC28601c19;
                        m125716h0(c37035f, function11113, function11114, (Function1) objM87133R24, c28655q9, 3456, 0);
                        i17 = i28;
                        interfaceC28601c13 = interfaceC28601c18;
                        function9 = function12;
                        z16 = true;
                    }
                    interfaceC28601c15 = interfaceC28601c14;
                    interfaceC28601c16 = interfaceC28601c13;
                    function10 = function9;
                    i24 = i17;
                    i25 = 256;
                    c28655q9.m87173q(false);
                    c28655q3 = c28655q9;
                } else {
                    interfaceC28601c15 = interfaceC28601c14;
                    interfaceC28601c16 = interfaceC28601c13;
                    function10 = function9;
                    i24 = i17;
                    i25 = 256;
                    c28655q2.m87150e0(1518504022);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f114, c2314t3));
                if (list2.isEmpty()) {
                    c28655q3.m87150e0(1518645506);
                    C28655q c28655q118 = c28655q3;
                    function11 = function10;
                    AbstractC17755i2.m50938j(null, viewState.getNotIncludedItemsHeader().getDividerType(), viewState.getNotIncludedItemsHeader().getDividerTextPosition(), viewState.getNotIncludedItemsHeader().getTitle(), null, C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite70(), 0L, null, c28655q118, TextResource.$stable << 9, 209);
                    c28655q8 = c28655q118;
                    while (r15.hasNext()) {
                        boolean zM87157i12 = c28655q8.m87157i(c37035f2);
                        if ((i24 & 896) == i25) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = zM87157i12 | z27;
                        objM87133R20 = c28655q8.m87133R();
                        if (z28) {
                            objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                            c28655q8.m87172p0(objM87133R20);
                        } else {
                            objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                            c28655q8.m87172p0(objM87133R20);
                        }
                        Function1 function11115 = (Function1) objM87133R20;
                        objM87133R21 = c28655q8.m87133R();
                        if (objM87133R21 == obj) {
                            objM87133R21 = new C39382e(4, interfaceC28601c15);
                            c28655q8.m87172p0(objM87133R21);
                        }
                        m125716h0(c37035f2, function11115, null, (Function1) objM87133R21, c28655q8, 3072, 4);
                    }
                    z17 = false;
                    c28655q8.m87173q(false);
                    c28655q4 = c28655q8;
                } else {
                    function11 = function10;
                    z17 = false;
                    c28655q3.m87150e0(1520017814);
                    c28655q3.m87173q(false);
                    c28655q4 = c28655q3;
                }
                c28655q4.m87173q(true);
                z18 = z17;
                C27238a0 c27238a0M118882c6 = viewState.getButton();
                Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f114, AbstractC1102d.m3409f(1.0f, c2314t3)), "save_button");
                boolean zM87155h6 = c28655q4.m87155h(zBooleanValue) | c28655q4.m87157i(viewState);
                i26 = i24 & 896;
                if (i26 == i25) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                z24 = zM87155h6 | z19;
                Object objM87133R312 = c28655q4.m87133R();
                if (z24) {
                    Function1 function11116 = function11;
                    c4660x0 = new C4660x0(3, viewState, function11116, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                    function11 = function11116;
                    c28655q4.m87172p0(c4660x0);
                } else {
                    Function1 function11117 = function11;
                    c4660x0 = new C4660x0(3, viewState, function11117, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                    function11 = function11117;
                    c28655q4.m87172p0(c4660x0);
                }
                i27 = C27238a0.f109008k;
                interfaceC28601c17 = interfaceC28601c16;
                c15199y5 = c15199y3;
                InterfaceC28601c1 interfaceC28601c27 = interfaceC28601c15;
                AbstractC27292z.m82341h(c27238a0M118882c6, modifierM3599a6, null, (InterfaceC4339a) c4660x0, c28655q4, i27 | 48, 4);
                c28655q4.m87173q(true);
                c37035fM125758v0 = m125758v0(interfaceC28601c17);
                if (c37035fM125758v0 == null) {
                    c28655q4.m87150e0(-769722278);
                    c28655q4.m87173q(z18);
                    c28655q5 = c28655q4;
                } else {
                    c28655q4.m87150e0(-769722277);
                    C27238a0 c27238a0M118881b6 = viewState.getBottomSheetButton();
                    AbstractC35664f.a aVar13 = new AbstractC35664f.a(c15199y5);
                    boolean zM118895p6 = viewState.getIsAiConfirmation();
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == obj) {
                        objM87133R17 = new C35429g(17, interfaceC28601c17);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R17;
                    if (i26 == 256) {
                        z25 = true;
                    } else {
                        z25 = z18;
                    }
                    zM87157i5 = z25 | c28655q4.m87157i(c37035fM125758v0);
                    objM87133R18 = c28655q4.m87133R();
                    if (zM87157i5) {
                        objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                        c28655q4.m87172p0(objM87133R18);
                    } else {
                        objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                        c28655q4.m87172p0(objM87133R18);
                    }
                    C28655q c28655q119 = c28655q4;
                    AbstractC39384g.m125633r(null, c37035fM125758v0, c27238a0M118881b6, aVar13, zM118895p6, interfaceC4339a16, (InterfaceC4351m) objM87133R18, c28655q119, (i27 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (AbstractC35664f.a.f151587c << 9), 1);
                    C28655q c28655q1110 = c28655q119;
                    c28655q1110.m87173q(z18);
                    c28655q5 = c28655q1110;
                }
                c37035fM125762x0 = m125762x0(interfaceC28601c27);
                if (c37035fM125762x0 == null) {
                    c28655q5.m87150e0(-769079059);
                    c28655q5.m87173q(z18);
                    c28655q7 = c28655q5;
                } else {
                    c28655q5.m87150e0(-769079058);
                    if (viewState.getCalculationEducationTitle() != null) {
                        c28655q5.m87150e0(1634809784);
                        c28655q5.m87173q(z18);
                        c28655q6 = c28655q5;
                    } else {
                        c28655q5.m87150e0(1634809784);
                        c28655q5.m87173q(z18);
                        c28655q6 = c28655q5;
                    }
                    c28655q6.m87173q(z18);
                    c28655q7 = c28655q6;
                }
                c37039jM118893n = viewState.getTestDeletedModal();
                if (c37039jM118893n == null) {
                    c28655q7.m87150e0(-768459927);
                    c28655q7.m87173q(z18);
                } else {
                    c28655q7.m87150e0(-768459926);
                    if ((i24 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = z18;
                    }
                    objM87133R19 = c28655q7.m87133R();
                    if (z26) {
                        objM87133R19 = new C36681f(function7, 26);
                        c28655q7.m87172p0(objM87133R19);
                    } else {
                        objM87133R19 = new C36681f(function7, 26);
                        c28655q7.m87172p0(objM87133R19);
                    }
                    m125738o1(c37039jM118893n, (InterfaceC4339a) objM87133R19, c28655q7, i27);
                    c28655q7.m87173q(z18);
                }
                function6 = function11;
                function5 = function7;
                c28655q = c28655q7;
            } else {
                c28655q10.m87138X();
                function5 = function3;
                function6 = function4;
                c28655q = c28655q10;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(viewState, function5, function6, i13, i14, 21);
            }
        }
        i29 |= 384;
        function4 = function2;
        if ((i29 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q10.m87135U(i29 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i34 != 0) {
                objM87133R32 = c28655q10.m87133R();
                if (objM87133R32 == obj) {
                    objM87133R32 = new C39211b(24);
                    c28655q10.m87172p0(objM87133R32);
                }
                function7 = (Function1) objM87133R32;
            } else {
                function7 = function3;
            }
            if (i15 != 0) {
                objM87133R31 = c28655q10.m87133R();
                if (objM87133R31 == obj) {
                    objM87133R31 = new C39211b(16);
                    c28655q10.m87172p0(objM87133R31);
                }
                function8 = (Function1) objM87133R31;
            } else {
                function8 = function4;
            }
            objM87133R = c28655q10.m87133R();
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q10.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q10.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q10.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q10.m87133R();
            if (objM87133R3 == obj) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q10.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q10.m87133R();
            if (objM87133R4 == obj) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q10.m87172p0(objM87133R4);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q10.m87133R();
            if (objM87133R5 == obj) {
                objM87133R5 = AbstractC28683x.m87272z(null);
                c28655q10.m87172p0(objM87133R5);
            }
            interfaceC28601c5 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q10.m87133R();
            if (objM87133R6 == obj) {
                objM87133R6 = AbstractC28683x.m87272z(null);
                c28655q10.m87172p0(objM87133R6);
            }
            interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
            EnumC15209z3 enumC15209z6 = EnumC15209z3.f57106w;
            c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z6, null, null, true, c28655q10, 3078, 6);
            c15199y3M3460c2 = AbstractC1118c.m3460c(enumC15209z6, null, null, true, c28655q10, 3078, 6);
            C37035f c37035fM125758v4 = m125758v0(interfaceC28601c5);
            zM87157i = c28655q10.m87157i(c15199y3M3460c);
            objM87133R7 = c28655q10.m87133R();
            if (zM87157i) {
                interfaceC28601c7 = interfaceC28601c5;
                objM87133R7 = new b(c15199y3M3460c, interfaceC28601c7, null);
                c28655q10.m87172p0(objM87133R7);
            } else {
                interfaceC28601c7 = interfaceC28601c5;
                objM87133R7 = new b(c15199y3M3460c, interfaceC28601c7, null);
                c28655q10.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R7, c37035fM125758v4);
            EnumC15209z3 enumC15209z3M43221b7 = c15199y3M3460c.m43221b();
            zM87157i2 = c28655q10.m87157i(c15199y3M3460c);
            objM87133R8 = c28655q10.m87133R();
            if (zM87157i2) {
                objM87133R8 = new c(c15199y3M3460c, interfaceC28601c7, null);
                c28655q10.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new c(c15199y3M3460c, interfaceC28601c7, null);
                c28655q10.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R8, enumC15209z3M43221b7);
            C37035f c37035fM125762x4 = m125762x0(interfaceC28601c6);
            zM87157i3 = c28655q10.m87157i(c15199y3M3460c2);
            objM87133R9 = c28655q10.m87133R();
            if (zM87157i3) {
                interfaceC28601c8 = interfaceC28601c6;
                objM87133R9 = new d(c15199y3M3460c2, interfaceC28601c8, null);
                c28655q10.m87172p0(objM87133R9);
            } else {
                interfaceC28601c8 = interfaceC28601c6;
                objM87133R9 = new d(c15199y3M3460c2, interfaceC28601c8, null);
                c28655q10.m87172p0(objM87133R9);
            }
            AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R9, c37035fM125762x4);
            EnumC15209z3 enumC15209z3M43221b8 = c15199y3M3460c2.m43221b();
            zM87157i4 = c28655q10.m87157i(c15199y3M3460c2);
            objM87133R10 = c28655q10.m87133R();
            if (zM87157i4) {
                objM87133R10 = new e(c15199y3M3460c2, interfaceC28601c8, null);
                c28655q10.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new e(c15199y3M3460c2, interfaceC28601c8, null);
                c28655q10.m87172p0(objM87133R10);
            }
            AbstractC28683x.m87253g(c28655q10, (InterfaceC4351m) objM87133R10, enumC15209z3M43221b8);
            zM87153g = c28655q10.m87153g(viewState.m118888i()) | c28655q10.m87153g(m125645B0(interfaceC28601c1));
            Object objM87133R313 = c28655q10.m87133R();
            if (zM87153g) {
                if (AbstractC39414r.m125890i0(m125645B0(interfaceC28601c1))) {
                    arrayList = viewState.m118888i();
                } else {
                    List<C37035f> listM118888i7 = viewState.m118888i();
                    arrayList = new ArrayList();
                    while (r9.hasNext()) {
                        String strM118853b7 = ((C37035f) obj4).getBiomarkerName();
                        C15199y3 c15199y16 = c15199y3M3460c;
                        Locale locale6 = Locale.ROOT;
                        upperCase = strM118853b7.toUpperCase(locale6);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        C15199y3 c15199y17 = c15199y3M3460c2;
                        upperCase2 = m125645B0(interfaceC28601c1).toUpperCase(locale6);
                        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                        if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                            arrayList.add(obj4);
                        }
                        c15199y3M3460c2 = c15199y17;
                        c15199y3M3460c = c15199y16;
                    }
                }
                c15199y3 = c15199y3M3460c;
                c15199y4 = c15199y3M3460c2;
                c28655q10.m87172p0(arrayList);
                obj2 = arrayList;
            } else {
                if (AbstractC39414r.m125890i0(m125645B0(interfaceC28601c1))) {
                    arrayList = viewState.m118888i();
                } else {
                    List<C37035f> listM118888i8 = viewState.m118888i();
                    arrayList = new ArrayList();
                    while (r9.hasNext()) {
                        String strM118853b8 = ((C37035f) obj4).getBiomarkerName();
                        C15199y3 c15199y18 = c15199y3M3460c;
                        Locale locale7 = Locale.ROOT;
                        upperCase = strM118853b8.toUpperCase(locale7);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        C15199y3 c15199y19 = c15199y3M3460c2;
                        upperCase2 = m125645B0(interfaceC28601c1).toUpperCase(locale7);
                        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                        if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                            arrayList.add(obj4);
                        }
                        c15199y3M3460c2 = c15199y19;
                        c15199y3M3460c = c15199y18;
                    }
                }
                c15199y3 = c15199y3M3460c;
                c15199y4 = c15199y3M3460c2;
                c28655q10.m87172p0(arrayList);
                obj2 = arrayList;
            }
            obj3 = (List) obj2;
            zM87153g2 = c28655q10.m87153g(obj3);
            objM87133R11 = c28655q10.m87133R();
            if (zM87153g2) {
                arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                    if (((C37035f) obj5).getIncluded()) {
                        arrayList2.add(obj5);
                    }
                }
                objM87133R11 = AbstractC25265s.m74152u1(arrayList2, new f());
                c28655q10.m87172p0(objM87133R11);
            } else {
                arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                    if (((C37035f) obj5).getIncluded()) {
                        arrayList2.add(obj5);
                    }
                }
                objM87133R11 = AbstractC25265s.m74152u1(arrayList2, new f());
                c28655q10.m87172p0(objM87133R11);
            }
            list = (List) objM87133R11;
            zM87153g3 = c28655q10.m87153g(obj3);
            objM87133R12 = c28655q10.m87133R();
            if (zM87153g3) {
                arrayList3 = new ArrayList();
                while (r7.hasNext()) {
                    if (!((C37035f) obj6).getIncluded()) {
                        arrayList3.add(obj6);
                    }
                }
                objM87133R12 = AbstractC25265s.m74152u1(arrayList3, new g());
                c28655q10.m87172p0(objM87133R12);
            } else {
                arrayList3 = new ArrayList();
                while (r7.hasNext()) {
                    if (!((C37035f) obj6).getIncluded()) {
                        arrayList3.add(obj6);
                    }
                }
                objM87133R12 = AbstractC25265s.m74152u1(arrayList3, new g());
                c28655q10.m87172p0(objM87133R12);
            }
            list2 = (List) objM87133R12;
            zM87153g4 = c28655q10.m87153g(viewState.m118888i());
            objM87133R13 = c28655q10.m87133R();
            if (zM87153g4) {
                listM118888i = viewState.m118888i();
                if (!(listM118888i instanceof Collection)) {
                    it = listM118888i.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C37035f) it.next()).getIncluded()) {
                                z13 = false;
                                break;
                            }
                        } else {
                            z13 = true;
                            break;
                        }
                    }
                } else {
                    it = listM118888i.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C37035f) it.next()).getIncluded()) {
                                z13 = false;
                                break;
                            }
                        } else {
                            z13 = true;
                            break;
                        }
                    }
                }
                objM87133R13 = Boolean.valueOf(z13);
                c28655q10.m87172p0(objM87133R13);
            } else {
                listM118888i = viewState.m118888i();
                if (!(listM118888i instanceof Collection)) {
                    it = listM118888i.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C37035f) it.next()).getIncluded()) {
                                z13 = false;
                                break;
                            }
                        } else {
                            z13 = true;
                            break;
                        }
                    }
                } else {
                    it = listM118888i.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C37035f) it.next()).getIncluded()) {
                                z13 = false;
                                break;
                            }
                        } else {
                            z13 = true;
                            break;
                        }
                    }
                }
                objM87133R13 = Boolean.valueOf(z13);
                c28655q10.m87172p0(objM87133R13);
            }
            zBooleanValue = ((Boolean) objM87133R13).booleanValue();
            if (m125685V0(interfaceC28601c2)) {
                c28655q10.m87150e0(-776385634);
                C37034e c37034eM118886g4 = viewState.getExitDialog();
                if ((i29 & 112) == 32) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                objM87133R29 = c28655q10.m87133R();
                if (z36) {
                    interfaceC28601c9 = interfaceC28601c2;
                    objM87133R29 = new C29308g(function7, interfaceC28601c9, 10);
                    c28655q10.m87172p0(objM87133R29);
                } else {
                    interfaceC28601c9 = interfaceC28601c2;
                    objM87133R29 = new C29308g(function7, interfaceC28601c9, 10);
                    c28655q10.m87172p0(objM87133R29);
                }
                InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R29;
                objM87133R30 = c28655q10.m87133R();
                if (objM87133R30 == obj) {
                    objM87133R30 = new C35429g(19, interfaceC28601c9);
                    c28655q10.m87172p0(objM87133R30);
                }
                m125702c1(c37034eM118886g4, interfaceC4339a17, (InterfaceC4339a) objM87133R30, c28655q10, C27238a0.f109008k | 384);
                c28655q10.m87173q(false);
            } else {
                interfaceC28601c8 = interfaceC28601c8;
                interfaceC28601c9 = interfaceC28601c2;
                c28655q10.m87150e0(-776066582);
                c28655q10.m87173q(false);
            }
            if (m125689X0(interfaceC28601c3)) {
                c28655q10.m87150e0(-776028390);
                C37034e c37034eM118885f4 = viewState.getDeleteDialog();
                if ((i29 & 896) == 256) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                objM87133R27 = c28655q10.m87133R();
                if (z35) {
                    interfaceC28601c21 = interfaceC28601c3;
                    objM87133R27 = new C29308g(function8, interfaceC28601c21, 11);
                    c28655q10.m87172p0(objM87133R27);
                } else {
                    interfaceC28601c21 = interfaceC28601c3;
                    objM87133R27 = new C29308g(function8, interfaceC28601c21, 11);
                    c28655q10.m87172p0(objM87133R27);
                }
                InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R27;
                objM87133R28 = c28655q10.m87133R();
                if (objM87133R28 == obj) {
                    objM87133R28 = new C35429g(20, interfaceC28601c21);
                    c28655q10.m87172p0(objM87133R28);
                }
                interfaceC28601c10 = interfaceC28601c21;
                c3 = ' ';
                interfaceC28601c11 = interfaceC28601c9;
                m125691Y0(c37034eM118885f4, interfaceC4339a18, (InterfaceC4339a) objM87133R28, null, c28655q10, C27238a0.f109008k | 384, 8);
                z14 = false;
                c28655q10.m87173q(false);
            } else {
                interfaceC28601c10 = interfaceC28601c3;
                function7 = function7;
                interfaceC28601c11 = interfaceC28601c9;
                z14 = false;
                c3 = ' ';
                c28655q10.m87150e0(-775705494);
                c28655q10.m87173q(false);
            }
            if (m125752t0(interfaceC28601c4)) {
                c28655q10.m87150e0(2053190383);
                c37033dM118891l = viewState.getPendingDependencyWarning();
                if (c37033dM118891l == null) {
                    c28655q10.m87150e0(-775607566);
                    c28655q10.m87173q(z14);
                    interfaceC28601c12 = interfaceC28601c4;
                    c7 = 256;
                } else {
                    c28655q10.m87150e0(-775607565);
                    if ((i29 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    zM87157i6 = c28655q10.m87157i(viewState) | z34;
                    objM87133R25 = c28655q10.m87133R();
                    if (zM87157i6) {
                        interfaceC28601c20 = interfaceC28601c4;
                        objM87133R25 = new C31324k(function8, viewState, interfaceC28601c20, 24);
                        c28655q10.m87172p0(objM87133R25);
                    } else {
                        interfaceC28601c20 = interfaceC28601c4;
                        objM87133R25 = new C31324k(function8, viewState, interfaceC28601c20, 24);
                        c28655q10.m87172p0(objM87133R25);
                    }
                    InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R25;
                    objM87133R26 = c28655q10.m87133R();
                    if (objM87133R26 == obj) {
                        objM87133R26 = new C35429g(21, interfaceC28601c20);
                        c28655q10.m87172p0(objM87133R26);
                    }
                    c7 = 256;
                    interfaceC28601c12 = interfaceC28601c20;
                    m125696a1(c37033dM118891l, interfaceC4339a19, (InterfaceC4339a) objM87133R26, null, c28655q10, TextResource.$stable | 384, 8);
                    z14 = false;
                    c28655q10.m87173q(false);
                }
                c28655q10.m87173q(z14);
            } else {
                interfaceC28601c12 = interfaceC28601c4;
                c7 = 256;
                c28655q10.m87150e0(-775179734);
                c28655q10.m87173q(z14);
            }
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM114675c4 = AbstractC36095b.m114675c(c2314t4, 1.0f);
            if (viewState.getTestDeletedModal() != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R14 = c28655q10.m87133R();
            if (objM87133R14 == obj) {
                objM87133R14 = new C39211b(18);
                c28655q10.m87172p0(objM87133R14);
            }
            Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifierM114675c4, z15, (Function1) objM87133R14);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q10, 0);
            iHashCode = Long.hashCode(c28655q10.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q10.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q10, modifierM44099b4);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q10.m87158i0();
            if (c28655q10.f115903S) {
                c28655q10.m87163l(interfaceC4339a);
            } else {
                c28655q10.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q10, c0209i, c23010xM66775a10);
            C0209i c0209i19 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q10, c0209i19, interfaceC28653p1M87165m10);
            c0209i2 = C0217k.f732j;
            if (c28655q10.f115903S) {
                c0209i3 = c0209i;
                if (!AbstractC22676k.m65745e(c28655q10.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i110 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q10, c0209i110, modifierM118962N10);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t4);
                AbstractC6721d.a aVar14 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                objM87133R15 = c28655q10.m87133R();
                if (objM87133R15 == obj) {
                    objM87133R15 = new C35429g(22, interfaceC28601c11);
                    c28655q10.m87172p0(objM87133R15);
                }
                i17 = i29;
                function9 = function8;
                interfaceC28601c13 = interfaceC28601c7;
                interfaceC28601c14 = interfaceC28601c8;
                C0209i c0209i111 = c0209i3;
                AbstractC6719b.m20143d(modifierM3409f7, aVar14, null, (InterfaceC4339a) objM87133R15, null, null, c28655q10, (AbstractC6721d.a.f25641r << 3) | 3078, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f115 = 8;
                float f116 = 2 * f115;
                Modifier modifierM3355a7 = AbstractC1091c.m3355a(AbstractC1099a.m3394p(f116, AbstractC30060g.m92116f0(AbstractC15674c.m44089m(new LayoutWeightElement(1.0f, true), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q10, 1), 14)), AbstractC11348f.m30574v(300, 0, null, 6), 2);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q10, 0);
                iHashCode2 = Long.hashCode(c28655q10.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q10.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q10, modifierM3355a7);
                c28655q10.m87158i0();
                if (c28655q10.f115903S) {
                    c28655q10.m87163l(interfaceC4339a);
                } else {
                    c28655q10.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q10, c0209i111, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q10, c0209i19, interfaceC28653p1M87165m11);
                if (c28655q10.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q10, c0209i110, modifierM118962N11);
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t4, ((float) 0.5d) * f115, 0.0f, 0.0f, 0.0f, 14);
                String strM118894o7 = viewState.getTitle();
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                z16 = true;
                AbstractC30795n.m94707h(strM118894o7, modifierM3398t7, c38072d.m121949b(c28655q10, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q10, i18).getT3(), null, c28655q10, 48, C2886a.f11498d << 18, 196600);
                AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f116, c2314t4));
                TextResource textResourceM21278l13 = AbstractC8693b.m21278l(m125645B0(interfaceC28601c1));
                TextResource textResourceM21278l14 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                objM87133R16 = c28655q10.m87133R();
                if (objM87133R16 == obj) {
                    objM87133R16 = new C39382e(5, interfaceC28601c1);
                    c28655q10.m87172p0(objM87133R16);
                }
                Function1 function11118 = (Function1) objM87133R16;
                i19 = TextResource.$stable;
                AbstractC17795v0.m51127j(null, textResourceM21278l13, textResourceM21278l14, null, 0L, 0, false, null, 0L, false, null, false, false, null, function11118, c28655q10, (i19 << 3) | (i19 << 6), 24576, 16377);
                c28655q2 = c28655q10;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f116, c2314t4));
                if (list.isEmpty()) {
                    c28655q2.m87150e0(1517296045);
                    AbstractC17755i2.m50938j(null, viewState.getIncludedItemsHeader().getDividerType(), viewState.getIncludedItemsHeader().getDividerTextPosition(), viewState.getIncludedItemsHeader().getTitle(), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, c28655q2, i19 << 9, 209);
                    c28655q9 = c28655q2;
                    while (r1.hasNext()) {
                        i28 = i17;
                        if ((i28 & 896) == 256) {
                            z29 = z16;
                        } else {
                            z29 = false;
                        }
                        objM87133R22 = c28655q9.m87133R();
                        if (z29) {
                            function12 = function9;
                            objM87133R22 = new C37450h(function12, 17);
                            c28655q9.m87172p0(objM87133R22);
                        } else {
                            function12 = function9;
                            objM87133R22 = new C37450h(function12, 17);
                            c28655q9.m87172p0(objM87133R22);
                        }
                        Function1 function11119 = (Function1) objM87133R22;
                        objM87133R23 = c28655q9.m87133R();
                        if (objM87133R23 == obj) {
                            interfaceC28601c18 = interfaceC28601c13;
                            objM87133R23 = new C39382e(2, interfaceC28601c18);
                            c28655q9.m87172p0(objM87133R23);
                        } else {
                            interfaceC28601c18 = interfaceC28601c13;
                        }
                        Function1 function111110 = (Function1) objM87133R23;
                        objM87133R24 = c28655q9.m87133R();
                        if (objM87133R24 == obj) {
                            interfaceC28601c19 = interfaceC28601c14;
                            objM87133R24 = new C39382e(3, interfaceC28601c19);
                            c28655q9.m87172p0(objM87133R24);
                        } else {
                            interfaceC28601c19 = interfaceC28601c14;
                        }
                        interfaceC28601c14 = interfaceC28601c19;
                        m125716h0(c37035f, function11119, function111110, (Function1) objM87133R24, c28655q9, 3456, 0);
                        i17 = i28;
                        interfaceC28601c13 = interfaceC28601c18;
                        function9 = function12;
                        z16 = true;
                    }
                    interfaceC28601c15 = interfaceC28601c14;
                    interfaceC28601c16 = interfaceC28601c13;
                    function10 = function9;
                    i24 = i17;
                    i25 = 256;
                    c28655q9.m87173q(false);
                    c28655q3 = c28655q9;
                } else {
                    interfaceC28601c15 = interfaceC28601c14;
                    interfaceC28601c16 = interfaceC28601c13;
                    function10 = function9;
                    i24 = i17;
                    i25 = 256;
                    c28655q2.m87150e0(1518504022);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f116, c2314t4));
                if (list2.isEmpty()) {
                    c28655q3.m87150e0(1518645506);
                    C28655q c28655q1111 = c28655q3;
                    function11 = function10;
                    AbstractC17755i2.m50938j(null, viewState.getNotIncludedItemsHeader().getDividerType(), viewState.getNotIncludedItemsHeader().getDividerTextPosition(), viewState.getNotIncludedItemsHeader().getTitle(), null, C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite70(), 0L, null, c28655q1111, TextResource.$stable << 9, 209);
                    c28655q8 = c28655q1111;
                    while (r15.hasNext()) {
                        boolean zM87157i13 = c28655q8.m87157i(c37035f2);
                        if ((i24 & 896) == i25) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = zM87157i13 | z27;
                        objM87133R20 = c28655q8.m87133R();
                        if (z28) {
                            objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                            c28655q8.m87172p0(objM87133R20);
                        } else {
                            objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                            c28655q8.m87172p0(objM87133R20);
                        }
                        Function1 function111111 = (Function1) objM87133R20;
                        objM87133R21 = c28655q8.m87133R();
                        if (objM87133R21 == obj) {
                            objM87133R21 = new C39382e(4, interfaceC28601c15);
                            c28655q8.m87172p0(objM87133R21);
                        }
                        m125716h0(c37035f2, function111111, null, (Function1) objM87133R21, c28655q8, 3072, 4);
                    }
                    z17 = false;
                    c28655q8.m87173q(false);
                    c28655q4 = c28655q8;
                } else {
                    function11 = function10;
                    z17 = false;
                    c28655q3.m87150e0(1520017814);
                    c28655q3.m87173q(false);
                    c28655q4 = c28655q3;
                }
                c28655q4.m87173q(true);
                z18 = z17;
                C27238a0 c27238a0M118882c7 = viewState.getButton();
                Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f116, AbstractC1102d.m3409f(1.0f, c2314t4)), "save_button");
                boolean zM87155h7 = c28655q4.m87155h(zBooleanValue) | c28655q4.m87157i(viewState);
                i26 = i24 & 896;
                if (i26 == i25) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                z24 = zM87155h7 | z19;
                Object objM87133R314 = c28655q4.m87133R();
                if (z24) {
                    Function1 function111112 = function11;
                    c4660x0 = new C4660x0(3, viewState, function111112, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                    function11 = function111112;
                    c28655q4.m87172p0(c4660x0);
                } else {
                    Function1 function111113 = function11;
                    c4660x0 = new C4660x0(3, viewState, function111113, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                    function11 = function111113;
                    c28655q4.m87172p0(c4660x0);
                }
                i27 = C27238a0.f109008k;
                interfaceC28601c17 = interfaceC28601c16;
                c15199y5 = c15199y3;
                InterfaceC28601c1 interfaceC28601c28 = interfaceC28601c15;
                AbstractC27292z.m82341h(c27238a0M118882c7, modifierM3599a7, null, (InterfaceC4339a) c4660x0, c28655q4, i27 | 48, 4);
                c28655q4.m87173q(true);
                c37035fM125758v0 = m125758v0(interfaceC28601c17);
                if (c37035fM125758v0 == null) {
                    c28655q4.m87150e0(-769722278);
                    c28655q4.m87173q(z18);
                    c28655q5 = c28655q4;
                } else {
                    c28655q4.m87150e0(-769722277);
                    C27238a0 c27238a0M118881b7 = viewState.getBottomSheetButton();
                    AbstractC35664f.a aVar15 = new AbstractC35664f.a(c15199y5);
                    boolean zM118895p7 = viewState.getIsAiConfirmation();
                    objM87133R17 = c28655q4.m87133R();
                    if (objM87133R17 == obj) {
                        objM87133R17 = new C35429g(17, interfaceC28601c17);
                        c28655q4.m87172p0(objM87133R17);
                    }
                    InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R17;
                    if (i26 == 256) {
                        z25 = true;
                    } else {
                        z25 = z18;
                    }
                    zM87157i5 = z25 | c28655q4.m87157i(c37035fM125758v0);
                    objM87133R18 = c28655q4.m87133R();
                    if (zM87157i5) {
                        objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                        c28655q4.m87172p0(objM87133R18);
                    } else {
                        objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                        c28655q4.m87172p0(objM87133R18);
                    }
                    C28655q c28655q1112 = c28655q4;
                    AbstractC39384g.m125633r(null, c37035fM125758v0, c27238a0M118881b7, aVar15, zM118895p7, interfaceC4339a110, (InterfaceC4351m) objM87133R18, c28655q1112, (i27 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (AbstractC35664f.a.f151587c << 9), 1);
                    C28655q c28655q1113 = c28655q1112;
                    c28655q1113.m87173q(z18);
                    c28655q5 = c28655q1113;
                }
                c37035fM125762x0 = m125762x0(interfaceC28601c28);
                if (c37035fM125762x0 == null) {
                    c28655q5.m87150e0(-769079059);
                    c28655q5.m87173q(z18);
                    c28655q7 = c28655q5;
                } else {
                    c28655q5.m87150e0(-769079058);
                    if (viewState.getCalculationEducationTitle() != null) {
                        c28655q5.m87150e0(1634809784);
                        c28655q5.m87173q(z18);
                        c28655q6 = c28655q5;
                    } else {
                        c28655q5.m87150e0(1634809784);
                        c28655q5.m87173q(z18);
                        c28655q6 = c28655q5;
                    }
                    c28655q6.m87173q(z18);
                    c28655q7 = c28655q6;
                }
                c37039jM118893n = viewState.getTestDeletedModal();
                if (c37039jM118893n == null) {
                    c28655q7.m87150e0(-768459927);
                    c28655q7.m87173q(z18);
                } else {
                    c28655q7.m87150e0(-768459926);
                    if ((i24 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = z18;
                    }
                    objM87133R19 = c28655q7.m87133R();
                    if (z26) {
                        objM87133R19 = new C36681f(function7, 26);
                        c28655q7.m87172p0(objM87133R19);
                    } else {
                        objM87133R19 = new C36681f(function7, 26);
                        c28655q7.m87172p0(objM87133R19);
                    }
                    m125738o1(c37039jM118893n, (InterfaceC4339a) objM87133R19, c28655q7, i27);
                    c28655q7.m87173q(z18);
                }
                function6 = function11;
                function5 = function7;
                c28655q = c28655q7;
            } else {
                c0209i3 = c0209i;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q10, iHashCode, c0209i2);
            C0209i c0209i112 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q10, c0209i112, modifierM118962N10);
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t4);
            AbstractC6721d.a aVar16 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            objM87133R15 = c28655q10.m87133R();
            if (objM87133R15 == obj) {
                objM87133R15 = new C35429g(22, interfaceC28601c11);
                c28655q10.m87172p0(objM87133R15);
            }
            i17 = i29;
            function9 = function8;
            interfaceC28601c13 = interfaceC28601c7;
            interfaceC28601c14 = interfaceC28601c8;
            C0209i c0209i113 = c0209i3;
            AbstractC6719b.m20143d(modifierM3409f8, aVar16, null, (InterfaceC4339a) objM87133R15, null, null, c28655q10, (AbstractC6721d.a.f25641r << 3) | 3078, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f117 = 8;
            float f118 = 2 * f117;
            Modifier modifierM3355a8 = AbstractC1091c.m3355a(AbstractC1099a.m3394p(f118, AbstractC30060g.m92116f0(AbstractC15674c.m44089m(new LayoutWeightElement(1.0f, true), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q10, 1), 14)), AbstractC11348f.m30574v(300, 0, null, 6), 2);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q10, 0);
            iHashCode2 = Long.hashCode(c28655q10.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q10.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q10, modifierM3355a8);
            c28655q10.m87158i0();
            if (c28655q10.f115903S) {
                c28655q10.m87163l(interfaceC4339a);
            } else {
                c28655q10.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q10, c0209i113, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q10, c0209i19, interfaceC28653p1M87165m12);
            if (c28655q10.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q10, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q10, c0209i112, modifierM118962N12);
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t4, ((float) 0.5d) * f117, 0.0f, 0.0f, 0.0f, 14);
            String strM118894o8 = viewState.getTitle();
            c38072d = C38072d.f163053a;
            i18 = C38072d.f163054b;
            z16 = true;
            AbstractC30795n.m94707h(strM118894o8, modifierM3398t8, c38072d.m121949b(c28655q10, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q10, i18).getT3(), null, c28655q10, 48, C2886a.f11498d << 18, 196600);
            AbstractC22953f.m66715b(c28655q10, AbstractC1102d.m3411h(f118, c2314t4));
            TextResource textResourceM21278l15 = AbstractC8693b.m21278l(m125645B0(interfaceC28601c1));
            TextResource textResourceM21278l16 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
            objM87133R16 = c28655q10.m87133R();
            if (objM87133R16 == obj) {
                objM87133R16 = new C39382e(5, interfaceC28601c1);
                c28655q10.m87172p0(objM87133R16);
            }
            Function1 function111114 = (Function1) objM87133R16;
            i19 = TextResource.$stable;
            AbstractC17795v0.m51127j(null, textResourceM21278l15, textResourceM21278l16, null, 0L, 0, false, null, 0L, false, null, false, false, null, function111114, c28655q10, (i19 << 3) | (i19 << 6), 24576, 16377);
            c28655q2 = c28655q10;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f118, c2314t4));
            if (list.isEmpty()) {
                c28655q2.m87150e0(1517296045);
                AbstractC17755i2.m50938j(null, viewState.getIncludedItemsHeader().getDividerType(), viewState.getIncludedItemsHeader().getDividerTextPosition(), viewState.getIncludedItemsHeader().getTitle(), null, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, c28655q2, i19 << 9, 209);
                c28655q9 = c28655q2;
                while (r1.hasNext()) {
                    i28 = i17;
                    if ((i28 & 896) == 256) {
                        z29 = z16;
                    } else {
                        z29 = false;
                    }
                    objM87133R22 = c28655q9.m87133R();
                    if (z29) {
                        function12 = function9;
                        objM87133R22 = new C37450h(function12, 17);
                        c28655q9.m87172p0(objM87133R22);
                    } else {
                        function12 = function9;
                        objM87133R22 = new C37450h(function12, 17);
                        c28655q9.m87172p0(objM87133R22);
                    }
                    Function1 function111115 = (Function1) objM87133R22;
                    objM87133R23 = c28655q9.m87133R();
                    if (objM87133R23 == obj) {
                        interfaceC28601c18 = interfaceC28601c13;
                        objM87133R23 = new C39382e(2, interfaceC28601c18);
                        c28655q9.m87172p0(objM87133R23);
                    } else {
                        interfaceC28601c18 = interfaceC28601c13;
                    }
                    Function1 function111116 = (Function1) objM87133R23;
                    objM87133R24 = c28655q9.m87133R();
                    if (objM87133R24 == obj) {
                        interfaceC28601c19 = interfaceC28601c14;
                        objM87133R24 = new C39382e(3, interfaceC28601c19);
                        c28655q9.m87172p0(objM87133R24);
                    } else {
                        interfaceC28601c19 = interfaceC28601c14;
                    }
                    interfaceC28601c14 = interfaceC28601c19;
                    m125716h0(c37035f, function111115, function111116, (Function1) objM87133R24, c28655q9, 3456, 0);
                    i17 = i28;
                    interfaceC28601c13 = interfaceC28601c18;
                    function9 = function12;
                    z16 = true;
                }
                interfaceC28601c15 = interfaceC28601c14;
                interfaceC28601c16 = interfaceC28601c13;
                function10 = function9;
                i24 = i17;
                i25 = 256;
                c28655q9.m87173q(false);
                c28655q3 = c28655q9;
            } else {
                interfaceC28601c15 = interfaceC28601c14;
                interfaceC28601c16 = interfaceC28601c13;
                function10 = function9;
                i24 = i17;
                i25 = 256;
                c28655q2.m87150e0(1518504022);
                c28655q2.m87173q(false);
                c28655q3 = c28655q2;
            }
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(f118, c2314t4));
            if (list2.isEmpty()) {
                c28655q3.m87150e0(1518645506);
                C28655q c28655q1114 = c28655q3;
                function11 = function10;
                AbstractC17755i2.m50938j(null, viewState.getNotIncludedItemsHeader().getDividerType(), viewState.getNotIncludedItemsHeader().getDividerTextPosition(), viewState.getNotIncludedItemsHeader().getTitle(), null, C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite70(), 0L, null, c28655q1114, TextResource.$stable << 9, 209);
                c28655q8 = c28655q1114;
                while (r15.hasNext()) {
                    boolean zM87157i14 = c28655q8.m87157i(c37035f2);
                    if ((i24 & 896) == i25) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = zM87157i14 | z27;
                    objM87133R20 = c28655q8.m87133R();
                    if (z28) {
                        objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                        c28655q8.m87172p0(objM87133R20);
                    } else {
                        objM87133R20 = new C37082e1(c37035f2, function11, interfaceC28601c16, 14);
                        c28655q8.m87172p0(objM87133R20);
                    }
                    Function1 function111117 = (Function1) objM87133R20;
                    objM87133R21 = c28655q8.m87133R();
                    if (objM87133R21 == obj) {
                        objM87133R21 = new C39382e(4, interfaceC28601c15);
                        c28655q8.m87172p0(objM87133R21);
                    }
                    m125716h0(c37035f2, function111117, null, (Function1) objM87133R21, c28655q8, 3072, 4);
                }
                z17 = false;
                c28655q8.m87173q(false);
                c28655q4 = c28655q8;
            } else {
                function11 = function10;
                z17 = false;
                c28655q3.m87150e0(1520017814);
                c28655q3.m87173q(false);
                c28655q4 = c28655q3;
            }
            c28655q4.m87173q(true);
            z18 = z17;
            C27238a0 c27238a0M118882c8 = viewState.getButton();
            Modifier modifierM3599a8 = AbstractC1136a.m3599a(AbstractC1099a.m3394p(f118, AbstractC1102d.m3409f(1.0f, c2314t4)), "save_button");
            boolean zM87155h8 = c28655q4.m87155h(zBooleanValue) | c28655q4.m87157i(viewState);
            i26 = i24 & 896;
            if (i26 == i25) {
                z19 = true;
            } else {
                z19 = z18;
            }
            z24 = zM87155h8 | z19;
            Object objM87133R315 = c28655q4.m87133R();
            if (z24) {
                Function1 function111118 = function11;
                c4660x0 = new C4660x0(3, viewState, function111118, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                function11 = function111118;
                c28655q4.m87172p0(c4660x0);
            } else {
                Function1 function111119 = function11;
                c4660x0 = new C4660x0(3, viewState, function111119, interfaceC28601c10, interfaceC28601c12, zBooleanValue);
                function11 = function111119;
                c28655q4.m87172p0(c4660x0);
            }
            i27 = C27238a0.f109008k;
            interfaceC28601c17 = interfaceC28601c16;
            c15199y5 = c15199y3;
            InterfaceC28601c1 interfaceC28601c29 = interfaceC28601c15;
            AbstractC27292z.m82341h(c27238a0M118882c8, modifierM3599a8, null, (InterfaceC4339a) c4660x0, c28655q4, i27 | 48, 4);
            c28655q4.m87173q(true);
            c37035fM125758v0 = m125758v0(interfaceC28601c17);
            if (c37035fM125758v0 == null) {
                c28655q4.m87150e0(-769722278);
                c28655q4.m87173q(z18);
                c28655q5 = c28655q4;
            } else {
                c28655q4.m87150e0(-769722277);
                C27238a0 c27238a0M118881b8 = viewState.getBottomSheetButton();
                AbstractC35664f.a aVar17 = new AbstractC35664f.a(c15199y5);
                boolean zM118895p8 = viewState.getIsAiConfirmation();
                objM87133R17 = c28655q4.m87133R();
                if (objM87133R17 == obj) {
                    objM87133R17 = new C35429g(17, interfaceC28601c17);
                    c28655q4.m87172p0(objM87133R17);
                }
                InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R17;
                if (i26 == 256) {
                    z25 = true;
                } else {
                    z25 = z18;
                }
                zM87157i5 = z25 | c28655q4.m87157i(c37035fM125758v0);
                objM87133R18 = c28655q4.m87133R();
                if (zM87157i5) {
                    objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                    c28655q4.m87172p0(objM87133R18);
                } else {
                    objM87133R18 = new C36100c(function11, (Object) c37035fM125758v0, (Object) interfaceC28601c17, 10);
                    c28655q4.m87172p0(objM87133R18);
                }
                C28655q c28655q1115 = c28655q4;
                AbstractC39384g.m125633r(null, c37035fM125758v0, c27238a0M118881b8, aVar17, zM118895p8, interfaceC4339a111, (InterfaceC4351m) objM87133R18, c28655q1115, (i27 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (AbstractC35664f.a.f151587c << 9), 1);
                C28655q c28655q1116 = c28655q1115;
                c28655q1116.m87173q(z18);
                c28655q5 = c28655q1116;
            }
            c37035fM125762x0 = m125762x0(interfaceC28601c29);
            if (c37035fM125762x0 == null) {
                c28655q5.m87150e0(-769079059);
                c28655q5.m87173q(z18);
                c28655q7 = c28655q5;
            } else {
                c28655q5.m87150e0(-769079058);
                if (viewState.getCalculationEducationTitle() != null) {
                    c28655q5.m87150e0(1634809784);
                    c28655q5.m87173q(z18);
                    c28655q6 = c28655q5;
                } else {
                    c28655q5.m87150e0(1634809784);
                    c28655q5.m87173q(z18);
                    c28655q6 = c28655q5;
                }
                c28655q6.m87173q(z18);
                c28655q7 = c28655q6;
            }
            c37039jM118893n = viewState.getTestDeletedModal();
            if (c37039jM118893n == null) {
                c28655q7.m87150e0(-768459927);
                c28655q7.m87173q(z18);
            } else {
                c28655q7.m87150e0(-768459926);
                if ((i24 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = z18;
                }
                objM87133R19 = c28655q7.m87133R();
                if (z26) {
                    objM87133R19 = new C36681f(function7, 26);
                    c28655q7.m87172p0(objM87133R19);
                } else {
                    objM87133R19 = new C36681f(function7, 26);
                    c28655q7.m87172p0(objM87133R19);
                }
                m125738o1(c37039jM118893n, (InterfaceC4339a) objM87133R19, c28655q7, i27);
                c28655q7.m87173q(z18);
            }
            function6 = function11;
            function5 = function7;
            c28655q = c28655q7;
        } else {
            c28655q10.m87138X();
            function5 = function3;
            function6 = function4;
            c28655q = c28655q10;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(viewState, function5, function6, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C23454a0 m125741p1(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m125743q0(AbstractC35866a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C23454a0 m125744q1(C37039j c37039j, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m125738o1(c37039j, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m125746r0(AbstractC37036g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s0 */
    private static final void m125749s0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: t0 */
    private static final boolean m125752t0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u0 */
    private static final void m125755u0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C37035f m125758v0(InterfaceC28601c1 interfaceC28601c1) {
        return (C37035f) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m125760w0(InterfaceC28601c1 interfaceC28601c1, C37035f c37035f) {
        interfaceC28601c1.setValue(c37035f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C37035f m125762x0(InterfaceC28601c1 interfaceC28601c1) {
        return (C37035f) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m125764y0(InterfaceC28601c1 interfaceC28601c1, C37035f c37035f) {
        interfaceC28601c1.setValue(c37035f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m125766z0(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m125687W0(interfaceC28601c1, false);
        function1.invoke(AbstractC35866a.a.f152695a);
        return C23454a0.f92919a;
    }
}
