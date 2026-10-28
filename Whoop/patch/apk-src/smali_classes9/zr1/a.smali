.class public final synthetic Lzr1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lzr1/a;->w:I

    iput-object p1, p0, Lzr1/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzr1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzr1/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lzz0/l;

    invoke-static {v0, p1}, Lzz0/d;->a(Lkotlin/jvm/functions/Function1;Lzz0/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzr1/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lzx2/a;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lzr1/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lzv2/h;->k(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lzr1/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lzt2/j;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lzr1/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lzt2/j;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lzr1/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lzt2/i;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lzr1/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lzr1/b;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
