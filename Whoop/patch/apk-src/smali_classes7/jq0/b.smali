.class public final Ljq0/b;
.super Ljq0/c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljq0/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljq0/c$a<",
        "Liq0/r;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 \u001f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ9\u0010\u0012\u001a\u001e\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u00110\u00110\u000e\"\u0004\u0008\u0000\u0010\u000c2\u0006\u0010\r\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001dR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\u0019\u00a8\u0006#"
    }
    d2 = {
        "Ljq0/b;",
        "Ljq0/c$a;",
        "Liq0/r;",
        "Leq0/g3;",
        "binding",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onAttachmentCancelled",
        "",
        "attachmentMaxFileSize",
        "<init>",
        "(Leq0/g3;Lkotlin/jvm/functions/Function1;J)V",
        "T",
        "attachment",
        "Lql/k;",
        "Landroid/widget/ImageView;",
        "kotlin.jvm.PlatformType",
        "Landroid/graphics/drawable/Drawable;",
        "e",
        "(Ljava/lang/Object;)Lql/k;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "d",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V",
        "item",
        "c",
        "(Liq0/r;)V",
        "b",
        "Leq0/g3;",
        "Lkotlin/jvm/functions/Function1;",
        "J",
        "Liq0/r;",
        "f",
        "()Liq0/r;",
        "g",
        "a",
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


# static fields
.field public static final f:Ljq0/b$a;

.field public static final g:I


# instance fields
.field private final b:Leq0/g3;

.field private final c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final d:J

.field public e:Liq0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljq0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljq0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljq0/b;->f:Ljq0/b$a;

    const/16 v0, 0x8

    sput v0, Ljq0/b;->g:I

    return-void
.end method

.method public constructor <init>(Leq0/g3;Lkotlin/jvm/functions/Function1;J)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leq0/g3;",
            "Lkotlin/jvm/functions/Function1;",
            "J)V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAttachmentCancelled"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ljq0/c$a;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ljq0/b;->b:Leq0/g3;

    iput-object p2, p0, Ljq0/b;->c:Lkotlin/jvm/functions/Function1;

    iput-wide p3, p0, Ljq0/b;->d:J

    iget-object p2, p1, Leq0/g3;->b:Landroid/widget/ImageView;

    new-instance p3, Ljo/j;

    const/4 p4, 0x4

    invoke-direct {p3, p0, p4}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_spacing_tiny:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    int-to-float p2, p2

    iget-object p1, p1, Leq0/g3;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    new-instance p3, Lkr/i;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    new-instance p4, Lkr/i;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkr/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lkr/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkr/e;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lkr/e;-><init>(I)V

    new-instance v3, Lkr/e;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lkr/e;-><init>(I)V

    new-instance v4, Lkr/e;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lkr/e;-><init>(I)V

    new-instance v5, Lkr/e;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lkr/e;-><init>(I)V

    new-instance v6, Lkr/a;

    invoke-direct {v6, p2}, Lkr/a;-><init>(F)V

    new-instance v7, Lkr/a;

    invoke-direct {v7, p2}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/a;

    invoke-direct {v8, p2}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, p2}, Lkr/a;-><init>(F)V

    new-instance p2, Lkr/k;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p3, p2, Lkr/k;->a:Lse/a;

    iput-object p4, p2, Lkr/k;->b:Lse/a;

    iput-object v0, p2, Lkr/k;->c:Lse/a;

    iput-object v1, p2, Lkr/k;->d:Lse/a;

    iput-object v6, p2, Lkr/k;->e:Lkr/c;

    iput-object v7, p2, Lkr/k;->f:Lkr/c;

    iput-object v8, p2, Lkr/k;->g:Lkr/c;

    iput-object v9, p2, Lkr/k;->h:Lkr/c;

    iput-object v2, p2, Lkr/k;->i:Lkr/e;

    iput-object v3, p2, Lkr/k;->j:Lkr/e;

    iput-object v4, p2, Lkr/k;->k:Lkr/e;

    iput-object v5, p2, Lkr/k;->l:Lkr/e;

    invoke-virtual {p1, p2}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    return-void
.end method

.method public static synthetic a(Ljq0/b;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Ljq0/b;->b(Ljq0/b;Landroid/view/View;)V

    return-void
.end method

.method private static final b(Ljq0/b;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Ljq0/b;->c:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Ljq0/b;->f()Liq0/r;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final d(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 4

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getSize()J

    move-result-wide v0

    iget-wide v2, p0, Ljq0/b;->d:J

    cmp-long p1, v0, v2

    const-string v0, "attachmentErrorMessage"

    if-lez p1, :cond_0

    iget-object p1, p0, Ljq0/b;->b:Leq0/g3;

    iget-object p1, p1, Leq0/g3;->a:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Ljq0/b;->b:Leq0/g3;

    iget-object p1, p1, Leq0/g3;->a:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lxp0/d0;->M:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-object p1, p0, Ljq0/b;->b:Leq0/g3;

    iget-object p1, p1, Leq0/g3;->a:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final e(Ljava/lang/Object;)Lql/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lql/k;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->i(Ljava/lang/Class;)Lcom/bumptech/glide/f;

    move-result-object v0

    iput-object p1, v0, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/bumptech/glide/f;->a0:Z

    sget-object p1, Lzk/k;->e:Lzk/k;

    invoke-virtual {v0, p1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/f;

    sget v0, Lvu1/c;->n:I

    invoke-virtual {p1, v0}, Lpl/a;->j(I)Lpl/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/f;

    iget-object v0, p0, Ljq0/b;->b:Leq0/g3;

    iget-object v0, v0, Leq0/g3;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Liq0/r;

    invoke-virtual {p0, p1}, Ljq0/b;->c(Liq0/r;)V

    return-void
.end method

.method public c(Liq0/r;)V
    .locals 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljq0/b;->g(Liq0/r;)V

    invoke-virtual {p1}, Liq0/r;->b()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "video"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-direct {p0, v1}, Ljq0/b;->e(Ljava/lang/Object;)Lql/k;

    :cond_0
    invoke-direct {p0, v0}, Ljq0/b;->d(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    :cond_1
    invoke-virtual {p1}, Liq0/r;->a()Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Ljq0/b;->e(Ljava/lang/Object;)Lql/k;

    :cond_2
    return-void
.end method

.method public final f()Liq0/r;
    .locals 1

    iget-object v0, p0, Ljq0/b;->e:Liq0/r;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "item"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final g(Liq0/r;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljq0/b;->e:Liq0/r;

    return-void
.end method
