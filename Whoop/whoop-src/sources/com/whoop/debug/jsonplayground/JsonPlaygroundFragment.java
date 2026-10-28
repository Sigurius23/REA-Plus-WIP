package com.whoop.debug.jsonplayground;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q80.C30036h;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r12.C30856a;
import r83.EnumC31071a;
import rq0.C31703x;
import rx0.AbstractC31896a;
import rx0.AbstractC31902g;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018²\u0006\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "La6/g;", "Lf6/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C", "()La6/g;", "dataStore", "x", "a", "", "initialJson", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JsonPlaygroundFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: x */
    private static final C6691a f25568x = new C6691a(null);

    /* JADX INFO: renamed from: y */
    public static final int f25569y = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h dataStore = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C6694d(this, null, null));

    /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundFragment$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$a;", "", "<init>", "()V", "", "RESULT_DEEP_LINK", "Ljava/lang/String;", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6691a {
        public /* synthetic */ C6691a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6691a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.debug.jsonplayground.JsonPlaygroundFragment$onCreateView$1$1$1$1", m100430f = "JsonPlaygroundFragment.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6692b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25571w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f25573y;

        /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundFragment$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.debug.jsonplayground.JsonPlaygroundFragment$onCreateView$1$1$1$1$1", m100430f = "JsonPlaygroundFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f25574w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f25575x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f25576y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f25576y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f25576y, interfaceC30057d);
                aVar.f25575x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f25575x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f25574w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c14129a.m40230g(AbstractC31896a.m99144a(), this.f25576y);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6692b(String str, InterfaceC30057d<? super C6692b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25573y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JsonPlaygroundFragment.this.new C6692b(this.f25573y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6692b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25571w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422gM20058C = JsonPlaygroundFragment.this.m20058C();
                a aVar = new a(this.f25573y, null);
                this.f25571w = 1;
                if (AbstractC17269i.m48861G(interfaceC0422gM20058C, aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC5583n.m16799z(JsonPlaygroundFragment.this).m36402q(Uri.parse("android-app://com.whoop/jsonplaygroundresult"));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundFragment$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6693c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f25577w;

        /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundFragment$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f25578w;

            /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundFragment$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.debug.jsonplayground.JsonPlaygroundFragment$onCreateView$lambda$0$0$$inlined$map$1$2", m100430f = "JsonPlaygroundFragment.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41384a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f25579E;

                /* JADX INFO: renamed from: F */
                Object f25580F;

                /* JADX INFO: renamed from: G */
                Object f25581G;

                /* JADX INFO: renamed from: H */
                int f25582H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f25583w;

                /* JADX INFO: renamed from: x */
                int f25584x;

                /* JADX INFO: renamed from: y */
                Object f25585y;

                public C41384a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f25583w = obj;
                    this.f25584x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f25578w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41384a c41384a;
                if (interfaceC30057d instanceof C41384a) {
                    c41384a = (C41384a) interfaceC30057d;
                    int i13 = c41384a.f25584x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41384a.f25584x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41384a = new C41384a(interfaceC30057d);
                    }
                } else {
                    c41384a = new C41384a(interfaceC30057d);
                }
                Object obj2 = c41384a.f25583w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41384a.f25584x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f25578w;
                    String str = (String) ((AbstractC14134f) obj).mo40227b(AbstractC31896a.m99144a());
                    if (str == null) {
                        str = "";
                    }
                    c41384a.f25585y = null;
                    c41384a.f25579E = null;
                    c41384a.f25580F = null;
                    c41384a.f25581G = null;
                    c41384a.f25582H = 0;
                    c41384a.f25584x = 1;
                    if (interfaceC13062m.emit(str, c41384a) == enumC31071a) {
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

        public C6693c(InterfaceC13058l interfaceC13058l) {
            this.f25577w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f25577w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.jsonplayground.JsonPlaygroundFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6694d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25587w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25588x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25589y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6694d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25587w = componentCallbacks;
            this.f25588x = interfaceC35951a;
            this.f25589y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [a6.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC0422g invoke() {
            ComponentCallbacks componentCallbacks = this.f25587w;
            InterfaceC35951a interfaceC35951a = this.f25588x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25589y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final InterfaceC0422g m20058C() {
        return (InterfaceC0422g) this.dataStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m20059D(JsonPlaygroundFragment jsonPlaygroundFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C6693c c6693c = new C6693c(jsonPlaygroundFragment.m20058C().getData());
                c28655q.m87172p0(c6693c);
                objM87133R = c6693c;
            }
            String strM20060E = m20060E(AbstractC28683x.m87260n((InterfaceC13058l) objM87133R, null, null, c28655q, 48, 2));
            boolean zM87157i = c28655q.m87157i(jsonPlaygroundFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C31703x(jsonPlaygroundFragment, 6);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(jsonPlaygroundFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C30036h(jsonPlaygroundFragment, 20);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC31902g.m99169h(strM20060E, function1, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final String m20060E(InterfaceC28670t2 interfaceC28670t2) {
        return (String) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m20061F(JsonPlaygroundFragment jsonPlaygroundFragment, String json) {
        AbstractC22676k.m65750j(json, "json");
        InterfaceC1585g0 viewLifecycleOwner = jsonPlaygroundFragment.getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, jsonPlaygroundFragment.new C6692b(json, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m20062G(JsonPlaygroundFragment jsonPlaygroundFragment) {
        AbstractC5583n.m16799z(jsonPlaygroundFragment).m36410z();
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 12), true, -1621794795));
    }
}
