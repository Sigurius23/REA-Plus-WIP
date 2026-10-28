.class public final Lcom/whoop/data/remote/AppConfigurationRepository$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/remote/AppConfigurationRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/data/remote/AppConfigurationRepository$Companion;",
        "",
        "<init>",
        "()V",
        "SOURCE_TOKEN_REFRESH",
        "",
        "SOURCE_USER_LOGIN",
        "SOURCE_USER_ACCOUNT_CREATION",
        "SOURCE_LANGUAGE_CHANGE",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/whoop/data/remote/AppConfigurationRepository$Companion;

.field public static final SOURCE_LANGUAGE_CHANGE:Ljava/lang/String; = "language_change"

.field public static final SOURCE_TOKEN_REFRESH:Ljava/lang/String; = "token_refresh"

.field public static final SOURCE_USER_ACCOUNT_CREATION:Ljava/lang/String; = "user_account_creation"

.field public static final SOURCE_USER_LOGIN:Ljava/lang/String; = "user_login"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/data/remote/AppConfigurationRepository$Companion;

    invoke-direct {v0}, Lcom/whoop/data/remote/AppConfigurationRepository$Companion;-><init>()V

    sput-object v0, Lcom/whoop/data/remote/AppConfigurationRepository$Companion;->$$INSTANCE:Lcom/whoop/data/remote/AppConfigurationRepository$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
