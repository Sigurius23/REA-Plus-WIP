.class public abstract Lfw/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lfw/g;

    sget-object v1, Lfw/b;->b:Lfw/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lfw/c;->b:Lfw/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lfw/e;->b:Lfw/e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lfw/d;->b:Lfw/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lfw/a;->b:Lfw/a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lfw/f;->b:Lfw/f;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lfw/g;->a:Ljava/util/List;

    return-void
.end method
