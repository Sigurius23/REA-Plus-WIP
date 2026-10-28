package n31;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import b03.C2205b;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import ec3.AbstractC13091v;
import ec3.C13043h0;
import kw1.C22852c;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import mq2.C25888a;
import mx1.C26009o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: n31.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0014²\u0006\f\u0010\f\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ln31/i;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Ln31/e;", "defaultViewState", "f", "(Landroidx/compose/ui/Modifier;Ln31/i;Lkotlin/jvm/functions/Function1;Ln31/e;Landroidx/compose/runtime/Composer;II)V", "viewState", "", "searchQuery", "", "currentDebounceMs", "Lcom/whoop/analytics/AnalyticEventModel;", "currentAnalyticEvent", "currentOnViewEvent", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26223h {

    /* JADX INFO: renamed from: n31.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.searcharchmini.SearchArchMiniWrapperKt$SearchArchMiniWrapper$2$1", m100430f = "SearchArchMiniWrapper.kt", m100431l = {65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f103973E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28670t2 f103974F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28670t2 f103975G;

        /* JADX INFO: renamed from: w */
        int f103976w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f103977x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC23864c<C26220e, AbstractC26218c> f103978y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26224i f103979z;

        /* JADX INFO: renamed from: n31.h$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.searcharchmini.SearchArchMiniWrapperKt$SearchArchMiniWrapper$2$1$2", m100430f = "SearchArchMiniWrapper.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "query", "Ll83/a0;", "<anonymous>", "(Ljava/lang/String;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42040a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C26224i f103980E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ InterfaceC28670t2 f103981F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ InterfaceC28670t2 f103982G;

            /* JADX INFO: renamed from: w */
            int f103983w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f103984x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28670t2 f103985y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ AbstractC23864c<C26220e, AbstractC26218c> f103986z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42040a(InterfaceC28670t2 interfaceC28670t2, AbstractC23864c<C26220e, AbstractC26218c> abstractC23864c, C26224i c26224i, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC30057d<? super C42040a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f103985y = interfaceC28670t2;
                this.f103986z = abstractC23864c;
                this.f103980E = c26224i;
                this.f103981F = interfaceC28670t3;
                this.f103982G = interfaceC28670t4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C42040a c42040a = new C42040a(this.f103985y, this.f103986z, this.f103980E, this.f103981F, this.f103982G, interfaceC30057d);
                c42040a.f103984x = obj;
                return c42040a;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.f103984x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f103983w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    long jM77889p = AbstractC26223h.m77889p(this.f103985y);
                    this.f103984x = str;
                    this.f103983w = 1;
                    if (AbstractC3034m0.m8782b(jM77889p, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC26223h.m77880g(this.f103986z, this.f103980E, this.f103981F, this.f103982G, str, true);
                return C23454a0.f92919a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42040a) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, AbstractC23864c<C26220e, AbstractC26218c> abstractC23864c, C26224i c26224i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f103977x = interfaceC28601c1;
            this.f103978y = abstractC23864c;
            this.f103979z = c26224i;
            this.f103973E = interfaceC28670t2;
            this.f103974F = interfaceC28670t3;
            this.f103975G = interfaceC28670t4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final String m77896h(InterfaceC28601c1 interfaceC28601c1) {
            return AbstractC26223h.m77887n(interfaceC28601c1);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f103977x, this.f103978y, this.f103979z, this.f103973E, this.f103974F, this.f103975G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f103976w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26223h.m77880g(this.f103978y, this.f103979z, this.f103973E, this.f103974F, AbstractC26223h.m77887n(this.f103977x), false);
                C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(AbstractC28683x.m87240H(new C26222g(this.f103977x, 0)), 1);
                C42040a c42040a = new C42040a(this.f103975G, this.f103978y, this.f103979z, this.f103973E, this.f103974F, null);
                this.f103976w = 1;
                if (AbstractC13091v.m36604n(c13043h0M36612v, c42040a, this) == enumC31071a) {
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

    /* JADX WARN: Code duplicated, block: B:102:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x0201  */
    /* JADX WARN: Code duplicated, block: B:122:0x0229  */
    /* JADX WARN: Code duplicated, block: B:125:0x0243  */
    /* JADX WARN: Code duplicated, block: B:128:0x0255  */
    /* JADX WARN: Code duplicated, block: B:132:0x0285  */
    /* JADX WARN: Code duplicated, block: B:136:0x02de  */
    /* JADX WARN: Code duplicated, block: B:142:0x031b  */
    /* JADX WARN: Code duplicated, block: B:146:0x032f  */
    /* JADX WARN: Code duplicated, block: B:150:0x033b  */
    /* JADX WARN: Code duplicated, block: B:152:0x035a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0366  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0104  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    /* JADX WARN: Code duplicated, block: B:88:0x017d  */
    /* JADX WARN: Code duplicated, block: B:91:0x019d  */
    /* JADX INFO: renamed from: f */
    public static final void m77879f(Modifier modifier, C26224i itemState, Function1 function1, C26220e c26220e, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        C26220e c26220e2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C26220e c26220e3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Modifier modifier4;
        Function1 function4;
        Modifier modifier5;
        Function1 function5;
        Object objM87133R;
        C28674u2 c28674u2;
        boolean zM87153g;
        Object objM87133R2;
        AbstractC23864c abstractC23864c;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        InterfaceC28601c1 interfaceC28601c1M87238F2;
        InterfaceC28601c1 interfaceC28601c1M87238F3;
        boolean zM87157i;
        Object aVar;
        InterfaceC28601c1 interfaceC28601c2;
        Function1 function6;
        AbstractC23864c abstractC23864c2;
        boolean zM87153g2;
        Object objM87133R4;
        boolean zM87157i2;
        Object objM87133R5;
        int i17;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g3;
        Object objM87133R6;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g4;
        Object objM87133R7;
        boolean zM87153g5;
        Object objM87133R8;
        int i18;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-80988125);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    c26220e2 = c26220e;
                    if (c28655q.m87157i(c26220e2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i18;
                } else {
                    c26220e2 = c26220e;
                }
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i18;
            } else {
                c26220e2 = c26220e;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i19 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C26009o(19);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c26220e2 = new C26220e(true, false, null, 0L, null, null, null, null, false, null, null, 2046, null);
                    }
                    modifier5 = modifier4;
                    function5 = function4;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    modifier5 = modifier2;
                    function5 = function2;
                }
                c28655q.m87175r();
                c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
                if (((Context) c28655q.m87161k(c28674u2)).getApplicationContext() instanceof Application) {
                    c28655q.m87150e0(-520165172);
                    i17 = i15 >> 9;
                    c28655q.m87150e0(1371609227);
                    if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(c28674u2)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g3 = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c26220e2)) || (i17 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(null);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c26220e2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC26219d.class), null, null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R6;
                    } else {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext2 = ((Context) c28655q.m87161k(c28674u2)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext2;
                            zM87153g4 = c28655q.m87153g(null) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c26220e2)) || (i17 & 6) == 4) | c28655q.m87153g(null);
                            objM87133R7 = c28655q.m87133R();
                            if (zM87153g4 || objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC26219d.class), null, new C23863b(c26220e2), null);
                                c28655q.m87172p0(objM87133R7);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R7;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g5 = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c26220e2)) || (i17 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(null);
                            objM87133R8 = c28655q.m87133R();
                            if (zM87153g5 || objM87133R8 == c28676v0) {
                                objM87133R8 = new C23863b(c26220e2);
                                c28655q.m87172p0(objM87133R8);
                            }
                            abstractC23864c = (C23863b) objM87133R8;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1054899855);
                    zM87153g = c28655q.m87153g(c26220e2);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g || objM87133R2 == c28676v0) {
                        objM87133R2 = new C23863b(c26220e2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    abstractC23864c = (C23863b) objM87133R2;
                    c28655q.m87173q(false);
                }
                C26220e c26220e4 = c26220e2;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c26220e4, null, c28655q, (i15 >> 6) & 112, 2);
                Object[] objArr = {itemState.getPath()};
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C25888a(21);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R3, c28655q, 48);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(Long.valueOf(m77885l(interfaceC28601c1M87260n).getSearchDebounceMs()), c28655q);
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(itemState.getAnalyticEvent(), c28655q);
                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q);
                String strM77898b = itemState.getPath();
                zM87157i = c28655q.m87157i(abstractC23864c) | c28655q.m87157i(itemState) | c28655q.m87153g(interfaceC28601c1M87238F2) | c28655q.m87153g(interfaceC28601c1M87238F3) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28601c1M87238F);
                Object objM87133R9 = c28655q.m87133R();
                if (!zM87157i || objM87133R9 == c28676v0) {
                    interfaceC28601c2 = interfaceC28601c1;
                    function6 = function5;
                    abstractC23864c2 = abstractC23864c;
                    aVar = new a(interfaceC28601c2, abstractC23864c2, itemState, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(aVar);
                } else {
                    function6 = function5;
                    abstractC23864c2 = abstractC23864c;
                    interfaceC28601c2 = interfaceC28601c1;
                    aVar = objM87133R9;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, strM77898b);
                C26220e c26220eM77885l = m77885l(interfaceC28601c1M87260n);
                String strM77898b2 = itemState.getPath();
                String strM77887n = m77887n(interfaceC28601c2);
                zM87153g2 = c28655q.m87153g(interfaceC28601c2);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C26216a(interfaceC28601c2, 2);
                    c28655q.m87172p0(objM87133R4);
                }
                Function1 function7 = (Function1) objM87133R4;
                zM87157i2 = c28655q.m87157i(abstractC23864c2) | ((i15 & 896) == 256);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2 || objM87133R5 == r1) {
                    objM87133R5 = new C2205b(abstractC23864c2, function6, 4);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifier6 = modifier5;
                function3 = function6;
                AbstractC26217b.m77846o(modifier6, c26220eM77885l, strM77898b2, strM77887n, function7, (Function1) objM87133R5, c28655q, i15 & 14, 0);
                c28655q = c28655q;
                modifier3 = modifier6;
                c26220e3 = c26220e4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c26220e3 = c26220e2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(modifier3, itemState, function3, c26220e3, i13, i14, 19);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c26220e2 = c26220e;
                if (c28655q.m87157i(c26220e2)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i18;
            } else {
                c26220e2 = c26220e;
            }
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i18;
        } else {
            c26220e2 = c26220e;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C26009o(19);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c26220e2 = new C26220e(true, false, null, 0L, null, null, null, null, false, null, null, 2046, null);
                }
                modifier5 = modifier4;
                function5 = function4;
            } else {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C26009o(19);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c26220e2 = new C26220e(true, false, null, 0L, null, null, null, null, false, null, null, 2046, null);
                }
                modifier5 = modifier4;
                function5 = function4;
            }
            c28655q.m87175r();
            c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
            if (((Context) c28655q.m87161k(c28674u2)).getApplicationContext() instanceof Application) {
                c28655q.m87150e0(-520165172);
                i17 = i15 >> 9;
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext3 = ((Context) c28655q.m87161k(c28674u2)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext3;
                        zM87153g4 = c28655q.m87153g(null) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c26220e2)) || (i17 & 6) == 4) | c28655q.m87153g(null);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R7 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC26219d.class), null, new C23863b(c26220e2), null);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC26219d.class), null, new C23863b(c26220e2), null);
                            c28655q.m87172p0(objM87133R7);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R7;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g5 = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c26220e2)) || (i17 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(null);
                        objM87133R8 = c28655q.m87133R();
                        if (zM87153g5) {
                            objM87133R8 = new C23863b(c26220e2);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C23863b(c26220e2);
                            c28655q.m87172p0(objM87133R8);
                        }
                        abstractC23864c = (C23863b) objM87133R8;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(c28674u2)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g3 = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c26220e2)) || (i17 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(null);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R6 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c26220e2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC26219d.class), null, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c26220e2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC26219d.class), null, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R6;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1054899855);
                zM87153g = c28655q.m87153g(c26220e2);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new C23863b(c26220e2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C23863b(c26220e2);
                    c28655q.m87172p0(objM87133R2);
                }
                abstractC23864c = (C23863b) objM87133R2;
                c28655q.m87173q(false);
            }
            C26220e c26220e5 = c26220e2;
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c26220e5, null, c28655q, (i15 >> 6) & 112, 2);
            Object[] objArr2 = {itemState.getPath()};
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C25888a(21);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R3, c28655q, 48);
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(Long.valueOf(m77885l(interfaceC28601c1M87260n2).getSearchDebounceMs()), c28655q);
            interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(itemState.getAnalyticEvent(), c28655q);
            interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(function5, c28655q);
            String strM77898b3 = itemState.getPath();
            zM87157i = c28655q.m87157i(abstractC23864c) | c28655q.m87157i(itemState) | c28655q.m87153g(interfaceC28601c1M87238F2) | c28655q.m87153g(interfaceC28601c1M87238F3) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28601c1M87238F);
            Object objM87133R10 = c28655q.m87133R();
            if (zM87157i) {
                interfaceC28601c2 = interfaceC28601c1;
                function6 = function5;
                abstractC23864c2 = abstractC23864c;
                aVar = new a(interfaceC28601c2, abstractC23864c2, itemState, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F, null);
                c28655q.m87172p0(aVar);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
                function6 = function5;
                abstractC23864c2 = abstractC23864c;
                aVar = new a(interfaceC28601c2, abstractC23864c2, itemState, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F, null);
                c28655q.m87172p0(aVar);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, strM77898b3);
            C26220e c26220eM77885l2 = m77885l(interfaceC28601c1M87260n2);
            String strM77898b4 = itemState.getPath();
            String strM77887n2 = m77887n(interfaceC28601c2);
            zM87153g2 = c28655q.m87153g(interfaceC28601c2);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R4 = new C26216a(interfaceC28601c2, 2);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C26216a(interfaceC28601c2, 2);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function8 = (Function1) objM87133R4;
            zM87157i2 = c28655q.m87157i(abstractC23864c2) | ((i15 & 896) == 256);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R5 = new C2205b(abstractC23864c2, function6, 4);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2205b(abstractC23864c2, function6, 4);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifier7 = modifier5;
            function3 = function6;
            AbstractC26217b.m77846o(modifier7, c26220eM77885l2, strM77898b4, strM77887n2, function8, (Function1) objM87133R5, c28655q, i15 & 14, 0);
            c28655q = c28655q;
            modifier3 = modifier7;
            c26220e3 = c26220e5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c26220e3 = c26220e2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c(modifier3, itemState, function3, c26220e3, i13, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m77880g(AbstractC23864c<C26220e, AbstractC26218c> abstractC23864c, C26224i c26224i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, String str, boolean z4) {
        String str2;
        AnalyticEventModel analyticEventModelM77890q;
        if (AbstractC39414r.m125890i0(str)) {
            abstractC23864c.mo1216g(new AbstractC26218c.d(c26224i.getPath()));
            return;
        }
        if (!z4 || (analyticEventModelM77890q = m77890q(interfaceC28670t2)) == null) {
            str2 = str;
        } else {
            str2 = str;
            m77891r(interfaceC28670t3).invoke(new DesignItemInteraction(null, AnalyticEventModel.copy$default(analyticEventModelM77890q, null, null, null, null, null, str2, null, 95, null)));
        }
        abstractC23864c.mo1216g(new AbstractC26218c.e(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m77881h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m77882i(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m77888o(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m77883j(AbstractC23864c abstractC23864c, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC26218c) {
            abstractC23864c.mo1216g(event);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m77884k(Modifier modifier, C26224i c26224i, Function1 function1, C26220e c26220e, int i13, int i14, Composer composer, int i15) {
        m77879f(modifier, c26224i, function1, c26220e, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final C26220e m77885l(InterfaceC28670t2 interfaceC28670t2) {
        return (C26220e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC28601c1 m77886m() {
        return AbstractC28683x.m87272z("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final String m77887n(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: o */
    private static final void m77888o(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final long m77889p(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).longValue();
    }

    /* JADX INFO: renamed from: q */
    private static final AnalyticEventModel m77890q(InterfaceC28670t2 interfaceC28670t2) {
        return (AnalyticEventModel) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final Function1 m77891r(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }
}
