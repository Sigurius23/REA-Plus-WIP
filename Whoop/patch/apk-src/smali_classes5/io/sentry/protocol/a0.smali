.class public final enum Lio/sentry/protocol/a0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/protocol/a0;

.field public static final enum ALL:Lio/sentry/protocol/a0;

.field public static final enum ALL_BUT_FIRST:Lio/sentry/protocol/a0;

.field public static final enum AUTO:Lio/sentry/protocol/a0;

.field public static final enum NONE:Lio/sentry/protocol/a0;


# direct methods
.method private static synthetic $values()[Lio/sentry/protocol/a0;
    .locals 4

    sget-object v0, Lio/sentry/protocol/a0;->AUTO:Lio/sentry/protocol/a0;

    sget-object v1, Lio/sentry/protocol/a0;->ALL:Lio/sentry/protocol/a0;

    sget-object v2, Lio/sentry/protocol/a0;->ALL_BUT_FIRST:Lio/sentry/protocol/a0;

    sget-object v3, Lio/sentry/protocol/a0;->NONE:Lio/sentry/protocol/a0;

    filled-new-array {v0, v1, v2, v3}, [Lio/sentry/protocol/a0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/protocol/a0;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/protocol/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/protocol/a0;->AUTO:Lio/sentry/protocol/a0;

    new-instance v0, Lio/sentry/protocol/a0;

    const-string v1, "ALL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/protocol/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/protocol/a0;->ALL:Lio/sentry/protocol/a0;

    new-instance v0, Lio/sentry/protocol/a0;

    const-string v1, "ALL_BUT_FIRST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/protocol/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/protocol/a0;->ALL_BUT_FIRST:Lio/sentry/protocol/a0;

    new-instance v0, Lio/sentry/protocol/a0;

    const-string v1, "NONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/sentry/protocol/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/protocol/a0;->NONE:Lio/sentry/protocol/a0;

    invoke-static {}, Lio/sentry/protocol/a0;->$values()[Lio/sentry/protocol/a0;

    move-result-object v0

    sput-object v0, Lio/sentry/protocol/a0;->$VALUES:[Lio/sentry/protocol/a0;

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

.method public static valueOf(Ljava/lang/String;)Lio/sentry/protocol/a0;
    .locals 1

    const-class v0, Lio/sentry/protocol/a0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/protocol/a0;

    return-object p0
.end method

.method public static values()[Lio/sentry/protocol/a0;
    .locals 1

    sget-object v0, Lio/sentry/protocol/a0;->$VALUES:[Lio/sentry/protocol/a0;

    invoke-virtual {v0}, [Lio/sentry/protocol/a0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/protocol/a0;

    return-object v0
.end method


# virtual methods
.method public serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    check-cast p1, Lwe/o;

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void
.end method
