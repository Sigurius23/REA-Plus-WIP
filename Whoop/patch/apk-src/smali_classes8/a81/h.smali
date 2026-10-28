.class public final synthetic La81/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p2, p0, La81/h;->w:I

    iput-object p1, p0, La81/h;->x:Ljava/util/List;

    iput-object p3, p0, La81/h;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, La81/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La81/h;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, La81/h;->x:Ljava/util/List;

    invoke-static {v1, v0, p1}, Lu11/i;->t(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La81/h;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, La81/h;->x:Ljava/util/List;

    invoke-static {v1, v0, p1}, Lqe0/c;->i(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La81/h;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, La81/h;->x:Ljava/util/List;

    invoke-static {v1, v0, p1}, Lev2/u;->i(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La81/h;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, La81/h;->x:Ljava/util/List;

    invoke-static {v1, v0, p1}, Lev2/n;->l(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La81/h;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, La81/h;->x:Ljava/util/List;

    invoke-static {v1, v0, p1}, Lcp0/p;->i(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La81/h;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, La81/h;->x:Ljava/util/List;

    invoke-static {v1, v0, p1}, La81/o;->p(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

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
