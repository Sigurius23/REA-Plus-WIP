.class public final Lsh1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000c2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lsh1/a;",
        "",
        "Liy1/c;",
        "metricWriter",
        "<init>",
        "(Liy1/c;)V",
        "",
        "attributionTag",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;)V",
        "Liy1/c;",
        "b",
        "gps-tracking_release"
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
.field public static final b:Lsh1/a$a;

.field public static final c:I


# instance fields
.field private final a:Liy1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsh1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsh1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsh1/a;->b:Lsh1/a$a;

    const/16 v0, 0x8

    sput v0, Lsh1/a;->c:I

    return-void
.end method

.method public constructor <init>(Liy1/c;)V
    .locals 1

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh1/a;->a:Liy1/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 9

    const-string v0, "gpsTracking"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "event:gpsTracking"

    goto :goto_0

    :cond_0
    const-string p1, "event:other"

    :goto_0
    iget-object v0, p0, Lsh1/a;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "whoop.gps.access.requested"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method
