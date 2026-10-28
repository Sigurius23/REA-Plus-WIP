.class public final Ll0/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll0/e2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ll0/e2;->w:I

    const/4 v1, 0x0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    const v3, 0x15733969

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v3}, Lp1/q;->e0(I)V

    sget-object p1, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {p2}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object p1

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_0

    if-ne v0, v2, :cond_1

    :cond_0
    iget-object p1, p1, Ll0/c2;->g:Ll0/b;

    new-instance v0, Ll0/w0;

    invoke-direct {v0, p1}, Ll0/w0;-><init>(Ll0/b2;)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Ll0/w0;

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v0

    :pswitch_0
    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v3}, Lp1/q;->e0(I)V

    sget-object p1, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {p2}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object p1

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_2

    if-ne v0, v2, :cond_3

    :cond_2
    iget-object p1, p1, Ll0/c2;->k:Ll0/w1;

    new-instance v0, Ll0/w0;

    invoke-direct {v0, p1}, Ll0/w0;-><init>(Ll0/b2;)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Ll0/w0;

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v0

    :pswitch_1
    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v3}, Lp1/q;->e0(I)V

    sget-object p1, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {p2}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object p1

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_4

    if-ne v0, v2, :cond_5

    :cond_4
    iget-object p1, p1, Ll0/c2;->c:Ll0/b;

    new-instance v0, Ll0/w0;

    invoke-direct {v0, p1}, Ll0/w0;-><init>(Ll0/b2;)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Ll0/w0;

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
