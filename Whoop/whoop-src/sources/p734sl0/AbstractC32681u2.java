package p734sl0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c30.C3911b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.bot.models.feedback.AiFeedbackTypeKt;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.bot.models.feedback.FeedbackReason;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f31.AbstractC14046c;
import f31.C14044a;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import gh0.C15849d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import n83.C26459b;
import nl0.AbstractC26802d;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.AbstractC27282u;
import ny0.C27270o;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15027h3;
import p163g1.AbstractC15164u8;
import p163g1.C15043i8;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
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
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31919h;
import p745y81.C39336i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import r90.C31095b;
import s51.C32205b;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc2.C32375n;
import sg2.C32464o;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.C38072d;

/* JADX INFO: renamed from: sl0.u2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\n\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0016\u001a\u00020\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "messageId", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "existingFeedback", "", "fromWrapper", "Lkotlin/Function1;", "Lnl0/d;", "Ll83/a0;", "onViewEvent", "z", "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feedbackText", "enabled", "onTextChanged", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "onPositiveFeedbackSelected", "onNegativeFeedbackSelected", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "selected", "r", "(Lc93/a;Lc93/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;Landroidx/compose/runtime/Composer;II)V", "typeSelected", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32681u2 {

    /* JADX INFO: renamed from: sl0.u2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ long f135675w;

        public a(long j7) {
            this.f135675w = j7;
        }

        /* JADX INFO: renamed from: a */
        public final long m102491a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return this.f135675w;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m102491a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: sl0.u2$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.MessageFeedbackViewKt$FeedbackV2SheetContent$1$1", m100430f = "MessageFeedbackView.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C39967p f135676E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f135677F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f135678G;

        /* JADX INFO: renamed from: w */
        int f135679w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f135680x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f135681y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AiMessageFeedback f135682z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, AiMessageFeedback aiMessageFeedback, C39967p c39967p, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135681y = str;
            this.f135682z = aiMessageFeedback;
            this.f135676E = c39967p;
            this.f135677F = interfaceC28601c1;
            this.f135678G = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f135681y, this.f135682z, this.f135676E, this.f135677F, this.f135678G, interfaceC30057d);
            bVar.f135680x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135679w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f135681y != null) {
                C39967p c39967p = this.f135676E;
                InterfaceC28601c1 interfaceC28601c1 = this.f135677F;
                InterfaceC28601c1 interfaceC28601c2 = this.f135678G;
                AbstractC32681u2.m102456I(interfaceC28601c1, null);
                AbstractC32681u2.m102458K(interfaceC28601c2, "");
                c39967p.clear();
            }
            AiMessageFeedback aiMessageFeedback = this.f135682z;
            if (aiMessageFeedback != null) {
                C39967p c39967p2 = this.f135676E;
                InterfaceC28601c1 interfaceC28601c3 = this.f135677F;
                InterfaceC28601c1 interfaceC28601c4 = this.f135678G;
                AbstractC32681u2.m102456I(interfaceC28601c3, AiFeedbackTypeKt.feedbackFromString(aiMessageFeedback.getFeedbackType()));
                AbstractC32681u2.m102458K(interfaceC28601c4, aiMessageFeedback.getFeedbackResponse());
                List<String> feedbackReasons = aiMessageFeedback.getFeedbackReasons();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(feedbackReasons, 10));
                Iterator<T> it = feedbackReasons.iterator();
                while (it.hasNext()) {
                    arrayList.add(FeedbackReason.valueOf((String) it.next()));
                }
                c39967p2.addAll(AbstractC28683x.m87242J(arrayList));
            } else {
                AbstractC32681u2.m102456I(this.f135677F, AiFeedbackType.BETTER);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.u2$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f135683a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f135684b;

        static {
            int[] iArr = new int[FeedbackReason.values().length];
            try {
                iArr[FeedbackReason.INACCURATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedbackReason.UNHELPFUL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeedbackReason.OFF_TOPIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeedbackReason.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f135683a = iArr;
            int[] iArr2 = new int[AiFeedbackType.values().length];
            try {
                iArr2[AiFeedbackType.BETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AiFeedbackType.WORSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f135684b = iArr2;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final AiFeedbackType m102448A(InterfaceC28601c1 interfaceC28601c1) {
        return (AiFeedbackType) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m102449B(InterfaceC28601c1 interfaceC28601c1) {
        m102456I(interfaceC28601c1, AiFeedbackType.BETTER);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m102450C(InterfaceC28601c1 interfaceC28601c1) {
        m102456I(interfaceC28601c1, AiFeedbackType.WORSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m102451D(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m102458K(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m102452E(int i13, C39967p c39967p, FeedbackReason feedbackReason, InterfaceC28601c1 interfaceC28601c1, Function1 function1, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(i13);
            AbstractC33088k.g gVar = new AbstractC33088k.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            boolean z4 = m102448A(interfaceC28601c1) != null;
            boolean zContains = c39967p.contains(feedbackReason);
            boolean zM87149e = c28655q.m87149e(feedbackReason.ordinal());
            Object objM87133R = c28655q.m87133R();
            if (zM87149e || objM87133R == C28635l.f115821a) {
                objM87133R = new C32678u(4, function1, feedbackReason);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33087j.m104824f(c8688bM21277k, gVar, zContains, z4, 0, 0L, null, null, false, 0L, (Function1) objM87133R, c28655q, TextResource.C8688b.f25889c | (AbstractC33088k.g.f137992d << 3), 0, MessageListItemViewType.GIPHY);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m102453F(Function1 function1, FeedbackReason feedbackReason, boolean z4) {
        function1.invoke(feedbackReason);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m102454G(String str, Function1 function1, C39967p c39967p, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        String value;
        ?? arrayList;
        if (m102448A(interfaceC28601c1) != null && str != null) {
            AiFeedbackType aiFeedbackTypeM102448A = m102448A(interfaceC28601c1);
            if (aiFeedbackTypeM102448A == null || (value = aiFeedbackTypeM102448A.getValue()) == null) {
                value = "";
            }
            String strM102457J = m102457J(interfaceC28601c2);
            if (m102448A(interfaceC28601c1) == AiFeedbackType.WORSE) {
                arrayList = new ArrayList(AbstractC25267u.m74163i0(c39967p, 10));
                ListIterator listIterator = c39967p.listIterator();
                while (true) {
                    C26459b c26459b = (C26459b) listIterator;
                    if (!c26459b.hasNext()) {
                        break;
                    }
                    arrayList.add(((FeedbackReason) c26459b.next()).getValue());
                }
            } else {
                arrayList = C25271y.f99162w;
            }
            function1.invoke(new AbstractC26802d.k(str, new AiMessageFeedback(value, strM102457J, arrayList)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m102455H(String str, AiMessageFeedback aiMessageFeedback, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m102490z(str, aiMessageFeedback, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m102456I(InterfaceC28601c1 interfaceC28601c1, AiFeedbackType aiFeedbackType) {
        interfaceC28601c1.setValue(aiFeedbackType);
    }

    /* JADX INFO: renamed from: J */
    private static final String m102457J(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m102458K(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m102459L(C39967p c39967p, FeedbackReason reason) {
        AbstractC22676k.m65750j(reason, "reason");
        if (c39967p.contains(reason)) {
            final C32604f c32604f = new C32604f(reason, 3);
            c39967p.removeIf(new Predicate() { // from class: sl0.s2
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return AbstractC32681u2.m102461N(c32604f, obj);
                }
            });
        } else {
            c39967p.add(reason);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final boolean m102460M(FeedbackReason feedbackReason, FeedbackReason it) {
        AbstractC22676k.m65750j(it, "it");
        return it == feedbackReason;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final boolean m102461N(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final Modifier m102462O(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC22953f.m66720i(C2314t.f9131w);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x0197  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    private static final void m102482r(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, AiFeedbackType aiFeedbackType, Composer composer, int i13, int i14) {
        InterfaceC4339a interfaceC4339a3;
        int i15;
        InterfaceC4339a interfaceC4339a4;
        int i16;
        int iOrdinal;
        int i17;
        boolean z4;
        AiFeedbackType aiFeedbackType2;
        InterfaceC4339a interfaceC4339a5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final InterfaceC4339a interfaceC4339a6;
        final InterfaceC4339a interfaceC4339a7;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-290668016);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            interfaceC4339a3 = interfaceC4339a;
        } else if ((i13 & 6) == 0) {
            interfaceC4339a3 = interfaceC4339a;
            i15 = (c28655q.m87157i(interfaceC4339a3) ? 4 : 2) | i13;
        } else {
            interfaceC4339a3 = interfaceC4339a;
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                i15 |= c28655q.m87157i(interfaceC4339a4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                if (aiFeedbackType == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = aiFeedbackType.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32581a1(14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a6 = interfaceC4339a3;
                }
                if (i19 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32581a1(15);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a4;
                }
                if (i16 != 0) {
                    aiFeedbackType2 = null;
                } else {
                    aiFeedbackType2 = aiFeedbackType;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
                String strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159622H, c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21273g, null, c38072d.m121949b(c28655q, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                AbstractC14046c.m39965e(AbstractC37056f.m118959K(AiFeedbackType.BETTER, AiFeedbackType.WORSE), aiFeedbackType2, null, null, null, AbstractC37817c.m121344e(-28438712, c28655q, new InterfaceC4353o() { // from class: sl0.t2
                    @Override // c93.InterfaceC4353o
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return AbstractC32681u2.m102485u(interfaceC4339a6, interfaceC4339a7, (InterfaceC1103a) obj, (AiFeedbackType) obj2, (C14044a) obj3, (Composer) obj4, iIntValue);
                    }
                }), c28655q, ((i15 >> 3) & 112) | 196614, 28);
                c28655q.m87173q(true);
                interfaceC4339a5 = interfaceC4339a7;
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q.m87138X();
                aiFeedbackType2 = aiFeedbackType;
                interfaceC4339a5 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b(interfaceC4339a3, interfaceC4339a5, aiFeedbackType2, i13, i14, 12);
            }
        }
        i15 |= 48;
        interfaceC4339a4 = interfaceC4339a2;
        i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            if (aiFeedbackType == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = aiFeedbackType.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32581a1(14);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a6 = interfaceC4339a3;
            }
            if (i19 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32581a1(15);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a7 = interfaceC4339a4;
            }
            if (i16 != 0) {
                aiFeedbackType2 = null;
            } else {
                aiFeedbackType2 = aiFeedbackType;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC37336b.f159622H, c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            int i25 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21273g2, null, c38072d2.m121949b(c28655q, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i25).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            AbstractC14046c.m39965e(AbstractC37056f.m118959K(AiFeedbackType.BETTER, AiFeedbackType.WORSE), aiFeedbackType2, null, null, null, AbstractC37817c.m121344e(-28438712, c28655q, new InterfaceC4353o() { // from class: sl0.t2
                @Override // c93.InterfaceC4353o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    return AbstractC32681u2.m102485u(interfaceC4339a6, interfaceC4339a7, (InterfaceC1103a) obj, (AiFeedbackType) obj2, (C14044a) obj3, (Composer) obj4, iIntValue);
                }
            }), c28655q, ((i15 >> 3) & 112) | 196614, 28);
            c28655q.m87173q(true);
            interfaceC4339a5 = interfaceC4339a7;
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q.m87138X();
            aiFeedbackType2 = aiFeedbackType;
            interfaceC4339a5 = interfaceC4339a4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(interfaceC4339a3, interfaceC4339a5, aiFeedbackType2, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m102483s() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m102484t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m102485u(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC1103a RadioGroup, AiFeedbackType item, C14044a state, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a3;
        int iM46344k0;
        int i15;
        AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(state, "state");
        if ((i13 & 48) == 0) {
            i14 = (((C28655q) composer).m87149e(item.ordinal()) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? ((C28655q) composer).m87153g(state) : ((C28655q) composer).m87157i(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 1169) != 1168)) {
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C39336i c39336iM121949b = c38072d.m121949b(c28655q, i16);
            long jM125430y = state.getIsSelected() ? c39336iM121949b.getBrandWhite() : c39336iM121949b.getWhite10();
            C39336i c39336iM121949b2 = c38072d.m121949b(c28655q, i16);
            long jM125426w = state.getIsSelected() ? c39336iM121949b2.getBrandBlack() : c39336iM121949b2.getBrandWhite();
            int[] iArr = c.f135684b;
            int i17 = iArr[item.ordinal()];
            if (i17 == 1) {
                interfaceC4339a3 = interfaceC4339a;
            } else {
                if (i17 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC4339a3 = interfaceC4339a2;
            }
            int i18 = iArr[item.ordinal()];
            if (i18 == 1) {
                iM46344k0 = c38072d.m121951d().getVarious().getThumbUp();
            } else {
                if (i18 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iM46344k0 = c38072d.m121951d().getVarious().getThumbDown();
            }
            int i19 = iM46344k0;
            int i24 = iArr[item.ordinal()];
            if (i24 == 1) {
                i15 = AbstractC37336b.f159613C0;
            } else {
                if (i24 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = AbstractC37336b.f159611B0;
            }
            float f13 = 1;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * 8, AbstractC11895b.m31987f(f13, 4, C2314t.f9131w, jM125430y));
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
            boolean zM87151f = c28655q.m87151f(jM125426w);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                objM87133R = new a(jM125426w);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(new C27270o(bVar, i19, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC8693b.m21273g(i15, c28655q, 0), null, null, interfaceC4339a3, c28655q, C27270o.f109105k, 12);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m102486v(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, AiFeedbackType aiFeedbackType, int i13, int i14, Composer composer, int i15) {
        m102482r(interfaceC4339a, interfaceC4339a2, aiFeedbackType, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m102487w(String str, boolean z4, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long jM95628d;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(157613598);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 1;
            if (z4) {
                c28655q2.m87150e0(1142820517);
                jM95628d = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            } else {
                c28655q2.m87150e0(1142821509);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            float f14 = 4;
            float f15 = 3 * f14;
            Modifier modifierM3411h = AbstractC1102d.m3411h(25 * f14, AbstractC1102d.m3409f(1.0f, AbstractC15751g.m44455h(C2314t.f9131w, f13, jM95628d, AbstractC33253j.m105489e(f15))));
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f15);
            C15043i8 c15043i8 = C15043i8.f56313a;
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            int i16 = i14;
            AbstractC15164u8.m43192a(str, function1, modifierM3411h, z4, AbstractC33745d.m106661t(c38072d, c28655q2, i15), null, AbstractC37817c.m121344e(1112940419, c28655q2, new C3911b(z4, 4)), null, null, null, null, false, 0, 0, c33252iM105489e, C15043i8.m43130h(c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, c38072d.m121949b(c28655q2, i15).getBlack20(), c38072d.m121949b(c28655q2, i15).getBrandWhite(), c38072d.m121949b(c28655q2, i15).getBrandWhite(), c38072d.m121949b(c28655q2, i15).getTransparent(), c38072d.m121949b(c28655q2, i15).getTransparent(), c38072d.m121949b(c28655q2, i15).getTransparent(), c38072d.m121949b(c28655q2, i15).getTransparent(), 0L, 0L, 0L, 0L, c28655q2, 2096642), c28655q2, (i16 & 14) | 12582912 | ((i16 >> 3) & 112) | ((i16 << 6) & 7168), 24576, 245584);
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(str, z4, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m102488x(boolean z4, Composer composer, int i13) {
        long jM125370W0;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159614D, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i14).getB1();
            if (z4) {
                jM125370W0 = AbstractC31061c.m95627c(c28655q, 88892842, c38072d, c28655q, i14);
            } else {
                c28655q.m87150e0(88893834);
                jM125370W0 = c38072d.m121949b(c28655q, i14).getWhite10();
            }
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(strM21273g, null, jM125370W0, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m102489y(String str, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m102487w(str, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0231  */
    /* JADX WARN: Code duplicated, block: B:106:0x0249  */
    /* JADX WARN: Code duplicated, block: B:108:0x0257  */
    /* JADX WARN: Code duplicated, block: B:110:0x0264  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:114:0x026a  */
    /* JADX WARN: Code duplicated, block: B:116:0x026d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0278  */
    /* JADX WARN: Code duplicated, block: B:121:0x027b  */
    /* JADX WARN: Code duplicated, block: B:122:0x027e  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:143:0x0324  */
    /* JADX WARN: Code duplicated, block: B:146:0x032f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:77:0x016e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x0249, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static final void m102490z(String str, AiMessageFeedback aiMessageFeedback, boolean z4, Function1 onViewEvent, Composer composer, int i13, int i14) {
        boolean z13;
        int i15;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        C39967p c39967p;
        int i16;
        boolean z17;
        boolean zM87157i;
        Object bVar;
        int i17;
        C39967p c39967p2;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        Function1 function1;
        Object objM87133R5;
        int iHashCode;
        C0213j c0213j;
        C39967p c39967p3;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R6;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z18;
        Object objM87133R8;
        int i18;
        int i19;
        int i24;
        int i25;
        Object objM87133R9;
        int i26;
        int i27;
        int i28;
        int i29;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2050456444);
        int i34 = (i13 & 6) == 0 ? (c28655q2.m87153g(str) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i34 |= c28655q2.m87157i(aiMessageFeedback) ? 32 : 16;
        }
        int i35 = i14 & 4;
        if (i35 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i34 |= c28655q2.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(onViewEvent)) {
                    i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i34 |= i29;
            }
            i15 = i34;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i35 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z("");
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C39967p();
                    c28655q2.m87172p0(objM87133R3);
                }
                c39967p = (C39967p) objM87133R3;
                i16 = i15 & 14;
                if (i16 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = z17 | c28655q2.m87157i(aiMessageFeedback);
                Object objM87133R10 = c28655q2.m87133R();
                if (!zM87157i || objM87133R10 == c28676v0) {
                    i17 = i16;
                    bVar = new b(str, aiMessageFeedback, c39967p, interfaceC28601c1, interfaceC28601c2, null);
                    c39967p2 = c39967p;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q2.m87172p0(bVar);
                } else {
                    i17 = i16;
                    bVar = objM87133R10;
                    interfaceC28601c3 = interfaceC28601c1;
                    c39967p2 = c39967p;
                }
                AbstractC28683x.m87254h(str, aiMessageFeedback, (InterfaceC4351m) bVar, c28655q2);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C32604f(c39967p2, 2);
                    c28655q2.m87172p0(objM87133R4);
                }
                function1 = (Function1) objM87133R4;
                boolean z19 = !z16;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C32375n(28);
                    c28655q2.m87172p0(objM87133R5);
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC15676d.m44099b(c2314t, z19, (Function1) objM87133R5));
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3406c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                c39967p3 = c39967p2;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f13 = 2 * 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, true), AbstractC30060g.m92099U(0, c28655q2, 1), 14), f13, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C32586b1(5, interfaceC28601c3);
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C32586b1(6, interfaceC28601c3);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c4 = interfaceC28601c3;
                m102482r(interfaceC4339a, (InterfaceC4339a) objM87133R7, m102448A(interfaceC28601c4), c28655q2, 54, 0);
                c28655q = c28655q2;
                String strM102457J = m102457J(interfaceC28601c2);
                if (m102448A(interfaceC28601c4) != null) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C32614h(6, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R8);
                }
                m102487w(strM102457J, z18, (Function1) objM87133R8, c28655q, 384);
                if (m102448A(interfaceC28601c4) == AiFeedbackType.WORSE) {
                    c28655q.m87150e0(-1692997889);
                    for (FeedbackReason feedbackReason : FeedbackReason.values()) {
                        i27 = c.f135683a[feedbackReason.ordinal()];
                        if (i27 != 1) {
                            i28 = AbstractC37336b.f159608A;
                        } else if (i27 != 2) {
                            i28 = AbstractC37336b.f159624I;
                        } else if (i27 != 3) {
                            i28 = AbstractC37336b.f159610B;
                        } else {
                            if (i27 == 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i28 = AbstractC37336b.f159612C;
                        }
                        AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.FALSE), AbstractC37817c.m121344e(589520755, c28655q, new C31095b(i28, c39967p3, feedbackReason, interfaceC28601c4, function1)), c28655q, 56);
                    }
                    i18 = 0;
                    c28655q.m87173q(false);
                } else {
                    i18 = 0;
                    c28655q.m87150e0(-1691964814);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 2);
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159618F, c28655q, i18);
                if (m102448A(r26) != null) {
                    i19 = 1;
                } else {
                    i19 = i18;
                }
                long jM125430y = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
                if (i17 == 4) {
                    i24 = 1;
                } else {
                    i24 = i18;
                }
                if ((i15 & 7168) == 2048) {
                    i18 = 1;
                }
                i25 = i24 | i18;
                objM87133R9 = c28655q.m87133R();
                if (i25 == 0 || objM87133R9 == c28676v0) {
                    C15849d c15849d = new C15849d(str, onViewEvent, c39967p3, interfaceC28601c4, interfaceC28601c2);
                    c28655q.m87172p0(c15849d);
                    objM87133R9 = c15849d;
                }
                AbstractC27282u.m82292h(modifierM3396r2, enumC27284v, strM21273g, i19, jM125430y, null, false, (InterfaceC4339a) objM87133R9, c28655q, 54, 96);
                c28655q.m87173q(true);
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(str, aiMessageFeedback, z15, onViewEvent, i13, i14, 1);
            }
        }
        i34 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87157i(onViewEvent)) {
                i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i29 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i34 |= i29;
        }
        i15 = i34;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i35 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z("");
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C39967p();
                c28655q2.m87172p0(objM87133R3);
            }
            c39967p = (C39967p) objM87133R3;
            i16 = i15 & 14;
            if (i16 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i = z17 | c28655q2.m87157i(aiMessageFeedback);
            Object objM87133R11 = c28655q2.m87133R();
            if (zM87157i) {
                i17 = i16;
                bVar = new b(str, aiMessageFeedback, c39967p, interfaceC28601c1, interfaceC28601c2, null);
                c39967p2 = c39967p;
                interfaceC28601c3 = interfaceC28601c1;
                c28655q2.m87172p0(bVar);
            } else {
                i17 = i16;
                bVar = new b(str, aiMessageFeedback, c39967p, interfaceC28601c1, interfaceC28601c2, null);
                c39967p2 = c39967p;
                interfaceC28601c3 = interfaceC28601c1;
                c28655q2.m87172p0(bVar);
            }
            AbstractC28683x.m87254h(str, aiMessageFeedback, (InterfaceC4351m) bVar, c28655q2);
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C32604f(c39967p2, 2);
                c28655q2.m87172p0(objM87133R4);
            }
            function1 = (Function1) objM87133R4;
            boolean z110 = !z16;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C32375n(28);
                c28655q2.m87172p0(objM87133R5);
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, AbstractC15676d.m44099b(c2314t2, z110, (Function1) objM87133R5));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3406c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            c39967p3 = c39967p2;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f14 = 2 * 8;
            Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f, true), AbstractC30060g.m92099U(0, c28655q2, 1), 14), f14, 0.0f, 2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k2, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C32586b1(5, interfaceC28601c3);
                c28655q2.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C32586b1(6, interfaceC28601c3);
                c28655q2.m87172p0(objM87133R7);
            }
            interfaceC28601c4 = interfaceC28601c3;
            m102482r(interfaceC4339a2, (InterfaceC4339a) objM87133R7, m102448A(interfaceC28601c4), c28655q2, 54, 0);
            c28655q = c28655q2;
            String strM102457J2 = m102457J(interfaceC28601c2);
            if (m102448A(interfaceC28601c4) != null) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C32614h(6, interfaceC28601c2);
                c28655q.m87172p0(objM87133R8);
            }
            m102487w(strM102457J2, z18, (Function1) objM87133R8, c28655q, 384);
            if (m102448A(interfaceC28601c4) == AiFeedbackType.WORSE) {
                c28655q.m87150e0(-1692997889);
                while (i26 < r2) {
                    i27 = c.f135683a[feedbackReason.ordinal()];
                    if (i27 != 1) {
                        i28 = AbstractC37336b.f159608A;
                    } else if (i27 != 2) {
                        i28 = AbstractC37336b.f159624I;
                    } else if (i27 != 3) {
                        i28 = AbstractC37336b.f159610B;
                    } else {
                        if (i27 == 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i28 = AbstractC37336b.f159612C;
                    }
                    AbstractC28683x.m87247a(AbstractC15027h3.f56241a.mo86977a(Boolean.FALSE), AbstractC37817c.m121344e(589520755, c28655q, new C31095b(i28, c39967p3, feedbackReason, interfaceC28601c4, function1)), c28655q, 56);
                }
                i18 = 0;
                c28655q.m87173q(false);
            } else {
                i18 = 0;
                c28655q.m87150e0(-1691964814);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f14, 0.0f, 2);
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC37336b.f159618F, c28655q, i18);
            if (m102448A(r26) != null) {
                i19 = 1;
            } else {
                i19 = i18;
            }
            long jM125430y2 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
            if (i17 == 4) {
                i24 = 1;
            } else {
                i24 = i18;
            }
            if ((i15 & 7168) == 2048) {
                i18 = 1;
            }
            i25 = i24 | i18;
            objM87133R9 = c28655q.m87133R();
            if (i25 == 0) {
                C15849d c15849d2 = new C15849d(str, onViewEvent, c39967p3, interfaceC28601c4, interfaceC28601c2);
                c28655q.m87172p0(c15849d2);
                objM87133R9 = c15849d2;
            } else {
                C15849d c15849d3 = new C15849d(str, onViewEvent, c39967p3, interfaceC28601c4, interfaceC28601c2);
                c28655q.m87172p0(c15849d3);
                objM87133R9 = c15849d3;
            }
            AbstractC27282u.m82292h(modifierM3396r4, enumC27284v2, strM21273g2, i19, jM125430y2, null, false, (InterfaceC4339a) objM87133R9, c28655q, 54, 96);
            c28655q.m87173q(true);
            z15 = z16;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(str, aiMessageFeedback, z15, onViewEvent, i13, i14, 1);
        }
    }
}
