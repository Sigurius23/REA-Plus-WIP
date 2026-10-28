.class public final synthetic Lk71/r;
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

.field public final synthetic K:Ly3/m;

.field public final synthetic L:Z

.field public final synthetic M:Ljava/util/List;

.field public final synthetic N:Lkotlin/jvm/functions/Function1;

.field public final synthetic O:Lkotlin/jvm/functions/Function1;

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly71/g;Lkd1/l;FLm91/u;Ly3/m;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk71/r;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lk71/r;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lk71/r;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lk71/r;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lk71/r;->E:Ly81/e;

    iput-object p6, p0, Lk71/r;->F:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lk71/r;->G:Ly71/g;

    iput-object p8, p0, Lk71/r;->H:Lkd1/l;

    iput p9, p0, Lk71/r;->I:F

    iput-object p10, p0, Lk71/r;->J:Lm91/u;

    iput-object p11, p0, Lk71/r;->K:Ly3/m;

    iput-boolean p12, p0, Lk71/r;->L:Z

    iput-object p13, p0, Lk71/r;->M:Ljava/util/List;

    iput-object p14, p0, Lk71/r;->N:Lkotlin/jvm/functions/Function1;

    iput-object p15, p0, Lk71/r;->O:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p16

    iput p1, p0, Lk71/r;->P:I

    move/from16 p1, p17

    iput p1, p0, Lk71/r;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lk71/r;->R:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v20

    iget-object v1, v0, Lk71/r;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lk71/r;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lk71/r;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lk71/r;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lk71/r;->E:Ly81/e;

    iget-object v6, v0, Lk71/r;->F:Lcom/whoop/design/util/TextResource;

    iget-object v7, v0, Lk71/r;->G:Ly71/g;

    iget-object v8, v0, Lk71/r;->H:Lkd1/l;

    iget v9, v0, Lk71/r;->I:F

    iget-object v10, v0, Lk71/r;->J:Lm91/u;

    iget-object v11, v0, Lk71/r;->K:Ly3/m;

    iget-boolean v12, v0, Lk71/r;->L:Z

    iget-object v13, v0, Lk71/r;->M:Ljava/util/List;

    iget-object v14, v0, Lk71/r;->N:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lk71/r;->O:Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v1

    iget v1, v0, Lk71/r;->P:I

    move/from16 v17, v1

    iget v1, v0, Lk71/r;->Q:I

    move/from16 v18, v1

    iget v1, v0, Lk71/r;->R:I

    move/from16 v21, v18

    move/from16 v18, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v21

    invoke-static/range {v1 .. v20}, Lk71/z;->r(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly71/g;Lkd1/l;FLm91/u;Ly3/m;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
