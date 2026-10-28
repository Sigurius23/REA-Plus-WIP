.class public final La6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, La6/z;->w:I

    iput-object p1, p0, La6/z;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, La6/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, La6/z;->x:Ljava/lang/Object;

    check-cast p2, Lp1/r1;

    invoke-interface {p2, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object p2, p0, La6/z;->x:Ljava/lang/Object;

    check-cast p2, Lw73/e;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lw73/e;->a(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lw73/e;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p2, p2, Lw73/e;->x:Ljava/lang/Object;

    check-cast p2, Ll73/d;

    invoke-interface {p2, p1}, Ll73/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    instance-of v0, p2, Lec3/r;

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Lec3/r;

    iget v1, v0, Lec3/r;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_2

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/r;->y:I

    goto :goto_1

    :cond_2
    new-instance v0, Lec3/r;

    invoke-direct {v0, p0, p2}, Lec3/r;-><init>(La6/z;Lq83/d;)V

    :goto_1
    iget-object p2, v0, Lec3/r;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/r;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    if-ne v2, v3, :cond_3

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La6/z;->x:Ljava/lang/Object;

    check-cast p2, Ldc3/u;

    if-nez p1, :cond_5

    sget-object p1, Lfc3/b;->b:Lhc3/x;

    :cond_5
    iput v3, v0, Lec3/r;->y:I

    check-cast p2, Ldc3/t;

    iget-object p2, p2, Ldc3/t;->z:Ldc3/h;

    invoke-interface {p2, p1, v0}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v1

    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p2, p0, La6/z;->x:Ljava/lang/Object;

    check-cast p2, Lb3/o2;

    iget-object p2, p2, Lb3/o2;->w:Lp1/g1;

    invoke-virtual {p2, p1}, Lp1/g1;->y(F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Ll83/a0;

    iget-object p1, p0, La6/z;->x:Ljava/lang/Object;

    check-cast p1, La6/i0;

    iget-object v0, p1, La6/i0;->g:Lbu/c;

    invoke-virtual {v0}, Lbu/c;->C()La6/e1;

    move-result-object v0

    instance-of v0, v0, La6/s0;

    if-nez v0, :cond_7

    const/4 v0, 0x1

    invoke-static {p1, v0, p2}, La6/i0;->f(La6/i0;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_7

    goto :goto_4

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
