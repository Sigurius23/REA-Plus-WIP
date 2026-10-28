.class public final synthetic Lyo0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lyo0/g;


# direct methods
.method public synthetic constructor <init>(Lyo0/g;I)V
    .locals 0

    iput p2, p0, Lyo0/b;->w:I

    iput-object p1, p0, Lyo0/b;->x:Lyo0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyo0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyo0/b;->x:Lyo0/g;

    check-cast p1, Lh2/c;

    invoke-static {v0, p1}, Lyo0/e;->w(Lyo0/g;Lh2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyo0/b;->x:Lyo0/g;

    check-cast p1, Lh2/c;

    invoke-static {v0, p1}, Lyo0/e;->x(Lyo0/g;Lh2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lyo0/b;->x:Lyo0/g;

    check-cast p1, Lh2/c;

    invoke-static {v0, p1}, Lyo0/e;->j(Lyo0/g;Lh2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lyo0/b;->x:Lyo0/g;

    check-cast p1, Lh2/c;

    invoke-static {v0, p1}, Lyo0/e;->p(Lyo0/g;Lh2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lyo0/b;->x:Lyo0/g;

    check-cast p1, Lh2/c;

    invoke-static {v0, p1}, Lyo0/e;->q(Lyo0/g;Lh2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lyo0/b;->x:Lyo0/g;

    check-cast p1, Lh2/c;

    invoke-static {v0, p1}, Lyo0/e;->y(Lyo0/g;Lh2/c;)Ll83/a0;

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
