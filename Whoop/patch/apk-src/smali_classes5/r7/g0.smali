.class public abstract enum Lr7/g0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lr7/f0;

.field public static final enum x:Lr7/e0;

.field public static final synthetic y:[Lr7/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lr7/f0;

    invoke-direct {v0}, Lr7/f0;-><init>()V

    sput-object v0, Lr7/g0;->w:Lr7/f0;

    new-instance v1, Lr7/e0;

    invoke-direct {v1}, Lr7/e0;-><init>()V

    sput-object v1, Lr7/g0;->x:Lr7/e0;

    const/4 v2, 0x2

    new-array v2, v2, [Lr7/g0;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lr7/g0;->y:[Lr7/g0;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr7/g0;
    .locals 1

    const-class v0, Lr7/g0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr7/g0;

    return-object p0
.end method

.method public static values()[Lr7/g0;
    .locals 1

    sget-object v0, Lr7/g0;->y:[Lr7/g0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr7/g0;

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()D
.end method
