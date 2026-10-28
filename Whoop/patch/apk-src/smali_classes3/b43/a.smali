.class public final enum Lb43/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lb43/a;

.field public static final synthetic y:[Lb43/a;


# instance fields
.field public final w:Lme3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lb43/a;

    const/4 v1, 0x0

    sget-object v2, Lme3/a;->w:Lme3/a;

    const-string v3, "NONE"

    invoke-direct {v0, v3, v1, v2}, Lb43/a;-><init>(Ljava/lang/String;ILme3/a;)V

    new-instance v1, Lb43/a;

    const/4 v2, 0x1

    sget-object v3, Lme3/a;->x:Lme3/a;

    const-string v4, "BASIC"

    invoke-direct {v1, v4, v2, v3}, Lb43/a;-><init>(Ljava/lang/String;ILme3/a;)V

    sput-object v1, Lb43/a;->x:Lb43/a;

    new-instance v2, Lb43/a;

    const/4 v3, 0x2

    sget-object v4, Lme3/a;->z:Lme3/a;

    const-string v5, "BODY"

    invoke-direct {v2, v5, v3, v4}, Lb43/a;-><init>(Ljava/lang/String;ILme3/a;)V

    filled-new-array {v0, v1, v2}, [Lb43/a;

    move-result-object v0

    sput-object v0, Lb43/a;->y:[Lb43/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILme3/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb43/a;->w:Lme3/a;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb43/a;
    .locals 1

    const-class v0, Lb43/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb43/a;

    return-object p0
.end method

.method public static values()[Lb43/a;
    .locals 1

    sget-object v0, Lb43/a;->y:[Lb43/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb43/a;

    return-object v0
.end method
