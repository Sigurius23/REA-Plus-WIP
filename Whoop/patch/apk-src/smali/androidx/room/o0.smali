.class public final synthetic Landroidx/room/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Landroidx/room/o0;->w:I

    iput-object p1, p0, Landroidx/room/o0;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/room/o0;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/room/o0;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/room/o0;->x:Lc93/a;

    invoke-static {v0, p1}, Lsz0/m0;->c(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Landroidx/room/o0;->x:Lc93/a;

    invoke-static {v0, p1}, Lp31/n;->j(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Landroidx/room/o0;->x:Lc93/a;

    check-cast p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    invoke-static {v0, p1}, Lmo1/c;->a(Lc93/a;Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/t;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ltb/a;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/room/o0;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
