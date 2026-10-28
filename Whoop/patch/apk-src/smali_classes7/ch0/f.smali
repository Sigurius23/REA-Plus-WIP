.class public final synthetic Lch0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lch0/v0;


# direct methods
.method public synthetic constructor <init>(Lch0/v0;I)V
    .locals 0

    iput p2, p0, Lch0/f;->w:I

    iput-object p1, p0, Lch0/f;->x:Lch0/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lch0/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lch0/f;->x:Lch0/v0;

    invoke-static {v0, p1}, Lch0/c1;->o(Lch0/v0;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/f;->x:Lch0/v0;

    check-cast p1, Lzg0/g;

    invoke-static {v0, p1}, Lch0/c1;->g(Lch0/v0;Lzg0/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lch0/f;->x:Lch0/v0;

    check-cast p1, Lyg0/b;

    invoke-static {v0, p1}, Lch0/n;->o(Lch0/v0;Lyg0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lch0/f;->x:Lch0/v0;

    check-cast p1, Lyg0/b;

    invoke-static {v0, p1}, Lch0/n;->k(Lch0/v0;Lyg0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
