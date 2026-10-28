.class public final synthetic Lk71/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly81/e;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Ly71/g;

.field public final synthetic H:Lkd1/l;

.field public final synthetic I:F

.field public final synthetic J:Lm91/u;

.field public final synthetic K:Lcom/whoop/design/util/TextResource;

.field public final synthetic L:Lcom/whoop/design/util/TextResource;

.field public final synthetic M:Z

.field public final synthetic N:Ljava/util/List;

.field public final synthetic O:Lkotlin/jvm/functions/Function1;

.field public final synthetic P:Lkotlin/jvm/functions/Function1;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ly81/e;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly71/g;Lkd1/l;FLm91/u;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk71/w;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lk71/w;->x:Ly81/e;

    iput-object p3, p0, Lk71/w;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lk71/w;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lk71/w;->E:Ly81/e;

    iput-object p6, p0, Lk71/w;->F:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lk71/w;->G:Ly71/g;

    iput-object p8, p0, Lk71/w;->H:Lkd1/l;

    iput p9, p0, Lk71/w;->I:F

    iput-object p10, p0, Lk71/w;->J:Lm91/u;

    iput-object p11, p0, Lk71/w;->K:Lcom/whoop/design/util/TextResource;

    iput-object p12, p0, Lk71/w;->L:Lcom/whoop/design/util/TextResource;

    iput-boolean p13, p0, Lk71/w;->M:Z

    iput-object p14, p0, Lk71/w;->N:Ljava/util/List;

    iput-object p15, p0, Lk71/w;->O:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p16

    iput-object p1, p0, Lk71/w;->P:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p17

    iput p1, p0, Lk71/w;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lk71/w;->R:I

    move/from16 p1, p19

    iput p1, p0, Lk71/w;->S:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v20, p1

    check-cast v20, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v21

    iget-object v1, v0, Lk71/w;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lk71/w;->x:Ly81/e;

    iget-object v3, v0, Lk71/w;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lk71/w;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lk71/w;->E:Ly81/e;

    iget-object v6, v0, Lk71/w;->F:Lcom/whoop/design/util/TextResource;

    iget-object v7, v0, Lk71/w;->G:Ly71/g;

    iget-object v8, v0, Lk71/w;->H:Lkd1/l;

    iget v9, v0, Lk71/w;->I:F

    iget-object v10, v0, Lk71/w;->J:Lm91/u;

    iget-object v11, v0, Lk71/w;->K:Lcom/whoop/design/util/TextResource;

    iget-object v12, v0, Lk71/w;->L:Lcom/whoop/design/util/TextResource;

    iget-boolean v13, v0, Lk71/w;->M:Z

    iget-object v14, v0, Lk71/w;->N:Ljava/util/List;

    iget-object v15, v0, Lk71/w;->O:Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v1

    iget-object v1, v0, Lk71/w;->P:Lkotlin/jvm/functions/Function1;

    move-object/from16 v17, v1

    iget v1, v0, Lk71/w;->Q:I

    move/from16 v18, v1

    iget v1, v0, Lk71/w;->R:I

    move/from16 v19, v1

    iget v1, v0, Lk71/w;->S:I

    move/from16 v22, v19

    move/from16 v19, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v22

    invoke-static/range {v1 .. v21}, Lk71/z;->b(Landroidx/compose/ui/Modifier;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly71/g;Lkd1/l;FLm91/u;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
