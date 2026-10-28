.class public final Lav2/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lav2/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lav2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lav2/e$b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lav2/e$b;",
        "Lav2/e;",
        "Lcom/whoop/design/util/TextResource;",
        "workoutNameText",
        "",
        "textFieldIsError",
        "textFieldErrorMsg",
        "ctaEnabled",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "d",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Z",
        "c",
        "()Z",
        "e",
        "weightlifting_release"
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
.field public static final e:Lav2/e$b$a;

.field public static final f:I

.field private static final g:Lav2/e$b;


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Z

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lav2/e$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lav2/e$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lav2/e$b;->e:Lav2/e$b$a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lav2/e$b;->f:I

    new-instance v0, Lav2/e$b;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, v2}, Lav2/e$b;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V

    sput-object v0, Lav2/e$b;->g:Lav2/e$b;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V
    .locals 1

    const-string v0, "workoutNameText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textFieldErrorMsg"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lav2/e$b;->a:Lcom/whoop/design/util/TextResource;

    iput-boolean p2, p0, Lav2/e$b;->b:Z

    iput-object p3, p0, Lav2/e$b;->c:Lcom/whoop/design/util/TextResource;

    iput-boolean p4, p0, Lav2/e$b;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lav2/e$b;->d:Z

    return v0
.end method

.method public final b()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lav2/e$b;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lav2/e$b;->b:Z

    return v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lav2/e$b;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lav2/e$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lav2/e$b;

    iget-object v1, p0, Lav2/e$b;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lav2/e$b;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lav2/e$b;->b:Z

    iget-boolean v3, p1, Lav2/e$b;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lav2/e$b;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lav2/e$b;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lav2/e$b;->d:Z

    iget-boolean p1, p1, Lav2/e$b;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lav2/e$b;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lav2/e$b;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lav2/e$b;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v1, p0, Lav2/e$b;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lav2/e$b;->a:Lcom/whoop/design/util/TextResource;

    iget-boolean v1, p0, Lav2/e$b;->b:Z

    iget-object v2, p0, Lav2/e$b;->c:Lcom/whoop/design/util/TextResource;

    iget-boolean v3, p0, Lav2/e$b;->d:Z

    const-string v4, ", textFieldIsError="

    const-string v5, ", textFieldErrorMsg="

    const-string v6, "Loaded(workoutNameText="

    invoke-static {v6, v0, v4, v1, v5}, Lq63/c;->p(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
