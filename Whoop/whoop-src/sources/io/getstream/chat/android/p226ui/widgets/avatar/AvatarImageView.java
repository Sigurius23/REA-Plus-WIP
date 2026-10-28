package io.getstream.chat.android.p226ui.widgets.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import c93.InterfaceC4339a;
import com.google.android.material.imageview.ShapeableImageView;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "avatar", "placeholder", "Ll83/a0;", "setAvatar", "(Ljava/lang/Object;Ljava/lang/Object;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class AvatarImageView extends ShapeableImageView {
    public AvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void setAvatar$default(AvatarImageView avatarImageView, Object obj, Object obj2, int i13, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAvatar");
        }
        if ((i13 & 2) != 0) {
            obj2 = null;
        }
        avatarImageView.setAvatar(obj, obj2);
    }

    public final void setAvatar(Object avatar, Object placeholder) {
        if (placeholder instanceof Drawable) {
            ImageUtilsKt.load$default(this, avatar, (Drawable) placeholder, (StreamImageLoader.ImageTransformation) null, (InterfaceC4339a) null, (InterfaceC4339a) null, 28, (Object) null);
        } else {
            ImageUtilsKt.load$default(this, avatar, (Integer) placeholder, (StreamImageLoader.ImageTransformation) null, (InterfaceC4339a) null, (InterfaceC4339a) null, 28, (Object) null);
        }
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }

    public AvatarImageView(Context context) {
        super(context, null, 0);
    }
}
