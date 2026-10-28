.class public final Lcp0/a1$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/g1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/a1$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "cp0/a1$a$a",
        "Lh0/g1;",
        "",
        "pixels",
        "Ll83/a0;",
        "a",
        "(F)V",
        "coach-everywhere_release"
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
.field final synthetic a:Lcp0/a1;

.field final synthetic b:Lh0/a;

.field final synthetic c:Lh0/h1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/h1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcp0/a1;Lh0/a;Lh0/h1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp0/a1;",
            "Lh0/a;",
            "Lh0/h1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcp0/a1$a$a;->a:Lcp0/a1;

    iput-object p2, p0, Lcp0/a1$a$a;->b:Lh0/a;

    iput-object p3, p0, Lcp0/a1$a$a;->c:Lh0/h1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 3

    iget-object v0, p0, Lcp0/a1$a$a;->a:Lcp0/a1;

    invoke-static {v0}, Lcp0/a1;->b(Lcp0/a1;)Lh0/p;

    move-result-object v0

    iget-object v0, v0, Lh0/p;->f:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0, p1}, Lcp0/s;->h(FF)F

    move-result p1

    add-float/2addr p1, v0

    iget-object v0, p0, Lcp0/a1$a$a;->b:Lh0/a;

    iget-object v1, p0, Lcp0/a1$a$a;->c:Lh0/h1;

    check-cast v1, Lh0/x;

    invoke-virtual {v1}, Lh0/x;->d()F

    move-result v1

    iget-object v2, p0, Lcp0/a1$a$a;->c:Lh0/h1;

    check-cast v2, Lh0/x;

    invoke-virtual {v2}, Lh0/x;->c()F

    move-result v2

    invoke-static {p1, v1, v2}, Le93/b;->m(FFF)F

    move-result p1

    invoke-static {v0, p1}, Lh0/a;->a(Lh0/a;F)V

    return-void
.end method
