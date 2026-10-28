.class public final synthetic Lxq2/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, Lxq2/j0;->w:I

    iput-object p1, p0, Lxq2/j0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lxq2/j0;->z:Ljava/lang/Object;

    iput p3, p0, Lxq2/j0;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lxq2/j0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxq2/j0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lxq2/j0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/util/TextResource;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lxq2/j0;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lxq2/c1;->m(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxq2/j0;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lxq2/j0;->z:Ljava/lang/Object;

    check-cast v1, Lxq2/x;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lxq2/j0;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lxq2/c1;->p(Landroidx/compose/ui/Modifier;Lxq2/x;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lxq2/j0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lxq2/j0;->z:Ljava/lang/Object;

    check-cast v1, Lm91/p;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lxq2/j0;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lxq2/l0;->j(Ljava/util/List;Lm91/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lxq2/j0;->y:Ljava/lang/Object;

    check-cast v0, Lkd1/o;

    iget-object v1, p0, Lxq2/j0;->z:Ljava/lang/Object;

    check-cast v1, Ls51/i;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lxq2/j0;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lxq2/l0;->b(Lkd1/o;Ls51/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
