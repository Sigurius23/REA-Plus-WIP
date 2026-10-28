.class public final Lhb3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkb3/k;

.field public final b:Lr93/b0;

.field public final c:Lhb3/j;

.field public final d:Lhb3/e;

.field public final e:Lhb3/a;

.field public final f:Lr93/j0;

.field public final g:Lhb3/j;

.field public final h:Lhb3/o;

.field public final i:Lz93/b;

.field public final j:Lhb3/p;

.field public final k:Ljava/lang/Iterable;

.field public final l:Lzt/q;

.field public final m:Lhb3/j;

.field public final n:Lt93/b;

.field public final o:Lt93/d;

.field public final p:Lwa3/i;

.field public final q:Lmb3/k;

.field public final r:Ljava/util/List;

.field public final s:Lhb3/n;

.field public final t:Lhb3/g;


# direct methods
.method public constructor <init>(Lkb3/k;Lr93/b0;Laj/c;Lcom/google/crypto/tink/internal/l0;Lr93/j0;Ljava/lang/Iterable;Lzt/q;Lt93/b;Lt93/d;Lwa3/i;Lmb3/k;Lqt/e;I)V
    .locals 17

    sget-object v7, Lhb3/j;->c:Lhb3/j;

    sget-object v0, Lhb3/j;->d:Lhb3/j;

    const/high16 v1, 0x10000

    and-int v1, p13, v1

    if-eqz v1, :cond_0

    .line 22
    sget-object v1, Lmb3/k;->b:Lmb3/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    sget-object v1, Lmb3/j;->b:Lmb3/l;

    move-object v13, v1

    goto :goto_0

    :cond_0
    move-object/from16 v13, p11

    .line 24
    :goto_0
    sget-object v1, Llb3/k;->a:Llb3/k;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const/high16 v1, 0x80000

    and-int v1, p13, v1

    if-eqz v1, :cond_1

    .line 25
    sget-object v0, Lhb3/m;->b:Lhb3/m;

    :cond_1
    move-object/from16 v16, v0

    .line 26
    sget-object v6, Lhb3/o;->a:Lhb3/j;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v14, p12

    invoke-direct/range {v0 .. v16}, Lhb3/i;-><init>(Lkb3/k;Lr93/b0;Lhb3/e;Lhb3/a;Lr93/j0;Lhb3/o;Lhb3/p;Ljava/lang/Iterable;Lzt/q;Lt93/b;Lt93/d;Lwa3/i;Lmb3/k;Lqt/e;Ljava/util/List;Lhb3/n;)V

    return-void
.end method

.method public constructor <init>(Lkb3/k;Lr93/b0;Lhb3/e;Lhb3/a;Lr93/j0;Lhb3/o;Lhb3/p;Ljava/lang/Iterable;Lzt/q;Lt93/b;Lt93/d;Lwa3/i;Lmb3/k;Lqt/e;Ljava/util/List;Lhb3/n;)V
    .locals 9

    move-object/from16 v0, p8

    move-object/from16 v1, p10

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object/from16 v4, p13

    move-object/from16 v5, p16

    sget-object v6, Lhb3/j;->b:Lhb3/j;

    sget-object v7, Lhb3/j;->e:Lhb3/j;

    const-string v8, "moduleDescriptor"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "fictitiousClassDescriptorFactories"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "additionalClassPartsProvider"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "platformDependentDeclarationFilter"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "extensionRegistryLite"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "kotlinTypeChecker"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "enumEntriesDeserializationSupport"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhb3/i;->a:Lkb3/k;

    .line 3
    iput-object p2, p0, Lhb3/i;->b:Lr93/b0;

    .line 4
    iput-object v6, p0, Lhb3/i;->c:Lhb3/j;

    .line 5
    iput-object p3, p0, Lhb3/i;->d:Lhb3/e;

    .line 6
    iput-object p4, p0, Lhb3/i;->e:Lhb3/a;

    .line 7
    iput-object p5, p0, Lhb3/i;->f:Lr93/j0;

    .line 8
    iput-object v7, p0, Lhb3/i;->g:Lhb3/j;

    .line 9
    iput-object p6, p0, Lhb3/i;->h:Lhb3/o;

    .line 10
    sget-object p1, Lz93/b;->a:Lz93/b;

    iput-object p1, p0, Lhb3/i;->i:Lz93/b;

    move-object/from16 p1, p7

    .line 11
    iput-object p1, p0, Lhb3/i;->j:Lhb3/p;

    .line 12
    iput-object v0, p0, Lhb3/i;->k:Ljava/lang/Iterable;

    move-object/from16 p1, p9

    .line 13
    iput-object p1, p0, Lhb3/i;->l:Lzt/q;

    .line 14
    sget-object p1, Lhb3/h;->a:Lhb3/j;

    iput-object p1, p0, Lhb3/i;->m:Lhb3/j;

    .line 15
    iput-object v1, p0, Lhb3/i;->n:Lt93/b;

    .line 16
    iput-object v2, p0, Lhb3/i;->o:Lt93/d;

    .line 17
    iput-object v3, p0, Lhb3/i;->p:Lwa3/i;

    .line 18
    iput-object v4, p0, Lhb3/i;->q:Lmb3/k;

    move-object/from16 p1, p15

    .line 19
    iput-object p1, p0, Lhb3/i;->r:Ljava/util/List;

    .line 20
    iput-object v5, p0, Lhb3/i;->s:Lhb3/n;

    .line 21
    new-instance p1, Lhb3/g;

    invoke-direct {p1, p0}, Lhb3/g;-><init>(Lhb3/i;)V

    iput-object p1, p0, Lhb3/i;->t:Lhb3/g;

    return-void
.end method


# virtual methods
.method public final a(Lr93/g0;Lsa3/f;Lsa3/h;Lsa3/j;Lsa3/a;Ljb3/j;)Lhb3/k;
    .locals 11

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhb3/k;

    const/4 v9, 0x0

    sget-object v10, Lm83/y;->w:Lm83/y;

    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v10}, Lhb3/k;-><init>(Lhb3/i;Lsa3/f;Lr93/k;Lsa3/h;Lsa3/j;Lsa3/a;Ljb3/j;Lhb3/h0;Ljava/util/List;)V

    return-object v1
.end method

.method public final b(Lva3/c;)Lr93/e;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lhb3/g;->c:Ljava/util/Set;

    const/4 v0, 0x0

    iget-object v1, p0, Lhb3/i;->t:Lhb3/g;

    invoke-virtual {v1, p1, v0}, Lhb3/g;->a(Lva3/c;Lhb3/d;)Lr93/e;

    move-result-object p1

    return-object p1
.end method
