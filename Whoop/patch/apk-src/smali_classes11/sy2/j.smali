.class public final synthetic Lsy2/j;
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

    iput p1, p0, Lsy2/j;->w:I

    iput-object p2, p0, Lsy2/j;->x:Ljava/lang/Object;

    iput-object p3, p0, Lsy2/j;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lsy2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsy2/j;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lsy2/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lsy2/t;->k(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsy2/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsy2/j;->y:Ljava/lang/Object;

    check-cast v1, Lty2/a$a$i;

    invoke-static {v0, v1}, Lsy2/t;->e(Lkotlin/jvm/functions/Function1;Lty2/a$a$i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsy2/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsy2/j;->y:Ljava/lang/Object;

    check-cast v1, Lty2/d;

    invoke-static {v0, v1}, Lsy2/n;->c(Lkotlin/jvm/functions/Function1;Lty2/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lsy2/j;->x:Ljava/lang/Object;

    check-cast v0, Lty2/a$a$b;

    iget-object v1, p0, Lsy2/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lsy2/e;->g(Lty2/a$a$b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lsy2/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsy2/j;->y:Ljava/lang/Object;

    check-cast v1, Llz2/b;

    invoke-static {v0, v1}, Lsy2/b;->c(Lkotlin/jvm/functions/Function1;Llz2/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lsy2/j;->x:Ljava/lang/Object;

    check-cast v0, Ll0/b2;

    iget-object v1, p0, Lsy2/j;->y:Ljava/lang/Object;

    check-cast v1, Ly3/c;

    invoke-static {v0, v1}, Lsy2/k$a;->f(Ll0/b2;Ly3/c;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
