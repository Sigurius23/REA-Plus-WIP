.class public final Lis0/m0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/k2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/m0;->b(Lh0/a;)Lis0/m0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "is0/m0$a",
        "Lh0/k2;",
        "",
        "pixels",
        "a",
        "(F)F",
        "community-reactions-arch-mini_release"
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
.field final synthetic a:Lis0/m0;

.field final synthetic b:Lh0/a;


# direct methods
.method public constructor <init>(Lis0/m0;Lh0/a;)V
    .locals 0

    iput-object p1, p0, Lis0/m0$a;->a:Lis0/m0;

    iput-object p2, p0, Lis0/m0$a;->b:Lh0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 2

    iget-object v0, p0, Lis0/m0$a;->a:Lis0/m0;

    invoke-virtual {v0}, Lis0/m0;->h()Lh0/p;

    move-result-object v0

    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object v0

    iget-object v1, p0, Lis0/m0$a;->a:Lis0/m0;

    invoke-virtual {v1}, Lis0/m0;->h()Lh0/p;

    move-result-object v1

    iget-object v1, v1, Lh0/p;->f:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    add-float/2addr v1, p1

    check-cast v0, Lh0/x;

    invoke-virtual {v0}, Lh0/x;->d()F

    move-result p1

    invoke-virtual {v0}, Lh0/x;->c()F

    move-result v0

    invoke-static {v1, p1, v0}, Le93/b;->m(FFF)F

    move-result p1

    iget-object v0, p0, Lis0/m0$a;->a:Lis0/m0;

    invoke-virtual {v0}, Lis0/m0;->h()Lh0/p;

    move-result-object v0

    iget-object v0, v0, Lh0/p;->f:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    sub-float v0, p1, v0

    iget-object v1, p0, Lis0/m0$a;->b:Lh0/a;

    invoke-static {v1, p1}, Lh0/a;->a(Lh0/a;F)V

    return v0
.end method
