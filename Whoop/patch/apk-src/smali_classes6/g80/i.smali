.class public final Lg80/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg80/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lg80/i;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "loginErrorTitle",
        "loginErrorDescription",
        "",
        "analyticsName",
        "Lg80/h;",
        "displayType",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lg80/h;)V",
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
        "Lcom/whoop/design/util/TextResource;",
        "h",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "g",
        "c",
        "Ljava/lang/String;",
        "e",
        "d",
        "Lg80/h;",
        "f",
        "()Lg80/h;",
        "activation_release"
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
.field public static final e:Lg80/i$a;

.field public static final f:I

.field private static final g:Lg80/i;

.field private static final h:Lg80/i;

.field private static final i:Lg80/i;

.field private static final j:Lg80/i;


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Ljava/lang/String;

.field private final d:Lg80/h;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lg80/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg80/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lg80/i;->e:Lg80/i$a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lg80/i;->f:I

    new-instance v2, Lg80/i;

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lx60/b;->X:I

    const/4 v9, 0x2

    invoke-direct {v3, v0, v1, v9, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lx60/b;->E:I

    invoke-direct {v4, v0, v1, v9, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v7, 0x8

    const/4 v8, 0x0

    const-string v5, "generic_error"

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lg80/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lg80/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lg80/i;->g:Lg80/i;

    new-instance v10, Lg80/i;

    new-instance v11, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lx60/b;->X:I

    invoke-direct {v11, v0, v1, v9, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lx60/b;->H:I

    invoke-direct {v12, v0, v1, v9, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v15, 0x8

    const/16 v16, 0x0

    const-string v13, "email_password_incorrect"

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lg80/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lg80/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Lg80/i;->h:Lg80/i;

    new-instance v2, Lg80/i;

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lx60/b;->X:I

    invoke-direct {v3, v0, v1, v9, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lx60/b;->K:I

    invoke-direct {v4, v0, v1, v9, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v5, "network_error"

    invoke-direct/range {v2 .. v8}, Lg80/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lg80/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lg80/i;->i:Lg80/i;

    new-instance v0, Lg80/i;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lx60/b;->R:I

    invoke-direct {v2, v3, v1, v9, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v3, "password_attempts_exceeded"

    sget-object v4, Lg80/h;->ALERT_TILE:Lg80/h;

    invoke-direct {v0, v2, v1, v3, v4}, Lg80/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lg80/h;)V

    sput-object v0, Lg80/i;->j:Lg80/i;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lg80/h;)V
    .locals 1

    const-string v0, "loginErrorTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginErrorDescription"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg80/i;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Lg80/i;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lg80/i;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lg80/i;->d:Lg80/h;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lg80/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Lg80/h;->DIALOG:Lg80/h;

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lg80/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lg80/h;)V

    return-void
.end method

.method public static final synthetic a()Lg80/i;
    .locals 1

    sget-object v0, Lg80/i;->g:Lg80/i;

    return-object v0
.end method

.method public static final synthetic b()Lg80/i;
    .locals 1

    sget-object v0, Lg80/i;->h:Lg80/i;

    return-object v0
.end method

.method public static final synthetic c()Lg80/i;
    .locals 1

    sget-object v0, Lg80/i;->i:Lg80/i;

    return-object v0
.end method

.method public static final synthetic d()Lg80/i;
    .locals 1

    sget-object v0, Lg80/i;->j:Lg80/i;

    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg80/i;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg80/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lg80/i;

    iget-object v1, p0, Lg80/i;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lg80/i;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lg80/i;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lg80/i;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lg80/i;->c:Ljava/lang/String;

    iget-object v3, p1, Lg80/i;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lg80/i;->d:Lg80/h;

    iget-object p1, p1, Lg80/i;->d:Lg80/h;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lg80/h;
    .locals 1

    iget-object v0, p0, Lg80/i;->d:Lg80/h;

    return-object v0
.end method

.method public final g()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lg80/i;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final h()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lg80/i;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lg80/i;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lg80/i;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lg80/i;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lg80/i;->d:Lg80/h;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lg80/i;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lg80/i;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lg80/i;->c:Ljava/lang/String;

    iget-object v3, p0, Lg80/i;->d:Lg80/h;

    const-string v4, ", loginErrorDescription="

    const-string v5, ", analyticsName="

    const-string v6, "LoginErrorState(loginErrorTitle="

    invoke-static {v6, v0, v4, v1, v5}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", displayType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
