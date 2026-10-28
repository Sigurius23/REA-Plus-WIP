.class public final enum Lf1/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lf1/h;

.field public static final enum x:Lf1/h;

.field public static final enum y:Lf1/h;

.field public static final synthetic z:[Lf1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lf1/h;

    const-string v1, "BEFORE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/h;->w:Lf1/h;

    new-instance v1, Lf1/h;

    const-string v2, "ON"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lf1/h;->x:Lf1/h;

    new-instance v2, Lf1/h;

    const-string v3, "AFTER"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lf1/h;->y:Lf1/h;

    filled-new-array {v0, v1, v2}, [Lf1/h;

    move-result-object v0

    sput-object v0, Lf1/h;->z:[Lf1/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf1/h;
    .locals 1

    const-class v0, Lf1/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf1/h;

    return-object p0
.end method

.method public static values()[Lf1/h;
    .locals 1

    sget-object v0, Lf1/h;->z:[Lf1/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf1/h;

    return-object v0
.end method
