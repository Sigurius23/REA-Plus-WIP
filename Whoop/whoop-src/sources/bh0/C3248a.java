package bh0;

import android.net.Uri;
import b72.C2783a;
import c91.AbstractC4328b;
import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.p057ai.chat.models.AIConversation;
import com.whoop.p057ai.chat.models.AIConversationMetadata;
import com.whoop.p057ai.chat.models.AIMessage;
import com.whoop.p057ai.chat.models.AITurn;
import com.whoop.p057ai.chat.models.AttachmentType;
import com.whoop.p057ai.chat.models.CoachVersionTag;
import com.whoop.p057ai.chat.models.MarkdownTextWidget;
import com.whoop.p057ai.chat.models.TurnFeedbackResponse;
import fl0.EnumC14565j;
import gz0.EnumC16313m0;
import hl0.AbstractC17395d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.C21054m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jb1.C21535a;
import js0.AbstractC21909c;
import kd1.AbstractC22403o;
import l83.C23465k;
import l83.InterfaceC23462h;
import lh0.C24068b;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import nl0.C26805g;
import nl0.C26809k;
import nl0.EnumC26800b;
import nl0.EnumC26811m;
import p003a1.C0103b;
import p003a1.C0111j;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pl0.AbstractC29345c;
import pl0.C29348f;
import q83.AbstractC30060g;
import tg0.AbstractC33780e;
import tg0.C33777b;
import tg0.C33778c;
import tg0.C33783h;
import vg0.C35984e;
import vg0.C35986f;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import wk0.AbstractC37336b;
import x81.C38072d;
import xg0.AbstractC38269a;
import xg0.C38271c;
import zg0.C40618a;
import zg0.C40619b;
import zg0.C40620c;
import zg0.C40621d;
import zg0.C40622e;
import zg0.C40623f;
import zg0.C40626i;
import zg0.C40628k;
import zk0.C40819i0;

/* JADX INFO: renamed from: bh0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 c2\u00020\u0001:\u0001OB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010-J;\u00104\u001a\b\u0012\u0004\u0012\u0002030.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u0002072\u0006\u00106\u001a\u00020/2\u0006\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002070.2\u0006\u00106\u001a\u00020/H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020L2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR'\u0010b\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020^0\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b_\u0010a¨\u0006d"}, m65681d2 = {"Lbh0/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagRepository", "Ljs0/c;", "configurationRepository", "Ljb1/a;", "reducer", "", "hint", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Ljb1/a;Ljava/lang/String;)V", "Ltg0/c;", "domainResult", "Lzg0/f;", "conversationViewState", "", "l", "(Ltg0/c;Lzg0/f;)Z", "Ltg0/e;", "attachmentError", "Lnl0/k;", "i", "(Ltg0/e;)Lnl0/k;", "Lc91/b;", "submitError", "r", "(Lc91/b;)Lnl0/k;", "Lhl0/d;", "toastStyle", "k", "(Lhl0/d;)Lnl0/k;", "Lvg0/e;", "historyState", "Lzg0/c;", "u", "(Lvg0/e;)Lzg0/c;", "result", "Lnl0/m;", "m", "(Ltg0/c;)Lnl0/m;", "Ltg0/b;", "chatResult", "isDay0", "v", "(Ltg0/b;Z)Lzg0/f;", "", "Lcom/whoop/ai/chat/models/AITurn;", "turns", "isMessageLoading", "isAwaitingMoreTokens", "Lzg0/e;", "p", "(Ljava/util/List;ZZZ)Ljava/util/List;", "turn", "Lzg0/d;", "n", "(Lcom/whoop/ai/chat/models/AITurn;Z)Lzg0/d;", "o", "(Lcom/whoop/ai/chat/models/AITurn;)Ljava/util/List;", "Lcom/whoop/ai/chat/models/AIMessage;", "message", "d", "(Lcom/whoop/ai/chat/models/AIMessage;)Ljava/lang/String;", "Lcom/whoop/ai/chat/models/CoachVersionTag;", "betaTag", "Lnl0/g;", "j", "(Lcom/whoop/ai/chat/models/CoachVersionTag;)Lnl0/g;", "shouldShowStopGenerating", "", "t", "(Z)I", "Ly81/e;", "s", "()Ly81/e;", "Lzg0/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ltg0/c;)Lzg0/i;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Ljs0/c;", "c", "Ljb1/a;", "Lcom/whoop/design/util/TextResource$b;", "Lcom/whoop/design/util/TextResource$b;", "defaultHint", "Lcom/whoop/design/util/TextResource;", "e", "Lcom/whoop/design/util/TextResource;", "initialHint", "Ll83/k;", "Liz0/m;", "Lzk0/i0;", "f", "Ll83/h;", "()Ll83/k;", "markdownStyles", "g", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3248a {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    public static final int f12736h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource.C8688b defaultHint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource initialHint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC23462h markdownStyles;

    /* JADX INFO: renamed from: bh0.a$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u0005*\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lbh0/a$a;", "", "<init>", "()V", "Lcom/whoop/ai/chat/models/AIConversation;", "", "b", "(Lcom/whoop/ai/chat/models/AIConversation;)Z", "isStreaming", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final boolean m9410b(AIConversation aIConversation) {
            List<AITurn> turns;
            if (aIConversation != null && (turns = aIConversation.getTurns()) != null) {
                List listM74138n1 = AbstractC25265s.m74138n1(turns);
                if ((listM74138n1 instanceof Collection) && listM74138n1.isEmpty()) {
                    return false;
                }
                Iterator it = listM74138n1.iterator();
                while (it.hasNext()) {
                    if (((AITurn) it.next()).getTurnStatus() == AiMessageStatus.ACTIVE) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: bh0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12743a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f12744b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f12745c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f12746d;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            try {
                iArr[AttachmentType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentType.PDF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachmentType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12743a = iArr;
            int[] iArr2 = new int[EnumC26811m.values().length];
            try {
                iArr2[EnumC26811m.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC26811m.MESSAGE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f12744b = iArr2;
            int[] iArr3 = new int[AiMessageStatus.values().length];
            try {
                iArr3[AiMessageStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AiMessageStatus.FLAGGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f12745c = iArr3;
            int[] iArr4 = new int[EnumC14565j.values().length];
            try {
                iArr4[EnumC14565j.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[EnumC14565j.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[EnumC14565j.FLAGGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f12746d = iArr4;
        }
    }

    /* JADX INFO: renamed from: bh0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f12747w = new c();

        /* JADX INFO: renamed from: a */
        public final long m9411a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m9411a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bh0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f12748w = new d();

        /* JADX INFO: renamed from: a */
        public final long m9412a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m9412a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bh0.a$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f12749w = new e();

        /* JADX INFO: renamed from: a */
        public final long m9413a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m9413a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bh0.a$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f12750w = new f();

        /* JADX INFO: renamed from: a */
        public final long m9414a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m9414a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bh0.a$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f12751w = new g();

        /* JADX INFO: renamed from: a */
        public final long m9415a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m9415a((C39336i) obj));
        }
    }

    public C3248a(FeatureFlagChecker featureFlagRepository, AbstractC21909c configurationRepository, C21535a reducer, String hint) {
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(hint, "hint");
        this.featureFlagRepository = featureFlagRepository;
        this.configurationRepository = configurationRepository;
        this.reducer = reducer;
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159683n);
        this.defaultHint = c8688bM21277k;
        this.initialHint = hint.length() != 0 ? AbstractC8693b.m21278l(hint) : c8688bM21277k;
        this.markdownStyles = AbstractC30060g.m92088H(new C0111j(this, 11));
    }

    /* JADX INFO: renamed from: d */
    private final String m9390d(AIMessage message) {
        List<DesignSystemModel> items = message.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof MarkdownTextWidget) {
                arrayList.add(obj);
            }
        }
        return AbstractC25265s.m74110N0(arrayList, "\n", null, null, new C2783a(16), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final CharSequence m9391e(MarkdownTextWidget it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getText();
    }

    /* JADX INFO: renamed from: f */
    private final C23465k m9392f() {
        return (C23465k) this.markdownStyles.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23465k m9393g(C3248a c3248a) {
        return new C29348f(c3248a.configurationRepository, c3248a.featureFlagRepository).m89450a();
    }

    /* JADX INFO: renamed from: i */
    private final C26809k m9394i(AbstractC33780e attachmentError) {
        TextResource textResourceM21267a;
        boolean z4 = attachmentError != null;
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(c.f12747w);
        int iM53362c = AbstractC18489d0.m53362c(C38072d.f163053a);
        if (attachmentError instanceof AbstractC33780e.a) {
            textResourceM21267a = AbstractC8693b.m21277k(AbstractC37336b.f159661c);
        } else if (attachmentError instanceof AbstractC33780e.b) {
            textResourceM21267a = AbstractC8693b.m21277k(AbstractC37336b.f159659b);
        } else {
            if (attachmentError != null) {
                throw new NoWhenBranchMatchedException();
            }
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        return new C26809k(z4, interfaceC39332eM125323a, iM53362c, textResourceM21267a);
    }

    /* JADX INFO: renamed from: j */
    private final C26805g m9395j(CoachVersionTag betaTag) {
        return new C26805g(AbstractC8693b.m21278l(betaTag.getTitle()), betaTag.getDestination(), betaTag.getNavigation());
    }

    /* JADX INFO: renamed from: k */
    private final C26809k m9396k(AbstractC17395d toastStyle) {
        InterfaceC39332e interfaceC39332eM125323a;
        int iM8290c;
        TextResource.C8688b c8688bM21277k;
        boolean z4 = toastStyle != null;
        AbstractC17395d.a aVar = AbstractC17395d.a.f67356a;
        if (AbstractC22676k.m65745e(toastStyle, aVar)) {
            interfaceC39332eM125323a = p745y81.Function1.m125323a(d.f12748w);
        } else {
            if (!AbstractC22676k.m65745e(toastStyle, AbstractC17395d.b.f67357a) && toastStyle != null) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC39332eM125323a = p745y81.Function1.m125323a(e.f12749w);
        }
        if (AbstractC22676k.m65745e(toastStyle, aVar)) {
            iM8290c = AbstractC18489d0.m53362c(C38072d.f163053a);
        } else {
            if (!AbstractC22676k.m65745e(toastStyle, AbstractC17395d.b.f67357a) && toastStyle != null) {
                throw new NoWhenBranchMatchedException();
            }
            iM8290c = AbstractC2875y.m8290c(C38072d.f163053a);
        }
        if (AbstractC22676k.m65745e(toastStyle, aVar)) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159703x);
        } else {
            if (!AbstractC22676k.m65745e(toastStyle, AbstractC17395d.b.f67357a) && toastStyle != null) {
                throw new NoWhenBranchMatchedException();
            }
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159620G);
        }
        return new C26809k(z4, interfaceC39332eM125323a, iM8290c, c8688bM21277k);
    }

    /* JADX INFO: renamed from: l */
    private final boolean m9397l(C33778c domainResult, C40623f conversationViewState) {
        int i13 = b.f12744b[m9398m(domainResult).ordinal()];
        if (i13 != 1 && i13 != 2) {
            return false;
        }
        List<C40621d> listM131760d = conversationViewState.m131760d();
        if ((listM131760d instanceof Collection) && listM131760d.isEmpty()) {
            return false;
        }
        for (C40621d c40621d : listM131760d) {
            if (c40621d.getRole() == EnumC26800b.ASSISTANT && c40621d.getRawTextContent().length() >= 25) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    private final EnumC26811m m9398m(C33778c result) {
        List<AITurn> turns;
        AITurn aITurn;
        EnumC26811m enumC26811mM106830g = result.getAiChatDomainResult().getLoadingState();
        EnumC26811m enumC26811m = EnumC26811m.FEATURE_UNAVAILABLE;
        if (enumC26811mM106830g == enumC26811m) {
            return enumC26811m;
        }
        int i13 = b.f12746d[result.getAiChatDomainResult().getMessagingState().ordinal()];
        if (i13 == 1) {
            return EnumC26811m.MESSAGE_LOADING;
        }
        if (i13 == 2) {
            return EnumC26811m.MESSAGE_ERROR;
        }
        if (i13 == 3) {
            return EnumC26811m.MESSAGE_FLAGGED;
        }
        AIConversation aIConversationM106828e = result.getAiChatDomainResult().getConversation();
        AiMessageStatus turnStatus = (aIConversationM106828e == null || (turns = aIConversationM106828e.getTurns()) == null || (aITurn = (AITurn) AbstractC25265s.m74114R0(turns)) == null) ? null : aITurn.getTurnStatus();
        int i14 = turnStatus == null ? -1 : b.f12745c[turnStatus.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? result.getAiChatDomainResult().getLoadingState() : EnumC26811m.MESSAGE_FLAGGED;
        }
        return EnumC26811m.MESSAGE_ERROR;
    }

    /* JADX INFO: renamed from: n */
    private final C40621d m9399n(AITurn turn, boolean isDay0) {
        return new C40621d(AbstractC2875y.m8299l(turn.getId(), "_loading"), turn.getId(), AiMessageStatus.ACTIVE, EnumC26800b.ASSISTANT, AbstractC37056f.m118958J(new C24068b(!isDay0 && this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_LONG_LOADING))), false, null, 96, null);
    }

    /* JADX INFO: renamed from: o */
    private final List<C40621d> m9400o(AITurn turn) {
        List<AIMessage> messages = turn.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        int i13 = 0;
        for (Object obj : messages) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            AIMessage aIMessage = (AIMessage) obj;
            boolean z4 = i13 == turn.getMessages().size() - 1;
            arrayList.add(new C40621d(aIMessage.getId(), turn.getId(), turn.getTurnStatus(), AbstractC38269a.m122608a(aIMessage), this.reducer.m60540g(aIMessage.getItems()), (turn.getTurnStatus() == AiMessageStatus.COMPLETE || turn.getTurnStatus() == AiMessageStatus.STOPPED) && z4 && AbstractC22676k.m65745e(aIMessage.getRole(), EnumC26800b.ASSISTANT.getValue()), m9390d(aIMessage)));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    private final List<C40622e> m9401p(List<AITurn> turns, boolean isMessageLoading, boolean isAwaitingMoreTokens, boolean isDay0) {
        boolean z4;
        List<AITurn> list = turns;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            AITurn aITurn = (AITurn) obj;
            List<C40621d> listM9400o = m9400o(aITurn);
            boolean z13 = i13 == AbstractC37056f.m118951C(turns);
            List<AIMessage> messages = aITurn.getMessages();
            if (!(messages instanceof Collection) || !messages.isEmpty()) {
                Iterator<T> it = messages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    }
                    AIMessage aIMessage = (AIMessage) it.next();
                    if (!AbstractC38269a.m122610c(aIMessage) && !aIMessage.getItems().isEmpty()) {
                        z4 = true;
                        break;
                    }
                }
            } else {
                z4 = false;
                break;
            }
            boolean z14 = aITurn.getTurnStatus() == AiMessageStatus.COMPLETE || aITurn.getTurnStatus() == AiMessageStatus.STOPPED;
            AIMessage aIMessage2 = (AIMessage) AbstractC25265s.m74114R0(aITurn.getMessages());
            boolean zM65745e = AbstractC22676k.m65745e(aIMessage2 != null ? aIMessage2.getRole() : null, EnumC26800b.USER.getValue());
            boolean z15 = z13 && !z4 && (isMessageLoading || aITurn.getTurnStatus() == AiMessageStatus.ACTIVE);
            boolean z16 = z13 && z4 && isAwaitingMoreTokens && aITurn.getTurnStatus() == AiMessageStatus.ACTIVE && this.featureFlagRepository.isFeatureEnabled("ai-show-preamble-loading-indicator");
            if (z15 || z16) {
                listM9400o = AbstractC25265s.m74128f1(m9399n(aITurn, isDay0), listM9400o);
            }
            List<C40621d> list2 = listM9400o;
            String id4 = aITurn.getId();
            boolean z17 = z14 && !zM65745e;
            TurnFeedbackResponse feedback = aITurn.getFeedback();
            AiFeedbackType feedbackType = feedback != null ? feedback.getFeedbackType() : null;
            List<AIMessage> messages2 = aITurn.getMessages();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : messages2) {
                if (AbstractC38269a.m122609b((AIMessage) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList.add(new C40622e(id4, list2, z17, feedbackType, AbstractC25265s.m74110N0(arrayList2, "\n", null, null, new C0103b(this, 21), 30), aITurn.getTurnStatus()));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final CharSequence m9402q(C3248a c3248a, AIMessage it) {
        AbstractC22676k.m65750j(it, "it");
        return c3248a.m9390d(it);
    }

    /* JADX INFO: renamed from: r */
    private final C26809k m9403r(AbstractC4328b submitError) {
        return new C26809k(submitError != null, p745y81.Function1.m125323a(f.f12750w), AbstractC18489d0.m53362c(C38072d.f163053a), submitError != null ? AbstractC8693b.m21277k(AbstractC37336b.f159635N0) : AbstractC8693b.m21267a());
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC39332e m9404s() {
        return p745y81.Function1.m125323a(g.f12751w);
    }

    /* JADX INFO: renamed from: t */
    private final int m9405t(boolean shouldShowStopGenerating) {
        return shouldShowStopGenerating ? AbstractC37335a.f159607i : C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp();
    }

    /* JADX INFO: renamed from: u */
    private final C40620c m9406u(C35984e historyState) {
        EnumC16313m0 enumC16313m0;
        List<C35986f> listM114273c = historyState.m114273c();
        ArrayList<C35986f> arrayList = new ArrayList();
        for (Object obj : listM114273c) {
            if (!((C35986f) obj).m114280c().isEmpty()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (C35986f c35986f : arrayList) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c35986f.getTitle());
            List<AIConversationMetadata> listM114280c = c35986f.m114280c();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM114280c, 10));
            for (AIConversationMetadata aIConversationMetadata : listM114280c) {
                String icon = aIConversationMetadata.getIcon();
                if (icon == null) {
                    icon = "";
                }
                EnumC16313m0 enumC16313m1 = EnumC16313m0.COACH;
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC16313m0 = null;
                        break;
                    }
                    enumC16313m0 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                        break;
                    }
                    i13++;
                }
                if (enumC16313m0 != null) {
                    enumC16313m1 = enumC16313m0;
                }
                arrayList3.add(new C40618a(aIConversationMetadata.getFingerprint(), AbstractC8693b.m21278l(aIConversationMetadata.getTitle()), new AbstractC22403o.a(enumC16313m1.toWhoopIcon()), aIConversationMetadata.getSourceType(), aIConversationMetadata.getSourceId()));
            }
            arrayList2.add(new C40619b(textResourceM21278l, arrayList3));
        }
        return new C40620c(historyState.getIsLoading(), historyState.getIsError(), arrayList2);
    }

    /* JADX INFO: renamed from: v */
    private final C40623f m9407v(C33777b chatResult, boolean isDay0) {
        Object objPrevious;
        boolean z4;
        AIConversation aIConversationM106828e = chatResult.getConversation();
        if (aIConversationM106828e == null) {
            return new C40623f(null, null, null, chatResult.getLoadingState() == EnumC26811m.SCREEN_ERROR, null, null, 55, null);
        }
        boolean z13 = chatResult.getMessagingState() == EnumC14565j.LOADING;
        List<C40622e> listM9401p = m9401p(aIConversationM106828e.getTurns(), z13, chatResult.getIsAwaitingMoreTokens(), isDay0);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM9401p.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C40622e) it.next()).m131752c());
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((C40621d) objPrevious).getRole() != EnumC26800b.ASSISTANT);
        C40621d c40621d = (C40621d) objPrevious;
        List listM74156w1 = (z13 || !(arrayList.isEmpty() || ((c40621d != null ? c40621d.getMessageStatus() : null) == AiMessageStatus.COMPLETE))) ? C25271y.f99162w : AbstractC25265s.m74156w1(aIConversationM106828e.getSuggestions(), 3);
        if (arrayList.isEmpty()) {
            z4 = false;
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((C40621d) it3.next()).getRole() == EnumC26800b.USER) {
                    z4 = true;
                }
            }
            z4 = false;
        }
        return new C40623f(aIConversationM106828e.getMetadata().getFingerprint(), listM9401p, listM74156w1, z4, aIConversationM106828e.getHeader(), m9395j(aIConversationM106828e.getTag()));
    }

    /* JADX INFO: renamed from: h */
    public final C40626i m9408h(C33778c domainResult) {
        AIConversationMetadata metadata;
        AbstractC22403o.c cVar;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        boolean zM9410b = INSTANCE.m9410b(domainResult.getAiChatDomainResult().getConversation());
        C40623f c40623fM9407v = m9407v(domainResult.getAiChatDomainResult(), domainResult.getAiChatDomainResult().getIsDay0());
        EnumC14565j enumC14565jM106831h = domainResult.getAiChatDomainResult().getMessagingState();
        C26809k c26809kM9396k = m9396k(domainResult.getAiChatDomainResult().getToastStyle());
        C23465k c23465kM9392f = m9392f();
        C21054m c21054m = (C21054m) c23465kM9392f.f92937w;
        C40819i0 c40819i0 = (C40819i0) c23465kM9392f.f92938x;
        int iM9405t = m9405t(zM9410b);
        InterfaceC39332e interfaceC39332eM9404s = m9404s();
        boolean z4 = enumC14565jM106831h == EnumC14565j.LOADING;
        EnumC26811m enumC26811mM9398m = m9398m(domainResult);
        TextResource textResource = c40623fM9407v.getCanStartNewConversation() ? this.defaultHint : this.initialHint;
        C40620c c40620cM9406u = m9406u(domainResult.getChatHistoryResult());
        C33783h c33783hM106835l = domainResult.getAiChatDomainResult().getRetryState();
        boolean zIsFeatureEnabled = this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_TYPEWRITER_EFFECT_FIX);
        List<C38271c> listM106827d = domainResult.getAiChatDomainResult().m106827d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM106827d, 10));
        Iterator it = listM106827d.iterator();
        while (true) {
            String scrollToTurnId = null;
            if (!it.hasNext()) {
                C26809k c26809kM9394i = m9394i(domainResult.getAiChatDomainResult().getAttachmentError());
                C26809k c26809kM9403r = m9403r(domainResult.getAiChatDomainResult().getSubmitError());
                boolean zM9397l = m9397l(domainResult, c40623fM9407v);
                boolean zM106832i = domainResult.getAiChatDomainResult().getOpenedFromHistory();
                AIConversation aIConversationM106828e = domainResult.getAiChatDomainResult().getConversation();
                if (aIConversationM106828e != null && (metadata = aIConversationM106828e.getMetadata()) != null) {
                    scrollToTurnId = metadata.getScrollToTurnId();
                }
                return new C40626i(iM9405t, interfaceC39332eM9404s, z4, zM9410b, c40623fM9407v, enumC26811mM9398m, textResource, c40620cM9406u, c33783hM106835l, false, c26809kM9396k, false, zIsFeatureEnabled, arrayList, c26809kM9394i, c26809kM9403r, c21054m, c40819i0, zM9397l, false, zM106832i, scrollToTurnId, domainResult.getAiChatDomainResult().getIsInterpolationComplete(), domainResult.getAiChatDomainResult().getIsRefreshingMetadata(), 524288, null);
            }
            C38271c c38271c = (C38271c) it.next();
            AttachmentType attachmentTypeM122617e = c38271c.getType();
            boolean zM122620h = c38271c.getIsUploading();
            boolean zM122619g = c38271c.getIsError();
            Uri uriM122618f = c38271c.getUri();
            String strM122614b = c38271c.getDisplayName();
            String strM122615c = c38271c.getFileId();
            Iterator it3 = it;
            int i13 = b.f12743a[c38271c.getType().ordinal()];
            if (i13 == 1) {
                Uri uriM122618f2 = c38271c.getUri();
                if (uriM122618f2 != null) {
                    cVar = new AbstractC22403o.c(uriM122618f2.toString(), 0, 0, 0, 14, null);
                }
                arrayList.add(new C40628k(attachmentTypeM122617e, zM122620h, zM122619g, uriM122618f, strM122614b, strM122615c, cVar));
                it = it3;
            } else if (i13 != 2 && i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = null;
            arrayList.add(new C40628k(attachmentTypeM122617e, zM122620h, zM122619g, uriM122618f, strM122614b, strM122615c, cVar));
            it = it3;
        }
    }

    public /* synthetic */ C3248a(FeatureFlagChecker featureFlagChecker, AbstractC21909c abstractC21909c, C21535a c21535a, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, abstractC21909c, (i13 & 4) != 0 ? AbstractC29345c.m89363U() : c21535a, (i13 & 8) != 0 ? "" : str);
    }
}
