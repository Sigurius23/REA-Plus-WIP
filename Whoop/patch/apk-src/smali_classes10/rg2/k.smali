.class public abstract Lrg2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\" \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lrg2/j;",
        "",
        "selectedInternalName",
        "Lrg2/h;",
        "a",
        "(Lrg2/j;Ljava/lang/String;)Lrg2/h;",
        "",
        "Ljava/util/List;",
        "getSamplePreSessionRecentActivityItems",
        "()Ljava/util/List;",
        "samplePreSessionRecentActivityItems",
        "start-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lrg2/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lrg2/j;

    sget-object v6, Lcom/whoop/addactivity/network/model/ScoreType;->CARDIO:Lcom/whoop/addactivity/network/model/ScoreType;

    const-string v1, "walking"

    const-string v2, "Walking"

    const-string v3, ""

    const/4 v4, 0x0

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lrg2/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/addactivity/network/model/ScoreType;)V

    new-instance v1, Lrg2/j;

    const-string v4, ""

    const/4 v5, 0x0

    const-string v2, "weightlifting"

    const-string v3, "Weightlifting"

    invoke-direct/range {v1 .. v6}, Lrg2/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/addactivity/network/model/ScoreType;)V

    move-object v7, v1

    new-instance v1, Lrg2/j;

    const-string v4, ""

    const/4 v5, 0x1

    const-string v2, "running"

    const-string v3, "Running"

    invoke-direct/range {v1 .. v6}, Lrg2/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/addactivity/network/model/ScoreType;)V

    move-object v8, v1

    new-instance v1, Lrg2/j;

    const-string v4, ""

    const/4 v5, 0x0

    const-string v2, "functional-fitness"

    const-string v3, "Functional Fitness"

    invoke-direct/range {v1 .. v6}, Lrg2/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/addactivity/network/model/ScoreType;)V

    move-object v9, v1

    new-instance v1, Lrg2/j;

    const-string v4, ""

    const-string v2, "cycling"

    const-string v3, "Cycling"

    invoke-direct/range {v1 .. v6}, Lrg2/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/addactivity/network/model/ScoreType;)V

    filled-new-array {v0, v7, v8, v9, v1}, [Lrg2/j;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lrg2/k;->a:Ljava/util/List;

    return-void
.end method

.method public static final a(Lrg2/j;Ljava/lang/String;)Lrg2/h;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lrg2/h;

    invoke-virtual {p0}, Lrg2/j;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lrg2/j;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lrg2/j;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p0}, Lrg2/j;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lrg2/j;->e()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lrg2/j;->b()Z

    move-result v7

    invoke-direct/range {v1 .. v7}, Lrg2/h;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method
