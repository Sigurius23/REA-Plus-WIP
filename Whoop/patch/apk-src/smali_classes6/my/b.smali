.class public final enum Lmy/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Lmy/b;

.field public static final enum x:Lmy/b;

.field public static final enum y:Lmy/b;

.field public static final enum z:Lmy/b;


# instance fields
.field public final w:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lmy/b;

    const-string v1, "Full"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lmy/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lmy/b;->x:Lmy/b;

    new-instance v1, Lmy/b;

    const v2, 0x7f1410c2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "Partial"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lmy/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v1, Lmy/b;->y:Lmy/b;

    new-instance v2, Lmy/b;

    const-string v4, "None"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Lmy/b;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v2, Lmy/b;->z:Lmy/b;

    filled-new-array {v0, v1, v2}, [Lmy/b;

    move-result-object v0

    sput-object v0, Lmy/b;->E:[Lmy/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lmy/b;->w:Ljava/lang/Integer;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmy/b;
    .locals 1

    const-class v0, Lmy/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmy/b;

    return-object p0
.end method

.method public static values()[Lmy/b;
    .locals 1

    sget-object v0, Lmy/b;->E:[Lmy/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmy/b;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lzy/b;
    .locals 2

    const-string v0, "merchantDisplayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmy/b;->w:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-static {v0, p1, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
