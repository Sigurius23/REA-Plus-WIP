.class public final Lu8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lu8/d;


# instance fields
.field public final a:I

.field public b:Lty/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lu8/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu8/d;-><init>(I)V

    sput-object v0, Lu8/d;->c:Lu8/d;

    const/4 v0, 0x3

    const/4 v2, 0x4

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v3, v4, v0, v2}, Lte0/d;->v(IIIII)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu8/d;->a:I

    return-void
.end method


# virtual methods
.method public final a()Lty/c;
    .locals 1

    iget-object v0, p0, Lu8/d;->b:Lty/c;

    if-nez v0, :cond_0

    new-instance v0, Lty/c;

    invoke-direct {v0, p0}, Lty/c;-><init>(Lu8/d;)V

    iput-object v0, p0, Lu8/d;->b:Lty/c;

    :cond_0
    iget-object v0, p0, Lu8/d;->b:Lty/c;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_2

    const-class v1, Lu8/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lu8/d;

    iget v1, p0, Lu8/d;->a:I

    iget p1, p1, Lu8/d;->a:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    const/16 v0, 0x20f

    iget v1, p0, Lu8/d;->a:I

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x1f

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
