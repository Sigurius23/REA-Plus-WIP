.class public final synthetic Lh51/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly71/g;

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Ljava/util/List;

.field public final synthetic I:Lb2/f;

.field public final synthetic J:Lkotlin/jvm/functions/Function3;

.field public final synthetic K:Ly81/e;

.field public final synthetic L:Li91/a;

.field public final synthetic M:Lkd1/o;

.field public final synthetic N:Lkotlin/jvm/functions/Function1;

.field public final synthetic O:Lc93/a;

.field public final synthetic P:Z

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Li91/a;

.field public final synthetic y:Lb91/c;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Lb2/f;Lkotlin/jvm/functions/Function3;Ly81/e;Li91/a;Lkd1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ZIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh51/c;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lh51/c;->x:Li91/a;

    iput-object p3, p0, Lh51/c;->y:Lb91/c;

    iput-object p4, p0, Lh51/c;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lh51/c;->E:Ly71/g;

    iput-boolean p6, p0, Lh51/c;->F:Z

    iput-boolean p7, p0, Lh51/c;->G:Z

    iput-object p8, p0, Lh51/c;->H:Ljava/util/List;

    iput-object p9, p0, Lh51/c;->I:Lb2/f;

    iput-object p10, p0, Lh51/c;->J:Lkotlin/jvm/functions/Function3;

    iput-object p11, p0, Lh51/c;->K:Ly81/e;

    iput-object p12, p0, Lh51/c;->L:Li91/a;

    iput-object p13, p0, Lh51/c;->M:Lkd1/o;

    iput-object p14, p0, Lh51/c;->N:Lkotlin/jvm/functions/Function1;

    iput-object p15, p0, Lh51/c;->O:Lc93/a;

    move/from16 p1, p16

    iput-boolean p1, p0, Lh51/c;->P:Z

    move/from16 p1, p17

    iput p1, p0, Lh51/c;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lh51/c;->R:I

    move/from16 p1, p19

    iput p1, p0, Lh51/c;->S:I

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

    iget-object v1, v0, Lh51/c;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lh51/c;->x:Li91/a;

    iget-object v3, v0, Lh51/c;->y:Lb91/c;

    iget-object v4, v0, Lh51/c;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lh51/c;->E:Ly71/g;

    iget-boolean v6, v0, Lh51/c;->F:Z

    iget-boolean v7, v0, Lh51/c;->G:Z

    iget-object v8, v0, Lh51/c;->H:Ljava/util/List;

    iget-object v9, v0, Lh51/c;->I:Lb2/f;

    iget-object v10, v0, Lh51/c;->J:Lkotlin/jvm/functions/Function3;

    iget-object v11, v0, Lh51/c;->K:Ly81/e;

    iget-object v12, v0, Lh51/c;->L:Li91/a;

    iget-object v13, v0, Lh51/c;->M:Lkd1/o;

    iget-object v14, v0, Lh51/c;->N:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lh51/c;->O:Lc93/a;

    move-object/from16 v16, v1

    iget-boolean v1, v0, Lh51/c;->P:Z

    move/from16 v17, v1

    iget v1, v0, Lh51/c;->Q:I

    move/from16 v18, v1

    iget v1, v0, Lh51/c;->R:I

    move/from16 v19, v1

    iget v1, v0, Lh51/c;->S:I

    move/from16 v22, v19

    move/from16 v19, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v22

    invoke-static/range {v1 .. v21}, Lh51/d;->k(Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Lb2/f;Lkotlin/jvm/functions/Function3;Ly81/e;Li91/a;Lkd1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ZIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
