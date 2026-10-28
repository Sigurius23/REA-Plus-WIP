package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1643y1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentCreatePollBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import java.util.List;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p098dt.AbstractC12350b;
import p314m.C24835d0;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u0001:\u0002:;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;", "Lm/d0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getTheme", "()I", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;", "createPollDialogListener", "setCreatePollDialogListener", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;", "applyFeatureDefaults", "applyFeatureVisibility", "setupDialog", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setupToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;", "createPollViewModel$delegate", "Ll83/h;", "getCreatePollViewModel", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;", "createPollViewModel", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "pollsConfig$delegate", "getPollsConfig", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "pollsConfig", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;", "optionsAdapter$delegate", "getOptionsAdapter", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;", "optionsAdapter", "Landroid/view/MenuItem;", "sendMenuItem", "Landroid/view/MenuItem;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentCreatePollBinding;", "binding", "Companion", "CreatePollDialogListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CreatePollDialogFragment extends C24835d0 {
    private static final String ARG_POLLS_CONFIG = "arg_polls_config";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String TAG = "create_poll_dialog_fragment";
    private StreamUiFragmentCreatePollBinding _binding;
    private CreatePollDialogListener createPollDialogListener;

    /* JADX INFO: renamed from: createPollViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h createPollViewModel;

    /* JADX INFO: renamed from: optionsAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h optionsAdapter;

    /* JADX INFO: renamed from: pollsConfig$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h pollsConfig;
    private MenuItem sendMenuItem;

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_POLLS_CONFIG", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment;", "createPollDialogListener", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;", "pollsConfig", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ CreatePollDialogFragment newInstance$default(Companion companion, CreatePollDialogListener createPollDialogListener, PollsConfig pollsConfig, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                pollsConfig = null;
            }
            return companion.newInstance(createPollDialogListener, pollsConfig);
        }

        public final CreatePollDialogFragment newInstance(CreatePollDialogListener createPollDialogListener) {
            AbstractC22676k.m65750j(createPollDialogListener, "createPollDialogListener");
            return newInstance(createPollDialogListener, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final CreatePollDialogFragment newInstance(CreatePollDialogListener createPollDialogListener, PollsConfig pollsConfig) {
            AbstractC22676k.m65750j(createPollDialogListener, "createPollDialogListener");
            CreatePollDialogFragment createPollDialogFragment = new CreatePollDialogFragment();
            Bundle bundle = new Bundle();
            if (pollsConfig != null) {
                bundle.putParcelable(CreatePollDialogFragment.ARG_POLLS_CONFIG, pollsConfig);
            }
            createPollDialogFragment.setArguments(bundle);
            CreatePollDialogFragment.access$setCreatePollDialogListener(createPollDialogFragment, createPollDialogListener);
            return createPollDialogFragment;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollDialogFragment$CreatePollDialogListener;", "", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "Ll83/a0;", "onCreatePoll", "(Lio/getstream/chat/android/models/CreatePollParams;)V", "onDismiss", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface CreatePollDialogListener {
        void onCreatePoll(CreatePollParams createPollParams);

        void onDismiss();
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$10 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$10", m100430f = "CreatePollDialogFragment.kt", m100431l = {179}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C1969110 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$10$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$10$1", m100430f = "CreatePollDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CreatePollDialogFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CreatePollDialogFragment createPollDialogFragment, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = createPollDialogFragment;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC30057d);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                boolean z4 = this.Z$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                MenuItem menuItem = this.this$0.sendMenuItem;
                if (menuItem != null) {
                    menuItem.setEnabled(z4);
                    return C23454a0.f92919a;
                }
                AbstractC22676k.m65757q("sendMenuItem");
                throw null;
            }

            public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(Boolean.valueOf(z4), interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass1.invokeSuspend(c23454a0);
                return c23454a0;
            }
        }

        public C1969110(InterfaceC30057d<? super C1969110> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CreatePollDialogFragment.this.new C1969110(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C1969110) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 pollIsReady = CreatePollDialogFragment.this.getCreatePollViewModel().getPollIsReady();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreatePollDialogFragment.this, null);
                this.label = 1;
                if (AbstractC13091v.m36604n(pollIsReady, anonymousClass1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$11 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$11", m100430f = "CreatePollDialogFragment.kt", m100431l = {184}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C1969211 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$11$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$11$1", m100430f = "CreatePollDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/models/CreatePollParams;", "pollConfig", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/models/CreatePollParams;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreatePollDialogFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CreatePollDialogFragment createPollDialogFragment, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = createPollDialogFragment;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(CreatePollParams createPollParams, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(createPollParams, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass1.invokeSuspend(c23454a0);
                return c23454a0;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                CreatePollParams createPollParams = (CreatePollParams) this.L$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                if (createPollParams != null) {
                    CreatePollDialogFragment createPollDialogFragment = this.this$0;
                    CreatePollDialogListener createPollDialogListener = createPollDialogFragment.createPollDialogListener;
                    if (createPollDialogListener != null) {
                        createPollDialogListener.onCreatePoll(createPollParams);
                    }
                    createPollDialogFragment.dismiss();
                }
                return C23454a0.f92919a;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CreatePollParams) obj, (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }
        }

        public C1969211(InterfaceC30057d<? super C1969211> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CreatePollDialogFragment.this.new C1969211(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C1969211) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 createPollParams = CreatePollDialogFragment.this.getCreatePollViewModel().getCreatePollParams();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreatePollDialogFragment.this, null);
                this.label = 1;
                if (AbstractC13091v.m36604n(createPollParams, anonymousClass1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$12 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$12", m100430f = "CreatePollDialogFragment.kt", m100431l = {192}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C1969312 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$12$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$12$1", m100430f = "CreatePollDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "error", "Ll83/a0;", "<anonymous>", "(I)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreatePollDialogFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CreatePollDialogFragment createPollDialogFragment, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = createPollDialogFragment;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Integer num, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(num, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass1.invokeSuspend(c23454a0);
                return c23454a0;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                Integer num = (Integer) this.L$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                CreatePollDialogFragment.access$getBinding(this.this$0).multipleAnswersCount.setError(num != null ? this.this$0.getString(C19470R.string.stream_ui_poll_multiple_answers_error, "2", "10") : null);
                return C23454a0.f92919a;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Integer) obj, (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }
        }

        public C1969312(InterfaceC30057d<? super C1969312> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CreatePollDialogFragment.this.new C1969312(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C1969312) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 multipleAnswersError = CreatePollDialogFragment.this.getCreatePollViewModel().getMultipleAnswersError();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreatePollDialogFragment.this, null);
                this.label = 1;
                if (AbstractC13091v.m36604n(multipleAnswersError, anonymousClass1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$9 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$9", m100430f = "CreatePollDialogFragment.kt", m100431l = {176}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196949 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$9$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$9$1", m100430f = "CreatePollDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;", "it", "Ll83/a0;", "<anonymous>", "(Ljava/util/List;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreatePollDialogFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CreatePollDialogFragment createPollDialogFragment, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = createPollDialogFragment;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((List<PollAnswer>) obj, (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                List<Object> list = (List) this.L$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.this$0.getOptionsAdapter().submitList(list);
                return C23454a0.f92919a;
            }

            public final Object invoke(List<PollAnswer> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(list, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass1.invokeSuspend(c23454a0);
                return c23454a0;
            }
        }

        public C196949(InterfaceC30057d<? super C196949> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CreatePollDialogFragment.this.new C196949(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196949) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 options = CreatePollDialogFragment.this.getCreatePollViewModel().getOptions();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreatePollDialogFragment.this, null);
                this.label = 1;
                if (AbstractC13091v.m36604n(options, anonymousClass1, this) == enumC31071a) {
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

    public CreatePollDialogFragment() {
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new CreatePollDialogFragment$special$$inlined$viewModels$default$2(new CreatePollDialogFragment$special$$inlined$viewModels$default$1(this)));
        this.createPollViewModel = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CreatePollViewModel.class), new CreatePollDialogFragment$special$$inlined$viewModels$default$3(interfaceC23462hM92087G), new CreatePollDialogFragment$special$$inlined$viewModels$default$5(this, interfaceC23462hM92087G), new CreatePollDialogFragment$special$$inlined$viewModels$default$4(null, interfaceC23462hM92087G));
        final int i13 = 0;
        this.pollsConfig = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CreatePollDialogFragment f74546x;

            {
                this.f74546x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return CreatePollDialogFragment.pollsConfig_delegate$lambda$1(this.f74546x);
                    default:
                        return CreatePollDialogFragment.optionsAdapter_delegate$lambda$3(this.f74546x);
                }
            }
        });
        final int i14 = 1;
        this.optionsAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CreatePollDialogFragment f74546x;

            {
                this.f74546x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return CreatePollDialogFragment.pollsConfig_delegate$lambda$1(this.f74546x);
                    default:
                        return CreatePollDialogFragment.optionsAdapter_delegate$lambda$3(this.f74546x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static void m55272A(CreatePollDialogFragment createPollDialogFragment, CompoundButton compoundButton, boolean z4) {
        createPollDialogFragment.getCreatePollViewModel().setAllowAnswers(z4);
    }

    /* JADX INFO: renamed from: B */
    public static void m55273B(CreatePollDialogFragment createPollDialogFragment, CompoundButton compoundButton, boolean z4) {
        createPollDialogFragment.getCreatePollViewModel().setAnnonymousPoll(z4);
    }

    /* JADX INFO: renamed from: E */
    public static void m55276E(CreatePollDialogFragment createPollDialogFragment, CompoundButton compoundButton, boolean z4) {
        createPollDialogFragment.getCreatePollViewModel().setSuggestAnOption(z4);
    }

    /* JADX INFO: renamed from: G */
    public static void m55278G(CreatePollDialogFragment createPollDialogFragment, View view) {
        createPollDialogFragment.getCreatePollViewModel().createOption();
    }

    public static final StreamUiFragmentCreatePollBinding access$getBinding(CreatePollDialogFragment createPollDialogFragment) {
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding = createPollDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding);
        return streamUiFragmentCreatePollBinding;
    }

    public static final CreatePollDialogFragment access$setCreatePollDialogListener(CreatePollDialogFragment createPollDialogFragment, CreatePollDialogListener createPollDialogListener) {
        createPollDialogFragment.createPollDialogListener = createPollDialogListener;
        return createPollDialogFragment;
    }

    private final void applyFeatureDefaults() {
        getCreatePollViewModel().setAllowMultipleVotes(getPollsConfig().getMultipleVotes().getDefaultValue());
        if (getPollsConfig().getMultipleVotes().getConfigurable()) {
            StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding);
            streamUiFragmentCreatePollBinding.multipleAnswersSwitch.setChecked(getPollsConfig().getMultipleVotes().getDefaultValue());
        }
        getCreatePollViewModel().setAnnonymousPoll(getPollsConfig().getAnonymousPoll().getDefaultValue());
        if (getPollsConfig().getAnonymousPoll().getConfigurable()) {
            StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding2 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding2);
            streamUiFragmentCreatePollBinding2.anonymousPollSwitch.setChecked(getPollsConfig().getAnonymousPoll().getDefaultValue());
        }
        getCreatePollViewModel().setSuggestAnOption(getPollsConfig().getSuggestAnOption().getDefaultValue());
        if (getPollsConfig().getSuggestAnOption().getConfigurable()) {
            StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding3 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding3);
            streamUiFragmentCreatePollBinding3.suggestAnOptionSwitch.setChecked(getPollsConfig().getSuggestAnOption().getDefaultValue());
        }
        getCreatePollViewModel().setAllowAnswers(getPollsConfig().getAllowComments().getDefaultValue());
        if (getPollsConfig().getAllowComments().getConfigurable()) {
            StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding4 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding4);
            streamUiFragmentCreatePollBinding4.addACommentLabelSwitch.setChecked(getPollsConfig().getAllowComments().getDefaultValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006c  */
    private final void applyFeatureVisibility() {
        boolean z4;
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding);
        AppCompatTextView multipleAnswersLabel = streamUiFragmentCreatePollBinding.multipleAnswersLabel;
        AbstractC22676k.m65749i(multipleAnswersLabel, "multipleAnswersLabel");
        multipleAnswersLabel.setVisibility(getPollsConfig().getMultipleVotes().getConfigurable() ? 0 : 8);
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding2);
        SwitchMaterial multipleAnswersSwitch = streamUiFragmentCreatePollBinding2.multipleAnswersSwitch;
        AbstractC22676k.m65749i(multipleAnswersSwitch, "multipleAnswersSwitch");
        multipleAnswersSwitch.setVisibility(getPollsConfig().getMultipleVotes().getConfigurable() ? 0 : 8);
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding3);
        AppCompatEditText multipleAnswersCount = streamUiFragmentCreatePollBinding3.multipleAnswersCount;
        AbstractC22676k.m65749i(multipleAnswersCount, "multipleAnswersCount");
        if (getPollsConfig().getMultipleVotes().getConfigurable()) {
            StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding4 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding4);
            if (streamUiFragmentCreatePollBinding4.multipleAnswersSwitch.isChecked()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        multipleAnswersCount.setVisibility(z4 ? 0 : 8);
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding5 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding5);
        AppCompatTextView anonymousPollLabel = streamUiFragmentCreatePollBinding5.anonymousPollLabel;
        AbstractC22676k.m65749i(anonymousPollLabel, "anonymousPollLabel");
        anonymousPollLabel.setVisibility(getPollsConfig().getAnonymousPoll().getConfigurable() ? 0 : 8);
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding6 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding6);
        SwitchMaterial anonymousPollSwitch = streamUiFragmentCreatePollBinding6.anonymousPollSwitch;
        AbstractC22676k.m65749i(anonymousPollSwitch, "anonymousPollSwitch");
        anonymousPollSwitch.setVisibility(getPollsConfig().getAnonymousPoll().getConfigurable() ? 0 : 8);
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding7 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding7);
        AppCompatTextView suggestAnOptionLabel = streamUiFragmentCreatePollBinding7.suggestAnOptionLabel;
        AbstractC22676k.m65749i(suggestAnOptionLabel, "suggestAnOptionLabel");
        suggestAnOptionLabel.setVisibility(getPollsConfig().getSuggestAnOption().getConfigurable() ? 0 : 8);
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding8 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding8);
        SwitchMaterial suggestAnOptionSwitch = streamUiFragmentCreatePollBinding8.suggestAnOptionSwitch;
        AbstractC22676k.m65749i(suggestAnOptionSwitch, "suggestAnOptionSwitch");
        suggestAnOptionSwitch.setVisibility(getPollsConfig().getSuggestAnOption().getConfigurable() ? 0 : 8);
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding9 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding9);
        AppCompatTextView addACommentLabel = streamUiFragmentCreatePollBinding9.addACommentLabel;
        AbstractC22676k.m65749i(addACommentLabel, "addACommentLabel");
        addACommentLabel.setVisibility(getPollsConfig().getAllowComments().getConfigurable() ? 0 : 8);
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding10 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding10);
        SwitchMaterial addACommentLabelSwitch = streamUiFragmentCreatePollBinding10.addACommentLabelSwitch;
        AbstractC22676k.m65749i(addACommentLabelSwitch, "addACommentLabelSwitch");
        addACommentLabelSwitch.setVisibility(getPollsConfig().getAllowComments().getConfigurable() ? 0 : 8);
    }

    private final StreamUiFragmentCreatePollBinding getBinding() {
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding);
        return streamUiFragmentCreatePollBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreatePollViewModel getCreatePollViewModel() {
        return (CreatePollViewModel) this.createPollViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionsAdapter getOptionsAdapter() {
        return (OptionsAdapter) this.optionsAdapter.getValue();
    }

    private final PollsConfig getPollsConfig() {
        return (PollsConfig) this.pollsConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsAdapter optionsAdapter_delegate$lambda$3(CreatePollDialogFragment createPollDialogFragment) {
        return new OptionsAdapter(createPollDialogFragment.getPollsConfig().getOptionTextLimit(), new C17098f(createPollDialogFragment, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 optionsAdapter_delegate$lambda$3$lambda$2(CreatePollDialogFragment createPollDialogFragment, int i13, String text) {
        AbstractC22676k.m65750j(text, "text");
        createPollDialogFragment.getCreatePollViewModel().onOptionTextChanged(i13, text);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PollsConfig pollsConfig_delegate$lambda$1(CreatePollDialogFragment createPollDialogFragment) {
        PollsConfig pollsConfig;
        Bundle arguments = createPollDialogFragment.getArguments();
        return (arguments == null || (pollsConfig = (PollsConfig) AbstractC12350b.m34600u(arguments, PollsConfig.class, ARG_POLLS_CONFIG)) == null) ? ChatUI.getPollsConfig() : pollsConfig;
    }

    private final CreatePollDialogFragment setCreatePollDialogListener(CreatePollDialogListener createPollDialogListener) {
        this.createPollDialogListener = createPollDialogListener;
        return this;
    }

    private final void setupDialog() {
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding);
        Toolbar toolbar = streamUiFragmentCreatePollBinding.toolbar;
        AbstractC22676k.m65749i(toolbar, "toolbar");
        setupToolbar(toolbar);
        Integer questionTextLimit = getPollsConfig().getQuestionTextLimit();
        if (questionTextLimit != null) {
            int iIntValue = questionTextLimit.intValue();
            StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding2 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding2);
            streamUiFragmentCreatePollBinding2.question.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(iIntValue)});
        }
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding3);
        final int i13 = 0;
        streamUiFragmentCreatePollBinding3.multipleAnswersSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CreatePollDialogFragment f74548b;

            {
                this.f74548b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                switch (i13) {
                    case 0:
                        CreatePollDialogFragment.setupDialog$lambda$5(this.f74548b, compoundButton, z4);
                        break;
                    case 1:
                        CreatePollDialogFragment.m55273B(this.f74548b, compoundButton, z4);
                        break;
                    case 2:
                        CreatePollDialogFragment.m55276E(this.f74548b, compoundButton, z4);
                        break;
                    default:
                        CreatePollDialogFragment.m55272A(this.f74548b, compoundButton, z4);
                        break;
                }
            }
        });
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding4 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding4);
        AppCompatEditText question = streamUiFragmentCreatePollBinding4.question;
        AbstractC22676k.m65749i(question, "question");
        question.addTextChangedListener(new TextWatcher() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable s13) {
                this.this$0.getCreatePollViewModel().onTitleChanged(String.valueOf(s13));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding5 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding5);
        final int i14 = 1;
        streamUiFragmentCreatePollBinding5.anonymousPollSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CreatePollDialogFragment f74548b;

            {
                this.f74548b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                switch (i14) {
                    case 0:
                        CreatePollDialogFragment.setupDialog$lambda$5(this.f74548b, compoundButton, z4);
                        break;
                    case 1:
                        CreatePollDialogFragment.m55273B(this.f74548b, compoundButton, z4);
                        break;
                    case 2:
                        CreatePollDialogFragment.m55276E(this.f74548b, compoundButton, z4);
                        break;
                    default:
                        CreatePollDialogFragment.m55272A(this.f74548b, compoundButton, z4);
                        break;
                }
            }
        });
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding6 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding6);
        final int i15 = 2;
        streamUiFragmentCreatePollBinding6.suggestAnOptionSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CreatePollDialogFragment f74548b;

            {
                this.f74548b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                switch (i15) {
                    case 0:
                        CreatePollDialogFragment.setupDialog$lambda$5(this.f74548b, compoundButton, z4);
                        break;
                    case 1:
                        CreatePollDialogFragment.m55273B(this.f74548b, compoundButton, z4);
                        break;
                    case 2:
                        CreatePollDialogFragment.m55276E(this.f74548b, compoundButton, z4);
                        break;
                    default:
                        CreatePollDialogFragment.m55272A(this.f74548b, compoundButton, z4);
                        break;
                }
            }
        });
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding7 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding7);
        final int i16 = 3;
        streamUiFragmentCreatePollBinding7.addACommentLabelSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CreatePollDialogFragment f74548b;

            {
                this.f74548b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                switch (i16) {
                    case 0:
                        CreatePollDialogFragment.setupDialog$lambda$5(this.f74548b, compoundButton, z4);
                        break;
                    case 1:
                        CreatePollDialogFragment.m55273B(this.f74548b, compoundButton, z4);
                        break;
                    case 2:
                        CreatePollDialogFragment.m55276E(this.f74548b, compoundButton, z4);
                        break;
                    default:
                        CreatePollDialogFragment.m55272A(this.f74548b, compoundButton, z4);
                        break;
                }
            }
        });
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding8 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding8);
        streamUiFragmentCreatePollBinding8.addOption.setOnClickListener(new ViewOnClickListenerC19698a(this, 1));
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding9 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding9);
        streamUiFragmentCreatePollBinding9.optionList.setAdapter(getOptionsAdapter());
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding10 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding10);
        AppCompatEditText multipleAnswersCount = streamUiFragmentCreatePollBinding10.multipleAnswersCount;
        AbstractC22676k.m65749i(multipleAnswersCount, "multipleAnswersCount");
        multipleAnswersCount.addTextChangedListener(new TextWatcher() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollDialogFragment$setupDialog$$inlined$addTextChangedListener$default$2
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable s13) {
                this.this$0.getCreatePollViewModel().setMaxAnswer(AbstractC39421y.m125932Q(String.valueOf(s13)));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C196949(null), 3);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C1969110(null), 3);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C1969211(null), 3);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C1969312(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDialog$lambda$5(CreatePollDialogFragment createPollDialogFragment, CompoundButton compoundButton, boolean z4) {
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding = createPollDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding);
        AppCompatEditText multipleAnswersCount = streamUiFragmentCreatePollBinding.multipleAnswersCount;
        AbstractC22676k.m65749i(multipleAnswersCount, "multipleAnswersCount");
        multipleAnswersCount.setVisibility(z4 ? 0 : 8);
        createPollDialogFragment.getCreatePollViewModel().setAllowMultipleVotes(z4);
        if (z4) {
            StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding2 = createPollDialogFragment._binding;
            AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding2);
            streamUiFragmentCreatePollBinding2.multipleAnswersCount.requestFocus();
        }
    }

    private final void setupToolbar(Toolbar toolbar) {
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC19698a(this, 0));
        Drawable drawable = AbstractC32122c.getDrawable(requireContext(), C19469R.drawable.stream_ui_arrow_left);
        if (drawable != null) {
            drawable.setTint(AbstractC32122c.getColor(requireContext(), C19469R.color.stream_ui_black));
            toolbar.setNavigationIcon(drawable);
        }
        toolbar.setTitle(getString(C19469R.string.stream_ui_poll_create_a_poll_title));
        toolbar.mo3325t(C19469R.menu.stream_ui_create_poll_menu);
        MenuItem menuItemFindItem = toolbar.getMenu().findItem(C19469R.id.action_create_poll);
        AbstractC22676k.m65749i(menuItemFindItem, "findItem(...)");
        this.sendMenuItem = menuItemFindItem;
        menuItemFindItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC19699b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupToolbar$lambda$12(CreatePollDialogFragment createPollDialogFragment, View view) {
        CreatePollDialogListener createPollDialogListener = createPollDialogFragment.createPollDialogListener;
        if (createPollDialogListener != null) {
            createPollDialogListener.onDismiss();
        }
        createPollDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupToolbar$lambda$14(CreatePollDialogFragment createPollDialogFragment, MenuItem it) {
        AbstractC22676k.m65750j(it, "it");
        createPollDialogFragment.getCreatePollViewModel().createPollConfig();
        return true;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final int getTheme() {
        return C19469R.style.StreamUiBottomSheetDialogTheme;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBindingInflate = StreamUiFragmentCreatePollBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiFragmentCreatePollBindingInflate;
        ConstraintLayout root = streamUiFragmentCreatePollBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
        this.createPollDialogListener = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StreamUiFragmentCreatePollBinding streamUiFragmentCreatePollBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentCreatePollBinding);
        ConstraintLayout root = streamUiFragmentCreatePollBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 7);
        setupDialog();
        if (savedInstanceState == null) {
            applyFeatureDefaults();
        }
        applyFeatureVisibility();
    }
}
