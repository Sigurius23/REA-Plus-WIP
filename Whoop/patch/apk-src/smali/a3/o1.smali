.class public final La3/o1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/node/NodeCoordinator;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/node/NodeCoordinator;I)V
    .locals 0

    iput p2, p0, La3/o1;->w:I

    iput-object p1, p0, La3/o1;->x:Landroidx/compose/ui/node/NodeCoordinator;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La3/o1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/o1;->x:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La3/o1;->x:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->e0:Li2/v;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->d0:Ll2/c;

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/node/NodeCoordinator;->a1(Li2/v;Ll2/c;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
