.class final Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;
.super La3/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "La3/h1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00030\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "androidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement",
        "S",
        "La3/h1;",
        "Lc0/u;",
        "animation"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Ld0/s1;

.field public final x:Lp1/c1;

.field public final y:Lc0/x;


# direct methods
.method public constructor <init>(Ld0/s1;Lp1/c1;Lc0/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->w:Ld0/s1;

    iput-object p2, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->x:Lp1/c1;

    iput-object p3, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->y:Lc0/x;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Lc0/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc0/k1;-><init>(I)V

    iget-object v1, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->w:Ld0/s1;

    iput-object v1, v0, Lc0/u;->P:Ld0/s1;

    iget-object v1, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->x:Lp1/c1;

    iput-object v1, v0, Lc0/u;->Q:Lp1/c1;

    iget-object v1, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->y:Lc0/x;

    iput-object v1, v0, Lc0/u;->R:Lc0/x;

    sget-wide v1, Landroidx/compose/animation/a;->a:J

    iput-wide v1, v0, Lc0/u;->S:J

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;

    iget-object v0, p1, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->w:Ld0/s1;

    iget-object v1, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->w:Ld0/s1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->x:Lp1/c1;

    iget-object v0, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->x:Lp1/c1;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->y:Lc0/x;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->w:Ld0/s1;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->x:Lp1/c1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 4

    const-string v0, "sizeTransform"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v1

    const-string v2, "sizeAnimation"

    iget-object v3, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->w:Ld0/s1;

    invoke-virtual {v1, v3, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->x:Lp1/c1;

    invoke-virtual {v1, v2, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "scope"

    iget-object v1, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->y:Lc0/x;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Lc0/u;

    iget-object v0, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->w:Ld0/s1;

    iput-object v0, p1, Lc0/u;->P:Ld0/s1;

    iget-object v0, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->x:Lp1/c1;

    iput-object v0, p1, Lc0/u;->Q:Lp1/c1;

    iget-object v0, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;->y:Lc0/x;

    iput-object v0, p1, Lc0/u;->R:Lc0/x;

    return-void
.end method
