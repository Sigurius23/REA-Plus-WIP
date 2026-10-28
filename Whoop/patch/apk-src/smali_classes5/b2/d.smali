.class public final Lb2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic x:Lb2/d;


# instance fields
.field public final synthetic w:I


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lb2/d;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lb2/d;-><init>(I)V

    sput-object v0, Lb2/d;->x:Lb2/d;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, Lb2/d;->w:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Lcom/google/android/gms/common/api/Scope;

    check-cast p2, Lcom/google/android/gms/common/api/Scope;

    iget-object p1, p1, Lcom/google/android/gms/common/api/Scope;->x:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/common/api/Scope;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :pswitch_1
    check-cast p2, Lcom/google/android/gms/common/api/Scope;

    check-cast p1, Lcom/google/android/gms/common/api/Scope;

    iget-object p1, p1, Lcom/google/android/gms/common/api/Scope;->x:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/common/api/Scope;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Lh5/h0;->g(Landroid/view/View;)F

    move-result p1

    invoke-static {p2}, Lh5/h0;->g(Landroid/view/View;)F

    move-result p2

    cmpl-float v0, p1, p2

    if-lez v0, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    cmpg-float p1, p1, p2

    if-gez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1

    :pswitch_3
    check-cast p1, Loe3/i;

    iget-object p1, p1, Loe3/i;->a:Lne3/e0;

    check-cast p2, Loe3/i;

    iget-object p2, p2, Loe3/i;->a:Lne3/e0;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_4
    check-cast p1, Lob/j;

    iget-object p1, p1, Lob/j;->a:Ljava/lang/String;

    check-cast p2, Lob/j;

    iget-object p2, p2, Lob/j;->a:Ljava/lang/String;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_5
    check-cast p1, Lob/h;

    iget-object p1, p1, Lob/h;->a:Ljava/lang/String;

    check-cast p2, Lob/h;

    iget-object p2, p2, Lob/h;->a:Ljava/lang/String;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_6
    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_7
    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_8
    check-cast p1, Ljava/util/Map$Entry;

    check-cast p2, Ljava/util/Map$Entry;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_9
    check-cast p1, Lm7/q;

    iget-object p1, p1, Lm7/q;->a:Ljava/time/Instant;

    check-cast p2, Lm7/q;

    iget-object p2, p2, Lm7/q;->a:Ljava/time/Instant;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_a
    check-cast p1, Ljava/util/Map$Entry;

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p2, p1

    return p2

    :pswitch_b
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    sub-int/2addr p1, p2

    :goto_1
    return p1

    :pswitch_c
    check-cast p1, Lio/sentry/rrweb/b;

    iget-wide v0, p1, Lio/sentry/rrweb/b;->x:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    check-cast p2, Lio/sentry/rrweb/b;

    iget-wide v0, p2, Lio/sentry/rrweb/b;->x:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_d
    check-cast p1, Lio/sentry/android/replay/l;

    iget-wide v0, p1, Lio/sentry/android/replay/l;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    check-cast p2, Lio/sentry/android/replay/l;

    iget-wide v0, p2, Lio/sentry/android/replay/l;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_e
    check-cast p2, Ljava/lang/reflect/Constructor;

    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p2

    array-length p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Ljava/lang/reflect/Constructor;

    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    array-length p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_f
    check-cast p1, Lm7/b1;

    iget-object p1, p1, Lm7/b1;->a:Ljava/time/Instant;

    check-cast p2, Lm7/b1;

    iget-object p2, p2, Lm7/b1;->a:Ljava/time/Instant;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_10
    check-cast p1, Lm7/z0;

    iget-object p1, p1, Lm7/z0;->a:Ljava/time/Instant;

    check-cast p2, Lm7/z0;

    iget-object p2, p2, Lm7/z0;->a:Ljava/time/Instant;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_11
    check-cast p1, Lm7/w0;

    iget-object p1, p1, Lm7/w0;->a:Ljava/time/Instant;

    check-cast p2, Lm7/w0;

    iget-object p2, p2, Lm7/w0;->a:Ljava/time/Instant;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_12
    check-cast p1, Lm7/p0;

    iget-object p1, p1, Lm7/p0;->a:Ljava/time/Instant;

    check-cast p2, Lm7/p0;

    iget-object p2, p2, Lm7/p0;->a:Ljava/time/Instant;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_13
    check-cast p1, Lm7/y;

    iget-object p1, p1, Lm7/y;->a:Ljava/time/Instant;

    check-cast p2, Lm7/y;

    iget-object p2, p2, Lm7/y;->a:Ljava/time/Instant;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_14
    check-cast p1, Lm7/v;

    iget-object p1, p1, Lm7/v;->a:Ljava/time/Instant;

    check-cast p2, Lm7/v;

    iget-object p2, p2, Lm7/v;->a:Ljava/time/Instant;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_15
    check-cast p1, Lm7/p;

    iget-object p1, p1, Lm7/p;->a:Ljava/time/Instant;

    check-cast p2, Lm7/p;

    iget-object p2, p2, Lm7/p;->a:Ljava/time/Instant;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_16
    check-cast p1, Lm7/l;

    iget-object p1, p1, Lm7/l;->a:Ljava/time/Instant;

    check-cast p2, Lm7/l;

    iget-object p2, p2, Lm7/l;->a:Ljava/time/Instant;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_17
    check-cast p1, [I

    check-cast p2, [I

    aget p1, p1, v1

    aget p2, p2, v1

    sub-int/2addr p1, p2

    return p1

    :pswitch_18
    check-cast p1, Lfc/d;

    check-cast p2, Lfc/d;

    iget p1, p1, Lfc/d;->b:I

    iget p2, p2, Lfc/d;->b:I

    sub-int/2addr p1, p2

    return p1

    :pswitch_19
    check-cast p1, Le10/j;

    invoke-interface {p1}, Le10/j;->getKey()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Le10/j;

    invoke-interface {p2}, Le10/j;->getKey()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_1a
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    sub-int/2addr p1, p2

    return p1

    :pswitch_1b
    check-cast p1, Lcom/squareup/wire/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :pswitch_1c
    check-cast p1, Ljava/lang/reflect/Field;

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Ljava/lang/reflect/Field;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
