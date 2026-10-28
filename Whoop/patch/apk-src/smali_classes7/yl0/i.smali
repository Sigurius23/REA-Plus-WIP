.class public abstract Lyl0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\u0008\u00030\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lu02/a$b;",
        "Lyl0/e;",
        "b",
        "(Lu02/a$b;)Lyl0/e;",
        "",
        "",
        "a",
        "Ljava/util/Set;",
        "RETRYABLE_HTTP_CODES",
        "bot_release"
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
.field private static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x198

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x1ad

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lyl0/i;->a:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic a(Lu02/a$b;)Lyl0/e;
    .locals 0

    invoke-static {p0}, Lyl0/i;->b(Lu02/a$b;)Lyl0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lu02/a$b;)Lyl0/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu02/a$b<",
            "*>;)",
            "Lyl0/e;"
        }
    .end annotation

    instance-of v0, p0, Lu02/a$b$b;

    if-eqz v0, :cond_0

    sget-object p0, Lyl0/e;->RETRYABLE_ERROR:Lyl0/e;

    return-object p0

    :cond_0
    instance-of v0, p0, Lu02/a$b$a$a;

    if-eqz v0, :cond_1

    sget-object p0, Lyl0/e;->TERMINAL_ERROR:Lyl0/e;

    return-object p0

    :cond_1
    instance-of v0, p0, Lu02/a$b$a;

    if-eqz v0, :cond_4

    check-cast p0, Lu02/a$b$a;

    invoke-virtual {p0}, Lu02/a$b$a;->d()I

    move-result v0

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_3

    sget-object v0, Lyl0/i;->a:Ljava/util/Set;

    invoke-virtual {p0}, Lu02/a$b$a;->d()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p0, Lyl0/e;->TERMINAL_ERROR:Lyl0/e;

    return-object p0

    :cond_3
    :goto_0
    sget-object p0, Lyl0/e;->RETRYABLE_ERROR:Lyl0/e;

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
