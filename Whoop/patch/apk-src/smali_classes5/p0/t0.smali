.class public final synthetic Lp0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp0/v0;


# direct methods
.method public synthetic constructor <init>(Lp0/v0;I)V
    .locals 0

    iput p2, p0, Lp0/t0;->w:I

    iput-object p1, p0, Lp0/t0;->x:Lp0/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lp0/t0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lp0/t0;->x:Lp0/v0;

    iget-object v1, v0, Lp0/v0;->O:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp0/b0;

    if-ltz p1, :cond_0

    invoke-interface {v1}, Lp0/b0;->getItemCount()I

    move-result v2

    if-ge p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "Can\'t scroll to index "

    const-string v3, ", it is out of bounds [0, "

    invoke-static {p1, v2, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v1}, Lp0/b0;->getItemCount()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v1

    new-instance v2, Lg1/j5;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v2, v0, p1, v4, v3}, Lg1/j5;-><init>(Ljava/lang/Object;ILq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp0/t0;->x:Lp0/v0;

    iget-object v0, v0, Lp0/v0;->O:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp0/b0;

    invoke-interface {v0}, Lp0/b0;->getItemCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Lp0/b0;->c(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, -0x1

    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
