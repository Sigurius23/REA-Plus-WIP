.class public final Lv90/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/activation/domain/models/steps/PlanPickerOption;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0092\u0001\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000b2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\"\u001a\u0004\u0008&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\"\u001a\u0004\u0008\'\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010\"\u001a\u0004\u0008)\u0010$R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008*\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010+\u001a\u0004\u0008-\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\"\u001a\u0004\u0008.\u0010$R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010/\u001a\u0004\u00080\u00101R\u0017\u0010\r\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010+\u001a\u0004\u0008,\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010+\u001a\u0004\u00082\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u00103\u001a\u0004\u00084\u00105R\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u00106\u001a\u0004\u00087\u00108R\u0014\u00109\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u00101\u00a8\u0006:"
    }
    d2 = {
        "Lv90/s;",
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
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClickOption",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;)V",
        "c",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;)Lv90/s;",
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
        "k",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "j",
        "g",
        "d",
        "h",
        "e",
        "Ljava/lang/String;",
        "f",
        "i",
        "l",
        "Z",
        "n",
        "()Z",
        "m",
        "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "getCommitmentType",
        "()Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "Lc93/a;",
        "getOnClickOption",
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
.field public static final m:I


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

.field private final l:Lc93/a;
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

    sput v0, Lv90/s;->m:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;)V
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

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv90/s;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Lv90/s;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lv90/s;->c:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p4, p0, Lv90/s;->d:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p5, p0, Lv90/s;->e:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lv90/s;->f:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lv90/s;->g:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-boolean p8, p0, Lv90/s;->h:Z

    .line 10
    iput-object p9, p0, Lv90/s;->i:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lv90/s;->j:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lv90/s;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    .line 13
    iput-object p12, p0, Lv90/s;->l:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x20

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_2

    const/4 p8, 0x0

    :cond_2
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_3

    .line 14
    new-instance p12, Lv40/d;

    const/16 p13, 0x10

    invoke-direct {p12, p13}, Lv40/d;-><init>(I)V

    :cond_3
    move-object p13, p12

    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 15
    invoke-direct/range {p1 .. p13}, Lv90/s;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;)V

    return-void
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lv90/s;->b()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic d(Lv90/s;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;ILjava/lang/Object;)Lv90/s;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lv90/s;->a:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lv90/s;->b:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lv90/s;->c:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lv90/s;->d:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lv90/s;->e:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lv90/s;->f:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lv90/s;->g:Lcom/whoop/design/util/TextResource;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-boolean p8, p0, Lv90/s;->h:Z

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lv90/s;->i:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lv90/s;->j:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lv90/s;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lv90/s;->l:Lc93/a;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lv90/s;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;)Lv90/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;)Lv90/s;
    .locals 14
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
            "Lc93/a;",
            ")",
            "Lv90/s;"
        }
    .end annotation

    const-string v0, "optionTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionSubtitle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionPrice"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionPriceSubtitle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipTier"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commitmentType"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClickOption"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lv90/s;

    move-object v2, p1

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v13}, Lv90/s;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lc93/a;)V

    return-object v1
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv90/s;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv90/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv90/s;

    iget-object v1, p0, Lv90/s;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/s;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lv90/s;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/s;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lv90/s;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/s;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lv90/s;->d:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/s;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lv90/s;->e:Ljava/lang/String;

    iget-object v3, p1, Lv90/s;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lv90/s;->f:Ljava/lang/String;

    iget-object v3, p1, Lv90/s;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lv90/s;->g:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lv90/s;->g:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lv90/s;->h:Z

    iget-boolean v3, p1, Lv90/s;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lv90/s;->i:Ljava/lang/String;

    iget-object v3, p1, Lv90/s;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lv90/s;->j:Ljava/lang/String;

    iget-object v3, p1, Lv90/s;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lv90/s;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iget-object v3, p1, Lv90/s;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lv90/s;->l:Lc93/a;

    iget-object p1, p1, Lv90/s;->l:Lc93/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv90/s;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/s;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;
    .locals 1

    iget-object v0, p0, Lv90/s;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    return-object v0
.end method

.method public final h()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/s;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lv90/s;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lv90/s;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lv90/s;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lv90/s;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lv90/s;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lv90/s;->f:Ljava/lang/String;

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

    iget-object v2, p0, Lv90/s;->g:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lv90/s;->h:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lv90/s;->i:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lv90/s;->j:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lv90/s;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lv90/s;->l:Lc93/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv90/s;->f:Ljava/lang/String;

    return-object v0
.end method

.method public isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lv90/s;->h:Z

    return v0
.end method

.method public final j()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/s;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final k()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/s;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final l()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lv90/s;->g:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv90/s;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lv90/s;->h:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lv90/s;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lv90/s;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lv90/s;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lv90/s;->d:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lv90/s;->e:Ljava/lang/String;

    iget-object v5, p0, Lv90/s;->f:Ljava/lang/String;

    iget-object v6, p0, Lv90/s;->g:Lcom/whoop/design/util/TextResource;

    iget-boolean v7, p0, Lv90/s;->h:Z

    iget-object v8, p0, Lv90/s;->i:Ljava/lang/String;

    iget-object v9, p0, Lv90/s;->j:Ljava/lang/String;

    iget-object v10, p0, Lv90/s;->k:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iget-object v11, p0, Lv90/s;->l:Lc93/a;

    const-string v12, ", optionSubtitle="

    const-string v13, ", optionPrice="

    const-string v14, "UpcyclePickerOption(optionTitle="

    invoke-static {v14, v0, v12, v1, v13}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", optionPriceSubtitle="

    const-string v12, ", disclaimer="

    invoke-static {v0, v2, v1, v3, v12}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", optionPriceSubtitleStrikeout="

    const-string v2, ", tag="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isOptionSelected="

    const-string v2, ", membershipTier="

    invoke-static {v6, v1, v2, v0, v7}, Lte0/d;->w(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", trackingLabel="

    const-string v2, ", commitmentType="

    invoke-static {v0, v8, v1, v9, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onClickOption="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
