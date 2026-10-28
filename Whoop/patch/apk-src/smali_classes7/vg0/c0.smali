.class public abstract Lvg0/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ltg0/c;",
        "",
        "value",
        "b",
        "(Ltg0/c;Z)Ltg0/c;",
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
.method public static final synthetic a(Ltg0/c;Z)Ltg0/c;
    .locals 0

    invoke-static {p0, p1}, Lvg0/c0;->b(Ltg0/c;Z)Ltg0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ltg0/c;Z)Ltg0/c;
    .locals 20

    invoke-virtual/range {p0 .. p0}, Ltg0/c;->c()Ltg0/b;

    move-result-object v1

    const v18, 0xfeff

    const/16 v19, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v10, p1

    invoke-static/range {v1 .. v19}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    move-object/from16 v3, p0

    invoke-static {v3, v0, v1, v2, v1}, Ltg0/c;->b(Ltg0/c;Ltg0/b;Lvg0/e;ILjava/lang/Object;)Ltg0/c;

    move-result-object v0

    return-object v0
.end method
