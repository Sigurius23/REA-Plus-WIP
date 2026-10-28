.class public final Lvj1/a$f;
.super Lvj1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvj1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lvj1/a$f;",
        "Lvj1/a;",
        "",
        "metricId",
        "Lhy0/b2;",
        "range",
        "Lak1/a;",
        "analyticsState",
        "<init>",
        "(Ljava/lang/String;Lhy0/b2;Lak1/a;)V",
        "health-monitor_release"
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
.method public constructor <init>(Ljava/lang/String;Lhy0/b2;Lak1/a;)V
    .locals 9

    const-string v0, "metricId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lvj1/c;->a(Lak1/a;)Lvj1/d;

    move-result-object v1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    move-object v2, p2

    goto :goto_0

    :cond_0
    move-object v2, p3

    :goto_0
    const-string p2, "Click"

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string p2, "toLowerCase(...)"

    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Lvj1/d;->b(Lvj1/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lvj1/d;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lvj1/a;-><init>(Lvj1/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
