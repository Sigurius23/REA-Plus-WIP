.class public final enum Lio/sentry/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/m;

.field public static final enum All:Lio/sentry/m;

.field public static final enum Attachment:Lio/sentry/m;

.field public static final enum Default:Lio/sentry/m;

.field public static final enum Error:Lio/sentry/m;

.field public static final enum Feedback:Lio/sentry/m;

.field public static final enum LogByte:Lio/sentry/m;

.field public static final enum LogItem:Lio/sentry/m;

.field public static final enum Monitor:Lio/sentry/m;

.field public static final enum Profile:Lio/sentry/m;

.field public static final enum ProfileChunk:Lio/sentry/m;

.field public static final enum ProfileChunkUi:Lio/sentry/m;

.field public static final enum Replay:Lio/sentry/m;

.field public static final enum Security:Lio/sentry/m;

.field public static final enum Session:Lio/sentry/m;

.field public static final enum Span:Lio/sentry/m;

.field public static final enum TraceMetric:Lio/sentry/m;

.field public static final enum Transaction:Lio/sentry/m;

.field public static final enum Unknown:Lio/sentry/m;

.field public static final enum UserReport:Lio/sentry/m;


# instance fields
.field private final category:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lio/sentry/m;
    .locals 20

    sget-object v1, Lio/sentry/m;->All:Lio/sentry/m;

    sget-object v2, Lio/sentry/m;->Default:Lio/sentry/m;

    sget-object v3, Lio/sentry/m;->Error:Lio/sentry/m;

    sget-object v4, Lio/sentry/m;->Feedback:Lio/sentry/m;

    sget-object v5, Lio/sentry/m;->Session:Lio/sentry/m;

    sget-object v6, Lio/sentry/m;->Attachment:Lio/sentry/m;

    sget-object v7, Lio/sentry/m;->LogItem:Lio/sentry/m;

    sget-object v8, Lio/sentry/m;->LogByte:Lio/sentry/m;

    sget-object v9, Lio/sentry/m;->TraceMetric:Lio/sentry/m;

    sget-object v10, Lio/sentry/m;->Monitor:Lio/sentry/m;

    sget-object v11, Lio/sentry/m;->Profile:Lio/sentry/m;

    sget-object v12, Lio/sentry/m;->ProfileChunkUi:Lio/sentry/m;

    sget-object v13, Lio/sentry/m;->ProfileChunk:Lio/sentry/m;

    sget-object v14, Lio/sentry/m;->Transaction:Lio/sentry/m;

    sget-object v15, Lio/sentry/m;->Replay:Lio/sentry/m;

    sget-object v16, Lio/sentry/m;->Span:Lio/sentry/m;

    sget-object v17, Lio/sentry/m;->Security:Lio/sentry/m;

    sget-object v18, Lio/sentry/m;->UserReport:Lio/sentry/m;

    sget-object v19, Lio/sentry/m;->Unknown:Lio/sentry/m;

    filled-new-array/range {v1 .. v19}, [Lio/sentry/m;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/sentry/m;

    const/4 v1, 0x0

    const-string v2, "__all__"

    const-string v3, "All"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->All:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/4 v1, 0x1

    const-string v2, "default"

    const-string v3, "Default"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Default:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/4 v1, 0x2

    const-string v2, "error"

    const-string v3, "Error"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Error:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/4 v1, 0x3

    const-string v2, "feedback"

    const-string v3, "Feedback"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Feedback:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/4 v1, 0x4

    const-string v2, "session"

    const-string v3, "Session"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Session:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/4 v1, 0x5

    const-string v2, "attachment"

    const-string v3, "Attachment"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Attachment:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/4 v1, 0x6

    const-string v2, "log_item"

    const-string v3, "LogItem"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->LogItem:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/4 v1, 0x7

    const-string v2, "log_byte"

    const-string v3, "LogByte"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->LogByte:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0x8

    const-string v2, "trace_metric"

    const-string v3, "TraceMetric"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->TraceMetric:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0x9

    const-string v2, "monitor"

    const-string v3, "Monitor"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Monitor:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0xa

    const-string v2, "profile"

    const-string v3, "Profile"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Profile:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0xb

    const-string v2, "profile_chunk_ui"

    const-string v3, "ProfileChunkUi"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->ProfileChunkUi:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0xc

    const-string v2, "profile_chunk"

    const-string v3, "ProfileChunk"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->ProfileChunk:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0xd

    const-string v2, "transaction"

    const-string v3, "Transaction"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Transaction:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0xe

    const-string v2, "replay"

    const-string v3, "Replay"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Replay:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0xf

    const-string v2, "span"

    const-string v3, "Span"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Span:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0x10

    const-string v2, "security"

    const-string v3, "Security"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Security:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0x11

    const-string v2, "user_report"

    const-string v3, "UserReport"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->UserReport:Lio/sentry/m;

    new-instance v0, Lio/sentry/m;

    const/16 v1, 0x12

    const-string v2, "unknown"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/m;->Unknown:Lio/sentry/m;

    invoke-static {}, Lio/sentry/m;->$values()[Lio/sentry/m;

    move-result-object v0

    sput-object v0, Lio/sentry/m;->$VALUES:[Lio/sentry/m;

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

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/sentry/m;->category:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/m;
    .locals 1

    const-class v0, Lio/sentry/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/m;

    return-object p0
.end method

.method public static values()[Lio/sentry/m;
    .locals 1

    sget-object v0, Lio/sentry/m;->$VALUES:[Lio/sentry/m;

    invoke-virtual {v0}, [Lio/sentry/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/m;

    return-object v0
.end method


# virtual methods
.method public getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/m;->category:Ljava/lang/String;

    return-object v0
.end method
