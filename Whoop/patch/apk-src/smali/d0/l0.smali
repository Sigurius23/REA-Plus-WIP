.class public final Ld0/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lr1/c;

.field public final b:Lp1/k1;

.field public c:J

.field public final d:Lp1/k1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v1, v1, [Ld0/j0;

    invoke-direct {v0, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Ld0/l0;->a:Lr1/c;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ld0/l0;->b:Lp1/k1;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Ld0/l0;->c:J

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ld0/l0;->d:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p1, Lp1/q;

    const v0, -0x12f4f699

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v2, v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    and-int/2addr v0, v3

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_2

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lp1/c1;

    iget-object v3, p0, Ld0/l0;->d:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Ld0/l0;->b:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    const v0, -0x88c0f65

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    :goto_2
    const v3, -0x8a13848

    invoke-virtual {p1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_5

    if-ne v5, v2, :cond_6

    :cond_5
    new-instance v5, Landroidx/lifecycle/e1;

    const/4 v2, 0x4

    invoke-direct {v5, v0, p0, v1, v2}, Landroidx/lifecycle/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lc93/m;

    invoke-static {p1, v5, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lc41/l3;

    invoke-direct {v0, p0, p2}, Lc41/l3;-><init>(Ld0/l0;I)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method
