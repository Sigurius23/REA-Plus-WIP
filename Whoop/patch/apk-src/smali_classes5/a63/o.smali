.class public final La63/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La63/a;

.field public static final e:Lo63/a;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La63/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La63/a;-><init>(I)V

    sput-object v0, La63/o;->d:La63/a;

    new-instance v0, Lo63/a;

    const-string v1, "HttpResponseValidator"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, La63/o;->e:Lo63/a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La63/o;->a:Ljava/util/List;

    iput-object p2, p0, La63/o;->b:Ljava/util/List;

    iput-boolean p3, p0, La63/o;->c:Z

    return-void
.end method

.method public static final a(La63/o;Ls83/c;)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, La63/m;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, La63/m;

    iget v1, v0, La63/m;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La63/m;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, La63/m;

    invoke-direct {v0, p0, p1}, La63/m;-><init>(La63/o;Ls83/c;)V

    :goto_0
    iget-object p1, v0, La63/m;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, v0, La63/m;->y:I

    if-eqz v0, :cond_3

    const/4 p0, 0x1

    const/4 v1, 0x0

    if-eq v0, p0, :cond_1

    const/4 p0, 0x2

    if-ne v0, p0, :cond_2

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p0, p0, La63/o;->b:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move-object v1, p0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0

    :cond_5
    return-void
.end method

.method public static final b(La63/o;Lf63/c;Ls83/c;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p2, La63/n;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La63/n;

    iget v1, v0, La63/n;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La63/n;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, La63/n;

    invoke-direct {v0, p0, p2}, La63/n;-><init>(La63/o;Ls83/c;)V

    :goto_0
    iget-object p2, v0, La63/n;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La63/n;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, La63/n;->x:Ljava/util/Iterator;

    iget-object p1, v0, La63/n;->w:Lf63/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p0, p0, La63/o;->a:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc93/m;

    iput-object p1, v0, La63/n;->w:Lf63/c;

    iput-object p0, v0, La63/n;->x:Ljava/util/Iterator;

    iput v3, v0, La63/n;->E:I

    invoke-interface {p2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
