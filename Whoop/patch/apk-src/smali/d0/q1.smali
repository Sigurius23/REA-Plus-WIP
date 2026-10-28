.class public final synthetic Ld0/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld0/z1;


# direct methods
.method public synthetic constructor <init>(Ld0/z1;I)V
    .locals 0

    iput p2, p0, Ld0/q1;->w:I

    iput-object p1, p0, Ld0/q1;->x:Ld0/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ld0/q1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld0/q1;->x:Ld0/z1;

    invoke-virtual {v0}, Ld0/z1;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld0/q1;->x:Ld0/z1;

    iget-object v1, v0, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, Ld0/z1;->a:Lal/a;

    invoke-virtual {v2}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Ld0/z1;->g:Lp1/i1;

    invoke-virtual {v1}, Lp1/i1;->x()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ld0/z1;->h:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
