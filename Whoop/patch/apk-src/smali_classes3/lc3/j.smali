.class public final enum Llc3/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Llc3/j;

.field public static final enum w:Llc3/j;

.field public static final enum x:Llc3/j;

.field public static final enum y:Llc3/j;

.field public static final enum z:Llc3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Llc3/j;

    const-string v1, "SUCCESSFUL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llc3/j;->w:Llc3/j;

    new-instance v1, Llc3/j;

    const-string v2, "REREGISTER"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Llc3/j;->x:Llc3/j;

    new-instance v2, Llc3/j;

    const-string v3, "CANCELLED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Llc3/j;->y:Llc3/j;

    new-instance v3, Llc3/j;

    const-string v4, "ALREADY_SELECTED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Llc3/j;->z:Llc3/j;

    filled-new-array {v0, v1, v2, v3}, [Llc3/j;

    move-result-object v0

    sput-object v0, Llc3/j;->E:[Llc3/j;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Llc3/j;
    .locals 1

    const-class v0, Llc3/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llc3/j;

    return-object p0
.end method

.method public static values()[Llc3/j;
    .locals 1

    sget-object v0, Llc3/j;->E:[Llc3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llc3/j;

    return-object v0
.end method
