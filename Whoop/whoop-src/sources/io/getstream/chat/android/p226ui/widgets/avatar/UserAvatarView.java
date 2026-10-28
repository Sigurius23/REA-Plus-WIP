package io.getstream.chat.android.p226ui.widgets.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.images.resizing.StringExtensionsKt;
import io.getstream.chat.android.p226ui.common.utils.extensions.UserKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.widgets.avatar.internal.AvatarPlaceholderDrawable;
import kr.C22782a;
import kr.C22786e;
import kr.C22789h;
import kr.C22790i;
import kr.C22792k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b$\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;", "avatarStyle", "(Landroid/content/Context;Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;)V", "Ll83/a0;", "init", "setAvatarStyle", "(Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;)V", "Landroid/graphics/Canvas;", "canvas", "drawIndicator", "(Landroid/graphics/Canvas;)V", "drawBorder", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "", "online", "setUser", "(Lio/getstream/chat/android/models/User;Z)V", "setOnline", "(Z)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDraw", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;", "Landroid/graphics/Paint;", "onlineIndicatorOutlinePaint", "Landroid/graphics/Paint;", "onlineIndicatorPaint", "borderPaint", "Z", "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;", "avatarRenderer", "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserAvatarView extends AvatarImageView {
    private static final int AVATAR_SIZE_EXTRA = 1;
    private static final Companion Companion = new Companion();
    private UserAvatarRenderer avatarRenderer;
    private AvatarStyle avatarStyle;
    private final Paint borderPaint;
    private boolean online;
    private final Paint onlineIndicatorOutlinePaint;
    private final Paint onlineIndicatorPaint;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView$Companion;", "", "<init>", "()V", "AVATAR_SIZE_EXTRA", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[OnlineIndicatorPosition.values().length];
            try {
                iArr2[OnlineIndicatorPosition.TOP_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OnlineIndicatorPosition.BOTTOM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnlineIndicatorPosition.TOP_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OnlineIndicatorPosition.BOTTOM_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserAvatarView(Context context) {
        this(context, (AttributeSet) null);
        AbstractC22676k.m65750j(context, "context");
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

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    private final void drawIndicator(Canvas canvas) {
        float f13;
        float f14;
        if (this.online) {
            AvatarStyle avatarStyle = this.avatarStyle;
            if (avatarStyle == null) {
                AbstractC22676k.m65757q("avatarStyle");
                throw null;
            }
            if (avatarStyle.getOnlineIndicatorEnabled()) {
                Context context = getContext();
                AbstractC22676k.m65749i(context, "getContext(...)");
                boolean zIsRtlLayout = ContextKt.isRtlLayout(context);
                int width = getWidth();
                int height = getHeight();
                AvatarStyle avatarStyle2 = this.avatarStyle;
                if (avatarStyle2 == null) {
                    AbstractC22676k.m65757q("avatarStyle");
                    throw null;
                }
                OnlineIndicatorPosition onlineIndicatorPosition = avatarStyle2.getOnlineIndicatorPosition();
                int[] iArr = WhenMappings.$EnumSwitchMapping$1;
                int i13 = iArr[onlineIndicatorPosition.ordinal()];
                if (i13 == 1 || i13 == 2) {
                    if (zIsRtlLayout) {
                        float f15 = width;
                        f13 = f15 - (f15 / 8.0f);
                    } else {
                        f13 = width / 8.0f;
                    }
                } else {
                    if (i13 != 3 && i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (zIsRtlLayout) {
                        f13 = width / 8.0f;
                    } else {
                        float f16 = width;
                        f13 = f16 - (f16 / 8.0f);
                    }
                }
                int i14 = iArr[onlineIndicatorPosition.ordinal()];
                if (i14 == 1) {
                    f14 = height / 8.0f;
                } else {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            f14 = height / 8.0f;
                        } else if (i14 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    float f17 = height;
                    f14 = f17 - (f17 / 8.0f);
                }
                float f18 = width;
                canvas.drawCircle(f13, f14, f18 / 8.0f, this.onlineIndicatorOutlinePaint);
                canvas.drawCircle(f13, f14, f18 / 10.0f, this.onlineIndicatorPaint);
            }
        }
    }

    private final void init(Context context, AttributeSet attrs) {
        setAvatarStyle(AvatarStyle.INSTANCE.invoke(context, attrs));
        this.avatarRenderer = ChatUI.getUserAvatarRenderer();
    }

    private final void setAvatarStyle(AvatarStyle avatarStyle) {
        C22792k c22792k;
        this.avatarStyle = avatarStyle;
        int avatarBorderWidth = avatarStyle.getAvatarBorderWidth() - 1;
        if (avatarBorderWidth < 0) {
            avatarBorderWidth = 0;
        }
        setPadding(avatarBorderWidth, avatarBorderWidth, avatarBorderWidth, avatarBorderWidth);
        this.onlineIndicatorOutlinePaint.setColor(avatarStyle.getOnlineIndicatorBorderColor());
        this.onlineIndicatorPaint.setColor(avatarStyle.getOnlineIndicatorColor());
        this.borderPaint.setColor(avatarStyle.getAvatarBorderColor());
        this.borderPaint.setStrokeWidth(avatarStyle.getAvatarBorderWidth());
        int i13 = WhenMappings.$EnumSwitchMapping$0[avatarStyle.getAvatarShape().ordinal()];
        if (i13 == 1) {
            C22790i c22790i = new C22790i();
            C22790i c22790i2 = new C22790i();
            C22790i c22790i3 = new C22790i();
            C22790i c22790i4 = new C22790i();
            C22786e c22786e = new C22786e(0);
            C22786e c22786e2 = new C22786e(0);
            C22786e c22786e3 = new C22786e(0);
            C22786e c22786e4 = new C22786e(0);
            C22789h c22789h = new C22789h(0.5f);
            C22792k c22792k2 = new C22792k();
            c22792k2.f89766a = c22790i;
            c22792k2.f89767b = c22790i2;
            c22792k2.f89768c = c22790i3;
            c22792k2.f89769d = c22790i4;
            c22792k2.f89770e = c22789h;
            c22792k2.f89771f = c22789h;
            c22792k2.f89772g = c22789h;
            c22792k2.f89773h = c22789h;
            c22792k2.f89774i = c22786e;
            c22792k2.f89775j = c22786e2;
            c22792k2.f89776k = c22786e3;
            c22792k2.f89777l = c22786e4;
            c22792k = c22792k2;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C22790i c22790i5 = new C22790i();
            C22790i c22790i6 = new C22790i();
            C22790i c22790i7 = new C22790i();
            C22790i c22790i8 = new C22790i();
            C22786e c22786e5 = new C22786e(0);
            C22786e c22786e6 = new C22786e(0);
            C22786e c22786e7 = new C22786e(0);
            C22786e c22786e8 = new C22786e(0);
            C22782a c22782a = new C22782a(avatarStyle.getBorderRadius());
            c22792k = new C22792k();
            c22792k.f89766a = c22790i5;
            c22792k.f89767b = c22790i6;
            c22792k.f89768c = c22790i7;
            c22792k.f89769d = c22790i8;
            c22792k.f89770e = c22782a;
            c22792k.f89771f = c22782a;
            c22792k.f89772g = c22782a;
            c22792k.f89773h = c22782a;
            c22792k.f89774i = c22786e5;
            c22792k.f89775j = c22786e6;
            c22792k.f89776k = c22786e7;
            c22792k.f89777l = c22786e8;
        }
        setShapeAppearanceModel(c22792k);
    }

    public static /* synthetic */ void setUser$default(UserAvatarView userAvatarView, User user, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = user.getOnline();
        }
        userAvatarView.setUser(user, z4);
    }

    @Override // com.google.android.material.imageview.ShapeableImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        drawBorder(canvas);
        drawIndicator(canvas);
    }

    @Override // com.google.android.material.imageview.ShapeableImageView, android.widget.ImageView, android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iResolveSize = View.resolveSize(0, widthMeasureSpec);
        int iResolveSize2 = View.resolveSize(0, heightMeasureSpec);
        if (iResolveSize > iResolveSize2) {
            iResolveSize = iResolveSize2;
        }
        setMeasuredDimension(iResolveSize, iResolveSize);
    }

    public final void setOnline(boolean online) {
        this.online = online;
        invalidate();
    }

    public final void setUser(User user) {
        AbstractC22676k.m65750j(user, "user");
        setUser$default(this, user, false, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    public final void setUser(User user, boolean online) {
        AbstractC22676k.m65750j(user, "user");
        UserAvatarRenderer userAvatarRenderer = this.avatarRenderer;
        if (userAvatarRenderer != null) {
            AvatarStyle avatarStyle = this.avatarStyle;
            if (avatarStyle == null) {
                AbstractC22676k.m65757q("avatarStyle");
                throw null;
            }
            userAvatarRenderer.render(avatarStyle, user, this);
        } else {
            String strApplyStreamCdnImageResizingIfEnabled = StringExtensionsKt.applyStreamCdnImageResizingIfEnabled(user.getImage(), ChatUI.getStreamCdnImageResizing());
            Context context = getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            String initials = UserKt.getInitials(user);
            AvatarStyle avatarStyle2 = this.avatarStyle;
            if (avatarStyle2 == null) {
                AbstractC22676k.m65757q("avatarStyle");
                throw null;
            }
            setAvatar(strApplyStreamCdnImageResizingIfEnabled, new AvatarPlaceholderDrawable(context, initials, avatarStyle2.getAvatarInitialsTextStyle()));
        }
        setOnline(online);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAvatarView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.onlineIndicatorOutlinePaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        this.onlineIndicatorPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.borderPaint = paint3;
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAvatarView(Context context, AvatarStyle avatarStyle) {
        super(ContextKt.createStreamThemeWrapper(context), null, 0);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(avatarStyle, "avatarStyle");
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.onlineIndicatorOutlinePaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        this.onlineIndicatorPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.borderPaint = paint3;
        setAvatarStyle(avatarStyle);
    }
}
