.class public final enum Lcom/whoop/domain/model/teams/PrivacyType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/teams/PrivacyType$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/domain/model/teams/PrivacyType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/PrivacyType;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "DETAIL",
        "SUMMARY",
        "HIDDEN",
        "isAtLeast",
        "",
        "other",
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

.field private static final synthetic $VALUES:[Lcom/whoop/domain/model/teams/PrivacyType;

.field public static final enum DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "all"
    .end annotation
.end field

.field public static final enum HIDDEN:Lcom/whoop/domain/model/teams/PrivacyType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hidden"
    .end annotation
.end field

.field public static final enum SUMMARY:Lcom/whoop/domain/model/teams/PrivacyType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "summary"
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 3

    sget-object v0, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    sget-object v1, Lcom/whoop/domain/model/teams/PrivacyType;->SUMMARY:Lcom/whoop/domain/model/teams/PrivacyType;

    sget-object v2, Lcom/whoop/domain/model/teams/PrivacyType;->HIDDEN:Lcom/whoop/domain/model/teams/PrivacyType;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/domain/model/teams/PrivacyType;

    const-string v1, "DETAIL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/domain/model/teams/PrivacyType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    new-instance v0, Lcom/whoop/domain/model/teams/PrivacyType;

    const-string v1, "SUMMARY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/domain/model/teams/PrivacyType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/domain/model/teams/PrivacyType;->SUMMARY:Lcom/whoop/domain/model/teams/PrivacyType;

    new-instance v0, Lcom/whoop/domain/model/teams/PrivacyType;

    const-string v1, "HIDDEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/domain/model/teams/PrivacyType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/domain/model/teams/PrivacyType;->HIDDEN:Lcom/whoop/domain/model/teams/PrivacyType;

    invoke-static {}, Lcom/whoop/domain/model/teams/PrivacyType;->$values()[Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/teams/PrivacyType;->$VALUES:[Lcom/whoop/domain/model/teams/PrivacyType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/teams/PrivacyType;->$ENTRIES:Lt83/a;

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

    iput p3, p0, Lcom/whoop/domain/model/teams/PrivacyType;->value:I

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

    sget-object v0, Lcom/whoop/domain/model/teams/PrivacyType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    const-class v0, Lcom/whoop/domain/model/teams/PrivacyType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/teams/PrivacyType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/domain/model/teams/PrivacyType;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/teams/PrivacyType;->$VALUES:[Lcom/whoop/domain/model/teams/PrivacyType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/domain/model/teams/PrivacyType;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/PrivacyType;->value:I

    return v0
.end method

.method public final isAtLeast(Lcom/whoop/domain/model/teams/PrivacyType;)Z
    .locals 3

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/domain/model/teams/PrivacyType$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-ne p1, v1, :cond_1

    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    return v2

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->SUMMARY:Lcom/whoop/domain/model/teams/PrivacyType;

    if-eq p0, p1, :cond_4

    sget-object p1, Lcom/whoop/domain/model/teams/PrivacyType;->DETAIL:Lcom/whoop/domain/model/teams/PrivacyType;

    if-ne p0, p1, :cond_3

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_0
    return v0
.end method
