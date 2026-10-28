.class public final La0/h1;
.super Lm83/e0;
.source "SourceFile"


# instance fields
.field public w:I

.field public final synthetic x:La0/g1;


# direct methods
.method public constructor <init>(La0/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/h1;->x:La0/g1;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, La0/h1;->w:I

    iget-object v1, p0, La0/h1;->x:La0/g1;

    invoke-virtual {v1}, La0/g1;->g()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final nextInt()I
    .locals 2

    iget v0, p0, La0/h1;->w:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, La0/h1;->w:I

    iget-object v1, p0, La0/h1;->x:La0/g1;

    invoke-virtual {v1, v0}, La0/g1;->e(I)I

    move-result v0

    return v0
.end method
