.class public final synthetic Ll00/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc00/a;

.field public final synthetic y:Ld00/l;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lc00/a;Ld00/l;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Ll00/g;->w:I

    iput-object p1, p0, Ll00/g;->x:Lc00/a;

    iput-object p2, p0, Ll00/g;->y:Ld00/l;

    iput-object p3, p0, Ll00/g;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Ll00/g;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ll8/c;

    const-string v2, "$this$initializer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Ll00/g;->x:Lc00/a;

    iget-object v3, v1, Lc00/a;->a:Lwz/g0;

    invoke-virtual {v1}, Lc00/a;->b()Lxz/x;

    move-result-object v5

    new-instance v6, La00/g;

    iget-object v2, v1, Lc00/a;->J:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La00/i;

    invoke-virtual {v1}, Lc00/a;->c()Lwz/y;

    move-result-object v4

    iget-object v4, v4, Lwz/y;->N:Le10/r0;

    invoke-virtual {v2, v4}, La00/i;->a(Le10/r0;)La00/g;

    move-result-object v2

    invoke-virtual {v1}, Lc00/a;->b()Lxz/x;

    move-result-object v4

    invoke-virtual {v1}, Lc00/a;->a()Lwz/m1;

    move-result-object v7

    iget-object v8, v1, Lc00/a;->f:Lwz/n0;

    invoke-direct {v6, v2, v4, v7, v8}, La00/g;-><init>(La00/g;Lxz/x;Lwz/m1;Lwz/n0;)V

    invoke-virtual {v1}, Lc00/a;->c()Lwz/y;

    move-result-object v2

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v8

    iget-object v2, v1, Lc00/a;->K:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lzx/o;

    iget-object v11, v1, Lc00/a;->g:Lv00/c0;

    iget-object v2, v1, Lc00/a;->c0:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk20/a;

    invoke-virtual {v1}, Lc00/a;->c()Lwz/y;

    move-result-object v4

    iget-object v4, v4, Lwz/y;->H:Landroidx/lifecycle/k1;

    new-instance v7, Ld1/j;

    iget-object v9, v1, Lc00/a;->g0:Lv03/h;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li20/y0;

    new-instance v12, Lf1/p1;

    iget-object v13, v1, Lc00/a;->a:Lwz/g0;

    iget-object v13, v13, Lwz/g0;->V:Ljava/lang/String;

    sget-object v14, Li20/j;->a:Ljava/util/Set;

    invoke-direct {v12, v13, v14}, Lf1/p1;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-direct {v7, v9, v12}, Ld1/j;-><init>(Li20/y0;Lf1/p1;)V

    const-string v9, "cardAccountRangeRepositoryFactory"

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "paymentMethodMetadata"

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "eventReporter"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "savedStateHandle"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lh20/y;

    invoke-direct {v9}, Lh20/y;-><init>()V

    move-object/from16 v18, v7

    new-instance v7, Lh20/g;

    new-instance v12, Lcb1/a;

    const/4 v13, 0x5

    invoke-direct {v12, v13}, Lcb1/a;-><init>(I)V

    new-instance v13, Lh00/l0;

    const/4 v14, 0x6

    invoke-direct {v13, v14}, Lh00/l0;-><init>(I)V

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x1

    move-object/from16 v16, v2

    move-object/from16 v17, v4

    invoke-direct/range {v7 .. v21}, Lh20/g;-><init>(Lbc3/c0;Lh20/y;Lzx/o;Lv00/c0;Lc93/a;Lkotlin/jvm/functions/Function1;Lwz/l1;ZLk20/a;Landroidx/lifecycle/k1;Lg40/z;ZLb5/d;Lb30/m;)V

    iget-object v2, v1, Lc00/a;->u:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqy/d;

    invoke-virtual {v1}, Lc00/a;->a()Lwz/m1;

    move-result-object v9

    iget-object v10, v1, Lc00/a;->f:Lwz/n0;

    move-object v8, v7

    move-object v7, v2

    new-instance v2, Lm00/d;

    iget-object v4, v0, Ll00/g;->y:Ld00/l;

    iget-object v11, v0, Ll00/g;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v2 .. v11}, Lm00/d;-><init>(Lwz/g0;Ld00/l;Lxz/x;La00/g;Lqy/d;Lh20/g;Lwz/m1;Lwz/n0;Lkotlin/jvm/functions/Function1;)V

    return-object v2

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ll8/c;

    const-string v2, "$this$initializer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Ll00/g;->x:Lc00/a;

    iget-object v1, v1, Lc00/a;->h:Lc00/a;

    iget-object v2, v0, Ll00/g;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ll00/i;

    iget-object v4, v1, Lc00/a;->a:Lwz/g0;

    iget-object v1, v1, Lc00/a;->H:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxz/x;

    iget-object v5, v0, Ll00/g;->y:Ld00/l;

    invoke-direct {v3, v5, v4, v1, v2}, Ll00/i;-><init>(Ld00/l;Lwz/g0;Lxz/x;Lkotlin/jvm/functions/Function1;)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
