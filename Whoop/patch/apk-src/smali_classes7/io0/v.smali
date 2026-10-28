.class public final enum Lio0/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio0/v;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio0/v;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "FIRST_NAME",
        "LAST_NAME",
        "DATE_OF_BIRTH",
        "ADDRESS_LINE_1",
        "ADDRESS_LINE_2",
        "CITY",
        "STATE",
        "ZIP_CODE",
        "COUNTRY",
        "PHONE_NUMBER",
        "clinician-in-the-loop_release"
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

.field private static final synthetic $VALUES:[Lio0/v;

.field public static final enum ADDRESS_LINE_1:Lio0/v;

.field public static final enum ADDRESS_LINE_2:Lio0/v;

.field public static final enum CITY:Lio0/v;

.field public static final enum COUNTRY:Lio0/v;

.field public static final enum DATE_OF_BIRTH:Lio0/v;

.field public static final enum FIRST_NAME:Lio0/v;

.field public static final enum LAST_NAME:Lio0/v;

.field public static final enum PHONE_NUMBER:Lio0/v;

.field public static final enum STATE:Lio0/v;

.field public static final enum ZIP_CODE:Lio0/v;


# direct methods
.method private static final synthetic $values()[Lio0/v;
    .locals 10

    sget-object v0, Lio0/v;->FIRST_NAME:Lio0/v;

    sget-object v1, Lio0/v;->LAST_NAME:Lio0/v;

    sget-object v2, Lio0/v;->DATE_OF_BIRTH:Lio0/v;

    sget-object v3, Lio0/v;->ADDRESS_LINE_1:Lio0/v;

    sget-object v4, Lio0/v;->ADDRESS_LINE_2:Lio0/v;

    sget-object v5, Lio0/v;->CITY:Lio0/v;

    sget-object v6, Lio0/v;->STATE:Lio0/v;

    sget-object v7, Lio0/v;->ZIP_CODE:Lio0/v;

    sget-object v8, Lio0/v;->COUNTRY:Lio0/v;

    sget-object v9, Lio0/v;->PHONE_NUMBER:Lio0/v;

    filled-new-array/range {v0 .. v9}, [Lio0/v;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio0/v;

    const-string v1, "FIRST_NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->FIRST_NAME:Lio0/v;

    new-instance v0, Lio0/v;

    const-string v1, "LAST_NAME"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->LAST_NAME:Lio0/v;

    new-instance v0, Lio0/v;

    const-string v1, "DATE_OF_BIRTH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->DATE_OF_BIRTH:Lio0/v;

    new-instance v0, Lio0/v;

    const-string v1, "ADDRESS_LINE_1"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->ADDRESS_LINE_1:Lio0/v;

    new-instance v0, Lio0/v;

    const-string v1, "ADDRESS_LINE_2"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->ADDRESS_LINE_2:Lio0/v;

    new-instance v0, Lio0/v;

    const-string v1, "CITY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->CITY:Lio0/v;

    new-instance v0, Lio0/v;

    const-string v1, "STATE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->STATE:Lio0/v;

    new-instance v0, Lio0/v;

    const-string v1, "ZIP_CODE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->ZIP_CODE:Lio0/v;

    new-instance v0, Lio0/v;

    const-string v1, "COUNTRY"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->COUNTRY:Lio0/v;

    new-instance v0, Lio0/v;

    const-string v1, "PHONE_NUMBER"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lio0/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio0/v;->PHONE_NUMBER:Lio0/v;

    invoke-static {}, Lio0/v;->$values()[Lio0/v;

    move-result-object v0

    sput-object v0, Lio0/v;->$VALUES:[Lio0/v;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio0/v;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lio0/v;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio0/v;
    .locals 1

    const-class v0, Lio0/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio0/v;

    return-object p0
.end method

.method public static values()[Lio0/v;
    .locals 1

    sget-object v0, Lio0/v;->$VALUES:[Lio0/v;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio0/v;

    return-object v0
.end method
