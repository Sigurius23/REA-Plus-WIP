.class public final enum Llb3/g1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Llb3/g1;

.field public static final synthetic F:[Llb3/g1;

.field public static final enum y:Llb3/g1;

.field public static final enum z:Llb3/g1;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Llb3/g1;

    const-string v1, "INVARIANT"

    const/4 v2, 0x0

    const-string v3, ""

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Llb3/g1;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Llb3/g1;->y:Llb3/g1;

    new-instance v1, Llb3/g1;

    const-string v3, "IN_VARIANCE"

    const-string v5, "in"

    invoke-direct {v1, v3, v4, v5, v2}, Llb3/g1;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Llb3/g1;->z:Llb3/g1;

    new-instance v2, Llb3/g1;

    const/4 v3, 0x2

    const-string v5, "out"

    const-string v6, "OUT_VARIANCE"

    invoke-direct {v2, v6, v3, v5, v4}, Llb3/g1;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v2, Llb3/g1;->E:Llb3/g1;

    filled-new-array {v0, v1, v2}, [Llb3/g1;

    move-result-object v0

    sput-object v0, Llb3/g1;->F:[Llb3/g1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Llb3/g1;->w:Ljava/lang/String;

    iput-boolean p4, p0, Llb3/g1;->x:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Llb3/g1;
    .locals 1

    const-class v0, Llb3/g1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llb3/g1;

    return-object p0
.end method

.method public static values()[Llb3/g1;
    .locals 1

    sget-object v0, Llb3/g1;->F:[Llb3/g1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llb3/g1;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llb3/g1;->w:Ljava/lang/String;

    return-object v0
.end method
