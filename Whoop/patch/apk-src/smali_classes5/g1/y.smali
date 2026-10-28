.class public final Lg1/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/g1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lg1/y;->a:I

    iput-object p1, p0, Lg1/y;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    iget v0, p0, Lg1/y;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/y;->b:Ljava/lang/Object;

    check-cast v0, Lm1/g;

    iget-object v1, v0, Lm1/g;->n:Lm1/f;

    invoke-virtual {v0, p1}, Lm1/g;->e(F)F

    move-result p1

    invoke-static {v1, p1}, Lm1/f;->a(Lm1/f;F)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lg1/y;->b:Ljava/lang/Object;

    check-cast v0, Lg1/n5;

    iget-object v0, v0, Lg1/n5;->a:Lam2/b;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, p1}, Lam2/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object v0, p0, Lg1/y;->b:Ljava/lang/Object;

    check-cast v0, Lg1/a0;

    iget-object v1, v0, Lg1/a0;->o:Lg1/w;

    invoke-virtual {v0, p1}, Lg1/a0;->f(F)F

    move-result p1

    iget-object v0, v1, Lg1/w;->a:Lg1/a0;

    iget-object v1, v0, Lg1/a0;->j:Lp1/g1;

    invoke-virtual {v1, p1}, Lp1/g1;->y(F)V

    iget-object p1, v0, Lg1/a0;->l:Lp1/g1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lp1/g1;->y(F)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
