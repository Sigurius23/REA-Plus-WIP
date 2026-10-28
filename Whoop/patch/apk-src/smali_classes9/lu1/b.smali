.class public abstract Llu1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\t\u0010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u0005\" \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lfi0/a;",
        "",
        "hrZone",
        "Ll83/a0;",
        "a",
        "(Lfi0/a;Ljava/lang/String;)V",
        "error",
        "c",
        "screen",
        "b",
        "componentId",
        "d",
        "",
        "Llu1/c;",
        "Ljava/util/Map;",
        "scrubEventData",
        "last-night-sleep_release"
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
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llu1/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Llu1/c;

    const-string v1, "type"

    const-string v2, "Sleep"

    invoke-static {v1, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "Activity Details"

    const-string v3, "sleep"

    invoke-direct {v0, v2, v3, v1}, Llu1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    new-instance v1, Ll83/k;

    const-string v2, "hours_of_sleep"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Llu1/c;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "Stress Monitor"

    const-string v5, "Sleep Stress"

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Llu1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ll83/k;

    const-string v2, "sleep_stress"

    invoke-direct {v0, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Llu1/b;->a:Ljava/util/Map;

    return-void
.end method

.method public static final a(Lfi0/a;Ljava/lang/String;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrZone"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    const-string v1, "type"

    const-string v2, "Sleep"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "activity"

    const-string v3, "sleep"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "source"

    const-string v4, "sleep_deep_dive"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x13

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v5, "Activity - Press Horizontal Bar Graph"

    const/4 v6, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final b(Lfi0/a;Ljava/lang/String;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    const-string v1, "sleep_deep_dive"

    invoke-static {v0, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const-string v4, "Open"

    const-string v6, "Explain Page"

    const-string v3, "Sleep"

    move-object v2, p0

    move-object v5, p1

    invoke-interface/range {v2 .. v7}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final c(Lfi0/a;Ljava/lang/String;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v4, "sleep"

    const-string v5, "Deep Dive"

    const-string v2, "last_nights_sleep"

    const-string v3, "error"

    move-object v1, p0

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final d(Lfi0/a;Ljava/lang/String;)V
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "componentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llu1/b;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llu1/c;

    if-nez p1, :cond_0

    new-instance v0, Llu1/c;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "unknown"

    const-string v2, "sleep"

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Llu1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Llu1/c;->c()Ljava/util/Map;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {p1}, Llu1/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llu1/c;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Data Scrubbing"

    const-string v2, "Press"

    move-object v0, p0

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_1
    move-object v0, p0

    invoke-virtual {p1}, Llu1/c;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Llu1/c;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Data Scrubbing"

    const-string v2, "Press"

    invoke-interface {v0, p0, v2, p1, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
