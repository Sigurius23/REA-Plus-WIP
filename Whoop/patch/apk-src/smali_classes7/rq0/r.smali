.class public final Lrq0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrq0/p;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0014\u0010\u000c\u001a\u0010\u0012\u0002\u0008\u0003\u0012\u0006\u0008\u0000\u0012\u00020\u000b\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lrq0/r;",
        "Lrq0/p;",
        "",
        "url",
        "<init>",
        "(Ljava/lang/String;)V",
        "Landroid/widget/ImageView;",
        "imageView",
        "Landroid/content/Context;",
        "context",
        "Lcom/bumptech/glide/i;",
        "Landroid/graphics/drawable/Drawable;",
        "transition",
        "Ll83/a0;",
        "b",
        "(Landroid/widget/ImageView;Landroid/content/Context;Lcom/bumptech/glide/i;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "c",
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
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq0/r;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b(Landroid/widget/ImageView;Landroid/content/Context;Lcom/bumptech/glide/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/i;",
            ")V"
        }
    .end annotation

    const-string v0, "imageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object v0

    invoke-virtual {v0, p2}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p2

    iget-object v0, p0, Lrq0/r;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object p2

    sget-object v0, Lzk/k;->b:Lzk/k;

    invoke-virtual {p2, v0}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object p2

    check-cast p2, Lcom/bumptech/glide/f;

    if-eqz p3, :cond_0

    iput-object p3, p2, Lcom/bumptech/glide/f;->X:Lcom/bumptech/glide/i;

    :cond_0
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrq0/r;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lrq0/r;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lrq0/r;

    iget-object v1, p0, Lrq0/r;->a:Ljava/lang/String;

    iget-object p1, p1, Lrq0/r;->a:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lrq0/r;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lrq0/r;->a:Ljava/lang/String;

    const-string v1, "TeamCreateImageUrl(url="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
