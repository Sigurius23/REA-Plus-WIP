package p702ch0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p026b2.C2314t;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p132f0.C13821r1;
import p445r0.InterfaceC30833a;
import p635y2.InterfaceC39147y;
import p668z1.C39964m;
import p668z1.C39976y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import zg0.AbstractC40629l;
import zg0.C40622e;
import zg0.C40626i;

/* JADX INFO: renamed from: ch0.o0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b5\b\u0007\u0018\u00002\u00020\u0001:\u0001?BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b&\u0010$J&\u0010*\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0080@¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0'2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0000¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0004\u0018\u00010\u001f2\u0006\u00103\u001a\u00020.H\u0000¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u0004\u0018\u00010\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0000¢\u0006\u0004\b6\u00107J0\u0010;\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u00042\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b09H\u0082@¢\u0006\u0004\b;\u0010<J.\u0010=\u001a\u00020\u00182\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b092\u0006\u00108\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010DR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010LR\u0011\u0010S\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0014\u0010W\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010RR$\u0010\\\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u00048@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bY\u0010F\"\u0004\bZ\u0010[R(\u0010a\u001a\u0004\u0018\u00010\u001f2\b\u0010X\u001a\u0004\u0018\u00010\u001f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010e\u001a\u00020\b2\u0006\u0010X\u001a\u00020\b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bb\u0010R\"\u0004\bc\u0010dR(\u0010h\u001a\u0004\u0018\u00010\u001f2\b\u0010X\u001a\u0004\u0018\u00010\u001f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bf\u0010^\"\u0004\bg\u0010`R\u0014\u0010k\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010R¨\u0006n"}, m65681d2 = {"Lch0/o0;", "", "Lf0/r1;", "scrollState", "", "enabled", "Lr0/a;", "firstResponseRequester", "", "scrollToBottomThreshold", "Lch0/s0;", "geometry", "Lch0/a;", "conversation", "pinsLatestResponse", "responsePeekPx", "<init>", "(Lf0/r1;ZLr0/a;ILch0/s0;Lch0/a;ZI)V", "Landroidx/compose/ui/Modifier;", "u", "()Landroidx/compose/ui/Modifier;", "heightPx", "", "topY", "Ll83/a0;", "B", "(IF)V", "y", "x", "(F)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "", "turnId", "z", "(Ljava/lang/String;F)V", "g", "(Lq83/d;)Ljava/lang/Object;", "H", "F", "", "Lzg0/e;", "sections", "J", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lzg0/i;", "viewState", "Lch0/o0$a;", "L", "(Lzg0/i;)Ljava/util/List;", "A", "()V", "sample", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lch0/o0$a;)Ljava/lang/String;", "R", "(Ljava/util/List;)Ljava/lang/String;", "animate", "Lkotlin/Function1;", "target", "C", "(ZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "M", "(Lkotlin/jvm/functions/Function1;ZLq83/d;)Ljava/lang/Object;", "a", "Lf0/r1;", "t", "()Lf0/r1;", "b", "Z", "l", "()Z", "c", "Lr0/a;", "m", "()Lr0/a;", "d", "I", "e", "Lch0/s0;", "f", "Lch0/a;", "r", "()I", "pinSpacerHeightPx", "k", "contentBottom", "j", "arrowThreshold", "value", "n", "O", "(Z)V", "initialScrollHandled", "i", "()Ljava/lang/String;", "N", "(Ljava/lang/String;)V", "appliedScrollToTurnId", "p", "Q", "(I)V", "lastPinnedUserMessageCount", "o", "P", "lastInViewTurnId", "s", "()F", "pinnedMessageTopY", "q", "peekPx", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4642o0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13821r1 scrollState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30833a firstResponseRequester;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int scrollToBottomThreshold;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C4650s0 geometry;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C4602a conversation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean pinsLatestResponse;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int responsePeekPx;

    /* JADX INFO: renamed from: ch0.o0$a */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lch0/o0$a;", "", "", "turnId", "Lch0/k1;", "position", "", "isComplete", "<init>", "(Ljava/lang/String;Lch0/k1;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lch0/k1;", "()Lch0/k1;", "c", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String turnId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC4634k1 position;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isComplete;

        public a(String turnId, EnumC4634k1 position, boolean z4) {
            AbstractC22676k.m65750j(turnId, "turnId");
            AbstractC22676k.m65750j(position, "position");
            this.turnId = turnId;
            this.position = position;
            this.isComplete = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC4634k1 getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.turnId, aVar.turnId) && this.position == aVar.position && this.isComplete == aVar.isComplete;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isComplete) + ((this.position.hashCode() + (this.turnId.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.turnId;
            EnumC4634k1 enumC4634k1 = this.position;
            boolean z4 = this.isComplete;
            StringBuilder sb4 = new StringBuilder("TurnEndSample(turnId=");
            sb4.append(str);
            sb4.append(", position=");
            sb4.append(enumC4634k1);
            sb4.append(", isComplete=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: ch0.o0$b */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehavior", m100430f = "AiChatScrollBehavior.kt", m100431l = {253, 260, 270}, m100432m = "pinAfterSettle", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f18865E;

        /* JADX INFO: renamed from: F */
        int f18866F;

        /* JADX INFO: renamed from: G */
        int f18867G;

        /* JADX INFO: renamed from: H */
        int f18868H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f18869I;

        /* JADX INFO: renamed from: K */
        int f18871K;

        /* JADX INFO: renamed from: w */
        boolean f18872w;

        /* JADX INFO: renamed from: x */
        Object f18873x;

        /* JADX INFO: renamed from: y */
        Object f18874y;

        /* JADX INFO: renamed from: z */
        Object f18875z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f18869I = obj;
            this.f18871K |= Integer.MIN_VALUE;
            return C4642o0.this.m14537C(false, null, this);
        }
    }

    public C4642o0(C13821r1 scrollState, boolean z4, InterfaceC30833a firstResponseRequester, int i13, C4650s0 geometry, C4602a conversation, boolean z13, int i14) {
        AbstractC22676k.m65750j(scrollState, "scrollState");
        AbstractC22676k.m65750j(firstResponseRequester, "firstResponseRequester");
        AbstractC22676k.m65750j(geometry, "geometry");
        AbstractC22676k.m65750j(conversation, "conversation");
        this.scrollState = scrollState;
        this.enabled = z4;
        this.firstResponseRequester = firstResponseRequester;
        this.scrollToBottomThreshold = i13;
        this.geometry = geometry;
        this.conversation = conversation;
        this.pinsLatestResponse = z13;
        this.responsePeekPx = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b3 -> B:24:0x00b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: C */
    public final java.lang.Object m14537C(boolean r18, p715kotlin.jvm.functions.Function1 r19, q83.InterfaceC30057d<? super l83.C23454a0> r20) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p702ch0.C4642o0.m14537C(boolean, kotlin.jvm.functions.Function1, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Object m14538D(C4642o0 c4642o0, boolean z4, Function1 function1, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return c4642o0.m14537C(z4, function1, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m14539E(long j7) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Integer m14540G(C4642o0 c4642o0, int i13) {
        return AbstractC4646q0.m14607v(i13, c4642o0.scrollState.f49321d.m87024x(), c4642o0.geometry.m14619b(), c4642o0.geometry.m14623f(), c4642o0.m14550q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final Integer m14541I(C4642o0 c4642o0, int i13) {
        return Integer.valueOf(c4642o0.scrollState.f49321d.m87024x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final float m14542K(C4642o0 c4642o0) {
        return c4642o0.geometry.m14623f();
    }

    /* JADX INFO: renamed from: M */
    private final Object m14543M(Function1 function1, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Integer num = (Integer) function1.invoke(new Integer(this.scrollState.f49318a.m87024x()));
        if (num != null) {
            int iIntValue = num.intValue();
            if (z4) {
                Object objM39184f = this.scrollState.m39184f(iIntValue, AbstractC11348f.m30574v(200, 0, AbstractC11333b0.f36310a, 2), interfaceC30057d);
                if (objM39184f == EnumC31071a.f128113w) {
                    return objM39184f;
                }
            } else {
                Object objM39185g = this.scrollState.m39185g(iIntValue, interfaceC30057d);
                if (objM39185g == EnumC31071a.f128113w) {
                    return objM39185g;
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private final int m14550q() {
        if (this.pinsLatestResponse) {
            return this.responsePeekPx;
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    private final float m14551s() {
        return this.pinsLatestResponse ? this.geometry.m14619b() : this.geometry.m14620c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m14552v(C4642o0 c4642o0, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        c4642o0.m14554B((int) (it.mo3541n() & 4294967295L), Float.intBitsToFloat((int) (it.mo3510E(0L) & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: A */
    public final void m14553A() {
        this.conversation.m14276k(true);
    }

    /* JADX INFO: renamed from: B */
    public final void m14554B(int heightPx, float topY) {
        this.geometry.m14628k(heightPx);
        this.geometry.m14629l(topY);
        if (heightPx > 0) {
            this.geometry.m14624g(true);
        }
    }

    /* JADX INFO: renamed from: F */
    public final Object m14555F(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM14537C = m14537C(true, new C4640n0(this, 1), interfaceC30057d);
        return objM14537C == EnumC31071a.f128113w ? objM14537C : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    public final Object m14556H(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM14538D = m14538D(this, false, new C4640n0(this, 0), interfaceC30057d, 1, null);
        return objM14538D == EnumC31071a.f128113w ? objM14538D : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    public final Object m14557J(String str, List<C40622e> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM14632c = AbstractC4652t0.m14632c(this.scrollState, list, this.conversation.getTurnEndYs(), new C4648r0(this, 1), str, interfaceC30057d);
        return objM14632c == EnumC31071a.f128113w ? objM14632c : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    public final List<a> m14558L(C40626i viewState) {
        EnumC4634k1 enumC4634k1;
        AbstractC22676k.m65750j(viewState, "viewState");
        if (this.geometry.m14622e() == 0) {
            return C25271y.f99162w;
        }
        float fM14623f = this.geometry.m14623f() + this.geometry.m14622e();
        Set<String> setM131858c = AbstractC40629l.m131858c(viewState.getConversation().m131761e(), viewState.getIsLatestTurnComplete());
        C39964m c39964m = this.conversation.getTurnEndYs().f172478x;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c39964m, 10));
        Iterator it = c39964m.iterator();
        while (((C39976y) it).hasNext()) {
            Map.Entry entry = (Map.Entry) ((C39976y) it).next();
            String str = (String) entry.getKey();
            float fFloatValue = ((Number) entry.getValue()).floatValue();
            if (fFloatValue > fM14623f) {
                enumC4634k1 = EnumC4634k1.BELOW;
            } else {
                enumC4634k1 = fFloatValue <= this.geometry.m14623f() ? EnumC4634k1.ABOVE : EnumC4634k1.IN_VIEW;
            }
            arrayList.add(new a(str, enumC4634k1, setM131858c.contains(str)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public final void m14559N(String str) {
        this.conversation.m14275j(str);
    }

    /* JADX INFO: renamed from: O */
    public final void m14560O(boolean z4) {
        this.conversation.m14277l(z4);
    }

    /* JADX INFO: renamed from: P */
    public final void m14561P(String str) {
        this.conversation.m14278m(str);
    }

    /* JADX INFO: renamed from: Q */
    public final void m14562Q(int i13) {
        this.conversation.m14279n(i13);
    }

    /* JADX INFO: renamed from: R */
    public final String m14563R(List<C40622e> sections) {
        AbstractC22676k.m65750j(sections, "sections");
        return AbstractC4652t0.m14631b(sections, this.conversation.getTurnEndYs(), this.geometry.m14623f());
    }

    /* JADX INFO: renamed from: g */
    public final Object m14564g(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C13821r1 c13821r1 = this.scrollState;
        Object objM39184f = c13821r1.m39184f(c13821r1.f49321d.m87024x(), AbstractC11348f.m30574v(500, 0, AbstractC11333b0.f36312c, 2), interfaceC30057d);
        return objM39184f == EnumC31071a.f128113w ? objM39184f : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public final String m14565h(a sample) {
        AbstractC22676k.m65750j(sample, "sample");
        if (!sample.getIsComplete()) {
            this.conversation.m14273h().remove(sample.getTurnId());
            return null;
        }
        EnumC4634k1 enumC4634k1Put = this.conversation.m14273h().put(sample.getTurnId(), sample.getPosition());
        EnumC4634k1 position = sample.getPosition();
        EnumC4634k1 enumC4634k1 = EnumC4634k1.IN_VIEW;
        if (position == enumC4634k1 && enumC4634k1Put != enumC4634k1 && this.conversation.getHasUserScrolled()) {
            String turnId = sample.getTurnId();
            if (this.conversation.m14267b().add(turnId)) {
                return turnId;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m14566i() {
        return this.conversation.m14266a();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getScrollToBottomThreshold() {
        return this.scrollToBottomThreshold;
    }

    /* JADX INFO: renamed from: k */
    public final int m14568k() {
        int iM87024x = this.scrollState.f49321d.m87024x() - m14574r();
        if (iM87024x < 0) {
            return 0;
        }
        return iM87024x;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC30833a getFirstResponseRequester() {
        return this.firstResponseRequester;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m14571n() {
        return this.conversation.m14269d();
    }

    /* JADX INFO: renamed from: o */
    public final String m14572o() {
        return this.conversation.m14270e();
    }

    /* JADX INFO: renamed from: p */
    public final int m14573p() {
        return this.conversation.m14271f();
    }

    /* JADX INFO: renamed from: r */
    public final int m14574r() {
        if (this.enabled && this.conversation.m14272g()) {
            return AbstractC4646q0.m14603r(this.geometry.m14622e(), m14551s(), this.geometry.m14621d(), m14550q());
        }
        return 0;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final C13821r1 getScrollState() {
        return this.scrollState;
    }

    /* JADX INFO: renamed from: u */
    public final Modifier m14576u() {
        return AbstractC1131a.m3500d(C2314t.f9131w, new C4640n0(this, 2));
    }

    /* JADX INFO: renamed from: w */
    public final void m14577w(float y13) {
        if (this.enabled) {
            this.geometry.m14625h(y13);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m14578x(float y13) {
        if (this.enabled) {
            this.geometry.m14626i(y13);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m14579y(float y13) {
        if (this.enabled) {
            this.geometry.m14627j(y13);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m14580z(String turnId, float y13) {
        AbstractC22676k.m65750j(turnId, "turnId");
        if (this.enabled) {
            this.conversation.getTurnEndYs().put(turnId, Float.valueOf(y13));
        }
    }
}
