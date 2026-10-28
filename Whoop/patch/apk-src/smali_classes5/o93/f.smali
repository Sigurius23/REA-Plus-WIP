.class public final Lo93/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lo93/h;


# direct methods
.method public synthetic constructor <init>(Lo93/h;I)V
    .locals 0

    iput p2, p0, Lo93/f;->w:I

    iput-object p1, p0, Lo93/f;->x:Lo93/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lo93/f;->w:I

    const/4 v1, 0x0

    iget-object v2, p0, Lo93/f;->x:Lo93/h;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/EnumMap;

    const-class v3, Lo93/j;

    invoke-direct {v0, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lo93/j;->values()[Lo93/j;

    move-result-object v5

    array-length v6, v5

    :goto_0
    if-ge v1, v6, :cond_4

    aget-object v7, v5, v1

    iget-object v8, v7, Lo93/j;->w:Lva3/h;

    invoke-virtual {v8}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x2f

    const/4 v10, 0x0

    if-eqz v8, :cond_3

    invoke-virtual {v2, v8}, Lo93/h;->k(Ljava/lang/String;)Lr93/e;

    move-result-object v8

    invoke-interface {v8}, Lr93/e;->i()Llb3/c0;

    move-result-object v8

    const/16 v11, 0x30

    if-eqz v8, :cond_2

    iget-object v12, v7, Lo93/j;->x:Lva3/h;

    invoke-virtual {v12}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_1

    invoke-virtual {v2, v12}, Lo93/h;->k(Ljava/lang/String;)Lr93/e;

    move-result-object v9

    invoke-interface {v9}, Lr93/e;->i()Llb3/c0;

    move-result-object v9

    if-eqz v9, :cond_0

    invoke-virtual {v0, v7, v9}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v11}, Lo93/h;->a(I)V

    throw v10

    :cond_1
    invoke-static {v9}, Lo93/h;->a(I)V

    throw v10

    :cond_2
    invoke-static {v11}, Lo93/h;->a(I)V

    throw v10

    :cond_3
    invoke-static {v9}, Lo93/h;->a(I)V

    throw v10

    :cond_4
    new-instance v1, Lo93/g;

    invoke-direct {v1, v0, v3, v4}, Lo93/g;-><init>(Ljava/util/EnumMap;Ljava/util/HashMap;Ljava/util/HashMap;)V

    return-object v1

    :pswitch_0
    invoke-virtual {v2}, Lo93/h;->l()Lu93/e0;

    move-result-object v0

    sget-object v3, Lo93/n;->k:Lva3/e;

    invoke-virtual {v0, v3}, Lu93/e0;->F(Lva3/e;)Lr93/k0;

    move-result-object v0

    invoke-virtual {v2}, Lo93/h;->l()Lu93/e0;

    move-result-object v3

    sget-object v4, Lo93/n;->m:Lva3/e;

    invoke-virtual {v3, v4}, Lu93/e0;->F(Lva3/e;)Lr93/k0;

    move-result-object v3

    invoke-virtual {v2}, Lo93/h;->l()Lu93/e0;

    move-result-object v4

    sget-object v5, Lo93/n;->n:Lva3/e;

    invoke-virtual {v4, v5}, Lu93/e0;->F(Lva3/e;)Lr93/k0;

    move-result-object v4

    invoke-virtual {v2}, Lo93/h;->l()Lu93/e0;

    move-result-object v2

    sget-object v5, Lo93/n;->l:Lva3/e;

    invoke-virtual {v2, v5}, Lu93/e0;->F(Lva3/e;)Lr93/k0;

    move-result-object v2

    const/4 v5, 0x4

    new-array v5, v5, [Lr93/k0;

    aput-object v0, v5, v1

    const/4 v0, 0x1

    aput-object v3, v5, v0

    const/4 v0, 0x2

    aput-object v4, v5, v0

    const/4 v0, 0x3

    aput-object v2, v5, v0

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
