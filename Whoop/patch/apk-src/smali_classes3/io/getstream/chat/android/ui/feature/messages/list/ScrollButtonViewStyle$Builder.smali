.class public final Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\tJ\u001a\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u000cJ\u001a\u0010\r\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u000cJ\u0010\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u000cJ\u001a\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u001f\u001a\u00020\u000c2\u0008\u0010 \u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u000c2\u0006\u0010!\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020\u000cJ\u001a\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u000c2\u0008\u0010 \u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u000c2\u0006\u0010!\u001a\u00020\u0013J\u0018\u0010#\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u000cJ\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u000c8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000c8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;",
        "",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/content/res/TypedArray;",
        "<init>",
        "(Landroid/content/Context;Landroid/content/res/TypedArray;)V",
        "scrollButtonEnabled",
        "",
        "scrollButtonUnreadEnabled",
        "scrollButtonColor",
        "",
        "scrollButtonRippleColor",
        "scrollButtonBadgeColor",
        "Ljava/lang/Integer;",
        "scrollButtonIcon",
        "Landroid/graphics/drawable/Drawable;",
        "scrollButtonElevation",
        "",
        "scrollButtonBadgeGravity",
        "scrollButtonBadgeIcon",
        "scrollButtonBadgeElevation",
        "scrollButtonInternalMargin",
        "scrollButtonEnabledStyleableId",
        "defaultValue",
        "scrollButtonUnreadEnabledStyleableId",
        "scrollButtonColorStyleableId",
        "scrollButtonRippleColorStyleableId",
        "defaultColor",
        "scrollButtonBadgeColorStyleableId",
        "scrollButtonIconStyleableId",
        "defaultIcon",
        "defaultElevation",
        "defaultGravity",
        "scrollButtonBadgeInternalMargin",
        "defaultMargin",
        "build",
        "Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final attrs:Landroid/content/res/TypedArray;

.field private final context:Landroid/content/Context;

.field private scrollButtonBadgeColor:Ljava/lang/Integer;

.field private scrollButtonBadgeElevation:F

.field private scrollButtonBadgeGravity:I

.field private scrollButtonBadgeIcon:Landroid/graphics/drawable/Drawable;

.field private scrollButtonColor:I

.field private scrollButtonElevation:F

.field private scrollButtonEnabled:Z

.field private scrollButtonIcon:Landroid/graphics/drawable/Drawable;

.field private scrollButtonInternalMargin:I

.field private scrollButtonRippleColor:I

.field private scrollButtonUnreadEnabled:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonBadgeColor:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiScrollButtonBadgeTextSize:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->context:Landroid/content/Context;

    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_scroll_button_unread_badge_text_size:I

    invoke-static {v3, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiScrollButtonBadgeTextColor:I

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->context:Landroid/content/Context;

    sget v4, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_white:I

    invoke-static {v3, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiScrollButtonBadgeFontAssets:I

    sget v3, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiScrollButtonBadgeTextFont:I

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiScrollButtonBadgeTextStyle:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v12

    iget-boolean v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonEnabled:Z

    iget-boolean v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonUnreadEnabled:Z

    iget v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonColor:I

    iget v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonRippleColor:I

    iget-object v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonBadgeColor:Ljava/lang/Integer;

    iget-object v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonIcon:Landroid/graphics/drawable/Drawable;

    iget v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonElevation:F

    iget-object v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonBadgeIcon:Landroid/graphics/drawable/Drawable;

    iget v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonBadgeGravity:I

    iget v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonBadgeElevation:F

    iget v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonInternalMargin:I

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    move/from16 v16, v1

    invoke-direct/range {v4 .. v16}, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;-><init>(ZZIILjava/lang/Integer;FLandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IFI)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getScrollButtonStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v1

    invoke-interface {v1, v4}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;

    return-object v1
.end method

.method public final scrollButtonBadgeColor(I)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;->getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonBadgeColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public final scrollButtonBadgeElevation(IF)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonBadgeElevation:F

    return-object p0
.end method

.method public final scrollButtonBadgeGravity(II)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonBadgeGravity:I

    return-object p0
.end method

.method public final scrollButtonBadgeIcon(ILandroid/graphics/drawable/Drawable;)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonBadgeIcon:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final scrollButtonBadgeInternalMargin(II)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonInternalMargin:I

    return-object p0
.end method

.method public final scrollButtonColor(II)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonColor:I

    return-object p0
.end method

.method public final scrollButtonElevation(IF)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonElevation:F

    return-object p0
.end method

.method public final scrollButtonEnabled(IZ)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonEnabled:Z

    return-object p0
.end method

.method public final scrollButtonIcon(ILandroid/graphics/drawable/Drawable;)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonIcon:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final scrollButtonRippleColor(II)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonRippleColor:I

    return-object p0
.end method

.method public final scrollButtonUnreadEnabled(IZ)Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle$Builder;->scrollButtonUnreadEnabled:Z

    return-object p0
.end method
