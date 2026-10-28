.class public final Ln0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Lp0/b0;


# direct methods
.method public synthetic constructor <init>(Lp0/b0;II)V
    .locals 0

    iput p3, p0, Ln0/h;->w:I

    iput-object p1, p0, Ln0/h;->y:Lp0/b0;

    iput p2, p0, Ln0/h;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ln0/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Ln0/h;->y:Lp0/b0;

    check-cast p2, Lq0/o;

    iget-object p2, p2, Lq0/o;->b:Lp0/y;

    invoke-virtual {p2}, Lp0/y;->m()Lab/h0;

    move-result-object p2

    iget v0, p0, Ln0/h;->x:I

    invoke-virtual {p2, v0}, Lab/h0;->m(I)Lp0/h;

    move-result-object p2

    iget v1, p2, Lp0/h;->a:I

    sub-int/2addr v0, v1

    iget-object p2, p2, Lp0/h;->c:Lp0/q;

    check-cast p2, Lq0/h;

    iget-object p2, p2, Lq0/h;->b:Lc93/n;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lq0/s;->a:Lq0/s;

    invoke-interface {p2, v2, v0, p1, v1}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Ln0/h;->y:Lp0/b0;

    check-cast p2, Lo0/h;

    iget-object p2, p2, Lo0/h;->b:Lo0/g;

    iget-object p2, p2, Lo0/g;->d:Lab/h0;

    iget v0, p0, Ln0/h;->x:I

    invoke-virtual {p2, v0}, Lab/h0;->m(I)Lp0/h;

    move-result-object p2

    iget v1, p2, Lp0/h;->a:I

    sub-int/2addr v0, v1

    iget-object p2, p2, Lp0/h;->c:Lp0/q;

    check-cast p2, Lo0/f;

    iget-object p2, p2, Lo0/f;->c:Lx1/b;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo0/k;->a:Lo0/k;

    invoke-virtual {p2, v2, v0, p1, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    move v0, v2

    :goto_4
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Ln0/h;->y:Lp0/b0;

    check-cast p2, Ln0/i;

    iget-object v0, p2, Ln0/i;->b:Ln0/f;

    iget-object v0, v0, Ln0/f;->c:Lab/h0;

    iget v1, p0, Ln0/h;->x:I

    invoke-virtual {v0, v1}, Lab/h0;->m(I)Lp0/h;

    move-result-object v0

    iget v3, v0, Lp0/h;->a:I

    sub-int/2addr v1, v3

    iget-object v0, v0, Lp0/h;->c:Lp0/q;

    check-cast v0, Ln0/d;

    iget-object v0, v0, Ln0/d;->c:Lc93/n;

    iget-object p2, p2, Ln0/i;->c:Landroidx/compose/foundation/lazy/b;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p2, v1, p1, v2}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
