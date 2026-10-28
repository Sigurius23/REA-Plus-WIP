package z72;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b01.C2183d;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.sanguine.domain.models.SanguineWaitlistFooter;
import d11.C11467b;
import d11.C11474i;
import dc0.C11901c;
import e93.AbstractC12889b;
import ej1.C13258u;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import h51.C16934f;
import hy0.C17736e;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import ow2.C28442e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11329a0;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C23010x;
import p331n2.AbstractC26165a;
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
import p634y1.AbstractC39038k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p713jm0.C21788c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import q11.AbstractC29791a;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r72.AbstractC31054a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tg2.C33795i;
import ud0.C34789b;
import uv0.AbstractC35283c;
import v71.C35766g;
import v72.AbstractC35773d;
import w71.C36891k;
import w72.AbstractC36914g;
import w72.C36908a;
import w72.C36913f;
import w72.InterfaceC36912e;
import wb3.AbstractC37056f;
import x30.C37894h1;
import x72.C38043a;
import x81.C38072d;
import y71.C39274g;
import y72.AbstractC39285a;
import yb0.C39382e;
import yb3.AbstractC39414r;
import yk2.C39609i;
import yo0.C39681c;
import yz1.C39913g;

/* JADX INFO: renamed from: z72.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\u001aS\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001aa\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aW\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a[\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001aO\u0010#\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020!H\u0003¢\u0006\u0004\b(\u0010)\u001a?\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b,\u0010-\"\u0014\u0010/\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00103\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101\"\u0014\u00106\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u00108\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00105¨\u0006<²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u000e\u00109\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010:\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010;\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lw72/f;", "viewModel", "", "source", "", "signUpOnEntry", "Lkotlin/Function1;", "Lr72/a;", "Ll83/a0;", "onAnalyticsEvent", "Lv72/d;", "onNavigationEvent", "j0", "(Lw72/f;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lw72/g;", "viewState", "Lw72/e;", "onEvent", "k0", "(Lw72/g;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lw72/g$c;", "P", "(Lw72/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;", "footer", "Ly3/f;", "onHeightMeasured", "H", "(Landroidx/compose/ui/Modifier;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Li2/x;", "barColor", "", "barAlpha", "L", "(Lw72/g$c;JFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "imageSource", "alpha", "F", "(Lkd1/o;FLandroidx/compose/runtime/Composer;I)V", "", NotificationCompat.CATEGORY_EVENT, "A0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "backgroundImageGapHeight", "b", "J", "c", "footerColor", "d", "Ljava/lang/String;", "CTA_UPGRADE", "e", "CTA_INVITE", "hasViewBloodworkEventAlreadySent", "barHeight", "footerHeight", "sanguine_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40161g {

    /* JADX INFO: renamed from: a */
    private static final float f173295a = 120;

    /* JADX INFO: renamed from: b */
    private static final long f173296b = AbstractC17918w0.m51517e(4280824633L);

    /* JADX INFO: renamed from: c */
    private static final long f173297c = AbstractC17918w0.m51517e(4279244056L);

    /* JADX INFO: renamed from: d */
    private static final String f173298d = "UPGRADE";

    /* JADX INFO: renamed from: e */
    private static final String f173299e = "INVITE";

    /* JADX INFO: renamed from: z72.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.view.SanguineWaitlistScreenKt$SanguineContent$3$4$1", m100430f = "SanguineWaitlistScreen.kt", m100431l = {266}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173300w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC36914g.c f173301x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f173302y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC36914g.c cVar, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173301x = cVar;
            this.f173302y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f173301x, this.f173302y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173300w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long jM105315h = ((AbstractC33208p0.h) this.f173301x.getWaitlistJoinModalState()).getDisplayTimeMs();
                this.f173300w = 1;
                if (AbstractC3034m0.m8782b(jM105315h, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f173302y.invoke(InterfaceC36912e.a.f157926a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z72.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.view.SanguineWaitlistScreenKt$SanguineContent$3$5$2$1", m100430f = "SanguineWaitlistScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173303w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f173304x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173304x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f173304x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173303w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f173304x.invoke(AbstractC31054a.i.f128060a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z72.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.view.SanguineWaitlistScreenKt$SanguineWaitlistScreen$11$1", m100430f = "SanguineWaitlistScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173305w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f173306x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173306x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f173306x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173305w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f173306x.invoke(AbstractC31054a.a.f128050a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z72.g$d */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.view.SanguineWaitlistScreenKt$SanguineWaitlistScreen$13$1", m100430f = "SanguineWaitlistScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f173307E;

        /* JADX INFO: renamed from: w */
        int f173308w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC36914g f173309x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f173310y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f173311z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC36914g abstractC36914g, InterfaceC28601c1 interfaceC28601c1, Function1 function1, String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173309x = abstractC36914g;
            this.f173310y = interfaceC28601c1;
            this.f173311z = function1;
            this.f173307E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f173309x, this.f173310y, this.f173311z, this.f173307E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C36908a c36908aM118539d;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173308w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC40161g.m128842o0(this.f173310y) && (c36908aM118539d = ((AbstractC36914g.c) this.f173309x).getAnalyticsInfo()) != null) {
                Function1 function1 = this.f173311z;
                String str = this.f173307E;
                InterfaceC28601c1 interfaceC28601c1 = this.f173310y;
                function1.invoke(new AbstractC31054a.h(str, c36908aM118539d.getOnWaitlist(), c36908aM118539d.getViewedLabel()));
                AbstractC40161g.m128844p0(interfaceC28601c1, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z72.g$e */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.view.SanguineWaitlistScreenKt$SanguineWaitlistScreen$3$1", m100430f = "SanguineWaitlistScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173312w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36913f f173313x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C36913f c36913f, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173313x = c36913f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f173313x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173312w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f173313x.m118536l(InterfaceC36912e.c.f157928a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z72.g$f */
    @InterfaceC32271e(m100429c = "com.whoop.sanguine.view.SanguineWaitlistScreenKt$SanguineWaitlistScreen$4$1", m100430f = "SanguineWaitlistScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C36913f f173314E;

        /* JADX INFO: renamed from: w */
        int f173315w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f173316x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f173317y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f173318z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, Function1 function1, String str, C36913f c36913f, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173316x = z4;
            this.f173317y = function1;
            this.f173318z = str;
            this.f173314E = c36913f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f173316x, this.f173317y, this.f173318z, this.f173314E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f173315w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f173316x) {
                this.f173317y.invoke(new AbstractC31054a.b(this.f173318z));
                this.f173314E.m118536l(InterfaceC36912e.b.f157927a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m128787A0(Object event, Function1 onNavigationEvent, Function1 onAnalyticsEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        if (event instanceof C9598e) {
            onNavigationEvent.invoke(new AbstractC35773d.c((C9598e) event));
            return;
        }
        if (event instanceof AbstractC29791a.a) {
            onNavigationEvent.invoke(new AbstractC35773d.c(((AbstractC29791a.a) event).getNavigationAction()));
            return;
        }
        if (event instanceof ArticleTileModelEvent.Url) {
            ArticleTileModelEvent.Url url = (ArticleTileModelEvent.Url) event;
            onAnalyticsEvent.invoke(new AbstractC31054a.d(url.getTitle()));
            onNavigationEvent.invoke(new AbstractC35773d.a(url));
            return;
        }
        if (event instanceof AbstractC29791a.b) {
            AbstractC29791a.b bVar = (AbstractC29791a.b) event;
            if (bVar.getIsExpanded()) {
                onAnalyticsEvent.invoke(new AbstractC31054a.e(bVar.getIndex()));
                return;
            }
            return;
        }
        if (!(event instanceof C11474i)) {
            if (event instanceof C2183d) {
                onAnalyticsEvent.invoke(AbstractC31054a.g.f128056a);
                onNavigationEvent.invoke(new AbstractC35773d.c(((C2183d) event).getNavigationAction()));
                return;
            }
            return;
        }
        C11474i c11474i = (C11474i) event;
        C11467b c11467bM30826o = c11474i.getCtaButtonInformation();
        if (c11467bM30826o != null) {
            if (AbstractC39414r.m125876U(AbstractC8693b.m21268b(c11467bM30826o.getText()), f173298d, false)) {
                onAnalyticsEvent.invoke(AbstractC31054a.f.f128055a);
            } else if (AbstractC39414r.m125876U(AbstractC8693b.m21268b(c11467bM30826o.getText()), f173299e, false)) {
                onAnalyticsEvent.invoke(AbstractC31054a.c.f128052a);
            }
        }
        C9598e c9598eM30835x = c11474i.getNavigationAction();
        if (c9598eM30835x != null) {
            onNavigationEvent.invoke(new AbstractC35773d.c(c9598eM30835x));
        }
    }

    /* JADX INFO: renamed from: F */
    private static final void m128792F(AbstractC22403o abstractC22403o, float f13, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-396376225);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM7154a = AbstractC2294a.m7154a(0.0f, AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM7154a);
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
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i14 & 14), 3);
            abstractC22403o2 = abstractC22403o;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC34132o.m107879c(f13, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x)), null, C39102j.f168202d, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40159e(abstractC22403o2, f13, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m128793G(AbstractC22403o abstractC22403o, float f13, int i13, Composer composer, int i14) {
        m128792F(abstractC22403o, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: H */
    private static final void m128794H(Modifier modifier, SanguineWaitlistFooter sanguineWaitlistFooter, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13) {
        Modifier modifier2;
        int i14;
        C28655q c28655q;
        Function1 function4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1771090719);
        if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i14 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(sanguineWaitlistFooter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(function3) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            float f13 = 32;
            int i15 = i14;
            Modifier modifierM7154a = AbstractC2294a.m7154a(2.0f, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(modifier2, 0.0f, f13, 0.0f, 0.0f, 13)));
            C17909s c17909s = AbstractC17911t.f69612b;
            C23465k c23465k = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
            Float fValueOf = Float.valueOf(0.2f);
            long j7 = f173297c;
            Modifier modifierM3357b = AbstractC1092a.m3357b(modifierM7154a, C17909s.m51494l(c17909s, new C23465k[]{c23465k, new C23465k(fValueOf, new C17919x(j7)), new C23465k(Float.valueOf(1.0f), new C17919x(j7))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
            boolean zM87153g = c28655q2.m87153g(interfaceC39171c) | ((57344 & i15) == 16384);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C21788c(interfaceC39171c, function3, 2);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3357b, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3500d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(f13, AbstractC1102d.m3409f(1.0f, c2314t)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), C2299e.f9111N, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            String descriptionText = sanguineWaitlistFooter.getDescriptionText();
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            boolean z4 = false;
            AbstractC30795n.m94707h(descriptionText, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 8, 0.0f, 2), c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q2, 48, C2886a.f11498d << 18, 196088);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(sanguineWaitlistFooter.getButtonText());
            boolean z13 = (i15 & 896) == 256;
            if ((i15 & 7168) == 2048) {
                z4 = true;
            }
            boolean z14 = z13 | z4;
            Object objM87133R2 = c28655q2.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                function4 = function1;
                objM87133R2 = new C11901c(function4, 24, function2);
                c28655q2.m87172p0(objM87133R2);
            } else {
                function4 = function1;
            }
            AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, (TextResource.$stable << 18) | 6, 0, 8126);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            function4 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34789b(modifier, sanguineWaitlistFooter, function4, function2, function3, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m128795I(InterfaceC39171c interfaceC39171c, Function1 function1, InterfaceC39147y layoutCoordinates) {
        AbstractC22676k.m65750j(layoutCoordinates, "layoutCoordinates");
        function1.invoke(new C39174f(interfaceC39171c.mo733e0((int) (layoutCoordinates.mo3541n() & 4294967295L))));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m128796J(Function1 function1, Function1 function2) {
        function1.invoke(new AbstractC31054a.b("bloodwork_details"));
        function2.invoke(InterfaceC36912e.b.f157927a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m128797K(Modifier modifier, SanguineWaitlistFooter sanguineWaitlistFooter, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m128794H(modifier, sanguineWaitlistFooter, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final void m128798L(final AbstractC36914g.c cVar, final long j7, final float f13, Function1 function1, final Function1 function2, Composer composer, final int i13) {
        int i14;
        final Function1 function3 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1516031577);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            c28655q.m87150e0(912440985);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            float fMo733e0 = interfaceC39171c.mo733e0(C22949e.m66712e(c28655q).f90559f.m66705e().f151450b);
            c28655q.m87173q(false);
            C2314t c2314t = C2314t.f9131w;
            int i15 = i14;
            Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC1099a.m3398t(AbstractC2294a.m7154a(2.0f, AbstractC1102d.m3409f(1.0f, c2314t)), 0.0f, 0.0f, 0.0f, 16, 7), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(f13, j7))), new C23465k(Float.valueOf(0.85f), new C17919x(C17919x.m51541c(f13, j7))), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
            boolean zM87153g = c28655q.m87153g(interfaceC39171c) | ((i15 & 57344) == 16384);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C21788c(interfaceC39171c, function2, 1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3357b, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3500d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(fMo733e0, c2314t));
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(C2299e.f9111N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(cVar.getHeaderText(), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC35283c.f150167E)), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            boolean z4 = (i15 & 7168) == 2048;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                function3 = function1;
                objM87133R2 = new C39609i(function3, 22);
                c28655q.m87172p0(objM87133R2);
            } else {
                function3 = function1;
            }
            AbstractC6719b.m20143d(horizontalAlignElement, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z72.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40161g.m128801O(cVar, j7, f13, function3, function2, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m128799M(InterfaceC39171c interfaceC39171c, Function1 function1, InterfaceC39147y layoutCoordinates) {
        AbstractC22676k.m65750j(layoutCoordinates, "layoutCoordinates");
        function1.invoke(new C39174f(interfaceC39171c.mo733e0((int) (layoutCoordinates.mo3541n() & 4294967295L))));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m128800N(Function1 function1) {
        function1.invoke(AbstractC35773d.b.f152139a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m128801O(AbstractC36914g.c cVar, long j7, float f13, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m128798L(cVar, j7, f13, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0271  */
    /* JADX WARN: Code duplicated, block: B:101:0x0275  */
    /* JADX WARN: Code duplicated, block: B:103:0x0278  */
    /* JADX WARN: Code duplicated, block: B:113:0x029b  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:120:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:128:0x031a  */
    /* JADX WARN: Code duplicated, block: B:129:0x031d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0325  */
    /* JADX WARN: Code duplicated, block: B:133:0x0328  */
    /* JADX WARN: Code duplicated, block: B:136:0x0330 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0338  */
    /* JADX WARN: Code duplicated, block: B:143:0x038e  */
    /* JADX WARN: Code duplicated, block: B:144:0x039c  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:154:0x0407  */
    /* JADX WARN: Code duplicated, block: B:156:0x041b  */
    /* JADX WARN: Code duplicated, block: B:157:0x041e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x0428  */
    /* JADX WARN: Code duplicated, block: B:163:0x0439  */
    /* JADX WARN: Code duplicated, block: B:166:0x0448  */
    /* JADX WARN: Code duplicated, block: B:167:0x0455  */
    /* JADX WARN: Code duplicated, block: B:169:0x0467  */
    /* JADX WARN: Code duplicated, block: B:170:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:172:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:174:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:175:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:178:0x04c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:181:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:183:0x0503  */
    /* JADX WARN: Code duplicated, block: B:185:0x050f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0511  */
    /* JADX WARN: Code duplicated, block: B:189:0x0518 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x051a  */
    /* JADX WARN: Code duplicated, block: B:193:0x0542  */
    /* JADX WARN: Code duplicated, block: B:194:0x0544  */
    /* JADX WARN: Code duplicated, block: B:197:0x054d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x054f  */
    /* JADX WARN: Code duplicated, block: B:201:0x055e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0560  */
    /* JADX WARN: Code duplicated, block: B:205:0x0567 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0569  */
    /* JADX WARN: Code duplicated, block: B:209:0x0579  */
    /* JADX WARN: Code duplicated, block: B:210:0x057b  */
    /* JADX WARN: Code duplicated, block: B:213:0x0582 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x0584  */
    /* JADX WARN: Code duplicated, block: B:216:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:218:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:219:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:222:0x060a  */
    /* JADX WARN: Code duplicated, block: B:225:0x0616  */
    /* JADX WARN: Code duplicated, block: B:227:0x0363 A[EDGE_INSN: B:227:0x0363->B:141:0x0363 BREAK  A[LOOP:0: B:96:0x025f->B:140:0x0344], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:75:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:81:0x0193  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:88:0x021c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0220  */
    /* JADX WARN: Code duplicated, block: B:92:0x022d  */
    /* JADX WARN: Code duplicated, block: B:94:0x023b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0266  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: P */
    public static final void m128802P(AbstractC36914g.c viewState, Function1 onAnalyticsEvent, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        Function1 function3;
        int i15;
        Function1 function4;
        int i16;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        C13821r1 c13821r1M92099U;
        InterfaceC39171c interfaceC39171c;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87153g;
        Object objM87133R3;
        InterfaceC28670t2 interfaceC28670t2;
        boolean zM87147d;
        Object objM87133R4;
        boolean z13;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Object objM87133R5;
        int i18;
        int i19;
        int i24;
        C28676v0 c28676v1;
        Function1 function9;
        C28655q c28655q;
        int iHashCode2;
        Iterator it;
        boolean z14;
        C28676v0 c28676v2;
        SanguineWaitlistFooter sanguineWaitlistFooterM118540e;
        Object objM87133R6;
        AbstractC33208p0 abstractC33208p0M118544i;
        Modifier modifierM7154a;
        boolean z15;
        ?? r10;
        Object objM87133R7;
        ?? r14;
        ?? r15;
        Object objM87133R8;
        int i25;
        ?? r16;
        Object objM87133R9;
        ?? r17;
        Object objM87133R10;
        ?? r18;
        Object objM87133R11;
        ?? r19;
        ?? r24;
        Object objM87133R12;
        InterfaceC25312u interfaceC25312u;
        C38043a c38043a;
        boolean z16;
        Object objM87133R13;
        C28676v0 c28676v3;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i4;
        int i26;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R14;
        boolean z24;
        List<InterfaceC25312u> listM121804b;
        Object objM87133R15;
        Object objM87133R16;
        ?? r25;
        ?? r26;
        ?? r27;
        ?? r28;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1448725347);
        int i27 = (i13 & 6) == 0 ? (c28655q2.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i27 |= c28655q2.m87157i(onAnalyticsEvent) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i27 |= c28655q2.m87157i(function3) ? 256 : 128;
            }
            i15 = i14 & 8;
            if (i15 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i27 |= i16;
                }
                i17 = 0;
                if ((i27 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i27 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R16 = c28655q2.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C39913g(25);
                            c28655q2.m87172p0(objM87133R16);
                        }
                        function7 = (Function1) objM87133R16;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C39913g(26);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        function8 = (Function1) objM87133R15;
                    } else {
                        function8 = function4;
                    }
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(new C39174f(85));
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(new C39174f(160));
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    zM87153g = c28655q2.m87153g(c13821r1M92099U);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g || objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, i17));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                    zM87147d = c28655q2.m87147d(m128830i0(interfaceC28670t2));
                    objM87133R4 = c28655q2.m87133R();
                    z13 = true;
                    if (zM87147d || objM87133R4 == c28676v0) {
                        objM87133R4 = Float.valueOf(AbstractC11329a0.f36295d.mo7226i(1.0f - m128830i0(interfaceC28670t2)));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    float fFloatValue = ((Number) objM87133R4).floatValue();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44028b0);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                    C0209i c0209i5 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0209i3 = c0209i;
                    } else {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i6 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
                        m128792F(viewState.getHeaderImage(), fFloatValue, c28655q2, AbstractC22403o.f87638a);
                        long j7 = f173296b;
                        float fM128830i0 = m128830i0(interfaceC28670t2);
                        objM87133R5 = c28655q2.m87133R();
                        i18 = 12;
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39382e(i18, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        int i29 = i27 & 7168;
                        C0209i c0209i7 = c0209i3;
                        i19 = i29;
                        i24 = i27;
                        c28676v1 = c28676v0;
                        m128798L(viewState, j7, fM128830i0, function8, (Function1) objM87133R5, c28655q2, (i27 & 14) | 24624 | i29);
                        function9 = function8;
                        c28655q = c28655q2;
                        Modifier modifierM7154a2 = AbstractC2294a.m7154a(1.0f, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), c13821r1M92099U, 14));
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), c2305k, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM7154a2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f173295a + m128820d0(interfaceC28601c1), c2314t));
                        c28655q.m87150e0(509639880);
                        it = viewState.m118543h().iterator();
                        while (true) {
                            Object obj = null;
                            r28 = 0;
                            r27 = 0;
                            r26 = 0;
                            r25 = 0;
                            if (it.hasNext()) {
                                break;
                            }
                            interfaceC25312u = (InterfaceC25312u) it.next();
                            if (interfaceC25312u instanceof C38043a) {
                                c38043a = (C38043a) interfaceC25312u;
                            } else {
                                c38043a = null;
                            }
                            if (c38043a != null || (listM121804b = c38043a.m121804b()) == null) {
                                z16 = false;
                            } else {
                                for (Object obj2 : listM121804b) {
                                    if (((InterfaceC25312u) obj2) instanceof C16934f) {
                                        obj = obj2;
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    z16 = z13;
                                } else {
                                    z16 = false;
                                }
                            }
                            boolean z25 = !z16;
                            objM87133R13 = c28655q.m87133R();
                            c28676v3 = c28676v1;
                            if (objM87133R13 == c28676v3) {
                                objM87133R13 = new C39913g(27);
                                c28655q.m87172p0(objM87133R13);
                            }
                            Modifier modifierM44099b = AbstractC15676d.m44099b(c2314t, z25, (Function1) objM87133R13);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44099b);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i4 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                            C25307p c25307pM125252h = AbstractC39285a.m125252h();
                            C13258u c13258u = new C13258u(6, interfaceC25312u);
                            boolean zM87157i = c28655q.m87157i(interfaceC25312u);
                            i26 = i19;
                            if (i26 == 2048) {
                                z17 = z13;
                            } else {
                                z17 = false;
                            }
                            boolean z26 = (zM87157i ? 1 : 0) | z17;
                            if ((i24 & 112) == 32) {
                                z18 = z13;
                            } else {
                                z18 = false;
                            }
                            z19 = (z26 ? 1 : 0) | z18;
                            objM87133R14 = c28655q.m87133R();
                            if (!z19 || objM87133R14 == c28676v3) {
                                z24 = z13;
                                objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                                c28655q.m87172p0(objM87133R14);
                            } else {
                                z24 = z13;
                            }
                            i19 = i26;
                            C28655q c28655q3 = c28655q;
                            AbstractC25303l.m74291r(interfaceC25312u, c25307pM125252h, c13258u, (Function1) objM87133R14, c28655q3, C25307p.f99300b << 3, 0);
                            c28655q3.m87173q(z24);
                            z13 = z24;
                            c28676v1 = c28676v3;
                            c28655q = c28655q3;
                        }
                        c28655q2 = c28655q;
                        z14 = z13;
                        c28676v2 = c28676v1;
                        c28655q2.m87173q(false);
                        WeakHashMap weakHashMap = C22944c2.f90553v;
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), c2314t));
                        if (viewState.getFooter() != null) {
                            c28655q2.m87150e0(-1379871239);
                            AbstractC30007c.m91851u(c2314t, m128824f0(interfaceC28601c2), c28655q2, false);
                        } else {
                            c28655q2.m87150e0(-1379794359);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z14);
                        sanguineWaitlistFooterM118540e = viewState.getFooter();
                        if (sanguineWaitlistFooterM118540e == null) {
                            c28655q2.m87150e0(2105976810);
                            c28655q2.m87173q(false);
                            function5 = onAnalyticsEvent;
                            function3 = function7;
                        } else {
                            c28655q2.m87150e0(2105976811);
                            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H);
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v2) {
                                objM87133R6 = new C39382e(13, interfaceC28601c2);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            int i34 = i24 << 3;
                            function5 = onAnalyticsEvent;
                            function3 = function7;
                            m128794H(modifierMo3400a, sanguineWaitlistFooterM118540e, function5, function3, (Function1) objM87133R6, c28655q2, (i34 & 7168) | (i34 & 896) | 24576);
                            c28655q2.m87173q(false);
                        }
                        if (viewState.getWaitlistJoinModalState() instanceof AbstractC33208p0.h) {
                            c28655q2.m87150e0(2106411555);
                            AbstractC33208p0 abstractC33208p0M118544i2 = viewState.getWaitlistJoinModalState();
                            boolean zM87157i2 = c28655q2.m87157i(viewState);
                            if ((i24 & 896) == 256) {
                                r19 = z14;
                            } else {
                                r19 = 0;
                            }
                            r24 = (zM87157i2 ? 1 : 0) | r19;
                            objM87133R12 = c28655q2.m87133R();
                            if (r24 == 0 || objM87133R12 == c28676v2) {
                                objM87133R12 = new a(viewState, function3, null);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, abstractC33208p0M118544i2);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(2106715231);
                            c28655q2.m87173q(false);
                        }
                        abstractC33208p0M118544i = viewState.getWaitlistJoinModalState();
                        if (abstractC33208p0M118544i == null) {
                            c28655q2.m87150e0(2106822242);
                            c28655q2.m87173q(false);
                            z15 = z14;
                        } else {
                            c28655q2.m87150e0(2106822243);
                            modifierM7154a = AbstractC2294a.m7154a(3.0f, c2314t);
                            if (abstractC33208p0M118544i instanceof AbstractC33208p0.f) {
                                c28655q2.m87150e0(1161046330);
                                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                int i35 = AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3);
                                z15 = z14 ? 1 : 0;
                                AbstractC33199m0.m105214F((AbstractC33208p0.f) abstractC33208p0M118544i, textResourceM21267a, null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, i35, 0, 3580);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else {
                                z15 = z14 ? 1 : 0;
                                if (abstractC33208p0M118544i instanceof AbstractC33208p0.h) {
                                    c28655q2.m87150e0(1161321362);
                                    AbstractC33208p0.h hVar = (AbstractC33208p0.h) abstractC33208p0M118544i;
                                    TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                                    if ((i24 & 896) == 256) {
                                        r18 = z15 ? 1 : 0;
                                    } else {
                                        r18 = 0;
                                    }
                                    objM87133R11 = c28655q2.m87133R();
                                    if (r18 == 0 || objM87133R11 == c28676v2) {
                                        objM87133R11 = new C39609i(function3, 20);
                                        c28655q2.m87172p0(objM87133R11);
                                    }
                                    AbstractC33199m0.m105214F(hVar, textResourceM21267a2, (InterfaceC4339a) objM87133R11, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3576);
                                    c28655q2 = c28655q2;
                                    c28655q2.m87173q(false);
                                } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.b) {
                                    c28655q2.m87150e0(1161692122);
                                    if ((i24 & 112) == 32) {
                                        r10 = z15 ? 1 : 0;
                                    } else {
                                        r10 = 0;
                                    }
                                    objM87133R7 = c28655q2.m87133R();
                                    if (r10 == 0 || objM87133R7 == c28676v2) {
                                        objM87133R7 = new b(function5, null);
                                        c28655q2.m87172p0(objM87133R7);
                                    }
                                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, viewState);
                                    AbstractC33208p0.b bVar = (AbstractC33208p0.b) abstractC33208p0M118544i;
                                    TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                                    int i36 = 2;
                                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150176N, r25 == true ? 1 : 0, i36, r26 == true ? 1 : 0);
                                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC16277f.f62253K, r27 == true ? 1 : 0, i36, r28 == true ? 1 : 0);
                                    r14 = i24 & 896;
                                    if (r14 == 256) {
                                        r15 = z15 ? 1 : 0;
                                    } else {
                                        r15 = 0;
                                    }
                                    objM87133R8 = c28655q2.m87133R();
                                    i25 = 21;
                                    if (r15 == 0 || objM87133R8 == c28676v2) {
                                        objM87133R8 = new C39609i(function3, i25);
                                        c28655q2.m87172p0(objM87133R8);
                                    }
                                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R8;
                                    if (r14 == 256) {
                                        r16 = z15 ? 1 : 0;
                                    } else {
                                        r16 = 0;
                                    }
                                    objM87133R9 = c28655q2.m87133R();
                                    if (r16 == 0 || objM87133R9 == c28676v2) {
                                        objM87133R9 = new C39609i(function3, 18);
                                        c28655q2.m87172p0(objM87133R9);
                                    }
                                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R9;
                                    if (r14 == 256) {
                                        r17 = z15 ? 1 : 0;
                                    } else {
                                        r17 = 0;
                                    }
                                    objM87133R10 = c28655q2.m87133R();
                                    if (r17 == 0 || objM87133R10 == c28676v2) {
                                        objM87133R10 = new C39609i(function3, 19);
                                        c28655q2.m87172p0(objM87133R10);
                                    }
                                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R10;
                                    int i37 = 805502976 | AbstractC33208p0.f138461d | (TextResource.$stable << 3);
                                    int i38 = TextResource.C8688b.f25889c;
                                    AbstractC33199m0.m105214F(bVar, textResourceM21267a3, interfaceC4339a, c8688b, interfaceC4339a2, true, false, c8688b2, interfaceC4339a3, modifierM7154a, false, false, c28655q2, i37 | (i38 << 9) | (i38 << 21), 0, 3136);
                                    c28655q2 = c28655q2;
                                    c28655q2.m87173q(false);
                                } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.c) {
                                    c28655q2.m87150e0(1162653370);
                                    AbstractC33199m0.m105214F((AbstractC33208p0.c) abstractC33208p0M118544i, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3580);
                                    c28655q2 = c28655q2;
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(1162873873);
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z15);
                        function6 = function9;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N);
                    m128792F(viewState.getHeaderImage(), fFloatValue, c28655q2, AbstractC22403o.f87638a);
                    long j13 = f173296b;
                    float fM128830i1 = m128830i0(interfaceC28670t2);
                    objM87133R5 = c28655q2.m87133R();
                    i18 = 12;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39382e(i18, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    int i210 = i27 & 7168;
                    C0209i c0209i9 = c0209i3;
                    i19 = i210;
                    i24 = i27;
                    c28676v1 = c28676v0;
                    m128798L(viewState, j13, fM128830i1, function8, (Function1) objM87133R5, c28655q2, (i27 & 14) | 24624 | i210);
                    function9 = function8;
                    c28655q = c28655q2;
                    Modifier modifierM7154a3 = AbstractC2294a.m7154a(1.0f, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), c13821r1M92099U, 14));
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM7154a3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i9, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f173295a + m128820d0(interfaceC28601c1), c2314t));
                    c28655q.m87150e0(509639880);
                    it = viewState.m118543h().iterator();
                    while (true) {
                        Object obj3 = null;
                        r28 = 0;
                        r27 = 0;
                        r26 = 0;
                        r25 = 0;
                        if (it.hasNext()) {
                            break;
                            break;
                        }
                        interfaceC25312u = (InterfaceC25312u) it.next();
                        if (interfaceC25312u instanceof C38043a) {
                            c38043a = (C38043a) interfaceC25312u;
                        } else {
                            c38043a = null;
                        }
                        if (c38043a != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        boolean z27 = !z16;
                        objM87133R13 = c28655q.m87133R();
                        c28676v3 = c28676v1;
                        if (objM87133R13 == c28676v3) {
                            objM87133R13 = new C39913g(27);
                            c28655q.m87172p0(objM87133R13);
                        }
                        Modifier modifierM44099b2 = AbstractC15676d.m44099b(c2314t, z27, (Function1) objM87133R13);
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM44099b2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i4 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        C25307p c25307pM125252h2 = AbstractC39285a.m125252h();
                        C13258u c13258u2 = new C13258u(6, interfaceC25312u);
                        boolean zM87157i3 = c28655q.m87157i(interfaceC25312u);
                        i26 = i19;
                        if (i26 == 2048) {
                            z17 = z13;
                        } else {
                            z17 = false;
                        }
                        boolean z28 = (zM87157i3 ? 1 : 0) | z17;
                        if ((i24 & 112) == 32) {
                            z18 = z13;
                        } else {
                            z18 = false;
                        }
                        z19 = (z28 ? 1 : 0) | z18;
                        objM87133R14 = c28655q.m87133R();
                        if (z19) {
                            z24 = z13;
                            objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            z24 = z13;
                            objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                            c28655q.m87172p0(objM87133R14);
                        }
                        i19 = i26;
                        C28655q c28655q4 = c28655q;
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM125252h2, c13258u2, (Function1) objM87133R14, c28655q4, C25307p.f99300b << 3, 0);
                        c28655q4.m87173q(z24);
                        z13 = z24;
                        c28676v1 = c28676v3;
                        c28655q = c28655q4;
                    }
                    c28655q2 = c28655q;
                    z14 = z13;
                    c28676v2 = c28676v1;
                    c28655q2.m87173q(false);
                    WeakHashMap weakHashMap2 = C22944c2.f90553v;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), c2314t));
                    if (viewState.getFooter() != null) {
                        c28655q2.m87150e0(-1379871239);
                        AbstractC30007c.m91851u(c2314t, m128824f0(interfaceC28601c2), c28655q2, false);
                    } else {
                        c28655q2.m87150e0(-1379794359);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                    sanguineWaitlistFooterM118540e = viewState.getFooter();
                    if (sanguineWaitlistFooterM118540e == null) {
                        c28655q2.m87150e0(2105976810);
                        c28655q2.m87173q(false);
                        function5 = onAnalyticsEvent;
                        function3 = function7;
                    } else {
                        c28655q2.m87150e0(2105976811);
                        Modifier modifierMo3400a2 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H);
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v2) {
                            objM87133R6 = new C39382e(13, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        int i39 = i24 << 3;
                        function5 = onAnalyticsEvent;
                        function3 = function7;
                        m128794H(modifierMo3400a2, sanguineWaitlistFooterM118540e, function5, function3, (Function1) objM87133R6, c28655q2, (i39 & 7168) | (i39 & 896) | 24576);
                        c28655q2.m87173q(false);
                    }
                    if (viewState.getWaitlistJoinModalState() instanceof AbstractC33208p0.h) {
                        c28655q2.m87150e0(2106411555);
                        AbstractC33208p0 abstractC33208p0M118544i3 = viewState.getWaitlistJoinModalState();
                        boolean zM87157i4 = c28655q2.m87157i(viewState);
                        if ((i24 & 896) == 256) {
                            r19 = z14;
                        } else {
                            r19 = 0;
                        }
                        r24 = (zM87157i4 ? 1 : 0) | r19;
                        objM87133R12 = c28655q2.m87133R();
                        if (r24 == 0) {
                            objM87133R12 = new a(viewState, function3, null);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new a(viewState, function3, null);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, abstractC33208p0M118544i3);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(2106715231);
                        c28655q2.m87173q(false);
                    }
                    abstractC33208p0M118544i = viewState.getWaitlistJoinModalState();
                    if (abstractC33208p0M118544i == null) {
                        c28655q2.m87150e0(2106822242);
                        c28655q2.m87173q(false);
                        z15 = z14;
                    } else {
                        c28655q2.m87150e0(2106822243);
                        modifierM7154a = AbstractC2294a.m7154a(3.0f, c2314t);
                        if (abstractC33208p0M118544i instanceof AbstractC33208p0.f) {
                            c28655q2.m87150e0(1161046330);
                            TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                            int i310 = AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3);
                            z15 = z14 ? 1 : 0;
                            AbstractC33199m0.m105214F((AbstractC33208p0.f) abstractC33208p0M118544i, textResourceM21267a4, null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, i310, 0, 3580);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else {
                            z15 = z14 ? 1 : 0;
                            if (abstractC33208p0M118544i instanceof AbstractC33208p0.h) {
                                c28655q2.m87150e0(1161321362);
                                AbstractC33208p0.h hVar2 = (AbstractC33208p0.h) abstractC33208p0M118544i;
                                TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                                if ((i24 & 896) == 256) {
                                    r18 = z15 ? 1 : 0;
                                } else {
                                    r18 = 0;
                                }
                                objM87133R11 = c28655q2.m87133R();
                                if (r18 == 0) {
                                    objM87133R11 = new C39609i(function3, 20);
                                    c28655q2.m87172p0(objM87133R11);
                                } else {
                                    objM87133R11 = new C39609i(function3, 20);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                AbstractC33199m0.m105214F(hVar2, textResourceM21267a5, (InterfaceC4339a) objM87133R11, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3576);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.b) {
                                c28655q2.m87150e0(1161692122);
                                if ((i24 & 112) == 32) {
                                    r10 = z15 ? 1 : 0;
                                } else {
                                    r10 = 0;
                                }
                                objM87133R7 = c28655q2.m87133R();
                                if (r10 == 0) {
                                    objM87133R7 = new b(function5, null);
                                    c28655q2.m87172p0(objM87133R7);
                                } else {
                                    objM87133R7 = new b(function5, null);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, viewState);
                                AbstractC33208p0.b bVar2 = (AbstractC33208p0.b) abstractC33208p0M118544i;
                                TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                                int i311 = 2;
                                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150176N, r25 == true ? 1 : 0, i311, r26 == true ? 1 : 0);
                                TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC16277f.f62253K, r27 == true ? 1 : 0, i311, r28 == true ? 1 : 0);
                                r14 = i24 & 896;
                                if (r14 == 256) {
                                    r15 = z15 ? 1 : 0;
                                } else {
                                    r15 = 0;
                                }
                                objM87133R8 = c28655q2.m87133R();
                                i25 = 21;
                                if (r15 == 0) {
                                    objM87133R8 = new C39609i(function3, i25);
                                    c28655q2.m87172p0(objM87133R8);
                                } else {
                                    objM87133R8 = new C39609i(function3, i25);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                                if (r14 == 256) {
                                    r16 = z15 ? 1 : 0;
                                } else {
                                    r16 = 0;
                                }
                                objM87133R9 = c28655q2.m87133R();
                                if (r16 == 0) {
                                    objM87133R9 = new C39609i(function3, 18);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C39609i(function3, 18);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R9;
                                if (r14 == 256) {
                                    r17 = z15 ? 1 : 0;
                                } else {
                                    r17 = 0;
                                }
                                objM87133R10 = c28655q2.m87133R();
                                if (r17 == 0) {
                                    objM87133R10 = new C39609i(function3, 19);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C39609i(function3, 19);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R10;
                                int i312 = 805502976 | AbstractC33208p0.f138461d | (TextResource.$stable << 3);
                                int i313 = TextResource.C8688b.f25889c;
                                AbstractC33199m0.m105214F(bVar2, textResourceM21267a6, interfaceC4339a4, c8688b3, interfaceC4339a5, true, false, c8688b4, interfaceC4339a6, modifierM7154a, false, false, c28655q2, i312 | (i313 << 9) | (i313 << 21), 0, 3136);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.c) {
                                c28655q2.m87150e0(1162653370);
                                AbstractC33199m0.m105214F((AbstractC33208p0.c) abstractC33208p0M118544i, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3580);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(1162873873);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z15);
                    function6 = function9;
                } else {
                    function5 = onAnalyticsEvent;
                    c28655q2.m87138X();
                    function6 = function4;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k((Object) viewState, function5, function3, function6, i13, i14, 20);
                }
            }
            i27 |= 3072;
            function4 = function2;
            i17 = 0;
            if ((i27 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i27 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R16 = c28655q2.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C39913g(25);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    function7 = (Function1) objM87133R16;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C39913g(26);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    function8 = (Function1) objM87133R15;
                } else {
                    function8 = function4;
                }
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(new C39174f(85));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(new C39174f(160));
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                zM87153g = c28655q2.m87153g(c13821r1M92099U);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R3 = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, i17));
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, i17));
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                zM87147d = c28655q2.m87147d(m128830i0(interfaceC28670t2));
                objM87133R4 = c28655q2.m87133R();
                z13 = true;
                if (zM87147d) {
                    objM87133R4 = Float.valueOf(AbstractC11329a0.f36295d.mo7226i(1.0f - m128830i0(interfaceC28670t2)));
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = Float.valueOf(AbstractC11329a0.f36295d.mo7226i(1.0f - m128830i0(interfaceC28670t2)));
                    c28655q2.m87172p0(objM87133R4);
                }
                float fFloatValue2 = ((Number) objM87133R4).floatValue();
                c2314t = C2314t.f9131w;
                Modifier modifierM44028b1 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM44028b1);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                C0209i c0209i10 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i10, interfaceC28653p1M87165m6);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i11, modifierM118962N6);
                    m128792F(viewState.getHeaderImage(), fFloatValue2, c28655q2, AbstractC22403o.f87638a);
                    long j14 = f173296b;
                    float fM128830i2 = m128830i0(interfaceC28670t2);
                    objM87133R5 = c28655q2.m87133R();
                    i18 = 12;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39382e(i18, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    int i211 = i27 & 7168;
                    C0209i c0209i12 = c0209i3;
                    i19 = i211;
                    i24 = i27;
                    c28676v1 = c28676v0;
                    m128798L(viewState, j14, fM128830i2, function8, (Function1) objM87133R5, c28655q2, (i27 & 14) | 24624 | i211);
                    function9 = function8;
                    c28655q = c28655q2;
                    Modifier modifierM7154a4 = AbstractC2294a.m7154a(1.0f, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), c13821r1M92099U, 14));
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM7154a4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N7);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f173295a + m128820d0(interfaceC28601c1), c2314t));
                    c28655q.m87150e0(509639880);
                    it = viewState.m118543h().iterator();
                    while (true) {
                        Object obj4 = null;
                        r28 = 0;
                        r27 = 0;
                        r26 = 0;
                        r25 = 0;
                        if (it.hasNext()) {
                            break;
                            break;
                        }
                        interfaceC25312u = (InterfaceC25312u) it.next();
                        if (interfaceC25312u instanceof C38043a) {
                            c38043a = (C38043a) interfaceC25312u;
                        } else {
                            c38043a = null;
                        }
                        if (c38043a != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        boolean z29 = !z16;
                        objM87133R13 = c28655q.m87133R();
                        c28676v3 = c28676v1;
                        if (objM87133R13 == c28676v3) {
                            objM87133R13 = new C39913g(27);
                            c28655q.m87172p0(objM87133R13);
                        }
                        Modifier modifierM44099b3 = AbstractC15676d.m44099b(c2314t, z29, (Function1) objM87133R13);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM44099b3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i4 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                        C25307p c25307pM125252h3 = AbstractC39285a.m125252h();
                        C13258u c13258u3 = new C13258u(6, interfaceC25312u);
                        boolean zM87157i5 = c28655q.m87157i(interfaceC25312u);
                        i26 = i19;
                        if (i26 == 2048) {
                            z17 = z13;
                        } else {
                            z17 = false;
                        }
                        boolean z210 = (zM87157i5 ? 1 : 0) | z17;
                        if ((i24 & 112) == 32) {
                            z18 = z13;
                        } else {
                            z18 = false;
                        }
                        z19 = (z210 ? 1 : 0) | z18;
                        objM87133R14 = c28655q.m87133R();
                        if (z19) {
                            z24 = z13;
                            objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            z24 = z13;
                            objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                            c28655q.m87172p0(objM87133R14);
                        }
                        i19 = i26;
                        C28655q c28655q5 = c28655q;
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM125252h3, c13258u3, (Function1) objM87133R14, c28655q5, C25307p.f99300b << 3, 0);
                        c28655q5.m87173q(z24);
                        z13 = z24;
                        c28676v1 = c28676v3;
                        c28655q = c28655q5;
                    }
                    c28655q2 = c28655q;
                    z14 = z13;
                    c28676v2 = c28676v1;
                    c28655q2.m87173q(false);
                    WeakHashMap weakHashMap3 = C22944c2.f90553v;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), c2314t));
                    if (viewState.getFooter() != null) {
                        c28655q2.m87150e0(-1379871239);
                        AbstractC30007c.m91851u(c2314t, m128824f0(interfaceC28601c2), c28655q2, false);
                    } else {
                        c28655q2.m87150e0(-1379794359);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                    sanguineWaitlistFooterM118540e = viewState.getFooter();
                    if (sanguineWaitlistFooterM118540e == null) {
                        c28655q2.m87150e0(2105976810);
                        c28655q2.m87173q(false);
                        function5 = onAnalyticsEvent;
                        function3 = function7;
                    } else {
                        c28655q2.m87150e0(2105976811);
                        Modifier modifierMo3400a3 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H);
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v2) {
                            objM87133R6 = new C39382e(13, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        int i314 = i24 << 3;
                        function5 = onAnalyticsEvent;
                        function3 = function7;
                        m128794H(modifierMo3400a3, sanguineWaitlistFooterM118540e, function5, function3, (Function1) objM87133R6, c28655q2, (i314 & 7168) | (i314 & 896) | 24576);
                        c28655q2.m87173q(false);
                    }
                    if (viewState.getWaitlistJoinModalState() instanceof AbstractC33208p0.h) {
                        c28655q2.m87150e0(2106411555);
                        AbstractC33208p0 abstractC33208p0M118544i4 = viewState.getWaitlistJoinModalState();
                        boolean zM87157i6 = c28655q2.m87157i(viewState);
                        if ((i24 & 896) == 256) {
                            r19 = z14;
                        } else {
                            r19 = 0;
                        }
                        r24 = (zM87157i6 ? 1 : 0) | r19;
                        objM87133R12 = c28655q2.m87133R();
                        if (r24 == 0) {
                            objM87133R12 = new a(viewState, function3, null);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new a(viewState, function3, null);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, abstractC33208p0M118544i4);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(2106715231);
                        c28655q2.m87173q(false);
                    }
                    abstractC33208p0M118544i = viewState.getWaitlistJoinModalState();
                    if (abstractC33208p0M118544i == null) {
                        c28655q2.m87150e0(2106822242);
                        c28655q2.m87173q(false);
                        z15 = z14;
                    } else {
                        c28655q2.m87150e0(2106822243);
                        modifierM7154a = AbstractC2294a.m7154a(3.0f, c2314t);
                        if (abstractC33208p0M118544i instanceof AbstractC33208p0.f) {
                            c28655q2.m87150e0(1161046330);
                            TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                            int i315 = AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3);
                            z15 = z14 ? 1 : 0;
                            AbstractC33199m0.m105214F((AbstractC33208p0.f) abstractC33208p0M118544i, textResourceM21267a7, null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, i315, 0, 3580);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else {
                            z15 = z14 ? 1 : 0;
                            if (abstractC33208p0M118544i instanceof AbstractC33208p0.h) {
                                c28655q2.m87150e0(1161321362);
                                AbstractC33208p0.h hVar3 = (AbstractC33208p0.h) abstractC33208p0M118544i;
                                TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                                if ((i24 & 896) == 256) {
                                    r18 = z15 ? 1 : 0;
                                } else {
                                    r18 = 0;
                                }
                                objM87133R11 = c28655q2.m87133R();
                                if (r18 == 0) {
                                    objM87133R11 = new C39609i(function3, 20);
                                    c28655q2.m87172p0(objM87133R11);
                                } else {
                                    objM87133R11 = new C39609i(function3, 20);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                AbstractC33199m0.m105214F(hVar3, textResourceM21267a8, (InterfaceC4339a) objM87133R11, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3576);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.b) {
                                c28655q2.m87150e0(1161692122);
                                if ((i24 & 112) == 32) {
                                    r10 = z15 ? 1 : 0;
                                } else {
                                    r10 = 0;
                                }
                                objM87133R7 = c28655q2.m87133R();
                                if (r10 == 0) {
                                    objM87133R7 = new b(function5, null);
                                    c28655q2.m87172p0(objM87133R7);
                                } else {
                                    objM87133R7 = new b(function5, null);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, viewState);
                                AbstractC33208p0.b bVar3 = (AbstractC33208p0.b) abstractC33208p0M118544i;
                                TextResource textResourceM21267a9 = AbstractC8693b.m21267a();
                                int i316 = 2;
                                TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150176N, r25 == true ? 1 : 0, i316, r26 == true ? 1 : 0);
                                TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC16277f.f62253K, r27 == true ? 1 : 0, i316, r28 == true ? 1 : 0);
                                r14 = i24 & 896;
                                if (r14 == 256) {
                                    r15 = z15 ? 1 : 0;
                                } else {
                                    r15 = 0;
                                }
                                objM87133R8 = c28655q2.m87133R();
                                i25 = 21;
                                if (r15 == 0) {
                                    objM87133R8 = new C39609i(function3, i25);
                                    c28655q2.m87172p0(objM87133R8);
                                } else {
                                    objM87133R8 = new C39609i(function3, i25);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R8;
                                if (r14 == 256) {
                                    r16 = z15 ? 1 : 0;
                                } else {
                                    r16 = 0;
                                }
                                objM87133R9 = c28655q2.m87133R();
                                if (r16 == 0) {
                                    objM87133R9 = new C39609i(function3, 18);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C39609i(function3, 18);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R9;
                                if (r14 == 256) {
                                    r17 = z15 ? 1 : 0;
                                } else {
                                    r17 = 0;
                                }
                                objM87133R10 = c28655q2.m87133R();
                                if (r17 == 0) {
                                    objM87133R10 = new C39609i(function3, 19);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C39609i(function3, 19);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R10;
                                int i317 = 805502976 | AbstractC33208p0.f138461d | (TextResource.$stable << 3);
                                int i318 = TextResource.C8688b.f25889c;
                                AbstractC33199m0.m105214F(bVar3, textResourceM21267a9, interfaceC4339a7, c8688b5, interfaceC4339a8, true, false, c8688b6, interfaceC4339a9, modifierM7154a, false, false, c28655q2, i317 | (i318 << 9) | (i318 << 21), 0, 3136);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.c) {
                                c28655q2.m87150e0(1162653370);
                                AbstractC33199m0.m105214F((AbstractC33208p0.c) abstractC33208p0M118544i, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3580);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(1162873873);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z15);
                    function6 = function9;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N6);
                m128792F(viewState.getHeaderImage(), fFloatValue2, c28655q2, AbstractC22403o.f87638a);
                long j15 = f173296b;
                float fM128830i3 = m128830i0(interfaceC28670t2);
                objM87133R5 = c28655q2.m87133R();
                i18 = 12;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C39382e(i18, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R5);
                }
                int i212 = i27 & 7168;
                C0209i c0209i14 = c0209i3;
                i19 = i212;
                i24 = i27;
                c28676v1 = c28676v0;
                m128798L(viewState, j15, fM128830i3, function8, (Function1) objM87133R5, c28655q2, (i27 & 14) | 24624 | i212);
                function9 = function8;
                c28655q = c28655q2;
                Modifier modifierM7154a5 = AbstractC2294a.m7154a(1.0f, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), c13821r1M92099U, 14));
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM7154a5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f173295a + m128820d0(interfaceC28601c1), c2314t));
                c28655q.m87150e0(509639880);
                it = viewState.m118543h().iterator();
                while (true) {
                    Object obj5 = null;
                    r28 = 0;
                    r27 = 0;
                    r26 = 0;
                    r25 = 0;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    interfaceC25312u = (InterfaceC25312u) it.next();
                    if (interfaceC25312u instanceof C38043a) {
                        c38043a = (C38043a) interfaceC25312u;
                    } else {
                        c38043a = null;
                    }
                    if (c38043a != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    boolean z211 = !z16;
                    objM87133R13 = c28655q.m87133R();
                    c28676v3 = c28676v1;
                    if (objM87133R13 == c28676v3) {
                        objM87133R13 = new C39913g(27);
                        c28655q.m87172p0(objM87133R13);
                    }
                    Modifier modifierM44099b4 = AbstractC15676d.m44099b(c2314t, z211, (Function1) objM87133R13);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM44099b4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                    C25307p c25307pM125252h4 = AbstractC39285a.m125252h();
                    C13258u c13258u4 = new C13258u(6, interfaceC25312u);
                    boolean zM87157i7 = c28655q.m87157i(interfaceC25312u);
                    i26 = i19;
                    if (i26 == 2048) {
                        z17 = z13;
                    } else {
                        z17 = false;
                    }
                    boolean z212 = (zM87157i7 ? 1 : 0) | z17;
                    if ((i24 & 112) == 32) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    z19 = (z212 ? 1 : 0) | z18;
                    objM87133R14 = c28655q.m87133R();
                    if (z19) {
                        z24 = z13;
                        objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        z24 = z13;
                        objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                        c28655q.m87172p0(objM87133R14);
                    }
                    i19 = i26;
                    C28655q c28655q6 = c28655q;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM125252h4, c13258u4, (Function1) objM87133R14, c28655q6, C25307p.f99300b << 3, 0);
                    c28655q6.m87173q(z24);
                    z13 = z24;
                    c28676v1 = c28676v3;
                    c28655q = c28655q6;
                }
                c28655q2 = c28655q;
                z14 = z13;
                c28676v2 = c28676v1;
                c28655q2.m87173q(false);
                WeakHashMap weakHashMap4 = C22944c2.f90553v;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), c2314t));
                if (viewState.getFooter() != null) {
                    c28655q2.m87150e0(-1379871239);
                    AbstractC30007c.m91851u(c2314t, m128824f0(interfaceC28601c2), c28655q2, false);
                } else {
                    c28655q2.m87150e0(-1379794359);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
                sanguineWaitlistFooterM118540e = viewState.getFooter();
                if (sanguineWaitlistFooterM118540e == null) {
                    c28655q2.m87150e0(2105976810);
                    c28655q2.m87173q(false);
                    function5 = onAnalyticsEvent;
                    function3 = function7;
                } else {
                    c28655q2.m87150e0(2105976811);
                    Modifier modifierMo3400a4 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H);
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v2) {
                        objM87133R6 = new C39382e(13, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    int i319 = i24 << 3;
                    function5 = onAnalyticsEvent;
                    function3 = function7;
                    m128794H(modifierMo3400a4, sanguineWaitlistFooterM118540e, function5, function3, (Function1) objM87133R6, c28655q2, (i319 & 7168) | (i319 & 896) | 24576);
                    c28655q2.m87173q(false);
                }
                if (viewState.getWaitlistJoinModalState() instanceof AbstractC33208p0.h) {
                    c28655q2.m87150e0(2106411555);
                    AbstractC33208p0 abstractC33208p0M118544i5 = viewState.getWaitlistJoinModalState();
                    boolean zM87157i8 = c28655q2.m87157i(viewState);
                    if ((i24 & 896) == 256) {
                        r19 = z14;
                    } else {
                        r19 = 0;
                    }
                    r24 = (zM87157i8 ? 1 : 0) | r19;
                    objM87133R12 = c28655q2.m87133R();
                    if (r24 == 0) {
                        objM87133R12 = new a(viewState, function3, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new a(viewState, function3, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, abstractC33208p0M118544i5);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(2106715231);
                    c28655q2.m87173q(false);
                }
                abstractC33208p0M118544i = viewState.getWaitlistJoinModalState();
                if (abstractC33208p0M118544i == null) {
                    c28655q2.m87150e0(2106822242);
                    c28655q2.m87173q(false);
                    z15 = z14;
                } else {
                    c28655q2.m87150e0(2106822243);
                    modifierM7154a = AbstractC2294a.m7154a(3.0f, c2314t);
                    if (abstractC33208p0M118544i instanceof AbstractC33208p0.f) {
                        c28655q2.m87150e0(1161046330);
                        TextResource textResourceM21267a10 = AbstractC8693b.m21267a();
                        int i3110 = AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3);
                        z15 = z14 ? 1 : 0;
                        AbstractC33199m0.m105214F((AbstractC33208p0.f) abstractC33208p0M118544i, textResourceM21267a10, null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, i3110, 0, 3580);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else {
                        z15 = z14 ? 1 : 0;
                        if (abstractC33208p0M118544i instanceof AbstractC33208p0.h) {
                            c28655q2.m87150e0(1161321362);
                            AbstractC33208p0.h hVar4 = (AbstractC33208p0.h) abstractC33208p0M118544i;
                            TextResource textResourceM21267a11 = AbstractC8693b.m21267a();
                            if ((i24 & 896) == 256) {
                                r18 = z15 ? 1 : 0;
                            } else {
                                r18 = 0;
                            }
                            objM87133R11 = c28655q2.m87133R();
                            if (r18 == 0) {
                                objM87133R11 = new C39609i(function3, 20);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C39609i(function3, 20);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            AbstractC33199m0.m105214F(hVar4, textResourceM21267a11, (InterfaceC4339a) objM87133R11, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3576);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.b) {
                            c28655q2.m87150e0(1161692122);
                            if ((i24 & 112) == 32) {
                                r10 = z15 ? 1 : 0;
                            } else {
                                r10 = 0;
                            }
                            objM87133R7 = c28655q2.m87133R();
                            if (r10 == 0) {
                                objM87133R7 = new b(function5, null);
                                c28655q2.m87172p0(objM87133R7);
                            } else {
                                objM87133R7 = new b(function5, null);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, viewState);
                            AbstractC33208p0.b bVar4 = (AbstractC33208p0.b) abstractC33208p0M118544i;
                            TextResource textResourceM21267a12 = AbstractC8693b.m21267a();
                            int i3111 = 2;
                            TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150176N, r25 == true ? 1 : 0, i3111, r26 == true ? 1 : 0);
                            TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC16277f.f62253K, r27 == true ? 1 : 0, i3111, r28 == true ? 1 : 0);
                            r14 = i24 & 896;
                            if (r14 == 256) {
                                r15 = z15 ? 1 : 0;
                            } else {
                                r15 = 0;
                            }
                            objM87133R8 = c28655q2.m87133R();
                            i25 = 21;
                            if (r15 == 0) {
                                objM87133R8 = new C39609i(function3, i25);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                objM87133R8 = new C39609i(function3, i25);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R8;
                            if (r14 == 256) {
                                r16 = z15 ? 1 : 0;
                            } else {
                                r16 = 0;
                            }
                            objM87133R9 = c28655q2.m87133R();
                            if (r16 == 0) {
                                objM87133R9 = new C39609i(function3, 18);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C39609i(function3, 18);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R9;
                            if (r14 == 256) {
                                r17 = z15 ? 1 : 0;
                            } else {
                                r17 = 0;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (r17 == 0) {
                                objM87133R10 = new C39609i(function3, 19);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C39609i(function3, 19);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R10;
                            int i3112 = 805502976 | AbstractC33208p0.f138461d | (TextResource.$stable << 3);
                            int i3113 = TextResource.C8688b.f25889c;
                            AbstractC33199m0.m105214F(bVar4, textResourceM21267a12, interfaceC4339a10, c8688b7, interfaceC4339a11, true, false, c8688b8, interfaceC4339a12, modifierM7154a, false, false, c28655q2, i3112 | (i3113 << 9) | (i3113 << 21), 0, 3136);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.c) {
                            c28655q2.m87150e0(1162653370);
                            AbstractC33199m0.m105214F((AbstractC33208p0.c) abstractC33208p0M118544i, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3580);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1162873873);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z15);
                function6 = function9;
            } else {
                function5 = onAnalyticsEvent;
                c28655q2.m87138X();
                function6 = function4;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) viewState, function5, function3, function6, i13, i14, 20);
            }
        }
        i27 |= 384;
        function3 = function1;
        i15 = i14 & 8;
        if (i15 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i27 |= i16;
            }
            i17 = 0;
            if ((i27 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i27 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R16 = c28655q2.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C39913g(25);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    function7 = (Function1) objM87133R16;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C39913g(26);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    function8 = (Function1) objM87133R15;
                } else {
                    function8 = function4;
                }
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(new C39174f(85));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(new C39174f(160));
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                zM87153g = c28655q2.m87153g(c13821r1M92099U);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R3 = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, i17));
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, i17));
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                zM87147d = c28655q2.m87147d(m128830i0(interfaceC28670t2));
                objM87133R4 = c28655q2.m87133R();
                z13 = true;
                if (zM87147d) {
                    objM87133R4 = Float.valueOf(AbstractC11329a0.f36295d.mo7226i(1.0f - m128830i0(interfaceC28670t2)));
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = Float.valueOf(AbstractC11329a0.f36295d.mo7226i(1.0f - m128830i0(interfaceC28670t2)));
                    c28655q2.m87172p0(objM87133R4);
                }
                float fFloatValue3 = ((Number) objM87133R4).floatValue();
                c2314t = C2314t.f9131w;
                Modifier modifierM44028b2 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM44028b2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
                C0209i c0209i15 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m11);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N11);
                    m128792F(viewState.getHeaderImage(), fFloatValue3, c28655q2, AbstractC22403o.f87638a);
                    long j16 = f173296b;
                    float fM128830i4 = m128830i0(interfaceC28670t2);
                    objM87133R5 = c28655q2.m87133R();
                    i18 = 12;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39382e(i18, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    int i213 = i27 & 7168;
                    C0209i c0209i17 = c0209i3;
                    i19 = i213;
                    i24 = i27;
                    c28676v1 = c28676v0;
                    m128798L(viewState, j16, fM128830i4, function8, (Function1) objM87133R5, c28655q2, (i27 & 14) | 24624 | i213);
                    function9 = function8;
                    c28655q = c28655q2;
                    Modifier modifierM7154a6 = AbstractC2294a.m7154a(1.0f, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), c13821r1M92099U, 14));
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM7154a6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i17, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N12);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f173295a + m128820d0(interfaceC28601c1), c2314t));
                    c28655q.m87150e0(509639880);
                    it = viewState.m118543h().iterator();
                    while (true) {
                        Object obj6 = null;
                        r28 = 0;
                        r27 = 0;
                        r26 = 0;
                        r25 = 0;
                        if (it.hasNext()) {
                            break;
                            break;
                        }
                        interfaceC25312u = (InterfaceC25312u) it.next();
                        if (interfaceC25312u instanceof C38043a) {
                            c38043a = (C38043a) interfaceC25312u;
                        } else {
                            c38043a = null;
                        }
                        if (c38043a != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        boolean z213 = !z16;
                        objM87133R13 = c28655q.m87133R();
                        c28676v3 = c28676v1;
                        if (objM87133R13 == c28676v3) {
                            objM87133R13 = new C39913g(27);
                            c28655q.m87172p0(objM87133R13);
                        }
                        Modifier modifierM44099b5 = AbstractC15676d.m44099b(c2314t, z213, (Function1) objM87133R13);
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM44099b5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                        c0209i4 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                        C25307p c25307pM125252h5 = AbstractC39285a.m125252h();
                        C13258u c13258u5 = new C13258u(6, interfaceC25312u);
                        boolean zM87157i9 = c28655q.m87157i(interfaceC25312u);
                        i26 = i19;
                        if (i26 == 2048) {
                            z17 = z13;
                        } else {
                            z17 = false;
                        }
                        boolean z214 = (zM87157i9 ? 1 : 0) | z17;
                        if ((i24 & 112) == 32) {
                            z18 = z13;
                        } else {
                            z18 = false;
                        }
                        z19 = (z214 ? 1 : 0) | z18;
                        objM87133R14 = c28655q.m87133R();
                        if (z19) {
                            z24 = z13;
                            objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                            c28655q.m87172p0(objM87133R14);
                        } else {
                            z24 = z13;
                            objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                            c28655q.m87172p0(objM87133R14);
                        }
                        i19 = i26;
                        C28655q c28655q7 = c28655q;
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM125252h5, c13258u5, (Function1) objM87133R14, c28655q7, C25307p.f99300b << 3, 0);
                        c28655q7.m87173q(z24);
                        z13 = z24;
                        c28676v1 = c28676v3;
                        c28655q = c28655q7;
                    }
                    c28655q2 = c28655q;
                    z14 = z13;
                    c28676v2 = c28676v1;
                    c28655q2.m87173q(false);
                    WeakHashMap weakHashMap5 = C22944c2.f90553v;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), c2314t));
                    if (viewState.getFooter() != null) {
                        c28655q2.m87150e0(-1379871239);
                        AbstractC30007c.m91851u(c2314t, m128824f0(interfaceC28601c2), c28655q2, false);
                    } else {
                        c28655q2.m87150e0(-1379794359);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                    sanguineWaitlistFooterM118540e = viewState.getFooter();
                    if (sanguineWaitlistFooterM118540e == null) {
                        c28655q2.m87150e0(2105976810);
                        c28655q2.m87173q(false);
                        function5 = onAnalyticsEvent;
                        function3 = function7;
                    } else {
                        c28655q2.m87150e0(2105976811);
                        Modifier modifierMo3400a5 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H);
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v2) {
                            objM87133R6 = new C39382e(13, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        int i3114 = i24 << 3;
                        function5 = onAnalyticsEvent;
                        function3 = function7;
                        m128794H(modifierMo3400a5, sanguineWaitlistFooterM118540e, function5, function3, (Function1) objM87133R6, c28655q2, (i3114 & 7168) | (i3114 & 896) | 24576);
                        c28655q2.m87173q(false);
                    }
                    if (viewState.getWaitlistJoinModalState() instanceof AbstractC33208p0.h) {
                        c28655q2.m87150e0(2106411555);
                        AbstractC33208p0 abstractC33208p0M118544i6 = viewState.getWaitlistJoinModalState();
                        boolean zM87157i10 = c28655q2.m87157i(viewState);
                        if ((i24 & 896) == 256) {
                            r19 = z14;
                        } else {
                            r19 = 0;
                        }
                        r24 = (zM87157i10 ? 1 : 0) | r19;
                        objM87133R12 = c28655q2.m87133R();
                        if (r24 == 0) {
                            objM87133R12 = new a(viewState, function3, null);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new a(viewState, function3, null);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, abstractC33208p0M118544i6);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(2106715231);
                        c28655q2.m87173q(false);
                    }
                    abstractC33208p0M118544i = viewState.getWaitlistJoinModalState();
                    if (abstractC33208p0M118544i == null) {
                        c28655q2.m87150e0(2106822242);
                        c28655q2.m87173q(false);
                        z15 = z14;
                    } else {
                        c28655q2.m87150e0(2106822243);
                        modifierM7154a = AbstractC2294a.m7154a(3.0f, c2314t);
                        if (abstractC33208p0M118544i instanceof AbstractC33208p0.f) {
                            c28655q2.m87150e0(1161046330);
                            TextResource textResourceM21267a13 = AbstractC8693b.m21267a();
                            int i3115 = AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3);
                            z15 = z14 ? 1 : 0;
                            AbstractC33199m0.m105214F((AbstractC33208p0.f) abstractC33208p0M118544i, textResourceM21267a13, null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, i3115, 0, 3580);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else {
                            z15 = z14 ? 1 : 0;
                            if (abstractC33208p0M118544i instanceof AbstractC33208p0.h) {
                                c28655q2.m87150e0(1161321362);
                                AbstractC33208p0.h hVar5 = (AbstractC33208p0.h) abstractC33208p0M118544i;
                                TextResource textResourceM21267a14 = AbstractC8693b.m21267a();
                                if ((i24 & 896) == 256) {
                                    r18 = z15 ? 1 : 0;
                                } else {
                                    r18 = 0;
                                }
                                objM87133R11 = c28655q2.m87133R();
                                if (r18 == 0) {
                                    objM87133R11 = new C39609i(function3, 20);
                                    c28655q2.m87172p0(objM87133R11);
                                } else {
                                    objM87133R11 = new C39609i(function3, 20);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                AbstractC33199m0.m105214F(hVar5, textResourceM21267a14, (InterfaceC4339a) objM87133R11, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3576);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.b) {
                                c28655q2.m87150e0(1161692122);
                                if ((i24 & 112) == 32) {
                                    r10 = z15 ? 1 : 0;
                                } else {
                                    r10 = 0;
                                }
                                objM87133R7 = c28655q2.m87133R();
                                if (r10 == 0) {
                                    objM87133R7 = new b(function5, null);
                                    c28655q2.m87172p0(objM87133R7);
                                } else {
                                    objM87133R7 = new b(function5, null);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, viewState);
                                AbstractC33208p0.b bVar5 = (AbstractC33208p0.b) abstractC33208p0M118544i;
                                TextResource textResourceM21267a15 = AbstractC8693b.m21267a();
                                int i3116 = 2;
                                TextResource.C8688b c8688b9 = new TextResource.C8688b(AbstractC35283c.f150176N, r25 == true ? 1 : 0, i3116, r26 == true ? 1 : 0);
                                TextResource.C8688b c8688b10 = new TextResource.C8688b(AbstractC16277f.f62253K, r27 == true ? 1 : 0, i3116, r28 == true ? 1 : 0);
                                r14 = i24 & 896;
                                if (r14 == 256) {
                                    r15 = z15 ? 1 : 0;
                                } else {
                                    r15 = 0;
                                }
                                objM87133R8 = c28655q2.m87133R();
                                i25 = 21;
                                if (r15 == 0) {
                                    objM87133R8 = new C39609i(function3, i25);
                                    c28655q2.m87172p0(objM87133R8);
                                } else {
                                    objM87133R8 = new C39609i(function3, i25);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R8;
                                if (r14 == 256) {
                                    r16 = z15 ? 1 : 0;
                                } else {
                                    r16 = 0;
                                }
                                objM87133R9 = c28655q2.m87133R();
                                if (r16 == 0) {
                                    objM87133R9 = new C39609i(function3, 18);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C39609i(function3, 18);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R9;
                                if (r14 == 256) {
                                    r17 = z15 ? 1 : 0;
                                } else {
                                    r17 = 0;
                                }
                                objM87133R10 = c28655q2.m87133R();
                                if (r17 == 0) {
                                    objM87133R10 = new C39609i(function3, 19);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C39609i(function3, 19);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R10;
                                int i3117 = 805502976 | AbstractC33208p0.f138461d | (TextResource.$stable << 3);
                                int i3118 = TextResource.C8688b.f25889c;
                                AbstractC33199m0.m105214F(bVar5, textResourceM21267a15, interfaceC4339a13, c8688b9, interfaceC4339a14, true, false, c8688b10, interfaceC4339a15, modifierM7154a, false, false, c28655q2, i3117 | (i3118 << 9) | (i3118 << 21), 0, 3136);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.c) {
                                c28655q2.m87150e0(1162653370);
                                AbstractC33199m0.m105214F((AbstractC33208p0.c) abstractC33208p0M118544i, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3580);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(1162873873);
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z15);
                    function6 = function9;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                C0209i c0209i18 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N11);
                m128792F(viewState.getHeaderImage(), fFloatValue3, c28655q2, AbstractC22403o.f87638a);
                long j17 = f173296b;
                float fM128830i5 = m128830i0(interfaceC28670t2);
                objM87133R5 = c28655q2.m87133R();
                i18 = 12;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C39382e(i18, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R5);
                }
                int i214 = i27 & 7168;
                C0209i c0209i19 = c0209i3;
                i19 = i214;
                i24 = i27;
                c28676v1 = c28676v0;
                m128798L(viewState, j17, fM128830i5, function8, (Function1) objM87133R5, c28655q2, (i27 & 14) | 24624 | i214);
                function9 = function8;
                c28655q = c28655q2;
                Modifier modifierM7154a7 = AbstractC2294a.m7154a(1.0f, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), c13821r1M92099U, 14));
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM7154a7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N14);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f173295a + m128820d0(interfaceC28601c1), c2314t));
                c28655q.m87150e0(509639880);
                it = viewState.m118543h().iterator();
                while (true) {
                    Object obj7 = null;
                    r28 = 0;
                    r27 = 0;
                    r26 = 0;
                    r25 = 0;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    interfaceC25312u = (InterfaceC25312u) it.next();
                    if (interfaceC25312u instanceof C38043a) {
                        c38043a = (C38043a) interfaceC25312u;
                    } else {
                        c38043a = null;
                    }
                    if (c38043a != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    boolean z215 = !z16;
                    objM87133R13 = c28655q.m87133R();
                    c28676v3 = c28676v1;
                    if (objM87133R13 == c28676v3) {
                        objM87133R13 = new C39913g(27);
                        c28655q.m87172p0(objM87133R13);
                    }
                    Modifier modifierM44099b6 = AbstractC15676d.m44099b(c2314t, z215, (Function1) objM87133R13);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM44099b6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                    C25307p c25307pM125252h6 = AbstractC39285a.m125252h();
                    C13258u c13258u6 = new C13258u(6, interfaceC25312u);
                    boolean zM87157i11 = c28655q.m87157i(interfaceC25312u);
                    i26 = i19;
                    if (i26 == 2048) {
                        z17 = z13;
                    } else {
                        z17 = false;
                    }
                    boolean z216 = (zM87157i11 ? 1 : 0) | z17;
                    if ((i24 & 112) == 32) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    z19 = (z216 ? 1 : 0) | z18;
                    objM87133R14 = c28655q.m87133R();
                    if (z19) {
                        z24 = z13;
                        objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        z24 = z13;
                        objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                        c28655q.m87172p0(objM87133R14);
                    }
                    i19 = i26;
                    C28655q c28655q8 = c28655q;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM125252h6, c13258u6, (Function1) objM87133R14, c28655q8, C25307p.f99300b << 3, 0);
                    c28655q8.m87173q(z24);
                    z13 = z24;
                    c28676v1 = c28676v3;
                    c28655q = c28655q8;
                }
                c28655q2 = c28655q;
                z14 = z13;
                c28676v2 = c28676v1;
                c28655q2.m87173q(false);
                WeakHashMap weakHashMap6 = C22944c2.f90553v;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), c2314t));
                if (viewState.getFooter() != null) {
                    c28655q2.m87150e0(-1379871239);
                    AbstractC30007c.m91851u(c2314t, m128824f0(interfaceC28601c2), c28655q2, false);
                } else {
                    c28655q2.m87150e0(-1379794359);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
                sanguineWaitlistFooterM118540e = viewState.getFooter();
                if (sanguineWaitlistFooterM118540e == null) {
                    c28655q2.m87150e0(2105976810);
                    c28655q2.m87173q(false);
                    function5 = onAnalyticsEvent;
                    function3 = function7;
                } else {
                    c28655q2.m87150e0(2105976811);
                    Modifier modifierMo3400a6 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H);
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v2) {
                        objM87133R6 = new C39382e(13, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    int i3119 = i24 << 3;
                    function5 = onAnalyticsEvent;
                    function3 = function7;
                    m128794H(modifierMo3400a6, sanguineWaitlistFooterM118540e, function5, function3, (Function1) objM87133R6, c28655q2, (i3119 & 7168) | (i3119 & 896) | 24576);
                    c28655q2.m87173q(false);
                }
                if (viewState.getWaitlistJoinModalState() instanceof AbstractC33208p0.h) {
                    c28655q2.m87150e0(2106411555);
                    AbstractC33208p0 abstractC33208p0M118544i7 = viewState.getWaitlistJoinModalState();
                    boolean zM87157i12 = c28655q2.m87157i(viewState);
                    if ((i24 & 896) == 256) {
                        r19 = z14;
                    } else {
                        r19 = 0;
                    }
                    r24 = (zM87157i12 ? 1 : 0) | r19;
                    objM87133R12 = c28655q2.m87133R();
                    if (r24 == 0) {
                        objM87133R12 = new a(viewState, function3, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new a(viewState, function3, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, abstractC33208p0M118544i7);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(2106715231);
                    c28655q2.m87173q(false);
                }
                abstractC33208p0M118544i = viewState.getWaitlistJoinModalState();
                if (abstractC33208p0M118544i == null) {
                    c28655q2.m87150e0(2106822242);
                    c28655q2.m87173q(false);
                    z15 = z14;
                } else {
                    c28655q2.m87150e0(2106822243);
                    modifierM7154a = AbstractC2294a.m7154a(3.0f, c2314t);
                    if (abstractC33208p0M118544i instanceof AbstractC33208p0.f) {
                        c28655q2.m87150e0(1161046330);
                        TextResource textResourceM21267a16 = AbstractC8693b.m21267a();
                        int i31110 = AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3);
                        z15 = z14 ? 1 : 0;
                        AbstractC33199m0.m105214F((AbstractC33208p0.f) abstractC33208p0M118544i, textResourceM21267a16, null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, i31110, 0, 3580);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else {
                        z15 = z14 ? 1 : 0;
                        if (abstractC33208p0M118544i instanceof AbstractC33208p0.h) {
                            c28655q2.m87150e0(1161321362);
                            AbstractC33208p0.h hVar6 = (AbstractC33208p0.h) abstractC33208p0M118544i;
                            TextResource textResourceM21267a17 = AbstractC8693b.m21267a();
                            if ((i24 & 896) == 256) {
                                r18 = z15 ? 1 : 0;
                            } else {
                                r18 = 0;
                            }
                            objM87133R11 = c28655q2.m87133R();
                            if (r18 == 0) {
                                objM87133R11 = new C39609i(function3, 20);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C39609i(function3, 20);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            AbstractC33199m0.m105214F(hVar6, textResourceM21267a17, (InterfaceC4339a) objM87133R11, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3576);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.b) {
                            c28655q2.m87150e0(1161692122);
                            if ((i24 & 112) == 32) {
                                r10 = z15 ? 1 : 0;
                            } else {
                                r10 = 0;
                            }
                            objM87133R7 = c28655q2.m87133R();
                            if (r10 == 0) {
                                objM87133R7 = new b(function5, null);
                                c28655q2.m87172p0(objM87133R7);
                            } else {
                                objM87133R7 = new b(function5, null);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, viewState);
                            AbstractC33208p0.b bVar6 = (AbstractC33208p0.b) abstractC33208p0M118544i;
                            TextResource textResourceM21267a18 = AbstractC8693b.m21267a();
                            int i31111 = 2;
                            TextResource.C8688b c8688b11 = new TextResource.C8688b(AbstractC35283c.f150176N, r25 == true ? 1 : 0, i31111, r26 == true ? 1 : 0);
                            TextResource.C8688b c8688b12 = new TextResource.C8688b(AbstractC16277f.f62253K, r27 == true ? 1 : 0, i31111, r28 == true ? 1 : 0);
                            r14 = i24 & 896;
                            if (r14 == 256) {
                                r15 = z15 ? 1 : 0;
                            } else {
                                r15 = 0;
                            }
                            objM87133R8 = c28655q2.m87133R();
                            i25 = 21;
                            if (r15 == 0) {
                                objM87133R8 = new C39609i(function3, i25);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                objM87133R8 = new C39609i(function3, i25);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R8;
                            if (r14 == 256) {
                                r16 = z15 ? 1 : 0;
                            } else {
                                r16 = 0;
                            }
                            objM87133R9 = c28655q2.m87133R();
                            if (r16 == 0) {
                                objM87133R9 = new C39609i(function3, 18);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C39609i(function3, 18);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R9;
                            if (r14 == 256) {
                                r17 = z15 ? 1 : 0;
                            } else {
                                r17 = 0;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (r17 == 0) {
                                objM87133R10 = new C39609i(function3, 19);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C39609i(function3, 19);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R10;
                            int i31112 = 805502976 | AbstractC33208p0.f138461d | (TextResource.$stable << 3);
                            int i31113 = TextResource.C8688b.f25889c;
                            AbstractC33199m0.m105214F(bVar6, textResourceM21267a18, interfaceC4339a16, c8688b11, interfaceC4339a17, true, false, c8688b12, interfaceC4339a18, modifierM7154a, false, false, c28655q2, i31112 | (i31113 << 9) | (i31113 << 21), 0, 3136);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.c) {
                            c28655q2.m87150e0(1162653370);
                            AbstractC33199m0.m105214F((AbstractC33208p0.c) abstractC33208p0M118544i, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3580);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1162873873);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z15);
                function6 = function9;
            } else {
                function5 = onAnalyticsEvent;
                c28655q2.m87138X();
                function6 = function4;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) viewState, function5, function3, function6, i13, i14, 20);
            }
        }
        i27 |= 3072;
        function4 = function2;
        i17 = 0;
        if ((i27 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i27 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R16 = c28655q2.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = new C39913g(25);
                    c28655q2.m87172p0(objM87133R16);
                }
                function7 = (Function1) objM87133R16;
            } else {
                function7 = function3;
            }
            if (i15 != 0) {
                objM87133R15 = c28655q2.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C39913g(26);
                    c28655q2.m87172p0(objM87133R15);
                }
                function8 = (Function1) objM87133R15;
            } else {
                function8 = function4;
            }
            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(new C39174f(85));
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(new C39174f(160));
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            zM87153g = c28655q2.m87153g(c13821r1M92099U);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R3 = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, i17));
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = AbstractC28683x.m87264r(new C40157c(interfaceC39171c, c13821r1M92099U, i17));
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
            zM87147d = c28655q2.m87147d(m128830i0(interfaceC28670t2));
            objM87133R4 = c28655q2.m87133R();
            z13 = true;
            if (zM87147d) {
                objM87133R4 = Float.valueOf(AbstractC11329a0.f36295d.mo7226i(1.0f - m128830i0(interfaceC28670t2)));
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = Float.valueOf(AbstractC11329a0.f36295d.mo7226i(1.0f - m128830i0(interfaceC28670t2)));
                c28655q2.m87172p0(objM87133R4);
            }
            float fFloatValue4 = ((Number) objM87133R4).floatValue();
            c2314t = C2314t.f9131w;
            Modifier modifierM44028b3 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM44028b3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d4);
            C0209i c0209i110 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i110, interfaceC28653p1M87165m16);
            c0209i2 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c0209i3 = c0209i;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N16);
                m128792F(viewState.getHeaderImage(), fFloatValue4, c28655q2, AbstractC22403o.f87638a);
                long j18 = f173296b;
                float fM128830i6 = m128830i0(interfaceC28670t2);
                objM87133R5 = c28655q2.m87133R();
                i18 = 12;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C39382e(i18, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R5);
                }
                int i215 = i27 & 7168;
                C0209i c0209i112 = c0209i3;
                i19 = i215;
                i24 = i27;
                c28676v1 = c28676v0;
                m128798L(viewState, j18, fM128830i6, function8, (Function1) objM87133R5, c28655q2, (i27 & 14) | 24624 | i215);
                function9 = function8;
                c28655q = c28655q2;
                Modifier modifierM7154a8 = AbstractC2294a.m7154a(1.0f, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), c13821r1M92099U, 14));
                C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM7154a8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, c23010xM66775a13);
                AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m17);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N17);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f173295a + m128820d0(interfaceC28601c1), c2314t));
                c28655q.m87150e0(509639880);
                it = viewState.m118543h().iterator();
                while (true) {
                    Object obj8 = null;
                    r28 = 0;
                    r27 = 0;
                    r26 = 0;
                    r25 = 0;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    interfaceC25312u = (InterfaceC25312u) it.next();
                    if (interfaceC25312u instanceof C38043a) {
                        c38043a = (C38043a) interfaceC25312u;
                    } else {
                        c38043a = null;
                    }
                    if (c38043a != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    boolean z217 = !z16;
                    objM87133R13 = c28655q.m87133R();
                    c28676v3 = c28676v1;
                    if (objM87133R13 == c28676v3) {
                        objM87133R13 = new C39913g(27);
                        c28655q.m87172p0(objM87133R13);
                    }
                    Modifier modifierM44099b7 = AbstractC15676d.m44099b(c2314t, z217, (Function1) objM87133R13);
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM44099b7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m18);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N18);
                    C25307p c25307pM125252h7 = AbstractC39285a.m125252h();
                    C13258u c13258u7 = new C13258u(6, interfaceC25312u);
                    boolean zM87157i13 = c28655q.m87157i(interfaceC25312u);
                    i26 = i19;
                    if (i26 == 2048) {
                        z17 = z13;
                    } else {
                        z17 = false;
                    }
                    boolean z218 = (zM87157i13 ? 1 : 0) | z17;
                    if ((i24 & 112) == 32) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    z19 = (z218 ? 1 : 0) | z18;
                    objM87133R14 = c28655q.m87133R();
                    if (z19) {
                        z24 = z13;
                        objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                        c28655q.m87172p0(objM87133R14);
                    } else {
                        z24 = z13;
                        objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                        c28655q.m87172p0(objM87133R14);
                    }
                    i19 = i26;
                    C28655q c28655q9 = c28655q;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM125252h7, c13258u7, (Function1) objM87133R14, c28655q9, C25307p.f99300b << 3, 0);
                    c28655q9.m87173q(z24);
                    z13 = z24;
                    c28676v1 = c28676v3;
                    c28655q = c28655q9;
                }
                c28655q2 = c28655q;
                z14 = z13;
                c28676v2 = c28676v1;
                c28655q2.m87173q(false);
                WeakHashMap weakHashMap7 = C22944c2.f90553v;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), c2314t));
                if (viewState.getFooter() != null) {
                    c28655q2.m87150e0(-1379871239);
                    AbstractC30007c.m91851u(c2314t, m128824f0(interfaceC28601c2), c28655q2, false);
                } else {
                    c28655q2.m87150e0(-1379794359);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
                sanguineWaitlistFooterM118540e = viewState.getFooter();
                if (sanguineWaitlistFooterM118540e == null) {
                    c28655q2.m87150e0(2105976810);
                    c28655q2.m87173q(false);
                    function5 = onAnalyticsEvent;
                    function3 = function7;
                } else {
                    c28655q2.m87150e0(2105976811);
                    Modifier modifierMo3400a7 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H);
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v2) {
                        objM87133R6 = new C39382e(13, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    int i31114 = i24 << 3;
                    function5 = onAnalyticsEvent;
                    function3 = function7;
                    m128794H(modifierMo3400a7, sanguineWaitlistFooterM118540e, function5, function3, (Function1) objM87133R6, c28655q2, (i31114 & 7168) | (i31114 & 896) | 24576);
                    c28655q2.m87173q(false);
                }
                if (viewState.getWaitlistJoinModalState() instanceof AbstractC33208p0.h) {
                    c28655q2.m87150e0(2106411555);
                    AbstractC33208p0 abstractC33208p0M118544i8 = viewState.getWaitlistJoinModalState();
                    boolean zM87157i14 = c28655q2.m87157i(viewState);
                    if ((i24 & 896) == 256) {
                        r19 = z14;
                    } else {
                        r19 = 0;
                    }
                    r24 = (zM87157i14 ? 1 : 0) | r19;
                    objM87133R12 = c28655q2.m87133R();
                    if (r24 == 0) {
                        objM87133R12 = new a(viewState, function3, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new a(viewState, function3, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, abstractC33208p0M118544i8);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(2106715231);
                    c28655q2.m87173q(false);
                }
                abstractC33208p0M118544i = viewState.getWaitlistJoinModalState();
                if (abstractC33208p0M118544i == null) {
                    c28655q2.m87150e0(2106822242);
                    c28655q2.m87173q(false);
                    z15 = z14;
                } else {
                    c28655q2.m87150e0(2106822243);
                    modifierM7154a = AbstractC2294a.m7154a(3.0f, c2314t);
                    if (abstractC33208p0M118544i instanceof AbstractC33208p0.f) {
                        c28655q2.m87150e0(1161046330);
                        TextResource textResourceM21267a19 = AbstractC8693b.m21267a();
                        int i31115 = AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3);
                        z15 = z14 ? 1 : 0;
                        AbstractC33199m0.m105214F((AbstractC33208p0.f) abstractC33208p0M118544i, textResourceM21267a19, null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, i31115, 0, 3580);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else {
                        z15 = z14 ? 1 : 0;
                        if (abstractC33208p0M118544i instanceof AbstractC33208p0.h) {
                            c28655q2.m87150e0(1161321362);
                            AbstractC33208p0.h hVar7 = (AbstractC33208p0.h) abstractC33208p0M118544i;
                            TextResource textResourceM21267a110 = AbstractC8693b.m21267a();
                            if ((i24 & 896) == 256) {
                                r18 = z15 ? 1 : 0;
                            } else {
                                r18 = 0;
                            }
                            objM87133R11 = c28655q2.m87133R();
                            if (r18 == 0) {
                                objM87133R11 = new C39609i(function3, 20);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C39609i(function3, 20);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            AbstractC33199m0.m105214F(hVar7, textResourceM21267a110, (InterfaceC4339a) objM87133R11, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3576);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.b) {
                            c28655q2.m87150e0(1161692122);
                            if ((i24 & 112) == 32) {
                                r10 = z15 ? 1 : 0;
                            } else {
                                r10 = 0;
                            }
                            objM87133R7 = c28655q2.m87133R();
                            if (r10 == 0) {
                                objM87133R7 = new b(function5, null);
                                c28655q2.m87172p0(objM87133R7);
                            } else {
                                objM87133R7 = new b(function5, null);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, viewState);
                            AbstractC33208p0.b bVar7 = (AbstractC33208p0.b) abstractC33208p0M118544i;
                            TextResource textResourceM21267a111 = AbstractC8693b.m21267a();
                            int i31116 = 2;
                            TextResource.C8688b c8688b13 = new TextResource.C8688b(AbstractC35283c.f150176N, r25 == true ? 1 : 0, i31116, r26 == true ? 1 : 0);
                            TextResource.C8688b c8688b14 = new TextResource.C8688b(AbstractC16277f.f62253K, r27 == true ? 1 : 0, i31116, r28 == true ? 1 : 0);
                            r14 = i24 & 896;
                            if (r14 == 256) {
                                r15 = z15 ? 1 : 0;
                            } else {
                                r15 = 0;
                            }
                            objM87133R8 = c28655q2.m87133R();
                            i25 = 21;
                            if (r15 == 0) {
                                objM87133R8 = new C39609i(function3, i25);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                objM87133R8 = new C39609i(function3, i25);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R8;
                            if (r14 == 256) {
                                r16 = z15 ? 1 : 0;
                            } else {
                                r16 = 0;
                            }
                            objM87133R9 = c28655q2.m87133R();
                            if (r16 == 0) {
                                objM87133R9 = new C39609i(function3, 18);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C39609i(function3, 18);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R9;
                            if (r14 == 256) {
                                r17 = z15 ? 1 : 0;
                            } else {
                                r17 = 0;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (r17 == 0) {
                                objM87133R10 = new C39609i(function3, 19);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C39609i(function3, 19);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R10;
                            int i31117 = 805502976 | AbstractC33208p0.f138461d | (TextResource.$stable << 3);
                            int i31118 = TextResource.C8688b.f25889c;
                            AbstractC33199m0.m105214F(bVar7, textResourceM21267a111, interfaceC4339a19, c8688b13, interfaceC4339a110, true, false, c8688b14, interfaceC4339a111, modifierM7154a, false, false, c28655q2, i31117 | (i31118 << 9) | (i31118 << 21), 0, 3136);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.c) {
                            c28655q2.m87150e0(1162653370);
                            AbstractC33199m0.m105214F((AbstractC33208p0.c) abstractC33208p0M118544i, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3580);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1162873873);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z15);
                function6 = function9;
            } else {
                c0209i3 = c0209i;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
            C0209i c0209i113 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i113, modifierM118962N16);
            m128792F(viewState.getHeaderImage(), fFloatValue4, c28655q2, AbstractC22403o.f87638a);
            long j19 = f173296b;
            float fM128830i7 = m128830i0(interfaceC28670t2);
            objM87133R5 = c28655q2.m87133R();
            i18 = 12;
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C39382e(i18, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R5);
            }
            int i216 = i27 & 7168;
            C0209i c0209i114 = c0209i3;
            i19 = i216;
            i24 = i27;
            c28676v1 = c28676v0;
            m128798L(viewState, j19, fM128830i7, function8, (Function1) objM87133R5, c28655q2, (i27 & 14) | 24624 | i216);
            function9 = function8;
            c28655q = c28655q2;
            Modifier modifierM7154a9 = AbstractC2294a.m7154a(1.0f, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), c13821r1M92099U, 14));
            C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(12), c2305k, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM7154a9);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i114, c23010xM66775a15);
            AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC28653p1M87165m19);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i113, modifierM118962N19);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f173295a + m128820d0(interfaceC28601c1), c2314t));
            c28655q.m87150e0(509639880);
            it = viewState.m118543h().iterator();
            while (true) {
                Object obj9 = null;
                r28 = 0;
                r27 = 0;
                r26 = 0;
                r25 = 0;
                if (it.hasNext()) {
                    break;
                    break;
                }
                interfaceC25312u = (InterfaceC25312u) it.next();
                if (interfaceC25312u instanceof C38043a) {
                    c38043a = (C38043a) interfaceC25312u;
                } else {
                    c38043a = null;
                }
                if (c38043a != null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                boolean z219 = !z16;
                objM87133R13 = c28655q.m87133R();
                c28676v3 = c28676v1;
                if (objM87133R13 == c28676v3) {
                    objM87133R13 = new C39913g(27);
                    c28655q.m87172p0(objM87133R13);
                }
                Modifier modifierM44099b8 = AbstractC15676d.m44099b(c2314t, z219, (Function1) objM87133R13);
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM44099b8);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m110);
                c0209i4 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N110);
                C25307p c25307pM125252h8 = AbstractC39285a.m125252h();
                C13258u c13258u8 = new C13258u(6, interfaceC25312u);
                boolean zM87157i15 = c28655q.m87157i(interfaceC25312u);
                i26 = i19;
                if (i26 == 2048) {
                    z17 = z13;
                } else {
                    z17 = false;
                }
                boolean z2110 = (zM87157i15 ? 1 : 0) | z17;
                if ((i24 & 112) == 32) {
                    z18 = z13;
                } else {
                    z18 = false;
                }
                z19 = (z2110 ? 1 : 0) | z18;
                objM87133R14 = c28655q.m87133R();
                if (z19) {
                    z24 = z13;
                    objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                    c28655q.m87172p0(objM87133R14);
                } else {
                    z24 = z13;
                    objM87133R14 = new C28442e(interfaceC25312u, function9, onAnalyticsEvent, z24 ? 1 : 0);
                    c28655q.m87172p0(objM87133R14);
                }
                i19 = i26;
                C28655q c28655q10 = c28655q;
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM125252h8, c13258u8, (Function1) objM87133R14, c28655q10, C25307p.f99300b << 3, 0);
                c28655q10.m87173q(z24);
                z13 = z24;
                c28676v1 = c28676v3;
                c28655q = c28655q10;
            }
            c28655q2 = c28655q;
            z14 = z13;
            c28676v2 = c28676v1;
            c28655q2.m87173q(false);
            WeakHashMap weakHashMap8 = C22944c2.f90553v;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), c2314t));
            if (viewState.getFooter() != null) {
                c28655q2.m87150e0(-1379871239);
                AbstractC30007c.m91851u(c2314t, m128824f0(interfaceC28601c2), c28655q2, false);
            } else {
                c28655q2.m87150e0(-1379794359);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z14);
            sanguineWaitlistFooterM118540e = viewState.getFooter();
            if (sanguineWaitlistFooterM118540e == null) {
                c28655q2.m87150e0(2105976810);
                c28655q2.m87173q(false);
                function5 = onAnalyticsEvent;
                function3 = function7;
            } else {
                c28655q2.m87150e0(2105976811);
                Modifier modifierMo3400a8 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H);
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v2) {
                    objM87133R6 = new C39382e(13, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R6);
                }
                int i31119 = i24 << 3;
                function5 = onAnalyticsEvent;
                function3 = function7;
                m128794H(modifierMo3400a8, sanguineWaitlistFooterM118540e, function5, function3, (Function1) objM87133R6, c28655q2, (i31119 & 7168) | (i31119 & 896) | 24576);
                c28655q2.m87173q(false);
            }
            if (viewState.getWaitlistJoinModalState() instanceof AbstractC33208p0.h) {
                c28655q2.m87150e0(2106411555);
                AbstractC33208p0 abstractC33208p0M118544i9 = viewState.getWaitlistJoinModalState();
                boolean zM87157i16 = c28655q2.m87157i(viewState);
                if ((i24 & 896) == 256) {
                    r19 = z14;
                } else {
                    r19 = 0;
                }
                r24 = (zM87157i16 ? 1 : 0) | r19;
                objM87133R12 = c28655q2.m87133R();
                if (r24 == 0) {
                    objM87133R12 = new a(viewState, function3, null);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new a(viewState, function3, null);
                    c28655q2.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, abstractC33208p0M118544i9);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(2106715231);
                c28655q2.m87173q(false);
            }
            abstractC33208p0M118544i = viewState.getWaitlistJoinModalState();
            if (abstractC33208p0M118544i == null) {
                c28655q2.m87150e0(2106822242);
                c28655q2.m87173q(false);
                z15 = z14;
            } else {
                c28655q2.m87150e0(2106822243);
                modifierM7154a = AbstractC2294a.m7154a(3.0f, c2314t);
                if (abstractC33208p0M118544i instanceof AbstractC33208p0.f) {
                    c28655q2.m87150e0(1161046330);
                    TextResource textResourceM21267a112 = AbstractC8693b.m21267a();
                    int i311110 = AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3);
                    z15 = z14 ? 1 : 0;
                    AbstractC33199m0.m105214F((AbstractC33208p0.f) abstractC33208p0M118544i, textResourceM21267a112, null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, i311110, 0, 3580);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    z15 = z14 ? 1 : 0;
                    if (abstractC33208p0M118544i instanceof AbstractC33208p0.h) {
                        c28655q2.m87150e0(1161321362);
                        AbstractC33208p0.h hVar8 = (AbstractC33208p0.h) abstractC33208p0M118544i;
                        TextResource textResourceM21267a113 = AbstractC8693b.m21267a();
                        if ((i24 & 896) == 256) {
                            r18 = z15 ? 1 : 0;
                        } else {
                            r18 = 0;
                        }
                        objM87133R11 = c28655q2.m87133R();
                        if (r18 == 0) {
                            objM87133R11 = new C39609i(function3, 20);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C39609i(function3, 20);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        AbstractC33199m0.m105214F(hVar8, textResourceM21267a113, (InterfaceC4339a) objM87133R11, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3576);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.b) {
                        c28655q2.m87150e0(1161692122);
                        if ((i24 & 112) == 32) {
                            r10 = z15 ? 1 : 0;
                        } else {
                            r10 = 0;
                        }
                        objM87133R7 = c28655q2.m87133R();
                        if (r10 == 0) {
                            objM87133R7 = new b(function5, null);
                            c28655q2.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new b(function5, null);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, viewState);
                        AbstractC33208p0.b bVar8 = (AbstractC33208p0.b) abstractC33208p0M118544i;
                        TextResource textResourceM21267a114 = AbstractC8693b.m21267a();
                        int i311111 = 2;
                        TextResource.C8688b c8688b15 = new TextResource.C8688b(AbstractC35283c.f150176N, r25 == true ? 1 : 0, i311111, r26 == true ? 1 : 0);
                        TextResource.C8688b c8688b16 = new TextResource.C8688b(AbstractC16277f.f62253K, r27 == true ? 1 : 0, i311111, r28 == true ? 1 : 0);
                        r14 = i24 & 896;
                        if (r14 == 256) {
                            r15 = z15 ? 1 : 0;
                        } else {
                            r15 = 0;
                        }
                        objM87133R8 = c28655q2.m87133R();
                        i25 = 21;
                        if (r15 == 0) {
                            objM87133R8 = new C39609i(function3, i25);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C39609i(function3, i25);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R8;
                        if (r14 == 256) {
                            r16 = z15 ? 1 : 0;
                        } else {
                            r16 = 0;
                        }
                        objM87133R9 = c28655q2.m87133R();
                        if (r16 == 0) {
                            objM87133R9 = new C39609i(function3, 18);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C39609i(function3, 18);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R9;
                        if (r14 == 256) {
                            r17 = z15 ? 1 : 0;
                        } else {
                            r17 = 0;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (r17 == 0) {
                            objM87133R10 = new C39609i(function3, 19);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C39609i(function3, 19);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R10;
                        int i311112 = 805502976 | AbstractC33208p0.f138461d | (TextResource.$stable << 3);
                        int i311113 = TextResource.C8688b.f25889c;
                        AbstractC33199m0.m105214F(bVar8, textResourceM21267a114, interfaceC4339a112, c8688b15, interfaceC4339a113, true, false, c8688b16, interfaceC4339a114, modifierM7154a, false, false, c28655q2, i311112 | (i311113 << 9) | (i311113 << 21), 0, 3136);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else if (abstractC33208p0M118544i instanceof AbstractC33208p0.c) {
                        c28655q2.m87150e0(1162653370);
                        AbstractC33199m0.m105214F((AbstractC33208p0.c) abstractC33208p0M118544i, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, modifierM7154a, false, false, c28655q2, AbstractC33208p0.f138461d | 805306368 | (TextResource.$stable << 3), 0, 3580);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1162873873);
                        c28655q2.m87173q(false);
                    }
                }
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z15);
            function6 = function9;
        } else {
            function5 = onAnalyticsEvent;
            c28655q2.m87138X();
            function6 = function4;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k((Object) viewState, function5, function3, function6, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m128803Q(InterfaceC36912e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m128804R(AbstractC35773d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m128805S(InterfaceC28601c1 interfaceC28601c1, C39174f c39174f) {
        m128822e0(interfaceC28601c1, c39174f.f168413w);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final Modifier m128806T(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3396r(applyIf, 16, 0.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final Modifier m128807U(InterfaceC25312u interfaceC25312u, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-424535135);
        boolean z4 = interfaceC25312u instanceof C17736e;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C39913g(29);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM44099b = AbstractC15676d.m44099b(C2314t.f9131w, z4, (Function1) objM87133R);
        c28655q.m87173q(false);
        return modifierM44099b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final Modifier m128808V(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 16, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m128809W(InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        boolean z4 = interfaceC25312u instanceof C11474i;
        Object obj = interfaceC25312u;
        if (!z4) {
            obj = event;
        }
        m128787A0(obj, function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m128810X(InterfaceC28601c1 interfaceC28601c1, C39174f c39174f) {
        m128826g0(interfaceC28601c1, c39174f.f168413w);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m128811Y(Function1 function1) {
        function1.invoke(InterfaceC36912e.a.f157926a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m128812Z(Function1 function1) {
        function1.invoke(InterfaceC36912e.a.f157926a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m128814a0(Function1 function1) {
        function1.invoke(InterfaceC36912e.b.f157927a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m128816b0(Function1 function1) {
        function1.invoke(InterfaceC36912e.a.f157926a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m128818c0(AbstractC36914g.c cVar, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m128802P(cVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d0 */
    private static final float m128820d0(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39174f) interfaceC28601c1.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: e0 */
    private static final void m128822e0(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(new C39174f(f13));
    }

    /* JADX INFO: renamed from: f0 */
    private static final float m128824f0(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39174f) interfaceC28601c1.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: g0 */
    private static final void m128826g0(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(new C39174f(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final float m128828h0(InterfaceC39171c interfaceC39171c, C13821r1 c13821r1) {
        float f13 = f173295a;
        if (C39174f.m124782b(f13, 0)) {
            return 1.0f;
        }
        return AbstractC12889b.m36283m(interfaceC39171c.mo733e0(c13821r1.f49318a.m87024x()) / f13, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: i0 */
    private static final float m128830i0(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0109  */
    /* JADX WARN: Code duplicated, block: B:74:0x010c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:78:0x0115  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:84:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x0177  */
    /* JADX WARN: Code duplicated, block: B:96:0x0183  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j0 */
    public static final void m128832j0(C36913f viewModel, String source, boolean z4, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        boolean z14;
        C36913f c36913f;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        boolean zM87157i;
        Object objM87133R;
        boolean z15;
        boolean z16;
        boolean zM87157i2;
        Object objM87133R2;
        C28676v0 c28676v1;
        boolean zM87157i3;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(source, "source");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2088706305);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(source) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            z13 = z4;
            i15 |= c28655q.m87155h(z13) ? 256 : 128;
        } else {
            z13 = z4;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i18 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39913g(24);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39913g(28);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), AbstractC36914g.b.f157951b, null, c28655q, 48, 2);
                    AbstractC14874j.m42904c(m128850s0(interfaceC28601c1M87260n), "sanguine_waitlist", c28655q, 48);
                    zM87157i = c28655q.m87157i(viewModel);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new e(viewModel, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
                    Boolean boolValueOf = Boolean.valueOf(z13);
                    if ((i18 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i18 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i2 = z15 | z16 | ((i18 & 112) == 32) | c28655q.m87157i(viewModel);
                    objM87133R2 = c28655q.m87133R();
                    if (!zM87157i2 || objM87133R2 == c28676v0) {
                        c28676v1 = c28676v0;
                        f fVar = new f(z13, function7, source, viewModel, null);
                        c36913f = viewModel;
                        c28655q.m87172p0(fVar);
                        objM87133R2 = fVar;
                    } else {
                        c28676v1 = c28676v0;
                        c36913f = viewModel;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                    AbstractC36914g abstractC36914gM128850s0 = m128850s0(interfaceC28601c1M87260n);
                    zM87157i3 = c28655q.m87157i(c36913f);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i3 || objM87133R3 == c28676v1) {
                        objM87133R3 = new C37894h1(c36913f, 14);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function9 = function7;
                    Function1 function10 = function8;
                    m128834k0(abstractC36914gM128850s0, source, (Function1) objM87133R3, function9, function10, c28655q, 64624 & i18, 0);
                    function6 = function10;
                    function5 = function9;
                } else {
                    c36913f = viewModel;
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33795i(c36913f, source, z4, function5, function6, i13, i14);
                }
            }
            i15 |= 24576;
            function4 = function2;
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39913g(24);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39913g(28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(viewModel.getViewState(), AbstractC36914g.b.f157951b, null, c28655q, 48, 2);
                AbstractC14874j.m42904c(m128850s0(interfaceC28601c1M87260n2), "sanguine_waitlist", c28655q, 48);
                zM87157i = c28655q.m87157i(viewModel);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new e(viewModel, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new e(viewModel, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
                Boolean boolValueOf2 = Boolean.valueOf(z13);
                if ((i18 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i18 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i2 = z15 | z16 | ((i18 & 112) == 32) | c28655q.m87157i(viewModel);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    c28676v1 = c28676v0;
                    f fVar2 = new f(z13, function7, source, viewModel, null);
                    c36913f = viewModel;
                    c28655q.m87172p0(fVar2);
                    objM87133R2 = fVar2;
                } else {
                    c28676v1 = c28676v0;
                    f fVar3 = new f(z13, function7, source, viewModel, null);
                    c36913f = viewModel;
                    c28655q.m87172p0(fVar3);
                    objM87133R2 = fVar3;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf2);
                AbstractC36914g abstractC36914gM128850s1 = m128850s0(interfaceC28601c1M87260n2);
                zM87157i3 = c28655q.m87157i(c36913f);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R3 = new C37894h1(c36913f, 14);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C37894h1(c36913f, 14);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function11 = function7;
                Function1 function12 = function8;
                m128834k0(abstractC36914gM128850s1, source, (Function1) objM87133R3, function11, function12, c28655q, 64624 & i18, 0);
                function6 = function12;
                function5 = function11;
            } else {
                c36913f = viewModel;
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(c36913f, source, z4, function5, function6, i13, i14);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39913g(24);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39913g(28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                InterfaceC28601c1 interfaceC28601c1M87260n3 = AbstractC28683x.m87260n(viewModel.getViewState(), AbstractC36914g.b.f157951b, null, c28655q, 48, 2);
                AbstractC14874j.m42904c(m128850s0(interfaceC28601c1M87260n3), "sanguine_waitlist", c28655q, 48);
                zM87157i = c28655q.m87157i(viewModel);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new e(viewModel, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new e(viewModel, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
                Boolean boolValueOf3 = Boolean.valueOf(z13);
                if ((i18 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i18 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i2 = z15 | z16 | ((i18 & 112) == 32) | c28655q.m87157i(viewModel);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2) {
                    c28676v1 = c28676v0;
                    f fVar4 = new f(z13, function7, source, viewModel, null);
                    c36913f = viewModel;
                    c28655q.m87172p0(fVar4);
                    objM87133R2 = fVar4;
                } else {
                    c28676v1 = c28676v0;
                    f fVar5 = new f(z13, function7, source, viewModel, null);
                    c36913f = viewModel;
                    c28655q.m87172p0(fVar5);
                    objM87133R2 = fVar5;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf3);
                AbstractC36914g abstractC36914gM128850s2 = m128850s0(interfaceC28601c1M87260n3);
                zM87157i3 = c28655q.m87157i(c36913f);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R3 = new C37894h1(c36913f, 14);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C37894h1(c36913f, 14);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function13 = function7;
                Function1 function14 = function8;
                m128834k0(abstractC36914gM128850s2, source, (Function1) objM87133R3, function13, function14, c28655q, 64624 & i18, 0);
                function6 = function14;
                function5 = function13;
            } else {
                c36913f = viewModel;
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(c36913f, source, z4, function5, function6, i13, i14);
            }
        }
        i15 |= 24576;
        function4 = function2;
        i18 = i15;
        if ((i18 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i18 & 1, z14)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C39913g(24);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C39913g(28);
                    c28655q.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            InterfaceC28601c1 interfaceC28601c1M87260n4 = AbstractC28683x.m87260n(viewModel.getViewState(), AbstractC36914g.b.f157951b, null, c28655q, 48, 2);
            AbstractC14874j.m42904c(m128850s0(interfaceC28601c1M87260n4), "sanguine_waitlist", c28655q, 48);
            zM87157i = c28655q.m87157i(viewModel);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new e(viewModel, null);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new e(viewModel, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewModel);
            Boolean boolValueOf4 = Boolean.valueOf(z13);
            if ((i18 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i18 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87157i2 = z15 | z16 | ((i18 & 112) == 32) | c28655q.m87157i(viewModel);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i2) {
                c28676v1 = c28676v0;
                f fVar6 = new f(z13, function7, source, viewModel, null);
                c36913f = viewModel;
                c28655q.m87172p0(fVar6);
                objM87133R2 = fVar6;
            } else {
                c28676v1 = c28676v0;
                f fVar7 = new f(z13, function7, source, viewModel, null);
                c36913f = viewModel;
                c28655q.m87172p0(fVar7);
                objM87133R2 = fVar7;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf4);
            AbstractC36914g abstractC36914gM128850s3 = m128850s0(interfaceC28601c1M87260n4);
            zM87157i3 = c28655q.m87157i(c36913f);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R3 = new C37894h1(c36913f, 14);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C37894h1(c36913f, 14);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function15 = function7;
            Function1 function16 = function8;
            m128834k0(abstractC36914gM128850s3, source, (Function1) objM87133R3, function15, function16, c28655q, 64624 & i18, 0);
            function6 = function16;
            function5 = function15;
        } else {
            c36913f = viewModel;
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33795i(c36913f, source, z4, function5, function6, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:108:0x0236  */
    /* JADX WARN: Code duplicated, block: B:110:0x023e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0254  */
    /* JADX WARN: Code duplicated, block: B:113:0x0256  */
    /* JADX WARN: Code duplicated, block: B:116:0x025c  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0267  */
    /* JADX WARN: Code duplicated, block: B:124:0x026f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x0271  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:81:0x0136  */
    /* JADX WARN: Code duplicated, block: B:82:0x013a  */
    /* JADX WARN: Code duplicated, block: B:85:0x014d  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0197  */
    /* JADX WARN: Code duplicated, block: B:91:0x019c  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x01b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static final void m128834k0(AbstractC36914g viewState, String source, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        boolean z4;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Function1 function12;
        Function1 function13;
        int i24;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        boolean z16;
        int i25;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        Object[] objArr;
        Object objM87133R3;
        boolean z17;
        Object objM87133R4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(source, "source");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-77398904);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(source) ? 32 : 16;
        }
        int i26 = i14 & 4;
        if (i26 == 0) {
            if ((i13 & 384) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = 2048;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i19 = 16384;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C40160f(0);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function10 = (Function1) objM87133R7;
                        } else {
                            function10 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C40160f(1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function11 = (Function1) objM87133R6;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C40160f(2);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function6 = (Function1) objM87133R5;
                        }
                        Object[] objArr2 = new Object[0];
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39681c(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R, c28655q, 48);
                        if (viewState instanceof AbstractC36914g.b) {
                            c28655q.m87150e0(607142637);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            function16 = function6;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            function15 = function11;
                            function14 = function10;
                        } else {
                            function12 = function6;
                            if (viewState instanceof AbstractC36914g.a) {
                                c28655q.m87150e0(607525239);
                                if ((i15 & 7168) == 2048) {
                                    objArr = true;
                                } else {
                                    objArr = false;
                                }
                                objM87133R3 = c28655q.m87133R();
                                List list = null;
                                Object[] objArr3 = 0;
                                Object[] objArr4 = 0;
                                Object[] objArr5 = 0;
                                if (objArr == true || objM87133R3 == c28676v0) {
                                    objM87133R3 = new c(function11, null);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                                int i27 = 2;
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i27, objArr5 == true ? 1 : 0), false, null, 6, null);
                                Function1 function17 = function11;
                                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, objArr4 == true ? 1 : 0, i27, objArr3 == true ? 1 : 0);
                                z17 = (i15 & 57344) == 16384;
                                objM87133R4 = c28655q.m87133R();
                                if (z17 || objM87133R4 == c28676v0) {
                                    objM87133R4 = new C39609i(function12, 23);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                function16 = function12;
                                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R4, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                                function14 = function10;
                                function15 = function17;
                            } else {
                                function13 = function11;
                                if (viewState instanceof AbstractC36914g.c) {
                                    throw AbstractC11895b.m32003v(-1365888643, c28655q, false);
                                }
                                c28655q.m87150e0(608096414);
                                AbstractC36914g.c cVar = (AbstractC36914g.c) viewState;
                                C36908a c36908aM118539d = cVar.getAnalyticsInfo();
                                boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
                                i24 = i15 & 14;
                                if (i24 == 4) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                boolean z18 = zM87153g | z13;
                                if ((i15 & 7168) == 2048) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = ((i15 & 112) == 32) | z14 | z18;
                                objM87133R2 = c28655q.m87133R();
                                if (!z15 || objM87133R2 == c28676v0) {
                                    z16 = false;
                                    i25 = i15;
                                    d dVar = new d(viewState, interfaceC28601c1, function13, source, null);
                                    c28655q.m87172p0(dVar);
                                    objM87133R2 = dVar;
                                } else {
                                    i25 = i15;
                                    z16 = false;
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c36908aM118539d);
                                function14 = function10;
                                function15 = function13;
                                m128802P(cVar, function15, function14, function12, c28655q, ((i25 >> 6) & 112) | i24 | (i25 & 896) | ((i25 >> 3) & 7168), 0);
                                function16 = function12;
                                c28655q.m87173q(z16);
                            }
                        }
                        function9 = function16;
                        function8 = function15;
                        function7 = function14;
                    } else {
                        c28655q.m87138X();
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C35766g((Object) viewState, (Object) source, (Object) function7, (Object) function8, (Object) function9, i13, i14, 12);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C40160f(0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C40160f(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C40160f(2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    }
                    Object[] objArr6 = new Object[0];
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr6, (InterfaceC4339a) objM87133R, c28655q, 48);
                    if (viewState instanceof AbstractC36914g.b) {
                        c28655q.m87150e0(607142637);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        function16 = function6;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        function15 = function11;
                        function14 = function10;
                    } else {
                        function12 = function6;
                        if (viewState instanceof AbstractC36914g.a) {
                            c28655q.m87150e0(607525239);
                            if ((i15 & 7168) == 2048) {
                                objArr = true;
                            } else {
                                objArr = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            List list2 = null;
                            Object[] objArr7 = 0;
                            Object[] objArr8 = 0;
                            Object[] objArr9 = 0;
                            if (objArr == true) {
                                objM87133R3 = new c(function11, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new c(function11, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                            int i28 = 2;
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list2, i28, objArr9 == true ? 1 : 0), false, null, 6, null);
                            Function1 function18 = function11;
                            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr8 == true ? 1 : 0, i28, objArr7 == true ? 1 : 0);
                            if ((i15 & 57344) == 16384) {
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z17) {
                                objM87133R4 = new C39609i(function12, 23);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C39609i(function12, 23);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function16 = function12;
                            AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R4, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function14 = function10;
                            function15 = function18;
                        } else {
                            function13 = function11;
                            if (viewState instanceof AbstractC36914g.c) {
                                throw AbstractC11895b.m32003v(-1365888643, c28655q, false);
                            }
                            c28655q.m87150e0(608096414);
                            AbstractC36914g.c cVar2 = (AbstractC36914g.c) viewState;
                            C36908a c36908aM118539d2 = cVar2.getAnalyticsInfo();
                            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                            i24 = i15 & 14;
                            if (i24 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z19 = zM87153g2 | z13;
                            if ((i15 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = ((i15 & 112) == 32) | z14 | z19;
                            objM87133R2 = c28655q.m87133R();
                            if (z15) {
                                z16 = false;
                                i25 = i15;
                                d dVar2 = new d(viewState, interfaceC28601c1, function13, source, null);
                                c28655q.m87172p0(dVar2);
                                objM87133R2 = dVar2;
                            } else {
                                z16 = false;
                                i25 = i15;
                                d dVar3 = new d(viewState, interfaceC28601c1, function13, source, null);
                                c28655q.m87172p0(dVar3);
                                objM87133R2 = dVar3;
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c36908aM118539d2);
                            function14 = function10;
                            function15 = function13;
                            m128802P(cVar2, function15, function14, function12, c28655q, ((i25 >> 6) & 112) | i24 | (i25 & 896) | ((i25 >> 3) & 7168), 0);
                            function16 = function12;
                            c28655q.m87173q(z16);
                        }
                    }
                    function9 = function16;
                    function8 = function15;
                    function7 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) viewState, (Object) source, (Object) function7, (Object) function8, (Object) function9, i13, i14, 12);
                }
            }
            i15 |= 3072;
            function5 = function2;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = 16384;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C40160f(0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C40160f(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C40160f(2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    }
                    Object[] objArr10 = new Object[0];
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr10, (InterfaceC4339a) objM87133R, c28655q, 48);
                    if (viewState instanceof AbstractC36914g.b) {
                        c28655q.m87150e0(607142637);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        function16 = function6;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        function15 = function11;
                        function14 = function10;
                    } else {
                        function12 = function6;
                        if (viewState instanceof AbstractC36914g.a) {
                            c28655q.m87150e0(607525239);
                            if ((i15 & 7168) == 2048) {
                                objArr = true;
                            } else {
                                objArr = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            List list3 = null;
                            Object[] objArr11 = 0;
                            Object[] objArr12 = 0;
                            Object[] objArr13 = 0;
                            if (objArr == true) {
                                objM87133R3 = new c(function11, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new c(function11, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                            int i29 = 2;
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list3, i29, objArr13 == true ? 1 : 0), false, null, 6, null);
                            Function1 function19 = function11;
                            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr12 == true ? 1 : 0, i29, objArr11 == true ? 1 : 0);
                            if ((i15 & 57344) == 16384) {
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z17) {
                                objM87133R4 = new C39609i(function12, 23);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C39609i(function12, 23);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function16 = function12;
                            AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b3, (InterfaceC4339a) objM87133R4, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function14 = function10;
                            function15 = function19;
                        } else {
                            function13 = function11;
                            if (viewState instanceof AbstractC36914g.c) {
                                throw AbstractC11895b.m32003v(-1365888643, c28655q, false);
                            }
                            c28655q.m87150e0(608096414);
                            AbstractC36914g.c cVar3 = (AbstractC36914g.c) viewState;
                            C36908a c36908aM118539d3 = cVar3.getAnalyticsInfo();
                            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1);
                            i24 = i15 & 14;
                            if (i24 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z110 = zM87153g3 | z13;
                            if ((i15 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = ((i15 & 112) == 32) | z14 | z110;
                            objM87133R2 = c28655q.m87133R();
                            if (z15) {
                                z16 = false;
                                i25 = i15;
                                d dVar4 = new d(viewState, interfaceC28601c1, function13, source, null);
                                c28655q.m87172p0(dVar4);
                                objM87133R2 = dVar4;
                            } else {
                                z16 = false;
                                i25 = i15;
                                d dVar5 = new d(viewState, interfaceC28601c1, function13, source, null);
                                c28655q.m87172p0(dVar5);
                                objM87133R2 = dVar5;
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c36908aM118539d3);
                            function14 = function10;
                            function15 = function13;
                            m128802P(cVar3, function15, function14, function12, c28655q, ((i25 >> 6) & 112) | i24 | (i25 & 896) | ((i25 >> 3) & 7168), 0);
                            function16 = function12;
                            c28655q.m87173q(z16);
                        }
                    }
                    function9 = function16;
                    function8 = function15;
                    function7 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) viewState, (Object) source, (Object) function7, (Object) function8, (Object) function9, i13, i14, 12);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C40160f(0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C40160f(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40160f(2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                }
                Object[] objArr14 = new Object[0];
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39681c(27);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr14, (InterfaceC4339a) objM87133R, c28655q, 48);
                if (viewState instanceof AbstractC36914g.b) {
                    c28655q.m87150e0(607142637);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    function16 = function6;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    function15 = function11;
                    function14 = function10;
                } else {
                    function12 = function6;
                    if (viewState instanceof AbstractC36914g.a) {
                        c28655q.m87150e0(607525239);
                        if ((i15 & 7168) == 2048) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        List list4 = null;
                        Object[] objArr15 = 0;
                        Object[] objArr16 = 0;
                        Object[] objArr17 = 0;
                        if (objArr == true) {
                            objM87133R3 = new c(function11, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new c(function11, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                        int i210 = 2;
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list4, i210, objArr17 == true ? 1 : 0), false, null, 6, null);
                        Function1 function110 = function11;
                        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr16 == true ? 1 : 0, i210, objArr15 == true ? 1 : 0);
                        if ((i15 & 57344) == 16384) {
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z17) {
                            objM87133R4 = new C39609i(function12, 23);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C39609i(function12, 23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function16 = function12;
                        AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b4, (InterfaceC4339a) objM87133R4, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function14 = function10;
                        function15 = function110;
                    } else {
                        function13 = function11;
                        if (viewState instanceof AbstractC36914g.c) {
                            throw AbstractC11895b.m32003v(-1365888643, c28655q, false);
                        }
                        c28655q.m87150e0(608096414);
                        AbstractC36914g.c cVar4 = (AbstractC36914g.c) viewState;
                        C36908a c36908aM118539d4 = cVar4.getAnalyticsInfo();
                        boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1);
                        i24 = i15 & 14;
                        if (i24 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z111 = zM87153g4 | z13;
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = ((i15 & 112) == 32) | z14 | z111;
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            z16 = false;
                            i25 = i15;
                            d dVar6 = new d(viewState, interfaceC28601c1, function13, source, null);
                            c28655q.m87172p0(dVar6);
                            objM87133R2 = dVar6;
                        } else {
                            z16 = false;
                            i25 = i15;
                            d dVar7 = new d(viewState, interfaceC28601c1, function13, source, null);
                            c28655q.m87172p0(dVar7);
                            objM87133R2 = dVar7;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c36908aM118539d4);
                        function14 = function10;
                        function15 = function13;
                        m128802P(cVar4, function15, function14, function12, c28655q, ((i25 >> 6) & 112) | i24 | (i25 & 896) | ((i25 >> 3) & 7168), 0);
                        function16 = function12;
                        c28655q.m87173q(z16);
                    }
                }
                function9 = function16;
                function8 = function15;
                function7 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) viewState, (Object) source, (Object) function7, (Object) function8, (Object) function9, i13, i14, 12);
            }
        }
        i15 |= 384;
        function4 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = 16384;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C40160f(0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function10 = (Function1) objM87133R7;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C40160f(1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function11 = (Function1) objM87133R6;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C40160f(2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    }
                    Object[] objArr18 = new Object[0];
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr18, (InterfaceC4339a) objM87133R, c28655q, 48);
                    if (viewState instanceof AbstractC36914g.b) {
                        c28655q.m87150e0(607142637);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        function16 = function6;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        function15 = function11;
                        function14 = function10;
                    } else {
                        function12 = function6;
                        if (viewState instanceof AbstractC36914g.a) {
                            c28655q.m87150e0(607525239);
                            if ((i15 & 7168) == 2048) {
                                objArr = true;
                            } else {
                                objArr = false;
                            }
                            objM87133R3 = c28655q.m87133R();
                            List list5 = null;
                            Object[] objArr19 = 0;
                            Object[] objArr110 = 0;
                            Object[] objArr111 = 0;
                            if (objArr == true) {
                                objM87133R3 = new c(function11, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new c(function11, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                            int i211 = 2;
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list5, i211, objArr111 == true ? 1 : 0), false, null, 6, null);
                            Function1 function111 = function11;
                            TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr110 == true ? 1 : 0, i211, objArr19 == true ? 1 : 0);
                            if ((i15 & 57344) == 16384) {
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z17) {
                                objM87133R4 = new C39609i(function12, 23);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new C39609i(function12, 23);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function16 = function12;
                            AbstractC33199m0.m105214F(bVar5, textResourceM21267a5, null, c8688b5, (InterfaceC4339a) objM87133R4, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function14 = function10;
                            function15 = function111;
                        } else {
                            function13 = function11;
                            if (viewState instanceof AbstractC36914g.c) {
                                throw AbstractC11895b.m32003v(-1365888643, c28655q, false);
                            }
                            c28655q.m87150e0(608096414);
                            AbstractC36914g.c cVar5 = (AbstractC36914g.c) viewState;
                            C36908a c36908aM118539d5 = cVar5.getAnalyticsInfo();
                            boolean zM87153g5 = c28655q.m87153g(interfaceC28601c1);
                            i24 = i15 & 14;
                            if (i24 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z112 = zM87153g5 | z13;
                            if ((i15 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = ((i15 & 112) == 32) | z14 | z112;
                            objM87133R2 = c28655q.m87133R();
                            if (z15) {
                                z16 = false;
                                i25 = i15;
                                d dVar8 = new d(viewState, interfaceC28601c1, function13, source, null);
                                c28655q.m87172p0(dVar8);
                                objM87133R2 = dVar8;
                            } else {
                                z16 = false;
                                i25 = i15;
                                d dVar9 = new d(viewState, interfaceC28601c1, function13, source, null);
                                c28655q.m87172p0(dVar9);
                                objM87133R2 = dVar9;
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c36908aM118539d5);
                            function14 = function10;
                            function15 = function13;
                            m128802P(cVar5, function15, function14, function12, c28655q, ((i25 >> 6) & 112) | i24 | (i25 & 896) | ((i25 >> 3) & 7168), 0);
                            function16 = function12;
                            c28655q.m87173q(z16);
                        }
                    }
                    function9 = function16;
                    function8 = function15;
                    function7 = function14;
                } else {
                    c28655q.m87138X();
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) viewState, (Object) source, (Object) function7, (Object) function8, (Object) function9, i13, i14, 12);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C40160f(0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C40160f(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40160f(2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                }
                Object[] objArr112 = new Object[0];
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39681c(27);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr112, (InterfaceC4339a) objM87133R, c28655q, 48);
                if (viewState instanceof AbstractC36914g.b) {
                    c28655q.m87150e0(607142637);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    function16 = function6;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    function15 = function11;
                    function14 = function10;
                } else {
                    function12 = function6;
                    if (viewState instanceof AbstractC36914g.a) {
                        c28655q.m87150e0(607525239);
                        if ((i15 & 7168) == 2048) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        List list6 = null;
                        Object[] objArr113 = 0;
                        Object[] objArr114 = 0;
                        Object[] objArr115 = 0;
                        if (objArr == true) {
                            objM87133R3 = new c(function11, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new c(function11, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                        int i212 = 2;
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list6, i212, objArr115 == true ? 1 : 0), false, null, 6, null);
                        Function1 function112 = function11;
                        TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr114 == true ? 1 : 0, i212, objArr113 == true ? 1 : 0);
                        if ((i15 & 57344) == 16384) {
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z17) {
                            objM87133R4 = new C39609i(function12, 23);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C39609i(function12, 23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function16 = function12;
                        AbstractC33199m0.m105214F(bVar6, textResourceM21267a6, null, c8688b6, (InterfaceC4339a) objM87133R4, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function14 = function10;
                        function15 = function112;
                    } else {
                        function13 = function11;
                        if (viewState instanceof AbstractC36914g.c) {
                            throw AbstractC11895b.m32003v(-1365888643, c28655q, false);
                        }
                        c28655q.m87150e0(608096414);
                        AbstractC36914g.c cVar6 = (AbstractC36914g.c) viewState;
                        C36908a c36908aM118539d6 = cVar6.getAnalyticsInfo();
                        boolean zM87153g6 = c28655q.m87153g(interfaceC28601c1);
                        i24 = i15 & 14;
                        if (i24 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z113 = zM87153g6 | z13;
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = ((i15 & 112) == 32) | z14 | z113;
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            z16 = false;
                            i25 = i15;
                            d dVar10 = new d(viewState, interfaceC28601c1, function13, source, null);
                            c28655q.m87172p0(dVar10);
                            objM87133R2 = dVar10;
                        } else {
                            z16 = false;
                            i25 = i15;
                            d dVar11 = new d(viewState, interfaceC28601c1, function13, source, null);
                            c28655q.m87172p0(dVar11);
                            objM87133R2 = dVar11;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c36908aM118539d6);
                        function14 = function10;
                        function15 = function13;
                        m128802P(cVar6, function15, function14, function12, c28655q, ((i25 >> 6) & 112) | i24 | (i25 & 896) | ((i25 >> 3) & 7168), 0);
                        function16 = function12;
                        c28655q.m87173q(z16);
                    }
                }
                function9 = function16;
                function8 = function15;
                function7 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) viewState, (Object) source, (Object) function7, (Object) function8, (Object) function9, i13, i14, 12);
            }
        }
        i15 |= 3072;
        function5 = function2;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i19 = 16384;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C40160f(0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function10 = (Function1) objM87133R7;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C40160f(1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function11 = (Function1) objM87133R6;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40160f(2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                }
                Object[] objArr116 = new Object[0];
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39681c(27);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr116, (InterfaceC4339a) objM87133R, c28655q, 48);
                if (viewState instanceof AbstractC36914g.b) {
                    c28655q.m87150e0(607142637);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    function16 = function6;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    function15 = function11;
                    function14 = function10;
                } else {
                    function12 = function6;
                    if (viewState instanceof AbstractC36914g.a) {
                        c28655q.m87150e0(607525239);
                        if ((i15 & 7168) == 2048) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        List list7 = null;
                        Object[] objArr117 = 0;
                        Object[] objArr118 = 0;
                        Object[] objArr119 = 0;
                        if (objArr == true) {
                            objM87133R3 = new c(function11, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new c(function11, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                        int i213 = 2;
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list7, i213, objArr119 == true ? 1 : 0), false, null, 6, null);
                        Function1 function113 = function11;
                        TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr118 == true ? 1 : 0, i213, objArr117 == true ? 1 : 0);
                        if ((i15 & 57344) == 16384) {
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z17) {
                            objM87133R4 = new C39609i(function12, 23);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C39609i(function12, 23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function16 = function12;
                        AbstractC33199m0.m105214F(bVar7, textResourceM21267a7, null, c8688b7, (InterfaceC4339a) objM87133R4, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function14 = function10;
                        function15 = function113;
                    } else {
                        function13 = function11;
                        if (viewState instanceof AbstractC36914g.c) {
                            throw AbstractC11895b.m32003v(-1365888643, c28655q, false);
                        }
                        c28655q.m87150e0(608096414);
                        AbstractC36914g.c cVar7 = (AbstractC36914g.c) viewState;
                        C36908a c36908aM118539d7 = cVar7.getAnalyticsInfo();
                        boolean zM87153g7 = c28655q.m87153g(interfaceC28601c1);
                        i24 = i15 & 14;
                        if (i24 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z114 = zM87153g7 | z13;
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = ((i15 & 112) == 32) | z14 | z114;
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            z16 = false;
                            i25 = i15;
                            d dVar12 = new d(viewState, interfaceC28601c1, function13, source, null);
                            c28655q.m87172p0(dVar12);
                            objM87133R2 = dVar12;
                        } else {
                            z16 = false;
                            i25 = i15;
                            d dVar13 = new d(viewState, interfaceC28601c1, function13, source, null);
                            c28655q.m87172p0(dVar13);
                            objM87133R2 = dVar13;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c36908aM118539d7);
                        function14 = function10;
                        function15 = function13;
                        m128802P(cVar7, function15, function14, function12, c28655q, ((i25 >> 6) & 112) | i24 | (i25 & 896) | ((i25 >> 3) & 7168), 0);
                        function16 = function12;
                        c28655q.m87173q(z16);
                    }
                }
                function9 = function16;
                function8 = function15;
                function7 = function14;
            } else {
                c28655q.m87138X();
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) viewState, (Object) source, (Object) function7, (Object) function8, (Object) function9, i13, i14, 12);
            }
        }
        i15 |= 24576;
        function6 = function3;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C40160f(0);
                    c28655q.m87172p0(objM87133R7);
                }
                function10 = (Function1) objM87133R7;
            } else {
                function10 = function4;
            }
            if (i16 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C40160f(1);
                    c28655q.m87172p0(objM87133R6);
                }
                function11 = (Function1) objM87133R6;
            } else {
                function11 = function5;
            }
            if (i18 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C40160f(2);
                    c28655q.m87172p0(objM87133R5);
                }
                function6 = (Function1) objM87133R5;
            }
            Object[] objArr1110 = new Object[0];
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C39681c(27);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr1110, (InterfaceC4339a) objM87133R, c28655q, 48);
            if (viewState instanceof AbstractC36914g.b) {
                c28655q.m87150e0(607142637);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                function16 = function6;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                function15 = function11;
                function14 = function10;
            } else {
                function12 = function6;
                if (viewState instanceof AbstractC36914g.a) {
                    c28655q.m87150e0(607525239);
                    if ((i15 & 7168) == 2048) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    List list8 = null;
                    Object[] objArr1111 = 0;
                    Object[] objArr1112 = 0;
                    Object[] objArr1113 = 0;
                    if (objArr == true) {
                        objM87133R3 = new c(function11, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new c(function11, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                    int i214 = 2;
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list8, i214, objArr1113 == true ? 1 : 0), false, null, 6, null);
                    Function1 function114 = function11;
                    TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr1112 == true ? 1 : 0, i214, objArr1111 == true ? 1 : 0);
                    if ((i15 & 57344) == 16384) {
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z17) {
                        objM87133R4 = new C39609i(function12, 23);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C39609i(function12, 23);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function16 = function12;
                    AbstractC33199m0.m105214F(bVar8, textResourceM21267a8, null, c8688b8, (InterfaceC4339a) objM87133R4, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    function14 = function10;
                    function15 = function114;
                } else {
                    function13 = function11;
                    if (viewState instanceof AbstractC36914g.c) {
                        throw AbstractC11895b.m32003v(-1365888643, c28655q, false);
                    }
                    c28655q.m87150e0(608096414);
                    AbstractC36914g.c cVar8 = (AbstractC36914g.c) viewState;
                    C36908a c36908aM118539d8 = cVar8.getAnalyticsInfo();
                    boolean zM87153g8 = c28655q.m87153g(interfaceC28601c1);
                    i24 = i15 & 14;
                    if (i24 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z115 = zM87153g8 | z13;
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = ((i15 & 112) == 32) | z14 | z115;
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        z16 = false;
                        i25 = i15;
                        d dVar14 = new d(viewState, interfaceC28601c1, function13, source, null);
                        c28655q.m87172p0(dVar14);
                        objM87133R2 = dVar14;
                    } else {
                        z16 = false;
                        i25 = i15;
                        d dVar15 = new d(viewState, interfaceC28601c1, function13, source, null);
                        c28655q.m87172p0(dVar15);
                        objM87133R2 = dVar15;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c36908aM118539d8);
                    function14 = function10;
                    function15 = function13;
                    m128802P(cVar8, function15, function14, function12, c28655q, ((i25 >> 6) & 112) | i24 | (i25 & 896) | ((i25 >> 3) & 7168), 0);
                    function16 = function12;
                    c28655q.m87173q(z16);
                }
            }
            function9 = function16;
            function8 = function15;
            function7 = function14;
        } else {
            c28655q.m87138X();
            function7 = function4;
            function8 = function5;
            function9 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35766g((Object) viewState, (Object) source, (Object) function7, (Object) function8, (Object) function9, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m128836l0(AbstractC31054a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m128838m0(AbstractC35773d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final InterfaceC28601c1 m128840n0() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final boolean m128842o0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m128844p0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m128846q0(Function1 function1) {
        function1.invoke(AbstractC35773d.b.f152139a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m128848r0(AbstractC36914g abstractC36914g, String str, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m128834k0(abstractC36914g, str, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s0 */
    private static final AbstractC36914g m128850s0(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC36914g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m128852t0(C36913f c36913f, InterfaceC36912e it) {
        AbstractC22676k.m65750j(it, "it");
        c36913f.m118536l(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m128854u0(C36913f c36913f, String str, boolean z4, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m128832j0(c36913f, str, z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m128856v0(InterfaceC36912e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m128858w0(AbstractC31054a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m128860x0(AbstractC35773d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
