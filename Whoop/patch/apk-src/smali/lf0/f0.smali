.class public final Llf0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0019\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u0016\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "Llf0/f0;",
        "Lm91/u;",
        "",
        "title",
        "supertitle",
        "Lkd1/o;",
        "profileImage",
        "Lgz0/m0;",
        "badgeIcon",
        "signatureImage",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lgz0/m0;Lkd1/o;)V",
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
        "Ljava/lang/String;",
        "f",
        "b",
        "e",
        "c",
        "Lkd1/o;",
        "()Lkd1/o;",
        "d",
        "Lgz0/m0;",
        "()Lgz0/m0;",
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
.field public static final f:I


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lkd1/o;

.field private final d:Lgz0/m0;

.field private final e:Lkd1/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lkd1/o;->a:I

    sput v0, Llf0/f0;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lgz0/m0;Lkd1/o;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "profileImage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llf0/f0;->a:Ljava/lang/String;

    iput-object p2, p0, Llf0/f0;->b:Ljava/lang/String;

    iput-object p3, p0, Llf0/f0;->c:Lkd1/o;

    iput-object p4, p0, Llf0/f0;->d:Lgz0/m0;

    iput-object p5, p0, Llf0/f0;->e:Lkd1/o;

    return-void
.end method


# virtual methods
.method public final a()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Llf0/f0;->d:Lgz0/m0;

    return-object v0
.end method

.method public final b()Lkd1/o;
    .locals 1

    iget-object v0, p0, Llf0/f0;->c:Lkd1/o;

    return-object v0
.end method

.method public final c()Lkd1/o;
    .locals 1

    iget-object v0, p0, Llf0/f0;->e:Lkd1/o;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llf0/f0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llf0/f0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llf0/f0;

    iget-object v1, p0, Llf0/f0;->a:Ljava/lang/String;

    iget-object v3, p1, Llf0/f0;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llf0/f0;->b:Ljava/lang/String;

    iget-object v3, p1, Llf0/f0;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llf0/f0;->c:Lkd1/o;

    iget-object v3, p1, Llf0/f0;->c:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llf0/f0;->d:Lgz0/m0;

    iget-object v3, p1, Llf0/f0;->d:Lgz0/m0;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llf0/f0;->e:Lkd1/o;

    iget-object p1, p1, Llf0/f0;->e:Lkd1/o;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llf0/f0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llf0/f0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llf0/f0;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llf0/f0;->c:Lkd1/o;

    invoke-static {v2, v0, v1}, Lq63/c;->c(Lkd1/o;II)I

    move-result v0

    iget-object v2, p0, Llf0/f0;->d:Lgz0/m0;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Llf0/f0;->e:Lkd1/o;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Llf0/f0;->a:Ljava/lang/String;

    iget-object v1, p0, Llf0/f0;->b:Ljava/lang/String;

    iget-object v2, p0, Llf0/f0;->c:Lkd1/o;

    iget-object v3, p0, Llf0/f0;->d:Lgz0/m0;

    iget-object v4, p0, Llf0/f0;->e:Lkd1/o;

    const-string v5, ", supertitle="

    const-string v6, ", profileImage="

    const-string v7, "ClinicalReportCardHeaderState(title="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", badgeIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signatureImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
