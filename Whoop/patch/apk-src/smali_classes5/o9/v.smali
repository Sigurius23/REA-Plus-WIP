.class public final Lo9/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[Lb9/i1;

.field public final c:[Lo9/s;

.field public final d:Lu8/v0;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>([Lb9/i1;[Lo9/s;Lu8/v0;Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->d(Z)V

    iput-object p1, p0, Lo9/v;->b:[Lb9/i1;

    invoke-virtual {p2}, [Lo9/s;->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lo9/s;

    iput-object p2, p0, Lo9/v;->c:[Lo9/s;

    iput-object p3, p0, Lo9/v;->d:Lu8/v0;

    iput-object p4, p0, Lo9/v;->e:Ljava/lang/Object;

    array-length p1, p1

    iput p1, p0, Lo9/v;->a:I

    return-void
.end method


# virtual methods
.method public final a(Lo9/v;I)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lo9/v;->b:[Lb9/i1;

    aget-object v1, v1, p2

    iget-object v2, p1, Lo9/v;->b:[Lb9/i1;

    aget-object v2, v2, p2

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lo9/v;->c:[Lo9/s;

    aget-object v1, v1, p2

    iget-object p1, p1, Lo9/v;->c:[Lo9/s;

    aget-object p1, p1, p2

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final b(I)Z
    .locals 1

    iget-object v0, p0, Lo9/v;->b:[Lb9/i1;

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
