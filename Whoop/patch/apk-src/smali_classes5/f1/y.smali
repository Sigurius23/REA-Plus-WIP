.class public final synthetic Lf1/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:Lf1/r;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Lf1/q0;


# direct methods
.method public synthetic constructor <init>(Lf1/r;IILf1/q0;Ll83/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/y;->w:Lf1/r;

    iput p2, p0, Lf1/y;->x:I

    iput p3, p0, Lf1/y;->y:I

    iput-object p4, p0, Lf1/y;->z:Lf1/q0;

    iput-object p5, p0, Lf1/y;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lf1/y;->E:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, v0, Lf1/y;->z:Lf1/q0;

    invoke-interface {v2}, Lf1/q0;->a()Z

    move-result v3

    invoke-interface {v2}, Lf1/q0;->e()Lf1/g;

    move-result-object v2

    sget-object v4, Lf1/g;->w:Lf1/g;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v2, v4, :cond_0

    move v2, v6

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    iget-object v4, v0, Lf1/y;->w:Lf1/r;

    iget-object v7, v4, Lf1/r;->f:Ll3/r0;

    iget v8, v0, Lf1/y;->x:I

    invoke-virtual {v7, v8}, Ll3/r0;->k(I)J

    move-result-wide v9

    iget-object v7, v4, Lf1/r;->f:Ll3/r0;

    iget-object v11, v7, Ll3/r0;->b:Ll3/w;

    sget v12, Ll3/u0;->c:I

    const/16 v12, 0x20

    shr-long v12, v9, v12

    long-to-int v12, v12

    invoke-virtual {v11, v12}, Ll3/w;->d(I)I

    move-result v13

    iget v14, v11, Ll3/w;->f:I

    if-ne v13, v1, :cond_1

    goto :goto_1

    :cond_1
    if-lt v1, v14, :cond_2

    add-int/lit8 v12, v14, -0x1

    invoke-virtual {v7, v12}, Ll3/r0;->h(I)I

    move-result v12

    goto :goto_1

    :cond_2
    invoke-virtual {v7, v1}, Ll3/r0;->h(I)I

    move-result v12

    :goto_1
    const-wide v15, 0xffffffffL

    and-long/2addr v9, v15

    long-to-int v7, v9

    invoke-virtual {v11, v7}, Ll3/w;->d(I)I

    move-result v9

    if-ne v9, v1, :cond_3

    goto :goto_2

    :cond_3
    if-lt v1, v14, :cond_4

    sub-int/2addr v14, v6

    invoke-virtual {v11, v14, v5}, Ll3/w;->c(IZ)I

    move-result v7

    goto :goto_2

    :cond_4
    invoke-virtual {v11, v1, v5}, Ll3/w;->c(IZ)I

    move-result v7

    :goto_2
    iget v1, v0, Lf1/y;->y:I

    if-ne v12, v1, :cond_5

    invoke-virtual {v4, v7}, Lf1/r;->a(I)Lf1/t;

    move-result-object v1

    return-object v1

    :cond_5
    if-ne v7, v1, :cond_6

    invoke-virtual {v4, v12}, Lf1/r;->a(I)Lf1/t;

    move-result-object v1

    return-object v1

    :cond_6
    xor-int v1, v3, v2

    if-eqz v1, :cond_7

    if-gt v8, v7, :cond_8

    goto :goto_3

    :cond_7
    if-lt v8, v12, :cond_9

    :cond_8
    move v12, v7

    :cond_9
    :goto_3
    invoke-virtual {v4, v12}, Lf1/r;->a(I)Lf1/t;

    move-result-object v1

    return-object v1
.end method
