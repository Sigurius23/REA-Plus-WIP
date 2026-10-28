.class public final Ll63/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk63/b;


# instance fields
.field public final a:Lcom/google/gson/Gson;


# direct methods
.method public constructor <init>(Lcom/google/gson/Gson;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll63/b;->a:Lcom/google/gson/Gson;

    return-void
.end method


# virtual methods
.method public final a(Li63/d;Ljava/nio/charset/Charset;Ls63/a;Ljava/lang/Object;Lb63/d;)Ljava/lang/Object;
    .locals 0

    new-instance p3, Lj63/e;

    iget-object p5, p0, Ll63/b;->a:Lcom/google/gson/Gson;

    invoke-virtual {p5, p4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    const-string p5, "gson.toJson(value)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lpf/c;->e0(Li63/d;Ljava/nio/charset/Charset;)Li63/d;

    move-result-object p1

    invoke-direct {p3, p4, p1}, Lj63/e;-><init>(Ljava/lang/String;Li63/d;)V

    return-object p3
.end method

.method public final b(Ljava/nio/charset/Charset;Ls63/a;Lio/ktor/utils/io/q;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p4, Ll63/a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ll63/a;

    iget v1, v0, Ll63/a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll63/a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll63/a;

    invoke-direct {v0, p0, p4}, Ll63/a;-><init>(Ll63/b;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Ll63/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll63/a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p4

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Ll63/b;->a:Lcom/google/gson/Gson;

    iget-object v2, p2, Ls63/a;->a:Lj93/d;

    invoke-static {p4, v2}, Lvp/c;->c0(Lcom/google/gson/Gson;Lj93/d;)Z

    move-result p4

    if-nez p4, :cond_4

    :try_start_1
    sget-object p4, Lbc3/q0;->a:Lkc3/e;

    sget-object p4, Lkc3/d;->w:Lkc3/d;

    new-instance v4, Ld0;

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v7, p0

    move-object v6, p1

    move-object v8, p2

    move-object v5, p3

    invoke-direct/range {v4 .. v10}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Ll63/a;->y:I

    invoke-static {p4, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    :goto_1
    new-instance p2, Lio/ktor/serialization/JsonConvertException;

    invoke-direct {p2, p1}, Lio/ktor/serialization/JsonConvertException;-><init>(Lcom/google/gson/JsonSyntaxException;)V

    throw p2

    :cond_4
    move-object v8, p2

    new-instance p1, Lio/ktor/serialization/gson/ExcludedTypeGsonException;

    iget-object p2, v8, Ls63/a;->a:Lj93/d;

    invoke-direct {p1, p2}, Lio/ktor/serialization/gson/ExcludedTypeGsonException;-><init>(Lj93/d;)V

    throw p1
.end method
