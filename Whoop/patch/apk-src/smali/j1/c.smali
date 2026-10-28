.class public final synthetic Lj1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lj1/l;


# direct methods
.method public synthetic constructor <init>(Lj1/l;I)V
    .locals 0

    iput p2, p0, Lj1/c;->w:I

    iput-object p1, p0, Lj1/c;->x:Lj1/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lj1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj1/c;->x:Lj1/l;

    iget-object v0, v0, Lj1/l;->f:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lj1/c;->x:Lj1/l;

    invoke-virtual {v0}, Lj1/l;->a()F

    move-result v1

    iget-object v0, v0, Lj1/l;->g:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    div-float/2addr v1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v0

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x3e99999a    # 0.3f

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
