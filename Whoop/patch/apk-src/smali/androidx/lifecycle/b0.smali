.class public final Landroidx/lifecycle/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;
.implements Lbc3/c0;


# instance fields
.field public final w:Landroidx/lifecycle/x;

.field public final x:Lq83/j;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Lq83/j;)V
    .locals 1

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/b0;->w:Landroidx/lifecycle/x;

    iput-object p2, p0, Landroidx/lifecycle/b0;->x:Lq83/j;

    invoke-virtual {p1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    invoke-static {p2, p1}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lc93/m;)Lbc3/c2;
    .locals 3

    new-instance v0, Landroidx/lifecycle/a0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Landroidx/lifecycle/a0;-><init>(Landroidx/lifecycle/b0;Lc93/m;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {p0, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lc93/m;)V
    .locals 3

    new-instance v0, Landroidx/lifecycle/a0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Landroidx/lifecycle/a0;-><init>(Landroidx/lifecycle/b0;Lc93/m;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {p0, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/b0;->x:Lq83/j;

    return-object v0
.end method

.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/b0;->w:Landroidx/lifecycle/x;

    invoke-virtual {p1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p2

    sget-object v0, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    invoke-virtual {p2, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p2

    if-gtz p2, :cond_0

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    iget-object p1, p0, Landroidx/lifecycle/b0;->x:Lq83/j;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method
