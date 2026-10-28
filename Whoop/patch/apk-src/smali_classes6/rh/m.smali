.class public final Lrh/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lfi/f;

.field public c:Ll83/p;

.field public d:Ll83/p;

.field public e:Lrh/d;

.field public final f:Lrh/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lrh/m;->a:Landroid/content/Context;

    sget-object p1, Lfi/f;->o:Lfi/f;

    iput-object p1, p0, Lrh/m;->b:Lfi/f;

    const/4 p1, 0x0

    iput-object p1, p0, Lrh/m;->c:Ll83/p;

    iput-object p1, p0, Lrh/m;->d:Ll83/p;

    iput-object p1, p0, Lrh/m;->e:Lrh/d;

    new-instance p1, Lrh/h;

    invoke-direct {p1}, Lrh/h;-><init>()V

    iput-object p1, p0, Lrh/m;->f:Lrh/h;

    return-void
.end method


# virtual methods
.method public final a()Lrh/t;
    .locals 18

    move-object/from16 v0, p0

    new-instance v1, Lrh/q;

    iget-object v2, v0, Lrh/m;->f:Lrh/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lrh/i;

    iget-object v2, v2, Lrh/h;->a:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Lx43/j;->W(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v3, v2}, Lrh/i;-><init>(Ljava/util/Map;)V

    iget-object v2, v0, Lrh/m;->b:Lfi/f;

    iget-object v4, v2, Lfi/f;->a:Lne3/p;

    iget-object v5, v2, Lfi/f;->b:Lq83/j;

    iget-object v6, v2, Lfi/f;->c:Lq83/j;

    iget-object v7, v2, Lfi/f;->d:Lq83/j;

    iget-object v8, v2, Lfi/f;->e:Lfi/b;

    iget-object v9, v2, Lfi/f;->f:Lfi/b;

    iget-object v10, v2, Lfi/f;->g:Lfi/b;

    iget-object v11, v2, Lfi/f;->h:Lkotlin/jvm/functions/Function1;

    iget-object v12, v2, Lfi/f;->i:Lkotlin/jvm/functions/Function1;

    iget-object v13, v2, Lfi/f;->j:Lkotlin/jvm/functions/Function1;

    iget-object v14, v2, Lfi/f;->k:Lgi/j;

    iget-object v15, v2, Lfi/f;->l:Lgi/g;

    iget-object v2, v2, Lfi/f;->m:Lgi/d;

    move-object/from16 v17, v3

    new-instance v3, Lfi/f;

    move-object/from16 v16, v2

    invoke-direct/range {v3 .. v17}, Lfi/f;-><init>(Lne3/p;Lq83/j;Lq83/j;Lq83/j;Lfi/b;Lfi/b;Lfi/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lgi/j;Lgi/g;Lgi/d;Lrh/i;)V

    iget-object v2, v0, Lrh/m;->c:Ll83/p;

    if-nez v2, :cond_0

    new-instance v2, Lq80/h;

    const/16 v4, 0xf

    invoke-direct {v2, v0, v4}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v2

    :cond_0
    move-object v4, v2

    iget-object v2, v0, Lrh/m;->d:Ll83/p;

    if-nez v2, :cond_1

    new-instance v2, Lrh/l;

    const/4 v5, 0x0

    invoke-direct {v2, v5}, Lrh/l;-><init>(I)V

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v2

    :cond_1
    move-object v5, v2

    iget-object v2, v0, Lrh/m;->e:Lrh/d;

    if-nez v2, :cond_2

    new-instance v6, Lrh/d;

    sget-object v7, Lm83/y;->w:Lm83/y;

    move-object v8, v7

    move-object v9, v7

    move-object v10, v7

    move-object v11, v7

    invoke-direct/range {v6 .. v11}, Lrh/d;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    goto :goto_0

    :cond_2
    move-object v6, v2

    :goto_0
    iget-object v2, v0, Lrh/m;->a:Landroid/content/Context;

    invoke-direct/range {v1 .. v6}, Lrh/q;-><init>(Landroid/content/Context;Lfi/f;Ll83/p;Ll83/p;Lrh/d;)V

    new-instance v2, Lrh/t;

    invoke-direct {v2, v1}, Lrh/t;-><init>(Lrh/q;)V

    return-object v2
.end method
