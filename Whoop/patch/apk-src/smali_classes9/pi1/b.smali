.class public abstract Lpi1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001aG\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\u0008\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a-\u0010\r\u001a\u00020\u000c*\u00020\u00082\u0006\u0010\t\u001a\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u000c*\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u000c*\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u000c*\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0010\u001a\u0011\u0010\u0013\u001a\u00020\u000c*\u00020\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\u0010\u001a\u0011\u0010\u0014\u001a\u00020\u000c*\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0010\u001a\u0011\u0010\u0015\u001a\u00020\u000c*\u00020\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0010\u001a\u0019\u0010\u0016\u001a\u00020\u000c*\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\u000c*\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0017\u001a\u0019\u0010\u0019\u001a\u00020\u000c*\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u000c*\u00020\u0008\u00a2\u0006\u0004\u0008\u001a\u0010\u0010\u001a\u0011\u0010\u001b\u001a\u00020\u000c*\u00020\u0008\u00a2\u0006\u0004\u0008\u001b\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "",
        "Ll83/k;",
        "",
        "",
        "additionalProperties",
        "",
        "b",
        "([Ll83/k;)Ljava/util/Map;",
        "Lfi0/a;",
        "source",
        "value",
        "label",
        "Ll83/a0;",
        "m",
        "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "e",
        "(Lfi0/a;)V",
        "k",
        "f",
        "j",
        "d",
        "c",
        "i",
        "(Lfi0/a;Ljava/lang/String;)V",
        "l",
        "a",
        "g",
        "h",
        "health_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lfi0/a;Ljava/lang/String;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "dismissed_upsell"

    const-string v5, "Upgrade"

    const/4 v6, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private static final varargs b([Ll83/k;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ll83/k;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "source"

    const-string v1, "health_tab"

    invoke-static {v0, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p0}, Lm83/g0;->k0([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x35

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "scrolled_to_bottom"

    const/4 v4, 0x0

    const-string v5, "Health tab"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final d(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "Blood Pressure"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final e(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "Health Monitor - Entered"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final f(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "Healthspan"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final g(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x14

    const/4 v9, 0x0

    const-string v2, "MCI"

    const-string v3, "view_overview"

    const/4 v4, 0x0

    const-string v5, "MCI"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final h(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    const-string v1, "screen"

    const-string v2, "health_tab"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "click_advanced_labs_card"

    const/4 v4, 0x0

    const-string v5, "Bloodwork"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final i(Lfi0/a;Ljava/lang/String;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "clicked_feature"

    const-string v5, "Upgrade"

    const/4 v6, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final j(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "HI - Pregnancy"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final k(Lfi0/a;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "Stress Monitor"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final l(Lfi0/a;Ljava/lang/String;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lpi1/b;->b([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "clicked_upsell"

    const-string v5, "Upgrade"

    const/4 v6, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final m(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln83/f;

    invoke-direct {v1}, Ln83/f;-><init>()V

    invoke-virtual {v1, v0, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    const-string p1, "label"

    invoke-virtual {v1, p1, p3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :cond_0
    if-eqz p2, :cond_1

    const-string p1, "value"

    invoke-virtual {v1, p1, p2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v1}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    const-string p2, "Health tab"

    invoke-interface {p0, p2, p1}, Lfi0/a;->e(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
