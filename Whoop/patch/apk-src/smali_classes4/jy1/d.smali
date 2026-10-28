.class public abstract Ljy1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0008\u0005\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0001\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lmb/b;",
        "a",
        "Lmb/b;",
        "getMIGRATION_1_2",
        "()Lmb/b;",
        "MIGRATION_1_2",
        "",
        "b",
        "[Lmb/b;",
        "()[Lmb/b;",
        "METRICS_DATABASE_MIGRATIONS",
        "metrics_release"
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
.field private static final a:Lmb/b;

.field private static final b:[Lmb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljy1/d$a;

    invoke-direct {v0}, Ljy1/d$a;-><init>()V

    sput-object v0, Ljy1/d;->a:Lmb/b;

    const/4 v1, 0x1

    new-array v1, v1, [Lmb/b;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Ljy1/d;->b:[Lmb/b;

    return-void
.end method

.method public static final a()[Lmb/b;
    .locals 1

    sget-object v0, Ljy1/d;->b:[Lmb/b;

    return-object v0
.end method
