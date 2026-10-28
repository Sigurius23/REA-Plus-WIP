.class public final Li63/d0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Li63/e0;


# direct methods
.method public synthetic constructor <init>(Li63/e0;I)V
    .locals 0

    iput p2, p0, Li63/d0;->w:I

    iput-object p1, p0, Li63/d0;->x:Li63/e0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    iget v0, p0, Li63/d0;->w:I

    const/16 v1, 0x2f

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x6

    const-string v6, "this as java.lang.String).substring(startIndex)"

    const/4 v7, 0x4

    const/16 v8, 0x23

    const-string v9, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    const/4 v10, 0x0

    const-string v11, ""

    iget-object v12, p0, Li63/d0;->x:Li63/e0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v12, Li63/e0;->g:Ljava/lang/String;

    iget-object v1, v12, Li63/e0;->e:Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    move-object v3, v11

    goto :goto_0

    :cond_1
    iget-object v1, v12, Li63/e0;->a:Li63/b0;

    iget-object v1, v1, Li63/b0;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    new-array v2, v2, [C

    fill-array-data v2, :array_0

    invoke-static {v0, v2, v1, v10}, Lyb3/r;->h0(Ljava/lang/CharSequence;[CIZ)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v3

    :pswitch_0
    iget-object v0, v12, Li63/e0;->g:Ljava/lang/String;

    const/16 v1, 0x3f

    invoke-static {v0, v1, v10, v10, v5}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0, v8, v1, v10, v7}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v2

    if-ne v2, v4, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object v11

    :pswitch_1
    iget-object v0, v12, Li63/e0;->g:Ljava/lang/String;

    iget-object v2, v12, Li63/e0;->a:Li63/b0;

    iget-object v2, v2, Li63/b0;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3

    invoke-static {v0, v1, v2, v10, v7}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    if-ne v1, v4, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v0, v8, v1, v10, v7}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v2

    if-ne v2, v4, :cond_5

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object v11

    :pswitch_2
    iget-object v0, v12, Li63/e0;->d:Ljava/util/ArrayList;

    iget-object v3, v12, Li63/e0;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    iget-object v0, v12, Li63/e0;->a:Li63/b0;

    iget-object v0, v0, Li63/b0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    invoke-static {v3, v1, v0, v10, v7}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    if-ne v0, v4, :cond_7

    goto :goto_3

    :cond_7
    new-array v1, v2, [C

    fill-array-data v1, :array_1

    invoke-static {v3, v1, v0, v10}, Lyb3/r;->h0(Ljava/lang/CharSequence;[CIZ)I

    move-result v1

    if-ne v1, v4, :cond_8

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    return-object v11

    :pswitch_3
    iget-object v0, v12, Li63/e0;->g:Ljava/lang/String;

    iget-object v1, v12, Li63/e0;->f:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_a

    move-object v3, v11

    goto :goto_4

    :cond_a
    iget-object v1, v12, Li63/e0;->a:Li63/b0;

    iget-object v1, v1, Li63/b0;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    const/16 v2, 0x3a

    invoke-static {v0, v2, v1, v10, v7}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x40

    invoke-static {v0, v2, v10, v10, v5}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    return-object v3

    :pswitch_4
    iget-object v0, v12, Li63/e0;->g:Ljava/lang/String;

    invoke-static {v0, v8, v10, v10, v5}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    return-object v11

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 2
        0x3as
        0x40s
    .end array-data

    :array_1
    .array-data 2
        0x3fs
        0x23s
    .end array-data
.end method
