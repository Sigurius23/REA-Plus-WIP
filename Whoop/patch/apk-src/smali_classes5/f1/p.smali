.class public final Lf1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq83/j;

.field public final b:Landroid/content/Context;

.field public final c:Lf1/s;

.field public final d:Ls3/b;

.field public final e:Lmc3/c;

.field public f:Landroid/view/textclassifier/TextClassifier;

.field public final g:Lp1/k1;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/j;Landroid/content/Context;Lf1/s;Ls3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/p;->a:Lq83/j;

    iput-object p2, p0, Lf1/p;->b:Landroid/content/Context;

    iput-object p3, p0, Lf1/p;->c:Lf1/s;

    iput-object p4, p0, Lf1/p;->d:Ls3/b;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lf1/p;->e:Lmc3/c;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lf1/p;->g:Lp1/k1;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/p;->h:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Lf1/p;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    iget-object v2, v0, Lf1/p;->g:Lp1/k1;

    iget-object v3, v0, Lf1/p;->e:Lmc3/c;

    instance-of v4, v1, Lf1/n;

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, Lf1/n;

    iget v5, v4, Lf1/n;->G:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lf1/n;->G:I

    goto :goto_0

    :cond_0
    new-instance v4, Lf1/n;

    invoke-direct {v4, v0, v1}, Lf1/n;-><init>(Lf1/p;Ls83/c;)V

    :goto_0
    iget-object v1, v4, Lf1/n;->E:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lf1/n;->G:I

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v6, :cond_3

    if-eq v6, v9, :cond_2

    if-ne v6, v8, :cond_1

    iget-wide v5, v4, Lf1/n;->z:J

    iget-object v3, v4, Lf1/n;->y:Lmc3/c;

    iget-object v0, v4, Lf1/n;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/textclassifier/TextClassification;

    iget-object v4, v4, Lf1/n;->w:Ljava/lang/CharSequence;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v11, v4, Lf1/n;->z:J

    iget-object v6, v4, Lf1/n;->y:Lmc3/c;

    iget-object v13, v4, Lf1/n;->x:Ljava/lang/Object;

    check-cast v13, Landroid/view/textclassifier/TextClassifier;

    iget-object v14, v4, Lf1/n;->w:Ljava/lang/CharSequence;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    iput-object v1, v4, Lf1/n;->w:Ljava/lang/CharSequence;

    move-object/from16 v6, p4

    iput-object v6, v4, Lf1/n;->x:Ljava/lang/Object;

    iput-object v3, v4, Lf1/n;->y:Lmc3/c;

    move-wide/from16 v11, p2

    iput-wide v11, v4, Lf1/n;->z:J

    iput v9, v4, Lf1/n;->G:I

    invoke-virtual {v3, v4}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v5, :cond_4

    goto :goto_4

    :cond_4
    move-object v14, v1

    move-object v13, v6

    move-object v6, v3

    :goto_1
    :try_start_0
    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf1/f1;

    if-eqz v1, :cond_6

    sget-object v15, Lf1/q;->a:Lp1/u2;

    iget-wide v8, v1, Lf1/f1;->b:J

    invoke-static {v11, v12, v8, v9}, Ll3/u0;->b(JJ)Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v1, v1, Lf1/f1;->a:Ljava/lang/CharSequence;

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    :goto_2
    const/4 v15, 0x1

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_5
    const/4 v1, 0x0

    goto :goto_2

    :goto_3
    if-ne v1, v15, :cond_6

    invoke-interface {v6, v10}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v7

    :cond_6
    invoke-interface {v6, v10}, Lmc3/a;->i(Ljava/lang/Object;)V

    new-instance v1, Landroid/view/textclassifier/TextClassification$Request$Builder;

    invoke-static {v11, v12}, Ll3/u0;->f(J)I

    move-result v6

    invoke-static {v11, v12}, Ll3/u0;->e(J)I

    move-result v8

    invoke-direct {v1, v14, v6, v8}, Landroid/view/textclassifier/TextClassification$Request$Builder;-><init>(Ljava/lang/CharSequence;II)V

    invoke-virtual {v0}, Lf1/p;->b()Landroid/os/LocaleList;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/textclassifier/TextClassification$Request$Builder;->setDefaultLocales(Landroid/os/LocaleList;)Landroid/view/textclassifier/TextClassification$Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/textclassifier/TextClassification$Request$Builder;->build()Landroid/view/textclassifier/TextClassification$Request;

    move-result-object v0

    invoke-interface {v13, v0}, Landroid/view/textclassifier/TextClassifier;->classifyText(Landroid/view/textclassifier/TextClassification$Request;)Landroid/view/textclassifier/TextClassification;

    move-result-object v0

    iput-object v14, v4, Lf1/n;->w:Ljava/lang/CharSequence;

    iput-object v0, v4, Lf1/n;->x:Ljava/lang/Object;

    iput-object v3, v4, Lf1/n;->y:Lmc3/c;

    iput-wide v11, v4, Lf1/n;->z:J

    const/4 v1, 0x2

    iput v1, v4, Lf1/n;->G:I

    invoke-virtual {v3, v4}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_7

    :goto_4
    return-object v5

    :cond_7
    move-wide v5, v11

    move-object v4, v14

    :goto_5
    :try_start_1
    new-instance v1, Lf1/f1;

    invoke-direct {v1, v4, v5, v6, v0}, Lf1/f1;-><init>(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)V

    invoke-virtual {v2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v3, v10}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v7

    :catchall_1
    move-exception v0

    invoke-interface {v3, v10}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :goto_6
    invoke-interface {v6, v10}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public final b()Landroid/os/LocaleList;
    .locals 3

    iget-object v0, p0, Lf1/p;->d:Ls3/b;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, v0, Ls3/b;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls3/a;

    iget-object v2, v2, Ls3/a;->a:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Locale;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/util/Locale;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/util/Locale;

    new-instance v1, Landroid/os/LocaleList;

    invoke-direct {v1, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    return-object v1

    :cond_1
    new-instance v0, Landroid/os/LocaleList;

    sget-object v1, Ls3/c;->a:Ls/m2;

    invoke-virtual {v1}, Ls/m2;->i()Ls3/b;

    move-result-object v1

    invoke-virtual {v1}, Ls3/b;->a()Ls3/a;

    move-result-object v1

    iget-object v1, v1, Ls3/a;->a:Ljava/util/Locale;

    filled-new-array {v1}, [Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    return-object v0
.end method
