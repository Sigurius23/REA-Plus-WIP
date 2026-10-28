package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.viewpager2.widget.ViewPager2;
import b30.ViewOnClickListenerC2558k3;
import com.google.android.material.card.MaterialCardView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.databinding.StreamUiDialogAttachmentBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabFactories;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabFactory;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.internal.AttachmentDialogPagerAdapter;
import io.getstream.chat.android.p226ui.feature.messages.composer.internal.AttachmentMetaDataMapperKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p184h5.C16904q0;
import p184h5.C16907r0;
import p404pq.C29464l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 H2\u00020\u0001:\u0003HIJB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u001b\u00102\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\n¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010?R\u001c\u00101\u001a\b\u0012\u0004\u0012\u0002000\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010@R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010AR\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010BR\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010@R\u0014\u0010G\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006K"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;", "Lpq/l;", "<init>", "()V", "Ll83/a0;", "setupDialog", "setupAttachButton", "setupTabs", "setupPages", "setupPagerContainerHeight", "", "Lio/getstream/chat/android/models/Attachment;", "resolveSelectedAttachments", "()Ljava/util/List;", "Landroid/widget/CheckedTextView;", "checkedTextView", "", "pagePosition", "setSelectedTab", "(Landroid/widget/CheckedTextView;I)V", "", "isEnabled", "setAttachButtonEnabled", "(Z)V", "setUnselectedButtonsEnabled", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "onDestroyView", "getTheme", "()I", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;", "attachmentsPickerTabFactories", "setAttachmentsPickerTabFactories", "(Ljava/util/List;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$AttachmentsSelectionListener;", "attachmentsSelectionListener", "setAttachmentsSelectionListener", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$AttachmentsSelectionListener;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$PollSubmissionListener;", "pollSubmissionListener", "setPollSubmissionListener", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$PollSubmissionListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiDialogAttachmentBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiDialogAttachmentBinding;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Ljava/util/List;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$AttachmentsSelectionListener;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$PollSubmissionListener;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "selectedAttachments", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiDialogAttachmentBinding;", "binding", "Companion", "AttachmentsSelectionListener", "PollSubmissionListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentsPickerDialogFragment extends C29464l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String TAG = "attachment_dialog_fragment";
    private StreamUiDialogAttachmentBinding _binding;
    private List<? extends AttachmentsPickerTabFactory> attachmentsPickerTabFactories;
    private AttachmentsSelectionListener attachmentsSelectionListener;
    private PollSubmissionListener pollSubmissionListener;
    private List<AttachmentMetaData> selectedAttachments = C25271y.f99162w;
    private AttachmentsPickerDialogStyle style;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$AttachmentsSelectionListener;", "", "", "Lio/getstream/chat/android/models/Attachment;", "attachments", "Ll83/a0;", "onAttachmentsSelected", "(Ljava/util/List;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface AttachmentsSelectionListener {
        void onAttachmentsSelected(List<Attachment> attachments);
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "attachmentsPickerTabFactories", "", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabFactory;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AttachmentsPickerDialogFragment newInstance$default(Companion companion, AttachmentsPickerDialogStyle attachmentsPickerDialogStyle, List list, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                list = attachmentsPickerDialogStyle.getUseDefaultSystemMediaPicker() ? AttachmentsPickerTabFactories.INSTANCE.defaultFactoriesWithoutPermissions(attachmentsPickerDialogStyle.getMediaAttachmentsTabEnabled(), attachmentsPickerDialogStyle.getSystemMediaPickerVisualMediaAllowMultiple(), attachmentsPickerDialogStyle.getSystemMediaPickerVisualMediaType(), attachmentsPickerDialogStyle.getFileAttachmentsTabEnabled(), attachmentsPickerDialogStyle.getCameraAttachmentsTabEnabled(), attachmentsPickerDialogStyle.getPollAttachmentsTabEnabled()) : AttachmentsPickerTabFactories.INSTANCE.defaultFactories(attachmentsPickerDialogStyle.getMediaAttachmentsTabEnabled(), attachmentsPickerDialogStyle.getFileAttachmentsTabEnabled(), attachmentsPickerDialogStyle.getCameraAttachmentsTabEnabled(), attachmentsPickerDialogStyle.getPollAttachmentsTabEnabled());
            }
            return companion.newInstance(attachmentsPickerDialogStyle, list);
        }

        public final AttachmentsPickerDialogFragment newInstance(AttachmentsPickerDialogStyle style, List<? extends AttachmentsPickerTabFactory> attachmentsPickerTabFactories) {
            AbstractC22676k.m65750j(style, "style");
            AbstractC22676k.m65750j(attachmentsPickerTabFactories, "attachmentsPickerTabFactories");
            AttachmentsPickerDialogFragment attachmentsPickerDialogFragment = new AttachmentsPickerDialogFragment();
            attachmentsPickerDialogFragment.setStyle(style);
            attachmentsPickerDialogFragment.setAttachmentsPickerTabFactories(attachmentsPickerTabFactories);
            return attachmentsPickerDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$PollSubmissionListener;", "", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "Ll83/a0;", "onPollSubmitted", "(Lio/getstream/chat/android/models/CreatePollParams;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface PollSubmissionListener {
        void onPollSubmitted(CreatePollParams createPollParams);
    }

    private final StreamUiDialogAttachmentBinding getBinding() {
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding);
        return streamUiDialogAttachmentBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Attachment> resolveSelectedAttachments() {
        List<AttachmentMetaData> list = this.selectedAttachments;
        ArrayList arrayList = new ArrayList();
        for (AttachmentMetaData attachmentMetaData : list) {
            Context contextRequireContext = requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            Attachment attachment = AttachmentMetaDataMapperKt.toAttachment(attachmentMetaData, contextRequireContext);
            if (attachment != null) {
                arrayList.add(attachment);
            }
        }
        if (arrayList.size() < this.selectedAttachments.size()) {
            Toast.makeText(requireContext(), C19470R.string.stream_ui_attachment_picker_error_unresolvable_attachments, 1).show();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAttachButtonEnabled(boolean isEnabled) {
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding);
        streamUiDialogAttachmentBinding.attachButton.setEnabled(isEnabled);
    }

    private final void setSelectedTab(CheckedTextView checkedTextView, int pagePosition) {
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding);
        streamUiDialogAttachmentBinding.attachmentPager.m5510d(pagePosition, false);
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding2);
        LinearLayout attachmentButtonsContainer = streamUiDialogAttachmentBinding2.attachmentButtonsContainer;
        AbstractC22676k.m65749i(attachmentButtonsContainer, "attachmentButtonsContainer");
        Iterator c16907r0 = new C16907r0(attachmentButtonsContainer);
        ArrayList arrayList = new ArrayList();
        while (c16907r0.hasNext()) {
            Object next = c16907r0.next();
            Iterator it = (Iterator) C16904q0.f64862w.invoke(next);
            if (it == null || !it.hasNext()) {
                while (!c16907r0.hasNext() && !arrayList.isEmpty()) {
                    c16907r0 = (Iterator) AbstractC25265s.m74112P0(arrayList);
                    AbstractC25265s.m74134l1(arrayList);
                }
            } else {
                arrayList.add(c16907r0);
                c16907r0 = it;
            }
            View view = (View) next;
            CheckedTextView checkedTextView2 = view instanceof CheckedTextView ? (CheckedTextView) view : null;
            if (checkedTextView2 != null) {
                checkedTextView2.setChecked(AbstractC22676k.m65745e(view, checkedTextView));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUnselectedButtonsEnabled(boolean isEnabled) {
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding);
        LinearLayout attachmentButtonsContainer = streamUiDialogAttachmentBinding.attachmentButtonsContainer;
        AbstractC22676k.m65749i(attachmentButtonsContainer, "attachmentButtonsContainer");
        Iterator c16907r0 = new C16907r0(attachmentButtonsContainer);
        ArrayList arrayList = new ArrayList();
        while (c16907r0.hasNext()) {
            Object next = c16907r0.next();
            Iterator it = (Iterator) C16904q0.f64862w.invoke(next);
            if (it == null || !it.hasNext()) {
                while (!c16907r0.hasNext() && !arrayList.isEmpty()) {
                    c16907r0 = (Iterator) AbstractC25265s.m74112P0(arrayList);
                    AbstractC25265s.m74134l1(arrayList);
                }
            } else {
                arrayList.add(c16907r0);
                c16907r0 = it;
            }
            View view = (View) next;
            if (view instanceof CheckedTextView) {
                CheckedTextView checkedTextView = (CheckedTextView) view;
                if (!checkedTextView.isChecked()) {
                    checkedTextView.setEnabled(isEnabled);
                }
            }
        }
    }

    private final void setupAttachButton() {
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding);
        ImageButton imageButton = streamUiDialogAttachmentBinding.attachButton;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
        if (attachmentsPickerDialogStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        imageButton.setImageDrawable(attachmentsPickerDialogStyle.getSubmitAttachmentsButtonIconDrawable());
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding2);
        streamUiDialogAttachmentBinding2.attachButton.setEnabled(false);
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding3);
        streamUiDialogAttachmentBinding3.attachButton.setOnClickListener(new ViewOnClickListenerC2558k3(this, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAttachButton$lambda$0(AttachmentsPickerDialogFragment attachmentsPickerDialogFragment, View view) {
        AttachmentsSelectionListener attachmentsSelectionListener = attachmentsPickerDialogFragment.attachmentsSelectionListener;
        if (attachmentsSelectionListener != null) {
            attachmentsSelectionListener.onAttachmentsSelected(attachmentsPickerDialogFragment.resolveSelectedAttachments());
        }
        attachmentsPickerDialogFragment.dismiss();
    }

    private final void setupDialog() {
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding);
        ConstraintLayout constraintLayout = streamUiDialogAttachmentBinding.container;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
        if (attachmentsPickerDialogStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        constraintLayout.setBackgroundColor(attachmentsPickerDialogStyle.getAttachmentsPickerBackgroundColor());
        setupAttachButton();
        setupTabs();
        setupPages();
    }

    private final void setupPagerContainerHeight() {
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding);
        MaterialCardView materialCardView = (MaterialCardView) streamUiDialogAttachmentBinding.getRoot().findViewById(C19469R.id.pagerContainer);
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding2);
        AbstractC1692i1 adapter = ((ViewPager2) streamUiDialogAttachmentBinding2.getRoot().findViewById(C19469R.id.attachmentPager)).getAdapter();
        if (adapter != null && adapter.getPageCount() == 1) {
            ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
            layoutParams.height = -2;
            materialCardView.setLayoutParams(layoutParams);
        }
        materialCardView.requestLayout();
    }

    private final void setupPages() {
        AttachmentsPickerTabListener attachmentsPickerTabListener = new AttachmentsPickerTabListener() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogFragment$setupPages$attachmentsPickerTabListener$1
            @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener
            public final void onPollSubmitted(CreatePollParams createPollParams) {
                AttachmentsPickerDialogFragment.PollSubmissionListener pollSubmissionListener;
                if (createPollParams != null && (pollSubmissionListener = this.this$0.pollSubmissionListener) != null) {
                    pollSubmissionListener.onPollSubmitted(createPollParams);
                }
                this.this$0.dismiss();
            }

            @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener
            public final void onSelectedAttachmentsChanged(List<AttachmentMetaData> attachments) {
                AbstractC22676k.m65750j(attachments, "attachments");
                this.this$0.selectedAttachments = attachments;
                boolean zIsEmpty = this.this$0.selectedAttachments.isEmpty();
                this.this$0.setAttachButtonEnabled(!zIsEmpty);
                this.this$0.setUnselectedButtonsEnabled(zIsEmpty);
            }

            @Override // io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.AttachmentsPickerTabListener
            public final void onSelectedAttachmentsSubmitted() {
                AttachmentsPickerDialogFragment.AttachmentsSelectionListener attachmentsSelectionListener = this.this$0.attachmentsSelectionListener;
                if (attachmentsSelectionListener != null) {
                    attachmentsSelectionListener.onAttachmentsSelected(this.this$0.resolveSelectedAttachments());
                }
                this.this$0.dismiss();
            }
        };
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding);
        ViewPager2 viewPager2 = streamUiDialogAttachmentBinding.attachmentPager;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
        if (attachmentsPickerDialogStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        List<? extends AttachmentsPickerTabFactory> list = this.attachmentsPickerTabFactories;
        if (list == null) {
            AbstractC22676k.m65757q("attachmentsPickerTabFactories");
            throw null;
        }
        viewPager2.setAdapter(new AttachmentDialogPagerAdapter(this, attachmentsPickerDialogStyle, list, attachmentsPickerTabListener));
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiDialogAttachmentBinding2);
        streamUiDialogAttachmentBinding2.attachmentPager.setUserInputEnabled(false);
        setupPagerContainerHeight();
    }

    private final void setupTabs() {
        List<? extends AttachmentsPickerTabFactory> list = this.attachmentsPickerTabFactories;
        if (list == null) {
            AbstractC22676k.m65757q("attachmentsPickerTabFactories");
            throw null;
        }
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            AttachmentsPickerTabFactory attachmentsPickerTabFactory = (AttachmentsPickerTabFactory) obj;
            LayoutInflater layoutInflater = getLayoutInflater();
            int i15 = C19469R.layout.stream_ui_dialog_attachment_tab;
            StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding = this._binding;
            AbstractC22676k.m65747g(streamUiDialogAttachmentBinding);
            View viewInflate = layoutInflater.inflate(i15, (ViewGroup) streamUiDialogAttachmentBinding.attachmentButtonsContainer, false);
            AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            CheckedTextView checkedTextView = (CheckedTextView) frameLayout.findViewById(C19469R.id.checkedTextView);
            AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
            if (attachmentsPickerDialogStyle == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            checkedTextView.setBackground(attachmentsPickerTabFactory.createTabIcon(attachmentsPickerDialogStyle));
            AttachmentsPickerDialogStyle attachmentsPickerDialogStyle2 = this.style;
            if (attachmentsPickerDialogStyle2 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            checkedTextView.setBackgroundTintList(attachmentsPickerDialogStyle2.getAttachmentTabToggleButtonStateList());
            checkedTextView.setChecked(i13 == 0);
            frameLayout.setOnClickListener(new ViewOnClickListenerC19676a(this, checkedTextView, i13, 0));
            StreamUiDialogAttachmentBinding streamUiDialogAttachmentBinding2 = this._binding;
            AbstractC22676k.m65747g(streamUiDialogAttachmentBinding2);
            streamUiDialogAttachmentBinding2.attachmentButtonsContainer.addView(frameLayout);
            i13 = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupTabs$lambda$2$lambda$1(AttachmentsPickerDialogFragment attachmentsPickerDialogFragment, CheckedTextView checkedTextView, int i13, View view) {
        AbstractC22676k.m65747g(checkedTextView);
        attachmentsPickerDialogFragment.setSelectedTab(checkedTextView, i13);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final int getTheme() {
        return C19469R.style.StreamUiAttachmentBottomSheetDialog;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        StreamUiDialogAttachmentBinding streamUiDialogAttachmentBindingInflate = StreamUiDialogAttachmentBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiDialogAttachmentBindingInflate;
        ConstraintLayout root = streamUiDialogAttachmentBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        AttachmentsSelectionListener attachmentsSelectionListener;
        AbstractC22676k.m65750j(dialog, "dialog");
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.style;
        if (attachmentsPickerDialogStyle != null && attachmentsPickerDialogStyle.getSaveAttachmentsOnDismiss() && (attachmentsSelectionListener = this.attachmentsSelectionListener) != null) {
            attachmentsSelectionListener.onAttachmentsSelected(resolveSelectedAttachments());
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null || this.style == null || this.attachmentsPickerTabFactories == null) {
            dismiss();
        } else {
            setupDialog();
        }
    }

    public final void setAttachmentsPickerTabFactories(List<? extends AttachmentsPickerTabFactory> attachmentsPickerTabFactories) {
        AbstractC22676k.m65750j(attachmentsPickerTabFactories, "attachmentsPickerTabFactories");
        this.attachmentsPickerTabFactories = attachmentsPickerTabFactories;
    }

    public final void setAttachmentsSelectionListener(AttachmentsSelectionListener attachmentsSelectionListener) {
        AbstractC22676k.m65750j(attachmentsSelectionListener, "attachmentsSelectionListener");
        this.attachmentsSelectionListener = attachmentsSelectionListener;
    }

    public final void setPollSubmissionListener(PollSubmissionListener pollSubmissionListener) {
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        this.pollSubmissionListener = pollSubmissionListener;
    }

    public final void setStyle(AttachmentsPickerDialogStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
    }
}
