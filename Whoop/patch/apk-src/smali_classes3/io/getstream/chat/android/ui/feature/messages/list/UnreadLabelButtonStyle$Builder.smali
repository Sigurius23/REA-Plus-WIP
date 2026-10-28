.class public final Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0001\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tJ\u001a\u0010\n\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000bJ\u001a\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000c\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;",
        "",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/content/res/TypedArray;",
        "<init>",
        "(Landroid/content/Context;Landroid/content/res/TypedArray;)V",
        "unreadLabelButtonEnabled",
        "",
        "unreadLabelButtonColor",
        "",
        "unreadLabelButtonRippleColor",
        "unreadLabelButtonEnabledStyleableId",
        "defaultValue",
        "unreadLabelButtonColorStyleableId",
        "unreadLabelButtonRippleColorStyleableId",
        "defaultColor",
        "build",
        "Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;",
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

.field private unreadLabelButtonColor:I

.field private unreadLabelButtonEnabled:Z

.field private unreadLabelButtonRippleColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->unreadLabelButtonEnabled:Z

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;
    .locals 5

    new-instance v0, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadLabelButtonTextSize:I

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->context:Landroid/content/Context;

    sget v3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_scroll_button_unread_badge_text_size:I

    invoke-static {v2, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadLabelButtonTextColor:I

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->context:Landroid/content/Context;

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_white:I

    invoke-static {v2, v3}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadLabelButtonFontAssets:I

    sget v2, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadLabelButtonTextFont:I

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget v1, Lio/getstream/chat/android/ui/R$styleable;->MessageListView_streamUiUnreadLabelButtonTextStyle:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->unreadLabelButtonEnabled:Z

    iget v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->unreadLabelButtonColor:I

    iget v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->unreadLabelButtonRippleColor:I

    invoke-direct {v1, v2, v3, v4, v0}, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;-><init>(ZIILio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getUnreadLabelButtonStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object v0

    invoke-interface {v0, v1}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;

    return-object v0
.end method

.method public final unreadLabelButtonColor(II)Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->unreadLabelButtonColor:I

    return-object p0
.end method

.method public final unreadLabelButtonEnabled(IZ)Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->unreadLabelButtonEnabled:Z

    return-object p0
.end method

.method public final unreadLabelButtonRippleColor(II)Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->attrs:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;->unreadLabelButtonRippleColor:I

    return-object p0
.end method
