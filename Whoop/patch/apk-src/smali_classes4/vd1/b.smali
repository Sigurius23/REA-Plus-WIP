.class public final synthetic Lvd1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvd1/d;


# direct methods
.method public synthetic constructor <init>(Lvd1/d;I)V
    .locals 0

    iput p2, p0, Lvd1/b;->w:I

    iput-object p1, p0, Lvd1/b;->x:Lvd1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvd1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvd1/b;->x:Lvd1/d;

    check-cast p1, Lot0/a;

    invoke-static {v0, p1}, Lvd1/d;->k(Lvd1/d;Lot0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvd1/b;->x:Lvd1/d;

    check-cast p1, Lot0/a;

    invoke-static {v0, p1}, Lvd1/d;->f(Lvd1/d;Lot0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lvd1/b;->x:Lvd1/d;

    check-cast p1, Lek0/u;

    invoke-static {v0, p1}, Lvd1/d;->j(Lvd1/d;Lek0/u;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lvd1/b;->x:Lvd1/d;

    check-cast p1, Ltd1/e;

    invoke-static {v0, p1}, Lvd1/d;->i(Lvd1/d;Ltd1/e;)Ll83/a0;

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
