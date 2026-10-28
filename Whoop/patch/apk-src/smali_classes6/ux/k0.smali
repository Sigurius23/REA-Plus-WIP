.class public final enum Lux/k0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic w:[Lux/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lux/k0;

    const-string v1, "WeChatPayV1"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0}, [Lux/k0;

    move-result-object v0

    sput-object v0, Lux/k0;->w:[Lux/k0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lux/k0;
    .locals 1

    const-class v0, Lux/k0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lux/k0;

    return-object p0
.end method

.method public static values()[Lux/k0;
    .locals 1

    sget-object v0, Lux/k0;->w:[Lux/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lux/k0;

    return-object v0
.end method
