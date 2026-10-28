.class public final enum Ly00/t2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ly00/t2;

.field public static final synthetic F:[Ly00/t2;

.field public static final enum x:Ly00/t2;

.field public static final enum y:Ly00/t2;

.field public static final enum z:Ly00/t2;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ly00/t2;

    const/4 v1, 0x0

    const-string v2, "link_card_not_supported"

    const-string v3, "LinkCardNotSupported"

    invoke-direct {v0, v3, v1, v2}, Ly00/t2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/t2;->x:Ly00/t2;

    new-instance v1, Ly00/t2;

    const/4 v2, 0x1

    const-string v3, "disabled_in_elements_session"

    const-string v4, "DisabledInElementsSession"

    invoke-direct {v1, v4, v2, v3}, Ly00/t2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/t2;->y:Ly00/t2;

    new-instance v2, Ly00/t2;

    const/4 v3, 0x2

    const-string v4, "signup_opt_in_feature_no_email_provided"

    const-string v5, "SignupOptInFeatureNoEmailProvided"

    invoke-direct {v2, v5, v3, v4}, Ly00/t2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ly00/t2;->z:Ly00/t2;

    new-instance v3, Ly00/t2;

    const/4 v4, 0x3

    const-string v5, "attestation_issues"

    const-string v6, "AttestationIssues"

    invoke-direct {v3, v6, v4, v5}, Ly00/t2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Ly00/t2;

    const/4 v5, 0x4

    const-string v6, "link_used_before"

    const-string v7, "LinkUsedBefore"

    invoke-direct {v4, v7, v5, v6}, Ly00/t2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Ly00/t2;->E:Ly00/t2;

    filled-new-array {v0, v1, v2, v3, v4}, [Ly00/t2;

    move-result-object v0

    sput-object v0, Ly00/t2;->F:[Ly00/t2;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/t2;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/t2;
    .locals 1

    const-class v0, Ly00/t2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/t2;

    return-object p0
.end method

.method public static values()[Ly00/t2;
    .locals 1

    sget-object v0, Ly00/t2;->F:[Ly00/t2;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/t2;

    return-object v0
.end method
