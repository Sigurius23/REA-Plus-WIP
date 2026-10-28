.class public abstract Lgk2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\"\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lf6/d;",
        "",
        "a",
        "Lf6/d;",
        "KEY_LAST_KNOWN_APP_UPDATE",
        "tombstone_release"
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "lastKnownAppUpdate"

    invoke-static {v0}, Lge3/g;->I(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lgk2/e;->a:Lf6/d;

    return-void
.end method

.method public static final synthetic a()Lf6/d;
    .locals 1

    sget-object v0, Lgk2/e;->a:Lf6/d;

    return-object v0
.end method
