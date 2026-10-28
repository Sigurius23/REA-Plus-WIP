.class public final synthetic Lc41/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lk91/b;


# direct methods
.method public synthetic constructor <init>(Lk91/b;I)V
    .locals 0

    iput p2, p0, Lc41/z0;->w:I

    iput-object p1, p0, Lc41/z0;->x:Lk91/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc41/z0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/z0;->x:Lk91/b;

    check-cast p1, Lf2/d;

    invoke-static {v0, p1}, Llf0/h1;->f(Lk91/b;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/z0;->x:Lk91/b;

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Llf0/h1;->c(Lk91/b;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc41/z0;->x:Lk91/b;

    check-cast p1, Lf2/d;

    invoke-static {v0, p1}, Lc41/b1;->e(Lk91/b;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lc41/z0;->x:Lk91/b;

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lc41/b1;->b(Lk91/b;Li2/g0;)Ll83/a0;

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
