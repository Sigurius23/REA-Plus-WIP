package yo0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingHighlightID;
import cp0.AbstractC10956f;
import cp0.C10961g1;
import cp0.EnumC10952d1;
import p027b3.AbstractC2453v1;
import p181h2.C16618c;
import p390p1.C28635l;
import p390p1.C28655q;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yo0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u0011\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;", "highlight", "Lyo0/g;", "highlightBounds", "Lcp0/g1;", "a", "(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Lyo0/g;Landroidx/compose/runtime/Composer;I)Lcp0/g1;", "Lcp0/d1;", "b", "(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;)Lcp0/d1;", "Landroidx/compose/ui/Modifier;", "", "condition", "Lkotlin/Function1;", "Lh2/c;", "Ll83/a0;", "onCapture", "c", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39679a {

    /* JADX INFO: renamed from: yo0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f170796a;

        static {
            int[] iArr = new int[CoachOnboardingHighlightID.values().length];
            try {
                iArr[CoachOnboardingHighlightID.INPUT_BAR_HIGHLIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoachOnboardingHighlightID.IMAGE_UPLOAD_HIGHLIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoachOnboardingHighlightID.ASK_A_QUESTION_HIGHLIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoachOnboardingHighlightID.VOICE_TO_TEXT_HIGHLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CoachOnboardingHighlightID.CHAT_HISTORY_HIGHLIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f170796a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C10961g1 m126910a(CoachOnboardingHighlightID highlight, C39685g highlightBounds, Composer composer, int i13) {
        C16618c c16618cM126988d;
        AbstractC22676k.m65750j(highlight, "highlight");
        AbstractC22676k.m65750j(highlightBounds, "highlightBounds");
        C28655q c28655q = (C28655q) composer;
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        boolean zM87153g = ((((i13 & 14) ^ 6) > 4 && c28655q.m87149e(highlight.ordinal())) || (i13 & 6) == 4) | c28655q.m87153g(highlightBounds.m126985a()) | c28655q.m87153g(highlightBounds.m126986b()) | c28655q.m87153g(highlightBounds.m126988d()) | c28655q.m87153g(highlightBounds.m126987c()) | c28655q.m87153g(highlightBounds.m126990f()) | c28655q.m87153g(highlightBounds.m126989e());
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            int i14 = a.f170796a[highlight.ordinal()];
            if (i14 == 1) {
                c16618cM126988d = highlightBounds.m126988d();
            } else if (i14 == 2) {
                c16618cM126988d = highlightBounds.m126987c();
            } else if (i14 == 3) {
                c16618cM126988d = highlightBounds.m126988d();
            } else if (i14 == 4) {
                c16618cM126988d = highlightBounds.m126990f();
            } else {
                if (i14 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                c16618cM126988d = highlightBounds.m126986b();
            }
            C16618c c16618c = C16618c.f63938e;
            if (!AbstractC22676k.m65745e(c16618cM126988d, c16618c) && !AbstractC22676k.m65745e(highlightBounds.m126989e(), c16618c)) {
                c16618c = new C16618c(c16618cM126988d.f63939a - highlightBounds.m126989e().f63939a, c16618cM126988d.f63940b - highlightBounds.m126989e().f63940b, c16618cM126988d.f63941c - highlightBounds.m126989e().f63939a, c16618cM126988d.f63942d - highlightBounds.m126989e().f63940b);
            }
            float f13 = 4;
            C10961g1 c10961g1 = new C10961g1(c16618c, interfaceC39171c.mo743q0(3 * f13), interfaceC39171c.mo743q0(1 * f13));
            c28655q.m87172p0(c10961g1);
            objM87133R = c10961g1;
        }
        return (C10961g1) objM87133R;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC10952d1 m126911b(CoachOnboardingHighlightID coachOnboardingHighlightID) {
        int i13 = coachOnboardingHighlightID == null ? -1 : a.f170796a[coachOnboardingHighlightID.ordinal()];
        if (i13 == 2) {
            return EnumC10952d1.BLUR;
        }
        if (i13 != 3) {
            return i13 != 4 ? EnumC10952d1.NONE : EnumC10952d1.AUDIO_INPUT;
        }
        return EnumC10952d1.TEXT_FIELD;
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m126912c(Modifier modifier, boolean z4, Function1 onCapture) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(onCapture, "onCapture");
        return z4 ? AbstractC10956f.m29065q(modifier, onCapture) : modifier;
    }
}
