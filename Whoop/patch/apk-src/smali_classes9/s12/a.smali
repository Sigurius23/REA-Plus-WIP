.class public final Ls12/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls12/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Ls12/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "Liy1/c;",
        "metricWriter",
        "<init>",
        "(Lfi0/a;Liy1/c;)V",
        "",
        "source",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;)V",
        "Lr12/c;",
        "failure",
        "b",
        "(Lr12/c;)V",
        "Lfi0/a;",
        "Liy1/c;",
        "c",
        "onboarding-personalization_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Ls12/a$a;

.field public static final d:I


# instance fields
.field private final a:Lfi0/a;

.field private final b:Liy1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls12/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls12/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls12/a;->c:Ls12/a$a;

    const/16 v0, 0x8

    sput v0, Ls12/a;->d:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;Liy1/c;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls12/a;->a:Lfi0/a;

    iput-object p2, p0, Ls12/a;->b:Liy1/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Ls12/a;->a:Lfi0/a;

    const-string v1, "day_zero_personalization"

    if-nez p1, :cond_0

    move-object p1, v1

    :cond_0
    new-instance v2, Ll83/k;

    const-string v3, "source"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lfi0/a;->e(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final b(Lr12/c;)V
    .locals 9

    const-string v0, "failure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls12/a;->b:Liy1/c;

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    invoke-virtual {p1}, Lr12/c;->getTag()Ljava/lang/String;

    move-result-object p1

    const-string v1, "reason:"

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "platform:android"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v1, Ljy1/a;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "whoop.ai.day_zero.header_metadata_unusable"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method
