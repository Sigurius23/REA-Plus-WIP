package sg2;

import am2.C1018g;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gi1.InterfaceC15891a;
import hg2.AbstractC17260a;
import j11.AbstractC21211n;
import j81.C21421e;
import java.io.IOException;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import ld1.C23862a;
import ng2.AbstractC26685d;
import ng2.C26684c;
import ng2.C26687f;
import ng2.InterfaceC26686e;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p179h.C16351i;
import p245j8.AbstractC21412c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C23010x;
import p353o0.C27325i;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p40.C28827b;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg2.AbstractC31392d;
import rg2.AbstractC31402n;
import rg2.C31391c;
import s51.C32205b;
import s51.C32209f;
import s51.C32219p;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc2.C32375n;
import tg2.AbstractC33787a;
import tg2.AbstractC33790d;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sg2.v */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\r\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0000*\u00020\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u001aH\u0082\u0010¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006(²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010'\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lng2/c;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "s", "(Landroidx/compose/ui/Modifier;Lng2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onEnableLocationTapped", "onDismissed", "q", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lrg2/c;", "viewState", "", "onRecentActivityClick", "onSearchClick", "", "onGpsToggleChanged", "H", "(Lrg2/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Q", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Landroid/content/Context;", "context", "P", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "O", "(Landroid/content/Context;)Landroid/app/Activity;", "Ly3/f;", "a", "F", "PreSessionStatusMessageAreaHeight", "b", "PreSessionNavigationBarContentHeight", "showActivityPicker", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32471v {

    /* JADX INFO: renamed from: a */
    private static final float f134462a = 36 * 4;

    /* JADX INFO: renamed from: b */
    private static final float f134463b;

    /* JADX INFO: renamed from: sg2.v$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C23862a f134464w;

        public a(C23862a c23862a) {
            this.f134464w = c23862a;
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21647a invoke() {
            C23862a storeOwner = this.f134464w;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, null);
        }
    }

    /* JADX INFO: renamed from: sg2.v$b */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.view.PreSessionWidgetKt$PreSessionWidget$3$1", m100430f = "PreSessionWidget.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f134465E;

        /* JADX INFO: renamed from: w */
        int f134466w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26687f f134467x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C16351i f134468y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Context f134469z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26687f c26687f, C16351i c16351i, Context context, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134467x = c26687f;
            this.f134468y = c16351i;
            this.f134469z = context;
            this.f134465E = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f134467x, this.f134468y, this.f134469z, this.f134465E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f134466w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC15891a interfaceC15891aM96664e = AbstractC32471v.m101453u(this.f134465E).getGpsPermissionEffect();
            if (interfaceC15891aM96664e instanceof InterfaceC15891a.b) {
                this.f134467x.mo1216g(InterfaceC26686e.d.f106093a);
                this.f134468y.mo4052a("android.permission.ACCESS_FINE_LOCATION", null);
            } else if (interfaceC15891aM96664e instanceof InterfaceC15891a.a) {
                this.f134467x.mo1216g(InterfaceC26686e.c.f106092a);
                AbstractC32471v.m101431P(this.f134469z);
            } else if (interfaceC15891aM96664e != null) {
                throw new NoWhenBranchMatchedException();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sg2.v$c */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.view.PreSessionWidgetKt$PreSessionWidget$4$1", m100430f = "PreSessionWidget.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134470w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26684c f134471x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26687f f134472y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f134473z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C26684c c26684c, C26687f c26687f, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134471x = c26684c;
            this.f134472y = c26687f;
            this.f134473z = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f134471x, this.f134472y, this.f134473z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Boolean boolM79371a;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f134470w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean zM96668i = AbstractC32471v.m101453u(this.f134473z).getIsLoading();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (!zM96668i && (boolM79371a = this.f134471x.getGpsTrackingEnabled()) != null) {
                this.f134472y.mo1216g(new InterfaceC26686e.f(boolM79371a.booleanValue(), this.f134471x.getSelectedInternalName()));
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: sg2.v$d */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.view.PreSessionWidgetKt$PreSessionWidget$5$1", m100430f = "PreSessionWidget.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134474w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26684c f134475x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26687f f134476y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C26684c c26684c, C26687f c26687f, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134475x = c26684c;
            this.f134476y = c26687f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f134475x, this.f134476y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f134474w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM79373c = this.f134475x.getSelectedInternalName();
            if (AbstractC39414r.m125890i0(strM79373c)) {
                strM79373c = null;
            }
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (strM79373c == null) {
                return c23454a0;
            }
            this.f134476y.mo1216g(new InterfaceC26686e.h(strM79373c));
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: sg2.v$e */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.view.PreSessionWidgetKt$PreSessionWidget$6$1", m100430f = "PreSessionWidget.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134477w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f134478x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f134479y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134478x = function1;
            this.f134479y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f134478x, this.f134479y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strM96666g;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f134477w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean zM96668i = AbstractC32471v.m101453u(this.f134479y).getIsLoading();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (!zM96668i && (strM96666g = AbstractC32471v.m101453u(this.f134479y).getResolvedDefaultInternalName()) != null) {
                if (AbstractC39414r.m125890i0(strM96666g)) {
                    strM96666g = null;
                }
                if (strM96666g != null) {
                    this.f134478x.invoke(AbstractC26685d.m79376c(strM96666g, AbstractC31392d.m96669a(AbstractC32471v.m101453u(this.f134479y)), false, 4, null));
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: sg2.v$f */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"sg2/v$f", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f134480a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C26687f f134481b;

        public f(InterfaceC1585g0 interfaceC1585g0, C26687f c26687f) {
            this.f134480a = interfaceC1585g0;
            this.f134481b = c26687f;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f134480a.getLifecycle().mo4988d(this.f134481b);
            this.f134481b.onStop(this.f134480a);
        }
    }

    static {
        float f13 = 8;
        f134463b = f13 * f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m101416A(Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(event);
        if (AbstractC33787a.m106853b(event)) {
            m101454v(interfaceC28601c1, false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m101417B(C26687f c26687f) {
        c26687f.mo1216g(InterfaceC26686e.b.f106091a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m101418C(C26687f c26687f) {
        c26687f.mo1216g(InterfaceC26686e.a.f106090a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m101419D(Modifier modifier, C26684c c26684c, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m101451s(modifier, c26684c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC28620h0 m101420E(InterfaceC1585g0 interfaceC1585g0, C26687f c26687f, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        interfaceC1585g0.getLifecycle().mo4986a(c26687f);
        return new f(interfaceC1585g0, c26687f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m101421F(C26687f c26687f, boolean z4) {
        c26687f.mo1216g(new InterfaceC26686e.e(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final boolean m101422G(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:109:0x0202  */
    /* JADX WARN: Code duplicated, block: B:111:0x0210  */
    /* JADX WARN: Code duplicated, block: B:114:0x0278  */
    /* JADX WARN: Code duplicated, block: B:117:0x0286  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x011f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x0136  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:0x015d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01aa  */
    /* JADX INFO: renamed from: H */
    public static final void m101423H(C31391c viewState, Modifier modifier, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        int i19;
        int i24;
        Function1 function4;
        int i25;
        boolean z4;
        Modifier modifier3;
        Function1 function5;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function7;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        int iHashCode2;
        int iHashCode3;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-200761936);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function3 = function1;
                    if (c28655q2.m87157i(function3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            function4 = function2;
                            if (c28655q2.m87157i(function4)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i26 != 0) {
                                modifier4 = c2314t;
                            } else {
                                modifier4 = modifier2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C32375n(4);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                function7 = (Function1) objM87133R3;
                            } else {
                                function7 = function3;
                            }
                            if (i18 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C32219p(28);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i24 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32375n(5);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function4 = (Function1) objM87133R;
                            }
                            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                            C2307m c2307m = C2299e.f9114w;
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                            Function1 function8 = function4;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3427x);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            C0209i c0209i2 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                            C0209i c0209i3 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            C0209i c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                            AbstractC31402n abstractC31402nM96662b = viewState.getBackgroundState();
                            if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            C1100b c1100b = C1100b.f4583a;
                            int i27 = i15;
                            InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
                            AbstractC32465p.m101389j(abstractC31402nM96662b, z13, c1100b.mo3401b(c2314t), c28655q2, 0, 0);
                            Modifier modifierM101432Q = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                            Modifier modifierM3413j = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode3 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3413j);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                            float f13 = 8;
                            AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f13, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                            c28655q2.m87173q(true);
                            AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f13, c2314t));
                            interfaceC4339a3 = interfaceC4339a4;
                            c28655q = c28655q2;
                            function5 = function7;
                            AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function8, null, c28655q, (i27 >> 3) & 8176, 16);
                            function4 = function8;
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            modifier3 = modifier4;
                        } else {
                            c28655q2.m87138X();
                            modifier3 = modifier2;
                            function5 = function3;
                            interfaceC4339a3 = interfaceC4339a2;
                            c28655q = c28655q2;
                        }
                        function6 = function4;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                        }
                    }
                    i15 |= 24576;
                    function4 = function2;
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32375n(4);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32219p(28);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function4 = (Function1) objM87133R;
                        }
                        Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                        C2307m c2307m2 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                        Function1 function9 = function4;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3427x2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i5 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d3);
                        C0209i c0209i6 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i7 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
                        AbstractC31402n abstractC31402nM96662b2 = viewState.getBackgroundState();
                        if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        C1100b c1100b2 = C1100b.f4583a;
                        int i28 = i15;
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a2;
                        AbstractC32465p.m101389j(abstractC31402nM96662b2, z13, c1100b2.mo3401b(c2314t), c28655q2, 0, 0);
                        Modifier modifierM101432Q2 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m5);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N5);
                        Modifier modifierM3413j2 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3413j2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
                        float f14 = 8;
                        AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b2.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f14, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                        c28655q2.m87173q(true);
                        AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f14, c2314t));
                        interfaceC4339a3 = interfaceC4339a5;
                        c28655q = c28655q2;
                        function5 = function7;
                        AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function9, null, c28655q, (i28 >> 3) & 8176, 16);
                        function4 = function9;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        modifier3 = modifier4;
                    } else {
                        c28655q2.m87138X();
                        modifier3 = modifier2;
                        function5 = function3;
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q = c28655q2;
                    }
                    function6 = function4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                    }
                }
                i15 |= 3072;
                interfaceC4339a2 = interfaceC4339a;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function4 = function2;
                        if (c28655q2.m87157i(function4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32375n(4);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32219p(28);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function4 = (Function1) objM87133R;
                        }
                        Modifier modifierM3427x3 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                        C2307m c2307m3 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, false);
                        Function1 function10 = function4;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3427x3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i8 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC39127r0M66763d5);
                        C0209i c0209i9 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m7);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i10 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N7);
                        AbstractC31402n abstractC31402nM96662b3 = viewState.getBackgroundState();
                        if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        C1100b c1100b3 = C1100b.f4583a;
                        int i29 = i15;
                        InterfaceC4339a interfaceC4339a6 = interfaceC4339a2;
                        AbstractC32465p.m101389j(abstractC31402nM96662b3, z13, c1100b3.mo3401b(c2314t), c28655q2, 0, 0);
                        Modifier modifierM101432Q3 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q3);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m8);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N8);
                        Modifier modifierM3413j3 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3413j3);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m9);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N9);
                        float f15 = 8;
                        AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b3.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f15, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                        c28655q2.m87173q(true);
                        AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f15, c2314t));
                        interfaceC4339a3 = interfaceC4339a6;
                        c28655q = c28655q2;
                        function5 = function7;
                        AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function10, null, c28655q, (i29 >> 3) & 8176, 16);
                        function4 = function10;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        modifier3 = modifier4;
                    } else {
                        c28655q2.m87138X();
                        modifier3 = modifier2;
                        function5 = function3;
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q = c28655q2;
                    }
                    function6 = function4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                    }
                }
                i15 |= 24576;
                function4 = function2;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32375n(4);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32219p(28);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    }
                    Modifier modifierM3427x4 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                    C2307m c2307m4 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m4, false);
                    Function1 function11 = function4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3427x4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i11 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC39127r0M66763d7);
                    C0209i c0209i12 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i13 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N10);
                    AbstractC31402n abstractC31402nM96662b4 = viewState.getBackgroundState();
                    if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    C1100b c1100b4 = C1100b.f4583a;
                    int i210 = i15;
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a2;
                    AbstractC32465p.m101389j(abstractC31402nM96662b4, z13, c1100b4.mo3401b(c2314t), c28655q2, 0, 0);
                    Modifier modifierM101432Q4 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m11);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N11);
                    Modifier modifierM3413j4 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m4, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3413j4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m12);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N12);
                    float f16 = 8;
                    AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b4.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f16, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                    c28655q2.m87173q(true);
                    AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f16, c2314t));
                    interfaceC4339a3 = interfaceC4339a7;
                    c28655q = c28655q2;
                    function5 = function7;
                    AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function11, null, c28655q, (i210 >> 3) & 8176, 16);
                    function4 = function11;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                } else {
                    c28655q2.m87138X();
                    modifier3 = modifier2;
                    function5 = function3;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q2;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                }
            }
            i15 |= 384;
            function3 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function4 = function2;
                        if (c28655q2.m87157i(function4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32375n(4);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32219p(28);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function4 = (Function1) objM87133R;
                        }
                        Modifier modifierM3427x5 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                        C2307m c2307m5 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m5, false);
                        Function1 function12 = function4;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3427x5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i14 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC39127r0M66763d9);
                        C0209i c0209i15 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m13);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i16 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N13);
                        AbstractC31402n abstractC31402nM96662b5 = viewState.getBackgroundState();
                        if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        C1100b c1100b5 = C1100b.f4583a;
                        int i211 = i15;
                        InterfaceC4339a interfaceC4339a8 = interfaceC4339a2;
                        AbstractC32465p.m101389j(abstractC31402nM96662b5, z13, c1100b5.mo3401b(c2314t), c28655q2, 0, 0);
                        Modifier modifierM101432Q5 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m14);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N14);
                        Modifier modifierM3413j5 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m5, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3413j5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC39127r0M66763d10);
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m15);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N15);
                        float f17 = 8;
                        AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b5.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f17, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                        c28655q2.m87173q(true);
                        AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f17, c2314t));
                        interfaceC4339a3 = interfaceC4339a8;
                        c28655q = c28655q2;
                        function5 = function7;
                        AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function12, null, c28655q, (i211 >> 3) & 8176, 16);
                        function4 = function12;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        modifier3 = modifier4;
                    } else {
                        c28655q2.m87138X();
                        modifier3 = modifier2;
                        function5 = function3;
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q = c28655q2;
                    }
                    function6 = function4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                    }
                }
                i15 |= 24576;
                function4 = function2;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32375n(4);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32219p(28);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    }
                    Modifier modifierM3427x6 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                    C2307m c2307m6 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m6, false);
                    Function1 function13 = function4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3427x6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i17 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i17, interfaceC39127r0M66763d11);
                    C0209i c0209i18 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC28653p1M87165m16);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i19 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i19, modifierM118962N16);
                    AbstractC31402n abstractC31402nM96662b6 = viewState.getBackgroundState();
                    if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    C1100b c1100b6 = C1100b.f4583a;
                    int i212 = i15;
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a2;
                    AbstractC32465p.m101389j(abstractC31402nM96662b6, z13, c1100b6.mo3401b(c2314t), c28655q2, 0, 0);
                    Modifier modifierM101432Q6 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q6);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i17, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC28653p1M87165m17);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i19, modifierM118962N17);
                    Modifier modifierM3413j6 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m6, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3413j6);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i17, interfaceC39127r0M66763d12);
                    AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC28653p1M87165m18);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i19, modifierM118962N18);
                    float f18 = 8;
                    AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b6.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f18, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                    c28655q2.m87173q(true);
                    AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f18, c2314t));
                    interfaceC4339a3 = interfaceC4339a9;
                    c28655q = c28655q2;
                    function5 = function7;
                    AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function13, null, c28655q, (i212 >> 3) & 8176, 16);
                    function4 = function13;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                } else {
                    c28655q2.m87138X();
                    modifier3 = modifier2;
                    function5 = function3;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q2;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32375n(4);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32219p(28);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    }
                    Modifier modifierM3427x7 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                    C2307m c2307m7 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m7, false);
                    Function1 function14 = function4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM3427x7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i110, interfaceC39127r0M66763d13);
                    C0209i c0209i111 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC28653p1M87165m19);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i112, modifierM118962N19);
                    AbstractC31402n abstractC31402nM96662b7 = viewState.getBackgroundState();
                    if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    C1100b c1100b7 = C1100b.f4583a;
                    int i213 = i15;
                    InterfaceC4339a interfaceC4339a10 = interfaceC4339a2;
                    AbstractC32465p.m101389j(abstractC31402nM96662b7, z13, c1100b7.mo3401b(c2314t), c28655q2, 0, 0);
                    Modifier modifierM101432Q7 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i110, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC28653p1M87165m110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i112, modifierM118962N110);
                    Modifier modifierM3413j7 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m7, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM3413j7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i110, interfaceC39127r0M66763d14);
                    AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC28653p1M87165m111);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i112, modifierM118962N111);
                    float f19 = 8;
                    AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b7.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f19, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                    c28655q2.m87173q(true);
                    AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f19, c2314t));
                    interfaceC4339a3 = interfaceC4339a10;
                    c28655q = c28655q2;
                    function5 = function7;
                    AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function14, null, c28655q, (i213 >> 3) & 8176, 16);
                    function4 = function14;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                } else {
                    c28655q2.m87138X();
                    modifier3 = modifier2;
                    function5 = function3;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q2;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32375n(4);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32219p(28);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32375n(5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                }
                Modifier modifierM3427x8 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                C2307m c2307m8 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m8, false);
                Function1 function15 = function4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM3427x8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i113 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC39127r0M66763d15);
                C0209i c0209i114 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC28653p1M87165m112);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i115 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N112);
                AbstractC31402n abstractC31402nM96662b8 = viewState.getBackgroundState();
                if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C1100b c1100b8 = C1100b.f4583a;
                int i214 = i15;
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a2;
                AbstractC32465p.m101389j(abstractC31402nM96662b8, z13, c1100b8.mo3401b(c2314t), c28655q2, 0, 0);
                Modifier modifierM101432Q8 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i113, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC28653p1M87165m113);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N113);
                Modifier modifierM3413j8 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m8, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM3413j8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC39127r0M66763d16);
                AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC28653p1M87165m114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N114);
                float f110 = 8;
                AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b8.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f110, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                c28655q2.m87173q(true);
                AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f110, c2314t));
                interfaceC4339a3 = interfaceC4339a11;
                c28655q = c28655q2;
                function5 = function7;
                AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function15, null, c28655q, (i214 >> 3) & 8176, 16);
                function4 = function15;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                function5 = function3;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q2;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                if (c28655q2.m87157i(function3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function4 = function2;
                        if (c28655q2.m87157i(function4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C32375n(4);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32219p(28);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(5);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function4 = (Function1) objM87133R;
                        }
                        Modifier modifierM3427x9 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                        C2307m c2307m9 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m9, false);
                        Function1 function16 = function4;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifierM3427x9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i116 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i116, interfaceC39127r0M66763d17);
                        C0209i c0209i117 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m115);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N115);
                        AbstractC31402n abstractC31402nM96662b9 = viewState.getBackgroundState();
                        if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        C1100b c1100b9 = C1100b.f4583a;
                        int i215 = i15;
                        InterfaceC4339a interfaceC4339a12 = interfaceC4339a2;
                        AbstractC32465p.m101389j(abstractC31402nM96662b9, z13, c1100b9.mo3401b(c2314t), c28655q2, 0, 0);
                        Modifier modifierM101432Q9 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
                        Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m116);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N116);
                        Modifier modifierM3413j9 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m9, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM3413j9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i116, interfaceC39127r0M66763d18);
                        AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m117);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N117);
                        float f111 = 8;
                        AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b9.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f111, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                        c28655q2.m87173q(true);
                        AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f111, c2314t));
                        interfaceC4339a3 = interfaceC4339a12;
                        c28655q = c28655q2;
                        function5 = function7;
                        AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function16, null, c28655q, (i215 >> 3) & 8176, 16);
                        function4 = function16;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        modifier3 = modifier4;
                    } else {
                        c28655q2.m87138X();
                        modifier3 = modifier2;
                        function5 = function3;
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q = c28655q2;
                    }
                    function6 = function4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                    }
                }
                i15 |= 24576;
                function4 = function2;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32375n(4);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32219p(28);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    }
                    Modifier modifierM3427x10 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                    C2307m c2307m10 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m10, false);
                    Function1 function17 = function4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifierM3427x10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i119 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i119, interfaceC39127r0M66763d19);
                    C0209i c0209i1110 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i1110, interfaceC28653p1M87165m118);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i1111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i1111, modifierM118962N118);
                    AbstractC31402n abstractC31402nM96662b10 = viewState.getBackgroundState();
                    if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    C1100b c1100b10 = C1100b.f4583a;
                    int i216 = i15;
                    InterfaceC4339a interfaceC4339a13 = interfaceC4339a2;
                    AbstractC32465p.m101389j(abstractC31402nM96662b10, z13, c1100b10.mo3401b(c2314t), c28655q2, 0, 0);
                    Modifier modifierM101432Q10 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i119, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q2, c0209i1110, interfaceC28653p1M87165m119);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1111, modifierM118962N119);
                    Modifier modifierM3413j10 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m10, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, modifierM3413j10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i119, interfaceC39127r0M66763d110);
                    AbstractC28683x.m87239G(c28655q2, c0209i1110, interfaceC28653p1M87165m1110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1111, modifierM118962N1110);
                    float f112 = 8;
                    AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b10.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f112, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                    c28655q2.m87173q(true);
                    AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f112, c2314t));
                    interfaceC4339a3 = interfaceC4339a13;
                    c28655q = c28655q2;
                    function5 = function7;
                    AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function17, null, c28655q, (i216 >> 3) & 8176, 16);
                    function4 = function17;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                } else {
                    c28655q2.m87138X();
                    modifier3 = modifier2;
                    function5 = function3;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q2;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32375n(4);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32219p(28);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    }
                    Modifier modifierM3427x11 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                    C2307m c2307m11 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(c2307m11, false);
                    Function1 function18 = function4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifierM3427x11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i1112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i1112, interfaceC39127r0M66763d111);
                    C0209i c0209i1113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i1113, interfaceC28653p1M87165m1111);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i1114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i1114, modifierM118962N1111);
                    AbstractC31402n abstractC31402nM96662b11 = viewState.getBackgroundState();
                    if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    C1100b c1100b11 = C1100b.f4583a;
                    int i217 = i15;
                    InterfaceC4339a interfaceC4339a14 = interfaceC4339a2;
                    AbstractC32465p.m101389j(abstractC31402nM96662b11, z13, c1100b11.mo3401b(c2314t), c28655q2, 0, 0);
                    Modifier modifierM101432Q11 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q2.m87165m();
                    Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q11);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1112, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q2, c0209i1113, interfaceC28653p1M87165m1112);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1114, modifierM118962N1112);
                    Modifier modifierM3413j11 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(c2307m11, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q2.m87165m();
                    Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q2, modifierM3413j11);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1112, interfaceC39127r0M66763d112);
                    AbstractC28683x.m87239G(c28655q2, c0209i1113, interfaceC28653p1M87165m1113);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1114, modifierM118962N1113);
                    float f113 = 8;
                    AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b11.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f113, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                    c28655q2.m87173q(true);
                    AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f113, c2314t));
                    interfaceC4339a3 = interfaceC4339a14;
                    c28655q = c28655q2;
                    function5 = function7;
                    AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function18, null, c28655q, (i217 >> 3) & 8176, 16);
                    function4 = function18;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                } else {
                    c28655q2.m87138X();
                    modifier3 = modifier2;
                    function5 = function3;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q2;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32375n(4);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32219p(28);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32375n(5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                }
                Modifier modifierM3427x12 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                C2307m c2307m12 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(c2307m12, false);
                Function1 function19 = function4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q2.m87165m();
                Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q2, modifierM3427x12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i1115 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC39127r0M66763d113);
                C0209i c0209i1116 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i1116, interfaceC28653p1M87165m1114);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i1117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i1117, modifierM118962N1114);
                AbstractC31402n abstractC31402nM96662b12 = viewState.getBackgroundState();
                if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C1100b c1100b12 = C1100b.f4583a;
                int i218 = i15;
                InterfaceC4339a interfaceC4339a15 = interfaceC4339a2;
                AbstractC32465p.m101389j(abstractC31402nM96662b12, z13, c1100b12.mo3401b(c2314t), c28655q2, 0, 0);
                Modifier modifierM101432Q12 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q2.m87165m();
                Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q12);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1115, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q2, c0209i1116, interfaceC28653p1M87165m1115);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1117, modifierM118962N1115);
                Modifier modifierM3413j12 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(c2307m12, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q2.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q2, modifierM3413j12);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC39127r0M66763d114);
                AbstractC28683x.m87239G(c28655q2, c0209i1116, interfaceC28653p1M87165m1116);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1117, modifierM118962N1116);
                float f114 = 8;
                AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b12.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f114, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                c28655q2.m87173q(true);
                AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f114, c2314t));
                interfaceC4339a3 = interfaceC4339a15;
                c28655q = c28655q2;
                function5 = function7;
                AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function19, null, c28655q, (i218 >> 3) & 8176, 16);
                function4 = function19;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                function5 = function3;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q2;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
            }
        }
        i15 |= 384;
        function3 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32375n(4);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32219p(28);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(5);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    }
                    Modifier modifierM3427x13 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                    C2307m c2307m13 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d115 = AbstractC22989q.m66763d(c2307m13, false);
                    Function1 function110 = function4;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q2.m87165m();
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q2, modifierM3427x13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i1118 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i1118, interfaceC39127r0M66763d115);
                    C0209i c0209i1119 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m1117);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i11110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i11110, modifierM118962N1117);
                    AbstractC31402n abstractC31402nM96662b13 = viewState.getBackgroundState();
                    if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    C1100b c1100b13 = C1100b.f4583a;
                    int i219 = i15;
                    InterfaceC4339a interfaceC4339a16 = interfaceC4339a2;
                    AbstractC32465p.m101389j(abstractC31402nM96662b13, z13, c1100b13.mo3401b(c2314t), c28655q2, 0, 0);
                    Modifier modifierM101432Q13 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q2.m87165m();
                    Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q13);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1118, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m1118);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11110, modifierM118962N1118);
                    Modifier modifierM3413j13 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d116 = AbstractC22989q.m66763d(c2307m13, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q2.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q2, modifierM3413j13);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1118, interfaceC39127r0M66763d116);
                    AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m1119);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11110, modifierM118962N1119);
                    float f115 = 8;
                    AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b13.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f115, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                    c28655q2.m87173q(true);
                    AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f115, c2314t));
                    interfaceC4339a3 = interfaceC4339a16;
                    c28655q = c28655q2;
                    function5 = function7;
                    AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function110, null, c28655q, (i219 >> 3) & 8176, 16);
                    function4 = function110;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                } else {
                    c28655q2.m87138X();
                    modifier3 = modifier2;
                    function5 = function3;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q2;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32375n(4);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32219p(28);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32375n(5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                }
                Modifier modifierM3427x14 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                C2307m c2307m14 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d117 = AbstractC22989q.m66763d(c2307m14, false);
                Function1 function111 = function4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q2.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q2, modifierM3427x14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i11111 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i11111, interfaceC39127r0M66763d117);
                C0209i c0209i11112 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i11112, interfaceC28653p1M87165m11110);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i11113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i11113, modifierM118962N11110);
                AbstractC31402n abstractC31402nM96662b14 = viewState.getBackgroundState();
                if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C1100b c1100b14 = C1100b.f4583a;
                int i2110 = i15;
                InterfaceC4339a interfaceC4339a17 = interfaceC4339a2;
                AbstractC32465p.m101389j(abstractC31402nM96662b14, z13, c1100b14.mo3401b(c2314t), c28655q2, 0, 0);
                Modifier modifierM101432Q14 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q2.m87165m();
                Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q14);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11111, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q2, c0209i11112, interfaceC28653p1M87165m11111);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11113, modifierM118962N11111);
                Modifier modifierM3413j14 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d118 = AbstractC22989q.m66763d(c2307m14, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q2.m87165m();
                Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q2, modifierM3413j14);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11111, interfaceC39127r0M66763d118);
                AbstractC28683x.m87239G(c28655q2, c0209i11112, interfaceC28653p1M87165m11112);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11113, modifierM118962N11112);
                float f116 = 8;
                AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b14.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f116, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                c28655q2.m87173q(true);
                AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f116, c2314t));
                interfaceC4339a3 = interfaceC4339a17;
                c28655q = c28655q2;
                function5 = function7;
                AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function111, null, c28655q, (i2110 >> 3) & 8176, 16);
                function4 = function111;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                function5 = function3;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q2;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32375n(4);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32219p(28);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32375n(5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                }
                Modifier modifierM3427x15 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
                C2307m c2307m15 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d119 = AbstractC22989q.m66763d(c2307m15, false);
                Function1 function112 = function4;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q2.m87165m();
                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q2, modifierM3427x15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i11114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i11114, interfaceC39127r0M66763d119);
                C0209i c0209i11115 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i11115, interfaceC28653p1M87165m11113);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i11116 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i11116, modifierM118962N11113);
                AbstractC31402n abstractC31402nM96662b15 = viewState.getBackgroundState();
                if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C1100b c1100b15 = C1100b.f4583a;
                int i2111 = i15;
                InterfaceC4339a interfaceC4339a18 = interfaceC4339a2;
                AbstractC32465p.m101389j(abstractC31402nM96662b15, z13, c1100b15.mo3401b(c2314t), c28655q2, 0, 0);
                Modifier modifierM101432Q15 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q2.m87165m();
                Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q15);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11114, c23010xM66775a15);
                AbstractC28683x.m87239G(c28655q2, c0209i11115, interfaceC28653p1M87165m11114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11116, modifierM118962N11114);
                Modifier modifierM3413j15 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d1110 = AbstractC22989q.m66763d(c2307m15, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q2.m87165m();
                Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q2, modifierM3413j15);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11114, interfaceC39127r0M66763d1110);
                AbstractC28683x.m87239G(c28655q2, c0209i11115, interfaceC28653p1M87165m11115);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11116, modifierM118962N11115);
                float f117 = 8;
                AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b15.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f117, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
                c28655q2.m87173q(true);
                AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f117, c2314t));
                interfaceC4339a3 = interfaceC4339a18;
                c28655q = c28655q2;
                function5 = function7;
                AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function112, null, c28655q, (i2111 >> 3) & 8176, 16);
                function4 = function112;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
                function5 = function3;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q2;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
            }
        }
        i15 |= 24576;
        function4 = function2;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C32375n(4);
                    c28655q2.m87172p0(objM87133R3);
                }
                function7 = (Function1) objM87133R3;
            } else {
                function7 = function3;
            }
            if (i18 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32219p(28);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            }
            if (i24 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32375n(5);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            }
            Modifier modifierM3427x16 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), C2299e.f9107J, 2);
            C2307m c2307m16 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d1111 = AbstractC22989q.m66763d(c2307m16, false);
            Function1 function113 = function4;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q2.m87165m();
            Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q2, modifierM3427x16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i11117 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i11117, interfaceC39127r0M66763d1111);
            C0209i c0209i11118 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i11118, interfaceC28653p1M87165m11116);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i11119 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i11119, modifierM118962N11116);
            AbstractC31402n abstractC31402nM96662b16 = viewState.getBackgroundState();
            if (AbstractC32473x.m101466g(viewState.getHeartRateState()) != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            C1100b c1100b16 = C1100b.f4583a;
            int i2112 = i15;
            InterfaceC4339a interfaceC4339a19 = interfaceC4339a2;
            AbstractC32465p.m101389j(abstractC31402nM96662b16, z13, c1100b16.mo3401b(c2314t), c28655q2, 0, 0);
            Modifier modifierM101432Q16 = m101432Q(AbstractC1102d.m3409f(1.0f, c2314t), c28655q2, 6);
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q2.m87165m();
            Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q2, modifierM101432Q16);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11117, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q2, c0209i11118, interfaceC28653p1M87165m11117);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11119, modifierM118962N11117);
            Modifier modifierM3413j16 = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f134462a, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d1112 = AbstractC22989q.m66763d(c2307m16, false);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q2.m87165m();
            Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q2, modifierM3413j16);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11117, interfaceC39127r0M66763d1112);
            AbstractC28683x.m87239G(c28655q2, c0209i11118, interfaceC28653p1M87165m11118);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11119, modifierM118962N11118);
            float f118 = 8;
            AbstractC32473x.m101462c(AbstractC32473x.m101466g(viewState.getHeartRateState()), c1100b16.mo3400a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f118, 0.0f, 0.0f, 13), C2299e.f9115x), c28655q2, TextResource.$stable, 0);
            c28655q2.m87173q(true);
            AbstractC32466q.m101411k(viewState.getHeartRateState(), null, c28655q2, 0, 2);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f118, c2314t));
            interfaceC4339a3 = interfaceC4339a19;
            c28655q = c28655q2;
            function5 = function7;
            AbstractC32453d.m101344d(viewState.getActivitySummaryState(), function5, interfaceC4339a3, function113, null, c28655q, (i2112 >> 3) & 8176, 16);
            function4 = function113;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            function5 = function3;
            interfaceC4339a3 = interfaceC4339a2;
            c28655q = c28655q2;
        }
        function6 = function4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(i13, i14, 20, viewState, modifier3, function5, interfaceC4339a3, function6, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m101424I(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m101425J() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m101426K(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m101427L(C31391c c31391c, Modifier modifier, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m101423H(c31391c, modifier, function1, interfaceC4339a, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final Activity m101430O(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            AbstractC22676k.m65749i(context, "getBaseContext(...)");
        }
        return (Activity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final void m101431P(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: Q */
    public static final Modifier m101432Q(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        WeakHashMap weakHashMap = C22944c2.f90553v;
        return AbstractC1099a.m3398t(modifier, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(composer).f90559f, composer).mo43112d() + f134463b, 0.0f, 0.0f, 13);
    }

    /* JADX INFO: renamed from: q */
    public static final void m101449q(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        InterfaceC4339a onEnableLocationTapped = interfaceC4339a;
        InterfaceC4339a onDismissed = interfaceC4339a2;
        AbstractC22676k.m65750j(onEnableLocationTapped, "onEnableLocationTapped");
        AbstractC22676k.m65750j(onDismissed, "onDismissed");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1669266865);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(onEnableLocationTapped) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onDismissed) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC17260a.f66330e);
            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC17260a.f66327b);
            TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC17260a.f66328c);
            TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC17260a.f66329d);
            int i15 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, true, null, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a2, interfaceC4339a2, interfaceC4339a, null, null, null, c28655q, (i15 << 3) | 24576 | (i15 << 6) | (i15 << 9) | (i15 << 27), 384, ((i14 << 3) & 896) | 6 | ((i14 << 6) & 7168) | ((i14 << 12) & 57344), 238022113);
            onDismissed = interfaceC4339a2;
            onEnableLocationTapped = interfaceC4339a;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1018g(onEnableLocationTapped, onDismissed, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m101450r(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m101449q(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0334  */
    /* JADX WARN: Code duplicated, block: B:119:0x0348  */
    /* JADX WARN: Code duplicated, block: B:122:0x035a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0371  */
    /* JADX WARN: Code duplicated, block: B:128:0x0384  */
    /* JADX WARN: Code duplicated, block: B:130:0x0391  */
    /* JADX WARN: Code duplicated, block: B:133:0x039b  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x014e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0230  */
    /* JADX WARN: Code duplicated, block: B:78:0x0232  */
    /* JADX WARN: Code duplicated, block: B:82:0x023c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0259  */
    /* JADX WARN: Code duplicated, block: B:90:0x0277  */
    /* JADX WARN: Code duplicated, block: B:94:0x0294  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b2  */
    /* JADX INFO: renamed from: s */
    public static final void m101451s(Modifier modifier, C26684c itemState, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        C23862a c23862a;
        boolean zM87153g2;
        Object objM87133R2;
        final C26687f c26687f;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        Context context;
        InterfaceC1585g0 interfaceC1585g0;
        boolean zM87157i;
        Object objM87133R3;
        boolean zM87157i2;
        Object objM87133R4;
        C16351i c16351iM118972a0;
        boolean zM87153g3;
        Object objM87133R5;
        boolean zM87153g4;
        Object objM87133R6;
        boolean zM87157i3;
        Object objM87133R7;
        int i16;
        boolean z13;
        boolean z14;
        Object objM87133R8;
        boolean zM87153g5;
        Object objM87133R9;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87157i4;
        Object objM87133R10;
        boolean zM87157i5;
        Object objM87133R11;
        boolean zM87157i6;
        Object objM87133R12;
        boolean zM87157i7;
        Object objM87133R13;
        boolean zM87157i8;
        Object objM87133R14;
        Object objM87133R15;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1092404407);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R15 = c28655q.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C32375n(3);
                        c28655q.m87172p0(objM87133R15);
                    }
                    function4 = (Function1) objM87133R15;
                } else {
                    function4 = function2;
                }
                String id4 = itemState.getId();
                C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
                Context applicationContext = ((Context) c28655q.m87161k(c28674u2)).getApplicationContext();
                AbstractC22676k.m65748h(applicationContext, "null cannot be cast to non-null type android.app.Application");
                application = (Application) applicationContext;
                zM87153g = c28655q.m87153g(id4);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C23862a();
                    c28655q.m87172p0(objM87133R);
                }
                c23862a = (C23862a) objM87133R;
                zM87153g2 = c28655q.m87153g(c23862a);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC34132o.m107857B(application, null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26687f.class), new a(c23862a), null);
                    c28655q.m87172p0(objM87133R2);
                }
                c26687f = (C26687f) ((AbstractC1637w1) objM87133R2);
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(c26687f.getViewState(), new C31391c(false, null, null, null, null, null, false, false, null, null, 1023, null), null, c28655q, 0, 2);
                c28655q = c28655q;
                context = (Context) c28655q.m87161k(c28674u2);
                interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
                zM87157i = c28655q.m87157i(interfaceC1585g0) | c28655q.m87157i(c26687f);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C32469t(0, interfaceC1585g0, c26687f);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87250d(interfaceC1585g0, c26687f, (Function1) objM87133R3, c28655q);
                ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
                zM87157i2 = c28655q.m87157i(c26687f);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    final int i19 = 0;
                    objM87133R4 = new Function1() { // from class: sg2.u
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    return AbstractC32471v.m101421F(c26687f, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC32471v.m101455w(c26687f, (String) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission, (Function1) objM87133R4, c28655q, 0);
                InterfaceC15891a interfaceC15891aM96664e = m101453u(interfaceC28601c1M87260n).getGpsPermissionEffect();
                zM87153g3 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(c26687f) | c28655q.m87157i(c16351iM118972a0) | c28655q.m87157i(context);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g3 || objM87133R5 == c28676v0) {
                    objM87133R5 = new b(c26687f, c16351iM118972a0, context, interfaceC28601c1M87260n, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, interfaceC15891aM96664e);
                Object[] objArr = {itemState.getId(), Boolean.valueOf(m101453u(interfaceC28601c1M87260n).getIsLoading()), itemState.getGpsTrackingEnabled(), itemState.getSelectedInternalName()};
                zM87153g4 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(itemState) | c28655q.m87157i(c26687f);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g4 || objM87133R6 == c28676v0) {
                    objM87133R6 = new c(itemState, c26687f, interfaceC28601c1M87260n, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R6, c28655q);
                String id5 = itemState.getId();
                String strM79373c = itemState.getSelectedInternalName();
                zM87157i3 = c28655q.m87157i(itemState) | c28655q.m87157i(c26687f);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i3 || objM87133R7 == c28676v0) {
                    objM87133R7 = new d(itemState, c26687f, null);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87254h(id5, strM79373c, (InterfaceC4351m) objM87133R7, c28655q);
                Object[] objArr2 = {itemState.getId(), Boolean.valueOf(m101453u(interfaceC28601c1M87260n).getIsLoading()), m101453u(interfaceC28601c1M87260n).getResolvedDefaultInternalName(), Boolean.valueOf(AbstractC31392d.m96669a(m101453u(interfaceC28601c1M87260n)))};
                boolean zM87153g6 = c28655q.m87153g(interfaceC28601c1M87260n);
                i16 = i15 & 896;
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87153g6 | z13;
                objM87133R8 = c28655q.m87133R();
                if (z14 || objM87133R8 == c28676v0) {
                    objM87133R8 = new e(function4, interfaceC28601c1M87260n, null);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87256j(objArr2, (InterfaceC4351m) objM87133R8, c28655q);
                zM87153g5 = c28655q.m87153g(itemState.getId());
                objM87133R9 = c28655q.m87133R();
                if (zM87153g5 || objM87133R9 == c28676v0) {
                    objM87133R9 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R9);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R9;
                C31391c c31391cM101453u = m101453u(interfaceC28601c1M87260n);
                zM87157i4 = c28655q.m87157i(c26687f);
                objM87133R10 = c28655q.m87133R();
                if (zM87157i4 || objM87133R10 == c28676v0) {
                    final int i24 = 1;
                    objM87133R10 = new Function1() { // from class: sg2.u
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i24) {
                                case 0:
                                    return AbstractC32471v.m101421F(c26687f, ((Boolean) obj).booleanValue());
                                default:
                                    return AbstractC32471v.m101455w(c26687f, (String) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R10);
                }
                Function1 function5 = (Function1) objM87133R10;
                zM87157i5 = c28655q.m87157i(itemState) | c28655q.m87153g(interfaceC28601c1);
                objM87133R11 = c28655q.m87133R();
                if (zM87157i5 || objM87133R11 == c28676v0) {
                    objM87133R11 = new C32209f(5, itemState, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R11);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R11;
                zM87157i6 = c28655q.m87157i(context) | c28655q.m87157i(c26687f);
                objM87133R12 = c28655q.m87133R();
                if (zM87157i6 || objM87133R12 == c28676v0) {
                    objM87133R12 = new C32469t(1, context, c26687f);
                    c28655q.m87172p0(objM87133R12);
                }
                Modifier modifier4 = modifier3;
                Function1 function6 = function4;
                m101423H(c31391cM101453u, modifier4, function5, interfaceC4339a, (Function1) objM87133R12, c28655q, (i15 << 3) & 112, 0);
                if (m101422G(interfaceC28601c1) || itemState.getModal() == null) {
                    c28655q.m87150e0(857242795);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(856712323);
                    AnyModal anyModalM106852a = AbstractC33787a.m106852a(itemState.getModal());
                    String strM79373c2 = itemState.getSelectedInternalName();
                    boolean zM96669a = AbstractC31392d.m96669a(m101453u(interfaceC28601c1M87260n));
                    boolean zM87153g7 = c28655q.m87153g(interfaceC28601c1);
                    Object objM87133R16 = c28655q.m87133R();
                    if (zM87153g7 || objM87133R16 == c28676v0) {
                        objM87133R16 = new C27325i(21, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R16);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R16;
                    boolean zM87153g8 = (i16 == 256) | c28655q.m87153g(interfaceC28601c1);
                    Object objM87133R17 = c28655q.m87133R();
                    if (zM87153g8 || objM87133R17 == c28676v0) {
                        objM87133R17 = new C28827b(function6, interfaceC28601c1, 4);
                        c28655q.m87172p0(objM87133R17);
                    }
                    AbstractC33790d.m106864k(anyModalM106852a, strM79373c2, zM96669a, interfaceC4339a2, (Function1) objM87133R17, c28655q, AnyModal.$stable, 0);
                    c28655q.m87173q(false);
                }
                if (m101453u(interfaceC28601c1M87260n).getShowGpsLocationPermissionPrompt()) {
                    c28655q.m87150e0(857307306);
                    zM87157i7 = c28655q.m87157i(c26687f);
                    objM87133R13 = c28655q.m87133R();
                    if (zM87157i7 || objM87133R13 == c28676v0) {
                        final int i25 = 1;
                        objM87133R13 = new InterfaceC4339a() { // from class: sg2.s
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        return AbstractC32471v.m101418C(c26687f);
                                    default:
                                        return AbstractC32471v.m101417B(c26687f);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                    zM87157i8 = c28655q.m87157i(c26687f);
                    objM87133R14 = c28655q.m87133R();
                    if (zM87157i8 || objM87133R14 == c28676v0) {
                        final int i26 = 0;
                        objM87133R14 = new InterfaceC4339a() { // from class: sg2.s
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC32471v.m101418C(c26687f);
                                    default:
                                        return AbstractC32471v.m101417B(c26687f);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R14);
                    }
                    m101449q(interfaceC4339a3, (InterfaceC4339a) objM87133R14, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(857677291);
                    c28655q.m87173q(false);
                }
                function3 = function6;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b(modifier2, itemState, function3, i13, i14, 10);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R15 = c28655q.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C32375n(3);
                    c28655q.m87172p0(objM87133R15);
                }
                function4 = (Function1) objM87133R15;
            } else {
                function4 = function2;
            }
            String id6 = itemState.getId();
            C28674u2 c28674u3 = AndroidCompositionLocals_androidKt.f4976b;
            Context applicationContext2 = ((Context) c28655q.m87161k(c28674u3)).getApplicationContext();
            AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            application = (Application) applicationContext2;
            zM87153g = c28655q.m87153g(id6);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = new C23862a();
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C23862a();
                c28655q.m87172p0(objM87133R);
            }
            c23862a = (C23862a) objM87133R;
            zM87153g2 = c28655q.m87153g(c23862a);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = AbstractC34132o.m107857B(application, null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26687f.class), new a(c23862a), null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = AbstractC34132o.m107857B(application, null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26687f.class), new a(c23862a), null);
                c28655q.m87172p0(objM87133R2);
            }
            c26687f = (C26687f) ((AbstractC1637w1) objM87133R2);
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(c26687f.getViewState(), new C31391c(false, null, null, null, null, null, false, false, null, null, 1023, null), null, c28655q, 0, 2);
            c28655q = c28655q;
            context = (Context) c28655q.m87161k(c28674u3);
            interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
            zM87157i = c28655q.m87157i(interfaceC1585g0) | c28655q.m87157i(c26687f);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R3 = new C32469t(0, interfaceC1585g0, c26687f);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C32469t(0, interfaceC1585g0, c26687f);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87250d(interfaceC1585g0, c26687f, (Function1) objM87133R3, c28655q);
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission2 = new ActivityResultContracts$RequestPermission();
            zM87157i2 = c28655q.m87157i(c26687f);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i2) {
                final int i110 = 0;
                objM87133R4 = new Function1() { // from class: sg2.u
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i110) {
                            case 0:
                                return AbstractC32471v.m101421F(c26687f, ((Boolean) obj).booleanValue());
                            default:
                                return AbstractC32471v.m101455w(c26687f, (String) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            } else {
                final int i111 = 0;
                objM87133R4 = new Function1() { // from class: sg2.u
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i111) {
                            case 0:
                                return AbstractC32471v.m101421F(c26687f, ((Boolean) obj).booleanValue());
                            default:
                                return AbstractC32471v.m101455w(c26687f, (String) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission2, (Function1) objM87133R4, c28655q, 0);
            InterfaceC15891a interfaceC15891aM96664e2 = m101453u(interfaceC28601c1M87260n).getGpsPermissionEffect();
            zM87153g3 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(c26687f) | c28655q.m87157i(c16351iM118972a0) | c28655q.m87157i(context);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g3) {
                objM87133R5 = new b(c26687f, c16351iM118972a0, context, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new b(c26687f, c16351iM118972a0, context, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, interfaceC15891aM96664e2);
            Object[] objArr3 = {itemState.getId(), Boolean.valueOf(m101453u(interfaceC28601c1M87260n).getIsLoading()), itemState.getGpsTrackingEnabled(), itemState.getSelectedInternalName()};
            zM87153g4 = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(itemState) | c28655q.m87157i(c26687f);
            objM87133R6 = c28655q.m87133R();
            if (zM87153g4) {
                objM87133R6 = new c(itemState, c26687f, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new c(itemState, c26687f, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87256j(objArr3, (InterfaceC4351m) objM87133R6, c28655q);
            String id7 = itemState.getId();
            String strM79373c3 = itemState.getSelectedInternalName();
            zM87157i3 = c28655q.m87157i(itemState) | c28655q.m87157i(c26687f);
            objM87133R7 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R7 = new d(itemState, c26687f, null);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new d(itemState, c26687f, null);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87254h(id7, strM79373c3, (InterfaceC4351m) objM87133R7, c28655q);
            Object[] objArr4 = {itemState.getId(), Boolean.valueOf(m101453u(interfaceC28601c1M87260n).getIsLoading()), m101453u(interfaceC28601c1M87260n).getResolvedDefaultInternalName(), Boolean.valueOf(AbstractC31392d.m96669a(m101453u(interfaceC28601c1M87260n)))};
            boolean zM87153g9 = c28655q.m87153g(interfaceC28601c1M87260n);
            i16 = i15 & 896;
            if (i16 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87153g9 | z13;
            objM87133R8 = c28655q.m87133R();
            if (z14) {
                objM87133R8 = new e(function4, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new e(function4, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87256j(objArr4, (InterfaceC4351m) objM87133R8, c28655q);
            zM87153g5 = c28655q.m87153g(itemState.getId());
            objM87133R9 = c28655q.m87133R();
            if (zM87153g5) {
                objM87133R9 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R9);
            } else {
                objM87133R9 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R9);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R9;
            C31391c c31391cM101453u2 = m101453u(interfaceC28601c1M87260n);
            zM87157i4 = c28655q.m87157i(c26687f);
            objM87133R10 = c28655q.m87133R();
            if (zM87157i4) {
                final int i27 = 1;
                objM87133R10 = new Function1() { // from class: sg2.u
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i27) {
                            case 0:
                                return AbstractC32471v.m101421F(c26687f, ((Boolean) obj).booleanValue());
                            default:
                                return AbstractC32471v.m101455w(c26687f, (String) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R10);
            } else {
                final int i28 = 1;
                objM87133R10 = new Function1() { // from class: sg2.u
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i28) {
                            case 0:
                                return AbstractC32471v.m101421F(c26687f, ((Boolean) obj).booleanValue());
                            default:
                                return AbstractC32471v.m101455w(c26687f, (String) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R10);
            }
            Function1 function7 = (Function1) objM87133R10;
            zM87157i5 = c28655q.m87157i(itemState) | c28655q.m87153g(interfaceC28601c1);
            objM87133R11 = c28655q.m87133R();
            if (zM87157i5) {
                objM87133R11 = new C32209f(5, itemState, interfaceC28601c1);
                c28655q.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C32209f(5, itemState, interfaceC28601c1);
                c28655q.m87172p0(objM87133R11);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R11;
            zM87157i6 = c28655q.m87157i(context) | c28655q.m87157i(c26687f);
            objM87133R12 = c28655q.m87133R();
            if (zM87157i6) {
                objM87133R12 = new C32469t(1, context, c26687f);
                c28655q.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new C32469t(1, context, c26687f);
                c28655q.m87172p0(objM87133R12);
            }
            Modifier modifier5 = modifier3;
            Function1 function8 = function4;
            m101423H(c31391cM101453u2, modifier5, function7, interfaceC4339a4, (Function1) objM87133R12, c28655q, (i15 << 3) & 112, 0);
            if (m101422G(interfaceC28601c1)) {
                c28655q.m87150e0(857242795);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(857242795);
                c28655q.m87173q(false);
            }
            if (m101453u(interfaceC28601c1M87260n).getShowGpsLocationPermissionPrompt()) {
                c28655q.m87150e0(857307306);
                zM87157i7 = c28655q.m87157i(c26687f);
                objM87133R13 = c28655q.m87133R();
                if (zM87157i7) {
                    final int i29 = 1;
                    objM87133R13 = new InterfaceC4339a() { // from class: sg2.s
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i29) {
                                case 0:
                                    return AbstractC32471v.m101418C(c26687f);
                                default:
                                    return AbstractC32471v.m101417B(c26687f);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R13);
                } else {
                    final int i210 = 1;
                    objM87133R13 = new InterfaceC4339a() { // from class: sg2.s
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i210) {
                                case 0:
                                    return AbstractC32471v.m101418C(c26687f);
                                default:
                                    return AbstractC32471v.m101417B(c26687f);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R13);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R13;
                zM87157i8 = c28655q.m87157i(c26687f);
                objM87133R14 = c28655q.m87133R();
                if (zM87157i8) {
                    final int i211 = 0;
                    objM87133R14 = new InterfaceC4339a() { // from class: sg2.s
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211) {
                                case 0:
                                    return AbstractC32471v.m101418C(c26687f);
                                default:
                                    return AbstractC32471v.m101417B(c26687f);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R14);
                } else {
                    final int i212 = 0;
                    objM87133R14 = new InterfaceC4339a() { // from class: sg2.s
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i212) {
                                case 0:
                                    return AbstractC32471v.m101418C(c26687f);
                                default:
                                    return AbstractC32471v.m101417B(c26687f);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R14);
                }
                m101449q(interfaceC4339a5, (InterfaceC4339a) objM87133R14, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(857677291);
                c28655q.m87173q(false);
            }
            function3 = function8;
            modifier2 = modifier5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(modifier2, itemState, function3, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m101452t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C31391c m101453u(InterfaceC28670t2 interfaceC28670t2) {
        return (C31391c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m101454v(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m101455w(C26687f c26687f, String selectedActivityInternalName) {
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        c26687f.mo1216g(new InterfaceC26686e.h(selectedActivityInternalName));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m101456x(C26684c c26684c, InterfaceC28601c1 interfaceC28601c1) {
        if (c26684c.getModal() != null) {
            m101454v(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m101457y(Context context, C26687f c26687f, boolean z4) {
        Activity activityM101430O = m101430O(context);
        c26687f.mo1216g(new InterfaceC26686e.g(z4, activityM101430O != null && ActivityCompat.shouldShowRequestPermissionRationale(activityM101430O, "android.permission.ACCESS_FINE_LOCATION")));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m101458z(InterfaceC28601c1 interfaceC28601c1) {
        m101454v(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }
}
