.class public final Ljg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/a;
.implements Lhg/b;
.implements Lhg/g;


# static fields
.field public static final x:Ljava/util/Set;


# instance fields
.field public final w:Lz7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "-Infinity"

    const-string v1, "NaN"

    const-string v2, "Infinity"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljg/b;->x:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz7/a;

    invoke-direct {v0, p1}, Lz7/a;-><init>([B)V

    iput-object v0, p0, Ljg/b;->w:Lz7/a;

    return-void
.end method


# virtual methods
.method public final a(Lhg/i;)Lhg/a;
    .locals 4

    iget-object p1, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljg/g;

    if-ne v0, v1, :cond_0

    check-cast p1, Ljg/g;

    return-object p0

    :cond_0
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "expected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "; found "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v3, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lhg/i;)Lhg/b;
    .locals 4

    iget-object p1, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {p1}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljg/h;

    if-ne v0, v1, :cond_0

    check-cast p1, Ljg/h;

    return-object p0

    :cond_0
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "expected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "; found "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v3, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {v0}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljg/n;

    if-ne v1, v2, :cond_0

    check-cast v0, Ljg/n;

    return-void

    :cond_0
    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expected "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "; found "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final d(Lhg/j;)Lhg/c;
    .locals 4

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {v0}, Lz7/a;->k()Lcom/squareup/wire/n;

    move-result-object v1

    sget-object v2, Ljg/h;->c:Ljg/h;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljg/h;

    if-ne v2, v3, :cond_0

    check-cast v1, Ljg/h;

    new-instance v1, Lgm/r;

    invoke-direct {v1, v0, p1, p0}, Lgm/r;-><init>(Lz7/a;Lhg/j;Ljg/b;)V

    return-object v1

    :cond_0
    new-instance p1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "expected "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "; found "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p1, Ljg/n;->c:Ljg/n;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lhm/d;

    const/16 v0, 0x16

    invoke-direct {p1, p0, v0}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_2
    new-instance p1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected token type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lz7/a;->k()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()Z
    .locals 5

    iget-object v0, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {v0}, Lz7/a;->k()Lcom/squareup/wire/n;

    move-result-object v1

    sget-object v2, Ljg/j;->c:Ljg/j;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljg/j;

    if-ne v1, v2, :cond_0

    check-cast v0, Ljg/j;

    return v3

    :cond_0
    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expected "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "; found "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    sget-object v0, Ljg/k;->c:Ljg/k;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v3

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final f()Z
    .locals 5

    iget-object v0, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {v0}, Lz7/a;->k()Lcom/squareup/wire/n;

    move-result-object v1

    sget-object v2, Ljg/l;->c:Ljg/l;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljg/l;

    if-ne v1, v2, :cond_0

    check-cast v0, Ljg/l;

    return v3

    :cond_0
    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expected "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "; found "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    sget-object v0, Ljg/n;->c:Ljg/n;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Ljg/k;->c:Ljg/k;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_0
    return v3
.end method

.method public final g()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {v0}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljg/m;

    if-ne v1, v2, :cond_0

    check-cast v0, Ljg/m;

    iget-object v0, v0, Ljg/m;->c:Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expected "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "; found "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final h()I
    .locals 2

    new-instance v0, Liz0/d;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Liz0/d;-><init>(I)V

    invoke-virtual {p0, v0}, Ljg/b;->j(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final i()Z
    .locals 2

    iget-object v0, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {v0}, Lz7/a;->k()Lcom/squareup/wire/n;

    move-result-object v0

    sget-object v1, Ljg/n;->c:Ljg/n;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final j(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {v0}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    instance-of v1, v0, Ljg/o;

    if-eqz v1, :cond_0

    check-cast v0, Ljg/o;

    iget-object v0, v0, Ljg/o;->c:Ljava/lang/String;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, v0, Ljg/p;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljg/p;

    iget-object v1, v1, Ljg/p;->c:Ljava/lang/String;

    sget-object v2, Ljg/b;->x:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " cannot be deserialized as type Number"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Ljg/b;->w:Lz7/a;

    invoke-virtual {v0}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v0

    instance-of v1, v0, Ljg/p;

    if-eqz v1, :cond_0

    check-cast v0, Ljg/p;

    iget-object v0, v0, Ljg/p;->c:Ljava/lang/String;

    return-object v0

    :cond_0
    instance-of v1, v0, Ljg/o;

    if-eqz v1, :cond_1

    check-cast v0, Ljg/o;

    iget-object v0, v0, Ljg/o;->c:Ljava/lang/String;

    return-object v0

    :cond_1
    instance-of v1, v0, Ljg/i;

    if-eqz v1, :cond_2

    check-cast v0, Ljg/i;

    iget-boolean v0, v0, Ljg/i;->c:Z

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " cannot be deserialized as type String"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final v()J
    .locals 2

    new-instance v0, Liz0/d;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Liz0/d;-><init>(I)V

    invoke-virtual {p0, v0}, Ljg/b;->j(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method
