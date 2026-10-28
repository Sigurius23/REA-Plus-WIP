package p734sl0;

import android.net.Uri;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import nl0.C26810l;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p164g2.C15247s;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39178j;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import q81.C30047e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qx0.C30745a;
import qz0.AbstractC30784c;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import re1.C31314a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc2.C32375n;
import sh2.C32513d;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import wk0.AbstractC37336b;
import x81.AbstractC38073e;
import x81.C38072d;
import xk0.C38423a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sl0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aË\u0002\u0010'\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u001220\b\u0002\u0010\u001a\u001a*\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00130\u00162\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u001b2\u001c\b\u0002\u0010\u001e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u001d2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00182\b\u0010\"\u001a\u0004\u0018\u00010!2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00130\u001b2\u001a\b\u0002\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001d2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0001¢\u0006\u0004\b'\u0010(\u001a%\u0010,\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170*H\u0001¢\u0006\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"", "sendFieldIcon", "Ly81/e;", "sendFieldColor", "Lcom/whoop/design/util/TextResource;", "placeholderMessage", "", "isEnabled", "shouldShowStopGenerating", "enableNewConversation", "Ln0/u;", "listState", "showKeyboard", "Lnl0/m;", "state", "isMessageListEmpty", "Lsl0/n2;", "mediaPickerLauncher", "Lkotlin/Function0;", "Ll83/a0;", "onChatIconClicked", "onStopIconClicked", "Lkotlin/Function3;", "", "", "Landroid/net/Uri;", "onSendMessageClicked", "Lkotlin/Function1;", "retryImageUpload", "Lkotlin/Function2;", "removeImage", "Lnl0/l;", "imageUploadState", "Lg2/v;", "focusState", "updateFocusState", "Lxk0/a$a;", "keyboardEvent", "onDisabledInputTapped", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(ILy81/e;Lcom/whoop/design/util/TextResource;ZZZLn0/u;ZLnl0/m;ZLsl0/n2;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lc93/m;Ljava/util/List;Lg2/v;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V", "loadingState", "Lp1/c1;", "textInput", "S", "(Lnl0/m;Lp1/c1;Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32619i {

    /* JADX INFO: renamed from: sl0.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f135200w = new a();

        /* JADX INFO: renamed from: a */
        public final long m101855a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m101855a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: sl0.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiChatInputRowKt$AiChatInputRow$9$1", m100430f = "AiChatInputRow.kt", m100431l = {116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C15247s f135201E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C26068u f135202F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ boolean f135203G;

        /* JADX INFO: renamed from: w */
        int f135204w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f135205x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC15250v f135206y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4351m f135207z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, InterfaceC15250v interfaceC15250v, InterfaceC4351m interfaceC4351m, C15247s c15247s, C26068u c26068u, boolean z13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135205x = z4;
            this.f135206y = interfaceC15250v;
            this.f135207z = interfaceC4351m;
            this.f135201E = c15247s;
            this.f135202F = c26068u;
            this.f135203G = z13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f135205x, this.f135206y, this.f135207z, this.f135201E, this.f135202F, this.f135203G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        
            if (p164g2.AbstractC15235g.m43314d((p164g2.C15252x) r12) != false) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00f0, code lost:
        
            if (p164g2.AbstractC15235g.m43314d((p164g2.C15252x) r11) != false) goto L179;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 584
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p734sl0.AbstractC32619i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sl0.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiChatInputRowKt$SamsungKeyboardFix$1$1", m100430f = "AiChatInputRow.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135208w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC26811m f135209x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f135210y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC26811m enumC26811m, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135209x = enumC26811m;
            this.f135210y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f135209x, this.f135210y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135208w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f135209x == EnumC26811m.MESSAGE_LOADING) {
                this.f135210y.setValue("");
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m101809A(InterfaceC32647n2 interfaceC32647n2) {
        interfaceC32647n2.mo102038a(AbstractC32662q2.c.f135511a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C39178j m101810B(InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j((((long) (-offset.mo724F(((float) 2.5d) * 4))) << 32) | (((long) 0) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m101811C(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m101812D(boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, InterfaceC28601c1 interfaceC28601c1, List list, Function3 function3) {
        ArrayList arrayList;
        String string;
        if (z4) {
            interfaceC4339a.invoke();
        } else if (z13 && !AbstractC39414r.m125890i0((CharSequence) interfaceC28601c1.getValue())) {
            Object obj = null;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String strM79980a = ((C26810l) it.next()).getFileId();
                    if (strM79980a != null) {
                        arrayList.add(strM79980a);
                    }
                }
            } else {
                arrayList = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    AbstractC22403o abstractC22403oM79981b = ((C26810l) it3.next()).getImageSource();
                    AbstractC22403o.c cVar = abstractC22403oM79981b instanceof AbstractC22403o.c ? (AbstractC22403o.c) abstractC22403oM79981b : null;
                    Object objM64488a = cVar != null ? cVar.getData() : null;
                    Uri uri = (objM64488a == null || (string = objM64488a.toString()) == null) ? null : Uri.parse(string);
                    if (uri != null) {
                        arrayList2.add(uri);
                    }
                }
                obj = arrayList2;
            }
            function3.invoke(interfaceC28601c1.getValue(), obj, arrayList);
            interfaceC28601c1.setValue("");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m101813E(C26810l c26810l, InterfaceC4351m interfaceC4351m) {
        String string;
        AbstractC22403o abstractC22403oM79981b = c26810l.getImageSource();
        Uri uri = null;
        AbstractC22403o.c cVar = abstractC22403oM79981b instanceof AbstractC22403o.c ? (AbstractC22403o.c) abstractC22403oM79981b : null;
        Object objM64488a = cVar != null ? cVar.getData() : null;
        if (objM64488a != null && (string = objM64488a.toString()) != null) {
            uri = Uri.parse(string);
        }
        if (uri != null) {
            interfaceC4351m.invoke(c26810l.getFileId(), uri);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m101814F(C26810l c26810l, Function1 function1) {
        String string;
        AbstractC22403o abstractC22403oM79981b = c26810l.getImageSource();
        Uri uri = null;
        AbstractC22403o.c cVar = abstractC22403oM79981b instanceof AbstractC22403o.c ? (AbstractC22403o.c) abstractC22403oM79981b : null;
        Object objM64488a = cVar != null ? cVar.getData() : null;
        if (objM64488a != null && (string = objM64488a.toString()) != null) {
            uri = Uri.parse(string);
        }
        if (uri != null) {
            function1.invoke(uri);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m101815G(Function1 function1, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m101816H(InterfaceC4339a interfaceC4339a, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m101817I(TextResource textResource, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable);
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 2, 0.0f, 0.0f, 13);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, i14).getWhite30(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m101818J(InterfaceC28601c1 interfaceC28601c1, int i13, String it) {
        AbstractC22676k.m65750j(it, "it");
        if (((String) interfaceC28601c1.getValue()).length() < i13) {
            interfaceC28601c1.setValue(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m101819K(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m101820L(int i13, InterfaceC39332e interfaceC39332e, TextResource textResource, boolean z4, boolean z13, boolean z14, C26068u c26068u, boolean z15, EnumC26811m enumC26811m, boolean z16, InterfaceC32647n2 interfaceC32647n2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function3 function3, Function1 function1, InterfaceC4351m interfaceC4351m, List list, InterfaceC15250v interfaceC15250v, Function1 function2, InterfaceC4351m interfaceC4351m2, InterfaceC4339a interfaceC4339a3, int i14, int i15, int i16, int i17, Composer composer, int i18) {
        m101851w(i13, interfaceC39332e, textResource, z4, z13, z14, c26068u, z15, enumC26811m, z16, interfaceC32647n2, interfaceC4339a, interfaceC4339a2, function3, function1, interfaceC4351m, list, interfaceC15250v, function2, interfaceC4351m2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), AbstractC28683x.m87244L(i16), i17);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m101821M(String str, List list, List list2) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m101822N(Uri it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m101823O(String str, Uri uri) {
        AbstractC22676k.m65750j(uri, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m101824P(InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m101825Q(C38423a.a aVar, boolean z4) {
        AbstractC22676k.m65750j(aVar, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m101826R() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    public static final void m101827S(EnumC26811m loadingState, InterfaceC28601c1 textInput, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(textInput, "textInput");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(320672510);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(loadingState.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(textInput) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new c(loadingState, textInput, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, loadingState);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(loadingState, textInput, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m101828T(EnumC26811m enumC26811m, InterfaceC28601c1 interfaceC28601c1, int i13, Composer composer, int i14) {
        m101827S(enumC26811m, interfaceC28601c1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:155:0x0202  */
    /* JADX WARN: Code duplicated, block: B:159:0x020c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0211  */
    /* JADX WARN: Code duplicated, block: B:162:0x0217  */
    /* JADX WARN: Code duplicated, block: B:164:0x021d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0225  */
    /* JADX WARN: Code duplicated, block: B:170:0x022e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0234  */
    /* JADX WARN: Code duplicated, block: B:174:0x023a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0243  */
    /* JADX WARN: Code duplicated, block: B:180:0x024a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0250  */
    /* JADX WARN: Code duplicated, block: B:184:0x0256  */
    /* JADX WARN: Code duplicated, block: B:185:0x0259  */
    /* JADX WARN: Code duplicated, block: B:187:0x025e  */
    /* JADX WARN: Code duplicated, block: B:190:0x026e  */
    /* JADX WARN: Code duplicated, block: B:196:0x027a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0284  */
    /* JADX WARN: Code duplicated, block: B:202:0x028a  */
    /* JADX WARN: Code duplicated, block: B:204:0x0290  */
    /* JADX WARN: Code duplicated, block: B:206:0x029b  */
    /* JADX WARN: Code duplicated, block: B:208:0x029f  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:212:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:215:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:219:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:221:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:223:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:225:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:227:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:229:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:231:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:234:0x0302  */
    /* JADX WARN: Code duplicated, block: B:235:0x0305  */
    /* JADX WARN: Code duplicated, block: B:237:0x0309  */
    /* JADX WARN: Code duplicated, block: B:239:0x030f  */
    /* JADX WARN: Code duplicated, block: B:240:0x031c  */
    /* JADX WARN: Code duplicated, block: B:242:0x0323  */
    /* JADX WARN: Code duplicated, block: B:244:0x032b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0331  */
    /* JADX WARN: Code duplicated, block: B:247:0x033e  */
    /* JADX WARN: Code duplicated, block: B:249:0x0344  */
    /* JADX WARN: Code duplicated, block: B:251:0x034a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0350  */
    /* JADX WARN: Code duplicated, block: B:255:0x035d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0365  */
    /* JADX WARN: Code duplicated, block: B:261:0x0378  */
    /* JADX WARN: Code duplicated, block: B:264:0x0386  */
    /* JADX WARN: Code duplicated, block: B:267:0x039f  */
    /* JADX WARN: Code duplicated, block: B:268:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:271:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:273:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:274:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:277:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:278:0x03de  */
    /* JADX WARN: Code duplicated, block: B:281:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:282:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:285:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:286:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:289:0x040a  */
    /* JADX WARN: Code duplicated, block: B:290:0x040c  */
    /* JADX WARN: Code duplicated, block: B:293:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:296:0x042f  */
    /* JADX WARN: Code duplicated, block: B:299:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:300:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:303:0x04be  */
    /* JADX WARN: Code duplicated, block: B:306:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:310:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:312:0x051b  */
    /* JADX WARN: Code duplicated, block: B:315:0x0530  */
    /* JADX WARN: Code duplicated, block: B:321:0x053d  */
    /* JADX WARN: Code duplicated, block: B:324:0x0544 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:327:0x0549  */
    /* JADX WARN: Code duplicated, block: B:329:0x0570  */
    /* JADX WARN: Code duplicated, block: B:332:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:335:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:336:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:339:0x05cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:342:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:345:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:346:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:349:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:350:0x0602  */
    /* JADX WARN: Code duplicated, block: B:353:0x060d  */
    /* JADX WARN: Code duplicated, block: B:354:0x0610  */
    /* JADX WARN: Code duplicated, block: B:357:0x0621  */
    /* JADX WARN: Code duplicated, block: B:358:0x0624  */
    /* JADX WARN: Code duplicated, block: B:361:0x062d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:362:0x062f  */
    /* JADX WARN: Code duplicated, block: B:367:0x0716  */
    /* JADX WARN: Code duplicated, block: B:368:0x071c  */
    /* JADX WARN: Code duplicated, block: B:371:0x072d  */
    /* JADX WARN: Code duplicated, block: B:374:0x0740  */
    /* JADX WARN: Code duplicated, block: B:376:0x0745  */
    /* JADX WARN: Code duplicated, block: B:380:0x0751  */
    /* JADX WARN: Code duplicated, block: B:381:0x0766  */
    /* JADX WARN: Code duplicated, block: B:383:0x079c  */
    /* JADX WARN: Code duplicated, block: B:384:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:387:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:389:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:393:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:395:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:396:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:399:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:402:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:403:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:407:0x080f  */
    /* JADX WARN: Code duplicated, block: B:408:0x0811  */
    /* JADX WARN: Code duplicated, block: B:411:0x0819 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:414:0x081f  */
    /* JADX WARN: Code duplicated, block: B:419:0x086f  */
    /* JADX WARN: Code duplicated, block: B:420:0x0873  */
    /* JADX WARN: Code duplicated, block: B:423:0x0886  */
    /* JADX WARN: Code duplicated, block: B:425:0x0894  */
    /* JADX WARN: Code duplicated, block: B:428:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:429:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:432:0x08b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:435:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:438:0x08f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:441:0x08f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:444:0x0907  */
    /* JADX WARN: Code duplicated, block: B:448:0x0924  */
    /* JADX WARN: Code duplicated, block: B:453:0x094b  */
    /* JADX WARN: Code duplicated, block: B:454:0x094e  */
    /* JADX WARN: Code duplicated, block: B:457:0x095a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:458:0x095c  */
    /* JADX WARN: Code duplicated, block: B:461:0x099d  */
    /* JADX WARN: Code duplicated, block: B:464:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:469:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a2f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:476:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:478:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:480:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:483:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:488:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w */
    public static final void m101851w(final int i13, final InterfaceC39332e sendFieldColor, TextResource placeholderMessage, final boolean z4, final boolean z13, final boolean z14, final C26068u listState, final boolean z15, final EnumC26811m state, final boolean z16, final InterfaceC32647n2 mediaPickerLauncher, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function3 function3, Function1 function1, InterfaceC4351m interfaceC4351m, List<C26810l> list, final InterfaceC15250v interfaceC15250v, Function1 function2, InterfaceC4351m interfaceC4351m2, InterfaceC4339a interfaceC4339a3, Composer composer, final int i14, final int i15, final int i16, final int i17) {
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z17;
        TextResource textResource;
        final InterfaceC4339a interfaceC4339a4;
        final InterfaceC4339a interfaceC4339a5;
        final Function3 function4;
        final InterfaceC4351m interfaceC4351m3;
        final List<C26810l> list2;
        final Function1 function5;
        final InterfaceC4351m interfaceC4351m4;
        final InterfaceC4339a interfaceC4339a6;
        C28655q c28655q;
        final Function1 function6;
        C28677v1 c28677v1M87180u;
        int i44;
        Object obj;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        int i45;
        Function3 function7;
        Function1 function8;
        InterfaceC4351m interfaceC4351m5;
        AbstractC17911t abstractC17911tM43972A;
        List<C26810l> list3;
        Function1 function9;
        InterfaceC4351m interfaceC4351m6;
        InterfaceC4339a interfaceC4339a9;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        C15247s c15247s;
        Object objM87133R3;
        InterfaceC21083i interfaceC21083i;
        Function1 function10;
        FeatureFlagChecker featureFlagChecker;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        Object bVar;
        C28655q c28655q2;
        int i46;
        C15247s c15247s2;
        float f13;
        C2314t c2314t;
        C38072d c38072d;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C15247s c15247s3;
        C0209i c0209i4;
        C28655q c28655q3;
        Object objM87133R4;
        boolean z27;
        Object objM87133R5;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        List<C26810l> list4;
        int i56;
        int i57;
        Object objM87133R6;
        Object obj2;
        List<C26810l> list5;
        InterfaceC4339a interfaceC4339a10;
        InterfaceC28601c1 interfaceC28601c2;
        Function3 function11;
        InterfaceC4339a interfaceC4339a11;
        C28655q c28655q4;
        float f14;
        int iHashCode2;
        InterfaceC4339a interfaceC4339a12;
        InterfaceC4339a interfaceC4339a13;
        C0209i c0209i5;
        List<C26810l> list6;
        int iHashCode3;
        Function1 function12;
        Object obj3;
        boolean z28;
        boolean z29;
        boolean z34;
        Object objM87133R7;
        Object obj4;
        boolean z35;
        boolean z36;
        Object objM87133R8;
        Function1 function13;
        int iHashCode4;
        InterfaceC4339a interfaceC4339a14;
        C0209i c0209i6;
        boolean z37;
        Object objM87133R9;
        Function1 function14;
        Object objM87133R10;
        InterfaceC39332e interfaceC39332eM125323a;
        int i58;
        boolean zM87153g;
        Object objM87133R11;
        int i59;
        Object objM87133R12;
        InterfaceC4339a interfaceC4339a15;
        Object objM87133R13;
        boolean z38;
        Object objM87133R14;
        Object objM87133R15;
        boolean z39;
        Object objM87133R16;
        int i64;
        boolean z44;
        Object objM87133R17;
        Object objM87133R18;
        Object objM87133R19;
        Object objM87133R20;
        Object objM87133R21;
        Object objM87133R22;
        Object objM87133R23;
        Object objM87133R24;
        AbstractC22676k.m65750j(sendFieldColor, "sendFieldColor");
        AbstractC22676k.m65750j(placeholderMessage, "placeholderMessage");
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(mediaPickerLauncher, "mediaPickerLauncher");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-1965884846);
        int i65 = (i14 & 6) == 0 ? (c28655q5.m87149e(i13) ? 4 : 2) | i14 : i14;
        int i66 = (i14 & 48) == 0 ? i65 | (c28655q5.m87157i(sendFieldColor) ? 32 : 16) : i65;
        if ((i14 & 384) == 0) {
            i66 |= (i14 & 512) == 0 ? c28655q5.m87153g(placeholderMessage) : c28655q5.m87157i(placeholderMessage) ? 256 : 128;
        }
        int i67 = i14 & 3072;
        int i68 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i67 == 0) {
            i66 |= c28655q5.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i69 = i14 & 24576;
        int i74 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i69 == 0) {
            i66 |= c28655q5.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i66 |= c28655q5.m87155h(z14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i66 |= c28655q5.m87153g(listState) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i66 |= c28655q5.m87155h(z15) ? 8388608 : 4194304;
        }
        int i75 = i14 & 100663296;
        int i76 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i75 == 0) {
            i66 |= c28655q5.m87149e(state.ordinal()) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i66 |= c28655q5.m87155h(z16) ? 536870912 : 268435456;
        }
        int i77 = i66;
        int i78 = (i15 & 6) == 0 ? i15 | ((i15 & 8) == 0 ? c28655q5.m87153g(mediaPickerLauncher) : c28655q5.m87157i(mediaPickerLauncher) ? 4 : 2) : i15;
        int i79 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i79 != 0) {
            i78 |= 48;
        } else if ((i15 & 48) == 0) {
            i78 |= c28655q5.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i83 = i78;
        int i84 = i17 & 4096;
        if (i84 != 0) {
            i18 = i83 | 384;
        } else {
            int i85 = i83;
            if ((i15 & 384) == 0) {
                i85 |= c28655q5.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            i18 = i85;
        }
        int i86 = i17 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i86 != 0) {
            i19 = i18 | 3072;
        } else {
            int i87 = i18;
            if ((i15 & 3072) == 0) {
                if (c28655q5.m87157i(function3)) {
                    i68 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i87 |= i68;
            }
            i19 = i87;
        }
        int i88 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i88 == 0) {
            i24 = i19;
            if ((i15 & 24576) == 0) {
                if (c28655q5.m87157i(function1)) {
                    i74 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i24 |= i74;
            }
            i25 = i17 & 32768;
            if (i25 != 0) {
                i24 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q5.m87157i(interfaceC4351m)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = 65536;
                }
                i24 |= i26;
            }
            i27 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i27 != 0) {
                i24 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (c28655q5.m87157i(list)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i24 |= i28;
            }
            if ((i15 & 12582912) == 0) {
                i24 |= c28655q5.m87157i(interfaceC15250v) ? 8388608 : 4194304;
            }
            i29 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
            if (i29 != 0) {
                i24 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (c28655q5.m87157i(function2)) {
                    i76 = 67108864;
                }
                i24 |= i76;
            }
            i34 = i17 & 524288;
            if (i34 != 0) {
                i24 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                i24 |= c28655q5.m87157i(interfaceC4351m2) ? 536870912 : 268435456;
            }
            i35 = i24;
            i36 = i17 & 1048576;
            if (i36 != 0) {
                if ((i16 & 6) == 0) {
                    if (c28655q5.m87157i(interfaceC4339a3)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i39 = i16 | i38;
                } else {
                    i37 = i16;
                }
                if ((i77 & 306783379) != 306783378 && (i35 & 306783379) == 306783378) {
                    if ((i37 & 3) == 2) {
                        z17 = false;
                    }
                    if (c28655q5.m87135U(i77 & 1, z17)) {
                        i44 = 15;
                        obj = C28635l.f115821a;
                        if (i79 != 0) {
                            objM87133R24 = c28655q5.m87133R();
                            if (objM87133R24 == obj) {
                                objM87133R24 = new C32513d(i44);
                                c28655q5.m87172p0(objM87133R24);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R24;
                        } else {
                            interfaceC4339a7 = interfaceC4339a;
                        }
                        if (i84 != 0) {
                            objM87133R23 = c28655q5.m87133R();
                            if (objM87133R23 == obj) {
                                objM87133R23 = new C32513d(16);
                                c28655q5.m87172p0(objM87133R23);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R23;
                        } else {
                            interfaceC4339a8 = interfaceC4339a2;
                        }
                        i45 = 9;
                        if (i86 != 0) {
                            objM87133R22 = c28655q5.m87133R();
                            if (objM87133R22 == obj) {
                                objM87133R22 = new C30745a(i45);
                                c28655q5.m87172p0(objM87133R22);
                            }
                            function7 = (Function3) objM87133R22;
                        } else {
                            function7 = function3;
                        }
                        if (i88 != 0) {
                            objM87133R21 = c28655q5.m87133R();
                            if (objM87133R21 == obj) {
                                objM87133R21 = new C32375n(7);
                                c28655q5.m87172p0(objM87133R21);
                            }
                            function8 = (Function1) objM87133R21;
                        } else {
                            function8 = function1;
                        }
                        if (i25 != 0) {
                            objM87133R20 = c28655q5.m87133R();
                            if (objM87133R20 == obj) {
                                objM87133R20 = new C31314a(15);
                                c28655q5.m87172p0(objM87133R20);
                            }
                            interfaceC4351m5 = (InterfaceC4351m) objM87133R20;
                        } else {
                            interfaceC4351m5 = interfaceC4351m;
                        }
                        abstractC17911tM43972A = null;
                        if (i27 != 0) {
                            list3 = null;
                        } else {
                            list3 = list;
                        }
                        if (i29 != 0) {
                            objM87133R19 = c28655q5.m87133R();
                            if (objM87133R19 == obj) {
                                objM87133R19 = new C32375n(8);
                                c28655q5.m87172p0(objM87133R19);
                            }
                            function9 = (Function1) objM87133R19;
                        } else {
                            interfaceC4351m5 = interfaceC4351m5;
                            function9 = function2;
                        }
                        if (i34 != 0) {
                            objM87133R18 = c28655q5.m87133R();
                            if (objM87133R18 == obj) {
                                objM87133R18 = new C31314a(16);
                                c28655q5.m87172p0(objM87133R18);
                            }
                            interfaceC4351m6 = (InterfaceC4351m) objM87133R18;
                        } else {
                            interfaceC4339a8 = interfaceC4339a8;
                            interfaceC4351m6 = interfaceC4351m2;
                        }
                        if (i36 != 0) {
                            objM87133R17 = c28655q5.m87133R();
                            if (objM87133R17 == obj) {
                                objM87133R17 = new C32513d(17);
                                c28655q5.m87172p0(objM87133R17);
                            }
                            interfaceC4339a9 = (InterfaceC4339a) objM87133R17;
                        } else {
                            interfaceC4339a9 = interfaceC4339a3;
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == obj) {
                            objM87133R = AbstractC28683x.m87272z("");
                            c28655q5.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a9;
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == obj) {
                            objM87133R2 = AbstractC33745d.m106649h(c28655q5);
                        }
                        c15247s = (C15247s) objM87133R2;
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == obj) {
                            objM87133R3 = AbstractC11266d.m30453g(c28655q5);
                        }
                        interfaceC21083i = (InterfaceC21083i) objM87133R3;
                        function10 = function9;
                        if (((Boolean) AbstractC15751g.m44460m(interfaceC21083i, c28655q5, 6).getValue()).booleanValue()) {
                            if (interfaceC15250v != null || ((EnumC15251w) interfaceC15250v).m43353a()) {
                                z44 = false;
                            } else {
                                z44 = true;
                            }
                            if (z44) {
                                interfaceC4351m6.invoke(C38423a.a.OPEN, Boolean.TRUE);
                            }
                        }
                        featureFlagChecker = (FeatureFlagChecker) c28655q5.m87161k(AbstractC38073e.m121968p());
                        Boolean boolValueOf = Boolean.valueOf(z15);
                        Boolean boolValueOf2 = Boolean.valueOf(z16);
                        if ((i77 & 29360128) == 8388608) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zM87157i = z18 | c28655q5.m87157i(interfaceC15250v);
                        if ((i35 & 1879048192) == 536870912) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z45 = zM87157i | z19;
                        if ((i77 & 3670016) == 1048576) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z46 = z45 | z24;
                        if ((i77 & 1879048192) == 536870912) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z46 | z25;
                        Object objM87133R25 = c28655q5.m87133R();
                        if (!z26 || objM87133R25 == obj) {
                            c28655q2 = c28655q5;
                            i46 = 8;
                            bVar = new b(z15, interfaceC15250v, interfaceC4351m6, c15247s, listState, z16, null);
                            c15247s2 = c15247s;
                            c28655q2.m87172p0(bVar);
                        } else {
                            bVar = objM87133R25;
                            c28655q2 = c28655q5;
                            i46 = 8;
                            c15247s2 = c15247s;
                        }
                        int i89 = r28 >> 24;
                        AbstractC28683x.m87254h(boolValueOf, boolValueOf2, (InterfaceC4351m) bVar, c28655q2);
                        f13 = i46;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * f13, c2314t);
                        c38072d = C38072d.f163053a;
                        int i94 = C38072d.f163054b;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3394p, c38072d.m121949b(c28655q2, i94).getTransparent(), AbstractC17918w0.f69621a);
                        float f15 = 4;
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * f15), C2299e.f9108K, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            c15247s3 = c15247s2;
                        } else {
                            c15247s3 = c15247s2;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                            if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                                c28655q2.m87150e0(1403767226);
                                C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                                String strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                                objM87133R15 = c28655q2.m87133R();
                                if (objM87133R15 == obj) {
                                    objM87133R15 = new C32375n(9);
                                    c28655q2.m87172p0(objM87133R15);
                                }
                                Modifier modifierM3390l = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                                if ((r35 & 14) != 4 || ((i35 & 8) != 0 && c28655q2.m87157i(mediaPickerLauncher))) {
                                    z39 = true;
                                } else {
                                    z39 = false;
                                }
                                objM87133R16 = c28655q2.m87133R();
                                if (!z39 || objM87133R16 == obj) {
                                    i64 = 0;
                                    objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                                    c28655q2.m87172p0(objM87133R16);
                                } else {
                                    i64 = 0;
                                }
                                C28655q c28655q6 = c28655q2;
                                AbstractC27242b1.m82092d(c27270o, strM21273g, null, modifierM3390l, (InterfaceC4339a) objM87133R16, c28655q6, C27270o.f109105k, 4);
                                c28655q6.m87173q(i64);
                                c28655q3 = c28655q6;
                            } else {
                                C28655q c28655q7 = c28655q2;
                                c28655q7.m87150e0(1404745524);
                                c28655q7.m87173q(false);
                                c28655q3 = c28655q7;
                            }
                            C27270o c27270o2 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
                            String strM21273g2 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
                            objM87133R4 = c28655q3.m87133R();
                            if (objM87133R4 == obj) {
                                objM87133R4 = new C32375n(10);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            Modifier modifierM3390l2 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
                            if ((r35 & 112) == 32) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R5 = c28655q3.m87133R();
                            if (!z27 || objM87133R5 == obj) {
                                i47 = 1;
                                objM87133R5 = new C32579a(interfaceC4339a7, i47);
                                c28655q3.m87172p0(objM87133R5);
                            } else {
                                i47 = 1;
                            }
                            i48 = i47;
                            AbstractC27242b1.m82092d(c27270o2, strM21273g2, null, modifierM3390l2, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
                            if ((r28 & 57344) == 16384) {
                                i49 = i48;
                            } else {
                                i49 = 0;
                            }
                            if ((r35 & 896) == 256) {
                                i54 = i48;
                            } else {
                                i54 = 0;
                            }
                            int i95 = i49 | i54;
                            if ((i77 & 7168) == 2048) {
                                i55 = i48;
                            } else {
                                i55 = 0;
                            }
                            int i96 = i95 | i55;
                            list4 = list3;
                            int i97 = i96 | (c28655q3.m87157i(list4) ? 1 : 0);
                            if ((r35 & 7168) == 2048) {
                                i56 = i48;
                            } else {
                                i56 = 0;
                            }
                            i57 = i56 | i97;
                            objM87133R6 = c28655q3.m87133R();
                            if (i57 == 0 || objM87133R6 == obj) {
                                obj2 = obj;
                                list5 = list4;
                                Function3 function15 = function7;
                                interfaceC4339a10 = interfaceC4339a8;
                                interfaceC28601c2 = interfaceC28601c1;
                                Object c32594d = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function15);
                                function11 = function15;
                                c28655q3.m87172p0(c32594d);
                                objM87133R6 = c32594d;
                            } else {
                                obj2 = obj;
                                list5 = list4;
                                function11 = function7;
                                interfaceC4339a10 = interfaceC4339a8;
                                interfaceC28601c2 = interfaceC28601c1;
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                            m101827S(state, interfaceC28601c2, c28655q3, (i89 & 14) | 48);
                            C15043i8 c15043i8 = C15043i8.f56313a;
                            C15247s c15247s4 = c15247s3;
                            c28655q4 = c28655q3;
                            InterfaceC4339a interfaceC4339a17 = interfaceC4339a7;
                            C15197y1 c15197y1M43130h = C15043i8.m43130h(r79.m121949b(c28655q3, i94).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i94).getBrandWhite(), 0L, r79.m121949b(c28655q3, i94).getTransparent(), c38072d.m121949b(c28655q3, i94).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
                            f14 = 1;
                            Modifier modifierM44456i = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM44456i);
                            c28655q4.m87158i0();
                            Function3 function16 = function11;
                            if (c28655q4.f115903S) {
                                interfaceC4339a12 = c0213j;
                                c28655q4.m87163l(interfaceC4339a12);
                            } else {
                                interfaceC4339a12 = c0213j;
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q4.f115903S) {
                                interfaceC4339a13 = interfaceC4339a10;
                            } else {
                                interfaceC4339a13 = interfaceC4339a10;
                                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                                    c0209i5 = c0209i3;
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                                if (list5 == null) {
                                    c28655q4.m87150e0(-793009074);
                                    c28655q4.m87173q(false);
                                    list6 = list5;
                                    z28 = false;
                                    function12 = function8;
                                    obj3 = obj2;
                                } else {
                                    c28655q4.m87150e0(-793009073);
                                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f14 * f13);
                                    list6 = list5;
                                    Modifier modifierM92100V = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, c28655q4, 6);
                                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM92100V);
                                    c28655q4.m87158i0();
                                    if (c28655q4.f115903S) {
                                        c28655q4.m87163l(interfaceC4339a12);
                                    } else {
                                        c28655q4.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a2);
                                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
                                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                                    }
                                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
                                    c28655q4.m87150e0(285190469);
                                    for (C26810l c26810l : list6) {
                                        boolean zM87157i2 = c28655q4.m87157i(c26810l);
                                        if ((r35 & 458752) == 131072) {
                                            z29 = true;
                                        } else {
                                            z29 = false;
                                        }
                                        z34 = zM87157i2 | z29;
                                        objM87133R7 = c28655q4.m87133R();
                                        if (z34) {
                                            obj4 = obj2;
                                        } else {
                                            obj4 = obj2;
                                            if (objM87133R7 == obj4) {
                                            }
                                            InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R7;
                                            boolean zM87157i3 = c28655q4.m87157i(c26810l);
                                            if ((r35 & 57344) == 16384) {
                                                z35 = true;
                                            } else {
                                                z35 = false;
                                            }
                                            z36 = zM87157i3 | z35;
                                            objM87133R8 = c28655q4.m87133R();
                                            if (!z36 || objM87133R8 == obj4) {
                                                function13 = function8;
                                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                                c28655q4.m87172p0(objM87133R8);
                                            } else {
                                                function13 = function8;
                                            }
                                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a18, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                            obj2 = obj4;
                                            function8 = function13;
                                        }
                                        objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                                        c28655q4.m87172p0(objM87133R7);
                                        InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R7;
                                        boolean zM87157i4 = c28655q4.m87157i(c26810l);
                                        if ((r35 & 57344) == 16384) {
                                            z35 = true;
                                        } else {
                                            z35 = false;
                                        }
                                        z36 = zM87157i4 | z35;
                                        objM87133R8 = c28655q4.m87133R();
                                        if (z36) {
                                            function13 = function8;
                                            objM87133R8 = new C32580a0(3, c26810l, function13);
                                            c28655q4.m87172p0(objM87133R8);
                                        } else {
                                            function13 = function8;
                                            objM87133R8 = new C32580a0(3, c26810l, function13);
                                            c28655q4.m87172p0(objM87133R8);
                                        }
                                        AbstractC32688w1.m102571e(c26810l, interfaceC4339a19, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                        obj2 = obj4;
                                        function8 = function13;
                                    }
                                    function12 = function8;
                                    obj3 = obj2;
                                    z28 = false;
                                    AbstractC25012a.m73392y(c28655q4, false, true, false);
                                }
                                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, c2314t);
                                InterfaceC0221l.f734a.getClass();
                                interfaceC4339a14 = C0217k.f724b;
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a14);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d);
                                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m4);
                                c0209i6 = C0217k.f732j;
                                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                                }
                                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N4);
                                Modifier modifierM3483b = AbstractC1126a.m3483b(c2314t, c15247s4);
                                if ((r35 & 234881024) == 67108864) {
                                    z37 = true;
                                } else {
                                    z37 = false;
                                }
                                objM87133R9 = c28655q4.m87133R();
                                if (!z37 || objM87133R9 == obj3) {
                                    function14 = function10;
                                    objM87133R9 = new C32599e(function14, 0);
                                    c28655q4.m87172p0(objM87133R9);
                                } else {
                                    function14 = function10;
                                }
                                Modifier modifierM3413j = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b, (Function1) objM87133R9), 0.0f, 30 * f15, 1);
                                TextResource textResourceM21278l = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                C39174f c39174f = new C39174f(f15 * f15);
                                if ((AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue()) && z4) || z13) {
                                    c28655q4.m87150e0(-1122964640);
                                    c28655q4.m87173q(false);
                                    interfaceC39332eM125323a = sendFieldColor;
                                } else {
                                    c28655q4.m87150e0(-1122965528);
                                    objM87133R10 = c28655q4.m87133R();
                                    if (objM87133R10 == obj3) {
                                        objM87133R10 = a.f135200w;
                                        c28655q4.m87172p0(objM87133R10);
                                    }
                                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                                    c28655q4.m87173q(false);
                                }
                                if (z4 && !AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                                    abstractC17911tM43972A = AbstractC15673b0.m43972A();
                                }
                                AbstractC30784c.a aVar = new AbstractC30784c.a(i13, c39174f, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                                if (z4) {
                                    i58 = 4;
                                } else {
                                    i58 = 0;
                                }
                                zM87153g = c28655q4.m87153g(interfaceC4339a11);
                                objM87133R11 = c28655q4.m87133R();
                                if (zM87153g || objM87133R11 == obj3) {
                                    objM87133R11 = new C32604f(interfaceC4339a11, 0);
                                    c28655q4.m87172p0(objM87133R11);
                                }
                                C34348q0 c34348q0 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f15);
                                textResource = placeholderMessage;
                                i59 = 0;
                                C37816b c37816bM121344e = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                                objM87133R12 = c28655q4.m87133R();
                                if (objM87133R12 == obj3) {
                                    objM87133R12 = new C32614h(i59, interfaceC28601c2);
                                    c28655q4.m87172p0(objM87133R12);
                                }
                                Function1 function17 = (Function1) objM87133R12;
                                int i98 = TextResource.$stable;
                                Function1 function18 = function12;
                                AbstractC30792k.m94678l(modifierM3413j, textResourceM21278l, null, null, null, null, c37816bM121344e, aVar, textResourceM21267a, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e, c15197y1M43130h, null, null, c34348q0, interfaceC4339a11, function17, c28655q4, (i98 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i98 << 24), 224256, 3078, 48, 426647100, 0);
                                if (z4) {
                                    interfaceC4339a15 = r7;
                                    c28655q4.m87150e0(-450607472);
                                    c28655q4.m87173q(false);
                                } else {
                                    c28655q4.m87150e0(-450989950);
                                    Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t);
                                    objM87133R13 = c28655q4.m87133R();
                                    if (objM87133R13 == obj3) {
                                        objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                                    }
                                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R13;
                                    if ((i37 & 14) == 4) {
                                        z38 = true;
                                    } else {
                                        z38 = false;
                                    }
                                    objM87133R14 = c28655q4.m87133R();
                                    if (!z38 || objM87133R14 == obj3) {
                                        interfaceC4339a15 = r7;
                                        objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                        c28655q4.m87172p0(objM87133R14);
                                    } else {
                                        interfaceC4339a15 = interfaceC4339a16;
                                    }
                                    AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                                    c28655q4.m87173q(false);
                                }
                                AbstractC25012a.m73392y(c28655q4, true, true, true);
                                function4 = function16;
                                interfaceC4339a5 = interfaceC4339a13;
                                interfaceC4351m3 = interfaceC4351m5;
                                function5 = function14;
                                interfaceC4339a6 = interfaceC4339a15;
                                c28655q = c28655q4;
                                function6 = function18;
                                interfaceC4339a4 = interfaceC4339a17;
                                list2 = list6;
                                interfaceC4351m4 = interfaceC4351m6;
                            }
                            c0209i5 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                            if (list5 == null) {
                                c28655q4.m87150e0(-793009074);
                                c28655q4.m87173q(false);
                                list6 = list5;
                                z28 = false;
                                function12 = function8;
                                obj3 = obj2;
                            } else {
                                c28655q4.m87150e0(-793009073);
                                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14 * f13);
                                list6 = list5;
                                Modifier modifierM92100V2 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22971kM66746i2, C2299e.f9107J, c28655q4, 6);
                                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM92100V2);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a12);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a3);
                                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m5);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N5);
                                c28655q4.m87150e0(285190469);
                                while (r2.hasNext()) {
                                    boolean zM87157i5 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 458752) == 131072) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    z34 = zM87157i5 | z29;
                                    objM87133R7 = c28655q4.m87133R();
                                    if (z34) {
                                        obj4 = obj2;
                                        if (objM87133R7 == obj4) {
                                        }
                                        InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R7;
                                        boolean zM87157i6 = c28655q4.m87157i(c26810l);
                                        if ((r35 & 57344) == 16384) {
                                            z35 = true;
                                        } else {
                                            z35 = false;
                                        }
                                        z36 = zM87157i6 | z35;
                                        objM87133R8 = c28655q4.m87133R();
                                        if (z36) {
                                            function13 = function8;
                                            objM87133R8 = new C32580a0(3, c26810l, function13);
                                            c28655q4.m87172p0(objM87133R8);
                                        } else {
                                            function13 = function8;
                                            objM87133R8 = new C32580a0(3, c26810l, function13);
                                            c28655q4.m87172p0(objM87133R8);
                                        }
                                        AbstractC32688w1.m102571e(c26810l, interfaceC4339a110, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                        obj2 = obj4;
                                        function8 = function13;
                                    } else {
                                        obj4 = obj2;
                                    }
                                    objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                                    c28655q4.m87172p0(objM87133R7);
                                    InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R7;
                                    boolean zM87157i7 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 57344) == 16384) {
                                        z35 = true;
                                    } else {
                                        z35 = false;
                                    }
                                    z36 = zM87157i7 | z35;
                                    objM87133R8 = c28655q4.m87133R();
                                    if (z36) {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    } else {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    }
                                    AbstractC32688w1.m102571e(c26810l, interfaceC4339a111, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                    obj2 = obj4;
                                    function8 = function13;
                                }
                                function12 = function8;
                                obj3 = obj2;
                                z28 = false;
                                AbstractC25012a.m73392y(c28655q4, false, true, false);
                            }
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                            iHashCode4 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            interfaceC4339a14 = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a14);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m6);
                            c0209i6 = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N6);
                            Modifier modifierM3483b2 = AbstractC1126a.m3483b(c2314t, c15247s4);
                            if ((r35 & 234881024) == 67108864) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            objM87133R9 = c28655q4.m87133R();
                            if (z37) {
                                function14 = function10;
                                objM87133R9 = new C32599e(function14, 0);
                                c28655q4.m87172p0(objM87133R9);
                            } else {
                                function14 = function10;
                                objM87133R9 = new C32599e(function14, 0);
                                c28655q4.m87172p0(objM87133R9);
                            }
                            Modifier modifierM3413j2 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b2, (Function1) objM87133R9), 0.0f, 30 * f15, 1);
                            TextResource textResourceM21278l2 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                            C39174f c39174f2 = new C39174f(f15 * f15);
                            if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                                c28655q4.m87150e0(-1122965528);
                                objM87133R10 = c28655q4.m87133R();
                                if (objM87133R10 == obj3) {
                                    objM87133R10 = a.f135200w;
                                    c28655q4.m87172p0(objM87133R10);
                                }
                                interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(-1122965528);
                                objM87133R10 = c28655q4.m87133R();
                                if (objM87133R10 == obj3) {
                                    objM87133R10 = a.f135200w;
                                    c28655q4.m87172p0(objM87133R10);
                                }
                                interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                                c28655q4.m87173q(false);
                            }
                            if (z4) {
                                abstractC17911tM43972A = AbstractC15673b0.m43972A();
                            }
                            AbstractC30784c.a aVar2 = new AbstractC30784c.a(i13, c39174f2, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                            if (z4) {
                                i58 = 4;
                            } else {
                                i58 = 0;
                            }
                            zM87153g = c28655q4.m87153g(interfaceC4339a11);
                            objM87133R11 = c28655q4.m87133R();
                            if (zM87153g) {
                                objM87133R11 = new C32604f(interfaceC4339a11, 0);
                                c28655q4.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32604f(interfaceC4339a11, 0);
                                c28655q4.m87172p0(objM87133R11);
                            }
                            C34348q0 c34348q1 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f15);
                            textResource = placeholderMessage;
                            i59 = 0;
                            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                            objM87133R12 = c28655q4.m87133R();
                            if (objM87133R12 == obj3) {
                                objM87133R12 = new C32614h(i59, interfaceC28601c2);
                                c28655q4.m87172p0(objM87133R12);
                            }
                            Function1 function19 = (Function1) objM87133R12;
                            int i99 = TextResource.$stable;
                            Function1 function110 = function12;
                            AbstractC30792k.m94678l(modifierM3413j2, textResourceM21278l2, null, null, null, null, c37816bM121344e2, aVar2, textResourceM21267a2, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e2, c15197y1M43130h, null, null, c34348q1, interfaceC4339a11, function19, c28655q4, (i99 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i99 << 24), 224256, 3078, 48, 426647100, 0);
                            if (z4) {
                                c28655q4.m87150e0(-450989950);
                                Modifier modifierMo3401b2 = C1100b.f4583a.mo3401b(c2314t);
                                objM87133R13 = c28655q4.m87133R();
                                if (objM87133R13 == obj3) {
                                    objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                                }
                                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R13;
                                if ((i37 & 14) == 4) {
                                    z38 = true;
                                } else {
                                    z38 = false;
                                }
                                objM87133R14 = c28655q4.m87133R();
                                if (z38) {
                                    interfaceC4339a15 = r7;
                                    objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                    c28655q4.m87172p0(objM87133R14);
                                } else {
                                    interfaceC4339a15 = r7;
                                    objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                    c28655q4.m87172p0(objM87133R14);
                                }
                                AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b2, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                                c28655q4.m87173q(false);
                            } else {
                                interfaceC4339a15 = r7;
                                c28655q4.m87150e0(-450607472);
                                c28655q4.m87173q(false);
                            }
                            AbstractC25012a.m73392y(c28655q4, true, true, true);
                            function4 = function16;
                            interfaceC4339a5 = interfaceC4339a13;
                            interfaceC4351m3 = interfaceC4351m5;
                            function5 = function14;
                            interfaceC4339a6 = interfaceC4339a15;
                            c28655q = c28655q4;
                            function6 = function110;
                            interfaceC4339a4 = interfaceC4339a17;
                            list2 = list6;
                            interfaceC4351m4 = interfaceC4351m6;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                        if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                            c28655q2.m87150e0(1403767226);
                            C27270o c27270o3 = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                            String strM21273g3 = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                            objM87133R15 = c28655q2.m87133R();
                            if (objM87133R15 == obj) {
                                objM87133R15 = new C32375n(9);
                                c28655q2.m87172p0(objM87133R15);
                            }
                            Modifier modifierM3390l3 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                            if ((r35 & 14) != 4) {
                                z39 = true;
                            } else {
                                z39 = true;
                            }
                            objM87133R16 = c28655q2.m87133R();
                            if (z39) {
                                i64 = 0;
                                objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                                c28655q2.m87172p0(objM87133R16);
                            } else {
                                i64 = 0;
                                objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                                c28655q2.m87172p0(objM87133R16);
                            }
                            C28655q c28655q8 = c28655q2;
                            AbstractC27242b1.m82092d(c27270o3, strM21273g3, null, modifierM3390l3, (InterfaceC4339a) objM87133R16, c28655q8, C27270o.f109105k, 4);
                            c28655q8.m87173q(i64);
                            c28655q3 = c28655q8;
                        } else {
                            C28655q c28655q9 = c28655q2;
                            c28655q9.m87150e0(1404745524);
                            c28655q9.m87173q(false);
                            c28655q3 = c28655q9;
                        }
                        C27270o c27270o4 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
                        String strM21273g4 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == obj) {
                            objM87133R4 = new C32375n(10);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        Modifier modifierM3390l4 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
                        if ((r35 & 112) == 32) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        if (z27) {
                            i47 = 1;
                            objM87133R5 = new C32579a(interfaceC4339a7, i47);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            i47 = 1;
                            objM87133R5 = new C32579a(interfaceC4339a7, i47);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        i48 = i47;
                        AbstractC27242b1.m82092d(c27270o4, strM21273g4, null, modifierM3390l4, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
                        if ((r28 & 57344) == 16384) {
                            i49 = i48;
                        } else {
                            i49 = 0;
                        }
                        if ((r35 & 896) == 256) {
                            i54 = i48;
                        } else {
                            i54 = 0;
                        }
                        int i910 = i49 | i54;
                        if ((i77 & 7168) == 2048) {
                            i55 = i48;
                        } else {
                            i55 = 0;
                        }
                        int i911 = i910 | i55;
                        list4 = list3;
                        int i912 = i911 | (c28655q3.m87157i(list4) ? 1 : 0);
                        if ((r35 & 7168) == 2048) {
                            i56 = i48;
                        } else {
                            i56 = 0;
                        }
                        i57 = i56 | i912;
                        objM87133R6 = c28655q3.m87133R();
                        if (i57 == 0) {
                            obj2 = obj;
                            list5 = list4;
                            Function3 function111 = function7;
                            interfaceC4339a10 = interfaceC4339a8;
                            interfaceC28601c2 = interfaceC28601c1;
                            Object c32594d2 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function111);
                            function11 = function111;
                            c28655q3.m87172p0(c32594d2);
                            objM87133R6 = c32594d2;
                        } else {
                            obj2 = obj;
                            list5 = list4;
                            Function3 function112 = function7;
                            interfaceC4339a10 = interfaceC4339a8;
                            interfaceC28601c2 = interfaceC28601c1;
                            Object c32594d3 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function112);
                            function11 = function112;
                            c28655q3.m87172p0(c32594d3);
                            objM87133R6 = c32594d3;
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                        m101827S(state, interfaceC28601c2, c28655q3, (i89 & 14) | 48);
                        C15043i8 c15043i9 = C15043i8.f56313a;
                        C15247s c15247s5 = c15247s3;
                        c28655q4 = c28655q3;
                        InterfaceC4339a interfaceC4339a112 = interfaceC4339a7;
                        C15197y1 c15197y1M43130h2 = C15043i8.m43130h(r79.m121949b(c28655q3, i94).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i94).getBrandWhite(), 0L, r79.m121949b(c28655q3, i94).getTransparent(), c38072d.m121949b(c28655q3, i94).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
                        f14 = 1;
                        Modifier modifierM44456i2 = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM44456i2);
                        c28655q4.m87158i0();
                        Function3 function113 = function11;
                        if (c28655q4.f115903S) {
                            interfaceC4339a12 = c0213j;
                            c28655q4.m87163l(interfaceC4339a12);
                        } else {
                            interfaceC4339a12 = c0213j;
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m7);
                        if (c28655q4.f115903S) {
                            interfaceC4339a13 = interfaceC4339a10;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                                c0209i5 = c0209i3;
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N7);
                            if (list5 == null) {
                                c28655q4.m87150e0(-793009074);
                                c28655q4.m87173q(false);
                                list6 = list5;
                                z28 = false;
                                function12 = function8;
                                obj3 = obj2;
                            } else {
                                c28655q4.m87150e0(-793009073);
                                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f14 * f13);
                                list6 = list5;
                                Modifier modifierM92100V3 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22971kM66746i3, C2299e.f9107J, c28655q4, 6);
                                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM92100V3);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a12);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a4);
                                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m8);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N8);
                                c28655q4.m87150e0(285190469);
                                while (r2.hasNext()) {
                                    boolean zM87157i8 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 458752) == 131072) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    z34 = zM87157i8 | z29;
                                    objM87133R7 = c28655q4.m87133R();
                                    if (z34) {
                                        obj4 = obj2;
                                        if (objM87133R7 == obj4) {
                                        }
                                        InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R7;
                                        boolean zM87157i9 = c28655q4.m87157i(c26810l);
                                        if ((r35 & 57344) == 16384) {
                                            z35 = true;
                                        } else {
                                            z35 = false;
                                        }
                                        z36 = zM87157i9 | z35;
                                        objM87133R8 = c28655q4.m87133R();
                                        if (z36) {
                                            function13 = function8;
                                            objM87133R8 = new C32580a0(3, c26810l, function13);
                                            c28655q4.m87172p0(objM87133R8);
                                        } else {
                                            function13 = function8;
                                            objM87133R8 = new C32580a0(3, c26810l, function13);
                                            c28655q4.m87172p0(objM87133R8);
                                        }
                                        AbstractC32688w1.m102571e(c26810l, interfaceC4339a113, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                        obj2 = obj4;
                                        function8 = function13;
                                    } else {
                                        obj4 = obj2;
                                    }
                                    objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                                    c28655q4.m87172p0(objM87133R7);
                                    InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R7;
                                    boolean zM87157i10 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 57344) == 16384) {
                                        z35 = true;
                                    } else {
                                        z35 = false;
                                    }
                                    z36 = zM87157i10 | z35;
                                    objM87133R8 = c28655q4.m87133R();
                                    if (z36) {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    } else {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    }
                                    AbstractC32688w1.m102571e(c26810l, interfaceC4339a114, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                    obj2 = obj4;
                                    function8 = function13;
                                }
                                function12 = function8;
                                obj3 = obj2;
                                z28 = false;
                                AbstractC25012a.m73392y(c28655q4, false, true, false);
                            }
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                            iHashCode4 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            interfaceC4339a14 = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a14);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m9);
                            c0209i6 = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N9);
                            Modifier modifierM3483b3 = AbstractC1126a.m3483b(c2314t, c15247s5);
                            if ((r35 & 234881024) == 67108864) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            objM87133R9 = c28655q4.m87133R();
                            if (z37) {
                                function14 = function10;
                                objM87133R9 = new C32599e(function14, 0);
                                c28655q4.m87172p0(objM87133R9);
                            } else {
                                function14 = function10;
                                objM87133R9 = new C32599e(function14, 0);
                                c28655q4.m87172p0(objM87133R9);
                            }
                            Modifier modifierM3413j3 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b3, (Function1) objM87133R9), 0.0f, 30 * f15, 1);
                            TextResource textResourceM21278l3 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                            C39174f c39174f3 = new C39174f(f15 * f15);
                            if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                                c28655q4.m87150e0(-1122965528);
                                objM87133R10 = c28655q4.m87133R();
                                if (objM87133R10 == obj3) {
                                    objM87133R10 = a.f135200w;
                                    c28655q4.m87172p0(objM87133R10);
                                }
                                interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(-1122965528);
                                objM87133R10 = c28655q4.m87133R();
                                if (objM87133R10 == obj3) {
                                    objM87133R10 = a.f135200w;
                                    c28655q4.m87172p0(objM87133R10);
                                }
                                interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                                c28655q4.m87173q(false);
                            }
                            if (z4) {
                                abstractC17911tM43972A = AbstractC15673b0.m43972A();
                            }
                            AbstractC30784c.a aVar3 = new AbstractC30784c.a(i13, c39174f3, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                            if (z4) {
                                i58 = 4;
                            } else {
                                i58 = 0;
                            }
                            zM87153g = c28655q4.m87153g(interfaceC4339a11);
                            objM87133R11 = c28655q4.m87133R();
                            if (zM87153g) {
                                objM87133R11 = new C32604f(interfaceC4339a11, 0);
                                c28655q4.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32604f(interfaceC4339a11, 0);
                                c28655q4.m87172p0(objM87133R11);
                            }
                            C34348q0 c34348q2 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                            C33252i c33252iM105489e3 = AbstractC33253j.m105489e(3 * f15);
                            textResource = placeholderMessage;
                            i59 = 0;
                            C37816b c37816bM121344e3 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                            objM87133R12 = c28655q4.m87133R();
                            if (objM87133R12 == obj3) {
                                objM87133R12 = new C32614h(i59, interfaceC28601c2);
                                c28655q4.m87172p0(objM87133R12);
                            }
                            Function1 function114 = (Function1) objM87133R12;
                            int i913 = TextResource.$stable;
                            Function1 function115 = function12;
                            AbstractC30792k.m94678l(modifierM3413j3, textResourceM21278l3, null, null, null, null, c37816bM121344e3, aVar3, textResourceM21267a3, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e3, c15197y1M43130h2, null, null, c34348q2, interfaceC4339a11, function114, c28655q4, (i913 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i913 << 24), 224256, 3078, 48, 426647100, 0);
                            if (z4) {
                                c28655q4.m87150e0(-450989950);
                                Modifier modifierMo3401b3 = C1100b.f4583a.mo3401b(c2314t);
                                objM87133R13 = c28655q4.m87133R();
                                if (objM87133R13 == obj3) {
                                    objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                                }
                                InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R13;
                                if ((i37 & 14) == 4) {
                                    z38 = true;
                                } else {
                                    z38 = false;
                                }
                                objM87133R14 = c28655q4.m87133R();
                                if (z38) {
                                    interfaceC4339a15 = r7;
                                    objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                    c28655q4.m87172p0(objM87133R14);
                                } else {
                                    interfaceC4339a15 = r7;
                                    objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                    c28655q4.m87172p0(objM87133R14);
                                }
                                AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b3, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                                c28655q4.m87173q(false);
                            } else {
                                interfaceC4339a15 = r7;
                                c28655q4.m87150e0(-450607472);
                                c28655q4.m87173q(false);
                            }
                            AbstractC25012a.m73392y(c28655q4, true, true, true);
                            function4 = function113;
                            interfaceC4339a5 = interfaceC4339a13;
                            interfaceC4351m3 = interfaceC4351m5;
                            function5 = function14;
                            interfaceC4339a6 = interfaceC4339a15;
                            c28655q = c28655q4;
                            function6 = function115;
                            interfaceC4339a4 = interfaceC4339a112;
                            list2 = list6;
                            interfaceC4351m4 = interfaceC4351m6;
                        } else {
                            interfaceC4339a13 = interfaceC4339a10;
                        }
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N7);
                        if (list5 == null) {
                            c28655q4.m87150e0(-793009074);
                            c28655q4.m87173q(false);
                            list6 = list5;
                            z28 = false;
                            function12 = function8;
                            obj3 = obj2;
                        } else {
                            c28655q4.m87150e0(-793009073);
                            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f14 * f13);
                            list6 = list5;
                            Modifier modifierM92100V4 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22971kM66746i4, C2299e.f9107J, c28655q4, 6);
                            iHashCode3 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM92100V4);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a12);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a5);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m10);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
                            c28655q4.m87150e0(285190469);
                            while (r2.hasNext()) {
                                boolean zM87157i11 = c28655q4.m87157i(c26810l);
                                if ((r35 & 458752) == 131072) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                z34 = zM87157i11 | z29;
                                objM87133R7 = c28655q4.m87133R();
                                if (z34) {
                                    obj4 = obj2;
                                    if (objM87133R7 == obj4) {
                                    }
                                    InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R7;
                                    boolean zM87157i12 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 57344) == 16384) {
                                        z35 = true;
                                    } else {
                                        z35 = false;
                                    }
                                    z36 = zM87157i12 | z35;
                                    objM87133R8 = c28655q4.m87133R();
                                    if (z36) {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    } else {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    }
                                    AbstractC32688w1.m102571e(c26810l, interfaceC4339a115, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                    obj2 = obj4;
                                    function8 = function13;
                                } else {
                                    obj4 = obj2;
                                }
                                objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                                c28655q4.m87172p0(objM87133R7);
                                InterfaceC4339a interfaceC4339a116 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i13 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i13 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a116, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            }
                            function12 = function8;
                            obj3 = obj2;
                            z28 = false;
                            AbstractC25012a.m73392y(c28655q4, false, true, false);
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                        iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a14 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a14);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i6 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11);
                        Modifier modifierM3483b4 = AbstractC1126a.m3483b(c2314t, c15247s5);
                        if ((r35 & 234881024) == 67108864) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R9 = c28655q4.m87133R();
                        if (z37) {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        } else {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        Modifier modifierM3413j4 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b4, (Function1) objM87133R9), 0.0f, 30 * f15, 1);
                        TextResource textResourceM21278l4 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                        C39174f c39174f4 = new C39174f(f15 * f15);
                        if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        }
                        if (z4) {
                            abstractC17911tM43972A = AbstractC15673b0.m43972A();
                        }
                        AbstractC30784c.a aVar4 = new AbstractC30784c.a(i13, c39174f4, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                        if (z4) {
                            i58 = 4;
                        } else {
                            i58 = 0;
                        }
                        zM87153g = c28655q4.m87153g(interfaceC4339a11);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87153g) {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        C34348q0 c34348q3 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                        C33252i c33252iM105489e4 = AbstractC33253j.m105489e(3 * f15);
                        textResource = placeholderMessage;
                        i59 = 0;
                        C37816b c37816bM121344e4 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == obj3) {
                            objM87133R12 = new C32614h(i59, interfaceC28601c2);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        Function1 function116 = (Function1) objM87133R12;
                        int i914 = TextResource.$stable;
                        Function1 function117 = function12;
                        AbstractC30792k.m94678l(modifierM3413j4, textResourceM21278l4, null, null, null, null, c37816bM121344e4, aVar4, textResourceM21267a4, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e4, c15197y1M43130h2, null, null, c34348q3, interfaceC4339a11, function116, c28655q4, (i914 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i914 << 24), 224256, 3078, 48, 426647100, 0);
                        if (z4) {
                            c28655q4.m87150e0(-450989950);
                            Modifier modifierMo3401b4 = C1100b.f4583a.mo3401b(c2314t);
                            objM87133R13 = c28655q4.m87133R();
                            if (objM87133R13 == obj3) {
                                objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                            }
                            InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R13;
                            if ((i37 & 14) == 4) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            objM87133R14 = c28655q4.m87133R();
                            if (z38) {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            } else {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            }
                            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b4, interfaceC21083i5, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                            c28655q4.m87173q(false);
                        } else {
                            interfaceC4339a15 = r7;
                            c28655q4.m87150e0(-450607472);
                            c28655q4.m87173q(false);
                        }
                        AbstractC25012a.m73392y(c28655q4, true, true, true);
                        function4 = function113;
                        interfaceC4339a5 = interfaceC4339a13;
                        interfaceC4351m3 = interfaceC4351m5;
                        function5 = function14;
                        interfaceC4339a6 = interfaceC4339a15;
                        c28655q = c28655q4;
                        function6 = function117;
                        interfaceC4339a4 = interfaceC4339a112;
                        list2 = list6;
                        interfaceC4351m4 = interfaceC4351m6;
                    } else {
                        textResource = placeholderMessage;
                        c28655q5.m87138X();
                        interfaceC4339a4 = interfaceC4339a;
                        interfaceC4339a5 = interfaceC4339a2;
                        function4 = function3;
                        interfaceC4351m3 = interfaceC4351m;
                        list2 = list;
                        function5 = function2;
                        interfaceC4351m4 = interfaceC4351m2;
                        interfaceC4339a6 = interfaceC4339a3;
                        c28655q = c28655q5;
                        function6 = function1;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final TextResource textResource2 = textResource;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj5, Object obj6) {
                                int iIntValue = ((Integer) obj6).intValue();
                                return AbstractC32619i.m101820L(i13, sendFieldColor, textResource2, z4, z13, z14, listState, z15, state, z16, mediaPickerLauncher, interfaceC4339a4, interfaceC4339a5, function4, function6, interfaceC4351m3, list2, interfaceC15250v, function5, interfaceC4351m4, interfaceC4339a6, i14, i15, i16, i17, (Composer) obj5, iIntValue);
                            }
                        };
                    }
                }
                if (c28655q5.m87135U(i77 & 1, z17)) {
                    i44 = 15;
                    obj = C28635l.f115821a;
                    if (i79 != 0) {
                        objM87133R24 = c28655q5.m87133R();
                        if (objM87133R24 == obj) {
                            objM87133R24 = new C32513d(i44);
                            c28655q5.m87172p0(objM87133R24);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R24;
                    } else {
                        interfaceC4339a7 = interfaceC4339a;
                    }
                    if (i84 != 0) {
                        objM87133R23 = c28655q5.m87133R();
                        if (objM87133R23 == obj) {
                            objM87133R23 = new C32513d(16);
                            c28655q5.m87172p0(objM87133R23);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R23;
                    } else {
                        interfaceC4339a8 = interfaceC4339a2;
                    }
                    i45 = 9;
                    if (i86 != 0) {
                        objM87133R22 = c28655q5.m87133R();
                        if (objM87133R22 == obj) {
                            objM87133R22 = new C30745a(i45);
                            c28655q5.m87172p0(objM87133R22);
                        }
                        function7 = (Function3) objM87133R22;
                    } else {
                        function7 = function3;
                    }
                    if (i88 != 0) {
                        objM87133R21 = c28655q5.m87133R();
                        if (objM87133R21 == obj) {
                            objM87133R21 = new C32375n(7);
                            c28655q5.m87172p0(objM87133R21);
                        }
                        function8 = (Function1) objM87133R21;
                    } else {
                        function8 = function1;
                    }
                    if (i25 != 0) {
                        objM87133R20 = c28655q5.m87133R();
                        if (objM87133R20 == obj) {
                            objM87133R20 = new C31314a(15);
                            c28655q5.m87172p0(objM87133R20);
                        }
                        interfaceC4351m5 = (InterfaceC4351m) objM87133R20;
                    } else {
                        interfaceC4351m5 = interfaceC4351m;
                    }
                    abstractC17911tM43972A = null;
                    if (i27 != 0) {
                        list3 = null;
                    } else {
                        list3 = list;
                    }
                    if (i29 != 0) {
                        objM87133R19 = c28655q5.m87133R();
                        if (objM87133R19 == obj) {
                            objM87133R19 = new C32375n(8);
                            c28655q5.m87172p0(objM87133R19);
                        }
                        function9 = (Function1) objM87133R19;
                    } else {
                        interfaceC4351m5 = interfaceC4351m5;
                        function9 = function2;
                    }
                    if (i34 != 0) {
                        objM87133R18 = c28655q5.m87133R();
                        if (objM87133R18 == obj) {
                            objM87133R18 = new C31314a(16);
                            c28655q5.m87172p0(objM87133R18);
                        }
                        interfaceC4351m6 = (InterfaceC4351m) objM87133R18;
                    } else {
                        interfaceC4339a8 = interfaceC4339a8;
                        interfaceC4351m6 = interfaceC4351m2;
                    }
                    if (i36 != 0) {
                        objM87133R17 = c28655q5.m87133R();
                        if (objM87133R17 == obj) {
                            objM87133R17 = new C32513d(17);
                            c28655q5.m87172p0(objM87133R17);
                        }
                        interfaceC4339a9 = (InterfaceC4339a) objM87133R17;
                    } else {
                        interfaceC4339a9 = interfaceC4339a3;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    InterfaceC4339a interfaceC4339a117 = interfaceC4339a9;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = AbstractC33745d.m106649h(c28655q5);
                    }
                    c15247s = (C15247s) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = AbstractC11266d.m30453g(c28655q5);
                    }
                    interfaceC21083i = (InterfaceC21083i) objM87133R3;
                    function10 = function9;
                    if (((Boolean) AbstractC15751g.m44460m(interfaceC21083i, c28655q5, 6).getValue()).booleanValue()) {
                        if (interfaceC15250v != null) {
                            z44 = false;
                        } else {
                            z44 = false;
                        }
                        if (z44) {
                            interfaceC4351m6.invoke(C38423a.a.OPEN, Boolean.TRUE);
                        }
                    }
                    featureFlagChecker = (FeatureFlagChecker) c28655q5.m87161k(AbstractC38073e.m121968p());
                    Boolean boolValueOf3 = Boolean.valueOf(z15);
                    Boolean boolValueOf4 = Boolean.valueOf(z16);
                    if ((i77 & 29360128) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zM87157i14 = z18 | c28655q5.m87157i(interfaceC15250v);
                    if ((i35 & 1879048192) == 536870912) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z47 = zM87157i14 | z19;
                    if ((i77 & 3670016) == 1048576) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z48 = z47 | z24;
                    if ((i77 & 1879048192) == 536870912) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z48 | z25;
                    Object objM87133R26 = c28655q5.m87133R();
                    if (z26) {
                        c28655q2 = c28655q5;
                        i46 = 8;
                        bVar = new b(z15, interfaceC15250v, interfaceC4351m6, c15247s, listState, z16, null);
                        c15247s2 = c15247s;
                        c28655q2.m87172p0(bVar);
                    } else {
                        c28655q2 = c28655q5;
                        i46 = 8;
                        bVar = new b(z15, interfaceC15250v, interfaceC4351m6, c15247s, listState, z16, null);
                        c15247s2 = c15247s;
                        c28655q2.m87172p0(bVar);
                    }
                    int i810 = r28 >> 24;
                    AbstractC28683x.m87254h(boolValueOf3, boolValueOf4, (InterfaceC4351m) bVar, c28655q2);
                    f13 = i46;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 1.5d) * f13, c2314t);
                    c38072d = C38072d.f163053a;
                    int i915 = C38072d.f163054b;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM3394p2, c38072d.m121949b(c28655q2, i915).getTransparent(), AbstractC17918w0.f69621a);
                    float f16 = 4;
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * f16), C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3358c2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a6);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m12);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c15247s3 = c15247s2;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N12);
                        if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                            c28655q2.m87150e0(1403767226);
                            C27270o c27270o5 = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                            String strM21273g5 = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                            objM87133R15 = c28655q2.m87133R();
                            if (objM87133R15 == obj) {
                                objM87133R15 = new C32375n(9);
                                c28655q2.m87172p0(objM87133R15);
                            }
                            Modifier modifierM3390l5 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                            if ((r35 & 14) != 4) {
                                z39 = true;
                            } else {
                                z39 = true;
                            }
                            objM87133R16 = c28655q2.m87133R();
                            if (z39) {
                                i64 = 0;
                                objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                                c28655q2.m87172p0(objM87133R16);
                            } else {
                                i64 = 0;
                                objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                                c28655q2.m87172p0(objM87133R16);
                            }
                            C28655q c28655q10 = c28655q2;
                            AbstractC27242b1.m82092d(c27270o5, strM21273g5, null, modifierM3390l5, (InterfaceC4339a) objM87133R16, c28655q10, C27270o.f109105k, 4);
                            c28655q10.m87173q(i64);
                            c28655q3 = c28655q10;
                        } else {
                            C28655q c28655q11 = c28655q2;
                            c28655q11.m87150e0(1404745524);
                            c28655q11.m87173q(false);
                            c28655q3 = c28655q11;
                        }
                        C27270o c27270o6 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
                        String strM21273g6 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == obj) {
                            objM87133R4 = new C32375n(10);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        Modifier modifierM3390l6 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
                        if ((r35 & 112) == 32) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R5 = c28655q3.m87133R();
                        if (z27) {
                            i47 = 1;
                            objM87133R5 = new C32579a(interfaceC4339a7, i47);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            i47 = 1;
                            objM87133R5 = new C32579a(interfaceC4339a7, i47);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        i48 = i47;
                        AbstractC27242b1.m82092d(c27270o6, strM21273g6, null, modifierM3390l6, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
                        if ((r28 & 57344) == 16384) {
                            i49 = i48;
                        } else {
                            i49 = 0;
                        }
                        if ((r35 & 896) == 256) {
                            i54 = i48;
                        } else {
                            i54 = 0;
                        }
                        int i916 = i49 | i54;
                        if ((i77 & 7168) == 2048) {
                            i55 = i48;
                        } else {
                            i55 = 0;
                        }
                        int i917 = i916 | i55;
                        list4 = list3;
                        int i918 = i917 | (c28655q3.m87157i(list4) ? 1 : 0);
                        if ((r35 & 7168) == 2048) {
                            i56 = i48;
                        } else {
                            i56 = 0;
                        }
                        i57 = i56 | i918;
                        objM87133R6 = c28655q3.m87133R();
                        if (i57 == 0) {
                            obj2 = obj;
                            list5 = list4;
                            Function3 function118 = function7;
                            interfaceC4339a10 = interfaceC4339a8;
                            interfaceC28601c2 = interfaceC28601c1;
                            Object c32594d4 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function118);
                            function11 = function118;
                            c28655q3.m87172p0(c32594d4);
                            objM87133R6 = c32594d4;
                        } else {
                            obj2 = obj;
                            list5 = list4;
                            Function3 function119 = function7;
                            interfaceC4339a10 = interfaceC4339a8;
                            interfaceC28601c2 = interfaceC28601c1;
                            Object c32594d5 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function119);
                            function11 = function119;
                            c28655q3.m87172p0(c32594d5);
                            objM87133R6 = c32594d5;
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                        m101827S(state, interfaceC28601c2, c28655q3, (i810 & 14) | 48);
                        C15043i8 c15043i10 = C15043i8.f56313a;
                        C15247s c15247s6 = c15247s3;
                        c28655q4 = c28655q3;
                        InterfaceC4339a interfaceC4339a118 = interfaceC4339a7;
                        C15197y1 c15197y1M43130h3 = C15043i8.m43130h(r79.m121949b(c28655q3, i915).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i915).getBrandWhite(), 0L, r79.m121949b(c28655q3, i915).getTransparent(), c38072d.m121949b(c28655q3, i915).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
                        f14 = 1;
                        Modifier modifierM44456i3 = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q4, modifierM44456i3);
                        c28655q4.m87158i0();
                        Function3 function1110 = function11;
                        if (c28655q4.f115903S) {
                            interfaceC4339a12 = c0213j;
                            c28655q4.m87163l(interfaceC4339a12);
                        } else {
                            interfaceC4339a12 = c0213j;
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m13);
                        if (c28655q4.f115903S) {
                            interfaceC4339a13 = interfaceC4339a10;
                            if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                                c0209i5 = c0209i3;
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N13);
                            if (list5 == null) {
                                c28655q4.m87150e0(-793009074);
                                c28655q4.m87173q(false);
                                list6 = list5;
                                z28 = false;
                                function12 = function8;
                                obj3 = obj2;
                            } else {
                                c28655q4.m87150e0(-793009073);
                                C22971k c22971kM66746i5 = AbstractC22977m.m66746i(f14 * f13);
                                list6 = list5;
                                Modifier modifierM92100V5 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22971kM66746i5, C2299e.f9107J, c28655q4, 6);
                                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierM92100V5);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a12);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a7);
                                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m14);
                                if (c28655q4.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N14);
                                c28655q4.m87150e0(285190469);
                                while (r2.hasNext()) {
                                    boolean zM87157i15 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 458752) == 131072) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    z34 = zM87157i15 | z29;
                                    objM87133R7 = c28655q4.m87133R();
                                    if (z34) {
                                        obj4 = obj2;
                                        if (objM87133R7 == obj4) {
                                        }
                                        InterfaceC4339a interfaceC4339a119 = (InterfaceC4339a) objM87133R7;
                                        boolean zM87157i16 = c28655q4.m87157i(c26810l);
                                        if ((r35 & 57344) == 16384) {
                                            z35 = true;
                                        } else {
                                            z35 = false;
                                        }
                                        z36 = zM87157i16 | z35;
                                        objM87133R8 = c28655q4.m87133R();
                                        if (z36) {
                                            function13 = function8;
                                            objM87133R8 = new C32580a0(3, c26810l, function13);
                                            c28655q4.m87172p0(objM87133R8);
                                        } else {
                                            function13 = function8;
                                            objM87133R8 = new C32580a0(3, c26810l, function13);
                                            c28655q4.m87172p0(objM87133R8);
                                        }
                                        AbstractC32688w1.m102571e(c26810l, interfaceC4339a119, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                        obj2 = obj4;
                                        function8 = function13;
                                    } else {
                                        obj4 = obj2;
                                    }
                                    objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                                    c28655q4.m87172p0(objM87133R7);
                                    InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R7;
                                    boolean zM87157i17 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 57344) == 16384) {
                                        z35 = true;
                                    } else {
                                        z35 = false;
                                    }
                                    z36 = zM87157i17 | z35;
                                    objM87133R8 = c28655q4.m87133R();
                                    if (z36) {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    } else {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    }
                                    AbstractC32688w1.m102571e(c26810l, interfaceC4339a1110, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                    obj2 = obj4;
                                    function8 = function13;
                                }
                                function12 = function8;
                                obj3 = obj2;
                                z28 = false;
                                AbstractC25012a.m73392y(c28655q4, false, true, false);
                            }
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                            iHashCode4 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
                            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            interfaceC4339a14 = C0217k.f724b;
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a14);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m15);
                            c0209i6 = C0217k.f732j;
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N15);
                            Modifier modifierM3483b5 = AbstractC1126a.m3483b(c2314t, c15247s6);
                            if ((r35 & 234881024) == 67108864) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            objM87133R9 = c28655q4.m87133R();
                            if (z37) {
                                function14 = function10;
                                objM87133R9 = new C32599e(function14, 0);
                                c28655q4.m87172p0(objM87133R9);
                            } else {
                                function14 = function10;
                                objM87133R9 = new C32599e(function14, 0);
                                c28655q4.m87172p0(objM87133R9);
                            }
                            Modifier modifierM3413j5 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b5, (Function1) objM87133R9), 0.0f, 30 * f16, 1);
                            TextResource textResourceM21278l5 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                            TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                            C39174f c39174f5 = new C39174f(f16 * f16);
                            if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                                c28655q4.m87150e0(-1122965528);
                                objM87133R10 = c28655q4.m87133R();
                                if (objM87133R10 == obj3) {
                                    objM87133R10 = a.f135200w;
                                    c28655q4.m87172p0(objM87133R10);
                                }
                                interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                                c28655q4.m87173q(false);
                            } else {
                                c28655q4.m87150e0(-1122965528);
                                objM87133R10 = c28655q4.m87133R();
                                if (objM87133R10 == obj3) {
                                    objM87133R10 = a.f135200w;
                                    c28655q4.m87172p0(objM87133R10);
                                }
                                interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                                c28655q4.m87173q(false);
                            }
                            if (z4) {
                                abstractC17911tM43972A = AbstractC15673b0.m43972A();
                            }
                            AbstractC30784c.a aVar5 = new AbstractC30784c.a(i13, c39174f5, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                            if (z4) {
                                i58 = 4;
                            } else {
                                i58 = 0;
                            }
                            zM87153g = c28655q4.m87153g(interfaceC4339a11);
                            objM87133R11 = c28655q4.m87133R();
                            if (zM87153g) {
                                objM87133R11 = new C32604f(interfaceC4339a11, 0);
                                c28655q4.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32604f(interfaceC4339a11, 0);
                                c28655q4.m87172p0(objM87133R11);
                            }
                            C34348q0 c34348q4 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                            C33252i c33252iM105489e5 = AbstractC33253j.m105489e(3 * f16);
                            textResource = placeholderMessage;
                            i59 = 0;
                            C37816b c37816bM121344e5 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                            objM87133R12 = c28655q4.m87133R();
                            if (objM87133R12 == obj3) {
                                objM87133R12 = new C32614h(i59, interfaceC28601c2);
                                c28655q4.m87172p0(objM87133R12);
                            }
                            Function1 function1111 = (Function1) objM87133R12;
                            int i919 = TextResource.$stable;
                            Function1 function1112 = function12;
                            AbstractC30792k.m94678l(modifierM3413j5, textResourceM21278l5, null, null, null, null, c37816bM121344e5, aVar5, textResourceM21267a5, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e5, c15197y1M43130h3, null, null, c34348q4, interfaceC4339a11, function1111, c28655q4, (i919 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i919 << 24), 224256, 3078, 48, 426647100, 0);
                            if (z4) {
                                c28655q4.m87150e0(-450989950);
                                Modifier modifierMo3401b5 = C1100b.f4583a.mo3401b(c2314t);
                                objM87133R13 = c28655q4.m87133R();
                                if (objM87133R13 == obj3) {
                                    objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                                }
                                InterfaceC21083i interfaceC21083i6 = (InterfaceC21083i) objM87133R13;
                                if ((i37 & 14) == 4) {
                                    z38 = true;
                                } else {
                                    z38 = false;
                                }
                                objM87133R14 = c28655q4.m87133R();
                                if (z38) {
                                    interfaceC4339a15 = r7;
                                    objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                    c28655q4.m87172p0(objM87133R14);
                                } else {
                                    interfaceC4339a15 = r7;
                                    objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                    c28655q4.m87172p0(objM87133R14);
                                }
                                AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b5, interfaceC21083i6, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                                c28655q4.m87173q(false);
                            } else {
                                interfaceC4339a15 = r7;
                                c28655q4.m87150e0(-450607472);
                                c28655q4.m87173q(false);
                            }
                            AbstractC25012a.m73392y(c28655q4, true, true, true);
                            function4 = function1110;
                            interfaceC4339a5 = interfaceC4339a13;
                            interfaceC4351m3 = interfaceC4351m5;
                            function5 = function14;
                            interfaceC4339a6 = interfaceC4339a15;
                            c28655q = c28655q4;
                            function6 = function1112;
                            interfaceC4339a4 = interfaceC4339a118;
                            list2 = list6;
                            interfaceC4351m4 = interfaceC4351m6;
                        } else {
                            interfaceC4339a13 = interfaceC4339a10;
                        }
                        c0209i5 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N13);
                        if (list5 == null) {
                            c28655q4.m87150e0(-793009074);
                            c28655q4.m87173q(false);
                            list6 = list5;
                            z28 = false;
                            function12 = function8;
                            obj3 = obj2;
                        } else {
                            c28655q4.m87150e0(-793009073);
                            C22971k c22971kM66746i6 = AbstractC22977m.m66746i(f14 * f13);
                            list6 = list5;
                            Modifier modifierM92100V6 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22971kM66746i6, C2299e.f9107J, c28655q4, 6);
                            iHashCode3 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
                            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierM92100V6);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a12);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a8);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m16);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N16);
                            c28655q4.m87150e0(285190469);
                            while (r2.hasNext()) {
                                boolean zM87157i18 = c28655q4.m87157i(c26810l);
                                if ((r35 & 458752) == 131072) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                z34 = zM87157i18 | z29;
                                objM87133R7 = c28655q4.m87133R();
                                if (z34) {
                                    obj4 = obj2;
                                    if (objM87133R7 == obj4) {
                                    }
                                    InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R7;
                                    boolean zM87157i19 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 57344) == 16384) {
                                        z35 = true;
                                    } else {
                                        z35 = false;
                                    }
                                    z36 = zM87157i19 | z35;
                                    objM87133R8 = c28655q4.m87133R();
                                    if (z36) {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    } else {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    }
                                    AbstractC32688w1.m102571e(c26810l, interfaceC4339a1111, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                    obj2 = obj4;
                                    function8 = function13;
                                } else {
                                    obj4 = obj2;
                                }
                                objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                                c28655q4.m87172p0(objM87133R7);
                                InterfaceC4339a interfaceC4339a1112 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i110 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i110 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a1112, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            }
                            function12 = function8;
                            obj3 = obj2;
                            z28 = false;
                            AbstractC25012a.m73392y(c28655q4, false, true, false);
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                        iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q4.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a14 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a14);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m17);
                        c0209i6 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N17);
                        Modifier modifierM3483b6 = AbstractC1126a.m3483b(c2314t, c15247s6);
                        if ((r35 & 234881024) == 67108864) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R9 = c28655q4.m87133R();
                        if (z37) {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        } else {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        Modifier modifierM3413j6 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b6, (Function1) objM87133R9), 0.0f, 30 * f16, 1);
                        TextResource textResourceM21278l6 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                        TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                        C39174f c39174f6 = new C39174f(f16 * f16);
                        if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        }
                        if (z4) {
                            abstractC17911tM43972A = AbstractC15673b0.m43972A();
                        }
                        AbstractC30784c.a aVar6 = new AbstractC30784c.a(i13, c39174f6, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                        if (z4) {
                            i58 = 4;
                        } else {
                            i58 = 0;
                        }
                        zM87153g = c28655q4.m87153g(interfaceC4339a11);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87153g) {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        C34348q0 c34348q5 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                        C33252i c33252iM105489e6 = AbstractC33253j.m105489e(3 * f16);
                        textResource = placeholderMessage;
                        i59 = 0;
                        C37816b c37816bM121344e6 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == obj3) {
                            objM87133R12 = new C32614h(i59, interfaceC28601c2);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        Function1 function1113 = (Function1) objM87133R12;
                        int i9110 = TextResource.$stable;
                        Function1 function1114 = function12;
                        AbstractC30792k.m94678l(modifierM3413j6, textResourceM21278l6, null, null, null, null, c37816bM121344e6, aVar6, textResourceM21267a6, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e6, c15197y1M43130h3, null, null, c34348q5, interfaceC4339a11, function1113, c28655q4, (i9110 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i9110 << 24), 224256, 3078, 48, 426647100, 0);
                        if (z4) {
                            c28655q4.m87150e0(-450989950);
                            Modifier modifierMo3401b6 = C1100b.f4583a.mo3401b(c2314t);
                            objM87133R13 = c28655q4.m87133R();
                            if (objM87133R13 == obj3) {
                                objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                            }
                            InterfaceC21083i interfaceC21083i7 = (InterfaceC21083i) objM87133R13;
                            if ((i37 & 14) == 4) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            objM87133R14 = c28655q4.m87133R();
                            if (z38) {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            } else {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            }
                            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b6, interfaceC21083i7, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                            c28655q4.m87173q(false);
                        } else {
                            interfaceC4339a15 = r7;
                            c28655q4.m87150e0(-450607472);
                            c28655q4.m87173q(false);
                        }
                        AbstractC25012a.m73392y(c28655q4, true, true, true);
                        function4 = function1110;
                        interfaceC4339a5 = interfaceC4339a13;
                        interfaceC4351m3 = interfaceC4351m5;
                        function5 = function14;
                        interfaceC4339a6 = interfaceC4339a15;
                        c28655q = c28655q4;
                        function6 = function1114;
                        interfaceC4339a4 = interfaceC4339a118;
                        list2 = list6;
                        interfaceC4351m4 = interfaceC4351m6;
                    } else {
                        c15247s3 = c15247s2;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N12);
                    if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                        c28655q2.m87150e0(1403767226);
                        C27270o c27270o7 = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        String strM21273g7 = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == obj) {
                            objM87133R15 = new C32375n(9);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        Modifier modifierM3390l7 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                        if ((r35 & 14) != 4) {
                            z39 = true;
                        } else {
                            z39 = true;
                        }
                        objM87133R16 = c28655q2.m87133R();
                        if (z39) {
                            i64 = 0;
                            objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                            c28655q2.m87172p0(objM87133R16);
                        } else {
                            i64 = 0;
                            objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                            c28655q2.m87172p0(objM87133R16);
                        }
                        C28655q c28655q12 = c28655q2;
                        AbstractC27242b1.m82092d(c27270o7, strM21273g7, null, modifierM3390l7, (InterfaceC4339a) objM87133R16, c28655q12, C27270o.f109105k, 4);
                        c28655q12.m87173q(i64);
                        c28655q3 = c28655q12;
                    } else {
                        C28655q c28655q13 = c28655q2;
                        c28655q13.m87150e0(1404745524);
                        c28655q13.m87173q(false);
                        c28655q3 = c28655q13;
                    }
                    C27270o c27270o8 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
                    String strM21273g8 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = new C32375n(10);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Modifier modifierM3390l8 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
                    if ((r35 & 112) == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    if (z27) {
                        i47 = 1;
                        objM87133R5 = new C32579a(interfaceC4339a7, i47);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        i47 = 1;
                        objM87133R5 = new C32579a(interfaceC4339a7, i47);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    i48 = i47;
                    AbstractC27242b1.m82092d(c27270o8, strM21273g8, null, modifierM3390l8, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
                    if ((r28 & 57344) == 16384) {
                        i49 = i48;
                    } else {
                        i49 = 0;
                    }
                    if ((r35 & 896) == 256) {
                        i54 = i48;
                    } else {
                        i54 = 0;
                    }
                    int i9111 = i49 | i54;
                    if ((i77 & 7168) == 2048) {
                        i55 = i48;
                    } else {
                        i55 = 0;
                    }
                    int i9112 = i9111 | i55;
                    list4 = list3;
                    int i9113 = i9112 | (c28655q3.m87157i(list4) ? 1 : 0);
                    if ((r35 & 7168) == 2048) {
                        i56 = i48;
                    } else {
                        i56 = 0;
                    }
                    i57 = i56 | i9113;
                    objM87133R6 = c28655q3.m87133R();
                    if (i57 == 0) {
                        obj2 = obj;
                        list5 = list4;
                        Function3 function1115 = function7;
                        interfaceC4339a10 = interfaceC4339a8;
                        interfaceC28601c2 = interfaceC28601c1;
                        Object c32594d6 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function1115);
                        function11 = function1115;
                        c28655q3.m87172p0(c32594d6);
                        objM87133R6 = c32594d6;
                    } else {
                        obj2 = obj;
                        list5 = list4;
                        Function3 function1116 = function7;
                        interfaceC4339a10 = interfaceC4339a8;
                        interfaceC28601c2 = interfaceC28601c1;
                        Object c32594d7 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function1116);
                        function11 = function1116;
                        c28655q3.m87172p0(c32594d7);
                        objM87133R6 = c32594d7;
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                    m101827S(state, interfaceC28601c2, c28655q3, (i810 & 14) | 48);
                    C15043i8 c15043i11 = C15043i8.f56313a;
                    C15247s c15247s7 = c15247s3;
                    c28655q4 = c28655q3;
                    InterfaceC4339a interfaceC4339a1113 = interfaceC4339a7;
                    C15197y1 c15197y1M43130h4 = C15043i8.m43130h(r79.m121949b(c28655q3, i915).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i915).getBrandWhite(), 0L, r79.m121949b(c28655q3, i915).getTransparent(), c38072d.m121949b(c28655q3, i915).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
                    f14 = 1;
                    Modifier modifierM44456i4 = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q4.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q4, modifierM44456i4);
                    c28655q4.m87158i0();
                    Function3 function1117 = function11;
                    if (c28655q4.f115903S) {
                        interfaceC4339a12 = c0213j;
                        c28655q4.m87163l(interfaceC4339a12);
                    } else {
                        interfaceC4339a12 = c0213j;
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m18);
                    if (c28655q4.f115903S) {
                        interfaceC4339a13 = interfaceC4339a10;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                            c0209i5 = c0209i3;
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N18);
                        if (list5 == null) {
                            c28655q4.m87150e0(-793009074);
                            c28655q4.m87173q(false);
                            list6 = list5;
                            z28 = false;
                            function12 = function8;
                            obj3 = obj2;
                        } else {
                            c28655q4.m87150e0(-793009073);
                            C22971k c22971kM66746i7 = AbstractC22977m.m66746i(f14 * f13);
                            list6 = list5;
                            Modifier modifierM92100V7 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                            C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22971kM66746i7, C2299e.f9107J, c28655q4, 6);
                            iHashCode3 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q4.m87165m();
                            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q4, modifierM92100V7);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a12);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a9);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m19);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N19);
                            c28655q4.m87150e0(285190469);
                            while (r2.hasNext()) {
                                boolean zM87157i111 = c28655q4.m87157i(c26810l);
                                if ((r35 & 458752) == 131072) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                z34 = zM87157i111 | z29;
                                objM87133R7 = c28655q4.m87133R();
                                if (z34) {
                                    obj4 = obj2;
                                    if (objM87133R7 == obj4) {
                                    }
                                    InterfaceC4339a interfaceC4339a1114 = (InterfaceC4339a) objM87133R7;
                                    boolean zM87157i112 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 57344) == 16384) {
                                        z35 = true;
                                    } else {
                                        z35 = false;
                                    }
                                    z36 = zM87157i112 | z35;
                                    objM87133R8 = c28655q4.m87133R();
                                    if (z36) {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    } else {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    }
                                    AbstractC32688w1.m102571e(c26810l, interfaceC4339a1114, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                    obj2 = obj4;
                                    function8 = function13;
                                } else {
                                    obj4 = obj2;
                                }
                                objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                                c28655q4.m87172p0(objM87133R7);
                                InterfaceC4339a interfaceC4339a1115 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i113 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i113 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a1115, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            }
                            function12 = function8;
                            obj3 = obj2;
                            z28 = false;
                            AbstractC25012a.m73392y(c28655q4, false, true, false);
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                        iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q4.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a14 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a14);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d7);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m110);
                        c0209i6 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N110);
                        Modifier modifierM3483b7 = AbstractC1126a.m3483b(c2314t, c15247s7);
                        if ((r35 & 234881024) == 67108864) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R9 = c28655q4.m87133R();
                        if (z37) {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        } else {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        Modifier modifierM3413j7 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b7, (Function1) objM87133R9), 0.0f, 30 * f16, 1);
                        TextResource textResourceM21278l7 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                        TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                        C39174f c39174f7 = new C39174f(f16 * f16);
                        if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        }
                        if (z4) {
                            abstractC17911tM43972A = AbstractC15673b0.m43972A();
                        }
                        AbstractC30784c.a aVar7 = new AbstractC30784c.a(i13, c39174f7, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                        if (z4) {
                            i58 = 4;
                        } else {
                            i58 = 0;
                        }
                        zM87153g = c28655q4.m87153g(interfaceC4339a11);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87153g) {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        C34348q0 c34348q6 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                        C33252i c33252iM105489e7 = AbstractC33253j.m105489e(3 * f16);
                        textResource = placeholderMessage;
                        i59 = 0;
                        C37816b c37816bM121344e7 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == obj3) {
                            objM87133R12 = new C32614h(i59, interfaceC28601c2);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        Function1 function1118 = (Function1) objM87133R12;
                        int i9114 = TextResource.$stable;
                        Function1 function1119 = function12;
                        AbstractC30792k.m94678l(modifierM3413j7, textResourceM21278l7, null, null, null, null, c37816bM121344e7, aVar7, textResourceM21267a7, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e7, c15197y1M43130h4, null, null, c34348q6, interfaceC4339a11, function1118, c28655q4, (i9114 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i9114 << 24), 224256, 3078, 48, 426647100, 0);
                        if (z4) {
                            c28655q4.m87150e0(-450989950);
                            Modifier modifierMo3401b7 = C1100b.f4583a.mo3401b(c2314t);
                            objM87133R13 = c28655q4.m87133R();
                            if (objM87133R13 == obj3) {
                                objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                            }
                            InterfaceC21083i interfaceC21083i8 = (InterfaceC21083i) objM87133R13;
                            if ((i37 & 14) == 4) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            objM87133R14 = c28655q4.m87133R();
                            if (z38) {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            } else {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            }
                            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b7, interfaceC21083i8, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                            c28655q4.m87173q(false);
                        } else {
                            interfaceC4339a15 = r7;
                            c28655q4.m87150e0(-450607472);
                            c28655q4.m87173q(false);
                        }
                        AbstractC25012a.m73392y(c28655q4, true, true, true);
                        function4 = function1117;
                        interfaceC4339a5 = interfaceC4339a13;
                        interfaceC4351m3 = interfaceC4351m5;
                        function5 = function14;
                        interfaceC4339a6 = interfaceC4339a15;
                        c28655q = c28655q4;
                        function6 = function1119;
                        interfaceC4339a4 = interfaceC4339a1113;
                        list2 = list6;
                        interfaceC4351m4 = interfaceC4351m6;
                    } else {
                        interfaceC4339a13 = interfaceC4339a10;
                    }
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N18);
                    if (list5 == null) {
                        c28655q4.m87150e0(-793009074);
                        c28655q4.m87173q(false);
                        list6 = list5;
                        z28 = false;
                        function12 = function8;
                        obj3 = obj2;
                    } else {
                        c28655q4.m87150e0(-793009073);
                        C22971k c22971kM66746i8 = AbstractC22977m.m66746i(f14 * f13);
                        list6 = list5;
                        Modifier modifierM92100V8 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                        C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22971kM66746i8, C2299e.f9107J, c28655q4, 6);
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q4.m87165m();
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q4, modifierM92100V8);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a12);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a10);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111);
                        c28655q4.m87150e0(285190469);
                        while (r2.hasNext()) {
                            boolean zM87157i114 = c28655q4.m87157i(c26810l);
                            if ((r35 & 458752) == 131072) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z34 = zM87157i114 | z29;
                            objM87133R7 = c28655q4.m87133R();
                            if (z34) {
                                obj4 = obj2;
                                if (objM87133R7 == obj4) {
                                }
                                InterfaceC4339a interfaceC4339a1116 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i115 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i115 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a1116, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            } else {
                                obj4 = obj2;
                            }
                            objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                            c28655q4.m87172p0(objM87133R7);
                            InterfaceC4339a interfaceC4339a1117 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i116 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i116 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a1117, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        }
                        function12 = function8;
                        obj3 = obj2;
                        z28 = false;
                        AbstractC25012a.m73392y(c28655q4, false, true, false);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q4.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a14 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a14);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m112);
                    c0209i6 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N112);
                    Modifier modifierM3483b8 = AbstractC1126a.m3483b(c2314t, c15247s7);
                    if ((r35 & 234881024) == 67108864) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R9 = c28655q4.m87133R();
                    if (z37) {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    } else {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    Modifier modifierM3413j8 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b8, (Function1) objM87133R9), 0.0f, 30 * f16, 1);
                    TextResource textResourceM21278l8 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                    TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                    C39174f c39174f8 = new C39174f(f16 * f16);
                    if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    }
                    if (z4) {
                        abstractC17911tM43972A = AbstractC15673b0.m43972A();
                    }
                    AbstractC30784c.a aVar8 = new AbstractC30784c.a(i13, c39174f8, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                    if (z4) {
                        i58 = 4;
                    } else {
                        i58 = 0;
                    }
                    zM87153g = c28655q4.m87153g(interfaceC4339a11);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    C34348q0 c34348q7 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                    C33252i c33252iM105489e8 = AbstractC33253j.m105489e(3 * f16);
                    textResource = placeholderMessage;
                    i59 = 0;
                    C37816b c37816bM121344e8 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == obj3) {
                        objM87133R12 = new C32614h(i59, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    Function1 function11110 = (Function1) objM87133R12;
                    int i9115 = TextResource.$stable;
                    Function1 function11111 = function12;
                    AbstractC30792k.m94678l(modifierM3413j8, textResourceM21278l8, null, null, null, null, c37816bM121344e8, aVar8, textResourceM21267a8, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e8, c15197y1M43130h4, null, null, c34348q7, interfaceC4339a11, function11110, c28655q4, (i9115 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i9115 << 24), 224256, 3078, 48, 426647100, 0);
                    if (z4) {
                        c28655q4.m87150e0(-450989950);
                        Modifier modifierMo3401b8 = C1100b.f4583a.mo3401b(c2314t);
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == obj3) {
                            objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                        }
                        InterfaceC21083i interfaceC21083i9 = (InterfaceC21083i) objM87133R13;
                        if ((i37 & 14) == 4) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objM87133R14 = c28655q4.m87133R();
                        if (z38) {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        } else {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        }
                        AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b8, interfaceC21083i9, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                        c28655q4.m87173q(false);
                    } else {
                        interfaceC4339a15 = r7;
                        c28655q4.m87150e0(-450607472);
                        c28655q4.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    function4 = function1117;
                    interfaceC4339a5 = interfaceC4339a13;
                    interfaceC4351m3 = interfaceC4351m5;
                    function5 = function14;
                    interfaceC4339a6 = interfaceC4339a15;
                    c28655q = c28655q4;
                    function6 = function11111;
                    interfaceC4339a4 = interfaceC4339a1113;
                    list2 = list6;
                    interfaceC4351m4 = interfaceC4351m6;
                } else {
                    textResource = placeholderMessage;
                    c28655q5.m87138X();
                    interfaceC4339a4 = interfaceC4339a;
                    interfaceC4339a5 = interfaceC4339a2;
                    function4 = function3;
                    interfaceC4351m3 = interfaceC4351m;
                    list2 = list;
                    function5 = function2;
                    interfaceC4351m4 = interfaceC4351m2;
                    interfaceC4339a6 = interfaceC4339a3;
                    c28655q = c28655q5;
                    function6 = function1;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final TextResource textResource3 = textResource;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj5, Object obj6) {
                            int iIntValue = ((Integer) obj6).intValue();
                            return AbstractC32619i.m101820L(i13, sendFieldColor, textResource3, z4, z13, z14, listState, z15, state, z16, mediaPickerLauncher, interfaceC4339a4, interfaceC4339a5, function4, function6, interfaceC4351m3, list2, interfaceC15250v, function5, interfaceC4351m4, interfaceC4339a6, i14, i15, i16, i17, (Composer) obj5, iIntValue);
                        }
                    };
                }
            }
            i39 = i16 | 6;
            i37 = i39;
            z17 = (i77 & 306783379) != 306783378 ? true : true;
            if (c28655q5.m87135U(i77 & 1, z17)) {
                i44 = 15;
                obj = C28635l.f115821a;
                if (i79 != 0) {
                    objM87133R24 = c28655q5.m87133R();
                    if (objM87133R24 == obj) {
                        objM87133R24 = new C32513d(i44);
                        c28655q5.m87172p0(objM87133R24);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R24;
                } else {
                    interfaceC4339a7 = interfaceC4339a;
                }
                if (i84 != 0) {
                    objM87133R23 = c28655q5.m87133R();
                    if (objM87133R23 == obj) {
                        objM87133R23 = new C32513d(16);
                        c28655q5.m87172p0(objM87133R23);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R23;
                } else {
                    interfaceC4339a8 = interfaceC4339a2;
                }
                i45 = 9;
                if (i86 != 0) {
                    objM87133R22 = c28655q5.m87133R();
                    if (objM87133R22 == obj) {
                        objM87133R22 = new C30745a(i45);
                        c28655q5.m87172p0(objM87133R22);
                    }
                    function7 = (Function3) objM87133R22;
                } else {
                    function7 = function3;
                }
                if (i88 != 0) {
                    objM87133R21 = c28655q5.m87133R();
                    if (objM87133R21 == obj) {
                        objM87133R21 = new C32375n(7);
                        c28655q5.m87172p0(objM87133R21);
                    }
                    function8 = (Function1) objM87133R21;
                } else {
                    function8 = function1;
                }
                if (i25 != 0) {
                    objM87133R20 = c28655q5.m87133R();
                    if (objM87133R20 == obj) {
                        objM87133R20 = new C31314a(15);
                        c28655q5.m87172p0(objM87133R20);
                    }
                    interfaceC4351m5 = (InterfaceC4351m) objM87133R20;
                } else {
                    interfaceC4351m5 = interfaceC4351m;
                }
                abstractC17911tM43972A = null;
                if (i27 != 0) {
                    list3 = null;
                } else {
                    list3 = list;
                }
                if (i29 != 0) {
                    objM87133R19 = c28655q5.m87133R();
                    if (objM87133R19 == obj) {
                        objM87133R19 = new C32375n(8);
                        c28655q5.m87172p0(objM87133R19);
                    }
                    function9 = (Function1) objM87133R19;
                } else {
                    interfaceC4351m5 = interfaceC4351m5;
                    function9 = function2;
                }
                if (i34 != 0) {
                    objM87133R18 = c28655q5.m87133R();
                    if (objM87133R18 == obj) {
                        objM87133R18 = new C31314a(16);
                        c28655q5.m87172p0(objM87133R18);
                    }
                    interfaceC4351m6 = (InterfaceC4351m) objM87133R18;
                } else {
                    interfaceC4339a8 = interfaceC4339a8;
                    interfaceC4351m6 = interfaceC4351m2;
                }
                if (i36 != 0) {
                    objM87133R17 = c28655q5.m87133R();
                    if (objM87133R17 == obj) {
                        objM87133R17 = new C32513d(17);
                        c28655q5.m87172p0(objM87133R17);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R17;
                } else {
                    interfaceC4339a9 = interfaceC4339a3;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                InterfaceC4339a interfaceC4339a1118 = interfaceC4339a9;
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = AbstractC33745d.m106649h(c28655q5);
                }
                c15247s = (C15247s) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = AbstractC11266d.m30453g(c28655q5);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R3;
                function10 = function9;
                if (((Boolean) AbstractC15751g.m44460m(interfaceC21083i, c28655q5, 6).getValue()).booleanValue()) {
                    if (interfaceC15250v != null) {
                        z44 = false;
                    } else {
                        z44 = false;
                    }
                    if (z44) {
                        interfaceC4351m6.invoke(C38423a.a.OPEN, Boolean.TRUE);
                    }
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q5.m87161k(AbstractC38073e.m121968p());
                Boolean boolValueOf5 = Boolean.valueOf(z15);
                Boolean boolValueOf6 = Boolean.valueOf(z16);
                if ((i77 & 29360128) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zM87157i117 = z18 | c28655q5.m87157i(interfaceC15250v);
                if ((i35 & 1879048192) == 536870912) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z49 = zM87157i117 | z19;
                if ((i77 & 3670016) == 1048576) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z410 = z49 | z24;
                if ((i77 & 1879048192) == 536870912) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z410 | z25;
                Object objM87133R27 = c28655q5.m87133R();
                if (z26) {
                    c28655q2 = c28655q5;
                    i46 = 8;
                    bVar = new b(z15, interfaceC15250v, interfaceC4351m6, c15247s, listState, z16, null);
                    c15247s2 = c15247s;
                    c28655q2.m87172p0(bVar);
                } else {
                    c28655q2 = c28655q5;
                    i46 = 8;
                    bVar = new b(z15, interfaceC15250v, interfaceC4351m6, c15247s, listState, z16, null);
                    c15247s2 = c15247s;
                    c28655q2.m87172p0(bVar);
                }
                int i811 = r28 >> 24;
                AbstractC28683x.m87254h(boolValueOf5, boolValueOf6, (InterfaceC4351m) bVar, c28655q2);
                f13 = i46;
                c2314t = C2314t.f9131w;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(((float) 1.5d) * f13, c2314t);
                c38072d = C38072d.f163053a;
                int i9116 = C38072d.f163054b;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM3394p3, c38072d.m121949b(c28655q2, i9116).getTransparent(), AbstractC17918w0.f69621a);
                float f17 = 4;
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * f17), C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM3358c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a11);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m113);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c15247s3 = c15247s2;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N113);
                    if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                        c28655q2.m87150e0(1403767226);
                        C27270o c27270o9 = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        String strM21273g9 = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == obj) {
                            objM87133R15 = new C32375n(9);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        Modifier modifierM3390l9 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                        if ((r35 & 14) != 4) {
                            z39 = true;
                        } else {
                            z39 = true;
                        }
                        objM87133R16 = c28655q2.m87133R();
                        if (z39) {
                            i64 = 0;
                            objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                            c28655q2.m87172p0(objM87133R16);
                        } else {
                            i64 = 0;
                            objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                            c28655q2.m87172p0(objM87133R16);
                        }
                        C28655q c28655q14 = c28655q2;
                        AbstractC27242b1.m82092d(c27270o9, strM21273g9, null, modifierM3390l9, (InterfaceC4339a) objM87133R16, c28655q14, C27270o.f109105k, 4);
                        c28655q14.m87173q(i64);
                        c28655q3 = c28655q14;
                    } else {
                        C28655q c28655q15 = c28655q2;
                        c28655q15.m87150e0(1404745524);
                        c28655q15.m87173q(false);
                        c28655q3 = c28655q15;
                    }
                    C27270o c27270o10 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
                    String strM21273g10 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = new C32375n(10);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Modifier modifierM3390l10 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
                    if ((r35 & 112) == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    if (z27) {
                        i47 = 1;
                        objM87133R5 = new C32579a(interfaceC4339a7, i47);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        i47 = 1;
                        objM87133R5 = new C32579a(interfaceC4339a7, i47);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    i48 = i47;
                    AbstractC27242b1.m82092d(c27270o10, strM21273g10, null, modifierM3390l10, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
                    if ((r28 & 57344) == 16384) {
                        i49 = i48;
                    } else {
                        i49 = 0;
                    }
                    if ((r35 & 896) == 256) {
                        i54 = i48;
                    } else {
                        i54 = 0;
                    }
                    int i9117 = i49 | i54;
                    if ((i77 & 7168) == 2048) {
                        i55 = i48;
                    } else {
                        i55 = 0;
                    }
                    int i9118 = i9117 | i55;
                    list4 = list3;
                    int i9119 = i9118 | (c28655q3.m87157i(list4) ? 1 : 0);
                    if ((r35 & 7168) == 2048) {
                        i56 = i48;
                    } else {
                        i56 = 0;
                    }
                    i57 = i56 | i9119;
                    objM87133R6 = c28655q3.m87133R();
                    if (i57 == 0) {
                        obj2 = obj;
                        list5 = list4;
                        Function3 function11112 = function7;
                        interfaceC4339a10 = interfaceC4339a8;
                        interfaceC28601c2 = interfaceC28601c1;
                        Object c32594d8 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function11112);
                        function11 = function11112;
                        c28655q3.m87172p0(c32594d8);
                        objM87133R6 = c32594d8;
                    } else {
                        obj2 = obj;
                        list5 = list4;
                        Function3 function11113 = function7;
                        interfaceC4339a10 = interfaceC4339a8;
                        interfaceC28601c2 = interfaceC28601c1;
                        Object c32594d9 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function11113);
                        function11 = function11113;
                        c28655q3.m87172p0(c32594d9);
                        objM87133R6 = c32594d9;
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                    m101827S(state, interfaceC28601c2, c28655q3, (i811 & 14) | 48);
                    C15043i8 c15043i12 = C15043i8.f56313a;
                    C15247s c15247s8 = c15247s3;
                    c28655q4 = c28655q3;
                    InterfaceC4339a interfaceC4339a1119 = interfaceC4339a7;
                    C15197y1 c15197y1M43130h5 = C15043i8.m43130h(r79.m121949b(c28655q3, i9116).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i9116).getBrandWhite(), 0L, r79.m121949b(c28655q3, i9116).getTransparent(), c38072d.m121949b(c28655q3, i9116).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
                    f14 = 1;
                    Modifier modifierM44456i5 = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q4.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q4, modifierM44456i5);
                    c28655q4.m87158i0();
                    Function3 function11114 = function11;
                    if (c28655q4.f115903S) {
                        interfaceC4339a12 = c0213j;
                        c28655q4.m87163l(interfaceC4339a12);
                    } else {
                        interfaceC4339a12 = c0213j;
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m114);
                    if (c28655q4.f115903S) {
                        interfaceC4339a13 = interfaceC4339a10;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                            c0209i5 = c0209i3;
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N114);
                        if (list5 == null) {
                            c28655q4.m87150e0(-793009074);
                            c28655q4.m87173q(false);
                            list6 = list5;
                            z28 = false;
                            function12 = function8;
                            obj3 = obj2;
                        } else {
                            c28655q4.m87150e0(-793009073);
                            C22971k c22971kM66746i9 = AbstractC22977m.m66746i(f14 * f13);
                            list6 = list5;
                            Modifier modifierM92100V9 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                            C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(c22971kM66746i9, C2299e.f9107J, c28655q4, 6);
                            iHashCode3 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q4.m87165m();
                            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q4, modifierM92100V9);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a12);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a12);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m115);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N115);
                            c28655q4.m87150e0(285190469);
                            while (r2.hasNext()) {
                                boolean zM87157i118 = c28655q4.m87157i(c26810l);
                                if ((r35 & 458752) == 131072) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                z34 = zM87157i118 | z29;
                                objM87133R7 = c28655q4.m87133R();
                                if (z34) {
                                    obj4 = obj2;
                                    if (objM87133R7 == obj4) {
                                    }
                                    InterfaceC4339a interfaceC4339a11110 = (InterfaceC4339a) objM87133R7;
                                    boolean zM87157i119 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 57344) == 16384) {
                                        z35 = true;
                                    } else {
                                        z35 = false;
                                    }
                                    z36 = zM87157i119 | z35;
                                    objM87133R8 = c28655q4.m87133R();
                                    if (z36) {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    } else {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    }
                                    AbstractC32688w1.m102571e(c26810l, interfaceC4339a11110, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                    obj2 = obj4;
                                    function8 = function13;
                                } else {
                                    obj4 = obj2;
                                }
                                objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                                c28655q4.m87172p0(objM87133R7);
                                InterfaceC4339a interfaceC4339a11111 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i1110 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i1110 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a11111, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            }
                            function12 = function8;
                            obj3 = obj2;
                            z28 = false;
                            AbstractC25012a.m73392y(c28655q4, false, true, false);
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                        iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q4.m87165m();
                        Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a14 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a14);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m116);
                        c0209i6 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N116);
                        Modifier modifierM3483b9 = AbstractC1126a.m3483b(c2314t, c15247s8);
                        if ((r35 & 234881024) == 67108864) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R9 = c28655q4.m87133R();
                        if (z37) {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        } else {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        Modifier modifierM3413j9 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b9, (Function1) objM87133R9), 0.0f, 30 * f17, 1);
                        TextResource textResourceM21278l9 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                        TextResource textResourceM21267a9 = AbstractC8693b.m21267a();
                        C39174f c39174f9 = new C39174f(f17 * f17);
                        if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        }
                        if (z4) {
                            abstractC17911tM43972A = AbstractC15673b0.m43972A();
                        }
                        AbstractC30784c.a aVar9 = new AbstractC30784c.a(i13, c39174f9, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                        if (z4) {
                            i58 = 4;
                        } else {
                            i58 = 0;
                        }
                        zM87153g = c28655q4.m87153g(interfaceC4339a11);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87153g) {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        C34348q0 c34348q8 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                        C33252i c33252iM105489e9 = AbstractC33253j.m105489e(3 * f17);
                        textResource = placeholderMessage;
                        i59 = 0;
                        C37816b c37816bM121344e9 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == obj3) {
                            objM87133R12 = new C32614h(i59, interfaceC28601c2);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        Function1 function11115 = (Function1) objM87133R12;
                        int i91110 = TextResource.$stable;
                        Function1 function11116 = function12;
                        AbstractC30792k.m94678l(modifierM3413j9, textResourceM21278l9, null, null, null, null, c37816bM121344e9, aVar9, textResourceM21267a9, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e9, c15197y1M43130h5, null, null, c34348q8, interfaceC4339a11, function11115, c28655q4, (i91110 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i91110 << 24), 224256, 3078, 48, 426647100, 0);
                        if (z4) {
                            c28655q4.m87150e0(-450989950);
                            Modifier modifierMo3401b9 = C1100b.f4583a.mo3401b(c2314t);
                            objM87133R13 = c28655q4.m87133R();
                            if (objM87133R13 == obj3) {
                                objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                            }
                            InterfaceC21083i interfaceC21083i10 = (InterfaceC21083i) objM87133R13;
                            if ((i37 & 14) == 4) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            objM87133R14 = c28655q4.m87133R();
                            if (z38) {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            } else {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            }
                            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b9, interfaceC21083i10, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                            c28655q4.m87173q(false);
                        } else {
                            interfaceC4339a15 = r7;
                            c28655q4.m87150e0(-450607472);
                            c28655q4.m87173q(false);
                        }
                        AbstractC25012a.m73392y(c28655q4, true, true, true);
                        function4 = function11114;
                        interfaceC4339a5 = interfaceC4339a13;
                        interfaceC4351m3 = interfaceC4351m5;
                        function5 = function14;
                        interfaceC4339a6 = interfaceC4339a15;
                        c28655q = c28655q4;
                        function6 = function11116;
                        interfaceC4339a4 = interfaceC4339a1119;
                        list2 = list6;
                        interfaceC4351m4 = interfaceC4351m6;
                    } else {
                        interfaceC4339a13 = interfaceC4339a10;
                    }
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N114);
                    if (list5 == null) {
                        c28655q4.m87150e0(-793009074);
                        c28655q4.m87173q(false);
                        list6 = list5;
                        z28 = false;
                        function12 = function8;
                        obj3 = obj2;
                    } else {
                        c28655q4.m87150e0(-793009073);
                        C22971k c22971kM66746i10 = AbstractC22977m.m66746i(f14 * f13);
                        list6 = list5;
                        Modifier modifierM92100V10 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                        C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(c22971kM66746i10, C2299e.f9107J, c28655q4, 6);
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q4.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q4, modifierM92100V10);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a12);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a13);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m117);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N117);
                        c28655q4.m87150e0(285190469);
                        while (r2.hasNext()) {
                            boolean zM87157i1111 = c28655q4.m87157i(c26810l);
                            if ((r35 & 458752) == 131072) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z34 = zM87157i1111 | z29;
                            objM87133R7 = c28655q4.m87133R();
                            if (z34) {
                                obj4 = obj2;
                                if (objM87133R7 == obj4) {
                                }
                                InterfaceC4339a interfaceC4339a11112 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i1112 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i1112 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a11112, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            } else {
                                obj4 = obj2;
                            }
                            objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                            c28655q4.m87172p0(objM87133R7);
                            InterfaceC4339a interfaceC4339a11113 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i1113 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i1113 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a11113, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        }
                        function12 = function8;
                        obj3 = obj2;
                        z28 = false;
                        AbstractC25012a.m73392y(c28655q4, false, true, false);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q4.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a14 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a14);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m118);
                    c0209i6 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N118);
                    Modifier modifierM3483b10 = AbstractC1126a.m3483b(c2314t, c15247s8);
                    if ((r35 & 234881024) == 67108864) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R9 = c28655q4.m87133R();
                    if (z37) {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    } else {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    Modifier modifierM3413j10 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b10, (Function1) objM87133R9), 0.0f, 30 * f17, 1);
                    TextResource textResourceM21278l10 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                    TextResource textResourceM21267a10 = AbstractC8693b.m21267a();
                    C39174f c39174f10 = new C39174f(f17 * f17);
                    if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    }
                    if (z4) {
                        abstractC17911tM43972A = AbstractC15673b0.m43972A();
                    }
                    AbstractC30784c.a aVar10 = new AbstractC30784c.a(i13, c39174f10, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                    if (z4) {
                        i58 = 4;
                    } else {
                        i58 = 0;
                    }
                    zM87153g = c28655q4.m87153g(interfaceC4339a11);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    C34348q0 c34348q9 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                    C33252i c33252iM105489e10 = AbstractC33253j.m105489e(3 * f17);
                    textResource = placeholderMessage;
                    i59 = 0;
                    C37816b c37816bM121344e10 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == obj3) {
                        objM87133R12 = new C32614h(i59, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    Function1 function11117 = (Function1) objM87133R12;
                    int i91111 = TextResource.$stable;
                    Function1 function11118 = function12;
                    AbstractC30792k.m94678l(modifierM3413j10, textResourceM21278l10, null, null, null, null, c37816bM121344e10, aVar10, textResourceM21267a10, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e10, c15197y1M43130h5, null, null, c34348q9, interfaceC4339a11, function11117, c28655q4, (i91111 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i91111 << 24), 224256, 3078, 48, 426647100, 0);
                    if (z4) {
                        c28655q4.m87150e0(-450989950);
                        Modifier modifierMo3401b10 = C1100b.f4583a.mo3401b(c2314t);
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == obj3) {
                            objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                        }
                        InterfaceC21083i interfaceC21083i11 = (InterfaceC21083i) objM87133R13;
                        if ((i37 & 14) == 4) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objM87133R14 = c28655q4.m87133R();
                        if (z38) {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        } else {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        }
                        AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b10, interfaceC21083i11, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                        c28655q4.m87173q(false);
                    } else {
                        interfaceC4339a15 = r7;
                        c28655q4.m87150e0(-450607472);
                        c28655q4.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    function4 = function11114;
                    interfaceC4339a5 = interfaceC4339a13;
                    interfaceC4351m3 = interfaceC4351m5;
                    function5 = function14;
                    interfaceC4339a6 = interfaceC4339a15;
                    c28655q = c28655q4;
                    function6 = function11118;
                    interfaceC4339a4 = interfaceC4339a1119;
                    list2 = list6;
                    interfaceC4351m4 = interfaceC4351m6;
                } else {
                    c15247s3 = c15247s2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N113);
                if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                    c28655q2.m87150e0(1403767226);
                    C27270o c27270o11 = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    String strM21273g11 = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == obj) {
                        objM87133R15 = new C32375n(9);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    Modifier modifierM3390l11 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                    if ((r35 & 14) != 4) {
                        z39 = true;
                    } else {
                        z39 = true;
                    }
                    objM87133R16 = c28655q2.m87133R();
                    if (z39) {
                        i64 = 0;
                        objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                        c28655q2.m87172p0(objM87133R16);
                    } else {
                        i64 = 0;
                        objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    C28655q c28655q16 = c28655q2;
                    AbstractC27242b1.m82092d(c27270o11, strM21273g11, null, modifierM3390l11, (InterfaceC4339a) objM87133R16, c28655q16, C27270o.f109105k, 4);
                    c28655q16.m87173q(i64);
                    c28655q3 = c28655q16;
                } else {
                    C28655q c28655q17 = c28655q2;
                    c28655q17.m87150e0(1404745524);
                    c28655q17.m87173q(false);
                    c28655q3 = c28655q17;
                }
                C27270o c27270o12 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
                String strM21273g12 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = new C32375n(10);
                    c28655q3.m87172p0(objM87133R4);
                }
                Modifier modifierM3390l12 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
                if ((r35 & 112) == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R5 = c28655q3.m87133R();
                if (z27) {
                    i47 = 1;
                    objM87133R5 = new C32579a(interfaceC4339a7, i47);
                    c28655q3.m87172p0(objM87133R5);
                } else {
                    i47 = 1;
                    objM87133R5 = new C32579a(interfaceC4339a7, i47);
                    c28655q3.m87172p0(objM87133R5);
                }
                i48 = i47;
                AbstractC27242b1.m82092d(c27270o12, strM21273g12, null, modifierM3390l12, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
                if ((r28 & 57344) == 16384) {
                    i49 = i48;
                } else {
                    i49 = 0;
                }
                if ((r35 & 896) == 256) {
                    i54 = i48;
                } else {
                    i54 = 0;
                }
                int i91112 = i49 | i54;
                if ((i77 & 7168) == 2048) {
                    i55 = i48;
                } else {
                    i55 = 0;
                }
                int i91113 = i91112 | i55;
                list4 = list3;
                int i91114 = i91113 | (c28655q3.m87157i(list4) ? 1 : 0);
                if ((r35 & 7168) == 2048) {
                    i56 = i48;
                } else {
                    i56 = 0;
                }
                i57 = i56 | i91114;
                objM87133R6 = c28655q3.m87133R();
                if (i57 == 0) {
                    obj2 = obj;
                    list5 = list4;
                    Function3 function11119 = function7;
                    interfaceC4339a10 = interfaceC4339a8;
                    interfaceC28601c2 = interfaceC28601c1;
                    Object c32594d10 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function11119);
                    function11 = function11119;
                    c28655q3.m87172p0(c32594d10);
                    objM87133R6 = c32594d10;
                } else {
                    obj2 = obj;
                    list5 = list4;
                    Function3 function111110 = function7;
                    interfaceC4339a10 = interfaceC4339a8;
                    interfaceC28601c2 = interfaceC28601c1;
                    Object c32594d11 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function111110);
                    function11 = function111110;
                    c28655q3.m87172p0(c32594d11);
                    objM87133R6 = c32594d11;
                }
                interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                m101827S(state, interfaceC28601c2, c28655q3, (i811 & 14) | 48);
                C15043i8 c15043i13 = C15043i8.f56313a;
                C15247s c15247s9 = c15247s3;
                c28655q4 = c28655q3;
                InterfaceC4339a interfaceC4339a11114 = interfaceC4339a7;
                C15197y1 c15197y1M43130h6 = C15043i8.m43130h(r79.m121949b(c28655q3, i9116).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i9116).getBrandWhite(), 0L, r79.m121949b(c28655q3, i9116).getTransparent(), c38072d.m121949b(c28655q3, i9116).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
                f14 = 1;
                Modifier modifierM44456i6 = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q4.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q4, modifierM44456i6);
                c28655q4.m87158i0();
                Function3 function111111 = function11;
                if (c28655q4.f115903S) {
                    interfaceC4339a12 = c0213j;
                    c28655q4.m87163l(interfaceC4339a12);
                } else {
                    interfaceC4339a12 = c0213j;
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m119);
                if (c28655q4.f115903S) {
                    interfaceC4339a13 = interfaceC4339a10;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i5 = c0209i3;
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N119);
                    if (list5 == null) {
                        c28655q4.m87150e0(-793009074);
                        c28655q4.m87173q(false);
                        list6 = list5;
                        z28 = false;
                        function12 = function8;
                        obj3 = obj2;
                    } else {
                        c28655q4.m87150e0(-793009073);
                        C22971k c22971kM66746i11 = AbstractC22977m.m66746i(f14 * f13);
                        list6 = list5;
                        Modifier modifierM92100V11 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                        C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(c22971kM66746i11, C2299e.f9107J, c28655q4, 6);
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q4.m87165m();
                        Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q4, modifierM92100V11);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a12);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a14);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1110);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1110);
                        c28655q4.m87150e0(285190469);
                        while (r2.hasNext()) {
                            boolean zM87157i1114 = c28655q4.m87157i(c26810l);
                            if ((r35 & 458752) == 131072) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z34 = zM87157i1114 | z29;
                            objM87133R7 = c28655q4.m87133R();
                            if (z34) {
                                obj4 = obj2;
                                if (objM87133R7 == obj4) {
                                }
                                InterfaceC4339a interfaceC4339a11115 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i1115 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i1115 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a11115, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            } else {
                                obj4 = obj2;
                            }
                            objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                            c28655q4.m87172p0(objM87133R7);
                            InterfaceC4339a interfaceC4339a11116 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i1116 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i1116 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a11116, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        }
                        function12 = function8;
                        obj3 = obj2;
                        z28 = false;
                        AbstractC25012a.m73392y(c28655q4, false, true, false);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q4.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a14 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a14);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1111);
                    c0209i6 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1111);
                    Modifier modifierM3483b11 = AbstractC1126a.m3483b(c2314t, c15247s9);
                    if ((r35 & 234881024) == 67108864) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R9 = c28655q4.m87133R();
                    if (z37) {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    } else {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    Modifier modifierM3413j11 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b11, (Function1) objM87133R9), 0.0f, 30 * f17, 1);
                    TextResource textResourceM21278l11 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                    TextResource textResourceM21267a11 = AbstractC8693b.m21267a();
                    C39174f c39174f11 = new C39174f(f17 * f17);
                    if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    }
                    if (z4) {
                        abstractC17911tM43972A = AbstractC15673b0.m43972A();
                    }
                    AbstractC30784c.a aVar11 = new AbstractC30784c.a(i13, c39174f11, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                    if (z4) {
                        i58 = 4;
                    } else {
                        i58 = 0;
                    }
                    zM87153g = c28655q4.m87153g(interfaceC4339a11);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    C34348q0 c34348q10 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                    C33252i c33252iM105489e11 = AbstractC33253j.m105489e(3 * f17);
                    textResource = placeholderMessage;
                    i59 = 0;
                    C37816b c37816bM121344e11 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == obj3) {
                        objM87133R12 = new C32614h(i59, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    Function1 function111112 = (Function1) objM87133R12;
                    int i91115 = TextResource.$stable;
                    Function1 function111113 = function12;
                    AbstractC30792k.m94678l(modifierM3413j11, textResourceM21278l11, null, null, null, null, c37816bM121344e11, aVar11, textResourceM21267a11, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e11, c15197y1M43130h6, null, null, c34348q10, interfaceC4339a11, function111112, c28655q4, (i91115 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i91115 << 24), 224256, 3078, 48, 426647100, 0);
                    if (z4) {
                        c28655q4.m87150e0(-450989950);
                        Modifier modifierMo3401b11 = C1100b.f4583a.mo3401b(c2314t);
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == obj3) {
                            objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                        }
                        InterfaceC21083i interfaceC21083i12 = (InterfaceC21083i) objM87133R13;
                        if ((i37 & 14) == 4) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objM87133R14 = c28655q4.m87133R();
                        if (z38) {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        } else {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        }
                        AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b11, interfaceC21083i12, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                        c28655q4.m87173q(false);
                    } else {
                        interfaceC4339a15 = r7;
                        c28655q4.m87150e0(-450607472);
                        c28655q4.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    function4 = function111111;
                    interfaceC4339a5 = interfaceC4339a13;
                    interfaceC4351m3 = interfaceC4351m5;
                    function5 = function14;
                    interfaceC4339a6 = interfaceC4339a15;
                    c28655q = c28655q4;
                    function6 = function111113;
                    interfaceC4339a4 = interfaceC4339a11114;
                    list2 = list6;
                    interfaceC4351m4 = interfaceC4351m6;
                } else {
                    interfaceC4339a13 = interfaceC4339a10;
                }
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N119);
                if (list5 == null) {
                    c28655q4.m87150e0(-793009074);
                    c28655q4.m87173q(false);
                    list6 = list5;
                    z28 = false;
                    function12 = function8;
                    obj3 = obj2;
                } else {
                    c28655q4.m87150e0(-793009073);
                    C22971k c22971kM66746i12 = AbstractC22977m.m66746i(f14 * f13);
                    list6 = list5;
                    Modifier modifierM92100V12 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                    C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(c22971kM66746i12, C2299e.f9107J, c28655q4, 6);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q4.m87165m();
                    Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q4, modifierM92100V12);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a12);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a15);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1112);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1112);
                    c28655q4.m87150e0(285190469);
                    while (r2.hasNext()) {
                        boolean zM87157i1117 = c28655q4.m87157i(c26810l);
                        if ((r35 & 458752) == 131072) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zM87157i1117 | z29;
                        objM87133R7 = c28655q4.m87133R();
                        if (z34) {
                            obj4 = obj2;
                            if (objM87133R7 == obj4) {
                            }
                            InterfaceC4339a interfaceC4339a11117 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i1118 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i1118 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a11117, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        } else {
                            obj4 = obj2;
                        }
                        objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                        c28655q4.m87172p0(objM87133R7);
                        InterfaceC4339a interfaceC4339a11118 = (InterfaceC4339a) objM87133R7;
                        boolean zM87157i1119 = c28655q4.m87157i(c26810l);
                        if ((r35 & 57344) == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        z36 = zM87157i1119 | z35;
                        objM87133R8 = c28655q4.m87133R();
                        if (z36) {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        } else {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        AbstractC32688w1.m102571e(c26810l, interfaceC4339a11118, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                        obj2 = obj4;
                        function8 = function13;
                    }
                    function12 = function8;
                    obj3 = obj2;
                    z28 = false;
                    AbstractC25012a.m73392y(c28655q4, false, true, false);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q4.m87165m();
                Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q4, c2314t);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a14 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a14);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1113);
                c0209i6 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1113);
                Modifier modifierM3483b12 = AbstractC1126a.m3483b(c2314t, c15247s9);
                if ((r35 & 234881024) == 67108864) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objM87133R9 = c28655q4.m87133R();
                if (z37) {
                    function14 = function10;
                    objM87133R9 = new C32599e(function14, 0);
                    c28655q4.m87172p0(objM87133R9);
                } else {
                    function14 = function10;
                    objM87133R9 = new C32599e(function14, 0);
                    c28655q4.m87172p0(objM87133R9);
                }
                Modifier modifierM3413j12 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b12, (Function1) objM87133R9), 0.0f, 30 * f17, 1);
                TextResource textResourceM21278l12 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                TextResource textResourceM21267a12 = AbstractC8693b.m21267a();
                C39174f c39174f12 = new C39174f(f17 * f17);
                if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                    c28655q4.m87150e0(-1122965528);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj3) {
                        objM87133R10 = a.f135200w;
                        c28655q4.m87172p0(objM87133R10);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-1122965528);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj3) {
                        objM87133R10 = a.f135200w;
                        c28655q4.m87172p0(objM87133R10);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                    c28655q4.m87173q(false);
                }
                if (z4) {
                    abstractC17911tM43972A = AbstractC15673b0.m43972A();
                }
                AbstractC30784c.a aVar12 = new AbstractC30784c.a(i13, c39174f12, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                if (z4) {
                    i58 = 4;
                } else {
                    i58 = 0;
                }
                zM87153g = c28655q4.m87153g(interfaceC4339a11);
                objM87133R11 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R11 = new C32604f(interfaceC4339a11, 0);
                    c28655q4.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C32604f(interfaceC4339a11, 0);
                    c28655q4.m87172p0(objM87133R11);
                }
                C34348q0 c34348q11 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                C33252i c33252iM105489e12 = AbstractC33253j.m105489e(3 * f17);
                textResource = placeholderMessage;
                i59 = 0;
                C37816b c37816bM121344e12 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                objM87133R12 = c28655q4.m87133R();
                if (objM87133R12 == obj3) {
                    objM87133R12 = new C32614h(i59, interfaceC28601c2);
                    c28655q4.m87172p0(objM87133R12);
                }
                Function1 function111114 = (Function1) objM87133R12;
                int i91116 = TextResource.$stable;
                Function1 function111115 = function12;
                AbstractC30792k.m94678l(modifierM3413j12, textResourceM21278l12, null, null, null, null, c37816bM121344e12, aVar12, textResourceM21267a12, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e12, c15197y1M43130h6, null, null, c34348q11, interfaceC4339a11, function111114, c28655q4, (i91116 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i91116 << 24), 224256, 3078, 48, 426647100, 0);
                if (z4) {
                    c28655q4.m87150e0(-450989950);
                    Modifier modifierMo3401b12 = C1100b.f4583a.mo3401b(c2314t);
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == obj3) {
                        objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                    }
                    InterfaceC21083i interfaceC21083i13 = (InterfaceC21083i) objM87133R13;
                    if ((i37 & 14) == 4) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objM87133R14 = c28655q4.m87133R();
                    if (z38) {
                        interfaceC4339a15 = r7;
                        objM87133R14 = new C32579a(interfaceC4339a15, i59);
                        c28655q4.m87172p0(objM87133R14);
                    } else {
                        interfaceC4339a15 = r7;
                        objM87133R14 = new C32579a(interfaceC4339a15, i59);
                        c28655q4.m87172p0(objM87133R14);
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b12, interfaceC21083i13, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                    c28655q4.m87173q(false);
                } else {
                    interfaceC4339a15 = r7;
                    c28655q4.m87150e0(-450607472);
                    c28655q4.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q4, true, true, true);
                function4 = function111111;
                interfaceC4339a5 = interfaceC4339a13;
                interfaceC4351m3 = interfaceC4351m5;
                function5 = function14;
                interfaceC4339a6 = interfaceC4339a15;
                c28655q = c28655q4;
                function6 = function111115;
                interfaceC4339a4 = interfaceC4339a11114;
                list2 = list6;
                interfaceC4351m4 = interfaceC4351m6;
            } else {
                textResource = placeholderMessage;
                c28655q5.m87138X();
                interfaceC4339a4 = interfaceC4339a;
                interfaceC4339a5 = interfaceC4339a2;
                function4 = function3;
                interfaceC4351m3 = interfaceC4351m;
                list2 = list;
                function5 = function2;
                interfaceC4351m4 = interfaceC4351m2;
                interfaceC4339a6 = interfaceC4339a3;
                c28655q = c28655q5;
                function6 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final TextResource textResource4 = textResource;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj5, Object obj6) {
                        int iIntValue = ((Integer) obj6).intValue();
                        return AbstractC32619i.m101820L(i13, sendFieldColor, textResource4, z4, z13, z14, listState, z15, state, z16, mediaPickerLauncher, interfaceC4339a4, interfaceC4339a5, function4, function6, interfaceC4351m3, list2, interfaceC15250v, function5, interfaceC4351m4, interfaceC4339a6, i14, i15, i16, i17, (Composer) obj5, iIntValue);
                    }
                };
            }
        }
        i24 = i19 | 24576;
        i25 = i17 & 32768;
        if (i25 != 0) {
            i24 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q5.m87157i(interfaceC4351m)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = 65536;
            }
            i24 |= i26;
        }
        i27 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i27 != 0) {
            i24 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (c28655q5.m87157i(list)) {
                i28 = 1048576;
            } else {
                i28 = 524288;
            }
            i24 |= i28;
        }
        if ((i15 & 12582912) == 0) {
            i24 |= c28655q5.m87157i(interfaceC15250v) ? 8388608 : 4194304;
        }
        i29 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
        if (i29 != 0) {
            i24 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (c28655q5.m87157i(function2)) {
                i76 = 67108864;
            }
            i24 |= i76;
        }
        i34 = i17 & 524288;
        if (i34 != 0) {
            i24 |= 805306368;
        } else if ((i15 & 805306368) == 0) {
            i24 |= c28655q5.m87157i(interfaceC4351m2) ? 536870912 : 268435456;
        }
        i35 = i24;
        i36 = i17 & 1048576;
        if (i36 != 0) {
            if ((i16 & 6) == 0) {
                if (c28655q5.m87157i(interfaceC4339a3)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i39 = i16 | i38;
            } else {
                i37 = i16;
            }
            if ((i77 & 306783379) != 306783378) {
            }
            if (c28655q5.m87135U(i77 & 1, z17)) {
                i44 = 15;
                obj = C28635l.f115821a;
                if (i79 != 0) {
                    objM87133R24 = c28655q5.m87133R();
                    if (objM87133R24 == obj) {
                        objM87133R24 = new C32513d(i44);
                        c28655q5.m87172p0(objM87133R24);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R24;
                } else {
                    interfaceC4339a7 = interfaceC4339a;
                }
                if (i84 != 0) {
                    objM87133R23 = c28655q5.m87133R();
                    if (objM87133R23 == obj) {
                        objM87133R23 = new C32513d(16);
                        c28655q5.m87172p0(objM87133R23);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R23;
                } else {
                    interfaceC4339a8 = interfaceC4339a2;
                }
                i45 = 9;
                if (i86 != 0) {
                    objM87133R22 = c28655q5.m87133R();
                    if (objM87133R22 == obj) {
                        objM87133R22 = new C30745a(i45);
                        c28655q5.m87172p0(objM87133R22);
                    }
                    function7 = (Function3) objM87133R22;
                } else {
                    function7 = function3;
                }
                if (i88 != 0) {
                    objM87133R21 = c28655q5.m87133R();
                    if (objM87133R21 == obj) {
                        objM87133R21 = new C32375n(7);
                        c28655q5.m87172p0(objM87133R21);
                    }
                    function8 = (Function1) objM87133R21;
                } else {
                    function8 = function1;
                }
                if (i25 != 0) {
                    objM87133R20 = c28655q5.m87133R();
                    if (objM87133R20 == obj) {
                        objM87133R20 = new C31314a(15);
                        c28655q5.m87172p0(objM87133R20);
                    }
                    interfaceC4351m5 = (InterfaceC4351m) objM87133R20;
                } else {
                    interfaceC4351m5 = interfaceC4351m;
                }
                abstractC17911tM43972A = null;
                if (i27 != 0) {
                    list3 = null;
                } else {
                    list3 = list;
                }
                if (i29 != 0) {
                    objM87133R19 = c28655q5.m87133R();
                    if (objM87133R19 == obj) {
                        objM87133R19 = new C32375n(8);
                        c28655q5.m87172p0(objM87133R19);
                    }
                    function9 = (Function1) objM87133R19;
                } else {
                    interfaceC4351m5 = interfaceC4351m5;
                    function9 = function2;
                }
                if (i34 != 0) {
                    objM87133R18 = c28655q5.m87133R();
                    if (objM87133R18 == obj) {
                        objM87133R18 = new C31314a(16);
                        c28655q5.m87172p0(objM87133R18);
                    }
                    interfaceC4351m6 = (InterfaceC4351m) objM87133R18;
                } else {
                    interfaceC4339a8 = interfaceC4339a8;
                    interfaceC4351m6 = interfaceC4351m2;
                }
                if (i36 != 0) {
                    objM87133R17 = c28655q5.m87133R();
                    if (objM87133R17 == obj) {
                        objM87133R17 = new C32513d(17);
                        c28655q5.m87172p0(objM87133R17);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R17;
                } else {
                    interfaceC4339a9 = interfaceC4339a3;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                InterfaceC4339a interfaceC4339a11119 = interfaceC4339a9;
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = AbstractC33745d.m106649h(c28655q5);
                }
                c15247s = (C15247s) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = AbstractC11266d.m30453g(c28655q5);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R3;
                function10 = function9;
                if (((Boolean) AbstractC15751g.m44460m(interfaceC21083i, c28655q5, 6).getValue()).booleanValue()) {
                    if (interfaceC15250v != null) {
                        z44 = false;
                    } else {
                        z44 = false;
                    }
                    if (z44) {
                        interfaceC4351m6.invoke(C38423a.a.OPEN, Boolean.TRUE);
                    }
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q5.m87161k(AbstractC38073e.m121968p());
                Boolean boolValueOf7 = Boolean.valueOf(z15);
                Boolean boolValueOf8 = Boolean.valueOf(z16);
                if ((i77 & 29360128) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zM87157i1120 = z18 | c28655q5.m87157i(interfaceC15250v);
                if ((i35 & 1879048192) == 536870912) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z411 = zM87157i1120 | z19;
                if ((i77 & 3670016) == 1048576) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z412 = z411 | z24;
                if ((i77 & 1879048192) == 536870912) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z412 | z25;
                Object objM87133R28 = c28655q5.m87133R();
                if (z26) {
                    c28655q2 = c28655q5;
                    i46 = 8;
                    bVar = new b(z15, interfaceC15250v, interfaceC4351m6, c15247s, listState, z16, null);
                    c15247s2 = c15247s;
                    c28655q2.m87172p0(bVar);
                } else {
                    c28655q2 = c28655q5;
                    i46 = 8;
                    bVar = new b(z15, interfaceC15250v, interfaceC4351m6, c15247s, listState, z16, null);
                    c15247s2 = c15247s;
                    c28655q2.m87172p0(bVar);
                }
                int i812 = r28 >> 24;
                AbstractC28683x.m87254h(boolValueOf7, boolValueOf8, (InterfaceC4351m) bVar, c28655q2);
                f13 = i46;
                c2314t = C2314t.f9131w;
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(((float) 1.5d) * f13, c2314t);
                c38072d = C38072d.f163053a;
                int i91117 = C38072d.f163054b;
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM3394p4, c38072d.m121949b(c28655q2, i91117).getTransparent(), AbstractC17918w0.f69621a);
                float f18 = 4;
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * f18), C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q2.m87165m();
                Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q2, modifierM3358c4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a16);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m1114);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c15247s3 = c15247s2;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1114);
                    if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                        c28655q2.m87150e0(1403767226);
                        C27270o c27270o13 = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        String strM21273g13 = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                        objM87133R15 = c28655q2.m87133R();
                        if (objM87133R15 == obj) {
                            objM87133R15 = new C32375n(9);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        Modifier modifierM3390l13 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                        if ((r35 & 14) != 4) {
                            z39 = true;
                        } else {
                            z39 = true;
                        }
                        objM87133R16 = c28655q2.m87133R();
                        if (z39) {
                            i64 = 0;
                            objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                            c28655q2.m87172p0(objM87133R16);
                        } else {
                            i64 = 0;
                            objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                            c28655q2.m87172p0(objM87133R16);
                        }
                        C28655q c28655q18 = c28655q2;
                        AbstractC27242b1.m82092d(c27270o13, strM21273g13, null, modifierM3390l13, (InterfaceC4339a) objM87133R16, c28655q18, C27270o.f109105k, 4);
                        c28655q18.m87173q(i64);
                        c28655q3 = c28655q18;
                    } else {
                        C28655q c28655q19 = c28655q2;
                        c28655q19.m87150e0(1404745524);
                        c28655q19.m87173q(false);
                        c28655q3 = c28655q19;
                    }
                    C27270o c27270o14 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
                    String strM21273g14 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = new C32375n(10);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Modifier modifierM3390l14 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
                    if ((r35 & 112) == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R5 = c28655q3.m87133R();
                    if (z27) {
                        i47 = 1;
                        objM87133R5 = new C32579a(interfaceC4339a7, i47);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        i47 = 1;
                        objM87133R5 = new C32579a(interfaceC4339a7, i47);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    i48 = i47;
                    AbstractC27242b1.m82092d(c27270o14, strM21273g14, null, modifierM3390l14, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
                    if ((r28 & 57344) == 16384) {
                        i49 = i48;
                    } else {
                        i49 = 0;
                    }
                    if ((r35 & 896) == 256) {
                        i54 = i48;
                    } else {
                        i54 = 0;
                    }
                    int i91118 = i49 | i54;
                    if ((i77 & 7168) == 2048) {
                        i55 = i48;
                    } else {
                        i55 = 0;
                    }
                    int i91119 = i91118 | i55;
                    list4 = list3;
                    int i911110 = i91119 | (c28655q3.m87157i(list4) ? 1 : 0);
                    if ((r35 & 7168) == 2048) {
                        i56 = i48;
                    } else {
                        i56 = 0;
                    }
                    i57 = i56 | i911110;
                    objM87133R6 = c28655q3.m87133R();
                    if (i57 == 0) {
                        obj2 = obj;
                        list5 = list4;
                        Function3 function111116 = function7;
                        interfaceC4339a10 = interfaceC4339a8;
                        interfaceC28601c2 = interfaceC28601c1;
                        Object c32594d12 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function111116);
                        function11 = function111116;
                        c28655q3.m87172p0(c32594d12);
                        objM87133R6 = c32594d12;
                    } else {
                        obj2 = obj;
                        list5 = list4;
                        Function3 function111117 = function7;
                        interfaceC4339a10 = interfaceC4339a8;
                        interfaceC28601c2 = interfaceC28601c1;
                        Object c32594d13 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function111117);
                        function11 = function111117;
                        c28655q3.m87172p0(c32594d13);
                        objM87133R6 = c32594d13;
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                    m101827S(state, interfaceC28601c2, c28655q3, (i812 & 14) | 48);
                    C15043i8 c15043i14 = C15043i8.f56313a;
                    C15247s c15247s10 = c15247s3;
                    c28655q4 = c28655q3;
                    InterfaceC4339a interfaceC4339a111110 = interfaceC4339a7;
                    C15197y1 c15197y1M43130h7 = C15043i8.m43130h(r79.m121949b(c28655q3, i91117).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i91117).getBrandWhite(), 0L, r79.m121949b(c28655q3, i91117).getTransparent(), c38072d.m121949b(c28655q3, i91117).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
                    f14 = 1;
                    Modifier modifierM44456i7 = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q4.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q4, modifierM44456i7);
                    c28655q4.m87158i0();
                    Function3 function111118 = function11;
                    if (c28655q4.f115903S) {
                        interfaceC4339a12 = c0213j;
                        c28655q4.m87163l(interfaceC4339a12);
                    } else {
                        interfaceC4339a12 = c0213j;
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1115);
                    if (c28655q4.f115903S) {
                        interfaceC4339a13 = interfaceC4339a10;
                        if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                            c0209i5 = c0209i3;
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1115);
                        if (list5 == null) {
                            c28655q4.m87150e0(-793009074);
                            c28655q4.m87173q(false);
                            list6 = list5;
                            z28 = false;
                            function12 = function8;
                            obj3 = obj2;
                        } else {
                            c28655q4.m87150e0(-793009073);
                            C22971k c22971kM66746i13 = AbstractC22977m.m66746i(f14 * f13);
                            list6 = list5;
                            Modifier modifierM92100V13 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                            C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(c22971kM66746i13, C2299e.f9107J, c28655q4, 6);
                            iHashCode3 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q4.m87165m();
                            Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q4, modifierM92100V13);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a12);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a17);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1116);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1116);
                            c28655q4.m87150e0(285190469);
                            while (r2.hasNext()) {
                                boolean zM87157i11110 = c28655q4.m87157i(c26810l);
                                if ((r35 & 458752) == 131072) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                z34 = zM87157i11110 | z29;
                                objM87133R7 = c28655q4.m87133R();
                                if (z34) {
                                    obj4 = obj2;
                                    if (objM87133R7 == obj4) {
                                    }
                                    InterfaceC4339a interfaceC4339a111111 = (InterfaceC4339a) objM87133R7;
                                    boolean zM87157i11111 = c28655q4.m87157i(c26810l);
                                    if ((r35 & 57344) == 16384) {
                                        z35 = true;
                                    } else {
                                        z35 = false;
                                    }
                                    z36 = zM87157i11111 | z35;
                                    objM87133R8 = c28655q4.m87133R();
                                    if (z36) {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    } else {
                                        function13 = function8;
                                        objM87133R8 = new C32580a0(3, c26810l, function13);
                                        c28655q4.m87172p0(objM87133R8);
                                    }
                                    AbstractC32688w1.m102571e(c26810l, interfaceC4339a111111, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                    obj2 = obj4;
                                    function8 = function13;
                                } else {
                                    obj4 = obj2;
                                }
                                objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                                c28655q4.m87172p0(objM87133R7);
                                InterfaceC4339a interfaceC4339a111112 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i11112 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i11112 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a111112, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            }
                            function12 = function8;
                            obj3 = obj2;
                            z28 = false;
                            AbstractC25012a.m73392y(c28655q4, false, true, false);
                        }
                        InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                        iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q4.m87165m();
                        Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q4, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a14 = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a14);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d13);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1117);
                        c0209i6 = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1117);
                        Modifier modifierM3483b13 = AbstractC1126a.m3483b(c2314t, c15247s10);
                        if ((r35 & 234881024) == 67108864) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        objM87133R9 = c28655q4.m87133R();
                        if (z37) {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        } else {
                            function14 = function10;
                            objM87133R9 = new C32599e(function14, 0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        Modifier modifierM3413j13 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b13, (Function1) objM87133R9), 0.0f, 30 * f18, 1);
                        TextResource textResourceM21278l13 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                        TextResource textResourceM21267a13 = AbstractC8693b.m21267a();
                        C39174f c39174f13 = new C39174f(f18 * f18);
                        if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(-1122965528);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj3) {
                                objM87133R10 = a.f135200w;
                                c28655q4.m87172p0(objM87133R10);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                            c28655q4.m87173q(false);
                        }
                        if (z4) {
                            abstractC17911tM43972A = AbstractC15673b0.m43972A();
                        }
                        AbstractC30784c.a aVar13 = new AbstractC30784c.a(i13, c39174f13, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                        if (z4) {
                            i58 = 4;
                        } else {
                            i58 = 0;
                        }
                        zM87153g = c28655q4.m87153g(interfaceC4339a11);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87153g) {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32604f(interfaceC4339a11, 0);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        C34348q0 c34348q12 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                        C33252i c33252iM105489e13 = AbstractC33253j.m105489e(3 * f18);
                        textResource = placeholderMessage;
                        i59 = 0;
                        C37816b c37816bM121344e13 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == obj3) {
                            objM87133R12 = new C32614h(i59, interfaceC28601c2);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        Function1 function111119 = (Function1) objM87133R12;
                        int i911111 = TextResource.$stable;
                        Function1 function1111110 = function12;
                        AbstractC30792k.m94678l(modifierM3413j13, textResourceM21278l13, null, null, null, null, c37816bM121344e13, aVar13, textResourceM21267a13, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e13, c15197y1M43130h7, null, null, c34348q12, interfaceC4339a11, function111119, c28655q4, (i911111 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i911111 << 24), 224256, 3078, 48, 426647100, 0);
                        if (z4) {
                            c28655q4.m87150e0(-450989950);
                            Modifier modifierMo3401b13 = C1100b.f4583a.mo3401b(c2314t);
                            objM87133R13 = c28655q4.m87133R();
                            if (objM87133R13 == obj3) {
                                objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                            }
                            InterfaceC21083i interfaceC21083i14 = (InterfaceC21083i) objM87133R13;
                            if ((i37 & 14) == 4) {
                                z38 = true;
                            } else {
                                z38 = false;
                            }
                            objM87133R14 = c28655q4.m87133R();
                            if (z38) {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            } else {
                                interfaceC4339a15 = r7;
                                objM87133R14 = new C32579a(interfaceC4339a15, i59);
                                c28655q4.m87172p0(objM87133R14);
                            }
                            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b13, interfaceC21083i14, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                            c28655q4.m87173q(false);
                        } else {
                            interfaceC4339a15 = r7;
                            c28655q4.m87150e0(-450607472);
                            c28655q4.m87173q(false);
                        }
                        AbstractC25012a.m73392y(c28655q4, true, true, true);
                        function4 = function111118;
                        interfaceC4339a5 = interfaceC4339a13;
                        interfaceC4351m3 = interfaceC4351m5;
                        function5 = function14;
                        interfaceC4339a6 = interfaceC4339a15;
                        c28655q = c28655q4;
                        function6 = function1111110;
                        interfaceC4339a4 = interfaceC4339a111110;
                        list2 = list6;
                        interfaceC4351m4 = interfaceC4351m6;
                    } else {
                        interfaceC4339a13 = interfaceC4339a10;
                    }
                    c0209i5 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1115);
                    if (list5 == null) {
                        c28655q4.m87150e0(-793009074);
                        c28655q4.m87173q(false);
                        list6 = list5;
                        z28 = false;
                        function12 = function8;
                        obj3 = obj2;
                    } else {
                        c28655q4.m87150e0(-793009073);
                        C22971k c22971kM66746i14 = AbstractC22977m.m66746i(f14 * f13);
                        list6 = list5;
                        Modifier modifierM92100V14 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                        C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(c22971kM66746i14, C2299e.f9107J, c28655q4, 6);
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q4.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q4, modifierM92100V14);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a12);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a18);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1118);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1118);
                        c28655q4.m87150e0(285190469);
                        while (r2.hasNext()) {
                            boolean zM87157i11113 = c28655q4.m87157i(c26810l);
                            if ((r35 & 458752) == 131072) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z34 = zM87157i11113 | z29;
                            objM87133R7 = c28655q4.m87133R();
                            if (z34) {
                                obj4 = obj2;
                                if (objM87133R7 == obj4) {
                                }
                                InterfaceC4339a interfaceC4339a111113 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i11114 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i11114 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a111113, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            } else {
                                obj4 = obj2;
                            }
                            objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                            c28655q4.m87172p0(objM87133R7);
                            InterfaceC4339a interfaceC4339a111114 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i11115 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i11115 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a111114, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        }
                        function12 = function8;
                        obj3 = obj2;
                        z28 = false;
                        AbstractC25012a.m73392y(c28655q4, false, true, false);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q4.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a14 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a14);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d14);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m1119);
                    c0209i6 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N1119);
                    Modifier modifierM3483b14 = AbstractC1126a.m3483b(c2314t, c15247s10);
                    if ((r35 & 234881024) == 67108864) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R9 = c28655q4.m87133R();
                    if (z37) {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    } else {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    Modifier modifierM3413j14 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b14, (Function1) objM87133R9), 0.0f, 30 * f18, 1);
                    TextResource textResourceM21278l14 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                    TextResource textResourceM21267a14 = AbstractC8693b.m21267a();
                    C39174f c39174f14 = new C39174f(f18 * f18);
                    if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    }
                    if (z4) {
                        abstractC17911tM43972A = AbstractC15673b0.m43972A();
                    }
                    AbstractC30784c.a aVar14 = new AbstractC30784c.a(i13, c39174f14, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                    if (z4) {
                        i58 = 4;
                    } else {
                        i58 = 0;
                    }
                    zM87153g = c28655q4.m87153g(interfaceC4339a11);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    C34348q0 c34348q13 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                    C33252i c33252iM105489e14 = AbstractC33253j.m105489e(3 * f18);
                    textResource = placeholderMessage;
                    i59 = 0;
                    C37816b c37816bM121344e14 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == obj3) {
                        objM87133R12 = new C32614h(i59, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    Function1 function1111111 = (Function1) objM87133R12;
                    int i911112 = TextResource.$stable;
                    Function1 function1111112 = function12;
                    AbstractC30792k.m94678l(modifierM3413j14, textResourceM21278l14, null, null, null, null, c37816bM121344e14, aVar14, textResourceM21267a14, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e14, c15197y1M43130h7, null, null, c34348q13, interfaceC4339a11, function1111111, c28655q4, (i911112 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i911112 << 24), 224256, 3078, 48, 426647100, 0);
                    if (z4) {
                        c28655q4.m87150e0(-450989950);
                        Modifier modifierMo3401b14 = C1100b.f4583a.mo3401b(c2314t);
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == obj3) {
                            objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                        }
                        InterfaceC21083i interfaceC21083i15 = (InterfaceC21083i) objM87133R13;
                        if ((i37 & 14) == 4) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objM87133R14 = c28655q4.m87133R();
                        if (z38) {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        } else {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        }
                        AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b14, interfaceC21083i15, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                        c28655q4.m87173q(false);
                    } else {
                        interfaceC4339a15 = r7;
                        c28655q4.m87150e0(-450607472);
                        c28655q4.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    function4 = function111118;
                    interfaceC4339a5 = interfaceC4339a13;
                    interfaceC4351m3 = interfaceC4351m5;
                    function5 = function14;
                    interfaceC4339a6 = interfaceC4339a15;
                    c28655q = c28655q4;
                    function6 = function1111112;
                    interfaceC4339a4 = interfaceC4339a111110;
                    list2 = list6;
                    interfaceC4351m4 = interfaceC4351m6;
                } else {
                    c15247s3 = c15247s2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N1114);
                if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                    c28655q2.m87150e0(1403767226);
                    C27270o c27270o15 = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    String strM21273g15 = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == obj) {
                        objM87133R15 = new C32375n(9);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    Modifier modifierM3390l15 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                    if ((r35 & 14) != 4) {
                        z39 = true;
                    } else {
                        z39 = true;
                    }
                    objM87133R16 = c28655q2.m87133R();
                    if (z39) {
                        i64 = 0;
                        objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                        c28655q2.m87172p0(objM87133R16);
                    } else {
                        i64 = 0;
                        objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    C28655q c28655q110 = c28655q2;
                    AbstractC27242b1.m82092d(c27270o15, strM21273g15, null, modifierM3390l15, (InterfaceC4339a) objM87133R16, c28655q110, C27270o.f109105k, 4);
                    c28655q110.m87173q(i64);
                    c28655q3 = c28655q110;
                } else {
                    C28655q c28655q111 = c28655q2;
                    c28655q111.m87150e0(1404745524);
                    c28655q111.m87173q(false);
                    c28655q3 = c28655q111;
                }
                C27270o c27270o16 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
                String strM21273g16 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = new C32375n(10);
                    c28655q3.m87172p0(objM87133R4);
                }
                Modifier modifierM3390l16 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
                if ((r35 & 112) == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R5 = c28655q3.m87133R();
                if (z27) {
                    i47 = 1;
                    objM87133R5 = new C32579a(interfaceC4339a7, i47);
                    c28655q3.m87172p0(objM87133R5);
                } else {
                    i47 = 1;
                    objM87133R5 = new C32579a(interfaceC4339a7, i47);
                    c28655q3.m87172p0(objM87133R5);
                }
                i48 = i47;
                AbstractC27242b1.m82092d(c27270o16, strM21273g16, null, modifierM3390l16, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
                if ((r28 & 57344) == 16384) {
                    i49 = i48;
                } else {
                    i49 = 0;
                }
                if ((r35 & 896) == 256) {
                    i54 = i48;
                } else {
                    i54 = 0;
                }
                int i911113 = i49 | i54;
                if ((i77 & 7168) == 2048) {
                    i55 = i48;
                } else {
                    i55 = 0;
                }
                int i911114 = i911113 | i55;
                list4 = list3;
                int i911115 = i911114 | (c28655q3.m87157i(list4) ? 1 : 0);
                if ((r35 & 7168) == 2048) {
                    i56 = i48;
                } else {
                    i56 = 0;
                }
                i57 = i56 | i911115;
                objM87133R6 = c28655q3.m87133R();
                if (i57 == 0) {
                    obj2 = obj;
                    list5 = list4;
                    Function3 function1111113 = function7;
                    interfaceC4339a10 = interfaceC4339a8;
                    interfaceC28601c2 = interfaceC28601c1;
                    Object c32594d14 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function1111113);
                    function11 = function1111113;
                    c28655q3.m87172p0(c32594d14);
                    objM87133R6 = c32594d14;
                } else {
                    obj2 = obj;
                    list5 = list4;
                    Function3 function1111114 = function7;
                    interfaceC4339a10 = interfaceC4339a8;
                    interfaceC28601c2 = interfaceC28601c1;
                    Object c32594d15 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function1111114);
                    function11 = function1111114;
                    c28655q3.m87172p0(c32594d15);
                    objM87133R6 = c32594d15;
                }
                interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                m101827S(state, interfaceC28601c2, c28655q3, (i812 & 14) | 48);
                C15043i8 c15043i15 = C15043i8.f56313a;
                C15247s c15247s11 = c15247s3;
                c28655q4 = c28655q3;
                InterfaceC4339a interfaceC4339a111115 = interfaceC4339a7;
                C15197y1 c15197y1M43130h8 = C15043i8.m43130h(r79.m121949b(c28655q3, i91117).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i91117).getBrandWhite(), 0L, r79.m121949b(c28655q3, i91117).getTransparent(), c38072d.m121949b(c28655q3, i91117).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
                f14 = 1;
                Modifier modifierM44456i8 = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q4.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q4, modifierM44456i8);
                c28655q4.m87158i0();
                Function3 function1111115 = function11;
                if (c28655q4.f115903S) {
                    interfaceC4339a12 = c0213j;
                    c28655q4.m87163l(interfaceC4339a12);
                } else {
                    interfaceC4339a12 = c0213j;
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11110);
                if (c28655q4.f115903S) {
                    interfaceC4339a13 = interfaceC4339a10;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i5 = c0209i3;
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11110);
                    if (list5 == null) {
                        c28655q4.m87150e0(-793009074);
                        c28655q4.m87173q(false);
                        list6 = list5;
                        z28 = false;
                        function12 = function8;
                        obj3 = obj2;
                    } else {
                        c28655q4.m87150e0(-793009073);
                        C22971k c22971kM66746i15 = AbstractC22977m.m66746i(f14 * f13);
                        list6 = list5;
                        Modifier modifierM92100V15 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                        C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(c22971kM66746i15, C2299e.f9107J, c28655q4, 6);
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q4.m87165m();
                        Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q4, modifierM92100V15);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a12);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a19);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11111);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11111);
                        c28655q4.m87150e0(285190469);
                        while (r2.hasNext()) {
                            boolean zM87157i11116 = c28655q4.m87157i(c26810l);
                            if ((r35 & 458752) == 131072) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z34 = zM87157i11116 | z29;
                            objM87133R7 = c28655q4.m87133R();
                            if (z34) {
                                obj4 = obj2;
                                if (objM87133R7 == obj4) {
                                }
                                InterfaceC4339a interfaceC4339a111116 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i11117 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i11117 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a111116, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            } else {
                                obj4 = obj2;
                            }
                            objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                            c28655q4.m87172p0(objM87133R7);
                            InterfaceC4339a interfaceC4339a111117 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i11118 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i11118 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a111117, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        }
                        function12 = function8;
                        obj3 = obj2;
                        z28 = false;
                        AbstractC25012a.m73392y(c28655q4, false, true, false);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q4.m87165m();
                    Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a14 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a14);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d15);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11112);
                    c0209i6 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11112);
                    Modifier modifierM3483b15 = AbstractC1126a.m3483b(c2314t, c15247s11);
                    if ((r35 & 234881024) == 67108864) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R9 = c28655q4.m87133R();
                    if (z37) {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    } else {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    Modifier modifierM3413j15 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b15, (Function1) objM87133R9), 0.0f, 30 * f18, 1);
                    TextResource textResourceM21278l15 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                    TextResource textResourceM21267a15 = AbstractC8693b.m21267a();
                    C39174f c39174f15 = new C39174f(f18 * f18);
                    if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    }
                    if (z4) {
                        abstractC17911tM43972A = AbstractC15673b0.m43972A();
                    }
                    AbstractC30784c.a aVar15 = new AbstractC30784c.a(i13, c39174f15, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                    if (z4) {
                        i58 = 4;
                    } else {
                        i58 = 0;
                    }
                    zM87153g = c28655q4.m87153g(interfaceC4339a11);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    C34348q0 c34348q14 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                    C33252i c33252iM105489e15 = AbstractC33253j.m105489e(3 * f18);
                    textResource = placeholderMessage;
                    i59 = 0;
                    C37816b c37816bM121344e15 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == obj3) {
                        objM87133R12 = new C32614h(i59, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    Function1 function1111116 = (Function1) objM87133R12;
                    int i911116 = TextResource.$stable;
                    Function1 function1111117 = function12;
                    AbstractC30792k.m94678l(modifierM3413j15, textResourceM21278l15, null, null, null, null, c37816bM121344e15, aVar15, textResourceM21267a15, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e15, c15197y1M43130h8, null, null, c34348q14, interfaceC4339a11, function1111116, c28655q4, (i911116 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i911116 << 24), 224256, 3078, 48, 426647100, 0);
                    if (z4) {
                        c28655q4.m87150e0(-450989950);
                        Modifier modifierMo3401b15 = C1100b.f4583a.mo3401b(c2314t);
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == obj3) {
                            objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                        }
                        InterfaceC21083i interfaceC21083i16 = (InterfaceC21083i) objM87133R13;
                        if ((i37 & 14) == 4) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objM87133R14 = c28655q4.m87133R();
                        if (z38) {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        } else {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        }
                        AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b15, interfaceC21083i16, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                        c28655q4.m87173q(false);
                    } else {
                        interfaceC4339a15 = r7;
                        c28655q4.m87150e0(-450607472);
                        c28655q4.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    function4 = function1111115;
                    interfaceC4339a5 = interfaceC4339a13;
                    interfaceC4351m3 = interfaceC4351m5;
                    function5 = function14;
                    interfaceC4339a6 = interfaceC4339a15;
                    c28655q = c28655q4;
                    function6 = function1111117;
                    interfaceC4339a4 = interfaceC4339a111115;
                    list2 = list6;
                    interfaceC4351m4 = interfaceC4351m6;
                } else {
                    interfaceC4339a13 = interfaceC4339a10;
                }
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11110);
                if (list5 == null) {
                    c28655q4.m87150e0(-793009074);
                    c28655q4.m87173q(false);
                    list6 = list5;
                    z28 = false;
                    function12 = function8;
                    obj3 = obj2;
                } else {
                    c28655q4.m87150e0(-793009073);
                    C22971k c22971kM66746i16 = AbstractC22977m.m66746i(f14 * f13);
                    list6 = list5;
                    Modifier modifierM92100V16 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(c22971kM66746i16, C2299e.f9107J, c28655q4, 6);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q4.m87165m();
                    Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q4, modifierM92100V16);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a12);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11113);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11113);
                    c28655q4.m87150e0(285190469);
                    while (r2.hasNext()) {
                        boolean zM87157i11119 = c28655q4.m87157i(c26810l);
                        if ((r35 & 458752) == 131072) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zM87157i11119 | z29;
                        objM87133R7 = c28655q4.m87133R();
                        if (z34) {
                            obj4 = obj2;
                            if (objM87133R7 == obj4) {
                            }
                            InterfaceC4339a interfaceC4339a111118 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i111110 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i111110 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a111118, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        } else {
                            obj4 = obj2;
                        }
                        objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                        c28655q4.m87172p0(objM87133R7);
                        InterfaceC4339a interfaceC4339a111119 = (InterfaceC4339a) objM87133R7;
                        boolean zM87157i111111 = c28655q4.m87157i(c26810l);
                        if ((r35 & 57344) == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        z36 = zM87157i111111 | z35;
                        objM87133R8 = c28655q4.m87133R();
                        if (z36) {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        } else {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        AbstractC32688w1.m102571e(c26810l, interfaceC4339a111119, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                        obj2 = obj4;
                        function8 = function13;
                    }
                    function12 = function8;
                    obj3 = obj2;
                    z28 = false;
                    AbstractC25012a.m73392y(c28655q4, false, true, false);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q4.m87165m();
                Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q4, c2314t);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a14 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a14);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d16);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11114);
                c0209i6 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11114);
                Modifier modifierM3483b16 = AbstractC1126a.m3483b(c2314t, c15247s11);
                if ((r35 & 234881024) == 67108864) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objM87133R9 = c28655q4.m87133R();
                if (z37) {
                    function14 = function10;
                    objM87133R9 = new C32599e(function14, 0);
                    c28655q4.m87172p0(objM87133R9);
                } else {
                    function14 = function10;
                    objM87133R9 = new C32599e(function14, 0);
                    c28655q4.m87172p0(objM87133R9);
                }
                Modifier modifierM3413j16 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b16, (Function1) objM87133R9), 0.0f, 30 * f18, 1);
                TextResource textResourceM21278l16 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                TextResource textResourceM21267a16 = AbstractC8693b.m21267a();
                C39174f c39174f16 = new C39174f(f18 * f18);
                if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                    c28655q4.m87150e0(-1122965528);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj3) {
                        objM87133R10 = a.f135200w;
                        c28655q4.m87172p0(objM87133R10);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-1122965528);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj3) {
                        objM87133R10 = a.f135200w;
                        c28655q4.m87172p0(objM87133R10);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                    c28655q4.m87173q(false);
                }
                if (z4) {
                    abstractC17911tM43972A = AbstractC15673b0.m43972A();
                }
                AbstractC30784c.a aVar16 = new AbstractC30784c.a(i13, c39174f16, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                if (z4) {
                    i58 = 4;
                } else {
                    i58 = 0;
                }
                zM87153g = c28655q4.m87153g(interfaceC4339a11);
                objM87133R11 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R11 = new C32604f(interfaceC4339a11, 0);
                    c28655q4.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C32604f(interfaceC4339a11, 0);
                    c28655q4.m87172p0(objM87133R11);
                }
                C34348q0 c34348q15 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                C33252i c33252iM105489e16 = AbstractC33253j.m105489e(3 * f18);
                textResource = placeholderMessage;
                i59 = 0;
                C37816b c37816bM121344e16 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                objM87133R12 = c28655q4.m87133R();
                if (objM87133R12 == obj3) {
                    objM87133R12 = new C32614h(i59, interfaceC28601c2);
                    c28655q4.m87172p0(objM87133R12);
                }
                Function1 function1111118 = (Function1) objM87133R12;
                int i911117 = TextResource.$stable;
                Function1 function1111119 = function12;
                AbstractC30792k.m94678l(modifierM3413j16, textResourceM21278l16, null, null, null, null, c37816bM121344e16, aVar16, textResourceM21267a16, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e16, c15197y1M43130h8, null, null, c34348q15, interfaceC4339a11, function1111118, c28655q4, (i911117 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i911117 << 24), 224256, 3078, 48, 426647100, 0);
                if (z4) {
                    c28655q4.m87150e0(-450989950);
                    Modifier modifierMo3401b16 = C1100b.f4583a.mo3401b(c2314t);
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == obj3) {
                        objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                    }
                    InterfaceC21083i interfaceC21083i17 = (InterfaceC21083i) objM87133R13;
                    if ((i37 & 14) == 4) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objM87133R14 = c28655q4.m87133R();
                    if (z38) {
                        interfaceC4339a15 = r7;
                        objM87133R14 = new C32579a(interfaceC4339a15, i59);
                        c28655q4.m87172p0(objM87133R14);
                    } else {
                        interfaceC4339a15 = r7;
                        objM87133R14 = new C32579a(interfaceC4339a15, i59);
                        c28655q4.m87172p0(objM87133R14);
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b16, interfaceC21083i17, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                    c28655q4.m87173q(false);
                } else {
                    interfaceC4339a15 = r7;
                    c28655q4.m87150e0(-450607472);
                    c28655q4.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q4, true, true, true);
                function4 = function1111115;
                interfaceC4339a5 = interfaceC4339a13;
                interfaceC4351m3 = interfaceC4351m5;
                function5 = function14;
                interfaceC4339a6 = interfaceC4339a15;
                c28655q = c28655q4;
                function6 = function1111119;
                interfaceC4339a4 = interfaceC4339a111115;
                list2 = list6;
                interfaceC4351m4 = interfaceC4351m6;
            } else {
                textResource = placeholderMessage;
                c28655q5.m87138X();
                interfaceC4339a4 = interfaceC4339a;
                interfaceC4339a5 = interfaceC4339a2;
                function4 = function3;
                interfaceC4351m3 = interfaceC4351m;
                list2 = list;
                function5 = function2;
                interfaceC4351m4 = interfaceC4351m2;
                interfaceC4339a6 = interfaceC4339a3;
                c28655q = c28655q5;
                function6 = function1;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final TextResource textResource5 = textResource;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj5, Object obj6) {
                        int iIntValue = ((Integer) obj6).intValue();
                        return AbstractC32619i.m101820L(i13, sendFieldColor, textResource5, z4, z13, z14, listState, z15, state, z16, mediaPickerLauncher, interfaceC4339a4, interfaceC4339a5, function4, function6, interfaceC4351m3, list2, interfaceC15250v, function5, interfaceC4351m4, interfaceC4339a6, i14, i15, i16, i17, (Composer) obj5, iIntValue);
                    }
                };
            }
        }
        i39 = i16 | 6;
        i37 = i39;
        if ((i77 & 306783379) != 306783378) {
        }
        if (c28655q5.m87135U(i77 & 1, z17)) {
            i44 = 15;
            obj = C28635l.f115821a;
            if (i79 != 0) {
                objM87133R24 = c28655q5.m87133R();
                if (objM87133R24 == obj) {
                    objM87133R24 = new C32513d(i44);
                    c28655q5.m87172p0(objM87133R24);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R24;
            } else {
                interfaceC4339a7 = interfaceC4339a;
            }
            if (i84 != 0) {
                objM87133R23 = c28655q5.m87133R();
                if (objM87133R23 == obj) {
                    objM87133R23 = new C32513d(16);
                    c28655q5.m87172p0(objM87133R23);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R23;
            } else {
                interfaceC4339a8 = interfaceC4339a2;
            }
            i45 = 9;
            if (i86 != 0) {
                objM87133R22 = c28655q5.m87133R();
                if (objM87133R22 == obj) {
                    objM87133R22 = new C30745a(i45);
                    c28655q5.m87172p0(objM87133R22);
                }
                function7 = (Function3) objM87133R22;
            } else {
                function7 = function3;
            }
            if (i88 != 0) {
                objM87133R21 = c28655q5.m87133R();
                if (objM87133R21 == obj) {
                    objM87133R21 = new C32375n(7);
                    c28655q5.m87172p0(objM87133R21);
                }
                function8 = (Function1) objM87133R21;
            } else {
                function8 = function1;
            }
            if (i25 != 0) {
                objM87133R20 = c28655q5.m87133R();
                if (objM87133R20 == obj) {
                    objM87133R20 = new C31314a(15);
                    c28655q5.m87172p0(objM87133R20);
                }
                interfaceC4351m5 = (InterfaceC4351m) objM87133R20;
            } else {
                interfaceC4351m5 = interfaceC4351m;
            }
            abstractC17911tM43972A = null;
            if (i27 != 0) {
                list3 = null;
            } else {
                list3 = list;
            }
            if (i29 != 0) {
                objM87133R19 = c28655q5.m87133R();
                if (objM87133R19 == obj) {
                    objM87133R19 = new C32375n(8);
                    c28655q5.m87172p0(objM87133R19);
                }
                function9 = (Function1) objM87133R19;
            } else {
                interfaceC4351m5 = interfaceC4351m5;
                function9 = function2;
            }
            if (i34 != 0) {
                objM87133R18 = c28655q5.m87133R();
                if (objM87133R18 == obj) {
                    objM87133R18 = new C31314a(16);
                    c28655q5.m87172p0(objM87133R18);
                }
                interfaceC4351m6 = (InterfaceC4351m) objM87133R18;
            } else {
                interfaceC4339a8 = interfaceC4339a8;
                interfaceC4351m6 = interfaceC4351m2;
            }
            if (i36 != 0) {
                objM87133R17 = c28655q5.m87133R();
                if (objM87133R17 == obj) {
                    objM87133R17 = new C32513d(17);
                    c28655q5.m87172p0(objM87133R17);
                }
                interfaceC4339a9 = (InterfaceC4339a) objM87133R17;
            } else {
                interfaceC4339a9 = interfaceC4339a3;
            }
            objM87133R = c28655q5.m87133R();
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q5.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC4339a interfaceC4339a111120 = interfaceC4339a9;
            objM87133R2 = c28655q5.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = AbstractC33745d.m106649h(c28655q5);
            }
            c15247s = (C15247s) objM87133R2;
            objM87133R3 = c28655q5.m87133R();
            if (objM87133R3 == obj) {
                objM87133R3 = AbstractC11266d.m30453g(c28655q5);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R3;
            function10 = function9;
            if (((Boolean) AbstractC15751g.m44460m(interfaceC21083i, c28655q5, 6).getValue()).booleanValue()) {
                if (interfaceC15250v != null) {
                    z44 = false;
                } else {
                    z44 = false;
                }
                if (z44) {
                    interfaceC4351m6.invoke(C38423a.a.OPEN, Boolean.TRUE);
                }
            }
            featureFlagChecker = (FeatureFlagChecker) c28655q5.m87161k(AbstractC38073e.m121968p());
            Boolean boolValueOf9 = Boolean.valueOf(z15);
            Boolean boolValueOf10 = Boolean.valueOf(z16);
            if ((i77 & 29360128) == 8388608) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean zM87157i1121 = z18 | c28655q5.m87157i(interfaceC15250v);
            if ((i35 & 1879048192) == 536870912) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z413 = zM87157i1121 | z19;
            if ((i77 & 3670016) == 1048576) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z414 = z413 | z24;
            if ((i77 & 1879048192) == 536870912) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = z414 | z25;
            Object objM87133R29 = c28655q5.m87133R();
            if (z26) {
                c28655q2 = c28655q5;
                i46 = 8;
                bVar = new b(z15, interfaceC15250v, interfaceC4351m6, c15247s, listState, z16, null);
                c15247s2 = c15247s;
                c28655q2.m87172p0(bVar);
            } else {
                c28655q2 = c28655q5;
                i46 = 8;
                bVar = new b(z15, interfaceC15250v, interfaceC4351m6, c15247s, listState, z16, null);
                c15247s2 = c15247s;
                c28655q2.m87172p0(bVar);
            }
            int i813 = r28 >> 24;
            AbstractC28683x.m87254h(boolValueOf9, boolValueOf10, (InterfaceC4351m) bVar, c28655q2);
            f13 = i46;
            c2314t = C2314t.f9131w;
            Modifier modifierM3394p5 = AbstractC1099a.m3394p(((float) 1.5d) * f13, c2314t);
            c38072d = C38072d.f163053a;
            int i911118 = C38072d.f163054b;
            Modifier modifierM3358c5 = AbstractC1092a.m3358c(modifierM3394p5, c38072d.m121949b(c28655q2, i911118).getTransparent(), AbstractC17918w0.f69621a);
            float f19 = 4;
            C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * f19), C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q2.m87165m();
            Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q2, modifierM3358c5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a111);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11115);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c15247s3 = c15247s2;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11115);
                if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                    c28655q2.m87150e0(1403767226);
                    C27270o c27270o17 = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    String strM21273g17 = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                    objM87133R15 = c28655q2.m87133R();
                    if (objM87133R15 == obj) {
                        objM87133R15 = new C32375n(9);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    Modifier modifierM3390l17 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                    if ((r35 & 14) != 4) {
                        z39 = true;
                    } else {
                        z39 = true;
                    }
                    objM87133R16 = c28655q2.m87133R();
                    if (z39) {
                        i64 = 0;
                        objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                        c28655q2.m87172p0(objM87133R16);
                    } else {
                        i64 = 0;
                        objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    C28655q c28655q112 = c28655q2;
                    AbstractC27242b1.m82092d(c27270o17, strM21273g17, null, modifierM3390l17, (InterfaceC4339a) objM87133R16, c28655q112, C27270o.f109105k, 4);
                    c28655q112.m87173q(i64);
                    c28655q3 = c28655q112;
                } else {
                    C28655q c28655q113 = c28655q2;
                    c28655q113.m87150e0(1404745524);
                    c28655q113.m87173q(false);
                    c28655q3 = c28655q113;
                }
                C27270o c27270o18 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
                String strM21273g18 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = new C32375n(10);
                    c28655q3.m87172p0(objM87133R4);
                }
                Modifier modifierM3390l18 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
                if ((r35 & 112) == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                objM87133R5 = c28655q3.m87133R();
                if (z27) {
                    i47 = 1;
                    objM87133R5 = new C32579a(interfaceC4339a7, i47);
                    c28655q3.m87172p0(objM87133R5);
                } else {
                    i47 = 1;
                    objM87133R5 = new C32579a(interfaceC4339a7, i47);
                    c28655q3.m87172p0(objM87133R5);
                }
                i48 = i47;
                AbstractC27242b1.m82092d(c27270o18, strM21273g18, null, modifierM3390l18, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
                if ((r28 & 57344) == 16384) {
                    i49 = i48;
                } else {
                    i49 = 0;
                }
                if ((r35 & 896) == 256) {
                    i54 = i48;
                } else {
                    i54 = 0;
                }
                int i911119 = i49 | i54;
                if ((i77 & 7168) == 2048) {
                    i55 = i48;
                } else {
                    i55 = 0;
                }
                int i9111110 = i911119 | i55;
                list4 = list3;
                int i9111111 = i9111110 | (c28655q3.m87157i(list4) ? 1 : 0);
                if ((r35 & 7168) == 2048) {
                    i56 = i48;
                } else {
                    i56 = 0;
                }
                i57 = i56 | i9111111;
                objM87133R6 = c28655q3.m87133R();
                if (i57 == 0) {
                    obj2 = obj;
                    list5 = list4;
                    Function3 function11111110 = function7;
                    interfaceC4339a10 = interfaceC4339a8;
                    interfaceC28601c2 = interfaceC28601c1;
                    Object c32594d16 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function11111110);
                    function11 = function11111110;
                    c28655q3.m87172p0(c32594d16);
                    objM87133R6 = c32594d16;
                } else {
                    obj2 = obj;
                    list5 = list4;
                    Function3 function11111111 = function7;
                    interfaceC4339a10 = interfaceC4339a8;
                    interfaceC28601c2 = interfaceC28601c1;
                    Object c32594d17 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function11111111);
                    function11 = function11111111;
                    c28655q3.m87172p0(c32594d17);
                    objM87133R6 = c32594d17;
                }
                interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
                m101827S(state, interfaceC28601c2, c28655q3, (i813 & 14) | 48);
                C15043i8 c15043i16 = C15043i8.f56313a;
                C15247s c15247s12 = c15247s3;
                c28655q4 = c28655q3;
                InterfaceC4339a interfaceC4339a1111110 = interfaceC4339a7;
                C15197y1 c15197y1M43130h9 = C15043i8.m43130h(r79.m121949b(c28655q3, i911118).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i911118).getBrandWhite(), 0L, r79.m121949b(c28655q3, i911118).getTransparent(), c38072d.m121949b(c28655q3, i911118).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
                f14 = 1;
                Modifier modifierM44456i9 = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q4.m87165m();
                Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q4, modifierM44456i9);
                c28655q4.m87158i0();
                Function3 function11111112 = function11;
                if (c28655q4.f115903S) {
                    interfaceC4339a12 = c0213j;
                    c28655q4.m87163l(interfaceC4339a12);
                } else {
                    interfaceC4339a12 = c0213j;
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11116);
                if (c28655q4.f115903S) {
                    interfaceC4339a13 = interfaceC4339a10;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i5 = c0209i3;
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11116);
                    if (list5 == null) {
                        c28655q4.m87150e0(-793009074);
                        c28655q4.m87173q(false);
                        list6 = list5;
                        z28 = false;
                        function12 = function8;
                        obj3 = obj2;
                    } else {
                        c28655q4.m87150e0(-793009073);
                        C22971k c22971kM66746i17 = AbstractC22977m.m66746i(f14 * f13);
                        list6 = list5;
                        Modifier modifierM92100V17 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                        C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(c22971kM66746i17, C2299e.f9107J, c28655q4, 6);
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q4.m87165m();
                        Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q4, modifierM92100V17);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a12);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a112);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11117);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11117);
                        c28655q4.m87150e0(285190469);
                        while (r2.hasNext()) {
                            boolean zM87157i111112 = c28655q4.m87157i(c26810l);
                            if ((r35 & 458752) == 131072) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z34 = zM87157i111112 | z29;
                            objM87133R7 = c28655q4.m87133R();
                            if (z34) {
                                obj4 = obj2;
                                if (objM87133R7 == obj4) {
                                }
                                InterfaceC4339a interfaceC4339a1111111 = (InterfaceC4339a) objM87133R7;
                                boolean zM87157i111113 = c28655q4.m87157i(c26810l);
                                if ((r35 & 57344) == 16384) {
                                    z35 = true;
                                } else {
                                    z35 = false;
                                }
                                z36 = zM87157i111113 | z35;
                                objM87133R8 = c28655q4.m87133R();
                                if (z36) {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                } else {
                                    function13 = function8;
                                    objM87133R8 = new C32580a0(3, c26810l, function13);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                AbstractC32688w1.m102571e(c26810l, interfaceC4339a1111111, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                                obj2 = obj4;
                                function8 = function13;
                            } else {
                                obj4 = obj2;
                            }
                            objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                            c28655q4.m87172p0(objM87133R7);
                            InterfaceC4339a interfaceC4339a1111112 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i111114 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i111114 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a1111112, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        }
                        function12 = function8;
                        obj3 = obj2;
                        z28 = false;
                        AbstractC25012a.m73392y(c28655q4, false, true, false);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q4.m87165m();
                    Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a14 = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a14);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d17);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11118);
                    c0209i6 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11118);
                    Modifier modifierM3483b17 = AbstractC1126a.m3483b(c2314t, c15247s12);
                    if ((r35 & 234881024) == 67108864) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    objM87133R9 = c28655q4.m87133R();
                    if (z37) {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    } else {
                        function14 = function10;
                        objM87133R9 = new C32599e(function14, 0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    Modifier modifierM3413j17 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b17, (Function1) objM87133R9), 0.0f, 30 * f19, 1);
                    TextResource textResourceM21278l17 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                    TextResource textResourceM21267a17 = AbstractC8693b.m21267a();
                    C39174f c39174f17 = new C39174f(f19 * f19);
                    if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1122965528);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj3) {
                            objM87133R10 = a.f135200w;
                            c28655q4.m87172p0(objM87133R10);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                        c28655q4.m87173q(false);
                    }
                    if (z4) {
                        abstractC17911tM43972A = AbstractC15673b0.m43972A();
                    }
                    AbstractC30784c.a aVar17 = new AbstractC30784c.a(i13, c39174f17, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                    if (z4) {
                        i58 = 4;
                    } else {
                        i58 = 0;
                    }
                    zM87153g = c28655q4.m87153g(interfaceC4339a11);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87153g) {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32604f(interfaceC4339a11, 0);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    C34348q0 c34348q16 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                    C33252i c33252iM105489e17 = AbstractC33253j.m105489e(3 * f19);
                    textResource = placeholderMessage;
                    i59 = 0;
                    C37816b c37816bM121344e17 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == obj3) {
                        objM87133R12 = new C32614h(i59, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    Function1 function11111113 = (Function1) objM87133R12;
                    int i9111112 = TextResource.$stable;
                    Function1 function11111114 = function12;
                    AbstractC30792k.m94678l(modifierM3413j17, textResourceM21278l17, null, null, null, null, c37816bM121344e17, aVar17, textResourceM21267a17, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e17, c15197y1M43130h9, null, null, c34348q16, interfaceC4339a11, function11111113, c28655q4, (i9111112 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i9111112 << 24), 224256, 3078, 48, 426647100, 0);
                    if (z4) {
                        c28655q4.m87150e0(-450989950);
                        Modifier modifierMo3401b17 = C1100b.f4583a.mo3401b(c2314t);
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == obj3) {
                            objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                        }
                        InterfaceC21083i interfaceC21083i18 = (InterfaceC21083i) objM87133R13;
                        if ((i37 & 14) == 4) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        objM87133R14 = c28655q4.m87133R();
                        if (z38) {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        } else {
                            interfaceC4339a15 = r7;
                            objM87133R14 = new C32579a(interfaceC4339a15, i59);
                            c28655q4.m87172p0(objM87133R14);
                        }
                        AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b17, interfaceC21083i18, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                        c28655q4.m87173q(false);
                    } else {
                        interfaceC4339a15 = r7;
                        c28655q4.m87150e0(-450607472);
                        c28655q4.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q4, true, true, true);
                    function4 = function11111112;
                    interfaceC4339a5 = interfaceC4339a13;
                    interfaceC4351m3 = interfaceC4351m5;
                    function5 = function14;
                    interfaceC4339a6 = interfaceC4339a15;
                    c28655q = c28655q4;
                    function6 = function11111114;
                    interfaceC4339a4 = interfaceC4339a1111110;
                    list2 = list6;
                    interfaceC4351m4 = interfaceC4351m6;
                } else {
                    interfaceC4339a13 = interfaceC4339a10;
                }
                c0209i5 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11116);
                if (list5 == null) {
                    c28655q4.m87150e0(-793009074);
                    c28655q4.m87173q(false);
                    list6 = list5;
                    z28 = false;
                    function12 = function8;
                    obj3 = obj2;
                } else {
                    c28655q4.m87150e0(-793009073);
                    C22971k c22971kM66746i18 = AbstractC22977m.m66746i(f14 * f13);
                    list6 = list5;
                    Modifier modifierM92100V18 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                    C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(c22971kM66746i18, C2299e.f9107J, c28655q4, 6);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q4.m87165m();
                    Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q4, modifierM92100V18);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a12);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a113);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11119);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11119);
                    c28655q4.m87150e0(285190469);
                    while (r2.hasNext()) {
                        boolean zM87157i111115 = c28655q4.m87157i(c26810l);
                        if ((r35 & 458752) == 131072) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zM87157i111115 | z29;
                        objM87133R7 = c28655q4.m87133R();
                        if (z34) {
                            obj4 = obj2;
                            if (objM87133R7 == obj4) {
                            }
                            InterfaceC4339a interfaceC4339a1111113 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i111116 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i111116 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a1111113, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        } else {
                            obj4 = obj2;
                        }
                        objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                        c28655q4.m87172p0(objM87133R7);
                        InterfaceC4339a interfaceC4339a1111114 = (InterfaceC4339a) objM87133R7;
                        boolean zM87157i111117 = c28655q4.m87157i(c26810l);
                        if ((r35 & 57344) == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        z36 = zM87157i111117 | z35;
                        objM87133R8 = c28655q4.m87133R();
                        if (z36) {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        } else {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        AbstractC32688w1.m102571e(c26810l, interfaceC4339a1111114, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                        obj2 = obj4;
                        function8 = function13;
                    }
                    function12 = function8;
                    obj3 = obj2;
                    z28 = false;
                    AbstractC25012a.m73392y(c28655q4, false, true, false);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q4.m87165m();
                Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q4, c2314t);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a14 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a14);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d18);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111110);
                c0209i6 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111110);
                Modifier modifierM3483b18 = AbstractC1126a.m3483b(c2314t, c15247s12);
                if ((r35 & 234881024) == 67108864) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objM87133R9 = c28655q4.m87133R();
                if (z37) {
                    function14 = function10;
                    objM87133R9 = new C32599e(function14, 0);
                    c28655q4.m87172p0(objM87133R9);
                } else {
                    function14 = function10;
                    objM87133R9 = new C32599e(function14, 0);
                    c28655q4.m87172p0(objM87133R9);
                }
                Modifier modifierM3413j18 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b18, (Function1) objM87133R9), 0.0f, 30 * f19, 1);
                TextResource textResourceM21278l18 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                TextResource textResourceM21267a18 = AbstractC8693b.m21267a();
                C39174f c39174f18 = new C39174f(f19 * f19);
                if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                    c28655q4.m87150e0(-1122965528);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj3) {
                        objM87133R10 = a.f135200w;
                        c28655q4.m87172p0(objM87133R10);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-1122965528);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj3) {
                        objM87133R10 = a.f135200w;
                        c28655q4.m87172p0(objM87133R10);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                    c28655q4.m87173q(false);
                }
                if (z4) {
                    abstractC17911tM43972A = AbstractC15673b0.m43972A();
                }
                AbstractC30784c.a aVar18 = new AbstractC30784c.a(i13, c39174f18, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                if (z4) {
                    i58 = 4;
                } else {
                    i58 = 0;
                }
                zM87153g = c28655q4.m87153g(interfaceC4339a11);
                objM87133R11 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R11 = new C32604f(interfaceC4339a11, 0);
                    c28655q4.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C32604f(interfaceC4339a11, 0);
                    c28655q4.m87172p0(objM87133R11);
                }
                C34348q0 c34348q17 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                C33252i c33252iM105489e18 = AbstractC33253j.m105489e(3 * f19);
                textResource = placeholderMessage;
                i59 = 0;
                C37816b c37816bM121344e18 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                objM87133R12 = c28655q4.m87133R();
                if (objM87133R12 == obj3) {
                    objM87133R12 = new C32614h(i59, interfaceC28601c2);
                    c28655q4.m87172p0(objM87133R12);
                }
                Function1 function11111115 = (Function1) objM87133R12;
                int i9111113 = TextResource.$stable;
                Function1 function11111116 = function12;
                AbstractC30792k.m94678l(modifierM3413j18, textResourceM21278l18, null, null, null, null, c37816bM121344e18, aVar18, textResourceM21267a18, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e18, c15197y1M43130h9, null, null, c34348q17, interfaceC4339a11, function11111115, c28655q4, (i9111113 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i9111113 << 24), 224256, 3078, 48, 426647100, 0);
                if (z4) {
                    c28655q4.m87150e0(-450989950);
                    Modifier modifierMo3401b18 = C1100b.f4583a.mo3401b(c2314t);
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == obj3) {
                        objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                    }
                    InterfaceC21083i interfaceC21083i19 = (InterfaceC21083i) objM87133R13;
                    if ((i37 & 14) == 4) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objM87133R14 = c28655q4.m87133R();
                    if (z38) {
                        interfaceC4339a15 = r7;
                        objM87133R14 = new C32579a(interfaceC4339a15, i59);
                        c28655q4.m87172p0(objM87133R14);
                    } else {
                        interfaceC4339a15 = r7;
                        objM87133R14 = new C32579a(interfaceC4339a15, i59);
                        c28655q4.m87172p0(objM87133R14);
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b18, interfaceC21083i19, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                    c28655q4.m87173q(false);
                } else {
                    interfaceC4339a15 = r7;
                    c28655q4.m87150e0(-450607472);
                    c28655q4.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q4, true, true, true);
                function4 = function11111112;
                interfaceC4339a5 = interfaceC4339a13;
                interfaceC4351m3 = interfaceC4351m5;
                function5 = function14;
                interfaceC4339a6 = interfaceC4339a15;
                c28655q = c28655q4;
                function6 = function11111116;
                interfaceC4339a4 = interfaceC4339a1111110;
                list2 = list6;
                interfaceC4351m4 = interfaceC4351m6;
            } else {
                c15247s3 = c15247s2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N11115);
            if (featureFlagChecker.isFeatureEnabled("whoop-coach-image-upload")) {
                c28655q2.m87150e0(1403767226);
                C27270o c27270o19 = new C27270o(AbstractC27274q.a.f109136f, c38072d.m121951d().getAction().getAdd(), EnumC39333f.WHITE_70, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                String strM21273g19 = AbstractC8693b.m21273g(AbstractC37336b.f159651V0, c28655q2, 0);
                objM87133R15 = c28655q2.m87133R();
                if (objM87133R15 == obj) {
                    objM87133R15 = new C32375n(9);
                    c28655q2.m87172p0(objM87133R15);
                }
                Modifier modifierM3390l19 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R15);
                if ((r35 & 14) != 4) {
                    z39 = true;
                } else {
                    z39 = true;
                }
                objM87133R16 = c28655q2.m87133R();
                if (z39) {
                    i64 = 0;
                    objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                    c28655q2.m87172p0(objM87133R16);
                } else {
                    i64 = 0;
                    objM87133R16 = new C32589c(mediaPickerLauncher, i64);
                    c28655q2.m87172p0(objM87133R16);
                }
                C28655q c28655q114 = c28655q2;
                AbstractC27242b1.m82092d(c27270o19, strM21273g19, null, modifierM3390l19, (InterfaceC4339a) objM87133R16, c28655q114, C27270o.f109105k, 4);
                c28655q114.m87173q(i64);
                c28655q3 = c28655q114;
            } else {
                C28655q c28655q115 = c28655q2;
                c28655q115.m87150e0(1404745524);
                c28655q115.m87173q(false);
                c28655q3 = c28655q115;
            }
            C27270o c27270o110 = new C27270o(AbstractC27274q.a.f109136f, AbstractC37335a.f159603e, EnumC39333f.WHITE_70, null, null, z14, false, false, 0.0f, false, 984, null);
            String strM21273g110 = AbstractC8693b.m21273g(AbstractC37336b.f159697u, c28655q3, 0);
            objM87133R4 = c28655q3.m87133R();
            if (objM87133R4 == obj) {
                objM87133R4 = new C32375n(10);
                c28655q3.m87172p0(objM87133R4);
            }
            Modifier modifierM3390l110 = AbstractC1099a.m3390l(c2314t, (Function1) objM87133R4);
            if ((r35 & 112) == 32) {
                z27 = true;
            } else {
                z27 = false;
            }
            objM87133R5 = c28655q3.m87133R();
            if (z27) {
                i47 = 1;
                objM87133R5 = new C32579a(interfaceC4339a7, i47);
                c28655q3.m87172p0(objM87133R5);
            } else {
                i47 = 1;
                objM87133R5 = new C32579a(interfaceC4339a7, i47);
                c28655q3.m87172p0(objM87133R5);
            }
            i48 = i47;
            AbstractC27242b1.m82092d(c27270o110, strM21273g110, null, modifierM3390l110, (InterfaceC4339a) objM87133R5, c28655q3, C27270o.f109105k, 4);
            if ((r28 & 57344) == 16384) {
                i49 = i48;
            } else {
                i49 = 0;
            }
            if ((r35 & 896) == 256) {
                i54 = i48;
            } else {
                i54 = 0;
            }
            int i9111114 = i49 | i54;
            if ((i77 & 7168) == 2048) {
                i55 = i48;
            } else {
                i55 = 0;
            }
            int i9111115 = i9111114 | i55;
            list4 = list3;
            int i9111116 = i9111115 | (c28655q3.m87157i(list4) ? 1 : 0);
            if ((r35 & 7168) == 2048) {
                i56 = i48;
            } else {
                i56 = 0;
            }
            i57 = i56 | i9111116;
            objM87133R6 = c28655q3.m87133R();
            if (i57 == 0) {
                obj2 = obj;
                list5 = list4;
                Function3 function11111117 = function7;
                interfaceC4339a10 = interfaceC4339a8;
                interfaceC28601c2 = interfaceC28601c1;
                Object c32594d18 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function11111117);
                function11 = function11111117;
                c28655q3.m87172p0(c32594d18);
                objM87133R6 = c32594d18;
            } else {
                obj2 = obj;
                list5 = list4;
                Function3 function11111118 = function7;
                interfaceC4339a10 = interfaceC4339a8;
                interfaceC28601c2 = interfaceC28601c1;
                Object c32594d19 = new C32594d(z13, interfaceC4339a10, z4, interfaceC28601c2, list5, function11111118);
                function11 = function11111118;
                c28655q3.m87172p0(c32594d19);
                objM87133R6 = c32594d19;
            }
            interfaceC4339a11 = (InterfaceC4339a) objM87133R6;
            m101827S(state, interfaceC28601c2, c28655q3, (i813 & 14) | 48);
            C15043i8 c15043i17 = C15043i8.f56313a;
            C15247s c15247s13 = c15247s3;
            c28655q4 = c28655q3;
            InterfaceC4339a interfaceC4339a1111115 = interfaceC4339a7;
            C15197y1 c15197y1M43130h10 = C15043i8.m43130h(r79.m121949b(c28655q3, i911118).getBrandWhite(), 0L, 0L, r79.m121949b(c28655q3, i911118).getBrandWhite(), 0L, r79.m121949b(c28655q3, i911118).getTransparent(), c38072d.m121949b(c28655q3, i911118).getTransparent(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097046);
            f14 = 1;
            Modifier modifierM44456i10 = AbstractC15751g.m44456i(f14, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(12));
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q4.m87165m();
            Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q4, modifierM44456i10);
            c28655q4.m87158i0();
            Function3 function11111119 = function11;
            if (c28655q4.f115903S) {
                interfaceC4339a12 = c0213j;
                c28655q4.m87163l(interfaceC4339a12);
            } else {
                interfaceC4339a12 = c0213j;
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a10);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111111);
            if (c28655q4.f115903S) {
                interfaceC4339a13 = interfaceC4339a10;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i5 = c0209i3;
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111111);
                if (list5 == null) {
                    c28655q4.m87150e0(-793009074);
                    c28655q4.m87173q(false);
                    list6 = list5;
                    z28 = false;
                    function12 = function8;
                    obj3 = obj2;
                } else {
                    c28655q4.m87150e0(-793009073);
                    C22971k c22971kM66746i19 = AbstractC22977m.m66746i(f14 * f13);
                    list6 = list5;
                    Modifier modifierM92100V19 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                    C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(c22971kM66746i19, C2299e.f9107J, c28655q4, 6);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q4.m87165m();
                    Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q4, modifierM92100V19);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a12);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a114);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111112);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111112);
                    c28655q4.m87150e0(285190469);
                    while (r2.hasNext()) {
                        boolean zM87157i111118 = c28655q4.m87157i(c26810l);
                        if ((r35 & 458752) == 131072) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zM87157i111118 | z29;
                        objM87133R7 = c28655q4.m87133R();
                        if (z34) {
                            obj4 = obj2;
                            if (objM87133R7 == obj4) {
                            }
                            InterfaceC4339a interfaceC4339a1111116 = (InterfaceC4339a) objM87133R7;
                            boolean zM87157i111119 = c28655q4.m87157i(c26810l);
                            if ((r35 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            z36 = zM87157i111119 | z35;
                            objM87133R8 = c28655q4.m87133R();
                            if (z36) {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            } else {
                                function13 = function8;
                                objM87133R8 = new C32580a0(3, c26810l, function13);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            AbstractC32688w1.m102571e(c26810l, interfaceC4339a1111116, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                            obj2 = obj4;
                            function8 = function13;
                        } else {
                            obj4 = obj2;
                        }
                        objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                        c28655q4.m87172p0(objM87133R7);
                        InterfaceC4339a interfaceC4339a1111117 = (InterfaceC4339a) objM87133R7;
                        boolean zM87157i1111110 = c28655q4.m87157i(c26810l);
                        if ((r35 & 57344) == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        z36 = zM87157i1111110 | z35;
                        objM87133R8 = c28655q4.m87133R();
                        if (z36) {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        } else {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        AbstractC32688w1.m102571e(c26810l, interfaceC4339a1111117, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                        obj2 = obj4;
                        function8 = function13;
                    }
                    function12 = function8;
                    obj3 = obj2;
                    z28 = false;
                    AbstractC25012a.m73392y(c28655q4, false, true, false);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q4.m87165m();
                Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q4, c2314t);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a14 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a14);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d19);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111113);
                c0209i6 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111113);
                Modifier modifierM3483b19 = AbstractC1126a.m3483b(c2314t, c15247s13);
                if ((r35 & 234881024) == 67108864) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                objM87133R9 = c28655q4.m87133R();
                if (z37) {
                    function14 = function10;
                    objM87133R9 = new C32599e(function14, 0);
                    c28655q4.m87172p0(objM87133R9);
                } else {
                    function14 = function10;
                    objM87133R9 = new C32599e(function14, 0);
                    c28655q4.m87172p0(objM87133R9);
                }
                Modifier modifierM3413j19 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b19, (Function1) objM87133R9), 0.0f, 30 * f19, 1);
                TextResource textResourceM21278l19 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
                TextResource textResourceM21267a19 = AbstractC8693b.m21267a();
                C39174f c39174f19 = new C39174f(f19 * f19);
                if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                    c28655q4.m87150e0(-1122965528);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj3) {
                        objM87133R10 = a.f135200w;
                        c28655q4.m87172p0(objM87133R10);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-1122965528);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj3) {
                        objM87133R10 = a.f135200w;
                        c28655q4.m87172p0(objM87133R10);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                    c28655q4.m87173q(false);
                }
                if (z4) {
                    abstractC17911tM43972A = AbstractC15673b0.m43972A();
                }
                AbstractC30784c.a aVar19 = new AbstractC30784c.a(i13, c39174f19, interfaceC39332eM125323a, abstractC17911tM43972A, null);
                if (z4) {
                    i58 = 4;
                } else {
                    i58 = 0;
                }
                zM87153g = c28655q4.m87153g(interfaceC4339a11);
                objM87133R11 = c28655q4.m87133R();
                if (zM87153g) {
                    objM87133R11 = new C32604f(interfaceC4339a11, 0);
                    c28655q4.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C32604f(interfaceC4339a11, 0);
                    c28655q4.m87172p0(objM87133R11);
                }
                C34348q0 c34348q18 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
                C33252i c33252iM105489e19 = AbstractC33253j.m105489e(3 * f19);
                textResource = placeholderMessage;
                i59 = 0;
                C37816b c37816bM121344e19 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
                objM87133R12 = c28655q4.m87133R();
                if (objM87133R12 == obj3) {
                    objM87133R12 = new C32614h(i59, interfaceC28601c2);
                    c28655q4.m87172p0(objM87133R12);
                }
                Function1 function111111110 = (Function1) objM87133R12;
                int i9111117 = TextResource.$stable;
                Function1 function111111111 = function12;
                AbstractC30792k.m94678l(modifierM3413j19, textResourceM21278l19, null, null, null, null, c37816bM121344e19, aVar19, textResourceM21267a19, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e19, c15197y1M43130h10, null, null, c34348q18, interfaceC4339a11, function111111110, c28655q4, (i9111117 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i9111117 << 24), 224256, 3078, 48, 426647100, 0);
                if (z4) {
                    c28655q4.m87150e0(-450989950);
                    Modifier modifierMo3401b19 = C1100b.f4583a.mo3401b(c2314t);
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == obj3) {
                        objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                    }
                    InterfaceC21083i interfaceC21083i110 = (InterfaceC21083i) objM87133R13;
                    if ((i37 & 14) == 4) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    objM87133R14 = c28655q4.m87133R();
                    if (z38) {
                        interfaceC4339a15 = r7;
                        objM87133R14 = new C32579a(interfaceC4339a15, i59);
                        c28655q4.m87172p0(objM87133R14);
                    } else {
                        interfaceC4339a15 = r7;
                        objM87133R14 = new C32579a(interfaceC4339a15, i59);
                        c28655q4.m87172p0(objM87133R14);
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b19, interfaceC21083i110, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                    c28655q4.m87173q(false);
                } else {
                    interfaceC4339a15 = r7;
                    c28655q4.m87150e0(-450607472);
                    c28655q4.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q4, true, true, true);
                function4 = function11111119;
                interfaceC4339a5 = interfaceC4339a13;
                interfaceC4351m3 = interfaceC4351m5;
                function5 = function14;
                interfaceC4339a6 = interfaceC4339a15;
                c28655q = c28655q4;
                function6 = function111111111;
                interfaceC4339a4 = interfaceC4339a1111115;
                list2 = list6;
                interfaceC4351m4 = interfaceC4351m6;
            } else {
                interfaceC4339a13 = interfaceC4339a10;
            }
            c0209i5 = c0209i3;
            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i5);
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111111);
            if (list5 == null) {
                c28655q4.m87150e0(-793009074);
                c28655q4.m87173q(false);
                list6 = list5;
                z28 = false;
                function12 = function8;
                obj3 = obj2;
            } else {
                c28655q4.m87150e0(-793009073);
                C22971k c22971kM66746i110 = AbstractC22977m.m66746i(f14 * f13);
                list6 = list5;
                Modifier modifierM92100V110 = AbstractC30060g.m92100V(c2314t, AbstractC30060g.m92099U(0, c28655q4, 1), true, false);
                C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(c22971kM66746i110, C2299e.f9107J, c28655q4, 6);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q4.m87165m();
                Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q4, modifierM92100V110);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a12);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a115);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111114);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111114);
                c28655q4.m87150e0(285190469);
                while (r2.hasNext()) {
                    boolean zM87157i1111111 = c28655q4.m87157i(c26810l);
                    if ((r35 & 458752) == 131072) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zM87157i1111111 | z29;
                    objM87133R7 = c28655q4.m87133R();
                    if (z34) {
                        obj4 = obj2;
                        if (objM87133R7 == obj4) {
                        }
                        InterfaceC4339a interfaceC4339a1111118 = (InterfaceC4339a) objM87133R7;
                        boolean zM87157i1111112 = c28655q4.m87157i(c26810l);
                        if ((r35 & 57344) == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        z36 = zM87157i1111112 | z35;
                        objM87133R8 = c28655q4.m87133R();
                        if (z36) {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        } else {
                            function13 = function8;
                            objM87133R8 = new C32580a0(3, c26810l, function13);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        AbstractC32688w1.m102571e(c26810l, interfaceC4339a1111118, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                        obj2 = obj4;
                        function8 = function13;
                    } else {
                        obj4 = obj2;
                    }
                    objM87133R7 = new C32580a0(2, c26810l, interfaceC4351m5);
                    c28655q4.m87172p0(objM87133R7);
                    InterfaceC4339a interfaceC4339a1111119 = (InterfaceC4339a) objM87133R7;
                    boolean zM87157i1111113 = c28655q4.m87157i(c26810l);
                    if ((r35 & 57344) == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    z36 = zM87157i1111113 | z35;
                    objM87133R8 = c28655q4.m87133R();
                    if (z36) {
                        function13 = function8;
                        objM87133R8 = new C32580a0(3, c26810l, function13);
                        c28655q4.m87172p0(objM87133R8);
                    } else {
                        function13 = function8;
                        objM87133R8 = new C32580a0(3, c26810l, function13);
                        c28655q4.m87172p0(objM87133R8);
                    }
                    AbstractC32688w1.m102571e(c26810l, interfaceC4339a1111119, (InterfaceC4339a) objM87133R8, c28655q4, AbstractC22403o.f87638a, 0);
                    obj2 = obj4;
                    function8 = function13;
                }
                function12 = function8;
                obj3 = obj2;
                z28 = false;
                AbstractC25012a.m73392y(c28655q4, false, true, false);
            }
            InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(C2299e.f9114w, z28);
            iHashCode4 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q4.m87165m();
            Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q4, c2314t);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a14 = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a14);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d110);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m111115);
            c0209i6 = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N111115);
            Modifier modifierM3483b110 = AbstractC1126a.m3483b(c2314t, c15247s13);
            if ((r35 & 234881024) == 67108864) {
                z37 = true;
            } else {
                z37 = false;
            }
            objM87133R9 = c28655q4.m87133R();
            if (z37) {
                function14 = function10;
                objM87133R9 = new C32599e(function14, 0);
                c28655q4.m87172p0(objM87133R9);
            } else {
                function14 = function10;
                objM87133R9 = new C32599e(function14, 0);
                c28655q4.m87172p0(objM87133R9);
            }
            Modifier modifierM3413j110 = AbstractC1102d.m3413j(AbstractC1126a.m3484c(modifierM3483b110, (Function1) objM87133R9), 0.0f, 30 * f19, 1);
            TextResource textResourceM21278l110 = AbstractC8693b.m21278l((String) interfaceC28601c2.getValue());
            TextResource textResourceM21267a110 = AbstractC8693b.m21267a();
            C39174f c39174f110 = new C39174f(f19 * f19);
            if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue())) {
                c28655q4.m87150e0(-1122965528);
                objM87133R10 = c28655q4.m87133R();
                if (objM87133R10 == obj3) {
                    objM87133R10 = a.f135200w;
                    c28655q4.m87172p0(objM87133R10);
                }
                interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(-1122965528);
                objM87133R10 = c28655q4.m87133R();
                if (objM87133R10 == obj3) {
                    objM87133R10 = a.f135200w;
                    c28655q4.m87172p0(objM87133R10);
                }
                interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R10);
                c28655q4.m87173q(false);
            }
            if (z4) {
                abstractC17911tM43972A = AbstractC15673b0.m43972A();
            }
            AbstractC30784c.a aVar110 = new AbstractC30784c.a(i13, c39174f110, interfaceC39332eM125323a, abstractC17911tM43972A, null);
            if (z4) {
                i58 = 4;
            } else {
                i58 = 0;
            }
            zM87153g = c28655q4.m87153g(interfaceC4339a11);
            objM87133R11 = c28655q4.m87133R();
            if (zM87153g) {
                objM87133R11 = new C32604f(interfaceC4339a11, 0);
                c28655q4.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C32604f(interfaceC4339a11, 0);
                c28655q4.m87172p0(objM87133R11);
            }
            C34348q0 c34348q19 = new C34348q0(null, null, null, (Function1) objM87133R11, 31);
            C33252i c33252iM105489e110 = AbstractC33253j.m105489e(3 * f19);
            textResource = placeholderMessage;
            i59 = 0;
            C37816b c37816bM121344e110 = AbstractC37817c.m121344e(-1465565162, c28655q4, new C32609g(textResource, i59));
            objM87133R12 = c28655q4.m87133R();
            if (objM87133R12 == obj3) {
                objM87133R12 = new C32614h(i59, interfaceC28601c2);
                c28655q4.m87172p0(objM87133R12);
            }
            Function1 function111111112 = (Function1) objM87133R12;
            int i9111118 = TextResource.$stable;
            Function1 function111111113 = function12;
            AbstractC30792k.m94678l(modifierM3413j110, textResourceM21278l110, null, null, null, null, c37816bM121344e110, aVar110, textResourceM21267a110, false, false, null, 0L, true, 1, 3, i58, false, null, false, false, 0, false, interfaceC21083i, null, c33252iM105489e110, c15197y1M43130h10, null, null, c34348q19, interfaceC4339a11, function111111112, c28655q4, (i9111118 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21) | (i9111118 << 24), 224256, 3078, 48, 426647100, 0);
            if (z4) {
                c28655q4.m87150e0(-450989950);
                Modifier modifierMo3401b110 = C1100b.f4583a.mo3401b(c2314t);
                objM87133R13 = c28655q4.m87133R();
                if (objM87133R13 == obj3) {
                    objM87133R13 = AbstractC11266d.m30453g(c28655q4);
                }
                InterfaceC21083i interfaceC21083i111 = (InterfaceC21083i) objM87133R13;
                if ((i37 & 14) == 4) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                objM87133R14 = c28655q4.m87133R();
                if (z38) {
                    interfaceC4339a15 = r7;
                    objM87133R14 = new C32579a(interfaceC4339a15, i59);
                    c28655q4.m87172p0(objM87133R14);
                } else {
                    interfaceC4339a15 = r7;
                    objM87133R14 = new C32579a(interfaceC4339a15, i59);
                    c28655q4.m87172p0(objM87133R14);
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b110, interfaceC21083i111, null, false, null, (InterfaceC4339a) objM87133R14, 28), c28655q4, 0);
                c28655q4.m87173q(false);
            } else {
                interfaceC4339a15 = r7;
                c28655q4.m87150e0(-450607472);
                c28655q4.m87173q(false);
            }
            AbstractC25012a.m73392y(c28655q4, true, true, true);
            function4 = function11111119;
            interfaceC4339a5 = interfaceC4339a13;
            interfaceC4351m3 = interfaceC4351m5;
            function5 = function14;
            interfaceC4339a6 = interfaceC4339a15;
            c28655q = c28655q4;
            function6 = function111111113;
            interfaceC4339a4 = interfaceC4339a1111115;
            list2 = list6;
            interfaceC4351m4 = interfaceC4351m6;
        } else {
            textResource = placeholderMessage;
            c28655q5.m87138X();
            interfaceC4339a4 = interfaceC4339a;
            interfaceC4339a5 = interfaceC4339a2;
            function4 = function3;
            interfaceC4351m3 = interfaceC4351m;
            list2 = list;
            function5 = function2;
            interfaceC4351m4 = interfaceC4351m2;
            interfaceC4339a6 = interfaceC4339a3;
            c28655q = c28655q5;
            function6 = function1;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final TextResource textResource6 = textResource;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj5, Object obj6) {
                    int iIntValue = ((Integer) obj6).intValue();
                    return AbstractC32619i.m101820L(i13, sendFieldColor, textResource6, z4, z13, z14, listState, z15, state, z16, mediaPickerLauncher, interfaceC4339a4, interfaceC4339a5, function4, function6, interfaceC4351m3, list2, interfaceC15250v, function5, interfaceC4351m4, interfaceC4339a6, i14, i15, i16, i17, (Composer) obj5, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m101852x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m101853y() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C39178j m101854z(InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j((((long) (-offset.mo724F(((float) 2.5d) * 4))) << 32) | (((long) 0) & 4294967295L));
    }
}
