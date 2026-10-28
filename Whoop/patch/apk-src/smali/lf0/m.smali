.class public final Llf0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0019\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010 \u001a\u0004\u0008\u001d\u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001e\u001a\u0004\u0008#\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001e\u001a\u0004\u0008$\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008%\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Llf0/m;",
        "Lm91/u;",
        "Lld0/d;",
        "appointmentSummary",
        "Lny0/h;",
        "addToCalendarButton",
        "Lld0/c;",
        "addToCalendarData",
        "cancelRescheduleButton",
        "downloadLabOrderButton",
        "Llf0/v;",
        "cancelRescheduleDialog",
        "<init>",
        "(Lld0/d;Lny0/h;Lld0/c;Lny0/h;Lny0/h;Llf0/v;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lld0/d;",
        "c",
        "()Lld0/d;",
        "b",
        "Lny0/h;",
        "()Lny0/h;",
        "Lld0/c;",
        "()Lld0/c;",
        "d",
        "e",
        "g",
        "f",
        "Llf0/v;",
        "()Llf0/v;",
        "advanced-labs_release"
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
.field public static final g:I


# instance fields
.field private final a:Lld0/d;

.field private final b:Lny0/h;

.field private final c:Lld0/c;

.field private final d:Lny0/h;

.field private final e:Lny0/h;

.field private final f:Llf0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lny0/h;->z:I

    sget v1, Lkd1/o;->a:I

    or-int/2addr v0, v1

    sput v0, Llf0/m;->g:I

    return-void
.end method

.method public constructor <init>(Lld0/d;Lny0/h;Lld0/c;Lny0/h;Lny0/h;Llf0/v;)V
    .locals 1

    const-string v0, "appointmentSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llf0/m;->a:Lld0/d;

    iput-object p2, p0, Llf0/m;->b:Lny0/h;

    iput-object p3, p0, Llf0/m;->c:Lld0/c;

    iput-object p4, p0, Llf0/m;->d:Lny0/h;

    iput-object p5, p0, Llf0/m;->e:Lny0/h;

    iput-object p6, p0, Llf0/m;->f:Llf0/v;

    return-void
.end method


# virtual methods
.method public final a()Lny0/h;
    .locals 1

    iget-object v0, p0, Llf0/m;->b:Lny0/h;

    return-object v0
.end method

.method public final b()Lld0/c;
    .locals 1

    iget-object v0, p0, Llf0/m;->c:Lld0/c;

    return-object v0
.end method

.method public final c()Lld0/d;
    .locals 1

    iget-object v0, p0, Llf0/m;->a:Lld0/d;

    return-object v0
.end method

.method public final e()Lny0/h;
    .locals 1

    iget-object v0, p0, Llf0/m;->d:Lny0/h;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llf0/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llf0/m;

    iget-object v1, p0, Llf0/m;->a:Lld0/d;

    iget-object v3, p1, Llf0/m;->a:Lld0/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llf0/m;->b:Lny0/h;

    iget-object v3, p1, Llf0/m;->b:Lny0/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llf0/m;->c:Lld0/c;

    iget-object v3, p1, Llf0/m;->c:Lld0/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llf0/m;->d:Lny0/h;

    iget-object v3, p1, Llf0/m;->d:Lny0/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llf0/m;->e:Lny0/h;

    iget-object v3, p1, Llf0/m;->e:Lny0/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llf0/m;->f:Llf0/v;

    iget-object p1, p1, Llf0/m;->f:Llf0/v;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Llf0/v;
    .locals 1

    iget-object v0, p0, Llf0/m;->f:Llf0/v;

    return-object v0
.end method

.method public final g()Lny0/h;
    .locals 1

    iget-object v0, p0, Llf0/m;->e:Lny0/h;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llf0/m;->a:Lld0/d;

    invoke-virtual {v0}, Lld0/d;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llf0/m;->b:Lny0/h;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lny0/h;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llf0/m;->c:Lld0/c;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lld0/c;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llf0/m;->d:Lny0/h;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lny0/h;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llf0/m;->e:Lny0/h;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lny0/h;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llf0/m;->f:Llf0/v;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Llf0/v;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Llf0/m;->a:Lld0/d;

    iget-object v1, p0, Llf0/m;->b:Lny0/h;

    iget-object v2, p0, Llf0/m;->c:Lld0/c;

    iget-object v3, p0, Llf0/m;->d:Lny0/h;

    iget-object v4, p0, Llf0/m;->e:Lny0/h;

    iget-object v5, p0, Llf0/m;->f:Llf0/v;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AppointmentSummaryChecklistItemState(appointmentSummary="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", addToCalendarButton="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", addToCalendarData="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cancelRescheduleButton="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", downloadLabOrderButton="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cancelRescheduleDialog="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
