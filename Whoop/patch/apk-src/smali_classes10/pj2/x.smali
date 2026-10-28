.class public final synthetic Lpj2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/t2;

.field public final synthetic y:Llj2/g;


# direct methods
.method public synthetic constructor <init>(Lp1/t2;Llj2/g;I)V
    .locals 0

    iput p3, p0, Lpj2/x;->w:I

    iput-object p1, p0, Lpj2/x;->x:Lp1/t2;

    iput-object p2, p0, Lpj2/x;->y:Llj2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lpj2/x;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v3, p1

    check-cast v3, Lc0/o;

    move-object v4, p2

    check-cast v4, Leb/q;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lpj2/x;->x:Lp1/t2;

    iget-object v2, p0, Lpj2/x;->y:Llj2/g;

    invoke-static/range {v1 .. v6}, Lcom/whoop/stress/view/StressSessionFragment;->I(Lp1/t2;Llj2/g;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v2, p1

    check-cast v2, Lc0/o;

    move-object v3, p2

    check-cast v3, Leb/q;

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lpj2/x;->x:Lp1/t2;

    iget-object v1, p0, Lpj2/x;->y:Llj2/g;

    invoke-static/range {v0 .. v5}, Lcom/whoop/stress/view/StressSessionFragment;->H(Lp1/t2;Llj2/g;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
