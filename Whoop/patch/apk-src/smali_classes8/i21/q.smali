.class public final synthetic Li21/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:J

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p14, p0, Li21/q;->w:I

    iput-object p1, p0, Li21/q;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Li21/q;->y:Lcom/whoop/design/util/TextResource;

    iput-wide p3, p0, Li21/q;->z:J

    iput-object p5, p0, Li21/q;->E:Lcom/whoop/design/util/TextResource;

    iput-wide p6, p0, Li21/q;->F:J

    iput-object p8, p0, Li21/q;->G:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Li21/q;->K:Ljava/lang/Object;

    iput-object p10, p0, Li21/q;->L:Ljava/lang/Object;

    iput-object p11, p0, Li21/q;->H:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Li21/q;->I:I

    iput p13, p0, Li21/q;->J:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Li21/q;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Li21/q;->K:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Ly11/r;

    iget-object v1, v0, Li21/q;->L:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lt71/g$b;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v2, v0, Li21/q;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Li21/q;->y:Lcom/whoop/design/util/TextResource;

    iget-wide v4, v0, Li21/q;->z:J

    iget-object v6, v0, Li21/q;->E:Lcom/whoop/design/util/TextResource;

    iget-wide v7, v0, Li21/q;->F:J

    iget-object v9, v0, Li21/q;->G:Lcom/whoop/design/util/TextResource;

    iget-object v12, v0, Li21/q;->H:Lkotlin/jvm/functions/Function1;

    iget v13, v0, Li21/q;->I:I

    iget v14, v0, Li21/q;->J:I

    invoke-static/range {v2 .. v16}, Li21/t;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ly11/r;Lt71/g$b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Li21/q;->K:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lt71/g$a;

    iget-object v1, v0, Li21/q;->L:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Ljava/util/List;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v2, v0, Li21/q;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Li21/q;->y:Lcom/whoop/design/util/TextResource;

    iget-wide v4, v0, Li21/q;->z:J

    iget-object v6, v0, Li21/q;->E:Lcom/whoop/design/util/TextResource;

    iget-wide v7, v0, Li21/q;->F:J

    iget-object v9, v0, Li21/q;->G:Lcom/whoop/design/util/TextResource;

    iget-object v12, v0, Li21/q;->H:Lkotlin/jvm/functions/Function1;

    iget v13, v0, Li21/q;->I:I

    iget v14, v0, Li21/q;->J:I

    invoke-static/range {v2 .. v16}, Li21/s;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lt71/g$a;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
