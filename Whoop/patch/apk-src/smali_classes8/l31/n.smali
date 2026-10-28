.class public abstract Ll31/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0002\"\u0017\u0010\u0010\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u0008\u0010\u000f\"\u0017\u0010\u0015\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0001\u0010\u0014\"\u0017\u0010\u001a\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0006\u0010\u0019\"\u0017\u0010\u001c\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0018\u001a\u0004\u0008\u0004\u0010\u0019\"\u0017\u0010!\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\n\u0010 \"\u0017\u0010\'\u001a\u00020\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "sampleSetNumberText",
        "b",
        "sampleRepsText",
        "c",
        "sampleTimeText",
        "d",
        "sampleTimeText2",
        "e",
        "sampleWeightText",
        "Lr41/i$d;",
        "f",
        "Lr41/i$d;",
        "()Lr41/i$d;",
        "sampleWeightliftingSetEdit",
        "Lr41/i$a;",
        "g",
        "Lr41/i$a;",
        "()Lr41/i$a;",
        "sampleWeightliftingSetCompleted",
        "Lr41/i$c;",
        "h",
        "Lr41/i$c;",
        "()Lr41/i$c;",
        "sampleWeightliftingSetCurrentRest",
        "i",
        "sampleWeightliftingSetCurrentActive",
        "Lr41/i$e;",
        "j",
        "Lr41/i$e;",
        "()Lr41/i$e;",
        "sampleWeightliftingSetInProgress",
        "Lr41/i$b;",
        "k",
        "Lr41/i$b;",
        "getSampleWeightliftingSetCompleteUndoable",
        "()Lr41/i$b;",
        "sampleWeightliftingSetCompleteUndoable",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lcom/whoop/design/util/TextResource;

.field private static final b:Lcom/whoop/design/util/TextResource;

.field private static final c:Lcom/whoop/design/util/TextResource;

.field private static final d:Lcom/whoop/design/util/TextResource;

.field private static final e:Lcom/whoop/design/util/TextResource;

.field private static final f:Lr41/i$d;

.field private static final g:Lr41/i$a;

.field private static final h:Lr41/i$c;

.field private static final i:Lr41/i$c;

.field private static final j:Lr41/i$e;

.field private static final k:Lr41/i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    const-string v0, "1"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sput-object v4, Ll31/n;->a:Lcom/whoop/design/util/TextResource;

    const-string v0, "6"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sput-object v5, Ll31/n;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sput-object v0, Ll31/n;->c:Lcom/whoop/design/util/TextResource;

    const-string v1, "1530"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    sput-object v19, Ll31/n;->d:Lcom/whoop/design/util/TextResource;

    const-string v1, "135"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sput-object v8, Ll31/n;->e:Lcom/whoop/design/util/TextResource;

    new-instance v1, Lr41/i$d;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    const-string v13, "randomUUID(...)"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lr41/i$d;-><init>(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/n;->f:Lr41/i$d;

    new-instance v1, Lr41/i$a;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xb0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v11}, Lr41/i$a;-><init>(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/n;->g:Lr41/i$a;

    new-instance v1, Lr41/i$c;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7d80

    const/16 v18, 0x0

    const/4 v7, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v6, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v21, v6

    move-object v6, v0

    move-object/from16 v0, v21

    invoke-direct/range {v1 .. v18}, Lr41/i$c;-><init>(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILny0/q;Ly81/f;Ly81/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/n;->h:Lr41/i$c;

    new-instance v1, Lr41/i$c;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7db0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x1

    invoke-direct/range {v1 .. v18}, Lr41/i$c;-><init>(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILny0/q;Ly81/f;Ly81/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/n;->i:Lr41/i$c;

    new-instance v1, Lr41/i$e;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v17, 0x7f80

    const/4 v7, 0x1

    const/4 v11, 0x0

    move-object/from16 v6, v19

    invoke-direct/range {v1 .. v18}, Lr41/i$e;-><init>(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILy81/f;Lny0/q;Ly81/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/n;->j:Lr41/i$e;

    new-instance v1, Lr41/i$b;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v19, 0x1ff80

    const/16 v20, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v20}, Lr41/i$b;-><init>(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;IZLjava/lang/Object;IILny0/q;Ly81/f;Ly81/f;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ll31/n;->k:Lr41/i$b;

    return-void
.end method

.method public static final a()Lr41/i$a;
    .locals 1

    sget-object v0, Ll31/n;->g:Lr41/i$a;

    return-object v0
.end method

.method public static final b()Lr41/i$c;
    .locals 1

    sget-object v0, Ll31/n;->i:Lr41/i$c;

    return-object v0
.end method

.method public static final c()Lr41/i$c;
    .locals 1

    sget-object v0, Ll31/n;->h:Lr41/i$c;

    return-object v0
.end method

.method public static final d()Lr41/i$d;
    .locals 1

    sget-object v0, Ll31/n;->f:Lr41/i$d;

    return-object v0
.end method

.method public static final e()Lr41/i$e;
    .locals 1

    sget-object v0, Ll31/n;->j:Lr41/i$e;

    return-object v0
.end method
