.class public final synthetic Ll1/r3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly3/c;

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(Ly3/c;FI)V
    .locals 0

    iput p3, p0, Ll1/r3;->w:I

    iput-object p1, p0, Ll1/r3;->x:Ly3/c;

    iput p2, p0, Ll1/r3;->y:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll1/r3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll1/r3;->x:Ly3/c;

    iget v1, p0, Ll1/r3;->y:F

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll1/r3;->x:Ly3/c;

    iget v1, p0, Ll1/r3;->y:F

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
