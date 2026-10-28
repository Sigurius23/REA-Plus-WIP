package p734sl0;

import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2614r4;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bm2.C3424a0;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import cp0.C11012z;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import mf2.C25513d;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p163g1.AbstractC14983d3;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15164u8;
import p163g1.C15043i8;
import p164g2.C15247s;
import p179h.C16351i;
import p238j0.InterfaceC21083i;
import p294l3.C23285v0;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p505ts.AbstractC34132o;
import p510u0.C34351r0;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39147y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pp2.C29440d;
import q83.InterfaceC30057d;
import ql0.AbstractC30467b;
import ql0.InterfaceC30468c;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sl0.p3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\u001ay\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a}\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0001\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006%²\u0006\f\u0010\u001c\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u0012\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\nX\u008a\u0084\u0002²\u0006\u0018\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010#\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "iconResource", "Lkotlin/Function1;", "Lq3/y;", "Ll83/a0;", "onTextUpdated", "textFieldValue", "Lkotlin/Function0;", "onSend", "", "hasImageToSend", "isCurrentlyGenerating", "Lql0/c;", "speechRecognitionManager", "enableVoiceAnimation", "isEnabled", "Lsl0/x1;", "autoLaunch", "y", "(ILkotlin/jvm/functions/Function1;Lq3/y;Lc93/a;ZZLql0/c;ZZLsl0/x1;Landroidx/compose/runtime/Composer;II)V", "onStartListening", "autoFocusKeyboard", "o", "(Lq3/y;Lkotlin/jvm/functions/Function1;Lc93/a;ZZLql0/c;ILc93/a;ZZLandroidx/compose/runtime/Composer;II)V", "Ltr2/n;", "a", "Ltr2/n;", "logger", "isListening", "", "audioLevel", "currentIsEnabled", "currentIsCurrentlyGenerating", "currentOnSend", "currentOnTextUpdated", "hasAutoFocused", "isFieldPositioned", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32658p3 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f135428a = InterfaceC34116n.INSTANCE.m107848a("VoiceTextField");

    /* JADX INFO: renamed from: sl0.p3$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.VoiceTextFieldKt$VoiceInputTextField$1$1", m100430f = "VoiceTextField.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f135429E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f135430F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C15247s f135431G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC2464x2 f135432H;

        /* JADX INFO: renamed from: w */
        int f135433w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f135434x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f135435y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2994c0 f135436z;

        /* JADX INFO: renamed from: sl0.p3$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.bot.view.VoiceTextFieldKt$VoiceInputTextField$1$1$1", m100430f = "VoiceTextField.kt", m100431l = {194}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42325a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f135437w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15247s f135438x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC2464x2 f135439y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42325a(C15247s c15247s, InterfaceC2464x2 interfaceC2464x2, InterfaceC30057d<? super C42325a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f135438x = c15247s;
                this.f135439y = interfaceC2464x2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42325a(this.f135438x, this.f135439y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42325a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f135437w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f135437w = 1;
                    if (AbstractC3034m0.m8782b(350L, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                try {
                    C15247s.m43350c(this.f135438x);
                } catch (IllegalStateException e5) {
                    AbstractC32658p3.f135428a.mo85228t(AbstractC11266d.m30461o("FocusRequester not attached: ", e5.getMessage()), new AbstractC30556a.a[0]);
                }
                InterfaceC2464x2 interfaceC2464x2 = this.f135439y;
                if (interfaceC2464x2 != null) {
                    ((C2463x1) interfaceC2464x2).m7443b();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, boolean z13, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C15247s c15247s, InterfaceC2464x2 interfaceC2464x2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135434x = z4;
            this.f135435y = z13;
            this.f135436z = interfaceC2994c0;
            this.f135429E = interfaceC28601c1;
            this.f135430F = interfaceC28601c2;
            this.f135431G = c15247s;
            this.f135432H = interfaceC2464x2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135434x, this.f135435y, this.f135436z, this.f135429E, this.f135430F, this.f135431G, this.f135432H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135433w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f135434x && this.f135435y && AbstractC32658p3.m102222v(this.f135429E) && !AbstractC32658p3.m102220t(this.f135430F)) {
                AbstractC32658p3.m102221u(this.f135430F, true);
                AbstractC3006f0.m8732z(this.f135436z, null, null, new C42325a(this.f135431G, this.f135432H, null), 3);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.p3$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.VoiceTextFieldKt$VoiceTextField$2$1", m100430f = "VoiceTextField.kt", m100431l = {137}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f135440E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28670t2 f135441F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28670t2 f135442G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28670t2 f135443H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f135444I;

        /* JADX INFO: renamed from: w */
        int f135445w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC32692x1 f135446x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC30468c f135447y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C16351i f135448z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC32692x1 enumC32692x1, InterfaceC30468c interfaceC30468c, C16351i c16351i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135446x = enumC32692x1;
            this.f135447y = interfaceC30468c;
            this.f135448z = c16351i;
            this.f135440E = interfaceC28670t2;
            this.f135441F = interfaceC28670t3;
            this.f135442G = interfaceC28670t4;
            this.f135443H = interfaceC28670t5;
            this.f135444I = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f135446x, this.f135447y, this.f135448z, this.f135440E, this.f135441F, this.f135442G, this.f135443H, this.f135444I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135445w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f135446x == EnumC32692x1.VOICE) {
                    InterfaceC30468c interfaceC30468c = this.f135447y;
                    C16351i c16351i = this.f135448z;
                    InterfaceC28670t2 interfaceC28670t2 = this.f135440E;
                    InterfaceC28670t2 interfaceC28670t3 = this.f135441F;
                    InterfaceC28670t2 interfaceC28670t4 = this.f135442G;
                    InterfaceC28670t2 interfaceC28670t5 = this.f135443H;
                    InterfaceC28601c1 interfaceC28601c1 = this.f135444I;
                    this.f135445w = 1;
                    if (AbstractC32658p3.m102226z(interfaceC30468c, c16351i, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5, interfaceC28601c1, true, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: sl0.p3$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.VoiceTextFieldKt$VoiceTextField$4$1$1", m100430f = "VoiceTextField.kt", m100431l = {155}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f135449E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28670t2 f135450F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28670t2 f135451G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f135452H;

        /* JADX INFO: renamed from: w */
        int f135453w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC30468c f135454x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C16351i f135455y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f135456z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30468c interfaceC30468c, C16351i c16351i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135454x = interfaceC30468c;
            this.f135455y = c16351i;
            this.f135456z = interfaceC28670t2;
            this.f135449E = interfaceC28670t3;
            this.f135450F = interfaceC28670t4;
            this.f135451G = interfaceC28670t5;
            this.f135452H = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f135454x, this.f135455y, this.f135456z, this.f135449E, this.f135450F, this.f135451G, this.f135452H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135453w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30468c interfaceC30468c = this.f135454x;
                C16351i c16351i = this.f135455y;
                InterfaceC28670t2 interfaceC28670t2 = this.f135456z;
                InterfaceC28670t2 interfaceC28670t3 = this.f135449E;
                InterfaceC28670t2 interfaceC28670t4 = this.f135450F;
                InterfaceC28670t2 interfaceC28670t5 = this.f135451G;
                InterfaceC28601c1 interfaceC28601c1 = this.f135452H;
                this.f135453w = 1;
                if (AbstractC32658p3.m102176A(interfaceC30468c, c16351i, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5, interfaceC28601c1, false, this, 128, null) == enumC31071a) {
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

    /* JADX INFO: renamed from: sl0.p3$d */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"sl0/p3$d", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC30468c f135457a;

        public d(InterfaceC30468c interfaceC30468c) {
            this.f135457a = interfaceC30468c;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f135457a.mo93228a();
        }
    }

    /* JADX INFO: renamed from: sl0.p3$e */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.VoiceTextFieldKt$VoiceTextField$permissionLauncher$1$1$1", m100430f = "VoiceTextField.kt", m100431l = {110}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28670t2 f135458E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28670t2 f135459F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f135460G;

        /* JADX INFO: renamed from: w */
        int f135461w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC30468c f135462x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f135463y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f135464z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30468c interfaceC30468c, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135462x = interfaceC30468c;
            this.f135463y = interfaceC28670t2;
            this.f135464z = interfaceC28670t3;
            this.f135458E = interfaceC28670t4;
            this.f135459F = interfaceC28670t5;
            this.f135460G = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f135462x, this.f135463y, this.f135464z, this.f135458E, this.f135459F, this.f135460G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135461w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30468c interfaceC30468c = this.f135462x;
                InterfaceC28670t2 interfaceC28670t2 = this.f135463y;
                InterfaceC28670t2 interfaceC28670t3 = this.f135464z;
                InterfaceC28670t2 interfaceC28670t4 = this.f135458E;
                InterfaceC28670t2 interfaceC28670t5 = this.f135459F;
                InterfaceC28601c1 interfaceC28601c1 = this.f135460G;
                this.f135461w = 1;
                if (AbstractC32658p3.m102190O(interfaceC30468c, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5, interfaceC28601c1, false, this, 64, null) == enumC31071a) {
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

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Object m102176A(InterfaceC30468c interfaceC30468c, C16351i c16351i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, InterfaceC28601c1 interfaceC28601c1, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        return m102226z(interfaceC30468c, c16351i, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5, interfaceC28601c1, (i13 & 128) != 0 ? false : z4, interfaceC30057d);
    }

    /* JADX INFO: renamed from: B */
    private static final boolean m102177B(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m102178C(InterfaceC2994c0 interfaceC2994c0, InterfaceC30468c interfaceC30468c, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        if (z4) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(interfaceC30468c, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5, interfaceC28601c1, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC28620h0 m102179D(InterfaceC30468c interfaceC30468c, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new d(interfaceC30468c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m102180E(InterfaceC30468c interfaceC30468c, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, boolean z4) {
        m102195T(interfaceC30468c, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m102181F(InterfaceC2994c0 interfaceC2994c0, InterfaceC30468c interfaceC30468c, C16351i c16351i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(interfaceC30468c, c16351i, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5, interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m102182G(int i13, Function1 function1, C29891y c29891y, InterfaceC4339a interfaceC4339a, boolean z4, boolean z13, InterfaceC30468c interfaceC30468c, boolean z14, boolean z15, EnumC32692x1 enumC32692x1, int i14, int i15, Composer composer, int i16) {
        m102225y(i13, function1, c29891y, interfaceC4339a, z4, z13, interfaceC30468c, z14, z15, enumC32692x1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final float m102183H(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: I */
    private static final void m102184I(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: renamed from: J */
    private static final boolean m102185J(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: K */
    private static final boolean m102186K(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: L */
    private static final InterfaceC4339a m102187L(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC4339a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: M */
    private static final Function1 m102188M(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: N */
    private static final Object m102189N(InterfaceC30468c interfaceC30468c, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, InterfaceC28601c1 interfaceC28601c1, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo93231d = interfaceC30468c.mo93231d(new C11012z(z4, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5), new C32604f(interfaceC28670t2, 6), new C32618h3(3), new C32614h(9, interfaceC28601c1), interfaceC30057d);
        return objMo93231d == EnumC31071a.f128113w ? objMo93231d : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ Object m102190O(InterfaceC30468c interfaceC30468c, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, InterfaceC28601c1 interfaceC28601c1, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 64) != 0) {
            z4 = false;
        }
        return m102189N(interfaceC30468c, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5, interfaceC28601c1, z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m102191P(AbstractC30467b error) {
        AbstractC22676k.m65750j(error, "error");
        f135428a.mo85228t("Speech recognition error: " + error, new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m102192Q(InterfaceC28601c1 interfaceC28601c1, float f13) {
        m102184I(interfaceC28601c1, f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m102193R(boolean z4, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, C29891y result) {
        AbstractC22676k.m65750j(result, "result");
        m102188M(interfaceC28670t2).invoke(result);
        if (z4 && !AbstractC39414r.m125890i0(result.f122125a.f92135x) && m102185J(interfaceC28670t3) && !m102186K(interfaceC28670t4)) {
            m102187L(interfaceC28670t5).invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m102194S(InterfaceC28670t2 interfaceC28670t2, C29891y partial) {
        AbstractC22676k.m65750j(partial, "partial");
        m102188M(interfaceC28670t2).invoke(partial);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final void m102195T(InterfaceC30468c interfaceC30468c, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, boolean z4) {
        interfaceC30468c.stopListening();
        boolean z13 = m102185J(interfaceC28670t2) && !m102186K(interfaceC28670t3);
        if (!z4 || z13) {
            if (z4) {
                m102187L(interfaceC28670t4).invoke();
            }
            m102188M(interfaceC28670t5).invoke(new C29891y(6, "", 0L));
        }
    }

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
    /* JADX INFO: renamed from: o */
    private static final void m102215o(C29891y c29891y, Function1 function1, InterfaceC4339a interfaceC4339a, boolean z4, boolean z13, InterfaceC30468c interfaceC30468c, int i13, InterfaceC4339a interfaceC4339a2, boolean z14, boolean z15, Composer composer, int i14, int i15) {
        int i16;
        int i17;
        boolean z16;
        C28655q c28655q;
        boolean z17;
        boolean z18;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1016085402);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87153g(c29891y) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q2.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 |= (262144 & i14) == 0 ? c28655q2.m87153g(interfaceC30468c) : c28655q2.m87157i(interfaceC30468c) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i17 = i13;
            i16 |= c28655q2.m87149e(i17) ? 1048576 : 524288;
        } else {
            i17 = i13;
        }
        if ((12582912 & i14) == 0) {
            i16 |= c28655q2.m87157i(interfaceC4339a2) ? 8388608 : 4194304;
        }
        int i18 = i15 & 256;
        if (i18 != 0) {
            i16 |= 100663296;
            z16 = z14;
        } else {
            z16 = z14;
            if ((i14 & 100663296) == 0) {
                i16 |= c28655q2.m87155h(z16) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            }
        }
        int i19 = i15 & 512;
        if (i19 != 0) {
            i16 |= 805306368;
        } else if ((i14 & 805306368) == 0) {
            i16 |= c28655q2.m87155h(z15) ? 536870912 : 268435456;
        }
        int i24 = i16;
        if (c28655q2.m87135U(i24 & 1, (i24 & 306783379) != 306783378)) {
            boolean z19 = i18 != 0 ? true : z16;
            boolean z24 = i19 != 0 ? false : z15;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC33745d.m106649h(c28655q2);
            }
            C15247s c15247s = (C15247s) objM87133R2;
            InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
            int i25 = i24 & 1879048192;
            boolean z25 = i25 == 536870912;
            Object objM87133R4 = c28655q2.m87133R();
            if (z25 || objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
            Boolean boolValueOf = Boolean.valueOf(z24);
            Boolean boolValueOf2 = Boolean.valueOf(z19);
            Boolean boolValueOf3 = Boolean.valueOf(m102222v(interfaceC28601c2));
            boolean zM87153g = (i25 == 536870912) | ((i24 & 234881024) == 67108864) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(interfaceC2464x2);
            Object objM87133R6 = c28655q2.m87133R();
            if (zM87153g || objM87133R6 == c28676v0) {
                objM87133R6 = new a(z24, z19, interfaceC2994c0, interfaceC28601c2, interfaceC28601c1, c15247s, interfaceC2464x2, null);
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87255i(boolValueOf, boolValueOf2, boolValueOf3, (InterfaceC4351m) objM87133R6, c28655q2);
            Modifier modifierM3483b = AbstractC1126a.m3483b(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3413j(C2314t.f9131w, 11 * 4, 0.0f, 2)), c15247s);
            Object objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C32614h(8, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R7);
            }
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1131a.m3500d(modifierM3483b, (Function1) objM87133R7), "VoiceInputTextField");
            C38072d c38072d = C38072d.f163053a;
            int i26 = C38072d.f163054b;
            C23285v0 c23285v0M106661t = AbstractC33745d.m106661t(c38072d, c28655q2, i26);
            C15043i8 c15043i8 = C15043i8.f56313a;
            long brandWhite = c38072d.m121949b(c28655q2, i26).getBrandWhite();
            long brandWhite2 = c38072d.m121949b(c28655q2, i26).getBrandWhite();
            long transparent = c38072d.m121949b(c28655q2, i26).getTransparent();
            long transparent2 = c38072d.m121949b(c28655q2, i26).getTransparent();
            long transparent3 = c38072d.m121949b(c28655q2, i26).getTransparent();
            int i27 = 0;
            AbstractC15164u8.m43193b(c29891y, function1, modifierM3599a, z19, c23285v0M106661t, C32651o1.f135393a.m102096b(), AbstractC37817c.m121344e(392234177, c28655q2, new C2614r4(z4, c29891y, z13, interfaceC30468c, interfaceC4339a, interfaceC4339a2, i17, z19)), null, new C34351r0(3, i27, i27, 126), null, 0, 0, interfaceC21083i, C15043i8.m43127e(c28655q2), C15043i8.m43130h(brandWhite, 0L, transparent3, brandWhite2, 0L, transparent, transparent2, 0L, 0L, 0L, 0L, 0L, 0L, c28655q2, 2097042), c28655q2, 817889280 | (i24 & 14) | (i24 & 112) | ((i24 >> 15) & 7168));
            c28655q = c28655q2;
            z18 = z19;
            z17 = z24;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z17 = z15;
            z18 = z16;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32653o3(c29891y, function1, interfaceC4339a, z4, z13, interfaceC30468c, i13, interfaceC4339a2, z18, z17, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m102216p(boolean z4, C29891y c29891y, boolean z13, InterfaceC30468c interfaceC30468c, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, boolean z14, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            boolean zM87155h = c28655q.m87155h(z4) | c28655q.m87153g(c29891y) | c28655q.m87155h(z13) | c28655q.m87157i(interfaceC30468c) | c28655q.m87153g(interfaceC4339a) | c28655q.m87153g(interfaceC4339a2);
            Object objM87133R = c28655q.m87133R();
            if (zM87155h || objM87133R == C28635l.f115821a) {
                objM87133R = new C32594d(z4, c29891y, z13, interfaceC30468c, interfaceC4339a, interfaceC4339a2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC14983d3.m43104a((InterfaceC4339a) objM87133R, null, false, AbstractC37817c.m121344e(871416413, c28655q, new C25513d(i13, z13, z4, c29891y, interfaceC30468c, z14)), c28655q, 24576, 14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m102217q(boolean z4, C29891y c29891y, boolean z13, InterfaceC30468c interfaceC30468c, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        if (z4 || !AbstractC39414r.m125890i0(c29891y.f122125a.f92135x) || z13 || !interfaceC30468c.isAvailable()) {
            interfaceC4339a.invoke();
        } else if (interfaceC30468c.isAvailable()) {
            interfaceC4339a2.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m102218r(int i13, boolean z4, boolean z13, C29891y c29891y, InterfaceC30468c interfaceC30468c, boolean z14, Composer composer, int i14) throws XmlPullParserException, IOException {
        String strM21273g;
        long jM53358D;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3419p = AbstractC1102d.m3419p(5 * 4, C2314t.f9131w);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(i13, c28655q, 6);
            if (z4) {
                c28655q.m87150e0(-87441664);
                strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159631L0, c28655q, 0);
                c28655q.m87173q(false);
            } else if (!z13 && AbstractC39414r.m125890i0(c29891y.f122125a.f92135x) && interfaceC30468c.isAvailable()) {
                c28655q.m87150e0(-87435776);
                strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159627J0, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-87432579);
                strM21273g = AbstractC8693b.m21273g(AbstractC37336b.f159708z0, c28655q, 0);
                c28655q.m87173q(false);
            }
            if (z14) {
                c28655q.m87150e0(-87427897);
                jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-87426812);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            AbstractC15005f3.m43108b(c27430eM107874S, strM21273g, modifierM3419p, jM53358D, c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m102219s(C29891y c29891y, Function1 function1, InterfaceC4339a interfaceC4339a, boolean z4, boolean z13, InterfaceC30468c interfaceC30468c, int i13, InterfaceC4339a interfaceC4339a2, boolean z14, boolean z15, int i14, int i15, Composer composer, int i16) {
        m102215o(c29891y, function1, interfaceC4339a, z4, z13, interfaceC30468c, i13, interfaceC4339a2, z14, z15, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final boolean m102220t(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m102221u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final boolean m102222v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m102223w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m102224x(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        m102223w(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0161  */
    /* JADX WARN: Code duplicated, block: B:117:0x0198  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:138:0x0206  */
    /* JADX WARN: Code duplicated, block: B:141:0x020e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0213  */
    /* JADX WARN: Code duplicated, block: B:148:0x022f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0234  */
    /* JADX WARN: Code duplicated, block: B:152:0x0238  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:161:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x0269  */
    /* JADX WARN: Code duplicated, block: B:167:0x0295  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:182:0x0305  */
    /* JADX WARN: Code duplicated, block: B:188:0x0312  */
    /* JADX WARN: Code duplicated, block: B:191:0x0334 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x033a  */
    /* JADX WARN: Code duplicated, block: B:197:0x034c  */
    /* JADX WARN: Code duplicated, block: B:198:0x034f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0393  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0122  */
    /* JADX INFO: renamed from: y */
    public static final void m102225y(int i13, Function1 onTextUpdated, C29891y textFieldValue, InterfaceC4339a onSend, boolean z4, boolean z13, InterfaceC30468c speechRecognitionManager, boolean z14, boolean z15, EnumC32692x1 enumC32692x1, Composer composer, int i14, int i15) {
        int i16;
        boolean z16;
        boolean z17;
        int i17;
        int i18;
        int i19;
        int iOrdinal;
        int i24;
        int i25;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        EnumC32692x1 enumC32692x2;
        C28677v1 c28677v1M87180u;
        boolean z26;
        boolean z27;
        EnumC32692x1 enumC32692x3;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC2994c0 interfaceC2994c0;
        InterfaceC28601c1 interfaceC28601c1M87261o;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        InterfaceC28601c1 interfaceC28601c1M87238F2;
        InterfaceC28601c1 interfaceC28601c1M87238F3;
        int i26;
        InterfaceC28601c1 interfaceC28601c1M87238F4;
        int i27;
        boolean z28;
        boolean zM87153g;
        InterfaceC2994c0 interfaceC2994c1;
        Object c3424a0;
        int i28;
        InterfaceC28601c1 interfaceC28601c2;
        C16351i c16351iM118972a0;
        boolean z29;
        Object objM87133R3;
        C28676v0 c28676v1;
        int i29;
        boolean z34;
        boolean z35;
        boolean zM87157i;
        Object bVar;
        C16351i c16351i;
        int i34;
        C28676v0 c28676v2;
        EnumC32692x1 enumC32692x4;
        boolean z36;
        boolean z37;
        boolean zM87157i2;
        Object objM87133R4;
        boolean z38;
        boolean z39;
        C28655q c28655q;
        boolean z44;
        boolean zM87153g2;
        Object objM87133R5;
        AbstractC22676k.m65750j(onTextUpdated, "onTextUpdated");
        AbstractC22676k.m65750j(textFieldValue, "textFieldValue");
        AbstractC22676k.m65750j(onSend, "onSend");
        AbstractC22676k.m65750j(speechRecognitionManager, "speechRecognitionManager");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1323656790);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87157i(onTextUpdated) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87153g(textFieldValue) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87157i(onSend) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            z16 = z13;
            i16 |= c28655q2.m87155h(z16) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            z16 = z13;
        }
        if ((1572864 & i14) == 0) {
            i16 |= (i14 & 2097152) == 0 ? c28655q2.m87153g(speechRecognitionManager) : c28655q2.m87157i(speechRecognitionManager) ? 1048576 : 524288;
        }
        int i35 = i15 & 128;
        if (i35 == 0) {
            if ((12582912 & i14) == 0) {
                z17 = z14;
                i16 |= c28655q2.m87155h(z17) ? 8388608 : 4194304;
            }
            i17 = i15 & 256;
            if (i17 != 0) {
                if ((100663296 & i14) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i18 = 67108864;
                    } else {
                        i18 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 512;
                if (i19 != 0) {
                    i16 |= 805306368;
                } else if ((i14 & 805306368) == 0) {
                    if (enumC32692x1 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC32692x1.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i16 |= i24;
                }
                i25 = i16;
                z18 = true;
                if ((i25 & 306783379) != 306783378) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (c28655q2.m87135U(i25 & 1, z19)) {
                    if (i35 != 0) {
                        z26 = true;
                    } else {
                        z26 = z17;
                    }
                    if (i17 != 0) {
                        z27 = true;
                    } else {
                        z27 = z15;
                    }
                    if (i19 != 0) {
                        enumC32692x3 = EnumC32692x1.NONE;
                    } else {
                        enumC32692x3 = enumC32692x1;
                    }
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(speechRecognitionManager.getIsListening(), c28655q2, 0);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC3855a.m11831o(0.0f, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(Boolean.valueOf(z27), c28655q2);
                    interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Boolean.valueOf(z16), c28655q2);
                    interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(onSend, c28655q2);
                    i26 = i25 >> 3;
                    interfaceC28601c1M87238F4 = AbstractC28683x.m87238F(onTextUpdated, c28655q2);
                    ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
                    boolean zM87157i3 = c28655q2.m87157i(interfaceC2994c0);
                    i27 = i25 & 3670016;
                    if (i27 != 1048576 || ((i25 & 2097152) != 0 && c28655q2.m87157i(speechRecognitionManager))) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    zM87153g = zM87157i3 | z28 | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    Object objM87133R6 = c28655q2.m87133R();
                    if (!zM87153g || objM87133R6 == c28676v0) {
                        interfaceC2994c1 = interfaceC2994c0;
                        i28 = 1048576;
                        c3424a0 = new C3424a0((Object) interfaceC2994c1, (Object) speechRecognitionManager, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1, 12);
                        interfaceC28601c2 = interfaceC28601c1;
                        interfaceC28601c1M87238F3 = interfaceC28601c1M87238F3;
                        interfaceC28601c1M87238F2 = interfaceC28601c1M87238F2;
                        interfaceC28601c1M87238F = interfaceC28601c1M87238F;
                        c28655q2.m87172p0(c3424a0);
                    } else {
                        interfaceC2994c1 = interfaceC2994c0;
                        i28 = 1048576;
                        c3424a0 = objM87133R6;
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission, (Function1) c3424a0, c28655q2, 0);
                    if (i27 != i28 || ((i25 & 2097152) != 0 && c28655q2.m87157i(speechRecognitionManager))) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z29) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R3 == c28676v1) {
                        }
                        i29 = i25 >> 18;
                        AbstractC28683x.m87251e(speechRecognitionManager, (Function1) objM87133R3, c28655q2);
                        if ((i25 & 1879048192) == 536870912) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        if (i27 != 1048576 || ((i25 & 2097152) != 0 && c28655q2.m87157i(speechRecognitionManager))) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        zM87157i = z34 | z35 | c28655q2.m87157i(c16351iM118972a0) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                        Object objM87133R7 = c28655q2.m87133R();
                        if (!zM87157i || objM87133R7 == c28676v1) {
                            c16351i = c16351iM118972a0;
                            i34 = i27;
                            EnumC32692x1 enumC32692x5 = enumC32692x3;
                            c28676v2 = c28676v1;
                            bVar = new b(enumC32692x5, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                            enumC32692x4 = enumC32692x5;
                            c28655q2.m87172p0(bVar);
                        } else {
                            c28676v2 = c28676v1;
                            bVar = objM87133R7;
                            c16351i = c16351iM118972a0;
                            i34 = i27;
                            enumC32692x4 = enumC32692x3;
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, enumC32692x4);
                        if (m102177B(interfaceC28601c1M87261o)) {
                            c28655q2.m87150e0(-961449571);
                            float fM102183H = m102183H(interfaceC28601c2);
                            if (i34 != 1048576 && ((i25 & 2097152) == 0 || !c28655q2.m87157i(speechRecognitionManager))) {
                                z18 = false;
                            }
                            zM87153g2 = z18 | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4);
                            objM87133R5 = c28655q2.m87133R();
                            if (zM87153g2 || objM87133R5 == c28676v2) {
                                objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            c28655q = c28655q2;
                            boolean z45 = z26;
                            AbstractC32648n3.m102044f(fM102183H, z45, null, 0.0f, (Function1) objM87133R5, c28655q, i29 & 112, 12);
                            z36 = z45;
                            c28655q2.m87173q(false);
                            z44 = z27;
                        } else {
                            z36 = z26;
                            c28655q2.m87150e0(-961276777);
                            boolean zM87157i4 = c28655q2.m87157i(interfaceC2994c1);
                            if (i34 != 1048576 || ((i25 & 2097152) != 0 && c28655q2.m87157i(speechRecognitionManager))) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            zM87157i2 = z37 | zM87157i4 | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                            objM87133R4 = c28655q2.m87133R();
                            if (!zM87157i2 || objM87133R4 == c28676v2) {
                                z38 = false;
                                objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                                c28655q2.m87172p0(objM87133R4);
                            } else {
                                z38 = false;
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                            if (enumC32692x4 == EnumC32692x1.KEYBOARD) {
                                z39 = true;
                            } else {
                                z39 = z38;
                            }
                            c28655q = c28655q2;
                            z44 = z27;
                            m102215o(textFieldValue, onTextUpdated, onSend, z4, z13, speechRecognitionManager, i13, interfaceC4339a, z44, z39, c28655q, ((i25 >> 6) & 14) | (i25 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | ((i25 << 18) & 3670016) | (i25 & 234881024), 0);
                            c28655q.m87173q(z38);
                        }
                        z24 = z44;
                        c28655q2 = c28655q;
                        enumC32692x2 = enumC32692x4;
                        z25 = z36;
                    }
                    objM87133R3 = new C32604f(speechRecognitionManager, 5);
                    c28655q2.m87172p0(objM87133R3);
                    i29 = i25 >> 18;
                    AbstractC28683x.m87251e(speechRecognitionManager, (Function1) objM87133R3, c28655q2);
                    if ((i25 & 1879048192) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    if (i27 != 1048576) {
                        z35 = true;
                    } else {
                        z35 = true;
                    }
                    zM87157i = z34 | z35 | c28655q2.m87157i(c16351iM118972a0) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    Object objM87133R8 = c28655q2.m87133R();
                    if (zM87157i) {
                        c16351i = c16351iM118972a0;
                        i34 = i27;
                        EnumC32692x1 enumC32692x6 = enumC32692x3;
                        c28676v2 = c28676v1;
                        bVar = new b(enumC32692x6, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                        enumC32692x4 = enumC32692x6;
                        c28655q2.m87172p0(bVar);
                    } else {
                        c16351i = c16351iM118972a0;
                        i34 = i27;
                        EnumC32692x1 enumC32692x7 = enumC32692x3;
                        c28676v2 = c28676v1;
                        bVar = new b(enumC32692x7, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                        enumC32692x4 = enumC32692x7;
                        c28655q2.m87172p0(bVar);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, enumC32692x4);
                    if (m102177B(interfaceC28601c1M87261o)) {
                        c28655q2.m87150e0(-961449571);
                        float fM102183H2 = m102183H(interfaceC28601c2);
                        if (i34 != 1048576) {
                            z18 = false;
                        }
                        zM87153g2 = z18 | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        c28655q = c28655q2;
                        boolean z46 = z26;
                        AbstractC32648n3.m102044f(fM102183H2, z46, null, 0.0f, (Function1) objM87133R5, c28655q, i29 & 112, 12);
                        z36 = z46;
                        c28655q2.m87173q(false);
                        z44 = z27;
                    } else {
                        z36 = z26;
                        c28655q2.m87150e0(-961276777);
                        boolean zM87157i5 = c28655q2.m87157i(interfaceC2994c1);
                        if (i34 != 1048576) {
                            z37 = true;
                        } else {
                            z37 = true;
                        }
                        zM87157i2 = z37 | zM87157i5 | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i2) {
                            z38 = false;
                            objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            z38 = false;
                            objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        if (enumC32692x4 == EnumC32692x1.KEYBOARD) {
                            z39 = true;
                        } else {
                            z39 = z38;
                        }
                        c28655q = c28655q2;
                        z44 = z27;
                        m102215o(textFieldValue, onTextUpdated, onSend, z4, z13, speechRecognitionManager, i13, interfaceC4339a2, z44, z39, c28655q, ((i25 >> 6) & 14) | (i25 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | ((i25 << 18) & 3670016) | (i25 & 234881024), 0);
                        c28655q.m87173q(z38);
                    }
                    z24 = z44;
                    c28655q2 = c28655q;
                    enumC32692x2 = enumC32692x4;
                    z25 = z36;
                } else {
                    c28655q2.m87138X();
                    z24 = z15;
                    z25 = z17;
                    enumC32692x2 = enumC32692x1;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32653o3(i13, onTextUpdated, textFieldValue, onSend, z4, z13, speechRecognitionManager, z25, z24, enumC32692x2, i14, i15);
                }
            }
            i16 |= 100663296;
            i19 = i15 & 512;
            if (i19 != 0) {
                i16 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                if (enumC32692x1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC32692x1.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i16 |= i24;
            }
            i25 = i16;
            z18 = true;
            if ((i25 & 306783379) != 306783378) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q2.m87135U(i25 & 1, z19)) {
                if (i35 != 0) {
                    z26 = true;
                } else {
                    z26 = z17;
                }
                if (i17 != 0) {
                    z27 = true;
                } else {
                    z27 = z15;
                }
                if (i19 != 0) {
                    enumC32692x3 = EnumC32692x1.NONE;
                } else {
                    enumC32692x3 = enumC32692x1;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(speechRecognitionManager.getIsListening(), c28655q2, 0);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC3855a.m11831o(0.0f, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(Boolean.valueOf(z27), c28655q2);
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Boolean.valueOf(z16), c28655q2);
                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(onSend, c28655q2);
                i26 = i25 >> 3;
                interfaceC28601c1M87238F4 = AbstractC28683x.m87238F(onTextUpdated, c28655q2);
                ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission2 = new ActivityResultContracts$RequestPermission();
                boolean zM87157i6 = c28655q2.m87157i(interfaceC2994c0);
                i27 = i25 & 3670016;
                if (i27 != 1048576) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                zM87153g = zM87157i6 | z28 | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                Object objM87133R9 = c28655q2.m87133R();
                if (zM87153g) {
                    interfaceC2994c1 = interfaceC2994c0;
                    i28 = 1048576;
                    c3424a0 = new C3424a0((Object) interfaceC2994c1, (Object) speechRecognitionManager, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1, 12);
                    interfaceC28601c2 = interfaceC28601c1;
                    interfaceC28601c1M87238F3 = interfaceC28601c1M87238F3;
                    interfaceC28601c1M87238F2 = interfaceC28601c1M87238F2;
                    interfaceC28601c1M87238F = interfaceC28601c1M87238F;
                    c28655q2.m87172p0(c3424a0);
                } else {
                    interfaceC2994c1 = interfaceC2994c0;
                    i28 = 1048576;
                    c3424a0 = new C3424a0((Object) interfaceC2994c1, (Object) speechRecognitionManager, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1, 12);
                    interfaceC28601c2 = interfaceC28601c1;
                    interfaceC28601c1M87238F3 = interfaceC28601c1M87238F3;
                    interfaceC28601c1M87238F2 = interfaceC28601c1M87238F2;
                    interfaceC28601c1M87238F = interfaceC28601c1M87238F;
                    c28655q2.m87172p0(c3424a0);
                }
                c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission2, (Function1) c3424a0, c28655q2, 0);
                if (i27 != i28) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z29) {
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                    }
                    i29 = i25 >> 18;
                    AbstractC28683x.m87251e(speechRecognitionManager, (Function1) objM87133R3, c28655q2);
                    if ((i25 & 1879048192) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    if (i27 != 1048576) {
                        z35 = true;
                    } else {
                        z35 = true;
                    }
                    zM87157i = z34 | z35 | c28655q2.m87157i(c16351iM118972a0) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    Object objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        c16351i = c16351iM118972a0;
                        i34 = i27;
                        EnumC32692x1 enumC32692x8 = enumC32692x3;
                        c28676v2 = c28676v1;
                        bVar = new b(enumC32692x8, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                        enumC32692x4 = enumC32692x8;
                        c28655q2.m87172p0(bVar);
                    } else {
                        c16351i = c16351iM118972a0;
                        i34 = i27;
                        EnumC32692x1 enumC32692x9 = enumC32692x3;
                        c28676v2 = c28676v1;
                        bVar = new b(enumC32692x9, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                        enumC32692x4 = enumC32692x9;
                        c28655q2.m87172p0(bVar);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, enumC32692x4);
                    if (m102177B(interfaceC28601c1M87261o)) {
                        c28655q2.m87150e0(-961449571);
                        float fM102183H3 = m102183H(interfaceC28601c2);
                        if (i34 != 1048576) {
                            z18 = false;
                        }
                        zM87153g2 = z18 | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        c28655q = c28655q2;
                        boolean z47 = z26;
                        AbstractC32648n3.m102044f(fM102183H3, z47, null, 0.0f, (Function1) objM87133R5, c28655q, i29 & 112, 12);
                        z36 = z47;
                        c28655q2.m87173q(false);
                        z44 = z27;
                    } else {
                        z36 = z26;
                        c28655q2.m87150e0(-961276777);
                        boolean zM87157i7 = c28655q2.m87157i(interfaceC2994c1);
                        if (i34 != 1048576) {
                            z37 = true;
                        } else {
                            z37 = true;
                        }
                        zM87157i2 = z37 | zM87157i7 | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i2) {
                            z38 = false;
                            objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            z38 = false;
                            objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                        if (enumC32692x4 == EnumC32692x1.KEYBOARD) {
                            z39 = true;
                        } else {
                            z39 = z38;
                        }
                        c28655q = c28655q2;
                        z44 = z27;
                        m102215o(textFieldValue, onTextUpdated, onSend, z4, z13, speechRecognitionManager, i13, interfaceC4339a3, z44, z39, c28655q, ((i25 >> 6) & 14) | (i25 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | ((i25 << 18) & 3670016) | (i25 & 234881024), 0);
                        c28655q.m87173q(z38);
                    }
                    z24 = z44;
                    c28655q2 = c28655q;
                    enumC32692x2 = enumC32692x4;
                    z25 = z36;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R3 = new C32604f(speechRecognitionManager, 5);
                c28655q2.m87172p0(objM87133R3);
                i29 = i25 >> 18;
                AbstractC28683x.m87251e(speechRecognitionManager, (Function1) objM87133R3, c28655q2);
                if ((i25 & 1879048192) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if (i27 != 1048576) {
                    z35 = true;
                } else {
                    z35 = true;
                }
                zM87157i = z34 | z35 | c28655q2.m87157i(c16351iM118972a0) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                Object objM87133R11 = c28655q2.m87133R();
                if (zM87157i) {
                    c16351i = c16351iM118972a0;
                    i34 = i27;
                    EnumC32692x1 enumC32692x10 = enumC32692x3;
                    c28676v2 = c28676v1;
                    bVar = new b(enumC32692x10, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                    enumC32692x4 = enumC32692x10;
                    c28655q2.m87172p0(bVar);
                } else {
                    c16351i = c16351iM118972a0;
                    i34 = i27;
                    EnumC32692x1 enumC32692x11 = enumC32692x3;
                    c28676v2 = c28676v1;
                    bVar = new b(enumC32692x11, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                    enumC32692x4 = enumC32692x11;
                    c28655q2.m87172p0(bVar);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, enumC32692x4);
                if (m102177B(interfaceC28601c1M87261o)) {
                    c28655q2.m87150e0(-961449571);
                    float fM102183H4 = m102183H(interfaceC28601c2);
                    if (i34 != 1048576) {
                        z18 = false;
                    }
                    zM87153g2 = z18 | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    c28655q = c28655q2;
                    boolean z48 = z26;
                    AbstractC32648n3.m102044f(fM102183H4, z48, null, 0.0f, (Function1) objM87133R5, c28655q, i29 & 112, 12);
                    z36 = z48;
                    c28655q2.m87173q(false);
                    z44 = z27;
                } else {
                    z36 = z26;
                    c28655q2.m87150e0(-961276777);
                    boolean zM87157i8 = c28655q2.m87157i(interfaceC2994c1);
                    if (i34 != 1048576) {
                        z37 = true;
                    } else {
                        z37 = true;
                    }
                    zM87157i2 = z37 | zM87157i8 | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i2) {
                        z38 = false;
                        objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        z38 = false;
                        objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    if (enumC32692x4 == EnumC32692x1.KEYBOARD) {
                        z39 = true;
                    } else {
                        z39 = z38;
                    }
                    c28655q = c28655q2;
                    z44 = z27;
                    m102215o(textFieldValue, onTextUpdated, onSend, z4, z13, speechRecognitionManager, i13, interfaceC4339a4, z44, z39, c28655q, ((i25 >> 6) & 14) | (i25 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | ((i25 << 18) & 3670016) | (i25 & 234881024), 0);
                    c28655q.m87173q(z38);
                }
                z24 = z44;
                c28655q2 = c28655q;
                enumC32692x2 = enumC32692x4;
                z25 = z36;
            } else {
                c28655q2.m87138X();
                z24 = z15;
                z25 = z17;
                enumC32692x2 = enumC32692x1;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32653o3(i13, onTextUpdated, textFieldValue, onSend, z4, z13, speechRecognitionManager, z25, z24, enumC32692x2, i14, i15);
            }
        }
        i16 |= 12582912;
        z17 = z14;
        i17 = i15 & 256;
        if (i17 != 0) {
            if ((100663296 & i14) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i18 = 67108864;
                } else {
                    i18 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i18;
            }
            i19 = i15 & 512;
            if (i19 != 0) {
                i16 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                if (enumC32692x1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC32692x1.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i16 |= i24;
            }
            i25 = i16;
            z18 = true;
            if ((i25 & 306783379) != 306783378) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (c28655q2.m87135U(i25 & 1, z19)) {
                if (i35 != 0) {
                    z26 = true;
                } else {
                    z26 = z17;
                }
                if (i17 != 0) {
                    z27 = true;
                } else {
                    z27 = z15;
                }
                if (i19 != 0) {
                    enumC32692x3 = EnumC32692x1.NONE;
                } else {
                    enumC32692x3 = enumC32692x1;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(speechRecognitionManager.getIsListening(), c28655q2, 0);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC3855a.m11831o(0.0f, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(Boolean.valueOf(z27), c28655q2);
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Boolean.valueOf(z16), c28655q2);
                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(onSend, c28655q2);
                i26 = i25 >> 3;
                interfaceC28601c1M87238F4 = AbstractC28683x.m87238F(onTextUpdated, c28655q2);
                ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission3 = new ActivityResultContracts$RequestPermission();
                boolean zM87157i9 = c28655q2.m87157i(interfaceC2994c0);
                i27 = i25 & 3670016;
                if (i27 != 1048576) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                zM87153g = zM87157i9 | z28 | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                Object objM87133R12 = c28655q2.m87133R();
                if (zM87153g) {
                    interfaceC2994c1 = interfaceC2994c0;
                    i28 = 1048576;
                    c3424a0 = new C3424a0((Object) interfaceC2994c1, (Object) speechRecognitionManager, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1, 12);
                    interfaceC28601c2 = interfaceC28601c1;
                    interfaceC28601c1M87238F3 = interfaceC28601c1M87238F3;
                    interfaceC28601c1M87238F2 = interfaceC28601c1M87238F2;
                    interfaceC28601c1M87238F = interfaceC28601c1M87238F;
                    c28655q2.m87172p0(c3424a0);
                } else {
                    interfaceC2994c1 = interfaceC2994c0;
                    i28 = 1048576;
                    c3424a0 = new C3424a0((Object) interfaceC2994c1, (Object) speechRecognitionManager, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1, 12);
                    interfaceC28601c2 = interfaceC28601c1;
                    interfaceC28601c1M87238F3 = interfaceC28601c1M87238F3;
                    interfaceC28601c1M87238F2 = interfaceC28601c1M87238F2;
                    interfaceC28601c1M87238F = interfaceC28601c1M87238F;
                    c28655q2.m87172p0(c3424a0);
                }
                c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission3, (Function1) c3424a0, c28655q2, 0);
                if (i27 != i28) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z29) {
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                    }
                    i29 = i25 >> 18;
                    AbstractC28683x.m87251e(speechRecognitionManager, (Function1) objM87133R3, c28655q2);
                    if ((i25 & 1879048192) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    if (i27 != 1048576) {
                        z35 = true;
                    } else {
                        z35 = true;
                    }
                    zM87157i = z34 | z35 | c28655q2.m87157i(c16351iM118972a0) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    Object objM87133R13 = c28655q2.m87133R();
                    if (zM87157i) {
                        c16351i = c16351iM118972a0;
                        i34 = i27;
                        EnumC32692x1 enumC32692x12 = enumC32692x3;
                        c28676v2 = c28676v1;
                        bVar = new b(enumC32692x12, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                        enumC32692x4 = enumC32692x12;
                        c28655q2.m87172p0(bVar);
                    } else {
                        c16351i = c16351iM118972a0;
                        i34 = i27;
                        EnumC32692x1 enumC32692x13 = enumC32692x3;
                        c28676v2 = c28676v1;
                        bVar = new b(enumC32692x13, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                        enumC32692x4 = enumC32692x13;
                        c28655q2.m87172p0(bVar);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, enumC32692x4);
                    if (m102177B(interfaceC28601c1M87261o)) {
                        c28655q2.m87150e0(-961449571);
                        float fM102183H5 = m102183H(interfaceC28601c2);
                        if (i34 != 1048576) {
                            z18 = false;
                        }
                        zM87153g2 = z18 | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        c28655q = c28655q2;
                        boolean z49 = z26;
                        AbstractC32648n3.m102044f(fM102183H5, z49, null, 0.0f, (Function1) objM87133R5, c28655q, i29 & 112, 12);
                        z36 = z49;
                        c28655q2.m87173q(false);
                        z44 = z27;
                    } else {
                        z36 = z26;
                        c28655q2.m87150e0(-961276777);
                        boolean zM87157i10 = c28655q2.m87157i(interfaceC2994c1);
                        if (i34 != 1048576) {
                            z37 = true;
                        } else {
                            z37 = true;
                        }
                        zM87157i2 = z37 | zM87157i10 | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i2) {
                            z38 = false;
                            objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            z38 = false;
                            objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R4;
                        if (enumC32692x4 == EnumC32692x1.KEYBOARD) {
                            z39 = true;
                        } else {
                            z39 = z38;
                        }
                        c28655q = c28655q2;
                        z44 = z27;
                        m102215o(textFieldValue, onTextUpdated, onSend, z4, z13, speechRecognitionManager, i13, interfaceC4339a5, z44, z39, c28655q, ((i25 >> 6) & 14) | (i25 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | ((i25 << 18) & 3670016) | (i25 & 234881024), 0);
                        c28655q.m87173q(z38);
                    }
                    z24 = z44;
                    c28655q2 = c28655q;
                    enumC32692x2 = enumC32692x4;
                    z25 = z36;
                } else {
                    c28676v1 = c28676v0;
                }
                objM87133R3 = new C32604f(speechRecognitionManager, 5);
                c28655q2.m87172p0(objM87133R3);
                i29 = i25 >> 18;
                AbstractC28683x.m87251e(speechRecognitionManager, (Function1) objM87133R3, c28655q2);
                if ((i25 & 1879048192) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if (i27 != 1048576) {
                    z35 = true;
                } else {
                    z35 = true;
                }
                zM87157i = z34 | z35 | c28655q2.m87157i(c16351iM118972a0) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                Object objM87133R14 = c28655q2.m87133R();
                if (zM87157i) {
                    c16351i = c16351iM118972a0;
                    i34 = i27;
                    EnumC32692x1 enumC32692x14 = enumC32692x3;
                    c28676v2 = c28676v1;
                    bVar = new b(enumC32692x14, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                    enumC32692x4 = enumC32692x14;
                    c28655q2.m87172p0(bVar);
                } else {
                    c16351i = c16351iM118972a0;
                    i34 = i27;
                    EnumC32692x1 enumC32692x15 = enumC32692x3;
                    c28676v2 = c28676v1;
                    bVar = new b(enumC32692x15, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                    enumC32692x4 = enumC32692x15;
                    c28655q2.m87172p0(bVar);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, enumC32692x4);
                if (m102177B(interfaceC28601c1M87261o)) {
                    c28655q2.m87150e0(-961449571);
                    float fM102183H6 = m102183H(interfaceC28601c2);
                    if (i34 != 1048576) {
                        z18 = false;
                    }
                    zM87153g2 = z18 | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    c28655q = c28655q2;
                    boolean z410 = z26;
                    AbstractC32648n3.m102044f(fM102183H6, z410, null, 0.0f, (Function1) objM87133R5, c28655q, i29 & 112, 12);
                    z36 = z410;
                    c28655q2.m87173q(false);
                    z44 = z27;
                } else {
                    z36 = z26;
                    c28655q2.m87150e0(-961276777);
                    boolean zM87157i11 = c28655q2.m87157i(interfaceC2994c1);
                    if (i34 != 1048576) {
                        z37 = true;
                    } else {
                        z37 = true;
                    }
                    zM87157i2 = z37 | zM87157i11 | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i2) {
                        z38 = false;
                        objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        z38 = false;
                        objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R4;
                    if (enumC32692x4 == EnumC32692x1.KEYBOARD) {
                        z39 = true;
                    } else {
                        z39 = z38;
                    }
                    c28655q = c28655q2;
                    z44 = z27;
                    m102215o(textFieldValue, onTextUpdated, onSend, z4, z13, speechRecognitionManager, i13, interfaceC4339a6, z44, z39, c28655q, ((i25 >> 6) & 14) | (i25 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | ((i25 << 18) & 3670016) | (i25 & 234881024), 0);
                    c28655q.m87173q(z38);
                }
                z24 = z44;
                c28655q2 = c28655q;
                enumC32692x2 = enumC32692x4;
                z25 = z36;
            } else {
                c28655q2.m87138X();
                z24 = z15;
                z25 = z17;
                enumC32692x2 = enumC32692x1;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32653o3(i13, onTextUpdated, textFieldValue, onSend, z4, z13, speechRecognitionManager, z25, z24, enumC32692x2, i14, i15);
            }
        }
        i16 |= 100663296;
        i19 = i15 & 512;
        if (i19 != 0) {
            i16 |= 805306368;
        } else if ((i14 & 805306368) == 0) {
            if (enumC32692x1 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC32692x1.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i24 = 536870912;
            } else {
                i24 = 268435456;
            }
            i16 |= i24;
        }
        i25 = i16;
        z18 = true;
        if ((i25 & 306783379) != 306783378) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (c28655q2.m87135U(i25 & 1, z19)) {
            if (i35 != 0) {
                z26 = true;
            } else {
                z26 = z17;
            }
            if (i17 != 0) {
                z27 = true;
            } else {
                z27 = z15;
            }
            if (i19 != 0) {
                enumC32692x3 = EnumC32692x1.NONE;
            } else {
                enumC32692x3 = enumC32692x1;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            interfaceC28601c1M87261o = AbstractC28683x.m87261o(speechRecognitionManager.getIsListening(), c28655q2, 0);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC3855a.m11831o(0.0f, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(Boolean.valueOf(z27), c28655q2);
            interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Boolean.valueOf(z16), c28655q2);
            interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(onSend, c28655q2);
            i26 = i25 >> 3;
            interfaceC28601c1M87238F4 = AbstractC28683x.m87238F(onTextUpdated, c28655q2);
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission4 = new ActivityResultContracts$RequestPermission();
            boolean zM87157i12 = c28655q2.m87157i(interfaceC2994c0);
            i27 = i25 & 3670016;
            if (i27 != 1048576) {
                z28 = true;
            } else {
                z28 = true;
            }
            zM87153g = zM87157i12 | z28 | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
            Object objM87133R15 = c28655q2.m87133R();
            if (zM87153g) {
                interfaceC2994c1 = interfaceC2994c0;
                i28 = 1048576;
                c3424a0 = new C3424a0((Object) interfaceC2994c1, (Object) speechRecognitionManager, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1, 12);
                interfaceC28601c2 = interfaceC28601c1;
                interfaceC28601c1M87238F3 = interfaceC28601c1M87238F3;
                interfaceC28601c1M87238F2 = interfaceC28601c1M87238F2;
                interfaceC28601c1M87238F = interfaceC28601c1M87238F;
                c28655q2.m87172p0(c3424a0);
            } else {
                interfaceC2994c1 = interfaceC2994c0;
                i28 = 1048576;
                c3424a0 = new C3424a0((Object) interfaceC2994c1, (Object) speechRecognitionManager, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1, 12);
                interfaceC28601c2 = interfaceC28601c1;
                interfaceC28601c1M87238F3 = interfaceC28601c1M87238F3;
                interfaceC28601c1M87238F2 = interfaceC28601c1M87238F2;
                interfaceC28601c1M87238F = interfaceC28601c1M87238F;
                c28655q2.m87172p0(c3424a0);
            }
            c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission4, (Function1) c3424a0, c28655q2, 0);
            if (i27 != i28) {
                z29 = true;
            } else {
                z29 = true;
            }
            objM87133R3 = c28655q2.m87133R();
            if (z29) {
                c28676v1 = c28676v0;
                if (objM87133R3 == c28676v1) {
                }
                i29 = i25 >> 18;
                AbstractC28683x.m87251e(speechRecognitionManager, (Function1) objM87133R3, c28655q2);
                if ((i25 & 1879048192) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if (i27 != 1048576) {
                    z35 = true;
                } else {
                    z35 = true;
                }
                zM87157i = z34 | z35 | c28655q2.m87157i(c16351iM118972a0) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                Object objM87133R16 = c28655q2.m87133R();
                if (zM87157i) {
                    c16351i = c16351iM118972a0;
                    i34 = i27;
                    EnumC32692x1 enumC32692x16 = enumC32692x3;
                    c28676v2 = c28676v1;
                    bVar = new b(enumC32692x16, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                    enumC32692x4 = enumC32692x16;
                    c28655q2.m87172p0(bVar);
                } else {
                    c16351i = c16351iM118972a0;
                    i34 = i27;
                    EnumC32692x1 enumC32692x17 = enumC32692x3;
                    c28676v2 = c28676v1;
                    bVar = new b(enumC32692x17, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                    enumC32692x4 = enumC32692x17;
                    c28655q2.m87172p0(bVar);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, enumC32692x4);
                if (m102177B(interfaceC28601c1M87261o)) {
                    c28655q2.m87150e0(-961449571);
                    float fM102183H7 = m102183H(interfaceC28601c2);
                    if (i34 != 1048576) {
                        z18 = false;
                    }
                    zM87153g2 = z18 | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    c28655q = c28655q2;
                    boolean z411 = z26;
                    AbstractC32648n3.m102044f(fM102183H7, z411, null, 0.0f, (Function1) objM87133R5, c28655q, i29 & 112, 12);
                    z36 = z411;
                    c28655q2.m87173q(false);
                    z44 = z27;
                } else {
                    z36 = z26;
                    c28655q2.m87150e0(-961276777);
                    boolean zM87157i13 = c28655q2.m87157i(interfaceC2994c1);
                    if (i34 != 1048576) {
                        z37 = true;
                    } else {
                        z37 = true;
                    }
                    zM87157i2 = z37 | zM87157i13 | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i2) {
                        z38 = false;
                        objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        z38 = false;
                        objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R4;
                    if (enumC32692x4 == EnumC32692x1.KEYBOARD) {
                        z39 = true;
                    } else {
                        z39 = z38;
                    }
                    c28655q = c28655q2;
                    z44 = z27;
                    m102215o(textFieldValue, onTextUpdated, onSend, z4, z13, speechRecognitionManager, i13, interfaceC4339a7, z44, z39, c28655q, ((i25 >> 6) & 14) | (i25 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | ((i25 << 18) & 3670016) | (i25 & 234881024), 0);
                    c28655q.m87173q(z38);
                }
                z24 = z44;
                c28655q2 = c28655q;
                enumC32692x2 = enumC32692x4;
                z25 = z36;
            } else {
                c28676v1 = c28676v0;
            }
            objM87133R3 = new C32604f(speechRecognitionManager, 5);
            c28655q2.m87172p0(objM87133R3);
            i29 = i25 >> 18;
            AbstractC28683x.m87251e(speechRecognitionManager, (Function1) objM87133R3, c28655q2);
            if ((i25 & 1879048192) == 536870912) {
                z34 = true;
            } else {
                z34 = false;
            }
            if (i27 != 1048576) {
                z35 = true;
            } else {
                z35 = true;
            }
            zM87157i = z34 | z35 | c28655q2.m87157i(c16351iM118972a0) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
            Object objM87133R17 = c28655q2.m87133R();
            if (zM87157i) {
                c16351i = c16351iM118972a0;
                i34 = i27;
                EnumC32692x1 enumC32692x18 = enumC32692x3;
                c28676v2 = c28676v1;
                bVar = new b(enumC32692x18, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                enumC32692x4 = enumC32692x18;
                c28655q2.m87172p0(bVar);
            } else {
                c16351i = c16351iM118972a0;
                i34 = i27;
                EnumC32692x1 enumC32692x19 = enumC32692x3;
                c28676v2 = c28676v1;
                bVar = new b(enumC32692x19, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2, null);
                enumC32692x4 = enumC32692x19;
                c28655q2.m87172p0(bVar);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) bVar, enumC32692x4);
            if (m102177B(interfaceC28601c1M87261o)) {
                c28655q2.m87150e0(-961449571);
                float fM102183H8 = m102183H(interfaceC28601c2);
                if (i34 != 1048576) {
                    z18 = false;
                }
                zM87153g2 = z18 | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4);
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C29440d(speechRecognitionManager, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4);
                    c28655q2.m87172p0(objM87133R5);
                }
                c28655q = c28655q2;
                boolean z412 = z26;
                AbstractC32648n3.m102044f(fM102183H8, z412, null, 0.0f, (Function1) objM87133R5, c28655q, i29 & 112, 12);
                z36 = z412;
                c28655q2.m87173q(false);
                z44 = z27;
            } else {
                z36 = z26;
                c28655q2.m87150e0(-961276777);
                boolean zM87157i14 = c28655q2.m87157i(interfaceC2994c1);
                if (i34 != 1048576) {
                    z37 = true;
                } else {
                    z37 = true;
                }
                zM87157i2 = z37 | zM87157i14 | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i2) {
                    z38 = false;
                    objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    z38 = false;
                    objM87133R4 = new C32698z(interfaceC2994c1, speechRecognitionManager, c16351i, interfaceC28601c1M87238F4, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R4;
                if (enumC32692x4 == EnumC32692x1.KEYBOARD) {
                    z39 = true;
                } else {
                    z39 = z38;
                }
                c28655q = c28655q2;
                z44 = z27;
                m102215o(textFieldValue, onTextUpdated, onSend, z4, z13, speechRecognitionManager, i13, interfaceC4339a8, z44, z39, c28655q, ((i25 >> 6) & 14) | (i25 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | ((i25 << 18) & 3670016) | (i25 & 234881024), 0);
                c28655q.m87173q(z38);
            }
            z24 = z44;
            c28655q2 = c28655q;
            enumC32692x2 = enumC32692x4;
            z25 = z36;
        } else {
            c28655q2.m87138X();
            z24 = z15;
            z25 = z17;
            enumC32692x2 = enumC32692x1;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32653o3(i13, onTextUpdated, textFieldValue, onSend, z4, z13, speechRecognitionManager, z25, z24, enumC32692x2, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Object m102226z(InterfaceC30468c interfaceC30468c, C16351i c16351i, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, InterfaceC28601c1 interfaceC28601c1, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zIsAvailable = interfaceC30468c.isAvailable();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zIsAvailable) {
            f135428a.mo85228t("Speech recognition not available", new AbstractC30556a.a[0]);
            return c23454a0;
        }
        if (interfaceC30468c.mo93230c()) {
            Object objM102189N = m102189N(interfaceC30468c, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28670t5, interfaceC28601c1, z4, interfaceC30057d);
            return objM102189N == EnumC31071a.f128113w ? objM102189N : c23454a0;
        }
        c16351i.mo4052a("android.permission.RECORD_AUDIO", null);
        return c23454a0;
    }
}
