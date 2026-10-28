.class public final enum Lio/sentry/android/core/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/android/core/z;

.field public static final enum DUMP:Lio/sentry/android/core/z;

.field public static final enum ERROR:Lio/sentry/android/core/z;

.field public static final enum NO_DUMP:Lio/sentry/android/core/z;


# direct methods
.method private static synthetic $values()[Lio/sentry/android/core/z;
    .locals 3

    sget-object v0, Lio/sentry/android/core/z;->DUMP:Lio/sentry/android/core/z;

    sget-object v1, Lio/sentry/android/core/z;->NO_DUMP:Lio/sentry/android/core/z;

    sget-object v2, Lio/sentry/android/core/z;->ERROR:Lio/sentry/android/core/z;

    filled-new-array {v0, v1, v2}, [Lio/sentry/android/core/z;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/android/core/z;

    const-string v1, "DUMP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/android/core/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/android/core/z;->DUMP:Lio/sentry/android/core/z;

    new-instance v0, Lio/sentry/android/core/z;

    const-string v1, "NO_DUMP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/android/core/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/android/core/z;->NO_DUMP:Lio/sentry/android/core/z;

    new-instance v0, Lio/sentry/android/core/z;

    const-string v1, "ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/android/core/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/android/core/z;->ERROR:Lio/sentry/android/core/z;

    invoke-static {}, Lio/sentry/android/core/z;->$values()[Lio/sentry/android/core/z;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/z;->$VALUES:[Lio/sentry/android/core/z;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/android/core/z;
    .locals 1

    const-class v0, Lio/sentry/android/core/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/android/core/z;

    return-object p0
.end method

.method public static values()[Lio/sentry/android/core/z;
    .locals 1

    sget-object v0, Lio/sentry/android/core/z;->$VALUES:[Lio/sentry/android/core/z;

    invoke-virtual {v0}, [Lio/sentry/android/core/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/android/core/z;

    return-object v0
.end method
