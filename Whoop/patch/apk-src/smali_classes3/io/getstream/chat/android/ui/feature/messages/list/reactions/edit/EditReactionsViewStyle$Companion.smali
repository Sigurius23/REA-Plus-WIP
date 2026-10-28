.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0080\u0002\u00a2\u0006\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "invoke$stream_chat_android_ui_components_release",
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
.method public final invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->EditReactionsView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    invoke-direct {v0, p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;-><init>(Landroid/content/res/TypedArray;Landroid/content/Context;)V

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->EditReactionsView_streamUiReactionsBubbleColorMine:I

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorMine(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    sget p1, Lio/getstream/chat/android/ui/R$styleable;->EditReactionsView_streamUiReactionsBubbleColorTheirs:I

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->bubbleColorTheirs(I)Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle$Builder;->build()Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;

    move-result-object p1

    return-object p1
.end method
