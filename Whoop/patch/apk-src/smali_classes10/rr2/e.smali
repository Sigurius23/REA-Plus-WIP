.class public abstract Lrr2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0002\"\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\"\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0005\u00a8\u0006\t"
    }
    d2 = {
        "Lf6/d;",
        "",
        "a",
        "Lf6/d;",
        "b",
        "()Lf6/d;",
        "DID_CRASH",
        "",
        "CRASH_TIME",
        "essentials_release"
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
.field private static final a:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field

.field private static final b:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "DID_CRASH"

    invoke-static {v0}, Lge3/g;->f(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lrr2/e;->a:Lf6/d;

    const-string v0, "CRASH_TIME"

    invoke-static {v0}, Lge3/g;->I(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lrr2/e;->b:Lf6/d;

    return-void
.end method

.method public static final a()Lf6/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf6/d;"
        }
    .end annotation

    sget-object v0, Lrr2/e;->b:Lf6/d;

    return-object v0
.end method

.method public static final b()Lf6/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf6/d;"
        }
    .end annotation

    sget-object v0, Lrr2/e;->a:Lf6/d;

    return-object v0
.end method
