.class public final Lh91/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh91/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 #2\u00020\u0001:\u0001\u0017B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001b\u001a\u0004\u0008\u0017\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001b\u001a\u0004\u0008\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u001cR\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lh91/a;",
        "",
        "Ljava/util/Locale;",
        "locale",
        "Ljava/time/LocalDate;",
        "currentDate",
        "selectedDate",
        "monthDate",
        "",
        "Lk71/d;",
        "legendList",
        "<init>",
        "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/util/Locale;",
        "b",
        "()Ljava/util/Locale;",
        "Ljava/time/LocalDate;",
        "()Ljava/time/LocalDate;",
        "c",
        "d",
        "e",
        "Ljava/util/List;",
        "getLegendList",
        "()Ljava/util/List;",
        "f",
        "design-models_release"
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
.field public static final f:Lh91/a$a;

.field public static final g:I


# instance fields
.field private final a:Ljava/util/Locale;

.field private final b:Ljava/time/LocalDate;

.field private final c:Ljava/time/LocalDate;

.field private final d:Ljava/time/LocalDate;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk71/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh91/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh91/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh91/a;->f:Lh91/a$a;

    const/16 v0, 0x8

    sput v0, Lh91/a;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Locale;",
            "Ljava/time/LocalDate;",
            "Ljava/time/LocalDate;",
            "Ljava/time/LocalDate;",
            "Ljava/util/List<",
            "Lk71/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedDate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "monthDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legendList"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh91/a;->a:Ljava/util/Locale;

    iput-object p2, p0, Lh91/a;->b:Ljava/time/LocalDate;

    iput-object p3, p0, Lh91/a;->c:Ljava/time/LocalDate;

    iput-object p4, p0, Lh91/a;->d:Ljava/time/LocalDate;

    iput-object p5, p0, Lh91/a;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lh91/a;->b:Ljava/time/LocalDate;

    return-object v0
.end method

.method public final b()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lh91/a;->a:Ljava/util/Locale;

    return-object v0
.end method

.method public final c()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lh91/a;->d:Ljava/time/LocalDate;

    return-object v0
.end method

.method public final d()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lh91/a;->c:Ljava/time/LocalDate;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh91/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh91/a;

    iget-object v1, p0, Lh91/a;->a:Ljava/util/Locale;

    iget-object v3, p1, Lh91/a;->a:Ljava/util/Locale;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh91/a;->b:Ljava/time/LocalDate;

    iget-object v3, p1, Lh91/a;->b:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lh91/a;->c:Ljava/time/LocalDate;

    iget-object v3, p1, Lh91/a;->c:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lh91/a;->d:Ljava/time/LocalDate;

    iget-object v3, p1, Lh91/a;->d:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lh91/a;->e:Ljava/util/List;

    iget-object p1, p1, Lh91/a;->e:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lh91/a;->a:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh91/a;->b:Ljava/time/LocalDate;

    invoke-static {v2, v0, v1}, Lev/n;->e(Ljava/time/LocalDate;II)I

    move-result v0

    iget-object v2, p0, Lh91/a;->c:Ljava/time/LocalDate;

    invoke-static {v2, v0, v1}, Lev/n;->e(Ljava/time/LocalDate;II)I

    move-result v0

    iget-object v2, p0, Lh91/a;->d:Ljava/time/LocalDate;

    invoke-static {v2, v0, v1}, Lev/n;->e(Ljava/time/LocalDate;II)I

    move-result v0

    iget-object v1, p0, Lh91/a;->e:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lh91/a;->a:Ljava/util/Locale;

    iget-object v1, p0, Lh91/a;->b:Ljava/time/LocalDate;

    iget-object v2, p0, Lh91/a;->c:Ljava/time/LocalDate;

    iget-object v3, p0, Lh91/a;->d:Ljava/time/LocalDate;

    iget-object v4, p0, Lh91/a;->e:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CalendarMonthState(locale="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentDate="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedDate="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", monthDate="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", legendList="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
