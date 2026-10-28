package zl0;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import b03.C2205b;
import b81.C2803j;
import bc3.InterfaceC2994c0;
import c91.InterfaceC4327a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import l11.C23223e;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r31.AbstractC30909d;
import r31.C30908c;
import r31.C30911f;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import x81.C38072d;
import yo1.C39689b;

/* JADX INFO: renamed from: zl0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lr31/f;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lr31/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "message", "Lkotlin/Function0;", "clearFollowup", "j", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;)V", "Lzl0/k;", "wrapperState", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40878j {

    /* JADX INFO: renamed from: zl0.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.selectionwidget.SelectionWidgetWrapperItemKt$SelectionWidgetWrapper$1$1", m100430f = "SelectionWidgetWrapperItem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176172w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f176173x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f176174y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC23864c<C40879k, InterfaceC40874f> f176175z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC28670t2 interfaceC28670t2, AbstractC23864c<C40879k, InterfaceC40874f> abstractC23864c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176173x = function1;
            this.f176174y = interfaceC28670t2;
            this.f176175z = abstractC23864c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m132492h(AbstractC23864c abstractC23864c) {
            abstractC23864c.mo1216g(InterfaceC40874f.a.f176165a);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f176173x, this.f176174y, this.f176175z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f176172w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM132493a = AbstractC40878j.m132486f(this.f176174y).getFollowupMessage();
            Function1 function1 = this.f176173x;
            final AbstractC23864c<C40879k, InterfaceC40874f> abstractC23864c = this.f176175z;
            AbstractC40878j.m132490j(strM132493a, function1, new InterfaceC4339a() { // from class: zl0.i
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return AbstractC40878j.a.m132492h(abstractC23864c);
                }
            });
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m132484d(Modifier modifier, C30911f viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C40879k c40879k;
        Object obj;
        AbstractC23864c abstractC23864c;
        boolean z4;
        boolean z13;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(333905035);
        int i16 = i14 & 1;
        int i17 = 2;
        if (i16 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i18 = i15;
        if (c28655q.m87135U(i18 & 1, (i18 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            InterfaceC25312u interfaceC25312uM95034e = viewState.getButton();
            String str = null;
            boolean z14 = false;
            C23223e c23223e = interfaceC25312uM95034e instanceof C23223e ? (C23223e) interfaceC25312uM95034e : null;
            String strM67199h = c23223e != null ? c23223e.getPath() : null;
            if (strM67199h == null) {
                strM67199h = "";
            }
            C40879k c40879k2 = new C40879k(viewState, str, i17, z14 ? 1 : 0);
            String id4 = viewState.getId();
            boolean zM87153g = ((i18 & 112) == 32 || ((i18 & 64) != 0 && c28655q.m87157i(viewState))) | c28655q.m87153g(strM67199h);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            Object obj2 = objM87133R;
            if (zM87153g || objM87133R == c28676v0) {
                C39689b c39689b = new C39689b(20, viewState, strM67199h);
                c28655q.m87172p0(c39689b);
                obj2 = c39689b;
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj2;
            int i19 = C30911f.f127478h;
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                InterfaceC1583f2 interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                Context applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                boolean z15 = ((((i19 & 7168) ^ 3072) > 2048 && c28655q.m87153g(interfaceC4339a)) || (i19 & 3072) == 2048) | ((((i19 & 112) ^ 48) > 32 && c28655q.m87153g(id4)) || (i19 & 48) == 32) | ((((i19 & 14) ^ 6) > 4 && c28655q.m87153g(c40879k2)) || (i19 & 6) == 4);
                Object objM87133R2 = c28655q.m87133R();
                if (z15 || objM87133R2 == c28676v0) {
                    c40879k = c40879k2;
                    AbstractC23864c abstractC23864cM70119d = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c40879k, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40873e.class), interfaceC4339a, id4);
                    c28655q.m87172p0(abstractC23864cM70119d);
                    obj = abstractC23864cM70119d;
                } else {
                    c40879k = c40879k2;
                    obj = objM87133R2;
                }
                abstractC23864c = (AbstractC23864c) obj;
                z4 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-707976188);
                InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                    Application application2 = (Application) applicationContext2;
                    boolean z16 = ((((i19 & 112) ^ 48) > 32 && c28655q.m87153g(id4)) || (i19 & 48) == 32) | ((((i19 & 14) ^ 6) > 4 && c28655q.m87153g(c40879k2)) || (i19 & 6) == 4) | ((((i19 & 7168) ^ 3072) > 2048 && c28655q.m87153g(interfaceC4339a)) || (i19 & 3072) == 2048);
                    Object objM87133R3 = c28655q.m87133R();
                    Object obj3 = objM87133R3;
                    if (z16 || objM87133R3 == c28676v0) {
                        AbstractC23864c abstractC23864cM70117b = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40873e.class), interfaceC4339a, new C23863b(c40879k2), id4);
                        c28655q.m87172p0(abstractC23864cM70117b);
                        obj3 = abstractC23864cM70117b;
                    }
                    abstractC23864c = (AbstractC23864c) obj3;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    boolean z17 = ((((i19 & 112) ^ 48) > 32 && c28655q.m87153g(id4)) || (i19 & 48) == 32) | ((((i19 & 14) ^ 6) > 4 && c28655q.m87153g(c40879k2)) || (i19 & 6) == 4) | ((((i19 & 7168) ^ 3072) > 2048 && c28655q.m87153g(interfaceC4339a)) || (i19 & 3072) == 2048);
                    Object objM87133R4 = c28655q.m87133R();
                    Object obj4 = objM87133R4;
                    if (z17 || objM87133R4 == c28676v0) {
                        C23863b c23863b = new C23863b(c40879k2);
                        c28655q.m87172p0(c23863b);
                        obj4 = c23863b;
                    }
                    abstractC23864c = (C23863b) obj4;
                    z13 = false;
                    c28655q.m87173q(false);
                } else {
                    z13 = false;
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                c28655q.m87173q(z13);
                c40879k = c40879k2;
                z4 = z13;
            }
            AbstractC23864c abstractC23864c2 = abstractC23864c;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), c40879k, null, c28655q, i19 << 3, 2);
            String strM132493a = m132486f(interfaceC28601c1M87260n).getFollowupMessage();
            int i24 = i18 & 896;
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87260n) | (i24 == 256 ? true : z4) | c28655q.m87157i(abstractC23864c2);
            Object objM87133R5 = c28655q.m87133R();
            Object obj5 = objM87133R5;
            if (zM87153g2 || objM87133R5 == c28676v0) {
                a aVar = new a(onViewEvent, interfaceC28601c1M87260n, abstractC23864c2, null);
                c28655q.m87172p0(aVar);
                obj5 = aVar;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj5, strM132493a);
            C30911f c30911fM132494b = m132486f(interfaceC28601c1M87260n).getWidgetViewState();
            boolean zM87157i = c28655q.m87157i(abstractC23864c2);
            if (i24 == 256) {
                z4 = true;
            }
            boolean z18 = z4 | zM87157i;
            Object objM87133R6 = c28655q.m87133R();
            Object obj6 = objM87133R6;
            if (z18 || objM87133R6 == c28676v0) {
                C2205b c2205b = new C2205b(abstractC23864c2, onViewEvent, 10);
                c28655q.m87172p0(c2205b);
                obj6 = c2205b;
            }
            Function1 function1 = (Function1) obj6;
            int i25 = i19 | ((i18 << 3) & 112);
            modifier2 = modifier3;
            AbstractC30909d.m95027d(c30911fM132494b, modifier2, function1, c28655q, i25, 0);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier4 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30908c(modifier4, viewState, onViewEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C34911a m132485e(C30911f c30911f, String str) {
        return AbstractC15751g.m44431K(c30911f.m95033c(), str, c30911f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C40879k m132486f(InterfaceC28670t2 interfaceC28670t2) {
        return (C40879k) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132487g(AbstractC23864c abstractC23864c, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C2803j) {
            C2803j c2803j = (C2803j) event;
            abstractC23864c.mo1216g(new InterfaceC40874f.c(c2803j.getSelectionId(), c2803j.getSelected()));
        } else if (event instanceof C23223e) {
            abstractC23864c.mo1216g(InterfaceC40874f.b.f176166a);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m132488h(Modifier modifier, C30911f c30911f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m132484d(modifier, c30911f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m132490j(String str, Function1 onViewEvent, InterfaceC4339a clearFollowup) {
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(clearFollowup, "clearFollowup");
        if (str != null) {
            onViewEvent.invoke(new InterfaceC4327a.b(str));
            clearFollowup.invoke();
        }
    }
}
