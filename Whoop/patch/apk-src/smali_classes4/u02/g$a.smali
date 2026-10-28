.class public final Lu02/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu02/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\u0008\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\u0008\u0001\u0010\u00042\u0006\u0010\n\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lu02/g$a;",
        "",
        "<init>",
        "()V",
        "T",
        "",
        "exception",
        "Lu02/e;",
        "a",
        "(Ljava/lang/Throwable;)Lu02/e;",
        "result",
        "Lu02/h;",
        "b",
        "(Ljava/lang/Object;)Lu02/h;",
        "network_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lu02/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lu02/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Lu02/e<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu02/e;

    sget-object v1, Lu02/d;->c:Lu02/d$a;

    invoke-virtual {v1, p1}, Lu02/d$a;->a(Ljava/lang/Throwable;)Lu02/d;

    move-result-object p1

    invoke-direct {v0, p1}, Lu02/e;-><init>(Lu02/d;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Lu02/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lu02/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lu02/h;

    invoke-direct {v0, p1}, Lu02/h;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
