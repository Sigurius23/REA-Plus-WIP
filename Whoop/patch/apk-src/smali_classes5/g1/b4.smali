.class public final synthetic Lg1/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ll83/e;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic N:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lq00/i0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg1/b4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/b4;->F:Ljava/lang/Object;

    iput-boolean p2, p0, Lg1/b4;->x:Z

    iput-object p3, p0, Lg1/b4;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lg1/b4;->G:Ljava/lang/Object;

    iput-object p5, p0, Lg1/b4;->H:Ljava/lang/Object;

    iput-object p6, p0, Lg1/b4;->I:Ll83/e;

    iput-object p7, p0, Lg1/b4;->J:Ljava/lang/Object;

    iput-object p8, p0, Lg1/b4;->K:Ljava/lang/Object;

    iput-object p9, p0, Lg1/b4;->L:Ljava/lang/Object;

    iput-object p10, p0, Lg1/b4;->M:Ljava/lang/Object;

    iput-object p11, p0, Lg1/b4;->N:Ljava/lang/Object;

    iput p12, p0, Lg1/b4;->z:I

    iput p13, p0, Lg1/b4;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;IILi2/a1;Lg1/e8;I)V
    .locals 0

    .line 2
    const/4 p14, 0x0

    iput p14, p0, Lg1/b4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/b4;->F:Ljava/lang/Object;

    iput-object p2, p0, Lg1/b4;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lg1/b4;->G:Ljava/lang/Object;

    iput-boolean p4, p0, Lg1/b4;->x:Z

    iput-object p5, p0, Lg1/b4;->H:Ljava/lang/Object;

    iput-object p6, p0, Lg1/b4;->I:Ll83/e;

    iput-object p7, p0, Lg1/b4;->J:Ljava/lang/Object;

    iput-object p8, p0, Lg1/b4;->K:Ljava/lang/Object;

    iput-object p9, p0, Lg1/b4;->L:Ljava/lang/Object;

    iput p10, p0, Lg1/b4;->z:I

    iput p11, p0, Lg1/b4;->E:I

    iput-object p12, p0, Lg1/b4;->M:Ljava/lang/Object;

    iput-object p13, p0, Lg1/b4;->N:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lg1/b4;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lg1/b4;->F:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lq00/i0;

    iget-object v1, v0, Lg1/b4;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lg1/b4;->H:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lc93/a;

    iget-object v1, v0, Lg1/b4;->I:Ll83/e;

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lg1/b4;->J:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lg1/b4;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lg1/b4;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lc93/a;

    iget-object v1, v0, Lg1/b4;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lg1/b4;->N:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lkotlin/jvm/functions/Function1;

    move-object/from16 v13, p1

    check-cast v13, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    iget v1, v0, Lg1/b4;->z:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v14

    iget v1, v0, Lg1/b4;->E:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v15

    iget-boolean v3, v0, Lg1/b4;->x:Z

    iget-object v4, v0, Lg1/b4;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v2 .. v15}, Lse/h;->p(Lq00/i0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lg1/b4;->F:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lq3/y;

    iget-object v1, v0, Lg1/b4;->G:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Landroidx/compose/ui/Modifier;

    iget-object v1, v0, Lg1/b4;->H:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ll3/v0;

    iget-object v1, v0, Lg1/b4;->I:Ll83/e;

    move-object v7, v1

    check-cast v7, Lc93/m;

    iget-object v1, v0, Lg1/b4;->J:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lq3/g0;

    iget-object v1, v0, Lg1/b4;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lu0/r0;

    iget-object v1, v0, Lg1/b4;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lu0/q0;

    iget-object v1, v0, Lg1/b4;->M:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Li2/a1;

    iget-object v1, v0, Lg1/b4;->N:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Lg1/e8;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v16

    iget-object v3, v0, Lg1/b4;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v5, v0, Lg1/b4;->x:Z

    iget v11, v0, Lg1/b4;->z:I

    iget v12, v0, Lg1/b4;->E:I

    invoke-static/range {v2 .. v16}, Lg1/j4;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;IILi2/a1;Lg1/e8;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
