.class public final Lch3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/f;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lch3/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lch3/v;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/n0;

    invoke-direct {v0, p1}, Lch3/n0;-><init>(Lxg3/s;)V

    new-instance v1, Lch3/o0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lch3/o0;-><init>(Lxg3/h;I)V

    iput-object v1, v0, Lch3/n0;->x:Lch3/o0;

    invoke-virtual {p1, v1}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    return-object v1

    :pswitch_0
    check-cast p1, Lxg3/s;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
