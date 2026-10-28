package yo0;

import a00.C0073h;
import android.app.Application;
import android.content.Context;
import androidx.compose.animation.AbstractC1089a;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import b30.C2541i2;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import be1.C3172f;
import bm0.C3403f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingHighlightID;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp0.AbstractC10944b;
import cp0.AbstractC10956f;
import cp0.AbstractC10959g;
import cp0.EnumC10952d1;
import gz0.AbstractC16300g;
import gz0.AbstractC16306j;
import gz0.EnumC16302h;
import h31.C16825r;
import hb3.AbstractC17104a0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.C1990b0;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import oo0.AbstractC28054a;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.InterfaceC3747i0;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p088dc.AbstractC11895b;
import p181h2.C16618c;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23001u;
import p291l0.InterfaceC23004v;
import p319m4.AbstractC25012a;
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
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rq2.C31755w;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tg2.C33795i;
import vv2.C36537c;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import x81.C38072d;
import xo0.AbstractC38489a;
import xo0.C38490b;
import y71.C39277j;
import yf1.C39516e;
import yk2.C39611k;

/* JADX INFO: renamed from: yo0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aE\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001d\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010\"\u001a\u00020\t*\u00020!2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0003¢\u0006\u0004\b\"\u0010#\u001a-\u0010%\u001a\u00020\t*\u00020!2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0003¢\u0006\u0004\b%\u0010&¨\u0006*²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010(\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "coachOnboardingKey", "onboardingAnalyticSource", "betaText", "Landroidx/compose/ui/Modifier;", "modifier", "", "isResizing", "Lkotlin/Function1;", "Ll83/a0;", "onDisplay", "A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lyo0/f;", "viewState", "Lkotlin/Function0;", "onNext", "F", "(Lyo0/f;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "Lyo0/g;", "highlightBounds", "Lcp0/d1;", "inputBarFocusType", "onNextClick", "X", "(Landroidx/compose/ui/Modifier;Lyo0/f;Lyo0/g;Ljava/lang/String;Lcp0/d1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;", "highlight", "content", "J", "(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Lyo0/g;ZLc93/m;Landroidx/compose/runtime/Composer;I)V", "g0", "(Lyo0/g;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Ll0/u;", "L", "(Ll0/u;Lyo0/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "focusType", "a0", "(Ll0/u;Lyo0/g;Lcp0/d1;Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Landroidx/compose/runtime/Composer;I)V", "", "currentLineIndex", "allLinesComplete", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39683e {

    /* JADX INFO: renamed from: yo0.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.ui.CoachOnboardingOverlayKt$CoachOnboardingOverlay$2$1", m100430f = "CoachOnboardingOverlay.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170803w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C39684f, AbstractC38489a> f170804x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f170805y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f170806z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C39684f, AbstractC38489a> abstractC23864c, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170804x = abstractC23864c;
            this.f170805y = str;
            this.f170806z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f170804x, this.f170805y, this.f170806z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170803w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f170804x.mo1216g(new AbstractC38489a.a(this.f170805y, this.f170806z));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:107:0x0240  */
    /* JADX WARN: Code duplicated, block: B:108:0x0243  */
    /* JADX WARN: Code duplicated, block: B:112:0x024c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0258  */
    /* JADX WARN: Code duplicated, block: B:119:0x027f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0295  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0119  */
    /* JADX WARN: Code duplicated, block: B:80:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x017f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dc  */
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
    /* JADX INFO: renamed from: A */
    public static final void m126913A(String coachOnboardingKey, String str, String betaText, Modifier modifier, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z16;
        C28676v0 c28676v0;
        C39684f c39684f;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        boolean z19;
        boolean zM87157i;
        Object objM87133R3;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R4;
        Object obj;
        Object obj2;
        boolean z24;
        boolean zM87153g3;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(coachOnboardingKey, "coachOnboardingKey");
        AbstractC22676k.m65750j(betaText, "betaText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-540760586);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(coachOnboardingKey) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(betaText) ? 256 : 128;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        function2 = function1;
                        if (c28655q.m87157i(function2)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((74899 & i15) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i24 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C39611k(5);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function2 = (Function1) objM87133R6;
                        }
                        c39684f = new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
                        c28655q.m87150e0(1371609227);
                        if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                            interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                            applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            if (applicationContext instanceof Application) {
                                application = (Application) applicationContext;
                            } else {
                                application = null;
                            }
                            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                            objM87133R = c28655q.m87133R();
                            if (zM87153g || objM87133R == c28676v0) {
                                objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-707976188);
                            interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                            if (interfaceC1583f2M73844a == null) {
                                c28655q.m87150e0(-707931115);
                                c28655q.m87173q(false);
                                obj2 = null;
                                obj = null;
                                abstractC23864c = null;
                            } else {
                                c28655q.m87150e0(-707931114);
                                Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                                AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                                application2 = (Application) applicationContext2;
                                zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                                objM87133R4 = c28655q.m87133R();
                                if (!zM87153g2 || objM87133R4 == c28676v0) {
                                    objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                                    obj = null;
                                    obj2 = null;
                                    c28655q.m87172p0(objM87133R4);
                                } else {
                                    obj2 = null;
                                    obj = null;
                                }
                                abstractC23864c = (AbstractC23864c) objM87133R4;
                                c28655q.m87173q(false);
                            }
                            if (abstractC23864c == null) {
                                c28655q.m87150e0(-707430526);
                                zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c39684f) | c28655q.m87153g(obj);
                                objM87133R5 = c28655q.m87133R();
                                if (zM87153g3 || objM87133R5 == c28676v0) {
                                    objM87133R5 = new C23863b(c39684f);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                abstractC23864c = (C23863b) objM87133R5;
                                z24 = false;
                                c28655q.m87173q(false);
                            } else {
                                z24 = false;
                                c28655q.m87150e0(-438479417);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z24);
                            c28655q.m87173q(z24);
                        }
                        interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
                        boolean zM87157i2 = c28655q.m87157i(abstractC23864c);
                        if ((i15 & 14) == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zM87157i2 | z17 | ((i15 & 112) == 32);
                        objM87133R2 = c28655q.m87133R();
                        if (z18 || objM87133R2 == c28676v0) {
                            objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, coachOnboardingKey);
                        function2.invoke(Boolean.valueOf(m126915C(interfaceC28601c1M87260n).getDisplay()));
                        if (m126915C(interfaceC28601c1M87260n).getDisplay()) {
                            c28655q.m87150e0(624431514);
                            C39684f c39684fM126915C = m126915C(interfaceC28601c1M87260n);
                            zM87157i = c28655q.m87157i(abstractC23864c);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i || objM87133R3 == c28676v0) {
                                objM87133R3 = new C16825r(abstractC23864c, 6);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i25 = ((i15 >> 6) & 112) | (i15 & 896) | ((i15 >> 3) & 7168);
                            modifier3 = modifier4;
                            z19 = z16;
                            m126918F(c39684fM126915C, modifier3, betaText, z19, (InterfaceC4339a) objM87133R3, c28655q, i25, 0);
                            c28655q.m87173q(false);
                        } else {
                            modifier3 = modifier4;
                            z19 = z16;
                            c28655q.m87150e0(624694828);
                            c28655q.m87173q(false);
                        }
                        z15 = z19;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z15 = z13;
                    }
                    function3 = function2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(coachOnboardingKey, str, betaText, modifier3, z15, function3, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function2 = function1;
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39611k(5);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function2 = (Function1) objM87133R6;
                    }
                    c39684f = new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
                    c28655q.m87150e0(1371609227);
                    if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext3;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R4;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c39684f) | c28655q.m87153g(obj);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R5 = new C23863b(c39684f);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C23863b(c39684f);
                                c28655q.m87172p0(objM87133R5);
                            }
                            abstractC23864c = (C23863b) objM87133R5;
                            z24 = false;
                            c28655q.m87173q(false);
                        } else {
                            z24 = false;
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z24);
                        c28655q.m87173q(z24);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                        c28655q.m87173q(false);
                    }
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
                    boolean zM87157i3 = c28655q.m87157i(abstractC23864c);
                    if ((i15 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i3 | z17 | ((i15 & 112) == 32);
                    objM87133R2 = c28655q.m87133R();
                    if (z18) {
                        objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, coachOnboardingKey);
                    function2.invoke(Boolean.valueOf(m126915C(interfaceC28601c1M87260n).getDisplay()));
                    if (m126915C(interfaceC28601c1M87260n).getDisplay()) {
                        c28655q.m87150e0(624431514);
                        C39684f c39684fM126915C2 = m126915C(interfaceC28601c1M87260n);
                        zM87157i = c28655q.m87157i(abstractC23864c);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C16825r(abstractC23864c, 6);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C16825r(abstractC23864c, 6);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i26 = ((i15 >> 6) & 112) | (i15 & 896) | ((i15 >> 3) & 7168);
                        modifier3 = modifier4;
                        z19 = z16;
                        m126918F(c39684fM126915C2, modifier3, betaText, z19, (InterfaceC4339a) objM87133R3, c28655q, i26, 0);
                        c28655q.m87173q(false);
                    } else {
                        modifier3 = modifier4;
                        z19 = z16;
                        c28655q.m87150e0(624694828);
                        c28655q.m87173q(false);
                    }
                    z15 = z19;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                }
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(coachOnboardingKey, str, betaText, modifier3, z15, function3, i13, i14);
                }
            }
            i15 |= 24576;
            z13 = z4;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39611k(5);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function2 = (Function1) objM87133R6;
                    }
                    c39684f = new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
                    c28655q.m87150e0(1371609227);
                    if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext4 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext4, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext4;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R4;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c39684f) | c28655q.m87153g(obj);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R5 = new C23863b(c39684f);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C23863b(c39684f);
                                c28655q.m87172p0(objM87133R5);
                            }
                            abstractC23864c = (C23863b) objM87133R5;
                            z24 = false;
                            c28655q.m87173q(false);
                        } else {
                            z24 = false;
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z24);
                        c28655q.m87173q(z24);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                        c28655q.m87173q(false);
                    }
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
                    boolean zM87157i4 = c28655q.m87157i(abstractC23864c);
                    if ((i15 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i4 | z17 | ((i15 & 112) == 32);
                    objM87133R2 = c28655q.m87133R();
                    if (z18) {
                        objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, coachOnboardingKey);
                    function2.invoke(Boolean.valueOf(m126915C(interfaceC28601c1M87260n).getDisplay()));
                    if (m126915C(interfaceC28601c1M87260n).getDisplay()) {
                        c28655q.m87150e0(624431514);
                        C39684f c39684fM126915C3 = m126915C(interfaceC28601c1M87260n);
                        zM87157i = c28655q.m87157i(abstractC23864c);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C16825r(abstractC23864c, 6);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C16825r(abstractC23864c, 6);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i27 = ((i15 >> 6) & 112) | (i15 & 896) | ((i15 >> 3) & 7168);
                        modifier3 = modifier4;
                        z19 = z16;
                        m126918F(c39684fM126915C3, modifier3, betaText, z19, (InterfaceC4339a) objM87133R3, c28655q, i27, 0);
                        c28655q.m87173q(false);
                    } else {
                        modifier3 = modifier4;
                        z19 = z16;
                        c28655q.m87150e0(624694828);
                        c28655q.m87173q(false);
                    }
                    z15 = z19;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                }
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(coachOnboardingKey, str, betaText, modifier3, z15, function3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function2 = function1;
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39611k(5);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function2 = (Function1) objM87133R6;
                }
                c39684f = new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext5 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext5, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext5;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R4;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c39684f) | c28655q.m87153g(obj);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R5 = new C23863b(c39684f);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C23863b(c39684f);
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC23864c = (C23863b) objM87133R5;
                        z24 = false;
                        c28655q.m87173q(false);
                    } else {
                        z24 = false;
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z24);
                    c28655q.m87173q(z24);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
                }
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
                boolean zM87157i5 = c28655q.m87157i(abstractC23864c);
                if ((i15 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i5 | z17 | ((i15 & 112) == 32);
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, coachOnboardingKey);
                function2.invoke(Boolean.valueOf(m126915C(interfaceC28601c1M87260n).getDisplay()));
                if (m126915C(interfaceC28601c1M87260n).getDisplay()) {
                    c28655q.m87150e0(624431514);
                    C39684f c39684fM126915C4 = m126915C(interfaceC28601c1M87260n);
                    zM87157i = c28655q.m87157i(abstractC23864c);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C16825r(abstractC23864c, 6);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C16825r(abstractC23864c, 6);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i28 = ((i15 >> 6) & 112) | (i15 & 896) | ((i15 >> 3) & 7168);
                    modifier3 = modifier4;
                    z19 = z16;
                    m126918F(c39684fM126915C4, modifier3, betaText, z19, (InterfaceC4339a) objM87133R3, c28655q, i28, 0);
                    c28655q.m87173q(false);
                } else {
                    modifier3 = modifier4;
                    z19 = z16;
                    c28655q.m87150e0(624694828);
                    c28655q.m87173q(false);
                }
                z15 = z19;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(coachOnboardingKey, str, betaText, modifier3, z15, function3, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39611k(5);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function2 = (Function1) objM87133R6;
                    }
                    c39684f = new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
                    c28655q.m87150e0(1371609227);
                    if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext6 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext6, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext6;
                            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87153g2) {
                                objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R4);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R4;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c39684f) | c28655q.m87153g(obj);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87153g3) {
                                objM87133R5 = new C23863b(c39684f);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C23863b(c39684f);
                                c28655q.m87172p0(objM87133R5);
                            }
                            abstractC23864c = (C23863b) objM87133R5;
                            z24 = false;
                            c28655q.m87173q(false);
                        } else {
                            z24 = false;
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z24);
                        c28655q.m87173q(z24);
                    } else {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R;
                        c28655q.m87173q(false);
                    }
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
                    boolean zM87157i6 = c28655q.m87157i(abstractC23864c);
                    if ((i15 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i6 | z17 | ((i15 & 112) == 32);
                    objM87133R2 = c28655q.m87133R();
                    if (z18) {
                        objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, coachOnboardingKey);
                    function2.invoke(Boolean.valueOf(m126915C(interfaceC28601c1M87260n).getDisplay()));
                    if (m126915C(interfaceC28601c1M87260n).getDisplay()) {
                        c28655q.m87150e0(624431514);
                        C39684f c39684fM126915C5 = m126915C(interfaceC28601c1M87260n);
                        zM87157i = c28655q.m87157i(abstractC23864c);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R3 = new C16825r(abstractC23864c, 6);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C16825r(abstractC23864c, 6);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i29 = ((i15 >> 6) & 112) | (i15 & 896) | ((i15 >> 3) & 7168);
                        modifier3 = modifier4;
                        z19 = z16;
                        m126918F(c39684fM126915C5, modifier3, betaText, z19, (InterfaceC4339a) objM87133R3, c28655q, i29, 0);
                        c28655q.m87173q(false);
                    } else {
                        modifier3 = modifier4;
                        z19 = z16;
                        c28655q.m87150e0(624694828);
                        c28655q.m87173q(false);
                    }
                    z15 = z19;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                }
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(coachOnboardingKey, str, betaText, modifier3, z15, function3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function2 = function1;
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39611k(5);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function2 = (Function1) objM87133R6;
                }
                c39684f = new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext7 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext7, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext7;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R4;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c39684f) | c28655q.m87153g(obj);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R5 = new C23863b(c39684f);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C23863b(c39684f);
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC23864c = (C23863b) objM87133R5;
                        z24 = false;
                        c28655q.m87173q(false);
                    } else {
                        z24 = false;
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z24);
                    c28655q.m87173q(z24);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
                }
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
                boolean zM87157i7 = c28655q.m87157i(abstractC23864c);
                if ((i15 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i7 | z17 | ((i15 & 112) == 32);
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, coachOnboardingKey);
                function2.invoke(Boolean.valueOf(m126915C(interfaceC28601c1M87260n).getDisplay()));
                if (m126915C(interfaceC28601c1M87260n).getDisplay()) {
                    c28655q.m87150e0(624431514);
                    C39684f c39684fM126915C6 = m126915C(interfaceC28601c1M87260n);
                    zM87157i = c28655q.m87157i(abstractC23864c);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C16825r(abstractC23864c, 6);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C16825r(abstractC23864c, 6);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i210 = ((i15 >> 6) & 112) | (i15 & 896) | ((i15 >> 3) & 7168);
                    modifier3 = modifier4;
                    z19 = z16;
                    m126918F(c39684fM126915C6, modifier3, betaText, z19, (InterfaceC4339a) objM87133R3, c28655q, i210, 0);
                    c28655q.m87173q(false);
                } else {
                    modifier3 = modifier4;
                    z19 = z16;
                    c28655q.m87150e0(624694828);
                    c28655q.m87173q(false);
                }
                z15 = z19;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(coachOnboardingKey, str, betaText, modifier3, z15, function3, i13, i14);
            }
        }
        i15 |= 24576;
        z13 = z4;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39611k(5);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function2 = (Function1) objM87133R6;
                }
                c39684f = new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext8 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext8, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext8;
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R4;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c39684f) | c28655q.m87153g(obj);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R5 = new C23863b(c39684f);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C23863b(c39684f);
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC23864c = (C23863b) objM87133R5;
                        z24 = false;
                        c28655q.m87173q(false);
                    } else {
                        z24 = false;
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z24);
                    c28655q.m87173q(z24);
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
                }
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
                boolean zM87157i8 = c28655q.m87157i(abstractC23864c);
                if ((i15 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i8 | z17 | ((i15 & 112) == 32);
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, coachOnboardingKey);
                function2.invoke(Boolean.valueOf(m126915C(interfaceC28601c1M87260n).getDisplay()));
                if (m126915C(interfaceC28601c1M87260n).getDisplay()) {
                    c28655q.m87150e0(624431514);
                    C39684f c39684fM126915C7 = m126915C(interfaceC28601c1M87260n);
                    zM87157i = c28655q.m87157i(abstractC23864c);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C16825r(abstractC23864c, 6);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C16825r(abstractC23864c, 6);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i211 = ((i15 >> 6) & 112) | (i15 & 896) | ((i15 >> 3) & 7168);
                    modifier3 = modifier4;
                    z19 = z16;
                    m126918F(c39684fM126915C7, modifier3, betaText, z19, (InterfaceC4339a) objM87133R3, c28655q, i211, 0);
                    c28655q.m87173q(false);
                } else {
                    modifier3 = modifier4;
                    z19 = z16;
                    c28655q.m87150e0(624694828);
                    c28655q.m87173q(false);
                }
                z15 = z19;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(coachOnboardingKey, str, betaText, modifier3, z15, function3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        if ((74899 & i15) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i24 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C39611k(5);
                    c28655q.m87172p0(objM87133R6);
                }
                function2 = (Function1) objM87133R6;
            }
            c39684f = new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj2 = null;
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext9 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext9, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext9;
                    zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, new C23863b(c39684f), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R4);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R4;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(c39684f) | c28655q.m87153g(obj);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = new C23863b(c39684f);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C23863b(c39684f);
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (C23863b) objM87133R5;
                    z24 = false;
                    c28655q.m87173q(false);
                } else {
                    z24 = false;
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z24);
                c28655q.m87173q(z24);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(c39684f) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c39684f, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38490b.class), null, null);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
                c28655q.m87173q(false);
            }
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), new C39684f(false, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
            boolean zM87157i9 = c28655q.m87157i(abstractC23864c);
            if ((i15 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zM87157i9 | z17 | ((i15 & 112) == 32);
            objM87133R2 = c28655q.m87133R();
            if (z18) {
                objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(abstractC23864c, coachOnboardingKey, str, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, coachOnboardingKey);
            function2.invoke(Boolean.valueOf(m126915C(interfaceC28601c1M87260n).getDisplay()));
            if (m126915C(interfaceC28601c1M87260n).getDisplay()) {
                c28655q.m87150e0(624431514);
                C39684f c39684fM126915C8 = m126915C(interfaceC28601c1M87260n);
                zM87157i = c28655q.m87157i(abstractC23864c);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C16825r(abstractC23864c, 6);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C16825r(abstractC23864c, 6);
                    c28655q.m87172p0(objM87133R3);
                }
                int i212 = ((i15 >> 6) & 112) | (i15 & 896) | ((i15 >> 3) & 7168);
                modifier3 = modifier4;
                z19 = z16;
                m126918F(c39684fM126915C8, modifier3, betaText, z19, (InterfaceC4339a) objM87133R3, c28655q, i212, 0);
                c28655q.m87173q(false);
            } else {
                modifier3 = modifier4;
                z19 = z16;
                c28655q.m87150e0(624694828);
                c28655q.m87173q(false);
            }
            z15 = z19;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(coachOnboardingKey, str, betaText, modifier3, z15, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m126914B(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final C39684f m126915C(InterfaceC28670t2 interfaceC28670t2) {
        return (C39684f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m126916D(AbstractC23864c abstractC23864c) {
        abstractC23864c.mo1216g(AbstractC38489a.b.f164903a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m126917E(String str, String str2, String str3, Modifier modifier, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m126913A(str, str2, str3, modifier, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    public static final void m126918F(C39684f viewState, Modifier modifier, String betaText, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        boolean z13;
        Modifier modifier2;
        boolean z14;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(betaText, "betaText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1742923285);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(betaText) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i15;
            if ((i16 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z13)) {
                if (i17 != 0) {
                    modifier = C2314t.f9131w;
                }
                Modifier modifier3 = modifier;
                boolean z15 = i18 == 0 ? z4 : false;
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C39681c(2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39685g();
                    c28655q2.m87172p0(objM87133R);
                }
                C39685g c39685g = (C39685g) objM87133R;
                boolean z16 = z15;
                m126922J(viewState.getHighlight(), c39685g, z16, AbstractC37817c.m121344e(-1864622660, c28655q2, new C1990b0(modifier3, viewState, c39685g, betaText, AbstractC39679a.m126911b(viewState.getHighlight()), interfaceC4339a2, 11)), c28655q2, ((i16 >> 3) & 896) | 3120);
                modifier2 = modifier3;
                z14 = z16;
                c28655q = c28655q2;
                interfaceC4339a3 = interfaceC4339a2;
            } else {
                c28655q2.m87138X();
                modifier2 = modifier;
                z14 = z4;
                c28655q = c28655q2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(viewState, modifier2, betaText, z14, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i15;
        if ((i16 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z13)) {
            if (i17 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier4 = modifier;
            if (i18 == 0) {
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C39681c(2);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C39685g();
                c28655q2.m87172p0(objM87133R);
            }
            C39685g c39685g2 = (C39685g) objM87133R;
            boolean z17 = z15;
            m126922J(viewState.getHighlight(), c39685g2, z17, AbstractC37817c.m121344e(-1864622660, c28655q2, new C1990b0(modifier4, viewState, c39685g2, betaText, AbstractC39679a.m126911b(viewState.getHighlight()), interfaceC4339a2, 11)), c28655q2, ((i16 >> 3) & 896) | 3120);
            modifier2 = modifier4;
            z14 = z17;
            c28655q = c28655q2;
            interfaceC4339a3 = interfaceC4339a2;
        } else {
            c28655q2.m87138X();
            modifier2 = modifier;
            z14 = z4;
            c28655q = c28655q2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33795i(viewState, modifier2, betaText, z14, interfaceC4339a3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m126919G() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m126920H(Modifier modifier, C39684f c39684f, C39685g c39685g, String str, EnumC10952d1 enumC10952d1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m126936X(modifier, c39684f, c39685g, str, enumC10952d1, interfaceC4339a, c28655q, 384);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m126921I(C39684f c39684f, Modifier modifier, String str, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m126918F(c39684f, modifier, str, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final void m126922J(CoachOnboardingHighlightID coachOnboardingHighlightID, C39685g c39685g, boolean z4, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-698700020);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(coachOnboardingHighlightID == null ? -1 : coachOnboardingHighlightID.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c39685g) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            c28655q.m87138X();
        } else if (coachOnboardingHighlightID != null) {
            c28655q.m87150e0(-1560563890);
            AbstractC10956f.m29052d(AbstractC39679a.m126910a(coachOnboardingHighlightID, c39685g, c28655q, i14 & 126), (float) 2.5d, false, !z4, null, false, interfaceC4351m, c28655q, ((i14 << 9) & 3670016) | 48, 52);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1560211203);
            AbstractC11895b.m32007z((i14 >> 9) & 14, interfaceC4351m, c28655q, false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31755w(i13, 13, coachOnboardingHighlightID, c39685g, interfaceC4351m, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m126923K(CoachOnboardingHighlightID coachOnboardingHighlightID, C39685g c39685g, boolean z4, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m126922J(coachOnboardingHighlightID, c39685g, z4, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final void m126924L(InterfaceC23001u interfaceC23001u, C39684f c39684f, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2046800554);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c39684f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC22953f.m66714a(interfaceC23001u.mo3400a(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), C2299e.f9114w), null, false, AbstractC37817c.m121344e(-1144766336, c28655q, new C39682d(c39684f, interfaceC4339a, 1)), c28655q, 3072, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(interfaceC23001u, c39684f, interfaceC4339a, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m126925M(C39684f c39684f, InterfaceC4339a interfaceC4339a, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 4;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), C2299e.f9114w), 8 * f13, 0.0f, 2), 0.0f, ((C1101c) BoxWithConstraints).m3402c() * 0.4f, 0.0f, 16 * f13, 5);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            boolean zM87153g = c28655q.m87153g(c39684f.m126981e());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC11895b.m32005x(0, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(c39684f.m126981e());
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.valueOf(c39684f.getSkipTypewriterAnimation()));
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            AbstractC16300g.m46209n(new HorizontalAlignElement(c2305k), C2299e.f9117z, null, 7 * f13, 0.0f, false, null, null, c28655q, 3120, 244);
            List<TextResource> listM126981e = c39684f.m126981e();
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C39611k(3);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC1089a.m3344b(listM126981e, null, (Function1) objM87133R3, null, null, null, AbstractC37817c.m121344e(-1920149779, c28655q, new C3403f(c39684f, interfaceC28601c1, interfaceC28601c2, interfaceC4339a, 9)), c28655q, 1573248, 58);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final int m126926N(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: O */
    private static final void m126927O(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: P */
    private static final boolean m126928P(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    private static final void m126929Q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C3756l0 m126930R(InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return AbstractC1089a.m3345c(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, null, 6), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m126931S(C39684f c39684f, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC4339a interfaceC4339a, InterfaceC3764o AnimatedContent, List lines, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28676v0 c28676v0;
        Object c0073h;
        C28655q c28655q2;
        Composer composer2 = composer;
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        AbstractC22676k.m65750j(lines, "lines");
        C22957g c22957g = AbstractC22977m.f90652c;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, composer2, 0);
        C28655q c28655q3 = (C28655q) composer2;
        int iHashCode = Long.hashCode(c28655q3.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q3.f115906a;
        c28655q3.m87158i0();
        if (c28655q3.f115903S) {
            c28655q3.m87163l(c0213j);
        } else {
            c28655q3.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(composer2, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(composer2, c0209i4, modifierM118962N);
        boolean zM126983g = c39684f.getSkipTypewriterAnimation();
        C28676v0 c28676v1 = C28635l.f115821a;
        if (zM126983g) {
            c28655q3.m87150e0(-1120170205);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, composer2, 48);
            C28676v0 c28676v2 = c28676v1;
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(composer2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(composer2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(composer2, c0209i4, modifierM118962N2);
            c28655q3.m87150e0(-118389953);
            for (Iterator it = lines.iterator(); it.hasNext(); it = it) {
                String strM21274h = AbstractC8693b.m21274h((TextResource) it.next(), composer2, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(composer2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(composer2, i15).getT4(), null, composer, 0, C2886a.f11498d << 18, 196090);
                c28655q3 = c28655q3;
                composer2 = composer;
                c28676v2 = c28676v2;
            }
            C28655q c28655q4 = c28655q3;
            AbstractC25012a.m73392y(c28655q4, false, true, false);
            c28655q = c28655q4;
            i14 = 0;
            c28676v0 = c28676v2;
        } else {
            i14 = 0;
            c28655q3.m87150e0(-1119508479);
            TextResource textResource = (TextResource) AbstractC25265s.m74102I0(m126926N(interfaceC28601c1), lines);
            if (textResource != null) {
                c28655q3.m87150e0(-1119312156);
                C38072d c38072d2 = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                C2886a c2886aM8419Q = c38072d2.m121952e(composer2, i16).getT4();
                long jM125430y = c38072d2.m121949b(composer2, i16).getBrandWhite();
                boolean zM87153g = c28655q3.m87153g(interfaceC28601c1) | c28655q3.m87157i(lines) | c28655q3.m87153g(interfaceC28601c2) | c28655q3.m87157i(c39684f) | c28655q3.m87153g(interfaceC4339a);
                Object objM87133R = c28655q3.m87133R();
                if (zM87153g || objM87133R == c28676v1) {
                    c28655q2 = c28655q3;
                    c0073h = new C0073h(lines, c39684f, interfaceC4339a, interfaceC28601c1, interfaceC28601c2, 26);
                    c28655q2.m87172p0(c0073h);
                } else {
                    c28655q2 = c28655q3;
                    c0073h = objM87133R;
                }
                c28676v0 = c28676v1;
                c28655q = c28655q2;
                AbstractC39687i.m126999c(textResource, null, c2886aM8419Q, jM125430y, 5, 10L, 500L, (InterfaceC4339a) c0073h, composer2, 1769472 | TextResource.$stable | (C2886a.f11498d << 6), 2);
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q3;
                c28676v0 = c28676v1;
                c28655q.m87150e0(-1118148385);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }
        boolean z4 = (c39684f.getButtonTitle() == null || !m126928P(interfaceC28601c2)) ? i14 : 1;
        C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, i14, null, 6);
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C39611k(4);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC1090b.m3350e(C23016z.f90757a, z4, null, AbstractC3788w0.m11587o(c11347e2M30574v, (Function1) objM87133R2).m11562a(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, i14, null, 6), 2)), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, i14, null, 6), 2), null, AbstractC37817c.m121344e(914790459, composer2, new C39682d(c39684f, interfaceC4339a, 0)), composer2, 1597446, 18);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m126932T(List list, C39684f c39684f, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        if (m126926N(interfaceC28601c1) < list.size() - 1) {
            m126927O(interfaceC28601c1, m126926N(interfaceC28601c1) + 1);
        } else {
            m126929Q(interfaceC28601c2, true);
            if (c39684f.getAutoAdvance()) {
                interfaceC4339a.invoke();
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final int m126933U(int i13) {
        return i13 / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m126934V(C39684f c39684f, InterfaceC4339a interfaceC4339a, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        float f13 = 3;
        float f14 = 8;
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(f13 * f14, c2314t));
        float f15 = 4;
        Modifier modifierM3425v = AbstractC1102d.m3425v(c2314t, 32 * f15, 0.0f, 2);
        float f16 = 2 * f14;
        float f17 = f13 * f15;
        C22976l1 c22976l1 = new C22976l1(f16, f17, f16, f17);
        C2886a c2886aM8438s = C38072d.f163053a.m121952e(composer, C38072d.f163054b).getH5();
        TextResource textResourceM126978b = c39684f.getButtonTitle();
        if (textResourceM126978b == null) {
            textResourceM126978b = AbstractC8693b.m21278l("");
        }
        AbstractC27292z.m82343j(modifierM3425v, false, false, null, null, null, textResourceM126978b, null, null, null, f17, c22976l1, c2886aM8438s, interfaceC4339a, composer, (TextResource.$stable << 18) | 390, (C2886a.f11498d << 6) | 54, 954);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m126935W(InterfaceC23001u interfaceC23001u, C39684f c39684f, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m126924L(interfaceC23001u, c39684f, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0217  */
    /* JADX WARN: Code duplicated, block: B:88:0x0236  */
    /* JADX WARN: Code duplicated, block: B:90:0x0243  */
    /* JADX INFO: renamed from: X */
    private static final void m126936X(Modifier modifier, C39684f c39684f, C39685g c39685g, String str, EnumC10952d1 enumC10952d1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        int i15;
        C0209i c0209i;
        boolean z4;
        int i16;
        C1100b c1100b;
        int iHashCode;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-685286132);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c39684f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(c39685g) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87149e(enumC10952d1.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier);
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifierM3357b = AbstractC1092a.m3357b(modifierM3407d, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i17).getBlack20()), new C17919x(c38072d.m121949b(c28655q, i17).getBlack70())), 0.0f, 0.0f, 14), null, 0.0f, 6);
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C39680b(c39685g, 0);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM29065q = AbstractC10956f.m29065q(modifierM3357b, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM29065q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S) {
                i15 = i14;
            } else {
                i15 = i14;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                if (c39684f.getIsLoading()) {
                    c28655q.m87150e0(1273158489);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                    z4 = true;
                    AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC28054a.f113202d), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    z4 = true;
                    if (c39684f.m126981e().isEmpty()) {
                        c28655q.m87150e0(1274050576);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1273637997);
                        i16 = i15 >> 6;
                        m126952g0(c39685g, str, c28655q, i16 & 126);
                        c1100b = C1100b.f4583a;
                        m126924L(c1100b, c39684f, interfaceC4339a, c28655q, 6 | (i15 & 112) | ((i15 >> 9) & 896));
                        if (c39684f.getShowBottomBar()) {
                            c28655q.m87150e0(1273788440);
                            m126940a0(c1100b, c39685g, enumC10952d1, c39684f.getHighlight(), c28655q, 6 | ((i15 >> 3) & 112) | (i16 & 896));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1274026768);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z4);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
            if (c39684f.getIsLoading()) {
                c28655q.m87150e0(1273158489);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
                z4 = true;
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC28054a.f113202d), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                z4 = true;
                if (c39684f.m126981e().isEmpty()) {
                    c28655q.m87150e0(1273637997);
                    i16 = i15 >> 6;
                    m126952g0(c39685g, str, c28655q, i16 & 126);
                    c1100b = C1100b.f4583a;
                    m126924L(c1100b, c39684f, interfaceC4339a, c28655q, 6 | (i15 & 112) | ((i15 >> 9) & 896));
                    if (c39684f.getShowBottomBar()) {
                        c28655q.m87150e0(1273788440);
                        m126940a0(c1100b, c39685g, enumC10952d1, c39684f.getHighlight(), c28655q, 6 | ((i15 >> 3) & 112) | (i16 & 896));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1274026768);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1274050576);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(modifier, c39684f, c39685g, str, enumC10952d1, interfaceC4339a, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m126937Y(C39685g c39685g, C16618c it) {
        AbstractC22676k.m65750j(it, "it");
        c39685g.m126995k(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m126938Z(Modifier modifier, C39684f c39684f, C39685g c39685g, String str, EnumC10952d1 enumC10952d1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m126936X(modifier, c39684f, c39685g, str, enumC10952d1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private static final void m126940a0(InterfaceC23001u interfaceC23001u, C39685g c39685g, EnumC10952d1 enumC10952d1, CoachOnboardingHighlightID coachOnboardingHighlightID, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(593896402);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c39685g) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(enumC10952d1.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87149e(coachOnboardingHighlightID == null ? -1 : coachOnboardingHighlightID.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            boolean z4 = coachOnboardingHighlightID == CoachOnboardingHighlightID.IMAGE_UPLOAD_HIGHLIGHT;
            int i15 = i14 & 112;
            boolean z13 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C39680b(c39685g, 3);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM126912c = AbstractC39679a.m126912c(c2314t, z4, (Function1) objM87133R);
            boolean z14 = coachOnboardingHighlightID == CoachOnboardingHighlightID.INPUT_BAR_HIGHLIGHT || coachOnboardingHighlightID == CoachOnboardingHighlightID.ASK_A_QUESTION_HIGHLIGHT;
            boolean z15 = i15 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39680b(c39685g, 4);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM126912c2 = AbstractC39679a.m126912c(c2314t, z14, (Function1) objM87133R2);
            boolean z16 = coachOnboardingHighlightID == CoachOnboardingHighlightID.VOICE_TO_TEXT_HIGHLIGHT;
            boolean z17 = i15 == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z17 || objM87133R3 == c28676v0) {
                objM87133R3 = new C39680b(c39685g, 5);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM126912c3 = AbstractC39679a.m126912c(c2314t, z16, (Function1) objM87133R3);
            Modifier modifierM66722k = AbstractC22953f.m66722k(interfaceC23001u.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t), C2299e.f9105H));
            float f13 = 5 * 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM66722k, f13, f13);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C39681c(3);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3395q, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R5, 28);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC10959g.m29081h(null, modifierM126912c, modifierM126912c2, modifierM126912c3, enumC10952d1, c28655q, (i14 << 6) & 57344, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39277j(interfaceC23001u, c39685g, enumC10952d1, coachOnboardingHighlightID, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m126942b0(C39685g c39685g, C16618c it) {
        AbstractC22676k.m65750j(it, "it");
        c39685g.m126993i(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m126944c0(C39685g c39685g, C16618c it) {
        AbstractC22676k.m65750j(it, "it");
        c39685g.m126994j(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m126946d0(C39685g c39685g, C16618c it) {
        AbstractC22676k.m65750j(it, "it");
        c39685g.m126996l(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m126948e0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m126950f0(InterfaceC23001u interfaceC23001u, C39685g c39685g, EnumC10952d1 enumC10952d1, CoachOnboardingHighlightID coachOnboardingHighlightID, int i13, Composer composer, int i14) {
        m126940a0(interfaceC23001u, c39685g, enumC10952d1, coachOnboardingHighlightID, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g0 */
    private static final void m126952g0(C39685g c39685g, String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1198388808);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(c39685g) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 2 * 8, 0.0f, 10, 0.0f, 10);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            int i15 = i14 & 14;
            boolean z4 = i15 == 4;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C39680b(c39685g, 1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM29065q = AbstractC10956f.m29065q(c2314t, (Function1) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C39681c(0);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM29065q, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R3, 28);
            C2307m c2307m = C2299e.f9114w;
            int i16 = i14;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3360e);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC10944b.m29032h(str, c28655q, (i16 >> 3) & 14);
            c28655q.m87173q(true);
            boolean z13 = i15 == 4;
            Object objM87133R4 = c28655q.m87133R();
            if (z13 || objM87133R4 == c28676v0) {
                objM87133R4 = new C39680b(c39685g, 2);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM29065q2 = AbstractC10956f.m29065q(c2314t, (Function1) objM87133R4);
            float f13 = 4;
            Modifier modifierM3394p = AbstractC1099a.m3394p(6, AbstractC18489d0.m53364e(modifierM29065q2, f13, f13));
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R5;
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C39681c(1);
                c28655q.m87172p0(objM87133R6);
            }
            Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM3394p, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R6, 28);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3360e2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC16306j.m46276r(AbstractC34132o.m107874S(AbstractC37335a.f159600b, c28655q, 6), 0.0f, EnumC16302h.NONE, false, null, null, c28655q, 384, 58);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(c39685g, str, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m126954h0(C39685g c39685g, C16618c it) {
        AbstractC22676k.m65750j(it, "it");
        c39685g.m126991g(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m126956i0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m126958j0(C39685g c39685g, C16618c it) {
        AbstractC22676k.m65750j(it, "it");
        c39685g.m126992h(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m126960k0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m126962l0(C39685g c39685g, String str, int i13, Composer composer, int i14) {
        m126952g0(c39685g, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
