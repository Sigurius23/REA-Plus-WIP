.class public final Lzl0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzl0/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lzl0/b;",
        "Lzl0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0008\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lzl0/d;",
        "Lod1/g;",
        "Lzl0/b;",
        "Lzl0/c;",
        "Lcom/whoop/bot/api/CommitSelectionApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "initialState",
        "<init>",
        "(Lcom/whoop/bot/api/CommitSelectionApi;Ltr2/n;Lzl0/c;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/bot/api/CommitSelectionApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lzl0/c;",
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
.field private final a:Lcom/whoop/bot/api/CommitSelectionApi;

.field private final b:Ltr2/n;

.field private final c:Lzl0/c;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/api/CommitSelectionApi;Ltr2/n;Lzl0/c;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzl0/d;->a:Lcom/whoop/bot/api/CommitSelectionApi;

    iput-object p2, p0, Lzl0/d;->b:Ltr2/n;

    iput-object p3, p0, Lzl0/d;->c:Lzl0/c;

    return-void
.end method

.method public static final synthetic c(Lzl0/d;)Lcom/whoop/bot/api/CommitSelectionApi;
    .locals 0

    iget-object p0, p0, Lzl0/d;->a:Lcom/whoop/bot/api/CommitSelectionApi;

    return-object p0
.end method

.method public static final synthetic d(Lzl0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lzl0/d;->b:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
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

    new-instance v0, Lzl0/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzl0/d$b;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    iget-object v0, p0, Lzl0/d;->c:Lzl0/c;

    new-instance v2, Lzl0/d$c;

    invoke-direct {v2, p0, v1}, Lzl0/d$c;-><init>(Lzl0/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
