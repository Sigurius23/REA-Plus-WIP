.class public final enum Lgq1/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgq1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgq1/a$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgq1/a$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lgq1/a$b;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "COACHING_TAB",
        "DEEPLINK",
        "OVERVIEW",
        "IMPACTS_SUMMARY",
        "JOURNAL",
        "JOURNAL_V2",
        "RECOVERY_DETAILS",
        "behavior-impact_release"
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

.field private static final synthetic $VALUES:[Lgq1/a$b;

.field public static final enum COACHING_TAB:Lgq1/a$b;

.field public static final Companion:Lgq1/a$b$a;

.field public static final enum DEEPLINK:Lgq1/a$b;

.field public static final enum IMPACTS_SUMMARY:Lgq1/a$b;

.field public static final enum JOURNAL:Lgq1/a$b;

.field public static final enum JOURNAL_V2:Lgq1/a$b;

.field public static final enum OVERVIEW:Lgq1/a$b;

.field public static final enum RECOVERY_DETAILS:Lgq1/a$b;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lgq1/a$b;
    .locals 7

    sget-object v0, Lgq1/a$b;->COACHING_TAB:Lgq1/a$b;

    sget-object v1, Lgq1/a$b;->DEEPLINK:Lgq1/a$b;

    sget-object v2, Lgq1/a$b;->OVERVIEW:Lgq1/a$b;

    sget-object v3, Lgq1/a$b;->IMPACTS_SUMMARY:Lgq1/a$b;

    sget-object v4, Lgq1/a$b;->JOURNAL:Lgq1/a$b;

    sget-object v5, Lgq1/a$b;->JOURNAL_V2:Lgq1/a$b;

    sget-object v6, Lgq1/a$b;->RECOVERY_DETAILS:Lgq1/a$b;

    filled-new-array/range {v0 .. v6}, [Lgq1/a$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgq1/a$b;

    const/4 v1, 0x0

    const-string v2, "Coaching Tab"

    const-string v3, "COACHING_TAB"

    invoke-direct {v0, v3, v1, v2}, Lgq1/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgq1/a$b;->COACHING_TAB:Lgq1/a$b;

    new-instance v0, Lgq1/a$b;

    const/4 v1, 0x1

    const-string v2, "Deeplink"

    const-string v3, "DEEPLINK"

    invoke-direct {v0, v3, v1, v2}, Lgq1/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgq1/a$b;->DEEPLINK:Lgq1/a$b;

    new-instance v0, Lgq1/a$b;

    const/4 v1, 0x2

    const-string v2, "Overview"

    const-string v3, "OVERVIEW"

    invoke-direct {v0, v3, v1, v2}, Lgq1/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgq1/a$b;->OVERVIEW:Lgq1/a$b;

    new-instance v0, Lgq1/a$b;

    const/4 v1, 0x3

    const-string v2, "Impacts Summary"

    const-string v3, "IMPACTS_SUMMARY"

    invoke-direct {v0, v3, v1, v2}, Lgq1/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgq1/a$b;->IMPACTS_SUMMARY:Lgq1/a$b;

    new-instance v0, Lgq1/a$b;

    const/4 v1, 0x4

    const-string v2, "Journal"

    const-string v3, "JOURNAL"

    invoke-direct {v0, v3, v1, v2}, Lgq1/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgq1/a$b;->JOURNAL:Lgq1/a$b;

    new-instance v0, Lgq1/a$b;

    const/4 v1, 0x5

    const-string v2, "journal"

    const-string v3, "JOURNAL_V2"

    invoke-direct {v0, v3, v1, v2}, Lgq1/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgq1/a$b;->JOURNAL_V2:Lgq1/a$b;

    new-instance v0, Lgq1/a$b;

    const/4 v1, 0x6

    const-string v2, "Recovery Details"

    const-string v3, "RECOVERY_DETAILS"

    invoke-direct {v0, v3, v1, v2}, Lgq1/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgq1/a$b;->RECOVERY_DETAILS:Lgq1/a$b;

    invoke-static {}, Lgq1/a$b;->$values()[Lgq1/a$b;

    move-result-object v0

    sput-object v0, Lgq1/a$b;->$VALUES:[Lgq1/a$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lgq1/a$b;->$ENTRIES:Lt83/a;

    new-instance v0, Lgq1/a$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgq1/a$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgq1/a$b;->Companion:Lgq1/a$b$a;

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

    iput-object p3, p0, Lgq1/a$b;->value:Ljava/lang/String;

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

    sget-object v0, Lgq1/a$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgq1/a$b;
    .locals 1

    const-class v0, Lgq1/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgq1/a$b;

    return-object p0
.end method

.method public static values()[Lgq1/a$b;
    .locals 1

    sget-object v0, Lgq1/a$b;->$VALUES:[Lgq1/a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgq1/a$b;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgq1/a$b;->value:Ljava/lang/String;

    return-object v0
.end method
