.class public final synthetic Lo11/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Ly81/e;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/util/List;III)V
    .locals 0

    iput p6, p0, Lo11/j;->w:I

    iput-object p1, p0, Lo11/j;->x:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lo11/j;->y:Ly81/e;

    iput-object p3, p0, Lo11/j;->z:Ljava/util/List;

    iput p4, p0, Lo11/j;->E:I

    iput p5, p0, Lo11/j;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lo11/j;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lo11/j;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lo11/j;->y:Ly81/e;

    iget-object v3, p0, Lo11/j;->z:Ljava/util/List;

    iget v4, p0, Lo11/j;->E:I

    iget v5, p0, Lo11/j;->F:I

    invoke-static/range {v1 .. v7}, Lo11/l;->o(Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lo11/j;->x:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lo11/j;->y:Ly81/e;

    iget-object v2, p0, Lo11/j;->z:Ljava/util/List;

    iget v3, p0, Lo11/j;->E:I

    iget v4, p0, Lo11/j;->F:I

    invoke-static/range {v0 .. v6}, Lo11/l;->k(Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
