package com.whoop.debug.jsonplayground;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q80.C30036h;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r12.C30856a;
import r83.EnumC31071a;
import rx0.AbstractC31896a;
import rx0.AbstractC31900e;
import rx0.C31899d;
import rx0.InterfaceC31898c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b²\u0006\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/debug/jsonplayground/JsonPlaygroundResultFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "La6/g;", "Lf6/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "A", "()La6/g;", "dataStore", "Lrx0/d;", "x", "B", "()Lrx0/d;", "renderer", "", "content", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JsonPlaygroundResultFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h dataStore;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h renderer;

    /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundResultFragment$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6695a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f25592w;

        /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundResultFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f25593w;

            /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundResultFragment$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.debug.jsonplayground.JsonPlaygroundResultFragment$onCreateView$lambda$0$0$$inlined$map$1$2", m100430f = "JsonPlaygroundResultFragment.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41385a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f25594E;

                /* JADX INFO: renamed from: F */
                Object f25595F;

                /* JADX INFO: renamed from: G */
                Object f25596G;

                /* JADX INFO: renamed from: H */
                int f25597H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f25598w;

                /* JADX INFO: renamed from: x */
                int f25599x;

                /* JADX INFO: renamed from: y */
                Object f25600y;

                public C41385a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f25598w = obj;
                    this.f25599x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f25593w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41385a c41385a;
                if (interfaceC30057d instanceof C41385a) {
                    c41385a = (C41385a) interfaceC30057d;
                    int i13 = c41385a.f25599x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41385a.f25599x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41385a = new C41385a(interfaceC30057d);
                    }
                } else {
                    c41385a = new C41385a(interfaceC30057d);
                }
                Object obj2 = c41385a.f25598w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41385a.f25599x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f25593w;
                    String str = (String) ((AbstractC14134f) obj).mo40227b(AbstractC31896a.m99144a());
                    if (str == null) {
                        str = "";
                    }
                    c41385a.f25600y = null;
                    c41385a.f25594E = null;
                    c41385a.f25595F = null;
                    c41385a.f25596G = null;
                    c41385a.f25597H = 0;
                    c41385a.f25599x = 1;
                    if (interfaceC13062m.emit(str, c41385a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public C6695a(InterfaceC13058l interfaceC13058l) {
            this.f25592w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f25592w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundResultFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6696b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25602w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25603x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25604y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6696b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25602w = componentCallbacks;
            this.f25603x = interfaceC35951a;
            this.f25604y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [a6.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC0422g invoke() {
            ComponentCallbacks componentCallbacks = this.f25602w;
            InterfaceC35951a interfaceC35951a = this.f25603x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25604y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundResultFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6697c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25605w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25606x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25607y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6697c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25605w = componentCallbacks;
            this.f25606x = interfaceC35951a;
            this.f25607y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rx0.d] */
        @Override // c93.InterfaceC4339a
        public final C31899d invoke() {
            ComponentCallbacks componentCallbacks = this.f25605w;
            InterfaceC35951a interfaceC35951a = this.f25606x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25607y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31899d.class), interfaceC35951a);
        }
    }

    public JsonPlaygroundResultFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.dataStore = AbstractC30060g.m92087G(enumC23463i, new C6696b(this, null, null));
        this.renderer = AbstractC30060g.m92087G(enumC23463i, new C6697c(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC0422g m20065A() {
        return (InterfaceC0422g) this.dataStore.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C31899d m20066B() {
        return (C31899d) this.renderer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m20067C(JsonPlaygroundResultFragment jsonPlaygroundResultFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C6695a c6695a = new C6695a(jsonPlaygroundResultFragment.m20065A().getData());
                c28655q.m87172p0(c6695a);
                objM87133R = c6695a;
            }
            String strM20068D = m20068D(AbstractC28683x.m87260n((InterfaceC13058l) objM87133R, null, null, c28655q, 48, 2));
            if (strM20068D != null) {
                c28655q.m87150e0(1028154167);
                boolean zM87153g = c28655q.m87153g(strM20068D);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = jsonPlaygroundResultFragment.m20066B().m99152a(strM20068D);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC31898c interfaceC31898c = (InterfaceC31898c) objM87133R2;
                boolean zM87157i = c28655q.m87157i(jsonPlaygroundResultFragment);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C30036h(jsonPlaygroundResultFragment, 21);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC31900e.m99157e(interfaceC31898c, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1028452077);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final String m20068D(InterfaceC28670t2 interfaceC28670t2) {
        return (String) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m20069E(JsonPlaygroundResultFragment jsonPlaygroundResultFragment) {
        AbstractC5583n.m16799z(jsonPlaygroundResultFragment).m36410z();
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 13), true, -858497611));
    }
}
