.class public abstract Lcom/whoop/ai/chat/domain/formwidget/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/ai/chat/domain/formwidget/j;",
        "a",
        "(Lcom/whoop/ai/chat/domain/formwidget/j;)Lcom/whoop/ai/chat/domain/formwidget/j;",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/ai/chat/domain/formwidget/j;)Lcom/whoop/ai/chat/domain/formwidget/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/ai/chat/domain/formwidget/j$a;->a:Lcom/whoop/ai/chat/domain/formwidget/j$a;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    sget-object p0, Lcom/whoop/ai/chat/domain/formwidget/j$c;->a:Lcom/whoop/ai/chat/domain/formwidget/j$c;

    return-object p0
.end method
