.class public final synthetic Lpj2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p2, p0, Lpj2/s;->w:I

    iput-object p3, p0, Lpj2/s;->x:Lkotlin/jvm/functions/Function1;

    iput-object p1, p0, Lpj2/s;->y:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lpj2/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj2/s;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/s;->y:Ljava/util/List;

    invoke-static {v1, v0}, Lzr1/c;->k(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpj2/s;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/s;->y:Ljava/util/List;

    invoke-static {v1, v0}, Lpj2/t;->l(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpj2/s;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/s;->y:Ljava/util/List;

    invoke-static {v1, v0}, Lpj2/t;->k(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
