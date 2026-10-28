package kh0;

import a80.C0542f;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.gestures.AbstractC1098c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import e93.AbstractC12889b;
import h02.C16576i;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p180h0.AbstractC16434o3;
import p180h0.AbstractC16444q3;
import p180h0.InterfaceC16361a4;
import p181h2.C16617b;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23013y;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39180l;
import p702ch0.Function0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kh0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000f²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkd1/o;", "imageSource", "", "contentDescription", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "f", "(Lkd1/o;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "scale", "Lh2/b;", MapboxMap.QFE_OFFSET, "Ly3/l;", "imageSize", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22478e {

    /* JADX INFO: renamed from: kh0.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC2994c0 f88037w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f88038x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC16361a4 f88039y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f88040z;

        /* JADX INFO: renamed from: kh0.e$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.imagewidget.ImagePreviewDialogKt$ImagePreviewDialog$1$3$1$2$1$1$1", m100430f = "ImagePreviewDialog.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41896a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f88041E;

            /* JADX INFO: renamed from: w */
            int f88042w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f88043x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC16361a4 f88044y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f88045z;

            /* JADX INFO: renamed from: kh0.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.imagewidget.ImagePreviewDialogKt$ImagePreviewDialog$1$3$1$2$1$1$1$1", m100430f = "ImagePreviewDialog.kt", m100431l = {95}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41897a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f88046w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ InterfaceC16361a4 f88047x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ InterfaceC28601c1 f88048y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41897a(InterfaceC16361a4 interfaceC16361a4, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C41897a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f88047x = interfaceC16361a4;
                    this.f88048y = interfaceC28601c1;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41897a(this.f88047x, this.f88048y, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41897a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f88046w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC16361a4 interfaceC16361a4 = this.f88047x;
                        float fM64918k = 1.0f / AbstractC22478e.m64918k(this.f88048y);
                        this.f88046w = 1;
                        if (AbstractC16444q3.m46623e(interfaceC16361a4, fM64918k, this) == enumC31071a) {
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
            public C41896a(InterfaceC16361a4 interfaceC16361a4, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super C41896a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f88044y = interfaceC16361a4;
                this.f88045z = interfaceC28601c1;
                this.f88041E = interfaceC28601c2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final C23454a0 m64933h(InterfaceC28601c1 interfaceC28601c1, C11344e c11344e) {
                AbstractC22478e.m64921n(interfaceC28601c1, ((C16617b) c11344e.m30549e()).f63937a);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41896a c41896a = new C41896a(this.f88044y, this.f88045z, this.f88041E, interfaceC30057d);
                c41896a.f88043x = obj;
                return c41896a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41896a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f88043x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f88042w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C41897a(this.f88044y, this.f88045z, null), 3);
                    C11344e c11344e = new C11344e(new C16617b(AbstractC22478e.m64920m(this.f88041E)), AbstractC11348f.f36372n, null, 12);
                    C16617b c16617b = new C16617b(0L);
                    C22477d c22477d = new C22477d(0, this.f88041E);
                    this.f88043x = null;
                    this.f88042w = 1;
                    if (C11344e.m30547d(c11344e, c16617b, null, c22477d, this, 6) == enumC31071a) {
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

        /* JADX INFO: renamed from: kh0.e$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.imagewidget.ImagePreviewDialogKt$ImagePreviewDialog$1$3$1$2$1$1$2", m100430f = "ImagePreviewDialog.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f88049w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC16361a4 f88050x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC16361a4 interfaceC16361a4, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f88050x = interfaceC16361a4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f88050x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f88049w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC16361a4 interfaceC16361a4 = this.f88050x;
                    this.f88049w = 1;
                    if (AbstractC16444q3.m46623e(interfaceC16361a4, 3.0f, this) == enumC31071a) {
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

        public a(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC16361a4 interfaceC16361a4, InterfaceC28601c1 interfaceC28601c2) {
            this.f88037w = interfaceC2994c0;
            this.f88038x = interfaceC28601c1;
            this.f88039y = interfaceC16361a4;
            this.f88040z = interfaceC28601c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final C23454a0 m64930c(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC16361a4 interfaceC16361a4, InterfaceC28601c1 interfaceC28601c2, C16617b c16617b) {
            if (AbstractC22478e.m64918k(interfaceC28601c1) > 1.0f) {
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C41896a(interfaceC16361a4, interfaceC28601c1, interfaceC28601c2, null), 3);
            } else {
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(interfaceC16361a4, null), 3);
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final C23454a0 m64931d(C16617b c16617b) {
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final InterfaceC2994c0 interfaceC2994c0 = this.f88037w;
            final InterfaceC28601c1 interfaceC28601c1 = this.f88038x;
            final InterfaceC16361a4 interfaceC16361a4 = this.f88039y;
            final InterfaceC28601c1 interfaceC28601c2 = this.f88040z;
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, new Function1() { // from class: kh0.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC22478e.a.m64930c(interfaceC2994c0, interfaceC28601c1, interfaceC16361a4, interfaceC28601c2, (C16617b) obj);
                }
            }, null, null, new C22476c(), interfaceC30057d, 6);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m64913f(AbstractC22403o imageSource, String str, InterfaceC4339a onDismiss, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(imageSource, "imageSource");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1686223165);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(imageSource) : c28655q.m87157i(imageSource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onDismiss) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Function0.m14387c(onDismiss, AbstractC37817c.m121344e(1871411498, c28655q, new C0542f(imageSource, onDismiss, str, 23)), c28655q, ((i14 >> 6) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(imageSource, str, onDismiss, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0189  */
    /* JADX WARN: Code duplicated, block: B:55:0x018d  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ea  */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m64914g(AbstractC22403o abstractC22403o, final InterfaceC4339a interfaceC4339a, String str, InterfaceC23013y FullScreenPreviewDialog, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        Object objM87133R;
        boolean zM87157i;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC28601c1 interfaceC28601c3;
        AbstractC22676k.m65750j(FullScreenPreviewDialog, "$this$FullScreenPreviewDialog");
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 17) != 16);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a, 3);
        long jMo3491h = abstractC26165aM64500i.getF4822H();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3491h >> 32)) / Float.intBitsToFloat((int) (jMo3491h & 4294967295L));
        Float fValueOf = Float.valueOf(fIntBitsToFloat);
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE || fIntBitsToFloat <= 0.0f) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
        Object objM87133R3 = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R3 == c28676v0) {
            objM87133R3 = AbstractC3855a.m11831o(1.0f, c28655q);
        }
        InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
        Object objM87133R4 = c28655q.m87133R();
        if (objM87133R4 == c28676v0) {
            objM87133R4 = AbstractC28683x.m87272z(new C16617b(0L));
            c28655q.m87172p0(objM87133R4);
        }
        InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R4;
        Object objM87133R5 = c28655q.m87133R();
        if (objM87133R5 == c28676v0) {
            objM87133R5 = AbstractC28683x.m87272z(new C39180l(0L));
            c28655q.m87172p0(objM87133R5);
        }
        InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R5;
        Object objM87133R6 = c28655q.m87133R();
        if (objM87133R6 == c28676v0) {
            objM87133R6 = AbstractC28683x.m87262p(c28655q);
            c28655q.m87172p0(objM87133R6);
        }
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R6;
        Object objM87133R7 = c28655q.m87133R();
        if (objM87133R7 == c28676v0) {
            objM87133R7 = new C0542f(interfaceC28601c4, interfaceC28601c6, interfaceC28601c5, 24);
            c28655q.m87172p0(objM87133R7);
        }
        InterfaceC16361a4 interfaceC16361a4M46633o = AbstractC16444q3.m46633o((Function3) objM87133R7, c28655q);
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
        Object objM87133R8 = c28655q.m87133R();
        if (objM87133R8 == c28676v0) {
            objM87133R8 = AbstractC11266d.m30453g(c28655q);
        }
        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R8;
        boolean zM87153g = c28655q.m87153g(interfaceC4339a);
        Object objM87133R9 = c28655q.m87133R();
        if (zM87153g || objM87133R9 == c28676v0) {
            objM87133R9 = new InterfaceC4339a() { // from class: kh0.a
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return AbstractC22478e.m64916i(interfaceC4339a);
                }
            };
            c28655q.m87172p0(objM87133R9);
        }
        Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3407d, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R9, 28);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
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
        if (!c28655q.f115903S) {
            interfaceC28601c1 = interfaceC28601c4;
            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, fFloatValue);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3384f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C22477d(1, interfaceC28601c6);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3378d = AbstractC1098c.m3378d(AbstractC1136a.m3599a(AbstractC1132b.m3502b(modifierM3407d2, (Function1) objM87133R), "image_preview_dialog_image"), interfaceC16361a4M46633o);
            zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
            objM87133R2 = c28655q.m87133R();
            if (!zM87157i || objM87133R2 == c28676v0) {
                interfaceC28601c2 = interfaceC28601c5;
                interfaceC28601c3 = interfaceC28601c1;
                objM87133R2 = new a(interfaceC2994c0, interfaceC28601c3, interfaceC16361a4M46633o, interfaceC28601c2);
                c28655q.m87172p0(objM87133R2);
            } else {
                interfaceC28601c2 = interfaceC28601c5;
                interfaceC28601c3 = interfaceC28601c1;
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i, str, AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM3378d, c23454a0, (PointerInputEventHandler) objM87133R2), m64918k(interfaceC28601c3), m64918k(interfaceC28601c3), 0.0f, Float.intBitsToFloat((int) (m64920m(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m64920m(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 520164), null, C39102j.f168200b, 0.0f, null, c28655q, 24576, 104);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            return c23454a0;
        }
        interfaceC28601c1 = interfaceC28601c4;
        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        C0209i c0209i5 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
        Modifier modifierM3384f2 = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, fFloatValue);
        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
        iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3384f2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        } else {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
        objM87133R = c28655q.m87133R();
        if (objM87133R == c28676v0) {
            objM87133R = new C22477d(1, interfaceC28601c6);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM3378d2 = AbstractC1098c.m3378d(AbstractC1136a.m3599a(AbstractC1132b.m3502b(modifierM3407d3, (Function1) objM87133R), "image_preview_dialog_image"), interfaceC16361a4M46633o);
        zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC16361a4M46633o);
        objM87133R2 = c28655q.m87133R();
        if (zM87157i) {
            interfaceC28601c2 = interfaceC28601c5;
            interfaceC28601c3 = interfaceC28601c1;
            objM87133R2 = new a(interfaceC2994c0, interfaceC28601c3, interfaceC16361a4M46633o, interfaceC28601c2);
            c28655q.m87172p0(objM87133R2);
        } else {
            interfaceC28601c2 = interfaceC28601c5;
            interfaceC28601c3 = interfaceC28601c1;
            objM87133R2 = new a(interfaceC2994c0, interfaceC28601c3, interfaceC16361a4M46633o, interfaceC28601c2);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC29125c.m88522c(abstractC26165aM64500i, str, AbstractC1127a.m3488c(AbstractC34452c0.m108903b(modifierM3378d2, c23454a0, (PointerInputEventHandler) objM87133R2), m64918k(interfaceC28601c3), m64918k(interfaceC28601c3), 0.0f, Float.intBitsToFloat((int) (m64920m(interfaceC28601c2) >> 32)), Float.intBitsToFloat((int) (m64920m(interfaceC28601c2) & 4294967295L)), 0.0f, null, null, 0, 520164), null, C39102j.f168200b, 0.0f, null, c28655q, 24576, 104);
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m64915h(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, float f13, C16617b c16617b, float f14) {
        float fM36283m = AbstractC12889b.m36283m(m64918k(interfaceC28601c1) * f13, 1.0f, 6.0f);
        float f15 = fM36283m - 1;
        float fM64922o = (((int) (m64922o(interfaceC28601c2) >> 32)) * f15) / 2.0f;
        float fM64922o2 = (((int) (m64922o(interfaceC28601c2) & 4294967295L)) * f15) / 2.0f;
        m64919l(interfaceC28601c1, fM36283m);
        float fM36283m2 = AbstractC12889b.m36283m(Float.intBitsToFloat((int) (c16617b.f63937a >> 32)) + Float.intBitsToFloat((int) (m64920m(interfaceC28601c3) >> 32)), -fM64922o, fM64922o);
        m64921n(interfaceC28601c3, (((long) Float.floatToRawIntBits(AbstractC12889b.m36283m(Float.intBitsToFloat((int) (c16617b.f63937a & 4294967295L)) + Float.intBitsToFloat((int) (m64920m(interfaceC28601c3) & 4294967295L)), -fM64922o2, fM64922o2))) & 4294967295L) | (Float.floatToRawIntBits(fM36283m2) << 32));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m64916i(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m64917j(InterfaceC28601c1 interfaceC28601c1, C39180l c39180l) {
        m64923p(interfaceC28601c1, c39180l.f168422a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final float m64918k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m64919l(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final long m64920m(InterfaceC28601c1 interfaceC28601c1) {
        return ((C16617b) interfaceC28601c1.getValue()).f63937a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m64921n(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C16617b(j7));
    }

    /* JADX INFO: renamed from: o */
    private static final long m64922o(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39180l) interfaceC28601c1.getValue()).f168422a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m64923p(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C39180l(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m64924q(AbstractC22403o abstractC22403o, String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m64913f(abstractC22403o, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
