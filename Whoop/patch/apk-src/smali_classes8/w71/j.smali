.class public final synthetic Lw71/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Integer;

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:I

.field public final synthetic x:Lw71/l;

.field public final synthetic y:Lw71/y;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lw71/l;Lw71/y;IIILjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p11, p0, Lw71/j;->w:I

    iput-object p1, p0, Lw71/j;->x:Lw71/l;

    iput-object p2, p0, Lw71/j;->y:Lw71/y;

    iput p3, p0, Lw71/j;->z:I

    iput p4, p0, Lw71/j;->E:I

    iput p5, p0, Lw71/j;->F:I

    iput-object p6, p0, Lw71/j;->G:Ljava/lang/Integer;

    iput-object p7, p0, Lw71/j;->H:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lw71/j;->I:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lw71/j;->J:I

    iput p10, p0, Lw71/j;->K:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lw71/j;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v1, p0, Lw71/j;->x:Lw71/l;

    iget-object v2, p0, Lw71/j;->y:Lw71/y;

    iget v3, p0, Lw71/j;->z:I

    iget v4, p0, Lw71/j;->E:I

    iget v5, p0, Lw71/j;->F:I

    iget-object v6, p0, Lw71/j;->G:Ljava/lang/Integer;

    iget-object v7, p0, Lw71/j;->H:Lcom/whoop/design/util/TextResource;

    iget-object v8, p0, Lw71/j;->I:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lw71/j;->J:I

    iget v10, p0, Lw71/j;->K:I

    invoke-static/range {v1 .. v12}, Lw71/l;->q(Lw71/l;Lw71/y;IIILjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lw71/j;->x:Lw71/l;

    iget-object v1, p0, Lw71/j;->y:Lw71/y;

    iget v2, p0, Lw71/j;->z:I

    iget v3, p0, Lw71/j;->E:I

    iget v4, p0, Lw71/j;->F:I

    iget-object v5, p0, Lw71/j;->G:Ljava/lang/Integer;

    iget-object v6, p0, Lw71/j;->H:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Lw71/j;->I:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lw71/j;->J:I

    iget v9, p0, Lw71/j;->K:I

    invoke-static/range {v0 .. v11}, Lw71/l;->t(Lw71/l;Lw71/y;IIILjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
