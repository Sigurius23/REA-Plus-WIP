.class public final synthetic Li11/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic N:Ljava/lang/Object;

.field public final synthetic O:Ljava/lang/Object;

.field public final synthetic P:Ljava/lang/Object;

.field public final synthetic Q:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;III)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Li11/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li11/b;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Li11/b;->K:Ljava/lang/Object;

    iput-object p3, p0, Li11/b;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Li11/b;->L:Ljava/lang/Object;

    iput-object p5, p0, Li11/b;->M:Ljava/lang/Object;

    iput-boolean p6, p0, Li11/b;->z:Z

    iput-object p7, p0, Li11/b;->N:Ljava/lang/Object;

    iput-object p8, p0, Li11/b;->O:Ljava/lang/Object;

    iput-boolean p9, p0, Li11/b;->E:Z

    iput-boolean p10, p0, Li11/b;->F:Z

    iput-object p11, p0, Li11/b;->P:Ljava/lang/Object;

    iput-object p12, p0, Li11/b;->Q:Ljava/lang/Object;

    iput-object p13, p0, Li11/b;->G:Lkotlin/jvm/functions/Function1;

    iput p14, p0, Li11/b;->H:I

    move/from16 p1, p15

    iput p1, p0, Li11/b;->I:I

    move/from16 p1, p16

    iput p1, p0, Li11/b;->J:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;III)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Li11/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li11/b;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Li11/b;->z:Z

    iput-object p3, p0, Li11/b;->K:Ljava/lang/Object;

    iput-object p4, p0, Li11/b;->y:Lcom/whoop/design/util/TextResource;

    iput-boolean p5, p0, Li11/b;->E:Z

    iput-boolean p6, p0, Li11/b;->F:Z

    iput-object p7, p0, Li11/b;->L:Ljava/lang/Object;

    iput-object p8, p0, Li11/b;->M:Ljava/lang/Object;

    iput-object p9, p0, Li11/b;->N:Ljava/lang/Object;

    iput-object p10, p0, Li11/b;->O:Ljava/lang/Object;

    iput-object p11, p0, Li11/b;->P:Ljava/lang/Object;

    iput-object p12, p0, Li11/b;->Q:Ljava/lang/Object;

    iput-object p13, p0, Li11/b;->G:Lkotlin/jvm/functions/Function1;

    iput p14, p0, Li11/b;->H:I

    move/from16 p1, p15

    iput p1, p0, Li11/b;->I:I

    move/from16 p1, p16

    iput p1, p0, Li11/b;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Li11/b;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Li11/b;->K:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lny0/n0;

    iget-object v1, v0, Li11/b;->L:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ly71/g;

    iget-object v1, v0, Li11/b;->M:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ly71/g;

    iget-object v1, v0, Li11/b;->N:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ly81/e;

    iget-object v1, v0, Li11/b;->O:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lj91/b;

    iget-object v1, v0, Li11/b;->P:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Ljava/lang/Float;

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v19

    iget-object v2, v0, Li11/b;->x:Landroidx/compose/ui/Modifier;

    iget-object v4, v0, Li11/b;->y:Lcom/whoop/design/util/TextResource;

    iget-boolean v7, v0, Li11/b;->z:Z

    iget-boolean v10, v0, Li11/b;->E:Z

    iget-boolean v11, v0, Li11/b;->F:Z

    iget-object v13, v0, Li11/b;->Q:Ljava/lang/Object;

    iget-object v14, v0, Li11/b;->G:Lkotlin/jvm/functions/Function1;

    iget v15, v0, Li11/b;->H:I

    iget v1, v0, Li11/b;->I:I

    move/from16 v16, v1

    iget v1, v0, Li11/b;->J:I

    move/from16 v17, v1

    invoke-static/range {v2 .. v19}, Lny0/l0;->d(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Li11/b;->K:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ll0/i;

    iget-object v1, v0, Li11/b;->L:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    iget-object v1, v0, Li11/b;->M:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    iget-object v1, v0, Li11/b;->N:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v1, v0, Li11/b;->O:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v1, v0, Li11/b;->P:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v1, v0, Li11/b;->Q:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Li11/g;

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v19

    iget-object v2, v0, Li11/b;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v3, v0, Li11/b;->z:Z

    iget-object v5, v0, Li11/b;->y:Lcom/whoop/design/util/TextResource;

    iget-boolean v6, v0, Li11/b;->E:Z

    iget-boolean v7, v0, Li11/b;->F:Z

    iget-object v14, v0, Li11/b;->G:Lkotlin/jvm/functions/Function1;

    iget v15, v0, Li11/b;->H:I

    iget v1, v0, Li11/b;->I:I

    move/from16 v16, v1

    iget v1, v0, Li11/b;->J:I

    move/from16 v17, v1

    invoke-static/range {v2 .. v19}, Li11/e;->e(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
