.class public abstract Lzr/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lzr/w;

.field public static final b:Lzr/x;

.field public static final c:Lzr/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzr/w;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lzr/y;->a:Lzr/w;

    new-instance v0, Lzr/x;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lzr/x;-><init>(I)V

    sput-object v0, Lzr/y;->b:Lzr/x;

    new-instance v0, Lzr/x;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lzr/x;-><init>(I)V

    sput-object v0, Lzr/y;->c:Lzr/x;

    return-void
.end method


# virtual methods
.method public abstract a(II)Lzr/y;
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;
.end method

.method public abstract c(ZZ)Lzr/y;
.end method

.method public abstract d(ZZ)Lzr/y;
.end method

.method public abstract e()I
.end method
