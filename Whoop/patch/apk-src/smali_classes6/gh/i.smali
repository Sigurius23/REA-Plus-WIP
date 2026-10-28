.class public final Lgh/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgh/h;


# instance fields
.field public final a:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgh/i;->a:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 5

    new-instance p1, Lgh/n;

    sget-object v0, Lne3/e0;->x:Ljava/lang/String;

    iget-object v0, p0, Lgh/i;->a:Ljava/io/File;

    invoke-static {v0}, Ljc/b;->p(Ljava/io/File;)Lne3/e0;

    move-result-object v1

    sget-object v2, Lne3/p;->w:Lne3/a0;

    new-instance v3, Ldh/p;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v2, v4, v4}, Ldh/p;-><init>(Lne3/e0;Lne3/p;Ljava/lang/String;Ljava/io/Closeable;)V

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v1

    invoke-static {v0}, Lx83/j;->m(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ldh/g;->y:Ldh/g;

    invoke-direct {p1, v3, v0, v1}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    return-object p1
.end method
