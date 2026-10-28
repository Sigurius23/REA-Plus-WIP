.class public final synthetic Ljm0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly3/c;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ly3/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ljm0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljm0/c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ljm0/c;->x:Ly3/c;

    return-void
.end method

.method public synthetic constructor <init>(Ly3/c;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Ljm0/c;->w:I

    iput-object p1, p0, Ljm0/c;->x:Ly3/c;

    iput-object p2, p0, Ljm0/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljm0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljm0/c;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ly2/y;

    iget-object v1, p0, Ljm0/c;->x:Ly3/c;

    invoke-static {v0, v1, p1}, Lz72/g;->f(Lkotlin/jvm/functions/Function1;Ly3/c;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljm0/c;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ly2/y;

    iget-object v1, p0, Ljm0/c;->x:Ly3/c;

    invoke-static {v0, v1, p1}, Lz72/g;->k(Lkotlin/jvm/functions/Function1;Ly3/c;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljm0/c;->x:Ly3/c;

    check-cast p1, Ly2/y;

    iget-object v1, p0, Ljm0/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Ljm0/d;->j(Lkotlin/jvm/functions/Function1;Ly3/c;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
