.class public final Ly10/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/List;


# instance fields
.field public final a:Lb10/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "payment_method"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ly10/c;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lb10/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly10/c;->a:Lb10/z0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p5, Ly10/a;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Ly10/a;

    iget v1, v0, Ly10/a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly10/a;->y:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ly10/a;

    invoke-direct {v0, p0, p5}, Ly10/a;-><init>(Ly10/c;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p5, v7, Ly10/a;->w:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v7, Ly10/a;->y:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    :try_start_0
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p5, Ll83/n;

    iget-object p1, p5, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p5, Ly00/f3;

    invoke-direct {p5, p3}, Ly00/f3;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p3, v0

    invoke-static {p3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p5

    :goto_2
    instance-of p3, p5, Ll83/m;

    if-nez p3, :cond_4

    :try_start_2
    check-cast p5, Ly00/f3;

    move p3, v1

    iget-object v1, p0, Ly10/c;->a:Lb10/z0;

    iget-object v2, p5, Ly00/f3;->a:Ljava/lang/String;

    iget-object v3, p5, Ly00/f3;->b:Ljava/lang/String;

    new-instance v5, Lyy/f;

    const/4 p5, 0x4

    invoke-direct {v5, p1, p4, p5}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v6, Ly10/c;->b:Ljava/util/List;

    iput p3, v7, Ly10/a;->y:I

    move-object v4, p2

    invoke-virtual/range {v1 .. v7}, Lb10/z0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_3

    return-object v8

    :cond_3
    :goto_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ly00/l3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    move-object p5, p1

    goto :goto_6

    :goto_5
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    goto :goto_4

    :cond_4
    :goto_6
    return-object p5
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p5, Ly10/b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Ly10/b;

    iget v1, v0, Ly10/b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly10/b;->y:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ly10/b;

    invoke-direct {v0, p0, p5}, Ly10/b;-><init>(Ly10/c;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p5, v7, Ly10/b;->w:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v7, Ly10/b;->y:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    :try_start_0
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p5, Ll83/n;

    iget-object p1, p5, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p5, Ly00/d6;

    invoke-direct {p5, p3}, Ly00/d6;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p3, v0

    invoke-static {p3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p5

    :goto_2
    instance-of p3, p5, Ll83/m;

    if-nez p3, :cond_4

    :try_start_2
    check-cast p5, Ly00/d6;

    move p3, v1

    iget-object v1, p0, Ly10/c;->a:Lb10/z0;

    iget-object v2, p5, Ly00/d6;->a:Ljava/lang/String;

    iget-object v3, p5, Ly00/d6;->b:Ljava/lang/String;

    new-instance v5, Lyy/f;

    const/4 p5, 0x4

    invoke-direct {v5, p1, p4, p5}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v6, Ly10/c;->b:Ljava/util/List;

    iput p3, v7, Ly10/b;->y:I

    move-object v4, p2

    invoke-virtual/range {v1 .. v7}, Lb10/z0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_3

    return-object v8

    :cond_3
    :goto_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ly00/g6;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    move-object p5, p1

    goto :goto_6

    :goto_5
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    goto :goto_4

    :cond_4
    :goto_6
    return-object p5
.end method
