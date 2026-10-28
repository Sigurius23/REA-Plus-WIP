.class public abstract Ldc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lo2/e;


# direct methods
.method public static A()Lb3/d2;
    .locals 1

    sget-object v0, Lb3/d2;->f:Lat/b;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lb3/d2;

    return-object v0
.end method

.method public static final B(Lqa3/k0;Lsa3/f;Lsa3/h;ZZZ)Loa3/r;
    .locals 2

    const-string v0, "proto"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lta3/l;->d:Lwa3/o;

    const-string v1, "propertySignature"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lta3/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_2

    sget-object p3, Lua3/g;->a:Lwa3/i;

    invoke-static {p0, p1, p2, p5}, Lua3/g;->b(Lqa3/k0;Lsa3/f;Lsa3/h;Z)Lua3/d;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lds/q;->u(Ljc/x;)Loa3/r;

    move-result-object p0

    return-object p0

    :cond_2
    if-eqz p4, :cond_3

    iget p0, v0, Lta3/f;->x:I

    const/4 p2, 0x2

    and-int/2addr p0, p2

    if-ne p0, p2, :cond_3

    iget-object p0, v0, Lta3/f;->z:Lta3/d;

    const-string p2, "getSyntheticMethod(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lta3/d;->y:I

    invoke-interface {p1, p2}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p2

    iget p0, p0, Lta3/d;->z:I

    invoke-interface {p1, p0}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Loa3/r;

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Loa3/r;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_3
    :goto_0
    return-object v1
.end method

.method public static synthetic C(Lqa3/k0;Lsa3/f;Lsa3/h;I)Loa3/r;
    .locals 9

    and-int/lit8 v0, p3, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v6, v2

    goto :goto_0

    :cond_0
    move v6, v1

    :goto_0
    and-int/lit8 p3, p3, 0x10

    if-eqz p3, :cond_1

    move v7, v2

    goto :goto_1

    :cond_1
    move v7, v1

    :goto_1
    const/4 v8, 0x1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v3 .. v8}, Ldc/a;->B(Lqa3/k0;Lsa3/f;Lsa3/h;ZZZ)Loa3/r;

    move-result-object p0

    return-object p0
.end method

.method public static final D(Ly00/o;)Z
    .locals 3

    const/4 v0, -0x1

    if-nez p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lr40/a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    :goto_0
    const/4 v1, 0x0

    if-eq p0, v0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v2, 0x2

    if-eq p0, v2, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-ne p0, v0, :cond_1

    return v1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    return v1

    :cond_3
    return v0

    :cond_4
    return v1
.end method

.method public static final E(Landroid/widget/RemoteViews;Lp6/x1;IILjava/lang/Integer;)I
    .locals 1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_4

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lp6/x1;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    sget p4, Lp6/b0;->j:I

    if-ge p1, p4, :cond_3

    sget p4, Lp6/b0;->i:I

    add-int/2addr p1, p4

    :goto_0
    if-eq p1, v0, :cond_1

    const-string p4, "setInflatedId"

    invoke-virtual {p0, p2, p4, p1}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    :cond_1
    if-eqz p3, :cond_2

    const-string p4, "setLayoutResource"

    invoke-virtual {p0, p2, p4, p3}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    :cond_2
    const/4 p3, 0x0

    invoke-virtual {p0, p2, p3}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    return p1

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "There are too many views"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "viewStubId must not be View.NO_ID"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final F(Llb3/y;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    return-void
.end method

.method public static final G(Landroidx/compose/runtime/Composer;)Z
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Configuration;

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final H(Lqa3/k;ZLsa3/f;Lsa3/h;Lh3/i;Lg40/f4;)Lr93/y0;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lqa3/k;->y:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    iget p1, p0, Lqa3/k;->W:I

    invoke-static {p2, p1}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object p1

    invoke-static {p0, p3}, Ljc/x;->Z(Lqa3/k;Lsa3/h;)Lqa3/w0;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p4, p3}, Lh3/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lob3/h;

    if-nez p3, :cond_1

    :cond_0
    invoke-virtual {p5, p1}, Lg40/f4;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lob3/h;

    if-eqz p3, :cond_2

    :cond_1
    new-instance p0, Lr93/x;

    invoke-direct {p0, p1, p3}, Lr93/x;-><init>(Lva3/h;Lob3/h;)V

    return-object p0

    :cond_2
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "cannot determine underlying type for value class "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p0, p0, Lqa3/k;->E:I

    invoke-static {p2, p0}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " with property "

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 p5, 0x0

    if-eqz p1, :cond_a

    sget-object p1, Lsa3/d;->k:Lsa3/b;

    iget v0, p0, Lqa3/k;->z:I

    invoke-virtual {p1, v0}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p0, p0, Lqa3/k;->P:Ljava/util/List;

    const-string p1, "getConstructorList(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p1, 0x0

    move-object v0, p5

    :cond_4
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lqa3/o;

    sget-object v3, Lsa3/d;->n:Lsa3/b;

    iget v2, v2, Lqa3/o;->z:I

    invoke-virtual {v3, v2}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_4

    if-eqz p1, :cond_5

    :goto_1
    move-object v0, p5

    goto :goto_2

    :cond_5
    const/4 p1, 0x1

    move-object v0, v1

    goto :goto_0

    :cond_6
    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    :goto_2
    check-cast v0, Lqa3/o;

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    iget-object p0, v0, Lqa3/o;->E:Ljava/util/List;

    const-string p1, "getValueParameterList(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p5, 0xa

    invoke-static {p0, p5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p5

    invoke-direct {p1, p5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lqa3/e1;

    iget v0, p5, Lqa3/e1;->E:I

    invoke-static {p2, v0}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v0

    invoke-static {p5, p3}, Ljc/x;->y0(Lqa3/e1;Lsa3/h;)Lqa3/w0;

    move-result-object p5

    invoke-virtual {p4, p5}, Lh3/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    new-instance p0, Lr93/c0;

    invoke-direct {p0, p1}, Lr93/c0;-><init>(Ljava/util/ArrayList;)V

    return-object p0

    :cond_a
    :goto_4
    return-object p5
.end method

.method public static I(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/b1;[BIIILandroidx/glance/appwidget/protobuf/d;)I
    .locals 3

    check-cast p1, Landroidx/glance/appwidget/protobuf/s0;

    iget v0, p6, Landroidx/glance/appwidget/protobuf/d;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p6, Landroidx/glance/appwidget/protobuf/d;->d:I

    const/16 v1, 0x64

    if-ge v0, v1, :cond_0

    move-object v2, p1

    move-object p1, p0

    move-object p0, v2

    invoke-virtual/range {p0 .. p6}, Landroidx/glance/appwidget/protobuf/s0;->E(Ljava/lang/Object;[BIIILandroidx/glance/appwidget/protobuf/d;)I

    move-result p0

    iget p2, p6, Landroidx/glance/appwidget/protobuf/d;->d:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p6, Landroidx/glance/appwidget/protobuf/d;->d:I

    iput-object p1, p6, Landroidx/glance/appwidget/protobuf/d;->c:Ljava/lang/Object;

    return p0

    :cond_0
    new-instance p0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    const-string p1, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static J(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/b1;[BIILandroidx/glance/appwidget/protobuf/d;)I
    .locals 6

    add-int/lit8 v0, p3, 0x1

    aget-byte p3, p2, p3

    if-gez p3, :cond_0

    invoke-static {p3, p2, v0, p5}, Ldc/a;->t(I[BILandroidx/glance/appwidget/protobuf/d;)I

    move-result v0

    iget p3, p5, Landroidx/glance/appwidget/protobuf/d;->a:I

    :cond_0
    move v3, v0

    if-ltz p3, :cond_2

    sub-int/2addr p4, v3

    if-gt p3, p4, :cond_2

    iget p4, p5, Landroidx/glance/appwidget/protobuf/d;->d:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p5, Landroidx/glance/appwidget/protobuf/d;->d:I

    const/16 v0, 0x64

    if-ge p4, v0, :cond_1

    add-int v4, v3, p3

    move-object v1, p0

    move-object v0, p1

    move-object v2, p2

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Landroidx/glance/appwidget/protobuf/b1;->g(Ljava/lang/Object;[BIILandroidx/glance/appwidget/protobuf/d;)V

    iget p0, v5, Landroidx/glance/appwidget/protobuf/d;->d:I

    add-int/lit8 p0, p0, -0x1

    iput p0, v5, Landroidx/glance/appwidget/protobuf/d;->d:I

    iput-object v1, v5, Landroidx/glance/appwidget/protobuf/d;->c:Ljava/lang/Object;

    return v4

    :cond_1
    new-instance p0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    const-string p1, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->g()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static K(Lqa/e;ILx8/d;)V
    .locals 6

    invoke-interface {p0, p1}, Lqa/e;->h(I)J

    move-result-wide v2

    invoke-interface {p0, v2, v3}, Lqa/e;->d(J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lqa/e;->j()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p1, v0, :cond_2

    add-int/lit8 v0, p1, 0x1

    invoke-interface {p0, v0}, Lqa/e;->h(I)J

    move-result-wide v4

    invoke-interface {p0, p1}, Lqa/e;->h(I)J

    move-result-wide p0

    sub-long/2addr v4, p0

    const-wide/16 p0, 0x0

    cmp-long p0, v4, p0

    if-lez p0, :cond_1

    new-instance v0, Lqa/a;

    invoke-direct/range {v0 .. v5}, Lqa/a;-><init>(Ljava/util/List;JJ)V

    invoke-interface {p2, v0}, Lx8/d;->accept(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method public static L(Lq0/y;Lh0/d2;Landroidx/compose/runtime/Composer;I)Lq0/a;
    .locals 2

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v1, :cond_2

    :cond_1
    const/4 p3, 0x1

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    :goto_0
    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_3

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v0, p3, :cond_4

    :cond_3
    new-instance v0, Lq0/a;

    invoke-direct {v0, p0, p1}, Lq0/a;-><init>(Lq0/y;Lh0/d2;)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lq0/a;

    return-object v0
.end method

.method public static final M(Lcom/amplitude/android/engagement/a;Lkotlinx/serialization/json/JsonObject;)Z
    .locals 13

    const-string v1, "Failed to parse theme JSON: "

    const-string v2, "Failed to serialize to JSON string: "

    const-string v3, "Unable to deserialize Nudge; nudgeJson="

    const-string v4, "Failed to deserialize from JsonElement: "

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Rendering nudge with args: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V

    sget-object v5, Lhj/u;->w:Lhj/u;

    invoke-virtual {v5}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    const-string p0, "No active activity to render nudge"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    return v6

    :cond_0
    :try_start_0
    const-string v7, "nudge"

    invoke-virtual {p1, v7}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlinx/serialization/json/JsonElement;

    if-nez v7, :cond_1

    const-string p0, "No nudge data provided"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    return v6

    :catch_0
    move-exception v0

    move-object p0, v0

    goto/16 :goto_6

    :cond_1
    const-string v0, "stepIndex"

    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->h(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v10, v0

    goto :goto_0

    :cond_2
    move v10, v6

    :goto_0
    const/4 v8, 0x0

    :try_start_1
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Lcom/amplitude/android/engagement/types/Nudge;->Companion:Lcom/amplitude/android/engagement/types/q0;

    invoke-virtual {v9}, Lcom/amplitude/android/engagement/types/q0;->serializer()Lwc3/c;

    move-result-object v9

    check-cast v9, Lwc3/b;

    invoke-virtual {v0, v9, v7}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    :try_start_2
    sget-object v9, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object v0, v8

    :goto_1
    move-object v4, v0

    check-cast v4, Lcom/amplitude/android/engagement/types/Nudge;

    if-nez v4, :cond_3

    sget-object p0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    return v6

    :cond_3
    new-instance v11, Lkotlin/jvm/internal/g0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    const-string v0, "theme"

    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v3}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v3

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/j;

    invoke-virtual {v0, v3, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    move-object p1, v0

    :try_start_5
    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object p1, v8

    :goto_2
    if-eqz p1, :cond_4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :catch_3
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_4
    move-object v0, v8

    :goto_3
    if-eqz v0, :cond_5

    sget-object p1, Luj/m;->o0:Luj/m;

    invoke-static {v0}, Luj/j;->d(Lorg/json/JSONObject;)Luj/m;

    move-result-object v8

    :cond_5
    iput-object v8, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_5

    :goto_4
    :try_start_6
    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    :goto_5
    new-instance v7, Ljj/c;

    const/4 v12, 0x0

    move-object v9, p0

    move-object v8, v4

    invoke-direct/range {v7 .. v12}, Ljj/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-virtual {v5, v7}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    const/4 p0, 0x1

    return p0

    :goto_6
    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v0, "Error rendering nudge"

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    return v6
.end method

.method public static N(Lio/sentry/rrweb/b;Lwe/o;Lio/sentry/v0;)V
    .locals 2

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/rrweb/b;->w:Lio/sentry/rrweb/c;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string p2, "timestamp"

    invoke-virtual {p1, p2}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-wide v0, p0, Lio/sentry/rrweb/b;->x:J

    invoke-virtual {p1, v0, v1}, Lwe/o;->X(J)Lwe/o;

    return-void
.end method

.method public static O(Lne3/e;)Lne3/w;
    .locals 1

    new-instance v0, Lne3/w;

    invoke-direct {v0, p0}, Lne3/w;-><init>(Lne3/e;)V

    return-object v0
.end method

.method public static P(Lqa/e;Lqa/k;Lx8/d;)V
    .locals 12

    iget-wide v0, p1, Lqa/k;->a:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    const/4 v5, 0x0

    if-nez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0, v1}, Lqa/e;->b(J)I

    move-result v4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_1

    invoke-interface {p0}, Lqa/e;->j()I

    move-result v4

    :cond_1
    if-lez v4, :cond_2

    add-int/lit8 v6, v4, -0x1

    invoke-interface {p0, v6}, Lqa/e;->h(I)J

    move-result-wide v6

    cmp-long v6, v6, v0

    if-nez v6, :cond_2

    add-int/lit8 v4, v4, -0x1

    :cond_2
    :goto_0
    cmp-long v2, v0, v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Lqa/e;->j()I

    move-result v2

    if-ge v4, v2, :cond_3

    invoke-interface {p0, v0, v1}, Lqa/e;->d(J)Ljava/util/List;

    move-result-object v7

    invoke-interface {p0, v4}, Lqa/e;->h(I)J

    move-result-wide v2

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_3

    iget-wide v8, p1, Lqa/k;->a:J

    cmp-long v6, v8, v2

    if-gez v6, :cond_3

    new-instance v6, Lqa/a;

    sub-long v10, v2, v8

    invoke-direct/range {v6 .. v11}, Lqa/a;-><init>(Ljava/util/List;JJ)V

    invoke-interface {p2, v6}, Lx8/d;->accept(Ljava/lang/Object;)V

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    move v2, v5

    :goto_1
    move v3, v4

    :goto_2
    invoke-interface {p0}, Lqa/e;->j()I

    move-result v6

    if-ge v3, v6, :cond_4

    invoke-static {p0, v3, p2}, Ldc/a;->K(Lqa/e;ILx8/d;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    iget-boolean p1, p1, Lqa/k;->b:Z

    if-eqz p1, :cond_7

    if-eqz v2, :cond_5

    add-int/lit8 v4, v4, -0x1

    :cond_5
    :goto_3
    if-ge v5, v4, :cond_6

    invoke-static {p0, v5, p2}, Ldc/a;->K(Lqa/e;ILx8/d;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    if-eqz v2, :cond_7

    new-instance v6, Lqa/a;

    invoke-interface {p0, v0, v1}, Lqa/e;->d(J)Ljava/util/List;

    move-result-object v7

    invoke-interface {p0, v4}, Lqa/e;->h(I)J

    move-result-wide v8

    invoke-interface {p0, v4}, Lqa/e;->h(I)J

    move-result-wide p0

    sub-long v10, v0, p0

    invoke-direct/range {v6 .. v11}, Lqa/a;-><init>(Ljava/util/List;JJ)V

    invoke-interface {p2, v6}, Lx8/d;->accept(Ljava/lang/Object;)V

    :cond_7
    return-void
.end method

.method public static final Q(Ljava/lang/String;)Lgf/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgf/h;

    invoke-direct {v0, p0}, Lgf/h;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final R(Lve/e;Lbf/a;)Lve/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metric"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lve/e;->e:Lgf/b;

    instance-of v1, v0, Lgf/l;

    if-eqz v1, :cond_0

    check-cast v0, Lgf/l;

    invoke-static {v0, p1}, Lbf/b;->c(Lgf/l;Lbf/a;)V

    return-object p0

    :cond_0
    invoke-static {v0}, Ljc/x;->w0(Lgf/b;)Lgf/c;

    move-result-object v0

    invoke-static {v0, p1}, Lbf/b;->c(Lgf/l;Lbf/a;)V

    const/4 p1, 0x0

    const/16 v1, 0x1f

    invoke-static {p0, p1, v0, v1}, Ls7/a;->b(Lve/e;Lug/b;Lgf/c;I)Lve/e;

    move-result-object p0

    return-object p0
.end method

.method public static final S(Lve/e;Ljava/util/LinkedHashSet;)Lve/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metrics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v0, p0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbf/a;

    invoke-static {p0, v0}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final a(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    move-object/from16 v2, p1

    move/from16 v13, p13

    move/from16 v14, p14

    move-object/from16 v0, p12

    check-cast v0, Lp1/q;

    const v1, 0x754d1143

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v13, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v13

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v3, v13

    :goto_1
    and-int/lit8 v4, v13, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v14, 0x4

    if-eqz v4, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v13, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :goto_4
    and-int/lit8 v6, v14, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v3, v3, 0xc00

    :cond_7
    move-object/from16 v7, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v13, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_5

    :cond_9
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v3, v8

    :goto_6
    and-int/lit8 v8, v14, 0x10

    if-eqz v8, :cond_b

    or-int/lit16 v3, v3, 0x6000

    :cond_a
    move-object/from16 v9, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v9, v13, 0x6000

    if-nez v9, :cond_a

    move-object/from16 v9, p4

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x4000

    goto :goto_7

    :cond_c
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v3, v10

    :goto_8
    const/high16 v10, 0x30000

    and-int/2addr v10, v13

    if-nez v10, :cond_e

    move-object/from16 v10, p5

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/high16 v11, 0x20000

    goto :goto_9

    :cond_d
    const/high16 v11, 0x10000

    :goto_9
    or-int/2addr v3, v11

    goto :goto_a

    :cond_e
    move-object/from16 v10, p5

    :goto_a
    const/high16 v11, 0x180000

    and-int/2addr v11, v13

    if-nez v11, :cond_f

    const/high16 v11, 0x80000

    or-int/2addr v3, v11

    :cond_f
    const/high16 v11, 0xc00000

    and-int/2addr v11, v13

    if-nez v11, :cond_12

    and-int/lit16 v11, v14, 0x80

    if-nez v11, :cond_10

    move-wide/from16 v11, p7

    invoke-virtual {v0, v11, v12}, Lp1/q;->f(J)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x800000

    goto :goto_b

    :cond_10
    move-wide/from16 v11, p7

    :cond_11
    const/high16 v15, 0x400000

    :goto_b
    or-int/2addr v3, v15

    goto :goto_c

    :cond_12
    move-wide/from16 v11, p7

    :goto_c
    const/high16 v15, 0x6000000

    and-int/2addr v15, v13

    if-nez v15, :cond_13

    const/high16 v15, 0x2000000

    or-int/2addr v3, v15

    :cond_13
    const/high16 v15, 0x30000000

    or-int/2addr v3, v15

    const v15, 0x12492493

    and-int/2addr v15, v3

    const v1, 0x12492492

    if-eq v15, v1, :cond_14

    const/4 v1, 0x1

    goto :goto_d

    :cond_14
    const/4 v1, 0x0

    :goto_d
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v0, v15, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v13, 0x1

    const v15, -0x1f80001

    const v16, -0xe000001

    const v17, -0x380001

    if-eqz v1, :cond_17

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_15

    goto :goto_e

    :cond_15
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int v1, v3, v17

    and-int/lit16 v4, v14, 0x80

    if-eqz v4, :cond_16

    and-int v1, v3, v15

    :cond_16
    and-int v1, v1, v16

    move-object/from16 v20, p6

    move-wide/from16 v23, p9

    move-object/from16 v25, p11

    move-object/from16 v17, v5

    move-object/from16 v18, v9

    move-wide/from16 v21, v11

    goto :goto_12

    :cond_17
    :goto_e
    if-eqz v4, :cond_18

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_f

    :cond_18
    move-object v1, v5

    :goto_f
    const/4 v4, 0x0

    if-eqz v6, :cond_19

    move-object v7, v4

    :cond_19
    if-eqz v8, :cond_1a

    goto :goto_10

    :cond_1a
    move-object v4, v9

    :goto_10
    sget-object v5, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/l5;

    iget-object v5, v5, Lg1/l5;->b:Lt0/i;

    and-int v6, v3, v17

    and-int/lit16 v8, v14, 0x80

    if-eqz v8, :cond_1b

    sget-object v6, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v0, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/c1;

    invoke-virtual {v6}, Lg1/c1;->h()J

    move-result-wide v8

    and-int v6, v3, v15

    goto :goto_11

    :cond_1b
    move-wide v8, v11

    :goto_11
    invoke-static {v8, v9, v0}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v11

    and-int v3, v6, v16

    new-instance v6, Lc4/a0;

    const/4 v15, 0x7

    invoke-direct {v6, v15}, Lc4/a0;-><init>(I)V

    move-object/from16 v17, v1

    move v1, v3

    move-object/from16 v18, v4

    move-object/from16 v20, v5

    move-object/from16 v25, v6

    move-wide/from16 v21, v8

    move-wide/from16 v23, v11

    :goto_12
    invoke-virtual {v0}, Lp1/q;->r()V

    const v3, 0x7ffffffe

    and-int/2addr v3, v1

    new-instance v4, Lg1/i;

    const/4 v5, 0x1

    invoke-direct {v4, v7, v2, v5}, Lg1/i;-><init>(Lc93/m;Lx1/b;I)V

    const v5, -0x126f8127

    invoke-static {v5, v0, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    and-int/lit8 v4, v1, 0xe

    or-int/lit8 v4, v4, 0x30

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v4

    shr-int/lit8 v3, v3, 0x3

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v1, v4

    const v4, 0xe000

    and-int/2addr v4, v3

    or-int/2addr v1, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v3

    or-int/2addr v1, v4

    const/high16 v4, 0xe000000

    and-int/2addr v3, v4

    or-int v27, v1, v3

    move-object/from16 v15, p0

    move-object/from16 v26, v0

    move-object/from16 v19, v10

    invoke-static/range {v15 .. v27}, Ldc/a;->b(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v7

    move-object/from16 v3, v17

    move-object/from16 v5, v18

    move-object/from16 v7, v20

    move-wide/from16 v8, v21

    move-wide/from16 v10, v23

    move-object/from16 v12, v25

    goto :goto_13

    :cond_1c
    move-object/from16 v26, v0

    invoke-virtual/range {v26 .. v26}, Lp1/q;->X()V

    move-object v3, v5

    move-object v4, v7

    move-object v5, v9

    move-wide v8, v11

    move-object/from16 v7, p6

    move-wide/from16 v10, p9

    move-object/from16 v12, p11

    :goto_13
    invoke-virtual/range {v26 .. v26}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_1d

    new-instance v0, Lg1/b0;

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v14}, Lg1/b0;-><init>(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;II)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method public static final b(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v11, p10

    move/from16 v12, p12

    move-object/from16 v0, p11

    check-cast v0, Lp1/q;

    const v2, 0x53fed562

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v12, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v12

    goto :goto_1

    :cond_1
    move v2, v12

    :goto_1
    and-int/lit8 v3, v12, 0x30

    move-object/from16 v14, p1

    if-nez v3, :cond_3

    invoke-virtual {v0, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v12, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v4, v12, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_5

    :cond_6
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v2, v5

    goto :goto_6

    :cond_7
    move-object/from16 v4, p3

    :goto_6
    and-int/lit16 v5, v12, 0x6000

    if-nez v5, :cond_9

    move-object/from16 v5, p4

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_7

    :cond_8
    const/16 v6, 0x2000

    :goto_7
    or-int/2addr v2, v6

    goto :goto_8

    :cond_9
    move-object/from16 v5, p4

    :goto_8
    const/high16 v6, 0x30000

    and-int/2addr v6, v12

    if-nez v6, :cond_b

    move-object/from16 v6, p5

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/high16 v7, 0x20000

    goto :goto_9

    :cond_a
    const/high16 v7, 0x10000

    :goto_9
    or-int/2addr v2, v7

    goto :goto_a

    :cond_b
    move-object/from16 v6, p5

    :goto_a
    const/high16 v7, 0x180000

    and-int/2addr v7, v12

    if-nez v7, :cond_d

    move-wide/from16 v7, p6

    invoke-virtual {v0, v7, v8}, Lp1/q;->f(J)Z

    move-result v9

    if-eqz v9, :cond_c

    const/high16 v9, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v9, 0x80000

    :goto_b
    or-int/2addr v2, v9

    goto :goto_c

    :cond_d
    move-wide/from16 v7, p6

    :goto_c
    const/high16 v9, 0xc00000

    and-int/2addr v9, v12

    if-nez v9, :cond_f

    move-wide/from16 v9, p8

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v13

    if-eqz v13, :cond_e

    const/high16 v13, 0x800000

    goto :goto_d

    :cond_e
    const/high16 v13, 0x400000

    :goto_d
    or-int/2addr v2, v13

    goto :goto_e

    :cond_f
    move-wide/from16 v9, p8

    :goto_e
    const/high16 v13, 0x6000000

    and-int/2addr v13, v12

    if-nez v13, :cond_11

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    const/high16 v13, 0x4000000

    goto :goto_f

    :cond_10
    const/high16 v13, 0x2000000

    :goto_f
    or-int/2addr v2, v13

    :cond_11
    const v13, 0x2492493

    and-int/2addr v13, v2

    const v15, 0x2492492

    if-eq v13, v15, :cond_12

    const/4 v13, 0x1

    goto :goto_10

    :cond_12
    const/4 v13, 0x0

    :goto_10
    and-int/lit8 v15, v2, 0x1

    invoke-virtual {v0, v15, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_15

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v13, v12, 0x1

    if-eqz v13, :cond_14

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v13

    if-eqz v13, :cond_13

    goto :goto_11

    :cond_13
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_14
    :goto_11
    invoke-virtual {v0}, Lp1/q;->r()V

    const v13, 0xffffffe

    and-int v23, v2, v13

    new-instance v13, Lg1/j;

    move-object v15, v3

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-wide/from16 v19, v7

    move-wide/from16 v21, v9

    invoke-direct/range {v13 .. v22}, Lg1/j;-><init>(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJ)V

    const v3, -0x1d1b2925

    invoke-static {v3, v0, v13}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x180

    shr-int/lit8 v4, v23, 0x15

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v2, v4

    invoke-static {v1, v11, v3, v0, v2}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_12

    :cond_15
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_16

    new-instance v0, Lg1/c0;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    invoke-direct/range {v0 .. v12}, Lg1/c0;-><init>(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;I)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final c(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/m;Ly2/k;FLp1/q;II)V
    .locals 16

    move-object/from16 v8, p6

    move/from16 v0, p8

    const v1, -0x381e6b2c

    invoke-virtual {v8, v1}, Lp1/q;->f0(I)V

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object/from16 v2, p2

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    sget-object v1, Lb2/e;->E:Lb2/m;

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p3

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    sget-object v1, Ly2/j;->b:Ly2/b1;

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object/from16 v6, p4

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    move v7, v0

    goto :goto_3

    :cond_3
    move/from16 v7, p5

    :goto_3
    sget-object v0, Lch/q;->a:Lp1/u2;

    invoke-static {v0, v8}, Lcom/squareup/wire/n;->F(Lp1/t1;Lp1/q;)Lbh/e;

    move-result-object v0

    and-int/lit8 v1, p7, 0x70

    or-int/lit16 v1, v1, 0x208

    shl-int/lit8 v3, p7, 0x3

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v1, v4

    const v4, 0xe000

    and-int v9, v3, v4

    or-int/2addr v1, v9

    const/high16 v9, 0x70000

    and-int v10, v3, v9

    or-int/2addr v1, v10

    const/high16 v10, 0x380000

    and-int v11, v3, v10

    or-int/2addr v1, v11

    const/high16 v11, 0x1c00000

    and-int v12, v3, v11

    or-int/2addr v1, v12

    const/high16 v12, 0xe000000

    and-int v13, v3, v12

    or-int/2addr v1, v13

    const/high16 v13, 0x70000000

    and-int/2addr v3, v13

    or-int/2addr v1, v3

    shr-int/lit8 v3, p7, 0x1b

    and-int/lit8 v3, v3, 0xe

    const v14, 0x791ea4c2

    invoke-virtual {v8, v14}, Lp1/q;->f0(I)V

    sget-object v14, Lch/k;->b:Lqt/e;

    new-instance v15, Lch/l;

    move/from16 p2, v4

    move-object/from16 v4, p0

    invoke-direct {v15, v4, v14, v0}, Lch/l;-><init>(Ljava/lang/Object;Lqt/e;Lbh/e;)V

    and-int/lit8 v0, v1, 0x70

    shr-int/lit8 v1, v1, 0x3

    and-int/lit16 v4, v1, 0x380

    or-int/2addr v0, v4

    and-int/lit16 v4, v1, 0x1c00

    or-int/2addr v0, v4

    and-int v4, v1, p2

    or-int/2addr v0, v4

    and-int v4, v1, v9

    or-int/2addr v0, v4

    and-int v4, v1, v10

    or-int/2addr v0, v4

    and-int v4, v1, v11

    or-int/2addr v0, v4

    and-int/2addr v1, v12

    or-int/2addr v0, v1

    shl-int/lit8 v1, v3, 0x1b

    and-int/2addr v1, v13

    or-int v9, v0, v1

    const/4 v10, 0x0

    sget-object v3, Lcoil/compose/AsyncImagePainter;->T:La11/g;

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move-object v0, v15

    invoke-static/range {v0 .. v10}, Lce/w;->k(Lch/l;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lb2/h;Ly2/k;FLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    return-void
.end method

.method public static final d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;
    .locals 1

    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method

.method public static final e(Lcom/amplitude/android/engagement/types/Nudge;ILmj/a;Lmj/n;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x42fe42c2

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    sget-object v0, Lmj/r;->a:Lp1/u2;

    invoke-virtual {v12, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/amplitude/android/engagement/a;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_0

    invoke-static {v12}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v0

    new-instance v3, Lp1/a0;

    invoke-direct {v3, v0}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v3

    :cond_0
    check-cast v0, Lp1/a0;

    iget-object v9, v0, Lp1/a0;->w:Lbc3/c0;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1

    invoke-static {p1, v12}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v0

    :cond_1
    move-object v10, v0

    check-cast v10, Lp1/a1;

    move-object v0, v10

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    new-instance v2, Lhj/j;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lhj/j;-><init>(Lcom/amplitude/android/engagement/types/Nudge;I)V

    const/4 v4, 0x0

    invoke-static {v2, v0, v4, v12, v3}, Lq0/c0;->b(Lc93/a;IILandroidx/compose/runtime/Composer;I)Lq0/b;

    move-result-object v3

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/Nudge;->getSteps()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3}, Lq0/y;->k()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/amplitude/android/engagement/types/NudgeStep;

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v12, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/content/res/Configuration;

    iget v0, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    const/16 v5, 0x258

    if-lt v0, v5, :cond_2

    const/4 v4, 0x1

    :cond_2
    move v7, v4

    new-instance v0, Lmj/c;

    move-object v1, p0

    move-object v5, p2

    move-object/from16 v4, p3

    move/from16 v8, p5

    invoke-direct/range {v0 .. v11}, Lmj/c;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lq0/b;Lmj/n;Lmj/a;Landroid/content/res/Configuration;ZILbc3/c0;Lp1/a1;Lcom/amplitude/android/engagement/a;)V

    const v2, 0x3b2afab

    invoke-static {v2, v12, v0}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v2, 0x188

    invoke-static {p0, p1, v0, v12, v2}, Ltj/b;->a(Lcom/amplitude/android/engagement/types/Nudge;ILx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_3

    return-void

    :cond_3
    new-instance v0, Lc4/c;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lc4/c;-><init>(Lcom/amplitude/android/engagement/types/Nudge;ILmj/a;Lmj/n;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final f(Lfi/i;Ljava/lang/Throwable;)Lfi/d;
    .locals 3

    new-instance v0, Lfi/d;

    instance-of v1, p1, Lcoil3/request/NullRequestDataException;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lfi/i;->o:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lfi/i;->u:Lfi/f;

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrh/j;

    if-nez v1, :cond_0

    iget-object v1, v2, Lfi/f;->j:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrh/j;

    :cond_0
    if-nez v1, :cond_2

    iget-object v1, p0, Lfi/i;->n:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrh/j;

    if-nez v1, :cond_2

    iget-object v1, v2, Lfi/f;->i:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrh/j;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lfi/i;->n:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrh/j;

    if-nez v1, :cond_2

    iget-object v1, p0, Lfi/i;->u:Lfi/f;

    iget-object v1, v1, Lfi/f;->i:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrh/j;

    :cond_2
    :goto_0
    invoke-direct {v0, v1, p0, p1}, Lfi/d;-><init>(Lrh/j;Lfi/i;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static final g(ZLg40/o1;Landroidx/compose/ui/Modifier;Li2/a1;Ll3/v0;FFLjava/lang/String;Lg40/p1;FLg2/s;Landroidx/compose/runtime/Composer;III)V
    .locals 40

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v12, p12

    move/from16 v14, p14

    const-string v0, "element"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p11

    check-cast v11, Lp1/q;

    const v0, -0x10b96620

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v12, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v12

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, v14, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v12, 0xc00

    if-nez v7, :cond_9

    and-int/lit8 v7, v14, 0x8

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_5

    :cond_7
    move-object/from16 v7, p3

    :cond_8
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    goto :goto_6

    :cond_9
    move-object/from16 v7, p3

    :goto_6
    and-int/lit16 v8, v12, 0x6000

    if-nez v8, :cond_a

    or-int/lit16 v0, v0, 0x2000

    :cond_a
    and-int/lit8 v8, v14, 0x20

    const/high16 v13, 0x30000

    if-eqz v8, :cond_c

    or-int/2addr v0, v13

    :cond_b
    move/from16 v9, p5

    goto :goto_8

    :cond_c
    and-int v9, v12, v13

    if-nez v9, :cond_b

    move/from16 v9, p5

    invoke-virtual {v11, v9}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_d

    const/high16 v10, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v10, 0x10000

    :goto_7
    or-int/2addr v0, v10

    :goto_8
    and-int/lit8 v10, v14, 0x40

    const/high16 v15, 0x180000

    if-eqz v10, :cond_f

    or-int/2addr v0, v15

    :cond_e
    move/from16 v15, p6

    goto :goto_a

    :cond_f
    and-int/2addr v15, v12

    if-nez v15, :cond_e

    move/from16 v15, p6

    invoke-virtual {v11, v15}, Lp1/q;->d(F)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x100000

    goto :goto_9

    :cond_10
    const/high16 v16, 0x80000

    :goto_9
    or-int v0, v0, v16

    :goto_a
    and-int/lit16 v3, v14, 0x80

    const/high16 v16, 0xc00000

    if-eqz v3, :cond_12

    or-int v0, v0, v16

    :cond_11
    move/from16 v16, v13

    move-object/from16 v13, p7

    goto :goto_c

    :cond_12
    and-int v16, v12, v16

    if-nez v16, :cond_11

    move/from16 v16, v13

    move-object/from16 v13, p7

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x800000

    goto :goto_b

    :cond_13
    const/high16 v17, 0x400000

    :goto_b
    or-int v0, v0, v17

    :goto_c
    const/high16 v17, 0x6000000

    and-int v17, v12, v17

    if-nez v17, :cond_16

    and-int/lit16 v4, v14, 0x100

    if-nez v4, :cond_14

    move-object/from16 v4, p8

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_15

    const/high16 v18, 0x4000000

    goto :goto_d

    :cond_14
    move-object/from16 v4, p8

    :cond_15
    const/high16 v18, 0x2000000

    :goto_d
    or-int v0, v0, v18

    goto :goto_e

    :cond_16
    move-object/from16 v4, p8

    :goto_e
    move/from16 v18, v0

    and-int/lit16 v0, v14, 0x200

    const/high16 v19, 0x30000000

    if-eqz v0, :cond_17

    or-int v18, v18, v19

    move/from16 v19, v0

    :goto_f
    move/from16 v0, v18

    goto :goto_11

    :cond_17
    and-int v19, v12, v19

    if-nez v19, :cond_19

    move/from16 v19, v0

    move/from16 v0, p9

    invoke-virtual {v11, v0}, Lp1/q;->d(F)Z

    move-result v20

    if-eqz v20, :cond_18

    const/high16 v20, 0x20000000

    goto :goto_10

    :cond_18
    const/high16 v20, 0x10000000

    :goto_10
    or-int v18, v18, v20

    goto :goto_f

    :cond_19
    move/from16 v19, v0

    move/from16 v0, p9

    goto :goto_f

    :goto_11
    and-int/lit16 v1, v14, 0x400

    move/from16 v18, v1

    if-eqz v18, :cond_1a

    move-object/from16 v1, p10

    const/16 v21, 0x6

    goto :goto_13

    :cond_1a
    and-int/lit8 v20, p13, 0x6

    move-object/from16 v1, p10

    if-nez v20, :cond_1c

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1b

    const/16 v21, 0x4

    goto :goto_12

    :cond_1b
    const/16 v21, 0x2

    :goto_12
    or-int v21, p13, v21

    goto :goto_13

    :cond_1c
    move/from16 v21, p13

    :goto_13
    const v22, 0x12492493

    and-int v1, v0, v22

    const v2, 0x12492492

    const/4 v12, 0x3

    if-ne v1, v2, :cond_1e

    and-int/lit8 v1, v21, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1e

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_1d

    goto :goto_14

    :cond_1d
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move/from16 v10, p9

    move-object v3, v6

    move v6, v9

    move-object v0, v11

    move-object v8, v13

    move-object/from16 v11, p10

    move-object v9, v4

    move-object v4, v7

    move v7, v15

    goto/16 :goto_27

    :cond_1e
    :goto_14
    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v1, p12, 0x1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    const v21, -0xe00e001

    sget-object v12, Lb2/t;->w:Lb2/t;

    const v23, -0xe001

    if-eqz v1, :cond_22

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_15

    :cond_1f
    invoke-virtual {v11}, Lp1/q;->X()V

    and-int/lit8 v1, v14, 0x8

    if-eqz v1, :cond_20

    and-int/lit16 v0, v0, -0x1c01

    :cond_20
    and-int v1, v0, v23

    and-int/lit16 v3, v14, 0x100

    if-eqz v3, :cond_21

    and-int v1, v0, v21

    :cond_21
    move/from16 v3, p9

    move-object/from16 v5, p10

    move/from16 v17, v1

    move-object v8, v4

    move-object v13, v6

    move v0, v9

    move v1, v15

    const/4 v10, 0x0

    move-object/from16 v6, p4

    move-object/from16 v9, p7

    move-object v15, v7

    goto/16 :goto_1c

    :cond_22
    :goto_15
    if-eqz v5, :cond_23

    move-object v6, v12

    :cond_23
    and-int/lit8 v1, v14, 0x8

    if-eqz v1, :cond_24

    sget-object v1, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v11, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/l5;

    iget-object v1, v1, Lg1/l5;->b:Lt0/i;

    and-int/lit16 v0, v0, -0x1c01

    goto :goto_16

    :cond_24
    move-object v1, v7

    :goto_16
    const v5, -0x699e4a48

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    sget-object v29, Lp3/r;->H:Lp3/r;

    const/16 v5, 0x18

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v27

    invoke-static {v11}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v5

    iget-wide v13, v5, Ld40/n;->d:J

    new-instance v24, Ll3/v0;

    const-wide/16 v37, 0x0

    const v39, 0xff7fd8

    const/16 v30, 0x0

    sget-object v31, Lp3/i;->w:Lp3/f;

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x3

    move-wide/from16 v25, v13

    invoke-direct/range {v24 .. v39}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    const/4 v5, 0x0

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    and-int v5, v0, v23

    if-eqz v8, :cond_25

    const/16 v7, 0x8

    int-to-float v7, v7

    goto :goto_17

    :cond_25
    move v7, v9

    :goto_17
    if-eqz v10, :cond_26

    const/16 v8, 0x14

    int-to-float v8, v8

    goto :goto_18

    :cond_26
    move v8, v15

    :goto_18
    if-eqz v3, :cond_27

    const-string v3, "\u25cf"

    goto :goto_19

    :cond_27
    move-object/from16 v3, p7

    :goto_19
    move/from16 v14, p14

    and-int/lit16 v9, v14, 0x100

    if-eqz v9, :cond_28

    invoke-static {v11}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v4

    invoke-virtual {v4}, Lg1/c1;->f()J

    move-result-wide v26

    invoke-static {v11}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v4

    iget-wide v4, v4, Ld40/n;->b:J

    invoke-static {v11}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v9

    iget-wide v9, v9, Ld40/n;->g:J

    sget-wide v30, Li2/x;->m:J

    new-instance v25, Lg40/p1;

    move-wide/from16 v32, v30

    move-wide/from16 v34, v4

    move-wide/from16 v28, v9

    invoke-direct/range {v25 .. v35}, Lg40/p1;-><init>(JJJJJ)V

    and-int v0, v0, v21

    move v5, v0

    move-object/from16 v4, v25

    :cond_28
    if-eqz v19, :cond_29

    const/4 v0, 0x2

    int-to-float v0, v0

    goto :goto_1a

    :cond_29
    move/from16 v0, p9

    :goto_1a
    if-eqz v18, :cond_2b

    const v9, 0x67914271

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_2a

    invoke-static {v11}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v9

    :cond_2a
    check-cast v9, Lg2/s;

    const/4 v10, 0x0

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    move-object v15, v1

    move/from16 v17, v5

    move-object v13, v6

    move v1, v8

    move-object v5, v9

    move-object/from16 v6, v24

    move-object v9, v3

    move-object v8, v4

    move v3, v0

    :goto_1b
    move v0, v7

    goto :goto_1c

    :cond_2b
    const/4 v10, 0x0

    move-object v15, v1

    move-object v9, v3

    move/from16 v17, v5

    move-object v13, v6

    move v1, v8

    move-object/from16 v6, v24

    move-object/from16 v5, p10

    move v3, v0

    move-object v8, v4

    goto :goto_1b

    :goto_1c
    invoke-virtual {v11}, Lp1/q;->r()V

    sget-object v4, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v11, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg2/i;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v7, Ll0/m;->a:Ll0/e;

    move-object/from16 p3, v4

    sget-object v4, Lb2/e;->J:Lb2/l;

    move-object/from16 p4, v5

    const/4 v5, 0x0

    invoke-static {v7, v4, v11, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    move-object/from16 p5, v6

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 p6, v9

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_2c

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1d

    :cond_2c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1d
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v11, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_2d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2e

    :cond_2d
    invoke-static {v5, v11, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2e
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v11, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, -0x201fe32b

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_2f

    const/4 v2, -0x1

    invoke-static {v2, v11}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v4

    :cond_2f
    move-object v10, v4

    check-cast v10, Lp1/a1;

    const/4 v5, 0x0

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    const v2, -0x201fcc46

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x6

    invoke-static {v5, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_1e
    move-object/from16 v2, v18

    check-cast v2, Li93/i;

    iget-boolean v2, v2, Li93/i;->y:Z

    if-eqz v2, :cond_37

    move-object/from16 v2, v18

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    move-object v6, v10

    check-cast v6, Lp1/h1;

    invoke-virtual {v6}, Lp1/h1;->x()I

    move-result v6

    if-ne v6, v2, :cond_30

    const/4 v6, 0x1

    goto :goto_1f

    :cond_30
    const/4 v6, 0x0

    :goto_1f
    if-nez v2, :cond_31

    const v7, -0x4a5a0c2a

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_31
    const/4 v7, 0x0

    const/4 v9, 0x3

    if-ne v2, v9, :cond_32

    const v9, -0x4a5a04de

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v11, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_32
    const v9, -0x4a59fbc1

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v11, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    :goto_20
    const v7, -0x201fa6a3

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    if-eqz p0, :cond_33

    move v9, v6

    const/high16 v5, 0x3f800000    # 1.0f

    :goto_21
    const/4 v7, 0x0

    goto :goto_23

    :cond_33
    sget-object v7, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v11, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    move v9, v6

    iget-wide v5, v7, Li2/x;->a:J

    sget-object v7, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v11, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg1/c1;

    invoke-virtual {v7}, Lg1/c1;->i()Z

    move-result v7

    if-eqz v7, :cond_34

    invoke-static {v5, v6}, Li2/w0;->x(J)F

    goto :goto_22

    :cond_34
    invoke-static {v5, v6}, Li2/w0;->x(J)F

    :goto_22
    const v5, 0x3ec28f5c    # 0.38f

    goto :goto_21

    :goto_23
    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    invoke-static {v5, v12}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move v7, v0

    move/from16 v19, v1

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v0, v6

    const-wide/16 v20, 0x0

    cmpl-double v0, v0, v20

    if-lez v0, :cond_35

    :goto_24
    const/4 v0, 0x1

    goto :goto_25

    :cond_35
    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_24

    :goto_25
    invoke-static {v5, v0, v6}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v20

    invoke-static {v11}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v0, v0, Ld40/n;->a:J

    shr-int/lit8 v5, v17, 0x15

    and-int/lit16 v5, v5, 0x380

    const/4 v6, 0x0

    invoke-static {v9, v3, v5, v11, v6}, Ld40/r;->f(ZFILandroidx/compose/runtime/Composer;I)F

    move-result v5

    if-eqz v9, :cond_36

    move-wide/from16 v23, v0

    iget-wide v0, v8, Lg40/p1;->a:J

    goto :goto_26

    :cond_36
    move-wide/from16 v23, v0

    iget-wide v0, v8, Lg40/p1;->e:J

    :goto_26
    invoke-static {v5, v0, v1}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v21

    new-instance v0, Lg40/t1;

    const/16 v27, 0x3

    move-object/from16 v1, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v22, v19

    move-wide/from16 v25, v23

    const/high16 v28, 0x3f800000    # 1.0f

    move/from16 v23, v3

    move/from16 v19, v7

    move v3, v9

    move-object/from16 v24, v12

    move/from16 v7, p0

    move-object/from16 v9, p6

    move-object v12, v4

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v10}, Lg40/t1;-><init>(Lg40/o1;IZLg2/i;Lg2/s;Ll3/v0;ZLg40/p1;Ljava/lang/String;Lp1/a1;)V

    const v1, -0x411571ad

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    shr-int/lit8 v1, v17, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int v1, v1, v16

    const/4 v2, 0x4

    const/4 v3, 0x0

    move-object/from16 p8, v0

    move/from16 p10, v1

    move/from16 p11, v2

    move/from16 p4, v3

    move-object/from16 p9, v11

    move-object/from16 p3, v15

    move-object/from16 p2, v20

    move-object/from16 p7, v21

    move-wide/from16 p5, v25

    invoke-static/range {p2 .. p11}, Lse/a;->p(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, p3

    move-object/from16 v0, p9

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v11, v0

    move-object v15, v1

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v9

    move-object v4, v12

    move/from16 v0, v19

    move/from16 v1, v22

    move/from16 v3, v23

    move-object/from16 v12, v24

    goto/16 :goto_1e

    :cond_37
    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v9, p6

    move/from16 v19, v0

    move/from16 v22, v1

    move/from16 v23, v3

    move-object v0, v11

    move-object v1, v15

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    move-object v3, v9

    move-object v9, v8

    move-object v8, v3

    move-object v4, v1

    move-object v11, v5

    move-object v5, v6

    move-object v3, v13

    move/from16 v6, v19

    move/from16 v7, v22

    move/from16 v10, v23

    :goto_27
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_38

    new-instance v0, Lg40/q1;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v14}, Lg40/q1;-><init>(ZLg40/o1;Landroidx/compose/ui/Modifier;Li2/a1;Ll3/v0;FFLjava/lang/String;Lg40/p1;FLg2/s;III)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_38
    return-void
.end method

.method public static final h(Ljava/lang/String;ZLl3/v0;Lg40/o1;ILg2/i;Landroidx/compose/ui/Modifier;ZLg40/p1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p10

    check-cast v9, Lp1/q;

    const v0, -0x6acb7f51

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v10, 0x4

    if-eqz v0, :cond_0

    move v0, v10

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p11, v0

    invoke-virtual {v9, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    move-object/from16 v14, p2

    invoke-virtual {v9, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x100

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v0, v3

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x800

    goto :goto_3

    :cond_3
    const/16 v3, 0x400

    :goto_3
    or-int/2addr v0, v3

    invoke-virtual {v9, v7}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x4000

    goto :goto_4

    :cond_4
    const/16 v3, 0x2000

    :goto_4
    or-int/2addr v0, v3

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/high16 v3, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v3, 0x10000

    :goto_5
    or-int/2addr v0, v3

    move-object/from16 v12, p6

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/high16 v3, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v3, 0x80000

    :goto_6
    or-int/2addr v0, v3

    move/from16 v4, p7

    invoke-virtual {v9, v4}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_7

    const/high16 v3, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v3, 0x400000

    :goto_7
    or-int/2addr v0, v3

    move-object/from16 v3, p8

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/high16 v5, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v5, 0x2000000

    :goto_8
    or-int/2addr v0, v5

    move-object/from16 v5, p9

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    const/high16 v13, 0x20000000

    goto :goto_9

    :cond_9
    const/high16 v13, 0x10000000

    :goto_9
    or-int/2addr v13, v0

    const v0, 0x12492493

    and-int/2addr v0, v13

    const v15, 0x12492492

    if-ne v0, v15, :cond_b

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v25, v9

    goto/16 :goto_f

    :cond_b
    :goto_a
    new-instance v15, Lq3/y;

    if-eqz v2, :cond_c

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0, v0}, Lj93/l0;->f(II)J

    move-result-wide v16

    :goto_b
    move-wide/from16 v11, v16

    goto :goto_c

    :cond_c
    sget-wide v16, Ll3/u0;->b:J

    goto :goto_b

    :goto_c
    invoke-direct {v15, v10, v1, v11, v12}, Lq3/y;-><init>(ILjava/lang/String;J)V

    new-instance v11, Li2/c1;

    invoke-static {v9}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v0, v0, Ld40/n;->f:J

    invoke-direct {v11, v0, v1}, Li2/c1;-><init>(J)V

    move-object v12, v15

    new-instance v15, Lu0/r0;

    iget-object v0, v6, Lg40/o1;->b:Lg40/m1;

    const/16 v0, 0x8

    const/16 v1, 0x7b

    const/4 v10, 0x0

    invoke-direct {v15, v10, v0, v10, v1}, Lu0/r0;-><init>(IIII)V

    const v0, 0x4298449e

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_d

    if-ne v1, v10, :cond_e

    :cond_d
    new-instance v1, Lb30/l1;

    const/4 v0, 0x4

    invoke-direct {v1, v8, v0}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v19, v1

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    const v0, 0x42983b32

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_f

    if-ne v1, v10, :cond_10

    :cond_f
    new-instance v1, Lb30/l1;

    const/4 v0, 0x5

    invoke-direct {v1, v8, v0}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v20, v1

    check-cast v20, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    new-instance v18, Lu0/q0;

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x3a

    invoke-direct/range {v18 .. v23}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    and-int/lit8 v0, v13, 0xe

    shr-int/lit8 v1, v13, 0xc

    move-object/from16 v23, v11

    and-int/lit16 v11, v1, 0x1c00

    move/from16 v19, v0

    const v0, 0x3665675f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lb30/z3;

    move/from16 v20, v11

    move/from16 v11, v19

    move-object/from16 v19, v12

    move v12, v1

    move v1, v2

    move-object v2, v3

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v5}, Lb30/z3;-><init>(ZLg40/p1;Ljava/lang/String;ZLjava/lang/String;)V

    move-object v1, v3

    const v2, 0x5d1b9611

    invoke-static {v2, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v24

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    const v0, 0x4297cd0b

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x1

    const/4 v2, 0x4

    if-ne v11, v2, :cond_11

    move v2, v0

    goto :goto_d

    :cond_11
    const/4 v2, 0x0

    :goto_d
    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v3, v13

    const/16 v4, 0x4000

    if-ne v3, v4, :cond_12

    goto :goto_e

    :cond_12
    const/4 v0, 0x0

    :goto_e
    or-int/2addr v0, v2

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_13

    if-ne v2, v10, :cond_14

    :cond_13
    new-instance v2, Lb30/o1;

    invoke-direct {v2, v1, v6, v7, v8}, Lb30/o1;-><init>(Ljava/lang/String;Lg40/o1;ILg2/i;)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    and-int/lit16 v0, v12, 0x380

    const/high16 v2, 0x6000000

    or-int/2addr v0, v2

    or-int v0, v0, v20

    shl-int/lit8 v2, v13, 0x9

    const/high16 v3, 0x70000

    and-int/2addr v2, v3

    or-int v26, v0, v2

    const/16 v27, 0x0

    const/16 v28, 0x3e10

    const/4 v13, 0x0

    const/16 v17, 0x1

    move-object/from16 v16, v18

    const/16 v18, 0x0

    move-object/from16 v12, v19

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v11, p6

    move-object/from16 v25, v9

    move-object v9, v12

    move/from16 v12, p7

    invoke-static/range {v9 .. v28}, Lu0/i;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/c1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    :goto_f
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_15

    new-instance v0, Lb30/n1;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p11

    move-object v4, v6

    move v5, v7

    move-object v6, v8

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v11}, Lb30/n1;-><init>(Ljava/lang/String;ZLl3/v0;Lg40/o1;ILg2/i;Landroidx/compose/ui/Modifier;ZLg40/p1;Ljava/lang/String;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method public static final i(ILjava/lang/String;Lm40/w;ZLandroidx/compose/ui/Modifier;Lb2/m;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p3

    move-object/from16 v4, p4

    move-object/from16 v8, p5

    const-string v5, "imageLoader"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "modifier"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p6

    check-cast v12, Lp1/q;

    const v5, 0x2343937

    invoke-virtual {v12, v5}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v1}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int v5, p7, v5

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v5, v6

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v5, v6

    invoke-virtual {v12, v0}, Lp1/q;->h(Z)Z

    move-result v6

    const/16 v7, 0x800

    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v5, v6

    const v6, 0x12493

    and-int/2addr v6, v5

    const v9, 0x12492

    if-ne v6, v9, :cond_5

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_5
    :goto_4
    const v6, -0x5b23d4c6

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-static {v12}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v6

    iget-wide v9, v6, Ld40/n;->a:J

    invoke-static {v9, v10}, Li2/w0;->x(J)F

    move-result v6

    float-to-double v9, v6

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    cmpg-double v6, v9, v13

    const/4 v9, 0x0

    if-gez v6, :cond_6

    const/4 v6, 0x1

    goto :goto_5

    :cond_6
    move v6, v9

    :goto_5
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    const v11, -0x71b5a837

    invoke-virtual {v12, v11}, Lp1/q;->e0(I)V

    and-int/lit16 v11, v5, 0x1c00

    if-ne v11, v7, :cond_7

    const/4 v7, 0x1

    goto :goto_6

    :cond_7
    move v7, v9

    :goto_6
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_8

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v11, v7, :cond_b

    :cond_8
    if-eqz v0, :cond_a

    if-eqz v6, :cond_9

    sget-wide v6, Li2/x;->f:J

    goto :goto_7

    :cond_9
    sget-wide v6, Li2/x;->b:J

    :goto_7
    new-instance v11, Li2/p;

    const/4 v13, 0x5

    invoke-direct {v11, v6, v7, v13}, Li2/p;-><init>(JI)V

    goto :goto_8

    :cond_a
    const/4 v6, 0x0

    move-object v11, v6

    :goto_8
    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v11, Li2/y;

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v7, Lb30/l2;

    invoke-direct {v7, v1, v11, v8, v6}, Lb30/l2;-><init>(ILi2/y;Lb2/m;Landroidx/compose/ui/Modifier;)V

    const v11, -0x472745de

    invoke-static {v11, v12, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    invoke-static {v8, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_c

    invoke-virtual {v12, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_9
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    :cond_d
    invoke-static {v13, v12, v13, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v12, v9, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v2, :cond_f

    const v9, -0x3d38d06e

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    new-instance v9, Lb30/k2;

    const/4 v10, 0x0

    invoke-direct {v9, v7, v10}, Lb30/k2;-><init>(Lx1/b;I)V

    const v10, -0x74a38bcf

    invoke-static {v10, v12, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    new-instance v9, Lb30/k2;

    const/4 v11, 0x1

    invoke-direct {v9, v7, v11}, Lb30/k2;-><init>(Lx1/b;I)V

    const v7, -0x941a0bb

    invoke-static {v7, v12, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v7, v5, 0xe

    const v9, 0x36006dc0

    or-int/2addr v7, v9

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v5, v7

    const/high16 v7, 0xc00000

    or-int v13, v5, v7

    const/4 v14, 0x6

    const/16 v15, 0x60

    sget-object v5, Ly2/j;->b:Ly2/b1;

    move-object v4, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static/range {v2 .. v15}, Lds/q;->i(Ljava/lang/String;Lm40/w;Landroidx/compose/ui/Modifier;Ly2/k;Li2/y;Ln2/a;Lb2/h;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    const/4 v0, 0x0

    const/4 v1, 0x1

    const v2, -0x3d32008f

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v7, v12, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Lb30/j2;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(ILjava/lang/String;Lm40/w;ZLandroidx/compose/ui/Modifier;Lb2/m;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final j(ILi2/y;Lb2/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "modifier"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v0, -0x302ef002

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v13, v1}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    and-int/lit8 v2, v5, 0x30

    move-object/from16 v12, p1

    if-nez v2, :cond_2

    invoke-virtual {v13, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    :cond_2
    and-int/lit16 v2, v5, 0x180

    move-object/from16 v3, p2

    if-nez v2, :cond_4

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x100

    goto :goto_2

    :cond_3
    const/16 v2, 0x80

    :goto_2
    or-int/2addr v0, v2

    :cond_4
    and-int/lit16 v2, v5, 0xc00

    if-nez v2, :cond_6

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x800

    goto :goto_3

    :cond_5
    const/16 v2, 0x400

    :goto_3
    or-int/2addr v0, v2

    :cond_6
    and-int/lit16 v2, v0, 0x493

    const/16 v6, 0x492

    if-ne v2, v6, :cond_8

    invoke-virtual {v13}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v13}, Lp1/q;->X()V

    goto :goto_5

    :cond_8
    :goto_4
    if-eqz v1, :cond_9

    and-int/lit8 v2, v0, 0xe

    invoke-static {v1, v13, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v6

    const-string v2, "PaymentMethodIconFomRes"

    invoke-static {v4, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    shl-int/lit8 v2, v0, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/lit8 v2, v2, 0x30

    shl-int/lit8 v0, v0, 0xf

    const/high16 v7, 0x380000

    and-int/2addr v0, v7

    or-int v14, v2, v0

    const/16 v15, 0x30

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v3

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    :cond_9
    :goto_5
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, La01/e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, La01/e;-><init>(ILi2/y;Lb2/m;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final k(Lw10/d;)Ljz/e;
    .locals 1

    instance-of v0, p0, Lw10/a;

    if-eqz v0, :cond_0

    check-cast p0, Lw10/a;

    iget-object p0, p0, Lw10/a;->x:Ljz/e;

    return-object p0

    :cond_0
    instance-of v0, p0, Lw10/c;

    if-eqz v0, :cond_1

    check-cast p0, Lw10/c;

    iget-object p0, p0, Lw10/c;->y:Ljz/e;

    return-object p0

    :cond_1
    instance-of p0, p0, Lw10/b;

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final l(Landroid/view/MotionEvent;)Lcom/mapbox/maps/ScreenCoordinate;
    .locals 5

    new-instance v0, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result p0

    float-to-double v3, p0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    return-object v0
.end method

.method public static final m(FFF)V
    .locals 0

    cmpl-float p0, p0, p1

    if-gez p0, :cond_1

    cmpl-float p0, p1, p2

    if-gez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(Ljava/lang/String;Le30/c;Lv00/c0;Lh20/f;Ld30/a;)Ld30/v;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "selectedPaymentMethodCode"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "viewModel"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "paymentMethodMetadata"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "customerStateHolder"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lbc3/q0;->a:Lkc3/e;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v6

    invoke-virtual {v5, v6}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v5

    invoke-static {v5}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v12

    const/4 v5, 0x4

    invoke-static {v0, v2, v5}, Lh20/t;->b(Le30/c;Lv00/c0;I)Lh20/g;

    move-result-object v15

    invoke-virtual {v15, v1}, Lh20/g;->a(Ljava/lang/String;)Ls20/a;

    move-result-object v5

    invoke-virtual {v15, v1}, Lh20/g;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    new-instance v13, Landroidx/room/v0;

    const/16 v19, 0x0

    const/16 v20, 0x4

    const/4 v14, 0x2

    const-class v16, Lh20/g;

    const-string v17, "onFormFieldValuesChanged"

    const-string v18, "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V"

    invoke-direct/range {v13 .. v20}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v7, v5

    invoke-static {v0, v2, v1, v4}, Ls7/a;->c(Le30/c;Lv00/c0;Ljava/lang/String;Ld30/a;)Lt20/n;

    move-result-object v5

    iget-object v3, v3, Lh20/f;->c:Ln53/e;

    iget-object v3, v3, Ln53/e;->y:Ll83/e;

    check-cast v3, Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v8, v3, Ljava/util/Collection;

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    move-object v8, v3

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly00/o4;

    iget-object v8, v8, Ly00/o4;->E:Ly00/f4;

    if-eqz v8, :cond_2

    iget-object v8, v8, Ly00/f4;->w:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    :goto_0
    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v9, 0x1

    :cond_3
    :goto_1
    invoke-virtual {v2, v1, v9}, Lv00/c0;->i(Ljava/lang/String;Z)Lt00/a;

    move-result-object v3

    iget-object v2, v2, Lv00/c0;->w:Ly00/c8;

    invoke-interface {v2}, Ly00/c8;->q0()Z

    move-result v8

    iget-object v9, v0, Le30/c;->Q:Lec3/r1;

    iget-object v2, v4, Ld30/a;->b:La33/d;

    iget-object v2, v2, La33/d;->z:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Lec3/r1;

    new-instance v14, La1/e;

    iget-object v2, v0, Le30/c;->Y:Lk20/d;

    const/16 v20, 0x0

    const/16 v21, 0x18

    const/4 v15, 0x1

    const-class v17, Lk20/d;

    const-string v18, "reportFieldInteraction"

    const-string v19, "reportFieldInteraction(Ljava/lang/String;)V"

    move-object/from16 v16, v2

    invoke-direct/range {v14 .. v21}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iget-object v10, v0, Le30/c;->O:Lec3/w1;

    move-object v4, v13

    sget-object v13, Lhc3/o;->a:Lbc3/w1;

    new-instance v0, Ld30/v;

    move-object v2, v7

    move-object v7, v3

    move-object v3, v6

    move-object v6, v14

    invoke-direct/range {v0 .. v13}, Ld30/v;-><init>(Ljava/lang/String;Ls20/a;Ljava/util/List;Lc93/m;Lt20/n;Lkotlin/jvm/functions/Function1;Lt00/a;ZLec3/f2;Lec3/w1;Lec3/r1;Lbc3/c0;Lq83/j;)V

    return-object v0
.end method

.method public static o([BILandroidx/glance/appwidget/protobuf/d;)I
    .locals 2

    invoke-static {p0, p1, p2}, Ldc/a;->u([BILandroidx/glance/appwidget/protobuf/d;)I

    move-result p1

    iget v0, p2, Landroidx/glance/appwidget/protobuf/d;->a:I

    if-ltz v0, :cond_2

    array-length v1, p0

    sub-int/2addr v1, p1

    if-gt v0, v1, :cond_1

    if-nez v0, :cond_0

    sget-object p0, Landroidx/glance/appwidget/protobuf/i;->x:Landroidx/glance/appwidget/protobuf/h;

    iput-object p0, p2, Landroidx/glance/appwidget/protobuf/d;->c:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Landroidx/glance/appwidget/protobuf/i;->d([BII)Landroidx/glance/appwidget/protobuf/h;

    move-result-object p0

    iput-object p0, p2, Landroidx/glance/appwidget/protobuf/d;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->g()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->e()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static p(I[B)I
    .locals 2

    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static q(I[B)J
    .locals 7

    aget-byte v0, p1, p0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    add-int/lit8 v4, p0, 0x1

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x2

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x3

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x4

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x5

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x6

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 p0, p0, 0x7

    aget-byte p0, p1, p0

    int-to-long p0, p0

    and-long/2addr p0, v2

    const/16 v2, 0x38

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static r(Landroidx/glance/appwidget/protobuf/b1;I[BIILandroidx/glance/appwidget/protobuf/e0;Landroidx/glance/appwidget/protobuf/d;)I
    .locals 7

    invoke-interface {p0}, Landroidx/glance/appwidget/protobuf/b1;->d()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Ldc/a;->J(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/b1;[BIILandroidx/glance/appwidget/protobuf/d;)I

    move-result p0

    invoke-interface {v1, v0}, Landroidx/glance/appwidget/protobuf/b1;->b(Ljava/lang/Object;)V

    iput-object v0, v5, Landroidx/glance/appwidget/protobuf/d;->c:Ljava/lang/Object;

    invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-ge p0, v4, :cond_1

    move-object v6, v5

    move v5, v4

    invoke-static {v2, p0, v6}, Ldc/a;->u([BILandroidx/glance/appwidget/protobuf/d;)I

    move-result v4

    iget p2, v6, Landroidx/glance/appwidget/protobuf/d;->a:I

    if-eq p1, p2, :cond_0

    goto :goto_1

    :cond_0
    move-object v3, v2

    move-object v2, v1

    invoke-interface {v2}, Landroidx/glance/appwidget/protobuf/b1;->d()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v1

    invoke-static/range {v1 .. v6}, Ldc/a;->J(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/b1;[BIILandroidx/glance/appwidget/protobuf/d;)I

    move-result p0

    move-object p2, v1

    move-object v1, v2

    move-object v2, v3

    move v4, v5

    move-object v5, v6

    invoke-interface {v1, p2}, Landroidx/glance/appwidget/protobuf/b1;->b(Ljava/lang/Object;)V

    iput-object p2, v5, Landroidx/glance/appwidget/protobuf/d;->c:Ljava/lang/Object;

    invoke-interface {p5, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return p0
.end method

.method public static s(I[BIILandroidx/glance/appwidget/protobuf/e1;Landroidx/glance/appwidget/protobuf/d;)I
    .locals 8

    ushr-int/lit8 v0, p0, 0x3

    if-eqz v0, :cond_c

    and-int/lit8 v0, p0, 0x7

    if-eqz v0, :cond_b

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a

    const/4 v2, 0x2

    if-eq v0, v2, :cond_6

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 p3, 0x5

    if-ne v0, p3, :cond_0

    invoke-static {p2, p1}, Ldc/a;->p(I[B)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->a()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_1
    invoke-static {}, Landroidx/glance/appwidget/protobuf/e1;->c()Landroidx/glance/appwidget/protobuf/e1;

    move-result-object v6

    and-int/lit8 v0, p0, -0x8

    or-int/lit8 v0, v0, 0x4

    iget v2, p5, Landroidx/glance/appwidget/protobuf/d;->d:I

    add-int/2addr v2, v1

    iput v2, p5, Landroidx/glance/appwidget/protobuf/d;->d:I

    const/16 v3, 0x64

    if-ge v2, v3, :cond_5

    const/4 v2, 0x0

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-static {p1, p2, p5}, Ldc/a;->u([BILandroidx/glance/appwidget/protobuf/d;)I

    move-result v4

    iget v2, p5, Landroidx/glance/appwidget/protobuf/d;->a:I

    if-ne v2, v0, :cond_3

    move p2, v4

    :cond_2
    move v5, p3

    move-object v7, p5

    goto :goto_1

    :cond_3
    move-object v3, p1

    move v5, p3

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Ldc/a;->s(I[BIILandroidx/glance/appwidget/protobuf/e1;Landroidx/glance/appwidget/protobuf/d;)I

    move-result p2

    goto :goto_0

    :goto_1
    iget p1, v7, Landroidx/glance/appwidget/protobuf/d;->d:I

    sub-int/2addr p1, v1

    iput p1, v7, Landroidx/glance/appwidget/protobuf/d;->d:I

    if-gt p2, v5, :cond_4

    if-ne v2, v0, :cond_4

    invoke-virtual {p4, p0, v6}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    return p2

    :cond_4
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->f()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_5
    new-instance p0, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    const-string p1, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    move-object v3, p1

    move-object v7, p5

    invoke-static {v3, p2, v7}, Ldc/a;->u([BILandroidx/glance/appwidget/protobuf/d;)I

    move-result p1

    iget p2, v7, Landroidx/glance/appwidget/protobuf/d;->a:I

    if-ltz p2, :cond_9

    array-length p3, v3

    sub-int/2addr p3, p1

    if-gt p2, p3, :cond_8

    if-nez p2, :cond_7

    sget-object p3, Landroidx/glance/appwidget/protobuf/i;->x:Landroidx/glance/appwidget/protobuf/h;

    invoke-virtual {p4, p0, p3}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    goto :goto_2

    :cond_7
    invoke-static {v3, p1, p2}, Landroidx/glance/appwidget/protobuf/i;->d([BII)Landroidx/glance/appwidget/protobuf/h;

    move-result-object p3

    invoke-virtual {p4, p0, p3}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    :goto_2
    add-int/2addr p1, p2

    return p1

    :cond_8
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->g()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_9
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->e()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0

    :cond_a
    move-object v3, p1

    invoke-static {p2, v3}, Ldc/a;->q(I[B)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_b
    move-object v3, p1

    move-object v7, p5

    invoke-static {v3, p2, v7}, Ldc/a;->w([BILandroidx/glance/appwidget/protobuf/d;)I

    move-result p1

    iget-wide p2, v7, Landroidx/glance/appwidget/protobuf/d;->b:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, p0, p2}, Landroidx/glance/appwidget/protobuf/e1;->d(ILjava/lang/Object;)V

    return p1

    :cond_c
    invoke-static {}, Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;->a()Landroidx/glance/appwidget/protobuf/InvalidProtocolBufferException;

    move-result-object p0

    throw p0
.end method

.method public static t(I[BILandroidx/glance/appwidget/protobuf/d;)I
    .locals 2

    and-int/lit8 p0, p0, 0x7f

    add-int/lit8 v0, p2, 0x1

    aget-byte v1, p1, p2

    if-ltz v1, :cond_0

    shl-int/lit8 p1, v1, 0x7

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/glance/appwidget/protobuf/d;->a:I

    return v0

    :cond_0
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr p0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v0, p1, v0

    if-ltz v0, :cond_1

    shl-int/lit8 p1, v0, 0xe

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/glance/appwidget/protobuf/d;->a:I

    return v1

    :cond_1
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0xe

    or-int/2addr p0, v0

    add-int/lit8 v0, p2, 0x3

    aget-byte v1, p1, v1

    if-ltz v1, :cond_2

    shl-int/lit8 p1, v1, 0x15

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/glance/appwidget/protobuf/d;->a:I

    return v0

    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr p0, v1

    add-int/lit8 p2, p2, 0x4

    aget-byte v0, p1, v0

    if-ltz v0, :cond_3

    shl-int/lit8 p1, v0, 0x1c

    or-int/2addr p0, p1

    iput p0, p3, Landroidx/glance/appwidget/protobuf/d;->a:I

    return p2

    :cond_3
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0x1c

    or-int/2addr p0, v0

    :goto_0
    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-gez p2, :cond_4

    move p2, v0

    goto :goto_0

    :cond_4
    iput p0, p3, Landroidx/glance/appwidget/protobuf/d;->a:I

    return v0
.end method

.method public static u([BILandroidx/glance/appwidget/protobuf/d;)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    if-ltz p1, :cond_0

    iput p1, p2, Landroidx/glance/appwidget/protobuf/d;->a:I

    return v0

    :cond_0
    invoke-static {p1, p0, v0, p2}, Ldc/a;->t(I[BILandroidx/glance/appwidget/protobuf/d;)I

    move-result p0

    return p0
.end method

.method public static v(I[BIILandroidx/glance/appwidget/protobuf/e0;Landroidx/glance/appwidget/protobuf/d;)I
    .locals 2

    check-cast p4, Landroidx/glance/appwidget/protobuf/b0;

    invoke-static {p1, p2, p5}, Ldc/a;->u([BILandroidx/glance/appwidget/protobuf/d;)I

    move-result p2

    iget v0, p5, Landroidx/glance/appwidget/protobuf/d;->a:I

    invoke-virtual {p4, v0}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Ldc/a;->u([BILandroidx/glance/appwidget/protobuf/d;)I

    move-result v0

    iget v1, p5, Landroidx/glance/appwidget/protobuf/d;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Ldc/a;->u([BILandroidx/glance/appwidget/protobuf/d;)I

    move-result p2

    iget v0, p5, Landroidx/glance/appwidget/protobuf/d;->a:I

    invoke-virtual {p4, v0}, Landroidx/glance/appwidget/protobuf/b0;->c(I)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static w([BILandroidx/glance/appwidget/protobuf/d;)I
    .locals 9

    add-int/lit8 v0, p1, 0x1

    aget-byte v1, p0, p1

    int-to-long v1, v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_0

    iput-wide v1, p2, Landroidx/glance/appwidget/protobuf/d;->b:J

    return v0

    :cond_0
    const-wide/16 v3, 0x7f

    and-long/2addr v1, v3

    add-int/lit8 p1, p1, 0x2

    aget-byte v0, p0, v0

    and-int/lit8 v3, v0, 0x7f

    int-to-long v3, v3

    const/4 v5, 0x7

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    move v3, v5

    :goto_0
    if-gez v0, :cond_1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    add-int/2addr v3, v5

    and-int/lit8 v4, p1, 0x7f

    int-to-long v6, v4

    shl-long/2addr v6, v3

    or-long/2addr v1, v6

    move v8, v0

    move v0, p1

    move p1, v8

    goto :goto_0

    :cond_1
    iput-wide v1, p2, Landroidx/glance/appwidget/protobuf/d;->b:J

    return p1
.end method

.method public static x(Lq0/y;Lq0/t;Landroidx/compose/runtime/Composer;II)Lh0/p3;
    .locals 9

    and-int/lit8 p4, p4, 0x2

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    new-instance p1, Lq0/t;

    invoke-direct {p1, v0}, Lq0/t;-><init>(I)V

    :cond_0
    invoke-static {p2}, Lc0/t1;->a(Landroidx/compose/runtime/Composer;)Ld0/x;

    move-result-object p4

    sget-object v1, Ld0/p2;->a:Ljava/lang/Object;

    int-to-float v1, v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    const/high16 v3, 0x43c80000    # 400.0f

    invoke-static {v2, v3, v0, v1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v1

    sget-object v2, Lb3/v1;->h:Lp1/u2;

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    sget-object v3, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {p2, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/m;

    and-int/lit8 v4, p3, 0xe

    const/4 v5, 0x6

    xor-int/2addr v4, v5

    const/4 v6, 0x4

    const/4 v7, 0x0

    if-le v4, v6, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    and-int/lit8 v4, p3, 0x6

    if-ne v4, v6, :cond_3

    :cond_2
    move v4, v0

    goto :goto_0

    :cond_3
    move v4, v7

    :goto_0
    invoke-virtual {p2, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {p2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    and-int/lit8 v6, p3, 0x70

    xor-int/lit8 v6, v6, 0x30

    const/16 v8, 0x20

    if-le v6, v8, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v8, :cond_6

    :cond_5
    move v7, v0

    :cond_6
    or-int p3, v4, v7

    invoke-virtual {p2, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {p2, v2}, Lp1/q;->e(I)Z

    move-result v2

    or-int/2addr p3, v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_7

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v2, p3, :cond_8

    :cond_7
    new-instance p3, Loq1/c;

    invoke-direct {p3, v5, p0, v3}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lh0/c;

    invoke-direct {v2, p0, p3, p1, v0}, Lh0/c;-><init>(Ljava/lang/Object;Ll83/e;Ljava/lang/Object;I)V

    sget p0, Li0/k;->a:F

    new-instance p0, Li0/g;

    invoke-direct {p0, v2, p4, v1}, Li0/g;-><init>(Li0/l;Ld0/x;Ld0/l;)V

    invoke-virtual {p2, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, p0

    :cond_8
    check-cast v2, Lh0/p3;

    return-object v2
.end method

.method public static y(Le1/b;Ly3/m;Ll3/v0;Ly3/c;Lp3/h;)Le1/b;
    .locals 2

    if-eqz p0, :cond_0

    iget-object v0, p0, Le1/b;->a:Ly3/m;

    if-ne p1, v0, :cond_0

    invoke-static {p2, p1}, Ljc/x;->p0(Ll3/v0;Ly3/m;)Ll3/v0;

    move-result-object v0

    iget-object v1, p0, Le1/b;->b:Ll3/v0;

    invoke-virtual {v0, v1}, Ll3/v0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ly3/c;->getDensity()F

    move-result v0

    iget-object v1, p0, Le1/b;->c:Ly3/d;

    iget v1, v1, Ly3/d;->w:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Le1/b;->d:Lp3/h;

    if-ne p4, v0, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Le1/b;->h:Le1/b;

    if-eqz p0, :cond_1

    iget-object v0, p0, Le1/b;->a:Ly3/m;

    if-ne p1, v0, :cond_1

    invoke-static {p2, p1}, Ljc/x;->p0(Ll3/v0;Ly3/m;)Ll3/v0;

    move-result-object v0

    iget-object v1, p0, Le1/b;->b:Ll3/v0;

    invoke-virtual {v0, v1}, Ll3/v0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ly3/c;->getDensity()F

    move-result v0

    iget-object v1, p0, Le1/b;->c:Ly3/d;

    iget v1, v1, Ly3/d;->w:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    iget-object v0, p0, Le1/b;->d:Lp3/h;

    if-ne p4, v0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Le1/b;

    invoke-static {p2, p1}, Ljc/x;->p0(Ll3/v0;Ly3/m;)Ll3/v0;

    move-result-object p2

    invoke-interface {p3}, Ly3/c;->getDensity()F

    move-result v0

    invoke-interface {p3}, Ly3/c;->m0()F

    move-result p3

    new-instance v1, Ly3/d;

    invoke-direct {v1, v0, p3}, Ly3/d;-><init>(FF)V

    invoke-direct {p0, p1, p2, v1, p4}, Le1/b;-><init>(Ly3/m;Ll3/v0;Ly3/d;Lp3/h;)V

    sput-object p0, Le1/b;->h:Le1/b;

    return-object p0
.end method

.method public static final z(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;
    .locals 11

    instance-of v0, p1, Landroid/text/Spanned;

    const/16 v1, 0x1d

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroid/text/Spanned;

    add-int/lit8 v2, p2, -0x1

    const-class v3, Landroid/text/style/MetricAffectingSpan;

    invoke-interface {v0, v2, p3, v3}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v2

    if-eq v2, p3, :cond_4

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    new-instance v5, Landroid/text/TextPaint;

    invoke-direct {v5}, Landroid/text/TextPaint;-><init>()V

    :goto_0
    if-ge p2, p3, :cond_3

    invoke-interface {v0, p2, p3, v3}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v6

    invoke-interface {v0, p2, v6, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Landroid/text/style/MetricAffectingSpan;

    invoke-virtual {v5, p0}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    invoke-static {v7}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object v7

    :cond_0
    :goto_1
    invoke-virtual {v7}, La0/i1;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v7}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/text/style/MetricAffectingSpan;

    invoke-interface {v0, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v9

    invoke-interface {v0, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v10

    if-eq v9, v10, :cond_0

    invoke-virtual {v8, v5}, Landroid/text/style/MetricAffectingSpan;->updateMeasureState(Landroid/text/TextPaint;)V

    goto :goto_1

    :cond_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v1, :cond_2

    invoke-static {v5, p1, p2, v6, v4}, La4/a;->v(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7, p2, v6, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    :goto_2
    iget p2, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v7

    add-int/2addr v7, p2

    iput v7, v2, Landroid/graphics/Rect;->right:I

    iget p2, v2, Landroid/graphics/Rect;->top:I

    iget v7, v4, Landroid/graphics/Rect;->top:I

    invoke-static {p2, v7}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, v2, Landroid/graphics/Rect;->top:I

    iget p2, v2, Landroid/graphics/Rect;->bottom:I

    iget v7, v4, Landroid/graphics/Rect;->bottom:I

    invoke-static {p2, v7}, Ljava/lang/Math;->max(II)I

    move-result p2

    iput p2, v2, Landroid/graphics/Rect;->bottom:I

    move p2, v6

    goto :goto_0

    :cond_3
    return-object v2

    :cond_4
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_5

    invoke-static {p0, p1, p2, p3, v0}, La4/a;->v(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V

    return-object v0

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    return-object v0
.end method
