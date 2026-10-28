.class public final Landroidx/datastore/preferences/protobuf/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/b1;

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/t;-><init>(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Landroidx/datastore/preferences/protobuf/b1;->g()Landroidx/datastore/preferences/protobuf/b1;

    move-result-object v0

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/b1;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 3
    invoke-static {}, Landroidx/datastore/preferences/protobuf/b1;->g()Landroidx/datastore/preferences/protobuf/b1;

    move-result-object p1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/b1;

    .line 6
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/t;->a()V

    .line 7
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/t;->a()V

    return-void
.end method

.method public static b(Landroidx/datastore/preferences/protobuf/n;Landroidx/datastore/preferences/protobuf/u1;ILjava/lang/Object;)V
    .locals 2

    sget-object v0, Landroidx/datastore/preferences/protobuf/u1;->z:Landroidx/datastore/preferences/protobuf/r1;

    if-ne p1, v0, :cond_0

    check-cast p3, Landroidx/datastore/preferences/protobuf/a;

    const/4 p1, 0x3

    invoke-virtual {p0, p2, p1}, Landroidx/datastore/preferences/protobuf/n;->L0(II)V

    invoke-virtual {p3, p0}, Landroidx/datastore/preferences/protobuf/a;->b(Landroidx/datastore/preferences/protobuf/n;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p2, p1}, Landroidx/datastore/preferences/protobuf/n;->L0(II)V

    return-void

    :cond_0
    iget v0, p1, Landroidx/datastore/preferences/protobuf/u1;->x:I

    invoke-virtual {p0, p2, v0}, Landroidx/datastore/preferences/protobuf/n;->L0(II)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    const/4 p3, 0x1

    shl-long v0, p1, p3

    const/16 p3, 0x3f

    shr-long/2addr p1, p3

    xor-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n;->P0(J)V

    return-void

    :pswitch_1
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    shl-int/lit8 p2, p1, 0x1

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, p2

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->N0(I)V

    return-void

    :pswitch_2
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n;->F0(J)V

    return-void

    :pswitch_3
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->D0(I)V

    return-void

    :pswitch_4
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->H0(I)V

    return-void

    :pswitch_5
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->N0(I)V

    return-void

    :pswitch_6
    instance-of p1, p3, Landroidx/datastore/preferences/protobuf/h;

    if-eqz p1, :cond_1

    check-cast p3, Landroidx/datastore/preferences/protobuf/h;

    invoke-virtual {p0, p3}, Landroidx/datastore/preferences/protobuf/n;->B0(Landroidx/datastore/preferences/protobuf/h;)V

    return-void

    :cond_1
    check-cast p3, [B

    array-length p1, p3

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->N0(I)V

    const/4 p2, 0x0

    invoke-virtual {p0, p3, p2, p1}, Landroidx/datastore/preferences/protobuf/n;->y0([BII)V

    return-void

    :pswitch_7
    check-cast p3, Landroidx/datastore/preferences/protobuf/a;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object p1, p3

    check-cast p1, Landroidx/datastore/preferences/protobuf/z;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/z;->a(Landroidx/datastore/preferences/protobuf/z0;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->N0(I)V

    invoke-virtual {p3, p0}, Landroidx/datastore/preferences/protobuf/a;->b(Landroidx/datastore/preferences/protobuf/n;)V

    return-void

    :pswitch_8
    check-cast p3, Landroidx/datastore/preferences/protobuf/a;

    invoke-virtual {p3, p0}, Landroidx/datastore/preferences/protobuf/a;->b(Landroidx/datastore/preferences/protobuf/n;)V

    return-void

    :pswitch_9
    instance-of p1, p3, Landroidx/datastore/preferences/protobuf/h;

    if-eqz p1, :cond_2

    check-cast p3, Landroidx/datastore/preferences/protobuf/h;

    invoke-virtual {p0, p3}, Landroidx/datastore/preferences/protobuf/n;->B0(Landroidx/datastore/preferences/protobuf/h;)V

    return-void

    :cond_2
    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p3}, Landroidx/datastore/preferences/protobuf/n;->K0(Ljava/lang/String;)V

    return-void

    :pswitch_a
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    int-to-byte p1, p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->x0(B)V

    return-void

    :pswitch_b
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->D0(I)V

    return-void

    :pswitch_c
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n;->F0(J)V

    return-void

    :pswitch_d
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->H0(I)V

    return-void

    :pswitch_e
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n;->P0(J)V

    return-void

    :pswitch_f
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n;->P0(J)V

    return-void

    :pswitch_10
    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/n;->D0(I)V

    return-void

    :pswitch_11
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/n;->F0(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public final a()V
    .locals 7

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/t;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/b1;

    iget-object v1, v0, Landroidx/datastore/preferences/protobuf/b1;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {v0, v3}, Landroidx/datastore/preferences/protobuf/b1;->c(I)Ljava/util/Map$Entry;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    instance-of v5, v5, Landroidx/datastore/preferences/protobuf/z;

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/datastore/preferences/protobuf/z;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Landroidx/datastore/preferences/protobuf/w0;->c:Landroidx/datastore/preferences/protobuf/w0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/datastore/preferences/protobuf/w0;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/z0;

    move-result-object v5

    invoke-interface {v5, v4}, Landroidx/datastore/preferences/protobuf/z0;->b(Ljava/lang/Object;)V

    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/z;->h()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-boolean v1, v0, Landroidx/datastore/preferences/protobuf/b1;->y:Z

    if-nez v1, :cond_5

    iget-object v1, v0, Landroidx/datastore/preferences/protobuf/b1;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_4

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/b1;->d()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_4
    invoke-virtual {v0, v2}, Landroidx/datastore/preferences/protobuf/b1;->c(I)Ljava/util/Map$Entry;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_5
    :goto_1
    iget-boolean v1, v0, Landroidx/datastore/preferences/protobuf/b1;->y:Z

    const/4 v2, 0x1

    if-nez v1, :cond_8

    iget-object v1, v0, Landroidx/datastore/preferences/protobuf/b1;->x:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_2

    :cond_6
    iget-object v1, v0, Landroidx/datastore/preferences/protobuf/b1;->x:Ljava/util/Map;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    :goto_2
    iput-object v1, v0, Landroidx/datastore/preferences/protobuf/b1;->x:Ljava/util/Map;

    iget-object v1, v0, Landroidx/datastore/preferences/protobuf/b1;->E:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_3

    :cond_7
    iget-object v1, v0, Landroidx/datastore/preferences/protobuf/b1;->E:Ljava/util/Map;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    :goto_3
    iput-object v1, v0, Landroidx/datastore/preferences/protobuf/b1;->E:Ljava/util/Map;

    iput-boolean v2, v0, Landroidx/datastore/preferences/protobuf/b1;->y:Z

    :cond_8
    iput-boolean v2, p0, Landroidx/datastore/preferences/protobuf/t;->b:Z

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 4

    new-instance v0, Landroidx/datastore/preferences/protobuf/t;

    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/t;-><init>()V

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/b1;

    iget-object v2, v1, Landroidx/datastore/preferences/protobuf/b1;->w:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    if-gtz v2, :cond_1

    invoke-virtual {v1}, Landroidx/datastore/preferences/protobuf/b1;->d()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lr;->t(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    throw v3

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/b1;->c(I)Ljava/util/Map$Entry;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lr;->t(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    throw v3
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/datastore/preferences/protobuf/t;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Landroidx/datastore/preferences/protobuf/t;

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/b1;

    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/b1;

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/b1;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/t;->a:Landroidx/datastore/preferences/protobuf/b1;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/b1;->hashCode()I

    move-result v0

    return v0
.end method
