.class public final synthetic Los/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/internal/e0;
.implements Lcom/google/crypto/tink/internal/c0;
.implements Lcom/google/crypto/tink/internal/n;
.implements Lcom/google/crypto/tink/internal/l;
.implements Lcom/google/crypto/tink/internal/g0;
.implements Lv/a;
.implements Lbh3/g;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Los/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic f(Landroid/graphics/Insets;)I
    .locals 0

    iget p0, p0, Landroid/graphics/Insets;->left:I

    return p0
.end method

.method public static bridge synthetic i(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;
    .locals 0

    check-cast p0, Landroid/app/ApplicationExitInfo;

    return-object p0
.end method

.method public static bridge synthetic j(Landroid/graphics/Insets;)I
    .locals 0

    iget p0, p0, Landroid/graphics/Insets;->top:I

    return p0
.end method

.method public static bridge synthetic k(Landroid/graphics/Insets;)I
    .locals 0

    iget p0, p0, Landroid/graphics/Insets;->right:I

    return p0
.end method

.method public static bridge synthetic l(Landroid/graphics/Insets;)I
    .locals 0

    iget p0, p0, Landroid/graphics/Insets;->bottom:I

    return p0
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Constructor;
    .locals 5

    iget v0, p0, Los/a;->w:I

    const/4 v1, 0x0

    const-class v2, Lt9/n;

    packed-switch v0, :pswitch_data_0

    const-string v0, "androidx.media3.decoder.midi.MidiExtractor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v3, "androidx.media3.decoder.flac.FlacLibrary"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v4, "isAvailable"

    invoke-virtual {v3, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "androidx.media3.decoder.flac.FlacExtractor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    :cond_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v0, p1

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_6

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqc/p;

    iget-object v4, v3, Lqc/p;->q:Ljava/util/List;

    iget-object v7, v3, Lqc/p;->b:Lic/m0;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lic/g;

    :goto_1
    move-object v10, v4

    goto :goto_2

    :cond_0
    sget-object v4, Lic/g;->b:Lic/g;

    goto :goto_1

    :goto_2
    new-instance v5, Lic/n0;

    iget-object v4, v3, Lqc/p;->a:Ljava/lang/String;

    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v4

    const-string v8, "fromString(...)"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/util/HashSet;

    iget-object v9, v3, Lqc/p;->p:Ljava/util/List;

    check-cast v9, Ljava/util/Collection;

    invoke-direct {v8, v9}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v9, v3, Lqc/p;->c:Lic/g;

    iget v11, v3, Lqc/p;->h:I

    iget v12, v3, Lqc/p;->m:I

    iget-object v13, v3, Lqc/p;->g:Lic/e;

    iget-wide v14, v3, Lqc/p;->d:J

    move-object/from16 v28, v2

    const/16 p1, 0x0

    iget-wide v1, v3, Lqc/p;->e:J

    const-wide/16 v16, 0x0

    cmp-long v16, v1, v16

    if-eqz v16, :cond_1

    new-instance v6, Lic/l0;

    move-object/from16 v30, v4

    move-object/from16 v29, v5

    iget-wide v4, v3, Lqc/p;->f:J

    invoke-direct {v6, v1, v2, v4, v5}, Lic/l0;-><init>(JJ)V

    goto :goto_3

    :cond_1
    move-object/from16 v30, v4

    move-object/from16 v29, v5

    move-object/from16 v6, p1

    :goto_3
    sget-object v4, Lic/m0;->w:Lic/m0;

    if-ne v7, v4, :cond_4

    sget-object v5, Lqc/q;->z:Ljava/lang/String;

    if-ne v7, v4, :cond_2

    if-lez v11, :cond_2

    move v4, v12

    move v12, v11

    const/4 v11, 0x1

    :goto_4
    move-object/from16 v18, v13

    goto :goto_5

    :cond_2
    move v4, v12

    move v12, v11

    const/4 v11, 0x0

    goto :goto_4

    :goto_5
    iget-object v13, v3, Lqc/p;->i:Lic/a;

    move-wide/from16 v20, v14

    iget-wide v14, v3, Lqc/p;->j:J

    move-object/from16 v31, v6

    iget-wide v5, v3, Lqc/p;->k:J

    move-object/from16 v32, v0

    iget v0, v3, Lqc/p;->l:I

    if-eqz v16, :cond_3

    const/16 v19, 0x1

    :goto_6
    move-wide/from16 v24, v1

    move v2, v0

    goto :goto_7

    :cond_3
    const/16 v19, 0x0

    goto :goto_6

    :goto_7
    iget-wide v0, v3, Lqc/p;->f:J

    move-wide/from16 v22, v0

    iget-wide v0, v3, Lqc/p;->n:J

    move-wide/from16 v26, v0

    move-wide/from16 v16, v5

    move-object/from16 v0, v18

    move/from16 v18, v2

    invoke-static/range {v11 .. v27}, Lge3/g;->j(ZILic/a;JJIZJJJJ)J

    move-result-wide v1

    :goto_8
    move-wide/from16 v17, v1

    goto :goto_9

    :cond_4
    move-object/from16 v32, v0

    move-object/from16 v31, v6

    move v4, v12

    move-object v0, v13

    move-wide/from16 v20, v14

    move v12, v11

    const-wide v1, 0x7fffffffffffffffL

    goto :goto_8

    :goto_9
    iget v1, v3, Lqc/p;->o:I

    move-object v13, v0

    move/from16 v19, v1

    move v11, v12

    move-wide/from16 v14, v20

    move-object/from16 v5, v29

    move-object/from16 v6, v30

    move-object/from16 v16, v31

    move v12, v4

    invoke-direct/range {v5 .. v19}, Lic/n0;-><init>(Ljava/util/UUID;Lic/m0;Ljava/util/HashSet;Lic/g;Lic/g;IILic/e;JLic/l0;JI)V

    move-object/from16 v0, v28

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v2, v0

    move-object/from16 v0, v32

    goto/16 :goto_0

    :cond_5
    move-object v0, v2

    return-object v0

    :cond_6
    const/16 p1, 0x0

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lod1/u$a;

    invoke-static {p1}, Lcom/whoop/realtime/service/b;->c(Lod1/u$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public c(Lfs/k;)Lcom/google/crypto/tink/internal/l0;
    .locals 5

    iget v0, p0, Los/a;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lqs/l;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/q2;->F()Lvs/p2;

    move-result-object v1

    invoke-static {}, Lvs/s2;->E()Lvs/r2;

    move-result-object v2

    iget v3, p1, Lqs/l;->b:I

    invoke-virtual {v2, v3}, Lvs/r2;->h(I)V

    sget-object v3, Lrs/d;->b:Lwe/o;

    iget-object v4, p1, Lqs/l;->d:Lqs/j;

    invoke-virtual {v3, v4}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v3

    check-cast v3, Lvs/g2;

    invoke-virtual {v2, v3}, Lvs/r2;->g(Lvs/g2;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v2

    check-cast v2, Lvs/s2;

    invoke-virtual {v1, v2}, Lvs/p2;->h(Lvs/s2;)V

    iget v2, p1, Lqs/l;->a:I

    invoke-virtual {v1, v2}, Lvs/p2;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/q2;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object v1, Lrs/d;->a:Lwe/o;

    iget-object p1, p1, Lqs/l;->c:Lqs/k;

    invoke-virtual {v1, p1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p1

    check-cast p1, Lvs/h4;

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lqs/d;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/d;->D()Lvs/c;

    move-result-object v1

    invoke-static {}, Lvs/f;->C()Lvs/e;

    move-result-object v2

    iget v3, p1, Lqs/d;->b:I

    invoke-virtual {v2, v3}, Lvs/e;->g(I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v2

    check-cast v2, Lvs/f;

    invoke-virtual {v1, v2}, Lvs/c;->h(Lvs/f;)V

    iget v2, p1, Lqs/d;->a:I

    invoke-virtual {v1, v2}, Lvs/c;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/d;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lqs/d;->c:Lqs/c;

    invoke-static {p1}, Lrs/a;->a(Lqs/c;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lns/f;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/p1;->B()Lvs/o1;

    move-result-object v1

    invoke-static {p1}, Los/b;->c(Lns/f;)Lvs/r1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/o1;->g(Lvs/r1;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/p1;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object v1, Los/b;->g:Lwe/o;

    iget-object p1, p1, Lns/f;->d:Lns/e;

    invoke-virtual {v1, p1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p1

    check-cast p1, Lvs/h4;

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method

.method public d(Lts/o;)Lcom/google/crypto/tink/internal/k0;
    .locals 6

    iget v0, p0, Los/a;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lqs/h;

    invoke-static {}, Lvs/o2;->G()Lvs/n2;

    move-result-object v0

    iget-object v1, p1, Lqs/h;->b:Lqs/l;

    invoke-static {}, Lvs/s2;->E()Lvs/r2;

    move-result-object v2

    iget v3, v1, Lqs/l;->b:I

    invoke-virtual {v2, v3}, Lvs/r2;->h(I)V

    sget-object v3, Lrs/d;->b:Lwe/o;

    iget-object v1, v1, Lqs/l;->d:Lqs/j;

    invoke-virtual {v3, v1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/g2;

    invoke-virtual {v2, v1}, Lvs/r2;->g(Lvs/g2;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/s2;

    invoke-virtual {v0, v1}, Lvs/n2;->h(Lvs/s2;)V

    iget-object v1, p1, Lqs/h;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/n2;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/o2;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Lrs/d;->a:Lwe/o;

    iget-object v2, p1, Lqs/h;->b:Lqs/l;

    iget-object v2, v2, Lqs/l;->c:Lqs/k;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    iget-object p1, p1, Lqs/h;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lqs/a;

    invoke-static {}, Lvs/b;->F()Lvs/a;

    move-result-object v0

    iget-object v1, p1, Lqs/a;->b:Lqs/d;

    invoke-static {}, Lvs/f;->C()Lvs/e;

    move-result-object v2

    iget v1, v1, Lqs/d;->b:I

    invoke-virtual {v2, v1}, Lvs/e;->g(I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/f;

    invoke-virtual {v0, v1}, Lvs/a;->h(Lvs/f;)V

    iget-object v1, p1, Lqs/a;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/a;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lqs/a;->b:Lqs/d;

    iget-object v1, v1, Lqs/d;->c:Lqs/c;

    invoke-static {v1}, Lrs/a;->a(Lqs/c;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lqs/a;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lns/g;

    invoke-static {}, Lvs/t1;->G()Lvs/s1;

    move-result-object v0

    invoke-virtual {v0}, Lvs/s1;->i()V

    iget-object v1, p1, Lns/g;->b:Lns/h;

    invoke-static {v1}, Los/b;->d(Lns/h;)Lvs/v1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/s1;->h(Lvs/v1;)V

    iget-object v1, p1, Lns/g;->b:Lns/h;

    iget-object v1, v1, Lns/h;->b:Lns/f;

    iget-object v2, v1, Lns/f;->a:Lns/b;

    sget-object v3, Lns/b;->e:Lns/b;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    sget-object v4, Lfs/p;->a:Lfs/p;

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget-object v2, p1, Lns/g;->d:Lro/i;

    invoke-virtual {v2, v4}, Lro/i;->F(Lfs/p;)[B

    move-result-object v2

    array-length v3, v2

    invoke-static {v2, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Lvs/s1;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Los/b;->b(Lns/b;)I

    move-result v2

    iget-object v3, p1, Lns/g;->c:Lro/i;

    invoke-virtual {v3, v4}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/crypto/tink/internal/a;->w(ILjava/math/BigInteger;)[B

    move-result-object v2

    array-length v3, v2

    invoke-static {v2, v5, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Lvs/s1;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    :goto_0
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/t1;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v2, Los/b;->g:Lwe/o;

    iget-object v1, v1, Lns/f;->d:Lns/e;

    invoke-virtual {v2, v1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    invoke-virtual {p1}, Lgs/b;->z()Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    sget-object v3, Lvs/l3;->z:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_2
    check-cast p1, Lns/h;

    invoke-static {p1}, Los/b;->d(Lns/h;)Lvs/v1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Los/b;->g:Lwe/o;

    iget-object v2, p1, Lns/h;->b:Lns/f;

    iget-object v2, v2, Lns/f;->d:Lns/e;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    iget-object p1, p1, Lns/h;->f:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"

    sget-object v3, Lvs/l3;->E:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x4 -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Lcom/google/crypto/tink/internal/k0;)Lts/o;
    .locals 6

    iget v0, p0, Los/a;->w:I

    sparse-switch v0, :sswitch_data_0

    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/o2;->H(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/o2;

    move-result-object v1

    invoke-virtual {v1}, Lvs/o2;->F()I

    move-result v2

    if-nez v2, :cond_0

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v2

    invoke-virtual {v1}, Lvs/o2;->D()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lzt/q;->x:Ljava/lang/Object;

    invoke-virtual {v1}, Lvs/o2;->E()Lvs/s2;

    move-result-object v3

    invoke-virtual {v3}, Lvs/s2;->D()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lzt/q;->y:Ljava/lang/Object;

    sget-object v3, Lrs/d;->b:Lwe/o;

    invoke-virtual {v1}, Lvs/o2;->E()Lvs/s2;

    move-result-object v4

    invoke-virtual {v4}, Lvs/s2;->C()Lvs/g2;

    move-result-object v4

    invoke-virtual {v3, v4}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqs/j;

    iput-object v3, v2, Lzt/q;->z:Ljava/lang/Object;

    sget-object v3, Lrs/d;->a:Lwe/o;

    iget-object v4, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v4, Lvs/h4;

    invoke-virtual {v3, v4}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqs/k;

    iput-object v3, v2, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v2}, Lzt/q;->n()Lqs/l;

    move-result-object v2

    new-instance v3, Lq30/w0;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v3, v2}, Lq30/w0;->G(Lqs/l;)V

    invoke-virtual {v1}, Lvs/o2;->D()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-virtual {v3, v0}, Lq30/w0;->D(Lro/i;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v3}, Lq30/w0;->h()Lqs/h;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing HmacKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to HmacProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_0
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_1
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/b;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/b;

    move-result-object v1

    invoke-virtual {v1}, Lvs/b;->E()I

    move-result v2

    if-nez v2, :cond_2

    invoke-static {}, Lqs/d;->b()La3/p;

    move-result-object v2

    invoke-virtual {v1}, Lvs/b;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v3

    invoke-virtual {v2, v3}, La3/p;->S(I)V

    invoke-virtual {v1}, Lvs/b;->D()Lvs/f;

    move-result-object v3

    invoke-virtual {v3}, Lvs/f;->B()I

    move-result v3

    invoke-virtual {v2, v3}, La3/p;->V(I)V

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-static {v3}, Lrs/a;->b(Lvs/h4;)Lqs/c;

    move-result-object v3

    iput-object v3, v2, La3/p;->z:Ljava/lang/Object;

    invoke-virtual {v2}, La3/p;->o()Lqs/d;

    move-result-object v2

    new-instance v3, Lq30/w0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v3, v2}, Lq30/w0;->F(Lqs/d;)V

    invoke-virtual {v1}, Lvs/b;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-virtual {v3, v0}, Lq30/w0;->B(Lro/i;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v3}, Lq30/w0;->g()Lqs/a;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesCmacKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesCmacProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_1
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    const-string v3, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    :try_start_2
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v3

    invoke-static {v1, v3}, Lvs/t1;->H(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/t1;

    move-result-object v1

    invoke-virtual {v1}, Lvs/t1;->F()I

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v1}, Lvs/t1;->E()Lvs/v1;

    move-result-object v3

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast p1, Lvs/h4;

    invoke-virtual {v3}, Lvs/v1;->F()Lvs/r1;

    move-result-object v4

    invoke-static {p1, v4}, Los/b;->a(Lvs/h4;Lvs/r1;)Lns/f;

    move-result-object p1

    iget-object v4, p1, Lns/f;->a:Lns/b;

    sget-object v5, Lns/b;->e:Lns/b;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Lvs/v1;->H()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v3

    invoke-static {v3}, Lct/a;->a([B)Lct/a;

    move-result-object v3

    invoke-static {p1, v3, v2}, Lns/h;->Y(Lns/f;Lct/a;Ljava/lang/Integer;)Lns/h;

    move-result-object p1

    invoke-virtual {v1}, Lvs/t1;->D()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-static {p1, v0}, Lns/g;->Y(Lns/h;Lro/i;)Lns/g;

    move-result-object p1

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/security/spec/ECPoint;

    invoke-virtual {v3}, Lvs/v1;->H()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v4

    invoke-static {v4}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3}, Lvs/v1;->I()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v3

    invoke-static {v3}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v0, v4, v3}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-static {p1, v0, v2}, Lns/h;->Z(Lns/f;Ljava/security/spec/ECPoint;Ljava/lang/Integer;)Lns/h;

    move-result-object p1

    invoke-virtual {v1}, Lvs/t1;->D()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object v0

    invoke-static {p1, v0}, Lns/g;->Z(Lns/h;Lro/i;)Lns/g;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing EcdsaPrivateKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_2
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    :try_start_3
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v0, v2}, Lvs/v1;->K(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/v1;

    move-result-object v0

    invoke-virtual {v0}, Lvs/v1;->G()I

    move-result v2

    if-nez v2, :cond_9

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast p1, Lvs/h4;

    invoke-virtual {v0}, Lvs/v1;->F()Lvs/r1;

    move-result-object v2

    invoke-static {p1, v2}, Los/b;->a(Lvs/h4;Lvs/r1;)Lns/f;

    move-result-object p1

    iget-object v2, p1, Lns/f;->a:Lns/b;

    sget-object v3, Lns/b;->e:Lns/b;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Lvs/v1;->I()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v0}, Lvs/v1;->H()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v0

    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    move-result-object v0

    invoke-static {p1, v0, v1}, Lns/h;->Y(Lns/f;Lct/a;Ljava/lang/Integer;)Lns/h;

    move-result-object p1

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Y must be empty for X25519 points"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance v2, Ljava/security/spec/ECPoint;

    invoke-virtual {v0}, Lvs/v1;->H()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v3

    invoke-static {v3}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lvs/v1;->I()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-static {p1, v2, v1}, Lns/h;->Z(Lns/f;Ljava/security/spec/ECPoint;Ljava/lang/Integer;)Lns/h;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing EcdsaPublicKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to EciesProtoSerialization.parsePublicKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_2
        0x5 -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
.end method

.method public g(Lcom/google/crypto/tink/internal/l0;)Lfs/k;
    .locals 3

    iget v0, p0, Los/a;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/q2;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/q2;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lvs/q2;->E()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v1

    invoke-virtual {v0}, Lvs/q2;->C()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lzt/q;->x:Ljava/lang/Object;

    invoke-virtual {v0}, Lvs/q2;->D()Lvs/s2;

    move-result-object v2

    invoke-virtual {v2}, Lvs/s2;->D()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lzt/q;->y:Ljava/lang/Object;

    sget-object v2, Lrs/d;->b:Lwe/o;

    invoke-virtual {v0}, Lvs/q2;->D()Lvs/s2;

    move-result-object v0

    invoke-virtual {v0}, Lvs/s2;->C()Lvs/g2;

    move-result-object v0

    invoke-virtual {v2, v0}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqs/j;

    iput-object v0, v1, Lzt/q;->z:Ljava/lang/Object;

    sget-object v0, Lrs/d;->a:Lwe/o;

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqs/k;

    iput-object p1, v1, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v1}, Lzt/q;->n()Lqs/l;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Parsing HmacParameters failed: unknown Version "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lvs/q2;->E()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing HmacParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to HmacProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/d;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/d;

    move-result-object v0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-static {}, Lqs/d;->b()La3/p;

    move-result-object v1

    invoke-virtual {v0}, Lvs/d;->B()I

    move-result v2

    invoke-virtual {v1, v2}, La3/p;->S(I)V

    invoke-virtual {v0}, Lvs/d;->C()Lvs/f;

    move-result-object v0

    invoke-virtual {v0}, Lvs/f;->B()I

    move-result v0

    invoke-virtual {v1, v0}, La3/p;->V(I)V

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lrs/a;->b(Lvs/h4;)Lqs/c;

    move-result-object p1

    iput-object p1, v1, La3/p;->z:Ljava/lang/Object;

    invoke-virtual {v1}, La3/p;->o()Lqs/d;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesCmacParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to AesCmacProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_1
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/p1;->C(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/p1;

    move-result-object v0
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_2

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-virtual {v0}, Lvs/p1;->A()Lvs/r1;

    move-result-object v0

    invoke-static {p1, v0}, Los/b;->a(Lvs/h4;Lvs/r1;)Lns/f;

    move-result-object p1

    return-object p1

    :catch_2
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing EciesParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to EciesProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public h(Lts/o;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Los/a;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast p1, Lcom/google/crypto/tink/internal/q;

    invoke-static {p1}, Lrs/e;->a(Lcom/google/crypto/tink/internal/q;)Lrs/e;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lqs/h;

    invoke-static {p1}, Lat/z;->c(Lqs/h;)Lat/z;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance v0, Lrs/c;

    check-cast p1, Lqs/h;

    const/4 p1, 0x1

    invoke-direct {v0, p1}, Lrs/c;-><init>(I)V

    return-object v0

    :pswitch_3
    check-cast p1, Lqs/a;

    iget-object v0, p1, Lqs/a;->b:Lqs/d;

    iget v0, v0, Lqs/d;->a:I

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lat/z;->b(Lqs/a;)Lat/z;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    check-cast p1, Lqs/a;

    iget-object p1, p1, Lqs/a;->b:Lqs/d;

    iget p1, p1, Lqs/d;->a:I

    const/16 v0, 0x20

    if-ne p1, v0, :cond_1

    new-instance p1, Lrs/c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lrs/c;-><init>(I)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_5
    check-cast p1, Lns/p;

    invoke-static {p1}, Lns/s;->b(Lns/p;)Lns/s;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lns/n;

    invoke-static {p1}, Lat/k;->c(Lns/n;)Lat/k;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
