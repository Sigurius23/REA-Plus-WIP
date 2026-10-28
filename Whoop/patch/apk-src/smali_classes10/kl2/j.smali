.class public final synthetic Lkl2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Lg1/y3;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lkl2/j;->w:I

    iput-object p1, p0, Lkl2/j;->y:Lbc3/c0;

    iput-object p2, p0, Lkl2/j;->z:Lg1/y3;

    iput-object p3, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;I)V
    .locals 0

    .line 2
    iput p4, p0, Lkl2/j;->w:I

    iput-object p1, p0, Lkl2/j;->y:Lbc3/c0;

    iput-object p2, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lkl2/j;->z:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;I)V
    .locals 0

    .line 3
    iput p4, p0, Lkl2/j;->w:I

    iput-object p1, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lkl2/j;->y:Lbc3/c0;

    iput-object p3, p0, Lkl2/j;->z:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lkl2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkl2/j;->z:Lg1/y3;

    iget-object v1, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lkl2/j;->y:Lbc3/c0;

    invoke-static {v2, v0, v1, p1}, Luu2/l;->b(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkl2/j;->z:Lg1/y3;

    iget-object v1, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lkl2/j;->y:Lbc3/c0;

    invoke-static {v2, v0, v1, p1}, Luu2/l;->j(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lkl2/j;->z:Lg1/y3;

    check-cast p1, Lny2/a;

    iget-object v1, p0, Lkl2/j;->y:Lbc3/c0;

    iget-object v2, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v0, p1}, Lry2/e;->f(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lny2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lkl2/j;->y:Lbc3/c0;

    iget-object v1, p0, Lkl2/j;->z:Lg1/y3;

    iget-object v2, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lqu2/h;->U(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Llx2/a;

    iget-object v1, p0, Lkl2/j;->y:Lbc3/c0;

    iget-object v2, p0, Lkl2/j;->z:Lg1/y3;

    invoke-static {v1, v2, v0, p1}, Lox2/h;->e(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Llx2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Llx2/a;

    iget-object v1, p0, Lkl2/j;->y:Lbc3/c0;

    iget-object v2, p0, Lkl2/j;->z:Lg1/y3;

    invoke-static {v1, v2, v0, p1}, Lox2/h;->c(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Llx2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lkl2/j;->z:Lg1/y3;

    check-cast p1, Lin1/b;

    iget-object v1, p0, Lkl2/j;->y:Lbc3/c0;

    iget-object v2, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v0, p1}, Lln1/q;->a(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lg1/y3;Lin1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lkl2/j;->y:Lbc3/c0;

    iget-object v1, p0, Lkl2/j;->z:Lg1/y3;

    iget-object v2, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lkl2/k;->g(Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lkl2/j;->z:Lg1/y3;

    check-cast p1, Lnl2/c$e;

    iget-object v1, p0, Lkl2/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lkl2/j;->y:Lbc3/c0;

    invoke-static {v1, v2, v0, p1}, Lkl2/k;->o(Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lnl2/c$e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
