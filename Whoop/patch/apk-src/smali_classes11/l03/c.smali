.class public final Ll03/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll03/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Ll03/c;",
        "",
        "<init>",
        "()V",
        "",
        "yearsDifferenceScore",
        "Lc51/n;",
        "settings",
        "Ll83/k;",
        "",
        "a",
        "(DLc51/n;)Ll83/k;",
        "",
        "ageSubtitleStyle",
        "Li2/x;",
        "c",
        "(Ljava/lang/String;)J",
        "widget_release"
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
.field public static final a:Ll03/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll03/c;

    invoke-direct {v0}, Ll03/c;-><init>()V

    sput-object v0, Ll03/c;->a:Ll03/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ll03/c;DLc51/n;ILjava/lang/Object;)Ll83/k;
    .locals 15

    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_0

    new-instance v1, Lc51/n;

    const/16 v13, 0x7ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Lc51/n;-><init>(FFLc51/w;Lc51/e;Lc51/y;Lc51/t;Ljava/util/List;Ll83/k;FLc51/x;Lc51/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-wide/from16 v2, p1

    goto :goto_1

    :cond_0
    move-object/from16 v1, p3

    goto :goto_0

    :goto_1
    invoke-virtual {p0, v2, v3, v1}, Ll03/c;->a(DLc51/n;)Ll83/k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(DLc51/n;)Ll83/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Lc51/n;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "settings"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lc51/n;->f()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    mul-double/2addr p1, v0

    double-to-int v0, p1

    move-object v1, p3

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v2

    invoke-static {v0, v2}, Le93/b;->o(ILi93/g;)I

    move-result v0

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Le93/b;->W(D)I

    move-result v2

    invoke-static {v1}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v1

    invoke-static {v2, v1}, Le93/b;->o(ILi93/g;)I

    move-result v1

    int-to-double v2, v0

    sub-double/2addr p1, v2

    double-to-float p1, p1

    const/4 p2, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {p1, p2, v2}, Le93/b;->m(FFF)F

    move-result p1

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll83/k;

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll83/k;

    iget-object v0, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v0

    iget-object v1, p3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Li2/x;

    iget-wide v1, v1, Li2/x;->a:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result v1

    invoke-static {p1, v0, v1}, Lv4/a;->b(FII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Li2/x;

    iget-wide v1, p2, Li2/x;->a:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result p2

    iget-object p3, p3, Ll83/k;->x:Ljava/lang/Object;

    check-cast p3, Li2/x;

    iget-wide v1, p3, Li2/x;->a:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result p3

    invoke-static {p1, p2, p3}, Lv4/a;->b(FII)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Ll83/k;

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public final c(Ljava/lang/String;)J
    .locals 3

    invoke-static {}, Lc51/b0;->getEntries()Lt83/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lc51/b0;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lc51/b0;

    const/4 p1, -0x1

    if-nez v1, :cond_2

    move v0, p1

    goto :goto_1

    :cond_2
    sget-object v0, Ll03/c$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    :goto_1
    if-eq v0, p1, :cond_7

    const/4 p1, 0x1

    if-eq v0, p1, :cond_6

    const/4 p1, 0x2

    if-eq v0, p1, :cond_5

    const/4 p1, 0x3

    if-eq v0, p1, :cond_4

    const/4 p1, 0x4

    if-ne v0, p1, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    const-wide v0, 0xffabdee9L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :cond_5
    const-wide v0, 0xffede194L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :cond_6
    const-wide v0, 0xff05f0a2L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :cond_7
    :goto_2
    const-wide v0, 0xff71ccf1L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0
.end method
