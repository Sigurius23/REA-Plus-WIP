.class public final Lm80/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ/\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000f2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J-\u0010\u0013\u001a\u00020\u000f2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lm80/b;",
        "",
        "Lb91/d;",
        "whoopTypography",
        "Ly81/i;",
        "whoopColors",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lb91/d;Ly81/i;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "",
        "",
        "paragraphs",
        "userEnteredEmail",
        "suggestedEmail",
        "Ll3/g;",
        "a",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ll3/g;",
        "d",
        "e",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ll3/m0;",
        "b",
        "Ll3/m0;",
        "neutralStyle",
        "c",
        "emailStyle",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final b:Ll3/m0;

.field private final c:Ll3/m0;


# direct methods
.method public constructor <init>(Lb91/d;Ly81/i;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "whoopTypography"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "whoopColors"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "featureFlagChecker"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lm80/b;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v13, v1, Ll3/m0;->f:Lp3/i;

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v8, v1, Ll3/m0;->b:J

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v11, v1, Ll3/m0;->d:Lp3/n;

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v10, v1, Ll3/m0;->c:Lp3/r;

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v12, v1, Ll3/m0;->e:Lp3/o;

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v14, v1, Ll3/m0;->g:Ljava/lang/String;

    new-instance v5, Ll3/m0;

    const/16 v23, 0x0

    const v24, 0xff80

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v5 .. v24}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    iput-object v5, v0, Lm80/b;->b:Ll3/m0;

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v7

    sget-object v11, Lp3/r;->I:Lp3/r;

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v14, v1, Ll3/m0;->f:Lp3/i;

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v9, v1, Ll3/m0;->b:J

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v12, v1, Ll3/m0;->d:Lp3/n;

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v13, v1, Ll3/m0;->e:Lp3/o;

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-object v15, v1, Ll3/m0;->g:Ljava/lang/String;

    new-instance v6, Ll3/m0;

    const/16 v24, 0x0

    const v25, 0xff80

    const-wide/16 v16, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    invoke-direct/range {v6 .. v25}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    iput-object v6, v0, Lm80/b;->c:Ll3/m0;

    return-void
.end method

.method private final a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ll3/g;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ll3/g;"
        }
    .end annotation

    new-instance v0, Ll3/d;

    invoke-direct {v0}, Ll3/d;-><init>()V

    new-instance v1, Lkotlin/jvm/internal/b0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v0, v1, p0, v2, p2}, Lm80/b;->c(Ll3/d;Lkotlin/jvm/internal/b0;Lm80/b;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_3

    invoke-static {p3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0, v1, p0, v2, p3}, Lm80/b;->c(Ll3/d;Lkotlin/jvm/internal/b0;Lm80/b;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    const/16 v3, 0x40

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v5, v4}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v3

    if-ltz v3, :cond_4

    const/4 v5, 0x1

    :cond_4
    invoke-static {v0, v1, p0, v2, v5}, Lm80/b;->b(Ll3/d;Lkotlin/jvm/internal/b0;Lm80/b;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Ll3/d;->k()Ll3/g;

    move-result-object p1

    return-object p1
.end method

.method private static final b(Ll3/d;Lkotlin/jvm/internal/b0;Lm80/b;Ljava/lang/String;Z)V
    .locals 1

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-boolean v0, p1, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v0, :cond_1

    if-eqz p4, :cond_1

    const-string v0, "\n"

    goto :goto_0

    :cond_1
    const-string v0, "\n\n"

    :goto_0
    invoke-virtual {p0, v0}, Ll3/d;->b(Ljava/lang/String;)V

    :cond_2
    if-eqz p4, :cond_3

    iget-object p2, p2, Lm80/b;->c:Ll3/m0;

    goto :goto_1

    :cond_3
    iget-object p2, p2, Lm80/b;->b:Ll3/m0;

    :goto_1
    invoke-virtual {p0, p2}, Ll3/d;->j(Ll3/m0;)I

    move-result p2

    :try_start_0
    invoke-virtual {p0, p3}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p2}, Ll3/d;->f(I)V

    iput-boolean p4, p1, Lkotlin/jvm/internal/b0;->w:Z

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p2}, Ll3/d;->f(I)V

    throw p1
.end method

.method private static final c(Ll3/d;Lkotlin/jvm/internal/b0;Lm80/b;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    invoke-static {p4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x2

    const/4 v2, 0x1

    invoke-static {p3, p4, v1, v2, v0}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    :goto_0
    return v1

    :cond_1
    invoke-virtual {p3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v0

    invoke-virtual {p3, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p4

    add-int/2addr p4, v0

    invoke-virtual {p3, p4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p4

    if-lez p4, :cond_2

    invoke-static {p0, p1, p2, v3, v1}, Lm80/b;->b(Ll3/d;Lkotlin/jvm/internal/b0;Lm80/b;Ljava/lang/String;Z)V

    :cond_2
    invoke-static {p0, p1, p2, v5, v2}, Lm80/b;->b(Ll3/d;Lkotlin/jvm/internal/b0;Lm80/b;Ljava/lang/String;Z)V

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p4

    if-lez p4, :cond_3

    invoke-static {p0, p1, p2, p3, v1}, Lm80/b;->b(Ll3/d;Lkotlin/jvm/internal/b0;Lm80/b;Ljava/lang/String;Z)V

    :cond_3
    return v2
.end method


# virtual methods
.method public final d(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ll3/g;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ll3/g;"
        }
    .end annotation

    const-string v0, "paragraphs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userEnteredEmail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm80/b;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->EMAIL_DIALOG_TEXT_STYLING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lm80/b;->e(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ll3/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Ll3/d;

    invoke-direct {p2}, Ll3/d;-><init>()V

    iget-object p3, p0, Lm80/b;->b:Ll3/m0;

    invoke-virtual {p2, p3}, Ll3/d;->j(Ll3/m0;)I

    move-result p3

    :try_start_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const-string v1, "\n\n"

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2, p3}, Ll3/d;->f(I)V

    invoke-virtual {p2}, Ll3/d;->k()Ll3/g;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p2, p3}, Ll3/d;->f(I)V

    throw p1
.end method

.method public final e(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ll3/g;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ll3/g;"
        }
    .end annotation

    const-string v0, "paragraphs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userEnteredEmail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lm80/b;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ll3/g;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p2, Ll3/d;

    invoke-direct {p2}, Ll3/d;-><init>()V

    iget-object p3, p0, Lm80/b;->b:Ll3/m0;

    invoke-virtual {p2, p3}, Ll3/d;->j(Ll3/m0;)I

    move-result p3

    :try_start_1
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const-string v1, "\n\n"

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p2, p3}, Ll3/d;->f(I)V

    invoke-virtual {p2}, Ll3/d;->k()Ll3/g;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p2, p3}, Ll3/d;->f(I)V

    throw p1
.end method
