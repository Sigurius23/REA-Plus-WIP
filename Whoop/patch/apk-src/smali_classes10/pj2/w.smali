.class public final synthetic Lpj2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llj2/g;

.field public final synthetic y:Lcom/whoop/stress/view/StressSessionFragment;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/stress/view/StressSessionFragment;Llj2/g;Lp1/t2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lpj2/w;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj2/w;->y:Lcom/whoop/stress/view/StressSessionFragment;

    iput-object p2, p0, Lpj2/w;->x:Llj2/g;

    iput-object p3, p0, Lpj2/w;->z:Lp1/t2;

    return-void
.end method

.method public synthetic constructor <init>(Llj2/g;Lcom/whoop/stress/view/StressSessionFragment;Lp1/t2;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lpj2/w;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj2/w;->x:Llj2/g;

    iput-object p2, p0, Lpj2/w;->y:Lcom/whoop/stress/view/StressSessionFragment;

    iput-object p3, p0, Lpj2/w;->z:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lpj2/w;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Lc0/o;

    move-object v5, p2

    check-cast v5, Leb/q;

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lpj2/w;->y:Lcom/whoop/stress/view/StressSessionFragment;

    iget-object v2, p0, Lpj2/w;->x:Llj2/g;

    iget-object v3, p0, Lpj2/w;->z:Lp1/t2;

    invoke-static/range {v1 .. v7}, Lcom/whoop/stress/view/StressSessionFragment;->G(Lcom/whoop/stress/view/StressSessionFragment;Llj2/g;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Lc0/o;

    move-object v4, p2

    check-cast v4, Leb/q;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lpj2/w;->y:Lcom/whoop/stress/view/StressSessionFragment;

    iget-object v1, p0, Lpj2/w;->x:Llj2/g;

    iget-object v2, p0, Lpj2/w;->z:Lp1/t2;

    invoke-static/range {v0 .. v6}, Lcom/whoop/stress/view/StressSessionFragment;->J(Lcom/whoop/stress/view/StressSessionFragment;Llj2/g;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
