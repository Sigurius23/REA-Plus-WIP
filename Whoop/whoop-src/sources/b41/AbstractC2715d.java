package b41;

import a11.C0130h;
import a80.C0539c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import dp0.C12253i;
import fy1.C14873i;
import gy0.AbstractC16277f;
import gz0.C16309k0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import l83.C23454a0;
import m83.C25235a0;
import p000.AbstractC11266d;
import p000.C21061j;
import p000.C29656q;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p180h0.AbstractC16434o3;
import p181h2.C16617b;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p292l1.AbstractC23164r1;
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
import p412q3.C29871f0;
import p412q3.C29885s;
import p412q3.InterfaceC29873g0;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.C39336i;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30784c;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: b41.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u000f\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u000f\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u000f\u0010\u0019\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u0014¨\u0006\u001a²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lb41/f;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "itemsState", "Lb41/b;", "internalState", "", "I", "(Lb41/f;Lb41/b;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Lqz0/c;", "J", "(Lb41/f;Lb41/b;Landroidx/compose/runtime/Composer;I)Lqz0/c;", "D", "(Landroidx/compose/runtime/Composer;I)V", "B", "z", "v", "x", "t", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2715d {

    /* JADX INFO: renamed from: b41.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.textinput.TextInputKt$TextInput$1$1", m100430f = "TextInput.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f10690w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2717f f10691x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f10692y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2717f c2717f, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f10691x = c2717f;
            this.f10692y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f10691x, this.f10692y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f10690w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2717f c2717f = this.f10691x;
            Function1 function1 = this.f10692y;
            String strM7662k = c2717f.getText();
            if (strM7662k == null || strM7662k.length() == 0) {
                strM7662k = null;
            }
            if (strM7662k != null) {
                C2718g c2718gM7663l = c2717f.getUpdateTextInput();
                function1.invoke(new DesignItemInteraction(c2718gM7663l != null ? (Action) c2718gM7663l.getOnUpdatedInput().invoke(strM7662k) : null, null));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.textinput.TextInputKt$TextInput$2$1", m100430f = "TextInput.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f10693w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2717f f10694x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f10695y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2717f c2717f, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f10694x = c2717f;
            this.f10695y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f10694x, this.f10695y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Boolean boolValueOf;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f10693w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f10694x.getOverrideTapInteraction() != null && !AbstractC22676k.m65745e(this.f10694x.getText(), AbstractC2715d.m7624m(this.f10695y).getText())) {
                InterfaceC28601c1 interfaceC28601c1 = this.f10695y;
                C2713b c2713bM7624m = AbstractC2715d.m7624m(interfaceC28601c1);
                String strM7662k = this.f10694x.getText();
                Integer numM7658g = this.f10694x.getMaxLength();
                if (numM7658g != null) {
                    C2717f c2717f = this.f10694x;
                    int iIntValue = numM7658g.intValue();
                    String strM7662k2 = c2717f.getText();
                    if (strM7662k2 == null) {
                        strM7662k2 = "";
                    }
                    boolValueOf = Boolean.valueOf(strM7662k2.length() > iIntValue);
                } else {
                    boolValueOf = null;
                }
                AbstractC2715d.m7625n(interfaceC28601c1, C2713b.m7597b(c2713bM7624m, strM7662k, false, boolValueOf, 2, null));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f10696w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ GenericInteraction f10697x;

        public c(Function1 function1, GenericInteraction genericInteraction) {
            this.f10696w = function1;
            this.f10697x = genericInteraction;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m7639b(Function1 function1, GenericInteraction genericInteraction, C16617b c16617b) {
            function1.invoke(genericInteraction);
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final Function1 function1 = this.f10696w;
            final GenericInteraction genericInteraction = this.f10697x;
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new Function1() { // from class: b41.e
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC2715d.c.m7639b(function1, genericInteraction, (C16617b) obj);
                }
            }, interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m7640a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-2070032412);
            C2717f c2717f = new C2717f("EMAIL", null, "address", EnumC16313m0.EMAIL, "@whoop.com", null, 1, 20, false, false, null, null, null, 6144, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = e.f10698w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2715d.m7623l(C2314t.f9131w, c2717f, (Function1) objM87133R, c28655q, (GenericInteraction.$stable << 3) | 390);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m7640a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f10698w = new e();

        /* JADX INFO: renamed from: a */
        public final void m7641a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7641a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m7642a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(574997467);
            C2717f c2717f = new C2717f("EMAIL", "not-an-email", null, EnumC16313m0.EMAIL, "lbs", "Enter a valid email address", 1, null, false, true, "Enter a valid email address", null, null, 6144, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = g.f10699w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2715d.m7623l(C2314t.f9131w, c2717f, (Function1) objM87133R, c28655q, (GenericInteraction.$stable << 3) | 390);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m7642a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f10699w = new g();

        /* JADX INFO: renamed from: a */
        public final void m7643a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7643a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m7644a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(2000576042);
            C2717f c2717f = new C2717f("INPUT", "Exceed Text Limits", null, null, "lbs", "Enter a valid email address", 1, 10, false, true, "Enter a valid email address", null, null, 6144, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = i.f10700w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2715d.m7623l(C2314t.f9131w, c2717f, (Function1) objM87133R, c28655q, (GenericInteraction.$stable << 3) | 390);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m7644a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f10700w = new i();

        /* JADX INFO: renamed from: a */
        public final void m7645a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7645a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m7646a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1879253060);
            C2717f c2717f = new C2717f("PASSWORD", "password", "Placeholder", EnumC16313m0.EMAIL, null, "Error Message", 7, null, true, true, null, null, null, 6144, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = k.f10701w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2715d.m7623l(C2314t.f9131w, c2717f, (Function1) objM87133R, c28655q, (GenericInteraction.$stable << 3) | 390);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m7646a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f10701w = new k();

        /* JADX INFO: renamed from: a */
        public final void m7647a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7647a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m7648a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(1452122336);
            C2717f c2717f = new C2717f("EMAIL", "", "example@whoop.com", EnumC16313m0.EMAIL, null, "Only @whoop.com email allowed", 1, null, false, true, null, null, null, 6144, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = m.f10702w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2715d.m7623l(C2314t.f9131w, c2717f, (Function1) objM87133R, c28655q, (GenericInteraction.$stable << 3) | 390);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m7648a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f10702w = new m();

        /* JADX INFO: renamed from: a */
        public final void m7649a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7649a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m7650a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1683623460);
            C2717f c2717f = new C2717f("WEIGHT", "160", null, null, "lbs", null, 1, null, false, true, null, null, null, 6144, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = o.f10703w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2715d.m7623l(C2314t.f9131w, c2717f, (Function1) objM87133R, c28655q, (GenericInteraction.$stable << 3) | 390);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m7650a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f10703w = new o();

        /* JADX INFO: renamed from: a */
        public final void m7651a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7651a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b41.d$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f10704w = new p();

        /* JADX INFO: renamed from: a */
        public final long m7652a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m7652a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m7602A(int i13, Composer composer, int i14) {
        m7637z(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m7603B(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1920323039);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new l()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m7604C(int i13, Composer composer, int i14) {
        m7603B(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public static final void m7605D(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(766272899);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new n()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m7606E(int i13, Composer composer, int i14) {
        m7605D(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final String m7610I(C2717f c2717f, C2713b c2713b, Composer composer, int i13) {
        Boolean isExceedMaxLength = c2713b.getIsExceedMaxLength();
        if (isExceedMaxLength != null ? isExceedMaxLength.booleanValue() : false) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-2078521685);
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62389v2, c28655q, 0);
            c28655q.m87173q(false);
            return strM21273g;
        }
        String strM7654b = c2717f.getErrorMessage();
        if (strM7654b == null || strM7654b.length() == 0) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1734073374);
            c28655q2.m87173q(false);
            return c2717f.getCaption();
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-2078374404);
        c28655q3.m87173q(false);
        return c2717f.getErrorMessage();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX INFO: renamed from: J */
    private static final AbstractC30784c m7611J(C2717f c2717f, C2713b c2713b, Composer composer, int i13) {
        AbstractC30784c aVar;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1829651554);
        if (c2717f.getIsSecure()) {
            C16309k0 c16309k0M46426p = C38072d.f163053a.m121951d().getVarious();
            int iM46324a0 = c2713b.getIsSecure() ? c16309k0M46426p.getPrivacy2() : c16309k0M46426p.getStealthMode();
            float f13 = 4;
            AbstractC30784c.a aVar2 = new AbstractC30784c.a(iM46324a0, new C39174f(f13 * f13), null, null, 12, null);
            c28655q.m87173q(false);
            return aVar2;
        }
        String strM7654b = c2717f.getErrorMessage();
        if (strM7654b == null || strM7654b.length() == 0) {
            Boolean isExceedMaxLength = c2713b.getIsExceedMaxLength();
            if (isExceedMaxLength != null ? isExceedMaxLength.booleanValue() : false) {
                c28655q.m87150e0(280977447);
                int whoopIcon = EnumC16313m0.TINY_ATTENTION.toWhoopIcon();
                float f14 = 4;
                C39174f c39174f = new C39174f(f14 * f14);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = p.f10704w;
                    c28655q.m87172p0(objM87133R);
                }
                aVar = new AbstractC30784c.a(whoopIcon, c39174f, p745y81.Function1.m125323a((Function1) objM87133R), null, 8, null);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(281197082);
                String strM7661j = c2717f.getSuffix();
                if (strM7661j == null) {
                    c28655q.m87150e0(281197081);
                    c28655q.m87173q(false);
                    aVar = null;
                } else {
                    c28655q.m87150e0(281197082);
                    AbstractC30784c.c cVar = new AbstractC30784c.c(AbstractC8693b.m21278l(strM7661j), C38072d.f163053a.m121952e(c28655q, 6).getB1());
                    c28655q.m87173q(false);
                    aVar = cVar;
                }
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87150e0(280977447);
            int whoopIcon2 = EnumC16313m0.TINY_ATTENTION.toWhoopIcon();
            float f15 = 4;
            C39174f c39174f2 = new C39174f(f15 * f15);
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = p.f10704w;
                c28655q.m87172p0(objM87133R);
            }
            aVar = new AbstractC30784c.a(whoopIcon2, c39174f2, p745y81.Function1.m125323a((Function1) objM87133R), null, 8, null);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:123:0x036f  */
    /* JADX INFO: renamed from: l */
    public static final void m7623l(Modifier modifier, final C2717f c2717f, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C38072d c38072d;
        int i15;
        long jM125370W0;
        C2314t c2314t;
        int i16;
        C38072d c38072d2;
        C37816b c37816b;
        C37816b c37816b2;
        boolean z4;
        final InterfaceC28601c1 interfaceC28601c1;
        Boolean boolValueOf;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1082650139);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(c2717f) : c28655q2.m87157i(c2717f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i17 = i14 & 112;
            int i18 = i14 & 896;
            boolean z13 = (i17 == 32 || ((i14 & 64) != 0 && c28655q2.m87157i(c2717f))) | (i18 == 256);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new a(c2717f, function1, null);
                c28655q2.m87172p0(objM87133R);
            }
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, c23454a0);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                String strM7662k = c2717f.getText();
                boolean zM7665n = c2717f.getIsSecure();
                Integer numM7658g = c2717f.getMaxLength();
                if (numM7658g != null) {
                    int iIntValue = numM7658g.intValue();
                    String strM7662k2 = c2717f.getText();
                    if (strM7662k2 == null) {
                        strM7662k2 = "";
                    }
                    boolValueOf = Boolean.valueOf(strM7662k2.length() > iIntValue);
                } else {
                    boolValueOf = null;
                }
                objM87133R2 = AbstractC28683x.m87272z(new C2713b(strM7662k, zM7665n, boolValueOf));
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            String strM7662k3 = c2717f.getText();
            boolean z14 = i17 == 32 || ((i14 & 64) != 0 && c28655q2.m87157i(c2717f));
            Object objM87133R3 = c28655q2.m87133R();
            if (z14 || objM87133R3 == c28676v0) {
                objM87133R3 = new b(c2717f, interfaceC28601c2, null);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, strM7662k3);
            C15043i8 c15043i8 = C15043i8.f56313a;
            C38072d c38072d3 = C38072d.f163053a;
            int i19 = i14;
            C15197y1 c15197y1M43130h = C15043i8.m43130h(c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, c38072d3.m121949b(c28655q2, 6).getBlack30(), c38072d3.m121949b(c28655q2, 6).getBrandWhite(), c38072d3.m121949b(c28655q2, 6).getBrandWhite(), c38072d3.m121949b(c28655q2, 6).getWhite50(), c38072d3.m121949b(c28655q2, 6).getWhite10(), 0L, c38072d3.m121949b(c28655q2, 6).getAccentAlert(), 0L, 0L, 0L, 0L, c28655q2, 2096770);
            C28655q c28655q3 = c28655q2;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9115x, false);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            Integer numM7658g2 = c2717f.getMaxLength();
            C2314t c2314t2 = C2314t.f9131w;
            if (numM7658g2 == null) {
                c28655q3.m87150e0(-1019607170);
                c28655q3.m87173q(false);
                c2314t = c2314t2;
                c38072d2 = c38072d3;
                i16 = 6;
                c37816b = null;
            } else {
                c28655q3.m87150e0(-1019607169);
                String text = m7624m(interfaceC28601c2).getText();
                String str = (text != null ? text : "").length() + " / " + c2717f.getMaxLength();
                if (c2717f.getIsEnabled()) {
                    c38072d = c38072d3;
                    i15 = 6;
                    jM125370W0 = AbstractC25012a.m73366B(c28655q3, -241421963, c38072d, c28655q3, 6);
                } else {
                    c38072d = c38072d3;
                    i15 = 6;
                    c28655q3.m87150e0(-241420878);
                    jM125370W0 = c38072d.m121949b(c28655q3, 6).getWhite10();
                }
                c28655q3.m87173q(false);
                float f13 = 4;
                float f14 = 2 * f13;
                float f15 = 1 * f13;
                c2314t = c2314t2;
                i16 = i15;
                c38072d2 = c38072d;
                c37816b = null;
                AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(new C22976l1(f15, f14, f15, f14), AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t2), null, 3)), jM125370W0, 0L, null, null, null, 0L, null, new C36775k(i15), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i15).getB4(), null, c28655q3, 0, 0, 196088);
                c28655q3 = c28655q3;
                c28655q3.m87173q(false);
            }
            TextResource textResourceM21278l = AbstractC8693b.m21278l(m7624m(interfaceC28601c2).getText());
            C2886a c2886aM8420a = c38072d2.m121952e(c28655q3, i16).getB1();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c2717f.getLabel());
            C2886a c2886aM8432m = c38072d2.m121952e(c28655q3, i16).getFormLabel();
            EnumC16313m0 enumC16313m0M7655c = c2717f.getIcon();
            int i24 = 10;
            if (enumC16313m0M7655c == null) {
                c28655q3.m87150e0(-1018473438);
                c28655q3.m87173q(false);
                c37816b2 = c37816b;
            } else {
                c28655q3.m87150e0(-1018473437);
                C37816b c37816bM121344e = AbstractC37817c.m121344e(652287927, c28655q3, new C0539c(enumC16313m0M7655c, i24));
                c28655q3.m87173q(false);
                c37816b2 = c37816bM121344e;
            }
            C2713b c2713bM7624m = m7624m(interfaceC28601c2);
            int i25 = GenericInteraction.$stable | ((i19 >> 3) & 14);
            AbstractC30784c abstractC30784cM7611J = m7611J(c2717f, c2713bM7624m, c28655q3, i25);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m7610I(c2717f, m7624m(interfaceC28601c2), c28655q3, i25));
            InterfaceC29873g0 c29885s = m7624m(interfaceC28601c2).getIsSecure() ? new C29885s() : C29871f0.f122092w;
            String strM7654b = c2717f.getErrorMessage();
            if (strM7654b == null || strM7654b.length() == 0) {
                Boolean isExceedMaxLength = m7624m(interfaceC28601c2).getIsExceedMaxLength();
                if (isExceedMaxLength != null ? isExceedMaxLength.booleanValue() : false) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = true;
            }
            boolean zM7664m = c2717f.getIsEnabled();
            int iM7656e = c2717f.getKeyboardType();
            C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * 4);
            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(1375800829, c28655q3, new C0539c(c2717f, 11));
            boolean z15 = i17 == 32 || ((i19 & 64) != 0 && c28655q3.m87157i(c2717f));
            Object objM87133R4 = c28655q3.m87133R();
            if (z15 || objM87133R4 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c2;
                objM87133R4 = new InterfaceC4339a() { // from class: b41.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC2715d.m7628q(c2717f, interfaceC28601c1);
                    }
                };
                c28655q3.m87172p0(objM87133R4);
            } else {
                interfaceC28601c1 = interfaceC28601c2;
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
            boolean z16 = (i17 == 32 || ((i19 & 64) != 0 && c28655q3.m87157i(c2717f))) | (i18 == 256);
            Object objM87133R5 = c28655q3.m87133R();
            if (z16 || objM87133R5 == c28676v0) {
                objM87133R5 = new C29656q((Object) c2717f, function1, (Object) interfaceC28601c1, 10);
                c28655q3.m87172p0(objM87133R5);
            }
            C28655q c28655q4 = c28655q3;
            AbstractC30792k.m94678l(null, textResourceM21278l, c2886aM8420a, textResourceM21278l2, c2886aM8432m, c37816b2, c37816bM121344e2, abstractC30784cM7611J, textResourceM21278l3, z4, false, null, 0L, zM7664m, iM7656e, 0, 0, false, c29885s, false, false, 0, false, null, null, c33252iM105489e, c15197y1M43130h, null, null, null, interfaceC4339a, (Function1) objM87133R5, c28655q4, 1572864, 0, 0, 0, 972790785, 0);
            c28655q = c28655q4;
            GenericInteraction genericInteractionM7659h = c2717f.getOverrideTapInteraction();
            if (genericInteractionM7659h == null) {
                c28655q.m87150e0(-1016754147);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1016754146);
                Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t);
                boolean zM87157i = c28655q.m87157i(genericInteractionM7659h) | (i18 == 256);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87157i || objM87133R6 == c28676v0) {
                    objM87133R6 = new c(function1, genericInteractionM7659h);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC22989q.m66760a(AbstractC34452c0.m108903b(modifierMo3401b, c23454a0, (PointerInputEventHandler) objM87133R6), c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(modifier, c2717f, function1, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C2713b m7624m(InterfaceC28601c1 interfaceC28601c1) {
        return (C2713b) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m7625n(InterfaceC28601c1 interfaceC28601c1, C2713b c2713b) {
        interfaceC28601c1.setValue(c2713b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m7626o(EnumC16313m0 enumC16313m0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC23164r1.m67132a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(6 * 4, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m7627p(C2717f c2717f, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM7660i = c2717f.getPlaceholder();
            if (strM7660i == null) {
                c28655q.m87150e0(-390360845);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-390360844);
                String strM21275i = AbstractC8693b.m21275i(strM7660i, c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21275i, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m7628q(C2717f c2717f, InterfaceC28601c1 interfaceC28601c1) {
        if (c2717f.getIsSecure()) {
            m7625n(interfaceC28601c1, C2713b.m7597b(m7624m(interfaceC28601c1), null, !m7624m(interfaceC28601c1).getIsSecure(), null, 5, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m7629r(C2717f c2717f, Function1 function1, InterfaceC28601c1 interfaceC28601c1, String updatedValue) {
        Boolean boolValueOf;
        AbstractC22676k.m65750j(updatedValue, "updatedValue");
        C2713b c2713bM7624m = m7624m(interfaceC28601c1);
        String text = (c2717f.getMaxLength() == null || updatedValue.length() <= c2717f.getMaxLength().intValue()) ? updatedValue : null;
        if (text == null) {
            text = m7624m(interfaceC28601c1).getText();
        }
        String str = text;
        Integer numM7658g = c2717f.getMaxLength();
        if (numM7658g != null) {
            boolValueOf = Boolean.valueOf(updatedValue.length() > numM7658g.intValue());
        } else {
            boolValueOf = null;
        }
        m7625n(interfaceC28601c1, C2713b.m7597b(c2713bM7624m, str, false, boolValueOf, 2, null));
        C2718g c2718gM7663l = c2717f.getUpdateTextInput();
        function1.invoke(new DesignItemInteraction(c2718gM7663l != null ? (Action) c2718gM7663l.getOnUpdatedInput().invoke(m7624m(interfaceC28601c1).getText()) : null, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m7630s(Modifier modifier, C2717f c2717f, Function1 function1, int i13, Composer composer, int i14) {
        m7623l(modifier, c2717f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final void m7631t(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(609510369);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new d()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m7632u(int i13, Composer composer, int i14) {
        m7631t(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m7633v(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(81318833);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new f()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m7634w(int i13, Composer composer, int i14) {
        m7633v(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m7635x(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1389772815);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new h()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m7636y(int i13, Composer composer, int i14) {
        m7635x(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m7637z(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-724529459);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new j()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 20);
        }
    }
}
