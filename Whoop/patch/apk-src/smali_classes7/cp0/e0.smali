.class public final synthetic Lcp0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;FI)V
    .locals 0

    iput p3, p0, Lcp0/e0;->w:I

    iput-object p1, p0, Lcp0/e0;->y:Ljava/lang/Object;

    iput p2, p0, Lcp0/e0;->x:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcp0/e0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/e0;->y:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    iget v1, p0, Lcp0/e0;->x:F

    invoke-static {v0, v1}, Lzi0/a;->k(Ln0/u;F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcp0/e0;->y:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    iget v1, p0, Lcp0/e0;->x:F

    invoke-static {v0, v1}, Lcp0/j0;->r(Lp1/z0;F)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
