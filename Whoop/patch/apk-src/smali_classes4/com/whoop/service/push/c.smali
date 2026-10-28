.class public final Lcom/whoop/service/push/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JA\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/service/push/c;",
        "",
        "<init>",
        "()V",
        "Liy1/c;",
        "metricWriter",
        "Lm92/f;",
        "dataPayload",
        "",
        "notificationType",
        "Lzt/p;",
        "remoteMessage",
        "",
        "error",
        "recognized",
        "Ll83/a0;",
        "a",
        "(Liy1/c;Lm92/f;Ljava/lang/String;Lzt/p;ZLjava/lang/Boolean;)V",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Liy1/c;Lm92/f;Ljava/lang/String;Lzt/p;ZLjava/lang/Boolean;)V
    .locals 15

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "metricWriter"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "dataPayload"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "remoteMessage"

    move-object/from16 v4, p4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "itbl"

    invoke-virtual {v1, v3}, Lm92/f;->a(Ljava/lang/String;)Z

    move-result v1

    sget-object v3, Lcom/whoop/service/push/PushService;->O:Lcom/whoop/service/push/PushService$a;

    invoke-virtual {v3, v2}, Lcom/whoop/service/push/PushService$a;->b(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v4}, Lzt/p;->h()Ldb/j0;

    move-result-object v5

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lzt/p;->f()Ljava/util/Map;

    move-result-object v4

    const-string v7, "getData(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, La0/f1;

    invoke-virtual {v4}, La0/f1;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v6

    new-instance v6, Ljy1/a;

    const-string v7, "notificationType:"

    invoke-static {v7, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v2, "isIterablePush:"

    invoke-static {v2, v1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    const-string v1, "isIterablePushWhoop:"

    invoke-static {v1, v3}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v10

    const-string v1, "hasNotification:"

    invoke-static {v1, v5}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v11

    const-string v1, "hasData:"

    invoke-static {v1, v4}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v12

    const-string v1, "error:"

    move/from16 v2, p5

    invoke-static {v1, v2}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v13

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "recognized:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, p6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    filled-new-array/range {v8 .. v14}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const/16 v12, 0x15

    const/4 v13, 0x0

    const/4 v7, 0x0

    const-string v8, "push.received"

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v6}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method
