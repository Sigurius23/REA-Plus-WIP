.class public final synthetic Lzq0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lzq0/h;->w:I

    iput-object p1, p0, Lzq0/h;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzq0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzq0/h;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lvy0/y;

    invoke-static {v0, p1}, Lzq0/x;->d(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzq0/h;->x:Ljava/lang/Object;

    check-cast v0, Lzq0/o;

    check-cast p1, Ly3/l;

    invoke-static {v0, p1}, Lzq0/m;->a(Lzq0/o;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lzq0/h;->x:Ljava/lang/Object;

    check-cast v0, Lp1/a1;

    check-cast p1, Ly3/l;

    invoke-static {v0, p1}, Lzq0/f;->l(Lp1/a1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lzq0/h;->x:Ljava/lang/Object;

    check-cast v0, Lzq0/p;

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lzq0/f;->b(Lzq0/p;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lzq0/h;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    check-cast p1, Lh2/b;

    invoke-static {v0, p1}, Lzq0/f$d;->c(Lkotlin/jvm/internal/d0;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
