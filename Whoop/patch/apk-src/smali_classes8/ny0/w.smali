.class public final synthetic Lny0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:Lv41/r0;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Lg1/u0;

.field public final synthetic I:Li2/t;

.field public final synthetic J:Lf0/t;

.field public final synthetic K:F

.field public final synthetic L:Ll0/k1;

.field public final synthetic M:Lb91/a;

.field public final synthetic N:Lc93/a;

.field public final synthetic O:I

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/w;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lny0/w;->x:Z

    iput-boolean p3, p0, Lny0/w;->y:Z

    iput-object p4, p0, Lny0/w;->z:Ljava/lang/Integer;

    iput-object p5, p0, Lny0/w;->E:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Lny0/w;->F:Lv41/r0;

    iput-object p7, p0, Lny0/w;->G:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lny0/w;->H:Lg1/u0;

    iput-object p9, p0, Lny0/w;->I:Li2/t;

    iput-object p10, p0, Lny0/w;->J:Lf0/t;

    iput p11, p0, Lny0/w;->K:F

    iput-object p12, p0, Lny0/w;->L:Ll0/k1;

    iput-object p13, p0, Lny0/w;->M:Lb91/a;

    iput-object p14, p0, Lny0/w;->N:Lc93/a;

    iput p15, p0, Lny0/w;->O:I

    move/from16 p1, p16

    iput p1, p0, Lny0/w;->P:I

    move/from16 p1, p17

    iput p1, p0, Lny0/w;->Q:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v19

    iget-object v1, v0, Lny0/w;->w:Landroidx/compose/ui/Modifier;

    iget-boolean v2, v0, Lny0/w;->x:Z

    iget-boolean v3, v0, Lny0/w;->y:Z

    iget-object v4, v0, Lny0/w;->z:Ljava/lang/Integer;

    iget-object v5, v0, Lny0/w;->E:Landroidx/compose/ui/Modifier;

    iget-object v6, v0, Lny0/w;->F:Lv41/r0;

    iget-object v7, v0, Lny0/w;->G:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lny0/w;->H:Lg1/u0;

    iget-object v9, v0, Lny0/w;->I:Li2/t;

    iget-object v10, v0, Lny0/w;->J:Lf0/t;

    iget v11, v0, Lny0/w;->K:F

    iget-object v12, v0, Lny0/w;->L:Ll0/k1;

    iget-object v13, v0, Lny0/w;->M:Lb91/a;

    iget-object v14, v0, Lny0/w;->N:Lc93/a;

    iget v15, v0, Lny0/w;->O:I

    move-object/from16 v16, v1

    iget v1, v0, Lny0/w;->P:I

    move/from16 v17, v1

    iget v1, v0, Lny0/w;->Q:I

    move/from16 v20, v17

    move/from16 v17, v1

    move-object/from16 v1, v16

    move/from16 v16, v20

    invoke-static/range {v1 .. v19}, Lny0/z;->a(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
