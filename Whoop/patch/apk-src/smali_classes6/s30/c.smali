.class public final Ls30/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls30/d;


# static fields
.field public static final a:Ls30/c;

.field public static final b:Lm40/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ls30/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls30/c;->a:Ls30/c;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    const/16 v2, 0x400

    int-to-long v2, v2

    div-long/2addr v0, v2

    const/16 v2, 0x8

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    const/16 v1, 0x2800

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v1, Lm40/d;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lm40/d;-><init>(II)V

    sput-object v1, Ls30/c;->b:Lm40/d;

    return-void
.end method
