package b03;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import aw0.C2101a;
import b01.C2185f;
import bc3.InterfaceC2994c0;
import c03.C3815c;
import c41.C4069m0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
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
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;

/* JADX INFO: renamed from: b03.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lc03/c;", "viewState", "whoop-status_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2207d {

    /* JADX INFO: renamed from: b03.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.whoopstatus.presentation.WhoopStatusArchMiniWrapperKt$WhoopStatusArchMiniWrapper$2$1", m100430f = "WhoopStatusArchMiniWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8787w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C3815c, InterfaceC2208e> f8788x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C3815c, InterfaceC2208e> abstractC23864c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8788x = abstractC23864c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f8788x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f8787w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f8788x.mo1216g(new InterfaceC2208e.b("arch_mini"));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0197  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x0214  */
    /* JADX WARN: Code duplicated, block: B:143:0x0235  */
    /* JADX WARN: Code duplicated, block: B:146:0x0247  */
    /* JADX WARN: Code duplicated, block: B:151:0x0273  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:167:0x02de  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:77:0x014e  */
    /* JADX INFO: renamed from: e */
    public static final void m7037e(Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        C3815c c3815c;
        C28674u2 c28674u2;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        AbstractC23864c abstractC23864c2;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        boolean zM87157i;
        Object objM87133R2;
        int i17;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean z13;
        Object objM87133R3;
        boolean z14;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean z15;
        Object objM87133R4;
        boolean z16;
        Object objM87133R5;
        Object objM87133R6;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(568350529);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C2185f(11);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function2 = (Function1) objM87133R6;
                }
                c3815c = new C3815c(false, null, null, 7, null);
                c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
                if (((Context) c28655q.m87161k(c28674u2)).getApplicationContext() instanceof Application) {
                    c28655q.m87150e0(724020627);
                    i17 = C4069m0.f16535h;
                    c28655q.m87150e0(1371609227);
                    if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(c28674u2)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        z13 = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c3815c)) || (i17 & 6) == 4) | ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048);
                        objM87133R3 = c28655q.m87133R();
                        if (z13 || objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c3815c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2209f.class), null, null);
                            c3815c = c3815c;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        z14 = false;
                        c28655q.m87173q(false);
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
                            z15 = ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c3815c)) || (i17 & 6) == 4) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048);
                            objM87133R4 = c28655q.m87133R();
                            if (z15 || objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2209f.class), null, new C23863b(c3815c), null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R4;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            z16 = ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c3815c)) || (i17 & 6) == 4) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048);
                            objM87133R5 = c28655q.m87133R();
                            if (z16 || objM87133R5 == c28676v0) {
                                objM87133R5 = new C23863b(c3815c);
                                c28655q.m87172p0(objM87133R5);
                            }
                            abstractC23864c = (C23863b) objM87133R5;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                        z14 = false;
                    }
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(969962361);
                    zM87153g = c28655q.m87153g(c3815c);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = new C23863b(c3815c);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (C23863b) objM87133R;
                    c28655q.m87173q(false);
                }
                abstractC23864c2 = abstractC23864c;
                InterfaceC13058l viewState = abstractC23864c2.getViewState();
                int i24 = C4069m0.f16535h;
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, c3815c, null, c28655q, i24 << 3, 2);
                zM87157i = c28655q.m87157i(abstractC23864c2);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(abstractC23864c2, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                C4069m0 c4069m0M11684a = m7039g(interfaceC28601c1M87260n).getAlertTileViewState();
                if (m7039g(interfaceC28601c1M87260n).getShouldDisplay() || c4069m0M11684a == null) {
                    c28655q.m87150e0(970623777);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(970350667);
                    C2101a c2101a = new C2101a(1, modifier4);
                    boolean zM87157i2 = c28655q.m87157i(abstractC23864c2) | ((i16 & 112) == 32);
                    Object objM87133R7 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C2205b(abstractC23864c2, function2, 0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC25303l.m74291r(c4069m0M11684a, null, c2101a, (Function1) objM87133R7, c28655q, i24, 2);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2206c(modifier3, function3, i13, i14, 0);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i15;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C2185f(11);
                    c28655q.m87172p0(objM87133R6);
                }
                function2 = (Function1) objM87133R6;
            }
            c3815c = new C3815c(false, null, null, 7, null);
            c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
            if (((Context) c28655q.m87161k(c28674u2)).getApplicationContext() instanceof Application) {
                c28655q.m87150e0(724020627);
                i17 = C4069m0.f16535h;
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
                        z15 = ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c3815c)) || (i17 & 6) == 4) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048);
                        objM87133R4 = c28655q.m87133R();
                        if (z15) {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2209f.class), null, new C23863b(c3815c), null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2209f.class), null, new C23863b(c3815c), null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R4;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        z16 = ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c3815c)) || (i17 & 6) == 4) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048);
                        objM87133R5 = c28655q.m87133R();
                        if (z16) {
                            objM87133R5 = new C23863b(c3815c);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C23863b(c3815c);
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC23864c = (C23863b) objM87133R5;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    z14 = false;
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(c28674u2)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    if (((i17 & 112) ^ 48) <= 32) {
                    }
                    z13 = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c3815c)) || (i17 & 6) == 4) | ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048);
                    objM87133R3 = c28655q.m87133R();
                    if (z13) {
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c3815c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2209f.class), null, null);
                        c3815c = c3815c;
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c3815c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2209f.class), null, null);
                        c3815c = c3815c;
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    z14 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
            } else {
                c28655q.m87150e0(969962361);
                zM87153g = c28655q.m87153g(c3815c);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = new C23863b(c3815c);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C23863b(c3815c);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (C23863b) objM87133R;
                c28655q.m87173q(false);
            }
            abstractC23864c2 = abstractC23864c;
            InterfaceC13058l viewState2 = abstractC23864c2.getViewState();
            int i25 = C4069m0.f16535h;
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState2, c3815c, null, c28655q, i25 << 3, 2);
            zM87157i = c28655q.m87157i(abstractC23864c2);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(abstractC23864c2, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(abstractC23864c2, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            C4069m0 c4069m0M11684a2 = m7039g(interfaceC28601c1M87260n).getAlertTileViewState();
            if (m7039g(interfaceC28601c1M87260n).getShouldDisplay()) {
                c28655q.m87150e0(970623777);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(970623777);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2206c(modifier3, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m7038f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final C3815c m7039g(InterfaceC28670t2 interfaceC28670t2) {
        return (C3815c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Modifier m7040h(Modifier modifier, C4069m0 it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1315470906);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m7041i(AbstractC23864c abstractC23864c, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        abstractC23864c.mo1216g(new InterfaceC2208e.a("arch_mini"));
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m7042j(Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m7037e(modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
