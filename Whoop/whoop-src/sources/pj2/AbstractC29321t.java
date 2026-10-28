package pj2;

import android.view.View;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.stress.domain.BreathingEvent;
import ej2.AbstractC13265b;
import ej2.AbstractC13266c;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import hg3.AbstractC17269i;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import js2.C21929g;
import l83.C23454a0;
import l83.C23465k;
import lj2.AbstractC24480f;
import nj2.C26762i;
import nj2.C26764k;
import nj2.EnumC26772s;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27198e;
import nx1.C27225g;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import o81.C27656a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p353o0.C27325i;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p62.C28947h;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p698au1.C2061f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import p725ot1.C28329e;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pc3.C29096r;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35679m0;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: pj2.t */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a]\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006!²\u0006\u000e\u0010\u001b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lnj2/k;", "viewState", "", "Lcom/whoop/stress/domain/BreathingEvent;", "breathingEvents", "Lnj2/s;", "saveState", "", "isError", "Lkotlin/Function1;", "Llj2/f;", "Ll83/a0;", "onEvent", "Lkotlin/Function0;", "onBackPressed", "D", "(Lnj2/k;Ljava/util/List;Lnj2/s;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "saveSession", "onStartNextCycleClicked", "t", "(Lnj2/k;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "y", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "A", "(Landroidx/compose/runtime/Composer;I)V", "showFinishSessionDialog", "", "ongoingTimeInSeconds", "", "continuousToolbarSubtitle", "showFinishSession", "stress_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29321t {

    /* JADX INFO: renamed from: pj2.t$a */
    @InterfaceC32271e(m100429c = "com.whoop.stress.view.StressSessionExerciseScreenKt$Body$1$1$1", m100430f = "StressSessionExerciseScreen.kt", m100431l = {194}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f118758w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f118759x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118759x = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f118759x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118758w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f118758w = 1;
                if (AbstractC3034m0.m8782b(1200L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f118759x.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pj2.t$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"pj2/t$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f118760a;

        public b(View view) {
            this.f118760a = view;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f118760a.setKeepScreenOn(false);
        }
    }

    /* JADX INFO: renamed from: pj2.t$c */
    @InterfaceC32271e(m100429c = "com.whoop.stress.view.StressSessionExerciseScreenKt$StressSessionExerciseScreen$2$1$1$1", m100430f = "StressSessionExerciseScreen.kt", m100431l = {84}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f118761E;

        /* JADX INFO: renamed from: w */
        int f118762w;

        /* JADX INFO: renamed from: x */
        int f118763x;

        /* JADX INFO: renamed from: y */
        int f118764y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f118765z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f118765z = interfaceC28601c1;
            this.f118761E = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f118765z, this.f118761E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118764y;
            if (i13 != 0 && i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            while (AbstractC29321t.m89204O(this.f118765z) > 0) {
                int iM89204O = AbstractC29321t.m89204O(this.f118765z) % 60;
                int iM89204O2 = AbstractC29321t.m89204O(this.f118765z) / 60;
                AbstractC29321t.m89207R(this.f118761E, String.format("%02d:%02d", Arrays.copyOf(new Object[]{new Integer(iM89204O2), new Integer(iM89204O)}, 2)));
                InterfaceC28601c1 interfaceC28601c1 = this.f118765z;
                AbstractC29321t.m89205P(interfaceC28601c1, AbstractC29321t.m89204O(interfaceC28601c1) - 1);
                this.f118762w = iM89204O;
                this.f118763x = iM89204O2;
                this.f118764y = 1;
                if (AbstractC3034m0.m8782b(1000L, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pj2.t$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f118766w = new d();

        /* JADX INFO: renamed from: a */
        public final long m89243a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m89243a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m89190A(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2067976375);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
            boolean zM87157i = c28655q.m87157i(view);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21929g(view, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC28620h0 m89191B(View view, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        view.setKeepScreenOn(true);
        return new b(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m89192C(int i13, Composer composer, int i14) {
        m89190A(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:107:0x0201  */
    /* JADX WARN: Code duplicated, block: B:110:0x023c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0266  */
    /* JADX WARN: Code duplicated, block: B:114:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0276  */
    /* JADX WARN: Code duplicated, block: B:121:0x0283  */
    /* JADX WARN: Code duplicated, block: B:122:0x0285  */
    /* JADX WARN: Code duplicated, block: B:126:0x028e  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:145:0x0302  */
    /* JADX WARN: Code duplicated, block: B:148:0x0312  */
    /* JADX WARN: Code duplicated, block: B:149:0x0314  */
    /* JADX WARN: Code duplicated, block: B:153:0x0322  */
    /* JADX WARN: Code duplicated, block: B:157:0x0379  */
    /* JADX WARN: Code duplicated, block: B:161:0x038e  */
    /* JADX WARN: Code duplicated, block: B:162:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:171:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:173:0x043a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0440  */
    /* JADX WARN: Code duplicated, block: B:177:0x0470  */
    /* JADX WARN: Code duplicated, block: B:178:0x0472  */
    /* JADX WARN: Code duplicated, block: B:182:0x047b  */
    /* JADX WARN: Code duplicated, block: B:185:0x048c  */
    /* JADX WARN: Code duplicated, block: B:186:0x048e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0497  */
    /* JADX WARN: Code duplicated, block: B:192:0x04cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:195:0x0501  */
    /* JADX WARN: Code duplicated, block: B:196:0x0503  */
    /* JADX WARN: Code duplicated, block: B:200:0x050c  */
    /* JADX WARN: Code duplicated, block: B:203:0x051d  */
    /* JADX WARN: Code duplicated, block: B:204:0x051f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0528  */
    /* JADX WARN: Code duplicated, block: B:210:0x055f  */
    /* JADX WARN: Code duplicated, block: B:212:0x056b  */
    /* JADX WARN: Code duplicated, block: B:215:0x0575  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0138  */
    /* JADX WARN: Code duplicated, block: B:86:0x014c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0156  */
    /* JADX WARN: Code duplicated, block: B:91:0x0169  */
    /* JADX WARN: Code duplicated, block: B:94:0x01af  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX INFO: renamed from: D */
    public static final void m89193D(C26764k c26764k, List<BreathingEvent> breathingEvents, EnumC26772s enumC26772s, boolean z4, Function1 onEvent, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Integer numM79690l;
        Object objM87133R4;
        ?? r10;
        Object objM87133R5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C27656a c27656a;
        Object objM87133R6;
        C28676v0 c28676v1;
        int i16;
        int i17;
        boolean z14;
        boolean zM87157i;
        Object objM87133R7;
        boolean z15;
        Object objM87133R8;
        boolean z16;
        boolean z17;
        C26762i c26762iM79683e;
        Object objM87133R9;
        Object objM87133R10;
        boolean z18;
        Object objM87133R11;
        boolean z19;
        boolean zM87157i2;
        Object objM87133R12;
        Integer numM79690l2;
        int iIntValue;
        int i18;
        List list;
        int i19;
        boolean z24;
        Object objM87133R13;
        boolean z25;
        Object objM87133R14;
        int i24;
        boolean z26;
        Object objM87133R15;
        boolean z27;
        Object objM87133R16;
        boolean z28;
        Object objM87133R17;
        Object objM87133R18;
        AbstractC22676k.m65750j(breathingEvents, "breathingEvents");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1008481767);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c26764k) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(breathingEvents) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC26772s == null ? -1 : enumC26772s.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i25 = i14 & 32;
        if (i25 == 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R18 = c28655q.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C29096r(11);
                        c28655q.m87172p0(objM87133R18);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R18;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (c26764k == null) {
                    c28655q.m87150e0(-383702822);
                    c28655q.m87173q(false);
                    c28676v1 = c28676v0;
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                    z17 = true;
                } else {
                    c28655q.m87150e0(-383702821);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        numM79690l2 = c26764k.getTotalInterventionLengthInSeconds();
                        if (numM79690l2 != null) {
                            iIntValue = numM79690l2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        objM87133R2 = AbstractC11895b.m32005x(iIntValue, c28655q);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(String.format("%02d:%02d", Arrays.copyOf(new Object[]{0, 0}, 2)));
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    numM79690l = c26764k.getTotalInterventionLengthInSeconds();
                    if (numM79690l == null) {
                        c28655q.m87150e0(-1063662372);
                        c28655q.m87173q(false);
                        r10 = 0;
                    } else {
                        c28655q.m87150e0(-1063662371);
                        Integer numValueOf = Integer.valueOf(numM79690l.intValue());
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new c(interfaceC28601c2, interfaceC28601c3, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, numValueOf);
                        r10 = 0;
                        c28655q.m87173q(false);
                    }
                    m89190A(c28655q, r10);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C27325i(10, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, r10, c28655q, 48, 1);
                    Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, r10);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
                    if (c26764k.getToolbarSubtitle() != null) {
                        c27656a = c26764k.getToolbarSubtitle();
                    } else if (c26764k.getTotalInterventionLengthInSeconds() != null) {
                        c27656a = new C27656a(AbstractC8693b.m21278l(m89206Q(interfaceC28601c3)), true);
                    } else {
                        c27656a = null;
                    }
                    AbstractC6721d.a aVar = new AbstractC6721d.a(c26764k.getTitle(), c27656a, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65520, null);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C27325i(11, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R6;
                    int i26 = (AbstractC6721d.a.f25641r << 3) | 3072;
                    c28676v1 = c28676v0;
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                    AbstractC6719b.m20143d(null, aVar, null, interfaceC4339a5, null, null, c28655q, i26, 53);
                    i17 = i15 & 57344;
                    if (i17 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = c28655q.m87157i(breathingEvents) | z14;
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i || objM87133R7 == c28676v1) {
                        objM87133R7 = new C29320s(breathingEvents, 1, onEvent);
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R7;
                    if (i17 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z15 || objM87133R8 == c28676v1) {
                        objM87133R8 = new C28947h(onEvent, 13);
                        c28655q.m87172p0(objM87133R8);
                    }
                    m89236t(c26764k, interfaceC4339a6, (InterfaceC4339a) objM87133R8, c28655q, i15 & 14);
                    if (m89195F(interfaceC28601c1)) {
                        c28655q.m87150e0(1705283861);
                        c26762iM79683e = c26764k.getFinishDialog();
                        if (c26762iM79683e == null) {
                            c28655q.m87150e0(1324192140);
                            z16 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1324192141);
                            TextResource textResourceM79678c = c26762iM79683e.getTitle();
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v1) {
                                objM87133R9 = d.f118766w;
                                c28655q.m87172p0(objM87133R9);
                            }
                            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R9);
                            TextResource textResourceM79677b = c26762iM79683e.getPrimaryButton();
                            TextResource textResourceM79676a = c26762iM79683e.getCancel();
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v1) {
                                objM87133R10 = new C27325i(12, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R10);
                            }
                            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R10;
                            if (i17 == 16384) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objM87133R11 = c28655q.m87133R();
                            if (z18 || objM87133R11 == c28676v1) {
                                objM87133R11 = new C28947h(onEvent, 11);
                                c28655q.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R11;
                            if (i17 == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i2 = c28655q.m87157i(breathingEvents) | z19;
                            objM87133R12 = c28655q.m87133R();
                            if (zM87157i2 || objM87133R12 == c28676v1) {
                                objM87133R12 = new C29320s(breathingEvents, 0, onEvent);
                                c28655q.m87172p0(objM87133R12);
                            }
                            int i27 = TextResource.$stable;
                            AbstractC21211n.m59497o(null, textResourceM79678c, null, textResourceM79677b, false, interfaceC39332eM125323a, null, null, null, textResourceM79676a, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a7, interfaceC4339a8, (InterfaceC4339a) objM87133R12, null, null, null, c28655q, (i27 << 3) | (i27 << 9) | (i27 << 27), 0, 384, 239074773);
                            c28655q = c28655q;
                            z16 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z16);
                    } else {
                        z16 = false;
                        c28655q.m87150e0(1324803771);
                        c28655q.m87173q(false);
                    }
                    z17 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(z16);
                }
                if (enumC26772s == EnumC26772s.SAVING) {
                    c28655q.m87150e0(1511736258);
                    C28655q c28655q2 = c28655q;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.e(new TextResource.C8688b(AbstractC13266c.f45945q, null, 2, null == true ? 1 : 0), C38072d.f163053a.m121951d().getConnections().getCloud()), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    i18 = 2;
                    list = null;
                    if (enumC26772s == EnumC26772s.SAVED) {
                        c28655q.m87150e0(1511746439);
                        if ((i15 & 57344) == i16) {
                            z28 = z17;
                        } else {
                            z28 = false;
                        }
                        objM87133R17 = c28655q.m87133R();
                        if (z28 || objM87133R17 == c28676v1) {
                            objM87133R17 = new C28947h(onEvent, 12);
                            c28655q.m87172p0(objM87133R17);
                        }
                        C28655q c28655q3 = c28655q;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, (InterfaceC4339a) objM87133R17, 3, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q3;
                        c28655q.m87173q(false);
                    } else if (enumC26772s == EnumC26772s.ERROR) {
                        c28655q.m87150e0(-380205742);
                        AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC13266c.f45941m, list, i18, null == true ? 1 : 0), false, null, 6, null);
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC13266c.f45939k, null == true ? 1 : 0, i18, null == true ? 1 : 0);
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC13266c.f45936h, null == true ? 1 : 0, i18, null == true ? 1 : 0);
                        i24 = i15 & 458752;
                        if (i24 == 131072) {
                            z26 = z17;
                        } else {
                            z26 = false;
                        }
                        objM87133R15 = c28655q.m87133R();
                        if (z26 || objM87133R15 == c28676v1) {
                            objM87133R15 = new C28329e(interfaceC4339a4, 12);
                            c28655q.m87172p0(objM87133R15);
                        }
                        InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R15;
                        if (i24 == 131072) {
                            z27 = z17;
                        } else {
                            z27 = false;
                        }
                        objM87133R16 = c28655q.m87133R();
                        if (z27 || objM87133R16 == c28676v1) {
                            objM87133R16 = new C28329e(interfaceC4339a4, 13);
                            c28655q.m87172p0(objM87133R16);
                        }
                        InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R16;
                        int i28 = AbstractC33208p0.b.f138467h;
                        int i29 = TextResource.C8688b.f25889c;
                        C28655q c28655q4 = c28655q;
                        AbstractC33199m0.m105214F(bVar, c8688b, interfaceC4339a9, c8688b2, interfaceC4339a10, false, false, null, null, null, false, false, c28655q4, i28 | (i29 << 3) | (i29 << 9), 0, 4064);
                        c28655q = c28655q4;
                        c28655q.m87173q(false);
                    } else if (z4) {
                        c28655q.m87150e0(-379782220);
                        AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC13266c.f45941m, null == true ? 1 : 0, i18, null == true ? 1 : 0), false, null, 6, null);
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC13266c.f45940l, null == true ? 1 : 0, i18, null == true ? 1 : 0);
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC13266c.f45936h, null == true ? 1 : 0, i18, null == true ? 1 : 0);
                        i19 = i15 & 458752;
                        if (i19 == 131072) {
                            z24 = z17;
                        } else {
                            z24 = false;
                        }
                        objM87133R13 = c28655q.m87133R();
                        if (z24 || objM87133R13 == c28676v1) {
                            objM87133R13 = new C28329e(interfaceC4339a4, 14);
                            c28655q.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R13;
                        if (i19 == 131072) {
                            z25 = z17;
                        } else {
                            z25 = false;
                        }
                        objM87133R14 = c28655q.m87133R();
                        if (z25 || objM87133R14 == c28676v1) {
                            objM87133R14 = new C28329e(interfaceC4339a4, 15);
                            c28655q.m87172p0(objM87133R14);
                        }
                        InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R14;
                        int i34 = AbstractC33208p0.b.f138467h;
                        int i35 = TextResource.C8688b.f25889c;
                        C28655q c28655q5 = c28655q;
                        AbstractC33199m0.m105214F(bVar2, c8688b3, interfaceC4339a11, c8688b4, interfaceC4339a12, false, false, null, null, null, false, false, c28655q5, i34 | (i35 << 3) | (i35 << 9), 0, 4064);
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-379387063);
                        c28655q.m87173q(false);
                    }
                }
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(c26764k, breathingEvents, enumC26772s, z4, onEvent, interfaceC4339a3, i13, i14, 16);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((74899 & i15) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R18 = c28655q.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = new C29096r(11);
                    c28655q.m87172p0(objM87133R18);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R18;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (c26764k == null) {
                c28655q.m87150e0(-383702822);
                c28655q.m87173q(false);
                c28676v1 = c28676v0;
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                z17 = true;
            } else {
                c28655q.m87150e0(-383702821);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    numM79690l2 = c26764k.getTotalInterventionLengthInSeconds();
                    if (numM79690l2 != null) {
                        iIntValue = numM79690l2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    objM87133R2 = AbstractC11895b.m32005x(iIntValue, c28655q);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(String.format("%02d:%02d", Arrays.copyOf(new Object[]{0, 0}, 2)));
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                numM79690l = c26764k.getTotalInterventionLengthInSeconds();
                if (numM79690l == null) {
                    c28655q.m87150e0(-1063662372);
                    c28655q.m87173q(false);
                    r10 = 0;
                } else {
                    c28655q.m87150e0(-1063662371);
                    Integer numValueOf2 = Integer.valueOf(numM79690l.intValue());
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new c(interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, numValueOf2);
                    r10 = 0;
                    c28655q.m87173q(false);
                }
                m89190A(c28655q, r10);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C27325i(10, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, r10, c28655q, 48, 1);
                Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, r10);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66724m2);
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
                if (c26764k.getToolbarSubtitle() != null) {
                    c27656a = c26764k.getToolbarSubtitle();
                } else if (c26764k.getTotalInterventionLengthInSeconds() != null) {
                    c27656a = new C27656a(AbstractC8693b.m21278l(m89206Q(interfaceC28601c3)), true);
                } else {
                    c27656a = null;
                }
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(c26764k.getTitle(), c27656a, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65520, null);
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C27325i(11, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R6;
                int i210 = (AbstractC6721d.a.f25641r << 3) | 3072;
                c28676v1 = c28676v0;
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                AbstractC6719b.m20143d(null, aVar2, null, interfaceC4339a13, null, null, c28655q, i210, 53);
                i17 = i15 & 57344;
                if (i17 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = c28655q.m87157i(breathingEvents) | z14;
                objM87133R7 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R7 = new C29320s(breathingEvents, 1, onEvent);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C29320s(breathingEvents, 1, onEvent);
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R7;
                if (i17 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (z15) {
                    objM87133R8 = new C28947h(onEvent, 13);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C28947h(onEvent, 13);
                    c28655q.m87172p0(objM87133R8);
                }
                m89236t(c26764k, interfaceC4339a14, (InterfaceC4339a) objM87133R8, c28655q, i15 & 14);
                if (m89195F(interfaceC28601c1)) {
                    c28655q.m87150e0(1705283861);
                    c26762iM79683e = c26764k.getFinishDialog();
                    if (c26762iM79683e == null) {
                        c28655q.m87150e0(1324192140);
                        z16 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1324192141);
                        TextResource textResourceM79678c2 = c26762iM79683e.getTitle();
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v1) {
                            objM87133R9 = d.f118766w;
                            c28655q.m87172p0(objM87133R9);
                        }
                        InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) objM87133R9);
                        TextResource textResourceM79677b2 = c26762iM79683e.getPrimaryButton();
                        TextResource textResourceM79676a2 = c26762iM79683e.getCancel();
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v1) {
                            objM87133R10 = new C27325i(12, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R10);
                        }
                        InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R10;
                        if (i17 == 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R11 = c28655q.m87133R();
                        if (z18) {
                            objM87133R11 = new C28947h(onEvent, 11);
                            c28655q.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C28947h(onEvent, 11);
                            c28655q.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R11;
                        if (i17 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i2 = c28655q.m87157i(breathingEvents) | z19;
                        objM87133R12 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R12 = new C29320s(breathingEvents, 0, onEvent);
                            c28655q.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C29320s(breathingEvents, 0, onEvent);
                            c28655q.m87172p0(objM87133R12);
                        }
                        int i211 = TextResource.$stable;
                        AbstractC21211n.m59497o(null, textResourceM79678c2, null, textResourceM79677b2, false, interfaceC39332eM125323a2, null, null, null, textResourceM79676a2, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a15, interfaceC4339a16, (InterfaceC4339a) objM87133R12, null, null, null, c28655q, (i211 << 3) | (i211 << 9) | (i211 << 27), 0, 384, 239074773);
                        c28655q = c28655q;
                        z16 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z16);
                } else {
                    z16 = false;
                    c28655q.m87150e0(1324803771);
                    c28655q.m87173q(false);
                }
                z17 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(z16);
            }
            if (enumC26772s == EnumC26772s.SAVING) {
                c28655q.m87150e0(1511736258);
                C28655q c28655q6 = c28655q;
                AbstractC33199m0.m105214F(new AbstractC33208p0.e(new TextResource.C8688b(AbstractC13266c.f45945q, null, 2, null == true ? 1 : 0), C38072d.f163053a.m121951d().getConnections().getCloud()), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q6, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q6;
                c28655q.m87173q(false);
            } else {
                i18 = 2;
                list = null;
                if (enumC26772s == EnumC26772s.SAVED) {
                    c28655q.m87150e0(1511746439);
                    if ((i15 & 57344) == i16) {
                        z28 = z17;
                    } else {
                        z28 = false;
                    }
                    objM87133R17 = c28655q.m87133R();
                    if (z28) {
                        objM87133R17 = new C28947h(onEvent, 12);
                        c28655q.m87172p0(objM87133R17);
                    } else {
                        objM87133R17 = new C28947h(onEvent, 12);
                        c28655q.m87172p0(objM87133R17);
                    }
                    C28655q c28655q7 = c28655q;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, (InterfaceC4339a) objM87133R17, 3, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q7, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q7;
                    c28655q.m87173q(false);
                } else if (enumC26772s == EnumC26772s.ERROR) {
                    c28655q.m87150e0(-380205742);
                    AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC13266c.f45941m, list, i18, null == true ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC13266c.f45939k, null == true ? 1 : 0, i18, null == true ? 1 : 0);
                    TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC13266c.f45936h, null == true ? 1 : 0, i18, null == true ? 1 : 0);
                    i24 = i15 & 458752;
                    if (i24 == 131072) {
                        z26 = z17;
                    } else {
                        z26 = false;
                    }
                    objM87133R15 = c28655q.m87133R();
                    if (z26) {
                        objM87133R15 = new C28329e(interfaceC4339a4, 12);
                        c28655q.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new C28329e(interfaceC4339a4, 12);
                        c28655q.m87172p0(objM87133R15);
                    }
                    InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R15;
                    if (i24 == 131072) {
                        z27 = z17;
                    } else {
                        z27 = false;
                    }
                    objM87133R16 = c28655q.m87133R();
                    if (z27) {
                        objM87133R16 = new C28329e(interfaceC4339a4, 13);
                        c28655q.m87172p0(objM87133R16);
                    } else {
                        objM87133R16 = new C28329e(interfaceC4339a4, 13);
                        c28655q.m87172p0(objM87133R16);
                    }
                    InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R16;
                    int i212 = AbstractC33208p0.b.f138467h;
                    int i213 = TextResource.C8688b.f25889c;
                    C28655q c28655q8 = c28655q;
                    AbstractC33199m0.m105214F(bVar3, c8688b5, interfaceC4339a17, c8688b6, interfaceC4339a18, false, false, null, null, null, false, false, c28655q8, i212 | (i213 << 3) | (i213 << 9), 0, 4064);
                    c28655q = c28655q8;
                    c28655q.m87173q(false);
                } else if (z4) {
                    c28655q.m87150e0(-379782220);
                    AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC13266c.f45941m, null == true ? 1 : 0, i18, null == true ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC13266c.f45940l, null == true ? 1 : 0, i18, null == true ? 1 : 0);
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC13266c.f45936h, null == true ? 1 : 0, i18, null == true ? 1 : 0);
                    i19 = i15 & 458752;
                    if (i19 == 131072) {
                        z24 = z17;
                    } else {
                        z24 = false;
                    }
                    objM87133R13 = c28655q.m87133R();
                    if (z24) {
                        objM87133R13 = new C28329e(interfaceC4339a4, 14);
                        c28655q.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C28329e(interfaceC4339a4, 14);
                        c28655q.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R13;
                    if (i19 == 131072) {
                        z25 = z17;
                    } else {
                        z25 = false;
                    }
                    objM87133R14 = c28655q.m87133R();
                    if (z25) {
                        objM87133R14 = new C28329e(interfaceC4339a4, 15);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C28329e(interfaceC4339a4, 15);
                        c28655q.m87172p0(objM87133R14);
                    }
                    InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R14;
                    int i36 = AbstractC33208p0.b.f138467h;
                    int i37 = TextResource.C8688b.f25889c;
                    C28655q c28655q9 = c28655q;
                    AbstractC33199m0.m105214F(bVar4, c8688b7, interfaceC4339a19, c8688b8, interfaceC4339a110, false, false, null, null, null, false, false, c28655q9, i36 | (i37 << 3) | (i37 << 9), 0, 4064);
                    c28655q = c28655q9;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-379387063);
                    c28655q.m87173q(false);
                }
            }
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(c26764k, breathingEvents, enumC26772s, z4, onEvent, interfaceC4339a3, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m89194E() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final boolean m89195F(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m89196G(InterfaceC28601c1 interfaceC28601c1) {
        m89203N(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m89197H(InterfaceC28601c1 interfaceC28601c1) {
        m89203N(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m89198I(Function1 function1, List list) {
        function1.invoke(new AbstractC24480f.b(list));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m89199J(Function1 function1) {
        function1.invoke(AbstractC24480f.d.f95501a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m89200K(InterfaceC28601c1 interfaceC28601c1) {
        m89203N(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m89201L(Function1 function1) {
        function1.invoke(AbstractC24480f.a.f95498a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m89202M(Function1 function1, List list) {
        function1.invoke(new AbstractC24480f.b(list));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final void m89203N(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final int m89204O(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final void m89205P(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: Q */
    private static final String m89206Q(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m89207R(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m89208S(Function1 function1) {
        function1.invoke(AbstractC24480f.c.f95500a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m89209T(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m89210U(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m89211V(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m89212W(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m89213X(C26764k c26764k, List list, EnumC26772s enumC26772s, boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m89193D(c26764k, list, enumC26772s, z4, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    private static final void m89236t(C26764k c26764k, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        C0209i c0209i;
        C28676v0 c28676v0;
        int i15;
        C0213j c0213j;
        C0209i c0209i2;
        C0209i c0209i3;
        C2305k c2305k;
        C28676v0 c28676v1;
        C2307m c2307m = C2299e.f9114w;
        C2305k c2305k2 = C2299e.f9111N;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1601398258);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c26764k) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (objM87133R == c28676v2) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k3 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k3, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            boolean zM79687i = c26764k.getShowSessionFinished();
            C23016z c23016z = C23016z.f90757a;
            if (zM79687i) {
                c28655q.m87150e0(1092454757);
                m89241y(c23016z.m66778b(c23016z.m66779c(c2314t, true, 1.0f), c2305k2), c28655q, 0);
                c28655q.m87173q(false);
                c0209i = c0209i6;
                c0209i3 = c0209i4;
                i15 = 1;
                c0213j = c0213j2;
                c0209i2 = c0209i5;
                c28676v0 = c28676v2;
                c2305k = c2305k3;
            } else if (m89237u(interfaceC28601c1)) {
                c28655q.m87150e0(1092666394);
                m89241y(c23016z.m66778b(c23016z.m66779c(c2314t, true, 1.0f), c2305k2), c28655q, 0);
                Boolean bool = Boolean.TRUE;
                boolean z4 = (i14 & 112) == 32;
                Object objM87133R2 = c28655q.m87133R();
                if (z4) {
                    c28676v1 = c28676v2;
                } else {
                    c28676v1 = c28676v2;
                    if (objM87133R2 == c28676v1) {
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool);
                    c28655q.m87173q(false);
                    c28676v0 = c28676v1;
                    c0209i = c0209i6;
                    c0209i3 = c0209i4;
                    c0213j = c0213j2;
                    c0209i2 = c0209i5;
                    c2305k = c2305k3;
                    i15 = 1;
                }
                objM87133R2 = new a(interfaceC4339a, null);
                c28655q.m87172p0(objM87133R2);
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool);
                c28655q.m87173q(false);
                c28676v0 = c28676v1;
                c0209i = c0209i6;
                c0209i3 = c0209i4;
                c0213j = c0213j2;
                c0209i2 = c0209i5;
                c2305k = c2305k3;
                i15 = 1;
            } else {
                c28655q.m87150e0(1092966567);
                Modifier modifierM66779c = c23016z.m66779c(c2314t, true, 1.0f);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66779c);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
                c0209i = c0209i6;
                c28676v0 = c28676v2;
                i15 = 1;
                AbstractC35684p.m113046g(AbstractC1102d.m3407d(1.0f, c2314t), c26764k.getAnimation(), c26764k.getClipSpec(), c28655q, (AbstractC35679m0.f151643a << 6) | 6, 0);
                String strM21274h = AbstractC8693b.m21274h(c26764k.getOverlay(), c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                c0213j = c0213j2;
                c0209i2 = c0209i5;
                c0209i3 = c0209i4;
                c2305k = c2305k3;
                AbstractC30795n.m94707h(strM21274h, C1100b.f4583a.mo3400a(c2314t, C2299e.f9102E), c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getN3(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            float f13 = 4;
            float f14 = 0.0f;
            int i17 = 6;
            float f15 = 8;
            int i18 = 2;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3405b(c2314t, 0.0f, 42 * f13, i15)), 6 * f15, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            C2886a c2886aM8417O = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT2();
            float f16 = 2;
            float fMo738l = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo738l(c2886aM8417O.getStyle().f92255a.f92192b) / f16;
            c28655q.m87150e0(2115611493);
            Iterator it = c26764k.m79680b().iterator();
            while (it.hasNext()) {
                C23465k c23465k = (C23465k) it.next();
                TextResource textResource = (TextResource) c23465k.f92937w;
                EnumC39333f enumC39333f = (EnumC39333f) c23465k.f92938x;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f13), C2299e.f9107J, c28655q, i17);
                int iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                C0209i c0209i8 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i8);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                C2314t c2314t2 = c2314t;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f16 * f13, AbstractC1099a.m3398t(c2314t2, 0.0f, fMo738l, 0.0f, 0.0f, 13));
                C13825t c13825tM48880a = AbstractC17269i.m48880a(f16, enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, 0));
                AbstractC22989q.m66760a(AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifierM3419p, c13825tM48880a.f49346b, AbstractC33253j.f138651a), c28655q, 0);
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                f13 = f13;
                i18 = 2;
                fMo738l = fMo738l;
                f15 = f15;
                it = it;
                f14 = 0.0f;
                i17 = 6;
                c2314t = c2314t2;
            }
            C2314t c2314t3 = c2314t;
            float f17 = f13;
            float f18 = f14;
            float f19 = f15;
            int i19 = i18;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            float f24 = (c26764k.getShowSessionFinished() || c26764k.getShowHoldingFrame()) ? 1.0f : f18;
            TextResource c8688b = c26764k.getRepeatCount() == 1 ? new TextResource.C8688b(AbstractC13266c.f45932d, null, i19, 0 == true ? 1 : 0) : c26764k.getButton();
            float f25 = ((float) 4.5d) * f19;
            Modifier modifierM107879c = AbstractC34132o.m107879c(f24, AbstractC1099a.m3397s(c2314t3, f25, f16 * f19, f25, f19 * f17));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM107879c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j4 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j4);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
            C0209i c0209i9 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i9);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
            boolean z13 = c26764k.getShowHoldingFrame() || c26764k.getShowSessionFinished();
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t3), "primaryButton");
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h2 = AbstractC8693b.m21274h(c8688b, c28655q, TextResource.$stable);
            long jM125400j = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentPositiveTrend();
            boolean zM87157i = c28655q.m87157i(c26764k) | ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                C27198e c27198e = new C27198e(c26764k, interfaceC4339a, interfaceC4339a2, interfaceC28601c1, 5);
                c28655q.m87172p0(c27198e);
                objM87133R3 = c27198e;
            }
            C28655q c28655q3 = c28655q;
            AbstractC27282u.m82292h(modifierM3599a, enumC27284v, strM21274h2, z13, jM125400j, null, false, (InterfaceC4339a) objM87133R3, c28655q3, 54, 96);
            c28655q = c28655q3;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(c26764k, interfaceC4339a, interfaceC4339a2, i13, 17);
        }
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m89237u(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m89238v(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m89239w(C26764k c26764k, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC28601c1 interfaceC28601c1) {
        if (c26764k.getShowSessionFinished()) {
            interfaceC4339a.invoke();
        } else if (c26764k.getRepeatCount() == 1) {
            m89238v(interfaceC28601c1, true);
        } else if (c26764k.getShowHoldingFrame()) {
            interfaceC4339a2.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m89240x(C26764k c26764k, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m89236t(c26764k, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m89241y(Modifier modifier, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-385301384);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            modifier2 = modifier;
            AbstractC35684p.m113047h(modifier2, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC13265b.f45928a)), false, 0.0f, 1, null, null, null, null, c28655q, (i14 & 14) | 24576, 492);
        } else {
            modifier2 = modifier;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2061f(modifier2, i13, 5, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m89242z(Modifier modifier, int i13, Composer composer, int i14) {
        m89241y(modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
