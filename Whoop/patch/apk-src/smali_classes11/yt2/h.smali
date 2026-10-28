.class public final synthetic Lyt2/h;
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

    iput p2, p0, Lyt2/h;->w:I

    iput-object p1, p0, Lyt2/h;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyt2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyt2/h;->x:Ljava/lang/Object;

    check-cast v0, Ly2/j1;

    check-cast p1, Ly2/i1;

    invoke-static {v0, p1}, Lyt2/k;->o(Ly2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyt2/h;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {p1, v0}, Lyt2/k;->i(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
