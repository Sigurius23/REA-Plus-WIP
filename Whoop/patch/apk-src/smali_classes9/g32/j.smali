.class public final synthetic Lg32/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lg32/j;->w:I

    iput-object p1, p0, Lg32/j;->y:Lc93/a;

    iput-object p2, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lc93/a;I)V
    .locals 0

    .line 2
    iput p3, p0, Lg32/j;->w:I

    iput-object p1, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lg32/j;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg32/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg32/j;->y:Lc93/a;

    iget-object v1, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Luw0/q;->f(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lb30/o4;

    const/16 v1, 0xf

    iget-object v2, p0, Lg32/j;->y:Lc93/a;

    invoke-direct {v0, v2, v1}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v3, -0x5fa95113

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    iget-object v0, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lg32/j;->y:Lc93/a;

    iget-object v1, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lpp1/i;->C(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lg32/j;->y:Lc93/a;

    iget-object v1, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lnw0/j;->f(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lg32/j;->y:Lc93/a;

    iget-object v1, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lnw0/j;->e(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lg32/j;->y:Lc93/a;

    iget-object v1, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Ll72/o;->k(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lg32/j;->y:Lc93/a;

    iget-object v1, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Ll72/o;->s(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lg32/j;->y:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lg32/j;->y:Lc93/a;

    invoke-static {v1, v0}, Lgv1/g;->o(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lg32/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lg32/j;->y:Lc93/a;

    invoke-static {v1, v0}, Lg32/k;->q(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
