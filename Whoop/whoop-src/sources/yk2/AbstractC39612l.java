package yk2;

import android.app.Application;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import io.sentry.config.AbstractC20301a;
import j02.C21166s;
import j11.AbstractC21211n;
import j11.EnumC21212o;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kk2.AbstractC22551d;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import ny0.AbstractC27292z;
import ok2.AbstractC28001g;
import org.xmlpull.v1.XmlPullParserException;
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
import p027b3.C2414n2;
import p027b3.InterfaceC2410m3;
import p043c4.C3948a0;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p163g1.InterfaceC15156u0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
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
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39169a;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p720m91.C25290b0;
import p720m91.C25292c0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import p734sl0.C32676t1;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;
import tk2.C33883a;
import tk2.C33891i;
import tk2.C33893k;
import tk2.C33894l;
import tk2.C33895m;
import tk2.C33896n;
import tk2.InterfaceC33892j;
import tk2.InterfaceC33899q;
import w41.AbstractC36807g;
import w41.C36806f;
import wb3.AbstractC37056f;
import wo1.C37450h;
import wr0.C37526f;
import wr0.C37550r;
import x30.C37888f1;
import x30.C37900j1;
import x81.C38072d;
import y00.AbstractC38963t7;
import yb1.C39389a;
import yc2.C39434a;
import yf1.C39516e;
import zk2.AbstractC40844e;
import zk2.AbstractC40850k;
import zk2.AbstractC40854o;
import zk2.AbstractC40861v;
import zk2.AbstractC40865z;
import zk2.C40845f;

/* JADX INFO: renamed from: yk2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b#\u0010$\u001aY\u0010+\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060'2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060'2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060'H\u0001¢\u0006\u0004\b+\u0010,\u001a\u000f\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b.\u0010/\"\u0014\u00102\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lyk2/e;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "T", "(Landroidx/compose/ui/Modifier;Lyk2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_EVENT, "Ltk2/j$l;", "sendViewEvent", "o0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ltk2/m;", "viewState", "Ltk2/j;", "onEvent", "S", "(Landroidx/compose/ui/Modifier;Ltk2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ltk2/m$a;", "M", "(Ltk2/m$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ltk2/m$b;", "a0", "(Landroidx/compose/ui/Modifier;Ltk2/m$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ltk2/a;", "tab", "", "isPaused", "l0", "(Ltk2/a;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ltk2/i;", "dialogState", "I", "(Ltk2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "pauseButtonText", "Lkotlin/Function0;", "onPauseClick", "onResumeClick", "onFinishClick", "D", "(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lg1/u0;", "p0", "(Landroidx/compose/runtime/Composer;I)Lg1/u0;", "a", "Ltk2/m;", "initialLoadingViewState", "Lm91/p;", "b", "Lm91/p;", "trackSessionMiniArchPreviewItemViewFactory", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39612l {

    /* JADX INFO: renamed from: a */
    private static final C33895m f170382a;

    /* JADX INFO: renamed from: b */
    private static final C25307p f170383b;

    /* JADX INFO: renamed from: yk2.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.view.TrackSessionMiniArchScreenKt$TrackSessionMiniArchScreen$2$1", m100430f = "TrackSessionMiniArchScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170384w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33894l f170385x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39605e f170386y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C33894l c33894l, C39605e c39605e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170385x = c33894l;
            this.f170386y = c39605e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f170385x, this.f170386y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170384w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f170385x.mo1216g(new InterfaceC33892j.h(this.f170386y.getSelectedActivityInternalName(), this.f170386y.getGpsTrackingEnabled(), this.f170386y.getRestoreSessionDestination()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yk2.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.view.TrackSessionMiniArchScreenKt$TrackSessionMiniArchScreen$3$1", m100430f = "TrackSessionMiniArchScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170387w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f170388x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f170389y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C33894l f170390z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28670t2 interfaceC28670t2, Function1 function1, C33894l c33894l, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170388x = interfaceC28670t2;
            this.f170389y = function1;
            this.f170390z = c33894l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f170388x, this.f170389y, this.f170390z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170387w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C9598e c9598eM107215b = AbstractC39612l.m126523V(this.f170388x).getPendingExitEvent();
            if (c9598eM107215b != null) {
                Function1 function1 = this.f170389y;
                C33894l c33894l = this.f170390z;
                function1.invoke(c9598eM107215b);
                c33894l.mo1216g(InterfaceC33892j.a.f141985a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yk2.l$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22672i implements Function1 {
        public c(Object obj) {
            super(1, 0, C33894l.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/trackactivity/presentation/TrackSessionMiniArchEvent$ViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m126571a(InterfaceC33892j.l p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C33894l) this.receiver).mo1216g(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m126571a((InterfaceC33892j.l) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C33895m.b bVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        f170382a = new C33895m(new C33895m.a(C33205o0.f138451a.m105288b(), null, null, null, 14, null), bVar, objArr, 6, 0 == true ? 1 : 0);
        f170383b = p720m91.Function1.m74306g(new C39611k(0));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0164  */
    /* JADX WARN: Code duplicated, block: B:102:0x0172  */
    /* JADX WARN: Code duplicated, block: B:106:0x0184  */
    /* JADX WARN: Code duplicated, block: B:109:0x0190  */
    /* JADX WARN: Code duplicated, block: B:110:0x0192  */
    /* JADX WARN: Code duplicated, block: B:114:0x01da  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:119:0x021d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0268  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x014d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0151  */
    /* JADX INFO: renamed from: D */
    public static final void m126505D(TextResource pauseButtonText, boolean z4, Modifier modifier, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a5;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a6;
        int i25;
        boolean z13;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        InterfaceC4339a interfaceC4339a9;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        int i26;
        InterfaceC4339a interfaceC4339a10;
        InterfaceC4339a interfaceC4339a11;
        InterfaceC4339a interfaceC4339a12;
        Modifier modifier5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(pauseButtonText, "pauseButtonText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1491069665);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(pauseButtonText) : c28655q.m87157i(pauseButtonText) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i27 = i14 & 4;
        if (i27 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a4 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a5 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a5)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            interfaceC4339a6 = interfaceC4339a3;
                            if (c28655q.m87157i(interfaceC4339a6)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                        if ((74899 & i15) != 74898) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z13)) {
                            c2314t = C2314t.f9131w;
                            if (i27 != 0) {
                                modifier4 = c2314t;
                            } else {
                                modifier4 = modifier2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C39434a(9);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                                i26 = i24;
                            } else {
                                i26 = i24;
                                interfaceC4339a10 = interfaceC4339a4;
                            }
                            if (i18 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C39434a(10);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                            } else {
                                interfaceC4339a11 = interfaceC4339a5;
                            }
                            if (i26 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C39434a(11);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            }
                            if (z4) {
                                c28655q.m87150e0(-1904340152);
                                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                                Modifier modifier6 = modifier4;
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                } else {
                                    f13 = 1.0f;
                                }
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                                TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                                float f14 = 4;
                                float f15 = f14 * f14;
                                int i28 = TextResource.C8688b.f25889c;
                                AbstractC27292z.m82343j(layoutWeightElement, false, false, null, null, null, c8688bM21277k, null, null, null, f15, null, null, interfaceC4339a11, c28655q, i28 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                                AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                interfaceC4339a12 = interfaceC4339a6;
                                AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i28 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                                modifier5 = modifier6;
                            } else {
                                Modifier modifier7 = modifier4;
                                interfaceC4339a12 = interfaceC4339a6;
                                c28655q.m87150e0(-1903552752);
                                modifier5 = modifier7;
                                AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier7), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                                c28655q.m87173q(false);
                            }
                            interfaceC4339a7 = interfaceC4339a10;
                            modifier3 = modifier5;
                            interfaceC4339a9 = interfaceC4339a12;
                            interfaceC4339a8 = interfaceC4339a11;
                        } else {
                            c28655q.m87138X();
                            modifier3 = modifier2;
                            interfaceC4339a7 = interfaceC4339a4;
                            interfaceC4339a8 = interfaceC4339a5;
                            interfaceC4339a9 = interfaceC4339a6;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                        }
                    }
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a6 = interfaceC4339a3;
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39434a(9);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            i26 = i24;
                        } else {
                            i26 = i24;
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C39434a(10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a11 = interfaceC4339a5;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C39434a(11);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (z4) {
                            c28655q.m87150e0(-1904340152);
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            Modifier modifier8 = modifier4;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f13, true);
                            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                            float f16 = 4;
                            float f17 = f16 * f16;
                            int i29 = TextResource.C8688b.f25889c;
                            AbstractC27292z.m82343j(layoutWeightElement2, false, false, null, null, null, c8688bM21277k2, null, null, null, f17, null, null, interfaceC4339a11, c28655q, i29 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                            AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            interfaceC4339a12 = interfaceC4339a6;
                            AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i29 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            modifier5 = modifier8;
                        } else {
                            Modifier modifier9 = modifier4;
                            interfaceC4339a12 = interfaceC4339a6;
                            c28655q.m87150e0(-1903552752);
                            modifier5 = modifier9;
                            AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier9), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                            c28655q.m87173q(false);
                        }
                        interfaceC4339a7 = interfaceC4339a10;
                        modifier3 = modifier5;
                        interfaceC4339a9 = interfaceC4339a12;
                        interfaceC4339a8 = interfaceC4339a11;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC4339a7 = interfaceC4339a4;
                        interfaceC4339a8 = interfaceC4339a5;
                        interfaceC4339a9 = interfaceC4339a6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                    }
                }
                i15 |= 24576;
                interfaceC4339a5 = interfaceC4339a2;
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        interfaceC4339a6 = interfaceC4339a3;
                        if (c28655q.m87157i(interfaceC4339a6)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39434a(9);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            i26 = i24;
                        } else {
                            i26 = i24;
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C39434a(10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a11 = interfaceC4339a5;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C39434a(11);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (z4) {
                            c28655q.m87150e0(-1904340152);
                            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
                            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            Modifier modifier10 = modifier4;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f13, true);
                            TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                            float f18 = 4;
                            float f19 = f18 * f18;
                            int i210 = TextResource.C8688b.f25889c;
                            AbstractC27292z.m82343j(layoutWeightElement3, false, false, null, null, null, c8688bM21277k3, null, null, null, f19, null, null, interfaceC4339a11, c28655q, i210 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                            AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            interfaceC4339a12 = interfaceC4339a6;
                            AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i210 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            modifier5 = modifier10;
                        } else {
                            Modifier modifier11 = modifier4;
                            interfaceC4339a12 = interfaceC4339a6;
                            c28655q.m87150e0(-1903552752);
                            modifier5 = modifier11;
                            AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier11), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                            c28655q.m87173q(false);
                        }
                        interfaceC4339a7 = interfaceC4339a10;
                        modifier3 = modifier5;
                        interfaceC4339a9 = interfaceC4339a12;
                        interfaceC4339a8 = interfaceC4339a11;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC4339a7 = interfaceC4339a4;
                        interfaceC4339a8 = interfaceC4339a5;
                        interfaceC4339a9 = interfaceC4339a6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a6 = interfaceC4339a3;
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39434a(9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        i26 = i24;
                    } else {
                        i26 = i24;
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C39434a(10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39434a(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (z4) {
                        c28655q.m87150e0(-1904340152);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier4);
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        Modifier modifier12 = modifier4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f13, true);
                        TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                        float f110 = 4;
                        float f111 = f110 * f110;
                        int i211 = TextResource.C8688b.f25889c;
                        AbstractC27292z.m82343j(layoutWeightElement4, false, false, null, null, null, c8688bM21277k4, null, null, null, f111, null, null, interfaceC4339a11, c28655q, i211 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                        AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        interfaceC4339a12 = interfaceC4339a6;
                        AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i211 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier5 = modifier12;
                    } else {
                        Modifier modifier13 = modifier4;
                        interfaceC4339a12 = interfaceC4339a6;
                        c28655q.m87150e0(-1903552752);
                        modifier5 = modifier13;
                        AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier13), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a7 = interfaceC4339a10;
                    modifier3 = modifier5;
                    interfaceC4339a9 = interfaceC4339a12;
                    interfaceC4339a8 = interfaceC4339a11;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                }
            }
            i15 |= 3072;
            interfaceC4339a4 = interfaceC4339a;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a5 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a5)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        interfaceC4339a6 = interfaceC4339a3;
                        if (c28655q.m87157i(interfaceC4339a6)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39434a(9);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            i26 = i24;
                        } else {
                            i26 = i24;
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C39434a(10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a11 = interfaceC4339a5;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C39434a(11);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (z4) {
                            c28655q.m87150e0(-1904340152);
                            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, modifier4);
                            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            Modifier modifier14 = modifier4;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a5);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(f13, true);
                            TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                            float f112 = 4;
                            float f113 = f112 * f112;
                            int i212 = TextResource.C8688b.f25889c;
                            AbstractC27292z.m82343j(layoutWeightElement5, false, false, null, null, null, c8688bM21277k5, null, null, null, f113, null, null, interfaceC4339a11, c28655q, i212 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                            AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            interfaceC4339a12 = interfaceC4339a6;
                            AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i212 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            modifier5 = modifier14;
                        } else {
                            Modifier modifier15 = modifier4;
                            interfaceC4339a12 = interfaceC4339a6;
                            c28655q.m87150e0(-1903552752);
                            modifier5 = modifier15;
                            AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier15), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                            c28655q.m87173q(false);
                        }
                        interfaceC4339a7 = interfaceC4339a10;
                        modifier3 = modifier5;
                        interfaceC4339a9 = interfaceC4339a12;
                        interfaceC4339a8 = interfaceC4339a11;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC4339a7 = interfaceC4339a4;
                        interfaceC4339a8 = interfaceC4339a5;
                        interfaceC4339a9 = interfaceC4339a6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a6 = interfaceC4339a3;
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39434a(9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        i26 = i24;
                    } else {
                        i26 = i24;
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C39434a(10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39434a(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (z4) {
                        c28655q.m87150e0(-1904340152);
                        Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, modifier4);
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        Modifier modifier16 = modifier4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(f13, true);
                        TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                        float f114 = 4;
                        float f115 = f114 * f114;
                        int i213 = TextResource.C8688b.f25889c;
                        AbstractC27292z.m82343j(layoutWeightElement6, false, false, null, null, null, c8688bM21277k6, null, null, null, f115, null, null, interfaceC4339a11, c28655q, i213 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                        AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        interfaceC4339a12 = interfaceC4339a6;
                        AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i213 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier5 = modifier16;
                    } else {
                        Modifier modifier17 = modifier4;
                        interfaceC4339a12 = interfaceC4339a6;
                        c28655q.m87150e0(-1903552752);
                        modifier5 = modifier17;
                        AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier17), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a7 = interfaceC4339a10;
                    modifier3 = modifier5;
                    interfaceC4339a9 = interfaceC4339a12;
                    interfaceC4339a8 = interfaceC4339a11;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a5 = interfaceC4339a2;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    interfaceC4339a6 = interfaceC4339a3;
                    if (c28655q.m87157i(interfaceC4339a6)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39434a(9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        i26 = i24;
                    } else {
                        i26 = i24;
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C39434a(10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39434a(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (z4) {
                        c28655q.m87150e0(-1904340152);
                        Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, modifier4);
                        C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        Modifier modifier18 = modifier4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a7);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(f13, true);
                        TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                        float f116 = 4;
                        float f117 = f116 * f116;
                        int i214 = TextResource.C8688b.f25889c;
                        AbstractC27292z.m82343j(layoutWeightElement7, false, false, null, null, null, c8688bM21277k7, null, null, null, f117, null, null, interfaceC4339a11, c28655q, i214 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                        AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        interfaceC4339a12 = interfaceC4339a6;
                        AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i214 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier5 = modifier18;
                    } else {
                        Modifier modifier19 = modifier4;
                        interfaceC4339a12 = interfaceC4339a6;
                        c28655q.m87150e0(-1903552752);
                        modifier5 = modifier19;
                        AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier19), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a7 = interfaceC4339a10;
                    modifier3 = modifier5;
                    interfaceC4339a9 = interfaceC4339a12;
                    interfaceC4339a8 = interfaceC4339a11;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a6 = interfaceC4339a3;
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39434a(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    i26 = i24;
                } else {
                    i26 = i24;
                    interfaceC4339a10 = interfaceC4339a4;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C39434a(10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i26 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39434a(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                }
                if (z4) {
                    c28655q.m87150e0(-1904340152);
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, modifier4);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    Modifier modifier110 = modifier4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(f13, true);
                    TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                    float f118 = 4;
                    float f119 = f118 * f118;
                    int i215 = TextResource.C8688b.f25889c;
                    AbstractC27292z.m82343j(layoutWeightElement8, false, false, null, null, null, c8688bM21277k8, null, null, null, f119, null, null, interfaceC4339a11, c28655q, i215 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                    AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    interfaceC4339a12 = interfaceC4339a6;
                    AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i215 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    modifier5 = modifier110;
                } else {
                    Modifier modifier111 = modifier4;
                    interfaceC4339a12 = interfaceC4339a6;
                    c28655q.m87150e0(-1903552752);
                    modifier5 = modifier111;
                    AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier111), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                    c28655q.m87173q(false);
                }
                interfaceC4339a7 = interfaceC4339a10;
                modifier3 = modifier5;
                interfaceC4339a9 = interfaceC4339a12;
                interfaceC4339a8 = interfaceC4339a11;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
                interfaceC4339a9 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a4 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a5 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a5)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        interfaceC4339a6 = interfaceC4339a3;
                        if (c28655q.m87157i(interfaceC4339a6)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((74899 & i15) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39434a(9);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                            i26 = i24;
                        } else {
                            i26 = i24;
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i18 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C39434a(10);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a11 = interfaceC4339a5;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C39434a(11);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        }
                        if (z4) {
                            c28655q.m87150e0(-1904340152);
                            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, modifier4);
                            C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                            Modifier modifier112 = modifier4;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f9);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a9);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f13 = Float.MAX_VALUE;
                            } else {
                                f13 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(f13, true);
                            TextResource.C8688b c8688bM21277k9 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                            float f1110 = 4;
                            float f1111 = f1110 * f1110;
                            int i216 = TextResource.C8688b.f25889c;
                            AbstractC27292z.m82343j(layoutWeightElement9, false, false, null, null, null, c8688bM21277k9, null, null, null, f1111, null, null, interfaceC4339a11, c28655q, i216 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                            AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            interfaceC4339a12 = interfaceC4339a6;
                            AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i216 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            modifier5 = modifier112;
                        } else {
                            Modifier modifier113 = modifier4;
                            interfaceC4339a12 = interfaceC4339a6;
                            c28655q.m87150e0(-1903552752);
                            modifier5 = modifier113;
                            AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier113), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                            c28655q.m87173q(false);
                        }
                        interfaceC4339a7 = interfaceC4339a10;
                        modifier3 = modifier5;
                        interfaceC4339a9 = interfaceC4339a12;
                        interfaceC4339a8 = interfaceC4339a11;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC4339a7 = interfaceC4339a4;
                        interfaceC4339a8 = interfaceC4339a5;
                        interfaceC4339a9 = interfaceC4339a6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a6 = interfaceC4339a3;
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39434a(9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        i26 = i24;
                    } else {
                        i26 = i24;
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C39434a(10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39434a(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (z4) {
                        c28655q.m87150e0(-1904340152);
                        Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, modifier4);
                        C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        Modifier modifier114 = modifier4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f10);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a10);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(f13, true);
                        TextResource.C8688b c8688bM21277k10 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                        float f1112 = 4;
                        float f1113 = f1112 * f1112;
                        int i217 = TextResource.C8688b.f25889c;
                        AbstractC27292z.m82343j(layoutWeightElement10, false, false, null, null, null, c8688bM21277k10, null, null, null, f1113, null, null, interfaceC4339a11, c28655q, i217 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                        AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        interfaceC4339a12 = interfaceC4339a6;
                        AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i217 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier5 = modifier114;
                    } else {
                        Modifier modifier115 = modifier4;
                        interfaceC4339a12 = interfaceC4339a6;
                        c28655q.m87150e0(-1903552752);
                        modifier5 = modifier115;
                        AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier115), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a7 = interfaceC4339a10;
                    modifier3 = modifier5;
                    interfaceC4339a9 = interfaceC4339a12;
                    interfaceC4339a8 = interfaceC4339a11;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a5 = interfaceC4339a2;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    interfaceC4339a6 = interfaceC4339a3;
                    if (c28655q.m87157i(interfaceC4339a6)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39434a(9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        i26 = i24;
                    } else {
                        i26 = i24;
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C39434a(10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39434a(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (z4) {
                        c28655q.m87150e0(-1904340152);
                        Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, modifier4);
                        C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        Modifier modifier116 = modifier4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3409f11);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a11);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(f13, true);
                        TextResource.C8688b c8688bM21277k11 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                        float f1114 = 4;
                        float f1115 = f1114 * f1114;
                        int i218 = TextResource.C8688b.f25889c;
                        AbstractC27292z.m82343j(layoutWeightElement11, false, false, null, null, null, c8688bM21277k11, null, null, null, f1115, null, null, interfaceC4339a11, c28655q, i218 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                        AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        interfaceC4339a12 = interfaceC4339a6;
                        AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i218 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier5 = modifier116;
                    } else {
                        Modifier modifier117 = modifier4;
                        interfaceC4339a12 = interfaceC4339a6;
                        c28655q.m87150e0(-1903552752);
                        modifier5 = modifier117;
                        AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier117), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a7 = interfaceC4339a10;
                    modifier3 = modifier5;
                    interfaceC4339a9 = interfaceC4339a12;
                    interfaceC4339a8 = interfaceC4339a11;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a6 = interfaceC4339a3;
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39434a(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    i26 = i24;
                } else {
                    i26 = i24;
                    interfaceC4339a10 = interfaceC4339a4;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C39434a(10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i26 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39434a(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                }
                if (z4) {
                    c28655q.m87150e0(-1904340152);
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, modifier4);
                    C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    Modifier modifier118 = modifier4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f12);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a12);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(f13, true);
                    TextResource.C8688b c8688bM21277k12 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                    float f1116 = 4;
                    float f1117 = f1116 * f1116;
                    int i219 = TextResource.C8688b.f25889c;
                    AbstractC27292z.m82343j(layoutWeightElement12, false, false, null, null, null, c8688bM21277k12, null, null, null, f1117, null, null, interfaceC4339a11, c28655q, i219 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                    AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    interfaceC4339a12 = interfaceC4339a6;
                    AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i219 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    modifier5 = modifier118;
                } else {
                    Modifier modifier119 = modifier4;
                    interfaceC4339a12 = interfaceC4339a6;
                    c28655q.m87150e0(-1903552752);
                    modifier5 = modifier119;
                    AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier119), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                    c28655q.m87173q(false);
                }
                interfaceC4339a7 = interfaceC4339a10;
                modifier3 = modifier5;
                interfaceC4339a9 = interfaceC4339a12;
                interfaceC4339a8 = interfaceC4339a11;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
                interfaceC4339a9 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
            }
        }
        i15 |= 3072;
        interfaceC4339a4 = interfaceC4339a;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a5 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a5)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    interfaceC4339a6 = interfaceC4339a3;
                    if (c28655q.m87157i(interfaceC4339a6)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((74899 & i15) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39434a(9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        i26 = i24;
                    } else {
                        i26 = i24;
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C39434a(10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39434a(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    }
                    if (z4) {
                        c28655q.m87150e0(-1904340152);
                        Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, modifier4);
                        C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        Modifier modifier1110 = modifier4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3409f13);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a13);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(f13, true);
                        TextResource.C8688b c8688bM21277k13 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                        float f1118 = 4;
                        float f1119 = f1118 * f1118;
                        int i2110 = TextResource.C8688b.f25889c;
                        AbstractC27292z.m82343j(layoutWeightElement13, false, false, null, null, null, c8688bM21277k13, null, null, null, f1119, null, null, interfaceC4339a11, c28655q, i2110 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                        AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        interfaceC4339a12 = interfaceC4339a6;
                        AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i2110 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier5 = modifier1110;
                    } else {
                        Modifier modifier1111 = modifier4;
                        interfaceC4339a12 = interfaceC4339a6;
                        c28655q.m87150e0(-1903552752);
                        modifier5 = modifier1111;
                        AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier1111), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a7 = interfaceC4339a10;
                    modifier3 = modifier5;
                    interfaceC4339a9 = interfaceC4339a12;
                    interfaceC4339a8 = interfaceC4339a11;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a6 = interfaceC4339a3;
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39434a(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    i26 = i24;
                } else {
                    i26 = i24;
                    interfaceC4339a10 = interfaceC4339a4;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C39434a(10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i26 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39434a(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                }
                if (z4) {
                    c28655q.m87150e0(-1904340152);
                    Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, modifier4);
                    C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    Modifier modifier1112 = modifier4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3409f14);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a14);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(f13, true);
                    TextResource.C8688b c8688bM21277k14 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                    float f11110 = 4;
                    float f11111 = f11110 * f11110;
                    int i2111 = TextResource.C8688b.f25889c;
                    AbstractC27292z.m82343j(layoutWeightElement14, false, false, null, null, null, c8688bM21277k14, null, null, null, f11111, null, null, interfaceC4339a11, c28655q, i2111 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                    AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    interfaceC4339a12 = interfaceC4339a6;
                    AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i2111 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    modifier5 = modifier1112;
                } else {
                    Modifier modifier1113 = modifier4;
                    interfaceC4339a12 = interfaceC4339a6;
                    c28655q.m87150e0(-1903552752);
                    modifier5 = modifier1113;
                    AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier1113), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                    c28655q.m87173q(false);
                }
                interfaceC4339a7 = interfaceC4339a10;
                modifier3 = modifier5;
                interfaceC4339a9 = interfaceC4339a12;
                interfaceC4339a8 = interfaceC4339a11;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
                interfaceC4339a9 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a5 = interfaceC4339a2;
        i24 = i14 & 32;
        if (i24 != 0) {
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                interfaceC4339a6 = interfaceC4339a3;
                if (c28655q.m87157i(interfaceC4339a6)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((74899 & i15) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39434a(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    i26 = i24;
                } else {
                    i26 = i24;
                    interfaceC4339a10 = interfaceC4339a4;
                }
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C39434a(10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i26 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39434a(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                }
                if (z4) {
                    c28655q.m87150e0(-1904340152);
                    Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, modifier4);
                    C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    Modifier modifier1114 = modifier4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3409f15);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a15);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement15 = new LayoutWeightElement(f13, true);
                    TextResource.C8688b c8688bM21277k15 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                    float f11112 = 4;
                    float f11113 = f11112 * f11112;
                    int i2112 = TextResource.C8688b.f25889c;
                    AbstractC27292z.m82343j(layoutWeightElement15, false, false, null, null, null, c8688bM21277k15, null, null, null, f11113, null, null, interfaceC4339a11, c28655q, i2112 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                    AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    interfaceC4339a12 = interfaceC4339a6;
                    AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i2112 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    modifier5 = modifier1114;
                } else {
                    Modifier modifier1115 = modifier4;
                    interfaceC4339a12 = interfaceC4339a6;
                    c28655q.m87150e0(-1903552752);
                    modifier5 = modifier1115;
                    AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier1115), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                    c28655q.m87173q(false);
                }
                interfaceC4339a7 = interfaceC4339a10;
                modifier3 = modifier5;
                interfaceC4339a9 = interfaceC4339a12;
                interfaceC4339a8 = interfaceC4339a11;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
                interfaceC4339a9 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a6 = interfaceC4339a3;
        if ((74899 & i15) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C39434a(9);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                i26 = i24;
            } else {
                i26 = i24;
                interfaceC4339a10 = interfaceC4339a4;
            }
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C39434a(10);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a11 = interfaceC4339a5;
            }
            if (i26 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39434a(11);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R;
            }
            if (z4) {
                c28655q.m87150e0(-1904340152);
                Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, modifier4);
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                Modifier modifier1116 = modifier4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f16);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a16);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement16 = new LayoutWeightElement(f13, true);
                TextResource.C8688b c8688bM21277k16 = AbstractC8693b.m21277k(AbstractC22551d.f88671M);
                float f11114 = 4;
                float f11115 = f11114 * f11114;
                int i2113 = TextResource.C8688b.f25889c;
                AbstractC27292z.m82343j(layoutWeightElement16, false, false, null, null, null, c8688bM21277k16, null, null, null, f11115, null, null, interfaceC4339a11, c28655q, i2113 << 18, ((i15 >> 3) & 7168) | 6, 7102);
                AbstractC38963t7.m124386p((float) 1.5d, 8, c2314t, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                interfaceC4339a12 = interfaceC4339a6;
                AbstractC27271o0.m82253b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC8693b.m21277k(AbstractC22551d.f88669K), null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a12, c28655q, (i2113 << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21, (i15 >> 15) & 14, 970);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                modifier5 = modifier1116;
            } else {
                Modifier modifier1117 = modifier4;
                interfaceC4339a12 = interfaceC4339a6;
                c28655q.m87150e0(-1903552752);
                modifier5 = modifier1117;
                AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, modifier1117), false, pauseButtonText, null, m126559p0(c28655q, 0), null, null, null, false, null, interfaceC4339a10, c28655q, (TextResource.$stable << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 896), (i15 >> 9) & 14, 970);
                c28655q.m87173q(false);
            }
            interfaceC4339a7 = interfaceC4339a10;
            modifier3 = modifier5;
            interfaceC4339a9 = interfaceC4339a12;
            interfaceC4339a8 = interfaceC4339a11;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a7 = interfaceC4339a4;
            interfaceC4339a8 = interfaceC4339a5;
            interfaceC4339a9 = interfaceC4339a6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(pauseButtonText, z4, modifier3, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m126506E() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m126507F() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m126508G() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m126509H(TextResource textResource, boolean z4, Modifier modifier, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, int i14, Composer composer, int i15) {
        m126505D(textResource, z4, modifier, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: I */
    private static final void m126510I(final C33891i c33891i, final Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        final int i16;
        C15077m1 c15077m1M43196a;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1964762131);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(c33891i) : c28655q2.m87157i(c33891i) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14;
        if (!c28655q2.m87135U(i17 & 1, (i17 & 19) != 18)) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else if (c33891i != null) {
            c28655q2.m87150e0(-414136641);
            if (c33891i.getUsePrimaryWhiteButton()) {
                c28655q2.m87150e0(-414070921);
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                i15 = 1;
                i16 = 0;
                c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, i18).getBrandWhite(), c38072d.m121949b(c28655q2, i18).getBrandBlack(), c38072d.m121949b(c28655q2, i18).getWhite10(), c38072d.m121949b(c28655q2, i18).getWhite20(), c28655q2, 0, 0);
                c28655q2.m87173q(false);
            } else {
                i15 = 1;
                i16 = 0;
                c28655q2.m87150e0(-413774406);
                C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                C38072d c38072d2 = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                c15077m1M43196a = AbstractC15166v0.m43196a(c38072d2.m121949b(c28655q2, i19).getWhite10(), c38072d2.m121949b(c28655q2, i19).getBrandWhite(), 0L, 0L, c28655q2, 0, 12);
                c28655q2.m87173q(false);
            }
            C15077m1 c15077m1 = c15077m1M43196a;
            TextResource textResourceM107200f = c33891i.getTitle();
            TextResource textResourceM107196b = c33891i.getDescription();
            TextResource textResourceM107198d = c33891i.getPrimaryActionText();
            TextResource textResourceM107199e = c33891i.getSecondaryActionText();
            EnumC21212o enumC21212o = EnumC21212o.LEFT;
            boolean z4 = !c33891i.getIsLoading();
            int i24 = i17 & 14;
            int i25 = i17 & 112;
            int i26 = ((i24 == 4 || ((i17 & 8) != 0 && c28655q2.m87157i(c33891i))) ? i15 : i16) | (i25 == 32 ? i15 : i16);
            Object objM87133R = c28655q2.m87133R();
            Object obj = C28635l.f115821a;
            if (i26 != 0 || objM87133R == obj) {
                objM87133R = new InterfaceC4339a() { // from class: yk2.f
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return AbstractC39612l.m126511J(c33891i, function1);
                            default:
                                return AbstractC39612l.m126512K(c33891i, function1);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int i27 = ((i24 == 4 || ((i17 & 8) != 0 && c28655q2.m87157i(c33891i))) ? i15 : i16) | (i25 == 32 ? i15 : i16);
            Object objM87133R2 = c28655q2.m87133R();
            if (i27 != 0 || objM87133R2 == obj) {
                final int i28 = i15;
                objM87133R2 = new InterfaceC4339a() { // from class: yk2.f
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i28) {
                            case 0:
                                return AbstractC39612l.m126511J(c33891i, function1);
                            default:
                                return AbstractC39612l.m126512K(c33891i, function1);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            }
            int i29 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM107200f, textResourceM107196b, textResourceM107198d, true, null, c15077m1, null, null, textResourceM107199e, null, false, false, null, enumC21212o, false, 5, null, null, null, z4, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q2, (i29 << 3) | 24576 | (i29 << 6) | (i29 << 9) | (i29 << 27), 221568, 0, 246295969);
            C28655q c28655q3 = c28655q2;
            c28655q3.m87173q(i16);
            c28655q = c28655q3;
        } else {
            c28655q2.m87150e0(-412700907);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(c33891i, function1, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m126511J(C33891i c33891i, Function1 function1) {
        if (!c33891i.getIsLoading()) {
            function1.invoke(c33891i.getDismissEvent());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m126512K(C33891i c33891i, Function1 function1) {
        if (!c33891i.getIsLoading()) {
            function1.invoke(c33891i.getApproveEvent());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m126513L(C33891i c33891i, Function1 function1, int i13, Composer composer, int i14) {
        m126510I(c33891i, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final void m126514M(C33895m.a aVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-591434743);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = aVar.getDismissClickEvent() != null;
            boolean z13 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(aVar))) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C39607g(aVar, function1, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(z4, false, false), AbstractC37817c.m121344e(-1278911534, c28655q, new C37888f1(7, aVar, function1)), c28655q, 384);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(aVar, function1, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m126515N(C33895m.a aVar, Function1 function1) {
        InterfaceC33892j interfaceC33892jM107217a = aVar.getDismissClickEvent();
        if (interfaceC33892jM107217a != null) {
            function1.invoke(interfaceC33892jM107217a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m126516O(C33895m.a aVar, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C33211q0 c33211q0M107220d = aVar.getState();
            boolean zM87157i = c28655q.m87157i(aVar) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C39607g(aVar, function1, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(aVar) | c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39607g(aVar, function1, 2);
                c28655q.m87172p0(objM87133R2);
            }
            Function0.m105274p(c33211q0M107220d, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m126517P(C33895m.a aVar, Function1 function1) {
        InterfaceC33892j interfaceC33892jM107218b = aVar.getPrimaryClickEvent();
        if (interfaceC33892jM107218b != null) {
            function1.invoke(interfaceC33892jM107218b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m126518Q(C33895m.a aVar, Function1 function1) {
        InterfaceC33892j.l lVarM107219c = aVar.getSecondaryClickEvent();
        if (lVarM107219c != null) {
            function1.invoke(lVarM107219c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m126519R(C33895m.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m126514M(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    public static final void m126520S(Modifier modifier, C33895m viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function2;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-736878217);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C39389a(29);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(529644652);
                m126514M(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
                modifier3 = modifier;
            } else if (viewState.getScreenSuccessContent() != null) {
                c28655q.m87150e0(529649089);
                int i18 = i15 & 910;
                modifier3 = modifier;
                m126529a0(modifier3, viewState.getScreenSuccessContent(), function3, c28655q, i18, 0);
                c28655q.m87173q(false);
            } else {
                modifier3 = modifier;
                c28655q.m87150e0(-760578101);
                c28655q.m87173q(false);
            }
            function2 = function3;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 25, modifier2, viewState, function2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0222  */
    /* JADX WARN: Code duplicated, block: B:104:0x0237  */
    /* JADX WARN: Code duplicated, block: B:105:0x0239  */
    /* JADX WARN: Code duplicated, block: B:109:0x0247  */
    /* JADX WARN: Code duplicated, block: B:111:0x0260  */
    /* JADX WARN: Code duplicated, block: B:114:0x026a  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0196  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x0211  */
    /* JADX WARN: Code duplicated, block: B:97:0x0213  */
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
    /* JADX INFO: renamed from: T */
    public static final void m126521T(Modifier modifier, C39605e itemState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function3;
        C33895m c33895m;
        String id4;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        C33895m c33895m2;
        AbstractC23864c abstractC23864c;
        C33894l c33894l;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        int i16;
        boolean z15;
        boolean zM87157i;
        Object objM87133R3;
        boolean z16;
        boolean zM87157i2;
        Object objM87133R4;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R5;
        Object obj;
        boolean zM87153g3;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(723503786);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
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
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C39611k(1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                } else {
                    function3 = function2;
                }
                c33895m = f170382a;
                id4 = itemState.getId();
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(id4) | c28655q.m87153g(c33895m) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (!zM87153g || objM87133R == c28676v0) {
                        c33895m2 = c33895m;
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c33895m2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33894l.class), null, id4);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        c33895m2 = c33895m;
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext2;
                        zM87153g2 = c28655q.m87153g(id4) | c28655q.m87153g(c33895m) | c28655q.m87153g(null);
                        objM87133R5 = c28655q.m87133R();
                        if (!zM87153g2 || objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33894l.class), null, new C23863b(c33895m), id4);
                            obj = null;
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            obj = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R5;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(id4) | c28655q.m87153g(c33895m) | c28655q.m87153g(obj);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C23863b(c33895m);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (C23863b) objM87133R6;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    c33895m2 = c33895m;
                }
                AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.trackactivity.presentation.TrackSessionMiniArchViewModel");
                c33894l = (C33894l) abstractC23864c;
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(c33894l.getViewState(), c33895m2, null, c28655q, 0, 2);
                String id5 = itemState.getId();
                String strM126501c = itemState.getSelectedActivityInternalName();
                Boolean boolValueOf = Boolean.valueOf(itemState.getGpsTrackingEnabled());
                boolean zM87157i3 = c28655q.m87157i(c33894l);
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(itemState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i3 | z13;
                objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(c33894l, itemState, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87255i(id5, strM126501c, boolValueOf, (InterfaceC4351m) objM87133R2, c28655q);
                C9598e c9598eM107215b = m126523V(interfaceC28601c1M87260n).getPendingExitEvent();
                boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1M87260n);
                i16 = i15 & 896;
                if (i16 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = zM87153g4 | z15 | c28655q.m87157i(c33894l);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new b(interfaceC28601c1M87260n, function3, c33894l, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c9598eM107215b);
                C33895m c33895mM126523V = m126523V(interfaceC28601c1M87260n);
                if (i16 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i2 = c28655q.m87157i(c33894l) | z16;
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C37900j1(12, function3, c33894l);
                    c28655q.m87172p0(objM87133R4);
                }
                Modifier modifier5 = modifier4;
                m126520S(modifier5, c33895mM126523V, (Function1) objM87133R4, c28655q, i15 & 14, 0);
                function2 = function3;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(i13, i14, 24, modifier3, itemState, function2);
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
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C39611k(1);
                    c28655q.m87172p0(objM87133R7);
                }
                function3 = (Function1) objM87133R7;
            } else {
                function3 = function2;
            }
            c33895m = f170382a;
            id4 = itemState.getId();
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    zM87153g2 = c28655q.m87153g(id4) | c28655q.m87153g(c33895m) | c28655q.m87153g(null);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33894l.class), null, new C23863b(c33895m), id4);
                        obj = null;
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33894l.class), null, new C23863b(c33895m), id4);
                        obj = null;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R5;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = c28655q.m87153g(id4) | c28655q.m87153g(c33895m) | c28655q.m87153g(obj);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R6 = new C23863b(c33895m);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C23863b(c33895m);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (C23863b) objM87133R6;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                c33895m2 = c33895m;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(id4) | c28655q.m87153g(c33895m) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    c33895m2 = c33895m;
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c33895m2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33894l.class), null, id4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    c33895m2 = c33895m;
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c33895m2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33894l.class), null, id4);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
                c28655q.m87173q(false);
            }
            AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.trackactivity.presentation.TrackSessionMiniArchViewModel");
            c33894l = (C33894l) abstractC23864c;
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(c33894l.getViewState(), c33895m2, null, c28655q, 0, 2);
            String id6 = itemState.getId();
            String strM126501c2 = itemState.getSelectedActivityInternalName();
            Boolean boolValueOf2 = Boolean.valueOf(itemState.getGpsTrackingEnabled());
            boolean zM87157i4 = c28655q.m87157i(c33894l);
            if ((i15 & 112) != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = zM87157i4 | z13;
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new a(c33894l, itemState, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(c33894l, itemState, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87255i(id6, strM126501c2, boolValueOf2, (InterfaceC4351m) objM87133R2, c28655q);
            C9598e c9598eM107215b2 = m126523V(interfaceC28601c1M87260n).getPendingExitEvent();
            boolean zM87153g5 = c28655q.m87153g(interfaceC28601c1M87260n);
            i16 = i15 & 896;
            if (i16 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i = zM87153g5 | z15 | c28655q.m87157i(c33894l);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R3 = new b(interfaceC28601c1M87260n, function3, c33894l, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(interfaceC28601c1M87260n, function3, c33894l, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c9598eM107215b2);
            C33895m c33895mM126523V2 = m126523V(interfaceC28601c1M87260n);
            if (i16 == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87157i2 = c28655q.m87157i(c33894l) | z16;
            objM87133R4 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R4 = new C37900j1(12, function3, c33894l);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C37900j1(12, function3, c33894l);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifier6 = modifier4;
            m126520S(modifier6, c33895mM126523V2, (Function1) objM87133R4, c28655q, i15 & 14, 0);
            function2 = function3;
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 24, modifier3, itemState, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m126522U(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C33895m m126523V(InterfaceC28670t2 interfaceC28670t2) {
        return (C33895m) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m126524W(Function1 function1, C33894l c33894l, InterfaceC33892j event) {
        AbstractC22676k.m65750j(event, "event");
        m126557o0(event, function1, new c(c33894l));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m126525X(Modifier modifier, C39605e c39605e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m126521T(modifier, c39605e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m126526Y(InterfaceC33892j it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m126527Z(Modifier modifier, C33895m c33895m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m126520S(modifier, c33895m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private static final void m126529a0(Modifier modifier, final C33895m.b bVar, final Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q;
        Modifier modifier2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(834678805);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(bVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            modifier2 = i16 != 0 ? C2314t.f9131w : modifier;
            boolean zM87157i = c28655q2.m87157i(bVar) | ((i15 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C37550r(23, bVar, function1);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, true, c28655q2, 6, 0);
            final InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            final int iM7408a = (int) (((C2414n2) ((InterfaceC2410m3) c28655q2.m87161k(AbstractC2453v1.f9581t))).m7408a() >> 32);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            final float fMo43112d = AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90559f, c28655q2).mo43112d();
            final C36806f c36806fM117972a = AbstractC36807g.m117972a(null, c28655q2, 0, 1);
            final float fMo43109a = AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a();
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier2);
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-825674645, c28655q2, new Function3() { // from class: yk2.h
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC39612l.m126533c0(interfaceC39171c, bVar, fMo43112d, fMo43109a, c36806fM117972a, function1, iM7408a, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            });
            c28655q = c28655q2;
            AbstractC22953f.m66714a(modifierM3407d, null, false, c37816bM121344e, c28655q, 3072, 6);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 26, modifier2, bVar, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m126531b0(C33895m.b bVar, Function1 function1) {
        C33891i c33891iM107221a = bVar.getDialogState();
        if (c33891iM107221a != null) {
            function1.invoke(c33891iM107221a.getDismissEvent());
        } else {
            function1.invoke(InterfaceC33892j.f.f141990a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m126533c0(InterfaceC39171c interfaceC39171c, C33895m.b bVar, float f13, float f14, C36806f c36806f, Function1 function1, int i13, InterfaceC23004v BoxWithConstraints, Composer composer, int i14) throws XmlPullParserException, IOException {
        int i15;
        Function1 function2;
        C28676v0 c28676v0;
        final C33895m.b bVar2;
        boolean z4;
        int i16;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i14 & 6) == 0) {
            i15 = i14 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i15 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float fM124765i = (i13 - C39169a.m124765i(((C1101c) BoxWithConstraints).f4585b)) / 2.0f;
            if (fM124765i < 0.0f) {
                fM124765i = 0.0f;
            }
            float fMo734f0 = interfaceC39171c.mo734f0(fM124765i);
            InterfaceC33899q interfaceC33899q = bVar.m107224d().get(bVar.getTagGroup().m132372c().isEmpty() ? "MAIN" : bVar.getTagGroup().getSelectedTagId());
            C2314t c2314t = C2314t.f9131w;
            C1100b c1100b = C1100b.f4583a;
            if (interfaceC33899q == null) {
                c28655q.m87150e0(-395201857);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-395201856);
                AbstractC39614n.m126579h(interfaceC33899q, AbstractC2294a.m7154a(0.0f, c1100b.mo3401b(c2314t)), fMo734f0, f13, c36806f, f14, c28655q, 0, 0);
                c28655q.m87173q(false);
            }
            if (interfaceC33899q instanceof InterfaceC33899q.b) {
                c28655q.m87150e0(-394693270);
                AbstractC39603c.m126494b(AbstractC39614n.m126584m(AbstractC2294a.m7154a(0.0f, c1100b.mo3401b(c2314t)), fMo734f0, f13, f14), c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-394281001);
                c28655q.m87173q(false);
            }
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC2294a.m7154a(1.0f, c2314t))));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            TextResource textResourceM107231k = bVar.getToolbarTitle();
            TextResource textResourceM107227g = bVar.getToolbarDurationLeading();
            TextResource textResourceM107230j = bVar.getToolbarDurationTrailing();
            TextResource textResourceM107229i = bVar.getToolbarDurationTargetText();
            C33896n c33896nM107228h = bVar.getToolbarDurationProgressBar();
            boolean zM107232l = bVar.getIsPaused();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v1) {
                objM87133R = new C39609i(function1, 0);
                c28655q.m87172p0(objM87133R);
            }
            int i17 = TextResource.$stable;
            AbstractC40865z.m132455c(textResourceM107231k, textResourceM107227g, textResourceM107230j, null, textResourceM107229i, c33896nM107228h, zM107232l, (InterfaceC4339a) objM87133R, c28655q, i17 | (i17 << 3) | (i17 << 6) | (i17 << 12), 8);
            C28655q c28655q2 = c28655q;
            boolean zIsEmpty = bVar.getTagGroup().m132372c().isEmpty();
            int i18 = 8;
            C23016z c23016z = C23016z.f90757a;
            if (zIsEmpty) {
                c28655q2.m87150e0(-50153425);
                C33883a c33883a = bVar.m107225e().get("MAIN");
                if (c33883a == null) {
                    c28655q2.m87150e0(-50153426);
                    c28655q2.m87173q(false);
                    z4 = false;
                } else {
                    c28655q2.m87150e0(-50153425);
                    m126551l0(c33883a, bVar.getIsPaused(), AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t, true, 1.0f))), c28655q2, 0, 0);
                    z4 = false;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z4);
                bVar2 = bVar;
                function2 = function1;
                c28676v0 = c28676v1;
            } else {
                i18 = 8;
                c28655q2.m87150e0(-49742024);
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t, true, 1.0f)));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t, true, 1.0f));
                C40845f c40845fM107226f = bVar.getTagGroup();
                function2 = function1;
                boolean zM87153g2 = c28655q2.m87153g(function2);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87153g2) {
                    c28676v0 = c28676v1;
                } else {
                    c28676v0 = c28676v1;
                    if (objM87133R2 == c28676v0) {
                    }
                    final int i19 = 0;
                    bVar2 = bVar;
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(1066552023, c28655q2, new Function3() { // from class: yk2.j
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i24 = i19;
                            String str = (String) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i24) {
                                case 0:
                                    return AbstractC39612l.m126539f0(bVar2, str, composer2, iIntValue);
                                default:
                                    return AbstractC39612l.m126541g0(bVar2, str, composer2, iIntValue);
                            }
                        }
                    });
                    final int i24 = 1;
                    AbstractC40844e.m132361f(c40845fM107226f, modifierM3409f, (Function1) objM87133R2, c37816bM121344e, AbstractC37817c.m121344e(-1598449418, c28655q2, new Function3() { // from class: yk2.j
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i25 = i24;
                            String str = (String) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i25) {
                                case 0:
                                    return AbstractC39612l.m126539f0(bVar2, str, composer2, iIntValue);
                                default:
                                    return AbstractC39612l.m126541g0(bVar2, str, composer2, iIntValue);
                            }
                        }
                    }), c28655q2, 27648, 0);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(true);
                    z4 = false;
                    c28655q2.m87173q(false);
                }
                objM87133R2 = new C37450h(function2, 18);
                c28655q2.m87172p0(objM87133R2);
                final int i110 = 0;
                bVar2 = bVar;
                C37816b c37816bM121344e2 = AbstractC37817c.m121344e(1066552023, c28655q2, new Function3() { // from class: yk2.j
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i25 = i110;
                        String str = (String) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i25) {
                            case 0:
                                return AbstractC39612l.m126539f0(bVar2, str, composer2, iIntValue);
                            default:
                                return AbstractC39612l.m126541g0(bVar2, str, composer2, iIntValue);
                        }
                    }
                });
                final int i25 = 1;
                AbstractC40844e.m132361f(c40845fM107226f, modifierM3409f, (Function1) objM87133R2, c37816bM121344e2, AbstractC37817c.m121344e(-1598449418, c28655q2, new Function3() { // from class: yk2.j
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i26 = i25;
                        String str = (String) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i26) {
                            case 0:
                                return AbstractC39612l.m126539f0(bVar2, str, composer2, iIntValue);
                            default:
                                return AbstractC39612l.m126541g0(bVar2, str, composer2, iIntValue);
                        }
                    }
                }), c28655q2, 27648, 0);
                c28655q2 = c28655q2;
                c28655q2.m87173q(true);
                z4 = false;
                c28655q2.m87173q(false);
            }
            TextResource textResourceM107223c = bVar2.getPrimaryButtonText();
            if (textResourceM107223c == null) {
                c28655q2.m87150e0(-48566505);
                c28655q2.m87173q(z4);
            } else {
                c28655q2.m87150e0(-48566504);
                boolean zM107232l2 = bVar2.getIsPaused();
                float f15 = i18;
                Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, ((float) 2.5d) * f15, ((float) 3.5d) * f15);
                boolean zM87153g3 = c28655q2.m87153g(function2);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C39609i(function2, 1);
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                boolean zM87153g4 = c28655q2.m87153g(function2);
                Object objM87133R4 = c28655q2.m87133R();
                if (zM87153g4 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C39609i(function2, 2);
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                boolean zM87153g5 = c28655q2.m87153g(function2);
                Object objM87133R5 = c28655q2.m87133R();
                if (zM87153g5 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C39609i(function2, 3);
                    c28655q2.m87172p0(objM87133R5);
                }
                m126505D(textResourceM107223c, zM107232l2, modifierM3395q, interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R5, c28655q2, i17 | 384, 0);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            if (AbstractC22676k.m65745e(bVar2.getTagGroup().getSelectedTagId(), "MAP") && c36806f.m117964e()) {
                c28655q2.m87150e0(-391168663);
                i16 = 0;
                AbstractC40854o.m132400h(c36806f, AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC2294a.m7154a(2.0f, c2314t), C2299e.f9103F), 0.0f, 0.0f, 2 * i18, 0.0f, 11), c28655q2, 0, 0);
                c28655q2.m87173q(false);
            } else {
                i16 = 0;
                c28655q2.m87150e0(-390909193);
                c28655q2.m87173q(false);
            }
            m126510I(bVar2.getDialogState(), function2, c28655q2, i16);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m126535d0(Function1 function1) {
        function1.invoke(InterfaceC33892j.f.f141990a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m126537e0(Function1 function1, String tagId) {
        AbstractC22676k.m65750j(tagId, "tagId");
        function1.invoke(new InterfaceC33892j.k(tagId));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m126539f0(C33895m.b bVar, String selectedTagId, Composer composer, int i13) {
        AbstractC22676k.m65750j(selectedTagId, "selectedTagId");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(selectedTagId) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC40850k.m132387d(bVar.m107222b().get(selectedTagId), null, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m126541g0(C33895m.b bVar, String tagId, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(tagId, "tagId");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(tagId) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            m126551l0((C33883a) AbstractC25247g0.m73986U(tagId, bVar.m107225e()), bVar.getIsPaused(), AbstractC1102d.m3407d(1.0f, C2314t.f9131w), c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m126543h0(Function1 function1) {
        function1.invoke(InterfaceC33892j.i.f141996a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m126545i0(Function1 function1) {
        function1.invoke(InterfaceC33892j.j.f141997a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m126547j0(Function1 function1) {
        function1.invoke(InterfaceC33892j.g.f141991a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m126549k0(Modifier modifier, C33895m.b bVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m126529a0(modifier, bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022a  */
    /* JADX WARN: Code duplicated, block: B:102:0x023c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0257 A[LOOP:3: B:104:0x0251->B:106:0x0257, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0272  */
    /* JADX WARN: Code duplicated, block: B:110:0x0284  */
    /* JADX WARN: Code duplicated, block: B:113:0x0297  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:98:0x020c A[LOOP:2: B:96:0x0206->B:98:0x020c, LOOP_END] */
    /* JADX INFO: renamed from: l0 */
    private static final void m126551l0(C33883a c33883a, boolean z4, Modifier modifier, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        boolean z13;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        int i16;
        int iM36284n;
        List<InterfaceC25312u> listM107158b;
        Iterable iterableM74158x1;
        Iterable iterable;
        boolean zM107157a;
        C23016z c23016z;
        Iterator<T> it;
        C23016z c23016z2;
        Iterator it3;
        boolean z14;
        int size;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1669021379);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c33883a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        boolean z15 = z4;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z15) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                C2305k c2305k = C2299e.f9111N;
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                C0209i c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                C0209i c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    i16 = i15;
                } else {
                    i16 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    if (c33883a.getPinTrailingToBottom()) {
                        int iM107160d = c33883a.getPinnedTrailingItemCount();
                        size = c33883a.m107158b().size();
                        if (size < 1) {
                            size = 1;
                        }
                        iM36284n = AbstractC12889b.m36284n(iM107160d, 1, size);
                    } else {
                        iM36284n = 0;
                    }
                    listM107158b = c33883a.m107158b();
                    if (iM36284n > 0) {
                        listM107158b = AbstractC25265s.m74086A0(iM36284n, listM107158b);
                    }
                    if (iM36284n > 0) {
                        iterableM74158x1 = AbstractC25265s.m74158x1(iM36284n, c33883a.m107158b());
                    } else {
                        iterableM74158x1 = C25271y.f99162w;
                    }
                    iterable = iterableM74158x1;
                    zM107157a = c33883a.getCenterLeadingContent();
                    c23016z = C23016z.f90757a;
                    if (zM107157a || !c33883a.getPinTrailingToBottom() || listM107158b.isEmpty()) {
                        c28655q.m87150e0(-782909102);
                        c28655q.m87150e0(390387332);
                        it = listM107158b.iterator();
                        while (it.hasNext()) {
                            AbstractC40861v.m132428p((InterfaceC25312u) it.next(), z4, null, c28655q, i16 & 112, 4);
                            c23016z = c23016z;
                        }
                        c23016z2 = c23016z;
                        c28655q.m87173q(false);
                        if (c33883a.getPinTrailingToBottom()) {
                            c28655q.m87150e0(-782747933);
                            AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-782680663);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87150e0(390395204);
                        it3 = iterable.iterator();
                        while (it3.hasNext()) {
                            AbstractC40861v.m132428p((InterfaceC25312u) it3.next(), z4, null, c28655q, i16 & 112, 4);
                        }
                        c28655q.m87173q(false);
                        if (c33883a.getPinTrailingToBottom()) {
                            z14 = true;
                            c28655q.m87150e0(-782435639);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-782502909);
                            z14 = true;
                            AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-783508208);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t, true, 1.0f));
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        List<InterfaceC25312u> list = listM107158b;
                        int iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                        int iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        c28655q.m87150e0(1618165547);
                        Iterator<T> it4 = list.iterator();
                        while (it4.hasNext()) {
                            AbstractC40861v.m132428p((InterfaceC25312u) it4.next(), z15, null, c28655q, i16 & 112, 4);
                            z15 = z4;
                        }
                        AbstractC25012a.m73392y(c28655q, false, true, true);
                        Iterator it5 = iterable.iterator();
                        while (it5.hasNext()) {
                            AbstractC40861v.m132428p((InterfaceC25312u) it5.next(), z4, null, c28655q, i16 & 112, 4);
                        }
                        c28655q.m87173q(false);
                        z14 = true;
                    }
                    c28655q.m87173q(z14);
                    modifier2 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                if (c33883a.getPinTrailingToBottom()) {
                    int iM107160d2 = c33883a.getPinnedTrailingItemCount();
                    size = c33883a.m107158b().size();
                    if (size < 1) {
                        size = 1;
                    }
                    iM36284n = AbstractC12889b.m36284n(iM107160d2, 1, size);
                } else {
                    iM36284n = 0;
                }
                listM107158b = c33883a.m107158b();
                if (iM36284n > 0) {
                    listM107158b = AbstractC25265s.m74086A0(iM36284n, listM107158b);
                }
                if (iM36284n > 0) {
                    iterableM74158x1 = AbstractC25265s.m74158x1(iM36284n, c33883a.m107158b());
                } else {
                    iterableM74158x1 = C25271y.f99162w;
                }
                iterable = iterableM74158x1;
                zM107157a = c33883a.getCenterLeadingContent();
                c23016z = C23016z.f90757a;
                if (zM107157a) {
                    c28655q.m87150e0(-782909102);
                    c28655q.m87150e0(390387332);
                    it = listM107158b.iterator();
                    while (it.hasNext()) {
                        AbstractC40861v.m132428p((InterfaceC25312u) it.next(), z4, null, c28655q, i16 & 112, 4);
                        c23016z = c23016z;
                    }
                    c23016z2 = c23016z;
                    c28655q.m87173q(false);
                    if (c33883a.getPinTrailingToBottom()) {
                        c28655q.m87150e0(-782747933);
                        AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-782680663);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87150e0(390395204);
                    it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        AbstractC40861v.m132428p((InterfaceC25312u) it3.next(), z4, null, c28655q, i16 & 112, 4);
                    }
                    c28655q.m87173q(false);
                    if (c33883a.getPinTrailingToBottom()) {
                        c28655q.m87150e0(-782502909);
                        z14 = true;
                        AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                        c28655q.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q.m87150e0(-782435639);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-782909102);
                    c28655q.m87150e0(390387332);
                    it = listM107158b.iterator();
                    while (it.hasNext()) {
                        AbstractC40861v.m132428p((InterfaceC25312u) it.next(), z4, null, c28655q, i16 & 112, 4);
                        c23016z = c23016z;
                    }
                    c23016z2 = c23016z;
                    c28655q.m87173q(false);
                    if (c33883a.getPinTrailingToBottom()) {
                        c28655q.m87150e0(-782747933);
                        AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-782680663);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87150e0(390395204);
                    it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        AbstractC40861v.m132428p((InterfaceC25312u) it3.next(), z4, null, c28655q, i16 & 112, 4);
                    }
                    c28655q.m87173q(false);
                    if (c33883a.getPinTrailingToBottom()) {
                        c28655q.m87150e0(-782502909);
                        z14 = true;
                        AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                        c28655q.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q.m87150e0(-782435639);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                modifier2 = modifier2;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(c33883a, z4, modifier2, i13, i14, 7);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            C2305k c2305k2 = C2299e.f9111N;
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a3);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            C0209i c0209i8 = C0217k.f732j;
            if (c28655q.f115903S) {
                i16 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                if (c33883a.getPinTrailingToBottom()) {
                    int iM107160d3 = c33883a.getPinnedTrailingItemCount();
                    size = c33883a.m107158b().size();
                    if (size < 1) {
                        size = 1;
                    }
                    iM36284n = AbstractC12889b.m36284n(iM107160d3, 1, size);
                } else {
                    iM36284n = 0;
                }
                listM107158b = c33883a.m107158b();
                if (iM36284n > 0) {
                    listM107158b = AbstractC25265s.m74086A0(iM36284n, listM107158b);
                }
                if (iM36284n > 0) {
                    iterableM74158x1 = AbstractC25265s.m74158x1(iM36284n, c33883a.m107158b());
                } else {
                    iterableM74158x1 = C25271y.f99162w;
                }
                iterable = iterableM74158x1;
                zM107157a = c33883a.getCenterLeadingContent();
                c23016z = C23016z.f90757a;
                if (zM107157a) {
                    c28655q.m87150e0(-782909102);
                    c28655q.m87150e0(390387332);
                    it = listM107158b.iterator();
                    while (it.hasNext()) {
                        AbstractC40861v.m132428p((InterfaceC25312u) it.next(), z4, null, c28655q, i16 & 112, 4);
                        c23016z = c23016z;
                    }
                    c23016z2 = c23016z;
                    c28655q.m87173q(false);
                    if (c33883a.getPinTrailingToBottom()) {
                        c28655q.m87150e0(-782747933);
                        AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-782680663);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87150e0(390395204);
                    it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        AbstractC40861v.m132428p((InterfaceC25312u) it3.next(), z4, null, c28655q, i16 & 112, 4);
                    }
                    c28655q.m87173q(false);
                    if (c33883a.getPinTrailingToBottom()) {
                        c28655q.m87150e0(-782502909);
                        z14 = true;
                        AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                        c28655q.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q.m87150e0(-782435639);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-782909102);
                    c28655q.m87150e0(390387332);
                    it = listM107158b.iterator();
                    while (it.hasNext()) {
                        AbstractC40861v.m132428p((InterfaceC25312u) it.next(), z4, null, c28655q, i16 & 112, 4);
                        c23016z = c23016z;
                    }
                    c23016z2 = c23016z;
                    c28655q.m87173q(false);
                    if (c33883a.getPinTrailingToBottom()) {
                        c28655q.m87150e0(-782747933);
                        AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-782680663);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87150e0(390395204);
                    it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        AbstractC40861v.m132428p((InterfaceC25312u) it3.next(), z4, null, c28655q, i16 & 112, 4);
                    }
                    c28655q.m87173q(false);
                    if (c33883a.getPinTrailingToBottom()) {
                        c28655q.m87150e0(-782502909);
                        z14 = true;
                        AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                        c28655q.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q.m87150e0(-782435639);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                modifier2 = modifier2;
            } else {
                i16 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i8);
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N4);
            if (c33883a.getPinTrailingToBottom()) {
                int iM107160d4 = c33883a.getPinnedTrailingItemCount();
                size = c33883a.m107158b().size();
                if (size < 1) {
                    size = 1;
                }
                iM36284n = AbstractC12889b.m36284n(iM107160d4, 1, size);
            } else {
                iM36284n = 0;
            }
            listM107158b = c33883a.m107158b();
            if (iM36284n > 0) {
                listM107158b = AbstractC25265s.m74086A0(iM36284n, listM107158b);
            }
            if (iM36284n > 0) {
                iterableM74158x1 = AbstractC25265s.m74158x1(iM36284n, c33883a.m107158b());
            } else {
                iterableM74158x1 = C25271y.f99162w;
            }
            iterable = iterableM74158x1;
            zM107157a = c33883a.getCenterLeadingContent();
            c23016z = C23016z.f90757a;
            if (zM107157a) {
                c28655q.m87150e0(-782909102);
                c28655q.m87150e0(390387332);
                it = listM107158b.iterator();
                while (it.hasNext()) {
                    AbstractC40861v.m132428p((InterfaceC25312u) it.next(), z4, null, c28655q, i16 & 112, 4);
                    c23016z = c23016z;
                }
                c23016z2 = c23016z;
                c28655q.m87173q(false);
                if (c33883a.getPinTrailingToBottom()) {
                    c28655q.m87150e0(-782747933);
                    AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-782680663);
                    c28655q.m87173q(false);
                }
                c28655q.m87150e0(390395204);
                it3 = iterable.iterator();
                while (it3.hasNext()) {
                    AbstractC40861v.m132428p((InterfaceC25312u) it3.next(), z4, null, c28655q, i16 & 112, 4);
                }
                c28655q.m87173q(false);
                if (c33883a.getPinTrailingToBottom()) {
                    c28655q.m87150e0(-782502909);
                    z14 = true;
                    AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                    c28655q.m87173q(false);
                } else {
                    z14 = true;
                    c28655q.m87150e0(-782435639);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-782909102);
                c28655q.m87150e0(390387332);
                it = listM107158b.iterator();
                while (it.hasNext()) {
                    AbstractC40861v.m132428p((InterfaceC25312u) it.next(), z4, null, c28655q, i16 & 112, 4);
                    c23016z = c23016z;
                }
                c23016z2 = c23016z;
                c28655q.m87173q(false);
                if (c33883a.getPinTrailingToBottom()) {
                    c28655q.m87150e0(-782747933);
                    AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-782680663);
                    c28655q.m87173q(false);
                }
                c28655q.m87150e0(390395204);
                it3 = iterable.iterator();
                while (it3.hasNext()) {
                    AbstractC40861v.m132428p((InterfaceC25312u) it3.next(), z4, null, c28655q, i16 & 112, 4);
                }
                c28655q.m87173q(false);
                if (c33883a.getPinTrailingToBottom()) {
                    c28655q.m87150e0(-782502909);
                    z14 = true;
                    AbstractC22953f.m66715b(c28655q, c23016z2.m66779c(c2314t, true, 1.0f));
                    c28655q.m87173q(false);
                } else {
                    z14 = true;
                    c28655q.m87150e0(-782435639);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            modifier2 = modifier2;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(c33883a, z4, modifier2, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m126553m0(C33883a c33883a, boolean z4, Modifier modifier, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m126551l0(c33883a, z4, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m126557o0(Object event, Function1 onViewEvent, Function1 sendViewEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(sendViewEvent, "sendViewEvent");
        if (event instanceof C33893k) {
            C33893k c33893k = (C33893k) event;
            C21166s c21166sM107208b = c33893k.getDismissEvent();
            if (c21166sM107208b != null) {
                onViewEvent.invoke(c21166sM107208b);
            }
            onViewEvent.invoke(c33893k.getDestination());
            return;
        }
        if ((event instanceof C21166s) || (event instanceof C9598e)) {
            onViewEvent.invoke(event);
        } else if (event instanceof InterfaceC33892j.l) {
            sendViewEvent.invoke(event);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private static final InterfaceC15156u0 m126559p0(Composer composer, int i13) {
        C22976l1 c22976l1 = AbstractC15166v0.f56891a;
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        return AbstractC15166v0.m43196a(c38072d.m121949b(composer, i14).getWhite10(), c38072d.m121949b(composer, i14).getBrandWhite(), c38072d.m121949b(composer, i14).getWhite10(), c38072d.m121949b(composer, i14).getWhite20(), composer, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m126561q0(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25292c0.class), new C25290b0());
        designItemViewFactory.m74323b(AbstractC28001g.m84460b());
        return C23454a0.f92919a;
    }
}
