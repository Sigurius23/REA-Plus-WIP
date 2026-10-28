.class public final Lg1/k8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:J

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:J

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(FJLc93/m;ZJI)V
    .locals 0

    iput p8, p0, Lg1/k8;->w:I

    iput p1, p0, Lg1/k8;->x:F

    iput-wide p2, p0, Lg1/k8;->y:J

    iput-object p4, p0, Lg1/k8;->z:Lc93/m;

    iput-boolean p5, p0, Lg1/k8;->E:Z

    iput-wide p6, p0, Lg1/k8;->F:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Lg1/k8;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, Lg1/i9;->b:Lp1/u2;

    move-object v2, v6

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/h9;

    iget-object v3, v3, Lg1/h9;->g:Ll3/v0;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/h9;

    iget-object v1, v1, Lg1/h9;->l:Ll3/v0;

    iget v2, v0, Lg1/k8;->x:F

    invoke-static {v3, v1, v2}, Ljc/x;->a0(Ll3/v0;Ll3/v0;F)Ll3/v0;

    move-result-object v7

    iget-boolean v1, v0, Lg1/k8;->E:Z

    if-eqz v1, :cond_2

    const/16 v20, 0x0

    const v21, 0xfffffe

    iget-wide v8, v0, Lg1/k8;->F:J

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v7 .. v21}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v7

    :cond_2
    move-object v4, v7

    const/16 v7, 0x180

    const/4 v8, 0x0

    iget-wide v2, v0, Lg1/k8;->y:J

    iget-object v5, v0, Lg1/k8;->z:Lc93/m;

    invoke-static/range {v2 .. v8}, Lvp/c;->k(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_3

    move v3, v5

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    and-int/2addr v2, v5

    move-object v8, v1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v8, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/h9;

    iget-object v2, v2, Lg1/h9;->g:Ll3/v0;

    invoke-virtual {v8, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/h9;

    iget-object v1, v1, Lg1/h9;->l:Ll3/v0;

    iget v3, v0, Lg1/k8;->x:F

    invoke-static {v2, v1, v3}, Ljc/x;->a0(Ll3/v0;Ll3/v0;F)Ll3/v0;

    move-result-object v9

    iget-boolean v1, v0, Lg1/k8;->E:Z

    if-eqz v1, :cond_4

    const/16 v22, 0x0

    const v23, 0xfffffe

    iget-wide v10, v0, Lg1/k8;->F:J

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v9

    :cond_4
    move-object v6, v9

    const/16 v9, 0x180

    const/4 v10, 0x0

    iget-wide v4, v0, Lg1/k8;->y:J

    iget-object v7, v0, Lg1/k8;->z:Lc93/m;

    invoke-static/range {v4 .. v10}, Lg1/p8;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
