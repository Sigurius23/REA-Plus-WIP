.class public final Lu8/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu8/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    const/4 v0, 0x0

    xor-int/lit8 v1, v0, 0x1

    invoke-static {v1}, Lva3/g;->i(Z)V

    invoke-static {v0}, Lx8/t;->F(I)V

    return-void
.end method

.method public constructor <init>(Lu8/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/f0;->a:Lu8/n;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lu8/f0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lu8/f0;

    iget-object v0, p0, Lu8/f0;->a:Lu8/n;

    iget-object p1, p1, Lu8/f0;->a:Lu8/n;

    invoke-virtual {v0, p1}, Lu8/n;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lu8/f0;->a:Lu8/n;

    invoke-virtual {v0}, Lu8/n;->hashCode()I

    move-result v0

    return v0
.end method
