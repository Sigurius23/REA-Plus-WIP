.class public final Lpq0/e$c;
.super Lql/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpq0/e;->W()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lql/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\u000c\u0012\u0006\u0008\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "pq0/e$c",
        "Lql/c;",
        "Landroid/graphics/Bitmap;",
        "resource",
        "Lrl/c;",
        "transition",
        "Ll83/a0;",
        "i",
        "(Landroid/graphics/Bitmap;Lrl/c;)V",
        "Landroid/graphics/drawable/Drawable;",
        "placeholder",
        "e",
        "(Landroid/graphics/drawable/Drawable;)V",
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
.field final synthetic z:Lpq0/e;


# direct methods
.method public constructor <init>(Lpq0/e;)V
    .locals 0

    iput-object p1, p0, Lpq0/e$c;->z:Lpq0/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lql/c;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Lrl/c;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lpq0/e$c;->i(Landroid/graphics/Bitmap;Lrl/c;)V

    return-void
.end method

.method public e(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public i(Landroid/graphics/Bitmap;Lrl/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lrl/c;",
            ")V"
        }
    .end annotation

    const-string p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lpq0/e$c;->z:Lpq0/e;

    invoke-static {p2, p1}, Lpq0/e;->P(Lpq0/e;Landroid/graphics/Bitmap;)V

    return-void
.end method
