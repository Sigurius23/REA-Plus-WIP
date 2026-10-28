.class public final synthetic Lnq2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Li2/k0;


# direct methods
.method public synthetic constructor <init>(Li2/k0;I)V
    .locals 0

    iput p2, p0, Lnq2/c;->w:I

    iput-object p1, p0, Lnq2/c;->x:Li2/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnq2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnq2/c;->x:Li2/k0;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lvs2/e;->h(Li2/k0;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lnq2/c;->x:Li2/k0;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lt71/a;->c(Li2/k0;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lnq2/c;->x:Li2/k0;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lre1/l;->d(Li2/k0;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lnq2/c;->x:Li2/k0;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lqt2/o;->d(Li2/k0;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lnq2/c;->x:Li2/k0;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lqn0/h;->a(Li2/k0;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lnq2/c;->x:Li2/k0;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Loq1/d;->g(Li2/k0;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lnq2/c;->x:Li2/k0;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lnq2/e;->d(Li2/k0;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
