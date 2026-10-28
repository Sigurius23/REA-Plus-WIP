.class public final synthetic Lc41/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIIJLjava/lang/Object;)V
    .locals 0

    iput p3, p0, Lc41/l1;->w:I

    iput-object p6, p0, Lc41/l1;->E:Ljava/lang/Object;

    iput-wide p4, p0, Lc41/l1;->x:J

    iput p1, p0, Lc41/l1;->y:I

    iput p2, p0, Lc41/l1;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lc41/l1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/l1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v2, p0, Lc41/l1;->x:J

    iget v4, p0, Lc41/l1;->y:I

    iget v5, p0, Lc41/l1;->z:I

    invoke-static/range {v1 .. v7}, Lvo1/x;->c(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/l1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v2, p0, Lc41/l1;->x:J

    iget v4, p0, Lc41/l1;->y:I

    iget v5, p0, Lc41/l1;->z:I

    invoke-static/range {v1 .. v7}, Lc41/m1;->a(Lcom/whoop/design/util/TextResource;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
