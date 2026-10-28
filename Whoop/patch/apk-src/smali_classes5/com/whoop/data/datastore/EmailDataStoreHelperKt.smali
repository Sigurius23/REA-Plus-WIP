.class public final Lcom/whoop/data/datastore/EmailDataStoreHelperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0002\"\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "USER_KEY_PREFIX",
        "Ljava/lang/String;",
        "LOG_TAG",
        "Lf6/d;",
        "EMAIL_KEY",
        "Lf6/d;",
        "core_release"
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
.field private static final EMAIL_KEY:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field

.field private static final LOG_TAG:Ljava/lang/String; = "[EmailDataStoreHelper]"

.field private static final USER_KEY_PREFIX:Ljava/lang/String; = "user_"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "user_email"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/datastore/EmailDataStoreHelperKt;->EMAIL_KEY:Lf6/d;

    return-void
.end method

.method public static final synthetic access$getEMAIL_KEY$p()Lf6/d;
    .locals 1

    sget-object v0, Lcom/whoop/data/datastore/EmailDataStoreHelperKt;->EMAIL_KEY:Lf6/d;

    return-object v0
.end method
