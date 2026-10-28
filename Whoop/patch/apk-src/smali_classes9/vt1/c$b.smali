.class public final Lvt1/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvt1/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvt1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvt1/c$b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lvt1/c$b;",
        "Lvt1/c;",
        "Lsz0/p0;",
        "type",
        "Lcom/whoop/design/util/TextResource;",
        "supportText",
        "primaryButtonText",
        "secondaryButtonText",
        "<init>",
        "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V",
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
        "Lsz0/p0;",
        "f",
        "()Lsz0/p0;",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "e",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "d",
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


# static fields
.field public static final e:Lvt1/c$b$a;

.field public static final f:I

.field private static final g:Lvt1/c$b;

.field private static final h:Lvt1/c$b;


# instance fields
.field private final a:Lsz0/p0;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lvt1/c$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvt1/c$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvt1/c$b;->e:Lvt1/c$b$a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v1, Lsz0/p0;->d:I

    or-int/2addr v0, v1

    sput v0, Lvt1/c$b;->f:I

    new-instance v1, Lvt1/c$b;

    sget-object v2, Lsz0/p0$c;->e:Lsz0/p0$c;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lvt1/c$b;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lvt1/c$b;->g:Lvt1/c$b;

    new-instance v2, Lvt1/c$b;

    new-instance v3, Lsz0/p0$b;

    sget v0, Lrs1/f;->y:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lrs1/f;->k:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget v0, Lrs1/f;->d:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lvt1/c$b;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lvt1/c$b;->h:Lvt1/c$b;

    return-void
.end method

.method public constructor <init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButtonText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secondaryButtonText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvt1/c$b;->a:Lsz0/p0;

    .line 3
    iput-object p2, p0, Lvt1/c$b;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lvt1/c$b;->c:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p4, p0, Lvt1/c$b;->d:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public synthetic constructor <init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 6
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 7
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 8
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p4

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lvt1/c$b;-><init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-void
.end method

.method public static final synthetic a()Lvt1/c$b;
    .locals 1

    sget-object v0, Lvt1/c$b;->h:Lvt1/c$b;

    return-object v0
.end method

.method public static final synthetic b()Lvt1/c$b;
    .locals 1

    sget-object v0, Lvt1/c$b;->g:Lvt1/c$b;

    return-object v0
.end method


# virtual methods
.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lvt1/c$b;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lvt1/c$b;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lvt1/c$b;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvt1/c$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvt1/c$b;

    iget-object v1, p0, Lvt1/c$b;->a:Lsz0/p0;

    iget-object v3, p1, Lvt1/c$b;->a:Lsz0/p0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvt1/c$b;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lvt1/c$b;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lvt1/c$b;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lvt1/c$b;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lvt1/c$b;->d:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lvt1/c$b;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lsz0/p0;
    .locals 1

    iget-object v0, p0, Lvt1/c$b;->a:Lsz0/p0;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lvt1/c$b;->a:Lsz0/p0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lvt1/c$b;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lvt1/c$b;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lvt1/c$b;->d:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lvt1/c$b;->a:Lsz0/p0;

    iget-object v1, p0, Lvt1/c$b;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lvt1/c$b;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lvt1/c$b;->d:Lcom/whoop/design/util/TextResource;

    const-string v4, ", supportText="

    const-string v5, ", primaryButtonText="

    const-string v6, "LoadingAndError(type="

    invoke-static {v6, v0, v4, v1, v5}, Ld13/a;->n(Ljava/lang/String;Lsz0/p0;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", secondaryButtonText="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lte0/d;->n(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
