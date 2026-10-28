.class public final enum Lcom/whoop/ui/login/ImportantAppInfo;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/ui/login/ImportantAppInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/ui/login/ImportantAppInfo;",
        "",
        "shortId",
        "",
        "exceptionReason",
        "",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "getShortId",
        "()I",
        "getExceptionReason",
        "()Ljava/lang/String;",
        "FEATURE_FLAGS",
        "CONFIG_VALUES",
        "MEMBER_ENTITLEMENTS",
        "APP_CONFIGURATION",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/ui/login/ImportantAppInfo;

.field public static final enum APP_CONFIGURATION:Lcom/whoop/ui/login/ImportantAppInfo;

.field public static final enum CONFIG_VALUES:Lcom/whoop/ui/login/ImportantAppInfo;

.field public static final enum FEATURE_FLAGS:Lcom/whoop/ui/login/ImportantAppInfo;

.field public static final enum MEMBER_ENTITLEMENTS:Lcom/whoop/ui/login/ImportantAppInfo;


# instance fields
.field private final exceptionReason:Ljava/lang/String;

.field private final shortId:I


# direct methods
.method private static final synthetic $values()[Lcom/whoop/ui/login/ImportantAppInfo;
    .locals 4

    sget-object v0, Lcom/whoop/ui/login/ImportantAppInfo;->FEATURE_FLAGS:Lcom/whoop/ui/login/ImportantAppInfo;

    sget-object v1, Lcom/whoop/ui/login/ImportantAppInfo;->CONFIG_VALUES:Lcom/whoop/ui/login/ImportantAppInfo;

    sget-object v2, Lcom/whoop/ui/login/ImportantAppInfo;->MEMBER_ENTITLEMENTS:Lcom/whoop/ui/login/ImportantAppInfo;

    sget-object v3, Lcom/whoop/ui/login/ImportantAppInfo;->APP_CONFIGURATION:Lcom/whoop/ui/login/ImportantAppInfo;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/ui/login/ImportantAppInfo;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/ui/login/ImportantAppInfo;

    const/4 v1, 0x0

    const-string v2, "feature flags"

    const-string v3, "FEATURE_FLAGS"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/ui/login/ImportantAppInfo;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/login/ImportantAppInfo;->FEATURE_FLAGS:Lcom/whoop/ui/login/ImportantAppInfo;

    new-instance v0, Lcom/whoop/ui/login/ImportantAppInfo;

    const/4 v1, 0x1

    const-string v2, "configuration values"

    const-string v3, "CONFIG_VALUES"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/ui/login/ImportantAppInfo;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/login/ImportantAppInfo;->CONFIG_VALUES:Lcom/whoop/ui/login/ImportantAppInfo;

    new-instance v0, Lcom/whoop/ui/login/ImportantAppInfo;

    const/4 v1, 0x2

    const-string v2, "member entitlements"

    const-string v3, "MEMBER_ENTITLEMENTS"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/ui/login/ImportantAppInfo;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/login/ImportantAppInfo;->MEMBER_ENTITLEMENTS:Lcom/whoop/ui/login/ImportantAppInfo;

    new-instance v0, Lcom/whoop/ui/login/ImportantAppInfo;

    const/4 v1, 0x3

    const-string v2, "app configuration"

    const-string v3, "APP_CONFIGURATION"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/ui/login/ImportantAppInfo;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/login/ImportantAppInfo;->APP_CONFIGURATION:Lcom/whoop/ui/login/ImportantAppInfo;

    invoke-static {}, Lcom/whoop/ui/login/ImportantAppInfo;->$values()[Lcom/whoop/ui/login/ImportantAppInfo;

    move-result-object v0

    sput-object v0, Lcom/whoop/ui/login/ImportantAppInfo;->$VALUES:[Lcom/whoop/ui/login/ImportantAppInfo;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/ui/login/ImportantAppInfo;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/whoop/ui/login/ImportantAppInfo;->shortId:I

    iput-object p4, p0, Lcom/whoop/ui/login/ImportantAppInfo;->exceptionReason:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/ui/login/ImportantAppInfo;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/ui/login/ImportantAppInfo;
    .locals 1

    const-class v0, Lcom/whoop/ui/login/ImportantAppInfo;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/ui/login/ImportantAppInfo;

    return-object p0
.end method

.method public static values()[Lcom/whoop/ui/login/ImportantAppInfo;
    .locals 1

    sget-object v0, Lcom/whoop/ui/login/ImportantAppInfo;->$VALUES:[Lcom/whoop/ui/login/ImportantAppInfo;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/ui/login/ImportantAppInfo;

    return-object v0
.end method


# virtual methods
.method public final getExceptionReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/login/ImportantAppInfo;->exceptionReason:Ljava/lang/String;

    return-object v0
.end method

.method public final getShortId()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/login/ImportantAppInfo;->shortId:I

    return v0
.end method
