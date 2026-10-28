package w12;

import android.app.Application;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.navigation.models.ChatHeaderMetadata;
import java.util.Iterator;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v12.C35555b;
import v12.C35556c;
import v12.InterfaceC35554a;
import vx0.C36553a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w12.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/navigation/models/ChatHeaderMetadata;", "metadata", "Landroidx/compose/ui/Modifier;", "modifier", "", "turnsCompleted", "Ly3/f;", "spacing", "Ll83/a0;", "f", "(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V", "Lv12/c;", "viewState", "g", "(Lv12/c;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "onboarding-personalization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36705h {

    /* JADX INFO: renamed from: w12.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.header.ui.DayZeroHeaderWidgetsKt$DayZeroHeaderWidgets$1$1", m100430f = "DayZeroHeaderWidgets.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f157181w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C35556c, InterfaceC35554a> f157182x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ChatHeaderMetadata f157183y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C35556c, InterfaceC35554a> abstractC23864c, ChatHeaderMetadata chatHeaderMetadata, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157182x = abstractC23864c;
            this.f157183y = chatHeaderMetadata;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f157182x, this.f157183y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157181w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f157182x.mo1216g(new InterfaceC35554a.a(this.f157183y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0202  */
    /* JADX WARN: Code duplicated, block: B:105:0x0225  */
    /* JADX WARN: Code duplicated, block: B:108:0x0231  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:74:0x0138  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0154  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
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
    public static final void m117833f(ChatHeaderMetadata metadata, Modifier modifier, int i13, float f13, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        int i17;
        int i18;
        int i19;
        int i24;
        float f14;
        int i25;
        boolean z4;
        Modifier modifier3;
        int i26;
        float f15;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int i27;
        float f16;
        C35556c c35556c;
        boolean zIsFeatureEnabled;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R3;
        Object obj;
        Object obj2;
        boolean zM87153g3;
        Object objM87133R4;
        AbstractC22676k.m65750j(metadata, "metadata");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-267404654);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? c28655q.m87153g(metadata) : c28655q.m87157i(metadata) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i28 = i15 & 2;
        if (i28 == 0) {
            if ((i14 & 48) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    i18 = i13;
                    if (c28655q.m87149e(i18)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 8;
                if (i24 != 0) {
                    if ((i14 & 3072) == 0) {
                        f14 = f13;
                        if (c28655q.m87147d(f14)) {
                            i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i16 |= i25;
                    }
                    if ((i16 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z4)) {
                        if (i28 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i17 != 0) {
                            i27 = 0;
                        } else {
                            i27 = i18;
                        }
                        if (i24 != 0) {
                            f16 = 1 * 8;
                        } else {
                            f16 = f14;
                        }
                        c35556c = new C35556c(null, 1, null);
                        c28655q.m87150e0(1371609227);
                        zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (zIsFeatureEnabled) {
                            interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                            applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            if (applicationContext instanceof Application) {
                                application = (Application) applicationContext;
                            } else {
                                application = null;
                            }
                            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                            objM87133R = c28655q.m87133R();
                            if (zM87153g || objM87133R == c28676v0) {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R;
                        } else {
                            c28655q.m87150e0(-707976188);
                            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                            if (interfaceC1583f2M73844a == null) {
                                c28655q.m87150e0(-707931115);
                                c28655q.m87173q(false);
                                obj = null;
                                abstractC23864c = null;
                                obj2 = null;
                            } else {
                                c28655q.m87150e0(-707931114);
                                Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                                AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                                application2 = (Application) applicationContext2;
                                zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                                objM87133R3 = c28655q.m87133R();
                                if (!zM87153g2 || objM87133R3 == c28676v0) {
                                    objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    obj2 = null;
                                    obj = null;
                                }
                                abstractC23864c = (AbstractC23864c) objM87133R3;
                                c28655q.m87173q(false);
                            }
                            if (abstractC23864c == null) {
                                c28655q.m87150e0(-707430526);
                                zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c35556c) | c28655q.m87153g(obj);
                                objM87133R4 = c28655q.m87133R();
                                if (zM87153g3 || objM87133R4 == c28676v0) {
                                    objM87133R4 = new C23863b(c35556c);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                abstractC23864c = (C23863b) objM87133R4;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-438479417);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C35556c(null, 1, null), null, c28655q, 0, 2);
                        String path = metadata.getPath();
                        Integer numValueOf = Integer.valueOf(i27);
                        boolean zM87157i = c28655q.m87157i(abstractC23864c);
                        if ((i16 & 14) != 4 || ((i16 & 8) != 0 && c28655q.m87157i(metadata))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i | z13;
                        objM87133R2 = c28655q.m87133R();
                        if (z14 || objM87133R2 == c28676v0) {
                            objM87133R2 = new a(abstractC23864c, metadata, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87255i(abstractC23864c, path, numValueOf, (InterfaceC4351m) objM87133R2, c28655q);
                        Modifier modifier5 = modifier4;
                        float f17 = f16;
                        m117834g(m117839l(interfaceC28601c1M87260n), modifier5, f17, c28655q, (i16 & 112) | ((i16 >> 3) & 896), 0);
                        i26 = i27;
                        modifier3 = modifier5;
                        f15 = f17;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        i26 = i18;
                        f15 = f14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36702e(metadata, modifier3, i26, f15, i14, i15);
                    }
                }
                i16 |= 3072;
                f14 = f13;
                if ((i16 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i17 != 0) {
                        i27 = 0;
                    } else {
                        i27 = i18;
                    }
                    if (i24 != 0) {
                        f16 = 1 * 8;
                    } else {
                        f16 = f14;
                    }
                    c35556c = new C35556c(null, 1, null);
                    c28655q.m87150e0(1371609227);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj = null;
                            abstractC23864c = null;
                            obj2 = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext3;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R3;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c35556c) | c28655q.m87153g(obj);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C23863b(c35556c);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C23863b(c35556c);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (C23863b) objM87133R4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                    }
                    c28655q.m87173q(false);
                    InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C35556c(null, 1, null), null, c28655q, 0, 2);
                    String path2 = metadata.getPath();
                    Integer numValueOf2 = Integer.valueOf(i27);
                    boolean zM87157i2 = c28655q.m87157i(abstractC23864c);
                    if ((i16 & 14) != 4) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    z14 = zM87157i2 | z13;
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new a(abstractC23864c, metadata, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(abstractC23864c, metadata, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87255i(abstractC23864c, path2, numValueOf2, (InterfaceC4351m) objM87133R2, c28655q);
                    Modifier modifier6 = modifier4;
                    float f18 = f16;
                    m117834g(m117839l(interfaceC28601c1M87260n2), modifier6, f18, c28655q, (i16 & 112) | ((i16 >> 3) & 896), 0);
                    i26 = i27;
                    modifier3 = modifier6;
                    f15 = f18;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    i26 = i18;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36702e(metadata, modifier3, i26, f15, i14, i15);
                }
            }
            i16 |= 384;
            i18 = i13;
            i24 = i15 & 8;
            if (i24 != 0) {
                if ((i14 & 3072) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i25;
                }
                if ((i16 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i17 != 0) {
                        i27 = 0;
                    } else {
                        i27 = i18;
                    }
                    if (i24 != 0) {
                        f16 = 1 * 8;
                    } else {
                        f16 = f14;
                    }
                    c35556c = new C35556c(null, 1, null);
                    c28655q.m87150e0(1371609227);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                    C28676v0 c28676v2 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj = null;
                            abstractC23864c = null;
                            obj2 = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext4 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext4, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext4;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R3;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c35556c) | c28655q.m87153g(obj);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C23863b(c35556c);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C23863b(c35556c);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (C23863b) objM87133R4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                    }
                    c28655q.m87173q(false);
                    InterfaceC28601c1 interfaceC28601c1M87260n3 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C35556c(null, 1, null), null, c28655q, 0, 2);
                    String path3 = metadata.getPath();
                    Integer numValueOf3 = Integer.valueOf(i27);
                    boolean zM87157i3 = c28655q.m87157i(abstractC23864c);
                    if ((i16 & 14) != 4) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    z14 = zM87157i3 | z13;
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new a(abstractC23864c, metadata, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(abstractC23864c, metadata, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87255i(abstractC23864c, path3, numValueOf3, (InterfaceC4351m) objM87133R2, c28655q);
                    Modifier modifier7 = modifier4;
                    float f19 = f16;
                    m117834g(m117839l(interfaceC28601c1M87260n3), modifier7, f19, c28655q, (i16 & 112) | ((i16 >> 3) & 896), 0);
                    i26 = i27;
                    modifier3 = modifier7;
                    f15 = f19;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    i26 = i18;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36702e(metadata, modifier3, i26, f15, i14, i15);
                }
            }
            i16 |= 3072;
            f14 = f13;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i17 != 0) {
                    i27 = 0;
                } else {
                    i27 = i18;
                }
                if (i24 != 0) {
                    f16 = 1 * 8;
                } else {
                    f16 = f14;
                }
                c35556c = new C35556c(null, 1, null);
                c28655q.m87150e0(1371609227);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                C28676v0 c28676v3 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                        obj2 = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext5 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext5, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext5;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c35556c) | c28655q.m87153g(obj);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C23863b(c35556c);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C23863b(c35556c);
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (C23863b) objM87133R4;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                }
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n4 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C35556c(null, 1, null), null, c28655q, 0, 2);
                String path4 = metadata.getPath();
                Integer numValueOf4 = Integer.valueOf(i27);
                boolean zM87157i4 = c28655q.m87157i(abstractC23864c);
                if ((i16 & 14) != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z14 = zM87157i4 | z13;
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new a(abstractC23864c, metadata, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(abstractC23864c, metadata, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87255i(abstractC23864c, path4, numValueOf4, (InterfaceC4351m) objM87133R2, c28655q);
                Modifier modifier8 = modifier4;
                float f110 = f16;
                m117834g(m117839l(interfaceC28601c1M87260n4), modifier8, f110, c28655q, (i16 & 112) | ((i16 >> 3) & 896), 0);
                i26 = i27;
                modifier3 = modifier8;
                f15 = f110;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                i26 = i18;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36702e(metadata, modifier3, i26, f15, i14, i15);
            }
        }
        i16 |= 48;
        modifier2 = modifier;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                i18 = i13;
                if (c28655q.m87149e(i18)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i16 |= i19;
            }
            i24 = i15 & 8;
            if (i24 != 0) {
                if ((i14 & 3072) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i25;
                }
                if ((i16 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    if (i28 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i17 != 0) {
                        i27 = 0;
                    } else {
                        i27 = i18;
                    }
                    if (i24 != 0) {
                        f16 = 1 * 8;
                    } else {
                        f16 = f14;
                    }
                    c35556c = new C35556c(null, 1, null);
                    c28655q.m87150e0(1371609227);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                    C28676v0 c28676v4 = C28635l.f115821a;
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj = null;
                            abstractC23864c = null;
                            obj2 = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext6 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext6, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext6;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R3;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c35556c) | c28655q.m87153g(obj);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R4 = new C23863b(c35556c);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C23863b(c35556c);
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (C23863b) objM87133R4;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                    }
                    c28655q.m87173q(false);
                    InterfaceC28601c1 interfaceC28601c1M87260n5 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C35556c(null, 1, null), null, c28655q, 0, 2);
                    String path5 = metadata.getPath();
                    Integer numValueOf5 = Integer.valueOf(i27);
                    boolean zM87157i5 = c28655q.m87157i(abstractC23864c);
                    if ((i16 & 14) != 4) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    z14 = zM87157i5 | z13;
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new a(abstractC23864c, metadata, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(abstractC23864c, metadata, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87255i(abstractC23864c, path5, numValueOf5, (InterfaceC4351m) objM87133R2, c28655q);
                    Modifier modifier9 = modifier4;
                    float f111 = f16;
                    m117834g(m117839l(interfaceC28601c1M87260n5), modifier9, f111, c28655q, (i16 & 112) | ((i16 >> 3) & 896), 0);
                    i26 = i27;
                    modifier3 = modifier9;
                    f15 = f111;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    i26 = i18;
                    f15 = f14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36702e(metadata, modifier3, i26, f15, i14, i15);
                }
            }
            i16 |= 3072;
            f14 = f13;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i17 != 0) {
                    i27 = 0;
                } else {
                    i27 = i18;
                }
                if (i24 != 0) {
                    f16 = 1 * 8;
                } else {
                    f16 = f14;
                }
                c35556c = new C35556c(null, 1, null);
                c28655q.m87150e0(1371609227);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                C28676v0 c28676v5 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                        obj2 = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext7 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext7, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext7;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c35556c) | c28655q.m87153g(obj);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C23863b(c35556c);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C23863b(c35556c);
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (C23863b) objM87133R4;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                }
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n6 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C35556c(null, 1, null), null, c28655q, 0, 2);
                String path6 = metadata.getPath();
                Integer numValueOf6 = Integer.valueOf(i27);
                boolean zM87157i6 = c28655q.m87157i(abstractC23864c);
                if ((i16 & 14) != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z14 = zM87157i6 | z13;
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new a(abstractC23864c, metadata, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(abstractC23864c, metadata, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87255i(abstractC23864c, path6, numValueOf6, (InterfaceC4351m) objM87133R2, c28655q);
                Modifier modifier10 = modifier4;
                float f112 = f16;
                m117834g(m117839l(interfaceC28601c1M87260n6), modifier10, f112, c28655q, (i16 & 112) | ((i16 >> 3) & 896), 0);
                i26 = i27;
                modifier3 = modifier10;
                f15 = f112;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                i26 = i18;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36702e(metadata, modifier3, i26, f15, i14, i15);
            }
        }
        i16 |= 384;
        i18 = i13;
        i24 = i15 & 8;
        if (i24 != 0) {
            if ((i14 & 3072) == 0) {
                f14 = f13;
                if (c28655q.m87147d(f14)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i25;
            }
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i28 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i17 != 0) {
                    i27 = 0;
                } else {
                    i27 = i18;
                }
                if (i24 != 0) {
                    f16 = 1 * 8;
                } else {
                    f16 = f14;
                }
                c35556c = new C35556c(null, 1, null);
                c28655q.m87150e0(1371609227);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                C28676v0 c28676v6 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                        obj2 = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext8 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext8, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext8;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c35556c) | c28655q.m87153g(obj);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R4 = new C23863b(c35556c);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C23863b(c35556c);
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (C23863b) objM87133R4;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                }
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n7 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C35556c(null, 1, null), null, c28655q, 0, 2);
                String path7 = metadata.getPath();
                Integer numValueOf7 = Integer.valueOf(i27);
                boolean zM87157i7 = c28655q.m87157i(abstractC23864c);
                if ((i16 & 14) != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z14 = zM87157i7 | z13;
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new a(abstractC23864c, metadata, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(abstractC23864c, metadata, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87255i(abstractC23864c, path7, numValueOf7, (InterfaceC4351m) objM87133R2, c28655q);
                Modifier modifier11 = modifier4;
                float f113 = f16;
                m117834g(m117839l(interfaceC28601c1M87260n7), modifier11, f113, c28655q, (i16 & 112) | ((i16 >> 3) & 896), 0);
                i26 = i27;
                modifier3 = modifier11;
                f15 = f113;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                i26 = i18;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36702e(metadata, modifier3, i26, f15, i14, i15);
            }
        }
        i16 |= 3072;
        f14 = f13;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i28 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i17 != 0) {
                i27 = 0;
            } else {
                i27 = i18;
            }
            if (i24 != 0) {
                f16 = 1 * 8;
            } else {
                f16 = f14;
            }
            c35556c = new C35556c(null, 1, null);
            c28655q.m87150e0(1371609227);
            zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
            C28676v0 c28676v7 = C28635l.f115821a;
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj = null;
                    abstractC23864c = null;
                    obj2 = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext9 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext9, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext9;
                    zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, new C23863b(c35556c), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c35556c) | c28655q.m87153g(obj);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R4 = new C23863b(c35556c);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C23863b(c35556c);
                        c28655q.m87172p0(objM87133R4);
                    }
                    abstractC23864c = (C23863b) objM87133R4;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c35556c) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c35556c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35555b.class), null, null);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
            }
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n8 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C35556c(null, 1, null), null, c28655q, 0, 2);
            String path8 = metadata.getPath();
            Integer numValueOf8 = Integer.valueOf(i27);
            boolean zM87157i8 = c28655q.m87157i(abstractC23864c);
            if ((i16 & 14) != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = zM87157i8 | z13;
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new a(abstractC23864c, metadata, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(abstractC23864c, metadata, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87255i(abstractC23864c, path8, numValueOf8, (InterfaceC4351m) objM87133R2, c28655q);
            Modifier modifier12 = modifier4;
            float f114 = f16;
            m117834g(m117839l(interfaceC28601c1M87260n8), modifier12, f114, c28655q, (i16 & 112) | ((i16 >> 3) & 896), 0);
            i26 = i27;
            modifier3 = modifier12;
            f15 = f114;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            i26 = i18;
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36702e(metadata, modifier3, i26, f15, i14, i15);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m117834g(final C35556c viewState, Modifier modifier, float f13, Composer composer, final int i13, final int i14) {
        int i15;
        final Modifier modifier2;
        final float f14;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1860602505);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            modifier2 = i16 != 0 ? C2314t.f9131w : modifier;
            f14 = i17 != 0 ? 1 * 8 : f13;
            if (viewState.m112767a().isEmpty()) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i18 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: w12.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i18) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC36705h.m117835h(viewState, modifier2, f14, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC36705h.m117838k(viewState, modifier2, f14, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC36701d.m117826j()), AbstractC37817c.m121344e(-1389987657, c28655q, new InterfaceC4351m() { // from class: w12.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36705h.m117836i(modifier2, f14, viewState, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        modifier2 = modifier;
        f14 = f13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i19 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: w12.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i19) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36705h.m117835h(viewState, modifier2, f14, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC36705h.m117838k(viewState, modifier2, f14, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m117835h(C35556c c35556c, Modifier modifier, float f13, int i13, int i14, Composer composer, int i15) {
        m117834g(c35556c, modifier, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m117836i(Modifier modifier, float f13, C35556c c35556c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1242574967);
            Iterator<T> it = c35556c.m112767a().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, new C36553a(10), null, c28655q, 0, 10);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Modifier m117837j(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1536876753);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m117838k(C35556c c35556c, Modifier modifier, float f13, int i13, int i14, Composer composer, int i15) {
        m117834g(c35556c, modifier, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final C35556c m117839l(InterfaceC28670t2 interfaceC28670t2) {
        return (C35556c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m117840m(ChatHeaderMetadata chatHeaderMetadata, Modifier modifier, int i13, float f13, int i14, int i15, Composer composer, int i16) {
        m117833f(chatHeaderMetadata, modifier, i13, f13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
