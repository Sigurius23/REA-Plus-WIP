.class public final Lrq0/t0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrq0/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrq0/t0$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lrq0/t0$a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/ui/ScoreContext;",
        "scoreContext",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "teamType",
        "Lcom/whoop/community/domain/model/teams/TimePeriod;",
        "timePeriod",
        "",
        "sortBy",
        "Lrq0/t0;",
        "b",
        "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/domain/model/teams/TeamType;Lcom/whoop/community/domain/model/teams/TimePeriod;I)Lrq0/t0;",
        "",
        "a",
        "(Lcom/whoop/ui/ScoreContext;)Ljava/lang/String;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lrq0/t0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/ui/ScoreContext;)Ljava/lang/String;
    .locals 1

    const-string v0, "scoreContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrq0/t0$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-string p1, "Team Sleep"

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "Team Recovery"

    return-object p1

    :cond_2
    const-string p1, "Team Strain"

    return-object p1

    :cond_3
    const-string p1, "Team Overview"

    return-object p1
.end method

.method public final b(Lcom/whoop/ui/ScoreContext;Lcom/whoop/domain/model/teams/TeamType;Lcom/whoop/community/domain/model/teams/TimePeriod;I)Lrq0/t0;
    .locals 5

    const-string v0, "scoreContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "teamType"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "timePeriod"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lrq0/t0;

    invoke-direct {v3}, Lrq0/t0;-><init>()V

    invoke-static {v3}, Lrq0/t0;->a0(Lrq0/t0;)Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-static {v3}, Lrq0/t0;->a0(Lrq0/t0;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p1, v1, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-static {v3}, Lrq0/t0;->a0(Lrq0/t0;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p1, v2, p3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-static {v3}, Lrq0/t0;->a0(Lrq0/t0;)Landroid/os/Bundle;

    move-result-object p1

    const-string p2, "sortBy"

    invoke-virtual {p1, p2, p4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v3
.end method
