.class public final enum Llive/hms/video/audio/AudioChangeEvent;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llive/hms/video/audio/AudioChangeEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Llive/hms/video/audio/AudioChangeEvent;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "AUDIOFOCUS_GAIN",
        "AUDIOFOCUS_LOSS_TRANSIENT",
        "DEBUG_AUDIOFOCUS_GAIN_TRANSIENT",
        "DEBUG_AUDIOFOCUS_GAIN_EXCLUSIVE",
        "DEBUG_AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK",
        "DEBUG_AUDIOFOCUS_LOSS",
        "DEBUG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK",
        "DEBUG_INVALID",
        "PHONE_RINGING",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Llive/hms/video/audio/AudioChangeEvent;

.field public static final enum AUDIOFOCUS_GAIN:Llive/hms/video/audio/AudioChangeEvent;

.field public static final enum AUDIOFOCUS_LOSS_TRANSIENT:Llive/hms/video/audio/AudioChangeEvent;

.field public static final enum DEBUG_AUDIOFOCUS_GAIN_EXCLUSIVE:Llive/hms/video/audio/AudioChangeEvent;

.field public static final enum DEBUG_AUDIOFOCUS_GAIN_TRANSIENT:Llive/hms/video/audio/AudioChangeEvent;

.field public static final enum DEBUG_AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK:Llive/hms/video/audio/AudioChangeEvent;

.field public static final enum DEBUG_AUDIOFOCUS_LOSS:Llive/hms/video/audio/AudioChangeEvent;

.field public static final enum DEBUG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:Llive/hms/video/audio/AudioChangeEvent;

.field public static final enum DEBUG_INVALID:Llive/hms/video/audio/AudioChangeEvent;

.field public static final enum PHONE_RINGING:Llive/hms/video/audio/AudioChangeEvent;


# direct methods
.method private static final synthetic $values()[Llive/hms/video/audio/AudioChangeEvent;
    .locals 9

    sget-object v0, Llive/hms/video/audio/AudioChangeEvent;->AUDIOFOCUS_GAIN:Llive/hms/video/audio/AudioChangeEvent;

    sget-object v1, Llive/hms/video/audio/AudioChangeEvent;->AUDIOFOCUS_LOSS_TRANSIENT:Llive/hms/video/audio/AudioChangeEvent;

    sget-object v2, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_GAIN_TRANSIENT:Llive/hms/video/audio/AudioChangeEvent;

    sget-object v3, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_GAIN_EXCLUSIVE:Llive/hms/video/audio/AudioChangeEvent;

    sget-object v4, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK:Llive/hms/video/audio/AudioChangeEvent;

    sget-object v5, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_LOSS:Llive/hms/video/audio/AudioChangeEvent;

    sget-object v6, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:Llive/hms/video/audio/AudioChangeEvent;

    sget-object v7, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_INVALID:Llive/hms/video/audio/AudioChangeEvent;

    sget-object v8, Llive/hms/video/audio/AudioChangeEvent;->PHONE_RINGING:Llive/hms/video/audio/AudioChangeEvent;

    filled-new-array/range {v0 .. v8}, [Llive/hms/video/audio/AudioChangeEvent;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llive/hms/video/audio/AudioChangeEvent;

    const-string v1, "AUDIOFOCUS_GAIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/AudioChangeEvent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->AUDIOFOCUS_GAIN:Llive/hms/video/audio/AudioChangeEvent;

    new-instance v0, Llive/hms/video/audio/AudioChangeEvent;

    const-string v1, "AUDIOFOCUS_LOSS_TRANSIENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/AudioChangeEvent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->AUDIOFOCUS_LOSS_TRANSIENT:Llive/hms/video/audio/AudioChangeEvent;

    new-instance v0, Llive/hms/video/audio/AudioChangeEvent;

    const-string v1, "DEBUG_AUDIOFOCUS_GAIN_TRANSIENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/AudioChangeEvent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_GAIN_TRANSIENT:Llive/hms/video/audio/AudioChangeEvent;

    new-instance v0, Llive/hms/video/audio/AudioChangeEvent;

    const-string v1, "DEBUG_AUDIOFOCUS_GAIN_EXCLUSIVE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/AudioChangeEvent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_GAIN_EXCLUSIVE:Llive/hms/video/audio/AudioChangeEvent;

    new-instance v0, Llive/hms/video/audio/AudioChangeEvent;

    const-string v1, "DEBUG_AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/AudioChangeEvent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK:Llive/hms/video/audio/AudioChangeEvent;

    new-instance v0, Llive/hms/video/audio/AudioChangeEvent;

    const-string v1, "DEBUG_AUDIOFOCUS_LOSS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/AudioChangeEvent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_LOSS:Llive/hms/video/audio/AudioChangeEvent;

    new-instance v0, Llive/hms/video/audio/AudioChangeEvent;

    const-string v1, "DEBUG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/AudioChangeEvent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:Llive/hms/video/audio/AudioChangeEvent;

    new-instance v0, Llive/hms/video/audio/AudioChangeEvent;

    const-string v1, "DEBUG_INVALID"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/AudioChangeEvent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_INVALID:Llive/hms/video/audio/AudioChangeEvent;

    new-instance v0, Llive/hms/video/audio/AudioChangeEvent;

    const-string v1, "PHONE_RINGING"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/AudioChangeEvent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->PHONE_RINGING:Llive/hms/video/audio/AudioChangeEvent;

    invoke-static {}, Llive/hms/video/audio/AudioChangeEvent;->$values()[Llive/hms/video/audio/AudioChangeEvent;

    move-result-object v0

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->$VALUES:[Llive/hms/video/audio/AudioChangeEvent;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llive/hms/video/audio/AudioChangeEvent;->$ENTRIES:Lt83/a;

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

    sget-object v0, Llive/hms/video/audio/AudioChangeEvent;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llive/hms/video/audio/AudioChangeEvent;
    .locals 1

    const-class v0, Llive/hms/video/audio/AudioChangeEvent;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llive/hms/video/audio/AudioChangeEvent;

    return-object p0
.end method

.method public static values()[Llive/hms/video/audio/AudioChangeEvent;
    .locals 1

    sget-object v0, Llive/hms/video/audio/AudioChangeEvent;->$VALUES:[Llive/hms/video/audio/AudioChangeEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llive/hms/video/audio/AudioChangeEvent;

    return-object v0
.end method
