.class public final enum Lyh2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyh2/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lyh2/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Metrics",
        "Console",
        "Events",
        "Raw",
        "Rev2Raw",
        "DataSettings",
        "Ecg",
        "strap-history-sync_release"
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

.field private static final synthetic $VALUES:[Lyh2/a;

.field public static final enum Console:Lyh2/a;

.field public static final enum DataSettings:Lyh2/a;

.field public static final enum Ecg:Lyh2/a;

.field public static final enum Events:Lyh2/a;

.field public static final enum Metrics:Lyh2/a;

.field public static final enum Raw:Lyh2/a;

.field public static final enum Rev2Raw:Lyh2/a;


# direct methods
.method private static final synthetic $values()[Lyh2/a;
    .locals 7

    sget-object v0, Lyh2/a;->Metrics:Lyh2/a;

    sget-object v1, Lyh2/a;->Console:Lyh2/a;

    sget-object v2, Lyh2/a;->Events:Lyh2/a;

    sget-object v3, Lyh2/a;->Raw:Lyh2/a;

    sget-object v4, Lyh2/a;->Rev2Raw:Lyh2/a;

    sget-object v5, Lyh2/a;->DataSettings:Lyh2/a;

    sget-object v6, Lyh2/a;->Ecg:Lyh2/a;

    filled-new-array/range {v0 .. v6}, [Lyh2/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyh2/a;

    const-string v1, "Metrics"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lyh2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyh2/a;->Metrics:Lyh2/a;

    new-instance v0, Lyh2/a;

    const-string v1, "Console"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lyh2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyh2/a;->Console:Lyh2/a;

    new-instance v0, Lyh2/a;

    const-string v1, "Events"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lyh2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyh2/a;->Events:Lyh2/a;

    new-instance v0, Lyh2/a;

    const-string v1, "Raw"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lyh2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyh2/a;->Raw:Lyh2/a;

    new-instance v0, Lyh2/a;

    const-string v1, "Rev2Raw"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lyh2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyh2/a;->Rev2Raw:Lyh2/a;

    new-instance v0, Lyh2/a;

    const-string v1, "DataSettings"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lyh2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyh2/a;->DataSettings:Lyh2/a;

    new-instance v0, Lyh2/a;

    const-string v1, "Ecg"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lyh2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyh2/a;->Ecg:Lyh2/a;

    invoke-static {}, Lyh2/a;->$values()[Lyh2/a;

    move-result-object v0

    sput-object v0, Lyh2/a;->$VALUES:[Lyh2/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lyh2/a;->$ENTRIES:Lt83/a;

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

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lyh2/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyh2/a;
    .locals 1

    const-class v0, Lyh2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyh2/a;

    return-object p0
.end method

.method public static values()[Lyh2/a;
    .locals 1

    sget-object v0, Lyh2/a;->$VALUES:[Lyh2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyh2/a;

    return-object v0
.end method
