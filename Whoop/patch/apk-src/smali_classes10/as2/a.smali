.class public final Las2/a;
.super Las2/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Las2/a;",
        "Las2/b;",
        "Lbh3/b;",
        "Landroid/view/View;",
        "onSafeClick",
        "<init>",
        "(Lbh3/b;)V",
        "y",
        "Lbh3/b;",
        "feature_release"
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
.field private final y:Lbh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbh3/b;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbh3/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/b;",
            ")V"
        }
    .end annotation

    const-string v0, "onSafeClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/b;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, v0}, Las2/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Las2/a;->y:Lbh3/b;

    return-void
.end method

.method public static synthetic a(Lbh3/b;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Las2/a;->b(Lbh3/b;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lbh3/b;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lbh3/b;->b(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
