.class public abstract Lxx0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0002\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0002\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "g",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "f",
        "d",
        "c",
        "e",
        "Lfi0/a;",
        "source",
        "Ll83/a0;",
        "b",
        "(Lfi0/a;Ljava/lang/String;)V",
        "label",
        "a",
        "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V",
        "deep-dive_release"
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
.method public static final a(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "label"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const-string v4, "open"

    const-string v6, "Deep Dive"

    const-string v3, "Navigation"

    move-object v2, p0

    move-object v5, p2

    invoke-interface/range {v2 .. v7}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final b(Lfi0/a;Ljava/lang/String;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x31

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "scrolled_to_bottom"

    const-string v5, "Deep Dive"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6d97ca8b

    if-eq v0, v1, :cond_4

    const v1, -0xfb906b

    if-eq v0, v1, :cond_2

    const v1, 0x4b536b7

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "SLEEP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const-string p0, "Sleep"

    return-object p0

    :cond_2
    const-string v0, "RECOVERY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const-string p0, "Recovery"

    return-object p0

    :cond_4
    const-string v0, "STRAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "Strain"

    return-object p0

    :cond_5
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6d97ca8b

    if-eq v0, v1, :cond_4

    const v1, -0xfb906b

    if-eq v0, v1, :cond_2

    const v1, 0x4b536b7

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "SLEEP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const-string p0, "Sleep Deep Dive"

    return-object p0

    :cond_2
    const-string v0, "RECOVERY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const-string p0, "Recovery Deep Dive"

    return-object p0

    :cond_4
    const-string v0, "STRAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "Strain Deep Dive"

    return-object p0

    :cond_5
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6d97ca8b

    if-eq v0, v1, :cond_4

    const v1, -0xfb906b

    if-eq v0, v1, :cond_2

    const v1, 0x4b536b7

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "SLEEP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const-string p0, "sleep_deep_dive"

    return-object p0

    :cond_2
    const-string v0, "RECOVERY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const-string p0, "recovery_deep_dive"

    return-object p0

    :cond_4
    const-string v0, "STRAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "strain_deep_dive"

    return-object p0

    :cond_5
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6d97ca8b

    if-eq v0, v1, :cond_4

    const v1, -0xfb906b

    if-eq v0, v1, :cond_2

    const v1, 0x4b536b7

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "SLEEP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const-string p0, "Sleep Deep Dive \u2013 Trend"

    return-object p0

    :cond_2
    const-string v0, "RECOVERY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const-string p0, "Recovery Deep Dive \u2013 Trend"

    return-object p0

    :cond_4
    const-string v0, "STRAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "Strain Deep Dive \u2013 Trend"

    return-object p0

    :cond_5
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6d97ca8b

    if-eq v0, v1, :cond_4

    const v1, -0xfb906b

    if-eq v0, v1, :cond_2

    const v1, 0x4b536b7

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "SLEEP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const-string p0, "Sleep Deep Dive \u2013 Key Stat"

    return-object p0

    :cond_2
    const-string v0, "RECOVERY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const-string p0, "Recovery Deep Dive \u2013 Key Stat"

    return-object p0

    :cond_4
    const-string v0, "STRAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "Strain Deep Dive \u2013 Key Stat"

    return-object p0

    :cond_5
    :goto_0
    const-string p0, ""

    return-object p0
.end method
