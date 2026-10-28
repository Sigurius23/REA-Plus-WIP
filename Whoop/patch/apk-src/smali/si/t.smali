.class public final Lsi/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsi/c;
.implements Lti/a;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/ArrayList;

.field public final c:I

.field public final d:Lti/h;

.field public final e:Lti/h;

.field public final f:Lti/h;


# direct methods
.method public constructor <init>(Lzi/b;Lyi/q;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsi/t;->b:Ljava/util/ArrayList;

    iget-boolean v0, p2, Lyi/q;->e:Z

    iput-boolean v0, p0, Lsi/t;->a:Z

    iget v0, p2, Lyi/q;->a:I

    iput v0, p0, Lsi/t;->c:I

    iget-object v0, p2, Lyi/q;->b:Lxi/b;

    invoke-virtual {v0}, Lxi/b;->H0()Lti/h;

    move-result-object v0

    iput-object v0, p0, Lsi/t;->d:Lti/h;

    iget-object v1, p2, Lyi/q;->c:Lxi/b;

    invoke-virtual {v1}, Lxi/b;->H0()Lti/h;

    move-result-object v1

    iput-object v1, p0, Lsi/t;->e:Lti/h;

    iget-object p2, p2, Lyi/q;->d:Lxi/b;

    invoke-virtual {p2}, Lxi/b;->H0()Lti/h;

    move-result-object p2

    iput-object p2, p0, Lsi/t;->f:Lti/h;

    invoke-virtual {p1, v0}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p1, v1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p1, p2}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {v0, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {v1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lsi/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lti/a;

    invoke-interface {v1}, Lti/a;->a()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public final d(Lti/a;)V
    .locals 1

    iget-object v0, p0, Lsi/t;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
