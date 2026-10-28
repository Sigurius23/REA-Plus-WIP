.class public final enum Lkz/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lkz/i;

.field public static final enum x:Lkz/i;

.field public static final enum y:Lkz/i;

.field public static final synthetic z:[Lkz/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkz/i;

    const-string v1, "ForData"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkz/i;->w:Lkz/i;

    new-instance v1, Lkz/i;

    const-string v2, "ForInstantDebits"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkz/i;->x:Lkz/i;

    new-instance v2, Lkz/i;

    const-string v3, "ForToken"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lkz/i;->y:Lkz/i;

    filled-new-array {v0, v1, v2}, [Lkz/i;

    move-result-object v0

    sput-object v0, Lkz/i;->z:[Lkz/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkz/i;
    .locals 1

    const-class v0, Lkz/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkz/i;

    return-object p0
.end method

.method public static values()[Lkz/i;
    .locals 1

    sget-object v0, Lkz/i;->z:[Lkz/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkz/i;

    return-object v0
.end method
