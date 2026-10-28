.class public final Lvx0/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lvx0/e;",
        "Landroidx/lifecycle/w1;",
        "Lft0/c;",
        "whoopDeviceManager",
        "<init>",
        "(Lft0/c;)V",
        "Ll83/a0;",
        "o",
        "()V",
        "p",
        "Lmj0/e;",
        "candidate",
        "n",
        "(Lmj0/e;)V",
        "Lmj0/d;",
        "deviceId",
        "q",
        "(Ljava/lang/String;)V",
        "onCleared",
        "w",
        "Lft0/c;",
        "Lec3/p1;",
        "Lvx0/d;",
        "x",
        "Lec3/p1;",
        "_uiState",
        "Lec3/f2;",
        "y",
        "Lec3/f2;",
        "l",
        "()Lec3/f2;",
        "uiState",
        "Lbc3/k1;",
        "z",
        "Lbc3/k1;",
        "scanJob",
        "debug-tools_release"
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
.field private final w:Lft0/c;

.field private final x:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final y:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private z:Lbc3/k1;


# direct methods
.method public constructor <init>(Lft0/c;)V
    .locals 10

    const-string v0, "whoopDeviceManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lvx0/e;->w:Lft0/c;

    new-instance v1, Lvx0/d;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lvx0/d;-><init>(Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lvx0/e;->x:Lec3/p1;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lvx0/e;->y:Lec3/f2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Lvx0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lvx0/e$a;-><init>(Lvx0/e;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Lvx0/e$b;

    invoke-direct {v0, p0, v1}, Lvx0/e$b;-><init>(Lvx0/e;Lq83/d;)V

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final synthetic g(Lvx0/e;)Lft0/c;
    .locals 0

    iget-object p0, p0, Lvx0/e;->w:Lft0/c;

    return-object p0
.end method

.method public static final synthetic j(Lvx0/e;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lvx0/e;->x:Lec3/p1;

    return-object p0
.end method


# virtual methods
.method public final l()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lvx0/e;->y:Lec3/f2;

    return-object v0
.end method

.method public final n(Lmj0/e;)V
    .locals 3

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lvx0/e$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lvx0/e$c;-><init>(Lvx0/e;Lmj0/e;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final o()V
    .locals 12

    iget-object v0, p0, Lvx0/e;->x:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvx0/d;

    invoke-virtual {v0}, Lvx0/d;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lvx0/e;->p()V

    iget-object v0, p0, Lvx0/e;->x:Lec3/p1;

    :cond_1
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lvx0/d;

    const/16 v10, 0x23

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    sget-object v7, Lm83/y;->w:Lm83/y;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lvx0/d;->b(Lvx0/d;Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;ZILjava/lang/Object;)Lvx0/d;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lvx0/e$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lvx0/e$d;-><init>(Lvx0/e;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lvx0/e;->z:Lbc3/k1;

    return-void
.end method

.method public onCleared()V
    .locals 0

    invoke-virtual {p0}, Lvx0/e;->p()V

    invoke-super {p0}, Landroidx/lifecycle/w1;->onCleared()V

    return-void
.end method

.method public final p()V
    .locals 12

    iget-object v0, p0, Lvx0/e;->z:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Lvx0/e;->z:Lbc3/k1;

    iget-object v0, p0, Lvx0/e;->x:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvx0/d;

    invoke-virtual {v0}, Lvx0/d;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lvx0/e;->x:Lec3/p1;

    :cond_1
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lvx0/d;

    const/16 v10, 0x3b

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lvx0/d;->b(Lvx0/d;Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;ZILjava/lang/Object;)Lvx0/d;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .locals 3

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lvx0/e$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lvx0/e$e;-><init>(Lvx0/e;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
