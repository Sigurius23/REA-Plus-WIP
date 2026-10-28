.class public final Lud3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lud3/l;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Landroidx/room/c1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lud3/l;

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lud3/l;-><init>(Ljava/util/Set;Landroidx/room/c1;)V

    sput-object v1, Lud3/l;->c:Lud3/l;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Landroidx/room/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/l;->a:Ljava/util/Set;

    iput-object p2, p0, Lud3/l;->b:Landroidx/room/c1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lud3/l;

    if-eqz v0, :cond_0

    check-cast p1, Lud3/l;

    iget-object v0, p1, Lud3/l;->a:Ljava/util/Set;

    iget-object v1, p0, Lud3/l;->a:Ljava/util/Set;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lud3/l;->b:Landroidx/room/c1;

    iget-object v0, p0, Lud3/l;->b:Landroidx/room/c1;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lud3/l;->a:Ljava/util/Set;

    const/16 v1, 0x29

    const/16 v2, 0x5ed

    invoke-static {v0, v2, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-object v1, p0, Lud3/l;->b:Landroidx/room/c1;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method
