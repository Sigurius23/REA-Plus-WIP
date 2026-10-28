package gh0;

import a01.C0084d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq0.C1898i;
import ar2.C1935f;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.bot.models.feedback.FeedbackReason;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.p057ai.chat.models.TurnFeedback;
import cy1.C11186b;
import eg.C13161j;
import ep1.C13411f;
import fd3.C14408a;
import g11.C15218b;
import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.AbstractC27292z;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13921a0;
import p163g1.AbstractC15027h3;
import p163g1.AbstractC15164u8;
import p163g1.C15043i8;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: gh0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f²\u0006\u000e\u0010\u001e\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "turnId", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "initialFeedbackType", "Lkotlin/Function1;", "Lcom/whoop/ai/chat/models/TurnFeedback;", "Ll83/a0;", "onSubmit", "t", "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "selected", "Lkotlin/Function0;", "onPositiveSelected", "onNegativeSelected", "r", "(Lcom/whoop/bot/models/feedback/AiFeedbackType;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "feedbackType", "", "isSelected", "onClick", "p", "(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/bot/models/feedback/FeedbackReason;", "", "I", "(Lcom/whoop/bot/models/feedback/FeedbackReason;)I", "feedbackText", "onTextChanged", "n", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "typeSelected", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15850e {

    /* JADX INFO: renamed from: gh0.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ long f59868w;

        public a(long j7) {
            this.f59868w = j7;
        }

        /* JADX INFO: renamed from: a */
        public final long m44740a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return this.f59868w;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m44740a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gh0.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59869a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f59870b;

        static {
            int[] iArr = new int[AiFeedbackType.values().length];
            try {
                iArr[AiFeedbackType.BETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AiFeedbackType.WORSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f59869a = iArr;
            int[] iArr2 = new int[FeedbackReason.values().length];
            try {
                iArr2[FeedbackReason.INACCURATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FeedbackReason.UNHELPFUL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FeedbackReason.OFF_TOPIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FeedbackReason.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f59870b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final boolean m44705A(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m44706B(InterfaceC28601c1 interfaceC28601c1) {
        m44735v(interfaceC28601c1, AiFeedbackType.BETTER);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m44707C(InterfaceC28601c1 interfaceC28601c1) {
        m44735v(interfaceC28601c1, AiFeedbackType.WORSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m44708D(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m44737x(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m44709E(FeedbackReason feedbackReason, C39967p c39967p, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(m44713I(feedbackReason));
            AbstractC33088k.g gVar = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            boolean zContains = c39967p.contains(feedbackReason);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87149e(feedbackReason.ordinal());
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C14408a(21, function1, feedbackReason);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33087j.m104824f(c8688bM21277k, gVar, zContains, true, 0, 0L, null, null, false, 0L, (Function1) objM87133R, c28655q, TextResource.C8688b.f25889c | 3072 | (AbstractC33088k.g.f137992d << 3), 0, MessageListItemViewType.GIPHY);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m44710F(Function1 function1, FeedbackReason feedbackReason, boolean z4) {
        function1.invoke(feedbackReason);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m44711G(Function1 function1, String str, C39967p c39967p, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        List arrayList;
        AiFeedbackType aiFeedbackTypeM44734u = m44734u(interfaceC28601c1);
        String lowerCase = m44734u(interfaceC28601c1).name().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        String strM44736w = m44736w(interfaceC28601c2);
        if (AbstractC39414r.m125890i0(strM44736w)) {
            strM44736w = "";
        }
        if (m44734u(interfaceC28601c1) == AiFeedbackType.WORSE) {
            arrayList = new ArrayList(AbstractC25267u.m74163i0(c39967p, 10));
            Iterator<E> it = c39967p.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeedbackReason) it.next()).getValue());
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        function1.invoke(new TurnFeedback(str, aiFeedbackTypeM44734u, new AiMessageFeedback(lowerCase, strM44736w, arrayList)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m44712H(String str, AiFeedbackType aiFeedbackType, Function1 function1, int i13, Composer composer, int i14) {
        m44733t(str, aiFeedbackType, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final int m44713I(FeedbackReason feedbackReason) {
        int i13 = b.f59870b[feedbackReason.ordinal()];
        if (i13 == 1) {
            return AbstractC37336b.f159608A;
        }
        if (i13 == 2) {
            return AbstractC37336b.f159624I;
        }
        if (i13 == 3) {
            return AbstractC37336b.f159610B;
        }
        if (i13 == 4) {
            return AbstractC37336b.f159612C;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    private static final void m44727n(String str, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        String str2 = str;
        Function1 function2 = function1;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1256384330);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str2) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            float f13 = 4;
            float f14 = 3 * f13;
            Modifier modifierM3411h = AbstractC1102d.m3411h(25 * f13, AbstractC1102d.m3409f(1.0f, AbstractC15751g.m44455h(C2314t.f9131w, 1, c38072d.m121949b(c28655q2, i16).getWhite50(), AbstractC33253j.m105489e(f14))));
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
            C15043i8 c15043i8 = C15043i8.f56313a;
            str2 = str;
            function2 = function1;
            AbstractC15164u8.m43192a(str2, function2, modifierM3411h, false, AbstractC33745d.m106661t(c38072d, c28655q2, i16), null, C15846a.f59851a.m44683b(), null, null, null, null, false, 0, 0, c33252iM105489e, C15043i8.m43130h(c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, c38072d.m121949b(c28655q2, i16).getBlack20(), c38072d.m121949b(c28655q2, i16).getBrandWhite(), c38072d.m121949b(c28655q2, i16).getBrandWhite(), c38072d.m121949b(c28655q2, i16).getTransparent(), c38072d.m121949b(c28655q2, i16).getTransparent(), c38072d.m121949b(c28655q2, i16).getTransparent(), c38072d.m121949b(c28655q2, i16).getTransparent(), 0L, 0L, 0L, 0L, c28655q2, 2096642), c28655q2, (i15 & 14) | 12582912 | (i15 & 112), 24576, 245592);
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15848c(str2, i13, 0, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m44728o(String str, Function1 function1, int i13, Composer composer, int i14) {
        m44727n(str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m44729p(AiFeedbackType aiFeedbackType, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        long jM95628d;
        long jM95624D;
        int iM46344k0;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1978274258);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(aiFeedbackType.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            if (z4) {
                c28655q.m87150e0(-1548944708);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-1548943623);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            if (z4) {
                c28655q.m87150e0(-1548941636);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-1548940548);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            int[] iArr = b.f59869a;
            int i16 = iArr[aiFeedbackType.ordinal()];
            if (i16 == 1) {
                iM46344k0 = C38072d.f163053a.m121951d().getVarious().getThumbUp();
            } else {
                if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iM46344k0 = C38072d.f163053a.m121951d().getVarious().getThumbDown();
            }
            int i17 = iM46344k0;
            int i18 = iArr[aiFeedbackType.ordinal()];
            if (i18 == 1) {
                i15 = AbstractC37336b.f159613C0;
            } else {
                if (i18 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = AbstractC37336b.f159611B0;
            }
            float f13 = 1;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * 8, AbstractC11895b.m31987f(f13, 4, C2314t.f9131w, jM95628d));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
            boolean zM87151f = c28655q.m87151f(jM95624D);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                objM87133R = new a(jM95624D);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(new C27270o(bVar, i17, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21273g(i15, c28655q, 0), null, null, interfaceC4339a, c28655q, C27270o.f109105k | ((i14 << 6) & 57344), 12);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(aiFeedbackType, z4, interfaceC4339a, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m44730q(AiFeedbackType aiFeedbackType, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m44729p(aiFeedbackType, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m44731r(AiFeedbackType aiFeedbackType, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-337392715);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87149e(aiFeedbackType.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a2) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            String strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159622H, c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            int i16 = i14;
            AbstractC30795n.m94707h(strM21273g, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q2;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AiFeedbackType aiFeedbackType2 = AiFeedbackType.BETTER;
            m44729p(aiFeedbackType2, aiFeedbackType == aiFeedbackType2, interfaceC4339a, c28655q, ((i16 << 3) & 896) | 6);
            AiFeedbackType aiFeedbackType3 = AiFeedbackType.WORSE;
            m44729p(aiFeedbackType3, aiFeedbackType == aiFeedbackType3, interfaceC4339a2, c28655q, (i16 & 896) | 6);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(aiFeedbackType, interfaceC4339a, interfaceC4339a2, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m44732s(AiFeedbackType aiFeedbackType, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m44731r(aiFeedbackType, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:106:0x021b A[LOOP:0: B:104:0x0215->B:106:0x021b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0243  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:114:0x026c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0270  */
    /* JADX WARN: Code duplicated, block: B:119:0x0287 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0289  */
    /* JADX WARN: Code duplicated, block: B:76:0x013b  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183  */
    /* JADX WARN: Code duplicated, block: B:85:0x019e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: t */
    public static final void m44733t(String turnId, AiFeedbackType initialFeedbackType, Function1 onSubmit, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        int i16;
        int iHashCode;
        boolean zM87153g;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean zM87153g2;
        Object objM87133R2;
        boolean zM87153g3;
        Object objM87133R3;
        boolean z4;
        boolean z13;
        boolean zM87153g4;
        Object objM87133R4;
        Iterator<E> it;
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(initialFeedbackType, "initialFeedbackType");
        AbstractC22676k.m65750j(onSubmit, "onSubmit");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1827284171);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(turnId) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87149e(initialFeedbackType.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onSubmit) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i17 = i14 & 14;
            boolean z14 = ((i14 & 112) == 32) | (i17 == 4);
            Object objM87133R5 = c28655q2.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z14 || objM87133R5 == c28676v1) {
                objM87133R5 = AbstractC28683x.m87272z(initialFeedbackType);
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
            boolean z15 = i17 == 4;
            Object objM87133R6 = c28655q2.m87133R();
            if (z15 || objM87133R6 == c28676v1) {
                objM87133R6 = AbstractC28683x.m87272z("");
                c28655q2.m87172p0(objM87133R6);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R6;
            boolean z16 = i17 == 4;
            Object objM87133R7 = c28655q2.m87133R();
            if (z16 || objM87133R7 == c28676v1) {
                objM87133R7 = new C39967p();
                c28655q2.m87172p0(objM87133R7);
            }
            C39967p c39967p = (C39967p) objM87133R7;
            boolean zM87153g5 = c28655q2.m87153g(c39967p);
            Object objM87133R8 = c28655q2.m87133R();
            if (zM87153g5 || objM87133R8 == c28676v1) {
                objM87133R8 = new C13411f(c39967p, 1);
                c28655q2.m87172p0(objM87133R8);
            }
            Function1 function1 = (Function1) objM87133R8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3406c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                i15 = i17;
            } else {
                i15 = i17;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                i16 = i14;
                float f13 = 2 * 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, true), AbstractC30060g.m92099U(0, c28655q2, 1), 14), f13, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                AiFeedbackType aiFeedbackTypeM44734u = m44734u(interfaceC28601c1);
                zM87153g = c28655q2.m87153g(interfaceC28601c1);
                objM87133R = c28655q2.m87133R();
                if (zM87153g) {
                    c28676v0 = c28676v1;
                } else {
                    c28676v0 = c28676v1;
                    if (objM87133R == c28676v0) {
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C15218b(7, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    m44731r(aiFeedbackTypeM44734u, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q2, 0);
                    String strM44736w = m44736w(interfaceC28601c2);
                    zM87153g3 = c28655q2.m87153g(interfaceC28601c2);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g3 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C13921a0(11, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    m44727n(strM44736w, (Function1) objM87133R3, c28655q2, 0);
                    if (m44734u(interfaceC28601c1) == AiFeedbackType.WORSE) {
                        c28655q2.m87150e0(208014655);
                        it = FeedbackReason.getEntries().iterator();
                        while (it.hasNext()) {
                            AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.FALSE), AbstractC37817c.m121344e(-810211652, c28655q2, new C0084d((FeedbackReason) it.next(), c39967p, function1, 16)), c28655q2, 56);
                        }
                        z4 = false;
                        c28655q2.m87173q(false);
                    } else {
                        z4 = false;
                        c28655q2.m87150e0(208633539);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
                    TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159618F);
                    if ((i16 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = z4;
                    }
                    if (i15 == 4) {
                        z4 = true;
                    }
                    zM87153g4 = z13 | z4 | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87153g(c39967p);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g4 || objM87133R4 == c28676v0) {
                        C15849d c15849d = new C15849d(onSubmit, turnId, c39967p, interfaceC28601c1, interfaceC28601c2);
                        c28655q2.m87172p0(c15849d);
                        objM87133R4 = c15849d;
                    }
                    AbstractC27292z.m82343j(modifierM3396r2, true, true, null, null, null, c8688bM21277k, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.C8688b.f25889c << 18) | 438, 0, 8120);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                }
                objM87133R = new C15218b(6, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R);
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                zM87153g2 = c28655q2.m87153g(interfaceC28601c1);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R2 = new C15218b(7, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C15218b(7, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R2);
                }
                m44731r(aiFeedbackTypeM44734u, interfaceC4339a2, (InterfaceC4339a) objM87133R2, c28655q2, 0);
                String strM44736w2 = m44736w(interfaceC28601c2);
                zM87153g3 = c28655q2.m87153g(interfaceC28601c2);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R3 = new C13921a0(11, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13921a0(11, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R3);
                }
                m44727n(strM44736w2, (Function1) objM87133R3, c28655q2, 0);
                if (m44734u(interfaceC28601c1) == AiFeedbackType.WORSE) {
                    c28655q2.m87150e0(208014655);
                    it = FeedbackReason.getEntries().iterator();
                    while (it.hasNext()) {
                        AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.FALSE), AbstractC37817c.m121344e(-810211652, c28655q2, new C0084d((FeedbackReason) it.next(), c39967p, function1, 16)), c28655q2, 56);
                    }
                    z4 = false;
                    c28655q2.m87173q(false);
                } else {
                    z4 = false;
                    c28655q2.m87150e0(208633539);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
                TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC37336b.f159618F);
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = z4;
                }
                if (i15 == 4) {
                    z4 = true;
                }
                zM87153g4 = z13 | z4 | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87153g(c39967p);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g4) {
                    C15849d c15849d2 = new C15849d(onSubmit, turnId, c39967p, interfaceC28601c1, interfaceC28601c2);
                    c28655q2.m87172p0(c15849d2);
                    objM87133R4 = c15849d2;
                } else {
                    C15849d c15849d3 = new C15849d(onSubmit, turnId, c39967p, interfaceC28601c1, interfaceC28601c2);
                    c28655q2.m87172p0(c15849d3);
                    objM87133R4 = c15849d3;
                }
                AbstractC27292z.m82343j(modifierM3396r3, true, true, null, null, null, c8688bM21277k2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.C8688b.f25889c << 18) | 438, 0, 8120);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            i16 = i14;
            float f14 = 2 * 8;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, true), AbstractC30060g.m92099U(0, c28655q2, 1), 14), f14, 0.0f, 2);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
            AiFeedbackType aiFeedbackTypeM44734u2 = m44734u(interfaceC28601c1);
            zM87153g = c28655q2.m87153g(interfaceC28601c1);
            objM87133R = c28655q2.m87133R();
            if (zM87153g) {
                c28676v0 = c28676v1;
                if (objM87133R == c28676v0) {
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                zM87153g2 = c28655q2.m87153g(interfaceC28601c1);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R2 = new C15218b(7, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C15218b(7, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R2);
                }
                m44731r(aiFeedbackTypeM44734u2, interfaceC4339a3, (InterfaceC4339a) objM87133R2, c28655q2, 0);
                String strM44736w3 = m44736w(interfaceC28601c2);
                zM87153g3 = c28655q2.m87153g(interfaceC28601c2);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R3 = new C13921a0(11, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13921a0(11, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R3);
                }
                m44727n(strM44736w3, (Function1) objM87133R3, c28655q2, 0);
                if (m44734u(interfaceC28601c1) == AiFeedbackType.WORSE) {
                    c28655q2.m87150e0(208014655);
                    it = FeedbackReason.getEntries().iterator();
                    while (it.hasNext()) {
                        AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.FALSE), AbstractC37817c.m121344e(-810211652, c28655q2, new C0084d((FeedbackReason) it.next(), c39967p, function1, 16)), c28655q2, 56);
                    }
                    z4 = false;
                    c28655q2.m87173q(false);
                } else {
                    z4 = false;
                    c28655q2.m87150e0(208633539);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC37336b.f159618F);
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = z4;
                }
                if (i15 == 4) {
                    z4 = true;
                }
                zM87153g4 = z13 | z4 | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87153g(c39967p);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g4) {
                    C15849d c15849d4 = new C15849d(onSubmit, turnId, c39967p, interfaceC28601c1, interfaceC28601c2);
                    c28655q2.m87172p0(c15849d4);
                    objM87133R4 = c15849d4;
                } else {
                    C15849d c15849d5 = new C15849d(onSubmit, turnId, c39967p, interfaceC28601c1, interfaceC28601c2);
                    c28655q2.m87172p0(c15849d5);
                    objM87133R4 = c15849d5;
                }
                AbstractC27292z.m82343j(modifierM3396r5, true, true, null, null, null, c8688bM21277k3, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.C8688b.f25889c << 18) | 438, 0, 8120);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            } else {
                c28676v0 = c28676v1;
            }
            objM87133R = new C15218b(6, interfaceC28601c1);
            c28655q2.m87172p0(objM87133R);
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            zM87153g2 = c28655q2.m87153g(interfaceC28601c1);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R2 = new C15218b(7, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C15218b(7, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R2);
            }
            m44731r(aiFeedbackTypeM44734u2, interfaceC4339a4, (InterfaceC4339a) objM87133R2, c28655q2, 0);
            String strM44736w4 = m44736w(interfaceC28601c2);
            zM87153g3 = c28655q2.m87153g(interfaceC28601c2);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g3) {
                objM87133R3 = new C13921a0(11, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C13921a0(11, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R3);
            }
            m44727n(strM44736w4, (Function1) objM87133R3, c28655q2, 0);
            if (m44734u(interfaceC28601c1) == AiFeedbackType.WORSE) {
                c28655q2.m87150e0(208014655);
                it = FeedbackReason.getEntries().iterator();
                while (it.hasNext()) {
                    AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.FALSE), AbstractC37817c.m121344e(-810211652, c28655q2, new C0084d((FeedbackReason) it.next(), c39967p, function1, 16)), c28655q2, 56);
                }
                z4 = false;
                c28655q2.m87173q(false);
            } else {
                z4 = false;
                c28655q2.m87150e0(208633539);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
            TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC37336b.f159618F);
            if ((i16 & 896) == 256) {
                z13 = true;
            } else {
                z13 = z4;
            }
            if (i15 == 4) {
                z4 = true;
            }
            zM87153g4 = z13 | z4 | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87153g(c39967p);
            objM87133R4 = c28655q2.m87133R();
            if (zM87153g4) {
                C15849d c15849d6 = new C15849d(onSubmit, turnId, c39967p, interfaceC28601c1, interfaceC28601c2);
                c28655q2.m87172p0(c15849d6);
                objM87133R4 = c15849d6;
            } else {
                C15849d c15849d7 = new C15849d(onSubmit, turnId, c39967p, interfaceC28601c1, interfaceC28601c2);
                c28655q2.m87172p0(c15849d7);
                objM87133R4 = c15849d7;
            }
            AbstractC27292z.m82343j(modifierM3396r6, true, true, null, null, null, c8688bM21277k4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (TextResource.C8688b.f25889c << 18) | 438, 0, 8120);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(i13, 24, turnId, initialFeedbackType, onSubmit);
        }
    }

    /* JADX INFO: renamed from: u */
    private static final AiFeedbackType m44734u(InterfaceC28601c1 interfaceC28601c1) {
        return (AiFeedbackType) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m44735v(InterfaceC28601c1 interfaceC28601c1, AiFeedbackType aiFeedbackType) {
        interfaceC28601c1.setValue(aiFeedbackType);
    }

    /* JADX INFO: renamed from: w */
    private static final String m44736w(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: x */
    private static final void m44737x(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m44738y(C39967p c39967p, FeedbackReason reason) {
        AbstractC22676k.m65750j(reason, "reason");
        if (c39967p.contains(reason)) {
            c39967p.removeIf(new C1898i(new C13161j(reason, 25), 2));
        } else {
            c39967p.add(reason);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final boolean m44739z(FeedbackReason feedbackReason, FeedbackReason it) {
        AbstractC22676k.m65750j(it, "it");
        return it == feedbackReason;
    }
}
