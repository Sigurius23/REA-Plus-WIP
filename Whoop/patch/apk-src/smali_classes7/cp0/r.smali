.class public final synthetic Lcp0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lcp0/r;->w:I

    iput-object p2, p0, Lcp0/r;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcp0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/r;->x:Lp1/c1;

    invoke-static {v0}, Lcp0/j0;->C(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcp0/r;->x:Lp1/c1;

    invoke-static {v0}, Lcp0/j0;->A(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcp0/r;->x:Lp1/c1;

    invoke-static {v0}, Lcp0/j0;->d(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcp0/r;->x:Lp1/c1;

    invoke-static {v0}, Lcp0/j0;->g(Lp1/c1;)Lcp0/u1;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcp0/r;->x:Lp1/c1;

    invoke-static {v0}, Lcp0/s;->c(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
