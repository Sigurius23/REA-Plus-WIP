package io.getstream.chat.android.p226ui.widgets.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt;
import io.getstream.chat.android.p226ui.common.utils.extensions.UserKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.widgets.avatar.internal.AvatarPlaceholderDrawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kr.C22782a;
import kr.C22786e;
import kr.C22789h;
import kr.C22790i;
import kr.C22792k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001A\u0018\u0000 K2\u00020\u0001:\u0001KB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\f*\u00020#2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b,\u0010+J#\u0010.\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0014¢\u0006\u0004\b2\u00103J7\u00109\u001a\u00020\f2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0014¢\u0006\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006L"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "", "isUserAvatar", "()Z", "Lio/getstream/chat/android/models/Channel;", "channel", "showChannelAvatar", "(Lio/getstream/chat/android/models/Channel;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "showUserAvatar", "(Lio/getstream/chat/android/models/User;)V", "", "showGroupAvatar", "(Ljava/util/List;)V", "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;", "createUserView", "()Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;", "count", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;", "createImageViews", "(I)Ljava/util/List;", "Landroid/view/View;", "width", "height", "measureExactly", "(Landroid/view/View;II)V", "Landroid/graphics/Canvas;", "canvas", "drawBorder", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "currentUser", "setChannel", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;", "avatarStyle", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;", "Landroid/graphics/Paint;", "borderPaint", "Landroid/graphics/Paint;", "io/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1", "avatarViewProvider", "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarView$avatarViewProvider$1;", "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;", "avatarRenderer", "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;", "getAvatarRenderer", "()Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;", "setAvatarRenderer", "(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;)V", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelAvatarView extends ViewGroup {
    public static final int AVATAR_SIZE_EXTRA = 1;
    private ChannelAvatarRenderer avatarRenderer;
    private AvatarStyle avatarStyle;
    private final ChannelAvatarView$avatarViewProvider$1 avatarViewProvider;
    private final Paint borderPaint;

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.ROUND_RECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelAvatarView(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AvatarImageView> createImageViews(int count) {
        removeAllViews();
        ArrayList arrayList = new ArrayList(count);
        for (int i13 = 0; i13 < count; i13++) {
            AvatarImageView avatarImageView = new AvatarImageView(getContext());
            avatarImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(avatarImageView);
            arrayList.add(avatarImageView);
        }
        AvatarStyle avatarStyle = this.avatarStyle;
        if (avatarStyle == null) {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[avatarStyle.getAvatarShape().ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (count == 1) {
                AvatarImageView avatarImageView2 = (AvatarImageView) arrayList.get(0);
                C22790i c22790i = new C22790i();
                C22790i c22790i2 = new C22790i();
                C22790i c22790i3 = new C22790i();
                C22790i c22790i4 = new C22790i();
                C22786e c22786e = new C22786e(0);
                C22786e c22786e2 = new C22786e(0);
                C22786e c22786e3 = new C22786e(0);
                C22786e c22786e4 = new C22786e(0);
                AvatarStyle avatarStyle2 = this.avatarStyle;
                if (avatarStyle2 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a = new C22782a(avatarStyle2.getBorderRadius());
                C22792k c22792k = new C22792k();
                c22792k.f89766a = c22790i;
                c22792k.f89767b = c22790i2;
                c22792k.f89768c = c22790i3;
                c22792k.f89769d = c22790i4;
                c22792k.f89770e = c22782a;
                c22792k.f89771f = c22782a;
                c22792k.f89772g = c22782a;
                c22792k.f89773h = c22782a;
                c22792k.f89774i = c22786e;
                c22792k.f89775j = c22786e2;
                c22792k.f89776k = c22786e3;
                c22792k.f89777l = c22786e4;
                avatarImageView2.setShapeAppearanceModel(c22792k);
                return arrayList;
            }
            if (count == 2) {
                AvatarImageView avatarImageView3 = (AvatarImageView) arrayList.get(0);
                C22790i c22790i5 = new C22790i();
                C22790i c22790i6 = new C22790i();
                C22790i c22790i7 = new C22790i();
                C22790i c22790i8 = new C22790i();
                C22782a c22782a2 = new C22782a(0.0f);
                C22782a c22782a3 = new C22782a(0.0f);
                C22786e c22786e5 = new C22786e(0);
                C22786e c22786e6 = new C22786e(0);
                C22786e c22786e7 = new C22786e(0);
                C22786e c22786e8 = new C22786e(0);
                AvatarStyle avatarStyle3 = this.avatarStyle;
                if (avatarStyle3 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a4 = new C22782a(avatarStyle3.getBorderRadius());
                AvatarStyle avatarStyle4 = this.avatarStyle;
                if (avatarStyle4 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a5 = new C22782a(avatarStyle4.getBorderRadius());
                C22792k c22792k2 = new C22792k();
                c22792k2.f89766a = c22790i5;
                c22792k2.f89767b = c22790i6;
                c22792k2.f89768c = c22790i7;
                c22792k2.f89769d = c22790i8;
                c22792k2.f89770e = c22782a4;
                c22792k2.f89771f = c22782a2;
                c22792k2.f89772g = c22782a3;
                c22792k2.f89773h = c22782a5;
                c22792k2.f89774i = c22786e5;
                c22792k2.f89775j = c22786e6;
                c22792k2.f89776k = c22786e7;
                c22792k2.f89777l = c22786e8;
                avatarImageView3.setShapeAppearanceModel(c22792k2);
                AvatarImageView avatarImageView4 = (AvatarImageView) arrayList.get(1);
                C22790i c22790i9 = new C22790i();
                C22790i c22790i10 = new C22790i();
                C22790i c22790i11 = new C22790i();
                C22790i c22790i12 = new C22790i();
                C22782a c22782a6 = new C22782a(0.0f);
                C22782a c22782a7 = new C22782a(0.0f);
                C22786e c22786e9 = new C22786e(0);
                C22786e c22786e10 = new C22786e(0);
                C22786e c22786e11 = new C22786e(0);
                C22786e c22786e12 = new C22786e(0);
                AvatarStyle avatarStyle5 = this.avatarStyle;
                if (avatarStyle5 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a8 = new C22782a(avatarStyle5.getBorderRadius());
                AvatarStyle avatarStyle6 = this.avatarStyle;
                if (avatarStyle6 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a9 = new C22782a(avatarStyle6.getBorderRadius());
                C22792k c22792k3 = new C22792k();
                c22792k3.f89766a = c22790i9;
                c22792k3.f89767b = c22790i10;
                c22792k3.f89768c = c22790i11;
                c22792k3.f89769d = c22790i12;
                c22792k3.f89770e = c22782a6;
                c22792k3.f89771f = c22782a8;
                c22792k3.f89772g = c22782a9;
                c22792k3.f89773h = c22782a7;
                c22792k3.f89774i = c22786e9;
                c22792k3.f89775j = c22786e10;
                c22792k3.f89776k = c22786e11;
                c22792k3.f89777l = c22786e12;
                avatarImageView4.setShapeAppearanceModel(c22792k3);
                return arrayList;
            }
            if (count == 3) {
                AvatarImageView avatarImageView5 = (AvatarImageView) arrayList.get(0);
                C22790i c22790i13 = new C22790i();
                C22790i c22790i14 = new C22790i();
                C22790i c22790i15 = new C22790i();
                C22790i c22790i16 = new C22790i();
                C22782a c22782a10 = new C22782a(0.0f);
                C22782a c22782a11 = new C22782a(0.0f);
                C22782a c22782a12 = new C22782a(0.0f);
                C22786e c22786e13 = new C22786e(0);
                C22786e c22786e14 = new C22786e(0);
                C22786e c22786e15 = new C22786e(0);
                C22786e c22786e16 = new C22786e(0);
                AvatarStyle avatarStyle7 = this.avatarStyle;
                if (avatarStyle7 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a13 = new C22782a(avatarStyle7.getBorderRadius());
                C22792k c22792k4 = new C22792k();
                c22792k4.f89766a = c22790i13;
                c22792k4.f89767b = c22790i14;
                c22792k4.f89768c = c22790i15;
                c22792k4.f89769d = c22790i16;
                c22792k4.f89770e = c22782a13;
                c22792k4.f89771f = c22782a10;
                c22792k4.f89772g = c22782a11;
                c22792k4.f89773h = c22782a12;
                c22792k4.f89774i = c22786e13;
                c22792k4.f89775j = c22786e14;
                c22792k4.f89776k = c22786e15;
                c22792k4.f89777l = c22786e16;
                avatarImageView5.setShapeAppearanceModel(c22792k4);
                AvatarImageView avatarImageView6 = (AvatarImageView) arrayList.get(1);
                C22790i c22790i17 = new C22790i();
                C22790i c22790i18 = new C22790i();
                C22790i c22790i19 = new C22790i();
                C22790i c22790i20 = new C22790i();
                C22782a c22782a14 = new C22782a(0.0f);
                C22782a c22782a15 = new C22782a(0.0f);
                C22786e c22786e17 = new C22786e(0);
                C22786e c22786e18 = new C22786e(0);
                C22786e c22786e19 = new C22786e(0);
                C22786e c22786e20 = new C22786e(0);
                AvatarStyle avatarStyle8 = this.avatarStyle;
                if (avatarStyle8 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a16 = new C22782a(avatarStyle8.getBorderRadius());
                AvatarStyle avatarStyle9 = this.avatarStyle;
                if (avatarStyle9 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a17 = new C22782a(avatarStyle9.getBorderRadius());
                C22792k c22792k5 = new C22792k();
                c22792k5.f89766a = c22790i17;
                c22792k5.f89767b = c22790i18;
                c22792k5.f89768c = c22790i19;
                c22792k5.f89769d = c22790i20;
                c22792k5.f89770e = c22782a14;
                c22792k5.f89771f = c22782a16;
                c22792k5.f89772g = c22782a17;
                c22792k5.f89773h = c22782a15;
                c22792k5.f89774i = c22786e17;
                c22792k5.f89775j = c22786e18;
                c22792k5.f89776k = c22786e19;
                c22792k5.f89777l = c22786e20;
                avatarImageView6.setShapeAppearanceModel(c22792k5);
                AvatarImageView avatarImageView7 = (AvatarImageView) arrayList.get(2);
                C22790i c22790i21 = new C22790i();
                C22790i c22790i22 = new C22790i();
                C22790i c22790i23 = new C22790i();
                C22790i c22790i24 = new C22790i();
                C22782a c22782a18 = new C22782a(0.0f);
                C22782a c22782a19 = new C22782a(0.0f);
                C22782a c22782a20 = new C22782a(0.0f);
                C22786e c22786e21 = new C22786e(0);
                C22786e c22786e22 = new C22786e(0);
                C22786e c22786e23 = new C22786e(0);
                C22786e c22786e24 = new C22786e(0);
                AvatarStyle avatarStyle10 = this.avatarStyle;
                if (avatarStyle10 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a21 = new C22782a(avatarStyle10.getBorderRadius());
                C22792k c22792k6 = new C22792k();
                c22792k6.f89766a = c22790i21;
                c22792k6.f89767b = c22790i22;
                c22792k6.f89768c = c22790i23;
                c22792k6.f89769d = c22790i24;
                c22792k6.f89770e = c22782a18;
                c22792k6.f89771f = c22782a19;
                c22792k6.f89772g = c22782a20;
                c22792k6.f89773h = c22782a21;
                c22792k6.f89774i = c22786e21;
                c22792k6.f89775j = c22786e22;
                c22792k6.f89776k = c22786e23;
                c22792k6.f89777l = c22786e24;
                avatarImageView7.setShapeAppearanceModel(c22792k6);
                return arrayList;
            }
            if (count == 4) {
                AvatarImageView avatarImageView8 = (AvatarImageView) arrayList.get(0);
                C22790i c22790i25 = new C22790i();
                C22790i c22790i26 = new C22790i();
                C22790i c22790i27 = new C22790i();
                C22790i c22790i28 = new C22790i();
                C22782a c22782a22 = new C22782a(0.0f);
                C22782a c22782a23 = new C22782a(0.0f);
                C22782a c22782a24 = new C22782a(0.0f);
                C22786e c22786e25 = new C22786e(0);
                C22786e c22786e26 = new C22786e(0);
                C22786e c22786e27 = new C22786e(0);
                C22786e c22786e28 = new C22786e(0);
                AvatarStyle avatarStyle11 = this.avatarStyle;
                if (avatarStyle11 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a25 = new C22782a(avatarStyle11.getBorderRadius());
                C22792k c22792k7 = new C22792k();
                c22792k7.f89766a = c22790i25;
                c22792k7.f89767b = c22790i26;
                c22792k7.f89768c = c22790i27;
                c22792k7.f89769d = c22790i28;
                c22792k7.f89770e = c22782a25;
                c22792k7.f89771f = c22782a22;
                c22792k7.f89772g = c22782a23;
                c22792k7.f89773h = c22782a24;
                c22792k7.f89774i = c22786e25;
                c22792k7.f89775j = c22786e26;
                c22792k7.f89776k = c22786e27;
                c22792k7.f89777l = c22786e28;
                avatarImageView8.setShapeAppearanceModel(c22792k7);
                AvatarImageView avatarImageView9 = (AvatarImageView) arrayList.get(1);
                C22790i c22790i29 = new C22790i();
                C22790i c22790i30 = new C22790i();
                C22790i c22790i31 = new C22790i();
                C22790i c22790i32 = new C22790i();
                C22782a c22782a26 = new C22782a(0.0f);
                C22782a c22782a27 = new C22782a(0.0f);
                C22782a c22782a28 = new C22782a(0.0f);
                C22786e c22786e29 = new C22786e(0);
                C22786e c22786e30 = new C22786e(0);
                C22786e c22786e31 = new C22786e(0);
                C22786e c22786e32 = new C22786e(0);
                AvatarStyle avatarStyle12 = this.avatarStyle;
                if (avatarStyle12 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a29 = new C22782a(avatarStyle12.getBorderRadius());
                C22792k c22792k8 = new C22792k();
                c22792k8.f89766a = c22790i29;
                c22792k8.f89767b = c22790i30;
                c22792k8.f89768c = c22790i31;
                c22792k8.f89769d = c22790i32;
                c22792k8.f89770e = c22782a26;
                c22792k8.f89771f = c22782a29;
                c22792k8.f89772g = c22782a27;
                c22792k8.f89773h = c22782a28;
                c22792k8.f89774i = c22786e29;
                c22792k8.f89775j = c22786e30;
                c22792k8.f89776k = c22786e31;
                c22792k8.f89777l = c22786e32;
                avatarImageView9.setShapeAppearanceModel(c22792k8);
                AvatarImageView avatarImageView10 = (AvatarImageView) arrayList.get(2);
                C22790i c22790i33 = new C22790i();
                C22790i c22790i34 = new C22790i();
                C22790i c22790i35 = new C22790i();
                C22790i c22790i36 = new C22790i();
                C22782a c22782a30 = new C22782a(0.0f);
                C22782a c22782a31 = new C22782a(0.0f);
                C22782a c22782a32 = new C22782a(0.0f);
                C22786e c22786e33 = new C22786e(0);
                C22786e c22786e34 = new C22786e(0);
                C22786e c22786e35 = new C22786e(0);
                C22786e c22786e36 = new C22786e(0);
                AvatarStyle avatarStyle13 = this.avatarStyle;
                if (avatarStyle13 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a33 = new C22782a(avatarStyle13.getBorderRadius());
                C22792k c22792k9 = new C22792k();
                c22792k9.f89766a = c22790i33;
                c22792k9.f89767b = c22790i34;
                c22792k9.f89768c = c22790i35;
                c22792k9.f89769d = c22790i36;
                c22792k9.f89770e = c22782a30;
                c22792k9.f89771f = c22782a31;
                c22792k9.f89772g = c22782a32;
                c22792k9.f89773h = c22782a33;
                c22792k9.f89774i = c22786e33;
                c22792k9.f89775j = c22786e34;
                c22792k9.f89776k = c22786e35;
                c22792k9.f89777l = c22786e36;
                avatarImageView10.setShapeAppearanceModel(c22792k9);
                AvatarImageView avatarImageView11 = (AvatarImageView) arrayList.get(3);
                C22790i c22790i37 = new C22790i();
                C22790i c22790i38 = new C22790i();
                C22790i c22790i39 = new C22790i();
                C22790i c22790i40 = new C22790i();
                C22782a c22782a34 = new C22782a(0.0f);
                C22782a c22782a35 = new C22782a(0.0f);
                C22782a c22782a36 = new C22782a(0.0f);
                C22786e c22786e37 = new C22786e(0);
                C22786e c22786e38 = new C22786e(0);
                C22786e c22786e39 = new C22786e(0);
                C22786e c22786e40 = new C22786e(0);
                AvatarStyle avatarStyle14 = this.avatarStyle;
                if (avatarStyle14 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                C22782a c22782a37 = new C22782a(avatarStyle14.getBorderRadius());
                C22792k c22792k10 = new C22792k();
                c22792k10.f89766a = c22790i37;
                c22792k10.f89767b = c22790i38;
                c22792k10.f89768c = c22790i39;
                c22792k10.f89769d = c22790i40;
                c22792k10.f89770e = c22782a34;
                c22792k10.f89771f = c22782a35;
                c22792k10.f89772g = c22782a37;
                c22792k10.f89773h = c22782a36;
                c22792k10.f89774i = c22786e37;
                c22792k10.f89775j = c22786e38;
                c22792k10.f89776k = c22786e39;
                c22792k10.f89777l = c22786e40;
                avatarImageView11.setShapeAppearanceModel(c22792k10);
                return arrayList;
            }
        } else {
            if (count == 1) {
                AvatarImageView avatarImageView12 = (AvatarImageView) arrayList.get(0);
                C22790i c22790i41 = new C22790i();
                C22790i c22790i42 = new C22790i();
                C22790i c22790i43 = new C22790i();
                C22790i c22790i44 = new C22790i();
                C22786e c22786e41 = new C22786e(0);
                C22786e c22786e42 = new C22786e(0);
                C22786e c22786e43 = new C22786e(0);
                C22786e c22786e44 = new C22786e(0);
                C22789h c22789h = new C22789h(0.5f);
                C22792k c22792k11 = new C22792k();
                c22792k11.f89766a = c22790i41;
                c22792k11.f89767b = c22790i42;
                c22792k11.f89768c = c22790i43;
                c22792k11.f89769d = c22790i44;
                c22792k11.f89770e = c22789h;
                c22792k11.f89771f = c22789h;
                c22792k11.f89772g = c22789h;
                c22792k11.f89773h = c22789h;
                c22792k11.f89774i = c22786e41;
                c22792k11.f89775j = c22786e42;
                c22792k11.f89776k = c22786e43;
                c22792k11.f89777l = c22786e44;
                avatarImageView12.setShapeAppearanceModel(c22792k11);
                return arrayList;
            }
            if (count == 2) {
                AvatarImageView avatarImageView13 = (AvatarImageView) arrayList.get(0);
                C22790i c22790i45 = new C22790i();
                C22790i c22790i46 = new C22790i();
                C22790i c22790i47 = new C22790i();
                C22790i c22790i48 = new C22790i();
                C22782a c22782a38 = new C22782a(0.0f);
                C22782a c22782a39 = new C22782a(0.0f);
                C22786e c22786e45 = new C22786e(0);
                C22786e c22786e46 = new C22786e(0);
                C22786e c22786e47 = new C22786e(0);
                C22786e c22786e48 = new C22786e(0);
                C22789h c22789h2 = new C22789h(1.0f);
                C22789h c22789h3 = new C22789h(1.0f);
                C22792k c22792k12 = new C22792k();
                c22792k12.f89766a = c22790i45;
                c22792k12.f89767b = c22790i46;
                c22792k12.f89768c = c22790i47;
                c22792k12.f89769d = c22790i48;
                c22792k12.f89770e = c22789h2;
                c22792k12.f89771f = c22782a38;
                c22792k12.f89772g = c22782a39;
                c22792k12.f89773h = c22789h3;
                c22792k12.f89774i = c22786e45;
                c22792k12.f89775j = c22786e46;
                c22792k12.f89776k = c22786e47;
                c22792k12.f89777l = c22786e48;
                avatarImageView13.setShapeAppearanceModel(c22792k12);
                AvatarImageView avatarImageView14 = (AvatarImageView) arrayList.get(1);
                C22790i c22790i49 = new C22790i();
                C22790i c22790i50 = new C22790i();
                C22790i c22790i51 = new C22790i();
                C22790i c22790i52 = new C22790i();
                C22782a c22782a40 = new C22782a(0.0f);
                C22782a c22782a41 = new C22782a(0.0f);
                C22786e c22786e49 = new C22786e(0);
                C22786e c22786e50 = new C22786e(0);
                C22786e c22786e51 = new C22786e(0);
                C22786e c22786e52 = new C22786e(0);
                C22789h c22789h4 = new C22789h(1.0f);
                C22789h c22789h5 = new C22789h(1.0f);
                C22792k c22792k13 = new C22792k();
                c22792k13.f89766a = c22790i49;
                c22792k13.f89767b = c22790i50;
                c22792k13.f89768c = c22790i51;
                c22792k13.f89769d = c22790i52;
                c22792k13.f89770e = c22782a40;
                c22792k13.f89771f = c22789h4;
                c22792k13.f89772g = c22789h5;
                c22792k13.f89773h = c22782a41;
                c22792k13.f89774i = c22786e49;
                c22792k13.f89775j = c22786e50;
                c22792k13.f89776k = c22786e51;
                c22792k13.f89777l = c22786e52;
                avatarImageView14.setShapeAppearanceModel(c22792k13);
                return arrayList;
            }
            if (count == 3) {
                AvatarImageView avatarImageView15 = (AvatarImageView) arrayList.get(0);
                C22790i c22790i53 = new C22790i();
                C22790i c22790i54 = new C22790i();
                C22790i c22790i55 = new C22790i();
                C22790i c22790i56 = new C22790i();
                C22782a c22782a42 = new C22782a(0.0f);
                C22782a c22782a43 = new C22782a(0.0f);
                C22782a c22782a44 = new C22782a(0.0f);
                C22786e c22786e53 = new C22786e(0);
                C22786e c22786e54 = new C22786e(0);
                C22786e c22786e55 = new C22786e(0);
                C22786e c22786e56 = new C22786e(0);
                C22789h c22789h6 = new C22789h(1.0f);
                C22792k c22792k14 = new C22792k();
                c22792k14.f89766a = c22790i53;
                c22792k14.f89767b = c22790i54;
                c22792k14.f89768c = c22790i55;
                c22792k14.f89769d = c22790i56;
                c22792k14.f89770e = c22789h6;
                c22792k14.f89771f = c22782a42;
                c22792k14.f89772g = c22782a43;
                c22792k14.f89773h = c22782a44;
                c22792k14.f89774i = c22786e53;
                c22792k14.f89775j = c22786e54;
                c22792k14.f89776k = c22786e55;
                c22792k14.f89777l = c22786e56;
                avatarImageView15.setShapeAppearanceModel(c22792k14);
                AvatarImageView avatarImageView16 = (AvatarImageView) arrayList.get(1);
                C22790i c22790i57 = new C22790i();
                C22790i c22790i58 = new C22790i();
                C22790i c22790i59 = new C22790i();
                C22790i c22790i60 = new C22790i();
                C22782a c22782a45 = new C22782a(0.0f);
                C22782a c22782a46 = new C22782a(0.0f);
                C22786e c22786e57 = new C22786e(0);
                C22786e c22786e58 = new C22786e(0);
                C22786e c22786e59 = new C22786e(0);
                C22786e c22786e60 = new C22786e(0);
                C22789h c22789h7 = new C22789h(1.0f);
                C22789h c22789h8 = new C22789h(1.0f);
                C22792k c22792k15 = new C22792k();
                c22792k15.f89766a = c22790i57;
                c22792k15.f89767b = c22790i58;
                c22792k15.f89768c = c22790i59;
                c22792k15.f89769d = c22790i60;
                c22792k15.f89770e = c22782a45;
                c22792k15.f89771f = c22789h7;
                c22792k15.f89772g = c22789h8;
                c22792k15.f89773h = c22782a46;
                c22792k15.f89774i = c22786e57;
                c22792k15.f89775j = c22786e58;
                c22792k15.f89776k = c22786e59;
                c22792k15.f89777l = c22786e60;
                avatarImageView16.setShapeAppearanceModel(c22792k15);
                AvatarImageView avatarImageView17 = (AvatarImageView) arrayList.get(2);
                C22790i c22790i61 = new C22790i();
                C22790i c22790i62 = new C22790i();
                C22790i c22790i63 = new C22790i();
                C22790i c22790i64 = new C22790i();
                C22782a c22782a47 = new C22782a(0.0f);
                C22782a c22782a48 = new C22782a(0.0f);
                C22782a c22782a49 = new C22782a(0.0f);
                C22786e c22786e61 = new C22786e(0);
                C22786e c22786e62 = new C22786e(0);
                C22786e c22786e63 = new C22786e(0);
                C22786e c22786e64 = new C22786e(0);
                C22789h c22789h9 = new C22789h(1.0f);
                C22792k c22792k16 = new C22792k();
                c22792k16.f89766a = c22790i61;
                c22792k16.f89767b = c22790i62;
                c22792k16.f89768c = c22790i63;
                c22792k16.f89769d = c22790i64;
                c22792k16.f89770e = c22782a47;
                c22792k16.f89771f = c22782a48;
                c22792k16.f89772g = c22782a49;
                c22792k16.f89773h = c22789h9;
                c22792k16.f89774i = c22786e61;
                c22792k16.f89775j = c22786e62;
                c22792k16.f89776k = c22786e63;
                c22792k16.f89777l = c22786e64;
                avatarImageView17.setShapeAppearanceModel(c22792k16);
                return arrayList;
            }
            if (count == 4) {
                AvatarImageView avatarImageView18 = (AvatarImageView) arrayList.get(0);
                C22790i c22790i65 = new C22790i();
                C22790i c22790i66 = new C22790i();
                C22790i c22790i67 = new C22790i();
                C22790i c22790i68 = new C22790i();
                C22782a c22782a50 = new C22782a(0.0f);
                C22782a c22782a51 = new C22782a(0.0f);
                C22782a c22782a52 = new C22782a(0.0f);
                C22786e c22786e65 = new C22786e(0);
                C22786e c22786e66 = new C22786e(0);
                C22786e c22786e67 = new C22786e(0);
                C22786e c22786e68 = new C22786e(0);
                C22789h c22789h10 = new C22789h(1.0f);
                C22792k c22792k17 = new C22792k();
                c22792k17.f89766a = c22790i65;
                c22792k17.f89767b = c22790i66;
                c22792k17.f89768c = c22790i67;
                c22792k17.f89769d = c22790i68;
                c22792k17.f89770e = c22789h10;
                c22792k17.f89771f = c22782a50;
                c22792k17.f89772g = c22782a51;
                c22792k17.f89773h = c22782a52;
                c22792k17.f89774i = c22786e65;
                c22792k17.f89775j = c22786e66;
                c22792k17.f89776k = c22786e67;
                c22792k17.f89777l = c22786e68;
                avatarImageView18.setShapeAppearanceModel(c22792k17);
                AvatarImageView avatarImageView19 = (AvatarImageView) arrayList.get(1);
                C22790i c22790i69 = new C22790i();
                C22790i c22790i70 = new C22790i();
                C22790i c22790i71 = new C22790i();
                C22790i c22790i72 = new C22790i();
                C22782a c22782a53 = new C22782a(0.0f);
                C22782a c22782a54 = new C22782a(0.0f);
                C22782a c22782a55 = new C22782a(0.0f);
                C22786e c22786e69 = new C22786e(0);
                C22786e c22786e70 = new C22786e(0);
                C22786e c22786e71 = new C22786e(0);
                C22786e c22786e72 = new C22786e(0);
                C22789h c22789h11 = new C22789h(1.0f);
                C22792k c22792k18 = new C22792k();
                c22792k18.f89766a = c22790i69;
                c22792k18.f89767b = c22790i70;
                c22792k18.f89768c = c22790i71;
                c22792k18.f89769d = c22790i72;
                c22792k18.f89770e = c22782a53;
                c22792k18.f89771f = c22789h11;
                c22792k18.f89772g = c22782a54;
                c22792k18.f89773h = c22782a55;
                c22792k18.f89774i = c22786e69;
                c22792k18.f89775j = c22786e70;
                c22792k18.f89776k = c22786e71;
                c22792k18.f89777l = c22786e72;
                avatarImageView19.setShapeAppearanceModel(c22792k18);
                AvatarImageView avatarImageView20 = (AvatarImageView) arrayList.get(2);
                C22790i c22790i73 = new C22790i();
                C22790i c22790i74 = new C22790i();
                C22790i c22790i75 = new C22790i();
                C22790i c22790i76 = new C22790i();
                C22782a c22782a56 = new C22782a(0.0f);
                C22782a c22782a57 = new C22782a(0.0f);
                C22782a c22782a58 = new C22782a(0.0f);
                C22786e c22786e73 = new C22786e(0);
                C22786e c22786e74 = new C22786e(0);
                C22786e c22786e75 = new C22786e(0);
                C22786e c22786e76 = new C22786e(0);
                C22789h c22789h12 = new C22789h(1.0f);
                C22792k c22792k19 = new C22792k();
                c22792k19.f89766a = c22790i73;
                c22792k19.f89767b = c22790i74;
                c22792k19.f89768c = c22790i75;
                c22792k19.f89769d = c22790i76;
                c22792k19.f89770e = c22782a56;
                c22792k19.f89771f = c22782a57;
                c22792k19.f89772g = c22782a58;
                c22792k19.f89773h = c22789h12;
                c22792k19.f89774i = c22786e73;
                c22792k19.f89775j = c22786e74;
                c22792k19.f89776k = c22786e75;
                c22792k19.f89777l = c22786e76;
                avatarImageView20.setShapeAppearanceModel(c22792k19);
                AvatarImageView avatarImageView21 = (AvatarImageView) arrayList.get(3);
                C22790i c22790i77 = new C22790i();
                C22790i c22790i78 = new C22790i();
                C22790i c22790i79 = new C22790i();
                C22790i c22790i80 = new C22790i();
                C22782a c22782a59 = new C22782a(0.0f);
                C22782a c22782a60 = new C22782a(0.0f);
                C22782a c22782a61 = new C22782a(0.0f);
                C22786e c22786e77 = new C22786e(0);
                C22786e c22786e78 = new C22786e(0);
                C22786e c22786e79 = new C22786e(0);
                C22786e c22786e80 = new C22786e(0);
                C22789h c22789h13 = new C22789h(1.0f);
                C22792k c22792k20 = new C22792k();
                c22792k20.f89766a = c22790i77;
                c22792k20.f89767b = c22790i78;
                c22792k20.f89768c = c22790i79;
                c22792k20.f89769d = c22790i80;
                c22792k20.f89770e = c22782a59;
                c22792k20.f89771f = c22782a60;
                c22792k20.f89772g = c22789h13;
                c22792k20.f89773h = c22782a61;
                c22792k20.f89774i = c22786e77;
                c22792k20.f89775j = c22786e78;
                c22792k20.f89776k = c22786e79;
                c22792k20.f89777l = c22786e80;
                avatarImageView21.setShapeAppearanceModel(c22792k20);
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserAvatarView createUserView() {
        removeAllViews();
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        AvatarStyle avatarStyle = this.avatarStyle;
        if (avatarStyle == null) {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
        UserAvatarView userAvatarView = new UserAvatarView(context, avatarStyle);
        addView(userAvatarView);
        return userAvatarView;
    }

    private final void drawBorder(Canvas canvas) {
        AvatarStyle avatarStyle = this.avatarStyle;
        if (avatarStyle == null) {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
        if (avatarStyle.getAvatarBorderWidth() == 0) {
            return;
        }
        AvatarStyle avatarStyle2 = this.avatarStyle;
        if (avatarStyle2 == null) {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
        float avatarBorderWidth = avatarStyle2.getAvatarBorderWidth() / 2;
        AvatarStyle avatarStyle3 = this.avatarStyle;
        if (avatarStyle3 == null) {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
        if (WhenMappings.$EnumSwitchMapping$0[avatarStyle3.getAvatarShape().ordinal()] != 2) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - avatarBorderWidth, this.borderPaint);
            return;
        }
        float width = getWidth() - avatarBorderWidth;
        float height = getHeight() - avatarBorderWidth;
        AvatarStyle avatarStyle4 = this.avatarStyle;
        if (avatarStyle4 == null) {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
        float borderRadius = avatarStyle4.getBorderRadius();
        AvatarStyle avatarStyle5 = this.avatarStyle;
        if (avatarStyle5 != null) {
            canvas.drawRoundRect(avatarBorderWidth, avatarBorderWidth, width, height, borderRadius, avatarStyle5.getBorderRadius(), this.borderPaint);
        } else {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
    }

    private final void init(Context context, AttributeSet attrs) {
        AvatarStyle avatarStyleInvoke = AvatarStyle.INSTANCE.invoke(context, attrs);
        this.avatarStyle = avatarStyleInvoke;
        if (avatarStyleInvoke == null) {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
        int avatarBorderWidth = avatarStyleInvoke.getAvatarBorderWidth() - 1;
        if (avatarBorderWidth < 0) {
            avatarBorderWidth = 0;
        }
        setPadding(avatarBorderWidth, avatarBorderWidth, avatarBorderWidth, avatarBorderWidth);
        Paint paint = this.borderPaint;
        AvatarStyle avatarStyle = this.avatarStyle;
        if (avatarStyle == null) {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
        paint.setColor(avatarStyle.getAvatarBorderColor());
        Paint paint2 = this.borderPaint;
        AvatarStyle avatarStyle2 = this.avatarStyle;
        if (avatarStyle2 == null) {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
        paint2.setStrokeWidth(avatarStyle2.getAvatarBorderWidth());
        setWillNotDraw(false);
        this.avatarRenderer = ChatUI.getChannelAvatarRenderer();
    }

    private final boolean isUserAvatar() {
        return getChildCount() == 1 && (getChildAt(0) instanceof UserAvatarView);
    }

    private final void measureExactly(View view, int i13, int i14) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
    }

    public static /* synthetic */ void setChannel$default(ChannelAvatarView channelAvatarView, Channel channel, User user, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            user = ChatUI.getCurrentUserProvider().getCurrentUser();
        }
        channelAvatarView.setChannel(channel, user);
    }

    private final void showChannelAvatar(Channel channel) {
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC25265s.m74096F0(createImageViews(1));
        String image = channel.getImage();
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        String initials = ChannelKt.getInitials(channel);
        AvatarStyle avatarStyle = this.avatarStyle;
        if (avatarStyle != null) {
            avatarImageView.setAvatar(image, new AvatarPlaceholderDrawable(context, initials, avatarStyle.getAvatarInitialsTextStyle()));
        } else {
            AbstractC22676k.m65757q("avatarStyle");
            throw null;
        }
    }

    private final void showGroupAvatar(List<User> user) {
        int size = user.size();
        if (4 <= size) {
            size = 4;
        }
        List<AvatarImageView> listCreateImageViews = createImageViews(size);
        int size2 = user.size();
        int i13 = 4 > size2 ? size2 : 4;
        for (int i14 = 0; i14 < i13; i14++) {
            AvatarImageView avatarImageView = (AvatarImageView) ((ArrayList) listCreateImageViews).get(i14);
            String image = user.get(i14).getImage();
            Context context = getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            String initials = UserKt.getInitials(user.get(i14));
            AvatarStyle avatarStyle = this.avatarStyle;
            if (avatarStyle == null) {
                AbstractC22676k.m65757q("avatarStyle");
                throw null;
            }
            avatarImageView.setAvatar(image, new AvatarPlaceholderDrawable(context, initials, avatarStyle.getGroupAvatarInitialsTextStyle()));
        }
    }

    private final void showUserAvatar(User user) {
        UserAvatarView.setUser$default(createUserView(), user, false, 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (isUserAvatar()) {
            return;
        }
        drawBorder(canvas);
    }

    public final ChannelAvatarRenderer getAvatarRenderer() {
        return this.avatarRenderer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean changed, int l7, int t14, int r10, int b) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int childCount = getChildCount();
        if (childCount == 1) {
            getChildAt(0).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (childCount == 2) {
            getChildAt(0).layout(0, 0, measuredWidth, getMeasuredHeight());
            getChildAt(1).layout(getMeasuredWidth() - measuredWidth, 0, getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (childCount == 3) {
            getChildAt(0).layout(0, 0, measuredWidth, measuredHeight);
            getChildAt(1).layout(measuredWidth, 0, getMeasuredWidth(), getMeasuredHeight());
            getChildAt(2).layout(0, measuredHeight, measuredWidth, getMeasuredHeight());
        } else {
            if (childCount != 4) {
                return;
            }
            getChildAt(0).layout(0, 0, measuredWidth, measuredHeight);
            getChildAt(1).layout(getMeasuredWidth() - measuredWidth, 0, getMeasuredWidth(), measuredHeight);
            getChildAt(2).layout(0, measuredHeight, measuredWidth, getMeasuredHeight());
            getChildAt(3).layout(measuredWidth, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int i13 = size / 2;
        int i14 = size2 / 2;
        int childCount = getChildCount();
        if (childCount == 1) {
            View childAt = getChildAt(0);
            AbstractC22676k.m65749i(childAt, "getChildAt(...)");
            measureExactly(childAt, size, size2);
        } else if (childCount == 2) {
            View childAt2 = getChildAt(0);
            AbstractC22676k.m65749i(childAt2, "getChildAt(...)");
            measureExactly(childAt2, i13, size2);
            View childAt3 = getChildAt(1);
            AbstractC22676k.m65749i(childAt3, "getChildAt(...)");
            measureExactly(childAt3, i13, size2);
        } else if (childCount == 3) {
            View childAt4 = getChildAt(0);
            AbstractC22676k.m65749i(childAt4, "getChildAt(...)");
            measureExactly(childAt4, i13, i14);
            View childAt5 = getChildAt(1);
            AbstractC22676k.m65749i(childAt5, "getChildAt(...)");
            measureExactly(childAt5, i13, size2);
            View childAt6 = getChildAt(2);
            AbstractC22676k.m65749i(childAt6, "getChildAt(...)");
            measureExactly(childAt6, i13, i14);
        } else if (childCount == 4) {
            View childAt7 = getChildAt(0);
            AbstractC22676k.m65749i(childAt7, "getChildAt(...)");
            measureExactly(childAt7, i13, i14);
            View childAt8 = getChildAt(1);
            AbstractC22676k.m65749i(childAt8, "getChildAt(...)");
            measureExactly(childAt8, i13, i14);
            View childAt9 = getChildAt(2);
            AbstractC22676k.m65749i(childAt9, "getChildAt(...)");
            measureExactly(childAt9, i13, i14);
            View childAt10 = getChildAt(3);
            AbstractC22676k.m65749i(childAt10, "getChildAt(...)");
            measureExactly(childAt10, i13, i14);
        }
        setMeasuredDimension(size, size2);
    }

    public final void setAvatarRenderer(ChannelAvatarRenderer channelAvatarRenderer) {
        this.avatarRenderer = channelAvatarRenderer;
    }

    public final void setChannel(Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        setChannel$default(this, channel, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    public final void setChannel(Channel channel, User currentUser) {
        AbstractC22676k.m65750j(channel, "channel");
        List<Member> members = channel.getMembers();
        int size = members.size();
        ChannelAvatarRenderer channelAvatarRenderer = this.avatarRenderer;
        if (channelAvatarRenderer != null) {
            if (channelAvatarRenderer != null) {
                AvatarStyle avatarStyle = this.avatarStyle;
                if (avatarStyle != null) {
                    channelAvatarRenderer.render(avatarStyle, channel, currentUser, this.avatarViewProvider);
                    return;
                } else {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
            }
            return;
        }
        if (channel.getImage().length() > 0) {
            showChannelAvatar(channel);
            return;
        }
        if (size == 1) {
            showUserAvatar(((Member) AbstractC25265s.m74096F0(channel.getMembers())).getUser());
            return;
        }
        if (size == 2) {
            List<Member> list = members;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((Member) it.next()).getUser().getId(), currentUser != null ? currentUser.getId() : null)) {
                        for (Member member : list) {
                            if (!AbstractC22676k.m65745e(member.getUser().getId(), currentUser != null ? currentUser.getId() : null)) {
                                showUserAvatar(member.getUser());
                                return;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : members) {
            if (!AbstractC22676k.m65745e(((Member) obj).getUser().getId(), currentUser != null ? currentUser.getId() : null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((Member) it3.next()).getUser());
        }
        showGroupAvatar(arrayList2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [io.getstream.chat.android.ui.widgets.avatar.ChannelAvatarView$avatarViewProvider$1] */
    public ChannelAvatarView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.borderPaint = paint;
        this.avatarViewProvider = new ChannelAvatarViewProvider() { // from class: io.getstream.chat.android.ui.widgets.avatar.ChannelAvatarView$avatarViewProvider$1
            @Override // io.getstream.chat.android.p226ui.widgets.avatar.ChannelAvatarViewProvider
            public final AvatarImageView regular() {
                return (AvatarImageView) AbstractC25265s.m74096F0(this.this$0.createImageViews(1));
            }

            @Override // io.getstream.chat.android.p226ui.widgets.avatar.ChannelAvatarViewProvider
            public final UserAvatarView singleUser() {
                return this.this$0.createUserView();
            }

            @Override // io.getstream.chat.android.p226ui.widgets.avatar.ChannelAvatarViewProvider
            public final List<AvatarImageView> userGroup(int userCount) {
                return this.this$0.createImageViews(userCount);
            }
        };
        init(context, attributeSet);
    }
}
