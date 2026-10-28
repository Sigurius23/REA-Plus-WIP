.class public abstract Lmo0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0015\u0010\u0008\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001f\u0010\r\u001a\u0004\u0018\u00010\u000c*\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/form/FormTextFieldModel;",
        "Lio0/r;",
        "fieldValue",
        "Llo0/c0;",
        "b",
        "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lio0/r;)Llo0/c0;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "d",
        "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;",
        "Lcom/whoop/design/models/items/form/FormSheetModel;",
        "currentValue",
        "Llo0/d0;",
        "c",
        "(Lcom/whoop/design/models/items/form/FormSheetModel;Ljava/lang/String;)Llo0/d0;",
        "iso",
        "Ljava/time/LocalDate;",
        "a",
        "(Ljava/lang/String;)Ljava/time/LocalDate;",
        "",
        "f",
        "(Ljava/time/LocalDate;)J",
        "e",
        "(Ljava/time/LocalDate;)Ljava/lang/String;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "clinician-in-the-loop_release"
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
.field private static final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "DateFormTextFieldMapper"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lmo0/f;->a:Ltr2/n;

    return-void
.end method

.method private static final a(Ljava/lang/String;)Ljava/time/LocalDate;
    .locals 3

    :try_start_0
    invoke-static {p0}, Ljava/time/OffsetDateTime;->parse(Ljava/lang/CharSequence;)Ljava/time/OffsetDateTime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/OffsetDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object p0
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :try_start_1
    invoke-static {p0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object p0
    :try_end_1
    .catch Ljava/time/format/DateTimeParseException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    sget-object v1, Lmo0/f;->a:Ltr2/n;

    const-string v2, "Failed to parse ISO date string: "

    invoke-static {v2, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, p0, v0, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lio0/r;)Llo0/c0;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio0/r;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getText()Ljava/lang/String;

    move-result-object v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio0/r;->e()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    :goto_0
    move v7, v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lio0/r;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    :cond_4
    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v2, Llo0/c0;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v0}, Lmo0/f;->d(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getDisabled()Z

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->getSelectionSheet()Lcom/whoop/design/models/items/form/FormSheetModel;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0, v0}, Lmo0/f;->c(Lcom/whoop/design/models/items/form/FormSheetModel;Ljava/lang/String;)Llo0/d0;

    move-result-object p0

    :goto_2
    move-object v9, p0

    goto :goto_3

    :cond_5
    const/4 p0, 0x0

    goto :goto_2

    :goto_3
    invoke-direct/range {v2 .. v9}, Llo0/c0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLlo0/d0;)V

    return-object v2
.end method

.method private static final c(Lcom/whoop/design/models/items/form/FormSheetModel;Ljava/lang/String;)Llo0/d0;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormSheetModel;->getContent()Lcom/whoop/design/models/items/form/FormSheetContent;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/models/items/form/FormSheetDateContent;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/design/models/items/form/FormSheetDateContent;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormSheetDateContent;->getDateLowerBound()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lmo0/f;->a(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lmo0/f;->f(Ljava/time/LocalDate;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v9, v1

    goto :goto_1

    :cond_2
    move-object v9, v2

    :goto_1
    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormSheetDateContent;->getDateUpperBound()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lmo0/f;->a(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lmo0/f;->f(Ljava/time/LocalDate;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v10, v1

    goto :goto_2

    :cond_3
    move-object v10, v2

    :goto_2
    if-eqz p1, :cond_4

    invoke-static {p1}, Lmo0/f;->a(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, Lmo0/f;->f(Ljava/time/LocalDate;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :goto_3
    move-object v6, p1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormSheetDateContent;->getStartingDate()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lmo0/f;->a(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lmo0/f;->f(Ljava/time/LocalDate;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_3

    :cond_5
    move-object v6, v2

    :goto_4
    const/4 p1, 0x1

    if-eqz v9, :cond_6

    if-eqz v10, :cond_6

    new-instance v0, Li93/j;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v1

    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-virtual {v1, v3}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getYear()I

    move-result v1

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v3

    invoke-virtual {v3}, Ljava/time/ZonedDateTime;->getYear()I

    move-result v3

    invoke-direct {v0, v1, v3, p1}, Li93/h;-><init>(III)V

    move-object v8, v0

    goto :goto_5

    :cond_6
    move-object v8, v2

    :goto_5
    new-instance v3, Llo0/d0;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormSheetModel;->getCancelButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    invoke-static {v0, v2, p1, v2}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/form/FormSheetModel;->getConfirmButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object p0

    invoke-static {p0, v2, p1, v2}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v5

    move-object v7, v6

    invoke-direct/range {v3 .. v10}, Llo0/d0;-><init>(Lny0/h;Lny0/h;Ljava/lang/Long;Ljava/lang/Long;Li93/j;Ljava/lang/Long;Ljava/lang/Long;)V

    return-object v3
.end method

.method private static final d(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 1

    if-eqz p0, :cond_3

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_3

    invoke-static {p0}, Lmo0/f;->a(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lmo0/f;->e(Ljava/time/LocalDate;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    if-eqz p0, :cond_3

    return-object p0

    :cond_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljava/time/LocalDate;)Ljava/lang/String;
    .locals 4

    :try_start_0
    sget-object v0, Ljava/time/format/FormatStyle;->LONG:Ljava/time/format/FormatStyle;

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofLocalizedDate(Ljava/time/format/FormatStyle;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/time/LocalDate;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    sget-object v1, Lmo0/f;->a:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to format LocalDate for display: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, p0, v0, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final f(Ljava/time/LocalDate;)J
    .locals 2

    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-virtual {p0, v0}, Ljava/time/LocalDate;->atStartOfDay(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p0

    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    move-result-object p0

    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v0

    return-wide v0
.end method
