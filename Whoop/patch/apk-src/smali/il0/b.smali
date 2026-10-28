.class public final Lil0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lil0/a;",
        "Lil0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lil0/b;",
        "Lod1/g;",
        "Lil0/a;",
        "Lil0/c;",
        "Lcom/whoop/bot/api/AiConversationApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lxk0/a;",
        "analyticsHelper",
        "<init>",
        "(Lcom/whoop/bot/api/AiConversationApi;Ltr2/n;Lxk0/a;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/bot/api/AiConversationApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lxk0/a;",
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


# instance fields
.field private final a:Lcom/whoop/bot/api/AiConversationApi;

.field private final b:Ltr2/n;

.field private final c:Lxk0/a;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/api/AiConversationApi;Ltr2/n;Lxk0/a;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lil0/b;->a:Lcom/whoop/bot/api/AiConversationApi;

    iput-object p2, p0, Lil0/b;->b:Ltr2/n;

    iput-object p3, p0, Lil0/b;->c:Lxk0/a;

    return-void
.end method

.method public static final synthetic c(Lil0/b;)Lxk0/a;
    .locals 0

    iget-object p0, p0, Lil0/b;->c:Lxk0/a;

    return-object p0
.end method

.method public static final synthetic d(Lil0/b;)Lcom/whoop/bot/api/AiConversationApi;
    .locals 0

    iget-object p0, p0, Lil0/b;->a:Lcom/whoop/bot/api/AiConversationApi;

    return-object p0
.end method

.method public static final synthetic e(Lil0/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lil0/b;->b:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lil0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lil0/b$a;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lil0/c;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lil0/c;-><init>(ZZLcom/whoop/bot/models/history/ConversationHistory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lil0/b$c;

    invoke-direct {v0, p0, v1}, Lil0/b$c;-><init>(Lil0/b;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
