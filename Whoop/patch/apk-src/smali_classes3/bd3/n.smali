.class public final Lbd3/n;
.super Lbd3/k;
.source "SourceFile"


# instance fields
.field public final d:Lad3/c;

.field public e:I


# direct methods
.method public constructor <init>(Lbd3/v;Lad3/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lbd3/k;-><init>(Lbd3/v;)V

    iput-object p2, p0, Lbd3/n;->d:Lad3/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbd3/k;->b:Z

    iget v1, p0, Lbd3/n;->e:I

    add-int/2addr v1, v0

    iput v1, p0, Lbd3/n;->e:I

    return-void
.end method

.method public final b()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbd3/k;->b:Z

    const-string v1, "\n"

    invoke-virtual {p0, v1}, Lbd3/k;->j(Ljava/lang/String;)V

    iget v1, p0, Lbd3/n;->e:I

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lbd3/n;->d:Lad3/c;

    iget-object v2, v2, Lad3/c;->a:Lad3/i;

    iget-object v2, v2, Lad3/i;->g:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lbd3/k;->j(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-boolean v0, p0, Lbd3/k;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbd3/k;->b:Z

    return-void

    :cond_0
    invoke-virtual {p0}, Lbd3/n;->b()V

    return-void
.end method

.method public final n()V
    .locals 1

    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Lbd3/k;->g(C)V

    return-void
.end method

.method public final o()V
    .locals 1

    iget v0, p0, Lbd3/n;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lbd3/n;->e:I

    return-void
.end method
