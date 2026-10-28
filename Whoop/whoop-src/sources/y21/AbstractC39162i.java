package y21;

import ad3.AbstractC0770m;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1934e;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import cz0.C11251l;
import e93.AbstractC12889b;
import hh0.C17284d;
import i93.C18279e;
import ih0.AbstractC18489d0;
import is0.C20904r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kd1.AbstractC22412x;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p040c0.InterfaceC3747i0;
import p088dc.AbstractC11895b;
import p180h0.AbstractC16486z0;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17916v0;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18026h;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34472r;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p702ch0.C4614e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p733ry2.C31919h;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vx0.C36553a;
import w21.C36738b;
import wb3.AbstractC37056f;
import x81.C38072d;
import xl0.C38448b;
import xo1.C38492a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: y21.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a?\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0016\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001ak\u0010!\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001fH\u0003¢\u0006\u0004\b!\u0010\"\u001a;\u0010(\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\b2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0004\b(\u0010)\u001a\u001f\u0010+\u001a\u00020*2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,\"%\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010.0-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0014\u00105\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010!¨\u0006:²\u0006\u000e\u00106\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00107\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u0018\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00028\nX\u008a\u0084\u0002²\u0006\u0012\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Ly21/b;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "", "initiallyPickerOpen", "r", "(Ly21/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "Li2/x;", "bannerColor", "accentColor", "Ly3/f;", "barWidth", "X", "(Landroidx/compose/ui/Modifier;Li2/x;JF)Landroidx/compose/ui/Modifier;", "Lw21/b;", "", "totalSeconds", "W", "(Lw21/b;I)Lw21/b;", "", "value", "lowerBound", "upperBound", "stepSize", "barThickness", "onValueChange", "Lkotlin/Function0;", "onValueChangeFinished", "F", "(FFFIIJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Ly21/b$a;", "endLabel", "currentValue", "isOpen", "onClick", "D", "(Ly21/b$a;FZLc93/a;Landroidx/compose/runtime/Composer;II)V", "", "U", "(Ly21/b$a;F)Ljava/lang/String;", "Lp1/t1;", "Lp1/c1;", "a", "Lp1/t1;", "V", "()Lp1/t1;", "LocalSharedSliderMax", "b", "SLIDER_THUMB_SIZE", "sliderValue", "isPickerOpen", "latestOnValueChange", "latestOnValueChangeFinished", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39162i {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f168372a = new C28596b0(new C38492a(18));

    /* JADX INFO: renamed from: b */
    private static final float f168373b = 7 * 4;

    /* JADX INFO: renamed from: y21.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.numericinputslider.NumericInputSliderKt$NumericInputSlider$1$1", m100430f = "NumericInputSlider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168374w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39155b f168375x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f168376y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C39155b c39155b, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168375x = c39155b;
            this.f168376y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f168375x, this.f168376y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168374w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC39162i.m124685A(this.f168376y, this.f168375x.getSliderValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y21.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.numericinputslider.NumericInputSliderKt$NumericInputSlider$2$1", m100430f = "NumericInputSlider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168377w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39155b f168378x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f168379y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C39155b c39155b, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168378x = c39155b;
            this.f168379y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f168378x, this.f168379y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168377w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            float fMax = Math.max(this.f168378x.getUpperBound(), this.f168378x.getSliderValue());
            if (fMax > ((Number) this.f168379y.getValue()).floatValue()) {
                this.f168379y.setValue(new Float(fMax));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y21.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.numericinputslider.NumericInputSliderKt$NumericInputSlider$3$1", m100430f = "NumericInputSlider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168380w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f168381x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f168382y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168381x = interfaceC28601c1;
            this.f168382y = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f168381x, this.f168382y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168380w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC39162i.m124728s(this.f168382y) > ((Number) this.f168381x.getValue()).floatValue()) {
                this.f168381x.setValue(new Float(AbstractC39162i.m124728s(this.f168382y)));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y21.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ float f168383E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28670t2 f168384F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f168385G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ float f168386H;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28670t2 f168387w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f168388x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f168389y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ float f168390z;

        public d(InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, boolean z4, float f13, float f14, InterfaceC28670t2 interfaceC28670t4, int i13, float f15) {
            this.f168387w = interfaceC28670t2;
            this.f168388x = interfaceC28670t3;
            this.f168389y = z4;
            this.f168390z = f13;
            this.f168383E = f14;
            this.f168384F = interfaceC28670t4;
            this.f168385G = i13;
            this.f168386H = f15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final C23454a0 m124739d(InterfaceC28670t2 interfaceC28670t2) {
            AbstractC39162i.m124694J(interfaceC28670t2).invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final C23454a0 m124740e(InterfaceC28670t2 interfaceC28670t2) {
            AbstractC39162i.m124694J(interfaceC28670t2).invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final C23454a0 m124741f(InterfaceC28670t2 interfaceC28670t2, boolean z4, float f13, float f14, InterfaceC28670t2 interfaceC28670t3, int i13, float f15, C34472r change, float f16) {
            AbstractC22676k.m65750j(change, "change");
            change.m108946a();
            AbstractC39162i.m124693I(interfaceC28670t3).invoke(Float.valueOf(AbstractC39162i.m124699O(i13, f13, f15, (AbstractC22412x.m64539b(Float.intBitsToFloat((int) (change.f144817c >> 32)), ((Number) interfaceC28670t2.getValue()).floatValue(), z4) * f14) + f13)));
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            InterfaceC28670t2 interfaceC28670t2 = this.f168387w;
            C39163j c39163j = new C39163j(interfaceC28670t2, 0);
            C39163j c39163j2 = new C39163j(interfaceC28670t2, 1);
            final InterfaceC28670t2 interfaceC28670t3 = this.f168388x;
            final boolean z4 = this.f168389y;
            final float f13 = this.f168390z;
            final float f14 = this.f168383E;
            final InterfaceC28670t2 interfaceC28670t4 = this.f168384F;
            final int i13 = this.f168385G;
            final float f15 = this.f168386H;
            Object objM46659h = AbstractC16486z0.m46659h(interfaceC34476v, c39163j, c39163j2, new InterfaceC4351m() { // from class: y21.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    return AbstractC39162i.d.m124741f(interfaceC28670t3, z4, f13, f14, interfaceC28670t4, i13, f15, (C34472r) obj, fFloatValue);
                }
            }, interfaceC30057d, 1);
            return objM46659h == EnumC31071a.f128113w ? objM46659h : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y21.i$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f168391a;

        static {
            int[] iArr = new int[C39155b.b.values().length];
            try {
                iArr[C39155b.b.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C39155b.b.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f168391a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m124685A(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: renamed from: B */
    private static final boolean m124686B(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    private static final void m124687C(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:67:0x0120  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138  */
    /* JADX WARN: Code duplicated, block: B:72:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x018c  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    private static final void m124688D(C39155b.a aVar, float f13, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        C39155b.a aVar2;
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z14;
        boolean z15;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z16;
        InterfaceC4339a interfaceC4339a4;
        Modifier modifierM3362g;
        long jM95628d;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        long jM73366B;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2145452777);
        if ((i13 & 6) == 0) {
            aVar2 = aVar;
            i15 = (c28655q.m87153g(aVar2) ? 4 : 2) | i13;
        } else {
            aVar2 = aVar;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i16 != 0) {
                        interfaceC4339a4 = null;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    float f14 = 2;
                    C33252i c33252iM105489e = AbstractC33253j.m105489e(4 * f14);
                    modifierM3362g = C2314t.f9131w;
                    Modifier modifierM118994r = AbstractC37056f.m118994r(modifierM3362g, c33252iM105489e);
                    if (z16) {
                        c28655q.m87150e0(-195807359);
                        jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-195806274);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, jM95628d, AbstractC17918w0.f69621a);
                    if (interfaceC4339a4 != null) {
                        modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, interfaceC4339a4, 15);
                    }
                    InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                    float f15 = 8;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3358c.mo3471e(modifierM3362g), f14 * f15, 1 * f15);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                    String strM124705U = m124705U(aVar, f13);
                    c38072d = C38072d.f163053a;
                    C2886a c2886aM8413K = c38072d.m121952e(c28655q, 6).getSh3();
                    if (z16) {
                        c28655q.m87150e0(650606375);
                        jM73366B = c38072d.m121949b(c28655q, 6).getBrandBlack();
                    } else {
                        jM73366B = AbstractC25012a.m73366B(c28655q, 650607463, c38072d, c28655q, 6);
                    }
                    c28655q.m87173q(false);
                    AbstractC30795n.m94707h(strM124705U, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8413K, null, c28655q, 0, 0, 196602);
                    c28655q.m87173q(true);
                    z15 = z16;
                    interfaceC4339a3 = interfaceC4339a5;
                } else {
                    c28655q.m87138X();
                    z15 = z13;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C20904r(aVar2, f13, z15, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    interfaceC4339a4 = null;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                float f16 = 2;
                C33252i c33252iM105489e2 = AbstractC33253j.m105489e(4 * f16);
                modifierM3362g = C2314t.f9131w;
                Modifier modifierM118994r2 = AbstractC37056f.m118994r(modifierM3362g, c33252iM105489e2);
                if (z16) {
                    c28655q.m87150e0(-195807359);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-195806274);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM118994r2, jM95628d, AbstractC17918w0.f69621a);
                if (interfaceC4339a4 != null) {
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, interfaceC4339a4, 15);
                }
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                float f17 = 8;
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM3358c2.mo3471e(modifierM3362g), f16 * f17, 1 * f17);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
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
                String strM124705U2 = m124705U(aVar, f13);
                c38072d = C38072d.f163053a;
                C2886a c2886aM8413K2 = c38072d.m121952e(c28655q, 6).getSh3();
                if (z16) {
                    c28655q.m87150e0(650606375);
                    jM73366B = c38072d.m121949b(c28655q, 6).getBrandBlack();
                } else {
                    jM73366B = AbstractC25012a.m73366B(c28655q, 650607463, c38072d, c28655q, 6);
                }
                c28655q.m87173q(false);
                AbstractC30795n.m94707h(strM124705U2, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8413K2, null, c28655q, 0, 0, 196602);
                c28655q.m87173q(true);
                z15 = z16;
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20904r(aVar2, f13, z15, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    interfaceC4339a4 = null;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                float f18 = 2;
                C33252i c33252iM105489e3 = AbstractC33253j.m105489e(4 * f18);
                modifierM3362g = C2314t.f9131w;
                Modifier modifierM118994r3 = AbstractC37056f.m118994r(modifierM3362g, c33252iM105489e3);
                if (z16) {
                    c28655q.m87150e0(-195807359);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-195806274);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM118994r3, jM95628d, AbstractC17918w0.f69621a);
                if (interfaceC4339a4 != null) {
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, interfaceC4339a4, 15);
                }
                InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                float f19 = 8;
                Modifier modifierM3395q3 = AbstractC1099a.m3395q(modifierM3358c3.mo3471e(modifierM3362g), f18 * f19, 1 * f19);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3395q3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                String strM124705U3 = m124705U(aVar, f13);
                c38072d = C38072d.f163053a;
                C2886a c2886aM8413K3 = c38072d.m121952e(c28655q, 6).getSh3();
                if (z16) {
                    c28655q.m87150e0(650606375);
                    jM73366B = c38072d.m121949b(c28655q, 6).getBrandBlack();
                } else {
                    jM73366B = AbstractC25012a.m73366B(c28655q, 650607463, c38072d, c28655q, 6);
                }
                c28655q.m87173q(false);
                AbstractC30795n.m94707h(strM124705U3, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8413K3, null, c28655q, 0, 0, 196602);
                c28655q.m87173q(true);
                z15 = z16;
                interfaceC4339a3 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20904r(aVar2, f13, z15, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (i16 != 0) {
                interfaceC4339a4 = null;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            float f110 = 2;
            C33252i c33252iM105489e4 = AbstractC33253j.m105489e(4 * f110);
            modifierM3362g = C2314t.f9131w;
            Modifier modifierM118994r4 = AbstractC37056f.m118994r(modifierM3362g, c33252iM105489e4);
            if (z16) {
                c28655q.m87150e0(-195807359);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-195806274);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM118994r4, jM95628d, AbstractC17918w0.f69621a);
            if (interfaceC4339a4 != null) {
                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, interfaceC4339a4, 15);
            }
            InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
            float f111 = 8;
            Modifier modifierM3395q4 = AbstractC1099a.m3395q(modifierM3358c4.mo3471e(modifierM3362g), f110 * f111, 1 * f111);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3395q4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            String strM124705U4 = m124705U(aVar, f13);
            c38072d = C38072d.f163053a;
            C2886a c2886aM8413K4 = c38072d.m121952e(c28655q, 6).getSh3();
            if (z16) {
                c28655q.m87150e0(650606375);
                jM73366B = c38072d.m121949b(c28655q, 6).getBrandBlack();
            } else {
                jM73366B = AbstractC25012a.m73366B(c28655q, 650607463, c38072d, c28655q, 6);
            }
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(strM124705U4, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8413K4, null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
            z15 = z16;
            interfaceC4339a3 = interfaceC4339a8;
        } else {
            c28655q.m87138X();
            z15 = z13;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20904r(aVar2, f13, z15, interfaceC4339a3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m124689E(C39155b.a aVar, float f13, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m124688D(aVar, f13, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0151  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x0147  */
    /* JADX INFO: renamed from: F */
    private static final void m124690F(final float f13, final float f14, final float f15, final int i13, final int i14, final long j7, Modifier modifier, final Function1 function1, final InterfaceC4339a interfaceC4339a, Composer composer, final int i15, final int i16) {
        int i17;
        final Modifier modifier2;
        Function1 function2;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        float f16;
        Float fValueOf;
        float fFloatValue;
        int i18;
        int i19;
        int i24;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1175938031);
        if ((i15 & 6) == 0) {
            i17 = (c28655q2.m87147d(f13) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q2.m87147d(f14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q2.m87147d(f15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q2.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i17 |= c28655q2.m87149e(i14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            i17 |= c28655q2.m87151f(j7) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i25 = i16 & 64;
        if (i25 == 0) {
            if ((1572864 & i15) == 0) {
                modifier2 = modifier;
                i17 |= c28655q2.m87153g(modifier2) ? 1048576 : 524288;
            }
            if ((12582912 & i15) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i17 |= i24;
            } else {
                function2 = function1;
            }
            if ((100663296 & i15) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i19 = 67108864;
                } else {
                    i19 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i17 |= i19;
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            if ((38347923 & i17) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i17 & 1, z4)) {
                if (i25 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                f16 = f15 - f14;
                fValueOf = Float.valueOf(f16);
                if (f16 <= 0.0f) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                final Modifier modifier4 = modifier3;
                final float fM36283m = AbstractC12889b.m36283m((f13 - f14) / fFloatValue, 0.0f, 1.0f);
                if (i13 > 0 || (i18 = ((int) (f16 / i13)) - 1) < 0) {
                    i18 = 0;
                }
                C28674u2 c28674u2 = AbstractC2453v1.f9575n;
                boolean z13 = c28655q2.m87161k(c28674u2) == EnumC39181m.f168424x;
                C28673u1 c28673u1Mo86977a = c28674u2.mo86977a(EnumC39181m.f168423w);
                final Function1 function3 = function2;
                final int i26 = i18;
                c28655q = c28655q2;
                final boolean z14 = z13;
                final float f17 = fFloatValue;
                final InterfaceC4339a interfaceC4339a3 = interfaceC4339a2;
                AbstractC28683x.m87247a(c28673u1Mo86977a, AbstractC37817c.m121344e(-1029564625, c28655q, new InterfaceC4351m() { // from class: y21.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC39162i.m124691G(modifier4, function3, interfaceC4339a3, fM36283m, z14, f13, f14, f15, i26, i13, f17, i14, j7, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
                modifier2 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y21.h
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC39162i.m124698N(f13, f14, f15, i13, i14, j7, modifier2, function1, interfaceC4339a, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i17 |= 1572864;
        modifier2 = modifier;
        if ((12582912 & i15) == 0) {
            function2 = function1;
            if (c28655q2.m87157i(function2)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i17 |= i24;
        } else {
            function2 = function1;
        }
        if ((100663296 & i15) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            if (c28655q2.m87157i(interfaceC4339a2)) {
                i19 = 67108864;
            } else {
                i19 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i17 |= i19;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if ((38347923 & i17) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i17 & 1, z4)) {
            if (i25 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            f16 = f15 - f14;
            fValueOf = Float.valueOf(f16);
            if (f16 <= 0.0f) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            final Modifier modifier5 = modifier3;
            final float fM36283m2 = AbstractC12889b.m36283m((f13 - f14) / fFloatValue, 0.0f, 1.0f);
            if (i13 > 0) {
                i18 = 0;
            } else {
                i18 = 0;
            }
            C28674u2 c28674u3 = AbstractC2453v1.f9575n;
            if (c28655q2.m87161k(c28674u3) == EnumC39181m.f168424x) {
            }
            C28673u1 c28673u1Mo86977a2 = c28674u3.mo86977a(EnumC39181m.f168423w);
            final Function1 function4 = function2;
            final int i27 = i18;
            c28655q = c28655q2;
            final boolean z15 = z13;
            final float f18 = fFloatValue;
            final InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
            AbstractC28683x.m87247a(c28673u1Mo86977a2, AbstractC37817c.m121344e(-1029564625, c28655q, new InterfaceC4351m() { // from class: y21.g
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC39162i.m124691G(modifier5, function4, interfaceC4339a4, fM36283m2, z15, f13, f14, f15, i27, i13, f18, i14, j7, (Composer) obj, iIntValue);
                }
            }), c28655q, 56);
            modifier2 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y21.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC39162i.m124698N(f13, f14, f15, i13, i14, j7, modifier2, function1, interfaceC4339a, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m124691G(Modifier modifier, final Function1 function1, final InterfaceC4339a interfaceC4339a, final float f13, final boolean z4, final float f14, final float f15, final float f16, final int i13, final int i14, final float f17, final int i15, final long j7, Composer composer, int i16) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i16 & 1, (i16 & 3) != 2)) {
            AbstractC22953f.m66714a(modifier, null, false, AbstractC37817c.m121344e(-1880031591, c28655q, new Function3() { // from class: y21.d
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC39162i.m124692H(function1, interfaceC4339a, f13, z4, f14, f15, f16, i13, i14, f17, i15, j7, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 3072, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m124692H(final Function1 function1, final InterfaceC4339a interfaceC4339a, float f13, boolean z4, final float f14, final float f15, final float f16, final int i13, final int i14, float f17, int i15, long j7, InterfaceC23004v BoxWithConstraints, Composer composer, int i16) {
        int i17;
        float f18;
        float f19;
        Object[] objArr;
        C2307m c2307m = C2299e.f9117z;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i16 & 6) == 0) {
            i17 = i16 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i17 = i16;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i17 & 1, (i17 & 19) != 18)) {
            C1101c c1101c = (C1101c) BoxWithConstraints;
            float fM3403d = c1101c.m3403d();
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(Float.valueOf(C39169a.m124765i(c1101c.f4585b)), c28655q);
            InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(function1, c28655q);
            InterfaceC28601c1 interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(interfaceC4339a, c28655q);
            float fM64538a = AbstractC22412x.m64538a(f13, z4);
            float f24 = f168373b;
            float fM8288a = AbstractC2875y.m8288a(fM3403d, f24, fM64538a, f24 / 2);
            if (z4) {
                float f25 = fM3403d - fM8288a;
                float f26 = 0;
                if (f25 < f26) {
                    f25 = f26;
                }
                f18 = f25;
            } else {
                f18 = fM8288a;
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3411h(f24, AbstractC1102d.m3409f(1.0f, c2314t)), "numeric_input_slider_track");
            boolean zM87147d = c28655q.m87147d(f14) | c28655q.m87147d(f15) | c28655q.m87147d(f16) | c28655q.m87149e(i13) | c28655q.m87153g(function1) | c28655q.m87149e(i14) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87147d || objM87133R == c28676v0) {
                f19 = 1.0f;
                objM87133R = new Function1() { // from class: y21.e
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC39162i.m124695K(f14, f15, f16, i13, function1, interfaceC4339a, i14, (InterfaceC18044z) obj);
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                f19 = 1.0f;
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3599a, false, (Function1) objM87133R);
            Object[] objArr2 = {Float.valueOf(f15), Float.valueOf(f16), Integer.valueOf(i14), Boolean.valueOf(z4)};
            boolean zM87153g = c28655q.m87153g(r32) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87155h(z4) | c28655q.m87153g(interfaceC28601c1M87238F2) | c28655q.m87149e(i14) | c28655q.m87147d(f15) | c28655q.m87147d(f16) | c28655q.m87147d(f17);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objArr = objArr2;
                d dVar = new d(interfaceC28601c1M87238F3, interfaceC28601c1M87238F, z4, f15, f17, interfaceC28601c1M87238F2, i14, f16);
                c28655q.m87172p0(dVar);
                objM87133R2 = dVar;
            } else {
                objArr = objArr2;
            }
            Modifier modifierM108905d = AbstractC34452c0.m108905d(modifierM51775c, objArr, (PointerInputEventHandler) objM87133R2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM108905d);
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
            float f27 = i15;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f27, AbstractC1102d.m3409f(f19, c2314t));
            C2307m c2307m2 = C2299e.f9102E;
            C1100b c1100b = C1100b.f4583a;
            Modifier modifierMo3400a = c1100b.mo3400a(modifierM3411h, c2307m2);
            C33252i c33252i = AbstractC33253j.f138651a;
            Modifier modifierM118994r = AbstractC37056f.m118994r(modifierMo3400a, c33252i);
            C38072d c38072d = C38072d.f163053a;
            long jM125374Y0 = c38072d.m121949b(c28655q, 6).getWhite30();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM118994r, jM125374Y0, c17916v0), c28655q, 0);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(c1100b.mo3400a(AbstractC1102d.m3411h(f27, AbstractC1102d.m3424u(f18, c2314t)), z4 ? C2299e.f9103F : c2307m), c33252i), j7, c17916v0), c28655q, 0);
            Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t, fM8288a, 0.0f, 2);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C38448b(23);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(c1100b.mo3400a(AbstractC1102d.m3419p(f24, AbstractC1127a.m3486a(modifierM3392n, (Function1) objM87133R3)), c2307m), c33252i), c38072d.m121949b(c28655q, 6).getBrandWhite(), c17916v0), "numeric_input_slider_thumb"), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final Function1 m124693I(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC4339a m124694J(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC4339a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m124695K(float f13, final float f14, final float f15, int i13, final Function1 function1, final InterfaceC4339a interfaceC4339a, final int i14, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51809h(semantics, new C18026h(AbstractC12889b.m36283m(f13, f14, f15), new C18279e(f14, f15), i13));
        C18030l c18030l = (C18030l) semantics;
        c18030l.m51772e(AbstractC18029k.f69961h, new C18017a(null, new Function1() { // from class: y21.f
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AbstractC39162i.m124696L(function1, interfaceC4339a, i14, f14, f15, ((Float) obj).floatValue()));
            }
        }));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final boolean m124696L(Function1 function1, InterfaceC4339a interfaceC4339a, int i13, float f13, float f14, float f15) {
        function1.invoke(Float.valueOf(m124699O(i13, f13, f14, f15)));
        interfaceC4339a.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m124697M(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51549C((-Float.intBitsToFloat((int) (c17920x0.f69653R >> 32))) / 2.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m124698N(float f13, float f14, float f15, int i13, int i14, long j7, Modifier modifier, Function1 function1, InterfaceC4339a interfaceC4339a, int i15, int i16, Composer composer, int i17) {
        m124690F(f13, f14, f15, i13, i14, j7, modifier, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final float m124699O(int i13, float f13, float f14, float f15) {
        if (i13 > 0) {
            f15 = f13 + (AbstractC12889b.m36258X((f15 - f13) / i13) * i13);
        }
        return AbstractC12889b.m36283m(f15, f13, f14);
    }

    /* JADX INFO: renamed from: U */
    private static final String m124705U(C39155b.a aVar, float f13) {
        int i13 = e.f168391a[aVar.getFormat().ordinal()];
        if (i13 == 1) {
            int i14 = ((int) f13) / 60;
            return String.format(Locale.ROOT, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14 / 60), Integer.valueOf(i14 % 60)}, 2));
        }
        if (i13 == 2) {
            return AbstractC2875y.m8299l(String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f13)}, 1)), aVar.getUnit());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: V */
    public static final AbstractC28669t1 m124706V() {
        return f168372a;
    }

    /* JADX INFO: renamed from: W */
    private static final C36738b m124707W(C36738b c36738b, int i13) {
        Map<String, Integer> mapM124742a = C39165l.f168401a.m124742a(i13);
        List<C36738b.a> listM117848c = c36738b.m117848c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM117848c, 10));
        for (C36738b.a aVarM117849b : listM117848c) {
            Integer num = mapM124742a.get(aVarM117849b.getKey());
            if (num != null) {
                int iIntValue = num.intValue();
                Iterator<C36738b.b> it = aVarM117849b.m117855g().iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                        break;
                    }
                    Integer numM125932Q = AbstractC39421y.m125932Q(it.next().getRawValue());
                    if (numM125932Q != null && numM125932Q.intValue() == iIntValue) {
                        break;
                    }
                    i14++;
                }
                int i15 = i14;
                if (i15 >= 0) {
                    aVarM117849b = C36738b.a.m117849b(aVarM117849b, null, null, null, i15, null, 23, null);
                }
            }
            arrayList.add(aVarM117849b);
        }
        return C36738b.m117846b(c36738b, null, arrayList, 1, null);
    }

    /* JADX INFO: renamed from: X */
    private static final Modifier m124708X(Modifier modifier, C17919x c17919x, long j7, float f13) {
        Modifier modifierM3478a = AbstractC1125a.m3478a(modifier, new C11251l(f13, c17919x, j7));
        float f14 = 8;
        return AbstractC1099a.m3398t(modifierM3478a, (((float) 1.5d) * f14) + f13, 1 * f14, 0.0f, 0.0f, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m124709Y(float f13, C17919x c17919x, long j7, InterfaceC22131e drawBehind) {
        float fIntBitsToFloat;
        float f14;
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fMo743q0 = drawBehind.mo743q0(f13);
        boolean z4 = drawBehind.getLayoutDirection() == EnumC39181m.f168424x;
        if (c17919x != null) {
            long j13 = c17919x.f69639a;
            C17909s c17909s = AbstractC17911t.f69612b;
            List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, j13)), new C17919x(C17919x.f69636m));
            float fIntBitsToFloat2 = z4 ? Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) : 0.0f;
            long jMo731d = drawBehind.mo731d();
            if (z4) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jMo731d >> 32));
                f14 = 0.75f;
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jMo731d >> 32));
                f14 = 0.25f;
            }
            InterfaceC22131e.m63385u(drawBehind, C17909s.m51483a(c17909s, listM118959K, fIntBitsToFloat2, fIntBitsToFloat * f14, 8), 0L, 0L, 0.0f, null, 0, 126);
        }
        InterfaceC22131e.m63383i0(drawBehind, j7, (((long) Float.floatToRawIntBits(z4 ? Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) - fMo743q0 : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)))) & 4294967295L), 0.0f, null, 0, 120);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC28601c1 m124726q() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:120:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0213  */
    /* JADX WARN: Code duplicated, block: B:126:0x0257  */
    /* JADX WARN: Code duplicated, block: B:127:0x025b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0270  */
    /* JADX WARN: Code duplicated, block: B:133:0x0281  */
    /* JADX WARN: Code duplicated, block: B:137:0x0293  */
    /* JADX WARN: Code duplicated, block: B:139:0x029b  */
    /* JADX WARN: Code duplicated, block: B:142:0x02be  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:148:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:151:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:153:0x0317  */
    /* JADX WARN: Code duplicated, block: B:155:0x033d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0341  */
    /* JADX WARN: Code duplicated, block: B:159:0x034e  */
    /* JADX WARN: Code duplicated, block: B:161:0x035c  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:170:0x0463  */
    /* JADX WARN: Code duplicated, block: B:172:0x046b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0479  */
    /* JADX WARN: Code duplicated, block: B:177:0x0487  */
    /* JADX WARN: Code duplicated, block: B:182:0x049d  */
    /* JADX WARN: Code duplicated, block: B:183:0x049f  */
    /* JADX WARN: Code duplicated, block: B:185:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:188:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:189:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:192:0x0506  */
    /* JADX WARN: Code duplicated, block: B:193:0x0508  */
    /* JADX WARN: Code duplicated, block: B:196:0x0510 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x0516  */
    /* JADX WARN: Code duplicated, block: B:202:0x0538  */
    /* JADX WARN: Code duplicated, block: B:204:0x0547  */
    /* JADX WARN: Code duplicated, block: B:206:0x0553  */
    /* JADX WARN: Code duplicated, block: B:209:0x055b  */
    /* JADX WARN: Code duplicated, block: B:211:0x055e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0570 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x0572  */
    /* JADX WARN: Code duplicated, block: B:216:0x0584  */
    /* JADX WARN: Code duplicated, block: B:220:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:221:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:223:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:224:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:227:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:228:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:230:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:232:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:233:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:235:0x05da  */
    /* JADX WARN: Code duplicated, block: B:238:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:242:0x061e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0629  */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:74:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0118  */
    /* JADX WARN: Code duplicated, block: B:79:0x011d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x012d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:86:0x0152  */
    /* JADX WARN: Code duplicated, block: B:88:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0199  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [c93.a] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38, types: [w21.b] */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX INFO: renamed from: r */
    public static final void m124727r(C39155b state, Function1 onViewEvent, Modifier modifier, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        boolean z16;
        InterfaceC25312u interfaceC25312uM124674f;
        String strM124677i;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87147d;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC28601c1 interfaceC28601c3;
        C36738b c36738b;
        String id4;
        boolean zM87153g;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c4;
        C39155b.c cVarM124676h;
        EnumC39333f enumC39333fM124682a;
        C17919x c17919xM31989h;
        long j7;
        C17919x c17919xM31989h2;
        int i18;
        boolean z17;
        Object objM87133R4;
        boolean z18;
        boolean zM87153g2;
        Object objM87133R5;
        boolean zM87153g3;
        Object objM87133R6;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        InterfaceC28601c1 interfaceC28601c5;
        C0209i c0209i4;
        Modifier modifierM124708X;
        int iHashCode2;
        C39155b.c cVarM124676h2;
        int iHashCode3;
        C38072d c38072d;
        C0209i c0209i5;
        C2314t c2314t2;
        C0209i c0209i6;
        C28676v0 c28676v1;
        float f15;
        C0213j c0213j2;
        C0209i c0209i7;
        String str;
        int i19;
        C39155b.b bVar;
        String strM124683b;
        int iHashCode4;
        int i24;
        Object objM87133R7;
        C28676v0 c28676v2;
        final InterfaceC28601c1 interfaceC28601c6;
        String str2;
        boolean z19;
        boolean z24;
        Object objM87133R8;
        Function1 function1;
        InterfaceC28601c1 interfaceC28601c7;
        C39155b.a aVarM124672c;
        boolean z25;
        InterfaceC28601c1 interfaceC28601c8;
        boolean z26;
        ?? r10;
        boolean zM87153g4;
        Object objM87133R9;
        C39155b.a aVarM124672c2;
        C39155b.b bVarM124680a;
        boolean z27;
        InterfaceC25312u interfaceC25312u;
        boolean z28;
        ?? r14;
        C36738b c36738b2;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(802098326);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    interfaceC25312uM124674f = state.getPicker();
                    strM124677i = state.m124677i();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Float.valueOf(state.getSliderValue()));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    zM87147d = c28655q.m87147d(state.getUpperBound());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87147d || objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Float.valueOf(Math.max(state.getUpperBound(), state.getSliderValue())));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    interfaceC28601c3 = (InterfaceC28601c1) c28655q.m87161k(f168372a);
                    if (interfaceC28601c3 == null) {
                        interfaceC28601c3 = interfaceC28601c2;
                    }
                    if (interfaceC25312uM124674f instanceof C36738b) {
                        c36738b = (C36738b) interfaceC25312uM124674f;
                    } else {
                        c36738b = null;
                    }
                    if (c36738b != null) {
                        id4 = c36738b.getId();
                    } else {
                        id4 = null;
                    }
                    zM87153g = c28655q.m87153g(id4);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g || objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC31061c.m95647w(z16, c28655q);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
                    cVarM124676h = state.getStartLabel();
                    if (cVarM124676h != null) {
                        enumC39333fM124682a = cVarM124676h.getBannerColor();
                    } else {
                        enumC39333fM124682a = null;
                    }
                    if (enumC39333fM124682a == null) {
                        c28655q.m87150e0(-1886097192);
                        c28655q.m87173q(false);
                        c17919xM31989h = null;
                    } else {
                        c28655q.m87150e0(2017368137);
                        c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333fM124682a.mo134584toComposableColorWaAFU9c(c28655q, 0));
                    }
                    if (state.getStartLabel() == null) {
                        c28655q.m87150e0(-1886036773);
                        c28655q.m87173q(false);
                        z16 = z16;
                        interfaceC28601c4 = interfaceC28601c4;
                        c17919xM31989h2 = null;
                    } else {
                        c28655q.m87150e0(-1886036772);
                        if (c17919xM31989h == null) {
                            c28655q.m87150e0(-463859369);
                            long jM125374Y0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite30();
                            c28655q.m87173q(false);
                            j7 = jM125374Y0;
                        } else {
                            c28655q.m87150e0(-463860392);
                            c28655q.m87173q(false);
                            j7 = c17919xM31989h.f69639a;
                        }
                        c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, j7);
                    }
                    float f16 = ((float) 0.5d) * 4;
                    Float fValueOf = Float.valueOf(state.getSliderValue());
                    i18 = i15 & 14;
                    if (i18 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(state))) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z29 = z16;
                    objM87133R4 = c28655q.m87133R();
                    if (z17 || objM87133R4 == c28676v0) {
                        objM87133R4 = new a(state, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, fValueOf);
                    Float fValueOf2 = Float.valueOf(state.getUpperBound());
                    Float fValueOf3 = Float.valueOf(state.getSliderValue());
                    if (i18 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(state))) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87153g2 = z18 | c28655q.m87153g(interfaceC28601c3);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R5 == c28676v0) {
                        objM87133R5 = new b(state, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87255i(interfaceC28601c3, fValueOf2, fValueOf3, (InterfaceC4351m) objM87133R5, c28655q);
                    Float fValueOf4 = Float.valueOf(m124728s(interfaceC28601c1));
                    zM87153g3 = c28655q.m87153g(interfaceC28601c3);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g3 || objM87133R6 == c28676v0) {
                        objM87133R6 = new c(interfaceC28601c3, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87254h(interfaceC28601c3, fValueOf4, (InterfaceC4351m) objM87133R6, c28655q);
                    f13 = 8;
                    f14 = 1 * f13;
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    Modifier modifier5 = modifier4;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c3;
                    if (c28655q.f115903S) {
                        interfaceC28601c5 = interfaceC28601c1;
                    } else {
                        interfaceC28601c5 = interfaceC28601c1;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (c17919xM31989h2 != null || (modifierM124708X = m124708X(c2314t, c17919xM31989h, c17919xM31989h2.f69639a, f16)) == null) {
                            modifierM124708X = c2314t;
                        }
                        Modifier modifierMo3471e = modifierM3409f.mo3471e(modifierM124708X);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        cVarM124676h2 = state.getStartLabel();
                        if (cVarM124676h2 == null) {
                            c28655q.m87150e0(122565642);
                            c28655q.m87173q(false);
                            c0209i5 = c0209i;
                            c0213j2 = c0213j;
                            c0209i6 = c0209i4;
                            i19 = 0;
                            c0209i7 = c0209i3;
                            c2314t2 = c2314t;
                            c28676v1 = c28676v0;
                            f15 = f13;
                            str = strM124677i;
                            bVar = null;
                        } else {
                            c28655q.m87150e0(122565643);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 54);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                            String strM124684c = cVarM124676h2.getTitle();
                            c38072d = C38072d.f163053a;
                            c0209i5 = c0209i;
                            c2314t2 = c2314t;
                            c0209i6 = c0209i4;
                            c28676v1 = c28676v0;
                            f15 = f13;
                            c0213j2 = c0213j;
                            c0209i7 = c0209i3;
                            str = strM124677i;
                            i19 = 0;
                            bVar = null;
                            AbstractC30795n.m94707h(strM124684c, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh3(), null, c28655q, 0, 0, 196602);
                            c28655q = c28655q;
                            strM124683b = cVarM124676h2.getSubtitle();
                            if (strM124683b == null) {
                                c28655q.m87150e0(-334121691);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-334121690);
                                AbstractC30795n.m94707h(strM124683b, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q, 54);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                        if (1.0f > 0.0d) {
                            i24 = 1;
                        } else {
                            i24 = i19;
                        }
                        if (i24 == 0) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        float fM36283m = AbstractC12889b.m36283m(m124728s(interfaceC28601c5), state.getLowerBound(), ((Number) interfaceC28601c9.getValue()).floatValue());
                        float fM124673e = state.getLowerBound();
                        float fFloatValue = ((Number) interfaceC28601c9.getValue()).floatValue();
                        int iM124678j = state.getStepSize();
                        int iM124671b = state.getBarThickness();
                        long jMo134584toComposableColorWaAFU9c = state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q, i19);
                        objM87133R7 = c28655q.m87133R();
                        c28676v2 = c28676v1;
                        if (objM87133R7 == c28676v2) {
                            interfaceC28601c6 = interfaceC28601c5;
                            objM87133R7 = new Function1() { // from class: y21.c
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC39162i.m124729t(interfaceC28601c6, ((Float) obj).floatValue());
                                }
                            };
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            interfaceC28601c6 = interfaceC28601c5;
                        }
                        Function1 function2 = (Function1) objM87133R7;
                        str2 = str;
                        boolean zM87153g5 = c28655q.m87153g(str2);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z19 | zM87153g5;
                        objM87133R8 = c28655q.m87133R();
                        if (!z24 || objM87133R8 == c28676v2) {
                            function1 = onViewEvent;
                            objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            function1 = onViewEvent;
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R8;
                        interfaceC28601c7 = interfaceC28601c6;
                        C28655q c28655q2 = c28655q;
                        m124690F(fM36283m, fM124673e, fFloatValue, iM124678j, iM124671b, jMo134584toComposableColorWaAFU9c, layoutWeightElement, function2, interfaceC4339a, c28655q2, 12582912, 0);
                        c28655q = c28655q2;
                        aVarM124672c = state.getEndLabel();
                        if (aVarM124672c == null) {
                            c28655q.m87150e0(-1729502159);
                            c28655q.m87173q(false);
                            z26 = false;
                            interfaceC28601c8 = interfaceC28601c4;
                        } else {
                            c28655q.m87150e0(-1729502158);
                            float fM124728s = m124728s(interfaceC28601c7);
                            if (r58 == 0 && m124686B(interfaceC28601c4)) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if (r58 != 0) {
                                c28655q.m87150e0(1170996154);
                                interfaceC28601c8 = interfaceC28601c4;
                                zM87153g4 = c28655q.m87153g(interfaceC28601c8);
                                objM87133R9 = c28655q.m87133R();
                                if (zM87153g4 || objM87133R9 == c28676v2) {
                                    objM87133R9 = new C39163j(interfaceC28601c8, 2);
                                    c28655q.m87172p0(objM87133R9);
                                }
                                z26 = false;
                                c28655q.m87173q(false);
                                r10 = (InterfaceC4339a) objM87133R9;
                            } else {
                                interfaceC28601c8 = interfaceC28601c4;
                                z26 = false;
                                c28655q.m87150e0(1171088534);
                                c28655q.m87173q(false);
                                r10 = bVar;
                            }
                            m124688D(aVarM124672c, fM124728s, z25, r10, c28655q, 0, 0);
                            c28655q.m87173q(z26);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        if (r58 == 0) {
                            c28655q.m87150e0(-1059328071);
                            c28655q.m87173q(z26);
                            z28 = true;
                        } else {
                            c28655q.m87150e0(-1059328070);
                            aVarM124672c2 = state.getEndLabel();
                            if (aVarM124672c2 != null) {
                                bVarM124680a = aVarM124672c2.getFormat();
                            } else {
                                bVarM124680a = bVar;
                            }
                            if (bVarM124680a == C39155b.b.TIME) {
                                z27 = true;
                            } else {
                                z27 = z26;
                            }
                            if (z27) {
                                interfaceC25312u = interfaceC25312uM124674f;
                                if (interfaceC25312u instanceof C36738b) {
                                    c36738b2 = (C36738b) interfaceC25312u;
                                } else {
                                    r14 = bVar;
                                }
                                if (r14 != 0 || (interfaceC25312uM124707W = m124707W(r14, (int) m124728s(interfaceC28601c7))) == null) {
                                }
                                r14 = c36738b2;
                                boolean z34 = z26;
                                z28 = true;
                                AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                                c28655q.m87173q(z34);
                            } else {
                                interfaceC25312u = r58;
                            }
                            r14 = c36738b2;
                            r14 = c36738b2;
                            InterfaceC25312u interfaceC25312uM124707W = interfaceC25312u;
                            r14 = c36738b2;
                            boolean z35 = z26;
                            z28 = true;
                            AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                            c28655q.m87173q(z35);
                        }
                        c28655q.m87173q(z28);
                        z15 = z29;
                        modifier3 = modifier5;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (c17919xM31989h2 != null) {
                        modifierM124708X = c2314t;
                    } else {
                        modifierM124708X = c2314t;
                    }
                    Modifier modifierMo3471e2 = modifierM3409f3.mo3471e(modifierM124708X);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                    cVarM124676h2 = state.getStartLabel();
                    if (cVarM124676h2 == null) {
                        c28655q.m87150e0(122565642);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i;
                        c0213j2 = c0213j;
                        c0209i6 = c0209i4;
                        i19 = 0;
                        c0209i7 = c0209i3;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        f15 = f13;
                        str = strM124677i;
                        bVar = null;
                    } else {
                        c28655q.m87150e0(122565643);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 54);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                        String strM124684c2 = cVarM124676h2.getTitle();
                        c38072d = C38072d.f163053a;
                        c0209i5 = c0209i;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i4;
                        c28676v1 = c28676v0;
                        f15 = f13;
                        c0213j2 = c0213j;
                        c0209i7 = c0209i3;
                        str = strM124677i;
                        i19 = 0;
                        bVar = null;
                        AbstractC30795n.m94707h(strM124684c2, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh3(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        strM124683b = cVarM124676h2.getSubtitle();
                        if (strM124683b == null) {
                            c28655q.m87150e0(-334121691);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-334121690);
                            AbstractC30795n.m94707h(strM124683b, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N7);
                    if (1.0f > 0.0d) {
                        i24 = 1;
                    } else {
                        i24 = i19;
                    }
                    if (i24 == 0) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    float fM36283m2 = AbstractC12889b.m36283m(m124728s(interfaceC28601c5), state.getLowerBound(), ((Number) interfaceC28601c9.getValue()).floatValue());
                    float fM124673e2 = state.getLowerBound();
                    float fFloatValue2 = ((Number) interfaceC28601c9.getValue()).floatValue();
                    int iM124678j2 = state.getStepSize();
                    int iM124671b2 = state.getBarThickness();
                    long jMo134584toComposableColorWaAFU9c2 = state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q, i19);
                    objM87133R7 = c28655q.m87133R();
                    c28676v2 = c28676v1;
                    if (objM87133R7 == c28676v2) {
                        interfaceC28601c6 = interfaceC28601c5;
                        objM87133R7 = new Function1() { // from class: y21.c
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC39162i.m124729t(interfaceC28601c6, ((Float) obj).floatValue());
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c5;
                    }
                    Function1 function3 = (Function1) objM87133R7;
                    str2 = str;
                    boolean zM87153g6 = c28655q.m87153g(str2);
                    if ((i15 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z19 | zM87153g6;
                    objM87133R8 = c28655q.m87133R();
                    if (z24) {
                        function1 = onViewEvent;
                        objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function1 = onViewEvent;
                        objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R8;
                    interfaceC28601c7 = interfaceC28601c6;
                    C28655q c28655q3 = c28655q;
                    m124690F(fM36283m2, fM124673e2, fFloatValue2, iM124678j2, iM124671b2, jMo134584toComposableColorWaAFU9c2, layoutWeightElement2, function3, interfaceC4339a2, c28655q3, 12582912, 0);
                    c28655q = c28655q3;
                    aVarM124672c = state.getEndLabel();
                    if (aVarM124672c == null) {
                        c28655q.m87150e0(-1729502159);
                        c28655q.m87173q(false);
                        z26 = false;
                        interfaceC28601c8 = interfaceC28601c4;
                    } else {
                        c28655q.m87150e0(-1729502158);
                        float fM124728s2 = m124728s(interfaceC28601c7);
                        if (r58 == 0) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        if (r58 != 0) {
                            c28655q.m87150e0(1170996154);
                            interfaceC28601c8 = interfaceC28601c4;
                            zM87153g4 = c28655q.m87153g(interfaceC28601c8);
                            objM87133R9 = c28655q.m87133R();
                            if (zM87153g4) {
                                objM87133R9 = new C39163j(interfaceC28601c8, 2);
                                c28655q.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C39163j(interfaceC28601c8, 2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            z26 = false;
                            c28655q.m87173q(false);
                            r10 = (InterfaceC4339a) objM87133R9;
                        } else {
                            interfaceC28601c8 = interfaceC28601c4;
                            z26 = false;
                            c28655q.m87150e0(1171088534);
                            c28655q.m87173q(false);
                            r10 = bVar;
                        }
                        m124688D(aVarM124672c, fM124728s2, z25, r10, c28655q, 0, 0);
                        c28655q.m87173q(z26);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (r58 == 0) {
                        c28655q.m87150e0(-1059328071);
                        c28655q.m87173q(z26);
                        z28 = true;
                    } else {
                        c28655q.m87150e0(-1059328070);
                        aVarM124672c2 = state.getEndLabel();
                        if (aVarM124672c2 != null) {
                            bVarM124680a = aVarM124672c2.getFormat();
                        } else {
                            bVarM124680a = bVar;
                        }
                        if (bVarM124680a == C39155b.b.TIME) {
                            z27 = true;
                        } else {
                            z27 = z26;
                        }
                        if (z27) {
                            interfaceC25312u = interfaceC25312uM124674f;
                            if (interfaceC25312u instanceof C36738b) {
                                c36738b2 = (C36738b) interfaceC25312u;
                            } else {
                                r14 = bVar;
                            }
                            if (r14 != 0) {
                            }
                            r14 = c36738b2;
                            boolean z36 = z26;
                            z28 = true;
                            AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                            c28655q.m87173q(z36);
                        } else {
                            interfaceC25312u = r58;
                        }
                        r14 = c36738b2;
                        r14 = c36738b2;
                        InterfaceC25312u interfaceC25312uM124707W2 = interfaceC25312u;
                        r14 = c36738b2;
                        boolean z37 = z26;
                        z28 = true;
                        AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W2, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                        c28655q.m87173q(z37);
                    }
                    c28655q.m87173q(z28);
                    z15 = z29;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31919h(state, onViewEvent, modifier3, z15, i13, i14);
                }
            }
            i15 |= 3072;
            z13 = z4;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                interfaceC25312uM124674f = state.getPicker();
                strM124677i = state.m124677i();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Float.valueOf(state.getSliderValue()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87147d = c28655q.m87147d(state.getUpperBound());
                objM87133R2 = c28655q.m87133R();
                if (zM87147d) {
                    objM87133R2 = AbstractC28683x.m87272z(Float.valueOf(Math.max(state.getUpperBound(), state.getSliderValue())));
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = AbstractC28683x.m87272z(Float.valueOf(Math.max(state.getUpperBound(), state.getSliderValue())));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                interfaceC28601c3 = (InterfaceC28601c1) c28655q.m87161k(f168372a);
                if (interfaceC28601c3 == null) {
                    interfaceC28601c3 = interfaceC28601c2;
                }
                if (interfaceC25312uM124674f instanceof C36738b) {
                    c36738b = (C36738b) interfaceC25312uM124674f;
                } else {
                    c36738b = null;
                }
                if (c36738b != null) {
                    id4 = c36738b.getId();
                } else {
                    id4 = null;
                }
                zM87153g = c28655q.m87153g(id4);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = AbstractC31061c.m95647w(z16, c28655q);
                } else {
                    objM87133R3 = AbstractC31061c.m95647w(z16, c28655q);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
                cVarM124676h = state.getStartLabel();
                if (cVarM124676h != null) {
                    enumC39333fM124682a = cVarM124676h.getBannerColor();
                } else {
                    enumC39333fM124682a = null;
                }
                if (enumC39333fM124682a == null) {
                    c28655q.m87150e0(-1886097192);
                    c28655q.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q.m87150e0(2017368137);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333fM124682a.mo134584toComposableColorWaAFU9c(c28655q, 0));
                }
                if (state.getStartLabel() == null) {
                    c28655q.m87150e0(-1886036773);
                    c28655q.m87173q(false);
                    z16 = z16;
                    interfaceC28601c4 = interfaceC28601c4;
                    c17919xM31989h2 = null;
                } else {
                    c28655q.m87150e0(-1886036772);
                    if (c17919xM31989h == null) {
                        c28655q.m87150e0(-463859369);
                        long jM125374Y1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite30();
                        c28655q.m87173q(false);
                        j7 = jM125374Y1;
                    } else {
                        c28655q.m87150e0(-463860392);
                        c28655q.m87173q(false);
                        j7 = c17919xM31989h.f69639a;
                    }
                    c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, j7);
                }
                float f17 = ((float) 0.5d) * 4;
                Float fValueOf5 = Float.valueOf(state.getSliderValue());
                i18 = i15 & 14;
                if (i18 != 4) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                boolean z210 = z16;
                objM87133R4 = c28655q.m87133R();
                if (z17) {
                    objM87133R4 = new a(state, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(state, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, fValueOf5);
                Float fValueOf6 = Float.valueOf(state.getUpperBound());
                Float fValueOf7 = Float.valueOf(state.getSliderValue());
                if (i18 != 4) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                zM87153g2 = z18 | c28655q.m87153g(interfaceC28601c3);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R5 = new b(state, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(state, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87255i(interfaceC28601c3, fValueOf6, fValueOf7, (InterfaceC4351m) objM87133R5, c28655q);
                Float fValueOf8 = Float.valueOf(m124728s(interfaceC28601c1));
                zM87153g3 = c28655q.m87153g(interfaceC28601c3);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g3) {
                    objM87133R6 = new c(interfaceC28601c3, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new c(interfaceC28601c3, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87254h(interfaceC28601c3, fValueOf8, (InterfaceC4351m) objM87133R6, c28655q);
                f13 = 8;
                f14 = 1 * f13;
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14);
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k2, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier6 = modifier4;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                c0209i3 = C0217k.f732j;
                InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c3;
                if (c28655q.f115903S) {
                    interfaceC28601c5 = interfaceC28601c1;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (c17919xM31989h2 != null) {
                        modifierM124708X = c2314t;
                    } else {
                        modifierM124708X = c2314t;
                    }
                    Modifier modifierMo3471e3 = modifierM3409f5.mo3471e(modifierM124708X);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k2, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                    cVarM124676h2 = state.getStartLabel();
                    if (cVarM124676h2 == null) {
                        c28655q.m87150e0(122565642);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i;
                        c0213j2 = c0213j;
                        c0209i6 = c0209i4;
                        i19 = 0;
                        c0209i7 = c0209i3;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        f15 = f13;
                        str = strM124677i;
                        bVar = null;
                    } else {
                        c28655q.m87150e0(122565643);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 54);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                        String strM124684c3 = cVarM124676h2.getTitle();
                        c38072d = C38072d.f163053a;
                        c0209i5 = c0209i;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i4;
                        c28676v1 = c28676v0;
                        f15 = f13;
                        c0213j2 = c0213j;
                        c0209i7 = c0209i3;
                        str = strM124677i;
                        i19 = 0;
                        bVar = null;
                        AbstractC30795n.m94707h(strM124684c3, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh3(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        strM124683b = cVarM124676h2.getSubtitle();
                        if (strM124683b == null) {
                            c28655q.m87150e0(-334121691);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-334121690);
                            AbstractC30795n.m94707h(strM124683b, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q3);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N11);
                    if (1.0f > 0.0d) {
                        i24 = 1;
                    } else {
                        i24 = i19;
                    }
                    if (i24 == 0) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    float fM36283m3 = AbstractC12889b.m36283m(m124728s(interfaceC28601c5), state.getLowerBound(), ((Number) interfaceC28601c10.getValue()).floatValue());
                    float fM124673e3 = state.getLowerBound();
                    float fFloatValue3 = ((Number) interfaceC28601c10.getValue()).floatValue();
                    int iM124678j3 = state.getStepSize();
                    int iM124671b3 = state.getBarThickness();
                    long jMo134584toComposableColorWaAFU9c3 = state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q, i19);
                    objM87133R7 = c28655q.m87133R();
                    c28676v2 = c28676v1;
                    if (objM87133R7 == c28676v2) {
                        interfaceC28601c6 = interfaceC28601c5;
                        objM87133R7 = new Function1() { // from class: y21.c
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC39162i.m124729t(interfaceC28601c6, ((Float) obj).floatValue());
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c5;
                    }
                    Function1 function4 = (Function1) objM87133R7;
                    str2 = str;
                    boolean zM87153g7 = c28655q.m87153g(str2);
                    if ((i15 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z19 | zM87153g7;
                    objM87133R8 = c28655q.m87133R();
                    if (z24) {
                        function1 = onViewEvent;
                        objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function1 = onViewEvent;
                        objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R8;
                    interfaceC28601c7 = interfaceC28601c6;
                    C28655q c28655q4 = c28655q;
                    m124690F(fM36283m3, fM124673e3, fFloatValue3, iM124678j3, iM124671b3, jMo134584toComposableColorWaAFU9c3, layoutWeightElement3, function4, interfaceC4339a3, c28655q4, 12582912, 0);
                    c28655q = c28655q4;
                    aVarM124672c = state.getEndLabel();
                    if (aVarM124672c == null) {
                        c28655q.m87150e0(-1729502159);
                        c28655q.m87173q(false);
                        z26 = false;
                        interfaceC28601c8 = interfaceC28601c4;
                    } else {
                        c28655q.m87150e0(-1729502158);
                        float fM124728s3 = m124728s(interfaceC28601c7);
                        if (r58 == 0) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        if (r58 != 0) {
                            c28655q.m87150e0(1170996154);
                            interfaceC28601c8 = interfaceC28601c4;
                            zM87153g4 = c28655q.m87153g(interfaceC28601c8);
                            objM87133R9 = c28655q.m87133R();
                            if (zM87153g4) {
                                objM87133R9 = new C39163j(interfaceC28601c8, 2);
                                c28655q.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C39163j(interfaceC28601c8, 2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            z26 = false;
                            c28655q.m87173q(false);
                            r10 = (InterfaceC4339a) objM87133R9;
                        } else {
                            interfaceC28601c8 = interfaceC28601c4;
                            z26 = false;
                            c28655q.m87150e0(1171088534);
                            c28655q.m87173q(false);
                            r10 = bVar;
                        }
                        m124688D(aVarM124672c, fM124728s3, z25, r10, c28655q, 0, 0);
                        c28655q.m87173q(z26);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (r58 == 0) {
                        c28655q.m87150e0(-1059328071);
                        c28655q.m87173q(z26);
                        z28 = true;
                    } else {
                        c28655q.m87150e0(-1059328070);
                        aVarM124672c2 = state.getEndLabel();
                        if (aVarM124672c2 != null) {
                            bVarM124680a = aVarM124672c2.getFormat();
                        } else {
                            bVarM124680a = bVar;
                        }
                        if (bVarM124680a == C39155b.b.TIME) {
                            z27 = true;
                        } else {
                            z27 = z26;
                        }
                        if (z27) {
                            interfaceC25312u = interfaceC25312uM124674f;
                            if (interfaceC25312u instanceof C36738b) {
                                c36738b2 = (C36738b) interfaceC25312u;
                            } else {
                                r14 = bVar;
                            }
                            if (r14 != 0) {
                            }
                            r14 = c36738b2;
                            boolean z38 = z26;
                            z28 = true;
                            AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W2, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                            c28655q.m87173q(z38);
                        } else {
                            interfaceC25312u = r58;
                        }
                        r14 = c36738b2;
                        r14 = c36738b2;
                        InterfaceC25312u interfaceC25312uM124707W3 = interfaceC25312u;
                        r14 = c36738b2;
                        boolean z39 = z26;
                        z28 = true;
                        AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W3, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                        c28655q.m87173q(z39);
                    }
                    c28655q.m87173q(z28);
                    z15 = z210;
                    modifier3 = modifier6;
                } else {
                    interfaceC28601c5 = interfaceC28601c1;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (c17919xM31989h2 != null) {
                    modifierM124708X = c2314t;
                } else {
                    modifierM124708X = c2314t;
                }
                Modifier modifierMo3471e4 = modifierM3409f7.mo3471e(modifierM124708X);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k2, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                cVarM124676h2 = state.getStartLabel();
                if (cVarM124676h2 == null) {
                    c28655q.m87150e0(122565642);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i;
                    c0213j2 = c0213j;
                    c0209i6 = c0209i4;
                    i19 = 0;
                    c0209i7 = c0209i3;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    f15 = f13;
                    str = strM124677i;
                    bVar = null;
                } else {
                    c28655q.m87150e0(122565643);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                    String strM124684c4 = cVarM124676h2.getTitle();
                    c38072d = C38072d.f163053a;
                    c0209i5 = c0209i;
                    c2314t2 = c2314t;
                    c0209i6 = c0209i4;
                    c28676v1 = c28676v0;
                    f15 = f13;
                    c0213j2 = c0213j;
                    c0209i7 = c0209i3;
                    str = strM124677i;
                    i19 = 0;
                    bVar = null;
                    AbstractC30795n.m94707h(strM124684c4, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh3(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    strM124683b = cVarM124676h2.getSubtitle();
                    if (strM124683b == null) {
                        c28655q.m87150e0(-334121691);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-334121690);
                        AbstractC30795n.m94707h(strM124683b, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M53376q4 = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N14);
                if (1.0f > 0.0d) {
                    i24 = 1;
                } else {
                    i24 = i19;
                }
                if (i24 == 0) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                float fM36283m4 = AbstractC12889b.m36283m(m124728s(interfaceC28601c5), state.getLowerBound(), ((Number) interfaceC28601c10.getValue()).floatValue());
                float fM124673e4 = state.getLowerBound();
                float fFloatValue4 = ((Number) interfaceC28601c10.getValue()).floatValue();
                int iM124678j4 = state.getStepSize();
                int iM124671b4 = state.getBarThickness();
                long jMo134584toComposableColorWaAFU9c4 = state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q, i19);
                objM87133R7 = c28655q.m87133R();
                c28676v2 = c28676v1;
                if (objM87133R7 == c28676v2) {
                    interfaceC28601c6 = interfaceC28601c5;
                    objM87133R7 = new Function1() { // from class: y21.c
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC39162i.m124729t(interfaceC28601c6, ((Float) obj).floatValue());
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c6 = interfaceC28601c5;
                }
                Function1 function5 = (Function1) objM87133R7;
                str2 = str;
                boolean zM87153g8 = c28655q.m87153g(str2);
                if ((i15 & 112) == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z19 | zM87153g8;
                objM87133R8 = c28655q.m87133R();
                if (z24) {
                    function1 = onViewEvent;
                    objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function1 = onViewEvent;
                    objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                interfaceC28601c7 = interfaceC28601c6;
                C28655q c28655q5 = c28655q;
                m124690F(fM36283m4, fM124673e4, fFloatValue4, iM124678j4, iM124671b4, jMo134584toComposableColorWaAFU9c4, layoutWeightElement4, function5, interfaceC4339a4, c28655q5, 12582912, 0);
                c28655q = c28655q5;
                aVarM124672c = state.getEndLabel();
                if (aVarM124672c == null) {
                    c28655q.m87150e0(-1729502159);
                    c28655q.m87173q(false);
                    z26 = false;
                    interfaceC28601c8 = interfaceC28601c4;
                } else {
                    c28655q.m87150e0(-1729502158);
                    float fM124728s4 = m124728s(interfaceC28601c7);
                    if (r58 == 0) {
                        z25 = false;
                    } else {
                        z25 = false;
                    }
                    if (r58 != 0) {
                        c28655q.m87150e0(1170996154);
                        interfaceC28601c8 = interfaceC28601c4;
                        zM87153g4 = c28655q.m87153g(interfaceC28601c8);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R9 = new C39163j(interfaceC28601c8, 2);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C39163j(interfaceC28601c8, 2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        z26 = false;
                        c28655q.m87173q(false);
                        r10 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC28601c8 = interfaceC28601c4;
                        z26 = false;
                        c28655q.m87150e0(1171088534);
                        c28655q.m87173q(false);
                        r10 = bVar;
                    }
                    m124688D(aVarM124672c, fM124728s4, z25, r10, c28655q, 0, 0);
                    c28655q.m87173q(z26);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (r58 == 0) {
                    c28655q.m87150e0(-1059328071);
                    c28655q.m87173q(z26);
                    z28 = true;
                } else {
                    c28655q.m87150e0(-1059328070);
                    aVarM124672c2 = state.getEndLabel();
                    if (aVarM124672c2 != null) {
                        bVarM124680a = aVarM124672c2.getFormat();
                    } else {
                        bVarM124680a = bVar;
                    }
                    if (bVarM124680a == C39155b.b.TIME) {
                        z27 = true;
                    } else {
                        z27 = z26;
                    }
                    if (z27) {
                        interfaceC25312u = interfaceC25312uM124674f;
                        if (interfaceC25312u instanceof C36738b) {
                            c36738b2 = (C36738b) interfaceC25312u;
                        } else {
                            r14 = bVar;
                        }
                        if (r14 != 0) {
                        }
                        r14 = c36738b2;
                        boolean z310 = z26;
                        z28 = true;
                        AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W3, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                        c28655q.m87173q(z310);
                    } else {
                        interfaceC25312u = r58;
                    }
                    r14 = c36738b2;
                    r14 = c36738b2;
                    InterfaceC25312u interfaceC25312uM124707W4 = interfaceC25312u;
                    r14 = c36738b2;
                    boolean z311 = z26;
                    z28 = true;
                    AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W4, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                    c28655q.m87173q(z311);
                }
                c28655q.m87173q(z28);
                z15 = z210;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(state, onViewEvent, modifier3, z15, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                interfaceC25312uM124674f = state.getPicker();
                strM124677i = state.m124677i();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Float.valueOf(state.getSliderValue()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87147d = c28655q.m87147d(state.getUpperBound());
                objM87133R2 = c28655q.m87133R();
                if (zM87147d) {
                    objM87133R2 = AbstractC28683x.m87272z(Float.valueOf(Math.max(state.getUpperBound(), state.getSliderValue())));
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = AbstractC28683x.m87272z(Float.valueOf(Math.max(state.getUpperBound(), state.getSliderValue())));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                interfaceC28601c3 = (InterfaceC28601c1) c28655q.m87161k(f168372a);
                if (interfaceC28601c3 == null) {
                    interfaceC28601c3 = interfaceC28601c2;
                }
                if (interfaceC25312uM124674f instanceof C36738b) {
                    c36738b = (C36738b) interfaceC25312uM124674f;
                } else {
                    c36738b = null;
                }
                if (c36738b != null) {
                    id4 = c36738b.getId();
                } else {
                    id4 = null;
                }
                zM87153g = c28655q.m87153g(id4);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = AbstractC31061c.m95647w(z16, c28655q);
                } else {
                    objM87133R3 = AbstractC31061c.m95647w(z16, c28655q);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
                cVarM124676h = state.getStartLabel();
                if (cVarM124676h != null) {
                    enumC39333fM124682a = cVarM124676h.getBannerColor();
                } else {
                    enumC39333fM124682a = null;
                }
                if (enumC39333fM124682a == null) {
                    c28655q.m87150e0(-1886097192);
                    c28655q.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q.m87150e0(2017368137);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333fM124682a.mo134584toComposableColorWaAFU9c(c28655q, 0));
                }
                if (state.getStartLabel() == null) {
                    c28655q.m87150e0(-1886036773);
                    c28655q.m87173q(false);
                    z16 = z16;
                    interfaceC28601c4 = interfaceC28601c4;
                    c17919xM31989h2 = null;
                } else {
                    c28655q.m87150e0(-1886036772);
                    if (c17919xM31989h == null) {
                        c28655q.m87150e0(-463859369);
                        long jM125374Y2 = C38072d.f163053a.m121949b(c28655q, 6).getWhite30();
                        c28655q.m87173q(false);
                        j7 = jM125374Y2;
                    } else {
                        c28655q.m87150e0(-463860392);
                        c28655q.m87173q(false);
                        j7 = c17919xM31989h.f69639a;
                    }
                    c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, j7);
                }
                float f18 = ((float) 0.5d) * 4;
                Float fValueOf9 = Float.valueOf(state.getSliderValue());
                i18 = i15 & 14;
                if (i18 != 4) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                boolean z211 = z16;
                objM87133R4 = c28655q.m87133R();
                if (z17) {
                    objM87133R4 = new a(state, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(state, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, fValueOf9);
                Float fValueOf10 = Float.valueOf(state.getUpperBound());
                Float fValueOf11 = Float.valueOf(state.getSliderValue());
                if (i18 != 4) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                zM87153g2 = z18 | c28655q.m87153g(interfaceC28601c3);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R5 = new b(state, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(state, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87255i(interfaceC28601c3, fValueOf10, fValueOf11, (InterfaceC4351m) objM87133R5, c28655q);
                Float fValueOf12 = Float.valueOf(m124728s(interfaceC28601c1));
                zM87153g3 = c28655q.m87153g(interfaceC28601c3);
                objM87133R6 = c28655q.m87133R();
                if (zM87153g3) {
                    objM87133R6 = new c(interfaceC28601c3, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new c(interfaceC28601c3, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87254h(interfaceC28601c3, fValueOf12, (InterfaceC4351m) objM87133R6, c28655q);
                f13 = 8;
                f14 = 1 * f13;
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f14);
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22971kM66746i3, c2305k3, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                Modifier modifier7 = modifier4;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a7);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                c0209i3 = C0217k.f732j;
                InterfaceC28601c1 interfaceC28601c11 = interfaceC28601c3;
                if (c28655q.f115903S) {
                    interfaceC28601c5 = interfaceC28601c1;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                    Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (c17919xM31989h2 != null) {
                        modifierM124708X = c2314t;
                    } else {
                        modifierM124708X = c2314t;
                    }
                    Modifier modifierMo3471e5 = modifierM3409f9.mo3471e(modifierM124708X);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k3, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                    cVarM124676h2 = state.getStartLabel();
                    if (cVarM124676h2 == null) {
                        c28655q.m87150e0(122565642);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i;
                        c0213j2 = c0213j;
                        c0209i6 = c0209i4;
                        i19 = 0;
                        c0209i7 = c0209i3;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        f15 = f13;
                        str = strM124677i;
                        bVar = null;
                    } else {
                        c28655q.m87150e0(122565643);
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 54);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m17);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N17);
                        String strM124684c5 = cVarM124676h2.getTitle();
                        c38072d = C38072d.f163053a;
                        c0209i5 = c0209i;
                        c2314t2 = c2314t;
                        c0209i6 = c0209i4;
                        c28676v1 = c28676v0;
                        f15 = f13;
                        c0213j2 = c0213j;
                        c0209i7 = c0209i3;
                        str = strM124677i;
                        i19 = 0;
                        bVar = null;
                        AbstractC30795n.m94707h(strM124684c5, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh3(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        strM124683b = cVarM124676h2.getSubtitle();
                        if (strM124683b == null) {
                            c28655q.m87150e0(-334121691);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-334121690);
                            AbstractC30795n.m94707h(strM124683b, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C22994r1 c22994r1M53376q5 = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3409f10);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q5);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m18);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N18);
                    if (1.0f > 0.0d) {
                        i24 = 1;
                    } else {
                        i24 = i19;
                    }
                    if (i24 == 0) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                    float fM36283m5 = AbstractC12889b.m36283m(m124728s(interfaceC28601c5), state.getLowerBound(), ((Number) interfaceC28601c11.getValue()).floatValue());
                    float fM124673e5 = state.getLowerBound();
                    float fFloatValue5 = ((Number) interfaceC28601c11.getValue()).floatValue();
                    int iM124678j5 = state.getStepSize();
                    int iM124671b5 = state.getBarThickness();
                    long jMo134584toComposableColorWaAFU9c5 = state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q, i19);
                    objM87133R7 = c28655q.m87133R();
                    c28676v2 = c28676v1;
                    if (objM87133R7 == c28676v2) {
                        interfaceC28601c6 = interfaceC28601c5;
                        objM87133R7 = new Function1() { // from class: y21.c
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC39162i.m124729t(interfaceC28601c6, ((Float) obj).floatValue());
                            }
                        };
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        interfaceC28601c6 = interfaceC28601c5;
                    }
                    Function1 function6 = (Function1) objM87133R7;
                    str2 = str;
                    boolean zM87153g9 = c28655q.m87153g(str2);
                    if ((i15 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z19 | zM87153g9;
                    objM87133R8 = c28655q.m87133R();
                    if (z24) {
                        function1 = onViewEvent;
                        objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function1 = onViewEvent;
                        objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R8;
                    interfaceC28601c7 = interfaceC28601c6;
                    C28655q c28655q6 = c28655q;
                    m124690F(fM36283m5, fM124673e5, fFloatValue5, iM124678j5, iM124671b5, jMo134584toComposableColorWaAFU9c5, layoutWeightElement5, function6, interfaceC4339a5, c28655q6, 12582912, 0);
                    c28655q = c28655q6;
                    aVarM124672c = state.getEndLabel();
                    if (aVarM124672c == null) {
                        c28655q.m87150e0(-1729502159);
                        c28655q.m87173q(false);
                        z26 = false;
                        interfaceC28601c8 = interfaceC28601c4;
                    } else {
                        c28655q.m87150e0(-1729502158);
                        float fM124728s5 = m124728s(interfaceC28601c7);
                        if (r58 == 0) {
                            z25 = false;
                        } else {
                            z25 = false;
                        }
                        if (r58 != 0) {
                            c28655q.m87150e0(1170996154);
                            interfaceC28601c8 = interfaceC28601c4;
                            zM87153g4 = c28655q.m87153g(interfaceC28601c8);
                            objM87133R9 = c28655q.m87133R();
                            if (zM87153g4) {
                                objM87133R9 = new C39163j(interfaceC28601c8, 2);
                                c28655q.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C39163j(interfaceC28601c8, 2);
                                c28655q.m87172p0(objM87133R9);
                            }
                            z26 = false;
                            c28655q.m87173q(false);
                            r10 = (InterfaceC4339a) objM87133R9;
                        } else {
                            interfaceC28601c8 = interfaceC28601c4;
                            z26 = false;
                            c28655q.m87150e0(1171088534);
                            c28655q.m87173q(false);
                            r10 = bVar;
                        }
                        m124688D(aVarM124672c, fM124728s5, z25, r10, c28655q, 0, 0);
                        c28655q.m87173q(z26);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (r58 == 0) {
                        c28655q.m87150e0(-1059328071);
                        c28655q.m87173q(z26);
                        z28 = true;
                    } else {
                        c28655q.m87150e0(-1059328070);
                        aVarM124672c2 = state.getEndLabel();
                        if (aVarM124672c2 != null) {
                            bVarM124680a = aVarM124672c2.getFormat();
                        } else {
                            bVarM124680a = bVar;
                        }
                        if (bVarM124680a == C39155b.b.TIME) {
                            z27 = true;
                        } else {
                            z27 = z26;
                        }
                        if (z27) {
                            interfaceC25312u = interfaceC25312uM124674f;
                            if (interfaceC25312u instanceof C36738b) {
                                c36738b2 = (C36738b) interfaceC25312u;
                            } else {
                                r14 = bVar;
                            }
                            if (r14 != 0) {
                            }
                            r14 = c36738b2;
                            boolean z312 = z26;
                            z28 = true;
                            AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W4, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                            c28655q.m87173q(z312);
                        } else {
                            interfaceC25312u = r58;
                        }
                        r14 = c36738b2;
                        r14 = c36738b2;
                        InterfaceC25312u interfaceC25312uM124707W5 = interfaceC25312u;
                        r14 = c36738b2;
                        boolean z313 = z26;
                        z28 = true;
                        AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W5, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                        c28655q.m87173q(z313);
                    }
                    c28655q.m87173q(z28);
                    z15 = z211;
                    modifier3 = modifier7;
                } else {
                    interfaceC28601c5 = interfaceC28601c1;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (c17919xM31989h2 != null) {
                    modifierM124708X = c2314t;
                } else {
                    modifierM124708X = c2314t;
                }
                Modifier modifierMo3471e6 = modifierM3409f11.mo3471e(modifierM124708X);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k3, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m19);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N19);
                cVarM124676h2 = state.getStartLabel();
                if (cVarM124676h2 == null) {
                    c28655q.m87150e0(122565642);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i;
                    c0213j2 = c0213j;
                    c0209i6 = c0209i4;
                    i19 = 0;
                    c0209i7 = c0209i3;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    f15 = f13;
                    str = strM124677i;
                    bVar = null;
                } else {
                    c28655q.m87150e0(122565643);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N110);
                    String strM124684c6 = cVarM124676h2.getTitle();
                    c38072d = C38072d.f163053a;
                    c0209i5 = c0209i;
                    c2314t2 = c2314t;
                    c0209i6 = c0209i4;
                    c28676v1 = c28676v0;
                    f15 = f13;
                    c0213j2 = c0213j;
                    c0209i7 = c0209i3;
                    str = strM124677i;
                    i19 = 0;
                    bVar = null;
                    AbstractC30795n.m94707h(strM124684c6, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh3(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    strM124683b = cVarM124676h2.getSubtitle();
                    if (strM124683b == null) {
                        c28655q.m87150e0(-334121691);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-334121690);
                        AbstractC30795n.m94707h(strM124683b, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M53376q6 = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3409f12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q6);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N111);
                if (1.0f > 0.0d) {
                    i24 = 1;
                } else {
                    i24 = i19;
                }
                if (i24 == 0) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                float fM36283m6 = AbstractC12889b.m36283m(m124728s(interfaceC28601c5), state.getLowerBound(), ((Number) interfaceC28601c11.getValue()).floatValue());
                float fM124673e6 = state.getLowerBound();
                float fFloatValue6 = ((Number) interfaceC28601c11.getValue()).floatValue();
                int iM124678j6 = state.getStepSize();
                int iM124671b6 = state.getBarThickness();
                long jMo134584toComposableColorWaAFU9c6 = state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q, i19);
                objM87133R7 = c28655q.m87133R();
                c28676v2 = c28676v1;
                if (objM87133R7 == c28676v2) {
                    interfaceC28601c6 = interfaceC28601c5;
                    objM87133R7 = new Function1() { // from class: y21.c
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC39162i.m124729t(interfaceC28601c6, ((Float) obj).floatValue());
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c6 = interfaceC28601c5;
                }
                Function1 function7 = (Function1) objM87133R7;
                str2 = str;
                boolean zM87153g10 = c28655q.m87153g(str2);
                if ((i15 & 112) == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z19 | zM87153g10;
                objM87133R8 = c28655q.m87133R();
                if (z24) {
                    function1 = onViewEvent;
                    objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function1 = onViewEvent;
                    objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                interfaceC28601c7 = interfaceC28601c6;
                C28655q c28655q7 = c28655q;
                m124690F(fM36283m6, fM124673e6, fFloatValue6, iM124678j6, iM124671b6, jMo134584toComposableColorWaAFU9c6, layoutWeightElement6, function7, interfaceC4339a6, c28655q7, 12582912, 0);
                c28655q = c28655q7;
                aVarM124672c = state.getEndLabel();
                if (aVarM124672c == null) {
                    c28655q.m87150e0(-1729502159);
                    c28655q.m87173q(false);
                    z26 = false;
                    interfaceC28601c8 = interfaceC28601c4;
                } else {
                    c28655q.m87150e0(-1729502158);
                    float fM124728s6 = m124728s(interfaceC28601c7);
                    if (r58 == 0) {
                        z25 = false;
                    } else {
                        z25 = false;
                    }
                    if (r58 != 0) {
                        c28655q.m87150e0(1170996154);
                        interfaceC28601c8 = interfaceC28601c4;
                        zM87153g4 = c28655q.m87153g(interfaceC28601c8);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R9 = new C39163j(interfaceC28601c8, 2);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C39163j(interfaceC28601c8, 2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        z26 = false;
                        c28655q.m87173q(false);
                        r10 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC28601c8 = interfaceC28601c4;
                        z26 = false;
                        c28655q.m87150e0(1171088534);
                        c28655q.m87173q(false);
                        r10 = bVar;
                    }
                    m124688D(aVarM124672c, fM124728s6, z25, r10, c28655q, 0, 0);
                    c28655q.m87173q(z26);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (r58 == 0) {
                    c28655q.m87150e0(-1059328071);
                    c28655q.m87173q(z26);
                    z28 = true;
                } else {
                    c28655q.m87150e0(-1059328070);
                    aVarM124672c2 = state.getEndLabel();
                    if (aVarM124672c2 != null) {
                        bVarM124680a = aVarM124672c2.getFormat();
                    } else {
                        bVarM124680a = bVar;
                    }
                    if (bVarM124680a == C39155b.b.TIME) {
                        z27 = true;
                    } else {
                        z27 = z26;
                    }
                    if (z27) {
                        interfaceC25312u = interfaceC25312uM124674f;
                        if (interfaceC25312u instanceof C36738b) {
                            c36738b2 = (C36738b) interfaceC25312u;
                        } else {
                            r14 = bVar;
                        }
                        if (r14 != 0) {
                        }
                        r14 = c36738b2;
                        boolean z314 = z26;
                        z28 = true;
                        AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W5, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                        c28655q.m87173q(z314);
                    } else {
                        interfaceC25312u = r58;
                    }
                    r14 = c36738b2;
                    r14 = c36738b2;
                    InterfaceC25312u interfaceC25312uM124707W6 = interfaceC25312u;
                    r14 = c36738b2;
                    boolean z315 = z26;
                    z28 = true;
                    AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W6, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                    c28655q.m87173q(z315);
                }
                c28655q.m87173q(z28);
                z15 = z211;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(state, onViewEvent, modifier3, z15, i13, i14);
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            interfaceC25312uM124674f = state.getPicker();
            strM124677i = state.m124677i();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Float.valueOf(state.getSliderValue()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zM87147d = c28655q.m87147d(state.getUpperBound());
            objM87133R2 = c28655q.m87133R();
            if (zM87147d) {
                objM87133R2 = AbstractC28683x.m87272z(Float.valueOf(Math.max(state.getUpperBound(), state.getSliderValue())));
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = AbstractC28683x.m87272z(Float.valueOf(Math.max(state.getUpperBound(), state.getSliderValue())));
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            interfaceC28601c3 = (InterfaceC28601c1) c28655q.m87161k(f168372a);
            if (interfaceC28601c3 == null) {
                interfaceC28601c3 = interfaceC28601c2;
            }
            if (interfaceC25312uM124674f instanceof C36738b) {
                c36738b = (C36738b) interfaceC25312uM124674f;
            } else {
                c36738b = null;
            }
            if (c36738b != null) {
                id4 = c36738b.getId();
            } else {
                id4 = null;
            }
            zM87153g = c28655q.m87153g(id4);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = AbstractC31061c.m95647w(z16, c28655q);
            } else {
                objM87133R3 = AbstractC31061c.m95647w(z16, c28655q);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
            cVarM124676h = state.getStartLabel();
            if (cVarM124676h != null) {
                enumC39333fM124682a = cVarM124676h.getBannerColor();
            } else {
                enumC39333fM124682a = null;
            }
            if (enumC39333fM124682a == null) {
                c28655q.m87150e0(-1886097192);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(2017368137);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333fM124682a.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            if (state.getStartLabel() == null) {
                c28655q.m87150e0(-1886036773);
                c28655q.m87173q(false);
                z16 = z16;
                interfaceC28601c4 = interfaceC28601c4;
                c17919xM31989h2 = null;
            } else {
                c28655q.m87150e0(-1886036772);
                if (c17919xM31989h == null) {
                    c28655q.m87150e0(-463859369);
                    long jM125374Y3 = C38072d.f163053a.m121949b(c28655q, 6).getWhite30();
                    c28655q.m87173q(false);
                    j7 = jM125374Y3;
                } else {
                    c28655q.m87150e0(-463860392);
                    c28655q.m87173q(false);
                    j7 = c17919xM31989h.f69639a;
                }
                c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, j7);
            }
            float f19 = ((float) 0.5d) * 4;
            Float fValueOf13 = Float.valueOf(state.getSliderValue());
            i18 = i15 & 14;
            if (i18 != 4) {
                z17 = true;
            } else {
                z17 = true;
            }
            boolean z212 = z16;
            objM87133R4 = c28655q.m87133R();
            if (z17) {
                objM87133R4 = new a(state, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(state, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, fValueOf13);
            Float fValueOf14 = Float.valueOf(state.getUpperBound());
            Float fValueOf15 = Float.valueOf(state.getSliderValue());
            if (i18 != 4) {
                z18 = true;
            } else {
                z18 = true;
            }
            zM87153g2 = z18 | c28655q.m87153g(interfaceC28601c3);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R5 = new b(state, interfaceC28601c3, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new b(state, interfaceC28601c3, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87255i(interfaceC28601c3, fValueOf14, fValueOf15, (InterfaceC4351m) objM87133R5, c28655q);
            Float fValueOf16 = Float.valueOf(m124728s(interfaceC28601c1));
            zM87153g3 = c28655q.m87153g(interfaceC28601c3);
            objM87133R6 = c28655q.m87133R();
            if (zM87153g3) {
                objM87133R6 = new c(interfaceC28601c3, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new c(interfaceC28601c3, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87254h(interfaceC28601c3, fValueOf16, (InterfaceC4351m) objM87133R6, c28655q);
            f13 = 8;
            f14 = 1 * f13;
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f14);
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22971kM66746i4, c2305k4, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier8 = modifier4;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a10);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m112);
            c0209i3 = C0217k.f732j;
            InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c3;
            if (c28655q.f115903S) {
                interfaceC28601c5 = interfaceC28601c1;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
                Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (c17919xM31989h2 != null) {
                    modifierM124708X = c2314t;
                } else {
                    modifierM124708X = c2314t;
                }
                Modifier modifierMo3471e7 = modifierM3409f13.mo3471e(modifierM124708X);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k4, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m113);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N113);
                cVarM124676h2 = state.getStartLabel();
                if (cVarM124676h2 == null) {
                    c28655q.m87150e0(122565642);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i;
                    c0213j2 = c0213j;
                    c0209i6 = c0209i4;
                    i19 = 0;
                    c0209i7 = c0209i3;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    f15 = f13;
                    str = strM124677i;
                    bVar = null;
                } else {
                    c28655q.m87150e0(122565643);
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N114);
                    String strM124684c7 = cVarM124676h2.getTitle();
                    c38072d = C38072d.f163053a;
                    c0209i5 = c0209i;
                    c2314t2 = c2314t;
                    c0209i6 = c0209i4;
                    c28676v1 = c28676v0;
                    f15 = f13;
                    c0213j2 = c0213j;
                    c0209i7 = c0209i3;
                    str = strM124677i;
                    i19 = 0;
                    bVar = null;
                    AbstractC30795n.m94707h(strM124684c7, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh3(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    strM124683b = cVarM124676h2.getSubtitle();
                    if (strM124683b == null) {
                        c28655q.m87150e0(-334121691);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-334121690);
                        AbstractC30795n.m94707h(strM124683b, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M53376q7 = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM3409f14);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q7);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N115);
                if (1.0f > 0.0d) {
                    i24 = 1;
                } else {
                    i24 = i19;
                }
                if (i24 == 0) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                float fM36283m7 = AbstractC12889b.m36283m(m124728s(interfaceC28601c5), state.getLowerBound(), ((Number) interfaceC28601c12.getValue()).floatValue());
                float fM124673e7 = state.getLowerBound();
                float fFloatValue7 = ((Number) interfaceC28601c12.getValue()).floatValue();
                int iM124678j7 = state.getStepSize();
                int iM124671b7 = state.getBarThickness();
                long jMo134584toComposableColorWaAFU9c7 = state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q, i19);
                objM87133R7 = c28655q.m87133R();
                c28676v2 = c28676v1;
                if (objM87133R7 == c28676v2) {
                    interfaceC28601c6 = interfaceC28601c5;
                    objM87133R7 = new Function1() { // from class: y21.c
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC39162i.m124729t(interfaceC28601c6, ((Float) obj).floatValue());
                        }
                    };
                    c28655q.m87172p0(objM87133R7);
                } else {
                    interfaceC28601c6 = interfaceC28601c5;
                }
                Function1 function8 = (Function1) objM87133R7;
                str2 = str;
                boolean zM87153g11 = c28655q.m87153g(str2);
                if ((i15 & 112) == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z19 | zM87153g11;
                objM87133R8 = c28655q.m87133R();
                if (z24) {
                    function1 = onViewEvent;
                    objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function1 = onViewEvent;
                    objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R8;
                interfaceC28601c7 = interfaceC28601c6;
                C28655q c28655q8 = c28655q;
                m124690F(fM36283m7, fM124673e7, fFloatValue7, iM124678j7, iM124671b7, jMo134584toComposableColorWaAFU9c7, layoutWeightElement7, function8, interfaceC4339a7, c28655q8, 12582912, 0);
                c28655q = c28655q8;
                aVarM124672c = state.getEndLabel();
                if (aVarM124672c == null) {
                    c28655q.m87150e0(-1729502159);
                    c28655q.m87173q(false);
                    z26 = false;
                    interfaceC28601c8 = interfaceC28601c4;
                } else {
                    c28655q.m87150e0(-1729502158);
                    float fM124728s7 = m124728s(interfaceC28601c7);
                    if (r58 == 0) {
                        z25 = false;
                    } else {
                        z25 = false;
                    }
                    if (r58 != 0) {
                        c28655q.m87150e0(1170996154);
                        interfaceC28601c8 = interfaceC28601c4;
                        zM87153g4 = c28655q.m87153g(interfaceC28601c8);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87153g4) {
                            objM87133R9 = new C39163j(interfaceC28601c8, 2);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C39163j(interfaceC28601c8, 2);
                            c28655q.m87172p0(objM87133R9);
                        }
                        z26 = false;
                        c28655q.m87173q(false);
                        r10 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC28601c8 = interfaceC28601c4;
                        z26 = false;
                        c28655q.m87150e0(1171088534);
                        c28655q.m87173q(false);
                        r10 = bVar;
                    }
                    m124688D(aVarM124672c, fM124728s7, z25, r10, c28655q, 0, 0);
                    c28655q.m87173q(z26);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (r58 == 0) {
                    c28655q.m87150e0(-1059328071);
                    c28655q.m87173q(z26);
                    z28 = true;
                } else {
                    c28655q.m87150e0(-1059328070);
                    aVarM124672c2 = state.getEndLabel();
                    if (aVarM124672c2 != null) {
                        bVarM124680a = aVarM124672c2.getFormat();
                    } else {
                        bVarM124680a = bVar;
                    }
                    if (bVarM124680a == C39155b.b.TIME) {
                        z27 = true;
                    } else {
                        z27 = z26;
                    }
                    if (z27) {
                        interfaceC25312u = interfaceC25312uM124674f;
                        if (interfaceC25312u instanceof C36738b) {
                            c36738b2 = (C36738b) interfaceC25312u;
                        } else {
                            r14 = bVar;
                        }
                        if (r14 != 0) {
                        }
                        r14 = c36738b2;
                        boolean z316 = z26;
                        z28 = true;
                        AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W6, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                        c28655q.m87173q(z316);
                    } else {
                        interfaceC25312u = r58;
                    }
                    r14 = c36738b2;
                    r14 = c36738b2;
                    InterfaceC25312u interfaceC25312uM124707W7 = interfaceC25312u;
                    r14 = c36738b2;
                    boolean z317 = z26;
                    z28 = true;
                    AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W7, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                    c28655q.m87173q(z317);
                }
                c28655q.m87173q(z28);
                z15 = z212;
                modifier3 = modifier8;
            } else {
                interfaceC28601c5 = interfaceC28601c1;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
            Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t);
            if (c17919xM31989h2 != null) {
                modifierM124708X = c2314t;
            } else {
                modifierM124708X = c2314t;
            }
            Modifier modifierMo3471e8 = modifierM3409f15.mo3471e(modifierM124708X);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k4, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m116);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N116);
            cVarM124676h2 = state.getStartLabel();
            if (cVarM124676h2 == null) {
                c28655q.m87150e0(122565642);
                c28655q.m87173q(false);
                c0209i5 = c0209i;
                c0213j2 = c0213j;
                c0209i6 = c0209i4;
                i19 = 0;
                c0209i7 = c0209i3;
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                f15 = f13;
                str = strM124677i;
                bVar = null;
            } else {
                c28655q.m87150e0(122565643);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m117);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N117);
                String strM124684c8 = cVarM124676h2.getTitle();
                c38072d = C38072d.f163053a;
                c0209i5 = c0209i;
                c2314t2 = c2314t;
                c0209i6 = c0209i4;
                c28676v1 = c28676v0;
                f15 = f13;
                c0213j2 = c0213j;
                c0209i7 = c0209i3;
                str = strM124677i;
                i19 = 0;
                bVar = null;
                AbstractC30795n.m94707h(strM124684c8, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh3(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                strM124683b = cVarM124676h2.getSubtitle();
                if (strM124683b == null) {
                    c28655q.m87150e0(-334121691);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-334121690);
                    AbstractC30795n.m94707h(strM124683b, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M53376q8 = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q, 54);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3409f16);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q8);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m118);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i7);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N118);
            if (1.0f > 0.0d) {
                i24 = 1;
            } else {
                i24 = i19;
            }
            if (i24 == 0) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
            float fM36283m8 = AbstractC12889b.m36283m(m124728s(interfaceC28601c5), state.getLowerBound(), ((Number) interfaceC28601c12.getValue()).floatValue());
            float fM124673e8 = state.getLowerBound();
            float fFloatValue8 = ((Number) interfaceC28601c12.getValue()).floatValue();
            int iM124678j8 = state.getStepSize();
            int iM124671b8 = state.getBarThickness();
            long jMo134584toComposableColorWaAFU9c8 = state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q, i19);
            objM87133R7 = c28655q.m87133R();
            c28676v2 = c28676v1;
            if (objM87133R7 == c28676v2) {
                interfaceC28601c6 = interfaceC28601c5;
                objM87133R7 = new Function1() { // from class: y21.c
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC39162i.m124729t(interfaceC28601c6, ((Float) obj).floatValue());
                    }
                };
                c28655q.m87172p0(objM87133R7);
            } else {
                interfaceC28601c6 = interfaceC28601c5;
            }
            Function1 function9 = (Function1) objM87133R7;
            str2 = str;
            boolean zM87153g12 = c28655q.m87153g(str2);
            if ((i15 & 112) == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z19 | zM87153g12;
            objM87133R8 = c28655q.m87133R();
            if (z24) {
                function1 = onViewEvent;
                objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                c28655q.m87172p0(objM87133R8);
            } else {
                function1 = onViewEvent;
                objM87133R8 = new C1934e(str2, function1, interfaceC28601c6);
                c28655q.m87172p0(objM87133R8);
            }
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R8;
            interfaceC28601c7 = interfaceC28601c6;
            C28655q c28655q9 = c28655q;
            m124690F(fM36283m8, fM124673e8, fFloatValue8, iM124678j8, iM124671b8, jMo134584toComposableColorWaAFU9c8, layoutWeightElement8, function9, interfaceC4339a8, c28655q9, 12582912, 0);
            c28655q = c28655q9;
            aVarM124672c = state.getEndLabel();
            if (aVarM124672c == null) {
                c28655q.m87150e0(-1729502159);
                c28655q.m87173q(false);
                z26 = false;
                interfaceC28601c8 = interfaceC28601c4;
            } else {
                c28655q.m87150e0(-1729502158);
                float fM124728s8 = m124728s(interfaceC28601c7);
                if (r58 == 0) {
                    z25 = false;
                } else {
                    z25 = false;
                }
                if (r58 != 0) {
                    c28655q.m87150e0(1170996154);
                    interfaceC28601c8 = interfaceC28601c4;
                    zM87153g4 = c28655q.m87153g(interfaceC28601c8);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87153g4) {
                        objM87133R9 = new C39163j(interfaceC28601c8, 2);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C39163j(interfaceC28601c8, 2);
                        c28655q.m87172p0(objM87133R9);
                    }
                    z26 = false;
                    c28655q.m87173q(false);
                    r10 = (InterfaceC4339a) objM87133R9;
                } else {
                    interfaceC28601c8 = interfaceC28601c4;
                    z26 = false;
                    c28655q.m87150e0(1171088534);
                    c28655q.m87173q(false);
                    r10 = bVar;
                }
                m124688D(aVarM124672c, fM124728s8, z25, r10, c28655q, 0, 0);
                c28655q.m87173q(z26);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (r58 == 0) {
                c28655q.m87150e0(-1059328071);
                c28655q.m87173q(z26);
                z28 = true;
            } else {
                c28655q.m87150e0(-1059328070);
                aVarM124672c2 = state.getEndLabel();
                if (aVarM124672c2 != null) {
                    bVarM124680a = aVarM124672c2.getFormat();
                } else {
                    bVarM124680a = bVar;
                }
                if (bVarM124680a == C39155b.b.TIME) {
                    z27 = true;
                } else {
                    z27 = z26;
                }
                if (z27) {
                    interfaceC25312u = interfaceC25312uM124674f;
                    if (interfaceC25312u instanceof C36738b) {
                        c36738b2 = (C36738b) interfaceC25312u;
                    } else {
                        r14 = bVar;
                    }
                    if (r14 != 0) {
                    }
                    r14 = c36738b2;
                    boolean z318 = z26;
                    z28 = true;
                    AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W7, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                    c28655q.m87173q(z318);
                } else {
                    interfaceC25312u = r58;
                }
                r14 = c36738b2;
                r14 = c36738b2;
                InterfaceC25312u interfaceC25312uM124707W8 = interfaceC25312u;
                r14 = c36738b2;
                boolean z319 = z26;
                z28 = true;
                AbstractC1090b.m3350e(C23016z.f90757a, m124686B(interfaceC28601c8), null, null, null, null, AbstractC37817c.m121344e(1382565784, c28655q, new C17284d(interfaceC25312uM124707W8, str2, z27, function1, interfaceC28601c7)), c28655q, 1572870, 30);
                c28655q.m87173q(z319);
            }
            c28655q.m87173q(z28);
            z15 = z212;
            modifier3 = modifier8;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(state, onViewEvent, modifier3, z15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final float m124728s(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m124729t(InterfaceC28601c1 interfaceC28601c1, float f13) {
        m124685A(interfaceC28601c1, f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m124730u(String str, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        if (str != null) {
            function1.invoke(new DesignItemInteraction(new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(str, AbstractC0770m.m1840b(Float.valueOf(m124728s(interfaceC28601c1))))), false, 2, (DefaultConstructorMarker) null), null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m124731v(InterfaceC28601c1 interfaceC28601c1) {
        m124687C(interfaceC28601c1, !m124686B(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m124732w(InterfaceC25312u interfaceC25312u, String str, boolean z4, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C36553a c36553a = new C36553a(21);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(str) | c28655q.m87155h(z4) | c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C4614e c4614e = new C4614e((Object) str, z4, (Object) function1, interfaceC28601c1, 14);
            c28655q.m87172p0(c4614e);
            objM87133R = c4614e;
        }
        AbstractC25303l.m74291r(interfaceC25312u, null, c36553a, (Function1) objM87133R, c28655q, 0, 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Modifier m124733x(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1126275544);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m124734y(String str, boolean z4, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object event) {
        String content;
        Integer numM125932Q;
        AbstractC22676k.m65750j(event, "event");
        DefaultConstructorMarker defaultConstructorMarker = null;
        DesignItemInteraction designItemInteraction = event instanceof DesignItemInteraction ? (DesignItemInteraction) event : null;
        Object actionArgument = designItemInteraction != null ? designItemInteraction.getActionArgument() : null;
        StateUpdateAction stateUpdateAction = actionArgument instanceof StateUpdateAction ? (StateUpdateAction) actionArgument : null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (stateUpdateAction == null || str == null || !z4) {
            function1.invoke(event);
            return c23454a0;
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(C39165l.f168401a.m124742a((int) m124728s(interfaceC28601c1)));
        for (Map.Entry<String, JsonElement> entry : stateUpdateAction.getState().entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            JsonPrimitive jsonPrimitive = value instanceof JsonPrimitive ? (JsonPrimitive) value : null;
            if (jsonPrimitive != null && (content = jsonPrimitive.getContent()) != null && (numM125932Q = AbstractC39421y.m125932Q(content)) != null) {
                linkedHashMapM74003l0.put(key, Integer.valueOf(numM125932Q.intValue()));
            }
        }
        m124685A(interfaceC28601c1, C39165l.f168401a.m124743b(linkedHashMapM74003l0));
        function1.invoke(new DesignItemInteraction(new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(str, AbstractC0770m.m1840b(Float.valueOf(m124728s(interfaceC28601c1))))), false, 2, defaultConstructorMarker), null));
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m124735z(C39155b c39155b, Function1 function1, Modifier modifier, boolean z4, int i13, int i14, Composer composer, int i15) {
        m124727r(c39155b, function1, modifier, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
