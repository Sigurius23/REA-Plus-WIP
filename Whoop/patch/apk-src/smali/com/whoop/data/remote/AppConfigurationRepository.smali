.class public interface abstract Lcom/whoop/data/remote/AppConfigurationRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/AppConfigurationRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/remote/AppConfigurationRepository;",
        "",
        "",
        "source",
        "",
        "refresh",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
        "Companion",
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
.field public static final Companion:Lcom/whoop/data/remote/AppConfigurationRepository$Companion;

.field public static final SOURCE_LANGUAGE_CHANGE:Ljava/lang/String; = "language_change"

.field public static final SOURCE_TOKEN_REFRESH:Ljava/lang/String; = "token_refresh"

.field public static final SOURCE_USER_ACCOUNT_CREATION:Ljava/lang/String; = "user_account_creation"

.field public static final SOURCE_USER_LOGIN:Ljava/lang/String; = "user_login"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/AppConfigurationRepository$Companion;->$$INSTANCE:Lcom/whoop/data/remote/AppConfigurationRepository$Companion;

    sput-object v0, Lcom/whoop/data/remote/AppConfigurationRepository;->Companion:Lcom/whoop/data/remote/AppConfigurationRepository$Companion;

    return-void
.end method


# virtual methods
.method public abstract clear(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract refresh(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
