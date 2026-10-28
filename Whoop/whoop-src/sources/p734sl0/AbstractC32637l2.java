package p734sl0;

import af3.AbstractC0822a;
import af3.AbstractC0842r;
import af3.AbstractC0844t;
import af3.C0823a0;
import af3.C0824b;
import af3.C0825b0;
import af3.C0826c;
import af3.C0828d;
import af3.C0831g;
import af3.C0832h;
import af3.C0834j;
import af3.C0835k;
import af3.C0837m;
import af3.C0840p;
import af3.C0846v;
import af3.C0847w;
import af3.C0850z;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bb2.C2931g;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bf3.C3203b;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import cw2.C11162c;
import hb3.AbstractC17104a0;
import io.getstream.chat.android.client.api.QueryParams;
import iz0.C21053l;
import iz0.C21054m;
import j81.C21421e;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p012ab.C0684i0;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2368e1;
import p027b3.InterfaceC2355b3;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15011f9;
import p180h0.AbstractC16434o3;
import p181h2.C16617b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.C17924z0;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p294l3.C23248d;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23277r0;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p392p3.C28782t;
import p478s3.C32096b;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc2.C32375n;
import tr2.InterfaceC34116n;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;
import zk0.C40819i0;

/* JADX INFO: renamed from: sl0.l2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000º\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u001a}\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a=\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\b\"\u0010#\u001a=\u0010'\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010!\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\b'\u0010(\u001a3\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b+\u0010,\u001ag\u00105\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020 2\b\b\u0002\u00100\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001e\u00104\u001a\u001a\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001001H\u0003¢\u0006\u0004\b5\u00106\u001a3\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u0002072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\b9\u0010:\u001a\u0017\u0010;\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b;\u0010<\u001a=\u0010>\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\b>\u0010\u0019\u001a;\u0010A\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00142\u0006\u0010@\u001a\u00020?2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\bA\u0010B\u001a1\u0010I\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0003¢\u0006\u0004\bI\u0010J\u001a'\u0010O\u001a\u00020M2\u0006\u0010K\u001a\u0002032\u0006\u0010L\u001a\u0002032\u0006\u0010N\u001a\u00020MH\u0000¢\u0006\u0004\bO\u0010P\u001a%\u0010Q\u001a\u00020\u0010*\u00020?2\u0006\u0010D\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010S\u001a\u000203*\u00020\u0014H\u0000¢\u0006\u0004\bS\u0010T\u001a\u001d\u0010V\u001a\u000203*\u00020\u00142\b\u0010U\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\bV\u0010W\"\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006`²\u0006\u000e\u0010\\\u001a\u0002038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010]\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010^\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010_\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, m65681d2 = {"", "markdown", "Landroidx/compose/ui/Modifier;", "modifier", "Lbf3/b;", "parser", "", "isComplete", "stoppedByUser", "typewriterEffectFix", "Liz0/m;", "styles", "Lzk0/i0;", "spacing", "fadeInReveal", "Lkotlin/Function1;", "Ll83/a0;", "onTypewriterUpdate", "u", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lbf3/b;ZZZLiz0/m;Lzk0/i0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Laf3/t;", "node", "Lsl0/b3;", "fade", "t", "(Laf3/t;Landroidx/compose/ui/Modifier;Liz0/m;Lzk0/i0;Lsl0/b3;Landroidx/compose/runtime/Composer;II)V", "Laf3/w;", "paragraph", "U", "(Laf3/w;Liz0/m;Lzk0/i0;Lsl0/b3;Landroidx/compose/runtime/Composer;II)V", "Laf3/c;", "bulletList", "Lsl0/c3;", "type", "I", "(Laf3/c;Lsl0/c3;Liz0/m;Lzk0/i0;Lsl0/b3;Landroidx/compose/runtime/Composer;II)V", "Laf3/v;", "orderedList", "Lsl0/v2;", "R", "(Laf3/v;Lsl0/v2;Liz0/m;Lzk0/i0;Lsl0/b3;Landroidx/compose/runtime/Composer;II)V", "Laf3/k;", "heading", "N", "(Laf3/k;Liz0/m;Lzk0/i0;Lsl0/b3;Landroidx/compose/runtime/Composer;II)V", "Laf3/r;", "listBlock", "unorderedListType", "orderedListType", "Lkotlin/Function3;", "Ll0/y;", "", "item", "P", "(Laf3/r;Lsl0/c3;Lsl0/v2;Liz0/m;Lzk0/i0;Lsl0/b3;Lc93/o;Landroidx/compose/runtime/Composer;II)V", "Laf3/b;", "blockQuote", "F", "(Laf3/b;Liz0/m;Lzk0/i0;Lsl0/b3;Landroidx/compose/runtime/Composer;II)V", "Z", "(Lzk0/i0;Landroidx/compose/runtime/Composer;I)V", "parent", "L", "Ll3/d;", "annotatedString", "r", "(Laf3/t;Ll3/d;Liz0/m;Lzk0/i0;Lsl0/b3;Landroidx/compose/runtime/Composer;II)V", "Ll3/g;", "text", "Ll3/v0;", "style", "Li2/x;", "textColor", "W", "(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;JLandroidx/compose/runtime/Composer;II)V", "distanceFromEnd", "window", "", "minAlpha", "l0", "(IIF)F", "h0", "(Ll3/d;Ljava/lang/String;Lsl0/b3;)V", "j0", "(Laf3/t;)I", "child", "i0", "(Laf3/t;Laf3/t;)I", "Ltr2/n;", "a", "Ltr2/n;", "markdownLogger", "wordIndex", "typewriterText", "textToDisplay", "isCompleteState", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32637l2 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f135261a = InterfaceC34116n.INSTANCE.m107848a("Markdown");

    /* JADX INFO: renamed from: sl0.l2$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.MarkdownKt$Markdown$2$1", m100430f = "Markdown.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f135262E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f135263F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f135264G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f135265H;

        /* JADX INFO: renamed from: w */
        Object f135266w;

        /* JADX INFO: renamed from: x */
        int f135267x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f135268y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f135269z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, String str, boolean z4, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135268y = function1;
            this.f135269z = str;
            this.f135262E = z4;
            this.f135263F = interfaceC28601c1;
            this.f135264G = interfaceC28601c2;
            this.f135265H = interfaceC28601c3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135268y, this.f135269z, this.f135262E, this.f135263F, this.f135264G, this.f135265H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List listM125906y0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135267x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!AbstractC32637l2.m101985w(this.f135263F)) {
                    this.f135268y.invoke(Boolean.FALSE);
                    listM125906y0 = AbstractC39414r.m125906y0(this.f135269z, new String[]{" "}, 6);
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listM125906y0 = (List) this.f135266w;
            AbstractC34132o.m107864I(obj);
            while (AbstractC32637l2.m101988z(this.f135264G) < listM125906y0.size()) {
                AbstractC32637l2.m101927C(this.f135265H, AbstractC25265s.m74110N0(listM125906y0.subList(0, AbstractC32637l2.m101988z(this.f135264G) + 1), " ", null, null, null, 62));
                InterfaceC28601c1 interfaceC28601c1 = this.f135264G;
                AbstractC32637l2.m101925A(interfaceC28601c1, AbstractC32637l2.m101988z(interfaceC28601c1) + 1);
                this.f135266w = listM125906y0;
                this.f135267x = 1;
                if (AbstractC3034m0.m8782b(10L, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            if (AbstractC22676k.m65745e(AbstractC32637l2.m101926B(this.f135265H), this.f135269z) && this.f135262E) {
                this.f135268y.invoke(Boolean.TRUE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.l2$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f135270w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23254g f135271x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2355b3 f135272y;

        public b(InterfaceC28601c1 interfaceC28601c1, C23254g c23254g, InterfaceC2355b3 interfaceC2355b3) {
            this.f135270w = interfaceC28601c1;
            this.f135271x = c23254g;
            this.f135272y = interfaceC2355b3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m101990b(InterfaceC28601c1 interfaceC28601c1, C23254g c23254g, InterfaceC2355b3 interfaceC2355b3, C16617b c16617b) {
            C23277r0 c23277r0 = (C23277r0) interfaceC28601c1.getValue();
            if (c23277r0 != null) {
                int iM67377g = c23277r0.f92228b.m67377g(c16617b.f63937a);
                C23250e c23250e = (C23250e) AbstractC25265s.m74100H0(c23254g.m67315b(iM67377g, iM67377g));
                if (c23250e != null) {
                    Object obj = c23250e.f92125a;
                    if (AbstractC22676k.m65745e(c23250e.f92128d, QueryParams.URL)) {
                        try {
                            ((C2368e1) interfaceC2355b3).m7301a((String) obj);
                        } catch (Exception e5) {
                            AbstractC32637l2.f135261a.mo85222m("Could not open URI: " + obj + ", failed with exception " + AbstractC29125c.m88514W(e5), new AbstractC30556a.a[0]);
                        }
                    }
                }
            }
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C32674t(this.f135270w, this.f135271x, this.f135272y, 2), interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m101925A(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final String m101926B(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m101927C(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: D */
    private static final String m101928D(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: E */
    private static final void m101929E(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    private static final void m101930F(C0824b c0824b, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, Composer composer, int i13, int i14) {
        C0824b c0824b2;
        int i15;
        C32588b3 c32588b4;
        boolean z4;
        C32588b3 c32588b5;
        C28677v1 c28677v1M87180u;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1677406687);
        if ((i13 & 6) == 0) {
            c0824b2 = c0824b;
            i15 = (c28655q.m87157i(c0824b2) ? 4 : 2) | i13;
        } else {
            c0824b2 = c0824b;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c21054m) : c28655q.m87157i(c21054m) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(c40819i0) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                c32588b4 = c32588b3;
                i15 |= c28655q.m87157i(c32588b4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    c32588b4 = null;
                }
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(c21054m))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C32678u(3, c21054m, c40819i0);
                    c28655q.m87172p0(objM87133R);
                }
                float f13 = 4;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1125a.m3478a(C2314t.f9131w, (Function1) objM87133R), 16, f13, 0.0f, f13, 4);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
                int i17 = (i15 & 14) | (C21054m.f79836p << 6);
                int i18 = i15 << 3;
                int i19 = i17 | (i18 & 896) | (i18 & 7168) | (i18 & 57344);
                c32588b5 = c32588b4;
                m101936L(c0824b2, null, c21054m, c40819i0, c32588b5, c28655q, i19, 2);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                c32588b5 = c32588b4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a(c0824b, c21054m, c40819i0, c32588b5, i13, i14, 29);
            }
        }
        i15 |= 3072;
        c32588b4 = c32588b3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                c32588b4 = null;
            }
            if ((i15 & 112) != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C32678u(3, c21054m, c40819i0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C32678u(3, c21054m, c40819i0);
                c28655q.m87172p0(objM87133R);
            }
            float f14 = 4;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1125a.m3478a(C2314t.f9131w, (Function1) objM87133R), 16, f14, 0.0f, f14, 4);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            int i110 = (i15 & 14) | (C21054m.f79836p << 6);
            int i111 = i15 << 3;
            int i112 = i110 | (i111 & 896) | (i111 & 7168) | (i111 & 57344);
            c32588b5 = c32588b4;
            m101936L(c0824b2, null, c21054m, c40819i0, c32588b5, c28655q, i112, 2);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            c32588b5 = c32588b4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(c0824b, c21054m, c40819i0, c32588b5, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m101931G(C21054m c21054m, C40819i0 c40819i0, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        long blockQuoteLineColor = c21054m.getBlockQuoteLineColor();
        float fMo743q0 = drawBehind.mo743q0(c40819i0.getBlockQuoteBorderWidth());
        float f13 = 16;
        float f14 = 20;
        drawBehind.mo732d0(blockQuoteLineColor, (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32), (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)) - f14)) & 4294967295L), (496 & 8) != 0 ? 0.0f : fMo743q0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m101932H(C0824b c0824b, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, int i13, int i14, Composer composer, int i15) {
        m101930F(c0824b, c21054m, c40819i0, c32588b3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x0087  */
    /* JADX WARN: Code duplicated, block: B:57:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: I */
    private static final void m101933I(C0826c c0826c, EnumC32593c3 enumC32593c3, final C21054m c21054m, final C40819i0 c40819i0, C32588b3 c32588b3, Composer composer, int i13, int i14) {
        int i15;
        C32588b3 c32588b4;
        boolean z4;
        EnumC32593c3 enumC32593c4;
        final C32588b3 c32588b5;
        C28677v1 c28677v1M87180u;
        EnumC32593c3 enumC32593c5;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1184459391);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c0826c) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC32593c3 == null ? -1 : enumC32593c3.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(c21054m) : c28655q.m87157i(c21054m) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(c40819i0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i14 & 16;
        if (i17 == 0) {
            if ((i13 & 24576) == 0) {
                c32588b4 = c32588b3;
                i15 |= c28655q.m87157i(c32588b4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    enumC32593c5 = EnumC32593c3.DOT;
                } else {
                    enumC32593c5 = enumC32593c3;
                }
                if (i17 != 0) {
                    c32588b5 = null;
                } else {
                    c32588b5 = c32588b4;
                }
                final String strM8299l = AbstractC2875y.m8299l(enumC32593c5.getSymbol(), " ");
                int i18 = i15 << 3;
                m101940P(c0826c, enumC32593c5, null, c21054m, c40819i0, c32588b5, AbstractC37817c.m121344e(-160533558, c28655q, new InterfaceC4353o() { // from class: sl0.i2
                    @Override // c93.InterfaceC4353o
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return AbstractC32637l2.m101934J(strM8299l, c21054m, c40819i0, c32588b5, (InterfaceC23013y) obj, (AbstractC0844t) obj2, ((Integer) obj3).intValue(), (Composer) obj4, iIntValue);
                    }
                }), c28655q, (i15 & 14) | 1572864 | (i15 & 112) | (C21054m.f79836p << 9) | (i18 & 7168) | (57344 & i18) | (i18 & 458752), 4);
                enumC32593c4 = enumC32593c5;
            } else {
                c28655q.m87138X();
                enumC32593c4 = enumC32593c3;
                c32588b5 = c32588b4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(c0826c, enumC32593c4, c21054m, c40819i0, c32588b5, i13, i14, 23);
            }
        }
        i15 |= 24576;
        c32588b4 = c32588b3;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                enumC32593c5 = EnumC32593c3.DOT;
            } else {
                enumC32593c5 = enumC32593c3;
            }
            if (i17 != 0) {
                c32588b5 = null;
            } else {
                c32588b5 = c32588b4;
            }
            final String strM8299l2 = AbstractC2875y.m8299l(enumC32593c5.getSymbol(), " ");
            int i19 = i15 << 3;
            m101940P(c0826c, enumC32593c5, null, c21054m, c40819i0, c32588b5, AbstractC37817c.m121344e(-160533558, c28655q, new InterfaceC4353o() { // from class: sl0.i2
                @Override // c93.InterfaceC4353o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    return AbstractC32637l2.m101934J(strM8299l2, c21054m, c40819i0, c32588b5, (InterfaceC23013y) obj, (AbstractC0844t) obj2, ((Integer) obj3).intValue(), (Composer) obj4, iIntValue);
                }
            }), c28655q, (i15 & 14) | 1572864 | (i15 & 112) | (C21054m.f79836p << 9) | (i19 & 7168) | (57344 & i19) | (i19 & 458752), 4);
            enumC32593c4 = enumC32593c5;
        } else {
            c28655q.m87138X();
            enumC32593c4 = enumC32593c3;
            c32588b5 = c32588b4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(c0826c, enumC32593c4, c21054m, c40819i0, c32588b5, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m101934J(String str, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, InterfaceC23013y MarkdownListItems, AbstractC0844t node, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(MarkdownListItems, "$this$MarkdownListItems");
        AbstractC22676k.m65750j(node, "node");
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, composer, 48);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, C2314t.f9131w);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c22994r1M66759a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        C39111m c39111m = AbstractC39083d.f168140a;
        m101947W(new WithAlignmentLineElement(c39111m), new C23254g(str), c21054m.getTextStyle(), c21054m.getTextColor(), composer, 0, 0);
        c28655q.m87150e0(-1704086940);
        C23248d c23248d = new C23248d();
        c23248d.m67308j(c21054m.getTextStyle().f92255a);
        m101980r(node, c23248d, c21054m, c40819i0, c32588b3, composer, ((i14 >> 3) & 14) | 64 | (C21054m.f79836p << 6), 0);
        c23248d.m67303e();
        C23254g c23254gM67309k = c23248d.m67309k();
        c28655q.m87173q(false);
        m101947W(new WithAlignmentLineElement(c39111m), c23254gM67309k, c21054m.getTextStyle(), c21054m.getTextColor(), composer, 0, 0);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m101935K(C0826c c0826c, EnumC32593c3 enumC32593c3, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, int i13, int i14, Composer composer, int i15) {
        m101933I(c0826c, enumC32593c3, c21054m, c40819i0, c32588b3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0239  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0132  */
    /* JADX WARN: Code duplicated, block: B:80:0x0156  */
    /* JADX WARN: Code duplicated, block: B:82:0x015a  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0182  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:88:0x01af  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0205  */
    /* JADX WARN: Code duplicated, block: B:95:0x0216  */
    /* JADX WARN: Code duplicated, block: B:98:0x022e  */
    /* JADX INFO: renamed from: L */
    private static final void m101936L(AbstractC0844t abstractC0844t, Modifier modifier, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        C32588b3 c32588b4;
        int i17;
        int i18;
        boolean z4;
        Modifier modifier3;
        C32588b3 c32588b5;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int i19;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC0844t abstractC0844t2;
        AbstractC0844t abstractC0844t3;
        int i24;
        boolean zM87157i;
        int i25;
        C40819i0 c40819i1 = c40819i0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(565715671);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(abstractC0844t) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i13 & 512) == 0) {
                    zM87157i = c28655q.m87153g(c21054m);
                } else {
                    zM87157i = c28655q.m87157i(c21054m);
                }
                if (zM87157i) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i15 |= i25;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87153g(c40819i1)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i24;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    c32588b4 = c32588b3;
                    if (c28655q.m87157i(c32588b4)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        c32588b5 = null;
                    } else {
                        c32588b5 = c32588b4;
                    }
                    i19 = i18 >> 3;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
                    abstractC0844t2 = abstractC0844t.f3039b;
                    c28655q.m87150e0(970490465);
                    while (abstractC0844t2 != null) {
                        if (abstractC0844t2 instanceof C0831g) {
                            c28655q.m87150e0(970492429);
                            C28655q c28655q2 = c28655q;
                            C32588b3 c32588b6 = c32588b5;
                            m101982t(abstractC0844t2, null, c21054m, c40819i1, c32588b6, c28655q2, (57344 & i18) | (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168), 2);
                            abstractC0844t3 = abstractC0844t2;
                            c32588b5 = c32588b6;
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        } else {
                            abstractC0844t3 = abstractC0844t2;
                            if (abstractC0844t3 instanceof C0824b) {
                                c28655q.m87150e0(970495549);
                                c40819i1 = c40819i0;
                                m101930F((C0824b) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                                c28655q.m87173q(false);
                            } else if (abstractC0844t3 instanceof C0847w) {
                                c28655q.m87150e0(970498140);
                                c40819i1 = c40819i0;
                                m101945U((C0847w) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                                c28655q.m87173q(false);
                            } else if (abstractC0844t3 instanceof C0826c) {
                                c28655q.m87150e0(970500759);
                                C28655q c28655q3 = c28655q;
                                C32588b3 c32588b7 = c32588b5;
                                m101933I((C0826c) abstractC0844t3, null, c21054m, c40819i0, c32588b7, c28655q3, (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 2);
                                c32588b5 = c32588b7;
                                c28655q = c28655q3;
                                c28655q.m87173q(false);
                            } else if (abstractC0844t3 instanceof C0846v) {
                                c28655q.m87150e0(970504248);
                                C28655q c28655q4 = c28655q;
                                C32588b3 c32588b8 = c32588b5;
                                m101942R((C0846v) abstractC0844t3, null, c21054m, c40819i0, c32588b8, c28655q4, (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 2);
                                c32588b5 = c32588b8;
                                c28655q = c28655q4;
                                c28655q.m87173q(false);
                            } else if (abstractC0844t3 instanceof C0835k) {
                                c28655q.m87150e0(970507610);
                                c40819i1 = c40819i0;
                                m101938N((C0835k) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                                c28655q.m87173q(false);
                            } else {
                                c40819i1 = c40819i0;
                                if (abstractC0844t3 instanceof C0825b0) {
                                    c28655q.m87150e0(970510219);
                                    m101950Z(c40819i1, c28655q, (i18 >> 9) & 14);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(21088437);
                                    c28655q.m87173q(false);
                                }
                            }
                            abstractC0844t2 = abstractC0844t3.f3042e;
                        }
                        c40819i1 = c40819i0;
                        abstractC0844t2 = abstractC0844t3.f3042e;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    c32588b5 = c32588b4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32607f2(abstractC0844t, modifier3, c21054m, c40819i1, c32588b5, i13, i14, 0);
                }
            }
            i15 |= 24576;
            c32588b4 = c32588b3;
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    c32588b5 = null;
                } else {
                    c32588b5 = c32588b4;
                }
                i19 = i18 >> 3;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                abstractC0844t2 = abstractC0844t.f3039b;
                c28655q.m87150e0(970490465);
                while (abstractC0844t2 != null) {
                    if (abstractC0844t2 instanceof C0831g) {
                        c28655q.m87150e0(970492429);
                        C28655q c28655q5 = c28655q;
                        C32588b3 c32588b9 = c32588b5;
                        m101982t(abstractC0844t2, null, c21054m, c40819i1, c32588b9, c28655q5, (57344 & i18) | (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168), 2);
                        abstractC0844t3 = abstractC0844t2;
                        c32588b5 = c32588b9;
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    } else {
                        abstractC0844t3 = abstractC0844t2;
                        if (abstractC0844t3 instanceof C0824b) {
                            c28655q.m87150e0(970495549);
                            c40819i1 = c40819i0;
                            m101930F((C0824b) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                            c28655q.m87173q(false);
                        } else if (abstractC0844t3 instanceof C0847w) {
                            c28655q.m87150e0(970498140);
                            c40819i1 = c40819i0;
                            m101945U((C0847w) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                            c28655q.m87173q(false);
                        } else if (abstractC0844t3 instanceof C0826c) {
                            c28655q.m87150e0(970500759);
                            C28655q c28655q6 = c28655q;
                            C32588b3 c32588b10 = c32588b5;
                            m101933I((C0826c) abstractC0844t3, null, c21054m, c40819i0, c32588b10, c28655q6, (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 2);
                            c32588b5 = c32588b10;
                            c28655q = c28655q6;
                            c28655q.m87173q(false);
                        } else if (abstractC0844t3 instanceof C0846v) {
                            c28655q.m87150e0(970504248);
                            C28655q c28655q7 = c28655q;
                            C32588b3 c32588b11 = c32588b5;
                            m101942R((C0846v) abstractC0844t3, null, c21054m, c40819i0, c32588b11, c28655q7, (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 2);
                            c32588b5 = c32588b11;
                            c28655q = c28655q7;
                            c28655q.m87173q(false);
                        } else if (abstractC0844t3 instanceof C0835k) {
                            c28655q.m87150e0(970507610);
                            c40819i1 = c40819i0;
                            m101938N((C0835k) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                            c28655q.m87173q(false);
                        } else {
                            c40819i1 = c40819i0;
                            if (abstractC0844t3 instanceof C0825b0) {
                                c28655q.m87150e0(970510219);
                                m101950Z(c40819i1, c28655q, (i18 >> 9) & 14);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(21088437);
                                c28655q.m87173q(false);
                            }
                        }
                        abstractC0844t2 = abstractC0844t3.f3042e;
                    }
                    c40819i1 = c40819i0;
                    abstractC0844t2 = abstractC0844t3.f3042e;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                c32588b5 = c32588b4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32607f2(abstractC0844t, modifier3, c21054m, c40819i1, c32588b5, i13, i14, 0);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if ((i13 & 512) == 0) {
                zM87157i = c28655q.m87153g(c21054m);
            } else {
                zM87157i = c28655q.m87157i(c21054m);
            }
            if (zM87157i) {
                i25 = 256;
            } else {
                i25 = 128;
            }
            i15 |= i25;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q.m87153g(c40819i1)) {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i24;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                c32588b4 = c32588b3;
                if (c28655q.m87157i(c32588b4)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    c32588b5 = null;
                } else {
                    c32588b5 = c32588b4;
                }
                i19 = i18 >> 3;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                abstractC0844t2 = abstractC0844t.f3039b;
                c28655q.m87150e0(970490465);
                while (abstractC0844t2 != null) {
                    if (abstractC0844t2 instanceof C0831g) {
                        c28655q.m87150e0(970492429);
                        C28655q c28655q8 = c28655q;
                        C32588b3 c32588b12 = c32588b5;
                        m101982t(abstractC0844t2, null, c21054m, c40819i1, c32588b12, c28655q8, (57344 & i18) | (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168), 2);
                        abstractC0844t3 = abstractC0844t2;
                        c32588b5 = c32588b12;
                        c28655q = c28655q8;
                        c28655q.m87173q(false);
                    } else {
                        abstractC0844t3 = abstractC0844t2;
                        if (abstractC0844t3 instanceof C0824b) {
                            c28655q.m87150e0(970495549);
                            c40819i1 = c40819i0;
                            m101930F((C0824b) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                            c28655q.m87173q(false);
                        } else if (abstractC0844t3 instanceof C0847w) {
                            c28655q.m87150e0(970498140);
                            c40819i1 = c40819i0;
                            m101945U((C0847w) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                            c28655q.m87173q(false);
                        } else if (abstractC0844t3 instanceof C0826c) {
                            c28655q.m87150e0(970500759);
                            C28655q c28655q9 = c28655q;
                            C32588b3 c32588b13 = c32588b5;
                            m101933I((C0826c) abstractC0844t3, null, c21054m, c40819i0, c32588b13, c28655q9, (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 2);
                            c32588b5 = c32588b13;
                            c28655q = c28655q9;
                            c28655q.m87173q(false);
                        } else if (abstractC0844t3 instanceof C0846v) {
                            c28655q.m87150e0(970504248);
                            C28655q c28655q10 = c28655q;
                            C32588b3 c32588b14 = c32588b5;
                            m101942R((C0846v) abstractC0844t3, null, c21054m, c40819i0, c32588b14, c28655q10, (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 2);
                            c32588b5 = c32588b14;
                            c28655q = c28655q10;
                            c28655q.m87173q(false);
                        } else if (abstractC0844t3 instanceof C0835k) {
                            c28655q.m87150e0(970507610);
                            c40819i1 = c40819i0;
                            m101938N((C0835k) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                            c28655q.m87173q(false);
                        } else {
                            c40819i1 = c40819i0;
                            if (abstractC0844t3 instanceof C0825b0) {
                                c28655q.m87150e0(970510219);
                                m101950Z(c40819i1, c28655q, (i18 >> 9) & 14);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(21088437);
                                c28655q.m87173q(false);
                            }
                        }
                        abstractC0844t2 = abstractC0844t3.f3042e;
                    }
                    c40819i1 = c40819i0;
                    abstractC0844t2 = abstractC0844t3.f3042e;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                c32588b5 = c32588b4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32607f2(abstractC0844t, modifier3, c21054m, c40819i1, c32588b5, i13, i14, 0);
            }
        }
        i15 |= 24576;
        c32588b4 = c32588b3;
        i18 = i15;
        if ((i18 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i18 & 1, z4)) {
            if (i26 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                c32588b5 = null;
            } else {
                c32588b5 = c32588b4;
            }
            i19 = i18 >> 3;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            abstractC0844t2 = abstractC0844t.f3039b;
            c28655q.m87150e0(970490465);
            while (abstractC0844t2 != null) {
                if (abstractC0844t2 instanceof C0831g) {
                    c28655q.m87150e0(970492429);
                    C28655q c28655q11 = c28655q;
                    C32588b3 c32588b15 = c32588b5;
                    m101982t(abstractC0844t2, null, c21054m, c40819i1, c32588b15, c28655q11, (57344 & i18) | (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168), 2);
                    abstractC0844t3 = abstractC0844t2;
                    c32588b5 = c32588b15;
                    c28655q = c28655q11;
                    c28655q.m87173q(false);
                } else {
                    abstractC0844t3 = abstractC0844t2;
                    if (abstractC0844t3 instanceof C0824b) {
                        c28655q.m87150e0(970495549);
                        c40819i1 = c40819i0;
                        m101930F((C0824b) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                        c28655q.m87173q(false);
                    } else if (abstractC0844t3 instanceof C0847w) {
                        c28655q.m87150e0(970498140);
                        c40819i1 = c40819i0;
                        m101945U((C0847w) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                        c28655q.m87173q(false);
                    } else if (abstractC0844t3 instanceof C0826c) {
                        c28655q.m87150e0(970500759);
                        C28655q c28655q12 = c28655q;
                        C32588b3 c32588b16 = c32588b5;
                        m101933I((C0826c) abstractC0844t3, null, c21054m, c40819i0, c32588b16, c28655q12, (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 2);
                        c32588b5 = c32588b16;
                        c28655q = c28655q12;
                        c28655q.m87173q(false);
                    } else if (abstractC0844t3 instanceof C0846v) {
                        c28655q.m87150e0(970504248);
                        C28655q c28655q13 = c28655q;
                        C32588b3 c32588b17 = c32588b5;
                        m101942R((C0846v) abstractC0844t3, null, c21054m, c40819i0, c32588b17, c28655q13, (C21054m.f79836p << 6) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 2);
                        c32588b5 = c32588b17;
                        c28655q = c28655q13;
                        c28655q.m87173q(false);
                    } else if (abstractC0844t3 instanceof C0835k) {
                        c28655q.m87150e0(970507610);
                        c40819i1 = c40819i0;
                        m101938N((C0835k) abstractC0844t3, c21054m, c40819i1, c32588b5, c28655q, (C21054m.f79836p << 3) | (i19 & 112) | (i19 & 896) | (i19 & 7168), 0);
                        c28655q.m87173q(false);
                    } else {
                        c40819i1 = c40819i0;
                        if (abstractC0844t3 instanceof C0825b0) {
                            c28655q.m87150e0(970510219);
                            m101950Z(c40819i1, c28655q, (i18 >> 9) & 14);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(21088437);
                            c28655q.m87173q(false);
                        }
                    }
                    abstractC0844t2 = abstractC0844t3.f3042e;
                }
                c40819i1 = c40819i0;
                abstractC0844t2 = abstractC0844t3.f3042e;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            c32588b5 = c32588b4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32607f2(abstractC0844t, modifier3, c21054m, c40819i1, c32588b5, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m101937M(AbstractC0844t abstractC0844t, Modifier modifier, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, int i13, int i14, Composer composer, int i15) {
        m101936L(abstractC0844t, modifier, c21054m, c40819i0, c32588b3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x012b  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    public static final void m101938N(C0835k heading, C21054m styles, C40819i0 spacing, C32588b3 c32588b3, Composer composer, int i13, int i14) {
        int i15;
        C32588b3 c32588b4;
        boolean z4;
        C32588b3 c32588b5;
        C28677v1 c28677v1M87180u;
        C32588b3 c32588b6;
        int i16;
        C2886a h1;
        C2886a c2886a;
        long jM67366c;
        int i17;
        Modifier modifierM3398t;
        AbstractC22676k.m65750j(heading, "heading");
        AbstractC22676k.m65750j(styles, "styles");
        AbstractC22676k.m65750j(spacing, "spacing");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(82384013);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(heading) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(styles) : c28655q.m87157i(styles) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(spacing) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                c32588b4 = c32588b3;
                i15 |= c28655q.m87157i(c32588b4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    c32588b6 = null;
                } else {
                    c32588b6 = c32588b4;
                }
                i16 = heading.f3027g;
                if (i16 != 1) {
                    h1 = styles.getHeadingStyles().getH1();
                } else if (i16 != 2) {
                    h1 = styles.getHeadingStyles().getH2();
                } else if (i16 != 3) {
                    h1 = styles.getHeadingStyles().getH3();
                } else if (i16 != 4) {
                    h1 = styles.getHeadingStyles().getH4();
                } else {
                    h1 = styles.getHeadingStyles().getH4();
                }
                c2886a = h1;
                c28655q.m87150e0(1861637736);
                int i19 = i15;
                C23248d c23248d = new C23248d();
                c23248d.m67308j(c2886a.getStyle().f92255a);
                int i24 = (i19 & 14) | 64 | (C21054m.f79836p << 6);
                int i25 = i19 << 3;
                int i26 = i24 | (i25 & 896) | (i25 & 7168) | (i25 & 57344);
                c32588b5 = c32588b6;
                m101980r(heading, c23248d, styles, spacing, c32588b5, c28655q, i26, 0);
                c23248d.m67303e();
                C23254g c23254gM67309k = c23248d.m67309k();
                c28655q.m87173q(false);
                if (C17919x.m51542d(c2886a.getStyle().m67366c(), C17919x.f69637n)) {
                    jM67366c = styles.getTextColor();
                } else {
                    jM67366c = c2886a.getStyle().m67366c();
                }
                i17 = heading.f3027g;
                modifierM3398t = C2314t.f9131w;
                if (i17 != 1) {
                    modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, spacing.getH1SpacingTop(), 0.0f, spacing.getH1SpacingBottom(), 5);
                } else if (i17 != 2) {
                    modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, spacing.getH2SpacingTop(), 0.0f, spacing.getH2SpacingBottom(), 5);
                } else if (i17 == 3) {
                    modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, spacing.getH3SpacingTop(), 0.0f, spacing.getH3SpacingBottom(), 5);
                }
                m101947W(modifierM3398t, c23254gM67309k, c2886a.getStyle(), jM67366c, c28655q, 0, 0);
            } else {
                c28655q.m87138X();
                c32588b5 = c32588b4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a(heading, styles, spacing, c32588b5, i13, i14, 28);
            }
        }
        i15 |= 3072;
        c32588b4 = c32588b3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                c32588b6 = null;
            } else {
                c32588b6 = c32588b4;
            }
            i16 = heading.f3027g;
            if (i16 != 1) {
                h1 = styles.getHeadingStyles().getH1();
            } else if (i16 != 2) {
                h1 = styles.getHeadingStyles().getH2();
            } else if (i16 != 3) {
                h1 = styles.getHeadingStyles().getH3();
            } else if (i16 != 4) {
                h1 = styles.getHeadingStyles().getH4();
            } else {
                h1 = styles.getHeadingStyles().getH4();
            }
            c2886a = h1;
            c28655q.m87150e0(1861637736);
            int i110 = i15;
            C23248d c23248d2 = new C23248d();
            c23248d2.m67308j(c2886a.getStyle().f92255a);
            int i27 = (i110 & 14) | 64 | (C21054m.f79836p << 6);
            int i28 = i110 << 3;
            int i29 = i27 | (i28 & 896) | (i28 & 7168) | (i28 & 57344);
            c32588b5 = c32588b6;
            m101980r(heading, c23248d2, styles, spacing, c32588b5, c28655q, i29, 0);
            c23248d2.m67303e();
            C23254g c23254gM67309k2 = c23248d2.m67309k();
            c28655q.m87173q(false);
            if (C17919x.m51542d(c2886a.getStyle().m67366c(), C17919x.f69637n)) {
                jM67366c = styles.getTextColor();
            } else {
                jM67366c = c2886a.getStyle().m67366c();
            }
            i17 = heading.f3027g;
            modifierM3398t = C2314t.f9131w;
            if (i17 != 1) {
                modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, spacing.getH1SpacingTop(), 0.0f, spacing.getH1SpacingBottom(), 5);
            } else if (i17 != 2) {
                modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, spacing.getH2SpacingTop(), 0.0f, spacing.getH2SpacingBottom(), 5);
            } else if (i17 == 3) {
                modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, spacing.getH3SpacingTop(), 0.0f, spacing.getH3SpacingBottom(), 5);
            }
            m101947W(modifierM3398t, c23254gM67309k2, c2886a.getStyle(), jM67366c, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
            c32588b5 = c32588b4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(heading, styles, spacing, c32588b5, i13, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m101939O(C0835k c0835k, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, int i13, int i14, Composer composer, int i15) {
        m101938N(c0835k, c21054m, c40819i0, c32588b3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0105  */
    /* JADX WARN: Code duplicated, block: B:108:0x0114  */
    /* JADX WARN: Code duplicated, block: B:111:0x014b  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:126:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x01be  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:138:0x0224  */
    /* JADX WARN: Code duplicated, block: B:142:0x0272  */
    /* JADX WARN: Code duplicated, block: B:145:0x0280  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f4  */
    /* JADX INFO: renamed from: P */
    private static final void m101940P(AbstractC0842r abstractC0842r, EnumC32593c3 enumC32593c3, EnumC32685v2 enumC32685v2, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, InterfaceC4353o interfaceC4353o, Composer composer, int i13, int i14) {
        int i15;
        C40819i0 c40819i1;
        C32588b3 c32588b4;
        InterfaceC4353o interfaceC4353o2;
        int i16;
        boolean z4;
        EnumC32593c3 enumC32593c4;
        EnumC32685v2 enumC32685v3;
        C32588b3 c32588b5;
        C28677v1 c28677v1M87180u;
        EnumC32593c3 enumC32593c5;
        EnumC32685v2 enumC32685v4;
        AbstractC0844t abstractC0844t;
        boolean z13;
        boolean z14;
        float f13;
        float listIndent;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC0844t abstractC0844t2;
        boolean z15;
        AbstractC0844t abstractC0844t3;
        C2314t c2314t2;
        AbstractC0844t abstractC0844t4;
        AbstractC0822a abstractC0822a;
        int i17;
        C21054m c21054m2 = c21054m;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1841911931);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(abstractC0842r) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC32593c3 == null ? -1 : enumC32593c3.ordinal()) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC32685v2 != null ? enumC32685v2.ordinal() : -1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q.m87153g(c21054m2) : c28655q.m87157i(c21054m2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            c40819i1 = c40819i0;
            i15 |= c28655q.m87153g(c40819i1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            c40819i1 = c40819i0;
        }
        int i24 = i14 & 32;
        if (i24 == 0) {
            if ((196608 & i13) == 0) {
                c32588b4 = c32588b3;
                i15 |= c28655q.m87157i(c32588b4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((1572864 & i13) == 0) {
                interfaceC4353o2 = interfaceC4353o;
                if (c28655q.m87157i(interfaceC4353o2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            } else {
                interfaceC4353o2 = interfaceC4353o;
            }
            i16 = i15;
            if ((599187 & i16) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i18 != 0) {
                    enumC32593c5 = EnumC32593c3.DOT;
                } else {
                    enumC32593c5 = enumC32593c3;
                }
                if (i19 != 0) {
                    enumC32685v4 = EnumC32685v2.NUMBERS;
                } else {
                    enumC32685v4 = enumC32685v2;
                }
                if (i24 != 0) {
                    c32588b5 = null;
                } else {
                    c32588b5 = c32588b4;
                }
                abstractC0844t = abstractC0842r.f3039b;
                if ((abstractC0844t != null ? abstractC0844t.f3042e : null) == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                AbstractC0822a abstractC0822a2 = (AbstractC0822a) abstractC0842r.f3038a;
                z14 = abstractC0822a2 instanceof C0831g;
                if (z14 || z13) {
                    f13 = 0;
                } else {
                    f13 = 8;
                }
                float f14 = f13;
                if (!z14 || (abstractC0822a2 instanceof C0824b)) {
                    listIndent = c40819i1.getListIndent();
                } else {
                    listIndent = 12;
                }
                float f15 = listIndent;
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t3, f15, 0.0f, 0.0f, f14, 6);
                c2314t = c2314t3;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
                abstractC0844t2 = abstractC0842r.f3039b;
                c28655q.m87150e0(-765042546);
                z15 = true;
                while (abstractC0844t2 != null) {
                    if (z15) {
                        c28655q.m87150e0(2053679315);
                        c28655q.m87173q(false);
                    } else {
                        abstractC0822a = (AbstractC0822a) abstractC0842r.f3038a;
                        if (!(abstractC0822a instanceof C0831g) || (abstractC0822a instanceof C0824b)) {
                            c28655q.m87150e0(2053588981);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(c40819i1.m132328r(), c2314t));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(2053679315);
                            c28655q.m87173q(false);
                        }
                    }
                    AbstractC0844t abstractC0844t5 = abstractC0844t2.f3039b;
                    c28655q.m87150e0(-765033949);
                    abstractC0844t3 = abstractC0844t5;
                    while (abstractC0844t3 != null) {
                        if (abstractC0844t3 instanceof C0826c) {
                            c28655q.m87150e0(-765031431);
                            c2314t2 = c2314t;
                            int i25 = i16 >> 3;
                            m101933I((C0826c) abstractC0844t3, enumC32593c5.next(), c21054m2, c40819i1, c32588b5, c28655q, (i25 & 57344) | (i25 & 896) | (C21054m.f79836p << 6) | (i25 & 7168), 0);
                            c28655q.m87173q(false);
                        } else {
                            c2314t2 = c2314t;
                            if (abstractC0844t3 instanceof C0846v) {
                                c28655q.m87150e0(-765027816);
                                int i26 = i16 >> 3;
                                m101942R((C0846v) abstractC0844t3, enumC32685v4.next(), c21054m, c40819i0, c32588b5, c28655q, (C21054m.f79836p << 6) | (i26 & 896) | (i26 & 7168) | (i26 & 57344), 0);
                                c28655q.m87173q(false);
                            } else {
                                c32588b5 = c32588b5;
                                c28655q.m87150e0(2054044309);
                                C28655q c28655q2 = c28655q;
                                abstractC0844t4 = abstractC0844t3;
                                interfaceC4353o2.invoke(C23016z.f90757a, abstractC0844t4, Integer.valueOf(m101968i0(abstractC0842r, abstractC0844t2)), c28655q2, Integer.valueOf(((i16 >> 9) & 7168) | 6));
                                c28655q = c28655q2;
                                c28655q.m87173q(false);
                            }
                            abstractC0844t3 = abstractC0844t4.f3042e;
                            c21054m2 = c21054m;
                            c40819i1 = c40819i0;
                            interfaceC4353o2 = interfaceC4353o;
                            c32588b5 = c32588b5;
                            c2314t = c2314t2;
                        }
                        abstractC0844t4 = abstractC0844t3;
                        abstractC0844t3 = abstractC0844t4.f3042e;
                        c21054m2 = c21054m;
                        c40819i1 = c40819i0;
                        interfaceC4353o2 = interfaceC4353o;
                        c32588b5 = c32588b5;
                        c2314t = c2314t2;
                    }
                    z15 = false;
                    c28655q.m87173q(false);
                    abstractC0844t2 = abstractC0844t2.f3042e;
                    c21054m2 = c21054m;
                    c40819i1 = c40819i0;
                    interfaceC4353o2 = interfaceC4353o;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                enumC32593c4 = enumC32593c5;
                enumC32685v3 = enumC32685v4;
            } else {
                c28655q.m87138X();
                enumC32593c4 = enumC32593c3;
                enumC32685v3 = enumC32685v2;
                c32588b5 = c32588b4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(abstractC0842r, enumC32593c4, enumC32685v3, c21054m, c40819i0, c32588b5, interfaceC4353o, i13, i14, 17);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        c32588b4 = c32588b3;
        if ((1572864 & i13) == 0) {
            interfaceC4353o2 = interfaceC4353o;
            if (c28655q.m87157i(interfaceC4353o2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i15 |= i17;
        } else {
            interfaceC4353o2 = interfaceC4353o;
        }
        i16 = i15;
        if ((599187 & i16) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i18 != 0) {
                enumC32593c5 = EnumC32593c3.DOT;
            } else {
                enumC32593c5 = enumC32593c3;
            }
            if (i19 != 0) {
                enumC32685v4 = EnumC32685v2.NUMBERS;
            } else {
                enumC32685v4 = enumC32685v2;
            }
            if (i24 != 0) {
                c32588b5 = null;
            } else {
                c32588b5 = c32588b4;
            }
            abstractC0844t = abstractC0842r.f3039b;
            if ((abstractC0844t != null ? abstractC0844t.f3042e : null) == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            AbstractC0822a abstractC0822a3 = (AbstractC0822a) abstractC0842r.f3038a;
            z14 = abstractC0822a3 instanceof C0831g;
            if (z14) {
                f13 = 0;
            } else {
                f13 = 0;
            }
            float f16 = f13;
            if (z14) {
                listIndent = c40819i1.getListIndent();
            } else {
                listIndent = c40819i1.getListIndent();
            }
            float f17 = listIndent;
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t4, f17, 0.0f, 0.0f, f16, 6);
            c2314t = c2314t4;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            abstractC0844t2 = abstractC0842r.f3039b;
            c28655q.m87150e0(-765042546);
            z15 = true;
            while (abstractC0844t2 != null) {
                if (z15) {
                    abstractC0822a = (AbstractC0822a) abstractC0842r.f3038a;
                    if (abstractC0822a instanceof C0831g) {
                    }
                    c28655q.m87150e0(2053588981);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(c40819i1.m132328r(), c2314t));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2053679315);
                    c28655q.m87173q(false);
                }
                AbstractC0844t abstractC0844t6 = abstractC0844t2.f3039b;
                c28655q.m87150e0(-765033949);
                abstractC0844t3 = abstractC0844t6;
                while (abstractC0844t3 != null) {
                    if (abstractC0844t3 instanceof C0826c) {
                        c28655q.m87150e0(-765031431);
                        c2314t2 = c2314t;
                        int i27 = i16 >> 3;
                        m101933I((C0826c) abstractC0844t3, enumC32593c5.next(), c21054m2, c40819i1, c32588b5, c28655q, (i27 & 57344) | (i27 & 896) | (C21054m.f79836p << 6) | (i27 & 7168), 0);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        if (abstractC0844t3 instanceof C0846v) {
                            c28655q.m87150e0(-765027816);
                            int i28 = i16 >> 3;
                            m101942R((C0846v) abstractC0844t3, enumC32685v4.next(), c21054m, c40819i0, c32588b5, c28655q, (C21054m.f79836p << 6) | (i28 & 896) | (i28 & 7168) | (i28 & 57344), 0);
                            c28655q.m87173q(false);
                        } else {
                            c32588b5 = c32588b5;
                            c28655q.m87150e0(2054044309);
                            C28655q c28655q3 = c28655q;
                            abstractC0844t4 = abstractC0844t3;
                            interfaceC4353o2.invoke(C23016z.f90757a, abstractC0844t4, Integer.valueOf(m101968i0(abstractC0842r, abstractC0844t2)), c28655q3, Integer.valueOf(((i16 >> 9) & 7168) | 6));
                            c28655q = c28655q3;
                            c28655q.m87173q(false);
                        }
                        abstractC0844t3 = abstractC0844t4.f3042e;
                        c21054m2 = c21054m;
                        c40819i1 = c40819i0;
                        interfaceC4353o2 = interfaceC4353o;
                        c32588b5 = c32588b5;
                        c2314t = c2314t2;
                    }
                    abstractC0844t4 = abstractC0844t3;
                    abstractC0844t3 = abstractC0844t4.f3042e;
                    c21054m2 = c21054m;
                    c40819i1 = c40819i0;
                    interfaceC4353o2 = interfaceC4353o;
                    c32588b5 = c32588b5;
                    c2314t = c2314t2;
                }
                z15 = false;
                c28655q.m87173q(false);
                abstractC0844t2 = abstractC0844t2.f3042e;
                c21054m2 = c21054m;
                c40819i1 = c40819i0;
                interfaceC4353o2 = interfaceC4353o;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            enumC32593c4 = enumC32593c5;
            enumC32685v3 = enumC32685v4;
        } else {
            c28655q.m87138X();
            enumC32593c4 = enumC32593c3;
            enumC32685v3 = enumC32685v2;
            c32588b5 = c32588b4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(abstractC0842r, enumC32593c4, enumC32685v3, c21054m, c40819i0, c32588b5, interfaceC4353o, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m101941Q(AbstractC0842r abstractC0842r, EnumC32593c3 enumC32593c3, EnumC32685v2 enumC32685v2, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, InterfaceC4353o interfaceC4353o, int i13, int i14, Composer composer, int i15) {
        m101940P(abstractC0842r, enumC32593c3, enumC32685v2, c21054m, c40819i0, c32588b3, interfaceC4353o, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x008a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: R */
    private static final void m101942R(C0846v c0846v, EnumC32685v2 enumC32685v2, final C21054m c21054m, final C40819i0 c40819i0, C32588b3 c32588b3, Composer composer, int i13, int i14) {
        int i15;
        C32588b3 c32588b4;
        int i16;
        boolean z4;
        final EnumC32685v2 enumC32685v3;
        C32588b3 c32588b5;
        C28677v1 c28677v1M87180u;
        C32588b3 c32588b6;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-318443166);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c0846v) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC32685v2 == null ? -1 : enumC32685v2.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(c21054m) : c28655q.m87157i(c21054m) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(c40819i0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i14 & 16;
        if (i18 == 0) {
            if ((i13 & 24576) == 0) {
                c32588b4 = c32588b3;
                i15 |= c28655q.m87157i(c32588b4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i15;
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    enumC32685v3 = EnumC32685v2.NUMBERS;
                } else {
                    enumC32685v3 = enumC32685v2;
                }
                if (i18 != 0) {
                    c32588b6 = null;
                } else {
                    c32588b6 = c32588b4;
                }
                final int i19 = c0846v.f3047h - 1;
                final C32588b3 c32588b7 = c32588b6;
                c32588b5 = c32588b7;
                int i24 = i16 << 3;
                m101940P(c0846v, null, enumC32685v3, c21054m, c40819i0, c32588b5, AbstractC37817c.m121344e(705482667, c28655q, new InterfaceC4353o() { // from class: sl0.h2
                    @Override // c93.InterfaceC4353o
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return AbstractC32637l2.m101943S(enumC32685v3, i19, c21054m, c40819i0, c32588b7, (InterfaceC23013y) obj, (AbstractC0844t) obj2, ((Integer) obj3).intValue(), (Composer) obj4, iIntValue);
                    }
                }), c28655q, (i16 & 14) | 1572864 | (i24 & 896) | (C21054m.f79836p << 9) | (i24 & 7168) | (57344 & i24) | (i24 & 458752), 2);
            } else {
                c28655q.m87138X();
                enumC32685v3 = enumC32685v2;
                c32588b5 = c32588b4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(c0846v, enumC32685v3, c21054m, c40819i0, c32588b5, i13, i14, 22);
            }
        }
        i15 |= 24576;
        c32588b4 = c32588b3;
        i16 = i15;
        if ((i16 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                enumC32685v3 = EnumC32685v2.NUMBERS;
            } else {
                enumC32685v3 = enumC32685v2;
            }
            if (i18 != 0) {
                c32588b6 = null;
            } else {
                c32588b6 = c32588b4;
            }
            final int i110 = c0846v.f3047h - 1;
            final C32588b3 c32588b8 = c32588b6;
            c32588b5 = c32588b8;
            int i25 = i16 << 3;
            m101940P(c0846v, null, enumC32685v3, c21054m, c40819i0, c32588b5, AbstractC37817c.m121344e(705482667, c28655q, new InterfaceC4353o() { // from class: sl0.h2
                @Override // c93.InterfaceC4353o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    return AbstractC32637l2.m101943S(enumC32685v3, i110, c21054m, c40819i0, c32588b8, (InterfaceC23013y) obj, (AbstractC0844t) obj2, ((Integer) obj3).intValue(), (Composer) obj4, iIntValue);
                }
            }), c28655q, (i16 & 14) | 1572864 | (i25 & 896) | (C21054m.f79836p << 9) | (i25 & 7168) | (57344 & i25) | (i25 & 458752), 2);
        } else {
            c28655q.m87138X();
            enumC32685v3 = enumC32685v2;
            c32588b5 = c32588b4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(c0846v, enumC32685v3, c21054m, c40819i0, c32588b5, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m101943S(EnumC32685v2 enumC32685v2, int i13, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, InterfaceC23013y MarkdownListItems, AbstractC0844t node, int i14, Composer composer, int i15) {
        AbstractC22676k.m65750j(MarkdownListItems, "$this$MarkdownListItems");
        AbstractC22676k.m65750j(node, "node");
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, composer, 48);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c22994r1M66759a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        m101947W(AbstractC1102d.m3424u(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo738l(c21054m.getTextStyle().f92256b.f92106c), new WithAlignmentLineElement(AbstractC39083d.f168140a)), new C23254g(AbstractC32642m2.m102014a(enumC32685v2, i14 + i13)), c21054m.getTextStyle(), c21054m.getTextColor(), composer, 0, 0);
        c28655q.m87150e0(1608826725);
        C23248d c23248d = new C23248d();
        c23248d.m67308j(c21054m.getTextStyle().f92255a);
        m101980r(node, c23248d, c21054m, c40819i0, c32588b3, composer, ((i15 >> 3) & 14) | 64 | (C21054m.f79836p << 6), 0);
        c23248d.m67303e();
        C23254g c23254gM67309k = c23248d.m67309k();
        c28655q.m87173q(false);
        m101947W(c2314t, c23254gM67309k, c21054m.getTextStyle(), c21054m.getTextColor(), composer, 6, 0);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m101944T(C0846v c0846v, EnumC32685v2 enumC32685v2, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, int i13, int i14, Composer composer, int i15) {
        m101942R(c0846v, enumC32685v2, c21054m, c40819i0, c32588b3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: U */
    private static final void m101945U(C0847w c0847w, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, Composer composer, int i13, int i14) {
        int i15;
        C40819i0 c40819i1;
        C32588b3 c32588b4;
        boolean z4;
        C32588b3 c32588b5;
        C28677v1 c28677v1M87180u;
        C32588b3 c32588b6;
        float fM132328r;
        float fM132327q;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1602011061);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c0847w) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c21054m) : c28655q.m87157i(c21054m) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            c40819i1 = c40819i0;
            i15 |= c28655q.m87153g(c40819i1) ? 256 : 128;
        } else {
            c40819i1 = c40819i0;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                c32588b4 = c32588b3;
                i15 |= c28655q.m87157i(c32588b4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    c32588b6 = null;
                } else {
                    c32588b6 = c32588b4;
                }
                if (c0847w.f3041d instanceof C0847w) {
                    fM132328r = c40819i1.m132328r();
                } else {
                    fM132328r = 0;
                }
                float f13 = fM132328r;
                if (c0847w.f3042e instanceof C0847w) {
                    fM132327q = c40819i1.m132327q();
                } else {
                    fM132327q = 0;
                }
                float f14 = fM132327q;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, f14, 5);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(-100856774);
                int i17 = i15;
                C23248d c23248d = new C23248d();
                c23248d.m67308j(c21054m.getTextStyle().f92255a);
                int i18 = (i17 & 14) | 64 | (C21054m.f79836p << 6);
                int i19 = i17 << 3;
                m101980r(c0847w, c23248d, c21054m, c40819i1, c32588b6, c28655q, (i19 & 57344) | i18 | (i19 & 896) | (i19 & 7168), 0);
                c23248d.m67303e();
                C23254g c23254gM67309k = c23248d.m67309k();
                c28655q.m87173q(false);
                m101947W(c2314t, c23254gM67309k, c21054m.getTextStyle(), c21054m.getTextColor(), c28655q, 6, 0);
                c28655q.m87173q(true);
                c32588b5 = c32588b6;
            } else {
                c28655q.m87138X();
                c32588b5 = c32588b4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(c0847w, c21054m, c40819i0, c32588b5, i13, i14, 0);
            }
        }
        i15 |= 3072;
        c32588b4 = c32588b3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                c32588b6 = null;
            } else {
                c32588b6 = c32588b4;
            }
            if (c0847w.f3041d instanceof C0847w) {
                fM132328r = c40819i1.m132328r();
            } else {
                fM132328r = 0;
            }
            float f15 = fM132328r;
            if (c0847w.f3042e instanceof C0847w) {
                fM132327q = c40819i1.m132327q();
            } else {
                fM132327q = 0;
            }
            float f16 = fM132327q;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, f15, 0.0f, f16, 5);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
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
            c28655q.m87150e0(-100856774);
            int i110 = i15;
            C23248d c23248d2 = new C23248d();
            c23248d2.m67308j(c21054m.getTextStyle().f92255a);
            int i111 = (i110 & 14) | 64 | (C21054m.f79836p << 6);
            int i112 = i110 << 3;
            m101980r(c0847w, c23248d2, c21054m, c40819i1, c32588b6, c28655q, (i112 & 57344) | i111 | (i112 & 896) | (i112 & 7168), 0);
            c23248d2.m67303e();
            C23254g c23254gM67309k2 = c23248d2.m67309k();
            c28655q.m87173q(false);
            m101947W(c2314t2, c23254gM67309k2, c21054m.getTextStyle(), c21054m.getTextColor(), c28655q, 6, 0);
            c28655q.m87173q(true);
            c32588b5 = c32588b6;
        } else {
            c28655q.m87138X();
            c32588b5 = c32588b4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(c0847w, c21054m, c40819i0, c32588b5, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m101946V(C0847w c0847w, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, int i13, int i14, Composer composer, int i15) {
        m101945U(c0847w, c21054m, c40819i0, c32588b3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private static final void m101947W(Modifier modifier, C23254g c23254g, C23285v0 c23285v0, long j7, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(808070586);
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
            i15 |= c28655q2.m87153g(c23254g) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(c23285v0) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            InterfaceC2355b3 interfaceC2355b3 = (InterfaceC2355b3) c28655q2.m87161k(AbstractC2453v1.f9579r);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM87157i = c28655q2.m87157i(interfaceC2355b3) | ((i15 & 112) == 32);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(interfaceC28601c1, c23254g, interfaceC2355b3);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierMo3471e = AbstractC34452c0.m108903b(c2314t, c23254g, (PointerInputEventHandler) objM87133R2).mo3471e(modifier4);
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C32614h(5, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q = c28655q2;
            AbstractC15011f9.m43115c(c23254g, modifierMo3471e, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (Function1) objM87133R3, c23285v0, c28655q, (i15 >> 3) & 910, ((i15 << 15) & 29360128) | 1572864, 65528);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11162c(modifier3, c23254g, c23285v0, j7, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m101948X(InterfaceC28601c1 interfaceC28601c1, C23277r0 it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m101949Y(Modifier modifier, C23254g c23254g, C23285v0 c23285v0, long j7, int i13, int i14, Composer composer, int i15) {
        m101947W(modifier, c23254g, c23285v0, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private static final void m101950Z(C40819i0 c40819i0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-406529313);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c40819i0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(c40819i0.getDividerHeight(), AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, c40819i0.getDividerMarginTop(), 0.0f, c40819i0.getDividerMarginBottom(), 5))), C17919x.m51541c(c40819i0.getDividerOpacity(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite()), AbstractC17918w0.f69621a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c40819i0, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m101952a0(C40819i0 c40819i0, int i13, Composer composer, int i14) {
        m101950Z(c40819i0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    private static final void m101966h0(C23248d c23248d, String str, C32588b3 c32588b3) {
        if (c32588b3 != null) {
            c32588b3.m101644a(c23248d, str);
        } else {
            c23248d.m67300b(str);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private static final int m101968i0(AbstractC0844t abstractC0844t, AbstractC0844t abstractC0844t2) {
        AbstractC0844t abstractC0844t3;
        if (abstractC0844t2 == null || (abstractC0844t3 = abstractC0844t.f3039b) == null) {
            return -1;
        }
        int i13 = 0;
        while (abstractC0844t3 != abstractC0844t2) {
            i13++;
            abstractC0844t3 = abstractC0844t3.f3042e;
            if (abstractC0844t3 == null) {
                return -1;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m101970j0(AbstractC0844t abstractC0844t) {
        AbstractC22676k.m65750j(abstractC0844t, "<this>");
        C22665e0 c22665e0 = new C22665e0();
        m101972k0(c22665e0, abstractC0844t.f3039b);
        return c22665e0.f89334w;
    }

    /* JADX INFO: renamed from: k0 */
    private static final void m101972k0(C22665e0 c22665e0, AbstractC0844t abstractC0844t) {
        while (abstractC0844t != null) {
            if (abstractC0844t instanceof C0823a0) {
                c22665e0.f89334w = ((C0823a0) abstractC0844t).f3019g.length() + c22665e0.f89334w;
            } else if (abstractC0844t instanceof C0828d) {
                c22665e0.f89334w = ((C0828d) abstractC0844t).f3021g.length() + c22665e0.f89334w;
            } else if (abstractC0844t instanceof C0834j) {
                c22665e0.f89334w++;
            } else if ((abstractC0844t instanceof C0837m) && AbstractC22676k.m65745e(((C0837m) abstractC0844t).f3028g, "<br/>")) {
                c22665e0.f89334w++;
            }
            m101972k0(c22665e0, abstractC0844t.f3039b);
            abstractC0844t = abstractC0844t.f3042e;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final float m101974l0(int i13, int i14, float f13) {
        int i15;
        if (i14 <= 1 || i13 >= (i15 = i14 - 1)) {
            return 1.0f;
        }
        return i13 <= 0 ? f13 : AbstractC2875y.m8288a(1.0f, f13, i13 / i15, f13);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x030d  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x0173  */
    /* JADX WARN: Code duplicated, block: B:75:0x0177  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0208  */
    /* JADX WARN: Code duplicated, block: B:81:0x020e  */
    /* JADX WARN: Code duplicated, block: B:82:0x023e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0242  */
    /* JADX WARN: Code duplicated, block: B:86:0x024e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0253  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:98:0x0303  */
    /* JADX INFO: renamed from: r */
    private static final void m101980r(AbstractC0844t abstractC0844t, C23248d c23248d, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, Composer composer, int i13, int i14) {
        int i15;
        C40819i0 c40819i1;
        C32588b3 c32588b4;
        int i16;
        boolean z4;
        C32588b3 c32588b5;
        C28677v1 c28677v1M87180u;
        C32588b3 c32588b6;
        AbstractC0844t abstractC0844t2;
        boolean z13;
        C28782t c28782t;
        C36776l c36776l;
        C23248d c23248d2 = c23248d;
        C21054m c21054m2 = c21054m;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-81243527);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(abstractC0844t) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c23248d2) : c28655q.m87157i(c23248d2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(c21054m2) : c28655q.m87157i(c21054m2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            c40819i1 = c40819i0;
            i15 |= c28655q.m87153g(c40819i1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            c40819i1 = c40819i0;
        }
        int i17 = i14 & 16;
        if (i17 == 0) {
            if ((i13 & 24576) == 0) {
                c32588b4 = c32588b3;
                i15 |= c28655q.m87157i(c32588b4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i15;
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    c32588b6 = null;
                } else {
                    c32588b6 = c32588b4;
                }
                abstractC0844t2 = abstractC0844t.f3039b;
                while (abstractC0844t2 != null) {
                    if (abstractC0844t2 instanceof C0824b) {
                        c28655q.m87150e0(2035941580);
                        m101980r(abstractC0844t2, c23248d2, c21054m2, c40819i1, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (57344 & i16), 0);
                        c28655q.m87173q(false);
                        c23248d2 = c23248d;
                    } else if (abstractC0844t2 instanceof C0847w) {
                        c28655q.m87150e0(-765604554);
                        c23248d2 = c23248d;
                        m101980r(abstractC0844t2, c23248d2, c21054m, c40819i0, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                        c28655q.m87173q(false);
                    } else {
                        c23248d2 = c23248d;
                        if (abstractC0844t2 instanceof C0823a0) {
                            c28655q.m87150e0(-765601316);
                            c28655q.m87173q(false);
                            String str = ((C0823a0) abstractC0844t2).f3019g;
                            AbstractC22676k.m65749i(str, "getLiteral(...)");
                            m101966h0(c23248d2, str, c32588b6);
                        } else if (abstractC0844t2 instanceof C0832h) {
                            c28655q.m87150e0(2036235553);
                            c23248d2.m67308j(new C23267m0(c21054m.getEmphasisColor(), 0L, (C28780r) null, new C28776n(c21054m.getEmphasisFontStyle()), (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65526));
                            m101980r(abstractC0844t2, c23248d2, c21054m, c40819i0, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                            c23248d2.m67303e();
                            c28655q.m87173q(false);
                        } else if (abstractC0844t2 instanceof C0850z) {
                            c28655q.m87150e0(2036627827);
                            c23248d2.m67308j(new C23267m0(c21054m.getStrongEmphasisColor(), 0L, c21054m.getStrongEmphasisFontWeight(), (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65530));
                            m101980r(abstractC0844t2, c23248d2, c21054m, c40819i0, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                            c23248d2.m67303e();
                            c28655q.m87173q(false);
                        } else {
                            z13 = abstractC0844t2 instanceof C0828d;
                            c28782t = AbstractC28771i.f116522z;
                            if (z13) {
                                c28655q.m87150e0(2037018954);
                                c28655q.m87173q(false);
                                c23248d2.m67308j(new C23285v0(0L, 0L, null, null, c28782t, 0L, null, null, 0, 0L, 16777183).f92255a);
                                String str2 = ((C0828d) abstractC0844t2).f3021g;
                                AbstractC22676k.m65749i(str2, "getLiteral(...)");
                                m101966h0(c23248d2, str2, c32588b6);
                                c23248d2.m67303e();
                            } else if (abstractC0844t2 instanceof C0834j) {
                                c28655q.m87150e0(2037273619);
                                c28655q.m87173q(false);
                                c23248d2.m67308j(new C23285v0(0L, 0L, null, null, c28782t, 0L, null, null, 0, 0L, 16777183).f92255a);
                                m101966h0(c23248d2, "\n", c32588b6);
                                c23248d2.m67303e();
                            } else if (abstractC0844t2 instanceof C0840p) {
                                c28655q.m87150e0(2037521929);
                                if (c40819i0.getLinkUnderline()) {
                                    c36776l = C36776l.f157352c;
                                } else {
                                    c36776l = C36776l.f157351b;
                                }
                                c23248d2.m67308j(new C23267m0(c21054m.getLinkColor(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, c36776l, (C17924z0) null, 61438));
                                String str3 = ((C0840p) abstractC0844t2).f3032g;
                                AbstractC22676k.m65749i(str3, "getDestination(...)");
                                c23248d2.m67306h(QueryParams.URL, str3);
                                m101980r(abstractC0844t2, c23248d2, c21054m, c40819i0, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                                c23248d2.m67303e();
                                c23248d2.m67303e();
                                c28655q.m87173q(false);
                            } else if (abstractC0844t2 instanceof C0837m) {
                                c28655q.m87150e0(2038136814);
                                c28655q.m87173q(false);
                                if (AbstractC22676k.m65745e(((C0837m) abstractC0844t2).f3028g, "<br/>")) {
                                    c23248d2.m67308j(new C23285v0(0L, 0L, null, null, c28782t, 0L, null, null, 0, 0L, 16777183).f92255a);
                                    m101966h0(c23248d2, "\n", c32588b6);
                                    c23248d2.m67303e();
                                }
                            } else {
                                c28655q.m87150e0(2038586345);
                                c28655q.m87173q(false);
                            }
                        }
                    }
                    abstractC0844t2 = abstractC0844t2.f3042e;
                    c21054m2 = c21054m;
                    c40819i1 = c40819i0;
                }
                c32588b5 = c32588b6;
            } else {
                c28655q.m87138X();
                c32588b5 = c32588b4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(abstractC0844t, c23248d2, c21054m, c40819i0, c32588b5, i13, i14, 21);
            }
        }
        i15 |= 24576;
        c32588b4 = c32588b3;
        i16 = i15;
        if ((i16 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                c32588b6 = null;
            } else {
                c32588b6 = c32588b4;
            }
            abstractC0844t2 = abstractC0844t.f3039b;
            while (abstractC0844t2 != null) {
                if (abstractC0844t2 instanceof C0824b) {
                    c28655q.m87150e0(2035941580);
                    m101980r(abstractC0844t2, c23248d2, c21054m2, c40819i1, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (57344 & i16), 0);
                    c28655q.m87173q(false);
                    c23248d2 = c23248d;
                } else if (abstractC0844t2 instanceof C0847w) {
                    c28655q.m87150e0(-765604554);
                    c23248d2 = c23248d;
                    m101980r(abstractC0844t2, c23248d2, c21054m, c40819i0, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                    c28655q.m87173q(false);
                } else {
                    c23248d2 = c23248d;
                    if (abstractC0844t2 instanceof C0823a0) {
                        c28655q.m87150e0(-765601316);
                        c28655q.m87173q(false);
                        String str4 = ((C0823a0) abstractC0844t2).f3019g;
                        AbstractC22676k.m65749i(str4, "getLiteral(...)");
                        m101966h0(c23248d2, str4, c32588b6);
                    } else if (abstractC0844t2 instanceof C0832h) {
                        c28655q.m87150e0(2036235553);
                        c23248d2.m67308j(new C23267m0(c21054m.getEmphasisColor(), 0L, (C28780r) null, new C28776n(c21054m.getEmphasisFontStyle()), (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65526));
                        m101980r(abstractC0844t2, c23248d2, c21054m, c40819i0, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                        c23248d2.m67303e();
                        c28655q.m87173q(false);
                    } else if (abstractC0844t2 instanceof C0850z) {
                        c28655q.m87150e0(2036627827);
                        c23248d2.m67308j(new C23267m0(c21054m.getStrongEmphasisColor(), 0L, c21054m.getStrongEmphasisFontWeight(), (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65530));
                        m101980r(abstractC0844t2, c23248d2, c21054m, c40819i0, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                        c23248d2.m67303e();
                        c28655q.m87173q(false);
                    } else {
                        z13 = abstractC0844t2 instanceof C0828d;
                        c28782t = AbstractC28771i.f116522z;
                        if (z13) {
                            c28655q.m87150e0(2037018954);
                            c28655q.m87173q(false);
                            c23248d2.m67308j(new C23285v0(0L, 0L, null, null, c28782t, 0L, null, null, 0, 0L, 16777183).f92255a);
                            String str5 = ((C0828d) abstractC0844t2).f3021g;
                            AbstractC22676k.m65749i(str5, "getLiteral(...)");
                            m101966h0(c23248d2, str5, c32588b6);
                            c23248d2.m67303e();
                        } else if (abstractC0844t2 instanceof C0834j) {
                            c28655q.m87150e0(2037273619);
                            c28655q.m87173q(false);
                            c23248d2.m67308j(new C23285v0(0L, 0L, null, null, c28782t, 0L, null, null, 0, 0L, 16777183).f92255a);
                            m101966h0(c23248d2, "\n", c32588b6);
                            c23248d2.m67303e();
                        } else if (abstractC0844t2 instanceof C0840p) {
                            c28655q.m87150e0(2037521929);
                            if (c40819i0.getLinkUnderline()) {
                                c36776l = C36776l.f157352c;
                            } else {
                                c36776l = C36776l.f157351b;
                            }
                            c23248d2.m67308j(new C23267m0(c21054m.getLinkColor(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, c36776l, (C17924z0) null, 61438));
                            String str6 = ((C0840p) abstractC0844t2).f3032g;
                            AbstractC22676k.m65749i(str6, "getDestination(...)");
                            c23248d2.m67306h(QueryParams.URL, str6);
                            m101980r(abstractC0844t2, c23248d2, c21054m, c40819i0, c32588b6, c28655q, (i16 & 112) | 64 | (C21054m.f79836p << 6) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                            c23248d2.m67303e();
                            c23248d2.m67303e();
                            c28655q.m87173q(false);
                        } else if (abstractC0844t2 instanceof C0837m) {
                            c28655q.m87150e0(2038136814);
                            c28655q.m87173q(false);
                            if (AbstractC22676k.m65745e(((C0837m) abstractC0844t2).f3028g, "<br/>")) {
                                c23248d2.m67308j(new C23285v0(0L, 0L, null, null, c28782t, 0L, null, null, 0, 0L, 16777183).f92255a);
                                m101966h0(c23248d2, "\n", c32588b6);
                                c23248d2.m67303e();
                            }
                        } else {
                            c28655q.m87150e0(2038586345);
                            c28655q.m87173q(false);
                        }
                    }
                }
                abstractC0844t2 = abstractC0844t2.f3042e;
                c21054m2 = c21054m;
                c40819i1 = c40819i0;
            }
            c32588b5 = c32588b6;
        } else {
            c28655q.m87138X();
            c32588b5 = c32588b4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(abstractC0844t, c23248d2, c21054m, c40819i0, c32588b5, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m101981s(AbstractC0844t abstractC0844t, C23248d c23248d, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, int i13, int i14, Composer composer, int i15) {
        m101980r(abstractC0844t, c23248d, c21054m, c40819i0, c32588b3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final void m101982t(AbstractC0844t node, Modifier modifier, C21054m styles, C40819i0 spacing, C32588b3 c32588b3, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C32588b3 c32588b4;
        AbstractC22676k.m65750j(node, "node");
        AbstractC22676k.m65750j(styles, "styles");
        AbstractC22676k.m65750j(spacing, "spacing");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1608546858);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(node) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(styles) : c28655q.m87157i(styles) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(spacing) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i14 & 16;
        if (i17 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(c32588b3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            C32588b3 c32588b5 = i17 != 0 ? null : c32588b3;
            m101936L(node, modifier3, styles, spacing, c32588b5, c28655q, (i15 & 126) | (C21054m.f79836p << 6) | (i15 & 896) | (i15 & 7168) | (i15 & 57344), 0);
            modifier2 = modifier3;
            c32588b4 = c32588b5;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            c32588b4 = c32588b3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32607f2(node, modifier2, styles, spacing, c32588b4, i13, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0185  */
    /* JADX WARN: Code duplicated, block: B:132:0x018c  */
    /* JADX WARN: Code duplicated, block: B:133:0x019a  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:144:0x020d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0214  */
    /* JADX WARN: Code duplicated, block: B:148:0x0243  */
    /* JADX WARN: Code duplicated, block: B:150:0x0247  */
    /* JADX WARN: Code duplicated, block: B:151:0x0249  */
    /* JADX WARN: Code duplicated, block: B:153:0x024d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0253  */
    /* JADX WARN: Code duplicated, block: B:157:0x0265  */
    /* JADX WARN: Code duplicated, block: B:160:0x0271  */
    /* JADX WARN: Code duplicated, block: B:163:0x027e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0281  */
    /* JADX WARN: Code duplicated, block: B:167:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x028b  */
    /* JADX WARN: Code duplicated, block: B:171:0x029c  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:181:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:186:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:189:0x02f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:195:0x031d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x031f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0330  */
    /* JADX WARN: Code duplicated, block: B:200:0x0350  */
    /* JADX WARN: Code duplicated, block: B:203:0x0385  */
    /* JADX WARN: Code duplicated, block: B:206:0x039f  */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    /* JADX INFO: renamed from: u */
    public static final void m101983u(String markdown, Modifier modifier, C3203b c3203b, boolean z4, boolean z13, boolean z14, C21054m c21054m, C40819i0 c40819i0, boolean z15, Function1 function1, Composer composer, final int i13, final int i14) {
        int i15;
        Modifier modifier2;
        C3203b c3203b2;
        int i16;
        boolean z16;
        int i17;
        int i18;
        boolean z17;
        int i19;
        int i24;
        boolean z18;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        boolean z19;
        final String str;
        C28655q c28655q;
        final C40819i0 c40819i1;
        final Modifier modifier3;
        final C3203b c3203b3;
        final boolean z24;
        final boolean z25;
        final C21054m c21054m2;
        final boolean z26;
        final Function1 function2;
        final boolean z27;
        C28677v1 c28677v1M87180u;
        int i35;
        C28676v0 c28676v0;
        C3203b c3203b4;
        boolean z28;
        C28655q c28655q2;
        C21054m c21054mM58880a;
        C40819i0 c40819i2;
        boolean z29;
        Function1 function3;
        Object objM87133R;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        int i36;
        Function1 function4;
        boolean z34;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        C21054m c21054m3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean zM87153g;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c5;
        AbstractC0844t abstractC0844tM9251a;
        C32588b3 c32588b3;
        int i37;
        boolean zM87157i;
        AbstractC22676k.m65750j(markdown, "markdown");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-530857451);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87153g(markdown) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i38 = i14 & 2;
        if (i38 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q3.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if ((i14 & 4) == 0) {
                    c3203b2 = c3203b;
                    int i39 = c28655q3.m87157i(c3203b2) ? 256 : 128;
                    i15 |= i39;
                } else {
                    c3203b2 = c3203b;
                }
                i15 |= i39;
            } else {
                c3203b2 = c3203b;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z16 = z4;
                    if (c28655q3.m87155h(z16)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        z17 = z13;
                        if (c28655q3.m87155h(z17)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        z18 = z14;
                    } else {
                        z18 = z14;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q3.m87155h(z18)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                    }
                    if ((i13 & 1572864) == 0) {
                        if ((i14 & 64) != 0) {
                            i37 = 524288;
                        } else {
                            if ((i13 & 2097152) == 0) {
                                zM87157i = c28655q3.m87153g(c21054m);
                            } else {
                                zM87157i = c28655q3.m87157i(c21054m);
                            }
                            if (zM87157i) {
                                i37 = 1048576;
                            } else {
                                i37 = 524288;
                            }
                        }
                        i15 |= i37;
                    }
                    if ((i13 & 12582912) != 0) {
                        i15 |= ((i14 & 128) == 0 || !c28655q3.m87153g(c40819i0)) ? 4194304 : 8388608;
                    }
                    i26 = i14 & 256;
                    if (i26 != 0) {
                        i15 |= 100663296;
                        i27 = i26;
                    } else {
                        i27 = i26;
                        if ((i13 & 100663296) == 0) {
                            if (c28655q3.m87155h(z15)) {
                                i28 = 67108864;
                            } else {
                                i28 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i28;
                        }
                    }
                    i29 = i14 & 512;
                    if (i29 != 0) {
                        i15 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c28655q3.m87157i(function1)) {
                            i34 = 536870912;
                        } else {
                            i34 = 268435456;
                        }
                        i15 |= i34;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q3.m87135U(i15 & 1, z19)) {
                        c28655q3.m87140Z();
                        i35 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i35 != 0 || c28655q3.m87118C()) {
                            if (i38 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if ((i14 & 4) != 0) {
                                c3203b4 = new C3203b(new C0684i0(1));
                                i15 &= -897;
                            } else {
                                c3203b4 = c3203b2;
                            }
                            if (i16 != 0) {
                                z16 = true;
                            }
                            if (i18 != 0) {
                                z28 = false;
                            } else {
                                z28 = z17;
                            }
                            if (i24 != 0) {
                                z18 = false;
                            }
                            if ((i14 & 64) != 0) {
                                C21053l c21053l = C21053l.f79834a;
                                C38072d c38072d = C38072d.f163053a;
                                int i44 = C38072d.f163054b;
                                c21054mM58880a = c21053l.m58880a(C23285v0.m67364b(c38072d.m121952e(c28655q3, i44).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d.m121949b(c28655q3, i44).getWhite70(), c38072d.m121949b(c28655q3, i44).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                                c28655q2 = c28655q3;
                                i15 &= -3670017;
                            } else {
                                c28655q2 = c28655q3;
                                c21054mM58880a = c21054m;
                            }
                            if ((i14 & 128) != 0) {
                                c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                                i15 &= -29360129;
                            } else {
                                c40819i2 = c40819i0;
                            }
                            if (i27 != 0) {
                                z29 = false;
                            } else {
                                z29 = z15;
                            }
                            if (i29 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C32375n(27);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                Function1 function5 = (Function1) objM87133R;
                                z17 = z28;
                                function3 = function5;
                            } else {
                                z17 = z28;
                                function3 = function1;
                            }
                        } else {
                            c28655q3.m87138X();
                            if ((i14 & 4) != 0) {
                                i15 &= -897;
                            }
                            if ((i14 & 64) != 0) {
                                i15 &= -3670017;
                            }
                            if ((i14 & 128) != 0) {
                                i15 &= -29360129;
                            }
                            c40819i2 = c40819i0;
                            z29 = z15;
                            function3 = function1;
                            c3203b4 = c3203b2;
                            c28655q2 = c28655q3;
                            c21054mM58880a = c21054m;
                        }
                        c28655q2.m87175r();
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        i36 = i15 & 14;
                        function4 = function3;
                        if (i36 == 4) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        objM87133R3 = c28655q2.m87133R();
                        if (z34 || objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(markdown);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        c21054m3 = c21054mM58880a;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(m101926B(interfaceC28601c2));
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                        Modifier modifier4 = modifier2;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC31061c.m95647w(z16, c28655q2);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                        Boolean boolValueOf = Boolean.valueOf(m101985w(interfaceC28601c4));
                        z35 = z29;
                        boolean z38 = z18;
                        if ((i15 & 1879048192) == 536870912) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        if (i36 == 4) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        zM87153g = z37 | z36 | c28655q2.m87153g(interfaceC28601c2) | ((i15 & 7168) == 2048);
                        objM87133R6 = c28655q2.m87133R();
                        if (!zM87153g || objM87133R6 == c28676v0) {
                            objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                            str = markdown;
                            interfaceC28601c5 = interfaceC28601c2;
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            str = markdown;
                            interfaceC28601c5 = interfaceC28601c2;
                        }
                        AbstractC28683x.m87254h(str, boolValueOf, (InterfaceC4351m) objM87133R6, c28655q2);
                        if (z17 || !z38) {
                            m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                        }
                        abstractC0844tM9251a = c3203b4.m9251a(m101928D(interfaceC28601c3));
                        if (z35) {
                            c32588b3 = new C32588b3(m101970j0(abstractC0844tM9251a), 8, 0.12f, c21054m3.getTextColor(), null);
                        } else {
                            c32588b3 = null;
                        }
                        int i45 = (i15 & 112) | (C21054m.f79836p << 6);
                        int i46 = i15 >> 12;
                        C28655q c28655q4 = c28655q2;
                        m101982t(abstractC0844tM9251a, modifier4, c21054m3, c40819i2, c32588b3, c28655q4, (i46 & 7168) | i45 | (i46 & 896), 0);
                        c28655q = c28655q4;
                        c21054m2 = c21054m3;
                        c3203b3 = c3203b4;
                        z25 = z16;
                        c40819i1 = c40819i2;
                        modifier3 = modifier4;
                        z24 = z38;
                        z26 = z35;
                        function2 = function4;
                    } else {
                        str = markdown;
                        c28655q = c28655q3;
                        c28655q.m87138X();
                        c40819i1 = c40819i0;
                        modifier3 = modifier2;
                        c3203b3 = c3203b2;
                        z24 = z18;
                        z25 = z16;
                        c21054m2 = c21054m;
                        z26 = z15;
                        function2 = function1;
                    }
                    z27 = z17;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.g2
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                return AbstractC32637l2.m101986x(str, modifier3, c3203b3, z25, z27, z24, c21054m2, c40819i1, z26, function2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        };
                    }
                }
                i15 |= 24576;
                z17 = z13;
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    z18 = z14;
                } else {
                    z18 = z14;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87155h(z18)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 1572864) == 0) {
                    if ((i14 & 64) != 0) {
                        i37 = 524288;
                    } else {
                        if ((i13 & 2097152) == 0) {
                            zM87157i = c28655q3.m87153g(c21054m);
                        } else {
                            zM87157i = c28655q3.m87157i(c21054m);
                        }
                        if (zM87157i) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                    }
                    i15 |= i37;
                }
                if ((i13 & 12582912) != 0) {
                    i15 |= ((i14 & 128) == 0 || !c28655q3.m87153g(c40819i0)) ? 4194304 : 8388608;
                }
                i26 = i14 & 256;
                if (i26 != 0) {
                    i15 |= 100663296;
                    i27 = i26;
                } else {
                    i27 = i26;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q3.m87155h(z15)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i28;
                    }
                }
                i29 = i14 & 512;
                if (i29 != 0) {
                    i15 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q3.m87157i(function1)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i15 |= i34;
                }
                if ((i15 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z19)) {
                    c28655q3.m87140Z();
                    i35 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i14 & 4) != 0) {
                            c3203b4 = new C3203b(new C0684i0(1));
                            i15 &= -897;
                        } else {
                            c3203b4 = c3203b2;
                        }
                        if (i16 != 0) {
                            z16 = true;
                        }
                        if (i18 != 0) {
                            z28 = false;
                        } else {
                            z28 = z17;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if ((i14 & 64) != 0) {
                            C21053l c21053l2 = C21053l.f79834a;
                            C38072d c38072d2 = C38072d.f163053a;
                            int i47 = C38072d.f163054b;
                            c21054mM58880a = c21053l2.m58880a(C23285v0.m67364b(c38072d2.m121952e(c28655q3, i47).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d2.m121949b(c28655q3, i47).getWhite70(), c38072d2.m121949b(c28655q3, i47).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                            c28655q2 = c28655q3;
                            i15 &= -3670017;
                        } else {
                            c28655q2 = c28655q3;
                            c21054mM58880a = c21054m;
                        }
                        if ((i14 & 128) != 0) {
                            c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                            i15 &= -29360129;
                        } else {
                            c40819i2 = c40819i0;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z15;
                        }
                        if (i29 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(27);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function6 = (Function1) objM87133R;
                            z17 = z28;
                            function3 = function6;
                        } else {
                            z17 = z28;
                            function3 = function1;
                        }
                    } else {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i14 & 4) != 0) {
                            c3203b4 = new C3203b(new C0684i0(1));
                            i15 &= -897;
                        } else {
                            c3203b4 = c3203b2;
                        }
                        if (i16 != 0) {
                            z16 = true;
                        }
                        if (i18 != 0) {
                            z28 = false;
                        } else {
                            z28 = z17;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if ((i14 & 64) != 0) {
                            C21053l c21053l3 = C21053l.f79834a;
                            C38072d c38072d3 = C38072d.f163053a;
                            int i48 = C38072d.f163054b;
                            c21054mM58880a = c21053l3.m58880a(C23285v0.m67364b(c38072d3.m121952e(c28655q3, i48).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d3.m121949b(c28655q3, i48).getWhite70(), c38072d3.m121949b(c28655q3, i48).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                            c28655q2 = c28655q3;
                            i15 &= -3670017;
                        } else {
                            c28655q2 = c28655q3;
                            c21054mM58880a = c21054m;
                        }
                        if ((i14 & 128) != 0) {
                            c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                            i15 &= -29360129;
                        } else {
                            c40819i2 = c40819i0;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z15;
                        }
                        if (i29 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(27);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function7 = (Function1) objM87133R;
                            z17 = z28;
                            function3 = function7;
                        } else {
                            z17 = z28;
                            function3 = function1;
                        }
                    }
                    c28655q2.m87175r();
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    i36 = i15 & 14;
                    function4 = function3;
                    if (i36 == 4) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z34) {
                        objM87133R3 = AbstractC28683x.m87272z(markdown);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC28683x.m87272z(markdown);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    c21054m3 = c21054mM58880a;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(m101926B(interfaceC28601c2));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    Modifier modifier5 = modifier2;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC31061c.m95647w(z16, c28655q2);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    Boolean boolValueOf2 = Boolean.valueOf(m101985w(interfaceC28601c4));
                    z35 = z29;
                    boolean z39 = z18;
                    if ((i15 & 1879048192) == 536870912) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    if (i36 == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zM87153g = z37 | z36 | c28655q2.m87153g(interfaceC28601c2) | ((i15 & 7168) == 2048);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                        str = markdown;
                        interfaceC28601c5 = interfaceC28601c2;
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                        str = markdown;
                        interfaceC28601c5 = interfaceC28601c2;
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87254h(str, boolValueOf2, (InterfaceC4351m) objM87133R6, c28655q2);
                    if (z17) {
                        m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                    } else {
                        m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                    }
                    abstractC0844tM9251a = c3203b4.m9251a(m101928D(interfaceC28601c3));
                    if (z35) {
                        c32588b3 = new C32588b3(m101970j0(abstractC0844tM9251a), 8, 0.12f, c21054m3.getTextColor(), null);
                    } else {
                        c32588b3 = null;
                    }
                    int i49 = (i15 & 112) | (C21054m.f79836p << 6);
                    int i410 = i15 >> 12;
                    C28655q c28655q5 = c28655q2;
                    m101982t(abstractC0844tM9251a, modifier5, c21054m3, c40819i2, c32588b3, c28655q5, (i410 & 7168) | i49 | (i410 & 896), 0);
                    c28655q = c28655q5;
                    c21054m2 = c21054m3;
                    c3203b3 = c3203b4;
                    z25 = z16;
                    c40819i1 = c40819i2;
                    modifier3 = modifier5;
                    z24 = z39;
                    z26 = z35;
                    function2 = function4;
                } else {
                    str = markdown;
                    c28655q = c28655q3;
                    c28655q.m87138X();
                    c40819i1 = c40819i0;
                    modifier3 = modifier2;
                    c3203b3 = c3203b2;
                    z24 = z18;
                    z25 = z16;
                    c21054m2 = c21054m;
                    z26 = z15;
                    function2 = function1;
                }
                z27 = z17;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.g2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC32637l2.m101986x(str, modifier3, c3203b3, z25, z27, z24, c21054m2, c40819i1, z26, function2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 3072;
            z16 = z4;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z17 = z13;
                    if (c28655q3.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    z18 = z14;
                } else {
                    z18 = z14;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87155h(z18)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 1572864) == 0) {
                    if ((i14 & 64) != 0) {
                        i37 = 524288;
                    } else {
                        if ((i13 & 2097152) == 0) {
                            zM87157i = c28655q3.m87153g(c21054m);
                        } else {
                            zM87157i = c28655q3.m87157i(c21054m);
                        }
                        if (zM87157i) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                    }
                    i15 |= i37;
                }
                if ((i13 & 12582912) != 0) {
                    i15 |= ((i14 & 128) == 0 || !c28655q3.m87153g(c40819i0)) ? 4194304 : 8388608;
                }
                i26 = i14 & 256;
                if (i26 != 0) {
                    i15 |= 100663296;
                    i27 = i26;
                } else {
                    i27 = i26;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q3.m87155h(z15)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i28;
                    }
                }
                i29 = i14 & 512;
                if (i29 != 0) {
                    i15 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q3.m87157i(function1)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i15 |= i34;
                }
                if ((i15 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z19)) {
                    c28655q3.m87140Z();
                    i35 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i14 & 4) != 0) {
                            c3203b4 = new C3203b(new C0684i0(1));
                            i15 &= -897;
                        } else {
                            c3203b4 = c3203b2;
                        }
                        if (i16 != 0) {
                            z16 = true;
                        }
                        if (i18 != 0) {
                            z28 = false;
                        } else {
                            z28 = z17;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if ((i14 & 64) != 0) {
                            C21053l c21053l4 = C21053l.f79834a;
                            C38072d c38072d4 = C38072d.f163053a;
                            int i411 = C38072d.f163054b;
                            c21054mM58880a = c21053l4.m58880a(C23285v0.m67364b(c38072d4.m121952e(c28655q3, i411).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d4.m121949b(c28655q3, i411).getWhite70(), c38072d4.m121949b(c28655q3, i411).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                            c28655q2 = c28655q3;
                            i15 &= -3670017;
                        } else {
                            c28655q2 = c28655q3;
                            c21054mM58880a = c21054m;
                        }
                        if ((i14 & 128) != 0) {
                            c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                            i15 &= -29360129;
                        } else {
                            c40819i2 = c40819i0;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z15;
                        }
                        if (i29 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(27);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function8 = (Function1) objM87133R;
                            z17 = z28;
                            function3 = function8;
                        } else {
                            z17 = z28;
                            function3 = function1;
                        }
                    } else {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i14 & 4) != 0) {
                            c3203b4 = new C3203b(new C0684i0(1));
                            i15 &= -897;
                        } else {
                            c3203b4 = c3203b2;
                        }
                        if (i16 != 0) {
                            z16 = true;
                        }
                        if (i18 != 0) {
                            z28 = false;
                        } else {
                            z28 = z17;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if ((i14 & 64) != 0) {
                            C21053l c21053l5 = C21053l.f79834a;
                            C38072d c38072d5 = C38072d.f163053a;
                            int i412 = C38072d.f163054b;
                            c21054mM58880a = c21053l5.m58880a(C23285v0.m67364b(c38072d5.m121952e(c28655q3, i412).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d5.m121949b(c28655q3, i412).getWhite70(), c38072d5.m121949b(c28655q3, i412).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                            c28655q2 = c28655q3;
                            i15 &= -3670017;
                        } else {
                            c28655q2 = c28655q3;
                            c21054mM58880a = c21054m;
                        }
                        if ((i14 & 128) != 0) {
                            c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                            i15 &= -29360129;
                        } else {
                            c40819i2 = c40819i0;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z15;
                        }
                        if (i29 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(27);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function9 = (Function1) objM87133R;
                            z17 = z28;
                            function3 = function9;
                        } else {
                            z17 = z28;
                            function3 = function1;
                        }
                    }
                    c28655q2.m87175r();
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    i36 = i15 & 14;
                    function4 = function3;
                    if (i36 == 4) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z34) {
                        objM87133R3 = AbstractC28683x.m87272z(markdown);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC28683x.m87272z(markdown);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    c21054m3 = c21054mM58880a;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(m101926B(interfaceC28601c2));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    Modifier modifier6 = modifier2;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC31061c.m95647w(z16, c28655q2);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    Boolean boolValueOf3 = Boolean.valueOf(m101985w(interfaceC28601c4));
                    z35 = z29;
                    boolean z310 = z18;
                    if ((i15 & 1879048192) == 536870912) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    if (i36 == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zM87153g = z37 | z36 | c28655q2.m87153g(interfaceC28601c2) | ((i15 & 7168) == 2048);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                        str = markdown;
                        interfaceC28601c5 = interfaceC28601c2;
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                        str = markdown;
                        interfaceC28601c5 = interfaceC28601c2;
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87254h(str, boolValueOf3, (InterfaceC4351m) objM87133R6, c28655q2);
                    if (z17) {
                        m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                    } else {
                        m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                    }
                    abstractC0844tM9251a = c3203b4.m9251a(m101928D(interfaceC28601c3));
                    if (z35) {
                        c32588b3 = new C32588b3(m101970j0(abstractC0844tM9251a), 8, 0.12f, c21054m3.getTextColor(), null);
                    } else {
                        c32588b3 = null;
                    }
                    int i413 = (i15 & 112) | (C21054m.f79836p << 6);
                    int i414 = i15 >> 12;
                    C28655q c28655q6 = c28655q2;
                    m101982t(abstractC0844tM9251a, modifier6, c21054m3, c40819i2, c32588b3, c28655q6, (i414 & 7168) | i413 | (i414 & 896), 0);
                    c28655q = c28655q6;
                    c21054m2 = c21054m3;
                    c3203b3 = c3203b4;
                    z25 = z16;
                    c40819i1 = c40819i2;
                    modifier3 = modifier6;
                    z24 = z310;
                    z26 = z35;
                    function2 = function4;
                } else {
                    str = markdown;
                    c28655q = c28655q3;
                    c28655q.m87138X();
                    c40819i1 = c40819i0;
                    modifier3 = modifier2;
                    c3203b3 = c3203b2;
                    z24 = z18;
                    z25 = z16;
                    c21054m2 = c21054m;
                    z26 = z15;
                    function2 = function1;
                }
                z27 = z17;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.g2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC32637l2.m101986x(str, modifier3, c3203b3, z25, z27, z24, c21054m2, c40819i1, z26, function2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 24576;
            z17 = z13;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z18 = z14;
            } else {
                z18 = z14;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87155h(z18)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 1572864) == 0) {
                if ((i14 & 64) != 0) {
                    i37 = 524288;
                } else {
                    if ((i13 & 2097152) == 0) {
                        zM87157i = c28655q3.m87153g(c21054m);
                    } else {
                        zM87157i = c28655q3.m87157i(c21054m);
                    }
                    if (zM87157i) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                }
                i15 |= i37;
            }
            if ((i13 & 12582912) != 0) {
                i15 |= ((i14 & 128) == 0 || !c28655q3.m87153g(c40819i0)) ? 4194304 : 8388608;
            }
            i26 = i14 & 256;
            if (i26 != 0) {
                i15 |= 100663296;
                i27 = i26;
            } else {
                i27 = i26;
                if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z15)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
            }
            i29 = i14 & 512;
            if (i29 != 0) {
                i15 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q3.m87157i(function1)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i15 |= i34;
            }
            if ((i15 & 306783379) != 306783378) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z19)) {
                c28655q3.m87140Z();
                i35 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 4) != 0) {
                        c3203b4 = new C3203b(new C0684i0(1));
                        i15 &= -897;
                    } else {
                        c3203b4 = c3203b2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    }
                    if (i18 != 0) {
                        z28 = false;
                    } else {
                        z28 = z17;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if ((i14 & 64) != 0) {
                        C21053l c21053l6 = C21053l.f79834a;
                        C38072d c38072d6 = C38072d.f163053a;
                        int i415 = C38072d.f163054b;
                        c21054mM58880a = c21053l6.m58880a(C23285v0.m67364b(c38072d6.m121952e(c28655q3, i415).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d6.m121949b(c28655q3, i415).getWhite70(), c38072d6.m121949b(c28655q3, i415).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                        c28655q2 = c28655q3;
                        i15 &= -3670017;
                    } else {
                        c28655q2 = c28655q3;
                        c21054mM58880a = c21054m;
                    }
                    if ((i14 & 128) != 0) {
                        c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                        i15 &= -29360129;
                    } else {
                        c40819i2 = c40819i0;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z15;
                    }
                    if (i29 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(27);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function10 = (Function1) objM87133R;
                        z17 = z28;
                        function3 = function10;
                    } else {
                        z17 = z28;
                        function3 = function1;
                    }
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 4) != 0) {
                        c3203b4 = new C3203b(new C0684i0(1));
                        i15 &= -897;
                    } else {
                        c3203b4 = c3203b2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    }
                    if (i18 != 0) {
                        z28 = false;
                    } else {
                        z28 = z17;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if ((i14 & 64) != 0) {
                        C21053l c21053l7 = C21053l.f79834a;
                        C38072d c38072d7 = C38072d.f163053a;
                        int i416 = C38072d.f163054b;
                        c21054mM58880a = c21053l7.m58880a(C23285v0.m67364b(c38072d7.m121952e(c28655q3, i416).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d7.m121949b(c28655q3, i416).getWhite70(), c38072d7.m121949b(c28655q3, i416).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                        c28655q2 = c28655q3;
                        i15 &= -3670017;
                    } else {
                        c28655q2 = c28655q3;
                        c21054mM58880a = c21054m;
                    }
                    if ((i14 & 128) != 0) {
                        c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                        i15 &= -29360129;
                    } else {
                        c40819i2 = c40819i0;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z15;
                    }
                    if (i29 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(27);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function11 = (Function1) objM87133R;
                        z17 = z28;
                        function3 = function11;
                    } else {
                        z17 = z28;
                        function3 = function1;
                    }
                }
                c28655q2.m87175r();
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                i36 = i15 & 14;
                function4 = function3;
                if (i36 == 4) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z34) {
                    objM87133R3 = AbstractC28683x.m87272z(markdown);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = AbstractC28683x.m87272z(markdown);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                c21054m3 = c21054mM58880a;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(m101926B(interfaceC28601c2));
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                Modifier modifier7 = modifier2;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC31061c.m95647w(z16, c28655q2);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                Boolean boolValueOf4 = Boolean.valueOf(m101985w(interfaceC28601c4));
                z35 = z29;
                boolean z311 = z18;
                if ((i15 & 1879048192) == 536870912) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                if (i36 == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zM87153g = z37 | z36 | c28655q2.m87153g(interfaceC28601c2) | ((i15 & 7168) == 2048);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                    str = markdown;
                    interfaceC28601c5 = interfaceC28601c2;
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                    str = markdown;
                    interfaceC28601c5 = interfaceC28601c2;
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87254h(str, boolValueOf4, (InterfaceC4351m) objM87133R6, c28655q2);
                if (z17) {
                    m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                } else {
                    m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                }
                abstractC0844tM9251a = c3203b4.m9251a(m101928D(interfaceC28601c3));
                if (z35) {
                    c32588b3 = new C32588b3(m101970j0(abstractC0844tM9251a), 8, 0.12f, c21054m3.getTextColor(), null);
                } else {
                    c32588b3 = null;
                }
                int i417 = (i15 & 112) | (C21054m.f79836p << 6);
                int i418 = i15 >> 12;
                C28655q c28655q7 = c28655q2;
                m101982t(abstractC0844tM9251a, modifier7, c21054m3, c40819i2, c32588b3, c28655q7, (i418 & 7168) | i417 | (i418 & 896), 0);
                c28655q = c28655q7;
                c21054m2 = c21054m3;
                c3203b3 = c3203b4;
                z25 = z16;
                c40819i1 = c40819i2;
                modifier3 = modifier7;
                z24 = z311;
                z26 = z35;
                function2 = function4;
            } else {
                str = markdown;
                c28655q = c28655q3;
                c28655q.m87138X();
                c40819i1 = c40819i0;
                modifier3 = modifier2;
                c3203b3 = c3203b2;
                z24 = z18;
                z25 = z16;
                c21054m2 = c21054m;
                z26 = z15;
                function2 = function1;
            }
            z27 = z17;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.g2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC32637l2.m101986x(str, modifier3, c3203b3, z25, z27, z24, c21054m2, c40819i1, z26, function2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c3203b2 = c3203b;
                if (c28655q3.m87157i(c3203b2)) {
                }
                i15 |= i39;
            } else {
                c3203b2 = c3203b;
            }
            i15 |= i39;
        } else {
            c3203b2 = c3203b;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z16 = z4;
                if (c28655q3.m87155h(z16)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z17 = z13;
                    if (c28655q3.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    z18 = z14;
                } else {
                    z18 = z14;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87155h(z18)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 1572864) == 0) {
                    if ((i14 & 64) != 0) {
                        i37 = 524288;
                    } else {
                        if ((i13 & 2097152) == 0) {
                            zM87157i = c28655q3.m87153g(c21054m);
                        } else {
                            zM87157i = c28655q3.m87157i(c21054m);
                        }
                        if (zM87157i) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                    }
                    i15 |= i37;
                }
                if ((i13 & 12582912) != 0) {
                    i15 |= ((i14 & 128) == 0 || !c28655q3.m87153g(c40819i0)) ? 4194304 : 8388608;
                }
                i26 = i14 & 256;
                if (i26 != 0) {
                    i15 |= 100663296;
                    i27 = i26;
                } else {
                    i27 = i26;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q3.m87155h(z15)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i28;
                    }
                }
                i29 = i14 & 512;
                if (i29 != 0) {
                    i15 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q3.m87157i(function1)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i15 |= i34;
                }
                if ((i15 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z19)) {
                    c28655q3.m87140Z();
                    i35 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i35 != 0) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i14 & 4) != 0) {
                            c3203b4 = new C3203b(new C0684i0(1));
                            i15 &= -897;
                        } else {
                            c3203b4 = c3203b2;
                        }
                        if (i16 != 0) {
                            z16 = true;
                        }
                        if (i18 != 0) {
                            z28 = false;
                        } else {
                            z28 = z17;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if ((i14 & 64) != 0) {
                            C21053l c21053l8 = C21053l.f79834a;
                            C38072d c38072d8 = C38072d.f163053a;
                            int i419 = C38072d.f163054b;
                            c21054mM58880a = c21053l8.m58880a(C23285v0.m67364b(c38072d8.m121952e(c28655q3, i419).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d8.m121949b(c28655q3, i419).getWhite70(), c38072d8.m121949b(c28655q3, i419).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                            c28655q2 = c28655q3;
                            i15 &= -3670017;
                        } else {
                            c28655q2 = c28655q3;
                            c21054mM58880a = c21054m;
                        }
                        if ((i14 & 128) != 0) {
                            c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                            i15 &= -29360129;
                        } else {
                            c40819i2 = c40819i0;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z15;
                        }
                        if (i29 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(27);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function12 = (Function1) objM87133R;
                            z17 = z28;
                            function3 = function12;
                        } else {
                            z17 = z28;
                            function3 = function1;
                        }
                    } else {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if ((i14 & 4) != 0) {
                            c3203b4 = new C3203b(new C0684i0(1));
                            i15 &= -897;
                        } else {
                            c3203b4 = c3203b2;
                        }
                        if (i16 != 0) {
                            z16 = true;
                        }
                        if (i18 != 0) {
                            z28 = false;
                        } else {
                            z28 = z17;
                        }
                        if (i24 != 0) {
                            z18 = false;
                        }
                        if ((i14 & 64) != 0) {
                            C21053l c21053l9 = C21053l.f79834a;
                            C38072d c38072d9 = C38072d.f163053a;
                            int i4110 = C38072d.f163054b;
                            c21054mM58880a = c21053l9.m58880a(C23285v0.m67364b(c38072d9.m121952e(c28655q3, i4110).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d9.m121949b(c28655q3, i4110).getWhite70(), c38072d9.m121949b(c28655q3, i4110).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                            c28655q2 = c28655q3;
                            i15 &= -3670017;
                        } else {
                            c28655q2 = c28655q3;
                            c21054mM58880a = c21054m;
                        }
                        if ((i14 & 128) != 0) {
                            c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                            i15 &= -29360129;
                        } else {
                            c40819i2 = c40819i0;
                        }
                        if (i27 != 0) {
                            z29 = false;
                        } else {
                            z29 = z15;
                        }
                        if (i29 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32375n(27);
                                c28655q2.m87172p0(objM87133R);
                            }
                            Function1 function13 = (Function1) objM87133R;
                            z17 = z28;
                            function3 = function13;
                        } else {
                            z17 = z28;
                            function3 = function1;
                        }
                    }
                    c28655q2.m87175r();
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    i36 = i15 & 14;
                    function4 = function3;
                    if (i36 == 4) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z34) {
                        objM87133R3 = AbstractC28683x.m87272z(markdown);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC28683x.m87272z(markdown);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    c21054m3 = c21054mM58880a;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(m101926B(interfaceC28601c2));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                    Modifier modifier8 = modifier2;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC31061c.m95647w(z16, c28655q2);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    Boolean boolValueOf5 = Boolean.valueOf(m101985w(interfaceC28601c4));
                    z35 = z29;
                    boolean z312 = z18;
                    if ((i15 & 1879048192) == 536870912) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    if (i36 == 4) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zM87153g = z37 | z36 | c28655q2.m87153g(interfaceC28601c2) | ((i15 & 7168) == 2048);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                        str = markdown;
                        interfaceC28601c5 = interfaceC28601c2;
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                        str = markdown;
                        interfaceC28601c5 = interfaceC28601c2;
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87254h(str, boolValueOf5, (InterfaceC4351m) objM87133R6, c28655q2);
                    if (z17) {
                        m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                    } else {
                        m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                    }
                    abstractC0844tM9251a = c3203b4.m9251a(m101928D(interfaceC28601c3));
                    if (z35) {
                        c32588b3 = new C32588b3(m101970j0(abstractC0844tM9251a), 8, 0.12f, c21054m3.getTextColor(), null);
                    } else {
                        c32588b3 = null;
                    }
                    int i4111 = (i15 & 112) | (C21054m.f79836p << 6);
                    int i4112 = i15 >> 12;
                    C28655q c28655q8 = c28655q2;
                    m101982t(abstractC0844tM9251a, modifier8, c21054m3, c40819i2, c32588b3, c28655q8, (i4112 & 7168) | i4111 | (i4112 & 896), 0);
                    c28655q = c28655q8;
                    c21054m2 = c21054m3;
                    c3203b3 = c3203b4;
                    z25 = z16;
                    c40819i1 = c40819i2;
                    modifier3 = modifier8;
                    z24 = z312;
                    z26 = z35;
                    function2 = function4;
                } else {
                    str = markdown;
                    c28655q = c28655q3;
                    c28655q.m87138X();
                    c40819i1 = c40819i0;
                    modifier3 = modifier2;
                    c3203b3 = c3203b2;
                    z24 = z18;
                    z25 = z16;
                    c21054m2 = c21054m;
                    z26 = z15;
                    function2 = function1;
                }
                z27 = z17;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.g2
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC32637l2.m101986x(str, modifier3, c3203b3, z25, z27, z24, c21054m2, c40819i1, z26, function2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 24576;
            z17 = z13;
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z18 = z14;
            } else {
                z18 = z14;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87155h(z18)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 1572864) == 0) {
                if ((i14 & 64) != 0) {
                    i37 = 524288;
                } else {
                    if ((i13 & 2097152) == 0) {
                        zM87157i = c28655q3.m87153g(c21054m);
                    } else {
                        zM87157i = c28655q3.m87157i(c21054m);
                    }
                    if (zM87157i) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                }
                i15 |= i37;
            }
            if ((i13 & 12582912) != 0) {
                i15 |= ((i14 & 128) == 0 || !c28655q3.m87153g(c40819i0)) ? 4194304 : 8388608;
            }
            i26 = i14 & 256;
            if (i26 != 0) {
                i15 |= 100663296;
                i27 = i26;
            } else {
                i27 = i26;
                if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z15)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
            }
            i29 = i14 & 512;
            if (i29 != 0) {
                i15 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q3.m87157i(function1)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i15 |= i34;
            }
            if ((i15 & 306783379) != 306783378) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z19)) {
                c28655q3.m87140Z();
                i35 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 4) != 0) {
                        c3203b4 = new C3203b(new C0684i0(1));
                        i15 &= -897;
                    } else {
                        c3203b4 = c3203b2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    }
                    if (i18 != 0) {
                        z28 = false;
                    } else {
                        z28 = z17;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if ((i14 & 64) != 0) {
                        C21053l c21053l10 = C21053l.f79834a;
                        C38072d c38072d10 = C38072d.f163053a;
                        int i4113 = C38072d.f163054b;
                        c21054mM58880a = c21053l10.m58880a(C23285v0.m67364b(c38072d10.m121952e(c28655q3, i4113).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d10.m121949b(c28655q3, i4113).getWhite70(), c38072d10.m121949b(c28655q3, i4113).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                        c28655q2 = c28655q3;
                        i15 &= -3670017;
                    } else {
                        c28655q2 = c28655q3;
                        c21054mM58880a = c21054m;
                    }
                    if ((i14 & 128) != 0) {
                        c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                        i15 &= -29360129;
                    } else {
                        c40819i2 = c40819i0;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z15;
                    }
                    if (i29 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(27);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function14 = (Function1) objM87133R;
                        z17 = z28;
                        function3 = function14;
                    } else {
                        z17 = z28;
                        function3 = function1;
                    }
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 4) != 0) {
                        c3203b4 = new C3203b(new C0684i0(1));
                        i15 &= -897;
                    } else {
                        c3203b4 = c3203b2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    }
                    if (i18 != 0) {
                        z28 = false;
                    } else {
                        z28 = z17;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if ((i14 & 64) != 0) {
                        C21053l c21053l11 = C21053l.f79834a;
                        C38072d c38072d11 = C38072d.f163053a;
                        int i4114 = C38072d.f163054b;
                        c21054mM58880a = c21053l11.m58880a(C23285v0.m67364b(c38072d11.m121952e(c28655q3, i4114).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d11.m121949b(c28655q3, i4114).getWhite70(), c38072d11.m121949b(c28655q3, i4114).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                        c28655q2 = c28655q3;
                        i15 &= -3670017;
                    } else {
                        c28655q2 = c28655q3;
                        c21054mM58880a = c21054m;
                    }
                    if ((i14 & 128) != 0) {
                        c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                        i15 &= -29360129;
                    } else {
                        c40819i2 = c40819i0;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z15;
                    }
                    if (i29 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(27);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function15 = (Function1) objM87133R;
                        z17 = z28;
                        function3 = function15;
                    } else {
                        z17 = z28;
                        function3 = function1;
                    }
                }
                c28655q2.m87175r();
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                i36 = i15 & 14;
                function4 = function3;
                if (i36 == 4) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z34) {
                    objM87133R3 = AbstractC28683x.m87272z(markdown);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = AbstractC28683x.m87272z(markdown);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                c21054m3 = c21054mM58880a;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(m101926B(interfaceC28601c2));
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                Modifier modifier9 = modifier2;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC31061c.m95647w(z16, c28655q2);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                Boolean boolValueOf6 = Boolean.valueOf(m101985w(interfaceC28601c4));
                z35 = z29;
                boolean z313 = z18;
                if ((i15 & 1879048192) == 536870912) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                if (i36 == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zM87153g = z37 | z36 | c28655q2.m87153g(interfaceC28601c2) | ((i15 & 7168) == 2048);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                    str = markdown;
                    interfaceC28601c5 = interfaceC28601c2;
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                    str = markdown;
                    interfaceC28601c5 = interfaceC28601c2;
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87254h(str, boolValueOf6, (InterfaceC4351m) objM87133R6, c28655q2);
                if (z17) {
                    m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                } else {
                    m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                }
                abstractC0844tM9251a = c3203b4.m9251a(m101928D(interfaceC28601c3));
                if (z35) {
                    c32588b3 = new C32588b3(m101970j0(abstractC0844tM9251a), 8, 0.12f, c21054m3.getTextColor(), null);
                } else {
                    c32588b3 = null;
                }
                int i4115 = (i15 & 112) | (C21054m.f79836p << 6);
                int i4116 = i15 >> 12;
                C28655q c28655q9 = c28655q2;
                m101982t(abstractC0844tM9251a, modifier9, c21054m3, c40819i2, c32588b3, c28655q9, (i4116 & 7168) | i4115 | (i4116 & 896), 0);
                c28655q = c28655q9;
                c21054m2 = c21054m3;
                c3203b3 = c3203b4;
                z25 = z16;
                c40819i1 = c40819i2;
                modifier3 = modifier9;
                z24 = z313;
                z26 = z35;
                function2 = function4;
            } else {
                str = markdown;
                c28655q = c28655q3;
                c28655q.m87138X();
                c40819i1 = c40819i0;
                modifier3 = modifier2;
                c3203b3 = c3203b2;
                z24 = z18;
                z25 = z16;
                c21054m2 = c21054m;
                z26 = z15;
                function2 = function1;
            }
            z27 = z17;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.g2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC32637l2.m101986x(str, modifier3, c3203b3, z25, z27, z24, c21054m2, c40819i1, z26, function2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 3072;
        z16 = z4;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                z17 = z13;
                if (c28655q3.m87155h(z17)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z18 = z14;
            } else {
                z18 = z14;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87155h(z18)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 1572864) == 0) {
                if ((i14 & 64) != 0) {
                    i37 = 524288;
                } else {
                    if ((i13 & 2097152) == 0) {
                        zM87157i = c28655q3.m87153g(c21054m);
                    } else {
                        zM87157i = c28655q3.m87157i(c21054m);
                    }
                    if (zM87157i) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                }
                i15 |= i37;
            }
            if ((i13 & 12582912) != 0) {
                i15 |= ((i14 & 128) == 0 || !c28655q3.m87153g(c40819i0)) ? 4194304 : 8388608;
            }
            i26 = i14 & 256;
            if (i26 != 0) {
                i15 |= 100663296;
                i27 = i26;
            } else {
                i27 = i26;
                if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z15)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
            }
            i29 = i14 & 512;
            if (i29 != 0) {
                i15 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q3.m87157i(function1)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i15 |= i34;
            }
            if ((i15 & 306783379) != 306783378) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z19)) {
                c28655q3.m87140Z();
                i35 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i35 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 4) != 0) {
                        c3203b4 = new C3203b(new C0684i0(1));
                        i15 &= -897;
                    } else {
                        c3203b4 = c3203b2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    }
                    if (i18 != 0) {
                        z28 = false;
                    } else {
                        z28 = z17;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if ((i14 & 64) != 0) {
                        C21053l c21053l12 = C21053l.f79834a;
                        C38072d c38072d12 = C38072d.f163053a;
                        int i4117 = C38072d.f163054b;
                        c21054mM58880a = c21053l12.m58880a(C23285v0.m67364b(c38072d12.m121952e(c28655q3, i4117).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d12.m121949b(c28655q3, i4117).getWhite70(), c38072d12.m121949b(c28655q3, i4117).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                        c28655q2 = c28655q3;
                        i15 &= -3670017;
                    } else {
                        c28655q2 = c28655q3;
                        c21054mM58880a = c21054m;
                    }
                    if ((i14 & 128) != 0) {
                        c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                        i15 &= -29360129;
                    } else {
                        c40819i2 = c40819i0;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z15;
                    }
                    if (i29 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(27);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function16 = (Function1) objM87133R;
                        z17 = z28;
                        function3 = function16;
                    } else {
                        z17 = z28;
                        function3 = function1;
                    }
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if ((i14 & 4) != 0) {
                        c3203b4 = new C3203b(new C0684i0(1));
                        i15 &= -897;
                    } else {
                        c3203b4 = c3203b2;
                    }
                    if (i16 != 0) {
                        z16 = true;
                    }
                    if (i18 != 0) {
                        z28 = false;
                    } else {
                        z28 = z17;
                    }
                    if (i24 != 0) {
                        z18 = false;
                    }
                    if ((i14 & 64) != 0) {
                        C21053l c21053l13 = C21053l.f79834a;
                        C38072d c38072d13 = C38072d.f163053a;
                        int i4118 = C38072d.f163054b;
                        c21054mM58880a = c21053l13.m58880a(C23285v0.m67364b(c38072d13.m121952e(c28655q3, i4118).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d13.m121949b(c28655q3, i4118).getWhite70(), c38072d13.m121949b(c28655q3, i4118).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                        c28655q2 = c28655q3;
                        i15 &= -3670017;
                    } else {
                        c28655q2 = c28655q3;
                        c21054mM58880a = c21054m;
                    }
                    if ((i14 & 128) != 0) {
                        c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                        i15 &= -29360129;
                    } else {
                        c40819i2 = c40819i0;
                    }
                    if (i27 != 0) {
                        z29 = false;
                    } else {
                        z29 = z15;
                    }
                    if (i29 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32375n(27);
                            c28655q2.m87172p0(objM87133R);
                        }
                        Function1 function17 = (Function1) objM87133R;
                        z17 = z28;
                        function3 = function17;
                    } else {
                        z17 = z28;
                        function3 = function1;
                    }
                }
                c28655q2.m87175r();
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                i36 = i15 & 14;
                function4 = function3;
                if (i36 == 4) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z34) {
                    objM87133R3 = AbstractC28683x.m87272z(markdown);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = AbstractC28683x.m87272z(markdown);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                c21054m3 = c21054mM58880a;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(m101926B(interfaceC28601c2));
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
                Modifier modifier10 = modifier2;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC31061c.m95647w(z16, c28655q2);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                Boolean boolValueOf7 = Boolean.valueOf(m101985w(interfaceC28601c4));
                z35 = z29;
                boolean z314 = z18;
                if ((i15 & 1879048192) == 536870912) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                if (i36 == 4) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zM87153g = z37 | z36 | c28655q2.m87153g(interfaceC28601c2) | ((i15 & 7168) == 2048);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                    str = markdown;
                    interfaceC28601c5 = interfaceC28601c2;
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                    str = markdown;
                    interfaceC28601c5 = interfaceC28601c2;
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87254h(str, boolValueOf7, (InterfaceC4351m) objM87133R6, c28655q2);
                if (z17) {
                    m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                } else {
                    m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
                }
                abstractC0844tM9251a = c3203b4.m9251a(m101928D(interfaceC28601c3));
                if (z35) {
                    c32588b3 = new C32588b3(m101970j0(abstractC0844tM9251a), 8, 0.12f, c21054m3.getTextColor(), null);
                } else {
                    c32588b3 = null;
                }
                int i4119 = (i15 & 112) | (C21054m.f79836p << 6);
                int i41110 = i15 >> 12;
                C28655q c28655q10 = c28655q2;
                m101982t(abstractC0844tM9251a, modifier10, c21054m3, c40819i2, c32588b3, c28655q10, (i41110 & 7168) | i4119 | (i41110 & 896), 0);
                c28655q = c28655q10;
                c21054m2 = c21054m3;
                c3203b3 = c3203b4;
                z25 = z16;
                c40819i1 = c40819i2;
                modifier3 = modifier10;
                z24 = z314;
                z26 = z35;
                function2 = function4;
            } else {
                str = markdown;
                c28655q = c28655q3;
                c28655q.m87138X();
                c40819i1 = c40819i0;
                modifier3 = modifier2;
                c3203b3 = c3203b2;
                z24 = z18;
                z25 = z16;
                c21054m2 = c21054m;
                z26 = z15;
                function2 = function1;
            }
            z27 = z17;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.g2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC32637l2.m101986x(str, modifier3, c3203b3, z25, z27, z24, c21054m2, c40819i1, z26, function2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 24576;
        z17 = z13;
        i24 = i14 & 32;
        if (i24 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z18 = z14;
        } else {
            z18 = z14;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87155h(z18)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
        }
        if ((i13 & 1572864) == 0) {
            if ((i14 & 64) != 0) {
                i37 = 524288;
            } else {
                if ((i13 & 2097152) == 0) {
                    zM87157i = c28655q3.m87153g(c21054m);
                } else {
                    zM87157i = c28655q3.m87157i(c21054m);
                }
                if (zM87157i) {
                    i37 = 1048576;
                } else {
                    i37 = 524288;
                }
            }
            i15 |= i37;
        }
        if ((i13 & 12582912) != 0) {
            i15 |= ((i14 & 128) == 0 || !c28655q3.m87153g(c40819i0)) ? 4194304 : 8388608;
        }
        i26 = i14 & 256;
        if (i26 != 0) {
            i15 |= 100663296;
            i27 = i26;
        } else {
            i27 = i26;
            if ((i13 & 100663296) == 0) {
                if (c28655q3.m87155h(z15)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i28;
            }
        }
        i29 = i14 & 512;
        if (i29 != 0) {
            i15 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q3.m87157i(function1)) {
                i34 = 536870912;
            } else {
                i34 = 268435456;
            }
            i15 |= i34;
        }
        if ((i15 & 306783379) != 306783378) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z19)) {
            c28655q3.m87140Z();
            i35 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i35 != 0) {
                if (i38 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i14 & 4) != 0) {
                    c3203b4 = new C3203b(new C0684i0(1));
                    i15 &= -897;
                } else {
                    c3203b4 = c3203b2;
                }
                if (i16 != 0) {
                    z16 = true;
                }
                if (i18 != 0) {
                    z28 = false;
                } else {
                    z28 = z17;
                }
                if (i24 != 0) {
                    z18 = false;
                }
                if ((i14 & 64) != 0) {
                    C21053l c21053l14 = C21053l.f79834a;
                    C38072d c38072d14 = C38072d.f163053a;
                    int i41111 = C38072d.f163054b;
                    c21054mM58880a = c21053l14.m58880a(C23285v0.m67364b(c38072d14.m121952e(c28655q3, i41111).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d14.m121949b(c28655q3, i41111).getWhite70(), c38072d14.m121949b(c28655q3, i41111).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                    c28655q2 = c28655q3;
                    i15 &= -3670017;
                } else {
                    c28655q2 = c28655q3;
                    c21054mM58880a = c21054m;
                }
                if ((i14 & 128) != 0) {
                    c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                    i15 &= -29360129;
                } else {
                    c40819i2 = c40819i0;
                }
                if (i27 != 0) {
                    z29 = false;
                } else {
                    z29 = z15;
                }
                if (i29 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32375n(27);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function1 function18 = (Function1) objM87133R;
                    z17 = z28;
                    function3 = function18;
                } else {
                    z17 = z28;
                    function3 = function1;
                }
            } else {
                if (i38 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if ((i14 & 4) != 0) {
                    c3203b4 = new C3203b(new C0684i0(1));
                    i15 &= -897;
                } else {
                    c3203b4 = c3203b2;
                }
                if (i16 != 0) {
                    z16 = true;
                }
                if (i18 != 0) {
                    z28 = false;
                } else {
                    z28 = z17;
                }
                if (i24 != 0) {
                    z18 = false;
                }
                if ((i14 & 64) != 0) {
                    C21053l c21053l15 = C21053l.f79834a;
                    C38072d c38072d15 = C38072d.f163053a;
                    int i41112 = C38072d.f163054b;
                    c21054mM58880a = c21053l15.m58880a(C23285v0.m67364b(c38072d15.m121952e(c28655q3, i41112).getP1().getStyle(), 0L, 0L, null, null, 0L, 0, AbstractC35745c.m113246h(21), null, null, 16646143), c38072d15.m121949b(c28655q3, i41112).getWhite70(), c38072d15.m121949b(c28655q3, i41112).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                    c28655q2 = c28655q3;
                    i15 &= -3670017;
                } else {
                    c28655q2 = c28655q3;
                    c21054mM58880a = c21054m;
                }
                if ((i14 & 128) != 0) {
                    c40819i2 = new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null);
                    i15 &= -29360129;
                } else {
                    c40819i2 = c40819i0;
                }
                if (i27 != 0) {
                    z29 = false;
                } else {
                    z29 = z15;
                }
                if (i29 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32375n(27);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Function1 function19 = (Function1) objM87133R;
                    z17 = z28;
                    function3 = function19;
                } else {
                    z17 = z28;
                    function3 = function1;
                }
            }
            c28655q2.m87175r();
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            i36 = i15 & 14;
            function4 = function3;
            if (i36 == 4) {
                z34 = true;
            } else {
                z34 = false;
            }
            objM87133R3 = c28655q2.m87133R();
            if (z34) {
                objM87133R3 = AbstractC28683x.m87272z(markdown);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = AbstractC28683x.m87272z(markdown);
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            c21054m3 = c21054mM58880a;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(m101926B(interfaceC28601c2));
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            Modifier modifier11 = modifier2;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC31061c.m95647w(z16, c28655q2);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
            Boolean boolValueOf8 = Boolean.valueOf(m101985w(interfaceC28601c4));
            z35 = z29;
            boolean z315 = z18;
            if ((i15 & 1879048192) == 536870912) {
                z36 = true;
            } else {
                z36 = false;
            }
            if (i36 == 4) {
                z37 = true;
            } else {
                z37 = false;
            }
            zM87153g = z37 | z36 | c28655q2.m87153g(interfaceC28601c2) | ((i15 & 7168) == 2048);
            objM87133R6 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                str = markdown;
                interfaceC28601c5 = interfaceC28601c2;
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new a(function4, markdown, z16, interfaceC28601c4, interfaceC28601c1, interfaceC28601c2, null);
                str = markdown;
                interfaceC28601c5 = interfaceC28601c2;
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87254h(str, boolValueOf8, (InterfaceC4351m) objM87133R6, c28655q2);
            if (z17) {
                m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
            } else {
                m101929E(interfaceC28601c3, m101926B(interfaceC28601c5));
            }
            abstractC0844tM9251a = c3203b4.m9251a(m101928D(interfaceC28601c3));
            if (z35) {
                c32588b3 = new C32588b3(m101970j0(abstractC0844tM9251a), 8, 0.12f, c21054m3.getTextColor(), null);
            } else {
                c32588b3 = null;
            }
            int i41113 = (i15 & 112) | (C21054m.f79836p << 6);
            int i41114 = i15 >> 12;
            C28655q c28655q11 = c28655q2;
            m101982t(abstractC0844tM9251a, modifier11, c21054m3, c40819i2, c32588b3, c28655q11, (i41114 & 7168) | i41113 | (i41114 & 896), 0);
            c28655q = c28655q11;
            c21054m2 = c21054m3;
            c3203b3 = c3203b4;
            z25 = z16;
            c40819i1 = c40819i2;
            modifier3 = modifier11;
            z24 = z315;
            z26 = z35;
            function2 = function4;
        } else {
            str = markdown;
            c28655q = c28655q3;
            c28655q.m87138X();
            c40819i1 = c40819i0;
            modifier3 = modifier2;
            c3203b3 = c3203b2;
            z24 = z18;
            z25 = z16;
            c21054m2 = c21054m;
            z26 = z15;
            function2 = function1;
        }
        z27 = z17;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.g2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC32637l2.m101986x(str, modifier3, c3203b3, z25, z27, z24, c21054m2, c40819i1, z26, function2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m101984v(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final boolean m101985w(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m101986x(String str, Modifier modifier, C3203b c3203b, boolean z4, boolean z13, boolean z14, C21054m c21054m, C40819i0 c40819i0, boolean z15, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m101983u(str, modifier, c3203b, z4, z13, z14, c21054m, c40819i0, z15, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m101987y(AbstractC0844t abstractC0844t, Modifier modifier, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, int i13, int i14, Composer composer, int i15) {
        m101982t(abstractC0844t, modifier, c21054m, c40819i0, c32588b3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final int m101988z(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }
}
