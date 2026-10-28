.class public final Lk4/b;
.super Lj4/g;
.source "SourceFile"


# instance fields
.field public n0:I

.field public o0:I

.field public p0:Lm4/b;


# direct methods
.method public constructor <init>(Le4/s;)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, p1, v0}, Lj4/g;-><init>(Le4/s;I)V

    return-void
.end method


# virtual methods
.method public final apply()V
    .locals 3

    invoke-virtual {p0}, Lk4/b;->s()Lm4/j;

    iget v0, p0, Lk4/b;->n0:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :cond_2
    :goto_0
    iget-object v0, p0, Lk4/b;->p0:Lm4/b;

    iput v1, v0, Lm4/b;->t0:I

    iget v1, p0, Lk4/b;->o0:I

    iput v1, v0, Lm4/b;->v0:I

    return-void
.end method

.method public final k(I)Lj4/b;
    .locals 0

    iput p1, p0, Lk4/b;->o0:I

    return-object p0
.end method

.method public final l(Ljava/lang/Float;)Lj4/b;
    .locals 1

    iget-object v0, p0, Lj4/g;->k0:Le4/s;

    invoke-virtual {v0, p1}, Le4/s;->c(Ljava/lang/Float;)I

    move-result p1

    iput p1, p0, Lk4/b;->o0:I

    return-object p0
.end method

.method public final s()Lm4/j;
    .locals 1

    iget-object v0, p0, Lk4/b;->p0:Lm4/b;

    if-nez v0, :cond_0

    new-instance v0, Lm4/b;

    invoke-direct {v0}, Lm4/b;-><init>()V

    iput-object v0, p0, Lk4/b;->p0:Lm4/b;

    :cond_0
    iget-object v0, p0, Lk4/b;->p0:Lm4/b;

    return-object v0
.end method

.method public final t(I)V
    .locals 0

    iput p1, p0, Lk4/b;->n0:I

    return-void
.end method
