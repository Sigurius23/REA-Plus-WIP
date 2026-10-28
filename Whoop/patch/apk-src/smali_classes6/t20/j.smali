.class public final Lt20/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(ILjava/lang/String;)I
    .locals 19

    move/from16 v0, p0

    move-object/from16 v1, p1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance v2, Lyb3/p;

    sget-object v3, Lyb3/q;->x:Lyb3/q;

    const-string v3, "Bank of America"

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v5, Ll83/k;

    const-string v3, "boa"

    invoke-direct {v5, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "Capital One"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v6, Ll83/k;

    const-string v3, "capitalone"

    invoke-direct {v6, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "Citibank"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v7, Ll83/k;

    const-string v3, "citibank"

    invoke-direct {v7, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "BBVA|COMPASS"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v8, Ll83/k;

    const-string v3, "compass"

    invoke-direct {v8, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "MORGAN CHASE|JP MORGAN|Chase"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v9, Ll83/k;

    const-string v3, "morganchase"

    invoke-direct {v9, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "NAVY FEDERAL CREDIT UNION"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v10, Ll83/k;

    const-string v3, "nfcu"

    invoke-direct {v10, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "PNC\\s?BANK|PNC Bank"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v11, Ll83/k;

    const-string v3, "pnc"

    invoke-direct {v11, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "SUNTRUST|SunTrust Bank"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v12, Ll83/k;

    const-string v3, "suntrust"

    invoke-direct {v12, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "Silicon Valley Bank"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v13, Ll83/k;

    const-string v3, "svb"

    invoke-direct {v13, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "Stripe|TestInstitution|Test Institution"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v14, Ll83/k;

    const-string v3, "stripe"

    invoke-direct {v14, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "TD Bank"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v15, Ll83/k;

    const-string v3, "td"

    invoke-direct {v15, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "USAA FEDERAL SAVINGS BANK|USAA Bank"

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v3, Ll83/k;

    const-string v4, "usaa"

    invoke-direct {v3, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v4, "U\\.?S\\. BANK|US Bank"

    move-object/from16 v17, v3

    const/4 v3, 0x0

    invoke-direct {v2, v4, v3}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v4, Ll83/k;

    const-string v3, "usbank"

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lyb3/p;

    const-string v3, "Wells Fargo"

    move-object/from16 v18, v4

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    new-instance v3, Ll83/k;

    const-string v4, "wellsfargo"

    invoke-direct {v3, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v3

    filled-new-array/range {v5 .. v18}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyb3/p;

    invoke-static {v1, v5}, Lyb3/p;->b(Ljava/lang/CharSequence;Lyb3/p;)Lx83/h;

    move-result-object v5

    invoke-virtual {v5}, Lx83/h;->iterator()Ljava/util/Iterator;

    move-result-object v5

    check-cast v5, Lxb3/h;

    invoke-virtual {v5}, Lxb3/h;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ls40/e0;->i(ILjava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_4
    :goto_2
    return v0
.end method
