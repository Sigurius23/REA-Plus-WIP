.class public abstract Lcd2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u001aC\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a9\u0010\n\u001a\u00020\t*\u00020\u00082\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a9\u0010\u000c\u001a\u00020\t*\u00020\u00082\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\u001a9\u0010\r\u001a\u00020\t*\u00020\u00082\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000b\u001a9\u0010\u000e\u001a\u00020\t*\u00020\u00082\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000b\u001a9\u0010\u0010\u001a\u00020\t*\u00020\u00082\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\t*\u00020\u00082\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "",
        "analyticProperties",
        "",
        "backgroundEnabled",
        "assetId",
        "a",
        "(Ljava/util/Map;ZLjava/lang/String;)Ljava/util/Map;",
        "Lfi0/a;",
        "Ll83/a0;",
        "d",
        "(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V",
        "e",
        "f",
        "g",
        "backgroundEnabledAfterToggle",
        "c",
        "h",
        "(Lfi0/a;Ljava/util/Map;Z)V",
        "share_release"
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
.method private static final a(Ljava/util/Map;ZLjava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    if-eqz p1, :cond_0

    const-string p1, "enabled"

    goto :goto_0

    :cond_0
    const-string p1, "disabled"

    :goto_0
    const-string v1, "background"

    invoke-virtual {v0, v1, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    const-string p1, "asset_id"

    invoke-virtual {v0, p1, p2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    invoke-static {p0, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/Map;ZLjava/lang/String;ILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lcd2/c;->a(Ljava/util/Map;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfi0/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const-string v0, "background_enabled"

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const-string v0, "background_disabled"

    goto :goto_0

    :goto_1
    invoke-static {p1, p2, p3}, Lcd2/c;->a(Ljava/util/Map;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "click"

    const-string v5, "Sharing"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final d(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfi0/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, Lcd2/c;->a(Ljava/util/Map;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "click"

    const-string v4, "copy"

    const-string v5, "Sharing"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final e(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfi0/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, Lcd2/c;->a(Ljava/util/Map;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "click"

    const-string v4, "download"

    const-string v5, "Sharing"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final f(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfi0/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, Lcd2/c;->a(Ljava/util/Map;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "click"

    const-string v4, "message"

    const-string v5, "Sharing"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final g(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfi0/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, Lcd2/c;->a(Ljava/util/Map;ZLjava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "click"

    const-string v4, "more"

    const-string v5, "Sharing"

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final h(Lfi0/a;Ljava/util/Map;Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfi0/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p1, p2, v0, v1, v0}, Lcd2/c;->b(Ljava/util/Map;ZLjava/lang/String;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object v8

    const/16 v9, 0x11

    const/4 v10, 0x0

    const/4 v3, 0x0

    const-string v4, "view"

    const/4 v5, 0x0

    const-string v6, "Sharing"

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v10}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method
