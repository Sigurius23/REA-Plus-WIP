.class public final synthetic Lz51/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll83/k;

.field public final synthetic F:F

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Lz51/k;

.field public final synthetic I:Lcom/whoop/design/util/TextResource;

.field public final synthetic J:F

.field public final synthetic K:Lcom/whoop/design/util/TextResource;

.field public final synthetic L:F

.field public final synthetic M:Lcom/whoop/design/util/TextResource;

.field public final synthetic N:Z

.field public final synthetic O:Lc93/a;

.field public final synthetic P:Lkotlin/jvm/functions/Function1;

.field public final synthetic Q:Lcom/whoop/design/util/TextResource;

.field public final synthetic R:Lz51/a;

.field public final synthetic S:Lz51/a;

.field public final synthetic T:I

.field public final synthetic U:I

.field public final synthetic V:I

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(ZZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLc93/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lz51/a;Lz51/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lz51/g;->w:Z

    iput-boolean p2, p0, Lz51/g;->x:Z

    iput-boolean p3, p0, Lz51/g;->y:Z

    iput p4, p0, Lz51/g;->z:F

    iput-object p5, p0, Lz51/g;->E:Ll83/k;

    iput p6, p0, Lz51/g;->F:F

    iput-object p7, p0, Lz51/g;->G:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lz51/g;->H:Lz51/k;

    iput-object p9, p0, Lz51/g;->I:Lcom/whoop/design/util/TextResource;

    iput p10, p0, Lz51/g;->J:F

    iput-object p11, p0, Lz51/g;->K:Lcom/whoop/design/util/TextResource;

    iput p12, p0, Lz51/g;->L:F

    iput-object p13, p0, Lz51/g;->M:Lcom/whoop/design/util/TextResource;

    iput-boolean p14, p0, Lz51/g;->N:Z

    iput-object p15, p0, Lz51/g;->O:Lc93/a;

    move-object/from16 p1, p16

    iput-object p1, p0, Lz51/g;->P:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p17

    iput-object p1, p0, Lz51/g;->Q:Lcom/whoop/design/util/TextResource;

    move-object/from16 p1, p18

    iput-object p1, p0, Lz51/g;->R:Lz51/a;

    move-object/from16 p1, p19

    iput-object p1, p0, Lz51/g;->S:Lz51/a;

    move/from16 p1, p20

    iput p1, p0, Lz51/g;->T:I

    move/from16 p1, p21

    iput p1, p0, Lz51/g;->U:I

    move/from16 p1, p22

    iput p1, p0, Lz51/g;->V:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v23, p1

    check-cast v23, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v24

    iget-boolean v1, v0, Lz51/g;->w:Z

    iget-boolean v2, v0, Lz51/g;->x:Z

    iget-boolean v3, v0, Lz51/g;->y:Z

    iget v4, v0, Lz51/g;->z:F

    iget-object v5, v0, Lz51/g;->E:Ll83/k;

    iget v6, v0, Lz51/g;->F:F

    iget-object v7, v0, Lz51/g;->G:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lz51/g;->H:Lz51/k;

    iget-object v9, v0, Lz51/g;->I:Lcom/whoop/design/util/TextResource;

    iget v10, v0, Lz51/g;->J:F

    iget-object v11, v0, Lz51/g;->K:Lcom/whoop/design/util/TextResource;

    iget v12, v0, Lz51/g;->L:F

    iget-object v13, v0, Lz51/g;->M:Lcom/whoop/design/util/TextResource;

    iget-boolean v14, v0, Lz51/g;->N:Z

    iget-object v15, v0, Lz51/g;->O:Lc93/a;

    move/from16 v16, v1

    iget-object v1, v0, Lz51/g;->P:Lkotlin/jvm/functions/Function1;

    move-object/from16 v17, v1

    iget-object v1, v0, Lz51/g;->Q:Lcom/whoop/design/util/TextResource;

    move-object/from16 v18, v1

    iget-object v1, v0, Lz51/g;->R:Lz51/a;

    move-object/from16 v19, v1

    iget-object v1, v0, Lz51/g;->S:Lz51/a;

    move-object/from16 v20, v1

    iget v1, v0, Lz51/g;->T:I

    move/from16 v21, v1

    iget v1, v0, Lz51/g;->U:I

    move/from16 v22, v1

    iget v1, v0, Lz51/g;->V:I

    move/from16 v25, v22

    move/from16 v22, v1

    move/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move/from16 v20, v21

    move/from16 v21, v25

    invoke-static/range {v1 .. v24}, Lz51/h;->l(ZZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLc93/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lz51/a;Lz51/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
