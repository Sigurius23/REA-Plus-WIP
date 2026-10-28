.class public final Lrm/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final x:Lrm/q1;


# instance fields
.field public final w:Lzr/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrm/q1;

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    invoke-direct {v0, v1}, Lrm/q1;-><init>(Lzr/g0;)V

    sput-object v0, Lrm/q1;->x:Lrm/q1;

    return-void
.end method

.method public constructor <init>(Lzr/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Lrm/q1;->w:Lzr/g0;

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

    const-class v0, Lrm/q1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lrm/q1;

    iget-object v0, p0, Lrm/q1;->w:Lzr/g0;

    iget-object p1, p1, Lrm/q1;->w:Lzr/g0;

    invoke-virtual {v0, p1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lrm/q1;->w:Lzr/g0;

    invoke-virtual {v0}, Lzr/g0;->hashCode()I

    move-result v0

    return v0
.end method
