.class public final enum Ly00/q1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ly00/q1;

.field public static final enum F:Ly00/q1;

.field public static final enum G:Ly00/q1;

.field public static final synthetic H:[Ly00/q1;

.field public static final synthetic I:Lt83/b;

.field public static final enum x:Ly00/q1;

.field public static final enum y:Ly00/q1;

.field public static final enum z:Ly00/q1;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ly00/q1;

    const/4 v1, 0x0

    const-string v2, "link_global_holdback"

    const-string v3, "LINK_GLOBAL_HOLD_BACK"

    invoke-direct {v0, v3, v1, v2}, Ly00/q1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/q1;->x:Ly00/q1;

    new-instance v1, Ly00/q1;

    const/4 v2, 0x1

    const-string v3, "link_global_holdback_aa"

    const-string v4, "LINK_GLOBAL_HOLD_BACK_AA"

    invoke-direct {v1, v4, v2, v3}, Ly00/q1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/q1;->y:Ly00/q1;

    new-instance v2, Ly00/q1;

    const/4 v3, 0x2

    const-string v4, "link_ab_test"

    const-string v5, "LINK_AB_TEST"

    invoke-direct {v2, v5, v3, v4}, Ly00/q1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ly00/q1;->z:Ly00/q1;

    new-instance v3, Ly00/q1;

    const/4 v4, 0x3

    const-string v5, "ocs_mobile_horizontal_mode_android_aa"

    const-string v6, "OCS_MOBILE_HORIZONTAL_MODE_ANDROID_AA"

    invoke-direct {v3, v6, v4, v5}, Ly00/q1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Ly00/q1;->E:Ly00/q1;

    new-instance v4, Ly00/q1;

    const/4 v5, 0x4

    const-string v6, "ocs_mobile_horizontal_mode_aa"

    const-string v7, "OCS_MOBILE_HORIZONTAL_MODE_AA"

    invoke-direct {v4, v7, v5, v6}, Ly00/q1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Ly00/q1;->F:Ly00/q1;

    new-instance v5, Ly00/q1;

    const/4 v6, 0x5

    const-string v7, "ocs_mobile_horizontal_mode"

    const-string v8, "OCS_MOBILE_HORIZONTAL_MODE"

    invoke-direct {v5, v8, v6, v7}, Ly00/q1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Ly00/q1;->G:Ly00/q1;

    filled-new-array/range {v0 .. v5}, [Ly00/q1;

    move-result-object v0

    sput-object v0, Ly00/q1;->H:[Ly00/q1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/q1;->I:Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/q1;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/q1;
    .locals 1

    const-class v0, Ly00/q1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/q1;

    return-object p0
.end method

.method public static values()[Ly00/q1;
    .locals 1

    sget-object v0, Ly00/q1;->H:[Ly00/q1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/q1;

    return-object v0
.end method
