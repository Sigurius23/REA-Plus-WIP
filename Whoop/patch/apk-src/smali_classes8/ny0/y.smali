.class public final synthetic Lny0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:Lv41/r0;

.field public final synthetic G:Ljava/lang/Integer;

.field public final synthetic H:Landroidx/compose/ui/Modifier;

.field public final synthetic I:Lcom/whoop/design/util/TextResource;

.field public final synthetic J:Lg1/u0;

.field public final synthetic K:Li2/t;

.field public final synthetic L:Lf0/t;

.field public final synthetic M:Lb91/a;

.field public final synthetic N:F

.field public final synthetic O:Ll0/k1;

.field public final synthetic P:Lc93/a;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;Lb91/a;FLl0/k1;Lc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/y;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lny0/y;->x:Z

    iput-boolean p3, p0, Lny0/y;->y:Z

    iput-object p4, p0, Lny0/y;->z:Ljava/lang/Integer;

    iput-object p5, p0, Lny0/y;->E:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Lny0/y;->F:Lv41/r0;

    iput-object p7, p0, Lny0/y;->G:Ljava/lang/Integer;

    iput-object p8, p0, Lny0/y;->H:Landroidx/compose/ui/Modifier;

    iput-object p9, p0, Lny0/y;->I:Lcom/whoop/design/util/TextResource;

    iput-object p10, p0, Lny0/y;->J:Lg1/u0;

    iput-object p11, p0, Lny0/y;->K:Li2/t;

    iput-object p12, p0, Lny0/y;->L:Lf0/t;

    iput-object p13, p0, Lny0/y;->M:Lb91/a;

    iput p14, p0, Lny0/y;->N:F

    iput-object p15, p0, Lny0/y;->O:Ll0/k1;

    move-object/from16 p1, p16

    iput-object p1, p0, Lny0/y;->P:Lc93/a;

    move/from16 p1, p17

    iput p1, p0, Lny0/y;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lny0/y;->R:I

    move/from16 p1, p19

    iput p1, p0, Lny0/y;->S:I

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

    iget-object v1, v0, Lny0/y;->w:Landroidx/compose/ui/Modifier;

    iget-boolean v2, v0, Lny0/y;->x:Z

    iget-boolean v3, v0, Lny0/y;->y:Z

    iget-object v4, v0, Lny0/y;->z:Ljava/lang/Integer;

    iget-object v5, v0, Lny0/y;->E:Landroidx/compose/ui/Modifier;

    iget-object v6, v0, Lny0/y;->F:Lv41/r0;

    iget-object v7, v0, Lny0/y;->G:Ljava/lang/Integer;

    iget-object v8, v0, Lny0/y;->H:Landroidx/compose/ui/Modifier;

    iget-object v9, v0, Lny0/y;->I:Lcom/whoop/design/util/TextResource;

    iget-object v10, v0, Lny0/y;->J:Lg1/u0;

    iget-object v11, v0, Lny0/y;->K:Li2/t;

    iget-object v12, v0, Lny0/y;->L:Lf0/t;

    iget-object v13, v0, Lny0/y;->M:Lb91/a;

    iget v14, v0, Lny0/y;->N:F

    iget-object v15, v0, Lny0/y;->O:Ll0/k1;

    move-object/from16 v16, v1

    iget-object v1, v0, Lny0/y;->P:Lc93/a;

    move-object/from16 v17, v1

    iget v1, v0, Lny0/y;->Q:I

    move/from16 v18, v1

    iget v1, v0, Lny0/y;->R:I

    move/from16 v19, v1

    iget v1, v0, Lny0/y;->S:I

    move/from16 v22, v19

    move/from16 v19, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v22

    invoke-static/range {v1 .. v21}, Lny0/z;->c(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;Lb91/a;FLl0/k1;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
