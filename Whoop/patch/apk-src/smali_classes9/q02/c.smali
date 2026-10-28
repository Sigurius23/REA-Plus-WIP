.class public abstract Lq02/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq02/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/navigation/models/GenericHttpMethod;",
        "Li63/t;",
        "b",
        "(Lcom/whoop/navigation/models/GenericHttpMethod;)Li63/t;",
        "nested-bff-arch-mini_release"
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
.method public static final synthetic a(Lcom/whoop/navigation/models/GenericHttpMethod;)Li63/t;
    .locals 0

    invoke-static {p0}, Lq02/c;->b(Lcom/whoop/navigation/models/GenericHttpMethod;)Li63/t;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/whoop/navigation/models/GenericHttpMethod;)Li63/t;
    .locals 1

    sget-object v0, Lq02/c$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Li63/t;->b:Li63/t;

    sget-object p0, Li63/t;->e:Li63/t;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Li63/t;->b:Li63/t;

    sget-object p0, Li63/t;->f:Li63/t;

    return-object p0

    :cond_2
    sget-object p0, Li63/t;->b:Li63/t;

    sget-object p0, Li63/t;->d:Li63/t;

    return-object p0

    :cond_3
    sget-object p0, Li63/t;->b:Li63/t;

    sget-object p0, Li63/t;->c:Li63/t;

    return-object p0

    :cond_4
    sget-object p0, Li63/t;->b:Li63/t;

    sget-object p0, Li63/t;->b:Li63/t;

    return-object p0
.end method
