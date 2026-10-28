.class public final Lbk2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010 \u001a\u0004\u0008!\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\"\u0010$R\u0017\u0010\u000c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010#\u001a\u0004\u0008%\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008\u0019\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lbk2/c;",
        "",
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "calendarState",
        "Li11/f;",
        "dateSelectorState",
        "",
        "leftIcon",
        "Lcom/whoop/design/util/TextResource;",
        "leftText",
        "rightText",
        "",
        "calendarInitialState",
        "<init>",
        "(Lh91/b;Li11/f;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lh91/b;",
        "b",
        "()Lh91/b;",
        "Li11/f;",
        "c",
        "()Li11/f;",
        "I",
        "getLeftIcon",
        "d",
        "Lcom/whoop/design/util/TextResource;",
        "()Lcom/whoop/design/util/TextResource;",
        "e",
        "f",
        "Z",
        "()Z",
        "tilt-graph_release"
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
.field private final a:Lh91/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Li11/f;

.field private final c:I

.field private final d:Lcom/whoop/design/util/TextResource;

.field private final e:Lcom/whoop/design/util/TextResource;

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v1, Li11/f;->k:I

    or-int/2addr v0, v1

    sget v1, Lh91/b;->k:I

    or-int/2addr v0, v1

    sput v0, Lbk2/c;->g:I

    return-void
.end method

.method public constructor <init>(Lh91/b;Li11/f;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;",
            "Li11/f;",
            "I",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Z)V"
        }
    .end annotation

    const-string v0, "dateSelectorState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbk2/c;->a:Lh91/b;

    .line 3
    iput-object p2, p0, Lbk2/c;->b:Li11/f;

    .line 4
    iput p3, p0, Lbk2/c;->c:I

    .line 5
    iput-object p4, p0, Lbk2/c;->d:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p5, p0, Lbk2/c;->e:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-boolean p6, p0, Lbk2/c;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(Lh91/b;Li11/f;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Lbk2/c;-><init>(Lh91/b;Li11/f;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lbk2/c;->f:Z

    return v0
.end method

.method public final b()Lh91/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbk2/c;->a:Lh91/b;

    return-object v0
.end method

.method public final c()Li11/f;
    .locals 1

    iget-object v0, p0, Lbk2/c;->b:Li11/f;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lbk2/c;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lbk2/c;->e:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbk2/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lbk2/c;

    iget-object v1, p0, Lbk2/c;->a:Lh91/b;

    iget-object v3, p1, Lbk2/c;->a:Lh91/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lbk2/c;->b:Li11/f;

    iget-object v3, p1, Lbk2/c;->b:Li11/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lbk2/c;->c:I

    iget v3, p1, Lbk2/c;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lbk2/c;->d:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lbk2/c;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lbk2/c;->e:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lbk2/c;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lbk2/c;->f:Z

    iget-boolean p1, p1, Lbk2/c;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lbk2/c;->a:Lh91/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lh91/b;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lbk2/c;->b:Li11/f;

    invoke-virtual {v2}, Li11/f;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lbk2/c;->c:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lbk2/c;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lbk2/c;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v1, p0, Lbk2/c;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lbk2/c;->a:Lh91/b;

    iget-object v1, p0, Lbk2/c;->b:Li11/f;

    iget v2, p0, Lbk2/c;->c:I

    iget-object v3, p0, Lbk2/c;->d:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lbk2/c;->e:Lcom/whoop/design/util/TextResource;

    iget-boolean v5, p0, Lbk2/c;->f:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "TiltGraphToolbarState(calendarState="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dateSelectorState="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leftIcon="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", leftText="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rightText="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", calendarInitialState="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
