.class public final Lft1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lft1/d;",
        "",
        "Ltr2/n;",
        "logger",
        "Li92/e;",
        "networkMonitor",
        "<init>",
        "(Ltr2/n;Li92/e;)V",
        "Ldt1/g$g;",
        "state",
        "Lft1/c$g;",
        "c",
        "(Ldt1/g$g;)Lft1/c$g;",
        "",
        "",
        "samples",
        "Lh71/j;",
        "b",
        "(Ljava/util/List;)Lh71/j;",
        "Ldt1/g;",
        "domainState",
        "Lft1/c;",
        "a",
        "(Ldt1/g;)Lft1/c;",
        "Ltr2/n;",
        "Li92/e;",
        "labrador_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ltr2/n;

.field private final b:Li92/e;


# direct methods
.method public constructor <init>(Ltr2/n;Li92/e;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkMonitor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lft1/d;->a:Ltr2/n;

    .line 3
    iput-object p2, p0, Lft1/d;->b:Li92/e;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;Li92/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 4
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "LabradorReducer"

    invoke-virtual {p1, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lft1/d;-><init>(Ltr2/n;Li92/e;)V

    return-void
.end method

.method private final b(Ljava/util/List;)Lh71/j;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)",
            "Lh71/j;"
        }
    .end annotation

    const/high16 v0, -0x3b860000    # -1000.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 v1, 0x44fa0000    # 2000.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lrk1/b;->a(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;)Lj71/b$g;

    move-result-object v2

    invoke-virtual {v2}, Lj71/b$g;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu61/a;

    if-nez v0, :cond_0

    new-instance v3, Lu61/a;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    new-instance v8, Li71/d;

    const/16 v0, 0xa

    const/4 v1, 0x0

    const/4 v11, 0x2

    invoke-direct {v8, v0, v1, v11, v1}, Li71/d;-><init>(ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lu61/a;->b(Lu61/a;Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILjava/lang/Object;)Lu61/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v9, 0x3e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lj71/b$g;->f(Lj71/b$g;Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILjava/lang/Object;)Lj71/b$g;

    move-result-object v0

    new-instance v1, Lh71/j;

    new-instance v2, Lh71/k;

    const/16 v9, 0x3f

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v10}, Lh71/k;-><init>(Lg61/b;Lh2/c;Lj61/g;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lft1/e;->b()Lj71/b$h;

    move-result-object v3

    invoke-static {}, Lft1/e;->a()Lj71/b$m;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Lj71/b;

    aput-object v3, v5, v6

    const/4 v3, 0x1

    aput-object v4, v5, v3

    aput-object v0, v5, v11

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v5, Li71/e$b;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/high16 v4, 0x41700000    # 15.0f

    float-to-int v0, v4

    div-int/2addr p1, v0

    invoke-direct {v5, p1}, Li71/e$b;-><init>(I)V

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh71/j;-><init>(Lh71/k;Ljava/util/List;FLi71/e;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final c(Ldt1/g$g;)Lft1/c$g;
    .locals 30

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Ldt1/g$g;->d()Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v1

    new-instance v2, Lft1/c$g;

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getTimestampTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getSamples()Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v4}, Lft1/d;->b(Ljava/util/List;)Lh71/j;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getDeterminationTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getReadings()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getInsightBody()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getAverageHr()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getShareText()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getDisclaimerText()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getAddNotesText()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getRemoveReadingText()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    iget-object v5, v0, Lft1/d;->b:Li92/e;

    invoke-interface {v5}, Li92/e;->isConnected()Z

    move-result v15

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getTimestamp()Ljava/time/Instant;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getSavedSymptoms()Ljava/util/List;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getSavedNotes()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Ldt1/g$g;->c()Ldt1/a;

    move-result-object v21

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getPdfPresignedUrl()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {p1 .. p1}, Ldt1/g$g;->e()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getProtectYourPrivacyTitle()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object/from16 v24, v5

    goto :goto_0

    :cond_0
    move-object/from16 v24, v6

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->getProtectYourPrivacyDescription()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    :cond_1
    move-object/from16 v25, v6

    invoke-virtual/range {p1 .. p1}, Ldt1/g$g;->f()Z

    move-result v26

    const v28, 0x810004

    const/16 v29, 0x0

    const-wide/16 v5, 0x0

    const/16 v20, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v2 .. v29}, Lft1/c$g;-><init>(Lcom/whoop/design/util/TextResource;Lh71/j;JLcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Lrt1/k;Ldt1/a;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLv41/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method


# virtual methods
.method public final a(Ldt1/g;)Lft1/c;
    .locals 4

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ldt1/g$d;

    if-eqz v0, :cond_0

    sget-object p1, Lft1/c$d;->a:Lft1/c$d;

    return-object p1

    :cond_0
    instance-of v0, p1, Ldt1/g$g;

    if-eqz v0, :cond_1

    check-cast p1, Ldt1/g$g;

    invoke-direct {p0, p1}, Lft1/d;->c(Ldt1/g$g;)Lft1/c$g;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, Ldt1/g$h;->a:Ldt1/g$h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lft1/c$h;->a:Lft1/c$h;

    return-object p1

    :cond_2
    sget-object v0, Ldt1/g$j;->a:Ldt1/g$j;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lft1/c$j;->a:Lft1/c$j;

    return-object p1

    :cond_3
    sget-object v0, Ldt1/g$i;->a:Ldt1/g$i;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lft1/c$i;->a:Lft1/c$i;

    return-object p1

    :cond_4
    instance-of v0, p1, Ldt1/g$k;

    if-eqz v0, :cond_5

    new-instance v0, Lft1/c$k;

    check-cast p1, Ldt1/g$k;

    invoke-virtual {p1}, Ldt1/g$k;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ldt1/g$k;->d()Ljava/time/Instant;

    move-result-object v2

    invoke-virtual {p1}, Ldt1/g$k;->c()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Ldt1/g$k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lft1/c$k;-><init>(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V

    return-object v0

    :cond_5
    instance-of v0, p1, Ldt1/g$a;

    if-eqz v0, :cond_6

    new-instance v0, Lft1/c$a;

    check-cast p1, Ldt1/g$a;

    invoke-virtual {p1}, Ldt1/g$a;->a()Ljava/time/Instant;

    move-result-object p1

    invoke-direct {v0, p1}, Lft1/c$a;-><init>(Ljava/time/Instant;)V

    return-object v0

    :cond_6
    instance-of v0, p1, Ldt1/g$c;

    if-eqz v0, :cond_7

    sget-object p1, Lft1/c$c;->a:Lft1/c$c;

    return-object p1

    :cond_7
    sget-object v0, Ldt1/g$b;->a:Ldt1/g$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p1, Lft1/c$b;->a:Lft1/c$b;

    return-object p1

    :cond_8
    sget-object v0, Ldt1/g$f;->a:Ldt1/g$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p1, Lft1/c$f;->a:Lft1/c$f;

    return-object p1

    :cond_9
    sget-object v0, Ldt1/g$e;->a:Ldt1/g$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object p1, Lft1/c$e;->a:Lft1/c$e;

    return-object p1

    :cond_a
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p1, Lft1/c$e;->a:Lft1/c$e;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
