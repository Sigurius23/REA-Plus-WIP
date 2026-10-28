package com.whoop.settings.language;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import ec2.C13011b;
import ec2.C13012c;
import fc2.AbstractC14368b;
import fc2.InterfaceC14369c;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mr1.C25918h;
import nf3.C26669a;
import no0.C26967q;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;
import w20.C36727q;
import xf3.C38266c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/settings/language/LanguagePrefsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/content/Context;", "context", "Ll83/a0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lec2/b;", "viewModel", "Lec2/c;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LanguagePrefsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: com.whoop.settings.language.LanguagePrefsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.language.LanguagePrefsFragment$onCreateView$1$1$1", m100430f = "LanguagePrefsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10121a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30473w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f30474x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10121a(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super C10121a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30474x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10121a(this.f30474x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10121a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f30473w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            LanguagePrefsFragment.m25516D(this.f30474x).m36553n(InterfaceC14369c.b.f52471a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.language.LanguagePrefsFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10122b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f30475w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30476x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30477y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f30478z;

        /* JADX INFO: renamed from: com.whoop.settings.language.LanguagePrefsFragment$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f30479w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f30479w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f30479w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10122b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f30475w = c38266c;
            this.f30476x = interfaceC35951a;
            this.f30477y = interfaceC4339a;
            this.f30478z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ec2.b] */
        @Override // c93.InterfaceC4339a
        public final C13011b invoke() {
            return AbstractC21598x.m60668X(this.f30475w, this.f30476x, new a(this.f30478z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13011b.class), null, this.f30477y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m25515C(LanguagePrefsFragment languagePrefsFragment, Composer composer, int i13) {
        Object obj;
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        c28655q.m87152f0(-1688186518);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c = c26669a.f106046a.f159364d;
        C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
        List list = null;
        boolean z4 = false;
        boolean z13 = false;
        boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            obj = objM87133R;
            InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10122b(c38266c, null, null, c21647aM114690r));
            c28655q.m87172p0(interfaceC23462hM92087G);
            obj = interfaceC23462hM92087G;
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h = (InterfaceC23462h) obj;
        c28655q.m87173q(false);
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m25516D(interfaceC23462h).getViewState(), new C13012c(list, z13 ? 1 : 0, 3, z4 ? 1 : 0), null, c28655q, 0, 2);
        Object objM87133R2 = c28655q.m87133R();
        Object obj2 = objM87133R2;
        if (objM87133R2 == c28676v0) {
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(languagePrefsFragment);
            c28655q.m87172p0(abstractC12939a0M16799z);
            obj2 = abstractC12939a0M16799z;
        }
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) obj2;
        boolean zM87157i = c28655q.m87157i(interfaceC23462h);
        Object objM87133R3 = c28655q.m87133R();
        Object obj3 = objM87133R3;
        if (zM87157i || objM87133R3 == c28676v0) {
            C10121a c10121a = new C10121a(interfaceC23462h, null);
            c28655q.m87172p0(c10121a);
            obj3 = c10121a;
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj3, c23454a0);
        C13012c c13012cM25517E = m25517E(interfaceC28601c1M87260n);
        boolean zM87157i2 = c28655q.m87157i(interfaceC23462h);
        Object objM87133R4 = c28655q.m87133R();
        Object obj4 = objM87133R4;
        if (zM87157i2 || objM87133R4 == c28676v0) {
            C26967q c26967q = new C26967q(interfaceC23462h, 8);
            c28655q.m87172p0(c26967q);
            obj4 = c26967q;
        }
        Function1 function1 = (Function1) obj4;
        boolean zM87157i3 = c28655q.m87157i(abstractC12939a0);
        Object objM87133R5 = c28655q.m87133R();
        Object obj5 = objM87133R5;
        if (zM87157i3 || objM87133R5 == c28676v0) {
            C25918h c25918h = new C25918h(abstractC12939a0, 2);
            c28655q.m87172p0(c25918h);
            obj5 = c25918h;
        }
        AbstractC14368b.m41019g(c13012cM25517E, function1, (InterfaceC4339a) obj5, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C13011b m25516D(InterfaceC23462h interfaceC23462h) {
        return (C13011b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: E */
    private static final C13012c m25517E(InterfaceC28670t2 interfaceC28670t2) {
        return (C13012c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m25518F(InterfaceC23462h interfaceC23462h, InterfaceC14369c it) {
        AbstractC22676k.m65750j(it, "it");
        m25516D(interfaceC23462h).m36553n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m25519G(AbstractC12939a0 abstractC12939a0) {
        abstractC12939a0.m36410z();
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onAttach(Context context) {
        AbstractC22676k.m65750j(context, "context");
        super.onAttach(context);
        AbstractC28163g0.m85250f(this, InterfaceC34116n.INSTANCE.m107848a("LanguagePrefsFragment"));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 9), true, -1185919610));
    }
}
