.class public final synthetic Lcp0/v0;
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

    iput p3, p0, Lcp0/v0;->w:I

    iput p1, p0, Lcp0/v0;->x:F

    iput p2, p0, Lcp0/v0;->y:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcp0/v0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcp0/v0;->y:F

    check-cast p1, Lk2/e;

    iget v1, p0, Lcp0/v0;->x:F

    invoke-static {v1, v0, p1}, Lo11/l;->m(FFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lb3/l2;

    const-string v0, "absoluteOffset"

    iput-object v0, p1, Lb3/l2;->a:Ljava/lang/String;

    iget-object p1, p1, Lb3/l2;->c:Lb3/d3;

    new-instance v0, Ly3/f;

    iget v1, p0, Lcp0/v0;->x:F

    invoke-direct {v0, v1}, Ly3/f;-><init>(F)V

    const-string v1, "x"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly3/f;

    iget v1, p0, Lcp0/v0;->y:F

    invoke-direct {v0, v1}, Ly3/f;-><init>(F)V

    const-string v1, "y"

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget v0, p0, Lcp0/v0;->y:F

    check-cast p1, Lmh/h;

    iget v1, p0, Lcp0/v0;->x:F

    invoke-static {v1, v0, p1}, Ld41/e;->m(FFLmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Lcp0/v0;->y:F

    check-cast p1, Ly3/c;

    iget v1, p0, Lcp0/v0;->x:F

    invoke-static {v1, v0, p1}, Lcp0/x0;->z(FFLy3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
