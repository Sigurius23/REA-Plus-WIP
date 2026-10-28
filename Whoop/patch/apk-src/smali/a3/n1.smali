.class public final La3/n1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La3/n1;->w:I

    iput-object p2, p0, La3/n1;->x:Ljava/lang/Object;

    iput-object p3, p0, La3/n1;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Lc93/m;I)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, La3/n1;->w:I

    .line 2
    iput-object p1, p0, La3/n1;->x:Ljava/lang/Object;

    iput-object p2, p0, La3/n1;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, La3/n1;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iget-object v5, p0, La3/n1;->y:Ljava/lang/Object;

    iget-object v6, p0, La3/n1;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast v6, Leb/q;

    and-int/lit8 p2, p2, 0x3

    if-ne p2, v2, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p2, v6, Leb/q;->x:Leb/n0;

    const-string v0, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lgb/h;

    iget-object p2, p2, Lgb/h;->L:Lc93/n;

    check-cast v5, Lc0/o;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v5, v6, p1, v0}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-object v4

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    if-ne p2, v2, :cond_3

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    check-cast v6, Ly1/c;

    check-cast v5, Lx1/b;

    invoke-static {v6, v5, p1, v3}, Ldt/b;->e(Ly1/c;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    return-object v4

    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Li3/p;

    check-cast v5, Ld2/d;

    check-cast v6, Lb3/w2;

    iget-object v0, v6, Lb3/w2;->b:La0/h0;

    iget v1, p2, Li3/p;->g:I

    invoke-virtual {v0, v1}, La0/h0;->b(I)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v5, p1, p2}, Ld2/d;->l(ILi3/p;)V

    iget-object p1, v5, Ld2/d;->H:Ldc3/h;

    invoke-interface {p1, v4}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v4

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    check-cast v6, Landroidx/compose/ui/platform/AndroidComposeView;

    check-cast v5, Lc93/m;

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, p1, p2}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a(Landroidx/compose/ui/platform/AndroidComposeView;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    return-object v4

    :pswitch_3
    check-cast p1, Li2/v;

    check-cast p2, Ll2/c;

    check-cast v6, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v6, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->Y()Z

    move-result v2

    if-eqz v2, :cond_5

    iput-object p1, v6, Landroidx/compose/ui/node/NodeCoordinator;->e0:Li2/v;

    iput-object p2, v6, Landroidx/compose/ui/node/NodeCoordinator;->d0:Ll2/c;

    invoke-static {v0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p1

    invoke-interface {p1}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object p1

    sget-object p2, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    sget-object p2, La3/f;->z:La3/f;

    check-cast v5, La3/o1;

    invoke-virtual {p1, v6, p2, v5}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    iput-boolean v3, v6, Landroidx/compose/ui/node/NodeCoordinator;->h0:Z

    goto :goto_4

    :cond_5
    iput-boolean v1, v6, Landroidx/compose/ui/node/NodeCoordinator;->h0:Z

    :goto_4
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
