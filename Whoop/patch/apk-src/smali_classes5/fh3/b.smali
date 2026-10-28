.class public final enum Lfh3/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lxg3/t;


# static fields
.field public static final enum w:Lfh3/b;

.field public static final synthetic x:[Lfh3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfh3/b;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfh3/b;->w:Lfh3/b;

    filled-new-array {v0}, [Lfh3/b;

    move-result-object v0

    sput-object v0, Lfh3/b;->x:[Lfh3/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lfh3/b;
    .locals 1

    const-class v0, Lfh3/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfh3/b;

    return-object p0
.end method

.method public static values()[Lfh3/b;
    .locals 1

    sget-object v0, Lfh3/b;->x:[Lfh3/b;

    invoke-virtual {v0}, [Lfh3/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfh3/b;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b()V
    .locals 0

    return-void
.end method
