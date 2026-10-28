package yl0;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c91.InterfaceC4327a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import h31.C16825r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l11.C23223e;
import l21.AbstractC23238b;
import l21.C23237a;
import l21.C23239c;
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
import p579wc.C37082e1;
import p699b70.C2776b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import w71.AbstractC36877d;
import w71.AbstractC36882f0;
import w71.C36906y;
import wr0.C37550r;
import x81.C38072d;

/* JADX INFO: renamed from: yl0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll21/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Ll21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "commitPath", "Lyl0/g;", "q", "(Ll21/c;Ljava/lang/String;)Lyl0/g;", "", "o", "(Ll21/c;)Ljava/lang/Integer;", "Lyl0/a;", "n", "(Ll21/c;)Lyl0/a;", "Lyl0/d;", "p", "(Ll21/c;)Lyl0/d;", "Lyl0/o;", "wrapperState", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39631n {

    /* JADX INFO: renamed from: yl0.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetWrapperItemKt$JournalEntryWidgetWrapper$1$1", m100430f = "JournalEntryWidgetWrapperItem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170502w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23239c f170503x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC23864c<C39632o, InterfaceC39628k> f170504y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C23239c c23239c, AbstractC23864c<C39632o, InterfaceC39628k> abstractC23864c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170503x = c23239c;
            this.f170504y = abstractC23864c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f170503x, this.f170504y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170502w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f170503x.getId().length() > 0) {
                this.f170504y.mo1216g(new InterfaceC39628k.j(this.f170503x.getTitle(), this.f170503x.getId()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yl0.n$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetWrapperItemKt$JournalEntryWidgetWrapper$2$1", m100430f = "JournalEntryWidgetWrapperItem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170505w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23239c f170506x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC23864c<C39632o, InterfaceC39628k> f170507y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f170508z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C23239c c23239c, AbstractC23864c<C39632o, InterfaceC39628k> abstractC23864c, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170506x = c23239c;
            this.f170507y = abstractC23864c;
            this.f170508z = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f170506x, this.f170507y, this.f170508z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170505w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC39631n.m126675h(this.f170508z).getDidCommitSucceed() && this.f170506x.getId().length() > 0) {
                this.f170507y.mo1216g(new InterfaceC39628k.h(this.f170506x.getTitle(), this.f170506x.getId()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yl0.n$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetWrapperItemKt$JournalEntryWidgetWrapper$3$1", m100430f = "JournalEntryWidgetWrapperItem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170509w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f170510x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f170511y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC23864c<C39632o, InterfaceC39628k> f170512z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC28670t2 interfaceC28670t2, Function1 function1, AbstractC23864c<C39632o, InterfaceC39628k> abstractC23864c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170510x = interfaceC28670t2;
            this.f170511y = function1;
            this.f170512z = abstractC23864c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f170510x, this.f170511y, this.f170512z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170509w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM126686b = AbstractC39631n.m126675h(this.f170510x).getFollowupMessage();
            if (strM126686b != null) {
                Function1 function1 = this.f170511y;
                AbstractC23864c<C39632o, InterfaceC39628k> abstractC23864c = this.f170512z;
                function1.invoke(new InterfaceC4327a.b(strM126686b));
                abstractC23864c.mo1216g(InterfaceC39628k.a.f170486a);
            }
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
    /* JADX INFO: renamed from: f */
    public static final void m126673f(Modifier modifier, C23239c viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        AbstractC23864c abstractC23864c;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1196045651);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q2.m87135U(i17 & 1, (i17 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            InterfaceC25312u interfaceC25312uM67282c = viewState.getButton();
            C23223e c23223e = interfaceC25312uM67282c instanceof C23223e ? (C23223e) interfaceC25312uM67282c : null;
            String strM67199h = c23223e != null ? c23223e.getPath() : null;
            if (strM67199h == null) {
                strM67199h = "";
            }
            String str = strM67199h;
            C39632o c39632o = new C39632o(viewState, null, null, false, 14, null);
            String id4 = viewState.getId();
            int i18 = i17 & 112;
            boolean zM87153g = c28655q2.m87153g(str) | (i18 == 32 || ((i17 & 64) != 0 && c28655q2.m87157i(viewState)));
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C37550r(24, str, viewState);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int i19 = C23239c.f92089h;
            c28655q2.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q2, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                InterfaceC1583f2 interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q2, -707312137, false, c28655q2);
                Context applicationContext = ((Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                boolean z13 = ((((i19 & 112) ^ 48) > 32 && c28655q2.m87153g(id4)) || (i19 & 48) == 32) | ((((i19 & 14) ^ 6) > 4 && c28655q2.m87153g(c39632o)) || (i19 & 6) == 4) | ((((i19 & 7168) ^ 3072) > 2048 && c28655q2.m87153g(interfaceC4339a)) || (i19 & 3072) == 2048);
                Object objM87133R2 = c28655q2.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39632o, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39627j.class), interfaceC4339a, id4);
                    c28655q2.m87172p0(objM87133R2);
                }
                abstractC23864c = (AbstractC23864c) objM87133R2;
                z4 = false;
            } else {
                c28655q2.m87150e0(-707976188);
                InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q2);
                if (interfaceC1583f2M73844a == null) {
                    c28655q2.m87150e0(-707931115);
                    c28655q2.m87173q(false);
                    abstractC23864c = null;
                } else {
                    c28655q2.m87150e0(-707931114);
                    Context applicationContext2 = ((Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                    Application application2 = (Application) applicationContext2;
                    boolean z14 = ((((i19 & 112) ^ 48) > 32 && c28655q2.m87153g(id4)) || (i19 & 48) == 32) | ((((i19 & 14) ^ 6) > 4 && c28655q2.m87153g(c39632o)) || (i19 & 6) == 4) | ((((i19 & 7168) ^ 3072) > 2048 && c28655q2.m87153g(interfaceC4339a)) || (i19 & 3072) == 2048);
                    Object objM87133R3 = c28655q2.m87133R();
                    if (z14 || objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39627j.class), interfaceC4339a, new C23863b(c39632o), id4);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q2.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q2.m87150e0(-707430526);
                    boolean z15 = ((((i19 & 112) ^ 48) > 32 && c28655q2.m87153g(id4)) || (i19 & 48) == 32) | ((((i19 & 14) ^ 6) > 4 && c28655q2.m87153g(c39632o)) || (i19 & 6) == 4) | ((((i19 & 7168) ^ 3072) > 2048 && c28655q2.m87153g(interfaceC4339a)) || (i19 & 3072) == 2048);
                    Object objM87133R4 = c28655q2.m87133R();
                    if (z15 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C23863b(c39632o);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    abstractC23864c = (C23863b) objM87133R4;
                    z4 = false;
                    c28655q2.m87173q(false);
                } else {
                    z4 = false;
                    c28655q2.m87150e0(-438479417);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z4);
            }
            c28655q2.m87173q(z4);
            AbstractC23864c abstractC23864c2 = abstractC23864c;
            c28655q = c28655q2;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), c39632o, null, c28655q, i19 << 3, 2);
            String id5 = viewState.getId();
            boolean zM87157i = (i18 == 32 || ((i17 & 64) != 0 && c28655q.m87157i(viewState))) | c28655q.m87157i(abstractC23864c2);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new a(viewState, abstractC23864c2, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, id5);
            Boolean boolValueOf = Boolean.valueOf(m126675h(interfaceC28601c1M87260n).getDidCommitSucceed());
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M87260n) | (i18 == 32 || ((i17 & 64) != 0 && c28655q.m87157i(viewState))) | c28655q.m87157i(abstractC23864c2);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87153g2 || objM87133R6 == c28676v0) {
                objM87133R6 = new b(viewState, abstractC23864c2, interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, boolValueOf);
            String strM126686b = m126675h(interfaceC28601c1M87260n).getFollowupMessage();
            int i24 = i17 & 896;
            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1M87260n) | (i24 == 256) | c28655q.m87157i(abstractC23864c2);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87153g3 || objM87133R7 == c28676v0) {
                objM87133R7 = new c(interfaceC28601c1M87260n, onViewEvent, abstractC23864c2, null);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, strM126686b);
            C23239c c23239cM126688d = m126675h(interfaceC28601c1M87260n).getWidgetViewState();
            boolean zM87157i2 = c28655q.m87157i(abstractC23864c2) | (i18 == 32 || ((i17 & 64) != 0 && c28655q.m87157i(viewState))) | (i24 == 256);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i2 || objM87133R8 == c28676v0) {
                objM87133R8 = new C37082e1(abstractC23864c2, viewState, onViewEvent, 17);
                c28655q.m87172p0(objM87133R8);
            }
            modifier2 = modifier3;
            AbstractC23238b.m67275e(c23239cM126688d, modifier2, (Function1) objM87133R8, c28655q, i19 | ((i17 << 3) & 112), 0);
            C39620c c39620cM126687c = m126675h(interfaceC28601c1M87260n).getMagnitudeSheet();
            if (c39620cM126687c == null) {
                c28655q.m87150e0(-343916496);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-343916495);
                boolean zM87157i3 = c28655q.m87157i(abstractC23864c2);
                Object objM87133R9 = c28655q.m87133R();
                if (zM87157i3 || objM87133R9 == c28676v0) {
                    objM87133R9 = new C16825r(abstractC23864c2, 5);
                    c28655q.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R9;
                boolean zM87157i4 = c28655q.m87157i(abstractC23864c2);
                Object objM87133R10 = c28655q.m87133R();
                if (zM87157i4 || objM87133R10 == c28676v0) {
                    objM87133R10 = new C2776b(abstractC23864c2, 5);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC39619b.m126607h(c39620cM126687c, interfaceC4339a2, (Function1) objM87133R10, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        Modifier modifier4 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23237a(modifier4, viewState, onViewEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C34911a m126674g(String str, C23239c c23239c) {
        return AbstractC15751g.m44431K(str, c23239c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C39632o m126675h(InterfaceC28670t2 interfaceC28670t2) {
        return (C39632o) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m126676i(AbstractC23864c abstractC23864c, C23239c c23239c, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC36877d.k) {
            abstractC23864c.mo1216g(new InterfaceC39628k.d(((AbstractC36877d.k) event).getBoolean()));
        } else if (event instanceof AbstractC36877d.a) {
            Integer numM118275a = ((AbstractC36877d.a) event).getNumber();
            if (numM118275a != null) {
                abstractC23864c.mo1216g(new InterfaceC39628k.e(numM118275a.intValue()));
            }
        } else if (event instanceof AbstractC36877d.c) {
            Integer numM118279a = ((AbstractC36877d.c) event).getNumber();
            if (numM118279a != null) {
                abstractC23864c.mo1216g(new InterfaceC39628k.e(numM118279a.intValue()));
            }
        } else if (event instanceof AbstractC36877d.b) {
            abstractC23864c.mo1216g(InterfaceC39628k.g.f170492a);
        } else if (event instanceof AbstractC36877d.i) {
            Long lM118291b = ((AbstractC36877d.i) event).getTime();
            if (lM118291b != null) {
                abstractC23864c.mo1216g(new InterfaceC39628k.f(lM118291b.longValue()));
            }
        } else if (event instanceof C23223e) {
            if (c23239c.getId().length() > 0) {
                abstractC23864c.mo1216g(new InterfaceC39628k.i(c23239c.getTitle(), c23239c.getId()));
            }
            abstractC23864c.mo1216g(InterfaceC39628k.b.f170487a);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m126677j(AbstractC23864c abstractC23864c) {
        abstractC23864c.mo1216g(InterfaceC39628k.c.f170488a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m126678k(AbstractC23864c abstractC23864c, double d3) {
        abstractC23864c.mo1216g(new InterfaceC39628k.e(d3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m126679l(Modifier modifier, C23239c c23239c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m126673f(modifier, c23239c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final C39618a m126681n(C23239c c23239c) {
        AbstractC36882f0.d dVar;
        AbstractC36882f0.e eVar;
        AbstractC36882f0.b bVar;
        AbstractC22676k.m65750j(c23239c, "<this>");
        List<InterfaceC25312u> listM67283e = c23239c.m67283e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM67283e) {
            if (obj instanceof C36906y) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            AbstractC36882f0 abstractC36882f0M118515j = ((C36906y) it.next()).getType();
            if (!(abstractC36882f0M118515j instanceof AbstractC36882f0.d)) {
                abstractC36882f0M118515j = null;
            }
            dVar = (AbstractC36882f0.d) abstractC36882f0M118515j;
        } while (dVar == null);
        if (dVar != null) {
            return new C39618a(dVar.getMin(), dVar.getMax(), 0, null, 12, null);
        }
        List<InterfaceC25312u> listM67283e2 = c23239c.m67283e();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM67283e2) {
            if (obj2 instanceof C36906y) {
                arrayList2.add(obj2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        do {
            if (!it3.hasNext()) {
                eVar = null;
                break;
            }
            AbstractC36882f0 abstractC36882f0M118515j2 = ((C36906y) it3.next()).getType();
            if (!(abstractC36882f0M118515j2 instanceof AbstractC36882f0.e)) {
                abstractC36882f0M118515j2 = null;
            }
            eVar = (AbstractC36882f0.e) abstractC36882f0M118515j2;
        } while (eVar == null);
        if (eVar != null) {
            return new C39618a(eVar.getMin(), eVar.getMax(), 0, null, 12, null);
        }
        List<InterfaceC25312u> listM67283e3 = c23239c.m67283e();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM67283e3) {
            if (obj3 instanceof C36906y) {
                arrayList3.add(obj3);
            }
        }
        Iterator it4 = arrayList3.iterator();
        do {
            if (!it4.hasNext()) {
                bVar = null;
                break;
            }
            AbstractC36882f0 abstractC36882f0M118515j3 = ((C36906y) it4.next()).getType();
            if (!(abstractC36882f0M118515j3 instanceof AbstractC36882f0.b)) {
                abstractC36882f0M118515j3 = null;
            }
            bVar = (AbstractC36882f0.b) abstractC36882f0M118515j3;
        } while (bVar == null);
        if (bVar != null) {
            Double dM118315e = bVar.getMin();
            Double dM118314d = bVar.getMax();
            if (dM118315e != null && dM118314d != null) {
                return new C39618a(dM118315e.doubleValue(), dM118314d.doubleValue(), bVar.getDecimalPlaces(), bVar.getUnit());
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092 A[RETURN] */
    /* JADX INFO: renamed from: o */
    private static final Integer m126682o(C23239c c23239c) {
        AbstractC36882f0.d dVar;
        AbstractC36882f0.e eVar;
        Integer numM118327e;
        List<InterfaceC25312u> listM67283e = c23239c.m67283e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM67283e) {
            if (obj instanceof C36906y) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            AbstractC36882f0 abstractC36882f0M118515j = ((C36906y) it.next()).getType();
            if (!(abstractC36882f0M118515j instanceof AbstractC36882f0.d)) {
                abstractC36882f0M118515j = null;
            }
            dVar = (AbstractC36882f0.d) abstractC36882f0M118515j;
        } while (dVar == null);
        if (dVar != null && (numM118327e = dVar.getPresetNumber()) != null) {
            return numM118327e;
        }
        List<InterfaceC25312u> listM67283e2 = c23239c.m67283e();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM67283e2) {
            if (obj2 instanceof C36906y) {
                arrayList2.add(obj2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC36882f0 abstractC36882f0M118515j2 = ((C36906y) it3.next()).getType();
            if (!(abstractC36882f0M118515j2 instanceof AbstractC36882f0.e)) {
                abstractC36882f0M118515j2 = null;
            }
            eVar = (AbstractC36882f0.e) abstractC36882f0M118515j2;
            if (eVar != null) {
                if (eVar != null) {
                    return eVar.getPresetNumber();
                }
                return null;
            }
        }
        eVar = null;
        if (eVar != null) {
            return eVar.getPresetNumber();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[RETURN] */
    /* JADX INFO: renamed from: p */
    public static final C39621d m126683p(C23239c c23239c) {
        AbstractC36882f0.g gVar;
        AbstractC22676k.m65750j(c23239c, "<this>");
        List<InterfaceC25312u> listM67283e = c23239c.m67283e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM67283e) {
            if (obj instanceof C36906y) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC36882f0 abstractC36882f0M118515j = ((C36906y) it.next()).getType();
            if (!(abstractC36882f0M118515j instanceof AbstractC36882f0.g)) {
                abstractC36882f0M118515j = null;
            }
            gVar = (AbstractC36882f0.g) abstractC36882f0M118515j;
            if (gVar != null) {
                if (gVar != null) {
                    return new C39621d(gVar.getMinTime(), gVar.getMaxTime());
                }
                return null;
            }
        }
        gVar = null;
        if (gVar != null) {
            return new C39621d(gVar.getMinTime(), gVar.getMaxTime());
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final C39624g m126684q(C23239c c23239c, String commitPath) {
        Double dM118316f;
        AbstractC36882f0.i iVar;
        AbstractC36882f0.b bVar;
        AbstractC22676k.m65750j(c23239c, "<this>");
        AbstractC22676k.m65750j(commitPath, "commitPath");
        List<InterfaceC25312u> listM67283e = c23239c.m67283e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM67283e) {
            if (obj instanceof C36906y) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            dM118316f = null;
            if (!it.hasNext()) {
                iVar = null;
                break;
            }
            AbstractC36882f0 abstractC36882f0M118515j = ((C36906y) it.next()).getType();
            if (!(abstractC36882f0M118515j instanceof AbstractC36882f0.i)) {
                abstractC36882f0M118515j = null;
            }
            iVar = (AbstractC36882f0.i) abstractC36882f0M118515j;
        } while (iVar == null);
        Boolean boolM118344b = iVar != null ? iVar.getBoolean() : null;
        Integer numM126682o = m126682o(c23239c);
        if (numM126682o != null) {
            dM118316f = Double.valueOf(numM126682o.intValue());
        } else {
            List<InterfaceC25312u> listM67283e2 = c23239c.m67283e();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listM67283e2) {
                if (obj2 instanceof C36906y) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            do {
                if (!it3.hasNext()) {
                    bVar = null;
                    break;
                }
                AbstractC36882f0 abstractC36882f0M118515j2 = ((C36906y) it3.next()).getType();
                if (!(abstractC36882f0M118515j2 instanceof AbstractC36882f0.b)) {
                    abstractC36882f0M118515j2 = null;
                }
                bVar = (AbstractC36882f0.b) abstractC36882f0M118515j2;
            } while (bVar == null);
            if (bVar != null) {
                dM118316f = bVar.getNumber();
            }
        }
        return new C39624g(boolM118344b, dM118316f, c23239c.getServedTimeMillis(), m126681n(c23239c), m126683p(c23239c), false, false, c23239c.getIsCompleted() ? EnumC39622e.SUCCESS : EnumC39622e.IDLE, null, commitPath, false, 1376, null);
    }
}
