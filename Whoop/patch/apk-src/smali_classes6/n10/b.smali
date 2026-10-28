.class public abstract Ln10/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb20/f;

.field public final b:Lk83/a;


# direct methods
.method public constructor <init>(Lb20/f;Lk83/a;)V
    .locals 1

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptionsProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln10/b;->a:Lb20/f;

    iput-object p2, p0, Ln10/b;->b:Lk83/a;

    return-void
.end method


# virtual methods
.method public final a(Lb20/d;Lb20/c;Ljava/lang/String;Ljava/lang/String;Lc93/a;Ls83/c;)Ljava/lang/Object;
    .locals 12

    move-object/from16 v0, p6

    instance-of v1, v0, Ln10/a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ln10/a;

    iget v3, v1, Ln10/a;->G:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v1, Ln10/a;->G:I

    :goto_0
    move-object v6, v1

    goto :goto_1

    :cond_0
    new-instance v1, Ln10/a;

    invoke-direct {v1, p0, v0}, Ln10/a;-><init>(Ln10/b;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Ln10/a;->E:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ln10/a;->G:I

    const/4 v4, 0x0

    const/4 v8, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v8, :cond_1

    iget-object v1, v6, Ln10/a;->z:Ljava/lang/String;

    iget-object v3, v6, Ln10/a;->y:Ljava/lang/String;

    iget-object v5, v6, Ln10/a;->x:Lb20/c;

    iget-object v6, v6, Ln10/a;->w:Ln10/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v5

    move-object v5, v1

    move-object v1, v11

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface/range {p5 .. p5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 v0, 0x2

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v9

    new-instance v0, Lg20/p;

    const/16 v5, 0x1d

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v1, p5

    invoke-direct/range {v0 .. v5}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p0, v6, Ln10/a;->w:Ln10/b;

    iput-object p2, v6, Ln10/a;->x:Lb20/c;

    iput-object p3, v6, Ln10/a;->y:Ljava/lang/String;

    move-object/from16 v5, p4

    iput-object v5, v6, Ln10/a;->z:Ljava/lang/String;

    iput v8, v6, Ln10/a;->G:I

    invoke-static {v9, v10, v0, v6}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    return-object v7

    :cond_3
    move-object v6, p0

    move-object v1, p2

    move-object v3, p3

    :goto_2
    if-nez v0, :cond_5

    iget-object v0, v6, Ln10/b;->a:Lb20/f;

    const/4 v7, 0x6

    invoke-static {v0, v1, v4, v4, v7}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    iget-object v0, v6, Ln10/b;->b:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyy/f;

    invoke-virtual {v0}, Lyy/f;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x7f14101c

    invoke-static {v0}, Ls4/i;->h(I)Lzy/b;

    move-result-object v0

    goto :goto_3

    :cond_4
    invoke-static {v3}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object v0

    :goto_3
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException;

    invoke-direct {v1, v3, v0, v5}, Lcom/stripe/android/paymentelement/confirmation/intent/CallbackNotFoundException;-><init>(Ljava/lang/String;Lzy/c;Ljava/lang/String;)V

    throw v1

    :cond_5
    return-object v0
.end method
