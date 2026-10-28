.class public final synthetic Lc01/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    .line 1
    iput p3, p0, Lc01/d;->w:I

    iput-object p5, p0, Lc01/d;->x:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lc01/d;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lc01/d;->z:Landroidx/compose/ui/Modifier;

    iput p1, p0, Lc01/d;->E:I

    iput p2, p0, Lc01/d;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lc01/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc01/d;->z:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc01/d;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lc01/d;->y:Lcom/whoop/design/util/TextResource;

    iput p4, p0, Lc01/d;->E:I

    iput p5, p0, Lc01/d;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lc01/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lc01/d;->z:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lc01/d;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lc01/d;->y:Lcom/whoop/design/util/TextResource;

    iget v4, p0, Lc01/d;->E:I

    iget v5, p0, Lc01/d;->F:I

    invoke-static/range {v1 .. v7}, Lqs1/a;->h(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lc01/d;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc01/d;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lc01/d;->y:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lc01/d;->E:I

    iget v4, p0, Lc01/d;->F:I

    invoke-static/range {v0 .. v6}, Lgz2/e;->a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lc01/d;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc01/d;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lc01/d;->y:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lc01/d;->E:I

    iget v4, p0, Lc01/d;->F:I

    invoke-static/range {v0 .. v6}, Lc41/e0;->a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lc01/d;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc01/d;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lc01/d;->y:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lc01/d;->E:I

    iget v4, p0, Lc01/d;->F:I

    invoke-static/range {v0 .. v6}, Lc01/e;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
