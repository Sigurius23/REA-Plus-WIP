.class public final Lye3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye3/g;


# static fields
.field public static final a:Lze3/a;

.field public static final b:Lze3/a;

.field public static final c:Lze3/a;

.field public static final d:Lze3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    invoke-static {}, Lze3/a;->a()Lze3/a;

    move-result-object v0

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-virtual {v0, v1, v2}, Lze3/a;->d(CC)V

    const/16 v3, 0x46

    const/16 v4, 0x41

    invoke-virtual {v0, v4, v3}, Lze3/a;->d(CC)V

    const/16 v3, 0x66

    const/16 v5, 0x61

    invoke-virtual {v0, v5, v3}, Lze3/a;->d(CC)V

    new-instance v3, Lze3/a;

    invoke-direct {v3, v0}, Lze3/a;-><init>(Lze3/a;)V

    sput-object v3, Lye3/e;->a:Lze3/a;

    invoke-static {}, Lze3/a;->a()Lze3/a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lze3/a;->d(CC)V

    new-instance v3, Lze3/a;

    invoke-direct {v3, v0}, Lze3/a;-><init>(Lze3/a;)V

    sput-object v3, Lye3/e;->b:Lze3/a;

    invoke-static {}, Lze3/a;->a()Lze3/a;

    move-result-object v0

    const/16 v3, 0x5a

    invoke-virtual {v0, v4, v3}, Lze3/a;->d(CC)V

    const/16 v3, 0x7a

    invoke-virtual {v0, v5, v3}, Lze3/a;->d(CC)V

    new-instance v3, Lze3/a;

    invoke-direct {v3, v0}, Lze3/a;-><init>(Lze3/a;)V

    sput-object v3, Lye3/e;->c:Lze3/a;

    invoke-virtual {v3}, Lze3/a;->c()Lze3/a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lze3/a;->d(CC)V

    new-instance v1, Lze3/a;

    invoke-direct {v1, v0}, Lze3/a;-><init>(Lze3/a;)V

    sput-object v1, Lye3/e;->d:Lze3/a;

    return-void
.end method

.method public static b(Lab/l0;Lc9/k;)Lpg3/p;
    .locals 3

    invoke-virtual {p0}, Lab/l0;->m()Lc9/k;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object p1

    invoke-virtual {p1}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Laf3/a0;

    invoke-static {p1}, Lze3/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Laf3/a0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lab/l0;->m()Lc9/k;

    move-result-object p0

    new-instance p1, Lpg3/p;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-direct {p1, v0, p0, v2, v1}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    return-object p1
.end method


# virtual methods
.method public final a(Lxe3/k;)Lpg3/p;
    .locals 4

    iget-object p1, p1, Lxe3/k;->e:Lab/l0;

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v0

    invoke-virtual {p1}, Lab/l0;->i()V

    invoke-virtual {p1}, Lab/l0;->l()C

    move-result v1

    const/16 v2, 0x23

    const/16 v3, 0x3b

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Lab/l0;->i()V

    const/16 v1, 0x78

    invoke-virtual {p1, v1}, Lab/l0;->j(C)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const/16 v1, 0x58

    invoke-virtual {p1, v1}, Lab/l0;->j(C)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lye3/e;->b:Lze3/a;

    invoke-virtual {p1, v1}, Lab/l0;->f(Lze3/a;)I

    move-result v1

    if-gt v2, v1, :cond_3

    const/4 v2, 0x7

    if-gt v1, v2, :cond_3

    invoke-virtual {p1, v3}, Lab/l0;->j(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p1, v0}, Lye3/e;->b(Lab/l0;Lc9/k;)Lpg3/p;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object v1, Lye3/e;->a:Lze3/a;

    invoke-virtual {p1, v1}, Lab/l0;->f(Lze3/a;)I

    move-result v1

    if-gt v2, v1, :cond_3

    const/4 v2, 0x6

    if-gt v1, v2, :cond_3

    invoke-virtual {p1, v3}, Lab/l0;->j(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p1, v0}, Lye3/e;->b(Lab/l0;Lc9/k;)Lpg3/p;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v2, Lye3/e;->c:Lze3/a;

    iget-object v2, v2, Lze3/a;->a:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lye3/e;->d:Lze3/a;

    invoke-virtual {p1, v1}, Lab/l0;->f(Lze3/a;)I

    invoke-virtual {p1, v3}, Lab/l0;->j(C)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p1, v0}, Lye3/e;->b(Lab/l0;Lc9/k;)Lpg3/p;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
