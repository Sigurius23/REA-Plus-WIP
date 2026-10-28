.class public final Lar/i;
.super Lar/j;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lar/m;


# direct methods
.method public synthetic constructor <init>(Lar/m;I)V
    .locals 0

    iput p2, p0, Lar/i;->e:I

    iput-object p1, p0, Lar/i;->f:Lar/m;

    invoke-direct {p0, p1}, Lar/j;-><init>(Lar/m;)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 2

    iget v0, p0, Lar/i;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lar/i;->f:Lar/m;

    iget v0, v0, Lar/k;->h:F

    return v0

    :pswitch_0
    iget-object v0, p0, Lar/i;->f:Lar/m;

    iget v1, v0, Lar/k;->h:F

    iget v0, v0, Lar/k;->j:F

    :goto_0
    add-float/2addr v1, v0

    return v1

    :pswitch_1
    iget-object v0, p0, Lar/i;->f:Lar/m;

    iget v1, v0, Lar/k;->h:F

    iget v0, v0, Lar/k;->i:F

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
