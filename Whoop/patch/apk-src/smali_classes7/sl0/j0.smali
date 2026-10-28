.class public final synthetic Lsl0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lsl0/j0;->w:I

    iput-object p1, p0, Lsl0/j0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lsl0/j0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/j0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsl0/j0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/j0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lsl0/j0;->y:Ljava/lang/Object;

    check-cast v1, Lkd1/o;

    iget-object v2, p0, Lsl0/j0;->z:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/design/util/TextResource;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lsl0/i1;->e(Lc93/a;Lkd1/o;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/j0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/view/AiConversationFragment;

    iget-object v1, p0, Lsl0/j0;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Lsl0/j0;->z:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    check-cast p1, Ljava/util/List;

    check-cast p2, Lsl0/q2;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment;->D(Lcom/whoop/bot/view/AiConversationFragment;Lbc3/c0;Lp1/t2;Ljava/util/List;Lsl0/q2;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
