.class public final Li3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La3/n0;

.field public final b:Li3/e;

.field public final c:La0/s;

.field public final d:La0/q0;


# direct methods
.method public constructor <init>(La3/n0;Li3/e;La0/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/r;->a:La3/n0;

    iput-object p2, p0, Li3/r;->b:Li3/e;

    iput-object p3, p0, Li3/r;->c:La0/s;

    new-instance p1, La0/q0;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, La0/q0;-><init>(I)V

    iput-object p1, p0, Li3/r;->d:La0/q0;

    return-void
.end method


# virtual methods
.method public final a()Li3/p;
    .locals 5

    new-instance v0, Li3/l;

    invoke-direct {v0}, Li3/l;-><init>()V

    new-instance v1, Li3/p;

    const/4 v2, 0x0

    iget-object v3, p0, Li3/r;->b:Li3/e;

    iget-object v4, p0, Li3/r;->a:La3/n0;

    invoke-direct {v1, v3, v2, v4, v0}, Li3/p;-><init>(Lb2/v;ZLa3/n0;Li3/l;)V

    return-object v1
.end method

.method public final b(La3/n0;Li3/l;)V
    .locals 13

    iget-object v0, p0, Li3/r;->d:La0/q0;

    iget-object v1, v0, La0/q0;->a:[Ljava/lang/Object;

    iget v0, v0, La0/q0;->b:I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_b

    aget-object v4, v1, v3

    check-cast v4, Lc2/d;

    iget-object v5, v4, Lc2/d;->h:La0/h0;

    iget-object v6, v4, Lc2/d;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v4, v4, Lc2/d;->a:Lad3/z;

    invoke-virtual {p1}, La3/n0;->I()Li3/l;

    move-result-object v7

    iget v8, p1, La3/n0;->x:I

    const/4 v9, 0x0

    if-eqz p2, :cond_1

    sget-object v10, Li3/u;->D:Li3/y;

    iget-object v11, p2, Li3/l;->w:La0/v0;

    invoke-virtual {v11, v10}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_0

    move-object v10, v9

    :cond_0
    check-cast v10, Ll3/g;

    if-eqz v10, :cond_1

    iget-object v10, v10, Ll3/g;->x:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v10, v9

    :goto_1
    if-eqz v7, :cond_3

    sget-object v11, Li3/u;->D:Li3/y;

    iget-object v12, v7, Li3/l;->w:La0/v0;

    invoke-virtual {v12, v11}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_2

    move-object v11, v9

    :cond_2
    check-cast v11, Ll3/g;

    if-eqz v11, :cond_3

    iget-object v9, v11, Ll3/g;->x:Ljava/lang/String;

    :cond_3
    const/4 v11, 0x1

    if-eq v10, v9, :cond_6

    if-nez v10, :cond_4

    invoke-virtual {v4, v6, v8, v11}, Lad3/z;->p(Landroid/view/View;IZ)V

    goto :goto_2

    :cond_4
    if-nez v9, :cond_5

    invoke-virtual {v4, v6, v8, v2}, Lad3/z;->p(Landroid/view/View;IZ)V

    goto :goto_2

    :cond_5
    sget-object v10, Li3/u;->r:Li3/y;

    invoke-static {v7, v10}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lc2/f;

    sget-object v12, Lc2/i;->a:Lc2/f;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual {v9}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lc2/i;->b(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;

    move-result-object v9

    iget-object v4, v4, Lad3/z;->x:Ljava/lang/Object;

    check-cast v4, Landroid/view/autofill/AutofillManager;

    invoke-virtual {v4, v6, v8, v9}, Landroid/view/autofill/AutofillManager;->notifyValueChanged(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V

    :cond_6
    :goto_2
    if-eqz p2, :cond_7

    iget-object v4, p2, Li3/l;->w:La0/v0;

    sget-object v6, Li3/u;->q:Li3/y;

    invoke-virtual {v4, v6}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v4

    if-ne v4, v11, :cond_7

    move v4, v11

    goto :goto_3

    :cond_7
    move v4, v2

    :goto_3
    if-eqz v7, :cond_8

    iget-object v6, v7, Li3/l;->w:La0/v0;

    sget-object v7, Li3/u;->q:Li3/y;

    invoke-virtual {v6, v7}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v6

    if-ne v6, v11, :cond_8

    goto :goto_4

    :cond_8
    move v11, v2

    :goto_4
    if-eq v4, v11, :cond_a

    if-eqz v11, :cond_9

    invoke-virtual {v5, v8}, La0/h0;->a(I)Z

    goto :goto_5

    :cond_9
    invoke-virtual {v5, v8}, La0/h0;->e(I)Z

    :cond_a
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_b
    return-void
.end method
