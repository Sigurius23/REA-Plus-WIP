.class public final Lrq0/l0;
.super Lcom/squareup/wire/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lrq0/l0;",
        "Lcom/squareup/wire/n;",
        "",
        "Lcom/whoop/domain/model/teams/LeadersEntry;",
        "Lcom/whoop/ui/ScoreContext;",
        "scoreContext",
        "Lcom/whoop/community/domain/model/teams/TimePeriod;",
        "timePeriod",
        "Lrq0/h1;",
        "viewModel",
        "<init>",
        "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;Lrq0/h1;)V",
        "Lib/j;",
        "s",
        "()Lib/j;",
        "c",
        "Lcom/whoop/ui/ScoreContext;",
        "getScoreContext",
        "()Lcom/whoop/ui/ScoreContext;",
        "d",
        "Lcom/whoop/community/domain/model/teams/TimePeriod;",
        "getTimePeriod",
        "()Lcom/whoop/community/domain/model/teams/TimePeriod;",
        "e",
        "Lrq0/h1;",
        "getViewModel",
        "()Lrq0/h1;",
        "Landroidx/lifecycle/u0;",
        "Lrq0/k0;",
        "f",
        "Landroidx/lifecycle/u0;",
        "liveData",
        "community_release"
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
.field private final c:Lcom/whoop/ui/ScoreContext;

.field private final d:Lcom/whoop/community/domain/model/teams/TimePeriod;

.field private final e:Lrq0/h1;

.field private final f:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;Lrq0/h1;)V
    .locals 1

    const-string v0, "scoreContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePeriod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x10

    invoke-direct {p0, v0}, Lcom/squareup/wire/n;-><init>(I)V

    iput-object p1, p0, Lrq0/l0;->c:Lcom/whoop/ui/ScoreContext;

    iput-object p2, p0, Lrq0/l0;->d:Lcom/whoop/community/domain/model/teams/TimePeriod;

    iput-object p3, p0, Lrq0/l0;->e:Lrq0/h1;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lrq0/l0;->f:Landroidx/lifecycle/u0;

    return-void
.end method


# virtual methods
.method public s()Lib/j;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lib/j;"
        }
    .end annotation

    new-instance v0, Lrq0/k0;

    iget-object v1, p0, Lrq0/l0;->c:Lcom/whoop/ui/ScoreContext;

    iget-object v2, p0, Lrq0/l0;->d:Lcom/whoop/community/domain/model/teams/TimePeriod;

    iget-object v3, p0, Lrq0/l0;->e:Lrq0/h1;

    invoke-direct {v0, v1, v2, v3}, Lrq0/k0;-><init>(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;Lrq0/h1;)V

    iget-object v1, p0, Lrq0/l0;->f:Landroidx/lifecycle/u0;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-object v0
.end method
