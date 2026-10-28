.class public final Ld/d;
.super La2/a;
.source "SourceFile"


# instance fields
.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Class;)V
    .locals 0

    iput p1, p0, Ld/d;->y:I

    const/4 p1, 0x1

    invoke-direct {p0, p2, p1}, La2/a;-><init>(Ljava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public final c(Ld/l;)Ld/b1;
    .locals 1

    iget v0, p0, Ld/d;->y:I

    packed-switch v0, :pswitch_data_0

    return-object p1

    :pswitch_0
    iget-object p1, p1, Ld/x0;->a:[B

    invoke-static {p1}, Ld/g;->l([B)Ld/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ld/h1;)Ld/b1;
    .locals 1

    iget v0, p0, Ld/d;->y:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Ld/h1;->q()Ld/x0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Ld/h1;->p()Ld/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
