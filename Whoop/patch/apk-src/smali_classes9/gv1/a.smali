.class public abstract Lgv1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Li51/i;",
        "",
        "isOverrideEnabled",
        "Lgv1/o;",
        "lottieSource",
        "a",
        "(Li51/i;ZLgv1/o;)Li51/i;",
        "lottie-tester_release"
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
.method public static final a(Li51/i;ZLgv1/o;)Li51/i;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    move-object v0, p0

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lgv1/p;->b(Lgv1/o;)Lv41/r0;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v1, Li51/h$d;

    invoke-direct {v1, p1}, Li51/h$d;-><init>(Lv41/r0;)V

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Li51/i;->b(Li51/i;Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;ZILjava/lang/Object;)Li51/i;

    move-result-object p0

    return-object p0

    :cond_2
    move-object v0, p0

    invoke-static {p2}, Lgv1/p;->a(Lgv1/o;)Lkd1/o;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance v1, Li51/h$c;

    invoke-direct {v1, p0}, Li51/h$c;-><init>(Lkd1/o;)V

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Li51/i;->b(Li51/i;Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;ZILjava/lang/Object;)Li51/i;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    return-object v0
.end method
