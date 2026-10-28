.class public final Lu4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(IIILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lu4/f;->a:Ljava/lang/String;

    iput p1, p0, Lu4/f;->b:I

    iput-boolean p6, p0, Lu4/f;->c:Z

    iput-object p5, p0, Lu4/f;->d:Ljava/lang/String;

    iput p2, p0, Lu4/f;->e:I

    iput p3, p0, Lu4/f;->f:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lu4/f;->f:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lu4/f;->e:I

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu4/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lu4/f;->b:I

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lu4/f;->c:Z

    return v0
.end method
