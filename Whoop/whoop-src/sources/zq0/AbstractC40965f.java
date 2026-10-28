package zq0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.Window;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1094c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import bb2.C2929e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.communityeverydaystats.domain.models.SecurityPolicyModel;
import com.whoop.design.models.AchievementsBackgroundStyle;
import com.whoop.navigation.models.GenericInteraction;
import cw2.C11161b;
import e93.AbstractC12889b;
import gb1.AbstractC15670a;
import gb1.AbstractC15679g;
import gb1.AbstractC15684l;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kz0.AbstractC22922c;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m51.AbstractC25080b;
import m83.AbstractC25265s;
import m83.C25271y;
import nf3.C26669a;
import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2414n2;
import p027b3.InterfaceC2410m3;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11362i1;
import p077d0.C11412w1;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p132f0.C13825t;
import p180h0.AbstractC16434o3;
import p180h0.AbstractC16444q3;
import p180h0.AbstractC16486z0;
import p180h0.C16466v0;
import p181h2.C16617b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17921y;
import p208i2.C17907r;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.C17923z;
import p208i2.InterfaceC17886g0;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34460g0;
import p512u2.C34462h0;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.EnumC34466l;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p530up.AbstractC35148d;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22663d0;
import p716lb1.AbstractC23594b;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.C33209p1;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import pf3.C29155a;
import q12.C29801b;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import wr0.C37533i0;
import x30.C37900j1;
import x81.C38072d;
import xf3.C38266c;
import xq0.EnumC38541a;
import yo1.C39689b;
import z51.C40103n;
import zm1.C40893d;

/* JADX INFO: renamed from: zq0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0082\u0010¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001ae\u0010)\u001a\u00020\u0000*\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060#H\u0002¢\u0006\u0004\b)\u0010*\u001a)\u0010/\u001a\u00020\u0000*\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010.\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u00100\u001a\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105\u001a!\u00107\u001a\u00020\u0000*\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00160#H\u0003¢\u0006\u0004\b7\u00108\u001a\u0013\u00109\u001a\u00020\u0000*\u00020\u0002H\u0003¢\u0006\u0004\b9\u0010:\u001a\u0015\u0010<\u001a\u0004\u0018\u00010;*\u00020\u0002H\u0002¢\u0006\u0004\b<\u0010=\u001a\u001b\u0010@\u001a\u00020\u0000*\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0003¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010B\u001a\u00020\u0000*\u00020\u0000H\u0003¢\u0006\u0004\bB\u0010C\"\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010I\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010F\"\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\"\u0014\u0010O\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010L\"\u0014\u0010Q\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010F\"\u0014\u0010S\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010F\"\u0014\u0010U\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010F¨\u0006\\²\u0006\u000e\u0010W\u001a\u00020V8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010X\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u0018\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010[\u001a\u00020Z8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lzq0/l;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/ui/Modifier;Lzq0/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "screenshotDisabled", "r", "(ZLandroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "Landroid/app/Activity;", "T", "(Landroid/content/Context;)Landroid/app/Activity;", "Lm91/u;", "item", "K", "(Lm91/u;Landroidx/compose/runtime/Composer;I)V", "", "totalDx", "threshold", "isRtl", "X", "(FFZ)Z", "W", "Lcom/whoop/navigation/models/GenericInteraction;", "a0", "(Lzq0/l;)Lcom/whoop/navigation/models/GenericInteraction;", "dismissAction", "Lzq0/p;", "tracker", "Lkotlin/Function0;", "isAtTop", "thresholdPx", "velocityThresholdPx", "onDismiss", "onSnapBack", "b0", "(Landroidx/compose/ui/Modifier;Lcom/whoop/navigation/models/GenericInteraction;Lzq0/p;Lc93/a;FFLkotlin/jvm/functions/Function1;Lc93/a;)Landroidx/compose/ui/Modifier;", "", "Lzq0/o;", "footerSlots", "maxRadiusPx", "U", "(Landroidx/compose/ui/Modifier;Ljava/util/List;F)Landroidx/compose/ui/Modifier;", "Li2/x;", "tint", "Li2/y;", "Y", "(J)Li2/y;", "contentTopPx", "R", "(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Q", "(Lzq0/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Ly81/e;", "Z", "(Lzq0/l;)Ly81/e;", "Lxq0/a;", "style", "c0", "(Landroidx/compose/ui/Modifier;Lxq0/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "d0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Ly3/f;", "a", "F", "EXPANDED_OVERLAY_BLUR", "b", "SnapshotProgressBarHeight", "Lt0/i;", "c", "Lt0/i;", "SnapshotProgressBarShape", "d", "SnapshotContainerShape", "e", "ScrimRampHeight", "f", "SnapshotGlowCenterY", "g", "SnapshotGlowRadius", "", "headerChromeHeightPx", "currentViewState", "currentOnViewEvent", "Lzq0/r;", "screenshotBlocker", "community-everyday-stats_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40965f {

    /* JADX INFO: renamed from: b */
    private static final float f176772b;

    /* JADX INFO: renamed from: d */
    private static final C33252i f176774d;

    /* JADX INFO: renamed from: e */
    private static final float f176775e;

    /* JADX INFO: renamed from: a */
    private static final float f176771a = 12;

    /* JADX INFO: renamed from: c */
    private static final C33252i f176773c = AbstractC33253j.m105486b(50);

    /* JADX INFO: renamed from: f */
    private static final float f176776f = (float) 140.5d;

    /* JADX INFO: renamed from: g */
    private static final float f176777g = 310;

    /* JADX INFO: renamed from: zq0.f$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f176778w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f176779x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f176780y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f176778w = c38266c;
            this.f176779x = interfaceC35951a;
            this.f176780y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zq0.r] */
        @Override // c93.InterfaceC4339a
        public final C40977r invoke() {
            return this.f176778w.m122602a(this.f176780y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40977r.class), this.f176779x);
        }
    }

    /* JADX INFO: renamed from: zq0.f$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"zq0/f$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Window f176781a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC23462h f176782b;

        public b(Window window, InterfaceC23462h interfaceC23462h) {
            this.f176781a = window;
            this.f176782b = interfaceC23462h;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            AbstractC40965f.m132979t(this.f176782b).m133055b(this.f176781a);
        }
    }

    /* JADX INFO: renamed from: zq0.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ boolean f176783w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f176784x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f176785y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f176786z;

        public c(boolean z4, float f13, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3) {
            this.f176783w = z4;
            this.f176784x = f13;
            this.f176785y = interfaceC28670t2;
            this.f176786z = interfaceC28670t3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m132987b(InterfaceC34476v interfaceC34476v, boolean z4, float f13, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, C16617b c16617b) {
            if (AbstractC40973n.m133026a(c16617b.f63937a, (int) (((C34462h0) interfaceC34476v).f144789Y >> 32), z4, f13)) {
                GenericInteraction genericInteractionM133003e = AbstractC40965f.m132983x(interfaceC28670t2).getBackAction();
                if (genericInteractionM133003e != null) {
                    AbstractC40965f.m132984y(interfaceC28670t3).invoke(genericInteractionM133003e);
                }
            } else {
                AbstractC40965f.m132984y(interfaceC28670t3).invoke(AbstractC40965f.m132983x(interfaceC28670t2).getNextAction());
            }
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(final InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final boolean z4 = this.f176783w;
            final float f13 = this.f176784x;
            final InterfaceC28670t2 interfaceC28670t2 = this.f176785y;
            final InterfaceC28670t2 interfaceC28670t3 = this.f176786z;
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new Function1() { // from class: zq0.g
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC40965f.c.m132987b(interfaceC34476v, z4, f13, interfaceC28670t2, interfaceC28670t3, (C16617b) obj);
                }
            }, interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zq0.f$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ boolean f176787w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f176788x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f176789y;

        public d(boolean z4, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3) {
            this.f176787w = z4;
            this.f176788x = interfaceC28670t2;
            this.f176789y = interfaceC28670t3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final C23454a0 m132992e(C22663d0 c22663d0, C16617b c16617b) {
            c22663d0.f89331w = 0.0f;
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final C23454a0 m132993f(C22663d0 c22663d0, float f13, boolean z4, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3) {
            GenericInteraction genericInteractionM133003e;
            if (AbstractC40965f.m132952X(c22663d0.f89331w, f13, z4)) {
                AbstractC40965f.m132984y(interfaceC28670t2).invoke(AbstractC40965f.m132983x(interfaceC28670t3).getNextAction());
            } else if (AbstractC40965f.m132951W(c22663d0.f89331w, f13, z4) && (genericInteractionM133003e = AbstractC40965f.m132983x(interfaceC28670t3).getBackAction()) != null) {
                AbstractC40965f.m132984y(interfaceC28670t2).invoke(genericInteractionM133003e);
            }
            c22663d0.f89331w = 0.0f;
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final C23454a0 m132994g(C22663d0 c22663d0) {
            c22663d0.f89331w = 0.0f;
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m132995h(C22663d0 c22663d0, C34472r change, float f13) {
            AbstractC22676k.m65750j(change, "change");
            change.m108946a();
            c22663d0.f89331w += f13;
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final C22663d0 c22663d0 = new C22663d0();
            C34462h0 c34462h0 = (C34462h0) interfaceC34476v;
            c34462h0.getClass();
            final float fMo498g = AbstractC0201g.m516p(c34462h0).f778Z.getTouchSlop();
            int i13 = 0;
            C40967h c40967h = new C40967h(c22663d0, i13);
            final boolean z4 = this.f176787w;
            final InterfaceC28670t2 interfaceC28670t2 = this.f176788x;
            final InterfaceC28670t2 interfaceC28670t3 = this.f176789y;
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: zq0.i
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return AbstractC40965f.d.m132993f(c22663d0, fMo498g, z4, interfaceC28670t2, interfaceC28670t3);
                }
            };
            C40963e c40963e = new C40963e(c22663d0, 2);
            C40969j c40969j = new C40969j(c22663d0, i13);
            float f13 = AbstractC16486z0.f63358a;
            Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new C16466v0(c40967h, c40969j, interfaceC4339a, c40963e, null, 0), interfaceC30057d);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (objM46625g != enumC31071a) {
                objM46625g = c23454a0;
            }
            return objM46625g == enumC31071a ? objM46625g : c23454a0;
        }
    }

    /* JADX INFO: renamed from: zq0.f$e */
    @InterfaceC32271e(m100429c = "com.whoop.communityeverydaystats.view.CommunitySnapshotContainerKt$CommunitySnapshotContainer$requestSnapBack$1$1$1", m100430f = "CommunitySnapshotContainer.kt", m100431l = {204}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176790w;

        /* JADX INFO: renamed from: x */
        float f176791x;

        /* JADX INFO: renamed from: y */
        int f176792y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C40975p f176793z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C40975p c40975p, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176793z = c40975p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m132997h(int i13, C40975p c40975p, C11344e c11344e) {
            if (i13 == c40975p.getSnapGeneration()) {
                c40975p.m133052u(((Number) c11344e.m30549e()).floatValue());
            }
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f176793z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176792y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final int snapGeneration = this.f176793z.getSnapGeneration();
                float fM133042g = this.f176793z.m133042g();
                if (fM133042g > 0.0f) {
                    C11344e c11344eM30553a = AbstractC11348f.m30553a(fM133042g);
                    Float f13 = new Float(0.0f);
                    C11362i1 c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 0.0f, 7, null);
                    final C40975p c40975p = this.f176793z;
                    Function1 function1 = new Function1() { // from class: zq0.k
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC40965f.e.m132997h(snapGeneration, c40975p, (C11344e) obj2);
                        }
                    };
                    this.f176790w = snapGeneration;
                    this.f176791x = fM133042g;
                    this.f176792y = 1;
                    if (C11344e.m30547d(c11344eM30553a, f13, c11362i1M30573u, function1, this, 4) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: zq0.f$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        public static final f f176794w = new f();

        /* JADX INFO: renamed from: zq0.f$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.communityeverydaystats.view.CommunitySnapshotContainerKt$NonInteractiveContentItem$1$2$1$1", m100430f = "CommunitySnapshotContainer.kt", m100431l = {463}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Ll83/a0;", "<anonymous>", "(Lu2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32274h implements InterfaceC4351m {

            /* JADX INFO: renamed from: x */
            int f176795x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f176796y;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f176796y = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [u2.b] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [u2.g0] */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC34466l enumC34466l;
                ?? r10 = (InterfaceC34449b) this.f176796y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f176795x;
                if (i13 != 0 && i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                do {
                    enumC34466l = EnumC34466l.f144807x;
                    this.f176796y = r10;
                    this.f176795x = 1;
                    r10 = (C34460g0) r10;
                } while (r10.m108928a(enumC34466l, this) != enumC31071a);
                return enumC31071a;
            }
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM108934X0 = ((C34462h0) interfaceC34476v).m108934X0(new a(null), interfaceC30057d);
            return objM108934X0 == EnumC31071a.f128113w ? objM108934X0 : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zq0.f$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f176797a;

        static {
            int[] iArr = new int[EnumC38541a.values().length];
            try {
                iArr[EnumC38541a.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38541a.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f176797a = iArr;
        }
    }

    /* JADX INFO: renamed from: zq0.f$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements PointerInputEventHandler {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f176798E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ GenericInteraction f176799F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC4339a f176800G;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C40975p f176801w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f176802x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f176803y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ float f176804z;

        /* JADX INFO: renamed from: zq0.f$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.communityeverydaystats.view.CommunitySnapshotContainerKt$pullDownToDismiss$1$1", m100430f = "CommunitySnapshotContainer.kt", m100431l = {504, 509}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Ll83/a0;", "<anonymous>", "(Lu2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32274h implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            private /* synthetic */ Object f176805E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ C40975p f176806F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ InterfaceC4339a f176807G;

            /* JADX INFO: renamed from: H */
            final /* synthetic */ float f176808H;

            /* JADX INFO: renamed from: I */
            final /* synthetic */ float f176809I;

            /* JADX INFO: renamed from: J */
            final /* synthetic */ Function1 f176810J;

            /* JADX INFO: renamed from: K */
            final /* synthetic */ GenericInteraction f176811K;

            /* JADX INFO: renamed from: L */
            final /* synthetic */ InterfaceC4339a f176812L;

            /* JADX INFO: renamed from: x */
            Object f176813x;

            /* JADX INFO: renamed from: y */
            Object f176814y;

            /* JADX INFO: renamed from: z */
            int f176815z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C40975p c40975p, InterfaceC4339a interfaceC4339a, float f13, float f14, Function1 function1, GenericInteraction genericInteraction, InterfaceC4339a interfaceC4339a2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f176806F = c40975p;
                this.f176807G = interfaceC4339a;
                this.f176808H = f13;
                this.f176809I = f14;
                this.f176810J = function1;
                this.f176811K = genericInteraction;
                this.f176812L = interfaceC4339a2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f176806F, this.f176807G, this.f176808H, this.f176809I, this.f176810J, this.f176811K, this.f176812L, interfaceC30057d);
                aVar.f176805E = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
            
                if (r3 == r2) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
            
                if (r7 == r2) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
            
                return r2;
             */
            /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006b -> B:17:0x006e). Please report as a decompilation issue!!! */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 289
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: zq0.AbstractC40965f.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public h(C40975p c40975p, InterfaceC4339a interfaceC4339a, float f13, float f14, Function1 function1, GenericInteraction genericInteraction, InterfaceC4339a interfaceC4339a2) {
            this.f176801w = c40975p;
            this.f176802x = interfaceC4339a;
            this.f176803y = f13;
            this.f176804z = f14;
            this.f176798E = function1;
            this.f176799F = genericInteraction;
            this.f176800G = interfaceC4339a2;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new a(this.f176801w, this.f176802x, this.f176803y, this.f176804z, this.f176798E, this.f176799F, this.f176800G, null), interfaceC30057d);
            return objM46625g == EnumC31071a.f128113w ? objM46625g : C23454a0.f92919a;
        }
    }

    static {
        float f13 = 4;
        f176772b = ((float) 0.5d) * f13;
        float f14 = 6 * f13;
        f176774d = AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12);
        f176775e = 30 * f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final boolean m132929A(C13821r1 c13821r1) {
        return c13821r1.f49318a.m87024x() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m132930B(GenericInteraction genericInteraction, Function1 function1) {
        if (genericInteraction != null) {
            function1.invoke(genericInteraction);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m132931C(C40975p c40975p, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51550E(c40975p.m133042g());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final float m132932D(float f13, C13821r1 c13821r1) {
        return f13 - c13821r1.f49318a.m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m132933E(InterfaceC28593a1 interfaceC28593a1, C39180l c39180l) {
        m132937I(interfaceC28593a1, (int) (c39180l.f168422a & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final boolean m132934F(C13821r1 c13821r1) {
        return c13821r1.f49318a.m87024x() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m132935G(Modifier modifier, C40971l c40971l, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m132982w(modifier, c40971l, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final int m132936H(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: I */
    private static final void m132937I(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m132938J(InterfaceC2994c0 interfaceC2994c0, C40975p c40975p) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c40975p, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final void m132939K(final InterfaceC25312u interfaceC25312u, Composer composer, final int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1789658660);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
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
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40893d(2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, (i14 & 14) | 3072, 6);
            c28655q.m87173q(true);
            Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = f.f176794w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22989q.m66760a(AbstractC34452c0.m108903b(modifierMo3401b, C23454a0.f92919a, (PointerInputEventHandler) objM87133R2), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: zq0.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40965f.m132941M(interfaceC25312u, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m132940L(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m132941M(InterfaceC25312u interfaceC25312u, int i13, Composer composer, int i14) {
        m132939K(interfaceC25312u, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final Modifier m132945Q(C40971l c40971l, Composer composer, int i13) {
        AbstractC22403o abstractC22403oM133005g = c40971l.getBackgroundImage();
        C2314t c2314t = C2314t.f9131w;
        if (abstractC22403oM133005g != null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(190754139);
            c28655q.m87173q(false);
            return c2314t;
        }
        if (c40971l.getBackground() != null) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(190755570);
            Modifier modifierM73578b = AbstractC25080b.m73578b(c2314t, c40971l.getBackground(), 0.0f, c28655q2, 6, 2);
            c28655q2.m87173q(false);
            return modifierM73578b;
        }
        if (c40971l.getAchievementBackgroundStyle() != null) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(190758245);
            Modifier modifierM43971a = AbstractC15670a.m43971a(c2314t, c40971l.getAchievementBackgroundStyle(), c28655q3, 6);
            c28655q3.m87173q(false);
            return modifierM43971a;
        }
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87150e0(190760522);
        Modifier modifierM132962d0 = m132962d0(c2314t, c28655q4, 6);
        c28655q4.m87173q(false);
        return modifierM132962d0;
    }

    /* JADX INFO: renamed from: R */
    private static final Modifier m132946R(Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        long jM125410o = c38072d.m121949b(composer, i14).getBackgroundDarkStd();
        long jM125368V0 = c38072d.m121949b(composer, i14).getTransparent();
        C28655q c28655q = (C28655q) composer;
        float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f176775e);
        boolean zM87151f = ((((i13 & 112) ^ 48) > 32 && c28655q.m87153g(interfaceC4339a)) || (i13 & 48) == 32) | c28655q.m87151f(jM125368V0) | c28655q.m87151f(jM125410o) | c28655q.m87147d(fMo743q0);
        Object objM87133R = c28655q.m87133R();
        if (zM87151f || objM87133R == C28635l.f115821a) {
            C37533i0 c37533i0 = new C37533i0(interfaceC4339a, jM125368V0, jM125410o, fMo743q0, 1);
            c28655q.m87172p0(c37533i0);
            objM87133R = c37533i0;
        }
        return AbstractC1125a.m3480c(modifier, (Function1) objM87133R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m132947S(InterfaceC4339a interfaceC4339a, long j7, long j13, float f13, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        C22128b c22128b = c0238p0.f815w;
        c0238p0.m728a();
        float fFloatValue = ((Number) interfaceC4339a.invoke()).floatValue();
        float f14 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L));
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (f14 >= fIntBitsToFloat) {
            return c23454a0;
        }
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(j13)), fFloatValue, fFloatValue + f13, 8), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) - f14))), 0.0f, null, 0, 120);
        return c23454a0;
    }

    /* JADX INFO: renamed from: T */
    private static final Activity m132948T(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            AbstractC22676k.m65749i(context, "getBaseContext(...)");
        }
        return (Activity) context;
    }

    /* JADX INFO: renamed from: U */
    private static final Modifier m132949U(Modifier modifier, List<C40974o> list, float f13) {
        return AbstractC1127a.m3486a(modifier, new C11412w1(list, f13, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m132950V(List list, float f13, InterfaceC17886g0 graphicsLayer) {
        Float fValueOf;
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) ((C40974o) it.next()).getDeclared().m74332d().invoke()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) ((C40974o) it.next()).getDeclared().m74332d().invoke()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        float fM36283m = f13 * (fValueOf != null ? AbstractC12889b.m36283m(fValueOf.floatValue(), 0.0f, 1.0f) : 0.0f);
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51556g(fM36283m > 0.0f ? new C17907r(fM36283m, fM36283m, 0) : null);
        c17920x0.m51554e(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    public static final boolean m132951W(float f13, float f14, boolean z4) {
        if (z4) {
            return f13 <= (-f14);
        }
        return f13 >= f14;
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m132952X(float f13, float f14, boolean z4) {
        if (z4) {
            return f13 >= f14;
        }
        return f13 <= (-f14);
    }

    /* JADX INFO: renamed from: Y */
    private static final AbstractC17921y m132953Y(long j7) {
        float[] fArrM111187r = AbstractC35148d.m111187r();
        AbstractC35148d.m111165P(fArrM111187r, C17919x.m51547i(j7), C17919x.m51546h(j7), C17919x.m51544f(j7));
        float[] fArrM111187r2 = AbstractC35148d.m111187r();
        AbstractC35148d.m111164O(fArrM111187r2);
        AbstractC35148d.m111168S(fArrM111187r, fArrM111187r2);
        return new C17923z(fArrM111187r);
    }

    /* JADX INFO: renamed from: Z */
    private static final InterfaceC39332e m132954Z(C40971l c40971l) {
        InterfaceC39332e interfaceC39332eM133000a = c40971l.getAccentColor();
        if (interfaceC39332eM133000a != null) {
            return interfaceC39332eM133000a;
        }
        AchievementsBackgroundStyle achievementsBackgroundStyleM133001b = c40971l.getAchievementBackgroundStyle();
        if (achievementsBackgroundStyleM133001b != null) {
            return AbstractC23594b.m68508g(achievementsBackgroundStyleM133001b.name());
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static final GenericInteraction m132956a0(C40971l c40971l) {
        Object next;
        AbstractC22676k.m65750j(c40971l, "<this>");
        List<InterfaceC25312u> listM133008j = c40971l.m133008j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM133008j) {
            if (obj instanceof C40984y) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList2, ((C40984y) it.next()).m133095e());
        }
        Iterator it3 = arrayList2.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((C40984y.a) next).getAction().getDismissEvent() == null);
        C40984y.a aVar = (C40984y.a) next;
        GenericInteraction genericInteractionM133096a = aVar != null ? aVar.getAction() : null;
        if (genericInteractionM133096a != null) {
            return genericInteractionM133096a;
        }
        GenericInteraction genericInteractionM133003e = c40971l.getBackAction();
        if (genericInteractionM133003e == null || genericInteractionM133003e.getDismissEvent() == null) {
            return null;
        }
        return genericInteractionM133003e;
    }

    /* JADX INFO: renamed from: b0 */
    private static final Modifier m132958b0(Modifier modifier, GenericInteraction genericInteraction, C40975p c40975p, InterfaceC4339a interfaceC4339a, float f13, float f14, Function1 function1, InterfaceC4339a interfaceC4339a2) {
        return genericInteraction == null ? modifier : AbstractC34452c0.m108905d(modifier, new Object[]{genericInteraction, c40975p, Float.valueOf(f13), Float.valueOf(f14), interfaceC4339a2}, new h(c40975p, interfaceC4339a, f13, f14, function1, genericInteraction, interfaceC4339a2));
    }

    /* JADX INFO: renamed from: c0 */
    private static final Modifier m132960c0(Modifier modifier, EnumC38541a enumC38541a, Composer composer, int i13) {
        int i14 = g.f176797a[enumC38541a.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1645302477);
            C13825t c13825tM48880a = AbstractC17269i.m48880a(((float) 0.25d) * 4, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20());
            Modifier modifierM44456i = AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifier, c13825tM48880a.f49346b, f176774d);
            c28655q.m87173q(false);
            return modifierM44456i;
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(-1645304034, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1645298301);
        float f13 = 7;
        Modifier modifierM44107d = AbstractC15679g.m44107d(modifier, (float) 1.5d, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite30(), f176774d, f13, f13);
        c28655q2.m87173q(false);
        return modifierM44107d;
    }

    /* JADX INFO: renamed from: d0 */
    private static final Modifier m132962d0(Modifier modifier, Composer composer, int i13) {
        long jM125393f0 = C38072d.f163053a.m121949b(composer, C38072d.f163054b).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        C28655q c28655q = (C28655q) composer;
        boolean zM87151f = c28655q.m87151f(jM125393f0);
        Object objM87133R = c28655q.m87133R();
        if (zM87151f || objM87133R == C28635l.f115821a) {
            objM87133R = new C33209p1(jM125393f0, 11);
            c28655q.m87172p0(objM87133R);
        }
        return AbstractC1125a.m3478a(modifier, (Function1) objM87133R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m132964e0(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k[] c23465kArr = {new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.2f, j7))), new C23465k(Float.valueOf(0.817f), new C17919x(C17919x.m51541c(0.0f, j7)))};
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) * 0.17175573f;
        float fMo743q0 = drawBehind.mo743q0(f176776f);
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51490h(c17909s, c23465kArr, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), drawBehind.mo743q0(f176777g), 8), 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m132977r(boolean z4, Composer composer, int i13) {
        int i14;
        C28677v1 c28677v1M87180u;
        C2929e c2929e;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-555746768);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Activity activityM132948T = m132948T((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
            Window window = activityM132948T != null ? activityM132948T.getWindow() : null;
            if (!z4 || window == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c2929e = new C2929e(z4, i13, 6);
                }
            } else {
                c28655q.m87152f0(1903845737);
                C26669a c26669a = C29155a.f118017b;
                if (c26669a == null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                C38266c c38266c = c26669a.f106046a.f159364d;
                c28655q.m87152f0(-3686552);
                boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                boolean zM87157i = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(window);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C37900j1(23, window, interfaceC23462h);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87251e(window, (Function1) objM87133R2, c28655q);
            }
            c28677v1M87180u.f115982d = c2929e;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c2929e = new C2929e(z4, i13, 5);
            c28677v1M87180u.f115982d = c2929e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m132978s(boolean z4, int i13, Composer composer, int i14) {
        m132977r(z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C40977r m132979t(InterfaceC23462h interfaceC23462h) {
        return (C40977r) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC28620h0 m132980u(Window window, InterfaceC23462h interfaceC23462h, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        m132979t(interfaceC23462h).m133054a(window);
        return new b(window, interfaceC23462h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m132981v(boolean z4, int i13, Composer composer, int i14) {
        m132977r(z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
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
    /* JADX INFO: renamed from: w */
    public static final void m132982w(Modifier modifier, final C40971l viewState, final Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-499472803);
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
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            SecurityPolicyModel securityPolicyModelM133013o = viewState.getSecurityPolicy();
            m132977r(securityPolicyModelM133013o != null && securityPolicyModelM133013o.getScreenshotDisabled(), c28655q2, 0);
            final InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            final boolean z4 = c28655q2.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x;
            final float fM133027b = AbstractC40973n.m133027b(C38072d.f163053a.m121950c(c28655q2, C38072d.f163054b).isFeatureEnabled("community-snapshot-touch-region-fix"));
            final float fMo743q0 = interfaceC39171c.mo743q0(f176771a);
            final boolean z13 = !viewState.m133007i().isEmpty();
            WeakHashMap weakHashMap = C22944c2.f90553v;
            final float fMo43109a = AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a();
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(0, c28655q2);
            }
            final InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
            boolean zM87153g = c28655q2.m87153g(viewState.getId()) | c28655q2.m87149e(viewState.m133007i().size());
            Object objM87133R2 = c28655q2.m87133R();
            Object obj = objM87133R2;
            if (zM87153g || objM87133R2 == c28676v0) {
                int size = viewState.m133007i().size();
                ArrayList arrayList = new ArrayList(size);
                for (int i17 = 0; i17 < size; i17++) {
                    arrayList.add(new C40974o());
                }
                c28655q2.m87172p0(arrayList);
                obj = arrayList;
            }
            final List list = (List) obj;
            final GenericInteraction genericInteractionM132956a0 = m132956a0(viewState);
            boolean zM87153g2 = c28655q2.m87153g(viewState.getId());
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C13821r1(0);
                c28655q2.m87172p0(objM87133R3);
            }
            final C13821r1 c13821r1 = (C13821r1) objM87133R3;
            boolean zM87153g3 = c28655q2.m87153g(viewState.getId());
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87153g3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C40975p();
                c28655q2.m87172p0(objM87133R4);
            }
            final C40975p c40975p = (C40975p) objM87133R4;
            final float density = interfaceC39171c.getDensity() * 800.0f;
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R5;
            boolean zM87153g4 = c28655q2.m87153g(c40975p) | c28655q2.m87153g(interfaceC2994c0);
            Object objM87133R6 = c28655q2.m87133R();
            if (zM87153g4 || objM87133R6 == c28676v0) {
                objM87133R6 = new C39689b(22, interfaceC2994c0, c40975p);
                c28655q2.m87172p0(objM87133R6);
            }
            final InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
            Iterator it = list.iterator();
            int iM133028a = 0;
            while (it.hasNext()) {
                iM133028a = ((C40974o) it.next()).m133028a() + iM133028a;
            }
            final float fMo733e0 = interfaceC39171c.mo733e0(iM133028a);
            final InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(viewState, c28655q2);
            final InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(onViewEvent, c28655q2);
            Modifier modifierM3368c = AbstractC1094c.m3368c(AbstractC1102d.m3407d(1.0f, modifier4));
            Function3 function3 = new Function3() { // from class: zq0.d
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC40965f.m132985z(interfaceC39171c, viewState, fMo43109a, c40975p, density, genericInteractionM132956a0, onViewEvent, interfaceC4339a, interfaceC28593a1, c13821r1, z13, list, fMo733e0, fMo743q0, z4, fM133027b, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, (InterfaceC23004v) obj2, (Composer) obj3, iIntValue);
                }
            };
            C28655q c28655q3 = c28655q2;
            AbstractC22953f.m66714a(modifierM3368c, null, false, AbstractC37817c.m121344e(852005427, c28655q3, function3), c28655q3, 3072, 6);
            modifier3 = modifier4;
            c28655q = c28655q3;
        } else {
            C28655q c28655q4 = c28655q2;
            c28655q4.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(modifier3, viewState, onViewEvent, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C40971l m132983x(InterfaceC28670t2 interfaceC28670t2) {
        return (C40971l) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Function1 m132984y(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m132985z(InterfaceC39171c interfaceC39171c, C40971l c40971l, float f13, C40975p c40975p, float f14, GenericInteraction genericInteraction, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC28593a1 interfaceC28593a1, C13821r1 c13821r1, boolean z4, List list, float f15, float f16, boolean z13, float f17, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        float fMo733e0;
        C40975p c40975p2;
        float f18;
        C28655q c28655q;
        Object objM133053a;
        C17919x c17919xM31989h;
        C28655q c28655q2;
        List list2;
        C13821r1 c13821r2;
        AbstractC22403o abstractC22403o;
        int i14;
        float f19;
        C2314t c2314t;
        Modifier modifierM132949U;
        Modifier modifierM3357b;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        int i15 = (i13 & 6) == 0 ? i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2) : i13;
        int i16 = 1;
        C28655q c28655q3 = (C28655q) composer;
        if (c28655q3.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C1101c c1101c = (C1101c) BoxWithConstraints;
            if (C39174f.m124782b(c1101c.m3402c(), Float.POSITIVE_INFINITY)) {
                c28655q3.m87150e0(-1162765934);
                fMo733e0 = interfaceC39171c.mo733e0((int) (((C2414n2) ((InterfaceC2410m3) c28655q3.m87161k(AbstractC2453v1.f9581t))).m7408a() & 4294967295L));
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-1162806482);
                c28655q3.m87173q(false);
                fMo733e0 = c1101c.m3402c();
            }
            float fMo743q0 = interfaceC39171c.mo743q0(fMo733e0) * 0.33333334f;
            AbstractC22403o abstractC22403oM133005g = c40971l.getBackgroundImage();
            float fMo733e1 = interfaceC39171c.mo733e0(m132936H(interfaceC28593a1));
            float f24 = fMo733e0 - f13;
            float f25 = fMo733e0;
            C39174f c39174f = new C39174f(c40971l.getPhotoRevealFraction() * f24);
            if (abstractC22403oM133005g == null) {
                c39174f = null;
            }
            if (c39174f != null) {
                fMo733e1 = ((C39174f) AbstractC12889b.m36281k(c39174f, new C39174f(fMo733e1))).f168413w;
            }
            boolean zM87153g = c28655q3.m87153g(c40975p) | c28655q3.m87147d(fMo743q0) | c28655q3.m87147d(f14) | c28655q3.m87153g(genericInteraction) | c28655q3.m87153g(function1) | c28655q3.m87153g(interfaceC4339a);
            Object objM87133R = c28655q3.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                c40975p2 = c40975p;
                f18 = fMo733e1;
                c28655q = c28655q3;
                objM133053a = AbstractC40976q.m133053a(c40975p2, new C40963e(c13821r1, 0), fMo743q0, f14, new C11161b(genericInteraction, function1, 9), interfaceC4339a);
                c28655q.m87172p0(objM133053a);
            } else {
                objM133053a = objM87133R;
                f18 = fMo733e1;
                c28655q = c28655q3;
                c40975p2 = c40975p;
            }
            InterfaceC33313a interfaceC33313a = (InterfaceC33313a) objM133053a;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
            boolean zM87157i = c28655q.m87157i(c40975p2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C40967h(c40975p2, i16);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3407d, (Function1) objM87133R2);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3486a);
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
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1092a.m3358c(m132960c0(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f25, AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t2, "CommunitySnapshotContainer"))), f176774d), c40971l.getBorderStyle(), c28655q, 0), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a).mo3471e(m132945Q(c40971l, c28655q, 0)));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C1100b c1100b = C1100b.f4583a;
            if (abstractC22403oM133005g == null) {
                c28655q.m87150e0(543037539);
                c28655q.m87173q(false);
                c1100b = c1100b;
                c28655q2 = c28655q;
                i14 = 0;
                abstractC22403o = abstractC22403oM133005g;
                c13821r2 = c13821r1;
                list2 = list;
            } else {
                c28655q.m87150e0(543037540);
                float fMo743q1 = interfaceC39171c.mo743q0(f18);
                InterfaceC39332e interfaceC39332eM132954Z = m132954Z(c40971l);
                if (interfaceC39332eM132954Z == null) {
                    c28655q.m87150e0(-510117922);
                    c28655q.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q.m87150e0(-155002749);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, interfaceC39332eM132954Z.mo134584toComposableColorWaAFU9c(c28655q, 0));
                }
                C28655q c28655q4 = c28655q;
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM133005g, null, null, c28655q4, AbstractC22403o.f87638a, 3);
                c28655q2 = c28655q4;
                boolean zM87153g2 = c28655q2.m87153g(c17919xM31989h);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    AbstractC17921y abstractC17921yM132953Y = c17919xM31989h != null ? m132953Y(c17919xM31989h.f69639a) : null;
                    c28655q2.m87172p0(abstractC17921yM132953Y);
                    objM87133R3 = abstractC17921yM132953Y;
                }
                AbstractC17921y abstractC17921y = (AbstractC17921y) objM87133R3;
                list2 = list;
                Modifier modifierM132949U2 = m132949U(AbstractC1136a.m3599a(c1100b.mo3401b(c2314t2), "CommunitySnapshotPhoto"), list2, f16);
                c13821r2 = c13821r1;
                boolean zM87147d = c28655q2.m87147d(fMo743q1) | c28655q2.m87153g(c13821r2);
                abstractC22403o = abstractC22403oM133005g;
                Object objM87133R4 = c28655q2.m87133R();
                if (zM87147d || objM87133R4 == c28676v0) {
                    objM87133R4 = new C29801b(fMo743q1, c13821r2, 2);
                    c28655q2.m87172p0(objM87133R4);
                }
                i14 = 0;
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, m132946R(modifierM132949U2, (InterfaceC4339a) objM87133R4, c28655q2, 0), null, C39102j.f168199a, 0.0f, abstractC17921y, c28655q2, 24624, 40);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3411h = AbstractC1102d.m3411h(f25, AbstractC1102d.m3409f(1.0f, c2314t2));
            if (!z4 || Float.compare(f15, i14) <= 0) {
                f19 = f25;
                c2314t = c2314t2;
                modifierM132949U = c2314t;
            } else {
                c2314t = c2314t2;
                f19 = f25;
                modifierM132949U = m132949U(AbstractC15684l.m44121e(c2314t2, f25 - f15, f25, 0.0f, 4, null), list2, f16);
            }
            Modifier modifierMo3471e = modifierM3411h.mo3471e(modifierM132949U);
            float f26 = 8;
            float f27 = 2 * f26;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(modifierMo3471e, f27, 0.0f, 2).mo3471e(genericInteraction != null ? AbstractC1129a.m3495a(c2314t, interfaceC33313a, null) : c2314t), c13821r2, 14);
            Boolean boolValueOf = Boolean.valueOf(z13);
            Float fValueOf = Float.valueOf(f17);
            float f28 = f19;
            boolean zM87155h = c28655q2.m87155h(z13) | c28655q2.m87147d(f17) | c28655q2.m87153g(interfaceC28670t2) | c28655q2.m87153g(interfaceC28670t3);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87155h || objM87133R5 == c28676v0) {
                objM87133R5 = new c(z13, f17, interfaceC28670t2, interfaceC28670t3);
                c28655q2.m87172p0(objM87133R5);
            }
            C34465k c34465k = AbstractC34452c0.f144747a;
            Modifier modifierMo3471e2 = modifierM92116f0.mo3471e(new SuspendPointerInputElement(boolValueOf, fValueOf, null, (PointerInputEventHandler) objM87133R5, 4));
            Boolean boolValueOf2 = Boolean.valueOf(z13);
            boolean zM87155h2 = c28655q2.m87155h(z13) | c28655q2.m87153g(interfaceC28670t3) | c28655q2.m87153g(interfaceC28670t2);
            Object objM87133R6 = c28655q2.m87133R();
            if (zM87155h2 || objM87133R6 == c28676v0) {
                objM87133R6 = new d(z13, interfaceC28670t3, interfaceC28670t2);
                c28655q2.m87172p0(objM87133R6);
            }
            Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierMo3471e2, boolValueOf2, (PointerInputEventHandler) objM87133R6);
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 48);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM108903b);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f18, AbstractC1136a.m3599a(c2314t, "CommunitySnapshotContentInset")));
            Modifier modifierM3413j = abstractC22403o != null ? AbstractC1102d.m3413j(c2314t, f24, 0.0f, 2) : c2314t;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 48);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3413j);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
            c28655q2.m87150e0(2028124416);
            int i17 = 0;
            for (Object obj : c40971l.m133009k()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                c28655q2.m87144b0(1465175896, c28655q2.m87124I(c40971l.getId(), Integer.valueOf(i17)));
                m132939K((InterfaceC25312u) obj, c28655q2, 0);
                c28655q2.m87173q(false);
                i17 = i18;
            }
            c28655q2.m87173q(false);
            c28655q2.m87173q(true);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(z4 ? f15 : f13 + f27, AbstractC1136a.m3599a(c2314t, "CommunitySnapshotFooterInset")));
            c28655q2.m87173q(true);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(AbstractC1136a.m3599a(c2314t, "CommunitySnapshotHeader"), C2299e.f9115x));
            Object objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C40967h(interfaceC28593a1, 2);
                c28655q2.m87172p0(objM87133R7);
            }
            Modifier modifierM3502b = AbstractC1132b.m3502b(modifierM3409f, (Function1) objM87133R7);
            if (abstractC22403o != null) {
                c28655q2.m87150e0(548717360);
                C17909s c17909s = AbstractC17911t.f69612b;
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                modifierM3357b = AbstractC1092a.m3357b(c2314t, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q2, i19).getBlack30()), new C17919x(c38072d.m121949b(c28655q2, i19).getTransparent())), 0.0f, 0.0f, 14), null, 0.0f, 6);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(548959067);
                c28655q2.m87173q(false);
                modifierM3357b = c2314t;
            }
            int i24 = 1;
            float f29 = 1 * f26;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3502b.mo3471e(modifierM3357b), f27, f29);
            boolean zM87153g3 = c28655q2.m87153g(c13821r1);
            Object objM87133R8 = c28655q2.m87133R();
            if (zM87153g3 || objM87133R8 == c28676v0) {
                objM87133R8 = new C40963e(c13821r1, i24);
                c28655q2.m87172p0(objM87133R8);
            }
            Modifier modifierM132958b0 = m132958b0(modifierM3395q, genericInteraction, c40975p, (InterfaceC4339a) objM87133R8, fMo743q0, f14, function1, interfaceC4339a);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f29), C2299e.f9110M, c28655q2, 6);
            int iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM132958b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
            if (c40971l.getProgressSegmentCount() > 0) {
                c28655q2.m87150e0(-1146964919);
                AbstractC22922c.m66645b(null, AbstractC12889b.m36284n(c40971l.getActiveSegmentIndex() + 1, 0, c40971l.getProgressSegmentCount()), c40971l.getProgressSegmentCount(), 0L, 0L, C25271y.f99162w, 0, f176772b, f176773c, c28655q2, 113442816, 89);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1146491146);
                c28655q2.m87173q(false);
            }
            c28655q2.m87150e0(1487038782);
            Iterator<T> it = c40971l.m133008j().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function1, c28655q2, 0, 6);
            }
            AbstractC25012a.m73392y(c28655q2, false, true, true);
            if (z4) {
                c28655q2.m87150e0(-106793588);
                AbstractC40972m.m133019f(c40971l.m133007i(), list, f28, f15, function1, c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-106488951);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q3.m87138X();
        }
        return C23454a0.f92919a;
    }
}
