package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.material.imageview.ShapeableImageView;
import com.whoop.service.network.model.UserSessionDto;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.utils.GiphyInfo;
import io.getstream.chat.android.p226ui.common.utils.GiphyInfoType;
import io.getstream.chat.android.p226ui.common.utils.GiphyInfoTypeKt;
import io.getstream.chat.android.p226ui.common.utils.GiphySizingMode;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiGiphyMediaAttachmentViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.GiphyMediaAttachmentViewStyle;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ConstraintLayoutKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import kr.C22782a;
import kr.C22786e;
import kr.C22790i;
import kr.C22792k;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J-\u0010(\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,R\u001a\u0010/\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006:"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "Lio/getstream/chat/android/ui/common/utils/GiphyInfo;", "giphyInfo", "", "giphyUrl", "applyAdaptiveSizing", "(Lio/getstream/chat/android/ui/common/utils/GiphyInfo;Ljava/lang/String;)V", "applyFixedSizing", "(Ljava/lang/String;)V", QueryParams.URL, "loadGiphy", "Lkr/k;", "shapeAppearanceModel", "setImageShape", "(Lkr/k;)V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;", "giphyType", "showGiphy", "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;)V", "", "topLeft", "topRight", "bottomRight", "bottomLeft", "setImageShapeByCorners", "(FFFF)V", "", "isStyleInitialized$stream_chat_android_ui_components_release", "()Z", "isStyleInitialized", "Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;", "getBinding$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;", "getStyle$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;", "setStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class GiphyMediaAttachmentView extends ConstraintLayout {
    private final StreamUiGiphyMediaAttachmentViewBinding binding;
    public GiphyMediaAttachmentViewStyle style;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.GiphyMediaAttachmentView$loadGiphy$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.GiphyMediaAttachmentView$loadGiphy$1", m100430f = "GiphyMediaAttachmentView.kt", m100431l = {173}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C197661 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C197661(String str, InterfaceC30057d<? super C197661> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$url = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 invokeSuspend$lambda$0(GiphyMediaAttachmentView giphyMediaAttachmentView) {
            FrameLayout loadImage = giphyMediaAttachmentView.getBinding().loadImage;
            AbstractC22676k.m65749i(loadImage, "loadImage");
            loadImage.setVisibility(0);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 invokeSuspend$lambda$1(GiphyMediaAttachmentView giphyMediaAttachmentView) {
            FrameLayout loadImage = giphyMediaAttachmentView.getBinding().loadImage;
            AbstractC22676k.m65749i(loadImage, "loadImage");
            loadImage.setVisibility(8);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return GiphyMediaAttachmentView.this.new C197661(this.$url, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C197661) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ShapeableImageView imageView = GiphyMediaAttachmentView.this.getBinding().imageView;
                AbstractC22676k.m65749i(imageView, "imageView");
                String str = this.$url;
                Drawable placeholderIcon = GiphyMediaAttachmentView.this.getStyle$stream_chat_android_ui_components_release().getPlaceholderIcon();
                final GiphyMediaAttachmentView giphyMediaAttachmentView = GiphyMediaAttachmentView.this;
                final int i14 = 0;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                GiphyMediaAttachmentView.C197661.invokeSuspend$lambda$0(giphyMediaAttachmentView);
                                break;
                            default:
                                GiphyMediaAttachmentView.C197661.invokeSuspend$lambda$1(giphyMediaAttachmentView);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                final int i15 = 1;
                InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                GiphyMediaAttachmentView.C197661.invokeSuspend$lambda$0(giphyMediaAttachmentView);
                                break;
                            default:
                                GiphyMediaAttachmentView.C197661.invokeSuspend$lambda$1(giphyMediaAttachmentView);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                this.label = 1;
                if (ImageUtilsKt.loadAndResize$default(imageView, str, placeholderIcon, null, interfaceC4339a, interfaceC4339a2, this, 4, null) == enumC31071a) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiphyMediaAttachmentView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    private final void applyAdaptiveSizing(GiphyInfo giphyInfo, String giphyUrl) {
        ConstraintLayout root = this.binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ConstraintLayoutKt.updateConstraints(root, new C19785p(2, this, giphyInfo));
        loadGiphy(giphyUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 applyAdaptiveSizing$lambda$0(GiphyMediaAttachmentView giphyMediaAttachmentView, GiphyInfo giphyInfo, C1153p updateConstraints) {
        AbstractC22676k.m65750j(updateConstraints, "$this$updateConstraints");
        updateConstraints.m3651j(giphyMediaAttachmentView.binding.imageView.getId()).f5118d.f5147Z = -1;
        updateConstraints.m3651j(giphyMediaAttachmentView.binding.imageView.getId()).f5118d.f5187y = String.valueOf((giphyInfo != null ? giphyInfo.getWidth() : 1) / (giphyInfo != null ? giphyInfo.getHeight() : 1));
        ShapeableImageView imageView = giphyMediaAttachmentView.binding.imageView;
        AbstractC22676k.m65749i(imageView, "imageView");
        ConstraintLayoutKt.constrainViewToParentBySide(updateConstraints, imageView, 1);
        ShapeableImageView imageView2 = giphyMediaAttachmentView.binding.imageView;
        AbstractC22676k.m65749i(imageView2, "imageView");
        ConstraintLayoutKt.constrainViewToParentBySide(updateConstraints, imageView2, 2);
        ShapeableImageView imageView3 = giphyMediaAttachmentView.binding.imageView;
        AbstractC22676k.m65749i(imageView3, "imageView");
        ConstraintLayoutKt.constrainViewToParentBySide(updateConstraints, imageView3, 3);
        ShapeableImageView imageView4 = giphyMediaAttachmentView.binding.imageView;
        AbstractC22676k.m65749i(imageView4, "imageView");
        ConstraintLayoutKt.constrainViewToParentBySide(updateConstraints, imageView4, 4);
        return C23454a0.f92919a;
    }

    private final void applyFixedSizing(String giphyUrl) {
        ConstraintLayout root = this.binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ConstraintLayoutKt.updateConstraints(root, new C19781l(this, 0));
        loadGiphy(giphyUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 applyFixedSizing$lambda$1(GiphyMediaAttachmentView giphyMediaAttachmentView, C1153p updateConstraints) {
        AbstractC22676k.m65750j(updateConstraints, "$this$updateConstraints");
        updateConstraints.m3651j(giphyMediaAttachmentView.binding.imageView.getId()).f5118d.f5150b = giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getWidth();
        if (giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getHeight() != -1) {
            updateConstraints.m3651j(giphyMediaAttachmentView.binding.imageView.getId()).f5118d.f5152c = giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getHeight();
        } else if (giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getDimensionRatio() == -1.0f) {
            updateConstraints.m3651j(giphyMediaAttachmentView.binding.imageView.getId()).f5118d.f5187y = UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE;
        } else {
            updateConstraints.m3651j(giphyMediaAttachmentView.binding.imageView.getId()).f5118d.f5187y = String.valueOf(giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getDimensionRatio());
        }
        return C23454a0.f92919a;
    }

    private final void init(AttributeSet attrs) {
        GiphyMediaAttachmentViewStyle.Companion companion = GiphyMediaAttachmentViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        setStyle$stream_chat_android_ui_components_release(companion.invoke$stream_chat_android_ui_components_release(context, attrs));
        this.binding.loadingProgressBar.setIndeterminateDrawable(getStyle$stream_chat_android_ui_components_release().getProgressIcon());
        this.binding.giphyLabel.setImageDrawable(getStyle$stream_chat_android_ui_components_release().getGiphyIcon());
        this.binding.imageView.setScaleType(getStyle$stream_chat_android_ui_components_release().getScaleType());
        this.binding.imageView.setBackgroundColor(getStyle$stream_chat_android_ui_components_release().getImageBackgroundColor());
    }

    private final void loadGiphy(String url) {
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getMain()), null, null, new C197661(url, null), 3);
    }

    private final void setImageShape(C22792k shapeAppearanceModel) {
        this.binding.imageView.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public static /* synthetic */ void showGiphy$default(GiphyMediaAttachmentView giphyMediaAttachmentView, Attachment attachment, GiphyInfoType giphyInfoType, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            giphyInfoType = giphyMediaAttachmentView.getStyle$stream_chat_android_ui_components_release().getGiphyType();
        }
        giphyMediaAttachmentView.showGiphy(attachment, giphyInfoType);
    }

    /* JADX INFO: renamed from: getBinding$stream_chat_android_ui_components_release, reason: from getter */
    public final StreamUiGiphyMediaAttachmentViewBinding getBinding() {
        return this.binding;
    }

    public final GiphyMediaAttachmentViewStyle getStyle$stream_chat_android_ui_components_release() {
        GiphyMediaAttachmentViewStyle giphyMediaAttachmentViewStyle = this.style;
        if (giphyMediaAttachmentViewStyle != null) {
            return giphyMediaAttachmentViewStyle;
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    public final boolean isStyleInitialized$stream_chat_android_ui_components_release() {
        return this.style != null;
    }

    public final void setImageShapeByCorners(float topLeft, float topRight, float bottomRight, float bottomLeft) {
        C22790i c22790i = new C22790i();
        C22790i c22790i2 = new C22790i();
        C22790i c22790i3 = new C22790i();
        C22790i c22790i4 = new C22790i();
        C22786e c22786e = new C22786e(0);
        C22786e c22786e2 = new C22786e(0);
        C22786e c22786e3 = new C22786e(0);
        C22786e c22786e4 = new C22786e(0);
        C22782a c22782a = new C22782a(topLeft);
        C22782a c22782a2 = new C22782a(topRight);
        C22782a c22782a3 = new C22782a(bottomRight);
        C22782a c22782a4 = new C22782a(bottomLeft);
        C22792k c22792k = new C22792k();
        c22792k.f89766a = c22790i;
        c22792k.f89767b = c22790i2;
        c22792k.f89768c = c22790i3;
        c22792k.f89769d = c22790i4;
        c22792k.f89770e = c22782a;
        c22792k.f89771f = c22782a2;
        c22792k.f89772g = c22782a3;
        c22792k.f89773h = c22782a4;
        c22792k.f89774i = c22786e;
        c22792k.f89775j = c22786e2;
        c22792k.f89776k = c22786e3;
        c22792k.f89777l = c22786e4;
        setImageShape(c22792k);
    }

    public final void setStyle$stream_chat_android_ui_components_release(GiphyMediaAttachmentViewStyle giphyMediaAttachmentViewStyle) {
        AbstractC22676k.m65750j(giphyMediaAttachmentViewStyle, "<set-?>");
        this.style = giphyMediaAttachmentViewStyle;
    }

    public final void showGiphy(Attachment attachment, GiphyInfoType giphyType) {
        String giphyFallbackPreviewUrl;
        AbstractC22676k.m65750j(attachment, "attachment");
        AbstractC22676k.m65750j(giphyType, "giphyType");
        GiphyInfo giphyInfo = GiphyInfoTypeKt.giphyInfo(attachment, giphyType);
        if ((giphyInfo == null || (giphyFallbackPreviewUrl = giphyInfo.getUrl()) == null) && (giphyFallbackPreviewUrl = AttachmentKt.getGiphyFallbackPreviewUrl(attachment)) == null) {
            return;
        }
        if (getStyle$stream_chat_android_ui_components_release().getSizingMode() == GiphySizingMode.ADAPTIVE) {
            applyAdaptiveSizing(giphyInfo, giphyFallbackPreviewUrl);
        } else {
            applyFixedSizing(giphyFallbackPreviewUrl);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiphyMediaAttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiphyMediaAttachmentView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiGiphyMediaAttachmentViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
        init(attributeSet);
    }
}
