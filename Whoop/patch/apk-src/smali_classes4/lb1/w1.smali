.class public final synthetic Llb1/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llb1/z0;


# direct methods
.method public synthetic constructor <init>(Llb1/z0;I)V
    .locals 0

    iput p2, p0, Llb1/w1;->w:I

    iput-object p1, p0, Llb1/w1;->x:Llb1/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llb1/w1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llb1/w1;->x:Llb1/z0;

    check-cast p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;

    invoke-static {v0, p1}, Lvb1/b;->d(Llb1/z0;Lcom/whoop/design/models/items/graph/GraphingCardModel;)Lk71/m;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Llb1/w1;->x:Llb1/z0;

    check-cast p1, Lcom/whoop/design/models/items/GoalTileModel;

    invoke-static {v0, p1}, Llb1/x1;->b(Llb1/z0;Lcom/whoop/design/models/items/GoalTileModel;)Lw11/c;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
