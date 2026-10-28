.class public final synthetic Lqz0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lb91/a;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lqz0/c;

.field public final synthetic I:Lcom/whoop/design/util/TextResource;

.field public final synthetic J:Z

.field public final synthetic K:Lb91/a;

.field public final synthetic L:Z

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic P:Z

.field public final synthetic Q:Lq3/g0;

.field public final synthetic R:Z

.field public final synthetic S:Z

.field public final synthetic T:Lj0/i;

.field public final synthetic U:Li2/a1;

.field public final synthetic V:Lg1/e8;

.field public final synthetic W:Ll0/k1;

.field public final synthetic X:Lu0/q0;

.field public final synthetic Y:Landroid/icu/text/NumberFormat;

.field public final synthetic Z:Z

.field public final synthetic a0:Lc93/a;

.field public final synthetic b0:Lkotlin/jvm/functions/Function1;

.field public final synthetic c0:Lkotlin/jvm/functions/Function1;

.field public final synthetic d0:I

.field public final synthetic e0:I

.field public final synthetic f0:I

.field public final synthetic g0:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lb91/a;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZLb91/a;ZIIIZLq3/g0;ZZLj0/i;Li2/a1;Lg1/e8;Ll0/k1;Lu0/q0;Landroid/icu/text/NumberFormat;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqz0/e;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lqz0/e;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lqz0/e;->y:Lb91/a;

    iput-object p4, p0, Lqz0/e;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lqz0/e;->E:Lb91/a;

    iput-object p6, p0, Lqz0/e;->F:Lc93/m;

    iput-object p7, p0, Lqz0/e;->G:Lc93/m;

    iput-object p8, p0, Lqz0/e;->H:Lqz0/c;

    iput-object p9, p0, Lqz0/e;->I:Lcom/whoop/design/util/TextResource;

    iput-boolean p10, p0, Lqz0/e;->J:Z

    iput-object p11, p0, Lqz0/e;->K:Lb91/a;

    iput-boolean p12, p0, Lqz0/e;->L:Z

    iput p13, p0, Lqz0/e;->M:I

    iput p14, p0, Lqz0/e;->N:I

    iput p15, p0, Lqz0/e;->O:I

    move/from16 p1, p16

    iput-boolean p1, p0, Lqz0/e;->P:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lqz0/e;->Q:Lq3/g0;

    move/from16 p1, p18

    iput-boolean p1, p0, Lqz0/e;->R:Z

    move/from16 p1, p19

    iput-boolean p1, p0, Lqz0/e;->S:Z

    move-object/from16 p1, p20

    iput-object p1, p0, Lqz0/e;->T:Lj0/i;

    move-object/from16 p1, p21

    iput-object p1, p0, Lqz0/e;->U:Li2/a1;

    move-object/from16 p1, p22

    iput-object p1, p0, Lqz0/e;->V:Lg1/e8;

    move-object/from16 p1, p23

    iput-object p1, p0, Lqz0/e;->W:Ll0/k1;

    move-object/from16 p1, p24

    iput-object p1, p0, Lqz0/e;->X:Lu0/q0;

    move-object/from16 p1, p25

    iput-object p1, p0, Lqz0/e;->Y:Landroid/icu/text/NumberFormat;

    move/from16 p1, p26

    iput-boolean p1, p0, Lqz0/e;->Z:Z

    move-object/from16 p1, p27

    iput-object p1, p0, Lqz0/e;->a0:Lc93/a;

    move-object/from16 p1, p28

    iput-object p1, p0, Lqz0/e;->b0:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p29

    iput-object p1, p0, Lqz0/e;->c0:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p30

    iput p1, p0, Lqz0/e;->d0:I

    move/from16 p1, p31

    iput p1, p0, Lqz0/e;->e0:I

    move/from16 p1, p32

    iput p1, p0, Lqz0/e;->f0:I

    move/from16 p1, p33

    iput p1, p0, Lqz0/e;->g0:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v34, p1

    check-cast v34, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v35

    iget-object v1, v0, Lqz0/e;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lqz0/e;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lqz0/e;->y:Lb91/a;

    iget-object v4, v0, Lqz0/e;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lqz0/e;->E:Lb91/a;

    iget-object v6, v0, Lqz0/e;->F:Lc93/m;

    iget-object v7, v0, Lqz0/e;->G:Lc93/m;

    iget-object v8, v0, Lqz0/e;->H:Lqz0/c;

    iget-object v9, v0, Lqz0/e;->I:Lcom/whoop/design/util/TextResource;

    iget-boolean v10, v0, Lqz0/e;->J:Z

    iget-object v11, v0, Lqz0/e;->K:Lb91/a;

    iget-boolean v12, v0, Lqz0/e;->L:Z

    iget v13, v0, Lqz0/e;->M:I

    iget v14, v0, Lqz0/e;->N:I

    iget v15, v0, Lqz0/e;->O:I

    move-object/from16 v16, v1

    iget-boolean v1, v0, Lqz0/e;->P:Z

    move/from16 v17, v1

    iget-object v1, v0, Lqz0/e;->Q:Lq3/g0;

    move-object/from16 v18, v1

    iget-boolean v1, v0, Lqz0/e;->R:Z

    move/from16 v19, v1

    iget-boolean v1, v0, Lqz0/e;->S:Z

    move/from16 v20, v1

    iget-object v1, v0, Lqz0/e;->T:Lj0/i;

    move-object/from16 v21, v1

    iget-object v1, v0, Lqz0/e;->U:Li2/a1;

    move-object/from16 v22, v1

    iget-object v1, v0, Lqz0/e;->V:Lg1/e8;

    move-object/from16 v23, v1

    iget-object v1, v0, Lqz0/e;->W:Ll0/k1;

    move-object/from16 v24, v1

    iget-object v1, v0, Lqz0/e;->X:Lu0/q0;

    move-object/from16 v25, v1

    iget-object v1, v0, Lqz0/e;->Y:Landroid/icu/text/NumberFormat;

    move-object/from16 v26, v1

    iget-boolean v1, v0, Lqz0/e;->Z:Z

    move/from16 v27, v1

    iget-object v1, v0, Lqz0/e;->a0:Lc93/a;

    move-object/from16 v28, v1

    iget-object v1, v0, Lqz0/e;->b0:Lkotlin/jvm/functions/Function1;

    move-object/from16 v29, v1

    iget-object v1, v0, Lqz0/e;->c0:Lkotlin/jvm/functions/Function1;

    move-object/from16 v30, v1

    iget v1, v0, Lqz0/e;->d0:I

    move/from16 v31, v1

    iget v1, v0, Lqz0/e;->e0:I

    move/from16 v32, v1

    iget v1, v0, Lqz0/e;->f0:I

    move/from16 v33, v1

    iget v1, v0, Lqz0/e;->g0:I

    move/from16 v36, v33

    move/from16 v33, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v24

    move-object/from16 v24, v25

    move-object/from16 v25, v26

    move/from16 v26, v27

    move-object/from16 v27, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v30

    move/from16 v30, v31

    move/from16 v31, v32

    move/from16 v32, v36

    invoke-static/range {v1 .. v35}, Lqz0/f;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZLb91/a;ZIIIZLq3/g0;ZZLj0/i;Li2/a1;Lg1/e8;Ll0/k1;Lu0/q0;Landroid/icu/text/NumberFormat;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
