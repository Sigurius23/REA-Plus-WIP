.class public final Lrq0/e1$a;
.super Lcom/squareup/wire/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrq0/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lrq0/e1$a;",
        "Lcom/squareup/wire/n;",
        "",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "Lrq0/e1;",
        "viewModel",
        "<init>",
        "(Lrq0/e1;)V",
        "Lib/j;",
        "s",
        "()Lib/j;",
        "c",
        "Lrq0/e1;",
        "getViewModel",
        "()Lrq0/e1;",
        "Landroidx/lifecycle/u0;",
        "Lrq0/e1$b;",
        "d",
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
.field private final c:Lrq0/e1;

.field private final d:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lrq0/e1;)V
    .locals 1

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x10

    invoke-direct {p0, v0}, Lcom/squareup/wire/n;-><init>(I)V

    iput-object p1, p0, Lrq0/e1$a;->c:Lrq0/e1;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lrq0/e1$a;->d:Landroidx/lifecycle/u0;

    return-void
.end method


# virtual methods
.method public s()Lib/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lib/j;"
        }
    .end annotation

    new-instance v0, Lrq0/e1$b;

    iget-object v1, p0, Lrq0/e1$a;->c:Lrq0/e1;

    invoke-direct {v0, v1}, Lrq0/e1$b;-><init>(Lrq0/e1;)V

    iget-object v1, p0, Lrq0/e1$a;->d:Landroidx/lifecycle/u0;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-object v0
.end method
