.class public final synthetic Lb90/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V
    .locals 0

    iput p1, p0, Lb90/e;->w:I

    iput-object p2, p0, Lb90/e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lb90/e;->y:Lp1/c1;

    iput-object p4, p0, Lb90/e;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb90/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb90/e;->z:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lb90/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb90/e;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lw80/b;->c(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lq3/y;

    iget-object v0, p0, Lb90/e;->y:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lb90/e;->z:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p1, Lq3/y;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object p1, p1, Lq3/y;->a:Ll3/g;

    iget-object v2, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-interface {v0, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    if-nez v1, :cond_0

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    iget-object v0, p0, Lb90/e;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb90/e;->z:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lb90/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb90/e;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lm80/d;->f(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lb90/e;->z:Lp1/c1;

    check-cast p1, Llw1/i;

    iget-object v1, p0, Lb90/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb90/e;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lkw1/j;->d(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Llw1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lb90/e;->y:Lp1/c1;

    iget-object v1, p0, Lb90/e;->z:Lp1/c1;

    iget-object v2, p0, Lb90/e;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1, p1}, Ldk2/j;->m(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lb90/e;->z:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lb90/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb90/e;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lb90/f;->i(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
