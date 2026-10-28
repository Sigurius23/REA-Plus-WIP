.class public final Lcz/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Lv03/h;

.field public final G:Lv03/h;

.field public final H:Lv03/h;

.field public final I:Lv03/h;

.field public final J:Lv03/h;

.field public final K:Lv03/h;

.field public final L:Lv03/h;

.field public final synthetic w:I

.field public final x:Lv03/e;

.field public final y:Lv03/e;

.field public final z:Lv03/h;


# direct methods
.method public constructor <init>(Lv03/e;Lv03/e;Lv03/e;Lcy/b;Ldz/m;Lc20/g;Le10/s0;Lay/w;Ldz/m;Lv03/e;La30/h;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcz/o0;->w:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcz/o0;->x:Lv03/e;

    .line 15
    iput-object p2, p0, Lcz/o0;->y:Lv03/e;

    .line 16
    iput-object p3, p0, Lcz/o0;->z:Lv03/h;

    .line 17
    iput-object p4, p0, Lcz/o0;->F:Lv03/h;

    .line 18
    iput-object p5, p0, Lcz/o0;->G:Lv03/h;

    .line 19
    iput-object p6, p0, Lcz/o0;->H:Lv03/h;

    .line 20
    iput-object p7, p0, Lcz/o0;->I:Lv03/h;

    .line 21
    iput-object p8, p0, Lcz/o0;->J:Lv03/h;

    .line 22
    iput-object p9, p0, Lcz/o0;->K:Lv03/h;

    .line 23
    iput-object p10, p0, Lcz/o0;->E:Lv03/h;

    .line 24
    iput-object p11, p0, Lcz/o0;->L:Lv03/h;

    return-void
.end method

.method public constructor <init>(Lv03/e;Lv03/h;Lv03/e;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/e;Lv03/e;Lv03/h;Lv03/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcz/o0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcz/o0;->z:Lv03/h;

    .line 3
    iput-object p2, p0, Lcz/o0;->E:Lv03/h;

    .line 4
    iput-object p3, p0, Lcz/o0;->F:Lv03/h;

    .line 5
    iput-object p4, p0, Lcz/o0;->G:Lv03/h;

    .line 6
    iput-object p5, p0, Lcz/o0;->H:Lv03/h;

    .line 7
    iput-object p6, p0, Lcz/o0;->I:Lv03/h;

    .line 8
    iput-object p7, p0, Lcz/o0;->J:Lv03/h;

    .line 9
    iput-object p8, p0, Lcz/o0;->x:Lv03/e;

    .line 10
    iput-object p9, p0, Lcz/o0;->y:Lv03/e;

    .line 11
    iput-object p10, p0, Lcz/o0;->K:Lv03/h;

    .line 12
    iput-object p11, p0, Lcz/o0;->L:Lv03/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    iget v1, v0, Lcz/o0;->w:I

    iget-object v2, v0, Lcz/o0;->L:Lv03/h;

    iget-object v3, v0, Lcz/o0;->K:Lv03/h;

    iget-object v4, v0, Lcz/o0;->y:Lv03/e;

    iget-object v5, v0, Lcz/o0;->x:Lv03/e;

    iget-object v6, v0, Lcz/o0;->J:Lv03/h;

    iget-object v7, v0, Lcz/o0;->I:Lv03/h;

    iget-object v8, v0, Lcz/o0;->H:Lv03/h;

    iget-object v9, v0, Lcz/o0;->G:Lv03/h;

    iget-object v10, v0, Lcz/o0;->F:Lv03/h;

    iget-object v11, v0, Lcz/o0;->E:Lv03/h;

    iget-object v12, v0, Lcz/o0;->z:Lv03/h;

    packed-switch v1, :pswitch_data_0

    invoke-interface {v12}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lv00/c0;

    invoke-interface {v11}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Le10/r0;

    invoke-interface {v10}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lc10/n;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ls10/f;

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Lt10/e;

    invoke-interface {v7}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lt10/t;

    invoke-interface {v6}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Lk20/a;

    iget-object v1, v5, Lv03/e;->w:Ljava/lang/Object;

    move-object/from16 v20, v1

    check-cast v20, Landroidx/lifecycle/g0;

    iget-object v1, v4, Lv03/e;->w:Ljava/lang/Object;

    move-object/from16 v21, v1

    check-cast v21, Lj/c;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v22, v1

    check-cast v22, Lbc3/c0;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v23, v1

    check-cast v23, Lt10/c;

    new-instance v12, Lt10/d;

    invoke-direct/range {v12 .. v23}, Lt10/d;-><init>(Lv00/c0;Le10/r0;Lc10/n;Ls10/f;Lt10/e;Lt10/t;Lk20/a;Landroidx/lifecycle/g0;Lj/c;Lbc3/c0;Lt10/c;)V

    return-object v12

    :pswitch_0
    iget-object v1, v5, Lv03/e;->w:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Landroid/app/Application;

    iget-object v1, v4, Lv03/e;->w:Ljava/lang/Object;

    move-object/from16 v16, v1

    check-cast v16, Lcz/b;

    check-cast v12, Lv03/e;

    iget-object v1, v12, Lv03/e;->w:Ljava/lang/Object;

    move-object/from16 v17, v1

    check-cast v17, Lcz/h;

    check-cast v10, Lcy/b;

    invoke-virtual {v10}, Lcy/b;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lqy/d;

    check-cast v9, Ldz/m;

    invoke-virtual {v9}, Ldz/m;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, La33/d;

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v20, Lkc3/d;->w:Lkc3/d;

    invoke-static/range {v20 .. v20}, Ls93/k;->c(Ljava/lang/Object;)V

    check-cast v8, Lc20/g;

    invoke-virtual {v8}, Lc20/g;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v21, v1

    check-cast v21, Lux/y;

    const-string v1, "CustomerSheet"

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    move-object/from16 v22, v1

    check-cast v22, Ljava/util/Set;

    check-cast v7, Le10/s0;

    invoke-virtual {v7}, Le10/s0;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v23, v1

    check-cast v23, Le10/n0;

    check-cast v6, Lay/w;

    invoke-virtual {v6}, Lay/w;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v24, v1

    check-cast v24, Lcz/i;

    check-cast v3, Ldz/m;

    invoke-virtual {v3}, Ldz/m;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v25, v1

    check-cast v25, Lb20/f;

    check-cast v11, Lv03/e;

    iget-object v1, v11, Lv03/e;->w:Ljava/lang/Object;

    move-object/from16 v26, v1

    check-cast v26, Landroidx/lifecycle/k1;

    check-cast v2, La30/h;

    invoke-virtual {v2}, La30/h;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v27, v1

    check-cast v27, Lbz/i;

    new-instance v13, Lcz/n0;

    const/4 v15, 0x0

    invoke-direct/range {v13 .. v27}, Lcz/n0;-><init>(Landroid/app/Application;Lq20/y;Lcz/b;Lcz/h;Lqy/d;La33/d;Lq83/j;Lux/y;Ljava/util/Set;Le10/n0;Lcz/i;Lb20/f;Landroidx/lifecycle/k1;Lbz/i;)V

    return-object v13

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
