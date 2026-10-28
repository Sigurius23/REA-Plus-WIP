.class public abstract Lsr2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Ltf3/a;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "perBuildVariantModules",
        "app_prodStandardRelease"
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltf3/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lsr2/p;->b()Ltf3/a;

    move-result-object v0

    invoke-static {}, Lsr2/t;->w()Ltf3/a;

    move-result-object v1

    filled-new-array {v0, v1}, [Ltf3/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lsr2/o;->a:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltf3/a;",
            ">;"
        }
    .end annotation

    sget-object v0, Lsr2/o;->a:Ljava/util/List;

    return-object v0
.end method
