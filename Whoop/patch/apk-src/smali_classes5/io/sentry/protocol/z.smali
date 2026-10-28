.class public final Lio/sentry/protocol/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/String;

.field public F:Ljava/lang/String;

.field public G:Ljava/lang/Integer;

.field public H:Ljava/lang/Integer;

.field public I:Ljava/lang/String;

.field public J:Ljava/lang/String;

.field public K:Ljava/lang/Boolean;

.field public L:Ljava/lang/String;

.field public M:Ljava/lang/Boolean;

.field public N:Ljava/lang/String;

.field public O:Ljava/lang/String;

.field public P:Ljava/lang/String;

.field public Q:Ljava/lang/String;

.field public R:Ljava/lang/String;

.field public S:Ljava/lang/String;

.field public T:Ljava/util/concurrent/ConcurrentHashMap;

.field public U:Ljava/lang/String;

.field public V:Lio/sentry/o5;

.field public w:Ljava/util/List;

.field public x:Ljava/util/List;

.field public y:Ljava/util/Map;

.field public z:Ljava/lang/String;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_1

    const-class v0, Lio/sentry/protocol/z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    check-cast p1, Lio/sentry/protocol/z;

    iget-object v0, p0, Lio/sentry/protocol/z;->w:Ljava/util/List;

    iget-object v1, p1, Lio/sentry/protocol/z;->w:Ljava/util/List;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->x:Ljava/util/List;

    iget-object v1, p1, Lio/sentry/protocol/z;->x:Ljava/util/List;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->y:Ljava/util/Map;

    iget-object v1, p1, Lio/sentry/protocol/z;->y:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->z:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->z:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->F:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->F:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->G:Ljava/lang/Integer;

    iget-object v1, p1, Lio/sentry/protocol/z;->G:Ljava/lang/Integer;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->H:Ljava/lang/Integer;

    iget-object v1, p1, Lio/sentry/protocol/z;->H:Ljava/lang/Integer;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->I:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->I:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->J:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->J:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->K:Ljava/lang/Boolean;

    iget-object v1, p1, Lio/sentry/protocol/z;->K:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->L:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->L:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->M:Ljava/lang/Boolean;

    iget-object v1, p1, Lio/sentry/protocol/z;->M:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->N:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->N:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->O:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->O:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->P:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->P:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->Q:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->Q:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->R:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->R:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->S:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->S:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->T:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p1, Lio/sentry/protocol/z;->T:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->U:Ljava/lang/String;

    iget-object v1, p1, Lio/sentry/protocol/z;->U:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    iget-object p1, p1, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/sentry/protocol/z;->w:Ljava/util/List;

    iget-object v2, v0, Lio/sentry/protocol/z;->x:Ljava/util/List;

    iget-object v3, v0, Lio/sentry/protocol/z;->y:Ljava/util/Map;

    iget-object v5, v0, Lio/sentry/protocol/z;->z:Ljava/lang/String;

    iget-object v6, v0, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    iget-object v7, v0, Lio/sentry/protocol/z;->F:Ljava/lang/String;

    iget-object v8, v0, Lio/sentry/protocol/z;->G:Ljava/lang/Integer;

    iget-object v9, v0, Lio/sentry/protocol/z;->H:Ljava/lang/Integer;

    iget-object v10, v0, Lio/sentry/protocol/z;->I:Ljava/lang/String;

    iget-object v11, v0, Lio/sentry/protocol/z;->J:Ljava/lang/String;

    iget-object v12, v0, Lio/sentry/protocol/z;->K:Ljava/lang/Boolean;

    iget-object v13, v0, Lio/sentry/protocol/z;->L:Ljava/lang/String;

    iget-object v14, v0, Lio/sentry/protocol/z;->M:Ljava/lang/Boolean;

    iget-object v15, v0, Lio/sentry/protocol/z;->N:Ljava/lang/String;

    iget-object v4, v0, Lio/sentry/protocol/z;->O:Ljava/lang/String;

    move-object/from16 v16, v1

    iget-object v1, v0, Lio/sentry/protocol/z;->P:Ljava/lang/String;

    move-object/from16 v17, v1

    iget-object v1, v0, Lio/sentry/protocol/z;->Q:Ljava/lang/String;

    move-object/from16 v18, v1

    iget-object v1, v0, Lio/sentry/protocol/z;->R:Ljava/lang/String;

    move-object/from16 v19, v1

    iget-object v1, v0, Lio/sentry/protocol/z;->S:Ljava/lang/String;

    move-object/from16 v20, v1

    iget-object v1, v0, Lio/sentry/protocol/z;->T:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v21, v1

    iget-object v1, v0, Lio/sentry/protocol/z;->U:Ljava/lang/String;

    move-object/from16 v22, v1

    iget-object v1, v0, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    move-object/from16 v23, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v4

    const/4 v4, 0x0

    filled-new-array/range {v1 .. v23}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v1

    return v1
.end method

.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->z:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "filename"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "function"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/protocol/z;->F:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "module"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/protocol/z;->G:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    const-string v0, "lineno"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->G:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/protocol/z;->H:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    const-string v0, "colno"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->H:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/protocol/z;->I:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v0, "abs_path"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/protocol/z;->J:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v0, "context_line"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->J:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/protocol/z;->K:Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    const-string v0, "in_app"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->K:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/protocol/z;->L:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v0, "package"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->L:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_8
    iget-object v0, p0, Lio/sentry/protocol/z;->M:Ljava/lang/Boolean;

    if-eqz v0, :cond_9

    const-string v0, "native"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->M:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lwe/o;->Z(Ljava/lang/Boolean;)Lwe/o;

    :cond_9
    iget-object v0, p0, Lio/sentry/protocol/z;->N:Ljava/lang/String;

    if-eqz v0, :cond_a

    const-string v0, "platform"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->N:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_a
    iget-object v0, p0, Lio/sentry/protocol/z;->O:Ljava/lang/String;

    if-eqz v0, :cond_b

    const-string v0, "image_addr"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->O:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_b
    iget-object v0, p0, Lio/sentry/protocol/z;->P:Ljava/lang/String;

    if-eqz v0, :cond_c

    const-string v0, "symbol_addr"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->P:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_c
    iget-object v0, p0, Lio/sentry/protocol/z;->Q:Ljava/lang/String;

    if-eqz v0, :cond_d

    const-string v0, "instruction_addr"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->Q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_d
    iget-object v0, p0, Lio/sentry/protocol/z;->R:Ljava/lang/String;

    if-eqz v0, :cond_e

    const-string v0, "addr_mode"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->R:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_e
    iget-object v0, p0, Lio/sentry/protocol/z;->U:Ljava/lang/String;

    if-eqz v0, :cond_f

    const-string v0, "raw_function"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->U:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_f
    iget-object v0, p0, Lio/sentry/protocol/z;->S:Ljava/lang/String;

    if-eqz v0, :cond_10

    const-string v0, "symbol"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->S:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_10
    iget-object v0, p0, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    if-eqz v0, :cond_11

    const-string v0, "lock"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->V:Lio/sentry/o5;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_11
    iget-object v0, p0, Lio/sentry/protocol/z;->w:Ljava/util/List;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    const-string v0, "pre_context"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->w:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_12
    iget-object v0, p0, Lio/sentry/protocol/z;->x:Ljava/util/List;

    if-eqz v0, :cond_13

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "post_context"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->x:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_13
    iget-object v0, p0, Lio/sentry/protocol/z;->y:Ljava/util/Map;

    if-eqz v0, :cond_14

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_14

    const-string v0, "vars"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/protocol/z;->y:Ljava/util/Map;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_14
    iget-object v0, p0, Lio/sentry/protocol/z;->T:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_15

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/protocol/z;->T:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_15
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method
