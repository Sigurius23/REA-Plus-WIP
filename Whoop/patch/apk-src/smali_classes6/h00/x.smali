.class public final Lh00/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll83/e;

.field public final synthetic y:Ll83/e;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll83/e;Ll83/e;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lh00/x;->w:I

    iput-object p1, p0, Lh00/x;->x:Ll83/e;

    iput-object p2, p0, Lh00/x;->y:Ll83/e;

    iput-object p3, p0, Lh00/x;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh00/x;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/o;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    const/4 p4, 0x0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "$this$AnimatedContent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    check-cast p3, Lp1/q;

    const p1, 0x7bd7de5a

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lh00/x;->x:Ll83/e;

    check-cast p1, Lx1/b;

    invoke-virtual {p1, p3, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3, p4}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    check-cast p3, Lp1/q;

    const p1, 0x7bd8b54b

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lh00/x;->y:Ll83/e;

    check-cast p1, Lx1/b;

    iget-object p2, p0, Lh00/x;->z:Ljava/lang/Object;

    check-cast p2, Ly00/c0;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, p3, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3, p4}, Lp1/q;->q(Z)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    const-string p4, "$this$composable"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lch/t;

    iget-object p2, p0, Lh00/x;->x:Ll83/e;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    iget-object p4, p0, Lh00/x;->y:Ll83/e;

    check-cast p4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh00/x;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x3

    invoke-direct {p1, p2, p4, v0, v1}, Lch/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 p2, 0x36

    const p4, 0x746429ed

    invoke-static {p4, p3, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p1

    const/high16 p4, 0x3f800000    # 1.0f

    invoke-static {p4, p1, p3, p2}, Lvd/e;->f(FLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
