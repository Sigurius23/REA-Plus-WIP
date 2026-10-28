.class public interface abstract Lcom/whoop/bot/api/StartTurnApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J*\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/bot/api/StartTurnApi;",
        "",
        "",
        "path",
        "Lkotlinx/serialization/json/JsonElement;",
        "body",
        "Lpg3/v0;",
        "Lcom/whoop/ai/chat/view/startturnbutton/StartTurnResponse;",
        "startTurn",
        "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lq83/d;)Ljava/lang/Object;",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract startTurn(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Lkotlinx/serialization/json/JsonElement;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/view/startturnbutton/StartTurnResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
    .end annotation
.end method
