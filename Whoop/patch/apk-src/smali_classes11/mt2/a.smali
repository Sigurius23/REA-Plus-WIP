.class public final synthetic Lmt2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnt2/c;


# direct methods
.method public synthetic constructor <init>(Lnt2/c;I)V
    .locals 0

    iput p2, p0, Lmt2/a;->w:I

    iput-object p1, p0, Lmt2/a;->x:Lnt2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmt2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmt2/a;->x:Lnt2/c;

    check-cast p1, Lnt2/a;

    invoke-static {v0, p1}, Lmt2/e;->j(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmt2/a;->x:Lnt2/c;

    check-cast p1, Lnt2/a;

    invoke-static {v0, p1}, Lmt2/e;->r(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmt2/a;->x:Lnt2/c;

    check-cast p1, Lnt2/a;

    invoke-static {v0, p1}, Lmt2/e;->q(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lmt2/a;->x:Lnt2/c;

    check-cast p1, Lnt2/a;

    invoke-static {v0, p1}, Lmt2/e;->m(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lmt2/a;->x:Lnt2/c;

    check-cast p1, Lnt2/a;

    invoke-static {v0, p1}, Lmt2/e;->s(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
