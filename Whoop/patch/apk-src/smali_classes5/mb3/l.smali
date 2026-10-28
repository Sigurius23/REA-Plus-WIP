.class public final Lmb3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmb3/k;


# instance fields
.field public final c:Lmb3/e;

.field public final d:Lya3/n;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lmb3/e;->a:Lmb3/e;

    iput-object v0, p0, Lmb3/l;->c:Lmb3/e;

    new-instance v0, Lya3/n;

    sget-object v1, Lya3/n;->d:Lya3/j;

    invoke-direct {v0, v1}, Lya3/n;-><init>(Lmb3/c;)V

    iput-object v0, p0, Lmb3/l;->d:Lya3/n;

    return-void
.end method


# virtual methods
.method public final a(Llb3/y;Llb3/y;)Z
    .locals 4

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x0

    iget-object v3, p0, Lmb3/l;->c:Lmb3/e;

    invoke-static {v2, v0, v3, v1}, Lmb3/g;->k(ZLmb3/m;Lmb3/e;I)Llb3/p0;

    move-result-object v0

    invoke-virtual {p1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    invoke-virtual {p2}, Llb3/y;->p0()Llb3/f1;

    move-result-object p2

    invoke-static {v0, p1, p2}, Llb3/d;->g(Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result p1

    return p1
.end method

.method public final b(Llb3/y;Llb3/y;)Z
    .locals 4

    const-string v0, "subtype"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertype"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x1

    iget-object v3, p0, Lmb3/l;->c:Lmb3/e;

    invoke-static {v2, v0, v3, v1}, Lmb3/g;->k(ZLmb3/m;Lmb3/e;I)Llb3/p0;

    move-result-object v0

    invoke-virtual {p1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    invoke-virtual {p2}, Llb3/y;->p0()Llb3/f1;

    move-result-object p2

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, Llb3/p0;->b(Lob3/g;Lob3/g;)Z

    iget-object v1, v0, Llb3/p0;->c:Lob3/o;

    sget-object v2, Llb3/d;->a:Llb3/d;

    invoke-virtual {v2, v0, v1, p1, p2}, Llb3/d;->e(Llb3/p0;Lob3/o;Lob3/g;Lob3/g;)Z

    move-result v2

    :goto_0
    return v2
.end method
