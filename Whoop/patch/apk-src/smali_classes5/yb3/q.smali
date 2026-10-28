.class public final enum Lyb3/q;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lyb3/d;


# static fields
.field public static final enum x:Lyb3/q;

.field public static final synthetic y:[Lyb3/q;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lyb3/q;

    const-string v1, "IGNORE_CASE"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lyb3/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyb3/q;->x:Lyb3/q;

    new-instance v1, Lyb3/q;

    const/16 v2, 0x8

    const-string v4, "MULTILINE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lyb3/q;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lyb3/q;

    const-string v4, "LITERAL"

    const/16 v6, 0x10

    invoke-direct {v2, v4, v3, v6}, Lyb3/q;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lyb3/q;

    const-string v4, "UNIX_LINES"

    const/4 v6, 0x3

    invoke-direct {v3, v4, v6, v5}, Lyb3/q;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lyb3/q;

    const-string v5, "COMMENTS"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lyb3/q;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lyb3/q;

    const/4 v6, 0x5

    const/16 v7, 0x20

    const-string v8, "DOT_MATCHES_ALL"

    invoke-direct {v5, v8, v6, v7}, Lyb3/q;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lyb3/q;

    const/4 v7, 0x6

    const/16 v8, 0x80

    const-string v9, "CANON_EQ"

    invoke-direct {v6, v9, v7, v8}, Lyb3/q;-><init>(Ljava/lang/String;II)V

    filled-new-array/range {v0 .. v6}, [Lyb3/q;

    move-result-object v0

    sput-object v0, Lyb3/q;->y:[Lyb3/q;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lyb3/q;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyb3/q;
    .locals 1

    const-class v0, Lyb3/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyb3/q;

    return-object p0
.end method

.method public static values()[Lyb3/q;
    .locals 1

    sget-object v0, Lyb3/q;->y:[Lyb3/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyb3/q;

    return-object v0
.end method
