.class public final enum Ly00/c2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Ly00/c2;

.field public static final enum y:Ly00/c2;

.field public static final synthetic z:[Ly00/c2;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly00/c2;

    const/4 v1, 0x0

    const-string v2, "user_action"

    const-string v3, "USER_ACTION"

    invoke-direct {v0, v3, v1, v2}, Ly00/c2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/c2;->x:Ly00/c2;

    new-instance v1, Ly00/c2;

    const/4 v2, 0x1

    const-string v3, "customer_object"

    const-string v4, "CUSTOMER_OBJECT"

    invoke-direct {v1, v4, v2, v3}, Ly00/c2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/c2;->y:Ly00/c2;

    filled-new-array {v0, v1}, [Ly00/c2;

    move-result-object v0

    sput-object v0, Ly00/c2;->z:[Ly00/c2;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/c2;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/c2;
    .locals 1

    const-class v0, Ly00/c2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/c2;

    return-object p0
.end method

.method public static values()[Ly00/c2;
    .locals 1

    sget-object v0, Ly00/c2;->z:[Ly00/c2;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/c2;

    return-object v0
.end method
