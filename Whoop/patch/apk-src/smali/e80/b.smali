.class public final enum Le80/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le80/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0011\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Le80/b;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "PROFILE_TO_PERMISSION",
        "PERMISSION_TO_PLAN_PICKER",
        "HW_ONLY_AFTER_ACTIVATION_TO_HOME",
        "MEDICARE_PERMISSIONS_TO_AFTER_ACTIVATION",
        "MEDICARE_AFTER_ACTIVATION_TO_HOME",
        "AL_PROFILE_TO_PERMISSIONS",
        "AL_PERMISSIONS_TO_AFTER_ACTIVATION",
        "AL_AFTER_ACTIVATION_TO_HOME",
        "ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION_TO_AFTER_ACTIVATION",
        "AFTER_ACTIVATION_FINAL_SCREENS_TO_HOME",
        "activation_release"
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

.field private static final synthetic $VALUES:[Le80/b;

.field public static final enum ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION_TO_AFTER_ACTIVATION:Le80/b;

.field public static final enum AFTER_ACTIVATION_FINAL_SCREENS_TO_HOME:Le80/b;

.field public static final enum AL_AFTER_ACTIVATION_TO_HOME:Le80/b;

.field public static final enum AL_PERMISSIONS_TO_AFTER_ACTIVATION:Le80/b;

.field public static final enum AL_PROFILE_TO_PERMISSIONS:Le80/b;

.field public static final enum HW_ONLY_AFTER_ACTIVATION_TO_HOME:Le80/b;

.field public static final enum MEDICARE_AFTER_ACTIVATION_TO_HOME:Le80/b;

.field public static final enum MEDICARE_PERMISSIONS_TO_AFTER_ACTIVATION:Le80/b;

.field public static final enum PERMISSION_TO_PLAN_PICKER:Le80/b;

.field public static final enum PROFILE_TO_PERMISSION:Le80/b;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Le80/b;
    .locals 10

    sget-object v0, Le80/b;->PROFILE_TO_PERMISSION:Le80/b;

    sget-object v1, Le80/b;->PERMISSION_TO_PLAN_PICKER:Le80/b;

    sget-object v2, Le80/b;->HW_ONLY_AFTER_ACTIVATION_TO_HOME:Le80/b;

    sget-object v3, Le80/b;->MEDICARE_PERMISSIONS_TO_AFTER_ACTIVATION:Le80/b;

    sget-object v4, Le80/b;->MEDICARE_AFTER_ACTIVATION_TO_HOME:Le80/b;

    sget-object v5, Le80/b;->AL_PROFILE_TO_PERMISSIONS:Le80/b;

    sget-object v6, Le80/b;->AL_PERMISSIONS_TO_AFTER_ACTIVATION:Le80/b;

    sget-object v7, Le80/b;->AL_AFTER_ACTIVATION_TO_HOME:Le80/b;

    sget-object v8, Le80/b;->ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION_TO_AFTER_ACTIVATION:Le80/b;

    sget-object v9, Le80/b;->AFTER_ACTIVATION_FINAL_SCREENS_TO_HOME:Le80/b;

    filled-new-array/range {v0 .. v9}, [Le80/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Le80/b;

    const/4 v1, 0x0

    const-string v2, "profile_to_permission"

    const-string v3, "PROFILE_TO_PERMISSION"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->PROFILE_TO_PERMISSION:Le80/b;

    new-instance v0, Le80/b;

    const/4 v1, 0x1

    const-string v2, "permission_to_plan_picker"

    const-string v3, "PERMISSION_TO_PLAN_PICKER"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->PERMISSION_TO_PLAN_PICKER:Le80/b;

    new-instance v0, Le80/b;

    const/4 v1, 0x2

    const-string v2, "hw_only_after_activation_to_home"

    const-string v3, "HW_ONLY_AFTER_ACTIVATION_TO_HOME"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->HW_ONLY_AFTER_ACTIVATION_TO_HOME:Le80/b;

    new-instance v0, Le80/b;

    const/4 v1, 0x3

    const-string v2, "medicare_permissions_to_after_activation"

    const-string v3, "MEDICARE_PERMISSIONS_TO_AFTER_ACTIVATION"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->MEDICARE_PERMISSIONS_TO_AFTER_ACTIVATION:Le80/b;

    new-instance v0, Le80/b;

    const/4 v1, 0x4

    const-string v2, "medicare_after_activation_to_home"

    const-string v3, "MEDICARE_AFTER_ACTIVATION_TO_HOME"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->MEDICARE_AFTER_ACTIVATION_TO_HOME:Le80/b;

    new-instance v0, Le80/b;

    const/4 v1, 0x5

    const-string v2, "al_profile_to_permissions"

    const-string v3, "AL_PROFILE_TO_PERMISSIONS"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->AL_PROFILE_TO_PERMISSIONS:Le80/b;

    new-instance v0, Le80/b;

    const/4 v1, 0x6

    const-string v2, "al_permissions_to_after_activation"

    const-string v3, "AL_PERMISSIONS_TO_AFTER_ACTIVATION"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->AL_PERMISSIONS_TO_AFTER_ACTIVATION:Le80/b;

    new-instance v0, Le80/b;

    const/4 v1, 0x7

    const-string v2, "al_after_activation_to_home"

    const-string v3, "AL_AFTER_ACTIVATION_TO_HOME"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->AL_AFTER_ACTIVATION_TO_HOME:Le80/b;

    new-instance v0, Le80/b;

    const/16 v1, 0x8

    const-string v2, "account_transition_legacy_after_activation_to_after_activation"

    const-string v3, "ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION_TO_AFTER_ACTIVATION"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION_TO_AFTER_ACTIVATION:Le80/b;

    new-instance v0, Le80/b;

    const/16 v1, 0x9

    const-string v2, "after_activation_final_screens_to_home"

    const-string v3, "AFTER_ACTIVATION_FINAL_SCREENS_TO_HOME"

    invoke-direct {v0, v3, v1, v2}, Le80/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le80/b;->AFTER_ACTIVATION_FINAL_SCREENS_TO_HOME:Le80/b;

    invoke-static {}, Le80/b;->$values()[Le80/b;

    move-result-object v0

    sput-object v0, Le80/b;->$VALUES:[Le80/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Le80/b;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Le80/b;->value:Ljava/lang/String;

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

    sget-object v0, Le80/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Le80/b;
    .locals 1

    const-class v0, Le80/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le80/b;

    return-object p0
.end method

.method public static values()[Le80/b;
    .locals 1

    sget-object v0, Le80/b;->$VALUES:[Le80/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le80/b;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le80/b;->value:Ljava/lang/String;

    return-object v0
.end method
