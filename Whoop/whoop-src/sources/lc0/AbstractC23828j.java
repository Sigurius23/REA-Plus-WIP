package lc0;

import am2.C1044u;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bs1.C3590i;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io2.C20769k0;
import iy0.C21026a;
import java.util.Iterator;
import jc0.C21604d;
import jc0.InterfaceC21601a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kw1.C22852c;
import l01.C23045q;
import l72.C23399f;
import l72.C23401h;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23124k3;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39281n;
import y71.C39282o;

/* JADX INFO: renamed from: lc0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aW\u0010!\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0003¢\u0006\u0004\b!\u0010\"¨\u0006%²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ljc0/d$c$a;", "viewState", "Lkotlin/Function1;", "Ljc0/a;", "Ll83/a0;", "onEvent", "o", "(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "title", "subtitle", "Lkd1/o;", "imageUrl", "Lc41/p2;", "infoCallout", "D", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;Landroidx/compose/runtime/Composer;II)V", "header", "Lgz0/m0;", "icon", "Lkotlin/Function0;", "onIconClick", "G", "(Ljava/lang/String;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Ljc0/d$d;", "selectedOption", "footerText", "nextButtonTitle", "saveButtonTitle", "", "isButtonEnabled", "onNextClick", "onSaveClick", "B", "(Ljc0/d$d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "selectedOptionId", "showBottomSheet", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23828j {

    /* JADX INFO: renamed from: lc0.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.view.HormonalContextSingleSelectScreenKt$HormonalContextSingleSelectScreen$2$1", m100430f = "HormonalContextSingleSelectScreen.kt", m100431l = {79, 81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f94262w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f94263x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f94264y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C23196w3 c23196w3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f94263x = c23196w3;
            this.f94264y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f94263x, this.f94264y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r5.m67150b(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r5.m67152d(r4) == r0) goto L17;
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
                int r1 = r4.f94262w
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
                p1.c1 r5 = r4.f94264y
                boolean r5 = lc0.AbstractC23828j.m69990K(r5)
                if (r5 == 0) goto L2f
                l1.w3 r5 = r4.f94263x
                r4.f94262w = r3
                java.lang.Object r5 = r5.m67150b(r4)
                if (r5 != r0) goto L3a
                goto L39
            L2f:
                l1.w3 r5 = r4.f94263x
                r4.f94262w = r2
                java.lang.Object r5 = r5.m67152d(r4)
                if (r5 != r0) goto L3a
            L39:
                return r0
            L3a:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: lc0.AbstractC23828j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: lc0.j$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f94265w = new b();

        /* JADX INFO: renamed from: a */
        public final long m70017a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m70017a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m69980A(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m70011u(interfaceC28601c1, false);
        function1.invoke(InterfaceC21601a.g.f82833a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m69981B(C21604d.d dVar, String str, String str2, String str3, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        boolean z13;
        C2314t c2314t;
        C28655q c28655q2;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1938773457);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87153g(dVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87153g(str2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q3.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q3.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q3.m87157i(interfaceC4339a) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q3.m87157i(interfaceC4339a2) ? 1048576 : 524288;
        }
        int i15 = i14;
        if (c28655q3.m87135U(i15 & 1, (i15 & 599187) != 599186)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t2), 3 * f13, f14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            if (str == null) {
                c28655q3.m87150e0(1228357211);
                c28655q3.m87173q(false);
                c28655q2 = c28655q3;
                c2314t = c2314t2;
                z13 = false;
            } else {
                c28655q3.m87150e0(1228357212);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                z13 = false;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(str, modifierM3409f, c38072d.m121949b(c28655q3, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i16).getB2(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            }
            if ((dVar != null ? dVar.getNextScreenId() : null) != null) {
                c28655q2.m87150e0(1228705497);
                C28655q c28655q4 = c28655q2;
                AbstractC27292z.m82343j(AbstractC1102d.m3409f(1.0f, c2314t), z4, false, null, null, null, AbstractC8693b.m21278l(str2), null, null, null, 0.0f, null, null, interfaceC4339a, c28655q4, ((i15 >> 9) & 112) | 6 | (TextResource.$stable << 18), (i15 >> 6) & 7168, 8124);
                c28655q = c28655q4;
                c28655q.m87173q(z13);
            } else {
                c28655q2.m87150e0(1228959449);
                int i17 = i15 >> 9;
                C28655q c28655q5 = c28655q2;
                AbstractC27292z.m82343j(AbstractC1102d.m3409f(1.0f, c2314t), z4, false, null, null, null, AbstractC8693b.m21278l(str3), null, null, null, 0.0f, null, null, interfaceC4339a2, c28655q5, (i17 & 112) | 6 | (TextResource.$stable << 18), i17 & 7168, 8124);
                c28655q = c28655q5;
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1044u(dVar, str, str2, str3, z4, interfaceC4339a, interfaceC4339a2, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m69982C(C21604d.d dVar, String str, String str2, String str3, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m69981B(dVar, str, str2, str3, z4, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0101  */
    /* JADX WARN: Code duplicated, block: B:74:0x0113  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x022a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0237  */
    /* JADX WARN: Code duplicated, block: B:83:0x0251  */
    /* JADX WARN: Code duplicated, block: B:86:0x0274  */
    /* JADX WARN: Code duplicated, block: B:89:0x0280  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    private static final void m69983D(String str, String str2, AbstractC22403o abstractC22403o, C4092p2 c4092p2, Composer composer, int i13, int i14) {
        String str3;
        int i15;
        String str4;
        int i16;
        boolean zM87157i;
        int i17;
        int i18;
        boolean zM87157i2;
        int i19;
        boolean z4;
        AbstractC22403o abstractC22403o2;
        C4092p2 c4092p3;
        String str5;
        C28677v1 c28677v1M87180u;
        String str6;
        AbstractC22403o abstractC22403o3;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        C2314t c2314t2;
        C38072d c38072d;
        int i24;
        int i25;
        String str7;
        boolean z14;
        Object objM87133R;
        C4092p2 c4092p4;
        C4092p2 c4092p5 = c4092p2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1050594137);
        if ((i13 & 6) == 0) {
            str3 = str;
            i15 = (c28655q.m87153g(str3) ? 4 : 2) | i13;
        } else {
            str3 = str;
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                str4 = str2;
                i15 |= c28655q.m87153g(str4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                if ((i13 & 512) == 0) {
                    zM87157i = c28655q.m87153g(abstractC22403o);
                } else {
                    zM87157i = c28655q.m87157i(abstractC22403o);
                }
                if (zM87157i) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                i15 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if ((i13 & 4096) == 0) {
                    zM87157i2 = c28655q.m87153g(c4092p5);
                } else {
                    zM87157i2 = c28655q.m87157i(c4092p5);
                }
                if (zM87157i2) {
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
                if (i26 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i16 != 0) {
                    abstractC22403o3 = null;
                } else {
                    abstractC22403o3 = abstractC22403o;
                }
                if (i18 != 0) {
                    c4092p5 = null;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
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
                if (abstractC22403o3 == null) {
                    c28655q.m87150e0(-1489349910);
                    c28655q.m87173q(false);
                    z13 = false;
                    c2314t2 = c2314t;
                } else {
                    c28655q.m87150e0(-1489349909);
                    float f13 = 4;
                    z13 = false;
                    c2314t2 = c2314t;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(20 * f13, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13 * 8, 7)), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                C2886a c2886aM8417O = c38072d.m121952e(c28655q, i24).getT2();
                i25 = C2886a.f11498d << 18;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(str3, modifierM3409f2, c38072d.m121949b(c28655q, i24).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, (i15 & 14) | 48, i25, 196088);
                c28655q = c28655q2;
                if (str6 == null) {
                    c28655q.m87150e0(-1488769218);
                    c28655q.m87173q(z13);
                    str7 = str6;
                } else {
                    c28655q.m87150e0(-1488769217);
                    AbstractC11266d.m30469w((float) 0.5d, 8, c2314t2, c28655q);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C2886a c2886aM8420a = c38072d.m121952e(c28655q, i24).getB1();
                    String str8 = str6;
                    AbstractC30795n.m94707h(str8, modifierM3409f3, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 48, i25, 196088);
                    str7 = str8;
                    c28655q.m87173q(z13);
                }
                if (c4092p5 == 0) {
                    c28655q = c28655q;
                    c28655q.m87150e0(-1488415229);
                    c28655q.m87173q(z13);
                    c4092p4 = c4092p5;
                    z14 = true;
                } else {
                    c28655q = c28655q;
                    c28655q.m87150e0(-1488415228);
                    z14 = true;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, 0.0f, 4 * 8, 1);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C23825g(1);
                        c28655q.m87172p0(objM87133R);
                    }
                    c4092p4 = c4092p5;
                    AbstractC4106r2.m12647f(modifierM3396r, c4092p4, (Function1) objM87133R, c28655q, (C4092p2.f16593v << 3) | 390, 0);
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(z14);
                str5 = str7;
                c4092p3 = c4092p4;
                abstractC22403o2 = abstractC22403o3;
            } else {
                c28655q.m87138X();
                abstractC22403o2 = abstractC22403o;
                c4092p3 = c4092p5;
                str5 = str4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(str, str5, abstractC22403o2, c4092p3, i13, i14, 6);
            }
        }
        i15 |= 48;
        str4 = str2;
        i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            if ((i13 & 512) == 0) {
                zM87157i = c28655q.m87153g(abstractC22403o);
            } else {
                zM87157i = c28655q.m87157i(abstractC22403o);
            }
            if (zM87157i) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            if ((i13 & 4096) == 0) {
                zM87157i2 = c28655q.m87153g(c4092p5);
            } else {
                zM87157i2 = c28655q.m87157i(c4092p5);
            }
            if (zM87157i2) {
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
            if (i26 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if (i16 != 0) {
                abstractC22403o3 = null;
            } else {
                abstractC22403o3 = abstractC22403o;
            }
            if (i18 != 0) {
                c4092p5 = null;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
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
            if (abstractC22403o3 == null) {
                c28655q.m87150e0(-1489349910);
                c28655q.m87173q(false);
                z13 = false;
                c2314t2 = c2314t;
            } else {
                c28655q.m87150e0(-1489349909);
                float f14 = 4;
                z13 = false;
                c2314t2 = c2314t;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(20 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14 * 8, 7)), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t2);
            c38072d = C38072d.f163053a;
            i24 = C38072d.f163054b;
            C2886a c2886aM8417O2 = c38072d.m121952e(c28655q, i24).getT2();
            i25 = C2886a.f11498d << 18;
            C28655q c28655q3 = c28655q;
            AbstractC30795n.m94707h(str3, modifierM3409f5, c38072d.m121949b(c28655q, i24).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q3, (i15 & 14) | 48, i25, 196088);
            c28655q = c28655q3;
            if (str6 == null) {
                c28655q.m87150e0(-1488769218);
                c28655q.m87173q(z13);
                str7 = str6;
            } else {
                c28655q.m87150e0(-1488769217);
                AbstractC11266d.m30469w((float) 0.5d, 8, c2314t2, c28655q);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C2886a c2886aM8420a2 = c38072d.m121952e(c28655q, i24).getB1();
                String str9 = str6;
                AbstractC30795n.m94707h(str9, modifierM3409f6, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 48, i25, 196088);
                str7 = str9;
                c28655q.m87173q(z13);
            }
            if (c4092p5 == 0) {
                c28655q = c28655q;
                c28655q.m87150e0(-1488415229);
                c28655q.m87173q(z13);
                c4092p4 = c4092p5;
                z14 = true;
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(-1488415228);
                z14 = true;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t2, 0.0f, 4 * 8, 1);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C23825g(1);
                    c28655q.m87172p0(objM87133R);
                }
                c4092p4 = c4092p5;
                AbstractC4106r2.m12647f(modifierM3396r2, c4092p4, (Function1) objM87133R, c28655q, (C4092p2.f16593v << 3) | 390, 0);
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(z14);
            str5 = str7;
            c4092p3 = c4092p4;
            abstractC22403o2 = abstractC22403o3;
        } else {
            c28655q.m87138X();
            abstractC22403o2 = abstractC22403o;
            c4092p3 = c4092p5;
            str5 = str4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c(str, str5, abstractC22403o2, c4092p3, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m69984E(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m69985F(String str, String str2, AbstractC22403o abstractC22403o, C4092p2 c4092p2, int i13, int i14, Composer composer, int i15) {
        m69983D(str, str2, abstractC22403o, c4092p2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0163  */
    /* JADX WARN: Code duplicated, block: B:59:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: G */
    private static final void m69986G(String str, EnumC16313m0 enumC16313m0, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a5;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1630603044);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC16313m0.ordinal()) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23399f(12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                C2314t c2314t = C2314t.f9131w;
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 0.5d) * f13, 7);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * f13), C2299e.f9108K, c28655q, 54);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                interfaceC4339a4 = interfaceC4339a3;
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getFormLabel(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                float f14 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f14 * f14, c2314t);
                z13 = (i15 & 896) == 256;
                objM87133R = c28655q.m87133R();
                if (!z13 || objM87133R == c28676v0) {
                    interfaceC4339a5 = interfaceC4339a4;
                    objM87133R = new C21026a(interfaceC4339a5, 26);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC4339a5 = interfaceC4339a4;
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62323f0), AbstractC1092a.m3362g(modifierM3419p, false, null, null, (InterfaceC4339a) objM87133R, 15), c38072d.m121949b(c28655q, i17).getBrandWhite(), c28655q, 0, 0);
                c28655q.m87173q(true);
                interfaceC4339a2 = interfaceC4339a5;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 4, str, enumC16313m0, interfaceC4339a2);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23399f(12);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            float f15 = 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 0.0f, 0.0f, ((float) 0.5d) * f15, 7);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * f15), C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            interfaceC4339a4 = interfaceC4339a3;
            AbstractC30795n.m94707h(str, null, c38072d2.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getFormLabel(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            float f16 = 4;
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f16 * f16, c2314t2);
            if ((i15 & 896) == 256) {
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                interfaceC4339a5 = interfaceC4339a4;
                objM87133R = new C21026a(interfaceC4339a5, 26);
                c28655q.m87172p0(objM87133R);
            } else {
                interfaceC4339a5 = interfaceC4339a4;
                objM87133R = new C21026a(interfaceC4339a5, 26);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62323f0), AbstractC1092a.m3362g(modifierM3419p2, false, null, null, (InterfaceC4339a) objM87133R, 15), c38072d2.m121949b(c28655q, i18).getBrandWhite(), c28655q, 0, 0);
            c28655q.m87173q(true);
            interfaceC4339a2 = interfaceC4339a5;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 4, str, enumC16313m0, interfaceC4339a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m69987H() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m69988I(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m69989J(String str, EnumC16313m0 enumC16313m0, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m69986G(str, enumC16313m0, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:104:0x0303  */
    /* JADX WARN: Code duplicated, block: B:107:0x0310  */
    /* JADX WARN: Code duplicated, block: B:110:0x0368 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x036e  */
    /* JADX WARN: Code duplicated, block: B:118:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x03df  */
    /* JADX WARN: Code duplicated, block: B:126:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:129:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:133:0x03fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:137:0x040d  */
    /* JADX WARN: Code duplicated, block: B:138:0x040f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x0422  */
    /* JADX WARN: Code duplicated, block: B:145:0x0442  */
    /* JADX WARN: Code duplicated, block: B:156:0x047f  */
    /* JADX WARN: Code duplicated, block: B:158:0x048b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0495  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x018a  */
    /* JADX WARN: Code duplicated, block: B:63:0x018c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x019d  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x022f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0233  */
    /* JADX WARN: Code duplicated, block: B:80:0x0240  */
    /* JADX WARN: Code duplicated, block: B:82:0x024e  */
    /* JADX WARN: Code duplicated, block: B:87:0x028c  */
    /* JADX WARN: Code duplicated, block: B:88:0x028e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0297 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x029f  */
    /* JADX WARN: Code duplicated, block: B:98:0x02cb  */
    /* JADX INFO: renamed from: o */
    public static final void m70005o(C21604d.c.a aVar, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87153g;
        Object objM87133R;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        C23196w3 c23196w3M67108l;
        boolean zM87153g2;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i15;
        int iM53357C;
        float f13;
        int i16;
        boolean z13;
        boolean z14;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        C2314t c2314t;
        float f14;
        Function1 function5;
        float f15;
        float f16;
        int iHashCode2;
        float f17;
        boolean z15;
        Object objM87133R5;
        Function1 function6;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        Iterator<T> it;
        Object next;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R6;
        boolean z19;
        boolean zM87157i;
        Object objM87133R7;
        String strM60761c;
        TextResource textResourceM21278l;
        Object objM87133R8;
        InterfaceC28601c1 interfaceC28601c5;
        boolean zM87153g3;
        Object objM87133R9;
        Object objM87133R10;
        C21604d.c.a viewState = aVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1859935487);
        int i17 = 2;
        int i18 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(viewState) ? 4 : 2) : i13;
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i18 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i18 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C23825g(i17);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function4 = (Function1) objM87133R10;
                } else {
                    function4 = function2;
                }
                zM87153g = c28655q.m87153g(viewState.getSelectedOptionId());
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getSelectedOptionId());
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                EnumC23202x3 enumC23202x3 = EnumC23202x3.f91820w;
                c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
                Boolean boolValueOf = Boolean.valueOf(m70010t(interfaceC28601c1));
                zM87153g2 = c28655q.m87153g(c23196w3M67108l);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new a(c23196w3M67108l, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, boolValueOf);
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2));
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i15 = i18;
                } else {
                    i15 = i18;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    if (viewState.getIsFirstScreen()) {
                        iM53357C = EnumC16313m0.CROSS.toWhoopIcon();
                    } else {
                        iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                    }
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(null, null, Integer.valueOf(iM53357C), null, null, null, null, null, false, null, null, null, null, null, null, null, 65531, null);
                    f13 = 8;
                    float f18 = 1 * f13;
                    float f19 = 4;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3394p(f18, c2314t2), 0.0f, 0.0f, 0.0f, f19 * f13, 7);
                    boolean zM87157i2 = c28655q.m87157i(viewState);
                    i16 = i15 & 112;
                    if (i16 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i2 | z13;
                    objM87133R4 = c28655q.m87133R();
                    if (z14 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C23045q(7, viewState, function4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = interfaceC28601c6;
                    c2314t = c2314t2;
                    f14 = f19;
                    function5 = function4;
                    f15 = 1.0f;
                    AbstractC6719b.m20143d(modifierM3398t, aVar2, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    f16 = 3;
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC15674c.m44082f(AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f16 * f13, 0.0f, 2), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    f17 = 0.0f;
                    m69983D(aVar.getTitle(), aVar.getSubtitle(), aVar.getImageUrl(), aVar.getInfoCallout(), c28655q, (AbstractC22403o.f87638a << 6) | (C4092p2.f16593v << 9), 0);
                    String strM60751g = aVar.getOptionsHeader();
                    EnumC16313m0 enumC16313m0M60752h = aVar.getOptionsHeaderIcon();
                    if (i16 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (!z15 || objM87133R5 == c28676v0) {
                        function6 = function5;
                        interfaceC28601c3 = interfaceC28601c1;
                        objM87133R5 = new C3590i(function6, interfaceC28601c3, 22);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function6 = function5;
                        interfaceC28601c3 = interfaceC28601c1;
                    }
                    m69986G(strM60751g, enumC16313m0M60752h, (InterfaceC4339a) objM87133R5, c28655q, 0, 0);
                    c28655q.m87150e0(-1166691162);
                    for (C21604d.d dVar : aVar.m60750f()) {
                        C2314t c2314t3 = c2314t;
                        float f24 = f14;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(f15, c2314t3), f16, f24), f17, ((float) 0.5d) * f13, 1);
                        C39282o.Companion companion = C39282o.INSTANCE;
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(dVar.getTitle());
                        strM60761c = dVar.getSubtitle();
                        if (strM60761c != null || (textResourceM21278l = AbstractC8693b.m21278l(strM60761c)) == null) {
                            textResourceM21278l = AbstractC8693b.m21278l("");
                        }
                        TextResource textResource = textResourceM21278l;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = b.f94265w;
                            c28655q.m87172p0(objM87133R8);
                        }
                        C39282o c39282oM125229d = C39282o.Companion.m125229d(companion, textResourceM21278l2, null, null, textResource, p745y81.Function1.m125323a((Function1) objM87133R8), null, null, null, null, null, null, null, null, null, false, AbstractC22676k.m65745e(m70008r(interfaceC28601c2), dVar.getId()), null, false, null, null, dVar, false, null, 7307238, null);
                        interfaceC28601c5 = interfaceC28601c2;
                        zM87153g3 = c28655q.m87153g(interfaceC28601c5) | c28655q.m87153g(dVar);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R9 == c28676v0) {
                            objM87133R9 = new C23045q(8, dVar, interfaceC28601c5);
                            c28655q.m87172p0(objM87133R9);
                        }
                        interfaceC28601c2 = interfaceC28601c5;
                        AbstractC39281n.m125207c(modifierM3396r, c39282oM125229d, (InterfaceC4339a) objM87133R9, c28655q, C39282o.f168987q << 3, 0);
                        f14 = f24;
                        c2314t = c2314t3;
                        f15 = 1.0f;
                        f17 = 0.0f;
                    }
                    interfaceC28601c4 = interfaceC28601c2;
                    AbstractC18489d0.m53356B(c28655q, false, c2314t, f18, c28655q);
                    c28655q.m87173q(true);
                    it = aVar.m60750f().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC22676k.m65745e(((C21604d.d) next).getId(), m70008r(interfaceC28601c4)));
                    C21604d.d dVar2 = (C21604d.d) next;
                    String strM60746b = aVar.getFooterText();
                    String strM60749e = aVar.getNextButtonTitle();
                    String strM60753i = aVar.getSaveButtonTitle();
                    if (m70008r(interfaceC28601c4) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    viewState = aVar;
                    boolean zM87157i3 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c4);
                    if (i16 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i3 | z17;
                    objM87133R6 = c28655q.m87133R();
                    if (z18 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C23827i(viewState, function6, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
                    if (i16 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = c28655q.m87157i(viewState) | z19 | c28655q.m87153g(interfaceC28601c4);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i || objM87133R7 == c28676v0) {
                        objM87133R7 = new C23827i(function6, viewState, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R7);
                    }
                    m69981B(dVar2, strM60746b, strM60749e, strM60753i, z16, interfaceC4339a, (InterfaceC4339a) objM87133R7, c28655q, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    if (m70010t(interfaceC28601c3) || viewState.getBottomSheet() == null) {
                        c28655q.m87150e0(39605281);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(39322747);
                        C21604d.b bVarM60745a = viewState.getBottomSheet();
                        boolean z24 = i16 == 32;
                        Object objM87133R11 = c28655q.m87133R();
                        if (z24 || objM87133R11 == c28676v0) {
                            objM87133R11 = new C3590i(function6, interfaceC28601c3, 23);
                            c28655q.m87172p0(objM87133R11);
                        }
                        AbstractC23820b.m69932g(null, bVarM60745a, c23196w3M67108l, (InterfaceC4339a) objM87133R11, c28655q, C27256h.f109055z << 3, 1);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    function3 = function6;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                if (viewState.getIsFirstScreen()) {
                    iM53357C = EnumC16313m0.CROSS.toWhoopIcon();
                } else {
                    iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                }
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(null, null, Integer.valueOf(iM53357C), null, null, null, null, null, false, null, null, null, null, null, null, null, 65531, null);
                f13 = 8;
                float f110 = 1 * f13;
                float f111 = 4;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(f110, c2314t2), 0.0f, 0.0f, 0.0f, f111 * f13, 7);
                boolean zM87157i4 = c28655q.m87157i(viewState);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i4 | z13;
                objM87133R4 = c28655q.m87133R();
                if (z14) {
                    objM87133R4 = new C23045q(7, viewState, function4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C23045q(7, viewState, function4);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = interfaceC28601c6;
                c2314t = c2314t2;
                f14 = f111;
                function5 = function4;
                f15 = 1.0f;
                AbstractC6719b.m20143d(modifierM3398t2, aVar3, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f16 = 3;
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC15674c.m44082f(AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f16 * f13, 0.0f, 2), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                f17 = 0.0f;
                m69983D(aVar.getTitle(), aVar.getSubtitle(), aVar.getImageUrl(), aVar.getInfoCallout(), c28655q, (AbstractC22403o.f87638a << 6) | (C4092p2.f16593v << 9), 0);
                String strM60751g2 = aVar.getOptionsHeader();
                EnumC16313m0 enumC16313m0M60752h2 = aVar.getOptionsHeaderIcon();
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z15) {
                    function6 = function5;
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R5 = new C3590i(function6, interfaceC28601c3, 22);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function6 = function5;
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R5 = new C3590i(function6, interfaceC28601c3, 22);
                    c28655q.m87172p0(objM87133R5);
                }
                m69986G(strM60751g2, enumC16313m0M60752h2, (InterfaceC4339a) objM87133R5, c28655q, 0, 0);
                c28655q.m87150e0(-1166691162);
                while (r8.hasNext()) {
                    C2314t c2314t4 = c2314t;
                    float f25 = f14;
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(f15, c2314t4), f16, f25), f17, ((float) 0.5d) * f13, 1);
                    C39282o.Companion companion2 = C39282o.INSTANCE;
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(dVar.getTitle());
                    strM60761c = dVar.getSubtitle();
                    if (strM60761c != null) {
                        textResourceM21278l = AbstractC8693b.m21278l("");
                    } else {
                        textResourceM21278l = AbstractC8693b.m21278l("");
                    }
                    TextResource textResource2 = textResourceM21278l;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = b.f94265w;
                        c28655q.m87172p0(objM87133R8);
                    }
                    C39282o c39282oM125229d2 = C39282o.Companion.m125229d(companion2, textResourceM21278l3, null, null, textResource2, p745y81.Function1.m125323a((Function1) objM87133R8), null, null, null, null, null, null, null, null, null, false, AbstractC22676k.m65745e(m70008r(interfaceC28601c2), dVar.getId()), null, false, null, null, dVar, false, null, 7307238, null);
                    interfaceC28601c5 = interfaceC28601c2;
                    zM87153g3 = c28655q.m87153g(interfaceC28601c5) | c28655q.m87153g(dVar);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R9 = new C23045q(8, dVar, interfaceC28601c5);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C23045q(8, dVar, interfaceC28601c5);
                        c28655q.m87172p0(objM87133R9);
                    }
                    interfaceC28601c2 = interfaceC28601c5;
                    AbstractC39281n.m125207c(modifierM3396r2, c39282oM125229d2, (InterfaceC4339a) objM87133R9, c28655q, C39282o.f168987q << 3, 0);
                    f14 = f25;
                    c2314t = c2314t4;
                    f15 = 1.0f;
                    f17 = 0.0f;
                }
                interfaceC28601c4 = interfaceC28601c2;
                AbstractC18489d0.m53356B(c28655q, false, c2314t, f110, c28655q);
                c28655q.m87173q(true);
                it = aVar.m60750f().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((C21604d.d) next).getId(), m70008r(interfaceC28601c4)));
                C21604d.d dVar3 = (C21604d.d) next;
                String strM60746b2 = aVar.getFooterText();
                String strM60749e2 = aVar.getNextButtonTitle();
                String strM60753i2 = aVar.getSaveButtonTitle();
                if (m70008r(interfaceC28601c4) != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                viewState = aVar;
                boolean zM87157i5 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c4);
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i5 | z17;
                objM87133R6 = c28655q.m87133R();
                if (z18) {
                    objM87133R6 = new C23827i(viewState, function6, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C23827i(viewState, function6, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                if (i16 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = c28655q.m87157i(viewState) | z19 | c28655q.m87153g(interfaceC28601c4);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R7 = new C23827i(function6, viewState, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C23827i(function6, viewState, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R7);
                }
                m69981B(dVar3, strM60746b2, strM60749e2, strM60753i2, z16, interfaceC4339a2, (InterfaceC4339a) objM87133R7, c28655q, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (m70010t(interfaceC28601c3)) {
                    c28655q.m87150e0(39605281);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(39605281);
                    c28655q.m87173q(false);
                }
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function3, i14, 20);
            }
        }
        i18 |= 48;
        function2 = function1;
        if ((i18 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i18 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C23825g(i17);
                    c28655q.m87172p0(objM87133R10);
                }
                function4 = (Function1) objM87133R10;
            } else {
                function4 = function2;
            }
            zM87153g = c28655q.m87153g(viewState.getSelectedOptionId());
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC28683x.m87272z(viewState.getSelectedOptionId());
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(viewState.getSelectedOptionId());
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            EnumC23202x3 enumC23202x4 = EnumC23202x3.f91820w;
            c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
            Boolean boolValueOf2 = Boolean.valueOf(m70010t(interfaceC28601c1));
            zM87153g2 = c28655q.m87153g(c23196w3M67108l);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R3 = new a(c23196w3M67108l, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(c23196w3M67108l, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, boolValueOf2);
            C2314t c2314t5 = C2314t.f9131w;
            Modifier modifierM44028b1 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t5));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44028b1);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i15 = i18;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                if (viewState.getIsFirstScreen()) {
                    iM53357C = EnumC16313m0.CROSS.toWhoopIcon();
                } else {
                    iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                }
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(null, null, Integer.valueOf(iM53357C), null, null, null, null, null, false, null, null, null, null, null, null, null, 65531, null);
                f13 = 8;
                float f112 = 1 * f13;
                float f113 = 4;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(f112, c2314t5), 0.0f, 0.0f, 0.0f, f113 * f13, 7);
                boolean zM87157i6 = c28655q.m87157i(viewState);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i6 | z13;
                objM87133R4 = c28655q.m87133R();
                if (z14) {
                    objM87133R4 = new C23045q(7, viewState, function4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C23045q(7, viewState, function4);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = interfaceC28601c7;
                c2314t = c2314t5;
                f14 = f113;
                function5 = function4;
                f15 = 1.0f;
                AbstractC6719b.m20143d(modifierM3398t3, aVar4, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                f16 = 3;
                Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC15674c.m44082f(AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f16 * f13, 0.0f, 2), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM92116f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                f17 = 0.0f;
                m69983D(aVar.getTitle(), aVar.getSubtitle(), aVar.getImageUrl(), aVar.getInfoCallout(), c28655q, (AbstractC22403o.f87638a << 6) | (C4092p2.f16593v << 9), 0);
                String strM60751g3 = aVar.getOptionsHeader();
                EnumC16313m0 enumC16313m0M60752h3 = aVar.getOptionsHeaderIcon();
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z15) {
                    function6 = function5;
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R5 = new C3590i(function6, interfaceC28601c3, 22);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function6 = function5;
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R5 = new C3590i(function6, interfaceC28601c3, 22);
                    c28655q.m87172p0(objM87133R5);
                }
                m69986G(strM60751g3, enumC16313m0M60752h3, (InterfaceC4339a) objM87133R5, c28655q, 0, 0);
                c28655q.m87150e0(-1166691162);
                while (r8.hasNext()) {
                    C2314t c2314t6 = c2314t;
                    float f26 = f14;
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(f15, c2314t6), f16, f26), f17, ((float) 0.5d) * f13, 1);
                    C39282o.Companion companion3 = C39282o.INSTANCE;
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(dVar.getTitle());
                    strM60761c = dVar.getSubtitle();
                    if (strM60761c != null) {
                        textResourceM21278l = AbstractC8693b.m21278l("");
                    } else {
                        textResourceM21278l = AbstractC8693b.m21278l("");
                    }
                    TextResource textResource3 = textResourceM21278l;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = b.f94265w;
                        c28655q.m87172p0(objM87133R8);
                    }
                    C39282o c39282oM125229d3 = C39282o.Companion.m125229d(companion3, textResourceM21278l4, null, null, textResource3, p745y81.Function1.m125323a((Function1) objM87133R8), null, null, null, null, null, null, null, null, null, false, AbstractC22676k.m65745e(m70008r(interfaceC28601c2), dVar.getId()), null, false, null, null, dVar, false, null, 7307238, null);
                    interfaceC28601c5 = interfaceC28601c2;
                    zM87153g3 = c28655q.m87153g(interfaceC28601c5) | c28655q.m87153g(dVar);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R9 = new C23045q(8, dVar, interfaceC28601c5);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C23045q(8, dVar, interfaceC28601c5);
                        c28655q.m87172p0(objM87133R9);
                    }
                    interfaceC28601c2 = interfaceC28601c5;
                    AbstractC39281n.m125207c(modifierM3396r3, c39282oM125229d3, (InterfaceC4339a) objM87133R9, c28655q, C39282o.f168987q << 3, 0);
                    f14 = f26;
                    c2314t = c2314t6;
                    f15 = 1.0f;
                    f17 = 0.0f;
                }
                interfaceC28601c4 = interfaceC28601c2;
                AbstractC18489d0.m53356B(c28655q, false, c2314t, f112, c28655q);
                c28655q.m87173q(true);
                it = aVar.m60750f().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((C21604d.d) next).getId(), m70008r(interfaceC28601c4)));
                C21604d.d dVar4 = (C21604d.d) next;
                String strM60746b3 = aVar.getFooterText();
                String strM60749e3 = aVar.getNextButtonTitle();
                String strM60753i3 = aVar.getSaveButtonTitle();
                if (m70008r(interfaceC28601c4) != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                viewState = aVar;
                boolean zM87157i7 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c4);
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i7 | z17;
                objM87133R6 = c28655q.m87133R();
                if (z18) {
                    objM87133R6 = new C23827i(viewState, function6, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C23827i(viewState, function6, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R6;
                if (i16 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = c28655q.m87157i(viewState) | z19 | c28655q.m87153g(interfaceC28601c4);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R7 = new C23827i(function6, viewState, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C23827i(function6, viewState, interfaceC28601c4);
                    c28655q.m87172p0(objM87133R7);
                }
                m69981B(dVar4, strM60746b3, strM60749e3, strM60753i3, z16, interfaceC4339a3, (InterfaceC4339a) objM87133R7, c28655q, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (m70010t(interfaceC28601c3)) {
                    c28655q.m87150e0(39605281);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(39605281);
                    c28655q.m87173q(false);
                }
                function3 = function6;
            } else {
                i15 = i18;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            if (viewState.getIsFirstScreen()) {
                iM53357C = EnumC16313m0.CROSS.toWhoopIcon();
            } else {
                iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
            }
            AbstractC6721d.a aVar5 = new AbstractC6721d.a(null, null, Integer.valueOf(iM53357C), null, null, null, null, null, false, null, null, null, null, null, null, null, 65531, null);
            f13 = 8;
            float f114 = 1 * f13;
            float f115 = 4;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3394p(f114, c2314t5), 0.0f, 0.0f, 0.0f, f115 * f13, 7);
            boolean zM87157i8 = c28655q.m87157i(viewState);
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i8 | z13;
            objM87133R4 = c28655q.m87133R();
            if (z14) {
                objM87133R4 = new C23045q(7, viewState, function4);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C23045q(7, viewState, function4);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c2 = interfaceC28601c7;
            c2314t = c2314t5;
            f14 = f115;
            function5 = function4;
            f15 = 1.0f;
            AbstractC6719b.m20143d(modifierM3398t4, aVar5, null, (InterfaceC4339a) objM87133R4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            f16 = 3;
            Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC15674c.m44082f(AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f16 * f13, 0.0f, 2), 0.0f, 1, null), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM92116f3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            f17 = 0.0f;
            m69983D(aVar.getTitle(), aVar.getSubtitle(), aVar.getImageUrl(), aVar.getInfoCallout(), c28655q, (AbstractC22403o.f87638a << 6) | (C4092p2.f16593v << 9), 0);
            String strM60751g4 = aVar.getOptionsHeader();
            EnumC16313m0 enumC16313m0M60752h4 = aVar.getOptionsHeaderIcon();
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R5 = c28655q.m87133R();
            if (z15) {
                function6 = function5;
                interfaceC28601c3 = interfaceC28601c1;
                objM87133R5 = new C3590i(function6, interfaceC28601c3, 22);
                c28655q.m87172p0(objM87133R5);
            } else {
                function6 = function5;
                interfaceC28601c3 = interfaceC28601c1;
                objM87133R5 = new C3590i(function6, interfaceC28601c3, 22);
                c28655q.m87172p0(objM87133R5);
            }
            m69986G(strM60751g4, enumC16313m0M60752h4, (InterfaceC4339a) objM87133R5, c28655q, 0, 0);
            c28655q.m87150e0(-1166691162);
            while (r8.hasNext()) {
                C2314t c2314t7 = c2314t;
                float f27 = f14;
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(f15, c2314t7), f16, f27), f17, ((float) 0.5d) * f13, 1);
                C39282o.Companion companion4 = C39282o.INSTANCE;
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(dVar.getTitle());
                strM60761c = dVar.getSubtitle();
                if (strM60761c != null) {
                    textResourceM21278l = AbstractC8693b.m21278l("");
                } else {
                    textResourceM21278l = AbstractC8693b.m21278l("");
                }
                TextResource textResource4 = textResourceM21278l;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = b.f94265w;
                    c28655q.m87172p0(objM87133R8);
                }
                C39282o c39282oM125229d4 = C39282o.Companion.m125229d(companion4, textResourceM21278l5, null, null, textResource4, p745y81.Function1.m125323a((Function1) objM87133R8), null, null, null, null, null, null, null, null, null, false, AbstractC22676k.m65745e(m70008r(interfaceC28601c2), dVar.getId()), null, false, null, null, dVar, false, null, 7307238, null);
                interfaceC28601c5 = interfaceC28601c2;
                zM87153g3 = c28655q.m87153g(interfaceC28601c5) | c28655q.m87153g(dVar);
                objM87133R9 = c28655q.m87133R();
                if (zM87153g3) {
                    objM87133R9 = new C23045q(8, dVar, interfaceC28601c5);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C23045q(8, dVar, interfaceC28601c5);
                    c28655q.m87172p0(objM87133R9);
                }
                interfaceC28601c2 = interfaceC28601c5;
                AbstractC39281n.m125207c(modifierM3396r4, c39282oM125229d4, (InterfaceC4339a) objM87133R9, c28655q, C39282o.f168987q << 3, 0);
                f14 = f27;
                c2314t = c2314t7;
                f15 = 1.0f;
                f17 = 0.0f;
            }
            interfaceC28601c4 = interfaceC28601c2;
            AbstractC18489d0.m53356B(c28655q, false, c2314t, f114, c28655q);
            c28655q.m87173q(true);
            it = aVar.m60750f().iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((C21604d.d) next).getId(), m70008r(interfaceC28601c4)));
            C21604d.d dVar5 = (C21604d.d) next;
            String strM60746b4 = aVar.getFooterText();
            String strM60749e4 = aVar.getNextButtonTitle();
            String strM60753i4 = aVar.getSaveButtonTitle();
            if (m70008r(interfaceC28601c4) != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            viewState = aVar;
            boolean zM87157i9 = c28655q.m87157i(viewState) | c28655q.m87153g(interfaceC28601c4);
            if (i16 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zM87157i9 | z17;
            objM87133R6 = c28655q.m87133R();
            if (z18) {
                objM87133R6 = new C23827i(viewState, function6, interfaceC28601c4);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C23827i(viewState, function6, interfaceC28601c4);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
            if (i16 == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            zM87157i = c28655q.m87157i(viewState) | z19 | c28655q.m87153g(interfaceC28601c4);
            objM87133R7 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R7 = new C23827i(function6, viewState, interfaceC28601c4);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C23827i(function6, viewState, interfaceC28601c4);
                c28655q.m87172p0(objM87133R7);
            }
            m69981B(dVar5, strM60746b4, strM60749e4, strM60753i4, z16, interfaceC4339a4, (InterfaceC4339a) objM87133R7, c28655q, 0);
            c28655q = c28655q;
            c28655q.m87173q(true);
            if (m70010t(interfaceC28601c3)) {
                c28655q.m87150e0(39605281);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(39605281);
                c28655q.m87173q(false);
            }
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(viewState, i13, function3, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m70006p(InterfaceC21601a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m70007q(C21604d.c.a aVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70005o(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final String m70008r(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m70009s(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final boolean m70010t(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    private static final void m70011u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m70012v(C21604d.c.a aVar, Function1 function1) {
        if (aVar.getIsFirstScreen()) {
            function1.invoke(InterfaceC21601a.c.f82827a);
        } else {
            function1.invoke(InterfaceC21601a.b.f82826a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m70013w(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m70011u(interfaceC28601c1, true);
        function1.invoke(InterfaceC21601a.g.f82833a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m70014x(C21604d.d dVar, InterfaceC28601c1 interfaceC28601c1) {
        m70009s(interfaceC28601c1, dVar.getId());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m70015y(C21604d.c.a aVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        Object next;
        Iterator<T> it = aVar.m60750f().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C21604d.d) next).getId(), m70008r(interfaceC28601c1)));
        C21604d.d dVar = (C21604d.d) next;
        function1.invoke(new InterfaceC21601a.f(dVar != null ? dVar.getNextScreenId() : null, aVar.getTestId(), m70008r(interfaceC28601c1), "USER"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m70016z(Function1 function1, C21604d.c.a aVar, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(new InterfaceC21601a.f(null, aVar.getTestId(), m70008r(interfaceC28601c1), "USER"));
        return C23454a0.f92919a;
    }
}
