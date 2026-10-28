.class public abstract Lio/ktor/utils/io/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static final b:Lx63/e;

.field public static final c:Lio/ktor/utils/io/internal/f;

.field public static final d:Lio/ktor/utils/io/internal/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "BufferSize"

    const/16 v1, 0x1000

    invoke-static {v1, v0}, Lj93/l0;->A(ILjava/lang/String;)I

    move-result v0

    sput v0, Lio/ktor/utils/io/internal/g;->a:I

    const-string v1, "BufferPoolSize"

    const/16 v2, 0x800

    invoke-static {v2, v1}, Lj93/l0;->A(ILjava/lang/String;)I

    move-result v1

    const-string v2, "BufferObjectPoolSize"

    const/16 v3, 0x400

    invoke-static {v3, v2}, Lj93/l0;->A(ILjava/lang/String;)I

    move-result v2

    new-instance v3, Lx63/e;

    invoke-direct {v3, v1, v0}, Lx63/e;-><init>(II)V

    sput-object v3, Lio/ktor/utils/io/internal/g;->b:Lx63/e;

    new-instance v0, Lio/ktor/utils/io/internal/f;

    invoke-direct {v0, v2}, Lx63/d;-><init>(I)V

    sput-object v0, Lio/ktor/utils/io/internal/g;->c:Lio/ktor/utils/io/internal/f;

    new-instance v0, Lio/ktor/utils/io/internal/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/ktor/utils/io/internal/e;-><init>(I)V

    sput-object v0, Lio/ktor/utils/io/internal/g;->d:Lio/ktor/utils/io/internal/e;

    return-void
.end method
