.class public final Lb30/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:Ls20/a;

.field public final d:Ljava/util/List;

.field public final e:Lq20/y;

.field public final f:Z

.field public final g:Z

.field public final h:Lq20/c;

.field public final i:Lt20/n;

.field public final j:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ls20/a;Ljava/util/List;Lq20/y;ZZLq20/c;Lt20/n;)V
    .locals 1

    const-string v0, "selectedPaymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formElements"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usBankAccountFormArguments"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lb30/b;->b:Ljava/util/List;

    iput-object p3, p0, Lb30/b;->c:Ls20/a;

    iput-object p4, p0, Lb30/b;->d:Ljava/util/List;

    iput-object p5, p0, Lb30/b;->e:Lq20/y;

    iput-boolean p6, p0, Lb30/b;->f:Z

    iput-boolean p7, p0, Lb30/b;->g:Z

    iput-object p8, p0, Lb30/b;->h:Lq20/c;

    iput-object p9, p0, Lb30/b;->i:Lt20/n;

    check-cast p4, Ljava/lang/Iterable;

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg40/i1;

    iget-boolean p3, p0, Lb30/b;->g:Z

    invoke-interface {p2, p3}, Lg40/i1;->b(Z)V

    goto :goto_0

    :cond_0
    check-cast p4, Ljava/util/List;

    iput-object p4, p0, Lb30/b;->j:Ljava/util/List;

    return-void
.end method

.method public static a(Lb30/b;Ljava/lang/String;Ls20/a;Ljava/util/List;Lq20/y;ZLt20/n;I)Lb30/b;
    .locals 10

    move/from16 v0, p7

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lb30/b;->a:Ljava/lang/String;

    :cond_0
    move-object v1, p1

    iget-object v2, p0, Lb30/b;->b:Ljava/util/List;

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_1

    iget-object p2, p0, Lb30/b;->c:Ls20/a;

    :cond_1
    move-object v3, p2

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_2

    iget-object p1, p0, Lb30/b;->d:Ljava/util/List;

    move-object v4, p1

    goto :goto_0

    :cond_2
    move-object v4, p3

    :goto_0
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_3

    iget-object p1, p0, Lb30/b;->e:Lq20/y;

    move-object v5, p1

    goto :goto_1

    :cond_3
    move-object v5, p4

    :goto_1
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lb30/b;->f:Z

    move v6, p1

    goto :goto_2

    :cond_4
    move v6, p5

    :goto_2
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_5

    iget-boolean p1, p0, Lb30/b;->g:Z

    :goto_3
    move v7, p1

    goto :goto_4

    :cond_5
    const/4 p1, 0x1

    goto :goto_3

    :goto_4
    iget-object v8, p0, Lb30/b;->h:Lq20/c;

    and-int/lit16 p1, v0, 0x100

    if-eqz p1, :cond_6

    iget-object p1, p0, Lb30/b;->i:Lt20/n;

    move-object v9, p1

    goto :goto_5

    :cond_6
    move-object/from16 v9, p6

    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "selectedPaymentMethodCode"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "arguments"

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "formElements"

    invoke-static {v4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "usBankAccountFormArguments"

    invoke-static {v9, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30/b;

    invoke-direct/range {v0 .. v9}, Lb30/b;-><init>(Ljava/lang/String;Ljava/util/List;Ls20/a;Ljava/util/List;Lq20/y;ZZLq20/c;Lt20/n;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb30/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb30/b;

    iget-object v1, p0, Lb30/b;->a:Ljava/lang/String;

    iget-object v3, p1, Lb30/b;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lb30/b;->b:Ljava/util/List;

    iget-object v3, p1, Lb30/b;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lb30/b;->c:Ls20/a;

    iget-object v3, p1, Lb30/b;->c:Ls20/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lb30/b;->d:Ljava/util/List;

    iget-object v3, p1, Lb30/b;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lb30/b;->e:Lq20/y;

    iget-object v3, p1, Lb30/b;->e:Lq20/y;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lb30/b;->f:Z

    iget-boolean v3, p1, Lb30/b;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lb30/b;->g:Z

    iget-boolean v3, p1, Lb30/b;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lb30/b;->h:Lq20/c;

    iget-object v3, p1, Lb30/b;->h:Lq20/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lb30/b;->i:Lt20/n;

    iget-object p1, p1, Lb30/b;->i:Lt20/n;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lb30/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lb30/b;->b:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lb30/b;->c:Ls20/a;

    invoke-virtual {v2}, Ls20/a;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lb30/b;->d:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lb30/b;->e:Lq20/y;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lb30/b;->f:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lb30/b;->g:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lb30/b;->h:Lq20/c;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lq20/c;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lb30/b;->i:Lt20/n;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", supportedPaymentMethods="

    const-string v1, ", arguments="

    const-string v2, "State(selectedPaymentMethodCode="

    iget-object v3, p0, Lb30/b;->a:Ljava/lang/String;

    iget-object v4, p0, Lb30/b;->b:Ljava/util/List;

    invoke-static {v2, v3, v0, v1, v4}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lb30/b;->c:Ls20/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", formElements="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/b;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/b;->e:Lq20/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", processing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lb30/b;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", validating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lb30/b;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", incentive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/b;->h:Lq20/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", usBankAccountFormArguments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb30/b;->i:Lt20/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
