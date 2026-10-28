package io.getstream.chat.android.p226ui.feature.gallery;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1643y1;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import androidx.viewpager2.widget.ViewPager2;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.internal.file.StreamFileManager;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.internal.file.StreamShareFileManager;
import io.getstream.chat.android.p226ui.common.utils.ContextUtilsKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiActivityAttachmentGalleryBinding;
import io.getstream.chat.android.p226ui.feature.gallery.internal.AttachmentGalleryPagerAdapter;
import io.getstream.chat.android.p226ui.feature.gallery.internal.AttachmentGalleryViewModel;
import io.getstream.chat.android.p226ui.feature.gallery.options.AttachmentGalleryOptionsViewStyle;
import io.getstream.chat.android.p226ui.feature.gallery.options.internal.AttachmentGalleryOptionsDialogFragment;
import io.getstream.chat.android.p226ui.feature.gallery.overview.internal.MediaAttachmentDialogFragment;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import io.getstream.chat.android.p226ui.utils.extensions.ConstraintLayoutKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import m83.C25271y;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p190hc.AbstractC17145h;
import p314m.AbstractActivityC24852m;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.DurationKt;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 [2\u00020\u0001:\u0006\\]^_`[B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J\u0017\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010;\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010?\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010F\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00107\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010RR\u0016\u0010S\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010<R\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity;", "Lm/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "setupEdgeToEdge", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "attachmentGalleryItems", "setupGallery", "(Ljava/util/List;)V", "setupGalleryAdapter", "setupShareMediaButton", "shareMedia", "Lio/getstream/chat/android/models/Attachment;", "attachment", "shareImage", "(Lio/getstream/chat/android/models/Attachment;)V", "shareVideo", "toastFailedShare", "setupAttachmentActionsButton", "observePageChanges", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;", "result", "setResultAndFinish", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;)V", "", "position", "onGalleryPageSelected", "(I)V", "Ljava/util/Date;", "createdAt", "", "getRelativeAttachmentDate", "(Ljava/util/Date;)Ljava/lang/String;", "setupGalleryOverviewButton", "enterFullScreenMode", "exitFullScreenMode", "setSharingInProgressUi", "setNoSharingInProgressUi", "obtainOptionsViewStyle", "", "isMine", "shouldShowOptionsButton", "(Z)Z", "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "replyOptionEnabled", "Z", "showInChatOptionEnabled", "saveMediaOptionEnabled", "deleteOptionEnabled", "Lbc3/k1;", "shareMediaJob", "Lbc3/k1;", "initialIndex$delegate", "getInitialIndex", "()I", "initialIndex", "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;", "viewModel$delegate", "getViewModel", "()Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;", "viewModel", "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;", "adapter", "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryPagerAdapter;", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "permissionChecker", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "Ljava/util/List;", "isFullScreen", "Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;", "handleSaveMedia", "Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsDialogFragment$AttachmentOptionHandler;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "getAttachmentGalleryResultItem", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "attachmentGalleryResultItem", "Companion", "AttachmentShowInChatOptionHandler", "AttachmentReplyOptionHandler", "AttachmentDownloadOptionHandler", "AttachmentDeleteOptionHandler", "AttachmentOptionResult", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String EXTRA_ATTACHMENT_OPTION_RESULT = "extra_attachment_option_result";
    private static final String EXTRA_KEY_INITIAL_INDEX = "extra_key_initial_index";
    private AttachmentGalleryPagerAdapter adapter;
    private StreamUiActivityAttachmentGalleryBinding binding;
    private boolean isFullScreen;
    private InterfaceC3027k1 shareMediaJob;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "Chat:AttachmentGalleryActivity");
    private boolean replyOptionEnabled = true;
    private boolean showInChatOptionEnabled = true;
    private boolean saveMediaOptionEnabled = true;
    private boolean deleteOptionEnabled = true;

    /* JADX INFO: renamed from: initialIndex$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h initialIndex = AbstractC30060g.m92088H(new C19655b(this, 2));

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AttachmentGalleryViewModel.class), new AttachmentGalleryActivity$special$$inlined$viewModels$default$2(this), new AttachmentGalleryActivity$special$$inlined$viewModels$default$1(this), new AttachmentGalleryActivity$special$$inlined$viewModels$default$3(null, this));
    private final PermissionChecker permissionChecker = new PermissionChecker();
    private List<AttachmentGalleryItem> attachmentGalleryItems = C25271y.f99162w;
    private final AttachmentGalleryOptionsDialogFragment.AttachmentOptionHandler handleSaveMedia = new C19656c(this, 0);

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDeleteOptionHandler;", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "result", "Ll83/a0;", "onClick", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface AttachmentDeleteOptionHandler {
        void onClick(AttachmentGalleryResultItem result);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentDownloadOptionHandler;", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "result", "Ll83/a0;", "onClick", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface AttachmentDownloadOptionHandler {
        void onClick(AttachmentGalleryResultItem result);
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;", "Landroid/os/Parcelable;", "result", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "<init>", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V", "getResult", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "Reply", "ShowInChat", "Delete", "Download", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Delete;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Download;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$ShowInChat;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class AttachmentOptionResult implements Parcelable {
        private final AttachmentGalleryResultItem result;

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Delete;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "result", "<init>", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "getResult", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Delete extends AttachmentOptionResult {
            public static final Parcelable.Creator<Delete> CREATOR = new Creator();
            private final AttachmentGalleryResultItem result;

            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class Creator implements Parcelable.Creator<Delete> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Delete createFromParcel(Parcel parcel) {
                    AbstractC22676k.m65750j(parcel, "parcel");
                    return new Delete(AttachmentGalleryResultItem.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Delete[] newArray(int i13) {
                    return new Delete[i13];
                }

                @Override // android.os.Parcelable.Creator
                public final Delete[] newArray(int i13) {
                    return new Delete[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Delete(AttachmentGalleryResultItem result) {
                super(result, null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentOptionResult
            public final AttachmentGalleryResultItem getResult() {
                return this.result;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                AbstractC22676k.m65750j(dest, "dest");
                this.result.writeToParcel(dest, flags);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Download;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "result", "<init>", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "getResult", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Download extends AttachmentOptionResult {
            public static final Parcelable.Creator<Download> CREATOR = new Creator();
            private final AttachmentGalleryResultItem result;

            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class Creator implements Parcelable.Creator<Download> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Download createFromParcel(Parcel parcel) {
                    AbstractC22676k.m65750j(parcel, "parcel");
                    return new Download(AttachmentGalleryResultItem.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Download[] newArray(int i13) {
                    return new Download[i13];
                }

                @Override // android.os.Parcelable.Creator
                public final Download[] newArray(int i13) {
                    return new Download[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Download(AttachmentGalleryResultItem result) {
                super(result, null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentOptionResult
            public final AttachmentGalleryResultItem getResult() {
                return this.result;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                AbstractC22676k.m65750j(dest, "dest");
                this.result.writeToParcel(dest, flags);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "result", "<init>", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "getResult", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Reply extends AttachmentOptionResult {
            public static final Parcelable.Creator<Reply> CREATOR = new Creator();
            private final AttachmentGalleryResultItem result;

            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class Creator implements Parcelable.Creator<Reply> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Reply createFromParcel(Parcel parcel) {
                    AbstractC22676k.m65750j(parcel, "parcel");
                    return new Reply(AttachmentGalleryResultItem.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Reply[] newArray(int i13) {
                    return new Reply[i13];
                }

                @Override // android.os.Parcelable.Creator
                public final Reply[] newArray(int i13) {
                    return new Reply[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reply(AttachmentGalleryResultItem result) {
                super(result, null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentOptionResult
            public final AttachmentGalleryResultItem getResult() {
                return this.result;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                AbstractC22676k.m65750j(dest, "dest");
                this.result.writeToParcel(dest, flags);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$ShowInChat;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "result", "<init>", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "getResult", "()Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class ShowInChat extends AttachmentOptionResult {
            public static final Parcelable.Creator<ShowInChat> CREATOR = new Creator();
            private final AttachmentGalleryResultItem result;

            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class Creator implements Parcelable.Creator<ShowInChat> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowInChat createFromParcel(Parcel parcel) {
                    AbstractC22676k.m65750j(parcel, "parcel");
                    return new ShowInChat(AttachmentGalleryResultItem.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowInChat[] newArray(int i13) {
                    return new ShowInChat[i13];
                }

                @Override // android.os.Parcelable.Creator
                public final ShowInChat[] newArray(int i13) {
                    return new ShowInChat[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowInChat(AttachmentGalleryResultItem result) {
                super(result, null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentOptionResult
            public final AttachmentGalleryResultItem getResult() {
                return this.result;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                AbstractC22676k.m65750j(dest, "dest");
                this.result.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ AttachmentOptionResult(AttachmentGalleryResultItem attachmentGalleryResultItem, DefaultConstructorMarker defaultConstructorMarker) {
            this(attachmentGalleryResultItem);
        }

        public AttachmentGalleryResultItem getResult() {
            return this.result;
        }

        private AttachmentOptionResult(AttachmentGalleryResultItem attachmentGalleryResultItem) {
            this.result = attachmentGalleryResultItem;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentReplyOptionHandler;", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "result", "Ll83/a0;", "onClick", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface AttachmentReplyOptionHandler {
        void onClick(AttachmentGalleryResultItem result);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentShowInChatOptionHandler;", "", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "result", "Ll83/a0;", "onClick", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface AttachmentShowInChatOptionHandler {
        void onClick(AttachmentGalleryResultItem result);
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$Companion;", "", "<init>", "()V", "EXTRA_KEY_INITIAL_INDEX", "", "EXTRA_ATTACHMENT_OPTION_RESULT", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "initialIndex", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Intent createIntent(Context context, int initialIndex) {
            AbstractC22676k.m65750j(context, "context");
            Intent intent = new Intent(context, (Class<?>) AttachmentGalleryActivity.class);
            intent.putExtra(AttachmentGalleryActivity.EXTRA_KEY_INITIAL_INDEX, initialIndex);
            return intent;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity$onCreate$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C196502 extends C22672i implements Function1 {
        public C196502(Object obj) {
            super(1, 0, AttachmentGalleryActivity.class, obj, "setupGallery", "setupGallery(Ljava/util/List;)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<AttachmentGalleryItem>) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(List<AttachmentGalleryItem> p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((AttachmentGalleryActivity) this.receiver).setupGallery(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity$shareImage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity$shareImage$1", m100430f = "AttachmentGalleryActivity.kt", m100431l = {205, 209}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196511 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Attachment $attachment;
        final /* synthetic */ String $imageUrl;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196511(String str, Attachment attachment, InterfaceC30057d<? super C196511> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$imageUrl = str;
            this.$attachment = attachment;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AttachmentGalleryActivity.this.new C196511(this.$imageUrl, this.$attachment, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196511) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        
            if (r0 == r7) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r4 = r16
                r83.a r7 = r83.EnumC31071a.f128113w
                int r0 = r4.label
                java.lang.String r8 = "getApplicationContext(...)"
                r9 = 2
                r1 = 1
                if (r0 == 0) goto L28
                if (r0 == r1) goto L22
                if (r0 != r9) goto L1a
                java.lang.Object r0 = r4.L$0
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                p505ts.AbstractC34132o.m107864I(r17)
                r0 = r17
                goto L71
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                p505ts.AbstractC34132o.m107864I(r17)
                r0 = r17
                goto L4b
            L28:
                p505ts.AbstractC34132o.m107864I(r17)
                io.getstream.chat.android.ui.common.images.internal.StreamImageLoader$Companion r0 = io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader.INSTANCE
                r0.getClass()
                io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader r0 = io.getstream.chat.android.p226ui.common.images.internal.CoilStreamImageLoader.INSTANCE
                io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity r2 = io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity.this
                android.content.Context r2 = r2.getApplicationContext()
                p715kotlin.jvm.internal.AbstractC22676k.m65749i(r2, r8)
                r3 = r2
                java.lang.String r2 = r4.$imageUrl
                r4.label = r1
                r1 = r3
                r3 = 0
                r5 = 4
                r6 = 0
                java.lang.Object r0 = io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader.loadAsBitmap$default(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L4b
                goto L70
            L4b:
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                if (r0 == 0) goto L9a
                io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity r1 = io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity.this
                io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager r10 = new io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager
                r14 = 7
                r15 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r10.<init>(r11, r12, r13, r14, r15)
                android.content.Context r1 = r1.getApplicationContext()
                p715kotlin.jvm.internal.AbstractC22676k.m65749i(r1, r8)
                r2 = 0
                r4.L$0 = r2
                r2 = 0
                r4.I$0 = r2
                r4.label = r9
                java.lang.Object r0 = r10.writeBitmapToShareableFile(r1, r0, r4)
                if (r0 != r7) goto L71
            L70:
                return r7
            L71:
                n23.h r0 = (n23.AbstractC26205h) r0
                if (r0 == 0) goto L9a
                io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity r5 = io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity.this
                io.getstream.chat.android.models.Attachment r1 = r4.$attachment
                boolean r2 = r0 instanceof n23.C26204g
                if (r2 == 0) goto L8f
                n23.g r0 = (n23.C26204g) r0
                java.lang.Object r0 = r0.f103919a
                r6 = r0
                android.net.Uri r6 = (android.net.Uri) r6
                java.lang.String r7 = r1.getMimeType()
                r9 = 4
                r10 = 0
                r8 = 0
                io.getstream.chat.android.p226ui.common.utils.ContextUtilsKt.shareLocalFile$default(r5, r6, r7, r8, r9, r10)
                goto L9a
            L8f:
                boolean r0 = r0 instanceof n23.C26203f
                if (r0 == 0) goto L94
                goto L9a
            L94:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L9a:
                io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity r0 = io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity.this
                io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity.access$setNoSharingInProgressUi(r0)
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity.C196511.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity$shareVideo$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity$shareVideo$1", m100430f = "AttachmentGalleryActivity.kt", m100431l = {233}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196521 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Attachment $attachment;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196521(Attachment attachment, InterfaceC30057d<? super C196521> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$attachment = attachment;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AttachmentGalleryActivity.this.new C196521(this.$attachment, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196521) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C196521 c196521;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StreamShareFileManager streamShareFileManager = new StreamShareFileManager(null, null, null, 7, null);
                Context applicationContext = AttachmentGalleryActivity.this.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                Attachment attachment = this.$attachment;
                this.label = 1;
                c196521 = this;
                obj = StreamShareFileManager.writeAttachmentToShareableFile$default(streamShareFileManager, applicationContext, attachment, null, null, c196521, 12, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c196521 = this;
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            if (abstractC26205h instanceof C26204g) {
                ContextUtilsKt.shareLocalFile$default(AttachmentGalleryActivity.this, (Uri) ((C26204g) abstractC26205h).f103919a, c196521.$attachment.getMimeType(), null, 4, null);
            } else {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AttachmentGalleryActivity.this.toastFailedShare();
            }
            AttachmentGalleryActivity.this.setNoSharingInProgressUi();
            return C23454a0.f92919a;
        }
    }

    public static final Intent createIntent(Context context, int i13) {
        return INSTANCE.createIntent(context, i13);
    }

    private final void enterFullScreenMode() {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ConstraintLayout toolbar = streamUiActivityAttachmentGalleryBinding.toolbar;
        AbstractC22676k.m65749i(toolbar, "toolbar");
        toolbar.setVisibility(8);
        ConstraintLayout bottomBar = streamUiActivityAttachmentGalleryBinding.bottomBar;
        AbstractC22676k.m65749i(bottomBar, "bottomBar");
        bottomBar.setVisibility(8);
        streamUiActivityAttachmentGalleryBinding.galleryViewPager.setBackgroundColor(AbstractC32122c.getColor(this, C19469R.color.stream_ui_literal_black));
        C1153p c1153p = new C1153p();
        ViewPager2 galleryViewPager = streamUiActivityAttachmentGalleryBinding.galleryViewPager;
        AbstractC22676k.m65749i(galleryViewPager, "galleryViewPager");
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, galleryViewPager, 3);
        ViewPager2 galleryViewPager2 = streamUiActivityAttachmentGalleryBinding.galleryViewPager;
        AbstractC22676k.m65749i(galleryViewPager2, "galleryViewPager");
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, galleryViewPager2, 4);
        ViewPager2 galleryViewPager3 = streamUiActivityAttachmentGalleryBinding.galleryViewPager;
        AbstractC22676k.m65749i(galleryViewPager3, "galleryViewPager");
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, galleryViewPager3, 6);
        ViewPager2 galleryViewPager4 = streamUiActivityAttachmentGalleryBinding.galleryViewPager;
        AbstractC22676k.m65749i(galleryViewPager4, "galleryViewPager");
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, galleryViewPager4, 7);
        c1153p.m3644a(streamUiActivityAttachmentGalleryBinding.getRoot());
    }

    private final void exitFullScreenMode() {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ConstraintLayout toolbar = streamUiActivityAttachmentGalleryBinding.toolbar;
        AbstractC22676k.m65749i(toolbar, "toolbar");
        toolbar.setVisibility(0);
        ConstraintLayout bottomBar = streamUiActivityAttachmentGalleryBinding.bottomBar;
        AbstractC22676k.m65749i(bottomBar, "bottomBar");
        bottomBar.setVisibility(0);
        streamUiActivityAttachmentGalleryBinding.galleryViewPager.setBackgroundColor(AbstractC32122c.getColor(this, C19469R.color.stream_ui_white_snow));
        C1153p c1153p = new C1153p();
        int id4 = streamUiActivityAttachmentGalleryBinding.galleryViewPager.getId();
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding2 = this.binding;
        if (streamUiActivityAttachmentGalleryBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c1153p.m3650g(id4, 3, streamUiActivityAttachmentGalleryBinding2.toolbar.getId(), 4, 0);
        int id5 = streamUiActivityAttachmentGalleryBinding.galleryViewPager.getId();
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding3 = this.binding;
        if (streamUiActivityAttachmentGalleryBinding3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c1153p.m3650g(id5, 4, streamUiActivityAttachmentGalleryBinding3.bottomBar.getId(), 3, 0);
        ViewPager2 galleryViewPager = streamUiActivityAttachmentGalleryBinding.galleryViewPager;
        AbstractC22676k.m65749i(galleryViewPager, "galleryViewPager");
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, galleryViewPager, 6);
        ViewPager2 galleryViewPager2 = streamUiActivityAttachmentGalleryBinding.galleryViewPager;
        AbstractC22676k.m65749i(galleryViewPager2, "galleryViewPager");
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, galleryViewPager2, 7);
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding4 = this.binding;
        if (streamUiActivityAttachmentGalleryBinding4 != null) {
            c1153p.m3644a(streamUiActivityAttachmentGalleryBinding4.getRoot());
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    private final AttachmentGalleryResultItem getAttachmentGalleryResultItem() {
        List<AttachmentGalleryItem> list = this.attachmentGalleryItems;
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding != null) {
            AttachmentGalleryItem attachmentGalleryItem = list.get(streamUiActivityAttachmentGalleryBinding.galleryViewPager.getCurrentItem());
            return AttachmentGalleryResultItemKt.toAttachmentGalleryResultItem(attachmentGalleryItem.getAttachment(), attachmentGalleryItem.getMessageId(), attachmentGalleryItem.getMessageId(), attachmentGalleryItem.getCid(), attachmentGalleryItem.getUser().getName(), attachmentGalleryItem.isMine());
        }
        AbstractC22676k.m65757q("binding");
        throw null;
    }

    private final int getInitialIndex() {
        return ((Number) this.initialIndex.getValue()).intValue();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final String getRelativeAttachmentDate(Date createdAt) {
        String string = DateUtils.getRelativeTimeSpanString(createdAt.getTime(), System.currentTimeMillis(), DurationKt.MILLIS_IN_DAY, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION).toString();
        if (string.length() > 0) {
            StringBuilder sb4 = new StringBuilder();
            String strValueOf = String.valueOf(string.charAt(0));
            AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            sb4.append((Object) lowerCase);
            String strSubstring = string.substring(1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            sb4.append(strSubstring);
            string = sb4.toString();
        }
        String string2 = getString(C19469R.string.stream_ui_attachment_gallery_date, string, ChatUI.getDateFormatter().formatTime(createdAt));
        AbstractC22676k.m65749i(string2, "getString(...)");
        return string2;
    }

    private final AttachmentGalleryViewModel getViewModel() {
        return (AttachmentGalleryViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSaveMedia$lambda$10(AttachmentGalleryActivity attachmentGalleryActivity) {
        PermissionChecker permissionChecker = attachmentGalleryActivity.permissionChecker;
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = attachmentGalleryActivity.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ConstraintLayout root = streamUiActivityAttachmentGalleryBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        PermissionChecker.checkWriteStoragePermissions$default(permissionChecker, root, null, new C19655b(attachmentGalleryActivity, 1), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 handleSaveMedia$lambda$10$lambda$9(AttachmentGalleryActivity attachmentGalleryActivity) {
        attachmentGalleryActivity.setResultAndFinish(new AttachmentOptionResult.Download(attachmentGalleryActivity.getAttachmentGalleryResultItem()));
        return C23454a0.f92919a;
    }

    private final void observePageChanges() {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentGalleryBinding.galleryViewPager.m5508b(new AbstractC17145h() { // from class: io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.observePageChanges.1
            @Override // p190hc.AbstractC17145h
            public final void onPageSelected(int position) {
                AttachmentGalleryActivity.this.onGalleryPageSelected(position);
            }
        });
        onGalleryPageSelected(getInitialIndex());
    }

    private final void obtainOptionsViewStyle() {
        try {
            TypedArray typedArrayObtainStyledAttributes = ContextKt.createStreamThemeWrapper(this).obtainStyledAttributes(null, C19469R.styleable.AttachmentOptionsView, C19469R.attr.streamUiAttachmentGalleryOptionsStyle, C19469R.style.StreamUi_AttachmentGallery_Options);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyleInvoke = AttachmentGalleryOptionsViewStyle.INSTANCE.invoke(this, typedArrayObtainStyledAttributes);
            this.replyOptionEnabled = attachmentGalleryOptionsViewStyleInvoke.getReplyOptionEnabled();
            this.showInChatOptionEnabled = attachmentGalleryOptionsViewStyleInvoke.getShowInChatOptionEnabled();
            this.saveMediaOptionEnabled = attachmentGalleryOptionsViewStyleInvoke.getSaveMediaOptionEnabled();
            this.deleteOptionEnabled = attachmentGalleryOptionsViewStyleInvoke.getDeleteOptionEnabled();
            typedArrayObtainStyledAttributes.recycle();
        } catch (Exception e5) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "Failed to obtain styles", e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGalleryPageSelected(int position) {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentGalleryBinding.mediaInformationTextView.setText(getString(C19469R.string.stream_ui_attachment_gallery_count, Integer.valueOf(position + 1), Integer.valueOf(this.attachmentGalleryItems.size())));
        AttachmentGalleryItem attachmentGalleryItem = this.attachmentGalleryItems.get(position);
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding2 = this.binding;
        if (streamUiActivityAttachmentGalleryBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentGalleryBinding2.attachmentDateTextView.setText(getRelativeAttachmentDate(attachmentGalleryItem.getCreatedAt()));
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding3 = this.binding;
        if (streamUiActivityAttachmentGalleryBinding3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentGalleryBinding3.userTextView.setText(attachmentGalleryItem.getUser().getName());
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding4 = this.binding;
        if (streamUiActivityAttachmentGalleryBinding4 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView attachmentActionsButton = streamUiActivityAttachmentGalleryBinding4.attachmentActionsButton;
        AbstractC22676k.m65749i(attachmentActionsButton, "attachmentActionsButton");
        attachmentActionsButton.setVisibility(shouldShowOptionsButton(attachmentGalleryItem.isMine()) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNoSharingInProgressUi() {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentGalleryBinding.progressBar.setVisibility(8);
        streamUiActivityAttachmentGalleryBinding.shareMediaButton.setImageDrawable(AbstractC32122c.getDrawable(getApplicationContext(), C19469R.drawable.stream_ui_ic_share));
        streamUiActivityAttachmentGalleryBinding.mediaInformationTextView.setText(getString(C19469R.string.stream_ui_attachment_gallery_count, Integer.valueOf(streamUiActivityAttachmentGalleryBinding.galleryViewPager.getCurrentItem() + 1), Integer.valueOf(this.attachmentGalleryItems.size())));
    }

    private final void setResultAndFinish(AttachmentOptionResult result) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_ATTACHMENT_OPTION_RESULT, result);
        setResult(-1, intent);
        finish();
    }

    private final void setSharingInProgressUi() {
        Drawable drawableMutate;
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentGalleryBinding.mediaInformationTextView.setText(getApplicationContext().getString(C19469R.string.stream_ui_attachment_gallery_preview_preparing));
        streamUiActivityAttachmentGalleryBinding.progressBar.setVisibility(0);
        Drawable drawable = AbstractC32122c.getDrawable(getApplicationContext(), C19469R.drawable.stream_ui_ic_clear);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            drawableMutate = null;
        } else {
            drawableMutate.setTint(AbstractC32122c.getColor(getApplicationContext(), C19469R.color.stream_ui_black));
        }
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding2 = this.binding;
        if (streamUiActivityAttachmentGalleryBinding2 != null) {
            streamUiActivityAttachmentGalleryBinding2.shareMediaButton.setImageDrawable(drawableMutate);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    private final void setupAttachmentActionsButton() {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding != null) {
            streamUiActivityAttachmentGalleryBinding.attachmentActionsButton.setOnClickListener(new ViewOnClickListenerC19654a(this, 0));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAttachmentActionsButton$lambda$8(AttachmentGalleryActivity attachmentGalleryActivity, View view) {
        AttachmentGalleryOptionsDialogFragment.Companion companion = AttachmentGalleryOptionsDialogFragment.INSTANCE;
        C19656c c19656c = new C19656c(attachmentGalleryActivity, 1);
        C19656c c19656c2 = new C19656c(attachmentGalleryActivity, 2);
        C19656c c19656c3 = new C19656c(attachmentGalleryActivity, 3);
        AttachmentGalleryOptionsDialogFragment.AttachmentOptionHandler attachmentOptionHandler = attachmentGalleryActivity.handleSaveMedia;
        List<AttachmentGalleryItem> list = attachmentGalleryActivity.attachmentGalleryItems;
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = attachmentGalleryActivity.binding;
        if (streamUiActivityAttachmentGalleryBinding != null) {
            companion.newInstance(c19656c, c19656c3, c19656c2, attachmentOptionHandler, list.get(streamUiActivityAttachmentGalleryBinding.galleryViewPager.getCurrentItem()).isMine()).show(attachmentGalleryActivity.getSupportFragmentManager(), AttachmentGalleryOptionsDialogFragment.TAG);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAttachmentActionsButton$lambda$8$lambda$5(AttachmentGalleryActivity attachmentGalleryActivity) {
        attachmentGalleryActivity.setResultAndFinish(new AttachmentOptionResult.ShowInChat(attachmentGalleryActivity.getAttachmentGalleryResultItem()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAttachmentActionsButton$lambda$8$lambda$6(AttachmentGalleryActivity attachmentGalleryActivity) {
        attachmentGalleryActivity.setResultAndFinish(new AttachmentOptionResult.Delete(attachmentGalleryActivity.getAttachmentGalleryResultItem()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAttachmentActionsButton$lambda$8$lambda$7(AttachmentGalleryActivity attachmentGalleryActivity) {
        attachmentGalleryActivity.setResultAndFinish(new AttachmentOptionResult.Reply(attachmentGalleryActivity.getAttachmentGalleryResultItem()));
    }

    private final void setupEdgeToEdge() {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ConstraintLayout root = streamUiActivityAttachmentGalleryBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupGallery(List<AttachmentGalleryItem> attachmentGalleryItems) {
        if (attachmentGalleryItems.isEmpty()) {
            finish();
            return;
        }
        this.attachmentGalleryItems = attachmentGalleryItems;
        setupGalleryAdapter();
        setupShareMediaButton();
        setupAttachmentActionsButton();
        obtainOptionsViewStyle();
        observePageChanges();
    }

    private final void setupGalleryAdapter() {
        List<AttachmentGalleryItem> list = this.attachmentGalleryItems;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AttachmentGalleryItem) it.next()).getAttachment());
        }
        AttachmentGalleryPagerAdapter attachmentGalleryPagerAdapter = new AttachmentGalleryPagerAdapter(this, arrayList, new C19655b(this, 0));
        this.adapter = attachmentGalleryPagerAdapter;
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentGalleryBinding.galleryViewPager.setAdapter(attachmentGalleryPagerAdapter);
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding2 = this.binding;
        if (streamUiActivityAttachmentGalleryBinding2 != null) {
            streamUiActivityAttachmentGalleryBinding2.galleryViewPager.m5510d(getInitialIndex(), false);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupGalleryAdapter$lambda$3(AttachmentGalleryActivity attachmentGalleryActivity) {
        boolean z4 = attachmentGalleryActivity.isFullScreen;
        attachmentGalleryActivity.isFullScreen = !z4;
        if (z4) {
            attachmentGalleryActivity.exitFullScreenMode();
        } else {
            attachmentGalleryActivity.enterFullScreenMode();
        }
        return C23454a0.f92919a;
    }

    private final void setupGalleryOverviewButton() {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding != null) {
            streamUiActivityAttachmentGalleryBinding.galleryOverviewButton.setOnClickListener(new ViewOnClickListenerC19654a(this, 1));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupGalleryOverviewButton$lambda$14(AttachmentGalleryActivity attachmentGalleryActivity, View view) {
        MediaAttachmentDialogFragment.INSTANCE.getClass();
        MediaAttachmentDialogFragment mediaAttachmentDialogFragment = new MediaAttachmentDialogFragment();
        mediaAttachmentDialogFragment.setMediaClickListener(new C19223a(14, attachmentGalleryActivity, mediaAttachmentDialogFragment));
        mediaAttachmentDialogFragment.show(attachmentGalleryActivity.getSupportFragmentManager(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupGalleryOverviewButton$lambda$14$lambda$13$lambda$12(AttachmentGalleryActivity attachmentGalleryActivity, MediaAttachmentDialogFragment mediaAttachmentDialogFragment, int i13) {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = attachmentGalleryActivity.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentGalleryBinding.galleryViewPager.m5510d(i13, true);
        mediaAttachmentDialogFragment.dismiss();
        return C23454a0.f92919a;
    }

    private final void setupShareMediaButton() {
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding != null) {
            streamUiActivityAttachmentGalleryBinding.shareMediaButton.setOnClickListener(new ViewOnClickListenerC19654a(this, 3));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupShareMediaButton$lambda$4(AttachmentGalleryActivity attachmentGalleryActivity, View view) {
        InterfaceC3027k1 interfaceC3027k1 = attachmentGalleryActivity.shareMediaJob;
        if (interfaceC3027k1 == null || interfaceC3027k1.isCompleted()) {
            attachmentGalleryActivity.setSharingInProgressUi();
            attachmentGalleryActivity.shareMedia();
        } else {
            InterfaceC3027k1 interfaceC3027k2 = attachmentGalleryActivity.shareMediaJob;
            if (interfaceC3027k2 != null) {
                interfaceC3027k2.cancel((CancellationException) null);
            }
            attachmentGalleryActivity.setNoSharingInProgressUi();
        }
    }

    private final void shareImage(Attachment attachment) {
        String imageUrl = attachment.getImageUrl();
        if (imageUrl == null) {
            toastFailedShare();
            setNoSharingInProgressUi();
        } else {
            InterfaceC3027k1 interfaceC3027k1 = this.shareMediaJob;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            this.shareMediaJob = AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), DispatcherProvider.INSTANCE.getMain(), null, new C196511(imageUrl, attachment, null), 2);
        }
    }

    private final void shareMedia() {
        AttachmentGalleryPagerAdapter attachmentGalleryPagerAdapter = this.adapter;
        if (attachmentGalleryPagerAdapter == null) {
            AbstractC22676k.m65757q("adapter");
            throw null;
        }
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        Attachment item = attachmentGalleryPagerAdapter.getItem(streamUiActivityAttachmentGalleryBinding.galleryViewPager.getCurrentItem());
        String type = item.getType();
        if (AbstractC22676k.m65745e(type, "image")) {
            shareImage(item);
        } else if (AbstractC22676k.m65745e(type, "video")) {
            shareVideo(item);
        } else {
            toastFailedShare();
        }
    }

    private final void shareVideo(Attachment attachment) {
        InterfaceC3027k1 interfaceC3027k1 = this.shareMediaJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.shareMediaJob = AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C196521(attachment, null), 3);
    }

    private final boolean shouldShowOptionsButton(boolean isMine) {
        if (this.replyOptionEnabled || this.showInChatOptionEnabled || this.saveMediaOptionEnabled) {
            return true;
        }
        return this.deleteOptionEnabled && isMine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toastFailedShare() {
        Toast.makeText(getApplicationContext(), getApplicationContext().getString(C19469R.string.stream_ui_attachment_gallery_share_error), 0).show();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!ChatClient.INSTANCE.isInitialized()) {
            finish();
            return;
        }
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBindingInflate = StreamUiActivityAttachmentGalleryBinding.inflate(ContextKt.getStreamThemeInflater(this), null, false);
        this.binding = streamUiActivityAttachmentGalleryBindingInflate;
        setContentView(streamUiActivityAttachmentGalleryBindingInflate.getRoot());
        setupEdgeToEdge();
        setupGalleryOverviewButton();
        StreamUiActivityAttachmentGalleryBinding streamUiActivityAttachmentGalleryBinding = this.binding;
        if (streamUiActivityAttachmentGalleryBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiActivityAttachmentGalleryBinding.closeButton.setOnClickListener(new ViewOnClickListenerC19654a(this, 2));
        getViewModel().getAttachmentGalleryItemsLiveData().observe(this, new AttachmentGalleryActivity$sam$androidx_lifecycle_Observer$0(new C196502(this)));
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        StreamFileManager streamFileManager = new StreamFileManager();
        Context applicationContext = getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        streamFileManager.clearCache(applicationContext);
    }
}
