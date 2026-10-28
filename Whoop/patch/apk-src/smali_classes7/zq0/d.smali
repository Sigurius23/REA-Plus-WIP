.class public final synthetic Lzq0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lcom/whoop/navigation/models/GenericInteraction;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lp1/a1;

.field public final synthetic J:Lf0/r1;

.field public final synthetic K:Z

.field public final synthetic L:Ljava/util/List;

.field public final synthetic M:F

.field public final synthetic N:F

.field public final synthetic O:Z

.field public final synthetic P:F

.field public final synthetic Q:Lp1/c1;

.field public final synthetic R:Lp1/c1;

.field public final synthetic w:Ly3/c;

.field public final synthetic x:Lzq0/l;

.field public final synthetic y:F

.field public final synthetic z:Lzq0/p;


# direct methods
.method public synthetic constructor <init>(Ly3/c;Lzq0/l;FLzq0/p;FLcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/a1;Lf0/r1;ZLjava/util/List;FFZFLp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzq0/d;->w:Ly3/c;

    iput-object p2, p0, Lzq0/d;->x:Lzq0/l;

    iput p3, p0, Lzq0/d;->y:F

    iput-object p4, p0, Lzq0/d;->z:Lzq0/p;

    iput p5, p0, Lzq0/d;->E:F

    iput-object p6, p0, Lzq0/d;->F:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p7, p0, Lzq0/d;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lzq0/d;->H:Lc93/a;

    iput-object p9, p0, Lzq0/d;->I:Lp1/a1;

    iput-object p10, p0, Lzq0/d;->J:Lf0/r1;

    iput-boolean p11, p0, Lzq0/d;->K:Z

    iput-object p12, p0, Lzq0/d;->L:Ljava/util/List;

    iput p13, p0, Lzq0/d;->M:F

    iput p14, p0, Lzq0/d;->N:F

    iput-boolean p15, p0, Lzq0/d;->O:Z

    move/from16 p1, p16

    iput p1, p0, Lzq0/d;->P:F

    move-object/from16 p1, p17

    iput-object p1, p0, Lzq0/d;->Q:Lp1/c1;

    move-object/from16 p1, p18

    iput-object p1, p0, Lzq0/d;->R:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v19, p1

    check-cast v19, Ll0/v;

    move-object/from16 v20, p2

    check-cast v20, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v21

    iget-object v1, v0, Lzq0/d;->w:Ly3/c;

    iget-object v2, v0, Lzq0/d;->x:Lzq0/l;

    iget v3, v0, Lzq0/d;->y:F

    iget-object v4, v0, Lzq0/d;->z:Lzq0/p;

    iget v5, v0, Lzq0/d;->E:F

    iget-object v6, v0, Lzq0/d;->F:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v7, v0, Lzq0/d;->G:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lzq0/d;->H:Lc93/a;

    iget-object v9, v0, Lzq0/d;->I:Lp1/a1;

    iget-object v10, v0, Lzq0/d;->J:Lf0/r1;

    iget-boolean v11, v0, Lzq0/d;->K:Z

    iget-object v12, v0, Lzq0/d;->L:Ljava/util/List;

    iget v13, v0, Lzq0/d;->M:F

    iget v14, v0, Lzq0/d;->N:F

    iget-boolean v15, v0, Lzq0/d;->O:Z

    move-object/from16 v16, v1

    iget v1, v0, Lzq0/d;->P:F

    move/from16 v17, v1

    iget-object v1, v0, Lzq0/d;->Q:Lp1/c1;

    move-object/from16 v18, v1

    iget-object v1, v0, Lzq0/d;->R:Lp1/c1;

    move-object/from16 v22, v18

    move-object/from16 v18, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v22

    invoke-static/range {v1 .. v21}, Lzq0/f;->h(Ly3/c;Lzq0/l;FLzq0/p;FLcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/a1;Lf0/r1;ZLjava/util/List;FFZFLp1/c1;Lp1/c1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
