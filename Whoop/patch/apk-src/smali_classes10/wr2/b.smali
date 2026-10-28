.class public final synthetic Lwr2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lwr2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwr2/b;->w:I

    check-cast p1, Lwr2/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lwr2/c;->f(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lwr2/c;->h(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lwr2/c;->b(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Lwr2/c;->c(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lwr2/c;->a(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1}, Lwr2/c;->d(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Lwr2/c;->i(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1}, Lwr2/c;->e(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1}, Lwr2/c;->g(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Lwr2/c;->j(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
