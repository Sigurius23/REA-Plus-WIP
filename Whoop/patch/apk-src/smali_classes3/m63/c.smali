.class public final Lm63/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk63/b;


# instance fields
.field public final a:Lad3/c;

.field public final b:Lla/b;


# direct methods
.method public constructor <init>(Lad3/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm63/c;->a:Lad3/c;

    new-instance v0, Lla/b;

    invoke-direct {v0, p0, p1}, Lla/b;-><init>(Lm63/c;Lad3/c;)V

    iput-object v0, p0, Lm63/c;->b:Lla/b;

    return-void
.end method


# virtual methods
.method public final a(Li63/d;Ljava/nio/charset/Charset;Ls63/a;Ljava/lang/Object;Lb63/d;)Ljava/lang/Object;
    .locals 6

    new-instance v0, Lm63/d;

    iget-object v1, p0, Lm63/c;->a:Lad3/c;

    move-object v5, p1

    move-object v4, p2

    move-object v3, p3

    move-object v2, p4

    invoke-direct/range {v0 .. v5}, Lm63/d;-><init>(Lad3/c;Ljava/lang/Object;Ls63/a;Ljava/nio/charset/Charset;Li63/d;)V

    iget-object p1, p0, Lm63/c;->b:Lla/b;

    invoke-virtual {p1, v0, p5}, Lla/b;->G(Lm63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/nio/charset/Charset;Ls63/a;Lio/ktor/utils/io/q;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lm63/b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lm63/b;

    iget v1, v0, Lm63/b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm63/b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm63/b;

    invoke-direct {v0, p0, p4}, Lm63/b;-><init>(Lm63/c;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lm63/b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm63/b;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lm63/b;->y:Lwc3/c;

    check-cast p1, Lwc3/c;

    iget-object p2, v0, Lm63/b;->x:Ljava/nio/charset/Charset;

    iget-object p3, v0, Lm63/b;->w:Lm63/c;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Lm63/c;->a:Lad3/c;

    iget-object p4, p4, Lad3/c;->b:Lcd3/f;

    invoke-static {p2, p4}, Lio/sentry/config/a;->Y(Ls63/a;Lcd3/f;)Lwc3/c;

    move-result-object p2

    iput-object p0, v0, Lm63/b;->w:Lm63/c;

    iput-object p1, v0, Lm63/b;->x:Ljava/nio/charset/Charset;

    move-object p4, p2

    check-cast p4, Lwc3/c;

    iput-object p4, v0, Lm63/b;->y:Lwc3/c;

    iput v3, v0, Lm63/b;->F:I

    check-cast p3, Lio/ktor/utils/io/m;

    invoke-virtual {p3, v0}, Lio/ktor/utils/io/m;->v(Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p3, p2

    move-object p2, p1

    move-object p1, p3

    move-object p3, p0

    :goto_1
    check-cast p4, Lv63/e;

    :try_start_0
    iget-object p3, p3, Lm63/c;->a:Lad3/c;

    check-cast p1, Lwc3/b;

    invoke-static {p4, p2}, Lv63/h;->e(Lv63/e;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    new-instance p2, Lio/ktor/serialization/JsonConvertException;

    const-string p3, "Illegal input"

    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
