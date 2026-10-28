.class public final enum Lrk1/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrk1/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrk1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0086\u0081\u0002\u0018\u0000 \u001a2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bBC\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000e\u001a\u0004\u0008\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u0014R\u0017\u0010\u0008\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0012\u001a\u0004\u0008\u0016\u0010\u0014R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019j\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#\u00a8\u0006$"
    }
    d2 = {
        "Lrk1/c;",
        "",
        "",
        "id",
        "analyticsId",
        "",
        "displayTitle",
        "displayBody",
        "checkResult",
        "",
        "Lsk1/b;",
        "determinations",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "getAnalyticsId",
        "I",
        "getDisplayTitle",
        "()I",
        "getDisplayBody",
        "getCheckResult",
        "Ljava/util/List;",
        "getDeterminations",
        "()Ljava/util/List;",
        "Companion",
        "a",
        "SinusRhythm",
        "Unreadable",
        "LowHeartRate",
        "Shepherd",
        "HighHeartRate",
        "Inconclusive",
        "ShepherdHighHeartRate",
        "HighHeartRateNoShepherdDetected",
        "heart-health-common_release"
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lrk1/c;

.field public static final Companion:Lrk1/c$a;

.field public static final enum HighHeartRate:Lrk1/c;

.field public static final enum HighHeartRateNoShepherdDetected:Lrk1/c;

.field public static final enum Inconclusive:Lrk1/c;

.field public static final enum LowHeartRate:Lrk1/c;

.field public static final enum Shepherd:Lrk1/c;

.field public static final enum ShepherdHighHeartRate:Lrk1/c;

.field public static final enum SinusRhythm:Lrk1/c;

.field public static final enum Unreadable:Lrk1/c;


# instance fields
.field private final analyticsId:Ljava/lang/String;

.field private final checkResult:I

.field private final determinations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;"
        }
    .end annotation
.end field

.field private final displayBody:I

.field private final displayTitle:I

.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lrk1/c;
    .locals 8

    sget-object v0, Lrk1/c;->SinusRhythm:Lrk1/c;

    sget-object v1, Lrk1/c;->Unreadable:Lrk1/c;

    sget-object v2, Lrk1/c;->LowHeartRate:Lrk1/c;

    sget-object v3, Lrk1/c;->Shepherd:Lrk1/c;

    sget-object v4, Lrk1/c;->HighHeartRate:Lrk1/c;

    sget-object v5, Lrk1/c;->Inconclusive:Lrk1/c;

    sget-object v6, Lrk1/c;->ShepherdHighHeartRate:Lrk1/c;

    sget-object v7, Lrk1/c;->HighHeartRateNoShepherdDetected:Lrk1/c;

    filled-new-array/range {v0 .. v7}, [Lrk1/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lrk1/c;

    sget v5, Lpk1/a;->s:I

    sget v6, Lpk1/a;->j:I

    sget-object v9, Lrk1/a;->a:Lrk1/a;

    invoke-virtual {v9}, Lrk1/a;->i()Lsk1/b;

    move-result-object v1

    invoke-virtual {v9}, Lrk1/a;->b()Lsk1/b;

    move-result-object v2

    invoke-virtual {v9}, Lrk1/a;->e()Lsk1/b;

    move-result-object v3

    invoke-virtual {v9}, Lrk1/a;->f()Lsk1/b;

    move-result-object v4

    filled-new-array {v1, v2, v3, v4}, [Lsk1/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v1, "SinusRhythm"

    const/4 v2, 0x0

    const-string v3, "SINUS_RHYTHM"

    const-string v4, "normal_sinus_rhythm"

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v8}, Lrk1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V

    sput-object v0, Lrk1/c;->SinusRhythm:Lrk1/c;

    new-instance v10, Lrk1/c;

    sget v15, Lpk1/a;->A:I

    sget v16, Lpk1/a;->m:I

    invoke-virtual {v9}, Lrk1/a;->l()Lsk1/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-string v11, "Unreadable"

    const/4 v12, 0x1

    const-string v13, "UNREADABLE"

    const-string v14, "unreadable"

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v18}, Lrk1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V

    sput-object v10, Lrk1/c;->Unreadable:Lrk1/c;

    new-instance v0, Lrk1/c;

    sget v5, Lpk1/a;->p:I

    sget v6, Lpk1/a;->h:I

    invoke-virtual {v9}, Lrk1/a;->k()Lsk1/b;

    move-result-object v1

    invoke-virtual {v9}, Lrk1/a;->d()Lsk1/b;

    move-result-object v2

    invoke-virtual {v9}, Lrk1/a;->f()Lsk1/b;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Lsk1/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v1, "LowHeartRate"

    const/4 v2, 0x2

    const-string v3, "LOW_HEART_RATE"

    const-string v4, "low_heart_rate"

    const/4 v7, 0x2

    invoke-direct/range {v0 .. v8}, Lrk1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V

    sput-object v0, Lrk1/c;->LowHeartRate:Lrk1/c;

    new-instance v10, Lrk1/c;

    sget v15, Lpk1/a;->u:I

    sget v16, Lpk1/a;->l:I

    invoke-virtual {v9}, Lrk1/a;->h()Lsk1/b;

    move-result-object v0

    invoke-virtual {v9}, Lrk1/a;->b()Lsk1/b;

    move-result-object v1

    invoke-virtual {v9}, Lrk1/a;->e()Lsk1/b;

    move-result-object v2

    invoke-virtual {v9}, Lrk1/a;->g()Lsk1/b;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Lsk1/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-string v11, "Shepherd"

    const/4 v12, 0x3

    const-string v13, "AFIB"

    const-string v14, "possible_afib"

    const/16 v17, 0x3

    invoke-direct/range {v10 .. v18}, Lrk1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V

    sput-object v10, Lrk1/c;->Shepherd:Lrk1/c;

    new-instance v0, Lrk1/c;

    sget v5, Lpk1/a;->c:I

    sget v6, Lpk1/a;->f:I

    invoke-virtual {v9}, Lrk1/a;->j()Lsk1/b;

    move-result-object v1

    invoke-virtual {v9}, Lrk1/a;->a()Lsk1/b;

    move-result-object v2

    invoke-virtual {v9}, Lrk1/a;->g()Lsk1/b;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Lsk1/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v1, "HighHeartRate"

    const/4 v2, 0x4

    const-string v3, "HIGH_HEART_RATE"

    const-string v4, "high_heart_rate"

    const/4 v7, 0x4

    invoke-direct/range {v0 .. v8}, Lrk1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V

    sput-object v0, Lrk1/c;->HighHeartRate:Lrk1/c;

    new-instance v10, Lrk1/c;

    sget v15, Lpk1/a;->e:I

    sget v16, Lpk1/a;->g:I

    invoke-virtual {v9}, Lrk1/a;->i()Lsk1/b;

    move-result-object v0

    invoke-virtual {v9}, Lrk1/a;->b()Lsk1/b;

    move-result-object v1

    invoke-virtual {v9}, Lrk1/a;->e()Lsk1/b;

    move-result-object v2

    invoke-virtual {v9}, Lrk1/a;->g()Lsk1/b;

    move-result-object v3

    invoke-virtual {v9}, Lrk1/a;->c()Lsk1/b;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Lsk1/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-string v11, "Inconclusive"

    const/4 v12, 0x5

    const-string v13, "INCONCLUSIVE"

    const-string v14, "inconclusive"

    const/16 v17, 0x5

    invoke-direct/range {v10 .. v18}, Lrk1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V

    sput-object v10, Lrk1/c;->Inconclusive:Lrk1/c;

    new-instance v0, Lrk1/c;

    sget v5, Lpk1/a;->t:I

    sget v6, Lpk1/a;->k:I

    invoke-virtual {v9}, Lrk1/a;->h()Lsk1/b;

    move-result-object v1

    invoke-virtual {v9}, Lrk1/a;->a()Lsk1/b;

    move-result-object v2

    invoke-virtual {v9}, Lrk1/a;->g()Lsk1/b;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Lsk1/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v1, "ShepherdHighHeartRate"

    const/4 v2, 0x6

    const-string v3, "AFIB_HIGH_HEART_RATE"

    const-string v4, "high_heart_rate_afib"

    const/4 v7, 0x6

    invoke-direct/range {v0 .. v8}, Lrk1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V

    sput-object v0, Lrk1/c;->ShepherdHighHeartRate:Lrk1/c;

    new-instance v10, Lrk1/c;

    sget v15, Lpk1/a;->c:I

    sget v16, Lpk1/a;->i:I

    invoke-virtual {v9}, Lrk1/a;->i()Lsk1/b;

    move-result-object v0

    invoke-virtual {v9}, Lrk1/a;->a()Lsk1/b;

    move-result-object v1

    invoke-virtual {v9}, Lrk1/a;->g()Lsk1/b;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Lsk1/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-string v11, "HighHeartRateNoShepherdDetected"

    const/4 v12, 0x7

    const-string v13, "HIGH_HEART_RATE_NO_AFIB_DETECTED"

    const-string v14, "high_heart_rate"

    const/16 v17, 0x7

    invoke-direct/range {v10 .. v18}, Lrk1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V

    sput-object v10, Lrk1/c;->HighHeartRateNoShepherdDetected:Lrk1/c;

    invoke-static {}, Lrk1/c;->$values()[Lrk1/c;

    move-result-object v0

    sput-object v0, Lrk1/c;->$VALUES:[Lrk1/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lrk1/c;->$ENTRIES:Lt83/a;

    new-instance v0, Lrk1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrk1/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrk1/c;->Companion:Lrk1/c$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "III",
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lrk1/c;->id:Ljava/lang/String;

    iput-object p4, p0, Lrk1/c;->analyticsId:Ljava/lang/String;

    iput p5, p0, Lrk1/c;->displayTitle:I

    iput p6, p0, Lrk1/c;->displayBody:I

    iput p7, p0, Lrk1/c;->checkResult:I

    iput-object p8, p0, Lrk1/c;->determinations:Ljava/util/List;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lrk1/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrk1/c;
    .locals 1

    const-class v0, Lrk1/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrk1/c;

    return-object p0
.end method

.method public static values()[Lrk1/c;
    .locals 1

    sget-object v0, Lrk1/c;->$VALUES:[Lrk1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrk1/c;

    return-object v0
.end method


# virtual methods
.method public final getAnalyticsId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrk1/c;->analyticsId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCheckResult()I
    .locals 1

    iget v0, p0, Lrk1/c;->checkResult:I

    return v0
.end method

.method public final getDeterminations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrk1/c;->determinations:Ljava/util/List;

    return-object v0
.end method

.method public final getDisplayBody()I
    .locals 1

    iget v0, p0, Lrk1/c;->displayBody:I

    return v0
.end method

.method public final getDisplayTitle()I
    .locals 1

    iget v0, p0, Lrk1/c;->displayTitle:I

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrk1/c;->id:Ljava/lang/String;

    return-object v0
.end method
