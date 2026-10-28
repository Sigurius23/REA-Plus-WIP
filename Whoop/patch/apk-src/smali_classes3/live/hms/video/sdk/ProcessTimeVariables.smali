.class public final Llive/hms/video/sdk/ProcessTimeVariables;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007\"\u0004\u0008\u000c\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Llive/hms/video/sdk/ProcessTimeVariables;",
        "",
        "<init>",
        "()V",
        "timeTakenWithML",
        "",
        "getTimeTakenWithML",
        "()J",
        "setTimeTakenWithML",
        "(J)V",
        "timeTakenWithoutML",
        "getTimeTakenWithoutML",
        "setTimeTakenWithoutML",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Llive/hms/video/sdk/ProcessTimeVariables;

.field private static timeTakenWithML:J

.field private static timeTakenWithoutML:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/sdk/ProcessTimeVariables;

    invoke-direct {v0}, Llive/hms/video/sdk/ProcessTimeVariables;-><init>()V

    sput-object v0, Llive/hms/video/sdk/ProcessTimeVariables;->INSTANCE:Llive/hms/video/sdk/ProcessTimeVariables;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getTimeTakenWithML()J
    .locals 2

    sget-wide v0, Llive/hms/video/sdk/ProcessTimeVariables;->timeTakenWithML:J

    return-wide v0
.end method

.method public final getTimeTakenWithoutML()J
    .locals 2

    sget-wide v0, Llive/hms/video/sdk/ProcessTimeVariables;->timeTakenWithoutML:J

    return-wide v0
.end method

.method public final setTimeTakenWithML(J)V
    .locals 0

    sput-wide p1, Llive/hms/video/sdk/ProcessTimeVariables;->timeTakenWithML:J

    return-void
.end method

.method public final setTimeTakenWithoutML(J)V
    .locals 0

    sput-wide p1, Llive/hms/video/sdk/ProcessTimeVariables;->timeTakenWithoutML:J

    return-void
.end method
