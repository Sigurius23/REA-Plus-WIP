.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u000c\u0010\u000e\u001a\u00020\u0005*\u00020\u000fH\u0002\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;",
        "<init>",
        "()V",
        "canHandle",
        "",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "createViewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;",
        "listeners",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "parent",
        "Landroid/view/ViewGroup;",
        "isSupported",
        "Lio/getstream/chat/android/models/Attachment;",
        "Companion",
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


# static fields
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory$Companion;

.field private static final SUPPORTED_ATTACHMENT_TYPES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory$Companion;

    const-string v5, "file"

    const-string v6, "voiceRecording"

    const-string v1, "image"

    const-string v2, "giphy"

    const-string v3, "video"

    const-string v4, "audio"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory;->SUPPORTED_ATTACHMENT_TYPES:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final isSupported(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory;->SUPPORTED_ATTACHMENT_TYPES:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final canHandle(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->hasLink(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory;->isSupported(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final createViewHolder(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;
    .locals 9

    const-string p2, "message"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "parent"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getStreamThemeInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, p3, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentViewBinding;

    move-result-object p1

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle$Companion;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {v1, p3, p2}, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;

    move-result-object p2

    new-instance p3, Lkr/e;

    const/4 v1, 0x0

    invoke-direct {p3, v1}, Lkr/e;-><init>(I)V

    new-instance v1, Lkr/e;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lkr/e;-><init>(I)V

    new-instance v2, Lkr/e;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lkr/e;-><init>(I)V

    new-instance v3, Lkr/e;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lkr/e;-><init>(I)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;->getCornerRadius()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v0}, Lse/b;->z(I)Lse/a;

    move-result-object v0

    new-instance v5, Lkr/a;

    invoke-direct {v5, v4}, Lkr/a;-><init>(F)V

    new-instance v6, Lkr/a;

    invoke-direct {v6, v4}, Lkr/a;-><init>(F)V

    new-instance v7, Lkr/a;

    invoke-direct {v7, v4}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/a;

    invoke-direct {v8, v4}, Lkr/a;-><init>(F)V

    new-instance v4, Lkr/k;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v0, v4, Lkr/k;->a:Lse/a;

    iput-object v0, v4, Lkr/k;->b:Lse/a;

    iput-object v0, v4, Lkr/k;->c:Lse/a;

    iput-object v0, v4, Lkr/k;->d:Lse/a;

    iput-object v5, v4, Lkr/k;->e:Lkr/c;

    iput-object v6, v4, Lkr/k;->f:Lkr/c;

    iput-object v7, v4, Lkr/k;->g:Lkr/c;

    iput-object v8, v4, Lkr/k;->h:Lkr/c;

    iput-object p3, v4, Lkr/k;->i:Lkr/e;

    iput-object v1, v4, Lkr/k;->j:Lkr/e;

    iput-object v2, v4, Lkr/k;->k:Lkr/e;

    iput-object v3, v4, Lkr/k;->l:Lkr/e;

    iget-object p3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentViewBinding;->attachmentContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v0, Lkr/g;

    invoke-direct {v0, v4}, Lkr/g;-><init>(Lkr/k;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;->getBackgroundColor()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkr/g;->m(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;->getStrokeColor()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkr/g;->q(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;->getStrokeWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lkr/g;->s(F)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p3, p1, Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentViewBinding;->titleImageView:Landroid/widget/TextView;

    const-string v0, "titleImageView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;->getTitleTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    invoke-static {p3, p2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory$createViewHolder$2;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/UnsupportedAttachmentFactory$createViewHolder$2;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-object p2
.end method
