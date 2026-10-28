.class public final Landroidx/lifecycle/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroidx/lifecycle/w;

.field public b:Landroidx/lifecycle/e0;


# virtual methods
.method public final a(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 3

    invoke-virtual {p2}, Landroidx/lifecycle/v;->a()Landroidx/lifecycle/w;

    move-result-object v0

    iget-object v1, p0, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    const-string v2, "state1"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_0

    move-object v1, v0

    :cond_0
    iput-object v1, p0, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    iget-object v1, p0, Landroidx/lifecycle/h0;->b:Landroidx/lifecycle/e0;

    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/e0;->h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    iput-object v0, p0, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    return-void
.end method
