.class public final synthetic Lat2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lys2/e;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Lys2/e;)V
    .locals 0

    iput p1, p0, Lat2/h;->w:I

    iput-object p2, p0, Lat2/h;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lat2/h;->y:Lys2/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lat2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/h;->y:Lys2/e;

    invoke-static {v0, v1}, Lat2/m;->E(Lkotlin/jvm/functions/Function1;Lys2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lat2/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/h;->y:Lys2/e;

    invoke-static {v0, v1}, Lat2/m;->D(Lkotlin/jvm/functions/Function1;Lys2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lat2/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/h;->y:Lys2/e;

    invoke-static {v0, v1}, Lat2/m;->A(Lkotlin/jvm/functions/Function1;Lys2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lat2/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/h;->y:Lys2/e;

    invoke-static {v0, v1}, Lat2/m;->k(Lkotlin/jvm/functions/Function1;Lys2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lat2/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/h;->y:Lys2/e;

    invoke-static {v0, v1}, Lat2/m;->j(Lkotlin/jvm/functions/Function1;Lys2/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
