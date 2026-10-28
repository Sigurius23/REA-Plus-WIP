package com.whoop.design.showcase.gallery.view.fragment;

import a31.C0343e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import b01.C2192m;
import b30.C2609r;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import be1.C3169c;
import bf0.C3196h;
import c41.C4025f5;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd1.C4437a;
import cd1.C4438b;
import cd1.C4439c;
import cd1.C4440d;
import cd1.C4441e;
import cd1.C4442f;
import cd1.C4443g;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.showcase.navigation.DesignShowcaseAtomicType;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e51.AbstractC12736l;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jd1.AbstractC21611a;
import kotlin.C2032u;
import l51.C23351a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p000.C0003a0;
import p003a1.C0103b;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p114eb.C12962i;
import p132f0.C13821r1;
import p163g1.AbstractC15108p2;
import p163g1.C15059k3;
import p163g1.C15136s0;
import p163g1.C15199y3;
import p163g1.EnumC15146t0;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p292l1.AbstractC23124k3;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p700bd1.AbstractC3083a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p748zc1.AbstractC40292c5;
import p748zc1.AbstractC40403m6;
import p748zc1.AbstractC40455r7;
import p748zc1.AbstractC40458s0;
import p748zc1.AbstractC40529z1;
import p748zc1.EnumC40298d0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r61.AbstractC30984g;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35660d;
import v41.AbstractC35662e;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ9\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010 \u001a\u00020\rH\u0003¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\rH\u0003¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\rH\u0003¢\u0006\u0004\b\"\u0010\u000fR\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006+²\u0006\u0010\u0010*\u001a\u0004\u0018\u00010)8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/design/showcase/gallery/view/fragment/AtomicGalleryFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ll83/a0;", "s0", "(Landroidx/compose/runtime/Composer;I)V", "w0", "v1", "r1", "M0", "I0", "Lv41/f;", "bottomSheetState", "Lkotlin/Function1;", "Lzc1/d0;", "onGalleryItemClick", "Lkotlin/Function0;", "onLeftIconClicked", "A0", "(Lv41/f;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "j1", "n1", "f1", "b1", "Q0", "Lcd1/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leb/i;", "z1", "()Lcd1/f;", "args", "Lv41/g;", "bottomSheetTopBarViewState", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AtomicGalleryFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4442f.class), new C8678f(this));

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$AtomicContentBottomSheetGalleryNoGestures$1$1$1", m100430f = "AtomicGalleryFragment.kt", m100431l = {162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8673a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25845w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15136s0 f25846x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8673a(C15136s0 c15136s0, InterfaceC30057d<? super C8673a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25846x = c15136s0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C8673a(this.f25846x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8673a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25845w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            C15136s0 c15136s0 = this.f25846x;
            this.f25845w = 1;
            C15059k3 c15059k3M43070e = c15136s0.f56747a.m43070e();
            EnumC15146t0 enumC15146t0 = EnumC15146t0.f56807x;
            if (!c15059k3M43070e.f56384a.containsKey(enumC15146t0)) {
                enumC15146t0 = EnumC15146t0.f56808y;
            }
            Object objM16788n = AbstractC5583n.m16788n(c15136s0.f56747a, enumC15146t0, this);
            if (objM16788n != enumC31071a) {
                objM16788n = c23454a0;
            }
            return objM16788n == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$AtomicContentBottomSheetGalleryNoGestures$2$1$1", m100430f = "AtomicGalleryFragment.kt", m100431l = {167}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8674b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25847w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15136s0 f25848x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8674b(C15136s0 c15136s0, InterfaceC30057d<? super C8674b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25848x = c15136s0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C8674b(this.f25848x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8674b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25847w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15136s0 c15136s0 = this.f25848x;
                this.f25847w = 1;
                if (c15136s0.m43185a(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$AtomicContentBottomSheetGalleryWithGestures$1$1$1", m100430f = "AtomicGalleryFragment.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8675c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25849w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f25850x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8675c(C15199y3 c15199y3, InterfaceC30057d<? super C8675c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25850x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C8675c(this.f25850x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8675c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25849w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f25850x;
                this.f25849w = 1;
                if (c15199y3.m43225f(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$AtomicContentBottomSheetGalleryWithGestures$2$1$1", m100430f = "AtomicGalleryFragment.kt", m100431l = {146}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8676d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25851w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f25852x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8676d(C15199y3 c15199y3, InterfaceC30057d<? super C8676d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25852x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C8676d(this.f25852x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8676d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25851w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f25852x;
                this.f25851w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C8677e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25853a;

        static {
            int[] iArr = new int[DesignShowcaseAtomicType.values().length];
            try {
                iArr[DesignShowcaseAtomicType.ANCHOR_SELECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DesignShowcaseAtomicType.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DesignShowcaseAtomicType.BOTTOM_SHEET_M3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DesignShowcaseAtomicType.BOTTOM_SHEET_NO_GESTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DesignShowcaseAtomicType.COLLAPSABLE_HEADER_AND_ANCHOR_SELECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DesignShowcaseAtomicType.DIALOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DesignShowcaseAtomicType.MINI_ARCH_PROGRESS_MODAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DesignShowcaseAtomicType.PROGRESS_MODAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DesignShowcaseAtomicType.SCROLLABLE_LINE_GRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DesignShowcaseAtomicType.SPLIT_COLUMN_SCROLLABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DesignShowcaseAtomicType.SPLIT_COLUMN_SPACE_BETWEEN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f25853a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8678f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f25854w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8678f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f25854w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f25854w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f25854w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final void m21097A0(AbstractC35664f abstractC35664f, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a2;
        AtomicGalleryFragment atomicGalleryFragment;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1564006562);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC35664f) : c28655q.m87157i(abstractC35664f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if ((i13 & 3072) == 0) {
            atomicGalleryFragment = this;
            i14 |= c28655q.m87157i(atomicGalleryFragment) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            atomicGalleryFragment = this;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(1330012573, c28655q, new C2032u((Object) abstractC35664f, (Object) interfaceC4339a2, (Object) atomicGalleryFragment, function1, 5)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4025f5(this, abstractC35664f, function1, interfaceC4339a, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final C23454a0 m21098A1(AtomicGalleryFragment atomicGalleryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            switch (C8677e.f25853a[atomicGalleryFragment.m21202z1().m13885a().ordinal()]) {
                case 1:
                    c28655q.m87150e0(1106551835);
                    atomicGalleryFragment.m21185s0(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 2:
                    c28655q.m87150e0(1106554635);
                    atomicGalleryFragment.m21122M0(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 3:
                    c28655q.m87150e0(1106558017);
                    atomicGalleryFragment.m21130Q0(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 4:
                    c28655q.m87150e0(1106561353);
                    atomicGalleryFragment.m21114I0(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 5:
                    c28655q.m87150e0(1106565352);
                    atomicGalleryFragment.m21193w0(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 6:
                    c28655q.m87150e0(1106568339);
                    atomicGalleryFragment.m21160f1(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 7:
                    c28655q.m87150e0(1106571266);
                    atomicGalleryFragment.m21168j1(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 8:
                    c28655q.m87150e0(1106574330);
                    atomicGalleryFragment.m21176n1(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 9:
                    c28655q.m87150e0(1106577377);
                    AbstractC30984g.m95374e(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 10:
                    c28655q.m87150e0(1106580706);
                    atomicGalleryFragment.m21184r1(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                case 11:
                    c28655q.m87150e0(1106584164);
                    atomicGalleryFragment.m21192v1(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
                default:
                    c28655q.m87150e0(1106586164);
                    atomicGalleryFragment.m21152b1(c28655q, 0);
                    c28655q.m87173q(false);
                    break;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m21100B0(AbstractC35664f abstractC35664f, InterfaceC4339a interfaceC4339a, AtomicGalleryFragment atomicGalleryFragment, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            C35666g c35666g = (C35666g) interfaceC28601c1.getValue();
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C0343e(interfaceC4339a, 9);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C4441e(atomicGalleryFragment, 8);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC35660d.m112871m(null, c35666g, abstractC35664f, null, interfaceC4339a2, (InterfaceC4339a) objM87133R3, null, C4443g.f17926a.m13891d(), false, null, null, null, false, null, AbstractC37817c.m121344e(313183595, c28655q, new C2032u((Object) c13821r1M92099U, (Object) atomicGalleryFragment, function1, (Object) interfaceC28601c1, 6)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.f151586a << 6), 24576, 16201);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m21102C0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m21104D0(AtomicGalleryFragment atomicGalleryFragment) {
        Toast.makeText(atomicGalleryFragment.requireContext(), "Right Icon Clicked", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m21106E0(C13821r1 c13821r1, AtomicGalleryFragment atomicGalleryFragment, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c2314t, c13821r1, 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l(atomicGalleryFragment.m21202z1().m13885a().getTitle()));
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C4441e(atomicGalleryFragment, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVarM20173a, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(5 * 4, c2314t));
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C2609r(interfaceC28601c1, function1, 5);
                c28655q.m87172p0(objM87133R2);
            }
            p748zc1.Function1.m129614f((Function1) objM87133R2, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m21108F0(AtomicGalleryFragment atomicGalleryFragment) {
        AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m21110G0(InterfaceC28601c1 interfaceC28601c1, Function1 function1, EnumC40298d0 it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue(AbstractC21611a.m60776a(it));
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m21112H0(AtomicGalleryFragment atomicGalleryFragment, AbstractC35664f abstractC35664f, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21097A0(abstractC35664f, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I0 */
    private final void m21114I0(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1086750941);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            C15136s0 c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
            AbstractC35664f bVar = new AbstractC35664f.b(c15136s0M43172c);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C3169c(12, interfaceC2994c0, c15136s0M43172c);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4440d(interfaceC2994c0, c15136s0M43172c);
                c28655q.m87172p0(objM87133R3);
            }
            m21097A0(bVar, function1, (InterfaceC4339a) objM87133R3, c28655q, AbstractC35664f.b.f151589c | ((i14 << 9) & 7168));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m21116J0(InterfaceC2994c0 interfaceC2994c0, C15136s0 c15136s0, EnumC40298d0 it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C8673a(c15136s0, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m21118K0(InterfaceC2994c0 interfaceC2994c0, C15136s0 c15136s0) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C8674b(c15136s0, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m21120L0(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21114I0(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M0 */
    private final void m21122M0(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-747700952);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            AbstractC35664f aVar = new AbstractC35664f.a(c15199y3M3460c);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C4439c(interfaceC2994c0, c15199y3M3460c);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C3196h(interfaceC2994c0, c15199y3M3460c, 1);
                c28655q.m87172p0(objM87133R3);
            }
            m21097A0(aVar, function1, (InterfaceC4339a) objM87133R3, c28655q, AbstractC35664f.a.f151587c | ((i14 << 9) & 7168));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C23454a0 m21124N0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, EnumC40298d0 it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C8675c(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C23454a0 m21126O0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C8676d(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C23454a0 m21128P0(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21122M0(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m21130Q0(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2020840814);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(433300045, c28655q, new C0003a0(13, this, (InterfaceC28601c1) objM87133R)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 4);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private static final C35666g m21132R0(InterfaceC28601c1 interfaceC28601c1) {
        return (C35666g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: S0 */
    private static final void m21134S0(InterfaceC28601c1 interfaceC28601c1, C35666g c35666g) {
        interfaceC28601c1.setValue(c35666g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C23454a0 m21136T0(AtomicGalleryFragment atomicGalleryFragment, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c2;
        int i14 = 0;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l(atomicGalleryFragment.m21202z1().m13885a().getTitle()));
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C4441e(atomicGalleryFragment, i14);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVarM20173a, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            float f13 = 4;
            AbstractC18489d0.m53380u(5, f13, c2314t, c28655q);
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f14, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Bottom Sheet M3 - Left Icon");
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R2 = new C2192m(10, interfaceC28601c2);
                c28655q.m87172p0(objM87133R2);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
            }
            int i15 = TextResource.$stable << 18;
            AbstractC27292z.m82343j(null, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, i15, 3072, 8127);
            float f15 = 1 * f14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, 0.0f, 13);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Bottom Sheet M3 - Right Icon");
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C2192m(11, interfaceC28601c2);
                c28655q.m87172p0(objM87133R3);
            }
            int i16 = i15 | 6;
            AbstractC27292z.m82343j(modifierM3398t, false, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q, i16, 3072, 8126);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, 0.0f, 13);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Bottom Sheet M3 - All Icons");
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C2192m(12, interfaceC28601c2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC27292z.m82343j(modifierM3398t2, false, false, null, null, null, textResourceM21278l3, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q, i16, 3072, 8126);
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, 0.0f, 13);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Bottom Sheet M3 - Handle Only");
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C2192m(13, interfaceC28601c2);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC27292z.m82343j(modifierM3398t3, false, false, null, null, null, textResourceM21278l4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R5, c28655q, i16, 3072, 8126);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            C35666g c35666gM21132R0 = m21132R0(interfaceC28601c2);
            if (c35666gM21132R0 == null) {
                c28655q.m87150e0(2066720440);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2066720441);
                Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
                EnumC23202x3 enumC23202x3 = EnumC23202x3.f91820w;
                C23196w3 c23196w3M67108l = AbstractC23124k3.m67108l(c28655q);
                Object objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C2192m(14, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC35662e.m112943g(modifierM3427x, c23196w3M67108l, c35666gM21132R0, null, null, null, (InterfaceC4339a) objM87133R6, null, false, null, null, false, C4443g.f17926a.m13890c(), c28655q, (C35666g.f151591h << 6) | 1572870, 384, 4024);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C23454a0 m21138U0(AtomicGalleryFragment atomicGalleryFragment) {
        AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C23454a0 m21140V0(InterfaceC28601c1 interfaceC28601c1) {
        m21134S0(interfaceC28601c1, AbstractC21611a.m60776a(EnumC40298d0.LEFT));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C23454a0 m21142W0(InterfaceC28601c1 interfaceC28601c1) {
        m21134S0(interfaceC28601c1, AbstractC21611a.m60776a(EnumC40298d0.RIGHT));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C23454a0 m21144X0(InterfaceC28601c1 interfaceC28601c1) {
        m21134S0(interfaceC28601c1, AbstractC21611a.m60776a(EnumC40298d0.FULL));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C23454a0 m21146Y0(InterfaceC28601c1 interfaceC28601c1) {
        m21134S0(interfaceC28601c1, AbstractC21611a.m60776a(EnumC40298d0.NONE));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C23454a0 m21148Z0(InterfaceC28601c1 interfaceC28601c1) {
        m21134S0(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C23454a0 m21150a1(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21130Q0(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b1 */
    private final void m21152b1(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-639989396);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-1431544367, c28655q, new C4437a(this, 6)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C23454a0 m21154c1(AtomicGalleryFragment atomicGalleryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l(atomicGalleryFragment.m21202z1().m13885a().getTitle()));
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4441e(atomicGalleryFragment, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVarM20173a, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            AbstractC18489d0.m53380u(5, 4, c2314t, c28655q);
            DesignShowcaseAtomicType designShowcaseAtomicTypeM13885a = atomicGalleryFragment.m21202z1().m13885a();
            AbstractC22676k.m65749i(designShowcaseAtomicTypeM13885a, "getAtomicType(...)");
            AbstractC3083a.m8839b(designShowcaseAtomicTypeM13885a, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C23454a0 m21156d1(AtomicGalleryFragment atomicGalleryFragment) {
        AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C23454a0 m21158e1(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21152b1(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f1 */
    private final void m21160f1(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1293596757);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(1174721190, c28655q, new C4437a(this, 4)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C23454a0 m21162g1(AtomicGalleryFragment atomicGalleryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l(atomicGalleryFragment.m21202z1().m13885a().getTitle()));
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4441e(atomicGalleryFragment, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVarM20173a, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            AbstractC40529z1.m131296t(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C23454a0 m21164h1(AtomicGalleryFragment atomicGalleryFragment) {
        AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C23454a0 m21166i1(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21160f1(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j1 */
    private final void m21168j1(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1414173262);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(1649749335, c28655q, new C4437a(this, 5)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C23454a0 m21170k1(AtomicGalleryFragment atomicGalleryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l(atomicGalleryFragment.m21202z1().m13885a().getTitle()));
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4441e(atomicGalleryFragment, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVarM20173a, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            AbstractC40292c5.m129452o(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C23454a0 m21172l1(AtomicGalleryFragment atomicGalleryFragment) {
        AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C23454a0 m21174m1(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21168j1(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n1 */
    private final void m21176n1(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(78158405);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-1130311958, c28655q, new C4437a(this, 3)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C23454a0 m21178o1(AtomicGalleryFragment atomicGalleryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l(atomicGalleryFragment.m21202z1().m13885a().getTitle()));
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4441e(atomicGalleryFragment, 7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVarM20173a, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            AbstractC40403m6.m130372v(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C23454a0 m21180p1(AtomicGalleryFragment atomicGalleryFragment) {
        AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C23454a0 m21182q1(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21176n1(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r1 */
    private final void m21184r1(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(547737230);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-683307469, c28655q, new C4437a(this, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 2);
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final void m21185s0(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(133711039);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(1325835450, c28655q, new C4437a(this, 7)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C23454a0 m21186s1(AtomicGalleryFragment atomicGalleryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4441e(atomicGalleryFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC40455r7.m130777e(modifierM66724m, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m21187t0(AtomicGalleryFragment atomicGalleryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l(atomicGalleryFragment.m21202z1().m13885a().getTitle()));
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4441e(atomicGalleryFragment, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVarM20173a, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            AbstractC18489d0.m53380u(2, 4, c2314t, c28655q);
            AbstractC12736l.m35635v(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C23454a0 m21188t1(AtomicGalleryFragment atomicGalleryFragment) {
        AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m21189u0(AtomicGalleryFragment atomicGalleryFragment) {
        AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final C23454a0 m21190u1(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21184r1(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m21191v0(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21185s0(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v1 */
    private final void m21192v1(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1647590643);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-270358696, c28655q, new C4437a(this, 8)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    private final void m21193w0(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1527579137);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-2031374876, c28655q, new C4437a(this, 2)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4438b(this, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final C23454a0 m21194w1(AtomicGalleryFragment atomicGalleryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4441e(atomicGalleryFragment, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC40455r7.m130780h(modifierM66724m, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m21195x0(AtomicGalleryFragment atomicGalleryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean zM87157i = c28655q.m87157i(atomicGalleryFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0103b(atomicGalleryFragment, 29);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC40458s0.m130807j(modifierM3407d, (Function1) objM87133R, c28655q, 6, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final C23454a0 m21196x1(AtomicGalleryFragment atomicGalleryFragment) {
        AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m21198y0(AtomicGalleryFragment atomicGalleryFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C23351a) {
            AbstractC5583n.m16799z(atomicGalleryFragment).m36410z();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final C23454a0 m21199y1(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21192v1(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m21201z0(AtomicGalleryFragment atomicGalleryFragment, int i13, Composer composer, int i14) {
        atomicGalleryFragment.m21193w0(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z1 */
    private final C4442f m21202z1() {
        return (C4442f) this.args.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new C37816b(new C4437a(this, 0), true, -1361975522));
        return composeView;
    }
}
