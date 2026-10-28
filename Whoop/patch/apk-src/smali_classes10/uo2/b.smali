.class public abstract Luo2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Liy1/c;",
        "Ll83/a0;",
        "b",
        "(Liy1/c;)V",
        "a",
        "universal-checkout_release"
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
.method public static final a(Liy1/c;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljy1/a;

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "truemed.successful_checkout"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method

.method public static final b(Liy1/c;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljy1/a;

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "truemed.exit"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method
