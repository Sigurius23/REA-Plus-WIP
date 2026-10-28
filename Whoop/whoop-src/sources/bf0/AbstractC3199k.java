package bf0;

import a80.C0542f;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b72.C2783a;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fy1.AbstractC14874j;
import gz0.EnumC16313m0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import kd0.InterfaceC22381a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import mf0.AbstractC25502a;
import mf0.AbstractC25506e;
import mf0.C25508g;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p000.C17820i;
import p000.C22079k;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import ze0.AbstractC40584c;
import ze0.InterfaceC40582a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: bf0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lze0/c;", "viewState", "Lzr2/a;", "dateAndTimeProvider", "", "isUsing24HourTime", "Lkotlin/Function1;", "Lkd0/a$c;", "Ll83/a0;", "onAnalyticsEvent", "Lze0/a;", "onEvent", "t", "(Lze0/c;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lze0/c$e;", "A", "(Lze0/c$e;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lze0/c$a;", "Lkotlin/Function0;", "onButtonClick", "r", "(Lze0/c$a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3199k {

    /* JADX INFO: renamed from: bf0.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.view.TestUploadScreenKt$TestUploadScreen$3$1", m100430f = "TestUploadScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12535w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f12536x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12536x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f12536x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12535w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f12536x.invoke(InterfaceC22381a.c1.f87392a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bf0.k$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.view.TestUploadScreenKt$TestUploadScreen$5$1", m100430f = "TestUploadScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12537w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f12538x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12538x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f12538x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12537w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f12538x.invoke(InterfaceC22381a.b1.f87390a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bf0.k$c */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.view.TestUploadScreenKt$TestUploadScreenSuccess$3$1$1$1$1", m100430f = "TestUploadScreen.kt", m100431l = {106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12539w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f12540x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12540x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f12540x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f12539w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f12540x;
                this.f12539w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bf0.k$d */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.view.TestUploadScreenKt$TestUploadScreenSuccess$4$1$1$1", m100430f = "TestUploadScreen.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12541w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC40584c.e f12542x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f12543y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC40584c.e eVar, C15199y3 c15199y3, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12542x = eVar;
            this.f12543y = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f12542x, this.f12543y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f12541w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (((AbstractC40584c.e.a) this.f12542x).getBottomSheet() != null) {
                    C15199y3 c15199y3 = this.f12543y;
                    this.f12541w = 1;
                    if (c15199y3.m43225f(this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: bf0.k$e */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.view.TestUploadScreenKt$TestUploadScreenSuccess$4$3$1$1", m100430f = "TestUploadScreen.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12544w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC40584c.e f12545x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f12546y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC40584c.e eVar, C15199y3 c15199y3, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12545x = eVar;
            this.f12546y = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f12545x, this.f12546y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f12544w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (((AbstractC40584c.e.c) this.f12545x).getBottomSheet() != null) {
                    C15199y3 c15199y3 = this.f12546y;
                    this.f12544w = 1;
                    if (c15199y3.m43225f(this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: bf0.k$f */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.view.TestUploadScreenKt$TestUploadScreenSuccess$4$4$1$1", m100430f = "TestUploadScreen.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12547w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC40584c.e f12548x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f12549y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC40584c.e eVar, C15199y3 c15199y3, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12548x = eVar;
            this.f12549y = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f12548x, this.f12549y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f12547w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (((AbstractC40584c.e.b) this.f12548x).getBottomSheet() != null) {
                    C15199y3 c15199y3 = this.f12549y;
                    this.f12547w = 1;
                    if (c15199y3.m43225f(this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: A */
    private static final void m9198A(AbstractC40584c.e eVar, InterfaceC41070a interfaceC41070a, boolean z4, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z13;
        C28655q c28655q;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1525440293);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(eVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(interfaceC41070a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                i15 |= c28655q2.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z13)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C2783a(10);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function6 = (Function1) objM87133R3;
                    } else {
                        function6 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C2783a(11);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function7 = (Function1) objM87133R2;
                    } else {
                        function7 = function4;
                    }
                    C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q2, 6, 14);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    C35666g c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                    Function1 function8 = function6;
                    AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(-185896951, c28655q2, new C0542f(eVar, interfaceC2994c0, c15199y3M3460c, 4));
                    Function1 function9 = function7;
                    c28655q = c28655q2;
                    AbstractC35660d.m112871m(null, c35666g, aVar, null, null, null, null, c37816bM121344e, false, null, null, null, false, null, AbstractC37817c.m121344e(2101156301, c28655q2, new C3198j(eVar, interfaceC41070a, z4, interfaceC2994c0, c15199y3M3460c, function9, function8, 0)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                    function4 = function9;
                    function5 = function8;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g((Object) eVar, (Object) interfaceC41070a, z4, (Object) function5, (InterfaceC23459e) function4, i13, i14, 0);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2783a(10);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function6 = (Function1) objM87133R3;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C2783a(11);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                } else {
                    function7 = function4;
                }
                C15199y3 c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q2, 6, 14);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R;
                C35666g c35666g2 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                Function1 function10 = function6;
                AbstractC35664f.a aVar2 = new AbstractC35664f.a(c15199y3M3460c2);
                C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-185896951, c28655q2, new C0542f(eVar, interfaceC2994c1, c15199y3M3460c2, 4));
                Function1 function11 = function7;
                c28655q = c28655q2;
                AbstractC35660d.m112871m(null, c35666g2, aVar2, null, null, null, null, c37816bM121344e2, false, null, null, null, false, null, AbstractC37817c.m121344e(2101156301, c28655q2, new C3198j(eVar, interfaceC41070a, z4, interfaceC2994c1, c15199y3M3460c2, function11, function10, 0)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                function4 = function11;
                function5 = function10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) eVar, (Object) interfaceC41070a, z4, (Object) function5, (InterfaceC23459e) function4, i13, i14, 0);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C2783a(10);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function6 = (Function1) objM87133R3;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C2783a(11);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function7 = (Function1) objM87133R2;
                } else {
                    function7 = function4;
                }
                C15199y3 c15199y3M3460c3 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q2, 6, 14);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) objM87133R;
                C35666g c35666g3 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                Function1 function12 = function6;
                AbstractC35664f.a aVar3 = new AbstractC35664f.a(c15199y3M3460c3);
                C37816b c37816bM121344e3 = AbstractC37817c.m121344e(-185896951, c28655q2, new C0542f(eVar, interfaceC2994c2, c15199y3M3460c3, 4));
                Function1 function13 = function7;
                c28655q = c28655q2;
                AbstractC35660d.m112871m(null, c35666g3, aVar3, null, null, null, null, c37816bM121344e3, false, null, null, null, false, null, AbstractC37817c.m121344e(2101156301, c28655q2, new C3198j(eVar, interfaceC41070a, z4, interfaceC2994c2, c15199y3M3460c3, function13, function12, 0)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
                function4 = function13;
                function5 = function12;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) eVar, (Object) interfaceC41070a, z4, (Object) function5, (InterfaceC23459e) function4, i13, i14, 0);
            }
        }
        i15 |= 24576;
        function4 = function2;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C2783a(10);
                    c28655q2.m87172p0(objM87133R3);
                }
                function6 = (Function1) objM87133R3;
            } else {
                function6 = function3;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C2783a(11);
                    c28655q2.m87172p0(objM87133R2);
                }
                function7 = (Function1) objM87133R2;
            } else {
                function7 = function4;
            }
            C15199y3 c15199y3M3460c4 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q2, 6, 14);
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c3 = (InterfaceC2994c0) objM87133R;
            C35666g c35666g4 = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
            Function1 function14 = function6;
            AbstractC35664f.a aVar4 = new AbstractC35664f.a(c15199y3M3460c4);
            C37816b c37816bM121344e4 = AbstractC37817c.m121344e(-185896951, c28655q2, new C0542f(eVar, interfaceC2994c3, c15199y3M3460c4, 4));
            Function1 function15 = function7;
            c28655q = c28655q2;
            AbstractC35660d.m112871m(null, c35666g4, aVar4, null, null, null, null, c37816bM121344e4, false, null, null, null, false, null, AbstractC37817c.m121344e(2101156301, c28655q2, new C3198j(eVar, interfaceC41070a, z4, interfaceC2994c3, c15199y3M3460c4, function15, function14, 0)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
            function4 = function15;
            function5 = function14;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function5 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g((Object) eVar, (Object) interfaceC41070a, z4, (Object) function5, (InterfaceC23459e) function4, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m9199B(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m9200C(InterfaceC40582a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m9201D(AbstractC40584c.e eVar, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC40584c.a bottomSheet = eVar.getBottomSheet();
            if (bottomSheet == null) {
                c28655q.m87150e0(-1843178955);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1843178954);
                boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3196h(interfaceC2994c0, c15199y3, 0);
                    c28655q.m87172p0(objM87133R);
                }
                m9226r(bottomSheet, (InterfaceC4339a) objM87133R, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m9202E(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m9203F(AbstractC40584c.e eVar, InterfaceC41070a interfaceC41070a, boolean z4, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, Function1 function2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean z13 = eVar instanceof AbstractC40584c.e.a;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13) {
                c28655q.m87150e0(694110756);
                AbstractC40584c.e.a aVar = (AbstractC40584c.e.a) eVar;
                C25508g testInputViewState = aVar.getTestInputViewState();
                EnumC16313m0 enumC16313m0 = EnumC16313m0.CARET_BACKWARD;
                boolean zM87153g = c28655q.m87153g(eVar) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C3718c(interfaceC2994c0, aVar, c15199y3, 11);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87153g(function2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2777c(function1, 1, function2);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC25506e.m74910A(null, testInputViewState, interfaceC41070a, z4, enumC16313m0, false, false, interfaceC4339a, (Function1) objM87133R2, c28655q, 24576, 97);
                c28655q.m87173q(false);
            } else if (eVar instanceof AbstractC40584c.e.c) {
                c28655q.m87150e0(695388607);
                AbstractC40584c.e.c cVar = (AbstractC40584c.e.c) eVar;
                boolean zM87153g3 = c28655q.m87153g(eVar) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C3718c(interfaceC2994c0, cVar, c15199y3, 12);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC3190b.m9180f(cVar, (InterfaceC4339a) objM87133R3, function1, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                if (!(eVar instanceof AbstractC40584c.e.b)) {
                    throw AbstractC11895b.m32003v(576578472, c28655q, false);
                }
                c28655q.m87150e0(695718943);
                AbstractC40584c.e.b bVar = (AbstractC40584c.e.b) eVar;
                boolean zM87153g4 = c28655q.m87153g(eVar) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87153g4 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C3718c(interfaceC2994c0, bVar, c15199y3, 13);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC3194f.m9192f(bVar, (InterfaceC4339a) objM87133R4, null, function1, c28655q, 0, 4);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m9204G(InterfaceC2994c0 interfaceC2994c0, AbstractC40584c.e eVar, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(eVar, c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m9205H(Function1 function1, Function1 function2, AbstractC25502a testInputAction) {
        AbstractC22676k.m65750j(testInputAction, "testInputAction");
        if (testInputAction instanceof AbstractC25502a.a) {
            function1.invoke(InterfaceC40582a.a.f174783a);
        } else {
            if (!(testInputAction instanceof AbstractC25502a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            function2.invoke(InterfaceC22381a.b.f87387a);
            AbstractC25502a.b bVar = (AbstractC25502a.b) testInputAction;
            function1.invoke(new InterfaceC40582a.l(bVar.getTestName(), bVar.getLocalDateTime()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m9206I(InterfaceC2994c0 interfaceC2994c0, AbstractC40584c.e eVar, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(eVar, c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m9207J(InterfaceC2994c0 interfaceC2994c0, AbstractC40584c.e eVar, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(eVar, c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m9208K(AbstractC40584c.e eVar, InterfaceC41070a interfaceC41070a, boolean z4, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m9198A(eVar, interfaceC41070a, z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m9226r(AbstractC40584c.a aVar, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2017947028);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 1 * f13;
            float f15 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f14, f15, f14, 0.0f, 8);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            String title = aVar.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a h7 = c38072d.m121952e(c28655q, i15).getH4();
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(title, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(aVar.getDescription(), AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 48, i16, 196600);
            c28655q = c28655q;
            AbstractC40584c.b button = aVar.getButton();
            if (button == null) {
                c28655q.m87150e0(-1513307211);
                c28655q.m87173q(false);
                z4 = true;
            } else {
                c28655q.m87150e0(-1513307210);
                AbstractC27271o0.m82253b(AbstractC1099a.m3398t(c2314t, 0.0f, 5 * f13, 0.0f, 0.0f, 13), false, AbstractC8693b.m21278l(button.getText()), null, null, null, null, null, false, null, interfaceC4339a, c28655q, (TextResource.$stable << 6) | 6, (i14 >> 3) & 14, MessageListItemViewType.POLL);
                c28655q.m87173q(false);
                z4 = true;
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(aVar, interfaceC4339a, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m9227s(AbstractC40584c.a aVar, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m9226r(aVar, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:106:0x01da  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:122:0x0202  */
    /* JADX WARN: Code duplicated, block: B:125:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x020d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0229  */
    /* JADX WARN: Code duplicated, block: B:132:0x0231  */
    /* JADX WARN: Code duplicated, block: B:135:0x023c  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x013d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
    /* JADX INFO: renamed from: t */
    public static final void m9228t(final AbstractC40584c viewState, InterfaceC41070a dateAndTimeProvider, boolean z4, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z13;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        int i18;
        Function1 function9;
        Function1 function10;
        AbstractC40584c.c cVar;
        C33211q0 modalState;
        AbstractC33208p0 type;
        final Function1 function11;
        boolean z14;
        boolean z15;
        int i19;
        boolean z16;
        boolean z17;
        Object objM87133R;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R2;
        boolean z25;
        Object objM87133R3;
        boolean z26;
        Object objM87133R4;
        InterfaceC40582a primaryClickEvent;
        boolean z27;
        boolean zM87157i;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1711226386);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(dateAndTimeProvider) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 16384;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C2783a(8);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C2783a(9);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function8 = (Function1) objM87133R6;
                    } else {
                        function8 = function4;
                    }
                    i18 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_test_upload", c28655q, i18 | 48);
                    if (viewState instanceof AbstractC40584c.e) {
                        c28655q.m87150e0(2116951302);
                        m9198A((AbstractC40584c.e) viewState, dateAndTimeProvider, z4, function7, function8, c28655q, i15 & 65534, 0);
                        function9 = function7;
                        c28655q.m87173q(false);
                        function11 = function8;
                    } else {
                        function9 = function7;
                        function10 = function8;
                        if (viewState instanceof AbstractC40584c.c) {
                            throw AbstractC11895b.m32003v(483930200, c28655q, false);
                        }
                        c28655q.m87150e0(2117331982);
                        cVar = (AbstractC40584c.c) viewState;
                        modalState = cVar.getModalState();
                        type = modalState.getType();
                        if (type instanceof AbstractC33208p0.h) {
                            c28655q.m87150e0(2117497801);
                            if ((i15 & 7168) == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z26 || objM87133R4 == c28676v0) {
                                objM87133R4 = new a(function9, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, viewState);
                            primaryClickEvent = cVar.getPrimaryClickEvent();
                            if (primaryClickEvent == null) {
                                primaryClickEvent = InterfaceC40582a.a.f174783a;
                            }
                            AbstractC33208p0.h hVar = (AbstractC33208p0.h) type;
                            if ((i15 & 57344) == 16384) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            zM87157i = c28655q.m87157i(primaryClickEvent) | z27;
                            objM87133R5 = c28655q.m87133R();
                            if (zM87157i || objM87133R5 == c28676v0) {
                                objM87133R5 = new C17820i(22, function10, primaryClickEvent);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function11 = function10;
                            AbstractC33199m0.m105214F(AbstractC33208p0.h.m105313g(hVar, null, 0L, (InterfaceC4339a) objM87133R5, 3, null), modalState.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            z14 = false;
                        } else {
                            function11 = function10;
                            z14 = false;
                            c28655q.m87150e0(2118011626);
                            if (type instanceof AbstractC33208p0.b) {
                                c28655q.m87150e0(2118063489);
                                if ((i15 & 7168) == 2048) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                objM87133R3 = c28655q.m87133R();
                                if (z25 || objM87133R3 == c28676v0) {
                                    objM87133R3 = new b(function9, null);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, viewState);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(2118235508);
                                c28655q.m87173q(false);
                            }
                            if (i18 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            i19 = i15 & 57344;
                            if (i19 == 16384) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z15 | z16;
                            objM87133R = c28655q.m87133R();
                            if (z17 || objM87133R == c28676v0) {
                                final int i25 = 0;
                                objM87133R = new InterfaceC4339a() { // from class: bf0.i
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i25) {
                                            case 0:
                                                return AbstractC3199k.m9232x(viewState, function11);
                                            default:
                                                return AbstractC3199k.m9233y(viewState, function11);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                            if (i18 == 4) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (i19 == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z24 = z18 | z19;
                            objM87133R2 = c28655q.m87133R();
                            if (z24 || objM87133R2 == c28676v0) {
                                final int i26 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: bf0.i
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC3199k.m9232x(viewState, function11);
                                            default:
                                                return AbstractC3199k.m9233y(viewState, function11);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            Function0.m105274p(modalState, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z14);
                    }
                    function6 = function11;
                    function5 = function9;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g((Object) viewState, (Object) dateAndTimeProvider, z4, (Object) function5, (InterfaceC23459e) function6, i13, i14, 1);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C2783a(8);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C2783a(9);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                i18 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_test_upload", c28655q, i18 | 48);
                if (viewState instanceof AbstractC40584c.e) {
                    c28655q.m87150e0(2116951302);
                    m9198A((AbstractC40584c.e) viewState, dateAndTimeProvider, z4, function7, function8, c28655q, i15 & 65534, 0);
                    function9 = function7;
                    c28655q.m87173q(false);
                    function11 = function8;
                } else {
                    function9 = function7;
                    function10 = function8;
                    if (viewState instanceof AbstractC40584c.c) {
                        throw AbstractC11895b.m32003v(483930200, c28655q, false);
                    }
                    c28655q.m87150e0(2117331982);
                    cVar = (AbstractC40584c.c) viewState;
                    modalState = cVar.getModalState();
                    type = modalState.getType();
                    if (type instanceof AbstractC33208p0.h) {
                        c28655q.m87150e0(2117497801);
                        if ((i15 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z26) {
                            objM87133R4 = new a(function9, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(function9, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, viewState);
                        primaryClickEvent = cVar.getPrimaryClickEvent();
                        if (primaryClickEvent == null) {
                            primaryClickEvent = InterfaceC40582a.a.f174783a;
                        }
                        AbstractC33208p0.h hVar2 = (AbstractC33208p0.h) type;
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87157i = c28655q.m87157i(primaryClickEvent) | z27;
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R5 = new C17820i(22, function10, primaryClickEvent);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C17820i(22, function10, primaryClickEvent);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function11 = function10;
                        AbstractC33199m0.m105214F(AbstractC33208p0.h.m105313g(hVar2, null, 0L, (InterfaceC4339a) objM87133R5, 3, null), modalState.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        function11 = function10;
                        z14 = false;
                        c28655q.m87150e0(2118011626);
                        if (type instanceof AbstractC33208p0.b) {
                            c28655q.m87150e0(2118063489);
                            if ((i15 & 7168) == 2048) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z25) {
                                objM87133R3 = new b(function9, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new b(function9, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, viewState);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(2118235508);
                            c28655q.m87173q(false);
                        }
                        if (i18 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        i19 = i15 & 57344;
                        if (i19 == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z15 | z16;
                        objM87133R = c28655q.m87133R();
                        if (z17) {
                            final int i27 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: bf0.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i27) {
                                        case 0:
                                            return AbstractC3199k.m9232x(viewState, function11);
                                        default:
                                            return AbstractC3199k.m9233y(viewState, function11);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i28 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: bf0.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i28) {
                                        case 0:
                                            return AbstractC3199k.m9232x(viewState, function11);
                                        default:
                                            return AbstractC3199k.m9233y(viewState, function11);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        if (i18 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (i19 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z18 | z19;
                        objM87133R2 = c28655q.m87133R();
                        if (z24) {
                            final int i29 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: bf0.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i29) {
                                        case 0:
                                            return AbstractC3199k.m9232x(viewState, function11);
                                        default:
                                            return AbstractC3199k.m9233y(viewState, function11);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i210 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: bf0.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i210) {
                                        case 0:
                                            return AbstractC3199k.m9232x(viewState, function11);
                                        default:
                                            return AbstractC3199k.m9233y(viewState, function11);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function0.m105274p(modalState, interfaceC4339a2, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                }
                function6 = function11;
                function5 = function9;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) viewState, (Object) dateAndTimeProvider, z4, (Object) function5, (InterfaceC23459e) function6, i13, i14, 1);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 16384;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C2783a(8);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C2783a(9);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                i18 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_test_upload", c28655q, i18 | 48);
                if (viewState instanceof AbstractC40584c.e) {
                    c28655q.m87150e0(2116951302);
                    m9198A((AbstractC40584c.e) viewState, dateAndTimeProvider, z4, function7, function8, c28655q, i15 & 65534, 0);
                    function9 = function7;
                    c28655q.m87173q(false);
                    function11 = function8;
                } else {
                    function9 = function7;
                    function10 = function8;
                    if (viewState instanceof AbstractC40584c.c) {
                        throw AbstractC11895b.m32003v(483930200, c28655q, false);
                    }
                    c28655q.m87150e0(2117331982);
                    cVar = (AbstractC40584c.c) viewState;
                    modalState = cVar.getModalState();
                    type = modalState.getType();
                    if (type instanceof AbstractC33208p0.h) {
                        c28655q.m87150e0(2117497801);
                        if ((i15 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z26) {
                            objM87133R4 = new a(function9, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(function9, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, viewState);
                        primaryClickEvent = cVar.getPrimaryClickEvent();
                        if (primaryClickEvent == null) {
                            primaryClickEvent = InterfaceC40582a.a.f174783a;
                        }
                        AbstractC33208p0.h hVar3 = (AbstractC33208p0.h) type;
                        if ((i15 & 57344) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87157i = c28655q.m87157i(primaryClickEvent) | z27;
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R5 = new C17820i(22, function10, primaryClickEvent);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C17820i(22, function10, primaryClickEvent);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function11 = function10;
                        AbstractC33199m0.m105214F(AbstractC33208p0.h.m105313g(hVar3, null, 0L, (InterfaceC4339a) objM87133R5, 3, null), modalState.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        function11 = function10;
                        z14 = false;
                        c28655q.m87150e0(2118011626);
                        if (type instanceof AbstractC33208p0.b) {
                            c28655q.m87150e0(2118063489);
                            if ((i15 & 7168) == 2048) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            if (z25) {
                                objM87133R3 = new b(function9, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new b(function9, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, viewState);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(2118235508);
                            c28655q.m87173q(false);
                        }
                        if (i18 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        i19 = i15 & 57344;
                        if (i19 == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z15 | z16;
                        objM87133R = c28655q.m87133R();
                        if (z17) {
                            final int i211 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: bf0.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211) {
                                        case 0:
                                            return AbstractC3199k.m9232x(viewState, function11);
                                        default:
                                            return AbstractC3199k.m9233y(viewState, function11);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i212 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: bf0.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i212) {
                                        case 0:
                                            return AbstractC3199k.m9232x(viewState, function11);
                                        default:
                                            return AbstractC3199k.m9233y(viewState, function11);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        if (i18 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (i19 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z18 | z19;
                        objM87133R2 = c28655q.m87133R();
                        if (z24) {
                            final int i213 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: bf0.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC3199k.m9232x(viewState, function11);
                                        default:
                                            return AbstractC3199k.m9233y(viewState, function11);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i214 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: bf0.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i214) {
                                        case 0:
                                            return AbstractC3199k.m9232x(viewState, function11);
                                        default:
                                            return AbstractC3199k.m9233y(viewState, function11);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function0.m105274p(modalState, interfaceC4339a3, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                }
                function6 = function11;
                function5 = function9;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) viewState, (Object) dateAndTimeProvider, z4, (Object) function5, (InterfaceC23459e) function6, i13, i14, 1);
            }
        }
        i15 |= 24576;
        function4 = function2;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C2783a(8);
                    c28655q.m87172p0(objM87133R7);
                }
                function7 = (Function1) objM87133R7;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C2783a(9);
                    c28655q.m87172p0(objM87133R6);
                }
                function8 = (Function1) objM87133R6;
            } else {
                function8 = function4;
            }
            i18 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "advanced_labs_test_upload", c28655q, i18 | 48);
            if (viewState instanceof AbstractC40584c.e) {
                c28655q.m87150e0(2116951302);
                m9198A((AbstractC40584c.e) viewState, dateAndTimeProvider, z4, function7, function8, c28655q, i15 & 65534, 0);
                function9 = function7;
                c28655q.m87173q(false);
                function11 = function8;
            } else {
                function9 = function7;
                function10 = function8;
                if (viewState instanceof AbstractC40584c.c) {
                    throw AbstractC11895b.m32003v(483930200, c28655q, false);
                }
                c28655q.m87150e0(2117331982);
                cVar = (AbstractC40584c.c) viewState;
                modalState = cVar.getModalState();
                type = modalState.getType();
                if (type instanceof AbstractC33208p0.h) {
                    c28655q.m87150e0(2117497801);
                    if ((i15 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z26) {
                        objM87133R4 = new a(function9, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(function9, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, viewState);
                    primaryClickEvent = cVar.getPrimaryClickEvent();
                    if (primaryClickEvent == null) {
                        primaryClickEvent = InterfaceC40582a.a.f174783a;
                    }
                    AbstractC33208p0.h hVar4 = (AbstractC33208p0.h) type;
                    if ((i15 & 57344) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i = c28655q.m87157i(primaryClickEvent) | z27;
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R5 = new C17820i(22, function10, primaryClickEvent);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C17820i(22, function10, primaryClickEvent);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function11 = function10;
                    AbstractC33199m0.m105214F(AbstractC33208p0.h.m105313g(hVar4, null, 0L, (InterfaceC4339a) objM87133R5, 3, null), modalState.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    z14 = false;
                } else {
                    function11 = function10;
                    z14 = false;
                    c28655q.m87150e0(2118011626);
                    if (type instanceof AbstractC33208p0.b) {
                        c28655q.m87150e0(2118063489);
                        if ((i15 & 7168) == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z25) {
                            objM87133R3 = new b(function9, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new b(function9, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, viewState);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2118235508);
                        c28655q.m87173q(false);
                    }
                    if (i18 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i19 = i15 & 57344;
                    if (i19 == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objM87133R = c28655q.m87133R();
                    if (z17) {
                        final int i215 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: bf0.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i215) {
                                    case 0:
                                        return AbstractC3199k.m9232x(viewState, function11);
                                    default:
                                        return AbstractC3199k.m9233y(viewState, function11);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i216 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: bf0.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i216) {
                                    case 0:
                                        return AbstractC3199k.m9232x(viewState, function11);
                                    default:
                                        return AbstractC3199k.m9233y(viewState, function11);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    if (i18 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (i19 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z18 | z19;
                    objM87133R2 = c28655q.m87133R();
                    if (z24) {
                        final int i217 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: bf0.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i217) {
                                    case 0:
                                        return AbstractC3199k.m9232x(viewState, function11);
                                    default:
                                        return AbstractC3199k.m9233y(viewState, function11);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i218 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: bf0.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i218) {
                                    case 0:
                                        return AbstractC3199k.m9232x(viewState, function11);
                                    default:
                                        return AbstractC3199k.m9233y(viewState, function11);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function0.m105274p(modalState, interfaceC4339a4, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
            }
            function6 = function11;
            function5 = function9;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g((Object) viewState, (Object) dateAndTimeProvider, z4, (Object) function5, (InterfaceC23459e) function6, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m9229u(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m9230v(InterfaceC40582a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m9231w(Function1 function1, InterfaceC40582a interfaceC40582a) {
        function1.invoke(interfaceC40582a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m9232x(AbstractC40584c abstractC40584c, Function1 function1) {
        InterfaceC40582a primaryClickEvent = ((AbstractC40584c.c) abstractC40584c).getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m9233y(AbstractC40584c abstractC40584c, Function1 function1) {
        InterfaceC40582a secondaryClickEvent = ((AbstractC40584c.c) abstractC40584c).getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m9234z(AbstractC40584c abstractC40584c, InterfaceC41070a interfaceC41070a, boolean z4, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m9228t(abstractC40584c, interfaceC41070a, z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
