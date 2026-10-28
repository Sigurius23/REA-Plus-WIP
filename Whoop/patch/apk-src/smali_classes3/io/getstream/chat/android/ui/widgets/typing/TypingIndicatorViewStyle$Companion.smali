.class public final Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0086\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->TypingIndicatorView:[I

    sget v1, Lio/getstream/chat/android/ui/R$attr;->streamUiTypingIndicatorView:I

    sget v2, Lio/getstream/chat/android/ui/R$style;->StreamUi_TypingIndicatorView:I

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$styleable;->TypingIndicatorView_streamUiTypingIndicatorAnimationView:I

    sget v1, Lio/getstream/chat/android/ui/R$layout;->stream_ui_typing_indicator_animation_view:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    new-instance v1, Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-direct {v1, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;-><init>(Landroid/content/res/TypedArray;)V

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->TypingIndicatorView_streamUiTypingIndicatorUsersTextSize:I

    sget v2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_text_small:I

    invoke-static {p1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, p2, v2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->size(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->TypingIndicatorView_streamUiTypingIndicatorUsersTextColor:I

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_text_color_secondary:I

    invoke-static {p1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v1, p2, p1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->color(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->TypingIndicatorView_streamUiTypingIndicatorUsersTextFontAssets:I

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->TypingIndicatorView_streamUiTypingIndicatorUsersTextFont:I

    invoke-virtual {v1, p1, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->font(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->TypingIndicatorView_streamUiTypingIndicatorUsersTextStyle:I

    const/4 p2, 0x0

    invoke-virtual {v1, p1, p2}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->style(II)Lio/getstream/chat/android/ui/font/TextStyle$Builder;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle$Builder;->build()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    invoke-direct {p2, v0, p1}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;-><init>(ILio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getTypingIndicatorViewStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object p1

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    return-object p1
.end method
