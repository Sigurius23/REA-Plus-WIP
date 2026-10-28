.class public final synthetic Lod1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/g;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lod1/f;

.field public final synthetic y:Lcom/whoop/service/network/model/cycles/Workout;

.field public final synthetic z:Lcom/whoop/service/network/model/Sport;


# direct methods
.method public synthetic constructor <init>(Lod1/f;Lcom/whoop/service/network/model/cycles/Workout;Lcom/whoop/service/network/model/Sport;I)V
    .locals 0

    iput p4, p0, Lod1/d;->w:I

    iput-object p1, p0, Lod1/d;->x:Lod1/f;

    iput-object p2, p0, Lod1/d;->y:Lcom/whoop/service/network/model/cycles/Workout;

    iput-object p3, p0, Lod1/d;->z:Lcom/whoop/service/network/model/Sport;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lod1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lod1/d;->z:Lcom/whoop/service/network/model/Sport;

    check-cast p1, Lpg3/v0;

    iget-object v1, p0, Lod1/d;->x:Lod1/f;

    iget-object v2, p0, Lod1/d;->y:Lcom/whoop/service/network/model/cycles/Workout;

    invoke-static {v1, v2, v0, p1}, Lod1/f;->a(Lod1/f;Lcom/whoop/service/network/model/cycles/Workout;Lcom/whoop/service/network/model/Sport;Lpg3/v0;)Lod1/k;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lod1/d;->z:Lcom/whoop/service/network/model/Sport;

    check-cast p1, Lpg3/v0;

    iget-object v1, p0, Lod1/d;->x:Lod1/f;

    iget-object v2, p0, Lod1/d;->y:Lcom/whoop/service/network/model/cycles/Workout;

    invoke-static {v1, v2, v0, p1}, Lod1/f;->b(Lod1/f;Lcom/whoop/service/network/model/cycles/Workout;Lcom/whoop/service/network/model/Sport;Lpg3/v0;)Lod1/k;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
