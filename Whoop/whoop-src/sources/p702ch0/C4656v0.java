package p702ch0;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.ChatEntrypointExperience;
import com.whoop.p057ai.chat.models.AttachmentType;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import ih0.InterfaceC18484b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import nl0.EnumC26800b;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.AbstractC32662q2;
import p734sl0.C32645n0;
import p734sl0.InterfaceC32647n2;
import p734sl0.InterfaceC32666r1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg0.AbstractC31380a;
import rg0.C31381b;
import rg0.C31382c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vg0.C35993i0;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yg0.AbstractC39523b;
import yg0.C39522a;
import zg0.AbstractC40624g;
import zg0.C40625h;
import zg0.C40626i;
import zg0.C40628k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ch0.v0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bu\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020 ¢\u0006\u0004\b&\u0010$J\u0015\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020 2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J%\u00104\u001a\u00020 2\u0006\u0010/\u001a\u00020\u00142\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020 ¢\u0006\u0004\b6\u0010$J\u0015\u00108\u001a\u00020 2\u0006\u0010(\u001a\u000207¢\u0006\u0004\b8\u00109J'\u0010=\u001a\u00020 2\u0006\u0010:\u001a\u0002002\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010;¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020 2\u0006\u0010:\u001a\u000200¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020 ¢\u0006\u0004\bA\u0010$J\r\u0010B\u001a\u00020 ¢\u0006\u0004\bB\u0010$J'\u0010D\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u0001002\u0006\u0010/\u001a\u00020\u00142\u0006\u00103\u001a\u000202¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020 2\u0006\u0010G\u001a\u00020FH\u0000¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020 ¢\u0006\u0004\bJ\u0010$J\r\u0010K\u001a\u00020 ¢\u0006\u0004\bK\u0010$J\r\u0010L\u001a\u00020 ¢\u0006\u0004\bL\u0010$J\u001f\u0010O\u001a\u00020 2\u0010\b\u0002\u0010N\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010M¢\u0006\u0004\bO\u0010PJ\u0018\u0010R\u001a\u00020 2\u0006\u0010Q\u001a\u00020\u0015H\u0086@¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020 H\u0086@¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u00020 2\u0006\u0010V\u001a\u00020\u000e¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020 ¢\u0006\u0004\bY\u0010$J\r\u0010Z\u001a\u00020 ¢\u0006\u0004\bZ\u0010$J%\u0010\\\u001a\u00020 2\u0006\u0010(\u001a\u00020[2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010M¢\u0006\u0004\b\\\u0010]J1\u0010_\u001a\u00020 2\u0006\u0010:\u001a\u0002002\u0006\u0010^\u001a\u00020\u000e2\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010;H\u0002¢\u0006\u0004\b_\u0010`R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bp\u0010rR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010s\u001a\u0004\bl\u0010tR\u001a\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010u\u001a\u0004\bv\u0010wR\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\bv\u0010x\u001a\u0004\by\u0010zR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010{R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010|R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\u007fR\u0017\u0010\u0081\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010uR\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010\u0082\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010uR(\u0010\u0089\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0086\u00010;0\u0085\u00018\u0006¢\u0006\u000e\n\u0005\bO\u0010\u0087\u0001\u001a\u0005\bd\u0010\u0088\u0001R\u0012\u0010\u008a\u0001\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bh\u0010w¨\u0006\u008b\u0001"}, m65681d2 = {"Lch0/v0;", "", "Lzg0/h;", "viewModel", "Lyg0/a;", "navigationRouter", "Lrg0/b;", "analyticsHelper", "Lfi0/a;", "analytics", "Lsl0/n2;", "mediaPickerLauncher", "Lsl0/r1;", "filePickerLauncher", "", "isFileUploadEnabled", "Lp1/c1;", "Lg2/v;", "focusState", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "fileSizeResolver", "Lvg0/i0;", "markTurnAsSeenOrchestrator", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzg0/h;Lyg0/a;Lrg0/b;Lfi0/a;Lsl0/n2;Lsl0/r1;ZLp1/c1;Lkotlin/jvm/functions/Function1;Lvg0/i0;Lzr2/a;)V", "Lbc3/c0;", "scope", "fireEntryEvent", "Ll83/a0;", "A", "(Lbc3/c0;Z)V", "E", "()V", "s", "G", "Lcom/whoop/analytics/AnalyticEventModel;", NotificationCompat.CATEGORY_EVENT, "C", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "", "suggestionCount", "H", "(I)V", "uri", "", "displayName", "Lcom/whoop/ai/chat/models/AttachmentType;", "type", "t", "(Landroid/net/Uri;Ljava/lang/String;Lcom/whoop/ai/chat/models/AttachmentType;)V", "D", "Lih0/b;", "F", "(Lih0/b;)V", "text", "", "fileIds", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/util/List;)V", "x", "(Ljava/lang/String;)V", "B", "u", "fileId", "r", "(Ljava/lang/String;Landroid/net/Uri;Lcom/whoop/ai/chat/models/AttachmentType;)V", "Lsl0/n0;", "screenArgs", "a", "(Lsl0/n0;)V", "k", "i", "j", "Lkotlin/Function0;", "onNavigationEvent", "p", "(Lc93/a;)V", "ttfmtStartTimeMs", "m", "(JLq83/d;)Ljava/lang/Object;", "n", "(Lq83/d;)Ljava/lang/Object;", "isVisible", "o", "(Z)V", "l", "g", "Lyg0/b;", "v", "(Lyg0/b;Lc93/a;)V", "isSuggestion", "y", "(Ljava/lang/String;ZLjava/util/List;)V", "Lzg0/h;", "f", "()Lzg0/h;", "b", "Lyg0/a;", "getNavigationRouter$bot_release", "()Lyg0/a;", "c", "Lrg0/b;", "getAnalyticsHelper$bot_release", "()Lrg0/b;", "d", "Lfi0/a;", "getAnalytics$bot_release", "()Lfi0/a;", "e", "Lsl0/n2;", "()Lsl0/n2;", "Lsl0/r1;", "()Lsl0/r1;", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "Lp1/c1;", "getFocusState$bot_release", "()Lp1/c1;", "Lkotlin/jvm/functions/Function1;", "Lvg0/i0;", "Lzr2/a;", "Lrg0/c;", "Lrg0/c;", "analyticsTracker", "hasInitializedConversation", "Ljava/lang/String;", "initializedFingerprint", "pendingMetadataRefresh", "Lec3/l;", "Lzg0/k;", "Lec3/l;", "()Lec3/l;", "attachmentUploadStates", "canUploadFiles", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4656v0 {

    /* JADX INFO: renamed from: q */
    public static final int f18980q = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C40625h viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39522a navigationRouter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31381b analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC32647n2 mediaPickerLauncher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC32666r1 filePickerLauncher;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isFileUploadEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC28601c1 focusState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Function1 fileSizeResolver;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C35993i0 markTurnAsSeenOrchestrator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C31382c analyticsTracker;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean hasInitializedConversation;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String initializedFingerprint;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean pendingMetadataRefresh;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC13058l attachmentUploadStates;

    /* JADX INFO: renamed from: ch0.v0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18997a;

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
            f18997a = iArr;
        }
    }

    /* JADX INFO: renamed from: ch0.v0$b */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenCoordinator", m100430f = "AiChatWrapperScreenCoordinator.kt", m100431l = {286}, m100432m = "onDrawerOpened", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f18998w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f18999x;

        /* JADX INFO: renamed from: z */
        int f19001z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f18999x = obj;
            this.f19001z |= Integer.MIN_VALUE;
            return C4656v0.this.m14693m(0L, this);
        }
    }

    /* JADX INFO: renamed from: ch0.v0$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f19002w;

        /* JADX INFO: renamed from: ch0.v0$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f19003w;

            /* JADX INFO: renamed from: ch0.v0$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenCoordinator$special$$inlined$map$1$2", m100430f = "AiChatWrapperScreenCoordinator.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41351a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f19004E;

                /* JADX INFO: renamed from: F */
                Object f19005F;

                /* JADX INFO: renamed from: G */
                Object f19006G;

                /* JADX INFO: renamed from: H */
                int f19007H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f19008w;

                /* JADX INFO: renamed from: x */
                int f19009x;

                /* JADX INFO: renamed from: y */
                Object f19010y;

                public C41351a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f19008w = obj;
                    this.f19009x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f19003w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41351a c41351a;
                if (interfaceC30057d instanceof C41351a) {
                    c41351a = (C41351a) interfaceC30057d;
                    int i13 = c41351a.f19009x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41351a.f19009x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41351a = new C41351a(interfaceC30057d);
                    }
                } else {
                    c41351a = new C41351a(interfaceC30057d);
                }
                Object obj2 = c41351a.f19008w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41351a.f19009x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f19003w;
                    List<C40628k> listM131827d = ((C40626i) obj).m131827d();
                    c41351a.f19010y = null;
                    c41351a.f19004E = null;
                    c41351a.f19005F = null;
                    c41351a.f19006G = null;
                    c41351a.f19007H = 0;
                    c41351a.f19009x = 1;
                    if (interfaceC13062m.emit(listM131827d, c41351a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l) {
            this.f19002w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f19002w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C4656v0(C40625h viewModel, C39522a navigationRouter, C31381b analyticsHelper, InterfaceC14515a analytics, InterfaceC32647n2 mediaPickerLauncher, InterfaceC32666r1 filePickerLauncher, boolean z4, InterfaceC28601c1 focusState, Function1 fileSizeResolver, C35993i0 markTurnAsSeenOrchestrator, InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navigationRouter, "navigationRouter");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(mediaPickerLauncher, "mediaPickerLauncher");
        AbstractC22676k.m65750j(filePickerLauncher, "filePickerLauncher");
        AbstractC22676k.m65750j(focusState, "focusState");
        AbstractC22676k.m65750j(fileSizeResolver, "fileSizeResolver");
        AbstractC22676k.m65750j(markTurnAsSeenOrchestrator, "markTurnAsSeenOrchestrator");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.viewModel = viewModel;
        this.navigationRouter = navigationRouter;
        this.analyticsHelper = analyticsHelper;
        this.analytics = analytics;
        this.mediaPickerLauncher = mediaPickerLauncher;
        this.filePickerLauncher = filePickerLauncher;
        this.isFileUploadEnabled = z4;
        this.focusState = focusState;
        this.fileSizeResolver = fileSizeResolver;
        this.markTurnAsSeenOrchestrator = markTurnAsSeenOrchestrator;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.analyticsTracker = new C31382c(viewModel.getViewState(), analyticsHelper, dateAndTimeProvider, null, 8, null);
        this.attachmentUploadStates = AbstractC13091v.m36610t(new c(viewModel.getViewState()));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m14670q(C4656v0 c4656v0, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC4339a = null;
        }
        c4656v0.m14696p(interfaceC4339a);
    }

    /* JADX INFO: renamed from: y */
    private final void m14671y(String text, boolean isSuggestion, List<String> fileIds) {
        List<String> list;
        if (AbstractC39414r.m125890i0(text) && ((list = fileIds) == null || list.isEmpty())) {
            return;
        }
        this.viewModel.mo1216g(new AbstractC40624g.d(text, EnumC26800b.USER, fileIds, false, this.dateAndTimeProvider.mo133363b(), isSuggestion));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14672z(C4656v0 c4656v0, String str, boolean z4, List list, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            list = null;
        }
        c4656v0.m14671y(str, z4, list);
    }

    /* JADX INFO: renamed from: A */
    public final void m14673A(InterfaceC2994c0 scope, boolean fireEntryEvent) {
        AbstractC22676k.m65750j(scope, "scope");
        this.analyticsTracker.m96633k(scope, fireEntryEvent);
    }

    /* JADX INFO: renamed from: B */
    public final void m14674B() {
        this.viewModel.mo1216g(AbstractC40624g.r.f175126a);
    }

    /* JADX INFO: renamed from: C */
    public final void m14675C(AnalyticEventModel event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC14516b.m41429a(this.analytics, event);
    }

    /* JADX INFO: renamed from: D */
    public final void m14676D() {
        this.analyticsHelper.m96620a(new AbstractC31380a.g(this.analyticsTracker.getCurrentFingerprint()));
    }

    /* JADX INFO: renamed from: E */
    public final void m14677E() {
        this.analyticsTracker.m96634l();
    }

    /* JADX INFO: renamed from: F */
    public final void m14678F(InterfaceC18484b event) {
        AbstractC31380a oVar;
        AbstractC22676k.m65750j(event, "event");
        String strM96631i = this.analyticsTracker.getCurrentFingerprint();
        if (event instanceof InterfaceC18484b.c) {
            InterfaceC18484b.c cVar = (InterfaceC18484b.c) event;
            oVar = new AbstractC31380a.p(strM96631i, cVar.getFormId(), cVar.getFormKey(), cVar.getVersion(), cVar.getQuestionId(), cVar.getOptionId());
        } else if (event instanceof InterfaceC18484b.a) {
            InterfaceC18484b.a aVar = (InterfaceC18484b.a) event;
            oVar = new AbstractC31380a.n(strM96631i, aVar.getFormId(), aVar.getFormKey(), aVar.getVersion());
        } else if (event instanceof InterfaceC18484b.d) {
            InterfaceC18484b.d dVar = (InterfaceC18484b.d) event;
            oVar = new AbstractC31380a.q(strM96631i, dVar.getFormId(), dVar.getFormKey(), dVar.getVersion(), dVar.getSelectedOptionId());
        } else if (event instanceof InterfaceC18484b.e) {
            InterfaceC18484b.e eVar = (InterfaceC18484b.e) event;
            oVar = new AbstractC31380a.r(strM96631i, eVar.getFormId(), eVar.getFormKey(), eVar.getVersion());
        } else {
            if (!(event instanceof InterfaceC18484b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC18484b.b bVar = (InterfaceC18484b.b) event;
            oVar = new AbstractC31380a.o(strM96631i, bVar.getFormId(), bVar.getFormKey(), bVar.getVersion(), bVar.getErrorType());
        }
        this.analyticsHelper.m96620a(oVar);
    }

    /* JADX INFO: renamed from: G */
    public final void m14679G() {
        this.analyticsHelper.m96620a(new AbstractC31380a.w(this.analyticsTracker.getCurrentFingerprint()));
    }

    /* JADX INFO: renamed from: H */
    public final void m14680H(int suggestionCount) {
        this.analyticsHelper.m96620a(new AbstractC31380a.h0(this.analyticsTracker.getCurrentFingerprint(), suggestionCount));
    }

    /* JADX INFO: renamed from: a */
    public final void m14681a(C32645n0 screenArgs) {
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        if (screenArgs.m102033r()) {
            return;
        }
        if (this.hasInitializedConversation && AbstractC22676k.m65745e(this.initializedFingerprint, screenArgs.getFingerprint())) {
            return;
        }
        this.hasInitializedConversation = true;
        this.initializedFingerprint = screenArgs.getFingerprint();
        boolean z4 = screenArgs.getEntrypointExperience() == ChatEntrypointExperience.FAB_VOICE;
        String strM102031p = screenArgs.getUserMessage();
        if (strM102031p == null || AbstractC39414r.m125890i0(strM102031p)) {
            strM102031p = null;
        }
        C40625h c40625h = this.viewModel;
        String strM102021f = screenArgs.getFingerprint();
        String strM102019d = (z4 || strM102031p != null) ? null : screenArgs.m102019d();
        String strM102029n = screenArgs.getSourceType();
        String strM102027l = screenArgs.getSourceId();
        String strM102025j = screenArgs.getPresetQuestionKey();
        Map<String, JsonElement> mapM102016a = screenArgs.m102016a();
        boolean zM102034s = screenArgs.getIsWcePrefetch();
        if (z4) {
            strM102031p = screenArgs.getStaticInitialMessage();
        }
        String str = strM102031p;
        ChatEntrypointExperience chatEntrypointExperienceM102020e = screenArgs.getEntrypointExperience();
        c40625h.mo1216g(new AbstractC40624g.b(strM102021f, strM102029n, strM102027l, strM102019d, strM102025j, mapM102016a, zM102034s, false, str, chatEntrypointExperienceM102020e != null ? chatEntrypointExperienceM102020e.name() : null, screenArgs.getIsDay0(), 128, null));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC13058l getAttachmentUploadStates() {
        return this.attachmentUploadStates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsFileUploadEnabled() {
        return this.isFileUploadEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC32666r1 getFilePickerLauncher() {
        return this.filePickerLauncher;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC32647n2 getMediaPickerLauncher() {
        return this.mediaPickerLauncher;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C40625h getViewModel() {
        return this.viewModel;
    }

    /* JADX INFO: renamed from: g */
    public final void m14687g() {
        this.viewModel.mo1216g(AbstractC40624g.f.f175108a);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14688h() {
        return this.isFileUploadEnabled;
    }

    /* JADX INFO: renamed from: i */
    public final void m14689i() {
        this.mediaPickerLauncher.mo102038a(AbstractC32662q2.a.f135509a);
    }

    /* JADX INFO: renamed from: j */
    public final void m14690j() {
        if (this.isFileUploadEnabled) {
            this.filePickerLauncher.mo102243a();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m14691k() {
        this.mediaPickerLauncher.mo102038a(AbstractC32662q2.c.f135511a);
    }

    /* JADX INFO: renamed from: l */
    public final void m14692l() {
        this.pendingMetadataRefresh = true;
        this.markTurnAsSeenOrchestrator.m114310a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m14693m(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f19001z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f19001z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f18999x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f19001z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C35993i0 c35993i0 = this.markTurnAsSeenOrchestrator;
            bVar.f18998w = j7;
            bVar.f19001z = 1;
            if (c35993i0.m114311b(j7, bVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        if (this.pendingMetadataRefresh && this.hasInitializedConversation) {
            this.viewModel.mo1216g(AbstractC40624g.k.f175114a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public final Object m14694n(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM14693m = m14693m(this.dateAndTimeProvider.mo133363b(), interfaceC30057d);
        return objM14693m == EnumC31071a.f128113w ? objM14693m : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public final void m14695o(boolean isVisible) {
        this.viewModel.mo1216g(new AbstractC40624g.j(isVisible));
    }

    /* JADX INFO: renamed from: p */
    public final void m14696p(InterfaceC4339a onNavigationEvent) {
        m14701v(new AbstractC39523b.b("/context-hub-bff/v1/context-hub?analytics_source=coach-chat"), onNavigationEvent);
    }

    /* JADX INFO: renamed from: r */
    public final void m14697r(String fileId, Uri uri, AttachmentType type) {
        AbstractC40624g mVar;
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(type, "type");
        int i13 = a.f18997a[type.ordinal()];
        if (i13 == 1) {
            mVar = new AbstractC40624g.m(fileId, uri);
        } else {
            if (i13 != 2 && i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mVar = new AbstractC40624g.l(fileId, uri);
        }
        this.viewModel.mo1216g(mVar);
    }

    /* JADX INFO: renamed from: s */
    public final void m14698s() {
        this.analyticsTracker.m96632j();
    }

    /* JADX INFO: renamed from: t */
    public final void m14699t(Uri uri, String displayName, AttachmentType type) {
        AbstractC40624g vVar;
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(type, "type");
        AttachmentType attachmentType = AttachmentType.IMAGE;
        this.analyticsHelper.m96620a(new AbstractC31380a.a(this.analyticsTracker.getCurrentFingerprint(), type == attachmentType ? "image" : "pdf"));
        long jLongValue = ((Number) this.fileSizeResolver.invoke(uri)).longValue();
        if (type == attachmentType) {
            vVar = new AbstractC40624g.w(AbstractC37056f.m118958J(uri), null, AbstractC37056f.m118958J(Long.valueOf(jLongValue)), 2, null);
        } else {
            vVar = new AbstractC40624g.v(AbstractC37056f.m118958J(uri), AbstractC37056f.m118958J(displayName), AbstractC37056f.m118958J(Long.valueOf(jLongValue)));
        }
        this.viewModel.mo1216g(vVar);
    }

    /* JADX INFO: renamed from: u */
    public final void m14700u() {
        this.viewModel.mo1216g(new AbstractC40624g.n());
    }

    /* JADX INFO: renamed from: v */
    public final void m14701v(AbstractC39523b event, InterfaceC4339a onNavigationEvent) {
        AbstractC22676k.m65750j(event, "event");
        if (onNavigationEvent != null) {
            onNavigationEvent.invoke();
        }
        this.navigationRouter.m126249a(event);
    }

    /* JADX INFO: renamed from: w */
    public final void m14702w(String text, List<String> fileIds) {
        AbstractC22676k.m65750j(text, "text");
        m14671y(text, false, fileIds);
    }

    /* JADX INFO: renamed from: x */
    public final void m14703x(String text) {
        AbstractC22676k.m65750j(text, "text");
        m14672z(this, text, true, null, 4, null);
    }
}
