package u31;

import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm0.C3404g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13043h0;
import ec3.InterfaceC13062m;
import gb1.AbstractC15676d;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p088dc.AbstractC11894a;
import p095dp.AbstractC12240d;
import p208i2.AbstractC17918w0;
import p208i2.C17881e1;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p238j0.InterfaceC21083i;
import p268k0.AbstractC22086a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.C23016z;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import p409q0.C29674b;
import p409q0.C29696t;
import p409q0.InterfaceC29694r;
import p505ts.AbstractC34132o;
import p510u0.C34350r;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: u31.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u009d\u0001\u0010\u0015\u001a\u00020\u0012*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00112\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001a²\u0006\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00118\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00118\nX\u008a\u0084\u0002"}, m65681d2 = {"Ll0/y;", "", "", "values", "", "selectedPage", "Lb91/a;", "textStyle", "Ly3/f;", "itemHeight", "snapDistance", "", "ignoreFirstValue", "Lb2/f;", "horizontalAlignment", "showHighlight", "fillMaxWidth", "Lkotlin/Function1;", "Ll83/a0;", "onIndexSelected", "onValueSelected", "j", "(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "currentValues", "currentOnValueSelected", "currentOnIndexSelected", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34504e {

    /* JADX INFO: renamed from: u31.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.spinnerselector.WhoopSpinnerSelectorKt$WhoopSpinnerSelector$3$1", m100430f = "WhoopSpinnerSelector.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC29701y f145040E;

        /* JADX INFO: renamed from: w */
        int f145041w;

        /* JADX INFO: renamed from: x */
        int f145042x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<String> f145043y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f145044z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, int i13, AbstractC29701y abstractC29701y, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f145043y = list;
            this.f145044z = i13;
            this.f145040E = abstractC29701y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f145043y, this.f145044z, this.f145040E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145042x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f145043y.isEmpty()) {
                int iM36284n = AbstractC12889b.m36284n(this.f145044z, 0, AbstractC37056f.m118951C(this.f145043y));
                AbstractC29701y abstractC29701y = this.f145040E;
                this.f145041w = iM36284n;
                this.f145042x = 1;
                if (AbstractC29701y.m91158v(abstractC29701y, iM36284n, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: u31.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.spinnerselector.WhoopSpinnerSelectorKt$WhoopSpinnerSelector$4$1", m100430f = "WhoopSpinnerSelector.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f145045E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28670t2 f145046F;

        /* JADX INFO: renamed from: w */
        int f145047w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f145048x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC29701y f145049y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f145050z;

        /* JADX INFO: renamed from: u31.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28670t2 f145051w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28670t2 f145052x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28670t2 f145053y;

            public a(InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4) {
                this.f145051w = interfaceC28670t2;
                this.f145052x = interfaceC28670t3;
                this.f145053y = interfaceC28670t4;
            }

            /* JADX INFO: renamed from: b */
            public final Object m109063b(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                List listM109050o = AbstractC34504e.m109050o(this.f145051w);
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 >= 0 && i13 < listM109050o.size()) {
                    AbstractC34504e.m109051p(this.f145052x).invoke(listM109050o.get(i13));
                    AbstractC34504e.m109052q(this.f145053y).invoke(new Integer(i13));
                }
                return c23454a0;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m109063b(((Number) obj).intValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, AbstractC29701y abstractC29701y, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f145048x = z4;
            this.f145049y = abstractC29701y;
            this.f145050z = interfaceC28670t2;
            this.f145045E = interfaceC28670t3;
            this.f145046F = interfaceC28670t4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final int m109062h(AbstractC29701y abstractC29701y) {
            return abstractC29701y.m91166p();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f145048x, this.f145049y, this.f145050z, this.f145045E, this.f145046F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145047w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(AbstractC28683x.m87240H(new C34505f(this.f145049y, 0)), this.f145048x ? 1 : 0);
                a aVar = new a(this.f145050z, this.f145045E, this.f145046F);
                this.f145047w = 1;
                if (c13043h0M36612v.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u31.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.spinnerselector.WhoopSpinnerSelectorKt$WhoopSpinnerSelector$6$1$1$1$1", m100430f = "WhoopSpinnerSelector.kt", m100431l = {158}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f145054w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29701y f145055x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f145056y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC29701y abstractC29701y, int i13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f145055x = abstractC29701y;
            this.f145056y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f145055x, this.f145056y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145054w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29701y abstractC29701y = this.f145055x;
                int i14 = this.f145056y;
                C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, null, 6);
                this.f145054w = 1;
                if (AbstractC29701y.m91155g(abstractC29701y, i14, c11347e2M30574v, this, 2) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x013d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x0164  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x018a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0194  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:171:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0212  */
    /* JADX WARN: Code duplicated, block: B:174:0x021f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0229  */
    /* JADX WARN: Code duplicated, block: B:179:0x0237  */
    /* JADX WARN: Code duplicated, block: B:182:0x0258  */
    /* JADX WARN: Code duplicated, block: B:184:0x025d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x0276  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:197:0x02b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:202:0x02df  */
    /* JADX WARN: Code duplicated, block: B:205:0x02f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x0300  */
    /* JADX WARN: Code duplicated, block: B:211:0x033c  */
    /* JADX WARN: Code duplicated, block: B:213:0x038f  */
    /* JADX WARN: Code duplicated, block: B:216:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    /* JADX INFO: renamed from: j */
    public static final void m109045j(final InterfaceC23013y WhoopSpinnerSelector, final List<String> values, int i13, C2886a c2886a, float f13, int i14, boolean z4, InterfaceC2300f interfaceC2300f, boolean z13, boolean z14, Function1 function1, Function1 function2, Composer composer, final int i15, final int i16, final int i17) {
        int i18;
        int i19;
        int i24;
        float f14;
        int i25;
        int i26;
        final int i27;
        int i28;
        int i29;
        boolean z15;
        int i34;
        int i35;
        final InterfaceC2300f interfaceC2300f2;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        boolean z16;
        C28655q c28655q;
        final C2886a c2886a2;
        final boolean z17;
        final Function1 function3;
        final boolean z18;
        final int i54;
        final float f15;
        final boolean z19;
        final Function1 function4;
        C28677v1 c28677v1M87180u;
        int i55;
        C28676v0 c28676v0;
        C2886a n13;
        float f16;
        boolean z24;
        boolean z25;
        Function1 function5;
        Object objM87133R;
        int i56;
        Function1 function6;
        Object objM87133R2;
        Object objM87133R3;
        int size;
        int i57;
        boolean zM87157i;
        Object objM87133R4;
        boolean z26;
        final C29674b c29674bM91150b;
        boolean z27;
        boolean zM87153g;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        InterfaceC28601c1 interfaceC28601c1M87238F2;
        InterfaceC28601c1 interfaceC28601c1M87238F3;
        boolean zM87153g2;
        Object objM87133R6;
        Object objM87133R7;
        int i58;
        boolean zM87157i2;
        AbstractC22676k.m65750j(WhoopSpinnerSelector, "$this$WhoopSpinnerSelector");
        AbstractC22676k.m65750j(values, "values");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-775566633);
        if ((i15 & 6) == 0) {
            i18 = (c28655q2.m87153g(WhoopSpinnerSelector) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= c28655q2.m87157i(values) ? 32 : 16;
        }
        int i59 = i17 & 2;
        if (i59 == 0) {
            if ((i15 & 384) == 0) {
                i19 = i13;
                i18 |= c28655q2.m87149e(i19) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if ((i17 & 4) != 0) {
                    i58 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                } else {
                    if ((i15 & 4096) == 0) {
                        zM87157i2 = c28655q2.m87153g(c2886a);
                    } else {
                        zM87157i2 = c28655q2.m87157i(c2886a);
                    }
                    if (zM87157i2) {
                        i58 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i58 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                }
                i18 |= i58;
            }
            i24 = i17 & 8;
            if (i24 != 0) {
                if ((i15 & 24576) == 0) {
                    f14 = f13;
                    if (c28655q2.m87147d(f14)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 16;
                if (i26 != 0) {
                    i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    i27 = i14;
                } else {
                    i27 = i14;
                    if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87149e(i27)) {
                            i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i18 |= i28;
                    }
                }
                i29 = i17 & 32;
                if (i29 != 0) {
                    i18 |= 1572864;
                    z15 = z4;
                } else {
                    z15 = z4;
                    if ((i15 & 1572864) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i34 = 1048576;
                        } else {
                            i34 = 524288;
                        }
                        i18 |= i34;
                    }
                }
                i35 = i17 & 64;
                if (i35 != 0) {
                    i18 |= 12582912;
                    interfaceC2300f2 = interfaceC2300f;
                } else {
                    interfaceC2300f2 = interfaceC2300f;
                    if ((i15 & 12582912) == 0) {
                        if (c28655q2.m87153g(interfaceC2300f2)) {
                            i36 = 8388608;
                        } else {
                            i36 = 4194304;
                        }
                        i18 |= i36;
                    }
                }
                i37 = i17 & 128;
                if (i37 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i38 = 67108864;
                    } else {
                        i38 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i18 |= i38;
                }
                i39 = i17 & 256;
                if (i39 != 0) {
                    if ((i15 & 805306368) == 0) {
                        if (c28655q2.m87155h(z14)) {
                            i44 = 536870912;
                        } else {
                            i44 = 268435456;
                        }
                        i18 |= i44;
                    }
                    i45 = i17 & 512;
                    if (i45 != 0) {
                        i46 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i47 = 4;
                        } else {
                            i47 = 2;
                        }
                        i46 = i16 | i47;
                    } else {
                        i46 = i16;
                    }
                    i48 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i48 != 0) {
                        if ((i16 & 48) == 0) {
                            if (c28655q2.m87157i(function2)) {
                                i49 = 32;
                            } else {
                                i49 = 16;
                            }
                            i46 |= i49;
                        }
                        if ((i18 & 306783379) == 306783378 || (i46 & 19) != 18) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q2.m87135U(i18 & 1, z16)) {
                            c28655q2.m87140Z();
                            i55 = i15 & 1;
                            c28676v0 = C28635l.f115821a;
                            if (i55 != 0 || c28655q2.m87118C()) {
                                if (i59 != 0) {
                                    i19 = 1;
                                }
                                if ((i17 & 4) != 0) {
                                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                                    i18 &= -7169;
                                } else {
                                    n13 = c2886a;
                                }
                                if (i24 != 0) {
                                    f16 = 60;
                                } else {
                                    f16 = f14;
                                }
                                if (i26 != 0) {
                                    i27 = 10;
                                }
                                if (i29 != 0) {
                                    z15 = false;
                                }
                                if (i35 != 0) {
                                    interfaceC2300f2 = C2299e.f9111N;
                                }
                                if (i37 != 0) {
                                    z24 = true;
                                } else {
                                    z24 = z13;
                                }
                                if (i39 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z14;
                                }
                                if (i45 != 0) {
                                    objM87133R2 = c28655q2.m87133R();
                                    if (objM87133R2 == c28676v0) {
                                        objM87133R2 = new C34350r(24);
                                        c28655q2.m87172p0(objM87133R2);
                                    }
                                    function5 = (Function1) objM87133R2;
                                } else {
                                    function5 = function1;
                                }
                                if (i48 != 0) {
                                    objM87133R = c28655q2.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C34350r(25);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    Function1 function7 = (Function1) objM87133R;
                                    i56 = i18;
                                    function6 = function7;
                                    n13 = n13;
                                }
                                c28655q2.m87175r();
                                final C2886a c2886a3 = n13;
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                final InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                                final float density = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                                size = values.size() - 1;
                                if (size < 0) {
                                    i57 = 0;
                                } else {
                                    i57 = size;
                                }
                                final int i64 = i27;
                                int iM36284n = AbstractC12889b.m36284n(i19, 0, i57);
                                zM87157i = c28655q2.m87157i(values);
                                objM87133R4 = c28655q2.m87133R();
                                if (zM87157i || objM87133R4 == c28676v0) {
                                    objM87133R4 = new C34505f(values, 1);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                z26 = z15;
                                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n, 0, c28655q2, 2);
                                Integer numValueOf = Integer.valueOf(i19);
                                Integer numValueOf2 = Integer.valueOf(values.size());
                                boolean zM87157i3 = c28655q2.m87157i(values);
                                final boolean z28 = z24;
                                if ((i56 & 896) == 256) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                zM87153g = zM87157i3 | z27 | c28655q2.m87153g(c29674bM91150b);
                                objM87133R5 = c28655q2.m87133R();
                                if (zM87153g || objM87133R5 == c28676v0) {
                                    objM87133R5 = new a(values, i19, c29674bM91150b, null);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                AbstractC28683x.m87254h(numValueOf, numValueOf2, (InterfaceC4351m) objM87133R5, c28655q2);
                                interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                                zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                                objM87133R6 = c28655q2.m87133R();
                                if (zM87153g2 || objM87133R6 == c28676v0) {
                                    objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                                final float f17 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                                Modifier modifierM66778b = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C34350r(26);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                final boolean z29 = z25;
                                AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                                    @Override // p715kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int iIntValue = ((Integer) obj3).intValue();
                                        return AbstractC34504e.m109054s(f17, z28, z29, c29674bM91150b, i64, values, interfaceC2994c0, density, c2886a3, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                                    }
                                }), c28655q2, 3072, 6);
                                c28655q = c28655q2;
                                z18 = z26;
                                i54 = i19;
                                z17 = z25;
                                i27 = i64;
                                z19 = z28;
                                function3 = function6;
                                function4 = function5;
                                f15 = f16;
                                c2886a2 = c2886a3;
                            } else {
                                c28655q2.m87138X();
                                if ((i17 & 4) != 0) {
                                    i18 &= -7169;
                                }
                                n13 = c2886a;
                                z24 = z13;
                                z25 = z14;
                                function5 = function1;
                                f16 = f14;
                            }
                            i56 = i18;
                            function6 = function2;
                            c28655q2.m87175r();
                            final C2886a c2886a4 = n13;
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            final InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R3;
                            final float density2 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                            size = values.size() - 1;
                            if (size < 0) {
                                i57 = 0;
                            } else {
                                i57 = size;
                            }
                            final int i65 = i27;
                            int iM36284n2 = AbstractC12889b.m36284n(i19, 0, i57);
                            zM87157i = c28655q2.m87157i(values);
                            objM87133R4 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R4 = new C34505f(values, 1);
                                c28655q2.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C34505f(values, 1);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            z26 = z15;
                            c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n2, 0, c28655q2, 2);
                            Integer numValueOf3 = Integer.valueOf(i19);
                            Integer numValueOf4 = Integer.valueOf(values.size());
                            boolean zM87157i4 = c28655q2.m87157i(values);
                            final boolean z210 = z24;
                            if ((i56 & 896) == 256) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            zM87153g = zM87157i4 | z27 | c28655q2.m87153g(c29674bM91150b);
                            objM87133R5 = c28655q2.m87133R();
                            if (zM87153g) {
                                objM87133R5 = new a(values, i19, c29674bM91150b, null);
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new a(values, i19, c29674bM91150b, null);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            AbstractC28683x.m87254h(numValueOf3, numValueOf4, (InterfaceC4351m) objM87133R5, c28655q2);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                            interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                            interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                            zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                            objM87133R6 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                                c28655q2.m87172p0(objM87133R6);
                            } else {
                                objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                            final float f18 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                            Modifier modifierM66778b2 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C34350r(26);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            final boolean z211 = z25;
                            AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b2, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                                @Override // p715kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC34504e.m109054s(f18, z210, z211, c29674bM91150b, i65, values, interfaceC2994c1, density2, c2886a4, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                                }
                            }), c28655q2, 3072, 6);
                            c28655q = c28655q2;
                            z18 = z26;
                            i54 = i19;
                            z17 = z25;
                            i27 = i65;
                            z19 = z210;
                            function3 = function6;
                            function4 = function5;
                            f15 = f16;
                            c2886a2 = c2886a4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            c2886a2 = c2886a;
                            z17 = z14;
                            function3 = function2;
                            z18 = z15;
                            i54 = i19;
                            f15 = f14;
                            z19 = z13;
                            function4 = function1;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i46 |= 48;
                    if ((i18 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i18 & 1, z16)) {
                        c28655q2.m87140Z();
                        i55 = i15 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i55 != 0) {
                            if (i59 != 0) {
                                i19 = 1;
                            }
                            if ((i17 & 4) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                                i18 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            if (i24 != 0) {
                                f16 = 60;
                            } else {
                                f16 = f14;
                            }
                            if (i26 != 0) {
                                i27 = 10;
                            }
                            if (i29 != 0) {
                                z15 = false;
                            }
                            if (i35 != 0) {
                                interfaceC2300f2 = C2299e.f9111N;
                            }
                            if (i37 != 0) {
                                z24 = true;
                            } else {
                                z24 = z13;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            if (i45 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C34350r(24);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function5 = (Function1) objM87133R2;
                            } else {
                                function5 = function1;
                            }
                            if (i48 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C34350r(25);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                Function1 function8 = (Function1) objM87133R;
                                i56 = i18;
                                function6 = function8;
                                n13 = n13;
                            } else {
                                i56 = i18;
                                function6 = function2;
                            }
                        } else {
                            if (i59 != 0) {
                                i19 = 1;
                            }
                            if ((i17 & 4) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                                i18 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            if (i24 != 0) {
                                f16 = 60;
                            } else {
                                f16 = f14;
                            }
                            if (i26 != 0) {
                                i27 = 10;
                            }
                            if (i29 != 0) {
                                z15 = false;
                            }
                            if (i35 != 0) {
                                interfaceC2300f2 = C2299e.f9111N;
                            }
                            if (i37 != 0) {
                                z24 = true;
                            } else {
                                z24 = z13;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            if (i45 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C34350r(24);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function5 = (Function1) objM87133R2;
                            } else {
                                function5 = function1;
                            }
                            if (i48 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C34350r(25);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                Function1 function9 = (Function1) objM87133R;
                                i56 = i18;
                                function6 = function9;
                                n13 = n13;
                            } else {
                                i56 = i18;
                                function6 = function2;
                            }
                        }
                        c28655q2.m87175r();
                        final C2886a c2886a5 = n13;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) objM87133R3;
                        final float density3 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                        size = values.size() - 1;
                        if (size < 0) {
                            i57 = 0;
                        } else {
                            i57 = size;
                        }
                        final int i66 = i27;
                        int iM36284n3 = AbstractC12889b.m36284n(i19, 0, i57);
                        zM87157i = c28655q2.m87157i(values);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new C34505f(values, 1);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C34505f(values, 1);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        z26 = z15;
                        c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n3, 0, c28655q2, 2);
                        Integer numValueOf5 = Integer.valueOf(i19);
                        Integer numValueOf6 = Integer.valueOf(values.size());
                        boolean zM87157i5 = c28655q2.m87157i(values);
                        final boolean z212 = z24;
                        if ((i56 & 896) == 256) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87153g = zM87157i5 | z27 | c28655q2.m87153g(c29674bM91150b);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new a(values, i19, c29674bM91150b, null);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(values, i19, c29674bM91150b, null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87254h(numValueOf5, numValueOf6, (InterfaceC4351m) objM87133R5, c28655q2);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                        interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                        interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                        zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                        final float f19 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                        Modifier modifierM66778b3 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C34350r(26);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final boolean z213 = z25;
                        AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b3, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC34504e.m109054s(f19, z212, z213, c29674bM91150b, i66, values, interfaceC2994c2, density3, c2886a5, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q2, 3072, 6);
                        c28655q = c28655q2;
                        z18 = z26;
                        i54 = i19;
                        z17 = z25;
                        i27 = i66;
                        z19 = z212;
                        function3 = function6;
                        function4 = function5;
                        f15 = f16;
                        c2886a2 = c2886a5;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c2886a2 = c2886a;
                        z17 = z14;
                        function3 = function2;
                        z18 = z15;
                        i54 = i19;
                        f15 = f14;
                        z19 = z13;
                        function4 = function1;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i18 |= 805306368;
                i45 = i17 & 512;
                if (i45 != 0) {
                    i46 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i47 = 4;
                    } else {
                        i47 = 2;
                    }
                    i46 = i16 | i47;
                } else {
                    i46 = i16;
                }
                i48 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i48 != 0) {
                    if ((i16 & 48) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i49 = 32;
                        } else {
                            i49 = 16;
                        }
                        i46 |= i49;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i18 & 1, z16)) {
                        c28655q2.m87140Z();
                        i55 = i15 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i55 != 0) {
                            if (i59 != 0) {
                                i19 = 1;
                            }
                            if ((i17 & 4) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                                i18 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            if (i24 != 0) {
                                f16 = 60;
                            } else {
                                f16 = f14;
                            }
                            if (i26 != 0) {
                                i27 = 10;
                            }
                            if (i29 != 0) {
                                z15 = false;
                            }
                            if (i35 != 0) {
                                interfaceC2300f2 = C2299e.f9111N;
                            }
                            if (i37 != 0) {
                                z24 = true;
                            } else {
                                z24 = z13;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            if (i45 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C34350r(24);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function5 = (Function1) objM87133R2;
                            } else {
                                function5 = function1;
                            }
                            if (i48 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C34350r(25);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                Function1 function10 = (Function1) objM87133R;
                                i56 = i18;
                                function6 = function10;
                                n13 = n13;
                            } else {
                                i56 = i18;
                                function6 = function2;
                            }
                        } else {
                            if (i59 != 0) {
                                i19 = 1;
                            }
                            if ((i17 & 4) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                                i18 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            if (i24 != 0) {
                                f16 = 60;
                            } else {
                                f16 = f14;
                            }
                            if (i26 != 0) {
                                i27 = 10;
                            }
                            if (i29 != 0) {
                                z15 = false;
                            }
                            if (i35 != 0) {
                                interfaceC2300f2 = C2299e.f9111N;
                            }
                            if (i37 != 0) {
                                z24 = true;
                            } else {
                                z24 = z13;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            if (i45 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C34350r(24);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function5 = (Function1) objM87133R2;
                            } else {
                                function5 = function1;
                            }
                            if (i48 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C34350r(25);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                Function1 function11 = (Function1) objM87133R;
                                i56 = i18;
                                function6 = function11;
                                n13 = n13;
                            } else {
                                i56 = i18;
                                function6 = function2;
                            }
                        }
                        c28655q2.m87175r();
                        final C2886a c2886a6 = n13;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC2994c0 interfaceC2994c3 = (InterfaceC2994c0) objM87133R3;
                        final float density4 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                        size = values.size() - 1;
                        if (size < 0) {
                            i57 = 0;
                        } else {
                            i57 = size;
                        }
                        final int i67 = i27;
                        int iM36284n4 = AbstractC12889b.m36284n(i19, 0, i57);
                        zM87157i = c28655q2.m87157i(values);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new C34505f(values, 1);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C34505f(values, 1);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        z26 = z15;
                        c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n4, 0, c28655q2, 2);
                        Integer numValueOf7 = Integer.valueOf(i19);
                        Integer numValueOf8 = Integer.valueOf(values.size());
                        boolean zM87157i6 = c28655q2.m87157i(values);
                        final boolean z214 = z24;
                        if ((i56 & 896) == 256) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87153g = zM87157i6 | z27 | c28655q2.m87153g(c29674bM91150b);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new a(values, i19, c29674bM91150b, null);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(values, i19, c29674bM91150b, null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87254h(numValueOf7, numValueOf8, (InterfaceC4351m) objM87133R5, c28655q2);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                        interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                        interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                        zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                        final float f110 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                        Modifier modifierM66778b4 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C34350r(26);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final boolean z215 = z25;
                        AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b4, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC34504e.m109054s(f110, z214, z215, c29674bM91150b, i67, values, interfaceC2994c3, density4, c2886a6, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q2, 3072, 6);
                        c28655q = c28655q2;
                        z18 = z26;
                        i54 = i19;
                        z17 = z25;
                        i27 = i67;
                        z19 = z214;
                        function3 = function6;
                        function4 = function5;
                        f15 = f16;
                        c2886a2 = c2886a6;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c2886a2 = c2886a;
                        z17 = z14;
                        function3 = function2;
                        z18 = z15;
                        i54 = i19;
                        f15 = f14;
                        z19 = z13;
                        function4 = function1;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i46 |= 48;
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i55 = i15 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i55 != 0) {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function12 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function12;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    } else {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function13 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function13;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    }
                    c28655q2.m87175r();
                    final C2886a c2886a7 = n13;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC2994c0 interfaceC2994c4 = (InterfaceC2994c0) objM87133R3;
                    final float density5 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                    size = values.size() - 1;
                    if (size < 0) {
                        i57 = 0;
                    } else {
                        i57 = size;
                    }
                    final int i68 = i27;
                    int iM36284n5 = AbstractC12889b.m36284n(i19, 0, i57);
                    zM87157i = c28655q2.m87157i(values);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    z26 = z15;
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n5, 0, c28655q2, 2);
                    Integer numValueOf9 = Integer.valueOf(i19);
                    Integer numValueOf10 = Integer.valueOf(values.size());
                    boolean zM87157i7 = c28655q2.m87157i(values);
                    final boolean z216 = z24;
                    if ((i56 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87153g = zM87157i7 | z27 | c28655q2.m87153g(c29674bM91150b);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87254h(numValueOf9, numValueOf10, (InterfaceC4351m) objM87133R5, c28655q2);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                    interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                    interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                    zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    final float f111 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                    Modifier modifierM66778b5 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C34350r(26);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final boolean z217 = z25;
                    AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b5, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC34504e.m109054s(f111, z216, z217, c29674bM91150b, i68, values, interfaceC2994c4, density5, c2886a7, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3072, 6);
                    c28655q = c28655q2;
                    z18 = z26;
                    i54 = i19;
                    z17 = z25;
                    i27 = i68;
                    z19 = z216;
                    function3 = function6;
                    function4 = function5;
                    f15 = f16;
                    c2886a2 = c2886a7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c2886a2 = c2886a;
                    z17 = z14;
                    function3 = function2;
                    z18 = z15;
                    i54 = i19;
                    f15 = f14;
                    z19 = z13;
                    function4 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i18 |= 24576;
            f14 = f13;
            i26 = i17 & 16;
            if (i26 != 0) {
                i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i27 = i14;
            } else {
                i27 = i14;
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87149e(i27)) {
                        i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i28;
                }
            }
            i29 = i17 & 32;
            if (i29 != 0) {
                i18 |= 1572864;
                z15 = z4;
            } else {
                z15 = z4;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i34 = 1048576;
                    } else {
                        i34 = 524288;
                    }
                    i18 |= i34;
                }
            }
            i35 = i17 & 64;
            if (i35 != 0) {
                i18 |= 12582912;
                interfaceC2300f2 = interfaceC2300f;
            } else {
                interfaceC2300f2 = interfaceC2300f;
                if ((i15 & 12582912) == 0) {
                    if (c28655q2.m87153g(interfaceC2300f2)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i18 |= i36;
                }
            }
            i37 = i17 & 128;
            if (i37 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i38 = 67108864;
                } else {
                    i38 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i38;
            }
            i39 = i17 & 256;
            if (i39 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i44 = 536870912;
                    } else {
                        i44 = 268435456;
                    }
                    i18 |= i44;
                }
                i45 = i17 & 512;
                if (i45 != 0) {
                    i46 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i47 = 4;
                    } else {
                        i47 = 2;
                    }
                    i46 = i16 | i47;
                } else {
                    i46 = i16;
                }
                i48 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i48 != 0) {
                    if ((i16 & 48) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i49 = 32;
                        } else {
                            i49 = 16;
                        }
                        i46 |= i49;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i18 & 1, z16)) {
                        c28655q2.m87140Z();
                        i55 = i15 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i55 != 0) {
                            if (i59 != 0) {
                                i19 = 1;
                            }
                            if ((i17 & 4) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                                i18 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            if (i24 != 0) {
                                f16 = 60;
                            } else {
                                f16 = f14;
                            }
                            if (i26 != 0) {
                                i27 = 10;
                            }
                            if (i29 != 0) {
                                z15 = false;
                            }
                            if (i35 != 0) {
                                interfaceC2300f2 = C2299e.f9111N;
                            }
                            if (i37 != 0) {
                                z24 = true;
                            } else {
                                z24 = z13;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            if (i45 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C34350r(24);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function5 = (Function1) objM87133R2;
                            } else {
                                function5 = function1;
                            }
                            if (i48 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C34350r(25);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                Function1 function14 = (Function1) objM87133R;
                                i56 = i18;
                                function6 = function14;
                                n13 = n13;
                            } else {
                                i56 = i18;
                                function6 = function2;
                            }
                        } else {
                            if (i59 != 0) {
                                i19 = 1;
                            }
                            if ((i17 & 4) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                                i18 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            if (i24 != 0) {
                                f16 = 60;
                            } else {
                                f16 = f14;
                            }
                            if (i26 != 0) {
                                i27 = 10;
                            }
                            if (i29 != 0) {
                                z15 = false;
                            }
                            if (i35 != 0) {
                                interfaceC2300f2 = C2299e.f9111N;
                            }
                            if (i37 != 0) {
                                z24 = true;
                            } else {
                                z24 = z13;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            if (i45 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C34350r(24);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function5 = (Function1) objM87133R2;
                            } else {
                                function5 = function1;
                            }
                            if (i48 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C34350r(25);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                Function1 function15 = (Function1) objM87133R;
                                i56 = i18;
                                function6 = function15;
                                n13 = n13;
                            } else {
                                i56 = i18;
                                function6 = function2;
                            }
                        }
                        c28655q2.m87175r();
                        final C2886a c2886a8 = n13;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC2994c0 interfaceC2994c5 = (InterfaceC2994c0) objM87133R3;
                        final float density6 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                        size = values.size() - 1;
                        if (size < 0) {
                            i57 = 0;
                        } else {
                            i57 = size;
                        }
                        final int i69 = i27;
                        int iM36284n6 = AbstractC12889b.m36284n(i19, 0, i57);
                        zM87157i = c28655q2.m87157i(values);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new C34505f(values, 1);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C34505f(values, 1);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        z26 = z15;
                        c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n6, 0, c28655q2, 2);
                        Integer numValueOf11 = Integer.valueOf(i19);
                        Integer numValueOf12 = Integer.valueOf(values.size());
                        boolean zM87157i8 = c28655q2.m87157i(values);
                        final boolean z218 = z24;
                        if ((i56 & 896) == 256) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87153g = zM87157i8 | z27 | c28655q2.m87153g(c29674bM91150b);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new a(values, i19, c29674bM91150b, null);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(values, i19, c29674bM91150b, null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87254h(numValueOf11, numValueOf12, (InterfaceC4351m) objM87133R5, c28655q2);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                        interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                        interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                        zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                        final float f112 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                        Modifier modifierM66778b6 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C34350r(26);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final boolean z219 = z25;
                        AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b6, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC34504e.m109054s(f112, z218, z219, c29674bM91150b, i69, values, interfaceC2994c5, density6, c2886a8, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q2, 3072, 6);
                        c28655q = c28655q2;
                        z18 = z26;
                        i54 = i19;
                        z17 = z25;
                        i27 = i69;
                        z19 = z218;
                        function3 = function6;
                        function4 = function5;
                        f15 = f16;
                        c2886a2 = c2886a8;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c2886a2 = c2886a;
                        z17 = z14;
                        function3 = function2;
                        z18 = z15;
                        i54 = i19;
                        f15 = f14;
                        z19 = z13;
                        function4 = function1;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i46 |= 48;
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i55 = i15 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i55 != 0) {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function16 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function16;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    } else {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function17 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function17;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    }
                    c28655q2.m87175r();
                    final C2886a c2886a9 = n13;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC2994c0 interfaceC2994c6 = (InterfaceC2994c0) objM87133R3;
                    final float density7 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                    size = values.size() - 1;
                    if (size < 0) {
                        i57 = 0;
                    } else {
                        i57 = size;
                    }
                    final int i610 = i27;
                    int iM36284n7 = AbstractC12889b.m36284n(i19, 0, i57);
                    zM87157i = c28655q2.m87157i(values);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    z26 = z15;
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n7, 0, c28655q2, 2);
                    Integer numValueOf13 = Integer.valueOf(i19);
                    Integer numValueOf14 = Integer.valueOf(values.size());
                    boolean zM87157i9 = c28655q2.m87157i(values);
                    final boolean z2110 = z24;
                    if ((i56 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87153g = zM87157i9 | z27 | c28655q2.m87153g(c29674bM91150b);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87254h(numValueOf13, numValueOf14, (InterfaceC4351m) objM87133R5, c28655q2);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                    interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                    interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                    zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    final float f113 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                    Modifier modifierM66778b7 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C34350r(26);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final boolean z2111 = z25;
                    AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b7, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC34504e.m109054s(f113, z2110, z2111, c29674bM91150b, i610, values, interfaceC2994c6, density7, c2886a9, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3072, 6);
                    c28655q = c28655q2;
                    z18 = z26;
                    i54 = i19;
                    z17 = z25;
                    i27 = i610;
                    z19 = z2110;
                    function3 = function6;
                    function4 = function5;
                    f15 = f16;
                    c2886a2 = c2886a9;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c2886a2 = c2886a;
                    z17 = z14;
                    function3 = function2;
                    z18 = z15;
                    i54 = i19;
                    f15 = f14;
                    z19 = z13;
                    function4 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i18 |= 805306368;
            i45 = i17 & 512;
            if (i45 != 0) {
                i46 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i47 = 4;
                } else {
                    i47 = 2;
                }
                i46 = i16 | i47;
            } else {
                i46 = i16;
            }
            i48 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i48 != 0) {
                if ((i16 & 48) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i49 = 32;
                    } else {
                        i49 = 16;
                    }
                    i46 |= i49;
                }
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i55 = i15 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i55 != 0) {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function18 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function18;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    } else {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function19 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function19;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    }
                    c28655q2.m87175r();
                    final C2886a c2886a10 = n13;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC2994c0 interfaceC2994c7 = (InterfaceC2994c0) objM87133R3;
                    final float density8 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                    size = values.size() - 1;
                    if (size < 0) {
                        i57 = 0;
                    } else {
                        i57 = size;
                    }
                    final int i611 = i27;
                    int iM36284n8 = AbstractC12889b.m36284n(i19, 0, i57);
                    zM87157i = c28655q2.m87157i(values);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    z26 = z15;
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n8, 0, c28655q2, 2);
                    Integer numValueOf15 = Integer.valueOf(i19);
                    Integer numValueOf16 = Integer.valueOf(values.size());
                    boolean zM87157i10 = c28655q2.m87157i(values);
                    final boolean z2112 = z24;
                    if ((i56 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87153g = zM87157i10 | z27 | c28655q2.m87153g(c29674bM91150b);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87254h(numValueOf15, numValueOf16, (InterfaceC4351m) objM87133R5, c28655q2);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                    interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                    interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                    zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    final float f114 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                    Modifier modifierM66778b8 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C34350r(26);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final boolean z2113 = z25;
                    AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b8, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC34504e.m109054s(f114, z2112, z2113, c29674bM91150b, i611, values, interfaceC2994c7, density8, c2886a10, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3072, 6);
                    c28655q = c28655q2;
                    z18 = z26;
                    i54 = i19;
                    z17 = z25;
                    i27 = i611;
                    z19 = z2112;
                    function3 = function6;
                    function4 = function5;
                    f15 = f16;
                    c2886a2 = c2886a10;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c2886a2 = c2886a;
                    z17 = z14;
                    function3 = function2;
                    z18 = z15;
                    i54 = i19;
                    f15 = f14;
                    z19 = z13;
                    function4 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i46 |= 48;
            if ((i18 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z16)) {
                c28655q2.m87140Z();
                i55 = i15 & 1;
                c28676v0 = C28635l.f115821a;
                if (i55 != 0) {
                    if (i59 != 0) {
                        i19 = 1;
                    }
                    if ((i17 & 4) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                        i18 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    if (i24 != 0) {
                        f16 = 60;
                    } else {
                        f16 = f14;
                    }
                    if (i26 != 0) {
                        i27 = 10;
                    }
                    if (i29 != 0) {
                        z15 = false;
                    }
                    if (i35 != 0) {
                        interfaceC2300f2 = C2299e.f9111N;
                    }
                    if (i37 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i45 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C34350r(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function1;
                    }
                    if (i48 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34350r(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function110 = (Function1) objM87133R;
                        i56 = i18;
                        function6 = function110;
                        n13 = n13;
                    } else {
                        i56 = i18;
                        function6 = function2;
                    }
                } else {
                    if (i59 != 0) {
                        i19 = 1;
                    }
                    if ((i17 & 4) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                        i18 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    if (i24 != 0) {
                        f16 = 60;
                    } else {
                        f16 = f14;
                    }
                    if (i26 != 0) {
                        i27 = 10;
                    }
                    if (i29 != 0) {
                        z15 = false;
                    }
                    if (i35 != 0) {
                        interfaceC2300f2 = C2299e.f9111N;
                    }
                    if (i37 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i45 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C34350r(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function1;
                    }
                    if (i48 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34350r(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function111 = (Function1) objM87133R;
                        i56 = i18;
                        function6 = function111;
                        n13 = n13;
                    } else {
                        i56 = i18;
                        function6 = function2;
                    }
                }
                c28655q2.m87175r();
                final C2886a c2886a11 = n13;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R3);
                }
                final InterfaceC2994c0 interfaceC2994c8 = (InterfaceC2994c0) objM87133R3;
                final float density9 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                size = values.size() - 1;
                if (size < 0) {
                    i57 = 0;
                } else {
                    i57 = size;
                }
                final int i612 = i27;
                int iM36284n9 = AbstractC12889b.m36284n(i19, 0, i57);
                zM87157i = c28655q2.m87157i(values);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C34505f(values, 1);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C34505f(values, 1);
                    c28655q2.m87172p0(objM87133R4);
                }
                z26 = z15;
                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n9, 0, c28655q2, 2);
                Integer numValueOf17 = Integer.valueOf(i19);
                Integer numValueOf18 = Integer.valueOf(values.size());
                boolean zM87157i11 = c28655q2.m87157i(values);
                final boolean z2114 = z24;
                if ((i56 & 896) == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87153g = zM87157i11 | z27 | c28655q2.m87153g(c29674bM91150b);
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R5 = new a(values, i19, c29674bM91150b, null);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(values, i19, c29674bM91150b, null);
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87254h(numValueOf17, numValueOf18, (InterfaceC4351m) objM87133R5, c28655q2);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                final float f115 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                Modifier modifierM66778b9 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C34350r(26);
                    c28655q2.m87172p0(objM87133R7);
                }
                final boolean z2115 = z25;
                AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b9, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC34504e.m109054s(f115, z2114, z2115, c29674bM91150b, i612, values, interfaceC2994c8, density9, c2886a11, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3072, 6);
                c28655q = c28655q2;
                z18 = z26;
                i54 = i19;
                z17 = z25;
                i27 = i612;
                z19 = z2114;
                function3 = function6;
                function4 = function5;
                f15 = f16;
                c2886a2 = c2886a11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c2886a2 = c2886a;
                z17 = z14;
                function3 = function2;
                z18 = z15;
                i54 = i19;
                f15 = f14;
                z19 = z13;
                function4 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i18 |= 384;
        i19 = i13;
        if ((i15 & 3072) == 0) {
            if ((i17 & 4) != 0) {
                i58 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if ((i15 & 4096) == 0) {
                    zM87157i2 = c28655q2.m87153g(c2886a);
                } else {
                    zM87157i2 = c28655q2.m87157i(c2886a);
                }
                if (zM87157i2) {
                    i58 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i58 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i18 |= i58;
        }
        i24 = i17 & 8;
        if (i24 != 0) {
            if ((i15 & 24576) == 0) {
                f14 = f13;
                if (c28655q2.m87147d(f14)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i18 |= i25;
            }
            i26 = i17 & 16;
            if (i26 != 0) {
                i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i27 = i14;
            } else {
                i27 = i14;
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87149e(i27)) {
                        i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i18 |= i28;
                }
            }
            i29 = i17 & 32;
            if (i29 != 0) {
                i18 |= 1572864;
                z15 = z4;
            } else {
                z15 = z4;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i34 = 1048576;
                    } else {
                        i34 = 524288;
                    }
                    i18 |= i34;
                }
            }
            i35 = i17 & 64;
            if (i35 != 0) {
                i18 |= 12582912;
                interfaceC2300f2 = interfaceC2300f;
            } else {
                interfaceC2300f2 = interfaceC2300f;
                if ((i15 & 12582912) == 0) {
                    if (c28655q2.m87153g(interfaceC2300f2)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i18 |= i36;
                }
            }
            i37 = i17 & 128;
            if (i37 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i38 = 67108864;
                } else {
                    i38 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i38;
            }
            i39 = i17 & 256;
            if (i39 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i44 = 536870912;
                    } else {
                        i44 = 268435456;
                    }
                    i18 |= i44;
                }
                i45 = i17 & 512;
                if (i45 != 0) {
                    i46 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i47 = 4;
                    } else {
                        i47 = 2;
                    }
                    i46 = i16 | i47;
                } else {
                    i46 = i16;
                }
                i48 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i48 != 0) {
                    if ((i16 & 48) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i49 = 32;
                        } else {
                            i49 = 16;
                        }
                        i46 |= i49;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (c28655q2.m87135U(i18 & 1, z16)) {
                        c28655q2.m87140Z();
                        i55 = i15 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i55 != 0) {
                            if (i59 != 0) {
                                i19 = 1;
                            }
                            if ((i17 & 4) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                                i18 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            if (i24 != 0) {
                                f16 = 60;
                            } else {
                                f16 = f14;
                            }
                            if (i26 != 0) {
                                i27 = 10;
                            }
                            if (i29 != 0) {
                                z15 = false;
                            }
                            if (i35 != 0) {
                                interfaceC2300f2 = C2299e.f9111N;
                            }
                            if (i37 != 0) {
                                z24 = true;
                            } else {
                                z24 = z13;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            if (i45 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C34350r(24);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function5 = (Function1) objM87133R2;
                            } else {
                                function5 = function1;
                            }
                            if (i48 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C34350r(25);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                Function1 function112 = (Function1) objM87133R;
                                i56 = i18;
                                function6 = function112;
                                n13 = n13;
                            } else {
                                i56 = i18;
                                function6 = function2;
                            }
                        } else {
                            if (i59 != 0) {
                                i19 = 1;
                            }
                            if ((i17 & 4) != 0) {
                                n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                                i18 &= -7169;
                            } else {
                                n13 = c2886a;
                            }
                            if (i24 != 0) {
                                f16 = 60;
                            } else {
                                f16 = f14;
                            }
                            if (i26 != 0) {
                                i27 = 10;
                            }
                            if (i29 != 0) {
                                z15 = false;
                            }
                            if (i35 != 0) {
                                interfaceC2300f2 = C2299e.f9111N;
                            }
                            if (i37 != 0) {
                                z24 = true;
                            } else {
                                z24 = z13;
                            }
                            if (i39 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            if (i45 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C34350r(24);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function5 = (Function1) objM87133R2;
                            } else {
                                function5 = function1;
                            }
                            if (i48 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C34350r(25);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                Function1 function113 = (Function1) objM87133R;
                                i56 = i18;
                                function6 = function113;
                                n13 = n13;
                            } else {
                                i56 = i18;
                                function6 = function2;
                            }
                        }
                        c28655q2.m87175r();
                        final C2886a c2886a12 = n13;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        final InterfaceC2994c0 interfaceC2994c9 = (InterfaceC2994c0) objM87133R3;
                        final float density10 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                        size = values.size() - 1;
                        if (size < 0) {
                            i57 = 0;
                        } else {
                            i57 = size;
                        }
                        final int i613 = i27;
                        int iM36284n10 = AbstractC12889b.m36284n(i19, 0, i57);
                        zM87157i = c28655q2.m87157i(values);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new C34505f(values, 1);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C34505f(values, 1);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        z26 = z15;
                        c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n10, 0, c28655q2, 2);
                        Integer numValueOf19 = Integer.valueOf(i19);
                        Integer numValueOf110 = Integer.valueOf(values.size());
                        boolean zM87157i12 = c28655q2.m87157i(values);
                        final boolean z2116 = z24;
                        if ((i56 & 896) == 256) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87153g = zM87157i12 | z27 | c28655q2.m87153g(c29674bM91150b);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g) {
                            objM87133R5 = new a(values, i19, c29674bM91150b, null);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(values, i19, c29674bM91150b, null);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87254h(numValueOf19, numValueOf110, (InterfaceC4351m) objM87133R5, c28655q2);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                        interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                        interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                        zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                        final float f116 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                        Modifier modifierM66778b10 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C34350r(26);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        final boolean z2117 = z25;
                        AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b10, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC34504e.m109054s(f116, z2116, z2117, c29674bM91150b, i613, values, interfaceC2994c9, density10, c2886a12, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q2, 3072, 6);
                        c28655q = c28655q2;
                        z18 = z26;
                        i54 = i19;
                        z17 = z25;
                        i27 = i613;
                        z19 = z2116;
                        function3 = function6;
                        function4 = function5;
                        f15 = f16;
                        c2886a2 = c2886a12;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        c2886a2 = c2886a;
                        z17 = z14;
                        function3 = function2;
                        z18 = z15;
                        i54 = i19;
                        f15 = f14;
                        z19 = z13;
                        function4 = function1;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i46 |= 48;
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i55 = i15 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i55 != 0) {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function114 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function114;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    } else {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function115 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function115;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    }
                    c28655q2.m87175r();
                    final C2886a c2886a13 = n13;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC2994c0 interfaceC2994c10 = (InterfaceC2994c0) objM87133R3;
                    final float density11 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                    size = values.size() - 1;
                    if (size < 0) {
                        i57 = 0;
                    } else {
                        i57 = size;
                    }
                    final int i614 = i27;
                    int iM36284n11 = AbstractC12889b.m36284n(i19, 0, i57);
                    zM87157i = c28655q2.m87157i(values);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    z26 = z15;
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n11, 0, c28655q2, 2);
                    Integer numValueOf111 = Integer.valueOf(i19);
                    Integer numValueOf112 = Integer.valueOf(values.size());
                    boolean zM87157i13 = c28655q2.m87157i(values);
                    final boolean z2118 = z24;
                    if ((i56 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87153g = zM87157i13 | z27 | c28655q2.m87153g(c29674bM91150b);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87254h(numValueOf111, numValueOf112, (InterfaceC4351m) objM87133R5, c28655q2);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                    interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                    interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                    zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    final float f117 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                    Modifier modifierM66778b11 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C34350r(26);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final boolean z2119 = z25;
                    AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b11, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC34504e.m109054s(f117, z2118, z2119, c29674bM91150b, i614, values, interfaceC2994c10, density11, c2886a13, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3072, 6);
                    c28655q = c28655q2;
                    z18 = z26;
                    i54 = i19;
                    z17 = z25;
                    i27 = i614;
                    z19 = z2118;
                    function3 = function6;
                    function4 = function5;
                    f15 = f16;
                    c2886a2 = c2886a13;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c2886a2 = c2886a;
                    z17 = z14;
                    function3 = function2;
                    z18 = z15;
                    i54 = i19;
                    f15 = f14;
                    z19 = z13;
                    function4 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i18 |= 805306368;
            i45 = i17 & 512;
            if (i45 != 0) {
                i46 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i47 = 4;
                } else {
                    i47 = 2;
                }
                i46 = i16 | i47;
            } else {
                i46 = i16;
            }
            i48 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i48 != 0) {
                if ((i16 & 48) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i49 = 32;
                    } else {
                        i49 = 16;
                    }
                    i46 |= i49;
                }
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i55 = i15 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i55 != 0) {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function116 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function116;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    } else {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function117 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function117;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    }
                    c28655q2.m87175r();
                    final C2886a c2886a14 = n13;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC2994c0 interfaceC2994c11 = (InterfaceC2994c0) objM87133R3;
                    final float density12 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                    size = values.size() - 1;
                    if (size < 0) {
                        i57 = 0;
                    } else {
                        i57 = size;
                    }
                    final int i615 = i27;
                    int iM36284n12 = AbstractC12889b.m36284n(i19, 0, i57);
                    zM87157i = c28655q2.m87157i(values);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    z26 = z15;
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n12, 0, c28655q2, 2);
                    Integer numValueOf113 = Integer.valueOf(i19);
                    Integer numValueOf114 = Integer.valueOf(values.size());
                    boolean zM87157i14 = c28655q2.m87157i(values);
                    final boolean z21110 = z24;
                    if ((i56 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87153g = zM87157i14 | z27 | c28655q2.m87153g(c29674bM91150b);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87254h(numValueOf113, numValueOf114, (InterfaceC4351m) objM87133R5, c28655q2);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                    interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                    interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                    zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    final float f118 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                    Modifier modifierM66778b12 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C34350r(26);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final boolean z21111 = z25;
                    AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b12, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC34504e.m109054s(f118, z21110, z21111, c29674bM91150b, i615, values, interfaceC2994c11, density12, c2886a14, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3072, 6);
                    c28655q = c28655q2;
                    z18 = z26;
                    i54 = i19;
                    z17 = z25;
                    i27 = i615;
                    z19 = z21110;
                    function3 = function6;
                    function4 = function5;
                    f15 = f16;
                    c2886a2 = c2886a14;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c2886a2 = c2886a;
                    z17 = z14;
                    function3 = function2;
                    z18 = z15;
                    i54 = i19;
                    f15 = f14;
                    z19 = z13;
                    function4 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i46 |= 48;
            if ((i18 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z16)) {
                c28655q2.m87140Z();
                i55 = i15 & 1;
                c28676v0 = C28635l.f115821a;
                if (i55 != 0) {
                    if (i59 != 0) {
                        i19 = 1;
                    }
                    if ((i17 & 4) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                        i18 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    if (i24 != 0) {
                        f16 = 60;
                    } else {
                        f16 = f14;
                    }
                    if (i26 != 0) {
                        i27 = 10;
                    }
                    if (i29 != 0) {
                        z15 = false;
                    }
                    if (i35 != 0) {
                        interfaceC2300f2 = C2299e.f9111N;
                    }
                    if (i37 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i45 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C34350r(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function1;
                    }
                    if (i48 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34350r(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function118 = (Function1) objM87133R;
                        i56 = i18;
                        function6 = function118;
                        n13 = n13;
                    } else {
                        i56 = i18;
                        function6 = function2;
                    }
                } else {
                    if (i59 != 0) {
                        i19 = 1;
                    }
                    if ((i17 & 4) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                        i18 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    if (i24 != 0) {
                        f16 = 60;
                    } else {
                        f16 = f14;
                    }
                    if (i26 != 0) {
                        i27 = 10;
                    }
                    if (i29 != 0) {
                        z15 = false;
                    }
                    if (i35 != 0) {
                        interfaceC2300f2 = C2299e.f9111N;
                    }
                    if (i37 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i45 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C34350r(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function1;
                    }
                    if (i48 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34350r(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function119 = (Function1) objM87133R;
                        i56 = i18;
                        function6 = function119;
                        n13 = n13;
                    } else {
                        i56 = i18;
                        function6 = function2;
                    }
                }
                c28655q2.m87175r();
                final C2886a c2886a15 = n13;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R3);
                }
                final InterfaceC2994c0 interfaceC2994c12 = (InterfaceC2994c0) objM87133R3;
                final float density13 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                size = values.size() - 1;
                if (size < 0) {
                    i57 = 0;
                } else {
                    i57 = size;
                }
                final int i616 = i27;
                int iM36284n13 = AbstractC12889b.m36284n(i19, 0, i57);
                zM87157i = c28655q2.m87157i(values);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C34505f(values, 1);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C34505f(values, 1);
                    c28655q2.m87172p0(objM87133R4);
                }
                z26 = z15;
                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n13, 0, c28655q2, 2);
                Integer numValueOf115 = Integer.valueOf(i19);
                Integer numValueOf116 = Integer.valueOf(values.size());
                boolean zM87157i15 = c28655q2.m87157i(values);
                final boolean z21112 = z24;
                if ((i56 & 896) == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87153g = zM87157i15 | z27 | c28655q2.m87153g(c29674bM91150b);
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R5 = new a(values, i19, c29674bM91150b, null);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(values, i19, c29674bM91150b, null);
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87254h(numValueOf115, numValueOf116, (InterfaceC4351m) objM87133R5, c28655q2);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                final float f119 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                Modifier modifierM66778b13 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C34350r(26);
                    c28655q2.m87172p0(objM87133R7);
                }
                final boolean z21113 = z25;
                AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b13, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC34504e.m109054s(f119, z21112, z21113, c29674bM91150b, i616, values, interfaceC2994c12, density13, c2886a15, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3072, 6);
                c28655q = c28655q2;
                z18 = z26;
                i54 = i19;
                z17 = z25;
                i27 = i616;
                z19 = z21112;
                function3 = function6;
                function4 = function5;
                f15 = f16;
                c2886a2 = c2886a15;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c2886a2 = c2886a;
                z17 = z14;
                function3 = function2;
                z18 = z15;
                i54 = i19;
                f15 = f14;
                z19 = z13;
                function4 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i18 |= 24576;
        f14 = f13;
        i26 = i17 & 16;
        if (i26 != 0) {
            i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i27 = i14;
        } else {
            i27 = i14;
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87149e(i27)) {
                    i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i18 |= i28;
            }
        }
        i29 = i17 & 32;
        if (i29 != 0) {
            i18 |= 1572864;
            z15 = z4;
        } else {
            z15 = z4;
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i34 = 1048576;
                } else {
                    i34 = 524288;
                }
                i18 |= i34;
            }
        }
        i35 = i17 & 64;
        if (i35 != 0) {
            i18 |= 12582912;
            interfaceC2300f2 = interfaceC2300f;
        } else {
            interfaceC2300f2 = interfaceC2300f;
            if ((i15 & 12582912) == 0) {
                if (c28655q2.m87153g(interfaceC2300f2)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i18 |= i36;
            }
        }
        i37 = i17 & 128;
        if (i37 != 0) {
            i18 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (c28655q2.m87155h(z13)) {
                i38 = 67108864;
            } else {
                i38 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i18 |= i38;
        }
        i39 = i17 & 256;
        if (i39 != 0) {
            if ((i15 & 805306368) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i44 = 536870912;
                } else {
                    i44 = 268435456;
                }
                i18 |= i44;
            }
            i45 = i17 & 512;
            if (i45 != 0) {
                i46 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i47 = 4;
                } else {
                    i47 = 2;
                }
                i46 = i16 | i47;
            } else {
                i46 = i16;
            }
            i48 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i48 != 0) {
                if ((i16 & 48) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i49 = 32;
                    } else {
                        i49 = 16;
                    }
                    i46 |= i49;
                }
                if ((i18 & 306783379) == 306783378) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if (c28655q2.m87135U(i18 & 1, z16)) {
                    c28655q2.m87140Z();
                    i55 = i15 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i55 != 0) {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function1110 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function1110;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    } else {
                        if (i59 != 0) {
                            i19 = 1;
                        }
                        if ((i17 & 4) != 0) {
                            n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                            i18 &= -7169;
                        } else {
                            n13 = c2886a;
                        }
                        if (i24 != 0) {
                            f16 = 60;
                        } else {
                            f16 = f14;
                        }
                        if (i26 != 0) {
                            i27 = 10;
                        }
                        if (i29 != 0) {
                            z15 = false;
                        }
                        if (i35 != 0) {
                            interfaceC2300f2 = C2299e.f9111N;
                        }
                        if (i37 != 0) {
                            z24 = true;
                        } else {
                            z24 = z13;
                        }
                        if (i39 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        if (i45 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C34350r(24);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            function5 = function1;
                        }
                        if (i48 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C34350r(25);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function1111 = (Function1) objM87133R;
                            i56 = i18;
                            function6 = function1111;
                            n13 = n13;
                        } else {
                            i56 = i18;
                            function6 = function2;
                        }
                    }
                    c28655q2.m87175r();
                    final C2886a c2886a16 = n13;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    final InterfaceC2994c0 interfaceC2994c13 = (InterfaceC2994c0) objM87133R3;
                    final float density14 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                    size = values.size() - 1;
                    if (size < 0) {
                        i57 = 0;
                    } else {
                        i57 = size;
                    }
                    final int i617 = i27;
                    int iM36284n14 = AbstractC12889b.m36284n(i19, 0, i57);
                    zM87157i = c28655q2.m87157i(values);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C34505f(values, 1);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    z26 = z15;
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n14, 0, c28655q2, 2);
                    Integer numValueOf117 = Integer.valueOf(i19);
                    Integer numValueOf118 = Integer.valueOf(values.size());
                    boolean zM87157i16 = c28655q2.m87157i(values);
                    final boolean z21114 = z24;
                    if ((i56 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87153g = zM87157i16 | z27 | c28655q2.m87153g(c29674bM91150b);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(values, i19, c29674bM91150b, null);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87254h(numValueOf117, numValueOf118, (InterfaceC4351m) objM87133R5, c28655q2);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                    interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                    interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                    zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    final float f1110 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                    Modifier modifierM66778b14 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C34350r(26);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    final boolean z21115 = z25;
                    AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b14, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC34504e.m109054s(f1110, z21114, z21115, c29674bM91150b, i617, values, interfaceC2994c13, density14, c2886a16, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3072, 6);
                    c28655q = c28655q2;
                    z18 = z26;
                    i54 = i19;
                    z17 = z25;
                    i27 = i617;
                    z19 = z21114;
                    function3 = function6;
                    function4 = function5;
                    f15 = f16;
                    c2886a2 = c2886a16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    c2886a2 = c2886a;
                    z17 = z14;
                    function3 = function2;
                    z18 = z15;
                    i54 = i19;
                    f15 = f14;
                    z19 = z13;
                    function4 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i46 |= 48;
            if ((i18 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z16)) {
                c28655q2.m87140Z();
                i55 = i15 & 1;
                c28676v0 = C28635l.f115821a;
                if (i55 != 0) {
                    if (i59 != 0) {
                        i19 = 1;
                    }
                    if ((i17 & 4) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                        i18 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    if (i24 != 0) {
                        f16 = 60;
                    } else {
                        f16 = f14;
                    }
                    if (i26 != 0) {
                        i27 = 10;
                    }
                    if (i29 != 0) {
                        z15 = false;
                    }
                    if (i35 != 0) {
                        interfaceC2300f2 = C2299e.f9111N;
                    }
                    if (i37 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i45 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C34350r(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function1;
                    }
                    if (i48 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34350r(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function1112 = (Function1) objM87133R;
                        i56 = i18;
                        function6 = function1112;
                        n13 = n13;
                    } else {
                        i56 = i18;
                        function6 = function2;
                    }
                } else {
                    if (i59 != 0) {
                        i19 = 1;
                    }
                    if ((i17 & 4) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                        i18 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    if (i24 != 0) {
                        f16 = 60;
                    } else {
                        f16 = f14;
                    }
                    if (i26 != 0) {
                        i27 = 10;
                    }
                    if (i29 != 0) {
                        z15 = false;
                    }
                    if (i35 != 0) {
                        interfaceC2300f2 = C2299e.f9111N;
                    }
                    if (i37 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i45 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C34350r(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function1;
                    }
                    if (i48 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34350r(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function1113 = (Function1) objM87133R;
                        i56 = i18;
                        function6 = function1113;
                        n13 = n13;
                    } else {
                        i56 = i18;
                        function6 = function2;
                    }
                }
                c28655q2.m87175r();
                final C2886a c2886a17 = n13;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R3);
                }
                final InterfaceC2994c0 interfaceC2994c14 = (InterfaceC2994c0) objM87133R3;
                final float density15 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                size = values.size() - 1;
                if (size < 0) {
                    i57 = 0;
                } else {
                    i57 = size;
                }
                final int i618 = i27;
                int iM36284n15 = AbstractC12889b.m36284n(i19, 0, i57);
                zM87157i = c28655q2.m87157i(values);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C34505f(values, 1);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C34505f(values, 1);
                    c28655q2.m87172p0(objM87133R4);
                }
                z26 = z15;
                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n15, 0, c28655q2, 2);
                Integer numValueOf119 = Integer.valueOf(i19);
                Integer numValueOf1110 = Integer.valueOf(values.size());
                boolean zM87157i17 = c28655q2.m87157i(values);
                final boolean z21116 = z24;
                if ((i56 & 896) == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87153g = zM87157i17 | z27 | c28655q2.m87153g(c29674bM91150b);
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R5 = new a(values, i19, c29674bM91150b, null);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(values, i19, c29674bM91150b, null);
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87254h(numValueOf119, numValueOf1110, (InterfaceC4351m) objM87133R5, c28655q2);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                final float f1111 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                Modifier modifierM66778b15 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C34350r(26);
                    c28655q2.m87172p0(objM87133R7);
                }
                final boolean z21117 = z25;
                AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b15, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC34504e.m109054s(f1111, z21116, z21117, c29674bM91150b, i618, values, interfaceC2994c14, density15, c2886a17, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3072, 6);
                c28655q = c28655q2;
                z18 = z26;
                i54 = i19;
                z17 = z25;
                i27 = i618;
                z19 = z21116;
                function3 = function6;
                function4 = function5;
                f15 = f16;
                c2886a2 = c2886a17;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c2886a2 = c2886a;
                z17 = z14;
                function3 = function2;
                z18 = z15;
                i54 = i19;
                f15 = f14;
                z19 = z13;
                function4 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i18 |= 805306368;
        i45 = i17 & 512;
        if (i45 != 0) {
            i46 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (c28655q2.m87157i(function1)) {
                i47 = 4;
            } else {
                i47 = 2;
            }
            i46 = i16 | i47;
        } else {
            i46 = i16;
        }
        i48 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i48 != 0) {
            if ((i16 & 48) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i49 = 32;
                } else {
                    i49 = 16;
                }
                i46 |= i49;
            }
            if ((i18 & 306783379) == 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q2.m87135U(i18 & 1, z16)) {
                c28655q2.m87140Z();
                i55 = i15 & 1;
                c28676v0 = C28635l.f115821a;
                if (i55 != 0) {
                    if (i59 != 0) {
                        i19 = 1;
                    }
                    if ((i17 & 4) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                        i18 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    if (i24 != 0) {
                        f16 = 60;
                    } else {
                        f16 = f14;
                    }
                    if (i26 != 0) {
                        i27 = 10;
                    }
                    if (i29 != 0) {
                        z15 = false;
                    }
                    if (i35 != 0) {
                        interfaceC2300f2 = C2299e.f9111N;
                    }
                    if (i37 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i45 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C34350r(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function1;
                    }
                    if (i48 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34350r(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function1114 = (Function1) objM87133R;
                        i56 = i18;
                        function6 = function1114;
                        n13 = n13;
                    } else {
                        i56 = i18;
                        function6 = function2;
                    }
                } else {
                    if (i59 != 0) {
                        i19 = 1;
                    }
                    if ((i17 & 4) != 0) {
                        n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                        i18 &= -7169;
                    } else {
                        n13 = c2886a;
                    }
                    if (i24 != 0) {
                        f16 = 60;
                    } else {
                        f16 = f14;
                    }
                    if (i26 != 0) {
                        i27 = 10;
                    }
                    if (i29 != 0) {
                        z15 = false;
                    }
                    if (i35 != 0) {
                        interfaceC2300f2 = C2299e.f9111N;
                    }
                    if (i37 != 0) {
                        z24 = true;
                    } else {
                        z24 = z13;
                    }
                    if (i39 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    if (i45 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C34350r(24);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function1;
                    }
                    if (i48 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34350r(25);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function1115 = (Function1) objM87133R;
                        i56 = i18;
                        function6 = function1115;
                        n13 = n13;
                    } else {
                        i56 = i18;
                        function6 = function2;
                    }
                }
                c28655q2.m87175r();
                final C2886a c2886a18 = n13;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R3);
                }
                final InterfaceC2994c0 interfaceC2994c15 = (InterfaceC2994c0) objM87133R3;
                final float density16 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
                size = values.size() - 1;
                if (size < 0) {
                    i57 = 0;
                } else {
                    i57 = size;
                }
                final int i619 = i27;
                int iM36284n16 = AbstractC12889b.m36284n(i19, 0, i57);
                zM87157i = c28655q2.m87157i(values);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C34505f(values, 1);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C34505f(values, 1);
                    c28655q2.m87172p0(objM87133R4);
                }
                z26 = z15;
                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n16, 0, c28655q2, 2);
                Integer numValueOf1111 = Integer.valueOf(i19);
                Integer numValueOf1112 = Integer.valueOf(values.size());
                boolean zM87157i18 = c28655q2.m87157i(values);
                final boolean z21118 = z24;
                if ((i56 & 896) == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87153g = zM87157i18 | z27 | c28655q2.m87153g(c29674bM91150b);
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R5 = new a(values, i19, c29674bM91150b, null);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new a(values, i19, c29674bM91150b, null);
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87254h(numValueOf1111, numValueOf1112, (InterfaceC4351m) objM87133R5, c28655q2);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
                zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                final float f1112 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                Modifier modifierM66778b16 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C34350r(26);
                    c28655q2.m87172p0(objM87133R7);
                }
                final boolean z21119 = z25;
                AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b16, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC34504e.m109054s(f1112, z21118, z21119, c29674bM91150b, i619, values, interfaceC2994c15, density16, c2886a18, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3072, 6);
                c28655q = c28655q2;
                z18 = z26;
                i54 = i19;
                z17 = z25;
                i27 = i619;
                z19 = z21118;
                function3 = function6;
                function4 = function5;
                f15 = f16;
                c2886a2 = c2886a18;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c2886a2 = c2886a;
                z17 = z14;
                function3 = function2;
                z18 = z15;
                i54 = i19;
                f15 = f14;
                z19 = z13;
                function4 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i46 |= 48;
        if ((i18 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q2.m87135U(i18 & 1, z16)) {
            c28655q2.m87140Z();
            i55 = i15 & 1;
            c28676v0 = C28635l.f115821a;
            if (i55 != 0) {
                if (i59 != 0) {
                    i19 = 1;
                }
                if ((i17 & 4) != 0) {
                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                    i18 &= -7169;
                } else {
                    n13 = c2886a;
                }
                if (i24 != 0) {
                    f16 = 60;
                } else {
                    f16 = f14;
                }
                if (i26 != 0) {
                    i27 = 10;
                }
                if (i29 != 0) {
                    z15 = false;
                }
                if (i35 != 0) {
                    interfaceC2300f2 = C2299e.f9111N;
                }
                if (i37 != 0) {
                    z24 = true;
                } else {
                    z24 = z13;
                }
                if (i39 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (i45 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C34350r(24);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                } else {
                    function5 = function1;
                }
                if (i48 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C34350r(25);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function1 function1116 = (Function1) objM87133R;
                    i56 = i18;
                    function6 = function1116;
                    n13 = n13;
                } else {
                    i56 = i18;
                    function6 = function2;
                }
            } else {
                if (i59 != 0) {
                    i19 = 1;
                }
                if ((i17 & 4) != 0) {
                    n13 = C38072d.f163053a.m121952e(c28655q2, 6).getN5();
                    i18 &= -7169;
                } else {
                    n13 = c2886a;
                }
                if (i24 != 0) {
                    f16 = 60;
                } else {
                    f16 = f14;
                }
                if (i26 != 0) {
                    i27 = 10;
                }
                if (i29 != 0) {
                    z15 = false;
                }
                if (i35 != 0) {
                    interfaceC2300f2 = C2299e.f9111N;
                }
                if (i37 != 0) {
                    z24 = true;
                } else {
                    z24 = z13;
                }
                if (i39 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (i45 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C34350r(24);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                } else {
                    function5 = function1;
                }
                if (i48 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C34350r(25);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function1 function1117 = (Function1) objM87133R;
                    i56 = i18;
                    function6 = function1117;
                    n13 = n13;
                } else {
                    i56 = i18;
                    function6 = function2;
                }
            }
            c28655q2.m87175r();
            final C2886a c2886a19 = n13;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R3);
            }
            final InterfaceC2994c0 interfaceC2994c16 = (InterfaceC2994c0) objM87133R3;
            final float density17 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getDensity();
            size = values.size() - 1;
            if (size < 0) {
                i57 = 0;
            } else {
                i57 = size;
            }
            final int i6110 = i27;
            int iM36284n17 = AbstractC12889b.m36284n(i19, 0, i57);
            zM87157i = c28655q2.m87157i(values);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R4 = new C34505f(values, 1);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C34505f(values, 1);
                c28655q2.m87172p0(objM87133R4);
            }
            z26 = z15;
            c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R4, iM36284n17, 0, c28655q2, 2);
            Integer numValueOf1113 = Integer.valueOf(i19);
            Integer numValueOf1114 = Integer.valueOf(values.size());
            boolean zM87157i19 = c28655q2.m87157i(values);
            final boolean z211110 = z24;
            if ((i56 & 896) == 256) {
                z27 = true;
            } else {
                z27 = false;
            }
            zM87153g = zM87157i19 | z27 | c28655q2.m87153g(c29674bM91150b);
            objM87133R5 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R5 = new a(values, i19, c29674bM91150b, null);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new a(values, i19, c29674bM91150b, null);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87254h(numValueOf1113, numValueOf1114, (InterfaceC4351m) objM87133R5, c28655q2);
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(values, c28655q2);
            interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function6, c28655q2);
            interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q2);
            zM87153g2 = c28655q2.m87153g(c29674bM91150b) | ((i56 & 3670016) == 1048576) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
            objM87133R6 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new b(z26, c29674bM91150b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, null);
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
            final float f1113 = f16 * ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
            Modifier modifierM66778b17 = ((C23016z) WhoopSpinnerSelector).m66778b(C2314t.f9131w, interfaceC2300f2);
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C34350r(26);
                c28655q2.m87172p0(objM87133R7);
            }
            final boolean z211111 = z25;
            AbstractC22953f.m66714a(AbstractC15676d.m44099b(modifierM66778b17, z25, (Function1) objM87133R7), null, false, AbstractC37817c.m121344e(1263149761, c28655q2, new Function3() { // from class: u31.a
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC34504e.m109054s(f1113, z211110, z211111, c29674bM91150b, i6110, values, interfaceC2994c16, density17, c2886a19, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q2, 3072, 6);
            c28655q = c28655q2;
            z18 = z26;
            i54 = i19;
            z17 = z25;
            i27 = i6110;
            z19 = z211110;
            function3 = function6;
            function4 = function5;
            f15 = f16;
            c2886a2 = c2886a19;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c2886a2 = c2886a;
            z17 = z14;
            function3 = function2;
            z18 = z15;
            i54 = i19;
            f15 = f14;
            z19 = z13;
            function4 = function1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: u31.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC34504e.m109048m(WhoopSpinnerSelector, values, i54, c2886a2, f15, i27, z18, interfaceC2300f2, z19, z17, function4, function3, i15, i16, i17, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m109046k(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m109047l(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m109048m(InterfaceC23013y interfaceC23013y, List list, int i13, C2886a c2886a, float f13, int i14, boolean z4, InterfaceC2300f interfaceC2300f, boolean z13, boolean z14, Function1 function1, Function1 function2, int i15, int i16, int i17, Composer composer, int i18) {
        m109045j(interfaceC23013y, list, i13, c2886a, f13, i14, z4, interfaceC2300f, z13, z14, function1, function2, composer, AbstractC28683x.m87244L(i15 | 1), AbstractC28683x.m87244L(i16), i17);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final int m109049n(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final List<String> m109050o(InterfaceC28670t2 interfaceC28670t2) {
        return (List) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Function1 m109051p(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Function1 m109052q(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Modifier m109053r(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1102d.m3409f(1.0f, applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m109054s(float f13, boolean z4, boolean z13, final AbstractC29701y abstractC29701y, int i13, final List list, final InterfaceC2994c0 interfaceC2994c0, final float f14, final C2886a c2886a, InterfaceC23004v BoxWithConstraints, Composer composer, int i14) {
        int i15;
        C2307m c2307m = C2299e.f9102E;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i14 & 6) == 0) {
            i15 = i14 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i15 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C1101c c1101c = (C1101c) BoxWithConstraints;
            float f15 = 5;
            final float fM3402c = Float.compare(f13, c1101c.m3402c() / f15) > 0 ? c1101c.m3402c() / f15 : f13;
            C2314t c2314t = C2314t.f9131w;
            C1100b c1100b = C1100b.f4583a;
            if (z4) {
                c28655q.m87150e0(-2008156425);
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3424u(1.3f * fM3402c, AbstractC1102d.m3411h(fM3402c, c1100b.mo3400a(c2314t, c2307m))), C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC17918w0.f69621a), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2007870047);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e = AbstractC1102d.m3411h(f15 * fM3402c, c1100b.mo3400a(c2314t, c2307m)).mo3471e(z13 ? AbstractC1102d.m3409f(1.0f, c2314t) : AbstractC1102d.m3429z(c2314t, null, 3));
            if (i13 < 0) {
                AbstractC22086a.m63158a("pages should be greater than or equal to 0. You have used " + i13 + '.');
            }
            float f16 = 2 * fM3402c;
            AbstractC12240d.m34071h(abstractC29701y, modifierMo3471e, AbstractC1099a.m3381c(0.0f, f16, 0.0f, f16, 5), null, 0.0f, null, AbstractC11894a.m31975x(abstractC29701y, new C29696t(i13), c28655q, 0, 28), false, null, null, null, AbstractC37817c.m121344e(-1595886798, c28655q, new InterfaceC4352n() { // from class: u31.c
                @Override // c93.InterfaceC4352n
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC34504e.m109055t(abstractC29701y, list, fM3402c, interfaceC2994c0, f14, c2886a, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                }
            }), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m109055t(AbstractC29701y abstractC29701y, List list, float f13, InterfaceC2994c0 interfaceC2994c0, final float f14, C2886a c2886a, InterfaceC29694r VerticalPager, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(VerticalPager, "$this$VerticalPager");
        final float fM91162k = (i13 - abstractC29701y.m91162k()) - ((C28617g1) abstractC29701y.f121433d.f93080d).m87022x();
        final float fAbs = Math.abs(fM91162k);
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC11266d.m30453g(c28655q);
        }
        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
        String str = (String) list.get(i13);
        long brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
        Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3411h(f13, C2314t.f9131w), null, 3);
        boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(abstractC29701y) | ((((i14 & 112) ^ 48) > 32 && c28655q.m87149e(i13)) || (i14 & 48) == 32);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C3404g(interfaceC2994c0, abstractC29701y, i13, 1);
            c28655q.m87172p0(objM87133R2);
        }
        Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3427x, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28);
        boolean zM87147d = c28655q.m87147d(fAbs) | c28655q.m87147d(fM91162k) | c28655q.m87147d(f14);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87147d || objM87133R3 == c28676v0) {
            objM87133R3 = new Function1() { // from class: u31.d
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC34504e.m109057v(fAbs, fM91162k, f14, (InterfaceC17886g0) obj);
                }
            };
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC30795n.m94707h(str, AbstractC1127a.m3486a(modifierM3360e, (Function1) objM87133R3), brandWhite, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886a, null, c28655q, 0, 0, 196088);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m109056u(InterfaceC2994c0 interfaceC2994c0, AbstractC29701y abstractC29701y, int i13) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(abstractC29701y, i13, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m109057v(float f13, float f14, float f15, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51551a(AbstractC12889b.m36283m(1.0f - (0.38f * f13), 0.0f, 1.0f));
        c17920x0.m51561r(AbstractC12889b.m36283m(1.0f - (0.2f * f13), 0.55f, 1.0f));
        c17920x0.m51560p(AbstractC12889b.m36283m(1.0f - (f13 * 0.06f), 0.88f, 1.0f));
        c17920x0.m51557k(f14 * 12.0f);
        c17920x0.m51553c(f15 * 16.0f);
        int i13 = C17881e1.f69567c;
        c17920x0.m51565y(C17881e1.f69566b);
        return C23454a0.f92919a;
    }
}
