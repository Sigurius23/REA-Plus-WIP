.class public final synthetic Ll1/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm1/k0;


# direct methods
.method public synthetic constructor <init>(Lm1/k0;I)V
    .locals 0

    iput p2, p0, Ll1/u2;->w:I

    iput-object p1, p0, Ll1/u2;->x:Lm1/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ll1/u2;->w:I

    packed-switch v0, :pswitch_data_0

    sget v0, Lm1/l0;->d:F

    sget v1, Lm1/l0;->e:F

    iget-object v2, p0, Ll1/u2;->x:Lm1/k0;

    invoke-virtual {v2}, Lm1/k0;->invoke()F

    move-result v2

    invoke-static {v0, v1, v2}, Le93/b;->O(FFF)F

    move-result v0

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    return-object v1

    :pswitch_0
    sget v0, Lm1/l0;->d:F

    sget v1, Lm1/l0;->e:F

    iget-object v2, p0, Ll1/u2;->x:Lm1/k0;

    invoke-virtual {v2}, Lm1/k0;->invoke()F

    move-result v2

    invoke-static {v0, v1, v2}, Le93/b;->O(FFF)F

    move-result v0

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
