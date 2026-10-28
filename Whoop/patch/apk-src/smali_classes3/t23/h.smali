.class public final Lt23/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt23/c0;


# direct methods
.method public synthetic constructor <init>(Lt23/c0;I)V
    .locals 0

    iput p2, p0, Lt23/h;->w:I

    iput-object p1, p0, Lt23/h;->x:Lt23/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lt23/h;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lt23/h;->x:Lt23/c0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lv33/w;

    instance-of p2, p1, Lv33/n;

    if-eqz p2, :cond_0

    check-cast p1, Lv33/n;

    iget p1, p1, Lv33/n;->c:I

    mul-int/lit16 p1, p1, 0x3e8

    iput p1, v2, Lt23/c0;->Q:I

    invoke-virtual {v2}, Lt23/c0;->g()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v3, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget p2, v2, Lt23/c0;->Q:I

    div-int/lit16 p2, p2, 0x3e8

    const-string v2, "[join] #deadline for reconnect is "

    const-string v4, " seconds"

    invoke-static {p2, v2, v4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    invoke-interface {p1, v3, v0, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object v1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v6

    iget-object v4, v2, Lt23/c0;->y:Lz7/a;

    iget p1, v4, Lz7/a;->a:I

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    cmpg-float p1, v6, p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, v4, Lz7/a;->d:Ljava/lang/Object;

    check-cast p1, Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    cmpg-float p1, v6, p1

    if-gez p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, v4, Lz7/a;->c:Ljava/lang/Object;

    check-cast p1, Lbc3/c2;

    const/4 v7, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1, v7}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    iget-object p1, v4, Lz7/a;->b:Ljava/lang/Object;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance v3, Lh0/u2;

    const/4 v8, 0x1

    invoke-direct/range {v3 .. v8}, Lh0/u2;-><init>(Ljava/lang/Object;FFLq83/d;I)V

    const/4 p2, 0x3

    invoke-static {p1, v7, v7, v3, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v4, Lz7/a;->c:Ljava/lang/Object;

    :goto_0
    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
