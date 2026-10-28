.class public abstract enum Lr7/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lr7/f;

.field public static final enum x:Lr7/h;

.field public static final enum y:Lr7/i;

.field public static final synthetic z:[Lr7/j;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lr7/f;

    invoke-direct {v0}, Lr7/f;-><init>()V

    sput-object v0, Lr7/j;->w:Lr7/f;

    new-instance v1, Lr7/h;

    invoke-direct {v1}, Lr7/h;-><init>()V

    sput-object v1, Lr7/j;->x:Lr7/h;

    new-instance v2, Lr7/g;

    invoke-direct {v2}, Lr7/g;-><init>()V

    new-instance v3, Lr7/i;

    invoke-direct {v3}, Lr7/i;-><init>()V

    sput-object v3, Lr7/j;->y:Lr7/i;

    const/4 v4, 0x4

    new-array v4, v4, [Lr7/j;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    sput-object v4, Lr7/j;->z:[Lr7/j;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr7/j;
    .locals 1

    const-class v0, Lr7/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr7/j;

    return-object p0
.end method

.method public static values()[Lr7/j;
    .locals 1

    sget-object v0, Lr7/j;->z:[Lr7/j;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr7/j;

    return-object v0
.end method


# virtual methods
.method public abstract a()D
.end method

.method public abstract b()Ljava/lang/String;
.end method
