.class public final Lj00/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj00/i0;

.field public final b:Ljava/lang/String;

.field public final c:Lj00/d0;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/Set;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Ln00/d;

.field public final l:Z


# direct methods
.method public constructor <init>(Lj00/i0;Ljava/lang/String;Lj00/d0;Ljava/util/List;Ljava/util/Set;ZZZZZLn00/d;Z)V
    .locals 1

    const-string v0, "merchantName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj00/k;->a:Lj00/i0;

    iput-object p2, p0, Lj00/k;->b:Ljava/lang/String;

    iput-object p3, p0, Lj00/k;->c:Lj00/d0;

    iput-object p4, p0, Lj00/k;->d:Ljava/util/List;

    iput-object p5, p0, Lj00/k;->e:Ljava/util/Set;

    iput-boolean p6, p0, Lj00/k;->f:Z

    iput-boolean p7, p0, Lj00/k;->g:Z

    iput-boolean p8, p0, Lj00/k;->h:Z

    iput-boolean p9, p0, Lj00/k;->i:Z

    iput-boolean p10, p0, Lj00/k;->j:Z

    iput-object p11, p0, Lj00/k;->k:Ln00/d;

    iput-boolean p12, p0, Lj00/k;->l:Z

    return-void
.end method

.method public static a(Lj00/k;Lj00/i0;ZZLn00/d;I)Lj00/k;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p5

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lj00/k;->a:Lj00/i0;

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    iget-object v5, v0, Lj00/k;->b:Ljava/lang/String;

    iget-object v6, v0, Lj00/k;->c:Lj00/d0;

    iget-object v7, v0, Lj00/k;->d:Ljava/util/List;

    iget-object v8, v0, Lj00/k;->e:Ljava/util/Set;

    iget-boolean v9, v0, Lj00/k;->f:Z

    iget-boolean v10, v0, Lj00/k;->g:Z

    and-int/lit16 v2, v1, 0x80

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    iget-boolean v2, v0, Lj00/k;->h:Z

    move v11, v2

    goto :goto_1

    :cond_1
    move v11, v3

    :goto_1
    and-int/lit16 v2, v1, 0x100

    if-eqz v2, :cond_2

    iget-boolean v2, v0, Lj00/k;->i:Z

    move v12, v2

    goto :goto_2

    :cond_2
    move/from16 v12, p2

    :goto_2
    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_3

    iget-boolean v2, v0, Lj00/k;->j:Z

    move v13, v2

    goto :goto_3

    :cond_3
    move/from16 v13, p3

    :goto_3
    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_4

    iget-object v2, v0, Lj00/k;->k:Ln00/d;

    move-object v14, v2

    goto :goto_4

    :cond_4
    move-object/from16 v14, p4

    :goto_4
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_5

    iget-boolean v3, v0, Lj00/k;->l:Z

    :cond_5
    move v15, v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "merchantName"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lj00/k;

    invoke-direct/range {v3 .. v15}, Lj00/k;-><init>(Lj00/i0;Ljava/lang/String;Lj00/d0;Ljava/util/List;Ljava/util/Set;ZZZZZLn00/d;Z)V

    return-object v3
.end method


# virtual methods
.method public final b()Z
    .locals 5

    iget-boolean v0, p0, Lj00/k;->j:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, -0x1

    iget-object v2, p0, Lj00/k;->c:Lj00/d0;

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_0

    :cond_1
    sget-object v3, Lj00/j;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_0
    if-eq v2, v0, :cond_8

    iget-object v0, p0, Lj00/k;->a:Lj00/i0;

    const/4 v3, 0x1

    if-eq v2, v3, :cond_7

    const/4 v4, 0x2

    if-ne v2, v4, :cond_6

    iget-boolean v2, p0, Lj00/k;->g:Z

    iget-boolean v4, p0, Lj00/k;->i:Z

    if-eqz v2, :cond_3

    if-eqz v0, :cond_2

    if-eqz v4, :cond_2

    return v3

    :cond_2
    return v1

    :cond_3
    iget-boolean v2, p0, Lj00/k;->f:Z

    if-eqz v2, :cond_5

    if-eqz v0, :cond_4

    return v3

    :cond_4
    return v1

    :cond_5
    return v4

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    if-eqz v0, :cond_8

    return v3

    :cond_8
    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj00/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj00/k;

    iget-object v1, p0, Lj00/k;->a:Lj00/i0;

    iget-object v3, p1, Lj00/k;->a:Lj00/i0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lj00/k;->b:Ljava/lang/String;

    iget-object v3, p1, Lj00/k;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj00/k;->c:Lj00/d0;

    iget-object v3, p1, Lj00/k;->c:Lj00/d0;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lj00/k;->d:Ljava/util/List;

    iget-object v3, p1, Lj00/k;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lj00/k;->e:Ljava/util/Set;

    iget-object v3, p1, Lj00/k;->e:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lj00/k;->f:Z

    iget-boolean v3, p1, Lj00/k;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lj00/k;->g:Z

    iget-boolean v3, p1, Lj00/k;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lj00/k;->h:Z

    iget-boolean v3, p1, Lj00/k;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lj00/k;->i:Z

    iget-boolean v3, p1, Lj00/k;->i:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lj00/k;->j:Z

    iget-boolean v3, p1, Lj00/k;->j:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lj00/k;->k:Ln00/d;

    iget-object v3, p1, Lj00/k;->k:Ln00/d;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lj00/k;->l:Z

    iget-boolean p1, p1, Lj00/k;->l:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lj00/k;->a:Lj00/i0;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Lj00/k;->b:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v1

    iget-object v3, p0, Lj00/k;->c:Lj00/d0;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lj00/k;->d:Ljava/util/List;

    invoke-static {v1, v2, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lj00/k;->e:Ljava/util/Set;

    invoke-static {v1, v0, v2}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-boolean v1, p0, Lj00/k;->f:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lj00/k;->g:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lj00/k;->h:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lj00/k;->i:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lj00/k;->j:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lj00/k;->k:Ln00/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-boolean v0, p0, Lj00/k;->l:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InlineSignupViewState(userInput="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lj00/k;->a:Lj00/i0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", merchantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj00/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", signupMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj00/k;->c:Lj00/d0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj00/k;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", prefillEligibleFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj00/k;->e:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowsDefaultOptIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lj00/k;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", linkSignUpOptInFeatureEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", didAskToChangeSignupDetails="

    const-string v2, ", isExpanded="

    iget-boolean v3, p0, Lj00/k;->g:Z

    iget-boolean v4, p0, Lj00/k;->h:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", apiFailed="

    const-string v2, ", signUpState="

    iget-boolean v3, p0, Lj00/k;->i:Z

    iget-boolean v4, p0, Lj00/k;->j:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    iget-object v1, p0, Lj00/k;->k:Ln00/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userHasInteracted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lj00/k;->l:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
