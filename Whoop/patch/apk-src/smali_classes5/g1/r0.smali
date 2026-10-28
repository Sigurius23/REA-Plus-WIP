.class public final synthetic Lg1/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly3/c;


# direct methods
.method public synthetic constructor <init>(ILy3/c;)V
    .locals 0

    iput p1, p0, Lg1/r0;->w:I

    iput-object p2, p0, Lg1/r0;->x:Ly3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lg1/r0;->w:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x7d

    int-to-float v0, v0

    iget-object v1, p0, Lg1/r0;->x:Ly3/c;

    invoke-interface {v1, v0}, Ly3/c;->q0(F)F

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg1/r0;->x:Ly3/c;

    sget v1, Landroidx/compose/material/c;->b:F

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v0

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lg1/r0;->x:Ly3/c;

    sget v1, Lg1/p2;->b:F

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
