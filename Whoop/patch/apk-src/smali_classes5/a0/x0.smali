.class public final La0/x0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:J

.field public J:I

.field public synthetic K:Ljava/lang/Object;

.field public final synthetic L:La0/y0;

.field public final synthetic M:La0/t0;

.field public x:La0/t0;

.field public y:La0/y0;

.field public z:[J


# direct methods
.method public constructor <init>(La0/y0;La0/t0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, La0/x0;->L:La0/y0;

    iput-object p2, p0, La0/x0;->M:La0/t0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, La0/x0;

    iget-object v1, p0, La0/x0;->L:La0/y0;

    iget-object v2, p0, La0/x0;->M:La0/t0;

    invoke-direct {v0, v1, v2, p2}, La0/x0;-><init>(La0/y0;La0/t0;Lq83/d;)V

    iput-object p1, v0, La0/x0;->K:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxb3/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La0/x0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La0/x0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La0/x0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La0/x0;->J:I

    const/4 v3, 0x0

    const/16 v4, 0x8

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v5, :cond_0

    iget v2, v0, La0/x0;->H:I

    iget v6, v0, La0/x0;->G:I

    iget-wide v7, v0, La0/x0;->I:J

    iget v9, v0, La0/x0;->F:I

    iget v10, v0, La0/x0;->E:I

    iget-object v11, v0, La0/x0;->z:[J

    iget-object v12, v0, La0/x0;->y:La0/y0;

    iget-object v13, v0, La0/x0;->x:La0/t0;

    iget-object v14, v0, La0/x0;->K:Ljava/lang/Object;

    check-cast v14, Lxb3/j;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La0/x0;->K:Ljava/lang/Object;

    check-cast v2, Lxb3/j;

    iget-object v6, v0, La0/x0;->L:La0/y0;

    iget-object v7, v6, La0/y0;->x:La0/w0;

    iget-object v7, v7, La0/w0;->a:[J

    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_5

    iget-object v9, v0, La0/x0;->M:La0/t0;

    move v10, v3

    :goto_0
    aget-wide v11, v7, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_4

    sub-int v13, v10, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    rsub-int/lit8 v13, v13, 0x8

    move-object v14, v2

    move v2, v3

    move-wide/from16 v19, v11

    move-object v12, v6

    move-object v11, v7

    move v6, v13

    move-object v13, v9

    move v9, v10

    move v10, v8

    move-wide/from16 v7, v19

    :goto_1
    if-ge v2, v6, :cond_3

    const-wide/16 v15, 0xff

    and-long/2addr v15, v7

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_2

    shl-int/lit8 v3, v9, 0x3

    add-int/2addr v3, v2

    iput v3, v13, La0/t0;->x:I

    iget-object v4, v12, La0/y0;->x:La0/w0;

    iget-object v4, v4, La0/w0;->b:[Ljava/lang/Object;

    aget-object v3, v4, v3

    iput-object v14, v0, La0/x0;->K:Ljava/lang/Object;

    iput-object v13, v0, La0/x0;->x:La0/t0;

    iput-object v12, v0, La0/x0;->y:La0/y0;

    iput-object v11, v0, La0/x0;->z:[J

    iput v10, v0, La0/x0;->E:I

    iput v9, v0, La0/x0;->F:I

    iput-wide v7, v0, La0/x0;->I:J

    iput v6, v0, La0/x0;->G:I

    iput v2, v0, La0/x0;->H:I

    iput v5, v0, La0/x0;->J:I

    invoke-virtual {v14, v3, v0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v2, Lr83/a;->w:Lr83/a;

    return-object v1

    :cond_2
    :goto_2
    shr-long/2addr v7, v4

    add-int/2addr v2, v5

    goto :goto_1

    :cond_3
    if-ne v6, v4, :cond_5

    move v8, v10

    move-object v7, v11

    move-object v6, v12

    move-object v2, v14

    move v10, v9

    move-object v9, v13

    :cond_4
    if-eq v10, v8, :cond_5

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
