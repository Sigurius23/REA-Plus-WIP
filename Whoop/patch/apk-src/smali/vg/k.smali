.class public final enum Lvg/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lvg/k;

.field public static final synthetic F:[Lvg/k;

.field public static final enum w:Lvg/k;

.field public static final enum x:Lvg/k;

.field public static final enum y:Lvg/k;

.field public static final enum z:Lvg/k;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lvg/k;

    const-string v1, "Linux"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvg/k;->w:Lvg/k;

    new-instance v1, Lvg/k;

    const-string v2, "MacOs"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lvg/k;->x:Lvg/k;

    new-instance v2, Lvg/k;

    const-string v3, "Windows"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lvg/k;->y:Lvg/k;

    new-instance v3, Lvg/k;

    const-string v4, "Android"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lvg/k;->z:Lvg/k;

    new-instance v4, Lvg/k;

    const-string v5, "Ios"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v5, Lvg/k;

    const-string v6, "IpadOs"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v6, Lvg/k;

    const-string v7, "TvOs"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v7, Lvg/k;

    const-string v8, "WatchOs"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v8, Lvg/k;

    const-string v9, "Unknown"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lvg/k;->E:Lvg/k;

    filled-new-array/range {v0 .. v8}, [Lvg/k;

    move-result-object v0

    sput-object v0, Lvg/k;->F:[Lvg/k;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lvg/k;
    .locals 1

    const-class v0, Lvg/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvg/k;

    return-object p0
.end method

.method public static values()[Lvg/k;
    .locals 1

    sget-object v0, Lvg/k;->F:[Lvg/k;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvg/k;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    const-string v0, "unknown"

    return-object v0

    :pswitch_1
    const-string v0, "watchos"

    return-object v0

    :pswitch_2
    const-string v0, "tvos"

    return-object v0

    :pswitch_3
    const-string v0, "ipados"

    return-object v0

    :pswitch_4
    const-string v0, "ios"

    return-object v0

    :pswitch_5
    const-string v0, "android"

    return-object v0

    :pswitch_6
    const-string v0, "windows"

    return-object v0

    :pswitch_7
    const-string v0, "macos"

    return-object v0

    :pswitch_8
    const-string v0, "linux"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
