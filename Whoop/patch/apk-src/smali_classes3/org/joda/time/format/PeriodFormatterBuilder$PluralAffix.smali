.class Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;
.super Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/format/PeriodFormatterBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PluralAffix"
.end annotation


# instance fields
.field private final iPluralText:Ljava/lang/String;

.field private final iSingularText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;-><init>()V

    iput-object p1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iSingularText:Ljava/lang/String;

    iput-object p2, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iPluralText:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public calculatePrintedLength(I)I
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iSingularText:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iPluralText:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1
.end method

.method public getAffixes()[Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iSingularText:Ljava/lang/String;

    iget-object v1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iPluralText:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public parse(Ljava/lang/String;I)I
    .locals 10

    iget-object v0, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iPluralText:Ljava/lang/String;

    iget-object v1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iSingularText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    move-object v3, v0

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object v7, v0

    move-object v3, v1

    :goto_0
    const/4 v8, 0x0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v5, 0x1

    move-object v4, p1

    move v6, p2

    invoke-virtual/range {v4 .. v9}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    move-object v0, v4

    move v2, v6

    if-eqz p1, :cond_1

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1, v0, v2}, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;->matchesOtherAffix(ILjava/lang/String;I)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result p1

    :goto_1
    add-int/2addr p1, v2

    return p1

    :cond_1
    const/4 v4, 0x0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v1, 0x1

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1, v0, v2}, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;->matchesOtherAffix(ILjava/lang/String;I)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p1

    goto :goto_1

    :cond_2
    not-int p1, v2

    return p1
.end method

.method public printTo(Ljava/io/Writer;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 2
    iget-object p2, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iSingularText:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iPluralText:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public printTo(Ljava/lang/StringBuffer;I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 1
    iget-object p2, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iSingularText:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iPluralText:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method

.method public scan(Ljava/lang/String;I)I
    .locals 11

    iget-object v0, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iPluralText:Ljava/lang/String;

    iget-object v1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$PluralAffix;->iSingularText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    move-object v3, v0

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object v7, v0

    move-object v3, v1

    :goto_0
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v10

    move v2, p2

    :goto_1
    if-ge v2, v10, :cond_3

    const/4 v5, 0x1

    const/4 v8, 0x0

    move-object v4, p1

    move v6, v2

    invoke-virtual/range {v4 .. v9}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1, v4, v2}, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;->matchesOtherAffix(ILjava/lang/String;I)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    move v5, v0

    move-object v0, v4

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1, v0, v2}, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;->matchesOtherAffix(ILjava/lang/String;I)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_2
    return v2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    move-object p1, v0

    move v0, v5

    goto :goto_1

    :cond_3
    not-int p1, p2

    return p1
.end method
