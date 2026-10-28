.class public final Lcp0/s$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/k2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/s$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "cp0/s$d$a",
        "Lh0/k2;",
        "",
        "pixels",
        "a",
        "(F)F",
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
.field final synthetic a:Lh0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/p;"
        }
    .end annotation
.end field

.field final synthetic b:Lh0/h1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/h1;"
        }
    .end annotation
.end field

.field final synthetic c:Lh0/a;


# direct methods
.method public constructor <init>(Lh0/p;Lh0/h1;Lh0/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/p;",
            "Lh0/h1;",
            "Lh0/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcp0/s$d$a;->a:Lh0/p;

    iput-object p2, p0, Lcp0/s$d$a;->b:Lh0/h1;

    iput-object p3, p0, Lcp0/s$d$a;->c:Lh0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 3

    iget-object v0, p0, Lcp0/s$d$a;->a:Lh0/p;

    invoke-virtual {v0}, Lh0/p;->f()F

    move-result v0

    add-float/2addr p1, v0

    iget-object v1, p0, Lcp0/s$d$a;->b:Lh0/h1;

    check-cast v1, Lh0/x;

    invoke-virtual {v1}, Lh0/x;->d()F

    move-result v1

    iget-object v2, p0, Lcp0/s$d$a;->b:Lh0/h1;

    check-cast v2, Lh0/x;

    invoke-virtual {v2}, Lh0/x;->c()F

    move-result v2

    invoke-static {p1, v1, v2}, Le93/b;->m(FFF)F

    move-result p1

    iget-object v1, p0, Lcp0/s$d$a;->c:Lh0/a;

    invoke-static {v1, p1}, Lh0/a;->a(Lh0/a;F)V

    sub-float/2addr p1, v0

    return p1
.end method
