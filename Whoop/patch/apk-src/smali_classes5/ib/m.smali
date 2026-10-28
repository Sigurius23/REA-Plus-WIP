.class public final Lib/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lib/m;->a:I

    iput v0, p0, Lib/m;->b:I

    iput v0, p0, Lib/m;->d:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lib/m;->c:Z

    return-void
.end method


# virtual methods
.method public a()Lib/m;
    .locals 5

    iget v0, p0, Lib/m;->b:I

    if-gez v0, :cond_0

    iget v0, p0, Lib/m;->a:I

    iput v0, p0, Lib/m;->b:I

    :cond_0
    iget v0, p0, Lib/m;->d:I

    if-gez v0, :cond_1

    iget v0, p0, Lib/m;->a:I

    mul-int/lit8 v0, v0, 0x3

    iput v0, p0, Lib/m;->d:I

    :cond_1
    iget-boolean v0, p0, Lib/m;->c:Z

    new-instance v1, Lib/m;

    iget v2, p0, Lib/m;->a:I

    iget v3, p0, Lib/m;->b:I

    iget v4, p0, Lib/m;->d:I

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v2, v1, Lib/m;->a:I

    iput v3, v1, Lib/m;->b:I

    iput-boolean v0, v1, Lib/m;->c:Z

    iput v4, v1, Lib/m;->d:I

    return-object v1
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lib/m;->c:Z

    return-void
.end method

.method public c()V
    .locals 1

    const/16 v0, 0x50

    iput v0, p0, Lib/m;->d:I

    return-void
.end method

.method public d()V
    .locals 1

    const/16 v0, 0x28

    iput v0, p0, Lib/m;->a:I

    return-void
.end method
