.class public final synthetic Lis0/t;
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

    iput p2, p0, Lis0/t;->w:I

    iput-object p1, p0, Lis0/t;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lis0/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/t;->x:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lis0/j0;->y(Lp1/z0;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lis0/t;->x:Ljava/lang/Object;

    check-cast v0, Lm91/w;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Lis0/j0;->m(Lm91/w;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lis0/t;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lis0/j0;->x(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lis0/t;->x:Ljava/lang/Object;

    check-cast v0, Ly2/j1;

    check-cast p1, Ly2/i1;

    invoke-static {v0, p1}, Lis0/x;->c(Ly2/j1;Ly2/i1;)Ll83/a0;

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
