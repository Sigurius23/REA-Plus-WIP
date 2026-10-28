.class public final synthetic Lf41/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lhy0/c2;

.field public final synthetic F:Lf41/b;

.field public final synthetic G:J

.field public final synthetic H:I

.field public final synthetic I:Lcom/whoop/design/util/TextResource;

.field public final synthetic J:Z

.field public final synthetic K:Z

.field public final synthetic L:Z

.field public final synthetic M:Lf41/a;

.field public final synthetic N:Ljava/lang/String;

.field public final synthetic O:Lkotlin/jvm/functions/Function1;

.field public final synthetic P:Lkotlin/jvm/functions/Function3;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lkd1/o;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;Lf41/b;JILcom/whoop/design/util/TextResource;ZZZLf41/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf41/k;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lf41/k;->x:Lkd1/o;

    iput-object p3, p0, Lf41/k;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lf41/k;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lf41/k;->E:Lhy0/c2;

    iput-object p6, p0, Lf41/k;->F:Lf41/b;

    iput-wide p7, p0, Lf41/k;->G:J

    iput p9, p0, Lf41/k;->H:I

    iput-object p10, p0, Lf41/k;->I:Lcom/whoop/design/util/TextResource;

    iput-boolean p11, p0, Lf41/k;->J:Z

    iput-boolean p12, p0, Lf41/k;->K:Z

    iput-boolean p13, p0, Lf41/k;->L:Z

    iput-object p14, p0, Lf41/k;->M:Lf41/a;

    iput-object p15, p0, Lf41/k;->N:Ljava/lang/String;

    move-object/from16 p1, p16

    iput-object p1, p0, Lf41/k;->O:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p17

    iput-object p1, p0, Lf41/k;->P:Lkotlin/jvm/functions/Function3;

    move/from16 p1, p18

    iput p1, p0, Lf41/k;->Q:I

    move/from16 p1, p19

    iput p1, p0, Lf41/k;->R:I

    move/from16 p1, p20

    iput p1, p0, Lf41/k;->S:I

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

    iget-object v1, v0, Lf41/k;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lf41/k;->x:Lkd1/o;

    iget-object v3, v0, Lf41/k;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lf41/k;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lf41/k;->E:Lhy0/c2;

    iget-object v6, v0, Lf41/k;->F:Lf41/b;

    iget-wide v7, v0, Lf41/k;->G:J

    iget v9, v0, Lf41/k;->H:I

    iget-object v10, v0, Lf41/k;->I:Lcom/whoop/design/util/TextResource;

    iget-boolean v11, v0, Lf41/k;->J:Z

    iget-boolean v12, v0, Lf41/k;->K:Z

    iget-boolean v13, v0, Lf41/k;->L:Z

    iget-object v14, v0, Lf41/k;->M:Lf41/a;

    iget-object v15, v0, Lf41/k;->N:Ljava/lang/String;

    move-object/from16 v16, v1

    iget-object v1, v0, Lf41/k;->O:Lkotlin/jvm/functions/Function1;

    move-object/from16 v17, v1

    iget-object v1, v0, Lf41/k;->P:Lkotlin/jvm/functions/Function3;

    move-object/from16 v18, v1

    iget v1, v0, Lf41/k;->Q:I

    move/from16 v19, v1

    iget v1, v0, Lf41/k;->R:I

    move/from16 v20, v1

    iget v1, v0, Lf41/k;->S:I

    move/from16 v23, v20

    move/from16 v20, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v23

    invoke-static/range {v1 .. v22}, Lf41/p;->l(Landroidx/compose/ui/Modifier;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;Lf41/b;JILcom/whoop/design/util/TextResource;ZZZLf41/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
