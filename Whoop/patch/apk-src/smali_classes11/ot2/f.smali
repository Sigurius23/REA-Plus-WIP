.class public final synthetic Lot2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/models/items/HorizontalStatModel;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/models/items/HorizontalStatModel;I)V
    .locals 0

    iput p2, p0, Lot2/f;->w:I

    iput-object p1, p0, Lot2/f;->x:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lot2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lot2/f;->x:Lcom/whoop/design/models/items/HorizontalStatModel;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Lot2/h;->b(Lcom/whoop/design/models/items/HorizontalStatModel;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lot2/f;->x:Lcom/whoop/design/models/items/HorizontalStatModel;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Lot2/g;->a(Lcom/whoop/design/models/items/HorizontalStatModel;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
