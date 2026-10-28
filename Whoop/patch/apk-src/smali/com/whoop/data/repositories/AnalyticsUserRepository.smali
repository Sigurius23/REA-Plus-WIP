.class public final Lcom/whoop/data/repositories/AnalyticsUserRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/data/repositories/AnalyticsUserRepository;",
        "",
        "<init>",
        "()V",
        "newUser",
        "",
        "getNewUser",
        "()Z",
        "setNewUser",
        "(Z)V",
        "userType",
        "",
        "getUserType",
        "()Ljava/lang/String;",
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
.field public static final INSTANCE:Lcom/whoop/data/repositories/AnalyticsUserRepository;

.field private static newUser:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/data/repositories/AnalyticsUserRepository;

    invoke-direct {v0}, Lcom/whoop/data/repositories/AnalyticsUserRepository;-><init>()V

    sput-object v0, Lcom/whoop/data/repositories/AnalyticsUserRepository;->INSTANCE:Lcom/whoop/data/repositories/AnalyticsUserRepository;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getNewUser()Z
    .locals 1

    sget-boolean v0, Lcom/whoop/data/repositories/AnalyticsUserRepository;->newUser:Z

    return v0
.end method

.method public final getUserType()Ljava/lang/String;
    .locals 1

    sget-boolean v0, Lcom/whoop/data/repositories/AnalyticsUserRepository;->newUser:Z

    if-eqz v0, :cond_0

    const-string v0, "Onboarding"

    return-object v0

    :cond_0
    const-string v0, "Existing_User"

    return-object v0
.end method

.method public final setNewUser(Z)V
    .locals 0

    sput-boolean p1, Lcom/whoop/data/repositories/AnalyticsUserRepository;->newUser:Z

    return-void
.end method
