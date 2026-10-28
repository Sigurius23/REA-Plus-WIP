.class public Loh2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loh2/d$a;
    }
.end annotation


# instance fields
.field private a:Loh2/c;

.field private b:Loh2/b;

.field private c:Loh2/b;

.field private d:Loh2/e;

.field private e:B

.field private f:B

.field private g:Ljava/lang/String;

.field private h:Loh2/a;


# direct methods
.method private constructor <init>(Loh2/c;Loh2/b;Loh2/b;Loh2/e;BBLjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Loh2/d;->a:Loh2/c;

    .line 4
    iput-object p2, p0, Loh2/d;->b:Loh2/b;

    .line 5
    iput-object p3, p0, Loh2/d;->c:Loh2/b;

    .line 6
    iput-object p4, p0, Loh2/d;->d:Loh2/e;

    .line 7
    iput-byte p5, p0, Loh2/d;->e:B

    .line 8
    iput-byte p6, p0, Loh2/d;->f:B

    .line 9
    iput-object p7, p0, Loh2/d;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Loh2/c;Loh2/b;Loh2/b;Loh2/e;BBLjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Loh2/d;-><init>(Loh2/c;Loh2/b;Loh2/b;Loh2/e;BBLjava/lang/String;)V

    return-void
.end method

.method public static b()Loh2/d$a;
    .locals 1

    new-instance v0, Loh2/d$a;

    invoke-direct {v0}, Loh2/d$a;-><init>()V

    return-object v0
.end method

.method public static i(Loh2/a;)Loh2/d;
    .locals 8

    new-instance v0, Loh2/d;

    invoke-virtual {p0}, Loh2/a;->d()Loh2/c;

    move-result-object v1

    invoke-virtual {p0}, Loh2/a;->c()Loh2/b;

    move-result-object v2

    invoke-virtual {p0}, Loh2/a;->b()Loh2/b;

    move-result-object v3

    invoke-virtual {p0}, Loh2/a;->e()Loh2/e;

    move-result-object v4

    invoke-virtual {p0}, Loh2/a;->g()B

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {p0}, Loh2/a;->f()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Loh2/d;-><init>(Loh2/c;Loh2/b;Loh2/b;Loh2/e;BBLjava/lang/String;)V

    iput-object p0, v0, Loh2/d;->h:Loh2/a;

    return-object v0
.end method


# virtual methods
.method public a()Loh2/a;
    .locals 2

    iget-object v0, p0, Loh2/d;->h:Loh2/a;

    if-nez v0, :cond_0

    invoke-static {}, Loh2/a;->a()Loh2/a$b;

    move-result-object v0

    iget-object v1, p0, Loh2/d;->a:Loh2/c;

    invoke-virtual {v0, v1}, Loh2/a$b;->d(Loh2/c;)Loh2/a$b;

    move-result-object v0

    iget-object v1, p0, Loh2/d;->b:Loh2/b;

    invoke-virtual {v0, v1}, Loh2/a$b;->c(Loh2/b;)Loh2/a$b;

    move-result-object v0

    iget-object v1, p0, Loh2/d;->c:Loh2/b;

    invoke-virtual {v0, v1}, Loh2/a$b;->a(Loh2/b;)Loh2/a$b;

    move-result-object v0

    iget-object v1, p0, Loh2/d;->d:Loh2/e;

    invoke-virtual {v0, v1}, Loh2/a$b;->e(Loh2/e;)Loh2/a$b;

    move-result-object v0

    iget-object v1, p0, Loh2/d;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Loh2/a$b;->f(Ljava/lang/String;)Loh2/a$b;

    move-result-object v0

    iget-byte v1, p0, Loh2/d;->e:B

    invoke-virtual {v0, v1}, Loh2/a$b;->g(B)Loh2/a$b;

    move-result-object v0

    invoke-virtual {v0}, Loh2/a$b;->b()Loh2/a;

    move-result-object v0

    iput-object v0, p0, Loh2/d;->h:Loh2/a;

    :cond_0
    iget-object v0, p0, Loh2/d;->h:Loh2/a;

    return-object v0
.end method

.method public c()B
    .locals 1

    iget-byte v0, p0, Loh2/d;->f:B

    return v0
.end method

.method public d()B
    .locals 1

    iget-byte v0, p0, Loh2/d;->e:B

    return v0
.end method

.method public e()Loh2/b;
    .locals 1

    iget-object v0, p0, Loh2/d;->b:Loh2/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_a

    instance-of v2, p1, Loh2/d;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Loh2/d;

    iget-byte v2, p0, Loh2/d;->e:B

    iget-byte v3, p1, Loh2/d;->e:B

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-byte v2, p0, Loh2/d;->f:B

    iget-byte v3, p1, Loh2/d;->f:B

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Loh2/d;->a:Loh2/c;

    iget-object v3, p1, Loh2/d;->a:Loh2/c;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Loh2/d;->b:Loh2/b;

    iget-object v3, p1, Loh2/d;->b:Loh2/b;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Loh2/d;->c:Loh2/b;

    iget-object v3, p1, Loh2/d;->c:Loh2/b;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Loh2/d;->d:Loh2/e;

    iget-object v3, p1, Loh2/d;->d:Loh2/e;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Loh2/d;->g:Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object p1, p1, Loh2/d;->g:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_8
    iget-object p1, p1, Loh2/d;->d:Loh2/e;

    if-eqz p1, :cond_9

    :goto_0
    return v1

    :cond_9
    return v0

    :cond_a
    :goto_1
    return v1
.end method

.method public f()Loh2/c;
    .locals 1

    iget-object v0, p0, Loh2/d;->a:Loh2/c;

    return-object v0
.end method

.method public g()Loh2/e;
    .locals 1

    iget-object v0, p0, Loh2/d;->d:Loh2/e;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loh2/d;->g:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 7

    iget-object v0, p0, Loh2/d;->a:Loh2/c;

    iget-object v1, p0, Loh2/d;->b:Loh2/b;

    iget-object v2, p0, Loh2/d;->c:Loh2/b;

    iget-object v3, p0, Loh2/d;->d:Loh2/e;

    iget-byte v4, p0, Loh2/d;->e:B

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    iget-byte v5, p0, Loh2/d;->f:B

    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    iget-object v6, p0, Loh2/d;->g:Ljava/lang/String;

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
