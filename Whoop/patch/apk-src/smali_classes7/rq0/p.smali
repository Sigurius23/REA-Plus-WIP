.class public interface abstract Lrq0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0002\u0008\u0003\u0012\u0006\u0008\u0000\u0012\u00020\u0007\u0018\u00010\u0006H&\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lrq0/p;",
        "",
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


# direct methods
.method public static synthetic a(Lrq0/p;Landroid/widget/ImageView;Landroid/content/Context;Lcom/bumptech/glide/i;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lrq0/p;->b(Landroid/widget/ImageView;Landroid/content/Context;Lcom/bumptech/glide/i;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: loadIntoImageView"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract b(Landroid/widget/ImageView;Landroid/content/Context;Lcom/bumptech/glide/i;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/i;",
            ")V"
        }
    .end annotation
.end method
