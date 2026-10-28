.class public final Ls40/d0;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lec3/h2;

.field public F:Ljava/lang/String;

.field public final w:Lrm/p;

.field public final x:Lb10/z0;

.field public final y:Lbc3/z;

.field public final z:Lec3/h2;


# direct methods
.method public constructor <init>(Lrm/p;Lb10/z0;)V
    .locals 3

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    const-string v1, "dispatcher"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Ls40/d0;->w:Lrm/p;

    iput-object p2, p0, Ls40/d0;->x:Lb10/z0;

    iput-object v0, p0, Ls40/d0;->y:Lbc3/z;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Ls40/d0;->z:Lec3/h2;

    iput-object p1, p0, Ls40/d0;->E:Lec3/h2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Ls40/c0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p0, v2, v1}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x2

    invoke-static {p1, v0, v2, p2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final g(Ls40/d0;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Ls40/b0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ls40/b0;

    iget v1, v0, Ls40/b0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ls40/b0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ls40/b0;

    invoke-direct {v0, p0, p1}, Ls40/b0;-><init>(Ls40/d0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Ls40/b0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ls40/b0;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p0, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ls40/d0;->w:Lrm/p;

    invoke-virtual {p1}, Lrm/p;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lux/y;

    iget-object v2, p0, Ls40/d0;->x:Lb10/z0;

    new-instance v5, Lyy/f;

    iget-object v6, p1, Lux/y;->w:Ljava/lang/String;

    iget-object p1, p1, Lux/y;->x:Ljava/lang/String;

    const/4 v7, 0x4

    invoke-direct {v5, v6, p1, v7}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iget-object p0, p0, Ls40/d0;->F:Ljava/lang/String;

    if-eqz p0, :cond_3

    const-string p1, "on_behalf_of"

    invoke-static {p1, p0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    goto :goto_1

    :cond_3
    move-object p0, v3

    :goto_1
    iput v4, v0, Ls40/b0;->y:I

    invoke-virtual {v2, v5, p0, v0}, Lb10/z0;->M(Lyy/f;Ljava/util/Map;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    instance-of p1, p0, Ll83/m;

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    move-object v3, p0

    :goto_3
    check-cast v3, Ly00/a3;

    if-eqz v3, :cond_6

    iget-object p0, v3, Ly00/a3;->w:Ly00/z2;

    if-eqz p0, :cond_6

    iget-boolean p0, p0, Ly00/z2;->w:Z

    goto :goto_4

    :cond_6
    const/4 p0, 0x0

    :goto_4
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
