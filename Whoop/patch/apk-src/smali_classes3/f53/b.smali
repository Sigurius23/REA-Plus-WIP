.class public final Lf53/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/m;

.field public final synthetic y:Lx43/k;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lx43/k;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lf53/b;->w:I

    packed-switch p4, :pswitch_data_0

    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Lf53/b;->x:Lkotlin/jvm/internal/m;

    iput-object p2, p0, Lf53/b;->y:Lx43/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void

    :pswitch_0
    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Lf53/b;->x:Lkotlin/jvm/internal/m;

    iput-object p2, p0, Lf53/b;->y:Lx43/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lf53/b;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lf53/b;

    iget-object v0, p0, Lf53/b;->y:Lx43/k;

    const/4 v1, 0x1

    iget-object v2, p0, Lf53/b;->x:Lkotlin/jvm/internal/m;

    invoke-direct {p1, v2, v0, p2, v1}, Lf53/b;-><init>(Lkotlin/jvm/functions/Function1;Lx43/k;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lf53/b;

    iget-object v0, p0, Lf53/b;->y:Lx43/k;

    const/4 v1, 0x0

    iget-object v2, p0, Lf53/b;->x:Lkotlin/jvm/internal/m;

    invoke-direct {p1, v2, v0, p2, v1}, Lf53/b;-><init>(Lkotlin/jvm/functions/Function1;Lx43/k;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf53/b;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lf53/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf53/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf53/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lf53/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf53/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf53/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lf53/b;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lf53/b;->y:Lx43/k;

    iget-object v3, p0, Lf53/b;->x:Lkotlin/jvm/internal/m;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
