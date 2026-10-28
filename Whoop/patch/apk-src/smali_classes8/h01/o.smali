.class public final synthetic Lh01/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll0/k1;

.field public final synthetic F:Lh01/a;

.field public final synthetic G:Lkd1/l;

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Lkd1/o;

.field public final synthetic J:Lcom/whoop/design/util/TextResource;

.field public final synthetic K:Z

.field public final synthetic L:Z

.field public final synthetic M:Lcom/whoop/navigation/e;

.field public final synthetic N:Z

.field public final synthetic O:Lgz0/m0;

.field public final synthetic P:Lm91/u;

.field public final synthetic Q:Lkotlin/jvm/functions/Function1;

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic T:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/navigation/e;ZLgz0/m0;Lm91/u;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh01/o;->w:Ljava/lang/String;

    iput-object p2, p0, Lh01/o;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lh01/o;->y:Ljava/lang/String;

    iput-boolean p4, p0, Lh01/o;->z:Z

    iput-object p5, p0, Lh01/o;->E:Ll0/k1;

    iput-object p6, p0, Lh01/o;->F:Lh01/a;

    iput-object p7, p0, Lh01/o;->G:Lkd1/l;

    iput-object p8, p0, Lh01/o;->H:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lh01/o;->I:Lkd1/o;

    iput-object p10, p0, Lh01/o;->J:Lcom/whoop/design/util/TextResource;

    iput-boolean p11, p0, Lh01/o;->K:Z

    iput-boolean p12, p0, Lh01/o;->L:Z

    iput-object p13, p0, Lh01/o;->M:Lcom/whoop/navigation/e;

    iput-boolean p14, p0, Lh01/o;->N:Z

    iput-object p15, p0, Lh01/o;->O:Lgz0/m0;

    move-object/from16 p1, p16

    iput-object p1, p0, Lh01/o;->P:Lm91/u;

    move-object/from16 p1, p17

    iput-object p1, p0, Lh01/o;->Q:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p18

    iput p1, p0, Lh01/o;->R:I

    move/from16 p1, p19

    iput p1, p0, Lh01/o;->S:I

    move/from16 p1, p20

    iput p1, p0, Lh01/o;->T:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v21, p1

    check-cast v21, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v22

    iget-object v1, v0, Lh01/o;->w:Ljava/lang/String;

    iget-object v2, v0, Lh01/o;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lh01/o;->y:Ljava/lang/String;

    iget-boolean v4, v0, Lh01/o;->z:Z

    iget-object v5, v0, Lh01/o;->E:Ll0/k1;

    iget-object v6, v0, Lh01/o;->F:Lh01/a;

    iget-object v7, v0, Lh01/o;->G:Lkd1/l;

    iget-object v8, v0, Lh01/o;->H:Lcom/whoop/design/util/TextResource;

    iget-object v9, v0, Lh01/o;->I:Lkd1/o;

    iget-object v10, v0, Lh01/o;->J:Lcom/whoop/design/util/TextResource;

    iget-boolean v11, v0, Lh01/o;->K:Z

    iget-boolean v12, v0, Lh01/o;->L:Z

    iget-object v13, v0, Lh01/o;->M:Lcom/whoop/navigation/e;

    iget-boolean v14, v0, Lh01/o;->N:Z

    iget-object v15, v0, Lh01/o;->O:Lgz0/m0;

    move-object/from16 v16, v1

    iget-object v1, v0, Lh01/o;->P:Lm91/u;

    move-object/from16 v17, v1

    iget-object v1, v0, Lh01/o;->Q:Lkotlin/jvm/functions/Function1;

    move-object/from16 v18, v1

    iget v1, v0, Lh01/o;->R:I

    move/from16 v19, v1

    iget v1, v0, Lh01/o;->S:I

    move/from16 v20, v1

    iget v1, v0, Lh01/o;->T:I

    move/from16 v23, v20

    move/from16 v20, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v23

    invoke-static/range {v1 .. v22}, Lh01/p;->d(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/navigation/e;ZLgz0/m0;Lm91/u;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
