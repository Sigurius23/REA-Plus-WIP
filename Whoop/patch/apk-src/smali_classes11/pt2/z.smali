.class public final synthetic Lpt2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lot2/t;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lot2/t;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lpt2/z;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpt2/z;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpt2/z;->z:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lpt2/z;->y:Lot2/t;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lot2/t;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lpt2/z;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpt2/z;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpt2/z;->y:Lot2/t;

    iput-object p3, p0, Lpt2/z;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lpt2/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpt2/z;->y:Lot2/t;

    iget-object v1, p0, Lpt2/z;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lpt2/z;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v1, v0}, Lpt2/a0;->e(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lot2/t;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpt2/z;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpt2/z;->y:Lot2/t;

    iget-object v2, p0, Lpt2/z;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lpt2/a0;->d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lot2/t;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
