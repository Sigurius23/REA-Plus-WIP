.class public final synthetic Lt71/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:J

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(IJLcom/whoop/design/util/TextResource;JJII)V
    .locals 0

    iput p10, p0, Lt71/l;->w:I

    iput p1, p0, Lt71/l;->x:I

    iput-wide p2, p0, Lt71/l;->y:J

    iput-object p4, p0, Lt71/l;->z:Lcom/whoop/design/util/TextResource;

    iput-wide p5, p0, Lt71/l;->E:J

    iput-wide p7, p0, Lt71/l;->F:J

    iput p9, p0, Lt71/l;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lt71/l;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v1, p0, Lt71/l;->x:I

    iget-wide v2, p0, Lt71/l;->y:J

    iget-object v4, p0, Lt71/l;->z:Lcom/whoop/design/util/TextResource;

    iget-wide v5, p0, Lt71/l;->E:J

    iget-wide v7, p0, Lt71/l;->F:J

    iget v9, p0, Lt71/l;->G:I

    invoke-static/range {v1 .. v11}, Lt71/m;->a(IJLcom/whoop/design/util/TextResource;JJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v0, p0, Lt71/l;->x:I

    iget-wide v1, p0, Lt71/l;->y:J

    iget-object v3, p0, Lt71/l;->z:Lcom/whoop/design/util/TextResource;

    iget-wide v4, p0, Lt71/l;->E:J

    iget-wide v6, p0, Lt71/l;->F:J

    iget v8, p0, Lt71/l;->G:I

    invoke-static/range {v0 .. v10}, Lt71/m;->d(IJLcom/whoop/design/util/TextResource;JJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
