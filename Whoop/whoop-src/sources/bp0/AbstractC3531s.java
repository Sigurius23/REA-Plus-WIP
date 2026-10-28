package bp0;

import a11.C0131i;
import a11.C0134l;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.Window;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.gestures.AbstractC1096a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import b72.C2783a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.coacheverywherecommon.models.CoachEntryData;
import com.whoop.coacheverywherecommon.models.CoachSurfaceType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.ChatEntrypointExperience;
import com.whoop.navigation.DrawerPresentation;
import cp0.AbstractC10969j0;
import cp0.AbstractC10995s;
import cp0.AbstractC11004v;
import cp0.AbstractC11009x0;
import cp0.C10978m0;
import cp0.C10998t;
import cp0.C11006w;
import cp0.EnumC10974l;
import dp0.AbstractC12249e;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep0.AbstractC13397c;
import ep0.AbstractC13405k;
import ep0.C13398d;
import ep0.C13402h;
import ep0.C13404j;
import ep0.EnumC13400f;
import ep0.EnumC13401g;
import ep0.EnumC13403i;
import ep0.InterfaceC13399e;
import j93.InterfaceC21467g;
import java.io.IOException;
import java.util.Set;
import java.util.WeakHashMap;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import oo0.AbstractC28054a;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C29656q;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p007a6.C0467z0;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p163g1.AbstractC14976c7;
import p163g1.C14949a2;
import p163g1.C14972c3;
import p163g1.EnumC14960b2;
import p163g1.EnumC15207z1;
import p163g1.InterfaceC15022g9;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p179h.C16351i;
import p180h0.C16435p;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16439p3;
import p181h2.C16617b;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p238j0.C21076b;
import p238j0.C21084j;
import p238j0.InterfaceC21082h;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
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
import p390p1.InterfaceC28690z0;
import p411q2.InterfaceC29805a;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p702ch0.AbstractC4658w0;
import p702ch0.C4656v0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22672i;
import p734sl0.C32645n0;
import p734sl0.EnumC32692x1;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vy0.AbstractC36578h0;
import vy0.AbstractC36588p;
import vy0.C36582j0;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.AbstractC38073e;
import x81.C38072d;
import yb3.AbstractC39414r;
import zo0.InterfaceC40915c;

/* JADX INFO: renamed from: bp0.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0003*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0003*\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a!\u0010&\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010'\u001a1\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0003H\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010/\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H\u0000¢\u0006\u0004\b/\u00100\u001a\u0087\u0001\u0010@\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00032\u0018\u00109\u001a\u0014\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0000072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00000:2\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000072\b\u0010=\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>H\u0001¢\u0006\u0004\b@\u0010A\u001a5\u0010E\u001a\u00020D2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020B2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>H\u0000¢\u0006\u0004\bE\u0010F\u001a\u0015\u0010H\u001a\u0004\u0018\u00010G*\u00020\u001dH\u0002¢\u0006\u0004\bH\u0010I\u001a\u0015\u0010K\u001a\u0004\u0018\u00010J*\u00020\u001dH\u0002¢\u0006\u0004\bK\u0010L\u001a)\u0010P\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u001d2\b\u0010O\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bP\u0010Q\u001a)\u0010S\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u001d2\b\u0010R\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bS\u0010T\u001a1\u0010V\u001a\u00020U2\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u00032\b\u0010O\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bV\u0010W\u001a1\u0010X\u001a\u00020U2\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bX\u0010Y\u001a\u001f\u0010[\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00032\u0006\u00102\u001a\u000201H\u0003¢\u0006\u0004\b[\u0010\\\u001a'\u0010_\u001a\u00020]2\u0006\u0010Z\u001a\u00020\u00032\u0006\u0010^\u001a\u00020]2\u0006\u00102\u001a\u000201H\u0003¢\u0006\u0004\b_\u0010`\u001a#\u0010c\u001a\u00020\u00002\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00000aH\u0003¢\u0006\u0004\bc\u0010d\u001a\u0017\u0010g\u001a\u00020\u00002\u0006\u0010f\u001a\u00020eH\u0003¢\u0006\u0004\bg\u0010h\"\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006z²\u0006\f\u0010f\u001a\u00020e8\nX\u008a\u0084\u0002²\u0006\u000e\u0010^\u001a\u00020]8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010m\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010n\u001a\u0002088\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010o\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010p\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010q\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010r\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010s\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010t\u001a\u00020]8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010v\u001a\u0004\u0018\u00010u8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010w\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010x\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\f\u0010y\u001a\u00020i8\nX\u008a\u0084\u0002"}, m65681d2 = {"Ll83/a0;", "Q", "(Landroidx/compose/runtime/Composer;I)V", "", "isFeatureEnabled", "", "conversationFingerprint", "Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;", "surfaceType", "t1", "(ZLjava/lang/String;Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;)Z", "Lep0/j;", "screenContext", "j1", "(Lep0/j;)Lep0/j;", "isNavBarSurface", "", "navClearancePx", "deepDiveMarginPx", "e1", "(ZFF)F", "Lcp0/l;", "o1", "(Lcp0/l;)Z", "n1", "settledDetent", "openRequested", "l1", "(Lcp0/l;Z)Z", "Lep0/e;", "state", "Ldp0/g;", "globalCoachManager", "q1", "(Lep0/e;Ldp0/g;)V", "Lzo0/c;", "callbacks", "engaged", "p1", "(Lzo0/c;Z)V", "previous", "current", "screenIdentifier", "wasTextCutoff", "Ldp0/e;", "k1", "(Lcp0/l;Lcp0/l;Ljava/lang/String;Z)Ldp0/e;", "m1", "(Lcp0/l;Lcp0/l;)Z", "Ly3/c;", "density", "Lep0/h;", "proactiveState", "fabAlpha", "isBottomSheetVisible", "Lkotlin/Function2;", "Lh2/b;", "onFabPositionTracked", "Lkotlin/Function0;", "onFabClicked", "onDismissPreview", "currentScreenContext", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "coachEntry", "K", "(Ly3/c;Lep0/h;FZLc93/m;Lc93/a;Lc93/m;Lep0/j;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Landroidx/compose/runtime/Composer;II)V", "Lep0/i;", "realtimeVoiceState", "Lvy0/j0;", "g1", "(Lep0/h;ZLep0/i;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lvy0/j0;", "Lep0/f;", "s1", "(Lep0/e;)Lep0/f;", "Lep0/g;", "r1", "(Lep0/e;)Lep0/g;", "isAnimationActive", "animationState", "loadStyle", "u1", "(ZLep0/e;Lep0/g;)Z", "onLoadStyle", "v1", "(ZLep0/e;Lep0/f;)Z", "Lcom/whoop/design/util/TextResource;", "c1", "(ZLep0/e;ZLep0/g;)Lcom/whoop/design/util/TextResource;", "d1", "(ZLep0/e;ZLep0/f;)Lcom/whoop/design/util/TextResource;", "isPaddingKeyboardFixEnabled", "i1", "(ZLy3/c;Landroidx/compose/runtime/Composer;I)F", "", "bridgedImeHeight", "f1", "(ZILy3/c;Landroidx/compose/runtime/Composer;I)I", "Lkotlin/Function1;", "onImeHeightChanged", "G", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lep0/d;", "globalCoachState", "P0", "(Lep0/d;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "a", "F", "FALLBACK_FAB_SIZE", "bottomSheetAnimationProgress", "trackedFabPosition", "trackedFabSize", "trackedFabHeight", "anchorFabHeight", "overlayRootHeightPx", "anchorNavAreaHeightPx", "voiceLaunchSequence", "Lcp0/w;", "voiceLaunchRequest", "drawerOpenRequested", "insightTextWasCutoff", "animatedBarBottomMargin", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3531s {

    /* JADX INFO: renamed from: a */
    private static final float f14063a = ((float) 17.5d) * 4;

    /* JADX INFO: renamed from: bp0.s$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"bp0/s$a", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f14064a;

        public a(View view) {
            this.f14064a = view;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            View view = this.f14064a;
            if (view != null) {
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                AbstractC16877h0.m47517l(view, null);
            }
        }
    }

    /* JADX INFO: renamed from: bp0.s$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$10$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {413}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC12251g f14065E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f14066F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC40915c f14067G;

        /* JADX INFO: renamed from: w */
        Object f14068w;

        /* JADX INFO: renamed from: x */
        Object f14069x;

        /* JADX INFO: renamed from: y */
        int f14070y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C10998t f14071z;

        /* JADX INFO: renamed from: bp0.s$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC40915c f14072E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f14073w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3515c f14074x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC12251g f14075y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f14076z;

            public a(C22669g0 c22669g0, C3515c c3515c, InterfaceC12251g interfaceC12251g, InterfaceC28601c1 interfaceC28601c1, InterfaceC40915c interfaceC40915c) {
                this.f14073w = c22669g0;
                this.f14074x = c3515c;
                this.f14075y = interfaceC12251g;
                this.f14076z = interfaceC28601c1;
                this.f14072E = interfaceC40915c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC10974l enumC10974l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC40915c interfaceC40915c;
                String source;
                EnumC10974l enumC10974l2 = (EnumC10974l) this.f14073w.f89336w;
                C3515c c3515c = this.f14074x;
                C13404j c13404jM37826b = ((C13398d) this.f14075y.getState().getValue()).getCurrentScreenContext();
                String str = null;
                if (c13404jM37826b != null && (source = c13404jM37826b.getSource()) != null && !AbstractC39414r.m125890i0(source)) {
                    str = source;
                }
                if (str == null) {
                    str = "";
                }
                AbstractC12249e abstractC12249eM10492k1 = AbstractC3531s.m10492k1(enumC10974l2, enumC10974l, c3515c.m10407a(enumC10974l, str), AbstractC3531s.m10503o0(this.f14076z));
                if (abstractC12249eM10492k1 != null && (interfaceC40915c = this.f14072E) != null) {
                    interfaceC40915c.mo132625n(abstractC12249eM10492k1);
                }
                this.f14073w.f89336w = enumC10974l;
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C10998t c10998t, InterfaceC12251g interfaceC12251g, InterfaceC28601c1 interfaceC28601c1, InterfaceC40915c interfaceC40915c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14071z = c10998t;
            this.f14065E = interfaceC12251g;
            this.f14066F = interfaceC28601c1;
            this.f14067G = interfaceC40915c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC10974l m10535h(C10998t c10998t) {
            return c10998t.m29392g();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f14071z, this.f14065E, this.f14066F, this.f14067G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14070y;
            if (i13 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                c22669g0M32004w.f89336w = this.f14071z.m29392g();
                C3515c c3515c = new C3515c();
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC28683x.m87240H(new C3532t(this.f14071z, 0)));
                a aVar = new a(c22669g0M32004w, c3515c, this.f14065E, this.f14066F, this.f14067G);
                this.f14068w = null;
                this.f14069x = null;
                this.f14070y = 1;
                if (interfaceC13058lM36610t.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22672i implements InterfaceC4351m {
        public c(Object obj) {
            super(2, 0, C3513a.class, obj, "onDrawerCollapsed", "onDrawerCollapsed(Ljava/lang/String;Z)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m10537a(String p13, boolean z4) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C3513a) this.receiver).m10401c(p13, z4);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m10537a((String) obj, ((Boolean) obj2).booleanValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bp0.s$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d extends C22672i implements InterfaceC4351m {
        public d(Object obj) {
            super(2, 0, C3513a.class, obj, "onDrawerExpanded", "onDrawerExpanded(Ljava/lang/String;Z)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m10538a(String p13, boolean z4) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C3513a) this.receiver).m10403e(p13, z4);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m10538a((String) obj, ((Boolean) obj2).booleanValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bp0.s$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$17$1$3$1$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {588}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC12251g f14077E;

        /* JADX INFO: renamed from: w */
        int f14078w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10998t f14079x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f14080y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13404j f14081z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C10998t c10998t, boolean z4, C13404j c13404j, InterfaceC12251g interfaceC12251g, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14079x = c10998t;
            this.f14080y = z4;
            this.f14081z = c13404j;
            this.f14077E = interfaceC12251g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m10540h(InterfaceC12251g interfaceC12251g) {
            InterfaceC12251g.m34132f(interfaceC12251g, 0L, null, null, 7, null);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f14079x, this.f14080y, this.f14081z, this.f14077E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14078w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10998t c10998t = this.f14079x;
                boolean z4 = this.f14080y;
                C13404j c13404j = this.f14081z;
                DrawerPresentation drawerPresentation = c13404j != null ? c13404j.getDrawerPresentation() : null;
                C3532t c3532t = new C3532t(this.f14077E, 1);
                this.f14078w = 1;
                if (c10998t.m29393h(z4, drawerPresentation, c3532t, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class f extends C22672i implements InterfaceC4339a {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC12251g f14082E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f14083F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28593a1 f14084G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f14085H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C10998t f14086I;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C13404j f14087w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f14088x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4656v0 f14089y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2994c0 f14090z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C13404j c13404j, boolean z4, C4656v0 c4656v0, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, InterfaceC28601c1 interfaceC28601c1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c2, C10998t c10998t) {
            super(0, AbstractC22674j.class, "openQuickVoice", "GlobalCoachOverlay$openQuickVoice(Lcom/whoop/coacheverywherecommon/models/ScreenContextMetadata;ZLcom/whoop/ai/chat/view/AiChatWrapperScreenCoordinator;Lkotlinx/coroutines/CoroutineScope;Lcom/whoop/coacheverywherecommon/GlobalCoachManager;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lcom/whoop/coacheverywhere/view/composables/CoachDrawerState;)V", 0);
            this.f14087w = c13404j;
            this.f14088x = z4;
            this.f14089y = c4656v0;
            this.f14090z = interfaceC2994c0;
            this.f14082E = interfaceC12251g;
            this.f14083F = interfaceC28601c1;
            this.f14084G = interfaceC28593a1;
            this.f14085H = interfaceC28601c2;
            this.f14086I = c10998t;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134045invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134045invoke() {
            AbstractC3531s.m10437O0(this.f14087w, this.f14088x, this.f14089y, this.f14090z, this.f14082E, this.f14083F, this.f14084G, this.f14085H, this.f14086I);
        }
    }

    /* JADX INFO: renamed from: bp0.s$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class g extends C22672i implements InterfaceC4351m {
        public g(Object obj) {
            super(2, 0, C3513a.class, obj, "onDismissPreview", "onDismissPreview(Ljava/lang/String;Ljava/lang/String;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m10541a(String p13, String p14) {
            AbstractC22676k.m65750j(p13, "p0");
            AbstractC22676k.m65750j(p14, "p1");
            ((C3513a) this.receiver).m10400b(p13, p14);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m10541a((String) obj, (String) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bp0.s$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$20$1$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14091w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC12251g f14092x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC12251g interfaceC12251g, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14092x = interfaceC12251g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f14092x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14091w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC12251g.m34132f(this.f14092x, 0L, null, null, 6, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bp0.s$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$21$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14093w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC40915c f14094x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f14095y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC40915c interfaceC40915c, boolean z4, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14094x = interfaceC40915c;
            this.f14095y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f14094x, this.f14095y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14093w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3531s.m10507p1(this.f14094x, this.f14095y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bp0.s$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$22$1$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {677}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14096w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10998t f14097x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f14098y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C10998t c10998t, boolean z4, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14097x = c10998t;
            this.f14098y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f14097x, this.f14098y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14096w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10998t c10998t = this.f14097x;
                boolean z4 = this.f14098y;
                this.f14096w = 1;
                if (C10998t.m29385r(c10998t, z4, false, this, 2, null) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$23$1$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {682}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14099w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10998t f14100x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f14101y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C10998t c10998t, boolean z4, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14100x = c10998t;
            this.f14101y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f14100x, this.f14101y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14099w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10998t c10998t = this.f14100x;
                boolean z4 = this.f14101y;
                this.f14099w = 1;
                if (c10998t.m29386a(z4, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$l */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$24$1$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {686}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14102w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10998t f14103x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C10998t c10998t, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14103x = c10998t;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new l(this.f14103x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14102w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10998t c10998t = this.f14103x;
                this.f14102w = 1;
                if (c10998t.m29399t(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$m */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class m extends C22672i implements InterfaceC4339a {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC12251g f14104E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f14105F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28593a1 f14106G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f14107H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C10998t f14108I;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C13404j f14109w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f14110x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4656v0 f14111y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2994c0 f14112z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C13404j c13404j, boolean z4, C4656v0 c4656v0, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, InterfaceC28601c1 interfaceC28601c1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c2, C10998t c10998t) {
            super(0, AbstractC22674j.class, "openQuickVoice", "GlobalCoachOverlay$openQuickVoice(Lcom/whoop/coacheverywherecommon/models/ScreenContextMetadata;ZLcom/whoop/ai/chat/view/AiChatWrapperScreenCoordinator;Lkotlinx/coroutines/CoroutineScope;Lcom/whoop/coacheverywherecommon/GlobalCoachManager;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Lcom/whoop/coacheverywhere/view/composables/CoachDrawerState;)V", 0);
            this.f14109w = c13404j;
            this.f14110x = z4;
            this.f14111y = c4656v0;
            this.f14112z = interfaceC2994c0;
            this.f14104E = interfaceC12251g;
            this.f14105F = interfaceC28601c1;
            this.f14106G = interfaceC28593a1;
            this.f14107H = interfaceC28601c2;
            this.f14108I = c10998t;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134046invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134046invoke() {
            AbstractC3531s.m10437O0(this.f14109w, this.f14110x, this.f14111y, this.f14112z, this.f14104E, this.f14105F, this.f14106G, this.f14107H, this.f14108I);
        }
    }

    /* JADX INFO: renamed from: bp0.s$n */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$3$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {281}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14113w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC21083i f14114x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC15237i f14115y;

        /* JADX INFO: renamed from: bp0.s$n$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC15237i f14116w;

            public a(InterfaceC15237i interfaceC15237i) {
                this.f14116w = interfaceC15237i;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC21082h interfaceC21082h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (interfaceC21082h instanceof C21076b) {
                    ((C15240l) this.f14116w).m43339b(false);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC21083i interfaceC21083i, InterfaceC15237i interfaceC15237i, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14114x = interfaceC21083i;
            this.f14115y = interfaceC15237i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new n(this.f14114x, this.f14115y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14113w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return C23454a0.f92919a;
            }
            AbstractC34132o.m107864I(obj);
            C13096w1 c13096w1 = ((C21084j) this.f14114x).f79947a;
            a aVar = new a(this.f14115y);
            this.f14113w = 1;
            c13096w1.collect(aVar, this);
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: bp0.s$o */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$4$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {309}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28690z0 f14117E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28690z0 f14118F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28690z0 f14119G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28690z0 f14120H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f14121I;

        /* JADX INFO: renamed from: w */
        int f14122w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10998t f14123x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f14124y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f14125z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C10998t c10998t, boolean z4, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC28690z0 interfaceC28690z2, InterfaceC28690z0 interfaceC28690z3, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14123x = c10998t;
            this.f14124y = z4;
            this.f14125z = interfaceC28601c1;
            this.f14117E = interfaceC28690z0;
            this.f14118F = interfaceC28690z1;
            this.f14119G = interfaceC28690z2;
            this.f14120H = interfaceC28690z3;
            this.f14121I = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new o(this.f14123x, this.f14124y, this.f14125z, this.f14117E, this.f14118F, this.f14119G, this.f14120H, this.f14121I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14122w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC3531s.m10450V(this.f14125z, 9205357640488583168L);
                AbstractC3531s.m10454X(this.f14117E, 0.0f);
                AbstractC3531s.m10458Z(this.f14118F, 0.0f);
                AbstractC3531s.m10467c0(this.f14119G, 0.0f);
                AbstractC3531s.m10479g0(this.f14120H, 0.0f);
                AbstractC3531s.m10506p0(this.f14121I, false);
                this.f14123x.m29395n();
                C10998t c10998t = this.f14123x;
                boolean z4 = this.f14124y;
                this.f14122w = 1;
                if (c10998t.m29397q(z4, false, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$p */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$5$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {315}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14126w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Configuration f14127x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C10998t f14128y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f14129z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Configuration configuration, C10998t c10998t, boolean z4, InterfaceC30057d<? super p> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14127x = configuration;
            this.f14128y = c10998t;
            this.f14129z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new p(this.f14127x, this.f14128y, this.f14129z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14126w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f14127x.orientation == 2) {
                    C10998t c10998t = this.f14128y;
                    boolean z4 = this.f14129z;
                    this.f14126w = 1;
                    if (c10998t.m29397q(z4, false, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$q */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$6$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {323}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14130w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10998t f14131x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f14132y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(C10998t c10998t, boolean z4, InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14131x = c10998t;
            this.f14132y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new q(this.f14131x, this.f14132y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14130w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f14131x.m29392g().isDrawerDetent()) {
                    C10998t c10998t = this.f14131x;
                    boolean z4 = this.f14132y;
                    this.f14130w = 1;
                    if (C10998t.m29385r(c10998t, z4, false, this, 2, null) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$r */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$7$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {334}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC40915c f14133E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC12251g f14134F;

        /* JADX INFO: renamed from: w */
        Object f14135w;

        /* JADX INFO: renamed from: x */
        int f14136x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C10998t f14137y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f14138z;

        /* JADX INFO: renamed from: bp0.s$r$a */
        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC12251g f14139E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ boolean f14140w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22669g0 f14141x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC40915c f14142y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C10998t f14143z;

            public a(boolean z4, C22669g0 c22669g0, InterfaceC40915c interfaceC40915c, C10998t c10998t, InterfaceC12251g interfaceC12251g) {
                this.f14140w = z4;
                this.f14141x = c22669g0;
                this.f14142y = interfaceC40915c;
                this.f14143z = c10998t;
                this.f14139E = interfaceC12251g;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC10974l enumC10974l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (enumC10974l == EnumC10974l.Bar && !this.f14140w) {
                    if (AbstractC3531s.m10498m1((EnumC10974l) this.f14141x.f89336w, enumC10974l)) {
                        InterfaceC40915c interfaceC40915c = this.f14142y;
                        if (interfaceC40915c != null) {
                            interfaceC40915c.mo132623j();
                        }
                        this.f14143z.m29396o();
                    }
                    this.f14139E.mo34140m();
                }
                this.f14141x.f89336w = enumC10974l;
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(C10998t c10998t, boolean z4, InterfaceC40915c interfaceC40915c, InterfaceC12251g interfaceC12251g, InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14137y = c10998t;
            this.f14138z = z4;
            this.f14133E = interfaceC40915c;
            this.f14134F = interfaceC12251g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC10974l m10544h(C10998t c10998t) {
            return c10998t.m29392g();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new r(this.f14137y, this.f14138z, this.f14133E, this.f14134F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14136x;
            if (i13 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                c22669g0M32004w.f89336w = this.f14137y.m29392g();
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC28683x.m87240H(new C3533u(this.f14137y, 0)));
                a aVar = new a(this.f14138z, c22669g0M32004w, this.f14133E, this.f14137y, this.f14134F);
                this.f14135w = null;
                this.f14136x = 1;
                if (interfaceC13058lM36610t.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$s */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$8$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {350}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14144w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10998t f14145x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f14146y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f14147z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(C10998t c10998t, boolean z4, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14145x = c10998t;
            this.f14146y = z4;
            this.f14147z = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new s(this.f14145x, this.f14146y, this.f14147z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14144w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC3531s.m10444S(this.f14147z).getIsBottomSheetVisible()) {
                    C10998t c10998t = this.f14145x;
                    boolean z4 = this.f14146y;
                    this.f14144w = 1;
                    if (c10998t.m29397q(z4, false, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$t */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$9$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14148w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f14149x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f14150y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(boolean z4, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super t> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14149x = z4;
            this.f14150y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new t(this.f14149x, this.f14150y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((t) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14148w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f14149x) {
                AbstractC3531s.m10500n0(this.f14150y, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bp0.s$u */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class u extends C22656a implements InterfaceC4339a {
        public u(Object obj) {
            super(0, 0, InterfaceC15237i.class, obj, "clearFocus", "clearFocus(Z)V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134047invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134047invoke() {
            ((C15240l) ((InterfaceC15237i) this.receiver)).m43339b(false);
        }
    }

    /* JADX INFO: renamed from: bp0.s$v */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"bp0/s$v", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12251g f14151a;

        public v(InterfaceC12251g interfaceC12251g) {
            this.f14151a = interfaceC12251g;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f14151a.mo34144s();
        }
    }

    /* JADX INFO: renamed from: bp0.s$w */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$openQuickVoice$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14152w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC12251g f14153x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13404j f14154y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(InterfaceC12251g interfaceC12251g, C13404j c13404j, InterfaceC30057d<? super w> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14153x = interfaceC12251g;
            this.f14154y = c13404j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new w(this.f14153x, this.f14154y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((w) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14152w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC12251g.m34132f(this.f14153x, 0L, null, this.f14154y, 3, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bp0.s$x */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$GlobalCoachOverlay$openQuickVoice$2", m100430f = "GlobalCoachOverlay.kt", m100431l = {267}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14155w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10998t f14156x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13404j f14157y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(C10998t c10998t, C13404j c13404j, InterfaceC30057d<? super x> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14156x = c10998t;
            this.f14157y = c13404j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new x(this.f14156x, this.f14157y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((x) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14155w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10998t c10998t = this.f14156x;
                DrawerPresentation drawerPresentation = this.f14157y.getDrawerPresentation();
                this.f14155w = 1;
                if (c10998t.m29398s(drawerPresentation, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bp0.s$y */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.GlobalCoachOverlayKt$HandleOrientationChanges$1$1", m100430f = "GlobalCoachOverlay.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class y extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14158w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Configuration f14159x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13398d f14160y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC12251g f14161z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Configuration configuration, C13398d c13398d, InterfaceC12251g interfaceC12251g, InterfaceC30057d<? super y> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14159x = configuration;
            this.f14160y = c13398d;
            this.f14161z = interfaceC12251g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new y(this.f14159x, this.f14160y, this.f14161z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((y) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14158w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f14159x.orientation == 2 && this.f14160y.getIsBottomSheetVisible()) {
                this.f14161z.mo34135c();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bp0.s$z */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class z {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14162a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f14163b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f14164c;

        static {
            int[] iArr = new int[EnumC14960b2.values().length];
            try {
                EnumC14960b2 enumC14960b2 = EnumC14960b2.f55823w;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC14960b2 enumC14960b3 = EnumC14960b2.f55823w;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14162a = iArr;
            int[] iArr2 = new int[EnumC13403i.values().length];
            try {
                iArr2[EnumC13403i.Connecting.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC13403i.Listening.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC13403i.Speaking.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC13403i.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f14163b = iArr2;
            int[] iArr3 = new int[EnumC13401g.values().length];
            try {
                iArr3[EnumC13401g.BORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EnumC13401g.ANALYZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EnumC13401g.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f14164c = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m10409A0(C16351i c16351i) {
        c16351i.mo4052a("android.permission.RECORD_AUDIO", null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m10411B0(InterfaceC12251g interfaceC12251g, InterfaceC28670t2 interfaceC28670t2) {
        if (m10444S(interfaceC28670t2).getRealtimeVoiceState() != EnumC13403i.Inactive) {
            interfaceC12251g.mo34144s();
        } else {
            interfaceC12251g.mo34148x();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m10413C0(InterfaceC40915c interfaceC40915c, InterfaceC12251g interfaceC12251g) {
        if (interfaceC40915c != null) {
            interfaceC40915c.mo132623j();
        }
        interfaceC12251g.mo34140m();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m10415D0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, C16617b c16617b, float f13) {
        m10450V(interfaceC28601c1, c16617b.f63937a);
        m10454X(interfaceC28690z0, f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m10417E0(InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new h(interfaceC12251g, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m10419F0(InterfaceC2994c0 interfaceC2994c0, C10998t c10998t, boolean z4) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new j(c10998t, z4, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final void m10420G(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1942486194);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Object objM87161k = c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Activity activity = objM87161k instanceof Activity ? (Activity) objM87161k : null;
            boolean zM87157i = c28655q.m87157i(activity) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C3526n(0, activity, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(activity, (Function1) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m10421G0(InterfaceC2994c0 interfaceC2994c0, C10998t c10998t, boolean z4) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new k(c10998t, z4, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final InterfaceC28620h0 m10422H(Activity activity, final Function1 function1, C28624i0 DisposableEffect) {
        Window window;
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        InterfaceC16915u interfaceC16915u = new InterfaceC16915u() { // from class: bp0.p
            @Override // p184h5.InterfaceC16915u
            /* JADX INFO: renamed from: o */
            public final C16905q1 mo1682o(View view, C16905q1 c16905q1) {
                return AbstractC3531s.m10424I(function1, view, c16905q1);
            }
        };
        if (decorView != null) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16877h0.m47517l(decorView, interfaceC16915u);
        }
        return new a(decorView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m10423H0(InterfaceC2994c0 interfaceC2994c0, C10998t c10998t) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new l(c10998t, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C16905q1 m10424I(Function1 function1, View view, C16905q1 insets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(insets, "insets");
        C35643b c35643bMo47530g = insets.f64864a.mo47530g(8);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        function1.invoke(Integer.valueOf(c35643bMo47530g.f151452d));
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m10425I0(InterfaceC28601c1 interfaceC28601c1, int i13) {
        C11006w c11006wM10488j0 = m10488j0(interfaceC28601c1);
        if (c11006wM10488j0 != null && c11006wM10488j0.getId() == i13) {
            m10491k0(interfaceC28601c1, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m10426J(Function1 function1, int i13, Composer composer, int i14) {
        m10420G(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m10427J0(C16351i c16351i) {
        c16351i.mo4052a("android.permission.RECORD_AUDIO", null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    public static final void m10428K(InterfaceC39171c density, C13402h proactiveState, float f13, boolean z4, final InterfaceC4351m onFabPositionTracked, InterfaceC4339a onFabClicked, InterfaceC4351m onDismissPreview, C13404j c13404j, CoachEntry coachEntry, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        C28655q c28655q;
        CoachEntry coachEntry2;
        int i16;
        C23465k c23465k;
        Integer num;
        boolean z13;
        Modifier modifierM3425v;
        CoachEntryData data;
        C2307m c2307m = C2299e.f9106I;
        AbstractC22676k.m65750j(density, "density");
        AbstractC22676k.m65750j(proactiveState, "proactiveState");
        AbstractC22676k.m65750j(onFabPositionTracked, "onFabPositionTracked");
        AbstractC22676k.m65750j(onFabClicked, "onFabClicked");
        AbstractC22676k.m65750j(onDismissPreview, "onDismissPreview");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(458146482);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(density) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(proactiveState) : c28655q2.m87157i(proactiveState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(onFabPositionTracked) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87157i(onFabClicked) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q2.m87157i(onDismissPreview) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= (16777216 & i13) == 0 ? c28655q2.m87153g(c13404j) : c28655q2.m87157i(c13404j) ? 8388608 : 4194304;
        }
        int i17 = i14 & 256;
        int i18 = 100663296;
        if (i17 != 0) {
            i15 |= i18;
        } else if ((i13 & 100663296) == 0) {
            i18 = (i13 & 134217728) == 0 ? c28655q2.m87153g(coachEntry) : c28655q2.m87157i(coachEntry) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            i15 |= i18;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 38347923) != 38347922)) {
            CoachEntry coachEntry3 = i17 != 0 ? null : coachEntry;
            boolean zM87155h = c28655q2.m87155h(proactiveState.getIsPrefetchEnabled()) | c28655q2.m87153g(proactiveState.getProactiveAnimationState()) | ((i15 & 7168) == 2048) | ((234881024 & i15) == 67108864 || ((i15 & 134217728) != 0 && c28655q2.m87153g(coachEntry3)));
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87155h || objM87133R == c28676v0) {
                i16 = i15;
                objM87133R = m10483h1(proactiveState, z4, null, coachEntry3, 4, null);
                c28655q2.m87172p0(objM87133R);
            } else {
                i16 = i15;
            }
            C36582j0 c36582j0 = (C36582j0) objM87133R;
            boolean z14 = AbstractC8693b.m21270d(c36582j0.getLoadingDisplayText()) || AbstractC8693b.m21270d(c36582j0.getPreviewDisplayText());
            boolean z15 = (c13404j != null ? c13404j.getFingerprint() : null) != null;
            InterfaceC29805a interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
            InterfaceC13399e interfaceC13399eM37842a = proactiveState.getProactiveAnimationState();
            if (interfaceC13399eM37842a instanceof InterfaceC13399e.a) {
                InterfaceC13399e.a aVar = (InterfaceC13399e.a) interfaceC13399eM37842a;
                String strM37834c = aVar.getConversationUuid();
                if (strM37834c == null) {
                    strM37834c = c13404j != null ? c13404j.getConversationSeedId() : null;
                    if (strM37834c == null) {
                        strM37834c = c13404j != null ? c13404j.getFingerprint() : null;
                    }
                }
                c23465k = new C23465k(aVar.getMessageId(), strM37834c);
            } else {
                c23465k = new C23465k(null, null);
            }
            Object obj = c23465k.f92937w;
            boolean z16 = (z14 == 0 || !AbstractC8693b.m21270d(c36582j0.getPreviewDisplayText()) || !z15 || obj == null || c23465k.f92938x == null) ? false : true;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            CoachEntry coachEntry4 = coachEntry3;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            C1100b c1100b = C1100b.f4583a;
            if (z14 != 0) {
                c28655q2.m87150e0(-135042307);
                float f14 = 8;
                float f15 = 4 * f14;
                float f16 = 1 * f14;
                num = null;
                AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(AbstractC1099a.m3392n(AbstractC22953f.m66722k(AbstractC1102d.m3411h(density.mo734f0(density.mo743q0(180)), AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, C2299e.f9104G)))), 0.0f, f15 + f16, 1), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack50())), 0.0f, 0.0f, 14), null, 0.0f, 6), "CoachFabScrim"), c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                num = null;
                c28655q2.m87150e0(-134218730);
                c28655q2.m87173q(false);
            }
            float f17 = 8;
            float f18 = ((float) 1.5d) * f17;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66722k(c2314t), 0.0f, 0.0f, f18, 1 * f17, 3);
            if (z14) {
                c28655q2.m87150e0(-133911489);
                z13 = true;
                modifierM3425v = AbstractC1102d.m3425v(AbstractC1102d.m3411h(f14063a, c2314t), 0.0f, ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp - (f18 * 2), 1);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-133996274);
                c28655q2.m87173q(false);
                modifierM3425v = AbstractC1102d.m3419p(f14063a, c2314t);
                z13 = true;
            }
            Modifier modifierMo3471e = modifierM3398t.mo3471e(modifierM3425v);
            int i19 = i16;
            boolean z17 = (i19 & 57344) == 16384 ? z13 : false;
            Object objM87133R2 = c28655q2.m87133R();
            if (z17 || objM87133R2 == c28676v0) {
                objM87133R2 = new Function1() { // from class: bp0.k
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AbstractC3531s.m10430L(onFabPositionTracked, (InterfaceC39147y) obj2);
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierMo3471e, (Function1) objM87133R2);
            if (z16) {
                c28655q2.m87150e0(-133279306);
                c28655q2.m87144b0(549893303, obj);
                boolean z18 = z13;
                Modifier modifierMo3400a = c1100b.mo3400a(c2314t, c2307m);
                boolean zM87157i = c28655q2.m87157i(interfaceC29805a) | c28655q2.m87153g(c23465k) | ((3670016 & i19) == 1048576 ? z18 : false);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C29656q(interfaceC29805a, c23465k, onDismissPreview, 12);
                    c28655q2.m87172p0(objM87133R3);
                }
                C14949a2 c14949a2M43097b = AbstractC14976c7.m43097b((Function1) objM87133R3, c28655q2);
                Set setM74059b1 = AbstractC25260n.m74059b1(new EnumC15207z1[]{EnumC15207z1.f57097x, EnumC15207z1.f57096w});
                Object objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C2783a(27);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC14976c7.m43096a(c14949a2M43097b, modifierMo3400a, setM74059b1, (Function1) objM87133R4, C3514b.f14000a.m10406b(), AbstractC37817c.m121344e(-144985802, c28655q2, new C3524l(modifierM3500d, c36582j0, f13, coachEntry4, onFabClicked, 0)), c28655q2, 224640, 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                z13 = z18;
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-131262756);
                AbstractC36578h0.m117329G(c1100b.mo3400a(c2314t, c2307m).mo3471e(modifierM3500d), c36582j0, f13, (coachEntry4 == null || (data = coachEntry4.getData()) == null) ? num : data.getMaxLines(), onFabClicked, c28655q, (C36582j0.f156694i << 3) | (i19 & 896) | ((i19 >> 3) & 57344), 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            coachEntry2 = coachEntry4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            coachEntry2 = coachEntry;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3525m(density, proactiveState, f13, z4, onFabPositionTracked, onFabClicked, onDismissPreview, c13404j, coachEntry2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m10429K0(C4656v0 c4656v0) {
        C4656v0.m14670q(c4656v0, null, 1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m10430L(InterfaceC4351m interfaceC4351m, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        interfaceC4351m.invoke(new C16617b(coordinates.mo3523Z(0L)), Float.valueOf((int) (coordinates.mo3541n() >> 32)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m10431L0(InterfaceC13399e interfaceC13399e, InterfaceC12251g interfaceC12251g) {
        m10510q1(interfaceC13399e, interfaceC12251g);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final boolean m10432M(InterfaceC29805a interfaceC29805a, C23465k c23465k, InterfaceC4351m interfaceC4351m, EnumC14960b2 dismissValue) {
        AbstractC22676k.m65750j(dismissValue, "dismissValue");
        int iOrdinal = dismissValue.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2) {
            return false;
        }
        interfaceC29805a.mo7428a(0);
        String str = (String) c23465k.f92937w;
        String str2 = (String) c23465k.f92938x;
        if (str != null && str2 != null) {
            interfaceC4351m.invoke(str2, str);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m10433M0(int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m10440Q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final InterfaceC15022g9 m10434N(EnumC15207z1 direction) {
        AbstractC22676k.m65750j(direction, "direction");
        return new C14972c3(0.85f);
    }

    /* JADX INFO: renamed from: N0 */
    private static final float m10435N0(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m10436O(Modifier modifier, C36582j0 c36582j0, float f13, CoachEntry coachEntry, InterfaceC4339a interfaceC4339a, InterfaceC22997s1 SwipeToDismiss, Composer composer, int i13) throws XmlPullParserException, IOException {
        CoachEntryData data;
        AbstractC22676k.m65750j(SwipeToDismiss, "$this$SwipeToDismiss");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC36578h0.m117329G(modifier, c36582j0, f13, (coachEntry == null || (data = coachEntry.getData()) == null) ? null : data.getMaxLines(), interfaceC4339a, c28655q, C36582j0.f156694i << 3, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m10437O0(C13404j c13404j, boolean z4, C4656v0 c4656v0, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, InterfaceC28601c1 interfaceC28601c1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28601c1 interfaceC28601c2, C10998t c10998t) {
        C13404j c13404jM10489j1 = m10489j1(c13404j);
        if (c13404jM10489j1 == null) {
            return;
        }
        if (!z4 || c4656v0 == null) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new w(interfaceC12251g, c13404jM10489j1, null), 3);
            return;
        }
        C32645n0 c32645n0M29172f1 = AbstractC10969j0.m29172f1(c13404jM10489j1);
        m10500n0(interfaceC28601c1, true);
        m10485i0(interfaceC28593a1, m10482h0(interfaceC28593a1) + 1);
        m10491k0(interfaceC28601c2, new C11006w(m10482h0(interfaceC28593a1), EnumC32692x1.INSTANCE.m102585a(c32645n0M29172f1.getEntrypointExperience())));
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new x(c10998t, c13404jM10489j1, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m10438P(InterfaceC39171c interfaceC39171c, C13402h c13402h, float f13, boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m2, C13404j c13404j, CoachEntry coachEntry, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m10428K(interfaceC39171c, c13402h, f13, z4, interfaceC4351m, interfaceC4339a, interfaceC4351m2, c13404j, coachEntry, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P0 */
    private static final void m10439P0(C13398d c13398d, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(92594135);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c13398d) : c28655q.m87157i(c13398d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
            InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
            Integer numValueOf = Integer.valueOf(configuration.orientation);
            boolean zM87157i = c28655q.m87157i(configuration);
            if ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c13398d))) {
                z4 = true;
            }
            boolean zM87157i2 = zM87157i | z4 | c28655q.m87157i(interfaceC12251g);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i2 || objM87133R == C28635l.f115821a) {
                objM87133R = new y(configuration, c13398d, interfaceC12251g, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, numValueOf);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(c13398d, i13, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0218  */
    /* JADX WARN: Code duplicated, block: B:106:0x021d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0243  */
    /* JADX WARN: Code duplicated, block: B:118:0x0246  */
    /* JADX WARN: Code duplicated, block: B:119:0x024b  */
    /* JADX WARN: Code duplicated, block: B:123:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x025d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0262  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:135:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:154:0x0301  */
    /* JADX WARN: Code duplicated, block: B:157:0x0339  */
    /* JADX WARN: Code duplicated, block: B:158:0x033e  */
    /* JADX WARN: Code duplicated, block: B:162:0x034c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0355  */
    /* JADX WARN: Code duplicated, block: B:166:0x035a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0368  */
    /* JADX WARN: Code duplicated, block: B:173:0x0377  */
    /* JADX WARN: Code duplicated, block: B:176:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:182:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:189:0x0403  */
    /* JADX WARN: Code duplicated, block: B:192:0x0412  */
    /* JADX WARN: Code duplicated, block: B:193:0x0417  */
    /* JADX WARN: Code duplicated, block: B:199:0x0435  */
    /* JADX WARN: Code duplicated, block: B:203:0x0470  */
    /* JADX WARN: Code duplicated, block: B:209:0x0496  */
    /* JADX WARN: Code duplicated, block: B:215:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:219:0x050b  */
    /* JADX WARN: Code duplicated, block: B:222:0x052c  */
    /* JADX WARN: Code duplicated, block: B:224:0x053c  */
    /* JADX WARN: Code duplicated, block: B:227:0x0563  */
    /* JADX WARN: Code duplicated, block: B:228:0x056a  */
    /* JADX WARN: Code duplicated, block: B:231:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:234:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:235:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:237:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:243:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:250:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:256:0x0609  */
    /* JADX WARN: Code duplicated, block: B:262:0x0634  */
    /* JADX WARN: Code duplicated, block: B:265:0x0655  */
    /* JADX WARN: Code duplicated, block: B:268:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:272:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:278:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:281:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:282:0x070a  */
    /* JADX WARN: Code duplicated, block: B:288:0x071f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0783  */
    /* JADX WARN: Code duplicated, block: B:430:0x0d70  */
    /* JADX WARN: Code duplicated, block: B:434:0x0db0  */
    /* JADX WARN: Code duplicated, block: B:477:0x0f58  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX INFO: renamed from: Q */
    public static final void m10440Q(Composer composer, int i13) throws XmlPullParserException, IOException {
        float f13;
        boolean z4;
        String fingerprint;
        boolean z13;
        boolean z14;
        String fingerprint2;
        boolean z15;
        String strM37869a;
        boolean zM87153g;
        Object objM87133R;
        C4656v0 c4656v0;
        float fMo743q0;
        float f14;
        float fMo743q1;
        float fM10456Y;
        float fM10464b0;
        float fM10476f0;
        float fM29496j1;
        float f15;
        float f16;
        float f17;
        C10998t c10998tM29406c;
        String strM37869a2;
        boolean zM87153g2;
        Object objM87133R2;
        String strM37869a3;
        boolean zM87153g3;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c1;
        final float fM29391f;
        InterfaceC15237i interfaceC15237i;
        Object objM87133R5;
        InterfaceC21083i interfaceC21083i;
        boolean zM87157i;
        Object objM87133R6;
        InterfaceC16439p3 interfaceC16439p3;
        boolean zM87157i2;
        Object objM87133R7;
        Object objM87133R8;
        InterfaceC28601c1 interfaceC28601c2;
        String strM37869a4;
        boolean zM87153g4;
        Object objM87133R9;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28690z0 interfaceC28690z0;
        InterfaceC28690z0 interfaceC28690z1;
        InterfaceC28690z0 interfaceC28690z2;
        InterfaceC28690z0 interfaceC28690z3;
        boolean zM87157i3;
        Object objM87133R10;
        boolean zM87153g5;
        Object objM87133R11;
        Object obj;
        boolean zM87153g6;
        Object rVar;
        C10998t c10998t;
        boolean zM87153g7;
        Object objM87133R12;
        float f18;
        float fM10486i1;
        int iM10477f1;
        InterfaceC28601c1 interfaceC28601c4;
        long jFloatToRawIntBits;
        float f19;
        String strM37838g;
        Integer maxLines;
        boolean z16;
        boolean zM10495l1;
        boolean zM87155h;
        Object objM87133R13;
        Object obj2;
        boolean zM87153g8;
        Object bVar;
        InterfaceC12251g interfaceC12251g;
        InterfaceC28601c1 interfaceC28601c5;
        C13404j c13404jM37826b;
        final InterfaceC28601c1 interfaceC28601c6;
        C10998t c10998t2;
        InterfaceC40915c interfaceC40915c;
        C4656v0 c4656v1;
        C3513a c3513a;
        C13404j c13404j;
        ?? r10;
        boolean z17;
        boolean z18;
        InterfaceC40915c interfaceC40915c2;
        C4656v0 c4656v2;
        C13404j c13404j2;
        boolean z19;
        final InterfaceC2994c0 interfaceC2994c0;
        C16351i c16351i;
        boolean z24;
        InterfaceC12251g interfaceC12251g2;
        InterfaceC28593a1 interfaceC28593a1;
        InterfaceC28601c1 interfaceC28601c7;
        float f24;
        Object obj3;
        char c3;
        C10998t c10998t3;
        InterfaceC40915c interfaceC40915c3;
        boolean z25;
        boolean zM87157i4;
        Object objM87133R14;
        C4656v0 c4656v3;
        Object mVar;
        C4656v0 c4656v4;
        String strM92103Y;
        int i14;
        float f25;
        float f26;
        float fM36283m;
        float fM10524v0;
        final InterfaceC28690z0 interfaceC28690z4;
        char c7;
        InterfaceC28601c1 interfaceC28601c8;
        int i15;
        Object obj4;
        final InterfaceC2994c0 interfaceC2994c1;
        C4656v0 c4656v5;
        InterfaceC12251g interfaceC12251g3;
        boolean z26;
        C10998t c10998t4;
        Object fVar;
        InterfaceC28593a1 interfaceC28593a2;
        InterfaceC28601c1 interfaceC28601c9;
        C10998t c10998t5;
        C13404j c13404j3;
        InterfaceC12251g interfaceC12251g4;
        Boolean showMic;
        boolean zM87157i5;
        Object objM87133R15;
        boolean zM87157i6;
        Object objM87133R16;
        boolean zM87157i7;
        Object objM87133R17;
        Object objM87133R18;
        boolean zM87157i8;
        Object objM87133R19;
        CoachEntryData data;
        CoachEntryData data2;
        Boolean useVoice;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1597248945);
        final int i16 = 1;
        final int i17 = 0;
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            final InterfaceC12251g interfaceC12251g5 = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
            InterfaceC40915c interfaceC40915c4 = interfaceC12251g5 instanceof InterfaceC40915c ? (InterfaceC40915c) interfaceC12251g5 : null;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            Configuration configuration = (Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            Object objM87133R20 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R20 == c28676v0) {
                objM87133R20 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R20);
            }
            InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) objM87133R20;
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
            boolean zM87157i9 = c28655q.m87157i(interfaceC12251g5);
            Object objM87133R21 = c28655q.m87133R();
            if (zM87157i9 || objM87133R21 == c28676v0) {
                objM87133R21 = new Function1() { // from class: bp0.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i17) {
                            case 0:
                                return AbstractC3531s.m10442R(interfaceC12251g5, ((Boolean) obj5).booleanValue());
                            default:
                                return AbstractC3531s.m10461a0(interfaceC12251g5, (C28624i0) obj5);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R21);
            }
            final C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission, (Function1) objM87133R21, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(interfaceC12251g5.getState(), c28655q, 0);
            boolean zM87157i10 = c28655q.m87157i(interfaceC12251g5);
            Object objM87133R22 = c28655q.m87133R();
            if (zM87157i10 || objM87133R22 == c28676v0) {
                objM87133R22 = new Function1() { // from class: bp0.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i16) {
                            case 0:
                                return AbstractC3531s.m10442R(interfaceC12251g5, ((Boolean) obj5).booleanValue());
                            default:
                                return AbstractC3531s.m10461a0(interfaceC12251g5, (C28624i0) obj5);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R22);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R22, c28655q);
            boolean zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled("wce-padding-keyboard-fix");
            Object objM87133R23 = c28655q.m87133R();
            if (objM87133R23 == c28676v0) {
                objM87133R23 = AbstractC31061c.m95646v(0, c28655q);
            }
            final InterfaceC28593a1 interfaceC28593a3 = (InterfaceC28593a1) objM87133R23;
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(300558194);
                Object objM87133R24 = c28655q.m87133R();
                if (objM87133R24 == c28676v0) {
                    objM87133R24 = new Function1() { // from class: bp0.f
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i17) {
                                case 0:
                                    return AbstractC3531s.m10512r0((InterfaceC28593a1) interfaceC28593a3, ((Integer) obj5).intValue());
                                default:
                                    return AbstractC3531s.m10425I0(interfaceC28593a3, ((Integer) obj5).intValue());
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R24);
                }
                m10420G((Function1) objM87133R24, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(300620659);
                c28655q.m87173q(false);
            }
            C13404j c13404jM37826b2 = m10444S(interfaceC28601c1M87261o).getCurrentScreenContext();
            CoachEntry coachEntry = c13404jM37826b2 != null ? c13404jM37826b2.getCoachEntry() : null;
            CoachSurfaceType type = coachEntry != null ? coachEntry.getType() : null;
            boolean zBooleanValue = (coachEntry == null || (data2 = coachEntry.getData()) == null || (useVoice = data2.getUseVoice()) == null) ? false : useVoice.booleanValue();
            boolean zM87153g9 = c28655q.m87153g(interfaceC40915c4) | c28655q.m87153g(interfaceC2994c2);
            Object objM87133R25 = c28655q.m87133R();
            if (zM87153g9 || objM87133R25 == c28676v0) {
                objM87133R25 = new C3513a(interfaceC40915c4, interfaceC2994c2);
                c28655q.m87172p0(objM87133R25);
            }
            C3513a c3513a2 = (C3513a) objM87133R25;
            Object objM87133R26 = c28655q.m87133R();
            if (objM87133R26 == c28676v0) {
                objM87133R26 = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            final InterfaceC28690z0 interfaceC28690z5 = (InterfaceC28690z0) objM87133R26;
            Object objM87133R27 = c28655q.m87133R();
            CoachEntry coachEntry2 = coachEntry;
            if (objM87133R27 == c28676v0) {
                objM87133R27 = AbstractC28683x.m87272z(new C16617b(9205357640488583168L));
                c28655q.m87172p0(objM87133R27);
            }
            InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R27;
            Object objM87133R28 = c28655q.m87133R();
            if (objM87133R28 == c28676v0) {
                f13 = 0.0f;
                objM87133R28 = AbstractC11266d.m30468v(0.0f, c28655q);
            } else {
                f13 = 0.0f;
            }
            InterfaceC28690z0 interfaceC28690z6 = (InterfaceC28690z0) objM87133R28;
            Object objM87133R29 = c28655q.m87133R();
            if (objM87133R29 == c28676v0) {
                objM87133R29 = AbstractC11266d.m30468v(f13, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z7 = (InterfaceC28690z0) objM87133R29;
            Object objM87133R30 = c28655q.m87133R();
            if (objM87133R30 == c28676v0) {
                objM87133R30 = AbstractC11266d.m30468v(f13, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z8 = (InterfaceC28690z0) objM87133R30;
            Object objM87133R31 = c28655q.m87133R();
            if (objM87133R31 == c28676v0) {
                objM87133R31 = AbstractC11266d.m30468v(f13, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z9 = (InterfaceC28690z0) objM87133R31;
            Object objM87133R32 = c28655q.m87133R();
            if (objM87133R32 == c28676v0) {
                objM87133R32 = AbstractC11266d.m30468v(f13, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z10 = (InterfaceC28690z0) objM87133R32;
            C13404j c13404jM37826b3 = m10444S(interfaceC28601c1M87261o).getCurrentScreenContext();
            boolean zM37871c = AbstractC13405k.m37871c(c13404jM37826b3);
            InterfaceC13399e interfaceC13399eM37842a = m10444S(interfaceC28601c1M87261o).getProactiveState().getProactiveAnimationState();
            InterfaceC13399e.a aVar = interfaceC13399eM37842a instanceof InterfaceC13399e.a ? (InterfaceC13399e.a) interfaceC13399eM37842a : null;
            boolean z27 = (aVar != null ? aVar.getOnLoadStyle() : null) == EnumC13400f.PREVIEW && !AbstractC39414r.m125890i0(aVar.getPreviewText());
            if (aVar != null) {
                z4 = z27;
                boolean z28 = aVar.getIsCollapsed();
                if (c13404jM37826b3 != null) {
                    fingerprint = c13404jM37826b3.getFingerprint();
                } else {
                    fingerprint = null;
                }
                if (fingerprint != null || fingerprint.length() == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z28;
                boolean zIsFeatureEnabled2 = featureFlagChecker.isFeatureEnabled("aix-coach-drawer");
                if (c13404jM37826b3 != null) {
                    fingerprint2 = c13404jM37826b3.getFingerprint();
                } else {
                    fingerprint2 = null;
                }
                final boolean zM10519t1 = m10519t1(zIsFeatureEnabled2, fingerprint2, type);
                if (z13 && (m10444S(interfaceC28601c1M87261o).getProactiveState().getIsPrefetchEnabled() || m10444S(interfaceC28601c1M87261o).getIsBottomSheetVisible() || z4 || zM10519t1)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c13404jM37826b3 != null) {
                    strM37869a = AbstractC13405k.m37869a(c13404jM37826b3);
                } else {
                    strM37869a = null;
                }
                zM87153g = c28655q.m87153g(strM37869a);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    if (c13404jM37826b3 != null) {
                        objM87133R = AbstractC10969j0.m29172f1(c13404jM37826b3);
                    } else {
                        objM87133R = null;
                    }
                    c28655q.m87172p0(objM87133R);
                }
                C32645n0 c32645n0 = (C32645n0) objM87133R;
                if (z15 || c32645n0 == null) {
                    c28655q.m87150e0(304171647);
                    c28655q.m87173q(false);
                    c4656v0 = null;
                } else {
                    c28655q.m87150e0(304073780);
                    C4656v0 c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), c32645n0, c28655q, C32645n0.f135304t << 3);
                    c28655q.m87173q(false);
                    c4656v0 = c4656v0M14712i;
                }
                fMo743q0 = interfaceC39171c.mo743q0(configuration.screenHeightDp);
                f14 = f14063a;
                fMo743q1 = interfaceC39171c.mo743q0(f14);
                if (m10456Y(interfaceC28690z7) > 0.0f) {
                    fM10456Y = m10456Y(interfaceC28690z7);
                } else {
                    fM10456Y = fMo743q1;
                }
                if (m10464b0(interfaceC28690z8) > 0.0f) {
                    fM10464b0 = m10464b0(interfaceC28690z8);
                } else {
                    fM10464b0 = fMo743q1;
                }
                if (zM37871c) {
                    fM10476f0 = m10476f0(interfaceC28690z10);
                } else {
                    fM10476f0 = 0.0f;
                }
                fM29496j1 = AbstractC11009x0.m29496j1(fMo743q0, fM10476f0, zM37871c) - fM10464b0;
                f15 = fM10476f0;
                if (fM29496j1 < 1.0f) {
                    fM29496j1 = 1.0f;
                }
                f16 = 0.39999998f * fMo743q0;
                if (f16 < 1.0f) {
                    f16 = 1.0f;
                }
                if (zM37871c) {
                    f17 = f15;
                } else {
                    f17 = 0.100000024f * fMo743q0;
                }
                if (f17 < 1.0f) {
                    f17 = 1.0f;
                }
                boolean z29 = zM37871c;
                c10998tM29406c = AbstractC11004v.m29406c(fM29496j1, f16, fMo743q0 * 0.08f, f17, c28655q, 0, 0);
                c28655q = c28655q;
                if (c13404jM37826b3 != null) {
                    strM37869a2 = AbstractC13405k.m37869a(c13404jM37826b3);
                } else {
                    strM37869a2 = null;
                }
                zM87153g2 = c28655q.m87153g(strM37869a2);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(0, c28655q);
                }
                InterfaceC28593a1 interfaceC28593a4 = (InterfaceC28593a1) objM87133R2;
                if (c13404jM37826b3 != null) {
                    strM37869a3 = AbstractC13405k.m37869a(c13404jM37826b3);
                } else {
                    strM37869a3 = null;
                }
                zM87153g3 = c28655q.m87153g(strM37869a3);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                fM29391f = c10998tM29406c.m29391f();
                float fM29390e = c10998tM29406c.m29390e();
                float fM29387b = c10998tM29406c.m29387b();
                interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC12889b.m36269e();
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R5;
                zM87157i = c28655q.m87157i(interfaceC15237i);
                objM87133R6 = c28655q.m87133R();
                if (!zM87157i || objM87133R6 == c28676v0) {
                    interfaceC16439p3 = null;
                    objM87133R6 = new n(interfaceC21083i, interfaceC15237i, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    interfaceC16439p3 = null;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, interfaceC21083i);
                C16435p draggableState = c10998tM29406c.getDraggableState();
                EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                CoachSurfaceType coachSurfaceType = type;
                Modifier modifierM3371b = AbstractC1096a.m3371b(draggableState, zM10519t1, interfaceC21083i, interfaceC16439p3, 48);
                C16435p draggableState2 = c10998tM29406c.getDraggableState();
                zM87157i2 = c28655q.m87157i(interfaceC15237i);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i2 || objM87133R7 == c28676v0) {
                    objM87133R7 = new u(interfaceC15237i);
                    c28655q.m87172p0(objM87133R7);
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM29361i = AbstractC10995s.m29361i(c2314t, draggableState2, (InterfaceC4339a) objM87133R7, c28655q, 6);
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R8);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
                if (c13404jM37826b3 != null) {
                    strM37869a4 = AbstractC13405k.m37869a(c13404jM37826b3);
                } else {
                    strM37869a4 = null;
                }
                zM87153g4 = c28655q.m87153g(c10998tM29406c) | c28655q.m87155h(z14);
                objM87133R9 = c28655q.m87133R();
                if (!zM87153g4 || objM87133R9 == c28676v0) {
                    interfaceC28601c3 = interfaceC28601c10;
                    interfaceC28690z0 = interfaceC28690z6;
                    interfaceC28690z1 = interfaceC28690z7;
                    interfaceC28690z2 = interfaceC28690z8;
                    interfaceC28690z3 = interfaceC28690z10;
                    objM87133R9 = new o(c10998tM29406c, z14, interfaceC28601c3, interfaceC28690z0, interfaceC28690z1, interfaceC28690z2, interfaceC28690z3, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    interfaceC28601c3 = interfaceC28601c10;
                    interfaceC28690z0 = interfaceC28690z6;
                    interfaceC28690z1 = interfaceC28690z7;
                    interfaceC28690z2 = interfaceC28690z8;
                    interfaceC28690z3 = interfaceC28690z10;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, strM37869a4);
                Integer numValueOf = Integer.valueOf(configuration.orientation);
                zM87157i3 = c28655q.m87157i(configuration) | c28655q.m87153g(c10998tM29406c) | c28655q.m87155h(z14);
                objM87133R10 = c28655q.m87133R();
                if (zM87157i3 || objM87133R10 == c28676v0) {
                    objM87133R10 = new p(configuration, c10998tM29406c, z14, null);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R10, numValueOf);
                Boolean boolValueOf = Boolean.valueOf(z14);
                zM87153g5 = c28655q.m87153g(c10998tM29406c) | c28655q.m87155h(z14);
                objM87133R11 = c28655q.m87133R();
                if (!zM87153g5 || objM87133R11 == c28676v0) {
                    obj = null;
                    objM87133R11 = new q(c10998tM29406c, z14, null);
                    c28655q.m87172p0(objM87133R11);
                } else {
                    obj = null;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R11, boolValueOf);
                Boolean boolValueOf2 = Boolean.valueOf(z14);
                zM87153g6 = c28655q.m87153g(c10998tM29406c) | c28655q.m87155h(z14) | c28655q.m87157i(interfaceC40915c4) | c28655q.m87157i(interfaceC12251g5);
                Object objM87133R33 = c28655q.m87133R();
                if (!zM87153g6 || objM87133R33 == c28676v0) {
                    c10998t = c10998tM29406c;
                    rVar = new r(c10998t, z14, interfaceC40915c4, interfaceC12251g5, null);
                    c28655q.m87172p0(rVar);
                } else {
                    rVar = objM87133R33;
                    c10998t = c10998tM29406c;
                }
                AbstractC28683x.m87254h(c10998t, boolValueOf2, (InterfaceC4351m) rVar, c28655q);
                Boolean boolValueOf3 = Boolean.valueOf(m10444S(interfaceC28601c1M87261o).getIsBottomSheetVisible());
                zM87153g7 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c10998t) | c28655q.m87155h(z14);
                objM87133R12 = c28655q.m87133R();
                if (zM87153g7 || objM87133R12 == c28676v0) {
                    objM87133R12 = new s(c10998t, z14, interfaceC28601c1M87261o, null);
                    c28655q.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, boolValueOf3);
                m10439P0(m10444S(interfaceC28601c1M87261o), c28655q, C13398d.f46924i);
                if (m10435N0(interfaceC28690z5) < 0.25f) {
                    float fM10435N0 = 1.0f - (m10435N0(interfaceC28690z5) / 0.25f);
                    f18 = fM10435N0 * fM10435N0 * fM10435N0 * fM10435N0 * fM10435N0;
                } else {
                    f18 = 0.0f;
                }
                fM10486i1 = m10486i1(zIsFeatureEnabled, interfaceC39171c, c28655q, 0);
                iM10477f1 = m10477f1(zIsFeatureEnabled, m10497m0(interfaceC28593a3), interfaceC39171c, c28655q, 0);
                interfaceC28601c4 = interfaceC28601c1M87261o;
                if (C16617b.m47187c(m10448U(interfaceC28601c3), 9205357640488583168L)) {
                    float fMo743q2 = interfaceC39171c.mo743q0(configuration.screenWidthDp);
                    float fMo743q3 = interfaceC39171c.mo743q0(configuration.screenHeightDp);
                    float fMo743q4 = interfaceC39171c.mo743q0(f14);
                    float f27 = 8;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((fMo743q2 - fMo743q4) - interfaceC39171c.mo743q0(((float) 1.5d) * f27))) << 32) | (((long) Float.floatToRawIntBits(((fMo743q3 - fMo743q4) - interfaceC39171c.mo743q0(1 * f27)) - fM10486i1)) & 4294967295L);
                } else {
                    jFloatToRawIntBits = m10448U(interfaceC28601c3);
                }
                if (m10452W(interfaceC28690z0) > 0.0f) {
                    fMo743q1 = m10452W(interfaceC28690z0);
                }
                f19 = fMo743q1;
                if (aVar != null) {
                    strM37838g = aVar.getPreviewText();
                } else {
                    strM37838g = null;
                }
                if (strM37838g == null) {
                    strM37838g = "";
                }
                String str = strM37838g;
                if (coachEntry2 != null || (data = coachEntry2.getData()) == null) {
                    maxLines = null;
                } else {
                    maxLines = data.getMaxLines();
                }
                if (fM29391f <= 0.0f || c10998t.m29392g().isDrawerDetent()) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM10495l1 = m10495l1(c10998t.m29392g(), m10494l0(interfaceC28601c1));
                Boolean boolValueOf4 = Boolean.valueOf(z16);
                zM87155h = c28655q.m87155h(z16);
                objM87133R13 = c28655q.m87133R();
                if (!zM87155h || objM87133R13 == c28676v0) {
                    obj2 = null;
                    objM87133R13 = new t(z16, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R13);
                } else {
                    obj2 = null;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R13, boolValueOf4);
                zM87153g8 = c28655q.m87153g(c10998t) | c28655q.m87157i(interfaceC12251g5) | c28655q.m87157i(interfaceC40915c4);
                Object objM87133R34 = c28655q.m87133R();
                if (!zM87153g8 || objM87133R34 == c28676v0) {
                    InterfaceC40915c interfaceC40915c5 = interfaceC40915c4;
                    bVar = new b(c10998t, interfaceC12251g5, interfaceC28601c2, interfaceC40915c5, null);
                    interfaceC12251g = interfaceC12251g5;
                    interfaceC28601c5 = interfaceC28601c2;
                    interfaceC40915c4 = interfaceC40915c5;
                    c28655q.m87172p0(bVar);
                } else {
                    bVar = objM87133R34;
                    interfaceC12251g = interfaceC12251g5;
                    interfaceC28601c5 = interfaceC28601c2;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) bVar, c10998t);
                c13404jM37826b = m10444S(interfaceC28601c4).getCurrentScreenContext();
                if (c13404jM37826b != null) {
                    c28655q.m87150e0(314392564);
                    c28655q.m87144b0(-1652425986, AbstractC13405k.m37869a(c13404jM37826b));
                    C10978m0 c10978m0 = new C10978m0(m10444S(interfaceC28601c4).getIsBottomSheetVisible(), jFloatToRawIntBits, c13404jM37826b, f19, null, 0.0f, null, m10444S(interfaceC28601c4).getProactiveState().getIsPrefetchEnabled(), iM10477f1, c13404jM37826b.getShouldOpenFullSize(), c13404jM37826b.getDrawerPresentation(), false, 2160, null);
                    boolean zM10503o0 = m10503o0(interfaceC28601c5);
                    zM87157i5 = c28655q.m87157i(c3513a2);
                    objM87133R15 = c28655q.m87133R();
                    if (zM87157i5 || objM87133R15 == c28676v0) {
                        objM87133R15 = new c(c3513a2);
                        c28655q.m87172p0(objM87133R15);
                    }
                    InterfaceC21467g interfaceC21467g = (InterfaceC21467g) objM87133R15;
                    zM87157i6 = c28655q.m87157i(c3513a2);
                    objM87133R16 = c28655q.m87133R();
                    if (zM87157i6 || objM87133R16 == c28676v0) {
                        objM87133R16 = new d(c3513a2);
                        c28655q.m87172p0(objM87133R16);
                    }
                    InterfaceC21467g interfaceC21467g2 = (InterfaceC21467g) objM87133R16;
                    zM87157i7 = c28655q.m87157i(c3513a2) | c28655q.m87157i(c13404jM37826b) | c28655q.m87157i(interfaceC12251g);
                    objM87133R17 = c28655q.m87133R();
                    if (zM87157i7 || objM87133R17 == c28676v0) {
                        objM87133R17 = new C0467z0(c3513a2, c13404jM37826b, interfaceC12251g, 1);
                        c28655q.m87172p0(objM87133R17);
                    }
                    Function1 function1 = (Function1) objM87133R17;
                    objM87133R18 = c28655q.m87133R();
                    if (objM87133R18 == c28676v0) {
                        final int i18 = 0;
                        objM87133R18 = new Function1() { // from class: bp0.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i18) {
                                    case 0:
                                        return AbstractC3531s.m10518t0(interfaceC28690z5, ((Float) obj5).floatValue());
                                    default:
                                        return AbstractC3531s.m10527w0(interfaceC28690z5, (C39180l) obj5);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R18);
                    }
                    Function1 function2 = (Function1) objM87133R18;
                    zM87157i8 = c28655q.m87157i(c3513a2);
                    objM87133R19 = c28655q.m87133R();
                    if (zM87157i8 || objM87133R19 == c28676v0) {
                        objM87133R19 = new C3520h(0, c3513a2, interfaceC28601c5);
                        c28655q.m87172p0(objM87133R19);
                    }
                    z17 = zM10495l1;
                    c13404j = c13404jM37826b;
                    InterfaceC40915c interfaceC40915c6 = interfaceC40915c4;
                    interfaceC28601c6 = interfaceC28601c1;
                    c10998t2 = c10998t;
                    C4656v0 c4656v6 = c4656v0;
                    c3513a = c3513a2;
                    z18 = z14;
                    r10 = 0;
                    AbstractC10969j0.m29119I(c10978m0, function1, interfaceC40915c6, null, function2, (Function3) objM87133R19, zM10503o0, (InterfaceC4351m) interfaceC21467g, (InterfaceC4351m) interfaceC21467g2, z17, c4656v6, null, c28655q, C13404j.f46947x | 24576, C4656v0.f18980q, 2056);
                    interfaceC40915c = interfaceC40915c6;
                    c4656v1 = c4656v6;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    c28655q.m87179t();
                } else {
                    interfaceC28601c6 = interfaceC28601c1;
                    c10998t2 = c10998t;
                    interfaceC40915c = interfaceC40915c4;
                    c4656v1 = c4656v0;
                    c3513a = c3513a2;
                    c13404j = c13404jM37826b;
                    r10 = 0;
                    z17 = zM10495l1;
                    z18 = z14;
                    c28655q.m87150e0(315959955);
                    c28655q.m87179t();
                }
                if (m10444S(interfaceC28601c4).getIsFabVisible() || f18 <= 0.0f) {
                    interfaceC40915c2 = interfaceC40915c;
                    z17 = z17;
                    c4656v2 = c4656v1;
                    c13404j2 = c13404jM37826b3;
                    z19 = z18;
                    interfaceC2994c0 = interfaceC2994c2;
                    c16351i = c16351iM118972a0;
                    z24 = r0;
                    interfaceC12251g2 = interfaceC12251g;
                    interfaceC28593a1 = r47;
                    interfaceC28601c7 = r56;
                    f24 = r57;
                    obj3 = r9;
                    c3 = 3;
                    c10998t3 = c10998t2;
                    c28655q.m87150e0(326171603);
                    c28655q.m87179t();
                } else {
                    c28655q.m87150e0(316371325);
                    if (coachSurfaceType == null || !coachSurfaceType.isBar()) {
                        interfaceC40915c2 = interfaceC40915c;
                        z17 = z17;
                        c4656v2 = c4656v1;
                        c13404j2 = c13404jM37826b3;
                        InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c3;
                        InterfaceC28690z0 interfaceC28690z11 = interfaceC28690z0;
                        z19 = z18;
                        c16351i = c16351iM118972a0;
                        z24 = r0;
                        interfaceC28593a1 = r47;
                        interfaceC28601c7 = r56;
                        f24 = r57;
                        obj3 = r9;
                        int i19 = 6;
                        c10998t3 = c10998t2;
                        c28655q.m87150e0(325341764);
                        C13402h c13402hM37828d = m10444S(interfaceC28601c4).getProactiveState();
                        boolean zM37830f = m10444S(interfaceC28601c4).getIsBottomSheetVisible();
                        C3513a c3513a3 = c3513a;
                        boolean zM87157i11 = c28655q.m87157i(c3513a3);
                        Object objM87133R35 = c28655q.m87133R();
                        if (zM87157i11 || objM87133R35 == obj3) {
                            objM87133R35 = new g(c3513a3);
                            c28655q.m87172p0(objM87133R35);
                        }
                        InterfaceC21467g interfaceC21467g3 = (InterfaceC21467g) objM87133R35;
                        C13404j c13404jM37826b4 = m10444S(interfaceC28601c4).getCurrentScreenContext();
                        Object objM87133R36 = c28655q.m87133R();
                        if (objM87133R36 == obj3) {
                            objM87133R36 = new C3529q(0, interfaceC28601c12, interfaceC28690z11);
                            c28655q.m87172p0(objM87133R36);
                        }
                        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R36;
                        interfaceC2994c0 = interfaceC2994c2;
                        interfaceC12251g2 = interfaceC12251g;
                        boolean zM87157i12 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g2);
                        Object objM87133R37 = c28655q.m87133R();
                        if (zM87157i12 || objM87133R37 == obj3) {
                            objM87133R37 = new C0134l(i19, interfaceC2994c0, interfaceC12251g2);
                            c28655q.m87172p0(objM87133R37);
                        }
                        c3 = 3;
                        C28655q c28655q2 = c28655q;
                        m10428K(interfaceC39171c, c13402hM37828d, f18, zM37830f, interfaceC4351m, (InterfaceC4339a) objM87133R37, (InterfaceC4351m) interfaceC21467g3, c13404jM37826b4, coachEntry2, c28655q2, (CoachEntry.$stable << 24) | (C13402h.f46944c << 3) | 24576 | (C13404j.f46947x << 21), 0);
                        c28655q = c28655q2;
                        c28655q.m87179t();
                    } else {
                        c28655q.m87150e0(316387910);
                        CoachEntryData data3 = coachEntry2.getData();
                        if (data3 == null || (strM92103Y = data3.getPlaceholder()) == null || AbstractC39414r.m125890i0(strM92103Y)) {
                            strM92103Y = null;
                        }
                        if (strM92103Y == null) {
                            c28655q.m87150e0(-1652364085);
                            strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159683n);
                        } else {
                            c28655q.m87150e0(-1652366441);
                        }
                        c28655q.m87179t();
                        String str2 = strM92103Y;
                        C36582j0 c36582j0M10480g1 = m10480g1(m10444S(interfaceC28601c4).getProactiveState(), m10444S(interfaceC28601c4).getIsBottomSheetVisible(), m10444S(interfaceC28601c4).getRealtimeVoiceState(), coachEntry2);
                        ?? r14 = (!AbstractC8693b.m21270d(c36582j0M10480g1.getPreviewDisplayText()) || c36582j0M10480g1.getIsPreviewCollapsed()) ? r10 : 1;
                        if (r14 != 0) {
                            f25 = (float) 2.5d;
                            i14 = 8;
                        } else {
                            i14 = 8;
                            f25 = (float) 3.5d;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(f25 * i14, AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, r10, AbstractC11333b0.f36310a, 2), "CoachBarBottomMargin", c28655q, 384, 8);
                        if (c36582j0M10480g1.getIsPreviewCollapsed()) {
                            fM36283m = 1.0f;
                            f26 = fM29387b;
                        } else {
                            f26 = fM29387b;
                            fM36283m = AbstractC12889b.m36283m(f26, 0.0f, 1.0f);
                        }
                        if (r0 == 0 || !AbstractC8693b.m21270d(c36582j0M10480g1.getPreviewDisplayText())) {
                            fM10524v0 = m10524v0(interfaceC28670t2M30587a);
                        } else {
                            float f28 = i14;
                            fM10524v0 = AbstractC12889b.m36249O(((float) 2.5d) * f28, ((float) 3.5d) * f28, fM36283m);
                        }
                        float fM37825a = m10444S(interfaceC28601c4).getCoachBarNavClearancePx();
                        float fMo743q5 = interfaceC39171c.mo743q0(fM10524v0);
                        z29 = z29;
                        float fMo734f0 = interfaceC39171c.mo734f0(m10474e1(z29, fM37825a, fMo743q5));
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, r61);
                        Object objM87133R38 = c28655q.m87133R();
                        if (objM87133R38 == c28676v0) {
                            interfaceC28690z4 = interfaceC28690z9;
                            final int i24 = 1;
                            objM87133R38 = new Function1() { // from class: bp0.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    switch (i24) {
                                        case 0:
                                            return AbstractC3531s.m10518t0(interfaceC28690z4, ((Float) obj5).floatValue());
                                        default:
                                            return AbstractC3531s.m10527w0(interfaceC28690z4, (C39180l) obj5);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R38);
                        } else {
                            interfaceC28690z4 = r38;
                        }
                        Modifier modifierM3502b = AbstractC1132b.m3502b(modifierM3407d, (Function1) objM87133R38);
                        C2307m c2307m = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, r10);
                        int iHashCode = Long.hashCode(AbstractC28683x.m87267u(c28655q));
                        InterfaceC28653p1 interfaceC28653p1M87116A = c28655q.m87116A();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3502b);
                        InterfaceC0221l.f734a.getClass();
                        final float f29 = f26;
                        C0213j c0213jM545a = C0217k.m545a();
                        c28655q.m87158i0();
                        if (c28655q.m87120E()) {
                            c28655q.m87163l(c0213jM545a);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.m547c(), interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.m549e(), interfaceC28653p1M87116A);
                        C0209i c0209iM546b = C0217k.m546b();
                        if (c28655q.m87120E() || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209iM546b);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.m548d(), modifierM118962N);
                        C2307m c2307m2 = C2299e.f9105H;
                        C1100b c1100b = C1100b.f4583a;
                        Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m2)), 0.0f, 0.0f, f18, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        int iHashCode2 = Long.hashCode(AbstractC28683x.m87267u(c28655q));
                        InterfaceC28653p1 interfaceC28653p1M87116A2 = c28655q.m87116A();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3488c);
                        float f34 = fM36283m;
                        C0213j c0213jM545a2 = C0217k.m545a();
                        c28655q.m87158i0();
                        if (c28655q.m87120E()) {
                            c28655q.m87163l(c0213jM545a2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.m547c(), interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, C0217k.m549e(), interfaceC28653p1M87116A2);
                        C0209i c0209iM546b2 = C0217k.m546b();
                        if (c28655q.m87120E() || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209iM546b2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.m548d(), modifierM118962N2);
                        if (z29) {
                            c7 = 6;
                            c28655q.m87150e0(1369061581);
                            c28655q.m87179t();
                        } else {
                            c28655q.m87150e0(1368442697);
                            Modifier modifierMo3401b = c1100b.mo3401b(c2314t);
                            C17909s c17909s = AbstractC17911t.f69612b;
                            Float fValueOf = Float.valueOf(0.0f);
                            int i25 = C17919x.f69638o;
                            c7 = 6;
                            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3357b(modifierMo3401b, C17909s.m51494l(c17909s, new C23465k[]{AbstractC37056f.m118979e0(fValueOf, C17919x.m51539a(AbstractC17918w0.m51532t())), AbstractC37056f.m118979e0(Float.valueOf(0.5f), C17919x.m51539a(C17919x.m51541c(0.7f, AbstractC17918w0.m51531s()))), AbstractC37056f.m118979e0(Float.valueOf(1.0f), C17919x.m51539a(C17919x.m51541c(0.7f, AbstractC17918w0.m51531s())))}, 0.0f, 0.0f, 14), null, 0.0f, 6), "GlobalCoachBarScrim"), c28655q, 0);
                            c28655q.m87179t();
                        }
                        float f35 = 8;
                        float f36 = ((float) 1.5d) * f35;
                        Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC22953f.m66722k(AbstractC1136a.m3599a(AbstractC1127a.m3488c(c2314t, 0.0f, 0.0f, 1.0f - fM29391f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), "GlobalCoachBar")), f36, 4 * f35, f36, fMo734f0);
                        boolean z34 = (r0 == 0 || c4656v1 == null || r14 != 0) ? false : true;
                        Object objM87133R39 = c28655q.m87133R();
                        if (objM87133R39 == c28676v0) {
                            interfaceC28601c8 = interfaceC28601c6;
                            i15 = 2;
                            objM87133R39 = new C3533u(interfaceC28601c8, i15);
                            c28655q.m87172p0(objM87133R39);
                        } else {
                            interfaceC28601c8 = interfaceC28601c6;
                            i15 = 2;
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R39;
                        C28655q c28655q3 = c28655q;
                        interfaceC28601c6 = interfaceC28601c8;
                        final C10998t c10998t6 = c10998t2;
                        boolean z35 = z18;
                        Modifier modifierM29366n = AbstractC10995s.m29366n(modifierM3397s, c10998t6, z35, z34, interfaceC4339a, c28655q3, 24576, 0);
                        boolean zM87147d = c28655q3.m87147d(fM29391f) | c28655q3.m87147d(f29) | c28655q3.m87153g(c10998t6);
                        Object objM87133R40 = c28655q3.m87133R();
                        if (zM87147d || objM87133R40 == c28676v0) {
                            final InterfaceC28690z0 interfaceC28690z12 = interfaceC28690z3;
                            final InterfaceC28690z0 interfaceC28690z13 = interfaceC28690z4;
                            final InterfaceC28690z0 interfaceC28690z14 = interfaceC28690z2;
                            final InterfaceC28690z0 interfaceC28690z15 = interfaceC28690z1;
                            final InterfaceC28690z0 interfaceC28690z16 = interfaceC28690z0;
                            final InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c3;
                            objM87133R40 = new Function1() { // from class: bp0.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    return AbstractC3531s.m10531y0(fM29391f, f29, c10998t6, interfaceC28601c13, interfaceC28690z16, interfaceC28690z15, interfaceC28690z14, interfaceC28690z13, interfaceC28690z12, (InterfaceC39147y) obj5);
                                }
                            };
                            c28655q3.m87172p0(objM87133R40);
                        }
                        Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM29366n, (Function1) objM87133R40);
                        final C13404j c13404j4 = c13404j;
                        final InterfaceC12251g interfaceC12251g6 = interfaceC12251g;
                        boolean zM87155h2 = c28655q3.m87155h(zM10519t1) | c28655q3.m87157i(c4656v1) | c28655q3.m87157i(interfaceC2994c2) | c28655q3.m87153g(c10998t6) | c28655q3.m87157i(c13404j4) | c28655q3.m87157i(interfaceC12251g6);
                        Object objM87133R41 = c28655q3.m87133R();
                        if (zM87155h2 || objM87133R41 == c28676v0) {
                            final C4656v0 c4656v7 = c4656v1;
                            interfaceC2994c1 = interfaceC2994c2;
                            obj4 = new InterfaceC4339a() { // from class: bp0.j
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC3531s.m10533z0(zM10519t1, c4656v7, interfaceC2994c1, interfaceC28601c6, c10998t6, c13404j4, interfaceC12251g6);
                                }
                            };
                            c4656v5 = c4656v7;
                            interfaceC28601c6 = interfaceC28601c6;
                            interfaceC12251g3 = interfaceC12251g6;
                            z26 = zM10519t1;
                            c10998t4 = c10998t6;
                            c28655q3.m87172p0(obj4);
                        } else {
                            C4656v0 c4656v8 = c4656v1;
                            interfaceC2994c1 = interfaceC2994c2;
                            c4656v5 = c4656v8;
                            obj4 = objM87133R41;
                            c10998t4 = c10998t6;
                            z26 = zM10519t1;
                            interfaceC12251g3 = interfaceC12251g6;
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj4;
                        boolean zM87157i13 = c28655q3.m87157i(c13404jM37826b3) | c28655q3.m87155h(z26) | c28655q3.m87157i(c4656v5) | c28655q3.m87157i(interfaceC2994c1) | c28655q3.m87157i(interfaceC12251g3) | c28655q3.m87153g(interfaceC28593a4) | c28655q3.m87153g(interfaceC28601c11) | c28655q3.m87153g(c10998t4);
                        Object objM87133R42 = c28655q3.m87133R();
                        if (zM87157i13 || objM87133R42 == c28676v0) {
                            interfaceC28593a2 = interfaceC28593a4;
                            interfaceC28601c9 = interfaceC28601c11;
                            c10998t5 = c10998t4;
                            InterfaceC12251g interfaceC12251g7 = interfaceC12251g3;
                            c13404j3 = c13404jM37826b3;
                            InterfaceC2994c0 interfaceC2994c3 = interfaceC2994c1;
                            fVar = new f(c13404j3, z26, c4656v5, interfaceC2994c3, interfaceC12251g7, interfaceC28601c6, interfaceC28593a2, interfaceC28601c9, c10998t5);
                            interfaceC2994c1 = interfaceC2994c3;
                            interfaceC12251g4 = interfaceC12251g7;
                            c28655q3.m87172p0(fVar);
                        } else {
                            interfaceC28593a2 = interfaceC28593a4;
                            interfaceC28601c9 = interfaceC28601c11;
                            c10998t5 = c10998t4;
                            c13404j3 = c13404jM37826b3;
                            fVar = objM87133R42;
                            interfaceC12251g4 = interfaceC12251g3;
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) ((InterfaceC21467g) fVar);
                        boolean zM87157i14 = c28655q3.m87157i(c16351iM118972a0);
                        Object objM87133R43 = c28655q3.m87133R();
                        if (zM87157i14 || objM87133R43 == r13) {
                            final int i26 = 1;
                            objM87133R43 = new InterfaceC4339a() { // from class: bp0.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC3531s.m10427J0(c16351iM118972a0);
                                        default:
                                            return AbstractC3531s.m10409A0(c16351iM118972a0);
                                    }
                                }
                            };
                            c28655q3.m87172p0(objM87133R43);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R43;
                        boolean zM87153g10 = c28655q3.m87153g(interfaceC28601c4) | c28655q3.m87157i(interfaceC12251g4);
                        f24 = fM29391f;
                        Object objM87133R44 = c28655q3.m87133R();
                        if (zM87153g10 || objM87133R44 == r13) {
                            objM87133R44 = new C0134l(4, interfaceC12251g4, interfaceC28601c4);
                            c28655q3.m87172p0(objM87133R44);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R44;
                        boolean zM87157i15 = c28655q3.m87157i(interfaceC40915c) | c28655q3.m87157i(interfaceC12251g4);
                        Object objM87133R45 = c28655q3.m87133R();
                        if (zM87157i15 || objM87133R45 == r13) {
                            objM87133R45 = new C0134l(5, interfaceC40915c, interfaceC12251g4);
                            c28655q3.m87172p0(objM87133R45);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R45;
                        interfaceC28601c4 = interfaceC28601c4;
                        Modifier modifier = z26 ? modifierM3371b : null;
                        Float fValueOf2 = z26 ? Float.valueOf(f34) : null;
                        CoachEntryData data4 = r11.getData();
                        boolean zBooleanValue2 = (data4 == null || (showMic = data4.getShowMic()) == null) ? true : showMic.booleanValue();
                        CoachEntryData data5 = coachEntry2.getData();
                        C13404j c13404j5 = c13404j3;
                        boolean z36 = zBooleanValue;
                        c10998t3 = c10998t5;
                        z19 = z35;
                        c13404j2 = c13404j5;
                        c4656v2 = c4656v5;
                        interfaceC40915c2 = interfaceC40915c;
                        c16351i = c16351iM118972a0;
                        interfaceC28593a1 = interfaceC28593a2;
                        z24 = z26;
                        interfaceC28601c7 = interfaceC28601c9;
                        obj3 = r13;
                        AbstractC36588p.m117413S(str2, modifierM3500d, c36582j0M10480g1, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, null, modifier, fValueOf2, z36, zBooleanValue2, data5 != null ? data5.getMaxLines() : null, 0.0f, null, null, null, null, false, false, false, null, null, null, c28655q3, C36582j0.f156694i << 6, 0, 0, 33538304);
                        zBooleanValue = z36;
                        c28655q = c28655q3;
                        c28655q.m87177s();
                        c28655q.m87177s();
                        c28655q.m87179t();
                        interfaceC2994c0 = interfaceC2994c1;
                        interfaceC12251g2 = interfaceC12251g4;
                        c3 = 3;
                    }
                    c28655q.m87179t();
                }
                Boolean boolValueOf5 = Boolean.valueOf(z17);
                interfaceC40915c3 = interfaceC40915c2;
                z25 = z17;
                zM87157i4 = c28655q.m87157i(interfaceC40915c3) | c28655q.m87155h(z25);
                objM87133R14 = c28655q.m87133R();
                if (zM87157i4 || objM87133R14 == obj3) {
                    objM87133R14 = new i(interfaceC40915c3, z25, null);
                    c28655q.m87172p0(objM87133R14);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R14, boolValueOf5);
                if (z16 || (c4656v3 = c4656v2) == null || c32645n0 == null || m10444S(interfaceC28601c4).getIsBottomSheetVisible()) {
                    c28655q.m87150e0(328801395);
                    c28655q.m87179t();
                } else {
                    c28655q.m87150e0(326736020);
                    float fM29389d = c10998t3.m29389d();
                    boolean zM29394i = c10998t3.m29394i();
                    float f37 = iM10477f1;
                    C11006w c11006wM10488j0 = m10488j0(interfaceC28601c7);
                    final C10998t c10998t7 = c10998t3;
                    final boolean z37 = z19;
                    boolean zM87157i16 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c10998t7) | c28655q.m87155h(z37);
                    Object objM87133R46 = c28655q.m87133R();
                    if (zM87157i16 || objM87133R46 == obj3) {
                        final int i27 = 0;
                        objM87133R46 = new InterfaceC4339a() { // from class: bp0.r
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i27) {
                                    case 0:
                                        return AbstractC3531s.m10419F0(interfaceC2994c0, c10998t7, z37);
                                    default:
                                        return AbstractC3531s.m10421G0(interfaceC2994c0, c10998t7, z37);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R46);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R46;
                    boolean zM87157i17 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c10998t7) | c28655q.m87155h(z37);
                    Object objM87133R47 = c28655q.m87133R();
                    if (zM87157i17 || objM87133R47 == obj3) {
                        final int i28 = 1;
                        objM87133R47 = new InterfaceC4339a() { // from class: bp0.r
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i28) {
                                    case 0:
                                        return AbstractC3531s.m10419F0(interfaceC2994c0, c10998t7, z37);
                                    default:
                                        return AbstractC3531s.m10421G0(interfaceC2994c0, c10998t7, z37);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R47);
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R47;
                    boolean zM87157i18 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c10998t7);
                    Object objM87133R48 = c28655q.m87133R();
                    if (zM87157i18 || objM87133R48 == obj3) {
                        objM87133R48 = new C0134l(7, interfaceC2994c0, c10998t7);
                        c28655q.m87172p0(objM87133R48);
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R48;
                    C13404j c13404j6 = c13404j2;
                    boolean z38 = z24;
                    InterfaceC28593a1 interfaceC28593a5 = interfaceC28593a1;
                    final InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c7;
                    boolean zM87157i19 = c28655q.m87157i(c13404j6) | c28655q.m87155h(z38) | c28655q.m87157i(c4656v3) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g2) | c28655q.m87153g(interfaceC28593a5) | c28655q.m87153g(interfaceC28601c14) | c28655q.m87153g(c10998t7);
                    Object objM87133R49 = c28655q.m87133R();
                    if (zM87157i19 || objM87133R49 == obj3) {
                        InterfaceC12251g interfaceC12251g8 = interfaceC12251g2;
                        InterfaceC2994c0 interfaceC2994c4 = interfaceC2994c0;
                        c4656v4 = c4656v3;
                        mVar = new m(c13404j6, z38, c4656v4, interfaceC2994c4, interfaceC12251g8, interfaceC28601c6, interfaceC28593a5, interfaceC28601c14, c10998t7);
                        interfaceC12251g2 = interfaceC12251g8;
                        c28655q.m87172p0(mVar);
                    } else {
                        mVar = objM87133R49;
                        c4656v4 = c4656v3;
                    }
                    InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) ((InterfaceC21467g) mVar);
                    boolean zM87153g11 = c28655q.m87153g(interfaceC28601c14);
                    Object objM87133R50 = c28655q.m87133R();
                    if (zM87153g11 || objM87133R50 == obj3) {
                        final int i29 = 1;
                        objM87133R50 = new Function1() { // from class: bp0.f
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i29) {
                                    case 0:
                                        return AbstractC3531s.m10512r0((InterfaceC28593a1) interfaceC28601c14, ((Integer) obj5).intValue());
                                    default:
                                        return AbstractC3531s.m10425I0(interfaceC28601c14, ((Integer) obj5).intValue());
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R50);
                    }
                    Function1 function3 = (Function1) objM87133R50;
                    final C16351i c16351i2 = c16351i;
                    boolean zM87157i20 = c28655q.m87157i(c16351i2);
                    Object objM87133R51 = c28655q.m87133R();
                    if (zM87157i20 || objM87133R51 == obj3) {
                        final int i34 = 0;
                        objM87133R51 = new InterfaceC4339a() { // from class: bp0.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i34) {
                                    case 0:
                                        return AbstractC3531s.m10427J0(c16351i2);
                                    default:
                                        return AbstractC3531s.m10409A0(c16351i2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R51);
                    }
                    InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R51;
                    boolean zM87157i21 = c28655q.m87157i(c4656v4);
                    Object objM87133R52 = c28655q.m87133R();
                    if (zM87157i21 || objM87133R52 == obj3) {
                        objM87133R52 = new C3533u(c4656v4, 1);
                        c28655q.m87172p0(objM87133R52);
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R52;
                    boolean zM87157i22 = c28655q.m87157i(interfaceC13399eM37842a) | c28655q.m87157i(interfaceC12251g2);
                    Object objM87133R53 = c28655q.m87133R();
                    if (zM87157i22 || objM87133R53 == obj3) {
                        objM87133R53 = new C0134l(c3, interfaceC13399eM37842a, interfaceC12251g2);
                        c28655q.m87172p0(objM87133R53);
                    }
                    C28655q c28655q4 = c28655q;
                    AbstractC11009x0.m29451S(c4656v4, c32645n0, f24, fM29390e, z25, fM29389d, str, maxLines, zM29394i, jFloatToRawIntBits, f19, fM10456Y, f37, z29, z29, f15, modifierM3371b, modifierM29361i, zBooleanValue, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, interfaceC4339a10, c11006wM10488j0, function3, null, interfaceC4339a11, interfaceC4339a12, (InterfaceC4339a) objM87133R53, c28655q4, C4656v0.f18980q | (C32645n0.f135304t << 3), 0, 0, AndroidSDKConstants.FLAG_MUTABLE);
                    c28655q = c28655q4;
                    c28655q.m87179t();
                }
            } else {
                z4 = z27;
            }
            if (c13404jM37826b3 != null) {
                fingerprint = c13404jM37826b3.getFingerprint();
            } else {
                fingerprint = null;
            }
            if (fingerprint != null) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = z28;
            boolean zIsFeatureEnabled3 = featureFlagChecker.isFeatureEnabled("aix-coach-drawer");
            if (c13404jM37826b3 != null) {
                fingerprint2 = c13404jM37826b3.getFingerprint();
            } else {
                fingerprint2 = null;
            }
            final boolean zM10519t2 = m10519t1(zIsFeatureEnabled3, fingerprint2, type);
            if (z13) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (c13404jM37826b3 != null) {
                strM37869a = AbstractC13405k.m37869a(c13404jM37826b3);
            } else {
                strM37869a = null;
            }
            zM87153g = c28655q.m87153g(strM37869a);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                if (c13404jM37826b3 != null) {
                    objM87133R = AbstractC10969j0.m29172f1(c13404jM37826b3);
                } else {
                    objM87133R = null;
                }
                c28655q.m87172p0(objM87133R);
            } else {
                if (c13404jM37826b3 != null) {
                    objM87133R = AbstractC10969j0.m29172f1(c13404jM37826b3);
                } else {
                    objM87133R = null;
                }
                c28655q.m87172p0(objM87133R);
            }
            C32645n0 c32645n1 = (C32645n0) objM87133R;
            if (z15) {
                c28655q.m87150e0(304171647);
                c28655q.m87173q(false);
                c4656v0 = null;
            } else {
                c28655q.m87150e0(304171647);
                c28655q.m87173q(false);
                c4656v0 = null;
            }
            fMo743q0 = interfaceC39171c.mo743q0(configuration.screenHeightDp);
            f14 = f14063a;
            fMo743q1 = interfaceC39171c.mo743q0(f14);
            if (m10456Y(interfaceC28690z7) > 0.0f) {
                fM10456Y = m10456Y(interfaceC28690z7);
            } else {
                fM10456Y = fMo743q1;
            }
            if (m10464b0(interfaceC28690z8) > 0.0f) {
                fM10464b0 = m10464b0(interfaceC28690z8);
            } else {
                fM10464b0 = fMo743q1;
            }
            if (zM37871c) {
                fM10476f0 = m10476f0(interfaceC28690z10);
            } else {
                fM10476f0 = 0.0f;
            }
            fM29496j1 = AbstractC11009x0.m29496j1(fMo743q0, fM10476f0, zM37871c) - fM10464b0;
            f15 = fM10476f0;
            if (fM29496j1 < 1.0f) {
                fM29496j1 = 1.0f;
            }
            f16 = 0.39999998f * fMo743q0;
            if (f16 < 1.0f) {
                f16 = 1.0f;
            }
            if (zM37871c) {
                f17 = f15;
            } else {
                f17 = 0.100000024f * fMo743q0;
            }
            if (f17 < 1.0f) {
                f17 = 1.0f;
            }
            boolean z210 = zM37871c;
            c10998tM29406c = AbstractC11004v.m29406c(fM29496j1, f16, fMo743q0 * 0.08f, f17, c28655q, 0, 0);
            c28655q = c28655q;
            if (c13404jM37826b3 != null) {
                strM37869a2 = AbstractC13405k.m37869a(c13404jM37826b3);
            } else {
                strM37869a2 = null;
            }
            zM87153g2 = c28655q.m87153g(strM37869a2);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = AbstractC31061c.m95646v(0, c28655q);
            } else {
                objM87133R2 = AbstractC31061c.m95646v(0, c28655q);
            }
            InterfaceC28593a1 interfaceC28593a6 = (InterfaceC28593a1) objM87133R2;
            if (c13404jM37826b3 != null) {
                strM37869a3 = AbstractC13405k.m37869a(c13404jM37826b3);
            } else {
                strM37869a3 = null;
            }
            zM87153g3 = c28655q.m87153g(strM37869a3);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g3) {
                objM87133R3 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c15 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
            fM29391f = c10998tM29406c.m29391f();
            float fM29390e2 = c10998tM29406c.m29390e();
            float fM29387b2 = c10998tM29406c.m29387b();
            interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC12889b.m36269e();
                c28655q.m87172p0(objM87133R5);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R5;
            zM87157i = c28655q.m87157i(interfaceC15237i);
            objM87133R6 = c28655q.m87133R();
            if (zM87157i) {
                interfaceC16439p3 = null;
                objM87133R6 = new n(interfaceC21083i, interfaceC15237i, null);
                c28655q.m87172p0(objM87133R6);
            } else {
                interfaceC16439p3 = null;
                objM87133R6 = new n(interfaceC21083i, interfaceC15237i, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, interfaceC21083i);
            C16435p draggableState3 = c10998tM29406c.getDraggableState();
            EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
            CoachSurfaceType coachSurfaceType2 = type;
            Modifier modifierM3371b2 = AbstractC1096a.m3371b(draggableState3, zM10519t2, interfaceC21083i, interfaceC16439p3, 48);
            C16435p draggableState4 = c10998tM29406c.getDraggableState();
            zM87157i2 = c28655q.m87157i(interfaceC15237i);
            objM87133R7 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R7 = new u(interfaceC15237i);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new u(interfaceC15237i);
                c28655q.m87172p0(objM87133R7);
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM29361i2 = AbstractC10995s.m29361i(c2314t2, draggableState4, (InterfaceC4339a) objM87133R7, c28655q, 6);
            objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R8);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R8;
            if (c13404jM37826b3 != null) {
                strM37869a4 = AbstractC13405k.m37869a(c13404jM37826b3);
            } else {
                strM37869a4 = null;
            }
            zM87153g4 = c28655q.m87153g(c10998tM29406c) | c28655q.m87155h(z14);
            objM87133R9 = c28655q.m87133R();
            if (zM87153g4) {
                interfaceC28601c3 = interfaceC28601c10;
                interfaceC28690z0 = interfaceC28690z6;
                interfaceC28690z1 = interfaceC28690z7;
                interfaceC28690z2 = interfaceC28690z8;
                interfaceC28690z3 = interfaceC28690z10;
                objM87133R9 = new o(c10998tM29406c, z14, interfaceC28601c3, interfaceC28690z0, interfaceC28690z1, interfaceC28690z2, interfaceC28690z3, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R9);
            } else {
                interfaceC28601c3 = interfaceC28601c10;
                interfaceC28690z0 = interfaceC28690z6;
                interfaceC28690z1 = interfaceC28690z7;
                interfaceC28690z2 = interfaceC28690z8;
                interfaceC28690z3 = interfaceC28690z10;
                objM87133R9 = new o(c10998tM29406c, z14, interfaceC28601c3, interfaceC28690z0, interfaceC28690z1, interfaceC28690z2, interfaceC28690z3, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, strM37869a4);
            Integer numValueOf2 = Integer.valueOf(configuration.orientation);
            zM87157i3 = c28655q.m87157i(configuration) | c28655q.m87153g(c10998tM29406c) | c28655q.m87155h(z14);
            objM87133R10 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R10 = new p(configuration, c10998tM29406c, z14, null);
                c28655q.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new p(configuration, c10998tM29406c, z14, null);
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R10, numValueOf2);
            Boolean boolValueOf6 = Boolean.valueOf(z14);
            zM87153g5 = c28655q.m87153g(c10998tM29406c) | c28655q.m87155h(z14);
            objM87133R11 = c28655q.m87133R();
            if (zM87153g5) {
                obj = null;
                objM87133R11 = new q(c10998tM29406c, z14, null);
                c28655q.m87172p0(objM87133R11);
            } else {
                obj = null;
                objM87133R11 = new q(c10998tM29406c, z14, null);
                c28655q.m87172p0(objM87133R11);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R11, boolValueOf6);
            Boolean boolValueOf7 = Boolean.valueOf(z14);
            zM87153g6 = c28655q.m87153g(c10998tM29406c) | c28655q.m87155h(z14) | c28655q.m87157i(interfaceC40915c4) | c28655q.m87157i(interfaceC12251g5);
            Object objM87133R310 = c28655q.m87133R();
            if (zM87153g6) {
                c10998t = c10998tM29406c;
                rVar = new r(c10998t, z14, interfaceC40915c4, interfaceC12251g5, null);
                c28655q.m87172p0(rVar);
            } else {
                c10998t = c10998tM29406c;
                rVar = new r(c10998t, z14, interfaceC40915c4, interfaceC12251g5, null);
                c28655q.m87172p0(rVar);
            }
            AbstractC28683x.m87254h(c10998t, boolValueOf7, (InterfaceC4351m) rVar, c28655q);
            Boolean boolValueOf8 = Boolean.valueOf(m10444S(interfaceC28601c1M87261o).getIsBottomSheetVisible());
            zM87153g7 = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87153g(c10998t) | c28655q.m87155h(z14);
            objM87133R12 = c28655q.m87133R();
            if (zM87153g7) {
                objM87133R12 = new s(c10998t, z14, interfaceC28601c1M87261o, null);
                c28655q.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new s(c10998t, z14, interfaceC28601c1M87261o, null);
                c28655q.m87172p0(objM87133R12);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, boolValueOf8);
            m10439P0(m10444S(interfaceC28601c1M87261o), c28655q, C13398d.f46924i);
            if (m10435N0(interfaceC28690z5) < 0.25f) {
                float fM10435N1 = 1.0f - (m10435N0(interfaceC28690z5) / 0.25f);
                f18 = fM10435N1 * fM10435N1 * fM10435N1 * fM10435N1 * fM10435N1;
            } else {
                f18 = 0.0f;
            }
            fM10486i1 = m10486i1(zIsFeatureEnabled, interfaceC39171c, c28655q, 0);
            iM10477f1 = m10477f1(zIsFeatureEnabled, m10497m0(interfaceC28593a3), interfaceC39171c, c28655q, 0);
            interfaceC28601c4 = interfaceC28601c1M87261o;
            if (C16617b.m47187c(m10448U(interfaceC28601c3), 9205357640488583168L)) {
                jFloatToRawIntBits = m10448U(interfaceC28601c3);
            } else {
                float fMo743q6 = interfaceC39171c.mo743q0(configuration.screenWidthDp);
                float fMo743q7 = interfaceC39171c.mo743q0(configuration.screenHeightDp);
                float fMo743q8 = interfaceC39171c.mo743q0(f14);
                float f210 = 8;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits((fMo743q6 - fMo743q8) - interfaceC39171c.mo743q0(((float) 1.5d) * f210))) << 32) | (((long) Float.floatToRawIntBits(((fMo743q7 - fMo743q8) - interfaceC39171c.mo743q0(1 * f210)) - fM10486i1)) & 4294967295L);
            }
            if (m10452W(interfaceC28690z0) > 0.0f) {
                fMo743q1 = m10452W(interfaceC28690z0);
            }
            f19 = fMo743q1;
            if (aVar != null) {
                strM37838g = aVar.getPreviewText();
            } else {
                strM37838g = null;
            }
            if (strM37838g == null) {
                strM37838g = "";
            }
            String str3 = strM37838g;
            if (coachEntry2 != null) {
                maxLines = null;
            } else {
                maxLines = null;
            }
            if (fM29391f <= 0.0f) {
                z16 = true;
            } else {
                z16 = true;
            }
            zM10495l1 = m10495l1(c10998t.m29392g(), m10494l0(interfaceC28601c1));
            Boolean boolValueOf9 = Boolean.valueOf(z16);
            zM87155h = c28655q.m87155h(z16);
            objM87133R13 = c28655q.m87133R();
            if (zM87155h) {
                obj2 = null;
                objM87133R13 = new t(z16, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R13);
            } else {
                obj2 = null;
                objM87133R13 = new t(z16, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R13);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R13, boolValueOf9);
            zM87153g8 = c28655q.m87153g(c10998t) | c28655q.m87157i(interfaceC12251g5) | c28655q.m87157i(interfaceC40915c4);
            Object objM87133R311 = c28655q.m87133R();
            if (zM87153g8) {
                InterfaceC40915c interfaceC40915c7 = interfaceC40915c4;
                bVar = new b(c10998t, interfaceC12251g5, interfaceC28601c2, interfaceC40915c7, null);
                interfaceC12251g = interfaceC12251g5;
                interfaceC28601c5 = interfaceC28601c2;
                interfaceC40915c4 = interfaceC40915c7;
                c28655q.m87172p0(bVar);
            } else {
                InterfaceC40915c interfaceC40915c8 = interfaceC40915c4;
                bVar = new b(c10998t, interfaceC12251g5, interfaceC28601c2, interfaceC40915c8, null);
                interfaceC12251g = interfaceC12251g5;
                interfaceC28601c5 = interfaceC28601c2;
                interfaceC40915c4 = interfaceC40915c8;
                c28655q.m87172p0(bVar);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) bVar, c10998t);
            c13404jM37826b = m10444S(interfaceC28601c4).getCurrentScreenContext();
            if (c13404jM37826b != null) {
                c28655q.m87150e0(314392564);
                c28655q.m87144b0(-1652425986, AbstractC13405k.m37869a(c13404jM37826b));
                C10978m0 c10978m1 = new C10978m0(m10444S(interfaceC28601c4).getIsBottomSheetVisible(), jFloatToRawIntBits, c13404jM37826b, f19, null, 0.0f, null, m10444S(interfaceC28601c4).getProactiveState().getIsPrefetchEnabled(), iM10477f1, c13404jM37826b.getShouldOpenFullSize(), c13404jM37826b.getDrawerPresentation(), false, 2160, null);
                boolean zM10503o1 = m10503o0(interfaceC28601c5);
                zM87157i5 = c28655q.m87157i(c3513a2);
                objM87133R15 = c28655q.m87133R();
                if (zM87157i5) {
                    objM87133R15 = new c(c3513a2);
                    c28655q.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new c(c3513a2);
                    c28655q.m87172p0(objM87133R15);
                }
                InterfaceC21467g interfaceC21467g4 = (InterfaceC21467g) objM87133R15;
                zM87157i6 = c28655q.m87157i(c3513a2);
                objM87133R16 = c28655q.m87133R();
                if (zM87157i6) {
                    objM87133R16 = new d(c3513a2);
                    c28655q.m87172p0(objM87133R16);
                } else {
                    objM87133R16 = new d(c3513a2);
                    c28655q.m87172p0(objM87133R16);
                }
                InterfaceC21467g interfaceC21467g5 = (InterfaceC21467g) objM87133R16;
                zM87157i7 = c28655q.m87157i(c3513a2) | c28655q.m87157i(c13404jM37826b) | c28655q.m87157i(interfaceC12251g);
                objM87133R17 = c28655q.m87133R();
                if (zM87157i7) {
                    objM87133R17 = new C0467z0(c3513a2, c13404jM37826b, interfaceC12251g, 1);
                    c28655q.m87172p0(objM87133R17);
                } else {
                    objM87133R17 = new C0467z0(c3513a2, c13404jM37826b, interfaceC12251g, 1);
                    c28655q.m87172p0(objM87133R17);
                }
                Function1 function4 = (Function1) objM87133R17;
                objM87133R18 = c28655q.m87133R();
                if (objM87133R18 == c28676v0) {
                    final int i110 = 0;
                    objM87133R18 = new Function1() { // from class: bp0.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i110) {
                                case 0:
                                    return AbstractC3531s.m10518t0(interfaceC28690z5, ((Float) obj5).floatValue());
                                default:
                                    return AbstractC3531s.m10527w0(interfaceC28690z5, (C39180l) obj5);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R18);
                }
                Function1 function5 = (Function1) objM87133R18;
                zM87157i8 = c28655q.m87157i(c3513a2);
                objM87133R19 = c28655q.m87133R();
                if (zM87157i8) {
                    objM87133R19 = new C3520h(0, c3513a2, interfaceC28601c5);
                    c28655q.m87172p0(objM87133R19);
                } else {
                    objM87133R19 = new C3520h(0, c3513a2, interfaceC28601c5);
                    c28655q.m87172p0(objM87133R19);
                }
                z17 = zM10495l1;
                c13404j = c13404jM37826b;
                InterfaceC40915c interfaceC40915c9 = interfaceC40915c4;
                interfaceC28601c6 = interfaceC28601c1;
                c10998t2 = c10998t;
                C4656v0 c4656v9 = c4656v0;
                c3513a = c3513a2;
                z18 = z14;
                r10 = 0;
                AbstractC10969j0.m29119I(c10978m1, function4, interfaceC40915c9, null, function5, (Function3) objM87133R19, zM10503o1, (InterfaceC4351m) interfaceC21467g4, (InterfaceC4351m) interfaceC21467g5, z17, c4656v9, null, c28655q, C13404j.f46947x | 24576, C4656v0.f18980q, 2056);
                interfaceC40915c = interfaceC40915c9;
                c4656v1 = c4656v9;
                c28655q = c28655q;
                c28655q.m87173q(false);
                c28655q.m87179t();
            } else {
                interfaceC28601c6 = interfaceC28601c1;
                c10998t2 = c10998t;
                interfaceC40915c = interfaceC40915c4;
                c4656v1 = c4656v0;
                c3513a = c3513a2;
                c13404j = c13404jM37826b;
                r10 = 0;
                z17 = zM10495l1;
                z18 = z14;
                c28655q.m87150e0(315959955);
                c28655q.m87179t();
            }
            if (m10444S(interfaceC28601c4).getIsFabVisible()) {
                interfaceC40915c2 = interfaceC40915c;
                z17 = z17;
                c4656v2 = c4656v1;
                c13404j2 = c13404jM37826b3;
                z19 = z18;
                interfaceC2994c0 = interfaceC2994c2;
                c16351i = c16351iM118972a0;
                z24 = r0;
                interfaceC12251g2 = interfaceC12251g;
                interfaceC28593a1 = r47;
                interfaceC28601c7 = r56;
                f24 = r57;
                obj3 = r9;
                c3 = 3;
                c10998t3 = c10998t2;
                c28655q.m87150e0(326171603);
                c28655q.m87179t();
            } else {
                interfaceC40915c2 = interfaceC40915c;
                z17 = z17;
                c4656v2 = c4656v1;
                c13404j2 = c13404jM37826b3;
                z19 = z18;
                interfaceC2994c0 = interfaceC2994c2;
                c16351i = c16351iM118972a0;
                z24 = r0;
                interfaceC12251g2 = interfaceC12251g;
                interfaceC28593a1 = r47;
                interfaceC28601c7 = r56;
                f24 = r57;
                obj3 = r9;
                c3 = 3;
                c10998t3 = c10998t2;
                c28655q.m87150e0(326171603);
                c28655q.m87179t();
            }
            Boolean boolValueOf10 = Boolean.valueOf(z17);
            interfaceC40915c3 = interfaceC40915c2;
            z25 = z17;
            zM87157i4 = c28655q.m87157i(interfaceC40915c3) | c28655q.m87155h(z25);
            objM87133R14 = c28655q.m87133R();
            if (zM87157i4) {
                objM87133R14 = new i(interfaceC40915c3, z25, null);
                c28655q.m87172p0(objM87133R14);
            } else {
                objM87133R14 = new i(interfaceC40915c3, z25, null);
                c28655q.m87172p0(objM87133R14);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R14, boolValueOf10);
            if (z16) {
                c28655q.m87150e0(328801395);
                c28655q.m87179t();
            } else {
                c28655q.m87150e0(328801395);
                c28655q.m87179t();
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.m87205f(new C0131i(i13, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C23454a0 m10441Q0(C13398d c13398d, int i13, Composer composer, int i14) {
        m10439P0(c13398d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m10442R(InterfaceC12251g interfaceC12251g, boolean z4) {
        if (z4) {
            interfaceC12251g.mo34146u();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C13398d m10444S(InterfaceC28670t2 interfaceC28670t2) {
        return (C13398d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: T */
    private static final void m10446T(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: renamed from: U */
    private static final long m10448U(InterfaceC28601c1 interfaceC28601c1) {
        return ((C16617b) interfaceC28601c1.getValue()).f63937a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m10450V(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C16617b(j7));
    }

    /* JADX INFO: renamed from: W */
    private static final float m10452W(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m10454X(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: renamed from: Y */
    private static final float m10456Y(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m10458Z(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC28620h0 m10461a0(InterfaceC12251g interfaceC12251g, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new v(interfaceC12251g);
    }

    /* JADX INFO: renamed from: b0 */
    private static final float m10464b0(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m10467c0(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: renamed from: c1 */
    private static final TextResource m10468c1(boolean z4, InterfaceC13399e interfaceC13399e, boolean z13, EnumC13401g enumC13401g) {
        return (z4 && !z13 && (interfaceC13399e instanceof InterfaceC13399e.e) && enumC13401g == EnumC13401g.ANALYZING) ? AbstractC8693b.m21277k(AbstractC28054a.f113199a) : AbstractC8693b.m21267a();
    }

    /* JADX INFO: renamed from: d0 */
    private static final float m10470d0(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: d1 */
    private static final TextResource m10471d1(boolean z4, InterfaceC13399e interfaceC13399e, boolean z13, EnumC13400f enumC13400f) {
        return (z4 && !z13 && (interfaceC13399e instanceof InterfaceC13399e.a) && enumC13400f == EnumC13400f.PREVIEW) ? AbstractC8693b.m21278l(((InterfaceC13399e.a) interfaceC13399e).getPreviewText()) : AbstractC8693b.m21267a();
    }

    /* JADX INFO: renamed from: e0 */
    private static final void m10473e0(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: renamed from: e1 */
    public static final float m10474e1(boolean z4, float f13, float f14) {
        return (!z4 || f13 <= 0.0f) ? f14 : f13;
    }

    /* JADX INFO: renamed from: f0 */
    private static final float m10476f0(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: f1 */
    private static final int m10477f1(boolean z4, int i13, InterfaceC39171c interfaceC39171c, Composer composer, int i14) {
        WeakHashMap weakHashMap = C22944c2.f90553v;
        int i15 = C22949e.m66712e(composer).f90556c.m66705e().f151452d;
        return (z4 && i15 == 0) ? i13 : i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m10479g0(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: renamed from: g1 */
    public static final C36582j0 m10480g1(C13402h proactiveState, boolean z4, EnumC13403i realtimeVoiceState, CoachEntry coachEntry) {
        EnumC13401g enumC13401gM10513r1;
        CoachEntryData data;
        AbstractC22676k.m65750j(proactiveState, "proactiveState");
        AbstractC22676k.m65750j(realtimeVoiceState, "realtimeVoiceState");
        InterfaceC13399e interfaceC13399eM37842a = proactiveState.getProactiveAnimationState();
        boolean zM37843b = proactiveState.getIsPrefetchEnabled();
        int i13 = z.f14163b[realtimeVoiceState.ordinal()];
        if (i13 == 1) {
            return new C36582j0(true, false, AbstractC8693b.m21277k(AbstractC28054a.f113201c), AbstractC8693b.m21267a(), null, 0.0f, 0.0f, false, 240, null);
        }
        if (i13 == 2 || i13 == 3) {
            return new C36582j0(true, false, null, null, AbstractC8693b.m21277k(AbstractC28054a.f113203e), 0.0f, 0.0f, false, 236, null);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC13400f enumC13400fM37824a = AbstractC13397c.m37824a(coachEntry);
        if (enumC13400fM37824a == null) {
            enumC13400fM37824a = m10516s1(interfaceC13399eM37842a);
        }
        if (coachEntry == null || (data = coachEntry.getData()) == null || (enumC13401gM10513r1 = data.getLoadStyle()) == null) {
            enumC13401gM10513r1 = m10513r1(interfaceC13399eM37842a);
        }
        boolean zM10522u1 = m10522u1(zM37843b, interfaceC13399eM37842a, enumC13401gM10513r1);
        boolean zM10525v1 = m10525v1(zM37843b, interfaceC13399eM37842a, enumC13400fM37824a);
        TextResource textResourceM10468c1 = m10468c1(zM37843b, interfaceC13399eM37842a, z4, enumC13401gM10513r1);
        TextResource textResourceM10471d1 = m10471d1(zM37843b, interfaceC13399eM37842a, z4, enumC13400fM37824a);
        InterfaceC13399e.a aVar = interfaceC13399eM37842a instanceof InterfaceC13399e.a ? (InterfaceC13399e.a) interfaceC13399eM37842a : null;
        return new C36582j0(zM10522u1, zM10525v1, textResourceM10468c1, textResourceM10471d1, null, 0.0f, 0.0f, aVar != null && aVar.getIsCollapsed(), 112, null);
    }

    /* JADX INFO: renamed from: h0 */
    private static final int m10482h0(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ C36582j0 m10483h1(C13402h c13402h, boolean z4, EnumC13403i enumC13403i, CoachEntry coachEntry, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            enumC13403i = EnumC13403i.Inactive;
        }
        if ((i13 & 8) != 0) {
            coachEntry = null;
        }
        return m10480g1(c13402h, z4, enumC13403i, coachEntry);
    }

    /* JADX INFO: renamed from: i0 */
    private static final void m10485i0(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: i1 */
    private static final float m10486i1(boolean z4, InterfaceC39171c interfaceC39171c, Composer composer, int i13) {
        if (!z4) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1002513500);
            c28655q.m87173q(false);
            return interfaceC39171c.mo743q0(80);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1002444866);
        WeakHashMap weakHashMap = C22944c2.f90553v;
        float f13 = C22949e.m66712e(c28655q2).f90558e.m66705e().f151452d;
        c28655q2.m87173q(false);
        return f13;
    }

    /* JADX INFO: renamed from: j0 */
    private static final C11006w m10488j0(InterfaceC28601c1 interfaceC28601c1) {
        return (C11006w) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: j1 */
    public static final C13404j m10489j1(C13404j c13404j) {
        if (c13404j != null) {
            return C13404j.m37844b(c13404j, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, ChatEntrypointExperience.QUICK_VOICE, null, null, false, 7864319, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    private static final void m10491k0(InterfaceC28601c1 interfaceC28601c1, C11006w c11006w) {
        interfaceC28601c1.setValue(c11006w);
    }

    /* JADX INFO: renamed from: k1 */
    public static final AbstractC12249e m10492k1(EnumC10974l previous, EnumC10974l current, String screenIdentifier, boolean z4) {
        AbstractC22676k.m65750j(previous, "previous");
        AbstractC22676k.m65750j(current, "current");
        AbstractC22676k.m65750j(screenIdentifier, "screenIdentifier");
        boolean zM10501n1 = m10501n1(previous);
        boolean z13 = current == EnumC10974l.Preview || current == EnumC10974l.Bar;
        if (m10504o1(previous) && current == EnumC10974l.FullDrawer) {
            return new AbstractC12249e.e(screenIdentifier, z4);
        }
        EnumC10974l enumC10974l = EnumC10974l.FullDrawer;
        if (previous == enumC10974l && m10504o1(current)) {
            return new AbstractC12249e.c(screenIdentifier, z4);
        }
        if (zM10501n1 && z13) {
            return new AbstractC12249e.d(screenIdentifier, previous == enumC10974l ? "full" : "half", "drawer_dismiss");
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    private static final boolean m10494l0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l1 */
    public static final boolean m10495l1(EnumC10974l settledDetent, boolean z4) {
        AbstractC22676k.m65750j(settledDetent, "settledDetent");
        return z4 || m10501n1(settledDetent);
    }

    /* JADX INFO: renamed from: m0 */
    private static final int m10497m0(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: m1 */
    public static final boolean m10498m1(EnumC10974l previous, EnumC10974l current) {
        AbstractC22676k.m65750j(previous, "previous");
        AbstractC22676k.m65750j(current, "current");
        return previous == EnumC10974l.Preview && current == EnumC10974l.Bar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m10500n0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final boolean m10501n1(EnumC10974l enumC10974l) {
        return m10504o1(enumC10974l) || enumC10974l == EnumC10974l.FullDrawer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final boolean m10503o0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o1 */
    private static final boolean m10504o1(EnumC10974l enumC10974l) {
        return enumC10974l == EnumC10974l.HalfDrawer || enumC10974l == EnumC10974l.GaugeLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m10506p0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: p1 */
    public static final void m10507p1(InterfaceC40915c interfaceC40915c, boolean z4) {
        if (z4) {
            if (interfaceC40915c != null) {
                interfaceC40915c.mo132624l();
            }
        } else if (interfaceC40915c != null) {
            interfaceC40915c.mo132621b();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private static final void m10509q0(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: q1 */
    public static final void m10510q1(InterfaceC13399e state, InterfaceC12251g globalCoachManager) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        if (state instanceof InterfaceC13399e.e) {
            globalCoachManager.mo34148x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m10512r0(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m10509q0(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r1 */
    private static final EnumC13401g m10513r1(InterfaceC13399e interfaceC13399e) {
        if (interfaceC13399e instanceof InterfaceC13399e.e) {
            return ((InterfaceC13399e.e) interfaceC13399e).getLoadStyle();
        }
        if (interfaceC13399e instanceof InterfaceC13399e.a) {
            return ((InterfaceC13399e.a) interfaceC13399e).getLoadStyle();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m10515s0(C3513a c3513a, C13404j c13404j, InterfaceC12251g interfaceC12251g, String str) {
        c3513a.m10402d(str, c13404j);
        interfaceC12251g.mo34135c();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s1 */
    private static final EnumC13400f m10516s1(InterfaceC13399e interfaceC13399e) {
        if (interfaceC13399e instanceof InterfaceC13399e.e) {
            return ((InterfaceC13399e.e) interfaceC13399e).getOnLoadStyle();
        }
        if (interfaceC13399e instanceof InterfaceC13399e.a) {
            return ((InterfaceC13399e.a) interfaceC13399e).getOnLoadStyle();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m10518t0(InterfaceC28690z0 interfaceC28690z0, float f13) {
        m10446T(interfaceC28690z0, f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t1 */
    public static final boolean m10519t1(boolean z4, String str, CoachSurfaceType coachSurfaceType) {
        return (!z4 || str == null || str.length() == 0 || coachSurfaceType == null || !coachSurfaceType.isBar()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m10521u0(C3513a c3513a, InterfaceC28601c1 interfaceC28601c1, String previewContent, String messageId, boolean z4) {
        AbstractC22676k.m65750j(previewContent, "previewContent");
        AbstractC22676k.m65750j(messageId, "messageId");
        m10506p0(interfaceC28601c1, z4);
        c3513a.m10399a(previewContent, messageId);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u1 */
    private static final boolean m10522u1(boolean z4, InterfaceC13399e interfaceC13399e, EnumC13401g enumC13401g) {
        if (!z4 || !(interfaceC13399e instanceof InterfaceC13399e.e)) {
            return false;
        }
        int i13 = enumC13401g == null ? -1 : z.f14164c[enumC13401g.ordinal()];
        if (i13 != -1) {
            if (i13 == 1 || i13 == 2) {
                return true;
            }
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    private static final float m10524v0(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: v1 */
    private static final boolean m10525v1(boolean z4, InterfaceC13399e interfaceC13399e, EnumC13400f enumC13400f) {
        return z4 && (interfaceC13399e instanceof InterfaceC13399e.a) && enumC13400f == EnumC13400f.GLOW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m10527w0(InterfaceC28690z0 interfaceC28690z0, C39180l c39180l) {
        m10473e0(interfaceC28690z0, (int) (c39180l.f168422a & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m10529x0(InterfaceC28601c1 interfaceC28601c1) {
        m10500n0(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m10531y0(float f13, float f14, C10998t c10998t, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC28690z0 interfaceC28690z2, InterfaceC28690z0 interfaceC28690z3, InterfaceC28690z0 interfaceC28690z4, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        m10450V(interfaceC28601c1, coordinates.mo3523Z(0L));
        m10454X(interfaceC28690z0, (int) (coordinates.mo3541n() >> 32));
        m10458Z(interfaceC28690z1, (int) (coordinates.mo3541n() & 4294967295L));
        if (m10464b0(interfaceC28690z2) == 0.0f || (f13 == 0.0f && f14 == 0.0f && c10998t.m29392g() == EnumC10974l.Preview)) {
            m10467c0(interfaceC28690z2, (int) (coordinates.mo3541n() & 4294967295L));
            if (m10470d0(interfaceC28690z3) > 0.0f) {
                float fM10470d0 = (m10470d0(interfaceC28690z3) - Float.intBitsToFloat((int) (coordinates.mo3523Z(0L) & 4294967295L))) - ((int) (coordinates.mo3541n() & 4294967295L));
                m10479g0(interfaceC28690z4, fM10470d0 >= 0.0f ? fM10470d0 : 0.0f);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m10533z0(boolean z4, C4656v0 c4656v0, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, C10998t c10998t, C13404j c13404j, InterfaceC12251g interfaceC12251g) {
        boolean z13 = z4 && c4656v0 != null;
        if (z13) {
            m10500n0(interfaceC28601c1, true);
        }
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c10998t, z13, c13404j, interfaceC12251g, null), 3);
        return C23454a0.f92919a;
    }
}
