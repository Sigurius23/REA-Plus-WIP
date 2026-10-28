.class public abstract enum Ly82/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly82/b$t;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly82/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ly82/b;

.field public static final enum BLE_RECONNECT_TICKLE:Ly82/b;

.field private static final DATE_TIME_FORMATTER:Lorg/joda/time/format/DateTimeFormatter;

.field public static final enum DELETE_SHARED_PREFS:Ly82/b;

.field public static final enum DISABLE_ALARM:Ly82/b;

.field public static final enum DISABLE_IMU_STREAM:Ly82/b;

.field public static final enum ENABLE_IMU_STREAM:Ly82/b;

.field public static final enum ENABLE_VERBOSE_NETWORK_LOG:Ly82/b;

.field public static final enum FORCE_LOGS_LIVE_STREAM:Ly82/b;

.field public static final enum GET_ACCESS_TOKEN:Ly82/b;

.field public static final enum GET_PUSH_TOKEN:Ly82/b;

.field public static final enum LENIENT_STRAP_SYNC:Ly82/b;

.field private static final LOG_TAG:Ljava/lang/String; = "WhoopAction"

.field public static final RESULT_FAILURE:Ljava/lang/String; = "Failed"

.field public static final RESULT_SUCCESS:Ljava/lang/String; = "Success"

.field public static final enum RUN_ALARM:Ly82/b;

.field public static final enum RUN_HAPTICS_PATTERN_2:Ly82/b;

.field public static final enum SEND_HIGH_FREQ_HIST_SYNC_COMMAND:Ly82/b;

.field public static final enum SET_ALARM_TIME:Ly82/b;

.field public static final enum SYNC_PERSISTED_ACTIVITIES:Ly82/b;

.field public static final enum TRIGGER_BACKGROUND_FW_UPDATE:Ly82/b;

.field public static final enum UPDATE_TIME_ZONE:Ly82/b;

.field public static final enum UPLOAD_CONSOLE_LOGS:Ly82/b;

.field public static final enum UPLOAD_RAW_DATA:Ly82/b;


# instance fields
.field private actionString:Ljava/lang/String;

.field private isVisibleInUi:Z

.field private userDisplayName:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Ly82/b;
    .locals 20

    sget-object v1, Ly82/b;->ENABLE_IMU_STREAM:Ly82/b;

    sget-object v2, Ly82/b;->DISABLE_IMU_STREAM:Ly82/b;

    sget-object v3, Ly82/b;->SEND_HIGH_FREQ_HIST_SYNC_COMMAND:Ly82/b;

    sget-object v4, Ly82/b;->RUN_HAPTICS_PATTERN_2:Ly82/b;

    sget-object v5, Ly82/b;->SET_ALARM_TIME:Ly82/b;

    sget-object v6, Ly82/b;->RUN_ALARM:Ly82/b;

    sget-object v7, Ly82/b;->DISABLE_ALARM:Ly82/b;

    sget-object v8, Ly82/b;->TRIGGER_BACKGROUND_FW_UPDATE:Ly82/b;

    sget-object v9, Ly82/b;->FORCE_LOGS_LIVE_STREAM:Ly82/b;

    sget-object v10, Ly82/b;->UPLOAD_CONSOLE_LOGS:Ly82/b;

    sget-object v11, Ly82/b;->UPLOAD_RAW_DATA:Ly82/b;

    sget-object v12, Ly82/b;->DELETE_SHARED_PREFS:Ly82/b;

    sget-object v13, Ly82/b;->BLE_RECONNECT_TICKLE:Ly82/b;

    sget-object v14, Ly82/b;->UPDATE_TIME_ZONE:Ly82/b;

    sget-object v15, Ly82/b;->GET_PUSH_TOKEN:Ly82/b;

    sget-object v16, Ly82/b;->SYNC_PERSISTED_ACTIVITIES:Ly82/b;

    sget-object v17, Ly82/b;->LENIENT_STRAP_SYNC:Ly82/b;

    sget-object v18, Ly82/b;->GET_ACCESS_TOKEN:Ly82/b;

    sget-object v19, Ly82/b;->ENABLE_VERBOSE_NETWORK_LOG:Ly82/b;

    filled-new-array/range {v1 .. v19}, [Ly82/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly82/b$k;

    invoke-direct {v0}, Ly82/b$k;-><init>()V

    sput-object v0, Ly82/b;->ENABLE_IMU_STREAM:Ly82/b;

    new-instance v0, Ly82/b$l;

    invoke-direct {v0}, Ly82/b$l;-><init>()V

    sput-object v0, Ly82/b;->DISABLE_IMU_STREAM:Ly82/b;

    new-instance v0, Ly82/b$m;

    invoke-direct {v0}, Ly82/b$m;-><init>()V

    sput-object v0, Ly82/b;->SEND_HIGH_FREQ_HIST_SYNC_COMMAND:Ly82/b;

    new-instance v0, Ly82/b$n;

    invoke-direct {v0}, Ly82/b$n;-><init>()V

    sput-object v0, Ly82/b;->RUN_HAPTICS_PATTERN_2:Ly82/b;

    new-instance v0, Ly82/b$o;

    invoke-direct {v0}, Ly82/b$o;-><init>()V

    sput-object v0, Ly82/b;->SET_ALARM_TIME:Ly82/b;

    new-instance v0, Ly82/b$p;

    invoke-direct {v0}, Ly82/b$p;-><init>()V

    sput-object v0, Ly82/b;->RUN_ALARM:Ly82/b;

    new-instance v0, Ly82/b$q;

    invoke-direct {v0}, Ly82/b$q;-><init>()V

    sput-object v0, Ly82/b;->DISABLE_ALARM:Ly82/b;

    new-instance v0, Ly82/b$r;

    invoke-direct {v0}, Ly82/b$r;-><init>()V

    sput-object v0, Ly82/b;->TRIGGER_BACKGROUND_FW_UPDATE:Ly82/b;

    new-instance v0, Ly82/b$s;

    invoke-direct {v0}, Ly82/b$s;-><init>()V

    sput-object v0, Ly82/b;->FORCE_LOGS_LIVE_STREAM:Ly82/b;

    new-instance v0, Ly82/b$a;

    invoke-direct {v0}, Ly82/b$a;-><init>()V

    sput-object v0, Ly82/b;->UPLOAD_CONSOLE_LOGS:Ly82/b;

    new-instance v0, Ly82/b$b;

    invoke-direct {v0}, Ly82/b$b;-><init>()V

    sput-object v0, Ly82/b;->UPLOAD_RAW_DATA:Ly82/b;

    new-instance v0, Ly82/b$c;

    invoke-direct {v0}, Ly82/b$c;-><init>()V

    sput-object v0, Ly82/b;->DELETE_SHARED_PREFS:Ly82/b;

    new-instance v0, Ly82/b$d;

    invoke-direct {v0}, Ly82/b$d;-><init>()V

    sput-object v0, Ly82/b;->BLE_RECONNECT_TICKLE:Ly82/b;

    new-instance v0, Ly82/b$e;

    invoke-direct {v0}, Ly82/b$e;-><init>()V

    sput-object v0, Ly82/b;->UPDATE_TIME_ZONE:Ly82/b;

    new-instance v0, Ly82/b$f;

    invoke-direct {v0}, Ly82/b$f;-><init>()V

    sput-object v0, Ly82/b;->GET_PUSH_TOKEN:Ly82/b;

    new-instance v0, Ly82/b$g;

    invoke-direct {v0}, Ly82/b$g;-><init>()V

    sput-object v0, Ly82/b;->SYNC_PERSISTED_ACTIVITIES:Ly82/b;

    new-instance v0, Ly82/b$h;

    invoke-direct {v0}, Ly82/b$h;-><init>()V

    sput-object v0, Ly82/b;->LENIENT_STRAP_SYNC:Ly82/b;

    new-instance v0, Ly82/b$i;

    invoke-direct {v0}, Ly82/b$i;-><init>()V

    sput-object v0, Ly82/b;->GET_ACCESS_TOKEN:Ly82/b;

    new-instance v0, Ly82/b$j;

    invoke-direct {v0}, Ly82/b$j;-><init>()V

    sput-object v0, Ly82/b;->ENABLE_VERBOSE_NETWORK_LOG:Ly82/b;

    invoke-static {}, Ly82/b;->$values()[Ly82/b;

    move-result-object v0

    sput-object v0, Ly82/b;->$VALUES:[Ly82/b;

    const-string v0, "MMM d y h:mm:ss a Z"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Ly82/b;->DATE_TIME_FORMATTER:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-object p3, p0, Ly82/b;->userDisplayName:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ly82/b;->actionString:Ljava/lang/String;

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Ly82/b;->isVisibleInUi:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ly82/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2, p3}, Ly82/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    iput-boolean p4, p0, Ly82/b;->isVisibleInUi:Z

    return-void
.end method

.method public static bridge synthetic a()Z
    .locals 1

    invoke-static {}, Ly82/b;->isNetworkConnected()Z

    move-result v0

    return v0
.end method

.method public static fromActionString(Ljava/lang/String;)Ly82/b;
    .locals 5

    invoke-static {}, Ly82/b;->values()[Ly82/b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ly82/b;->getActionString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static isNetworkConnected()Z
    .locals 2

    const-class v0, Li92/e;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li92/e;

    invoke-interface {v0}, Li92/e;->isConnected()Z

    move-result v0

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Ly82/b;
    .locals 1

    const-class v0, Ly82/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly82/b;

    return-object p0
.end method

.method public static values()[Ly82/b;
    .locals 1

    sget-object v0, Ly82/b;->$VALUES:[Ly82/b;

    invoke-virtual {v0}, [Ly82/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly82/b;

    return-object v0
.end method


# virtual methods
.method public attemptToPerform(Landroid/content/Context;)Ly82/b$t;
    .locals 2

    const-string v0, "WhoopAction"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-virtual {p0}, Ly82/b;->requiresNetwork()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Ly82/b;->isNetworkConnected()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Cannot perform action: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", Network required but not connected"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ly82/b;->perform(Landroid/content/Context;)Ly82/b$t;

    move-result-object p1

    return-object p1
.end method

.method public getActionString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly82/b;->actionString:Ljava/lang/String;

    return-object v0
.end method

.method public getUserDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly82/b;->userDisplayName:Ljava/lang/String;

    return-object v0
.end method

.method public isVisibleInUi()Z
    .locals 1

    iget-boolean v0, p0, Ly82/b;->isVisibleInUi:Z

    return v0
.end method

.method public abstract perform(Landroid/content/Context;)Ly82/b$t;
.end method

.method public performFromUi(Landroid/content/Context;)Ly82/b$t;
    .locals 0

    invoke-virtual {p0, p1}, Ly82/b;->perform(Landroid/content/Context;)Ly82/b$t;

    move-result-object p1

    return-object p1
.end method

.method public requiresNetwork()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
