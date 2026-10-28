.class public final enum Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lxr2/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;",
        ">;",
        "Lxr2/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\r\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u000f\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000cj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;",
        "Lxr2/a;",
        "",
        "",
        "serializedValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getSerializedValue",
        "()Ljava/lang/String;",
        "",
        "getUsingHarvard",
        "()Z",
        "usingHarvard",
        "getUsingCopley",
        "usingCopley",
        "NEW_HARVARD",
        "UPGRADED_HARVARD",
        "DOWNGRADED_COPLEY",
        "COPLEY_AWAITING_HARVARD",
        "COPLEY_NO_HARVARD",
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

.field private static final synthetic $VALUES:[Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

.field public static final enum COPLEY_AWAITING_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

.field public static final enum COPLEY_NO_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

.field public static final enum DOWNGRADED_COPLEY:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

.field public static final enum NEW_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

.field public static final enum UPGRADED_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;


# instance fields
.field private final serializedValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;
    .locals 5

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->NEW_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    sget-object v1, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->UPGRADED_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    sget-object v2, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->DOWNGRADED_COPLEY:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    sget-object v3, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->COPLEY_AWAITING_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    sget-object v4, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->COPLEY_NO_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    const/4 v1, 0x0

    const-string v2, "new_harvard"

    const-string v3, "NEW_HARVARD"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->NEW_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    const/4 v1, 0x1

    const-string v2, "upgraded_harvard"

    const-string v3, "UPGRADED_HARVARD"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->UPGRADED_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    const/4 v1, 0x2

    const-string v2, "downgraded_copley"

    const-string v3, "DOWNGRADED_COPLEY"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->DOWNGRADED_COPLEY:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    const/4 v1, 0x3

    const-string v2, "copley_awaiting_harvard"

    const-string v3, "COPLEY_AWAITING_HARVARD"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->COPLEY_AWAITING_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    const/4 v1, 0x4

    const-string v2, "copley_no_harvard"

    const-string v3, "COPLEY_NO_HARVARD"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->COPLEY_NO_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    invoke-static {}, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->$values()[Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->$VALUES:[Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->serializedValue:Ljava/lang/String;

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

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;
    .locals 1

    const-class v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    return-object p0
.end method

.method public static values()[Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->$VALUES:[Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    return-object v0
.end method


# virtual methods
.method public getSerializedValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->serializedValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsingCopley()Z
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->DOWNGRADED_COPLEY:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->COPLEY_AWAITING_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->COPLEY_NO_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getUsingHarvard()Z
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->NEW_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;->UPGRADED_HARVARD:Lcom/whoop/data/remote/domain/response/growth/StrapGenerationStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
