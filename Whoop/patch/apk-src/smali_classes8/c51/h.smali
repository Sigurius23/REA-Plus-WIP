.class public final synthetic Lc51/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Li2/t;


# direct methods
.method public synthetic constructor <init>(Li2/t;I)V
    .locals 0

    iput p2, p0, Lc51/h;->w:I

    iput-object p1, p0, Lc51/h;->x:Li2/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc51/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lf2/d;

    invoke-static {v0, p1}, Lqz0/k;->k(Li2/t;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lqz0/k;->i(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lny0/u;->f(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lf2/d;

    invoke-static {v0, p1}, Lny0/u;->a(Li2/t;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lnm1/h;->f(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Ln21/h;->h(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lgz2/b;->a(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lfg2/n;->c(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lej1/v;->d(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Ld11/f;->b(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lf2/d;

    invoke-static {v0, p1}, Ld11/f;->g(Li2/t;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lc51/h;->x:Li2/t;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lc51/k;->g(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
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
