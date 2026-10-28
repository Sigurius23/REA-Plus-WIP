.class public final enum Lwg0/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwg0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lwg0/e;",
        "",
        "Lwg0/c;",
        "granularity",
        "",
        "delayMillis",
        "",
        "charsPerStep",
        "<init>",
        "(Ljava/lang/String;ILwg0/c;JI)V",
        "Lwg0/c;",
        "getGranularity",
        "()Lwg0/c;",
        "J",
        "getDelayMillis",
        "()J",
        "I",
        "getCharsPerStep",
        "()I",
        "CONTROL",
        "SMOOTH",
        "bot_release"
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

.field private static final synthetic $VALUES:[Lwg0/e;

.field public static final enum CONTROL:Lwg0/e;

.field public static final enum SMOOTH:Lwg0/e;


# instance fields
.field private final charsPerStep:I

.field private final delayMillis:J

.field private final granularity:Lwg0/c;


# direct methods
.method private static final synthetic $values()[Lwg0/e;
    .locals 2

    sget-object v0, Lwg0/e;->CONTROL:Lwg0/e;

    sget-object v1, Lwg0/e;->SMOOTH:Lwg0/e;

    filled-new-array {v0, v1}, [Lwg0/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lwg0/e;

    sget-object v3, Lwg0/c;->WORD:Lwg0/c;

    const-wide/16 v4, 0x10

    const/4 v6, 0x1

    const-string v1, "CONTROL"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lwg0/e;-><init>(Ljava/lang/String;ILwg0/c;JI)V

    sput-object v0, Lwg0/e;->CONTROL:Lwg0/e;

    new-instance v1, Lwg0/e;

    sget-object v4, Lwg0/c;->CHARACTER:Lwg0/c;

    const-wide/16 v5, 0x10

    const/4 v7, 0x3

    const-string v2, "SMOOTH"

    const/4 v3, 0x1

    invoke-direct/range {v1 .. v7}, Lwg0/e;-><init>(Ljava/lang/String;ILwg0/c;JI)V

    sput-object v1, Lwg0/e;->SMOOTH:Lwg0/e;

    invoke-static {}, Lwg0/e;->$values()[Lwg0/e;

    move-result-object v0

    sput-object v0, Lwg0/e;->$VALUES:[Lwg0/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lwg0/e;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILwg0/c;JI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwg0/c;",
            "JI)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lwg0/e;->granularity:Lwg0/c;

    iput-wide p4, p0, Lwg0/e;->delayMillis:J

    iput p6, p0, Lwg0/e;->charsPerStep:I

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

    sget-object v0, Lwg0/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwg0/e;
    .locals 1

    const-class v0, Lwg0/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwg0/e;

    return-object p0
.end method

.method public static values()[Lwg0/e;
    .locals 1

    sget-object v0, Lwg0/e;->$VALUES:[Lwg0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwg0/e;

    return-object v0
.end method


# virtual methods
.method public final getCharsPerStep()I
    .locals 1

    iget v0, p0, Lwg0/e;->charsPerStep:I

    return v0
.end method

.method public final getDelayMillis()J
    .locals 2

    iget-wide v0, p0, Lwg0/e;->delayMillis:J

    return-wide v0
.end method

.method public final getGranularity()Lwg0/c;
    .locals 1

    iget-object v0, p0, Lwg0/e;->granularity:Lwg0/c;

    return-object v0
.end method
