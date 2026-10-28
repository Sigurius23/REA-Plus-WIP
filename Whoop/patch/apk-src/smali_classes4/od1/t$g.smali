.class public final enum Lod1/t$g;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lod1/t$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lod1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lod1/t$g;",
        ">;",
        "Lod1/t$i;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lod1/t$g;

.field public static final enum TIMEOUT:Lod1/t$g;

.field public static final enum WILDCARD:Lod1/t$g;


# direct methods
.method private static synthetic $values()[Lod1/t$g;
    .locals 2

    sget-object v0, Lod1/t$g;->WILDCARD:Lod1/t$g;

    sget-object v1, Lod1/t$g;->TIMEOUT:Lod1/t$g;

    filled-new-array {v0, v1}, [Lod1/t$g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lod1/t$g;

    const-string v1, "WILDCARD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lod1/t$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lod1/t$g;->WILDCARD:Lod1/t$g;

    new-instance v0, Lod1/t$g;

    const-string v1, "TIMEOUT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lod1/t$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lod1/t$g;->TIMEOUT:Lod1/t$g;

    invoke-static {}, Lod1/t$g;->$values()[Lod1/t$g;

    move-result-object v0

    sput-object v0, Lod1/t$g;->$VALUES:[Lod1/t$g;

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

.method public static valueOf(Ljava/lang/String;)Lod1/t$g;
    .locals 1

    const-class v0, Lod1/t$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lod1/t$g;

    return-object p0
.end method

.method public static values()[Lod1/t$g;
    .locals 1

    sget-object v0, Lod1/t$g;->$VALUES:[Lod1/t$g;

    invoke-virtual {v0}, [Lod1/t$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lod1/t$g;

    return-object v0
.end method
