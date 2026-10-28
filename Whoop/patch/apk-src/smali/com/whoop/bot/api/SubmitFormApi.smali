.class public interface abstract Lcom/whoop/bot/api/SubmitFormApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J*\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ*\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/bot/api/SubmitFormApi;",
        "",
        "",
        "path",
        "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "submitAnswers",
        "(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;",
        "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormResponse;",
        "markComplete",
        "(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract markComplete(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/domain/formwidget/UpdateFormResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
    .end annotation
.end method

.method public abstract submitAnswers(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/y;
        .end annotation
    .end param
    .param p2    # Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
    .end annotation
.end method
