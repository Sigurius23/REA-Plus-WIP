.class public abstract Lxg0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\"\u0018\u0010\u0008\u001a\u00020\u0005*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\"\u0018\u0010\n\u001a\u00020\u0005*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/ai/chat/models/AIMessage;",
        "Lnl0/b;",
        "a",
        "(Lcom/whoop/ai/chat/models/AIMessage;)Lnl0/b;",
        "chatMessageRole",
        "",
        "c",
        "(Lcom/whoop/ai/chat/models/AIMessage;)Z",
        "isUser",
        "b",
        "isAssistant",
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
.method public static final a(Lcom/whoop/ai/chat/models/AIMessage;)Lnl0/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/AIMessage;->getRole()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "assistant"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lnl0/b;->ASSISTANT:Lnl0/b;

    return-object p0

    :sswitch_1
    const-string v0, "user"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Lnl0/b;->USER:Lnl0/b;

    return-object p0

    :sswitch_2
    const-string v0, "tool"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p0, Lnl0/b;->TOOL:Lnl0/b;

    return-object p0

    :sswitch_3
    const-string v0, "system"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    :goto_0
    sget-object p0, Lnl0/b;->SYSTEM:Lnl0/b;

    return-object p0

    :cond_3
    sget-object p0, Lnl0/b;->SYSTEM:Lnl0/b;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x34e38dd1 -> :sswitch_3
        0x366998 -> :sswitch_2
        0x36ebcb -> :sswitch_1
        0x553972de -> :sswitch_0
    .end sparse-switch
.end method

.method public static final b(Lcom/whoop/ai/chat/models/AIMessage;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/AIMessage;->getRole()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lnl0/b;->ASSISTANT:Lnl0/b;

    invoke-virtual {v0}, Lnl0/b;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final c(Lcom/whoop/ai/chat/models/AIMessage;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/ai/chat/models/AIMessage;->getRole()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lnl0/b;->USER:Lnl0/b;

    invoke-virtual {v0}, Lnl0/b;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
