.class public final Lc0/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld0/z1;


# direct methods
.method public synthetic constructor <init>(Ld0/z1;I)V
    .locals 0

    iput p2, p0, Lc0/n0;->w:I

    iput-object p1, p0, Lc0/n0;->x:Ld0/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc0/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc0/n0;->x:Ld0/z1;

    invoke-virtual {v0}, Ld0/z1;->f()Ld0/t1;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc0/n0;->x:Ld0/z1;

    iget-object v0, v0, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
