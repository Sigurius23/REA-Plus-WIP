.class public final Lu4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu4/d;


# instance fields
.field public final a:Lc5/d;

.field public final b:Lc5/d;

.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lc5/d;Lc5/d;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/g;->a:Lc5/d;

    iput-object p2, p0, Lu4/g;->b:Lc5/d;

    iput p3, p0, Lu4/g;->d:I

    iput p4, p0, Lu4/g;->c:I

    iput-object p5, p0, Lu4/g;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lc5/d;
    .locals 1

    iget-object v0, p0, Lu4/g;->b:Lc5/d;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lu4/g;->d:I

    return v0
.end method

.method public final c()Lc5/d;
    .locals 1

    iget-object v0, p0, Lu4/g;->a:Lc5/d;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu4/g;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lu4/g;->c:I

    return v0
.end method
