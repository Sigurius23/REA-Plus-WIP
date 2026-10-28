.class public final synthetic Lrf2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrf2/c;

.field public final synthetic y:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;


# direct methods
.method public synthetic constructor <init>(Lrf2/c;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;I)V
    .locals 0

    iput p3, p0, Lrf2/b;->w:I

    iput-object p1, p0, Lrf2/b;->x:Lrf2/c;

    iput-object p2, p0, Lrf2/b;->y:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lrf2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrf2/b;->y:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lrf2/b;->x:Lrf2/c;

    invoke-static {v1, v0, p1}, Lrf2/c;->h(Lrf2/c;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrf2/b;->y:Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    check-cast p1, Lq83/d;

    iget-object v1, p0, Lrf2/b;->x:Lrf2/c;

    invoke-static {v1, v0, p1}, Lrf2/c;->j(Lrf2/c;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
