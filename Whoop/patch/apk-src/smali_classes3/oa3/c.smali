.class public final enum Loa3/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Loa3/c;

.field public static final enum x:Loa3/c;

.field public static final enum y:Loa3/c;

.field public static final synthetic z:[Loa3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Loa3/c;

    const-string v1, "PROPERTY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Loa3/c;->w:Loa3/c;

    new-instance v1, Loa3/c;

    const-string v2, "BACKING_FIELD"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Loa3/c;->x:Loa3/c;

    new-instance v2, Loa3/c;

    const-string v3, "DELEGATE_FIELD"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Loa3/c;->y:Loa3/c;

    filled-new-array {v0, v1, v2}, [Loa3/c;

    move-result-object v0

    sput-object v0, Loa3/c;->z:[Loa3/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Loa3/c;
    .locals 1

    const-class v0, Loa3/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Loa3/c;

    return-object p0
.end method

.method public static values()[Loa3/c;
    .locals 1

    sget-object v0, Loa3/c;->z:[Loa3/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Loa3/c;

    return-object v0
.end method
