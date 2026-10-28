.class public final Lcom/whoop/community/presentation/chat/view/ChatRichTextLinkView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/community/presentation/chat/view/ChatRichTextLinkView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "Leq0/v;",
        "f",
        "(Lio/getstream/chat/android/models/Attachment;)Leq0/v;",
        "w",
        "Leq0/v;",
        "binding",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Leq0/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/whoop/community/presentation/chat/view/ChatRichTextLinkView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, Leq0/v;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/v;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/community/presentation/chat/view/ChatRichTextLinkView;->w:Leq0/v;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/community/presentation/chat/view/ChatRichTextLinkView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final f(Lio/getstream/chat/android/models/Attachment;)Leq0/v;
    .locals 3

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/community/presentation/chat/view/ChatRichTextLinkView;->w:Leq0/v;

    iget-object v1, v0, Leq0/v;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Leq0/v;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Leq0/v;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Ldq0/c;->a(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lor2/o1;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v2

    invoke-static {p1}, Ldq0/c;->a(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object p1

    sget-object v2, Lzk/k;->e:Lzk/k;

    invoke-virtual {p1, v2}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/f;

    invoke-virtual {p1, v1}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    return-object v0
.end method
