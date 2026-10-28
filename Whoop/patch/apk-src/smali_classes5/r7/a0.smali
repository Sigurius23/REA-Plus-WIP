.class public abstract enum Lr7/a0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lr7/a0;

.field public static final enum w:Lr7/u;

.field public static final enum x:Lr7/v;

.field public static final enum y:Lr7/x;

.field public static final enum z:Lr7/z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lr7/u;

    invoke-direct {v0}, Lr7/u;-><init>()V

    sput-object v0, Lr7/a0;->w:Lr7/u;

    new-instance v1, Lr7/v;

    invoke-direct {v1}, Lr7/v;-><init>()V

    sput-object v1, Lr7/a0;->x:Lr7/v;

    new-instance v2, Lr7/x;

    invoke-direct {v2}, Lr7/x;-><init>()V

    sput-object v2, Lr7/a0;->y:Lr7/x;

    new-instance v3, Lr7/w;

    invoke-direct {v3}, Lr7/w;-><init>()V

    new-instance v4, Lr7/y;

    invoke-direct {v4}, Lr7/y;-><init>()V

    new-instance v5, Lr7/z;

    invoke-direct {v5}, Lr7/z;-><init>()V

    sput-object v5, Lr7/a0;->z:Lr7/z;

    const/4 v6, 0x6

    new-array v6, v6, [Lr7/a0;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v2, v6, v0

    const/4 v0, 0x3

    aput-object v3, v6, v0

    const/4 v0, 0x4

    aput-object v4, v6, v0

    const/4 v0, 0x5

    aput-object v5, v6, v0

    sput-object v6, Lr7/a0;->E:[Lr7/a0;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr7/a0;
    .locals 1

    const-class v0, Lr7/a0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr7/a0;

    return-object p0
.end method

.method public static values()[Lr7/a0;
    .locals 1

    sget-object v0, Lr7/a0;->E:[Lr7/a0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr7/a0;

    return-object v0
.end method


# virtual methods
.method public abstract a()D
.end method
