.class public final Lu8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x1

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x2

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x3

    invoke-static {v0}, Lx8/t;->F(I)V

    return-void
.end method

.method public constructor <init>(Lu8/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lu8/i;->a:I

    iput p1, p0, Lu8/i;->b:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lu8/i;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lu8/i;

    iget v0, p0, Lu8/i;->a:I

    iget v1, p1, Lu8/i;->a:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lu8/i;->b:I

    iget p1, p1, Lu8/i;->b:I

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    const/16 v0, 0x3fd1

    iget v1, p0, Lu8/i;->a:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu8/i;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
