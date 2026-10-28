package tg2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationButtonModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.startactivity.selectactivity.SelectActivityPickerModel;
import ev2.C13708q;
import i20.C17927a1;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.List;
import kf0.C22432g;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tb0.C33691b;
import v41.AbstractC35662e;
import v41.C35666g;
import v41.EnumC35671i0;
import y71.C39274g;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: tg2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/design/models/modal/AnyModal;", "modal", "", "selectedInternalName", "", "isGpsTrackingEnabled", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "Lkotlin/Function1;", "", "onViewEvent", "k", "(Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/models/items/NavigationBarModel;", "Lv41/g;", "u", "(Lcom/whoop/design/models/items/NavigationBarModel;)Lv41/g;", "Lp1/t1;", "a", "Lp1/t1;", "t", "()Lp1/t1;", "LocalSelectActivityPickerFillsBottomSheet", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33790d {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f141457a = new C28596b0(new C33691b(12));

    /* JADX INFO: renamed from: tg2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerBottomSheetKt$SelectActivityPickerBottomSheet$1$1", m100430f = "SelectActivityPickerBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141458w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f141459x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C23196w3 f141460y;

        /* JADX INFO: renamed from: tg2.d$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerBottomSheetKt$SelectActivityPickerBottomSheet$1$1$1", m100430f = "SelectActivityPickerBottomSheet.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42387a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f141461w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C23196w3 f141462x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42387a(C23196w3 c23196w3, InterfaceC30057d<? super C42387a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f141462x = c23196w3;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42387a(this.f141462x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42387a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f141461w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C23196w3 c23196w3 = this.f141462x;
                    this.f141461w = 1;
                    if (c23196w3.m67155g(this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141459x = interfaceC2994c0;
            this.f141460y = c23196w3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f141459x, this.f141460y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f141458w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(this.f141459x, null, null, new C42387a(this.f141460y, null), 3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerBottomSheetKt$SelectActivityPickerBottomSheet$2$1$1", m100430f = "SelectActivityPickerBottomSheet.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141463w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f141464x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f141465y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141464x = c23196w3;
            this.f141465y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f141464x, this.f141465y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141463w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f141464x;
                this.f141463w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f141465y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerBottomSheetKt$SelectActivityPickerBottomSheet$3$1$1$1$1", m100430f = "SelectActivityPickerBottomSheet.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141466w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f141467x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f141468y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141467x = c23196w3;
            this.f141468y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f141467x, this.f141468y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141466w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f141467x;
                this.f141466w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f141468y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerBottomSheetKt$SelectActivityPickerBottomSheet$3$2$1$1$1", m100430f = "SelectActivityPickerBottomSheet.kt", m100431l = {71}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141469w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f141470x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f141471y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141470x = c23196w3;
            this.f141471y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f141470x, this.f141471y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141469w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f141470x;
                this.f141469w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f141471y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.d$e */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerBottomSheetKt$SelectActivityPickerBottomSheet$3$3$1$1", m100430f = "SelectActivityPickerBottomSheet.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141472w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f141473x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f141474y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141473x = c23196w3;
            this.f141474y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f141473x, this.f141474y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141472w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f141473x;
                this.f141472w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f141474y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final boolean m106863j() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x0101  */
    /* JADX WARN: Code duplicated, block: B:76:0x010f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0190  */
    /* JADX WARN: Code duplicated, block: B:93:0x019a  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ae A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00d6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final void m106864k(final AnyModal modal, final String selectedInternalName, boolean z4, final InterfaceC4339a onDismiss, final Function1 onViewEvent, Composer composer, final int i13, final int i14) {
        boolean z13;
        boolean z14;
        final boolean z15;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        boolean z16;
        Modal modal2;
        BottomSheet bottomSheet;
        ArrayList arrayList;
        SelectActivityPickerModel selectActivityPickerModel;
        SelectActivityPickerModel selectActivityPickerModel2;
        C23196w3 c23196w3M67125g;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC2994c0 interfaceC2994c0;
        boolean zM87157i;
        Object objM87133R2;
        boolean z17;
        boolean z18;
        Object objM87133R3;
        int i15;
        int i16;
        AbstractC22676k.m65750j(modal, "modal");
        AbstractC22676k.m65750j(selectedInternalName, "selectedInternalName");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1496891867);
        int i17 = (i13 & 6) == 0 ? ((i13 & 8) == 0 ? c28655q.m87153g(modal) : c28655q.m87157i(modal) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i17 |= c28655q.m87153g(selectedInternalName) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i17 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onDismiss)) {
                    i16 = 2048;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i17 |= i16;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i15 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i15 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i17 |= i15;
            }
            if ((i17 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i17 & 1, z14)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                modal2 = modal.getModal();
                if (modal2 instanceof BottomSheet) {
                    bottomSheet = (BottomSheet) modal2;
                } else {
                    bottomSheet = null;
                }
                if (bottomSheet == null) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i19 = 0;
                    final boolean z19 = z16;
                    interfaceC4351m = new InterfaceC4351m() { // from class: tg2.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i19) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC33790d.m106865l(modal, selectedInternalName, z19, onDismiss, onViewEvent, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC33790d.m106872s(modal, selectedInternalName, z19, onDismiss, onViewEvent, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    List<DesignSystemModel> items = bottomSheet.getItems();
                    arrayList = new ArrayList();
                    for (Object obj : items) {
                        if (obj instanceof SelectActivityPickerModel) {
                            arrayList.add(obj);
                        }
                    }
                    selectActivityPickerModel = (SelectActivityPickerModel) AbstractC25265s.m74100H0(arrayList);
                    if (selectActivityPickerModel == null) {
                        selectActivityPickerModel2 = new SelectActivityPickerModel("picker", null, false, 6, null);
                    } else {
                        selectActivityPickerModel2 = selectActivityPickerModel;
                    }
                    c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q, 2);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3M67125g);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(interfaceC2994c0, c23196w3M67125g, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3M67125g);
                    if ((i17 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | zM87157i2;
                    objM87133R3 = c28655q.m87133R();
                    if (z18 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C22432g(interfaceC2994c0, c23196w3M67125g, onDismiss, 4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                    AbstractC28683x.m87248b(new C28673u1[]{AbstractC25303l.m74272C().mo86977a(AbstractC33792f.m106889f()), f141457a.mo86977a(Boolean.TRUE)}, AbstractC37817c.m121344e(1786472091, c28655q, new C17927a1(c23196w3M67125g, bottomSheet, interfaceC2994c0, onDismiss, selectActivityPickerModel2, selectedInternalName, z16, onViewEvent)), c28655q, 56);
                    z15 = z16;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q.m87138X();
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i24 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: tg2.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i24) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC33790d.m106865l(modal, selectedInternalName, z15, onDismiss, onViewEvent, i13, i14, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC33790d.m106872s(modal, selectedInternalName, z15, onDismiss, onViewEvent, i13, i14, (Composer) obj2, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i17 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onDismiss)) {
                i16 = 2048;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i17 |= i16;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i15 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i15 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 |= i15;
        }
        if ((i17 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i17 & 1, z14)) {
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            modal2 = modal.getModal();
            if (modal2 instanceof BottomSheet) {
                bottomSheet = (BottomSheet) modal2;
            } else {
                bottomSheet = null;
            }
            if (bottomSheet == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i110 = 0;
                final boolean z110 = z16;
                interfaceC4351m = new InterfaceC4351m() { // from class: tg2.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i110) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC33790d.m106865l(modal, selectedInternalName, z110, onDismiss, onViewEvent, i13, i14, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC33790d.m106872s(modal, selectedInternalName, z110, onDismiss, onViewEvent, i13, i14, (Composer) obj2, iIntValue2);
                        }
                    }
                };
            } else {
                List<DesignSystemModel> items2 = bottomSheet.getItems();
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    if (obj instanceof SelectActivityPickerModel) {
                        arrayList.add(obj);
                    }
                }
                selectActivityPickerModel = (SelectActivityPickerModel) AbstractC25265s.m74100H0(arrayList);
                if (selectActivityPickerModel == null) {
                    selectActivityPickerModel2 = new SelectActivityPickerModel("picker", null, false, 6, null);
                } else {
                    selectActivityPickerModel2 = selectActivityPickerModel;
                }
                c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q, 2);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3M67125g);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(interfaceC2994c0, c23196w3M67125g, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(interfaceC2994c0, c23196w3M67125g, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                boolean zM87157i3 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3M67125g);
                if ((i17 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | zM87157i3;
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C22432g(interfaceC2994c0, c23196w3M67125g, onDismiss, 4);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C22432g(interfaceC2994c0, c23196w3M67125g, onDismiss, 4);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
                AbstractC28683x.m87248b(new C28673u1[]{AbstractC25303l.m74272C().mo86977a(AbstractC33792f.m106889f()), f141457a.mo86977a(Boolean.TRUE)}, AbstractC37817c.m121344e(1786472091, c28655q, new C17927a1(c23196w3M67125g, bottomSheet, interfaceC2994c0, onDismiss, selectActivityPickerModel2, selectedInternalName, z16, onViewEvent)), c28655q, 56);
                z15 = z16;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i25 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: tg2.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i25) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC33790d.m106865l(modal, selectedInternalName, z15, onDismiss, onViewEvent, i13, i14, (Composer) obj2, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj3).intValue();
                            return AbstractC33790d.m106872s(modal, selectedInternalName, z15, onDismiss, onViewEvent, i13, i14, (Composer) obj2, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m106865l(AnyModal anyModal, String str, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m106864k(anyModal, str, z4, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m106866m(InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c23196w3, interfaceC4339a, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m106867n(final C23196w3 c23196w3, final BottomSheet bottomSheet, final InterfaceC2994c0 interfaceC2994c0, final InterfaceC4339a interfaceC4339a, SelectActivityPickerModel selectActivityPickerModel, String str, boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C35666g c35666gM106874u = m106874u(bottomSheet.getNavigationBar());
            boolean zM87157i = c28655q.m87157i(bottomSheet) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: tg2.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return AbstractC33790d.m106868o(bottomSheet, interfaceC2994c0, c23196w3, interfaceC4339a);
                            default:
                                return AbstractC33790d.m106869p(bottomSheet, interfaceC2994c0, c23196w3, interfaceC4339a);
                        }
                    }
                };
                c28655q.m87172p0(interfaceC4339a2);
                objM87133R = interfaceC4339a2;
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(bottomSheet) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a() { // from class: tg2.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC33790d.m106868o(bottomSheet, interfaceC2994c0, c23196w3, interfaceC4339a);
                            default:
                                return AbstractC33790d.m106869p(bottomSheet, interfaceC2994c0, c23196w3, interfaceC4339a);
                        }
                    }
                };
                c28655q.m87172p0(interfaceC4339a4);
                objM87133R2 = interfaceC4339a4;
            }
            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C22432g(interfaceC2994c0, c23196w3, interfaceC4339a, 5);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC35662e.m112943g(null, c23196w3, c35666gM106874u, null, interfaceC4339a3, interfaceC4339a5, (InterfaceC4339a) objM87133R3, null, false, null, null, false, AbstractC37817c.m121344e(1178832897, c28655q, new C13708q(selectActivityPickerModel, str, z4, function1)), c28655q, C35666g.f151591h << 6, 384, 3977);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m106868o(BottomSheet bottomSheet, InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a) {
        NavigationBarModel navigationBar = bottomSheet.getNavigationBar();
        if (navigationBar != null && navigationBar.getLeftButton() != null) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c23196w3, interfaceC4339a, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m106869p(BottomSheet bottomSheet, InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a) {
        NavigationBarModel navigationBar = bottomSheet.getNavigationBar();
        if (navigationBar != null && navigationBar.getRightButton() != null) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c23196w3, interfaceC4339a, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m106870q(InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c23196w3, interfaceC4339a, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m106871r(SelectActivityPickerModel selectActivityPickerModel, String str, boolean z4, Function1 function1, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(BottomSheetM3) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            new C33791e().Compose(AbstractC1102d.m3406c(1.0f, ((C23016z) BottomSheetM3).m66779c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), true, 1.0f)), new C33799m(selectActivityPickerModel.getId(), str, z4), function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m106872s(AnyModal anyModal, String str, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m106864k(anyModal, str, z4, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final AbstractC28669t1 m106873t() {
        return f141457a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX INFO: renamed from: u */
    private static final C35666g m106874u(NavigationBarModel navigationBarModel) {
        TextResource textResourceM21278l;
        if (navigationBarModel == null) {
            return new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
        }
        String title = navigationBarModel.getTitle();
        if (title == null) {
            textResourceM21278l = null;
        } else {
            if (AbstractC39414r.m125890i0(title)) {
                title = null;
            }
            if (title != null) {
                textResourceM21278l = AbstractC8693b.m21278l(title);
            } else {
                textResourceM21278l = null;
            }
        }
        NavigationButtonModel leftButton = navigationBarModel.getLeftButton();
        C39274g c39274g = leftButton != null ? new C39274g(leftButton.getIcon().toWhoopIcon(), null, 2, null) : null;
        NavigationButtonModel rightButton = navigationBarModel.getRightButton();
        return new C35666g(textResourceM21278l, c39274g, rightButton != null ? new C39274g(rightButton.getIcon().toWhoopIcon(), null, 2, null) : null, EnumC35671i0.CENTER, null, 0.0f, 0.0f, 112, null);
    }
}
