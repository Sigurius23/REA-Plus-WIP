.class public final Lsi/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lti/a;
.implements Lsi/c;


# instance fields
.field public final a:Lqi/w;

.field public final b:Lti/d;

.field public c:Lyi/l;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/b;Lyi/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsi/q;->a:Lqi/w;

    invoke-virtual {p3}, Lyi/k;->b()Lxi/f;

    move-result-object p1

    invoke-interface {p1}, Lxi/f;->k0()Lti/d;

    move-result-object p1

    iput-object p1, p0, Lsi/q;->b:Lti/d;

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    return-void
.end method

.method public static d(II)I
    .locals 2

    div-int v0, p0, p1

    xor-int v1, p0, p1

    if-gez v1, :cond_0

    mul-int v1, v0, p1

    if-eq v1, p0, :cond_0

    add-int/lit8 v0, v0, -0x1

    :cond_0
    mul-int/2addr v0, p1

    sub-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lsi/q;->a:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    return-void
.end method

.method public final b(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    return-void
.end method
