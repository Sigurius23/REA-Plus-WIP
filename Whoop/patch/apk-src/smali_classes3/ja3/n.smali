.class public final Lja3/n;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Lja3/o;


# direct methods
.method public synthetic constructor <init>(Lja3/o;I)V
    .locals 0

    iput p2, p0, Lja3/n;->w:I

    iput-object p1, p0, Lja3/n;->x:Lja3/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lja3/n;->w:I

    check-cast p1, Lva3/h;

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/n;->x:Lja3/o;

    invoke-virtual {v0, p1}, Lja3/o;->F(Lva3/h;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/n;->x:Lja3/o;

    invoke-virtual {v0, p1}, Lja3/o;->E(Lva3/h;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
