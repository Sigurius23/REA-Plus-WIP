.class public final synthetic Lsl0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsl0/q;


# direct methods
.method public synthetic constructor <init>(Lsl0/q;I)V
    .locals 0

    iput p2, p0, Lsl0/x;->w:I

    iput-object p1, p0, Lsl0/x;->x:Lsl0/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsl0/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/x;->x:Lsl0/q;

    check-cast p1, Lnl0/d;

    invoke-static {v0, p1}, Lsl0/w;->k(Lsl0/q;Lnl0/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/x;->x:Lsl0/q;

    check-cast p1, Lnl0/d$j;

    invoke-static {v0, p1}, Lsl0/w;->c(Lsl0/q;Lnl0/d$j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsl0/x;->x:Lsl0/q;

    check-cast p1, Lnl0/d$r;

    invoke-static {v0, p1}, Lsl0/w;->d(Lsl0/q;Lnl0/d$r;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsl0/x;->x:Lsl0/q;

    check-cast p1, Lnl0/d$h;

    invoke-static {v0, p1}, Lsl0/w$k;->f(Lsl0/q;Lnl0/d$h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsl0/x;->x:Lsl0/q;

    check-cast p1, Lnl0/d$h;

    invoke-static {v0, p1}, Lsl0/w$j;->f(Lsl0/q;Lnl0/d$h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lsl0/x;->x:Lsl0/q;

    check-cast p1, Lnl0/d$h;

    invoke-static {v0, p1}, Lsl0/w$c;->f(Lsl0/q;Lnl0/d$h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lsl0/x;->x:Lsl0/q;

    check-cast p1, Lnl0/d$h;

    invoke-static {v0, p1}, Lsl0/w$b;->f(Lsl0/q;Lnl0/d$h;)Ll83/a0;

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
