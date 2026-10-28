.class public final synthetic Lwr0/v0;
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

    iput p2, p0, Lwr0/v0;->w:I

    iput-object p1, p0, Lwr0/v0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwr0/v0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwr0/v0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lwr0/s;->b(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwr0/v0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lvy0/y;

    invoke-static {v0, p1}, Lwr0/m;->b(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lwr0/v0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    check-cast p1, Ld0/e;

    invoke-static {v0, p1}, Lwr0/u0$d;->f(Lp1/z0;Ld0/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
