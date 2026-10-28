.class public final Lqa3/l;
.super Lwa3/c;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqa3/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwa3/f;Lwa3/i;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqa3/l;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lqa3/y0;

    invoke-direct {v0, p1, p2}, Lqa3/y0;-><init>(Lwa3/f;Lwa3/i;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lqa3/a0;

    invoke-direct {v0, p1, p2}, Lqa3/a0;-><init>(Lwa3/f;Lwa3/i;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lqa3/v;

    invoke-direct {v0, p1, p2}, Lqa3/v;-><init>(Lwa3/f;Lwa3/i;)V

    return-object v0

    :pswitch_2
    new-instance p2, Lqa3/m;

    invoke-direct {p2, p1}, Lqa3/m;-><init>(Lwa3/f;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
