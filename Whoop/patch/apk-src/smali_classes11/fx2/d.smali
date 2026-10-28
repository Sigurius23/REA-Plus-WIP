.class public final synthetic Lfx2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfx2/g;

.field public final synthetic y:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;


# direct methods
.method public synthetic constructor <init>(Lfx2/g;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;I)V
    .locals 0

    iput p3, p0, Lfx2/d;->w:I

    iput-object p1, p0, Lfx2/d;->x:Lfx2/g;

    iput-object p2, p0, Lfx2/d;->y:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lfx2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfx2/d;->y:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfx2/d;->x:Lfx2/g;

    invoke-static {v1, v0, p1}, Lfx2/g;->X(Lfx2/g;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lfx2/d;->y:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lfx2/d;->x:Lfx2/g;

    invoke-static {v1, v0, p1}, Lfx2/g;->d0(Lfx2/g;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
