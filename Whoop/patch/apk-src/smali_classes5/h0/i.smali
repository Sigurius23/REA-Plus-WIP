.class public final Lh0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/k2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lh0/i;->a:I

    iput-object p2, p0, Lh0/i;->b:Ljava/lang/Object;

    iput-object p3, p0, Lh0/i;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 4

    iget v0, p0, Lh0/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh0/i;->b:Ljava/lang/Object;

    check-cast v0, Lh0/c3;

    iget-object v1, v0, Lh0/c3;->h:La6/l0;

    invoke-virtual {v1}, La6/l0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    :goto_0
    iget-object v1, p0, Lh0/i;->c:Ljava/lang/Object;

    check-cast v1, Lh0/a3;

    invoke-virtual {v0, p1}, Lh0/c3;->h(F)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lh0/c3;->e(J)J

    move-result-wide v2

    const/4 p1, 0x2

    invoke-virtual {v1, p1, v2, v3}, Lh0/a3;->a(IJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lh0/c3;->g(J)F

    move-result p1

    invoke-virtual {v0, p1}, Lh0/c3;->d(F)F

    move-result p1

    return p1

    :cond_1
    new-instance p1, Landroidx/compose/foundation/gestures/FlingCancellationException;

    invoke-direct {p1}, Landroidx/compose/foundation/gestures/FlingCancellationException;-><init>()V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lh0/i;->b:Ljava/lang/Object;

    check-cast v0, Lh0/k;

    iget-object v1, v0, Lh0/k;->Z:Lh0/p;

    invoke-virtual {v1, p1}, Lh0/p;->d(F)F

    move-result p1

    iget-object v0, v0, Lh0/k;->Z:Lh0/p;

    iget-object v0, v0, Lh0/p;->f:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    sub-float v0, p1, v0

    iget-object v1, p0, Lh0/i;->c:Ljava/lang/Object;

    check-cast v1, Lh0/a;

    invoke-static {v1, p1}, Lh0/a;->a(Lh0/a;F)V

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
