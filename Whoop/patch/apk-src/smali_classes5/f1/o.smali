.class public final Lf1/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/CharSequence;

.field public final synthetic H:J

.field public final synthetic I:Lf1/p;

.field public w:Lmc3/c;

.field public x:Lf1/p;

.field public y:Ljava/lang/CharSequence;

.field public z:J


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;JLf1/p;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lf1/o;->G:Ljava/lang/CharSequence;

    iput-wide p2, p0, Lf1/o;->H:J

    iput-object p4, p0, Lf1/o;->I:Lf1/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lf1/o;

    iget-wide v2, p0, Lf1/o;->H:J

    iget-object v4, p0, Lf1/o;->I:Lf1/p;

    iget-object v1, p0, Lf1/o;->G:Ljava/lang/CharSequence;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lf1/o;-><init>(Ljava/lang/CharSequence;JLf1/p;Lq83/d;)V

    iput-object p1, v0, Lf1/o;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/textclassifier/TextClassifier;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf1/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf1/o;->E:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lf1/o;->z:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v0, p0, Lf1/o;->z:J

    iget-object v2, p0, Lf1/o;->y:Ljava/lang/CharSequence;

    iget-object v3, p0, Lf1/o;->x:Lf1/p;

    iget-object v4, p0, Lf1/o;->w:Lmc3/c;

    iget-object v5, p0, Lf1/o;->F:Ljava/lang/Object;

    check-cast v5, Landroid/view/textclassifier/TextSelection;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf1/o;->F:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Landroid/view/textclassifier/TextClassifier;

    new-instance p1, Landroid/view/textclassifier/TextSelection$Request$Builder;

    iget-wide v4, p0, Lf1/o;->H:J

    invoke-static {v4, v5}, Ll3/u0;->f(J)I

    move-result v1

    invoke-static {v4, v5}, Ll3/u0;->e(J)I

    move-result v4

    iget-object v5, p0, Lf1/o;->G:Ljava/lang/CharSequence;

    invoke-direct {p1, v5, v1, v4}, Landroid/view/textclassifier/TextSelection$Request$Builder;-><init>(Ljava/lang/CharSequence;II)V

    iget-object v4, p0, Lf1/o;->I:Lf1/p;

    invoke-virtual {v4}, Lf1/p;->b()Landroid/os/LocaleList;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/textclassifier/TextSelection$Request$Builder;->setDefaultLocales(Landroid/os/LocaleList;)Landroid/view/textclassifier/TextSelection$Request$Builder;

    move-result-object p1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1f

    if-lt v1, v6, :cond_3

    invoke-virtual {p1, v3}, Landroid/view/textclassifier/TextSelection$Request$Builder;->setIncludeTextClassification(Z)Landroid/view/textclassifier/TextSelection$Request$Builder;

    :cond_3
    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection$Request$Builder;->build()Landroid/view/textclassifier/TextSelection$Request;

    move-result-object p1

    invoke-interface {v8, p1}, Landroid/view/textclassifier/TextClassifier;->suggestSelection(Landroid/view/textclassifier/TextSelection$Request;)Landroid/view/textclassifier/TextSelection;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection;->getSelectionStartIndex()I

    move-result v7

    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection;->getSelectionEndIndex()I

    move-result v9

    invoke-static {v7, v9}, Lj93/l0;->f(II)J

    move-result-wide v9

    if-lt v1, v6, :cond_5

    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection;->getTextClassification()Landroid/view/textclassifier/TextClassification;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, v4, Lf1/p;->e:Lmc3/c;

    iput-object p1, p0, Lf1/o;->F:Ljava/lang/Object;

    iput-object v1, p0, Lf1/o;->w:Lmc3/c;

    iput-object v4, p0, Lf1/o;->x:Lf1/p;

    iput-object v5, p0, Lf1/o;->y:Ljava/lang/CharSequence;

    iput-wide v9, p0, Lf1/o;->z:J

    iput v3, p0, Lf1/o;->E:I

    invoke-virtual {v1, p0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v3, v4

    move-object v2, v5

    move-object v5, p1

    move-object v4, v1

    move-wide v0, v9

    :goto_0
    const/4 p1, 0x0

    :try_start_0
    new-instance v6, Lf1/f1;

    invoke-virtual {v5}, Landroid/view/textclassifier/TextSelection;->getTextClassification()Landroid/view/textclassifier/TextClassification;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v6, v2, v0, v1, v5}, Lf1/f1;-><init>(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)V

    iget-object v2, v3, Lf1/p;->g:Lp1/k1;

    invoke-virtual {v2, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v4, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-interface {v4, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :cond_5
    iput-wide v9, p0, Lf1/o;->z:J

    iput v2, p0, Lf1/o;->E:I

    iget-object v5, p0, Lf1/o;->G:Ljava/lang/CharSequence;

    move-wide v6, v9

    move-object v9, p0

    invoke-static/range {v4 .. v9}, Lf1/p;->a(Lf1/p;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    :cond_6
    move-wide v0, v6

    :goto_2
    new-instance p1, Ll3/u0;

    invoke-direct {p1, v0, v1}, Ll3/u0;-><init>(J)V

    return-object p1
.end method
