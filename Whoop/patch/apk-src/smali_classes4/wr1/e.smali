.class public final Lwr1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lwr1/b;",
        "Lwr1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J1\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000c2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lwr1/e;",
        "Lod1/g;",
        "Lwr1/b;",
        "Lwr1/c;",
        "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;Ltr2/n;Lzr2/a;)V",
        "",
        "date",
        "Lec3/l;",
        "g",
        "(Ltr2/n;Ljava/lang/String;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lwr1/d;",
        "domainState",
        "selectedDate",
        "currentDate",
        "",
        "hasUserEditJournal",
        "h",
        "(Lwr1/d;Ljava/lang/String;Ljava/lang/String;Z)Lwr1/c;",
        "a",
        "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lzr2/a;",
        "journal_release"
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
.field private final a:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;

.field private final b:Ltr2/n;

.field private final c:Lzr2/a;


# direct methods
.method public constructor <init>(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;Ltr2/n;Lzr2/a;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwr1/e;->a:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;

    iput-object p2, p0, Lwr1/e;->b:Ltr2/n;

    iput-object p3, p0, Lwr1/e;->c:Lzr2/a;

    return-void
.end method

.method public static final synthetic c(Lwr1/e;Ltr2/n;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwr1/e;->g(Ltr2/n;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lwr1/e;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;
    .locals 0

    iget-object p0, p0, Lwr1/e;->a:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerApi;

    return-object p0
.end method

.method public static final synthetic e(Lwr1/e;)Lzr2/a;
    .locals 0

    iget-object p0, p0, Lwr1/e;->c:Lzr2/a;

    return-object p0
.end method

.method public static final synthetic f(Lwr1/e;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lwr1/e;->b:Ltr2/n;

    return-object p0
.end method

.method private final g(Ltr2/n;Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr2/n;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lwr1/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p0, v1}, Lwr1/e$a;-><init>(Ltr2/n;Ljava/lang/String;Lwr1/e;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public final h(Lwr1/d;Ljava/lang/String;Ljava/lang/String;Z)Lwr1/c;
    .locals 7

    const-string p3, "domainState"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "selectedDate"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lwr1/c;

    sget-object p4, Lwr1/d$a;->a:Lwr1/d$a;

    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p4, Lwr1/d$b;->a:Lwr1/d$b;

    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of p4, p1, Lwr1/d$c;

    if-eqz p4, :cond_2

    new-instance p4, Lwr1/d$c;

    check-cast p1, Lwr1/d$c;

    invoke-virtual {p1}, Lwr1/d$c;->a()Lwr1/a;

    move-result-object v0

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lwr1/a;->b(Lwr1/a;Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;Ljava/lang/String;Ljava/util/Map;ZILjava/lang/Object;)Lwr1/a;

    move-result-object p1

    invoke-direct {p4, p1}, Lwr1/d$c;-><init>(Lwr1/a;)V

    :goto_0
    invoke-direct {p3, p4}, Lwr1/c;-><init>(Lwr1/d;)V

    return-object p3

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public interact(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwr1/c;

    sget-object v1, Lwr1/d$b;->a:Lwr1/d$b;

    invoke-direct {v0, v1}, Lwr1/c;-><init>(Lwr1/d;)V

    new-instance v1, Lwr1/e$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lwr1/e$b;-><init>(Lwr1/e;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
