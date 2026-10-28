.class public final Lkotlin/jvm/internal/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj93/a0;


# instance fields
.field public final w:Lj93/e;

.field public final x:Ljava/util/List;

.field public final y:Lj93/a0;

.field public final z:I


# direct methods
.method public constructor <init>(Lj93/e;Ljava/util/List;Lj93/a0;I)V
    .locals 1

    const-string v0, "classifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlin/jvm/internal/n0;->w:Lj93/e;

    .line 3
    iput-object p2, p0, Lkotlin/jvm/internal/n0;->x:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lkotlin/jvm/internal/n0;->y:Lj93/a0;

    .line 5
    iput p4, p0, Lkotlin/jvm/internal/n0;->z:I

    return-void
.end method

.method public constructor <init>(Lj93/e;Ljava/util/List;Z)V
    .locals 1

    const-string v0, "classifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, v0, p3}, Lkotlin/jvm/internal/n0;-><init>(Lj93/e;Ljava/util/List;Lj93/a0;I)V

    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lkotlin/jvm/internal/n0;->w:Lj93/e;

    instance-of v1, v0, Lj93/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lj93/d;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-static {v1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v2

    :cond_1
    if-nez v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_1

    :cond_2
    iget v1, p0, Lkotlin/jvm/internal/n0;->z:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    const-string p1, "kotlin.Nothing"

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_c

    const-class p1, [Z

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "kotlin.BooleanArray"

    goto/16 :goto_1

    :cond_4
    const-class p1, [C

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "kotlin.CharArray"

    goto :goto_1

    :cond_5
    const-class p1, [B

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, "kotlin.ByteArray"

    goto :goto_1

    :cond_6
    const-class p1, [S

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p1, "kotlin.ShortArray"

    goto :goto_1

    :cond_7
    const-class p1, [I

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "kotlin.IntArray"

    goto :goto_1

    :cond_8
    const-class p1, [F

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "kotlin.FloatArray"

    goto :goto_1

    :cond_9
    const-class p1, [J

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    const-string p1, "kotlin.LongArray"

    goto :goto_1

    :cond_a
    const-class p1, [D

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    const-string p1, "kotlin.DoubleArray"

    goto :goto_1

    :cond_b
    const-string p1, "kotlin.Array"

    goto :goto_1

    :cond_c
    if-eqz p1, :cond_d

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result p1

    if-eqz p1, :cond_d

    check-cast v0, Lj93/d;

    invoke-static {v0}, Ljc/x;->T(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    :goto_1
    iget-object v0, p0, Lkotlin/jvm/internal/n0;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_e

    move-object v0, v2

    goto :goto_2

    :cond_e
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    new-instance v7, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v0, 0x11

    invoke-direct {v7, p0, v0}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    const/16 v8, 0x18

    const-string v4, ", "

    const-string v5, "<"

    const-string v6, ">"

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p0}, Lkotlin/jvm/internal/n0;->isMarkedNullable()Z

    move-result v1

    if-eqz v1, :cond_f

    const-string v2, "?"

    :cond_f
    invoke-static {p1, v0, v2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lkotlin/jvm/internal/n0;->y:Lj93/a0;

    instance-of v1, v0, Lkotlin/jvm/internal/n0;

    if-eqz v1, :cond_12

    check-cast v0, Lkotlin/jvm/internal/n0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/n0;->a(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_3

    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x21

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_11
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_12
    :goto_3
    return-object p1
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lkotlin/jvm/internal/n0;->z:I

    return v0
.end method

.method public final c()Lj93/a0;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/n0;->y:Lj93/a0;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lkotlin/jvm/internal/n0;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlin/jvm/internal/n0;

    iget-object v0, p1, Lkotlin/jvm/internal/n0;->w:Lj93/e;

    iget-object v1, p0, Lkotlin/jvm/internal/n0;->w:Lj93/e;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkotlin/jvm/internal/n0;->x:Ljava/util/List;

    iget-object v1, p1, Lkotlin/jvm/internal/n0;->x:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkotlin/jvm/internal/n0;->y:Lj93/a0;

    iget-object v1, p1, Lkotlin/jvm/internal/n0;->y:Lj93/a0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lkotlin/jvm/internal/n0;->z:I

    iget p1, p1, Lkotlin/jvm/internal/n0;->z:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final getArguments()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/n0;->x:Ljava/util/List;

    return-object v0
.end method

.method public final getClassifier()Lj93/e;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/n0;->w:Lj93/e;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lkotlin/jvm/internal/n0;->w:Lj93/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lkotlin/jvm/internal/n0;->x:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v1, p0, Lkotlin/jvm/internal/n0;->z:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isMarkedNullable()Z
    .locals 2

    iget v0, p0, Lkotlin/jvm/internal/n0;->z:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lkotlin/jvm/internal/n0;->a(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (Kotlin reflection is not available)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
