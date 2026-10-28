.class public final Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;",
        "context",
        "Landroid/content/Context;",
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
.method public final invoke(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$dimen;->streamUiQuotedFileAttachmentViewHeight:I

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v2

    sget v0, Lio/getstream/chat/android/ui/R$dimen;->streamUiQuotedFileAttachmentViewWidth:I

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    sget v0, Lio/getstream/chat/android/ui/R$dimen;->streamUiQuotedImageAttachmentViewHeight:I

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v4

    sget v0, Lio/getstream/chat/android/ui/R$dimen;->streamUiQuotedImageAttachmentViewWidth:I

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v5

    sget v0, Lio/getstream/chat/android/ui/R$dimen;->streamUiQuotedImageAttachmentImageRadius:I

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v6

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;-><init>(IIIII)V

    invoke-static {}, Lio/getstream/chat/android/ui/helper/TransformStyle;->getDefaultQuotedAttachmentViewStyleTransformer()Lio/getstream/chat/android/ui/helper/StyleTransformer;

    move-result-object p1

    invoke-interface {p1, v1}, Lio/getstream/chat/android/ui/helper/StyleTransformer;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    return-object p1
.end method
