.class public final Lb3/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li3/p;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:J


# direct methods
.method public constructor <init>(Li3/p;IIIIJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/e0;->a:Li3/p;

    iput p2, p0, Lb3/e0;->b:I

    iput p3, p0, Lb3/e0;->c:I

    iput p4, p0, Lb3/e0;->d:I

    iput p5, p0, Lb3/e0;->e:I

    iput-wide p6, p0, Lb3/e0;->f:J

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lb3/e0;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lb3/e0;->d:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lb3/e0;->c:I

    return v0
.end method

.method public final d()Li3/p;
    .locals 1

    iget-object v0, p0, Lb3/e0;->a:Li3/p;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lb3/e0;->e:I

    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lb3/e0;->f:J

    return-wide v0
.end method
