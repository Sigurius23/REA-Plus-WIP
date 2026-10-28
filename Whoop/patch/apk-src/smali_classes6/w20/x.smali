.class public final Lw20/x;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final w:Lec3/h2;

.field public final x:Lec3/w1;

.field public final y:Lec3/q1;


# direct methods
.method public constructor <init>(Lw20/a;)V
    .locals 6

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    new-instance v0, Lx30/e0;

    iget-object v1, p1, Lw20/a;->b:Ly00/i;

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v2

    const/4 v3, 0x5

    const/4 v4, 0x0

    invoke-direct {v0, v4, v2, v3}, Lx30/e0;-><init>(Ld0/o2;Lec3/f2;I)V

    new-instance v0, Lw20/y;

    iget-object v2, p1, Lw20/a;->a:Ljava/lang/String;

    iget-boolean p1, p1, Lw20/a;->c:Z

    new-instance v3, Lw20/z;

    const-string v5, ""

    invoke-direct {v3, v5, v1}, Lw20/z;-><init>(Ljava/lang/String;Ly00/i;)V

    const/4 v1, 0x1

    invoke-direct {v0, v2, p1, v3, v1}, Lw20/y;-><init>(Ljava/lang/String;ZLw20/z;Z)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lw20/x;->w:Lec3/h2;

    const/4 p1, 0x0

    const/4 v0, 0x7

    invoke-static {p1, p1, v4, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lw20/x;->x:Lec3/w1;

    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lw20/x;->y:Lec3/q1;

    return-void
.end method


# virtual methods
.method public final g(Lw20/w;)V
    .locals 7

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lw20/u;

    const/4 v1, 0x3

    const/4 v2, 0x0

    iget-object v3, p0, Lw20/x;->w:Lec3/h2;

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw20/y;

    iget-object p1, p1, Lw20/y;->c:Lw20/z;

    iget-object p1, p1, Lw20/z;->a:Ljava/lang/String;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v3, Ls40/c0;

    const/16 v4, 0x14

    invoke-direct {v3, p0, p1, v2, v4}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_0
    instance-of v0, p1, Lw20/t;

    if-eqz v0, :cond_1

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Lsz/q;

    const/16 v3, 0xa

    invoke-direct {v0, p0, v2, v3}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_1
    instance-of v0, p1, Lw20/v;

    if-eqz v0, :cond_4

    check-cast p1, Lw20/v;

    iget-object p1, p1, Lw20/v;->a:Ljava/lang/String;

    :cond_2
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lw20/y;

    iget-object v2, v1, Lw20/y;->c:Lw20/z;

    const-string v4, "cvc"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v5, v2, Lw20/z;->b:Ly00/i;

    invoke-virtual {v5}, Ly00/i;->b()I

    move-result v6

    if-le v4, v6, :cond_3

    goto :goto_0

    :cond_3
    new-instance v2, Lw20/z;

    invoke-direct {v2, p1, v5}, Lw20/z;-><init>(Ljava/lang/String;Ly00/i;)V

    :goto_0
    const/4 v4, 0x0

    const/16 v5, 0xb

    invoke-static {v1, v2, v4, v5}, Lw20/y;->a(Lw20/y;Lw20/z;ZI)Lw20/y;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
