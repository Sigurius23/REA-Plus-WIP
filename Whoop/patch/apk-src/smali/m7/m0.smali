.class public final Lm7/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/g0;


# static fields
.field public static final X:Lr7/b0;

.field public static final Y:Lr7/b0;

.field public static final Z:Lr7/b0;

.field public static final a0:Lr7/k;

.field public static final b0:Lr7/k;


# instance fields
.field public final A:Lr7/b0;

.field public final B:Lr7/b0;

.field public final C:Lr7/b0;

.field public final D:Lr7/b0;

.field public final E:Lr7/b0;

.field public final F:Lr7/b0;

.field public final G:Lr7/b0;

.field public final H:Lr7/b0;

.field public final I:Lr7/b0;

.field public final J:Lr7/b0;

.field public final K:Lr7/b0;

.field public final L:Lr7/b0;

.field public final M:Lr7/b0;

.field public final N:Lr7/b0;

.field public final O:Lr7/b0;

.field public final P:Lr7/b0;

.field public final Q:Lr7/b0;

.field public final R:Lr7/b0;

.field public final S:Lr7/b0;

.field public final T:Lr7/b0;

.field public final U:Ljava/lang/String;

.field public final V:I

.field public final W:Ln7/c;

.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/ZoneOffset;

.field public final c:Ljava/time/Instant;

.field public final d:Ljava/time/ZoneOffset;

.field public final e:Lr7/b0;

.field public final f:Lr7/b0;

.field public final g:Lr7/b0;

.field public final h:Lr7/k;

.field public final i:Lr7/k;

.field public final j:Lr7/b0;

.field public final k:Lr7/b0;

.field public final l:Lr7/b0;

.field public final m:Lr7/b0;

.field public final n:Lr7/b0;

.field public final o:Lr7/b0;

.field public final p:Lr7/b0;

.field public final q:Lr7/b0;

.field public final r:Lr7/b0;

.field public final s:Lr7/b0;

.field public final t:Lr7/b0;

.field public final u:Lr7/b0;

.field public final v:Lr7/b0;

.field public final w:Lr7/b0;

.field public final x:Lr7/b0;

.field public final y:Lr7/b0;

.field public final z:Lr7/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/jvm/internal/j;->G(I)Lr7/b0;

    move-result-object v1

    sput-object v1, Lm7/m0;->X:Lr7/b0;

    const/16 v1, 0x64

    invoke-static {v1}, Lkotlin/jvm/internal/j;->G(I)Lr7/b0;

    move-result-object v1

    sput-object v1, Lm7/m0;->Y:Lr7/b0;

    const v1, 0x186a0

    invoke-static {v1}, Lkotlin/jvm/internal/j;->G(I)Lr7/b0;

    move-result-object v1

    sput-object v1, Lm7/m0;->Z:Lr7/b0;

    invoke-static {v0}, Le4/a;->w(I)Lr7/k;

    move-result-object v1

    sput-object v1, Lm7/m0;->a0:Lr7/k;

    const v1, 0x5f5e100

    invoke-static {v1}, Le4/a;->w(I)Lr7/k;

    move-result-object v1

    sput-object v1, Lm7/m0;->b0:Lr7/k;

    new-instance v1, Lm7/c0;

    sget-object v2, Lr7/b0;->y:Lr7/t;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lm7/c0;-><init>(I)V

    const/4 v3, 0x5

    const-string v4, "Nutrition"

    const-string v5, "biotin"

    invoke-static {v3, v4, v5, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/4 v5, 0x2

    invoke-direct {v1, v5}, Lm7/c0;-><init>(I)V

    const-string v6, "caffeine"

    invoke-static {v3, v4, v6, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/4 v6, 0x3

    invoke-direct {v1, v6}, Lm7/c0;-><init>(I)V

    const-string v7, "calcium"

    invoke-static {v3, v4, v7, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    sget-object v7, Lr7/k;->y:Lr7/e;

    const/16 v7, 0xa

    invoke-direct {v1, v7}, Lm7/c0;-><init>(I)V

    const-string v8, "calories"

    invoke-static {v3, v4, v8, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v8, 0x9

    invoke-direct {v1, v8}, Lm7/c0;-><init>(I)V

    const-string v9, "caloriesFromFat"

    invoke-static {v3, v4, v9, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/4 v9, 0x4

    invoke-direct {v1, v9}, Lm7/c0;-><init>(I)V

    const-string v10, "chloride"

    invoke-static {v3, v4, v10, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    invoke-direct {v1, v3}, Lm7/c0;-><init>(I)V

    const-string v10, "cholesterol"

    invoke-static {v3, v4, v10, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/4 v10, 0x6

    invoke-direct {v1, v10}, Lm7/c0;-><init>(I)V

    const-string v11, "chromium"

    invoke-static {v3, v4, v11, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/4 v11, 0x7

    invoke-direct {v1, v11}, Lm7/c0;-><init>(I)V

    const-string v12, "copper"

    invoke-static {v3, v4, v12, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v12, 0x8

    invoke-direct {v1, v12}, Lm7/c0;-><init>(I)V

    const-string v13, "dietaryFiber"

    invoke-static {v3, v4, v13, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v13, 0xb

    invoke-direct {v1, v13}, Lm7/c0;-><init>(I)V

    const-string v14, "folate"

    invoke-static {v3, v4, v14, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v14, 0xc

    invoke-direct {v1, v14}, Lm7/c0;-><init>(I)V

    const-string v15, "folicAcid"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0xd

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "iodine"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0xe

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "iron"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0xf

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "magnesium"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x10

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "manganese"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x11

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "molybdenum"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x12

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "monounsaturatedFat"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x13

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "niacin"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x14

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "pantothenicAcid"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x15

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "phosphorus"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x16

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "polyunsaturatedFat"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x17

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "potassium"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x18

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "protein"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x19

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "riboflavin"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x1a

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "saturatedFat"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x1b

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "selenium"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x1c

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "sodium"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/c0;

    const/16 v15, 0x1d

    invoke-direct {v1, v15}, Lm7/c0;-><init>(I)V

    const-string v15, "sugar"

    invoke-static {v3, v4, v15, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lm7/l0;

    invoke-direct {v1, v0}, Lm7/l0;-><init>(I)V

    const-string v0, "thiamin"

    invoke-static {v3, v4, v0, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v2}, Lm7/l0;-><init>(I)V

    const-string v1, "totalCarbohydrate"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v5}, Lm7/l0;-><init>(I)V

    const-string v1, "totalFat"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v6}, Lm7/l0;-><init>(I)V

    const-string v1, "transFat"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v9}, Lm7/l0;-><init>(I)V

    const-string v1, "unsaturatedFat"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v3}, Lm7/l0;-><init>(I)V

    const-string v1, "vitaminA"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v10}, Lm7/l0;-><init>(I)V

    const-string v1, "vitaminB12"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v11}, Lm7/l0;-><init>(I)V

    const-string v1, "vitaminB6"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v12}, Lm7/l0;-><init>(I)V

    const-string v1, "vitaminC"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v8}, Lm7/l0;-><init>(I)V

    const-string v1, "vitaminD"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v7}, Lm7/l0;-><init>(I)V

    const-string v1, "vitaminE"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v13}, Lm7/l0;-><init>(I)V

    const-string v1, "vitaminK"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lm7/l0;

    invoke-direct {v0, v14}, Lm7/l0;-><init>(I)V

    const-string v1, "zinc"

    invoke-static {v3, v4, v1, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/k;Lr7/k;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Ljava/lang/String;ILn7/c;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p23

    move-object/from16 v2, p24

    move-object/from16 v3, p25

    move-object/from16 v4, p26

    move-object/from16 v5, p27

    move-object/from16 v6, p28

    move-object/from16 v7, p29

    move-object/from16 v8, p30

    move-object/from16 v9, p31

    move-object/from16 v10, p32

    move-object/from16 v11, p33

    move-object/from16 v12, p34

    move-object/from16 v13, p35

    move-object/from16 v14, p36

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v15, p1

    iput-object v15, v0, Lm7/m0;->a:Ljava/time/Instant;

    move-object/from16 v15, p2

    iput-object v15, v0, Lm7/m0;->b:Ljava/time/ZoneOffset;

    move-object/from16 v15, p3

    iput-object v15, v0, Lm7/m0;->c:Ljava/time/Instant;

    move-object/from16 v15, p4

    iput-object v15, v0, Lm7/m0;->d:Ljava/time/ZoneOffset;

    move-object/from16 v15, p5

    iput-object v15, v0, Lm7/m0;->e:Lr7/b0;

    move-object/from16 v15, p6

    iput-object v15, v0, Lm7/m0;->f:Lr7/b0;

    move-object/from16 v15, p7

    iput-object v15, v0, Lm7/m0;->g:Lr7/b0;

    move-object/from16 v15, p8

    iput-object v15, v0, Lm7/m0;->h:Lr7/k;

    move-object/from16 v15, p9

    iput-object v15, v0, Lm7/m0;->i:Lr7/k;

    move-object/from16 v15, p10

    iput-object v15, v0, Lm7/m0;->j:Lr7/b0;

    move-object/from16 v15, p11

    iput-object v15, v0, Lm7/m0;->k:Lr7/b0;

    move-object/from16 v15, p12

    iput-object v15, v0, Lm7/m0;->l:Lr7/b0;

    move-object/from16 v15, p13

    iput-object v15, v0, Lm7/m0;->m:Lr7/b0;

    move-object/from16 v15, p14

    iput-object v15, v0, Lm7/m0;->n:Lr7/b0;

    move-object/from16 v15, p15

    iput-object v15, v0, Lm7/m0;->o:Lr7/b0;

    move-object/from16 v15, p16

    iput-object v15, v0, Lm7/m0;->p:Lr7/b0;

    move-object/from16 v15, p17

    iput-object v15, v0, Lm7/m0;->q:Lr7/b0;

    move-object/from16 v15, p18

    iput-object v15, v0, Lm7/m0;->r:Lr7/b0;

    move-object/from16 v15, p19

    iput-object v15, v0, Lm7/m0;->s:Lr7/b0;

    move-object/from16 v15, p20

    iput-object v15, v0, Lm7/m0;->t:Lr7/b0;

    move-object/from16 v15, p21

    iput-object v15, v0, Lm7/m0;->u:Lr7/b0;

    move-object/from16 v15, p22

    iput-object v15, v0, Lm7/m0;->v:Lr7/b0;

    iput-object v1, v0, Lm7/m0;->w:Lr7/b0;

    iput-object v2, v0, Lm7/m0;->x:Lr7/b0;

    iput-object v3, v0, Lm7/m0;->y:Lr7/b0;

    iput-object v4, v0, Lm7/m0;->z:Lr7/b0;

    iput-object v5, v0, Lm7/m0;->A:Lr7/b0;

    iput-object v6, v0, Lm7/m0;->B:Lr7/b0;

    iput-object v7, v0, Lm7/m0;->C:Lr7/b0;

    iput-object v8, v0, Lm7/m0;->D:Lr7/b0;

    iput-object v9, v0, Lm7/m0;->E:Lr7/b0;

    iput-object v10, v0, Lm7/m0;->F:Lr7/b0;

    iput-object v11, v0, Lm7/m0;->G:Lr7/b0;

    iput-object v12, v0, Lm7/m0;->H:Lr7/b0;

    iput-object v13, v0, Lm7/m0;->I:Lr7/b0;

    iput-object v14, v0, Lm7/m0;->J:Lr7/b0;

    move-object/from16 v15, p37

    iput-object v15, v0, Lm7/m0;->K:Lr7/b0;

    move-object/from16 v15, p38

    iput-object v15, v0, Lm7/m0;->L:Lr7/b0;

    move-object/from16 v15, p39

    iput-object v15, v0, Lm7/m0;->M:Lr7/b0;

    move-object/from16 v15, p40

    iput-object v15, v0, Lm7/m0;->N:Lr7/b0;

    move-object/from16 v15, p41

    iput-object v15, v0, Lm7/m0;->O:Lr7/b0;

    move-object/from16 v15, p42

    iput-object v15, v0, Lm7/m0;->P:Lr7/b0;

    move-object/from16 v15, p43

    iput-object v15, v0, Lm7/m0;->Q:Lr7/b0;

    move-object/from16 v15, p44

    iput-object v15, v0, Lm7/m0;->R:Lr7/b0;

    move-object/from16 v15, p45

    iput-object v15, v0, Lm7/m0;->S:Lr7/b0;

    move-object/from16 v15, p46

    iput-object v15, v0, Lm7/m0;->T:Lr7/b0;

    move-object/from16 v15, p47

    iput-object v15, v0, Lm7/m0;->U:Ljava/lang/String;

    move/from16 v15, p48

    iput v15, v0, Lm7/m0;->V:I

    move-object/from16 v15, p49

    iput-object v15, v0, Lm7/m0;->W:Ln7/c;

    iget-object v15, v0, Lm7/m0;->a:Ljava/time/Instant;

    iget-object v14, v0, Lm7/m0;->c:Ljava/time/Instant;

    invoke-virtual {v15, v14}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result v14

    if-eqz v14, :cond_2a

    iget-object v14, v0, Lm7/m0;->e:Lr7/b0;

    sget-object v15, Lm7/m0;->Y:Lr7/b0;

    sget-object v13, Lm7/m0;->X:Lr7/b0;

    if-eqz v14, :cond_0

    const-string v12, "biotin"

    invoke-static {v14, v13, v15, v12}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_0
    iget-object v12, v0, Lm7/m0;->f:Lr7/b0;

    if-eqz v12, :cond_1

    const-string v14, "caffeine"

    invoke-static {v12, v13, v15, v14}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_1
    iget-object v12, v0, Lm7/m0;->g:Lr7/b0;

    if-eqz v12, :cond_2

    const-string v14, "calcium"

    invoke-static {v12, v13, v15, v14}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_2
    iget-object v12, v0, Lm7/m0;->h:Lr7/k;

    sget-object v14, Lm7/m0;->b0:Lr7/k;

    sget-object v11, Lm7/m0;->a0:Lr7/k;

    if-eqz v12, :cond_3

    const-string v10, "energy"

    invoke-static {v12, v11, v14, v10}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_3
    iget-object v10, v0, Lm7/m0;->i:Lr7/k;

    if-eqz v10, :cond_4

    const-string v12, "energyFromFat"

    invoke-static {v10, v11, v14, v12}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_4
    iget-object v10, v0, Lm7/m0;->j:Lr7/b0;

    const-string v11, "chloride"

    if-eqz v10, :cond_5

    invoke-static {v10, v13, v15, v11}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_5
    iget-object v10, v0, Lm7/m0;->k:Lr7/b0;

    if-eqz v10, :cond_6

    const-string v12, "cholesterol"

    invoke-static {v10, v13, v15, v12}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_6
    iget-object v10, v0, Lm7/m0;->l:Lr7/b0;

    if-eqz v10, :cond_7

    const-string v12, "chromium"

    invoke-static {v10, v13, v15, v12}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_7
    iget-object v10, v0, Lm7/m0;->m:Lr7/b0;

    if-eqz v10, :cond_8

    const-string v12, "copper"

    invoke-static {v10, v13, v15, v12}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_8
    iget-object v10, v0, Lm7/m0;->n:Lr7/b0;

    sget-object v12, Lm7/m0;->Z:Lr7/b0;

    if-eqz v10, :cond_9

    const-string v14, "dietaryFiber"

    invoke-static {v10, v13, v12, v14}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_9
    iget-object v10, v0, Lm7/m0;->o:Lr7/b0;

    if-eqz v10, :cond_a

    invoke-static {v10, v13, v15, v11}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_a
    iget-object v10, v0, Lm7/m0;->p:Lr7/b0;

    if-eqz v10, :cond_b

    const-string v11, "folicAcid"

    invoke-static {v10, v13, v15, v11}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_b
    iget-object v10, v0, Lm7/m0;->q:Lr7/b0;

    if-eqz v10, :cond_c

    const-string v11, "iodine"

    invoke-static {v10, v13, v15, v11}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_c
    iget-object v10, v0, Lm7/m0;->r:Lr7/b0;

    if-eqz v10, :cond_d

    const-string v11, "iron"

    invoke-static {v10, v13, v15, v11}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_d
    iget-object v10, v0, Lm7/m0;->s:Lr7/b0;

    if-eqz v10, :cond_e

    const-string v11, "magnesium"

    invoke-static {v10, v13, v15, v11}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_e
    iget-object v10, v0, Lm7/m0;->t:Lr7/b0;

    if-eqz v10, :cond_f

    const-string v11, "manganese"

    invoke-static {v10, v13, v15, v11}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_f
    iget-object v10, v0, Lm7/m0;->u:Lr7/b0;

    if-eqz v10, :cond_10

    const-string v11, "molybdenum"

    invoke-static {v10, v13, v15, v11}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_10
    iget-object v10, v0, Lm7/m0;->v:Lr7/b0;

    if-eqz v10, :cond_11

    const-string v11, "monounsaturatedFat"

    invoke-static {v10, v13, v12, v11}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_11
    if-eqz v1, :cond_12

    const-string v10, "niacin"

    invoke-static {v1, v13, v15, v10}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_12
    if-eqz v2, :cond_13

    const-string v1, "pantothenicAcid"

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_13
    if-eqz v3, :cond_14

    const-string v1, "phosphorus"

    invoke-static {v3, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_14
    if-eqz v4, :cond_15

    const-string v1, "polyunsaturatedFat"

    invoke-static {v4, v13, v12, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_15
    if-eqz v5, :cond_16

    const-string v1, "potassium"

    invoke-static {v5, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_16
    if-eqz v6, :cond_17

    const-string v1, "protein"

    invoke-static {v6, v13, v12, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_17
    if-eqz v7, :cond_18

    const-string v1, "riboflavin"

    invoke-static {v7, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_18
    if-eqz v8, :cond_19

    const-string v1, "saturatedFat"

    invoke-static {v8, v13, v12, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_19
    if-eqz v9, :cond_1a

    const-string v1, "selenium"

    invoke-static {v9, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_1a
    if-eqz p32, :cond_1b

    const-string v1, "sodium"

    move-object/from16 v10, p32

    invoke-static {v10, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_1b
    if-eqz p33, :cond_1c

    const-string v1, "sugar"

    move-object/from16 v11, p33

    invoke-static {v11, v13, v12, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_1c
    if-eqz p34, :cond_1d

    const-string v1, "thiamin"

    move-object/from16 v2, p34

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_1d
    if-eqz p35, :cond_1e

    const-string v1, "totalCarbohydrate"

    move-object/from16 v2, p35

    invoke-static {v2, v13, v12, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_1e
    if-eqz p36, :cond_1f

    const-string v1, "totalFat"

    move-object/from16 v14, p36

    invoke-static {v14, v13, v12, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_1f
    if-eqz p37, :cond_20

    const-string v1, "transFat"

    move-object/from16 v2, p37

    invoke-static {v2, v13, v12, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_20
    if-eqz p38, :cond_21

    const-string v1, "unsaturatedFat"

    move-object/from16 v2, p38

    invoke-static {v2, v13, v12, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_21
    if-eqz p39, :cond_22

    const-string v1, "vitaminA"

    move-object/from16 v2, p39

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_22
    if-eqz p40, :cond_23

    const-string v1, "vitaminB12"

    move-object/from16 v2, p40

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_23
    if-eqz p41, :cond_24

    const-string v1, "vitaminB6"

    move-object/from16 v2, p41

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_24
    if-eqz p42, :cond_25

    const-string v1, "vitaminC"

    move-object/from16 v2, p42

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_25
    if-eqz p43, :cond_26

    const-string v1, "vitaminD"

    move-object/from16 v2, p43

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_26
    if-eqz p44, :cond_27

    const-string v1, "vitaminE"

    move-object/from16 v2, p44

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_27
    if-eqz p45, :cond_28

    const-string v1, "vitaminK"

    move-object/from16 v2, p45

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_28
    if-eqz p46, :cond_29

    const-string v1, "zinc"

    move-object/from16 v2, p46

    invoke-static {v2, v13, v15, v1}, Ls2/e;->Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    :cond_29
    return-void

    :cond_2a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "startTime must be before endTime."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final b()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/m0;->b:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final c()Ln7/c;
    .locals 1

    iget-object v0, p0, Lm7/m0;->W:Ln7/c;

    return-object v0
.end method

.method public final e()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/m0;->c:Ljava/time/Instant;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/m0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/m0;

    iget-object v1, p1, Lm7/m0;->e:Lr7/b0;

    iget-object v3, p0, Lm7/m0;->e:Lr7/b0;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/m0;->f:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->f:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/m0;->g:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->g:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm7/m0;->h:Lr7/k;

    iget-object v3, p1, Lm7/m0;->h:Lr7/k;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lm7/m0;->i:Lr7/k;

    iget-object v3, p1, Lm7/m0;->i:Lr7/k;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lm7/m0;->j:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->j:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lm7/m0;->k:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->k:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lm7/m0;->l:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->l:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lm7/m0;->m:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->m:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lm7/m0;->n:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->n:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lm7/m0;->o:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->o:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lm7/m0;->p:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->p:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lm7/m0;->q:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->q:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lm7/m0;->r:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->r:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lm7/m0;->s:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->s:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lm7/m0;->t:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->t:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lm7/m0;->u:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->u:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lm7/m0;->v:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->v:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lm7/m0;->w:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->w:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lm7/m0;->x:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->x:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lm7/m0;->y:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->y:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lm7/m0;->z:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->z:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lm7/m0;->A:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->A:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lm7/m0;->B:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->B:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lm7/m0;->C:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->C:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lm7/m0;->D:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->D:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lm7/m0;->E:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->E:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lm7/m0;->F:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->F:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lm7/m0;->G:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->G:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lm7/m0;->H:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->H:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lm7/m0;->I:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->I:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lm7/m0;->J:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->J:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lm7/m0;->K:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->K:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lm7/m0;->L:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->L:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lm7/m0;->M:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->M:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lm7/m0;->N:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->N:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lm7/m0;->O:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->O:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lm7/m0;->P:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->P:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lm7/m0;->Q:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->Q:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lm7/m0;->R:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->R:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lm7/m0;->S:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->S:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lm7/m0;->T:Lr7/b0;

    iget-object v3, p1, Lm7/m0;->T:Lr7/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lm7/m0;->U:Ljava/lang/String;

    iget-object v3, p1, Lm7/m0;->U:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget v1, p0, Lm7/m0;->V:I

    iget v3, p1, Lm7/m0;->V:I

    if-eq v1, v3, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lm7/m0;->a:Ljava/time/Instant;

    iget-object v3, p1, Lm7/m0;->a:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lm7/m0;->b:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/m0;->b:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lm7/m0;->c:Ljava/time/Instant;

    iget-object v3, p1, Lm7/m0;->c:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget-object v1, p0, Lm7/m0;->d:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/m0;->d:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    return v2

    :cond_31
    iget-object v1, p0, Lm7/m0;->W:Ln7/c;

    iget-object p1, p1, Lm7/m0;->W:Ln7/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_32

    return v2

    :cond_32
    return v0
.end method

.method public final f()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/m0;->d:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final getStartTime()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/m0;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lm7/m0;->e:Lr7/b0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lr7/b0;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->f:Lr7/b0;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->g:Lr7/b0;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->h:Lr7/k;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lr7/k;->hashCode()I

    move-result v3

    goto :goto_3

    :cond_3
    move v3, v0

    :goto_3
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->i:Lr7/k;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lr7/k;->hashCode()I

    move-result v3

    goto :goto_4

    :cond_4
    move v3, v0

    :goto_4
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->j:Lr7/b0;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_5

    :cond_5
    move v3, v0

    :goto_5
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->k:Lr7/b0;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_6

    :cond_6
    move v3, v0

    :goto_6
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->l:Lr7/b0;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_7

    :cond_7
    move v3, v0

    :goto_7
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->m:Lr7/b0;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_8

    :cond_8
    move v3, v0

    :goto_8
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->n:Lr7/b0;

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_9

    :cond_9
    move v3, v0

    :goto_9
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->o:Lr7/b0;

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_a

    :cond_a
    move v3, v0

    :goto_a
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->p:Lr7/b0;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_b

    :cond_b
    move v3, v0

    :goto_b
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->q:Lr7/b0;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_c

    :cond_c
    move v3, v0

    :goto_c
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->r:Lr7/b0;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_d

    :cond_d
    move v3, v0

    :goto_d
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->s:Lr7/b0;

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_e

    :cond_e
    move v3, v0

    :goto_e
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->t:Lr7/b0;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_f

    :cond_f
    move v3, v0

    :goto_f
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->u:Lr7/b0;

    if-eqz v3, :cond_10

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_10

    :cond_10
    move v3, v0

    :goto_10
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->v:Lr7/b0;

    if-eqz v3, :cond_11

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_11

    :cond_11
    move v3, v0

    :goto_11
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->w:Lr7/b0;

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_12

    :cond_12
    move v3, v0

    :goto_12
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->x:Lr7/b0;

    if-eqz v3, :cond_13

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_13

    :cond_13
    move v3, v0

    :goto_13
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->y:Lr7/b0;

    if-eqz v3, :cond_14

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_14

    :cond_14
    move v3, v0

    :goto_14
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->z:Lr7/b0;

    if-eqz v3, :cond_15

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_15

    :cond_15
    move v3, v0

    :goto_15
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->A:Lr7/b0;

    if-eqz v3, :cond_16

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_16

    :cond_16
    move v3, v0

    :goto_16
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->B:Lr7/b0;

    if-eqz v3, :cond_17

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_17

    :cond_17
    move v3, v0

    :goto_17
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->C:Lr7/b0;

    if-eqz v3, :cond_18

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_18

    :cond_18
    move v3, v0

    :goto_18
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->D:Lr7/b0;

    if-eqz v3, :cond_19

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_19

    :cond_19
    move v3, v0

    :goto_19
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->E:Lr7/b0;

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_1a

    :cond_1a
    move v3, v0

    :goto_1a
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->F:Lr7/b0;

    if-eqz v3, :cond_1b

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_1b

    :cond_1b
    move v3, v0

    :goto_1b
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->G:Lr7/b0;

    if-eqz v3, :cond_1c

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_1c

    :cond_1c
    move v3, v0

    :goto_1c
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->H:Lr7/b0;

    if-eqz v3, :cond_1d

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_1d

    :cond_1d
    move v3, v0

    :goto_1d
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->I:Lr7/b0;

    if-eqz v3, :cond_1e

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_1e

    :cond_1e
    move v3, v0

    :goto_1e
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->J:Lr7/b0;

    if-eqz v3, :cond_1f

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_1f

    :cond_1f
    move v3, v0

    :goto_1f
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->K:Lr7/b0;

    if-eqz v3, :cond_20

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_20

    :cond_20
    move v3, v0

    :goto_20
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->L:Lr7/b0;

    if-eqz v3, :cond_21

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_21

    :cond_21
    move v3, v0

    :goto_21
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->M:Lr7/b0;

    if-eqz v3, :cond_22

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_22

    :cond_22
    move v3, v0

    :goto_22
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->N:Lr7/b0;

    if-eqz v3, :cond_23

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_23

    :cond_23
    move v3, v0

    :goto_23
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->O:Lr7/b0;

    if-eqz v3, :cond_24

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_24

    :cond_24
    move v3, v0

    :goto_24
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->P:Lr7/b0;

    if-eqz v3, :cond_25

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_25

    :cond_25
    move v3, v0

    :goto_25
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->Q:Lr7/b0;

    if-eqz v3, :cond_26

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_26

    :cond_26
    move v3, v0

    :goto_26
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->R:Lr7/b0;

    if-eqz v3, :cond_27

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_27

    :cond_27
    move v3, v0

    :goto_27
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->S:Lr7/b0;

    if-eqz v3, :cond_28

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_28

    :cond_28
    move v3, v0

    :goto_28
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->T:Lr7/b0;

    if-eqz v3, :cond_29

    invoke-virtual {v3}, Lr7/b0;->hashCode()I

    move-result v3

    goto :goto_29

    :cond_29
    move v3, v0

    :goto_29
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->U:Ljava/lang/String;

    if-eqz v3, :cond_2a

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_2a

    :cond_2a
    move v3, v0

    :goto_2a
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget v3, p0, Lm7/m0;->V:I

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->a:Ljava/time/Instant;

    invoke-static {v3, v1, v2}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v1

    iget-object v3, p0, Lm7/m0;->b:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_2b

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v3

    goto :goto_2b

    :cond_2b
    move v3, v0

    :goto_2b
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/m0;->c:Ljava/time/Instant;

    invoke-static {v3, v1, v2}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v1

    iget-object v3, p0, Lm7/m0;->d:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_2c

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v0

    :cond_2c
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lm7/m0;->W:Ln7/c;

    invoke-virtual {v0}, Ln7/c;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
