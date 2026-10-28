.class public final Lo0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Lr1/c;

.field public c:Z

.field public d:I

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lo0/a;->a:I

    new-instance v1, Lr1/c;

    const/16 v2, 0x10

    new-array v2, v2, [Lp0/j0;

    invoke-direct {v1, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v1, p0, Lo0/a;->b:Lr1/c;

    iput v0, p0, Lo0/a;->d:I

    return-void
.end method

.method public static a(Lo0/o;Z)I
    .locals 0

    if-eqz p1, :cond_0

    iget-object p0, p0, Lo0/o;->m:Ljava/lang/Object;

    invoke-static {p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/p;

    iget p0, p0, Lo0/p;->a:I

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_0
    iget-object p0, p0, Lo0/o;->m:Ljava/lang/Object;

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/p;

    iget p0, p0, Lo0/p;->a:I

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static b(Lo0/o;Z)I
    .locals 1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lo0/o;->m:Ljava/lang/Object;

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo0/p;

    iget-object p0, p0, Lo0/o;->q:Lh0/d2;

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    if-ne p0, v0, :cond_0

    iget p0, p1, Lo0/p;->u:I

    goto :goto_0

    :cond_0
    iget p0, p1, Lo0/p;->v:I

    :goto_0
    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    iget-object p1, p0, Lo0/o;->m:Ljava/lang/Object;

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo0/p;

    iget-object p0, p0, Lo0/o;->q:Lh0/d2;

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    if-ne p0, v0, :cond_2

    iget p0, p1, Lo0/p;->u:I

    goto :goto_1

    :cond_2
    iget p0, p1, Lo0/p;->v:I

    :goto_1
    add-int/lit8 p0, p0, -0x1

    return p0
.end method
