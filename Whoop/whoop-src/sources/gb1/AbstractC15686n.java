package gb1;

import androidx.compose.foundation.relocation.AbstractC1108a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.WeakHashMap;
import l83.C23454a0;
import p181h2.C16618c;
import p291l0.C22937b;
import p291l0.C22944c2;
import p291l0.C22949e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p445r0.C30835c;
import p445r0.InterfaceC30833a;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39147y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: gb1.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "d", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Ly2/y;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ly2/y;)Ljava/lang/Integer;", "coordinates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15686n {

    /* JADX INFO: renamed from: gb1.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.modifier.KeyboardModifiersKt$centerAboveKeyboard$1$1", m100430f = "KeyboardModifiers.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC30833a f58878E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f58879F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f58880G;

        /* JADX INFO: renamed from: w */
        Object f58881w;

        /* JADX INFO: renamed from: x */
        int f58882x;

        /* JADX INFO: renamed from: y */
        float f58883y;

        /* JADX INFO: renamed from: z */
        int f58884z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30833a interfaceC30833a, InterfaceC28601c1 interfaceC28601c1, int i13, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f58878E = interfaceC30833a;
            this.f58879F = interfaceC28601c1;
            this.f58880G = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f58878E, this.f58879F, this.f58880G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Integer numM44132h;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f58884z;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC39147y interfaceC39147yM44129e = AbstractC15686n.m44129e(this.f58879F);
            if (interfaceC39147yM44129e != null) {
                if (this.f58880G <= 0 || !interfaceC39147yM44129e.mo3532g()) {
                    interfaceC39147yM44129e = null;
                }
                if (interfaceC39147yM44129e != null && (numM44132h = AbstractC15686n.m44132h(interfaceC39147yM44129e)) != null) {
                    int iIntValue = numM44132h.intValue();
                    float fMo3541n = (((int) (interfaceC39147yM44129e.mo3541n() & 4294967295L)) - iIntValue) / 2.0f;
                    InterfaceC30833a interfaceC30833a = this.f58878E;
                    C16618c c16618c = new C16618c(0.0f, fMo3541n, (int) (interfaceC39147yM44129e.mo3541n() >> 32), iIntValue + fMo3541n);
                    this.f58881w = null;
                    this.f58882x = iIntValue;
                    this.f58883y = fMo3541n;
                    this.f58884z = 1;
                    if (((C30835c) interfaceC30833a).m94839b(c16618c, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m44128d(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C30835c();
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC30833a interfaceC30833a = (InterfaceC30833a) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = AbstractC28683x.m87272z(null);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
        WeakHashMap weakHashMap = C22944c2.f90553v;
        C22937b c22937b = C22949e.m66712e(c28655q).f90556c;
        int i14 = c22937b.m66705e().f151452d;
        Integer numValueOf = Integer.valueOf(i14);
        boolean zM87149e = c28655q.m87149e(i14) | c28655q.m87157i(interfaceC30833a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87149e || objM87133R3 == c28676v0) {
            objM87133R3 = new a(interfaceC30833a, interfaceC28601c1, i14, null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, numValueOf);
        Modifier modifierM3443a = AbstractC1108a.m3443a(modifier, interfaceC30833a);
        Object objM87133R4 = c28655q.m87133R();
        if (objM87133R4 == c28676v0) {
            objM87133R4 = new C15685m(interfaceC28601c1, 0);
            c28655q.m87172p0(objM87133R4);
        }
        return AbstractC1132b.m3501a(modifierM3443a, (Function1) objM87133R4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC39147y m44129e(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC39147y) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: f */
    private static final void m44130f(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y interfaceC39147y) {
        interfaceC28601c1.setValue(interfaceC39147y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m44131g(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        m44130f(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Integer m44132h(InterfaceC39147y interfaceC39147y) {
        InterfaceC39147y interfaceC39147yMo3527c = interfaceC39147y.mo3527c();
        while (true) {
            InterfaceC39147y interfaceC39147y2 = interfaceC39147yMo3527c;
            InterfaceC39147y interfaceC39147y3 = interfaceC39147y;
            interfaceC39147y = interfaceC39147y2;
            if (interfaceC39147y == null) {
                return null;
            }
            if (((int) (interfaceC39147y.mo3541n() & 4294967295L)) < ((int) (interfaceC39147y3.mo3541n() & 4294967295L))) {
                return Integer.valueOf((int) (interfaceC39147y.mo3541n() & 4294967295L));
            }
            interfaceC39147yMo3527c = interfaceC39147y.mo3527c();
        }
    }
}
