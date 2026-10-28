.class public final synthetic Lh01/i;
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

    iput p1, p0, Lh01/i;->w:I

    iput-object p2, p0, Lh01/i;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh01/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh01/i;->x:Lp1/c1;

    invoke-static {v0}, Lum1/d;->d(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh01/i;->x:Lp1/c1;

    invoke-static {v0}, Lp31/f;->n(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lh01/i;->x:Lp1/c1;

    invoke-static {v0}, Lm91/l;->k(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lh01/i;->x:Lp1/c1;

    invoke-static {v0}, Lh01/z;->c(Lp1/c1;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lh01/i;->x:Lp1/c1;

    invoke-static {v0}, Lh01/z;->d(Lp1/c1;)Ly3/f;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lh01/i;->x:Lp1/c1;

    invoke-static {v0}, Lh01/p;->c(Lp1/c1;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lh01/i;->x:Lp1/c1;

    invoke-static {v0}, Lh01/p;->e(Lp1/c1;)Ly3/f;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
