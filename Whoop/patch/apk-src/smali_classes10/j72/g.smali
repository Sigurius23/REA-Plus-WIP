.class public final enum Lj72/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj72/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lj72/g;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SAGE_SELECTION_DO_ANY_OF_THESE_APPLY",
        "SAGE_SELECTION_BLOOD_PRESSURE_STATUS",
        "SAGE_INFO_CHECKBOX_IMPORTANT_NOTE",
        "SAGE_INFO_BASELINE",
        "SAGE_GUIDELINES_ACKNOWLEDGE",
        "SAGE_MANUAL_READING_INPUT",
        "SAGE_SUBMIT",
        "SAGE_CALIBRATION_COMPLETE",
        "UNKNOWN",
        "sage_release"
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

.field private static final synthetic $VALUES:[Lj72/g;

.field public static final enum SAGE_CALIBRATION_COMPLETE:Lj72/g;

.field public static final enum SAGE_GUIDELINES_ACKNOWLEDGE:Lj72/g;

.field public static final enum SAGE_INFO_BASELINE:Lj72/g;

.field public static final enum SAGE_INFO_CHECKBOX_IMPORTANT_NOTE:Lj72/g;

.field public static final enum SAGE_MANUAL_READING_INPUT:Lj72/g;

.field public static final enum SAGE_SELECTION_BLOOD_PRESSURE_STATUS:Lj72/g;

.field public static final enum SAGE_SELECTION_DO_ANY_OF_THESE_APPLY:Lj72/g;

.field public static final enum SAGE_SUBMIT:Lj72/g;

.field public static final enum UNKNOWN:Lj72/g;


# direct methods
.method private static final synthetic $values()[Lj72/g;
    .locals 9

    sget-object v0, Lj72/g;->SAGE_SELECTION_DO_ANY_OF_THESE_APPLY:Lj72/g;

    sget-object v1, Lj72/g;->SAGE_SELECTION_BLOOD_PRESSURE_STATUS:Lj72/g;

    sget-object v2, Lj72/g;->SAGE_INFO_CHECKBOX_IMPORTANT_NOTE:Lj72/g;

    sget-object v3, Lj72/g;->SAGE_INFO_BASELINE:Lj72/g;

    sget-object v4, Lj72/g;->SAGE_GUIDELINES_ACKNOWLEDGE:Lj72/g;

    sget-object v5, Lj72/g;->SAGE_MANUAL_READING_INPUT:Lj72/g;

    sget-object v6, Lj72/g;->SAGE_SUBMIT:Lj72/g;

    sget-object v7, Lj72/g;->SAGE_CALIBRATION_COMPLETE:Lj72/g;

    sget-object v8, Lj72/g;->UNKNOWN:Lj72/g;

    filled-new-array/range {v0 .. v8}, [Lj72/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj72/g;

    const-string v1, "SAGE_SELECTION_DO_ANY_OF_THESE_APPLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj72/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj72/g;->SAGE_SELECTION_DO_ANY_OF_THESE_APPLY:Lj72/g;

    new-instance v0, Lj72/g;

    const-string v1, "SAGE_SELECTION_BLOOD_PRESSURE_STATUS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lj72/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj72/g;->SAGE_SELECTION_BLOOD_PRESSURE_STATUS:Lj72/g;

    new-instance v0, Lj72/g;

    const-string v1, "SAGE_INFO_CHECKBOX_IMPORTANT_NOTE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lj72/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj72/g;->SAGE_INFO_CHECKBOX_IMPORTANT_NOTE:Lj72/g;

    new-instance v0, Lj72/g;

    const-string v1, "SAGE_INFO_BASELINE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lj72/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj72/g;->SAGE_INFO_BASELINE:Lj72/g;

    new-instance v0, Lj72/g;

    const-string v1, "SAGE_GUIDELINES_ACKNOWLEDGE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lj72/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj72/g;->SAGE_GUIDELINES_ACKNOWLEDGE:Lj72/g;

    new-instance v0, Lj72/g;

    const-string v1, "SAGE_MANUAL_READING_INPUT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lj72/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj72/g;->SAGE_MANUAL_READING_INPUT:Lj72/g;

    new-instance v0, Lj72/g;

    const-string v1, "SAGE_SUBMIT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lj72/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj72/g;->SAGE_SUBMIT:Lj72/g;

    new-instance v0, Lj72/g;

    const-string v1, "SAGE_CALIBRATION_COMPLETE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lj72/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj72/g;->SAGE_CALIBRATION_COMPLETE:Lj72/g;

    new-instance v0, Lj72/g;

    const-string v1, "UNKNOWN"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lj72/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj72/g;->UNKNOWN:Lj72/g;

    invoke-static {}, Lj72/g;->$values()[Lj72/g;

    move-result-object v0

    sput-object v0, Lj72/g;->$VALUES:[Lj72/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lj72/g;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lj72/g;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lj72/g;
    .locals 1

    const-class v0, Lj72/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj72/g;

    return-object p0
.end method

.method public static values()[Lj72/g;
    .locals 1

    sget-object v0, Lj72/g;->$VALUES:[Lj72/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj72/g;

    return-object v0
.end method
