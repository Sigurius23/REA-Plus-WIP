.class public final Lv90/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/activation/domain/models/steps/PlanPickerOption;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000b2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010!\u001a\u0004\u0008%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010!\u001a\u0004\u0008\'\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010!\u001a\u0004\u0008)\u0010#R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010*\u001a\u0004\u0008&\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010!\u001a\u0004\u0008,\u0010#R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010-\u001a\u0004\u0008.\u0010/R\u0017\u0010\r\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010*\u001a\u0004\u00080\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010*\u001a\u0004\u00081\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010-\u001a\u0004\u00085\u0010/R\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0006\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u0008(\u00108R\u0014\u00109\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010/\u00a8\u0006:"
    }
    d2 = {
        "Lv90/k;",
        "Lcom/whoop/activation/domain/models/steps/PlanPickerOption;",
        "Lcom/whoop/design/util/TextResource;",
        "optionTitle",
        "optionSubtitle",
        "optionPrice",
        "optionPriceSubtitle",
        "",
        "disclaimer",
        "optionPriceSubtitleStrikeout",
        "tag",
        "",
        "isOptionSelected",
        "membershipTier",
        "trackingLabel",
        "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "commitmentType",
        "shouldSkipNextScreen",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClickOption",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZLc93/a;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "i",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "h",
        "c",
        "e",
        "d",
        "f",
        "Ljava/lang/String;",
        "g",
        "j",
        "Z",
        "l",
        "()Z",
        "getMembershipTier",
        "k",
        "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "getCommitmentType",
        "()Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "getShouldSkipNextScreen",
        "m",
        "Lc93/a;",
        "()Lc93/a;",
        "isSelected",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final n:I


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Lcom/whoop/design/util/TextResource;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Lcom/whoop/design/util/TextResource;

.field private final h:Z

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

.field private final l:Z

.field private final m:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lv90/k;->n:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZLc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
            "Z",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "optionTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionSubtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionPrice"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionPriceSubtitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipTier"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commitmentType"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClickOption"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv90/k;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Lv90/k;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lv90/k;->c:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p4, p0, Lv90/k;->d:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p5, p0, Lv90/k;->e:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lv90/k;->f:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lv90/k;->g:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-boolean p8, p0, Lv90/k;->h:Z

    .line 10
    iput-object p9, p0, Lv90/k;->i:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lv90/k;->j:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lv90/k;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    .line 13
    iput-boolean p12, p0, Lv90/k;->l:Z

    .line 14
    iput-object p13, p0, Lv90/k;->m:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v9, v2

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object/from16 v10, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v11, v1

    goto :goto_2

    :cond_2
    move/from16 v11, p8

    :goto_2
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_3

    .line 15
    new-instance v0, Lv40/d;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lv40/d;-><init>(I)V

    move-object/from16 v16, v0

    :goto_3
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p12

    goto :goto_4

    :cond_3
    move-object/from16 v16, p13

    goto :goto_3

    .line 16
    :goto_4
    invoke-direct/range {v3 .. v16}, Lv90/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;ZLc93/a;)V

    return-void
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lv90/k;->b()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv90/k;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lv90/k;->m:Lc93/a;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/k;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv90/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv90/k;

    iget-object v1, p0, Lv90/k;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/k;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lv90/k;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/k;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lv90/k;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/k;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lv90/k;->d:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/k;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lv90/k;->e:Ljava/lang/String;

    iget-object v3, p1, Lv90/k;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lv90/k;->f:Ljava/lang/String;

    iget-object v3, p1, Lv90/k;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lv90/k;->g:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/k;->g:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lv90/k;->h:Z

    iget-boolean v3, p1, Lv90/k;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lv90/k;->i:Ljava/lang/String;

    iget-object v3, p1, Lv90/k;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lv90/k;->j:Ljava/lang/String;

    iget-object v3, p1, Lv90/k;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lv90/k;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iget-object v3, p1, Lv90/k;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lv90/k;->l:Z

    iget-boolean v3, p1, Lv90/k;->l:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lv90/k;->m:Lc93/a;

    iget-object p1, p1, Lv90/k;->m:Lc93/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final f()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/k;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv90/k;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;
    .locals 1

    iget-object v0, p0, Lv90/k;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    return-object v0
.end method

.method public final h()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/k;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lv90/k;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lv90/k;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lv90/k;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lv90/k;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lv90/k;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lv90/k;->f:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lv90/k;->g:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lv90/k;->h:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lv90/k;->i:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lv90/k;->j:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lv90/k;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lv90/k;->l:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lv90/k;->m:Lc93/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/k;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lv90/k;->h:Z

    return v0
.end method

.method public final j()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/k;->g:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv90/k;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lv90/k;->h:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lv90/k;->a:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lv90/k;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lv90/k;->c:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lv90/k;->d:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lv90/k;->e:Ljava/lang/String;

    iget-object v6, v0, Lv90/k;->f:Ljava/lang/String;

    iget-object v7, v0, Lv90/k;->g:Lcom/whoop/design/util/TextResource;

    iget-boolean v8, v0, Lv90/k;->h:Z

    iget-object v9, v0, Lv90/k;->i:Ljava/lang/String;

    iget-object v10, v0, Lv90/k;->j:Ljava/lang/String;

    iget-object v11, v0, Lv90/k;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iget-boolean v12, v0, Lv90/k;->l:Z

    iget-object v13, v0, Lv90/k;->m:Lc93/a;

    const-string v14, ", optionSubtitle="

    const-string v15, ", optionPrice="

    const-string v0, "TrialPlanPickerOption(optionTitle="

    invoke-static {v0, v1, v14, v2, v15}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", optionPriceSubtitle="

    const-string v2, ", disclaimer="

    invoke-static {v0, v3, v1, v4, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", optionPriceSubtitleStrikeout="

    const-string v2, ", tag="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isOptionSelected="

    const-string v2, ", membershipTier="

    invoke-static {v7, v1, v2, v0, v8}, Lte0/d;->w(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", trackingLabel="

    const-string v2, ", commitmentType="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldSkipNextScreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", onClickOption="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
