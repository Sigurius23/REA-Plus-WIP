.class public final synthetic Lu0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu0/r1;


# direct methods
.method public synthetic constructor <init>(Lu0/r1;I)V
    .locals 0

    iput p2, p0, Lu0/l;->w:I

    iput-object p1, p0, Lu0/l;->x:Lu0/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lu0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu0/l;->x:Lu0/r1;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lu0/r1;->b:Ll3/g;

    iget-object v0, v0, Lu0/r1;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/r0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll3/r0;->a:Ll3/q0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll3/q0;->a:Ll3/g;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lu0/l;->x:Lu0/r1;

    if-eqz v0, :cond_3

    iget-object v1, v0, Lu0/r1;->b:Ll3/g;

    iget-object v0, v0, Lu0/r1;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/r0;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ll3/r0;->a:Ll3/q0;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ll3/q0;->a:Ll3/g;

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
