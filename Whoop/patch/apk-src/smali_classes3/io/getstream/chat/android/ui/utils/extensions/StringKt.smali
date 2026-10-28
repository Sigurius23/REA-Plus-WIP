.class public final Lio/getstream/chat/android/ui/utils/extensions/StringKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u00002\u0010\u0008\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a)\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0001H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a/\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0010\u0008\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a/\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0010\u0008\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0000*\u00020\u00118@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "",
        "",
        "items",
        "",
        "ignoreCase",
        "Li93/j;",
        "getOccurrenceRanges",
        "(Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;",
        "",
        "typeface",
        "ranges",
        "Landroid/text/SpannableString;",
        "applyTypeface",
        "(Ljava/lang/String;ILjava/util/List;)Landroid/text/SpannableString;",
        "bold",
        "(Ljava/lang/String;Ljava/util/List;Z)Landroid/text/SpannableString;",
        "italicize",
        "Lkotlin/String$Companion;",
        "getEMPTY",
        "(Lkotlin/jvm/internal/l0;)Ljava/lang/String;",
        "EMPTY",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lyb3/k;)Li93/j;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->getOccurrenceRanges$lambda$2$lambda$1(Lyb3/k;)Li93/j;

    move-result-object p0

    return-object p0
.end method

.method public static final applyTypeface(Ljava/lang/String;ILjava/util/List;)Landroid/text/SpannableString;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Li93/j;",
            ">;)",
            "Landroid/text/SpannableString;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ranges"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li93/j;

    new-instance v1, Landroid/text/style/StyleSpan;

    invoke-direct {v1, p1}, Landroid/text/style/StyleSpan;-><init>(I)V

    iget v2, p2, Li93/h;->w:I

    iget p2, p2, Li93/h;->x:I

    add-int/lit8 p2, p2, 0x1

    const/16 v3, 0x21

    invoke-virtual {v0, v1, v2, p2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final bold(Ljava/lang/String;Ljava/util/List;Z)Landroid/text/SpannableString;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Landroid/text/SpannableString;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->getOccurrenceRanges(Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->applyTypeface(Ljava/lang/String;ILjava/util/List;)Landroid/text/SpannableString;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic bold$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Landroid/text/SpannableString;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->bold(Ljava/lang/String;Ljava/util/List;Z)Landroid/text/SpannableString;

    move-result-object p0

    return-object p0
.end method

.method public static final getEMPTY(Lkotlin/jvm/internal/l0;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, ""

    return-object p0
.end method

.method public static final getOccurrenceRanges(Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Ljava/util/List<",
            "Li93/j;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyb3/q;->x:Lyb3/q;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    goto :goto_1

    :cond_1
    sget-object p2, Lm83/a0;->w:Lm83/a0;

    :goto_1
    if-eqz p1, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lyb3/p;

    const-string v3, "literal"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "quote(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1, p2}, Lyb3/p;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-static {p0, v2}, Lyb3/p;->b(Ljava/lang/CharSequence;Lyb3/p;)Lx83/h;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    invoke-static {v1, v2}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v1

    invoke-interface {v1}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    return-object v0

    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p1, p0}, Le93/b;->i0(II)Li93/j;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getOccurrenceRanges$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->getOccurrenceRanges(Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final getOccurrenceRanges$lambda$2$lambda$1(Lyb3/k;)Li93/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lyb3/n;

    invoke-virtual {p0}, Lyb3/n;->b()Li93/j;

    move-result-object p0

    return-object p0
.end method

.method public static final italicize(Ljava/lang/String;Ljava/util/List;Z)Landroid/text/SpannableString;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Landroid/text/SpannableString;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->getOccurrenceRanges(Ljava/lang/String;Ljava/util/List;Z)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->applyTypeface(Ljava/lang/String;ILjava/util/List;)Landroid/text/SpannableString;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic italicize$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Landroid/text/SpannableString;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->italicize(Ljava/lang/String;Ljava/util/List;Z)Landroid/text/SpannableString;

    move-result-object p0

    return-object p0
.end method
