package re1;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2559k4;
import b91.C2886a;
import b91.InterfaceC2887b;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bs2.C3610c;
import c11.C3838e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.exoplayer2.p051ui.StyledPlayerView;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.model.CtaNavigationDestination;
import com.whoop.design.model.EducationVideoType;
import com.whoop.design.model.FeatureEducationCtaButton;
import com.whoop.design.model.FeatureEducationImage;
import com.whoop.design.model.FeatureEducationInlineIcon;
import com.whoop.design.model.FeatureEducationParagraph;
import com.whoop.design.model.FeatureEducationSentence;
import com.whoop.design.model.FeatureEducationVideo;
import com.whoop.design.model.MediaType;
import com.whoop.design.model.ScreenTextStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.MediaHeader;
import com.whoop.educationModels.PodcastPicker;
import com.whoop.educationModels.PodcastPlayer;
import com.whoop.educationModels.StickyButton;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.C9812h;
import com.whoop.profile.view.C9814j;
import d11.AbstractC11471f;
import d11.C11474i;
import d41.AbstractC11679e;
import d41.AbstractC11684j;
import d41.EnumC11681g;
import f01.C13878m;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import hy0.AbstractC17755i2;
import hy0.C17736e;
import ih0.AbstractC18489d0;
import io.C20033m;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import mh.C25540h;
import ne1.AbstractC26598a;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26954j0;
import nw0.C27198e;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import or2.AbstractC28188o1;
import os0.C28308d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.C2853n;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p163g1.AbstractC15005f3;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17918w0;
import p21.AbstractC28752e;
import p21.C28754g;
import p21.InterfaceC28753f;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC23001u;
import p291l0.InterfaceC23013y;
import p292l1.C23108i;
import p309lo.AbstractC24543a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p465rm.C31527e0;
import p465rm.C31533g0;
import p465rm.C31536h0;
import p465rm.C31539i0;
import p465rm.C31541j;
import p465rm.C31545k0;
import p465rm.C31551m0;
import p465rm.C31571u;
import p465rm.InterfaceC31544k;
import p465rm.InterfaceC31582z0;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p730qt2.C30599e;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import p90.C29000h;
import q81.C30047e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qn0.C30515j;
import qz0.AbstractC30795n;
import r61.C30985h;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se1.AbstractC32421a;
import ue1.AbstractC34860c;
import ue1.C34858a;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.AbstractC35684p;
import v41.C35666g;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: re1.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0085\u0001\u0010\u0015\u001a\u00020\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u001d\u001a\u00020\r*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010!\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\"\u001a7\u0010#\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b#\u0010$\u001a!\u0010)\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b)\u0010*\u001a7\u0010+\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b+\u0010$\u001a\u0017\u0010,\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b,\u0010-\u001a+\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\r2\u0006\u0010/\u001a\u00020.2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b2\u00101\u001a+\u00105\u001a\u00020\r2\u0006\u00104\u001a\u0002032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b5\u00106\u001a\u0013\u00107\u001a\u00020\u0013*\u00020\u0001H\u0002¢\u0006\u0004\b7\u00108\u001a\u001d\u0010:\u001a\u00020\u0013*\u00020\u00012\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0015\u0010<\u001a\u00020\u0013*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b<\u00108¨\u0006@²\u0006\f\u0010>\u001a\u00020=8\nX\u008a\u0084\u0002²\u0006\u000e\u0010?\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "Lcom/whoop/design/model/FeatureEducationParagraph;", "sections", "Lcom/whoop/design/util/TextResource;", "navBarTitle", "Lcom/whoop/educationModels/MediaHeader;", "mediaHeader", "Lcom/whoop/educationModels/StickyButton;", "stickyButton", "Lue1/a;", "paddingCalculator", "Lkotlin/Function1;", "", "Ll83/a0;", "scrollDepthAnalyticsEvent", "Lne1/a;", "onNavigationEvent", "Lkotlin/Function0;", "podcastAnalyticsEvent", "", "isArticleTileMediaCardEnabled", "P", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;Lue1/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V", "Ll0/u;", "Lf0/r1;", "scrollState", "", "alphaMultiplier", "onLeftButtonClick", "n0", "(Ll0/u;Lf0/r1;FLc93/a;Landroidx/compose/runtime/Composer;II)V", "section", "addGapBeforeFollowingTitle", "G", "(Lcom/whoop/design/model/FeatureEducationParagraph;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V", "Y", "(Lcom/whoop/design/model/FeatureEducationParagraph;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "", QueryParams.URL, "Lcom/whoop/design/model/EducationVideoType;", "type", "b0", "(Ljava/lang/String;Lcom/whoop/design/model/EducationVideoType;Landroidx/compose/runtime/Composer;I)V", "h0", "E", "(Lcom/whoop/design/model/FeatureEducationParagraph;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/model/FeatureEducationSentence;", "sentence", "J", "(Lcom/whoop/design/model/FeatureEducationSentence;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "M", "Lcom/whoop/design/model/FeatureEducationCtaButton;", "ctaButton", "B", "(Lcom/whoop/design/model/FeatureEducationCtaButton;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "q0", "(Lcom/whoop/design/model/FeatureEducationParagraph;)Z", "nextSection", "r0", "(Lcom/whoop/design/model/FeatureEducationParagraph;Lcom/whoop/design/model/FeatureEducationParagraph;)Z", "s0", "Lv41/g;", "bottomSheetViewState", "isPlayerBuffering", "education_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31323j {

    /* JADX INFO: renamed from: re1.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.education.view.EducationSuccessScreenKt$EducationSuccessScreen$2$1$1$1$1$1$1", m100430f = "EducationSuccessScreen.kt", m100431l = {162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f128908w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f128909x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128909x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f128909x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f128908w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f128909x;
                this.f128908w = 1;
                if (c15199y3.m43225f(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: re1.j$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"re1/j$b", "Lrm/z0;", "", "playbackState", "Ll83/a0;", "onPlaybackStateChanged", "(I)V", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC31582z0 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f128910w;

        public b(InterfaceC28601c1 interfaceC28601c1) {
            this.f128910w = interfaceC28601c1;
        }

        @Override // p465rm.InterfaceC31582z0
        public void onPlaybackStateChanged(int playbackState) {
            AbstractC31323j.m96360d0(this.f128910w, playbackState == 2);
        }
    }

    /* JADX INFO: renamed from: re1.j$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"re1/j$c", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC31544k f128911a;

        public c(InterfaceC31544k interfaceC31544k) {
            this.f128911a = interfaceC31544k;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            ((C31571u) this.f128911a).m97219n0();
        }
    }

    /* JADX INFO: renamed from: re1.j$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f128912a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f128913b;

        static {
            int[] iArr = new int[EducationVideoType.values().length];
            try {
                iArr[EducationVideoType.GIF_LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EducationVideoType.GIF_PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EducationVideoType.STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f128912a = iArr;
            int[] iArr2 = new int[MediaType.values().length];
            try {
                iArr2[MediaType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MediaType.LOTTIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f128913b = iArr2;
        }
    }

    /* JADX INFO: renamed from: B */
    public static final void m96328B(FeatureEducationCtaButton ctaButton, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(ctaButton, "ctaButton");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1754096519);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(ctaButton) : c28655q.m87157i(ctaButton) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            EnumC27284v enumC27284v = EnumC27284v.TextSmall;
            String strM21274h = AbstractC8693b.m21274h(ctaButton.getText(), c28655q, TextResource.$stable);
            long jMo134584toComposableColorWaAFU9c = ctaButton.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            boolean z4 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(ctaButton))) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C30599e(ctaButton, onNavigationEvent, 14);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(null, enumC27284v, strM21274h, false, jMo134584toComposableColorWaAFU9c, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 105);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(ctaButton, onNavigationEvent, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m96329C(FeatureEducationCtaButton featureEducationCtaButton, Function1 function1) {
        CtaNavigationDestination clickAction = featureEducationCtaButton.getClickAction();
        if (clickAction != null) {
            function1.invoke(new AbstractC26598a.b(clickAction));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m96330D(FeatureEducationCtaButton featureEducationCtaButton, Function1 function1, int i13, Composer composer, int i14) {
        m96328B(featureEducationCtaButton, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final void m96331E(FeatureEducationParagraph section, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(section, "section");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2135423311);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(section) : c28655q2.m87157i(section) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            FeatureEducationImage image = section.getImage();
            if (image == null) {
                c28655q2.m87150e0(-659617324);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-659617323);
                int i15 = d.f128913b[image.getMediaType().ordinal()];
                C2314t c2314t = C2314t.f9131w;
                if (i15 == 1) {
                    c28655q = c28655q2;
                    c28655q.m87150e0(2112387626);
                    C25540h c25540h = new C25540h((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
                    c25540h.f100079c = image.getUrl();
                    float f13 = 8;
                    float f14 = 4;
                    AbstractC11894a.m31954c(c25540h.m75117a(), null, AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) section.getInsets().getTop()) * f13, 0.0f, ((float) section.getInsets().getBottom()) * f13, 5)), f14, f14), null, C39102j.f168202d, 0.0f, c28655q, 1572912, 952);
                    c28655q.m87173q(false);
                } else {
                    if (i15 != 2) {
                        throw AbstractC11895b.m32003v(-208954819, c28655q2, false);
                    }
                    c28655q2.m87150e0(2113038347);
                    float f15 = 8;
                    c28655q = c28655q2;
                    AbstractC35684p.m113047h(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(300, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) section.getInsets().getTop()) * f15, 0.0f, ((float) section.getInsets().getBottom()) * f15, 5))), InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(image.getUrl())), false, 0.0f, 0, null, null, null, null, c28655q, 0, 508);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(section, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m96332F(FeatureEducationParagraph featureEducationParagraph, int i13, Composer composer, int i14) {
        m96331E(featureEducationParagraph, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:106:0x022d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0231  */
    /* JADX WARN: Code duplicated, block: B:110:0x0244  */
    /* JADX WARN: Code duplicated, block: B:112:0x0252  */
    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0285  */
    /* JADX WARN: Code duplicated, block: B:121:0x0287  */
    /* JADX WARN: Code duplicated, block: B:124:0x028f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0293  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[LOOP:2: B:61:0x00b6->B:152:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x0126  */
    /* JADX WARN: Code duplicated, block: B:83:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0188  */
    /* JADX WARN: Code duplicated, block: B:92:0x0193  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c9  */
    /* JADX INFO: renamed from: G */
    public static final void m96333G(FeatureEducationParagraph section, Function1 onNavigationEvent, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        boolean z19;
        boolean z24;
        List<FeatureEducationSentence> sentences;
        Iterator<T> it;
        boolean z25;
        boolean z26;
        float f13;
        float f14;
        float f15;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        FeatureEducationCtaButton ctaButton;
        List<InterfaceC25312u> ctas;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean z27;
        C11474i c11474i;
        boolean z28;
        boolean z29;
        Object objM87133R;
        C23454a0 c23454a0;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(section, "section");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-580890336);
        int i18 = (i13 & 6) == 0 ? ((i13 & 8) == 0 ? c28655q.m87153g(section) : c28655q.m87157i(section) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i18 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                i18 |= c28655q.m87155h(z14) ? 256 : 128;
            }
            i15 = i14 & 8;
            if (i15 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i18 |= i16;
                }
                z15 = false;
                if ((i18 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i18 & 1, z16)) {
                    if (i19 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    int i24 = i18;
                    if (i15 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    sentences = section.getSentences();
                    if (!(sentences instanceof Collection) && sentences.isEmpty()) {
                        z26 = false;
                        break;
                    }
                    it = sentences.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z26 = false;
                            break;
                        }
                        if (((FeatureEducationSentence) it.next()).getDivider() != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (z25) {
                            z26 = true;
                            break;
                        }
                    }
                    if (z19) {
                        float f16 = 8;
                        f14 = f16 * f16;
                    } else {
                        if (z26) {
                            f13 = 2;
                        } else {
                            f13 = 4;
                        }
                        f14 = f13 * 8;
                    }
                    float f17 = f14;
                    f15 = 8;
                    float leading = ((float) section.getInsets().getLeading()) * f15;
                    float trailing = ((float) section.getInsets().getTrailing()) * f15;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, leading, 0.0f, trailing, f17, 2);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
                    int i25 = FeatureEducationParagraph.$stable | (i24 & 14);
                    i17 = i24 & 112;
                    m96351Y(section, onNavigationEvent, z24, c28655q, i25 | i17 | ((i24 >> 3) & 896), 0);
                    m96331E(section, c28655q, i25);
                    c28655q.m87150e0(-313939641);
                    for (FeatureEducationSentence featureEducationSentence : section.getSentences()) {
                        if (featureEducationSentence.getInlineIcon() == null) {
                            c28655q.m87150e0(-1284666403);
                            c28655q.m87173q(false);
                            c23454a0 = null;
                        } else {
                            c28655q.m87150e0(-1284666402);
                            m96339M(featureEducationSentence, onNavigationEvent, c28655q, FeatureEducationSentence.$stable | i17);
                            c28655q.m87173q(false);
                            c23454a0 = C23454a0.f92919a;
                        }
                        if (c23454a0 == null) {
                            c28655q.m87150e0(-1284573402);
                            m96336J(featureEducationSentence, onNavigationEvent, c28655q, FeatureEducationSentence.$stable | i17);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-318536081);
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(false);
                    ctaButton = section.getCtaButton();
                    if (ctaButton == null) {
                        c28655q.m87150e0(-1141933382);
                    } else {
                        c28655q.m87150e0(-1141933381);
                        m96328B(ctaButton, onNavigationEvent, c28655q, FeatureEducationCtaButton.$stable | i17);
                    }
                    c28655q.m87173q(false);
                    ctas = section.getCtas();
                    if (ctas == null) {
                        c28655q.m87150e0(-1141837282);
                        c28655q.m87173q(false);
                        z27 = true;
                    } else {
                        c28655q.m87150e0(-1141837281);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f15, 0.0f, 0.0f, 13);
                        C23010x c23010xM73381n = AbstractC25012a.m73381n(3, 4, c2305k, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        c28655q.m87150e0(1047539260);
                        for (InterfaceC25312u interfaceC25312u : ctas) {
                            if (interfaceC25312u instanceof C11474i) {
                                c28655q.m87150e0(-1885959399);
                                c11474i = (C11474i) interfaceC25312u;
                                boolean zM87157i = c28655q.m87157i(interfaceC25312u);
                                if (i17 == 32) {
                                    z28 = true;
                                } else {
                                    z28 = z15;
                                }
                                z29 = zM87157i | z28;
                                objM87133R = c28655q.m87133R();
                                if (z29 || objM87133R == C28635l.f115821a) {
                                    objM87133R = new C3838e(onNavigationEvent, c11474i);
                                    c28655q.m87172p0(objM87133R);
                                }
                                boolean z34 = z15;
                                AbstractC11471f.m30786k(c11474i, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 6);
                                c28655q.m87173q(z34);
                                z15 = z34;
                            } else {
                                c28655q.m87150e0(-1885464484);
                                c28655q.m87173q(z15);
                            }
                        }
                        boolean z35 = z15;
                        z27 = true;
                        AbstractC25012a.m73392y(c28655q, z35, true, z35);
                    }
                    c28655q.m87173q(z27);
                    z18 = z24;
                    z17 = z19;
                } else {
                    c28655q.m87138X();
                    z17 = z14;
                    z18 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2559k4(section, onNavigationEvent, z17, z18, i13, i14, 6);
                }
            }
            i18 |= 3072;
            z15 = false;
            if ((i18 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i18 & 1, z16)) {
                if (i19 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                int i26 = i18;
                if (i15 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                sentences = section.getSentences();
                if (!(sentences instanceof Collection)) {
                    it = sentences.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z26 = false;
                            break;
                        }
                        if (((FeatureEducationSentence) it.next()).getDivider() != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (z25) {
                            z26 = true;
                            break;
                        }
                    }
                } else {
                    it = sentences.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z26 = false;
                            break;
                        }
                        if (((FeatureEducationSentence) it.next()).getDivider() != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (z25) {
                            z26 = true;
                            break;
                        }
                    }
                }
                if (z19) {
                    float f18 = 8;
                    f14 = f18 * f18;
                } else {
                    if (z26) {
                        f13 = 2;
                    } else {
                        f13 = 4;
                    }
                    f14 = f13 * 8;
                }
                float f19 = f14;
                f15 = 8;
                float leading2 = ((float) section.getInsets().getLeading()) * f15;
                float trailing2 = ((float) section.getInsets().getTrailing()) * f15;
                c2314t = C2314t.f9131w;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, leading2, 0.0f, trailing2, f19, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                int i27 = FeatureEducationParagraph.$stable | (i26 & 14);
                i17 = i26 & 112;
                m96351Y(section, onNavigationEvent, z24, c28655q, i27 | i17 | ((i26 >> 3) & 896), 0);
                m96331E(section, c28655q, i27);
                c28655q.m87150e0(-313939641);
                while (r3.hasNext()) {
                    if (featureEducationSentence.getInlineIcon() == null) {
                        c28655q.m87150e0(-1284666403);
                        c28655q.m87173q(false);
                        c23454a0 = null;
                    } else {
                        c28655q.m87150e0(-1284666402);
                        m96339M(featureEducationSentence, onNavigationEvent, c28655q, FeatureEducationSentence.$stable | i17);
                        c28655q.m87173q(false);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        c28655q.m87150e0(-1284573402);
                        m96336J(featureEducationSentence, onNavigationEvent, c28655q, FeatureEducationSentence.$stable | i17);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-318536081);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(false);
                ctaButton = section.getCtaButton();
                if (ctaButton == null) {
                    c28655q.m87150e0(-1141933382);
                } else {
                    c28655q.m87150e0(-1141933381);
                    m96328B(ctaButton, onNavigationEvent, c28655q, FeatureEducationCtaButton.$stable | i17);
                }
                c28655q.m87173q(false);
                ctas = section.getCtas();
                if (ctas == null) {
                    c28655q.m87150e0(-1141837282);
                    c28655q.m87173q(false);
                    z27 = true;
                } else {
                    c28655q.m87150e0(-1141837281);
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f15, 0.0f, 0.0f, 13);
                    C23010x c23010xM73381n2 = AbstractC25012a.m73381n(3, 4, c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    c28655q.m87150e0(1047539260);
                    while (r3.hasNext()) {
                        if (interfaceC25312u instanceof C11474i) {
                            c28655q.m87150e0(-1885959399);
                            c11474i = (C11474i) interfaceC25312u;
                            boolean zM87157i2 = c28655q.m87157i(interfaceC25312u);
                            if (i17 == 32) {
                                z28 = true;
                            } else {
                                z28 = z15;
                            }
                            z29 = zM87157i2 | z28;
                            objM87133R = c28655q.m87133R();
                            if (z29) {
                                objM87133R = new C3838e(onNavigationEvent, c11474i);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C3838e(onNavigationEvent, c11474i);
                                c28655q.m87172p0(objM87133R);
                            }
                            boolean z36 = z15;
                            AbstractC11471f.m30786k(c11474i, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 6);
                            c28655q.m87173q(z36);
                            z15 = z36;
                        } else {
                            c28655q.m87150e0(-1885464484);
                            c28655q.m87173q(z15);
                        }
                    }
                    boolean z37 = z15;
                    z27 = true;
                    AbstractC25012a.m73392y(c28655q, z37, true, z37);
                }
                c28655q.m87173q(z27);
                z18 = z24;
                z17 = z19;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(section, onNavigationEvent, z17, z18, i13, i14, 6);
            }
        }
        i18 |= 384;
        z14 = z4;
        i15 = i14 & 8;
        if (i15 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87155h(z13)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i18 |= i16;
            }
            z15 = false;
            if ((i18 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i18 & 1, z16)) {
                if (i19 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                int i28 = i18;
                if (i15 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                sentences = section.getSentences();
                if (!(sentences instanceof Collection)) {
                    it = sentences.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z26 = false;
                            break;
                        }
                        if (((FeatureEducationSentence) it.next()).getDivider() != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (z25) {
                            z26 = true;
                            break;
                        }
                    }
                } else {
                    it = sentences.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z26 = false;
                            break;
                        }
                        if (((FeatureEducationSentence) it.next()).getDivider() != null) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (z25) {
                            z26 = true;
                            break;
                        }
                    }
                }
                if (z19) {
                    float f110 = 8;
                    f14 = f110 * f110;
                } else {
                    if (z26) {
                        f13 = 2;
                    } else {
                        f13 = 4;
                    }
                    f14 = f13 * 8;
                }
                float f111 = f14;
                f15 = 8;
                float leading3 = ((float) section.getInsets().getLeading()) * f15;
                float trailing3 = ((float) section.getInsets().getTrailing()) * f15;
                c2314t = C2314t.f9131w;
                Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, leading3, 0.0f, trailing3, f111, 2);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                int i29 = FeatureEducationParagraph.$stable | (i28 & 14);
                i17 = i28 & 112;
                m96351Y(section, onNavigationEvent, z24, c28655q, i29 | i17 | ((i28 >> 3) & 896), 0);
                m96331E(section, c28655q, i29);
                c28655q.m87150e0(-313939641);
                while (r3.hasNext()) {
                    if (featureEducationSentence.getInlineIcon() == null) {
                        c28655q.m87150e0(-1284666403);
                        c28655q.m87173q(false);
                        c23454a0 = null;
                    } else {
                        c28655q.m87150e0(-1284666402);
                        m96339M(featureEducationSentence, onNavigationEvent, c28655q, FeatureEducationSentence.$stable | i17);
                        c28655q.m87173q(false);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        c28655q.m87150e0(-1284573402);
                        m96336J(featureEducationSentence, onNavigationEvent, c28655q, FeatureEducationSentence.$stable | i17);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-318536081);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(false);
                ctaButton = section.getCtaButton();
                if (ctaButton == null) {
                    c28655q.m87150e0(-1141933382);
                } else {
                    c28655q.m87150e0(-1141933381);
                    m96328B(ctaButton, onNavigationEvent, c28655q, FeatureEducationCtaButton.$stable | i17);
                }
                c28655q.m87173q(false);
                ctas = section.getCtas();
                if (ctas == null) {
                    c28655q.m87150e0(-1141837282);
                    c28655q.m87173q(false);
                    z27 = true;
                } else {
                    c28655q.m87150e0(-1141837281);
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f15, 0.0f, 0.0f, 13);
                    C23010x c23010xM73381n3 = AbstractC25012a.m73381n(3, 4, c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    c28655q.m87150e0(1047539260);
                    while (r3.hasNext()) {
                        if (interfaceC25312u instanceof C11474i) {
                            c28655q.m87150e0(-1885959399);
                            c11474i = (C11474i) interfaceC25312u;
                            boolean zM87157i3 = c28655q.m87157i(interfaceC25312u);
                            if (i17 == 32) {
                                z28 = true;
                            } else {
                                z28 = z15;
                            }
                            z29 = zM87157i3 | z28;
                            objM87133R = c28655q.m87133R();
                            if (z29) {
                                objM87133R = new C3838e(onNavigationEvent, c11474i);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C3838e(onNavigationEvent, c11474i);
                                c28655q.m87172p0(objM87133R);
                            }
                            boolean z38 = z15;
                            AbstractC11471f.m30786k(c11474i, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 6);
                            c28655q.m87173q(z38);
                            z15 = z38;
                        } else {
                            c28655q.m87150e0(-1885464484);
                            c28655q.m87173q(z15);
                        }
                    }
                    boolean z39 = z15;
                    z27 = true;
                    AbstractC25012a.m73392y(c28655q, z39, true, z39);
                }
                c28655q.m87173q(z27);
                z18 = z24;
                z17 = z19;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(section, onNavigationEvent, z17, z18, i13, i14, 6);
            }
        }
        i18 |= 3072;
        z15 = false;
        if ((i18 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i18 & 1, z16)) {
            if (i19 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            int i210 = i18;
            if (i15 != 0) {
                z24 = false;
            } else {
                z24 = z13;
            }
            sentences = section.getSentences();
            if (!(sentences instanceof Collection)) {
                it = sentences.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z26 = false;
                        break;
                    }
                    if (((FeatureEducationSentence) it.next()).getDivider() != null) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (z25) {
                        z26 = true;
                        break;
                    }
                }
            } else {
                it = sentences.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z26 = false;
                        break;
                    }
                    if (((FeatureEducationSentence) it.next()).getDivider() != null) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (z25) {
                        z26 = true;
                        break;
                    }
                }
            }
            if (z19) {
                float f112 = 8;
                f14 = f112 * f112;
            } else {
                if (z26) {
                    f13 = 2;
                } else {
                    f13 = 4;
                }
                f14 = f13 * 8;
            }
            float f113 = f14;
            f15 = 8;
            float leading4 = ((float) section.getInsets().getLeading()) * f15;
            float trailing4 = ((float) section.getInsets().getTrailing()) * f15;
            c2314t = C2314t.f9131w;
            Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, leading4, 0.0f, trailing4, f113, 2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
            int i211 = FeatureEducationParagraph.$stable | (i210 & 14);
            i17 = i210 & 112;
            m96351Y(section, onNavigationEvent, z24, c28655q, i211 | i17 | ((i210 >> 3) & 896), 0);
            m96331E(section, c28655q, i211);
            c28655q.m87150e0(-313939641);
            while (r3.hasNext()) {
                if (featureEducationSentence.getInlineIcon() == null) {
                    c28655q.m87150e0(-1284666403);
                    c28655q.m87173q(false);
                    c23454a0 = null;
                } else {
                    c28655q.m87150e0(-1284666402);
                    m96339M(featureEducationSentence, onNavigationEvent, c28655q, FeatureEducationSentence.$stable | i17);
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q.m87150e0(-1284573402);
                    m96336J(featureEducationSentence, onNavigationEvent, c28655q, FeatureEducationSentence.$stable | i17);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-318536081);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(false);
            ctaButton = section.getCtaButton();
            if (ctaButton == null) {
                c28655q.m87150e0(-1141933382);
            } else {
                c28655q.m87150e0(-1141933381);
                m96328B(ctaButton, onNavigationEvent, c28655q, FeatureEducationCtaButton.$stable | i17);
            }
            c28655q.m87173q(false);
            ctas = section.getCtas();
            if (ctas == null) {
                c28655q.m87150e0(-1141837282);
                c28655q.m87173q(false);
                z27 = true;
            } else {
                c28655q.m87150e0(-1141837281);
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f15, 0.0f, 0.0f, 13);
                C23010x c23010xM73381n4 = AbstractC25012a.m73381n(3, 4, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                c28655q.m87150e0(1047539260);
                while (r3.hasNext()) {
                    if (interfaceC25312u instanceof C11474i) {
                        c28655q.m87150e0(-1885959399);
                        c11474i = (C11474i) interfaceC25312u;
                        boolean zM87157i4 = c28655q.m87157i(interfaceC25312u);
                        if (i17 == 32) {
                            z28 = true;
                        } else {
                            z28 = z15;
                        }
                        z29 = zM87157i4 | z28;
                        objM87133R = c28655q.m87133R();
                        if (z29) {
                            objM87133R = new C3838e(onNavigationEvent, c11474i);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C3838e(onNavigationEvent, c11474i);
                            c28655q.m87172p0(objM87133R);
                        }
                        boolean z310 = z15;
                        AbstractC11471f.m30786k(c11474i, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 6);
                        c28655q.m87173q(z310);
                        z15 = z310;
                    } else {
                        c28655q.m87150e0(-1885464484);
                        c28655q.m87173q(z15);
                    }
                }
                boolean z311 = z15;
                z27 = true;
                AbstractC25012a.m73392y(c28655q, z311, true, z311);
            }
            c28655q.m87173q(z27);
            z18 = z24;
            z17 = z19;
        } else {
            c28655q.m87138X();
            z17 = z14;
            z18 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2559k4(section, onNavigationEvent, z17, z18, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m96334H(InterfaceC25312u interfaceC25312u, Function1 function1) {
        C9598e c9598eM30835x = ((C11474i) interfaceC25312u).getNavigationAction();
        if (c9598eM30835x != null) {
            function1.invoke(new AbstractC26598a.d(c9598eM30835x, "card"));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m96335I(FeatureEducationParagraph featureEducationParagraph, Function1 function1, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        m96333G(featureEducationParagraph, function1, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    public static final void m96336J(FeatureEducationSentence sentence, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(sentence, "sentence");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2067886409);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(sentence) : c28655q.m87157i(sentence) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean zM85313c = AbstractC28188o1.m85313c(sentence.getClickableTextUrl());
            boolean z4 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(sentence))) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C31319f(sentence, onNavigationEvent, 0);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            AbstractC30795n.m94707h(sentence.getText(), AbstractC1092a.m3362g(c2314t, zM85313c, null, null, (InterfaceC4339a) objM87133R, 14), sentence.getStyle().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sentence.getStyle().getName(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            C17736e divider = sentence.getDivider();
            if (divider == null) {
                c28655q.m87150e0(-1687461572);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1687461571);
                AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 2 * 8, 0.0f, 0.0f, 13), divider.getDividerType(), null, divider.getTitle(), null, 0L, 0L, null, c28655q, (TextResource.$stable << 9) | 6, 244);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31320g(sentence, onNavigationEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m96337K(FeatureEducationSentence featureEducationSentence, Function1 function1) {
        String clickableTextUrl = featureEducationSentence.getClickableTextUrl();
        if (clickableTextUrl != null) {
            function1.invoke(new AbstractC26598a.c(clickableTextUrl));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m96338L(FeatureEducationSentence featureEducationSentence, Function1 function1, int i13, Composer composer, int i14) {
        m96336J(featureEducationSentence, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX INFO: renamed from: M */
    public static final void m96339M(FeatureEducationSentence sentence, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        int i15;
        boolean z4;
        AbstractC22676k.m65750j(sentence, "sentence");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1998514358);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(sentence) : c28655q.m87157i(sentence) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 8;
            float f14 = 1 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, f14, 5);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            FeatureEducationInlineIcon inlineIcon = sentence.getInlineIcon();
            if (inlineIcon == null) {
                c28655q.m87150e0(-369780238);
                c28655q.m87173q(false);
                i15 = 0;
                z4 = true;
            } else {
                c28655q.m87150e0(-369780237);
                i15 = 0;
                z4 = true;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(inlineIcon.getIcon(), c28655q, 6), null, AbstractC1102d.m3424u(f13 * 4, c2314t).mo3471e(new VerticalAlignElement(C2299e.f9108K)), inlineIcon.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 48, 0);
                c28655q.m87173q(false);
            }
            boolean zM85313c = AbstractC28188o1.m85313c(sentence.getClickableTextUrl());
            int i16 = ((i14 & 112) == 32 ? z4 : i15) | (((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(sentence))) ? z4 : i15);
            Object objM87133R = c28655q.m87133R();
            if (i16 != 0 || objM87133R == C28635l.f115821a) {
                objM87133R = new C31319f(sentence, onNavigationEvent, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC30795n.m94707h(sentence.getText(), AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, zM85313c, null, null, (InterfaceC4339a) objM87133R, 14), 2 * 4, 0.0f, 0.0f, 0.0f, 14), sentence.getStyle().getColor().mo134584toComposableColorWaAFU9c(c28655q, i15), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sentence.getStyle().getName(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31320g(sentence, onNavigationEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m96340N(FeatureEducationSentence featureEducationSentence, Function1 function1) {
        String clickableTextUrl = featureEducationSentence.getClickableTextUrl();
        if (clickableTextUrl != null) {
            function1.invoke(new AbstractC26598a.c(clickableTextUrl));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m96341O(FeatureEducationSentence featureEducationSentence, Function1 function1, int i13, Composer composer, int i14) {
        m96339M(featureEducationSentence, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0169  */
    /* JADX WARN: Code duplicated, block: B:116:0x0178  */
    /* JADX WARN: Code duplicated, block: B:121:0x0187  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01db  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:133:0x0223  */
    /* JADX WARN: Code duplicated, block: B:134:0x0227  */
    /* JADX WARN: Code duplicated, block: B:137:0x023a  */
    /* JADX WARN: Code duplicated, block: B:140:0x024b  */
    /* JADX WARN: Code duplicated, block: B:144:0x029b  */
    /* JADX WARN: Code duplicated, block: B:145:0x029f  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:156:0x0305  */
    /* JADX WARN: Code duplicated, block: B:157:0x0307  */
    /* JADX WARN: Code duplicated, block: B:160:0x0311 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0323  */
    /* JADX WARN: Code duplicated, block: B:166:0x034c  */
    /* JADX WARN: Code duplicated, block: B:167:0x034e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0355 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x035b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0381  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:183:0x03f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:188:0x0427  */
    /* JADX WARN: Code duplicated, block: B:190:0x044c  */
    /* JADX WARN: Code duplicated, block: B:192:0x0454  */
    /* JADX WARN: Code duplicated, block: B:195:0x047f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0487  */
    /* JADX WARN: Code duplicated, block: B:200:0x0497  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:210:0x04cf A[LOOP:0: B:206:0x04c1->B:210:0x04cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x0504  */
    /* JADX WARN: Code duplicated, block: B:216:0x0514  */
    /* JADX WARN: Code duplicated, block: B:218:0x051e  */
    /* JADX WARN: Code duplicated, block: B:219:0x0520  */
    /* JADX WARN: Code duplicated, block: B:222:0x0527 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x0529  */
    /* JADX WARN: Code duplicated, block: B:226:0x0549  */
    /* JADX WARN: Code duplicated, block: B:229:0x0551  */
    /* JADX WARN: Code duplicated, block: B:230:0x055e  */
    /* JADX WARN: Code duplicated, block: B:233:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:236:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:243:0x04f3 A[SYNTHETIC] */
    /* JADX INFO: renamed from: P */
    public static final void m96342P(List<FeatureEducationParagraph> sections, TextResource navBarTitle, MediaHeader mediaHeader, StickyButton stickyButton, C34858a c34858a, Function1 scrollDepthAnalyticsEvent, Function1 onNavigationEvent, InterfaceC4339a podcastAnalyticsEvent, boolean z4, Composer composer, int i13, int i14) {
        C34858a c34858a2;
        boolean z13;
        StickyButton stickyButton2;
        C34858a c34858a3;
        boolean z14;
        StickyButton stickyButton3;
        C34858a c34858a4;
        int i15;
        C34858a c34858a5;
        boolean z15;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        float f13;
        C15199y3 c15199y3M3460c;
        C13821r1 c13821r1M92099U;
        boolean z16;
        Object objM87133R3;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C28676v0 c28676v1;
        C0209i c0209i3;
        C22957g c22957g;
        StickyButton stickyButton4;
        C34858a c34858a6;
        float f14;
        C2305k c2305k;
        int iHashCode2;
        boolean z17;
        boolean z18;
        Object objM87133R4;
        C28676v0 c28676v2;
        C28676v0 c28676v3;
        int i16;
        boolean z19;
        Object objM87133R5;
        C15199y3 c15199y3;
        int i17;
        C13821r1 c13821r1;
        C28655q c28655q;
        boolean z24;
        C23454a0 c23454a0;
        C0209i c0209i4;
        C28676v0 c28676v4;
        C0209i c0209i5;
        C22957g c22957g2;
        C0209i c0209i6;
        C15199y3 c15199y4;
        int i18;
        Function1 function1;
        int i19;
        Modifier modifierM3398t;
        int iHashCode3;
        int i24;
        C1100b c1100b;
        boolean z25;
        Object objM87133R6;
        C1100b c1100b2;
        List<PodcastPlayer> podcastPlayers;
        C15199y3 c15199y5;
        boolean z26;
        int i25;
        C28655q c28655q2;
        boolean z27;
        Object objM87133R7;
        C28655q c28655q3;
        String bottomSheetTitle;
        PodcastPicker podcastPicker;
        int i26;
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(navBarTitle, "navBarTitle");
        AbstractC22676k.m65750j(scrollDepthAnalyticsEvent, "scrollDepthAnalyticsEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(podcastAnalyticsEvent, "podcastAnalyticsEvent");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(1615908535);
        int i27 = (i13 & 6) == 0 ? (c28655q4.m87157i(sections) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i27 |= (i13 & 64) == 0 ? c28655q4.m87153g(navBarTitle) : c28655q4.m87157i(navBarTitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i27 |= (i13 & 512) == 0 ? c28655q4.m87153g(mediaHeader) : c28655q4.m87157i(mediaHeader) ? 256 : 128;
        }
        int i28 = i14 & 8;
        if (i28 != 0) {
            i27 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i27 |= (i13 & 4096) == 0 ? c28655q4.m87153g(stickyButton) : c28655q4.m87157i(stickyButton) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                c34858a2 = c34858a;
                if (c28655q4.m87153g(c34858a2)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i27 |= i26;
            } else {
                c34858a2 = c34858a;
            }
            i26 = DfuBaseService.ERROR_REMOTE_MASK;
            i27 |= i26;
        } else {
            c34858a2 = c34858a;
        }
        if ((196608 & i13) == 0) {
            i27 |= c28655q4.m87157i(scrollDepthAnalyticsEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i27 |= c28655q4.m87157i(onNavigationEvent) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i27 |= c28655q4.m87157i(podcastAnalyticsEvent) ? 8388608 : 4194304;
        }
        int i29 = i14 & 256;
        if (i29 != 0) {
            i27 |= 100663296;
            z13 = z4;
        } else {
            z13 = z4;
            if ((i13 & 100663296) == 0) {
                i27 |= c28655q4.m87155h(z13) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            }
        }
        if (c28655q4.m87135U(i27 & 1, (i27 & 38347923) != 38347922)) {
            c28655q4.m87140Z();
            if ((i13 & 1) == 0 || c28655q4.m87118C()) {
                stickyButton3 = i28 != 0 ? null : stickyButton;
                if ((i14 & 16) != 0) {
                    c34858a4 = new C34858a();
                    i27 &= -57345;
                } else {
                    c34858a4 = c34858a2;
                }
                i15 = i27;
                c34858a5 = c34858a4;
                if (i29 != 0) {
                    z15 = false;
                }
                c28655q4.m87175r();
                float f15 = 8;
                float f16 = 15 * f15;
                objM87133R = c28655q4.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q4);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    if (mediaHeader != null || (podcastPicker = mediaHeader.getPodcastPicker()) == null) {
                        bottomSheetTitle = null;
                    } else {
                        bottomSheetTitle = podcastPicker.getBottomSheetTitle();
                    }
                    objM87133R2 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21278l(bottomSheetTitle), null, null, null, null, 0.0f, 0.0f, 126, null));
                    c28655q4.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                f13 = f15;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q4, 3078, 6);
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q4, 1);
                if ((i15 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = c28655q4.m87133R();
                if (z16 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C29000h(scrollDepthAnalyticsEvent, 22);
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC34860c.m109947c(c13821r1M92099U, (Function1) objM87133R3, c28655q4, 0);
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i7, interfaceC39127r0M66763d);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    c28676v1 = c28676v0;
                } else {
                    c28676v1 = c28676v0;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i3 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N);
                    Modifier modifierMo3471e = AbstractC30060g.m92116f0(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))), c13821r1M92099U, 14).mo3471e(AbstractC1099a.m3393o(c34858a5.m109940a(mediaHeader, stickyButton3, f16), c2314t));
                    c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k2 = C2299e.f9110M;
                    stickyButton4 = stickyButton3;
                    c34858a6 = c34858a5;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q4, 0);
                    f14 = f16;
                    c2305k = c2305k2;
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i7, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m2);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N2);
                    if (mediaHeader == null) {
                        c28655q4.m87150e0(-1348550431);
                        c28655q4.m87173q(false);
                        f14 = f14;
                        c2305k = c2305k;
                        z24 = false;
                        c0209i = c0209i;
                        c28655q = c28655q4;
                        c13821r1 = c13821r1M92099U;
                        c34858a6 = c34858a6;
                        f13 = f13;
                        c23454a0 = null;
                        i16 = 3670016;
                        c15199y3 = c15199y3M3460c;
                        c0213j = c0213j;
                        c28676v3 = c28676v1;
                        i17 = 1048576;
                    } else {
                        c28655q4.m87150e0(-1348550430);
                        boolean zM87157i = c28655q4.m87157i(mediaHeader) | c28655q4.m87157i(interfaceC2994c0) | c28655q4.m87157i(c15199y3M3460c);
                        if ((i15 & 29360128) == 8388608) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zM87157i | z17;
                        objM87133R4 = c28655q4.m87133R();
                        c28676v2 = c28676v1;
                        if (!z18 || objM87133R4 == c28676v2) {
                            c28676v3 = c28676v2;
                            i16 = 3670016;
                            C27198e c27198e = new C27198e(mediaHeader, podcastAnalyticsEvent, interfaceC2994c0, c15199y3M3460c, 11);
                            c28655q4.m87172p0(c27198e);
                            objM87133R4 = c27198e;
                        } else {
                            i16 = 3670016;
                            c28676v3 = c28676v2;
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                        if ((i15 & i16) == 1048576) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objM87133R5 = c28655q4.m87133R();
                        if (z19 || objM87133R5 == c28676v3) {
                            objM87133R5 = new C9812h(onNavigationEvent, 7);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        c15199y3 = c15199y3M3460c;
                        i17 = 1048576;
                        AbstractC31325l.m96403f(mediaHeader, c13821r1M92099U, interfaceC4339a, (InterfaceC4351m) objM87133R5, c28655q4, MediaHeader.$stable);
                        c13821r1 = c13821r1M92099U;
                        c28655q = c28655q4;
                        z24 = false;
                        c28655q.m87173q(false);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        c28655q.m87150e0(-1347841243);
                        Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "EducationSuccessToolbar");
                        c28655q2 = c28655q;
                        c0209i5 = c0209i3;
                        c22957g2 = c22957g;
                        c0209i6 = c0209i2;
                        c15199y4 = c15199y3;
                        c0209i4 = c0209i;
                        i18 = i17;
                        c28676v4 = c28676v3;
                        AbstractC6721d.a aVar = new AbstractC6721d.a(navBarTitle, null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                        if ((i15 & i16) == i18) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R7 = c28655q2.m87133R();
                        if (!z27 || objM87133R7 == c28676v4) {
                            function1 = onNavigationEvent;
                            objM87133R7 = new C30515j(function1, 6);
                            c28655q3 = c28655q2;
                            c28655q3.m87172p0(objM87133R7);
                        } else {
                            function1 = onNavigationEvent;
                            c28655q3 = c28655q2;
                        }
                        i19 = 3;
                        C28655q c28655q5 = c28655q3;
                        AbstractC6719b.m20143d(modifierM3599a, aVar, null, (InterfaceC4339a) objM87133R7, null, null, c28655q5, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        c28655q4 = c28655q5;
                        c28655q4.m87173q(false);
                    } else {
                        c0209i4 = c0209i;
                        boolean z28 = z24;
                        c28676v4 = c28676v3;
                        c0209i5 = c0209i3;
                        c22957g2 = c22957g;
                        c0209i6 = c0209i2;
                        c15199y4 = c15199y3;
                        i18 = i17;
                        function1 = onNavigationEvent;
                        i19 = 3;
                        c28655q4 = c28655q;
                        c28655q4.m87150e0(-1290427493);
                        c28655q4.m87173q(z28);
                    }
                    if (mediaHeader != null) {
                        modifierM3398t = c2314t;
                    } else {
                        modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, i19 * f13, 0.0f, 0.0f, 13);
                    }
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q4, 0);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i7, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m3);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N3);
                    c28655q4.m87150e0(1131145759);
                    i24 = 0;
                    for (Object obj : sections) {
                        i25 = i24 + 1;
                        if (i24 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        FeatureEducationParagraph featureEducationParagraph = (FeatureEducationParagraph) obj;
                        int i34 = i15 >> 15;
                        Function1 function2 = function1;
                        m96333G(featureEducationParagraph, function2, m96388r0(featureEducationParagraph, (FeatureEducationParagraph) AbstractC25265s.m74102I0(i25, sections)), z15, c28655q4, (i34 & 7168) | FeatureEducationParagraph.$stable | (i34 & 112), 0);
                        function1 = function2;
                        i24 = i25;
                    }
                    boolean z29 = z15;
                    AbstractC25012a.m73392y(c28655q4, false, true, true);
                    c1100b = C1100b.f4583a;
                    if (mediaHeader == null) {
                        c28655q4.m87150e0(-1162918353);
                        c28655q4.m87173q(false);
                        c1100b2 = c1100b;
                        c15199y5 = c15199y4;
                    } else {
                        c28655q4.m87150e0(-1162918352);
                        if ((i15 & i16) == i18) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R6 = c28655q4.m87133R();
                        if (z25 || objM87133R6 == c28676v4) {
                            objM87133R6 = new C30515j(function1, 7);
                            c28655q4.m87172p0(objM87133R6);
                        }
                        C28655q c28655q6 = c28655q4;
                        m96380n0(c1100b, c13821r1, 0.0f, (InterfaceC4339a) objM87133R6, c28655q6, 6, 2);
                        c1100b2 = c1100b;
                        c28655q4 = c28655q6;
                        PodcastPicker podcastPicker2 = mediaHeader.getPodcastPicker();
                        podcastPlayers = podcastPicker2 != null ? podcastPicker2.getPodcastPlayers() : null;
                        if (podcastPlayers == null) {
                            c28655q4.m87150e0(25514056);
                            z26 = false;
                            c28655q4.m87173q(false);
                            c15199y5 = c15199y4;
                        } else {
                            c28655q4.m87150e0(25514057);
                            c15199y5 = c15199y4;
                            AbstractC35660d.m112871m(null, m96343Q(interfaceC28601c1), new AbstractC35664f.a(c15199y5), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(167564902, c28655q4, new C13878m(podcastPlayers, 1, function1)), false, null, null, null, false, null, C31315b.f128885a.m96323b(), c28655q4, (C35666g.f151591h << i19) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                            c28655q4 = c28655q4;
                            z26 = false;
                            c28655q4.m87173q(false);
                        }
                        c28655q4.m87173q(z26);
                    }
                    if (stickyButton4 != null || c15199y5.m43224e()) {
                        stickyButton2 = stickyButton4;
                        c28655q4.m87150e0(-1161668091);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1161878550);
                        Function1 function3 = function1;
                        stickyButton2 = stickyButton4;
                        AbstractC31326m.m96412d(c1100b2, f14, stickyButton2, function3, c28655q4, (StickyButton.$stable << 6) | 54 | ((i15 >> 3) & 896) | ((i15 >> 9) & 7168));
                        c28655q4.m87173q(false);
                    }
                    c28655q4.m87173q(true);
                    c34858a3 = c34858a6;
                    z14 = z29;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N);
                Modifier modifierMo3471e2 = AbstractC30060g.m92116f0(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))), c13821r1M92099U, 14).mo3471e(AbstractC1099a.m3393o(c34858a5.m109940a(mediaHeader, stickyButton3, f16), c2314t));
                c22957g = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                stickyButton4 = stickyButton3;
                c34858a6 = c34858a5;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k3, c28655q4, 0);
                f14 = f16;
                c2305k = c2305k3;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i7, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m4);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N4);
                if (mediaHeader == null) {
                    c28655q4.m87150e0(-1348550431);
                    c28655q4.m87173q(false);
                    f14 = f14;
                    c2305k = c2305k;
                    z24 = false;
                    c0209i = c0209i;
                    c28655q = c28655q4;
                    c13821r1 = c13821r1M92099U;
                    c34858a6 = c34858a6;
                    f13 = f13;
                    c23454a0 = null;
                    i16 = 3670016;
                    c15199y3 = c15199y3M3460c;
                    c0213j = c0213j;
                    c28676v3 = c28676v1;
                    i17 = 1048576;
                } else {
                    c28655q4.m87150e0(-1348550430);
                    boolean zM87157i2 = c28655q4.m87157i(mediaHeader) | c28655q4.m87157i(interfaceC2994c0) | c28655q4.m87157i(c15199y3M3460c);
                    if ((i15 & 29360128) == 8388608) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i2 | z17;
                    objM87133R4 = c28655q4.m87133R();
                    c28676v2 = c28676v1;
                    if (z18) {
                        c28676v3 = c28676v2;
                        i16 = 3670016;
                        C27198e c27198e2 = new C27198e(mediaHeader, podcastAnalyticsEvent, interfaceC2994c0, c15199y3M3460c, 11);
                        c28655q4.m87172p0(c27198e2);
                        objM87133R4 = c27198e2;
                    } else {
                        c28676v3 = c28676v2;
                        i16 = 3670016;
                        C27198e c27198e3 = new C27198e(mediaHeader, podcastAnalyticsEvent, interfaceC2994c0, c15199y3M3460c, 11);
                        c28655q4.m87172p0(c27198e3);
                        objM87133R4 = c27198e3;
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                    if ((i15 & i16) == 1048576) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R5 = c28655q4.m87133R();
                    if (z19) {
                        objM87133R5 = new C9812h(onNavigationEvent, 7);
                        c28655q4.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C9812h(onNavigationEvent, 7);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    c15199y3 = c15199y3M3460c;
                    i17 = 1048576;
                    AbstractC31325l.m96403f(mediaHeader, c13821r1M92099U, interfaceC4339a2, (InterfaceC4351m) objM87133R5, c28655q4, MediaHeader.$stable);
                    c13821r1 = c13821r1M92099U;
                    c28655q = c28655q4;
                    z24 = false;
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q.m87150e0(-1347841243);
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "EducationSuccessToolbar");
                    c28655q2 = c28655q;
                    c0209i5 = c0209i3;
                    c22957g2 = c22957g;
                    c0209i6 = c0209i2;
                    c15199y4 = c15199y3;
                    c0209i4 = c0209i;
                    i18 = i17;
                    c28676v4 = c28676v3;
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(navBarTitle, null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    if ((i15 & i16) == i18) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R7 = c28655q2.m87133R();
                    if (z27) {
                        function1 = onNavigationEvent;
                        objM87133R7 = new C30515j(function1, 6);
                        c28655q3 = c28655q2;
                        c28655q3.m87172p0(objM87133R7);
                    } else {
                        function1 = onNavigationEvent;
                        objM87133R7 = new C30515j(function1, 6);
                        c28655q3 = c28655q2;
                        c28655q3.m87172p0(objM87133R7);
                    }
                    i19 = 3;
                    C28655q c28655q7 = c28655q3;
                    AbstractC6719b.m20143d(modifierM3599a2, aVar2, null, (InterfaceC4339a) objM87133R7, null, null, c28655q7, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    c28655q4 = c28655q7;
                    c28655q4.m87173q(false);
                } else {
                    c0209i4 = c0209i;
                    boolean z210 = z24;
                    c28676v4 = c28676v3;
                    c0209i5 = c0209i3;
                    c22957g2 = c22957g;
                    c0209i6 = c0209i2;
                    c15199y4 = c15199y3;
                    i18 = i17;
                    function1 = onNavigationEvent;
                    i19 = 3;
                    c28655q4 = c28655q;
                    c28655q4.m87150e0(-1290427493);
                    c28655q4.m87173q(z210);
                }
                if (mediaHeader != null) {
                    modifierM3398t = c2314t;
                } else {
                    modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, i19 * f13, 0.0f, 0.0f, 13);
                }
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q4, 0);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i7, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m5);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N5);
                c28655q4.m87150e0(1131145759);
                i24 = 0;
                while (r9.hasNext()) {
                    i25 = i24 + 1;
                    if (i24 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    FeatureEducationParagraph featureEducationParagraph2 = (FeatureEducationParagraph) obj;
                    int i35 = i15 >> 15;
                    Function1 function4 = function1;
                    m96333G(featureEducationParagraph2, function4, m96388r0(featureEducationParagraph2, (FeatureEducationParagraph) AbstractC25265s.m74102I0(i25, sections)), z15, c28655q4, (i35 & 7168) | FeatureEducationParagraph.$stable | (i35 & 112), 0);
                    function1 = function4;
                    i24 = i25;
                }
                boolean z211 = z15;
                AbstractC25012a.m73392y(c28655q4, false, true, true);
                c1100b = C1100b.f4583a;
                if (mediaHeader == null) {
                    c28655q4.m87150e0(-1162918353);
                    c28655q4.m87173q(false);
                    c1100b2 = c1100b;
                    c15199y5 = c15199y4;
                } else {
                    c28655q4.m87150e0(-1162918352);
                    if ((i15 & i16) == i18) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R6 = c28655q4.m87133R();
                    if (z25) {
                        objM87133R6 = new C30515j(function1, 7);
                        c28655q4.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C30515j(function1, 7);
                        c28655q4.m87172p0(objM87133R6);
                    }
                    C28655q c28655q8 = c28655q4;
                    m96380n0(c1100b, c13821r1, 0.0f, (InterfaceC4339a) objM87133R6, c28655q8, 6, 2);
                    c1100b2 = c1100b;
                    c28655q4 = c28655q8;
                    PodcastPicker podcastPicker3 = mediaHeader.getPodcastPicker();
                    podcastPlayers = podcastPicker3 != null ? podcastPicker3.getPodcastPlayers() : null;
                    if (podcastPlayers == null) {
                        c28655q4.m87150e0(25514056);
                        z26 = false;
                        c28655q4.m87173q(false);
                        c15199y5 = c15199y4;
                    } else {
                        c28655q4.m87150e0(25514057);
                        c15199y5 = c15199y4;
                        AbstractC35660d.m112871m(null, m96343Q(interfaceC28601c1), new AbstractC35664f.a(c15199y5), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(167564902, c28655q4, new C13878m(podcastPlayers, 1, function1)), false, null, null, null, false, null, C31315b.f128885a.m96323b(), c28655q4, (C35666g.f151591h << i19) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                        c28655q4 = c28655q4;
                        z26 = false;
                        c28655q4.m87173q(false);
                    }
                    c28655q4.m87173q(z26);
                }
                if (stickyButton4 != null) {
                    stickyButton2 = stickyButton4;
                    c28655q4.m87150e0(-1161668091);
                    c28655q4.m87173q(false);
                } else {
                    stickyButton2 = stickyButton4;
                    c28655q4.m87150e0(-1161668091);
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(true);
                c34858a3 = c34858a6;
                z14 = z211;
            } else {
                c28655q4.m87138X();
                if ((i14 & 16) != 0) {
                    i27 &= -57345;
                }
                stickyButton3 = stickyButton;
                i15 = i27;
                c34858a5 = c34858a2;
            }
            z15 = z13;
            c28655q4.m87175r();
            float f17 = 8;
            float f18 = 15 * f17;
            objM87133R = c28655q4.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q4);
                c28655q4.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            objM87133R2 = c28655q4.m87133R();
            if (objM87133R2 == c28676v0) {
                if (mediaHeader != null) {
                    bottomSheetTitle = null;
                } else {
                    bottomSheetTitle = null;
                }
                objM87133R2 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21278l(bottomSheetTitle), null, null, null, null, 0.0f, 0.0f, 126, null));
                c28655q4.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            f13 = f17;
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q4, 3078, 6);
            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q4, 1);
            if ((i15 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R3 = c28655q4.m87133R();
            if (z16) {
                objM87133R3 = new C29000h(scrollDepthAnalyticsEvent, 22);
                c28655q4.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C29000h(scrollDepthAnalyticsEvent, 22);
                c28655q4.m87172p0(objM87133R3);
            }
            AbstractC34860c.m109947c(c13821r1M92099U, (Function1) objM87133R3, c28655q4, 0);
            c2314t = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i8 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i8, interfaceC39127r0M66763d2);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m6);
            c0209i2 = C0217k.f732j;
            if (c28655q4.f115903S) {
                c28676v1 = c28676v0;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N6);
                Modifier modifierMo3471e3 = AbstractC30060g.m92116f0(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))), c13821r1M92099U, 14).mo3471e(AbstractC1099a.m3393o(c34858a5.m109940a(mediaHeader, stickyButton3, f18), c2314t));
                c22957g = AbstractC22977m.f90652c;
                C2305k c2305k4 = C2299e.f9110M;
                stickyButton4 = stickyButton3;
                c34858a6 = c34858a5;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k4, c28655q4, 0);
                f14 = f18;
                c2305k = c2305k4;
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e3);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i8, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m7);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N7);
                if (mediaHeader == null) {
                    c28655q4.m87150e0(-1348550431);
                    c28655q4.m87173q(false);
                    f14 = f14;
                    c2305k = c2305k;
                    z24 = false;
                    c0209i = c0209i;
                    c28655q = c28655q4;
                    c13821r1 = c13821r1M92099U;
                    c34858a6 = c34858a6;
                    f13 = f13;
                    c23454a0 = null;
                    i16 = 3670016;
                    c15199y3 = c15199y3M3460c;
                    c0213j = c0213j;
                    c28676v3 = c28676v1;
                    i17 = 1048576;
                } else {
                    c28655q4.m87150e0(-1348550430);
                    boolean zM87157i3 = c28655q4.m87157i(mediaHeader) | c28655q4.m87157i(interfaceC2994c0) | c28655q4.m87157i(c15199y3M3460c);
                    if ((i15 & 29360128) == 8388608) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i3 | z17;
                    objM87133R4 = c28655q4.m87133R();
                    c28676v2 = c28676v1;
                    if (z18) {
                        c28676v3 = c28676v2;
                        i16 = 3670016;
                        C27198e c27198e4 = new C27198e(mediaHeader, podcastAnalyticsEvent, interfaceC2994c0, c15199y3M3460c, 11);
                        c28655q4.m87172p0(c27198e4);
                        objM87133R4 = c27198e4;
                    } else {
                        c28676v3 = c28676v2;
                        i16 = 3670016;
                        C27198e c27198e5 = new C27198e(mediaHeader, podcastAnalyticsEvent, interfaceC2994c0, c15199y3M3460c, 11);
                        c28655q4.m87172p0(c27198e5);
                        objM87133R4 = c27198e5;
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                    if ((i15 & i16) == 1048576) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R5 = c28655q4.m87133R();
                    if (z19) {
                        objM87133R5 = new C9812h(onNavigationEvent, 7);
                        c28655q4.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C9812h(onNavigationEvent, 7);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    c15199y3 = c15199y3M3460c;
                    i17 = 1048576;
                    AbstractC31325l.m96403f(mediaHeader, c13821r1M92099U, interfaceC4339a3, (InterfaceC4351m) objM87133R5, c28655q4, MediaHeader.$stable);
                    c13821r1 = c13821r1M92099U;
                    c28655q = c28655q4;
                    z24 = false;
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q.m87150e0(-1347841243);
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "EducationSuccessToolbar");
                    c28655q2 = c28655q;
                    c0209i5 = c0209i3;
                    c22957g2 = c22957g;
                    c0209i6 = c0209i2;
                    c15199y4 = c15199y3;
                    c0209i4 = c0209i;
                    i18 = i17;
                    c28676v4 = c28676v3;
                    AbstractC6721d.a aVar3 = new AbstractC6721d.a(navBarTitle, null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    if ((i15 & i16) == i18) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R7 = c28655q2.m87133R();
                    if (z27) {
                        function1 = onNavigationEvent;
                        objM87133R7 = new C30515j(function1, 6);
                        c28655q3 = c28655q2;
                        c28655q3.m87172p0(objM87133R7);
                    } else {
                        function1 = onNavigationEvent;
                        objM87133R7 = new C30515j(function1, 6);
                        c28655q3 = c28655q2;
                        c28655q3.m87172p0(objM87133R7);
                    }
                    i19 = 3;
                    C28655q c28655q9 = c28655q3;
                    AbstractC6719b.m20143d(modifierM3599a3, aVar3, null, (InterfaceC4339a) objM87133R7, null, null, c28655q9, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    c28655q4 = c28655q9;
                    c28655q4.m87173q(false);
                } else {
                    c0209i4 = c0209i;
                    boolean z212 = z24;
                    c28676v4 = c28676v3;
                    c0209i5 = c0209i3;
                    c22957g2 = c22957g;
                    c0209i6 = c0209i2;
                    c15199y4 = c15199y3;
                    i18 = i17;
                    function1 = onNavigationEvent;
                    i19 = 3;
                    c28655q4 = c28655q;
                    c28655q4.m87150e0(-1290427493);
                    c28655q4.m87173q(z212);
                }
                if (mediaHeader != null) {
                    modifierM3398t = c2314t;
                } else {
                    modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, i19 * f13, 0.0f, 0.0f, 13);
                }
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q4, 0);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i8, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m8);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N8);
                c28655q4.m87150e0(1131145759);
                i24 = 0;
                while (r9.hasNext()) {
                    i25 = i24 + 1;
                    if (i24 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    FeatureEducationParagraph featureEducationParagraph3 = (FeatureEducationParagraph) obj;
                    int i36 = i15 >> 15;
                    Function1 function5 = function1;
                    m96333G(featureEducationParagraph3, function5, m96388r0(featureEducationParagraph3, (FeatureEducationParagraph) AbstractC25265s.m74102I0(i25, sections)), z15, c28655q4, (i36 & 7168) | FeatureEducationParagraph.$stable | (i36 & 112), 0);
                    function1 = function5;
                    i24 = i25;
                }
                boolean z213 = z15;
                AbstractC25012a.m73392y(c28655q4, false, true, true);
                c1100b = C1100b.f4583a;
                if (mediaHeader == null) {
                    c28655q4.m87150e0(-1162918353);
                    c28655q4.m87173q(false);
                    c1100b2 = c1100b;
                    c15199y5 = c15199y4;
                } else {
                    c28655q4.m87150e0(-1162918352);
                    if ((i15 & i16) == i18) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R6 = c28655q4.m87133R();
                    if (z25) {
                        objM87133R6 = new C30515j(function1, 7);
                        c28655q4.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C30515j(function1, 7);
                        c28655q4.m87172p0(objM87133R6);
                    }
                    C28655q c28655q10 = c28655q4;
                    m96380n0(c1100b, c13821r1, 0.0f, (InterfaceC4339a) objM87133R6, c28655q10, 6, 2);
                    c1100b2 = c1100b;
                    c28655q4 = c28655q10;
                    PodcastPicker podcastPicker4 = mediaHeader.getPodcastPicker();
                    podcastPlayers = podcastPicker4 != null ? podcastPicker4.getPodcastPlayers() : null;
                    if (podcastPlayers == null) {
                        c28655q4.m87150e0(25514056);
                        z26 = false;
                        c28655q4.m87173q(false);
                        c15199y5 = c15199y4;
                    } else {
                        c28655q4.m87150e0(25514057);
                        c15199y5 = c15199y4;
                        AbstractC35660d.m112871m(null, m96343Q(interfaceC28601c1), new AbstractC35664f.a(c15199y5), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(167564902, c28655q4, new C13878m(podcastPlayers, 1, function1)), false, null, null, null, false, null, C31315b.f128885a.m96323b(), c28655q4, (C35666g.f151591h << i19) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                        c28655q4 = c28655q4;
                        z26 = false;
                        c28655q4.m87173q(false);
                    }
                    c28655q4.m87173q(z26);
                }
                if (stickyButton4 != null) {
                    stickyButton2 = stickyButton4;
                    c28655q4.m87150e0(-1161668091);
                    c28655q4.m87173q(false);
                } else {
                    stickyButton2 = stickyButton4;
                    c28655q4.m87150e0(-1161668091);
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(true);
                c34858a3 = c34858a6;
                z14 = z213;
            } else {
                c28676v1 = c28676v0;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
            c0209i3 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N6);
            Modifier modifierMo3471e4 = AbstractC30060g.m92116f0(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))), c13821r1M92099U, 14).mo3471e(AbstractC1099a.m3393o(c34858a5.m109940a(mediaHeader, stickyButton3, f18), c2314t));
            c22957g = AbstractC22977m.f90652c;
            C2305k c2305k5 = C2299e.f9110M;
            stickyButton4 = stickyButton3;
            c34858a6 = c34858a5;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, c2305k5, c28655q4, 0);
            f14 = f18;
            c2305k = c2305k5;
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e4);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i8, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m9);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i3, modifierM118962N9);
            if (mediaHeader == null) {
                c28655q4.m87150e0(-1348550431);
                c28655q4.m87173q(false);
                f14 = f14;
                c2305k = c2305k;
                z24 = false;
                c0209i = c0209i;
                c28655q = c28655q4;
                c13821r1 = c13821r1M92099U;
                c34858a6 = c34858a6;
                f13 = f13;
                c23454a0 = null;
                i16 = 3670016;
                c15199y3 = c15199y3M3460c;
                c0213j = c0213j;
                c28676v3 = c28676v1;
                i17 = 1048576;
            } else {
                c28655q4.m87150e0(-1348550430);
                boolean zM87157i4 = c28655q4.m87157i(mediaHeader) | c28655q4.m87157i(interfaceC2994c0) | c28655q4.m87157i(c15199y3M3460c);
                if ((i15 & 29360128) == 8388608) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i4 | z17;
                objM87133R4 = c28655q4.m87133R();
                c28676v2 = c28676v1;
                if (z18) {
                    c28676v3 = c28676v2;
                    i16 = 3670016;
                    C27198e c27198e6 = new C27198e(mediaHeader, podcastAnalyticsEvent, interfaceC2994c0, c15199y3M3460c, 11);
                    c28655q4.m87172p0(c27198e6);
                    objM87133R4 = c27198e6;
                } else {
                    c28676v3 = c28676v2;
                    i16 = 3670016;
                    C27198e c27198e7 = new C27198e(mediaHeader, podcastAnalyticsEvent, interfaceC2994c0, c15199y3M3460c, 11);
                    c28655q4.m87172p0(c27198e7);
                    objM87133R4 = c27198e7;
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                if ((i15 & i16) == 1048576) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R5 = c28655q4.m87133R();
                if (z19) {
                    objM87133R5 = new C9812h(onNavigationEvent, 7);
                    c28655q4.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C9812h(onNavigationEvent, 7);
                    c28655q4.m87172p0(objM87133R5);
                }
                c15199y3 = c15199y3M3460c;
                i17 = 1048576;
                AbstractC31325l.m96403f(mediaHeader, c13821r1M92099U, interfaceC4339a4, (InterfaceC4351m) objM87133R5, c28655q4, MediaHeader.$stable);
                c13821r1 = c13821r1M92099U;
                c28655q = c28655q4;
                z24 = false;
                c28655q.m87173q(false);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                c28655q.m87150e0(-1347841243);
                Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "EducationSuccessToolbar");
                c28655q2 = c28655q;
                c0209i5 = c0209i3;
                c22957g2 = c22957g;
                c0209i6 = c0209i2;
                c15199y4 = c15199y3;
                c0209i4 = c0209i;
                i18 = i17;
                c28676v4 = c28676v3;
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(navBarTitle, null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                if ((i15 & i16) == i18) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R7 = c28655q2.m87133R();
                if (z27) {
                    function1 = onNavigationEvent;
                    objM87133R7 = new C30515j(function1, 6);
                    c28655q3 = c28655q2;
                    c28655q3.m87172p0(objM87133R7);
                } else {
                    function1 = onNavigationEvent;
                    objM87133R7 = new C30515j(function1, 6);
                    c28655q3 = c28655q2;
                    c28655q3.m87172p0(objM87133R7);
                }
                i19 = 3;
                C28655q c28655q11 = c28655q3;
                AbstractC6719b.m20143d(modifierM3599a4, aVar4, null, (InterfaceC4339a) objM87133R7, null, null, c28655q11, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                c28655q4 = c28655q11;
                c28655q4.m87173q(false);
            } else {
                c0209i4 = c0209i;
                boolean z214 = z24;
                c28676v4 = c28676v3;
                c0209i5 = c0209i3;
                c22957g2 = c22957g;
                c0209i6 = c0209i2;
                c15199y4 = c15199y3;
                i18 = i17;
                function1 = onNavigationEvent;
                i19 = 3;
                c28655q4 = c28655q;
                c28655q4.m87150e0(-1290427493);
                c28655q4.m87173q(z214);
            }
            if (mediaHeader != null) {
                modifierM3398t = c2314t;
            } else {
                modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, i19 * f13, 0.0f, 0.0f, 13);
            }
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q4, 0);
            iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i8, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m10);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N10);
            c28655q4.m87150e0(1131145759);
            i24 = 0;
            while (r9.hasNext()) {
                i25 = i24 + 1;
                if (i24 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                FeatureEducationParagraph featureEducationParagraph4 = (FeatureEducationParagraph) obj;
                int i37 = i15 >> 15;
                Function1 function6 = function1;
                m96333G(featureEducationParagraph4, function6, m96388r0(featureEducationParagraph4, (FeatureEducationParagraph) AbstractC25265s.m74102I0(i25, sections)), z15, c28655q4, (i37 & 7168) | FeatureEducationParagraph.$stable | (i37 & 112), 0);
                function1 = function6;
                i24 = i25;
            }
            boolean z215 = z15;
            AbstractC25012a.m73392y(c28655q4, false, true, true);
            c1100b = C1100b.f4583a;
            if (mediaHeader == null) {
                c28655q4.m87150e0(-1162918353);
                c28655q4.m87173q(false);
                c1100b2 = c1100b;
                c15199y5 = c15199y4;
            } else {
                c28655q4.m87150e0(-1162918352);
                if ((i15 & i16) == i18) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R6 = c28655q4.m87133R();
                if (z25) {
                    objM87133R6 = new C30515j(function1, 7);
                    c28655q4.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C30515j(function1, 7);
                    c28655q4.m87172p0(objM87133R6);
                }
                C28655q c28655q12 = c28655q4;
                m96380n0(c1100b, c13821r1, 0.0f, (InterfaceC4339a) objM87133R6, c28655q12, 6, 2);
                c1100b2 = c1100b;
                c28655q4 = c28655q12;
                PodcastPicker podcastPicker5 = mediaHeader.getPodcastPicker();
                podcastPlayers = podcastPicker5 != null ? podcastPicker5.getPodcastPlayers() : null;
                if (podcastPlayers == null) {
                    c28655q4.m87150e0(25514056);
                    z26 = false;
                    c28655q4.m87173q(false);
                    c15199y5 = c15199y4;
                } else {
                    c28655q4.m87150e0(25514057);
                    c15199y5 = c15199y4;
                    AbstractC35660d.m112871m(null, m96343Q(interfaceC28601c1), new AbstractC35664f.a(c15199y5), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(167564902, c28655q4, new C13878m(podcastPlayers, 1, function1)), false, null, null, null, false, null, C31315b.f128885a.m96323b(), c28655q4, (C35666g.f151591h << i19) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                    c28655q4 = c28655q4;
                    z26 = false;
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(z26);
            }
            if (stickyButton4 != null) {
                stickyButton2 = stickyButton4;
                c28655q4.m87150e0(-1161668091);
                c28655q4.m87173q(false);
            } else {
                stickyButton2 = stickyButton4;
                c28655q4.m87150e0(-1161668091);
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
            c34858a3 = c34858a6;
            z14 = z215;
        } else {
            c28655q4.m87138X();
            stickyButton2 = stickyButton;
            c34858a3 = c34858a2;
            z14 = z13;
        }
        C28677v1 c28677v1M87180u = c28655q4.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23108i(sections, navBarTitle, mediaHeader, stickyButton2, c34858a3, scrollDepthAnalyticsEvent, onNavigationEvent, podcastAnalyticsEvent, z14, i13, i14);
        }
    }

    /* JADX INFO: renamed from: Q */
    private static final C35666g m96343Q(InterfaceC28601c1 interfaceC28601c1) {
        return (C35666g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m96344R(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m96345S(MediaHeader mediaHeader, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        PodcastPicker podcastPicker = mediaHeader.getPodcastPicker();
        if (podcastPicker != null && podcastPicker.getPodcastPlayers() != null) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c15199y3, null), 3);
        }
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m96346T(Function1 function1, String url, String title) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(title, "title");
        function1.invoke(new AbstractC26598a.f(url, title));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m96347U(Function1 function1) {
        function1.invoke(AbstractC26598a.a.f105800a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m96348V(Function1 function1) {
        function1.invoke(AbstractC26598a.a.f105800a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m96349W(List list, Function1 function1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC32421a.m101225e(list, function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m96350X(List list, TextResource textResource, MediaHeader mediaHeader, StickyButton stickyButton, C34858a c34858a, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m96342P(list, textResource, mediaHeader, stickyButton, c34858a, function1, function2, interfaceC4339a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m96351Y(FeatureEducationParagraph section, Function1 function1, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z13;
        boolean z14;
        AbstractC22676k.m65750j(section, "section");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-440492890);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(section) : c28655q.m87157i(section) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C30985h(11);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            if (i17 != 0) {
                z4 = false;
            }
            FeatureEducationVideo video = section.getVideo();
            if (video == null) {
                c28655q.m87150e0(-1598382623);
                c28655q.m87173q(false);
                z14 = z4;
            } else {
                c28655q.m87150e0(-1598382622);
                EducationVideoType type = video.getType();
                int i18 = type == null ? -1 : d.f128912a[type.ordinal()];
                if (i18 == -1) {
                    c28655q.m87150e0(1078237946);
                    z14 = z4;
                    m96368h0(section, function3, z14, c28655q, FeatureEducationParagraph.$stable | (i15 & 14) | (i15 & 112) | (i15 & 896), 0);
                    c28655q.m87173q(false);
                } else if (i18 == 1 || i18 == 2) {
                    c28655q.m87150e0(1078047823);
                    m96356b0(video.getUrl(), video.getType(), c28655q, 0);
                    c28655q.m87173q(false);
                    z14 = z4;
                } else {
                    if (i18 != 3) {
                        throw AbstractC11895b.m32003v(-1212152976, c28655q, false);
                    }
                    c28655q.m87150e0(1078237946);
                    z14 = z4;
                    m96368h0(section, function3, z14, c28655q, FeatureEducationParagraph.$stable | (i15 & 14) | (i15 & 112) | (i15 & 896), 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            function2 = function3;
            z13 = z14;
        } else {
            c28655q.m87138X();
            function2 = function1;
            z13 = z4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31321h(section, function2, z13, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m96352Z(AbstractC26598a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m96354a0(FeatureEducationParagraph featureEducationParagraph, Function1 function1, boolean z4, int i13, int i14, Composer composer, int i15) {
        m96351Y(featureEducationParagraph, function1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: b0 */
    public static final void m96356b0(String url, EducationVideoType educationVideoType, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        InterfaceC31544k interfaceC31544k;
        Object obj;
        ?? r10;
        C28655q c28655q2;
        AbstractC22676k.m65750j(url, "url");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-747340479);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87153g(url) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87149e(educationVideoType == null ? -1 : educationVideoType.ordinal()) ? 32 : 16;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Object objM87133R = c28655q3.m87133R();
            Object obj2 = C28635l.f115821a;
            if (objM87133R == obj2) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q3.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q3.m87133R();
            int i15 = 3;
            if (objM87133R2 == obj2) {
                C31541j c31541j = new C31541j(context);
                C20033m c20033m = new C20033m(context);
                AbstractC24543a.m71573i(!c31541j.f130194q);
                c31541j.f130182e = new C2853n(c20033m, i15);
                AbstractC24543a.m71573i(!c31541j.f130194q);
                c31541j.f130194q = true;
                C31571u c31571u = new C31571u(c31541j);
                C31527e0 c31527e0 = new C31527e0();
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                C41060w0 c41060w0 = C41060w0.f177067E;
                List list = Collections.EMPTY_LIST;
                C41060w0 c41060w1 = C41060w0.f177067E;
                Uri uri = Uri.parse(url);
                c31571u.m381O(new C31545k0("", new C31533g0(c31527e0), uri != null ? new C31539i0(uri, null, list, c41060w1) : null, new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C31551m0.f130246h0));
                c31571u.m97225t0(true);
                c31571u.m97226u0(2);
                c31571u.m97218m0();
                c28655q3.m87172p0(c31571u);
                objM87133R2 = c31571u;
            }
            InterfaceC31544k interfaceC31544k2 = (InterfaceC31544k) objM87133R2;
            AbstractC22676k.m65747g(interfaceC31544k2);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(educationVideoType == EducationVideoType.GIF_PORTRAIT ? AbstractC1102d.m3411h(120 * 4, c2314t) : AbstractC1102d.m3411h(65 * 4, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            boolean zM87157i = c28655q3.m87157i(context) | c28655q3.m87157i(interfaceC31544k2);
            Object objM87133R3 = c28655q3.m87133R();
            if (zM87157i || objM87133R3 == obj2) {
                objM87133R3 = new C26954j0(context, interfaceC31544k2, interfaceC28601c1, 26);
                c28655q3.m87172p0(objM87133R3);
            }
            AbstractC1137a.m3601a((Function1) objM87133R3, modifierM3407d, null, c28655q3, 48, 4);
            if (m96358c0(interfaceC28601c1)) {
                c28655q3.m87150e0(-1493640529);
                interfaceC31544k = interfaceC31544k2;
                obj = obj2;
                r10 = 1;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q3, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                C28655q c28655q4 = c28655q3;
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            } else {
                interfaceC31544k = interfaceC31544k2;
                obj = obj2;
                r10 = 1;
                c28655q3.m87150e0(-1493494457);
                c28655q3.m87173q(false);
                c28655q2 = c28655q3;
            }
            c28655q2.m87173q(r10);
            boolean zM87157i2 = c28655q2.m87157i(interfaceC31544k);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R4 == obj) {
                objM87133R4 = new C3610c(interfaceC31544k, r10);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R4, c28655q2);
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(url, educationVideoType, i13, 17);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private static final boolean m96358c0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final void m96360d0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final StyledPlayerView m96362e0(Context context, InterfaceC31544k interfaceC31544k, InterfaceC28601c1 interfaceC28601c1, Context it) {
        AbstractC22676k.m65750j(it, "it");
        StyledPlayerView styledPlayerView = new StyledPlayerView(context);
        styledPlayerView.setPlayer(interfaceC31544k);
        styledPlayerView.setUseController(false);
        ((C31571u) interfaceC31544k).m97199Q(new b(interfaceC28601c1));
        return styledPlayerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final InterfaceC28620h0 m96364f0(InterfaceC31544k interfaceC31544k, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new c(interfaceC31544k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m96366g0(String str, EducationVideoType educationVideoType, int i13, Composer composer, int i14) {
        m96356b0(str, educationVideoType, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0203  */
    /* JADX WARN: Code duplicated, block: B:103:0x020a  */
    /* JADX WARN: Code duplicated, block: B:106:0x021f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0221  */
    /* JADX WARN: Code duplicated, block: B:110:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x022f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253  */
    /* JADX WARN: Code duplicated, block: B:118:0x025e  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x0109  */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0178  */
    /* JADX WARN: Code duplicated, block: B:85:0x018d  */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:89:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x019d  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01db  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e2  */
    /* JADX INFO: renamed from: h0 */
    public static final void m96368h0(FeatureEducationParagraph section, Function1 function1, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        final Function1 function3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        boolean z16;
        final FeatureEducationVideo video;
        int i18;
        boolean z17;
        boolean zM87157i;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        String title;
        TextResource textResourceM21278l;
        String playtime;
        TextResource textResourceM21278l2;
        String title2;
        TextResource textResourceM21278l3;
        boolean z18;
        boolean zM87157i2;
        Object objM87133R2;
        TextResource textResourceM21278l4;
        String title3;
        TextResource textResourceM21278l5;
        String playtime2;
        boolean z19;
        boolean zM87157i3;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(section, "section");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1507528004);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(section) : c28655q.m87157i(section) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30985h(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function3 = (Function1) objM87133R4;
                    } else {
                        function3 = function2;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    video = section.getVideo();
                    if (video == null) {
                        c28655q.m87150e0(1706506982);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1706506983);
                        Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), "EducationSuccessVideoThumbnail");
                        i18 = i15 & 112;
                        if (i18 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i = z17 | c28655q.m87157i(video);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == c28676v0) {
                            final int i24 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: re1.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i24) {
                                        case 0:
                                            return AbstractC31323j.m96372j0(function3, video);
                                        case 1:
                                            return AbstractC31323j.m96374k0(function3, video);
                                        default:
                                            return AbstractC31323j.m96376l0(function3, video);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM44101d, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        if (z16) {
                            c28655q.m87150e0(-662042644);
                            textResourceM21278l4 = null;
                            EnumC11681g enumC11681g = EnumC11681g.FULLWIDTH;
                            AbstractC22403o.c cVar = new AbstractC22403o.c(video.getThumbnail().getUrl(), 0, 0, 0, 14, null);
                            title3 = video.getTitle();
                            if (title3 != null || (textResourceM21278l5 = AbstractC8693b.m21278l(title3)) == null) {
                                textResourceM21278l5 = AbstractC8693b.m21278l("");
                            }
                            TextResource textResource = textResourceM21278l5;
                            playtime2 = video.getPlaytime();
                            if (playtime2 != null) {
                                textResourceM21278l4 = AbstractC8693b.m21278l(playtime2);
                            }
                            AbstractC11684j.d dVar = new AbstractC11684j.d(cVar, textResource, textResourceM21278l4, AbstractC8693b.m21278l(""), null, 16, null);
                            if (i18 == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i3 = z19 | c28655q.m87157i(video);
                            objM87133R3 = c28655q.m87133R();
                            if (zM87157i3 || objM87133R3 == c28676v0) {
                                final int i25 = 1;
                                objM87133R3 = new InterfaceC4339a() { // from class: re1.i
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i25) {
                                            case 0:
                                                return AbstractC31323j.m96372j0(function3, video);
                                            case 1:
                                                return AbstractC31323j.m96374k0(function3, video);
                                            default:
                                                return AbstractC31323j.m96376l0(function3, video);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC11679e.m31124q(null, enumC11681g, null, dVar, false, (InterfaceC4339a) objM87133R3, c28655q, (AbstractC11684j.d.f37780f << 9) | 24624, 5);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-661365015);
                            InterfaceC28753f.b bVar = InterfaceC28753f.b.f116454a;
                            title = video.getTitle();
                            if (title != null) {
                                textResourceM21278l = AbstractC8693b.m21278l(title);
                            } else {
                                textResourceM21278l = null;
                            }
                            playtime = video.getPlaytime();
                            if (playtime != null) {
                                textResourceM21278l2 = AbstractC8693b.m21278l(playtime);
                            } else {
                                textResourceM21278l2 = null;
                            }
                            AbstractC22403o.c cVar2 = new AbstractC22403o.c(video.getThumbnail().getUrl(), 0, 0, 0, 14, null);
                            title2 = video.getTitle();
                            if (title2 != null) {
                                textResourceM21278l3 = AbstractC8693b.m21278l(title2);
                            } else {
                                textResourceM21278l3 = null;
                            }
                            C28754g c28754g = new C28754g(null, bVar, cVar2, textResourceM21278l3, textResourceM21278l, textResourceM21278l2, null, null, true, 129, null);
                            if (i18 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87157i2 = z18 | c28655q.m87157i(video);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i2 || objM87133R2 == c28676v0) {
                                final int i26 = 2;
                                objM87133R2 = new InterfaceC4339a() { // from class: re1.i
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC31323j.m96372j0(function3, video);
                                            case 1:
                                                return AbstractC31323j.m96374k0(function3, video);
                                            default:
                                                return AbstractC31323j.m96376l0(function3, video);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28752e.m87500l(null, c28754g, (InterfaceC4339a) objM87133R2, c28655q, C28754g.f116456j << 3, 1);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    z15 = z16;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31321h(section, function3, z15, i13, i14, 1);
                }
            }
            i15 |= 384;
            z13 = z4;
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30985h(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                video = section.getVideo();
                if (video == null) {
                    c28655q.m87150e0(1706506982);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1706506983);
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), "EducationSuccessVideoThumbnail");
                    i18 = i15 & 112;
                    if (i18 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q.m87157i(video);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        final int i27 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: re1.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i27) {
                                    case 0:
                                        return AbstractC31323j.m96372j0(function3, video);
                                    case 1:
                                        return AbstractC31323j.m96374k0(function3, video);
                                    default:
                                        return AbstractC31323j.m96376l0(function3, video);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i28 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: re1.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i28) {
                                    case 0:
                                        return AbstractC31323j.m96372j0(function3, video);
                                    case 1:
                                        return AbstractC31323j.m96374k0(function3, video);
                                    default:
                                        return AbstractC31323j.m96376l0(function3, video);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM44101d2, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    if (z16) {
                        c28655q.m87150e0(-662042644);
                        textResourceM21278l4 = null;
                        EnumC11681g enumC11681g2 = EnumC11681g.FULLWIDTH;
                        AbstractC22403o.c cVar3 = new AbstractC22403o.c(video.getThumbnail().getUrl(), 0, 0, 0, 14, null);
                        title3 = video.getTitle();
                        if (title3 != null) {
                            textResourceM21278l5 = AbstractC8693b.m21278l("");
                        } else {
                            textResourceM21278l5 = AbstractC8693b.m21278l("");
                        }
                        TextResource textResource2 = textResourceM21278l5;
                        playtime2 = video.getPlaytime();
                        if (playtime2 != null) {
                            textResourceM21278l4 = AbstractC8693b.m21278l(playtime2);
                        }
                        AbstractC11684j.d dVar2 = new AbstractC11684j.d(cVar3, textResource2, textResourceM21278l4, AbstractC8693b.m21278l(""), null, 16, null);
                        if (i18 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i3 = z19 | c28655q.m87157i(video);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i3) {
                            final int i29 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: re1.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i29) {
                                        case 0:
                                            return AbstractC31323j.m96372j0(function3, video);
                                        case 1:
                                            return AbstractC31323j.m96374k0(function3, video);
                                        default:
                                            return AbstractC31323j.m96376l0(function3, video);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i210 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: re1.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i210) {
                                        case 0:
                                            return AbstractC31323j.m96372j0(function3, video);
                                        case 1:
                                            return AbstractC31323j.m96374k0(function3, video);
                                        default:
                                            return AbstractC31323j.m96376l0(function3, video);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC11679e.m31124q(null, enumC11681g2, null, dVar2, false, (InterfaceC4339a) objM87133R3, c28655q, (AbstractC11684j.d.f37780f << 9) | 24624, 5);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-661365015);
                        InterfaceC28753f.b bVar2 = InterfaceC28753f.b.f116454a;
                        title = video.getTitle();
                        if (title != null) {
                            textResourceM21278l = AbstractC8693b.m21278l(title);
                        } else {
                            textResourceM21278l = null;
                        }
                        playtime = video.getPlaytime();
                        if (playtime != null) {
                            textResourceM21278l2 = AbstractC8693b.m21278l(playtime);
                        } else {
                            textResourceM21278l2 = null;
                        }
                        AbstractC22403o.c cVar4 = new AbstractC22403o.c(video.getThumbnail().getUrl(), 0, 0, 0, 14, null);
                        title2 = video.getTitle();
                        if (title2 != null) {
                            textResourceM21278l3 = AbstractC8693b.m21278l(title2);
                        } else {
                            textResourceM21278l3 = null;
                        }
                        C28754g c28754g2 = new C28754g(null, bVar2, cVar4, textResourceM21278l3, textResourceM21278l, textResourceM21278l2, null, null, true, 129, null);
                        if (i18 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i2 = z18 | c28655q.m87157i(video);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i211 = 2;
                            objM87133R2 = new InterfaceC4339a() { // from class: re1.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211) {
                                        case 0:
                                            return AbstractC31323j.m96372j0(function3, video);
                                        case 1:
                                            return AbstractC31323j.m96374k0(function3, video);
                                        default:
                                            return AbstractC31323j.m96376l0(function3, video);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i212 = 2;
                            objM87133R2 = new InterfaceC4339a() { // from class: re1.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i212) {
                                        case 0:
                                            return AbstractC31323j.m96372j0(function3, video);
                                        case 1:
                                            return AbstractC31323j.m96374k0(function3, video);
                                        default:
                                            return AbstractC31323j.m96376l0(function3, video);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28752e.m87500l(null, c28754g2, (InterfaceC4339a) objM87133R2, c28655q, C28754g.f116456j << 3, 1);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                z15 = z16;
            } else {
                c28655q.m87138X();
                function3 = function2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31321h(section, function3, z15, i13, i14, 1);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30985h(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function3 = (Function1) objM87133R4;
                } else {
                    function3 = function2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                video = section.getVideo();
                if (video == null) {
                    c28655q.m87150e0(1706506982);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1706506983);
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), "EducationSuccessVideoThumbnail");
                    i18 = i15 & 112;
                    if (i18 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = z17 | c28655q.m87157i(video);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        final int i213 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: re1.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i213) {
                                    case 0:
                                        return AbstractC31323j.m96372j0(function3, video);
                                    case 1:
                                        return AbstractC31323j.m96374k0(function3, video);
                                    default:
                                        return AbstractC31323j.m96376l0(function3, video);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i214 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: re1.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i214) {
                                    case 0:
                                        return AbstractC31323j.m96372j0(function3, video);
                                    case 1:
                                        return AbstractC31323j.m96374k0(function3, video);
                                    default:
                                        return AbstractC31323j.m96376l0(function3, video);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM44101d3, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3362g3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    if (z16) {
                        c28655q.m87150e0(-662042644);
                        textResourceM21278l4 = null;
                        EnumC11681g enumC11681g3 = EnumC11681g.FULLWIDTH;
                        AbstractC22403o.c cVar5 = new AbstractC22403o.c(video.getThumbnail().getUrl(), 0, 0, 0, 14, null);
                        title3 = video.getTitle();
                        if (title3 != null) {
                            textResourceM21278l5 = AbstractC8693b.m21278l("");
                        } else {
                            textResourceM21278l5 = AbstractC8693b.m21278l("");
                        }
                        TextResource textResource3 = textResourceM21278l5;
                        playtime2 = video.getPlaytime();
                        if (playtime2 != null) {
                            textResourceM21278l4 = AbstractC8693b.m21278l(playtime2);
                        }
                        AbstractC11684j.d dVar3 = new AbstractC11684j.d(cVar5, textResource3, textResourceM21278l4, AbstractC8693b.m21278l(""), null, 16, null);
                        if (i18 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i3 = z19 | c28655q.m87157i(video);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i3) {
                            final int i215 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: re1.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i215) {
                                        case 0:
                                            return AbstractC31323j.m96372j0(function3, video);
                                        case 1:
                                            return AbstractC31323j.m96374k0(function3, video);
                                        default:
                                            return AbstractC31323j.m96376l0(function3, video);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i216 = 1;
                            objM87133R3 = new InterfaceC4339a() { // from class: re1.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i216) {
                                        case 0:
                                            return AbstractC31323j.m96372j0(function3, video);
                                        case 1:
                                            return AbstractC31323j.m96374k0(function3, video);
                                        default:
                                            return AbstractC31323j.m96376l0(function3, video);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC11679e.m31124q(null, enumC11681g3, null, dVar3, false, (InterfaceC4339a) objM87133R3, c28655q, (AbstractC11684j.d.f37780f << 9) | 24624, 5);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-661365015);
                        InterfaceC28753f.b bVar3 = InterfaceC28753f.b.f116454a;
                        title = video.getTitle();
                        if (title != null) {
                            textResourceM21278l = AbstractC8693b.m21278l(title);
                        } else {
                            textResourceM21278l = null;
                        }
                        playtime = video.getPlaytime();
                        if (playtime != null) {
                            textResourceM21278l2 = AbstractC8693b.m21278l(playtime);
                        } else {
                            textResourceM21278l2 = null;
                        }
                        AbstractC22403o.c cVar6 = new AbstractC22403o.c(video.getThumbnail().getUrl(), 0, 0, 0, 14, null);
                        title2 = video.getTitle();
                        if (title2 != null) {
                            textResourceM21278l3 = AbstractC8693b.m21278l(title2);
                        } else {
                            textResourceM21278l3 = null;
                        }
                        C28754g c28754g3 = new C28754g(null, bVar3, cVar6, textResourceM21278l3, textResourceM21278l, textResourceM21278l2, null, null, true, 129, null);
                        if (i18 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i2 = z18 | c28655q.m87157i(video);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i217 = 2;
                            objM87133R2 = new InterfaceC4339a() { // from class: re1.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i217) {
                                        case 0:
                                            return AbstractC31323j.m96372j0(function3, video);
                                        case 1:
                                            return AbstractC31323j.m96374k0(function3, video);
                                        default:
                                            return AbstractC31323j.m96376l0(function3, video);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i218 = 2;
                            objM87133R2 = new InterfaceC4339a() { // from class: re1.i
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i218) {
                                        case 0:
                                            return AbstractC31323j.m96372j0(function3, video);
                                        case 1:
                                            return AbstractC31323j.m96374k0(function3, video);
                                        default:
                                            return AbstractC31323j.m96376l0(function3, video);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28752e.m87500l(null, c28754g3, (InterfaceC4339a) objM87133R2, c28655q, C28754g.f116456j << 3, 1);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                z15 = z16;
            } else {
                c28655q.m87138X();
                function3 = function2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31321h(section, function3, z15, i13, i14, 1);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C30985h(12);
                    c28655q.m87172p0(objM87133R4);
                }
                function3 = (Function1) objM87133R4;
            } else {
                function3 = function2;
            }
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            video = section.getVideo();
            if (video == null) {
                c28655q.m87150e0(1706506982);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1706506983);
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), "EducationSuccessVideoThumbnail");
                i18 = i15 & 112;
                if (i18 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | c28655q.m87157i(video);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    final int i219 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: re1.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i219) {
                                case 0:
                                    return AbstractC31323j.m96372j0(function3, video);
                                case 1:
                                    return AbstractC31323j.m96374k0(function3, video);
                                default:
                                    return AbstractC31323j.m96376l0(function3, video);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i2110 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: re1.i
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2110) {
                                case 0:
                                    return AbstractC31323j.m96372j0(function3, video);
                                case 1:
                                    return AbstractC31323j.m96374k0(function3, video);
                                default:
                                    return AbstractC31323j.m96376l0(function3, video);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM44101d4, false, null, null, (InterfaceC4339a) objM87133R, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3362g4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                if (z16) {
                    c28655q.m87150e0(-662042644);
                    textResourceM21278l4 = null;
                    EnumC11681g enumC11681g4 = EnumC11681g.FULLWIDTH;
                    AbstractC22403o.c cVar7 = new AbstractC22403o.c(video.getThumbnail().getUrl(), 0, 0, 0, 14, null);
                    title3 = video.getTitle();
                    if (title3 != null) {
                        textResourceM21278l5 = AbstractC8693b.m21278l("");
                    } else {
                        textResourceM21278l5 = AbstractC8693b.m21278l("");
                    }
                    TextResource textResource4 = textResourceM21278l5;
                    playtime2 = video.getPlaytime();
                    if (playtime2 != null) {
                        textResourceM21278l4 = AbstractC8693b.m21278l(playtime2);
                    }
                    AbstractC11684j.d dVar4 = new AbstractC11684j.d(cVar7, textResource4, textResourceM21278l4, AbstractC8693b.m21278l(""), null, 16, null);
                    if (i18 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i3 = z19 | c28655q.m87157i(video);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i3) {
                        final int i2111 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: re1.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111) {
                                    case 0:
                                        return AbstractC31323j.m96372j0(function3, video);
                                    case 1:
                                        return AbstractC31323j.m96374k0(function3, video);
                                    default:
                                        return AbstractC31323j.m96376l0(function3, video);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i2112 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: re1.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2112) {
                                    case 0:
                                        return AbstractC31323j.m96372j0(function3, video);
                                    case 1:
                                        return AbstractC31323j.m96374k0(function3, video);
                                    default:
                                        return AbstractC31323j.m96376l0(function3, video);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC11679e.m31124q(null, enumC11681g4, null, dVar4, false, (InterfaceC4339a) objM87133R3, c28655q, (AbstractC11684j.d.f37780f << 9) | 24624, 5);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-661365015);
                    InterfaceC28753f.b bVar4 = InterfaceC28753f.b.f116454a;
                    title = video.getTitle();
                    if (title != null) {
                        textResourceM21278l = AbstractC8693b.m21278l(title);
                    } else {
                        textResourceM21278l = null;
                    }
                    playtime = video.getPlaytime();
                    if (playtime != null) {
                        textResourceM21278l2 = AbstractC8693b.m21278l(playtime);
                    } else {
                        textResourceM21278l2 = null;
                    }
                    AbstractC22403o.c cVar8 = new AbstractC22403o.c(video.getThumbnail().getUrl(), 0, 0, 0, 14, null);
                    title2 = video.getTitle();
                    if (title2 != null) {
                        textResourceM21278l3 = AbstractC8693b.m21278l(title2);
                    } else {
                        textResourceM21278l3 = null;
                    }
                    C28754g c28754g4 = new C28754g(null, bVar4, cVar8, textResourceM21278l3, textResourceM21278l, textResourceM21278l2, null, null, true, 129, null);
                    if (i18 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i2 = z18 | c28655q.m87157i(video);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i2113 = 2;
                        objM87133R2 = new InterfaceC4339a() { // from class: re1.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2113) {
                                    case 0:
                                        return AbstractC31323j.m96372j0(function3, video);
                                    case 1:
                                        return AbstractC31323j.m96374k0(function3, video);
                                    default:
                                        return AbstractC31323j.m96376l0(function3, video);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i2114 = 2;
                        objM87133R2 = new InterfaceC4339a() { // from class: re1.i
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2114) {
                                    case 0:
                                        return AbstractC31323j.m96372j0(function3, video);
                                    case 1:
                                        return AbstractC31323j.m96374k0(function3, video);
                                    default:
                                        return AbstractC31323j.m96376l0(function3, video);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28752e.m87500l(null, c28754g4, (InterfaceC4339a) objM87133R2, c28655q, C28754g.f116456j << 3, 1);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            z15 = z16;
        } else {
            c28655q.m87138X();
            function3 = function2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31321h(section, function3, z15, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m96370i0(AbstractC26598a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m96372j0(Function1 function1, FeatureEducationVideo featureEducationVideo) {
        function1.invoke(new AbstractC26598a.g(featureEducationVideo.getUrl()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m96374k0(Function1 function1, FeatureEducationVideo featureEducationVideo) {
        function1.invoke(new AbstractC26598a.g(featureEducationVideo.getUrl()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m96376l0(Function1 function1, FeatureEducationVideo featureEducationVideo) {
        function1.invoke(new AbstractC26598a.g(featureEducationVideo.getUrl()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m96378m0(FeatureEducationParagraph featureEducationParagraph, Function1 function1, boolean z4, int i13, int i14, Composer composer, int i15) {
        m96368h0(featureEducationParagraph, function1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n0 */
    private static final void m96380n0(InterfaceC23001u interfaceC23001u, C13821r1 c13821r1, float f13, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1608612383);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(c13821r1) ? 32 : 16;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1043) != 1042)) {
            float f14 = (i14 & 2) != 0 ? 5.0f : f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90537w);
            C2307m c2307m = C2299e.f9115x;
            Modifier modifierMo3400a = interfaceC23001u.mo3400a(modifierM3388j, c2307m);
            C2307m c2307m2 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
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
            Modifier modifierM107879c = AbstractC34132o.m107879c(Math.min(1.0f, c13821r1.f49318a.m87024x() / 200.0f), AbstractC1102d.m3407d(1.0f, c2314t));
            C38072d c38072d = C38072d.f163053a;
            f13 = f14;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM107879c, c38072d.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            c28655q.m87173q(true);
            AbstractC6719b.m20143d(AbstractC1136a.m3599a(AbstractC22953f.m66724m(C1100b.f4583a.mo3400a(c2314t, c2307m)), "EducationSuccessToolbar"), new AbstractC6721d.a(AbstractC8693b.m21267a(), null, AbstractC38963t7.m124375e(c38072d), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a, null, null, c28655q, (i15 & 7168) | (AbstractC6721d.a.f25641r << 3), 52);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        float f15 = f13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9814j(interfaceC23001u, c13821r1, f15, interfaceC4339a, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m96382o0(InterfaceC23001u interfaceC23001u, C13821r1 c13821r1, float f13, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m96380n0(interfaceC23001u, c13821r1, f13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q0 */
    private static final boolean m96386q0(FeatureEducationParagraph featureEducationParagraph) {
        List<FeatureEducationSentence> sentences = featureEducationParagraph.getSentences();
        if ((sentences instanceof Collection) && sentences.isEmpty()) {
            return false;
        }
        Iterator<T> it = sentences.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(((FeatureEducationSentence) it.next()).getStyle().getName().getType(), InterfaceC2887b.b.f11502a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    private static final boolean m96388r0(FeatureEducationParagraph featureEducationParagraph, FeatureEducationParagraph featureEducationParagraph2) {
        return m96386q0(featureEducationParagraph) && m96390s0(featureEducationParagraph2);
    }

    /* JADX INFO: renamed from: s0 */
    private static final boolean m96390s0(FeatureEducationParagraph featureEducationParagraph) {
        List<FeatureEducationSentence> sentences;
        FeatureEducationSentence featureEducationSentence;
        ScreenTextStyle style;
        C2886a name;
        InterfaceC2887b type;
        if (featureEducationParagraph == null || (sentences = featureEducationParagraph.getSentences()) == null || (featureEducationSentence = (FeatureEducationSentence) AbstractC25265s.m74100H0(sentences)) == null || (style = featureEducationSentence.getStyle()) == null || (name = style.getName()) == null || (type = name.getType()) == null) {
            return false;
        }
        return type.equals(InterfaceC2887b.i.f11509a) || type.equals(InterfaceC2887b.d.f11504a) || type.equals(InterfaceC2887b.g.f11507a);
    }
}
