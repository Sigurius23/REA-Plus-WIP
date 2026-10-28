.class public final synthetic Lg40/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg40/t;


# direct methods
.method public synthetic constructor <init>(Lg40/t;I)V
    .locals 0

    iput p2, p0, Lg40/s;->w:I

    iput-object p1, p0, Lg40/s;->x:Lg40/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lg40/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/s;->x:Lg40/t;

    iget-object v1, v0, Lg40/t;->i:Lg40/a0;

    iget-object v0, v0, Lg40/t;->b:Lg40/r0;

    iget-object v0, v0, Lg40/r0;->i:Ln53/e;

    iget-object v0, v0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-interface {v1, v0}, Lg40/a0;->e(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg40/s;->x:Lg40/t;

    iget-object v1, v0, Lg40/t;->i:Lg40/a0;

    iget-object v0, v0, Lg40/t;->b:Lg40/r0;

    iget-object v0, v0, Lg40/r0;->i:Ln53/e;

    iget-object v0, v0, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    invoke-interface {v1, v0}, Lg40/a0;->e(Ljava/lang/String;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
