.class public final Lgh/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgh/g;


# instance fields
.field public final a:Ll83/p;

.field public final b:Ll83/p;

.field public final c:Z


# direct methods
.method public constructor <init>(Ll83/p;Ll83/p;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgh/j;->a:Ll83/p;

    iput-object p2, p0, Lgh/j;->b:Ll83/p;

    iput-boolean p3, p0, Lgh/j;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lmh/m;)Lgh/h;
    .locals 6

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    new-instance v0, Lgh/m;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lgh/j;->b:Ll83/p;

    iget-boolean v5, p0, Lgh/j;->c:Z

    iget-object v3, p0, Lgh/j;->a:Ll83/p;

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lgh/m;-><init>(Ljava/lang/String;Lmh/m;Ll83/p;Ll83/p;Z)V

    return-object v0
.end method
