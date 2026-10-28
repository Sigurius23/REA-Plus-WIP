.class public final synthetic Lcom/whoop/data/local/room/dao/wipeable/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/data/local/room/dao/wipeable/b;->w:I

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/b;->x:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/dao/wipeable/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/b;->x:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->c(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/b;->x:Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->d(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
