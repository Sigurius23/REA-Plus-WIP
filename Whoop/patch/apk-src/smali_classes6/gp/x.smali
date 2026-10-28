.class public final enum Lgp/x;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lgp/a;


# static fields
.field public static final enum x:Lgp/x;

.field public static final synthetic y:[Lgp/x;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lgp/x;

    const/4 v1, 0x0

    const/16 v2, -0x101

    const-string v3, "RS256"

    invoke-direct {v0, v3, v1, v2}, Lgp/x;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lgp/x;

    const/4 v2, 0x1

    const/16 v3, -0x102

    const-string v4, "RS384"

    invoke-direct {v1, v4, v2, v3}, Lgp/x;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lgp/x;

    const/4 v3, 0x2

    const/16 v4, -0x103

    const-string v5, "RS512"

    invoke-direct {v2, v5, v3, v4}, Lgp/x;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lgp/x;

    const/4 v4, 0x3

    const/16 v5, -0x106

    const-string v6, "LEGACY_RS1"

    invoke-direct {v3, v6, v4, v5}, Lgp/x;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lgp/x;

    const/4 v5, 0x4

    const/16 v6, -0x25

    const-string v7, "PS256"

    invoke-direct {v4, v7, v5, v6}, Lgp/x;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lgp/x;

    const/4 v6, 0x5

    const/16 v7, -0x26

    const-string v8, "PS384"

    invoke-direct {v5, v8, v6, v7}, Lgp/x;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lgp/x;

    const/4 v7, 0x6

    const/16 v8, -0x27

    const-string v9, "PS512"

    invoke-direct {v6, v9, v7, v8}, Lgp/x;-><init>(Ljava/lang/String;II)V

    new-instance v7, Lgp/x;

    const/4 v8, 0x7

    const v9, -0xffff

    const-string v10, "RS1"

    invoke-direct {v7, v10, v8, v9}, Lgp/x;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lgp/x;->x:Lgp/x;

    filled-new-array/range {v0 .. v7}, [Lgp/x;

    move-result-object v0

    sput-object v0, Lgp/x;->y:[Lgp/x;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lgp/x;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgp/x;
    .locals 1

    const-class v0, Lgp/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgp/x;

    return-object p0
.end method

.method public static values()[Lgp/x;
    .locals 1

    sget-object v0, Lgp/x;->y:[Lgp/x;

    invoke-virtual {v0}, [Lgp/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgp/x;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lgp/x;->w:I

    return v0
.end method
