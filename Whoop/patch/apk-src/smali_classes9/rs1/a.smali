.class public abstract Lrs1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "heartRate",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "(I)Lcom/whoop/design/util/TextResource;",
        "b",
        "labrador_release"
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
.method public static final a(I)Lcom/whoop/design/util/TextResource;
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    const/4 v2, 0x1

    if-eq p0, v2, :cond_0

    const/16 v2, 0xfe

    if-eq p0, v2, :cond_1

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    return-object v0

    :cond_0
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lrs1/f;->N:I

    invoke-direct {p0, v2, v1, v0, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_1
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lrs1/f;->O:I

    invoke-direct {p0, v2, v1, v0, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static final b(I)Lcom/whoop/design/util/TextResource;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const/4 v1, 0x1

    if-eq p0, v1, :cond_0

    const/16 v1, 0xfe

    if-eq p0, v1, :cond_1

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    return-object v0

    :cond_0
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lrs1/f;->N:I

    const/4 v2, 0x2

    invoke-direct {p0, v1, v0, v2, v0}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_1
    return-object v0
.end method
