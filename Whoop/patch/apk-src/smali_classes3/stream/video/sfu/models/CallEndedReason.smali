.class public final enum Lstream/video/sfu/models/CallEndedReason;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/wire/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/CallEndedReason$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lstream/video/sfu/models/CallEndedReason;",
        ">;",
        "Lcom/squareup/wire/y;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lstream/video/sfu/models/CallEndedReason;",
        "",
        "Lcom/squareup/wire/y;",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getValue",
        "()I",
        "Companion",
        "CALL_ENDED_REASON_UNSPECIFIED",
        "CALL_ENDED_REASON_ENDED",
        "CALL_ENDED_REASON_LIVE_ENDED",
        "CALL_ENDED_REASON_KICKED",
        "CALL_ENDED_REASON_SESSION_ENDED",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lstream/video/sfu/models/CallEndedReason;

.field public static final ADAPTER:Lcom/squareup/wire/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/q;"
        }
    .end annotation
.end field

.field public static final enum CALL_ENDED_REASON_ENDED:Lstream/video/sfu/models/CallEndedReason;

.field public static final enum CALL_ENDED_REASON_KICKED:Lstream/video/sfu/models/CallEndedReason;

.field public static final enum CALL_ENDED_REASON_LIVE_ENDED:Lstream/video/sfu/models/CallEndedReason;

.field public static final enum CALL_ENDED_REASON_SESSION_ENDED:Lstream/video/sfu/models/CallEndedReason;

.field public static final enum CALL_ENDED_REASON_UNSPECIFIED:Lstream/video/sfu/models/CallEndedReason;

.field public static final Companion:Lstream/video/sfu/models/CallEndedReason$Companion;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lstream/video/sfu/models/CallEndedReason;
    .locals 5

    sget-object v0, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_UNSPECIFIED:Lstream/video/sfu/models/CallEndedReason;

    sget-object v1, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_ENDED:Lstream/video/sfu/models/CallEndedReason;

    sget-object v2, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_LIVE_ENDED:Lstream/video/sfu/models/CallEndedReason;

    sget-object v3, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_KICKED:Lstream/video/sfu/models/CallEndedReason;

    sget-object v4, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_SESSION_ENDED:Lstream/video/sfu/models/CallEndedReason;

    filled-new-array {v0, v1, v2, v3, v4}, [Lstream/video/sfu/models/CallEndedReason;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/models/CallEndedReason;

    const-string v1, "CALL_ENDED_REASON_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lstream/video/sfu/models/CallEndedReason;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_UNSPECIFIED:Lstream/video/sfu/models/CallEndedReason;

    new-instance v1, Lstream/video/sfu/models/CallEndedReason;

    const-string v2, "CALL_ENDED_REASON_ENDED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lstream/video/sfu/models/CallEndedReason;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_ENDED:Lstream/video/sfu/models/CallEndedReason;

    new-instance v1, Lstream/video/sfu/models/CallEndedReason;

    const-string v2, "CALL_ENDED_REASON_LIVE_ENDED"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3, v3}, Lstream/video/sfu/models/CallEndedReason;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_LIVE_ENDED:Lstream/video/sfu/models/CallEndedReason;

    new-instance v1, Lstream/video/sfu/models/CallEndedReason;

    const-string v2, "CALL_ENDED_REASON_KICKED"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3, v3}, Lstream/video/sfu/models/CallEndedReason;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_KICKED:Lstream/video/sfu/models/CallEndedReason;

    new-instance v1, Lstream/video/sfu/models/CallEndedReason;

    const-string v2, "CALL_ENDED_REASON_SESSION_ENDED"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3, v3}, Lstream/video/sfu/models/CallEndedReason;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lstream/video/sfu/models/CallEndedReason;->CALL_ENDED_REASON_SESSION_ENDED:Lstream/video/sfu/models/CallEndedReason;

    invoke-static {}, Lstream/video/sfu/models/CallEndedReason;->$values()[Lstream/video/sfu/models/CallEndedReason;

    move-result-object v1

    sput-object v1, Lstream/video/sfu/models/CallEndedReason;->$VALUES:[Lstream/video/sfu/models/CallEndedReason;

    invoke-static {v1}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v1

    sput-object v1, Lstream/video/sfu/models/CallEndedReason;->$ENTRIES:Lt83/a;

    new-instance v1, Lstream/video/sfu/models/CallEndedReason$Companion;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lstream/video/sfu/models/CallEndedReason$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lstream/video/sfu/models/CallEndedReason;->Companion:Lstream/video/sfu/models/CallEndedReason$Companion;

    const-class v1, Lstream/video/sfu/models/CallEndedReason;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lstream/video/sfu/models/CallEndedReason$Companion$ADAPTER$1;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v2, v1, v3, v0}, Lstream/video/sfu/models/CallEndedReason$Companion$ADAPTER$1;-><init>(Lj93/d;Lcom/squareup/wire/x;Lstream/video/sfu/models/CallEndedReason;)V

    sput-object v2, Lstream/video/sfu/models/CallEndedReason;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lstream/video/sfu/models/CallEndedReason;->value:I

    return-void
.end method

.method public static final fromValue(I)Lstream/video/sfu/models/CallEndedReason;
    .locals 1

    sget-object v0, Lstream/video/sfu/models/CallEndedReason;->Companion:Lstream/video/sfu/models/CallEndedReason$Companion;

    invoke-virtual {v0, p0}, Lstream/video/sfu/models/CallEndedReason$Companion;->fromValue(I)Lstream/video/sfu/models/CallEndedReason;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lstream/video/sfu/models/CallEndedReason;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lstream/video/sfu/models/CallEndedReason;
    .locals 1

    const-class v0, Lstream/video/sfu/models/CallEndedReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lstream/video/sfu/models/CallEndedReason;

    return-object p0
.end method

.method public static values()[Lstream/video/sfu/models/CallEndedReason;
    .locals 1

    sget-object v0, Lstream/video/sfu/models/CallEndedReason;->$VALUES:[Lstream/video/sfu/models/CallEndedReason;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lstream/video/sfu/models/CallEndedReason;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/CallEndedReason;->value:I

    return v0
.end method
