.class public final synthetic Lbm2/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Ly81/e;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Ly81/e;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;III)V
    .locals 0

    iput p10, p0, Lbm2/i1;->w:I

    iput-object p1, p0, Lbm2/i1;->x:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lbm2/i1;->y:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lbm2/i1;->z:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lbm2/i1;->E:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lbm2/i1;->F:Ly81/e;

    iput-object p6, p0, Lbm2/i1;->G:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lbm2/i1;->H:Ly81/e;

    iput p8, p0, Lbm2/i1;->I:I

    iput p9, p0, Lbm2/i1;->J:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lbm2/i1;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lbm2/i1;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lbm2/i1;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lbm2/i1;->z:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lbm2/i1;->E:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lbm2/i1;->F:Ly81/e;

    iget-object v6, p0, Lbm2/i1;->G:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Lbm2/i1;->H:Ly81/e;

    iget v8, p0, Lbm2/i1;->I:I

    iget v9, p0, Lbm2/i1;->J:I

    invoke-static/range {v1 .. v11}, Lv41/l;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lbm2/i1;->x:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lbm2/i1;->y:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lbm2/i1;->z:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lbm2/i1;->E:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lbm2/i1;->F:Ly81/e;

    iget-object v5, p0, Lbm2/i1;->G:Lcom/whoop/design/util/TextResource;

    iget-object v6, p0, Lbm2/i1;->H:Ly81/e;

    iget v7, p0, Lbm2/i1;->I:I

    iget v8, p0, Lbm2/i1;->J:I

    invoke-static/range {v0 .. v10}, Lbm2/k1;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
