.class public final Lio/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final x:Lio/u;


# instance fields
.field public final w:Lzr/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/u;

    sget-object v1, Lzr/b1;->G:Lzr/b1;

    invoke-direct {v0, v1}, Lio/u;-><init>(Ljava/util/Map;)V

    sput-object v0, Lio/u;->x:Lio/u;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lzr/b1;->a(Ljava/util/Map;)Lzr/b1;

    move-result-object p1

    iput-object p1, p0, Lio/u;->w:Lzr/b1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lio/u;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/u;

    iget-object p1, p1, Lio/u;->w:Lzr/b1;

    iget-object v0, p0, Lio/u;->w:Lzr/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Lzr/q;->e(Ljava/lang/Object;Ljava/util/Map;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/u;->w:Lzr/b1;

    invoke-virtual {v0}, Lzr/b1;->hashCode()I

    move-result v0

    return v0
.end method
