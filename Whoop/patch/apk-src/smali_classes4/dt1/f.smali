.class public final Ldt1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Ldt1/f;",
        "",
        "Ljava/time/ZoneId;",
        "zone",
        "<init>",
        "(Ljava/time/ZoneId;)V",
        "Lqk1/a;",
        "model",
        "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;",
        "a",
        "(Lqk1/a;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;",
        "Ljava/time/format/DateTimeFormatter;",
        "Ljava/time/format/DateTimeFormatter;",
        "printer",
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
.field private final a:Ljava/time/format/DateTimeFormatter;


# direct methods
.method public constructor <init>(Ljava/time/ZoneId;)V
    .locals 2

    const-string v0, "zone"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "MMM d, yyyy h:mm:ss a"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object p1

    const-string v0, "withZone(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ldt1/f;->a:Ljava/time/format/DateTimeFormatter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/time/ZoneId;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object p1

    const-string p2, "systemDefault(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ldt1/f;-><init>(Ljava/time/ZoneId;)V

    return-void
.end method


# virtual methods
.method public final a(Lqk1/a;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;
    .locals 24

    const-string v0, "model"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrk1/c;->Companion:Lrk1/c$a;

    invoke-virtual {v1}, Lqk1/a;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Lrk1/c$a;->a(I)Lrk1/c;

    move-result-object v0

    move-object/from16 v2, p0

    iget-object v3, v2, Ldt1/f;->a:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {v1}, Lqk1/a;->i()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lqk1/a;->g()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    new-instance v6, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    int-to-double v7, v4

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lrk1/c;->getDisplayTitle()I

    move-result v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    invoke-virtual {v0}, Lrk1/c;->getDeterminations()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v0}, Lrk1/c;->getDisplayBody()I

    move-result v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    invoke-virtual {v1}, Lqk1/a;->a()F

    move-result v0

    float-to-int v0, v0

    invoke-static {v0}, Lrs1/a;->a(I)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lqk1/a;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lrs1/f;->l:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    :goto_1
    move-object v13, v0

    goto :goto_2

    :cond_1
    sget v0, Lrs1/f;->m:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    goto :goto_1

    :goto_2
    invoke-virtual {v1}, Lqk1/a;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v0

    const-string v3, "ofEpochMilli(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lqk1/a;->h()Ljava/util/List;

    move-result-object v17

    invoke-virtual {v1}, Lqk1/a;->c()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lqk1/a;->d()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lqk1/a;->f()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lqk1/a;->e()Ljava/lang/String;

    move-result-object v21

    new-instance v4, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const-string v15, ""

    const/16 v22, 0x2c0

    const/16 v23, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v4 .. v23}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method
