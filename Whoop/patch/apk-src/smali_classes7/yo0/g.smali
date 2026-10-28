.class public final Lyo0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\"\u0004\u0008\t\u0010\nR+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0007\u001a\u0004\u0008\u000c\u0010\u0008\"\u0004\u0008\r\u0010\nR+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0007\u001a\u0004\u0008\u0010\u0010\u0008\"\u0004\u0008\u0011\u0010\nR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0007\u001a\u0004\u0008\u000f\u0010\u0008\"\u0004\u0008\u0013\u0010\nR+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0007\u001a\u0004\u0008\u0016\u0010\u0008\"\u0004\u0008\u0017\u0010\nR+\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0007\u001a\u0004\u0008\u0015\u0010\u0008\"\u0004\u0008\u0019\u0010\n\u00a8\u0006\u001b"
    }
    d2 = {
        "Lyo0/g;",
        "",
        "<init>",
        "()V",
        "Lh2/c;",
        "<set-?>",
        "a",
        "Lp1/c1;",
        "()Lh2/c;",
        "g",
        "(Lh2/c;)V",
        "betaTag",
        "b",
        "h",
        "historyIcon",
        "c",
        "d",
        "j",
        "inputBar",
        "i",
        "imageUpload",
        "e",
        "f",
        "l",
        "voiceToText",
        "k",
        "overlay",
        "coach-everywhere_release"
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
.field private final a:Lp1/c1;

.field private final b:Lp1/c1;

.field private final c:Lp1/c1;

.field private final d:Lp1/c1;

.field private final e:Lp1/c1;

.field private final f:Lp1/c1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh2/c;->e:Lh2/c;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lyo0/g;->a:Lp1/c1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lyo0/g;->b:Lp1/c1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lyo0/g;->c:Lp1/c1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lyo0/g;->d:Lp1/c1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lyo0/g;->e:Lp1/c1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lyo0/g;->f:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final a()Lh2/c;
    .locals 1

    iget-object v0, p0, Lyo0/g;->a:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/c;

    return-object v0
.end method

.method public final b()Lh2/c;
    .locals 1

    iget-object v0, p0, Lyo0/g;->b:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/c;

    return-object v0
.end method

.method public final c()Lh2/c;
    .locals 1

    iget-object v0, p0, Lyo0/g;->d:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/c;

    return-object v0
.end method

.method public final d()Lh2/c;
    .locals 1

    iget-object v0, p0, Lyo0/g;->c:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/c;

    return-object v0
.end method

.method public final e()Lh2/c;
    .locals 1

    iget-object v0, p0, Lyo0/g;->f:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/c;

    return-object v0
.end method

.method public final f()Lh2/c;
    .locals 1

    iget-object v0, p0, Lyo0/g;->e:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/c;

    return-object v0
.end method

.method public final g(Lh2/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyo0/g;->a:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Lh2/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyo0/g;->b:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Lh2/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyo0/g;->d:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final j(Lh2/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyo0/g;->c:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Lh2/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyo0/g;->f:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final l(Lh2/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyo0/g;->e:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
