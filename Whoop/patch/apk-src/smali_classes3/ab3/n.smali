.class public final enum Lab3/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic w:[Lab3/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lab3/n;

    const-string v1, "COMMON_SUPER_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lab3/n;

    const-string v2, "INTERSECTION_TYPE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1}, [Lab3/n;

    move-result-object v0

    sput-object v0, Lab3/n;->w:[Lab3/n;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lab3/n;
    .locals 1

    const-class v0, Lab3/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lab3/n;

    return-object p0
.end method

.method public static values()[Lab3/n;
    .locals 1

    sget-object v0, Lab3/n;->w:[Lab3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lab3/n;

    return-object v0
.end method
