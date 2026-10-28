.class public final Lb3/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/f;


# instance fields
.field public final synthetic w:Ly1/g;

.field public final x:Lb3/a2;


# direct methods
.method public constructor <init>(Ly1/g;Lb3/a2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/y1;->w:Ly1/g;

    iput-object p2, p0, Lb3/y1;->x:Lb3/a2;

    return-void
.end method


# virtual methods
.method public final b(Lc93/a;Ljava/lang/String;)Ly1/e;
    .locals 1

    iget-object v0, p0, Lb3/y1;->w:Ly1/g;

    invoke-virtual {v0, p1, p2}, Ly1/g;->b(Lc93/a;Ljava/lang/String;)Ly1/e;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lb3/y1;->w:Ly1/g;

    invoke-virtual {v0, p1}, Ly1/g;->d(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lb3/y1;->w:Ly1/g;

    invoke-virtual {v0}, Ly1/g;->e()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb3/y1;->w:Ly1/g;

    invoke-virtual {v0, p1}, Ly1/g;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
