package um1;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import bp0.C3529q;
import bz0.C3711a;
import c41.C4068m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.HealthTabScreenModel;
import com.whoop.navigation.IntegrationsScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import ec3.InterfaceC13037f2;
import h01.C16542i;
import h01.C16547n;
import h01.C16551r;
import h01.InterfaceC16556w;
import java.util.Map;
import k31.C22174d;
import k31.EnumC22171a;
import kd1.EnumC22400l;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import m83.C25262p;
import o01.C27347c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p007a6.C0467z0;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11328a;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p459rf.C31345p;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p741vn1.AbstractC36203g;
import p741vn1.C36213q;
import p741vn1.EnumC36197a;
import p741vn1.EnumC36205i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sn1.AbstractC32773a;
import sn1.C32774b;
import to1.C34015h;
import un1.AbstractC35098d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: um1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lvn1/q;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k", "(Lvn1/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "shouldShowReplayButton", "shouldAnimateReplayButton", "Lvn1/g;", "notificationCenterViewState", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35086d {

    /* JADX INFO: renamed from: um1.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.notifications.NotificationsWrapperKt$NotificationsWrapper$2$1", m100430f = "NotificationsWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148906w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36213q f148907x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC23864c<AbstractC36203g, AbstractC32773a> f148908y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C36213q c36213q, AbstractC23864c<AbstractC36203g, AbstractC32773a> abstractC23864c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148907x = c36213q;
            this.f148908y = abstractC23864c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f148907x, this.f148908y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148906w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM115264e = this.f148907x.getPath();
            if (strM115264e != null) {
                this.f148908y.mo1216g(new AbstractC32773a.c(strM115264e, this.f148907x.getUserCategory()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0241  */
    /* JADX WARN: Code duplicated, block: B:159:0x0272  */
    /* JADX WARN: Code duplicated, block: B:165:0x0283  */
    /* JADX WARN: Code duplicated, block: B:168:0x0295  */
    /* JADX WARN: Code duplicated, block: B:169:0x0299  */
    /* JADX WARN: Code duplicated, block: B:171:0x029c  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:183:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:186:0x032c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0330  */
    /* JADX WARN: Code duplicated, block: B:192:0x0351  */
    /* JADX WARN: Code duplicated, block: B:195:0x035b  */
    /* JADX WARN: Code duplicated, block: B:197:0x036b  */
    /* JADX WARN: Code duplicated, block: B:198:0x036d  */
    /* JADX WARN: Code duplicated, block: B:202:0x037a  */
    /* JADX WARN: Code duplicated, block: B:205:0x038c  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:218:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:221:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:222:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:226:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:233:0x040a  */
    /* JADX WARN: Code duplicated, block: B:235:0x043d  */
    /* JADX WARN: Code duplicated, block: B:238:0x045c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0460  */
    /* JADX WARN: Code duplicated, block: B:241:0x0464  */
    /* JADX WARN: Code duplicated, block: B:243:0x046a  */
    /* JADX WARN: Code duplicated, block: B:244:0x0477  */
    /* JADX WARN: Code duplicated, block: B:247:0x047f  */
    /* JADX WARN: Code duplicated, block: B:248:0x049b  */
    /* JADX WARN: Code duplicated, block: B:251:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:253:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:255:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:257:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:258:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:267:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:270:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:273:0x0500  */
    /* JADX WARN: Code duplicated, block: B:274:0x0504  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:285:0x053f  */
    /* JADX WARN: Code duplicated, block: B:288:0x054c  */
    /* JADX WARN: Code duplicated, block: B:289:0x054e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:295:0x055c  */
    /* JADX WARN: Code duplicated, block: B:298:0x057d  */
    /* JADX WARN: Code duplicated, block: B:300:0x058f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0599  */
    /* JADX WARN: Code duplicated, block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v6, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r1v14, types: [o01.c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, p1.t2] */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4, types: [p1.t2] */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, p1.c1] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [vn1.g$c] */
    /* JADX WARN: Type inference failed for: r4v24, types: [k31.d] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r6v14, types: [androidx.compose.runtime.Composer] */
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
    /* JADX INFO: renamed from: k */
    public static final void m110955k(C36213q viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C36213q c36213q;
        ?? r14;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        AbstractC36203g abstractC36203gM115263c;
        AbstractC36203g abstractC36203g;
        int i17;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean z13;
        Object objM87133R3;
        AbstractC36203g abstractC36203g2;
        AbstractC23864c abstractC23864c;
        AbstractC23864c abstractC23864c2;
        int i18;
        boolean z14;
        boolean zM87157i;
        Object objM87133R4;
        InterfaceC13037f2 interfaceC13037f2;
        C32774b c32774b;
        InterfaceC13037f2 viewState2;
        boolean z15;
        Object objM87261o;
        int i19;
        ?? r10;
        ?? r15;
        AbstractC36203g abstractC36203gM115263c2;
        boolean zMo115206a;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ?? r37;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z17;
        ?? r16;
        AbstractC36203g abstractC36203gM110962r;
        ?? r17;
        boolean zM65745e;
        C27347c c27347cM115261a;
        Object objM82506b;
        Function1 function4;
        C22174d c22174dM115265f;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R5;
        Object obj;
        Object obj2;
        int i24;
        ?? r18;
        boolean z25;
        ?? r19;
        boolean z26;
        boolean z27;
        Object objM87133R6;
        InterfaceC16556w interfaceC16556wM115208c;
        AbstractC36203g.c cVar;
        boolean z28;
        boolean zM87157i2;
        Object objM87133R7;
        Object objM87133R8;
        boolean z29;
        boolean z34;
        Object objM87133R9;
        boolean z35;
        boolean z36;
        Object objM87133R10;
        Object objM87133R11;
        boolean zM87157i3;
        Object objM87133R12;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean z37;
        Object objM87133R13;
        Object obj3;
        Object obj4;
        boolean z38;
        boolean z39;
        Object objM87133R14;
        Object objM87133R15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1189980479);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
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
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R15 = c28655q.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C34015h(15);
                        c28655q.m87172p0(objM87133R15);
                    }
                    function3 = (Function1) objM87133R15;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShouldShowReplayDefaultState()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                abstractC36203gM115263c = viewState.getNotificationsCenterViewState();
                if (abstractC36203gM115263c == null) {
                    abstractC36203gM115263c = AbstractC36203g.b.f155006b;
                }
                abstractC36203g = abstractC36203gM115263c;
                i17 = AbstractC36203g.f155003a;
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    z13 = ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048) | ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC36203g)) || (i17 & 6) == 4);
                    objM87133R3 = c28655q.m87133R();
                    if (!z13 || objM87133R3 == c28676v0) {
                        abstractC36203g2 = abstractC36203g;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, abstractC36203g2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        abstractC36203g2 = abstractC36203g;
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj4 = null;
                        obj3 = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext2;
                        z37 = ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC36203g)) || (i17 & 6) == 4) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048);
                        objM87133R13 = c28655q.m87133R();
                        if (!z37 || objM87133R13 == c28676v0) {
                            objM87133R13 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, new C23863b(abstractC36203g), null);
                            obj3 = null;
                            obj4 = null;
                            c28655q.m87172p0(objM87133R13);
                        } else {
                            obj4 = null;
                            obj3 = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R13;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        z39 = ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(obj4)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC36203g)) || (i17 & 6) == 4) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(obj3)) || (i17 & 3072) == 2048);
                        objM87133R14 = c28655q.m87133R();
                        if (z39 || objM87133R14 == c28676v0) {
                            objM87133R14 = new C23863b(abstractC36203g);
                            c28655q.m87172p0(objM87133R14);
                        }
                        abstractC23864c = (C23863b) objM87133R14;
                        z38 = false;
                        c28655q.m87173q(false);
                    } else {
                        z38 = false;
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z38);
                    c28655q.m87173q(z38);
                    abstractC36203g2 = abstractC36203g;
                }
                abstractC23864c2 = abstractC23864c;
                String strM115264e = viewState.getPath();
                i18 = i16 & 14;
                if (i18 != 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = c28655q.m87157i(abstractC23864c2) | z14;
                objM87133R4 = c28655q.m87133R();
                if (!zM87157i || objM87133R4 == c28676v0) {
                    interfaceC13037f2 = null;
                    objM87133R4 = new a(viewState, abstractC23864c2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    interfaceC13037f2 = null;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM115264e);
                if (abstractC23864c2 instanceof C32774b) {
                    c32774b = (C32774b) abstractC23864c2;
                } else {
                    c32774b = interfaceC13037f2;
                }
                if (c32774b != null) {
                    viewState2 = c32774b.getViewState();
                } else {
                    viewState2 = interfaceC13037f2;
                }
                if (viewState2 == null) {
                    c28655q.m87150e0(49350450);
                    z15 = false;
                    c28655q.m87173q(false);
                    objM87261o = interfaceC13037f2;
                } else {
                    z15 = false;
                    c28655q.m87150e0(1109970607);
                    objM87261o = AbstractC28683x.m87261o(viewState2, c28655q, 0);
                    c28655q.m87173q(false);
                }
                if (objM87261o == null) {
                    c28655q.m87150e0(1109972475);
                    C28655q c28655q2 = c28655q;
                    i19 = i17;
                    objM87261o = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), abstractC36203g2, null, c28655q2, i17 << 3, 2);
                    r10 = c28655q2;
                } else {
                    C28655q c28655q3 = c28655q;
                    i19 = i17;
                    c28655q3.m87150e0(1109968228);
                    r10 = c28655q3;
                }
                r10.m87173q(z15);
                r15 = objM87261o;
                abstractC36203gM115263c2 = viewState.getNotificationsCenterViewState();
                if (abstractC36203gM115263c2 != null) {
                    zMo115206a = abstractC36203gM115263c2.mo115206a();
                } else {
                    zMo115206a = z15;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * 8), C2299e.f9110M, r10, 6);
                z16 = zMo115206a;
                iHashCode = Long.hashCode(r10.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = r10.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(r10, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                r10.m87158i0();
                if (r10.f115903S) {
                    r10.m87163l(c0213j);
                } else {
                    r10.m87178s0();
                }
                AbstractC28683x.m87239G(r10, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(r10, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (r10.f115903S || !AbstractC22676k.m65745e(r10.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r10, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(r10, C0217k.f726d, modifierM118962N);
                if (z16) {
                    r10.m87150e0(-1210525858);
                    AbstractC36203g abstractC36203gM110962r2 = m110962r(r15);
                    if (viewState.getAiChatEntryPointItem() != null) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    zM87157i2 = r10.m87157i(abstractC23864c2);
                    objM87133R7 = r10.m87133R();
                    if (zM87157i2 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C25262p(abstractC23864c2, 16);
                        r10.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R7;
                    objM87133R8 = r10.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C16547n(2, interfaceC28601c1, interfaceC28601c2);
                        r10.m87172p0(objM87133R8);
                    }
                    Function1 function5 = (Function1) objM87133R8;
                    boolean zM87157i4 = r10.m87157i(abstractC23864c2);
                    if (i18 != 4 || ((i16 & 8) != 0 && r10.m87157i(viewState))) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zM87157i4 | z29;
                    objM87133R9 = r10.m87133R();
                    if (z34 || objM87133R9 == c28676v0) {
                        objM87133R9 = new C3529q(4, abstractC23864c2, viewState);
                        r10.m87172p0(objM87133R9);
                    }
                    InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R9;
                    boolean zM87153g = r10.m87153g(r15) | r10.m87157i(abstractC23864c2);
                    boolean z44 = z28;
                    if ((i16 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    z36 = z35 | zM87153g;
                    objM87133R10 = r10.m87133R();
                    if (z36 || objM87133R10 == c28676v0) {
                        objM87133R10 = new C0467z0(function3, abstractC23864c2, r15, 6);
                        r10.m87172p0(objM87133R10);
                    }
                    Function1 function6 = (Function1) objM87133R10;
                    objM87133R11 = r10.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C16542i(6, interfaceC28601c1);
                        r10.m87172p0(objM87133R11);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R11;
                    zM87157i3 = r10.m87157i(abstractC23864c2);
                    objM87133R12 = r10.m87133R();
                    if (zM87157i3 || objM87133R12 == c28676v0) {
                        objM87133R12 = new C31345p(abstractC23864c2, 4);
                        r10.m87172p0(objM87133R12);
                    }
                    int i26 = (i19 << 3) | 12607488;
                    r37 = r15;
                    interfaceC28601c3 = interfaceC28601c2;
                    ?? r110 = r10;
                    z17 = false;
                    AbstractC35098d.m111010h(null, abstractC36203gM110962r2, z44, interfaceC4339a, function5, interfaceC4351m, function6, interfaceC4339a2, (Function1) objM87133R12, r110, i26, 1);
                    r110.m87173q(false);
                    r16 = r110;
                } else {
                    r37 = r15;
                    ?? r111 = r10;
                    interfaceC28601c3 = interfaceC28601c2;
                    z17 = false;
                    r111.m87150e0(-1206061703);
                    r111.m87173q(false);
                    r16 = r111;
                }
                abstractC36203gM110962r = m110962r(r37);
                if (abstractC36203gM110962r instanceof AbstractC36203g.c) {
                    cVar = (AbstractC36203g.c) abstractC36203gM110962r;
                }
                if (r17 != 0) {
                    r17 = interfaceC13037f2;
                    interfaceC16556wM115208c = r17.getCardToDisplay();
                    if (interfaceC16556wM115208c != null) {
                        r17 = cVar;
                        zM65745e = AbstractC22676k.m65745e(interfaceC16556wM115208c.getAppNotificationType(), "AI_COACH");
                    } else {
                        r17 = interfaceC13037f2;
                        r17 = cVar;
                        r17 = cVar;
                        zM65745e = z17;
                    }
                } else {
                    r17 = interfaceC13037f2;
                    r17 = cVar;
                    r17 = cVar;
                    zM65745e = z17;
                }
                c27347cM115261a = viewState.getAiChatEntryPointItem();
                if (c27347cM115261a != null) {
                    objM82506b = C27347c.m82506b(c27347cM115261a, null, null, null, null, null, null, null, null, zM65745e, null, 767, null);
                } else {
                    objM82506b = interfaceC13037f2;
                }
                if (viewState.m115262b()) {
                    r16.m87150e0(-1205561859);
                    boolean zM110958n = m110958n(interfaceC28601c1);
                    boolean zM110960p = m110960p(interfaceC28601c3);
                    c22174dM115265f = viewState.getReplayViewState();
                    if (c22174dM115265f == null) {
                        r16.m87150e0(-1205319037);
                        r16.m87173q(z17);
                        i24 = i18;
                        c36213q = viewState;
                        r18 = interfaceC13037f2;
                        obj2 = c28676v0;
                    } else {
                        r16.m87150e0(1346592062);
                        if (viewState.getAiChatEntryPointItem() == null) {
                            z18 = true;
                        } else {
                            z18 = z17;
                        }
                        boolean zM110960p2 = m110960p(interfaceC28601c3);
                        boolean zM87157i5 = r16.m87157i(abstractC23864c2);
                        if (i18 != 4 || ((i16 & 8) != 0 && r16.m87157i(viewState))) {
                            z19 = true;
                        } else {
                            z19 = z17;
                        }
                        z24 = zM87157i5 | z19;
                        objM87133R5 = r16.m87133R();
                        if (z24) {
                            obj = c28676v0;
                        } else {
                            obj = c28676v0;
                            if (objM87133R5 == obj) {
                                i24 = i18;
                                c36213q = viewState;
                                obj2 = obj;
                            }
                            C22174d c22174dM63477d = C22174d.m63477d(c22174dM115265f, null, null, z18, zM110960p2, (Function1) objM87133R5, 3, null);
                            r16.m87173q(z17);
                            r18 = c22174dM63477d;
                        }
                        obj2 = obj;
                        i24 = i18;
                        C11328a c11328a = new C11328a(abstractC23864c2, viewState, interfaceC28601c1, interfaceC28601c3, 4);
                        c36213q = viewState;
                        r16.m87172p0(c11328a);
                        objM87133R5 = c11328a;
                        C22174d c22174dM63477d2 = C22174d.m63477d(c22174dM115265f, null, null, z18, zM110960p2, (Function1) objM87133R5, 3, null);
                        r16.m87173q(z17);
                        r18 = c22174dM63477d2;
                    }
                    if (i24 != 4 || ((i16 & 8) != 0 && r16.m87157i(c36213q))) {
                        z25 = true;
                    } else {
                        z25 = z17;
                    }
                    r19 = r37;
                    boolean zM87153g2 = z25 | r16.m87153g(r19);
                    if ((i16 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = z17;
                    }
                    z27 = zM87153g2 | z26;
                    objM87133R6 = r16.m87133R();
                    if (!z27 || objM87133R6 == obj2) {
                        function4 = function3;
                        objM87133R6 = new C4068m(c36213q, function4, (InterfaceC28601c1) r19);
                        r16.m87172p0(objM87133R6);
                    } else {
                        function4 = function3;
                    }
                    AbstractC35084b.m110939c(objM82506b, zM110958n, zM110960p, r18, (InterfaceC4339a) objM87133R6, r16, C27347c.f109538k | (C22174d.f85992f << 9));
                    r16.m87173q(z17);
                } else {
                    c36213q = viewState;
                    function4 = function3;
                    r16.m87150e0(-1203566823);
                    r16.m87173q(z17);
                }
                r16.m87173q(true);
                function2 = function4;
                r14 = r16;
            } else {
                c36213q = viewState;
                c28655q.m87138X();
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3711a(c36213q, i13, function2, i14, 5);
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
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R15 = c28655q.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C34015h(15);
                    c28655q.m87172p0(objM87133R15);
                }
                function3 = (Function1) objM87133R15;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShouldShowReplayDefaultState()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            abstractC36203gM115263c = viewState.getNotificationsCenterViewState();
            if (abstractC36203gM115263c == null) {
                abstractC36203gM115263c = AbstractC36203g.b.f155006b;
            }
            abstractC36203g = abstractC36203gM115263c;
            i17 = AbstractC36203g.f155003a;
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj4 = null;
                    obj3 = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    z37 = ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC36203g)) || (i17 & 6) == 4) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048);
                    objM87133R13 = c28655q.m87133R();
                    if (z37) {
                        objM87133R13 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, new C23863b(abstractC36203g), null);
                        obj3 = null;
                        obj4 = null;
                        c28655q.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, new C23863b(abstractC36203g), null);
                        obj3 = null;
                        obj4 = null;
                        c28655q.m87172p0(objM87133R13);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R13;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    z39 = ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(obj4)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC36203g)) || (i17 & 6) == 4) | ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(obj3)) || (i17 & 3072) == 2048);
                    objM87133R14 = c28655q.m87133R();
                    if (z39) {
                        objM87133R14 = new C23863b(abstractC36203g);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new C23863b(abstractC36203g);
                        c28655q.m87172p0(objM87133R14);
                    }
                    abstractC23864c = (C23863b) objM87133R14;
                    z38 = false;
                    c28655q.m87173q(false);
                } else {
                    z38 = false;
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z38);
                c28655q.m87173q(z38);
                abstractC36203g2 = abstractC36203g;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                z13 = ((((i17 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i17 & 3072) == 2048) | ((((i17 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC36203g)) || (i17 & 6) == 4);
                objM87133R3 = c28655q.m87133R();
                if (z13) {
                    abstractC36203g2 = abstractC36203g;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, abstractC36203g2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    abstractC36203g2 = abstractC36203g;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, abstractC36203g2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, null);
                    c28655q.m87172p0(objM87133R3);
                }
                abstractC23864c = (AbstractC23864c) objM87133R3;
                c28655q.m87173q(false);
            }
            abstractC23864c2 = abstractC23864c;
            String strM115264e2 = viewState.getPath();
            i18 = i16 & 14;
            if (i18 != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            zM87157i = c28655q.m87157i(abstractC23864c2) | z14;
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                interfaceC13037f2 = null;
                objM87133R4 = new a(viewState, abstractC23864c2, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                interfaceC13037f2 = null;
                objM87133R4 = new a(viewState, abstractC23864c2, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM115264e2);
            if (abstractC23864c2 instanceof C32774b) {
                c32774b = (C32774b) abstractC23864c2;
            } else {
                c32774b = interfaceC13037f2;
            }
            if (c32774b != null) {
                viewState2 = c32774b.getViewState();
            } else {
                viewState2 = interfaceC13037f2;
            }
            if (viewState2 == null) {
                c28655q.m87150e0(49350450);
                z15 = false;
                c28655q.m87173q(false);
                objM87261o = interfaceC13037f2;
            } else {
                z15 = false;
                c28655q.m87150e0(1109970607);
                objM87261o = AbstractC28683x.m87261o(viewState2, c28655q, 0);
                c28655q.m87173q(false);
            }
            if (objM87261o == null) {
                c28655q.m87150e0(1109972475);
                C28655q c28655q4 = c28655q;
                i19 = i17;
                objM87261o = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), abstractC36203g2, null, c28655q4, i17 << 3, 2);
                r10 = c28655q4;
            } else {
                C28655q c28655q5 = c28655q;
                i19 = i17;
                c28655q5.m87150e0(1109968228);
                r10 = c28655q5;
            }
            r10.m87173q(z15);
            r15 = objM87261o;
            abstractC36203gM115263c2 = viewState.getNotificationsCenterViewState();
            if (abstractC36203gM115263c2 != null) {
                zMo115206a = abstractC36203gM115263c2.mo115206a();
            } else {
                zMo115206a = z15;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * 8), C2299e.f9110M, r10, 6);
            z16 = zMo115206a;
            iHashCode = Long.hashCode(r10.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = r10.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r10, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            r10.m87158i0();
            if (r10.f115903S) {
                r10.m87163l(c0213j);
            } else {
                r10.m87178s0();
            }
            AbstractC28683x.m87239G(r10, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(r10, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (r10.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r10, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, r10, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(r10, C0217k.f726d, modifierM118962N2);
            if (z16) {
                r10.m87150e0(-1210525858);
                AbstractC36203g abstractC36203gM110962r3 = m110962r(r15);
                if (viewState.getAiChatEntryPointItem() != null) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                zM87157i2 = r10.m87157i(abstractC23864c2);
                objM87133R7 = r10.m87133R();
                if (zM87157i2) {
                    objM87133R7 = new C25262p(abstractC23864c2, 16);
                    r10.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C25262p(abstractC23864c2, 16);
                    r10.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R7;
                objM87133R8 = r10.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C16547n(2, interfaceC28601c1, interfaceC28601c2);
                    r10.m87172p0(objM87133R8);
                }
                Function1 function7 = (Function1) objM87133R8;
                boolean zM87157i6 = r10.m87157i(abstractC23864c2);
                if (i18 != 4) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                z34 = zM87157i6 | z29;
                objM87133R9 = r10.m87133R();
                if (z34) {
                    objM87133R9 = new C3529q(4, abstractC23864c2, viewState);
                    r10.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C3529q(4, abstractC23864c2, viewState);
                    r10.m87172p0(objM87133R9);
                }
                InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R9;
                boolean zM87153g3 = r10.m87153g(r15) | r10.m87157i(abstractC23864c2);
                boolean z45 = z28;
                if ((i16 & 112) == 32) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                z36 = z35 | zM87153g3;
                objM87133R10 = r10.m87133R();
                if (z36) {
                    objM87133R10 = new C0467z0(function3, abstractC23864c2, r15, 6);
                    r10.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C0467z0(function3, abstractC23864c2, r15, 6);
                    r10.m87172p0(objM87133R10);
                }
                Function1 function8 = (Function1) objM87133R10;
                objM87133R11 = r10.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C16542i(6, interfaceC28601c1);
                    r10.m87172p0(objM87133R11);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R11;
                zM87157i3 = r10.m87157i(abstractC23864c2);
                objM87133R12 = r10.m87133R();
                if (zM87157i3) {
                    objM87133R12 = new C31345p(abstractC23864c2, 4);
                    r10.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C31345p(abstractC23864c2, 4);
                    r10.m87172p0(objM87133R12);
                }
                int i27 = (i19 << 3) | 12607488;
                r37 = r15;
                interfaceC28601c3 = interfaceC28601c2;
                ?? r112 = r10;
                z17 = false;
                AbstractC35098d.m111010h(null, abstractC36203gM110962r3, z45, interfaceC4339a3, function7, interfaceC4351m2, function8, interfaceC4339a4, (Function1) objM87133R12, r112, i27, 1);
                r112.m87173q(false);
                r16 = r112;
            } else {
                r37 = r15;
                ?? r113 = r10;
                interfaceC28601c3 = interfaceC28601c2;
                z17 = false;
                r113.m87150e0(-1206061703);
                r113.m87173q(false);
                r16 = r113;
            }
            abstractC36203gM110962r = m110962r(r37);
            if (abstractC36203gM110962r instanceof AbstractC36203g.c) {
                cVar = (AbstractC36203g.c) abstractC36203gM110962r;
            }
            if (r17 != 0) {
                r17 = interfaceC13037f2;
                interfaceC16556wM115208c = r17.getCardToDisplay();
                if (interfaceC16556wM115208c != null) {
                    r17 = cVar;
                    zM65745e = AbstractC22676k.m65745e(interfaceC16556wM115208c.getAppNotificationType(), "AI_COACH");
                } else {
                    r17 = interfaceC13037f2;
                    r17 = cVar;
                    r17 = cVar;
                    zM65745e = z17;
                }
            } else {
                r17 = interfaceC13037f2;
                r17 = cVar;
                r17 = cVar;
                zM65745e = z17;
            }
            c27347cM115261a = viewState.getAiChatEntryPointItem();
            if (c27347cM115261a != null) {
                objM82506b = C27347c.m82506b(c27347cM115261a, null, null, null, null, null, null, null, null, zM65745e, null, 767, null);
            } else {
                objM82506b = interfaceC13037f2;
            }
            if (viewState.m115262b()) {
                r16.m87150e0(-1205561859);
                boolean zM110958n2 = m110958n(interfaceC28601c1);
                boolean zM110960p3 = m110960p(interfaceC28601c3);
                c22174dM115265f = viewState.getReplayViewState();
                if (c22174dM115265f == null) {
                    r16.m87150e0(-1205319037);
                    r16.m87173q(z17);
                    i24 = i18;
                    c36213q = viewState;
                    r18 = interfaceC13037f2;
                    obj2 = c28676v0;
                } else {
                    r16.m87150e0(1346592062);
                    if (viewState.getAiChatEntryPointItem() == null) {
                        z18 = true;
                    } else {
                        z18 = z17;
                    }
                    boolean zM110960p4 = m110960p(interfaceC28601c3);
                    boolean zM87157i7 = r16.m87157i(abstractC23864c2);
                    if (i18 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    z24 = zM87157i7 | z19;
                    objM87133R5 = r16.m87133R();
                    if (z24) {
                        obj = c28676v0;
                        if (objM87133R5 == obj) {
                            i24 = i18;
                            c36213q = viewState;
                            obj2 = obj;
                        }
                        C22174d c22174dM63477d3 = C22174d.m63477d(c22174dM115265f, null, null, z18, zM110960p4, (Function1) objM87133R5, 3, null);
                        r16.m87173q(z17);
                        r18 = c22174dM63477d3;
                    } else {
                        obj = c28676v0;
                    }
                    obj2 = obj;
                    i24 = i18;
                    C11328a c11328a2 = new C11328a(abstractC23864c2, viewState, interfaceC28601c1, interfaceC28601c3, 4);
                    c36213q = viewState;
                    r16.m87172p0(c11328a2);
                    objM87133R5 = c11328a2;
                    C22174d c22174dM63477d4 = C22174d.m63477d(c22174dM115265f, null, null, z18, zM110960p4, (Function1) objM87133R5, 3, null);
                    r16.m87173q(z17);
                    r18 = c22174dM63477d4;
                }
                if (i24 != 4) {
                    z25 = true;
                } else {
                    z25 = true;
                }
                r19 = r37;
                boolean zM87153g4 = z25 | r16.m87153g(r19);
                if ((i16 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = z17;
                }
                z27 = zM87153g4 | z26;
                objM87133R6 = r16.m87133R();
                if (z27) {
                    function4 = function3;
                    objM87133R6 = new C4068m(c36213q, function4, (InterfaceC28601c1) r19);
                    r16.m87172p0(objM87133R6);
                } else {
                    function4 = function3;
                    objM87133R6 = new C4068m(c36213q, function4, (InterfaceC28601c1) r19);
                    r16.m87172p0(objM87133R6);
                }
                AbstractC35084b.m110939c(objM82506b, zM110958n2, zM110960p3, r18, (InterfaceC4339a) objM87133R6, r16, C27347c.f109538k | (C22174d.f85992f << 9));
                r16.m87173q(z17);
            } else {
                c36213q = viewState;
                function4 = function3;
                r16.m87150e0(-1203566823);
                r16.m87173q(z17);
            }
            r16.m87173q(true);
            function2 = function4;
            r14 = r16;
        } else {
            c36213q = viewState;
            c28655q.m87138X();
            r14 = c28655q;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3711a(c36213q, i13, function2, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m110956l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m110957m(C36213q c36213q, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m110955k(c36213q, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m110958n(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    private static final void m110959o(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m110960p(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    private static final void m110961q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: r */
    private static final AbstractC36203g m110962r(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC36203g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m110963s(AbstractC23864c abstractC23864c) {
        abstractC23864c.mo1216g(AbstractC32773a.g.f136325a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m110964t(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z4) {
        m110959o(interfaceC28601c1, true);
        m110961q(interfaceC28601c2, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m110965u(AbstractC23864c abstractC23864c, C36213q c36213q, String id4, EnumC36197a dismissCardAction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(dismissCardAction, "dismissCardAction");
        abstractC23864c.mo1216g(new AbstractC32773a.f(id4, dismissCardAction, c36213q.getPath()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m110966v(Function1 function1, AbstractC23864c abstractC23864c, InterfaceC23013y interfaceC23013y, InterfaceC28670t2 interfaceC28670t2, Object event) {
        InterfaceC16556w interfaceC16556wM115208c;
        InterfaceC16556w interfaceC16556wM115208c2;
        InterfaceC16556w interfaceC16556wM115208c3;
        InterfaceC16556w interfaceC16556wM115208c4;
        InterfaceC16556w interfaceC16556wM115208c5;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof EnumC22400l) {
            AbstractC36203g abstractC36203gM110962r = m110962r(interfaceC28670t2);
            AbstractC36203g.c cVar = abstractC36203gM110962r instanceof AbstractC36203g.c ? (AbstractC36203g.c) abstractC36203gM110962r : null;
            if (cVar != null && (interfaceC16556wM115208c5 = cVar.getCardToDisplay()) != null) {
                abstractC23864c.mo1216g(new AbstractC32773a.d(interfaceC16556wM115208c5.getId()));
            }
            if (event == EnumC22400l.TURN_OFF_ALARM) {
                AbstractC36203g abstractC36203gM110962r2 = m110962r(interfaceC28670t2);
                AbstractC36203g.c cVar2 = abstractC36203gM110962r2 instanceof AbstractC36203g.c ? (AbstractC36203g.c) abstractC36203gM110962r2 : null;
                if (cVar2 != null && (interfaceC16556wM115208c4 = cVar2.getCardToDisplay()) != null) {
                    function1.invoke(new AbstractC35087e.a((EnumC22400l) event, interfaceC16556wM115208c4.getId()));
                }
            } else {
                function1.invoke(event);
            }
        } else if (event instanceof C16551r) {
            abstractC23864c.mo1216g(new AbstractC32773a.a((C16551r) event));
        } else if (event instanceof C9598e) {
            C9598e c9598eM23127b = (C9598e) event;
            NavigationScreenModel parameters = c9598eM23127b.getParameters();
            CoachScreenModel coachScreenModel = parameters instanceof CoachScreenModel ? (CoachScreenModel) parameters : null;
            if (coachScreenModel != null) {
                AbstractC36203g abstractC36203gM110962r3 = m110962r(interfaceC28670t2);
                AbstractC36203g.c cVar3 = abstractC36203gM110962r3 instanceof AbstractC36203g.c ? (AbstractC36203g.c) abstractC36203gM110962r3 : null;
                Integer cardVariant = coachScreenModel.getCardVariant();
                String label = coachScreenModel.getLabel();
                String str = label == null ? "" : label;
                int iM115207b = cVar3 != null ? cVar3.getCardStackSize() : 0;
                String appNotificationType = (cVar3 == null || (interfaceC16556wM115208c3 = cVar3.getCardToDisplay()) == null) ? null : interfaceC16556wM115208c3.getAppNotificationType();
                abstractC23864c.mo1216g(new AbstractC32773a.e(cardVariant, str, iM115207b, appNotificationType == null ? "" : appNotificationType, (cVar3 == null || (interfaceC16556wM115208c2 = cVar3.getCardToDisplay()) == null) ? null : interfaceC16556wM115208c2.getTemplateName()));
            } else {
                AbstractC36203g abstractC36203gM110962r4 = m110962r(interfaceC28670t2);
                AbstractC36203g.c cVar4 = abstractC36203gM110962r4 instanceof AbstractC36203g.c ? (AbstractC36203g.c) abstractC36203gM110962r4 : null;
                if (cVar4 != null && (interfaceC16556wM115208c = cVar4.getCardToDisplay()) != null) {
                    abstractC23864c.mo1216g(new AbstractC32773a.d(interfaceC16556wM115208c.getId()));
                }
            }
            NavigationScreenModel parameters2 = c9598eM23127b.getParameters();
            if (parameters2 instanceof HealthTabScreenModel) {
                c9598eM23127b = C9598e.m23127b(c9598eM23127b, null, HealthTabScreenModel.copy$default((HealthTabScreenModel) parameters2, "notification_card", null, 2, null), null, 5, null);
            } else if (parameters2 instanceof IntegrationsScreenModel) {
                c9598eM23127b = C9598e.m23127b(c9598eM23127b, null, IntegrationsScreenModel.copy$default((IntegrationsScreenModel) parameters2, null, "notification_card", null, 5, null), null, 5, null);
            }
            function1.invoke(c9598eM23127b);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m110967w(InterfaceC28601c1 interfaceC28601c1) {
        m110959o(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m110968x(AbstractC23864c abstractC23864c, EnumC36205i notificationCardDismissAnimation) {
        AbstractC22676k.m65750j(notificationCardDismissAnimation, "notificationCardDismissAnimation");
        abstractC23864c.mo1216g(new AbstractC32773a.b(notificationCardDismissAnimation));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m110969y(AbstractC23864c abstractC23864c, C36213q c36213q, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Object action) {
        AbstractC22676k.m65750j(action, "action");
        if (action == EnumC22171a.REPLAY) {
            m110959o(interfaceC28601c1, false);
            m110961q(interfaceC28601c2, true);
            abstractC23864c.mo1216g(new AbstractC32773a.h(c36213q.getPath()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m110970z(C36213q c36213q, Function1 function1, InterfaceC28670t2 interfaceC28670t2) {
        InterfaceC16556w interfaceC16556wM115208c;
        TextResource textResourceMo46713d;
        C27347c c27347cM115261a = c36213q.getAiChatEntryPointItem();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c27347cM115261a == null) {
            return c23454a0;
        }
        AbstractC36203g abstractC36203gM110962r = m110962r(interfaceC28670t2);
        String strM21268b = null;
        AbstractC36203g.c cVar = abstractC36203gM110962r instanceof AbstractC36203g.c ? (AbstractC36203g.c) abstractC36203gM110962r : null;
        if (cVar != null && (interfaceC16556wM115208c = cVar.getCardToDisplay()) != null && (textResourceMo46713d = interfaceC16556wM115208c.getSubtitle()) != null) {
            strM21268b = AbstractC8693b.m21268b(textResourceMo46713d);
        }
        String str = strM21268b == null ? "" : strM21268b;
        AppScreen.C9345k1 c9345k1 = AppScreen.C9345k1.f27714w;
        String sourceType = c27347cM115261a.getSourceType();
        String str2 = sourceType == null ? "" : sourceType;
        String conversationSeedId = c27347cM115261a.getConversationSeedId();
        function1.invoke(new C9598e(c9345k1, new CoachScreenModel(str2, str, conversationSeedId == null ? "" : conversationSeedId, (Integer) null, (String) null, (String) null, true, c27347cM115261a.getSourceId(), (Map) null, "notifications_wrapper_chat_entry", c27347cM115261a.getEducationType(), (String) null, (String) null, false, 14648, (DefaultConstructorMarker) null), 0 == true ? 1 : 0, 4, null));
        return c23454a0;
    }
}
