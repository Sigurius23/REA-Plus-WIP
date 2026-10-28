.class public final synthetic Lno0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lno0/d;->w:I

    iput-object p2, p0, Lno0/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Lno0/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lno0/d;->w:I

    iput-object p1, p0, Lno0/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lno0/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lno0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno0/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lno0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lno0/p0;->j(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lno0/d;->y:Ljava/lang/Object;

    check-cast v0, Llo0/b0$b$e;

    iget-object v1, p0, Lno0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lno0/n0;->h(Llo0/b0$b$e;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lno0/d;->x:Ljava/lang/Object;

    check-cast v0, Ll1/w3;

    iget-object v1, p0, Lno0/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lno0/l0;->h(Ll1/w3;Lp1/c1;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lno0/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    iget-object v1, p0, Lno0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lno0/l0;->d(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lno0/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lno0/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lno0/l0;->A(Ljava/util/List;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lno0/d;->y:Ljava/lang/Object;

    check-cast v0, Llo0/b0$b$b;

    iget-object v1, p0, Lno0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lno0/a0;->f(Llo0/b0$b$b;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lno0/d;->y:Ljava/lang/Object;

    check-cast v0, Llo0/l;

    iget-object v1, p0, Lno0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc31/c;

    invoke-static {v0, v1, p1}, Lno0/s;->g(Llo0/l;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lno0/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lno0/d;->y:Ljava/lang/Object;

    check-cast v1, Lm91/u;

    invoke-static {p1, v1, v0}, Lno0/e;->a(Ljava/lang/Object;Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
