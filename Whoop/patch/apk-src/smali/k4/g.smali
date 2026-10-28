.class public final Lk4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk4/d;
.implements Lj4/h;


# instance fields
.field public final a:Le4/s;

.field public b:I

.field public c:Lm4/i;

.field public d:I

.field public e:I

.field public f:F

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Le4/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lk4/g;->d:I

    iput v0, p0, Lk4/g;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lk4/g;->f:F

    iput-object p1, p0, Lk4/g;->a:Le4/s;

    return-void
.end method


# virtual methods
.method public final a()Lm4/e;
    .locals 1

    iget-object v0, p0, Lk4/g;->c:Lm4/i;

    if-nez v0, :cond_0

    new-instance v0, Lm4/i;

    invoke-direct {v0}, Lm4/i;-><init>()V

    iput-object v0, p0, Lk4/g;->c:Lm4/i;

    :cond_0
    iget-object v0, p0, Lk4/g;->c:Lm4/i;

    return-object v0
.end method

.method public final apply()V
    .locals 4

    iget-object v0, p0, Lk4/g;->c:Lm4/i;

    iget v1, p0, Lk4/g;->b:I

    invoke-virtual {v0, v1}, Lm4/i;->W(I)V

    iget v0, p0, Lk4/g;->d:I

    const/high16 v1, -0x40800000    # -1.0f

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget-object v3, p0, Lk4/g;->c:Lm4/i;

    if-le v0, v2, :cond_0

    iput v1, v3, Lm4/i;->r0:F

    iput v0, v3, Lm4/i;->s0:I

    iput v2, v3, Lm4/i;->t0:I

    return-void

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    iget v0, p0, Lk4/g;->e:I

    if-eq v0, v2, :cond_3

    iget-object v3, p0, Lk4/g;->c:Lm4/i;

    if-le v0, v2, :cond_2

    iput v1, v3, Lm4/i;->r0:F

    iput v2, v3, Lm4/i;->s0:I

    iput v0, v3, Lm4/i;->t0:I

    return-void

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_3
    iget-object v0, p0, Lk4/g;->c:Lm4/i;

    iget v3, p0, Lk4/g;->f:F

    cmpl-float v1, v3, v1

    if-lez v1, :cond_4

    iput v3, v0, Lm4/i;->r0:F

    iput v2, v0, Lm4/i;->s0:I

    iput v2, v0, Lm4/i;->t0:I

    return-void

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final b(Lm4/e;)V
    .locals 1

    instance-of v0, p1, Lm4/i;

    if-eqz v0, :cond_0

    check-cast p1, Lm4/i;

    iput-object p1, p0, Lk4/g;->c:Lm4/i;

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lk4/g;->c:Lm4/i;

    return-void
.end method

.method public final c()Lk4/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk4/g;->g:Ljava/lang/String;

    return-object v0
.end method
