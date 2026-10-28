package p12;

import am2.C1044u;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2609r;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bg0.C3226h;
import bm0.C3412o;
import c31.AbstractC3926j;
import c31.AbstractC3928l;
import c31.C3927k;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.design.model.FeatureEducationParagraph;
import com.whoop.design.model.FeatureEducationSentence;
import com.whoop.design.model.ParagraphInsets;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d41.AbstractC11679e;
import d41.AbstractC11684j;
import d41.EnumC11681g;
import e93.AbstractC12889b;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18254h;
import i91.AbstractC18255i;
import i91.C18251e;
import i91.C18253g;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import km0.C22581e;
import kotlin.C2028s;
import kotlin.C2030t;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import nq0.C27050m;
import nw0.C27198e;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.AbstractC27282u;
import ny0.C27270o;
import ny0.EnumC27284v;
import o12.AbstractC27420g;
import os0.C28308d;
import ou1.C28376a;
import ov2.C28402f;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p088dc.AbstractC11895b;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17911t;
import p21.AbstractC28752e;
import p21.C28754g;
import p21.InterfaceC28753f;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28669t1;
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
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tw0.AbstractC34217c;
import uw0.AbstractC35304n;
import uw0.AbstractC35307q;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.AbstractC35684p;
import v41.C35666g;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: p12.x */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aé\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aÓ\u0001\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\tH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0083\u0002\u0010*\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010.\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/\u001a\u0085\u0002\u00108\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020\n2\u0006\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\b\u00103\u001a\u0004\u0018\u0001022\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u00105\u001a\u0002042\b\b\u0002\u0010&\u001a\u00020\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b8\u00109\u001a\u001d\u0010=\u001a\u00020\u00052\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:H\u0007¢\u0006\u0004\b=\u0010>\u001a_\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?2\u0006\u00105\u001a\u0002042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t2\u0006\u00107\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\bA\u0010B\u001a1\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\bD\u0010E\"\u001a\u0010J\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010I¨\u0006P²\u0006\u000e\u0010K\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010M\u001a\u00020L8\nX\u008a\u0084\u0002²\u0006\u000e\u0010O\u001a\u0004\u0018\u00010N8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lp12/y;", "viewState", "", "swipeEnabled", "Lkotlin/Function0;", "Ll83/a0;", "onStoryBackPress", "onStoryNextPress", "onExitPress", "Lkotlin/Function1;", "Lp12/e;", "onSkipPress", "onFinalCTAPress", "Lp12/g;", "onButtonClicked", "Lkotlin/Function2;", "", "onMediaCardClicked", "Ltw0/c;", "onCustomBehaviorsEvent", "isBottomSheetFeatureFlagEnabled", "isProgressButtonFeatureFlagEnabled", "isArticleTileMediaCardEnabled", "Lc31/c;", "onProgressButtonEvent", "Q", "(Lp12/y;ZLc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lp12/d;", "Lkm0/e;", "bottomSheetViewState", "shouldShowSkip", "I", "(Lp12/d;ZLkm0/e;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lp12/a0;", "storyContentViewData", "Lp12/z;", "progressBarInfo", "education", "showExit", "Lgz0/m0;", "navBarLeftButtonIcon", "tapNavigationEnabled", "Y", "(Lp12/d;Lp12/a0;Lp12/z;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp12/e;ZLgz0/m0;ZLkotlin/jvm/functions/Function1;Lc93/m;ZZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lp12/f;", "imageInfo", "o0", "(Lp12/f;Landroidx/compose/runtime/Composer;I)V", "", "imageAlpha", "Lp12/e0;", "videoInfo", "Lcom/whoop/design/model/ParagraphInsets;", "insets", "Lc31/k;", "progressButtonState", "j0", "(Lp12/a0;Lp12/z;Lc93/a;Lkotlin/jvm/functions/Function1;Lp12/e;FLp12/f;Lp12/e0;Lc93/m;Lcom/whoop/design/model/ParagraphInsets;ZLgz0/m0;Lkotlin/jvm/functions/Function1;ZZZLc31/k;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "Lcom/whoop/design/model/FeatureEducationParagraph;", "paragraphs", "u0", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Lp12/b0;", "storyPrimaryCTA", "f0", "(Lp12/b0;Lcom/whoop/design/model/ParagraphInsets;Lkotlin/jvm/functions/Function1;Lp12/e;Lkotlin/jvm/functions/Function1;Lc31/k;ZLandroidx/compose/runtime/Composer;I)V", "shouldShow", "F", "(ZLgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "getPROGRESS_BUTTON_SIZE", "()F", "PROGRESS_BUTTON_SIZE", "showBottomSheet", "Lv41/g;", "bottomSheetTopBar", "Lb3/x2;", "keyboard", "onboarding-story_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28734x {

    /* JADX INFO: renamed from: a */
    private static final float f116287a = (4 * 8) + AbstractC3928l.m11957b();

    /* JADX INFO: renamed from: p12.x$a */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.ui.OnboardingStoryViewKt$OnboardingScreenWithBottomSheet$1$1", m100430f = "OnboardingStoryView.kt", m100431l = {223}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f116288w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f116289x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f116290y;

        /* JADX INFO: renamed from: p12.x$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42151a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C15199y3 f116291w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f116292x;

            public C42151a(C15199y3 c15199y3, Function1 function1) {
                this.f116291w = c15199y3;
                this.f116292x = function1;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (enumC15209z3 == EnumC15209z3.f57106w && this.f116291w.m43221b() == EnumC15209z3.f57107x) {
                    this.f116292x.invoke(AbstractC34217c.b.f143528a);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f116289x = c15199y3;
            this.f116290y = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m87464h(C15199y3 c15199y3) {
            return c15199y3.m43222c();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f116289x, this.f116290y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f116288w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C28733w(this.f116289x, 0));
                C42151a c42151a = new C42151a(this.f116289x, this.f116290y);
                this.f116288w = 1;
                if (c13084s1M87240H.collect(c42151a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: p12.x$b */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.ui.OnboardingStoryViewKt$OnboardingScreenWithBottomSheet$2$1", m100430f = "OnboardingStoryView.kt", m100431l = {233}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f116293w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f116294x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f116295y;

        /* JADX INFO: renamed from: p12.x$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28670t2 f116296w;

            public a(InterfaceC28670t2 interfaceC28670t2) {
                this.f116296w = interfaceC28670t2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC2464x2 interfaceC2464x2M87398K;
                if (enumC15209z3 == EnumC15209z3.f57106w && (interfaceC2464x2M87398K = AbstractC28734x.m87398K(this.f116296w)) != null) {
                    ((C2463x1) interfaceC2464x2M87398K).m7442a();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f116294x = c15199y3;
            this.f116295y = interfaceC28670t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m87467h(C15199y3 c15199y3) {
            return c15199y3.m43222c();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f116294x, this.f116295y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f116293w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C28733w(this.f116294x, 1));
                a aVar = new a(this.f116295y);
                this.f116293w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: p12.x$c */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.ui.OnboardingStoryViewKt$OnboardingScreenWithBottomSheet$3$1$1", m100430f = "OnboardingStoryView.kt", m100431l = {242}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f116297w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f116298x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC35664f.a aVar, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f116298x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f116298x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f116297w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f116298x.getModalBottomSheetState();
                this.f116297w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: p12.x$d */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.ui.OnboardingStoryViewKt$OnboardingScreenWithBottomSheet$5$1$1$1", m100430f = "OnboardingStoryView.kt", m100431l = {265}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f116299w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f116300x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC35664f.a aVar, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f116300x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f116300x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f116299w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f116300x.getModalBottomSheetState();
                this.f116299w = 1;
                if (c15199y3M112950a.m43225f(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: p12.x$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f116301a;

        static {
            int[] iArr = new int[EnumC28706a.values().length];
            try {
                iArr[EnumC28706a.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28706a.LOTTIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f116301a = iArr;
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m87393F(boolean z4, EnumC16313m0 enumC16313m0, InterfaceC4339a onExitPress, Composer composer, int i13, int i14) {
        int i15;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(onExitPress, "onExitPress");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2108029308);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onExitPress) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            EnumC16313m0 enumC16313m2 = i16 != 0 ? null : enumC16313m0;
            if (z4) {
                c28655q.m87150e0(710846578);
                int whoopIcon = enumC16313m2 != null ? enumC16313m2.toWhoopIcon() : AbstractC39383f.m125595a(C38072d.f163053a);
                float f13 = 2 * 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, f13, f13, 0.0f, 0.0f, 12);
                C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, whoopIcon, null, null, null, true, false, false, 0.0f, false, 988, null);
                boolean z13 = (i15 & 896) == 256;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C28718h(onExitPress, 6);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27242b1.m82092d(c27270o, "Exit Story Icon Button", null, modifierM3398t, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k | 3120, 4);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(711350142);
                c28655q.m87173q(false);
            }
            enumC16313m1 = enumC16313m2;
        } else {
            c28655q.m87138X();
            enumC16313m1 = enumC16313m0;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(z4, enumC16313m1, onExitPress, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m87394G(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m87395H(boolean z4, EnumC16313m0 enumC16313m0, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m87393F(z4, enumC16313m0, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0215  */
    /* JADX WARN: Code duplicated, block: B:142:0x0240  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    private static final void m87396I(final C28712d c28712d, final boolean z4, final C22581e c22581e, final InterfaceC4339a interfaceC4339a, final InterfaceC4339a interfaceC4339a2, final InterfaceC4339a interfaceC4339a3, final Function1 function1, final Function1 function2, final InterfaceC4351m interfaceC4351m, final Function1 function3, final boolean z13, final boolean z14, final boolean z15, final Function1 function4, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        C28676v0 c28676v0;
        InterfaceC30057d interfaceC30057d;
        boolean zM87157i;
        Object objM87133R;
        boolean zM87157i2;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(11281630);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c28712d) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(c22581e) : c28655q.m87157i(c22581e) ? 256 : 128;
        }
        int i17 = i13 & 3072;
        int i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q.m87157i(function1) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= c28655q.m87157i(function2) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c28655q.m87157i(interfaceC4351m) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c28655q.m87157i(function3) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q.m87155h(z13) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87155h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87155h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q.m87157i(function4)) {
                i18 = 2048;
            }
            i16 |= i18;
        }
        if (c28655q.m87135U(i15 & 1, ((306783379 & i15) == 306783378 && (i16 & 1171) == 1170) ? false : true)) {
            Object objM87133R3 = c28655q.m87133R();
            TextResource textResource = null;
            Object[] objArr = 0;
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R3 == c28676v1) {
                objM87133R3 = AbstractC28683x.m87272z(new C35666g(c22581e.getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            int iIndexOf = c22581e.m65420e().indexOf(c22581e.getCurrentCategory());
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v1) {
                objM87133R4 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R4);
            }
            final InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R4;
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            final AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
            boolean zM87157i3 = c28655q.m87157i(c15199y3M3460c) | ((i15 & 1879048192) == 536870912);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i3) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R5 != c28676v0) {
                    interfaceC30057d = null;
                }
                C23454a0 c23454a0 = C23454a0.f92919a;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, c23454a0);
                zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new b(c15199y3M3460c, interfaceC28601c1M87238F, interfaceC30057d);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
                AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                C35666g c35666gM87397J = m87397J(interfaceC28601c1);
                AbstractC35664f.a aVar2 = new AbstractC35664f.a(c15199y3M3460c);
                EnumC39333f enumC39333f = EnumC39333f.TRANSPARENT;
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2028s(interfaceC2994c0, aVar, 3);
                    c28655q.m87172p0(objM87133R2);
                }
                C37816b c37816bM121344e = AbstractC37817c.m121344e(-1814876148, c28655q, new C2030t(c22581e, interfaceC2994c0, aVar, iIndexOf, function3));
                c28655q = c28655q;
                AbstractC35660d.m112871m(null, c35666gM87397J, aVar2, enumC39333f, (InterfaceC4339a) objM87133R2, null, null, c37816bM121344e, false, bVar, null, null, false, null, AbstractC37817c.m121344e(599302608, c28655q, new InterfaceC4351m() { // from class: p12.t
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC28734x.m87401N(c28712d, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, function1, interfaceC2994c0, aVar, function3, function2, interfaceC4351m, z4, z13, z14, z15, function4, (Composer) obj, iIntValue);
                    }
                }), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15713);
            }
            interfaceC30057d = null;
            objM87133R5 = new a(c15199y3M3460c, function3, null);
            c28655q.m87172p0(objM87133R5);
            C23454a0 c23454a1 = C23454a0.f92919a;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, c23454a1);
            zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new b(c15199y3M3460c, interfaceC28601c1M87238F, interfaceC30057d);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new b(c15199y3M3460c, interfaceC28601c1M87238F, interfaceC30057d);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a1);
            AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
            C35666g c35666gM87397J2 = m87397J(interfaceC28601c1);
            AbstractC35664f.a aVar3 = new AbstractC35664f.a(c15199y3M3460c);
            EnumC39333f enumC39333f2 = EnumC39333f.TRANSPARENT;
            zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R2 = new C2028s(interfaceC2994c0, aVar, 3);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2028s(interfaceC2994c0, aVar, 3);
                c28655q.m87172p0(objM87133R2);
            }
            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-1814876148, c28655q, new C2030t(c22581e, interfaceC2994c0, aVar, iIndexOf, function3));
            c28655q = c28655q;
            AbstractC35660d.m112871m(null, c35666gM87397J2, aVar3, enumC39333f2, (InterfaceC4339a) objM87133R2, null, null, c37816bM121344e2, false, bVar2, null, null, false, null, AbstractC37817c.m121344e(599302608, c28655q, new InterfaceC4351m() { // from class: p12.t
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC28734x.m87401N(c28712d, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, function1, interfaceC2994c0, aVar, function3, function2, interfaceC4351m, z4, z13, z14, z15, function4, (Composer) obj, iIntValue);
                }
            }), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15713);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p12.u
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC28734x.m87403P(c28712d, z4, c22581e, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, function1, function2, interfaceC4351m, function3, z13, z14, z15, function4, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: J */
    private static final C35666g m87397J(InterfaceC28601c1 interfaceC28601c1) {
        return (C35666g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC2464x2 m87398K(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC2464x2) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m87399L(InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m87400M(C22581e c22581e, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, int i13, Function1 function1, InterfaceC23013y BottomSheet, Composer composer, int i14) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            AbstractC35307q.m112094g(c22581e, interfaceC2994c0, aVar, i13, false, function1, null, c28655q, C22581e.f88865n | (AbstractC35664f.a.f151587c << 6), 80);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m87401N(C28712d c28712d, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Function1 function1, final InterfaceC2994c0 interfaceC2994c0, final AbstractC35664f.a aVar, final Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, boolean z4, boolean z13, boolean z14, boolean z15, Function1 function4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C28707a0 c28707a0M87350f = c28712d.getStoryContent();
            C28736z c28736zM87347c = c28712d.getProgressBarInfo();
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar) | c28655q.m87153g(function2);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new Function1() { // from class: p12.o
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC28734x.m87402O(interfaceC2994c0, function2, aVar, (C28714e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            m87412Y(c28712d, c28707a0M87350f, c28736zM87347c, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, function1, (Function1) objM87133R, c28712d.getEducationType(), c28712d.getShowExitButton(), c28712d.getNavBarLeftButtonIcon(), c28712d.getTapNavigationEnabled(), function3, interfaceC4351m, z4, z13, z14, z15, function4, c28655q, ParagraphInsets.$stable << 6, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m87402O(InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC35664f.a aVar, C28714e it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(aVar, null), 3);
        function1.invoke(new AbstractC34217c.d(it.getId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m87403P(C28712d c28712d, boolean z4, C22581e c22581e, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Function1 function1, Function1 function2, InterfaceC4351m interfaceC4351m, Function1 function3, boolean z13, boolean z14, boolean z15, Function1 function4, int i13, int i14, Composer composer, int i15) {
        m87396I(c28712d, z4, c22581e, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, function1, function2, interfaceC4351m, function3, z13, z14, z15, function4, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x018c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0192  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:155:0x023e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0242  */
    /* JADX WARN: Code duplicated, block: B:161:0x0263  */
    /* JADX WARN: Code duplicated, block: B:164:0x0274  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:168:0x0339  */
    /* JADX WARN: Code duplicated, block: B:170:0x0347  */
    /* JADX WARN: Code duplicated, block: B:171:0x0360  */
    /* JADX WARN: Code duplicated, block: B:178:0x0383  */
    /* JADX WARN: Code duplicated, block: B:180:0x038d  */
    /* JADX WARN: Code duplicated, block: B:181:0x038f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0398  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:193:0x042c  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:201:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:208:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:210:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:212:0x050f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0522  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [km0.e] */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX INFO: renamed from: Q */
    public static final void m87404Q(final C28735y viewState, final boolean z4, final InterfaceC4339a onStoryBackPress, final InterfaceC4339a onStoryNextPress, final InterfaceC4339a onExitPress, final Function1 onSkipPress, final Function1 onFinalCTAPress, Function1 function1, final InterfaceC4351m onMediaCardClicked, Function1 function2, boolean z13, boolean z14, boolean z15, final Function1 onProgressButtonEvent, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        Function1 function3;
        int i17;
        int i18;
        int i19;
        boolean z16;
        final Function1 function4;
        final boolean z17;
        final boolean z18;
        final boolean z19;
        final Function1 function5;
        ?? r10;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Function1 function7;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ?? M87339a;
        C28655q c28655q;
        InterfaceC28601c1 interfaceC28601c2;
        Function1 function8;
        C28712d c28712dM87471c;
        C28708b c28708bM87334a;
        FeatureEducationType featureEducationTypeM87353b;
        FeatureEducationType featureEducationType;
        Function1 function9;
        boolean z27;
        boolean z28;
        Function1 function10;
        boolean z29;
        Function1 function11;
        boolean z34;
        C28655q c28655q2;
        boolean z35;
        Object obj;
        C28709b0 c28709b0M87338a;
        C28655q c28655q3;
        boolean z36;
        boolean z37;
        boolean z38;
        ?? r14;
        ?? r15;
        Function1 function12;
        ?? r16;
        Object obj2;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onStoryBackPress, "onStoryBackPress");
        AbstractC22676k.m65750j(onStoryNextPress, "onStoryNextPress");
        AbstractC22676k.m65750j(onExitPress, "onExitPress");
        AbstractC22676k.m65750j(onSkipPress, "onSkipPress");
        AbstractC22676k.m65750j(onFinalCTAPress, "onFinalCTAPress");
        AbstractC22676k.m65750j(onMediaCardClicked, "onMediaCardClicked");
        AbstractC22676k.m65750j(onProgressButtonEvent, "onProgressButtonEvent");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(2024270127);
        if ((i13 & 6) == 0) {
            i16 = (c28655q4.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q4.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q4.m87157i(onStoryBackPress) ? 256 : 128;
        }
        int i24 = i13 & 3072;
        int i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i24 == 0) {
            i16 |= c28655q4.m87157i(onStoryNextPress) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i16 |= c28655q4.m87157i(onExitPress) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i16 |= c28655q4.m87157i(onSkipPress) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i16 |= c28655q4.m87157i(onFinalCTAPress) ? 1048576 : 524288;
        }
        int i26 = i15 & 128;
        if (i26 != 0) {
            i16 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            i16 |= c28655q4.m87157i(function1) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i16 |= c28655q4.m87157i(onMediaCardClicked) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i27 = i15 & 512;
        if (i27 != 0) {
            i16 |= 805306368;
            function3 = function2;
        } else {
            function3 = function2;
            if ((i13 & 805306368) == 0) {
                i16 |= c28655q4.m87157i(function3) ? 536870912 : 268435456;
            }
        }
        int i28 = i16;
        int i29 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i29 != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = i14 | (c28655q4.m87155h(z13) ? 4 : 2);
        } else {
            i17 = i14;
        }
        int i34 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i34 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            i17 |= c28655q4.m87155h(z14) ? 32 : 16;
        }
        int i35 = i17;
        int i36 = i15 & 4096;
        if (i36 == 0) {
            i18 = i35;
            if ((i14 & 384) == 0) {
                i18 |= c28655q4.m87155h(z15) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q4.m87157i(onProgressButtonEvent)) {
                    i25 = 2048;
                }
                i18 |= i25;
            }
            i19 = i18;
            if ((i28 & 306783379) == 306783378 || (i19 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q4.m87135U(i28 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C28402f(15);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    function6 = (Function1) objM87133R3;
                } else {
                    function6 = function1;
                }
                if (i27 != 0) {
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C28402f(17);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                }
                if (i29 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i34 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                if (i36 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
                function7 = function6;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q4, 54);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3406c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                M87339a = 0;
                M87339a = 0;
                if (viewState.getIsLoading()) {
                    c28655q4.m87150e0(1496533229);
                    Function1 function13 = function3;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, new TextResource.C8688b(AbstractC27420g.f110471f, M87339a, 2, M87339a), null, null, null, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.c.f138472f | (TextResource.C8688b.f25889c << 3), 0, 4092);
                    C28655q c28655q5 = c28655q4;
                    c28655q5.m87173q(false);
                    function10 = function7;
                    c28676v0 = c28676v0;
                    function11 = function13;
                    interfaceC28601c2 = interfaceC28601c1;
                    r14 = 0;
                    z29 = z25;
                    z28 = z26;
                    z38 = true;
                    r15 = c28655q5;
                } else {
                    c28655q = c28655q4;
                    interfaceC28601c2 = interfaceC28601c1;
                    function8 = function3;
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(1496797256);
                        int i37 = 2;
                        AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC27420g.f110467b, M87339a, i37, M87339a), false, null, 6, null);
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC27420g.f110471f, M87339a, i37, M87339a);
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC27420g.f110472g, M87339a, i37, M87339a);
                        int i38 = AbstractC33208p0.b.f138467h;
                        int i39 = TextResource.C8688b.f25889c;
                        AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, onExitPress, false, false, null, null, null, false, false, c28655q, i38 | (i39 << 3) | (i39 << 9) | (i28 & 57344), 0, 4068);
                        C28655q c28655q6 = c28655q;
                        c28655q6.m87173q(false);
                        function10 = function7;
                        c28676v0 = c28676v0;
                        function11 = function8;
                        interfaceC28601c2 = interfaceC28601c2;
                        z29 = z25;
                        z28 = z26;
                        z38 = true;
                        r14 = 0;
                        r15 = c28655q6;
                    } else {
                        c28655q.m87150e0(1497332409);
                        c28712dM87471c = viewState.getDisplaying();
                        if (c28712dM87471c == null) {
                            c28655q.m87150e0(1497332408);
                            c28655q.m87173q(false);
                            function10 = function7;
                            c28676v0 = c28676v0;
                            function11 = function8;
                            interfaceC28601c2 = interfaceC28601c2;
                            z36 = true;
                            z37 = false;
                            z29 = z25;
                            z28 = z26;
                            c28655q3 = c28655q;
                        } else {
                            c28655q.m87150e0(1497332409);
                            c28708bM87334a = c28712dM87471c.getStoryContent().getCtaButtons();
                            if (c28708bM87334a != null && (c28709b0M87338a = c28708bM87334a.getStoryPrimaryCTA()) != null) {
                                M87339a = c28709b0M87338a.getBottomSheetViewState();
                            }
                            featureEducationTypeM87353b = c28712dM87471c.getEducationType().getType();
                            featureEducationType = FeatureEducationType.CUSTOMIZE_JOURNAL;
                            if (featureEducationTypeM87353b == featureEducationType) {
                                c28655q.m87150e0(-1603402655);
                                if ((i28 & 1879048192) == 536870912) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                Object objM87133R4 = c28655q.m87133R();
                                obj = objM87133R4;
                                if (z35 || objM87133R4 == c28676v0) {
                                    C2609r c2609r = new C2609r(function8, interfaceC28601c2, 28);
                                    c28655q.m87172p0(c2609r);
                                    obj = c2609r;
                                }
                                function9 = (Function1) obj;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-1603098855);
                                c28655q.m87173q(false);
                                function9 = onFinalCTAPress;
                            }
                            if (c28712dM87471c.getEducationType().getType() == featureEducationType || M87339a == 0 || z24) {
                                z27 = false;
                                Function1 function14 = function9;
                                z28 = z26;
                                function10 = function7;
                                c28655q.m87150e0(-1601768614);
                                z29 = z25;
                                int i44 = i28 << 3;
                                int i45 = i19 << 12;
                                function11 = function8;
                                z34 = true;
                                m87412Y(c28712dM87471c, c28712dM87471c.getStoryContent(), c28712dM87471c.getProgressBarInfo(), onStoryBackPress, onStoryNextPress, onExitPress, onSkipPress, function14, c28712dM87471c.getEducationType(), c28712dM87471c.getShowExitButton(), c28712dM87471c.getNavBarLeftButtonIcon(), c28712dM87471c.getTapNavigationEnabled(), function10, onMediaCardClicked, z4, z29, z28, viewState.getShouldShowSkip(), onProgressButtonEvent, c28655q, (ParagraphInsets.$stable << 6) | (i44 & 7168) | (i44 & 57344) | (i44 & 458752) | (i44 & 3670016), ((i19 << 15) & 234881024) | ((i28 >> 15) & 8064) | ((i28 << 9) & 57344) | (i45 & 458752) | (i45 & 3670016), 0);
                                C28655q c28655q7 = c28655q;
                                c28655q7.m87173q(false);
                                c28655q2 = c28655q7;
                            } else {
                                c28655q.m87150e0(-1602841462);
                                boolean zM87473e = viewState.getShouldShowSkip();
                                int i46 = i28 << 3;
                                int i47 = (i46 & 7168) | (i28 & 112) | (C22581e.f88865n << 6) | (i46 & 57344) | (i46 & 458752) | (i46 & 3670016) | (i28 & 29360128) | (i28 & 234881024) | (i28 & 1879048192);
                                int i48 = ((i19 >> 3) & 126) | (i19 & 7168);
                                z27 = false;
                                boolean z39 = z25;
                                boolean z44 = z26;
                                m87396I(c28712dM87471c, z4, M87339a, onStoryBackPress, onStoryNextPress, onExitPress, onSkipPress, function7, onMediaCardClicked, function8, z39, z44, zM87473e, onProgressButtonEvent, c28655q, i47, i48);
                                z28 = z44;
                                C28655q c28655q8 = c28655q;
                                c28655q8.m87173q(false);
                                function10 = function7;
                                function11 = function8;
                                z29 = z39;
                                z34 = true;
                                c28655q2 = c28655q8;
                            }
                            c28655q2.m87173q(z27);
                            z37 = z27;
                            z36 = z34;
                            c28655q3 = c28655q2;
                        }
                        c28655q3.m87173q(z37);
                        r14 = z37;
                        z38 = z36;
                        r15 = c28655q3;
                    }
                }
                r15.m87173q(z38);
                if (m87407T(interfaceC28601c2)) {
                    r15.m87150e0(-599438124);
                    List<String> listM87472d = viewState.m87472d();
                    if ((i28 & 1879048192) != 536870912) {
                        r16 = z38;
                        r16 = r14;
                    }
                    r16 = z38;
                    Object objM87133R5 = r15.m87133R();
                    if (r16 == 0 || objM87133R5 == c28676v0) {
                        function12 = function11;
                        C28733w c28733w = new C28733w(function12, 2);
                        r15.m87172p0(c28733w);
                        obj2 = c28733w;
                    } else {
                        function12 = function11;
                        obj2 = objM87133R5;
                    }
                    AbstractC35304n.m112067r(listM87472d, (InterfaceC4339a) obj2, r15, r14, r14);
                    r15.m87173q(r14);
                } else {
                    function12 = function11;
                    r15.m87150e0(-599193069);
                    r15.m87173q(r14);
                }
                function5 = function12;
                function4 = function10;
                z18 = z29;
                z19 = z28;
                z17 = z24;
                r10 = r15;
            } else {
                C28655q c28655q9 = c28655q4;
                c28655q9.m87138X();
                function4 = function1;
                z17 = z13;
                z18 = z14;
                z19 = z15;
                function5 = function3;
                r10 = c28655q9;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p12.s
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC28734x.m87411X(viewState, z4, onStoryBackPress, onStoryNextPress, onExitPress, onSkipPress, onFinalCTAPress, function4, onMediaCardClicked, function5, z17, z18, z19, onProgressButtonEvent, i13, i14, i15, (Composer) obj3, iIntValue);
                    }
                };
            }
        }
        i18 = i35 | 384;
        if ((i14 & 3072) == 0) {
            if (c28655q4.m87157i(onProgressButtonEvent)) {
                i25 = 2048;
            }
            i18 |= i25;
        }
        i19 = i18;
        if ((i28 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q4.m87135U(i28 & 1, z16)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R3 = c28655q4.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C28402f(15);
                    c28655q4.m87172p0(objM87133R3);
                }
                function6 = (Function1) objM87133R3;
            } else {
                function6 = function1;
            }
            if (i27 != 0) {
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C28402f(17);
                    c28655q4.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            }
            if (i29 != 0) {
                z24 = false;
            } else {
                z24 = z13;
            }
            if (i34 != 0) {
                z25 = false;
            } else {
                z25 = z14;
            }
            if (i36 != 0) {
                z26 = false;
            } else {
                z26 = z15;
            }
            objM87133R = c28655q4.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            function7 = function6;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q4, 54);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3406c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
            M87339a = 0;
            M87339a = 0;
            if (viewState.getIsLoading()) {
                c28655q4.m87150e0(1496533229);
                Function1 function15 = function3;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, new TextResource.C8688b(AbstractC27420g.f110471f, M87339a, 2, M87339a), null, null, null, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.c.f138472f | (TextResource.C8688b.f25889c << 3), 0, 4092);
                C28655q c28655q10 = c28655q4;
                c28655q10.m87173q(false);
                function10 = function7;
                c28676v0 = c28676v0;
                function11 = function15;
                interfaceC28601c2 = interfaceC28601c1;
                r14 = 0;
                z29 = z25;
                z28 = z26;
                z38 = true;
                r15 = c28655q10;
            } else {
                c28655q = c28655q4;
                interfaceC28601c2 = interfaceC28601c1;
                function8 = function3;
                if (viewState.getIsError()) {
                    c28655q.m87150e0(1496797256);
                    int i310 = 2;
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC27420g.f110467b, M87339a, i310, M87339a), false, null, 6, null);
                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC27420g.f110471f, M87339a, i310, M87339a);
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC27420g.f110472g, M87339a, i310, M87339a);
                    int i311 = AbstractC33208p0.b.f138467h;
                    int i312 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar2, c8688b3, null, c8688b4, onExitPress, false, false, null, null, null, false, false, c28655q, i311 | (i312 << 3) | (i312 << 9) | (i28 & 57344), 0, 4068);
                    C28655q c28655q11 = c28655q;
                    c28655q11.m87173q(false);
                    function10 = function7;
                    c28676v0 = c28676v0;
                    function11 = function8;
                    interfaceC28601c2 = interfaceC28601c2;
                    z29 = z25;
                    z28 = z26;
                    z38 = true;
                    r14 = 0;
                    r15 = c28655q11;
                } else {
                    c28655q.m87150e0(1497332409);
                    c28712dM87471c = viewState.getDisplaying();
                    if (c28712dM87471c == null) {
                        c28655q.m87150e0(1497332408);
                        c28655q.m87173q(false);
                        function10 = function7;
                        c28676v0 = c28676v0;
                        function11 = function8;
                        interfaceC28601c2 = interfaceC28601c2;
                        z36 = true;
                        z37 = false;
                        z29 = z25;
                        z28 = z26;
                        c28655q3 = c28655q;
                    } else {
                        c28655q.m87150e0(1497332409);
                        c28708bM87334a = c28712dM87471c.getStoryContent().getCtaButtons();
                        if (c28708bM87334a != null) {
                            M87339a = c28709b0M87338a.getBottomSheetViewState();
                        }
                        featureEducationTypeM87353b = c28712dM87471c.getEducationType().getType();
                        featureEducationType = FeatureEducationType.CUSTOMIZE_JOURNAL;
                        if (featureEducationTypeM87353b == featureEducationType) {
                            c28655q.m87150e0(-1603402655);
                            if ((i28 & 1879048192) == 536870912) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            Object objM87133R6 = c28655q.m87133R();
                            obj = objM87133R6;
                            if (z35) {
                                C2609r c2609r2 = new C2609r(function8, interfaceC28601c2, 28);
                                c28655q.m87172p0(c2609r2);
                                obj = c2609r2;
                            } else {
                                C2609r c2609r3 = new C2609r(function8, interfaceC28601c2, 28);
                                c28655q.m87172p0(c2609r3);
                                obj = c2609r3;
                            }
                            function9 = (Function1) obj;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1603098855);
                            c28655q.m87173q(false);
                            function9 = onFinalCTAPress;
                        }
                        if (c28712dM87471c.getEducationType().getType() == featureEducationType) {
                            z27 = false;
                            Function1 function16 = function9;
                            z28 = z26;
                            function10 = function7;
                            c28655q.m87150e0(-1601768614);
                            z29 = z25;
                            int i49 = i28 << 3;
                            int i410 = i19 << 12;
                            function11 = function8;
                            z34 = true;
                            m87412Y(c28712dM87471c, c28712dM87471c.getStoryContent(), c28712dM87471c.getProgressBarInfo(), onStoryBackPress, onStoryNextPress, onExitPress, onSkipPress, function16, c28712dM87471c.getEducationType(), c28712dM87471c.getShowExitButton(), c28712dM87471c.getNavBarLeftButtonIcon(), c28712dM87471c.getTapNavigationEnabled(), function10, onMediaCardClicked, z4, z29, z28, viewState.getShouldShowSkip(), onProgressButtonEvent, c28655q, (ParagraphInsets.$stable << 6) | (i49 & 7168) | (i49 & 57344) | (i49 & 458752) | (i49 & 3670016), ((i19 << 15) & 234881024) | ((i28 >> 15) & 8064) | ((i28 << 9) & 57344) | (i410 & 458752) | (i410 & 3670016), 0);
                            C28655q c28655q12 = c28655q;
                            c28655q12.m87173q(false);
                            c28655q2 = c28655q12;
                        } else {
                            z27 = false;
                            Function1 function17 = function9;
                            z28 = z26;
                            function10 = function7;
                            c28655q.m87150e0(-1601768614);
                            z29 = z25;
                            int i411 = i28 << 3;
                            int i412 = i19 << 12;
                            function11 = function8;
                            z34 = true;
                            m87412Y(c28712dM87471c, c28712dM87471c.getStoryContent(), c28712dM87471c.getProgressBarInfo(), onStoryBackPress, onStoryNextPress, onExitPress, onSkipPress, function17, c28712dM87471c.getEducationType(), c28712dM87471c.getShowExitButton(), c28712dM87471c.getNavBarLeftButtonIcon(), c28712dM87471c.getTapNavigationEnabled(), function10, onMediaCardClicked, z4, z29, z28, viewState.getShouldShowSkip(), onProgressButtonEvent, c28655q, (ParagraphInsets.$stable << 6) | (i411 & 7168) | (i411 & 57344) | (i411 & 458752) | (i411 & 3670016), ((i19 << 15) & 234881024) | ((i28 >> 15) & 8064) | ((i28 << 9) & 57344) | (i412 & 458752) | (i412 & 3670016), 0);
                            C28655q c28655q13 = c28655q;
                            c28655q13.m87173q(false);
                            c28655q2 = c28655q13;
                        }
                        c28655q2.m87173q(z27);
                        z37 = z27;
                        z36 = z34;
                        c28655q3 = c28655q2;
                    }
                    c28655q3.m87173q(z37);
                    r14 = z37;
                    z38 = z36;
                    r15 = c28655q3;
                }
            }
            r15.m87173q(z38);
            if (m87407T(interfaceC28601c2)) {
                r15.m87150e0(-599438124);
                List<String> listM87472d2 = viewState.m87472d();
                if ((i28 & 1879048192) != 536870912) {
                    r16 = z38;
                    r16 = r14;
                }
                r16 = z38;
                Object objM87133R7 = r15.m87133R();
                if (r16 == 0) {
                    function12 = function11;
                    C28733w c28733w2 = new C28733w(function12, 2);
                    r15.m87172p0(c28733w2);
                    obj2 = c28733w2;
                } else {
                    function12 = function11;
                    C28733w c28733w3 = new C28733w(function12, 2);
                    r15.m87172p0(c28733w3);
                    obj2 = c28733w3;
                }
                AbstractC35304n.m112067r(listM87472d2, (InterfaceC4339a) obj2, r15, r14, r14);
                r15.m87173q(r14);
            } else {
                function12 = function11;
                r15.m87150e0(-599193069);
                r15.m87173q(r14);
            }
            function5 = function12;
            function4 = function10;
            z18 = z29;
            z19 = z28;
            z17 = z24;
            r10 = r15;
        } else {
            C28655q c28655q14 = c28655q4;
            c28655q14.m87138X();
            function4 = function1;
            z17 = z13;
            z18 = z14;
            z19 = z15;
            function5 = function3;
            r10 = c28655q14;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p12.s
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC28734x.m87411X(viewState, z4, onStoryBackPress, onStoryNextPress, onExitPress, onSkipPress, onFinalCTAPress, function4, onMediaCardClicked, function5, z17, z18, z19, onProgressButtonEvent, i13, i14, i15, (Composer) obj3, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m87405R(EnumC28717g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m87406S(AbstractC34217c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final boolean m87407T(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: U */
    private static final void m87408U(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m87409V(Function1 function1, InterfaceC28601c1 interfaceC28601c1, C28714e featureEducation) {
        AbstractC22676k.m65750j(featureEducation, "featureEducation");
        function1.invoke(new AbstractC34217c.d(featureEducation.getId()));
        m87408U(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m87410W(Function1 function1) {
        function1.invoke(AbstractC34217c.b.f143528a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m87411X(C28735y c28735y, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Function1 function1, Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, Function1 function4, boolean z13, boolean z14, boolean z15, Function1 function5, int i13, int i14, int i15, Composer composer, int i16) {
        m87404Q(c28735y, z4, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, function1, function2, function3, interfaceC4351m, function4, z13, z14, z15, function5, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:123:0x01de  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:136:0x0201  */
    /* JADX WARN: Code duplicated, block: B:140:0x020b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0211  */
    /* JADX WARN: Code duplicated, block: B:146:0x021b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0221  */
    /* JADX WARN: Code duplicated, block: B:156:0x023f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x024b  */
    /* JADX WARN: Code duplicated, block: B:161:0x024d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0251  */
    /* JADX WARN: Code duplicated, block: B:164:0x0254  */
    /* JADX WARN: Code duplicated, block: B:167:0x0259  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:172:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Y */
    public static final void m87412Y(final C28712d viewState, final C28707a0 storyContentViewData, final C28736z progressBarInfo, final InterfaceC4339a onStoryBackPress, final InterfaceC4339a onStoryNextPress, final InterfaceC4339a onExitPress, final Function1 onSkipPress, final Function1 onFinalCTAPress, final C28714e education, boolean z4, EnumC16313m0 enumC16313m0, boolean z13, final Function1 onButtonClicked, final InterfaceC4351m onMediaCardClicked, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final Function1 onProgressButtonEvent, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z18;
        C28655q c28655q;
        final boolean z19;
        final EnumC16313m0 enumC16313m1;
        final boolean z24;
        C28677v1 c28677v1M87180u;
        final boolean z25;
        final EnumC16313m0 enumC16313m2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(storyContentViewData, "storyContentViewData");
        AbstractC22676k.m65750j(progressBarInfo, "progressBarInfo");
        AbstractC22676k.m65750j(onStoryBackPress, "onStoryBackPress");
        AbstractC22676k.m65750j(onStoryNextPress, "onStoryNextPress");
        AbstractC22676k.m65750j(onExitPress, "onExitPress");
        AbstractC22676k.m65750j(onSkipPress, "onSkipPress");
        AbstractC22676k.m65750j(onFinalCTAPress, "onFinalCTAPress");
        AbstractC22676k.m65750j(education, "education");
        AbstractC22676k.m65750j(onButtonClicked, "onButtonClicked");
        AbstractC22676k.m65750j(onMediaCardClicked, "onMediaCardClicked");
        AbstractC22676k.m65750j(onProgressButtonEvent, "onProgressButtonEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1011754111);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87157i(storyContentViewData) ? 32 : 16;
        }
        int i26 = i16;
        if ((i13 & 384) == 0) {
            i17 = i26 | ((i13 & 512) == 0 ? c28655q2.m87153g(progressBarInfo) : c28655q2.m87157i(progressBarInfo) ? 256 : 128);
        } else {
            i17 = i26;
        }
        int i27 = i17;
        int i28 = i13 & 3072;
        int i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i28 == 0) {
            i18 = i27 | (c28655q2.m87157i(onStoryBackPress) ? 2048 : 1024);
        } else {
            i18 = i27;
        }
        int i34 = i18;
        int i35 = i13 & 24576;
        int i36 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i35 == 0) {
            i19 = i34 | (c28655q2.m87157i(onStoryNextPress) ? 16384 : 8192);
        } else {
            i19 = i34;
        }
        int i37 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i38 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i37 == 0) {
            i19 |= c28655q2.m87157i(onExitPress) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i19 |= c28655q2.m87157i(onSkipPress) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i19 |= c28655q2.m87157i(onFinalCTAPress) ? 8388608 : 4194304;
        }
        int i39 = i13 & 100663296;
        int i44 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i39 == 0) {
            i19 |= c28655q2.m87153g(education) ? 67108864 : 33554432;
        }
        int i45 = i19;
        int i46 = i15 & 512;
        if (i46 != 0) {
            i24 = i45 | 805306368;
        } else if ((i13 & 805306368) == 0) {
            i24 = i45 | (c28655q2.m87155h(z4) ? 536870912 : 268435456);
        } else {
            i24 = i45;
        }
        int i47 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i47 != 0) {
            i25 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i25 = i14 | (c28655q2.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 4 : 2);
        } else {
            i25 = i14;
        }
        int i48 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i48 == 0) {
            if ((i14 & 48) == 0) {
                i25 |= c28655q2.m87155h(z13) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i25 |= c28655q2.m87157i(onButtonClicked) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(onMediaCardClicked)) {
                    i29 = 2048;
                }
                i25 |= i29;
            }
            if ((i14 & 24576) != 0) {
                if (c28655q2.m87155h(z14)) {
                    i36 = 16384;
                }
                i25 |= i36;
            }
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i38 = 131072;
                }
                i25 |= i38;
            }
            if ((i14 & 1572864) == 0) {
                i25 |= c28655q2.m87155h(z16) ? 1048576 : 524288;
            }
            if ((i14 & 12582912) == 0) {
                i25 |= c28655q2.m87155h(z17) ? 8388608 : 4194304;
            }
            if ((i14 & 100663296) == 0) {
                if (c28655q2.m87157i(onProgressButtonEvent)) {
                    i44 = 67108864;
                }
                i25 |= i44;
            }
            if ((i24 & 306783379) == 306783378 || (i25 & 38347923) != 38347922) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z18)) {
                if (i46 != 0) {
                    z25 = false;
                } else {
                    z25 = z4;
                }
                if (i47 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                final boolean z26 = i48 == 0 ? z13 : true;
                c28655q = c28655q2;
                AbstractC12889b.m36263b(null, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandBlack(), null, 0, AbstractC37817c.m121344e(1371758974, c28655q, new InterfaceC4351m() { // from class: p12.v
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC28734x.m87413Z(storyContentViewData, z26, z14, onStoryBackPress, onStoryNextPress, viewState, progressBarInfo, onExitPress, onFinalCTAPress, education, onMediaCardClicked, z25, enumC16313m2, onButtonClicked, z15, z16, z17, onProgressButtonEvent, onSkipPress, (Composer) obj, iIntValue);
                    }
                }), c28655q, 1769472, 27);
                z19 = z25;
                enumC16313m1 = enumC16313m2;
                z24 = z26;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z19 = z4;
                enumC16313m1 = enumC16313m0;
                z24 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p12.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC28734x.m87423e0(viewState, storyContentViewData, progressBarInfo, onStoryBackPress, onStoryNextPress, onExitPress, onSkipPress, onFinalCTAPress, education, z19, enumC16313m1, z24, onButtonClicked, onMediaCardClicked, z14, z15, z16, z17, onProgressButtonEvent, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i25 |= 48;
        if ((i14 & 384) == 0) {
            i25 |= c28655q2.m87157i(onButtonClicked) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q2.m87157i(onMediaCardClicked)) {
                i29 = 2048;
            }
            i25 |= i29;
        }
        if ((i14 & 24576) != 0) {
            if (c28655q2.m87155h(z14)) {
                i36 = 16384;
            }
            i25 |= i36;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87155h(z15)) {
                i38 = 131072;
            }
            i25 |= i38;
        }
        if ((i14 & 1572864) == 0) {
            i25 |= c28655q2.m87155h(z16) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i25 |= c28655q2.m87155h(z17) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            if (c28655q2.m87157i(onProgressButtonEvent)) {
                i44 = 67108864;
            }
            i25 |= i44;
        }
        if ((i24 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (c28655q2.m87135U(i24 & 1, z18)) {
            if (i46 != 0) {
                z25 = false;
            } else {
                z25 = z4;
            }
            if (i47 != 0) {
                enumC16313m2 = null;
            } else {
                enumC16313m2 = enumC16313m0;
            }
            final boolean z27 = i48 == 0 ? z13 : true;
            c28655q = c28655q2;
            AbstractC12889b.m36263b(null, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandBlack(), null, 0, AbstractC37817c.m121344e(1371758974, c28655q, new InterfaceC4351m() { // from class: p12.v
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC28734x.m87413Z(storyContentViewData, z27, z14, onStoryBackPress, onStoryNextPress, viewState, progressBarInfo, onExitPress, onFinalCTAPress, education, onMediaCardClicked, z25, enumC16313m2, onButtonClicked, z15, z16, z17, onProgressButtonEvent, onSkipPress, (Composer) obj, iIntValue);
                }
            }), c28655q, 1769472, 27);
            z19 = z25;
            enumC16313m1 = enumC16313m2;
            z24 = z27;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z19 = z4;
            enumC16313m1 = enumC16313m0;
            z24 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p12.n
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC28734x.m87423e0(viewState, storyContentViewData, progressBarInfo, onStoryBackPress, onStoryNextPress, onExitPress, onSkipPress, onFinalCTAPress, education, z19, enumC16313m1, z24, onButtonClicked, onMediaCardClicked, z14, z15, z16, z17, onProgressButtonEvent, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m87413Z(C28707a0 c28707a0, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C28712d c28712d, C28736z c28736z, InterfaceC4339a interfaceC4339a3, Function1 function1, C28714e c28714e, InterfaceC4351m interfaceC4351m, boolean z14, EnumC16313m0 enumC16313m0, Function1 function2, boolean z15, boolean z16, boolean z17, Function1 function3, Function1 function4, Composer composer, int i13) {
        ParagraphInsets insets;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C28716f c28716fM87335b = c28707a0.getImageInfo();
            FeatureEducationParagraph featureEducationParagraph = (FeatureEducationParagraph) AbstractC25265s.m74100H0(c28707a0.m87336c());
            ParagraphInsets paragraphInsets = (featureEducationParagraph == null || (insets = featureEducationParagraph.getInsets()) == null) ? new ParagraphInsets(8.0d, 4.0d, 8.0d, 4.0d) : insets;
            m87443o0(c28716fM87335b, c28655q, 0);
            if (z4) {
                c28655q.m87150e0(-541956498);
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13) {
                    c28655q.m87150e0(-541932163);
                    boolean zM87153g = c28655q.m87153g(interfaceC4339a);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = new C28718h(interfaceC4339a, 2);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    boolean zM87153g2 = c28655q.m87153g(interfaceC4339a2);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C28718h(interfaceC4339a2, 3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28722l.m87371h(interfaceC4339a4, (InterfaceC4339a) objM87133R2, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-541729051);
                    boolean zM87153g3 = c28655q.m87153g(interfaceC4339a);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87153g3 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C28718h(interfaceC4339a, 4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R3;
                    boolean zM87153g4 = c28655q.m87153g(interfaceC4339a2);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87153g4 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C28718h(interfaceC4339a2, 5);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28722l.m87375l(interfaceC4339a5, (InterfaceC4339a) objM87133R4, c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-541535580);
                c28655q.m87173q(false);
            }
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC22953f.m66722k(C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            float f13 = c28716fM87335b.getIsImageBackground() ? 0.0f : 1.0f;
            C28715e0 c28715e0M87337d = c28707a0.getVideoInfo();
            C3927k c3927kM87348d = c28712d.getProgressButtonState();
            int i14 = ParagraphInsets.$stable;
            m87433j0(c28707a0, c28736z, interfaceC4339a3, function1, c28714e, f13, c28716fM87335b, c28715e0M87337d, interfaceC4351m, paragraphInsets, z14, enumC16313m0, function2, z15, z16, z17, c3927kM87348d, function3, interfaceC4339a, function4, c28655q, (i14 << 3) | (AbstractC22403o.f87638a << 21) | (i14 << 27), C3927k.f16020r << 18, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m87415a0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m87417b0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m87419c0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m87421d0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m87423e0(C28712d c28712d, C28707a0 c28707a0, C28736z c28736z, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Function1 function1, Function1 function2, C28714e c28714e, boolean z4, EnumC16313m0 enumC16313m0, boolean z13, Function1 function3, InterfaceC4351m interfaceC4351m, boolean z14, boolean z15, boolean z16, boolean z17, Function1 function4, int i13, int i14, int i15, Composer composer, int i16) {
        m87412Y(c28712d, c28707a0, c28736z, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, function1, function2, c28714e, z4, enumC16313m0, z13, function3, interfaceC4351m, z14, z15, z16, z17, function4, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m87425f0(C28709b0 storyPrimaryCTA, ParagraphInsets insets, Function1 onFinalCTAPress, C28714e education, Function1 onButtonClicked, C3927k progressButtonState, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(storyPrimaryCTA, "storyPrimaryCTA");
        AbstractC22676k.m65750j(insets, "insets");
        AbstractC22676k.m65750j(onFinalCTAPress, "onFinalCTAPress");
        AbstractC22676k.m65750j(education, "education");
        AbstractC22676k.m65750j(onButtonClicked, "onButtonClicked");
        AbstractC22676k.m65750j(progressButtonState, "progressButtonState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1161672087);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(storyPrimaryCTA) : c28655q2.m87157i(storyPrimaryCTA) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(insets) : c28655q2.m87157i(insets) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onFinalCTAPress) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(education) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(onButtonClicked) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= (262144 & i13) == 0 ? c28655q2.m87153g(progressButtonState) : c28655q2.m87157i(progressButtonState) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 1048576 : 524288;
        }
        if (c28655q2.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 && storyPrimaryCTA.getIsFinalCta()) {
                c28655q2.m87150e0(1473730012);
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9106I, false);
                int iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
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
                boolean z13 = ((i14 & 896) == 256) | ((i14 & 7168) == 2048);
                Object objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C27050m(18, onFinalCTAPress, education);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(progressButtonState, (Function1) objM87133R, c28655q2, ((i14 >> 15) & 14) | C3927k.f16020r, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(1474062332);
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), ((float) insets.getLeading()) * f13, ((float) insets.getBottom()) * f13, ((float) insets.getTrailing()) * f13, 0.0f, 8);
                EnumC27284v enumC27284vM87343e = storyPrimaryCTA.getPrimaryButtonType();
                String strM87342d = storyPrimaryCTA.getPrimaryButtonText();
                long jMo134584toComposableColorWaAFU9c = storyPrimaryCTA.getPrimaryButtonColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                boolean z14 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q2.m87157i(storyPrimaryCTA))) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048) | ((i14 & 57344) == 16384);
                Object objM87133R2 = c28655q2.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    C27198e c27198e = new C27198e((Object) storyPrimaryCTA, onFinalCTAPress, (Object) education, onButtonClicked, 4);
                    c28655q2.m87172p0(c27198e);
                    objM87133R2 = c27198e;
                }
                AbstractC27282u.m82292h(modifierM3398t, enumC27284vM87343e, strM87342d, false, jMo134584toComposableColorWaAFU9c, null, false, (InterfaceC4339a) objM87133R2, c28655q2, 0, 104);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1044u(storyPrimaryCTA, insets, onFinalCTAPress, education, onButtonClicked, progressButtonState, z4, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m87427g0(Function1 function1, C28714e c28714e, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c28714e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m87429h0(C28709b0 c28709b0, Function1 function1, C28714e c28714e, Function1 function2) {
        if (c28709b0.getIsFinalCta()) {
            function1.invoke(c28714e);
        } else {
            function2.invoke(c28709b0.getPrimaryButtonAction());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m87431i0(C28709b0 c28709b0, ParagraphInsets paragraphInsets, Function1 function1, C28714e c28714e, Function1 function2, C3927k c3927k, boolean z4, int i13, Composer composer, int i14) {
        m87425f0(c28709b0, paragraphInsets, function1, c28714e, function2, c3927k, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01df  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:138:0x0200  */
    /* JADX WARN: Code duplicated, block: B:139:0x0205  */
    /* JADX WARN: Code duplicated, block: B:141:0x020b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0213  */
    /* JADX WARN: Code duplicated, block: B:147:0x0219  */
    /* JADX WARN: Code duplicated, block: B:151:0x0221  */
    /* JADX WARN: Code duplicated, block: B:153:0x0227  */
    /* JADX WARN: Code duplicated, block: B:157:0x0231  */
    /* JADX WARN: Code duplicated, block: B:159:0x0237  */
    /* JADX WARN: Code duplicated, block: B:167:0x0255  */
    /* JADX WARN: Code duplicated, block: B:170:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0260  */
    /* JADX WARN: Code duplicated, block: B:172:0x0262  */
    /* JADX WARN: Code duplicated, block: B:174:0x0266  */
    /* JADX WARN: Code duplicated, block: B:175:0x0269  */
    /* JADX WARN: Code duplicated, block: B:178:0x0275  */
    /* JADX WARN: Code duplicated, block: B:179:0x0280  */
    /* JADX WARN: Code duplicated, block: B:187:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:202:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:203:0x02ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x030c  */
    /* JADX WARN: Code duplicated, block: B:209:0x034d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0351  */
    /* JADX WARN: Code duplicated, block: B:215:0x0374  */
    /* JADX WARN: Code duplicated, block: B:218:0x0386  */
    /* JADX WARN: Code duplicated, block: B:220:0x0390  */
    /* JADX WARN: Code duplicated, block: B:221:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:223:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:225:0x03db  */
    /* JADX WARN: Code duplicated, block: B:226:0x03df  */
    /* JADX WARN: Code duplicated, block: B:231:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:234:0x044e  */
    /* JADX WARN: Code duplicated, block: B:235:0x0450  */
    /* JADX WARN: Code duplicated, block: B:239:0x045e  */
    /* JADX WARN: Code duplicated, block: B:241:0x048c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0503  */
    /* JADX WARN: Code duplicated, block: B:244:0x0505  */
    /* JADX WARN: Code duplicated, block: B:248:0x0513  */
    /* JADX WARN: Code duplicated, block: B:252:0x0535  */
    /* JADX WARN: Code duplicated, block: B:253:0x0572  */
    /* JADX WARN: Code duplicated, block: B:255:0x0580  */
    /* JADX WARN: Code duplicated, block: B:258:0x059a  */
    /* JADX WARN: Code duplicated, block: B:259:0x059f  */
    /* JADX WARN: Code duplicated, block: B:262:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:264:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:267:0x062f  */
    /* JADX WARN: Code duplicated, block: B:268:0x0631  */
    /* JADX WARN: Code duplicated, block: B:272:0x0639  */
    /* JADX WARN: Code duplicated, block: B:276:0x0644  */
    /* JADX WARN: Code duplicated, block: B:278:0x0684  */
    /* JADX WARN: Code duplicated, block: B:281:0x0695  */
    /* JADX WARN: Code duplicated, block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r26v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r6v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX INFO: renamed from: j0 */
    public static final void m87433j0(final C28707a0 storyContentViewData, final C28736z progressBarInfo, final InterfaceC4339a onExitPress, final Function1 onFinalCTAPress, C28714e education, final float f13, final C28716f imageInfo, C28715e0 c28715e0, final InterfaceC4351m onMediaCardClicked, final ParagraphInsets insets, boolean z4, EnumC16313m0 enumC16313m0, final Function1 onButtonClicked, final boolean z13, final boolean z14, final boolean z15, final C3927k progressButtonState, final Function1 onProgressButtonEvent, final InterfaceC4339a onStoryBackPress, Function1 onSkipPress, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        final C28715e0 c28715e1;
        int i17;
        int i18;
        int i19;
        boolean z16;
        C28714e c28714e;
        boolean z17;
        final EnumC16313m0 enumC16313m1;
        ?? r14;
        C28677v1 c28677v1M87180u;
        boolean z18;
        EnumC16313m0 enumC16313m2;
        AbstractC18247a abstractC18247aM87358a;
        AbstractC18254h abstractC18254hM52584a;
        AbstractC17911t abstractC17911tM44012U;
        Modifier modifierM3398t;
        Modifier modifier;
        Modifier modifier2;
        Modifier modifier3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean zM87363f;
        int i24;
        ?? r10;
        ?? r15;
        C28708b c28708bM87334a;
        C28709b0 c28709b0M87338a;
        int i25;
        ?? r16;
        ?? r17;
        ?? r18;
        int i26;
        Object objM87133R;
        C23016z c23016z;
        C28655q c28655q;
        Modifier modifier4;
        boolean z19;
        boolean zM87157i;
        Object objM87133R2;
        boolean z24;
        C28655q c28655q2;
        C23454a0 c23454a0;
        int iHashCode2;
        boolean z25;
        boolean zM87157i2;
        Object objM87133R3;
        C28655q c28655q3;
        boolean z26;
        C28708b c28708bM87334a2;
        boolean z27;
        C28709b0 c28709b0M87338a2;
        boolean zM87157i3;
        AbstractC22676k.m65750j(storyContentViewData, "storyContentViewData");
        AbstractC22676k.m65750j(progressBarInfo, "progressBarInfo");
        AbstractC22676k.m65750j(onExitPress, "onExitPress");
        AbstractC22676k.m65750j(onFinalCTAPress, "onFinalCTAPress");
        AbstractC22676k.m65750j(education, "education");
        AbstractC22676k.m65750j(imageInfo, "imageInfo");
        AbstractC22676k.m65750j(onMediaCardClicked, "onMediaCardClicked");
        AbstractC22676k.m65750j(insets, "insets");
        AbstractC22676k.m65750j(onButtonClicked, "onButtonClicked");
        AbstractC22676k.m65750j(progressButtonState, "progressButtonState");
        AbstractC22676k.m65750j(onProgressButtonEvent, "onProgressButtonEvent");
        AbstractC22676k.m65750j(onStoryBackPress, "onStoryBackPress");
        AbstractC22676k.m65750j(onSkipPress, "onSkipPress");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(660287357);
        if ((i13 & 6) == 0) {
            i16 = i13 | (c28655q4.m87157i(storyContentViewData) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= (i13 & 64) == 0 ? c28655q4.m87153g(progressBarInfo) : c28655q4.m87157i(progressBarInfo) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q4.m87157i(onExitPress) ? 256 : 128;
        }
        int i27 = i13 & 3072;
        int i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i27 == 0) {
            i16 |= c28655q4.m87157i(onFinalCTAPress) ? 2048 : 1024;
        }
        int i29 = i13 & 24576;
        int i34 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i29 == 0) {
            i16 |= c28655q4.m87153g(education) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        }
        int i35 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i35 == 0) {
            i16 |= c28655q4.m87147d(f13) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= c28655q4.m87157i(imageInfo) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            c28715e1 = c28715e0;
            i16 |= (i13 & 16777216) == 0 ? c28655q4.m87153g(c28715e1) : c28655q4.m87157i(c28715e1) ? 8388608 : 4194304;
        } else {
            c28715e1 = c28715e0;
        }
        int i37 = i13 & 100663296;
        int i38 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i37 == 0) {
            i16 |= c28655q4.m87157i(onMediaCardClicked) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i16 |= (i13 & 1073741824) == 0 ? c28655q4.m87153g(insets) : c28655q4.m87157i(insets) ? 536870912 : 268435456;
        }
        int i39 = i16;
        int i44 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i44 != 0) {
            i17 = i14;
            i18 = i17 | 6;
        } else {
            i17 = i14;
            if ((i17 & 6) == 0) {
                i18 = i17 | (c28655q4.m87155h(z4) ? 4 : 2);
            } else {
                i18 = i17;
            }
        }
        int i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i45 == 0) {
            if ((i17 & 48) == 0) {
                i18 |= c28655q4.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 32 : 16;
            }
            if ((i17 & 384) == 0) {
                i18 |= c28655q4.m87157i(onButtonClicked) ? 256 : 128;
            }
            if ((i17 & 3072) != 0) {
                if (c28655q4.m87155h(z13)) {
                    i28 = 2048;
                }
                i18 |= i28;
            }
            if ((i17 & 24576) != 0) {
                if (c28655q4.m87155h(z14)) {
                    i34 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i18 |= i34;
            }
            if ((i17 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87155h(z15)) {
                    i36 = 131072;
                }
                i18 |= i36;
            }
            if ((i17 & 1572864) == 0) {
                if ((i17 & 2097152) == 0) {
                    zM87157i3 = c28655q4.m87153g(progressButtonState);
                } else {
                    zM87157i3 = c28655q4.m87157i(progressButtonState);
                }
                i18 |= zM87157i3 ? 1048576 : 524288;
            }
            if ((i17 & 12582912) == 0) {
                i18 |= c28655q4.m87157i(onProgressButtonEvent) ? 8388608 : 4194304;
            }
            if ((i17 & 100663296) == 0) {
                if (c28655q4.m87157i(onStoryBackPress)) {
                    i38 = 67108864;
                }
                i18 |= i38;
            }
            if ((i17 & 805306368) == 0) {
                i18 |= c28655q4.m87157i(onSkipPress) ? 536870912 : 268435456;
            }
            i19 = i18;
            if ((i39 & 306783379) == 306783378 || (i19 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q4.m87135U(i39 & 1, z16)) {
                if (i44 != 0) {
                    z18 = false;
                } else {
                    z18 = z4;
                }
                if (i45 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                abstractC18247aM87358a = storyContentViewData.getImageInfo().getBackground();
                if (abstractC18247aM87358a == null) {
                    c28655q4.m87150e0(-328684039);
                    c28655q4.m87173q(false);
                    abstractC17911tM44012U = null;
                } else {
                    c28655q4.m87150e0(-328684038);
                    abstractC18254hM52584a = AbstractC18255i.m52584a(abstractC18247aM87358a, c28655q4, AbstractC18247a.f71043a);
                    if ((abstractC18254hM52584a instanceof C18251e) || !(storyContentViewData.getImageInfo().getBackgroundType() == EnumC28710c.BRUSH || storyContentViewData.getImageInfo().getBackgroundType() == EnumC28710c.BACKGROUND)) {
                        abstractC17911tM44012U = AbstractC15673b0.m44012U();
                    } else {
                        abstractC17911tM44012U = ((C18251e) abstractC18254hM52584a).getBrush();
                    }
                    c28655q4.m87173q(false);
                }
                if (abstractC17911tM44012U == null) {
                    abstractC17911tM44012U = AbstractC15673b0.m44012U();
                }
                modifierM3398t = C2314t.f9131w;
                z17 = z18;
                Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, modifierM3398t), abstractC17911tM44012U, null, f13, 2);
                if (z13) {
                    c28708bM87334a2 = storyContentViewData.getCtaButtons();
                    if (c28708bM87334a2 == null && (c28709b0M87338a2 = c28708bM87334a2.getStoryPrimaryCTA()) != null && c28709b0M87338a2.getIsFinalCta()) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if (z27) {
                        modifier2 = modifierM3398t;
                    } else {
                        if (z13) {
                            modifier = modifierM3398t;
                            modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, Math.max(f116287a, ((float) insets.getBottom()) * 8), 7);
                        } else {
                            modifier = modifierM3398t;
                            modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, ((float) insets.getBottom()) * 8, 7);
                        }
                        modifier2 = modifier;
                    }
                } else {
                    if (z13) {
                        modifier = modifierM3398t;
                        modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, Math.max(f116287a, ((float) insets.getBottom()) * 8), 7);
                    } else {
                        modifier = modifierM3398t;
                        modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, ((float) insets.getBottom()) * 8, 7);
                    }
                    modifier2 = modifier;
                }
                Modifier modifierMo3471e = modifierM3357b.mo3471e(modifierM3398t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q4, 6);
                modifier3 = modifier2;
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                zM87363f = imageInfo.getIsImageBackground();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87363f) {
                    i24 = i39;
                    C28655q c28655q5 = c28655q4;
                    r10 = 0;
                    c28655q5.m87150e0(-208661009);
                    c28655q5.m87173q(false);
                    r15 = c28655q5;
                } else {
                    c28655q4.m87150e0(-211379027);
                    c23016z = C23016z.f90757a;
                    if (c28715e1 == null) {
                        c28655q4.m87150e0(-211380609);
                        c28655q4.m87173q(false);
                        i24 = i39;
                        c28655q3 = c28655q4;
                        modifier4 = modifier3;
                        c23454a0 = null;
                    } else {
                        c28655q4.m87150e0(-211380608);
                        if (z14) {
                            c28655q4.m87150e0(1146974049);
                            modifier4 = modifier3;
                            Modifier modifierM66779c = c23016z.m66779c(AbstractC1102d.m3409f(1.0f, modifier4), true, 1.0f);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM66779c);
                            c28655q4.m87158i0();
                            i24 = i39;
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                            float f14 = 8;
                            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), ((float) insets.getLeading()) * f14, 0.0f, ((float) insets.getTrailing()) * f14, 0.0f, 10);
                            EnumC11681g enumC11681g = EnumC11681g.FULLWIDTH;
                            AbstractC11684j.d dVar = new AbstractC11684j.d(c28715e1.getImageSource(), AbstractC8693b.m21278l(c28715e1.getTitle()), AbstractC8693b.m21278l(c28715e1.getSubtitle()), AbstractC8693b.m21278l(""), null, 16, null);
                            if ((i24 & 234881024) == 67108864) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            zM87157i2 = z25 | c28655q4.m87157i(c28715e1);
                            objM87133R3 = c28655q4.m87133R();
                            if (zM87157i2 || objM87133R3 == c28676v0) {
                                final int i46 = 0;
                                objM87133R3 = new InterfaceC4339a() { // from class: p12.q
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i46) {
                                            case 0:
                                                return AbstractC28734x.m87435k0(onMediaCardClicked, c28715e1);
                                            default:
                                                return AbstractC28734x.m87437l0(onMediaCardClicked, c28715e1);
                                        }
                                    }
                                };
                                c28655q4.m87172p0(objM87133R3);
                            }
                            AbstractC11679e.m31124q(modifierM3398t2, enumC11681g, null, dVar, false, (InterfaceC4339a) objM87133R3, c28655q4, (AbstractC11684j.d.f37780f << 9) | 24624, 4);
                            C28655q c28655q6 = c28655q4;
                            c28655q6.m87173q(true);
                            z24 = false;
                            c28655q6.m87173q(false);
                            c28655q2 = c28655q6;
                        } else {
                            i24 = i39;
                            c28655q = c28655q4;
                            modifier4 = modifier3;
                            c28655q.m87150e0(1148186831);
                            c28655q.m87173q(false);
                            C28754g c28754g = new C28754g(null, InterfaceC28753f.b.f116454a, c28715e1.getImageSource(), AbstractC8693b.m21278l(c28715e1.getTitle()), AbstractC8693b.m21278l(c28715e1.getTitle()), AbstractC8693b.m21278l(c28715e1.getSubtitle()), null, null, true, 129, null);
                            float f15 = 8;
                            Modifier modifierM66778b = c23016z.m66778b(c23016z.m66779c(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), ((float) insets.getLeading()) * f15, ((float) insets.getBottom()) * f15, ((float) insets.getTrailing()) * f15, 0.0f, 8), true, 1.0f), C2299e.f9111N);
                            if ((i24 & 234881024) == 67108864) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i = z19 | c28655q.m87157i(c28715e1);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i || objM87133R2 == c28676v0) {
                                final int i47 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: p12.q
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i47) {
                                            case 0:
                                                return AbstractC28734x.m87435k0(onMediaCardClicked, c28715e1);
                                            default:
                                                return AbstractC28734x.m87437l0(onMediaCardClicked, c28715e1);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28752e.m87500l(modifierM66778b, c28754g, (InterfaceC4339a) objM87133R2, c28655q, C28754g.f116456j << 3, 0);
                            z24 = false;
                            c28655q2 = c28655q;
                        }
                        c28655q2.m87173q(z24);
                        c23454a0 = C23454a0.f92919a;
                        c28655q3 = c28655q2;
                    }
                    if (c23454a0 == null) {
                        c28655q3.m87150e0(-209043797);
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(imageInfo.getImageSource(), null, null, c28655q3, AbstractC22403o.f87638a, 3), "Story Hero Image", c23016z.m66778b(c23016z.m66779c(modifier4, true, 1.0f), C2299e.f9111N), null, C39102j.f168204f, 0.0f, null, c28655q3, 24624, 104);
                        z26 = false;
                        c28655q3.m87173q(false);
                    } else {
                        z26 = false;
                        c28655q3.m87150e0(-699555339);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z26);
                    r10 = z26;
                    r15 = c28655q3;
                }
                m87455u0(storyContentViewData.m87336c(), r15, r10);
                c28708bM87334a = storyContentViewData.getCtaButtons();
                if (c28708bM87334a != null) {
                    c28709b0M87338a = c28708bM87334a.getStoryPrimaryCTA();
                } else {
                    c28709b0M87338a = null;
                }
                if (c28709b0M87338a == null) {
                    r15.m87150e0(-208512210);
                    r15.m87173q(r10);
                    c28714e = education;
                    r17 = r15;
                    i25 = 536870912;
                    r16 = r10;
                } else {
                    r15.m87150e0(-208512209);
                    int i48 = i24 >> 3;
                    i25 = 536870912;
                    m87425f0(c28709b0M87338a, insets, onFinalCTAPress, education, onButtonClicked, progressButtonState, z13, r15, C22581e.f88865n | (ParagraphInsets.$stable << 3) | ((i24 >> 24) & 112) | (i48 & 896) | (i48 & 7168) | ((i19 << 6) & 57344) | (C3927k.f16020r << 15) | ((i19 >> 3) & 458752) | ((i19 << 9) & 3670016));
                    c28714e = education;
                    ?? r19 = r15;
                    r16 = 0;
                    r19.m87173q(false);
                    r17 = r19;
                }
                r17.m87173q(true);
                int i49 = i24;
                EnumC16313m0 enumC16313m3 = enumC16313m2;
                m87393F(z17, enumC16313m3, onExitPress, r17, (i19 & 126) | (i49 & 896), 0);
                boolean zM87478c = progressBarInfo.getShouldShowProgressBar();
                int iM87477b = progressBarInfo.getPageNumber();
                int iM87479d = progressBarInfo.getTotalPages();
                ParagraphInsets paragraphInsetsM87476a = progressBarInfo.getInsets();
                if ((i19 & 1879048192) == i25) {
                    r18 = 1;
                } else {
                    r18 = r16;
                }
                i26 = r18 | ((i49 & 57344) != 16384 ? r16 : 1);
                objM87133R = r17.m87133R();
                if (i26 == 0 || objM87133R == c28676v0) {
                    objM87133R = new C28448b(7, onSkipPress, c28714e);
                    r17.m87172p0(objM87133R);
                }
                int i54 = (57344 & (i19 << 3)) | (ParagraphInsets.$stable << 9) | (i19 & 458752) | (C3927k.f16020r << 18) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024);
                ?? r26 = r17;
                AbstractC28722l.m87369f(zM87478c, iM87477b, iM87479d, paragraphInsetsM87476a, z13, z15, progressButtonState, onProgressButtonEvent, onStoryBackPress, (InterfaceC4339a) objM87133R, r26, i54);
                r14 = r26;
                enumC16313m1 = enumC16313m3;
            } else {
                onSkipPress = onSkipPress;
                c28714e = education;
                C28655q c28655q7 = c28655q4;
                c28655q7.m87138X();
                z17 = z4;
                enumC16313m1 = enumC16313m0;
                r14 = c28655q7;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                final C28715e0 c28715e2 = c28715e1;
                final Function1 function1 = onSkipPress;
                final C28714e c28714e2 = c28714e;
                final boolean z28 = z17;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p12.r
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC28734x.m87441n0(storyContentViewData, progressBarInfo, onExitPress, onFinalCTAPress, c28714e2, f13, imageInfo, c28715e2, onMediaCardClicked, insets, z28, enumC16313m1, onButtonClicked, z13, z14, z15, progressButtonState, onProgressButtonEvent, onStoryBackPress, function1, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i18 |= 48;
        if ((i17 & 384) == 0) {
            i18 |= c28655q4.m87157i(onButtonClicked) ? 256 : 128;
        }
        if ((i17 & 3072) != 0) {
            if (c28655q4.m87155h(z13)) {
                i28 = 2048;
            }
            i18 |= i28;
        }
        if ((i17 & 24576) != 0) {
            if (c28655q4.m87155h(z14)) {
                i34 = DfuBaseService.ERROR_CONNECTION_MASK;
            }
            i18 |= i34;
        }
        if ((i17 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q4.m87155h(z15)) {
                i36 = 131072;
            }
            i18 |= i36;
        }
        if ((i17 & 1572864) == 0) {
            if ((i17 & 2097152) == 0) {
                zM87157i3 = c28655q4.m87153g(progressButtonState);
            } else {
                zM87157i3 = c28655q4.m87157i(progressButtonState);
            }
            i18 |= zM87157i3 ? 1048576 : 524288;
        }
        if ((i17 & 12582912) == 0) {
            i18 |= c28655q4.m87157i(onProgressButtonEvent) ? 8388608 : 4194304;
        }
        if ((i17 & 100663296) == 0) {
            if (c28655q4.m87157i(onStoryBackPress)) {
                i38 = 67108864;
            }
            i18 |= i38;
        }
        if ((i17 & 805306368) == 0) {
            i18 |= c28655q4.m87157i(onSkipPress) ? 536870912 : 268435456;
        }
        i19 = i18;
        if ((i39 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q4.m87135U(i39 & 1, z16)) {
            if (i44 != 0) {
                z18 = false;
            } else {
                z18 = z4;
            }
            if (i45 != 0) {
                enumC16313m2 = null;
            } else {
                enumC16313m2 = enumC16313m0;
            }
            abstractC18247aM87358a = storyContentViewData.getImageInfo().getBackground();
            if (abstractC18247aM87358a == null) {
                c28655q4.m87150e0(-328684039);
                c28655q4.m87173q(false);
                abstractC17911tM44012U = null;
            } else {
                c28655q4.m87150e0(-328684038);
                abstractC18254hM52584a = AbstractC18255i.m52584a(abstractC18247aM87358a, c28655q4, AbstractC18247a.f71043a);
                if (abstractC18254hM52584a instanceof C18251e) {
                    abstractC17911tM44012U = AbstractC15673b0.m44012U();
                } else {
                    abstractC17911tM44012U = AbstractC15673b0.m44012U();
                }
                c28655q4.m87173q(false);
            }
            if (abstractC17911tM44012U == null) {
                abstractC17911tM44012U = AbstractC15673b0.m44012U();
            }
            modifierM3398t = C2314t.f9131w;
            z17 = z18;
            Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, modifierM3398t), abstractC17911tM44012U, null, f13, 2);
            if (z13) {
                if (z13) {
                    modifier = modifierM3398t;
                    modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, Math.max(f116287a, ((float) insets.getBottom()) * 8), 7);
                } else {
                    modifier = modifierM3398t;
                    modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, ((float) insets.getBottom()) * 8, 7);
                }
                modifier2 = modifier;
            } else {
                c28708bM87334a2 = storyContentViewData.getCtaButtons();
                if (c28708bM87334a2 == null) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                if (z27) {
                    modifier2 = modifierM3398t;
                } else {
                    if (z13) {
                        modifier = modifierM3398t;
                        modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, Math.max(f116287a, ((float) insets.getBottom()) * 8), 7);
                    } else {
                        modifier = modifierM3398t;
                        modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, ((float) insets.getBottom()) * 8, 7);
                    }
                    modifier2 = modifier;
                }
            }
            Modifier modifierMo3471e2 = modifierM3357b2.mo3471e(modifierM3398t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q4, 6);
            modifier3 = modifier2;
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
            zM87363f = imageInfo.getIsImageBackground();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87363f) {
                c28655q4.m87150e0(-211379027);
                c23016z = C23016z.f90757a;
                if (c28715e1 == null) {
                    c28655q4.m87150e0(-211380609);
                    c28655q4.m87173q(false);
                    i24 = i39;
                    c28655q3 = c28655q4;
                    modifier4 = modifier3;
                    c23454a0 = null;
                } else {
                    c28655q4.m87150e0(-211380608);
                    if (z14) {
                        c28655q4.m87150e0(1146974049);
                        modifier4 = modifier3;
                        Modifier modifierM66779c2 = c23016z.m66779c(AbstractC1102d.m3409f(1.0f, modifier4), true, 1.0f);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM66779c2);
                        c28655q4.m87158i0();
                        i24 = i39;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N4);
                        float f16 = 8;
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), ((float) insets.getLeading()) * f16, 0.0f, ((float) insets.getTrailing()) * f16, 0.0f, 10);
                        EnumC11681g enumC11681g2 = EnumC11681g.FULLWIDTH;
                        AbstractC11684j.d dVar2 = new AbstractC11684j.d(c28715e1.getImageSource(), AbstractC8693b.m21278l(c28715e1.getTitle()), AbstractC8693b.m21278l(c28715e1.getSubtitle()), AbstractC8693b.m21278l(""), null, 16, null);
                        if ((i24 & 234881024) == 67108864) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87157i2 = z25 | c28655q4.m87157i(c28715e1);
                        objM87133R3 = c28655q4.m87133R();
                        if (zM87157i2) {
                            final int i410 = 0;
                            objM87133R3 = new InterfaceC4339a() { // from class: p12.q
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i410) {
                                        case 0:
                                            return AbstractC28734x.m87435k0(onMediaCardClicked, c28715e1);
                                        default:
                                            return AbstractC28734x.m87437l0(onMediaCardClicked, c28715e1);
                                    }
                                }
                            };
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            final int i411 = 0;
                            objM87133R3 = new InterfaceC4339a() { // from class: p12.q
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i411) {
                                        case 0:
                                            return AbstractC28734x.m87435k0(onMediaCardClicked, c28715e1);
                                        default:
                                            return AbstractC28734x.m87437l0(onMediaCardClicked, c28715e1);
                                    }
                                }
                            };
                            c28655q4.m87172p0(objM87133R3);
                        }
                        AbstractC11679e.m31124q(modifierM3398t3, enumC11681g2, null, dVar2, false, (InterfaceC4339a) objM87133R3, c28655q4, (AbstractC11684j.d.f37780f << 9) | 24624, 4);
                        C28655q c28655q8 = c28655q4;
                        c28655q8.m87173q(true);
                        z24 = false;
                        c28655q8.m87173q(false);
                        c28655q2 = c28655q8;
                    } else {
                        i24 = i39;
                        c28655q = c28655q4;
                        modifier4 = modifier3;
                        c28655q.m87150e0(1148186831);
                        c28655q.m87173q(false);
                        C28754g c28754g2 = new C28754g(null, InterfaceC28753f.b.f116454a, c28715e1.getImageSource(), AbstractC8693b.m21278l(c28715e1.getTitle()), AbstractC8693b.m21278l(c28715e1.getTitle()), AbstractC8693b.m21278l(c28715e1.getSubtitle()), null, null, true, 129, null);
                        float f17 = 8;
                        Modifier modifierM66778b2 = c23016z.m66778b(c23016z.m66779c(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), ((float) insets.getLeading()) * f17, ((float) insets.getBottom()) * f17, ((float) insets.getTrailing()) * f17, 0.0f, 8), true, 1.0f), C2299e.f9111N);
                        if ((i24 & 234881024) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i = z19 | c28655q.m87157i(c28715e1);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i412 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: p12.q
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i412) {
                                        case 0:
                                            return AbstractC28734x.m87435k0(onMediaCardClicked, c28715e1);
                                        default:
                                            return AbstractC28734x.m87437l0(onMediaCardClicked, c28715e1);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i413 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: p12.q
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i413) {
                                        case 0:
                                            return AbstractC28734x.m87435k0(onMediaCardClicked, c28715e1);
                                        default:
                                            return AbstractC28734x.m87437l0(onMediaCardClicked, c28715e1);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28752e.m87500l(modifierM66778b2, c28754g2, (InterfaceC4339a) objM87133R2, c28655q, C28754g.f116456j << 3, 0);
                        z24 = false;
                        c28655q2 = c28655q;
                    }
                    c28655q2.m87173q(z24);
                    c23454a0 = C23454a0.f92919a;
                    c28655q3 = c28655q2;
                }
                if (c23454a0 == null) {
                    c28655q3.m87150e0(-209043797);
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(imageInfo.getImageSource(), null, null, c28655q3, AbstractC22403o.f87638a, 3), "Story Hero Image", c23016z.m66778b(c23016z.m66779c(modifier4, true, 1.0f), C2299e.f9111N), null, C39102j.f168204f, 0.0f, null, c28655q3, 24624, 104);
                    z26 = false;
                    c28655q3.m87173q(false);
                } else {
                    z26 = false;
                    c28655q3.m87150e0(-699555339);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z26);
                r10 = z26;
                r15 = c28655q3;
            } else {
                i24 = i39;
                C28655q c28655q9 = c28655q4;
                r10 = 0;
                c28655q9.m87150e0(-208661009);
                c28655q9.m87173q(false);
                r15 = c28655q9;
            }
            m87455u0(storyContentViewData.m87336c(), r15, r10);
            c28708bM87334a = storyContentViewData.getCtaButtons();
            if (c28708bM87334a != null) {
                c28709b0M87338a = c28708bM87334a.getStoryPrimaryCTA();
            } else {
                c28709b0M87338a = null;
            }
            if (c28709b0M87338a == null) {
                r15.m87150e0(-208512210);
                r15.m87173q(r10);
                c28714e = education;
                r17 = r15;
                i25 = 536870912;
                r16 = r10;
            } else {
                r15.m87150e0(-208512209);
                int i414 = i24 >> 3;
                i25 = 536870912;
                m87425f0(c28709b0M87338a, insets, onFinalCTAPress, education, onButtonClicked, progressButtonState, z13, r15, C22581e.f88865n | (ParagraphInsets.$stable << 3) | ((i24 >> 24) & 112) | (i414 & 896) | (i414 & 7168) | ((i19 << 6) & 57344) | (C3927k.f16020r << 15) | ((i19 >> 3) & 458752) | ((i19 << 9) & 3670016));
                c28714e = education;
                ?? r110 = r15;
                r16 = 0;
                r110.m87173q(false);
                r17 = r110;
            }
            r17.m87173q(true);
            int i415 = i24;
            EnumC16313m0 enumC16313m4 = enumC16313m2;
            m87393F(z17, enumC16313m4, onExitPress, r17, (i19 & 126) | (i415 & 896), 0);
            boolean zM87478c2 = progressBarInfo.getShouldShowProgressBar();
            int iM87477b2 = progressBarInfo.getPageNumber();
            int iM87479d2 = progressBarInfo.getTotalPages();
            ParagraphInsets paragraphInsetsM87476a2 = progressBarInfo.getInsets();
            if ((i19 & 1879048192) == i25) {
                r18 = 1;
            } else {
                r18 = r16;
            }
            i26 = r18 | ((i415 & 57344) != 16384 ? r16 : 1);
            objM87133R = r17.m87133R();
            if (i26 == 0) {
                objM87133R = new C28448b(7, onSkipPress, c28714e);
                r17.m87172p0(objM87133R);
            } else {
                objM87133R = new C28448b(7, onSkipPress, c28714e);
                r17.m87172p0(objM87133R);
            }
            int i55 = (57344 & (i19 << 3)) | (ParagraphInsets.$stable << 9) | (i19 & 458752) | (C3927k.f16020r << 18) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024);
            ?? r27 = r17;
            AbstractC28722l.m87369f(zM87478c2, iM87477b2, iM87479d2, paragraphInsetsM87476a2, z13, z15, progressButtonState, onProgressButtonEvent, onStoryBackPress, (InterfaceC4339a) objM87133R, r27, i55);
            r14 = r27;
            enumC16313m1 = enumC16313m4;
        } else {
            onSkipPress = onSkipPress;
            c28714e = education;
            C28655q c28655q10 = c28655q4;
            c28655q10.m87138X();
            z17 = z4;
            enumC16313m1 = enumC16313m0;
            r14 = c28655q10;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            final C28715e0 c28715e3 = c28715e1;
            final Function1 function2 = onSkipPress;
            final C28714e c28714e3 = c28714e;
            final boolean z29 = z17;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p12.r
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC28734x.m87441n0(storyContentViewData, progressBarInfo, onExitPress, onFinalCTAPress, c28714e3, f13, imageInfo, c28715e3, onMediaCardClicked, insets, z29, enumC16313m1, onButtonClicked, z13, z14, z15, progressButtonState, onProgressButtonEvent, onStoryBackPress, function2, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m87435k0(InterfaceC4351m interfaceC4351m, C28715e0 c28715e0) {
        interfaceC4351m.invoke(c28715e0.getVideoUrl(), c28715e0.getTitle());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m87437l0(InterfaceC4351m interfaceC4351m, C28715e0 c28715e0) {
        interfaceC4351m.invoke(c28715e0.getVideoUrl(), c28715e0.getTitle());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m87439m0(Function1 function1, C28714e c28714e) {
        function1.invoke(c28714e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m87441n0(C28707a0 c28707a0, C28736z c28736z, InterfaceC4339a interfaceC4339a, Function1 function1, C28714e c28714e, float f13, C28716f c28716f, C28715e0 c28715e0, InterfaceC4351m interfaceC4351m, ParagraphInsets paragraphInsets, boolean z4, EnumC16313m0 enumC16313m0, Function1 function2, boolean z13, boolean z14, boolean z15, C3927k c3927k, Function1 function3, InterfaceC4339a interfaceC4339a2, Function1 function4, int i13, int i14, int i15, Composer composer, int i16) {
        m87433j0(c28707a0, c28736z, interfaceC4339a, function1, c28714e, f13, c28716f, c28715e0, interfaceC4351m, paragraphInsets, z4, enumC16313m0, function2, z13, z14, z15, c3927k, function3, interfaceC4339a2, function4, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m87443o0(C28716f imageInfo, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Modifier modifierM3479b;
        AbstractC22676k.m65750j(imageInfo, "imageInfo");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1565835816);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(imageInfo) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q = c28655q2;
            c28655q.m87138X();
        } else if (imageInfo.getIsImageBackground()) {
            c28655q2.m87150e0(-174837939);
            AbstractC18247a abstractC18247aM87358a = imageInfo.getBackground();
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (abstractC18247aM87358a == null) {
                c28655q2.m87150e0(-174820177);
                c28655q2.m87173q(false);
                modifierM3479b = null;
            } else {
                c28655q2.m87150e0(-174820176);
                AbstractC18254h abstractC18254hM52584a = AbstractC18255i.m52584a(abstractC18247aM87358a, c28655q2, AbstractC18247a.f71043a);
                Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, c2314t));
                boolean zM87157i = c28655q2.m87157i(imageInfo) | c28655q2.m87157i(abstractC18254hM52584a);
                Object objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C28726p(imageInfo, abstractC18254hM52584a, 0);
                    c28655q2.m87172p0(objM87133R);
                }
                modifierM3479b = AbstractC1125a.m3479b(modifierM3406c, (Function1) objM87133R);
                c28655q2.m87173q(false);
            }
            if (modifierM3479b == null) {
                modifierM3479b = AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, c2314t));
            }
            int i15 = e.f116301a[imageInfo.getMediaType().ordinal()];
            if (i15 == 1) {
                c28655q = c28655q2;
                c28655q.m87150e0(-173592731);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(imageInfo.getImageSource(), null, null, c28655q2, AbstractC22403o.f87638a, 3), "Story Image Background", modifierM3479b, null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                c28655q.m87173q(false);
            } else {
                if (i15 != 2) {
                    throw AbstractC11895b.m32003v(-1529622153, c28655q2, false);
                }
                c28655q2.m87150e0(-173214779);
                InterfaceC35689r0 interfaceC35689r0M87361d = imageInfo.getLottieWrapper();
                if (interfaceC35689r0M87361d == null) {
                    c28655q2.m87150e0(-173214780);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                } else {
                    c28655q2.m87150e0(-173214779);
                    Object objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C28376a(9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    Object objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C28402f(16);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC35684p.m113047h(modifierM3479b, interfaceC35689r0M87361d, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R3, C39102j.f168200b, null, c28655q2, 14352384, 284);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q2;
            c28655q.m87150e0(-172872694);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(imageInfo, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C14018g m87445p0(C28716f c28716f, AbstractC18254h abstractC18254h, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C28726p(c28716f, abstractC18254h, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m87447q0(C28716f c28716f, AbstractC18254h abstractC18254h, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        if (c28716f.getBackgroundType() == EnumC28710c.OVERLAY) {
            ((C0238p0) onDrawWithContent).m728a();
            if (abstractC18254h instanceof C18251e) {
                InterfaceC22131e.m63385u(onDrawWithContent, ((C18251e) abstractC18254h).getBrush(), 0L, 0L, 0.0f, null, 0, 126);
            } else {
                if (!(abstractC18254h instanceof C18253g)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC22131e.m63383i0(onDrawWithContent, ((C18253g) abstractC18254h).getColor(), 0L, 0L, 0.0f, null, 0, 126);
            }
        } else if (c28716f.getBackgroundType() == EnumC28710c.BACKGROUND) {
            if (abstractC18254h instanceof C18251e) {
                InterfaceC22131e.m63385u(onDrawWithContent, ((C18251e) abstractC18254h).getBrush(), 0L, 0L, 0.0f, null, 0, 126);
            } else {
                if (!(abstractC18254h instanceof C18253g)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC22131e.m63383i0(onDrawWithContent, ((C18253g) abstractC18254h).getColor(), 0L, 0L, 0.0f, null, 0, 126);
            }
            ((C0238p0) onDrawWithContent).m728a();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m87449r0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m87451s0(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m87453t0(C28716f c28716f, int i13, Composer composer, int i14) {
        m87443o0(c28716f, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public static final void m87455u0(List<FeatureEducationParagraph> paragraphs, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(paragraphs, "paragraphs");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1350081357);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(paragraphs) ? 4 : 2) | i13 : i13;
        int i15 = 0;
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C28655q c28655q3 = c28655q2;
            for (FeatureEducationParagraph featureEducationParagraph : paragraphs) {
                c28655q3.m87150e0(348065271);
                C28655q c28655q4 = c28655q3;
                for (FeatureEducationSentence featureEducationSentence : featureEducationParagraph.getSentences()) {
                    float f13 = 8;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, ((float) featureEducationParagraph.getInsets().getLeading()) * f13, 0.0f, ((float) featureEducationParagraph.getInsets().getTrailing()) * f13, 0.0f, 10);
                    String text = featureEducationSentence.getText();
                    C2886a name = featureEducationSentence.getStyle().getName();
                    long jMo134584toComposableColorWaAFU9c = featureEducationSentence.getStyle().getColor().mo134584toComposableColorWaAFU9c(c28655q4, i15);
                    float fM124805c = C39183o.m124805c(featureEducationSentence.getStyle().getName().getStyle().f92255a.f92192b);
                    AbstractC28669t1 abstractC28669t1 = AbstractC2453v1.f9569h;
                    C28655q c28655q5 = c28655q4;
                    AbstractC30795n.m94707h(text, modifierM3398t, jMo134584toComposableColorWaAFU9c, AbstractC31061c.m95626b(fM124805c, 4294967296L, (InterfaceC39171c) c28655q4.m87161k(abstractC28669t1)), null, null, null, 0L, null, null, AbstractC31061c.m95626b(C39183o.m124805c(featureEducationSentence.getStyle().getName().getStyle().f92255a.f92192b), 4294967296L, (InterfaceC39171c) c28655q4.m87161k(abstractC28669t1)), 0, false, 0, 0, null, name, null, c28655q5, 0, C2886a.f11498d << 18, 195568);
                    i15 = i15;
                    c28655q4 = c28655q5;
                }
                C28655q c28655q6 = c28655q4;
                c28655q6.m87173q(i15);
                c28655q3 = c28655q6;
            }
            c28655q = c28655q3;
        } else {
            C28655q c28655q7 = c28655q2;
            c28655q7.m87138X();
            c28655q = c28655q7;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(paragraphs, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m87457v0(List list, int i13, Composer composer, int i14) {
        m87455u0(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
