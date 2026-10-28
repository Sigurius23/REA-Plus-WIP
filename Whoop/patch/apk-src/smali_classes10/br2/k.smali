.class public final synthetic Lbr2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V
    .locals 0

    iput p5, p0, Lbr2/k;->w:I

    iput-object p1, p0, Lbr2/k;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lbr2/k;->y:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lbr2/k;->z:Lcom/whoop/design/util/TextResource;

    iput p4, p0, Lbr2/k;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbr2/k;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lbr2/k;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lbr2/k;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lbr2/k;->z:Lcom/whoop/design/util/TextResource;

    iget v4, p0, Lbr2/k;->E:I

    invoke-static/range {v1 .. v6}, Lz71/m;->a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lbr2/k;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lbr2/k;->y:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lbr2/k;->z:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lbr2/k;->E:I

    invoke-static/range {v0 .. v5}, Lkq2/b;->a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lbr2/k;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lbr2/k;->y:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lbr2/k;->z:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lbr2/k;->E:I

    invoke-static/range {v0 .. v5}, Lbr2/l;->a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
