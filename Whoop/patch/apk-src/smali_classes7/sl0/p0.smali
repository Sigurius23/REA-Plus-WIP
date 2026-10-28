.class public final Lsl0/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u000f\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000cR\u0011\u0010\u0011\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u000cR\u0011\u0010\u0013\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "Lsl0/p0;",
        "",
        "<init>",
        "()V",
        "",
        "ffEnabled",
        "",
        "sourceType",
        "Li2/t;",
        "e",
        "(ZLjava/lang/String;)Li2/t;",
        "a",
        "()Li2/t;",
        "coachBackgroundGradient",
        "c",
        "dailyOutlookGradient",
        "d",
        "dayInReviewGradient",
        "b",
        "coachWrapperBackgroundGradient",
        "bot_release"
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
.field public static final a:Lsl0/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsl0/p0;

    invoke-direct {v0}, Lsl0/p0;-><init>()V

    sput-object v0, Lsl0/p0;->a:Lsl0/p0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Li2/t;
    .locals 8

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-wide v3, 0xff283339L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3eae147b    # 0.34f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-wide v4, 0xff14191dL

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-wide v5, 0xff101518L

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v2, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5}, [Ll83/k;

    move-result-object v2

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    const/16 v4, 0x8

    invoke-static {v0, v2, v1, v3, v4}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v0

    return-object v0
.end method

.method public final b()Li2/t;
    .locals 9

    sget-object v0, Li2/t;->b:Li2/s;

    const v1, 0x4d7f79ff    # 2.6788658E8f

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const v1, 0x2659c3fe

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    const v1, 0x59c3fe

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, v5}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    const/16 v2, 0x20

    shl-long v2, v3, v2

    const-wide v7, 0xffffffffL

    and-long v4, v5, v7

    or-long/2addr v2, v4

    const/high16 v4, 0x44fa0000    # 2000.0f

    const/16 v5, 0x8

    invoke-static/range {v0 .. v5}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v0

    return-object v0
.end method

.method public final c()Li2/t;
    .locals 8

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-wide v3, 0xffffe3c2L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3e99999a    # 0.3f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const-wide v6, 0xff8dcdffL

    invoke-static {v6, v7}, Li2/w0;->e(J)J

    move-result-wide v6

    invoke-static {v2, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    new-instance v2, Li2/x;

    invoke-direct {v2, v6, v7}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-wide v4, 0xff101518L

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    new-instance v7, Li2/x;

    invoke-direct {v7, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v6, v4}, [Ll83/k;

    move-result-object v2

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    const/16 v4, 0x8

    invoke-static {v0, v2, v1, v3, v4}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v0

    return-object v0
.end method

.method public final d()Li2/t;
    .locals 8

    sget-object v0, Li2/t;->b:Li2/s;

    const v1, 0x4d50d5ff    # 2.1898034E8f

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    const v1, 0x4d8b62ff    # 2.923151E8f

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    const v1, 0x1a8b62ff

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    const-wide v1, 0xff101518L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v6, Li2/x;

    invoke-direct {v6, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, v5, v6}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/high16 v2, 0x447a0000    # 1000.0f

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long/2addr v2, v6

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long/2addr v2, v4

    const/high16 v4, 0x44fa0000    # 2000.0f

    const/16 v5, 0x8

    invoke-static/range {v0 .. v5}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v0

    return-object v0
.end method

.method public final e(ZLjava/lang/String;)Li2/t;
    .locals 1

    const-string v0, "sourceType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lsl0/p0;->d()Li2/t;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "WAKE_UP_REPORT"

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lsl0/p0;->c()Li2/t;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "WIND_DOWN_REPORT"

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lsl0/p0;->d()Li2/t;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lsl0/p0;->a()Li2/t;

    move-result-object p1

    return-object p1
.end method
