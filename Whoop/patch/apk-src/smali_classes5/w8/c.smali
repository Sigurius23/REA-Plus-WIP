.class public final Lw8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lw8/c;


# instance fields
.field public final a:Lzr/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw8/c;

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    invoke-direct {v0, v1}, Lw8/c;-><init>(Ljava/util/List;)V

    sput-object v0, Lw8/c;->b:Lw8/c;

    const/4 v0, 0x0

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x1

    invoke-static {v0}, Lx8/t;->F(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->a:Lzr/g0;

    return-void
.end method
