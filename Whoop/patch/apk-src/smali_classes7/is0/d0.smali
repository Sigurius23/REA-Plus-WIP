.class public final synthetic Lis0/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lis0/m0;

.field public final synthetic y:F

.field public final synthetic z:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(FLis0/m0;Lp1/z0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lis0/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lis0/d0;->y:F

    iput-object p2, p0, Lis0/d0;->x:Lis0/m0;

    iput-object p3, p0, Lis0/d0;->z:Lp1/z0;

    return-void
.end method

.method public synthetic constructor <init>(Lis0/m0;FLp1/z0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lis0/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis0/d0;->x:Lis0/m0;

    iput p2, p0, Lis0/d0;->y:F

    iput-object p3, p0, Lis0/d0;->z:Lp1/z0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lis0/d0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lis0/d0;->y:F

    iget-object v1, p0, Lis0/d0;->z:Lp1/z0;

    iget-object v2, p0, Lis0/d0;->x:Lis0/m0;

    invoke-static {v0, v2, v1}, Lis0/j0;->n(FLis0/m0;Lp1/z0;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lis0/d0;->x:Lis0/m0;

    iget-object v1, p0, Lis0/d0;->z:Lp1/z0;

    iget v2, p0, Lis0/d0;->y:F

    invoke-static {v2, v0, v1}, Lis0/j0;->i(FLis0/m0;Lp1/z0;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
