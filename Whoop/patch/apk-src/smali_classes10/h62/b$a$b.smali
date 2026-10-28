.class public final enum Lh62/b$a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh62/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh62/b$a$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lh62/b$a$b;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "GENERATE_CODES",
        "SHARE_FIRST_CODE",
        "SHARE_SECOND_CODE",
        "SHARE_THIRD_CODE",
        "ALL_CODES_SHARED",
        "refer-a-friend_release"
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

.field private static final synthetic $VALUES:[Lh62/b$a$b;

.field public static final enum ALL_CODES_SHARED:Lh62/b$a$b;

.field public static final enum GENERATE_CODES:Lh62/b$a$b;

.field public static final enum SHARE_FIRST_CODE:Lh62/b$a$b;

.field public static final enum SHARE_SECOND_CODE:Lh62/b$a$b;

.field public static final enum SHARE_THIRD_CODE:Lh62/b$a$b;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lh62/b$a$b;
    .locals 5

    sget-object v0, Lh62/b$a$b;->GENERATE_CODES:Lh62/b$a$b;

    sget-object v1, Lh62/b$a$b;->SHARE_FIRST_CODE:Lh62/b$a$b;

    sget-object v2, Lh62/b$a$b;->SHARE_SECOND_CODE:Lh62/b$a$b;

    sget-object v3, Lh62/b$a$b;->SHARE_THIRD_CODE:Lh62/b$a$b;

    sget-object v4, Lh62/b$a$b;->ALL_CODES_SHARED:Lh62/b$a$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lh62/b$a$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh62/b$a$b;

    const/4 v1, 0x0

    const-string v2, "Generate Codes"

    const-string v3, "GENERATE_CODES"

    invoke-direct {v0, v3, v1, v2}, Lh62/b$a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh62/b$a$b;->GENERATE_CODES:Lh62/b$a$b;

    new-instance v0, Lh62/b$a$b;

    const/4 v1, 0x1

    const-string v2, "Share First Code"

    const-string v3, "SHARE_FIRST_CODE"

    invoke-direct {v0, v3, v1, v2}, Lh62/b$a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh62/b$a$b;->SHARE_FIRST_CODE:Lh62/b$a$b;

    new-instance v0, Lh62/b$a$b;

    const/4 v1, 0x2

    const-string v2, "Share Second Code"

    const-string v3, "SHARE_SECOND_CODE"

    invoke-direct {v0, v3, v1, v2}, Lh62/b$a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh62/b$a$b;->SHARE_SECOND_CODE:Lh62/b$a$b;

    new-instance v0, Lh62/b$a$b;

    const/4 v1, 0x3

    const-string v2, "Share Third Code"

    const-string v3, "SHARE_THIRD_CODE"

    invoke-direct {v0, v3, v1, v2}, Lh62/b$a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh62/b$a$b;->SHARE_THIRD_CODE:Lh62/b$a$b;

    new-instance v0, Lh62/b$a$b;

    const/4 v1, 0x4

    const-string v2, "All Codes Shared"

    const-string v3, "ALL_CODES_SHARED"

    invoke-direct {v0, v3, v1, v2}, Lh62/b$a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh62/b$a$b;->ALL_CODES_SHARED:Lh62/b$a$b;

    invoke-static {}, Lh62/b$a$b;->$values()[Lh62/b$a$b;

    move-result-object v0

    sput-object v0, Lh62/b$a$b;->$VALUES:[Lh62/b$a$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lh62/b$a$b;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Lh62/b$a$b;->value:Ljava/lang/String;

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

    sget-object v0, Lh62/b$a$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh62/b$a$b;
    .locals 1

    const-class v0, Lh62/b$a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh62/b$a$b;

    return-object p0
.end method

.method public static values()[Lh62/b$a$b;
    .locals 1

    sget-object v0, Lh62/b$a$b;->$VALUES:[Lh62/b$a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh62/b$a$b;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh62/b$a$b;->value:Ljava/lang/String;

    return-object v0
.end method
