.class public final Lpp0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpp0/d;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lbh/e;",
        "imageLoader",
        "<init>",
        "(Landroid/content/Context;Lbh/e;)V",
        "",
        "iconUrl",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;)V",
        "Landroid/content/Context;",
        "b",
        "Lbh/e;",
        "add-activity_release"
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
.field private final a:Landroid/content/Context;

.field private final b:Lbh/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lbh/e;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp0/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lpp0/d;->b:Lbh/e;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    const-string v0, "iconUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmh/h;

    iget-object v1, p0, Lpp0/d;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lmh/h;-><init>(Landroid/content/Context;)V

    iput-object p1, v0, Lmh/h;->c:Ljava/lang/Object;

    sget-object p1, Lmh/b;->y:Lmh/b;

    iput-object p1, v0, Lmh/h;->p:Lmh/b;

    invoke-virtual {v0}, Lmh/h;->a()Lmh/j;

    move-result-object p1

    iget-object v0, p0, Lpp0/d;->b:Lbh/e;

    check-cast v0, Lbh/j;

    iget-object v1, v0, Lbh/j;->f:Lhc3/d;

    new-instance v2, Le;

    const/16 v3, 0x16

    const/4 v4, 0x0

    invoke-direct {v2, v0, p1, v4, v3}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v2, p1}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    return-void
.end method
