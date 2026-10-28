.class public final Leb/e0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/f0;


# direct methods
.method public synthetic constructor <init>(Leb/f0;I)V
    .locals 0

    iput p2, p0, Leb/e0;->w:I

    iput-object p1, p0, Leb/e0;->x:Leb/f0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Leb/e0;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Leb/e0;->x:Leb/f0;

    iget-object v2, v1, Leb/f0;->a:Ljava/lang/String;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v4, v1, Leb/f0;->g:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x1

    if-gt v9, v10, :cond_4

    invoke-static {v8}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_1

    iput-boolean v10, v1, Leb/f0;->i:Z

    move-object v8, v6

    :cond_1
    sget-object v9, Leb/f0;->r:Ljava/util/regex/Pattern;

    invoke-virtual {v9, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    new-instance v11, Leb/d0;

    invoke-direct {v11}, Leb/d0;-><init>()V

    const/4 v12, 0x0

    move v13, v12

    :goto_1
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->find()Z

    move-result v14

    const-string v15, "substring(...)"

    if-eqz v14, :cond_2

    invoke-virtual {v9, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v14

    const-string v10, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v14, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v11, Leb/d0;->b:Ljava/util/ArrayList;

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v10, "queryParam"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/util/regex/Matcher;->start()I

    move-result v10

    invoke-virtual {v8, v13, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "(.+?)?"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/util/regex/Matcher;->end()I

    move-result v13

    const/4 v10, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v13, v9, :cond_3

    invoke-virtual {v8, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "argRegex.toString()"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, ".*"

    const-string v9, "\\E.*\\Q"

    invoke-static {v7, v8, v9, v12}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v11, Leb/d0;->a:Ljava/lang/String;

    const-string v7, "paramName"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_4
    const-string v1, " must only be present once in "

    const-string v3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."

    const-string v4, "Query parameter "

    invoke-static {v4, v6, v1, v2, v3}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_2
    return-object v3

    :pswitch_0
    iget-object v1, v0, Leb/e0;->x:Leb/f0;

    iget-object v1, v1, Leb/f0;->e:Ljava/lang/String;

    if-eqz v1, :cond_6

    const/4 v2, 0x2

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    :goto_3
    return-object v1

    :pswitch_1
    iget-object v1, v0, Leb/e0;->x:Leb/f0;

    iget-object v1, v1, Leb/f0;->n:Ljava/lang/String;

    if-eqz v1, :cond_7

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    :goto_4
    return-object v1

    :pswitch_2
    iget-object v1, v0, Leb/e0;->x:Leb/f0;

    iget-object v1, v1, Leb/f0;->a:Ljava/lang/String;

    if-eqz v1, :cond_8

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    const/4 v1, 0x1

    goto :goto_5

    :cond_8
    const/4 v1, 0x0

    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_3
    iget-object v1, v0, Leb/e0;->x:Leb/f0;

    iget-object v1, v1, Leb/f0;->j:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    if-eqz v1, :cond_9

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    goto :goto_6

    :cond_9
    const/4 v1, 0x0

    :goto_6
    return-object v1

    :pswitch_4
    iget-object v1, v0, Leb/e0;->x:Leb/f0;

    iget-object v1, v1, Leb/f0;->l:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_a

    const/4 v2, 0x2

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    goto :goto_7

    :cond_a
    const/4 v1, 0x0

    :goto_7
    return-object v1

    :pswitch_5
    iget-object v1, v0, Leb/e0;->x:Leb/f0;

    iget-object v1, v1, Leb/f0;->a:Ljava/lang/String;

    if-eqz v1, :cond_c

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_b

    goto :goto_8

    :cond_b
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1, v2, v3}, Leb/f0;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "fragRegex.toString()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_9

    :cond_c
    :goto_8
    const/4 v3, 0x0

    :goto_9
    return-object v3

    :pswitch_6
    iget-object v1, v0, Leb/e0;->x:Leb/f0;

    iget-object v1, v1, Leb/f0;->j:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    if-eqz v1, :cond_d

    iget-object v1, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_e

    :cond_d
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_e
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
