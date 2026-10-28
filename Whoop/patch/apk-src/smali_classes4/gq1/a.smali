.class public final Lgq1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgq1/a$a;,
        Lgq1/a$b;,
        Lgq1/a$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0014\u0016\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ9\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lgq1/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "numImpacts",
        "Lgq1/a$c;",
        "targetMetric",
        "source",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/String;Lgq1/a$c;Ljava/lang/String;)V",
        "behaviorId",
        "Lgq1/a$b;",
        "impact",
        "behaviorTitle",
        "c",
        "(Ljava/lang/String;Lgq1/a$b;Ljava/lang/String;Lgq1/a$c;Ljava/lang/String;)V",
        "a",
        "(Ljava/lang/String;Lgq1/a$c;)V",
        "b",
        "()V",
        "Lfi0/a;",
        "behavior-impact_release"
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
.field public static final b:Lgq1/a$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgq1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgq1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgq1/a;->b:Lgq1/a$a;

    const/16 v0, 0x8

    sput v0, Lgq1/a;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgq1/a;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lgq1/a$c;)V
    .locals 8

    const-string v0, "behaviorId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetMetric"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v0, "Target Metric"

    invoke-virtual {p2}, Lgq1/a$c;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v7, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lgq1/a;->a:Lfi0/a;

    const-string v5, "Impacts"

    const/4 v6, 0x0

    const-string v2, "Behavior Details"

    const-string v3, "Close"

    move-object v4, p1

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final b()V
    .locals 7

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v0, "Source"

    const-string v1, "Impacts Summary"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lgq1/a;->a:Lfi0/a;

    const-string v4, "Settings - Journal"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-string v2, "Open"

    const/4 v3, 0x0

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Lgq1/a$b;Ljava/lang/String;Lgq1/a$c;Ljava/lang/String;)V
    .locals 8

    const-string v0, "behaviorId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impact"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetMetric"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v0, "Source"

    invoke-virtual {p2}, Lgq1/a$b;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v7, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "Target Metric"

    invoke-virtual {p4}, Lgq1/a$c;->getValue()Ljava/lang/String;

    move-result-object p4

    invoke-interface {v7, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p5, :cond_0

    const-string p2, "Behavior Title"

    invoke-interface {v7, p2, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lgq1/a;->a:Lfi0/a;

    const-string v3, "View"

    const-string v5, "Impacts"

    const-string v2, "Behavior Details"

    move-object v4, p1

    move-object v6, p3

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Lgq1/a$c;Ljava/lang/String;)V
    .locals 8

    const-string v0, "numImpacts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetMetric"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v0, "Target Metric"

    invoke-virtual {p2}, Lgq1/a$c;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v7, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    const-string p2, "Source"

    invoke-interface {v7, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lgq1/a;->a:Lfi0/a;

    const/4 v4, 0x0

    const-string v5, "Impacts"

    const-string v2, "Impacts Summary"

    const-string v3, "View"

    move-object v6, p1

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
