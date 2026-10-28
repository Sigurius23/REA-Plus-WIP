.class public final Lj31/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj31/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00068V@RX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0014\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lj31/o;",
        "Lj31/b;",
        "",
        "stiffness",
        "<init>",
        "(F)V",
        "Lj31/d;",
        "position",
        "Lh2/b;",
        "offset",
        "Ll83/a0;",
        "b",
        "(Lj31/d;JLq83/d;)Ljava/lang/Object;",
        "a",
        "F",
        "Ld0/e;",
        "Ld0/o;",
        "Ld0/e;",
        "animatable",
        "<set-?>",
        "c",
        "Lp1/c1;",
        "getPosition",
        "()Lj31/d;",
        "(Lj31/d;)V",
        "()J",
        "design_release"
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
.field private final a:F

.field private final b:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field private final c:Lp1/c1;


# direct methods
.method public constructor <init>(F)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj31/o;->a:F

    .line 2
    new-instance p1, Ld0/e;

    .line 3
    new-instance v0, Lh2/b;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lh2/b;-><init>(J)V

    .line 4
    sget-object v1, Ld0/f;->n:Ld0/f2;

    const/16 v2, 0xc

    const/4 v3, 0x0

    invoke-direct {p1, v0, v1, v3, v2}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    iput-object p1, p0, Lj31/o;->b:Ld0/e;

    .line 5
    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lj31/o;->c:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, 0x43c80000    # 400.0f

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lj31/o;-><init>(F)V

    return-void
.end method

.method private c(Lj31/d;)V
    .locals 1

    iget-object v0, p0, Lj31/o;->c:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lj31/o;->b:Ld0/e;

    invoke-virtual {v0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    iget-wide v0, v0, Lh2/b;->a:J

    return-wide v0
.end method

.method public b(Lj31/d;JLq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj31/d;",
            "J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-object/from16 v3, p4

    instance-of v4, v3, Lj31/o$a;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lj31/o$a;

    iget v5, v4, Lj31/o$a;->E:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lj31/o$a;->E:I

    :goto_0
    move-object v9, v4

    goto :goto_1

    :cond_0
    new-instance v4, Lj31/o$a;

    invoke-direct {v4, v0, v3}, Lj31/o$a;-><init>(Lj31/o;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v3, v9, Lj31/o$a;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v9, Lj31/o$a;->E:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v11, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v9, Lj31/o$a;->w:Ljava/lang/Object;

    check-cast v1, Lj31/d;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-wide v1, v9, Lj31/o$a;->x:J

    iget-object v5, v9, Lj31/o$a;->w:Ljava/lang/Object;

    check-cast v5, Lj31/d;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p1}, Lj31/o;->c(Lj31/d;)V

    iget-object v3, v0, Lj31/o;->b:Ld0/e;

    new-instance v5, Lh2/b;

    invoke-direct {v5, v1, v2}, Lh2/b;-><init>(J)V

    iput-object v11, v9, Lj31/o$a;->w:Ljava/lang/Object;

    iput-wide v1, v9, Lj31/o$a;->x:J

    iput v7, v9, Lj31/o$a;->E:I

    invoke-virtual {v3, v5, v9}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v5, v0, Lj31/o;->b:Ld0/e;

    new-instance v3, Lh2/b;

    const-wide/16 v12, 0x0

    invoke-direct {v3, v12, v13}, Lh2/b;-><init>(J)V

    iget v8, v0, Lj31/o;->a:F

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v14, v10

    const/16 v10, 0x20

    shl-long/2addr v12, v10

    const-wide v16, 0xffffffffL

    and-long v14, v14, v16

    or-long/2addr v12, v14

    new-instance v10, Lh2/b;

    invoke-direct {v10, v12, v13}, Lh2/b;-><init>(J)V

    const/4 v12, 0x0

    invoke-static {v12, v8, v7, v10}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v7

    iput-object v11, v9, Lj31/o$a;->w:Ljava/lang/Object;

    iput-wide v1, v9, Lj31/o$a;->x:J

    iput v6, v9, Lj31/o$a;->E:I

    const/4 v8, 0x0

    const/16 v10, 0xc

    move-object v6, v3

    invoke-static/range {v5 .. v10}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_5

    :goto_3
    return-object v4

    :cond_5
    :goto_4
    invoke-direct {v0, v11}, Lj31/o;->c(Lj31/d;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public getPosition()Lj31/d;
    .locals 1

    iget-object v0, p0, Lj31/o;->c:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj31/d;

    return-object v0
.end method
