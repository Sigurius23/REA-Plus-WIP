.class public final Lal/f;
.super Lal/a;
.source "SourceFile"


# instance fields
.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lal/f;->y:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lal/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final H0()Lal/i;
    .locals 1

    iget v0, p0, Lal/f;->y:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lal/k;

    invoke-direct {v0, p0}, Lal/k;-><init>(Lal/f;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lal/e;

    invoke-direct {v0, p0}, Lal/e;-><init>(Lal/f;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
