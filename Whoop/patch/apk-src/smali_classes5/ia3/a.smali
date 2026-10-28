.class public final Lia3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkb3/n;

.field public final b:Laj/c;

.field public final c:Laj/d;

.field public final d:Loa3/f;

.field public final e:Lga3/h;

.field public final f:Lhb3/o;

.field public final g:Lga3/h;

.field public final h:Lga3/h;

.field public final i:Lqt/e;

.field public final j:Lw93/d;

.field public final k:Laj/d;

.field public final l:Loa3/g;

.field public final m:Lr93/v0;

.field public final n:Lz93/b;

.field public final o:Lr93/b0;

.field public final p:Lo93/l;

.field public final q:Lfa3/b;

.field public final r:Ljc/b;

.field public final s:Lfa3/l;

.field public final t:Lia3/b;

.field public final u:Lmb3/k;

.field public final v:Lch3/h;

.field public final w:Loa3/g;

.field public final x:Ldb3/e;


# direct methods
.method public constructor <init>(Lkb3/n;Laj/c;Laj/d;Loa3/f;Lga3/h;Lhb3/o;Lga3/h;Lqt/e;Lw93/d;Laj/d;Loa3/g;Lr93/v0;Lz93/b;Lr93/b0;Lo93/l;Lfa3/b;Ljc/b;Lfa3/l;Lia3/b;Lmb3/k;Lch3/h;Loa3/g;)V
    .locals 17

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    sget-object v0, Lga3/h;->b:Lga3/h;

    sget-object v16, Ldb3/e;->a:Ldb3/d;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v16, v0

    const-string v0, "storageManager"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signaturePropagator"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaPropertyInitializerEvaluator"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElementFactory"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleClassResolver"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packagePartProvider"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertypeLoopChecker"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectionTypes"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationTypeQualifierResolver"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signatureEnhancement"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClassesTracker"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaTypeEnhancementState"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaModuleResolver"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticPartsProvider"

    sget-object v15, Ldb3/d;->b:Ldb3/a;

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lia3/a;->a:Lkb3/n;

    iput-object v2, v0, Lia3/a;->b:Laj/c;

    iput-object v3, v0, Lia3/a;->c:Laj/d;

    iput-object v4, v0, Lia3/a;->d:Loa3/f;

    iput-object v5, v0, Lia3/a;->e:Lga3/h;

    iput-object v6, v0, Lia3/a;->f:Lhb3/o;

    move-object/from16 v1, v16

    iput-object v1, v0, Lia3/a;->g:Lga3/h;

    iput-object v7, v0, Lia3/a;->h:Lga3/h;

    iput-object v8, v0, Lia3/a;->i:Lqt/e;

    iput-object v9, v0, Lia3/a;->j:Lw93/d;

    iput-object v10, v0, Lia3/a;->k:Laj/d;

    iput-object v11, v0, Lia3/a;->l:Loa3/g;

    iput-object v12, v0, Lia3/a;->m:Lr93/v0;

    iput-object v13, v0, Lia3/a;->n:Lz93/b;

    iput-object v14, v0, Lia3/a;->o:Lr93/b0;

    move-object/from16 v1, p15

    iput-object v1, v0, Lia3/a;->p:Lo93/l;

    move-object/from16 v1, p16

    iput-object v1, v0, Lia3/a;->q:Lfa3/b;

    move-object/from16 v1, p17

    iput-object v1, v0, Lia3/a;->r:Ljc/b;

    move-object/from16 v1, p18

    iput-object v1, v0, Lia3/a;->s:Lfa3/l;

    move-object/from16 v1, p19

    iput-object v1, v0, Lia3/a;->t:Lia3/b;

    move-object/from16 v1, p20

    iput-object v1, v0, Lia3/a;->u:Lmb3/k;

    move-object/from16 v1, p21

    iput-object v1, v0, Lia3/a;->v:Lch3/h;

    move-object/from16 v1, p22

    iput-object v1, v0, Lia3/a;->w:Loa3/g;

    iput-object v15, v0, Lia3/a;->x:Ldb3/e;

    return-void
.end method
