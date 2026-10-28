.class public final synthetic Ll0/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(FFI)V
    .locals 0

    iput p3, p0, Ll0/f1;->w:I

    iput p1, p0, Ll0/f1;->x:F

    iput p2, p0, Ll0/f1;->y:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ll0/f1;->w:I

    check-cast p1, Lb3/l2;

    packed-switch v0, :pswitch_data_0

    const-string v0, "padding"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Ly3/f;

    iget v2, p0, Ll0/f1;->x:F

    invoke-direct {v1, v2}, Ly3/f;-><init>(F)V

    const-string v2, "horizontal"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    new-instance v0, Ly3/f;

    iget v1, p0, Ll0/f1;->y:F

    invoke-direct {v0, v1}, Ly3/f;-><init>(F)V

    const-string v1, "vertical"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const-string v0, "offset"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    new-instance v1, Ly3/f;

    iget v2, p0, Ll0/f1;->x:F

    invoke-direct {v1, v2}, Ly3/f;-><init>(F)V

    const-string v2, "x"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    new-instance v0, Ly3/f;

    iget v1, p0, Ll0/f1;->y:F

    invoke-direct {v0, v1}, Ly3/f;-><init>(F)V

    const-string v1, "y"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
