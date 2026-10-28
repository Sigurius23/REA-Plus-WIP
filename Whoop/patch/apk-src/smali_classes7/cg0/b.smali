.class public abstract Lcg0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001aG\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\u0008\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a!\u0010\u000c\u001a\u00020\u000b*\u00020\u00082\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\u00082\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u000b*\u00020\u00082\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000f\u001a!\u0010\u0013\u001a\u00020\u000b*\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\r\u00a8\u0006\u0014"
    }
    d2 = {
        "",
        "Ll83/k;",
        "",
        "",
        "additionalProperties",
        "",
        "c",
        "([Ll83/k;)Ljava/util/Map;",
        "Lfi0/a;",
        "source",
        "testCount",
        "Ll83/a0;",
        "e",
        "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V",
        "a",
        "(Lfi0/a;Ljava/lang/String;)V",
        "b",
        "testsChangingTo",
        "testsChangingFrom",
        "d",
        "advanced-labs-join_release"
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

    const-string v0, "testCount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lcg0/b;->c([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "change_test_count"

    const/4 v4, 0x0

    const-string v5, "Bloodwork"

    move-object v1, p0

    move-object v6, p1

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final b(Lfi0/a;Ljava/lang/String;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testCount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ll83/k;

    invoke-static {v0}, Lcg0/b;->c([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "click_to_switch"

    const/4 v4, 0x0

    const-string v5, "Bloodwork"

    move-object v1, p0

    move-object v6, p1

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private static final varargs c([Ll83/k;)Ljava/util/Map;
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

    const-string v0, "screen"

    const-string v1, "switching"

    invoke-static {v0, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p0}, Lm83/g0;->k0([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testsChangingTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testsChangingFrom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/k;

    const-string v1, "tests_changing_from"

    invoke-direct {v0, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Lcg0/b;->c([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "switching_modal_pop"

    const/4 v3, 0x0

    const-string v4, "Bloodwork"

    move-object v0, p0

    move-object v5, p1

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static final e(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "testCount"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lcg0/b;->c([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "view"

    const/4 v3, 0x0

    const-string v4, "Bloodwork"

    move-object v0, p0

    move-object v5, p2

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method
