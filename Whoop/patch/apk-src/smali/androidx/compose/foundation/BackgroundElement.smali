.class final Landroidx/compose/foundation/BackgroundElement;
.super La3/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La3/h1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/BackgroundElement;",
        "La3/h1;",
        "Lf0/n;",
        "foundation_release"
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
.field public final E:Lb3/r;

.field public final w:J

.field public final x:Li2/t;

.field public final y:F

.field public final z:Li2/a1;


# direct methods
.method public constructor <init>(JLi2/t;FLi2/a1;I)V
    .locals 2

    sget-object v0, Lb3/r;->F:Lb3/r;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    sget-wide p1, Li2/x;->n:J

    :cond_0
    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Landroidx/compose/foundation/BackgroundElement;->w:J

    iput-object p3, p0, Landroidx/compose/foundation/BackgroundElement;->x:Li2/t;

    iput p4, p0, Landroidx/compose/foundation/BackgroundElement;->y:F

    iput-object p5, p0, Landroidx/compose/foundation/BackgroundElement;->z:Li2/a1;

    iput-object v0, p0, Landroidx/compose/foundation/BackgroundElement;->E:Lb3/r;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 3

    new-instance v0, Lf0/n;

    invoke-direct {v0}, Lb2/v;-><init>()V

    iget-wide v1, p0, Landroidx/compose/foundation/BackgroundElement;->w:J

    iput-wide v1, v0, Lf0/n;->O:J

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->x:Li2/t;

    iput-object v1, v0, Lf0/n;->P:Li2/t;

    iget v1, p0, Landroidx/compose/foundation/BackgroundElement;->y:F

    iput v1, v0, Lf0/n;->Q:F

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->z:Li2/a1;

    iput-object v1, v0, Lf0/n;->R:Li2/a1;

    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v1, v0, Lf0/n;->S:J

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p1, Landroidx/compose/foundation/BackgroundElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/BackgroundElement;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    iget-wide v1, p0, Landroidx/compose/foundation/BackgroundElement;->w:J

    iget-wide v3, p1, Landroidx/compose/foundation/BackgroundElement;->w:J

    invoke-static {v1, v2, v3, v4}, Li2/x;->d(JJ)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->x:Li2/t;

    iget-object v2, p1, Landroidx/compose/foundation/BackgroundElement;->x:Li2/t;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/BackgroundElement;->y:F

    iget v2, p1, Landroidx/compose/foundation/BackgroundElement;->y:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->z:Li2/a1;

    iget-object p1, p1, Landroidx/compose/foundation/BackgroundElement;->z:Li2/a1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 3

    sget v0, Li2/x;->o:I

    iget-wide v0, p0, Landroidx/compose/foundation/BackgroundElement;->w:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/BackgroundElement;->x:Li2/t;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/foundation/BackgroundElement;->y:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->z:Li2/a1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/foundation/BackgroundElement;->E:Lb3/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 2

    check-cast p1, Lf0/n;

    iget-wide v0, p0, Landroidx/compose/foundation/BackgroundElement;->w:J

    iput-wide v0, p1, Lf0/n;->O:J

    iget-object v0, p0, Landroidx/compose/foundation/BackgroundElement;->x:Li2/t;

    iput-object v0, p1, Lf0/n;->P:Li2/t;

    iget v0, p0, Landroidx/compose/foundation/BackgroundElement;->y:F

    iput v0, p1, Lf0/n;->Q:F

    iget-object v0, p0, Landroidx/compose/foundation/BackgroundElement;->z:Li2/a1;

    iput-object v0, p1, Lf0/n;->R:Li2/a1;

    invoke-static {p1}, La3/g;->h(La3/r;)V

    return-void
.end method
