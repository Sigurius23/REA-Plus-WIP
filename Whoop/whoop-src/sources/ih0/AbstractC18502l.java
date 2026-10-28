package ih0;

import a81.C0561l;
import am2.C1040r;
import android.content.Context;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d21.C11506d;
import eu2.C13652i;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import i21.C18008r;
import ib0.C18332c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2399k2;
import p088dc.AbstractC11895b;
import p163g1.AbstractC14983d3;
import p163g1.AbstractC15005f3;
import p179h.C16351i;
import p208i2.C17875c1;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34323i;
import p510u0.C34351r0;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.AbstractC32648n3;
import q83.InterfaceC30057d;
import ql0.AbstractC30467b;
import ql0.C30469d;
import ql0.InterfaceC30468c;
import qr2.AbstractC30556a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ih0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001ay\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001ai\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aa\u0010 \u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0003¢\u0006\u0004\b \u0010!\u001a/\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b%\u0010&\u001a'\u0010)\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010+\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010,\"\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00068²\u0006\f\u0010\u0014\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u0018\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\f\u00107\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m65681d2 = {"", "placeholder", "Lq3/y;", "text", "Lkotlin/Function1;", "Ll83/a0;", "onTextChanged", "", "maxLength", "", "isEnabled", "multiline", "isError", "voiceEnabled", "Landroid/content/Context;", "Lql0/c;", "speechRecognitionManagerFactory", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "speechRecognitionManager", "isListening", "", "audioLevel", "Lkotlin/Function0;", "onStartListening", "onStopListening", "Q", "(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZLql0/c;ZFLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showMic", "reserveMicSpace", "T", "(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZZLc93/a;Landroidx/compose/runtime/Composer;I)V", "X", "(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Li2/a1;", "shape", "Landroidx/compose/ui/Modifier;", "e0", "(Lq3/y;ZZLi2/a1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "textIsEmpty", "voiceAvailable", "f0", "(ZZZ)Z", "d0", "(Lq3/y;I)Lq3/y;", "Ltr2/n;", "a", "Ltr2/n;", "logger", "b", "Lkotlin/jvm/functions/Function1;", "getDefaultSpeechRecognitionManagerFactory", "()Lkotlin/jvm/functions/Function1;", "DefaultSpeechRecognitionManagerFactory", "currentOnTextChanged", "currentMaxLength", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18502l {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f72073a = InterfaceC34116n.INSTANCE.m107848a("FormTextInputRow");

    /* JADX INFO: renamed from: b */
    private static final Function1 f72074b = new C18332c(23);

    /* JADX INFO: renamed from: ih0.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.formwidget.FormTextInputRowKt$FormTextInputRow$5$1$1", m100430f = "FormTextInputRow.kt", m100431l = {161}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f72075E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f72076F;

        /* JADX INFO: renamed from: w */
        int f72077w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC30468c f72078x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C16351i f72079y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f72080z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30468c interfaceC30468c, C16351i c16351i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72078x = interfaceC30468c;
            this.f72079y = c16351i;
            this.f72080z = interfaceC28670t2;
            this.f72075E = interfaceC28670t3;
            this.f72076F = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f72078x, this.f72079y, this.f72080z, this.f72075E, this.f72076F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72077w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30468c interfaceC30468c = this.f72078x;
                C16351i c16351i = this.f72079y;
                InterfaceC28670t2 interfaceC28670t2 = this.f72080z;
                InterfaceC28670t2 interfaceC28670t3 = this.f72075E;
                InterfaceC28601c1 interfaceC28601c1 = this.f72076F;
                this.f72077w = 1;
                if (AbstractC18502l.m53609x(interfaceC30468c, c16351i, interfaceC28670t2, interfaceC28670t3, interfaceC28601c1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ih0.l$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"ih0/l$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC30468c f72081a;

        public b(InterfaceC30468c interfaceC30468c) {
            this.f72081a = interfaceC30468c;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f72081a.mo93228a();
        }
    }

    /* JADX INFO: renamed from: ih0.l$c */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.formwidget.FormTextInputRowKt$FormTextInputRow$permissionLauncher$1$1$1", m100430f = "FormTextInputRow.kt", m100431l = {129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f72082E;

        /* JADX INFO: renamed from: w */
        int f72083w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC30468c f72084x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f72085y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f72086z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30468c interfaceC30468c, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72084x = interfaceC30468c;
            this.f72085y = interfaceC28670t2;
            this.f72086z = interfaceC28670t3;
            this.f72082E = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f72084x, this.f72085y, this.f72086z, this.f72082E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72083w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30468c interfaceC30468c = this.f72084x;
                InterfaceC28670t2 interfaceC28670t2 = this.f72085y;
                InterfaceC28670t2 interfaceC28670t3 = this.f72086z;
                InterfaceC28601c1 interfaceC28601c1 = this.f72082E;
                this.f72083w = 1;
                if (AbstractC18502l.m53565L(interfaceC30468c, interfaceC28670t2, interfaceC28670t3, interfaceC28601c1, this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m53554A(InterfaceC2994c0 interfaceC2994c0, InterfaceC30468c interfaceC30468c, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        if (z4) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(interfaceC30468c, interfaceC28670t2, interfaceC28670t3, interfaceC28601c1, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC28620h0 m53555B(InterfaceC30468c interfaceC30468c, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new b(interfaceC30468c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m53556C(InterfaceC2994c0 interfaceC2994c0, InterfaceC30468c interfaceC30468c, C16351i c16351i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(interfaceC30468c, c16351i, interfaceC28670t2, interfaceC28670t3, interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m53557D(InterfaceC30468c interfaceC30468c, InterfaceC28670t2 interfaceC28670t2, boolean z4) {
        interfaceC30468c.stopListening();
        if (!z4) {
            m53563J(interfaceC28670t2).invoke(new C29891y(6, "", 0L));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m53558E(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, boolean z15, Function1 function2, int i14, int i15, Composer composer, int i16) {
        m53608w(str, c29891y, function1, i13, z4, z13, z14, z15, function2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m53559F(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, boolean z15, Function1 function2, int i14, int i15, Composer composer, int i16) {
        m53608w(str, c29891y, function1, i13, z4, z13, z14, z15, function2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final boolean m53560G(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: H */
    private static final float m53561H(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: I */
    private static final void m53562I(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: renamed from: J */
    private static final Function1 m53563J(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: K */
    private static final int m53564K(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Object m53565L(InterfaceC30468c interfaceC30468c, final InterfaceC28670t2 interfaceC28670t2, final InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        final int i13 = 0;
        Function1 function1 = new Function1() { // from class: ih0.g
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return AbstractC18502l.m53566M(interfaceC28670t2, interfaceC28670t3, (C29891y) obj);
                    default:
                        return AbstractC18502l.m53567N(interfaceC28670t2, interfaceC28670t3, (C29891y) obj);
                }
            }
        };
        final int i14 = 1;
        Object objMo93231d = interfaceC30468c.mo93231d(function1, new Function1() { // from class: ih0.g
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return AbstractC18502l.m53566M(interfaceC28670t2, interfaceC28670t3, (C29891y) obj);
                    default:
                        return AbstractC18502l.m53567N(interfaceC28670t2, interfaceC28670t3, (C29891y) obj);
                }
            }
        }, new C18332c(22), new C18496h(0, interfaceC28601c1), interfaceC30057d);
        return objMo93231d == EnumC31071a.f128113w ? objMo93231d : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m53566M(InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, C29891y result) {
        AbstractC22676k.m65750j(result, "result");
        m53563J(interfaceC28670t2).invoke(m53587d0(result, m53564K(interfaceC28670t3)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m53567N(InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, C29891y partial) {
        AbstractC22676k.m65750j(partial, "partial");
        m53563J(interfaceC28670t2).invoke(m53587d0(partial, m53564K(interfaceC28670t3)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m53568O(AbstractC30467b error) {
        AbstractC22676k.m65750j(error, "error");
        f72073a.mo85228t("Speech recognition error: " + error, new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m53569P(InterfaceC28601c1 interfaceC28601c1, float f13) {
        m53562I(interfaceC28601c1, f13);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:129:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:145:0x0205  */
    /* JADX WARN: Code duplicated, block: B:149:0x020d  */
    /* JADX WARN: Code duplicated, block: B:152:0x023e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0253  */
    /* JADX WARN: Code duplicated, block: B:160:0x025a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0283  */
    /* JADX WARN: Code duplicated, block: B:166:0x028b  */
    /* JADX WARN: Code duplicated, block: B:167:0x028e  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:176:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:189:0x0308  */
    /* JADX WARN: Code duplicated, block: B:191:0x032c  */
    /* JADX INFO: renamed from: Q */
    private static final void m53570Q(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, InterfaceC30468c interfaceC30468c, boolean z15, float f13, InterfaceC4339a interfaceC4339a, Function1 function2, Composer composer, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        Function1 function3;
        boolean z16;
        C0209i c0209i;
        float f14;
        int iHashCode;
        int i19;
        boolean z17;
        boolean z18;
        boolean z19;
        C2307m c2307m;
        int iHashCode2;
        boolean z24;
        Object objM87133R;
        boolean z25;
        boolean z26;
        boolean z27;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1591791119);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(c29891y) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 = i13;
            i16 |= c28655q.m87149e(i17) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            i17 = i13;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 |= c28655q.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i16 |= c28655q.m87155h(z14) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= (i14 & 16777216) == 0 ? c28655q.m87153g(interfaceC30468c) : c28655q.m87157i(interfaceC30468c) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= c28655q.m87155h(z15) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i14 & 805306368) == 0) {
            i16 |= c28655q.m87147d(f13) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i18 = i15 | (c28655q.m87157i(interfaceC4339a) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, ((306783379 & i16) == 306783378 && (i18 & 19) == 18) ? false : true)) {
            boolean z28 = interfaceC30468c != null && interfaceC30468c.isAvailable();
            boolean zM53591f0 = m53591f0(c29891y.f122125a.f92135x.length() == 0, z28, z4);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2307m c2307m2 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            boolean z29 = z28;
            if (c28655q.f115903S) {
                z16 = zM53591f0;
            } else {
                z16 = zM53591f0;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                if (z15) {
                    f14 = 0.4f;
                } else {
                    f14 = 1.0f;
                }
                Modifier modifierM107879c = AbstractC34132o.m107879c(f14, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM107879c);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                if (z13) {
                    c28655q.m87150e0(18749435);
                    if (z4 || z15) {
                        z25 = false;
                    } else {
                        z25 = true;
                    }
                    if (z16 || z15) {
                        z26 = false;
                    } else {
                        z26 = true;
                    }
                    if (z29 || !z4) {
                        z27 = false;
                    } else {
                        z27 = true;
                    }
                    i19 = i16;
                    m53573T(str, c29891y, function1, i17, z25, z14, z26, z27, interfaceC4339a, c28655q, ((i16 >> 3) & 458752) | (i16 & 8190) | ((i18 << 24) & 234881024));
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    i19 = i16;
                    c28655q.m87150e0(19271289);
                    if (z4 || z15) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (z16 || z15) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    m53577X(str, c29891y, function1, i13, z17, z14, z18, interfaceC4339a, c28655q, (458752 & (i19 >> 3)) | (i19 & 8190) | ((i18 << 21) & 29360128));
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (z15) {
                    c28655q.m87150e0(1623032143);
                    if (z13) {
                        c2307m = C2299e.f9105H;
                    } else {
                        c2307m = C2299e.f9102E;
                    }
                    Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, c2307m)), "FormTextInputListeningOverlay");
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3599a);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
                    float f15 = 14 * 4;
                    if ((i18 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (!z24 || objM87133R == C28635l.f115821a) {
                        function3 = function2;
                        objM87133R = new C18490e(function3, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function3 = function2;
                    }
                    AbstractC32648n3.m102044f(f13, true, null, f15, (Function1) objM87133R, c28655q, (14 & (i19 >> 27)) | 3120, 4);
                    z19 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    function3 = function2;
                    z19 = true;
                    c28655q.m87150e0(1623612587);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z19);
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
            if (z15) {
                f14 = 0.4f;
            } else {
                f14 = 1.0f;
            }
            Modifier modifierM107879c2 = AbstractC34132o.m107879c(f14, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM107879c2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N4);
            if (z13) {
                c28655q.m87150e0(18749435);
                if (z4) {
                    z25 = false;
                } else {
                    z25 = false;
                }
                if (z16) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                if (z29) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                i19 = i16;
                m53573T(str, c29891y, function1, i17, z25, z14, z26, z27, interfaceC4339a, c28655q, ((i16 >> 3) & 458752) | (i16 & 8190) | ((i18 << 24) & 234881024));
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                i19 = i16;
                c28655q.m87150e0(19271289);
                if (z4) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z16) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                m53577X(str, c29891y, function1, i13, z17, z14, z18, interfaceC4339a, c28655q, (458752 & (i19 >> 3)) | (i19 & 8190) | ((i18 << 21) & 29360128));
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (z15) {
                c28655q.m87150e0(1623032143);
                if (z13) {
                    c2307m = C2299e.f9105H;
                } else {
                    c2307m = C2299e.f9102E;
                }
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, c2307m)), "FormTextInputListeningOverlay");
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N5);
                float f16 = 14 * 4;
                if ((i18 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z24) {
                    function3 = function2;
                    objM87133R = new C18490e(function3, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function3 = function2;
                    objM87133R = new C18490e(function3, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC32648n3.m102044f(f13, true, null, f16, (Function1) objM87133R, c28655q, (14 & (i19 >> 27)) | 3120, 4);
                z19 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                function3 = function2;
                z19 = true;
                c28655q.m87150e0(1623612587);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z19);
        } else {
            function3 = function2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18500j(str, c29891y, function1, i13, z4, z13, z14, interfaceC30468c, z15, f13, interfaceC4339a, function3, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m53571R(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m53572S(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, InterfaceC30468c interfaceC30468c, boolean z15, float f13, InterfaceC4339a interfaceC4339a, Function1 function2, int i14, int i15, Composer composer, int i16) {
        m53570Q(str, c29891y, function1, i13, z4, z13, z14, interfaceC30468c, z15, f13, interfaceC4339a, function2, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final void m53573T(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, boolean z15, InterfaceC4339a interfaceC4339a, Composer composer, int i14) {
        int i15;
        long jM53358D;
        long jM125374Y0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1761151842);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(c29891y) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i15 |= c28655q.m87155h(z14) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= c28655q.m87155h(z15) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 38347923) != 38347922)) {
            float f13 = 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(2 * f13);
            if (z4) {
                c28655q.m87150e0(249817644);
                jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(249818729);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            long j7 = jM53358D;
            if (z4) {
                c28655q.m87150e0(249820905);
                jM125374Y0 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(249821897);
                jM125374Y0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30();
                c28655q.m87173q(false);
            }
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C23285v0 c23285v0M67364b = C23285v0.m67364b(AbstractC33745d.m106661t(c38072d, c28655q, i16), j7, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
            C2314t c2314t = C2314t.f9131w;
            int i17 = i15 >> 3;
            int i18 = i17 & 14;
            int i19 = i15 >> 9;
            int i24 = 0;
            int i25 = i15;
            Modifier modifierMo3471e = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), c33252iM105489e).mo3471e(m53589e0(c29891y, z4, z13, c33252iM105489e, c28655q, i18 | (i19 & 112) | (i19 & 896)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            float f14 = 12;
            float f15 = 8;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f14, f15, z14 ? 44 : f14, z15 ? 40 : f15);
            C17875c1 c17875c1 = new C17875c1(j7);
            C34351r0 c34351r0 = new C34351r0(3, i24, i24, 126);
            boolean z16 = ((i25 & 7168) == 2048) | ((i25 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (z16 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11506d(function1, i13, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC34323i.m108620b(c29891y, (Function1) objM87133R, modifierM3397s, z4, false, c23285v0M67364b, c34351r0, null, false, 0, 4, null, null, null, c17875c1, AbstractC37817c.m121344e(-1166015387, c28655q, new C18498i(c29891y, str, jM125374Y0, 0)), c28655q, i18 | 102236160 | (i17 & 7168), 196614, 14992);
            c28655q = c28655q;
            C1100b c1100b = C1100b.f4583a;
            if (z13) {
                c28655q.m87150e0(290941563);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getAttentionRed(), c28655q, 6), null, AbstractC1102d.m3419p(24, AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, C2299e.f9116y), 0.0f, f15, f14, 0.0f, 9)), c38072d.m121949b(c28655q, i16).getAccentAlert(), c28655q, 48, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (z14) {
                c28655q.m87150e0(291358451);
                AbstractC14983d3.m43104a(interfaceC4339a, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, C2299e.f9106I), 0.0f, 0.0f, f13, 0.0f, 11), "FormTextInputMic"), false, C18482a.f71928a.m53326c(), c28655q, ((i25 >> 24) & 14) | 24576, 12);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(291980218);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18501k(str, c29891y, function1, i13, z4, z13, z14, z15, interfaceC4339a, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m53574U(Function1 function1, int i13, C29891y it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(m53587d0(it, i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m53575V(C29891y c29891y, String str, long j7, InterfaceC4351m innerTextField, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(innerTextField, "innerTextField");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87157i(innerTextField) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
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
            if (c29891y.f122125a.f92135x.length() == 0) {
                c28655q2.m87150e0(1588992176);
                AbstractC30795n.m94707h(str, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(1589205239);
                c28655q.m87173q(false);
            }
            AbstractC11895b.m32007z(i14 & 14, innerTextField, c28655q, true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m53576W(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, boolean z15, InterfaceC4339a interfaceC4339a, int i14, Composer composer, int i15) {
        m53573T(str, c29891y, function1, i13, z4, z13, z14, z15, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    private static final void m53577X(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, Composer composer, int i14) {
        int i15;
        long jM53358D;
        long jM125374Y0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1338553497);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(c29891y) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i15 |= c28655q.m87155h(z14) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 8388608 : 4194304;
        }
        if (c28655q.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            C33252i c33252iM105489e = AbstractC33253j.m105489e(2 * 4);
            if (z4) {
                c28655q.m87150e0(2140289489);
                jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(2140290574);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            long j7 = jM53358D;
            if (z4) {
                c28655q.m87150e0(2140292750);
                jM125374Y0 = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(2140293742);
                jM125374Y0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30();
                c28655q.m87173q(false);
            }
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C23285v0 c23285v0M67364b = C23285v0.m67364b(AbstractC33745d.m106661t(c38072d, c28655q, i16), j7, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
            C2314t c2314t = C2314t.f9131w;
            int i17 = i15 >> 3;
            int i18 = i17 & 14;
            int i19 = i15 >> 9;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC37056f.m118994r(AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), 56, 0.0f, 2), c33252iM105489e).mo3471e(m53589e0(c29891y, z4, z13, c33252iM105489e, c28655q, i18 | (i19 & 112) | (i19 & 896))), 12, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C17875c1 c17875c1 = new C17875c1(j7);
            int i24 = 0;
            C34351r0 c34351r0 = new C34351r0(3, i24, i24, 126);
            boolean z15 = ((i15 & 896) == 256) | ((i15 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            if (z15 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11506d(function1, i13, 7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC34323i.m108620b(c29891y, (Function1) objM87133R, layoutWeightElement, z4, false, c23285v0M67364b, c34351r0, null, true, 0, 1, null, null, null, c17875c1, AbstractC37817c.m121344e(-1271912922, c28655q, new C18498i(c29891y, str, jM125374Y0, 1)), c28655q, i18 | 102236160 | (i17 & 7168), 196614, 14992);
            c28655q = c28655q;
            if (z13) {
                c28655q.m87150e0(180843032);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getAttentionRed(), c28655q, 6), null, AbstractC1102d.m3419p(24, c2314t), c38072d.m121949b(c28655q, i16).getAccentAlert(), c28655q, 432, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (z14) {
                c28655q.m87150e0(181141190);
                AbstractC14983d3.m43104a(interfaceC4339a, AbstractC1136a.m3599a(c2314t, "FormTextInputMic"), false, C18482a.f71928a.m53327d(), c28655q, ((i15 >> 21) & 14) | 24624, 12);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(181657247);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13652i(str, c29891y, function1, i13, z4, z13, z14, interfaceC4339a, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m53578Y(Function1 function1, int i13, C29891y it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(m53587d0(it, i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m53579Z(C29891y c29891y, String str, long j7, InterfaceC4351m innerTextField, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(innerTextField, "innerTextField");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87157i(innerTextField) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
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
            if (c29891y.f122125a.f92135x.length() == 0) {
                c28655q2.m87150e0(-1805939429);
                AbstractC30795n.m94707h(str, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-1805726366);
                c28655q.m87173q(false);
            }
            AbstractC11895b.m32007z(i14 & 14, innerTextField, c28655q, true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m53581a0(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, int i14, Composer composer, int i15) {
        m53577X(str, c29891y, function1, i13, z4, z13, z14, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d0 */
    private static final C29891y m53587d0(C29891y c29891y, int i13) {
        if (c29891y.f122125a.f92135x.length() <= i13) {
            return c29891y;
        }
        String strM125866L0 = AbstractC39414r.m125866L0(i13, c29891y.f122125a.f92135x);
        int length = strM125866L0.length();
        return C29891y.m91510a(c29891y, strM125866L0, AbstractC21478l0.m60431f(length, length), 4);
    }

    /* JADX INFO: renamed from: e0 */
    private static final Modifier m53589e0(C29891y c29891y, boolean z4, boolean z13, InterfaceC17869a1 interfaceC17869a1, Composer composer, int i13) {
        C2314t c2314t = C2314t.f9131w;
        if (z13) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1360980483);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC1092a.m3358c(c2314t, c38072d.m121949b(c28655q, i14).getBlack30(), interfaceC17869a1), 1, c38072d.m121949b(c28655q, i14).getAccentAlert(), interfaceC17869a1);
            c28655q.m87173q(false);
            return modifierM44455h;
        }
        if (!z4) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1360986101);
            Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack30(), interfaceC17869a1);
            c28655q2.m87173q(false);
            return modifierM3358c;
        }
        if (c29891y.f122125a.f92135x.length() > 0) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(1360992434);
            c28655q3.m87173q(false);
            return AbstractC15751g.m44456i(1, AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m43978D(), interfaceC17869a1, 0.0f, 4), AbstractC15673b0.m43972A(), interfaceC17869a1);
        }
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87150e0(1360999007);
        C38072d c38072d2 = C38072d.f163053a;
        int i15 = C38072d.f163054b;
        Modifier modifierM44455h2 = AbstractC15751g.m44455h(AbstractC1092a.m3358c(c2314t, c38072d2.m121949b(c28655q4, i15).getBlack30(), interfaceC17869a1), 1, c38072d2.m121949b(c28655q4, i15).getWhite40(), interfaceC17869a1);
        c28655q4.m87173q(false);
        return modifierM44455h2;
    }

    /* JADX INFO: renamed from: f0 */
    public static final boolean m53591f0(boolean z4, boolean z13, boolean z14) {
        return z4 && z13 && z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC30468c m53607v(Context ctx) {
        AbstractC22676k.m65750j(ctx, "ctx");
        return C30469d.f125195w.m93232a(ctx);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x012a  */
    /* JADX WARN: Code duplicated, block: B:109:0x012d  */
    /* JADX WARN: Code duplicated, block: B:112:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0286  */
    /* JADX WARN: Code duplicated, block: B:147:0x0299  */
    /* JADX WARN: Code duplicated, block: B:150:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:156:0x0308  */
    /* JADX WARN: Code duplicated, block: B:157:0x031b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    /* JADX INFO: renamed from: w */
    public static final void m53608w(final String placeholder, final C29891y text, final Function1 onTextChanged, final int i13, boolean z4, boolean z13, boolean z14, boolean z15, Function1 function1, Composer composer, final int i14, final int i15) {
        int i16;
        int i17;
        boolean z16;
        int i18;
        int i19;
        boolean z17;
        int i24;
        int i25;
        boolean z18;
        int i26;
        int i27;
        int i28;
        boolean z19;
        final boolean z24;
        final boolean z25;
        final boolean z26;
        final boolean z27;
        final Function1 function2;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        int i29;
        boolean z28;
        boolean z29;
        final boolean z34;
        boolean z35;
        boolean z36;
        Function1 function3;
        C28676v0 c28676v0;
        final Function1 function4;
        Object objM87133R;
        Object objM87133R2;
        InterfaceC30468c interfaceC30468c;
        AbstractC22676k.m65750j(placeholder, "placeholder");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(onTextChanged, "onTextChanged");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(985883813);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(placeholder) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(text) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87157i(onTextChanged) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i34 = i15 & 16;
        if (i34 == 0) {
            if ((i14 & 24576) == 0) {
                i16 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    z16 = z13;
                    if (c28655q.m87155h(z16)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 64;
                if (i19 != 0) {
                    if ((1572864 & i14) == 0) {
                        z17 = z14;
                        if (c28655q.m87155h(z17)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 128;
                    if (i25 != 0) {
                        if ((12582912 & i14) == 0) {
                            z18 = z15;
                            if (c28655q.m87155h(z18)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i16 |= i26;
                        }
                        i27 = i15 & 256;
                        if (i27 != 0) {
                            if ((i14 & 100663296) == 0) {
                                if (c28655q.m87157i(function1)) {
                                    i28 = 67108864;
                                } else {
                                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                                }
                                i16 |= i28;
                            }
                            if ((i16 & 38347923) != 38347922) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (c28655q.m87135U(i16 & 1, z19)) {
                                i29 = i16;
                                if (i34 != 0) {
                                    z28 = true;
                                } else {
                                    z28 = z4;
                                }
                                if (i17 != 0) {
                                    z29 = false;
                                } else {
                                    z29 = z16;
                                }
                                z34 = z29;
                                if (i19 != 0) {
                                    z35 = false;
                                } else {
                                    z35 = z17;
                                }
                                z36 = i25 == 0 ? z18 : true;
                                if (i27 != 0) {
                                    function3 = f72074b;
                                } else {
                                    function3 = function1;
                                }
                                boolean zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                                c28676v0 = C28635l.f115821a;
                                if (z36 || zBooleanValue) {
                                    function4 = function3;
                                    c28655q.m87150e0(1478797239);
                                    objM87133R = c28655q.m87133R();
                                    if (objM87133R == c28676v0) {
                                        objM87133R = new C18008r(21);
                                        c28655q.m87172p0(objM87133R);
                                    }
                                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                                    objM87133R2 = c28655q.m87133R();
                                    if (objM87133R2 == c28676v0) {
                                        objM87133R2 = new C18332c(24);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                                    c28655q.m87173q(false);
                                    c28677v1M87180u = c28655q.m87180u();
                                    if (c28677v1M87180u == null) {
                                        return;
                                    }
                                    final int i35 = 1;
                                    final boolean z37 = z35;
                                    final boolean z38 = z36;
                                    final boolean z39 = z28;
                                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                        @Override // c93.InterfaceC4351m
                                        public final Object invoke(Object obj, Object obj2) {
                                            switch (i35) {
                                                case 0:
                                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z39, z34, z37, z38, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                                default:
                                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z39, z34, z37, z38, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        }
                                    };
                                } else {
                                    c28655q.m87150e0(1479264285);
                                    c28655q.m87173q(false);
                                    Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                                    Object objM87133R3 = c28655q.m87133R();
                                    if (objM87133R3 == c28676v0) {
                                        objM87133R3 = AbstractC28683x.m87262p(c28655q);
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                                    Object objM87133R4 = c28655q.m87133R();
                                    if (objM87133R4 == c28676v0) {
                                        objM87133R4 = (InterfaceC30468c) function3.invoke(context);
                                        c28655q.m87172p0(objM87133R4);
                                    }
                                    InterfaceC30468c interfaceC30468c2 = (InterfaceC30468c) objM87133R4;
                                    InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(interfaceC30468c2.getIsListening(), c28655q, 0);
                                    Object objM87133R5 = c28655q.m87133R();
                                    if (objM87133R5 == c28676v0) {
                                        objM87133R5 = AbstractC3855a.m11831o(0.0f, c28655q);
                                    }
                                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                                    InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(onTextChanged, c28655q);
                                    InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Integer.valueOf(i13), c28655q);
                                    ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
                                    boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC30468c2) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c1M87238F2);
                                    Function1 function5 = function3;
                                    Object objM87133R6 = c28655q.m87133R();
                                    if (zM87157i || objM87133R6 == c28676v0) {
                                        objM87133R6 = new C1040r((Object) interfaceC2994c0, (Object) interfaceC30468c2, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c1M87238F2, (Object) interfaceC28601c1, 14);
                                        c28655q.m87172p0(objM87133R6);
                                    }
                                    C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission, (Function1) objM87133R6, c28655q, 0);
                                    boolean zM87157i2 = c28655q.m87157i(interfaceC30468c2);
                                    Object objM87133R7 = c28655q.m87133R();
                                    if (zM87157i2 || objM87133R7 == c28676v0) {
                                        objM87133R7 = new C18490e(interfaceC30468c2, 0);
                                        c28655q.m87172p0(objM87133R7);
                                    }
                                    AbstractC28683x.m87251e(interfaceC30468c2, (Function1) objM87133R7, c28655q);
                                    boolean zM53560G = m53560G(interfaceC28601c1M87261o);
                                    float fM53561H = m53561H(interfaceC28601c1);
                                    boolean zM87157i3 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC30468c2) | c28655q.m87157i(c16351iM118972a0) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c1M87238F2);
                                    Object objM87133R8 = c28655q.m87133R();
                                    if (zM87157i3 || objM87133R8 == c28676v0) {
                                        objM87133R8 = new C0561l(interfaceC2994c0, interfaceC30468c2, c16351iM118972a0, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1, 4);
                                        interfaceC30468c = interfaceC30468c2;
                                        c28655q.m87172p0(objM87133R8);
                                    } else {
                                        interfaceC30468c = interfaceC30468c2;
                                    }
                                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R8;
                                    boolean zM87157i4 = c28655q.m87157i(interfaceC30468c) | c28655q.m87153g(interfaceC28601c1M87238F);
                                    Object objM87133R9 = c28655q.m87133R();
                                    if (zM87157i4 || objM87133R9 == c28676v0) {
                                        objM87133R9 = new C18493f0(1, interfaceC30468c, interfaceC28601c1M87238F);
                                        c28655q.m87172p0(objM87133R9);
                                    }
                                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, interfaceC30468c, zM53560G, fM53561H, interfaceC4339a2, (Function1) objM87133R9, c28655q, i29 & 4194302, 0);
                                    z26 = z35;
                                    function2 = function5;
                                    z27 = z36;
                                    z25 = z34;
                                    z24 = z28;
                                }
                                c28677v1M87180u.f115982d = interfaceC4351m;
                            }
                            c28655q.m87138X();
                            z24 = z4;
                            z25 = z16;
                            z26 = z17;
                            z27 = z18;
                            function2 = function1;
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                final int i36 = 0;
                                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i36) {
                                            case 0:
                                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                            default:
                                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    }
                                };
                                c28677v1M87180u.f115982d = interfaceC4351m;
                            }
                        }
                        i16 |= 100663296;
                        if ((i16 & 38347923) != 38347922) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z19)) {
                            i29 = i16;
                            if (i34 != 0) {
                                z28 = true;
                            } else {
                                z28 = z4;
                            }
                            if (i17 != 0) {
                                z29 = false;
                            } else {
                                z29 = z16;
                            }
                            z34 = z29;
                            if (i19 != 0) {
                                z35 = false;
                            } else {
                                z35 = z17;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                function3 = f72074b;
                            } else {
                                function3 = function1;
                            }
                            boolean zBooleanValue2 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                            c28676v0 = C28635l.f115821a;
                            if (z36) {
                            }
                            function4 = function3;
                            c28655q.m87150e0(1478797239);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C18008r(21);
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C18332c(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a3, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                            c28655q.m87173q(false);
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u == null) {
                                final int i37 = 1;
                                final boolean z310 = z35;
                                final boolean z311 = z36;
                                final boolean z312 = z28;
                                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i37) {
                                            case 0:
                                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z312, z34, z310, z311, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                            default:
                                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z312, z34, z310, z311, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    }
                                };
                                c28677v1M87180u.f115982d = interfaceC4351m;
                            }
                            return;
                        }
                        c28655q.m87138X();
                        z24 = z4;
                        z25 = z16;
                        z26 = z17;
                        z27 = z18;
                        function2 = function1;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            final int i38 = 0;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i38) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                    }
                    i16 |= 12582912;
                    z18 = z15;
                    i27 = i15 & 256;
                    if (i27 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (c28655q.m87157i(function1)) {
                                i28 = 67108864;
                            } else {
                                i28 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i16 |= i28;
                        }
                        if ((i16 & 38347923) != 38347922) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z19)) {
                            i29 = i16;
                            if (i34 != 0) {
                                z28 = true;
                            } else {
                                z28 = z4;
                            }
                            if (i17 != 0) {
                                z29 = false;
                            } else {
                                z29 = z16;
                            }
                            z34 = z29;
                            if (i19 != 0) {
                                z35 = false;
                            } else {
                                z35 = z17;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                function3 = f72074b;
                            } else {
                                function3 = function1;
                            }
                            boolean zBooleanValue3 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                            c28676v0 = C28635l.f115821a;
                            if (z36) {
                            }
                            function4 = function3;
                            c28655q.m87150e0(1478797239);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C18008r(21);
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C18332c(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a4, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                            c28655q.m87173q(false);
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u == null) {
                                final int i39 = 1;
                                final boolean z313 = z35;
                                final boolean z314 = z36;
                                final boolean z315 = z28;
                                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i39) {
                                            case 0:
                                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z315, z34, z313, z314, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                            default:
                                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z315, z34, z313, z314, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    }
                                };
                                c28677v1M87180u.f115982d = interfaceC4351m;
                            }
                            return;
                        }
                        c28655q.m87138X();
                        z24 = z4;
                        z25 = z16;
                        z26 = z17;
                        z27 = z18;
                        function2 = function1;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            final int i310 = 0;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i310) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                    }
                    i16 |= 100663296;
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue4 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a5, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i311 = 1;
                            final boolean z316 = z35;
                            final boolean z317 = z36;
                            final boolean z318 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i311) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z318, z34, z316, z317, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z318, z34, z316, z317, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i312 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i312) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 1572864;
                z17 = z14;
                i25 = i15 & 128;
                if (i25 != 0) {
                    if ((12582912 & i14) == 0) {
                        z18 = z15;
                        if (c28655q.m87155h(z18)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 256;
                    if (i27 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (c28655q.m87157i(function1)) {
                                i28 = 67108864;
                            } else {
                                i28 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i16 |= i28;
                        }
                        if ((i16 & 38347923) != 38347922) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z19)) {
                            i29 = i16;
                            if (i34 != 0) {
                                z28 = true;
                            } else {
                                z28 = z4;
                            }
                            if (i17 != 0) {
                                z29 = false;
                            } else {
                                z29 = z16;
                            }
                            z34 = z29;
                            if (i19 != 0) {
                                z35 = false;
                            } else {
                                z35 = z17;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                function3 = f72074b;
                            } else {
                                function3 = function1;
                            }
                            boolean zBooleanValue5 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                            c28676v0 = C28635l.f115821a;
                            if (z36) {
                            }
                            function4 = function3;
                            c28655q.m87150e0(1478797239);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C18008r(21);
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C18332c(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a6, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                            c28655q.m87173q(false);
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u == null) {
                                final int i313 = 1;
                                final boolean z319 = z35;
                                final boolean z3110 = z36;
                                final boolean z3111 = z28;
                                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i313) {
                                            case 0:
                                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z3111, z34, z319, z3110, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                            default:
                                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z3111, z34, z319, z3110, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    }
                                };
                                c28677v1M87180u.f115982d = interfaceC4351m;
                            }
                            return;
                        }
                        c28655q.m87138X();
                        z24 = z4;
                        z25 = z16;
                        z26 = z17;
                        z27 = z18;
                        function2 = function1;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            final int i314 = 0;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i314) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                    }
                    i16 |= 100663296;
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue6 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a7, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i315 = 1;
                            final boolean z3112 = z35;
                            final boolean z3113 = z36;
                            final boolean z3114 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i315) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z3114, z34, z3112, z3113, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z3114, z34, z3112, z3113, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i316 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i316) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 12582912;
                z18 = z15;
                i27 = i15 & 256;
                if (i27 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i28;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue7 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a8, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i317 = 1;
                            final boolean z3115 = z35;
                            final boolean z3116 = z36;
                            final boolean z3117 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i317) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z3117, z34, z3115, z3116, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z3117, z34, z3115, z3116, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i318 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i318) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 100663296;
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue8 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a9, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i319 = 1;
                        final boolean z3118 = z35;
                        final boolean z3119 = z36;
                        final boolean z31110 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i319) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31110, z34, z3118, z3119, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31110, z34, z3118, z3119, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i3110 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3110) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z16 = z13;
            i19 = i15 & 64;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    z17 = z14;
                    if (c28655q.m87155h(z17)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 128;
                if (i25 != 0) {
                    if ((12582912 & i14) == 0) {
                        z18 = z15;
                        if (c28655q.m87155h(z18)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 256;
                    if (i27 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (c28655q.m87157i(function1)) {
                                i28 = 67108864;
                            } else {
                                i28 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i16 |= i28;
                        }
                        if ((i16 & 38347923) != 38347922) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z19)) {
                            i29 = i16;
                            if (i34 != 0) {
                                z28 = true;
                            } else {
                                z28 = z4;
                            }
                            if (i17 != 0) {
                                z29 = false;
                            } else {
                                z29 = z16;
                            }
                            z34 = z29;
                            if (i19 != 0) {
                                z35 = false;
                            } else {
                                z35 = z17;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                function3 = f72074b;
                            } else {
                                function3 = function1;
                            }
                            boolean zBooleanValue9 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                            c28676v0 = C28635l.f115821a;
                            if (z36) {
                            }
                            function4 = function3;
                            c28655q.m87150e0(1478797239);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C18008r(21);
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R;
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C18332c(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a10, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                            c28655q.m87173q(false);
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u == null) {
                                final int i3111 = 1;
                                final boolean z31111 = z35;
                                final boolean z31112 = z36;
                                final boolean z31113 = z28;
                                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i3111) {
                                            case 0:
                                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31113, z34, z31111, z31112, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                            default:
                                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31113, z34, z31111, z31112, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    }
                                };
                                c28677v1M87180u.f115982d = interfaceC4351m;
                            }
                            return;
                        }
                        c28655q.m87138X();
                        z24 = z4;
                        z25 = z16;
                        z26 = z17;
                        z27 = z18;
                        function2 = function1;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            final int i3112 = 0;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i3112) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                    }
                    i16 |= 100663296;
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue10 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a11, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i3113 = 1;
                            final boolean z31114 = z35;
                            final boolean z31115 = z36;
                            final boolean z31116 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i3113) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31116, z34, z31114, z31115, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31116, z34, z31114, z31115, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i3114 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i3114) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 12582912;
                z18 = z15;
                i27 = i15 & 256;
                if (i27 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i28;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue11 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a12, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i3115 = 1;
                            final boolean z31117 = z35;
                            final boolean z31118 = z36;
                            final boolean z31119 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i3115) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31119, z34, z31117, z31118, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31119, z34, z31117, z31118, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i3116 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i3116) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 100663296;
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue12 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a13, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i3117 = 1;
                        final boolean z311110 = z35;
                        final boolean z311111 = z36;
                        final boolean z311112 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i3117) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z311112, z34, z311110, z311111, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z311112, z34, z311110, z311111, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i3118 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3118) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= 1572864;
            z17 = z14;
            i25 = i15 & 128;
            if (i25 != 0) {
                if ((12582912 & i14) == 0) {
                    z18 = z15;
                    if (c28655q.m87155h(z18)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 256;
                if (i27 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i28;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue13 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a14, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i3119 = 1;
                            final boolean z311113 = z35;
                            final boolean z311114 = z36;
                            final boolean z311115 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i3119) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z311115, z34, z311113, z311114, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z311115, z34, z311113, z311114, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i31110 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i31110) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 100663296;
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue14 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a15, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i31111 = 1;
                        final boolean z311116 = z35;
                        final boolean z311117 = z36;
                        final boolean z311118 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i31111) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z311118, z34, z311116, z311117, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z311118, z34, z311116, z311117, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i31112 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i31112) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= 12582912;
            z18 = z15;
            i27 = i15 & 256;
            if (i27 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue15 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a16, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i31113 = 1;
                        final boolean z311119 = z35;
                        final boolean z3111110 = z36;
                        final boolean z3111111 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i31113) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z3111111, z34, z311119, z3111110, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z3111111, z34, z311119, z3111110, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i31114 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i31114) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= 100663296;
            if ((i16 & 38347923) != 38347922) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q.m87135U(i16 & 1, z19)) {
                i29 = i16;
                if (i34 != 0) {
                    z28 = true;
                } else {
                    z28 = z4;
                }
                if (i17 != 0) {
                    z29 = false;
                } else {
                    z29 = z16;
                }
                z34 = z29;
                if (i19 != 0) {
                    z35 = false;
                } else {
                    z35 = z17;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    function3 = f72074b;
                } else {
                    function3 = function1;
                }
                boolean zBooleanValue16 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                c28676v0 = C28635l.f115821a;
                if (z36) {
                }
                function4 = function3;
                c28655q.m87150e0(1478797239);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C18008r(21);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18332c(24);
                    c28655q.m87172p0(objM87133R2);
                }
                m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a17, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    final int i31115 = 1;
                    final boolean z3111112 = z35;
                    final boolean z3111113 = z36;
                    final boolean z3111114 = z28;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i31115) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z3111114, z34, z3111112, z3111113, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z3111114, z34, z3111112, z3111113, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                return;
            }
            c28655q.m87138X();
            z24 = z4;
            z25 = z16;
            z26 = z17;
            z27 = z18;
            function2 = function1;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i31116 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i31116) {
                            case 0:
                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            default:
                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i16 |= 24576;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                z16 = z13;
                if (c28655q.m87155h(z16)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    z17 = z14;
                    if (c28655q.m87155h(z17)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 128;
                if (i25 != 0) {
                    if ((12582912 & i14) == 0) {
                        z18 = z15;
                        if (c28655q.m87155h(z18)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 256;
                    if (i27 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (c28655q.m87157i(function1)) {
                                i28 = 67108864;
                            } else {
                                i28 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i16 |= i28;
                        }
                        if ((i16 & 38347923) != 38347922) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (c28655q.m87135U(i16 & 1, z19)) {
                            i29 = i16;
                            if (i34 != 0) {
                                z28 = true;
                            } else {
                                z28 = z4;
                            }
                            if (i17 != 0) {
                                z29 = false;
                            } else {
                                z29 = z16;
                            }
                            z34 = z29;
                            if (i19 != 0) {
                                z35 = false;
                            } else {
                                z35 = z17;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                function3 = f72074b;
                            } else {
                                function3 = function1;
                            }
                            boolean zBooleanValue17 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                            c28676v0 = C28635l.f115821a;
                            if (z36) {
                            }
                            function4 = function3;
                            c28655q.m87150e0(1478797239);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C18008r(21);
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R;
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C18332c(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a18, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                            c28655q.m87173q(false);
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u == null) {
                                final int i31117 = 1;
                                final boolean z3111115 = z35;
                                final boolean z3111116 = z36;
                                final boolean z3111117 = z28;
                                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i31117) {
                                            case 0:
                                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z3111117, z34, z3111115, z3111116, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                            default:
                                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z3111117, z34, z3111115, z3111116, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    }
                                };
                                c28677v1M87180u.f115982d = interfaceC4351m;
                            }
                            return;
                        }
                        c28655q.m87138X();
                        z24 = z4;
                        z25 = z16;
                        z26 = z17;
                        z27 = z18;
                        function2 = function1;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            final int i31118 = 0;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i31118) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                    }
                    i16 |= 100663296;
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue18 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a19, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i31119 = 1;
                            final boolean z3111118 = z35;
                            final boolean z3111119 = z36;
                            final boolean z31111110 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i31119) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31111110, z34, z3111118, z3111119, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31111110, z34, z3111118, z3111119, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i311110 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i311110) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 12582912;
                z18 = z15;
                i27 = i15 & 256;
                if (i27 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i28;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue19 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a110, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i311111 = 1;
                            final boolean z31111111 = z35;
                            final boolean z31111112 = z36;
                            final boolean z31111113 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i311111) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31111113, z34, z31111111, z31111112, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31111113, z34, z31111111, z31111112, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i311112 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i311112) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 100663296;
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue110 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a111, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i311113 = 1;
                        final boolean z31111114 = z35;
                        final boolean z31111115 = z36;
                        final boolean z31111116 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i311113) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31111116, z34, z31111114, z31111115, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31111116, z34, z31111114, z31111115, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i311114 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i311114) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= 1572864;
            z17 = z14;
            i25 = i15 & 128;
            if (i25 != 0) {
                if ((12582912 & i14) == 0) {
                    z18 = z15;
                    if (c28655q.m87155h(z18)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 256;
                if (i27 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i28;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue111 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a112, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i311115 = 1;
                            final boolean z31111117 = z35;
                            final boolean z31111118 = z36;
                            final boolean z31111119 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i311115) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31111119, z34, z31111117, z31111118, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31111119, z34, z31111117, z31111118, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i311116 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i311116) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 100663296;
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue112 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a113, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i311117 = 1;
                        final boolean z311111110 = z35;
                        final boolean z311111111 = z36;
                        final boolean z311111112 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i311117) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z311111112, z34, z311111110, z311111111, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z311111112, z34, z311111110, z311111111, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i311118 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i311118) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= 12582912;
            z18 = z15;
            i27 = i15 & 256;
            if (i27 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue113 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a114, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i311119 = 1;
                        final boolean z311111113 = z35;
                        final boolean z311111114 = z36;
                        final boolean z311111115 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i311119) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z311111115, z34, z311111113, z311111114, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z311111115, z34, z311111113, z311111114, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i3111110 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3111110) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= 100663296;
            if ((i16 & 38347923) != 38347922) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q.m87135U(i16 & 1, z19)) {
                i29 = i16;
                if (i34 != 0) {
                    z28 = true;
                } else {
                    z28 = z4;
                }
                if (i17 != 0) {
                    z29 = false;
                } else {
                    z29 = z16;
                }
                z34 = z29;
                if (i19 != 0) {
                    z35 = false;
                } else {
                    z35 = z17;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    function3 = f72074b;
                } else {
                    function3 = function1;
                }
                boolean zBooleanValue114 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                c28676v0 = C28635l.f115821a;
                if (z36) {
                }
                function4 = function3;
                c28655q.m87150e0(1478797239);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C18008r(21);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18332c(24);
                    c28655q.m87172p0(objM87133R2);
                }
                m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a115, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    final int i3111111 = 1;
                    final boolean z311111116 = z35;
                    final boolean z311111117 = z36;
                    final boolean z311111118 = z28;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3111111) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z311111118, z34, z311111116, z311111117, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z311111118, z34, z311111116, z311111117, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                return;
            }
            c28655q.m87138X();
            z24 = z4;
            z25 = z16;
            z26 = z17;
            z27 = z18;
            function2 = function1;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i3111112 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i3111112) {
                            case 0:
                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            default:
                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z16 = z13;
        i19 = i15 & 64;
        if (i19 != 0) {
            if ((1572864 & i14) == 0) {
                z17 = z14;
                if (c28655q.m87155h(z17)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            i25 = i15 & 128;
            if (i25 != 0) {
                if ((12582912 & i14) == 0) {
                    z18 = z15;
                    if (c28655q.m87155h(z18)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 256;
                if (i27 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i28;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z19)) {
                        i29 = i16;
                        if (i34 != 0) {
                            z28 = true;
                        } else {
                            z28 = z4;
                        }
                        if (i17 != 0) {
                            z29 = false;
                        } else {
                            z29 = z16;
                        }
                        z34 = z29;
                        if (i19 != 0) {
                            z35 = false;
                        } else {
                            z35 = z17;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            function3 = f72074b;
                        } else {
                            function3 = function1;
                        }
                        boolean zBooleanValue115 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                        c28676v0 = C28635l.f115821a;
                        if (z36) {
                        }
                        function4 = function3;
                        c28655q.m87150e0(1478797239);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C18008r(21);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a116 = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C18332c(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a116, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                        c28655q.m87173q(false);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u == null) {
                            final int i3111113 = 1;
                            final boolean z311111119 = z35;
                            final boolean z3111111110 = z36;
                            final boolean z3111111111 = z28;
                            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i3111113) {
                                        case 0:
                                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z3111111111, z34, z311111119, z3111111110, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                        default:
                                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z3111111111, z34, z311111119, z3111111110, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                }
                            };
                            c28677v1M87180u.f115982d = interfaceC4351m;
                        }
                        return;
                    }
                    c28655q.m87138X();
                    z24 = z4;
                    z25 = z16;
                    z26 = z17;
                    z27 = z18;
                    function2 = function1;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i3111114 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i3111114) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                }
                i16 |= 100663296;
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue116 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a117, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i3111115 = 1;
                        final boolean z3111111112 = z35;
                        final boolean z3111111113 = z36;
                        final boolean z3111111114 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i3111115) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z3111111114, z34, z3111111112, z3111111113, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z3111111114, z34, z3111111112, z3111111113, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i3111116 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3111116) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= 12582912;
            z18 = z15;
            i27 = i15 & 256;
            if (i27 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue117 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a118 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a118, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i3111117 = 1;
                        final boolean z3111111115 = z35;
                        final boolean z3111111116 = z36;
                        final boolean z3111111117 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i3111117) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z3111111117, z34, z3111111115, z3111111116, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z3111111117, z34, z3111111115, z3111111116, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i3111118 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3111118) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= 100663296;
            if ((i16 & 38347923) != 38347922) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q.m87135U(i16 & 1, z19)) {
                i29 = i16;
                if (i34 != 0) {
                    z28 = true;
                } else {
                    z28 = z4;
                }
                if (i17 != 0) {
                    z29 = false;
                } else {
                    z29 = z16;
                }
                z34 = z29;
                if (i19 != 0) {
                    z35 = false;
                } else {
                    z35 = z17;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    function3 = f72074b;
                } else {
                    function3 = function1;
                }
                boolean zBooleanValue118 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                c28676v0 = C28635l.f115821a;
                if (z36) {
                }
                function4 = function3;
                c28655q.m87150e0(1478797239);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C18008r(21);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a119 = (InterfaceC4339a) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18332c(24);
                    c28655q.m87172p0(objM87133R2);
                }
                m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a119, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    final int i3111119 = 1;
                    final boolean z3111111118 = z35;
                    final boolean z3111111119 = z36;
                    final boolean z31111111110 = z28;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3111119) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31111111110, z34, z3111111118, z3111111119, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31111111110, z34, z3111111118, z3111111119, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                return;
            }
            c28655q.m87138X();
            z24 = z4;
            z25 = z16;
            z26 = z17;
            z27 = z18;
            function2 = function1;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i31111110 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i31111110) {
                            case 0:
                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            default:
                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i16 |= 1572864;
        z17 = z14;
        i25 = i15 & 128;
        if (i25 != 0) {
            if ((12582912 & i14) == 0) {
                z18 = z15;
                if (c28655q.m87155h(z18)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i16 |= i26;
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q.m87135U(i16 & 1, z19)) {
                    i29 = i16;
                    if (i34 != 0) {
                        z28 = true;
                    } else {
                        z28 = z4;
                    }
                    if (i17 != 0) {
                        z29 = false;
                    } else {
                        z29 = z16;
                    }
                    z34 = z29;
                    if (i19 != 0) {
                        z35 = false;
                    } else {
                        z35 = z17;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        function3 = f72074b;
                    } else {
                        function3 = function1;
                    }
                    boolean zBooleanValue119 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                    c28676v0 = C28635l.f115821a;
                    if (z36) {
                    }
                    function4 = function3;
                    c28655q.m87150e0(1478797239);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C18008r(21);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18332c(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a1110, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                    c28655q.m87173q(false);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u == null) {
                        final int i31111111 = 1;
                        final boolean z31111111111 = z35;
                        final boolean z31111111112 = z36;
                        final boolean z31111111113 = z28;
                        interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i31111111) {
                                    case 0:
                                        return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31111111113, z34, z31111111111, z31111111112, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                    default:
                                        return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31111111113, z34, z31111111111, z31111111112, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            }
                        };
                        c28677v1M87180u.f115982d = interfaceC4351m;
                    }
                    return;
                }
                c28655q.m87138X();
                z24 = z4;
                z25 = z16;
                z26 = z17;
                z27 = z18;
                function2 = function1;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i31111112 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i31111112) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i16 |= 100663296;
            if ((i16 & 38347923) != 38347922) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q.m87135U(i16 & 1, z19)) {
                i29 = i16;
                if (i34 != 0) {
                    z28 = true;
                } else {
                    z28 = z4;
                }
                if (i17 != 0) {
                    z29 = false;
                } else {
                    z29 = z16;
                }
                z34 = z29;
                if (i19 != 0) {
                    z35 = false;
                } else {
                    z35 = z17;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    function3 = f72074b;
                } else {
                    function3 = function1;
                }
                boolean zBooleanValue1110 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                c28676v0 = C28635l.f115821a;
                if (z36) {
                }
                function4 = function3;
                c28655q.m87150e0(1478797239);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C18008r(21);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18332c(24);
                    c28655q.m87172p0(objM87133R2);
                }
                m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a1111, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    final int i31111113 = 1;
                    final boolean z31111111114 = z35;
                    final boolean z31111111115 = z36;
                    final boolean z31111111116 = z28;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i31111113) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31111111116, z34, z31111111114, z31111111115, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31111111116, z34, z31111111114, z31111111115, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                return;
            }
            c28655q.m87138X();
            z24 = z4;
            z25 = z16;
            z26 = z17;
            z27 = z18;
            function2 = function1;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i31111114 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i31111114) {
                            case 0:
                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            default:
                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i16 |= 12582912;
        z18 = z15;
        i27 = i15 & 256;
        if (i27 != 0) {
            if ((i14 & 100663296) == 0) {
                if (c28655q.m87157i(function1)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i28;
            }
            if ((i16 & 38347923) != 38347922) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q.m87135U(i16 & 1, z19)) {
                i29 = i16;
                if (i34 != 0) {
                    z28 = true;
                } else {
                    z28 = z4;
                }
                if (i17 != 0) {
                    z29 = false;
                } else {
                    z29 = z16;
                }
                z34 = z29;
                if (i19 != 0) {
                    z35 = false;
                } else {
                    z35 = z17;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    function3 = f72074b;
                } else {
                    function3 = function1;
                }
                boolean zBooleanValue1111 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                c28676v0 = C28635l.f115821a;
                if (z36) {
                }
                function4 = function3;
                c28655q.m87150e0(1478797239);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C18008r(21);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a1112 = (InterfaceC4339a) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18332c(24);
                    c28655q.m87172p0(objM87133R2);
                }
                m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a1112, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    final int i31111115 = 1;
                    final boolean z31111111117 = z35;
                    final boolean z31111111118 = z36;
                    final boolean z31111111119 = z28;
                    interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i31111115) {
                                case 0:
                                    return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z31111111119, z34, z31111111117, z31111111118, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                                default:
                                    return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z31111111119, z34, z31111111117, z31111111118, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                return;
            }
            c28655q.m87138X();
            z24 = z4;
            z25 = z16;
            z26 = z17;
            z27 = z18;
            function2 = function1;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i31111116 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i31111116) {
                            case 0:
                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            default:
                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i16 |= 100663296;
        if ((i16 & 38347923) != 38347922) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (c28655q.m87135U(i16 & 1, z19)) {
            i29 = i16;
            if (i34 != 0) {
                z28 = true;
            } else {
                z28 = z4;
            }
            if (i17 != 0) {
                z29 = false;
            } else {
                z29 = z16;
            }
            z34 = z29;
            if (i19 != 0) {
                z35 = false;
            } else {
                z35 = z17;
            }
            if (i25 == 0) {
            }
            if (i27 != 0) {
                function3 = f72074b;
            } else {
                function3 = function1;
            }
            boolean zBooleanValue1112 = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
            c28676v0 = C28635l.f115821a;
            if (z36) {
            }
            function4 = function3;
            c28655q.m87150e0(1478797239);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C18008r(21);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a1113 = (InterfaceC4339a) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C18332c(24);
                c28655q.m87172p0(objM87133R2);
            }
            m53570Q(placeholder, text, onTextChanged, i13, z28, z34, z35, null, false, 0.0f, interfaceC4339a1113, (Function1) objM87133R2, c28655q, 918552576 | (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 54);
            c28655q.m87173q(false);
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u == null) {
                final int i31111117 = 1;
                final boolean z311111111110 = z35;
                final boolean z311111111111 = z36;
                final boolean z311111111112 = z28;
                interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i31111117) {
                            case 0:
                                return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z311111111112, z34, z311111111110, z311111111111, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                            default:
                                return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z311111111112, z34, z311111111110, z311111111111, function4, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            return;
        }
        c28655q.m87138X();
        z24 = z4;
        z25 = z16;
        z26 = z17;
        z27 = z18;
        function2 = function1;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i31111118 = 0;
            interfaceC4351m = new InterfaceC4351m() { // from class: ih0.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i31111118) {
                        case 0:
                            return AbstractC18502l.m53558E(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                        default:
                            return AbstractC18502l.m53559F(placeholder, text, onTextChanged, i13, z24, z25, z26, z27, function2, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Object m53609x(InterfaceC30468c interfaceC30468c, C16351i c16351i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zIsAvailable = interfaceC30468c.isAvailable();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zIsAvailable) {
            f72073a.mo85228t("Speech recognition not available", new AbstractC30556a.a[0]);
            return c23454a0;
        }
        if (interfaceC30468c.mo93230c()) {
            Object objM53565L = m53565L(interfaceC30468c, interfaceC28670t2, interfaceC28670t3, interfaceC28601c1, interfaceC30057d);
            return objM53565L == EnumC31071a.f128113w ? objM53565L : c23454a0;
        }
        c16351i.mo4052a("android.permission.RECORD_AUDIO", null);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m53610y() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m53611z(boolean z4) {
        return C23454a0.f92919a;
    }
}
