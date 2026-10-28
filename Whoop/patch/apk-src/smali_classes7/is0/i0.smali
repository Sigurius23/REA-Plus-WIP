.class public final synthetic Lis0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lis0/i0;->w:I

    iput-object p2, p0, Lis0/i0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lis0/i0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lis0/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/i0;->x:Ljava/lang/Object;

    check-cast v0, Lis0/m0;

    iget-object v1, p0, Lis0/i0;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lis0/j0;->k(Lis0/m0;Lp1/c1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lis0/i0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lis0/i0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lis0/j0;->p(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lis0/i0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lis0/i0;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v0}, Lis0/z;->d(Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lis0/i0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lis0/i0;->y:Ljava/lang/Object;

    check-cast v1, Lis0/c;

    invoke-static {v0, v1}, Lis0/p;->a(Lkotlin/jvm/functions/Function1;Lis0/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lis0/i0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    iget-object v1, p0, Lis0/i0;->y:Ljava/lang/Object;

    check-cast v1, Lp1/z0;

    invoke-static {v0, v1}, Lis0/j0$a;->h(Lp1/z0;Lp1/z0;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
