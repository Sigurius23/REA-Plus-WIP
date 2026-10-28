.class public final Lzg/c;
.super Lb3/b;
.source "SourceFile"


# instance fields
.field public final d:Lzg/a;

.field public final e:Lzg/a;

.field public final f:Lzg/a;


# direct methods
.method public constructor <init>(Lev/i;Ljava/io/ByteArrayInputStream;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    new-instance v0, Lzg/a;

    invoke-direct {v0, p1, p2}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    iput-object v0, p0, Lzg/c;->d:Lzg/a;

    new-instance v0, Lzg/a;

    invoke-direct {v0, p1, p2}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    iput-object v0, p0, Lzg/c;->e:Lzg/a;

    new-instance v0, Lzg/a;

    invoke-direct {v0, p1, p2}, Lb3/b;-><init>(Lev/i;Ljava/io/InputStream;)V

    iput-object v0, p0, Lzg/c;->f:Lzg/a;

    return-void
.end method
