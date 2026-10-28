.class public final synthetic Lfx2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfx2/g;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lfx2/g;II)V
    .locals 0

    iput p3, p0, Lfx2/b;->w:I

    iput-object p1, p0, Lfx2/b;->x:Lfx2/g;

    iput p2, p0, Lfx2/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lfx2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lfx2/b;->y:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfx2/b;->x:Lfx2/g;

    invoke-static {v0, v1, p1}, Lfx2/g;->O(ILfx2/g;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lfx2/b;->y:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfx2/b;->x:Lfx2/g;

    invoke-static {v0, v1, p1}, Lfx2/g;->Z(ILfx2/g;Ltb/a;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lfx2/b;->y:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfx2/b;->x:Lfx2/g;

    invoke-static {v0, v1, p1}, Lfx2/g;->W(ILfx2/g;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Lfx2/b;->y:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfx2/b;->x:Lfx2/g;

    invoke-static {v0, v1, p1}, Lfx2/g;->e0(ILfx2/g;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, Lfx2/b;->y:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfx2/b;->x:Lfx2/g;

    invoke-static {v0, v1, p1}, Lfx2/g;->U(ILfx2/g;Ltb/a;)Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Lfx2/b;->y:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfx2/b;->x:Lfx2/g;

    invoke-static {v0, v1, p1}, Lfx2/g;->N(ILfx2/g;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
