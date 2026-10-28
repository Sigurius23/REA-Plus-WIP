package com.whoop.editactivities.view;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mapbox.common.HttpHeaders;
import com.whoop.android.R;
import com.whoop.editactivities.view.EditActivitiesDrawerFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge1.C15734c;
import ge1.InterfaceC15733b;
import ge1.InterfaceC15735d;
import gy0.AbstractC16278g;
import he1.AbstractC17212a;
import he1.DialogInterfaceOnShowListenerC17213b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import org.xmlpull.v1.XmlPullParserException;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p404pq.AbstractC29455c;
import p404pq.C29464l;
import p404pq.DialogC29463k;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p708hb2.C17095c;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001d\u0010$\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010 ¨\u0006)²\u0006\f\u0010(\u001a\u00020'8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;", "Lpq/l;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "getTheme", "()I", "Lge1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "K", "()Lge1/c;", "viewModel", "", "x", "I", "()Ljava/lang/String;", HttpHeaders.DATE, "y", "J", "drawerTitle", "z", "a", "Lge1/d;", "viewState", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditActivitiesDrawerFragment extends C29464l {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8718e(this, null, new C8717d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h date;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h drawerTitle;

    /* JADX INFO: renamed from: E */
    public static final int f25949E = 8;

    /* JADX INFO: renamed from: com.whoop.editactivities.view.EditActivitiesDrawerFragment$b */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"com/whoop/editactivities/view/EditActivitiesDrawerFragment$b", "Lpq/c;", "Landroid/view/View;", "bottomSheet", "", "newState", "Ll83/a0;", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8715b extends AbstractC29455c {
        public C8715b() {
        }

        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: b */
        public void mo5841b(View bottomSheet, float slideOffset) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        }

        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: c */
        public void mo5842c(View bottomSheet, int newState) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
            if (newState == 5) {
                EditActivitiesDrawerFragment.this.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.editactivities.view.EditActivitiesDrawerFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.view.EditActivitiesDrawerFragment$onViewCreated$1", m100430f = "EditActivitiesDrawerFragment.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8716c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25955w;

        /* JADX INFO: renamed from: com.whoop.editactivities.view.EditActivitiesDrawerFragment$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.editactivities.view.EditActivitiesDrawerFragment$onViewCreated$1$1", m100430f = "EditActivitiesDrawerFragment.kt", m100431l = {65}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f25957w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ EditActivitiesDrawerFragment f25958x;

            /* JADX INFO: renamed from: com.whoop.editactivities.view.EditActivitiesDrawerFragment$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.editactivities.view.EditActivitiesDrawerFragment$onViewCreated$1$1$1", m100430f = "EditActivitiesDrawerFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41386a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f25959w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ EditActivitiesDrawerFragment f25960x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41386a(EditActivitiesDrawerFragment editActivitiesDrawerFragment, InterfaceC30057d<? super C41386a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f25960x = editActivitiesDrawerFragment;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41386a(this.f25960x, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    if (this.f25959w != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    this.f25960x.dismissAllowingStateLoss();
                    return C23454a0.f92919a;
                }

                public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41386a) create(Boolean.valueOf(z4), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EditActivitiesDrawerFragment editActivitiesDrawerFragment, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f25958x = editActivitiesDrawerFragment;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f25958x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f25957w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l interfaceC13058lM44357n = this.f25958x.m21341K().getDismissEvents();
                    C41386a c41386a = new C41386a(this.f25958x, null);
                    this.f25957w = 1;
                    if (AbstractC13091v.m36604n(interfaceC13058lM44357n, c41386a, this) == enumC31071a) {
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

        public C8716c(InterfaceC30057d<? super C8716c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return EditActivitiesDrawerFragment.this.new C8716c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8716c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25955w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC1585g0 viewLifecycleOwner = EditActivitiesDrawerFragment.this.getViewLifecycleOwner();
                AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                EnumC1635w enumC1635w = EnumC1635w.f6328z;
                a aVar = new a(EditActivitiesDrawerFragment.this, null);
                this.f25955w = 1;
                if (AbstractC1613o1.m5023m(viewLifecycleOwner, enumC1635w, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.editactivities.view.EditActivitiesDrawerFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8717d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25961w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8717d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25961w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25961w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.editactivities.view.EditActivitiesDrawerFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8718e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25962w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25963x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25964y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25965z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8718e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25962w = componentCallbacks;
            this.f25963x = interfaceC35951a;
            this.f25964y = interfaceC4339a;
            this.f25965z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ge1.c] */
        @Override // c93.InterfaceC4339a
        public final C15734c invoke() {
            return AbstractC34132o.m107857B(this.f25962w, this.f25963x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15734c.class), this.f25964y, this.f25965z);
        }
    }

    public EditActivitiesDrawerFragment() {
        final int i13 = 0;
        this.date = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: he1.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivitiesDrawerFragment f66151x;

            {
                this.f66151x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return EditActivitiesDrawerFragment.m21337G(this.f66151x);
                    default:
                        return EditActivitiesDrawerFragment.m21338H(this.f66151x);
                }
            }
        });
        final int i14 = 1;
        this.drawerTitle = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: he1.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivitiesDrawerFragment f66151x;

            {
                this.f66151x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return EditActivitiesDrawerFragment.m21337G(this.f66151x);
                    default:
                        return EditActivitiesDrawerFragment.m21338H(this.f66151x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final String m21337G(EditActivitiesDrawerFragment editActivitiesDrawerFragment) {
        Bundle arguments = editActivitiesDrawerFragment.getArguments();
        String string = arguments != null ? arguments.getString(HttpHeaders.DATE) : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final String m21338H(EditActivitiesDrawerFragment editActivitiesDrawerFragment) {
        Bundle arguments = editActivitiesDrawerFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("title");
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    private final String m21339I() {
        return (String) this.date.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final String m21340J() {
        return (String) this.drawerTitle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final C15734c m21341K() {
        return (C15734c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m21342L(EditActivitiesDrawerFragment editActivitiesDrawerFragment, DialogInterface dialogInterface) {
        AbstractC22676k.m65748h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        FrameLayout frameLayout = (FrameLayout) ((DialogC29463k) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackground(new ColorDrawable(0));
            BottomSheetBehavior bottomSheetBehaviorM15688O = BottomSheetBehavior.m15688O(frameLayout);
            bottomSheetBehaviorM15688O.m15701W(3);
            bottomSheetBehaviorM15688O.f20782J = true;
            bottomSheetBehaviorM15688O.f20783K = true;
            bottomSheetBehaviorM15688O.m15690I(editActivitiesDrawerFragment.new C8715b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m21343M(EditActivitiesDrawerFragment editActivitiesDrawerFragment, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(editActivitiesDrawerFragment.m21341K().getViewState(), InterfaceC15735d.f.f59323a, null, c28655q, 48, 2);
            String strM21340J = editActivitiesDrawerFragment.m21340J();
            InterfaceC15735d interfaceC15735dM21344N = m21344N(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(editActivitiesDrawerFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C17095c(editActivitiesDrawerFragment, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17212a.m48619H(null, strM21340J, interfaceC15735dM21344N, (Function1) objM87133R, c28655q, 0, 1);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final InterfaceC15735d m21344N(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC15735d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m21345O(EditActivitiesDrawerFragment editActivitiesDrawerFragment, InterfaceC15733b event) {
        AbstractC22676k.m65750j(event, "event");
        editActivitiesDrawerFragment.m21341K().m44358p(event);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public int getTheme() {
        return AbstractC16278g.f62406a;
    }

    @Override // p404pq.C29464l, p314m.C24835d0, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DialogC29463k dialogC29463k = new DialogC29463k(requireContext(), getTheme());
        dialogC29463k.setOnShowListener(new DialogInterfaceOnShowListenerC17213b(this, 0));
        return dialogC29463k;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 1), true, -1401431469));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21341K().m44358p(new InterfaceC15733b.e(m21339I()));
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C8716c(null), 3);
    }
}
