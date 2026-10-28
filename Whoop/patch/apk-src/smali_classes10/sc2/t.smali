.class public final synthetic Lsc2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsc2/s;


# direct methods
.method public synthetic constructor <init>(Lsc2/s;I)V
    .locals 0

    iput p2, p0, Lsc2/t;->w:I

    iput-object p1, p0, Lsc2/t;->x:Lsc2/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsc2/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsc2/t;->x:Lsc2/s;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lsc2/s;->G(Lsc2/s;Ljava/lang/Boolean;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsc2/t;->x:Lsc2/s;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lsc2/s;->C(Lsc2/s;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsc2/t;->x:Lsc2/s;

    check-cast p1, Ltj0/b;

    invoke-static {v0, p1}, Lsc2/s;->A(Lsc2/s;Ltj0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsc2/t;->x:Lsc2/s;

    check-cast p1, Ljava/lang/Byte;

    invoke-static {v0, p1}, Lsc2/s;->y(Lsc2/s;Ljava/lang/Byte;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsc2/t;->x:Lsc2/s;

    check-cast p1, Ltd1/e;

    invoke-static {v0, p1}, Lsc2/s;->H(Lsc2/s;Ltd1/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lsc2/t;->x:Lsc2/s;

    check-cast p1, Lsc2/e;

    invoke-static {v0, p1}, Lsc2/s$e;->h(Lsc2/s;Lsc2/e;)Ll83/a0;

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
