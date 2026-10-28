.class public final synthetic Lcp0/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(Lp1/z0;I)V
    .locals 0

    iput p2, p0, Lcp0/c0;->w:I

    iput-object p1, p0, Lcp0/c0;->x:Lp1/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcp0/c0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/c0;->x:Lp1/z0;

    invoke-static {v0}, Lcp0/j0;->b(Lp1/z0;)F

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcp0/c0;->x:Lp1/z0;

    invoke-static {v0}, Lcp0/j0;->y(Lp1/z0;)F

    move-result v0

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcp0/c0;->x:Lp1/z0;

    invoke-static {v0}, Lcp0/j0;->v(Lp1/z0;)F

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
